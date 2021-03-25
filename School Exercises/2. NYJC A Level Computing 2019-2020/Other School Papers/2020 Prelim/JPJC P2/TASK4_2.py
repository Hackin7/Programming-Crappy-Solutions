# Task 4.2
import csv
import sqlite3

### Convenient function ######################################
def refresh(conn):
    # Delete
    for table in ['SALESPERSON', 'SALE', 'OFFICE', 'CUSTOMER']:
        try:
            conn.execute(f"DROP TABLE {table};")
        except:
            pass
    # Create
    with open('TASK4_1.sql', 'r') as file:
        statements = file.read().split('\n\n')
        for statement in statements:
            conn.execute(statement)

### Generic Functions for handling database #################
def automatedInsert(conn, table, header, data):
    colString = ""
    para = ""
    for h in header:
        colString += h+','
        para += '?,'
    colString = colString[:-1] # Remove last ,
    para = para[:-1]
    
    statement = f'INSERT INTO {table}({colString}) VALUES({para})'
    #print(statement)
    conn.execute(statement, data)

def readFile(filename, insertFunc):
    infile = open(filename, 'r')
    reader = csv.reader(infile)
    header = next(reader)
    for record in reader:
        insertFunc(header, record)
    infile.close()

### Specific Functions for handling database #################
def insertCustomer(header, record):
    record[3] = int(record[3])
    automatedInsert(conn, 'CUSTOMER', header, record)

def insertOffice(header, record):
    record[0] = int(record[0])
    record[1] = int(record[1])
    record[2] = int(record[2])
    automatedInsert(conn, 'OFFICE', header, record)

def insertSalesperson(header, record):
    record[0] = int(record[0])
    record[2] = int(record[2])
    automatedInsert(conn, 'SALESPERSON', header, record)

def insertSale(header, record):
    record[0] = int(record[0])
    record[3] = int(record[3])
    automatedInsert(conn, 'SALE', header, record)

### Main #####################################################
conn = sqlite3.connect("computercompany.db")
refresh(conn)
readFile('CUSTOMER.CSV', insertCustomer)
readFile('OFFICE.CSV', insertOffice)
readFile('SALESPERSON.CSV', insertSalesperson)
readFile('SALE.CSV', insertSale)
conn.commit()
conn.close()
    
