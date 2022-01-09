```bash
whatweb --color=never --no-errors -a 3 -v http://10.10.11.120:3000 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp3000/tcp_3000_http_whatweb.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp3000/tcp_3000_http_whatweb.txt):

```
WhatWeb report for http://10.10.11.120:3000
Status    : 200 OK
Title     : DUMB Docs
IP        : 10.10.11.120
Country   : RESERVED, ZZ

Summary   : Script, X-UA-Compatible[IE=edge], X-Powered-By[Express], HTML5, Bootstrap, Lightbox, Meta-Author[Xiaoying Riley at 3rd Wave Media]

Detected Plugins:
[ Bootstrap ]
	Bootstrap is an open source toolkit for developing with
	HTML, CSS, and JS.

	Website     : https://getbootstrap.com/

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


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

HTTP Headers:
	HTTP/1.1 200 OK
	X-Powered-By: Express
	Content-Type: text/html; charset=utf-8
	Content-Length: 12872
	ETag: W/"3248-nFUp1XavqYRgAFgHenjOsSPQ/e4"
	Date: Thu, 06 Jan 2022 09:30:19 GMT
	Connection: close



```
