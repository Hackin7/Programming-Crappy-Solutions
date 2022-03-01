```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_top_100_udp_nmap.xml" 192.168.71.97
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 27 11:49:00 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_top_100_udp_nmap.xml" 192.168.71.97
Increasing send delay for 192.168.71.97 from 0 to 50 due to 11 out of 18 dropped probes since last increase.
Warning: 192.168.71.97 giving up on port because retransmission cap hit (6).
Increasing send delay for 192.168.71.97 from 200 to 400 due to 11 out of 16 dropped probes since last increase.
Increasing send delay for 192.168.71.97 from 400 to 800 due to 11 out of 14 dropped probes since last increase.
Nmap scan report for 192.168.71.97
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-27 11:49:02 EST for 284s
Not shown: 77 closed ports
Reason: 77 port-unreaches
PORT      STATE         SERVICE        REASON      VERSION
19/udp    open|filtered chargen        no-response
53/udp    open|filtered domain         no-response
67/udp    open|filtered dhcps          no-response
120/udp   open|filtered cfdptkt        no-response
137/udp   open|filtered netbios-ns     no-response
139/udp   open|filtered netbios-ssn    no-response
162/udp   open|filtered snmptrap       no-response
623/udp   open|filtered asf-rmcp       no-response
631/udp   open|filtered ipp            no-response
996/udp   open|filtered vsinet         no-response
1719/udp  open|filtered h323gatestat   no-response
2222/udp  open|filtered msantipiracy   no-response
2223/udp  open|filtered rockwell-csp2  no-response
3283/udp  open|filtered netassistant   no-response
5353/udp  open|filtered zeroconf       no-response
5632/udp  open|filtered pcanywherestat no-response
17185/udp open|filtered wdbrpc         no-response
32768/udp open|filtered omad           no-response
49152/udp open|filtered unknown        no-response
49153/udp open|filtered unknown        no-response
49154/udp open|filtered unknown        no-response
49185/udp open|filtered unknown        no-response
49188/udp open|filtered unknown        no-response
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/27%OT=%CT=%CU=7%PV=Y%DS=2%DC=T%G=N%TM=621BAC9A%P=x86_64-pc-linux-gnu)
SEQ(II=I)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 2 hops

TRACEROUTE (using port 443/udp)
HOP RTT       ADDRESS
1   181.82 ms 192.168.49.1
2   181.83 ms 192.168.71.97

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 11:53:46 2022 -- 1 IP address (1 host up) scanned in 287.23 seconds

```
