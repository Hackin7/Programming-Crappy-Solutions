
import binascii
from random import choice

def debug(*val):
    pass
    print(*val)

class Cipher:
    BLOCK_SIZE = 16
    ROUNDS = 3
    def __init__(self, key):
        assert(len(key) == self.BLOCK_SIZE*self.ROUNDS)
        self.key = key

    def __block_encrypt(self, block):
        enc = int.from_bytes(block, "big")
        debug("msgSlice:",enc)
        for i in range(self.ROUNDS):
            k = int.from_bytes(self.key[i*self.BLOCK_SIZE:(i+1)*self.BLOCK_SIZE], "big")
            enc &= k
            enc ^= k
            debug("k, enc", k, enc)
        #### Just padding
        debug("encslice", enc)
        debug("hex(enc), just", hex(enc),hex(enc)[2:].rjust(self.BLOCK_SIZE*2, "0") )

        return hex(enc)[2:].rjust(self.BLOCK_SIZE*2, "0")


    def __pad(self, msg):
        if len(msg) % self.BLOCK_SIZE != 0:
            return msg + (bytes([0]) * (self.BLOCK_SIZE - (len(msg) % self.BLOCK_SIZE)))
        else:
            return msg

    def encrypt(self, msg):
        m = self.__pad(msg)
        e = ""
        for i in range(0, len(m), self.BLOCK_SIZE):
            e += self.__block_encrypt(m[i:i+self.BLOCK_SIZE])
        return e.encode()
