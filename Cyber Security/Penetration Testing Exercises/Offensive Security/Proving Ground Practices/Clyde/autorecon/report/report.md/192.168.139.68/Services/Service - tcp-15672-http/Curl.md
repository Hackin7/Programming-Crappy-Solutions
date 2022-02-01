```bash
curl -sSik http://192.168.139.68:15672/
```

[/root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_curl.html](file:///root/autorecon/results/192.168.139.68/scans/tcp15672/tcp_15672_http_curl.html):

```
HTTP/1.1 200 OK
server: Cowboy
date: Sun, 30 Jan 2022 09:06:01 GMT
content-length: 1391
content-type: text/html
etag: "3678489298"
last-modified: Wed, 10 Mar 2021 20:43:59 GMT

<!doctype html>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<html>
  <head>
    <title>RabbitMQ Management</title>
    <script src="js/ejs-1.0.min.js" type="text/javascript"></script>
    <script src="js/jquery-1.12.4.min.js" type="text/javascript"></script>
    <script src="js/jquery.flot-0.8.1.min.js" type="text/javascript"></script>
    <script src="js/jquery.flot-0.8.1.time.min.js" type="text/javascript"></script>
    <script src="js/sammy-0.7.6.min.js" type="text/javascript"></script>
    <script src="js/json2-2016.10.28.js" type="text/javascript"></script>
    <script src="js/base64.js" type="text/javascript"></script>
    <script src="js/global.js" type="text/javascript"></script>
    <script src="js/main.js" type="text/javascript"></script>
    <script src="js/prefs.js" type="text/javascript"></script>
    <script src="js/formatters.js" type="text/javascript"></script>
    <script src="js/charts.js" type="text/javascript"></script>

    <link href="css/main.css" rel="stylesheet" type="text/css"/>
    <link href="favicon.ico" rel="shortcut icon" type="image/x-icon"/>

<!--[if lte IE 8]>
    <script src="js/excanvas.min.js" type="text/javascript"></script>
    <link href="css/evil.css" rel="stylesheet" type="text/css"/>
<![endif]-->
  </head>
  <body>
    <div id="outer"></div>
    <div id="debug"></div>
    <div id="scratch"></div>
  </body>
</html>


```
