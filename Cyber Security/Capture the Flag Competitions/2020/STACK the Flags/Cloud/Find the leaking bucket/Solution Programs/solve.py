import requests

from givenwordlist import *

stuff = []
import sys
for x in lst:
    for y in lst:
        #sys.stdout.write(f'{x} {y}\n')
        url = "https://"+x+"-"+y+"-s4fet3ch.s3-ap-southeast-1.amazonaws.com/"
        data = requests.get(url)
        if data.status_code != 404:
            stuff.append((x, y, url))
            print(data)
            print(data.text)
print(stuff)        
