```bash
nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.161.58
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/tcp_139_smb_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/tcp_139_smb_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 06:17:29 2022 as: nmap -vv --reason -Pn -T4 -sV -p 139 "--script=banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.161.58
Nmap scan report for 192.168.161.58
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-13 06:17:34 EST for 385s

PORT    STATE SERVICE     REASON         VERSION
139/tcp open  netbios-ssn syn-ack ttl 63 Samba smbd 4.10.4 (workgroup: SAMBA)
Service Info: Host: SNOOKUMS

Host script results:
| smb-enum-domains: 
|   Builtin
|     Groups: n/a
|     Users: n/a
|     Creation time: unknown
|     Passwords: min length: 5; min age: n/a days; max age: n/a days; history: n/a passwords
|     Account lockout disabled
|   SNOOKUMS
|     Groups: n/a
|     Users: n/a
|     Creation time: unknown
|     Passwords: min length: 5; min age: n/a days; max age: n/a days; history: n/a passwords
|_    Account lockout disabled
| smb-enum-sessions: 
|_  <nobody>
| smb-enum-shares: 
|   account_used: <blank>
|   \\192.168.161.58\IPC$: 
|     Type: STYPE_IPC_HIDDEN
|     Comment: IPC Service (Samba 4.10.4)
|     Users: 3
|     Max Users: <unlimited>
|     Path: C:\tmp
|     Anonymous access: READ/WRITE
|   \\192.168.161.58\print$: 
|     Type: STYPE_DISKTREE
|     Comment: Printer Drivers
|     Users: 0
|     Max Users: <unlimited>
|     Path: C:\var\lib\samba\drivers
|_    Anonymous access: <none>
| smb-mbenum: 
|   DFS Root
|     SNOOKUMS  0.0  Samba 4.10.4
|   Potential Browser
|     SNOOKUMS  0.0  Samba 4.10.4
|   Print server
|     SNOOKUMS  0.0  Samba 4.10.4
|   Server
|     SNOOKUMS  0.0  Samba 4.10.4
|   Server service
|     SNOOKUMS  0.0  Samba 4.10.4
|   Unix server
|     SNOOKUMS  0.0  Samba 4.10.4
|   Windows NT/2000/XP/2003 server
|     SNOOKUMS  0.0  Samba 4.10.4
|   Workstation
|_    SNOOKUMS  0.0  Samba 4.10.4
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.10.4)
|   Computer name: snookums
|   NetBIOS computer name: SNOOKUMS\x00
|   Domain name: \x00
|   FQDN: snookums
|_  System time: 2022-02-13T06:24:07-05:00
|_smb-print-text: false
| smb-protocols: 
|   dialects: 
|     NT LM 0.12 (SMBv1) [dangerous, but default]
|     2.02
|     2.10
|     3.00
|     3.02
|_    3.11
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
|_smb-system-info: ERROR: Script execution failed (use -d to debug)
|_smb-vuln-ms10-061: false
| smb2-capabilities: 
|   2.02: 
|     Distributed File System
|   2.10: 
|     Distributed File System
|     Leasing
|   3.00: 
|     Distributed File System
|     Leasing
|   3.02: 
|     Distributed File System
|     Leasing
|   3.11: 
|     Distributed File System
|_    Leasing
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-13T11:24:02
|_  start_date: N/A

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 06:23:59 2022 -- 1 IP address (1 host up) scanned in 390.35 seconds

```