#!/usr/bin/env python

'''
This client should connect to the server (set to localhost:1234)
and print b'Hello from client\n' to the server
'''

import socket

ADDRESS = '127.0.0.1'
PORT = 1234

my_socket = socket.socket()
my_socket.connect((ADDRESS,PORT))
my_socket.sendall(b'Hello from client\n')
my_socket.close()
