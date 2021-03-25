#!/usr/bin/env python

#Subtask 2
#Number of nodes
N=7
output = f"{N} {2*(N-2)}\n"
for i in range(1,N-2 +1): #From 0
    output += f"{0} {i} {1}\n"
for i in range(1,N-2+1): # From each other tunnel
    output += f"{i} {N-1} {1}\n"
    
print(output)
