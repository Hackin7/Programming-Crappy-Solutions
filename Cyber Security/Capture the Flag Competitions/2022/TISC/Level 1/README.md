# Level 1

![](Pasted%20image%2020220826223750.png)
![](Pasted%20image%2020220826223803.png)

## Solution

Firstly, source code is given, so I started reading it.

It includes both the client and server code

```bash
(base) [hacker@hackerbook src]$ ls
Dockerfile  PLEASE_READ.txt  client  core  docker-compose.yml  flag.txt  main.py  poetry.lock  pyproject.toml  requirements.txt  run_server.py  server
(base) [hacker@hackerbook src]$
```

From the looks of the Dockerfile, there's a flag file on the server

```Dockerfile
COPY --from=builder /venv /venv
COPY flag.txt /
COPY . /app

RUN rm /app/flag.txt

RUN adduser -u 5678 --disabled-password --gecos "" appuser && chown -R appuser /app

RUN chown root:appuser /flag.txt
RUN chmod 440 /flag.txt

...

```

### Basic Analysis

#### Server Code

The main server code is in `run_server.py`. It imports several libraries from the `server` folder

```python
from typing import Optional

from core.models import Command
from server import GameServer
from server.service import (
    BattleService,
    BuyPotionService,
    BuySwordService,
    ViewStatsService,
    WorkService,
)

server = GameServer.create()


def execute(command: Optional[Command]):
    match command:
        case Command.BATTLE:
            server.run(BattleService(server=server))
        case Command.VIEW_STATS:
            server.run(ViewStatsService(server=server))
        case Command.WORK:
            server.run(WorkService(server=server))
        case Command.BUY_SWORD:
            server.run(BuySwordService(server=server))
        case Command.BUY_POTION:
            server.run(BuyPotionService(server=server))
        case Command.EXIT:
            server.exit()


while True:
    execute(server.recv_command())
```

Looking at the files in the server folder, we can see where they read the file in `server/gameserver.py`

```python
@dataclass
class GameServer:
    connection: NetClient
    game: Game

	...

    def recv_command(self) -> Optional[Command]:
        try:
            return Command(self.__recv())
        except ValueError:
            return None
	
	...

    def send_flag(self):
        with open("/flag.txt", "r") as f:
            self.__send(f.read())

```

I tried to look through all the files for where the `send_flag` function is called (by searching for `send_flag`)

```bash
(base) [hacker@hackerbook src]$ grep -rnw ./ -e 'send_flag'
./server/service/battleservice.py:55:        self.server.send_flag()
./server/gameserver.py:50:    def send_flag(self):
(base) [hacker@hackerbook src]$ 
```

In `server/service/battleservice.py`, is the battle code. The flag is called when the battle is won **and when there is no next boss**. 

```python
from __future__ import annotations

from typing import TYPE_CHECKING, Optional

from core.models import Command, CommandHistorian, Result

if TYPE_CHECKING:
    from server import GameServer


class BattleService:

...

    def run(self):
        self.__send_next_boss()

        while True:
            self.history.log_commands_from_str(self.server.recv_command_str())

            match self.history.latest:
                case Command.ATTACK | Command.HEAL:
                    self.history.log_command(Command.BOSS_ATTACK)
                case Command.VALIDATE:
                    break
                case Command.RUN:
                    return
                case _:
                    self.server.exit(1)

        match self.__compute_battle_outcome():
            case Result.PLAYER_WIN_BATTLE:
                self.__handle_battle_win()
                return
            case Result.BOSS_WIN_BATTLE:
                self.server.exit()
            case _:
                self.server.exit(1)

    def __handle_battle_win(self):
        self.server.game.remove_next_boss()
        if self.__boss_available_for_next_battle():
            self.server.send_result(Result.VALIDATED_OK)
            return
        self.server.send_result(Result.OBTAINED_FLAG)
        self.server.send_flag()
        self.server.exit()

    def __boss_available_for_next_battle(self) -> bool:
        return not (self.server.game.next_boss is None)

...
```

Hmm there's some unexpected code 

#### Core Code

I first read `core/game.py` to know more about the class `Game`. It suggests that there are a list of bosses from a json file. Most likely the list on the server is hidden

```python
import json
import sys
from dataclasses import dataclass, field
from typing import List, Optional

from core.config import BOSS_DATA_FILE
from core.models.boss import Boss
from core.models.player import Player


@dataclass
class Game:
    bosses: List[Boss]
    player: Player = field(default_factory=Player)

    @property
    def next_boss(self) -> Optional[Boss]:
        try:
            return self.bosses[0]
        except IndexError:
            return None

    @classmethod
    def create(cls) -> "Game":
        bosses = Game.__load_bosses(BOSS_DATA_FILE)

        if len(bosses) == 0:
            sys.exit(-1)

        return cls(bosses=bosses)

    def remove_next_boss(self):
        self.bosses = self.bosses[1:]

    @staticmethod
    def __load_bosses(filename: str) -> List[Boss]:
        with open(filename, "r") as f:
            return [
                Boss(**boss_data, max_hp=boss_data["hp"])
                for boss_data in json.load(f)
            ]
```

