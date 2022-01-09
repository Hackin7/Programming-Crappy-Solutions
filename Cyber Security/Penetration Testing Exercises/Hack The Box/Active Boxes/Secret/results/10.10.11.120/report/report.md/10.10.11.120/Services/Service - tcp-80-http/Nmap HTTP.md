```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/xml/tcp_80_http_nmap.xml" 10.10.11.120
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Thu Jan  6 04:28:48 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Exercises/Hack The Box/Active Boxes/Secret/results/10.10.11.120/scans/tcp80/xml/tcp_80_http_nmap.xml" 10.10.11.120
Nmap scan report for 10.10.11.120
Host is up, received user-set (0.20s latency).
Scanned at 2022-01-06 04:28:50 EST for 482s

PORT   STATE SERVICE REASON         VERSION
80/tcp open  http    syn-ack ttl 63 nginx 1.18.0 (Ubuntu)
|_http-chrono: Request times for /; avg: 574.53ms; min: 471.48ms; max: 765.21ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=10.10.11.120
|     
|     Path: http://10.10.11.120:80/
|     Line number: 95
|     Comment: 
|         <!--//card-body-->
|     
|     Path: http://10.10.11.120:80/
|     Line number: 205
|     Comment: 
|         <!--//row-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 85
|     Comment: 
|         
|         // Initialize Gumshoe
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 164
|     Comment: 
|         <!--//section-->
|     
|     Path: http://10.10.11.120:80/
|     Line number: 86
|     Comment: 
|         <!--//card-icon-holder-->
|     
|     Path: http://10.10.11.120:80/assets/css/theme.css
|     Line number: 1
|     Comment: 
|         /*!
|          * Bootstrap v5.0.2 (https://getbootstrap.com/)
|          * Copyright 2011-2021 The Bootstrap Authors
|          * Copyright 2011-2021 Twitter, Inc.
|          * Licensed under MIT (https://github.com/twbs/bootstrap/blob/main/LICENSE)
|          */
|     
|     Path: http://10.10.11.120:80/
|     Line number: 228
|     Comment: 
|         <!--//cta-section-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 83
|     Comment: 
|         /* ===== Gumshoe SrollSpy ===== */
|     
|     Path: http://10.10.11.120:80/
|     Line number: 97
|     Comment: 
|         <!--//card-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 55
|     Comment: 
|         /*  Note: You need to include smoothscroll.min.js (smooth scroll behavior polyfill) on the page to cover some browsers */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 26
|     Comment: 
|         <!-- Theme CSS -->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 63
|     Comment: 
|         <!--//social-list-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 33
|     Comment: 
|          // if smaller
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 73
|     Comment: 
|         <!--//header-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 71
|     Comment: 
|         <!--//branding-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 69
|     Comment: 
|         <!--//container-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 160
|     Comment: 
|         <!-- ** Embed github code ends ** -->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 84
|     Comment: 
|         /* Ref: https://github.com/cferdinandi/gumshoe  */
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 56
|     Comment: 
|         /* Ref: https://github.com/iamdustan/smoothscroll */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 16
|     Comment: 
|         <!-- Google Font -->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 27
|     Comment: 
|          // if larger 
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 67
|     Comment: 
|         <!--//docs-top-utilities-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 19
|     Comment: 
|         <!-- FontAwesome JS-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 87
|     Comment: 
|          //sticky header height
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 91
|     Comment: 
|         /* ====== SimpleLightbox Plugin ======= */
|     
|     Path: http://10.10.11.120:80/assets/css/theme.css
|     Line number: 6
|     Comment: 
|         /* rtl:ignore */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 123
|     Comment: 
|         <!--//docs-sidebar-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 54
|     Comment: 
|         /* ===== Smooth scrolling ====== */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 46
|     Comment: 
|         <!--//docs-logo-wrapper-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 468
|     Comment: 
|         <!--//docs-wrapper-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 476
|     Comment: 
|         <!-- Page Specific JS -->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 166
|     Comment: 
|         <!--//docs-article-->
|     
|     Path: http://10.10.11.120:80/assets/plugins/popper.min.js
|     Line number: 1
|     Comment: 
|         /**
|          * @popperjs/core v2.9.2 - MIT License
|          */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 7
|     Comment: 
|         <!-- Meta -->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 121
|     Comment: 
|         <!--//docs-nav-->
|     
|     Path: http://10.10.11.120:80/assets/css/theme.css
|     Line number: 6
|     Comment: 
|         /* rtl: var(--bs-breadcrumb-divider, "/") */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 471
|     Comment: 
|         <!-- Javascript -->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 71
|     Comment: 
|          //Collapse sidebar after clicking
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 94
|     Comment: 
|         /* options */
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 158
|     Comment: 
|         <!-- ** Embed github code starts ** -->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 92
|     Comment: 
|         /*  Ref: https://github.com/andreknieriem/simplelightbox */
|     
|     Path: http://10.10.11.120:80/assets/css/theme.css
|     Line number: 6
|     Comment: 
|         /*!  
|          * CoderDocs - Bootstrap 5 Documentation Template for Software Projects
|          * Version: Bootstrap 5 v1.0
|          * Author: Xiaoying Riley
|          * Copyright: 3rd Wave Media Ltd.
|          * Website: http://themes.3rdwavemedia.com/
|          * Twitter: @3rdwave_themes
|         */
|     
|     Path: http://10.10.11.120:80/assets/plugins/simplelightbox/simple-lightbox.min.css
|     Line number: 1
|     Comment: 
|         /*!
|         	By Andr\xC3\xA9 Rinas, www.andrerinas.de
|         	Documentation, www.simplelightbox.de
|         	Available for use under the MIT License
|         	Version 2.7.0
|         */
|     
|     Path: http://10.10.11.120:80/assets/js/highlight-custom.js
|     Line number: 2
|     Comment: 
|         
|         //Initialise highlight js on <pre></code> blocks
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 22
|     Comment: 
|         <!-- Plugins CSS -->
|     
|     Path: http://10.10.11.120:80/
|     Line number: 74
|     Comment: 
|         <!--//page-header-->
|     
|     Path: http://10.10.11.120:80/docs
|     Line number: 137
|     Comment: 
|         <!--//docs-intro-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 11
|     Comment: 
|         /* ===== Responsive Sidebar ====== */
|     
|     Path: http://10.10.11.120:80/
|     Line number: 99
|     Comment: 
|         <!--//col-->
|     
|     Path: http://10.10.11.120:80/
|     Line number: 211
|     Comment: 
|         <!--//page-content-->
|     
|     Path: http://10.10.11.120:80/assets/js/docs.js
|     Line number: 4
|     Comment: 
|_        /* ====== Define JS Constants ====== */
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Thu, 06 Jan 2022 09:30:43 GMT; +1m23s from local time.
|_http-devframework: Express detected. Found Express in X-Powered-By Header
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|_  /docs/: Potentially interesting folder
| http-errors: 
| Spidering limited to: maxpagecount=40; withinhost=10.10.11.120
|   Found the following error pages: 
|   
|   Error Code: 404
|_  	http://10.10.11.120:80/favicon.ico
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
|   (1) http://10.10.11.120:80/docs: 
|     (1) email: 
|_      + root@dasith.work
| http-headers: 
|   Server: nginx/1.18.0 (Ubuntu)
|   Date: Thu, 06 Jan 2022 09:30:37 GMT
|   Content-Type: text/html; charset=utf-8
|   Content-Length: 12872
|   Connection: close
|   X-Powered-By: Express
|   ETag: W/"3248-nFUp1XavqYRgAFgHenjOsSPQ/e4"
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash facfb0af012465acc5fc695ffc2158bb
|_Credits query returned unknown hash facfb0af012465acc5fc695ffc2158bb
| http-referer-checker: 
| Spidering limited to: maxpagecount=30
|   https://gist.github.com:443/dasithsv/f73dcb208d642edfb2189beecf6da731.js
|_  https://cdnjs.cloudflare.com:443/ajax/libs/highlight.js/9.15.8/highlight.min.js
|_http-security-headers: 
|_http-server-header: nginx/1.18.0 (Ubuntu)
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 3
|     /api/
|       Other: 1
|     /assets/css/
|       css: 1
|     /assets/fontawesome/js/
|       js: 1
|     /assets/js/
|       js: 2
|     /assets/plugins/
|       js: 2
|     /assets/plugins/gumshoe/
|       js: 1
|     /assets/plugins/simplelightbox/
|       css: 1; js: 1
|     /download/
|       zip: 1
|   Longest directory structure:
|     Depth: 3
|     Dir: /assets/fontawesome/js/
|   Total files found (by extension):
|_    Other: 4; css: 2; js: 7; zip: 1
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: DUMB Docs
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
| dns2
| mailgate
|_126 names had status 200
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Thu Jan  6 04:36:52 2022 -- 1 IP address (1 host up) scanned in 484.16 seconds

```
