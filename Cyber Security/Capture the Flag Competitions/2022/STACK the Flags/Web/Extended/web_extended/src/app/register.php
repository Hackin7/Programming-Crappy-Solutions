<?php
    if($_POST) {
        $username = $_POST['username'];
        $password = $_POST['password'];
        $db = new PDO('sqlite:jaga.db');
        
        $uid = bin2hex(random_bytes(32));
        $user = $db->prepare("INSERT INTO j4g4_us3rs (uid, username, password, role) VALUES (?, ?, ?, 0)");
        $user->execute([$uid, $username, md5($password)]);
        header("Location: index.php");
    }
    else {
        $SECRET = getenv('SECRET');
        if (!isset($_COOKIE["token"])) {
            $token = base64_encode('uid=' . bin2hex(random_bytes(32)));
            $sig = hash("sha256", $SECRET . $token);
            setcookie("token", $token, time() + 3600);
            setcookie("sig", $sig, time() + 3600);
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
            <?php $SECRET = getenv('SECRET'); echo 'a' . $SECRET; ?>
            <form method="post" action="register.php">
                <input type="text" name="username" placeholder="Username">
                <input type="password" name="password" placeholder="Password">
                <input type="submit" value="Register">
            </form>
        </div>
    </body>
</html>
