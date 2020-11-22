import socket

class Connection:
    def __init__(self, ip, port, server=False):
        self.net = (ip, port)

        self.server = server
        if self.server:
            self.set_server()
        else:
            self.set_client()

    def set_server(self):
        sock = socket.socket()
        sock.bind(self.net)
        sock.listen()
        self.conn, self.conn_details = self.socket.accept()

    def set_client(self):
        self.conn = socket.socket()
        self.conn.connect(self.net)

    ### Basic I/O ###########################################
    def send(self, message):
        self.conn.sendall(message.encode('ascii'))

    def recv(self):
        return self.conn.recv(1024).decode('ascii')

    def close(self):
        return self.conn.close()

    def interactive(self):
        connected = True
        while connected:
            output = self.recv()
            print(output)
            if output == 'Exit':
                connected = False
            else:
                self.send(input())

        self.close()

client = Connection('127.0.0.1', 1234)
client.interactive()
        
