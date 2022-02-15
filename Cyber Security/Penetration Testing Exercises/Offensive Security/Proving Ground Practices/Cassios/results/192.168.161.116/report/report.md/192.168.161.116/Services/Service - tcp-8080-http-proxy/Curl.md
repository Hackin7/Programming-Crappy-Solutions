```bash
curl -sSik http://192.168.161.116:8080/
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_curl.html](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Cassios/results/192.168.161.116/scans/tcp8080/tcp_8080_http_curl.html):

```
HTTP/1.1 200
X-Content-Type-Options: nosniff
X-XSS-Protection: 1; mode=block
Cache-Control: no-cache, no-store, max-age=0, must-revalidate
Pragma: no-cache
Expires: 0
X-Frame-Options: DENY
Content-Type: text/html;charset=UTF-8
Content-Language: en-US
Transfer-Encoding: chunked
Date: Sun, 13 Feb 2022 15:58:51 GMT

<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <title></title>

  <link rel="stylesheet" href="/css/main.css">

</head>

<body>

	<div class="small-container">
		<div class="flex-row">
			<h1>Recycler Management System</h1>
		</div>
		<div class="flex-row">
			<img src="/images/factory.jpg" class="round-button">
		</div>

	</div>
	<br>
	<div class="small-container">

			<div class="flex-small">Control system for the factory recycler. Access the Dashboard for more options.</div>
			<div class="flex-small"><a href="/dashboard" class="button">Dashboard</a></div>

	</div>
</body>

</html>


```
