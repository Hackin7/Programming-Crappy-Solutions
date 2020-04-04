#!/usr/bin/env python
import sqlite3
conn = sqlite3.connect("./terriblesql.db")
# Opening in db browser, you notice a USERS table

result = ''
#https://coderwall.com/p/ugzauq/sqlite-substring-from-right
##Part 1
print("#########Part 1############")
c = conn.execute("SELECT name,age FROM USERS WHERE substr(name,0,4)='She' ORDER BY AGE DESC")
for i in c: 
    print(i,i[0].split(" ")[0][-3:])
    result+=i[0].split(" ")[0][-3:]
    break

##Part 2
print("#########Part 2############")
c = conn.execute("SELECT Name FROM USERS WHERE NAME LIKE '%bert%' AND `AGE`==17")
for i in c:
    print(i,i[0][-3:])
    result+=i[0][-3:]
    break

print(result)
##Part 3
# https://python-forum.io/Thread-how-to-convert-a-string-to-hex
print("#########Part 3############")
#c = conn.execute("SELECT substr(Name,-4), FROM USERS WHERE NAME LIKE '% Gil%' AND CAST(name AS VARBINARY(8)) LIKE '%656C6%' AND LENGTH(name)=14")
c = conn.execute("SELECT name FROM USERS WHERE NAME LIKE '% Gil%' AND LENGTH(name)=14")
for i in c: 
    print(i, i[0].encode().hex())
    if '656c6' in i[0].encode().hex():
        print("yes")
        result+=i[0][-4:]
        break

conn.close()
print("CTFSG{"+result+"}")
