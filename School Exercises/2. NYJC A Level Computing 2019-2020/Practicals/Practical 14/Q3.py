###Task 3.1
class Record:
    def __init__(self, name, number):
        self.name = name
        self.number = number #Telephone Number
    ###Getter###
    def getName(self):
        return self.name
    def getNumber(self):
        return self.number
    ###Setter###
    def setName(self, name):
        self.name = name
    def setNumber(self, number):
        self.number = number

class RecordsStorage:
    def __init__(self, no = 500):
        self.records = []
        for i in range(no): #Store Number of records
            record = Record("", None)
            self.records.append(record)
    def length(self):
        return len(self.records)
    def access(self, pos):
        return self.records[pos]

###Task 3.2
recordStorage = RecordsStorage()

def extractDataFromFile():
    dataFile = open("HASHEDDATA.TXT")
    lines = dataFile.read().split("\n")
    dataFile.close()
    for line in lines:
        ###Getting Data from line
        lineData = line.split(",")
        index = int(lineData[0])
        name = lineData[1]
        number = lineData[2]
        ###Storing Values in Data Structure
        record = recordStorage.access(index)
        record.setName(name)
        record.setNumber(number)
        
def DisplayValues():
    ###Table Heading
    print(f"{'Index':<5} | {'PersonsName':<20} | {'TelephoneNumber':<8}")
    ###Loop through data structure
    for i in range(recordStorage.length()):
        record = recordStorage.access(i)
        if record.getName() != "": #If name is present
            print(f"{i:<5} | {record.getName():<20} | {record.getNumber():<8}")

extractDataFromFile()  
DisplayValues()
print()

###Task 3.3
def GenerateHash(SearchName):
    HashTotal = 0
    ###Loop through position of character in array
    for char in range(len(SearchName)):
        asciiCode = ord(SearchName[char])
        HashTotal += asciiCode * (char + 1) #Position to multiply starts from 1
    Hash = HashTotal % 500
    return Hash
print("Task 3.3:")
print("Hash value of Tait Davinder is :" , GenerateHash("Tait Davinder"))
print("Hash value of Anandan Yeo is :" , GenerateHash("Anandan Yeo"))
print()

###Task 3.4
def search(SearchName):
    index = GenerateHash(SearchName)
    record = recordStorage.access(index)
    while record.getName() != SearchName and\
          record.getName() != "": #Name not Empty
        index += 1
        record = recordStorage.access(index)
        
    if recordStorage.access(index).getName() == "": #If Name Empty
        print("NOT FOUND")
    else:
        print(f"{'Index':<5} | {'PersonsName':<20} | {'TelephoneNumber':<8}")
        print(f"{index:<5} | {record.getName():<20} | {record.getNumber():<8}")

#Searching
print("Task 3.4:")
print("Search 1:Charlie Love")
search("Charlie Love")
print()

print("Search 2:Chin Tan")
search("Chin Tan")
print()

print("Search 3:John Barrowman")
search("John Barrowman")
print()
