
/host/Documents/Stuff/Github/Programming Crappy Solutions/Cyber Security/Cyberthon 2020/Treasure Hunt/map:     file format elf64-x86-64


Disassembly of section .init:

00000000000006c0 <_init>:
 6c0:	48 83 ec 08          	sub    rsp,0x8
 6c4:	48 8b 05 1d 29 20 00 	mov    rax,QWORD PTR [rip+0x20291d]        # 202fe8 <__gmon_start__>
 6cb:	48 85 c0             	test   rax,rax
 6ce:	74 02                	je     6d2 <_init+0x12>
 6d0:	ff d0                	call   rax
 6d2:	48 83 c4 08          	add    rsp,0x8
 6d6:	c3                   	ret    

Disassembly of section .plt:

00000000000006e0 <.plt>:
 6e0:	ff 35 a2 28 20 00    	push   QWORD PTR [rip+0x2028a2]        # 202f88 <_GLOBAL_OFFSET_TABLE_+0x8>
 6e6:	ff 25 a4 28 20 00    	jmp    QWORD PTR [rip+0x2028a4]        # 202f90 <_GLOBAL_OFFSET_TABLE_+0x10>
 6ec:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]

00000000000006f0 <putchar@plt>:
 6f0:	ff 25 a2 28 20 00    	jmp    QWORD PTR [rip+0x2028a2]        # 202f98 <putchar@GLIBC_2.2.5>
 6f6:	68 00 00 00 00       	push   0x0
 6fb:	e9 e0 ff ff ff       	jmp    6e0 <.plt>

0000000000000700 <puts@plt>:
 700:	ff 25 9a 28 20 00    	jmp    QWORD PTR [rip+0x20289a]        # 202fa0 <puts@GLIBC_2.2.5>
 706:	68 01 00 00 00       	push   0x1
 70b:	e9 d0 ff ff ff       	jmp    6e0 <.plt>

0000000000000710 <strlen@plt>:
 710:	ff 25 92 28 20 00    	jmp    QWORD PTR [rip+0x202892]        # 202fa8 <strlen@GLIBC_2.2.5>
 716:	68 02 00 00 00       	push   0x2
 71b:	e9 c0 ff ff ff       	jmp    6e0 <.plt>

0000000000000720 <__stack_chk_fail@plt>:
 720:	ff 25 8a 28 20 00    	jmp    QWORD PTR [rip+0x20288a]        # 202fb0 <__stack_chk_fail@GLIBC_2.4>
 726:	68 03 00 00 00       	push   0x3
 72b:	e9 b0 ff ff ff       	jmp    6e0 <.plt>

0000000000000730 <printf@plt>:
 730:	ff 25 82 28 20 00    	jmp    QWORD PTR [rip+0x202882]        # 202fb8 <printf@GLIBC_2.2.5>
 736:	68 04 00 00 00       	push   0x4
 73b:	e9 a0 ff ff ff       	jmp    6e0 <.plt>

0000000000000740 <malloc@plt>:
 740:	ff 25 7a 28 20 00    	jmp    QWORD PTR [rip+0x20287a]        # 202fc0 <malloc@GLIBC_2.2.5>
 746:	68 05 00 00 00       	push   0x5
 74b:	e9 90 ff ff ff       	jmp    6e0 <.plt>

0000000000000750 <__isoc99_scanf@plt>:
 750:	ff 25 72 28 20 00    	jmp    QWORD PTR [rip+0x202872]        # 202fc8 <__isoc99_scanf@GLIBC_2.7>
 756:	68 06 00 00 00       	push   0x6
 75b:	e9 80 ff ff ff       	jmp    6e0 <.plt>

0000000000000760 <rand@plt>:
 760:	ff 25 6a 28 20 00    	jmp    QWORD PTR [rip+0x20286a]        # 202fd0 <rand@GLIBC_2.2.5>
 766:	68 07 00 00 00       	push   0x7
 76b:	e9 70 ff ff ff       	jmp    6e0 <.plt>

Disassembly of section .plt.got:

0000000000000770 <__cxa_finalize@plt>:
 770:	ff 25 82 28 20 00    	jmp    QWORD PTR [rip+0x202882]        # 202ff8 <__cxa_finalize@GLIBC_2.2.5>
 776:	66 90                	xchg   ax,ax

Disassembly of section .text:

0000000000000780 <_start>:
     780:	31 ed                	xor    ebp,ebp
     782:	49 89 d1             	mov    r9,rdx
     785:	5e                   	pop    rsi
     786:	48 89 e2             	mov    rdx,rsp
     789:	48 83 e4 f0          	and    rsp,0xfffffffffffffff0
     78d:	50                   	push   rax
     78e:	54                   	push   rsp
     78f:	4c 8d 05 ea 09 00 00 	lea    r8,[rip+0x9ea]        # 1180 <__libc_csu_fini>
     796:	48 8d 0d 73 09 00 00 	lea    rcx,[rip+0x973]        # 1110 <__libc_csu_init>
     79d:	48 8d 3d e6 00 00 00 	lea    rdi,[rip+0xe6]        # 88a <main>
     7a4:	ff 15 36 28 20 00    	call   QWORD PTR [rip+0x202836]        # 202fe0 <__libc_start_main@GLIBC_2.2.5>
     7aa:	f4                   	hlt    
     7ab:	0f 1f 44 00 00       	nop    DWORD PTR [rax+rax*1+0x0]

00000000000007b0 <deregister_tm_clones>:
     7b0:	48 8d 3d 59 28 20 00 	lea    rdi,[rip+0x202859]        # 203010 <__TMC_END__>
     7b7:	55                   	push   rbp
     7b8:	48 8d 05 51 28 20 00 	lea    rax,[rip+0x202851]        # 203010 <__TMC_END__>
     7bf:	48 39 f8             	cmp    rax,rdi
     7c2:	48 89 e5             	mov    rbp,rsp
     7c5:	74 19                	je     7e0 <deregister_tm_clones+0x30>
     7c7:	48 8b 05 0a 28 20 00 	mov    rax,QWORD PTR [rip+0x20280a]        # 202fd8 <_ITM_deregisterTMCloneTable>
     7ce:	48 85 c0             	test   rax,rax
     7d1:	74 0d                	je     7e0 <deregister_tm_clones+0x30>
     7d3:	5d                   	pop    rbp
     7d4:	ff e0                	jmp    rax
     7d6:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     7dd:	00 00 00 
     7e0:	5d                   	pop    rbp
     7e1:	c3                   	ret    
     7e2:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
     7e6:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     7ed:	00 00 00 

