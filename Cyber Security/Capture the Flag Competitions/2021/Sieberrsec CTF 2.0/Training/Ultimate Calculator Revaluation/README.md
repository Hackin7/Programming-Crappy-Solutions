# Ultimate Calculator Revaluation

Web, 200

### Description

My friend revised the calculator app again, seeing that you have managed to break through with your method. This time, he is extremely sure that no commands can slip through.

Find the even newer calculator app [here](challs.sieberrsec.tech:4589/calcv3.html).

P.S. I was at his house just now and decided to snoop at his PHP code. I took a picture but it turned out all blurry. Maybe it can be of some help?

Original Challenge Author: xzy_10

## Solution


### Viewing Page Sources and Inspecting

For the main site `calv3.html`

```
<html>
	<head>
		<link rel="stylesheet" href="styles.css">
	</head>
	<body>

		<h1>Calculator App V3!</h1>
		<h2>With more security updates!</h2>

		<form action="calcv3.php" method="get">
			Number to be added: <input type="text" name="value"><br>
		<input type="submit" value="Add!" class="button">
		</form>
		<!--
		With /[a-z]|[A-Z]|"|_/, this should block out ALL letters. YES! Finally I don't have to worry about all that command injection. 
		Oh and I found this decoder function that makes it possible to enter your value in the search bar! Wonder how that works. Did it twice though.
		-->
		</body>
</html>
```
Output

```

<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>

<h1> 
Calculator App V3!
</h1>
<h3>No letters allowed!</h3>


</html>
```

I also downloaded the screenshot of the PHP code 

![his_interesting_php_code.jpg](his_interesting_php_code.jpg)

### Raw Testing
