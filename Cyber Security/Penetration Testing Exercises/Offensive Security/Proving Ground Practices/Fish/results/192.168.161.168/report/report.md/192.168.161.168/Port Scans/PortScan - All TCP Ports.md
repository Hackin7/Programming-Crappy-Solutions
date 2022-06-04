```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/xml/_full_tcp_nmap.xml" 192.168.161.168
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_full_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 09:17:03 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/xml/_full_tcp_nmap.xml" 192.168.161.168
Nmap scan report for 192.168.161.168
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 09:17:04 EST for 1293s
Not shown: 65525 filtered ports
Reason: 65525 no-responses
PORT      STATE SERVICE        REASON          VERSION
3389/tcp  open  ms-wbt-server? syn-ack ttl 127
3700/tcp  open  lrs-paging?    syn-ack ttl 127
4848/tcp  open  appserv-http?  syn-ack ttl 127
6060/tcp  open  x11?           syn-ack ttl 127
7676/tcp  open  imqbrokerd?    syn-ack ttl 127
7680/tcp  open  pando-pub?     syn-ack ttl 127
8080/tcp  open  http-proxy?    syn-ack ttl 127
8181/tcp  open  intermapper?   syn-ack ttl 127
8686/tcp  open  sun-as-jmxrmi? syn-ack ttl 127
49694/tcp open  unknown        syn-ack ttl 127
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: specialized|general purpose
Running (JUST GUESSING): AVtech embedded (87%), Microsoft Windows XP (86%), FreeBSD 6.X (85%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:freebsd:freebsd:6.2
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: AVtech Room Alert 26W environmental monitor (87%), Microsoft Windows XP SP3 (86%), FreeBSD 6.2-RELEASE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/13%OT=3389%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=620917ED%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=109%TI=I%TS=U)
OPS(O1=M54ENW0NNS%O2=M54ENW0NNS%O3=M54ENW0%O4=M54ENW0NNS%O5=M54ENW0NNS%O6=M54ENNS)
WIN(W1=FA00%W2=FA00%W3=FA00%W4=FA00%W5=FA00%W6=FA00)
ECN(R=Y%DF=Y%TG=80%W=FA00%O=M54ENW0NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=N)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: Incremental

TRACEROUTE (using port 3389/tcp)
HOP RTT       ADDRESS
1   182.87 ms 192.168.49.1
2   182.88 ms 192.168.161.168

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 09:38:37 2022 -- 1 IP address (1 host up) scanned in 1294.62 seconds

```