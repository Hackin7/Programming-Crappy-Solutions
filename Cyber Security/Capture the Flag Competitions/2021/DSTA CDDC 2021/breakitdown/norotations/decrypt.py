# Simple Substitution Cipher

f = 'TOOT21{rWfrJsjwJspl_TsBiAcslu}'
key = 'MFTOAYUISVKXNLPBDCRJWQEGHZ'

matching = {}
charindex = 0
for c in key:
    matching[c.upper()] = chr(65+charindex)
    matching[c.lower()] = chr(97+charindex)
    charindex +=1

flag = ''
for i in f:
    try:
        flag += matching[i]
    except: flag += i

print(flag)
