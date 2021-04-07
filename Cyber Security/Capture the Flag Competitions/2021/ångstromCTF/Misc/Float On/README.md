# Float On

### Description

![](Description.png)

## Solution

### How did I solve this?

Reading the code, I can understand that it
1. Reads in an unsigned integer
2. Converts it to a double type based on its byte representation
3. Does checks on it. If it passes the checks, it goes back to step 1
4. This is repeated for 5 times for 5 different checks

Initially I just gave up on the challenge. However, My teammate undefined_func suggested that I read up on Infinity and NaN, which I didn't even know existed. After that I just experimented with the Values

Some resources I referred to

1. http://steve.hollasch.net/cgindex/coding/ieeefloat.html
2.https://stackoverflow.com/questions/6235847/how-to-generate-nan-infinity-and-infinity-in-ansi-c

I made a python program `Generate.py` to generate the special numbers (Infinity, NaN, and a very large double) as a `uint64_t` to input into the progam. I also modified and compiled the program from the given source code (Modified codein `test.c`) for testing purposes

### Stages

Stage | Condition | Rationale | Input
--|--|--|--
1 | `x == -x` | 0 and -0 is equal | 0
2 | `x != x` | NaN is not equal to  itself. Initially I just experimented with negative numbers and lucked out. However, this answer makes sense, since for an `uint64_t`, -1 underflows such that the exponent bits are all set to 1, causing it to be set as NaN | -1
3 | `x + 1 == x && x * 2 == x` | Adding and multiplying anything to Infinity still results in infinity. So I just input infinity in, just in the form of `uint64_t` |
4 | `x + 1 == x && x * 2 != x` | Most programming languages are not very precise in handling floating point numbers. By making the floating point number very large, adding 1 to it would not have a significant effect. However, by making it finite, a multiple of it would still be different
5 | `(1 + x) - 1 != 1 + (x - 1)` | Same rationale as Stage 2 | -1
Same rationale as stage 1

### Solve on the Remote Server

```
(base) [hacker@hackerbook ~]$ nc shell.actf.co 21399
Stage 1: 0
Stage 1 passed!
Stage 2: -1
Stage 2 passed!
Stage 3: 9218868437227405312
Stage 3 passed!
Stage 4: 9218868437227405311
Stage 4 passed!
Stage 5: -1
Stage 5 passed!
actf{well_we'll_float_on,_big_points_are_on_the_way}
```

## Flag

`actf{well_we'll_float_on,_big_points_are_on_the_way}`
