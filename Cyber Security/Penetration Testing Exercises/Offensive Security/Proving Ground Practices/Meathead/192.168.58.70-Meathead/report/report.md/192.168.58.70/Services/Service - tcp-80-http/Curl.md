```bash
curl -sSik http://192.168.58.70:80/
```

[/root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_curl.html](file:///root/autorecon/results/192.168.58.70/scans/tcp80/tcp_80_http_curl.html):

```
HTTP/1.1 200 OK
Cache-Control: private
Content-Type: text/html; charset=utf-8
Server: Microsoft-IIS/10.0
X-AspNet-Version: 4.0.30319
X-Powered-By: ASP.NET
Date: Wed, 19 Jan 2022 10:45:12 GMT
Content-Length: 1769


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
	<head><title>
	Plantronics
</title><link media="all" href="css/style.css" rel="stylesheet" type="text/css" /><link id="favicon" rel="shortcut icon" type="image/png" href="images/favicon.png" /></head>
	<body>

	<br /><br /><br /><br /><br /><br />
	<center>
	<form method="post" action="./" id="MyForm">
<input type="hidden" name="__VIEWSTATE" id="__VIEWSTATE" value="/wEPDwUKLTQ0NDEwMDQ5MmRkwGBBhX5utdzdgNEBBBiCw71yZIoh9uOi8UQz1HHQt5g=" />

<input type="hidden" name="__VIEWSTATEGENERATOR" id="__VIEWSTATEGENERATOR" value="CA0B0334" />
<input type="hidden" name="__EVENTVALIDATION" id="__EVENTVALIDATION" value="/wEdAARD2uNTnJRHPMD0Eohx6gkeG8sL8VA5/m7gZ949JdB2tEE+RwHRw9AX2/IZO4gVaaKVeG6rrLts0M7XT7lmdcb6EgZDnz9QN1o07JpH3JuGKfFwkgrhMtES+gaR4BzfMco=" />
		<table class="center">
			<tr>
				<td colspan=2><center><img src="images/plt-hub-orange.png" /></center></td>
			</tr>
			<tr>
				<td><b>Username:</b></td>
				<td><input name="ctl00$ContentPlaceHolder1$UsernameTextBox" type="text" id="ContentPlaceHolder1_UsernameTextBox" /></td>
			</tr>
			<tr>
				<td><b>Password:</b></td>
				<td><input name="ctl00$ContentPlaceHolder1$PasswordTextBox" type="password" id="ContentPlaceHolder1_PasswordTextBox" /></td>
			</tr>
			<tr>
				<td colspan=2 style="padding-top: 20px;"><center><input type="submit" name="ctl00$ContentPlaceHolder1$LoginButton" value="Login" id="ContentPlaceHolder1_LoginButton" class="button" /></center></td>
			</tr>
		</table>
		<span class="red"><span id="ContentPlaceHolder1_MyLabel"></span></span>
	</form>
	</center>

	</body>
</html>

```