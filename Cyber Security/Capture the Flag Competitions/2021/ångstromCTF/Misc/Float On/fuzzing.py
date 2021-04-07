from pwn import *

def run(i):
    r = process("./test")
    r.read()
    r.send("0\n")
    r.read()
    r.send("-1\n")
    r.read()
    r.send(f"{i}\n")
    data = r.read()
    try:
        data = data.decode('ascii')
    except:
        data = str(data)
    r.close()
    return data
LOWER = 0#-4294967295
UNIT_MAX = 4294967295
for i in range(LOWER,4294967295+1+1):
    print(f"#############################################################  {i}")
    data = run(i)
    if "Stage 3 passed!" in data:
        print("#"*30)
        print(data, i)
        print("#"*30)
        break
