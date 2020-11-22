#!/usr/bin/env python

'''
This server should connect to the client (set to localhost:1234)
and print b'Hello from client\n' to the server
'''
import socket

ADDRESS = '127.0.0.1'
PORT = 1234

my_socket = socket.socket()
my_socket.bind((ADDRESS,PORT))
my_socket.listen() #Listen for incomping connections

new_socket,addr = my_socket.accept() 
#print("Connected to: "+str(addr))

print(new_socket.recv(1024)) # Max bytes
new_socket.close()

my_socket.close()
