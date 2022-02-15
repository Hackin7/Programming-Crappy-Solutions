```bash
feroxbuster -u http://192.168.161.116:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/common.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_common.txt):

```
WLD        0l        0w        0c Got 302 for http://192.168.161.116:8080/71486d4f2646452c8b91e96cce691864 (url length: 32)
WLD         -         -         - http://192.168.161.116:8080/71486d4f2646452c8b91e96cce691864 redirects to => http://192.168.161.116:8080/login

```
```bash
feroxbuster -u http://192.168.161.116:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/big.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_big.txt):

```
WLD        0l        0w        0c Got 302 for http://192.168.161.116:8080/efc29682d43543f3a20ddfe8d3afbd93 (url length: 32)
WLD         -         -         - http://192.168.161.116:8080/efc29682d43543f3a20ddfe8d3afbd93 redirects to => http://192.168.161.116:8080/login

```
```bash
feroxbuster -u http://192.168.161.116:8080/ -t 10 -w /usr/share/seclists/Discovery/Web-Content/raft-large-words.txt -x "txt,html,php,asp,aspx,jsp" -v -k -n -q -o "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt"
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_feroxbuster_raft-large-words.txt):

```
WLD        0l        0w        0c Got 302 for http://192.168.161.116:8080/e797686a3a614a1182ab749fe07c247c (url length: 32)
WLD         -         -         - http://192.168.161.116:8080/e797686a3a614a1182ab749fe07c247c redirects to => http://192.168.161.116:8080/login

```
