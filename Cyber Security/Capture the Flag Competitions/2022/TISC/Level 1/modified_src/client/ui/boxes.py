from math import ceil

BOX_TL = "╭"
BOX_TR = "╮"
BOX_BL = "╰"
BOX_BR = "╯"
BOX_HORIZONTAL_BORDER = "─"
BOX_VERTICAL_BORDER = "│"

HP_BAR_L = "░"
HP_BAR_S = "█"


def get_box_title_line(content: str, content_width: int = 36) -> str:
    return (
        f"[blue]{BOX_TL}{BOX_HORIZONTAL_BORDER}[/]"
        + f"[magenta] {content:6} [/]"
        + f"[blue]{BOX_HORIZONTAL_BORDER * (content_width - 9)}[/]"
        + f"[blue]{BOX_TR}[/]"
    )


def get_box_blank_line(content_width: int = 36) -> str:
    return (
        f"[blue]{BOX_VERTICAL_BORDER}{' ' * content_width}"
        + f"{BOX_VERTICAL_BORDER}[/]"
    )


def get_box_bottom_line(content_width: int = 36) -> str:
    return f"[blue]{BOX_BL}{BOX_HORIZONTAL_BORDER * content_width}{BOX_BR}[/]"


def get_box_stat_line(
    stat: str, stat_value: int, content_width: int = 36
) -> str:
    return (
        f"[blue]{BOX_VERTICAL_BORDER}[/]      "
        + f"[yellow]{stat:7}[/] : {stat_value:3}"
        + f"{' ' * (content_width - 19)}"
        + f"[blue]{BOX_VERTICAL_BORDER}[/]"
    )


def get_box_hp_top_line(hp: int, lost_hp: int, max_hp: int) -> str:
    return (
        f"[blue]{BOX_VERTICAL_BORDER}[/]      "
        + "[yellow]HP[/]: "
        + f"[green]{HP_BAR_S * ceil(hp/max_hp * 10) * 2}"
        + f"{HP_BAR_L * int(lost_hp/max_hp * 10) * 2}[/]      "
        + f"[blue]{BOX_VERTICAL_BORDER}[/]"
    )


def get_box_hp_bottom_line(hp: int, max_hp: int) -> str:
    return (
        f"[blue]{BOX_VERTICAL_BORDER}[/]"
        + f"{' ' * 23}"
        + f"{hp:3}/{max_hp:3}      "
        + f"[blue]{BOX_VERTICAL_BORDER}[/]"
    )
