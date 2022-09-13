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
