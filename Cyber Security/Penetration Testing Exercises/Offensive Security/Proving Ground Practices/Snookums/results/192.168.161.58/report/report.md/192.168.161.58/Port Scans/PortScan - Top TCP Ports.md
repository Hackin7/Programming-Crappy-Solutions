```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/xml/_quick_tcp_nmap.xml" 192.168.161.58
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_quick_tcp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_quick_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 06:16:14 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_quick_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/xml/_quick_tcp_nmap.xml" 192.168.161.58
Nmap scan report for 192.168.161.58
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 06:16:15 EST for 70s
Not shown: 993 filtered ports
Reason: 993 no-responses
PORT     STATE SERVICE     REASON         VERSION
21/tcp   open  ftp         syn-ack ttl 63 vsftpd 3.0.2
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_Can't get directory listing: TIMEOUT
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to ::ffff:192.168.49.161
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 2
|      vsFTPd 3.0.2 - secure, fast, stable
|_End of status
22/tcp   open  ssh         syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 4a:79:67:12:c7:ec:13:3a:96:bd:d3:b4:7c:f3:95:15 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCtUk/m8ssh+nfn52VkolWbpJihGyH2vdELXJv/X0HIj5hbkXnM1QgSSKltTq+cev1QtkrwtUTV3j2AD5Ftxz7ivrm0PvsGNI6QGnIxdAwCvt1OjDHoz6IGDS4kz5IcW3Q3SmwceCwDKPA55mupKhKlKjkZyLn4+d9An50AV1Hyj+E8APALHQBQFVp7cdJe9lqj7K8dxNVo1XExUDgU3trRSGDO5bZN7C57VsHXN6MIITU9RtyMhLbxYwA6KTU8RluW1/5v7T4EnHlRZcdmbneVcefK+EK69Mgdn5L+ww/5YrWiYbXDOUTEymWfeyoOl2LoFBD/nmSb9hayKirR4guf
|   256 a8:a3:a7:88:cf:37:27:b5:4d:45:13:79:db:d2:ba:cb (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBOk5HGeIHhlXkWc9v507Ap0zc5wnKxhGa7WG9fWJhL/yr9bveHEBZllHErnP6vaWM4WRudCxA6z6rqnhep9wNW8=
|   256 f2:07:13:19:1f:29:de:19:48:7c:db:45:99:f9:cd:3e (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIDvde70kt/TjqXRmChJ0XvKYTpljMNu6TKlAtF/S4IHL
80/tcp   open  http        syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS) PHP/5.4.16)
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.6 (CentOS) PHP/5.4.16
|_http-title: Simple PHP Photo Gallery
111/tcp  open  rpcbind     syn-ack ttl 63 2-4 (RPC #100000)
| rpcinfo: 
|   program version    port/proto  service
|   100000  2,3,4        111/tcp   rpcbind
|   100000  2,3,4        111/udp   rpcbind
|   100000  3,4          111/tcp6  rpcbind
|_  100000  3,4          111/udp6  rpcbind
139/tcp  open  netbios-ssn syn-ack ttl 63 Samba smbd 3.X - 4.X (workgroup: SAMBA)
445/tcp  open  netbios-ssn syn-ack ttl 63 Samba smbd 4.10.4 (workgroup: SAMBA)
3306/tcp open  mysql       syn-ack ttl 63 MySQL (unauthorized)
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 4.X|3.X|5.X (91%)
OS CPE: cpe:/o:linux:linux_kernel:4.4 cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:5.1
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 4.4 (91%), Linux 3.10 - 3.12 (89%), Linux 4.9 (88%), Linux 3.10 - 3.16 (86%), Linux 4.0 (86%), Linux 3.10 - 4.11 (85%), Linux 3.11 - 4.1 (85%), Linux 3.2 - 4.9 (85%), Linux 5.1 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/13%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=6208E8C5%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=108%TI=Z%TS=A)
SEQ(SP=106%GCD=1%ISR=108%TI=Z%II=I%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.002 days (since Sun Feb 13 06:14:27 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host: SNOOKUMS; OS: Unix

Host script results:
|_clock-skew: mean: 1h45m54s, deviation: 2h53m14s, median: 5m53s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 20684/tcp): CLEAN (Timeout)
|   Check 2 (port 51108/tcp): CLEAN (Timeout)
|   Check 3 (port 33406/udp): CLEAN (Timeout)
|   Check 4 (port 48023/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.10.4)
|   Computer name: snookums
|   NetBIOS computer name: SNOOKUMS\x00
|   Domain name: \x00
|   FQDN: snookums
|_  System time: 2022-02-13T06:22:39-05:00
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-13T11:22:41
|_  start_date: N/A

TRACEROUTE (using port 21/tcp)
HOP RTT       ADDRESS
1   179.22 ms 192.168.49.1
2   179.56 ms 192.168.161.58

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 06:17:25 2022 -- 1 IP address (1 host up) scanned in 70.99 seconds

```