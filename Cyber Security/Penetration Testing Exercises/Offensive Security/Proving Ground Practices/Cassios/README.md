# Cassios
# Enumeration

# Exploitation
## nmap
```
# Nmap 7.91 scan initiated Sun Feb 13 10:50:54 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_full_tcp_nmap.xml" 192.168.161.116
Increasing send delay for 192.168.161.116 from 0 to 5 due to 1502 out of 3754 dropped probes since last increase.
Warning: 192.168.161.116 giving up on port because retransmission cap hit (6).
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 10:50:55 EST for 1202s
Not shown: 65497 closed ports
Reason: 65497 resets
PORT      STATE    SERVICE     REASON         VERSION
22/tcp    open     ssh         syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 36:cd:06:f8:11:72:6b:29:d8:d8:86:99:00:6b:1d:3a (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDQjISDfZJSrhxHPJNdFOaYN/6v9xvTQ0nvVxY3PC93qraoFeHMiwAYDxzcaY47E965uLcjgBfqicRVIziukrnVDn9R14LZmq74kbAmaf6PcOyjL3iN9uQWE/7umx3rG98dVugfW9SzuHgorDE7anOV8ewsepOSx61qnb0p/p2IID7ExFXgh8UqtMAD1viVHdvOhHFZL4BbzVj57LBaRvEDC2lx8mSvwxRmJyw7Jqm3+S640y6pet4QgLSrWdQt8nh/dW/U9HPkwfqrytd7tdnIRhuR/L+E6H8rKycI/y012pdIlE+wtNY2xgjGm0mQfmVH1sDEN/OGVw7TdH6BEc9x
|   256 7d:12:27:de:dd:4e:8e:88:48:ef:e3:e0:b2:13:42:a1 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBC08uXC/2TmrLqWbD0sPKxdflt2pC5fpX9UHyK0G3f/HMGwFQQlpjuBnK8F8piwnSjXyDHRSFGa/bGXi9n3gIf0=
|   256 c4:db:d3:61:af:85:95:0e:59:77:c5:9e:07:0b:2f:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMWphiQ1WtEPUDgeKuwnZ018EFPqR/4MiEj85mmMdGvk
80/tcp    open     http        syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS))
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.6 (CentOS)
|_http-title: Landed by HTML5 UP
139/tcp   open     netbios-ssn syn-ack ttl 63 Samba smbd 3.X - 4.X (workgroup: SAMBA)
445/tcp   open     netbios-ssn syn-ack ttl 63 Samba smbd 4.10.4 (workgroup: SAMBA)
5374/tcp  filtered unknown     no-response
8080/tcp  open     http-proxy  syn-ack ttl 63
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
|     Date: Sun, 13 Feb 2022 16:15:01 GMT
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
|     Date: Sun, 13 Feb 2022 16:15:01 GMT
|     Connection: close
|   RTSPRequest: 
|     HTTP/1.1 400 
|     Content-Type: text/html;charset=utf-8
|     Content-Language: en
|     Content-Length: 435
|     Date: Sun, 13 Feb 2022 16:15:01 GMT
|     Connection: close
|     <!doctype html><html lang="en"><head><title>HTTP Status 400 
|     Request</title><style type="text/css">body {font-family:Tahoma,Arial,sans-serif;} h1, h2, h3, b {color:white;background-color:#525D76;} h1 {font-size:22px;} h2 {font-size:16px;} h3 {font-size:14px;} p {font-size:12px;} a {color:black;} .line {height:1px;background-color:#525D76;border:none;}</style></head><body><h1>HTTP Status 400 
|_    Request</h1></body></html>
|_http-favicon: Unknown favicon MD5: 654C1A7DE04DE1C288D3DAE205EED25F
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS POST
|_http-open-proxy: Proxy might be redirecting requests
|_http-title: Site doesn't have a title (text/html;charset=UTF-8).
|_http-trane-info: Problem with XML parsing of /evox/about
10779/tcp filtered unknown     no-response
15549/tcp filtered unknown     no-response
20268/tcp filtered unknown     no-response
24007/tcp filtered unknown     no-response
24455/tcp filtered unknown     no-response
24798/tcp filtered unknown     no-response
26403/tcp filtered unknown     no-response
27295/tcp filtered unknown     no-response
27463/tcp filtered unknown     no-response
30202/tcp filtered unknown     no-response
32719/tcp filtered unknown     no-response
34132/tcp filtered unknown     no-response
35840/tcp filtered unknown     no-response
36483/tcp filtered unknown     no-response
42319/tcp filtered unknown     no-response
43123/tcp filtered unknown     no-response
48119/tcp filtered unknown     no-response
48390/tcp filtered unknown     no-response
48609/tcp filtered unknown     no-response
49029/tcp filtered unknown     no-response
49105/tcp filtered unknown     no-response
51418/tcp filtered unknown     no-response
52532/tcp filtered unknown     no-response
52543/tcp filtered unknown     no-response
53331/tcp filtered unknown     no-response
54170/tcp filtered unknown     no-response
55433/tcp filtered unknown     no-response
58421/tcp filtered unknown     no-response
61032/tcp filtered unknown     no-response
61663/tcp filtered unknown     no-response
63624/tcp filtered unknown     no-response
65342/tcp filtered unknown     no-response
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port8080-TCP:V=7.91%I=9%D=2/13%Time=62092D2B%P=x86_64-pc-linux-gnu%r(Ge
SF:tRequest,429,"HTTP/1\.1\x20200\x20\r\nX-Content-Type-Options:\x20nosnif
SF:f\r\nX-XSS-Protection:\x201;\x20mode=block\r\nCache-Control:\x20no-cach
SF:e,\x20no-store,\x20max-age=0,\x20must-revalidate\r\nPragma:\x20no-cache
SF:\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY\r\nContent-Type:\x20text/
SF:html;charset=UTF-8\r\nContent-Language:\x20en-US\r\nDate:\x20Sun,\x2013
SF:\x20Feb\x202022\x2016:15:01\x20GMT\r\nConnection:\x20close\r\n\r\n<!doc
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
SF:\r\nContent-Length:\x200\r\nDate:\x20Sun,\x2013\x20Feb\x202022\x2016:15
SF::01\x20GMT\r\nConnection:\x20close\r\n\r\n")%r(RTSPRequest,24E,"HTTP/1\
SF:.1\x20400\x20\r\nContent-Type:\x20text/html;charset=utf-8\r\nContent-La
SF:nguage:\x20en\r\nContent-Length:\x20435\r\nDate:\x20Sun,\x2013\x20Feb\x
SF:202022\x2016:15:01\x20GMT\r\nConnection:\x20close\r\n\r\n<!doctype\x20h
SF:tml><html\x20lang=\"en\"><head><title>HTTP\x20Status\x20400\x20\xe2\x80
SF:\x93\x20Bad\x20Request</title><style\x20type=\"text/css\">body\x20{font
SF:-family:Tahoma,Arial,sans-serif;}\x20h1,\x20h2,\x20h3,\x20b\x20{color:w
SF:hite;background-color:#525D76;}\x20h1\x20{font-size:22px;}\x20h2\x20{fo
SF:nt-size:16px;}\x20h3\x20{font-size:14px;}\x20p\x20{font-size:12px;}\x20
SF:a\x20{color:black;}\x20\.line\x20{height:1px;background-color:#525D76;b
SF:order:none;}</style></head><body><h1>HTTP\x20Status\x20400\x20\xe2\x80\
SF:x93\x20Bad\x20Request</h1></body></html>");
Aggressive OS guesses: Linux 3.10 - 3.12 (95%), Linux 4.4 (95%), Linux 4.9 (93%), Linux 4.0 (92%), Linux 3.10 - 3.16 (92%), Linux 3.11 - 4.1 (91%), Linux 2.6.32 (91%), Linux 2.6.39 (91%), Linux 3.4 (91%), Linux 3.5 (91%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=2/13%OT=22%CT=1%CU=36379%PV=Y%DS=2%DC=T%G=Y%TM=62092D9
OS:1%P=x86_64-pc-linux-gnu)SEQ(SP=106%GCD=1%ISR=10B%TI=Z%TS=A)SEQ(SP=106%GC
OS:D=1%ISR=10A%TI=Z%II=I%TS=A)OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT1
OS:1NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)WIN(W1=7120%W2=7120%W3=71
OS:20%W4=7120%W5=7120%W6=7120)ECN(R=Y%DF=Y%T=40%W=7210%O=M54ENNSNW7%CC=Y%Q=
OS:)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y
OS:%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF=N%T=40%IPL=16
OS:4%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 0.013 days (since Sun Feb 13 10:52:57 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=261 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host: CASSIOS

Host script results:
|_clock-skew: mean: 1h45m45s, deviation: 2h53m12s, median: 5m44s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 7242/tcp): CLEAN (Couldn't connect)
|   Check 2 (port 13093/tcp): CLEAN (Couldn't connect)
|   Check 3 (port 54846/udp): CLEAN (Failed to receive data)
|   Check 4 (port 34521/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.10.4)
|   Computer name: cassios
|   NetBIOS computer name: CASSIOS\x00
|   Domain name: \x00
|   FQDN: cassios
|_  System time: 2022-02-13T11:16:34-05:00
| smb-security-mode: 
|   account_used: guest
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-13T16:16:36
|_  start_date: N/A

TRACEROUTE (using port 5900/tcp)
HOP RTT       ADDRESS
1   181.46 ms 192.168.49.1
2   181.88 ms 192.168.161.116

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 11:10:57 2022 -- 1 IP address (1 host up) scanned in 1203.95 seconds
```


