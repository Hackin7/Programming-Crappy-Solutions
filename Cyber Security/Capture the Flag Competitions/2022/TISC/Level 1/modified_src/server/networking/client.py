import sys

from core.networking.protocol import EOF_MARKER, decode, encode


class NetClient:
    def __init__(self):
        pass

    @staticmethod
    def send(data: str):
        sys.stdout.buffer.write(encode(data))
        sys.stdout.buffer.flush()

    @staticmethod
    def recv() -> str:
        return decode(NetClient.__recvuntil(EOF_MARKER))

    @staticmethod
    def __recvuntil(marker: str) -> bytes:
        data = b""
        while True:
            current_byte = sys.stdin.buffer.read(1)
            if current_byte == marker.encode():
                break
            data += current_byte
        return data
