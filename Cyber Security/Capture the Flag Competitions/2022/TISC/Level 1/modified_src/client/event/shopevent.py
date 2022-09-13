from typing import Optional

from client import GameClient
from client.error import Error
from client.ui import screens
from core.models import Command, Result


class ShopEvent:
    def __init__(self, client: GameClient) -> None:
        self.client = client

    def run(self):
        while True:
            self.__display()
            match self.__get_shop_command():
                case (Command.BUY_SWORD | Command.BUY_POTION) as command:
                    self.__purchase_item(command)
                case Command.BACK:
                    break
                case _:
                    continue

    def __display(self):
        screens.display_shop_screen(game=self.client)

    def __get_shop_command(self) -> Optional[Command]:
        match input():
            case "1":
                return Command.BUY_SWORD
            case "2":
                return Command.BUY_POTION
            case "3":
                return Command.BACK

        return None

    def __purchase_item(self, command):
        match self.__attempt_purchase(command):
            case Result.PURCHASE_OK | Result.CANNOT_AFFORD:
                pass
            case _:
                screens.display_error(Error.RECEIVED_MALFORMED_RESULT)
                self.client.exit(1)

    def __attempt_purchase(self, command) -> Optional[Result]:
        self.client.send_command(command)
        match self.client.fetch_result():
            case (Result.PURCHASE_OK | Result.CANNOT_AFFORD) as result:
                return result
            case _:
                return None
