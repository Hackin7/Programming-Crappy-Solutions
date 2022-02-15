```bash
feroxbuster -u http://192.168.161.116:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_common.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_common.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_common.txt):

```
403        8l       22w      211c http://192.168.161.116/.htpasswd
403        8l       22w      211c http://192.168.161.116/.htaccess
403        8l       22w      215c http://192.168.161.116/.htaccess.txt
403        8l       22w      215c http://192.168.161.116/.htpasswd.txt
403        8l       22w      216c http://192.168.161.116/.htaccess.html
403        8l       22w      216c http://192.168.161.116/.htpasswd.html
403        8l       22w      215c http://192.168.161.116/.htpasswd.php
403        8l       22w      215c http://192.168.161.116/.htaccess.php

```
```bash
feroxbuster -u http://192.168.161.116:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_big.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_big.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_big.txt):

```
403        8l       22w      211c http://192.168.161.116/.htpasswd
403        8l       22w      211c http://192.168.161.116/.htaccess
403        8l       22w      215c http://192.168.161.116/.htaccess.txt
403        8l       22w      215c http://192.168.161.116/.htpasswd.txt
403        8l       22w      216c http://192.168.161.116/.htaccess.html
403        8l       22w      216c http://192.168.161.116/.htpasswd.html
403        8l       22w      215c http://192.168.161.116/.htaccess.php
403        8l       22w      215c http://192.168.161.116/.htaccess.asp
403        8l       22w      216c http://192.168.161.116/.htaccess.aspx
403        8l       22w      215c http://192.168.161.116/.htpasswd.php
403        8l       22w      215c http://192.168.161.116/.htaccess.jsp
403        8l       22w      215c http://192.168.161.116/.htpasswd.asp
403        8l       22w      216c http://192.168.161.116/.htpasswd.aspx
403        8l       22w      215c http://192.168.161.116/.htpasswd.jsp

```
```bash
feroxbuster -u http://192.168.161.116:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt):

```
301        7l       20w      238c http://192.168.161.116/images
403        8l       22w      207c http://192.168.161.116/.html
403        8l       22w      211c http://192.168.161.116/.html.txt
403        8l       22w      212c http://192.168.161.116/.html.html
403        8l       22w      211c http://192.168.161.116/.html.php
403        8l       22w      211c http://192.168.161.116/.html.asp
403        8l       22w      212c http://192.168.161.116/.html.aspx
403        8l       22w      211c http://192.168.161.116/.html.jsp
200      217l      796w     9088c http://192.168.161.116/index.html

```
