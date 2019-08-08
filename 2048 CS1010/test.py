#
# CS1010S --- Programming Methodology
#
# Sidequest 10.1 Template
#
# Note that written answers are commented out to allow us to run your #
# code easily while grading your problem set.

from random import *
from puzzle import GameGrid

###########
# Helpers #
###########

def accumulate(fn, initial, seq):
    if not seq:
        return initial
    else:
        return fn(seq[0],
                  accumulate(fn, initial, seq[1:]))

def flatten(mat):
    return [num for row in mat for num in row]



###########
# Task 1  #
###########
def new_game_matrix(n):
    return [[0 for j in range(n)] for i in range(n)]
    #"Your answer here"

def has_zero(mat):
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            if mat[i][j]==0:return True
    return False
    #"Your answer here"

def add_two(mat):
    if not has_zero(mat): return mat
    i = randint(0,len(mat)-1)
    j = randint(0,len(mat)-1)
    while mat[i][j]!=0:
        i = randint(0,len(mat)-1)
        j = randint(0,len(mat)-1)
    mat[i][j] = 2
    return mat



###########
# Task 2  #
###########
def game_status(mat):
    # Check Win
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            if mat[i][j]==2048:return 'win'
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            if mat[i][j]==0:return 'not over'
            if i != 0:# not at top
                if mat[i-1][j]==mat[i][j]:return 'not over'
            if i != len(mat[i])-1:# not at bottom
                if mat[i+1][j]==mat[i][j]:return 'not over'
            if j != 0:# not at left
                if mat[i][j-1]==mat[i][j]:return 'not over'
            if j != len(mat[i])-1:# not at right
                if mat[i][j+1]==mat[i][j]:return 'not over'
        
    return 'lose'

###########
# Task 3a #
###########

def transpose(mat):
    new = [[0 for j in mat] for i in mat[0]]
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            new[j][i] = mat[i][j]
    return new        
    "Your answer here"



###########
# Task 3b #
###########

def reverse(mat):
    new = [[0 for j in mat[0]] for i in mat]
    for i in range(len(mat)):
        for j in range(len(mat[i])):
            new[i][-j-1] = mat[i][j]
    return new
    "Your answer here"



############
# Task 3ci #
############

def merge_left(mat):
    score = 0
    new = [[0 for j in mat[0]] for i in mat]
    for i in range(len(mat)):
        n = 0 # Empty slot in new list
        j = 0#Next element#for j in range(len(mat[i])):
        while j < len(mat[i]):
            if mat[i][j] == 0:
                j+=1
                continue
                
            if j == len(mat[i])-1:
                new[i][n] = mat[i][j]
                break
            
            k=j+1 #NextTile #for k in range(j,len(mat[i])):
            while k< len(mat[i]):
               # print(f"i{i}j{j}k{k}, {mat[i][j]}<-{mat[i][k]}, new{new[i]}")
                #No NextTile
                if k==len(mat[i])-1 and mat[i][k]==0:
                    #print("noNextTile:")
                    new[i][n] = mat[i][j]
                    #print(f"i{i}j{j}k{k}, {mat[i][j]}<-{mat[i][k]}, new{new[i]}\n")
                    n+=1
                    break
                #If Different Values
                elif mat[i][k] != mat[i][j] and mat[i][k]!=0:
                    new[i][n] = mat[i][j]
                    n+=1#Used up 1 empty slot
                    j=k-1
                    break
                #If Same value    
                elif mat[i][k] == mat[i][j] and mat[i][k]!=0:
                    new[i][n] = mat[i][j] + mat[i][k]
                    score += mat[i][j] + mat[i][k]
                    n+=1#Used up 1 empty slot
                    j = k#+1 #Process Tile beside NextTile
                    break
                 #Else
                else:#if mat[i][k]==0: 
                    k+=1
                    continue
            j+=1
    check = not (mat == new)
    print(check)
    return (new, check, score)
    "Your answer here"



#############
# Task 3cii #
#############

def merge_right(mat):
    merged = merge_left(reverse(mat))
    return reverse(merged[0]),merged[1],merged[2]
    "Your answer here"

def merge_up(mat):
    merged = merge_left(transpose(mat))
    return transpose(merged[0]),merged[1],merged[2]
    "Your answer here"

def merge_down(mat):
    merged = merge_right(transpose(mat))
    return transpose(merged[0]),merged[1],merged[2]
    "Your answer here"


###########
# Task 3d #
###########

