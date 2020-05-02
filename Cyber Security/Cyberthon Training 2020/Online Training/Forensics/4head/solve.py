#!/usr/bin/env python
with open("4head","rb") as file:
    data = file.read()
    
with open("4head.gif","wb") as file:
    file.write(b"GIF87a"+data)
