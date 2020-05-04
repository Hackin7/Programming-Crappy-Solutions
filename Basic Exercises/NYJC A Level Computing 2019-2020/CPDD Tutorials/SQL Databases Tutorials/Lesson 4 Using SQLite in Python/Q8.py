import sqlite3

creation = ["CREATE TABLE Borrower( ID INTEGER PRIMARY KEY, Name text NOT NULL);",
"CREATE TABLE Book(ID INTEGER PRIMARY KEY, Title text NOT NULL);",
"CREATE TABLE Loan(ID INTEGER PRIMARY KEY AUTOINCREMENT, BorrowerID INTEGER NOT NULL, BookID INTEGER NOT NULL, FOREIGN KEY (BorrowerID) REFERENCES Borrower(ID), FOREIGN KEY (BookID) REFERENCES Book(ID));"]
def create():
    conn = sqlite3.connect("loans.db")
    for c in creation:
        conn.execute(c)
    conn.commit()
    conn.close()
    exit()
#create()

while True:
    conn = sqlite3.connect("loans.db")

    # Get Borrower ID
    borrower_id = int(input("Enter Borrower ID: "))
    cursor = conn.execute("SELECT COUNT(*) FROM Borrower "+
                          "WHERE ID=?", (borrower_id,))
    if cursor.fetchone()[0] == 0:
        name = input("Enter Borrower Name: ")
        conn.execute("INSERT INTO Borrower(ID, Name) "+
                    "VALUES(?,?)",(borrower_id, name))

    
    # ...fill in the rest of the code below
    #################################################
    # Get User Name
    cursor = conn.execute("SELECT Name FROM Borrower "+
                          "WHERE ID=?", (borrower_id,))
    print("Welcome",cursor.fetchone()[0],"\n")
    
    # Ask for the Book ID
    book_id = int(input("Enter Book ID: "))
    cursor = conn.execute("SELECT COUNT(*) FROM Book "+
                          "WHERE ID=?", (book_id,))
    book = cursor.fetchone()
    if book[0] == 0: #Book ID is 0
        name = input("Enter Book Title: ")
        conn.execute("INSERT INTO Book(ID, Title) "+
                    "VALUES(?,?)",(book_id, name))

    # Get Book Title
    cursor = conn.execute("SELECT Title FROM Book "+
                          "WHERE ID=?", (book_id,))
    print("Loaning Book:",cursor.fetchone()[0],"\n")
    
    # Check if the book is loaned
    cursor = conn.execute("SELECT count(*) FROM Loan "+
                      "WHERE BookID=?", (book_id,))
    loan = cursor.fetchone()
    if loan[0]>0: #No Loan
        # Get User who Loaned Book
        cursor = conn.execute("SELECT Name FROM Borrower " +
                              "WHERE ID=( " +
                              "SELECT BorrowerID FROM Loan WHERE " +
                              "BookID=?)", (book_id,))
        print("Error: The book is already on loan by",cursor.fetchone()[0])
    else:
        conn.execute("INSERT INTO Loan(BorrowerID, BookID) "+
                "VALUES(?,?)",(borrower_id, book_id))
        print("The book has been loaned")
    conn.commit()
    
    conn.close()
    #############################################
    if input("Quit (Y/N)? ").upper() == "Y":
        break
