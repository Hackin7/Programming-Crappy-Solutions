# Enumeration

## nmap Scan

```bash
# Nmap 7.91 scan initiated Sat Oct 29 05:42:40 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN /home/kali/results/18.140.115.167/scans/_full_tcp_nmap.txt -oX /home/kali/results/18.140.115.167/scans/xml/_full_tcp_nmap.xml 18.140.115.167
adjust_timeouts2: packet supposedly had rtt of -606040 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -606040 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -679882 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -679882 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -192762 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -192762 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -558814 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -558814 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -682744 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -682744 microseconds.  Ignoring time.
Nmap scan report for ec2-18-140-115-167.ap-southeast-1.compute.amazonaws.com (18.140.115.167)
Host is up, received user-set (0.0071s latency).
Scanned at 2022-10-29 05:42:41 EDT for 79s
Not shown: 65530 closed ports
Reason: 65530 resets
PORT     STATE    SERVICE        REASON         VERSION
22/tcp   open     ssh            syn-ack ttl 64 OpenSSH 8.2p1 Ubuntu 4ubuntu0.3 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   3072 5a:4c:54:1c:3d:a5:58:d7:44:19:4f:37:fd:a1:27:c8 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQCxdkfqGWJs7hbJClQezzwlbtL39Ok+/KxZ37HEA+/A+d8D0rBhKC1jNEHx1u0TnVYONvSNRNtw2TjlnCyqsttqFzhD6bq0zFOYZtentJp6AMkJsEDg2NpBDSDxFe9UHa5qMEqUsVCd/EmLFvs6Y5QHa8DjUwGAkLITVQL5vtfJsim7F18Quu7HAwHxuMt/Lb5WNS4/5nx5ChX1RfOaS8Gh1EnRuw24UpytD9+TjlXJMis7H+Nu+IT6NHj9/AcpvHIuh1TLg5cDsBXszEVf8Ayv8C6igBc25vKqvd2NyTANTX1Gomq2WDSSQrCMd+TTosnHNAOER7Wa6kJNnLPCcjCXCn65zMSAal9Fj/zB4VIVNz42Qgj7XUDnEhlTCHIMqBkzwp9yuuJYl21i13+mbtEx+Usz8e44B5el0muIQC6bpK7y1M6CE/kqdbOacGlKXXP8A6yX39UWoyMbx86W6qa7RUaUNmtesmdcHKXpGmxwG5opfnC9yv/jcu/NdhbcNkc=
|   256 6d:df:0a:45:3c:fd:20:79:93:15:df:12:b2:26:12:74 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBJ3TqwBIyUMPThrGL0HOql9QVP0Zd30GkHtjSWpgywFs9qMr8K7bgEiiDZ8x18CgqZhQyGWcyvfMRk1lnxCWeaI=
|   256 57:4b:1e:b2:7a:0e:0f:53:a7:dd:e9:b2:f0:c1:62:fd (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAICga0GrSw4dEpBpGnYZSIdK8+Jaeul8MIKt3jW9WBF2t
8001/tcp open     http           syn-ack ttl 64 SimpleHTTPServer 0.6 (Python 3.6.9)
|_http-generator: Hugo 0.88.1
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: SimpleHTTP/0.6 Python/3.6.9
|_http-title: Gaming PC Galor - Checkout
8002/tcp filtered teradataordbms no-response
8003/tcp open     http           syn-ack ttl 64 SimpleHTTPServer 0.6 (Python 3.6.9)
|_http-generator: Hugo 0.88.1
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-server-header: SimpleHTTP/0.6 Python/3.6.9
|_http-title: Gaming PC Galor - Reset Password
8080/tcp open     nagios-nsca    syn-ack ttl 64 Nagios NSCA
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS
|_http-open-proxy: Proxy might be redirecting requests
|_http-title: Site doesn't have a title (text/plain;charset=UTF-8).
Device type: general purpose|bridge|switch
Running (JUST GUESSING): QEMU (98%), Oracle Virtualbox (96%), Bay Networks embedded (90%), Allied Telesyn embedded (88%)
OS CPE: cpe:/a:qemu:qemu cpe:/o:oracle:virtualbox cpe:/h:baynetworks:baystack_450 cpe:/h:alliedtelesyn:at-9006
Aggressive OS guesses: QEMU user mode network gateway (98%), Oracle Virtualbox (96%), Bay Networks BayStack 450 switch (software version 3.1.0.22) (90%), Allied Telesyn AT-9006SX/SC switch (88%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=10/29%OT=22%CT=1%CU=38250%PV=N%DS=2%DC=T%G=Y%TM=635CF5
OS:E0%P=x86_64-pc-linux-gnu)SEQ(SP=2F%GCD=FA00%ISR=C2%II=I%TS=U)SEQ(SP=24%G
OS:CD=FA00%ISR=C4%CI=RD%II=I%TS=U)SEQ(SP=2B%GCD=FA00%ISR=C2%TS=U)SEQ(SP=1A%
OS:GCD=FA00%ISR=C4%TI=I%TS=U)OPS(O1=M5B4%O2=M5B4%O3=M5B4%O4=M5B4%O5=M5B4%O6
OS:=M5B4)WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FFFF)ECN(R=Y%DF=N%T
OS:G=40%W=FFFF%O=M5B4%CC=N%Q=)ECN(R=Y%DF=N%T=41%W=FFFF%O=M5B4%CC=N%Q=)T1(R=
OS:Y%DF=N%TG=40%S=O%A=S+%F=AS%RD=0%Q=)T1(R=Y%DF=N%T=41%S=O%A=S+%F=AS%RD=0%Q
OS:=)T2(R=Y%DF=N%TG=FF%W=0%S=Z%A=S%F=AR%O=%RD=0%Q=)T2(R=Y%DF=N%T=100%W=0%S=
OS:Z%A=O%F=AR%O=%RD=0%Q=)T3(R=Y%DF=N%TG=FF%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T3(
OS:R=Y%DF=N%T=100%W=0%S=Z%A=O%F=AR%O=%RD=0%Q=)T4(R=Y%DF=N%TG=FF%W=0%S=A%A=Z
OS:%F=R%O=%RD=0%Q=)T4(R=Y%DF=N%T=100%W=0%S=O%A=Z%F=R%O=%RD=0%Q=)T5(R=Y%DF=N
OS:%TG=FF%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T5(R=Y%DF=N%T=100%W=0%S=Z%A=S+%F=AR%
OS:O=%RD=0%Q=)T6(R=Y%DF=N%TG=FF%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T6(R=Y%DF=N%T=10
OS:0%W=0%S=O%A=Z%F=R%O=%RD=0%Q=)T7(R=Y%DF=N%TG=FF%W=0%S=Z%A=S%F=AR%O=%RD=0%
OS:Q=)T7(R=Y%DF=N%T=100%W=0%S=Z%A=O%F=AR%O=%RD=0%Q=)U1(R=N)U1(R=Y%DF=N%T=3F
OS:%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=S%TG=40%CD=S)
OS:IE(R=Y%DFI=S%T=3A%CD=S)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=40 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 53/tcp)
HOP RTT      ADDRESS
1   2.62 ms  10.0.3.2
2   13.35 ms ec2-18-140-115-167.ap-southeast-1.compute.amazonaws.com (18.140.115.167)

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Oct 29 05:44:00 2022 -- 1 IP address (1 host up) scanned in 80.26 seconds

```

