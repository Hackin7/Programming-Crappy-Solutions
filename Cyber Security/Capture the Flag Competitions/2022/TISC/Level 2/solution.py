#!/usr/bin/python

"""
# Answers
10000000
01000000
00100000
00010000
00001000
00000100
00000010
00000001
"""

responses = """
00111100
00100010
10010110
11111011
11110001
00011001
10010110
00001100
""".strip().split("\n")

import numpy as np

def strtovec(s, rows=8, cols=1):
  return np.fromiter(list(s), dtype="int").reshape(rows, cols)

SKEY = [ [0 for j in range(8)] for i in range(8)]  
for i in range(len(responses)): # lines
  for j in range(8): 
    SKEY[j][i] = int(responses[i][j])
  
# for i in SKEY: print(i) # Visualise
SECRET_KEY = np.array(SKEY)


for i in range(8):
  input_vec = strtovec(input("InputVector: "))
  answer_vec = (SECRET_KEY @ input_vec) & 1
  output = ""
  for i in answer_vec:
    output += str(i[0])
  print(output)
