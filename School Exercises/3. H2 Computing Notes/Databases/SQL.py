import sqlite3
conn = sqlite3.connect("test.db")

### Deletion ##############################################################
try:
    print("Clearing DB with `DROP TABLE <TableName>`")
    conn.execute("DROP TABLE ReferenceTable;")
    conn.execute("DROP TABLE Data;")
except:
    print("DB had nothing to clear")

### Creation ############################################################
creation = [
    "CREATE TABLE ReferenceTable (ID INTEGER PRIMARY KEY, Description text);",
    '''
    CREATE TABLE Data(
        ID INTEGER PRIMARY KEY ,
        Description TEXT NOT NULL,
        Number NUMBER,
        DataLink INTEGER );
    '''
]
print()
print("Creating Table with:")
for c in creation:
    print(c)
    conn.execute(c)

### Insertion #######################################################
print("Inserting values with `INSERT INTO ReferenceTable(ID, Description) VALUES(?,?)` and `INSERT INTO Data(ID, Description, Number, DataLink) VALUES(?,?,?,?)`")
    
reference_header = ["ID", "Description"]
reference = [
    (1, "ref 1"),
    (2, "ref 2")
]
for row in reference:
    conn.execute("INSERT INTO ReferenceTable(ID, Description) VALUES(?,?)",row)

data_header = ["ID", "Description", "Number"]
data = [
    (1, "hi", 3.1, 1),
    (2, "hello", 4, 2),
    (3, "Join test", 4, None)
]
for row in data:
    conn.execute("INSERT INTO Data(ID, Description, Number, DataLink) VALUES(?,?,?,?)",row)
print()

### Query ############################################################
def nice_show_in_query(query=None, header=[0,1,2,3], colwidth=None):
    output = ""
    ### Header #####################################
    if colwidth == None:
        colwidth = [13 for i in range(len(header))]
    for j in range(len(header)):
        output+=f"{header[j]:<{colwidth[j]}} "
    output += "\n"
    
    ### Border #####################################
    border = ""
    for j in range(len(header)):
        border += "-" * (colwidth[j]+1)
    border += "\n"
    output = border+output+border
    
    ### GETTING VALUES #####################################
    cursor = conn.execute(query)
    for item in cursor.fetchall():
        ### Per value ##########
        for index in range(len(header)):
            output += f"{str(item[index]):<{colwidth[index]}} "
        output += "\n"
    
    print(output+"\n")

#print(statement,cond_query)
def show_statement(statement, cond_query, header, colwidth=None):
    print(statement, cond_query)
    nice_show_in_query(cond_query, header, colwidth)

show_statement("Selecting all items:", "SELECT * FROM Data", data_header)
show_statement("Selecting all items:", "SELECT * FROM ReferenceTable", reference_header)
show_statement("Inner Join Tables:", "SELECT * FROM Data INNER JOIN ReferenceTable ON (Data.DataLink == ReferenceTable.ID)", data_header + ["DataLink"] + reference_header)
show_statement("Left Outer Join Tables:", "SELECT * FROM Data LEFT OUTER JOIN ReferenceTable ON (Data.DataLink == ReferenceTable.ID)", data_header + ["DataLink"] + reference_header)


show_statement("Selecting specific rows:", "SELECT * FROM Data WHERE ID == 1;", data_header)
show_statement("Selecting specific columns:", "SELECT Description FROM Data", ["Description"])
show_statement("Selecting specific columns from joined tables:", "SELECT Data.DataLink, Data.Description, ReferenceTable.Description FROM Data INNER JOIN ReferenceTable ON (Data.DataLink == ReferenceTable.ID)", ["DataLink", "Data.Desc", "Ref.Desc"])

show_statement("Selecting SUM (You can also use COUNT, MAX, MIN)", "SELECT ID, SUM(Number) FROM Data", ["ID", "SUM(Number)"])


### Updating Data #########################################################
update_statement = "UPDATE Data SET Description='Haha hacked' WHERE ID == 1;"
conn.execute(update_statement)
show_statement(f"Updated data with {update_statement}:", "SELECT * FROM Data", data_header)

### Deleting Data #########################################################
update_statement = "DELETE FROM Data WHERE ID == 1;"
conn.execute(update_statement)
show_statement(f"Deleted data with {update_statement}:", "SELECT * FROM Data", data_header)

### Finalisation ##########################################################
conn.commit()
conn.close()
