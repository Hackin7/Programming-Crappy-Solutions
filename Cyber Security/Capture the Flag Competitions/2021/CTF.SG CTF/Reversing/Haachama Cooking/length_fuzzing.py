from pwn import *


for i in range(1, 100):
    print(i, "length")
    io = process("haachama-cooking")
    io.sendline("A"*i)
    out = io.recv()
    if out != "Invalid flag length":
        break
