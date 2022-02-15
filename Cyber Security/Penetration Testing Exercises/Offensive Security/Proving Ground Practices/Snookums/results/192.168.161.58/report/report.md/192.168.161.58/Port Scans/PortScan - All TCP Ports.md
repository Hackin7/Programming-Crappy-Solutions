```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/xml/_full_tcp_nmap.xml" 192.168.161.58
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_full_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 06:16:14 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/xml/_full_tcp_nmap.xml" 192.168.161.58
Nmap scan report for 192.168.161.58
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-13 06:16:15 EST for 387s
Not shown: 65527 filtered ports
Reason: 65527 no-responses
PORT      STATE SERVICE     REASON         VERSION
21/tcp    open  ftp         syn-ack ttl 63 vsftpd 3.0.2
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
|      At session startup, client count was 4
|      vsFTPd 3.0.2 - secure, fast, stable
|_End of status
22/tcp    open  ssh         syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 4a:79:67:12:c7:ec:13:3a:96:bd:d3:b4:7c:f3:95:15 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCtUk/m8ssh+nfn52VkolWbpJihGyH2vdELXJv/X0HIj5hbkXnM1QgSSKltTq+cev1QtkrwtUTV3j2AD5Ftxz7ivrm0PvsGNI6QGnIxdAwCvt1OjDHoz6IGDS4kz5IcW3Q3SmwceCwDKPA55mupKhKlKjkZyLn4+d9An50AV1Hyj+E8APALHQBQFVp7cdJe9lqj7K8dxNVo1XExUDgU3trRSGDO5bZN7C57VsHXN6MIITU9RtyMhLbxYwA6KTU8RluW1/5v7T4EnHlRZcdmbneVcefK+EK69Mgdn5L+ww/5YrWiYbXDOUTEymWfeyoOl2LoFBD/nmSb9hayKirR4guf
|   256 a8:a3:a7:88:cf:37:27:b5:4d:45:13:79:db:d2:ba:cb (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBOk5HGeIHhlXkWc9v507Ap0zc5wnKxhGa7WG9fWJhL/yr9bveHEBZllHErnP6vaWM4WRudCxA6z6rqnhep9wNW8=
|   256 f2:07:13:19:1f:29:de:19:48:7c:db:45:99:f9:cd:3e (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIDvde70kt/TjqXRmChJ0XvKYTpljMNu6TKlAtF/S4IHL
80/tcp    open  http        syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS) PHP/5.4.16)
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.6 (CentOS) PHP/5.4.16
|_http-title: Simple PHP Photo Gallery
111/tcp   open  rpcbind     syn-ack ttl 63 2-4 (RPC #100000)
| rpcinfo: 
|   program version    port/proto  service
|   100000  2,3,4        111/tcp   rpcbind
|   100000  2,3,4        111/udp   rpcbind
|   100000  3,4          111/tcp6  rpcbind
|_  100000  3,4          111/udp6  rpcbind
139/tcp   open  netbios-ssn syn-ack ttl 63 Samba smbd 3.X - 4.X (workgroup: SAMBA)
445/tcp   open  netbios-ssn syn-ack ttl 63 Samba smbd 4.10.4 (workgroup: SAMBA)
3306/tcp  open  mysql       syn-ack ttl 63 MySQL (unauthorized)
33060/tcp open  socks5      syn-ack ttl 63
| fingerprint-strings: 
|   DNSStatusRequestTCP, LDAPSearchReq, NotesRPC, SSLSessionReq, TLSSessionReq, X11Probe: 
|     Invalid message"
|     HY000
|   Radmin: 
|     authentication.mechanisms
|     MYSQL41
|     SHA256_MEMORY
|     doc.formats
|     text
|     client.interactive
|     compression
|     algorithm
|     deflate_stream
|     lz4_message
|     zstd_stream
|     node_type
|     mysql
|_    client.pwd_expire_ok
| socks-auth-info: 
|   No authentication
|   No authentication
|_  No authentication
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port33060-TCP:V=7.91%I=9%D=2/13%Time=6208E96F%P=x86_64-pc-linux-gnu%r(N
SF:ULL,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(GenericLines,9,"\x05\0\0\0\x0b\
SF:x08\x05\x1a\0")%r(GetRequest,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(HTTPOp
SF:tions,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(RTSPRequest,9,"\x05\0\0\0\x0b
SF:\x08\x05\x1a\0")%r(RPCCheck,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(DNSVers
SF:ionBindReqTCP,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(DNSStatusRequestTCP,2
SF:B,"\x05\0\0\0\x0b\x08\x05\x1a\0\x1e\0\0\0\x01\x08\x01\x10\x88'\x1a\x0fI
SF:nvalid\x20message\"\x05HY000")%r(Hello,9,"\x05\0\0\0\x0b\x08\x05\x1a\0"
SF:)%r(Help,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(SSLSessionReq,2B,"\x05\0\0
SF:\0\x0b\x08\x05\x1a\0\x1e\0\0\0\x01\x08\x01\x10\x88'\x1a\x0fInvalid\x20m
SF:essage\"\x05HY000")%r(TerminalServerCookie,9,"\x05\0\0\0\x0b\x08\x05\x1
SF:a\0")%r(TLSSessionReq,2B,"\x05\0\0\0\x0b\x08\x05\x1a\0\x1e\0\0\0\x01\x0
SF:8\x01\x10\x88'\x1a\x0fInvalid\x20message\"\x05HY000")%r(SSLv23SessionRe
SF:q,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(Kerberos,9,"\x05\0\0\0\x0b\x08\x0
SF:5\x1a\0")%r(SMBProgNeg,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(X11Probe,2B,
SF:"\x05\0\0\0\x0b\x08\x05\x1a\0\x1e\0\0\0\x01\x08\x01\x10\x88'\x1a\x0fInv
SF:alid\x20message\"\x05HY000")%r(FourOhFourRequest,9,"\x05\0\0\0\x0b\x08\
SF:x05\x1a\0")%r(LPDString,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(LDAPSearchR
SF:eq,2B,"\x05\0\0\0\x0b\x08\x05\x1a\0\x1e\0\0\0\x01\x08\x01\x10\x88'\x1a\
SF:x0fInvalid\x20message\"\x05HY000")%r(LDAPBindReq,9,"\x05\0\0\0\x0b\x08\
SF:x05\x1a\0")%r(SIPOptions,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(LANDesk-RC
SF:,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(TerminalServer,9,"\x05\0\0\0\x0b\x
SF:08\x05\x1a\0")%r(NCP,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(NotesRPC,2B,"\
SF:x05\0\0\0\x0b\x08\x05\x1a\0\x1e\0\0\0\x01\x08\x01\x10\x88'\x1a\x0fInval
SF:id\x20message\"\x05HY000")%r(DistCCD,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%
SF:r(JavaRMI,9,"\x05\0\0\0\x0b\x08\x05\x1a\0")%r(Radmin,15D,"\x05\0\0\0\x0
SF:b\x08\x05\x1a\0P\x01\0\0\x02\n\x0f\n\x03tls\x12\x08\x08\x01\x12\x04\x08
SF:\x07@\0\nM\n\x19authentication\.mechanisms\x120\x08\x03\",\n\x11\x08\x0
SF:1\x12\r\x08\x08J\t\n\x07MYSQL41\n\x17\x08\x01\x12\x13\x08\x08J\x0f\n\rS
SF:HA256_MEMORY\n\x1d\n\x0bdoc\.formats\x12\x0e\x08\x01\x12\n\x08\x08J\x06
SF:\n\x04text\n\x1e\n\x12client\.interactive\x12\x08\x08\x01\x12\x04\x08\x
SF:07@\0\nn\n\x0bcompression\x12_\x08\x02\x1a\[\nY\n\talgorithm\x12L\x08\x
SF:03\"H\n\x18\x08\x01\x12\x14\x08\x08J\x10\n\x0edeflate_stream\n\x15\x08\
SF:x01\x12\x11\x08\x08J\r\n\x0blz4_message\n\x15\x08\x01\x12\x11\x08\x08J\
SF:r\n\x0bzstd_stream\n\x1c\n\tnode_type\x12\x0f\x08\x01\x12\x0b\x08\x08J\
SF:x07\n\x05mysql\n\x20\n\x14client\.pwd_expire_ok\x12\x08\x08\x01\x12\x04
SF:\x08\x07@\0");
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 3.X|4.X|5.X (91%)
OS CPE: cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:4.4 cpe:/o:linux:linux_kernel:5.1
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 3.10 - 3.12 (91%), Linux 4.4 (91%), Linux 4.9 (91%), Linux 3.10 (86%), Linux 3.10 - 3.16 (86%), Linux 4.0 (86%), Linux 3.10 - 4.11 (85%), Linux 3.11 - 4.1 (85%), Linux 3.18 (85%), Linux 3.2 - 4.9 (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/13%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=6208EA02%P=x86_64-pc-linux-gnu)
SEQ(SP=101%GCD=1%ISR=10A%TI=Z%TS=A)
SEQ(SP=102%GCD=1%ISR=10A%TI=Z%II=I%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.006 days (since Sun Feb 13 06:14:27 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=258 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host: SNOOKUMS; OS: Unix

Host script results:
|_clock-skew: mean: 1h45m55s, deviation: 2h53m14s, median: 5m53s
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
|_  System time: 2022-02-13T06:27:57-05:00
| smb-security-mode: 
|   account_used: guest
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-13T11:27:58
|_  start_date: N/A

TRACEROUTE (using port 21/tcp)
HOP RTT       ADDRESS
1   173.04 ms 192.168.49.1
2   172.57 ms 192.168.161.58

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 06:22:42 2022 -- 1 IP address (1 host up) scanned in 388.05 seconds

```
