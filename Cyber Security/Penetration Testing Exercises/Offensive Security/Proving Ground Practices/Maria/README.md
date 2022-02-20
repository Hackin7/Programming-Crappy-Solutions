# Maria

# Enumeration

## 21 - FTP

![](Pasted%20image%2020220220125343.png)

### Download Files

```bash
wget -r ftp://192.168.140.167 --user=anonymous   
```

```bash
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Maria/192.168.140.167]
└─$ ls     
automysqlbackup
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Maria/192.168.140.167]
└─$ cd automysqlbackup 
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Proving Ground Practices/Maria/192.168.140.167/automysqlbackup]
└─$ ls
etc  usr  var
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Proving Ground Practices/Maria/192.168.140.167/automysqlbackup]
└─$ cd etc            
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/etc]
└─$ ls -alR
.:
total 0
drwxrwxrwx 1 root root 360 Feb 20 00:03 .
drwxrwxrwx 1 root root 312 Feb 20 00:03 ..
drwxrwxrwx 1 root root  48 Feb 20 00:03 automysqlbackup
drwxrwxrwx 1 root root  48 Feb 20 00:03 cron.daily
drwxrwxrwx 1 root root  48 Feb 20 00:03 default

./automysqlbackup:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 360 Feb 20 00:03 ..

./cron.daily:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 360 Feb 20 00:03 ..

./default:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 360 Feb 20 00:03 ..
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/etc]
└─$ cd ../usr 
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/usr]
└─$ ls -alR
.:
total 0
drwxrwxrwx 1 root root 240 Feb 20 00:03 .
drwxrwxrwx 1 root root 312 Feb 20 00:03 ..
drwxrwxrwx 1 root root  48 Feb 20 00:03 sbin
drwxrwxrwx 1 root root 224 Feb 20 00:03 share

./sbin:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 240 Feb 20 00:03 ..

./share:
total 0
drwxrwxrwx 1 root root 224 Feb 20 00:03 .
drwxrwxrwx 1 root root 240 Feb 20 00:03 ..
drwxrwxrwx 1 root root  48 Feb 20 00:03 doc
drwxrwxrwx 1 root root  48 Feb 20 00:03 man

./share/doc:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 224 Feb 20 00:03 ..

./share/man:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 224 Feb 20 00:03 ..
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/usr]
└─$ cd ../   
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Proving Ground Practices/Maria/192.168.140.167/automysqlbackup]
└─$ cd var/  
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/var]
└─$ ls     
lib
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/var]
└─$ ls -alR
.:
total 0
drwxrwxrwx 1 root root 136 Feb 20 00:03 .
drwxrwxrwx 1 root root 312 Feb 20 00:03 ..
drwxrwxrwx 1 root root 160 Feb 20 00:03 lib

./lib:
total 0
drwxrwxrwx 1 root root 160 Feb 20 00:03 .
drwxrwxrwx 1 root root 136 Feb 20 00:03 ..
drwxrwxrwx 1 root root  48 Feb 20 00:03 automysqlbackup

./lib/automysqlbackup:
total 0
drwxrwxrwx 1 root root  48 Feb 20 00:03 .
drwxrwxrwx 1 root root 160 Feb 20 00:03 ..
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Maria/192.168.140.167/automysqlbackup/var]
└─$
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.140.167
Connected to 192.168.140.167.
220 (vsFTPd 3.0.3)
Name (192.168.140.167:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> cd /automysqlbackup/etc/default/
250 Directory successfully changed.
ftp> get automysqlbackup
local: automysqlbackup remote: automysqlbackup
200 PORT command successful. Consider using PASV.
550 Permission denied.
ftp> ls
200 PORT command successful. Consider using PASV.
^Z
zsh: suspended  ftp 192.168.140.167
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Mounted files

```bash
┌──(kali㉿kali)-[/tmp]
└─$ sudo curlftpfs 192.168.140.167 /mnt/ -o allow_other 
[sudo] password for kali: 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd /mnt                                                                                                                            
                                                                                                                                                                        
┌──(kali㉿kali)-[/mnt]
└─$ ls
automysqlbackup
                                                                                                                                                                        
┌──(kali㉿kali)-[/mnt]
└─$ ls -alR 
.:
total 44
drwxr-xr-x  1 root root  1024 Dec 31  1969 .
drwxr-xr-x 22 root root 36864 Jan  2 12:31 ..
drwxr-xr-x  5 root root  4096 Sep 21  2018 automysqlbackup

