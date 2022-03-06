# Shenzi

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Mon Jan 24 09:35:48 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/xml/_full_tcp_nmap.xml" 192.168.234.55
adjust_timeouts2: packet supposedly had rtt of -421097 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -421097 microseconds.  Ignoring time.
Nmap scan report for 192.168.234.55
Host is up, received user-set (0.23s latency).
Scanned at 2022-01-24 09:35:49 EST for 802s
Not shown: 65526 filtered ports
Reason: 65526 no-responses
PORT     STATE SERVICE       REASON          VERSION
21/tcp   open  ftp           syn-ack ttl 127 FileZilla ftpd 0.9.41 beta
| ftp-syst: 
|_  SYST: UNIX emulated by FileZilla
80/tcp   open  http          syn-ack ttl 127 Apache httpd 2.4.43 ((Win64) OpenSSL/1.1.1g PHP/7.4.6)
|_http-favicon: Unknown favicon MD5: 56F7C04657931F2D0B79371B2D6E9820
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
| http-title: Welcome to XAMPP
|_Requested resource was http://192.168.234.55/dashboard/
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
443/tcp  open  ssl/http      syn-ack ttl 127 Apache httpd 2.4.43 ((Win64) OpenSSL/1.1.1g PHP/7.4.6)
|_http-favicon: Unknown favicon MD5: 6EB4A43CB64C97F76562AF703893C8FD
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
| http-title: Welcome to XAMPP
|_Requested resource was https://192.168.234.55/dashboard/
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
| tls-alpn: 
|_  http/1.1
445/tcp  open  microsoft-ds? syn-ack ttl 127
3306/tcp open  mysql?        syn-ack ttl 127
| fingerprint-strings: 
|   NULL, TLS-PSK: 
|_    Host '192.168.49.234' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.234' is not allowed to connect to this MariaDB server
5040/tcp open  unknown       syn-ack ttl 127
7680/tcp open  pando-pub?    syn-ack ttl 127
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port3306-TCP:V=7.91%I=9%D=1/24%Time=61EEBA0D%P=x86_64-pc-linux-gnu%r(NU
SF:LL,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20al
SF:lowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(TLS-PSK,4
SF:D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20allowe
SF:d\x20to\x20connect\x20to\x20this\x20MariaDB\x20server");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|98 (88%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_98
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (88%), Microsoft Windows 98 SE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/24%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61EEBC67%P=x86_64-pc-linux-gnu)
SEQ(SP=103%GCD=1%ISR=10B%TS=U)
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
TCP Sequence Prediction: Difficulty=260 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: -1s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 61238/tcp): CLEAN (Timeout)
|   Check 2 (port 34667/tcp): CLEAN (Timeout)
|   Check 3 (port 8032/udp): CLEAN (Timeout)
|   Check 4 (port 53353/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-24T14:48:28
|_  start_date: N/A

TRACEROUTE (using port 443/tcp)
HOP RTT       ADDRESS
1   246.99 ms 192.168.49.1
2   248.57 ms 192.168.234.55

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 24 09:49:11 2022 -- 1 IP address (1 host up) scanned in 802.87 seconds

```

### Vuln

```
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ nmap -p 21,80,135,139,443,445,3306,5040,7680 192.168.234.55 --script vuln -v                                                                              130 ⨯ 1 ⚙
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-24 10:04 EST
NSE: Loaded 105 scripts for scanning.
NSE: Script Pre-scanning.
Initiating NSE at 10:04
Completed NSE at 10:04, 10.02s elapsed
Initiating NSE at 10:04
Completed NSE at 10:04, 0.00s elapsed
Initiating Ping Scan at 10:04
Scanning 192.168.234.55 [2 ports]
Completed Ping Scan at 10:04, 0.25s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 10:04
Completed Parallel DNS resolution of 1 host. at 10:04, 0.02s elapsed
Initiating Connect Scan at 10:04
Scanning 192.168.234.55 [9 ports]
Discovered open port 135/tcp on 192.168.234.55
Discovered open port 445/tcp on 192.168.234.55
Discovered open port 443/tcp on 192.168.234.55
Discovered open port 139/tcp on 192.168.234.55
Discovered open port 80/tcp on 192.168.234.55
Discovered open port 3306/tcp on 192.168.234.55
Discovered open port 21/tcp on 192.168.234.55
Discovered open port 5040/tcp on 192.168.234.55
Completed Connect Scan at 10:04, 1.96s elapsed (9 total ports)
NSE: Script scanning 192.168.234.55.
Initiating NSE at 10:04
NSE: [tls-ticketbleed] Not running due to lack of privileges.
NSE: [firewall-bypass] lacks privileges.
Completed NSE at 10:10, 315.47s elapsed
Initiating NSE at 10:10
Completed NSE at 10:10, 2.68s elapsed
Nmap scan report for 192.168.234.55
Host is up (0.25s latency).

PORT     STATE    SERVICE
21/tcp   open     ftp
|_sslv2-drown: 
80/tcp   open     http
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-dombased-xss: Couldn't find any DOM based XSS.
| http-enum: 
|   /icons/: Potentially interesting folder w/ directory listing
|_  /img/: Potentially interesting directory w/ listing on 'apache/2.4.43 (win64) openssl/1.1.1g php/7.4.6'
| http-sql-injection: 
|   Possible sqli for queries:
|     http://192.168.234.55:80/dashboard/javascripts/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.234.55:80/dashboard/javascripts/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.234.55:80/dashboard/javascripts/?C=N%3bO%3dD%27%20OR%20sqlspider
|_    http://192.168.234.55:80/dashboard/javascripts/?C=S%3bO%3dA%27%20OR%20sqlspider
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-trace: TRACE is enabled
|_http-vuln-cve2017-1001000: ERROR: Script execution failed (use -d to debug)
135/tcp  open     msrpc
139/tcp  open     netbios-ssn
443/tcp  open     https
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-dombased-xss: Couldn't find any DOM based XSS.
| http-enum: 
|   /icons/: Potentially interesting folder w/ directory listing
|_  /img/: Potentially interesting directory w/ listing on 'apache/2.4.43 (win64) openssl/1.1.1g php/7.4.6'
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-trace: TRACE is enabled
|_http-vuln-cve2017-1001000: ERROR: Script execution failed (use -d to debug)
| ssl-dh-params: 
|   VULNERABLE:
|   Diffie-Hellman Key Exchange Insufficient Group Strength
|     State: VULNERABLE
|       Transport Layer Security (TLS) services that use Diffie-Hellman groups
|       of insufficient strength, especially those using one of a few commonly
|       shared groups, may be susceptible to passive eavesdropping attacks.
|     Check results:
|       WEAK DH GROUP 1
|             Cipher Suite: TLS_DHE_RSA_WITH_AES_256_CBC_SHA
|             Modulus Type: Safe prime
|             Modulus Source: RFC2409/Oakley Group 2
|             Modulus Length: 1024
|             Generator Length: 8
|             Public Key Length: 1024
|     References:
|_      https://weakdh.org
|_sslv2-drown: 
445/tcp  open     microsoft-ds
3306/tcp open     mysql
|_mysql-vuln-cve2012-2122: ERROR: Script execution failed (use -d to debug)
|_sslv2-drown: 
5040/tcp open     unknown
7680/tcp filtered pando-pub

Host script results:
|_samba-vuln-cve-2012-1182: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR

NSE: Script Post-scanning.
Initiating NSE at 10:10
Completed NSE at 10:10, 0.00s elapsed
Initiating NSE at 10:10
Completed NSE at 10:10, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 330.78 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$   
```

## 21 - FTP

```
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.234.55 
Connected to 192.168.234.55.
220-FileZilla Server version 0.9.41 beta
220-written by Tim Kosse (Tim.Kosse@gmx.de)
220 Please visit http://sourceforge.net/projects/filezilla/
Name (192.168.234.55:kali): anonymous
331 Password required for anonymous
Password:
530 Login or password incorrect!
Login failed.
Remote system type is UNIX.
ftp> 

```

Failed Credentials
```
admin:admin
admin:password
guest:guest
backup:backup
admin:FeltHeadwallWight357
postmaster:postmaster
postmaster:FeltHeadwallWight357
```

## 80 - Web

```
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ gobuster dir -u http://192.168.234.55/dashboard/ -x html,php,js -w /usr/share/seclists/Discovery/Web-Content/raft-small-directories.txt                         1 ⚙
===============================================================
Gobuster v3.1.0
by OJ Reeves (@TheColonial) & Christian Mehlmauer (@firefart)
===============================================================
[+] Url:                     http://192.168.234.55/dashboard/
[+] Method:                  GET
[+] Threads:                 10
[+] Wordlist:                /usr/share/seclists/Discovery/Web-Content/raft-small-directories.txt
[+] Negative Status codes:   404
[+] User Agent:              gobuster/3.1.0
[+] Extensions:              html,php,js
[+] Timeout:                 10s
===============================================================
2022/01/24 10:13:14 Starting gobuster in directory enumeration mode
===============================================================
/images               (Status: 301) [Size: 351] [--> http://192.168.234.55/dashboard/images/]
/docs                 (Status: 301) [Size: 349] [--> http://192.168.234.55/dashboard/docs/]  
/de                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/de/]    
/fr                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/fr/]    
/es                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/es/]    
/404.html             (Status: 200) [Size: 4384]                                             
/Images               (Status: 301) [Size: 351] [--> http://192.168.234.55/dashboard/Images/]
/ru                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/ru/]    
/it                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/it/]    
/index.html           (Status: 200) [Size: 7576]                                             
/pl                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/pl/]    
/javascripts          (Status: 301) [Size: 356] [--> http://192.168.234.55/dashboard/javascripts/]
/stylesheets          (Status: 301) [Size: 356] [--> http://192.168.234.55/dashboard/stylesheets/]
/faq.html             (Status: 200) [Size: 31751]                                                 
/ro                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/ro/]         
/tr                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/tr/]         
/hu                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/hu/]         
/jp                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/jp/]         
/Docs                 (Status: 301) [Size: 349] [--> http://192.168.234.55/dashboard/Docs/]       
/DE                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/DE/]         
/IMAGES               (Status: 301) [Size: 351] [--> http://192.168.234.55/dashboard/IMAGES/]     
/IT                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/IT/]         
/FR                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/FR/]         
/ES                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/ES/]         
/FAQ.html             (Status: 200) [Size: 31751]                                                 
/howto.html           (Status: 200) [Size: 6021]                                                  
/StyleSheets          (Status: 301) [Size: 356] [--> http://192.168.234.55/dashboard/StyleSheets/]
/ur                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/ur/]         
/Stylesheets          (Status: 301) [Size: 356] [--> http://192.168.234.55/dashboard/Stylesheets/]
/JavaScripts          (Status: 301) [Size: 356] [--> http://192.168.234.55/dashboard/JavaScripts/]
/RU                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/RU/]         
/JP                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/JP/]         
/Index.html           (Status: 200) [Size: 7576]                                                  
/Javascripts          (Status: 301) [Size: 356] [--> http://192.168.234.55/dashboard/Javascripts/]
/con                  (Status: 403) [Size: 1046]                                                  
/con.html             (Status: 403) [Size: 1046]                                                  
/con.php              (Status: 403) [Size: 1046]                                                  
/con.js               (Status: 403) [Size: 1046]                                                  
/DOCS                 (Status: 301) [Size: 349] [--> http://192.168.234.55/dashboard/DOCS/]       
/PL                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/PL/]         
/phpinfo.php          (Status: 200) [Size: 78587]                                                 
/Faq.html             (Status: 200) [Size: 31751]                                                 
/TR                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/TR/]         
/pt_BR                (Status: 301) [Size: 350] [--> http://192.168.234.55/dashboard/pt_BR/]      
/aux.php              (Status: 403) [Size: 1046]                                                  
/aux.js               (Status: 403) [Size: 1046]                                                  
/aux                  (Status: 403) [Size: 1046]                                                  
/aux.html             (Status: 403) [Size: 1046]                                                  
/HU                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/HU/]         
/Fr                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/Fr/]         
/RO                   (Status: 301) [Size: 347] [--> http://192.168.234.55/dashboard/RO/]         
/zh_TW                (Status: 301) [Size: 350] [--> http://192.168.234.55/dashboard/zh_TW/]      
                                                                                                  
===============================================================
2022/01/24 10:49:02 Finished
===============================================================
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$             
```

![](Pasted%20image%2020220306141054.png)

![](Pasted%20image%2020220306134835.png)
 ![](Pasted%20image%2020220306135104.png)

 ![](Pasted%20image%2020220306135633.png)
 ![](Pasted%20image%2020220306135647.png)

### Nikto

```bash
┌──(kali㉿kali)-[~]
└─$ nikto -h http://192.168.168.55/
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.168.55
+ Target Hostname:    192.168.168.55
+ Target Port:        80
+ Start Time:         2022-03-05 23:04:35 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
+ Retrieved x-powered-by header: PHP/7.4.6
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ Root page / redirects to: http://192.168.168.55/dashboard/
+ Apache mod_negotiation is enabled with MultiViews, which allows attackers to easily brute force file names. See http://www.wisec.it/sectou.php?id=4698ebdc59d15. The following alternatives for 'index' were found: HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var, HTTP_NOT_FOUND.html.var
+ OSVDB-877: HTTP TRACE method is active, suggesting the host is vulnerable to XST
+ OSVDB-3268: /img/: Directory indexing found.
+ OSVDB-3092: /img/: This might be interesting...
+ OSVDB-3268: /icons/: Directory indexing found.
+ OSVDB-3233: /icons/README: Apache default file found.
+ 8698 requests: 0 error(s) and 10 item(s) reported on remote host
+ End Time:           2022-03-05 23:32:54 (GMT-5) (1699 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested


      *********************************************************************
      Portions of the server's headers (PHP/7.4.6 Apache/2.4.43) are not in
      the Nikto 2.1.6 database or are newer than the known string. Would you like
      to submit this information (*no server specific data*) to CIRT.net
      for a Nikto update (or you may email to sullo@cirt.net) (y/n)? 

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

### Dir enum

```bash
┌──(kali㉿kali)-[~]
└─$ dirb http://192.168.168.55                                        

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Mar  5 22:49:47 2022
URL_BASE: http://192.168.168.55/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.168.55/ ----
+ http://192.168.168.55/aux (CODE:403|SIZE:1046)                                                                                                                       
+ http://192.168.168.55/cgi-bin/ (CODE:403|SIZE:1060)                                                                                                                  
+ http://192.168.168.55/com1 (CODE:403|SIZE:1046)                                                                                                                      
+ http://192.168.168.55/com2 (CODE:403|SIZE:1046)                                                                                                                      
+ http://192.168.168.55/com3 (CODE:403|SIZE:1046)                                                                                                                      
+ http://192.168.168.55/con (CODE:403|SIZE:1046)                                                                                                                       
==> DIRECTORY: http://192.168.168.55/dashboard/                                                                                                                        
+ http://192.168.168.55/examples (CODE:503|SIZE:1060)                                                                                                                  
+ http://192.168.168.55/favicon.ico (CODE:200|SIZE:30894)                                                                                                              
==> DIRECTORY: http://192.168.168.55/img/                                                                                                                              
+ http://192.168.168.55/index.php (CODE:302|SIZE:0)                                                                                                                    
+ http://192.168.168.55/licenses (CODE:403|SIZE:1205)                                                                                                                  
+ http://192.168.168.55/lpt1 (CODE:403|SIZE:1046)                                                                                                                      
+ http://192.168.168.55/lpt2 (CODE:403|SIZE:1046)                                                                                                                      
+ http://192.168.168.55/nul (CODE:403|SIZE:1046)                                                                                                                       
+ http://192.168.168.55/phpmyadmin (CODE:403|SIZE:1205)                                                                                                                
+ http://192.168.168.55/prn (CODE:403|SIZE:1046)                                                                                                                       
+ http://192.168.168.55/server-info (CODE:403|SIZE:1205)                                                                                                               
+ http://192.168.168.55/server-status (CODE:403|SIZE:1205)                                                                                                             
+ http://192.168.168.55/webalizer (CODE:403|SIZE:1046)                                                                                                                 
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/ ----
+ http://192.168.168.55/dashboard/aux (CODE:403|SIZE:1046)                                                                                                             
+ http://192.168.168.55/dashboard/com1 (CODE:403|SIZE:1046)                                                                                                            
+ http://192.168.168.55/dashboard/com2 (CODE:403|SIZE:1046)                                                                                                            
+ http://192.168.168.55/dashboard/com3 (CODE:403|SIZE:1046)                                                                                                            
+ http://192.168.168.55/dashboard/con (CODE:403|SIZE:1046)                                                                                                             
==> DIRECTORY: http://192.168.168.55/dashboard/de/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/docs/                                                                                                                   
==> DIRECTORY: http://192.168.168.55/dashboard/es/                                                                                                                     
+ http://192.168.168.55/dashboard/favicon.ico (CODE:200|SIZE:1150)                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/fr/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/hu/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/images/                                                                                                                 
==> DIRECTORY: http://192.168.168.55/dashboard/Images/                                                                                                                 
+ http://192.168.168.55/dashboard/index.html (CODE:200|SIZE:7576)                                                                                                      
==> DIRECTORY: http://192.168.168.55/dashboard/it/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/javascripts/                                                                                                            
==> DIRECTORY: http://192.168.168.55/dashboard/jp/                                                                                                                     
+ http://192.168.168.55/dashboard/lpt1 (CODE:403|SIZE:1046)                                                                                                            
+ http://192.168.168.55/dashboard/lpt2 (CODE:403|SIZE:1046)                                                                                                            
+ http://192.168.168.55/dashboard/nul (CODE:403|SIZE:1046)                                                                                                             
+ http://192.168.168.55/dashboard/phpinfo.php (CODE:200|SIZE:78665)                                                                                                    
==> DIRECTORY: http://192.168.168.55/dashboard/pl/                                                                                                                     
+ http://192.168.168.55/dashboard/prn (CODE:403|SIZE:1046)                                                                                                             
==> DIRECTORY: http://192.168.168.55/dashboard/pt_BR/                                                                                                                  
==> DIRECTORY: http://192.168.168.55/dashboard/ro/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/ru/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/stylesheets/                                                                                                            
==> DIRECTORY: http://192.168.168.55/dashboard/tr/                                                                                                                     
==> DIRECTORY: http://192.168.168.55/dashboard/zh_CN/                                                                                                                  
==> DIRECTORY: http://192.168.168.55/dashboard/zh_TW/                                                                                                                  
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/img/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/de/ ----
+ http://192.168.168.55/dashboard/de/aux (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/de/com1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/de/com2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/de/com3 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/de/con (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/de/index.html (CODE:200|SIZE:7797)                                                                                                   
+ http://192.168.168.55/dashboard/de/lpt1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/de/lpt2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/de/nul (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/de/prn (CODE:403|SIZE:1046)                                                                                                          
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/docs/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/es/ ----
+ http://192.168.168.55/dashboard/es/aux (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/es/com1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/es/com2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/es/com3 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/es/con (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/es/index.html (CODE:200|SIZE:7681)                                                                                                   
+ http://192.168.168.55/dashboard/es/lpt1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/es/lpt2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/es/nul (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/es/prn (CODE:403|SIZE:1046)                                                                                                          
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/fr/ ----
+ http://192.168.168.55/dashboard/fr/aux (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/fr/com1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/fr/com2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/fr/com3 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/fr/con (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/fr/index.html (CODE:200|SIZE:7772)                                                                                                   
+ http://192.168.168.55/dashboard/fr/lpt1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/fr/lpt2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/fr/nul (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/fr/prn (CODE:403|SIZE:1046)                                                                                                          
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/hu/ ----
+ http://192.168.168.55/dashboard/hu/aux (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/hu/com1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/hu/com2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/hu/com3 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/hu/con (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/hu/index.html (CODE:200|SIZE:7824)                                                                                                   
+ http://192.168.168.55/dashboard/hu/lpt1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/hu/lpt2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/hu/nul (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/hu/prn (CODE:403|SIZE:1046)                                                                                                          
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/images/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/Images/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/it/ ----
+ http://192.168.168.55/dashboard/it/aux (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/it/com1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/it/com2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/it/com3 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/it/con (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/it/index.html (CODE:200|SIZE:7702)                                                                                                   
+ http://192.168.168.55/dashboard/it/lpt1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/it/lpt2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/it/nul (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/it/prn (CODE:403|SIZE:1046)                                                                                                          
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/javascripts/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.168.55/dashboard/jp/ ----
+ http://192.168.168.55/dashboard/jp/aux (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/jp/com1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/jp/com2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/jp/com3 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/jp/con (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/jp/index.html (CODE:200|SIZE:7953)                                                                                                   
+ http://192.168.168.55/dashboard/jp/lpt1 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/jp/lpt2 (CODE:403|SIZE:1046)                                                                                                         
+ http://192.168.168.55/dashboard/jp/nul (CODE:403|SIZE:1046)                                                                                                          
+ http://192.168.168.55/dashboard/jp/prn (CODE:403|SIZE:1046)                                                                                                          
^C> Testing: http://192.168.168.55/dashboard/jp/typo3conf                                                                                                              
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

### DAVTest Fail

```bash
┌──(kali㉿kali)-[/var/lib/php/sessions]
└─$ davtest -url http://192.168.168.55                                                                                                                            127 ⨯
********************************************************
 Testing DAV connection
OPEN            FAIL:   http://192.168.168.55   Server response: 405 Method Not Allowed
                                                                                                                                                                        
┌──(kali㉿kali)-[/var/lib/php/sessions]
└─$ davtest -url http://192.168.168.55/dashboard
********************************************************
 Testing DAV connection
OPEN            FAIL:   http://192.168.168.55/dashboard Server response: 405 Method Not Allowed
                                                                                                                                                                        
┌──(kali㉿kali)-[/var/lib/php/sessions]
└─$
```

## 443 - Web
Looks the same as port 80

## 445 - SMB

```
┌──(kali㉿kali)-[/tmp]
└─$ smbmap -u null -p "" -H 192.168.234.55 -P 445 -R 2>&1
[+] Guest session       IP: 192.168.234.55:445  Name: 192.168.234.55                                    
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        IPC$                                                    READ ONLY       Remote IPC
        .\IPC$\*
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    InitShutdown
        fr--r--r--                4 Sun Dec 31 19:03:58 1600    lsass
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    ntsvcs
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    scerpc
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-28c-0
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-368-0
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    epmapper
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-1fc-0
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    LSM_API_service
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-3a0-0
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    eventlog
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-2cc-0
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    atsvc
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-510-0
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    spoolss
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-480-0
        fr--r--r--                4 Sun Dec 31 19:03:58 1600    wkssvc
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    trkwks
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    vgauth-service
        fr--r--r--                5 Sun Dec 31 19:03:58 1600    srvsvc
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    Winsock2\CatalogChangeListener-280-0
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    ROUTER
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    MsFteWds
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    SearchTextHarvester
        fr--r--r--                1 Sun Dec 31 19:03:58 1600    PIPE_EVENTROOT\CIMV2SCM EVENT PROVIDER
        fr--r--r--                3 Sun Dec 31 19:03:58 1600    W32TIME_ALT
        Shenzi                                                  READ ONLY
        .\Shenzi\*
        dr--r--r--                0 Fri May 29 09:26:51 2020    .
        dr--r--r--                0 Fri May 29 09:26:51 2020    ..
        fr--r--r--              894 Fri May 29 09:26:51 2020    passwords.txt
        fr--r--r--             7367 Fri May 29 09:26:51 2020    readme_en.txt
        fr--r--r--             3879 Fri May 29 09:26:51 2020    sess_klk75u2q4rpgfjs3785h6hpipp
        fr--r--r--              213 Fri May 29 09:26:51 2020    why.tmp
        fr--r--r--              178 Fri May 29 09:26:51 2020    xampp-control.ini
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

### Reading Files

Download all files

```bash
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Shenzi/smbfiles]
└─$ smbclient //192.168.168.55/Shenzi -N                                                              
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Try "help" to get a list of possible commands.
smb: \> prompt
smb: \> recurse
smb: \> mget *
getting file \passwords.txt of size 894 as passwords.txt (1.2 KiloBytes/sec) (average 1.2 KiloBytes/sec)
getting file \readme_en.txt of size 7367 as readme_en.txt (10.5 KiloBytes/sec) (average 5.8 KiloBytes/sec)
getting file \sess_klk75u2q4rpgfjs3785h6hpipp of size 3879 as sess_klk75u2q4rpgfjs3785h6hpipp (5.5 KiloBytes/sec) (average 5.7 KiloBytes/sec)
getting file \why.tmp of size 213 as why.tmp (0.3 KiloBytes/sec) (average 4.4 KiloBytes/sec)
getting file \xampp-control.ini of size 178 as xampp-control.ini (0.3 KiloBytes/sec) (average 3.5 KiloBytes/sec)
smb: \> 

```

```
┌──(kali㉿kali)-[/tmp]
└─$ smbclient //192.168.234.55/Shenzi -N                                                                                                                            1 ⨯
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Try "help" to get a list of possible commands.
smb: \> get *
NT_STATUS_OBJECT_NAME_INVALID opening remote file \*
smb: \> ls
  .                                   D        0  Thu May 28 11:45:09 2020
  ..                                  D        0  Thu May 28 11:45:09 2020
  passwords.txt                       A      894  Thu May 28 11:45:09 2020
  readme_en.txt                       A     7367  Thu May 28 11:45:09 2020
  sess_klk75u2q4rpgfjs3785h6hpipp      A     3879  Thu May 28 11:45:09 2020
  why.tmp                             A      213  Thu May 28 11:45:09 2020
  xampp-control.ini                   A      178  Thu May 28 11:45:09 2020

                12941823 blocks of size 4096. 6651051 blocks available
smb: \> get passwords.txt
getting file \passwords.txt of size 894 as passwords.txt (0.9 KiloBytes/sec) (average 0.9 KiloBytes/sec)
smb: \> get readme_en.txt
getting file \readme_en.txt of size 7367 as readme_en.txt (7.0 KiloBytes/sec) (average 3.9 KiloBytes/sec)
smb: \> get why.tmp
getting file \why.tmp of size 213 as why.tmp (0.2 KiloBytes/sec) (average 2.7 KiloBytes/sec)
smb: \> get xampp-control.ini
getting file \xampp-control.ini of size 178 as xampp-control.ini (0.2 KiloBytes/sec) (average 2.1 KiloBytes/sec)
smb: \> get sess_klk75u2q4rpgfjs3785h6hpipp
getting file \sess_klk75u2q4rpgfjs3785h6hpipp of size 3879 as sess_klk75u2q4rpgfjs3785h6hpipp (3.7 KiloBytes/sec) (average 2.4 KiloBytes/sec)
smb: \> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat passwords.txt 
### XAMPP Default Passwords ###

1) MySQL (phpMyAdmin):

   User: root
   Password:
   (means no password!)

2) FileZilla FTP:

   [ You have to create a new user on the FileZilla Interface ] 

3) Mercury (not in the USB & lite version): 

   Postmaster: Postmaster (postmaster@localhost)
   Administrator: Admin (admin@localhost)

   User: newuser  
   Password: wampp 

4) WEBDAV: 

   User: xampp-dav-unsecure
   Password: ppmax2011
   Attention: WEBDAV is not active since XAMPP Version 1.7.4.
   For activation please comment out the httpd-dav.conf and
   following modules in the httpd.conf
   
   LoadModule dav_module modules/mod_dav.so
   LoadModule dav_fs_module modules/mod_dav_fs.so  
   
   Please do not forget to refresh the WEBDAV authentification (users and passwords).     

5) WordPress:

   User: admin
   Password: FeltHeadwallWight357
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat readme_en.txt 
###### ApacheFriends XAMPP Version 7.4.6 ######

Important! PHP in this package needs the Microsoft Visual C++ 2017 Redistributable package from
http://www.microsoft.com/en-us/download/. Please ensure that the VC++ 2017 runtime
libraries are installed on your system.

  + Apache 2.4.43
  + MariaDB 10.4.11
  + PHP 7.4.6 (VC15 X86 64bit thread safe) + PEAR
  + phpMyAdmin 5.0.2
  + OpenSSL 1.1.0g
  + ADOdb 518a
  + Mercury Mail Transport System v4.63 (not included in the portable version)
  + FileZilla FTP Server 0.9.41 (not included in the portable version)
  + Webalizer 2.23-04 (not included in the portable version)
  + Strawberry Perl 5.16.3.1 Portable
  + Tomcat 7.0.103
  + XAMPP Control Panel Version 3.2.4.
  + XAMPP mailToDisk 1.0 (write emails via PHP on local disk in <xampp>\mailoutput. Activated in the php.ini as mail default.)

---------------------------------------------------------------

* System Requirements:

  + 64 MB RAM (RECOMMENDED)
  + 750 MB free fixed disk
  + Windows 7, Windows 8, Windows 10

---------------------------------------------------------------

* ATTENTION!!!!

For trouble with the mysql connection (via mysqlnd API in php) see also the startpage:
http://localhost/xampp/index.php

* QUICK INSTALLATION:

[NOTE: Unpack the package to your USB stick or a partition of your choice.
There it must be on the highest level like E:\ or W:\. It will
build E:\xampp or W:\xampp or something like this. Please do not use the "setup_xampp.bat" for an USB stick installation!]

Step 1: Unpack the package into a directory of your choice. Please start the
"setup_xampp.bat" and beginning the installation. Note: XAMPP makes no entries in the windows registry and no settings for the system variables.

Step 2: If installation ends successfully, start the Apache 2 with
"apache_start".bat", MySQL with "mysql_start".bat". Stop the MySQL Server with "mysql_stop.bat". For shutdown the Apache HTTPD, only close the Apache Command (CMD). Or use the fine XAMPP Control Panel with double-click on "xampp-control.exe"!

Step 3: Start your browser and type http://127.0.0.1 or http://localhost in the location bar. You should see our pre-made
start page with certain examples and test screens.

Step 4: PHP (with mod_php, as *.php), Perl by default with *.cgi, SSI with *.shtml are all located in => C:\xampp\htdocs\.
Examples:
- C:\xampp\htdocs\test.php => http://localhost/test.php
- C:\xampp\htdocs\myhome\test.php => http://localhost/myhome/test.php

Step 5: XAMPP UNINSTALL? Simply remove the "xampp" Directory.
But before please shutdown the apache and mysql.

---------------------------------------------------------------

* PHP MAIL FUNCTION:

There are three ways to work with the PHP Mail function.

1) With XAMPP mailToDisk every mail sending via the PHP mail() function will written in the <xampp>\mailoutput folder. MailToDisk is the default you do not have to change the php.ini. And please do not use mailToDisk for production!
2) With fakemail (sendmail.exe) you will send all mail() to your personal mail account. Therefore you have to edit the <xampp>\sendmail\sendmail.ini first. Then please activate fakemail (sendamil.exe) in the php.ini and comment out the mailToDisk line.
3) You can use a SMTP Server like the Mercury Mail Server alternate. Therefore comment out all sendmail_path lines in the php.ini. Now use the -> SMTP = localhost und -> smtp_port = 25 lines of course with your values in the php.ini.

Attention : If XAMPP is installed in a base directory with spaces (e.g. c:\program files\xampp) fakemail and mailtodisk do not work correctly. In this case please copy the sendmail or mailtodisk folder in your root folder (e.g. C:\sendmail) and use this for sendmail_path.

---------------------------------------------------------------

* PASSWORDS:

1) MySQL:

   User: root
   Password:
   (means no password!)

2) FileZilla FTP:

   [ You have to create a new user on the FileZilla Interface ]

3) Mercury:

   Postmaster: postmaster (postmaster@localhost)
   Administrator: Admin (admin@localhost)

   TestUser: newuser
   Password: wampp

4) WEBDAV:

   User: xampp-dav-unsecure
   Password: ppmax2011

---------------------------------------------------------------

* ONLY FOR NT SYSTEMS! (NT4 | Windows 2000 | Windows XP):

- \xampp\apache\apache_installservice.bat
  ===> Install Apache 2 as service

- \xampp\apache\apache_uninstallservice.bat
  ===> Uninstall Apache 2 as service

- \xampp\mysql\mysql_installservice.bat
  ===> Install MySQL as service

- \xampp\mysql\mysql_uninstallservice.bat
  ===> Uninstall MySQL as service

==> After all un- / installations of services, better restart system!

----------------------------------------------------------------

A matter of security (A MUST READ!)

As mentioned before, XAMPP is not meant for production use but only for developers in a development environment. The way XAMPP is configured is to be open as possible and allowing the developer anything he/she wants. For development environments this is great but in a production environment it could be fatal. Here a list of missing security
in XAMPP:

- The MySQL administrator (root) has no password.
- The MySQL daemon is accessible via network.
- phpMyAdmin is accessible via network.
- Examples are accessible via network.

---------------------------------------------------------------

* MYSQL NOTES:

(1) The MySQL server can be started by double-clicking (executing) mysql_start.bat. This file can be found in the same folder you installed XAMPP in, most likely this will be C:\xampp\.
The exact path to this file is X:\xampp\mysql_start.bat, where "X" indicates the letter of the drive you unpacked XAMPP into. This batch file starts the MySQL server in console mode. The first intialization might take a few minutes.
Do not close the DOS window or you'll crash the server! To stop the server, please use mysql_stop.bat, which is located in the same directory. Or use the fine XAMPP Control Panel with double-click on "xampp-control.exe" for all these things!

(2) To use MySQL as Service for NT / 2000 / XP, simply copy the "my.ini" file to "C:\my.ini". Please note that this file has to be placed in C:\ (root), other locations are not permitted. Then execute the "mysql_installservice.bat" in the mysql folder.

(3) MySQL starts with standard values for the user id and the password. The preset user id is "root", the password is "" (= no password). To access MySQL via PHP with the preset values, you'll have to use the following syntax:

        mysql_connect("localhost", "root", "");

If you want to set a password for MySQL access, please use of MySQL Admin.
To set the passwort "secret" for the user "root", type the following:

        C:\xampp\mysql\bin\mysqladmin.exe -u root -p secret

After changing the password you'll have to reconfigure phpMyAdmin to use the new password, otherwise it won't be able to access the databases. To do that, open the file config.inc.php in \xampp\phpmyadmin\ and edit the following lines:

        $cfg['Servers'][$i]['user']            = 'root';   // MySQL User
        $cfg['Servers'][$i]['auth_type']       = 'http';   // HTTP authentification

So first the 'root' password is queried by the MySQL server, before phpMyAdmin may access.

---------------------------------------------------------------

                Have a lot of fun! | Viel Spaß! | Bonne Chance!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat why.tmp      
Warum dieses tmp-Verzeichnis?
Das braucht beispielweise PHP 
f�r seine Sessions-Verwaltung.
Also bitte nicht l�schen!

Why this tmp-Folder?
PHP need it for saving
the Sessions. 
So please do not delete it!                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat xampp-control.ini 
[Common]
Edition=
Editor=notepad.exe
Browser=
Debug=0
Debuglevel=0
TomcatVisible=1
Language=English
[EnableModules]
Apache=1
MySQL=1
FileZilla=0
Mercury=0
Tomcat=0
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ file sess_klk75u2q4rpgfjs3785h6hpipp 
sess_klk75u2q4rpgfjs3785h6hpipp: ASCII text, with very long lines
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat sess_klk75u2q4rpgfjs3785h6hpipp
 PMA_token |s:32:"522b574a21767922222439295b4b2975"; HMAC_secret |s:16:"67gK3D[0mYw<Mlpn";browser_access_time|a:2:{s:7:"default";i:1590593735;s:36:"d3907c4c-ecaf-f98a-85db-1bce60b6913a";i:1590596659;}relation|a:1:{i:1;a:41:{s:11:"PMA_VERSION";s:5:"5.0.2";s:7:"relwork";b:1;s:11:"displaywork";b:1;s:12:"bookmarkwork";b:1;s:7:"pdfwork";b:1;s:8:"commwork";b:1;s:8:"mimework";b:1;s:11:"historywork";b:1;s:10:"recentwork";b:1;s:12:"favoritework";b:1;s:11:"uiprefswork";b:1;s:12:"trackingwork";b:1;s:14:"userconfigwork";b:1;s:9:"menuswork";b:1;s:7:"navwork";b:1;s:17:"savedsearcheswork";b:1;s:18:"centralcolumnswork";b:1;s:20:"designersettingswork";b:1;s:19:"exporttemplateswork";b:1;s:8:"allworks";b:1;s:4:"user";s:4:"root";s:2:"db";s:10:"phpmyadmin";s:8:"bookmark";s:13:"pma__bookmark";s:15:"central_columns";s:20:"pma__central_columns";s:11:"column_info";s:16:"pma__column_info";s:17:"designer_settings";s:22:"pma__designer_settings";s:16:"export_templates";s:21:"pma__export_templates";s:8:"favorite";s:13:"pma__favorite";s:7:"history";s:12:"pma__history";s:16:"navigationhiding";s:21:"pma__navigationhiding";s:9:"pdf_pages";s:14:"pma__pdf_pages";s:6:"recent";s:11:"pma__recent";s:8:"relation";s:13:"pma__relation";s:13:"savedsearches";s:18:"pma__savedsearches";s:12:"table_coords";s:17:"pma__table_coords";s:10:"table_info";s:15:"pma__table_info";s:13:"table_uiprefs";s:18:"pma__table_uiprefs";s:8:"tracking";s:13:"pma__tracking";s:10:"userconfig";s:15:"pma__userconfig";s:10:"usergroups";s:15:"pma__usergroups";s:5:"users";s:10:"pma__users";}}two_factor_check|b:1;cache|a:3:{s:8:"server_1";a:4:{s:15:"userprefs_mtime";s:10:"1590593621";s:14:"userprefs_type";s:2:"db";s:12:"config_mtime";i:1584764260;s:9:"userprefs";a:1:{s:7:"Console";a:1:{s:4:"Mode";s:8:"collapse";}}}s:13:"server_1_root";a:16:{s:14:"mysql_cur_user";s:14:"root@localhost";s:12:"is_grantuser";b:1;s:13:"is_createuser";b:1;s:12:"is_superuser";b:1;s:17:"is_create_db_priv";b:1;s:14:"is_reload_priv";b:1;s:12:"db_to_create";s:0:"";s:30:"dbs_where_create_table_allowed";a:1:{i:0;s:1:"*";}s:11:"dbs_to_test";b:0;s:9:"proc_priv";b:1;s:10:"table_priv";b:1;s:8:"col_priv";b:1;s:7:"db_priv";b:1;s:11:"binary_logs";a:0:{}s:18:"menu-levels-server";a:13:{s:9:"databases";s:9:"Databases";s:3:"sql";s:3:"SQL";s:6:"status";s:6:"Status";s:6:"rights";s:5:"Users";s:6:"export";s:6:"Export";s:6:"import";s:6:"Import";s:8:"settings";s:8:"Settings";s:6:"binlog";s:10:"Binary log";s:11:"replication";s:11:"Replication";s:4:"vars";s:9:"Variables";s:7:"charset";s:8:"Charsets";s:7:"plugins";s:7:"Plugins";s:6:"engine";s:7:"Engines";}s:14:"menu-levels-db";a:14:{s:9:"structure";s:9:"Structure";s:3:"sql";s:3:"SQL";s:6:"search";s:6:"Search";s:5:"query";s:5:"Query";s:6:"export";s:6:"Export";s:6:"import";s:6:"Import";s:9:"operation";s:10:"Operations";s:10:"privileges";s:10:"Privileges";s:8:"routines";s:8:"Routines";s:6:"events";s:6:"Events";s:8:"triggers";s:8:"Triggers";s:8:"tracking";s:8:"Tracking";s:8:"designer";s:8:"Designer";s:15:"central_columns";s:15:"Central columns";}}s:13:"version_check";a:2:{s:8:"response";s:419:"{
    "date": "2020-03-21", 
    "version": "5.0.2", 
    "releases": [
        {
            "date": "2020-03-21", 
            "php_versions": ">=5.5,<8.0", 
            "version": "4.9.5", 
            "mysql_versions": ">=5.5"
        }, 
        {
            "date": "2020-03-21", 
            "php_versions": ">=7.1,<8.0", 
            "version": "5.0.2", 
            "mysql_versions": ">=5.5"
        }
    ]
}";s:9:"timestamp";i:1590593621;}}git_location|N;is_git_revision|b:0;tmpval|a:4:{s:14:"favoriteTables";a:1:{i:1;a:0:{}}s:12:"recentTables";a:1:{i:1;a:0:{}}s:18:"table_limit_offset";i:0;s:21:"table_limit_offset_db";s:8:"testsite";}ConfigFile1|a:2:{s:7:"Console";a:1:{s:4:"Mode";s:8:"collapse";}s:7:"Servers";a:1:{i:1;a:2:{s:7:"only_db";s:0:"";s:7:"hide_db";s:0:"";}}}debug|a:0:{}errors|a:0:{}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```


## 3306 - MySQL
Cannot Access

```bash
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Shenzi/smbfiles]
└─$ mysql -h 192.168.168.55 -u root                                                
ERROR 1130 (HY000): Host '192.168.49.168' is not allowed to connect to this MariaDB server
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Shenzi/smbfiles]
└─$  
```

# Exploitation



# Privesc


# Others