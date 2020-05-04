#!/usr/bin/env python

###Q1###################################################################
class Rectangle:
    def __init__(self, length = 1.0, width = 1.0):
        self.setLength(length)
        self.setWidth(width)

    #Getter Methods
    def getLength(self):
        return self.__length
    def getWidth(self):
        return self.__width
    
    def getPerimeter(self):
        return 2 * (self.__length + self.__width)
    def getArea(self):
        return self.__length * self.__width

    #Setter Methods
    def setLength(self, length):
        if (type(length) == float or type(length) == int) and\
        0.0 < length < 20.0:
            self.__length = float(length)
    def setWidth(self, width):
        if (type(width) == float or type(width) == int)and\
        0.0 < width < 20.0:
            self.__width = float(width)

# Driver Program
def showClass(rect):
    print("Length:",rect.getLength())
    print("Width:",rect.getWidth())
    print("Perimeter:",rect.getPerimeter())
    print("Area:",rect.getArea())
def setValues(rect, l, w):
    print("Set Length to be", l)
    rect.setLength(l)
    print("Set Width to be", w)
    rect.setWidth(w)
def drive(testData = [(2,3), (4,5)]):
    print("###########################################")
    print("Initialisation of Question 1 Driver")
    rect = Rectangle()
    showClass(rect)
    print()
    for l, w in testData:
        setValues(rect, l, w)
        showClass(rect)
        print()
    print()
drive()
###Q2###################################################################
class Rectangle:    
    def __init__(self, x1=1.0, y1=1.0, x2=1.0, y2=1.0):
        #Upper left hand coordinates
        self.setUpperCoordinates(x1, y1)
        ##Lower Right hand coordinates
        self.setLowerCoordinates(x2, y2)
        
    #Getter Functions
    def getXSide(self):
        return abs(self.x2-self.x1)
    def getYSide(self):
        return abs(self.y1-self.y2)
        
    def getLength(self):
        side1 = self.getXSide()
        side2 = self.getYSide()
        if side1 > side2:
            return side1
        else:
            return side2
    def getWidth(self):
        side1 = self.getXSide()
        side2 = self.getYSide()
        if side1 > side2:
            return side2
        else:
            return side1
        
    def getPerimeter(self):
        return 2 * (self.getLength() + self.getWidth())
    def getArea(self):
        return self.getLength() * self.getWidth()

    #Predicate Methods
    def isSquare(self):
        return self.getXSide() == self.getYSide()

    #Setter Methods
    def setUpperCoordinates(self, x, y):
        if 0 < x < 20.0 and 0 < y < 20.0:
            self.x1 = x
            self.y1 = y
    def setLowerCoordinates(self, x, y):
        if 0 < x < 20.0 and 0 < y < 20.0:
            self.x2 = x
            self.y2 = y
             
# Driver Program
def showClass(rect):
    print("Length:",rect.getLength())
    print("Width:",rect.getWidth())
    print("Perimeter:",rect.getPerimeter())
    print("Area:",rect.getArea())
    print("isSquare:",rect.isSquare())
def setValues(rect, x1,y1,x2,y2):
    print("Set Upper Coordinates to be", x1, y1)
    rect.setUpperCoordinates(x1, y1)
    print("Set Lower Coordinates to be", x2, y2)
    rect.setLowerCoordinates(x2, y2)
def drive(testData = [(2,3,4,5), (4,5,6,7)]):
    print("###########################################")
    print("Initialisation of Question 2 Driver")
    rect = Rectangle()
    showClass(rect)
    print()
    for x1, y1, x2, y2 in testData:
        setValues(rect, x1, y1, x2, y2)
        showClass(rect)
        print()
    print()
