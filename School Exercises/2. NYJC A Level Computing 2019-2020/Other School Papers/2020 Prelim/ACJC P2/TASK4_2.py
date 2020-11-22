# Task 4.2
import csv
import sqlite3

def clear():
    for table in ['Employee', 'Sales', 'Tech_support']:
        try:
            conn.execute(f"DELETE FROM {table}")
        except Exception as e:
            print(table, e)
        

def insertEmployee(record, Job_type):
    Employee_ID, Employee_name, Date_of_Employment, Service_status = record[:4]
    Employee_ID = int(Employee_ID)
    Service_status = str(Service_status)
    conn.execute("INSERT INTO Employee(Employee_ID, Employee_name, Date_of_Employment, Service_status, Job_type)"
                " VALUES(?,?,?,?, ?);",
                (Employee_ID, Employee_name, Date_of_Employment, Service_status, Job_type))

def insertSales(record):
    record[4] = float(record[4])
    insertEmployee(record[:4], 'Sales')
    conn.execute("INSERT INTO Sales(Employee_ID, Total_sales)"
                 " VALUES(?,?);",
                 (record[0], record[4]))

def insertTechSupport(record):
    record[4] = int(record[4])
    insertEmployee(record[:4], 'Tech_support')
    conn.execute("INSERT INTO Tech_support(Employee_ID, Bugs_resolved)"
                 " VALUES(?,?);",
                 (record[0], record[4]))
    
def readFile(filename, insert): # Insert is a function
    with open(filename, 'r') as infile:
        reader = csv.reader(infile)
        for record in reader:
            record[0] = int(record[0])
            insert(record) 
    
### Main #########################
conn = sqlite3.connect("records.db")
clear()
readFile("SALES.txt", insertSales)
readFile("TECH_SUPPORT.txt", insertTechSupport)
conn.commit()
conn.close()
