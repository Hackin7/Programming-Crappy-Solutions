# Haachama Cooking

1000, REVERSE ENGINEERING, 0 SOLVES

### Description

Welcome to Haachama cooking! Today's I'm going to make my very own blend of AES! A little sprinkle of
... Or was it parallism? Whatever, either one will work, this should still taste better than the tarantula ramen I had last time anyway.

<iframe width="583" height="315" src="https://www.youtube.com/embed/gyZz8rxitHU" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

(Note: The youtube link is only a *cultured* bgm recommendation by the challenge creator and has nothing to do with the solution.)

Author: violenttestpen

### Attached Files

haachama-cooking

## Solution

I didn't finish this challenge in the actual CTF. However, after the CTF, I decided to do some writeups

### Basic Analysis

### Binary


```
$ file haachama-cooking
haachama-cooking: ELF 32-bit LSB executable, Intel 80386, version 1 (SYSV), statically linked, Go BuildID=-AA-1INLPpPSO2dvoOwc/i6l5o4uDtgizVcUm6ckO/9J4soZWU7R1iHPBf0e3x/Pz6FIHdzlJMuvwQvNdKi, not stripped
$ checksec haachama-cooking
[*] '/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/CTF.SG CTF/Reversing/Haachama Cooking/haachama-cooking'
    Arch:     i386-32-little
    RELRO:    No RELRO
    Stack:    No canary found
    NX:       NX enabled
    PIE:      No PIE (0x8048000)
$ strings haachama-cooking  | grep CTFSG{
$ ./haachama-cooking
bash: ./haachama-cooking: cannot execute binary file: Exec format error
$
```

Here are some interesting observations
1. It is a Intel 80386 of all things. Also it doesn't run. This could mean that the typical reverse engineering tricks don't work?
2. `LSB executable` : Least-Significant Byte, Little Endian
2. `Go BuildID=-AA-1INLPpPSO2dvoOwc/i6l5o4uDtgizVcUm6ckO/9J4soZWU7R1iHPBf0e3x/Pz6FIHdzlJMuvwQvNdKi` suggests it is coded in Golang.

Reversing the binary in cutter brings up a lot of function names, like `sym.fmt.Fprintln`, which suggest this is not coded in C. The main functions are
* `sym.main.main`
* `sym.main.aesEncrypt`
* `sym.main.encryptPart`
* `sym.main.encryptPart.func1`
* `sym.main.merge`
* `sym.main.merge.func1`

### Challenge Description

The description brought out some interesting words and concepts, which I'll google on, since they'll be used in the binary

Concepts | Explanation
-|-
AES | Some encryption standard, quite common.
concurrency | Concurrency is the ability of different parts or units of a program, algorithm, or problem to be executed out-of-order or in partial order, without affecting the final outcome.
parallism | Doing lots of things at once

### Addressing all the concerns

Turns out for the 1st observation, all I needed to do was run it in a proper Linux virtual machine and not Windows Subsystem for Linux. Doing so gives me this
```
$./haachama-cooking
Enter your flag here:
Invalid flag length
```

## After CTF

### Decompilation

After the CTF I wanted to try this challenge (to improve my RE skills)
So I read the writeups and tried to figure out the issue.

I opened the binary in cutter, and decompiled it to some different results
```
                *(int32_t *)((int32_t)*(undefined **)0x10 + -0xa8) = (iVar4 * 0x10 & -iVar7 >> 0x1f) + iVar2;
                *(int32_t *)((int32_t)*(undefined **)0x10 + -0xa4) = iVar7;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xb0) = 0x80da8f1;
                runtime.stringtoslicebyte();
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xac) =
                     *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x6c);
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xa8) =
                     *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xa0);
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xa4) =
                     *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x9c);
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xa0) =
                     *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x98);
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x9c) = _main.key;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x98) = *(undefined4 *)0x81856b4;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x94) = *(undefined4 *)0x81856b8;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x90) = _main.iv;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x8c) = *(undefined4 *)0x81856a4;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x88) = *(undefined4 *)0x81856a8;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xb0) = 0x80da951;
                main.encryptPart();
```
This is weird since the functions have parameters but they are being called without parameters? What is going on?
My guess would that the variable declaration above is passing the parameters in.

