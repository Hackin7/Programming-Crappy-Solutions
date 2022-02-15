```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/root/autorecon/results/192.168.58.70/scans/_quick_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/xml/_quick_tcp_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/_quick_tcp_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/_quick_tcp_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:45:03 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN /root/autorecon/results/192.168.58.70/scans/_quick_tcp_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/xml/_quick_tcp_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:45:05 +08 for 66s
Not shown: 995 filtered tcp ports (no-response)
PORT     STATE SERVICE       REASON          VERSION
80/tcp   open  http          syn-ack ttl 127 Microsoft IIS httpd 10.0
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
|_http-title: Plantronics
|_http-favicon: Unknown favicon MD5: 90D5B70E85D458B702B52546F1847EAA
|_http-server-header: Microsoft-IIS/10.0
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds  syn-ack ttl 127 Microsoft Windows Server 2008 R2 - 2012 microsoft-ds
3389/tcp open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| rdp-ntlm-info: 
|   Target_Name: MEATHEAD
|   NetBIOS_Domain_Name: MEATHEAD
|   NetBIOS_Computer_Name: MEATHEAD
|   DNS_Domain_Name: Meathead
|   DNS_Computer_Name: Meathead
|   Product_Version: 10.0.17763
|_  System_Time: 2022-01-19T10:44:32+00:00
| ssl-cert: Subject: commonName=Meathead
| Issuer: commonName=Meathead
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-01-18T10:41:20
| Not valid after:  2022-07-20T10:41:20
| MD5:   668e 8b8b f3e7 32ef 93ca f885 ddd7 5fa6
| SHA-1: b035 d5e7 f280 e1d4 12ef 901f d103 86ee 2c1f e22b
| -----BEGIN CERTIFICATE-----
| MIIC1DCCAbygAwIBAgIQYdkV95O98ZNF04ZHA9xQBDANBgkqhkiG9w0BAQsFADAT
| MREwDwYDVQQDEwhNZWF0aGVhZDAeFw0yMjAxMTgxMDQxMjBaFw0yMjA3MjAxMDQx
| MjBaMBMxETAPBgNVBAMTCE1lYXRoZWFkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAuot5cOZhIKcWnMHD0cpDNB21ZzfeHYHewEjhNztYGQKexLL3fS6K
| qmX/kzQLfCkDUrO6kdYAbAR2l05VK/crE2l7wtgbJkjs1GBrKBddBnqd5Iar8gfH
| 380GMf02XiuAjlzUVIK43QHqKfgfBwSRx71CqkOe/JxiLB8rsJHBmqS3Ql+yJH1C
| QE9p+Z+d80iteK4mGVGtBtY6qr8T82gM+LbF2vFyldihBALLFjyWcrCloc/f0JDj
| lG6s6IETB1a3oWWn7W6uCwszTDmhJzkrlnTuoWJPzZqZJVCGVsCzLyLIdZQD67Qm
| 4KH34TTGcHYN075FD2KBGSAVo4g6q8DxUQIDAQABoyQwIjATBgNVHSUEDDAKBggr
| BgEFBQcDATALBgNVHQ8EBAMCBDAwDQYJKoZIhvcNAQELBQADggEBADH6No8r1JEZ
| 0/c9D0Qyz2z0M83KWAymCczlYQa1nnu9P8JuCxa1J7cSGx5pnfCy8+N2A0BdK+6d
| qoOsvXhLZmIftpb+1PfAskBb7SXfmvu3xdACzOAIhnO9WAKGegUpz1YPx85/6urb
| ZtxHprqH5G+qa7nXbZ2YRHheop+V3m+v4YwimcRikpAi/19V7kV1d8YRbn378/zB
| Iq3rhlSnvQkeIGFgBJ3XxCTlj9cgC8BJgC48gfZZ3GaZ+DrZgBFPQNxEFZxB3Z0t
| IrBlu5oydIbXZYTaVEWBgup/uCecctlfmLyYXanChKPtf58F/PXDLkv+IHmUcGiV
| h3Ir03Pl8oQ=
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-19T10:45:11+00:00; -1m00s from scanner time.
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/19%OT=80%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E7EBF3%P=x86_64-pc-linux-gnu)
SEQ(SP=FF%GCD=1%ISR=10E%TI=I%II=I%SS=S%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=Y%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=255 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: OSs: Windows, Windows Server 2008 R2 - 2012; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: -59s, deviation: 0s, median: -1m00s
| smb2-time: 
|   date: 2022-01-19T10:44:32
|_  start_date: N/A
| smb2-security-mode: 
|   3.1.1: 
|_    Message signing enabled but not required
| smb-security-mode: 
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 27462/tcp): CLEAN (Timeout)
|   Check 2 (port 41691/tcp): CLEAN (Timeout)
|   Check 3 (port 13470/udp): CLEAN (Timeout)
|   Check 4 (port 23675/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked

TRACEROUTE (using port 80/tcp)
HOP RTT       ADDRESS
1   170.04 ms 192.168.49.1
2   170.07 ms 192.168.58.70

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:46:11 2022 -- 1 IP address (1 host up) scanned in 68.15 seconds

```