./automysqlbackup:
total 16
drwxr-xr-x 5 root root 4096 Sep 21  2018 .
drwxr-xr-x 1 root root 1024 Dec 31  1969 ..
drwxr-xr-x 5 root root 4096 Sep 21  2018 etc
drwxr-xr-x 4 root root 4096 Sep 21  2018 usr
drwxr-xr-x 3 root root 4096 Sep 21  2018 var

./automysqlbackup/etc:
total 20
drwxr-xr-x 5 root root 4096 Sep 21  2018 .
drwxr-xr-x 5 root root 4096 Sep 21  2018 ..
drwxr-xr-x 2 root root 4096 Sep 21  2018 automysqlbackup
drwxr-xr-x 2 root root 4096 Sep 21  2018 cron.daily
drwxr-xr-x 2 root root 4096 Sep 21  2018 default

./automysqlbackup/etc/automysqlbackup:
total 8
drwxr-xr-x 2 root root 4096 Sep 21  2018 .
drwxr-xr-x 5 root root 4096 Sep 21  2018 ..

./automysqlbackup/etc/cron.daily:
total 12
drwxr-xr-x 2 root root 4096 Sep 21  2018 .
drwxr-xr-x 5 root root 4096 Sep 21  2018 ..
-rwxr-xr-x 1 root root   80 Jul 23  2014 automysqlbackup

./automysqlbackup/etc/default:
total 12
drwxr-xr-x 2 root root 4096 Sep 21  2018 .
drwxr-xr-x 5 root root 4096 Sep 21  2018 ..
-rw-r--r-- 1 root root 3442 Sep 21  2018 automysqlbackup

./automysqlbackup/usr:
total 16
drwxr-xr-x 4 root root 4096 Sep 21  2018 .
drwxr-xr-x 5 root root 4096 Sep 21  2018 ..
drwxr-xr-x 2 root root 4096 Sep 21  2018 sbin
drwxr-xr-x 4 root root 4096 Sep 21  2018 share

./automysqlbackup/usr/sbin:
total 36
drwxr-xr-x 2 root root  4096 Sep 21  2018 .
drwxr-xr-x 4 root root  4096 Sep 21  2018 ..
-rwxr-xr-x 1 root root 26047 Sep 21  2018 automysqlbackup

./automysqlbackup/usr/share:
total 16
drwxr-xr-x 4 root root 4096 Sep 21  2018 .
drwxr-xr-x 4 root root 4096 Sep 21  2018 ..
drwxr-xr-x 3 root root 4096 Sep 21  2018 doc
drwxr-xr-x 3 root root 4096 Sep 21  2018 man

./automysqlbackup/usr/share/doc:
total 12
drwxr-xr-x 3 root root 4096 Sep 21  2018 .
drwxr-xr-x 4 root root 4096 Sep 21  2018 ..
drwxr-xr-x 2 root root 4096 Sep 21  2018 automysqlbackup

./automysqlbackup/usr/share/doc/automysqlbackup:
total 20
drwxr-xr-x 2 root root 4096 Sep 21  2018 .
drwxr-xr-x 3 root root 4096 Sep 21  2018 ..
-rw-r--r-- 1 root root 2014 Sep 21  2018 changelog.Debian.gz
-rw-r--r-- 1 root root 1270 Jul 23  2014 copyright
-rw-r--r-- 1 root root  501 Jul 23  2014 README.Debian

./automysqlbackup/usr/share/man:
total 12
drwxr-xr-x 3 root root 4096 Sep 21  2018 .
drwxr-xr-x 4 root root 4096 Sep 21  2018 ..
drwxr-xr-x 2 root root 4096 Sep 21  2018 man8

./automysqlbackup/usr/share/man/man8:
total 12
drwxr-xr-x 2 root root 4096 Sep 21  2018 .
drwxr-xr-x 3 root root 4096 Sep 21  2018 ..
-rw-r--r-- 1 root root 1290 Sep 21  2018 automysqlbackup.8.gz

./automysqlbackup/var:
total 12
drwxr-xr-x 3 root root 4096 Sep 21  2018 .
drwxr-xr-x 5 root root 4096 Sep 21  2018 ..
drwxr-xr-x 3 root root 4096 Sep 21  2018 lib

./automysqlbackup/var/lib:
total 12
drwxr-xr-x 3 root root 4096 Sep 21  2018 .
drwxr-xr-x 3 root root 4096 Sep 21  2018 ..
drwxr-xr-x 2 root root 4096 Sep 21  2018 automysqlbackup

./automysqlbackup/var/lib/automysqlbackup:
total 8
drwxr-xr-x 2 root root 4096 Sep 21  2018 .
drwxr-xr-x 3 root root 4096 Sep 21  2018 ..
                                                                                                                                                                        
