```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/xml/_quick_tcp_nmap.xml" 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_quick_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_quick_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 07:56:14 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/xml/_quick_tcp_nmap.xml" 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:56:15 EST for 55s
Not shown: 978 filtered ports
Reason: 978 no-responses
PORT     STATE SERVICE    REASON          VERSION
21/tcp   open  ftp        syn-ack ttl 127 FileZilla ftpd
| ftp-syst: 
|_  SYST: UNIX emulated by FileZilla
80/tcp   open  http       syn-ack ttl 127 Apache httpd 2.4.16 (OpenSSL/1.0.1p PHP/5.6.12)
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
|_http-title: Index of /
443/tcp  open  ssl/http   syn-ack ttl 127 Apache httpd 2.4.16 (OpenSSL/1.0.1p PHP/5.6.12)
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
|_http-title: Index of /
| ssl-cert: Subject: commonName=localhost
| Issuer: commonName=localhost
| Public Key type: rsa
| Public Key bits: 1024
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2009-11-10T23:48:47
| Not valid after:  2019-11-08T23:48:47
| MD5:   a0a4 4cc9 9e84 b26f 9e63 9f9e d229 dee0
| SHA-1: b023 8c54 7a90 5bfa 119c 4e8b acca eacf 3649 1ff6
| -----BEGIN CERTIFICATE-----
| MIIBnzCCAQgCCQC1x1LJh4G1AzANBgkqhkiG9w0BAQUFADAUMRIwEAYDVQQDEwls
| b2NhbGhvc3QwHhcNMDkxMTEwMjM0ODQ3WhcNMTkxMTA4MjM0ODQ3WjAUMRIwEAYD
| VQQDEwlsb2NhbGhvc3QwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAMEl0yfj
| 7K0Ng2pt51+adRAj4pCdoGOVjx1BmljVnGOMW3OGkHnMw9ajibh1vB6UfHxu463o
| J1wLxgxq+Q8y/rPEehAjBCspKNSq+bMvZhD4p8HNYMRrKFfjZzv3ns1IItw46kgT
| gDpAl1cMRzVGPXFimu5TnWMOZ3ooyaQ0/xntAgMBAAEwDQYJKoZIhvcNAQEFBQAD
| gYEAavHzSWz5umhfb/MnBMa5DL2VNzS+9whmmpsDGEG+uR0kM1W2GQIdVHHJTyFd
| aHXzgVJBQcWTwhp84nvHSiQTDBSaT6cQNQpvag/TaED/SEQpm0VqDFwpfFYuufBL
| vVNbLkKxbK2XwUvu0RxoLdBMC/89HqrZ0ppiONuQ+X2MtxE=
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
3306/tcp open  mysql      syn-ack ttl 127 MySQL (unauthorized)
6666/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 3
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6667/tcp open  irc        syn-ack ttl 127 InspIRCd
6668/tcp open  irc        syn-ack ttl 127 InspIRCd
6669/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 4
|   servers: 1
|   chans: 1
|   lusers: 4
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
6689/tcp open  irc        syn-ack ttl 127 InspIRCd
6692/tcp open  irc        syn-ack ttl 127 InspIRCd
6699/tcp open  irc        syn-ack ttl 127 InspIRCd
6779/tcp open  irc        syn-ack ttl 127 InspIRCd
6788/tcp open  irc        syn-ack ttl 127 InspIRCd
6789/tcp open  irc        syn-ack ttl 127 InspIRCd
6792/tcp open  irc        syn-ack ttl 127 InspIRCd
6839/tcp open  irc        syn-ack ttl 127 InspIRCd
6881/tcp open  irc        syn-ack ttl 127 InspIRCd
6901/tcp open  irc        syn-ack ttl 127 InspIRCd
6969/tcp open  irc        syn-ack ttl 127 InspIRCd
| irc-info: 
|   server: irc.madcowz.localdomain
|   users: 2
|   servers: 1
|   chans: 1
|   lusers: 3
|   lservers: 0
|   source ident: nmap
|   source host: 192.168.49.196
|_  error: Closing link: (nmap@192.168.49.196) [Client exited]
7000/tcp open  irc        syn-ack ttl 127 InspIRCd
7001/tcp open  tcpwrapped syn-ack ttl 127
7007/tcp open  irc        syn-ack ttl 127 InspIRCd
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows Server 2012 R2 (90%), Microsoft Windows Server 2008 R2 SP1 (90%), Microsoft Windows Server 2008 (90%), Microsoft Windows Server 2008 R2 (90%), Microsoft Windows Server 2008 R2 or Windows 8 (90%), Microsoft Windows 7 SP1 (90%), Microsoft Windows 8.1 Update 1 (90%), Microsoft Windows 8.1 R1 (90%), Microsoft Windows Phone 7.5 or 8.0 (90%), Microsoft Windows 7 or Windows Server 2008 R2 (89%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/21%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61EAADA6%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=10B%TI=I%TS=7)
OPS(O1=M506NW8ST11%O2=M506NW8ST11%O3=M506NW8NNT11%O4=M506NW8ST11%O5=M506NW8ST11%O6=M506ST11)
WIN(W1=2000%W2=2000%W3=2000%W4=2000%W5=2000%W6=2000)
ECN(R=Y%DF=Y%TG=80%W=2000%O=M506NW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=N)

Uptime guess: 0.006 days (since Fri Jan 21 07:48:20 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=263 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: Hosts: localhost, www.example.com, irc.madcowz.localdomain; OS: Windows; CPE: cpe:/o:microsoft:windows

TRACEROUTE (using port 80/tcp)
HOP RTT       ADDRESS
1   250.82 ms 192.168.49.1
2   251.05 ms 192.168.196.44

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 07:57:10 2022 -- 1 IP address (1 host up) scanned in 56.26 seconds

```