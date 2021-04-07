from solveKey import *
from generate import *

from pwn import *
from random import choice

sh = remote('crypto.2021.chall.actf.co', 21602)

msgs = []
encs = []
for i in range(100):
    print(i)
    p = "".join([choice(list("abcdef0123456789")) for a in range(64)])
    sh.sendlineafter('Would you like to encrypt [1], or try encrypting [2]? ', '1')
    sh.sendlineafter("What would you like to encrypt: ", p)
    x = sh.recvuntil("\n").strip()
    print(x)
    msgs.append(p)
    encs.append(x.decode())


sh.sendlineafter('Would you like to encrypt [1], or try encrypting [2]? ', '2')

### Solving Key ###############################################
key = solveForKey(msgs, encs)

### Inputting ##############################################
for i in range(10):
    print(sh.recvuntil("Encrypt this: "))
    challenge = sh.recvuntil("\n").strip().decode()
    print([challenge])
    cipher = Cipher(key)
    p = challenge#input("Input p:")
    e = cipher.encrypt(binascii.unhexlify(p)).decode()
    print(e)
    sh.send(e+"\n")
    #print(sh.recvuntil("\n"))
    #sh.interactive()

sh.interactive()
