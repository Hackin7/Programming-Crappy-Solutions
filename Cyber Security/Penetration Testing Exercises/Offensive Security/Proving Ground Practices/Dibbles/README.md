# Dibble

# Methodology

## Overall

- [x] nmap simple scan
- [x] nmap full script scan
- [x] nmap UDP scan?
- [x] nmap vuln scan

## 21 - FTP
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks https://book.hacktricks.xyz/pentesting/pentesting-ftp
	- [ ] FTP Bounce Attack

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
	- [ ] Remote denial of Service - Useless
- [ ] Google
- [ ] More

Logging in
- [x] Anonymous/ Null Login - **Works**
Brute Force `I` - Doesn't work as anonymous only

## 22 - SSH

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in
Brute Force `I` 
- [ ] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 80 - Web
### Apache
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

### Drupal
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks - https://book.hacktricks.xyz/pentesting/pentesting-web/drupal
	- [x] User Enumeration
	- [x] Hidden Page Enumeration
	- [ ] Code execution with admin creds
	- [ ] Post exploitation
- [ ] More

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in
Brute Force `I` 
- [x] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More


### Basic
Source Code `E`
- [ ] Find all the files, hidden or not (if possible)
- [ ] Look through the source code of ALL the files
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt)
- [x] Common wordlist
- [x] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [ ] Given hostname - No Given
- [ ] Hostname derived from box name - *banzai.pg* - No Diff
- [ ] More

Vulnerability Scanning `I`
- [ ] Nikto Vulnerability Scanner
- [ ] More


## 3000 - Web

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

**Basic**

Source Code `E`
- [ ] Find all the files, hidden or not (if possible)
- [ ] Look through the source code of ALL the files
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt)
- [x] Common wordlist
- [x] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [ ] Given hostname - No Given
- [ ] Hostname derived from box name - *banzai.pg* - No Diff
- [ ] More

Vulnerability Scanning `I`
- [ ] Nikto Vulnerability Scanner
- [ ] More

## 27017 - MongoDB

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation 
- [ ]  Google

Custom ways of Exploitation
- [x] Hacktricks  https://book.hacktricks.xyz/pentesting/27017-27018-mongodb
	- [x] Enumerate Database
- [ ] More

