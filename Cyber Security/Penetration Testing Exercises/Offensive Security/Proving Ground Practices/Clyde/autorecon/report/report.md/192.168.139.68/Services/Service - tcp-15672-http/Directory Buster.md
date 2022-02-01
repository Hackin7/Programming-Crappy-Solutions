```bash
feroxbuster -u http://192.168.139.68:15672/ -t 10 -w /root/.config/AutoRecon/wordlists/dirbuster.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -e -o "/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_feroxbuster_dirbuster.txt"
```

[/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_feroxbuster_dirbuster.txt](file:///root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_feroxbuster_dirbuster.txt):

```
200      954l     2552w    26305c http://192.168.139.68:15672/doc/stats.html
200      854l     2860w    29930c http://192.168.139.68:15672/api
403        0l        0w        0c http://192.168.139.68:15672/css
403        0l        0w        0c http://192.168.139.68:15672/doc
200        1l        7w     1150c http://192.168.139.68:15672/favicon.ico
403        0l        0w        0c http://192.168.139.68:15672/img
200       32l       77w     1391c http://192.168.139.68:15672/index.html
200      327l     1272w    11442c http://192.168.139.68:15672/js/charts.js
200        1l        5w       31c http://192.168.139.68:15672/css/evil.css
200      353l     2073w    15682c http://192.168.139.68:15672/css/main.css
200      154l      724w     4931c http://192.168.139.68:15672/js/base64.js
200     1454l     4421w    45986c http://192.168.139.68:15672/js/main.js
200      924l     3237w    26857c http://192.168.139.68:15672/js/formatters.js
200      628l     3400w    31958c http://192.168.139.68:15672/js/global.js
200      165l      494w     4201c http://192.168.139.68:15672/js/prefs.js
403        0l        0w        0c http://192.168.139.68:15672/js
200       42l      189w     1603c http://192.168.139.68:15672/cli
301        0l        0w        0c http://192.168.139.68:15672/mgmt
200       32l       77w     1391c http://192.168.139.68:15672/

```