drive()
###Q3###################################################################
class Account:    
    def __init__(self, id=0, balance = 100.0, annualInterestRate=0.0):
        self.setID(id)
        self.setBalance(balance)
        self.setAnnualInterestRate(annualInterestRate)
    
    #Accessor Methods
    def getID(self):
        return self.__id
    def getBalance(self):
        return self.__balance
    def getAnnualInterestRate(self):
        return self.__annualInterestRate
        
    #Mutator Methods
    def setID(self, val):
        self.__id = val
    def setBalance(self, val):
        self.__balance = val
    def setAnnualInterestRate(self, val):
        self.__annualInterestRate = val
        
    #Other Methods
    def getMonthlyInterestRate(self):
        monthlyInterestRate = self.__annualInterestRate / 12
        return  monthlyInterestRate

    def getMonthlyInterest(self):
        return self.__balance * self.getMonthlyInterestRate()

    def withdraw(self, withdrawVal):
        self.__balance -= withdrawVal

    def deposit(self, depositVal):
        self.__balance -= depositVal

# Driver Program
print("###########################################")
print("Initialisation of Question 3 Driver")
account = Account(id=1122, \
                  balance = 20000.0, \
                  annualInterestRate=4.5)
account.withdraw(2500)
account.deposit(3000)
print(account.getID())
print(account.getBalance())
print(account.getMonthlyInterestRate())
print(account.getMonthlyInterest())
print()
###Q4###################################################################
class TicTacToe:
    def __init__(self, player1Controller=None, player2Controller=None):
        self.player1 = 1
        self.player2 = 2
        # Use default controllers if no controllers entered in 
        if player1Controller != None:
            self.player1Controller = player1Controller
        else:
            self.player1Controller = self.playerInput
        if player2Controller != None:
            self.player2Controller = player2Controller
        else:
            self.player2Controller = self.playerInput
        
        self.empty = 0
        #First index for y, second index for x
        self.board = [[self.empty,self.empty,self.empty],
                      [self.empty,self.empty,self.empty],
                      [self.empty,self.empty,self.empty]]
        self.game()
        
    def showBoard(self):
        for i in self.board: #Rows
            for j in i: #Columns
                if j == self.player1:
                    symbol = 'X'
                elif j == self.player2:
                    symbol = 'O'
                else:
                    symbol = '_'
                print(symbol+' ', end='')
            print()
            
    #Getter Methods
    def getWidth(self):
        return len(self.board[0])
    def getHeight(self):
        return len(self.board)
    def coordinatesInRange(self, x, y):
        return 0 <= x <= self.getWidth()-1 and\
               0 <= y <= self.getHeight()-1 
               
    #Player Movements
    def isValidMove(self, x, y):
        if self.coordinatesInRange(x,y):
            if self.board[y][x] == self.empty:
                return True
        return False
    def firstPlayerMove(self, x, y):
        if self.isValidMove(x,y):
            self.board[y][x] = self.player1
    def secondPlayerMove(self, x, y):
        if self.isValidMove(x,y):
            self.board[y][x] = self.player2
    
    #Matching a straight line of symbols 
    def horizontalMatch(self):
        width = self.getWidth()
        height = self.getHeight()
        for i in range(width): ###For all Columns####################
            counter = 1
            for j in range(height - 1): ###Row#####################
                ###Count Matches##################################
                if self.board[j][i] == self.board[j-1][i] and \
                self.board[j][i] != self.empty:
                    counter += 1
                ##################################################
            if counter == height:###Get Player who got the match####
                return self.board[j][i]  
        return None #No Match
        
    def verticalMatch(self):
        width = self.getWidth()
        height = self.getHeight()
        for j in range(height): ###For all Columns####################
            counter = 1
            for i in range(width - 1): ###Columns#################
                ###Count Matches##################################
                if self.board[j][i] == self.board[j][i-1] and \
                self.board[j][i] != self.empty:
                    counter += 1
                ##################################################
            if counter == width:###Get Player who got the match####
                return self.board[j][i] 
        return None #No Match
        
    def diagonalRMatch(self):
        width = self.getWidth()
        height = self.getHeight()
        ###Number of areas to check#############################
        if width < height:
            side = width
        else:
            side = height
        ###Index################################################
        i = 0 #x index
        j = 0 #y index
        counter = 1
        for m in range(side-1):
            ###South East#####################################
            i += 1
            j += 1
            ###Count Matches##################################
            if self.board[j][i] == self.board[j-1][i-1] and\
            self.board[j][i] != self.empty:
                counter += 1
            ##################################################
        if counter == side:###Get Player who got the match####
            return self.board[j][i] 
            
    def diagonalLMatch(self):
        width = self.getWidth()
        height = self.getHeight()
        
        ###Number of areas to check#############################
        if width < height:
            side = width
        else:
            side = height
        ###Index################################################
        i = side-1 #x index
        j = 0 #y index
        counter = 1

        for m in range(side-1):
            ###South West###################################
            i -= 1 
            j += 1
            ###Count Matches##################################
            if self.board[j][i] == self.board[j-1][i+1] and\
            self.board[j][i] != self.empty: #Previous element
                counter += 1
            ##################################################
        if counter == side:###Get Player who got the match####
            return self.board[j][i] 
            
    def matched(self):
        horizontal = self.horizontalMatch()
        if horizontal != None:
            return horizontal
        
        vertical = self.verticalMatch()
        if vertical != None:
            return vertical
            
        diagonalR = self.diagonalRMatch()
        if diagonalR != None:
            return diagonalR
        
        diagonalL = self.diagonalLMatch()
        if diagonalL != None:
            return diagonalL
    
    # Game End States        
    def draw(self): ###Check if there is empty areas##################
        for column in self.board:
            for item in column:
                if item == self.empty:
                    return False
        return True
        
    def playerWon(self): ###Check if matched##########################
        if self.matched() == self.player1:
            return "Player 1 Won!"
        elif self.matched() == self.player2:
            return "Player 2 Won!"
        elif self.draw():
            return "Draw"
        else:
            return "An Unknown player '"+self.matched()+"' won... I'm confused"
    
    # Default Player Input and Controller
    def getMoves(self):
        moves = []
        for i in range(self.getWidth()):
            for j in range(self.getHeight()):
                if self.board[j][i] == self.empty:
                    moves.append((i+1,j+1))
        return moves
        
    def playerInput(self, playerNo=1, checkValid=isValidMove, \
                    board=[], noMoves=[]):
        coordinates = input("Enter Coordinates for the player "+\
                            str(playerNo)+" move: ").split()
        ###Validation###################################################
        while not checkValid(int(coordinates[0])-1,\
                                   int(coordinates[1])-1):
            print("The coordinates were not valid")
            coordinates = input("Enter Coordinates for the player "+\
                                str(playerNo)+" move: ").split()
        ##############################################################
        return coordinates

    ##Run this to start
    def game(self):
        # Descriptive Text
        print("Tic Tac Toe! Totally not hardcoding!")
        print("Enter coordinates in the format 'x y' later.")
        print("x is the horizontal position (1-3), y is the vertical position(1-3)")
        
        ###Game Play#####################################################
        currentPlayer = int(input("Which Player should start first, 1 or 2: "))
        while not (self.matched() or self.draw()): #Haven't reach end state
            ###Game Board###################################################
            print("Current Board")
            self.showBoard()
            ###Player Controller#################################################
            if currentPlayer == 1:
                coordinates = self.player1Controller(playerNo = currentPlayer,\
                                           board = self.board, noMoves=self.getMoves(),\
                                           checkValid = self.isValidMove)
                self.firstPlayerMove(int(coordinates[0])-1,\
                                      int(coordinates[1])-1)
                currentPlayer = 2 #Switch player
            elif currentPlayer == 2:
                coordinates = self.player2Controller(playerNo = currentPlayer,\
                                           board=self.board, noMoves=self.getMoves(),\
                                           checkValid = self.isValidMove)
                self.secondPlayerMove(int(coordinates[0])-1,\
                                      int(coordinates[1])-1)
                currentPlayer = 1 #Switch player
            ##########################################################################
        # Show End State
        self.showBoard()
        print(self.playerWon())

import random
def randomPlay(playerNo=1, checkValid=lambda:None, board=[], noMoves=[]):
    index = int(len(noMoves)*random.random()) #Choose a random move
    #print(noMoves, index, noMoves[index])
    return noMoves[index]
tic = TicTacToe(player2Controller = randomPlay)
