```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.161.58:80 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_whatweb.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://192.168.161.58:80
Status    : 200 OK
Title     : Simple PHP Photo Gallery
IP        : 192.168.161.58
Country   : RESERVED, ZZ

Summary   : Script, X-Powered-By[PHP/5.4.16], HTML5, JQuery[1.7.2], PHP[5.4.16], HTTPServer[CentOS][Apache/2.4.6 (CentOS) PHP/5.4.16], Google-Analytics [UA-2196019-1], Lightbox, Apache[2.4.6]

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

[ Google-Analytics ]
	This plugin identifies the Google Analytics account.

	Account      : UA-2196019-1
	Website     : http://www.google.com/analytics/

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : CentOS
	String       : Apache/2.4.6 (CentOS) PHP/5.4.16 (from server string)

[ JQuery ]
	A fast, concise, JavaScript that simplifies how to traverse
	HTML documents, handle events, perform animations, and add
	AJAX.

	Version      : 1.7.2
	Website     : http://jquery.com/

[ Lightbox ]
	Javascript for nice image popups


[ PHP ]
	PHP is a widely-used general-purpose scripting language
	that is especially suited for Web development and can be
	embedded into HTML. This plugin identifies PHP errors,
	modules and versions and extracts the local file path and
	username if present.

	Version      : 5.4.16
	Version      : 5.4.16
	Google Dorks: (2)
	Website     : http://www.php.net/

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.


[ X-Powered-By ]
	X-Powered-By HTTP header

	String       : PHP/5.4.16 (from x-powered-by string)

HTTP Headers:
	HTTP/1.1 200 OK
	Date: Sun, 13 Feb 2022 11:23:32 GMT
	Server: Apache/2.4.6 (CentOS) PHP/5.4.16
	X-Powered-By: PHP/5.4.16
	Content-Length: 2730
	Connection: close
	Content-Type: text/html; charset=UTF-8



```
