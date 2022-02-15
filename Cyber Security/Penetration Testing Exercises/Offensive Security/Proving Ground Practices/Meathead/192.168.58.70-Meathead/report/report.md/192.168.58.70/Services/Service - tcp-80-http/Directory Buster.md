```bash
feroxbuster -u http://192.168.58.70:80/ -t 10 -w /root/.config/AutoRecon/wordlists/dirbuster.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -e -o "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt"
```

[/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_feroxbuster_dirbuster.txt):

```
200        5l       22w     1030c http://192.168.58.70/images/favicon.png
200       10l       32w     1818c http://192.168.58.70/images/plt-hub-orange.png
200        4l        7w       44c http://192.168.58.70/css/style.css
301        2l       10w      151c http://192.168.58.70/Images
200       37l      100w     1781c http://192.168.58.70/Default.aspx
301        2l       10w      148c http://192.168.58.70/css
200       37l      100w     1781c http://192.168.58.70/default.aspx
301        2l       10w      151c http://192.168.58.70/images
301        2l       10w      151c http://192.168.58.70/master
200       37l      100w     1769c http://192.168.58.70/
301        2l       10w      148c http://192.168.58.70/CSS
301        2l       10w      148c http://192.168.58.70/Css
301        2l       10w      151c http://192.168.58.70/IMAGES
301        2l       10w      151c http://192.168.58.70/Master
200       37l      100w     1781c http://192.168.58.70/DEFAULT.aspx

```
