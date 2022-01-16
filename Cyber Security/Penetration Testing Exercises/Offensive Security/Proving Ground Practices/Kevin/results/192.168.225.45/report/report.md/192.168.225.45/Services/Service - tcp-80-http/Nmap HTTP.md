```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.225.45
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Jan 16 08:11:02 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/tcp_80_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Kevin/results/192.168.225.45/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.225.45
Nmap scan report for 192.168.225.45
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-16 08:11:11 EST for 441s

PORT   STATE SERVICE REASON          VERSION
80/tcp open  http    syn-ack ttl 127 GoAhead WebServer
| http-auth-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.225.45
|   url                                                                        method
|   http://192.168.225.45:80/index.asp                                         FORM
|_  http://192.168.225.45:80/index.asp?Message=Invalid user name or password.  FORM
| http-backup-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.225.45
|   http://192.168.225.45:80/CStyle/Theme.bak
|   http://192.168.225.45:80/CStyle/Theme.css~
|   http://192.168.225.45:80/CStyle/Theme copy.css
|   http://192.168.225.45:80/CStyle/Copy of Theme.css
|   http://192.168.225.45:80/CStyle/Copy (2) of Theme.css
|   http://192.168.225.45:80/CStyle/Theme.css.1
|   http://192.168.225.45:80/CStyle/Theme.css.~1~
|   http://192.168.225.45:80/goform/%20'/index.bak
|   http://192.168.225.45:80/goform/%20'/index.asp~
|   http://192.168.225.45:80/goform/%20'/index copy.asp
|   http://192.168.225.45:80/goform/%20'/Copy of index.asp
|   http://192.168.225.45:80/goform/%20'/Copy (2) of index.asp
|   http://192.168.225.45:80/goform/%20'/index.asp.1
|_  http://192.168.225.45:80/goform/%20'/index.asp.~1~
|_http-chrono: Request times for /index.asp; avg: 906.00ms; min: 885.15ms; max: 951.44ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.225.45
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Line number: 120
|     Comment: 
|         <!-- *** dialog box content *** -->
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Line number: 113
|     Comment: 
|         <!-- System Login -->
|     
|     Path: http://192.168.225.45:80/CStyle/Theme.css
|     Line number: 8
|     Comment: 
|         /* 1st we cover the background color of a page for our three major display frames */
|     
|     Path: http://192.168.225.45:80/CStyle/Theme.css
|     Line number: 33
|     Comment: 
|         /* a unique set for tab navigation displays */
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Line number: 102
|     Comment: 
|         <!-- *** begin dialog box *** -->
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Line number: 15
|     Comment: 
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         		//-->
|     
|     Path: http://192.168.225.45:80/CStyle/Theme.css
|     Line number: 25
|     Comment: 
|         /* a unique set for error type displays */
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Line number: 106
|     Comment: 
|         <!-- *** header bar *** -->
|     
|     Path: http://192.168.225.45:80/CStyle/Theme.css
|     Line number: 16
|     Comment: 
|         /* a unique set for dialog type displays, used most often */
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Line number: 92
|     Comment: 
|         <!-- *** login page ****************************************************** -->
|     
|     Path: http://192.168.225.45:80/index.asp
|     Line number: 15
|     Comment: 
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         
|         		//-->
|     
|     Path: http://192.168.225.45:80/CStyle/Theme.css
|     Line number: 2
|     Comment: 
|         /* default values for selected tags, Note: without background color defined! */
|     
|     Path: http://192.168.225.45:80/goform/formLogin
|     Line number: 6
|     Comment: 
|         <!--
|         top.location.href = '/index.asp?Message=Invalid user name or password.';
|_        -->
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.225.45
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://192.168.225.45:80/index.asp
|     Form id: 
|     Form action: /goform/formLogin
|     
|     Path: http://192.168.225.45:80/index.asp?Message=Invalid user name or password.
|     Form id: 
|_    Form action: /goform/formLogin
|_http-date: Sun Jan 16 05:11:22 2022; -8h00m00s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /cgi-bin/mj_wwwusr: Majordomo2 Mailing List
|   /cgi-bin/vcs: Mitel Audio and Web Conferencing (AWC)
|   /cgi-bin/ffileman.cgi?: Ffileman Web File Manager
|   /cgi-bin/ck/mimencode: ContentKeeper Web Appliance
|   /cgi-bin/masterCGI?: Alcatel-Lucent OmniPCX Enterprise
|   /cgi-bin/awstats.pl: AWStats
|_  /cgi-bin/image/shikaku2.png: TeraStation PRO RAID 0/1/5 Network Attached Storage
|_http-errors: Couldn't find any error pages.
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-headers: 
|   Date: Sun Jan 16 05:11:28 2022
|   Server: GoAhead-Webs
|   Pragma: no-cache
|   Cache-Control: no-cache
|   Content-type: text/html
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-majordomo2-dir-traversal: ERROR: Script execution failed (use -d to debug)
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash 3eed0da39686ae686bf048c444b70841
|_Credits query returned unknown hash 3eed0da39686ae686bf048c444b70841
|_http-referer-checker: Couldn't find any cross-domain scripts.
| http-security-headers: 
|   Cache_Control: 
|     Header: Cache-Control: no-cache
|   Pragma: 
|_    Header: Pragma: no-cache
|_http-server-header: GoAhead-Webs
| http-sitemap-generator: 
|   Directory structure:
|     /
|       asp: 1
|     /CStyle/
|       css: 1
|     /goform/
|       Other: 1
|     /goform/%20'/
|       asp: 1
|   Longest directory structure:
|     Depth: 2
|     Dir: /goform/%20'/
|   Total files found (by extension):
|_    Other: 1; asp: 2; css: 1
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
| http-title: HP Power Manager
|_Requested resource was http://192.168.225.45/index.asp
| http-useragent-tester: 
|   Status for browser useragent: 200
|   Redirected To: http://192.168.225.45/index.asp
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
| http-waf-detect: IDS/IPS/WAF detected:
|_192.168.225.45:80/?p4yl04d3=<script>alert(document.cookie)</script>
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 16 08:18:32 2022 -- 1 IP address (1 host up) scanned in 450.55 seconds

```
