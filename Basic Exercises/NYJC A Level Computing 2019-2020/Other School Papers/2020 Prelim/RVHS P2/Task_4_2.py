# Task 4.2
import csv
import sqlite3

def insertQuery(conn, table, header, record):
    headerString = ""
    paraString = ""
    for index in range(len(header)):
        headerString += f"{header[index]}"
        paraString += "?"
        if index != len(header) - 1:
            headerString += ","
            paraString += ","

    statement = f"INSERT INTO {table}({headerString}) VALUES({paraString})"
    #print(statement)
    conn.execute(statement, record)

def readCSV(filename,insertFunc, **kwargs):
    infile = open(filename, 'r')
    reader = csv.reader(infile)

    # Read File
    header = next(reader)
    for record in reader:
        insertFunc(header=header, record=record, **kwargs)
        
    infile.close()


### Specific ############################################
def insertStudent(conn, header, record):
    record[2] = int(record[2])
    insertQuery(conn, 'Student', header, record)

def insertCandidate(conn, header, record):
    record[0] = int(record[0])
    insertQuery(conn, 'Candidate', header, record)

def insertVote(conn, header, record):
    record[1] = int(record[1])
    insertQuery(conn, 'Vote', header, record)


### Main ##################################################
def task4_2():
    conn = sqlite3.connect("voting_mgm.db")
    readCSV("students.csv", insertStudent, conn=conn)
    readCSV("candidates.csv", insertCandidate, conn=conn)
    readCSV("votes.csv", insertVote, conn=conn)
    conn.commit()
    conn.close()
task4_2()
