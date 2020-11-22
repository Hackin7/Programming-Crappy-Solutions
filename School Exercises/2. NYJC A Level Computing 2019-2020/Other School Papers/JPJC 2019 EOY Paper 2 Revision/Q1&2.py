### Task 1.1
def storeMembers(filename: str) -> list:
    textFile = open(filename)
    data = textFile.read()
    textFile.close()
    records = data.strip().split("\n")
    for r in range(len(records)):
        records[r] = records[r].split(",")
        for i in range(len(records[r])):
            records[r][i] = records[r][i].strip()
        #records[r][1] = int(records[r][1])
    return records

def printMemArray(membersArray: list):
    print(f"{'Name':^20}{'Contact No':^20}{'Email':^20}")
    for record in membersArray:
        print(f"{record[0]:^20}{record[1]:^20}{record[2]:^20}")
    print(f"{'-'*60:^60}")
    print(f"Total no. of records: {len(membersArray)}")

### Task 1.2
def programCode():
    mem = storeMembers("MEMBERS.TXT")
    printMemArray(mem)
programCode()

### Task 1.3
def searchMemberByOption(memberList:list, searchKey:str, searchChoice: int):
    if searchChoice not in [1, 2]:
        raise Exception("searchChoice not valid!!!")
    else:
        i = searchChoice
    m = 0
    found = False
    while m < len(memberList) and not found:
        if memberList[m][i] == searchKey:
            found = True
        else:
            m += 1
    print(f"Search record is {'found' if found else 'not found'}")
    if found:
        print("The record is")
        print(f"{'Name':^20}{'Contact No':^20}{'Email':^20}")
        print(f"{memberList[m][0]:^20}{memberList[m][1]:^20}{memberList[m][2]:^20}")

### Task 1.4
def programCode():
    mem = storeMembers("MEMBERS.TXT")
    searchKey = input("Enter the searchKey:").strip()
    searchChoice = int(input("Enter the searchChoice:"))
    while not searchChoice in [1, 2]:
        print("The searchChoice input in is not valid")
        searchChoice = int(input("Enter the searchChoice:"))
    searchMemberByOption(mem, searchKey, searchChoice)
programCode()


### Task 2.1
from random import randint
def randomSelect():
    memberList = storeMembers("MEMBERS.TXT")
    chosen = []
    for i in range(5):
        member = randint(0, len(memberList)-1)
        while member in chosen:
            member = randint(0, len(memberList)-1)
        chosen.append(member)
    print("5 Lucky Draw Winners ($30 online vouncher) :")
    print("============================================")
    print(f"{'Name':<22}{'Contact No':<22}{'Email':<22}")
    for m in chosen:
        print(f"{memberList[m][0]:<22}{memberList[m][1]:<22}{memberList[m][2]:<22}")

randomSelect()
