### Given Client.py ###################################
from socket import socket

my_socket = socket()
my_socket.connect(('127.0.0.1', 12345))

while True:
    #Receive data from the Server
    data = my_socket.recv(1024).decode()
    
    
    #Write the code to prompt the user to input the move direction
    # If asking for input
    if data.strip() == "Q": # Quit condition
        break
    elif len(data) > 3 and data[-3:] == " : ":
        my_socket.sendall(input(data).encode())
    else:
        #Print the data
        print(data)        

my_socket.close()
