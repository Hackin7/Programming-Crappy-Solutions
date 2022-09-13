https://portswigger.net/web-security/authentication/other-mechanisms/lab-brute-forcing-a-stay-logged-in-cookie

Firstly, login, checking the Stay logged in checkbox

![](Pasted%20image%2020220824232213.png)

Analyse the cookies in the request

```
GET /login HTTP/1.1
Host: 0a3000da04af2491c04e359a0034007d.web-security-academy.net
Cookie: stay-logged-in=d2llbmVyOjUxZGMzMGRkYzQ3M2Q0M2E2MDExZTllYmJhNmNhNzcw; session=fcmO5XufhdTvUGD7HtOc4VHFZuBKcxAo
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Sec-Ch-Ua: "(Not(A:Brand";v="8", "Chromium";v="99"
Sec-Ch-Ua-Mobile: ?0
Sec-Ch-Ua-Platform: "Linux"
Referer: https://0a3000da04af2491c04e359a0034007d.web-security-academy.net/my-account?id=wiener
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Connection: close
```

`d2llbmVyOjUxZGMzMGRkYzQ3M2Q0M2E2MDExZTllYmJhNmNhNzcw` is decoded from base64 to `wiener:51dc30ddc473d43a6011e9ebba6ca770` using CyberChef. You can use crackstation (or John for a proper way) to decode `51dc30ddc473d43a6011e9ebba6ca770` to `peter` which is the password.

![](Pasted%20image%2020220824232131.png)
![](Pasted%20image%2020220824232139.png)

After running through Burp Intruder, the 13th request with password `abc123` is a successful login

![](Pasted%20image%2020220824232532.png)