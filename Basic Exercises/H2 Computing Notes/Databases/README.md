# Databases

## SQL

### `sqlite3` in Python 3
Opening the Database (Creates a .db file if it doesn't exist)
```
import sqlite3
conn = sqlite3.connect("test.db")
```

Runs a SQL Command (Without any return value)
```
conn.execute(sql_statement)
```

Runs a SQL Command and fetches the data
```
cursor = conn.execute(sql_statement)
#cursor.fetchone() # Gets the first record
data = cursor.fetchall() # Returns a list of tuples (with the data inside)
```

Commits and closes the database
```
conn.commit() # You must do this to save your changes
conn.close()
```

### Sample SQl Commands and Results
Run `SQL.py` to get this output
```
Clearing DB with `DROP TABLE <TableName>`

Creating Table with:
CREATE TABLE ReferenceTable (ID INTEGER PRIMARY KEY, Description text);

    CREATE TABLE Data(
        ID INTEGER PRIMARY KEY ,
        Description TEXT NOT NULL,
        Number NUMBER,
        DataLink INTEGER );
    
Inserting values with `INSERT INTO ReferenceTable(ID, Description) VALUES(?,?)` and `INSERT INTO Data(ID, Description, Number, DataLink) VALUES(?,?,?,?)`

Selecting all items: SELECT * FROM Data
------------------------------------------
ID            Description   Number        
------------------------------------------
1             hi            3.1           
2             hello         4             
3             Join test     4             


Selecting all items: SELECT * FROM ReferenceTable
----------------------------
ID            Description   
----------------------------
1             ref 1         
2             ref 2         


Inner Join Tables: SELECT * FROM Data INNER JOIN ReferenceTable ON (Data.DataLink == ReferenceTable.ID)
------------------------------------------------------------------------------------
ID            Description   Number        DataLink      ID            Description   
------------------------------------------------------------------------------------
1             hi            3.1           1             1             ref 1         
2             hello         4             2             2             ref 2         


Left Outer Join Tables: SELECT * FROM Data LEFT OUTER JOIN ReferenceTable ON (Data.DataLink == ReferenceTable.ID)
------------------------------------------------------------------------------------
ID            Description   Number        DataLink      ID            Description   
------------------------------------------------------------------------------------
1             hi            3.1           1             1             ref 1         
2             hello         4             2             2             ref 2         
3             Join test     4             None          None          None          


Selecting specific rows: SELECT * FROM Data WHERE ID == 1;
------------------------------------------
ID            Description   Number        
------------------------------------------
1             hi            3.1           


Selecting specific columns: SELECT Description FROM Data
--------------
Description   
--------------
hi            
hello         
Join test     


Selecting specific columns from joined tables: SELECT Data.DataLink, Data.Description, ReferenceTable.Description FROM Data INNER JOIN ReferenceTable ON (Data.DataLink == ReferenceTable.ID)
------------------------------------------
DataLink      Data.Desc     Ref.Desc      
------------------------------------------
1             hi            ref 1         
2             hello         ref 2         


Selecting SUM (You can also use COUNT, MAX, MIN) SELECT ID, SUM(Number) FROM Data
----------------------------
ID            SUM(Number)   
----------------------------
3             11.1          


Updated data with UPDATE Data SET Description='Haha hacked' WHERE ID == 1;: SELECT * FROM Data
------------------------------------------
ID            Description   Number        
------------------------------------------
1             Haha hacked   3.1           
2             hello         4             
3             Join test     4             


Deleted data with DELETE FROM Data WHERE ID == 1;: SELECT * FROM Data
------------------------------------------
ID            Description   Number        
------------------------------------------
2             hello         4             
3             Join test     4             
```

## MongoDB

### `pymongo` in Python 3

Opening MongoDB Server (Run the server on the computer first)
```
import pymongo
client = pymongo.MongoClient("127.0.0.1", 27017) # Address, Port
```

Opening Database and Collection within the Database (Creates them if it doesn't exist)
```
db = client.get_database(db_name) # Creates if doesn't exist
coll = db.get_collection(coll_name)
```

Inserting Data into Collection
```sample_data = [
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
```

Getting Results of a Query
```
#first_in_query = coll.find_one(query)
for item in coll.find(query):
    print(item) # Item is a python dictionary
```

Updating a value
```
cond_update = {"number":3}
modifier = {"$set":{"document":{"key":"yes"}}}
#coll.update_one(cond_update,modifier)
coll.update_many(cond_update,modifier)
```

Deleting Items/ Collection/ Database
```
#coll.delete_one(query)
coll.delete_many(query)

db.drop_collection(coll_name)
client.drop_database(db_name)
```

Closing Connection
```
client.close()
```

### Sample MongoDB Commands and Results
Run `NoSQL.py` to get this output
```
Selecting 1 item
    {'_id': ObjectId('5efb2ad5d4d5d1816af4da05'), 'number': 1, 'text': 'Item 1', 'array': [1, 2, 3, 4], 'document': {'key': 'value', 'n': 1}}
Selecting all Items in Collection
{'_id': ObjectId('5efb2ad5d4d5d1816af4da05'), 'number': 1, 'text': 'Item 1', 'array': [1, 2, 3, 4], 'document': {'key': 'value', 'n': 1}}
{'_id': ObjectId('5efb2ad5d4d5d1816af4da06'), 'number': 2, 'text': 'Item 2', 'array': [3, 4, 5, 6]}
{'_id': ObjectId('5efb2ad5d4d5d1816af4da07'), 'number': 3, 'text': 'Item 3, No array'}
{'_id': ObjectId('5efb2ad5d4d5d1816af4da08'), 'number': 3, 'text': 'Item 3 duplicate', 'document': {'key': "I'm better", 'n': 4}}
{'_id': ObjectId('5efb2ad5d4d5d1816af4da09'), 'number': 5, 'text': 'Item 5', 'array': [3, 4, 5, 6]}

-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       
2       Item 2                         [3, 4, 5, 6]         None                           
3       Item 3, No array               None                 None                           
3       Item 3 duplicate               None                 {'key': "I'm better", 'n': 4}  
5       Item 5                         [3, 4, 5, 6]         None                           


Selecting by matching fields: {'number': 1, 'text': 'Item 1'}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       


Selecting by comparions: {'number': {'$gt': 1}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
2       Item 2                         [3, 4, 5, 6]         None                           
3       Item 3, No array               None                 None                           
3       Item 3 duplicate               None                 {'key': "I'm better", 'n': 4}  
5       Item 5                         [3, 4, 5, 6]         None                           


Selecting by comparing in array: {'number': {'$in': [1, 2]}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       
2       Item 2                         [3, 4, 5, 6]         None                           


Selecting with Boolean Operators: {'$and': [{'number': {'$not': {'$gte': 5}}}, {'array': {'$gt': 4}}]}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
2       Item 2                         [3, 4, 5, 6]         None                           


Selecting with $not Operators: {'array': {'$not': {'$gt': 4}}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       
3       Item 3, No array               None                 None                           
3       Item 3 duplicate               None                 {'key': "I'm better", 'n': 4}  


Selecting by comparing items in documents' array: {'array': {'$gte': 5}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
2       Item 2                         [3, 4, 5, 6]         None                           
5       Item 5                         [3, 4, 5, 6]         None                           


Selecting by comparing items in nested documents: {'document.n': {'$gt': 1}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
3       Item 3 duplicate               None                 {'key': "I'm better", 'n': 4}  


####################################################################################################
Updating first item that matches condition: {'number': 3} {'$set': {'document': {'key': 'yes'}}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       
2       Item 2                         [3, 4, 5, 6]         None                           
3       Item 3, No array               None                 {'key': 'yes'}                 
3       Item 3 duplicate               None                 {'key': "I'm better", 'n': 4}  
5       Item 5                         [3, 4, 5, 6]         None                           


Updating some items: {'number': 3} {'$set': {'text': 'erosion of local culture'}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       
2       Item 2                         [3, 4, 5, 6]         None                           
3       erosion of local culture       None                 {'key': 'yes'}                 
3       erosion of local culture       None                 {'key': "I'm better", 'n': 4}  
5       Item 5                         [3, 4, 5, 6]         None                           


Updating and creating new properties for all items: {} {'$set': {'array': [1, 2, 3, 4]}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         [1, 2, 3, 4]         {'key': 'value', 'n': 1}       
2       Item 2                         [1, 2, 3, 4]         None                           
3       erosion of local culture       [1, 2, 3, 4]         {'key': 'yes'}                 
3       erosion of local culture       [1, 2, 3, 4]         {'key': "I'm better", 'n': 4}  
5       Item 5                         [1, 2, 3, 4]         None                           


$unset proporties of items: {} {'$unset': {'array': 'value'}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
1       Item 1                         None                 {'key': 'value', 'n': 1}       
2       Item 2                         None                 None                           
3       erosion of local culture       None                 {'key': 'yes'}                 
3       erosion of local culture       None                 {'key': "I'm better", 'n': 4}  
5       Item 5                         None                 None                           


$inc of items: {} {'$inc': {'number': 1}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
2       Item 1                         None                 {'key': 'value', 'n': 1}       
3       Item 2                         None                 None                           
4       erosion of local culture       None                 {'key': 'yes'}                 
4       erosion of local culture       None                 {'key': "I'm better", 'n': 4}  
6       Item 5                         None                 None                           


####################################################################################################
Deleting first item that matches query {"number":3}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
2       Item 1                         None                 {'key': 'value', 'n': 1}       
4       erosion of local culture       None                 {'key': 'yes'}                 
4       erosion of local culture       None                 {'key': "I'm better", 'n': 4}  
6       Item 5                         None                 None                           


Deleting many items with query {"document":{"$exists":True}}
-------------------------------------------------------------------------------------------
number  text                           array                document                       
-------------------------------------------------------------------------------------------
6       Item 5                         None                 None                           


Deleting rest of collection
>>> 
```