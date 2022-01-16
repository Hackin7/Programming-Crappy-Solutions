```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.123.56:8295 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/tcp_8295_http_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/tcp_8295_http_whatweb.txt):

```
WhatWeb report for http://192.168.123.56:8295
Status    : 200 OK
Title     : Banzai
IP        : 192.168.123.56
Country   : RESERVED, ZZ

Summary   : Script, HTML5, JQuery, HTTPServer[Debian Linux][Apache/2.4.25 (Debian)], Bootstrap, Frame, Email[info@example.com], Apache[2.4.25]

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

[ Bootstrap ]
	Bootstrap is an open source toolkit for developing with
	HTML, CSS, and JS.

	Website     : https://getbootstrap.com/

[ Email ]
	Extract email addresses. Find valid email address and
	syntactically invalid email addresses from mailto: link
	tags. We match syntactically invalid links containing
	mailto: to catch anti-spam email addresses, eg. bob at
	gmail.com. This uses the simplified email regular
	expression from
	http://www.regular-expressions.info/email.html for valid
	email address matching.

	String       : info@example.com

[ Frame ]
	This plugin detects instances of frame and iframe HTML
	elements.


[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : Debian Linux
	String       : Apache/2.4.25 (Debian) (from server string)

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
	Date: Sat, 15 Jan 2022 17:35:53 GMT
	Server: Apache/2.4.25 (Debian)
	Vary: Accept-Encoding
	Content-Encoding: gzip
	Content-Length: 4205
	Connection: close
	Content-Type: text/html; charset=UTF-8



```
