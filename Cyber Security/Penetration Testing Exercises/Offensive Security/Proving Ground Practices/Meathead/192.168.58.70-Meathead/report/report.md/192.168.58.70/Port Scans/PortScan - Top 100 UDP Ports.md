```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/root/autorecon/results/192.168.58.70/scans/_top_100_udp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/xml/_top_100_udp_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/_top_100_udp_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:45:03 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN /root/autorecon/results/192.168.58.70/scans/_top_100_udp_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/xml/_top_100_udp_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:45:07 +08 for 1816s
All 100 scanned ports on 192.168.58.70 are in ignored states.
Not shown: 100 open|filtered udp ports (no-response)
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/19%OT=%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E7F2CB%P=x86_64-pc-linux-gnu)
SEQ(II=I)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops

TRACEROUTE (using proto 1/icmp)
HOP RTT       ADDRESS
1   169.98 ms 192.168.49.1
2   170.07 ms 192.168.58.70

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 19:15:23 2022 -- 1 IP address (1 host up) scanned in 1819.90 seconds

```
