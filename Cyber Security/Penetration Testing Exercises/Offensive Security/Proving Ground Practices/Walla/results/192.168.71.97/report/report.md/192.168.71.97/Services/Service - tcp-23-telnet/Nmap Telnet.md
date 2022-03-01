```bash
nmap -vv --reason -Pn -T4 -sV -p 23 --script="banner,telnet-encryption,telnet-ntlm-info" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/tcp_23_telnet-nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/xml/tcp_23_telnet_nmap.xml" 192.168.71.97
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/tcp_23_telnet-nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/tcp_23_telnet-nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 27 11:49:39 2022 as: nmap -vv --reason -Pn -T4 -sV -p 23 --script=banner,telnet-encryption,telnet-ntlm-info -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/tcp_23_telnet-nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp23/xml/tcp_23_telnet_nmap.xml" 192.168.71.97
Nmap scan report for 192.168.71.97
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-27 11:49:42 EST for 1s

PORT   STATE SERVICE REASON         VERSION
23/tcp open  telnet  syn-ack ttl 63 Linux telnetd
|_banner: Linux Telnetd 0.17
| telnet-encryption: 
|_  Telnet server does not support encryption
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 11:49:43 2022 -- 1 IP address (1 host up) scanned in 4.48 seconds

```
