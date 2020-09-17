import sqlite3

def create(conn):
    for table in ['Product', 'Cake', 'Loaf', 'Bun']:
        try:
            conn.execute(f"DROP TABLE {table};")
        except:
            pass
    with open("TASK3_1.sql") as file:
        cmds = file.read().strip().split("\n\n")
    for cmd in cmds:
        conn.execute(cmd)

### Insertions #####################################################
def insertProduct(conn, ProductCode, Name, Type, Location, Price):
    data = (ProductCode, Name, Type, Location, float(Price))
    conn.execute("INSERT INTO Product(ProductCode, Name, Type, Location, Price)"
                 " VALUES(?,?,?,?,?);",
                 data)

def insertCake(conn, ProductCode, ServingSize, Shape):
    data = (ProductCode, int(ServingSize), Shape)
    conn.execute("INSERT INTO Cake(ProductCode, ServingSize, Shape)"
                 "VALUES(?,?,?);",
                 data)

def insertLoaf(conn, ProductCode, Weight):
    data = (ProductCode, float(Weight))
    conn.execute("INSERT INTO Loaf(ProductCode, Weight)"
                 " VALUES(?,?);",
                 data)

def insertBun(conn, ProductCode, PiecesPerPackage):
    data = (ProductCode, int(PiecesPerPackage))
    conn.execute("INSERT INTO Bun(ProductCode, PiecesPerPackage)"
                 " VALUES(?,?);",
                 data)
    
### Reading into file ##################################################
import csv
def readFile(filename):
    data = []
    file = open(filename, 'r')
    reader = csv.reader(file)
    for record in reader:
        data.append(tuple(record))
    file.close()
    return data

def readCakes(conn):
    data = readFile("CAKES.TXT")
    for record in data:
        # Unpacking
        Type = "Cake"
        ProductCode = record[0]
        Name = record[1]
        Location = record[2]
        Price = record[3]
        ServingSize = record[4]
        Shape = record[5]
        # Insertion
        insertProduct(conn, ProductCode, Name, Type, Location, Price)
        insertCake(conn, ProductCode, ServingSize, Shape)

def readLoaves(conn):
    data = readFile("LOAVES.TXT")
    for record in data:
        # Unpacking
        Type = "Loaf"
        ProductCode = record[0]
        Name = record[1]
        Location = record[2]
        Price = record[3]
        Weight = record[4]
        # Insertion
        insertProduct(conn, ProductCode, Name, Type, Location, Price)
        insertLoaf(conn, ProductCode, Weight)

def readBuns(conn):
    data = readFile("BUNS.TXT")
    for record in data:
        # Unpacking
        Type = "Bun"
        ProductCode = record[0]
        Name = record[1]
        Location = record[2]
        Price = record[3]
        PiecesPerPackage = record[4]
        # Insertion
        insertProduct(conn, ProductCode, Name, Type, Location, Price)
        insertBun(conn, ProductCode, PiecesPerPackage)

### main ##############
def main():
    conn = sqlite3.connect("bakery.db")
    create(conn)
    readCakes(conn)
    readLoaves(conn)
    readBuns(conn)
    conn.commit()
    conn.close()

main()
