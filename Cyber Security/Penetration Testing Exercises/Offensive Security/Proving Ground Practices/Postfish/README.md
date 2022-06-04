# Postfish

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
- [ ] `admin` : `admin`, `admin`:`password`, `guest`:`guest`, `backup`:`backup`
- [ ] Same as username (eg. `mario` : `mario`)
- [ ] rockyou.txt
- [ ] More

## 80 - Web
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
- [x] Look through the source code of ALL the files
 - [ ] Find all Input Fields `-> Input Fields`
 - [ ] File Uploads `-> File upload`
Directory Enumeration (dirb) `I -> Custom page/ CMS`
- [x] Sitemap (robots.txt)
- [x] Common wordlist
- [x] big wordlist
- [ ] More
Virtual Hosts Testing `I`
- [x] Given hostname - postfish.off
- [x] Hostname derived from box name - *banzai.pg* - No Diff
- [ ] More
Vulnerability Scanning `I`
- [x] Nikto Vulnerability Scanner
- [ ] More

# Enumeration

## nmap

```bash
# Nmap 7.91 scan initiated Sat Feb 19 21:31:04 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Postfish/results/192.168.140.137/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Postfish/results/192.168.140.137/scans/xml/_full_tcp_nmap.xml" 192.168.140.137
Increasing send delay for 192.168.140.137 from 0 to 5 due to 254 out of 634 dropped probes since last increase.
Nmap scan report for 192.168.140.137
Host is up, received user-set (0.17s latency).
Scanned at 2022-02-19 21:31:05 EST for 709s
Not shown: 65528 closed ports
Reason: 65528 resets
PORT    STATE SERVICE  REASON         VERSION
22/tcp  open  ssh      syn-ack ttl 63 OpenSSH 8.2p1 Ubuntu 4ubuntu0.1 (Ubuntu Linux; protocol 2.0)
| ssh-hostkey: 
|   3072 c1:99:4b:95:22:25:ed:0f:85:20:d3:63:b4:48:bb:cf (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQDH6PH1/ST7TUJ4Mp/l4c7G+TM07YbX7YIsnHzq1TRpvtiBh8MQuFkL1SWW9+za+h6ZraqoZ0ewwkH+0la436t9Q+2H/Nh4CntJOrRbpLJKg4hChjgCHd5KiLCOKHhXPs/FA3mm0Zkzw1tVJLPR6RTbIkkbQiV2Zk3u8oamV5srWIJeYUY5O2XXmTnKENfrPXeHup1+3wBOkTO4Mu17wBSw6yvXyj+lleKjQ6Hnje7KozW5q4U6ijd3LmvHE34UHq/qUbCUbiwY06N2Mj0NQiZqWW8z48eTzGsuh6u1SfGIDnCCq3sWm37Y5LIUvqAFyIEJZVsC/UyrJDPBE+YIODNbN2QLD9JeBr8P4n1rkMaXbsHGywFtutdSrBZwYuRuB2W0GjIEWD/J7lxKIJ9UxRq0UxWWkZ8s3SNqUq2enfPwQt399nigtUerccskdyUD0oRKqVnhZCjEYfX3qOnlAqejr3Lpm8nA31pp6lrKNAmQEjdSO8Jxk04OR2JBxcfVNfs=
|   256 0f:44:8b:ad:ad:95:b8:22:6a:f0:36:ac:19:d0:0e:f3 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBI0EdIHR7NOReMM0G7C8zxbLgwB3ump+nb2D3Pe3tXqp/6jNJ/GbU2e4Ab44njMKHJbm/PzrtYzojMjGDuBlQCg=
|   256 32:e1:2a:6c:cc:7c:e6:3e:23:f4:80:8d:33:ce:9b:3a (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIDCc0saExmeDXtqm5FS+D5RnDke8aJEvFq3DJIr0KZML
25/tcp  open  smtp     syn-ack ttl 63 Postfix smtpd
|_smtp-commands: postfish.off, PIPELINING, SIZE 10240000, VRFY, ETRN, STARTTLS, ENHANCEDSTATUSCODES, 8BITMIME, DSN, SMTPUTF8, CHUNKING, 
| ssl-cert: Subject: commonName=ubuntu
| Subject Alternative Name: DNS:ubuntu
| Issuer: commonName=ubuntu
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-01-26T10:26:37
| Not valid after:  2031-01-24T10:26:37
| MD5:   5376 0d7f 8cb1 2db9 fedd 1809 463e 94c2
| SHA-1: 63ab a073 44fd 01a2 489f c9a0 8f50 de80 f33c 6895
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIUGEC4bDhH06jafLyt+oBBOT7SWm0wDQYJKoZIhvcNAQEL
| BQAwETEPMA0GA1UEAwwGdWJ1bnR1MB4XDTIxMDEyNjEwMjYzN1oXDTMxMDEyNDEw
| MjYzN1owETEPMA0GA1UEAwwGdWJ1bnR1MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAxj4r7x6ucND17Gv8yE+fKOLLfePFwLvxtMSGSb/VLPMgZ42G3L5C
| pZF7+T9fGgYTMFSeJl1O/6vW8qeby8/ikCCYbO/bXRdlCPh2ROQe2O+ZfY097MyV
| 512iUWH9NWbs8lI/QnH+AIxywPhyOsGmTc+lTht2Edc4fPJaBQdjDiQyalypcm0K
| 7EOr3Q1VJmAoWietBfoaPJ7EEXLJNQEOokSP6tnOoSvV4iCyVT5RaZXsAOi4bbtR
| 4/HyZfLYqqs6fLlvlXcFF325UKYnUfSKqrYGxBZbY7RrNgAoo0rA/PfrBf7DhZQx
| FNyUFDNI/4AycpEK/qC3lFO+rL46n1hZHQIDAQABoyAwHjAJBgNVHRMEAjAAMBEG
| A1UdEQQKMAiCBnVidW50dTANBgkqhkiG9w0BAQsFAAOCAQEAskRHHDOoKAUHl4AM
| qANWP0c9kqC73Gw2hxUVRtqpyl0LR3mbNfBw48G+VssMtqjP4sy35ZbhSPL7tUYu
| bcr7fe/tkewwuaxEkJ/7D8xGMFADC56vxKG4f52aMjjeT69mu0Y46arsFKQKhUe9
| i4WZ7PE6tE6N39K3TnbjsXTwRfrCCxx6cNYBNZ9fiVmDCRg+gZGCc4YKWZtu8yZL
| PHlBkmp23p9zgSOyU0+UIsA22icofHY9/U5KeSgUMwiVsfUSTVd6ZxkBdo8GE6IX
| b8FMFX+BiAUtmFYxqpGMWkq8JAiXK0f302nUorXrrOrLHJfUQ9efbOMMvsUuGrrS
| lH7cyA==
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
80/tcp  open  http     syn-ack ttl 63 Apache httpd 2.4.41 ((Ubuntu))
| http-methods: 
|_  Supported Methods: GET POST OPTIONS HEAD
|_http-server-header: Apache/2.4.41 (Ubuntu)
|_http-title: Site doesn't have a title (text/html).
110/tcp open  pop3     syn-ack ttl 63 Dovecot pop3d
|_pop3-capabilities: RESP-CODES STLS PIPELINING TOP CAPA SASL(PLAIN) UIDL USER AUTH-RESP-CODE
| ssl-cert: Subject: commonName=ubuntu
| Subject Alternative Name: DNS:ubuntu
| Issuer: commonName=ubuntu
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-01-26T10:26:37
| Not valid after:  2031-01-24T10:26:37
| MD5:   5376 0d7f 8cb1 2db9 fedd 1809 463e 94c2
| SHA-1: 63ab a073 44fd 01a2 489f c9a0 8f50 de80 f33c 6895
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIUGEC4bDhH06jafLyt+oBBOT7SWm0wDQYJKoZIhvcNAQEL
| BQAwETEPMA0GA1UEAwwGdWJ1bnR1MB4XDTIxMDEyNjEwMjYzN1oXDTMxMDEyNDEw
| MjYzN1owETEPMA0GA1UEAwwGdWJ1bnR1MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAxj4r7x6ucND17Gv8yE+fKOLLfePFwLvxtMSGSb/VLPMgZ42G3L5C
| pZF7+T9fGgYTMFSeJl1O/6vW8qeby8/ikCCYbO/bXRdlCPh2ROQe2O+ZfY097MyV
| 512iUWH9NWbs8lI/QnH+AIxywPhyOsGmTc+lTht2Edc4fPJaBQdjDiQyalypcm0K
| 7EOr3Q1VJmAoWietBfoaPJ7EEXLJNQEOokSP6tnOoSvV4iCyVT5RaZXsAOi4bbtR
| 4/HyZfLYqqs6fLlvlXcFF325UKYnUfSKqrYGxBZbY7RrNgAoo0rA/PfrBf7DhZQx
| FNyUFDNI/4AycpEK/qC3lFO+rL46n1hZHQIDAQABoyAwHjAJBgNVHRMEAjAAMBEG
| A1UdEQQKMAiCBnVidW50dTANBgkqhkiG9w0BAQsFAAOCAQEAskRHHDOoKAUHl4AM
| qANWP0c9kqC73Gw2hxUVRtqpyl0LR3mbNfBw48G+VssMtqjP4sy35ZbhSPL7tUYu
| bcr7fe/tkewwuaxEkJ/7D8xGMFADC56vxKG4f52aMjjeT69mu0Y46arsFKQKhUe9
| i4WZ7PE6tE6N39K3TnbjsXTwRfrCCxx6cNYBNZ9fiVmDCRg+gZGCc4YKWZtu8yZL
| PHlBkmp23p9zgSOyU0+UIsA22icofHY9/U5KeSgUMwiVsfUSTVd6ZxkBdo8GE6IX
| b8FMFX+BiAUtmFYxqpGMWkq8JAiXK0f302nUorXrrOrLHJfUQ9efbOMMvsUuGrrS
| lH7cyA==
|_-----END CERTIFICATE-----
143/tcp open  imap     syn-ack ttl 63 Dovecot imapd (Ubuntu)
|_imap-capabilities: more capabilities have LITERAL+ post-login ID listed IMAP4rev1 IDLE Pre-login ENABLE SASL-IR STARTTLS OK AUTH=PLAINA0001 LOGIN-REFERRALS
| ssl-cert: Subject: commonName=ubuntu
| Subject Alternative Name: DNS:ubuntu
| Issuer: commonName=ubuntu
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-01-26T10:26:37
| Not valid after:  2031-01-24T10:26:37
| MD5:   5376 0d7f 8cb1 2db9 fedd 1809 463e 94c2
| SHA-1: 63ab a073 44fd 01a2 489f c9a0 8f50 de80 f33c 6895
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIUGEC4bDhH06jafLyt+oBBOT7SWm0wDQYJKoZIhvcNAQEL
| BQAwETEPMA0GA1UEAwwGdWJ1bnR1MB4XDTIxMDEyNjEwMjYzN1oXDTMxMDEyNDEw
| MjYzN1owETEPMA0GA1UEAwwGdWJ1bnR1MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAxj4r7x6ucND17Gv8yE+fKOLLfePFwLvxtMSGSb/VLPMgZ42G3L5C
| pZF7+T9fGgYTMFSeJl1O/6vW8qeby8/ikCCYbO/bXRdlCPh2ROQe2O+ZfY097MyV
| 512iUWH9NWbs8lI/QnH+AIxywPhyOsGmTc+lTht2Edc4fPJaBQdjDiQyalypcm0K
| 7EOr3Q1VJmAoWietBfoaPJ7EEXLJNQEOokSP6tnOoSvV4iCyVT5RaZXsAOi4bbtR
| 4/HyZfLYqqs6fLlvlXcFF325UKYnUfSKqrYGxBZbY7RrNgAoo0rA/PfrBf7DhZQx
| FNyUFDNI/4AycpEK/qC3lFO+rL46n1hZHQIDAQABoyAwHjAJBgNVHRMEAjAAMBEG
| A1UdEQQKMAiCBnVidW50dTANBgkqhkiG9w0BAQsFAAOCAQEAskRHHDOoKAUHl4AM
| qANWP0c9kqC73Gw2hxUVRtqpyl0LR3mbNfBw48G+VssMtqjP4sy35ZbhSPL7tUYu
| bcr7fe/tkewwuaxEkJ/7D8xGMFADC56vxKG4f52aMjjeT69mu0Y46arsFKQKhUe9
| i4WZ7PE6tE6N39K3TnbjsXTwRfrCCxx6cNYBNZ9fiVmDCRg+gZGCc4YKWZtu8yZL
| PHlBkmp23p9zgSOyU0+UIsA22icofHY9/U5KeSgUMwiVsfUSTVd6ZxkBdo8GE6IX
| b8FMFX+BiAUtmFYxqpGMWkq8JAiXK0f302nUorXrrOrLHJfUQ9efbOMMvsUuGrrS
| lH7cyA==
|_-----END CERTIFICATE-----
993/tcp open  ssl/imap syn-ack ttl 63 Dovecot imapd (Ubuntu)
|_imap-capabilities: capabilities more LITERAL+ have ID post-login IMAP4rev1 IDLE Pre-login ENABLE listed SASL-IR OK AUTH=PLAINA0001 LOGIN-REFERRALS
| ssl-cert: Subject: commonName=ubuntu
| Subject Alternative Name: DNS:ubuntu
| Issuer: commonName=ubuntu
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-01-26T10:26:37
| Not valid after:  2031-01-24T10:26:37
| MD5:   5376 0d7f 8cb1 2db9 fedd 1809 463e 94c2
| SHA-1: 63ab a073 44fd 01a2 489f c9a0 8f50 de80 f33c 6895
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIUGEC4bDhH06jafLyt+oBBOT7SWm0wDQYJKoZIhvcNAQEL
| BQAwETEPMA0GA1UEAwwGdWJ1bnR1MB4XDTIxMDEyNjEwMjYzN1oXDTMxMDEyNDEw
| MjYzN1owETEPMA0GA1UEAwwGdWJ1bnR1MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAxj4r7x6ucND17Gv8yE+fKOLLfePFwLvxtMSGSb/VLPMgZ42G3L5C
| pZF7+T9fGgYTMFSeJl1O/6vW8qeby8/ikCCYbO/bXRdlCPh2ROQe2O+ZfY097MyV
| 512iUWH9NWbs8lI/QnH+AIxywPhyOsGmTc+lTht2Edc4fPJaBQdjDiQyalypcm0K
| 7EOr3Q1VJmAoWietBfoaPJ7EEXLJNQEOokSP6tnOoSvV4iCyVT5RaZXsAOi4bbtR
| 4/HyZfLYqqs6fLlvlXcFF325UKYnUfSKqrYGxBZbY7RrNgAoo0rA/PfrBf7DhZQx
| FNyUFDNI/4AycpEK/qC3lFO+rL46n1hZHQIDAQABoyAwHjAJBgNVHRMEAjAAMBEG
| A1UdEQQKMAiCBnVidW50dTANBgkqhkiG9w0BAQsFAAOCAQEAskRHHDOoKAUHl4AM
| qANWP0c9kqC73Gw2hxUVRtqpyl0LR3mbNfBw48G+VssMtqjP4sy35ZbhSPL7tUYu
| bcr7fe/tkewwuaxEkJ/7D8xGMFADC56vxKG4f52aMjjeT69mu0Y46arsFKQKhUe9
| i4WZ7PE6tE6N39K3TnbjsXTwRfrCCxx6cNYBNZ9fiVmDCRg+gZGCc4YKWZtu8yZL
| PHlBkmp23p9zgSOyU0+UIsA22icofHY9/U5KeSgUMwiVsfUSTVd6ZxkBdo8GE6IX
| b8FMFX+BiAUtmFYxqpGMWkq8JAiXK0f302nUorXrrOrLHJfUQ9efbOMMvsUuGrrS
| lH7cyA==
|_-----END CERTIFICATE-----
995/tcp open  ssl/pop3 syn-ack ttl 63 Dovecot pop3d
|_pop3-capabilities: RESP-CODES UIDL AUTH-RESP-CODE CAPA SASL(PLAIN) TOP USER PIPELINING
| ssl-cert: Subject: commonName=ubuntu
| Subject Alternative Name: DNS:ubuntu
| Issuer: commonName=ubuntu
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2021-01-26T10:26:37
| Not valid after:  2031-01-24T10:26:37
| MD5:   5376 0d7f 8cb1 2db9 fedd 1809 463e 94c2
| SHA-1: 63ab a073 44fd 01a2 489f c9a0 8f50 de80 f33c 6895
| -----BEGIN CERTIFICATE-----
| MIIC0DCCAbigAwIBAgIUGEC4bDhH06jafLyt+oBBOT7SWm0wDQYJKoZIhvcNAQEL
| BQAwETEPMA0GA1UEAwwGdWJ1bnR1MB4XDTIxMDEyNjEwMjYzN1oXDTMxMDEyNDEw
| MjYzN1owETEPMA0GA1UEAwwGdWJ1bnR1MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
| MIIBCgKCAQEAxj4r7x6ucND17Gv8yE+fKOLLfePFwLvxtMSGSb/VLPMgZ42G3L5C
| pZF7+T9fGgYTMFSeJl1O/6vW8qeby8/ikCCYbO/bXRdlCPh2ROQe2O+ZfY097MyV
| 512iUWH9NWbs8lI/QnH+AIxywPhyOsGmTc+lTht2Edc4fPJaBQdjDiQyalypcm0K
| 7EOr3Q1VJmAoWietBfoaPJ7EEXLJNQEOokSP6tnOoSvV4iCyVT5RaZXsAOi4bbtR
| 4/HyZfLYqqs6fLlvlXcFF325UKYnUfSKqrYGxBZbY7RrNgAoo0rA/PfrBf7DhZQx
| FNyUFDNI/4AycpEK/qC3lFO+rL46n1hZHQIDAQABoyAwHjAJBgNVHRMEAjAAMBEG
| A1UdEQQKMAiCBnVidW50dTANBgkqhkiG9w0BAQsFAAOCAQEAskRHHDOoKAUHl4AM
| qANWP0c9kqC73Gw2hxUVRtqpyl0LR3mbNfBw48G+VssMtqjP4sy35ZbhSPL7tUYu
| bcr7fe/tkewwuaxEkJ/7D8xGMFADC56vxKG4f52aMjjeT69mu0Y46arsFKQKhUe9
| i4WZ7PE6tE6N39K3TnbjsXTwRfrCCxx6cNYBNZ9fiVmDCRg+gZGCc4YKWZtu8yZL
| PHlBkmp23p9zgSOyU0+UIsA22icofHY9/U5KeSgUMwiVsfUSTVd6ZxkBdo8GE6IX
| b8FMFX+BiAUtmFYxqpGMWkq8JAiXK0f302nUorXrrOrLHJfUQ9efbOMMvsUuGrrS
| lH7cyA==
|_-----END CERTIFICATE-----
OS fingerprint not ideal because: maxTimingRatio (1.534000e+00) is greater than 1.4
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.32 or 3.10 (91%), Linux 2.6.39 (91%), Linux 3.10 - 3.12 (91%), Linux 3.4 (91%), Linux 3.5 (91%), Linux 4.2 (91%), Linux 4.4 (91%), Synology DiskStation Manager 5.1 (91%), WatchGuard Fireware 11.8 (91%)
No exact OS matches for host (test conditions non-ideal).
TCP/IP fingerprint:
SCAN(V=7.91%E=4%D=2/19%OT=22%CT=1%CU=38403%PV=Y%DS=2%DC=T%G=N%TM=6211AAAE%P=x86_64-pc-linux-gnu)
SEQ(SP=104%GCD=1%ISR=10A%TI=Z%TS=A)
OPS(O1=M54EST11NW7%O2=M54EST11NW7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)
WIN(W1=FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)
ECN(R=Y%DF=Y%T=40%W=FAF0%O=M54ENNSNW7%CC=Y%Q=)
T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)
T2(R=N)
T3(R=N)
T4(R=N)
T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)
T6(R=N)
T7(R=N)
U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)
IE(R=Y%DFI=N%T=40%CD=S)

Uptime guess: 30.108 days (since Thu Jan 20 19:08:05 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=256 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host:  postfish.off; OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 3306/tcp)
HOP RTT       ADDRESS
1   177.18 ms 192.168.49.1
2   177.33 ms 192.168.140.137

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Feb 19 21:42:54 2022 -- 1 IP address (1 host up) scanned in 710.18 seconds
```

