#!/usr/bin/env python

with open('conjoined.gif','rb') as f:
    data = f.read()

print(data[:4])
#https://stackoverflow.com/questions/3217334/searching-reading-binary-data-in-python
index = data.find(b'\xff\xd8\xff')#b'JFIF')

print(index)
with open('new.jpeg','wb') as f:
    f.write(data[index:])

#Flag: CTFSG{c0nj01n3d_n0_mor3}