00000000000007f0 <register_tm_clones>:
     7f0:	48 8d 3d 19 28 20 00 	lea    rdi,[rip+0x202819]        # 203010 <__TMC_END__>
     7f7:	48 8d 35 12 28 20 00 	lea    rsi,[rip+0x202812]        # 203010 <__TMC_END__>
     7fe:	55                   	push   rbp
     7ff:	48 29 fe             	sub    rsi,rdi
     802:	48 89 e5             	mov    rbp,rsp
     805:	48 c1 fe 03          	sar    rsi,0x3
     809:	48 89 f0             	mov    rax,rsi
     80c:	48 c1 e8 3f          	shr    rax,0x3f
     810:	48 01 c6             	add    rsi,rax
     813:	48 d1 fe             	sar    rsi,1
     816:	74 18                	je     830 <register_tm_clones+0x40>
     818:	48 8b 05 d1 27 20 00 	mov    rax,QWORD PTR [rip+0x2027d1]        # 202ff0 <_ITM_registerTMCloneTable>
     81f:	48 85 c0             	test   rax,rax
     822:	74 0c                	je     830 <register_tm_clones+0x40>
     824:	5d                   	pop    rbp
     825:	ff e0                	jmp    rax
     827:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
     82e:	00 00 
     830:	5d                   	pop    rbp
     831:	c3                   	ret    
     832:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
     836:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
     83d:	00 00 00 

0000000000000840 <__do_global_dtors_aux>:
     840:	80 3d c9 27 20 00 00 	cmp    BYTE PTR [rip+0x2027c9],0x0        # 203010 <__TMC_END__>
     847:	75 2f                	jne    878 <__do_global_dtors_aux+0x38>
     849:	48 83 3d a7 27 20 00 	cmp    QWORD PTR [rip+0x2027a7],0x0        # 202ff8 <__cxa_finalize@GLIBC_2.2.5>
     850:	00 
     851:	55                   	push   rbp
     852:	48 89 e5             	mov    rbp,rsp
     855:	74 0c                	je     863 <__do_global_dtors_aux+0x23>
     857:	48 8b 3d aa 27 20 00 	mov    rdi,QWORD PTR [rip+0x2027aa]        # 203008 <__dso_handle>
     85e:	e8 0d ff ff ff       	call   770 <__cxa_finalize@plt>
     863:	e8 48 ff ff ff       	call   7b0 <deregister_tm_clones>
     868:	c6 05 a1 27 20 00 01 	mov    BYTE PTR [rip+0x2027a1],0x1        # 203010 <__TMC_END__>
     86f:	5d                   	pop    rbp
     870:	c3                   	ret    
     871:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
     878:	f3 c3                	repz ret 
     87a:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]

0000000000000880 <frame_dummy>:
     880:	55                   	push   rbp
     881:	48 89 e5             	mov    rbp,rsp
     884:	5d                   	pop    rbp
     885:	e9 66 ff ff ff       	jmp    7f0 <register_tm_clones>

000000000000088a <main>:
     88a:	55                   	push   rbp
     88b:	48 89 e5             	mov    rbp,rsp
     88e:	b8 00 00 00 00       	mov    eax,0x0
     893:	e8 8d 02 00 00       	call   b25 <menu>
     898:	b8 00 00 00 00       	mov    eax,0x0
     89d:	5d                   	pop    rbp
     89e:	c3                   	ret    

000000000000089f <randomise>:
     89f:	55                   	push   rbp
     8a0:	48 89 e5             	mov    rbp,rsp
     8a3:	48 83 ec 20          	sub    rsp,0x20
     8a7:	e8 b4 fe ff ff       	call   760 <rand@plt>
     8ac:	f2 0f 2a c0          	cvtsi2sd xmm0,eax
     8b0:	f2 0f 11 45 f0       	movsd  QWORD PTR [rbp-0x10],xmm0
     8b5:	e8 a6 fe ff ff       	call   760 <rand@plt>
     8ba:	f2 0f 2a c0          	cvtsi2sd xmm0,eax
     8be:	f2 0f 11 45 f8       	movsd  QWORD PTR [rbp-0x8],xmm0
     8c3:	f2 0f 10 45 f8       	movsd  xmm0,QWORD PTR [rbp-0x8]
     8c8:	48 8b 45 f0          	mov    rax,QWORD PTR [rbp-0x10]
     8cc:	66 0f 28 c8          	movapd xmm1,xmm0
     8d0:	48 89 45 e8          	mov    QWORD PTR [rbp-0x18],rax
     8d4:	f2 0f 10 45 e8       	movsd  xmm0,QWORD PTR [rbp-0x18]
     8d9:	48 8d 3d b8 08 00 00 	lea    rdi,[rip+0x8b8]        # 1198 <_IO_stdin_used+0x8>
     8e0:	b8 02 00 00 00       	mov    eax,0x2
     8e5:	e8 46 fe ff ff       	call   730 <printf@plt>
     8ea:	f2 0f 10 45 f8       	movsd  xmm0,QWORD PTR [rbp-0x8]
     8ef:	48 8b 45 f0          	mov    rax,QWORD PTR [rbp-0x10]
     8f3:	66 0f 28 c8          	movapd xmm1,xmm0
     8f7:	48 89 45 e8          	mov    QWORD PTR [rbp-0x18],rax
     8fb:	f2 0f 10 45 e8       	movsd  xmm0,QWORD PTR [rbp-0x18]
     900:	e8 4d 03 00 00       	call   c52 <locations>
     905:	90                   	nop
     906:	c9                   	leave  
     907:	c3                   	ret    

