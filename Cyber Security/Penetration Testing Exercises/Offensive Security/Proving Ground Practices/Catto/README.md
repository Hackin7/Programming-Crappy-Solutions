# Catto

# Enumeration
 ## nmap

```bash
# Nmap 7.91 scan initiated Wed Mar  2 07:34:36 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Catto/results/192.168.128.139/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Catto/results/192.168.128.139/scans/xml/_full_tcp_nmap.xml" 192.168.128.139
Warning: 192.168.128.139 giving up on port because retransmission cap hit (6).
adjust_timeouts2: packet supposedly had rtt of -60915 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -60915 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -256994 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -256994 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -171335 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -171335 microseconds.  Ignoring time.
Nmap scan report for 192.168.128.139
Host is up, received user-set (0.19s latency).
Scanned at 2022-03-02 07:34:39 EST for 1026s
Not shown: 65472 closed ports
Reason: 65472 resets
PORT      STATE    SERVICE        REASON         VERSION
2319/tcp  filtered infolibria     no-response
2330/tcp  filtered tscchat        no-response
4771/tcp  filtered unknown        no-response
5042/tcp  filtered asnaacceler8db no-response
5093/tcp  filtered sentinel-lm    no-response
5670/tcp  filtered filemq         no-response
5712/tcp  filtered unknown        no-response
5730/tcp  filtered unieng         no-response
6426/tcp  filtered unknown        no-response
8080/tcp  open     http           syn-ack ttl 63 nginx 1.14.1
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.14.1
|_http-title: Identity by HTML5 UP
10277/tcp filtered unknown        no-response
10592/tcp filtered unknown        no-response
11467/tcp filtered unknown        no-response
12842/tcp filtered unknown        no-response
13878/tcp filtered unknown        no-response
14552/tcp filtered unknown        no-response
15659/tcp filtered unknown        no-response
16449/tcp filtered unknown        no-response
17204/tcp filtered unknown        no-response
17567/tcp filtered unknown        no-response
17748/tcp filtered unknown        no-response
18080/tcp open     http           syn-ack ttl 63 Apache httpd 2.4.37 ((centos))
| http-methods: 
|   Supported Methods: GET POST OPTIONS HEAD TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.37 (centos)
|_http-title: CentOS \xE6\x8F\x90\xE4\xBE\x9B\xE7\x9A\x84 Apache HTTP \xE6\x9C\x8D\xE5\x8A\xA1\xE5\x99\xA8\xE6\xB5\x8B\xE8\xAF\x95\xE9\xA1\xB5
18276/tcp filtered unknown        no-response
18336/tcp filtered unknown        no-response
18898/tcp filtered unknown        no-response
22289/tcp filtered wnn6_Cn        no-response
22510/tcp filtered unknown        no-response
26745/tcp filtered unknown        no-response
26748/tcp filtered unknown        no-response
28453/tcp filtered unknown        no-response
29351/tcp filtered unknown        no-response
30330/tcp open     http           syn-ack ttl 63 Node.js Express framework
|_http-cors: HEAD GET POST PUT PATCH
|_http-favicon: Unknown favicon MD5: BC550ED3CF565EB8D826B8A5840A6527
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: Site doesn't have a title (text/html; charset=UTF-8).
31943/tcp filtered unknown        no-response
33047/tcp open     http           syn-ack ttl 63 Node.js Express framework
|_http-cors: GET POST PUT DELETE PATCH
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: Site doesn't have a title (text/html; charset=utf-8).
33659/tcp filtered unknown        no-response
34494/tcp filtered unknown        no-response
35045/tcp open     unknown        syn-ack ttl 63
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, DistCCD, Hello, Help, JavaRMI, Kerberos, LANDesk-RC, LDAPBindReq, LDAPSearchReq, LPDString, NCP, NotesRPC, RPCCheck, RTSPRequest, Radmin, SIPOptions, SMBProgNeg, SSLSessionReq, SSLv23SessionReq, TLSSessionReq, TerminalServer, TerminalServerCookie, X11Probe: 
|     HTTP/1.1 400 Bad Request
|_    Connection: close
35932/tcp filtered unknown        no-response
38636/tcp filtered unknown        no-response
42022/tcp open     ssh            syn-ack ttl 63 OpenSSH 8.0 (protocol 2.0)
| ssh-hostkey: 
|   3072 cc:21:51:f2:c6:2a:ad:d6:ca:07:04:de:70:5f:fa:13 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC4sO3kdviVPNeuwbrKWi5q+4eElUHgjIPPgbtcbGXSx1FIM3ptYjJPpGSP1wVEcZL1iKrMx+we3j0u+UX1f1Rg9o0KsUt/XcqgFmEAwEoixwmZ/RIN9zNYQ/GZsmrOgMFz4EqQjB4k7XRKljaKbZoMDvWxfGOPMdyWjYZWGJmXoiykxELLE76ZefH03ZakIKLNhAfDoiAaK8vy1FlG9ubiZFQDmu8oEkeZuXolDWivfO9dEMILdBw0V6+azll+TRVRK35cvsh9J9u8XE9d1ZKu5iPutur2+F2bMXP3xSXP8mVcv+ILpccmxrnMog6LePRil6XS5/07XpW3igtH2BRljCrnIus0GNZ+sHH7yQ/uFy8YB+PEHYFgKqJnV3Ef6x7qLj+yh/YodL509roXup+DNpyB6UW1txnH3oShyK2ueiZ1YKPqzugxGCLOTovDBiGNtKfXxu1zFabLtUsAc+zlqzSLWcfqh/rYw6tHHZSWrx5rGMNeFJ+rx1gTiuuUSEE=
|   256 05:e4:90:d2:00:2b:9d:14:e3:9f:44:68:d2:8e:bc:dc (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBKs+nIUzvQSjDApNdFM1xkn0nIvh1G2k9p7O2yk0N3I+4VqsHwlbG8a+jM50Ep2WfccT6l1PmM6LxUuwzarQs1w=
|   256 ca:80:49:73:f0:c8:05:ae:bd:2b:42:37:1d:13:e0:71 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOLjHYcabXSVangls2dlfJbJlCemLtrImilhDAOOXQYl
42526/tcp filtered unknown        no-response
43043/tcp filtered unknown        no-response
46791/tcp filtered unknown        no-response
47511/tcp filtered unknown        no-response
49230/tcp filtered unknown        no-response
49296/tcp filtered unknown        no-response
49710/tcp filtered unknown        no-response
50400/tcp open     http           syn-ack ttl 63 Node.js Express framework
|_http-cors: HEAD GET POST PUT DELETE PATCH
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: Error
50473/tcp filtered unknown        no-response
50975/tcp filtered unknown        no-response
51574/tcp filtered unknown        no-response
51671/tcp filtered unknown        no-response
53472/tcp filtered unknown        no-response
53585/tcp filtered unknown        no-response
55440/tcp filtered unknown        no-response
55515/tcp filtered unknown        no-response
56224/tcp filtered unknown        no-response
56832/tcp filtered unknown        no-response
57093/tcp filtered unknown        no-response
58753/tcp filtered unknown        no-response
63658/tcp filtered unknown        no-response
63838/tcp filtered unknown        no-response
64049/tcp filtered unknown        no-response
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port35045-TCP:V=7.91%I=9%D=3/2%Time=621F67F7%P=x86_64-pc-linux-gnu%r(RT
SF:SPRequest,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20clos
SF:e\r\n\r\n")%r(RPCCheck,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnec
SF:tion:\x20close\r\n\r\n")%r(DNSVersionBindReqTCP,2F,"HTTP/1\.1\x20400\x2
SF:0Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(DNSStatusRequestTCP
SF:,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n
SF:")%r(Hello,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20clo
SF:se\r\n\r\n")%r(Help,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnectio
SF:n:\x20close\r\n\r\n")%r(SSLSessionReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Re
SF:quest\r\nConnection:\x20close\r\n\r\n")%r(TerminalServerCookie,2F,"HTTP
SF:/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(TLSS
SF:essionReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20clos
SF:e\r\n\r\n")%r(SSLv23SessionReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r
SF:\nConnection:\x20close\r\n\r\n")%r(Kerberos,2F,"HTTP/1\.1\x20400\x20Bad
SF:\x20Request\r\nConnection:\x20close\r\n\r\n")%r(SMBProgNeg,2F,"HTTP/1\.
SF:1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(X11Probe
SF:,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n
SF:")%r(LPDString,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x2
SF:0close\r\n\r\n")%r(LDAPSearchReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Request
SF:\r\nConnection:\x20close\r\n\r\n")%r(LDAPBindReq,2F,"HTTP/1\.1\x20400\x
SF:20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(SIPOptions,2F,"HTT
SF:P/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(LAN
SF:Desk-RC,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\
SF:r\n\r\n")%r(TerminalServer,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nCo
SF:nnection:\x20close\r\n\r\n")%r(NCP,2F,"HTTP/1\.1\x20400\x20Bad\x20Reque
SF:st\r\nConnection:\x20close\r\n\r\n")%r(NotesRPC,2F,"HTTP/1\.1\x20400\x2
SF:0Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(DistCCD,2F,"HTTP/1\
SF:.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(JavaRMI
SF:,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n
SF:")%r(Radmin,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20cl
SF:ose\r\n\r\n");
OS fingerprint not ideal because: maxTimingRatio (1.468000e+00) is greater than 1.4
Aggressive OS guesses: Linux 3.10 - 3.12 (94%), Linux 4.4 (94%), Linux 4.9 (93%), Linux 3.10 - 3.16 (92%), Linux 4.0 (91%), Linux 3.11 - 4.1 (91%), Linux 3.10 (91%), Linux 2.6.32 (91%), Linux 2.6.39 (91%), Linux 3.4 (91%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=3/2%OT=8080%CT=1%CU=41556%PV=Y%DS=2%DC=T%G=N%TM=621F6861%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=10C%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%T=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T5(R=N)
T6(R=N)
T7(R=N)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 35.248 days (since Wed Jan 26 01:55:02 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 587/tcp)
HOP RTT       ADDRESS
1   201.85 ms 192.168.49.1
2   201.89 ms 192.168.128.139

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Mar  2 07:51:46 2022 -- 1 IP address (1 host up) scanned in 1030.23 seconds
```

 ## 8080 - Web - nginx

 ![](Pasted%20image%2020220302205238.png)

