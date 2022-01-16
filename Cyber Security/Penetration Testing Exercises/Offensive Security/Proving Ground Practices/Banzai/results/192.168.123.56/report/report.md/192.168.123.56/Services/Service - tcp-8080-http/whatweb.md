```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.123.56:8080 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8080/tcp_8080_http_whatweb.txt):

```
WhatWeb report for http://192.168.123.56:8080
Status    : 403 Forbidden
Title     : 403 Forbidden
IP        : 192.168.123.56
Country   : RESERVED, ZZ

Summary   : HTTPServer[Debian Linux][Apache/2.4.25 (Debian)], Apache[2.4.25]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.25 (from HTTP Server Header)
	Google Dorks: (3)
	Website     : http://httpd.apache.org/

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : Debian Linux
	String       : Apache/2.4.25 (Debian) (from server string)

HTTP Headers:
	HTTP/1.1 403 Forbidden
	Date: Sat, 15 Jan 2022 17:33:19 GMT
	Server: Apache/2.4.25 (Debian)
	Content-Length: 281
	Connection: close
	Content-Type: text/html; charset=iso-8859-1



```
