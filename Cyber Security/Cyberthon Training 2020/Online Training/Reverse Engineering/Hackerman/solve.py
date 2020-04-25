'''
ebpvalues = [6,1,3,8,6,5,2,4,7]
var3 = 1264792680
ebp_9 = 1097691699
ebp_5 = 110


ebp_a8=0
eax = 0
edx = 0
for i in range(9):
    eax = ebpvalues[-i]+ebp_a8
    #(i+arg)%255
    edx = (i+var3)%255+5
    print(chr(edx-eax),end="")
'''

#Big endian
A = "\x4B\x63\x34\x68\x41\x6D\x72\x33\x00\x00\x00\x6E"
A = "\x4B\x63\x34\x68\x41\x6D\x72\x33\x6E"
# Put in the Little endian format
A = "\x68\x34\x63\x4B\x33\x72\x6D\x41\x6E"
#A = "\x63\x4B\x68\x34\x6D\x41\x33\x72\x00\x00\x6E\x00"

#for i in A:
#    print(chr(ord(i)+5),end="")
#print()
print(A)
B = [6,1,3,8,0,5,2,4,7][::-1]
### TestC 1
C = [""]*9
for i in range(9):
    C[B[i]] = chr(ord(A[i])+5)
output = ""
for i in C:
    output+=i
print("Answer:",output)

### Test 2
#o = ""
#for i in B: o+=chr(ord(A[i])+5)
#print(o)

##Check Algorithm that I can analyse
def check(C):
    for i in range(8+1):
        if C[B[i]]!=A[i]:return False
    return True

