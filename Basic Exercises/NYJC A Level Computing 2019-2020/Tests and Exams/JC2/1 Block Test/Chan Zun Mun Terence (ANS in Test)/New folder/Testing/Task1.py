#Task 1.1
letter = input("Enter a single letter: ")
while not(len(letter) == 1 and 65 <= ord(letter) <= 122):
    print("The letter entered is invalid")
    letter = input("Enter a single letter: ")
print(letter)

#Task 1.2

###Input#############################################################
letter = input("Enter a single letter: ")
while not(len(letter) == 1 and 65 <= ord(letter) <= 122): # Validation
    print("The letter entered is invalid")
    letter = input("Enter a single letter: ")


message = "Enter the number base (between 10 to 15 exclusive): "
numberBase = int(input(message))
while not(10 < numberBase < 15): # Validation
    print("The base input in is invalid")
    numberBase = int(input(message))

###Processing#########################################################

def convertBase(val, base):
    output = ""
    # Correct Digits for the values (retrieve by array index)
    mapping = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']
    while val > base:
        digit = mapping[val // base]
        output+=digit
        val %= base # Get the remainder
    #For the last digit
    digit = mapping[val // base]
    output+=digit
    return output

###Output#############################################################
print(f"{'Letter':20}{letter}")
print(f"{'Denary':20}{ord(letter)}")
print(f"{'Number Base '+ str(numberBase):20}{convertBase(ord(letter),numberBase)}")
    
#Task 1.3

menuDisplay = """\
1. Enter a letter
2. Convert to Denary
3. Convert to Base 11
4. Convert to Base 12
5. Convert to Base 13
6. Convert to Base 14
7. End\
"""
def convertBase(val, base):
    output = ""
    # Correct Digits for the values (retrieve by array index)
    mapping = ['0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F']
    while val >= base:
        digit = mapping[val // base]
        output+=digit
        val %= base # Get the remainder
    #For the last digit
    digit = mapping[val]
    output+=digit
    return output

letter = ''
end = False #Condition whether to end the program
while not end:
    option = int(input(menuDisplay))
    if option == 1:
        letter = input("Enter a single letter: ")
        while not(len(letter) == 1 and 65 <= ord(letter) <= 122): # Validation
            print("The letter entered is invalid")
            letter = input("Enter a single letter: ")
    elif option == 2:
        val = ord(letter)
        print(val)
    elif option == 3:
        # Convert ASCII value of letter to number base
        val = convertBase(ord(letter),11)
        print(val)
    elif option == 4:
        # Convert ASCII value of letter to number base
        val = convertBase(ord(letter),12)
        print(val)
    elif option == 5:
        # Convert ASCII value of letter to number base
        val = convertBase(ord(letter),13)
        print(val)
    elif option == 6:
        # Convert ASCII value of letter to number base
        val = convertBase(ord(letter),14)
        print(val)
    elif option == 7:
        end = True
