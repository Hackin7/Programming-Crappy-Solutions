# FREE FLAGS!!1!!

### Description

## Solution

### Basic Analysis

Firstly I open the binary in Cutter and decompiled it. This tells us that
1. It scanf (ask for an input) the first number, and checks if it is `0x7a69`(`31337` in denary)
2. Scans next 2 numbers, checks if their sum is `0x476` and their product is `0x49f59`
    - The variable names don't 100% match up but close enough
3. Scans a string, see if it is equal to `banana`
4. If passes all checks, calls the `print_flag` function.

```
uint64_t main(void)
{
    int32_t iVar1;
    uint64_t uVar2;
    undefined8 extraout_RDX;
    int64_t iVar3;
    char *pcVar4;
    undefined4 uVar5;
    int64_t in_FS_OFFSET;
    int64_t var_140h;
    int64_t var_120h;
    uint32_t var_118h;
    uint32_t var_114h;
    char *s1;
    int64_t var_8h;

    var_8h = *(int64_t *)(in_FS_OFFSET + 0x28);
    var_120h._0_4_ = 0;
    puts("Congratulations! You are the 1000th CTFer!!! Fill out this short survey to get FREE FLAGS!!!");
    puts("What number am I thinking of???");
    pcVar4 = (char *)&var_114h;
    __isoc99_scanf("%d", pcVar4);
    if (var_114h == 0x7a69) {
        puts("What two numbers am I thinking of???");
        pcVar4 = (char *)&var_118h;
        __isoc99_scanf("%d %d", pcVar4, (int64_t)&var_120h + 4);
        if ((var_118h + var_120h._4_4_ == 0x476) && (var_118h * var_120h._4_4_ == 0x49f59)) {
            puts("What animal am I thinking of???");
            __isoc99_scanf(" %256s", &s1);
            iVar3 = strcspn(&s1, 0x202d);
            *(undefined *)((int64_t)&s1 + iVar3) = 0;
            pcVar4 = "banana";
            iVar1 = strcmp(&s1, "banana");
            if (iVar1 == 0) {
                puts("Wow!!! Now I can sell your information to the Russian government!!!");
                uVar5 = 0x2156;
                puts("Oh yeah, here\'s the FREE FLAG:");
                print_flag();
                var_120h._0_4_ = 0;
            } else {
                uVar5 = 0x20ac;
                puts("Wrong >:((((");
                var_120h._0_4_ = 1;
            }
        } else {
            uVar5 = 0x20ac;
            puts("Wrong >:((((");
            var_120h._0_4_ = 1;
        }
    } else {
        uVar5 = 0x20ac;
        puts("Wrong >:((((");
        var_120h._0_4_ = 1;
    }
    if (*(int64_t *)(in_FS_OFFSET + 0x28) != var_8h) {
        __stack_chk_fail();
        segment.LOAD1();
        iVar3 = 0;
        do {
            uVar2 = (**(code **)(segment.LOAD3 + iVar3 * 8))(uVar5, pcVar4, extraout_RDX);
            iVar3 = iVar3 + 1;
        } while (iVar3 != 1);
        return uVar2;
    }
    return (uint64_t)(uint32_t)var_120h;
}
```
The first and last condition is easy to solve. But how about the 2nd one? In many CTF writeups I see many others use some form of equation solver and I wanted to try that.

### z3 solver time

On googling, I learnt about the popular z3 solver.
1. https://ericpony.github.io/z3py-tutorial/guide-examples.htm

Just `pip install z3-solver`, and run the code below and you will get some values
```
from z3 import *
x = Int('x')
y = Int('y')
solve(x+y == 0x476, x*y == 0x49f59)
```
```
[x = 419, y = 723]
```

After that, just put in the corrects inputs to meet the check and get the flag. I wrote `solve.py` to automatically connect to the server. Alternatively, you can use netcat and connect
```
31337
419 723
banana
```


## Flag
`actf{what_do_you_mean_bananas_arent_animals}`
