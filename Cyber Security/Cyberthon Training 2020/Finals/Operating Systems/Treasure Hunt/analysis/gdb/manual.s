GNU gdb (Debian 8.3.1-1) 8.3.1
Copyright (C) 2019 Free Software Foundation, Inc.
License GPLv3+: GNU GPL version 3 or later <http://gnu.org/licenses/gpl.html>
This is free software: you are free to change and redistribute it.
There is NO WARRANTY, to the extent permitted by law.
Type "show copying" and "show warranty" for details.
This GDB was configured as "x86_64-linux-gnu".
Type "show configuration" for configuration details.
For bug reporting instructions, please see:
<http://www.gnu.org/software/gdb/bugs/>.
Find the GDB manual and other documentation resources online at:
    <http://www.gnu.org/software/gdb/documentation/>.

For help, type "help".
Type "apropos word" to search for commands related to "word"...
Reading symbols from /host/Documents/Stuff/Github/Programming Crappy Solutions/Cyber Security/Cyberthon 2020/Treasure Hunt/map...
(No debugging symbols found in /host/Documents/Stuff/Github/Programming Crappy Solutions/Cyber Security/Cyberthon 2020/Treasure Hunt/map)
(gdb) (gdb) Dump of assembler code for function manual:
   0x00000000000009b3 <+0>:	push   rbp
   0x00000000000009b4 <+1>:	mov    rbp,rsp
   0x00000000000009b7 <+4>:	sub    rsp,0x30
   0x00000000000009bb <+8>:	mov    rax,QWORD PTR fs:0x28
   0x00000000000009c4 <+17>:	mov    QWORD PTR [rbp-0x8],rax
   0x00000000000009c8 <+21>:	xor    eax,eax
   0x00000000000009ca <+23>:	lea    rdi,[rip+0x7e7]        # 0x11b8
   0x00000000000009d1 <+30>:	call   0x700 <puts@plt>
   0x00000000000009d6 <+35>:	lea    rdi,[rip+0x813]        # 0x11f0
   0x00000000000009dd <+42>:	call   0x700 <puts@plt>
   0x00000000000009e2 <+47>:	lea    rdi,[rip+0x837]        # 0x1220
   0x00000000000009e9 <+54>:	call   0x700 <puts@plt>
   0x00000000000009ee <+59>:	lea    rdi,[rip+0x85b]        # 0x1250
   0x00000000000009f5 <+66>:	call   0x700 <puts@plt>
   0x00000000000009fa <+71>:	lea    rdi,[rip+0x87f]        # 0x1280
   0x0000000000000a01 <+78>:	call   0x700 <puts@plt>
   0x0000000000000a06 <+83>:	lea    rdi,[rip+0x89b]        # 0x12a8
   0x0000000000000a0d <+90>:	call   0x700 <puts@plt>
   0x0000000000000a12 <+95>:	lea    rdi,[rip+0x8c7]        # 0x12e0
   0x0000000000000a19 <+102>:	call   0x700 <puts@plt>
   0x0000000000000a1e <+107>:	lea    rdi,[rip+0x8eb]        # 0x1310
   0x0000000000000a25 <+114>:	call   0x700 <puts@plt>
   0x0000000000000a2a <+119>:	lea    rdi,[rip+0x906]        # 0x1337
   0x0000000000000a31 <+126>:	call   0x700 <puts@plt>
   0x0000000000000a36 <+131>:	mov    edi,0xa
   0x0000000000000a3b <+136>:	call   0x6f0 <putchar@plt>
   0x0000000000000a40 <+141>:	pxor   xmm0,xmm0
   0x0000000000000a44 <+145>:	movsd  QWORD PTR [rbp-0x18],xmm0
   0x0000000000000a49 <+150>:	pxor   xmm0,xmm0
   0x0000000000000a4d <+154>:	movsd  QWORD PTR [rbp-0x10],xmm0
   0x0000000000000a52 <+159>:	lea    rdi,[rip+0x8ff]        # 0x1358
   0x0000000000000a59 <+166>:	mov    eax,0x0
   0x0000000000000a5e <+171>:	call   0x730 <printf@plt>
   0x0000000000000a63 <+176>:	mov    DWORD PTR [rbp-0x20],0x0
   0x0000000000000a6a <+183>:	mov    DWORD PTR [rbp-0x1c],0x0
   0x0000000000000a71 <+190>:	lea    rax,[rbp-0x18]
   0x0000000000000a75 <+194>:	mov    rsi,rax
   0x0000000000000a78 <+197>:	lea    rdi,[rip+0x8fd]        # 0x137c
   0x0000000000000a7f <+204>:	mov    eax,0x0
   0x0000000000000a84 <+209>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000a89 <+214>:	mov    DWORD PTR [rbp-0x20],eax
   0x0000000000000a8c <+217>:	cmp    DWORD PTR [rbp-0x20],0x0
   0x0000000000000a90 <+221>:	jne    0xaa5 <manual+242>
   0x0000000000000a92 <+223>:	lea    rdi,[rip+0x8e7]        # 0x1380
   0x0000000000000a99 <+230>:	call   0x700 <puts@plt>
   0x0000000000000a9e <+235>:	mov    eax,0xffffffff
   0x0000000000000aa3 <+240>:	jmp    0xb0f <manual+348>
   0x0000000000000aa5 <+242>:	lea    rdi,[rip+0x8ec]        # 0x1398
   0x0000000000000aac <+249>:	mov    eax,0x0
   0x0000000000000ab1 <+254>:	call   0x730 <printf@plt>
   0x0000000000000ab6 <+259>:	lea    rax,[rbp-0x10]
   0x0000000000000aba <+263>:	mov    rsi,rax
   0x0000000000000abd <+266>:	lea    rdi,[rip+0x8b8]        # 0x137c
   0x0000000000000ac4 <+273>:	mov    eax,0x0
   0x0000000000000ac9 <+278>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000ace <+283>:	mov    DWORD PTR [rbp-0x1c],eax
   0x0000000000000ad1 <+286>:	cmp    DWORD PTR [rbp-0x1c],0x0
   0x0000000000000ad5 <+290>:	jne    0xaea <manual+311>
   0x0000000000000ad7 <+292>:	lea    rdi,[rip+0x8a2]        # 0x1380
   0x0000000000000ade <+299>:	call   0x700 <puts@plt>
   0x0000000000000ae3 <+304>:	mov    eax,0xffffffff
   0x0000000000000ae8 <+309>:	jmp    0xb0f <manual+348>
   0x0000000000000aea <+311>:	mov    edi,0xa
   0x0000000000000aef <+316>:	call   0x6f0 <putchar@plt>
   0x0000000000000af4 <+321>:	movsd  xmm0,QWORD PTR [rbp-0x10]
   0x0000000000000af9 <+326>:	mov    rax,QWORD PTR [rbp-0x18]
   0x0000000000000afd <+330>:	movapd xmm1,xmm0
   0x0000000000000b01 <+334>:	mov    QWORD PTR [rbp-0x28],rax
   0x0000000000000b05 <+338>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000b0a <+343>:	call   0xc52 <locations>
   0x0000000000000b0f <+348>:	mov    rdx,QWORD PTR [rbp-0x8]
   0x0000000000000b13 <+352>:	xor    rdx,QWORD PTR fs:0x28
   0x0000000000000b1c <+361>:	je     0xb23 <manual+368>
   0x0000000000000b1e <+363>:	call   0x720 <__stack_chk_fail@plt>
   0x0000000000000b23 <+368>:	leave  
   0x0000000000000b24 <+369>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function manual:
   0x00000000000009b3 <+0>:	push   rbp
   0x00000000000009b4 <+1>:	mov    rbp,rsp
   0x00000000000009b7 <+4>:	sub    rsp,0x30
   0x00000000000009bb <+8>:	mov    rax,QWORD PTR fs:0x28
   0x00000000000009c4 <+17>:	mov    QWORD PTR [rbp-0x8],rax
   0x00000000000009c8 <+21>:	xor    eax,eax
   0x00000000000009ca <+23>:	lea    rdi,[rip+0x7e7]        # 0x11b8
   0x00000000000009d1 <+30>:	call   0x700 <puts@plt>
   0x00000000000009d6 <+35>:	lea    rdi,[rip+0x813]        # 0x11f0
   0x00000000000009dd <+42>:	call   0x700 <puts@plt>
   0x00000000000009e2 <+47>:	lea    rdi,[rip+0x837]        # 0x1220
   0x00000000000009e9 <+54>:	call   0x700 <puts@plt>
   0x00000000000009ee <+59>:	lea    rdi,[rip+0x85b]        # 0x1250
   0x00000000000009f5 <+66>:	call   0x700 <puts@plt>
   0x00000000000009fa <+71>:	lea    rdi,[rip+0x87f]        # 0x1280
   0x0000000000000a01 <+78>:	call   0x700 <puts@plt>
   0x0000000000000a06 <+83>:	lea    rdi,[rip+0x89b]        # 0x12a8
   0x0000000000000a0d <+90>:	call   0x700 <puts@plt>
   0x0000000000000a12 <+95>:	lea    rdi,[rip+0x8c7]        # 0x12e0
   0x0000000000000a19 <+102>:	call   0x700 <puts@plt>
   0x0000000000000a1e <+107>:	lea    rdi,[rip+0x8eb]        # 0x1310
   0x0000000000000a25 <+114>:	call   0x700 <puts@plt>
   0x0000000000000a2a <+119>:	lea    rdi,[rip+0x906]        # 0x1337
   0x0000000000000a31 <+126>:	call   0x700 <puts@plt>
   0x0000000000000a36 <+131>:	mov    edi,0xa
   0x0000000000000a3b <+136>:	call   0x6f0 <putchar@plt>
   0x0000000000000a40 <+141>:	pxor   xmm0,xmm0
   0x0000000000000a44 <+145>:	movsd  QWORD PTR [rbp-0x18],xmm0
   0x0000000000000a49 <+150>:	pxor   xmm0,xmm0
   0x0000000000000a4d <+154>:	movsd  QWORD PTR [rbp-0x10],xmm0
   0x0000000000000a52 <+159>:	lea    rdi,[rip+0x8ff]        # 0x1358
   0x0000000000000a59 <+166>:	mov    eax,0x0
   0x0000000000000a5e <+171>:	call   0x730 <printf@plt>
   0x0000000000000a63 <+176>:	mov    DWORD PTR [rbp-0x20],0x0
   0x0000000000000a6a <+183>:	mov    DWORD PTR [rbp-0x1c],0x0
   0x0000000000000a71 <+190>:	lea    rax,[rbp-0x18]
   0x0000000000000a75 <+194>:	mov    rsi,rax
   0x0000000000000a78 <+197>:	lea    rdi,[rip+0x8fd]        # 0x137c
   0x0000000000000a7f <+204>:	mov    eax,0x0
   0x0000000000000a84 <+209>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000a89 <+214>:	mov    DWORD PTR [rbp-0x20],eax
   0x0000000000000a8c <+217>:	cmp    DWORD PTR [rbp-0x20],0x0
   0x0000000000000a90 <+221>:	jne    0xaa5 <manual+242>
   0x0000000000000a92 <+223>:	lea    rdi,[rip+0x8e7]        # 0x1380
   0x0000000000000a99 <+230>:	call   0x700 <puts@plt>
   0x0000000000000a9e <+235>:	mov    eax,0xffffffff
   0x0000000000000aa3 <+240>:	jmp    0xb0f <manual+348>
   0x0000000000000aa5 <+242>:	lea    rdi,[rip+0x8ec]        # 0x1398
   0x0000000000000aac <+249>:	mov    eax,0x0
   0x0000000000000ab1 <+254>:	call   0x730 <printf@plt>
   0x0000000000000ab6 <+259>:	lea    rax,[rbp-0x10]
   0x0000000000000aba <+263>:	mov    rsi,rax
   0x0000000000000abd <+266>:	lea    rdi,[rip+0x8b8]        # 0x137c
   0x0000000000000ac4 <+273>:	mov    eax,0x0
   0x0000000000000ac9 <+278>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000ace <+283>:	mov    DWORD PTR [rbp-0x1c],eax
   0x0000000000000ad1 <+286>:	cmp    DWORD PTR [rbp-0x1c],0x0
   0x0000000000000ad5 <+290>:	jne    0xaea <manual+311>
   0x0000000000000ad7 <+292>:	lea    rdi,[rip+0x8a2]        # 0x1380
   0x0000000000000ade <+299>:	call   0x700 <puts@plt>
   0x0000000000000ae3 <+304>:	mov    eax,0xffffffff
   0x0000000000000ae8 <+309>:	jmp    0xb0f <manual+348>
   0x0000000000000aea <+311>:	mov    edi,0xa
   0x0000000000000aef <+316>:	call   0x6f0 <putchar@plt>
   0x0000000000000af4 <+321>:	movsd  xmm0,QWORD PTR [rbp-0x10]
   0x0000000000000af9 <+326>:	mov    rax,QWORD PTR [rbp-0x18]
   0x0000000000000afd <+330>:	movapd xmm1,xmm0
   0x0000000000000b01 <+334>:	mov    QWORD PTR [rbp-0x28],rax
   0x0000000000000b05 <+338>:	movsd  xmm0,QWORD PTR [rbp-0x28]
   0x0000000000000b0a <+343>:	call   0xc52 <locations>
   0x0000000000000b0f <+348>:	mov    rdx,QWORD PTR [rbp-0x8]
   0x0000000000000b13 <+352>:	xor    rdx,QWORD PTR fs:0x28
   0x0000000000000b1c <+361>:	je     0xb23 <manual+368>
   0x0000000000000b1e <+363>:	call   0x720 <__stack_chk_fail@plt>
   0x0000000000000b23 <+368>:	leave  
   0x0000000000000b24 <+369>:	ret    
End of assembler dump.
(gdb) quit
