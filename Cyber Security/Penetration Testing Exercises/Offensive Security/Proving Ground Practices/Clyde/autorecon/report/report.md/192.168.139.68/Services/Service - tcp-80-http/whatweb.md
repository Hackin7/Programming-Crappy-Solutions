```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.139.68:80 2>&1
```

[/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_whatweb.txt](file:///root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://192.168.139.68:80
Status    : 200 OK
Title     : Apache2 Debian Default Page: It works
IP        : 192.168.139.68
Country   : RESERVED, ZZ

Summary   : Apache[2.4.25], HTTPServer[Debian Linux][Apache/2.4.25 (Debian)]

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
	HTTP/1.1 200 OK
	Date: Sun, 30 Jan 2022 09:03:00 GMT
	Server: Apache/2.4.25 (Debian)
	Last-Modified: Fri, 24 Apr 2020 09:41:19 GMT
	ETag: "29cd-5a4062ae58563-gzip"
	Accept-Ranges: bytes
	Vary: Accept-Encoding
	Content-Encoding: gzip
	Content-Length: 3041
	Connection: close
	Content-Type: text/html



```