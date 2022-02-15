```bash
nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:46:12 2022 as: nmap -vv --reason -Pn -T4 -sV -p 445 "--script=banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN /root/autorecon/results/192.168.58.70/scans/tcp445/tcp_445_smb_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp445/xml/tcp_445_smb_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:46:21 +08 for 51s

PORT    STATE SERVICE      REASON          VERSION
445/tcp open  microsoft-ds syn-ack ttl 127 Microsoft Windows Server 2008 R2 - 2012 microsoft-ds
|_smb-enum-services: ERROR: Script execution failed (use -d to debug)
Service Info: OS: Windows Server 2008 R2 - 2012; CPE: cpe:/o:microsoft:windows

Host script results:
|_smb-vuln-ms10-061: No accounts left to try
| smb2-security-mode: 
|   3.1.1: 
|_    Message signing enabled but not required
| smb-mbenum: 
|_  ERROR: Failed to connect to browser service: No accounts left to try
| smb2-time: 
|   date: 2022-01-19T10:45:39
|_  start_date: N/A
| smb2-capabilities: 
|   2.0.2: 
|     Distributed File System
|   2.1: 
|     Distributed File System
|     Leasing
|     Multi-credit operations
|   3.0: 
|     Distributed File System
|     Leasing
|     Multi-credit operations
|   3.0.2: 
|     Distributed File System
|     Leasing
|     Multi-credit operations
|   3.1.1: 
|     Distributed File System
|     Leasing
|_    Multi-credit operations
| smb-security-mode: 
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
|_smb-print-text: false
| smb-protocols: 
|   dialects: 
|     NT LM 0.12 (SMBv1) [dangerous, but default]
|     2.0.2
|     2.1
|     3.0
|     3.0.2
|_    3.1.1

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:47:12 2022 -- 1 IP address (1 host up) scanned in 60.16 seconds

```