I used the ret dec decompiler to test again which confirmed my suspicions
```
ebp -= ecx;
        eax = ebp;
        tmp_0 = ebp;
        ebp = ebx;
        ebx = tmp_0;
        ebx = -ebx;
        tmp_1 = ebp;
        ebp = ebx;
        ebx = tmp_1;
        ebp >>= 0x1f;
        ecx &= ebp;
        ecx += ebx;
        runtime_stringtoslicebyte (0, edx, esi, ecx, eax);
        eax = var_ch;
        ecx = var_10h;
        edx = var_14h;
        ebx = var_40h;
        eax = main.key;
        ecx = *(0x81856b4);
        edx = *(0x81856b8);
        eax = main.iv;
        ecx = *(0x81856a4);
        edx = *(0x81856a8);
        main_encryptPart (ebx, eax, ecx, edx, eax, ecx, edx, eax, ecx, edx);
```

The code to check for the initial exit (and hence the length check) could be here. `0x40` is 64.
```
            piVar3 = *(int32_t **)((int32_t)*(undefined **)0x10 + -0x5c);
            if (piVar3[1] != 0x40) {
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x48) = 0;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x44) = 0;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x48) = 0x80e7360;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x44) = 0x8115790;
                *(code **)((int32_t)*(undefined **)0x10 + -0xac) = go.itab.*os.File,io.Writer;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xa8) = _os.Stdout;
                *(undefined **)((int32_t)*(undefined **)0x10 + -0xa4) =
                     (undefined *)((int32_t)*(undefined **)0x10 + -0x48);
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xa0) = 1;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0x9c) = 1;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xb0) = 0x80dac7b;
                fmt.Fprintln();
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xac) = 1;
                *(undefined4 *)((int32_t)*(undefined **)0x10 + -0xb0) = 0x80dac87;
                os.Exit();
                piVar3 = *(int32_t **)((int32_t)*(undefined **)0x10 + -0x5c);
            }
```

I was thinking of just giving up and using IDA pro, until I realised I'm poor so I don't have choices.

But basically, if you understand that the decompilation works like this, you can figure out from the decompiled code that
1. Input must be length 64 (else it runs the code in here and exits)
    1. You can tell that it prints something whenever `go.itab.*os.File,io.Writer` is called (writing to stdout)
2. It Loops 4 times (checks for the flag here)
    1. `main.merge();`(idk what this does), `runtime.makeslice();`
    2. `encoding/hex.Encode();` which suggests that the input is encoded to hex (and hence the actual ciphertext is in hex representation)
    3. If something doesn't match, it prints and returns
    4. `runtime.stringtoslicebyte();` and
        1. Converts to ascii values?
        2. One writeup said: runtime_stringtoslicebyte(0, *v0 + (((int)(v5 - v3) >> 31) & v5), v3 - v5, v12, v20, v25); basically slices the string into a group of 16 (E.g [0:16], [16:32]...)
    5. `main.encryptPart();`(which just runs `aesEncrypt` which itself uses the golang built in AES functions)
        1. The variables `main.key` and `main.iv` were passed inside I assume.
        2. I think it encrypts the password?
    6. Some conditional , then break

Useful references for functions
1. https://www.geeksforgeeks.org/reflect-makeslice-function-in-golang-with-examples/
2. https://stackoverflow.com/questions/23439157/how-to-store-go-channel-value-into-some-other-data-typestring-byte-and-reass

Either way its confusing, but you can infer that the program
1. Put in a string of length 64
2. Slices it up into 4 pieces (and converts each piece from hex)
3. Checks if the encrypted value matches
    1. Uses AES encryption
Well of course this is easier on hindsight (and with IDA Pro)

They give us the ciphertext `20d91f642406ce17432107a0f61a5405c3b45ec744d07c2d3a19649f5ed2c5baff4d15473b92c1d00916790dd14deec77a9d413a1e2fe83f0775bd7d3c984c4c` when inputting in 64 characters, so we just need to find the values of `main.key` and `main.iv`

