<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (!isset($_POST["username"]) && !isset($_POST["password"])) {
        echo "Please provide credentials";
        die("Provide a username and password.");
    }

    $db = new SQLite3("accounts.db");

    $username = $_POST["username"];
    $password = $_POST["password"];

    $username = str_replace('admin', '', $username); // HOTFIX: Disable admin account
    $username = preg_replace('/\'/', '', $username); // HOTFIX: PREVENT SQLi
    $username = preg_replace('/\s+/', '', $username); // HOTFIX: PREVENT SQLi

    $password = md5($password); // HOTFIX: MD5 Password Before Checking, impossible to SQLi now

    $query = "SELECT * FROM users WHERE username='$username' AND password='$password'";
    $user = $db->querySingle($query);

    if ($user === FALSE) {
        die("SQL error " . $db->lastErrorMsg());
    }

    if ($user) {
        if ($user === "admin") {
            // HOTFIX: Even if attacker bypasses everything, he still needs to access from internal network
            if ($_SERVER['HTTP_REFERER'] === 'internal.krytec.org') {
                echo "<h1>Hello</h1><br/>";
                echo "Username: " . $user;
                $flag = file_get_contents("flag.txt");
                echo "<br />" . $flag;
            } else {
                echo "<br /><b>No external admin access!</b>";
            }
        } else {
            echo "<h1>Hello</h1><br/>";
            echo "Username: " . $user;
        }
    } else {
        echo "Bad login";
    }
}
?>
