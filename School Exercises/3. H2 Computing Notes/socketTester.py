import socket

# An overengineered socket class for A Levels
class Connection: 
    def __init__(self, ip, port, server=False):
        self.net = (ip, port)
        self.isServer = server
        if server == True:
            self.set_server()
        else:
            self.set_client()

    ### Important Initialisation steps ###############################
    def set_server(self):
        self.socket = socket.socket()
        self.socket.bind(self.net)
        self.socket.listen()
        print('Listening on',self.net)
        
        self.conn, self.conn_addr = self.socket.accept()
        print('Accepted connection from', self.conn_addr)
        self.socket.close()

    def set_client(self):
        print("Connecting to",self.net)
        self.conn = socket.socket()
        self.conn.connect(self.net)
        print("Connected")
        
    ### Basic I/O #####################################################
    def send(self, message):
        self.conn.sendall(message.encode('ascii') + b'\n') # \n be end char

    def receive(self):
        data = ""
        while '\n' not in data:
            data += self.conn.recv(1024).decode('ascii') # 1024 is max size
        return data.strip()

    def close(self):
        return self.conn.close()

    ### Unnecessary but useful ########################################
    def interactive(self):
        # Loop      
        connected = True
        while connected:
            output = self.receive()
            if output == 'Exit':
                connected = False
            else:
                print(output)
                self.send(input())
            
        self.close()


option = input("Type something to launch as client: ")
if option == "":
    server = Connection('127.0.0.1',1234, True)
    for i in range(10):
        server.send('Send a message:') #Use like a print function
        print(server.receive())
    server.send('Exit')

    server.close()
else:
    client = Connection('127.0.0.1', 1234)
    client.interactive()
