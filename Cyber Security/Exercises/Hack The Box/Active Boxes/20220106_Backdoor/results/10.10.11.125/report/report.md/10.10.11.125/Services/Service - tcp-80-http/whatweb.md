```bash
whatweb --color=never --no-errors -a 3 -v http://10.10.11.125:80 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_whatweb.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/20220106_Backdoor/results/10.10.11.125/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://10.10.11.125:80
Status    : 200 OK
Title     : Backdoor &#8211; Real-Life
IP        : 10.10.11.125
Country   : RESERVED, ZZ

Summary   : Script, MetaGenerator[WordPress 5.8.1], HTML5, JQuery[3.6.0], HTTPServer[Ubuntu Linux][Apache/2.4.41 (Ubuntu)], UncommonHeaders[link], Email[wordpress@example.com], WordPress[5.8.1], PoweredBy[WordPress], Apache[2.4.41]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.41 (from HTTP Server Header)
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

	String       : wordpress@example.com
	String       : wordpress@example.com

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : Ubuntu Linux
	String       : Apache/2.4.41 (Ubuntu) (from server string)

[ JQuery ]
	A fast, concise, JavaScript that simplifies how to traverse
	HTML documents, handle events, perform animations, and add
	AJAX.

	Version      : 3.6.0
	Website     : http://jquery.com/

[ MetaGenerator ]
	This plugin identifies meta generator tags and extracts its
	value.

	String       : WordPress 5.8.1

[ PoweredBy ]
	This plugin identifies instances of 'Powered by x' text and
	attempts to extract the value for x.

	String       : WordPress

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.


[ UncommonHeaders ]
	Uncommon HTTP server headers. The blacklist includes all
	the standard headers and many non standard but common ones.
	Interesting but fairly common headers should have their own
	plugins, eg. x-powered-by, server and x-aspnet-version.
	Info about headers can be found at www.http-stats.com

	String       : link (from headers)

[ WordPress ]
	WordPress is an opensource blogging system commonly used as
	a CMS.

	Version      : 5.8.1
	Aggressive function available (check plugin file or details).
	Google Dorks: (1)
	Website     : http://www.wordpress.org/

HTTP Headers:
	HTTP/1.1 200 OK
	Date: Thu, 06 Jan 2022 08:50:41 GMT
	Server: Apache/2.4.41 (Ubuntu)
	Link: <http://10.10.11.125/index.php/wp-json/>; rel="https://api.w.org/"
	Link: <http://10.10.11.125/index.php/wp-json/wp/v2/pages/11>; rel="alternate"; type="application/json"
	Link: <http://10.10.11.125/>; rel=shortlink
	Vary: Accept-Encoding
	Content-Encoding: gzip
	Content-Length: 20584
	Connection: close
	Content-Type: text/html; charset=UTF-8



```