![](Pasted%20image%2020220302212856.png)

![](Pasted%20image%2020220302213005.png)
![](Pasted%20image%2020220302213013.png)

POST request to `/#`

![](Pasted%20image%2020220302213153.png)

 ## 18080 - Web - Apache

![](Pasted%20image%2020220302204845.png)

### dir enum

```bash
┌──(kali㉿kali)-[~/Desktop]
└─$ dirb http://192.168.128.139:18080/

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Wed Mar  2 07:48:24 2022
URL_BASE: http://192.168.128.139:18080/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.128.139:18080/ ----
==> DIRECTORY: http://192.168.128.139:18080/backup/                                                                                                                    
+ http://192.168.128.139:18080/cgi-bin/ (CODE:403|SIZE:217)                                                                                                            
==> DIRECTORY: http://192.168.128.139:18080/noindex/                                                                                                                   
                                                                                                                                                                       
---- Entering directory: http://192.168.128.139:18080/backup/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.128.139:18080/noindex/ ----
^C> Testing: http://192.168.128.139:18080/noindex/advancedsearch                                                                                                       
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Desktop]
└─$ 
```

![](Pasted%20image%2020220302210048.png)

## 30330 - Web - Express - Gatsby

![](Pasted%20image%2020220302205550.png)
![](Pasted%20image%2020220302205558.png)

