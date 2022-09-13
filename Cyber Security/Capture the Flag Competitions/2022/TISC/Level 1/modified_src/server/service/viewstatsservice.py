from __future__ import annotations

from typing import TYPE_CHECKING

if TYPE_CHECKING:
    from server import GameServer


class ViewStatsService:
    def __init__(self, server: GameServer):
        self.server = server

    def run(self):
        self.server.send_entity(self.server.game.player)
