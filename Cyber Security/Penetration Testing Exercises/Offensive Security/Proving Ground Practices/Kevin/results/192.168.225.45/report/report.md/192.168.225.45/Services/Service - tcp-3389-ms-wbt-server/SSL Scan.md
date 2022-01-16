```bash
sslscan --show-certificate --no-colour 192.168.225.45:3389 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp3389/tcp_3389_sslscan.html](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp3389/tcp_3389_sslscan.html):

```
ERROR: Could not open a connection to host 192.168.225.45 (192.168.225.45) on port 3389 (connect: Connection refused).
ERROR: Could not connect.
Version: 2.0.10-static
OpenSSL 1.1.1l-dev  xx XXX xxxx

Connected to 192.168.225.45

Testing SSL server 192.168.225.45 on port 3389 using SNI name 192.168.225.45

  SSL/TLS Protocols:
SSLv2     disabled
SSLv3     disabled
TLSv1.0   enabled
TLSv1.1   disabled
TLSv1.2   disabled
TLSv1.3   disabled

  TLS Fallback SCSV:
Connection failed - unable to determine TLS Fallback SCSV support

  TLS renegotiation:


```
