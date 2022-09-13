from __future__ import annotations

import json
from dataclasses import dataclass
from typing import TYPE_CHECKING

if TYPE_CHECKING:
    from core.models.player import Player


@dataclass
class Boss:
    name: str
    hp: int
    max_hp: int
    attack: int

    @property
    def is_alive(self) -> bool:
        return self.hp > 0

    @property
    def is_dead(self) -> bool:
        return not self.is_alive

    @property
    def lost_hp(self) -> int:
        return self.max_hp - self.hp

    def receive_attack_from(self, attacker: "Player"):
        self.hp -= attacker.attack

    def to_json(self) -> str:
        return json.dumps(self.__dict__)

    @classmethod
    def from_json(cls, data: str) -> "Boss":
        return cls(**json.loads(data))

    def __str__(self) -> str:
        return (
            f"{self.name}\nHP: {self.hp}/{self.max_hp}\nATTACK: {self.attack}"
        )
