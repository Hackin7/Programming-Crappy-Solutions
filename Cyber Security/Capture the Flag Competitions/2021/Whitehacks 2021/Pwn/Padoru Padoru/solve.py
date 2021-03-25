from pwn import *

'''
If script does not run, please ensure that you have pwntools installed
https://github.com/Gallopsled/pwntools

If you're on a debian-based system e.g. debian, ubuntu, kali...:
apt-get update
apt-get install python3 python3-pip python3-dev git libssl-dev libffi-dev build-essential
python3 -m pip install --upgrade pip
python3 -m pip install --upgrade pwntools
'''

HOST = 'chals.whitehacks.ctf.sg' # change this if required
PORT = 20001   # change this if required

io = remote(HOST, PORT) # connects to the service

print(io.recvuntil('=>').decode()) # receives data until input prompt

payload = b'WH2021{}'

#with open("flag.wrapped", "rb") as f:payload += f.read()

print(payload)
io.sendline(payload) # sends your payload to the service
print(io.recv().decode())
io.interactive() # allows you to interact with service manually

