# Hackerman

300, Reverse Engineering, 7 Solves as of Solving

## Description

Time to learn how to read assembly! Your task is to figure out the correct input for the given assembly code.

Note: The flag format is `CTFSG{<input>}`

X86 Assembly Tutorial

## Given

disassembly.txt

# Solution
Work your way and reverse engineer the code step by step. My disassembly efforts in in `disassembly annotated.asm`, and after that, I made a simple python program in `solve.py` which explains what the algorithm does in a nutshell, and produces the input string

Some things to take note of
1. Make sure your actual disassembly code is not modified. I wasted 2 hours of my life trying to notice an error (that I replaced a 0 with a 6)
2. Little Endian formatting

# Flag
`CTFSG{8Fhr9Psmw}`