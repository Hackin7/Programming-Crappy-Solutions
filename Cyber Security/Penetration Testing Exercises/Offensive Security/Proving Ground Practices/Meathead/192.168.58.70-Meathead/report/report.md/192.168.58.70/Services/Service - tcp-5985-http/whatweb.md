```bash
whatweb --color=never --no-errors -a 3 -v http://192.168.58.70:5985 2>&1
```

[/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_whatweb.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_whatweb.txt):

```
WhatWeb report for http://192.168.58.70:5985
Status    : 404 Not Found
Title     : Not Found
IP        : 192.168.58.70
Country   : RESERVED, ZZ

Summary   : Microsoft-HTTPAPI[2.0], HTTPServer[Microsoft-HTTPAPI/2.0]

Detected Plugins:
[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	String       : Microsoft-HTTPAPI/2.0 (from server string)

[ Microsoft-HTTPAPI ]
	The HTTP Server API enables applications to communicate
	over HTTP without using Microsoft Internet Information
	Server (IIS). Applications can register to receive HTTP
	requests for particular URLs, receive HTTP requests, and
	send HTTP responses. The HTTP Server API includes SSL
	support so that applications can exchange data over secure
	HTTP connections without IIS. It is also designed to work
	with I/O completion ports.

	Version      : 2.0
	Website     : http://msdn.microsoft.com/en-us/library/aa364510%28v=vs.85%29.aspx

HTTP Headers:
	HTTP/1.1 404 Not Found
	Content-Type: text/html; charset=us-ascii
	Server: Microsoft-HTTPAPI/2.0
	Date: Wed, 19 Jan 2022 10:48:58 GMT
	Connection: close
	Content-Length: 315



```