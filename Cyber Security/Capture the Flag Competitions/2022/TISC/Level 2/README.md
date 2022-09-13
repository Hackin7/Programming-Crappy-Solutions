# Level 2
![](Pasted%20image%2020220827005348.png)

Easy Challenge, just basic math lol
https://api.tisc.csit-events.sg/file?id=cl6j1u5ua09al0838dm6l6udp&name=2WKV_Whitepaper.pdf


## Solution

## Matrix Multiplication

On reading the PDF document, you can find the code for the server and a brief explanation.

The code generates an 8x8 matrix SECRET_KEY. You can provide challenge to get a response 8 times. Then they give you the challenge inputvector, and you are supposed to return the correct response input vector 8 times. If all is correct you are verified and you get the flag.

![](Pasted%20image%2020220827012348.png)

**Refresher on matrix multiplication (Secondary School topic)**

![](Pasted%20image%2020220827012130.png)

We can give a vector with only 1 value set to 1, (eg. `10000000`) to find 8 corresponding values in the SECRET_KEY matrix. We can repeat this 8 times to get the entire matrix

### Solution Script and Command Output

```python
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
```

```bash
(base) [hacker@hackerbook Level 2]$ python3 solution.py 
InputVector: 10010100
11011110
InputVector: 01010111
01011010
InputVector: 00000111
10000011
InputVector: 00011011
10010000
InputVector: 11110101
01100110
InputVector: 00100011
00001100
InputVector: 10100111
00101001
InputVector: 10110000
01010001
(base) [hacker@hackerbook Level 2]$ 
```

```bash
[hacker@hackerbook src]$ nc chal00bq3ouweqtzva9xcobep6spl5m75fucey.ctf.sg 56765

 ::::::::        :::       :::     :::     :::   :::
:+:    :+:       :+:       :+:   :+: :+:   :+:   :+:
      +:+        +:+       +:+  +:+   +:+   +:+ +:+
    +#+          +#+  +:+  +#+ +#++:++#++:   +#++:
  +#+            +#+ +#+#+ +#+ +#+     +#+    +#+
 #+#              #+#+# #+#+#  #+#     #+#    #+#
##########         ###   ###   ###     ###    ###

:::    ::: :::::::::: :::   :::          :::               :::
:+:   :+:  :+:        :+:   :+:         :+:                 :+:
+:+  +:+   +:+         +:+ +:+         +:+                   +:+
+#++:++    +#++:++#     +#++:         +#+    +#++:++#++:++    +#+
+#+  +#+   +#+           +#+           +#+                   +#+
#+#   #+#  #+#           #+#            #+#                 #+#
###    ### ##########    ###             ###              ###

:::     ::: :::::::::: :::::::::  ::::::::::: :::::::::: :::   :::
:+:     :+: :+:        :+:    :+:     :+:     :+:        :+:   :+:
+:+     +:+ +:+        +:+    +:+     +:+     +:+         +:+ +:+
+#+     +:+ +#++:++#   +#++:++#:      +#+     :#::+::#     +#++:
 +#+   +#+  +#+        +#+    +#+     +#+     +#+           +#+
  #+#+#+#   #+#        #+#    #+#     #+#     #+#           #+#
    ###     ########## ###    ### ########### ###           ###

=============
Challenge Me!
=============
Challenge Me #01 <-- 10000000
01000000
00100000
00010000
00001000
00000100
00000010
00000001
My Response --> 00111100
Challenge Me #02 <-- My Response --> 00100010
Challenge Me #03 <-- My Response --> 10010110
Challenge Me #04 <-- My Response --> 11111011
Challenge Me #05 <-- My Response --> 11110001
Challenge Me #06 <-- My Response --> 00011001
Challenge Me #07 <-- My Response --> 10010110
Challenge Me #08 <-- My Response --> 00001100
==============
Challenge You!
==============
Challenge You #01 --> 10010100
Your Response <-- 11011110
Challenge You #02 --> 01010111
Your Response <-- 01011010
Challenge You #03 --> 00000111
Your Response <-- 10000011
Challenge You #04 --> 00011011
Your Response <-- 10010000
Challenge You #05 --> 11110101
Your Response <-- 01100110
Challenge You #06 --> 00100011
Your Response <-- 00001100
Challenge You #07 --> 10100111
Your Response <-- 00101001
Challenge You #08 --> 10110000
Your Response <-- 01010001
========================
All challenges passed :)
========================
=================================================================
Here is your flag: TISC{d0N7_R0lL_Ur_0wN_cRyp70_7a25ee4d777cc6e9}
=================================================================
[hacker@hackerbook src]$ 
```

## Flag

`TISC{d0N7_R0lL_Ur_0wN_cRyp70_7a25ee4d777cc6e9}`


Ego Boost at 2:12am on 27/8/22

![](Pasted%20image%2020220827021200.png)
