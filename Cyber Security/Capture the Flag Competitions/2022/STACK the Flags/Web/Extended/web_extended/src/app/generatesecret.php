
<?php
# generate secret between length 16 and 32
$length = rand(8, 16);
$secret = bin2hex(random_bytes($length));
echo $secret;
?>