┌──(kali㉿kali)-[/mnt]
└─$
```

cp /mnt/automysqlbackup/usr/share/man/man8/automysqlbackup.8.gz /tmp
cp /mnt/automysqlbackup/etc/cron.daily/automysqlbackup /tmp

cp /mnt/automysqlbackup/usr/share/doc/automysqlbackup /tmp

### automysqlbackup

https://github.com/sixhop/AutoMySQLBackup

https://askubuntu.com/questions/429592/what-is-the-purpose-of-etc-default

## 80 - Web

![](Pasted%20image%2020220220125505.png)

### Wordpress

```bash
┌──(kali㉿kali)-[~]
└─$ wpscan --url http://192.168.140.167:80/ --no-update -e vp,vt,tt,cb,dbe,u,m --plugins-detection aggressive --plugins-version-detection aggressive -f cli-no-color 2>&1 | tee "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Maria/results/192.168.140.167/scans/tcp_80_http_wpscan.txt"
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

[+] URL: http://192.168.140.167/ [192.168.140.167]
[+] Started: Sat Feb 19 23:47:55 2022

Interesting Finding(s):

[+] Headers
 | Interesting Entry: Server: Apache/2.4.38 (Debian)
 | Found By: Headers (Passive Detection)
 | Confidence: 100%

[+] XML-RPC seems to be enabled: http://192.168.140.167/xmlrpc.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%
 | References:
 |  - http://codex.wordpress.org/XML-RPC_Pingback_API
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_ghost_scanner
 |  - https://www.rapid7.com/db/modules/auxiliary/dos/http/wordpress_xmlrpc_dos
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_xmlrpc_login
 |  - https://www.rapid7.com/db/modules/auxiliary/scanner/http/wordpress_pingback_access

[+] WordPress readme found: http://192.168.140.167/readme.html
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] Upload directory has listing enabled: http://192.168.140.167/wp-content/uploads/
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 100%

[+] The external WP-Cron seems to be enabled: http://192.168.140.167/wp-cron.php
 | Found By: Direct Access (Aggressive Detection)
 | Confidence: 60%
 | References:
 |  - https://www.iplocation.net/defend-wordpress-from-ddos
 |  - https://github.com/wpscanteam/wpscan/issues/1299

[+] WordPress version 5.7.1 identified (Insecure, released on 2021-04-15).
 | Found By: Emoji Settings (Passive Detection)
 |  - http://192.168.140.167/, Match: 'wp-includes\/js\/wp-emoji-release.min.js?ver=5.7.1'
 | Confirmed By: Meta Generator (Passive Detection)
 |  - http://192.168.140.167/, Match: 'WordPress 5.7.1'

[i] The main theme could not be detected.

[+] Enumerating Vulnerable Plugins (via Aggressive Methods)

 Checking Known Locations -: |=========================================================================================================================================|
[+] Checking Plugin Versions (via Aggressive Methods)

[i] No plugins Found.

[+] Enumerating Vulnerable Themes (via Passive and Aggressive Methods)

 Checking Known Locations -: |=========================================================================================================================================|

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

 Brute Forcing Attachment IDs -: |=====================================================================================================================================|

[i] No Medias Found.

[+] Enumerating Users (via Passive and Aggressive Methods)

 Brute Forcing Author IDs -: |=========================================================================================================================================|

[i] User(s) Identified:

[+] admin
 | Found By: Author Id Brute Forcing - Author Pattern (Aggressive Detection)
 | Confirmed By: Login Error Messages (Aggressive Detection)

[!] No WPScan API Token given, as a result vulnerability data has not been output.
[!] You can get a free API token with 50 daily requests by registering at https://wpscan.com/register

[+] Finished: Sat Feb 19 23:52:04 2022
[+] Requests Done: 6537
[+] Cached Requests: 4
[+] Data Sent: 1.787 MB
[+] Data Received: 1.034 MB
[+] Memory used: 259.215 MB
[+] Elapsed time: 00:04:09
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

![](Pasted%20image%2020220220125701.png)

## 3306 - MySQL

```bash
┌──(kali㉿kali)-[~]
└─$ mysql -h 192.168.140.167
ERROR 1045 (28000): Access denied for user 'kali'@'192.168.49.140' (using password: NO)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ mysql -h 192.168.140.167 -uroot                                                                                                                                 1 ⨯
ERROR 1045 (28000): Access denied for user 'root'@'192.168.49.140' (using password: NO)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ mysql -h 192.168.140.167 -uroot -proot                                                                                                                          1 ⨯
ERROR 1045 (28000): Access denied for user 'root'@'192.168.49.140' (using password: YES)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

# Exploitation

# Privesc

# Other