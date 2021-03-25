# Task 1.3

### Main Socket Code #############################################
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


### Previous code ######################################
# Task 1.1
def readGame(filename="GAME.TXT"):
    gameMap = [] # Python list to simulate a 2D array. Array of rows
    infile = open(filename, 'r')
    
    for line in infile:
        row = list(line.strip()) # Make into array
        gameMap.append(row)
    infile.close()
    return gameMap

def displayGame(gameMap):
    output = ''
    for row in gameMap:
        for col in row:
            output += f'{col} '
        output = output.strip() + '\n'
    
    return (output.strip()) 
    
# Task 1.2
def generateEmpty():
    gameMap = []
    for y in range(6):
        row = []
        for x in range(6):
            row.append('.')
        gameMap.append(row)
    return gameMap
    
def finalMap(player, actual):
    gameMap = []
    for y in range(6):
        row = []
        for x in range(6):
            if player[y][x] == '.' and actual[y][x] != '.': # hidden object
                row.append(actual[y][x])
            else:
                row.append(player[y][x])
        gameMap.append(row)
    return gameMap

### New Code #########################################################
def fire(conn,player, actual):
    conn.send("Enter x coordinate (0 to 5): ")
    x = int(conn.receive())
    conn.send("Enter y coordinate (0 to 5): ")
    y = int(conn.receive())
    if actual[y][x] == 'X':
        player[y][x] = 'S'
    else:
        player[y][x] = 'O'

def socketGamePlayLoop():
    ## Socket initialisation
    server = Connection('127.0.0.1', 2000)
    server.server()
    
    actual = readGame()
    player = generateEmpty()
    
    displayGame(player)
    
    server.send('You have 5 missiles to shoot, use them wisely')
    print('Look at your current status')
    for i in range(5):
        fire(server, player, actual)
        print(displayGame(finalMap(player, actual)))
        print()
        server.send(displayGame(player))
        server.send('\n')
    
    print()

    ## Final
    print('Final:')
    print(displayGame(finalMap(player, actual)))
    server.send('QUIT')
    server.close()
        
socketGamePlayLoop()


