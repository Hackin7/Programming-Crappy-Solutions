```bash
nmap -vv --reason -Pn -T4 -sV -p 8000 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp8000/tcp_8000_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp8000/xml/tcp_8000_http_nmap.xml" 192.168.168.140
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp8000/tcp_8000_http_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp8000/tcp_8000_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 12:15:30 2022 as: nmap -vv --reason -Pn -T4 -sV -p 8000 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp8000/tcp_8000_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp8000/xml/tcp_8000_http_nmap.xml" 192.168.168.140
Nmap scan report for 192.168.168.140
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 12:15:35 EST for 67s

PORT     STATE SERVICE REASON          VERSION
8000/tcp open  http    syn-ack ttl 127 Apache httpd 2.4.46 ((Win64) OpenSSL/1.1.1g PHP/7.3.23)
|_http-backup-finder: ERROR: Script execution failed (use -d to debug)
|_http-chrono: Request times for /; avg: 1891.69ms; min: 731.47ms; max: 2781.79ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.168.140
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 315
|     Comment: 
|          // Using jQuery's animate() method to add smooth page scroll
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 187
|     Comment: 
|         <!-- Left and right controls -->
|     
|     Path: http://192.168.168.140:8000/jquery.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery v3.5.1 | (c) JS Foundation and other contributors | jquery.org/license */
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 266
|     Comment: 
|         <!-- Container (Contact Section) -->
|     
|     Path: http://192.168.168.140:8000/bootstrap.min.css
|     Line number: 6
|     Comment: 
|         /*# sourceMappingURL=bootstrap.min.css.map */
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 305
|     Comment: 
|          // Add smooth scrolling to all links in navbar + footer link
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 321
|     Comment: 
|          // Add hash (#) to URL when done scrolling (default click behavior)
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 4
|     Comment: 
|         <!-- Theme Made By www.w3schools.com -->
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 316
|     Comment: 
|          // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 312
|     Comment: 
|          // Store hash
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 43
|     Comment: 
|         <!-- Container (About Section) -->
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 199
|     Comment: 
|         <!-- Container (Pricing Section) -->
|     
|     Path: http://192.168.168.140:8000/bootstrap.min.js
|     Line number: 1
|     Comment: 
|         /*!
|          * Bootstrap v3.4.1 (https://getbootstrap.com/)
|          * Copyright 2011-2019 Twitter, Inc.
|          * Licensed under the MIT license
|          */
|     
|     Path: http://192.168.168.140:8000/bootstrap.min.css
|     Line number: 5
|     Comment: 
|         /*! Source: https://github.com/h5bp/html5-boilerplate/blob/master/src/css/main.css */
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 324
|     Comment: 
|          // End if
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 307
|     Comment: 
|          // Make sure this.hash has a value before overriding default behavior
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 113
|     Comment: 
|         <!-- Container (Portfolio Section) - thispersondoesntexist -->
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 309
|     Comment: 
|          // Prevent default anchor click behavior
|     
|     Path: http://192.168.168.140:8000/bootstrap.min.css
|     Line number: 5
|     Comment: 
|         /*! normalize.css v3.0.3 | MIT License | github.com/necolas/normalize.css */
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 174
|     Comment: 
|         <!-- Wrapper for slides -->
|     
|     Path: http://192.168.168.140:8000/bootstrap.min.css
|     Line number: 1
|     Comment: 
|         /*!
|          * Bootstrap v3.4.1 (https://getbootstrap.com/)
|          * Copyright 2011-2019 Twitter, Inc.
|          * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
|          */
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 71
|     Comment: 
|         <!-- Container (Services Section) -->
|     
|     Path: http://192.168.168.140:8000/
|     Line number: 167
|     Comment: 
|_        <!-- Indicators -->
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Sat, 05 Mar 2022 17:15:49 GMT; -1s from local time.
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
|   (1) http://192.168.168.140:8000/: 
|     (1) email: 
|       + myemail@something.com
|   (1) http://192.168.168.140:8000/r.href,v.crossDomain=Wt.protocol+%22/%22+Wt.host!=r.protocol+%22/%22+r.host%7dcatch(e)%7bv.crossDomain=!0%7d%7dif(v.data&&v.processData&&%22string%22!=typeof: 
|     (1) ip: 
|_      + 192.168.168.140
| http-headers: 
|   Date: Sat, 05 Mar 2022 17:15:49 GMT
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
|_http-security-headers: 
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
| Date: Sat, 05 Mar 2022 17:15:47 GMT
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

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 12:16:42 2022 -- 1 IP address (1 host up) scanned in 72.62 seconds

```
