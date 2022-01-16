```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/_full_tcp_nmap.xml" 192.168.225.96
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/_full_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 09:30:09 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Metallus/results/192.168.225.96/scans/xml/_full_tcp_nmap.xml" 192.168.225.96
Nmap scan report for 192.168.225.96
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-16 09:30:11 EST for 825s
Not shown: 65518 filtered ports
Reason: 65518 no-responses
PORT      STATE SERVICE       REASON          VERSION
135/tcp   open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp   open  microsoft-ds? syn-ack ttl 127
5040/tcp  open  unknown       syn-ack ttl 127
12000/tcp open  tcpwrapped    syn-ack ttl 127
22222/tcp open  ssh           syn-ack ttl 127 OpenSSH for_Windows_8.1 (protocol 2.0)
| ssh-hostkey: 
|   3072 e5:92:a8:a8:57:16:73:42:1a:9b:c2:f2:e3:bd:8a:76 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDPRX/k9OawrX2MoDMvpP4AxvlThR+kYfdnKc5cAG1+U8UMoQkVJHlXZtFeFaaCSydgVbydrVQsgsS4IVyo2Fzpb6PM51PIySCrpAjTRum5042XEyO1JaeRHhwM9mP8WRhUl9qvfog58wGnkjqxe9WAgQ3p8SvCPj/uiwIf0sjBQKIb/Adc8nJZNN1RNaFGckd/RAfVbI1YPPu7bG3M2JV9OQg9Pcwf+w458DMQ4XeZzk55VE1WIXSSU9q9OQI/zeRBsyot6LsoSSx1TKl7GFa96DJ7xpsQUrRa31CIrZ81646zX0opA5dNZ5CkhouWCF/4Ja1rR5V9bSnvuoOvW6KO88ICzJRGwd7KhiEf00K5XCpSQr4zPvqHpKoK9yATYRZ9ZE63AuJkBKlMMoqtYbIyHmYPykhkVdPPLviA2+613hryu5PGv36bl6TmTPyi3z9W4ufM1X6zv4DjpyhDIhDEfP8QkvFLaYD8YS5bKvPzu4tNh3lTjqIE2gmWaWjHaik=
|   256 71:16:46:72:7a:05:c9:77:4e:c5:96:43:96:31:a6:12 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBJP6P3lKM0ZhbP6fzT5Xsva0PlhH5/9T7Um8xVANBO9d7/BXky0IQE0bLDwVUtIZFCsCNumHea2+WFTh5kMnVas=
|   256 e3:42:cf:ff:ba:71:ff:27:09:fa:4d:d5:52:99:59:9c (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIKYI1DU4WSTpKHDyonGLO6VQlMHtmxaEDAH4+4It1CbA
49664/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49665/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49666/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49667/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49668/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49669/tcp open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
49670/tcp open  tcpwrapped    syn-ack ttl 127
49693/tcp open  tcpwrapped    syn-ack ttl 127
49718/tcp open  tcpwrapped    syn-ack ttl 127
49796/tcp open  tcpwrapped    syn-ack ttl 127
49797/tcp open  tcpwrapped    syn-ack ttl 127
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|2008|7 (89%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_server_2008::sp1 cpe:/o:microsoft:windows_server_2008:r2 cpe:/o:microsoft:windows_7
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (89%), Microsoft Windows Server 2008 SP1 or Windows Server 2008 R2 (85%), Microsoft Windows 7 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/16%OT=135%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E42F2C%P=x86_64-pc-linux-gnu)
SEQ(SP=104%GCD=1%ISR=108%TI=I%II=I%SS=S%TS=U)
OPS(O1=M506NW8NNS%O2=M506NW8NNS%O3=M506NW8%O4=M506NW8NNS%O5=M506NW8NNS%O6=M506NNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M506NW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=260 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: 0s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 58981/tcp): CLEAN (Timeout)
|   Check 2 (port 20165/tcp): CLEAN (Timeout)
|   Check 3 (port 40224/udp): CLEAN (Timeout)
|   Check 4 (port 35321/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-16T14:43:21
|_  start_date: N/A

TRACEROUTE (using port 139/tcp)
HOP RTT       ADDRESS
1   244.08 ms 192.168.49.1
2   244.11 ms 192.168.225.96

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 09:43:56 2022 -- 1 IP address (1 host up) scanned in 827.94 seconds

```
