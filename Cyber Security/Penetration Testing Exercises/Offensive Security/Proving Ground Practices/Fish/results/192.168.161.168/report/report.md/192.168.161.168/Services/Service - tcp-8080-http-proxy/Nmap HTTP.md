```bash
nmap -vv --reason -Pn -T4 -sV -p 8080 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/tcp_8080_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/xml/tcp_8080_http_nmap.xml" 192.168.161.168
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/tcp_8080_http_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/tcp_8080_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 09:29:38 2022 as: nmap -vv --reason -Pn -T4 -sV -p 8080 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/tcp_8080_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/tcp8080/xml/tcp_8080_http_nmap.xml" 192.168.161.168
Nmap scan report for 192.168.161.168
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 09:29:40 EST for 1113s

PORT     STATE SERVICE     REASON          VERSION
8080/tcp open  http-proxy? syn-ack ttl 127
|_http-aspnet-debug: ERROR: Script execution failed (use -d to debug)
|_http-chrono: Request times for /; avg: 22309.77ms; min: 22289.58ms; max: 22328.77ms
|_http-fetch: Please enter the complete path of the directory to save data in.
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-malware-host: Host appears to be clean
| http-vhosts: 
|_128 names had status ERROR
|_http-vuln-cve2014-3704: ERROR: Script execution failed (use -d to debug)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 09:48:13 2022 -- 1 IP address (1 host up) scanned in 1114.76 seconds

```
