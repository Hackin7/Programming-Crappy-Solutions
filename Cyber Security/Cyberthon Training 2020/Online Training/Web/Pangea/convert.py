#!/usr/bin/env python

import json
country_code = {}
with open('countries from web.json') as f:
    country_code = json.loads(f.read())
    
output = {}
for i in country_code:
    output[i["Name"]] = i["Code"]
    
with open('countries.json','w') as f:
    f.write(json.dumps(output))
    
