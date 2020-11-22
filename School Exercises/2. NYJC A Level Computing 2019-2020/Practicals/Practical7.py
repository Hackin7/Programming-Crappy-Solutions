# Practical 7 Strings

###Q1##################################################################
stringGiven = input("Input: ")
if len(stringGiven) < 2:
    print()
else:
    print(stringGiven[0:2]+stringGiven[-2:])
    
###Q2##################################################################
inputString = input("Input String: ")
if len(inputString) < 3:
    print(inputString)
elif inputString[-3:] == "ing":
    print(inputString+"ly")
else:
    print(inputString+"ing")

###Q3##################################################################
def caesarEncryption(text,rightShift):
    encryptedText = ""
    for letter in text:
        asciiValue = ord(letter) #Change to ascii value
        asciiValue += rightShift #Shift Value
        while asciiValue < 32: #Lower range 
            asciiValue = asciiValue + 94 #Loop backwards
        while asciiValue > 126: #Upper range 
            asciiValue = asciiValue - 94 #Loop to front
        
        # #Check Case
        # if letter.isupper(): #Upper Case
            # while asciiValue < 65: #Lower range 
                # asciiValue = asciiValue + 26 #Loop backwards from Z
            # while asciiValue > 90: #Upper range 
                # asciiValue = asciiValue - 26 #Loop to A
        # elif letter.islower(): #Lower Case
            # while asciiValue < 97: #Lower range 
                # asciiValue = asciiValue + 26 #Loop backwards from z
            # while asciiValue > 122: #Upper range 
                # asciiValue = asciiValue - 26 #Loop to a
        # #Ignore non letters #asciiValue -= rightShift
        
        encryptedText += chr(asciiValue)
    return encryptedText

toEncrypt = input("Enter String to encrypt with a Caesar cipher:")
leftShift = int(input("Enter right shift or letters (or negative for left shift of letters): "))
print("Encrypted text is",caesarEncryption(toEncrypt,leftShift))

###Q4##################################################################
givenString = input("Input String: ")
string1 = "" #Only has characters in givenString that appear once
string2 = "" #Only has characters in givenString that appear more than once
for character in givenString:
    if givenString.count(character) == 1: #Character only appear once
        string1 += character
    else:
        #if character not in string2: #If do not want duplicates of letters
        string2 += character
        
print("String 1 is", string1)
print("String 2 is", string2)
        
###Q5##################################################################
givenString = input("Input String: ")

total = 0 #Sum of all Digits
noDigits = 0 #Number of Digits
for character in givenString:
    if character.isdigit():
        total += int(character) 
        noDigits += 1
        
print("Sum of the digits in the string is", total)
if noDigits == 0: #Zero Division Check
    print("No digits to calculate average of")
else:
    print("Average of the digits in the string is", total/noDigits) #Find Average

###Q6##################################################################
def translateToPigLatin(text):
    consonents = "bcdfghjklmnpqrstvwxyz"
    vowels = "aeiou"
    if text == "": #Nothing to translate
        return text
        
    elif text[0] in consonents: #First letter in text is consonent
        for char in range(len(text)): #Find non-consonent
            if text[char] not in consonents:
                return text[char:]+text[:char]+"ay" 
        return text+"ay" #If all consonents
        
    else: #First letter in text is vowel
        return text + "way"
    
text = input("Input English word to translate to Pig Latin: ")
print("The Pig Latin translation is",translateToPigLatin(text))

###Q7##################################################################
# Get index of nearest non whitespace
def nearestNonWhitespace(text, index, step = 1):
    index -= 1 
    while 0 <= index < len(text): #Loop through indexes
        if text[index] != " ":
            return index
        index += step
    return -1 #Cannot Find

#To check if + - is operator or otherwise
def isOperator(text, index): 
    charBefore = nearestNonWhitespace(text, index, -1)
    if charBefore == -1: #If reached front of text
        return False
    return text[charBefore].isdigit() or text[charBefore] == ")"

# Find nearby digits in a text and group them up to a number
def findNearNumbers(text, char):
    number = text[char]
    stop = False
    char += 1 #Move to next character
    while char < len(text) and not stop:
        if text[char] == " ":
            char += 1
        elif (not text[char].isdigit()): #end of number
            stop = True
            char -= 1 
        elif text[char].isdigit():
            number += text[char] #Add to number
            char += 1 
    return number,char
    
def tokenising(text):
    additionSubtraction = ["+","-"]
    operators = ["*","/","^"]
    parenthesis = ["(",")"]
    listOfTokens = []

    char = 0 #Character index
    while char < len(text): #Loop Through all characters
        ###Operator and Parenthesis#####################################
        if text[char] in operators or text[char] in parenthesis: 
            listOfTokens.append(text[char])
            
        ###For numbers##################################################
        elif text[char].isdigit(): 
            #Find all nearby numbers and concatnate together
            info = findNearNumbers(text, char) 
            char = info[1]
            listOfTokens.append(info[0])
            
        ###Addition Subtraction Operator################################
        elif text[char] in additionSubtraction:
            
            if isOperator(text, char): 
                listOfTokens.append(text[char])
                
            else: #Part of number token
                #Find all nearby numbers and concatnate together
                info = findNearNumbers(text, char)
                char = info[1]
                listOfTokens.append(info[0])
                
        ################################################################
        char += 1 #Move on to next character
    return listOfTokens

expression = input("Enter Mathematical Expression: ")
print("List of tokens are",tokenising(expression))
            
        
