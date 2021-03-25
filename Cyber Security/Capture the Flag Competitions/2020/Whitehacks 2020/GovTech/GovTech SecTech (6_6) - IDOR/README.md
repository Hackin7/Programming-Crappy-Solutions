# GovTech SecTech (26) - IDOR

187, GOVTECH, 18 SOLVES

## Description

GovTech Sponsor Challenge

Insecure Direct Object Reference can have severe repercussions for applications. One mitigation technique is to avoid trusting user input. If you are tired, have some cookies with milk

[Challenge here](http://sec-tech.cf/)

Login with the username `temp_acc` and password `temp_pass`

# Solution

It was mainly [undefined-func](https://github.com/undefined-func) who helped. I still feel it's a good challenge to take note of (mainly for me to store the OWASP concept)

The main concept for this challenge is that one of the cookie, `user_id` (which had a value of `c4ca4238a0b923820dcc509a6f75849b` for me), is actually MD5 hashed, with a value of `1`. You can figure this out in the competition by using [Crackstation](https://crackstation.net/).

On research on IDOR, I found this resource https://portswigger.net/web-security/access-control/idor which explains it perfectly. Basically, just change the value of the MD5 hash to represent another value, in this case `2`. You can use a website like [this](https://www.md5hashgenerator.com/) to get a hash like this `c81e728d9d4c2f636f067f89cc14862c`

After that, just replace the `user_id` cookie with this value and get the flag from the profile page.

# Flag

`WH2020{ID0R_D0_N0T_TRUST_US3R_INPUT}`
