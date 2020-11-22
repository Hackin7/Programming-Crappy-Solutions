# Practical 5
## Q1 ######################################################################################################
listOf20Numbers = []
for i in range(20): #20 Numbers
    numEntered = int(input(f"Enter in the {i+1}/20 numbers: "))
    if numEntered not in listOf20Numbers: #Check if it is duplicate
        print(numEntered)
        listOf20Numbers.append(numEntered) #Add to list
  
## Q2 ######################################################################################################
listOfNums = []
numToInsert = 1
while numToInsert != 0: #sentinel value
    numToInsert = int(input("Enter number (0 to exit):"))
    if numToInsert != 0: #If not exiting
        listOfNums += [numToInsert] #Append to list

listOfNums.sort()
print("List of Nums Sorted:")
for i in range(len(listOfNums)):
    print(listOfNums[i])

## Q3 ######################################################################################################
negativeNumbers = []
zeros = []
positiveNumbers = []

enteredValue = input("Enter num (blank to exit): ")
while enteredValue != "": #Blank to exit
    numToInsert = int(enteredValue) 
    if numToInsert < 0: #If negative
        negativeNumbers.append(numToInsert)
    elif numToInsert > 0: #If positive
        positiveNumbers.append(numToInsert)
    else: #If zero
        zeros.append(numToInsert)
    
    enteredValue = input("Enter num (blank to exit): ")

print("List of Negative Nums:")
for i in negativeNumbers:
    print(i)
print("List of Zeros:")
for i in zeros:
    print(i)
print("List of Positive Nums:")
for i in positiveNumbers:
    print(i)

## Q4 ######################################################################################################
def strListFormat(strList):
        data = ""
        i = len(strList)-1
    #for i in range(len(strList)):
        for j in range(len(strList[:i+1])):
            data += strList[j]
            if j == i-1: #Second Last element
                data += " and "
            elif j == i: #Last Element
                data += "\n"
            else: #Elements in between
                data += ", "
        return data

listOfStrings = []
strToInsert = input("Enter string (blank to exit):")
while strToInsert != "": # blank input to exit
    listOfStrings += [strToInsert] #append to list
    strToInsert = input("Enter string (blank to exit):")
                            
print(strListFormat(listOfStrings))


## Q5 ######################################################################################################
def countRange(listInput, minValue, maxValue):
    count = 0
    for i in listInput: #Check all list items
        if minValue <= i < maxValue: # within min and max value
            count += 1
    return count

import random
def generateIntTest(lower, upper, listLength):
    #Generate random values
    minValue = random.randint(lower, upper)
    maxValue = random.randint(lower, upper)
    while minValue == maxValue: #Differentiate values so can test
        maxValue = random.randint(lower, upper)        
    if not(minValue < maxValue):
        placeholder = minValue
        minValue = maxValue
        maxValue = placeholder
    ranListLength = random.randint(1,listLength) 
    testList = [random.randint(lower, upper) for i in range(ranListLength)]

    print("Testing List of Integers:\n", testList)
    print(f"Minimum Value:{minValue}, Maximum Value: {maxValue}")

    count = countRange(testList, minValue, maxValue)
    print(f"Number of items between {minValue} and {maxValue} is {count}")

def randomFloat(lower, upper):
    return round(lower + random.random() * (upper-lower),2)

def generateFloatTest(lower, upper, listLength):
    minValue = randomFloat(lower, upper)
    maxValue = randomFloat(lower, upper)
    while minValue == maxValue:
        maxValue = random.randint(lower, upper)        
    if not(minValue < maxValue):
        placeholder = minValue
        minValue = maxValue
        maxValue = placeholder
        
    ranListLength = random.randint(1,listLength)
    testList = [randomFloat(lower, upper)\
                for i in range(ranListLength)]

    print("Testing List of Floating Point Numbers:\n", testList)
    print(f"Minimum Value:{minValue}, Maximum Value: {maxValue}")

    count = countRange(testList, minValue, maxValue)
    print(f"Number of items between {minValue} and {maxValue} is {count}")

generateIntTest(1,9,10)
generateFloatTest(1,9,10)

## Q6 ######################################################################################################
sales = []#[[0 for product in range(4)]for person in range(5)]
for person in range(5): # 5 People 
    personSales = [] 
    for product in range(4):#4 zeros in a person's Sales
        personSales.append(0) 
    sales.append(personSales)
    
# Add slipData to Sales table
def dataEntry(slipData):
    salesPerson, productNo, noProductSold = slipData
    sales[salesPerson-1][productNo-1] += noProductSold

### Slip Input
def inputSlip():
    salesPerson = int(input("Enter salesperson Number from 1-5 (0 to exit):"))
    while not (0 <= salesPerson <= 5): #Validation
        print("Salesperson number entered in doesnt exist")
        salesPerson = int(input("Enter salesperson Number from 1-5 (0 to exit):"))

    if salesPerson == 0: #Exit Program
        return 0,0,0
    
    productNo = int(input("Enter the product number from 1-4:"))
    while not (1 <= productNo <= 4): #Validation
        print("Product number entered in doesnt exist")
        productNo = int(input("Enter the product number from 1-4:"))
    
    noProductSold = int(input("Enter the number of that product sold:"))
    return salesPerson, productNo, noProductSold

print("For a slip:")
slipData = inputSlip()
while slipData[0] != 0:
    dataEntry(slipData)
    print("For another slip:")
    slipData = inputSlip()

### Table ###
### Header
print(f"{'Products':<10s}", end="")
for i in range(len(sales)): #Person
    print(f"{'Person ' + str(i+1):<10s}", end="")
print("Sum of Products")
### Data
for j in range(len(sales[0])): #Products
    print(f"{j+1:<10d}", end="")
    sumProduct = 0 #Find the sum of sales of the product
    for i in range(len(sales)): #People
        print(f"{sales[i][j]:<10d}", end="")
        sumProduct += sales[i][j] 
    print(f"{sumProduct:<10d}") # Cross Total
    
def sum(toSum):
    total = 0
    for i in toSum:
        total +=i
    return total
###Bottom Cross Total
print(f"{'Total':<10s}", end="")
for i in range(len(sales)): #Person
    print(f"{sum(sales[i]):<10d}", end="")

print()
## Q7 ######################################################################################################
numberList = []#[1 for i in range(1000)]
for i in range(1000): #First 1000 numbers including 0
    numberList.append(1)
for i in range(2, len(numberList)):
    if numberList[i] == 1:
        for j in range(i*2, len(numberList), i): #For all multiples
            numberList[j] = 0
                
print("The prime numbers are:")
for i in range(2, len(numberList)):
    if numberList[i] == 1:
        print(i)
        
