# WebCal

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Feb 17 03:39:18 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal/results/192.168.105.37/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal/results/192.168.105.37/scans/xml/_full_tcp_nmap.xml" 192.168.105.37
adjust_timeouts2: packet supposedly had rtt of -997819 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -997819 microseconds.  Ignoring time.
Nmap scan report for 192.168.105.37
Host is up, received user-set (0.25s latency).
Scanned at 2022-02-17 03:39:22 EST for 920s
Not shown: 65530 closed ports
Reason: 65530 resets
PORT   STATE SERVICE REASON         VERSION
21/tcp open  ftp?    syn-ack ttl 63
22/tcp open  ssh     syn-ack ttl 63 OpenSSH 5.8p1 Debian 7ubuntu1 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   1024 5b:b4:3f:ad:ac:70:b3:6f:70:db:de:72:11:03:d7:1d (DSA)
| ssh-dss AAAAB3NzaC1kc3MAAACBAP6wWpAlaYKQ87IRMm6Iu+3P90qRxgJv2uROs7M2YY44MTnLdchXHqqe85Su4wFeGc5+P3xeEnxPvTLOH0N+gKyKUqteMQP4w1gJP4W2oEX2tzAfqY8OqAm8/R/PDx8uWFS7Ivrc5b818lMkMMNYj74TVjdB14X0+xULCg+z6cDFAAAAFQD6yo22iGSzk1uVAgUPAXWatTYWUQAAAIEAgQGQmf0qShFfvh8/1C0qoiZxThFjF3WZc1HXGuajdHqbYrDHiFd2db+7jtQ03WHTNv6sxFjrpPW1R0ZT0B9MJnzbSd7CAp//KYvc/ABQa3HhIIzDR24sx1tE/Jru49IsRfWMYobP3RLCpvu67XnqrNd3xEG6B6jMN1/wiITVBOQAAACBAMnnflla3oGLXF/H+wNn11JUgmfQvT/b3ln8Wei+PrRb6LcJ1rNGNOt4+t6nREcbqhtaHChvuEM8mraoMznE2m3iz8DvFpfiwUevwJ/xc1naP3W59mPaWleRXOGbCSz4+KDmTqzagrbiOuC5TDR3w0wzVK8kW8MR9mZ4kMdh6ltF
|   2048 13:dc:ff:d4:03:51:a5:9f:0c:05:33:82:f0:4a:dd:21 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCn7TiVoPeGyiTCtABhso46YSM8fsReiPNhyN8ItBfnPtJFUPgDlN1mxnuOv1Z2acDDxdGJ/JyhpxkrwFcQ1FtRJmj5Be/vzCdcBh/n8Ef7xgswGUSrHkHLQSocLLroxjOeVX7ClBDfpE3fNRdLPG2gDJAPbI6Xg3gFw9drZkMgoLB8RiSS8PLsuINTKDwkJsn5TwbZY3Xtk9en/U43gC6el4CQU4EPAmqasudGwo+l4YopS21vxXl0zKxp4a7PPZ6SvTzCzwPh3Q90zCiRzYplBMzorvrc2+9hLVZmI3HsB2RElSspyJ5kfR/vlVH936Tq1odeTTOzuGxnwkmh7ncd
|   256 fe:be:7f:91:5c:5e:64:78:0b:35:e4:73:1f:01:f5:a1 (ECDSA)
|_ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBOjqngQVBATu6P7QvVoh3hrHvJgBX+QpB9fVBk++sVvxstZXwnCkaBicePfYEDCwUZy6LyWZ8qACNmee6tCe9/A=
25/tcp open  smtp    syn-ack ttl 63 Postfix smtpd
|_smtp-commands: ucal.local, PIPELINING, SIZE 10240000, VRFY, ETRN, STARTTLS, ENHANCEDSTATUSCODES, 8BITMIME, DSN, 
53/tcp open  domain  syn-ack ttl 63 ISC BIND 9.7.3
| dns-nsid: 
|_  bind.version: 9.7.3
80/tcp open  http    syn-ack ttl 63 Apache httpd 2.2.20 ((Ubuntu))
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.2.20 (Ubuntu)
|_http-title: Construction Page
OS fingerprint not ideal because: maxTimingRatio (3.032000e+00) is greater than 1.4
Aggressive OS guesses: Linux 3.2 - 3.8 (94%), Linux 3.5 (93%), Linux 3.8 (92%), WatchGuard Fireware 11.8 (92%), Linux 2.6.32 - 2.6.39 (92%), Linux 3.1 - 3.2 (91%), Linux 2.6.32 or 3.10 (90%), Linux 3.3 (90%), Linux 2.6.36 (90%), Linux 3.11 - 4.1 (90%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/17%OT=21%CT=1%CU=37489%PV=Y%DS=2%DC=T%G=N%TM=620E0D51%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=106%TI=Z%TS=8)
OPS(O1=M54EST11NW3%O2=M54EST11NW3%O3=M54ENNT11NW3%O4=M54EST11NW3%O5=M54EST11NW3%O6=M54EST11)
WIN(W1=3890%W2=3890%W3=3890%W4=3890%W5=3890%W6=3890)
ECN(R=N)
ECN(R=Y%DF=Y%T=40%W=3908%O=M54ENNSNW3%CC=Y%Q=)
T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=N)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=O%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 0.011 days (since Thu Feb 17 03:38:41 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=251 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host:  ucal.local; OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 1720/tcp)
HOP RTT       ADDRESS
1   250.20 ms 192.168.49.1
2   250.17 ms 192.168.105.37

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 03:54:41 2022 -- 1 IP address (1 host up) scanned in 924.91 seconds
```

## 21 - FTP?

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.105.37 
Connected to 192.168.105.37.
425 Sorry, invalid address given
ftp> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.105.37
Connected to 192.168.105.37.
425 Sorry, invalid address given
ftp> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ nc 192.168.105.37   21 -vv                                                                                                                                      1 ⨯
ucal.local [192.168.105.37] 21 (ftp) open
whoami
425 Sorry, invalid address given
 sent 7, rcvd 34
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ 
```