0000000000000908 <xor>:
     908:	55                   	push   rbp
     909:	48 89 e5             	mov    rbp,rsp
     90c:	48 83 ec 30          	sub    rsp,0x30
     910:	48 89 7d d8          	mov    QWORD PTR [rbp-0x28],rdi
     914:	48 89 75 d0          	mov    QWORD PTR [rbp-0x30],rsi
     918:	48 8b 45 d8          	mov    rax,QWORD PTR [rbp-0x28]
     91c:	48 89 c7             	mov    rdi,rax
     91f:	e8 ec fd ff ff       	call   710 <strlen@plt>
     924:	48 89 45 e8          	mov    QWORD PTR [rbp-0x18],rax
     928:	48 8b 45 d0          	mov    rax,QWORD PTR [rbp-0x30]
     92c:	48 89 c7             	mov    rdi,rax
     92f:	e8 dc fd ff ff       	call   710 <strlen@plt>
     934:	48 89 45 f0          	mov    QWORD PTR [rbp-0x10],rax
     938:	48 8b 45 e8          	mov    rax,QWORD PTR [rbp-0x18]
     93c:	48 83 c0 01          	add    rax,0x1
     940:	48 89 c7             	mov    rdi,rax
     943:	e8 f8 fd ff ff       	call   740 <malloc@plt>
     948:	48 89 45 f8          	mov    QWORD PTR [rbp-0x8],rax
     94c:	c7 45 e4 00 00 00 00 	mov    DWORD PTR [rbp-0x1c],0x0
     953:	eb 3f                	jmp    994 <xor+0x8c>
     955:	8b 45 e4             	mov    eax,DWORD PTR [rbp-0x1c]
     958:	48 63 d0             	movsxd rdx,eax
     95b:	48 8b 45 d8          	mov    rax,QWORD PTR [rbp-0x28]
     95f:	48 01 d0             	add    rax,rdx
     962:	0f b6 30             	movzx  esi,BYTE PTR [rax]
     965:	8b 45 e4             	mov    eax,DWORD PTR [rbp-0x1c]
     968:	48 98                	cdqe   
     96a:	ba 00 00 00 00       	mov    edx,0x0
     96f:	48 f7 75 f0          	div    QWORD PTR [rbp-0x10]
     973:	48 8b 45 d0          	mov    rax,QWORD PTR [rbp-0x30]
     977:	48 01 d0             	add    rax,rdx
     97a:	0f b6 08             	movzx  ecx,BYTE PTR [rax]
     97d:	8b 45 e4             	mov    eax,DWORD PTR [rbp-0x1c]
     980:	48 63 d0             	movsxd rdx,eax
     983:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     987:	48 01 d0             	add    rax,rdx
     98a:	31 ce                	xor    esi,ecx
     98c:	89 f2                	mov    edx,esi
     98e:	88 10                	mov    BYTE PTR [rax],dl
     990:	83 45 e4 01          	add    DWORD PTR [rbp-0x1c],0x1
     994:	8b 45 e4             	mov    eax,DWORD PTR [rbp-0x1c]
     997:	48 98                	cdqe   
     999:	48 39 45 e8          	cmp    QWORD PTR [rbp-0x18],rax
     99d:	77 b6                	ja     955 <xor+0x4d>
     99f:	48 8b 55 f8          	mov    rdx,QWORD PTR [rbp-0x8]
     9a3:	48 8b 45 e8          	mov    rax,QWORD PTR [rbp-0x18]
     9a7:	48 01 d0             	add    rax,rdx
     9aa:	c6 00 00             	mov    BYTE PTR [rax],0x0
     9ad:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     9b1:	c9                   	leave  
     9b2:	c3                   	ret    

00000000000009b3 <manual>:
     9b3:	55                   	push   rbp
     9b4:	48 89 e5             	mov    rbp,rsp
     9b7:	48 83 ec 30          	sub    rsp,0x30
     9bb:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     9c2:	00 00 
     9c4:	48 89 45 f8          	mov    QWORD PTR [rbp-0x8],rax
     9c8:	31 c0                	xor    eax,eax
     9ca:	48 8d 3d e7 07 00 00 	lea    rdi,[rip+0x7e7]        # 11b8 <_IO_stdin_used+0x28>
     9d1:	e8 2a fd ff ff       	call   700 <puts@plt>
     9d6:	48 8d 3d 13 08 00 00 	lea    rdi,[rip+0x813]        # 11f0 <_IO_stdin_used+0x60>
     9dd:	e8 1e fd ff ff       	call   700 <puts@plt>
     9e2:	48 8d 3d 37 08 00 00 	lea    rdi,[rip+0x837]        # 1220 <_IO_stdin_used+0x90>
     9e9:	e8 12 fd ff ff       	call   700 <puts@plt>
     9ee:	48 8d 3d 5b 08 00 00 	lea    rdi,[rip+0x85b]        # 1250 <_IO_stdin_used+0xc0>
     9f5:	e8 06 fd ff ff       	call   700 <puts@plt>
     9fa:	48 8d 3d 7f 08 00 00 	lea    rdi,[rip+0x87f]        # 1280 <_IO_stdin_used+0xf0>
     a01:	e8 fa fc ff ff       	call   700 <puts@plt>
     a06:	48 8d 3d 9b 08 00 00 	lea    rdi,[rip+0x89b]        # 12a8 <_IO_stdin_used+0x118>
     a0d:	e8 ee fc ff ff       	call   700 <puts@plt>
     a12:	48 8d 3d c7 08 00 00 	lea    rdi,[rip+0x8c7]        # 12e0 <_IO_stdin_used+0x150>
     a19:	e8 e2 fc ff ff       	call   700 <puts@plt>
     a1e:	48 8d 3d eb 08 00 00 	lea    rdi,[rip+0x8eb]        # 1310 <_IO_stdin_used+0x180>
     a25:	e8 d6 fc ff ff       	call   700 <puts@plt>
     a2a:	48 8d 3d 06 09 00 00 	lea    rdi,[rip+0x906]        # 1337 <_IO_stdin_used+0x1a7>
     a31:	e8 ca fc ff ff       	call   700 <puts@plt>
     a36:	bf 0a 00 00 00       	mov    edi,0xa
     a3b:	e8 b0 fc ff ff       	call   6f0 <putchar@plt>
     a40:	66 0f ef c0          	pxor   xmm0,xmm0
     a44:	f2 0f 11 45 e8       	movsd  QWORD PTR [rbp-0x18],xmm0
     a49:	66 0f ef c0          	pxor   xmm0,xmm0
     a4d:	f2 0f 11 45 f0       	movsd  QWORD PTR [rbp-0x10],xmm0
     a52:	48 8d 3d ff 08 00 00 	lea    rdi,[rip+0x8ff]        # 1358 <_IO_stdin_used+0x1c8>
     a59:	b8 00 00 00 00       	mov    eax,0x0
     a5e:	e8 cd fc ff ff       	call   730 <printf@plt>
     a63:	c7 45 e0 00 00 00 00 	mov    DWORD PTR [rbp-0x20],0x0
     a6a:	c7 45 e4 00 00 00 00 	mov    DWORD PTR [rbp-0x1c],0x0
     a71:	48 8d 45 e8          	lea    rax,[rbp-0x18]
     a75:	48 89 c6             	mov    rsi,rax
     a78:	48 8d 3d fd 08 00 00 	lea    rdi,[rip+0x8fd]        # 137c <_IO_stdin_used+0x1ec>
     a7f:	b8 00 00 00 00       	mov    eax,0x0
     a84:	e8 c7 fc ff ff       	call   750 <__isoc99_scanf@plt>
     a89:	89 45 e0             	mov    DWORD PTR [rbp-0x20],eax
     a8c:	83 7d e0 00          	cmp    DWORD PTR [rbp-0x20],0x0
     a90:	75 13                	jne    aa5 <manual+0xf2>
     a92:	48 8d 3d e7 08 00 00 	lea    rdi,[rip+0x8e7]        # 1380 <_IO_stdin_used+0x1f0>
     a99:	e8 62 fc ff ff       	call   700 <puts@plt>
     a9e:	b8 ff ff ff ff       	mov    eax,0xffffffff
     aa3:	eb 6a                	jmp    b0f <manual+0x15c>
     aa5:	48 8d 3d ec 08 00 00 	lea    rdi,[rip+0x8ec]        # 1398 <_IO_stdin_used+0x208>
     aac:	b8 00 00 00 00       	mov    eax,0x0
     ab1:	e8 7a fc ff ff       	call   730 <printf@plt>
     ab6:	48 8d 45 f0          	lea    rax,[rbp-0x10]
     aba:	48 89 c6             	mov    rsi,rax
     abd:	48 8d 3d b8 08 00 00 	lea    rdi,[rip+0x8b8]        # 137c <_IO_stdin_used+0x1ec>
     ac4:	b8 00 00 00 00       	mov    eax,0x0
     ac9:	e8 82 fc ff ff       	call   750 <__isoc99_scanf@plt>
     ace:	89 45 e4             	mov    DWORD PTR [rbp-0x1c],eax
     ad1:	83 7d e4 00          	cmp    DWORD PTR [rbp-0x1c],0x0
     ad5:	75 13                	jne    aea <manual+0x137>
     ad7:	48 8d 3d a2 08 00 00 	lea    rdi,[rip+0x8a2]        # 1380 <_IO_stdin_used+0x1f0>
     ade:	e8 1d fc ff ff       	call   700 <puts@plt>
     ae3:	b8 ff ff ff ff       	mov    eax,0xffffffff
     ae8:	eb 25                	jmp    b0f <manual+0x15c>
     aea:	bf 0a 00 00 00       	mov    edi,0xa
     aef:	e8 fc fb ff ff       	call   6f0 <putchar@plt>
     af4:	f2 0f 10 45 f0       	movsd  xmm0,QWORD PTR [rbp-0x10]
     af9:	48 8b 45 e8          	mov    rax,QWORD PTR [rbp-0x18]
     afd:	66 0f 28 c8          	movapd xmm1,xmm0
     b01:	48 89 45 d8          	mov    QWORD PTR [rbp-0x28],rax
     b05:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     b0a:	e8 43 01 00 00       	call   c52 <locations>
     b0f:	48 8b 55 f8          	mov    rdx,QWORD PTR [rbp-0x8]
     b13:	64 48 33 14 25 28 00 	xor    rdx,QWORD PTR fs:0x28
     b1a:	00 00 
     b1c:	74 05                	je     b23 <manual+0x170>
     b1e:	e8 fd fb ff ff       	call   720 <__stack_chk_fail@plt>
     b23:	c9                   	leave  
     b24:	c3                   	ret    

