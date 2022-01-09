```bash
nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/xml/_top_100_udp_nmap.xml" 10.10.11.120
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/_top_100_udp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/_top_100_udp_nmap.txt):

```
# Nmap 7.91 scan initiated Thu Jan  6 04:28:18 2022 as: nmap -vv --reason -Pn -T4 -sU -A --top-ports 100 -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/_top_100_udp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/xml/_top_100_udp_nmap.xml" 10.10.11.120
Warning: 10.10.11.120 giving up on port because retransmission cap hit (6).
Increasing send delay for 10.10.11.120 from 100 to 200 due to 11 out of 12 dropped probes since last increase.
Increasing send delay for 10.10.11.120 from 200 to 400 due to 11 out of 13 dropped probes since last increase.
Increasing send delay for 10.10.11.120 from 400 to 800 due to 11 out of 21 dropped probes since last increase.
Nmap scan report for 10.10.11.120
Host is up, received user-set (0.19s latency).
Scanned at 2022-01-06 04:28:19 EST for 233s

PORT      STATE         SERVICE         REASON              VERSION
7/udp     closed        echo            port-unreach ttl 63
9/udp     open|filtered discard         no-response
17/udp    closed        qotd            port-unreach ttl 63
19/udp    closed        chargen         port-unreach ttl 63
49/udp    closed        tacacs          port-unreach ttl 63
53/udp    open|filtered domain          no-response
67/udp    closed        dhcps           port-unreach ttl 63
68/udp    closed        dhcpc           port-unreach ttl 63
69/udp    closed        tftp            port-unreach ttl 63
80/udp    closed        http            port-unreach ttl 63
88/udp    closed        kerberos-sec    port-unreach ttl 63
111/udp   closed        rpcbind         port-unreach ttl 63
120/udp   closed        cfdptkt         port-unreach ttl 63
123/udp   open|filtered ntp             no-response
135/udp   closed        msrpc           port-unreach ttl 63
136/udp   closed        profile         port-unreach ttl 63
137/udp   open|filtered netbios-ns      no-response
138/udp   open|filtered netbios-dgm     no-response
139/udp   open|filtered netbios-ssn     no-response
158/udp   closed        pcmail-srv      port-unreach ttl 63
161/udp   closed        snmp            port-unreach ttl 63
162/udp   closed        snmptrap        port-unreach ttl 63
177/udp   open|filtered xdmcp           no-response
427/udp   closed        svrloc          port-unreach ttl 63
443/udp   open|filtered https           no-response
445/udp   closed        microsoft-ds    port-unreach ttl 63
497/udp   closed        retrospect      port-unreach ttl 63
500/udp   open|filtered isakmp          no-response
514/udp   closed        syslog          port-unreach ttl 63
515/udp   closed        printer         port-unreach ttl 63
518/udp   open|filtered ntalk           no-response
520/udp   open|filtered route           no-response
593/udp   closed        http-rpc-epmap  port-unreach ttl 63
623/udp   open|filtered asf-rmcp        no-response
626/udp   open|filtered serialnumberd   no-response
631/udp   open|filtered ipp             no-response
996/udp   closed        vsinet          port-unreach ttl 63
997/udp   closed        maitrd          port-unreach ttl 63
998/udp   open|filtered puparp          no-response
999/udp   open|filtered applix          no-response
1022/udp  closed        exp2            port-unreach ttl 63
1023/udp  open|filtered unknown         no-response
1025/udp  closed        blackjack       port-unreach ttl 63
1026/udp  open|filtered win-rpc         no-response
1027/udp  closed        unknown         port-unreach ttl 63
1028/udp  closed        ms-lsa          port-unreach ttl 63
1029/udp  closed        solid-mux       port-unreach ttl 63
1030/udp  closed        iad1            port-unreach ttl 63
1433/udp  closed        ms-sql-s        port-unreach ttl 63
1434/udp  closed        ms-sql-m        port-unreach ttl 63
1645/udp  closed        radius          port-unreach ttl 63
1646/udp  closed        radacct         port-unreach ttl 63
1701/udp  open|filtered L2TP            no-response
1718/udp  closed        h225gatedisc    port-unreach ttl 63
1719/udp  closed        h323gatestat    port-unreach ttl 63
1812/udp  closed        radius          port-unreach ttl 63
1813/udp  open|filtered radacct         no-response
1900/udp  closed        upnp            port-unreach ttl 63
2000/udp  closed        cisco-sccp      port-unreach ttl 63
2048/udp  closed        dls-monitor     port-unreach ttl 63
2049/udp  closed        nfs             port-unreach ttl 63
2222/udp  closed        msantipiracy    port-unreach ttl 63
2223/udp  open|filtered rockwell-csp2   no-response
3283/udp  closed        netassistant    port-unreach ttl 63
3456/udp  closed        IISrpc-or-vat   port-unreach ttl 63
3703/udp  closed        adobeserver-3   port-unreach ttl 63
4444/udp  open|filtered krb524          no-response
4500/udp  closed        nat-t-ike       port-unreach ttl 63
5000/udp  open|filtered upnp            no-response
5060/udp  closed        sip             port-unreach ttl 63
5353/udp  open|filtered zeroconf        no-response
5632/udp  closed        pcanywherestat  port-unreach ttl 63
9200/udp  closed        wap-wsp         port-unreach ttl 63
10000/udp closed        ndmp            port-unreach ttl 63
17185/udp closed        wdbrpc          port-unreach ttl 63
20031/udp open|filtered bakbonenetvault no-response
30718/udp closed        unknown         port-unreach ttl 63
31337/udp closed        BackOrifice     port-unreach ttl 63
32768/udp closed        omad            port-unreach ttl 63
32769/udp open|filtered filenet-rpc     no-response
32771/udp closed        sometimes-rpc6  port-unreach ttl 63
32815/udp open|filtered unknown         no-response
33281/udp closed        unknown         port-unreach ttl 63
49152/udp closed        unknown         port-unreach ttl 63
49153/udp closed        unknown         port-unreach ttl 63
49154/udp closed        unknown         port-unreach ttl 63
49156/udp closed        unknown         port-unreach ttl 63
49181/udp closed        unknown         port-unreach ttl 63
49182/udp closed        unknown         port-unreach ttl 63
49185/udp closed        unknown         port-unreach ttl 63
49186/udp closed        unknown         port-unreach ttl 63
49188/udp closed        unknown         port-unreach ttl 63
49190/udp closed        unknown         port-unreach ttl 63
49191/udp closed        unknown         port-unreach ttl 63
49192/udp closed        unknown         port-unreach ttl 63
49193/udp closed        unknown         port-unreach ttl 63
49194/udp closed        unknown         port-unreach ttl 63
49200/udp closed        unknown         port-unreach ttl 63
49201/udp closed        unknown         port-unreach ttl 63
65024/udp closed        unknown         port-unreach ttl 63
Too many fingerprints match this host to give specific OS details
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/6%OT=%CT=%CU=7%PV=Y%DS=2%DC=T%G=N%TM=61D6B71C%P=x86_64-pc-linux-gnu)
SEQ(CI=Z%II=I)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)
T7(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 2 hops

TRACEROUTE (using port 49185/udp)
HOP RTT       ADDRESS
1   181.92 ms 10.10.14.1
2   181.93 ms 10.10.11.120

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan  6 04:32:12 2022 -- 1 IP address (1 host up) scanned in 234.33 seconds

```