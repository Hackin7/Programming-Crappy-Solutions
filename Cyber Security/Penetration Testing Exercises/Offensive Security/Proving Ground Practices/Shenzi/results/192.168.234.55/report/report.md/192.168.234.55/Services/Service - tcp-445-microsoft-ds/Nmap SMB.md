```bash
nmap -vv --reason -Pn -T4 -sV -p 445 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.234.55
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/tcp_445_smb_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/tcp_445_smb_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Jan 24 09:38:26 2022 as: nmap -vv --reason -Pn -T4 -sV -p 445 "--script=banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/tcp_445_smb_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp445/xml/tcp_445_smb_nmap.xml" 192.168.234.55
Nmap scan report for 192.168.234.55
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-24 09:38:28 EST for 66s

PORT    STATE SERVICE       REASON          VERSION
445/tcp open  microsoft-ds? syn-ack ttl 127
|_smb-enum-services: ERROR: Script execution failed (use -d to debug)

Host script results:
| smb-mbenum: 
|_  ERROR: Failed to connect to browser service: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
|_smb-print-text: false
| smb-protocols: 
|   dialects: 
|     2.02
|     2.10
|     3.00
|     3.02
|_    3.11
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
| smb2-capabilities: 
|   2.02: 
|     Distributed File System
|   2.10: 
|     Distributed File System
|     Leasing
|     Multi-credit operations
|   3.00: 
|     Distributed File System
|     Leasing
|     Multi-credit operations
|   3.02: 
|     Distributed File System
|     Leasing
|     Multi-credit operations
|   3.11: 
|     Distributed File System
|     Leasing
|_    Multi-credit operations
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-24T14:38:57
|_  start_date: N/A

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 24 09:39:34 2022 -- 1 IP address (1 host up) scanned in 69.08 seconds

```
