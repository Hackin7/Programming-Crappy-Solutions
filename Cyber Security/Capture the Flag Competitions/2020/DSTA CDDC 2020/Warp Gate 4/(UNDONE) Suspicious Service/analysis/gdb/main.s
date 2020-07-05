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
Reading symbols from /host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 4/Suspicious Service/SuspiciousSvc...
(No debugging symbols found in /host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 4/Suspicious Service/SuspiciousSvc)
(gdb) (gdb) Dump of assembler code for function main:
   0x0000120d <+0>:	endbr32 
   0x00001211 <+4>:	push   ebp
   0x00001212 <+5>:	mov    ebp,esp
   0x00001214 <+7>:	push   ebx
   0x00001215 <+8>:	sub    esp,0x104
   0x0000121b <+14>:	call   0x1110 <__x86.get_pc_thunk.bx>
   0x00001220 <+19>:	add    ebx,0x2da4
   0x00001226 <+25>:	mov    eax,DWORD PTR [ebx+0x2c]
   0x0000122c <+31>:	mov    eax,DWORD PTR [eax]
   0x0000122e <+33>:	push   0x0
   0x00001230 <+35>:	push   eax
   0x00001231 <+36>:	call   0x1090 <setbuf@plt>
   0x00001236 <+41>:	add    esp,0x8
   0x00001239 <+44>:	mov    eax,DWORD PTR [ebx+0x30]
   0x0000123f <+50>:	mov    eax,DWORD PTR [eax]
   0x00001241 <+52>:	push   0x0
   0x00001243 <+54>:	push   eax
   0x00001244 <+55>:	call   0x1090 <setbuf@plt>
   0x00001249 <+60>:	add    esp,0x8
   0x0000124c <+63>:	mov    eax,DWORD PTR [ebx+0x20]
   0x00001252 <+69>:	mov    eax,DWORD PTR [eax]
   0x00001254 <+71>:	push   0x0
   0x00001256 <+73>:	push   eax
   0x00001257 <+74>:	call   0x1090 <setbuf@plt>
   0x0000125c <+79>:	add    esp,0x8
   0x0000125f <+82>:	mov    DWORD PTR [ebp-0x8],0x12345678
   0x00001266 <+89>:	lea    eax,[ebp-0x108]
   0x0000126c <+95>:	push   eax
   0x0000126d <+96>:	call   0x10a0 <gets@plt>
   0x00001272 <+101>:	add    esp,0x4
   0x00001275 <+104>:	cmp    DWORD PTR [ebp-0x8],0x1343d00
   0x0000127c <+111>:	jne    0x128d <main+128>
   0x0000127e <+113>:	lea    eax,[ebx-0x1fbc]
   0x00001284 <+119>:	push   eax
   0x00001285 <+120>:	call   0x10b0 <system@plt>
   0x0000128a <+125>:	add    esp,0x4
   0x0000128d <+128>:	mov    eax,0x0
   0x00001292 <+133>:	mov    ebx,DWORD PTR [ebp-0x4]
   0x00001295 <+136>:	leave  
   0x00001296 <+137>:	ret    
End of assembler dump.
(gdb) Dump of assembler code for function main:
   0x0000120d <+0>:	endbr32 
   0x00001211 <+4>:	push   ebp
   0x00001212 <+5>:	mov    ebp,esp
   0x00001214 <+7>:	push   ebx
   0x00001215 <+8>:	sub    esp,0x104
   0x0000121b <+14>:	call   0x1110 <__x86.get_pc_thunk.bx>
   0x00001220 <+19>:	add    ebx,0x2da4
   0x00001226 <+25>:	mov    eax,DWORD PTR [ebx+0x2c]
   0x0000122c <+31>:	mov    eax,DWORD PTR [eax]
   0x0000122e <+33>:	push   0x0
   0x00001230 <+35>:	push   eax
   0x00001231 <+36>:	call   0x1090 <setbuf@plt>
   0x00001236 <+41>:	add    esp,0x8
   0x00001239 <+44>:	mov    eax,DWORD PTR [ebx+0x30]
   0x0000123f <+50>:	mov    eax,DWORD PTR [eax]
   0x00001241 <+52>:	push   0x0
   0x00001243 <+54>:	push   eax
   0x00001244 <+55>:	call   0x1090 <setbuf@plt>
   0x00001249 <+60>:	add    esp,0x8
   0x0000124c <+63>:	mov    eax,DWORD PTR [ebx+0x20]
   0x00001252 <+69>:	mov    eax,DWORD PTR [eax]
   0x00001254 <+71>:	push   0x0
   0x00001256 <+73>:	push   eax
   0x00001257 <+74>:	call   0x1090 <setbuf@plt>
   0x0000125c <+79>:	add    esp,0x8
   0x0000125f <+82>:	mov    DWORD PTR [ebp-0x8],0x12345678
   0x00001266 <+89>:	lea    eax,[ebp-0x108]
   0x0000126c <+95>:	push   eax
   0x0000126d <+96>:	call   0x10a0 <gets@plt>
   0x00001272 <+101>:	add    esp,0x4
   0x00001275 <+104>:	cmp    DWORD PTR [ebp-0x8],0x1343d00
   0x0000127c <+111>:	jne    0x128d <main+128>
   0x0000127e <+113>:	lea    eax,[ebx-0x1fbc]
   0x00001284 <+119>:	push   eax
   0x00001285 <+120>:	call   0x10b0 <system@plt>
   0x0000128a <+125>:	add    esp,0x4
   0x0000128d <+128>:	mov    eax,0x0
   0x00001292 <+133>:	mov    ebx,DWORD PTR [ebp-0x4]
   0x00001295 <+136>:	leave  
   0x00001296 <+137>:	ret    
End of assembler dump.
(gdb) quit
