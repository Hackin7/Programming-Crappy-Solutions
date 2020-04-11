#!/usr/bin/env python

from binascii import unhexlify
data = open('./corrupted.jpg','rb').read()
output = unhexlify('ffd8ffe0')+data[4:]
open('uncorrupted.jpg','wb').write(output)