I also looked at the player code, one interesting thing is that 
1. More swords are basically useless, as they will still deal 2 damage

```python
from __future__ import annotations

import json
from dataclasses import dataclass
from typing import TYPE_CHECKING

if TYPE_CHECKING:
    from core.models.boss import Boss

from core.config import BASE_ATTACK, POTION_POTENCY, SWORD_ATTACK_BONUS


@dataclass
class Player:
    hp: int = 10
    max_hp: int = 10
    gold: int = 0
    sword: int = 0
    potion: int = 0

    @property
    def attack(self) -> int:
        return BASE_ATTACK + self.__compute_bonus_attack()

    @property
    def is_alive(self) -> bool:
        return self.hp > 0

    @property
    def is_dead(self) -> bool:
        return not self.is_alive

    @property
    def lost_hp(self) -> int:
        return self.max_hp - self.hp

    def receive_attack_from(self, attacker: "Boss"):
        self.hp -= attacker.attack

    def use_potion(self):
        if not self.__has_potion():
            return
        self.potion -= 1
        self.hp = min(self.hp + POTION_POTENCY, self.max_hp)

    @classmethod
    def from_json(cls, data: str) -> "Player":
        return cls(**json.loads(data))

    def to_json(self) -> str:
        return json.dumps(self.__dict__)

    def __compute_bonus_attack(self) -> int:
        if not self.__has_sword():
            return 0
        return SWORD_ATTACK_BONUS

    def __has_sword(self) -> bool:
        return self.sword > 0

    def __has_potion(self) -> bool:
        return self.potion > 0

    def __str__(self):
        return (
            f"HP:{self.hp}/{self.max_hp}\n"
            + f"ATTACK:{self.attack}\n"
            + f"GOLD:{self.gold}\n"
            + f"POTIONS:{self.potion}"
        )
```

#### Client Code

I tried looking at the client code, which is kinda weird. I ended up stumbling on `src/client/event/battleevent.py` I wanted to find if there's anything client side that doesn't sync with server side. Maybe we could exploit that.

From the looks of it the client side initialises everything separately from the server. It uses new models, and does not always update from the server.

```python
from typing import Optional

from client import GameClient
from client.error import Error
from client.ui import screens
from core.models import Boss, Command, Result


class BattleEvent:
    def __init__(self, client: GameClient) -> None:
        self.client = client
        self.player = client.player

    def run(self):
        self.boss: Boss = self.client.fetch_next_boss()

        while True:
            self.__display()

            match self.__get_battle_command():
                case Command.ATTACK:
                    self.__attack_boss()
                    if self.boss.is_dead:
                        break
                case Command.HEAL:
                    self.__use_potion()
                case Command.RUN:
                    self.client.send_command(Command.RUN)
                    return
                case _:
                    continue

            self.player.receive_attack_from(self.boss)
            if self.player.is_dead:
                break

        self.client.send_command(Command.VALIDATE)

        if self.player.is_dead:
            self.__handle_death()

        match self.client.fetch_result():
            case Result.VALIDATED_OK:
                screens.display_boss_slain_screen()
                return
            case Result.OBTAINED_FLAG:
                screens.display_flag_screen(self.client.fetch_flag())
                self.client.exit()
            case _:
                screens.display_error(Error.RECEIVED_MALFORMED_RESULT)
                self.client.exit(1)

    def __use_potion(self):
        self.client.send_command(Command.HEAL)
        self.player.use_potion()

    def __attack_boss(self):
        self.client.send_command(Command.ATTACK)
        self.boss.receive_attack_from(self.player)

    def __handle_death(self):
        screens.display_game_over_screen()
        self.client.exit()

    def __display(self):
        screens.display_battle_screen(player=self.player, boss=self.boss)

    def __get_battle_command(self) -> Optional[Command]:
        match input():
            case "1":
                return Command.ATTACK
            case "2":
                return Command.HEAL
            case "3":
                return Command.RUN
            case _:
                return None
```



### Discrepancy Found between Client & Server Events

#### Battle 

There are generally no discrepancies, as shown in the codes above.

Generally after an attack command, the server will register an extra boss attack command on their side too.

