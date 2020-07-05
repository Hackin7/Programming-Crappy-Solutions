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
(gdb) (gdb) Dump of assembler code for function main:
   0x000006f6 <+0>:	lea    ecx,[esp+0x4]
   0x000006fa <+4>:	and    esp,0xfffffff0
   0x000006fd <+7>:	push   DWORD PTR [ecx-0x4]
   0x00000700 <+10>:	push   ebp
   0x00000701 <+11>:	mov    ebp,esp
   0x00000703 <+13>:	push   ebx
   0x00000704 <+14>:	push   ecx
   0x00000705 <+15>:	sub    esp,0x10
   0x00000708 <+18>:	call   0x500 <__x86.get_pc_thunk.bx>
   0x0000070d <+23>:	add    ebx,0x18bf
   0x00000713 <+29>:	mov    eax,gs:0x14
   0x00000719 <+35>:	mov    DWORD PTR [ebp-0xc],eax
   0x0000071c <+38>:	xor    eax,eax
   0x0000071e <+40>:	mov    DWORD PTR [ebp-0x10],0x0
   0x00000725 <+47>:	sub    esp,0xc
   0x00000728 <+50>:	lea    eax,[ebx-0x173c]
   0x0000072e <+56>:	push   eax
   0x0000072f <+57>:	call   0x480 <puts@plt>
   0x00000734 <+62>:	add    esp,0x10
   0x00000737 <+65>:	sub    esp,0xc
   0x0000073a <+68>:	lea    eax,[ebx-0x16fc]
   0x00000740 <+74>:	push   eax
   0x00000741 <+75>:	call   0x480 <puts@plt>
   0x00000746 <+80>:	add    esp,0x10
   0x00000749 <+83>:	sub    esp,0xc
   0x0000074c <+86>:	lea    eax,[ebx-0x16bc]
   0x00000752 <+92>:	push   eax
   0x00000753 <+93>:	call   0x480 <puts@plt>
   0x00000758 <+98>:	add    esp,0x10
   0x0000075b <+101>:	sub    esp,0xc
   0x0000075e <+104>:	lea    eax,[ebx-0x167c]
   0x00000764 <+110>:	push   eax
   0x00000765 <+111>:	call   0x480 <puts@plt>
   0x0000076a <+116>:	add    esp,0x10
   0x0000076d <+119>:	sub    esp,0xc
   0x00000770 <+122>:	lea    eax,[ebx-0x163c]
   0x00000776 <+128>:	push   eax
   0x00000777 <+129>:	call   0x460 <printf@plt>
   0x0000077c <+134>:	add    esp,0x10
   0x0000077f <+137>:	sub    esp,0x8
   0x00000782 <+140>:	lea    eax,[ebp-0x10]
   0x00000785 <+143>:	push   eax
   0x00000786 <+144>:	lea    eax,[ebx-0x161a]
   0x0000078c <+150>:	push   eax
   0x0000078d <+151>:	call   0x4a0 <__isoc99_scanf@plt>
   0x00000792 <+156>:	add    esp,0x10
   0x00000795 <+159>:	mov    eax,DWORD PTR [ebp-0x10]
   0x00000798 <+162>:	cmp    eax,0xf00dcafe
   0x0000079d <+167>:	jne    0x7b0 <main+186>
   0x0000079f <+169>:	mov    eax,DWORD PTR [ebp-0x10]
   0x000007a2 <+172>:	sub    esp,0xc
   0x000007a5 <+175>:	push   eax
   0x000007a6 <+176>:	call   0x5fd <check>
   0x000007ab <+181>:	add    esp,0x10
   0x000007ae <+184>:	jmp    0x7bf <main+201>
   0x000007b0 <+186>:	mov    eax,DWORD PTR [ebp-0x10]
   0x000007b3 <+189>:	sub    esp,0xc
   0x000007b6 <+192>:	push   eax
   0x000007b7 <+193>:	call   0x5fd <check>
   0x000007bc <+198>:	add    esp,0x10
   0x000007bf <+201>:	mov    eax,0x0
   0x000007c4 <+206>:	mov    edx,DWORD PTR [ebp-0xc]
   0x000007c7 <+209>:	xor    edx,DWORD PTR gs:0x14
   0x000007ce <+216>:	je     0x7d5 <main+223>
   0x000007d0 <+218>:	call   0x860 <__stack_chk_fail_local>
   0x000007d5 <+223>:	lea    esp,[ebp-0x8]
   0x000007d8 <+226>:	pop    ecx
   0x000007d9 <+227>:	pop    ebx
   0x000007da <+228>:	pop    ebp
   0x000007db <+229>:	lea    esp,[ecx-0x4]
   0x000007de <+232>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function main:
   0x000006f6 <+0>:	lea    ecx,[esp+0x4]
   0x000006fa <+4>:	and    esp,0xfffffff0
   0x000006fd <+7>:	push   DWORD PTR [ecx-0x4]
   0x00000700 <+10>:	push   ebp
   0x00000701 <+11>:	mov    ebp,esp
   0x00000703 <+13>:	push   ebx
   0x00000704 <+14>:	push   ecx
   0x00000705 <+15>:	sub    esp,0x10
   0x00000708 <+18>:	call   0x500 <__x86.get_pc_thunk.bx>
   0x0000070d <+23>:	add    ebx,0x18bf
   0x00000713 <+29>:	mov    eax,gs:0x14
   0x00000719 <+35>:	mov    DWORD PTR [ebp-0xc],eax
   0x0000071c <+38>:	xor    eax,eax
   0x0000071e <+40>:	mov    DWORD PTR [ebp-0x10],0x0
   0x00000725 <+47>:	sub    esp,0xc
   0x00000728 <+50>:	lea    eax,[ebx-0x173c]
   0x0000072e <+56>:	push   eax
   0x0000072f <+57>:	call   0x480 <puts@plt>
   0x00000734 <+62>:	add    esp,0x10
   0x00000737 <+65>:	sub    esp,0xc
   0x0000073a <+68>:	lea    eax,[ebx-0x16fc]
   0x00000740 <+74>:	push   eax
   0x00000741 <+75>:	call   0x480 <puts@plt>
   0x00000746 <+80>:	add    esp,0x10
   0x00000749 <+83>:	sub    esp,0xc
   0x0000074c <+86>:	lea    eax,[ebx-0x16bc]
   0x00000752 <+92>:	push   eax
   0x00000753 <+93>:	call   0x480 <puts@plt>
   0x00000758 <+98>:	add    esp,0x10
   0x0000075b <+101>:	sub    esp,0xc
   0x0000075e <+104>:	lea    eax,[ebx-0x167c]
   0x00000764 <+110>:	push   eax
   0x00000765 <+111>:	call   0x480 <puts@plt>
   0x0000076a <+116>:	add    esp,0x10
   0x0000076d <+119>:	sub    esp,0xc
   0x00000770 <+122>:	lea    eax,[ebx-0x163c]
   0x00000776 <+128>:	push   eax
   0x00000777 <+129>:	call   0x460 <printf@plt>
   0x0000077c <+134>:	add    esp,0x10
   0x0000077f <+137>:	sub    esp,0x8
   0x00000782 <+140>:	lea    eax,[ebp-0x10]
   0x00000785 <+143>:	push   eax
   0x00000786 <+144>:	lea    eax,[ebx-0x161a]
   0x0000078c <+150>:	push   eax
   0x0000078d <+151>:	call   0x4a0 <__isoc99_scanf@plt>
   0x00000792 <+156>:	add    esp,0x10
   0x00000795 <+159>:	mov    eax,DWORD PTR [ebp-0x10]
   0x00000798 <+162>:	cmp    eax,0xf00dcafe
   0x0000079d <+167>:	jne    0x7b0 <main+186>
   0x0000079f <+169>:	mov    eax,DWORD PTR [ebp-0x10]
   0x000007a2 <+172>:	sub    esp,0xc
   0x000007a5 <+175>:	push   eax
   0x000007a6 <+176>:	call   0x5fd <check>
   0x000007ab <+181>:	add    esp,0x10
   0x000007ae <+184>:	jmp    0x7bf <main+201>
   0x000007b0 <+186>:	mov    eax,DWORD PTR [ebp-0x10]
   0x000007b3 <+189>:	sub    esp,0xc
   0x000007b6 <+192>:	push   eax
   0x000007b7 <+193>:	call   0x5fd <check>
   0x000007bc <+198>:	add    esp,0x10
   0x000007bf <+201>:	mov    eax,0x0
   0x000007c4 <+206>:	mov    edx,DWORD PTR [ebp-0xc]
   0x000007c7 <+209>:	xor    edx,DWORD PTR gs:0x14
   0x000007ce <+216>:	je     0x7d5 <main+223>
   0x000007d0 <+218>:	call   0x860 <__stack_chk_fail_local>
   0x000007d5 <+223>:	lea    esp,[ebp-0x8]
   0x000007d8 <+226>:	pop    ecx
   0x000007d9 <+227>:	pop    ebx
   0x000007da <+228>:	pop    ebp
   0x000007db <+229>:	lea    esp,[ecx-0x4]
   0x000007de <+232>:	ret    
End of assembler dump.
(gdb) quit
