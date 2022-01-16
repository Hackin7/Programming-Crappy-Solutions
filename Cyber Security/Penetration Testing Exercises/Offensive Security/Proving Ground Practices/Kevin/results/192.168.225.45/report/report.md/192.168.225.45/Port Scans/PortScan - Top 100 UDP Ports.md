```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_top_100_udp_nmap.xml" 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 08:09:09 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_top_100_udp_nmap.xml" 192.168.225.45
Warning: 192.168.225.45 giving up on port because retransmission cap hit (6).
Increasing send delay for 192.168.225.45 from 100 to 200 due to 11 out of 13 dropped probes since last increase.
Increasing send delay for 192.168.225.45 from 200 to 400 due to 11 out of 11 dropped probes since last increase.
Increasing send delay for 192.168.225.45 from 400 to 800 due to 11 out of 13 dropped probes since last increase.
Increasing send delay for 192.168.225.45 from 800 to 1000 due to 11 out of 21 dropped probes since last increase.
Nmap scan report for 192.168.225.45
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-16 08:09:11 EST for 343s
Not shown: 86 closed ports
Reason: 86 port-unreaches
PORT      STATE         SERVICE      REASON       VERSION
53/udp    open|filtered domain       no-response
67/udp    open|filtered dhcps        no-response
68/udp    open|filtered dhcpc        no-response
69/udp    open|filtered tftp         no-response
120/udp   open|filtered cfdptkt      no-response
137/udp   open          netbios-ns   udp-response Microsoft Windows netbios-ns (workgroup: WORKGROUP)
138/udp   open|filtered netbios-dgm  no-response
500/udp   open|filtered isakmp       no-response
999/udp   open|filtered applix       no-response
1719/udp  open|filtered h323gatestat no-response
4500/udp  open|filtered nat-t-ike    no-response
9200/udp  open|filtered wap-wsp      no-response
31337/udp open|filtered BackOrifice  no-response
|_backorifice-info: ERROR: Script execution failed (use -d to debug)
32769/udp open|filtered filenet-rpc  no-response
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/16%OT=%CT=%CU=7%PV=Y%DS=2%DC=T%G=N%TM=61E41A4E%P=x86_64-pc-linux-gnu)
SEQ(II=I)
T5(R=Y%DF=Y%T=80%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
U1(R=Y%DF=N%T=80%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=80%CD=Z)

Network Distance: 2 hops
Service Info: Host: KEVIN; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
| nbstat: NetBIOS name: KEVIN, NetBIOS user: <unknown>, NetBIOS MAC: 00:50:56:bf:40:6d (VMware)
| Names:
|   KEVIN<00>            Flags: <unique><active>
|   WORKGROUP<00>        Flags: <group><active>
|   KEVIN<20>            Flags: <unique><active>
|   WORKGROUP<1e>        Flags: <group><active>
|   WORKGROUP<1d>        Flags: <unique><active>
|   \x01\x02__MSBROWSE__\x02<01>  Flags: <group><active>
| Statistics:
|   00 50 56 bf 40 6d 00 00 00 00 00 00 00 00 00 00 00
|   00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
|_  00 00 00 00 00 00 00 00 00 00 00 00 00 00

TRACEROUTE (using port 520/udp)
HOP RTT       ADDRESS
1   243.85 ms 192.168.49.1
2   243.90 ms 192.168.225.45

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 08:14:54 2022 -- 1 IP address (1 host up) scanned in 346.26 seconds

```
