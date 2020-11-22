import socket

my_socket = socket.socket()
my_socket.bind(('127.0.0.1', 8000))
my_socket.listen()
new_socket, address = my_socket.accept()
received_data = new_socket.recv(1024)
print(received_data.decode())
new_socket.close()
my_socket.close()
