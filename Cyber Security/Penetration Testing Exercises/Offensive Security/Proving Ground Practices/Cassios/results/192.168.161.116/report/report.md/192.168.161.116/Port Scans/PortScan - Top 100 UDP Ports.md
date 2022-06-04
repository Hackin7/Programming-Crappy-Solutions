```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_top_100_udp_nmap.xml" 192.168.161.116
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 10:50:54 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/xml/_top_100_udp_nmap.xml" 192.168.161.116
Increasing send delay for 192.168.161.116 from 50 to 100 due to 11 out of 12 dropped probes since last increase.
Warning: 192.168.161.116 giving up on port because retransmission cap hit (6).
Increasing send delay for 192.168.161.116 from 200 to 400 due to 11 out of 11 dropped probes since last increase.
Increasing send delay for 192.168.161.116 from 400 to 800 due to 11 out of 11 dropped probes since last increase.
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 10:50:55 EST for 279s
Not shown: 84 closed ports
Reason: 84 port-unreaches
PORT      STATE         SERVICE      REASON      VERSION
49/udp    open|filtered tacacs       no-response
137/udp   open|filtered netbios-ns   no-response
443/udp   open|filtered https        no-response
518/udp   open|filtered ntalk        no-response
997/udp   open|filtered maitrd       no-response
1023/udp  open|filtered unknown      no-response
1027/udp  open|filtered unknown      no-response
1645/udp  open|filtered radius       no-response
1719/udp  open|filtered h323gatestat no-response
1813/udp  open|filtered radacct      no-response
9200/udp  open|filtered wap-wsp      no-response
30718/udp open|filtered unknown      no-response
49152/udp open|filtered unknown      no-response
49153/udp open|filtered unknown      no-response
49156/udp open|filtered unknown      no-response
49188/udp open|filtered unknown      no-response
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/13%OT=%CT=%CU=7%PV=Y%DS=2%DC=T%G=N%TM=620929F6%P=x86_64-pc-linux-gnu)
SEQ(II=I)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 2 hops

TRACEROUTE (using port 998/udp)
HOP RTT       ADDRESS
1   180.66 ms 192.168.49.1
2   181.14 ms 192.168.161.116

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 10:55:34 2022 -- 1 IP address (1 host up) scanned in 280.42 seconds

```