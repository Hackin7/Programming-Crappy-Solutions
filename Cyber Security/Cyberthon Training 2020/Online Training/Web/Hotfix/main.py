#!/usr/bin/env python
import sqlite3
conn = sqlite3.connect("test.db")
try:
    conn.execute("DROP TABLE USERS")
except:
    pass
conn.execute("CREATE TABLE USERS(`username` TEXT,`password` TEXT)")
conn.execute("INSERT INTO USERS(username,password) VALUES(?,?)",("admin","ppassword"))
for i in conn.execute("SELECT * FROM USERS"):
    print(i)
    
print("----------------")
#############################################
import re
n = "ad'minʼ--" #"admin'--"
print(n)
n = n.replace("admin","")
n = re.sub("\'", "", n)
n = re.sub("\s+", "", n)
p="password"
#import hashlib
#p=p.hashlib.md5(p.encode())

statement = "SELECT * FROM USERS WHERE username='"+n+"' AND password='"+p+"'"
print(statement)
for i in conn.execute(statement):
    print(i)
conn.close()
