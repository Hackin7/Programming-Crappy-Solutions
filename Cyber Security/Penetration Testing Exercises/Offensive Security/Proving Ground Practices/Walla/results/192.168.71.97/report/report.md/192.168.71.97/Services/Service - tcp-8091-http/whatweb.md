```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.71.97:8091 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Walla/results/192.168.71.97/scans/tcp8091/tcp_8091_http_whatweb.txt):

```
WhatWeb report for http://192.168.71.97:8091
Status    : 401 Unauthorized
Title     : <None>
IP        : 192.168.71.97
Country   : RESERVED, ZZ

Summary   : HTTPServer[lighttpd/1.4.53], WWW-Authenticate[RaspAP][Basic], lighttpd[1.4.53], Cookies[PHPSESSID]

Detected Plugins:
[ Cookies ]
	Display the names of cookies in the HTTP headers. The
	values are not returned to save on space.

	String       : PHPSESSID

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : lighttpd/1.4.53 (from server string)

[ WWW-Authenticate ]
	This plugin identifies the WWW-Authenticate HTTP header and
	extracts the authentication method and realm.

	Module       : Basic
	String       : RaspAP

[ lighttpd ]
	Lightweight open-source web server.

	Version      : 1.4.53
	Website     : http://www.lighttpd.net/

HTTP Headers:
	HTTP/1.1 401 Unauthorized
	Set-Cookie: PHPSESSID=oe95bnp52ln47q52iqovoa9279; path=/
	Expires: Thu, 19 Nov 1981 08:52:00 GMT
	Cache-Control: no-store, no-cache, must-revalidate
	Pragma: no-cache
	WWW-Authenticate: Basic realm="RaspAP"
	Content-type: text/html; charset=UTF-8
	Content-Length: 15
	Connection: close
	Date: Sun, 27 Feb 2022 17:02:01 GMT
	Server: lighttpd/1.4.53



```