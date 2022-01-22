```bash
nmap -vv --reason -Pn -T4 -sV -p 3306 --script="banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/tcp_3306_mysql_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/tcp_3306_mysql_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 07:57:11 2022 as: nmap -vv --reason -Pn -T4 -sV -p 3306 "--script=banner,(mysql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/tcp_3306_mysql_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp3306/xml/tcp_3306_mysql_nmap.xml" 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:57:13 EST for 11s

PORT     STATE SERVICE REASON          VERSION
3306/tcp open  mysql   syn-ack ttl 127 MySQL (unauthorized)
| banner: G\x00\x00\x00\xFFj\x04Host '192.168.49.196' is not allowed to c
|_onnect to this MySQL server
|_mysql-empty-password: Host '192.168.49.196' is not allowed to connect to this MySQL server
|_mysql-vuln-cve2012-2122: ERROR: Script execution failed (use -d to debug)
|_sslv2-drown: 

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 07:57:24 2022 -- 1 IP address (1 host up) scanned in 13.04 seconds

```
