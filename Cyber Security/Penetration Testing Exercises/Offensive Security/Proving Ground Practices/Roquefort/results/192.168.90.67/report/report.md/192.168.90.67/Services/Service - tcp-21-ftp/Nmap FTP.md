```bash
nmap -vv --reason -Pn -T4 -sV -p 21 --script="banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp21/tcp_21_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp21/xml/tcp_21_ftp_nmap.xml" 192.168.90.67
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp21/tcp_21_ftp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp21/tcp_21_ftp_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Feb 14 08:43:01 2022 as: nmap -vv --reason -Pn -T4 -sV -p 21 "--script=banner,(ftp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp21/tcp_21_ftp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Roquefort/results/192.168.90.67/scans/tcp21/xml/tcp_21_ftp_nmap.xml" 192.168.90.67
Nmap scan report for 192.168.90.67
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-14 08:43:02 EST for 206s

PORT   STATE SERVICE REASON         VERSION
21/tcp open  ftp     syn-ack ttl 63 ProFTPD 1.3.5b
|_sslv2-drown: 
Service Info: OS: Unix

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Feb 14 08:46:28 2022 -- 1 IP address (1 host up) scanned in 207.17 seconds

```