```python
    def run(self):
        self.__send_next_boss()

        while True:
            self.history.log_commands_from_str(self.server.recv_command_str())

            match self.history.latest:
                case Command.ATTACK | Command.HEAL:
                    self.history.log_command(Command.BOSS_ATTACK)
                case Command.VALIDATE:
                    break
                case Command.RUN:
                    return
                case _:
                    self.server.exit(1)
```

#### Shop

The client side code `client/event/shopevent.py` only handles sending the commands, and does not update the local player model.

The server side codes `server/event/buyswordservice.py` and `server/event/buypotionservice.py` generally handle the main validation, which only checks if the player has enough gold to buy.



#### Unlimited Gold Exploit

After some digging, and checking each of the potential events, I found out discrepancies between the work service.

The Server code does not do any validation in `server/event/workservice.py`

```python
from __future__ import annotations

from typing import TYPE_CHECKING

from core.config import WORK_SALARY

if TYPE_CHECKING:
    from server import GameServer


class WorkService:
    def __init__(self, server: GameServer):
        self.server = server

    def run(self):
        self.server.game.player.gold += WORK_SALARY
```

The Client code does validation in `client/event/workevent.py`. 

```python
from random import random

from client import GameClient
from client.ui import screens
from core.models import Command

CREEPER_ENCOUNTER_CHANCE = 0.2


class WorkEvent:
    def __init__(self, client: GameClient) -> None:
        self.client = client

    def run(self):
        if random() <= CREEPER_ENCOUNTER_CHANCE:
            self.__die_to_creeper()
        self.__mine_safely()

    def __die_to_creeper(self):
        screens.display_creeper_screen()
        screens.display_game_over_screen()
        self.client.exit()

    def __mine_safely(self):
        screens.display_working_screen()
        self.client.send_command(Command.WORK)
```

Since the client side is something we can control, I reduced the `CREEPER_ENCOUNTER_CHANCE` to 0. This allows us to get infinite gold. I also removed the display working screen because I can.

My modified code is here

```python
from random import random

from client import GameClient
from client.ui import screens
from core.models import Command

CREEPER_ENCOUNTER_CHANCE = 0 #.2


class WorkEvent:
    def __init__(self, client: GameClient) -> None:
        self.client = client

    def run(self):
        if random() <= CREEPER_ENCOUNTER_CHANCE:
            self.__die_to_creeper()
        self.__mine_safely()

    def __die_to_creeper(self):
        screens.display_creeper_screen()
        screens.display_game_over_screen()
        self.client.exit()

    def __mine_safely(self):
        #screens.display_working_screen()
        self.client.send_command(Command.WORK)
```

#### Running the Client Code

Unlimited gold exploit can be used to increase number of potions, but not number of swords

![](Pasted%20image%2020220826233526.png)

Among the bosses is one with attack 50, which instant kills

![](Pasted%20image%2020220826233030.png)


### Another Exploit - Command Interpretation

When checking for the battle events, as I want to bypass the attack power restriction,  I noticed the client side code parsed the commands weirdly. Why `commands` instead of `command`

```python
    def run(self):
        self.__send_next_boss()

        while True:
            self.history.log_commands_from_str(self.server.recv_command_str()) # Should be log_command_from_str

            match self.history.latest:
                case Command.ATTACK | Command.HEAL:
                    self.history.log_command(Command.BOSS_ATTACK)
                case Command.VALIDATE:
                    break
                case Command.RUN:
                    return
                case _:
                    self.server.exit(1)

```

If you check the CommandHistorian class used from `core/models/command.py`, you notice that the function used, `log_commands_from_str` to parse the commands actually can parse more than 1 command at once

```python
@dataclass
class CommandHistorian:
    commands: List[Command] = field(default_factory=list)

    def log_command(self, command: Command):
        self.commands.append(command)

    def log_commands(self, commands: List[Command]):
        self.commands.extend(commands)

    def log_command_from_str(self, command_str: str):
        self.log_command(Command(command_str))

    def log_commands_from_str(self, commands_str: str):
        self.log_commands(
            [Command(command_str) for command_str in commands_str.split()]
        )

	...
```

I modified the function in `battleevent.py` to send more than 1 command

```python
    def __attack_boss(self):
        #self.client.send_command(Command.ATTACK)
        value = " ".join(["ATTACK" for i in range(500)])
        self.client._GameClient__send(value)
        for i in range(500):self.boss.receive_attack_from(self.player)

```

Just run `python3 main.py --host chal00bq3ouweqtzva9xcobep6spl5m75fucey.ctf.sg --port 18261`, keep attacking the bosses, and you should get the flag

![](Pasted%20image%2020220827004657.png)

## Flag

`TISC{L3T5_M33T_4G41N_1N_500_Y34R5_96eef57b46a6db572c08eef5f1924bc3}`