### pages Enum

![](Pasted%20image%2020220302212450.png)

![](Pasted%20image%2020220302212504.png)

`WallAskCharacter305`

 ## 33047 - Web - Express API

```bash
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:33047/
<ul>
      <li><a href="/trackEvent">/trackEvent</a></li>
<li><a href="/trackError">/trackError</a></li>
    </ul>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:33047/trackEvent
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Error</title>
</head>
<body>
<pre>Cannot GET /trackEvent</pre>
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:33047/trackError
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Error</title>
</head>
<body>
<pre>Cannot GET /trackError</pre>
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:33047/trackEvent -X POST
{"status":"error","error":"Please provide a body array with the arguments for the function."}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:33047/trackError -X POST
{"status":"error","error":"Please provide a body array with the arguments for the function."}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

```bash
                                                                                             
┌──(kali㉿kali)-[/tmp]
└─$ curl -H "Content-Type: application/json"  http://192.168.128.139:33047/trackEvent --data "['hello']"
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Error</title>
</head>
<body>
<pre>SyntaxError: Unexpected token &#39; in JSON at position 1<br> &nbsp; &nbsp;at JSON.parse (&lt;anonymous&gt;)<br> &nbsp; &nbsp;at parse (/home/marcus/gatsby-blog-starter/node_modules/body-parser/lib/types/json.js:89:19)<br> &nbsp; &nbsp;at /home/marcus/gatsby-blog-starter/node_modules/body-parser/lib/read.js:121:18<br> &nbsp; &nbsp;at invokeCallback (/home/marcus/gatsby-blog-starter/node_modules/raw-body/index.js:224:16)<br> &nbsp; &nbsp;at done (/home/marcus/gatsby-blog-starter/node_modules/raw-body/index.js:213:7)<br> &nbsp; &nbsp;at IncomingMessage.onEnd (/home/marcus/gatsby-blog-starter/node_modules/raw-body/index.js:273:7)<br> &nbsp; &nbsp;at IncomingMessage.emit (events.js:203:15)<br> &nbsp; &nbsp;at endReadableNT (_stream_readable.js:1145:12)<br> &nbsp; &nbsp;at process._tickCallback (internal/process/next_tick.js:63:19)</pre>
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## 42022 - SSH

