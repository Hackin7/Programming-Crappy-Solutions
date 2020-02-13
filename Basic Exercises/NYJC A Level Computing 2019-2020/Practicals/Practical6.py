#!/usr/bin/env python
# Practical 6
## Q1 ######################################################################################################
accounts = {"user1":"password1",\
            "user2":"password2",\
            "user3":"password3",\
            "user4":"password4",\
            "user5":"password5"}
            
loggedIn = False #when username or password still wrong
while not loggedIn: #Continue running while not logged in
    username = input("Enter the username: ")
    password = input("Enter the password: ")

    if username not in accounts.keys(): #Cannot find username
        print("User not found\n")
    elif accounts[username] != password:
        print("Wrong Password\n")
    elif accounts[username] == password:
        print("You are in")
        loggedIn = True
    
## Q2 ######################################################################################################
def is_balanced(color):
    if 0 < color['R'] < 1 and \
       0 < color['G'] < 1 and \
       0 < color['B'] < 1 and \
       (color['R'] + color['G'] + color['B'] == 1): 
           return True
    return False


print(is_balanced({'R':0.5,'G':0.4,'B':0.2}))

## Q3 ######################################################################################################
def dict_intersect(dict1,dict2):
    newdict = {}
    for key in dict1.keys():
        if key in dict2.keys(): # If both have same key
            if dict1[key] == dict2[key]:  #And Same Value
                newdict[key] = dict1[key] #Include in new dict
    return newdict

print("dict_intersect {1:2,2:3,3:3} {2:3,3:4,4:5}:",dict_intersect({1:2,2:3,3:3},{2:3,3:4,4:5}))

## Q4a #####################################################################################################
def sparse_add(sparseVector1, sparseVector2):
    newVector = {} #Result of operation
    for key in sparseVector1.keys():
        if key in sparseVector2.keys():#If both have values at that dimension
            newVector[key] = sparseVector1[key]+sparseVector2[key]
        else: 
            newVector[key] = sparseVector1[key] #Add to 0 at that key
            
    for key in sparseVector2.keys(): #For other keys not in vector1
        if key not in sparseVector1.keys(): 
            newVector[key] = sparseVector2[key] #Add to 0 at that key
    return newVector
            
print("{1:2,2:3,3:3}+{2:3,3:4,4:5}:",sparse_add({1:2,2:3,3:3},{2:3,3:4,4:5}))

## Q4b #####################################################################################################
def sparse_dot(sparseVector1,sparseVector2):
    dotProduct = 0
    #If both have values at that dimension
    for key in sparseVector1.keys(): 
        if key in sparseVector2.keys(): 
            #Sum of products of corresponding elements
            dotProduct += sparseVector1[key] * sparseVector2[key] 
    return dotProduct

print("{1:2,2:3,3:3}.{2:3,3:4,4:5}:",sparse_dot({1:2,2:3,3:3},{2:3,3:4,4:5}))
