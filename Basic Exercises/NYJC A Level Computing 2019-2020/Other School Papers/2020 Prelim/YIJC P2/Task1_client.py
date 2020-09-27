import socket

class Connection:
    def __init__(self, ip, port):
        self.bind = (ip, port)

    def server(self):
        self.socket = socket.socket()
        self.socket.bind(self.bind)
        self.socket.listen()
        print('Listening')
        self.conn, address = self.socket.accept()
        print(address)

    def client(self):
        self.conn = socket.socket()
        self.conn.connect(self.bind)

    def send(self, data):
        self.conn.sendall(str(data).encode())
        
    def receive(self):
        return self.conn.recv(1024).decode()

    def close(self):
        self.conn.close()

    def interactive(self):
        run = True
        while run:
            recv = self.receive()
            if "QUIT" in recv:# Terminating character
                run = False
                self.close()
            elif len(recv) > 0 and recv[-2:] == ': ':
                print(recv)
                self.send(input(""))
            else:
                print(recv)

        self.close()

client = Connection('127.0.0.1', 2000)
client.client()
client.interactive()
