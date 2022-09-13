from __future__ import annotations

import sys
from dataclasses import dataclass
from typing import TYPE_CHECKING, Optional, TypeAlias, Union

from client.networking import NetClient
from core.models import Boss, Command, Player, Result

if TYPE_CHECKING:
    from client.event import BattleEvent, ShopEvent, WorkEvent

Event: TypeAlias = Union[
    "BattleEvent",
    "ShopEvent",
    "WorkEvent",
]


@dataclass
class GameClient:
    connection: NetClient

    @classmethod
    def create(cls, host: str, port: int) -> "GameClient":
        return cls(NetClient(host, port))

    @property
    def player(self) -> Player:
        return self.fetch_player()

    def run_event(self, event: Event):
        event.run()
        return

    def send_command(self, command: Command):
        self.__send(command.value)

    def fetch_result(self) -> Optional[Result]:
        return Result(self.__recv())

    def fetch_flag(self) -> str:
        return self.__recv()

    def fetch_player(self) -> Player:
        self.send_command(Command.VIEW_STATS)
        return Player.from_json(self.__recv())

    def fetch_next_boss(self) -> Boss:
        self.send_command(Command.BATTLE)
        return Boss.from_json(self.__recv())

    def exit(self, code: int = 0):
        self.connection.close()
        sys.exit(code)

    def __send(self, data: str) -> int:
        return self.connection.send(data)

    def __recv(self) -> str:
        return self.connection.recv()
