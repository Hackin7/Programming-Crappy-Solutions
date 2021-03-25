import pymongo
client = pymongo.MongoClient("127.0.0.1",27017)
db = client.get_database("db")

def insert(coll):
    title = input("Enter title: ")
    date = input("Enter date: ")
    time = input("Enter time: ")
    venue = input("Enter venue: ")
    price = int(input("Enter price in dollars: "))
    coll.insert_one({"title":title,
                     "date":date,
                     "time":time,
                     "venue":venue
                     ,"price":price})
    print("Inserted!")

def search(coll):
    title = input("Enter title: ")
    result = coll.find_one({"title":title})
    print("Title:",result["title"])    
    print("Date:",result["date"])    
    print("Time:",result["time"])    
    print("Venue:",result["venue"])    
    print("Price:",result["price"])    

def delete(coll):
    title = input("Enter title: ")
    coll.delete_one({"title":title})
    print("Deleted!")

coll = db.get_collection("concerts")
prompt = """
Menu
1: Insert concert
2: Search for concert using concert title
3: Delete the entire concert by concert title
Anything else: Quit

Your Option:\
"""
run = True
while run:
    option = int(input(prompt))
    if option == 1:
        insert(coll)
    elif option == 2:
        search(coll)
    elif option == 3:
        delete(coll)
    else:
        run = False
client.close()
    
