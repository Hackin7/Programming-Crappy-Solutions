from pwn import *
#r = process("./free_flags")
r = remote('shell.actf.co', 21703)

### 1st stage ######################################
payload = ""
payload += str(0x7a69)+"\n"

### 2nd Stage ##################################
from z3 import *
x = Int('x')
y = Int('y')
solve(x+y == 0x476, x*y == 0x49f59)
xval = 419
yval = 723
payload += f"{xval} {yval}\n"

### 3rd Stage ##################################
payload += "banana\n"

print(payload)
r.send(payload.encode())


r.interactive()
