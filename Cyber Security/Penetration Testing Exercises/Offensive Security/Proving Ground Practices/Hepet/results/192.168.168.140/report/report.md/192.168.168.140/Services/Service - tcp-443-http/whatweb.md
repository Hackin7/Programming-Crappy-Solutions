```bash
whatweb --color=never --no-errors -a 3 -v https://192.168.168.140:443 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/tcp_443_https_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/tcp_443_https_whatweb.txt):

```
WhatWeb report for https://192.168.168.140:443
Status    : 200 OK
Title     : Time Travel Company Page
IP        : 192.168.168.140
Country   : RESERVED, ZZ

Summary   : OpenSSL[1.1.1g], Script, HTML5, JQuery, PHP[7.3.23], HTTPServer[Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23], Bootstrap, Email[myemail@something.com], Apache[2.4.46]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.46 (from HTTP Server Header)
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

	String       : myemail@something.com

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23 (from server string)

[ JQuery ]
	A fast, concise, JavaScript that simplifies how to traverse
	HTML documents, handle events, perform animations, and add
	AJAX.

	Website     : http://jquery.com/

[ OpenSSL ]
	The OpenSSL Project is a collaborative effort to develop a
	robust, commercial-grade, full-featured, and Open Source
	toolkit implementing the Secure Sockets Layer (SSL v2/v3)
	and Transport Layer Security (TLS v1) protocols as well as
	a full-strength general purpose cryptography library.

	Version      : 1.1.1g
	Website     : http://www.openssl.org/

[ PHP ]
	PHP is a widely-used general-purpose scripting language
	that is especially suited for Web development and can be
	embedded into HTML. This plugin identifies PHP errors,
	modules and versions and extracts the local file path and
	username if present.

	Version      : 7.3.23
	Google Dorks: (2)
	Website     : http://www.php.net/

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.


HTTP Headers:
	HTTP/1.1 200 OK
	Date: Sat, 05 Mar 2022 17:15:39 GMT
	Server: Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23
	Last-Modified: Tue, 20 Oct 2020 20:34:20 GMT
	ETag: "32e8-5b22027cd0b00"
	Accept-Ranges: bytes
	Content-Length: 13032
	Connection: close
	Content-Type: text/html



```