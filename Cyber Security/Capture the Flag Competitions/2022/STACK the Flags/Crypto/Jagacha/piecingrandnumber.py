import time
import random
from pwn import *

l = [] # lst of 'random' numbers, can i determine the seed? or the next 'random' number with this? does random loop back to used numbers?
r = remote("159.65.133.6", 30294)
t = time.time_ns()

for i in range(100):
    r.recvuntil(b"\n> ") # main menu
    r.sendline("1".encode()) # gacha

    r.recvuntil(b"Here are the stats of your character:\n")

    # piecing together the 'random' number
    a = int(r.recvuntil(b"\n")[5:-1])
    b = int(r.recvuntil(b"\n")[5:-1])
    c = int(r.recvuntil(b"\n")[5:-1])
    d = int(r.recvuntil(b"\n")[5:-1])
    e = format(a, '016b') + format(b, '016b') + format(c, '016b') + format(d, '016b')
    e = int(e, 2)
    l.append(e) # adding integer number in. should i add the binary instead?

# using known random number as lucky number guess
# will not work because program generates a new random number

# r.recvuntil(b"\n> ") # main menu
# r.sendline("2".encode()) # lucky number guess

# r.recvuntil(b"Enter your lucky number: ")
# r.sendline(str(e).encode()) # send prev 'random' number

# print(r.recvuntil(b"\n").decode()) # result
# r.recv()

r.close()
print(l)


# try to use brute force to find seed by comparing the first 'random' number
# print(t) # 1670087623832733159
# print(e) # 5118597589418236663

# t = 1670087623832733159
# t = 0xdeadc0de
# e = 5118597589418236663
# # for i in range(10000000, 100000000):
# # for i in range(0, -100000, -1):
# for i in range(1000000, 10000000):
#     num = random.Random(t + i).getrandbits(64)
#     if num == e:
#         print(i)
#         break
# print("not found")