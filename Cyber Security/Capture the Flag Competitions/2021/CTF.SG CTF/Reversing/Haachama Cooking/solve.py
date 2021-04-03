from Crypto.Cipher import AES
import hashlib
import base64


key = b'mysupersecurekey'
IV = list('mysupersecureiv ')
current = ""
IV[15] = chr(0) #If the IV is not 16 bytes, it is normally padded with \x00 (but I did bruteforce through the entire ASCII table and this is the correct byte)
IV = ''.join(IV)
IV = IV.encode()

decode = "20d91f642406ce17432107a0f61a5405c3b45ec744d07c2d3a19649f5ed2c5baff4d15473b92c1d00916790dd14deec77a9d413a1e2fe83f0775bd7d3c984c4c"
contents = b""
for x in range(0, int(len(decode)/2), 1):
    contents += int(decode[x*2:x*2+2], 16).to_bytes(1, byteorder='big')

for x in range(0, len(contents), 16):
    cipher = AES.new(key, AES.MODE_CBC, IV)
    decrypted = cipher.decrypt(contents[x:x+16]).decode()
    print(decrypted)
