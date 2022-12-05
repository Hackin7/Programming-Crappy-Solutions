import sqlite3
import random
import hashlib

userlist = [
    ("%032x" % random.getrandbits(128), "REDACTED", hashlib.md5(b'REDACTED').digest(), 1, "REDACTED"),
    ]

conn = sqlite3.connect('../app/jaga.db')
c = conn.cursor()
c.execute("CREATE TABLE j4g4_us3rs (uid, username, password, role, flag)")
c.executemany('INSERT INTO j4g4_us3rs VALUES (?, ?, ?, ?, ?)',userlist)
conn.commit()
conn.close()