## 139,445 - Samba
```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios]
└─$ enum4linux -a  192.168.90.116
Starting enum4linux v0.8.9 ( http://labs.portcullis.co.uk/application/enum4linux/ ) on Sun Feb 13 23:08:49 2022

 ========================== 
|    Target Information    |
 ========================== 
Target ........... 192.168.90.116
RID Range ........ 500-550,1000-1050
Username ......... ''
Password ......... ''
Known Usernames .. administrator, guest, krbtgt, domain admins, root, bin, none


 ====================================================== 
|    Enumerating Workgroup/Domain on 192.168.90.116    |
 ====================================================== 
[E] Can't find workgroup/domain


 ============================================== 
|    Nbtstat Information for 192.168.90.116    |
 ============================================== 
Looking up status of 192.168.90.116
No reply from 192.168.90.116

 ======================================= 
|    Session Check on 192.168.90.116    |
 ======================================= 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 437.
[+] Server 192.168.90.116 allows sessions using username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 451.
[+] Got domain/workgroup name: 

 ============================================= 
|    Getting domain SID for 192.168.90.116    |
 ============================================= 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 359.
Domain Name: SAMBA
Domain Sid: (NULL SID)
[+] Can't determine if host is part of domain or part of a workgroup

 ======================================== 
|    OS information on 192.168.90.116    |
 ======================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 458.
Use of uninitialized value $os_info in concatenation (.) or string at ./enum4linux.pl line 464.
[+] Got OS info for 192.168.90.116 from smbclient: 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 467.
[+] Got OS info for 192.168.90.116 from srvinfo:
        CASSIOS        Wk Sv PrQ Unx NT SNT Samba 4.10.4
        platform_id     :       500
        os version      :       6.1
        server type     :       0x809a03

 =============================== 
|    Users on 192.168.90.116    |
 =============================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 866.
Use of uninitialized value $users in print at ./enum4linux.pl line 874.
Use of uninitialized value $users in pattern match (m//) at ./enum4linux.pl line 877.

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 881.
Use of uninitialized value $users in print at ./enum4linux.pl line 888.
Use of uninitialized value $users in pattern match (m//) at ./enum4linux.pl line 890.

 =========================================== 
|    Share Enumeration on 192.168.90.116    |
 =========================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 640.
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated

        Sharename       Type      Comment
        ---------       ----      -------
        print$          Disk      Printer Drivers
        Samantha Konstan Disk      Backups and Recycler files
        IPC$            IPC       IPC Service (Samba 4.10.4)
Reconnecting with SMB1 for workgroup listing.

        Server               Comment
        ---------            -------

        Workgroup            Master
        ---------            -------

[+] Attempting to map shares on 192.168.90.116
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 654.
//192.168.90.116/print$ Mapping: DENIED, Listing: N/A
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 654.
//192.168.90.116/IPC$   [E] Can't understand response:
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
NT_STATUS_OBJECT_NAME_NOT_FOUND listing \*

 ====================================================== 
|    Password Policy Information for 192.168.90.116    |
 ====================================================== 


[+] Attaching to 192.168.90.116 using a NULL share

[+] Trying protocol 139/SMB...

[+] Found domain(s):

        [+] CASSIOS
        [+] Builtin

[+] Password Info for Domain: CASSIOS

        [+] Minimum password length: 5
        [+] Password history length: None
        [+] Maximum password age: 37 days 6 hours 21 minutes 
        [+] Password Complexity Flags: 000000

                [+] Domain Refuse Password Change: 0
                [+] Domain Password Store Cleartext: 0
                [+] Domain Password Lockout Admins: 0
                [+] Domain Password No Clear Change: 0
                [+] Domain Password No Anon Change: 0
                [+] Domain Password Complex: 0

        [+] Minimum password age: None
        [+] Reset Account Lockout Counter: 30 minutes 
        [+] Locked Account Duration: 30 minutes 
        [+] Account Lockout Threshold: None
        [+] Forced Log off Time: 37 days 6 hours 21 minutes 

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 501.

[+] Retieved partial password policy with rpcclient:

Password Complexity: Disabled
Minimum Password Length: 5


 ================================ 
|    Groups on 192.168.90.116    |
 ================================ 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 542.

[+] Getting builtin groups:

[+] Getting builtin group memberships:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 542.

[+] Getting local groups:

[+] Getting local group memberships:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 593.

[+] Getting domain groups:

[+] Getting domain group memberships:

 ========================================================================= 
|    Users on 192.168.90.116 via RID cycling (RIDS: 500-550,1000-1050)    |
 ========================================================================= 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
[I] Found new SID: S-1-22-1
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
[I] Found new SID: S-1-5-21-2252333370-3875534841-3061236221
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 742.
[I] Found new SID: S-1-5-32
[+] Enumerating users using SID S-1-22-1 and logon username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios]
└─$               
```

