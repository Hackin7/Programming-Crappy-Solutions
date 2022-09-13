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
