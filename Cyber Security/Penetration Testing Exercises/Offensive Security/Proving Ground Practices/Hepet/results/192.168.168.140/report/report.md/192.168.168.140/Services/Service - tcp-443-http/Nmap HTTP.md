```bash
nmap -vv --reason -Pn -T4 -sV -p 443 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.168.140
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/tcp_443_https_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/tcp_443_https_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 12:15:29 2022 as: nmap -vv --reason -Pn -T4 -sV -p 443 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.168.140
Nmap scan report for 192.168.168.140
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 12:15:34 EST for 139s

PORT    STATE SERVICE  REASON          VERSION
443/tcp open  ssl/http syn-ack ttl 127 Apache httpd 2.4.46 ((Win64) OpenSSL/1.1.1g PHP/7.3.23)
|_http-backup-finder: ERROR: Script execution failed (use -d to debug)
|_http-chrono: Request times for /; avg: 1862.75ms; min: 813.45ms; max: 3808.71ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.168.140
|     
|     Path: https://192.168.168.140:443/
|     Line number: 307
|     Comment: 
|          // Make sure this.hash has a value before overriding default behavior
|     
|     Path: https://192.168.168.140:443/bootstrap.min.css
|     Line number: 5
|     Comment: 
|         /*! Source: https://github.com/h5bp/html5-boilerplate/blob/master/src/css/main.css */
|     
|     Path: https://192.168.168.140:443/
|     Line number: 187
|     Comment: 
|         <!-- Left and right controls -->
|     
|     Path: https://192.168.168.140:443/
|     Line number: 43
|     Comment: 
|         <!-- Container (About Section) -->
|     
|     Path: https://192.168.168.140:443/
|     Line number: 324
|     Comment: 
|          // End if
|     
|     Path: https://192.168.168.140:443/
|     Line number: 315
|     Comment: 
|          // Using jQuery's animate() method to add smooth page scroll
|     
|     Path: https://192.168.168.140:443/
|     Line number: 266
|     Comment: 
|         <!-- Container (Contact Section) -->
|     
|     Path: https://192.168.168.140:443/bootstrap.min.css
|     Line number: 6
|     Comment: 
|         /*# sourceMappingURL=bootstrap.min.css.map */
|     
|     Path: https://192.168.168.140:443/
|     Line number: 113
|     Comment: 
|         <!-- Container (Portfolio Section) - thispersondoesntexist -->
|     
|     Path: https://192.168.168.140:443/
|     Line number: 316
|     Comment: 
|          // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
|     
|     Path: https://192.168.168.140:443/
|     Line number: 309
|     Comment: 
|          // Prevent default anchor click behavior
|     
|     Path: https://192.168.168.140:443/
|     Line number: 167
|     Comment: 
|         <!-- Indicators -->
|     
|     Path: https://192.168.168.140:443/bootstrap.min.css
|     Line number: 5
|     Comment: 
|         /*! normalize.css v3.0.3 | MIT License | github.com/necolas/normalize.css */
|     
|     Path: https://192.168.168.140:443/bootstrap.min.css
|     Line number: 1
|     Comment: 
|         /*!
|          * Bootstrap v3.4.1 (https://getbootstrap.com/)
|          * Copyright 2011-2019 Twitter, Inc.
|          * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
|          */
|     
|     Path: https://192.168.168.140:443/bootstrap.min.js
|     Line number: 1
|     Comment: 
|         /*!
|          * Bootstrap v3.4.1 (https://getbootstrap.com/)
|          * Copyright 2011-2019 Twitter, Inc.
|          * Licensed under the MIT license
|          */
|     
|     Path: https://192.168.168.140:443/
|     Line number: 305
|     Comment: 
|          // Add smooth scrolling to all links in navbar + footer link
|     
|     Path: https://192.168.168.140:443/jquery.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery v3.5.1 | (c) JS Foundation and other contributors | jquery.org/license */
|     
|     Path: https://192.168.168.140:443/
|     Line number: 321
|     Comment: 
|          // Add hash (#) to URL when done scrolling (default click behavior)
|     
|     Path: https://192.168.168.140:443/
|     Line number: 71
|     Comment: 
|         <!-- Container (Services Section) -->
|     
|     Path: https://192.168.168.140:443/
|     Line number: 199
|     Comment: 
|         <!-- Container (Pricing Section) -->
|     
|     Path: https://192.168.168.140:443/
|     Line number: 174
|     Comment: 
|         <!-- Wrapper for slides -->
|     
|     Path: https://192.168.168.140:443/
|     Line number: 312
|     Comment: 
|          // Store hash
|     
|     Path: https://192.168.168.140:443/
|     Line number: 4
|     Comment: 
|_        <!-- Theme Made By www.w3schools.com -->
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Sat, 05 Mar 2022 17:15:50 GMT; -4s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|_  /icons/: Potentially interesting folder w/ directory listing
|_http-errors: Couldn't find any error pages.
|_http-exif-spider: ERROR: Script execution failed (use -d to debug)
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-fileupload-exploiter: 
|   
|     Couldn't find a file-type field.
|   
|     Couldn't find a file-type field.
|   
|_    Couldn't find a file-type field.
| http-grep: 
|   (1) https://192.168.168.140:443/: 
|     (1) email: 
|       + myemail@something.com
|   (1) https://192.168.168.140:443/r.href,v.crossDomain=Wt.protocol+%22/%22+Wt.host!=r.protocol+%22/%22+r.host%7dcatch(e)%7bv.crossDomain=!0%7d%7dif(v.data&&v.processData&&%22string%22!=typeof: 
|     (1) ip: 
|_      + 192.168.168.140
| http-headers: 
|   Date: Sat, 05 Mar 2022 17:15:58 GMT
|   Server: Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23
|   Last-Modified: Tue, 20 Oct 2020 20:34:20 GMT
|   ETag: "32e8-5b22027cd0b00"
|   Accept-Ranges: bytes
|   Content-Length: 13032
|   Connection: close
|   Content-Type: text/html
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|   Supported Methods: GET POST OPTIONS HEAD TRACE
|_  Potentially risky methods: TRACE
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash 18d81916fb4fdeae55902adeb02ca0dc
|_Credits query returned unknown hash 18d81916fb4fdeae55902adeb02ca0dc
|_http-referer-checker: Couldn't find any cross-domain scripts.
| http-security-headers: 
|   Strict_Transport_Security: 
|_    HSTS not configured in HTTPS Server
|_http-server-header: Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1; css: 2; js: 2
|     /fonts/
|       css: 2
|     /team/
|       jpeg: 6
|   Longest directory structure:
|     Depth: 1
|     Dir: /team/
|   Total files found (by extension):
|_    Other: 1; css: 4; jpeg: 6; js: 2
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: Time Travel Company Page
| http-trace: TRACE is enabled
| Headers:
| Date: Sat, 05 Mar 2022 17:15:54 GMT
| Server: Apache/2.4.46 (Win64) OpenSSL/1.1.1g PHP/7.3.23
| Connection: close
| Transfer-Encoding: chunked
|_Content-Type: message/http
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
|_128 names had status 200
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
|             Cipher Suite: TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA
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
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 1024) - A
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_IDEA_CBC_SHA (rsa 1024) - A
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher IDEA vulnerable to SWEET32 attack
|       Weak certificate signature: SHA1
|   TLSv1.1: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 1024) - A
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_IDEA_CBC_SHA (rsa 1024) - A
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       64-bit block cipher IDEA vulnerable to SWEET32 attack
|       Weak certificate signature: SHA1
|   TLSv1.2: 
|     ciphers: 
|       TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_256_CCM_8 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_256_CCM (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_ARIA_256_GCM_SHA384 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_ARIA_256_GCM_SHA384 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_128_CCM_8 (dh 1024) - A
|       TLS_DHE_RSA_WITH_AES_128_CCM (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_ARIA_128_GCM_SHA256 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_ARIA_128_GCM_SHA256 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_256_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA (dh 1024) - A
|       TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA (ecdh_x25519) - A
|       TLS_DHE_RSA_WITH_AES_128_CBC_SHA (dh 1024) - A
|       TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_AES_256_GCM_SHA384 (rsa 1024) - A
|       TLS_RSA_WITH_AES_256_CCM_8 (rsa 1024) - A
|       TLS_RSA_WITH_AES_256_CCM (rsa 1024) - A
|       TLS_RSA_WITH_ARIA_256_GCM_SHA384 (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_GCM_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CCM_8 (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CCM (rsa 1024) - A
|       TLS_RSA_WITH_ARIA_128_GCM_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 (rsa 1024) - A
|       TLS_RSA_WITH_AES_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_256_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_AES_128_CBC_SHA (rsa 1024) - A
|       TLS_RSA_WITH_CAMELLIA_128_CBC_SHA (rsa 1024) - A
|       TLS_DHE_RSA_WITH_SEED_CBC_SHA (dh 1024) - A
|       TLS_RSA_WITH_SEED_CBC_SHA (rsa 1024) - A
|     compressors: 
|       NULL
|     cipher preference: server
|     warnings: 
|       Weak certificate signature: SHA1
|_  least strength: A
|_sslv2-drown: 

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 12:17:53 2022 -- 1 IP address (1 host up) scanned in 144.54 seconds

```
