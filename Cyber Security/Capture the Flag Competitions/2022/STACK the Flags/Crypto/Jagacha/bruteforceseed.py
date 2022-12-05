import time
import random
from pwn import *

def get_seed():
    SEED = 0xdeadc0de
    return SEED + time.time_ns() # plus time in nanosecond

# testing seed
# seed = 1670080165968378688
# rand = random.Random(seed)

# brute force seed
for i in range(10000): # 0-9999 fail
    r = remote("167.99.77.149", 30792)
    rand = random.Random(get_seed() + i) # set seed

    # receive main menu
    r.recvuntil(b"\n> ")
    # print(r.recvuntil(b"\n> ").decode())
    # print("##### receive main menu #####")
    # print()

    # send option 2
    r.sendline("2".encode())
    # print("##### sending option 2 #####")
    # print()

    # receive option 2 guess page
    r.recvuntil(b"Enter your lucky number: ")
    # print(r.recvuntil(b"Enter your lucky number: ").decode())
    # print("##### receive option 2 guess page #####")
    # print()

    # send lucky num
    s = str(rand.getrandbits(64)) # generate 'random' number using seed
    r.sendline(s.encode())
    # print(f"##### send lucky number: {s} #####")
    # print()

    # receive outcome
    ans = r.recvuntil(b"\n").decode()
    if ans != "Oops! Looks like you are not as lucky as you thought! Try again!\n": # if get flag
        print(ans)
        break
    # print("##### receive outcome #####")
    # print()

    # receive main menu again
    r.recv()
    # print(r.recv().decode())
    # print("##### receive main menu #####")
    # print()

    # exit
    # print("##### exit #####")
    r.close()
