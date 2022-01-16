```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.225.45:80 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://192.168.225.45:80
Status    : 302 Found
Title     : <None>
IP        : 192.168.225.45
Country   : RESERVED, ZZ

Summary   : HTTPServer[GoAhead-Webs], GoAhead-Webs, RedirectLocation[http://192.168.225.45/index.asp]

Detected Plugins:
[ GoAhead-Webs ]
	Opensource, embedded webserver

	Website     : http://embedthis.com/products/goahead/

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : GoAhead-Webs (from server string)

[ RedirectLocation ]
	HTTP Server string location. used with http-status 301 and
	302

	String       : http://192.168.225.45/index.asp (from location)

HTTP Headers:
	HTTP/1.0 302 Redirect
	Server: GoAhead-Webs
	Date: Sun Jan 16 05:11:17 2022
	Pragma: no-cache
	Cache-Control: no-cache
	Content-Type: text/html
	Location: http://192.168.225.45/index.asp

WhatWeb report for http://192.168.225.45/index.asp
Status    : 200 OK
Title     : HP Power Manager
IP        : 192.168.225.45
Country   : RESERVED, ZZ

Summary   : Script[text/javascript], HTTPServer[GoAhead-Webs], GoAhead-Webs, PasswordField[Password]

Detected Plugins:
[ GoAhead-Webs ]
	Opensource, embedded webserver

	Website     : http://embedthis.com/products/goahead/

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : GoAhead-Webs (from server string)

[ PasswordField ]
	find password fields

	String       : Password (from field name)

[ Script ]
	This plugin detects instances of script HTML elements and
	returns the script language/type.

	String       : text/javascript

HTTP Headers:
	HTTP/1.0 200 OK
	Date: Sun Jan 16 05:11:19 2022
	Server: GoAhead-Webs
	Pragma: no-cache
	Cache-Control: no-cache
	Content-type: text/html



```