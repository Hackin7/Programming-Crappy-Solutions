# Tico

# Enumeration
## nmap

```
# Nmap 7.91 scan initiated Mon Jan 31 09:20:24 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Tico/results/192.168.177.143/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Tico/results/192.168.177.143/scans/xml/_full_tcp_nmap.xml" 192.168.177.143
adjust_timeouts2: packet supposedly had rtt of -178764 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -178764 microseconds.  Ignoring time.
Nmap scan report for 192.168.177.143
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-31 09:20:27 EST for 808s
Not shown: 65428 filtered ports, 101 closed ports
Reason: 65428 no-responses and 101 resets
PORT      STATE SERVICE    REASON         VERSION
21/tcp    open  ftp        syn-ack ttl 63 vsftpd 3.0.3
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_drwxr-xr-x    2 ftp      ftp          4096 Feb 01  2021 pub
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to 192.168.49.177
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 2
|      vsFTPd 3.0.3 - secure, fast, stable
|_End of status
22/tcp    open  ssh        syn-ack ttl 63 OpenSSH 7.6p1 Ubuntu 4 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 85:35:fb:ca:b3:4b:30:d8:e5:8e:b3:25:58:6c:6e:70 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDtXHpFK7WIinYk72khOxHjkwHc2VfAlkPEEUYJH+qcg7XRETxE67aA00jkJfZqzutmsPSJaPfzoJi2WNc7wHv3V+Fq2fNR5BVjll0Gnd/l0J6tlSZ5iL80mfZHK0MbSHBG0rY/AtjKkrkSN697K/Ygpivr5uufhLHZpLVXKcnP1GMsO72BPiDzRQ2ncVsV0ZejQ/m1K2DRVTy+xsdx+pft76qnBZprh5RWuJtIsL6fA23fr4pSAiQ4ElS/vHH02DGZ6PRjJYQNREH9kbMgF6VLI1eHpQubz5vx/7o2EwvFmM9LaQ4Gqryfjye/Z8yS6L7DdJCSKAJt3aucOWjem8GJ
|   256 de:67:a2:32:d5:ff:56:6e:82:5b:6a:17:7d:e2:44:ac (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBGE6s/w6Ru4bHrYQLL1yGbhZa/TjQZY2q0bixGR+GF+zIijxexuZ4umQSvnQO018K8WVj73uKTcMwqKHghvSwqE=
|   256 3a:a3:20:3b:32:cd:83:6f:dc:23:a2:66:f9:0f:c6:d3 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIJ1s5UWvBLLeULmcvB/WiXX+COPZdgnMdJPaAOH/6V+J
80/tcp    open  http       syn-ack ttl 63 nginx 1.14.0 (Ubuntu)
|_http-favicon: Unknown favicon MD5: 7706F0D305F7F82674AA0A16B0D7CDC9
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.14.0 (Ubuntu)
|_http-title: Markdown Editor
8080/tcp  open  http-proxy syn-ack ttl 63
| fingerprint-strings: 
|   FourOhFourRequest: 
|     HTTP/1.1 404 Not Found
|     X-DNS-Prefetch-Control: off
|     X-Frame-Options: SAMEORIGIN
|     X-Download-Options: noopen
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Referrer-Policy: strict-origin-when-cross-origin
|     X-Powered-By: NodeBB
|     set-cookie: _csrf=MmrQgzIPPKGoOEYg5dw9cSPn; Path=/
|     Content-Type: text/html; charset=utf-8
|     Content-Length: 15431
|     ETag: W/"3c47-fkG3wN9buMUY0umrivSW5vO1UmI"
|     Vary: Accept-Encoding
|     Date: Mon, 31 Jan 2022 14:29:04 GMT
|     Connection: close
|     <!DOCTYPE html>
|     <html lang="en-GB" data-dir="ltr" style="direction: ltr;" >
|     <head>
|     <title>Not Found | NodeBB</title>
|     <meta name="viewport" content="width&#x3D;device-width, initial-scale&#x3D;1.0" />
|     <meta name="content-type" content="text/html; charset=UTF-8" />
|     <meta name="apple-mobile-web-app-capable" content="yes" />
|     <meta name="mobile-web-app-capable" content="yes" />
|     <meta property="og:site_name"
|   GetRequest: 
|     HTTP/1.1 200 OK
|     X-DNS-Prefetch-Control: off
|     X-Frame-Options: SAMEORIGIN
|     X-Download-Options: noopen
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Referrer-Policy: strict-origin-when-cross-origin
|     X-Powered-By: NodeBB
|     set-cookie: _csrf=kQE8OlSGBt2XdHRzQ86Jxlls; Path=/
|     Content-Type: text/html; charset=utf-8
|     Content-Length: 24233
|     ETag: W/"5ea9-Kro6taa3l26+hZXLCysr0qIQjQM"
|     Vary: Accept-Encoding
|     Date: Mon, 31 Jan 2022 14:29:02 GMT
|     Connection: close
|     <!DOCTYPE html>
|     <html lang="en-GB" data-dir="ltr" style="direction: ltr;" >
|     <head>
|     <title>Home | NodeBB</title>
|     <meta name="viewport" content="width&#x3D;device-width, initial-scale&#x3D;1.0" />
|     <meta name="content-type" content="text/html; charset=UTF-8" />
|     <meta name="apple-mobile-web-app-capable" content="yes" />
|     <meta name="mobile-web-app-capable" content="yes" />
|     <meta property="og:site_name" content="No
|   HTTPOptions: 
|     HTTP/1.1 200 OK
|     X-DNS-Prefetch-Control: off
|     X-Frame-Options: SAMEORIGIN
|     X-Download-Options: noopen
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Referrer-Policy: strict-origin-when-cross-origin
|     X-Powered-By: NodeBB
|     Allow: GET,HEAD
|     Content-Type: text/html; charset=utf-8
|     Content-Length: 8
|     ETag: W/"8-ZRAf8oNBS3Bjb/SU2GYZCmbtmXg"
|     Vary: Accept-Encoding
|     Date: Mon, 31 Jan 2022 14:29:03 GMT
|     Connection: close
|     GET,HEAD
|   RTSPRequest: 
|     HTTP/1.1 400 Bad Request
|_    Connection: close
|_http-favicon: Unknown favicon MD5: 152FF7D5AE5BDB84B33D4DCA31EB7CD3
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
| http-robots.txt: 3 disallowed entries 
|_/admin/ /reset/ /compose
|_http-title: Home | NodeBB
11211/tcp open  memcached  syn-ack ttl 63 Memcached 1.5.6 (uptime 1381 seconds; Ubuntu)
27017/tcp open  mongodb    syn-ack ttl 63 MongoDB
| fingerprint-strings: 
|   FourOhFourRequest, GetRequest, OfficeScan, apple-iphoto, docker, hazelcast-http, metasploit-msgrpc: 
|     HTTP/1.0 200 OK
|     Connection: close
|     Content-Type: text/plain
|     Content-Length: 85
|     looks like you are trying to access MongoDB over HTTP on the native driver port.
|   mongodb: 
|     errmsg
|     command serverStatus requires authentication
|     code
|     codeName
|_    Unauthorized
| mongodb-databases: 
|   ok = 0.0
|   codeName = Unauthorized
|   code = 13
|_  errmsg = command listDatabases requires authentication
| mongodb-info: 
|   MongoDB Build info
|     openssl
|       running = OpenSSL 1.1.1  11 Sep 2018
|       compiled = OpenSSL 1.1.1  11 Sep 2018
|     javascriptEngine = mozjs
|     modules
|     sysInfo = deprecated
|     ok = 1.0
|     maxBsonObjectSize = 16777216
|     storageEngines
|       2 = mmapv1
|       1 = ephemeralForTest
|       0 = devnull
|       3 = wiredTiger
|     debug = false
|     buildEnvironment
|       cxx = /opt/mongodbtoolchain/v2/bin/g++: g++ (GCC) 5.4.0
|       target_arch = x86_64
|       cc = /opt/mongodbtoolchain/v2/bin/gcc: gcc (GCC) 5.4.0
|       linkflags = -pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro
|       target_os = linux
|       distarch = x86_64
|       ccflags = -fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp
|       distmod = ubuntu1804
|       cxxflags = -Woverloaded-virtual -Wno-maybe-uninitialized -std=c++14
|     version = 4.0.22
|     versionArray
|       2 = 22
|       1 = 0
|       0 = 4
|       3 = 0
|     allocator = tcmalloc
|     bits = 64
|     gitVersion = 1741806fb46c161a1d42870f6e98f5100d196315
|   Server status
|     ok = 0.0
|     codeName = Unauthorized
|     code = 13
|_    errmsg = command serverStatus requires authentication
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port8080-TCP:V=7.91%I=9%D=1/31%Time=61F7F22F%P=x86_64-pc-linux-gnu%r(Ge
SF:tRequest,31C4,"HTTP/1\.1\x20200\x20OK\r\nX-DNS-Prefetch-Control:\x20off
SF:\r\nX-Frame-Options:\x20SAMEORIGIN\r\nX-Download-Options:\x20noopen\r\n
SF:X-Content-Type-Options:\x20nosniff\r\nX-XSS-Protection:\x201;\x20mode=b
SF:lock\r\nReferrer-Policy:\x20strict-origin-when-cross-origin\r\nX-Powere
SF:d-By:\x20NodeBB\r\nset-cookie:\x20_csrf=kQE8OlSGBt2XdHRzQ86Jxlls;\x20Pa
SF:th=/\r\nContent-Type:\x20text/html;\x20charset=utf-8\r\nContent-Length:
SF:\x2024233\r\nETag:\x20W/\"5ea9-Kro6taa3l26\+hZXLCysr0qIQjQM\"\r\nVary:\
SF:x20Accept-Encoding\r\nDate:\x20Mon,\x2031\x20Jan\x202022\x2014:29:02\x2
SF:0GMT\r\nConnection:\x20close\r\n\r\n<!DOCTYPE\x20html>\n<html\x20lang=\
SF:"en-GB\"\x20data-dir=\"ltr\"\x20style=\"direction:\x20ltr;\"\x20\x20>\n
SF:<head>\n\t<title>Home\x20\|\x20NodeBB</title>\n\t<meta\x20name=\"viewpo
SF:rt\"\x20content=\"width&#x3D;device-width,\x20initial-scale&#x3D;1\.0\"
SF:\x20/>\n\t<meta\x20name=\"content-type\"\x20content=\"text/html;\x20cha
SF:rset=UTF-8\"\x20/>\n\t<meta\x20name=\"apple-mobile-web-app-capable\"\x2
SF:0content=\"yes\"\x20/>\n\t<meta\x20name=\"mobile-web-app-capable\"\x20c
SF:ontent=\"yes\"\x20/>\n\t<meta\x20property=\"og:site_name\"\x20content=\
SF:"No")%r(HTTPOptions,1BF,"HTTP/1\.1\x20200\x20OK\r\nX-DNS-Prefetch-Contr
SF:ol:\x20off\r\nX-Frame-Options:\x20SAMEORIGIN\r\nX-Download-Options:\x20
SF:noopen\r\nX-Content-Type-Options:\x20nosniff\r\nX-XSS-Protection:\x201;
SF:\x20mode=block\r\nReferrer-Policy:\x20strict-origin-when-cross-origin\r
SF:\nX-Powered-By:\x20NodeBB\r\nAllow:\x20GET,HEAD\r\nContent-Type:\x20tex
SF:t/html;\x20charset=utf-8\r\nContent-Length:\x208\r\nETag:\x20W/\"8-ZRAf
SF:8oNBS3Bjb/SU2GYZCmbtmXg\"\r\nVary:\x20Accept-Encoding\r\nDate:\x20Mon,\
SF:x2031\x20Jan\x202022\x2014:29:03\x20GMT\r\nConnection:\x20close\r\n\r\n
SF:GET,HEAD")%r(RTSPRequest,2F,"HTTP/1\.1\x20400\x20Bad\x20Request\r\nConn
SF:ection:\x20close\r\n\r\n")%r(FourOhFourRequest,31C4,"HTTP/1\.1\x20404\x
SF:20Not\x20Found\r\nX-DNS-Prefetch-Control:\x20off\r\nX-Frame-Options:\x2
SF:0SAMEORIGIN\r\nX-Download-Options:\x20noopen\r\nX-Content-Type-Options:
SF:\x20nosniff\r\nX-XSS-Protection:\x201;\x20mode=block\r\nReferrer-Policy
SF::\x20strict-origin-when-cross-origin\r\nX-Powered-By:\x20NodeBB\r\nset-
SF:cookie:\x20_csrf=MmrQgzIPPKGoOEYg5dw9cSPn;\x20Path=/\r\nContent-Type:\x
SF:20text/html;\x20charset=utf-8\r\nContent-Length:\x2015431\r\nETag:\x20W
SF:/\"3c47-fkG3wN9buMUY0umrivSW5vO1UmI\"\r\nVary:\x20Accept-Encoding\r\nDa
SF:te:\x20Mon,\x2031\x20Jan\x202022\x2014:29:04\x20GMT\r\nConnection:\x20c
SF:lose\r\n\r\n<!DOCTYPE\x20html>\n<html\x20lang=\"en-GB\"\x20data-dir=\"l
SF:tr\"\x20style=\"direction:\x20ltr;\"\x20\x20>\n<head>\n\t<title>Not\x20
SF:Found\x20\|\x20NodeBB</title>\n\t<meta\x20name=\"viewport\"\x20content=
SF:\"width&#x3D;device-width,\x20initial-scale&#x3D;1\.0\"\x20/>\n\t<meta\
SF:x20name=\"content-type\"\x20content=\"text/html;\x20charset=UTF-8\"\x20
SF:/>\n\t<meta\x20name=\"apple-mobile-web-app-capable\"\x20content=\"yes\"
SF:\x20/>\n\t<meta\x20name=\"mobile-web-app-capable\"\x20content=\"yes\"\x
SF:20/>\n\t<meta\x20property=\"og:site_name\"");
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.10 - 3.12 (93%), Linux 4.4 (93%), Linux 4.9 (91%), Linux 3.10 - 3.16 (88%), Linux 4.0 (88%), Linux 3.11 - 4.1 (88%), Linux 2.6.32 (88%), Linux 2.6.39 (88%), Linux 3.4 (88%), Linux 3.5 (88%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/31%OT=21%CT=40000%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F7F353%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=10C%TI=Z%II=I%TS=A)
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

Uptime guess: 12.882 days (since Tue Jan 18 12:24:28 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 40061/tcp)
HOP RTT       ADDRESS
1   250.73 ms 192.168.49.1
2   250.88 ms 192.168.177.143

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 31 09:33:55 2022 -- 1 IP address (1 host up) scanned in 812.19 seconds
```


