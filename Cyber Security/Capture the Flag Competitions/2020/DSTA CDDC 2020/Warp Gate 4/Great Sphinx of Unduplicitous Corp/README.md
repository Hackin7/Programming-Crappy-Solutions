# Great Sphinx of Unduplicitous Corp

913, GATE 4, 18 SOLVES as of solving

## Description

We discovered Unduplicitous Corp's training site for their engineers. The instructions were pretty clear: get to Stage 100 as soon as possible!

http://great-sphinx.chall.cddc2020.nshc.sg:1111/

## Attached Files
None

# Solution

The website wanted you to answer math questions (I think). However, just putting them in appears not to work.

Through some experimentation, I realised that they want integer answers. If you spam in 0s in the answer, chances are you will get a score of 1.

![Score = 1](Screenshots/1.png)

I was inspecting the webpage, and there seemed to be a timeout of 3 seconds, but the client side code didn't work because the JQuery library wasn't there? 

![Cookies](Screenshots/2.png)

I'm guessing there is some server side validation on the time limit. This can be proven as there is a cookie on `PHPSESSID`. (It can actually be set to any random value! I tried.)

![Cookies](Screenshots/3.png)

This seems like a good time to learn web scraping! So I quickly learnt `requests` and `BeautifulSoup4`, made a Python 3 progam to answer the requests (in `solve.py`), and there's my answer!

# Flag

`CDDC20{Y0u_arE_s0Ooo00_QU1CK_@nd_SM@RT}`