/*
http://sandbox.onlinephpfunctions.com/
*/

$username = "ad'$min--";
$password = "pass";

$username = str_replace('admin', '', $username); // HOTFIX: Disable admin account
$username = preg_replace("/'/", '', $username); // HOTFIX: PREVENT SQLi
$username = preg_replace('/s+/', '', $username); // HOTFIX: PREVENT SQLi

$password = md5($password);

$query = "SELECT * FROM users WHERE username='$username' AND password='$password'";
  
echo $query;
