from __future__ import annotations

import sys
from dataclasses import dataclass
from typing import TYPE_CHECKING, Optional, TypeAlias, Union

from core import Game
from core.models import Boss, Command, Player, Result
from server.networking import NetClient

if TYPE_CHECKING:
    from server.service import (
        BattleService,
        BuyPotionService,
        BuySwordService,
        ViewStatsService,
        WorkService,
    )

Service: TypeAlias = Union[
    "BattleService",
    "BuySwordService",
    "BuyPotionService",
    "WorkService",
    "ViewStatsService",
]


@dataclass
class GameServer:
    connection: NetClient
    game: Game

    @classmethod
    def create(cls) -> "GameServer":
        return cls(connection=NetClient(), game=Game.create())

    def send_command(self, command: Command):
        self.__send(command.value)

    def recv_command(self) -> Optional[Command]:
        try:
            return Command(self.__recv())
        except ValueError:
            return None

    def run(self, service: Service):
        service.run()

    def send_flag(self):
        with open("/flag.txt", "r") as f:
            self.__send(f.read())

    def send_result(self, result: Result):
        self.__send(result.value)

    def send_entity(self, entity: Boss | Player):
        self.__send(entity.to_json())

    def recv_command_str(self) -> str:
        return self.__recv()

    def exit(self, code: int = 0):
        sys.exit(code)

    def __recv(self) -> str:
        return self.connection.recv()

    def __send(self, data: str):
        self.connection.send(data)
