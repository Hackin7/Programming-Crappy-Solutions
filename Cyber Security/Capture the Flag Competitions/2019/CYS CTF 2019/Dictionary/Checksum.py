# Python program to find SHA256 hexadecimal hash string of a file
import hashlib

h = "88ff321cdc359c1ba30216b554a49b08697b9839c2d8b39a955928ca17bc3f7a"
# Use hash analyser to identify hash is sha2-256
f = open("lookup.lst")

ans = ""
for line in f:
    readable_hash = hashlib.sha256(line[:-1].encode('utf-8')).hexdigest()
    if h == readable_hash:
        print(line)
        break
    
f.close()
