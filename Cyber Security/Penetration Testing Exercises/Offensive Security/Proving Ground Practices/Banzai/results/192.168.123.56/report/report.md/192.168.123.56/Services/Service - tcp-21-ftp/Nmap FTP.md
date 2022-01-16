```bash
nmap -vv --reason -Pn -T4 -sV -p 21 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp21/tcp_21_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp21/xml/tcp_21_ftp_nmap.xml" 192.168.123.56
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp21/tcp_21_ftp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp21/tcp_21_ftp_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Jan 15 12:34:08 2022 as: nmap -vv --reason -Pn -T4 -sV -p 21 "--script=banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp21/tcp_21_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp21/xml/tcp_21_ftp_nmap.xml" 192.168.123.56
Nmap scan report for 192.168.123.56
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-15 12:34:11 EST for 7s

PORT   STATE SERVICE REASON         VERSION
21/tcp open  ftp     syn-ack ttl 63 vsftpd 3.0.3
|_banner: 220 (vsFTPd 3.0.3)
|_sslv2-drown: 
Service Info: OS: Unix

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Jan 15 12:34:18 2022 -- 1 IP address (1 host up) scanned in 9.98 seconds

```