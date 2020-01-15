#!/usr/bin/env python

#https://www.w3schools.com/python/python_mongodb_getstarted.asp
import pymongo

import random
#https://pynative.com/python-generate-random-string/
import string
def randomString(stringLength=10):
    """Generate a random string of fixed length """
    letters = string.ascii_lowercase
    return ''.join(random.choice(letters) for i in range(stringLength))
    
class Database:
    def __init__(self, link="mongodb://localhost:27017/"):
        #Put your stuff inside a key.txt
        print("Connecting to",link)
        self.client = pymongo.MongoClient(link)
        #Creates if doesn't exist
        self.name = "react-notes"
        self.database = self.client[self.name]
        self.accounts = self.database["accounts"]
        self.userdata = self.database["user-data"]

        self.accountIDs = {}#{"1234":"lolcatz"}
    
    def debug(self):
        #print(self.accounts)
        print("Accounts")
        for i in self.accounts.find():print(i)
        print(self.accountIDs)
        #print(self.userData)
        print("UserData")
        for i in self.userdata.find():print(i)
        
    ###MongoDB Code###########################
    def addAccount(self, name, password):
        print("addAccount",name,password)
        if self.hasAccount(name): 
            return False
        #self.accounts[name] = password
        self.accounts.insert_one({"name":name, "password":password})
        
        # Create ID
        userID = randomString(10)
        while userID in self.accountIDs.keys():userID = randomString(10)
        self.accountIDs[userID] = name
        
        #self.userData[name] = []
        self.userdata.insert_one({"name":name, "data":[]})
        return True
        
    def hasAccount(self, name):
        myquery = { "name": name }
        user = self.accounts.find(myquery)
        
        print("hasAccount",name,"=>",user.count())
        self.debug()
        return user.count()
        #return name in self.accounts.keys()
        
    def getPassword(self, name):
        myquery = { "name": name }
        password = self.accounts.find_one(myquery)["password"]
        return password
        
    def getUserData(self, name):
        myquery = { "name": name }
        user = self.userdata.find_one(myquery)
        print(name, user)
        if user==None:return []
        userdata = user["data"]
        return userdata
    
    def updateUserData(self, name, data):
        myquery = { "name": name }
        self.userdata.update_one(myquery, {"$set":{"data":data}})
    ###Local Storage################################
    def getIdFromName(self, name):
        key_list = list(self.accountIDs.keys()) 
        val_list = list(self.accountIDs.values()) 
        if name not in val_list:
            userID = randomString(10)
            while userID in self.accountIDs.keys():userID = randomString(10)
            self.accountIDs[userID] = name
            #return userID
        return key_list[val_list.index(name)]
    
    def getNameFromID(self, userid):
        try:
            return self.accountIDs[userid]
        except:
            return ""
    #################################################
        
    def remove(self):
        # To Remove a collection
        #self.accounts.drop()
        self.client.drop_database(self.name)
        print("Database Removed")



class OldDatabase:
    def __init__(self):
        print("Using Python Variables as Temporary Database")
        self.accounts = {"lolcatz":"shit"}
        self.accountIDs = {}#{"1234":"lolcatz"}
        self.userData = {"lolcatz":["1","2"]}
    
    def debug(self):
        print(self.accounts)
        print(self.accountIDs)
        print(self.userData)
        
    def addAccount(self, name, password):
        if db.hasAccount(name): return False
        self.accounts[name] = password
        # Create ID
        userID = randomString(10)
        while userID in self.accountIDs.keys():userID = randomString(10)
        self.accountIDs[userID] = name
        
        self.userData[name] = []
        return True
    def hasAccount(self, name):
        return name in self.accounts.keys()
    def getPassword(self, name):
        return self.accounts[name]
        
    def getIdFromName(self, name):
        key_list = list(self.accountIDs.keys()) 
        val_list = list(self.accountIDs.values()) 
        if name not in val_list:
            userID = randomString(10)
            while userID in self.accountIDs.keys():userID = randomString(10)
            self.accountIDs[userID] = name
            #return userID
        return key_list[val_list.index(name)]
    
    def getNameFromID(self, userid):
        try:
            return self.accountIDs[userid]
        except: 
            return ""
    def getUserData(self, name):
        return self.userData[name]
    def updateUserData(self,name, data):
        self.user = data
if __name__ == '__main__':
    stuff = input("Enter 'remove' to reset database: ")
    if stuff == "remove":
        db = Database()
        db.remove()
    else:
        print("Database not removed")
        
