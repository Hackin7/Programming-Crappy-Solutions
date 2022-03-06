```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/xml/_top_100_udp_nmap.xml" 192.168.168.129
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 09:00:29 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/xml/_top_100_udp_nmap.xml" 192.168.168.129
Warning: 192.168.168.129 giving up on port because retransmission cap hit (6).
Increasing send delay for 192.168.168.129 from 100 to 200 due to 11 out of 12 dropped probes since last increase.
Increasing send delay for 192.168.168.129 from 200 to 400 due to 11 out of 11 dropped probes since last increase.
Increasing send delay for 192.168.168.129 from 400 to 800 due to 11 out of 15 dropped probes since last increase.
Nmap scan report for 192.168.168.129
Host is up, received user-set (0.18s latency).
Scanned at 2022-03-05 09:00:30 EST for 200s
Not shown: 86 closed ports
Reason: 86 port-unreaches
PORT      STATE         SERVICE       REASON      VERSION
49/udp    open|filtered tacacs        no-response
67/udp    open|filtered dhcps         no-response
68/udp    open|filtered dhcpc         no-response
427/udp   open|filtered svrloc        no-response
443/udp   open|filtered https         no-response
497/udp   open|filtered retrospect    no-response
500/udp   open|filtered isakmp        no-response
514/udp   open|filtered syslog        no-response
518/udp   open|filtered ntalk         no-response
626/udp   open|filtered serialnumberd no-response
999/udp   open|filtered applix        no-response
30718/udp open|filtered unknown       no-response
32769/udp open|filtered filenet-rpc   no-response
33281/udp open|filtered unknown       no-response
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=3/5%OT=%CT=%CU=7%PV=Y%DS=2%DC=T%G=N%TM=62236DC6%P=x86_64-pc-linux-gnu)
SEQ(II=I)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 2 hops

TRACEROUTE (using port 5353/udp)
HOP RTT       ADDRESS
1   173.91 ms 192.168.49.1
2   174.08 ms 192.168.168.129

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 09:03:50 2022 -- 1 IP address (1 host up) scanned in 200.85 seconds

```