## WebApp 0


## WebApp 1

![[Pasted image 20221029172908.png]]

## WebApp 2

```bash
[hacker@hackerbook ~]$ curl http://18.140.115.167:8080/ # api -H 'gamekey:a'
Welcome to Game Galore. Kindly send a request to '/api' with the request header of 'gamekey' to log your game keys. [hacker@hackerbook ~]$ 
[hacker@hackerbook ~]$ curl http://18.140.115.167:8080/api -H 'gamekey:a'
Your key has been logged.[hacker@hackerbook ~]$ 
```

![[Pasted image 20221029174620.png]]

# Wrong Machine lmao
## lse.sh

```bash
┌──(kali㉿kali)-[~/Documents/payloads]
└─$ scp privesc/lse.sh student@13.212.148.228:/home/student/
student@13.212.148.228's password: 
lse.sh                                                                                                                                100%   43KB   1.7MB/s   00:00    
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/payloads]
└─$ 
```

```bash
student@ip-192-168-1-33:~$ ./lse.sh 
---
If you know the current user password, write it here to check sudo privileges: password123                                                                              
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: student
     User ID: 1001
    Password: ******
        Home: /home/student
        Path: /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin
       umask: 0002

    Hostname: ip-192-168-1-33
       Linux: 5.15.0-1022-aws
Distribution: Ubuntu 20.04.3 LTS
Architecture: x86_64

==================================================================( users )=====
[i] usr000 Current user groups............................................. yes!
[*] usr010 Is current user in an administrative group?..................... nope
[*] usr020 Are there other users in administrative groups?................. yes!
[*] usr030 Other users with shell.......................................... yes!
[i] usr040 Environment information......................................... skip
[i] usr050 Groups for other users.......................................... skip                                                                                        
[i] usr060 Other users..................................................... skip                                                                                        
[*] usr070 PATH variables defined inside /etc.............................. yes!                                                                                        
[!] usr080 Is '.' in a PATH variable defined inside /etc?.................. nope
===================================================================( sudo )=====
[!] sud000 Can we sudo without a password?................................. nope
[!] sud010 Can we list sudo commands without a password?................... yes!
---
Matching Defaults entries for student on ip-192-168-1-33:
    env_reset, mail_badpass, secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin\:/snap/bin

User student may run the following commands on ip-192-168-1-33:
    (ALL : ALL) NOPASSWD: /usr/bin/nc
---
[!] sud020 Can we sudo with a password?.................................... nope
[*] sud040 Can we read sudoers files?...................................... nope
[*] sud050 Do we know if any other users used sudo?........................ yes!
============================================================( file system )=====
[*] fst000 Writable files outside user's home.............................. yes!
[*] fst010 Binaries with setuid bit........................................ yes!
[!] fst020 Uncommon setuid binaries........................................ yes!
---
/snap/snapd/14978/usr/lib/snapd/snap-confine
/snap/snapd/17336/usr/lib/snapd/snap-confine
/usr/bin/fusermount3
---
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... yes!
[*] fst090 SSH files in home directories................................... yes!
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'student' have mail?....................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'student'................................... skip
[i] fst510 SSH files anywhere.............................................. skip                                                                                        
[i] fst520 Check hosts.equiv file and its contents......................... skip                                                                                        
[i] fst530 List NFS server shares.......................................... skip                                                                                        
[i] fst540 Dump fstab file................................................. skip                                                                                        
=================================================================( system )=====                                                                                        
[i] sys000 Who is logged in................................................ skip
[i] sys010 Last logged in users............................................ skip                                                                                        
[!] sys020 Does the /etc/passwd have hashes?............................... nope                                                                                        
[!] sys022 Does the /etc/group have hashes?................................ nope
[!] sys030 Can we read shadow files?....................................... nope
[*] sys040 Check for other superuser accounts.............................. nope
[*] sys050 Can root user log in via SSH?................................... nope
[i] sys060 List available shells........................................... skip
[i] sys070 System umask in /etc/login.defs................................. skip                                                                                        
[i] sys080 System password policies in /etc/login.defs..................... skip                                                                                        
===============================================================( security )=====                                                                                        
[*] sec000 Is SELinux present?............................................. nope
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
[*] ret050 Can we write to any paths present in cron jobs.................. yes!
[!] ret060 Can we write to executable paths present in cron jobs........... nope
[i] ret400 Cron files...................................................... skip
[*] ret500 User systemd timers............................................. nope                                                                                        
[!] ret510 Can we write in any system timer?............................... nope
[i] ret900 Systemd timers.................................................. skip
================================================================( network )=====                                                                                        
[*] net000 Services listening only on localhost............................ nope
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
[*] sof030 Installed apache modules........................................ nope
[!] sof040 Found any .htpasswd files?...................................... nope
[!] sof050 Are there private keys in ssh-agent?............................ nope
[!] sof060 Are there gpg keys cached in gpg-agent?......................... nope
[!] sof070 Can we write to a ssh-agent socket?............................. nope
[!] sof080 Can we write to a gpg-agent socket?............................. yes!
---
/run/user/1001/gnupg/S.gpg-agent
/run/user/1001/gnupg/S.gpg-agent.ssh
/run/user/1001/gnupg/S.gpg-agent.extra
/run/user/1001/gnupg/S.gpg-agent.browser
---
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
student@ip-192-168-1-33:~$ 

```