### Dynamic Analysis

When reversing using cutter, and

So why not just use GDB to put a random break point andrun print out
```
[hacker@hackerbook Haachama Cooking]$ gdb haachama-cooking
GNU gdb (GDB) 10.1
Copyright (C) 2020 Free Software Foundation, Inc.
License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>
This is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.
Type "show copying" and "show warranty" for details.
This GDB was configured as "x86_64-pc-linux-gnu".
Type "show configuration" for configuration details.
For bug reporting instructions, please see:
<https://www.gnu.org/software/gdb/bugs/>.
Find the GDB manual and other documentation resources online at:
    <http://www.gnu.org/software/gdb/documentation/>.

For help, type "help".
--Type <RET> for more, q to quit, c to continue without paging--
Type "apropos word" to search for commands related to "word"...
Reading symbols from haachama-cooking...
(gdb) break main
Function "main" not defined.
Make breakpoint pending on future shared library load? (y or [n]) n
(gdb) break main.main
Breakpoint 1 at 0x80da770: file /ctfsgctf2020-private/challenges/Reverse/concurrentaes/main.go, line 83.
(gdb) run
Starting program: /run/media/hacker/Windows/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/CTF.SG CTF/Reversing/Haachama Cooking/haachama-cooking
[New LWP 68651]
[New LWP 68652]
[New LWP 68653]
[New LWP 68654]
[New LWP 68655]

Thread 1 "haachama-cookin" hit Breakpoint 1, main.main ()
    at /ctfsgctf2020-private/challenges/Reverse/concurrentaes/main.go:83
83	/ctfsgctf2020-private/challenges/Reverse/concurrentaes/main.go: No such file or directory.
(gdb) print main.key
$1 = {array = 0x8175550 <main..gobytes> "mysupersecurekeymysupersecureiv",
  len = 16, cap = 16}
(gdb) print main.iv
$2 = {array = 0x8175560 <main..gobytes> "mysupersecureiv", len = 16, cap = 16}
(gdb)

```

We could guess that `main.key` and `main.iv` are next to each other, so the actual value of main.key is `mysupersecurekey`

https://golang.org/pkg/runtime/?m=all#stringtoslicebyte

### Python Decryption

Just read `solve.py` (by Siebersec)

Basically splits the ciphertext into 4 parts, decrypts each part using key and IV

Make sure to pad the iv to 16 characters
* If the IV is not 16 bytes, it is normally padded with \x00 (but I did bruteforce through the entire ASCII table and this is the correct byte)

```
[hacker@hackerbook Haachama Cooking]$ ./haachama-cooking
Enter your flag here: CTFSG{t0d@y_1_1E@rnT_hum@ns_c@nt_multit@sk_BUT_c0mput3rs_c@n_d0}
Expected ciphertext: 20d91f642406ce17432107a0f61a5405c3b45ec744d07c2d3a19649f5ed2c5baff4d15473b92c1d00916790dd14deec77a9d413a1e2fe83f0775bd7d3c984c4c
Actual ciphertext: 20d91f642406ce17432107a0f61a5405c3b45ec744d07c2d3a19649f5ed2c5baff4d15473b92c1d00916790dd14deec77a9d413a1e2fe83f0775bd7d3c984c4c
Congrats! You got the flag!
[hacker@hackerbook Haachama Cooking]$
```

### Learning Lessons

1. Golang has a lot of gibberish, like
```
while (puVar1 = (uint32_t *)(*(int32_t *)(*in_GS_OFFSET + -4) + 8),
        *(BADSPACEBASE **)0x10 < (undefined *)*puVar1 || (undefined *)*(BADSPACEBASE **)0x10 == (undefined *)*puVar1)
  {
      uStack4 = 0x80dadd2;
      runtime.morestack_noctxt();
  }
```
I didn't really understand this so I skipped it

2. I should learn more crypto and not give up so easily on RE? idk i suck at life in general
3. Use IDA Pro. Makes life so much easier.


## Flag
`CTFSG{t0d@y_1_1E@rnT_hum@ns_c@nt_multit@sk_BUT_c0mput3rs_c@n_d0}`
