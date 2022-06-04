# Clickjacking
https://portswigger.net/web-security/clickjacking


## Basic clickjacking with CSRF token protection
https://portswigger.net/web-security/clickjacking/lab-basic-csrf-protected

In the `/my-account` endpoint after logging in I find this

```html
<form id="delete-account-form" action="/my-account/delete" method="POST">
	<input required="" type="hidden" name="csrf" value="hgHnLviimxxRCwVk03KHdAv4gwtDyKrb">
	<button class="button" type="submit">Delete account</button>
</form>
```

