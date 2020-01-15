from flask import Flask, render_template, request
app = Flask(__name__)
import json

@app.route('/')
def index():
    return "Invalid"
    
import random
#https://pynative.com/python-generate-random-string/
import string
def randomString(stringLength=10):
    """Generate a random string of fixed length """
    letters = string.ascii_lowercase
    return ''.join(random.choice(letters) for i in range(stringLength))

from mongoDatabase import Database, OldDatabase
try:
    db = Database()
except Exception as e:
    print("Error",e)
    db = OldDatabase()

@app.route('/createaccount', methods=['POST'])
def createAccount():
    data = json.loads(request.data)
    name = data['name']
    password = data['password']
    #print("HHHHHHHHHHHHH")
    #print("Password:",password)
    valid = db.addAccount(name,password)
    
    return json.dumps({"valid":valid})
    
@app.route('/login', methods=['POST'])
def authentication():
    db.debug()
    data = json.loads(request.data)
    name = data['name']
    password = data['password']
    userid=""
    valid=False
    if db.getPassword(name) == password:
        userid=db.getIdFromName(name)
        valid=True

    
    return json.dumps({"id":userid, "valid":valid})
    
    
@app.route('/authid', methods=['POST'])
def authenticationID():
    data = json.loads(request.data)
    name = data['name']
    userid = data['id']
    #print(request.data, name, password)
    password=""
    valid=False
    
    if db.getNameFromID(userid) == name:
        password=db.getPassword(name)
        valid=True
    return json.dumps({"password":password, "valid":valid})
    
@app.route('/notes', methods=['POST'])
def retrieveNotes():
    ###Data Processing#####################
    data = json.loads(request.data)
    user = db.getNameFromID(data["userID"])
    ########################################
    
    userDataStuff = db.getUserData(user)
    return json.dumps({"notes":userDataStuff})
    

@app.route('/update', methods=['POST'])
def updateNotes():
    ###Data Processing#####################
    data = json.loads(request.data)
    user = db.getNameFromID(data["userID"])

    noteID = data["noteID"]
    newValue = data["value"]
    #######################################
    
    userDataStuff = db.getUserData(user)
    userDataStuff[noteID] = newValue
    db.updateUserData(user,userDataStuff)
    
    db.debug()
    return "OK"
    
    
@app.route('/delete', methods=['POST'])
def delete():
    ###Data Processing#####################
    data = json.loads(request.data)
    user = db.getNameFromID(data["userID"])

    noteID = data["noteID"]
    ######################################
    userDataStuff = db.getUserData(user)
    userDataStuff.pop(noteID)
    db.updateUserData(user,userDataStuff)
    
    db.debug()
    return "OK"
    
@app.route('/add', methods=['POST'])
def add():
    ###Data Processing#####################
    data = json.loads(request.data)
    user = db.getNameFromID(data["userID"])
    #######################################
    userDataStuff = db.getUserData(user)
    userDataStuff += ['']
    db.updateUserData(user,userDataStuff)
    db.debug()
    return "OK"
'''  
import sys
try:
    print(sys.argv[1])
    port = int(sys.argv[1])
except:port=5000
'''

if __name__ == '__main__':
    #port = int(os.environ.get('PORT'))
    app.run( debug=True, use_reloader=True)
#app.run()#debug=True, host='0.0.0.0')

