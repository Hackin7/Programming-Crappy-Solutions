#!/usr/bin/env python
'''
The file trailer 00 3B is actually that of the GIF file
https://wangrui.wordpress.com/2007/06/19/file-signatures-table/
So you can probably just add the footer

Flag: CTFSG{Ju5t_unC0rrupt_4head}
'''

with open("4head","rb") as file:
    data = file.read()
    
with open("4head.gif","wb") as file:
    file.write(b"GIF87a"+data)
