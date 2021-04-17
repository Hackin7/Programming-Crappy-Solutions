from pwn import *

# You can use netcat to interact with the service manually too:
# nc <HOST> <PORT>

HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30501
CHALLENGE = './powerlevelelite'  # Make sure the challenge file in in your directory!

POWER_UP_PROMPT = 'Power up => '

io = remote(HOST, PORT)  # Comment this out when testing locally
# io = ELF(challenge)  # Uncomment this to test locally

# payload = '<enter payload here>'
# io.sendlineafter(POWER_UP_PROMPT, payload)

io.interactive()
