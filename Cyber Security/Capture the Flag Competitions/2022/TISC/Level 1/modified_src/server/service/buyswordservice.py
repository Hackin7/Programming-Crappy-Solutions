from __future__ import annotations

from typing import TYPE_CHECKING

from core.config import SWORD_PRICE
from core.models import Result

if TYPE_CHECKING:
    from server import GameServer


class BuySwordService:
    def __init__(self, server: GameServer):
        self.server = server

    def run(self):
        if self.__can_afford_sword():
            self.__purchase_sword()
            self.server.send_result(Result.PURCHASE_OK)
            return
        self.server.send_result(Result.CANNOT_AFFORD)

    def __purchase_sword(self):
        self.server.game.player.gold -= SWORD_PRICE
        self.server.game.player.sword += 1

    def __can_afford_sword(self):
        return self.server.game.player.gold >= SWORD_PRICE
