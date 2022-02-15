```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.58.70:80 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_whatweb.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_whatweb.txt):

```
WhatWeb report for http://192.168.58.70:80
Status    : 200 OK
Title     : ,Plantronics
IP        : 192.168.58.70
Country   : RESERVED, ZZ

Summary   : X-Powered-By[ASP.NET], ASP_NET[4.0.30319], HTTPServer[Microsoft-IIS/10.0], PasswordField[ctl00$ContentPlaceHolder1$PasswordTextBox], Microsoft-IIS[10.0]

Detected Plugins:
[ ASP_NET ]
	ASP.NET is a free web framework that enables great Web
	applications. Used by millions of developers, it runs some
	of the biggest sites in the world.

	Version      : 4.0.30319 (from X-AspNet-Version HTTP header)
	Google Dorks: (2)
	Website     : https://www.asp.net/

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : Microsoft-IIS/10.0 (from server string)

[ Microsoft-IIS ]
	Microsoft Internet Information Services (IIS) for Windows
	Server is a flexible, secure and easy-to-manage Web server
	for hosting anything on the Web. From media streaming to
	web application hosting, IIS's scalable and open
	architecture is ready to handle the most demanding tasks.

	Version      : 10.0
	Website     : http://www.iis.net/

[ PasswordField ]
	find password fields

	String       : ctl00$ContentPlaceHolder1$PasswordTextBox (from field name)

[ X-Powered-By ]
	X-Powered-By HTTP header

	String       : ASP.NET (from x-powered-by string)

HTTP Headers:
	HTTP/1.1 200 OK
	Cache-Control: private
	Content-Type: text/html; charset=utf-8
	Server: Microsoft-IIS/10.0
	X-AspNet-Version: 4.0.30319
	X-Powered-By: ASP.NET
	Date: Wed, 19 Jan 2022 10:45:14 GMT
	Connection: close
	Content-Length: 1769



```
