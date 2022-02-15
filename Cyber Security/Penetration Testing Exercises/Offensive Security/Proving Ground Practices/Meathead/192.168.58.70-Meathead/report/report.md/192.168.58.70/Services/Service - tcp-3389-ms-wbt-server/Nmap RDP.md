```bash
nmap -vv --reason -Pn -T4 -sV -p 3389 --script="banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:46:12 2022 as: nmap -vv --reason -Pn -T4 -sV -p 3389 "--script=banner,(rdp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN /root/autorecon/results/192.168.58.70/scans/tcp3389/tcp_3389_rdp_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp3389/xml/tcp_3389_rdp_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:46:17 +08 for 43s

PORT     STATE SERVICE       REASON          VERSION
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
|_ssl-date: 2022-01-19T10:45:45+00:00; -1m00s from scanner time.
| ssl-enum-ciphers: 
|   TLSv1.0: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp384r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (ecdh_x25519) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_3DES_EDE_CBC_SHA (rsa 2048) - C
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher 3DES vulnerable to SWEET32 attack
|   TLSv1.1: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp384r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (ecdh_x25519) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_3DES_EDE_CBC_SHA (rsa 2048) - C
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher 3DES vulnerable to SWEET32 attack
|   TLSv1.2: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (secp384r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (dh 2048) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 (secp384r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 (ecdh_x25519) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp384r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (ecdh_x25519) - A
|       TLS_RSA_WITH_AES_256_GCM_SHA384 (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_GCM_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_3DES_EDE_CBC_SHA (rsa 2048) - C
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher 3DES vulnerable to SWEET32 attack
|_  least strength: C
| rdp-ntlm-info: 
|   Target_Name: MEATHEAD
|   NetBIOS_Domain_Name: MEATHEAD
|   NetBIOS_Computer_Name: MEATHEAD
|   DNS_Domain_Name: Meathead
|   DNS_Computer_Name: Meathead
|   Product_Version: 10.0.17763
|_  System_Time: 2022-01-19T10:45:25+00:00
| rdp-enum-encryption: 
|   Security layer
|     CredSSP (NLA): SUCCESS
|     CredSSP with Early User Auth: SUCCESS
|     RDSTLS: SUCCESS
|     SSL: SUCCESS
|_  RDP Protocol Version:  RDP 10.6 server
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:47:00 2022 -- 1 IP address (1 host up) scanned in 48.44 seconds

```
