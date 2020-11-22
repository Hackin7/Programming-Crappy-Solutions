

def bubblesort(Admissions):
    comparisons = 0
    UpperBound = len(Admissions)
    NoSwaps = False
    while NoSwaps == False:
        NoSwaps = True
        for Posn in range(0, UpperBound-1):
            comparisons += 1
            if Admissions[Posn] > Admissions[Posn + 1]:
                # swap
                NoSwaps = False
                Temp = Admissions[Posn]
                Admissions[Posn] = Admissions[Posn + 1]
                Admissions[Posn + 1] = Temp
    print(f"Bubble Sort Comparisons Made: {comparisons}")

def insertionSort(lis):
    comparisons = 0
    for i in range(1, len(lis)):
        pivot = lis[i]
        j = i-1
        while lis[j] > pivot and j >= 0:
            comparisons += 1
            #Shift Rightwards
            lis[j+1] = lis[j]
            j -= 1
        comparisons += 1 #Comparison where it exits loop
        lis[j+1] = pivot
    print(f"Insertion Sort Comparisons Made: {comparisons}")

###Sorting Driver Program###########################   
#import random
#lis = [random.randint(0,10) for i in range(10)]
#print(lis)
#bubblesort(lis)
#print(lis)
#####################################################
data = []
def readData(dataFile):
    global data
    dataFile.seek(0)
    data = dataFile.read().split()
    for i in range(len(data)):
        data[i] = int(data[i])
    print("Data Read!")
    print(data)
def menu():
    dataFile = open("ADMISSIONS-DATA.TXT")
    userin = "" #User Input
    while userin != "4":
        print("""Menu
        1. Read F=file Data
        2. Bubble Sort
        3. Insertion Sort""")
        userin = input("Option: ")
        if userin == "1":
            readData(dataFile)
        elif userin == "2":
            newdata = list(tuple(data))
            bubblesort(newdata)
            print(newdata)
        elif userin == "3":
            newdata = list(tuple(data))
            insertionSort(newdata)
            print(newdata)
    dataFile.close()

menu()
