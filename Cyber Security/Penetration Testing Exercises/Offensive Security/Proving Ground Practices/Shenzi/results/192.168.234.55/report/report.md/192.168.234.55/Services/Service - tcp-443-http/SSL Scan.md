```bash
sslscan --show-certificate --no-colour 192.168.234.55:443 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_sslscan.html](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_sslscan.html):

```
Version: 2.0.10-static
OpenSSL 1.1.1l-dev  xx XXX xxxx

Connected to 192.168.234.55

Testing SSL server 192.168.234.55 on port 443 using SNI name 192.168.234.55

  SSL/TLS Protocols:
SSLv2     disabled
SSLv3     disabled
TLSv1.0   enabled
TLSv1.1   enabled
TLSv1.2   enabled
TLSv1.3   enabled

  TLS Fallback SCSV:
Server supports TLS Fallback SCSV

  TLS renegotiation:
Secure session renegotiation supported

  TLS Compression:
Compression disabled

  Heartbleed:
TLSv1.3 not vulnerable to heartbleed
TLSv1.2 not vulnerable to heartbleed
TLSv1.1 not vulnerable to heartbleed
TLSv1.0 not vulnerable to heartbleed

  Supported Server Cipher(s):
Preferred TLSv1.3  256 bits  TLS_AES_256_GCM_SHA384        Curve 25519 DHE 253
Accepted  TLSv1.3  256 bits  TLS_CHACHA20_POLY1305_SHA256  Curve 25519 DHE 253
Accepted  TLSv1.3  128 bits  TLS_AES_128_GCM_SHA256        Curve 25519 DHE 253
Preferred TLSv1.2  256 bits  ECDHE-RSA-AES256-GCM-SHA384   Curve 25519 DHE 253
Accepted  TLSv1.2  256 bits  DHE-RSA-AES256-GCM-SHA384     DHE 1024 bits
Accepted  TLSv1.2  256 bits  ECDHE-RSA-CHACHA20-POLY1305   Curve 25519 DHE 253
Accepted  TLSv1.2  256 bits  DHE-RSA-CHACHA20-POLY1305     DHE 1024 bits
Accepted  TLSv1.2  256 bits  DHE-RSA-AES256-CCM8           DHE 1024 bits
Accepted  TLSv1.2  256 bits  DHE-RSA-AES256-CCM            DHE 1024 bits
Accepted  TLSv1.2  256 bits  ECDHE-ARIA256-GCM-SHA384      Curve 25519 DHE 253
Accepted  TLSv1.2  256 bits  DHE-RSA-ARIA256-GCM-SHA384    DHE 1024 bits
Accepted  TLSv1.2  128 bits  ECDHE-RSA-AES128-GCM-SHA256   Curve 25519 DHE 253
Accepted  TLSv1.2  128 bits  DHE-RSA-AES128-GCM-SHA256     DHE 1024 bits
Accepted  TLSv1.2  128 bits  DHE-RSA-AES128-CCM8           DHE 1024 bits
Accepted  TLSv1.2  128 bits  DHE-RSA-AES128-CCM            DHE 1024 bits
Accepted  TLSv1.2  128 bits  ECDHE-ARIA128-GCM-SHA256      Curve 25519 DHE 253
Accepted  TLSv1.2  128 bits  DHE-RSA-ARIA128-GCM-SHA256    DHE 1024 bits
Accepted  TLSv1.2  256 bits  ECDHE-RSA-AES256-SHA384       Curve 25519 DHE 253
Accepted  TLSv1.2  256 bits  DHE-RSA-AES256-SHA256         DHE 1024 bits
Accepted  TLSv1.2  256 bits  ECDHE-RSA-CAMELLIA256-SHA384  Curve 25519 DHE 253
Accepted  TLSv1.2  256 bits  DHE-RSA-CAMELLIA256-SHA256    DHE 1024 bits
Accepted  TLSv1.2  128 bits  ECDHE-RSA-AES128-SHA256       Curve 25519 DHE 253
Accepted  TLSv1.2  128 bits  DHE-RSA-AES128-SHA256         DHE 1024 bits
Accepted  TLSv1.2  128 bits  ECDHE-RSA-CAMELLIA128-SHA256  Curve 25519 DHE 253
Accepted  TLSv1.2  128 bits  DHE-RSA-CAMELLIA128-SHA256    DHE 1024 bits
Accepted  TLSv1.2  256 bits  ECDHE-RSA-AES256-SHA          Curve 25519 DHE 253
Accepted  TLSv1.2  256 bits  DHE-RSA-AES256-SHA            DHE 1024 bits
Accepted  TLSv1.2  256 bits  DHE-RSA-CAMELLIA256-SHA       DHE 1024 bits
Accepted  TLSv1.2  128 bits  ECDHE-RSA-AES128-SHA          Curve 25519 DHE 253
Accepted  TLSv1.2  128 bits  DHE-RSA-AES128-SHA            DHE 1024 bits
Accepted  TLSv1.2  128 bits  DHE-RSA-CAMELLIA128-SHA       DHE 1024 bits
Accepted  TLSv1.2  256 bits  AES256-GCM-SHA384
Accepted  TLSv1.2  256 bits  AES256-CCM8
Accepted  TLSv1.2  256 bits  AES256-CCM
Accepted  TLSv1.2  256 bits  ARIA256-GCM-SHA384
Accepted  TLSv1.2  128 bits  AES128-GCM-SHA256
Accepted  TLSv1.2  128 bits  AES128-CCM8
Accepted  TLSv1.2  128 bits  AES128-CCM
Accepted  TLSv1.2  128 bits  ARIA128-GCM-SHA256
Accepted  TLSv1.2  256 bits  AES256-SHA256
Accepted  TLSv1.2  256 bits  CAMELLIA256-SHA256
Accepted  TLSv1.2  128 bits  AES128-SHA256
Accepted  TLSv1.2  128 bits  CAMELLIA128-SHA256
Accepted  TLSv1.2  256 bits  AES256-SHA
Accepted  TLSv1.2  256 bits  CAMELLIA256-SHA
Accepted  TLSv1.2  128 bits  AES128-SHA
Accepted  TLSv1.2  128 bits  CAMELLIA128-SHA
Accepted  TLSv1.2  128 bits  DHE-RSA-SEED-SHA              DHE 1024 bits
Accepted  TLSv1.2  128 bits  SEED-SHA
Preferred TLSv1.1  256 bits  ECDHE-RSA-AES256-SHA          Curve 25519 DHE 253
Accepted  TLSv1.1  256 bits  DHE-RSA-AES256-SHA            DHE 1024 bits
Accepted  TLSv1.1  256 bits  DHE-RSA-CAMELLIA256-SHA       DHE 1024 bits
Accepted  TLSv1.1  128 bits  ECDHE-RSA-AES128-SHA          Curve 25519 DHE 253
Accepted  TLSv1.1  128 bits  DHE-RSA-AES128-SHA            DHE 1024 bits
Accepted  TLSv1.1  128 bits  DHE-RSA-CAMELLIA128-SHA       DHE 1024 bits
Accepted  TLSv1.1  256 bits  AES256-SHA
Accepted  TLSv1.1  256 bits  CAMELLIA256-SHA
Accepted  TLSv1.1  128 bits  AES128-SHA
Accepted  TLSv1.1  128 bits  CAMELLIA128-SHA
Accepted  TLSv1.1  128 bits  DHE-RSA-SEED-SHA              DHE 1024 bits
Accepted  TLSv1.1  128 bits  SEED-SHA
Accepted  TLSv1.1  128 bits  IDEA-CBC-SHA
Preferred TLSv1.0  256 bits  ECDHE-RSA-AES256-SHA          Curve 25519 DHE 253
Accepted  TLSv1.0  256 bits  DHE-RSA-AES256-SHA            DHE 1024 bits
Accepted  TLSv1.0  256 bits  DHE-RSA-CAMELLIA256-SHA       DHE 1024 bits
Accepted  TLSv1.0  128 bits  ECDHE-RSA-AES128-SHA          Curve 25519 DHE 253
Accepted  TLSv1.0  128 bits  DHE-RSA-AES128-SHA            DHE 1024 bits
Accepted  TLSv1.0  128 bits  DHE-RSA-CAMELLIA128-SHA       DHE 1024 bits
Accepted  TLSv1.0  256 bits  AES256-SHA
Accepted  TLSv1.0  256 bits  CAMELLIA256-SHA
Accepted  TLSv1.0  128 bits  AES128-SHA
Accepted  TLSv1.0  128 bits  CAMELLIA128-SHA
Accepted  TLSv1.0  128 bits  DHE-RSA-SEED-SHA              DHE 1024 bits
Accepted  TLSv1.0  128 bits  SEED-SHA
Accepted  TLSv1.0  128 bits  IDEA-CBC-SHA

  Server Key Exchange Group(s):
