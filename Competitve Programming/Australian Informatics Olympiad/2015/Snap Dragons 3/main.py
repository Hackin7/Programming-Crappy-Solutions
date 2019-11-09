#!/usr/bin/env python

infile = open("snapin.txt", "r")
outfile = open("snapout.txt", "w")

data = infile.read().split()
N = int(data[0])
#print(v)
v = [int(i) for i in data[1:]]

#print(N, v)

s = set(v)
pairs = 0
for i in s:
    if i==N: continue
    #print(i, v.count(i))
    pairs += v.count(i) // 2

#print(pairs)
outfile.write(str(pairs))
infile.close()
outfile.close()
