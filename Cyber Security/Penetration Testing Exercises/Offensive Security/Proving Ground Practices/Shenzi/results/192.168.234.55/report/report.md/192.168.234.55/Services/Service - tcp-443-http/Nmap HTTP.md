```bash
nmap -vv --reason -Pn -T4 -sV -p 443 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.234.55
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_nmap.txt):

```
# Nmap 7.91 scan initiated Mon Jan 24 09:38:25 2022 as: nmap -vv --reason -Pn -T4 -sV -p 443 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/tcp_443_https_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Shenzi/results/192.168.234.55/scans/tcp443/xml/tcp_443_https_nmap.xml" 192.168.234.55
Nmap scan report for 192.168.234.55
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-24 09:38:28 EST for 171s

PORT    STATE SERVICE  REASON          VERSION
443/tcp open  ssl/http syn-ack ttl 127 Apache httpd 2.4.43 ((Win64) OpenSSL/1.1.1g PHP/7.4.6)
|_http-chrono: Request times for /dashboard/; avg: 1102.43ms; min: 1086.63ms; max: 1122.13ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.234.55
|     
|     Path: https://192.168.234.55:443/dashboard/
|     Line number: 10
|     Comment: 
|         <!-- Use title if it's in the page YAML frontmatter -->
|     
|     Path: https://192.168.234.55:443/dashboard/
|     Line number: 163
|     Comment: 
|         <!-- JS Libraries -->
|     
|     Path: https://192.168.234.55:443/dashboard/
|     Line number: 6
|     Comment: 
|         <!-- Always force latest IE rendering engine or request Chrome Frame -->
|     
|     Path: https://192.168.234.55:443/dashboard/
|     Line number: 50
|     Comment: 
|_        <!-- Right Nav Section -->
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Mon, 24 Jan 2022 14:38:57 GMT; -2s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /icons/: Potentially interesting folder w/ directory listing
|_  /img/: Potentially interesting directory w/ listing on 'apache/2.4.43 (win64) openssl/1.1.1g php/7.4.6'
|_http-errors: Couldn't find any error pages.
|_http-favicon: Unknown favicon MD5: 6EB4A43CB64C97F76562AF703893C8FD
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-grep: 
|   (1) https://192.168.234.55:443/dashboard/: 
|     (1) email: 
|_      + fastly-logo@2x.png
| http-headers: 
|   Date: Mon, 24 Jan 2022 14:38:56 GMT
|   Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
|   Last-Modified: Mon, 18 May 2020 06:55:42 GMT
|   ETag: "1d98-5a5e6a6bcb780"
|   Accept-Ranges: bytes
|   Content-Length: 7576
|   Connection: close
|   Content-Type: text/html
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash 468aa6f6356253cc88b73c33cfb48b5b
|_Credits query returned unknown hash 468aa6f6356253cc88b73c33cfb48b5b
| http-referer-checker: 
| Spidering limited to: maxpagecount=30
|   https://code.jquery.com:443/jquery-1.10.2.min.js
|   https://192.168.234.55:443/dashboard/javascripts/modernizr.js
|_  https://192.168.234.55:443/dashboard/javascripts/all.js
| http-security-headers: 
|   Strict_Transport_Security: 
|_    HSTS not configured in HTTPS Server
|_http-server-header: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
| http-sitemap-generator: 
|   Directory structure:
|     /dashboard/
|       Other: 1
|   Longest directory structure:
|     Depth: 1
|     Dir: /dashboard/
|   Total files found (by extension):
|_    Other: 1
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
| http-title: Welcome to XAMPP
|_Requested resource was https://192.168.234.55/dashboard/
| http-trace: TRACE is enabled
| Headers:
| Date: Mon, 24 Jan 2022 14:38:43 GMT
| Server: Apache/2.4.43 (Win64) OpenSSL/1.1.1g PHP/7.4.6
| Connection: close
| Transfer-Encoding: chunked
|_Content-Type: message/http
| http-useragent-tester: 
|   Status for browser useragent: 200
|   Redirected To: https://192.168.234.55/dashboard/
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
|_128 names had status 302
|_http-vuln-cve2017-1001000: ERROR: Script execution failed (use -d to debug)
| http-waf-detect: IDS/IPS/WAF detected:
|_192.168.234.55:443/?p4yl04d3=<script>alert(document.cookie)</script>
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
# Nmap done at Mon Jan 24 09:41:19 2022 -- 1 IP address (1 host up) scanned in 173.96 seconds

```