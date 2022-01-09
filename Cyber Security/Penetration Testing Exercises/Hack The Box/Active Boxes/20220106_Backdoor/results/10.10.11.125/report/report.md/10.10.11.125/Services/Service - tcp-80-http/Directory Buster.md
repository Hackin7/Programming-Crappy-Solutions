```bash
feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_common.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_common.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_common.txt):

```
403        9l       28w      277c http://10.10.11.125/.htpasswd
403        9l       28w      277c http://10.10.11.125/.htaccess
403        9l       28w      277c http://10.10.11.125/.htpasswd.txt
403        9l       28w      277c http://10.10.11.125/.htaccess.txt
403        9l       28w      277c http://10.10.11.125/.htaccess.html
403        9l       28w      277c http://10.10.11.125/.htpasswd.html
403        9l       28w      277c http://10.10.11.125/.hta
403        9l       28w      277c http://10.10.11.125/.htaccess.php
403        9l       28w      277c http://10.10.11.125/.htpasswd.php
403        9l       28w      277c http://10.10.11.125/.hta.txt
403        9l       28w      277c http://10.10.11.125/.htaccess.asp
403        9l       28w      277c http://10.10.11.125/.htpasswd.asp
403        9l       28w      277c http://10.10.11.125/.hta.html
403        9l       28w      277c http://10.10.11.125/.htaccess.aspx
403        9l       28w      277c http://10.10.11.125/.htpasswd.aspx
403        9l       28w      277c http://10.10.11.125/.hta.php
403        9l       28w      277c http://10.10.11.125/.htaccess.jsp
403        9l       28w      277c http://10.10.11.125/.htpasswd.jsp
403        9l       28w      277c http://10.10.11.125/.hta.asp
403        9l       28w      277c http://10.10.11.125/.hta.aspx
403        9l       28w      277c http://10.10.11.125/.hta.jsp

```
```bash
feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_big.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_big.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_big.txt):

```
403        9l       28w      277c http://10.10.11.125/.htpasswd
403        9l       28w      277c http://10.10.11.125/.htaccess
403        9l       28w      277c http://10.10.11.125/.htaccess.txt
403        9l       28w      277c http://10.10.11.125/.htpasswd.txt
403        9l       28w      277c http://10.10.11.125/.htaccess.html
403        9l       28w      277c http://10.10.11.125/.htpasswd.html
403        9l       28w      277c http://10.10.11.125/.htpasswd.php
403        9l       28w      277c http://10.10.11.125/.htaccess.php
403        9l       28w      277c http://10.10.11.125/.htpasswd.asp
403        9l       28w      277c http://10.10.11.125/.htaccess.asp
403        9l       28w      277c http://10.10.11.125/.htpasswd.aspx
403        9l       28w      277c http://10.10.11.125/.htaccess.aspx
403        9l       28w      277c http://10.10.11.125/.htaccess.jsp
403        9l       28w      277c http://10.10.11.125/.htpasswd.jsp

```
```bash
feroxbuster -u http://10.10.11.125:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt):

```
403        9l       28w      277c http://10.10.11.125/.php
403        9l       28w      277c http://10.10.11.125/.html
403        9l       28w      277c http://10.10.11.125/.html.txt
403        9l       28w      277c http://10.10.11.125/.html.html
403        9l       28w      277c http://10.10.11.125/.html.php
403        9l       28w      277c http://10.10.11.125/.html.asp
403        9l       28w      277c http://10.10.11.125/.html.aspx
403        9l       28w      277c http://10.10.11.125/.html.jsp
301        9l       28w      315c http://10.10.11.125/wp-admin
301        9l       28w      317c http://10.10.11.125/wp-content
301        9l       28w      318c http://10.10.11.125/wp-includes
405        1l        6w       42c http://10.10.11.125/xmlrpc.php
301        0l        0w        0c http://10.10.11.125/index.php
403        9l       28w      277c http://10.10.11.125/.htm
403        9l       28w      277c http://10.10.11.125/.htm.txt
403        9l       28w      277c http://10.10.11.125/.htm.html
403        9l       28w      277c http://10.10.11.125/.htm.php
403        9l       28w      277c http://10.10.11.125/.htm.asp
403        9l       28w      277c http://10.10.11.125/.htm.aspx
403        9l       28w      277c http://10.10.11.125/.htm.jsp

```