## 25 - ESMTP Postfix 

```
# Nmap 7.91 scan initiated Thu Feb 17 03:50:43 2022 as: nmap -vv --reason -Pn -T4 -sV -p 25 "--script=banner,(smtp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal/results/192.168.105.37/scans/tcp25/tcp_25_smtp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal/results/192.168.105.37/scans/tcp25/xml/tcp_25_smtp_nmap.xml" 192.168.105.37
Nmap scan report for 192.168.105.37
Host is up, received user-set (0.28s latency).
Scanned at 2022-02-17 03:50:47 EST for 150s

PORT   STATE SERVICE REASON         VERSION
25/tcp open  smtp    syn-ack ttl 63 Postfix smtpd
|_banner: 220 ucal.local ESMTP Postfix (Ubuntu)
|_smtp-commands: ucal.local, PIPELINING, SIZE 10240000, VRFY, ETRN, STARTTLS, ENHANCEDSTATUSCODES, 8BITMIME, DSN, 
| smtp-vuln-cve2010-4344: 
|_  The SMTP server is not Exim: NOT VULNERABLE
|_sslv2-drown: 
Service Info: Host:  ucal.local

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 03:53:17 2022 -- 1 IP address (1 host up) scanned in 154.35 seconds
```

## 53 - DNS

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ dnsrecon -n 192.168.105.37 -d ucal.local                                                             
[*] Performing General Enumeration of Domain: ucal.local
[-] Could not resolve domain: ucal.local
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ dnsrecon -n 192.168.105.37 -d webcal.local                                                                                                                      1 ⨯
[*] Performing General Enumeration of Domain: webcal.local
[-] Could not resolve domain: webcal.local
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ dnsrecon -n 192.168.105.37 -d webcal.pg                                                                                                                         1 ⨯
[*] Performing General Enumeration of Domain: webcal.pg
[-] Could not resolve domain: webcal.pg
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$  
```

```bash
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ host 192.168.105.37 192.168.105.37                                                                                                                              1 ⨯
Using domain server:
Name: 192.168.105.37
Address: 192.168.105.37#53
Aliases: 

Host 37.105.168.192.in-addr.arpa not found: 5(REFUSED)
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ host 127.0.0.1 192.168.105.37                                                                                                                                   1 ⨯
Using domain server:
Name: 192.168.105.37
Address: 192.168.105.37#53
Aliases: 

1.0.0.127.in-addr.arpa domain name pointer localhost.
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ host localhost 192.168.105.37                                                                                                                                   1 ⨯
Using domain server:
Name: 192.168.105.37
Address: 192.168.105.37#53
Aliases: 

localhost has address 127.0.0.1
localhost has IPv6 address ::1
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/WebCal]
└─$ 
```

## 80 - Web

![](Pasted%20image%2020220217165424.png)

![](Pasted%20image%2020220217170920.png)

