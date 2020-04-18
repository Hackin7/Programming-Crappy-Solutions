import pymongo

### Open Connection ####################################################
# Remember to open mongod in shell first
client = pymongo.MongoClient("127.0.0.1",27017) # Address, Port

### Create a database ##################################################
db_name = "database"
coll_name = "collection"

db = client.get_database(db_name) # Creates if doesn't exist


coll = db.get_collection(coll_name)

sample_data = [
    {
        "number":1,
        "text":"Item 1",
        "array": [1,2,3,4],
        "document": {"key":"value","n":1}
    },
    {
        "number":2,
        "text":"Item 2",
        "array": [3,4,5,6]
    },
    {
        "number":3,
        "text":"Item 3, No array",
    },
    {
        "number":3,
        "text":"Item 3 duplicate",
        "document":{"key":"I'm better","n":4}
    },
    {
        "number":5,
        "text":"Item 5",
        "array": [3,4,5,6]
    },
]

#coll.insert_one(sample_data[0])
coll.insert_many(sample_data)
 
### Search for items ###################################################

def show_in_query(query=None):
    for i in coll.find(query):
        print(i)
    
#### Shows the thing in a nice table format ############
def nice_show_in_query(query=None):
    output = ""
    ### Header #####################################
    header = ["number","text","array","document"]
    colwidth = [7,30,20,30]
    for j in range(len(header)):
        output+=f"{header[j]:<{colwidth[j]}} "
    output += "\n"
    
    ### Border #####################################
    border = ""
    for j in range(len(header)):
        border += "-" * (colwidth[j]+1)
    border += "\n"
    output = border+output+border
    
    ### Values #####################################
    for i in coll.find(query):
        ### Per value ##########
        for j in range(len(header)):
            output += f"{str(i.get(header[j])):<{colwidth[j]}} "
        output += "\n"
    
    print(output+"\n")

def showcase_query(statement,cond_query):
    print(statement,cond_query)
    nice_show_in_query(cond_query)

print("Selecting 1 item")
print("   ",coll.find_one({"number":1}))# Select 1 item

print("Selecting all Items in Collection")
show_in_query()
print()
nice_show_in_query()

### Matching Fields ###################
cond_query = {"number":1, "text":"Item 1"}
showcase_query("Selecting by matching fields:",cond_query)

### Comparisons ########################
cond_query = {"number":{"$gt":1}}
# Has $gt, $gte, $lt, $lte, $ne, $eq, $ne, $exists:True/False
showcase_query("Selecting by comparions:",cond_query)


### $in/$nin ###################
cond_query = {"number":{"$in":[1,2]}}
showcase_query("Selecting by comparing in array:",cond_query)

### Boolean ###################
cond_query =  { "$and": # Has $and, $or
    [
        {"number": {"$not":{"$gte":5} } },
        {"array":{"$gt":4}}
    ] 
}
showcase_query("Selecting with Boolean Operators:",cond_query)

### $not #########################
#$not selects those that don't meet condition OR the field doesn't exist
cond_query =  {"array":{"$not":{"$gt":4}}}
showcase_query("Selecting with $not Operators:",cond_query) 

### With items in an array ##################
# All normal operators should work
cond_query = {"array":{"$gte":5}}
showcase_query("Selecting by comparing items in documents' array:",cond_query)

### Nested Documents #########################
# All normal operators should work
cond_query = {"document.n":{"$gt":1}}
showcase_query("Selecting by comparing items in nested documents:",cond_query)

### Update items #######################################################
print("#"*100)

cond_update = {"number":3}
modifier = {"$set":{"document":{"key":"yes"}}}
print("Updating first item that matches condition:",cond_update,modifier)
coll.update_one(cond_update,modifier)
nice_show_in_query()

cond_update = {"number":3}
modifier = {"$set":{"text":"erosion of local culture"}}
print("Updating some items:",cond_update,modifier)
coll.update_many(cond_update,modifier)
nice_show_in_query()

cond_update = {}
modifier = {"$set":{"array":[1,2,3,4]}}
print("Updating and creating new properties for all items:",cond_update,modifier)
coll.update_many(cond_update,modifier)
nice_show_in_query()

cond_update = {}
modifier = {"$unset":{"array":"value"}} # The "value" doesn't matter
print("$unset proporties of items:",cond_update,modifier)
coll.update_many(cond_update,modifier)
nice_show_in_query()


cond_update = {}
modifier = {"$inc":{"number":1}} # Also has $mul
print("$inc of items:",cond_update,modifier)
coll.update_many(cond_update,modifier)
nice_show_in_query()

'''
Many other operators such as
{"$rename" : {field_name: new_field_name}}
{"$min" : {field_name: value_if_curr_value_lower}}
{"$max" : {field_name: value_if_curr_value_higher}}

https://docs.mongodb.com/manual/reference/operator/update-array/
'''
### Delete items #######################################################
print("#"*100)
print("Deleting first item that matches query")
coll.delete_one({"number":3})
nice_show_in_query()

print("Deleting many items")
coll.delete_many({"document":{"$exists":True}})
nice_show_in_query()

print("Deleting rest of table")
db.drop_collection(coll_name)
client.drop_database(db_name)

### Close Connection ###################################################
client.close()
