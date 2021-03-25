#Task 1.4

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

## Word Generation code ############################################
#Task 1.1
import random

def readWordlistFile(filename="WORDS.TXT"):
    wordStorage = {} # Index the words by their length using a dictionary
    
    file = open(filename, 'r') # Read mode
    for line in file:
        word = line.strip()
        length = len(word)
        # Add to data structure
        if wordStorage.get(length) == None:
            wordStorage[length] = [] # 
        wordStorage[length].append(word)
    file.close()
    
    # Organise Data Structure
    for key in wordStorage.keys():
        wordStorage[key].sort()
        
    return wordStorage

def getShortestLongestWord(wordStorage):
    keys = sorted(wordStorage.keys()) # Get the length in ascending order
    if keys == None:
        shortest = None
        longest = None
    else:
        shortestLength = keys[0]
        shortest = wordStorage[shortestLength][0]
        longestLength = keys[-1]
        longest = wordStorage[longestLength][0]
    return shortest, longest

def getRandomElement(array):
    index = random.randrange(0, len(array)) # Excluding len(array)
    return array[index]
    
def getSecret(server):
    # (a) Read from file
    wordStorage = readWordlistFile()
    
    # (b) Get longest and shortest word
    shortest, longest = getShortestLongestWord(wordStorage)
    
    # (c) Read in word length
    server.send(f"Choose length of word to guess:[{len(shortest)} to {len(longest)}]")
    length = int(server.receive())
    
    # (d) Randomly choose word of given length
    word = getRandomElement(wordStorage[length])
    return word

## Main code ############################################################
server = Connection('127.0.0.1',1234)
server.server()
word = getSecret(server)
server.send("-1")# Stop interactive prompt
server.send(word)
print(word)
server.close()


