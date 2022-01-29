# Billyboss
# Enumeration
## nmap

```
# Nmap 7.91 scan initiated Thu Jan 27 10:39:27 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Billyboss/results/192.168.193.61/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Billyboss/results/192.168.193.61/scans/xml/_full_tcp_nmap.xml" 192.168.193.61
Nmap scan report for 192.168.193.61
Host is up, received user-set (0.21s latency).
Scanned at 2022-01-27 10:39:27 EST for 519s
Not shown: 65532 filtered ports
Reason: 65532 no-responses
PORT     STATE SERVICE REASON          VERSION
21/tcp   open  ftp     syn-ack ttl 127 Microsoft ftpd
| ftp-syst: 
|_  SYST: Windows_NT
80/tcp   open  http    syn-ack ttl 127 Microsoft IIS httpd 10.0
|_http-cors: HEAD GET POST PUT DELETE TRACE OPTIONS CONNECT PATCH
|_http-favicon: Unknown favicon MD5: 8D9ADDAFA993A4318E476ED8EB0C8061
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: Microsoft-IIS/10.0
|_http-title: BaGet
8081/tcp open  http    syn-ack ttl 127 Jetty 9.4.18.v20190429
|_http-favicon: Unknown favicon MD5: 9A008BECDE9C5F250EDAD4F00E567721
| http-methods: 
|_  Supported Methods: GET HEAD
| http-robots.txt: 2 disallowed entries 
|_/repository/ /service/
|_http-server-header: Nexus/3.21.0-05 (OSS)
|_http-title: Nexus Repository Manager
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP (88%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (88%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/27%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F2BEB6%P=x86_64-pc-linux-gnu)
SEQ(SP=105%GCD=1%ISR=10B%II=I%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=261 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

TRACEROUTE (using port 80/tcp)
HOP RTT       ADDRESS
1   214.27 ms 192.168.49.1
2   214.38 ms 192.168.193.61

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan 27 10:48:06 2022 -- 1 IP address (1 host up) scanned in 519.87 seconds

```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.193.61       
Connected to 192.168.193.61.
220 Microsoft FTP Service
Name (192.168.193.61:kali): anonymous
534 Policy requires SSL.
Login failed.
Remote system type is Windows_NT.
ftp> 

```

## 80 - Web - BaGet

![](Pasted%20image%2020220128000104.png)

Documentation
https://loic-sharma.github.io/BaGet/

## 8081 - Web - Jetty - Nexus Repository Manager

![](Pasted%20image%2020220127235209.png)

`admin`:`admin`, `admin`:`admin123` doesnt work

# Exploitation

# Others