```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/xml/_top_100_udp_nmap.xml" 192.168.105.179
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Thu Feb 17 05:06:54 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/DVR4/results/192.168.105.179/scans/xml/_top_100_udp_nmap.xml" 192.168.105.179
Nmap scan report for 192.168.105.179
Host is up, received user-set (0.18s latency).
All 100 scanned ports on 192.168.105.179 are open|filtered because of 100 no-responses
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/17%OT=%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=620E2555%P=x86_64-pc-linux-gnu)
SEQ(II=I)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops

TRACEROUTE (using proto 1/icmp)
HOP RTT       ADDRESS
1   177.07 ms 192.168.49.1
2   178.05 ms 192.168.105.179

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 05:37:09 2022 -- 1 IP address (1 host up) scanned in 1815.40 seconds

```
