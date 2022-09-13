from enum import Enum


class Error(Enum):
    CANNOT_CONNECT_TO_SERVER = "Unable to connect to given host/port"
    RECEIVED_MALFORMED_RESULT = "Received malformed result"
    FAILED_TO_SEND_COMMAND = "Failed to send command"
