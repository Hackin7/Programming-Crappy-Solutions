
/host/Documents/Stuff/Github/Programming Crappy Solutions/Cyber Security/Cyberthon 2020/Reverse Faze/reverse_faze:     file format elf64-x86-64


Disassembly of section .init:

00000000000008b8 <.init>:
 8b8:	48 83 ec 08          	sub    rsp,0x8
 8bc:	48 8b 05 25 17 20 00 	mov    rax,QWORD PTR [rip+0x201725]        # 201fe8 <__cxa_finalize@plt+0x201638>
 8c3:	48 85 c0             	test   rax,rax
 8c6:	74 02                	je     8ca <puts@plt-0x16>
 8c8:	ff d0                	call   rax
 8ca:	48 83 c4 08          	add    rsp,0x8
 8ce:	c3                   	ret    

Disassembly of section .plt:

00000000000008d0 <puts@plt-0x10>:
 8d0:	ff 35 8a 16 20 00    	push   QWORD PTR [rip+0x20168a]        # 201f60 <__cxa_finalize@plt+0x2015b0>
 8d6:	ff 25 8c 16 20 00    	jmp    QWORD PTR [rip+0x20168c]        # 201f68 <__cxa_finalize@plt+0x2015b8>
 8dc:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]

00000000000008e0 <puts@plt>:
 8e0:	ff 25 8a 16 20 00    	jmp    QWORD PTR [rip+0x20168a]        # 201f70 <__cxa_finalize@plt+0x2015c0>
 8e6:	68 00 00 00 00       	push   0x0
 8eb:	e9 e0 ff ff ff       	jmp    8d0 <puts@plt-0x10>

00000000000008f0 <regfree@plt>:
 8f0:	ff 25 82 16 20 00    	jmp    QWORD PTR [rip+0x201682]        # 201f78 <__cxa_finalize@plt+0x2015c8>
 8f6:	68 01 00 00 00       	push   0x1
 8fb:	e9 d0 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000900 <__stack_chk_fail@plt>:
 900:	ff 25 7a 16 20 00    	jmp    QWORD PTR [rip+0x20167a]        # 201f80 <__cxa_finalize@plt+0x2015d0>
 906:	68 02 00 00 00       	push   0x2
 90b:	e9 c0 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000910 <system@plt>:
 910:	ff 25 72 16 20 00    	jmp    QWORD PTR [rip+0x201672]        # 201f88 <__cxa_finalize@plt+0x2015d8>
 916:	68 03 00 00 00       	push   0x3
 91b:	e9 b0 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000920 <regcomp@plt>:
 920:	ff 25 6a 16 20 00    	jmp    QWORD PTR [rip+0x20166a]        # 201f90 <__cxa_finalize@plt+0x2015e0>
 926:	68 04 00 00 00       	push   0x4
 92b:	e9 a0 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000930 <fgets@plt>:
 930:	ff 25 62 16 20 00    	jmp    QWORD PTR [rip+0x201662]        # 201f98 <__cxa_finalize@plt+0x2015e8>
 936:	68 05 00 00 00       	push   0x5
 93b:	e9 90 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000940 <__isoc99_sscanf@plt>:
 940:	ff 25 5a 16 20 00    	jmp    QWORD PTR [rip+0x20165a]        # 201fa0 <__cxa_finalize@plt+0x2015f0>
 946:	68 06 00 00 00       	push   0x6
 94b:	e9 80 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000950 <regexec@plt>:
 950:	ff 25 52 16 20 00    	jmp    QWORD PTR [rip+0x201652]        # 201fa8 <__cxa_finalize@plt+0x2015f8>
 956:	68 07 00 00 00       	push   0x7
 95b:	e9 70 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000960 <__strncpy_chk@plt>:
 960:	ff 25 4a 16 20 00    	jmp    QWORD PTR [rip+0x20164a]        # 201fb0 <__cxa_finalize@plt+0x201600>
 966:	68 08 00 00 00       	push   0x8
 96b:	e9 60 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000970 <__printf_chk@plt>:
 970:	ff 25 42 16 20 00    	jmp    QWORD PTR [rip+0x201642]        # 201fb8 <__cxa_finalize@plt+0x201608>
 976:	68 09 00 00 00       	push   0x9
 97b:	e9 50 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000980 <exit@plt>:
 980:	ff 25 3a 16 20 00    	jmp    QWORD PTR [rip+0x20163a]        # 201fc0 <__cxa_finalize@plt+0x201610>
 986:	68 0a 00 00 00       	push   0xa
 98b:	e9 40 ff ff ff       	jmp    8d0 <puts@plt-0x10>

0000000000000990 <fwrite@plt>:
 990:	ff 25 32 16 20 00    	jmp    QWORD PTR [rip+0x201632]        # 201fc8 <__cxa_finalize@plt+0x201618>
 996:	68 0b 00 00 00       	push   0xb
 99b:	e9 30 ff ff ff       	jmp    8d0 <puts@plt-0x10>

