def get_main_menu() -> str:
    return (
        "   [red]1. [yellow]FIGHT BOSS\n"
        + "   [red]2. [yellow]MINE GOLD\n"
        + "   [red]3. [yellow]GO SHOPPING\n"
        + "   [red]4. [yellow]EXIT"
    )


def get_battle_menu() -> str:
    return (
        "   [red]1. [yellow]ATTACK\n"
        + "   [red]2. [yellow]HEAL\n"
        + "   [red]3. [yellow]RUN"
    )


def get_shop_menu() -> str:
    return (
        "   [red]1. [yellow]SWORD, +2 ATTACK, MAX 1 [blue](5 GOLD)\n"
        + "   [red]2. [yellow]POTION, +10 HP, UNLIMITED [blue](1 GOLD)\n"
        + "   [red]3. [yellow]BACK"
    )
