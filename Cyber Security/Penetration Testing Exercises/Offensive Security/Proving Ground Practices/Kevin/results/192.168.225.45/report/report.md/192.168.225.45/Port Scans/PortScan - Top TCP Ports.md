```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_quick_tcp_nmap.xml" 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_quick_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_quick_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 08:09:09 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/xml/_quick_tcp_nmap.xml" 192.168.225.45
Increasing send delay for 192.168.225.45 from 0 to 5 due to 271 out of 677 dropped probes since last increase.
adjust_timeouts2: packet supposedly had rtt of -1946336 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -1946336 microseconds.  Ignoring time.
Nmap scan report for 192.168.225.45
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-16 08:09:11 EST for 110s
Not shown: 989 closed ports
Reason: 989 resets
PORT      STATE SERVICE      REASON          VERSION
80/tcp    open  http         syn-ack ttl 127 GoAhead WebServer
| http-methods: 
|_  Supported Methods: GET HEAD
| http-title: HP Power Manager
|_Requested resource was http://192.168.225.45/index.asp
135/tcp   open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn  syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp   open  microsoft-ds syn-ack ttl 127 Windows 7 Ultimate N 7600 microsoft-ds (workgroup: WORKGROUP)
3389/tcp  open  tcpwrapped   syn-ack ttl 127
| ssl-cert: Subject: commonName=kevin
| Issuer: commonName=kevin
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2022-01-15T13:08:03
| Not valid after:  2022-07-17T13:08:03
| MD5:   94b2 2c61 9bd1 62e3 ca3e ed69 45ea a96a
| SHA-1: 115c bdc4 0e2a f10e f7b0 5b4d 25ed d5d6 67a7 40f8
| -----BEGIN CERTIFICATE-----
| MIICzjCCAbagAwIBAgIQXV+rEgC5apRP/N7Vx3oguzANBgkqhkiG9w0BAQUFADAQ
| MQ4wDAYDVQQDEwVrZXZpbjAeFw0yMjAxMTUxMzA4MDNaFw0yMjA3MTcxMzA4MDNa
| MBAxDjAMBgNVBAMTBWtldmluMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC
| AQEAiOLhlRZwrr/g3+QXOX+YK5lKMgwkX+FUH9OVF13F2EmY1/K3WQWOwjkDfNkI
| ssIHz2PV5EVEoAwla1CCRSYuPOtO7Y1j23b9S8w4AW72r3QWzhi4hD0pYFZ1D/zM
| xnq6Y9AumTdY1wGejYvhfjWsoS1wXMUqhWkJeekYNM1m0opMOjdEfy54/IROKEEx
| dQO2ZeUIGuya70OxrzH3Le6dxuLiuY1B2fvF6nf8S6N8AS5FY7PWXbV6pMQwWwTs
| 52XoWLIJF9cmRXIi40wtp232XS64ipZN9c5OqCUs6PFf54z/JLQimz5jJpQZbuQb
| 1duE/6v7oEvfb6jwvPX2I3DV4wIDAQABoyQwIjATBgNVHSUEDDAKBggrBgEFBQcD
| ATALBgNVHQ8EBAMCBDAwDQYJKoZIhvcNAQEFBQADggEBAEJegNQ8WYhm3Rritatl
| HckQuPhcgqMtHeZATQWVDpf+AK6cLT5v6t0NR04Pt7M5DrzuydxEhlobdO/1zL68
| M9IY3vsQxK8bG5tWdsD7SgMlzCoQuOMP4BOekUMjHKWEbh/jFBXJnHUqEXTVDU46
| 8+GDRfVbeLkWQZFPDyC7vdEZSGHbkybZsAOQhP5T0Oxq3dbCbS658vbvPK9x4Hxi
| R7W87MjjWsCukw/AivhT6s1G5VQzQBVRWWP39CI3YwFL2c823ZHK2KZ+yzlUY4ra
| bkAWeOfRIy3qxLxgOiAPcf6xMvcPbi5EFdmQjnt1l6CDn7lMIEdAgZ5xRrpJ9Dyw
| 5LY=
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-16T13:11:01+00:00; +1s from scanner time.
49152/tcp open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
49153/tcp open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
49154/tcp open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
49155/tcp open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
49156/tcp open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
49159/tcp open  msrpc        syn-ack ttl 127 Microsoft Windows RPC
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows 2008|7|Vista|2012|8.1 (92%)
OS CPE: cpe:/o:microsoft:windows_server_2008:r2 cpe:/o:microsoft:windows_7 cpe:/o:microsoft:windows_vista::- cpe:/o:microsoft:windows_vista::sp1 cpe:/o:microsoft:windows_server_2012:r2 cpe:/o:microsoft:windows_8 cpe:/o:microsoft:windows_8.1:r1
OS fingerprint not ideal because: maxTimingRatio (1.470000e+00) is greater than 1.4
Aggressive OS guesses: Microsoft Windows Server 2008 R2 (92%), Microsoft Windows 7 (92%), Microsoft Windows Vista SP0 or SP1, Windows Server 2008 SP1, or Windows 7 (92%), Microsoft Windows Vista SP2, Windows 7 SP1, or Windows Server 2008 (92%), Microsoft Windows Vista SP2 (92%), Microsoft Windows Server 2012 R2 (91%), Microsoft Windows Server 2008 R2 SP1 or Windows 8 (91%), Microsoft Windows 7 or Windows Server 2008 R2 (91%), Microsoft Windows Server 2008 (91%), Microsoft Windows 7 Professional or Windows 8 (91%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/16%OT=80%CT=1%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E41965%P=x86_64-pc-linux-gnu)
SEQ(SP=100%GCD=1%ISR=106%TS=7)
OPS(O1=M506NW8ST11%O2=M506NW8ST11%O3=M506NW8NNT11%O4=M506NW8ST11%O5=M506NW8ST11%O6=M506ST11)
WIN(W1=2000%W2=2000%W3=2000%W4=2000%W5=2000%W6=2000)
ECN(R=Y%DF=Y%TG=80%W=2000%O=M506NW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=80%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Uptime guess: 0.002 days (since Sun Jan 16 08:08:14 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=256 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: Host: KEVIN; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: 2h00m01s, deviation: 4h00m00s, median: 0s
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
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 27555/tcp): CLEAN (Couldn't connect)
|   Check 2 (port 55033/tcp): CLEAN (Couldn't connect)
|   Check 3 (port 26442/udp): CLEAN (Timeout)
|   Check 4 (port 40304/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Windows 7 Ultimate N 7600 (Windows 7 Ultimate N 6.1)
|   OS CPE: cpe:/o:microsoft:windows_7::-
|   Computer name: kevin
|   NetBIOS computer name: KEVIN\x00
|   Workgroup: WORKGROUP\x00
|_  System time: 2022-01-16T05:10:46-08:00
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-16T13:10:46
|_  start_date: 2022-01-16T13:08:28

TRACEROUTE (using port 110/tcp)
HOP RTT       ADDRESS
1   263.92 ms 192.168.49.1
2   264.21 ms 192.168.225.45

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 08:11:01 2022 -- 1 IP address (1 host up) scanned in 113.13 seconds

```