## 35045 - 

## 50400 - Web - Express 

```html
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Error</title>
</head>
<body>
<pre>Cannot GET /</pre>
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/ -X POST
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Error</title>
</head>
<body>
<pre>Cannot POST /</pre>
</body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/ -I     
HTTP/1.1 404 Not Found
X-Powered-By: Express
Access-Control-Allow-Origin: *
Content-Security-Policy: default-src 'none'
X-Content-Type-Options: nosniff
Content-Type: text/html; charset=utf-8
Content-Length: 140
Date: Wed, 02 Mar 2022 12:49:59 GMT
Connection: keep-alive

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

Dir enumeration

```bash
200        0l        0w        0c http://192.168.128.139:50400/service
200        1l        1w       36c http://192.168.128.139:50400/session
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/session                                                                                                                       1 ⨯
b1ea2437-cbc5-4d15-86e7-f4c4256706b1                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/service
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/service -I
HTTP/1.1 200 OK
X-Powered-By: Express
Access-Control-Allow-Origin: *
Content-Type: application/json; charset=utf-8
Date: Wed, 02 Mar 2022 13:12:05 GMT
Connection: keep-alive

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.128.139:50400/session   
b1ea2437-cbc5-4d15-86e7-f4c4256706b1                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploitation

username from 33047, password from 30330

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ssh marcus@192.168.128.139 -p 42022                                                       
marcus@192.168.128.139's password: 
[marcus@catto ~]$ ls
gatsby-blog-starter  local.txt
[marcus@catto ~]$ cat local.txt
bd239e0e996710ebc35f4bef8bc62a8c
[marcus@catto ~]$ ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.128.139  netmask 255.255.255.0  broadcast 192.168.128.255
        inet6 fe80::db4b:aab5:a1f1:aea6  prefixlen 64  scopeid 0x20<link>
        ether 00:50:56:ba:e5:06  txqueuelen 1000  (Ethernet)
        RX packets 1162995  bytes 132436998 (126.3 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1172356  bytes 968380407 (923.5 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 506558  bytes 171524181 (163.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 506558  bytes 171524181 (163.5 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[marcus@catto ~]$ # Password is IntermediateVery HardLinux
[marcus@catto ~]$ # Password is WallAskCharacter305
[marcus@catto ~]$
```

![](Pasted%20image%2020220302213645.png)

# Privesc

## File Enum
```bash
[marcus@catto /]$ cd /var/www/html
[marcus@catto html]$ ls
backup
[marcus@catto html]$ touch cmd.php
touch: cannot touch 'cmd.php': Permission denied
[marcus@catto html]$ ls -al
total 0
drwxr-xr-x 3 root root 20 Dec  1  2020 .
drwxr-xr-x 4 root root 33 Nov 30  2020 ..
drwxr-xr-x 4 root root 90 Dec  1  2020 backup
[marcus@catto html]$ cd backup
[marcus@catto backup]$ ls
build_conf.json  code  latex  LICENSE.txt  README.md
[marcus@catto backup]$ cd code
[marcus@catto code]$ ls
locations.json  tracks.json
[marcus@catto code]$ cd ..
[marcus@catto backup]$ cd latex
[marcus@catto latex]$ ls
slides  templates
[marcus@catto latex]$ cd /usr/share/nginx/
html/    modules/ 
[marcus@catto latex]$ cd /usr/share/nginx/
[marcus@catto nginx]$ ls
html  modules
[marcus@catto nginx]$ cd html
[marcus@catto html]$ ls
404.html  50x.html  assets  download  images  index.bak  index.html  LICENSE.txt  nginx-logo.png  poweredby.png  README.txt
[marcus@catto html]$ 
```

## Hidden Services

```bash
[marcus@catto gatsby-blog-starter]$ netstat -anp | grep LISTEN
(Not all processes could be identified, non-owned process info
 will not be shown, you would have to be root to see it all.)
tcp        0      0 127.0.0.1:41591         0.0.0.0:*               LISTEN      1630/node           
tcp        0      0 0.0.0.0:30330           0.0.0.0:*               LISTEN      1355/node           
tcp        0      0 0.0.0.0:42022           0.0.0.0:*               LISTEN      -                   
tcp        0      0 0.0.0.0:8080            0.0.0.0:*               LISTEN      -                   
tcp6       0      0 :::33047                :::*                    LISTEN      1632/node           
tcp6       0      0 :::50400                :::*                    LISTEN      1623/node           
tcp6       0      0 :::18080                :::*                    LISTEN      -                   
tcp6       0      0 :::35045                :::*                    LISTEN      1355/node           
tcp6       0      0 :::42022                :::*                    LISTEN      -                   
tcp6       0      0 :::8080                 :::*                    LISTEN      -                   
unix  2      [ ACC ]     STREAM     LISTENING     24905    -                    /var/lib/sss/pipes/nss
unix  2      [ ACC ]     STREAM     LISTENING     24871    -                    /etc/httpd/run/cgisock.918
unix  2      [ ACC ]     STREAM     LISTENING     11313    -                    /run/systemd/journal/stdout
unix  2      [ ACC ]     STREAM     LISTENING     24649    -                    /run/php-fpm/www.sock
unix  2      [ ACC ]     STREAM     LISTENING     23628    -                    /var/run/vmware/guestServicePipe
unix  2      [ ACC ]     STREAM     LISTENING     511319   2269/systemd         /run/user/1000/systemd/private
unix  2      [ ACC ]     STREAM     LISTENING     511328   2269/systemd         /run/user/1000/bus
unix  2      [ ACC ]     STREAM     LISTENING     18582    -                    /run/systemd/private
unix  2      [ ACC ]     SEQPACKET  LISTENING     19107    -                    /run/systemd/coredump
unix  2      [ ACC ]     STREAM     LISTENING     18599    -                    /run/lvm/lvmpolld.socket
unix  2      [ ACC ]     SEQPACKET  LISTENING     18608    -                    /run/udev/control
unix  2      [ ACC ]     STREAM     LISTENING     22468    -                    /var/run/.heim_org.h5l.kcm-socket
unix  2      [ ACC ]     STREAM     LISTENING     22470    -                    /run/dbus/system_bus_socket
unix  2      [ ACC ]     STREAM     LISTENING     24577    -                    /var/lib/sss/pipes/private/sbus-monitor
unix  2      [ ACC ]     STREAM     LISTENING     24620    -                    /var/lib/sss/pipes/private/sbus-dp_implicit_files.933
[marcus@catto gatsby-blog-starter]$ curl 41591
curl: (7) Couldn't connect to server
[marcus@catto gatsby-blog-starter]$ curl 127.0.0.1:41591
<!DOCTYPE html><html><head><meta charSet="utf-8"/><meta http-equiv="x-ua-compatible" content="ie=edge"/><meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/><meta name="note" content="environment=development"/><title data-react-helmet="true"></title><link rel="icon" href="/favicon-32x32.png?v=4a9773549091c227cd2eb82ccd9c5e3a" type="image/png"/><link rel="manifest" href="/manifest.webmanifest" crossorigin="anonymous"/><meta name="theme-color" content="#663399"/><link rel="apple-touch-icon" sizes="48x48" href="/icons/icon-48x48.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="72x72" href="/icons/icon-72x72.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="96x96" href="/icons/icon-96x96.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="144x144" href="/icons/icon-144x144.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="192x192" href="/icons/icon-192x192.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="256x256" href="/icons/icon-256x256.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="384x384" href="/icons/icon-384x384.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><link rel="apple-touch-icon" sizes="512x512" href="/icons/icon-512x512.png?v=4a9773549091c227cd2eb82ccd9c5e3a"/><script src="/socket.io/socket.io.js"></script></head><body><div id="___gatsby"></div><script src="/polyfill.js" nomodule=""></script><script src="/commons.js"></script></body></html>[marcus@catto gatsby-blog-starter]$ 
```

Port Forwarding

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ssh marcus@192.168.128.139 -p 42022 -L 41591:127.0.0.1:41591 
marcus@192.168.128.139's password: 
Last login: Wed Mar  2 13:34:22 2022 from 192.168.49.128
[marcus@catto ~]$ 
```

same gatsby site tho

![](Pasted%20image%2020220302215014.png)

# Others