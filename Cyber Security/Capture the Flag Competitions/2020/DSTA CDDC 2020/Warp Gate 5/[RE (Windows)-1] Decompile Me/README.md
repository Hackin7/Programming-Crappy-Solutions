# [RE (Windows)-1] Decompile Me

668 points, GATE 5, 29 SOLVES as of solving

## Description

Hello py2exe, nice to meet you!

MD5("DecompileMe.zip"): 3805ccecd327d3cfcfdcc12c1ce7891b

## Attached files

[DecompileMe.zip](https://junior-api.cddc2020.nshc.sg/file?id=ckc4usaw103rw07566epu5x36&name=DecompileMe.zip)

# Solution

You can basically use a python exe decompiler. The one I used is [python-exe-unpacker](https://github.com/countercept/python-exe-unpacker). Just run it on the executable (after installing) like this: `python python_exe_unpack.py -i [malware.exe]`

It's a Python 2 Executable by the way, not Python 3. If you run the decompiler with Python 3 you will get an error message saying it's Python 2 code.

Aftter decompiling it, the code in `unpacked/DecompileMe.exe/DecompileMe.py.py` has a `FLAG` variable which has the flag (it's obvious because of the first few characters). Just modify the code to remove the Win32 API lines (to be similar to `solve.py`), and print out the `FLAG` variable.

A similar challenge would be [Wow That's Fancy from the CYS-CTF 2019](https://github.com/cyberyouthsg/cysc19-ctf/tree/master/RE/wow-thats-fancy)

# Flag

`CDDC20{NiCe-2-MeeT-py2exe~:D}`