0000000000000b25 <menu>:
     b25:	55                   	push   rbp
     b26:	48 89 e5             	mov    rbp,rsp
     b29:	48 83 ec 10          	sub    rsp,0x10
     b2d:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
     b34:	00 00 
     b36:	48 89 45 f8          	mov    QWORD PTR [rbp-0x8],rax
     b3a:	31 c0                	xor    eax,eax
     b3c:	48 8d 3d 7d 08 00 00 	lea    rdi,[rip+0x87d]        # 13c0 <_IO_stdin_used+0x230>
     b43:	e8 b8 fb ff ff       	call   700 <puts@plt>
     b48:	48 8d 3d a9 08 00 00 	lea    rdi,[rip+0x8a9]        # 13f8 <_IO_stdin_used+0x268>
     b4f:	b8 00 00 00 00       	mov    eax,0x0
     b54:	e8 d7 fb ff ff       	call   730 <printf@plt>
     b59:	48 8d 3d d8 08 00 00 	lea    rdi,[rip+0x8d8]        # 1438 <_IO_stdin_used+0x2a8>
     b60:	e8 9b fb ff ff       	call   700 <puts@plt>
     b65:	48 8d 3d 21 09 00 00 	lea    rdi,[rip+0x921]        # 148d <_IO_stdin_used+0x2fd>
     b6c:	e8 8f fb ff ff       	call   700 <puts@plt>
     b71:	48 8d 3d 30 09 00 00 	lea    rdi,[rip+0x930]        # 14a8 <_IO_stdin_used+0x318>
     b78:	e8 83 fb ff ff       	call   700 <puts@plt>
     b7d:	48 8d 3d 46 09 00 00 	lea    rdi,[rip+0x946]        # 14ca <_IO_stdin_used+0x33a>
     b84:	e8 77 fb ff ff       	call   700 <puts@plt>
     b89:	bf 0a 00 00 00       	mov    edi,0xa
     b8e:	e8 5d fb ff ff       	call   6f0 <putchar@plt>
     b93:	c7 45 f0 ff ff ff ff 	mov    DWORD PTR [rbp-0x10],0xffffffff
     b9a:	48 8d 3d 47 09 00 00 	lea    rdi,[rip+0x947]        # 14e8 <_IO_stdin_used+0x358>
     ba1:	b8 00 00 00 00       	mov    eax,0x0
     ba6:	e8 85 fb ff ff       	call   730 <printf@plt>
     bab:	48 8d 45 f0          	lea    rax,[rbp-0x10]
     baf:	48 89 c6             	mov    rsi,rax
     bb2:	48 8d 3d 58 09 00 00 	lea    rdi,[rip+0x958]        # 1511 <_IO_stdin_used+0x381>
     bb9:	b8 00 00 00 00       	mov    eax,0x0
     bbe:	e8 8d fb ff ff       	call   750 <__isoc99_scanf@plt>
     bc3:	eb 6e                	jmp    c33 <menu+0x10e>
     bc5:	8b 45 f0             	mov    eax,DWORD PTR [rbp-0x10]
     bc8:	83 f8 01             	cmp    eax,0x1
     bcb:	75 0c                	jne    bd9 <menu+0xb4>
     bcd:	b8 00 00 00 00       	mov    eax,0x0
     bd2:	e8 c8 fc ff ff       	call   89f <randomise>
     bd7:	eb 31                	jmp    c0a <menu+0xe5>
     bd9:	8b 45 f0             	mov    eax,DWORD PTR [rbp-0x10]
     bdc:	83 f8 02             	cmp    eax,0x2
     bdf:	75 15                	jne    bf6 <menu+0xd1>
     be1:	b8 00 00 00 00       	mov    eax,0x0
     be6:	e8 c8 fd ff ff       	call   9b3 <manual>
     beb:	89 45 f4             	mov    DWORD PTR [rbp-0xc],eax
     bee:	83 7d f4 ff          	cmp    DWORD PTR [rbp-0xc],0xffffffff
     bf2:	75 16                	jne    c0a <menu+0xe5>
     bf4:	eb 45                	jmp    c3b <menu+0x116>
     bf6:	8b 45 f0             	mov    eax,DWORD PTR [rbp-0x10]
     bf9:	83 f8 09             	cmp    eax,0x9
     bfc:	75 0c                	jne    c0a <menu+0xe5>
     bfe:	48 8d 3d 0f 09 00 00 	lea    rdi,[rip+0x90f]        # 1514 <_IO_stdin_used+0x384>
     c05:	e8 f6 fa ff ff       	call   700 <puts@plt>
     c0a:	48 8d 3d d7 08 00 00 	lea    rdi,[rip+0x8d7]        # 14e8 <_IO_stdin_used+0x358>
     c11:	b8 00 00 00 00       	mov    eax,0x0
     c16:	e8 15 fb ff ff       	call   730 <printf@plt>
     c1b:	48 8d 45 f0          	lea    rax,[rbp-0x10]
     c1f:	48 89 c6             	mov    rsi,rax
     c22:	48 8d 3d e8 08 00 00 	lea    rdi,[rip+0x8e8]        # 1511 <_IO_stdin_used+0x381>
     c29:	b8 00 00 00 00       	mov    eax,0x0
     c2e:	e8 1d fb ff ff       	call   750 <__isoc99_scanf@plt>
     c33:	8b 45 f0             	mov    eax,DWORD PTR [rbp-0x10]
     c36:	83 f8 09             	cmp    eax,0x9
     c39:	75 8a                	jne    bc5 <menu+0xa0>
     c3b:	90                   	nop
     c3c:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     c40:	64 48 33 04 25 28 00 	xor    rax,QWORD PTR fs:0x28
     c47:	00 00 
     c49:	74 05                	je     c50 <menu+0x12b>
     c4b:	e8 d0 fa ff ff       	call   720 <__stack_chk_fail@plt>
     c50:	c9                   	leave  
     c51:	c3                   	ret    