Search & Test for Vulnerabiliaties `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Fri Jan 21 02:41:03 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Dibbles/results/192.168.196.110/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Dibbles/results/192.168.196.110/scans/xml/_full_tcp_nmap.xml" 192.168.196.110
adjust_timeouts2: packet supposedly had rtt of -302953 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -302953 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -256434 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -256434 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -255651 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -255651 microseconds.  Ignoring time.
Nmap scan report for 192.168.196.110
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 02:41:04 EST for 370s
Not shown: 65530 filtered ports
Reason: 65530 no-responses
PORT      STATE SERVICE REASON         VERSION
21/tcp    open  ftp     syn-ack ttl 63 vsftpd 3.0.3
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_Can't get directory listing: TIMEOUT
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to 192.168.49.196
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 2
|      vsFTPd 3.0.3 - secure, fast, stable
|_End of status
22/tcp    open  ssh     syn-ack ttl 63 OpenSSH 8.3 (protocol 2.0)
| ssh-hostkey: 
|   3072 9d:3f:eb:1b:aa:9c:1e:b1:30:9b:23:53:4b:cf:59:75 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDJQfskNhOndcMLdRllpGbvhSaJBkmwdZnt3n0U7U3XxjpKx/ZUagAkwNTNPooV1Vc10PSdPE1pWMpqEiiHz7+guLRB4SrXsayYx67pZ0yiRrZ7gaxyEMKoI+p9owIt77Q6mG7PDjb5PQCd7G0xYFMCCaNFUpDfzZZUp2RGenL6b/xLSY1g0/Id1c9Q1S2pKsxMmf+TFqvAS6uOjSHY9fMbQesNQ0hZ74hcWooMOARyPTIYsu2/EmFjhz/hWydF2y5yikz96aBmBl6Z4KBVjp9vFHH50BwAMJuXyKMx5yCr4JzEV8RY3D6otNvR/yxuAxGcwffsaY6O1f9K8HyP6mF9J22tuxsRepSQTDUXNAUGeg9RR86RP7EpGkJ+3Y08vFGnsaRUY7w0800mpafyBeQMjO07urK0UuHihOKTRyW0aXsk9W/ruNJkLQNPWuNiZ/R1QCFRICQLJXl6V0nw0sKv7uxdDYO50OyQ3w3T08pazQr8tiuW38YonUwKPU6I6xc=
|   256 cd:dc:05:e6:e3:bb:12:33:f7:09:74:50:12:8a:85:64 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBK9spPy8kad9kuulG4kX03Wofq8wXe6arLeCb41/Nh7xFMtpRGM6zo7A8U3Vatg7bX20jaU43i7uYZyl7IA5dNA=
|   256 a0:90:1f:50:78:b3:9e:41:2a:7f:5c:6f:4d:0e:a1:fa (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIJ00KH0CvMHGQmVCsdM6I+93pxC0naR6to6qUq3ZJa4b
80/tcp    open  http    syn-ack ttl 63 Apache httpd 2.4.46 ((Fedora))
|_http-favicon: Unknown favicon MD5: CF2445DCB53A031C02F9B57E2199BC03
|_http-generator: Drupal 9 (https://www.drupal.org)
| http-methods: 
|_  Supported Methods: GET POST HEAD OPTIONS
| http-robots.txt: 22 disallowed entries 
| /core/ /profiles/ /README.txt /web.config /admin/ 
| /comment/reply/ /filter/tips /node/add/ /search/ /user/register/ 
| /user/password/ /user/login/ /user/logout/ /index.php/admin/ 
| /index.php/comment/reply/ /index.php/filter/tips /index.php/node/add/ 
| /index.php/search/ /index.php/user/password/ /index.php/user/register/ 
|_/index.php/user/login/ /index.php/user/logout/
|_http-server-header: Apache/2.4.46 (Fedora)
|_http-title: Home | Hacking Articles
3000/tcp  open  http    syn-ack ttl 63 Node.js (Express middleware)
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: Site doesn't have a title (text/html; charset=utf-8).
27017/tcp open  mongodb syn-ack ttl 63 MongoDB 4.2.9
| mongodb-databases: 
|   totalSize = 307200.0
|   databases
|     1
|       empty = false
|       name = admin
|       sizeOnDisk = 40960.0
|     0
|       empty = false
|       name = account-app
|       sizeOnDisk = 131072.0
|     3
|       empty = false
|       name = local
|       sizeOnDisk = 73728.0
|     2
|       empty = false
|       name = config
|       sizeOnDisk = 61440.0
|_  ok = 1.0
|_mongodb-info: ERROR: Script execution failed (use -d to debug)
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/21%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61EA6502%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=108%TI=Z%TS=A)
OPS(O1=M506ST11NW7%O2=M506ST11NW7%O3=M506NNT11NW7%O4=M506ST11NW7%O5=M506ST11NW7%O6=M506ST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M506NNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 30.345 days (since Tue Dec 21 18:29:53 2021)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=263 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Unix

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   248.61 ms 192.168.49.1
2   248.94 ms 192.168.196.110

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 02:47:14 2022 -- 1 IP address (1 host up) scanned in 371.02 seconds
```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.171.110 
Connected to 192.168.171.110.
220 (vsFTPd 3.0.3)
Name (192.168.171.110:kali): 
530 This FTP server is anonymous only.
Login failed.
ftp> 

