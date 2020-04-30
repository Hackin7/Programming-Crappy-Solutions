def woah(s1,s2):
    return ''.join(chr(ord(a) ^ ord(b)) for a,b in zip(s1,s2))

import base64
key = "meownyameownyameownyameownyameownya"

result = b'HxEMBxUAURg6I0QILT4UVRolMQFRHzokRBcmAygNXhkqWBw='
b = base64.b64decode(result, altchars=None)
a = bytes.decode(b)
userinput = woah(key,a)
print(userinput)

'''
Flag: rtcp{y0u_L3fT_y0uR_x0r_K3y_bEh1nD!}
'''
