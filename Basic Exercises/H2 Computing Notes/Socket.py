import socket

ADDRESS = '127.0.0.1'
PORT = 1234

def client():
    print("Starting Client...................")
    
    ## Server Connection #####################################
    my_socket = socket.socket()
    my_socket.connect((ADDRESS,PORT))

    ## Sending Data ######################################
    my_socket.sendall(b'Hello from Client\n')
    
    ## Receiving Data ######################################
    print("Received from server:", my_socket.recv(1024)) # Max bytes

    ## Closing when done ####################################
    my_socket.close()

def server():
    print("Starting Server...................")
    
    ## Server Connection #####################################
    my_socket = socket.socket()
    my_socket.bind((ADDRESS,PORT))
    my_socket.listen() #Listen for incomping connections
    new_socket,addr = my_socket.accept()

    ## Receiving Data #######################################
    received_data = new_socket.recv(1024) # Max bytes
    print("Received from client:", received_data) 
    print("Converting to string:", received_data.decode())
    
    ## Sending Data #########################################
    new_socket.sendall(b'Hello from Server\n')

    ## Closing when done ####################################
    new_socket.close()
    my_socket.close()

if input("Type something to become the client. Else, just enter to become server: ") == "":
    server()
else:
    client()

input() # Keep text on the screen
