# 4Head
100, FORENSICS, 89 SOLVES

## Description
I thought it'd be really funny if I just outright removed the file header (magic number) of the flag file. I'm also not going to tell u the original file type. Have fun opening the flag! :)

## Given
4head

# Solution
Using a hex editor to inspect, and the files signature table [here](https://wangrui.wordpress.com/2007/06/19/file-signatures-table/), the file trailer 00 3B is actually that of the GIF file. So you can probably just add the footer. I used a python program `solve.py` to do so.

# Flag
`CTFSG{Ju5t_unC0rrupt_4head}`