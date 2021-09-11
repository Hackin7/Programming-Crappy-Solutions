# Alien Math

### Description

## Solution

For the first question, the seed for the random function is not set. 
I tried to brute forced the server for the value. `1804289383`
 - Brute forcing took too long, so I used the value from running the `rand` function on my computer, which was `180428938300`.
 - Surprisingly this worked. Maybe all `rand()` functions are built equal.

The second question accepts only 24 characters.

return ((arg1-'0') * 3 + (arg2 - '0') * 11 + -4) % 10

- Passqord cannot be out of range '0'-'9'

The final question is a typical overflow to return pointer (to the `print_flag` function).
Based on my Solution code, the offset to return pointer I got was `24`


payload = fit({offset: e.symbols[func]})

## Flag
``
