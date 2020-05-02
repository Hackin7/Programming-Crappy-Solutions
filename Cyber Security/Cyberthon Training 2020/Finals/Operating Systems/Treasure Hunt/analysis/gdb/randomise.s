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
(gdb) (gdb) Dump of assembler code for function randomise:
   0x000000000000089f <+0>:	push   rbp
   0x00000000000008a0 <+1>:	mov    rbp,rsp
   0x00000000000008a3 <+4>:	sub    rsp,0x20
   0x00000000000008a7 <+8>:	call   0x760 <rand@plt>
   0x00000000000008ac <+13>:	cvtsi2sd xmm0,eax
   0x00000000000008b0 <+17>:	movsd  QWORD PTR [rbp-0x10],xmm0
   0x00000000000008b5 <+22>:	call   0x760 <rand@plt>
   0x00000000000008ba <+27>:	cvtsi2sd xmm0,eax
   0x00000000000008be <+31>:	movsd  QWORD PTR [rbp-0x8],xmm0
   0x00000000000008c3 <+36>:	movsd  xmm0,QWORD PTR [rbp-0x8]
   0x00000000000008c8 <+41>:	mov    rax,QWORD PTR [rbp-0x10]
   0x00000000000008cc <+45>:	movapd xmm1,xmm0
   0x00000000000008d0 <+49>:	mov    QWORD PTR [rbp-0x18],rax
   0x00000000000008d4 <+53>:	movsd  xmm0,QWORD PTR [rbp-0x18]
   0x00000000000008d9 <+58>:	lea    rdi,[rip+0x8b8]        # 0x1198
   0x00000000000008e0 <+65>:	mov    eax,0x2
   0x00000000000008e5 <+70>:	call   0x730 <printf@plt>
   0x00000000000008ea <+75>:	movsd  xmm0,QWORD PTR [rbp-0x8]
   0x00000000000008ef <+80>:	mov    rax,QWORD PTR [rbp-0x10]
   0x00000000000008f3 <+84>:	movapd xmm1,xmm0
   0x00000000000008f7 <+88>:	mov    QWORD PTR [rbp-0x18],rax
   0x00000000000008fb <+92>:	movsd  xmm0,QWORD PTR [rbp-0x18]
   0x0000000000000900 <+97>:	call   0xc52 <locations>
   0x0000000000000905 <+102>:	nop
   0x0000000000000906 <+103>:	leave  
   0x0000000000000907 <+104>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function randomise:
   0x000000000000089f <+0>:	push   rbp
   0x00000000000008a0 <+1>:	mov    rbp,rsp
   0x00000000000008a3 <+4>:	sub    rsp,0x20
   0x00000000000008a7 <+8>:	call   0x760 <rand@plt>
   0x00000000000008ac <+13>:	cvtsi2sd xmm0,eax
   0x00000000000008b0 <+17>:	movsd  QWORD PTR [rbp-0x10],xmm0
   0x00000000000008b5 <+22>:	call   0x760 <rand@plt>
   0x00000000000008ba <+27>:	cvtsi2sd xmm0,eax
   0x00000000000008be <+31>:	movsd  QWORD PTR [rbp-0x8],xmm0
   0x00000000000008c3 <+36>:	movsd  xmm0,QWORD PTR [rbp-0x8]
   0x00000000000008c8 <+41>:	mov    rax,QWORD PTR [rbp-0x10]
   0x00000000000008cc <+45>:	movapd xmm1,xmm0
   0x00000000000008d0 <+49>:	mov    QWORD PTR [rbp-0x18],rax
   0x00000000000008d4 <+53>:	movsd  xmm0,QWORD PTR [rbp-0x18]
   0x00000000000008d9 <+58>:	lea    rdi,[rip+0x8b8]        # 0x1198
   0x00000000000008e0 <+65>:	mov    eax,0x2
   0x00000000000008e5 <+70>:	call   0x730 <printf@plt>
   0x00000000000008ea <+75>:	movsd  xmm0,QWORD PTR [rbp-0x8]
   0x00000000000008ef <+80>:	mov    rax,QWORD PTR [rbp-0x10]
   0x00000000000008f3 <+84>:	movapd xmm1,xmm0
   0x00000000000008f7 <+88>:	mov    QWORD PTR [rbp-0x18],rax
   0x00000000000008fb <+92>:	movsd  xmm0,QWORD PTR [rbp-0x18]
   0x0000000000000900 <+97>:	call   0xc52 <locations>
   0x0000000000000905 <+102>:	nop
   0x0000000000000906 <+103>:	leave  
   0x0000000000000907 <+104>:	ret    
End of assembler dump.
(gdb) quit
