from dataclasses import dataclass, field
from enum import Enum
from typing import List, Optional


class Command(Enum):
    ATTACK = "ATTACK"
    BATTLE = "BATTLE"
    VIEW_STATS = "VIEW_STATS"
    HEAL = "HEAL"
    BOSS_ATTACK = "BOSS_ATTACK"
    RUN = "RUN"
    VALIDATE = "VALIDATE"
    BUY_SWORD = "BUY_SWORD"
    BUY_POTION = "BUY_POTION"
    BACK = "BACK"
    WORK = "WORK"
    EXIT = "EXIT"


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

    @property
    def latest(self) -> Optional[Command]:
        try:
            return self.commands[-1]
        except IndexError:
            return None