## 21 - FTP
```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.177.143
Connected to 192.168.177.143.
220 (vsFTPd 3.0.3)
Name (192.168.177.143:kali): admin
530 This FTP server is anonymous only.
Login failed.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220131224057.png)
![](Pasted%20image%2020220131224118.png)

### Analysing debug.pcap

![](Pasted%20image%2020220131224348.png)

![](Pasted%20image%2020220131224458.png)

![](Pasted%20image%2020220131224520.png)

```
  

....................admin.$cmd..............isMaster......saslSupportedMechs.....admin.admin..client......application......name.....MongoDB Shell...driver.;....name.....MongoDB Internal Client..version.....4.0.22...os.R....type.....Linux..name.....Ubuntu..architecture.....x86_64..version.....18.04....0...o....................................ismaster...maxBsonObjectSize......maxMessageSizeBytes..l...maxWriteBatchSize..... localTime....#w....logicalSessionTimeoutMinutes......minWireVersion......maxWireVersion......readOnly...saslSupportedMechs.-....0.....SCRAM-SHA-1..1.....SCRAM-SHA-256...ok........?......................{....saslStart......mechanism.....SCRAM-SHA-256..payload.-....n,,n=admin,r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeK.$db.....admin......p.....................conversationId......done...payload.u....r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeKoGtDP4x0LH5WZgQ9xFMJEJknBHTp6N1D,s=zOa0kWA/OTak0a0vNaN0Zh2drO1uekoDUh4sdg==,i=15000.ok........?...........................saslContinue......payload.x....c=biws,r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeKoGtDP4x0LH5WZgQ9xFMJEJknBHTp6N1D,p=/nW1YVs0JcvxU48jLHanbkQbZ4GFJ8+Na8fj7xM1s98=.conversationId......$db.....admin..}...q................h....conversationId......done...payload......v=vhcU/F2qejXXkfHa5nCX8APoKCTgYTozS0rvhLuTq9Q=.ok........?.]....................H....saslContinue......payload.......conversationId......$db.....admin..O...r................:....conversationId......done...payload.......ok........?.9....................$....whatsmyuri......$db.....admin..?...s................*....you.....127.0.0.1:51072..ok........?.<....................'....buildinfo........?.$db.....admin......t.....................version.....4.0.22..gitVersion.)...1741806fb46c161a1d42870f6e98f5100d196315..modules.......allocator. ...tcmalloc..javascriptEngine.....mozjs..sysInfo.....deprecated..versionArray.!....0......1......2......3.......openssl.V....running.....OpenSSL 1.1.1 11 Sep 2018..compiled.....OpenSSL 1.1.1 11 Sep 2018...buildEnvironment......distmod.....ubuntu1804..distarch.....x86_64..cc.2.../opt/mongodbtoolchain/v2/bin/gcc: gcc (GCC) 5.4.0..ccflags.+...-fno-omit-frame-pointer -fno-strict-aliasing -ggdb -pthread -Wall -Wsign-compare -Wno-unknown-pragmas -Winvalid-pch -Werror -O2 -Wno-unused-local-typedefs -Wno-unused-function -Wno-deprecated-declarations -Wno-unused-but-set-variable -Wno-missing-braces -fstack-protector-strong -fno-builtin-memcmp..cxx.2.../opt/mongodbtoolchain/v2/bin/g++: g++ (GCC) 5.4.0..cxxflags.9...-Woverloaded-virtual -Wno-maybe-uninitialized -std=c++14..linkflags.....-pthread -Wl,-z,now -rdynamic -Wl,--fatal-warnings -fstack-protector-strong -fuse-ld=gold -Wl,--build-id -Wl,--hash-style=gnu -Wl,-z,noexecstack -Wl,--warn-execstack -Wl,-z,relro..target_arch.....x86_64..target_os.....linux...bits.@....debug...maxBsonObjectSize......storageEngines.L....0.....devnull..1.....ephemeralForTest..2.....mmapv1..3.....wiredTiger...ok........?.
```

`r=+CDTb3v9SwhwxAXb4+vZ32l0VsTvrLeK.$db`


## 80 - Web

![](Pasted%20image%2020220205141401.png)


![](Pasted%20image%2020220205142108.png)

https://github.com/jbt/markdown-editor

## 8080 - Web NodeBB


## 11211 - Memcached
## 27017 - MongoDB

```
┌──(kali㉿kali)-[/tmp]
└─$ mongo 192.168.177.143:27017
MongoDB shell version v5.0.5
connecting to: mongodb://192.168.177.143:27017/test?compressors=disabled&gssapiServiceName=mongodb
Implicit session: session { "id" : UUID("ce0d2aa0-16c3-42af-bb11-a838f09cb29e") }
MongoDB server version: 4.0.22
WARNING: shell and server versions do not match
================
Warning: the "mongo" shell has been superseded by "mongosh",
which delivers improved usability and compatibility.The "mongo" shell has been deprecated and will be removed in
an upcoming release.
For installation instructions, see
https://docs.mongodb.com/mongodb-shell/install/
================
> show dbs
> show collections
Warning: unable to run listCollections, attempting to approximate collection names by parsing connectionStatus
> show dbs
> exit
bye
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ mongosh 192.168.121.143:27017                                                                                                                                 130 ⨯
Current Mongosh Log ID: 61fe0ee58a76e81d76320088
Connecting to:          mongodb://192.168.121.143:27017/test?directConnection=true
Using MongoDB:          4.0.22
Using Mongosh:          1.1.6

For mongosh info see: https://docs.mongodb.com/mongodb-shell/


To help improve our products, anonymous usage data is collected and sent to MongoDB periodically (https://www.mongodb.com/legal/privacy-policy).
You can opt-out by running the disableTelemetry() command.

Warning: Found ~/.mongorc.js, but not ~/.mongoshrc.js. ~/.mongorc.js will not be loaded.
  You may want to copy or rename ~/.mongorc.js to ~/.mongoshrc.js.                                                                                                      
test> show dbs
MongoServerError: command listDatabases requires authentication
test> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

# Exploit


# Others