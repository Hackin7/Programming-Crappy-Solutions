# DangerNoodle
100, Reverse Engineering, 30 Solves as of Solving

## Description
Seems like the flag has been encoded by a python program. Can we possibly write a script to decode it?

Hint: Decompilation

## Given
flag.jpg.out

main.pyc

# Solution
Search on how to decompile bytecode

https://stackoverflow.com/questions/1149513/exploring-and-decompiling-python-bytecode
```
pip install uncompyle6
uncompyle6 main.pyc
```

Once you get the code, just reverse the steps in python and run.
![](sol.jpg)


# Flag
`CTFSG{3GG1N3R1NG_M0D3_4CT1V4T3D}