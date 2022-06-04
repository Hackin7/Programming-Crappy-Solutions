```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/root/autorecon/results/192.168.139.68/scans/_top_100_udp_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/xml/_top_100_udp_nmap.xml" 192.168.139.68
```

[/root/autorecon/results/192.168.139.68/scans/_top_100_udp_nmap.txt](file:///root/autorecon/results/192.168.139.68/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.92 scan initiated Sun Jan 30 16:56:37 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN /root/autorecon/results/192.168.139.68/scans/_top_100_udp_nmap.txt -oX /root/autorecon/results/192.168.139.68/scans/xml/_top_100_udp_nmap.xml 192.168.139.68
Nmap scan report for 192.168.139.68
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-30 16:56:40 +08 for 1818s
All 100 scanned ports on 192.168.139.68 are in ignored states.
Not shown: 100 open|filtered udp ports (no-response)
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/30%OT=%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F659E2%P=x86_64-pc-linux-gnu)
SEQ(II=I)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Network Distance: 2 hops

TRACEROUTE (using proto 1/icmp)
HOP RTT       ADDRESS
1   251.82 ms 192.168.49.1
2   251.88 ms 192.168.139.68

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 30 17:26:59 2022 -- 1 IP address (1 host up) scanned in 1822.12 seconds

```