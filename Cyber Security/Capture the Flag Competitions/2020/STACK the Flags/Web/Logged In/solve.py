import requests
#from bs4 import BeautifulSoup

URL = 'http://yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg:41061'

#requests.post(url, data={key: value}, json={key: value}, args)
data = requests.post(URL+"/api/login", data={
    "username":"bob_minion",
    "password":"" #Guess
})
print(data.text)

