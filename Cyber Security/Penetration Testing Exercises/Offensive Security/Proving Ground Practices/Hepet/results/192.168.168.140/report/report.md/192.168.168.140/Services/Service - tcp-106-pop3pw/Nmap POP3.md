```bash
nmap -vv --reason -Pn -T4 -sV -p 106 --script="banner,(pop3* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp106/tcp_106_pop3_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp106/xml/tcp_106_pop3_nmap.xml" 192.168.168.140
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp106/tcp_106_pop3_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp106/tcp_106_pop3_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 12:15:28 2022 as: nmap -vv --reason -Pn -T4 -sV -p 106 "--script=banner,(pop3* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp106/tcp_106_pop3_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp106/xml/tcp_106_pop3_nmap.xml" 192.168.168.140
Nmap scan report for 192.168.168.140
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 12:15:32 EST for 2s

PORT    STATE SERVICE REASON          VERSION
106/tcp open  pop3pw  syn-ack ttl 127 Mercury/32 poppass service
|_banner: 200 localhost MercuryW PopPass server ready.
Service Info: Host: localhost; OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 12:15:34 2022 -- 1 IP address (1 host up) scanned in 7.05 seconds

```
