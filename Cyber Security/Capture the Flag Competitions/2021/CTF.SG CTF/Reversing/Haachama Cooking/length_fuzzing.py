from pwn import *


for i in range(1, 100):
    #print(i, "length")
    io = process("haachama-cooking")
    io.sendline("A"*i)
    out = io.recv()
    #print(out)
    if b"Invalid flag length" not in out:
        print(i)
        break
