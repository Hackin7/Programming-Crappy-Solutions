```bash
nmap -vv --reason -Pn -T4 -sV -p 3306 --script="banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.234.55
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/tcp_3306_mysql_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/tcp_3306_mysql_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Jan 24 09:38:26 2022 as: nmap -vv --reason -Pn -T4 -sV -p 3306 "--script=banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.234.55
Nmap scan report for 192.168.234.55
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-24 09:38:28 EST for 39s

PORT     STATE SERVICE REASON          VERSION
3306/tcp open  mysql?  syn-ack ttl 127
| banner: I\x00\x00\x01\xFFj\x04Host '192.168.49.234' is not allowed to c
|_onnect to this MariaDB server
| fingerprint-strings: 
|   GetRequest, LDAPBindReq, NULL, SIPOptions, TerminalServer: 
|_    Host '192.168.49.234' is not allowed to connect to this MariaDB server
|_mysql-empty-password: Host '192.168.49.234' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.234' is not allowed to connect to this MariaDB server
|_mysql-vuln-cve2012-2122: ERROR: Script execution failed (use -d to debug)
|_sslv2-drown: 
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port3306-TCP:V=7.91%I=7%D=1/24%Time=61EEB9E5%P=x86_64-pc-linux-gnu%r(NU
SF:LL,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20al
SF:lowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(GetReques
SF:t,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20all
SF:owed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(LDAPBindRe
SF:q,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20all
SF:owed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(SIPOptions
SF:,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20allo
SF:wed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(TerminalSer
SF:ver,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.234'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 24 09:39:07 2022 -- 1 IP address (1 host up) scanned in 41.00 seconds

```
