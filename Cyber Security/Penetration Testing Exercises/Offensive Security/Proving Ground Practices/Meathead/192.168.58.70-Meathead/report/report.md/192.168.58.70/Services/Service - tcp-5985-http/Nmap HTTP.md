```bash
nmap -vv --reason -Pn -T4 -sV -p 5985 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_nmap.txt" -oX "/root/autorecon/results/192.168.58.70/scans/tcp5985/xml/tcp_5985_http_nmap.xml" 192.168.58.70
```

[/root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_nmap.txt](file:///root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_nmap.txt):

```
# Nmap 7.92 scan initiated Wed Jan 19 18:49:57 2022 as: nmap -vv --reason -Pn -T4 -sV -p 5985 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN /root/autorecon/results/192.168.58.70/scans/tcp5985/tcp_5985_http_nmap.txt -oX /root/autorecon/results/192.168.58.70/scans/tcp5985/xml/tcp_5985_http_nmap.xml 192.168.58.70
Nmap scan report for 192.168.58.70
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-19 18:50:00 +08 for 783s

Bug in http-security-headers: no string output.
PORT     STATE SERVICE REASON          VERSION
5985/tcp open  http    syn-ack ttl 127 Microsoft HTTPAPI httpd 2.0 (SSDP/UPnP)
| http-useragent-tester: 
|   Status for browser useragent: 404
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
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
|_http-server-header: Microsoft-HTTPAPI/2.0
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
|_http-fetch: Please enter the complete path of the directory to save data in.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
|_http-title: Not Found
|_http-date: Wed, 19 Jan 2022 10:49:13 GMT; -31m00s from local time.
| http-vhosts: 
|_128 names had status 404
|_http-config-backup: ERROR: Script execution failed (use -d to debug)
| http-sitemap-generator: 
|   Directory structure:
|   Longest directory structure:
|     Depth: 0
|     Dir: /
|   Total files found (by extension):
|_    
|_http-csrf: Couldn't find any CSRF vulnerabilities.
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-feed: Couldn't find any feeds.
| http-errors: 
| Spidering limited to: maxpagecount=40; withinhost=192.168.58.70
|   Found the following error pages: 
|   
|   Error Code: 404
|_  	http://192.168.58.70:5985/
|_http-comments-displayer: Couldn't find any comments.
| http-headers: 
|   Content-Type: text/html; charset=us-ascii
|   Server: Microsoft-HTTPAPI/2.0
|   Date: Wed, 19 Jan 2022 10:49:15 GMT
|   Connection: close
|   Content-Length: 315
|   
|_  (Request type: GET)
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-mobileversion-checker: No mobile version detected.
|_http-chrono: Request times for /; avg: 409.97ms; min: 406.07ms; max: 412.11ms
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Wed Jan 19 19:03:03 2022 -- 1 IP address (1 host up) scanned in 785.96 seconds

```
