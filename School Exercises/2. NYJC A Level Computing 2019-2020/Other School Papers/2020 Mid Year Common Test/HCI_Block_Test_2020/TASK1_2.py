import pymongo
client = pymongo.MongoClient(host="127.0.0.1", port=27017)
db = client.get_database("library") # Database
coll = db.get_collection("books") # Collection

### Display #########################
def display_data(data, header, keys, spacing):
    output = ""
    for h in range(len(header)):
        output += f"{header[h]:{spacing[h]}} "
    output += "\n"
    
    for record in data:
        #print(record)
        for h in range(len(header)):
            item = str(record.get(keys[h]))
            output += f"{item:{spacing[h]}} "
        output += "\n"
    
    print(output)

def display(coll,query, header, keys, spacing):
    data = coll.find(query)
    display_data(data, header, keys, spacing)
    
### Query 2015 Books ##################
print("Books published in 2015")
query = {"year":"2015"}
header = ["Book Id", "Title", "Author"]
keys = ["book_id", "title", "author"]
spacing = [10,30,20,10,10,10]
display(coll, query, header, keys, spacing)

### Query Books where page_count in range##################
print("Books where 100 <= page_count < 400")
query = {
    "$and":[
        {"page_count":{"$gte":100}},
        {"page_count":{"$lt":400}}
        ]
    }
header = ["Book Id", "Title", "Author", "Publisher", "Year", "Pages"]
keys = ["book_id", "title", "author", "publisher", "year", "page_count"]
spacing = [10,30,20,10,10,10]
display(coll, query, header, keys, spacing)

### Update Books ########################################
print("Updating Books page_count to be `Less Than 100 Pages` if it doesn't exist\n")
coll.update({"page_count":"$exists"}, {"page_count":"Less Than 100 Pages"})

### Display with years sorted in reverse ##############
print("Books with years in reverse order")
header = ["Book Id", "Pages", "Year"]
keys = ["book_id", "page_count", "year"]
spacing = [10,10,10]

# Processing data
data = []
cursor = coll.find({})
for record in cursor:
    data.append(record)

# Sorting Data
def comparator(item):
    return item.get("year")
data.sort(key=comparator,reverse=True)

display_data(data,header,keys,spacing)

### Closing #########################
client.close()
