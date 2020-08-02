from pwn import *
conn = remote('chals.whitehacks.ctf.sg',11001)
before = conn.recvuntil("'")
string = conn.recvuntil("'")
after = conn.recvuntil(":")
print(before+string+after)
print(string)
conn.send(string[:-1]+'\n')
conn.interactive()
