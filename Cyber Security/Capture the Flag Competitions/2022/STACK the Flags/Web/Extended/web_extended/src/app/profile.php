<?php
    $SECRET = getenv('SECRET');
    if (isset($_GET["uid"])) {
        echo "<b>GET</b> " . $_GET["uid"] . "<br>";
        $uri = explode('|', substr($_SERVER["REQUEST_URI"], strpos($_SERVER["REQUEST_URI"], "?") + 1));
        echo "<b>Implode</b> " . implode(",", $uri) . "<br>"; // Extra
        echo "<b>Secret</b> " .  $SECRET . "<br>"; // Extra
        echo 
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
    //if (isset($params["uid"])) {
    if (isset($_GET["test"])) {
        //$uid = $params["uid"];
        $uid = $_GET["test"];
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
        }
    }
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
