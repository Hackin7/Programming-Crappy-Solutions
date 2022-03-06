```bash
nmap -vv --reason -Pn -T4 -sV -p 2224 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp2224/tcp_2224_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp2224/xml/tcp_2224_http_nmap.xml" 192.168.168.140
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp2224/tcp_2224_http_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp2224/tcp_2224_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Mar  5 12:22:03 2022 as: nmap -vv --reason -Pn -T4 -sV -p 2224 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp2224/tcp_2224_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Hepet/results/192.168.168.140/scans/tcp2224/xml/tcp_2224_http_nmap.xml" 192.168.168.140
Nmap scan report for 192.168.168.140
Host is up, received user-set (0.17s latency).
Scanned at 2022-03-05 12:22:06 EST for 81s

PORT     STATE SERVICE REASON          VERSION
2224/tcp open  http    syn-ack ttl 127 Mercury/32 httpd
|_http-aspnet-debug: ERROR: Script execution failed (use -d to debug)
| http-auth-finder: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.168.140
|   url                               method
|_  http://192.168.168.140:2224/mlss  FORM
|_http-chrono: Request times for /; avg: 785.13ms; min: 763.01ms; max: 816.33ms
|_http-comments-displayer: Couldn't find any comments.
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.168.140
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://192.168.168.140:2224/mlss
|     Form id: 
|     Form action: /mlss/SubscribeToList
|     
|     Path: http://192.168.168.140:2224/mlss
|     Form id: 
|     Form action: /mlss/ManageSubscription
|     
|     Path: http://192.168.168.140:2224/mlss
|     Form id: 
|     Form action: /mlss/ForgotPassword
|     
|     Path: http://192.168.168.140:2224/mlss
|     Form id: 
|_    Form action: /mlss/MassChange
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-errors: ERROR: Script execution failed (use -d to debug)
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-headers: 
|   Content-type: text/html
|   Content-Length: 2841
|   
|_  (Request type: GET)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD
|_http-mobileversion-checker: No mobile version detected.
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 2
|     /mlss/
|       Other: 4
|   Longest directory structure:
|     Depth: 1
|     Dir: /mlss/
|   Total files found (by extension):
|_    Other: 6
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: Mercury HTTP Services
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
|_http-vuln-cve2014-3704: ERROR: Script execution failed (use -d to debug)
|_http-wordpress-users: [Error] Wordpress installation was not found. We couldn't find wp-login.php
Service Info: OS: Windows; CPE: cpe:/o:microsoft:windows

Read data files from: /usr/bin/../share/nmap
Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
# Nmap done at Sat Mar  5 12:23:28 2022 -- 1 IP address (1 host up) scanned in 84.59 seconds

```
