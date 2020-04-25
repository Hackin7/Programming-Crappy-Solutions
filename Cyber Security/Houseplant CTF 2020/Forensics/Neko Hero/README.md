# Neko Hero 

50 Points, 1 day, 5 hours, 23 minutes, 59 seconds remaining

Please join us in our campaign to save the catgirls once and for all, as the COVID-19 virus is killing them all and we need to provide food and shelter for them!

nya~s and uwu~s will be given to those who donate! and headpats too!

Dev: William

(and inspired by forwardslash from htb i guess)

 advertisement.png 53ca554461b897fdf3ec416739cf8db2

# Solution
## Checking out inspiration

## File analysis
```
$ strings advertisement.png | grep rtcp{
```
Returns nothing

```
$ binwalk advertisement.png 

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
0             0x0             PNG image, 544 x 629, 8-bit/color RGBA, non-interlaced
41            0x29            Zlib compressed data, compressed

$ binwalk -e advertisement.png 

DECIMAL       HEXADECIMAL     DESCRIPTION
--------------------------------------------------------------------------------
0             0x0             PNG image, 544 x 629, 8-bit/color RGBA, non-interlaced
41            0x29            Zlib compressed data, compressed

$ ls
advertisement.png  _advertisement.png.extracted
```