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
(gdb) (gdb) Dump of assembler code for function xor:
   0x0000000000000908 <+0>:	push   rbp
   0x0000000000000909 <+1>:	mov    rbp,rsp
   0x000000000000090c <+4>:	sub    rsp,0x30
   0x0000000000000910 <+8>:	mov    QWORD PTR [rbp-0x28],rdi
   0x0000000000000914 <+12>:	mov    QWORD PTR [rbp-0x30],rsi
   0x0000000000000918 <+16>:	mov    rax,QWORD PTR [rbp-0x28]
   0x000000000000091c <+20>:	mov    rdi,rax
   0x000000000000091f <+23>:	call   0x710 <strlen@plt>
   0x0000000000000924 <+28>:	mov    QWORD PTR [rbp-0x18],rax
   0x0000000000000928 <+32>:	mov    rax,QWORD PTR [rbp-0x30]
   0x000000000000092c <+36>:	mov    rdi,rax
   0x000000000000092f <+39>:	call   0x710 <strlen@plt>
   0x0000000000000934 <+44>:	mov    QWORD PTR [rbp-0x10],rax
   0x0000000000000938 <+48>:	mov    rax,QWORD PTR [rbp-0x18]
   0x000000000000093c <+52>:	add    rax,0x1
   0x0000000000000940 <+56>:	mov    rdi,rax
   0x0000000000000943 <+59>:	call   0x740 <malloc@plt>
   0x0000000000000948 <+64>:	mov    QWORD PTR [rbp-0x8],rax
   0x000000000000094c <+68>:	mov    DWORD PTR [rbp-0x1c],0x0
   0x0000000000000953 <+75>:	jmp    0x994 <xor+140>
   0x0000000000000955 <+77>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000958 <+80>:	movsxd rdx,eax
   0x000000000000095b <+83>:	mov    rax,QWORD PTR [rbp-0x28]
   0x000000000000095f <+87>:	add    rax,rdx
   0x0000000000000962 <+90>:	movzx  esi,BYTE PTR [rax]
   0x0000000000000965 <+93>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000968 <+96>:	cdqe   
   0x000000000000096a <+98>:	mov    edx,0x0
   0x000000000000096f <+103>:	div    QWORD PTR [rbp-0x10]
   0x0000000000000973 <+107>:	mov    rax,QWORD PTR [rbp-0x30]
   0x0000000000000977 <+111>:	add    rax,rdx
   0x000000000000097a <+114>:	movzx  ecx,BYTE PTR [rax]
   0x000000000000097d <+117>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000980 <+120>:	movsxd rdx,eax
   0x0000000000000983 <+123>:	mov    rax,QWORD PTR [rbp-0x8]
   0x0000000000000987 <+127>:	add    rax,rdx
   0x000000000000098a <+130>:	xor    esi,ecx
   0x000000000000098c <+132>:	mov    edx,esi
   0x000000000000098e <+134>:	mov    BYTE PTR [rax],dl
   0x0000000000000990 <+136>:	add    DWORD PTR [rbp-0x1c],0x1
   0x0000000000000994 <+140>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000997 <+143>:	cdqe   
   0x0000000000000999 <+145>:	cmp    QWORD PTR [rbp-0x18],rax
   0x000000000000099d <+149>:	ja     0x955 <xor+77>
   0x000000000000099f <+151>:	mov    rdx,QWORD PTR [rbp-0x8]
   0x00000000000009a3 <+155>:	mov    rax,QWORD PTR [rbp-0x18]
   0x00000000000009a7 <+159>:	add    rax,rdx
   0x00000000000009aa <+162>:	mov    BYTE PTR [rax],0x0
   0x00000000000009ad <+165>:	mov    rax,QWORD PTR [rbp-0x8]
   0x00000000000009b1 <+169>:	leave  
   0x00000000000009b2 <+170>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function xor:
   0x0000000000000908 <+0>:	push   rbp
   0x0000000000000909 <+1>:	mov    rbp,rsp
   0x000000000000090c <+4>:	sub    rsp,0x30
   0x0000000000000910 <+8>:	mov    QWORD PTR [rbp-0x28],rdi
   0x0000000000000914 <+12>:	mov    QWORD PTR [rbp-0x30],rsi
   0x0000000000000918 <+16>:	mov    rax,QWORD PTR [rbp-0x28]
   0x000000000000091c <+20>:	mov    rdi,rax
   0x000000000000091f <+23>:	call   0x710 <strlen@plt>
   0x0000000000000924 <+28>:	mov    QWORD PTR [rbp-0x18],rax
   0x0000000000000928 <+32>:	mov    rax,QWORD PTR [rbp-0x30]
   0x000000000000092c <+36>:	mov    rdi,rax
   0x000000000000092f <+39>:	call   0x710 <strlen@plt>
   0x0000000000000934 <+44>:	mov    QWORD PTR [rbp-0x10],rax
   0x0000000000000938 <+48>:	mov    rax,QWORD PTR [rbp-0x18]
   0x000000000000093c <+52>:	add    rax,0x1
   0x0000000000000940 <+56>:	mov    rdi,rax
   0x0000000000000943 <+59>:	call   0x740 <malloc@plt>
   0x0000000000000948 <+64>:	mov    QWORD PTR [rbp-0x8],rax
   0x000000000000094c <+68>:	mov    DWORD PTR [rbp-0x1c],0x0
   0x0000000000000953 <+75>:	jmp    0x994 <xor+140>
   0x0000000000000955 <+77>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000958 <+80>:	movsxd rdx,eax
   0x000000000000095b <+83>:	mov    rax,QWORD PTR [rbp-0x28]
   0x000000000000095f <+87>:	add    rax,rdx
   0x0000000000000962 <+90>:	movzx  esi,BYTE PTR [rax]
   0x0000000000000965 <+93>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000968 <+96>:	cdqe   
   0x000000000000096a <+98>:	mov    edx,0x0
   0x000000000000096f <+103>:	div    QWORD PTR [rbp-0x10]
   0x0000000000000973 <+107>:	mov    rax,QWORD PTR [rbp-0x30]
   0x0000000000000977 <+111>:	add    rax,rdx
   0x000000000000097a <+114>:	movzx  ecx,BYTE PTR [rax]
   0x000000000000097d <+117>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000980 <+120>:	movsxd rdx,eax
   0x0000000000000983 <+123>:	mov    rax,QWORD PTR [rbp-0x8]
   0x0000000000000987 <+127>:	add    rax,rdx
   0x000000000000098a <+130>:	xor    esi,ecx
   0x000000000000098c <+132>:	mov    edx,esi
   0x000000000000098e <+134>:	mov    BYTE PTR [rax],dl
   0x0000000000000990 <+136>:	add    DWORD PTR [rbp-0x1c],0x1
   0x0000000000000994 <+140>:	mov    eax,DWORD PTR [rbp-0x1c]
   0x0000000000000997 <+143>:	cdqe   
   0x0000000000000999 <+145>:	cmp    QWORD PTR [rbp-0x18],rax
   0x000000000000099d <+149>:	ja     0x955 <xor+77>
   0x000000000000099f <+151>:	mov    rdx,QWORD PTR [rbp-0x8]
   0x00000000000009a3 <+155>:	mov    rax,QWORD PTR [rbp-0x18]
   0x00000000000009a7 <+159>:	add    rax,rdx
   0x00000000000009aa <+162>:	mov    BYTE PTR [rax],0x0
   0x00000000000009ad <+165>:	mov    rax,QWORD PTR [rbp-0x8]
   0x00000000000009b1 <+169>:	leave  
   0x00000000000009b2 <+170>:	ret    
End of assembler dump.
(gdb) quit