def text_play():
    def print_game(mat, score):
        for row in mat:
            print(''.join(map(lambda x: str(x).rjust(5), row)))
        print('score: ' + str(score))
    GRID_SIZE = 4
    score = 0
    mat = add_two(add_two(new_game_matrix(GRID_SIZE)))
    print_game(mat, score)
    while True:
        move = input('Enter W, A, S, D or Q: ')
        move = move.lower()
        if move not in ('w', 'a', 's', 'd', 'q'):
            print('Invalid input!')
            continue
        if move == 'q':
            print('Quitting game.')
            return
        move_funct = {'w': merge_up,
                      'a': merge_left,
                      's': merge_down,
                      'd': merge_right}[move]
        mat, valid, score_increment = move_funct(mat)
        if not valid:
            print('Move invalid!')
            continue
        score += score_increment
        mat = add_two(mat)
        print_game(mat, score)
        status = game_status(mat)
        if status == "win":
            print("Congratulations! You've won!")
            return
        elif status == "lose":
            print("Game over. Try again!")
            return

# UNCOMMENT THE FOLLOWING LINE TO TEST YOUR GAME
#text_play()


# How would you test that the winning condition works?
# Your answer:
# Test a game state with a 2048 tile, and check if a win is triggered



##########
# Task 4 #
##########

def make_state(matrix, total_score):
    return (matrix,total_score)
    "Your answer here"

def get_matrix(state):
    mat = state[0]
    score = state[1]
    return mat
    "Your answer here"

def get_score(state):
    mat = state[0]
    score = state[1]
    return score
    "Your answer here"

def make_new_game(n):
    mat = new_game_matrix(n)
    mat = add_two(mat)
    mat = add_two(mat)
    return mat,0
    "Your answer here"

def left(state):
    mat = state[0]
    score = state[1]
    mat,valid,new = merge_left(mat)
    score+=new
    #valid = False
    if valid: mat = add_two(mat)
    return ((mat,score), valid)
    "Your answer here"

def right(state):
    mat = state[0]
    score = state[1]
    mat,valid,new = merge_right(mat)
    score+=new
    #valid = False
    if valid: mat = add_two(mat)
    return ((mat,score), valid)
    "Your answer here"

def up(state):
    mat = state[0]
    score = state[1]
    mat,valid,new = merge_up(mat)
    score+=new
    #valid = False
    if valid: mat = add_two(mat)
    return ((mat,score), valid)
    "Your answer here"

def down(state):
    mat = state[0]
    score = state[1]
    mat,valid,new = merge_down(mat)
    score+=new
    #valid = False
    if valid: mat = add_two(mat)
    return ((mat,score), valid)
    "Your answer here"


# Do not edit this #
game_logic = {
    'make_new_game': make_new_game,
    'game_status': game_status,
    'get_score': get_score,
    'get_matrix': get_matrix,
    'up': up,
    'down': down,
    'left': left,
    'right': right,
    'undo': lambda state: (state, False)
}

# UNCOMMENT THE FOLLOWING LINE TO START THE GAME (WITHOUT UNDO)
gamegrid = GameGrid(game_logic)




#################
# Optional Task #
#################

###########
# Task 5i #
###########

def make_new_record(mat, increment):
    "Your answer here"

def get_record_matrix(record):
    "Your answer here"

def get_record_increment(record):
    "Your answer here"

############
# Task 5ii #
############

def make_new_records():
    "Your answer here"

def push_record(new_record, stack_of_records):
    "Your answer here"

def is_empty(stack_of_records):
    "Your answer here"

def pop_record(stack_of_records):
    "Your answer here"

#############
# Task 5iii #
#############

# COPY AND UPDATE YOUR FUNCTIONS HERE
def make_state(matrix, total_score, records):
    "Your answer here"

def get_matrix(state):
    "Your answer here"

def get_score(state):
    "Your answer here"

def make_new_game(n):
    "Your answer here"

def left(state):
    "Your answer here"

def right(state):
    "Your answer here"

def up(state):
    "Your answer here"

def down(state):
    "Your answer here"

# NEW FUNCTIONS TO DEFINE
def get_records(state):
    "Your answer here"

def undo(state):
    "Your answer here"


# UNCOMMENT THE FOLLOWING LINES TO START THE GAME (WITH UNDO)
##game_logic = {
##    'make_new_game': make_new_game,
##    'game_status': game_status,
##    'get_score': get_score,
##    'get_matrix': get_matrix,
##    'up': up,
##    'down': down,
##    'left': left,
##    'right': right,
##    'undo': undo
##}
#gamegrid = GameGrid(game_logic)
