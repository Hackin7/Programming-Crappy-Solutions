```bash
nmap -vv --reason -Pn -T4 -sV -p 11100 --script="banner,(vnc* or realvnc* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" --script-args="unsafe=1" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp11100/tcp_11100_vnc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp11100/xml/tcp_11100_vnc_nmap.xml" 192.168.168.140
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp11100/tcp_11100_vnc_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp11100/tcp_11100_vnc_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 12:22:04 2022 as: nmap -vv --reason -Pn -T4 -sV -p 11100 "--script=banner,(vnc* or realvnc* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" --script-args=unsafe=1 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp11100/tcp_11100_vnc_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp11100/xml/tcp_11100_vnc_nmap.xml" 192.168.168.140
Nmap scan report for 192.168.168.140
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 12:22:06 EST for 3s

PORT      STATE SERVICE REASON          VERSION
11100/tcp open  vnc     syn-ack ttl 127 VNC (protocol 3.8)
|_banner: RFB 003.008
|_sslv2-drown: 
| vnc-info: 
|   Protocol version: 3.8
|   Security types: 
|_    Unknown security type (40)

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 12:22:09 2022 -- 1 IP address (1 host up) scanned in 5.94 seconds

```
