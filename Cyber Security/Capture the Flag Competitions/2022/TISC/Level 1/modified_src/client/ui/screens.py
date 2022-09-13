from __future__ import annotations

from time import sleep
from typing import TYPE_CHECKING

from pytermgui import tim

from .banners import get_boss_slain, get_title, get_you_died
from .entities import get_battle, get_creeper, get_player
from .menus import get_battle_menu, get_main_menu, get_shop_menu
from .utility import clear_screen

if TYPE_CHECKING:
    from client.error import Error
    from client.gameclient import GameClient
    from core.models.boss import Boss
    from core.models.player import Player


def display_shop_screen(game: GameClient):
    clear_screen()
    tim.print(get_title())
    print("")
    tim.print(get_player(game.player))
    print("")
    tim.print(get_shop_menu())
    print("")
    __prompt()


def display_battle_screen(player: Player, boss: Boss):
    clear_screen()
    tim.print(get_title())
    print("")
    tim.print(get_battle(player=player, boss=boss))
    print("")
    tim.print(get_battle_menu())
    print("")
    __prompt()


def display_main_menu_screen(game: GameClient):
    clear_screen()
    tim.print(get_title())
    print("")
    tim.print(get_player(game.player))
    print("")
    tim.print(get_main_menu())
    print("")
    __prompt()


def display_boss_slain_screen():
    clear_screen()
    print("\n\n\n\n\n\n\n")
    tim.print(get_boss_slain())
    print("\n\n\n\n\n\n\n")
    sleep(2)


def print_flag(flag: str):
    tim.print(f"[!gradient(42) bold]{flag: ^80}")


def display_flag_screen(flag: str):
    clear_screen()
    print("\n\n\n\n\n")
    tim.print(get_boss_slain())
    print("\n")
    print(f"{'Thank you for playing, here is your flag:': ^80}\n")
    print_flag(flag)
    print("\n\n\n\n")
    sleep(2)


def display_game_over_screen():
    clear_screen()
    print("\n\n\n\n\n\n\n")
    tim.print(get_you_died())
    print("\n\n\n\n\n\n\n")


def display_working_screen():
    clear_screen()
    print("\n\n\n\n\n\n")
    print(f"{'so we back in the mine...': ^80}")
    sleep(1)
    print(f"{'got our pickaxe swinging from,': ^80}")
    sleep(1)
    print(f"{'side to side...': ^80}")
    sleep(1)
    print(f"{'side, side to side.': ^80}")
    sleep(2)


def display_creeper_screen():
    clear_screen()
    print("\n")
    tim.print(get_creeper())
    sleep(2)
    print("")
    print(f"{'Creeper?': ^80}")
    sleep(2)
    print(f"{'Ohh man...': ^80}")
    sleep(2)


def display_error(error: Error):
    tim.print(f"[[red]ERROR[/]]: {error.value}")


def __prompt():
    tim.print("   [green blink]❯❯❯ ", end="")
