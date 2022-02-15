```bash
nmap -vv --reason -Pn -T4 -sV -p 80 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp80/xml/tcp_80_http_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:46:12 2022 as: nmap -vv --reason -Pn -T4 -sV -p 80 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN /root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp80/xml/tcp_80_http_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-19 18:46:14 +08 for 449s

PORT   STATE SERVICE REASON          VERSION
80/tcp open  http    syn-ack ttl 127 Microsoft IIS httpd 10.0
|_http-errors: Couldn't find any error pages.
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-feed: Couldn't find any feeds.
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1
|     /css/
|       css: 1
|     /images/
|       png: 2
|   Longest directory structure:
|     Depth: 1
|     Dir: /css/
|   Total files found (by extension):
|_    Other: 1; css: 1; png: 2
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.58.70
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://192.168.58.70:80/
|     Form id: myform
|_    Form action: ./
|_http-server-header: Microsoft-IIS/10.0
| http-headers: 
|   Cache-Control: private
|   Content-Length: 1845
|   Content-Type: text/html; charset=utf-8
|   Server: Microsoft-IIS/10.0
|   X-AspNet-Version: 4.0.30319
|   X-Powered-By: ASP.NET
|   Date: Wed, 19 Jan 2022 10:45:27 GMT
|   Connection: close
|   
|_  (Request type: HEAD)
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
|_http-fetch: Please enter the complete path of the directory to save data in.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
| http-vhosts: 
|_128 names had status 200
|_http-comments-displayer: Couldn't find any comments.
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
|_http-config-backup: ERROR: Script execution failed (use -d to debug)
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-malware-host: Host appears to be clean
|_http-devframework: ASP.NET detected. Found related header.
| http-methods: 
|   Supported Methods: OPTIONS TRACE GET HEAD POST
|_  Potentially risky methods: TRACE
| http-security-headers: 
|   Cache_Control: 
|_    Header: Cache-Control: private
| http-php-version: Logo query returned unknown hash 1cbdf7967436c8101f0712926fa9109b
|_Credits query returned unknown hash cda132ff826f9009e431202510025fef
|_http-mobileversion-checker: No mobile version detected.
|_http-title: Plantronics
|_http-chrono: Request times for /; avg: 553.92ms; min: 439.39ms; max: 929.40ms
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
| http-waf-detect: IDS/IPS/WAF detected:
|_192.168.58.70:80/?p4yl04d3=<script>alert(document.cookie)</script>
| http-auth-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.58.70
|   url                       method
|_  http://192.168.58.70:80/  FORM
|_http-favicon: Unknown favicon MD5: 90D5B70E85D458B702B52546F1847EAA
|_http-date: Wed, 19 Jan 2022 10:45:22 GMT; -31m03s from local time.
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 18:53:43 2022 -- 1 IP address (1 host up) scanned in 451.80 seconds

```
