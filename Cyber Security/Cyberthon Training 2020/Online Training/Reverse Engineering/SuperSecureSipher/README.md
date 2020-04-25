# SuperSecureSipher

200, Reverse Engineering, 22 Solves as of Solving

## Description

Not again? Seems like this flag has been encrypted by a Java program. Let's write a script to decrypt it!

Hint 1: Not all decompilers are equal
Hint 2: Is it really as complex as it seems?

## Given

flag.txt.out

SuperSecureSipher.class

# Solution

Use CFR Decompiler because it gives superior code.
After that just write code to reverse the steps. 

One trick to take note of is that the first 2 loops are just generating a random number. And the first character of the output string gives you that random number in ascii form. You can then use that for reversing

Another thing to note is that XOR `^` is reversible. So just reverse character by character.

My solution is in `Main.java`. When I run my code, the thing seems to be missing a `}` so I just added it.

# Flag

`CTFSG{9f937aaef7a2fac37e79d3d11e9934c6}`