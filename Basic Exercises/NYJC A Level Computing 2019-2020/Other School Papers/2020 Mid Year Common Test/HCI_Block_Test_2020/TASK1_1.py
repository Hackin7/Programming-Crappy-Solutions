import pymongo
client = pymongo.MongoClient(host="127.0.0.1", port=27017)
db = client.get_database("library") # Database
coll = db.get_collection("books") # Collection

### Insert Data ####################
data = [
    {"book_id": 234, "title": "Father Night", "author": "Kurt", "publisher": "APress", "page_count": 433, "year": "2018"},
    {"book_id": 134, "title": "Mother Night", "author": ["Kurt", "Dan"], "publisher": "APress", "year": "2015"},
    {"book_id": 334, "title": "Programming C## 6.0", "author": ["Andrew", "Dan"], "page_count": 300, "year": "2000"},
    {"book_id": 534, "title": "Introduction to Python", "publisher": "MPH", "year": "1999"},
    {"book_id": 434, "title": "Travel with Dogs", "author": "Andy", "publisher": "APress", "page_count": 100, "year": "2017"}
]
coll.insert_many(data)

### Display #########################
def display(coll, header, keys, spacing):
    output = ""
    for h in range(len(header)):
        output += f"{header[h]:{spacing[h]}} "
    output += "\n"
    
    data = coll.find()
    for record in data:
        #print(record)
        for h in range(len(header)):
            item = str(record.get(keys[h]))
            output += f"{item:{spacing[h]}} "
        output += "\n"
    
    print(output)

# Options
header = ["Book Id", "Title", "Author", "Publisher", "Year", "Pages"]
keys = ["book_id", "title", "author", "publisher", "year", "page_count"]
spacing = [10,30,20,10,10,10]
display(coll, header, keys, spacing)

### Closing ##########################
# db.drop_collection("books") # Reset collection for testing
client.close()
