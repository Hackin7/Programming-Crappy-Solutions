import requests

from givenwordlist import *

stuff = []
import sys
for x in lst:
    for y in lst:
        sys.stdout.write(f'{x} {y}\n')
        data = requests.get("https://"+x+"-"+y+"-s4fet3ch.s3-ap-southeast-1.amazonaws.com/")
        if data.status_code != 404:
            stuff.append((x, y))
            print(data)
            print(data.text)
        
