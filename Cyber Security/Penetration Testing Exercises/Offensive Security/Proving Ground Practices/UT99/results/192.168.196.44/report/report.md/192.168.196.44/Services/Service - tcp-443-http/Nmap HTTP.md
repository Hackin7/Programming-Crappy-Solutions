```bash
nmap -vv --reason -Pn -T4 -sV -p 443 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/tcp_443_https_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/tcp_443_https_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 07:57:11 2022 as: nmap -vv --reason -Pn -T4 -sV -p 443 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:57:13 EST for 295s

PORT    STATE SERVICE  REASON          VERSION
443/tcp open  ssl/http syn-ack ttl 127 Apache httpd 2.4.16 (OpenSSL/1.0.1p PHP/5.6.12)
|_http-aspnet-debug: ERROR: Script execution failed (use -d to debug)
| http-auth-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.196.44
|   url                                                                                                   method
|   https://192.168.196.44:443/public_html/                                                               FORM
|   https://192.168.196.44:443/public_html/index.php?sid=1&amp;name=News&amp;file=articleghz%3ehzx%22zxc  FORM
|   https://192.168.196.44:443/public_html/index.php?name=coppermine&amp;file=search                      FORM
|   https://192.168.196.44:443/public_html/index.php?name=Your_Account&amp;profile=kermit                 FORM
|   https://192.168.196.44:443/public_html/index.php?name=Surveys                                         FORM
|   https://192.168.196.44:443/public_html/index.php?callback=test                                        FORM
|   https://192.168.196.44:443/public_html/?callback=test                                                 FORM
|   https://192.168.196.44:443/public_html/index.php?file=article&amp;name=Newsghz%3ehzx%22zxc            FORM
|   https://192.168.196.44:443/public_html/index.php?name=Contact                                         FORM
|_  https://192.168.196.44:443/public_html/index.php?name=News&amp;topic=0                                FORM
|_http-chrono: Request times for /; avg: 1166.40ms; min: 1122.16ms; max: 1193.57ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.196.44
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 7
|     Comment: 
|          // Are we using Internet Explorer Version 5 and up?
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 9
|     Comment: 
|          // Current help position and main window size
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 4
|     Comment: 
|         
|         // of the GNU GENERAL PUBLIC LICENSE Version 2.
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 2
|     Comment: 
|         
|         // Bubblehelp infoboxes, (C) 2002 Klaus Knopper <infobox@knopper.net>
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 10
|     Comment: 
|          // Pointer to infodiv container
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 44
|     Comment: 
|          // middle of window
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 42
|     Comment: 
|          // konqueror can't get mouse position
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 31
|     Comment: 
|         
|         // Prepare tip boxes, but don't show them yet
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/blockscript.js
|     Line number: 49
|     Comment: 
|          // "domain=cpgnuke.com;";
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 72
|     Comment: 
|         
|         // Initialize after loading the page
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 6
|     Comment: 
|          // Tip box width
|     
|     Path: http://192.168.196.44:443/public_html/includes/javascript/infobox.js
|     Line number: 8
|     Comment: 
|_         // Are we using KDE Konqueror?
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.196.44
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: https://192.168.196.44:443/public_html/
|     Form id: 
|     Form action: /public_html/
|     
|     Path: https://192.168.196.44:443/public_html/index.php?sid=1&amp;name=News&amp;file=articleghz%3ehzx%22zxc
|     Form id: 
|     Form action: /public_html/index.php?sid=1&name=News&file=articleghz%3ehzx%22zxc
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=coppermine&amp;file=search
|     Form id: 
|     Form action: /public_html/index.php?name=coppermine&file=search
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=Your_Account&amp;profile=kermit
|     Form id: 
|     Form action: /public_html/index.php?name=Your_Account&profile=kermit
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=Your_Account&amp;profile=kermit
|     Form id: ulogin2
|     Form action: index.php?name=Your_Account
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=Surveys
|     Form id: 
|     Form action: /public_html/index.php?name=Surveys
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=Surveys
|     Form id: 
|     Form action: index.php?name=Surveys
|     
|     Path: https://192.168.196.44:443/public_html/index.php?callback=test
|     Form id: 
|     Form action: /public_html/index.php?callback=test
|     
|     Path: https://192.168.196.44:443/public_html/?callback=test
|     Form id: 
|     Form action: /public_html/?callback=test
|     
|     Path: https://192.168.196.44:443/public_html/index.php?file=article&amp;name=Newsghz%3ehzx%22zxc
|     Form id: 
|     Form action: /public_html/index.php?name=News
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=Contact
|     Form id: 
|     Form action: /public_html/index.php?name=Contact
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=Contact
|     Form id: email_mod
|     Form action: index.php?name=Contact
|     
|     Path: https://192.168.196.44:443/public_html/index.php?name=News&amp;topic=0
|     Form id: 
|_    Form action: /public_html/index.php?name=News&topic=0
|_http-date: Fri, 21 Jan 2022 12:57:49 GMT; -4s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /: Root directory w/ listing on 'apache/2.4.16 (win32) openssl/1.0.1p php/5.6.12'
|   /phpmyadmin/: phpMyAdmin
|_  /icons/: Potentially interesting folder w/ directory listing
| http-errors: 
| Spidering limited to: maxpagecount=40; withinhost=192.168.196.44
|   Found the following error pages: 
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?sid=1&amp;name=News&amp;file=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=http://tools.ietf.org/html/rfc13?&amp;file=register
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?sid=1&amp;name=http://tools.ietf.org/html/rfc13?&amp;file=print
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=Your_Account&amp;op=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=Forums&amp;file=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=Your_Account&amp;file=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=News&amp;topic=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 403
|   	http://192.168.196.44:80/public_html/index.php?name=coppermine&amp;file=http://tools.ietf.org/html/rfc13?
|   
|   Error Code: 503
|   	http://192.168.196.44:443/public_html/index.php?name=Forums&amp;file=search
|   
|   Error Code: 503
|_  	http://192.168.196.44:443/public_html/index.php?name=Members_List
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-grep: 
|   (1) https://192.168.196.44:443/: 
|     (1) ip: 
|_      + 192.168.196.44
| http-headers: 
|   Date: Fri, 21 Jan 2022 12:57:39 GMT
|   Server: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
|   Connection: close
|   Content-Type: text/html;charset=UTF-8
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-mobileversion-checker: No mobile version detected.
|_http-php-version: Logo query returned unknown hash 4fa509f135e47e9f26cf9bb751fa1bd2
|_http-referer-checker: Couldn't find any cross-domain scripts.
| http-security-headers: 
|   Strict_Transport_Security: 
|_    HSTS not configured in HTTPS Server
|_http-server-header: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1
|     /icons/
|       gif: 2
|     /public_html/
|       Other: 1; php: 1
|     /public_html/images/
|       gif: 1
|     /public_html/images/blocks/
|       gif: 1
|   Longest directory structure:
|     Depth: 3
|     Dir: /public_html/images/blocks/
|   Total files found (by extension):
|_    Other: 2; gif: 4; php: 1
| http-sql-injection: 
|   Possible sqli for queries:
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:443/?C=S%3bO%3dA%27%20OR%20sqlspider
|_    http://192.168.196.44:443/?C=N%3bO%3dA%27%20OR%20sqlspider
| http-stored-xss: 
|   Found the following stored XSS vulnerabilities: 
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?sid=1&amp;name=News&amp;file=articleghz%3ehzx%22zxc
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?name=coppermine&amp;file=search
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?name=Your_Account&amp;profile=kermit
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?name=Surveys
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?callback=test
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/?callback=test
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?file=article&amp;name=Newsghz%3ehzx%22zxc
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?name=Contact
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: https://192.168.196.44:443/public_html/index.php?name=News&amp;topic=0
|_	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|_http-title: Bad request!
| http-trace: TRACE is enabled
| Headers:
| Date: Fri, 21 Jan 2022 12:57:33 GMT
| Server: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
| Connection: close
| Transfer-Encoding: chunked
|_Content-Type: message/http
| http-unsafe-output-escaping: 
|   Characters ['] reflected in parameter call at http://192.168.196.44:443/public_html/?call=test
|_  Characters ['] reflected in parameter profile at http://192.168.196.44:443/public_html/index.php?name=Your_Account&amp;profile=kermit
| http-useragent-tester: 
|   Status for browser useragent: 200
|   Allowed User Agents: 
|     Mozilla/5.0 (compatible; Nmap Scripting Engine; https://nmap.org/book/nse.html)
|     libwww
|     lwp-trivial
|     libcurl-agent/1.0
|     PHP/
|     Python-urllib/2.5
|     GT::WWW
|     Snoopy
|     MFC_Tear_Sample
|     HTTP::Lite
|     PHPCrawl
|     URI::Fetch
|     Zend_Http_Client
|     http client
|     PECL::HTTP
|     Wget/1.13.4 (linux-gnu)
|_    WWW-Mechanize/1.34
| http-vhosts: 
| squid : 400
| aptest : 400
| sip : 400
| stage : 400
| vm : 400
| beta : 400
|_122 names had status 200
| http-waf-detect: IDS/IPS/WAF detected:
|_192.168.196.44:443/?p4yl04d3=<script>alert(document.cookie)</script>
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
| ssl-cert: Subject: commonName=localhost
| Issuer: commonName=localhost
| Public Key type: rsa
| Public Key bits: 1024
| Signature Algorithm: sha1WithRSAEncryption
| Not valid before: 2009-11-10T23:48:47
| Not valid after:  2019-11-08T23:48:47
| MD5:   a0a4 4cc9 9e84 b26f 9e63 9f9e d229 dee0
| SHA-1: b023 8c54 7a90 5bfa 119c 4e8b acca eacf 3649 1ff6
| -----BEGIN CERTIFICATE-----
| MIIBnzCCAQgCCQC1x1LJh4G1AzANBgkqhkiG9w0BAQUFADAUMRIwEAYDVQQDEwls
| b2NhbGhvc3QwHhcNMDkxMTEwMjM0ODQ3WhcNMTkxMTA4MjM0ODQ3WjAUMRIwEAYD
| VQQDEwlsb2NhbGhvc3QwgZ8wDQYJKoZIhvcNAQEBBQADgY0AMIGJAoGBAMEl0yfj
| 7K0Ng2pt51+adRAj4pCdoGOVjx1BmljVnGOMW3OGkHnMw9ajibh1vB6UfHxu463o
| J1wLxgxq+Q8y/rPEehAjBCspKNSq+bMvZhD4p8HNYMRrKFfjZzv3ns1IItw46kgT
| gDpAl1cMRzVGPXFimu5TnWMOZ3ooyaQ0/xntAgMBAAEwDQYJKoZIhvcNAQEFBQAD
| gYEAavHzSWz5umhfb/MnBMa5DL2VNzS+9whmmpsDGEG+uR0kM1W2GQIdVHHJTyFd
| aHXzgVJBQcWTwhp84nvHSiQTDBSaT6cQNQpvag/TaED/SEQpm0VqDFwpfFYuufBL
| vVNbLkKxbK2XwUvu0RxoLdBMC/89HqrZ0ppiONuQ+X2MtxE=
|_-----END CERTIFICATE-----
|_ssl-date: TLS randomness does not represent time
| ssl-dh-params: 
|   VULNERABLE:
|   Diffie-Hellman Key Exchange Insufficient Group Strength
|     State: VULNERABLE
|       Transport Layer Security (TLS) services that use Diffie-Hellman groups
|       of insufficient strength, especially those using one of a few commonly
|       shared groups, may be susceptible to passive eavesdropping attacks.
|     Check results:
|       WEAK DH GROUP 1
|             Cipher Suite: TLS_DHE_RSA_WITH_AES_256_CBC_SHA
|             Modulus Type: Safe prime
|             Modulus Source: RFC2409/Oakley Group 2
|             Modulus Length: 1024
|             Generator Length: 8
|             Public Key Length: 1024
|     References:
|_      https://weakdh.org
| ssl-enum-ciphers: 
|   TLSv1.0: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 1024) - A
|       TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA (secp256r1) - D
|       TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA (dh 1024) - D
|       TLS_RSA_WITH_3DES_EDE_CBC_SHA (rsa 1024) - D
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_IDEA_CBC_SHA (rsa 1024) - A
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher 3DES vulnerable to SWEET32 attack
|       64-bit block cipher IDEA vulnerable to SWEET32 attack
|       Weak certificate signature: SHA1
|   TLSv1.1: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 1024) - A
|       TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA (secp256r1) - D
|       TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA (dh 1024) - D
|       TLS_RSA_WITH_3DES_EDE_CBC_SHA (rsa 1024) - D
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_IDEA_CBC_SHA (rsa 1024) - A
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher 3DES vulnerable to SWEET32 attack
|       64-bit block cipher IDEA vulnerable to SWEET32 attack
|       Weak certificate signature: SHA1
|   TLSv1.2: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (secp256r1) - A
|       TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_256_GCM_SHA384 (rsa 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 (secp256r1) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (secp256r1) - A
|       TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_128_GCM_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 1024) - A
|       TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA (secp256r1) - D
|       TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA (dh 1024) - D
|       TLS_RSA_WITH_3DES_EDE_CBC_SHA (rsa 1024) - D
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_IDEA_CBC_SHA (rsa 1024) - A
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher 3DES vulnerable to SWEET32 attack
|       64-bit block cipher IDEA vulnerable to SWEET32 attack
|       Weak certificate signature: SHA1
|_  least strength: D
|_sslv2-drown: 
Service Info: Host: www.example.com

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:02:08 2022 -- 1 IP address (1 host up) scanned in 297.24 seconds

```
