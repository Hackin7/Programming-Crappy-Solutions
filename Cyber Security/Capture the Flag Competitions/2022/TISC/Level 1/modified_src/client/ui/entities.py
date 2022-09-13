# flake8: noqa

from __future__ import annotations

from typing import TYPE_CHECKING

from . import boxes

if TYPE_CHECKING:
    from core.models.boss import Boss
    from core.models.player import Player


def get_player(player: "Player") -> str:
    return (
        "  "
        + boxes.get_box_title_line("PLAYER")
        + "\n"
        + "  "
        + boxes.get_box_blank_line()
        + "\n"
        + "  "
        + boxes.get_box_hp_top_line(
            hp=player.hp, lost_hp=player.lost_hp, max_hp=player.max_hp
        )
        + "\n"
        + "  "
        + boxes.get_box_hp_bottom_line(hp=player.hp, max_hp=player.max_hp)
        + "\n"
        + "  "
        + boxes.get_box_blank_line()
        + "\n"
        + "  "
        + boxes.get_box_stat_line(stat="ATTACK", stat_value=player.attack)
        + "\n"
        + "  "
        + boxes.get_box_stat_line(stat="GOLD", stat_value=player.gold)
        + "\n"
        + "  "
        + boxes.get_box_stat_line(stat="POTIONS", stat_value=player.potion)
        + "\n"
        + "  "
        + boxes.get_box_blank_line()
        + "\n"
        + "  "
        + boxes.get_box_bottom_line()
    )


def get_battle(player: "Player", boss: "Boss") -> str:
    return (
        "  "
        + f"{boxes.get_box_title_line('PLAYER')}  {boxes.get_box_title_line(boss.name.upper())}"
        + "\n"
        + "  "
        + f"{boxes.get_box_blank_line()}  {boxes.get_box_blank_line()}"
        + "\n"
        + "  "
        + boxes.get_box_hp_top_line(
            hp=player.hp, lost_hp=player.lost_hp, max_hp=player.max_hp
        )
        + "  "
        + boxes.get_box_hp_top_line(
            hp=boss.hp, lost_hp=boss.lost_hp, max_hp=boss.max_hp
        )
        + "\n"
        + "  "
        + boxes.get_box_hp_bottom_line(hp=player.hp, max_hp=player.max_hp)
        + "  "
        + boxes.get_box_hp_bottom_line(hp=boss.hp, max_hp=boss.max_hp)
        + "\n"
        + "  "
        + f"{boxes.get_box_blank_line()}  {boxes.get_box_blank_line()}"
        + "\n"
        + "  "
        + boxes.get_box_stat_line(stat="ATTACK", stat_value=player.attack)
        + "  "
        + boxes.get_box_stat_line(stat="ATTACK", stat_value=boss.attack)
        + "\n"
        + "  "
        + boxes.get_box_stat_line(stat="GOLD", stat_value=player.gold)
        + "  "
        + boxes.get_box_blank_line()
        + "\n"
        + "  "
        + boxes.get_box_stat_line(stat="POTIONS", stat_value=player.potion)
        + "  "
        + boxes.get_box_blank_line()
        + "\n"
        + "  "
        + f"{boxes.get_box_blank_line()}  {boxes.get_box_blank_line()}"
        + "\n"
        + "  "
        + f"{boxes.get_box_bottom_line()}  {boxes.get_box_bottom_line()}"
    )


def get_creeper() -> str:
    return (
        f"[green]{'██████████████████████████████████████████': ^80}\n"
        + f"[green]{'██████████████████████████████████████████': ^80}\n"
        + f"[green]{'██████████████████████████████████████████': ^80}\n"
        + f"[green]{'█████           ██████████           █████': ^80}\n"
        + f"[green]{'█████           ██████████           █████': ^80}\n"
        + f"[green]{'█████           ██████████           █████': ^80}\n"
        + f"[green]{'█████           ██████████           █████': ^80}\n"
        + f"[green]{'████████████████          ████████████████': ^80}\n"
        + f"[green]{'█████████████                █████████████': ^80}\n"
        + f"[green]{'█████████████                █████████████': ^80}\n"
        + f"[green]{'█████████████                █████████████': ^80}\n"
        + f"[green]{'█████████████   ██████████   █████████████': ^80}\n"
        + f"[green]{'█████████████   ██████████   █████████████': ^80}\n"
        + f"[green]{'██████████████████████████████████████████': ^80}\n"
        + f"[green]{'██████████████████████████████████████████': ^80}"
    )
