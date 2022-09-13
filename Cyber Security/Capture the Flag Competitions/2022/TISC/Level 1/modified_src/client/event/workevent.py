from random import random

from client import GameClient
from client.ui import screens
from core.models import Command

CREEPER_ENCOUNTER_CHANCE = 0 #.2


class WorkEvent:
    def __init__(self, client: GameClient) -> None:
        self.client = client

    def run(self):
        if random() <= CREEPER_ENCOUNTER_CHANCE:
            self.__die_to_creeper()
        self.__mine_safely()

    def __die_to_creeper(self):
        screens.display_creeper_screen()
        screens.display_game_over_screen()
        self.client.exit()

    def __mine_safely(self):
        #screens.display_working_screen()
        self.client.send_command(Command.WORK)
