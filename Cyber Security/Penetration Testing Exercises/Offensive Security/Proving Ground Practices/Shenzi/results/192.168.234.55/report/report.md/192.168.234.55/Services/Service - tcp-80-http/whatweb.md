```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.234.55:80 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://192.168.234.55:80
Status    : 302 Found
Title     : <None>
IP        : 192.168.234.55
Country   : RESERVED, ZZ

Summary   : OpenSSL[1.1.1g], X-Powered-By[PHP/7.4.6], PHP[7.4.6], HTTPServer[Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6], RedirectLocation[http://192.168.234.55/dashboard/], Apache[2.4.43]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.43 (from HTTP Server Header)
	Google Dorks: (3)
	Website     : http://httpd.apache.org/

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6 (from server string)

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

	Version      : 7.4.6
	Version      : 7.4.6
	Google Dorks: (2)
	Website     : http://www.php.net/

[ RedirectLocation ]
	HTTP Server string location. used with http-status 301 and
	302

	String       : http://192.168.234.55/dashboard/ (from location)

[ X-Powered-By ]
	X-Powered-By HTTP header

	String       : PHP/7.4.6 (from x-powered-by string)

HTTP Headers:
	HTTP/1.1 302 Found
	Date: Mon, 24 Jan 2022 14:38:31 GMT
	Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
	X-Powered-By: PHP/7.4.6
	Location: http://192.168.234.55/dashboard/
	Content-Length: 0
	Connection: close
	Content-Type: text/html; charset=UTF-8

WhatWeb report for http://192.168.234.55/dashboard/
Status    : 200 OK
Title     : Welcome to XAMPP
IP        : 192.168.234.55
Country   : RESERVED, ZZ

Summary   : OpenSSL[1.1.1g], Script[text/javascript], HTML5, JQuery[1.10.2], PHP[7.4.6], Modernizr, HTTPServer[Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6], Email[fastly-logo@2x.png], Apache[2.4.43]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.43 (from HTTP Server Header)
	Google Dorks: (3)
	Website     : http://httpd.apache.org/

[ Email ]
	Extract email addresses. Find valid email address and
	syntactically invalid email addresses from mailto: link
	tags. We match syntactically invalid links containing
	mailto: to catch anti-spam email addresses, eg. bob at
	gmail.com. This uses the simplified email regular
	expression from
	http://www.regular-expressions.info/email.html for valid
	email address matching.

	String       : fastly-logo@2x.png

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6 (from server string)

[ JQuery ]
	A fast, concise, JavaScript that simplifies how to traverse
	HTML documents, handle events, perform animations, and add
	AJAX.

	Version      : 1.10.2
	Website     : http://jquery.com/

[ Modernizr ]
	Modernizr adds classes to the <html> element which allow
	you to target specific browser functionality in your
	stylesheet. You don't actually need to write any Javascript
	to use it. [JavaScript]

	Website     : http://www.modernizr.com/

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

	Version      : 7.4.6
	Google Dorks: (2)
	Website     : http://www.php.net/

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.

	String       : text/javascript

HTTP Headers:
	HTTP/1.1 200 OK
	Date: Mon, 24 Jan 2022 14:38:37 GMT
	Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
	Last-Modified: Mon, 18 May 2020 06:55:42 GMT
	ETag: "1d98-5a5e6a6bcb780"
	Accept-Ranges: bytes
	Content-Length: 7576
	Connection: close
	Content-Type: text/html



```
