```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/xml/_top_100_udp_nmap.xml" 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 07:56:14 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/xml/_top_100_udp_nmap.xml" 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set.
All 100 scanned ports on 192.168.196.44 are open|filtered because of 100 no-responses
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/21%OT=%CT=%CU=%PV=Y%G=N%TM=61EAB494%P=x86_64-pc-linux-gnu)
U1(R=N)
IE(R=N)


TRACEROUTE (using proto 1/icmp)
HOP RTT       ADDRESS
1   248.21 ms 192.168.49.1
2   ... 30

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:26:44 2022 -- 1 IP address (1 host up) scanned in 1830.38 seconds

```
