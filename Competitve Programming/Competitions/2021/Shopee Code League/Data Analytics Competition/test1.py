def dataInput(filename="contacts.json"):
  import json
  with open(filename) as infile:
    jsonData = json.loads(infile.read())
  return jsonData

def lookupGen(jsonData, key):
  output = {}
  for item in jsonData:
    if item[key] != "" and output.get(item[key]) == None:
      output[item[key]] = []
    if item[key] != "": output[item[key]].append(item)
  return output

### Extract linked emails/ phone numbers
def linkedData(lookup, keys=["Phone","OrderId"]):
  data = {}
  for key in keys: data[key] = []

  for item in lookup:
    for key in keys:
        if item[key] != "" and item[key] not in data[key]:
            data[key].append(item[key])
  return data

## Link one to two others
def pair_data(lookup, keys=["Phone","OrderId"]):
  data = {}
  for key in lookup.keys(): #eg. email
    #print(key)
    data[key] = linkedData(lookup[key], keys)
  return data




jsonData = dataInput()#"sample.json")

emailLookup = lookupGen(jsonData, "Email")
phoneLookup = lookupGen(jsonData, "Phone")
orderIdLookup = lookupGen(jsonData, "OrderId")

emailLinked = pair_data(emailLookup, ["Phone", "OrderId"])
phoneLinked = pair_data(phoneLookup, ["Email", "OrderId"])
orderIdLinked = pair_data(orderIdLookup, ["Email", "Phone"])

userEmails = {}
userPhones = {}
userOrderId = {}


def dfsEmail(email, userID):
    if userEmails.get(email) == None:
        userEmails[email] = userID
        for phone in emailLinked[email]["Phone"]:
            dfsPhones(phone, userID)
        for orderId in emailLinked[email]["OrderId"]:
            dfsOrderId(orderId, userID)

def dfsPhones(phone, userID):
    if userPhones.get(phone) == None:
        userPhones[phone] = userID
        return
        for email in phoneLinked[phone]["Email"]:
            dfsEmail(email, userID)
        for orderId in phoneLinked[phone]["OrderId"]:
            dfsOrderId(orderId, userID)

def dfsOrderId(orderId, userID):
    if userOrderId.get(orderId) == None:
        userOrderId[orderId] = userID
        for email in orderIdLinked[orderId]["Email"]:
            dfsEmail(email, userID)
        for phone in orderIdLinked[orderId]["Phone"]:
            dfsPhones(phone, userID)

print("### DFS linking")
userId = 0
for email in emailLinked.keys():
    dfsEmail(email, userId)
    userId += 1
    if userId % 1000 == 0: print(userId, email)
    #if userId > 1000: break


print(userEmails, userPhones, userOrderId)


    

    
