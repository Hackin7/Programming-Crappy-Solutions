# Task 3.4
import pymongo

def isValid(document):
    # Serial No Check
    serialNo = document['Serial_No']
    serialNoCheck = (
        len(serialNo) == 4
        and serialNo[0].isdigit()
        and serialNo[1:3].isalpha() # Check for leters
        and serialNo[3].isdigit()
    )
    # Name Check
    name = document['Name']
    nameCheck = False
    for char in name:
        # Check for only letters, digits and spaces
        if char not in "QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890 ":
            nameCheck = False
    # Quantity check
    qtyCheck = document['Quantity'] >= 0

    return serialNoCheck and nameCheck and qtyCheck

def checkDocumentsInDB(coll):
    toRemove = []
    for document in coll.find({}): # Get all documents
        #print(document)
        if not isValid(document):
            toRemove.append(document)
            print('Invalid Document to be removed:', document)
    
    for document in toRemove:
        coll.delete_one(document)

def task3_4():
    # Initalising Database
    DB_NAME = 'OUTLETS'
    COLL_NAME = 'GEM'
    
    client = pymongo.MongoClient('127.0.0.1', 27017)
    db = client.get_database(DB_NAME)
    coll = db.get_collection(COLL_NAME)

    # Inserting to coll
    checkDocumentsInDB(coll)

    # Debugging
    for record in coll.find({}):
        print(record)
    # Cleanup
    client.close()

task3_4()
