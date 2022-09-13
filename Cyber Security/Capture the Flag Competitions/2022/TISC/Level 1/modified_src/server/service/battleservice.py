from __future__ import annotations

from typing import TYPE_CHECKING, Optional

from core.models import Command, CommandHistorian, Result

if TYPE_CHECKING:
    from server import GameServer


class BattleService:
    def __init__(self, server: GameServer):
        if server.game.next_boss is None:
            server.exit(1)
        else:
            self.boss = server.game.next_boss
            self.server = server
            self.player = server.game.player
            self.history = CommandHistorian()

    def __send_next_boss(self):
        self.server.send_entity(self.boss)

    def run(self):
        self.__send_next_boss()

        while True:
            self.history.log_commands_from_str(self.server.recv_command_str()) # Should be log_command_from_str

            match self.history.latest:
                case Command.ATTACK | Command.HEAL:
                    self.history.log_command(Command.BOSS_ATTACK)
                case Command.VALIDATE:
                    break
                case Command.RUN:
                    return
                case _:
                    self.server.exit(1)

        match self.__compute_battle_outcome():
            case Result.PLAYER_WIN_BATTLE:
                self.__handle_battle_win()
                return
            case Result.BOSS_WIN_BATTLE:
                self.server.exit()
            case _:
                self.server.exit(1)

    def __handle_battle_win(self):
        self.server.game.remove_next_boss()
        if self.__boss_available_for_next_battle():
            self.server.send_result(Result.VALIDATED_OK)
            return
        self.server.send_result(Result.OBTAINED_FLAG)
        self.server.send_flag()
        self.server.exit()

    def __boss_available_for_next_battle(self) -> bool:
        return not (self.server.game.next_boss is None)

    def __compute_battle_outcome(self) -> Optional[Result]:
        for command in self.history.commands:
            match command:
                case Command.ATTACK:
                    self.boss.receive_attack_from(self.player)
                    if self.boss.is_dead:
                        return Result.PLAYER_WIN_BATTLE
                case Command.HEAL:
                    self.player.use_potion()
                case Command.BOSS_ATTACK:
                    self.player.receive_attack_from(self.boss)
                    if self.player.is_dead:
                        return Result.BOSS_WIN_BATTLE
        return None
