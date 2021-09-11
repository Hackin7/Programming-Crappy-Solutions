# Challenge Name

### Description

## Solution

Put in the password
Direct the binary file hexdump output to a text file, then convert to binary via so
```
(base) [hacker@hackerbook procrastination-simulator]$ echo "cd80d3cd8a479a18bbc9652f3631c61c\n" | nc auto-pwn.chal.csaw.io 11001 > hexdump
(base) [hacker@hackerbook procrastination-simulator]$ cp hexdump hexdump_cleaned
(base) [hacker@hackerbook procrastination-simulator]$ sed -i 's/^\(.\)\{9\}//g' hexdump_cleaned 
(base) [hacker@hackerbook procrastination-simulator]$ sed -i 's/\(.\)\{16\}$//g' hexdump_cleaned 
(base) [hacker@hackerbook procrastination-simulator]$ nano hexdump
(base) [hacker@hackerbook procrastination-simulator]$ nano hexdump_cleaned 
(base) [hacker@hackerbook procrastination-simulator]$ xxd -r -p hexdump_cleaned binary
(base) [hacker@hackerbook procrastination-simulator]$ ./binary 
Welcome to the AEG challenges!
Input password to continue:
> a
Incorrect password. :(
```

## Flag
``
