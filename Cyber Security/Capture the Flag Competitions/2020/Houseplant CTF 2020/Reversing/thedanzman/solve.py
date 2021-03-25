def nope(s1,s2):
    return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))

def wow(x):
  return x[::-1]

import base64
import codecs


key = "nyameowpurrpurrnyanyapurrpurrnyanya"
key = codecs.encode(key, "rot_13")

result = "'=ZkXipjPiLIXRpIYTpQHpjSQkxIIFbQCK1FR3DuJZxtPAtkR'o"
d = wow(result)
c = codecs.decode(d, 'rot_13')[2:-1] #Slicing to remove b' and '
print(c) 
#c = bytes(c, encoding='ascii')
b = base64.b64decode(c, altchars=None)
a = bytes.decode(b)#, encoding="ascii")
userinput = nope(key,a)
print(userinput)

'''
Flag: rtcp{n0w_tH4T_w45_m0r3_cH4lL3NgiNG}
'''
