import socket

listen_socket = socket.socket()
listen_socket.bind(('127.0.0.1',6789))
listen_socket.listen()

chat_socket, addr = listen_socket.accept()
while True:
    data = input('INPUT SERVER: ').encode()
    chat_socket.sendall(data+b'\n')
    
    ### Quit by Server ####################
    if 'quit' == data.decode():
        print("SERVER CLOSED CONNECTION")
        break
    #######################################
    
    print('WAITING FOR CLIENT')
    data = b''
    while b'\n' not in data:
        data += chat_socket.recv(1024)
    print('CLIENT WROTE: ' + data.decode())
    
    ### Quit by Client ####################
    if 'quit\n' == data.decode():
        print("CLIENT CLOSED CONNECTION")
        break
    #######################################

import time
time.sleep(1) # Wait for client to close
chat_socket.close()    
listen_socket.close()

