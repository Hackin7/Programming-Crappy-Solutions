```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.161.116:80 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_whatweb.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://192.168.161.116:80
Status    : 200 OK
Title     : Landed by HTML5 UP
IP        : 192.168.161.116
Country   : RESERVED, ZZ

Summary   : Script, HTML5, JQuery, HTTPServer[CentOS][Apache/2.4.6 (CentOS)], Apache[2.4.6]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.6 (from HTTP Server Header)
	Google Dorks: (3)
	Website     : http://httpd.apache.org/

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : CentOS
	String       : Apache/2.4.6 (CentOS) (from server string)

[ JQuery ]
	A fast, concise, JavaScript that simplifies how to traverse
	HTML documents, handle events, perform animations, and add
	AJAX.

	Website     : http://jquery.com/

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.


HTTP Headers:
	HTTP/1.1 200 OK
	Date: Sun, 13 Feb 2022 15:58:57 GMT
	Server: Apache/2.4.6 (CentOS)
	Last-Modified: Thu, 06 Jun 2019 21:17:00 GMT
	ETag: "2380-58aae3c0d4b00"
	Accept-Ranges: bytes
	Content-Length: 9088
	Connection: close
	Content-Type: text/html; charset=UTF-8



```
