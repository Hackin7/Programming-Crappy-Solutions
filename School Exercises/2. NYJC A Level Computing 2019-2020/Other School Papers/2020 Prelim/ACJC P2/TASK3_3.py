# Task 3.3
import pymongo
import csv
def readFileToColl(filename, coll):
    with open(filename, 'r') as infile:
        reader = csv.reader(infile, delimiter='\t')
        for record in reader:
            # Serial No, Name, Type, Purchase Price, Selling Price, Quantity
            quantity = record[5]
            if quantity == "sold out":
                quantity = 0
            else:
                quantity = int(quantity)
            document = {
                "Serial_No": record[0],
                "Name": record[1],
                "Type": record[2],
                "Purchase_Price": float(record[3]), 
                "Selling_Price": float(record[4]),
                "Quantity": quantity
            }
            coll.insert_one(document)



def task3_3():
    # Initalising Database
    DB_NAME = 'OUTLETS'
    COLL_NAME = 'GEM'
    
    client = pymongo.MongoClient('127.0.0.1', 27017)
    client.drop_database(DB_NAME)
    db = client.get_database(DB_NAME)
    coll = db.get_collection(COLL_NAME)

    # Inserting to coll
    readFileToColl("INVENTORY_SERIAL.txt", coll)

    # Debugging
    for record in coll.find({}):
        print(record)
    # Cleanup
    client.close()

task3_3()
