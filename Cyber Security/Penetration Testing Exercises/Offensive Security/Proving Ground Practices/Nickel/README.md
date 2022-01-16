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
- [ ] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
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

## 22 - SSH

## 139 - SMB

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



# Exploitation