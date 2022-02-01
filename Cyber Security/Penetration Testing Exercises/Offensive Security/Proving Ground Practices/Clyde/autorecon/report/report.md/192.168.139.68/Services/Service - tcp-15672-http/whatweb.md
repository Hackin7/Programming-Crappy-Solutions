```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.139.68:15672 2>&1
```

[/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_whatweb.txt](file:///root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_whatweb.txt):

```
WhatWeb report for http://192.168.139.68:15672
Status    : 200 OK
Title     : RabbitMQ Management
IP        : 192.168.139.68
Country   : RESERVED, ZZ

Summary   : JQuery[1.12.4], HTTPServer[Cowboy], HTML5, X-UA-Compatible[IE=edge], Script[text/javascript]

Detected Plugins:
[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : Cowboy (from server string)

[ JQuery ]
	A fast, concise, JavaScript that simplifies how to traverse
	HTML documents, handle events, perform animations, and add
	AJAX.

	Version      : 1.12.4
	Website     : http://jquery.com/

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.

	String       : text/javascript

[ X-UA-Compatible ]
	This plugin retrieves the X-UA-Compatible value from the
	HTTP header and meta http-equiv tag. - More Info:
	http://msdn.microsoft.com/en-us/library/cc817574.aspx

	String       : IE=edge

HTTP Headers:
	HTTP/1.1 200 OK
	connection: close
	server: Cowboy
	date: Sun, 30 Jan 2022 09:06:02 GMT
	content-length: 1391
	content-type: text/html
	etag: "3678489298"
	last-modified: Wed, 10 Mar 2021 20:43:59 GMT



```
