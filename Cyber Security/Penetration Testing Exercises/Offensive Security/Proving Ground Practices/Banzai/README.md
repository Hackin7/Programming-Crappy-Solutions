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
└─$ ftp 192.168.123.56                                                                                                                                              2 ⨯
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
└─$ ssh guest@192.168.123.56                                                                                                                                      255 ⨯
guest@192.168.123.56's password: 
Permission denied, please try again.
guest@192.168.123.56's password: 

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ ssh backup@192.168.123.56                                                                                                                                     130 ⨯
backup@192.168.123.56's password: 
Permission denied, please try again.
backup@192.168.123.56's password: 

                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$             
```

## 5432 - PostgreSQL

```
┌──(kali㉿kali)-[/tmp]
└─$ psql -h 192.168.123.56 -U postgres                                                                                                                              1 ⨯
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