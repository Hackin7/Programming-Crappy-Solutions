# Corrupted

100, Forensics, 139 SOLVES

## Description

This JPEG file seems to be corrupted. Can you fix it?

## Attached Files

corrupted.jpg

# Solution

Basically When you open the jpeg with a hex editor, you notice the file header is not the file header for jpeg files.
![Hex editor](Step 1.png)

So just modify the file header. You can use a python program or whatever.
![Hex editor Modified](Step 2.png)

You should get the image working
![Uncorrupted Image](Solution/uncorrupted.jpg)

# Flag

`CTFSG{HUDSON_YARDZ}`