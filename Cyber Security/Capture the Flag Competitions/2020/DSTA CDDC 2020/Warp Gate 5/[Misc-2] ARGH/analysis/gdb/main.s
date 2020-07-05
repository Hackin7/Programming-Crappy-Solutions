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
Reading symbols from /host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 5/[Misc-2] ARGH/myprog...
(No debugging symbols found in /host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 5/[Misc-2] ARGH/myprog)
(gdb) (gdb) Dump of assembler code for function main:
   0x000000000000078a <+0>:	push   rbp
   0x000000000000078b <+1>:	mov    rbp,rsp
   0x000000000000078e <+4>:	push   rbx
   0x000000000000078f <+5>:	sub    rsp,0xb8
   0x0000000000000796 <+12>:	mov    DWORD PTR [rbp-0xb4],edi
   0x000000000000079c <+18>:	mov    QWORD PTR [rbp-0xc0],rsi
   0x00000000000007a3 <+25>:	mov    rax,QWORD PTR fs:0x28
   0x00000000000007ac <+34>:	mov    QWORD PTR [rbp-0x18],rax
   0x00000000000007b0 <+38>:	xor    eax,eax
   0x00000000000007b2 <+40>:	cmp    DWORD PTR [rbp-0xb4],0x1
   0x00000000000007b9 <+47>:	jg     0x7d1 <main+71>
   0x00000000000007bb <+49>:	lea    rdi,[rip+0x1f6]        # 0x9b8
   0x00000000000007c2 <+56>:	call   0x630 <puts@plt>
   0x00000000000007c7 <+61>:	mov    eax,0x1
   0x00000000000007cc <+66>:	jmp    0x90b <main+385>
   0x00000000000007d1 <+71>:	cmp    DWORD PTR [rbp-0xb4],0x2
   0x00000000000007d8 <+78>:	jle    0x7f0 <main+102>
   0x00000000000007da <+80>:	lea    rdi,[rip+0x1ff]        # 0x9e0
   0x00000000000007e1 <+87>:	call   0x630 <puts@plt>
   0x00000000000007e6 <+92>:	mov    eax,0x1
   0x00000000000007eb <+97>:	jmp    0x90b <main+385>
   0x00000000000007f0 <+102>:	mov    rax,QWORD PTR [rbp-0xc0]
   0x00000000000007f7 <+109>:	add    rax,0x8
   0x00000000000007fb <+113>:	mov    rax,QWORD PTR [rax]
   0x00000000000007fe <+116>:	mov    rdi,rax
   0x0000000000000801 <+119>:	call   0x640 <strlen@plt>
   0x0000000000000806 <+124>:	mov    DWORD PTR [rbp-0xa4],eax
   0x000000000000080c <+130>:	cmp    DWORD PTR [rbp-0xa4],0x21
   0x0000000000000813 <+137>:	je     0x82b <main+161>
   0x0000000000000815 <+139>:	lea    rdi,[rip+0x1da]        # 0x9f6
   0x000000000000081c <+146>:	call   0x630 <puts@plt>
   0x0000000000000821 <+151>:	mov    eax,0x1
   0x0000000000000826 <+156>:	jmp    0x90b <main+385>
   0x000000000000082b <+161>:	mov    rax,QWORD PTR [rbp-0xc0]
   0x0000000000000832 <+168>:	add    rax,0x8
   0x0000000000000836 <+172>:	mov    rdx,QWORD PTR [rax]
   0x0000000000000839 <+175>:	lea    rax,[rbp-0x70]
   0x000000000000083d <+179>:	mov    rsi,rdx
   0x0000000000000840 <+182>:	mov    rdi,rax
   0x0000000000000843 <+185>:	call   0x620 <strcpy@plt>
   0x0000000000000848 <+190>:	movabs rax,0x1486a6a24761e04
   0x0000000000000852 <+200>:	movabs rdx,0x14113d20103c5f74
   0x000000000000085c <+210>:	mov    QWORD PTR [rbp-0x40],rax
   0x0000000000000860 <+214>:	mov    QWORD PTR [rbp-0x38],rdx
   0x0000000000000864 <+218>:	movabs rax,0x132f4a0b13060c69
   0x000000000000086e <+228>:	movabs rdx,0x3b054679631a6205
   0x0000000000000878 <+238>:	mov    QWORD PTR [rbp-0x30],rax
   0x000000000000087c <+242>:	mov    QWORD PTR [rbp-0x28],rdx
   0x0000000000000880 <+246>:	mov    WORD PTR [rbp-0x20],0x3c
   0x0000000000000886 <+252>:	mov    DWORD PTR [rbp-0xa8],0x0
   0x0000000000000890 <+262>:	jmp    0x8d1 <main+327>
   0x0000000000000892 <+264>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x0000000000000898 <+270>:	cdqe   
   0x000000000000089a <+272>:	movzx  edx,BYTE PTR [rbp+rax*1-0x40]
   0x000000000000089f <+277>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x00000000000008a5 <+283>:	cdqe   
   0x00000000000008a7 <+285>:	movzx  eax,BYTE PTR [rbp+rax*1-0x70]
   0x00000000000008ac <+290>:	xor    eax,edx
   0x00000000000008ae <+292>:	mov    BYTE PTR [rbp-0xa9],al
   0x00000000000008b4 <+298>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x00000000000008ba <+304>:	cdqe   
   0x00000000000008bc <+306>:	movzx  edx,BYTE PTR [rbp-0xa9]
   0x00000000000008c3 <+313>:	mov    BYTE PTR [rbp+rax*1-0xa0],dl
   0x00000000000008ca <+320>:	add    DWORD PTR [rbp-0xa8],0x1
   0x00000000000008d1 <+327>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x00000000000008d7 <+333>:	movsxd rbx,eax
   0x00000000000008da <+336>:	lea    rax,[rbp-0x40]
   0x00000000000008de <+340>:	mov    rdi,rax
   0x00000000000008e1 <+343>:	call   0x640 <strlen@plt>
   0x00000000000008e6 <+348>:	cmp    rbx,rax
   0x00000000000008e9 <+351>:	jb     0x892 <main+264>
   0x00000000000008eb <+353>:	lea    rax,[rbp-0xa0]
   0x00000000000008f2 <+360>:	mov    rsi,rax
   0x00000000000008f5 <+363>:	lea    rdi,[rip+0x115]        # 0xa11
   0x00000000000008fc <+370>:	mov    eax,0x0
   0x0000000000000901 <+375>:	call   0x660 <printf@plt>
   0x0000000000000906 <+380>:	mov    eax,0x0
   0x000000000000090b <+385>:	mov    rcx,QWORD PTR [rbp-0x18]
   0x000000000000090f <+389>:	xor    rcx,QWORD PTR fs:0x28
   0x0000000000000918 <+398>:	je     0x91f <main+405>
   0x000000000000091a <+400>:	call   0x650 <__stack_chk_fail@plt>
   0x000000000000091f <+405>:	add    rsp,0xb8
   0x0000000000000926 <+412>:	pop    rbx
   0x0000000000000927 <+413>:	pop    rbp
   0x0000000000000928 <+414>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function main:
   0x000000000000078a <+0>:	push   rbp
   0x000000000000078b <+1>:	mov    rbp,rsp
   0x000000000000078e <+4>:	push   rbx
   0x000000000000078f <+5>:	sub    rsp,0xb8
   0x0000000000000796 <+12>:	mov    DWORD PTR [rbp-0xb4],edi
   0x000000000000079c <+18>:	mov    QWORD PTR [rbp-0xc0],rsi
   0x00000000000007a3 <+25>:	mov    rax,QWORD PTR fs:0x28
   0x00000000000007ac <+34>:	mov    QWORD PTR [rbp-0x18],rax
   0x00000000000007b0 <+38>:	xor    eax,eax
   0x00000000000007b2 <+40>:	cmp    DWORD PTR [rbp-0xb4],0x1
   0x00000000000007b9 <+47>:	jg     0x7d1 <main+71>
   0x00000000000007bb <+49>:	lea    rdi,[rip+0x1f6]        # 0x9b8
   0x00000000000007c2 <+56>:	call   0x630 <puts@plt>
   0x00000000000007c7 <+61>:	mov    eax,0x1
   0x00000000000007cc <+66>:	jmp    0x90b <main+385>
   0x00000000000007d1 <+71>:	cmp    DWORD PTR [rbp-0xb4],0x2
   0x00000000000007d8 <+78>:	jle    0x7f0 <main+102>
   0x00000000000007da <+80>:	lea    rdi,[rip+0x1ff]        # 0x9e0
   0x00000000000007e1 <+87>:	call   0x630 <puts@plt>
   0x00000000000007e6 <+92>:	mov    eax,0x1
   0x00000000000007eb <+97>:	jmp    0x90b <main+385>
   0x00000000000007f0 <+102>:	mov    rax,QWORD PTR [rbp-0xc0]
   0x00000000000007f7 <+109>:	add    rax,0x8
   0x00000000000007fb <+113>:	mov    rax,QWORD PTR [rax]
   0x00000000000007fe <+116>:	mov    rdi,rax
   0x0000000000000801 <+119>:	call   0x640 <strlen@plt>
   0x0000000000000806 <+124>:	mov    DWORD PTR [rbp-0xa4],eax
   0x000000000000080c <+130>:	cmp    DWORD PTR [rbp-0xa4],0x21
   0x0000000000000813 <+137>:	je     0x82b <main+161>
   0x0000000000000815 <+139>:	lea    rdi,[rip+0x1da]        # 0x9f6
   0x000000000000081c <+146>:	call   0x630 <puts@plt>
   0x0000000000000821 <+151>:	mov    eax,0x1
   0x0000000000000826 <+156>:	jmp    0x90b <main+385>
   0x000000000000082b <+161>:	mov    rax,QWORD PTR [rbp-0xc0]
   0x0000000000000832 <+168>:	add    rax,0x8
   0x0000000000000836 <+172>:	mov    rdx,QWORD PTR [rax]
   0x0000000000000839 <+175>:	lea    rax,[rbp-0x70]
   0x000000000000083d <+179>:	mov    rsi,rdx
   0x0000000000000840 <+182>:	mov    rdi,rax
   0x0000000000000843 <+185>:	call   0x620 <strcpy@plt>
   0x0000000000000848 <+190>:	movabs rax,0x1486a6a24761e04
   0x0000000000000852 <+200>:	movabs rdx,0x14113d20103c5f74
   0x000000000000085c <+210>:	mov    QWORD PTR [rbp-0x40],rax
   0x0000000000000860 <+214>:	mov    QWORD PTR [rbp-0x38],rdx
   0x0000000000000864 <+218>:	movabs rax,0x132f4a0b13060c69
   0x000000000000086e <+228>:	movabs rdx,0x3b054679631a6205
   0x0000000000000878 <+238>:	mov    QWORD PTR [rbp-0x30],rax
   0x000000000000087c <+242>:	mov    QWORD PTR [rbp-0x28],rdx
   0x0000000000000880 <+246>:	mov    WORD PTR [rbp-0x20],0x3c
   0x0000000000000886 <+252>:	mov    DWORD PTR [rbp-0xa8],0x0
   0x0000000000000890 <+262>:	jmp    0x8d1 <main+327>
   0x0000000000000892 <+264>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x0000000000000898 <+270>:	cdqe   
   0x000000000000089a <+272>:	movzx  edx,BYTE PTR [rbp+rax*1-0x40]
   0x000000000000089f <+277>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x00000000000008a5 <+283>:	cdqe   
   0x00000000000008a7 <+285>:	movzx  eax,BYTE PTR [rbp+rax*1-0x70]
   0x00000000000008ac <+290>:	xor    eax,edx
   0x00000000000008ae <+292>:	mov    BYTE PTR [rbp-0xa9],al
   0x00000000000008b4 <+298>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x00000000000008ba <+304>:	cdqe   
   0x00000000000008bc <+306>:	movzx  edx,BYTE PTR [rbp-0xa9]
   0x00000000000008c3 <+313>:	mov    BYTE PTR [rbp+rax*1-0xa0],dl
   0x00000000000008ca <+320>:	add    DWORD PTR [rbp-0xa8],0x1
   0x00000000000008d1 <+327>:	mov    eax,DWORD PTR [rbp-0xa8]
   0x00000000000008d7 <+333>:	movsxd rbx,eax
   0x00000000000008da <+336>:	lea    rax,[rbp-0x40]
   0x00000000000008de <+340>:	mov    rdi,rax
   0x00000000000008e1 <+343>:	call   0x640 <strlen@plt>
   0x00000000000008e6 <+348>:	cmp    rbx,rax
   0x00000000000008e9 <+351>:	jb     0x892 <main+264>
   0x00000000000008eb <+353>:	lea    rax,[rbp-0xa0]
   0x00000000000008f2 <+360>:	mov    rsi,rax
   0x00000000000008f5 <+363>:	lea    rdi,[rip+0x115]        # 0xa11
   0x00000000000008fc <+370>:	mov    eax,0x0
   0x0000000000000901 <+375>:	call   0x660 <printf@plt>
   0x0000000000000906 <+380>:	mov    eax,0x0
   0x000000000000090b <+385>:	mov    rcx,QWORD PTR [rbp-0x18]
   0x000000000000090f <+389>:	xor    rcx,QWORD PTR fs:0x28
   0x0000000000000918 <+398>:	je     0x91f <main+405>
   0x000000000000091a <+400>:	call   0x650 <__stack_chk_fail@plt>
   0x000000000000091f <+405>:	add    rsp,0xb8
   0x0000000000000926 <+412>:	pop    rbx
   0x0000000000000927 <+413>:	pop    rbp
   0x0000000000000928 <+414>:	ret    
End of assembler dump.
(gdb) quit
