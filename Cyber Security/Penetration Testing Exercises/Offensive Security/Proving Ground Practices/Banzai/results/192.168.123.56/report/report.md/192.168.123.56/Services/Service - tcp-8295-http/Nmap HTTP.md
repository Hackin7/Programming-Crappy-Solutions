```bash
nmap -vv --reason -Pn -T4 -sV -p 8295 --script="banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/tcp_8295_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/xml/tcp_8295_http_nmap.xml" 192.168.123.56
```

[/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/tcp_8295_http_nmap.txt](file:///media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/tcp_8295_http_nmap.txt):

```
# Nmap 7.91 scan initiated Sat Jan 15 12:36:44 2022 as: nmap -vv --reason -Pn -T4 -sV -p 8295 "--script=banner,(http* or ssl*) and not (brute or broadcast or dos or external or http-slowloris* or fuzzer)" -oN "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/tcp_8295_http_nmap.txt" -oX "/media/sf_Stuff1/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Banzai/results/192.168.123.56/scans/tcp8295/xml/tcp_8295_http_nmap.xml" 192.168.123.56
Nmap scan report for 192.168.123.56
Host is up, received user-set (0.18s latency).
Scanned at 2022-01-15 12:36:46 EST for 97s

PORT     STATE SERVICE REASON         VERSION
8295/tcp open  http    syn-ack ttl 63 Apache httpd 2.4.25 ((Debian))
|_http-chrono: Request times for /; avg: 1208.62ms; min: 624.62ms; max: 3113.99ms
| http-comments-displayer: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.123.56
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 93
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 135
|     Comment: 
|         
|         
|         --------------------------------------------------------------*/
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 118
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 296
|     Comment: 
|         /* Nav Meu Styling */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 64
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 53
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 963
|     Comment: 
|         
|         
|         --------------------------------------------------------------*/
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 857
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 45
|     Comment: 
|         <!--<a href="#hero"><img src="img/logo.png" alt="" title="" /></img></a>-->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 62
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 50
|     Comment: 
|         /* Back to top button */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 114
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 89
|     Comment: 
|         <!-- #hero -->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 580
|     Comment: 
|         <!-- Contact Form JavaScript File -->
|     
|     Path: http://192.168.123.56:8295/contactform/contactform.js
|     Line number: 4
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 715
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 137
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 669
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 76
|     Comment: 
|         <!-- #nav-menu-container -->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 7
|     Comment: 
|         
|         
|         --------------------------------------------------------------*/
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 596
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 556
|     Comment: 
|         
|         
|         
|         
|         
|                 -->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 126
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 496
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 70
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 476
|     Comment: 
|         
|         
|         --------------------------------------------------------------*/
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 463
|     Comment: 
|         /* Mobile Nav body classes */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 537
|     Comment: 
|         <!-- #contact -->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 541
|     Comment: 
|         
|         
|           ============================-->
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 106
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 242
|     Comment: 
|         <!-- #call-to-action -->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 391
|     Comment: 
|         /* Mobile Nav Styling */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 132
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 111
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 266
|     Comment: 
|         /* Nav Menu Arrows */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 21
|     Comment: 
|         <!-- Libraries CSS Files -->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 284
|     Comment: 
|         /* Nav Meu Container */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 226
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 130
|     Comment: 
|         <!-- #about -->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 365
|     Comment: 
|         /* Mobile Nav Toggle */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 139
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 15
|     Comment: 
|         <!-- Google Fonts -->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 228
|     Comment: 
|         /* Nav Menu Essentials */
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 225
|     Comment: 
|         
|         
|         --------------------------------------------------------------*/
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 81
|     Comment: 
|         
|         
|         --------------------------------------------------------------*/
|     
|     Path: http://192.168.123.56:8295/contactform/contactform.js
|     Line number: 16
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/jquery/jquery-migrate.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery Migrate v3.0.0 | (c) jQuery Foundation and other contributors | jquery.org/license */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 78
|     Comment: 
|         <!-- #header -->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 141
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 806
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 31
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 93
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 38
|     Comment: 
|         /* Prelaoder */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 68
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/superfish.min.js
|     Line number: 1
|     Comment: 
|         /*
|          * jQuery Superfish Menu Plugin - v1.7.9
|          * Copyright (c) 2016 Joel Birch
|          *
|          * Dual licensed under the MIT and GPL licenses:
|          *	http://www.opensource.org/licenses/mit-license.php
|          *	http://www.gnu.org/licenses/gpl.html
|          */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 166
|     Comment: 
|         <!-- #facts -->
|     
|     Path: http://192.168.123.56:8295/lib/wow/wow.min.js
|     Line number: 1
|     Comment: 
|         
|         
|         * Copyright (c) 2016 Thomas Grainger; Licensed MIT */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 38
|     Comment: 
|         
|         
|           ============================-->
|     
|     Path: http://192.168.123.56:8295/lib/bootstrap/css/bootstrap.min.css
|     Line number: 7
|     Comment: 
|         /*# sourceMappingURL=bootstrap.min.css.map */
|     
|     Path: http://192.168.123.56:8295/lib/bootstrap/css/bootstrap.min.css
|     Line number: 1
|     Comment: 
|         /*!
|          * Bootstrap v4.0.0 (https://getbootstrap.com)
|          * Copyright 2011-2018 The Bootstrap Authors
|          * Copyright 2011-2018 Twitter, Inc.
|          * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
|          */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 155
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 150
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 148
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 569
|     Comment: 
|         <!-- JavaScript Libraries -->
|     
|     Path: http://192.168.123.56:8295/contactform/contactform.js
|     Line number: 12
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 145
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 90
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 129
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 72
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 46
|     Comment: 
|         <!-- Uncomment below if you prefer to use a text logo -->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 143
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/animate/animate.min.css
|     Line number: 3
|     Comment: 
|         
|         
|         
|         
|         
|         
|          */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 135
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 127
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 16
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 168
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 576
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 479
|     Comment: 
|         
|         --------------------------------*/
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 20
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 124
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 123
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 122
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 583
|     Comment: 
|         <!-- Template Main Javascript File -->
|     
|     Path: http://192.168.123.56:8295/lib/jquery/jquery.min.js
|     Line number: 1
|     Comment: 
|         /*! jQuery v3.2.1 | (c) JS Foundation and other contributors | jquery.org/license */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 106
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 132
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/contactform/contactform.js
|     Line number: 102
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 71
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 83
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 78
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 50
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 56
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/contactform/contactform.js
|     Line number: 10
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 462
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 25
|     Comment: 
|         <!-- Main Stylesheet File -->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 76
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 28
|     Comment: 
|         
|         
|         
|         
|         
|           ======================================================= -->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 125
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/css/style.css
|     Line number: 1
|     Comment: 
|         
|         
|         
|         
|         
|         */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 146
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/counterup/counterup.min.js
|     Line number: 1
|     Comment: 
|         /*!
|          * jquery.counterup.js 2.1.0
|          *
|          * Copyright 2013, Benjamin Intal http://gambit.ph @bfintal
|          * Released under the GPL v2 License
|          *
|          * Amended by Jeremy Paris, Ciro Mattia Gonano and others
|          *
|          * Date: Feb 24, 2017
|          */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 2
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 18
|     Comment: 
|         <!-- Bootstrap CSS File -->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 20
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 23
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 24
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 1
|     Comment: 
|         
|         
|         
|         
|         
|         
|         
|          */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 10
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
|          */
|     
|     Path: http://192.168.123.56:8295/lib/font-awesome/css/font-awesome.min.css
|     Line number: 1
|     Comment: 
|         /*!
|          *  Font Awesome 4.7.0 by @davegandy - http://fontawesome.io - @fontawesome
|          *  License - http://fontawesome.io/license (Font: SIL OFL 1.1, CSS: MIT License)
|          */
|     
|     Path: http://192.168.123.56:8295/lib/bootstrap/js/bootstrap.bundle.min.js
|     Line number: 1
|     Comment: 
|         /*!
|           * Bootstrap v4.0.0 (https://getbootstrap.com)
|           * Copyright 2011-2018 The Bootstrap Authors (https://github.com/twbs/bootstrap/graphs/contributors)
|           * Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
|           */
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 390
|     Comment: 
|         <!-- #portfolio -->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 244
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 108
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/lib/waypoints/waypoints.min.js
|     Line number: 1
|     Comment: 
|         /*!
|         Waypoints - 4.0.1
|         Copyright \xC2\xA9 2011-2016 Caleb Troughton
|         Licensed under the MIT license.
|         https://github.com/imakewebthings/waypoints/blob/master/licenses.txt
|         */
|     
|     Path: http://192.168.123.56:8295/lib/superfish/hoverIntent.js
|     Line number: 43
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 392
|     Comment: 
|         
|         
|             ============================-->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 473
|     Comment: 
|         <!-- Uncomment below if you wan to use dynamic maps -->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 80
|     Comment: 
|         
|         
|           ============================-->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 224
|     Comment: 
|         <!-- #services -->
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 128
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 3
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/js/main.js
|     Line number: 122
|     Comment: 
|         
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 565
|     Comment: 
|         <!-- #footer -->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 11
|     Comment: 
|         <!-- Favicons -->
|     
|     Path: http://192.168.123.56:8295/
|     Line number: 460
|     Comment: 
|_        <!-- #team -->
| http-csrf: 
| Spidering limited to: maxdepth=3; maxpagecount=20; withinhost=192.168.123.56
|   Found the following possible CSRF vulnerabilities: 
|     
|     Path: http://192.168.123.56:8295/
|     Form id: name
|_    Form action: 
|_http-date: Sat, 15 Jan 2022 17:36:03 GMT; -56s from local time.
|_http-devframework: Couldn't determine the underlying framework or CMS. Try increasing 'httpspider.maxpagecount' value to spider more pages.
|_http-dombased-xss: Couldn't find any DOM based XSS.
|_http-drupal-enum: Nothing found amongst the top 100 resources,use --script-args number=<number|all> for deeper analysis)
| http-enum: 
|   /css/: Potentially interesting directory w/ listing on 'apache/2.4.25 (debian)'
|   /img/: Potentially interesting directory w/ listing on 'apache/2.4.25 (debian)'
|   /js/: Potentially interesting directory w/ listing on 'apache/2.4.25 (debian)'
|_  /lib/: Potentially interesting directory w/ listing on 'apache/2.4.25 (debian)'
|_http-errors: Couldn't find any error pages.
|_http-exif-spider: ERROR: Script execution failed (use -d to debug)
|_http-feed: Couldn't find any feeds.
|_http-fetch: Please enter the complete path of the directory to save data in.
| http-fileupload-exploiter: 
|   
|     Couldn't find a file-type field.
|   
|_    Couldn't find a file-type field.
| http-grep: 
|   (1) http://192.168.123.56:8295/: 
|     (1) email: 
|       + info@example.com
|   (1) http://192.168.123.56:8295/contactform/contactform/contactform.php: 
|     (1) ip: 
|_      + 192.168.123.56
| http-headers: 
|   Date: Sat, 15 Jan 2022 17:36:05 GMT
|   Server: Apache/2.4.25 (Debian)
|   Connection: close
|   Content-Type: text/html; charset=UTF-8
|   
|_  (Request type: HEAD)
|_http-jsonp-detection: Couldn't find any JSONP endpoints.
|_http-litespeed-sourcecode-download: Request with null byte did not work. This web server might not be vulnerable
|_http-malware-host: Host appears to be clean
| http-methods: 
|_  Supported Methods: GET HEAD POST OPTIONS
|_http-mobileversion-checker: No mobile version detected.
| http-php-version: Logo query returned unknown hash caff9be7439ab4979e80360fe678b463
|_Credits query returned unknown hash caff9be7439ab4979e80360fe678b463
|_http-referer-checker: Couldn't find any cross-domain scripts.
|_http-security-headers: 
|_http-server-header: Apache/2.4.25 (Debian)
| http-sitemap-generator: 
|   Directory structure:
|     /
|       Other: 1
|     /css/
|       css: 1
|     /img/
|       jpg: 3; png: 2
|     /img/portfolio/
|       jpg: 7
|     /lib/animate/
|       css: 1
|     /lib/bootstrap/js/
|       js: 1
|     /lib/easing/
|       js: 1
|     /lib/font-awesome/css/
|       css: 1
|     /lib/jquery/
|       js: 2
|   Longest directory structure:
|     Depth: 3
|     Dir: /lib/font-awesome/css/
|   Total files found (by extension):
|_    Other: 1; css: 3; jpg: 10; js: 4; png: 2
|_http-stored-xss: Couldn't find any stored XSS vulnerabilities.
|_http-title: Banzai
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
# Nmap done at Sat Jan 15 12:38:23 2022 -- 1 IP address (1 host up) scanned in 98.84 seconds

```
