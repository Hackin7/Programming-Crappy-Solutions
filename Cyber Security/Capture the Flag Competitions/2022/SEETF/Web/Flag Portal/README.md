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

## Flag
``
