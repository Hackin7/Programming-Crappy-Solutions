```bash
feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_common.txt"
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_common.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_common.txt):

```
200      154l      336w        0c http://192.168.225.45/Index.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin
200        4l       18w        0c http://192.168.225.45/cgi-bin/
200        4l       15w        0c http://192.168.225.45/cgi-bin.txt
200        4l       18w        0c http://192.168.225.45/cgi-bin/.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin2
200        4l       15w        0c http://192.168.225.45/cgi-bin.html
200        4l       18w        0c http://192.168.225.45/cgi-bin/.html
200        4l       15w        0c http://192.168.225.45/cgi-bin2.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin.php
200        4l       18w        0c http://192.168.225.45/cgi-bin/.php
200        4l       15w        0c http://192.168.225.45/cgi-bin2.html
200        4l       15w        0c http://192.168.225.45/cgi-bin.asp
200        4l       18w        0c http://192.168.225.45/cgi-bin/.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin2.php
200        4l       15w        0c http://192.168.225.45/cgi-bin.aspx
200        4l       18w        0c http://192.168.225.45/cgi-bin/.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin2.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin.jsp
200        4l       18w        0c http://192.168.225.45/cgi-bin/.jsp
200        4l       15w        0c http://192.168.225.45/cgi-bin2.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin2.jsp
302        5l       20w        0c http://192.168.225.45/contents
200      154l      336w        0c http://192.168.225.45/index.asp
200        0l        0w        0c http://192.168.225.45/nul
200        0l        0w        0c http://192.168.225.45/nul.txt
200        0l        0w        0c http://192.168.225.45/nul.html
200        0l        0w        0c http://192.168.225.45/nul.php
200        0l        0w        0c http://192.168.225.45/nul.asp
200        0l        0w        0c http://192.168.225.45/nul.aspx
200        0l        0w        0c http://192.168.225.45/nul.jsp

```
```bash
feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_big.txt"
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_big.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_big.txt):

```
200      154l      336w        0c http://192.168.225.45/Index.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin
200        4l       15w        0c http://192.168.225.45/cgi-bin.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin-church
200        4l       15w        0c http://192.168.225.45/cgi-bin.html
200        4l       15w        0c http://192.168.225.45/cgi-bin-church.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug
200        4l       15w        0c http://192.168.225.45/cgi-bin.php
200        4l       15w        0c http://192.168.225.45/cgi-bin-church.html
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin-live
200        4l       15w        0c http://192.168.225.45/cgi-bin.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin-church.php
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug.html
200        4l       15w        0c http://192.168.225.45/cgi-bin-live.txt
200        4l       18w        0c http://192.168.225.45/cgi-bin/
200        4l       15w        0c http://192.168.225.45/cgi-bin2
200        4l       15w        0c http://192.168.225.45/cgi-bin.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin-church.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug.php
200        4l       15w        0c http://192.168.225.45/cgi-bin-live.html
200        4l       18w        0c http://192.168.225.45/cgi-bin/.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl
200        4l       15w        0c http://192.168.225.45/cgi-bin2.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin.jsp
200        4l       15w        0c http://192.168.225.45/cgi-bin-church.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin-live.php
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug.asp
200        4l       18w        0c http://192.168.225.45/cgi-bin/.html
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl.txt
200        4l       15w        0c http://192.168.225.45/cgi-bin2.html
200        4l       15w        0c http://192.168.225.45/cgi-bin-church.jsp
200        4l       15w        0c http://192.168.225.45/cgi-bin-live.asp
200        4l       18w        0c http://192.168.225.45/cgi-bin/.php
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl.html
200        4l       15w        0c http://192.168.225.45/cgi-bin2.php
200        4l       15w        0c http://192.168.225.45/cgi-bin-live.aspx
200        4l       18w        0c http://192.168.225.45/cgi-bin/.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin-debug.jsp
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl.php
200        4l       15w        0c http://192.168.225.45/cgi-bin2.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin-live.jsp
200        4l       18w        0c http://192.168.225.45/cgi-bin/.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl.asp
200        4l       15w        0c http://192.168.225.45/cgi-bin2.aspx
200        4l       18w        0c http://192.168.225.45/cgi-bin/.jsp
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl.aspx
200        4l       15w        0c http://192.168.225.45/cgi-bin2.jsp
200        4l       15w        0c http://192.168.225.45/cgi-bin_ssl.jsp

```
```bash
feroxbuster -u http://192.168.225.45:80/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt"
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_feroxbuster_raft-large-words.txt):

```

```
