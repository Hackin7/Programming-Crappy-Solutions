### Write your Code here
import sqlite3
connection = sqlite3.connect("contacts.db")
####Procedures###################################################
#Option 1: Add New Contact
def addNewContact(name,homephone,mobilephone,address,yearofbirth):
    connection.execute("INSERT INTO "+
                        "Contact(Name,HomePhone,MobilePhone,Address,YearOfBirth)"+
                        "VALUES(?,?,?,?,?)",
                        (name,homephone,mobilephone,address,yearofbirth)
                      )
    
#Option 2: Update Address
def printDetails(row):
    print("\nDetails\n-------")
    print("Name: ",row[0])
    print("Home Phone:",row[1])
    print("Mobile:",row[2])
    print("Address:",row[3])
    print("Year of birth:",row[4])

def updateAddress(name,homephone,updatedAddress):
    connection.execute("UPDATE Contact "+
                        "SET Address=? "+
                        "WHERE Name=? AND HomePhone=?",
                        (updatedAddress,name,homephone)
                        )
                       
#Option 3: Display all info for people born in a given year
def displayBornInYear(year):
    cursor = connection.execute("SELECT * FROM Contact WHERE YearOfBirth=?",(year,))
    for row in cursor:
        
        print(f"{row[0]} {row[1]} {row[2]} {row[3]} {row[4]}")

#Option 4: Save back in text file
def saveBackInFile():
    file = open("mycontact.txt","w") #Overwrite file
    cursor = connection.execute("SELECT * FROM Contact ORDER BY Name ASC")
    newline = False
    for row in cursor:
        #Don't leave a trailing newline
        if newline:
            file.write("\n")
        else:
            newline = True
        row = row[1:] #Remove id
        file.write(f"{row[0]},{row[1]},{row[2]},{row[3]},{row[4]}")
    file.close()

##Starting Code###########################################
def insertInfo():
    connection.execute("DELETE FROM Contact;")
    file = open("mycontact.txt")
    for row in file:
        data = row.strip().split(",")
        #Values
        name = data[0]
        homephone = data[1]
        mobilephone = data[2]
        address = data[3]
        yearofbirth = int(data[4])
        #Insertion
        addNewContact(name,homephone,mobilephone,address,yearofbirth)
        
    file.close()

###Menu#############################################
menutext = """\
Menu
1: Add new contact
2: Edit contact's address
3: Display all contacts born in certain year of birth
4: Quit
Option -> \
"""

def menu():
    option = 0
    while option != 4:
        option = int(input(menutext))
        
        if option == 1: #Add new contact
            #Get details
            name = input("Enter name: ")
            homephone = input("Enter home phone number: ")
            mobilephone = input("Enter mobile number: ")
            address = input("Enter address: ")
            yearofbirth = int(input("Enter person's year of birth: "))
            #Add
            addNewContact(name,homephone,mobilephone,address,yearofbirth)
            print("\nPerson added!\n")
            
        elif option == 2:#Edit contact's address
            #Get current details
            name = input("Enter name: ")
            homephone = input("Enter home phone number: ")
            #Show current details details
            cursor = connection.execute("SELECT * FROM Contact WHERE Name=? AND HomePhone=?",
                                (name,homephone)
                                )
            row = cursor.fetchone()
            printDetails(row)
            #Update Address
            updatedAddress = input("Enter updated address: ")
            updateAddress(name,homephone,updatedAddress)
            print("Address updated!\n")
            
        elif option == 3: # Display all info for people born in a given year
            yearofbirth = int(input("Enter year of birth: "))
            #Trailing new lines
            print()
            displayBornInYear(yearofbirth)
            print()
            print()
            
        elif option == 4: #Quit
            print("\nGood bye!\n")
            saveBackInFile()
            connection.commit()
            

insertInfo()
menu()
connection.close()
