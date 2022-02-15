```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.161.58
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 06:17:26 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.161.58
Nmap scan report for 192.168.161.58
Host is up, received user-set (0.31s latency).
Scanned at 2022-02-13 06:17:33 EST for 58s

PORT   STATE SERVICE REASON         VERSION
80/tcp open  http    syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS) PHP/5.4.16)
| http-affiliate-id: 
|_  Google Analytics ID: UA-2196019-1
|_http-backup-finder: ERROR: Script execution failed (use -d to debug)
|_http-chrono: Request times for /; avg: 525.22ms; min: 423.05ms; max: 705.63ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.161.58
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 110
|     Comment: 
|         /* line 90, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery-1.7.2.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery v1.7.2 jquery.com | jquery.org/license */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 36
|     Comment: 
|         /* line 30, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery-1.7.2.min.js
|     Line number: 4
|     Comment: 
|         /*$0*/
|     
|     Path: http://192.168.161.58:80/js/jquery-ui-1.8.18.custom.min.js
|     Line number: 1
|     Comment: 
|         /*!
|          * jQuery UI 1.8.18
|          *
|          * Copyright 2011, AUTHORS.txt (http://jqueryui.com/about)
|          * Dual licensed under the MIT or GPL Version 2 licenses.
|          * http://jquery.org/license
|          *
|          * http://docs.jquery.com/UI
|          */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 168
|     Comment: 
|         /* line 117, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 98
|     Comment: 
|         /* line 72, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 154
|     Comment: 
|         /* line 107, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 110
|     Comment: 
|         /* line 81, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 141
|     Comment: 
|         /* line 98, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery-ui-1.8.18.custom.min.js
|     Line number: 17
|     Comment: 
|         /*
|          * jQuery UI Effects Clip 1.8.18
|          *
|          * Copyright 2011, AUTHORS.txt (http://jqueryui.com/about)
|          * Dual licensed under the MIT or GPL Version 2 licenses.
|          * http://jquery.org/license
|          *
|          * http://docs.jquery.com/UI/Effects/Clip
|          *
|          * Depends:
|          *	jquery.effects.core.js
|          */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 203
|     Comment: 
|         /* line 346, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery-ui-1.8.18.custom.min.js
|     Line number: 39
|     Comment: 
|         /*
|          * jQuery UI Effects Scale 1.8.18
|          *
|          * Copyright 2011, AUTHORS.txt (http://jqueryui.com/about)
|          * Dual licensed under the MIT or GPL Version 2 licenses.
|          * http://jquery.org/license
|          *
|          * http://docs.jquery.com/UI/Effects/Scale
|          *
|          * Depends:
|          *	jquery.effects.core.js
|          */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 95
|     Comment: 
|         /* line 81, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 136
|     Comment: 
|         /* line 95, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 120
|     Comment: 
|         /* line 88, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery.smooth-scroll.min.js
|     Line number: 1
|     Comment: 
|         /*!
|          * jQuery Smooth Scroll Plugin v1.4.5
|          *
|          * Date: Sun Mar 11 18:17:42 2012 EDT
|          * Requires: jQuery v1.3+
|          *
|          * Copyright 2012, Karl Swedberg
|          * Dual licensed under the MIT and GPL licenses (just like jQuery):
|          * http://www.opensource.org/licenses/mit-license.php
|          * http://www.gnu.org/licenses/gpl.html
|          *
|          *
|          *
|          *
|         */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 115
|     Comment: 
|         /* line 85, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 148
|     Comment: 
|         /* line 103, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 199
|     Comment: 
|         /* line 343, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 115
|     Comment: 
|         /* line 93, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 104
|     Comment: 
|         /* line 76, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 161
|     Comment: 
|         /* line 112, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 105
|     Comment: 
|         /* line 87, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 94
|     Comment: 
|         /* Trick IE into showing hover */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 31
|     Comment: 
|         /* line 27, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery-ui-1.8.18.custom.min.js
|     Line number: 9
|     Comment: 
|         /*
|          * jQuery UI Effects 1.8.18
|          *
|          * Copyright 2011, AUTHORS.txt (http://jqueryui.com/about)
|          * Dual licensed under the MIT or GPL Version 2 licenses.
|          * http://jquery.org/license
|          *
|          * http://docs.jquery.com/UI/Effects/
|          */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 89
|     Comment: 
|         /* line 65, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 84
|     Comment: 
|         /* line 62, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 79
|     Comment: 
|         /* line 59, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 69
|     Comment: 
|         /* line 51, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 58
|     Comment: 
|         /* line 42, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 88
|     Comment: 
|         /* Text elements */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 53
|     Comment: 
|         /* line 39, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 24
|     Comment: 
|         /* line 24, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/js/jquery-ui-1.8.18.custom.min.js
|     Line number: 28
|     Comment: 
|         /*
|          * jQuery UI Effects Fade 1.8.18
|          *
|          * Copyright 2011, AUTHORS.txt (http://jqueryui.com/about)
|          * Dual licensed under the MIT or GPL Version 2 licenses.
|          * http://jquery.org/license
|          *
|          * http://docs.jquery.com/UI/Effects/Fade
|          *
|          * Depends:
|          *	jquery.effects.core.js
|          */
|     
|     Path: http://192.168.161.58:80/
|     Line number: 57
|     Comment: 
|         <!-- end #content -->
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 152
|     Comment: 
|         /* line 320, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 174
|     Comment: 
|         /* line 332, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 46
|     Comment: 
|         /* line 38, ../../../../.rvm/gems/ruby-1.9.2-p290/gems/compass-0.12.1/frameworks/compass/stylesheets/compass/utilities/general/_clearfix.scss */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 89
|     Comment: 
|         /* line 77, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 13
|     Comment: 
|         /* line 15, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/css/lightbox.css
|     Line number: 1
|     Comment: 
|         /* line 6, ../sass/lightbox.sass */
|     
|     Path: http://192.168.161.58:80/js/lightbox.js
|     Line number: 2
|     Comment: 
|         /*
|         Lightbox v2.51
|         by Lokesh Dhakar - http://www.lokeshdhakar.com
|         
|         For more information, visit:
|         http://lokeshdhakar.com/projects/lightbox2/
|         
|         Licensed under the Creative Commons Attribution 2.5 License - http://creativecommons.org/licenses/by/2.5/
|         - free for use in both personal and commercial projects
|         - attribution requires leaving author name, author link, and the license info intact
|         	
|         Thanks
|         - Scott Upton(uptonic.com), Peter-Paul Koch(quirksmode.com), and Thomas Fuchs(mir.aculo.us) for ideas, libs, and snippets.
|         - Artemy Tregubenko (arty.name) for cleanup and help in updating to latest proto-aculous in v2.05.
|         
|         
|         Table of Contents
|         =================
|         LightboxOptions
|         
|         Lightbox
|         - constructor
|         - init
|         - enable
|         - build
|         - start
|         - changeImage
|         - sizeContainer
|         - showImage
|         - updateNav
|         - updateDetails
|         - preloadNeigbhoringImages
|         - enableKeyboardNav
|         - disableKeyboardNav
|         - keyboardAction
|         - end
|         
|         options = new LightboxOptions
|         lightbox = new Lightbox options
|         */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 100
|     Comment: 
|         /* line 84, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 75
|     Comment: 
|         /* line 65, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 83
|     Comment: 
|         /* line 71, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 118
|     Comment: 
|         /* line 96, ../sass/screen.sass */
|     
|     Path: http://192.168.161.58:80/css/screen.css
|     Line number: 142
|     Comment: 
|_        /* line 125, ../sass/screen.sass */
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-date: Sun, 13 Feb 2022 11:23:39 GMT; +5m54s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /README.txt: Interesting, a readme.
|   /css/: Potentially interesting folder w/ directory listing
|   /icons/: Potentially interesting folder w/ directory listing
|   /images/: Potentially interesting folder w/ directory listing
|_  /js/: Potentially interesting folder w/ directory listing
|_http-errors: Couldn't find any error pages.
| http-exif-spider: 
|   http://192.168.161.58:80/images/examples/image-6.jpg
|     Date: 2012:04:10 18:54:07
|   http://192.168.161.58:80/images/examples/image-2.jpg
|     Date: 2012:04:10 18:54:48
|   http://192.168.161.58:80/images/examples/image-5.jpg
|     Date: 2012:04:10 18:55:18
|   http://192.168.161.58:80/images/examples/image-4.jpg
|     Date: 2012:04:10 18:54:34
|   http://192.168.161.58:80/images/examples/image-3.jpg
|     Date: 2012:04:10 18:54:43
|   http://192.168.161.58:80/images/examples/image-1.jpg
|_    Date: 2012:04:10 18:54:53
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-headers: 
|   Date: Sun, 13 Feb 2022 11:23:38 GMT
|   Server: Apache/2.4.6 (CentOS) PHP/5.4.16
|   X-Powered-By: PHP/5.4.16
|   Connection: close
|   Content-Type: text/html; charset=UTF-8
|   
|_  (Request type: HEAD)
| http-internal-ip-disclosure: 
|_  Internal IP Leaked: 127.0.0.2
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash 1101274777f5937427daccb13c1cbada
| Versions from credits query (more accurate): 5.4.15 - 5.4.45
|_Version from header x-powered-by: PHP/5.4.16
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
|_http-server-header: Apache/2.4.6 (CentOS) PHP/5.4.16
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1
|     /css/
|       css: 2
|     /images/examples/
|       jpg: 12
|     /js/
|       js: 4
|   Longest directory structure:
|     Depth: 2
|     Dir: /images/examples/
|   Total files found (by extension):
|_    Other: 1; css: 2; jpg: 12; js: 4
| http-sql-injection: 
|   Possible sqli for queries:
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.58:80/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|_    http://192.168.161.58:80/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: Simple PHP Photo Gallery
| http-trace: TRACE is enabled
| Headers:
| Date: Sun, 13 Feb 2022 11:23:44 GMT
| Server: Apache/2.4.6 (CentOS) PHP/5.4.16
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
|_http-vuln-cve2017-1001000: ERROR: Script execution failed (use -d to debug)
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 06:18:31 2022 -- 1 IP address (1 host up) scanned in 65.07 seconds

```
