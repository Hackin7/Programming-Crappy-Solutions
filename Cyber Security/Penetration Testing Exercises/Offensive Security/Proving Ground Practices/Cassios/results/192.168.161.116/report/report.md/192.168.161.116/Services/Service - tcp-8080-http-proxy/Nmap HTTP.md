```bash
nmap -vv --reason -Pn -T4 -sV -p 8080 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/xml/tcp_8080_http_nmap.xml" 192.168.161.116
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_nmap.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sun Feb 13 10:53:06 2022 as: nmap -vv --reason -Pn -T4 -sV -p 8080 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_nmap.txt" -oX "/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/xml/tcp_8080_http_nmap.xml" 192.168.161.116
Nmap scan report for 192.168.161.116
Host is up, received user-set (0.18s latency).
Scanned at 2022-02-13 10:53:10 EST for 147s

PORT     STATE SERVICE    REASON         VERSION
8080/tcp open  http-proxy syn-ack ttl 63
| fingerprint-strings: 
|   GetRequest: 
|     HTTP/1.1 200 
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Cache-Control: no-cache, no-store, max-age=0, must-revalidate
|     Pragma: no-cache
|     Expires: 0
|     X-Frame-Options: DENY
|     Content-Type: text/html;charset=UTF-8
|     Content-Language: en-US
|     Date: Sun, 13 Feb 2022 15:59:02 GMT
|     Connection: close
|     <!doctype html>
|     <html lang="en">
|     <head>
|     <meta charset="utf-8">
|     <meta http-equiv="x-ua-compatible" content="ie=edge">
|     <meta name="viewport" content="width=device-width, initial-scale=1">
|     <title></title>
|     <link rel="stylesheet" href="/css/main.css">
|     </head>
|     <body>
|     <div class="small-container">
|     <div class="flex-row">
|     <h1>Recycler Management System</h1>
|     </div>
|     <div class="flex-row">
|     <img src="/images/factory.jpg" class="round-button">
|     </div> 
|     </div>
|     <br>
|     <div class="small-container">
|     <div class="flex-small">Control system for the factory
|   HTTPOptions: 
|     HTTP/1.1 200 
|     Allow: GET,HEAD,OPTIONS
|     X-Content-Type-Options: nosniff
|     X-XSS-Protection: 1; mode=block
|     Cache-Control: no-cache, no-store, max-age=0, must-revalidate
|     Pragma: no-cache
|     Expires: 0
|     X-Frame-Options: DENY
|     Content-Length: 0
|     Date: Sun, 13 Feb 2022 15:59:02 GMT
|     Connection: close
|   RTSPRequest: 
|     HTTP/1.1 400 
|     Content-Type: text/html;charset=utf-8
|     Content-Language: en
|     Content-Length: 435
|     Date: Sun, 13 Feb 2022 15:59:03 GMT
|     Connection: close
|     <!doctype html><html lang="en"><head><title>HTTP Status 400 
|     Request</title><style type="text/css">body {font-family:Tahoma,Arial,sans-serif;} h1, h2, h3, b {color:white;background-color:#525D76;} h1 {font-size:22px;} h2 {font-size:16px;} h3 {font-size:14px;} p {font-size:12px;} a {color:black;} .line {height:1px;background-color:#525D76;border:none;}</style></head><body><h1>HTTP Status 400 
|_    Request</h1></body></html>
| http-auth-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.161.116
|   url                                method
|   http://192.168.161.116:8080/login  FORM
|_  http://192.168.161.116:8080/login  FORM
|_http-chrono: Request times for /; avg: 16610.39ms; min: 426.89ms; max: 81223.97ms
|_http-config-backup: ERROR: Script execution failed (use -d to debug)
|_http-date: Sun, 13 Feb 2022 15:59:25 GMT; +5m45s from local time.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-exif-spider: 
|   http://192.168.161.116:8080/images/factory.jpg
|_    Date: 2020:09:23 13:40:17
|_http-favicon: Unknown favicon MD5: 1B39A71B16669EE30C92DEE290B7D9FA
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-grep: 
|   (1) http://192.168.161.116:8080/css/main.css: 
|     (1) email: 
|_      + hello@taniarascia.com
| http-headers: 
|   X-Content-Type-Options: nosniff
|   X-XSS-Protection: 1; mode=block
|   Cache-Control: no-cache, no-store, max-age=0, must-revalidate
|   Pragma: no-cache
|   Expires: 0
|   X-Frame-Options: DENY
|   Content-Type: text/html;charset=UTF-8
|   Content-Language: en-US
|   Content-Length: 746
|   Date: Sun, 13 Feb 2022 15:59:29 GMT
|   Connection: close
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-majordomo2-dir-traversal: ERROR: Script execution failed (use -d to debug)
| http-methods: 
|_  Supported Methods: GET HEAD OPTIONS POST
|_http-php-version: Credits query returned unknown hash 0e6bce5e04cf393720ffd73ccad9a6bc
|_http-title: Site doesn't have a title (text/html;charset=UTF-8).
| http-vhosts: 
| 125 names had status 200
| ftp0
| mx1
|_info
| http-vuln-cve2010-0738: 
|_  /jmx-console/: Authentication was not required
|_http-vuln-cve2017-1001000: ERROR: Script execution failed (use -d to debug)
| http-waf-detect: IDS/IPS/WAF detected:
|_192.168.161.116:8080/?p4yl04d3=<script>alert(document.cookie)</script>
|_http-wordpress-enum: Nothing found amongst the top 100 resources,use --script-args search-limit=<number|all> for deeper analysis)
1 service unrecognized despite returning data. If you know the service/version, please submit the following fingerprint at https://nmap.org/cgi-bin/submit.cgi?new-service :
SF-Port8080-TCP:V=7.91%I=7%D=2/13%Time=6209296C%P=x86_64-pc-linux-gnu%r(Ge
SF:tRequest,429,"HTTP/1\.1\x20200\x20\r\nX-Content-Type-Options:\x20nosnif
SF:f\r\nX-XSS-Protection:\x201;\x20mode=block\r\nCache-Control:\x20no-cach
SF:e,\x20no-store,\x20max-age=0,\x20must-revalidate\r\nPragma:\x20no-cache
SF:\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY\r\nContent-Type:\x20text/
SF:html;charset=UTF-8\r\nContent-Language:\x20en-US\r\nDate:\x20Sun,\x2013
SF:\x20Feb\x202022\x2015:59:02\x20GMT\r\nConnection:\x20close\r\n\r\n<!doc
SF:type\x20html>\n<html\x20lang=\"en\">\n\n<head>\n\x20\x20<meta\x20charse
SF:t=\"utf-8\">\n\x20\x20<meta\x20http-equiv=\"x-ua-compatible\"\x20conten
SF:t=\"ie=edge\">\n\x20\x20<meta\x20name=\"viewport\"\x20content=\"width=d
SF:evice-width,\x20initial-scale=1\">\n\n\x20\x20<title></title>\n\n\x20\x
SF:20<link\x20rel=\"stylesheet\"\x20href=\"/css/main\.css\">\n\x20\x20\n</
SF:head>\n\n<body>\n\t\n\t<div\x20class=\"small-container\">\n\t\t<div\x20
SF:class=\"flex-row\">\n\t\t\t<h1>Recycler\x20Management\x20System</h1>\n\
SF:t\t</div>\n\t\t<div\x20class=\"flex-row\">\n\t\t\t<img\x20src=\"/images
SF:/factory\.jpg\"\x20class=\"round-button\">\n\t\t</div>\x20\n\n\t</div>\
SF:n\t<br>\n\t<div\x20class=\"small-container\">\n\n\t\t\t<div\x20class=\"
SF:flex-small\">Control\x20system\x20for\x20the\x20factory\x20")%r(HTTPOpt
SF:ions,12B,"HTTP/1\.1\x20200\x20\r\nAllow:\x20GET,HEAD,OPTIONS\r\nX-Conte
SF:nt-Type-Options:\x20nosniff\r\nX-XSS-Protection:\x201;\x20mode=block\r\
SF:nCache-Control:\x20no-cache,\x20no-store,\x20max-age=0,\x20must-revalid
SF:ate\r\nPragma:\x20no-cache\r\nExpires:\x200\r\nX-Frame-Options:\x20DENY
SF:\r\nContent-Length:\x200\r\nDate:\x20Sun,\x2013\x20Feb\x202022\x2015:59
SF::02\x20GMT\r\nConnection:\x20close\r\n\r\n")%r(RTSPRequest,24E,"HTTP/1\
SF:.1\x20400\x20\r\nContent-Type:\x20text/html;charset=utf-8\r\nContent-La
SF:nguage:\x20en\r\nContent-Length:\x20435\r\nDate:\x20Sun,\x2013\x20Feb\x
SF:202022\x2015:59:03\x20GMT\r\nConnection:\x20close\r\n\r\n<!doctype\x20h
SF:tml><html\x20lang=\"en\"><head><title>HTTP\x20Status\x20400\x20\xe2\x80
SF:\x93\x20Bad\x20Request</title><style\x20type=\"text/css\">body\x20{font
SF:-family:Tahoma,Arial,sans-serif;}\x20h1,\x20h2,\x20h3,\x20b\x20{color:w
SF:hite;background-color:#525D76;}\x20h1\x20{font-size:22px;}\x20h2\x20{fo
SF:nt-size:16px;}\x20h3\x20{font-size:14px;}\x20p\x20{font-size:12px;}\x20
SF:a\x20{color:black;}\x20\.line\x20{height:1px;background-color:#525D76;b
SF:order:none;}</style></head><body><h1>HTTP\x20Status\x20400\x20\xe2\x80\
SF:x93\x20Bad\x20Request</h1></body></html>");

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sun Feb 13 10:55:37 2022 -- 1 IP address (1 host up) scanned in 151.33 seconds

```
