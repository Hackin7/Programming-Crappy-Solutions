#!/usr/bin/env python

###Manipulation and handling of text in the file########################
class File:
    def __init__(self, name):
        self.file = open(name, "r+")
    def read(self):
        self.file.seek(0)
        data = self.file.read()
        return data

    def readRecords(self):
        data = self.read()
        records = data.split("\n")
        for i in range(len(records)):
            if records[i] != "":
                records[i] = records[i].split(",")
        while "" in records:
            records.remove("")
        return records
    def clear(self):
        self.file.truncate(0)
    def write(self, data):
        self.file.seek(0)
        self.file.write(data)
        self.file.flush()
        
    def writeExtra(self, addData):
        data = self.read()
        if len(data) >= 1:
            if data[-1] != "\n":
                data = data+"\n"
        self.write(data+addData)
        
    def writeRecord(self, record):
        add = ""
        for i in range(len(record)):
            add += str(record[i])
            if i != len(record)-1:
                add+=","
        self.write(add+"\n")
    def addRecord(self, record):
        add = ""
        for i in range(len(record)):
            add += str(record[i])
            if i != len(record)-1:
                add+=","
        self.writeExtra(add)

    def close(self):
        self.file.close()
###Validation and Processing of Data####################################
class Data:
    def isNRIC(string):
        return not (len(string) == 9 and \
        string[0].isalpha() and string[-1].isalpha() and \
        string[1:-1].isdigit())
    def isDate(string):
        if len(string) != 8 or not string.isdigit():
            return False
        day = int(string[0:2])
        month = int(string[2:4])
        year = int(string[4:])
        return 1 <= day <= 31 and 1 <= month <= 12
    def isTime(string):
        if len(string)!=4 or not string.isdigit():
            return False
        hour = int(string[0:2])
        minute = int(string[2:4])
        return 0 <= hour <= 23 and 0 <= minute < 60
    def isMoney(string):
        return string[1:].replace(".","").isdigit() and \
               (string[0] == "-" or string[0].isdigit()) and \
               string.count(".") <= 1
    def getDate(string):
        day = int(string[0:2])
        month = int(string[2:4])
        year = int(string[4:])
        return f"{day:02d}/{month:02d}/{year:04d}"
    def getTime(string):
        hour = int(string[0:2])
        minute = int(string[2:4])
        return f"{hour:02d}:{minute:02d}"
    def getMoney(string):
        money = str(abs(float(string)))
        if string[0] == "-":
            sign = "-"
        else: sign = ""
        return sign+"$"+money
    
bankTransactions = File("BankTransactions.txt")
bankCustMasterFile = File("BankCustMasterFile.txt")
archived = File("Archived.txt")
###Menu Code############################################################
def DisplayMenu():
    option = 0
    while option != "Q":
        print("""Menu:
    1. Add Bank Transaction
    2. Update All Transactions
    3. Query Balance by NRIC
    4. Display all Transactions by NRIC
    5. ‘Q’ to quit""")
        option = input("Option: ")
        if option == "1":
            addTransaction()
        elif option == "2":
            updateTransactions()
        elif option == "3":
            queryBalance()
        elif option == "4":
            displayAllTrans()

###Sorting####################################################
def insertionSort(lis,compare):
    for i in range(1, len(lis)):#First is sorted
        pivot = lis[i]
        j = i-1
        while j >= 0 and compare(lis[j],pivot):
           lis[j+1] = lis[j] #Shift up list
           j -= 1
        lis[j+1] = pivot
def compareRecord(current, pivot):
    return not(current[0] < pivot[0]) #Sort by Ascending NRIC

###Part 1#############################################################
def addTransaction():
    ###Input & Validdation############################################
    nric = input("Enter your NRIC: ")
    while Data.isNRIC(nric):
        print("The NRIC input in was invalid")
        nric = input("Enter your NRIC: ")
        
    date = input("Enter the date in the format ddmmyyyy: ")
    while not Data.isDate(date):
        print("The NRIC input in was invalid")
        date = input("Enter the date in the format ddmmyyyy: ")  
    
    time = input("Enter the Time in the format hhmm (24 hour): ")
    while not Data.isTime(time):
        print("The Time input in was invalid")
        time = input("Enter the Time in the format hhmm (24 hour): ")
    
    transAmt = input("Enter the Transaction Amount:")
    while not (Data.isMoney(transAmt)):
        print("The Amount input in was invalid")
        transAmt = input("Enter the Transaction Amount:")
    ###################################################################
    bankTransactions.addRecord([nric, date, time, transAmt]);
    print("Update Successful")

###Part 2#############################################################
def updateTransactions():
    ###Archive Transaction Records####
    #archived = open("Archived.txt", "a+")
    #archived.write(bankTransactions.read()[24:]+"\n")
    #archived.close()
    
    
    transactions = bankTransactions.readRecords()
    for transaction in transactions[1:]:
        archived.addRecord(transaction)
        
    insertionSort(transactions, compareRecord)
    
    bankCust = bankCustMasterFile.readRecords()
    bankCustHeader = bankCust[0]
    bankCust = bankCust[1:]
    insertionSort(bankCust, compareRecord)
    
    cust = 0
    for transaction in transactions[1:]:
        while transaction[0] != bankCust[cust][0]: #NRICs are the same
            cust += 1            
            if cust >= len(bankCust):
                raise Exception("Error, NRIC not available")
                cust = len(bankCust)#Stay at that index
        bankCust[cust][3] = str(float(bankCust[cust][3]) + float(transaction[3]))
        
    bankCustMasterFile.clear()
    bankCustMasterFile.addRecord(bankCustHeader)
    for cust in range(len(bankCust)):
        bankCustMasterFile.addRecord(bankCust[cust])
        
    bankTransactions.clear()
    bankTransactions.writeRecord(transactions[0])#Header
    print("Update Successful")
    
###Part 3#############################################################
def queryBalance():
    nric = input("Enter your NRIC: ")
    while Data.isNRIC(nric):
        print("The NRIC input in was invalid")
        nric = input("Enter your NRIC: ")
    records = bankCustMasterFile.readRecords()
    counter = 0
    found = False
    while counter < len(records) and not found:
        #print(records[counter])
        if records[counter][0] == nric:
            found = True #Exit out of loop
        else:
            counter += 1
    if counter >= len(records):
        print("NRIC input cannot be found in records")
    else:
        output = f"{records[counter][1]} has ${records[counter][3]} in account."
        print(output)
    
###Part 4#############################################################
def displayAllTrans():
    nric = input("Enter your NRIC: ")
    while Data.isNRIC(nric):
        print("The NRIC input in was invalid")
        nric = input("Enter your NRIC: ")
    
    transactions = []
    records = bankTransactions.readRecords()
    for record in records:
        if record[0] == nric:
            transactions.append(record)
    print(f"\nThe transactions by {nric} are:")
    for transaction in transactions:
        print(f"{Data.getMoney(transaction[3])}, At {Data.getDate(transaction[1])} During {Data.getTime(transaction[2])}")
    print()
    
DisplayMenu()
bankTransactions.close()
bankCustMasterFile.close()
