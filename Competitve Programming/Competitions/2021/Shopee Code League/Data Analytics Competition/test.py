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
            print(item[key], end=',')
            data[key].append(item[key])
    break
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
#print(len(emailLinked.items()))
#print(emailLinked['WwMWpTfwipapFMkZN@yahoo.com'])

### Test if 1 user can have more than one OrderId
def testMultipleKey(linked, key):
    for item in linked:
        if len(linked[item][key]) > 1 :
            print(linked[item])

print("### Testing if email/ phone linked to more than one OrderId #########")
testMultipleKey(emailLinked, "OrderId")
testMultipleKey(emailLinked, "Phone")
testMultipleKey(phoneLinked, "OrderId")
print("#####################################################################")
# Since nothing is printed out, is all one to one to one

'''
def getUsers(emailLinked, phoneLinked):
    users = []
    for email in emailLinked.keys():
        user = {"Email": email}
        user["Phone"] = emailLinked[email]["Phone"]
        user["OrderId"] = emailLinked[email]["OrderId"]
        users.append(user)
    for phone in phoneLinked.keys():
        if len(phoneLinked[phone]["Email"]) == 0:
            user = {}
            user["OrderId"] = phoneLinked[phone]["OrderId"]
            users.append(user)
    return users

#users = getUsers(emailLinked, phoneLinked)

#print(users[1:50])
'''

### Populating Unfinished Data
import copy
mainList = copy.deepcopy(jsonData)


def properUpdate(dict1, dict2, keys):
    for key in keys:
        if dict1[key] != "" and dict1[key] != dict2:
            return False # Improper match
    return True
    
count = 0
for key in range(len(mainList)):
    email, phone = mainList[key]["Email"], mainList[key]["Phone"]
    if email != '':
        if len(emailLinked[email]["Phone"]) > 0:
            mainList[key]["Phone"] = emailLinked[email]["Phone"][0]
        if len(emailLinked[email]["OrderId"]) > 0:
            mainList[key]["OrderId"] = emailLinked[email]["OrderId"][0]
    elif phone != '':
        if len(phoneLinked[phone]["OrderId"]) > 0:
            mainList[key]["OrderId"] = phoneLinked[phone]["OrderId"][0]
    ### testing
    i = key
    if mainList[i] != jsonData[i]:
        if not properUpdate(jsonData[i], mainList[i], ["Email", "Phone"] ):
            key = "Phone"
            email, phone = mainList[i]["Email"], mainList[i]["Phone"]
            if jsonData[i][key] != mainList[i][key] and jsonData[i][key] != "":
                print(mainList[i], jsonData[i], emailLinked[email]["Phone"])
            count += 1
        
print(count)
#print(mainList[0:50])

### Addition of Contacts
def getUser(item):
    user = {key: value for key, value in item.items()
            if key in ["Email", "Phone"]}#, "OrderId"]}
    return user
outputData = {}
for item in mainList:
    user = getUser(item)
    if outputData.get(str(user)) == None:
        outputData[str(user)] = {"Ids":[], "Contacts":0}
    outputData[str(user)]["Ids"].append(item['Id'])
    outputData[str(user)]["Contacts"] += item["Contacts"]
    #print(outputData)


#for i in list(outputData.keys()):print(i)

print("### Writing Final Output ###########################")
### Output Code
def outputToCSV():
    def stringify(lis_of_id):
      lis_of_id = sorted(lis_of_id)
      out =  '-'.join([str(x) for x in lis_of_id])
      return out
    
    count = 0
    import csv
    with open('output.csv', 'w', newline='') as outfile:
        csv_writer = csv.writer(outfile, delimiter=',', quotechar='"', quoting=csv.QUOTE_MINIMAL)
        csv_writer.writerow(["ticker_id", "ticket_trace/contact"])
        output = []
        for item in mainList:
            user = str(getUser(item))
            csv_writer.writerow(
                [
                    item["Id"], 
                    stringify(outputData[user]["Ids"])+", "+str(outputData[user]["Contacts"])
                 ]
            )
            count += 1
            if count % 10000 == 0:print(count)
    print("Total Items:", count)



print("### Outputting #########################")
outputToCSV()
    
        
    
    
