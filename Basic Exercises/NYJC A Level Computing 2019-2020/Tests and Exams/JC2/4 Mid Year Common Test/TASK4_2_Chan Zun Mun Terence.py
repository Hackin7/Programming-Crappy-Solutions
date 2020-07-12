import sqlite3

conn = sqlite3.connect("equipment.db")
## Created after the test.
## (During the test I probably messed up one of the creation statements)
def refresh():
    try:
        conn.execute("DROP TABLE Device;")
        conn.execute("DROP TABLE Monitor;")
        conn.execute("DROP TABLE Laptop;")
        conn.execute("DROP TABLE Printer;")
    except:
        pass
    
    f = open("TASK4_1_Chan Zun Mun Terence.sql", )
    statements = f.read().split("\n\n")
    print(statements)
    f.close()
    for i in statements:
        conn.execute(i)
    
refresh()

def read(filename, insert): #pass in function as a parameter
    file = open(filename, 'r') # Read mode
    for line in file:
        data = line.strip().split(",")
        insert(data)
    file.close()

def insertGeneral(data, Type):
    toInsert = (data[0], Type, data[1],data[2],data[3],data[4])
    conn.execute("INSERT INTO Device(SerialNumber,Type, Model,"
                 "Location, DateofPurchase, WrittenOff)"
                 "VALUES (?,?,?,?,?,?)", toInsert)

def insertMonitor(data):
    insertGeneral(data, 'Monitor')
    toInsert = (data[0], data[5])
    conn.execute("INSERT INTO Monitor(SerialNumber, DateCleaned)"
                 "VALUES (?,?)", toInsert)

def insertLaptop(data):
    insertGeneral(data, 'Laptop')
    toInsert = (data[0], float(data[5]))
    conn.execute("INSERT INTO Laptop(SerialNumber, WeightKg)"
                 "VALUES (?,?)", toInsert)


def insertPrinter(data):
    insertGeneral(data, 'Printer')
    toInsert = (data[0], data[5], data[6])
    conn.execute("INSERT INTO Printer(SerialNumber, Toner, DateChanged)"
                 "VALUES (?,?,?)", toInsert)

read("MONITORS.txt", insertMonitor)

read("LAPTOPS.txt", insertLaptop)
read("PRINTERS.txt", insertPrinter)

conn.commit()
conn.close()
