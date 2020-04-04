# Eleet Mathematics

# Given
flag.enc
```
CTFSG{
0100110100110100010101000011001101001000010011010011010001010100001100010100001100110101
_
127061132064122104
_
47334e315535
}
```

#  Solution

It's clearly a number base question so lets check and convert the number bases to the ascii format

Component | Number base | Reason | Conversion
----|---|---|---
01001101 00110100 01010100 00110011 01001000 01001101 00110100 01010100 00110001 01000011 00110101 | Binary | Obvious as is only 1s and 0s | M4T3HM4T1C5
127061132064122104 | Base 8 | Not so obvious, but can guess as it is also a common base, and the numbers are less than 8 | W1Z4RD
47334e315535 | Hexadecimal|  Its a common base used in computers, also clearly not base64 | G3N1U5

You can use cryptii or http://www.unit-conversion.info/texttools/octal/

Flag `CTFSG{M4T3HM4T1C5_W1Z4RD_G3N1U5}`