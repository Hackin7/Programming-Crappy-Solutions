# gdbtutor

54, RE, 50 SOLVES

## Description

You’ve heard of vimtutor, now let me introduce you to gdbtutor!

nc chals.whitehacks.ctf.sg 12002

Author: lord_idiot

# Solution

Just follow along the guide after netcaatting.

```
$ nc chals.whitehacks.ctf.sg 12002
/home/gdbtutor/gdb: warning: Couldn't determine a path for the index cache directory.
Breakpoint 1 at 0x400a0a
[guide]                dP dP         dP              dP
[guide]                88 88         88              88
[guide] .d8888b. .d888b88 88d888b. d8888P dP    dP d8888P .d8888b. 88d888b.
[guide] 88'  `88 88'  `88 88'  `88   88   88    88   88   88'  `88 88'  `88
[guide] 88.  .88 88.  .88 88.  .88   88   88.  .88   88   88.  .88 88
[guide] `8888P88 `88888P8 88Y8888'   dP   `88888P'   dP   `88888P' dP
[guide]      .88
[guide]  d8888P
[guide]
[guide]
[guide] Welcome to gdbtutor!
[guide] This will be a guided tour through the commands and uses of gdb, a
[guide] powerful debugger tool that will be very useful for any reverse
[guide] engineering work you do in the future
[guide]
[guide] Lets first load our crackme binary:
[ cmd ]   file ./crackme.bin
(gdb) file ./crackme.bin
Reading symbols from ./crackme.bin...

[guide] To make reversing easier, debug information and the source
[guide] code for `./crackme.bin` has been provided.
[guide] Run the `list` command to display the source
[guide] code for the `main` function of our crackme.
[ cmd ]   list main
(gdb) list main
1       #include <stdio.h>
2       #include <fcntl.h>
3       #include <string.h>
4       #include <unistd.h>
5       #include <sys/types.h>
6       #include <sys/stat.h>
7
8       /* gcc ./crackme.c -o crackme.bin -g */
9
10      char secret_key[] = "<REDACTED FROM SOURCE>";
11      void initialisation(){
12              setvbuf(stdout, 0, 2, 0);
13      }
14
15      int main(){
16              initialisation();
17
18              /* stage one */
19              puts("[Stage 1]");
20              if(getuid() != 0){
21                      puts("You are not root, fail stage 1!");
22                      return -1;
23              }
24              else{
25                      puts("Stage 1 pass. Welcome root!");
26              }
27
28              /* stage two */
29              puts("[Stage 2]");
30              char buf[100];
31              memset(buf, '\x00', 100);
32              printf("Give me the secret key: ");
33              fgets(buf, 99, stdin);
34              buf[strlen(buf)-1] = '\x00'; // remove trailing newline
35              if(strcmp(buf, secret_key) != 0){
36                      puts(buf);
37                      puts("You do not know the secret_key, fail stage 2!");
38                      return -1;
39              }
40
41              /* win */
42              int fd = open("flag.txt", O_RDONLY);
43              char flag[100];
44              memset(flag, '\x00', 100);
45              read(fd, flag, 100);
46              printf("Congratulations, here is the flag: %s", flag);
47
48              return 0;
49      }

[guide] Now we can run the binary till the main function
[guide] using the `start` command
[ cmd ]   start
(gdb) start
Temporary breakpoint 2 at 0x4008c6: file ./crackme.c, line 15.
Starting program: /home/gdbtutor/crackme.bin
warning: Error disabling address space randomization: Operation not permitted

[guide] Looking at the `main` function source code. We can see that
[guide] `getuid()` needs to return 0 for us to pass the first stage.
[guide] However, our user does not have a uid of 0, and thus `getuid()`
[guide] will not return 0. Let's try to use gdb to change the return
[guide] value of `getuid()` ourselves!
[guide]
[guide] First, disassemble `main` to get the exact assembly code being run.
[ cmd ]   disassemble main
[guide]
[guide]

Temporary breakpoint 2, main () at ./crackme.c:15
15      int main(){
(gdb) disassemble main
Dump of assembler code for function main:
   0x00000000004008bb <+0>:     push   rbp
   0x00000000004008bc <+1>:     mov    rbp,rsp
   0x00000000004008bf <+4>:     sub    rsp,0xf0
=> 0x00000000004008c6 <+11>:    mov    rax,QWORD PTR fs:0x28
   0x00000000004008cf <+20>:    mov    QWORD PTR [rbp-0x8],rax
   0x00000000004008d3 <+24>:    xor    eax,eax
   0x00000000004008d5 <+26>:    mov    eax,0x0
   0x00000000004008da <+31>:    call   0x400896 <initialisation>
   0x00000000004008df <+36>:    mov    edi,0x400ab8
   0x00000000004008e4 <+41>:    call   0x4006d0 <puts@plt>
   0x00000000004008e9 <+46>:    call   0x400700 <getuid@plt>
   0x00000000004008ee <+51>:    test   eax,eax
   0x00000000004008f0 <+53>:    je     0x400906 <main+75>
   0x00000000004008f2 <+55>:    mov    edi,0x400ac8
   0x00000000004008f7 <+60>:    call   0x4006d0 <puts@plt>
   0x00000000004008fc <+65>:    mov    eax,0xffffffff
   0x0000000000400901 <+70>:    jmp    0x400a14 <main+345>
   0x0000000000400906 <+75>:    mov    edi,0x400ae8
   0x000000000040090b <+80>:    call   0x4006d0 <puts@plt>
   0x0000000000400910 <+85>:    mov    edi,0x400b04
   0x0000000000400915 <+90>:    call   0x4006d0 <puts@plt>
   0x000000000040091a <+95>:    lea    rax,[rbp-0xe0]
   0x0000000000400921 <+102>:   mov    edx,0x64
   0x0000000000400926 <+107>:   mov    esi,0x0
   0x000000000040092b <+112>:   mov    rdi,rax
   0x000000000040092e <+115>:   call   0x400720 <memset@plt>
   0x0000000000400933 <+120>:   mov    edi,0x400b0e
   0x0000000000400938 <+125>:   mov    eax,0x0
   0x000000000040093d <+130>:   call   0x400710 <printf@plt>
   0x0000000000400942 <+135>:   mov    rdx,QWORD PTR [rip+0x200797]        # 0x6010e0 <stdin@@GLIBC_2.2.5>
   0x0000000000400949 <+142>:   lea    rax,[rbp-0xe0]
   0x0000000000400950 <+149>:   mov    esi,0x63
   0x0000000000400955 <+154>:   mov    rdi,rax
   0x0000000000400958 <+157>:   call   0x400750 <fgets@plt>
   0x000000000040095d <+162>:   lea    rax,[rbp-0xe0]
   0x0000000000400964 <+169>:   mov    rdi,rax
   0x0000000000400967 <+172>:   call   0x4006e0 <strlen@plt>
   0x000000000040096c <+177>:   sub    rax,0x1
   0x0000000000400970 <+181>:   mov    BYTE PTR [rbp+rax*1-0xe0],0x0
   0x0000000000400978 <+189>:   lea    rax,[rbp-0xe0]
   0x000000000040097f <+196>:   mov    esi,0x6010a0
   0x0000000000400984 <+201>:   mov    rdi,rax
   0x0000000000400987 <+204>:   call   0x400760 <strcmp@plt>
   0x000000000040098c <+209>:   test   eax,eax
   0x000000000040098e <+211>:   je     0x4009b0 <main+245>
   0x0000000000400990 <+213>:   lea    rax,[rbp-0xe0]
   0x0000000000400997 <+220>:   mov    rdi,rax
   0x000000000040099a <+223>:   call   0x4006d0 <puts@plt>
   0x000000000040099f <+228>:   mov    edi,0x400b28
   0x00000000004009a4 <+233>:   call   0x4006d0 <puts@plt>
   0x00000000004009a9 <+238>:   mov    eax,0xffffffff
   0x00000000004009ae <+243>:   jmp    0x400a14 <main+345>
   0x00000000004009b0 <+245>:   mov    esi,0x0
   0x00000000004009b5 <+250>:   mov    edi,0x400b56
   0x00000000004009ba <+255>:   mov    eax,0x0
   0x00000000004009bf <+260>:   call   0x400780 <open@plt>
   0x00000000004009c4 <+265>:   mov    DWORD PTR [rbp-0xe4],eax
   0x00000000004009ca <+271>:   lea    rax,[rbp-0x70]
   0x00000000004009ce <+275>:   mov    edx,0x64
   0x00000000004009d3 <+280>:   mov    esi,0x0
   0x00000000004009d8 <+285>:   mov    rdi,rax
   0x00000000004009db <+288>:   call   0x400720 <memset@plt>
   0x00000000004009e0 <+293>:   lea    rcx,[rbp-0x70]
   0x00000000004009e4 <+297>:   mov    eax,DWORD PTR [rbp-0xe4]
   0x00000000004009ea <+303>:   mov    edx,0x64
   0x00000000004009ef <+308>:   mov    rsi,rcx
   0x00000000004009f2 <+311>:   mov    edi,eax
   0x00000000004009f4 <+313>:   call   0x400730 <read@plt>
   0x00000000004009f9 <+318>:   lea    rax,[rbp-0x70]
   0x00000000004009fd <+322>:   mov    rsi,rax
   0x0000000000400a00 <+325>:   mov    edi,0x400b60
   0x0000000000400a05 <+330>:   mov    eax,0x0
   0x0000000000400a0a <+335>:   call   0x400710 <printf@plt>
   0x0000000000400a0f <+340>:   mov    eax,0x0
   0x0000000000400a14 <+345>:   mov    rcx,QWORD PTR [rbp-0x8]
   0x0000000000400a18 <+349>:   xor    rcx,QWORD PTR fs:0x28
   0x0000000000400a21 <+358>:   je     0x400a28 <main+365>
   0x0000000000400a23 <+360>:   call   0x4006f0 <__stack_chk_fail@plt>
   0x0000000000400a28 <+365>:   leave
   0x0000000000400a29 <+366>:   ret
End of assembler dump.

[guide] The disassembly may look confusing, but let's zoom in on the call
[guide] to the `getuid` function.
[code]  -----------------------------------------------------------------
[code]  0x00000000004008e9 <+46>:       call   0x400700 <getuid@plt>
[code]  0x00000000004008ee <+51>:       test   eax,eax
[code]  -----------------------------------------------------------------
[guide] Based on the `System V AMD64 ABI` calling convention used by linux
[guide] the return value of a function is stored in the `rax` register.
[guide] The eax register is just the value of the lower 32-bits of the `rax` register.
[guide] So if we change the value of `rax`/`eax`, we can change the return value of `getuid`!
[guide] First let's set a breakpoint at the address where `eax` is used
[ cmd ]   break * 0x00000000004008ee
[guide] Afterwards, continue the execution of the program with
[ cmd ]   continue
(gdb) break * 0x00000000004008ee
Breakpoint 3 at 0x4008ee: file ./crackme.c, line 20.
(gdb) continue
Continuing.
[Stage 1]
[guide]
Breakpoint 4 at 0x40093d: file ./crackme.c, line 32.
[guide] We can view the curent value of `eax` in two ways.
[ cmd ]   print $eax
[ cmd ]   info register eax
[guide] Then, change the value of `eax` to 0 to pass stage 1
[ cmd ]   set $eax = 0
[guide] If you display the value of `eax`, you'll see it's changed!
[guide] Finally, continue execution to move on to stage 2
[ cmd ]   continue
[guide]

Breakpoint 3, 0x00000000004008ee in main () at ./crackme.c:20
20              if(getuid() != 0){
(gdb) print $eax
$1 = 1000
(gdb) info register eax
eax            0x3e8               1000
(gdb) set $eax = 0
(gdb) continue
Continuing.
Stage 1 pass. Welcome root!
[Stage 2]
[guide]
[guide] I have helped you to set a breakpoint before the checks
[guide] are done for stage 2. In this stage. We are doing a strcmp
[guide] of the user's input with a `secret_key` in memory
[code]  -----------------------------------------------------------------
[code]  printf("Give me the secret key: ");
[code]  fgets(buf, 99, stdin);
[code]  ...
[code]  if(strcmp(buf, secret_key) != 0){
[code]  ...
[code]      puts("You do not know the secret_key, fail stage 2!");
[code]  -----------------------------------------------------------------
[guide] With the `secret_key` being the string value at address `0x6010a0`
[code]  -----------------------------------------------------------------
[code]  0x000000000040097f <+196>:      mov    esi,0x6010a0
[code]  -----------------------------------------------------------------
[guide] Let's find out the value of `secret_key`
[ cmd ]   x/s 0x6010a0
[ cmd ]   x/s secret_key
[guide] After finding the value, continue execution and enter the `secret_key`
[ cmd ]   continue
[guide]

Breakpoint 4, 0x000000000040093d in main () at ./crackme.c:32
32              printf("Give me the secret key: ");
(gdb) x/s 0x6010a0
0x6010a0 <secret_key>:  "Ay, ay, ay. I'm your little butterfly"
(gdb) x/s secret_key
0x6010a0 <secret_key>:  "Ay, ay, ay. I'm your little butterfly"
(gdb) continue
Continuing.
Give me the secret key: Ay, ay, ay. I'm your little butterfly
[guide]
[guide] Great job on this challenge!
[guide] I hope you have learnt something new
[guide] about the power of gdb in debugging
Congratulations, here is the flag: WH2020{The_beginnings_of_a_gdb_master}
[Inferior 1 (process 1013) exited normally]
[guide]
(gdb)
The program is not being run.
(gdb)
```

Good challenge and tutorial

# Flag

`WH2020{The_beginnings_of_a_gdb_master}`