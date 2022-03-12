# Oh My Webserver

```bash
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -sV -A -O -T4  10.10.35.31 -v --min-rate=100 -Pn
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-03-10 09:48 EST
NSE: Loaded 153 scripts for scanning.
NSE: Script Pre-scanning.
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Initiating Parallel DNS resolution of 1 host. at 09:48
Completed Parallel DNS resolution of 1 host. at 09:48, 0.00s elapsed
Initiating SYN Stealth Scan at 09:48
Scanning 10.10.35.31 [1000 ports]
Discovered open port 22/tcp on 10.10.35.31
Discovered open port 80/tcp on 10.10.35.31
Completed SYN Stealth Scan at 09:48, 13.52s elapsed (1000 total ports)
Initiating Service scan at 09:48
Scanning 2 services on 10.10.35.31
Completed Service scan at 09:48, 6.59s elapsed (2 services on 1 host)
Initiating OS detection (try #1) against 10.10.35.31
Retrying OS detection (try #2) against 10.10.35.31
Initiating Traceroute at 09:48
Completed Traceroute at 09:48, 0.36s elapsed
Initiating Parallel DNS resolution of 2 hosts. at 09:48
Completed Parallel DNS resolution of 2 hosts. at 09:48, 0.03s elapsed
NSE: Script scanning 10.10.35.31.
Initiating NSE at 09:48
Completed NSE at 09:48, 9.68s elapsed
Initiating NSE at 09:48
Completed NSE at 09:48, 1.21s elapsed
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Nmap scan report for 10.10.35.31
Host is up (0.31s latency).
Not shown: 998 filtered ports
PORT   STATE SERVICE VERSION
22/tcp open  ssh     OpenSSH 8.2p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   3072 e0:d1:88:76:2a:93:79:d3:91:04:6d:25:16:0e:56:d4 (RSA)
|   256 91:18:5c:2c:5e:f8:99:3c:9a:1f:04:24:30:0e:aa:9b (ECDSA)
|_  256 d1:63:2a:36:dd:94:cf:3c:57:3e:8a:e8:85:00:ca:f6 (ED25519)
80/tcp open  http    Apache httpd 2.4.49 ((Unix))
|_http-favicon: Unknown favicon MD5: 02FD5D10B62C7BC5AD03F8B0F105323C
| http-methods: 
|   Supported Methods: POST OPTIONS HEAD GET TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.49 (Unix)
|_http-title: Consult - Business Consultancy Agency Template | Home
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Aggressive OS guesses: Crestron XPanel control system (90%), ASUS RT-N56U WAP (Linux 3.4) (87%), Linux 3.1 (87%), Linux 3.16 (87%), Linux 3.2 (87%), HP P2000 G3 NAS device (87%), AXIS 210A or 211 Network Camera (Linux 2.6.17) (87%), Adtran 424RG FTTH gateway (86%), Linux 2.6.32 (86%), Linux 2.6.32 - 3.1 (86%)
No exact OS matches for host (test conditions non-ideal).
Uptime guess: 40.108 days (since Sat Jan 29 07:13:05 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=259 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   281.81 ms 10.8.0.1
2   353.02 ms 10.10.35.31

NSE: Script Post-scanning.
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Initiating NSE at 09:48
Completed NSE at 09:48, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 38.13 seconds
           Raw packets sent: 2084 (95.308KB) | Rcvd: 119 (30.730KB)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


```bash
```