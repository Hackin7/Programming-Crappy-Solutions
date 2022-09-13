import json
import sys
from dataclasses import dataclass, field
from typing import List, Optional

from core.config import BOSS_DATA_FILE
from core.models.boss import Boss
from core.models.player import Player


@dataclass
class Game:
    bosses: List[Boss]
    player: Player = field(default_factory=Player)

    @property
    def next_boss(self) -> Optional[Boss]:
        try:
            return self.bosses[0]
        except IndexError:
            return None

    @classmethod
    def create(cls) -> "Game":
        bosses = Game.__load_bosses(BOSS_DATA_FILE)

        if len(bosses) == 0:
            sys.exit(-1)

        return cls(bosses=bosses)

    def remove_next_boss(self):
        self.bosses = self.bosses[1:]

    @staticmethod
    def __load_bosses(filename: str) -> List[Boss]:
        with open(filename, "r") as f:
            return [
                Boss(**boss_data, max_hp=boss_data["hp"])
                for boss_data in json.load(f)
            ]
