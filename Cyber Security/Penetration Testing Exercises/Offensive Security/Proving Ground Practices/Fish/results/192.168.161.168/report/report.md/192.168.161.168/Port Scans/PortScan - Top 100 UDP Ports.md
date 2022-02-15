```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/xml/_top_100_udp_nmap.xml" 192.168.161.168
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 09:17:03 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/xml/_top_100_udp_nmap.xml" 192.168.161.168
Nmap scan report for 192.168.161.168
Host is up, received user-set.
All 100 scanned ports on 192.168.161.168 are open|filtered because of 100 no-responses
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/13%OT=%CT=%CU=%PV=Y%G=N%TM=620919FF%P=x86_64-pc-linux-gnu)
U1(R=N)
IE(R=N)


TRACEROUTE (using proto 1/icmp)
HOP RTT       ADDRESS
1   176.62 ms 192.168.49.1
2   ... 30

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 09:47:27 2022 -- 1 IP address (1 host up) scanned in 1824.66 seconds

```
