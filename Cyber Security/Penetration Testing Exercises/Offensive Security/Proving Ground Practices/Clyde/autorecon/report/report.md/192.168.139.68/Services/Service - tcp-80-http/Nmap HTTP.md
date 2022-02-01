```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_nmap.txt" -oX "/root/autorecon/results/192.168.139.68/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.139.68
```

[/root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_nmap.txt](file:///root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.92 scan initiated Sun Jan 30 17:02:59 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN /root/autorecon/results/192.168.139.68/scans/tcp80/tcp_80_http_nmap.txt -oX /root/autorecon/results/192.168.139.68/scans/tcp80/xml/tcp_80_http_nmap.xml 192.168.139.68
Nmap scan report for 192.168.139.68
Host is up, received user-set (0.25s latency).
Scanned at 2022-01-30 17:03:02 +08 for 36s

Bug in http-security-headers: no string output.
PORT   STATE SERVICE REASON         VERSION
80/tcp open  http    syn-ack ttl 63 Apache httpd 2.4.25 ((Debian))
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-server-header: Apache/2.4.25 (Debian)
|_http-config-backup: ERROR: Script execution failed (use -d to debug)
| http-headers: 
|   Date: Sun, 30 Jan 2022 09:03:18 GMT
|   Server: Apache/2.4.25 (Debian)
|   Last-Modified: Fri, 24 Apr 2020 09:41:19 GMT
|   ETag: "29cd-5a4062ae58563"
|   Accept-Ranges: bytes
|   Content-Length: 10701
|   Vary: Accept-Encoding
|   Connection: close
|   Content-Type: text/html
|   
|_  (Request type: HEAD)
| http-grep: 
|   (1) http://192.168.139.68:80/apache2;repeatmerged=0": 
|     (1) ip: 
|_      + 192.168.139.68
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-errors: 
| Spidering limited to: maxpagecount=40; withinhost=192.168.139.68
|   Found the following error pages: 
|   
|   Error Code: 404
|   	http://192.168.139.68:80/apache2;repeatmerged=0"
|   
|   Error Code: 404
|_  	http://192.168.139.68:80/manual
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
|_http-title: Apache2 Debian Default Page: It works
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
| http-php-version: Logo query returned unknown hash e2620d4a5a0f8d80dd4b16de59af981f
|_Credits query returned unknown hash e2620d4a5a0f8d80dd4b16de59af981f
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.139.68
|     
|     Path: http://192.168.139.68:80/
|     Line number: 196
|     Comment: 
|         <!--      <div class="table_of_contents floating_element">
|                 <div class="section_header section_header_grey">
|                   TABLE OF CONTENTS
|                 </div>
|                 <div class="table_of_contents_item floating_element">
|                   <a href="#about">About</a>
|                 </div>
|                 <div class="table_of_contents_item floating_element">
|                   <a href="#changes">Changes</a>
|                 </div>
|                 <div class="table_of_contents_item floating_element">
|                   <a href="#scope">Scope</a>
|                 </div>
|                 <div class="table_of_contents_item floating_element">
|                   <a href="#files">Config files</a>
|                 </div>
|               </div>
|_        -->
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-feed: Couldn't find any feeds.
| http-vhosts: 
|_128 names had status 200
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-date: Sun, 30 Jan 2022 09:03:10 GMT; -30m01s from local time.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
| http-methods: 
|_  Supported Methods: HEAD GET POST OPTIONS
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1
|     /icons/
|       png: 1
|   Longest directory structure:
|     Depth: 1
|     Dir: /icons/
|   Total files found (by extension):
|_    Other: 1; png: 1
|_http-chrono: Request times for /; avg: 592.47ms; min: 569.53ms; max: 610.21ms
|_http-malware-host: Host appears to be clean
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-mobileversion-checker: No mobile version detected.

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Jan 30 17:03:38 2022 -- 1 IP address (1 host up) scanned in 39.70 seconds

```
