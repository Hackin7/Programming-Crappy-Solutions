# Task 3.2
import sqlite3
import csv

CREATE_STATEMENTS = """\
CREATE TABLE "Teacher" (
	"TeacherUsername"	TEXT,
	"TeacherPassword"	TEXT,
	PRIMARY KEY("TeacherUsername")
);

CREATE TABLE "Lesson" (
	"PresentationDate"	TEXT,
	"Class"	TEXT,
	"TeacherUsername"	TEXT,
	PRIMARY KEY("PresentationDate","Class"),
	FOREIGN KEY("TeacherUsername") REFERENCES "Teacher"("TeacherUsername")
);

CREATE TABLE "StudentScore" (
	"PresentationDate"	TEXT,
	"Class"	TEXT,
	"StudentIndex"	TEXT,
        "Marks"	NUMERIC, 
        PRIMARY KEY("PresentationDate", "Class" ,"StudentIndex")
);
"""
#FOREIGN KEY("PresentationDate, "Class") REFERENCES "Lesson"("PresentationDate", "Class")

def create(conn):
    # Remove
    for table in ["Teacher", "Lesson", "StudentScore"]:
        try:
            conn.execute(f"DROP TABLE {table}")
        except Exception as e:
            print(table, e)

    # Add
    statements = CREATE_STATEMENTS.split("\n\n")
    for i in statements:
        try:
            conn.execute(i)
        except Exception as e:
            print(i, e)
        

def insert(conn):
    file = open("../DEMOAPP.txt", 'r')
    reader = csv.reader(file)
    for record in reader:
        try:
            conn.execute("INSERT INTO Teacher(TeacherUsername, TeacherPassword)"
                         " VALUES(?, ?);", (record[0], record[1]))
        except:
            pass
        conn.execute("INSERT INTO Lesson(TeacherUsername, PresentationDate, Class)"
                     " VALUES(?, ?, ?);", (record[0], record[4], record[3]))
        conn.execute("INSERT INTO StudentScore(StudentIndex, Class, PresentationDate, Marks)"
                     " VALUES(?, ?, ?, ?);",
                     (record[2], record[3], record[4], float(record[5]))
                     )
    file.close()
    
conn = sqlite3.connect("main.db")
create(conn)
insert(conn)
conn.commit()
conn.close()
