```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.161.116
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 10:53:03 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.161.116
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.27s latency).
Scanned at 2022-02-13 10:53:06 EST for 103s

PORT   STATE SERVICE REASON         VERSION
80/tcp open  http    syn-ack ttl 63 Apache httpd 2.4.6 ((CentOS))
|_http-chrono: Request times for /; avg: 775.17ms; min: 466.38ms; max: 1477.92ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.161.116
|     
|     Path: http://192.168.161.116:80/no-sidebar.html
|     Line number: 55
|     Comment: 
|         <!-- Content -->
|     
|     Path: http://192.168.161.116:80/index.html
|     Line number: 173
|     Comment: 
|         <!-- Five -->
|     
|     Path: http://192.168.161.116:80/assets/js/browser.min.js
|     Line number: 1
|     Comment: 
|         /* browser.js v1.0 | @ajlkn | MIT licensed */
|     
|     Path: http://192.168.161.116:80/assets/js/util.js
|     Line number: 299
|     Comment: 
|         
|         
|         
|         	 */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2201
|     Comment: 
|         /* Form */
|     
|     Path: http://192.168.161.116:80/right-sidebar.html
|     Line number: 77
|     Comment: 
|         <!-- Sidebar -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2392
|     Comment: 
|         /* Box */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2821
|     Comment: 
|         /* Button */
|     
|     Path: http://192.168.161.116:80/index.html
|     Line number: 92
|     Comment: 
|         <!-- Two -->
|     
|     Path: http://192.168.161.116:80/assets/js/util.js
|     Line number: 37
|     Comment: 
|         
|         
|         
|         
|         	 */
|     
|     Path: http://192.168.161.116:80/elements.html
|     Line number: 57
|     Comment: 
|         <!-- Text -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2631
|     Comment: 
|         /* Actions */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3370
|     Comment: 
|         /* Header */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 4
|     Comment: 
|         /*
|         	Landed by HTML5 UP
|         	html5up.net | @ajlkn
|         	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
|         */
|     
|     Path: http://192.168.161.116:80/no-sidebar.html
|     Line number: 2
|     Comment: 
|         
|         
|         
|         
|         -->
|     
|     Path: http://192.168.161.116:80/assets/js/util.js
|     Line number: 3
|     Comment: 
|         
|         
|         
|         	 */
|     
|     Path: http://192.168.161.116:80/elements.html
|     Line number: 380
|     Comment: 
|         <!-- Image -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2567
|     Comment: 
|         /* List */
|     
|     Path: http://192.168.161.116:80/index.html
|     Line number: 60
|     Comment: 
|         <!-- One -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 4049
|     Comment: 
|         /* XSmall */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2967
|     Comment: 
|         /* Spotlight */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2608
|     Comment: 
|         /* Icons */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3859
|     Comment: 
|         /* Nav */
|     
|     Path: http://192.168.161.116:80/no-sidebar.html
|     Line number: 18
|     Comment: 
|         <!-- Header -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 75
|     Comment: 
|         /* Basic */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3652
|     Comment: 
|         /* Medium */
|     
|     Path: http://192.168.161.116:80/elements.html
|     Line number: 291
|     Comment: 
|         <!-- Buttons -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3601
|     Comment: 
|         /* Large */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3589
|     Comment: 
|         /* XLarge */
|     
|     Path: http://192.168.161.116:80/elements.html
|     Line number: 103
|     Comment: 
|         <!-- Lists -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 633
|     Comment: 
|         /* Container */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2753
|     Comment: 
|         /* Table */
|     
|     Path: http://192.168.161.116:80/assets/js/jquery.dropotron.min.js
|     Line number: 1
|     Comment: 
|         /* jquery.dropotron.js v1.4.3 | (c) @ajlkn | github.com/ajlkn/jquery.dropotron | MIT licensed */
|     
|     Path: http://192.168.161.116:80/index.html
|     Line number: 108
|     Comment: 
|         <!-- Three -->
|     
|     Path: http://192.168.161.116:80/no-sidebar.html
|     Line number: 47
|     Comment: 
|         <!-- Main -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 238
|     Comment: 
|         /* Loader */
|     
|     Path: http://192.168.161.116:80/no-sidebar.html
|     Line number: 75
|     Comment: 
|         <!-- Footer -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2150
|     Comment: 
|         /* Section/Article */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3313
|     Comment: 
|         /* Dropotron */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3197
|     Comment: 
|         /* Wrapper */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2934
|     Comment: 
|         /* Goto Next */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2510
|     Comment: 
|         /* Image */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 2413
|     Comment: 
|         /* Icon */
|     
|     Path: http://192.168.161.116:80/index.html
|     Line number: 47
|     Comment: 
|         <!-- Banner -->
|     
|     Path: http://192.168.161.116:80/assets/js/breakpoints.min.js
|     Line number: 1
|     Comment: 
|         /* breakpoints.js v1.0 | @ajlkn | MIT licensed */
|     
|     Path: http://192.168.161.116:80/assets/js/jquery.scrolly.min.js
|     Line number: 1
|     Comment: 
|         /* jquery.scrolly v1.0.0-dev | (c) @ajlkn | MIT licensed */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3746
|     Comment: 
|         /* Small */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3450
|     Comment: 
|         /* Banner */
|     
|     Path: http://192.168.161.116:80/index.html
|     Line number: 124
|     Comment: 
|         <!-- Four -->
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 682
|     Comment: 
|         /* Row */
|     
|     Path: http://192.168.161.116:80/assets/js/jquery.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery v3.4.1 | (c) JS Foundation and other contributors | jquery.org/license */
|     
|     Path: http://192.168.161.116:80/assets/css/main.css
|     Line number: 3532
|     Comment: 
|         /* Footer */
|     
|     Path: http://192.168.161.116:80/assets/js/jquery.scrollex.min.js
|     Line number: 1
|     Comment: 
|         /* jquery.scrollex v0.2.1 | (c) @ajlkn | github.com/ajlkn/jquery.scrollex | MIT licensed */
|     
|     Path: http://192.168.161.116:80/elements.html
|     Line number: 327
|     Comment: 
|         <!-- Form -->
|     
|     Path: http://192.168.161.116:80/assets/js/main.js
|     Line number: 1
|     Comment: 
|         
|         
|         
|         
|         */
|     
|     Path: http://192.168.161.116:80/elements.html
|     Line number: 196
|     Comment: 
|         <!-- Table -->
|     
|     Path: http://192.168.161.116:80/no-sidebar.html
|     Line number: 92
|     Comment: 
|         <!-- Scripts -->
|     
|     Path: http://192.168.161.116:80/assets/js/util.js
|     Line number: 521
|     Comment: 
|         
|         
|         
|         
|_        	 */
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.161.116
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://192.168.161.116:80/
|     Form id: email
|     Form action: #
|     
|     Path: http://192.168.161.116:80/index.html
|     Form id: email
|     Form action: #
|     
|     Path: http://192.168.161.116:80/elements.html
|     Form id: name
|_    Form action: #
|_http-date: Sun, 13 Feb 2022 15:59:00 GMT; +5m45s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /README.txt: Interesting, a readme.
|   /icons/: Potentially interesting folder w/ directory listing
|_  /images/: Potentially interesting folder w/ directory listing
|_http-errors: Couldn't find any error pages.
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-fileupload-exploiter: 
|   
|     Couldn't find a file-type field.
|   
|_    Couldn't find a file-type field.
| http-headers: 
|   Date: Sun, 13 Feb 2022 15:59:03 GMT
|   Server: Apache/2.4.6 (CentOS)
|   Last-Modified: Thu, 06 Jun 2019 21:17:00 GMT
|   ETag: "2380-58aae3c0d4b00"
|   Accept-Ranges: bytes
|   Content-Length: 9088
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
|   Supported Methods: GET HEAD POST OPTIONS TRACE
|_  Potentially risky methods: TRACE
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash aafb44d9ffedb9448dc463122e5dda90
|_Credits query returned unknown hash aafb44d9ffedb9448dc463122e5dda90
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
|_http-server-header: Apache/2.4.6 (CentOS)
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1; html: 5
|     /assets/css/
|       css: 2
|     /assets/js/
|       js: 8
|     /images/
|       jpg: 4
|   Longest directory structure:
|     Depth: 2
|     Dir: /assets/css/
|   Total files found (by extension):
|_    Other: 1; css: 2; html: 5; jpg: 4; js: 8
| http-sql-injection: 
|   Possible sqli for queries:
|     http://192.168.161.116:80/assets/js/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=D%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/js/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.161.116:80/assets/?C=S%3bO%3dA%27%20OR%20sqlspider
|_    http://192.168.161.116:80/assets/?C=D%3bO%3dA%27%20OR%20sqlspider
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: Landed by HTML5 UP
| http-trace: TRACE is enabled
| Headers:
| Date: Sun, 13 Feb 2022 15:59:08 GMT
| Server: Apache/2.4.6 (CentOS)
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
| cms
|_127 names had status 200
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 10:54:49 2022 -- 1 IP address (1 host up) scanned in 106.04 seconds

```