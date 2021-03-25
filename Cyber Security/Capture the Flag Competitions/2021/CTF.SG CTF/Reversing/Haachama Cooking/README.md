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

Having gotten into Vtubers mainly because of Haachama, I knew I had to try this challenge.

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

## Flag
``