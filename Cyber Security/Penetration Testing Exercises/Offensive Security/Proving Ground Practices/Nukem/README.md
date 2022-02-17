# Nukem

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Feb 17 07:24:18 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nukem/results/192.168.108.105/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nukem/results/192.168.108.105/scans/xml/_full_tcp_nmap.xml" 192.168.108.105
adjust_timeouts2: packet supposedly had rtt of -149680 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -149680 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -194394 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -194394 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -220688 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -220688 microseconds.  Ignoring time.
Nmap scan report for 192.168.108.105
Host is up, received user-set (0.19s latency).
Scanned at 2022-02-17 07:24:19 EST for 675s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT      STATE SERVICE     REASON         VERSION
22/tcp    open  ssh         syn-ack ttl 63 OpenSSH 8.3 (protocol 2.0)
| ssh-hostkey: 
|   3072 3e:6a:f5:d3:30:08:7a:ec:38:28:a0:88:4d:75:da:19 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDIa7leEeVssjdrJAMl1xs+qCC7DvEgvhDmYxn7oFKkzQdWQXNwPDaf19b+8uxImEAQ3uRXYg56MItfQ54pTuDpJSuuSfCXyqH9/o5S+gugCgkGiWRTlyXAmCe4uM4ZZD09yChsJ0LdPKvqM19l5o+8KCBuXAGOX7Co60oUpD3+xINAS/XQYFdY1RARpIsuzd3qUHkeKJvGp2hbI6b2bgfcjTcPgBaLKLMa6OZ208whcHdYwJdOnc2m3mi2o9v+ETK+P8exJ1/DTIYLLVlo0BPMqlCE2R4JyEfp8RQeggq42yHOMmBI6pQ/BhClgheiPDhF+hQLNafLgkLeHv625eFq7V8bwi2Uy7/NV8jip1FobFhaT2L/MiRHnx7my4Cxk0BzoAvj0fOzOXouT5rMon6o14x/HTQBqORFhLvTNkCnPE0nen8ohQ05R0oWFiVwH74OaLHvwmzUuy8d1Wln5rW26q+UjZy1AIGpRHvyfEV5dzmB0ujnrE8Io702tIb/ssM=
|   256 43:3b:b5:bf:93:86:68:e9:d5:75:9c:7d:26:94:55:81 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBLFrQmyRArhVBZ7HJi6W3YN/7sFuTBg5RLoffgVyCRaVpqj/VAwL3c85iE7s1x61oRu7CiVIvzOcYAMh5BfOjuI=
|   256 e3:f7:1c:ae:cd:91:c1:28:a3:3a:5b:f6:3e:da:3f:58 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMWYiSpSV5PFfFK8fw7UZ1MAMHej2xBONdUi5CSr7huF
80/tcp    open  http        syn-ack ttl 63 Apache httpd 2.4.46 ((Unix) PHP/7.4.10)
|_http-generator: WordPress 5.5.1
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS
|_http-server-header: Apache/2.4.46 (Unix) PHP/7.4.10
|_http-title: Retro Gamming &#8211; Just another WordPress site
3306/tcp  open  mysql?      syn-ack ttl 63
| fingerprint-strings: 
|   DNSStatusRequestTCP, DNSVersionBindReqTCP, GenericLines, HTTPOptions, Hello, Help, Kerberos, NULL, RPCCheck, RTSPRequest, SSLSessionReq, SSLv23SessionReq, TLSSessionReq, TerminalServerCookie, X11Probe: 
|_    Host '192.168.49.108' is not allowed to connect to this MariaDB server
| mysql-info: 
|_  MySQL Error: Host '192.168.49.108' is not allowed to connect to this MariaDB server
5000/tcp  open  http        syn-ack ttl 63 Werkzeug httpd 1.0.1 (Python 3.8.5)
|_http-server-header: Werkzeug/1.0.1 Python/3.8.5
|_http-title: 404 Not Found
13000/tcp open  http        syn-ack ttl 63 nginx 1.18.0
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: nginx/1.18.0
|_http-title: Login V14
36445/tcp open  netbios-ssn syn-ack ttl 63 Samba smbd 4.6.2
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port3306-TCP:V=7.91%I=9%D=2/17%Time=620E40BC%P=x86_64-pc-linux-gnu%r(NU
SF:LL,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20al
SF:lowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(GenericLi
SF:nes,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(HTTPOpti
SF:ons,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(RTSPRequ
SF:est,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20a
SF:llowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(RPCCheck
SF:,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20allo
SF:wed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(DNSVersionB
SF:indReqTCP,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20no
SF:t\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(DN
SF:SStatusRequestTCP,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20
SF:is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20serve
SF:r")%r(Hello,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20
SF:not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(
SF:Help,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x20
SF:allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(SSLSess
SF:ionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is\x20not\x
SF:20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server")%r(Termi
SF:nalServerCookie,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20is
SF:\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server"
SF:)%r(TLSSessionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20
SF:is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20serve
SF:r")%r(SSLv23SessionReq,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108
SF:'\x20is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20
SF:server")%r(Kerberos,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x
SF:20is\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20ser
SF:ver")%r(X11Probe,4D,"I\0\0\x01\xffj\x04Host\x20'192\.168\.49\.108'\x20i
SF:s\x20not\x20allowed\x20to\x20connect\x20to\x20this\x20MariaDB\x20server
SF:");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 4.X|5.X (85%)
OS CPE: cpe:/o:linux:linux_kernel:4 cpe:/o:linux:linux_kernel:5
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 4.15 - 5.6 (85%), Linux 5.0 - 5.3 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/17%OT=22%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=620E4117%P=x86_64-pc-linux-gnu)
SEQ(SP=FB%GCD=1%ISR=10B%TI=Z%II=I%TS=A)
SEQ(SP=FB%GCD=1%ISR=10B%TI=Z%TS=C)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 1.950 days (since Tue Feb 15 08:47:54 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=251 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   187.41 ms 192.168.49.1
2   187.49 ms 192.168.108.105

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 07:35:35 2022 -- 1 IP address (1 host up) scanned in 678.34 seconds
```

## 5000 - Web

![](Pasted%20image%2020220217212939.png)

## 13000 - Web

![](Pasted%20image%2020220217213747.png)

![](Pasted%20image%2020220217213849.png)

![](Pasted%20image%2020220217214138.png)

## 36445 - Samba

# Exploitation

# Privesc

# Other