# copy the necessary program code
# from maze.py and paste it here:
from random import randint

def user(position, direction):
    if direction == 'U':
        return [position[0], position[1]-1]
    elif direction == 'D':
        return [position[0], position[1]+1]
    elif direction == 'L':
        return [position[0]-1, position[1]]
    elif direction == 'R':
        return [position[0]+1, position[1]]
    else:
        return position
   
def grid(p,o):
    string = ''
    for row in range(11):
        for i in range(10):
            if [i,row] == p:
                string += 'P'     #prize
            elif [i,row] == o:
                string += 'O'     #player
            else:
                string += '.'
        string += '\n'
    return string    
   


def main():

    player = [4, 5]

    x, y = 4,5
    while [x,y] == [4,5]:   
        x = randint(0,9)    #prize must not be [4,5]
        y = randint(0,10)
    prize = [x,y]

    print(grid(prize,player))

    counter = 0

    while True:
        move = input('Enter U(p), D(own), L(eft), R(ight) or Q(uit) : ').upper()

        if move == 'Q':
            print('You have ended the game.')
            break
        else:
            next_position = user(player, move)
            counter += 1
            if next_position==prize:
                print('You got the Prize in '+str(counter)+' steps!')
                break
            else:
                player = next_position
                print(grid(prize,player))
### My Code ########################################################
def initialisation():
    player = [4, 5]
    x, y = 4,5
    while [x,y] == [4,5]:   
        x = randint(0,9)    #prize must not be [4,5]
        y = randint(0,10)
    prize = [x,y]
    socketPrint(grid(prize,player))
    counter = 0
    return player, prize, counter

def socketPrint(message):
    new_socket.sendall(message.encode())
    
def socketInput(message):
    socketPrint(message)
    return new_socket.recv(1025).decode().strip()

### Given Server Code ##############################################

from socket import socket

my_socket = socket()
my_socket.bind(('127.0.0.1', 12345))
my_socket.listen()

print('Type Ctrl-C or close the shell to terminate game.')
new_socket, addr = my_socket.accept()
print('Connected to: ' + str(addr))

player, prize, counter = initialisation()
while True:
    #### Write your code here: ##########################################
    move = socketInput('Enter U(p), D(own), L(eft), R(ight) or Q(uit) : ').upper()
    if move == 'Q':
        socketPrint('You have ended the game.')
        break
    else:
        next_position = user(player, move)
        counter += 1
        if next_position==prize:
            socketPrint('You got the Prize in '+str(counter)+' steps!')
            break
        else:
            player = next_position
            socketPrint(grid(prize,player))


    #####################################################################

socketPrint('Q') # Quit Character
new_socket.close()
my_socket.close()
