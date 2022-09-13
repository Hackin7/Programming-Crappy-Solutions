from __future__ import annotations

from typing import TYPE_CHECKING

from core.config import POTION_PRICE
from core.models import Result

if TYPE_CHECKING:
    from server import GameServer


class BuyPotionService:
    def __init__(self, server: GameServer):
        self.server = server

    def run(self):
        if self.__can_afford_potion():
            self.__purchase_potion()
            self.server.send_result(Result.PURCHASE_OK)
            return
        self.server.send_result(Result.CANNOT_AFFORD)

    def __purchase_potion(self):
        self.server.game.player.gold -= POTION_PRICE
        self.server.game.player.potion += 1

    def __can_afford_potion(self):
        return self.server.game.player.gold >= POTION_PRICE
