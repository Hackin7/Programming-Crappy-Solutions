from base64 import b64decode, b64encode

from core.config import EOF_MARKER


def encode(data: str) -> bytes:
    return b64encode(data.encode()) + EOF_MARKER.encode()


def decode(data: bytes) -> str:
    return b64decode(data).decode()
