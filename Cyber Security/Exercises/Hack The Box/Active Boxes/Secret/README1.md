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