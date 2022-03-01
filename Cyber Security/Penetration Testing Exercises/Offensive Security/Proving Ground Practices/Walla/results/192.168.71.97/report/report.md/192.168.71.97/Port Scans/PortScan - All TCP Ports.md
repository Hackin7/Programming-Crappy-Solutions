```bash
nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_full_tcp_nmap.xml" 192.168.71.97
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_full_tcp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_full_tcp_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 27 11:49:00 2022 as: nmap -vv --reason -Pn -T4 -sV -sC --version-all -A --osscan-guess -p- -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/_full_tcp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/xml/_full_tcp_nmap.xml" 192.168.71.97
Increasing send delay for 192.168.71.97 from 0 to 5 due to 519 out of 1296 dropped probes since last increase.
Warning: 192.168.71.97 giving up on port because retransmission cap hit (6).
Nmap scan report for 192.168.71.97
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-27 11:49:02 EST for 772s
Not shown: 65520 closed ports
Reason: 65520 resets
PORT      STATE    SERVICE       REASON         VERSION
22/tcp    open     ssh           syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 02:71:5d:c8:b9:43:ba:6a:c8:ed:15:c5:6c:b2:f5:f9 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCtTTLmNtp3zqxLNrL/geNhp8WLkauSPqJ7WY9404pchYQN7BUkpOeUGRNUAtrmwQ02tSIcXSIgaMkP9QYkcgpJ3LgukIrX8aICoFPX8n1PEgZhEryhHomgcWL99ER4uTm9+CXuG3plBp7fgNtacHGGG9tlIn9DqcWwRcsB0WuzZwOT8n0PEwggyMKmhA4LuKKn1933nCCgVFIJ1NLfr9fM+VA3ZwVB7IcPEMrXPRo9q3lZLJtB69biTSnNROXB1pf50LFUUOnuAQwBG+4Md5TK+zbuGuCtf6zB69b+th+XSiGAIO6USodt3DfTo6Vr9ZUEtQykoI2wVJ2ZkeTqzqD3
|   256 f3:e5:10:d4:16:a9:9e:03:47:38:ba:ac:18:24:53:28 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBKTe9nM9KOPFzCX46nVw5gPZi8A4pUJ54B+rw0ehE0PlTNyoAuHTnFwZNLsSPI2yXIve0UqQgs4PYXqhht5nc9A=
|   256 02:4f:99:ec:85:6d:79:43:88:b2:b5:7c:f0:91:fe:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIO2CS9VQ1hSSMPudUXJYiFxw7cD92ImmSovNLtyyGSGu
23/tcp    open     telnet        syn-ack ttl 63 Linux telnetd
25/tcp    open     smtp          syn-ack ttl 63 Postfix smtpd
|_smtp-commands: walla, PIPELINING, SIZE 10240000, VRFY, ETRN, STARTTLS, ENHANCEDSTATUSCODES, 8BITMIME, DSN, SMTPUTF8, CHUNKING, 
| ssl-cert: Subject: commonName=walla
| Subject Alternative Name: DNS:walla
| Issuer: commonName=walla
| Public Key type: rsa
| Public Key bits: 2048
| Signature Algorithm: sha256WithRSAEncryption
| Not valid before: 2020-09-17T18:26:36
| Not valid after:  2030-09-15T18:26:36
| MD5:   097c bda1 76ab 9b73 c8ef 68ab 84e9 a055
| SHA-1: 6c4b fee3 0bd6 d910 2ef9 f81a 3a41 72d8 31bd baac
| -----BEGIN CERTIFICATE-----
| MIICzTCCAbWgAwIBAgIUSjsFHwJii76XBfqWrgTLj7nupXgwDQYJKoZIhvcNAQEL
| BQAwEDEOMAwGA1UEAwwFd2FsbGEwHhcNMjAwOTE3MTgyNjM2WhcNMzAwOTE1MTgy
| NjM2WjAQMQ4wDAYDVQQDDAV3YWxsYTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCC
| AQoCggEBAOwqF+jjwFmrSmgMiDEP1C3Adi9w1nrHCw8pFunsf2BnG4tRF3Xj2blV
| d5+CaCqmsiADAjFGXNREudaCvYKvw9ctU83dKw8khjho9Q+vm6AEMgS78uQNhQp3
| uXFkQVboMxYZdtxGs2/JkE0S52qYXScSJWer8uEon7qAkLgRJ1gQQHlqZ44ekmdt
| wPaQIu5IYWIeMYiLHb3Ivvk6esj/01NpaNmTNyljF2LxdEJaRjYYEMPqvS2Z5Dzd
| QL+fIWkeINwvWl+J4rkZA5xnLnOo08BG4MtGHAi0b2+bJ4fGT4fnrgoXoG6D9vIN
| jcxFhgScgAiA+ifARtuoKjWMukDiChUCAwEAAaMfMB0wCQYDVR0TBAIwADAQBgNV
| HREECTAHggV3YWxsYTANBgkqhkiG9w0BAQsFAAOCAQEAmzn/Ujcmz5o+qRXzL2ZR
| 60yEhjRd3kRaU4im8917uvzt7tZ/ELIGbCEEaNfhNOvyqDAtRPZC7U1m94baUqr+
| 741Er3x+NPR8A0aNn4tYq6SnD66XNeVecQfplg6uTjVCChO1iEAFXo1ETUjP6WV6
| Am8XspbmjffTPLWei0uw+qXfOL9TFu8sIFbhr0+UmV6ZpXNc+yoqGUlKFUTcHye0
| OZHrz6yNf+hUnMWBY6wWUB5SlpT4Onrnm6SWBU7rAD3kvLAsmpQHI38x5NTAxRWZ
| m5NUiiBnSYTwXytEvzHdqgkNxKPQDKnfS8D9oeVFjtM22TNKI8ytVFV+SQ0plPA+
| tQ==
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
53/tcp    open     tcpwrapped    syn-ack ttl 63
422/tcp   open     ssh           syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 02:71:5d:c8:b9:43:ba:6a:c8:ed:15:c5:6c:b2:f5:f9 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCtTTLmNtp3zqxLNrL/geNhp8WLkauSPqJ7WY9404pchYQN7BUkpOeUGRNUAtrmwQ02tSIcXSIgaMkP9QYkcgpJ3LgukIrX8aICoFPX8n1PEgZhEryhHomgcWL99ER4uTm9+CXuG3plBp7fgNtacHGGG9tlIn9DqcWwRcsB0WuzZwOT8n0PEwggyMKmhA4LuKKn1933nCCgVFIJ1NLfr9fM+VA3ZwVB7IcPEMrXPRo9q3lZLJtB69biTSnNROXB1pf50LFUUOnuAQwBG+4Md5TK+zbuGuCtf6zB69b+th+XSiGAIO6USodt3DfTo6Vr9ZUEtQykoI2wVJ2ZkeTqzqD3
|   256 f3:e5:10:d4:16:a9:9e:03:47:38:ba:ac:18:24:53:28 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBKTe9nM9KOPFzCX46nVw5gPZi8A4pUJ54B+rw0ehE0PlTNyoAuHTnFwZNLsSPI2yXIve0UqQgs4PYXqhht5nc9A=
|   256 02:4f:99:ec:85:6d:79:43:88:b2:b5:7c:f0:91:fe:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIO2CS9VQ1hSSMPudUXJYiFxw7cD92ImmSovNLtyyGSGu
6556/tcp  filtered checkmk-agent no-response
8091/tcp  open     http          syn-ack ttl 63 lighttpd 1.4.53
| http-auth: 
| HTTP/1.1 401 Unauthorized\x0D
|_  Basic realm=RaspAP
| http-cookie-flags: 
|   /: 
|     PHPSESSID: 
|_      httponly flag not set
|_http-favicon: Unknown favicon MD5: B5F9F8F2263315029AD7A81420E6CC2D
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-server-header: lighttpd/1.4.53
21545/tcp filtered unknown       no-response
27755/tcp filtered unknown       no-response
29029/tcp filtered unknown       no-response
29691/tcp filtered unknown       no-response
31928/tcp filtered unknown       no-response
37893/tcp filtered unknown       no-response
42042/tcp open     ssh           syn-ack ttl 63 OpenSSH 7.9p1 Debian 10+deb10u2 (protocol 2.0)
| ssh-hostkey: 
|   2048 02:71:5d:c8:b9:43:ba:6a:c8:ed:15:c5:6c:b2:f5:f9 (RSA)
| ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQCtTTLmNtp3zqxLNrL/geNhp8WLkauSPqJ7WY9404pchYQN7BUkpOeUGRNUAtrmwQ02tSIcXSIgaMkP9QYkcgpJ3LgukIrX8aICoFPX8n1PEgZhEryhHomgcWL99ER4uTm9+CXuG3plBp7fgNtacHGGG9tlIn9DqcWwRcsB0WuzZwOT8n0PEwggyMKmhA4LuKKn1933nCCgVFIJ1NLfr9fM+VA3ZwVB7IcPEMrXPRo9q3lZLJtB69biTSnNROXB1pf50LFUUOnuAQwBG+4Md5TK+zbuGuCtf6zB69b+th+XSiGAIO6USodt3DfTo6Vr9ZUEtQykoI2wVJ2ZkeTqzqD3
|   256 f3:e5:10:d4:16:a9:9e:03:47:38:ba:ac:18:24:53:28 (ECDSA)
| ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBKTe9nM9KOPFzCX46nVw5gPZi8A4pUJ54B+rw0ehE0PlTNyoAuHTnFwZNLsSPI2yXIve0UqQgs4PYXqhht5nc9A=
|   256 02:4f:99:ec:85:6d:79:43:88:b2:b5:7c:f0:91:fe:74 (ED25519)
|_ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIO2CS9VQ1hSSMPudUXJYiFxw7cD92ImmSovNLtyyGSGu
47904/tcp filtered unknown       no-response
Aggressive OS guesses: Linux 2.6.32 (91%), Linux 2.6.32 or 3.10 (91%), Linux 2.6.39 (91%), Linux 3.10 - 3.12 (91%), Linux 3.5 (91%), Linux 4.4 (91%), Synology DiskStation Manager 5.1 (91%), WatchGuard Fireware 11.8 (91%), Linux 2.6.35 (90%), Linux 4.9 (90%)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.91%E=4%D=2/27%OT=22%CT=1%CU=42005%PV=Y%DS=2%DC=T%G=Y%TM=621BAE8
OS:2%P=x86_64-pc-linux-gnu)SEQ(SP=100%GCD=1%ISR=10C%TI=Z%II=I%TS=A)SEQ(TI=Z
OS:%TS=A)SEQ(SP=100%GCD=4%ISR=10C%TI=Z%TS=A)OPS(O1=M54EST11NW7%O2=M54EST11N
OS:W7%O3=M54ENNT11NW7%O4=M54EST11NW7%O5=M54EST11NW7%O6=M54EST11)WIN(W1=FE88
OS:%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=40%W=FAF0%O=M54E
OS:NNSNW7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)T4(R
OS:=N)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)T6(R=N)T7(R=N)U1(R=Y%DF
OS:=N%T=40%IPL=164%UN=0%RIPL=G%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40
OS:%CD=S)

Uptime guess: 0.929 days (since Sat Feb 26 13:44:21 2022)
Network Distance: 2 hops
TCP Sequence Prediction: Difficulty=256 (Good luck!)
IP ID Sequence Generation: All zeros
Service Info: Host:  walla; OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE (using port 1720/tcp)
HOP RTT       ADDRESS
1   178.55 ms 192.168.49.1
2   178.60 ms 192.168.71.97

Read data files from: /usr/bin/../share/nmap
OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 27 12:01:54 2022 -- 1 IP address (1 host up) scanned in 774.94 seconds

```
