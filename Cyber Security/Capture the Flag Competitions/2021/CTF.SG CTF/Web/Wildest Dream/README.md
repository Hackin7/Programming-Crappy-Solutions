# Wildest Dream

### Description

## Solution

### Initial Inspection

(Not as tough as NS I hope, but still something)

Inspecting the site and source code does not reveal anything significant at first.

Reading the php code reveals something interesting
```
<?php
    if(!empty($_GET['i1']) && !empty($_GET['i2'])){
        $i1 = $_GET['i1'];
        $i2 = $_GET['i2'];
        if($i1 === $i2){
            die("i1 and i2 can't be the same!");
        }
        $len1 = strlen($i1);
        $len2 = strlen($i2);
        if($len1 < 20){
            die("i1 is too shorttttttt pee pee pee pee pee");
        }
        if($len2 < 20){
            die("i2 is too shorttttttt pee pee pee pee pee");
        }
        if(sha1(hex2bin($i1)) === sha1(hex2bin($i2)));
            if(md5(hex2bin($i1)) !== md5(hex2bin($i2)))
                echo "All I want to be is in your wildest dreams";
                if(md5(hex2bin($i1)) == md5(hex2bin($i2)))echo $flag;
        echo "<br>I think he did it, but i just cant prove it.";
    } else {
        echo "<br> You need to provide two strings, i1 and i2. /1989.php?i1=a&i2=b";
    }
    
    
?>
```

Observations
1.

### Analysing Code

## Flag
``