00000000000009a0 <__sprintf_chk@plt>:
 9a0:	ff 25 2a 16 20 00    	jmp    QWORD PTR [rip+0x20162a]        # 201fd0 <__cxa_finalize@plt+0x201620>
 9a6:	68 0c 00 00 00       	push   0xc
 9ab:	e9 20 ff ff ff       	jmp    8d0 <puts@plt-0x10>

Disassembly of section .plt.got:

00000000000009b0 <__cxa_finalize@plt>:
 9b0:	ff 25 42 16 20 00    	jmp    QWORD PTR [rip+0x201642]        # 201ff8 <__cxa_finalize@plt+0x201648>
 9b6:	66 90                	xchg   ax,ax

Disassembly of section .text:

00000000000009c0 <.text>:
     9c0:	31 ed                	xor    ebp,ebp
     9c2:	49 89 d1             	mov    r9,rdx
     9c5:	5e                   	pop    rsi
     9c6:	48 89 e2             	mov    rdx,rsp
     9c9:	48 83 e4 f0          	and    rsp,0xfffffffffffffff0
     9cd:	50                   	push   rax
     9ce:	54                   	push   rsp
     9cf:	4c 8d 05 2a 06 00 00 	lea    r8,[rip+0x62a]        # 1000 <__cxa_finalize@plt+0x650>
     9d6:	48 8d 0d b3 05 00 00 	lea    rcx,[rip+0x5b3]        # f90 <__cxa_finalize@plt+0x5e0>
     9dd:	48 8d 3d 91 04 00 00 	lea    rdi,[rip+0x491]        # e75 <__cxa_finalize@plt+0x4c5>
     9e4:	ff 15 f6 15 20 00    	call   QWORD PTR [rip+0x2015f6]        # 201fe0 <__cxa_finalize@plt+0x201630>
     9ea:	f4                   	hlt    
     9eb:	0f 1f 44 00 00       	nop    DWORD PTR [rax+rax*1+0x0]
     9f0:	48 8d 3d 19 20 20 00 	lea    rdi,[rip+0x202019]        # 202a10 <__cxa_finalize@plt+0x202060>
     9f7:	55                   	push   rbp
     9f8:	48 8d 05 11 20 20 00 	lea    rax,[rip+0x202011]        # 202a10 <__cxa_finalize@plt+0x202060>
     9ff:	48 39 f8             	cmp    rax,rdi
     a02:	48 89 e5             	mov    rbp,rsp
     a05:	74 19                	je     a20 <__cxa_finalize@plt+0x70>
     a07:	48 8b 05 ca 15 20 00 	mov    rax,QWORD PTR [rip+0x2015ca]        # 201fd8 <__cxa_finalize@plt+0x201628>
     a0e:	48 85 c0             	test   rax,rax
     a11:	74 0d                	je     a20 <__cxa_finalize@plt+0x70>
     a13:	5d                   	pop    rbp
     a14:	ff e0                	jmp    rax
     a16:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     a1d:	00 00 00 
     a20:	5d                   	pop    rbp
     a21:	c3                   	ret    
     a22:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
     a26:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     a2d:	00 00 00 
     a30:	48 8d 3d d9 1f 20 00 	lea    rdi,[rip+0x201fd9]        # 202a10 <__cxa_finalize@plt+0x202060>
     a37:	48 8d 35 d2 1f 20 00 	lea    rsi,[rip+0x201fd2]        # 202a10 <__cxa_finalize@plt+0x202060>
     a3e:	55                   	push   rbp
     a3f:	48 29 fe             	sub    rsi,rdi
     a42:	48 89 e5             	mov    rbp,rsp
     a45:	48 c1 fe 03          	sar    rsi,0x3
     a49:	48 89 f0             	mov    rax,rsi
     a4c:	48 c1 e8 3f          	shr    rax,0x3f
     a50:	48 01 c6             	add    rsi,rax
     a53:	48 d1 fe             	sar    rsi,1
     a56:	74 18                	je     a70 <__cxa_finalize@plt+0xc0>
     a58:	48 8b 05 91 15 20 00 	mov    rax,QWORD PTR [rip+0x201591]        # 201ff0 <__cxa_finalize@plt+0x201640>
     a5f:	48 85 c0             	test   rax,rax
     a62:	74 0c                	je     a70 <__cxa_finalize@plt+0xc0>
     a64:	5d                   	pop    rbp
     a65:	ff e0                	jmp    rax
     a67:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
     a6e:	00 00 
     a70:	5d                   	pop    rbp
     a71:	c3                   	ret    
     a72:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
     a76:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     a7d:	00 00 00 
     a80:	80 3d c1 1f 20 00 00 	cmp    BYTE PTR [rip+0x201fc1],0x0        # 202a48 <stderr@@GLIBC_2.2.5+0x8>
     a87:	75 2f                	jne    ab8 <__cxa_finalize@plt+0x108>
     a89:	48 83 3d 67 15 20 00 	cmp    QWORD PTR [rip+0x201567],0x0        # 201ff8 <__cxa_finalize@plt+0x201648>
     a90:	00 
     a91:	55                   	push   rbp
     a92:	48 89 e5             	mov    rbp,rsp
     a95:	74 0c                	je     aa3 <__cxa_finalize@plt+0xf3>
     a97:	48 8b 3d 6a 15 20 00 	mov    rdi,QWORD PTR [rip+0x20156a]        # 202008 <__cxa_finalize@plt+0x201658>
     a9e:	e8 0d ff ff ff       	call   9b0 <__cxa_finalize@plt>
     aa3:	e8 48 ff ff ff       	call   9f0 <__cxa_finalize@plt+0x40>
     aa8:	c6 05 99 1f 20 00 01 	mov    BYTE PTR [rip+0x201f99],0x1        # 202a48 <stderr@@GLIBC_2.2.5+0x8>
     aaf:	5d                   	pop    rbp
     ab0:	c3                   	ret    
     ab1:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
     ab8:	f3 c3                	repz ret 
     aba:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]
     ac0:	55                   	push   rbp
     ac1:	48 89 e5             	mov    rbp,rsp
     ac4:	5d                   	pop    rbp
     ac5:	e9 66 ff ff ff       	jmp    a30 <__cxa_finalize@plt+0x80>
     aca:	53                   	push   rbx
     acb:	48 83 ec 70          	sub    rsp,0x70
     acf:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     ad6:	00 00 
     ad8:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     add:	31 c0                	xor    eax,eax
     adf:	48 8d 35 2e 05 00 00 	lea    rsi,[rip+0x52e]        # 1014 <__cxa_finalize@plt+0x664>
     ae6:	bf 01 00 00 00       	mov    edi,0x1
     aeb:	e8 80 fe ff ff       	call   970 <__printf_chk@plt>
     af0:	48 8b 15 29 1f 20 00 	mov    rdx,QWORD PTR [rip+0x201f29]        # 202a20 <stdin@@GLIBC_2.2.5>
     af7:	be 64 00 00 00       	mov    esi,0x64
     afc:	48 8d 3d bd 1f 20 00 	lea    rdi,[rip+0x201fbd]        # 202ac0 <stderr@@GLIBC_2.2.5+0x80>
     b03:	e8 28 fe ff ff       	call   930 <fgets@plt>
     b08:	48 89 e3             	mov    rbx,rsp
     b0b:	48 89 da             	mov    rdx,rbx
     b0e:	48 8d 35 16 05 00 00 	lea    rsi,[rip+0x516]        # 102b <__cxa_finalize@plt+0x67b>
     b15:	48 8d 3d a4 1f 20 00 	lea    rdi,[rip+0x201fa4]        # 202ac0 <stderr@@GLIBC_2.2.5+0x80>
     b1c:	b8 00 00 00 00       	mov    eax,0x0
     b21:	e8 1a fe ff ff       	call   940 <__isoc99_sscanf@plt>
     b26:	48 c7 c1 ff ff ff ff 	mov    rcx,0xffffffffffffffff
     b2d:	b8 00 00 00 00       	mov    eax,0x0
     b32:	48 89 df             	mov    rdi,rbx
     b35:	f2 ae                	repnz scas al,BYTE PTR es:[rdi]
     b37:	48 89 cb             	mov    rbx,rcx
     b3a:	48 f7 d3             	not    rbx
     b3d:	c6 44 1c ff 00       	mov    BYTE PTR [rsp+rbx*1-0x1],0x0
     b42:	0f bf 05 9b 1e 20 00 	movsx  eax,WORD PTR [rip+0x201e9b]        # 2029e4 <__cxa_finalize@plt+0x202034>
     b49:	0f be 0c 24          	movsx  ecx,BYTE PTR [rsp]
     b4d:	8d 90 4f ff ff ff    	lea    edx,[rax-0xb1]
     b53:	41 ba 00 00 00 00    	mov    r10d,0x0
     b59:	39 d1                	cmp    ecx,edx
     b5b:	74 1d                	je     b7a <__cxa_finalize@plt+0x1ca>
     b5d:	ba 00 00 00 00       	mov    edx,0x0
     b62:	48 89 e6             	mov    rsi,rsp
     b65:	49 c7 c0 ff ff ff ff 	mov    r8,0xffffffffffffffff
     b6c:	b8 00 00 00 00       	mov    eax,0x0
     b71:	4c 8d 0d 78 1e 20 00 	lea    r9,[rip+0x201e78]        # 2029f0 <__cxa_finalize@plt+0x202040>
     b78:	eb 46                	jmp    bc0 <__cxa_finalize@plt+0x210>
     b7a:	80 7c 24 04 25       	cmp    BYTE PTR [rsp+0x4],0x25
     b7f:	75 dc                	jne    b5d <__cxa_finalize@plt+0x1ad>
     b81:	80 7c 24 05 00       	cmp    BYTE PTR [rsp+0x5],0x0
     b86:	75 d5                	jne    b5d <__cxa_finalize@plt+0x1ad>
     b88:	0f be 4c 24 03       	movsx  ecx,BYTE PTR [rsp+0x3]
     b8d:	8d 90 4b ff ff ff    	lea    edx,[rax-0xb5]
     b93:	39 d1                	cmp    ecx,edx
     b95:	75 c6                	jne    b5d <__cxa_finalize@plt+0x1ad>
     b97:	80 7c 24 01 36       	cmp    BYTE PTR [rsp+0x1],0x36
     b9c:	75 bf                	jne    b5d <__cxa_finalize@plt+0x1ad>
     b9e:	0f be 54 24 02       	movsx  edx,BYTE PTR [rsp+0x2]
     ba3:	2d dc 00 00 00       	sub    eax,0xdc
     ba8:	39 c2                	cmp    edx,eax
     baa:	41 0f 94 c2          	sete   r10b
     bae:	45 0f b6 d2          	movzx  r10d,r10b
     bb2:	eb a9                	jmp    b5d <__cxa_finalize@plt+0x1ad>
     bb4:	0f b6 0c 32          	movzx  ecx,BYTE PTR [rdx+rsi*1]
     bb8:	41 88 0c 11          	mov    BYTE PTR [r9+rdx*1],cl
     bbc:	48 83 c2 01          	add    rdx,0x1
     bc0:	4c 89 c1             	mov    rcx,r8
     bc3:	48 89 f7             	mov    rdi,rsi
     bc6:	f2 ae                	repnz scas al,BYTE PTR es:[rdi]
     bc8:	48 f7 d1             	not    rcx
     bcb:	48 83 e9 01          	sub    rcx,0x1
     bcf:	48 39 d1             	cmp    rcx,rdx
     bd2:	77 e0                	ja     bb4 <__cxa_finalize@plt+0x204>
     bd4:	41 0f bf c2          	movsx  eax,r10w
     bd8:	48 8b 5c 24 68       	mov    rbx,QWORD PTR [rsp+0x68]
     bdd:	64 48 33 1c 25 28 00 	xor    rbx,QWORD PTR fs:0x28
     be4:	00 00 
     be6:	75 06                	jne    bee <__cxa_finalize@plt+0x23e>
     be8:	48 83 c4 70          	add    rsp,0x70
     bec:	5b                   	pop    rbx
     bed:	c3                   	ret    
     bee:	e8 0d fd ff ff       	call   900 <__stack_chk_fail@plt>
     bf3:	53                   	push   rbx
     bf4:	48 83 ec 70          	sub    rsp,0x70
     bf8:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     bff:	00 00 
     c01:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     c06:	31 c0                	xor    eax,eax
     c08:	48 8d 35 1f 04 00 00 	lea    rsi,[rip+0x41f]        # 102e <__cxa_finalize@plt+0x67e>
     c0f:	bf 01 00 00 00       	mov    edi,0x1
     c14:	e8 57 fd ff ff       	call   970 <__printf_chk@plt>
     c19:	48 8b 15 00 1e 20 00 	mov    rdx,QWORD PTR [rip+0x201e00]        # 202a20 <stdin@@GLIBC_2.2.5>
     c20:	be 64 00 00 00       	mov    esi,0x64
     c25:	48 8d 3d 94 1e 20 00 	lea    rdi,[rip+0x201e94]        # 202ac0 <stderr@@GLIBC_2.2.5+0x80>
     c2c:	e8 ff fc ff ff       	call   930 <fgets@plt>
     c31:	48 89 e3             	mov    rbx,rsp
     c34:	48 89 da             	mov    rdx,rbx
     c37:	48 8d 35 ed 03 00 00 	lea    rsi,[rip+0x3ed]        # 102b <__cxa_finalize@plt+0x67b>
     c3e:	48 8d 3d 7b 1e 20 00 	lea    rdi,[rip+0x201e7b]        # 202ac0 <stderr@@GLIBC_2.2.5+0x80>
     c45:	b8 00 00 00 00       	mov    eax,0x0
     c4a:	e8 f1 fc ff ff       	call   940 <__isoc99_sscanf@plt>
     c4f:	48 c7 c2 ff ff ff ff 	mov    rdx,0xffffffffffffffff
     c56:	b8 00 00 00 00       	mov    eax,0x0
     c5b:	48 89 d1             	mov    rcx,rdx
     c5e:	48 89 df             	mov    rdi,rbx
     c61:	f2 ae                	repnz scas al,BYTE PTR es:[rdi]
     c63:	48 f7 d1             	not    rcx
     c66:	c6 44 0c ff 00       	mov    BYTE PTR [rsp+rcx*1-0x1],0x0
     c6b:	48 89 d1             	mov    rcx,rdx
     c6e:	48 89 df             	mov    rdi,rbx
     c71:	f2 ae                	repnz scas al,BYTE PTR es:[rdi]
     c73:	48 89 c8             	mov    rax,rcx
     c76:	48 f7 d0             	not    rax
     c79:	48 01 c2             	add    rdx,rax
     c7c:	48 89 d9             	mov    rcx,rbx
     c7f:	48 8d 3c 13          	lea    rdi,[rbx+rdx*1]
     c83:	bb 00 00 00 00       	mov    ebx,0x0
     c88:	eb 09                	jmp    c93 <__cxa_finalize@plt+0x2e3>
     c8a:	0f be 01             	movsx  eax,BYTE PTR [rcx]
     c8d:	01 c3                	add    ebx,eax
     c8f:	48 83 c1 01          	add    rcx,0x1
     c93:	48 39 f9             	cmp    rcx,rdi
     c96:	75 f2                	jne    c8a <__cxa_finalize@plt+0x2da>
     c98:	48 63 c3             	movsxd rax,ebx
     c9b:	48 8d 04 80          	lea    rax,[rax+rax*4]
     c9f:	48 8d 0c 80          	lea    rcx,[rax+rax*4]
     ca3:	48 8d 05 76 13 20 00 	lea    rax,[rip+0x201376]        # 202020 <__cxa_finalize@plt+0x201670>
     caa:	48 8d 34 48          	lea    rsi,[rax+rcx*2]
     cae:	b9 0b 00 00 00       	mov    ecx,0xb
     cb3:	48 8d 3d 3b 1d 20 00 	lea    rdi,[rip+0x201d3b]        # 2029f5 <__cxa_finalize@plt+0x202045>
     cba:	e8 a1 fc ff ff       	call   960 <__strncpy_chk@plt>
     cbf:	8d 43 17             	lea    eax,[rbx+0x17]
     cc2:	48 8b 74 24 68       	mov    rsi,QWORD PTR [rsp+0x68]
     cc7:	64 48 33 34 25 28 00 	xor    rsi,QWORD PTR fs:0x28
     cce:	00 00 
     cd0:	75 06                	jne    cd8 <__cxa_finalize@plt+0x328>
     cd2:	48 83 c4 70          	add    rsp,0x70
     cd6:	5b                   	pop    rbx
     cd7:	c3                   	ret    
     cd8:	e8 23 fc ff ff       	call   900 <__stack_chk_fail@plt>
     cdd:	48 83 ec 28          	sub    rsp,0x28
     ce1:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     ce8:	00 00 
     cea:	48 89 44 24 18       	mov    QWORD PTR [rsp+0x18],rax
     cef:	31 c0                	xor    eax,eax
     cf1:	48 8d 35 4d 03 00 00 	lea    rsi,[rip+0x34d]        # 1045 <__cxa_finalize@plt+0x695>
     cf8:	bf 01 00 00 00       	mov    edi,0x1
     cfd:	e8 6e fc ff ff       	call   970 <__printf_chk@plt>
     d02:	48 8b 15 17 1d 20 00 	mov    rdx,QWORD PTR [rip+0x201d17]        # 202a20 <stdin@@GLIBC_2.2.5>
     d09:	be 64 00 00 00       	mov    esi,0x64
     d0e:	48 8d 3d ab 1d 20 00 	lea    rdi,[rip+0x201dab]        # 202ac0 <stderr@@GLIBC_2.2.5+0x80>
     d15:	e8 16 fc ff ff       	call   930 <fgets@plt>
     d1a:	48 8d 4c 24 0c       	lea    rcx,[rsp+0xc]
     d1f:	48 8d 54 24 08       	lea    rdx,[rsp+0x8]
     d24:	4c 8d 4c 24 14       	lea    r9,[rsp+0x14]
     d29:	4c 8d 44 24 10       	lea    r8,[rsp+0x10]
     d2e:	48 8d 35 27 03 00 00 	lea    rsi,[rip+0x327]        # 105c <__cxa_finalize@plt+0x6ac>
     d35:	48 8d 3d 84 1d 20 00 	lea    rdi,[rip+0x201d84]        # 202ac0 <stderr@@GLIBC_2.2.5+0x80>
     d3c:	b8 00 00 00 00       	mov    eax,0x0
     d41:	e8 fa fb ff ff       	call   940 <__isoc99_sscanf@plt>
     d46:	8b 44 24 08          	mov    eax,DWORD PTR [rsp+0x8]
     d4a:	8d 04 80             	lea    eax,[rax+rax*4]
     d4d:	01 c0                	add    eax,eax
     d4f:	89 44 24 08          	mov    DWORD PTR [rsp+0x8],eax
     d53:	8b 54 24 10          	mov    edx,DWORD PTR [rsp+0x10]
     d57:	8d 0c 92             	lea    ecx,[rdx+rdx*4]
     d5a:	01 c9                	add    ecx,ecx
     d5c:	89 4c 24 10          	mov    DWORD PTR [rsp+0x10],ecx
     d60:	03 44 24 0c          	add    eax,DWORD PTR [rsp+0xc]
     d64:	89 c2                	mov    edx,eax
     d66:	b8 00 00 00 00       	mov    eax,0x0
     d6b:	83 fa 0d             	cmp    edx,0xd
     d6e:	74 15                	je     d85 <__cxa_finalize@plt+0x3d5>
     d70:	48 8b 7c 24 18       	mov    rdi,QWORD PTR [rsp+0x18]
     d75:	64 48 33 3c 25 28 00 	xor    rdi,QWORD PTR fs:0x28
     d7c:	00 00 
     d7e:	75 43                	jne    dc3 <__cxa_finalize@plt+0x413>
     d80:	48 83 c4 28          	add    rsp,0x28
     d84:	c3                   	ret    
     d85:	03 4c 24 14          	add    ecx,DWORD PTR [rsp+0x14]
     d89:	83 f9 25             	cmp    ecx,0x25
     d8c:	75 e2                	jne    d70 <__cxa_finalize@plt+0x3c0>
     d8e:	48 8d 35 c5 19 20 00 	lea    rsi,[rip+0x2019c5]        # 20275a <__cxa_finalize@plt+0x201daa>
     d95:	48 c7 c1 ff ff ff ff 	mov    rcx,0xffffffffffffffff
     d9c:	48 89 f7             	mov    rdi,rsi
     d9f:	f2 ae                	repnz scas al,BYTE PTR es:[rdi]
     da1:	48 89 ca             	mov    rdx,rcx
     da4:	48 f7 d2             	not    rdx
     da7:	48 8d 52 ff          	lea    rdx,[rdx-0x1]
     dab:	b9 06 00 00 00       	mov    ecx,0x6
     db0:	48 8d 3d 43 1c 20 00 	lea    rdi,[rip+0x201c43]        # 2029fa <__cxa_finalize@plt+0x20204a>
     db7:	e8 a4 fb ff ff       	call   960 <__strncpy_chk@plt>
     dbc:	b8 01 00 00 00       	mov    eax,0x1
     dc1:	eb ad                	jmp    d70 <__cxa_finalize@plt+0x3c0>
     dc3:	e8 38 fb ff ff       	call   900 <__stack_chk_fail@plt>
     dc8:	48 83 ec 08          	sub    rsp,0x8
     dcc:	48 8b 17             	mov    rdx,QWORD PTR [rdi]
     dcf:	48 8d 35 c2 02 00 00 	lea    rsi,[rip+0x2c2]        # 1098 <__cxa_finalize@plt+0x6e8>
     dd6:	bf 01 00 00 00       	mov    edi,0x1
     ddb:	b8 00 00 00 00       	mov    eax,0x0
     de0:	e8 8b fb ff ff       	call   970 <__printf_chk@plt>
     de5:	48 83 c4 08          	add    rsp,0x8
     de9:	c3                   	ret    
     dea:	53                   	push   rbx
     deb:	48 89 fb             	mov    rbx,rdi
     dee:	ba 00 00 00 00       	mov    edx,0x0
     df3:	48 8b 35 06 1c 20 00 	mov    rsi,QWORD PTR [rip+0x201c06]        # 202a00 <__cxa_finalize@plt+0x202050>
     dfa:	48 8d 3d 5f 1c 20 00 	lea    rdi,[rip+0x201c5f]        # 202a60 <stderr@@GLIBC_2.2.5+0x20>
     e01:	e8 1a fb ff ff       	call   920 <regcomp@plt>
     e06:	89 05 94 1c 20 00    	mov    DWORD PTR [rip+0x201c94],eax        # 202aa0 <stderr@@GLIBC_2.2.5+0x60>
     e0c:	85 c0                	test   eax,eax
     e0e:	75 3e                	jne    e4e <__cxa_finalize@plt+0x49e>
     e10:	48 8b 73 08          	mov    rsi,QWORD PTR [rbx+0x8]
     e14:	41 b8 00 00 00 00    	mov    r8d,0x0
     e1a:	b9 00 00 00 00       	mov    ecx,0x0
     e1f:	ba 00 00 00 00       	mov    edx,0x0
     e24:	48 8d 3d 35 1c 20 00 	lea    rdi,[rip+0x201c35]        # 202a60 <stderr@@GLIBC_2.2.5+0x20>
     e2b:	e8 20 fb ff ff       	call   950 <regexec@plt>
     e30:	89 c3                	mov    ebx,eax
     e32:	89 05 68 1c 20 00    	mov    DWORD PTR [rip+0x201c68],eax        # 202aa0 <stderr@@GLIBC_2.2.5+0x60>
     e38:	48 8d 3d 21 1c 20 00 	lea    rdi,[rip+0x201c21]        # 202a60 <stderr@@GLIBC_2.2.5+0x20>
     e3f:	e8 ac fa ff ff       	call   8f0 <regfree@plt>
     e44:	85 db                	test   ebx,ebx
     e46:	0f 95 c0             	setne  al
     e49:	0f b6 c0             	movzx  eax,al
     e4c:	5b                   	pop    rbx
     e4d:	c3                   	ret    
     e4e:	48 8b 0d eb 1b 20 00 	mov    rcx,QWORD PTR [rip+0x201beb]        # 202a40 <stderr@@GLIBC_2.2.5>
     e55:	ba 18 00 00 00       	mov    edx,0x18
     e5a:	be 01 00 00 00       	mov    esi,0x1
     e5f:	48 8d 3d 02 02 00 00 	lea    rdi,[rip+0x202]        # 1068 <__cxa_finalize@plt+0x6b8>
     e66:	e8 25 fb ff ff       	call   990 <fwrite@plt>
     e6b:	bf 01 00 00 00       	mov    edi,0x1
     e70:	e8 0b fb ff ff       	call   980 <exit@plt>
     e75:	55                   	push   rbp
     e76:	53                   	push   rbx
     e77:	48 83 ec 78          	sub    rsp,0x78
     e7b:	48 89 f3             	mov    rbx,rsi
     e7e:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     e85:	00 00 
     e87:	48 89 44 24 68       	mov    QWORD PTR [rsp+0x68],rax
     e8c:	31 c0                	xor    eax,eax
     e8e:	83 ff 02             	cmp    edi,0x2
     e91:	74 28                	je     ebb <__cxa_finalize@plt+0x50b>
     e93:	48 89 df             	mov    rdi,rbx
     e96:	e8 2d ff ff ff       	call   dc8 <__cxa_finalize@plt+0x418>
     e9b:	b8 00 00 00 00       	mov    eax,0x0
     ea0:	48 8b 4c 24 68       	mov    rcx,QWORD PTR [rsp+0x68]
     ea5:	64 48 33 0c 25 28 00 	xor    rcx,QWORD PTR fs:0x28
     eac:	00 00 
     eae:	0f 85 d3 00 00 00    	jne    f87 <__cxa_finalize@plt+0x5d7>
     eb4:	48 83 c4 78          	add    rsp,0x78
     eb8:	5b                   	pop    rbx
     eb9:	5d                   	pop    rbp
     eba:	c3                   	ret    
     ebb:	48 89 f7             	mov    rdi,rsi
     ebe:	e8 27 ff ff ff       	call   dea <__cxa_finalize@plt+0x43a>
     ec3:	85 c0                	test   eax,eax
     ec5:	75 cc                	jne    e93 <__cxa_finalize@plt+0x4e3>
     ec7:	b8 00 00 00 00       	mov    eax,0x0
     ecc:	e8 f9 fb ff ff       	call   aca <__cxa_finalize@plt+0x11a>
     ed1:	85 c0                	test   eax,eax
     ed3:	74 0f                	je     ee4 <__cxa_finalize@plt+0x534>
     ed5:	b8 00 00 00 00       	mov    eax,0x0
     eda:	e8 14 fd ff ff       	call   bf3 <__cxa_finalize@plt+0x243>
     edf:	83 f8 2a             	cmp    eax,0x2a
     ee2:	74 0e                	je     ef2 <__cxa_finalize@plt+0x542>
     ee4:	48 8d 3d bd 02 00 00 	lea    rdi,[rip+0x2bd]        # 11a8 <__cxa_finalize@plt+0x7f8>
     eeb:	e8 f0 f9 ff ff       	call   8e0 <puts@plt>
     ef0:	eb a9                	jmp    e9b <__cxa_finalize@plt+0x4eb>
     ef2:	b8 00 00 00 00       	mov    eax,0x0
     ef7:	e8 e1 fd ff ff       	call   cdd <__cxa_finalize@plt+0x32d>
     efc:	83 f8 01             	cmp    eax,0x1
     eff:	75 e3                	jne    ee4 <__cxa_finalize@plt+0x534>
     f01:	48 89 e5             	mov    rbp,rsp
     f04:	48 8b 7b 08          	mov    rdi,QWORD PTR [rbx+0x8]
     f08:	48 89 ea             	mov    rdx,rbp
     f0b:	48 8d 35 19 01 00 00 	lea    rsi,[rip+0x119]        # 102b <__cxa_finalize@plt+0x67b>
     f12:	b8 00 00 00 00       	mov    eax,0x0
     f17:	e8 24 fa ff ff       	call   940 <__isoc99_sscanf@plt>
     f1c:	4c 8b 0d e5 1a 20 00 	mov    r9,QWORD PTR [rip+0x201ae5]        # 202a08 <__cxa_finalize@plt+0x202058>
     f23:	41 51                	push   r9
     f25:	55                   	push   rbp
     f26:	4c 8d 05 c3 1a 20 00 	lea    r8,[rip+0x201ac3]        # 2029f0 <__cxa_finalize@plt+0x202040>
     f2d:	48 8d 0d fc 01 00 00 	lea    rcx,[rip+0x1fc]        # 1130 <__cxa_finalize@plt+0x780>
     f34:	48 c7 c2 ff ff ff ff 	mov    rdx,0xffffffffffffffff
     f3b:	be 01 00 00 00       	mov    esi,0x1
     f40:	bb 00 00 00 00       	mov    ebx,0x0
     f45:	48 89 df             	mov    rdi,rbx
     f48:	b8 00 00 00 00       	mov    eax,0x0
     f4d:	e8 4e fa ff ff       	call   9a0 <__sprintf_chk@plt>
     f52:	48 8d 3d 34 01 00 00 	lea    rdi,[rip+0x134]        # 108d <__cxa_finalize@plt+0x6dd>
     f59:	e8 82 f9 ff ff       	call   8e0 <puts@plt>
     f5e:	48 89 df             	mov    rdi,rbx
     f61:	e8 aa f9 ff ff       	call   910 <system@plt>
     f66:	89 c2                	mov    edx,eax
     f68:	48 8d 35 12 01 00 00 	lea    rsi,[rip+0x112]        # 1081 <__cxa_finalize@plt+0x6d1>
     f6f:	bf 01 00 00 00       	mov    edi,0x1
     f74:	b8 00 00 00 00       	mov    eax,0x0
     f79:	e8 f2 f9 ff ff       	call   970 <__printf_chk@plt>
     f7e:	48 83 c4 10          	add    rsp,0x10
     f82:	e9 14 ff ff ff       	jmp    e9b <__cxa_finalize@plt+0x4eb>
     f87:	e8 74 f9 ff ff       	call   900 <__stack_chk_fail@plt>
     f8c:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
     f90:	41 57                	push   r15
     f92:	41 56                	push   r14
     f94:	49 89 d7             	mov    r15,rdx
     f97:	41 55                	push   r13
     f99:	41 54                	push   r12
     f9b:	4c 8d 25 b6 0d 20 00 	lea    r12,[rip+0x200db6]        # 201d58 <__cxa_finalize@plt+0x2013a8>
     fa2:	55                   	push   rbp
     fa3:	48 8d 2d b6 0d 20 00 	lea    rbp,[rip+0x200db6]        # 201d60 <__cxa_finalize@plt+0x2013b0>
     faa:	53                   	push   rbx
     fab:	41 89 fd             	mov    r13d,edi
     fae:	49 89 f6             	mov    r14,rsi
     fb1:	4c 29 e5             	sub    rbp,r12
     fb4:	48 83 ec 08          	sub    rsp,0x8
     fb8:	48 c1 fd 03          	sar    rbp,0x3
     fbc:	e8 f7 f8 ff ff       	call   8b8 <puts@plt-0x28>
     fc1:	48 85 ed             	test   rbp,rbp
     fc4:	74 20                	je     fe6 <__cxa_finalize@plt+0x636>
     fc6:	31 db                	xor    ebx,ebx
     fc8:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
     fcf:	00 
     fd0:	4c 89 fa             	mov    rdx,r15
     fd3:	4c 89 f6             	mov    rsi,r14
     fd6:	44 89 ef             	mov    edi,r13d
     fd9:	41 ff 14 dc          	call   QWORD PTR [r12+rbx*8]
     fdd:	48 83 c3 01          	add    rbx,0x1
     fe1:	48 39 dd             	cmp    rbp,rbx
     fe4:	75 ea                	jne    fd0 <__cxa_finalize@plt+0x620>
     fe6:	48 83 c4 08          	add    rsp,0x8
     fea:	5b                   	pop    rbx
     feb:	5d                   	pop    rbp
     fec:	41 5c                	pop    r12
     fee:	41 5d                	pop    r13
     ff0:	41 5e                	pop    r14
     ff2:	41 5f                	pop    r15
     ff4:	c3                   	ret    
     ff5:	90                   	nop
     ff6:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     ffd:	00 00 00 
    1000:	f3 c3                	repz ret 

Disassembly of section .fini:

0000000000001004 <.fini>:
    1004:	48 83 ec 08          	sub    rsp,0x8
    1008:	48 83 c4 08          	add    rsp,0x8
    100c:	c3                   	ret    
