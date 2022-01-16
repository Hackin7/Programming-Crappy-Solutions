```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/xml/_full_tcp_nmap.xml" 192.168.123.56
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/_full_tcp_nmap.txt):

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