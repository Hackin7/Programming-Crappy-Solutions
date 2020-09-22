import sqlite3
conn = sqlite3.connect("EntryDB.db")

# Actually redundant, just use DB browser to add tables and add data
def clear():
    tables = ["Location", "Visitor"]
    for table in tables:
        try:
            conn.execute(f"DROP TABLE {table}")
        except:
            pass
    
def create():
    conn.execute("""
    CREATE TABLE Location(
        LocationID TEXT,
        Name TEXT,
        Address TEXT,
        URL TEXT,
        PRIMARY KEY (LocationID)
    );""")
    conn.execute("""
    CREATE TABLE Visitor(
        NRIC TEXT,
        LocationID TEXT,
        Name TEXT,
        Contact TEXT,
        Date TEXT,
        TimeIn TEXT,
        TimeOut TEXT,
        PRIMARY KEY (NRIC, LocationID, Date, TimeIn),
        FOREIGN KEY (LocationID) REFERENCES Location(LocationID)
    );""")
create()
conn.close()
