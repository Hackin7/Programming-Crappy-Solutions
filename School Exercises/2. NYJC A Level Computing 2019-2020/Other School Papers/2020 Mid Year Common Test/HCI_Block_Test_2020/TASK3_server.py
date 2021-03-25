import socket
import random

### Game Loop ###################
class Game:
    def __init__(self):
        # Generate a random capital letter
        char_no = random.randint(1,26)
        self.ascii = 64 + char_no # Capital letters start from 65
        self.char = chr(self.ascii) # Using ASCII Values
        print("Random Char:",self.char)

    def estimate(self, given_char):
        # Output Placeholders
        message = ""
        correct = False
        
        given_ascii = ord(given_char)
        if given_ascii > self.ascii:
            message = "The answer is before your guess"
        elif given_ascii < self.ascii:
            message = "The answer is after your guess"
        else: # equivalent to # elif given_ascii == self.ascii:
            message = "You win!"
            correct = True

        return (message, correct)

### Set up server ##############
PORT_NO = 1234
def server(ip_addr='127.0.0.1', port=PORT_NO):
    server = socket.socket()
    server.bind((ip_addr, port))
    server.listen()
    conn, info = server.accept()

    game = Game()
    
    correct = False
    while not correct:
        data = conn.recv(1024)
        char = data.decode('ascii').strip()
        message, correct = game.estimate(char)
        print(char,message, correct)
        conn.sendall((message).encode('ascii'))

    conn.close()
    server.close()
        



        
    
server()
