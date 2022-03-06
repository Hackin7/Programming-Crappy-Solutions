```bash
nmap -vv --reason -Pn -T4 -sV -p 110 --script="banner,(pop3* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp110/tcp_110_pop3_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp110/xml/tcp_110_pop3_nmap.xml" 192.168.168.140
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp110/tcp_110_pop3_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp110/tcp_110_pop3_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 12:15:28 2022 as: nmap -vv --reason -Pn -T4 -sV -p 110 "--script=banner,(pop3* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp110/tcp_110_pop3_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp110/xml/tcp_110_pop3_nmap.xml" 192.168.168.140
Nmap scan report for 192.168.168.140
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 12:15:33 EST for 4s

PORT    STATE SERVICE REASON          VERSION
110/tcp open  pop3    syn-ack ttl 127 Mercury/32 pop3d
|_banner: +OK <278578.3989@localhost>, POP3 server ready.
|_pop3-capabilities: APOP EXPIRE(NEVER) USER UIDL TOP
|_sslv2-drown: 
Service Info: Host: localhost; OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 12:15:37 2022 -- 1 IP address (1 host up) scanned in 9.19 seconds

```
