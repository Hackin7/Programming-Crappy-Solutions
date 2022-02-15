```bash
nmap -vv --reason -Pn -T4 -sV -p 1435 --script="banner,(ms-sql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" --script-args="mssql.instance-port=1435,mssql.username=sa,mssql.password=sa" -oN "/root/autorecon/results/192.168.58.70/scans/tcp1435/tcp_1435_mssql_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp1435/xml/tcp_1435_mssql_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp1435/tcp_1435_mssql_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp1435/tcp_1435_mssql_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:49:57 2022 as: nmap -vv --reason -Pn -T4 -sV -p 1435 "--script=banner,(ms-sql* or ssl*) and not (brute or broadcast or dos or external or fuzzer)" --script-args=mssql.instance-port=1435,mssql.username=sa,mssql.password=sa -oN /root/autorecon/results/192.168.58.70/scans/tcp1435/tcp_1435_mssql_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp1435/xml/tcp_1435_mssql_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.17s latency).
Scanned at 2022-01-19 18:49:59 +08 for 82s

PORT     STATE SERVICE  REASON          VERSION
1435/tcp open  ms-sql-s syn-ack ttl 127 Microsoft SQL Server 2017 14.00.1000.00; RTM
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
|_ssl-date: 2022-01-19T10:49:58+00:00; -1m00s from scanner time.

Host script results:
| ms-sql-empty-password: 
|   [192.168.58.70:1435]
|_    'sa' account password is not blank.
| ms-sql-info: 
|   192.168.58.70:1435: 
|     Version: 
|       name: Microsoft SQL Server 2017 RTM
|       number: 14.00.1000.00
|       Product: Microsoft SQL Server 2017
|       Service pack level: RTM
|       Post-SP patches applied: false
|_    TCP port: 1435
| ms-sql-xp-cmdshell: 
|   (Use --script-args=ms-sql-xp-cmdshell.cmd='<CMD>' to change command.)
|_  [192.168.58.70:1435]
| ms-sql-tables: 
|_  [192.168.58.70:1435]
| ms-sql-query: 
|   (Use --script-args=ms-sql-query.query='<QUERY>' to change query.)
|   [192.168.58.70:1435]
|_    ERROR: Bad username or password
| ms-sql-dump-hashes: 
| [192.168.58.70:1435]
|_  ERROR: Bad username or password
| ms-sql-config: 
|   [192.168.58.70:1435]
|_    ERROR: Bad username or password
| ms-sql-hasdbaccess: 
|_  [192.168.58.70:1435]

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:51:21 2022 -- 1 IP address (1 host up) scanned in 83.98 seconds

```
