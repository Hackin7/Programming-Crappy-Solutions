#!/usr/bin/python
import binascii
from z3 import *

### Trying to reverse ################################################
'''
Finding bit width:
1 block is 16 characters * 8 = 128
'''

key1, key2, key3 = BitVecs('key1 key2 key3', 128)

def encryptionCondition(msg, key):
    return f"(({msg}&{key})^{key})"
def multiEncrypt(msg, keys):
    curr = msg
    for i in keys:
        curr = encryptionCondition(curr, i)
    return curr
def conditions(msgSlices, encodedSlices):
    conditionsStr = ""
    for i in range(len(msgSlices)):
        msg = msgSlices[i]
        enc = encodedSlices[i]
        c = multiEncrypt(msg, ("key1", "key2", "key3"))
        conditionsStr += f"{c} == {enc} ,\n"
    return conditionsStr[:-2]
def z3Solve(msgSlices, encodedSlices):
    c = conditions(msgSlices, encodedSlices)

    #print(f"solve({c})")
    #exec(f"solve({c})")

    s = Solver()
    exec(f"s.add({c})")
    s.check()
    m = s.model()
    return [x.as_long() for x in (m[key1], m[key2], m[key3] )]

### Decoding ################################################################

def getKeyFromVals(keyVals):
    key_bytes = b''
    for i in keyVals:
        key_bytes += i.to_bytes(BLOCK_SIZE, "big")
    #print(len(key_bytes))
    return (key_bytes)


### Preprocessing ##########################################################
BLOCK_SIZE = 16
ROUNDS = 3
def pad(msg):
    if len(msg) % BLOCK_SIZE != 0:
        return msg + (bytes([0]) * (BLOCK_SIZE - (len(msg) % BLOCK_SIZE)))
    else:
        return msg
def solveForKey(messages, encodes):
    ### Preprocessing: DONE ######################
    msgSlices = []
    for msg in messages:
        m = pad(binascii.unhexlify(msg))
        for i in range(0, len(m), BLOCK_SIZE):
            block = m[i:i+BLOCK_SIZE]
            slice =  int.from_bytes(block, "big")
            msgSlices.append(slice)

    encodedSlices = []
    for m in encodes:
        for i in range(0, len(m), BLOCK_SIZE*2):
            block = m[i:i+BLOCK_SIZE*2]
            slice =  int(block, 16)
            encodedSlices.append(slice)

    if True:
        print("#"*80)
        for i in range(len(msgSlices)):
            print(msgSlices[i], encodedSlices[i])
        print("#"*80)

    keyVals = z3Solve(msgSlices, encodedSlices)
    #print(keyVals)
    key = getKeyFromVals(keyVals)
    return key
    print(key)
    #exec(f"solve({c})")

if __name__ == "__main__":
    msgs = [ x*4 for x in "abcedf"]
    encs = [
        "46081990ded148458c6c8ac01500cc82",
        "46081990ded148458c6c8ac01500cc82",
        "02081990ded148458c6c8ac01500cc82",
        "02081990ded148458c6c8ac01500cc82",
        "02081990ded148458c6c8ac01500cc82",
        "02081990ded148458c6c8ac01500cc82",
        #"46081990ded148458c6c8ac01500cc82"
         ]
    x, y, z5 = BitVecs('x y z', 32)
    solve((1&x)^8 == 8)
    key = solveForKey(msgs, encs)
    print(key)



##################################################################################
