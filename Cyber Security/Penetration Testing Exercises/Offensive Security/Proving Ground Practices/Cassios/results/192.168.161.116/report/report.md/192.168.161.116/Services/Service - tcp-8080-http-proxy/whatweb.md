```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.161.116:8080 2>&1
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_whatweb.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_whatweb.txt):

```
WhatWeb report for http://192.168.161.116:8080
Status    : 200 OK
Title     : <None>
IP        : 192.168.161.116
Country   : RESERVED, ZZ

Summary   : X-UA-Compatible[ie=edge], HTML5, UncommonHeaders[x-content-type-options], X-XSS-Protection[1; mode=block], Content-Language[en-US], X-Frame-Options[DENY]

Detected Plugins:
[ Content-Language ]
	Detect the content-language setting from the HTTP header.

	String       : en-US

[ HTML5 ]
	HTML version 5, detected by the doctype declaration


[ UncommonHeaders ]
	Uncommon HTTP server headers. The blacklist includes all
	the standard headers and many non standard but common ones.
	Interesting but fairly common headers should have their own
	plugins, eg. x-powered-by, server and x-aspnet-version.
	Info about headers can be found at www.http-stats.com

	String       : x-content-type-options (from headers)

[ X-Frame-Options ]
	This plugin retrieves the X-Frame-Options value from the
	HTTP header. - More Info:
	http://msdn.microsoft.com/en-us/library/cc288472%28VS.85%29.
	aspx

	String       : DENY

[ X-UA-Compatible ]
	This plugin retrieves the X-UA-Compatible value from the
	HTTP header and meta http-equiv tag. - More Info:
	http://msdn.microsoft.com/en-us/library/cc817574.aspx

	String       : ie=edge

[ X-XSS-Protection ]
	This plugin retrieves the X-XSS-Protection value from the
	HTTP header. - More Info:
	http://msdn.microsoft.com/en-us/library/cc288472%28VS.85%29.
	aspx

	String       : 1; mode=block

HTTP Headers:
	HTTP/1.1 200
	X-Content-Type-Options: nosniff
	X-XSS-Protection: 1; mode=block
	Cache-Control: no-cache, no-store, max-age=0, must-revalidate
	Pragma: no-cache
	Expires: 0
	X-Frame-Options: DENY
	Content-Type: text/html;charset=UTF-8
	Content-Language: en-US
	Transfer-Encoding: chunked
	Date: Sun, 13 Feb 2022 15:58:57 GMT
	Connection: close



```