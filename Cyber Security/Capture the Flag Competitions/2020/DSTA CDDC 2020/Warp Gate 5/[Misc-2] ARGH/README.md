# [Misc-2] ARGH

602 points, GATE 5, 31 SOLVES as of solving

## Description

I found a binary, together with this long string that looks like some password. I wonder what is it for...

Key: GZ2gXZ3bD2qqNyNxXb5LJ8HfHQtTL5VHA

MD5("myprog"): e6c76a1dbc54005fdd2c1203e117d514

## Attached Files
[myprog](https://junior-api.cddc2020.nshc.sg/file?id=ckc4u4maw02sw0786n1s2l6zu&name=myprog)

# Solution

After some experimentation, I just figured out you need to pass in the key to `myprog` as an argument like this
```
$ ./myprog GZ2gXZ3bD2qqNyNxXb5LJ8HfHQtTL5VHA
Your flag is: CDDC20{c0mManD_l1n3_ArguM3n75sSs}
```

~~I decompiled the thing and analysed it because I didn't read the question....~~ For fun's sake, the decompiled code is in this repo though, have fun reading! It's basically XORs

# Flag

`CDDC20{c0mManD_l1n3_ArguM3n75sSs}`