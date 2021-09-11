from pwn import *
 
FILENAME = '../Modified Binaries/alien_math_Q2'

## Q2 Simulation ##########################
mapping = [[['' for k in range(10)] for j in range(10)]for i in range(24)]
rmapping = [[['' for k in range(10)] for j in range(10)]for i in range(24)]
def second_question_function(arg1, arg2):
    arg1 = int(arg1) # Counter
    arg2 = int(arg2)
    return ((arg1 + -0x30) * 0x30 + (arg2 + -0x30) * 0xb + -4) % 10;
    
def extra(arg1, arg2, s):
    iVar2 = second_question_function(arg1, arg2)
    iVar2 = ord(s)-0x30 + iVar2
    return chr(iVar2 + (iVar2//10 * -10) + 0x30)

for counter in range(0,24): #on inc, the no. move back
    print("#"*20)
    for char in '0123456789':
        for nchar in '0123456789':
            v = extra(counter, ord(char)+counter, nchar)
            print(counter, char, nchar, v)
            mapping[counter][int(char)][int(nchar)] = v
            rmapping[counter][int(char)][int(v)] = nchar


#exit()
#21098765432109876543210987654321

target = '77594064'#[::-1]
target = '02536475'
##############################################

ans = target[0]#[-1]
#print(ans)
for i in range(7):
    counter = (i) # + 7
    char = int(ans[-1])
    v = int(target[counter+1])
    ans += rmapping[counter][char][v]
    print(counter, char, v, ans)
    
###############################################

ans = target[-1]
#print(ans)
for i in range(7): # Finding the previous characters
    counter = -(i)+7
    nchar = int(ans[0]) 
    v = int(target[counter])
    ans = rmapping[counter][nchar][v] + ans
    print(counter, char, v, ans)

print(ans)


ans = '02536475' 
cc = ans[0]
for i in range(len(target[1:])):
    counter = i
    char = int(cc[-1])
    nchar = int(ans[counter+1])
    cc += mapping[counter][char][nchar]
    print(counter, char, nchar, cc)
print(cc)
print(cc==target)

exit()
## Bruteforce length ######################
length = 0
for i in range(0,10**24):
    io = process(FILENAME)
    io.sendline('a') #1804289383
    #print(io.recv(timeout=1))
    
    payload = f"i"
    io.sendline(payload)
    print(io.recv())
    io.close()
    



