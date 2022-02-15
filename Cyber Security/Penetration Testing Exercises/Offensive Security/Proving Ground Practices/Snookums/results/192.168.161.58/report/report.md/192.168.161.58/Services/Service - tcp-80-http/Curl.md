```bash
curl -sSik http://192.168.161.58:80/
```

[/media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_curl.html](file:///media/sf_Stuff/Github/Solutions/Cyber Security/Penetration Testing Exercises/Offensive Security/Proving Ground Practices/Snookums/results/192.168.161.58/scans/tcp80/tcp_80_http_curl.html):

```
HTTP/1.1 200 OK
Date: Sun, 13 Feb 2022 11:23:21 GMT
Server: Apache/2.4.6 (CentOS) PHP/5.4.16
X-Powered-By: PHP/5.4.16
Content-Length: 2730
Content-Type: text/html; charset=UTF-8

<!doctype html>
<html lang="en-us">
<head>

	<meta charset="utf-8">
	<title>Simple PHP Photo Gallery</title>
	<link rel="stylesheet" href="css/screen.css" type="text/css" media="screen" />
	<link rel="stylesheet" href="css/lightbox.css" type="text/css" media="screen" />

  <link href='http://fonts.googleapis.com/css?family=Fredoka+One|Open+Sans:400,700' rel='stylesheet' type='text/css'>

</head>
<body>
<div id="content">
<div class="section" id="example">


	<h2>Simple PHP Photo Gallery</h2>

	<div class="imageRow">
  	<div class="set">


<div class="single"><div class="wrap">
	<a href="images/examples/image-1.jpg" rel="lightbox[plants]"><img src="images/examples/thumb-1.jpg" /></a>
</div></div>

<div class="single"><div class="wrap">
	<a href="images/examples/image-2.jpg" rel="lightbox[plants]"><img src="images/examples/thumb-2.jpg" /></a>
</div></div>

<div class="single"><div class="wrap">
	<a href="images/examples/image-3.jpg" rel="lightbox[plants]"><img src="images/examples/thumb-3.jpg" /></a>
</div></div>

<div class="single"><div class="wrap">
	<a href="images/examples/image-4.jpg" rel="lightbox[plants]"><img src="images/examples/thumb-4.jpg" /></a>
</div></div>

<div class="single"><div class="wrap">
	<a href="images/examples/image-5.jpg" rel="lightbox[plants]"><img src="images/examples/thumb-5.jpg" /></a>
</div></div>

<div class="single"><div class="wrap">
	<a href="images/examples/image-6.jpg" rel="lightbox[plants]"><img src="images/examples/thumb-6.jpg" /></a>
</div></div>


  	</div>
  </div>

</div>

<hr />
</div>
<div style="margin-top: 100px; text-align: center;">Simple PHP Photo Gallery v0.8</div>
<!-- end #content -->

<script src="js/jquery-1.7.2.min.js"></script>
<script src="js/jquery-ui-1.8.18.custom.min.js"></script>
<script src="js/jquery.smooth-scroll.min.js"></script>
<script src="js/lightbox.js"></script>

<script>
  jQuery(document).ready(function($) {
      $('a').smoothScroll({
        speed: 1000,
        easing: 'easeInOutCubic'
      });

      $('.showOlderChanges').on('click', function(e){
        $('.changelog .old').slideDown('slow');
        $(this).fadeOut();
        e.preventDefault();
      })
  });

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-2196019-1']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</body>
</html>

```
