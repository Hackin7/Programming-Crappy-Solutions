#Task 1.5

### Socket Code ############################################################
import socket
class Connection():
    def __init__(self, ip, addr):
        self.ip = ip
        self.addr = addr

    def server(self):
        self.socket = socket.socket()
        self.socket.bind((self.ip, self.addr))
        self.socket.listen()
        self.conn, info = self.socket.accept()
        
    def client(self):
        self.conn = socket.socket()
        self.conn.connect((self.ip, self.addr))

    def send(self, message):
        self.conn.sendall(message.encode())

    def receive(self):
        return self.conn.recv(1024).decode()
    
    def close(self):
        self.conn.close()
        
    def interactive(self):
        done = False
        while not done:
            data = self.receive()
            if data.strip() == "-1":
                done = True
            else:
                print(data)
                self.send(input())

###########################################################################################
## Task 1.2
def createPlaceholderList(word):
    return list('.' * len(word))

def guessSecret(word=None, createPlaceholderList=createPlaceholderList):
    if word == None:
        word = getSecret()
    
    attempts = len(word) * 2
    # Create placeholder
    placeholder = createPlaceholderList(word)
    print(f"You have {attempts} attempts. Good luck!")
    # Show placeholder
    placeholderString = ""
    for char in placeholder:
        placeholderString += char
    print(placeholderString)
        
    done = False
    while not done:
        # Input
        letter = input(f"[{attempts}]Guess letter:").strip()
        
        # Check if letter match
        for charPos in range(len(word)):
            if word[charPos] == letter:
                placeholder[charPos] = letter
        
        # Show placeholder
        placeholderString = ""
        for char in placeholder:
            placeholderString += char
        print(placeholderString)
        
        # Check win state
        attempts -= 1
        if '.' not in placeholder:
            print('WIN')
            done = True
        elif attempts <= 0:
            print(f"LOSE..The word is {word}")
            done = True
            


### Main code ########################################################
client = Connection('127.0.0.1',1234)
client.client()
client.interactive() # Receive server prompts about how to generate
word = client.receive().strip()
client.close()
guessSecret(word=word)

