import socket

response = b'HTTP/1.1 200 OK\r\n'
response += b'Content-Type: text/plain\r\n'
response += b'Content-Length: 13\r\n'
response += b'\r\n'
response += b'Hello,\nWorld!'

my_socket = socket.socket()
my_socket.bind(('127.0.0.1',8000))
my_socket.listen()
new_socket, address = my_socket.accept()
new_socket.sendall(response)
input('Press enter to quit: ')
new_socket.close()
my_socket.close()
