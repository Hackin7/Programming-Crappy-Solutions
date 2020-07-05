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
Reading symbols from /host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 4/Secret Code/SecretCode...
(No debugging symbols found in /host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 4/Secret Code/SecretCode)
(gdb) (gdb) Dump of assembler code for function check:
   0x000005fd <+0>:	push   ebp
   0x000005fe <+1>:	mov    ebp,esp
   0x00000600 <+3>:	push   edi
   0x00000601 <+4>:	push   esi
   0x00000602 <+5>:	push   ebx
   0x00000603 <+6>:	sub    esp,0x4c
   0x00000606 <+9>:	call   0x7df <__x86.get_pc_thunk.ax>
   0x0000060b <+14>:	add    eax,0x19c1
   0x00000610 <+19>:	mov    DWORD PTR [ebp-0x54],eax
   0x00000613 <+22>:	mov    eax,gs:0x14
   0x00000619 <+28>:	mov    DWORD PTR [ebp-0x1c],eax
   0x0000061c <+31>:	xor    eax,eax
   0x0000061e <+33>:	mov    BYTE PTR [ebp-0x3d],0x0
   0x00000622 <+37>:	mov    DWORD PTR [ebp-0x33],0x43444443
   0x00000629 <+44>:	mov    DWORD PTR [ebp-0x2f],0x457b3032
   0x00000630 <+51>:	mov    DWORD PTR [ebp-0x2b],0x567a7135
   0x00000637 <+58>:	mov    DWORD PTR [ebp-0x27],0x7a347036
   0x0000063e <+65>:	mov    DWORD PTR [ebp-0x23],0x6b653b5a
   0x00000645 <+72>:	mov    WORD PTR [ebp-0x1f],0x7d73
   0x0000064b <+78>:	mov    BYTE PTR [ebp-0x1d],0x0
   0x0000064f <+82>:	mov    DWORD PTR [ebp-0x3c],0xdeadbeef
   0x00000656 <+89>:	mov    DWORD PTR [ebp-0x38],0xbabeface
   0x0000065d <+96>:	mov    ecx,DWORD PTR [ebp-0x3c]
   0x00000660 <+99>:	sub    ecx,DWORD PTR [ebp-0x38]
   0x00000663 <+102>:	mov    esi,ecx
   0x00000665 <+104>:	mov    edi,0x0
   0x0000066a <+109>:	mov    ecx,DWORD PTR [ebp+0x8]
   0x0000066d <+112>:	mov    ebx,0x0
   0x00000672 <+117>:	add    ecx,0x33e0f923
   0x00000678 <+123>:	adc    ebx,0xffffffff
   0x0000067b <+126>:	mov    eax,esi
   0x0000067d <+128>:	xor    eax,ecx
   0x0000067f <+130>:	mov    DWORD PTR [ebp-0x50],eax
   0x00000682 <+133>:	mov    eax,edi
   0x00000684 <+135>:	xor    eax,ebx
   0x00000686 <+137>:	mov    DWORD PTR [ebp-0x4c],eax
   0x00000689 <+140>:	mov    ebx,DWORD PTR [ebp-0x50]
   0x0000068c <+143>:	mov    esi,DWORD PTR [ebp-0x4c]
   0x0000068f <+146>:	mov    eax,ebx
   0x00000691 <+148>:	or     eax,esi
   0x00000693 <+150>:	test   eax,eax
   0x00000695 <+152>:	jne    0x6dc <check+223>
   0x00000697 <+154>:	mov    BYTE PTR [ebp-0x3d],0x0
   0x0000069b <+158>:	jmp    0x6c4 <check+199>
   0x0000069d <+160>:	movzx  eax,BYTE PTR [ebp-0x3d]
   0x000006a1 <+164>:	add    eax,0x7
   0x000006a4 <+167>:	movzx  ecx,BYTE PTR [ebp+eax*1-0x33]
   0x000006a9 <+172>:	movzx  edx,BYTE PTR [ebp-0x3d]
   0x000006ad <+176>:	movzx  eax,BYTE PTR [ebp-0x3d]
   0x000006b1 <+180>:	add    eax,0x7
   0x000006b4 <+183>:	xor    edx,ecx
   0x000006b6 <+185>:	mov    BYTE PTR [ebp+eax*1-0x33],dl
   0x000006ba <+189>:	movzx  eax,BYTE PTR [ebp-0x3d]
   0x000006be <+193>:	add    eax,0x1
   0x000006c1 <+196>:	mov    BYTE PTR [ebp-0x3d],al
   0x000006c4 <+199>:	cmp    BYTE PTR [ebp-0x3d],0xd
   0x000006c8 <+203>:	jbe    0x69d <check+160>
   0x000006ca <+205>:	sub    esp,0xc
   0x000006cd <+208>:	lea    eax,[ebp-0x33]
   0x000006d0 <+211>:	push   eax
   0x000006d1 <+212>:	mov    ebx,DWORD PTR [ebp-0x54]
   0x000006d4 <+215>:	call   0x480 <puts@plt>
   0x000006d9 <+220>:	add    esp,0x10
   0x000006dc <+223>:	nop
   0x000006dd <+224>:	mov    eax,DWORD PTR [ebp-0x1c]
   0x000006e0 <+227>:	xor    eax,DWORD PTR gs:0x14
   0x000006e7 <+234>:	je     0x6ee <check+241>
   0x000006e9 <+236>:	call   0x860 <__stack_chk_fail_local>
   0x000006ee <+241>:	lea    esp,[ebp-0xc]
   0x000006f1 <+244>:	pop    ebx
   0x000006f2 <+245>:	pop    esi
   0x000006f3 <+246>:	pop    edi
   0x000006f4 <+247>:	pop    ebp
   0x000006f5 <+248>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function check:
   0x000005fd <+0>:	push   ebp
   0x000005fe <+1>:	mov    ebp,esp
   0x00000600 <+3>:	push   edi
   0x00000601 <+4>:	push   esi
   0x00000602 <+5>:	push   ebx
   0x00000603 <+6>:	sub    esp,0x4c
   0x00000606 <+9>:	call   0x7df <__x86.get_pc_thunk.ax>
   0x0000060b <+14>:	add    eax,0x19c1
   0x00000610 <+19>:	mov    DWORD PTR [ebp-0x54],eax
   0x00000613 <+22>:	mov    eax,gs:0x14
   0x00000619 <+28>:	mov    DWORD PTR [ebp-0x1c],eax
   0x0000061c <+31>:	xor    eax,eax
   0x0000061e <+33>:	mov    BYTE PTR [ebp-0x3d],0x0
   0x00000622 <+37>:	mov    DWORD PTR [ebp-0x33],0x43444443
   0x00000629 <+44>:	mov    DWORD PTR [ebp-0x2f],0x457b3032
   0x00000630 <+51>:	mov    DWORD PTR [ebp-0x2b],0x567a7135
   0x00000637 <+58>:	mov    DWORD PTR [ebp-0x27],0x7a347036
   0x0000063e <+65>:	mov    DWORD PTR [ebp-0x23],0x6b653b5a
   0x00000645 <+72>:	mov    WORD PTR [ebp-0x1f],0x7d73
   0x0000064b <+78>:	mov    BYTE PTR [ebp-0x1d],0x0
   0x0000064f <+82>:	mov    DWORD PTR [ebp-0x3c],0xdeadbeef
   0x00000656 <+89>:	mov    DWORD PTR [ebp-0x38],0xbabeface
   0x0000065d <+96>:	mov    ecx,DWORD PTR [ebp-0x3c]
   0x00000660 <+99>:	sub    ecx,DWORD PTR [ebp-0x38]
   0x00000663 <+102>:	mov    esi,ecx
   0x00000665 <+104>:	mov    edi,0x0
   0x0000066a <+109>:	mov    ecx,DWORD PTR [ebp+0x8]
   0x0000066d <+112>:	mov    ebx,0x0
   0x00000672 <+117>:	add    ecx,0x33e0f923
   0x00000678 <+123>:	adc    ebx,0xffffffff
   0x0000067b <+126>:	mov    eax,esi
   0x0000067d <+128>:	xor    eax,ecx
   0x0000067f <+130>:	mov    DWORD PTR [ebp-0x50],eax
   0x00000682 <+133>:	mov    eax,edi
   0x00000684 <+135>:	xor    eax,ebx
   0x00000686 <+137>:	mov    DWORD PTR [ebp-0x4c],eax
   0x00000689 <+140>:	mov    ebx,DWORD PTR [ebp-0x50]
   0x0000068c <+143>:	mov    esi,DWORD PTR [ebp-0x4c]
   0x0000068f <+146>:	mov    eax,ebx
   0x00000691 <+148>:	or     eax,esi
   0x00000693 <+150>:	test   eax,eax
   0x00000695 <+152>:	jne    0x6dc <check+223>
   0x00000697 <+154>:	mov    BYTE PTR [ebp-0x3d],0x0
   0x0000069b <+158>:	jmp    0x6c4 <check+199>
   0x0000069d <+160>:	movzx  eax,BYTE PTR [ebp-0x3d]
   0x000006a1 <+164>:	add    eax,0x7
   0x000006a4 <+167>:	movzx  ecx,BYTE PTR [ebp+eax*1-0x33]
   0x000006a9 <+172>:	movzx  edx,BYTE PTR [ebp-0x3d]
   0x000006ad <+176>:	movzx  eax,BYTE PTR [ebp-0x3d]
   0x000006b1 <+180>:	add    eax,0x7
   0x000006b4 <+183>:	xor    edx,ecx
   0x000006b6 <+185>:	mov    BYTE PTR [ebp+eax*1-0x33],dl
   0x000006ba <+189>:	movzx  eax,BYTE PTR [ebp-0x3d]
   0x000006be <+193>:	add    eax,0x1
   0x000006c1 <+196>:	mov    BYTE PTR [ebp-0x3d],al
   0x000006c4 <+199>:	cmp    BYTE PTR [ebp-0x3d],0xd
   0x000006c8 <+203>:	jbe    0x69d <check+160>
   0x000006ca <+205>:	sub    esp,0xc
   0x000006cd <+208>:	lea    eax,[ebp-0x33]
   0x000006d0 <+211>:	push   eax
   0x000006d1 <+212>:	mov    ebx,DWORD PTR [ebp-0x54]
   0x000006d4 <+215>:	call   0x480 <puts@plt>
   0x000006d9 <+220>:	add    esp,0x10
   0x000006dc <+223>:	nop
   0x000006dd <+224>:	mov    eax,DWORD PTR [ebp-0x1c]
   0x000006e0 <+227>:	xor    eax,DWORD PTR gs:0x14
   0x000006e7 <+234>:	je     0x6ee <check+241>
   0x000006e9 <+236>:	call   0x860 <__stack_chk_fail_local>
   0x000006ee <+241>:	lea    esp,[ebp-0xc]
   0x000006f1 <+244>:	pop    ebx
   0x000006f2 <+245>:	pop    esi
   0x000006f3 <+246>:	pop    edi
   0x000006f4 <+247>:	pop    ebp
   0x000006f5 <+248>:	ret    
End of assembler dump.
(gdb) quit
