```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/root/autorecon/results/192.168.58.70/scans/_full_tcp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/xml/_full_tcp_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/_full_tcp_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/_full_tcp_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:45:03 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN /root/autorecon/results/192.168.58.70/scans/_full_tcp_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/xml/_full_tcp_nmap.xml 192.168.58.70
adjust_timeouts2: packet supposedly had rtt of -82343 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -82343 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81840 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81840 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -131627 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -131627 microseconds.  Ignoring time.
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:45:06 +08 for 290s
Not shown: 65527 filtered tcp ports (no-response)
PORT     STATE SERVICE       REASON          VERSION
80/tcp   open  http          syn-ack ttl 127 Microsoft IIS httpd 10.0
|_http-server-header: Microsoft-IIS/10.0
|_http-title: Plantronics
|_http-favicon: Unknown favicon MD5: 90D5B70E85D458B702B52546F1847EAA
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds  syn-ack ttl 127 Microsoft Windows Server 2008 R2 - 2012 microsoft-ds
1221/tcp open  ftp           syn-ack ttl 127 Microsoft ftpd
| ftp-syst: 
|_  SYST: Windows_NT
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
| 04-27-20  07:02PM                18866 Elementum Supremum.docx
| 04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
| 04-27-20  07:02PM                15690 img.jpg
| 04-27-20  07:02PM                  302 MSSQL_BAK.rar
| 04-27-20  07:02PM                  548 palindromes.txt
|_04-27-20  07:02PM                45369 server.jpg
1435/tcp open  ms-sql-s      syn-ack ttl 127 Microsoft SQL Server 2017 14.00.1000
| ms-sql-ntlm-info: 
|   Target_Name: MEATHEAD
|   NetBIOS_Domain_Name: MEATHEAD
|   NetBIOS_Computer_Name: MEATHEAD
|   DNS_Domain_Name: Meathead
|   DNS_Computer_Name: Meathead
|_  Product_Version: 10.0.17763
| ssl-cert: Subject: commonName=SSL_Self_Signed_Fallback
| Issuer: commonName=SSL_Self_Signed_Fallback
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-07-26T13:55:23
| Not valid after:  2051-07-26T13:55:23
| MD5:   869d f4c0 7a1f f0c7 c08a 13d3 227e c03d
| SHA-1: 9f69 5909 814d b050 2238 195e 5a43 3237 efca 83b8
| -----BEGIN CERTIFICATE-----
| MIIDADCCAeigAwIBAgIQRRCh51/HjIxHGVXv1zeyAzANBgkqhkiG9w0BAQsFADA7
| MTkwNwYDVQQDHjAAUwBTAEwAXwBTAGUAbABmAF8AUwBpAGcAbgBlAGQAXwBGAGEA
| bABsAGIAYQBjAGswIBcNMjEwNzI2MTM1NTIzWhgPMjA1MTA3MjYxMzU1MjNaMDsx
| OTA3BgNVBAMeMABTAFMATABfAFMAZQBsAGYAXwBTAGkAZwBuAGUAZABfAEYAYQBs
| AGwAYgBhAGMAazCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJtNTsHs
| LbqORE3dUbeZRebZuv/ed4iyxiJ3cy/MG9rqQilwm14HlGp/24E2KjdI5iqxL1Nr
| EUUcdG0abEyA6D+YZNvzYi551FiwyYaBWJB2kaELomX6Zs/JC/wuswJNjjnKSZPx
| vCE1t4xqEXLRbZWKoQdr4KyrjLxto4HPY2VrlVocmxg9zagyVFtfhWG5h7N+qcCK
| dw1+SGplaQKMNXvOrLzghX2wb3P9ySYIbzcslKp+dt2gvwjwcPVWKledwEC3Q9+V
| sgua+z+G2nChBKhgWz8TZRX0Z/a/dkKKIOKMPGP3k5PkaJTffkiEC+SoXuFdOKdm
| 9HFluC2+moD+sR0CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEASAP/nUfhWq6WQ+Lh
| j6T/LDaGfXz5thJJvc6dmldOtBXxXGSitYliXSO+mIHcPMguJkXpaaBULSzdHpSB
| 7BmeGuOXvIABVQPyrb9J05gj7XTr8eH6twAZROy0ta9rF0vzMWGnR0ED3kOc0xlh
| MTU5Mi7hZTYMFcH5p6srCh/Le/dh+mJfk/mvGE/EOxufhBha3J+bBiX3KIrEHxTd
| LLe6Xd4g+Nzt9FHv6LzBf0NDK+d/SrsDxuAnQiFC/5TdvqdgkLRQuzSO8UNyv93C
| emyE0Jw9s1S8eB/kVTidD1UYo7FANr4USlALfL9D0+XJqbnXziMTfz58s75d6Sfm
| AyCJ3A==
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-19T10:48:55+00:00; -1m00s from scanner time.
3389/tcp open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
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
|_ssl-date: 2022-01-19T10:48:55+00:00; -59s from scanner time.
| rdp-ntlm-info: 
|   Target_Name: MEATHEAD
|   NetBIOS_Domain_Name: MEATHEAD
|   NetBIOS_Computer_Name: MEATHEAD
|   DNS_Domain_Name: Meathead
|   DNS_Computer_Name: Meathead
|   Product_Version: 10.0.17763
|_  System_Time: 2022-01-19T10:48:16+00:00
5985/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Not Found
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/19%OT=80%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E7ECD4%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=109%TS=U)
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
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OSs: Windows, Windows Server 2008 R2 - 2012; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: -59s, deviation: 0s, median: -1m00s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 27462/tcp): CLEAN (Timeout)
|   Check 2 (port 41691/tcp): CLEAN (Timeout)
|   Check 3 (port 13470/udp): CLEAN (Timeout)
|   Check 4 (port 23675/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-security-mode: 
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-time: 
|   date: 2022-01-19T10:48:18
|_  start_date: N/A
| smb2-security-mode: 
|   3.1.1: 
|_    Message signing enabled but not required

TRACEROUTE (using port 445/tcp)
HOP RTT       ADDRESS
1   171.22 ms 192.168.49.1
2   171.20 ms 192.168.58.70

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:49:56 2022 -- 1 IP address (1 host up) scanned in 293.30 seconds

```
