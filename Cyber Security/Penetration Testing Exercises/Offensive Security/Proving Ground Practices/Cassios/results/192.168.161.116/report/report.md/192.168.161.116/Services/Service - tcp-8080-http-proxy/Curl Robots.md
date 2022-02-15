```bash
curl -sSikf http://192.168.161.116:8080/robots.txt
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_curl-robots.txt](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_curl-robots.txt):

```
HTTP/1.1 302
Set-Cookie: JSESSIONID=30378F35C533BF3B0FC6FFA71972533A; Path=/; HttpOnly
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Location: http://192.168.161.116:8080/login
Content-Length: 0
Date: Sun, 13 Feb 2022 15:58:51 GMT

```