```


```bash
┌──(kali㉿kali)-[~]
└─$ ftp 192.168.196.110
Connected to 192.168.196.110.
220 (vsFTPd 3.0.3)
Name (192.168.196.110:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 PORT command successful. Consider using PASV.
425 Failed to establish connection.
ftp> lcd /tmp
Local directory now /tmp
ftp> put t
local: t remote: t
200 PORT command successful. Consider using PASV.
550 Permission denied.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

```bash
ftp> ls
ftp: setsockopt (ignored): Permission denied
---> PORT 192,168,49,234,184,13
200 PORT command successful. Consider using PASV.
---> LIST
425 Failed to establish connection.
ftp> 
```

## 22 - SSH

## 80 - Web - Drupal

### Dir enum

```bash
┌──(kali㉿kali)-[~]
└─$ dirb http://192.168.234.110                                                                                                                                   130 ⨯

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Feb 26 12:28:45 2022
URL_BASE: http://192.168.234.110/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.234.110/ ----
+ http://192.168.234.110/admin (CODE:403|SIZE:4306)                                                                                                                    
+ http://192.168.234.110/Admin (CODE:403|SIZE:4306)                                                                                                                    
+ http://192.168.234.110/ADMIN (CODE:403|SIZE:4306)                                                                                                                    
+ http://192.168.234.110/batch (CODE:403|SIZE:4306)                                                                                                                    
+ http://192.168.234.110/cgi-bin/ (CODE:403|SIZE:199)                                                                                                                  
+ http://192.168.234.110/contact (CODE:200|SIZE:8187)                                                                                                                  
+ http://192.168.234.110/Contact (CODE:200|SIZE:8187)                                                                                                                  
==> DIRECTORY: http://192.168.234.110/core/                                                                                                                            
+ http://192.168.234.110/index.php (CODE:200|SIZE:13708)                                                                                                               
==> DIRECTORY: http://192.168.234.110/modules/                                                                                                                         
+ http://192.168.234.110/node (CODE:200|SIZE:13655)                                                                                                                    
==> DIRECTORY: http://192.168.234.110/profiles/                                                                                                                        
+ http://192.168.234.110/robots.txt (CODE:200|SIZE:1594)                                                                                                               
+ http://192.168.234.110/search (CODE:302|SIZE:382)                                                                                                                    
+ http://192.168.234.110/Search (CODE:302|SIZE:382)                                                                                                                    
==> DIRECTORY: http://192.168.234.110/sites/                                                                                                                           
==> DIRECTORY: http://192.168.234.110/themes/                                                                                                                          
+ http://192.168.234.110/user (CODE:302|SIZE:378)                                                                                                                      
+ http://192.168.234.110/vendor (CODE:403|SIZE:199)                                                                                                                    
+ http://192.168.234.110/web.config (CODE:200|SIZE:4566)                                                                                                               
                                                                                                                                                                       
---- Entering directory: http://192.168.234.110/core/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.234.110/modules/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.234.110/profiles/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.234.110/sites/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                                                                                                                       
---- Entering directory: http://192.168.234.110/themes/ ----
(!) WARNING: Directory IS LISTABLE. No need to scan it.                        
    (Use mode '-w' if you want to scan it anyway)
                                                                               
-----------------
END_TIME: Sat Feb 26 12:44:31 2022
DOWNLOADED: 4612 - FOUND: 15
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.234.110/web.config
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <system.webServer>
    <!-- Don't show directory listings for URLs which map to a directory. -->
    <directoryBrowse enabled="false" />

    <!--
       Caching configuration was not delegated by default. Some hosters may not
       delegate the caching configuration to site owners by default and that
       may cause errors when users install. Uncomment this if you want to and
       are allowed to enable caching.
     -->
    <!--
    <caching>
      <profiles>
        <add extension=".php" policy="DisableCache" kernelCachePolicy="DisableCache" />
        <add extension=".html" policy="CacheForTimePeriod" kernelCachePolicy="CacheForTimePeriod" duration="14:00:00" />
      </profiles>
    </caching>
     -->

    <rewrite>
      <rules>
        <rule name="Protect files and directories from prying eyes" stopProcessing="true">
          <match url="\.(engine|inc|install|module|profile|po|sh|.*sql|theme|twig|tpl(\.php)?|xtmpl|yml|svn-base)$|^(code-style\.pl|Entries.*|Repository|Root|Tag|Template|all-wcprops|entries|format|composer\.(json|lock)|\.htaccess)$" />
          <action type="CustomResponse" statusCode="403" subStatusCode="0" statusReason="Forbidden" statusDescription="Access is forbidden." />
        </rule>

        <rule name="Force simple error message for requests for non-existent favicon.ico" stopProcessing="true">
          <match url="favicon\.ico" />
          <action type="CustomResponse" statusCode="404" subStatusCode="1" statusReason="File Not Found" statusDescription="The requested file favicon.ico was not found" />
          <conditions>
            <add input="{REQUEST_FILENAME}" matchType="IsFile" negate="true" />
          </conditions>
        </rule>
     <!-- If running on a PHP version affected by httpoxy vulnerability
      uncomment the following rule to mitigate it's impact. To make this
      rule work, you will also need to add HTTP_PROXY to the allowed server
      variables manually in IIS. See https://www.drupal.org/node/2783079.
        <rule name="Erase HTTP_PROXY" patternSyntax="Wildcard">
          <match url="*.*" />
          <serverVariables>
            <set name="HTTP_PROXY" value="" />
          </serverVariables>
          <action type="None" />
        </rule>
    -->
    <!-- To redirect all users to access the site WITH the 'www.' prefix,
     http://example.com/foo will be redirected to http://www.example.com/foo)
     adapt and uncomment the following:   -->
    <!--
        <rule name="Redirect to add www" stopProcessing="true">
          <match url="^(.*)$" ignoreCase="false" />
          <conditions>
            <add input="{HTTP_HOST}" pattern="^example\.com$" />
          </conditions>
          <action type="Redirect" redirectType="Permanent" url="http://www.example.com/{R:1}" />
        </rule>
    -->

    <!-- To redirect all users to access the site WITHOUT the 'www.' prefix,
     http://www.example.com/foo will be redirected to http://example.com/foo)
     adapt and uncomment the following:   -->
    <!--
        <rule name="Redirect to remove www" stopProcessing="true">
          <match url="^(.*)$" ignoreCase="false" />
          <conditions>
            <add input="{HTTP_HOST}" pattern="^www\.example\.com$" />
          </conditions>
          <action type="Redirect" redirectType="Permanent" url="http://example.com/{R:1}" />
        </rule>
    -->

        <!-- Pass all requests not referring directly to files in the filesystem
         to index.php. -->
        <rule name="Short URLS" stopProcessing="true">
          <match url="^(.*)$" ignoreCase="false" />
          <conditions>
            <add input="{REQUEST_FILENAME}" matchType="IsFile" ignoreCase="false" negate="true" />
            <add input="{REQUEST_FILENAME}" matchType="IsDirectory" ignoreCase="false" negate="true" />
            <add input="{URL}" pattern="^/favicon.ico$" ignoreCase="false" negate="true" />
          </conditions>
          <action type="Rewrite" url="index.php" />
        </rule>
      </rules>
    </rewrite>

  <!-- If running Windows Server 2008 R2 this can be commented out -->
    <!-- httpErrors>
      <remove statusCode="404" subStatusCode="-1" />
      <error statusCode="404" prefixLanguageFilePath="" path="/index.php" responseMode="ExecuteURL" />
    </httpErrors -->

    <defaultDocument>
     <!-- Set the default document -->
      <files>
         <clear />
        <add value="index.php" />
      </files>
    </defaultDocument>

  </system.webServer>
</configuration>

																																						   ┌──(kali㉿kali)-[~]
└─$ curl http://192.168.234.110/robots.txt
#
# robots.txt
#
# This file is to prevent the crawling and indexing of certain parts
# of your site by web crawlers and spiders run by sites like Yahoo!
# and Google. By telling these "robots" where not to go on your site,
# you save bandwidth and server resources.
#
# This file will be ignored unless it is at the root of your host:
# Used:    http://example.com/robots.txt
# Ignored: http://example.com/site/robots.txt
#
# For more information about the robots.txt standard, see:
# http://www.robotstxt.org/robotstxt.html

User-agent: *
# CSS, JS, Images
Allow: /core/*.css$
Allow: /core/*.css?
Allow: /core/*.js$
Allow: /core/*.js?
Allow: /core/*.gif
Allow: /core/*.jpg
Allow: /core/*.jpeg
Allow: /core/*.png
Allow: /core/*.svg
Allow: /profiles/*.css$
Allow: /profiles/*.css?
Allow: /profiles/*.js$
Allow: /profiles/*.js?
Allow: /profiles/*.gif
Allow: /profiles/*.jpg
Allow: /profiles/*.jpeg
Allow: /profiles/*.png
Allow: /profiles/*.svg
# Directories
Disallow: /core/
Disallow: /profiles/
# Files
Disallow: /README.txt
Disallow: /web.config
# Paths (clean URLs)
Disallow: /admin/
Disallow: /comment/reply/
Disallow: /filter/tips
Disallow: /node/add/
Disallow: /search/
Disallow: /user/register/
Disallow: /user/password/
Disallow: /user/login/
Disallow: /user/logout/
# Paths (no clean URLs)
Disallow: /index.php/admin/
Disallow: /index.php/comment/reply/
Disallow: /index.php/filter/tips
Disallow: /index.php/node/add/
Disallow: /index.php/search/
Disallow: /index.php/user/password/
Disallow: /index.php/user/register/
Disallow: /index.php/user/login/
Disallow: /index.php/user/logout/

┌──(kali㉿kali)-[~]
└─$ 
```

### Drupal Enum

https://github.com/drupal/drupal

![](Pasted%20image%2020220121174853.png)

### User Enumeration
![](Pasted%20image%2020220121183334.png)

![](Pasted%20image%2020220121183345.png)

![](Pasted%20image%2020220121184954.png)

![](Pasted%20image%2020220121185037.png)

### Page enum

No hidden, 1-4

![](Pasted%20image%2020220121183644.png)

### Tried Creating Account

![](Pasted%20image%2020220123222625.png)

## 3000 - Web

![](Pasted%20image%2020220121175526.png)

![](Pasted%20image%2020220121175553.png)

![](Pasted%20image%2020220121184515.png)

## 27017 - MongoDB

### Data Dump

```bash
┌──(kali㉿kali)-[~]
└─$ mongo 192.168.196.110:27017                                                                                                                                     1 ⨯
MongoDB shell version v5.0.5
connecting to: mongodb://192.168.196.110:27017/test?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("130b5eca-4d84-4734-9a8e-4b1cca0acaec") }
MongoDB server version: 4.2.9
WARNING: shell and server versions do not match
================
Warning: the "mongo" shell has been superseded by "mongosh",
which delivers improved usability and compatibility.The "mongo" shell has been deprecated and will be removed in
an upcoming release.
For installation instructions, see
https://docs.mongodb.com/mongodb-shell/install/
================
---
The server generated these startup warnings when booting: 
2021-03-31T00:31:03.324+0000 I  STORAGE  [initandlisten] 
2021-03-31T00:31:03.324+0000 I  STORAGE  [initandlisten] ** WARNING: Using the XFS filesystem is strongly recommended with the WiredTiger storage engine
2021-03-31T00:31:03.324+0000 I  STORAGE  [initandlisten] **          See http://dochub.mongodb.org/core/prodnotes-filesystem
2021-03-31T00:31:04.876+0000 I  CONTROL  [initandlisten] 
2021-03-31T00:31:04.876+0000 I  CONTROL  [initandlisten] ** WARNING: Access control is not enabled for the database.
2021-03-31T00:31:04.876+0000 I  CONTROL  [initandlisten] **          Read and write access to data and configuration is unrestricted.
2021-03-31T00:31:04.876+0000 I  CONTROL  [initandlisten] ** WARNING: You are running this process as the root user, which is not recommended.
2021-03-31T00:31:04.876+0000 I  CONTROL  [initandlisten] 
---
---
        Enable MongoDB's free cloud-based monitoring service, which will then receive and display
        metrics about your deployment (disk utilization, CPU, operation statistics, etc).

        The monitoring data will be available on a MongoDB website with a unique URL accessible to you
        and anyone you share the URL with. MongoDB may use this information to make product
        improvements and to suggest MongoDB products and deployment options to you.

        To enable free monitoring, run the following command: db.enableFreeMonitoring()
        To permanently disable this reminder, run the following command: db.disableFreeMonitoring()
---
> show dbs
account-app  0.000GB
admin        0.000GB
config       0.000GB
local        0.000GB
> use account-app
switched to db account-app
> show collections
logmsg
users
> db.users.find()
{ "_id" : ObjectId("5f73c575eae85a15b8df908d"), "username" : "administrator", "password" : "ab6edb97f0c7a6455c57f94b7df73263e57113c85f38cd9b9470c8be8d6dd8ac", "facebook" : "NEVER!", "github" : "http://github.com/", "name" : "administrator", "twitter" : "https://twitter.com/sadserver" }
> db.users.find()
{ "_id" : ObjectId("5f73c575eae85a15b8df908d"), "username" : "administrator", "password" : "ab6edb97f0c7a6455c57f94b7df73263e57113c85f38cd9b9470c8be8d6dd8ac", "facebook" : "NEVER!", "github" : "http://github.com/", "name" : "administrator", "twitter" : "https://twitter.com/sadserver" }
> db.logmsg.find()
{ "_id" : ObjectId("5f73c713eae85a15b8df908e"), "username" : "administrator", "msg" : "Someone think that would be fun to send a drop tables in our system and deleted all the messages. Fixed in the last commit, so this will be a clear start." }
{ "_id" : ObjectId("5f73c74deae85a15b8df908f"), "username" : "administrator", "msg" : "Please ensure to follow the proper gramma and write as much details as you can on all the issues. \"Fix stuff\" is not enough." }
{ "_id" : ObjectId("5f73c79eeae85a15b8df9090"), "username" : "Happy_message", "msg" : "You know you’re in IT if... ...you paid $6000 for your computer and $500 for your car. ...your pets are named Cat 5 and Cat 6. ...power cords breed in your office. ...your laptop is held together with duct tape. ...you accidentally tell your wife to submit a ticket when she asks you what you want for dinner. ...you make CAT5 action figures. ...you have a tray table on the server rack for lunch. ...you’ve racked up 10 weeks of vacation and still don’t have time to take any. ...rock, paper, scissors is a legitimate decision-making process. ...you have more switches than friends. ...you have a server rack in your garage at home. ...all of your relatives expect you to fix their home computer." }
{ "_id" : ObjectId("5f73c7b1eae85a15b8df9091"), "username" : "administrator", "msg" : "Please keep it clean (serious) here" }
{ "_id" : ObjectId("5f73c7e1eae85a15b8df9092"), "username" : "comprendre", "msg" : "J'ai une blague sur UDP buuuuut vous pourriez ne pas comprendre ....." }
{ "_id" : ObjectId("5f73c841eae85a15b8df9093"), "username" : "Mayroong", "msg" : "Mayroong 10 uri ng mga tao sa mundo. Ang mga nakakaunawa sa binary at sa mga hindi" }
> 
> use admin
switched to db admin
> show collections
system.version
> db.system.version.find()
{ "_id" : "featureCompatibilityVersion", "version" : "4.2" }
> use config
switched to db config
> show collections
system.sessions
> db.system.sessions.find()
> use loca
switched to db loca
> use local
switched to db local
> show collections
startup_log
> db.startup_log.find()
{ "_id" : "dibble-1600828915821", "hostname" : "dibble", "startTime" : ISODate("2020-09-23T02:41:55Z"), "startTimeLocal" : "Wed Sep 23 02:41:55.821", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(11204), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1601322064709", "hostname" : "dibble", "startTime" : ISODate("2020-09-28T19:41:04Z"), "startTimeLocal" : "Mon Sep 28 19:41:04.709", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(679), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1601423718310", "hostname" : "dibble", "startTime" : ISODate("2020-09-29T23:55:18Z"), "startTimeLocal" : "Tue Sep 29 23:55:18.310", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(903), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1601424190369", "hostname" : "dibble", "startTime" : ISODate("2020-09-30T00:03:10Z"), "startTimeLocal" : "Wed Sep 30 00:03:10.369", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(917), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1603300460036", "hostname" : "dibble", "startTime" : ISODate("2020-10-21T17:14:20Z"), "startTimeLocal" : "Wed Oct 21 17:14:20.036", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(936), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1604928072774", "hostname" : "dibble", "startTime" : ISODate("2020-11-09T13:21:12Z"), "startTimeLocal" : "Mon Nov  9 13:21:12.774", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(932), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1615403154957", "hostname" : "dibble", "startTime" : ISODate("2021-03-10T19:05:54Z"), "startTimeLocal" : "Wed Mar 10 19:05:54.957", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(938), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
{ "_id" : "dibble-1617150664904", "hostname" : "dibble", "startTime" : ISODate("2021-03-31T00:31:04Z"), "startTimeLocal" : "Wed Mar 31 00:31:04.904", "cmdLine" : { "net" : { "bindIp" : "0.0.0.0" }, "storage" : { "dbPath" : "/var/lib/mongo" }, "systemLog" : { "destination" : "file", "path" : "/var/log/mongodb/mongod.log" } }, "pid" : NumberLong(940), "buildinfo" : { "version" : "4.2.9", "gitVersion" : "06402114114ffc5146fd4b55402c96f1dc9ec4b5", "modules" : [ ], "allocator" : "tcmalloc", "javascriptEngine" : "mozjs", "sysInfo" : "deprecated", "versionArray" : [ 4, 2, 9, 0 ], "openssl" : { "running" : "OpenSSL 1.0.1e-fips 11 Feb 2013", "compiled" : "OpenSSL 1.0.1e-fips 11 Feb 2013" }, "buildEnvironment" : { "distmod" : "rhel70", "distarch" : "x86_64", "cc" : "/opt/mongodbtoolchain/v3/bin/gcc: gcc (GCC) 8.2.0", "ccflags" : "-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-const-variable -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp", "cxx" : "/opt/mongodbtoolchain/v3/bin/g++: g++ (GCC) 8.2.0", "cxxflags" : "-Woverloaded-virtual -Wno-maybe-uninitialized -fsized-deallocation -std=c++17", "linkflags" : "-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro", "target_arch" : "x86_64", "target_os" : "linux" }, "bits" : 64, "debug" : false, "maxBsonObjectSize" : 16777216, "storageEngines" : [ "biggie", "devnull", "ephemeralForTest", "wiredTiger" ] } }
> 

```

Google Translate Messages

![](Pasted%20image%2020220227014845.png)

### Database after adding user

`admin`:`ab6edb97f0c7a6455c57f94b7df73263e57113c85f38cd9b9470c8be8d6dd8ac`

`admin`:`36f028580bb02cc8272a9a020f4200e346e276ae664e45ee80745574e2f5ab80`

On adding a new user `test`:`test`

![](Pasted%20image%2020220121180134.png)

```
> use account-app
switched to db account-app
> show collections
logmsg
users
> db.users.find()
{ "_id" : ObjectId("5f73c575eae85a15b8df908d"), "username" : "administrator", "password" : "ab6edb97f0c7a6455c57f94b7df73263e57113c85f38cd9b9470c8be8d6dd8ac", "facebook" : "NEVER!", "github" : "http://github.com/", "name" : "administrator", "twitter" : "https://twitter.com/sadserver" }
{ "_id" : ObjectId("61ea843d6eb51303c62b1199"), "username" : "test", "password" : "8737729a3ada8674940065008dd87d9bc110221bf02b1048beab6078349e792c" }
> 
```

### Hash Cracking

```bash
┌──(kali㉿kali)-[/tmp]
└─$ hash-identifier                                                         
   #########################################################################
   #     __  __                     __           ______    _____           #
   #    /\ \/\ \                   /\ \         /\__  _\  /\  _ `\         #
   #    \ \ \_\ \     __      ____ \ \ \___     \/_/\ \/  \ \ \/\ \        #
   #     \ \  _  \  /'__`\   / ,__\ \ \  _ `\      \ \ \   \ \ \ \ \       #
   #      \ \ \ \ \/\ \_\ \_/\__, `\ \ \ \ \ \      \_\ \__ \ \ \_\ \      #
   #       \ \_\ \_\ \___ \_\/\____/  \ \_\ \_\     /\_____\ \ \____/      #
   #        \/_/\/_/\/__/\/_/\/___/    \/_/\/_/     \/_____/  \/___/  v1.2 #
   #                                                             By Zion3R #
   #                                                    www.Blackploit.com #
   #                                                   Root@Blackploit.com #
   #########################################################################
--------------------------------------------------
 HASH: 8737729a3ada8674940065008dd87d9bc110221bf02b1048beab6078349e792c

Possible Hashs:
[+] SHA-256
[+] Haval-256

Least Possible Hashs:
[+] GOST R 34.11-94
[+] RipeMD-256
[+] SNEFRU-256
[+] SHA-256(HMAC)
[+] Haval-256(HMAC)
[+] RipeMD-256(HMAC)
[+] SNEFRU-256(HMAC)
[+] SHA-256(md5($pass))
[+] SHA-256(sha1($pass))
--------------------------------------------------
 HASH: ab6edb97f0c7a6455c57f94b7df73263e57113c85f38cd9b9470c8be8d6dd8ac

Possible Hashs:
[+] SHA-256
[+] Haval-256

Least Possible Hashs:
[+] GOST R 34.11-94
[+] RipeMD-256
[+] SNEFRU-256
[+] SHA-256(HMAC)
[+] Haval-256(HMAC)
[+] RipeMD-256(HMAC)
[+] SNEFRU-256(HMAC)
[+] SHA-256(md5($pass))
[+] SHA-256(sha1($pass))
--------------------------------------------------
 HASH: ^C

        Bye!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

NOT SHA256 Hash

### Update user

```
> db.users.find({"username":"administrator"})
{ "_id" : ObjectId("5f73c575eae85a15b8df908d"), "username" : "administrator", "password" : "ab6edb97f0c7a6455c57f94b7df73263e57113c85f38cd9b9470c8be8d6dd8ac", "facebook" : "NEVER!", "github" : "http://github.com/", "name" : "administrator", "twitter" : "https://twitter.com/sadserver" }
> db.users.update({"username":"administrator"}, { "_id" : ObjectId("5f73c575eae85a15b8df908d"), "username" : "administrator", "password" : "8737729a3ada8674940065008dd87d9bc110221bf02b1048beab6078349e792c", "facebook" : "NEVER!", "github" : "http://github.com/", "name" : "administrator", "twitter" : "https://twitter.com/sadserver" })
WriteResult({ "nMatched" : 1, "nUpserted" : 0, "nModified" : 1 })
> db.users.find({"username":"administrator"})
{ "_id" : ObjectId("5f73c575eae85a15b8df908d"), "username" : "administrator", "password" : "8737729a3ada8674940065008dd87d9bc110221bf02b1048beab6078349e792c", "facebook" : "NEVER!", "github" : "http://github.com/", "name" : "administrator", "twitter" : "https://twitter.com/sadserver" }
> 

```

No Updates

### Credential reuse

![](Pasted%20image%2020220121185132.png)

`admin` and the hash as credentials

![](Pasted%20image%2020220121185158.png)

# Exploitation

# Privilege Escalation

# Others