```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/xml/_full_tcp_nmap.xml" 192.168.168.129
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_full_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 09:00:30 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Malbec/results/192.168.168.129/scans/xml/_full_tcp_nmap.xml" 192.168.168.129
Increasing send delay for 192.168.168.129 from 0 to 5 due to 156 out of 389 dropped probes since last increase.
Warning: 192.168.168.129 giving up on port because retransmission cap hit (6).
Nmap scan report for 192.168.168.129
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 09:00:30 EST for 884s
Not shown: 65498 closed ports
Reason: 65498 resets
PORT      STATE    SERVICE REASON         VERSION
22/tcp    open     ssh     syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 74:ba:20:23:89:92:62:02:9f:e7:3d:3b:83:d4:d9:6c (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDGGcX/x/M6J7Y0V8EeUt0FqceuxieEOe2fUH2RsY3XiSxByQWNQi+XSrFElrfjdR2sgnauIWWhWibfD+kTmSP5gkFcaoSsLtgfMP/2G8yuxPSev+9o1N18gZchJneakItNTaz1ltG1W//qJPZDHmkDneyv798f9ZdXBzidtR5/+2ArZd64bldUxx0irH0lNcf+ICuVlhOZyXGvSx/ceMCRozZrW2JQU+WLvs49gC78zZgvN+wrAZ/3s8gKPOIPobN3ObVSkZ+zngt0Xg/Zl11LLAbyWX7TupAt6lTYOvCSwNVZURyB1dDdjlMAXqT/Ncr4LbP+tvsiI1BKlqxx4I2r
|   256 54:8f:79:55:5a:b0:3a:69:5a:d5:72:39:64:fd:07:4e (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBCpAb2jUKovAahxmPX9l95Pq9YWgXfIgDJw0obIpOjOkdP3b0ukm/mrTNgX2lg1mQBMlS3lzmQmxeyHGg9+xuJA=
|   256 7f:5d:10:27:62:ba:75:e9:bc:c8:4f:e2:72:87:d4:e2 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIE0omUJRIaMtPNYa4CKBC+XUzVyZsJ1QwsksjpA/6Ml+
2121/tcp  open     ftp     syn-ack ttl 63 pyftpdlib 1.5.6
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_-rwxrwxrwx   1 carlos   carlos     108304 Jan 25  2021 malbec.exe [NSE: writeable]
| ftp-syst: 
|   STAT: 
| FTP server status:
|  Connected to: 192.168.168.129:2121
|  Waiting for username.
|  TYPE: ASCII; STRUcture: File; MODE: Stream
|  Data connection closed.
|_End of status.
3398/tcp  filtered sapcomm no-response
3484/tcp  filtered gbs-stp no-response
6379/tcp  filtered redis   no-response
7138/tcp  open     unknown syn-ack ttl 63
8527/tcp  filtered unknown no-response
9237/tcp  filtered unknown no-response
10951/tcp filtered unknown no-response
14256/tcp filtered unknown no-response
20518/tcp filtered unknown no-response
23215/tcp filtered unknown no-response
24503/tcp filtered unknown no-response
25583/tcp filtered unknown no-response
25620/tcp filtered unknown no-response
28454/tcp filtered unknown no-response
28455/tcp filtered unknown no-response
28947/tcp filtered unknown no-response
29616/tcp filtered unknown no-response
29803/tcp filtered unknown no-response
29885/tcp filtered unknown no-response
32399/tcp filtered unknown no-response
33294/tcp filtered unknown no-response
33702/tcp filtered unknown no-response
35424/tcp filtered unknown no-response
36204/tcp filtered unknown no-response
42427/tcp filtered unknown no-response
42733/tcp filtered unknown no-response
44773/tcp filtered unknown no-response
45027/tcp filtered unknown no-response
49335/tcp filtered unknown no-response
51348/tcp filtered unknown no-response
52652/tcp filtered unknown no-response
53940/tcp filtered unknown no-response
57977/tcp filtered unknown no-response
61959/tcp filtered unknown no-response
62937/tcp filtered unknown no-response
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port7138-TCP:V=7.91%I=9%D=3/5%Time=6223705D%P=x86_64-pc-linux-gnu%r(Gen
SF:ericLines,4,"\r\n\r\n");
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.32 or 3.10 (91%), Linux 3.5 (91%), Linux 4.4 (91%), Synology DiskStation Manager 5.1 (91%), WatchGuard Fireware 11.8 (91%), Linux 2.6.35 (90%), Linux 2.6.39 (90%), Linux 3.10 - 3.12 (90%), Linux 3.4 (90%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=3/5%OT=22%CT=1%CU=37152%PV=Y%DS=2%DC=T%G=Y%TM=62237072
OS:%P=x86_64-pc-linux-gnu)SEQ(SP=100%GCD=1%ISR=108%TI=Z%II=I%TS=A)SEQ(SP=10
OS:0%GCD=1%ISR=108%TI=Z%TS=A)OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11
OS:NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)WIN(W1=FE88%W2=FE88%W3=FE8
OS:8%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
OS:T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y%
OS:T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF=N%T=40%IPL=164
OS:%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 9.167 days (since Thu Feb 24 05:14:32 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=256 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 143/tcp)
HOP RTT       ADDRESS
1   172.50 ms 192.168.49.1
2   172.66 ms 192.168.168.129

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 09:15:14 2022 -- 1 IP address (1 host up) scanned in 885.27 seconds

```
