```bash
nmap -vv --reason -Pn -T4 -sV -p 139 --script="banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.161.116
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/tcp_139_smb_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/tcp_139_smb_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 10:53:04 2022 as: nmap -vv --reason -Pn -T4 -sV -p 139 "--script=banner,(nbstat or smb* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/tcp_139_smb_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp139/xml/tcp_139_smb_nmap.xml" 192.168.161.116
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-13 10:53:08 EST for 391s

PORT    STATE SERVICE     REASON         VERSION
139/tcp open  netbios-ssn syn-ack ttl 63 Samba smbd 4.10.4 (workgroup: SAMBA)
Service Info: Host: CASSIOS

Host script results:
| smb-enum-domains: 
|   CASSIOS
|     Groups: n/a
|     Users: n/a
|     Creation time: unknown
|     Passwords: min length: 5; min age: n/a days; max age: n/a days; history: n/a passwords
|     Account lockout disabled
|   Builtin
|     Groups: n/a
|     Users: n/a
|     Creation time: unknown
|     Passwords: min length: 5; min age: n/a days; max age: n/a days; history: n/a passwords
|_    Account lockout disabled
| smb-enum-sessions: 
|_  <nobody>
| smb-enum-shares: 
|   account_used: <blank>
|   \\192.168.161.116\IPC$: 
|     Type: STYPE_IPC_HIDDEN
|     Comment: IPC Service (Samba 4.10.4)
|     Users: 5
|     Max Users: <unlimited>
|     Path: C:\tmp
|     Anonymous access: READ/WRITE
|   \\192.168.161.116\Samantha Konstan: 
|     Type: STYPE_DISKTREE
|     Comment: Backups and Recycler files
|     Users: 1
|     Max Users: <unlimited>
|     Path: C:\home\samantha\backups
|     Anonymous access: READ/WRITE
|   \\192.168.161.116\print$: 
|     Type: STYPE_DISKTREE
|     Comment: Printer Drivers
|     Users: 0
|     Max Users: <unlimited>
|     Path: C:\var\lib\samba\drivers
|_    Anonymous access: <none>
| smb-ls: Volume \\192.168.161.116\Samantha Konstan
|   maxfiles limit reached (10)
| SIZE   TIME                 FILENAME
| <DIR>  2022-02-13T16:02:23  .
| <DIR>  2020-09-24T17:38:10  ..
| 0      2020-09-24T01:35:15  recycler.ser
| 478    2020-09-24T17:32:50  readme.txt
| <DIR>  2020-09-24T17:36:11  spring-mvc-quickstart-archetype
| 4778   2020-09-24T17:35:01  spring-mvc-quickstart-archetype\README.md
| 774    2020-09-24T17:35:01  spring-mvc-quickstart-archetype\archetype-catalog.xml
| <DIR>  2020-09-24T17:35:01  spring-mvc-quickstart-archetype\src
| 1732   2020-09-24T17:36:11  spring-mvc-quickstart-archetype\pom.xml
| <DIR>  2020-09-24T17:37:09  thymeleafexamples-layouts
|_
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.10.4)
|   Computer name: cassios
|   NetBIOS computer name: CASSIOS\x00
|   Domain name: \x00
|   FQDN: cassios
|_  System time: 2022-02-13T10:59:31-05:00
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
|   account_used: guest
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
|   date: 2022-02-13T15:59:32
|_  start_date: N/A

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 10:59:39 2022 -- 1 IP address (1 host up) scanned in 395.16 seconds

```
