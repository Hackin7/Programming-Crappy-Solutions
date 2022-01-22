```bash
whatweb --color=never --no-errors -a 3 -v https://192.168.196.44:443 2>&1
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/tcp_443_https_whatweb.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/tcp_443_https_whatweb.txt):

```
WhatWeb report for https://192.168.196.44:443
Status    : 200 OK
Title     : Index of /
IP        : 192.168.196.44
Country   : RESERVED, ZZ

Summary   : OpenSSL[1.0.1p], PHP[5.6.12], HTTPServer[Windows (32 bit)][Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12], Index-Of, Apache[2.4.16]

Detected Plugins:
[ Apache ]
	The Apache HTTP Server Project is an effort to develop and
	maintain an open-source HTTP server for modern operating
	systems including UNIX and Windows NT. The goal of this
	project is to provide a secure, efficient and extensible
	server that provides HTTP services in sync with the current
	HTTP standards.

	Version      : 2.4.16 (from HTTP Server Header)
	Google Dorks: (3)
	Website     : http://httpd.apache.org/

[ HTTPServer ]
	HTTP server header string. This plugin also attempts to
	identify the operating system from the server header.

	OS           : Windows (32 bit)
	String       : Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12 (from server string)

[ Index-Of ]
	Index of

	Google Dorks: (1)

[ OpenSSL ]
	The OpenSSL Project is a collaborative effort to develop a
	robust, commercial-grade, full-featured, and Open Source
	toolkit implementing the Secure Sockets Layer (SSL v2/v3)
	and Transport Layer Security (TLS v1) protocols as well as
	a full-strength general purpose cryptography library.

	Version      : 1.0.1p
	Website     : http://www.openssl.org/

[ PHP ]
	PHP is a widely-used general-purpose scripting language
	that is especially suited for Web development and can be
	embedded into HTML. This plugin identifies PHP errors,
	modules and versions and extracts the local file path and
	username if present.

	Version      : 5.6.12
	Google Dorks: (2)
	Website     : http://www.php.net/

HTTP Headers:
	HTTP/1.1 200 OK
	Date: Fri, 21 Jan 2022 12:57:21 GMT
	Server: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
	Content-Length: 797
	Connection: close
	Content-Type: text/html;charset=UTF-8



```
