import sqlite3
import csv

statements = """
CREATE TABLE Civics(
    Class TEXT,
    Tutor TEXT,
    HomeRoom TEXT,
    PRIMARY KEY(Class)
);

CREATE TABLE 'Student'(
    MatricNo INTEGER,
    Name TEXT,
    Gender TEXT,
    CivicsClass TEXT,
    PRIMARY KEY (MatricNo),
    FOREIGN KEY(CivicsClass) REFERENCES Civics(Class)
);

CREATE TABLE CCAInfo(
    Name TEXT, TeacherIC Text, PRIMARY KEY(Name)
);

CREATE TABLE StudentCCA(
    MatricNo INTEGER, CCAName TEXT, PRIMARY KEY(MatricNo, CCAName),
    FOREIGN KEY(MatricNo) REFERENCES Student(MatricNo),
    FOREIGN KEY(CCAName) REFERENCES CCAInfo(Name)
);
"""

def create(conn):
    for table in ['StudentCCA', 'Student', 'Civics', 'CCAInfo']:
        try:
            conn.execute(f"DROP TABLE {table};")
        except:
            pass

    for statement in statements.split('\n\n'):
        print(statement)
        conn.execute(statement)
    
def insertCSVToDB(filename, conn, table):
    infile = open(filename, 'r')
    reader = csv.reader(infile)
    headers = next(reader)

    headerString = ""
    parameterString = ""
    for header in headers:
        headerString += f"{header},"
        parameterString += "?,"
    headerString = headerString[:-1]
    parameterString = parameterString[:-1]

    for record in reader:
        # Insert into Database
        conn.execute(f"INSERT INTO {table}({headerString}) VALUES({parameterString});",
                     record)
    infile.close()

### Driver ###############################
def task2_1():
    conn = sqlite3.connect("school.db")
    create(conn)
    insertCSVToDB('Student.csv', conn, 'Student')
    insertCSVToDB('Civics.csv', conn, 'Civics')
    insertCSVToDB('StudentCCA.csv', conn, 'StudentCCA')
    insertCSVToDB('CCAInfo.csv', conn, 'CCAInfo')
    conn.commit()
    conn.close()
task2_1()
