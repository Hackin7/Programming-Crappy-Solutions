# Sample Random No. 1804289383

#from pwn import *
#def getio():
#    return remote('pwn.chal.csaw.io', 5004)


## Bruteforce Q1: Turns out not needed ######################
from socket import socket
from telnetlib import Telnet


def send_data(data):
    sock = socket()
    sock.connect(('pwn.chal.csaw.io', 5004))
    sock.send(f'{data}\n'.encode())
    data = sock.recv(1024)
    sock.close()
    return data

length = 0
for i in range(1,180428938300):
    payload = f"{i}"
    data = send_data(i)
    #print(data)
    
    if i%1000==0:
        print(i)
    if b"Correct!" in data:
        length = i
        print(f"Solution: {length}")
        break
    