## 80 - Web

Use virtual host `postfish.off`

![](Pasted%20image%2020220220113319.png)

![](Pasted%20image%2020220301223134.png)

## 25 - SMTP

## 110 - POP3

## 143 - IMAP

https://book.hacktricks.xyz/pentesting/pentesting-imap

(Hinted)

```bash
┌──(kali㉿kali)-[~]
└─$ telnet postfish.off 143
Trying 192.168.88.137...
Connected to postfish.off.
Escape character is '^]'.
* OK [CAPABILITY IMAP4rev1 SASL-IR LOGIN-REFERRALS ID ENABLE IDLE LITERAL+ STARTTLS AUTH=PLAIN] Dovecot (Ubuntu) ready.
A1 LOGIN mike mike
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
A1 LOGIN ross ross
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
A1 LOGIN claire claire
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
A1 LOGIN madison madison
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
A1 LOGIN brian brian
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
* BYE Disconnected for inactivity.
Connection closed by foreign host.
                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ telnet postfish.off 143                                                                                                                                         1 ⨯
Trying 192.168.88.137...
Connected to postfish.off.
Escape character is '^]'.
* OK [CAPABILITY IMAP4rev1 SASL-IR LOGIN-REFERRALS ID ENABLE IDLE LITERAL+ STARTTLS AUTH=PLAIN] Dovecot (Ubuntu) ready.
A1 LOGIN moore moore
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
A1 LOGIN sarah sarah
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
A1 LOGIN lorem lorem
A1 NO [AUTHENTICATIONFAILED] Authentication failed.
```

# Exploitation

# Privesc

# Other