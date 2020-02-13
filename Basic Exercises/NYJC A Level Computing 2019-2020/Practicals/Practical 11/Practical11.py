###Q1#############################################################
###File Input################
def fileInput():
    try:
        filename = input("Enter filename to open: ")
        f = open(filename)
        data = f.read()
        f.close()
    except:
        print(f"File {filename} unable to be opened")
        return fileInput()
    return data
data = fileInput()
###########################
#data = "hello Hi CRAPPYCRAB #hi12345\nhello" # Test Data

words = data.split()
maxLength = 0
indexOfWord = 0
for i in range(len(words)):
    if len(words[i]) > maxLength:
        indexOfWord = i
        maxLength = len(words[i])
print(f"The longest word is {words[indexOfWord]} \
being {maxLength} characters long")

###Q2#############################################################
###File Input################
def fileInput():
    try:
        filename = input("Enter filename to open: ")
        f = open(filename)
        data = f.read()
        f.close()
    except:
        print(f"File {filename} unable to be opened")
        return fileInput()
    return data
dataUsed = fileInput()
###########################

    
# Remove Space, Punctuation, Numbers
unwantedCharacters = [" ",".",",","!","?",":",";",\
                      "1","2","3","4","5","6","7","8","9","0"]
for c in unwantedCharacters:
    dataUsed = dataUsed.replace(c,"")
dataUsed = dataUsed.lower()

# Dictionary of Frequency of characters
characterCounter = {}
for i in dataUsed:
    # If Character Not counted yet
    if characterCounter.get(i) == None:
        #1 instance of that character
        characterCounter[i] = 1 
    else:
        #Increment Counter
        characterCounter[i] += 1

# Output
print("Character Frequency Breakdown")
for character, counter in characterCounter.items():
    print(f"There are {counter} '{character}'")
###Q3#############################################################
###File Input################
def fileInput():
    try:
        filename = input("Enter filename to open: ")
        f = open(filename)
        data = f.read()
        f.close()
    except:
        print(f"File {filename} unable to be opened")
        return fileInput()
    return data
dataUsed = fileInput()
###########################

lines = dataUsed.split('\n')
for l in range(len(lines)):
    index = 0
    while index < len(lines[l]):
        if lines[l][index] == "#":
            lines[l] = lines[l][:index] #Remove all characters after #, including #
            index = len(lines[l]) #Exit loop
        index += 1 #Increment counter
        
###Output###################
outputfilename = input("Enter Output File Name: ")
output = open(outputfilename, "w")
for line in lines:
    output.write(line + "\n")
output.close()
############################
        
###Q4#############################################################
###File Input################
def fileInput():
    try:
        filename = input("Enter filename to open: ")
        f = open(filename)
        data = f.read()
        f.close()
    except:
        print(f"File {filename} unable to be opened")
        return fileInput()
    return data
dataUsed = fileInput()
print("For Sensitive Words")
sensitiveWordsData = fileInput()
sensitiveWords = sensitiveWordsData.split("\n")
for w in range(len(sensitiveWords)):
    sensitiveWords[w] = sensitiveWords[w].rstrip()
    sensitiveWords[w] = sensitiveWords[w].lstrip()
###########################
def possibleCapitalisations(word):
    n = len(word)
    noPermutations = 2**n
    permutations = []
    for i in range(noPermutations):
        newWord = list(word)
        for c in range(len(newWord)):
            #Boolean Value for character
            if (i // 2**c) % 2:
                newWord[c] = newWord[c].upper()
            else:
                newWord[c] = newWord[c].lower()
        permutation = ""
        for character in newWord:
            permutation += character
        #print(i, permutation)
        permutations.append(permutation)
    return permutations

#sensitiveWords = ["Exam", "Hello", "but"]
for word in sensitiveWords:
    for permutation in possibleCapitalisations(word):
        dataUsed = dataUsed.replace(permutation,"*")

###Output###################
outputfilename = "newfileQ4.txt"#input("Enter Output File Name: ")
output = open(outputfilename, "w")
output.write(dataUsed)
output.close()
############################

###Q5#############################################################
###File Input################
def fileInput():
    try:
        filename = input("Enter filename to open: ")
        f = open(filename)
        data = f.read()
        f.close()
    except:
        print(f"File {filename} unable to be opened")
        return fileInput()
    return data
dataUsed = fileInput()
###########################
##Ensure Proper Paragraphing################
dataUsed = dataUsed.replace("\n\n", chr(0))
dataUsed = dataUsed.replace("\n"," ")
dataUsed = dataUsed.replace(chr(0),"\n")
words = dataUsed.split(" ")
outputData = ""

prevLine = ""
line = ""
for w in words:
    prevLine = line
    ###Ignore empty characters##########
    if w != "":
        line += w + " "    
    ###Add Line##########################
    #print("reached:", line) 
    if len(line) >= 50 or ("\n" in line and "\n" != line[0]):
        outputData += prevLine[:-1]+"\n"
        ###Clear#########################
        prevLine = ""
        line = w + " "
###Put Last line###########################
outputData += line
print(outputData)

