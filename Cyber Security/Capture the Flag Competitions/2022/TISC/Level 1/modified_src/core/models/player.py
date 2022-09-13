from __future__ import annotations

import json
from dataclasses import dataclass
from typing import TYPE_CHECKING

if TYPE_CHECKING:
    from core.models.boss import Boss

from core.config import BASE_ATTACK, POTION_POTENCY, SWORD_ATTACK_BONUS


@dataclass
class Player:
    hp: int = 10
    max_hp: int = 10
    gold: int = 0
    sword: int = 0
    potion: int = 0

    @property
    def attack(self) -> int:
        return BASE_ATTACK + self.__compute_bonus_attack()

    @property
    def is_alive(self) -> bool:
        return self.hp > 0

    @property
    def is_dead(self) -> bool:
        return not self.is_alive

    @property
    def lost_hp(self) -> int:
        return self.max_hp - self.hp

    def receive_attack_from(self, attacker: "Boss"):
        self.hp -= attacker.attack

    def use_potion(self):
        if not self.__has_potion():
            return
        self.potion -= 1
        self.hp = min(self.hp + POTION_POTENCY, self.max_hp)

    @classmethod
    def from_json(cls, data: str) -> "Player":
        return cls(**json.loads(data))

    def to_json(self) -> str:
        return json.dumps(self.__dict__)

    def __compute_bonus_attack(self) -> int:
        if not self.__has_sword():
            return 0
        return SWORD_ATTACK_BONUS

    def __has_sword(self) -> bool:
        return self.sword > 0

    def __has_potion(self) -> bool:
        return self.potion > 0

    def __str__(self):
        return (
            f"HP:{self.hp}/{self.max_hp}\n"
            + f"ATTACK:{self.attack}\n"
            + f"GOLD:{self.gold}\n"
            + f"POTIONS:{self.potion}"
        )
