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

main()

