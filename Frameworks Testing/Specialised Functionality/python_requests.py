import requests
URL = 'http://example.com/'

def showResponse(response):
    print(response.text)
    print(response)
    print(response.headers)
    
### POST ##############################################
data = {}
response = requests.post(URL, data=data)
showResponse(response)
print("#"*100)
### GET ##############################################
data = {}
response = requests.get(URL, params=data) #headers=headers)
showResponse(response)
