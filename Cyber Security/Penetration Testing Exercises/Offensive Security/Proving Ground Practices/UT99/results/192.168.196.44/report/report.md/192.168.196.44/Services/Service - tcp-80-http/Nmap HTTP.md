```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.196.44
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Fri Jan 21 07:57:11 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/UT99/results/192.168.196.44/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.196.44
Nmap scan report for 192.168.196.44
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-21 07:57:12 EST for 542s

PORT   STATE SERVICE REASON          VERSION
80/tcp open  http    syn-ack ttl 127 Apache httpd 2.4.16 (OpenSSL/1.0.1p PHP/5.6.12)
| http-auth-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.196.44
|   url                                                                                  method
|   http://192.168.196.44:80/public_html/                                                FORM
|   http://192.168.196.44:80/public_html/index.php?name=Your_Account                     FORM
|   http://192.168.196.44:80/public_html/index.php?name=Search                           FORM
|   http://192.168.196.44:80/public_html/index.php?name=coppermine&amp;file=search       FORM
|   http://192.168.196.44:80/public_html/index.php?name=News&amp;file=article&amp;sid=1  FORM
|   http://192.168.196.44:80/public_html/index.php?name=News&amp;file=submit             FORM
|_  http://192.168.196.44:80/public_html/index.php?name=coppermine                       FORM
|_http-chrono: Request times for /; avg: 658.22ms; min: 612.54ms; max: 762.40ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.196.44
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 7
|     Comment: 
|          // Are we using Internet Explorer Version 5 and up?
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 42
|     Comment: 
|          // konqueror can't get mouse position
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 4
|     Comment: 
|         
|         // of the GNU GENERAL PUBLIC LICENSE Version 2.
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 200
|     Comment: 
|         <!-- Start standard table -->
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 174
|     Comment: 
|         <!--    <p class="gal_title">Coppermine Photo Gallery</p>
|             <p class="gal_desc">Your online photo album</p>-->
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/blockscript.js
|     Line number: 49
|     Comment: 
|          // "domain=cpgnuke.com;";
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 9
|     Comment: 
|          // Current help position and main window size
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 198
|     Comment: 
|         <!-- END meta_links -->
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 189
|     Comment: 
|         <!-- BEGIN meta_links -->
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 31
|     Comment: 
|         
|         // Prepare tip boxes, but don't show them yet
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 180
|     Comment: 
|         <!-- END album_list -->
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 6
|     Comment: 
|          // Tip box width
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 205
|     Comment: 
|         <!-- End standard table -->
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 72
|     Comment: 
|         
|         // Initialize after loading the page
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 2
|     Comment: 
|         
|         // Bubblehelp infoboxes, (C) 2002 Klaus Knopper <infobox@knopper.net>
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 44
|     Comment: 
|          // middle of window
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 186
|     Comment: 
|         <!-- END register -->
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 10
|     Comment: 
|          // Pointer to infodiv container
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 178
|     Comment: 
|         <!-- BEGIN album_list -->
|     
|     Path: http://192.168.196.44:80/public_html/includes/javascript/infobox.js
|     Line number: 8
|     Comment: 
|          // Are we using KDE Konqueror?
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Line number: 184
|     Comment: 
|_        <!-- BEGIN register -->
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.196.44
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://192.168.196.44:80/public_html/
|     Form id: 
|     Form action: /public_html/
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=Your_Account
|     Form id: 
|     Form action: /public_html/index.php?name=Your_Account
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=Your_Account
|     Form id: ulogin2
|     Form action: index.php?name=Your_Account
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=Search
|     Form id: 
|     Form action: /public_html/index.php?name=Search
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=Search
|     Form id: topic
|     Form action: index.php?name=Search
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine&amp;file=search
|     Form id: 
|     Form action: /public_html/index.php?name=coppermine&file=search
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=News&amp;file=article&amp;sid=1
|     Form id: 
|     Form action: /public_html/index.php?name=News&file=article&sid=1
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=News&amp;file=submit
|     Form id: 
|     Form action: /public_html/index.php?name=News&file=submit
|     
|     Path: http://192.168.196.44:80/public_html/index.php?name=coppermine
|     Form id: 
|_    Form action: /public_html/index.php?name=coppermine
|_http-date: Fri, 21 Jan 2022 12:57:22 GMT; -1s from local time.
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
|   	http://192.168.196.44:80/public_html/index.php?name=http://tools.ietf.org/html/rfc13?&amp;file=submit
|   
|   Error Code: 503
|   	http://192.168.196.44:80/public_html/index.php?name=Forums&amp;file=search
|   
|   Error Code: 503
|_  	http://192.168.196.44:80/public_html/index.php?name=Members_List
| http-feed: 
| Spidering limited to: maxpagecount=40; withinhost=192.168.196.44
|   Found the following feeds: 
|_    RSS (version 2.0): http://192.168.196.44:80/public_html/rss/news2.php
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-grep: 
|   (1) http://192.168.196.44:80/: 
|     (1) ip: 
|       + 192.168.196.44
|   (1) http://192.168.196.44:80/public_html/includes/javascript/infobox.js: 
|     (1) email: 
|_      + infobox@knopper.net
| http-headers: 
|   Date: Fri, 21 Jan 2022 12:57:21 GMT
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
| http-php-version: Logo query returned unknown hash 9f9ead63d1a575b26612de353ee5e635
|_Credits query returned unknown hash 9f9ead63d1a575b26612de353ee5e635
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
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
|       gif: 2
|     /public_html/images/topics/
|       gif: 1
|   Longest directory structure:
|     Depth: 3
|     Dir: /public_html/images/blocks/
|   Total files found (by extension):
|_    Other: 2; gif: 6; php: 1
| http-sql-injection: 
|   Possible sqli for queries:
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dD%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=D%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=S%3bO%3dA%27%20OR%20sqlspider
|     http://192.168.196.44:80/?C=M%3bO%3dA%27%20OR%20sqlspider
|_    http://192.168.196.44:80/?C=N%3bO%3dA%27%20OR%20sqlspider
| http-stored-xss: 
|   Found the following stored XSS vulnerabilities: 
|   
|      Payload: zxc'xcv
| 	 Uploaded on: http://192.168.196.44:80/public_html/index.php?name=coppermine&amp;file=search
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: http://192.168.196.44:80/public_html/index.php?name=News&amp;file=article&amp;sid=1
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: http://192.168.196.44:80/public_html/index.php?name=News&amp;file=submit
| 	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|   
|      Payload: zxc'xcv
| 	 Uploaded on: http://192.168.196.44:80/public_html/index.php?name=coppermine
|_	 Description: Unfiltered ' (apostrophe). An indication of potential XSS vulnerability.
|_http-title: Index of /
| http-trace: TRACE is enabled
| Headers:
| Date: Fri, 21 Jan 2022 12:57:19 GMT
| Server: Apache/2.4.16 (Win32) OpenSSL/1.0.1p PHP/5.6.12
| Connection: close
| Transfer-Encoding: chunked
|_Content-Type: message/http
| http-unsafe-output-escaping: 
|_  Characters ['] reflected in parameter sid at http://192.168.196.44:80/public_html/index.php?name=News&amp;file=article&amp;sid=1
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
Service Info: Host: localhost

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Fri Jan 21 08:06:15 2022 -- 1 IP address (1 host up) scanned in 544.43 seconds

```
