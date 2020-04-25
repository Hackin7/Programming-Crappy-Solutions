#!/usr/bin/env python3

from pwn import *
def levelone():
    A = [0,0,0,0]
    A[0] = 0xe48ca057;
    A[1] = 0x6c77c87b;
    A[2] = 0x536f83af;
    A[3] = 0x1201c743;

    output=b""
    for i in A[::-1]:
        output+=p32(i)
    return output

def leveltwo():
    level2 = "dynamite"
    map_ = [0x79, 0x61, 0x64, 0x69, 0x72, 0x6e, 0x65, 0x6d, 0x6f, 0x74, 0x6c, 0x70, 0x67, 0x77, 0x00]
    mapChar = ""
    for i in map_:mapChar+=chr(i)
    
    inVals = [0 for i in range(8)]
    for i in range(len(level2)):
        inVals[i] = mapChar.find(level2[i])
        
    output = b""
    for i in inVals:
        output += bytes(chr(ord("A")-1+i), encoding="ascii")
    return output
    

def levelthree():
    A = [7,2,9,2,6]
    output = ""
    for i in A[::-1]:
        output += str(0xa-i)+" "
    #output = output[:-1] #Remove trailing whitespace
    return bytes(output,encoding="ascii")

directory = "./Solutions/"
print(levelone())    
with open(directory+"solve1.in","wb") as f:f.write(levelone())#+b"AAAABBBB")

print(leveltwo())
with open(directory+"solve12.in","wb") as f:f.write(levelone()+leveltwo()+b"1 1 1 1 1")

print(levelthree())
with open(directory+"solve123.in","wb") as f: f.write(levelone()+leveltwo()+levelthree())
    
if True: #Enable remote hacking?
    conn = remote('challenges.csdc20t.ctf.sg',10025)
    # Main menu
    print(conn.recvuntil("=>"))
    flag = levelone()+leveltwo()+levelthree()
    conn.send(flag)
    conn.interactive()
