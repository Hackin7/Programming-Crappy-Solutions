```bash
nmap -vv --reason -Pn -T4 -sV -p 25 --script="banner,(smtp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp25/tcp_25_smtp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp25/xml/tcp_25_smtp_nmap.xml" 192.168.123.56
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp25/tcp_25_smtp_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp25/tcp_25_smtp_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Jan 15 12:34:08 2022 as: nmap -vv --reason -Pn -T4 -sV -p 25 "--script=banner,(smtp* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp25/tcp_25_smtp_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp25/xml/tcp_25_smtp_nmap.xml" 192.168.123.56
Nmap scan report for 192.168.123.56
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-15 12:34:11 EST for 63s

PORT   STATE SERVICE REASON         VERSION
25/tcp open  smtp    syn-ack ttl 63 Postfix smtpd
|_banner: 220 banzai.offseclabs.com ESMTP Postfix (Debian/GNU)
|_smtp-commands: banzai.offseclabs.com, PIPELINING, SIZE 10240000, VRFY, ETRN, STARTTLS, ENHANCEDSTATUSCODES, 8BITMIME, DSN, SMTPUTF8, 
| smtp-vuln-cve2010-4344: 
|_  The SMTP server is not Exim: NOT VULNERABLE
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
|             Cipher Suite: TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256
|             Modulus Type: Safe prime
|             Modulus Source: Unknown/Custom-generated
|             Modulus Length: 2048
|             Generator Length: 8
|             Public Key Length: 2048
|     References:
|_      https://www.ietf.org/rfc/rfc2246.txt
| ssl-enum-ciphers: 
|   TLSv1.0: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 2048) - A
|       TLS_DH_anon_WITH_AES_128_CBC_SHA - F
|       TLS_DH_anon_WITH_AES_256_CBC_SHA - F
|       TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA - F
|       TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA - F
|       TLS_DH_anon_WITH_SEED_CBC_SHA - F
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_ECDH_anon_WITH_AES_128_CBC_SHA - F
|       TLS_ECDH_anon_WITH_AES_256_CBC_SHA - F
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 2048) - A
|     compressors: 
|       NULL
|     cipher preference: client
|   TLSv1.1: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 2048) - A
|       TLS_DH_anon_WITH_AES_128_CBC_SHA - F
|       TLS_DH_anon_WITH_AES_256_CBC_SHA - F
|       TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA - F
|       TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA - F
|       TLS_DH_anon_WITH_SEED_CBC_SHA - F
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_ECDH_anon_WITH_AES_128_CBC_SHA - F
|       TLS_ECDH_anon_WITH_AES_256_CBC_SHA - F
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 2048) - A
|     compressors: 
|       NULL
|     cipher preference: client
|   TLSv1.2: 
|     ciphers: 
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_CCM (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_CCM_8 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CCM (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_CCM_8 (dh 2048) - A
|       TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 2048) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 (dh 2048) - A
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 2048) - A
|       TLS_DH_anon_WITH_AES_128_CBC_SHA - F
|       TLS_DH_anon_WITH_AES_128_CBC_SHA256 - F
|       TLS_DH_anon_WITH_AES_128_GCM_SHA256 - F
|       TLS_DH_anon_WITH_AES_256_CBC_SHA - F
|       TLS_DH_anon_WITH_AES_256_CBC_SHA256 - F
|       TLS_DH_anon_WITH_AES_256_GCM_SHA384 - F
|       TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA - F
|       TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 - F
|       TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA - F
|       TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 - F
|       TLS_DH_anon_WITH_SEED_CBC_SHA - F
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 (secp256r1) - A
|       TLS_ECDH_anon_WITH_AES_128_CBC_SHA - F
|       TLS_ECDH_anon_WITH_AES_256_CBC_SHA - F
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CCM (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_CCM_8 (rsa 2048) - A
|       TLS_RSA_WITH_AES_128_GCM_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CCM (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_CCM_8 (rsa 2048) - A
|       TLS_RSA_WITH_AES_256_GCM_SHA384 (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 2048) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA256 (rsa 2048) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 2048) - A
|     compressors: 
|       NULL
|     cipher preference: client
|_  least strength: F
|_sslv2-drown: 
Service Info: Host:  banzai.offseclabs.com

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Jan 15 12:35:14 2022 -- 1 IP address (1 host up) scanned in 66.15 seconds

```
