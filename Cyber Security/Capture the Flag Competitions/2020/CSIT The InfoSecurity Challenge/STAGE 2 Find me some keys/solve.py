import hashlib

# TISC20{dc2c13aaaeb32b761472aad9eaf4d3ba3298a193ed7f18e237c3ebffb0d2bdd5}
import base64
with open('ascii-key-file.txt','rb') as f:
    data = f.read()

base64Data = base64.b64encode(data)
print(base64Data.decode('ascii'))
print(hashlib.sha256(base64Data).hexdigest())
exit()
###########################################

data = """MIICXgIBAAKBgQDuLnQAI3mDgey3VBzWnB2L39JUU4txjeVE6myuDqkM/uGlfjb9
SjY1bIw4iA5sBBZzHi3z0h1YV8QPuxEbi4nW91IJm2gsvvZhIrCHS3l6afab4pZB
l2+XsDulrKBxKKtD1rGxlG4LjncdabFn9gvLZad2bSysqz/qTAUStTvqJQIDAQAB
AoGAGRzwwir7XvBOAy5tM/uV6e+Zf6anZzus1s1Y1ClbjbE6HXbnWWF/wbZGOpet
3Zm4vD6MXc7jpTLryzTQIvVdfQbRc6+MUVeLKwZatTXtdZrhu+Jk7hx0nTPy8Jcb
uJqFk541aEw+mMogY/xEcfbWd6IOkp+4xqjlFLBEDytgbIECQQDvH/E6nk+hgN4H
qzzVtxxr397vWrjrIgPbJpQvBsafG7b0dA4AFjwVbFLmQcj2PprIMmPcQrooz8vp
jy4SHEg1AkEA/v13/5M47K9vCxmb8QeD/asydfsgS5TeuNi8DoUBEmiSJwma7FXY
fFUtxuvL7XvjwjN5B30pNEbc6Iuyt7y4MQJBAIt21su4b3sjXNueLKH85Q+phy2U
fQtuUE9txblTu14q3N7gHRZB4ZMhFYyDy8CKrN2cPg/Fvyt0Xlp/DoCzjA0CQQDU
y2ptGsuSmgUtWj3NM9xuwYPm+Z/F84K6+ARYiZ6PYj013sovGKUFfYAqVXVlxtIX
qyUBnu3X9ps8ZfjLZO7BAkEAlT4R5Yl6cGhaJQYZHOde3JEMhNRcVFMO8dJDaFeo
f9Oeos0UUothgiDktdQHxdNEwLjQf7lJJBzV+5OtwswCWA=="""

choices = []
choices.append(hashlib.sha256(bytes(data,'ascii')).hexdigest())
choices.append(hashlib.sha256(bytes(data.replace('\n',''),'ascii')).hexdigest())
# utf-8 seems the same as ascii
#choices.append(hashlib.sha256(bytes(data,'utf-8')).hexdigest())
#choices.append(hashlib.sha256(bytes(data.replace('\n',''),'utf-8')).hexdigest())

'''
with open("Extracted/key",'rb') as f:
    d = f.read()
    choices.append(hashlib.sha256(d).hexdigest())
    
with open("b64ans.txt") as f:
    d = f.read()
    choices.append(hashlib.sha256(bytes(d,'ascii')).hexdigest())
    #choices.append(hashlib.sha256(bytes(d,'utf-8')).hexdigest())
'''

print('TISC20{799f319d8400243a8331d70ae7df4bacf0290dca303b138b03263655e9548caf}')
print()
for i in choices:
    print("TISC20{"+i+"}")
    #print("TISC20{"+i.upper()+"}")
