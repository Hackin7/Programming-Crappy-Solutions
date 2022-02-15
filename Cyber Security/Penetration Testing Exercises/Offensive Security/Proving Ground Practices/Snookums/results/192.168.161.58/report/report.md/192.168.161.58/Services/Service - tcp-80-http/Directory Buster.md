```bash
feroxbuster -u http://192.168.161.58:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_common.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_common.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_common.txt):

```
403        8l       22w      206c http://192.168.161.58/.hta
403        8l       22w      211c http://192.168.161.58/.htaccess
403        8l       22w      211c http://192.168.161.58/.htpasswd
403        8l       22w      210c http://192.168.161.58/.hta.txt
403        8l       22w      215c http://192.168.161.58/.htaccess.txt
403        8l       22w      215c http://192.168.161.58/.htpasswd.txt
403        8l       22w      211c http://192.168.161.58/.hta.html
403        8l       22w      216c http://192.168.161.58/.htaccess.html
403        8l       22w      216c http://192.168.161.58/.htpasswd.html
403        8l       22w      210c http://192.168.161.58/.hta.php
403        8l       22w      215c http://192.168.161.58/.htaccess.php
403        8l       22w      215c http://192.168.161.58/.htpasswd.php
403        8l       22w      210c http://192.168.161.58/.hta.asp
403        8l       22w      215c http://192.168.161.58/.htaccess.asp
403        8l       22w      211c http://192.168.161.58/.hta.aspx
403        8l       22w      215c http://192.168.161.58/.htpasswd.asp
403        8l       22w      216c http://192.168.161.58/.htaccess.aspx
403        8l       22w      210c http://192.168.161.58/.hta.jsp
403        8l       22w      216c http://192.168.161.58/.htpasswd.aspx
403        8l       22w      215c http://192.168.161.58/.htaccess.jsp
403        8l       22w      215c http://192.168.161.58/.htpasswd.jsp

```
```bash
feroxbuster -u http://192.168.161.58:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_big.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_big.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_big.txt):

```

```
```bash
feroxbuster -u http://192.168.161.58:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt):

```
301        7l       20w      237c http://192.168.161.58/images
403        8l       22w      207c http://192.168.161.58/.html
403        8l       22w      211c http://192.168.161.58/.html.txt
403        8l       22w      212c http://192.168.161.58/.html.html
403        8l       22w      211c http://192.168.161.58/.html.php
403        8l       22w      211c http://192.168.161.58/.html.asp
403        8l       22w      212c http://192.168.161.58/.html.aspx
403        8l       22w      211c http://192.168.161.58/.html.jsp
301        7l       20w      233c http://192.168.161.58/js
301        7l       20w      234c http://192.168.161.58/css
200       90l      182w     2730c http://192.168.161.58/index.php
403        8l       22w      206c http://192.168.161.58/.htm
403        8l       22w      210c http://192.168.161.58/.htm.txt
403        8l       22w      211c http://192.168.161.58/.htm.html
403        8l       22w      210c http://192.168.161.58/.htm.php
403        8l       22w      210c http://192.168.161.58/.htm.asp
403        8l       22w      211c http://192.168.161.58/.htm.aspx
403        8l       22w      210c http://192.168.161.58/.htm.jsp
200       71l      120w     1508c http://192.168.161.58/image.php

```
