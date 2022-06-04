# Heist

# Enumeration
## nmap

```
# Nmap 7.91 scan initiated Fri Jan 28 10:56:38 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Heist/results/192.168.162.165/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Heist/results/192.168.162.165/scans/xml/_full_tcp_nmap.xml" 192.168.162.165
Nmap scan report for 192.168.162.165
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-28 10:56:40 EST for 376s
Not shown: 65513 filtered ports
Reason: 65513 no-responses
PORT      STATE SERVICE       REASON          VERSION
53/tcp    open  domain        syn-ack ttl 127 Simple DNS Plus
88/tcp    open  kerberos-sec  syn-ack ttl 127 Microsoft Windows Kerberos (server time: 2022-01-28 16:00:54Z)
135/tcp   open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
389/tcp   open  ldap          syn-ack ttl 127 Microsoft Windows Active Directory LDAP (Domain: heist.offsec0., Site: Default-First-Site-Name)
445/tcp   open  microsoft-ds? syn-ack ttl 127
464/tcp   open  kpasswd5?     syn-ack ttl 127
593/tcp   open  ncacn_http    syn-ack ttl 127 Microsoft Windows RPC over HTTP 1.0
636/tcp   open  tcpwrapped    syn-ack ttl 127
3268/tcp  open  ldap          syn-ack ttl 127 Microsoft Windows Active Directory LDAP (Domain: heist.offsec0., Site: Default-First-Site-Name)
3269/tcp  open  tcpwrapped    syn-ack ttl 127
3389/tcp  open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| rdp-ntlm-info: 
|   Target_Name: HEIST
|   NetBIOS_Domain_Name: HEIST
|   NetBIOS_Computer_Name: DC01
|   DNS_Domain_Name: heist.offsec
|   DNS_Computer_Name: DC01.heist.offsec
|   DNS_Tree_Name: heist.offsec
|   Product_Version: 10.0.17763
|_  System_Time: 2022-01-28T16:02:09+00:00
| ssl-cert: Subject: commonName=DC01.heist.offsec
| Issuer: commonName=DC01.heist.offsec
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-01-27T15:53:21
| Not valid after:  2022-07-29T15:53:21
| MD5:   4ba8 5eeb 7b79 8605 5c97 f2c8 6610 c08b
| SHA-1: 7f78 0889 0b69 6120 65e9 9fa6 f1fa 3150 b038 9ebc
| -----BEGIN CERTIFICATE-----
| MIIC5jCCAc6gAwIBAgIQEk/rv0jDmrRKL6GsaPSPbzANBgkqhkiG9w0BAQsFADAc
| MRowGAYDVQQDExFEQzAxLmhlaXN0Lm9mZnNlYzAeFw0yMjAxMjcxNTUzMjFaFw0y
| MjA3MjkxNTUzMjFaMBwxGjAYBgNVBAMTEURDMDEuaGVpc3Qub2Zmc2VjMIIBIjAN
| BgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuhyitBpyVMW3XSZEMndYcqdvGnpI
| lrvttBaitjhb6wL9c/UpMHPiYM6Dz8GUK/IZ8JKShuC4aImeBcdLJOGEG6qqt143
| EhEbdRHPsAi2kVZLC6nZh3sKP03zv7Duq9HmMpPJJh1BJXwFd7oFsUeKkbzn6uPR
| +XPj8HPQxXQXzLgXNRvptVathxaZrPEbTexWkpCC6yvrUUytJjq0Fx1Stgu/8x7l
| Og2FtGxbgD119FiVgc0jPcElci91Q57Mq07xxU4U7FH+mGCQZLyx7/Vez94VjWVQ
| TNjd9Kh9M1JORNHmOcP2APUgcTn9AD17pwQAcSSbQyLMWWWJV2Q00Of2LQIDAQAB
| oyQwIjATBgNVHSUEDDAKBggrBgEFBQcDATALBgNVHQ8EBAMCBDAwDQYJKoZIhvcN
| AQELBQADggEBABvdZNmwaQD3ZAPEZP1uCUDE5pCJMC9dRuhjV39gnbXZSqU9vaU4
| vJ9Wo3J/kutDHZoomAGxvTY2gdS4PvNG3q9rwfMCmVG/dxuMOlggCoo54n4hd3NW
| fCi9G5BuPu2QlY/ALtyrl8iE+qY6YBucprjeLzlL7rFz1a0zTI6k13Gz9M7AoZDr
| gtN4ivOC4nTsdZ5keSsn5H41Xs5XKt+ONntnn2xbR9XYa/ze4AF6bw3RMjClXdk7
| /uCyQW/BOIsKF3Oekza+GFwYJELJ2ZVyXXtWTs50VU58uAqP8jCKzXbSQonQsZaj
| NEFmQSl7H9MjBL5YDOocLr2M11lYGKiq7qc=
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-28T16:02:49+00:00; -2s from scanner time.
5985/tcp  open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Not Found
8080/tcp  open  http          syn-ack ttl 127 Werkzeug httpd 2.0.1 (Python 3.9.0)
| http-methods: 
|_  Supported Methods: GET OPTIONS HEAD
|_http-title: Super Secure Web Browser
9389/tcp  open  mc-nmf        syn-ack ttl 127 .NET Message Framing
49666/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49668/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49673/tcp open  ncacn_http    syn-ack ttl 127 Microsoft Windows RPC over HTTP 1.0
49674/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49677/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49701/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49748/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/28%OT=53%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F413B0%P=x86_64-pc-linux-gnu)
SEQ(SP=104%GCD=1%ISR=109%TI=I%II=I%SS=S%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=Y%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=259 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: Host: DC01; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: -1s, deviation: 0s, median: -1s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 8468/tcp): CLEAN (Timeout)
|   Check 2 (port 63878/tcp): CLEAN (Timeout)
|   Check 3 (port 21145/udp): CLEAN (Timeout)
|   Check 4 (port 43195/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled and required
| smb2-time: 
|   date: 2022-01-28T16:02:09
|_  start_date: N/A

TRACEROUTE (using port 8080/tcp)
HOP RTT       ADDRESS
1   171.59 ms 192.168.49.1
2   171.63 ms 192.168.162.165

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 28 11:02:56 2022 -- 1 IP address (1 host up) scanned in 378.47 seconds
```

## 139,445 - SMB
## 389 LDAP

## 8080 - Web

![](Pasted%20image%2020220321135619.png)

![](Pasted%20image%2020220321140234.png)

![](Pasted%20image%2020220321140214.png)

`http://192.168.111.165:8080/?url=http://DC01.heist.offsec:8080`

### Viewing Attacker Webpages

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8080
Serving HTTP on 0.0.0.0 port 8080 (http://0.0.0.0:8080/) ...
192.168.111.165 - - [21/Mar/2022 02:19:57] "GET / HTTP/1.1" 200 -

```

![](Pasted%20image%2020220321142025.png)

```bash
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 8080        
listening on [any] 8080 ...
connect to [192.168.49.111] from (UNKNOWN) [192.168.111.165] 50251
GET / HTTP/1.1
Connection: Keep-Alive
Accept: */*
User-Agent: Mozilla/4.0 (compatible; Win32; WinHttp.WinHttpRequest.5)
Host: 192.168.49.111:8080

```

# Exploitation

# Privesc

# Others