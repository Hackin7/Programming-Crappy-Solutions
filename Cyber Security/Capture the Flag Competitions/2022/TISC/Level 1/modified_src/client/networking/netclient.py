from typing import Any

from nclib import Netcat  # type: ignore

from core.networking.protocol import EOF_MARKER, decode, encode


class NetClient:
    def __init__(self, host: str, port: int, verbose: bool = False):
        self.__client = Netcat((host, port), verbose=verbose)

    def send(self, data: str) -> int:
        return self.__client.send(encode(data))

    def recv(
        self,
        marker: str = EOF_MARKER,
        max_size: Any | None = None,
        timeout: str = "default",
    ) -> str:
        return decode(
            self.__client.recv_until(marker, max_size, timeout)[
                : -len(EOF_MARKER)
            ]
        )

    def close(self):
        self.__client.close()
