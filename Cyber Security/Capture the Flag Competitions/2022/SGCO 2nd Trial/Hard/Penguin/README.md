# Penguin

# Penguin 1

## Nikto

```bash
┌──(kali㉿kali)-[/media/sf_tmp/blockcyber]
└─$ nikto -h http://remotelabs.me/
- Nikto v2.1.6
---------------------------------------------------------------------------
+ Target IP:          54.151.146.195
+ Target Hostname:    remotelabs.me
+ Target Port:        80
+ Start Time:         2022-10-29 05:13:20 (GMT-4)
---------------------------------------------------------------------------
+ Server: nginx/1.23.2
+ Retrieved x-powered-by header: PHP/7.2.34
+ The anti-clickjacking X-Frame-Options header is not present.
+ The X-XSS-Protection header is not defined. This header can hint to the user agent to protect against some forms of XSS
+ The X-Content-Type-Options header is not set. This could allow the user agent to render the content of the site in a different fashion to the MIME type
+ No CGI Directories found (use '-C all' to force check all possible dirs)
+ Entry '/tabletopics.php' in robots.txt returned a non-forbidden or redirect HTTP code (200)
+ Entry '/vocabulator.php' in robots.txt returned a non-forbidden or redirect HTTP code (200)
+ "robots.txt" contains 5 entries which should be manually viewed.
+ Web Server returns a valid response with junk HTTP methods, this may cause false positives.
+ OSVDB-3233: /icons/README: Apache default file found.
+ /.gitignore: .gitignore file found. It is possible to grasp the directory structure.
+ 7791 requests: 0 error(s) and 10 item(s) reported on remote host
+ End Time:           2022-10-29 05:14:40 (GMT-4) (80 seconds)
---------------------------------------------------------------------------
+ 1 host(s) tested
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/sf_tmp/blockcyber]
└─$ 
```

```
┌──(kali㉿kali)-[~]
└─$ gobuster dir -u http://remotelabs.me -w /usr/share/wordlists/dirbuster/directory-list-2.3-small.txt                                                             1 ⨯
===============================================================
Gobuster v3.1.0
by OJ Reeves (@TheColonial) & Christian Mehlmauer (@firefart)
===============================================================
[+] Url:                     http://remotelabs.me
[+] Method:                  GET
[+] Threads:                 10
[+] Wordlist:                /usr/share/wordlists/dirbuster/directory-list-2.3-small.txt
[+] Negative Status codes:   404
[+] User Agent:              gobuster/3.1.0
[+] Timeout:                 10s
===============================================================
2022/10/29 06:02:42 Starting gobuster in directory enumeration mode
===============================================================
/index                (Status: 200) [Size: 4697]
/docs                 (Status: 301) [Size: 313] [--> http://remotelabs.me/docs/]
/assets               (Status: 301) [Size: 315] [--> http://remotelabs.me/assets/]
/dist                 (Status: 301) [Size: 313] [--> http://remotelabs.me/dist/]  
                                                                                  
===============================================================
2022/10/29 06:07:34 Finished
===============================================================

```

```bash
┌──(kali㉿kali)-[~]
└─$ curl remotelabs.me/robots.txt
User-agent: *
Disallow: /dist/
Disallow: /assets/
Disallow: /tabletopics.php
Disallow: /apps.php
Disallow: /vocabulator.php                                                                                                                                                                        
┌──(kali㉿kali)-[~]
└─$ 
```

```bash
┌──(kali㉿kali)-[~]
└─$ gobuster dir -u http://remotelabs.me/ -w /usr/share/wordlists/dirbuster/directory-list-2.3-small.txt                                                          130 ⨯
===============================================================
Gobuster v3.1.0
by OJ Reeves (@TheColonial) & Christian Mehlmauer (@firefart)
===============================================================
[+] Url:                     http://remotelabs.me/
[+] Method:                  GET
[+] Threads:                 10
[+] Wordlist:                /usr/share/wordlists/dirbuster/directory-list-2.3-small.txt
[+] Negative Status codes:   404
[+] User Agent:              gobuster/3.1.0
[+] Timeout:                 10s
===============================================================
2022/10/29 05:15:31 Starting gobuster in directory enumeration mode
===============================================================
/index                (Status: 200) [Size: 4697]
/docs                 (Status: 301) [Size: 313] [--> http://remotelabs.me/docs/]
/assets               (Status: 301) [Size: 315] [--> http://remotelabs.me/assets/]
/dist                 (Status: 301) [Size: 313] [--> http://remotelabs.me/dist/]  
...
```

```
┌──(kali㉿kali)-[~]
└─$ dirb http://remotelabs.me  

-----------------
DIRB v2.22    
By The Dark Raver
-----------------

START_TIME: Sat Oct 29 05:43:10 2022
URL_BASE: http://remotelabs.me/
WORDLIST_FILES: /usr/share/dirb/wordlists/common.txt

-----------------

GENERATED WORDS: 4612                                                          

---- Scanning URL: http://remotelabs.me/ ----
==> DIRECTORY: http://remotelabs.me/assets/                                                                                                                            
==> DIRECTORY: http://remotelabs.me/dist/                                                                                                                              
==> DIRECTORY: http://remotelabs.me/docs/                                                                                                                              
+ http://remotelabs.me/favicon.ico (CODE:200|SIZE:3003)                                                                                                                
+ http://remotelabs.me/index (CODE:200|SIZE:4697)                                                                                                                      
+ http://remotelabs.me/index.php (CODE:200|SIZE:4697)                                                                                                                  
+ http://remotelabs.me/robots.txt (CODE:200|SIZE:123)                                                                                                                  
+ http://remotelabs.me/server-status (CODE:403|SIZE:278)                                                                                                               
                                                                                                                                                                       
---- Entering directory: http://remotelabs.me/assets/ ----
==> DIRECTORY: http://remotelabs.me/assets/brand/                                                                                                                      
==> DIRECTORY: http://remotelabs.me/assets/css/                                                                                                                        
==> DIRECTORY: http://remotelabs.me/assets/flash/                                                                                                                      
==> DIRECTORY: http://remotelabs.me/assets/js/                                                                                                                         
                                                                                                                                                                       
---- Entering directory: http://remotelabs.me/dist/ ----
==> DIRECTORY: http://remotelabs.me/dist/css/                                                                                                                          
==> DIRECTORY: http://remotelabs.me/dist/fonts/                                                                                                                        
==> DIRECTORY: http://remotelabs.me/dist/js/                                                                                                                           
                                                                                                                                                                       
---- Entering directory: http://remotelabs.me/docs/ ----
                                                                                                                                                                       
---- Entering directory: http://remotelabs.me/assets/brand/ ----

```

## Pages

![[Pasted image 20221029171714.png]]

![[Pasted image 20221029171504.png]]
![[Pasted image 20221029171545.png]]
