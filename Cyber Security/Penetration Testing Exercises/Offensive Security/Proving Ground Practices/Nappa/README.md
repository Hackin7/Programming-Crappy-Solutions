# Nappa

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Mon Feb 14 10:22:48 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nappa/results/192.168.90.114/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nappa/results/192.168.90.114/scans/xml/_full_tcp_nmap.xml" 192.168.90.114
Increasing send delay for 192.168.90.114 from 0 to 5 due to 150 out of 374 dropped probes since last increase.
Warning: 192.168.90.114 giving up on port because retransmission cap hit (6).
adjust_timeouts2: packet supposedly had rtt of -323690 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -323690 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -325543 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -325543 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -327607 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -327607 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -330126 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -330126 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -418249 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -418249 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -442777 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -442777 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -430995 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -430995 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -539542 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -539542 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -749967 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -749967 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -445259 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -445259 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -2284048 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -2284048 microseconds.  Ignoring time.
Nmap scan report for 192.168.90.114
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 10:22:50 EST for 1556s
Not shown: 65486 closed ports
Reason: 65486 resets
PORT      STATE    SERVICE     REASON         VERSION
21/tcp    open     ftp         syn-ack ttl 63 vsftpd 3.0.3
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_drwxr-xr-x   14 14       11           4096 Nov 06  2020 forum
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to 192.168.49.90
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 4
|      vsFTPd 3.0.3 - secure, fast, stable
|_End of status
615/tcp   filtered sco-inetmgr no-response
3306/tcp  open     mysql?      syn-ack ttl 63
| mysql-info: 
|_  MySQL Error: Host '192.168.49.90' is not allowed to connect to this MariaDB server
|_ssl-cert: ERROR: Script execution failed (use -d to debug)
|_ssl-date: ERROR: Script execution failed (use -d to debug)
|_sslv2: ERROR: Script execution failed (use -d to debug)
|_tls-alpn: ERROR: Script execution failed (use -d to debug)
|_tls-nextprotoneg: ERROR: Script execution failed (use -d to debug)
3555/tcp  filtered razor       no-response
5984/tcp  filtered couchdb     no-response
7612/tcp  filtered unknown     no-response
7943/tcp  filtered unknown     no-response
8080/tcp  open     http-proxy  syn-ack ttl 63
| fingerprint-strings: 
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
|_http-favicon: Unknown favicon MD5: D41D8CD98F00B204E9800998ECF8427E
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: ForumOnRails
15199/tcp filtered unknown     no-response
16650/tcp filtered unknown     no-response
16779/tcp filtered unknown     no-response
18591/tcp filtered unknown     no-response
18734/tcp filtered unknown     no-response
19382/tcp filtered unknown     no-response
19986/tcp filtered unknown     no-response
20210/tcp filtered unknown     no-response
20986/tcp filtered unknown     no-response
22523/tcp filtered unknown     no-response
25220/tcp filtered unknown     no-response
25669/tcp filtered unknown     no-response
27979/tcp filtered unknown     no-response
28030/tcp filtered unknown     no-response
28080/tcp open     http        syn-ack ttl 63 Apache httpd 2.4.46 ((Unix))
| http-methods: 
|   Supported Methods: GET POST OPTIONS HEAD TRACE
|_  Potentially risky methods: TRACE
|_http-title: html5-goku-en-javascript
30747/tcp filtered unknown     no-response
32561/tcp filtered unknown     no-response
33422/tcp filtered unknown     no-response
34645/tcp filtered unknown     no-response
37150/tcp filtered unknown     no-response
39322/tcp filtered unknown     no-response
40273/tcp filtered unknown     no-response
41923/tcp filtered unknown     no-response
42679/tcp filtered unknown     no-response
43114/tcp filtered unknown     no-response
43128/tcp filtered unknown     no-response
43819/tcp filtered unknown     no-response
44669/tcp filtered unknown     no-response
46160/tcp filtered unknown     no-response
46164/tcp filtered unknown     no-response
47002/tcp filtered unknown     no-response
48120/tcp open     tcpwrapped  syn-ack ttl 63
51489/tcp filtered unknown     no-response
51594/tcp filtered unknown     no-response
53853/tcp filtered unknown     no-response
54428/tcp filtered unknown     no-response
54554/tcp filtered unknown     no-response
57583/tcp filtered unknown     no-response
58889/tcp filtered unknown     no-response
59402/tcp filtered unknown     no-response
60022/tcp open     ssh         syn-ack ttl 63 OpenSSH 8.4 (protocol 2.0)
| ssh-hostkey: 
|   3072 76:61:5c:e1:8c:ca:14:e8:7a:63:ba:a3:46:9f:09:b3 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC6cIo6CEhEYExa2FRUK028g1BaUmyVNItWi7WjSEJC8gv8c18Y7WVSvau3OKXRERDqEJt+jwsbWjp7MIH9eIfVqfHtgwlQqla8nXy61SUviJThRsrfahizFnrTEpx0UncZ7EnSEfDbQnKCIly+0d4ObReUOv98lvvAI9a1oEsR5Y9Gkz3Bg5oF7HXW+FG06jRWh0Fg2QaerXhmXVEV7XODeS7GTqnOq7BU9utJnD1TUBxIaVtSi7v+U28A8+U2cXWZy6muwQvqQw4jgtW6fAJiui6Ogweop+oUP75f2EGydNu0t4NKO8ujre89eNoclmESUykQP4kjaMoty3Nn8GJ4GYdXiTLpzmGoxB2OS6JzvvwZyw1/M0k8Q1H0q4Gh5H1eTY1g4n7UpypbOtn99kRBvzBrh/u3mi7cf8nXnzV6OTqE9Ie6K4KWyCNFVNJqwRhzrXVbQ5vwO8KybEW7JBk0ZECCH/2zra8lYx7mtHs+E4f5pW2jQqu9mYUfK3eAyC8=
|   256 e3:ed:fc:a8:10:d7:8e:b1:7c:de:a2:59:df:19:06:29 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBGcKY1+Mje4h/PPSW0ZMQUL8eAV0DZ2OT1Zu1MoqVUlSds3CS8+OB8Vxa55NDxIXC6hMHrjNwjwtGknNjS+2nbg=
|   256 e5:dd:dd:a7:e3:ac:5f:b9:2b:4b:d0:27:e3:3c:c2:43 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIITa8EuQPgZPpsKcj51YwcXmY9OflD/T3AmWKA0SQkEd
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port8080-TCP:V=7.91%I=9%D=2/14%Time=620A7788%P=x86_64-pc-linux-gnu%r(Ge
SF:tRequest,C76,"HTTP/1\.0\x20403\x20Forbidden\r\nContent-Type:\x20text/ht
SF:ml;\x20charset=UTF-8\r\nContent-Length:\x203102\r\n\r\n<!DOCTYPE\x20htm
SF:l>\n<html\x20lang=\"en\">\n<head>\n\x20\x20<meta\x20charset=\"utf-8\"\x
SF:20/>\n\x20\x20<title>Action\x20Controller:\x20Exception\x20caught</titl
SF:e>\n\x20\x20<style>\n\x20\x20\x20\x20body\x20{\n\x20\x20\x20\x20\x20\x2
SF:0background-color:\x20#FAFAFA;\n\x20\x20\x20\x20\x20\x20color:\x20#333;
SF:\n\x20\x20\x20\x20\x20\x20margin:\x200px;\n\x20\x20\x20\x20}\n\n\x20\x2
SF:0\x20\x20body,\x20p,\x20ol,\x20ul,\x20td\x20{\n\x20\x20\x20\x20\x20\x20
SF:font-family:\x20helvetica,\x20verdana,\x20arial,\x20sans-serif;\n\x20\x
SF:20\x20\x20\x20\x20font-size:\x20\x20\x2013px;\n\x20\x20\x20\x20\x20\x20
SF:line-height:\x2018px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20pre\x20{\n\
SF:x20\x20\x20\x20\x20\x20font-size:\x2011px;\n\x20\x20\x20\x20\x20\x20whi
SF:te-space:\x20pre-wrap;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20pre\.box\x
SF:20{\n\x20\x20\x20\x20\x20\x20border:\x201px\x20solid\x20#EEE;\n\x20\x20
SF:\x20\x20\x20\x20padding:\x2010px;\n\x20\x20\x20\x20\x20\x20margin:\x200
SF:px;\n\x20\x20\x20\x20\x20\x20width:\x20958px;\n\x20\x20\x20\x20}\n\n\x2
SF:0\x20\x20\x20header\x20{\n\x20\x20\x20\x20\x20\x20color:\x20#F0F0F0;\n\
SF:x20\x20\x20\x20\x20\x20background:\x20#C52F24;\n\x20\x20\x20\x20\x20\x2
SF:0padding:\x200\.5em\x201\.5em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h1
SF:\x20{\n\x20\x20\x20\x20\x20\x20margin:\x200\.2em\x200;\n\x20\x20\x20\x2
SF:0\x20\x20line-height:\x201\.1em;\n\x20\x20\x20\x20\x20\x20font-size:\x2
SF:02em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h2\x20{\n\x20\x20\x20\x20\x
SF:20\x20color:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20line-height:\x2025px;
SF:\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20\.details\x20{\n\x20\x20\x20\x20
SF:\x20\x20bord")%r(HTTPOptions,C76,"HTTP/1\.0\x20403\x20Forbidden\r\nCont
SF:ent-Type:\x20text/html;\x20charset=UTF-8\r\nContent-Length:\x203102\r\n
SF:\r\n<!DOCTYPE\x20html>\n<html\x20lang=\"en\">\n<head>\n\x20\x20<meta\x2
SF:0charset=\"utf-8\"\x20/>\n\x20\x20<title>Action\x20Controller:\x20Excep
SF:tion\x20caught</title>\n\x20\x20<style>\n\x20\x20\x20\x20body\x20{\n\x2
SF:0\x20\x20\x20\x20\x20background-color:\x20#FAFAFA;\n\x20\x20\x20\x20\x2
SF:0\x20color:\x20#333;\n\x20\x20\x20\x20\x20\x20margin:\x200px;\n\x20\x20
SF:\x20\x20}\n\n\x20\x20\x20\x20body,\x20p,\x20ol,\x20ul,\x20td\x20{\n\x20
SF:\x20\x20\x20\x20\x20font-family:\x20helvetica,\x20verdana,\x20arial,\x2
SF:0sans-serif;\n\x20\x20\x20\x20\x20\x20font-size:\x20\x20\x2013px;\n\x20
SF:\x20\x20\x20\x20\x20line-height:\x2018px;\n\x20\x20\x20\x20}\n\n\x20\x2
SF:0\x20\x20pre\x20{\n\x20\x20\x20\x20\x20\x20font-size:\x2011px;\n\x20\x2
SF:0\x20\x20\x20\x20white-space:\x20pre-wrap;\n\x20\x20\x20\x20}\n\n\x20\x
SF:20\x20\x20pre\.box\x20{\n\x20\x20\x20\x20\x20\x20border:\x201px\x20soli
SF:d\x20#EEE;\n\x20\x20\x20\x20\x20\x20padding:\x2010px;\n\x20\x20\x20\x20
SF:\x20\x20margin:\x200px;\n\x20\x20\x20\x20\x20\x20width:\x20958px;\n\x20
SF:\x20\x20\x20}\n\n\x20\x20\x20\x20header\x20{\n\x20\x20\x20\x20\x20\x20c
SF:olor:\x20#F0F0F0;\n\x20\x20\x20\x20\x20\x20background:\x20#C52F24;\n\x2
SF:0\x20\x20\x20\x20\x20padding:\x200\.5em\x201\.5em;\n\x20\x20\x20\x20}\n
SF:\n\x20\x20\x20\x20h1\x20{\n\x20\x20\x20\x20\x20\x20margin:\x200\.2em\x2
SF:00;\n\x20\x20\x20\x20\x20\x20line-height:\x201\.1em;\n\x20\x20\x20\x20\
SF:x20\x20font-size:\x202em;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20h2\x20{
SF:\n\x20\x20\x20\x20\x20\x20color:\x20#C52F24;\n\x20\x20\x20\x20\x20\x20l
SF:ine-height:\x2025px;\n\x20\x20\x20\x20}\n\n\x20\x20\x20\x20\.details\x2
SF:0{\n\x20\x20\x20\x20\x20\x20bord");
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.39 (91%), Linux 3.10 - 3.12 (91%), Linux 3.4 (91%), Linux 3.5 (91%), Linux 4.4 (91%), Synology DiskStation Manager 5.1 (91%), WatchGuard Fireware 11.8 (91%), Linux 2.6.35 (90%), Linux 3.10 (90%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=2/14%OT=21%CT=1%CU=41995%PV=Y%DS=2%DC=T%G=Y%TM=620A79D
OS:E%P=x86_64-pc-linux-gnu)SEQ(SP=105%GCD=1%ISR=10C%TI=Z%TS=A)OPS(O1=M54EST
OS:11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M5
OS:4EST11)WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%
OS:T=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)
OS:T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=
OS:N)T7(R=N)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G
OS:)IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 6.075 days (since Tue Feb  8 09:00:15 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=261 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Unix

TRACEROUTE (using port 256/tcp)
HOP RTT       ADDRESS
1   177.79 ms 192.168.49.1
2   177.76 ms 192.168.90.114

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 10:48:46 2022 -- 1 IP address (1 host up) scanned in 1559.26 seconds
```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.90.114
Connected to 192.168.90.114.
220 (vsFTPd 3.0.3)
Name (192.168.90.114:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 PORT command successful. Consider using PASV.
150 Here comes the directory listing.
drwxr-xr-x   14 14       11           4096 Nov 06  2020 forum
226 Directory send OK.
ftp> cd forum
250 Directory successfully changed.
ftp> ls
200 PORT command successful. Consider using PASV.
150 Here comes the directory listing.
-rw-r--r--    1 0        0            1965 Nov 06  2020 Gemfile
-rw-r--r--    1 0        0            5512 Nov 06  2020 Gemfile.lock
-rw-r--r--    1 0        0             374 Nov 06  2020 README.md
-rw-r--r--    1 0        0             227 Nov 06  2020 Rakefile
drwxr-xr-x   11 0        0            4096 Nov 06  2020 app
drwxr-xr-x    2 0        0            4096 Nov 06  2020 bin
drwxr-xr-x    5 0        0            4096 Nov 06  2020 config
-rw-r--r--    1 0        0             130 Nov 06  2020 config.ru
drwxr-xr-x    2 0        0            4096 Nov 06  2020 db
drwxr-xr-x    4 0        0            4096 Nov 06  2020 lib
drwxr-xr-x    2 0        0            4096 Nov 06  2020 log
-rw-r--r--    1 0        0             217 Nov 06  2020 package.json
drwxr-xr-x    2 0        0            4096 Nov 06  2020 public
drwxr-xr-x    2 0        0            4096 Nov 06  2020 storage
drwxr-xr-x   10 0        0            4096 Nov 06  2020 test
drwxr-xr-x    5 0        0            4096 Nov 06  2020 tmp
drwxr-xr-x    2 0        0            4096 Nov 06  2020 vendor
226 Directory send OK.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.90.114
Connected to 192.168.90.114.
220 (vsFTPd 3.0.3)
Name (192.168.90.114:kali): admin
530 This FTP server is anonymous only.
Login failed.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Download Files

```
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Nappa/ftpfiles]
└─$ wget -r ftp://192.168.90.114 --user=anonymous     
--2022-02-14 10:29:13--  ftp://192.168.90.114/
           => ‘192.168.90.114/.listing’
Connecting to 192.168.90.114:21... connected.
Logging in as anonymous ... Logged in!
==> SYST ... done.    ==> PWD ... done.
==> TYPE I ... done.  ==> CWD not needed.
==> PASV ... done.    ==> LIST ... done.

192.168.90.114/.listing                       [ <=>                                                                                  ]     182  --.-KB/s    in 0s      

2022-02-14 10:29:15 (5.73 MB/s) - ‘192.168.90.114/.listing’ saved [182]

Removed ‘192.168.90.114/.listing’.
--2022-02-14 10:29:15--  ftp://192.168.90.114/forum/
           => ‘192.168.90.114/forum/.listing’
==> CWD (1) /forum ... done.
==> PASV ... done.    ==> LIST ... done.

192.168.90.114/forum/.listing                 [ <=>                                                                                  ]   1.38K  --.-KB/s    in 0s      
...
```


## 3306 - MySQL

```
┌──(kali㉿kali)-[/media/…/ftpfiles/192.168.90.114/forum/config]
└─$ mysql -h 192.168.90.114 -u root 
ERROR 1130 (HY000): Host '192.168.49.90' is not allowed to connect to this MariaDB server
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/ftpfiles/192.168.90.114/forum/config]
└─$   
```

## 8080 - Web

![](Pasted%20image%2020220214233004.png)

## 28080 - Web

![](Pasted%20image%2020220215000236.png)


## 60022 - SSH

# Exploitation