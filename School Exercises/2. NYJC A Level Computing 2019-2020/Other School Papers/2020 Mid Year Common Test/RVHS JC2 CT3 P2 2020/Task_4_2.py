import sqlite3
conn = sqlite3.connect("result_mgm.db")

def createTables():
    tables = ['Result', 'Test', 'Student']
    for table in tables:
        try:
            conn.execute(f"DROP TABLE '{table}'")
        except Exception as e:
            print(e)
            
    file = open('Task_4_1.sql')
    commands = file.read().split('\n\n')
    for c in commands:
        conn.execute(c)
    file.close()

import csv
def readCSV(filename, insert):
    file = open(filename, 'r')
    reader = csv.reader(file)

    header = None
    for record in reader:
        if header == None:
            header = record
        else:
            insert(header, record)

    file.close()

def insert(table, header, record):
    columns = ""
    placeholder = ""
    for h in header:
        if columns != "":
            columns += ","
        columns += h
        
        # Parametrised queries
        if placeholder != "":
            placeholder += ","
        placeholder += "?"
    
    statement = f"INSERT INTO {table}({columns}) VALUES({placeholder})"
    #print(statement, record)
    conn.execute(statement, tuple(record))

def insertStudent(header, record):
    record[3] = int(record[3])
    insert("Student", header, record)
def insertTest(header, record):
    record[0] = int(record[0])
    record[3] = int(record[3])
    record[4] = int(record[4])
    record[5] = int(record[5])
    record[6] = int(record[6])
    insert("Test", header, record)
def insertResult(header, record):
    record[1] = int(record[1])
    record[2] = int(record[2])
    insert("Result", header, record)

createTables()
readCSV("students.csv", insertStudent)
readCSV("tests.csv", insertTest)
readCSV("results.csv", insertResult)
conn.commit()
conn.close()
