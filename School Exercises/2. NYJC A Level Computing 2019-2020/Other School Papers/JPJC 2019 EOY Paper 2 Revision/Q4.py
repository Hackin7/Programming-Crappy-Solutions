###Constants
Players = ['-', 'O', 'X'] #Blank, P1, P2
R, C = 6, 7 #Rows, Columns
Match = 4
###Variables - For use during Gameplay
Board = []
GameFinished = False
ThisPlayer = Players[1]

#Others
lastPiece = [0, 0] #Previously Placed Piece

def InitialiseBoard():
    global Board
    Board = []
    for i in range(R): #Rows
        row = []
        for j in range(C): #Columns
            row.append(Players[0]) #Blank character
        Board.append(row)
        
def SetUpGame():
    global GameFinished, ThisPlayer
    GameFinished = False
    ThisPlayer = Players[1]

def OutputBoard():
    ###Header########
    header = " \t" 
    for j in range(C):
        header += str(j+1)+"\t"
    print(header)
    ###Rest##########
    for i in range(R):
        print(i+1, end="\t")
        for j in range(C):
            print(Board[i][j], end="\t")
        print()#Newline

def columnArray(column):
    col = []
    for i in range(R):
        col.append(Board[i][column])
    return col

def ThisPlayerMakesMove():
    ###User Input############################
    print(f"Player {ThisPlayer}'s turn")
    global column
    column = input(f"Enter a valid column number (1-{C}):")
    ###Validation##########
    while not (column.strip().isdigit() and 1 <= int(column) <= C and\
               Players[0] in columnArray(int(column)-1)):#Check if have empty space
        print("Column number input in is not valid")
        column = input(f"Enter a valid column number (1-{C}):")
    column = int(column)-1
    ###Place Piece############################
    row = R-1
    put = False
    while 0 <= row < R and not put:
        if Board[row][column] == Players[0]:
            Board[row][column] = ThisPlayer
            put = True
        else:
            row -= 1
    global lastPiece
    lastPiece = [row, column]

        
def CheckifThisPlayerHasWon():
    global lastPiece
    row = lastPiece[0]
    column = lastPiece[1]
    ####In a Row###################
    matchRow = 0
    for i in range(C): #Vary Column
        #print("(",row,i,Board[row][i], ")")
        if Board[row][i] == ThisPlayer:
            matchRow += 1
        elif matchRow < Match:
            matchRow = 0
    ####In a Column###################
    matchCol = 0
    for i in range(R): #Vary Row
        #print("(",i,column,Board[i][column], ")")
        if Board[i][column] == ThisPlayer:
            matchCol += 1
        elif matchCol < Match:
            matchCol = 0
    ###Has it Matched?################
    #print(matchRow, matchCol)
    global GameFinished
    if matchRow == Match or matchCol == Match:
        GameFinished = True
    

def SwapThisPlayer():
    global ThisPlayer
    if ThisPlayer == Players[1]:
        ThisPlayer = Players[2]
    else:
        ThisPlayer = Players[1]


def run():
    InitialiseBoard()
    SetUpGame()
    OutputBoard()
    while GameFinished == False:
        ThisPlayerMakesMove()
        OutputBoard()
        CheckifThisPlayerHasWon()
        if GameFinished == False:
          SwapThisPlayer()

run()