0000000000000c52 <locations>:
     c52:	55                   	push   rbp
     c53:	48 89 e5             	mov    rbp,rsp
     c56:	48 83 ec 30          	sub    rsp,0x30
     c5a:	f2 0f 11 45 d8       	movsd  QWORD PTR [rbp-0x28],xmm0
     c5f:	f2 0f 11 4d d0       	movsd  QWORD PTR [rbp-0x30],xmm1
     c64:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     c69:	66 0f 2e 05 e7 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xfe7]        # 1c58 <_IO_stdin_used+0xac8>
     c70:	00 
     c71:	7a 56                	jp     cc9 <locations+0x77>
     c73:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     c78:	66 0f 2e 05 d8 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xfd8]        # 1c58 <_IO_stdin_used+0xac8>
     c7f:	00 
     c80:	75 47                	jne    cc9 <locations+0x77>
     c82:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     c87:	66 0f 2e 05 d1 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xfd1]        # 1c60 <_IO_stdin_used+0xad0>
     c8e:	00 
     c8f:	7a 38                	jp     cc9 <locations+0x77>
     c91:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     c96:	66 0f 2e 05 c2 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xfc2]        # 1c60 <_IO_stdin_used+0xad0>
     c9d:	00 
     c9e:	75 29                	jne    cc9 <locations+0x77>
     ca0:	48 8d 3d 79 08 00 00 	lea    rdi,[rip+0x879]        # 1520 <_IO_stdin_used+0x390>
     ca7:	e8 54 fa ff ff       	call   700 <puts@plt>
     cac:	48 8d 3d 9d 08 00 00 	lea    rdi,[rip+0x89d]        # 1550 <_IO_stdin_used+0x3c0>
     cb3:	e8 48 fa ff ff       	call   700 <puts@plt>
     cb8:	48 8d 3d b9 08 00 00 	lea    rdi,[rip+0x8b9]        # 1578 <_IO_stdin_used+0x3e8>
     cbf:	e8 3c fa ff ff       	call   700 <puts@plt>
     cc4:	e9 41 04 00 00       	jmp    110a <locations+0x4b8>
     cc9:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     cce:	66 0f 2e 05 92 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf92]        # 1c68 <_IO_stdin_used+0xad8>
     cd5:	00 
     cd6:	7a 56                	jp     d2e <locations+0xdc>
     cd8:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     cdd:	66 0f 2e 05 83 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf83]        # 1c68 <_IO_stdin_used+0xad8>
     ce4:	00 
     ce5:	75 47                	jne    d2e <locations+0xdc>
     ce7:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     cec:	66 0f 2e 05 7c 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf7c]        # 1c70 <_IO_stdin_used+0xae0>
     cf3:	00 
     cf4:	7a 38                	jp     d2e <locations+0xdc>
     cf6:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     cfb:	66 0f 2e 05 6d 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf6d]        # 1c70 <_IO_stdin_used+0xae0>
     d02:	00 
     d03:	75 29                	jne    d2e <locations+0xdc>
     d05:	48 8d 3d e4 08 00 00 	lea    rdi,[rip+0x8e4]        # 15f0 <_IO_stdin_used+0x460>
     d0c:	e8 ef f9 ff ff       	call   700 <puts@plt>
     d11:	48 8d 3d 00 09 00 00 	lea    rdi,[rip+0x900]        # 1618 <_IO_stdin_used+0x488>
     d18:	e8 e3 f9 ff ff       	call   700 <puts@plt>
     d1d:	48 8d 3d 34 09 00 00 	lea    rdi,[rip+0x934]        # 1658 <_IO_stdin_used+0x4c8>
     d24:	e8 d7 f9 ff ff       	call   700 <puts@plt>
     d29:	e9 dc 03 00 00       	jmp    110a <locations+0x4b8>
     d2e:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     d33:	66 0f 2e 05 3d 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf3d]        # 1c78 <_IO_stdin_used+0xae8>
     d3a:	00 
     d3b:	7a 56                	jp     d93 <locations+0x141>
     d3d:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     d42:	66 0f 2e 05 2e 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf2e]        # 1c78 <_IO_stdin_used+0xae8>
     d49:	00 
     d4a:	75 47                	jne    d93 <locations+0x141>
     d4c:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     d51:	66 0f 2e 05 27 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf27]        # 1c80 <_IO_stdin_used+0xaf0>
     d58:	00 
     d59:	7a 38                	jp     d93 <locations+0x141>
     d5b:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     d60:	66 0f 2e 05 18 0f 00 	ucomisd xmm0,QWORD PTR [rip+0xf18]        # 1c80 <_IO_stdin_used+0xaf0>
     d67:	00 
     d68:	75 29                	jne    d93 <locations+0x141>
     d6a:	48 8d 3d 12 09 00 00 	lea    rdi,[rip+0x912]        # 1683 <_IO_stdin_used+0x4f3>
     d71:	e8 8a f9 ff ff       	call   700 <puts@plt>
     d76:	48 8d 3d 23 09 00 00 	lea    rdi,[rip+0x923]        # 16a0 <_IO_stdin_used+0x510>
     d7d:	e8 7e f9 ff ff       	call   700 <puts@plt>
     d82:	48 8d 3d 47 09 00 00 	lea    rdi,[rip+0x947]        # 16d0 <_IO_stdin_used+0x540>
     d89:	e8 72 f9 ff ff       	call   700 <puts@plt>
     d8e:	e9 77 03 00 00       	jmp    110a <locations+0x4b8>
     d93:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     d98:	66 0f 2e 05 e8 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xee8]        # 1c88 <_IO_stdin_used+0xaf8>
     d9f:	00 
     da0:	7a 56                	jp     df8 <locations+0x1a6>
     da2:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     da7:	66 0f 2e 05 d9 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xed9]        # 1c88 <_IO_stdin_used+0xaf8>
     dae:	00 
     daf:	75 47                	jne    df8 <locations+0x1a6>
     db1:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     db6:	66 0f 2e 05 d2 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xed2]        # 1c90 <_IO_stdin_used+0xb00>
     dbd:	00 
     dbe:	7a 38                	jp     df8 <locations+0x1a6>
     dc0:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     dc5:	66 0f 2e 05 c3 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xec3]        # 1c90 <_IO_stdin_used+0xb00>
     dcc:	00 
     dcd:	75 29                	jne    df8 <locations+0x1a6>
     dcf:	48 8d 3d 2a 09 00 00 	lea    rdi,[rip+0x92a]        # 1700 <_IO_stdin_used+0x570>
     dd6:	e8 25 f9 ff ff       	call   700 <puts@plt>
     ddb:	48 8d 3d 56 09 00 00 	lea    rdi,[rip+0x956]        # 1738 <_IO_stdin_used+0x5a8>
     de2:	e8 19 f9 ff ff       	call   700 <puts@plt>
     de7:	48 8d 3d 7a 09 00 00 	lea    rdi,[rip+0x97a]        # 1768 <_IO_stdin_used+0x5d8>
     dee:	e8 0d f9 ff ff       	call   700 <puts@plt>
     df3:	e9 12 03 00 00       	jmp    110a <locations+0x4b8>
     df8:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     dfd:	66 0f 2e 05 93 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe93]        # 1c98 <_IO_stdin_used+0xb08>
     e04:	00 
     e05:	7a 56                	jp     e5d <locations+0x20b>
     e07:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     e0c:	66 0f 2e 05 84 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe84]        # 1c98 <_IO_stdin_used+0xb08>
     e13:	00 
     e14:	75 47                	jne    e5d <locations+0x20b>
     e16:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     e1b:	66 0f 2e 05 7d 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe7d]        # 1ca0 <_IO_stdin_used+0xb10>
     e22:	00 
     e23:	7a 38                	jp     e5d <locations+0x20b>
     e25:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     e2a:	66 0f 2e 05 6e 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe6e]        # 1ca0 <_IO_stdin_used+0xb10>
     e31:	00 
     e32:	75 29                	jne    e5d <locations+0x20b>
     e34:	48 8d 3d 64 09 00 00 	lea    rdi,[rip+0x964]        # 179f <_IO_stdin_used+0x60f>
     e3b:	e8 c0 f8 ff ff       	call   700 <puts@plt>
     e40:	48 8d 3d 79 09 00 00 	lea    rdi,[rip+0x979]        # 17c0 <_IO_stdin_used+0x630>
     e47:	e8 b4 f8 ff ff       	call   700 <puts@plt>
     e4c:	48 8d 3d 9d 09 00 00 	lea    rdi,[rip+0x99d]        # 17f0 <_IO_stdin_used+0x660>
     e53:	e8 a8 f8 ff ff       	call   700 <puts@plt>
     e58:	e9 ad 02 00 00       	jmp    110a <locations+0x4b8>
     e5d:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     e62:	66 0f 2e 05 2e 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe2e]        # 1c98 <_IO_stdin_used+0xb08>
     e69:	00 
     e6a:	0f 8a 83 00 00 00    	jp     ef3 <locations+0x2a1>
     e70:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     e75:	66 0f 2e 05 1b 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe1b]        # 1c98 <_IO_stdin_used+0xb08>
     e7c:	00 
     e7d:	75 74                	jne    ef3 <locations+0x2a1>
     e7f:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     e84:	66 0f 2e 05 1c 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe1c]        # 1ca8 <_IO_stdin_used+0xb18>
     e8b:	00 
     e8c:	7a 65                	jp     ef3 <locations+0x2a1>
     e8e:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     e93:	66 0f 2e 05 0d 0e 00 	ucomisd xmm0,QWORD PTR [rip+0xe0d]        # 1ca8 <_IO_stdin_used+0xb18>
     e9a:	00 
     e9b:	75 56                	jne    ef3 <locations+0x2a1>
     e9d:	48 8d 3d fb 08 00 00 	lea    rdi,[rip+0x8fb]        # 179f <_IO_stdin_used+0x60f>
     ea4:	e8 57 f8 ff ff       	call   700 <puts@plt>
     ea9:	48 8d 3d a0 09 00 00 	lea    rdi,[rip+0x9a0]        # 1850 <_IO_stdin_used+0x6c0>
     eb0:	e8 4b f8 ff ff       	call   700 <puts@plt>
     eb5:	48 8d 05 c1 09 00 00 	lea    rax,[rip+0x9c1]        # 187d <_IO_stdin_used+0x6ed>
     ebc:	48 89 45 e8          	mov    QWORD PTR [rbp-0x18],rax
     ec0:	48 8d 05 d4 09 00 00 	lea    rax,[rip+0x9d4]        # 189b <_IO_stdin_used+0x70b>
     ec7:	48 89 45 f0          	mov    QWORD PTR [rbp-0x10],rax
     ecb:	48 8b 55 f0          	mov    rdx,QWORD PTR [rbp-0x10]
     ecf:	48 8b 45 e8          	mov    rax,QWORD PTR [rbp-0x18]
     ed3:	48 89 d6             	mov    rsi,rdx
     ed6:	48 89 c7             	mov    rdi,rax
     ed9:	e8 2a fa ff ff       	call   908 <xor>
     ede:	48 89 45 f8          	mov    QWORD PTR [rbp-0x8],rax
     ee2:	48 8b 45 f8          	mov    rax,QWORD PTR [rbp-0x8]
     ee6:	48 89 c7             	mov    rdi,rax
     ee9:	e8 12 f8 ff ff       	call   700 <puts@plt>
     eee:	e9 17 02 00 00       	jmp    110a <locations+0x4b8>
     ef3:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     ef8:	66 0f 2e 05 b0 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xdb0]        # 1cb0 <_IO_stdin_used+0xb20>
     eff:	00 
     f00:	7a 62                	jp     f64 <locations+0x312>
     f02:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     f07:	66 0f 2e 05 a1 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xda1]        # 1cb0 <_IO_stdin_used+0xb20>
     f0e:	00 
     f0f:	75 53                	jne    f64 <locations+0x312>
     f11:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     f16:	66 0f 2e 05 9a 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xd9a]        # 1cb8 <_IO_stdin_used+0xb28>
     f1d:	00 
     f1e:	7a 44                	jp     f64 <locations+0x312>
     f20:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     f25:	66 0f 2e 05 8b 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xd8b]        # 1cb8 <_IO_stdin_used+0xb28>
     f2c:	00 
     f2d:	75 35                	jne    f64 <locations+0x312>
     f2f:	48 8d 3d 69 08 00 00 	lea    rdi,[rip+0x869]        # 179f <_IO_stdin_used+0x60f>
     f36:	e8 c5 f7 ff ff       	call   700 <puts@plt>
     f3b:	48 8d 3d 6e 09 00 00 	lea    rdi,[rip+0x96e]        # 18b0 <_IO_stdin_used+0x720>
     f42:	e8 b9 f7 ff ff       	call   700 <puts@plt>
     f47:	48 8d 3d a2 09 00 00 	lea    rdi,[rip+0x9a2]        # 18f0 <_IO_stdin_used+0x760>
     f4e:	e8 ad f7 ff ff       	call   700 <puts@plt>
     f53:	48 8d 3d c6 09 00 00 	lea    rdi,[rip+0x9c6]        # 1920 <_IO_stdin_used+0x790>
     f5a:	e8 a1 f7 ff ff       	call   700 <puts@plt>
     f5f:	e9 a6 01 00 00       	jmp    110a <locations+0x4b8>
     f64:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     f69:	66 0f 2e 05 27 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xd27]        # 1c98 <_IO_stdin_used+0xb08>
     f70:	00 
     f71:	7a 56                	jp     fc9 <locations+0x377>
     f73:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     f78:	66 0f 2e 05 18 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xd18]        # 1c98 <_IO_stdin_used+0xb08>
     f7f:	00 
     f80:	75 47                	jne    fc9 <locations+0x377>
     f82:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     f87:	66 0f 2e 05 29 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xd29]        # 1cb8 <_IO_stdin_used+0xb28>
     f8e:	00 
     f8f:	7a 38                	jp     fc9 <locations+0x377>
     f91:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     f96:	66 0f 2e 05 1a 0d 00 	ucomisd xmm0,QWORD PTR [rip+0xd1a]        # 1cb8 <_IO_stdin_used+0xb28>
     f9d:	00 
     f9e:	75 29                	jne    fc9 <locations+0x377>
     fa0:	48 8d 3d f8 07 00 00 	lea    rdi,[rip+0x7f8]        # 179f <_IO_stdin_used+0x60f>
     fa7:	e8 54 f7 ff ff       	call   700 <puts@plt>
     fac:	48 8d 3d a5 09 00 00 	lea    rdi,[rip+0x9a5]        # 1958 <_IO_stdin_used+0x7c8>
     fb3:	e8 48 f7 ff ff       	call   700 <puts@plt>
     fb8:	48 8d 3d e1 09 00 00 	lea    rdi,[rip+0x9e1]        # 19a0 <_IO_stdin_used+0x810>
     fbf:	e8 3c f7 ff ff       	call   700 <puts@plt>
     fc4:	e9 41 01 00 00       	jmp    110a <locations+0x4b8>
     fc9:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     fce:	66 0f 2e 05 ea 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xcea]        # 1cc0 <_IO_stdin_used+0xb30>
     fd5:	00 
     fd6:	7a 56                	jp     102e <locations+0x3dc>
     fd8:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
     fdd:	66 0f 2e 05 db 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xcdb]        # 1cc0 <_IO_stdin_used+0xb30>
     fe4:	00 
     fe5:	75 47                	jne    102e <locations+0x3dc>
     fe7:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     fec:	66 0f 2e 05 d4 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xcd4]        # 1cc8 <_IO_stdin_used+0xb38>
     ff3:	00 
     ff4:	7a 38                	jp     102e <locations+0x3dc>
     ff6:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
     ffb:	66 0f 2e 05 c5 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xcc5]        # 1cc8 <_IO_stdin_used+0xb38>
    1002:	00 
    1003:	75 29                	jne    102e <locations+0x3dc>
    1005:	48 8d 3d dc 09 00 00 	lea    rdi,[rip+0x9dc]        # 19e8 <_IO_stdin_used+0x858>
    100c:	e8 ef f6 ff ff       	call   700 <puts@plt>
    1011:	48 8d 3d 28 0a 00 00 	lea    rdi,[rip+0xa28]        # 1a40 <_IO_stdin_used+0x8b0>
    1018:	e8 e3 f6 ff ff       	call   700 <puts@plt>
    101d:	48 8d 3d 4c 0a 00 00 	lea    rdi,[rip+0xa4c]        # 1a70 <_IO_stdin_used+0x8e0>
    1024:	e8 d7 f6 ff ff       	call   700 <puts@plt>
    1029:	e9 dc 00 00 00       	jmp    110a <locations+0x4b8>
    102e:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
    1033:	66 0f 2e 05 95 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc95]        # 1cd0 <_IO_stdin_used+0xb40>
    103a:	00 
    103b:	7a 53                	jp     1090 <locations+0x43e>
    103d:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
    1042:	66 0f 2e 05 86 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc86]        # 1cd0 <_IO_stdin_used+0xb40>
    1049:	00 
    104a:	75 44                	jne    1090 <locations+0x43e>
    104c:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
    1051:	66 0f 2e 05 7f 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc7f]        # 1cd8 <_IO_stdin_used+0xb48>
    1058:	00 
    1059:	7a 35                	jp     1090 <locations+0x43e>
    105b:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
    1060:	66 0f 2e 05 70 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc70]        # 1cd8 <_IO_stdin_used+0xb48>
    1067:	00 
    1068:	75 26                	jne    1090 <locations+0x43e>
    106a:	48 8d 3d 27 0a 00 00 	lea    rdi,[rip+0xa27]        # 1a98 <_IO_stdin_used+0x908>
    1071:	e8 8a f6 ff ff       	call   700 <puts@plt>
    1076:	48 8d 3d 43 0a 00 00 	lea    rdi,[rip+0xa43]        # 1ac0 <_IO_stdin_used+0x930>
    107d:	e8 7e f6 ff ff       	call   700 <puts@plt>
    1082:	48 8d 3d 5f 0a 00 00 	lea    rdi,[rip+0xa5f]        # 1ae8 <_IO_stdin_used+0x958>
    1089:	e8 72 f6 ff ff       	call   700 <puts@plt>
    108e:	eb 7a                	jmp    110a <locations+0x4b8>
    1090:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
    1095:	66 0f 2e 05 43 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc43]        # 1ce0 <_IO_stdin_used+0xb50>
    109c:	00 
    109d:	7a 53                	jp     10f2 <locations+0x4a0>
    109f:	f2 0f 10 45 d8       	movsd  xmm0,QWORD PTR [rbp-0x28]
    10a4:	66 0f 2e 05 34 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc34]        # 1ce0 <_IO_stdin_used+0xb50>
    10ab:	00 
    10ac:	75 44                	jne    10f2 <locations+0x4a0>
    10ae:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
    10b3:	66 0f 2e 05 2d 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc2d]        # 1ce8 <_IO_stdin_used+0xb58>
    10ba:	00 
    10bb:	7a 35                	jp     10f2 <locations+0x4a0>
    10bd:	f2 0f 10 45 d0       	movsd  xmm0,QWORD PTR [rbp-0x30]
    10c2:	66 0f 2e 05 1e 0c 00 	ucomisd xmm0,QWORD PTR [rip+0xc1e]        # 1ce8 <_IO_stdin_used+0xb58>
    10c9:	00 
    10ca:	75 26                	jne    10f2 <locations+0x4a0>
    10cc:	48 8d 3d c5 0a 00 00 	lea    rdi,[rip+0xac5]        # 1b98 <_IO_stdin_used+0xa08>
    10d3:	e8 28 f6 ff ff       	call   700 <puts@plt>
    10d8:	48 8d 3d e1 0a 00 00 	lea    rdi,[rip+0xae1]        # 1bc0 <_IO_stdin_used+0xa30>
    10df:	e8 1c f6 ff ff       	call   700 <puts@plt>
    10e4:	48 8d 3d fd 0a 00 00 	lea    rdi,[rip+0xafd]        # 1be8 <_IO_stdin_used+0xa58>
    10eb:	e8 10 f6 ff ff       	call   700 <puts@plt>
    10f0:	eb 18                	jmp    110a <locations+0x4b8>
    10f2:	48 8d 3d 1f 0b 00 00 	lea    rdi,[rip+0xb1f]        # 1c18 <_IO_stdin_used+0xa88>
    10f9:	e8 02 f6 ff ff       	call   700 <puts@plt>
    10fe:	48 8d 3d 38 0b 00 00 	lea    rdi,[rip+0xb38]        # 1c3d <_IO_stdin_used+0xaad>
    1105:	e8 f6 f5 ff ff       	call   700 <puts@plt>
    110a:	90                   	nop
    110b:	c9                   	leave  
    110c:	c3                   	ret    
    110d:	0f 1f 00             	nop    DWORD PTR [rax]

