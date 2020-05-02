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
(gdb) (gdb) Dump of assembler code for function menu:
   0x0000000000000b25 <+0>:	push   rbp
   0x0000000000000b26 <+1>:	mov    rbp,rsp
   0x0000000000000b29 <+4>:	sub    rsp,0x10
   0x0000000000000b2d <+8>:	mov    rax,QWORD PTR fs:0x28
   0x0000000000000b36 <+17>:	mov    QWORD PTR [rbp-0x8],rax
   0x0000000000000b3a <+21>:	xor    eax,eax
   0x0000000000000b3c <+23>:	lea    rdi,[rip+0x87d]        # 0x13c0
   0x0000000000000b43 <+30>:	call   0x700 <puts@plt>
   0x0000000000000b48 <+35>:	lea    rdi,[rip+0x8a9]        # 0x13f8
   0x0000000000000b4f <+42>:	mov    eax,0x0
   0x0000000000000b54 <+47>:	call   0x730 <printf@plt>
   0x0000000000000b59 <+52>:	lea    rdi,[rip+0x8d8]        # 0x1438
   0x0000000000000b60 <+59>:	call   0x700 <puts@plt>
   0x0000000000000b65 <+64>:	lea    rdi,[rip+0x921]        # 0x148d
   0x0000000000000b6c <+71>:	call   0x700 <puts@plt>
   0x0000000000000b71 <+76>:	lea    rdi,[rip+0x930]        # 0x14a8
   0x0000000000000b78 <+83>:	call   0x700 <puts@plt>
   0x0000000000000b7d <+88>:	lea    rdi,[rip+0x946]        # 0x14ca
   0x0000000000000b84 <+95>:	call   0x700 <puts@plt>
   0x0000000000000b89 <+100>:	mov    edi,0xa
   0x0000000000000b8e <+105>:	call   0x6f0 <putchar@plt>
   0x0000000000000b93 <+110>:	mov    DWORD PTR [rbp-0x10],0xffffffff
   0x0000000000000b9a <+117>:	lea    rdi,[rip+0x947]        # 0x14e8
   0x0000000000000ba1 <+124>:	mov    eax,0x0
   0x0000000000000ba6 <+129>:	call   0x730 <printf@plt>
   0x0000000000000bab <+134>:	lea    rax,[rbp-0x10]
   0x0000000000000baf <+138>:	mov    rsi,rax
   0x0000000000000bb2 <+141>:	lea    rdi,[rip+0x958]        # 0x1511
   0x0000000000000bb9 <+148>:	mov    eax,0x0
   0x0000000000000bbe <+153>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000bc3 <+158>:	jmp    0xc33 <menu+270>
   0x0000000000000bc5 <+160>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000bc8 <+163>:	cmp    eax,0x1
   0x0000000000000bcb <+166>:	jne    0xbd9 <menu+180>
   0x0000000000000bcd <+168>:	mov    eax,0x0
   0x0000000000000bd2 <+173>:	call   0x89f <randomise>
   0x0000000000000bd7 <+178>:	jmp    0xc0a <menu+229>
   0x0000000000000bd9 <+180>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000bdc <+183>:	cmp    eax,0x2
   0x0000000000000bdf <+186>:	jne    0xbf6 <menu+209>
   0x0000000000000be1 <+188>:	mov    eax,0x0
   0x0000000000000be6 <+193>:	call   0x9b3 <manual>
   0x0000000000000beb <+198>:	mov    DWORD PTR [rbp-0xc],eax
   0x0000000000000bee <+201>:	cmp    DWORD PTR [rbp-0xc],0xffffffff
   0x0000000000000bf2 <+205>:	jne    0xc0a <menu+229>
   0x0000000000000bf4 <+207>:	jmp    0xc3b <menu+278>
   0x0000000000000bf6 <+209>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000bf9 <+212>:	cmp    eax,0x9
   0x0000000000000bfc <+215>:	jne    0xc0a <menu+229>
   0x0000000000000bfe <+217>:	lea    rdi,[rip+0x90f]        # 0x1514
   0x0000000000000c05 <+224>:	call   0x700 <puts@plt>
   0x0000000000000c0a <+229>:	lea    rdi,[rip+0x8d7]        # 0x14e8
   0x0000000000000c11 <+236>:	mov    eax,0x0
   0x0000000000000c16 <+241>:	call   0x730 <printf@plt>
   0x0000000000000c1b <+246>:	lea    rax,[rbp-0x10]
   0x0000000000000c1f <+250>:	mov    rsi,rax
   0x0000000000000c22 <+253>:	lea    rdi,[rip+0x8e8]        # 0x1511
   0x0000000000000c29 <+260>:	mov    eax,0x0
   0x0000000000000c2e <+265>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000c33 <+270>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000c36 <+273>:	cmp    eax,0x9
   0x0000000000000c39 <+276>:	jne    0xbc5 <menu+160>
   0x0000000000000c3b <+278>:	nop
   0x0000000000000c3c <+279>:	mov    rax,QWORD PTR [rbp-0x8]
   0x0000000000000c40 <+283>:	xor    rax,QWORD PTR fs:0x28
   0x0000000000000c49 <+292>:	je     0xc50 <menu+299>
   0x0000000000000c4b <+294>:	call   0x720 <__stack_chk_fail@plt>
   0x0000000000000c50 <+299>:	leave  
   0x0000000000000c51 <+300>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function menu:
   0x0000000000000b25 <+0>:	push   rbp
   0x0000000000000b26 <+1>:	mov    rbp,rsp
   0x0000000000000b29 <+4>:	sub    rsp,0x10
   0x0000000000000b2d <+8>:	mov    rax,QWORD PTR fs:0x28
   0x0000000000000b36 <+17>:	mov    QWORD PTR [rbp-0x8],rax
   0x0000000000000b3a <+21>:	xor    eax,eax
   0x0000000000000b3c <+23>:	lea    rdi,[rip+0x87d]        # 0x13c0
   0x0000000000000b43 <+30>:	call   0x700 <puts@plt>
   0x0000000000000b48 <+35>:	lea    rdi,[rip+0x8a9]        # 0x13f8
   0x0000000000000b4f <+42>:	mov    eax,0x0
   0x0000000000000b54 <+47>:	call   0x730 <printf@plt>
   0x0000000000000b59 <+52>:	lea    rdi,[rip+0x8d8]        # 0x1438
   0x0000000000000b60 <+59>:	call   0x700 <puts@plt>
   0x0000000000000b65 <+64>:	lea    rdi,[rip+0x921]        # 0x148d
   0x0000000000000b6c <+71>:	call   0x700 <puts@plt>
   0x0000000000000b71 <+76>:	lea    rdi,[rip+0x930]        # 0x14a8
   0x0000000000000b78 <+83>:	call   0x700 <puts@plt>
   0x0000000000000b7d <+88>:	lea    rdi,[rip+0x946]        # 0x14ca
   0x0000000000000b84 <+95>:	call   0x700 <puts@plt>
   0x0000000000000b89 <+100>:	mov    edi,0xa
   0x0000000000000b8e <+105>:	call   0x6f0 <putchar@plt>
   0x0000000000000b93 <+110>:	mov    DWORD PTR [rbp-0x10],0xffffffff
   0x0000000000000b9a <+117>:	lea    rdi,[rip+0x947]        # 0x14e8
   0x0000000000000ba1 <+124>:	mov    eax,0x0
   0x0000000000000ba6 <+129>:	call   0x730 <printf@plt>
   0x0000000000000bab <+134>:	lea    rax,[rbp-0x10]
   0x0000000000000baf <+138>:	mov    rsi,rax
   0x0000000000000bb2 <+141>:	lea    rdi,[rip+0x958]        # 0x1511
   0x0000000000000bb9 <+148>:	mov    eax,0x0
   0x0000000000000bbe <+153>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000bc3 <+158>:	jmp    0xc33 <menu+270>
   0x0000000000000bc5 <+160>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000bc8 <+163>:	cmp    eax,0x1
   0x0000000000000bcb <+166>:	jne    0xbd9 <menu+180>
   0x0000000000000bcd <+168>:	mov    eax,0x0
   0x0000000000000bd2 <+173>:	call   0x89f <randomise>
   0x0000000000000bd7 <+178>:	jmp    0xc0a <menu+229>
   0x0000000000000bd9 <+180>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000bdc <+183>:	cmp    eax,0x2
   0x0000000000000bdf <+186>:	jne    0xbf6 <menu+209>
   0x0000000000000be1 <+188>:	mov    eax,0x0
   0x0000000000000be6 <+193>:	call   0x9b3 <manual>
   0x0000000000000beb <+198>:	mov    DWORD PTR [rbp-0xc],eax
   0x0000000000000bee <+201>:	cmp    DWORD PTR [rbp-0xc],0xffffffff
   0x0000000000000bf2 <+205>:	jne    0xc0a <menu+229>
   0x0000000000000bf4 <+207>:	jmp    0xc3b <menu+278>
   0x0000000000000bf6 <+209>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000bf9 <+212>:	cmp    eax,0x9
   0x0000000000000bfc <+215>:	jne    0xc0a <menu+229>
   0x0000000000000bfe <+217>:	lea    rdi,[rip+0x90f]        # 0x1514
   0x0000000000000c05 <+224>:	call   0x700 <puts@plt>
   0x0000000000000c0a <+229>:	lea    rdi,[rip+0x8d7]        # 0x14e8
   0x0000000000000c11 <+236>:	mov    eax,0x0
   0x0000000000000c16 <+241>:	call   0x730 <printf@plt>
   0x0000000000000c1b <+246>:	lea    rax,[rbp-0x10]
   0x0000000000000c1f <+250>:	mov    rsi,rax
   0x0000000000000c22 <+253>:	lea    rdi,[rip+0x8e8]        # 0x1511
   0x0000000000000c29 <+260>:	mov    eax,0x0
   0x0000000000000c2e <+265>:	call   0x750 <__isoc99_scanf@plt>
   0x0000000000000c33 <+270>:	mov    eax,DWORD PTR [rbp-0x10]
   0x0000000000000c36 <+273>:	cmp    eax,0x9
   0x0000000000000c39 <+276>:	jne    0xbc5 <menu+160>
   0x0000000000000c3b <+278>:	nop
   0x0000000000000c3c <+279>:	mov    rax,QWORD PTR [rbp-0x8]
   0x0000000000000c40 <+283>:	xor    rax,QWORD PTR fs:0x28
   0x0000000000000c49 <+292>:	je     0xc50 <menu+299>
   0x0000000000000c4b <+294>:	call   0x720 <__stack_chk_fail@plt>
   0x0000000000000c50 <+299>:	leave  
   0x0000000000000c51 <+300>:	ret    
End of assembler dump.
(gdb) quit
