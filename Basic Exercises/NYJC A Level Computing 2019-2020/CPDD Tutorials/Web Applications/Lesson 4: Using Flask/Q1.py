import socket

EOL = b'\r\n'

listen_socket = socket.socket()
listen_socket.bind(('127.0.0.1',5000))
listen_socket.listen()

def handle_request(new_socket):
    request = b''
    while EOL not in request:
        received = new_socket.recv(1024)
        if received == b'':
            return
        request += received
    index = request.index(EOL)
    first_line = request[:index]
    
    response = b'HTTP/1.1 200 OK' + EOL
    response += b'Content-Type: text/plain' + EOL
    response += b'Content-Length: '
    response += str(len(first_line)).encode() + EOL
    response += EOL
    response += first_line
    
    new_socket.sendall(response)
    new_socket.close()

while True:
    new_socket, addr = listen_socket.accept()
    
    handle_request(new_socket)