0000000000001110 <__libc_csu_init>:
    1110:	41 57                	push   r15
    1112:	41 56                	push   r14
    1114:	49 89 d7             	mov    r15,rdx
    1117:	41 55                	push   r13
    1119:	41 54                	push   r12
    111b:	4c 8d 25 5e 1c 20 00 	lea    r12,[rip+0x201c5e]        # 202d80 <__frame_dummy_init_array_entry>
    1122:	55                   	push   rbp
    1123:	48 8d 2d 5e 1c 20 00 	lea    rbp,[rip+0x201c5e]        # 202d88 <__init_array_end>
    112a:	53                   	push   rbx
    112b:	41 89 fd             	mov    r13d,edi
    112e:	49 89 f6             	mov    r14,rsi
    1131:	4c 29 e5             	sub    rbp,r12
    1134:	48 83 ec 08          	sub    rsp,0x8
    1138:	48 c1 fd 03          	sar    rbp,0x3
    113c:	e8 7f f5 ff ff       	call   6c0 <_init>
    1141:	48 85 ed             	test   rbp,rbp
    1144:	74 20                	je     1166 <__libc_csu_init+0x56>
    1146:	31 db                	xor    ebx,ebx
    1148:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
    114f:	00 
    1150:	4c 89 fa             	mov    rdx,r15
    1153:	4c 89 f6             	mov    rsi,r14
    1156:	44 89 ef             	mov    edi,r13d
    1159:	41 ff 14 dc          	call   QWORD PTR [r12+rbx*8]
    115d:	48 83 c3 01          	add    rbx,0x1
    1161:	48 39 dd             	cmp    rbp,rbx
    1164:	75 ea                	jne    1150 <__libc_csu_init+0x40>
    1166:	48 83 c4 08          	add    rsp,0x8
    116a:	5b                   	pop    rbx
    116b:	5d                   	pop    rbp
    116c:	41 5c                	pop    r12
    116e:	41 5d                	pop    r13
    1170:	41 5e                	pop    r14
    1172:	41 5f                	pop    r15
    1174:	c3                   	ret    
    1175:	90                   	nop
    1176:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
    117d:	00 00 00 

0000000000001180 <__libc_csu_fini>:
    1180:	f3 c3                	repz ret 

Disassembly of section .fini:

0000000000001184 <_fini>:
    1184:	48 83 ec 08          	sub    rsp,0x8
    1188:	48 83 c4 08          	add    rsp,0x8
    118c:	c3                   	ret    