TLSv1.3  128 bits  secp256r1 (NIST P-256)
TLSv1.3  192 bits  secp384r1 (NIST P-384)
TLSv1.3  260 bits  secp521r1 (NIST P-521)
TLSv1.3  128 bits  x25519
TLSv1.3  224 bits  x448
TLSv1.2  128 bits  secp256r1 (NIST P-256)
TLSv1.2  192 bits  secp384r1 (NIST P-384)
TLSv1.2  260 bits  secp521r1 (NIST P-521)
TLSv1.2  128 bits  x25519
TLSv1.2  224 bits  x448

  SSL Certificate:
    Certificate blob:
-----BEGIN CERTIFICATE-----
MIIBnzCCAQgCCQC1x1LJh4G1AzANBgkqhkiG9w0BAQUFADAUMRIwEAYDVQQDEwls
b2NhbGhvc3QwHhcNMDkxMTEwMjM0ODQ3WhcNMTkxMTA4MjM0ODQ3WjAUMRIwEAYD
VQQDEwlsb2NhbGhvc3QwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAMEl0yfj
7K0Ng2pt51+adRAj4pCdoGOVjx1BmljVnGOMW3OGkHnMw9ajibh1vB6UfHxu463o
J1wLxgxq+Q8y/rPEehAjBCspKNSq+bMvZhD4p8HNYMRrKFfjZzv3ns1IItw46kgT
gDpAl1cMRzVGPXFimu5TnWMOZ3ooyaQ0/xntAgMBAAEwDQYJKoZIhvcNAQEFBQAD
gYEAavHzSWz5umhfb/MnBMa5DL2VNzS+9whmmpsDGEG+uR0kM1W2GQIdVHHJTyFd
aHXzgVJBQcWTwhp84nvHSiQTDBSaT6cQNQpvag/TaED/SEQpm0VqDFwpfFYuufBL
vVNbLkKxbK2XwUvu0RxoLdBMC/89HqrZ0ppiONuQ+X2MtxE=
-----END CERTIFICATE-----
    Version: 0
    Serial Number: b5:c7:52:c9:87:81:b5:03
    Signature Algorithm: sha1WithRSAEncryption
    Issuer: /CN=localhost
    Not valid before: Nov 10 23:48:47 2009 GMT
    Not valid after: Nov  8 23:48:47 2019 GMT
    Subject: /CN=localhost
    Public Key Algorithm: NULL
    RSA Public Key: (1024 bit)
      RSA Public-Key: (1024 bit)
      Modulus:
          00:c1:25:d3:27:e3:ec:ad:0d:83:6a:6d:e7:5f:9a:
          75:10:23:e2:90:9d:a0:63:95:8f:1d:41:9a:58:d5:
          9c:63:8c:5b:73:86:90:79:cc:c3:d6:a3:89:b8:75:
          bc:1e:94:7c:7c:6e:e3:ad:e8:27:5c:0b:c6:0c:6a:
          f9:0f:32:fe:b3:c4:7a:10:23:04:2b:29:28:d4:aa:
          f9:b3:2f:66:10:f8:a7:c1:cd:60:c4:6b:28:57:e3:
          67:3b:f7:9e:cd:48:22:dc:38:ea:48:13:80:3a:40:
          97:57:0c:47:35:46:3d:71:62:9a:ee:53:9d:63:0e:
          67:7a:28:c9:a4:34:ff:19:ed
      Exponent: 65537 (0x10001)
  Verify Certificate:
    self signed certificate

  SSL Certificate:
Signature Algorithm: sha1WithRSAEncryption
RSA Key Strength:    1024

Subject:  localhost
Issuer:   localhost

Not valid before: Nov 10 23:48:47 2009 GMT
Not valid after:  Nov  8 23:48:47 2019 GMT


```