### Downloading all Files

```
┌──(kali㉿kali)-[~]
└─$ smbclient //192.168.90.116/Samantha\ Konstan -N
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Anonymous login successful
Try "help" to get a list of possible commands.
smb: \> ls
  .                                   D        0  Thu Oct  1 16:28:46 2020
  ..                                  D        0  Thu Sep 24 13:38:10 2020
  recycler.ser                        N        0  Wed Sep 23 21:35:15 2020
  readme.txt                          N      478  Thu Sep 24 13:32:50 2020
  spring-mvc-quickstart-archetype      D        0  Thu Sep 24 13:36:11 2020
  thymeleafexamples-layouts           D        0  Thu Sep 24 13:37:09 2020
  resources.html                      N    42713  Thu Sep 24 13:37:41 2020
  pom-bak.xml                         N     2187  Thu Oct  1 16:28:46 2020

                8374272 blocks of size 1024. 6449032 blocks available
smb: \> lcd /tmp
smb: \> get readme.txt
getting file \readme.txt of size 478 as readme.txt (0.7 KiloBytes/sec) (average 0.7 KiloBytes/sec)
smb: \> get resources.html
getting file \resources.html of size 42713 as resources.html (40.0 KiloBytes/sec) (average 24.3 KiloBytes/sec)
smb: \> get pom-bak.xml
getting file \pom-bak.xml of size 2187 as pom-bak.xml (3.1 KiloBytes/sec) (average 18.2 KiloBytes/sec)
smb: \> cd spring-mvc-quickstart-archetype
smb: \spring-mvc-quickstart-archetype\> ls
  .                                   D        0  Thu Sep 24 13:36:11 2020
  ..                                  D        0  Thu Oct  1 16:28:46 2020
  README.md                           N     4778  Thu Sep 24 13:35:01 2020
  archetype-catalog.xml               N      774  Thu Sep 24 13:35:01 2020
  src                                 D        0  Thu Sep 24 13:35:01 2020
  pom.xml                             N     1732  Thu Sep 24 13:36:11 2020

                8374272 blocks of size 1024. 6449068 blocks available
smb: \spring-mvc-quickstart-archetype\> cd src
smb: \spring-mvc-quickstart-archetype\src\> ls
  .                                   D        0  Thu Sep 24 13:35:01 2020
  ..                                  D        0  Thu Sep 24 13:36:11 2020
  main                                D        0  Thu Sep 24 13:35:01 2020

                8374272 blocks of size 1024. 6449068 blocks available
smb: \spring-mvc-quickstart-archetype\src\> cd main
smb: \spring-mvc-quickstart-archetype\src\main\> ls
  .                                   D        0  Thu Sep 24 13:35:01 2020
  ..                                  D        0  Thu Sep 24 13:35:01 2020
  resources                           D        0  Thu Sep 24 13:35:01 2020

                8374272 blocks of size 1024. 6449068 blocks available
smb: \spring-mvc-quickstart-archetype\src\main\> cd resources
smb: \spring-mvc-quickstart-archetype\src\main\resources\> ls
  .                                   D        0  Thu Sep 24 13:35:01 2020
  ..                                  D        0  Thu Sep 24 13:35:01 2020
  META-INF                            D        0  Thu Sep 24 13:35:01 2020
  archetype-resources                 D        0  Thu Sep 24 13:35:01 2020

                8374272 blocks of size 1024. 6449044 blocks available
smb: \spring-mvc-quickstart-archetype\src\main\resources\> cd ../../../
smb: \spring-mvc-quickstart-archetype\> cd ../
smb: \> cd thymeleafexamples-layouts
smb: \thymeleafexamples-layouts\> ls
  .                                   D        0  Thu Sep 24 13:37:09 2020
  ..                                  D        0  Thu Oct  1 16:28:46 2020
  BUILD.txt                           N      343  Thu Sep 24 13:36:42 2020
  CONTRIBUTING.markdown               N    14828  Thu Sep 24 13:36:42 2020
  LICENSE.txt                         N    11358  Thu Sep 24 13:36:42 2020
  NOTICE.txt                          N      626  Thu Sep 24 13:36:42 2020
  README.md                           N      384  Thu Sep 24 13:36:42 2020
  src                                 D        0  Thu Sep 24 13:36:42 2020
  pom.xml                             N    11211  Thu Sep 24 13:37:09 2020

                8374272 blocks of size 1024. 6449064 blocks available
smb: \thymeleafexamples-layouts\> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ cd /tmp                                      
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat readme.txt 
The recycler is a critical piece of our industrial infraestructure.
Please be careful with it!

The .ser file holds all the last data saved from the process, it can
be readed from the upper management dashboard app. 

Remember to set the location of the file to my home directory "~/backups".

Set this directory to share access so the remote system can access the
file via SMB.

Any concerns or suggestions, please reach at samantha@loca.host.

Samantha Konstan
Java Mantainer
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat pom-bak.xml    
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <parent>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-parent</artifactId>
                <version>2.3.4.RELEASE</version>
                <relativePath/> <!-- lookup parent from repository -->
        </parent>
        <groupId>com.industrial</groupId>
        <artifactId>recycler</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <name>recycler</name>
        <description>Recycler Control Information</description>

        <properties>
                <java.version>1.8</java.version>
        </properties>

        <dependencies>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-thymeleaf</artifactId>
                </dependency>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-web</artifactId>
                </dependency>
                <dependency>
                  <groupId>org.springframework.boot</groupId>
                  <artifactId>spring-boot-starter-security</artifactId>
                </dependency>
                <dependency>
                  <groupId>org.springframework.security</groupId>
                  <artifactId>spring-security-test</artifactId>
                  <scope>test</scope>
                </dependency>
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-devtools</artifactId>
                    <scope>runtime</scope>
                    <optional>true</optional>
                </dependency>
                <dependency>
                    <groupId>org.apache.commons</groupId>
                    <artifactId>commons-collections4</artifactId>
                    <version>4.0</version>
                </dependency>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-test</artifactId>
                        <scope>test</scope>
                        <exclusions>
                                <exclusion>
                                        <groupId>org.junit.vintage</groupId>
                                        <artifactId>junit-vintage-engine</artifactId>
                                </exclusion>
                        </exclusions>
                </dependency>
        </dependencies>

        <build>
                <plugins>
                        <plugin>
                                <groupId>org.springframework.boot</groupId>
                                <artifactId>spring-boot-maven-plugin</artifactId>
                        </plugin>
                </plugins>
        </build>

</project>
                                                                                                                                                                                                                      
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Cassios/smbfiles]
└─$ smbclient //192.168.90.116/Samantha\ Konstan -N
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Anonymous login successful
Try "help" to get a list of possible commands.
smb: \> mask ""
smb: \> recurse ON
smb: \> prompt OFF
smb: \> mget *
getting file \recycler.ser of size 0 as recycler.ser (0.0 KiloBytes/sec) (average 0.0 KiloBytes/sec)
getting file \readme.txt of size 478 as readme.txt (0.7 KiloBytes/sec) (average 0.4 KiloBytes/sec)
...
```

## 8080 - Web

![](Pasted%20image%2020220214120954.png)

![](Pasted%20image%2020220214121025.png)

Failed Credentials

```
recycler:recycler
admin:admin
admin:password
guest:guest
backup:backup
samantha:samantha
user:demo
```

# Privesc

# Others