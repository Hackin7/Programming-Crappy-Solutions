```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_quick_tcp_nmap.xml" 192.168.161.116
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_quick_tcp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_quick_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 10:50:54 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_quick_tcp_nmap.xml" 192.168.161.116
Increasing send delay for 192.168.161.116 from 0 to 5 due to 19 out of 46 dropped probes since last increase.
adjust_timeouts2: packet supposedly had rtt of -63295 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -63295 microseconds.  Ignoring time.
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 10:50:55 EST for 127s
Not shown: 995 closed ports
Reason: 995 resets
PORT     STATE SERVICE     REASON         VERSION
22/tcp   open  ssh         syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 36:cd:06:f8:11:72:6b:29:d8:d8:86:99:00:6b:1d:3a (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDQjISDfZJSrhxHPJNdFOaYN/6v9xvTQ0nvVxY3PC93qraoFeHMiwAYDxzcaY47E965uLcjgBfqicRVIziukrnVDn9R14LZmq74kbAmaf6PcOyjL3iN9uQWE/7umx3rG98dVugfW9SzuHgorDE7anOV8ewsepOSx61qnb0p/p2IID7ExFXgh8UqtMAD1viVHdvOhHFZL4BbzVj57LBaRvEDC2lx8mSvwxRmJyw7Jqm3+S640y6pet4QgLSrWdQt8nh/dW/U9HPkwfqrytd7tdnIRhuR/L+E6H8rKycI/y012pdIlE+wtNY2xgjGm0mQfmVH1sDEN/OGVw7TdH6BEc9x
|   256 7d:12:27:de:dd:4e:8e:88:48:ef:e3:e0:b2:13:42:a1 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBC08uXC/2TmrLqWbD0sPKxdflt2pC5fpX9UHyK0G3f/HMGwFQQlpjuBnK8F8piwnSjXyDHRSFGa/bGXi9n3gIf0=
|   256 c4:db:d3:61:af:85:95:0e:59:77:c5:9e:07:0b:2f:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMWphiQ1WtEPUDgeKuwnZ018EFPqR/4MiEj85mmMdGvk
80/tcp   open  http        syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS))
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.6 (CentOS)
|_http-title: Landed by HTML5 UP
139/tcp  open  netbios-ssn syn-ack ttl 63 Samba smbd 3.X - 4.X (workgroup: SAMBA)
445/tcp  open  netbios-ssn syn-ack ttl 63 Samba smbd 4.10.4 (workgroup: SAMBA)
8080/tcp open  http-proxy  syn-ack ttl 63
| fingerprint-strings: 
|   GetRequest: 
|     HTTP/1.1 200 
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Cache-Control: no-cache, no-store, max-age=0, must-revalidate
|     Pragma: no-cache
|     Expires: 0
|     X-Frame-Options: DENY
|     Content-Type: text/html;charset=UTF-8
|     Content-Language: en-US
|     Date: Sun, 13 Feb 2022 15:57:01 GMT
|     Connection: close
|     <!doctype html>
|     <html lang="en">
|     <head>
|     <meta charset="utf-8">
|     <meta http-equiv="x-ua-compatible" content="ie=edge">
|     <meta name="viewport" content="width=device-width, initial-scale=1">
|     <title></title>
|     <link rel="stylesheet" href="/css/main.css">
|     </head>
|     <body>
|     <div class="small-container">
|     <div class="flex-row">
|     <h1>Recycler Management System</h1>
|     </div>
|     <div class="flex-row">
|     <img src="/images/factory.jpg" class="round-button">
|     </div> 
|     </div>
|     <br>
|     <div class="small-container">
|     <div class="flex-small">Control system for the factory
|   HTTPOptions: 
|     HTTP/1.1 200 
|     Allow: GET,HEAD,OPTIONS
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Cache-Control: no-cache, no-store, max-age=0, must-revalidate
|     Pragma: no-cache
|     Expires: 0
|     X-Frame-Options: DENY
|     Content-Length: 0
|     Date: Sun, 13 Feb 2022 15:57:01 GMT
|     Connection: close
|   RTSPRequest: 
|     HTTP/1.1 400 
|     Content-Type: text/html;charset=utf-8
|     Content-Language: en
|     Content-Length: 435
|     Date: Sun, 13 Feb 2022 15:57:01 GMT
|     Connection: close
|     <!doctype html><html lang="en"><head><title>HTTP Status 400 
|     Request</title><style type="text/css">body {font-family:Tahoma,Arial,sans-serif;} h1, h2, h3, b {color:white;background-color:#525D76;} h1 {font-size:22px;} h2 {font-size:16px;} h3 {font-size:14px;} p {font-size:12px;} a {color:black;} .line {height:1px;background-color:#525D76;border:none;}</style></head><body><h1>HTTP Status 400 
|_    Request</h1></body></html>
|_http-favicon: Unknown favicon MD5: E5F2FB14AD563C2D8AEA9214A6C2DBCC
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS POST
|_http-open-proxy: Proxy might be redirecting requests
|_http-title: Site doesn't have a title (text/html;charset=UTF-8).
|_http-trane-info: Problem with XML parsing of /evox/about
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port8080-TCP:V=7.91%I=9%D=2/13%Time=620928F4%P=x86_64-pc-linux-gnu%r(Ge
SF:tRequest,429,"HTTP/1\.1\x20200\x20\r\nX-Content-Type-Options:\x20nosnif
SF:f\r\nX-XSS-Protection:\x201;\x20mode=block\r\nCache-Control:\x20no-cach
SF:e,\x20no-store,\x20max-age=0,\x20must-revalidate\r\nPragma:\x20no-cache
SF:\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY\r\nContent-Type:\x20text/
SF:html;charset=UTF-8\r\nContent-Language:\x20en-US\r\nDate:\x20Sun,\x2013
SF:\x20Feb\x202022\x2015:57:01\x20GMT\r\nConnection:\x20close\r\n\r\n<!doc
SF:type\x20html>\n<html\x20lang=\"en\">\n\n<head>\n\x20\x20<meta\x20charse
SF:t=\"utf-8\">\n\x20\x20<meta\x20http-equiv=\"x-ua-compatible\"\x20conten
SF:t=\"ie=edge\">\n\x20\x20<meta\x20name=\"viewport\"\x20content=\"width=d
SF:evice-width,\x20initial-scale=1\">\n\n\x20\x20<title></title>\n\n\x20\x
SF:20<link\x20rel=\"stylesheet\"\x20href=\"/css/main\.css\">\n\x20\x20\n</
SF:head>\n\n<body>\n\t\n\t<div\x20class=\"small-container\">\n\t\t<div\x20
SF:class=\"flex-row\">\n\t\t\t<h1>Recycler\x20Management\x20System</h1>\n\
SF:t\t</div>\n\t\t<div\x20class=\"flex-row\">\n\t\t\t<img\x20src=\"/images
SF:/factory\.jpg\"\x20class=\"round-button\">\n\t\t</div>\x20\n\n\t</div>\
SF:n\t<br>\n\t<div\x20class=\"small-container\">\n\n\t\t\t<div\x20class=\"
SF:flex-small\">Control\x20system\x20for\x20the\x20factory\x20")%r(HTTPOpt
SF:ions,12B,"HTTP/1\.1\x20200\x20\r\nAllow:\x20GET,HEAD,OPTIONS\r\nX-Conte
SF:nt-Type-Options:\x20nosniff\r\nX-XSS-Protection:\x201;\x20mode=block\r\
SF:nCache-Control:\x20no-cache,\x20no-store,\x20max-age=0,\x20must-revalid
SF:ate\r\nPragma:\x20no-cache\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY
SF:\r\nContent-Length:\x200\r\nDate:\x20Sun,\x2013\x20Feb\x202022\x2015:57
SF::01\x20GMT\r\nConnection:\x20close\r\n\r\n")%r(RTSPRequest,24E,"HTTP/1\
SF:.1\x20400\x20\r\nContent-Type:\x20text/html;charset=utf-8\r\nContent-La
SF:nguage:\x20en\r\nContent-Length:\x20435\r\nDate:\x20Sun,\x2013\x20Feb\x
SF:202022\x2015:57:01\x20GMT\r\nConnection:\x20close\r\n\r\n<!doctype\x20h
SF:tml><html\x20lang=\"en\"><head><title>HTTP\x20Status\x20400\x20\xe2\x80
SF:\x93\x20Bad\x20Request</title><style\x20type=\"text/css\">body\x20{font
SF:-family:Tahoma,Arial,sans-serif;}\x20h1,\x20h2,\x20h3,\x20b\x20{color:w
SF:hite;background-color:#525D76;}\x20h1\x20{font-size:22px;}\x20h2\x20{fo
SF:nt-size:16px;}\x20h3\x20{font-size:14px;}\x20p\x20{font-size:12px;}\x20
SF:a\x20{color:black;}\x20\.line\x20{height:1px;background-color:#525D76;b
SF:order:none;}</style></head><body><h1>HTTP\x20Status\x20400\x20\xe2\x80\
SF:x93\x20Bad\x20Request</h1></body></html>");
Aggressive OS guesses: Linux 4.4 (95%), Linux 3.10 - 3.12 (94%), Linux 4.0 (92%), Linux 4.9 (92%), Linux 3.10 - 3.16 (92%), Linux 3.11 - 4.1 (91%), Linux 2.6.32 (91%), Linux 3.5 (91%), Linux 4.2 (91%), Synology DiskStation Manager 5.1 (91%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=2/13%OT=22%CT=1%CU=30107%PV=Y%DS=2%DC=T%G=Y%TM=6209295
OS:E%P=x86_64-pc-linux-gnu)SEQ(TS=A)SEQ(SP=106%GCD=1%ISR=107%TI=Z%II=I%TS=A
OS:)SEQ(SP=106%GCD=1%ISR=107%TI=Z%TS=A)OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3
OS:=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)WIN(W1=7120%W2=7
OS:120%W3=7120%W4=7120%W5=7120%W6=7120)ECN(R=Y%DF=Y%T=40%W=7210%O=M54ENNSNW
OS:7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=N)T5
OS:(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF=N%T=
OS:40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S
OS:)

Uptime guess: 9.255 days (since Fri Feb  4 04:45:10 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host: CASSIOS

Host script results:
|_clock-skew: mean: 1h45m46s, deviation: 2h53m13s, median: 5m45s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 7242/tcp): CLEAN (Couldn't connect)
|   Check 2 (port 13093/tcp): CLEAN (Couldn't connect)
|   Check 3 (port 54846/udp): CLEAN (Timeout)
|   Check 4 (port 34521/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.10.4)
|   Computer name: cassios
|   NetBIOS computer name: CASSIOS\x00
|   Domain name: \x00
|   FQDN: cassios
|_  System time: 2022-02-13T10:58:37-05:00
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-13T15:58:37
|_  start_date: N/A

TRACEROUTE (using port 995/tcp)
HOP RTT       ADDRESS
1   180.88 ms 192.168.49.1
2   181.02 ms 192.168.161.116

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 10:53:02 2022 -- 1 IP address (1 host up) scanned in 128.36 seconds

```