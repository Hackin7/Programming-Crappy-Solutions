# Test for buffer overflow
from pwn import *
#len("password123")
START,END = 100, 200
try:
    for i in range(START, END + 1):
        r = process("./tranquil")
        r.recv()
        r.send(("A"*i + "\n").encode())
        print(i, r.recv())
except:
    pass
