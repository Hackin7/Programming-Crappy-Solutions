import sys

import click
from nclib.errors import NetcatError  # type: ignore

from client import GameClient
from client.error import Error
from client.event import BattleEvent, ShopEvent, WorkEvent
from client.ui import screens


@click.command()
@click.option(
    "--host", type=str, help="Hostname/IP of game server", required=True
)
@click.option(
    "--port", type=int, help="Port number of game server", required=True
)
def run(host: str, port: int):
    try:
        client = GameClient.create(host, port)
    except NetcatError:
        screens.display_error(Error.CANNOT_CONNECT_TO_SERVER)
        sys.exit(1)

    while True:
        screens.display_main_menu_screen(client)
        match input():
            case "1":
                client.run_event(BattleEvent(client=client))
            case "2":
                client.run_event(WorkEvent(client=client))
            case "3":
                client.run_event(ShopEvent(client=client))
            case "4":
                client.exit()
            case _:
                continue


if __name__ == "__main__":
    run()
