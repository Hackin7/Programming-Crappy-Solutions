```bash
feroxbuster -u http://192.168.123.56:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt"
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt):

```
WLD        9l       28w      281c Got 403 for http://192.168.123.56:8080/44acb9bf28d948f596ced54a613e8208 (url length: 32)
WLD        9l       28w      281c Got 403 for http://192.168.123.56:8080/d3c8678959b248e68de5bec94bf27545f7e7983aab6a44448e7c5c29e0be5e99b3ad6ffe5e874690a3093d96022d3b2c (url length: 96)

```
```bash
feroxbuster -u http://192.168.123.56:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt"
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt):

```
WLD        9l       28w      281c Got 403 for http://192.168.123.56:8080/c673c502ed734c9eab49836b769d1f42 (url length: 32)
WLD        9l       28w      281c Got 403 for http://192.168.123.56:8080/edc2819589b24fe883353604fe3049d02b08a97b4d2446fbb674f9921d99e7e466dd37ec3bdb42818c45906d3912d09c (url length: 96)

```
```bash
feroxbuster -u http://192.168.123.56:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt"
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt):

```
WLD        9l       28w      281c Got 403 for http://192.168.123.56:8080/9cf0365269d5465ba93c28b37ee0601f (url length: 32)
WLD        9l       28w      281c Got 403 for http://192.168.123.56:8080/41c0e9c514ad456d90c56b4fe9443a66dd9ead72dbc74bea9cf079a882c8d6c0a45a19405b3b4f9fb3b94690e1e2bc45 (url length: 96)

```
