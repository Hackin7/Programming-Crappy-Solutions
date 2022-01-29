# Butch

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Jan 27 11:38:49 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Butch/results/192.168.193.63/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Butch/results/192.168.193.63/scans/xml/_full_tcp_nmap.xml" 192.168.193.63
Nmap scan report for 192.168.193.63
Host is up, received user-set (0.20s latency).
Scanned at 2022-01-27 11:38:51 EST for 359s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT     STATE SERVICE       REASON          VERSION
21/tcp   open  ftp           syn-ack ttl 127 Microsoft ftpd
| ftp-syst: 
|_  SYST: Windows_NT
25/tcp   open  smtp          syn-ack ttl 127 Microsoft ESMTP 10.0.17763.1
| smtp-commands: butch Hello [192.168.49.193], TURN, SIZE 2097152, ETRN, PIPELINING, DSN, ENHANCEDSTATUSCODES, 8bitmime, BINARYMIME, CHUNKING, VRFY, OK, 
|_ This server supports the following commands: HELO EHLO STARTTLS RCPT DATA RSET MAIL QUIT HELP AUTH TURN ETRN BDAT VRFY 
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds? syn-ack ttl 127
5985/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Not Found
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/27%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F2CC02%P=x86_64-pc-linux-gnu)
SEQ(SP=102%GCD=1%ISR=10E%TI=I%II=I%SS=S%TS=U)
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
TCP Sequence Prediction: Difficulty=258 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: Host: butch; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: -1m15s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 56406/tcp): CLEAN (Timeout)
|   Check 2 (port 31984/tcp): CLEAN (Timeout)
|   Check 3 (port 21820/udp): CLEAN (Timeout)
|   Check 4 (port 38892/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-27T16:42:55
|_  start_date: N/A

TRACEROUTE (using port 25/tcp)
HOP RTT       ADDRESS
1   209.51 ms 192.168.49.1
2   209.52 ms 192.168.193.63

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan 27 11:44:50 2022 -- 1 IP address (1 host up) scanned in 361.64 seconds

```

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -p 21,135,139,445,5985 192.168.193.63 --script vuln
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-27 18:57 EST
Nmap scan report for 192.168.193.63
Host is up (0.19s latency).

PORT     STATE SERVICE
21/tcp   open  ftp
|_sslv2-drown: 
135/tcp  open  msrpc
139/tcp  open  netbios-ssn
445/tcp  open  microsoft-ds
5985/tcp open  wsman

Host script results:
|_samba-vuln-cve-2012-1182: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR

Nmap done: 1 IP address (1 host up) scanned in 33.02 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.193.63 
Connected to 192.168.193.63.
220 Microsoft FTP Service
Name (192.168.193.63:kali): anonymous
331 Password required
Password:
530 User cannot log in.
Login failed.
Remote system type is Windows_NT.
ftp> exit
221 Goodbye.

```

# Exploitation

# Others