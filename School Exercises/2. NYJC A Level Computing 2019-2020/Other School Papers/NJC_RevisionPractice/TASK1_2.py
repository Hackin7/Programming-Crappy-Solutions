import sqlite3

conn = sqlite3.connect("schools.db")

def reset():
    try:
        conn.execute("DROP TABLE SCHOOL")
        conn.execute("DROP TABLE STAFF")
    except:
        print("No need to delete tables")

    with open("TASK1_1.sql",'r') as f:
        commands = f.read().split('\n\n')
        for i in commands:
            print(i)
            conn.execute(i)


def readFile(filename):
    data = []
    with open(filename, 'r') as file:
        for line in file:
            record = line.strip().split(',')
            data.append(record)
    return data

def insertIntoSCHOOL():
    data = readFile("SCHOOL.TXT")
    for record in data[1:]: #Skip the first record
        dataToInsert = (int(record[0]), record[1], record[2])
        conn.execute("INSERT INTO SCHOOL(SchoolCode,Name,Address) VALUES(?,?,?);",
                     dataToInsert)

def insertIntoSTAFF():
    data = readFile("STAFF.TXT")
    for record in data[1:]:#Skip the first record
        dataToInsert = (int(record[0]), record[1], record[2], int(record[3]))
        conn.execute("INSERT INTO STAFF(SchoolCode,Name,Department,Contact)"
                     "VALUES(?,?,?,?);",
                     dataToInsert)

reset()
insertIntoSCHOOL()
insertIntoSTAFF()

conn.commit()
conn.close()
