```bash
whatweb --color=never --no-errors -a 3 -v http://10.10.11.120:80 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/tcp_80_http_whatweb.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://10.10.11.120:80
Status    : 200 OK
Title     : DUMB Docs
IP        : 10.10.11.120
Country   : RESERVED, ZZ

Summary   : nginx[1.18.0], Script, X-UA-Compatible[IE=edge], X-Powered-By[Express], HTML5, HTTPServer[Ubuntu Linux][nginx/1.18.0 (Ubuntu)], Bootstrap, Lightbox, Meta-Author[Xiaoying Riley at 3rd Wave Media]

Detected Plugins:
[ Bootstrap ]
	Bootstrap is an open source toolkit for developing with
	HTML, CSS, and JS.

	Website     : https://getbootstrap.com/

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : Ubuntu Linux
	String       : nginx/1.18.0 (Ubuntu) (from server string)

[ Lightbox ]
	Javascript for nice image popups


[ Meta-Author ]
	This plugin retrieves the author name from the meta name
	tag - info:
	http://www.webmarketingnow.com/tips/meta-tags-uncovered.html
	#author

	String       : Xiaoying Riley at 3rd Wave Media

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.


[ X-Powered-By ]
	X-Powered-By HTTP header

	String       : Express (from x-powered-by string)

[ X-UA-Compatible ]
	This plugin retrieves the X-UA-Compatible value from the
	HTTP header and meta http-equiv tag. - More Info:
	http://msdn.microsoft.com/en-us/library/cc817574.aspx

	String       : IE=edge

[ nginx ]
	Nginx (Engine-X) is a free, open-source, high-performance
	HTTP server and reverse proxy, as well as an IMAP/POP3
	proxy server.

	Version      : 1.18.0
	Website     : http://nginx.net/

HTTP Headers:
	HTTP/1.1 200 OK
	Server: nginx/1.18.0 (Ubuntu)
	Date: Thu, 06 Jan 2022 09:30:19 GMT
	Content-Type: text/html; charset=utf-8
	Transfer-Encoding: chunked
	Connection: close
	X-Powered-By: Express
	ETag: W/"3248-nFUp1XavqYRgAFgHenjOsSPQ/e4"
	Content-Encoding: gzip



```
