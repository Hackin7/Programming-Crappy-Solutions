
/host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 5/[Misc-2] ARGH/myprog:     file format elf64-x86-64


Disassembly of section .init:

00000000000005f0 <_init>:
 5f0:	48 83 ec 08          	sub    rsp,0x8
 5f4:	48 8b 05 ed 09 20 00 	mov    rax,QWORD PTR [rip+0x2009ed]        # 200fe8 <__gmon_start__>
 5fb:	48 85 c0             	test   rax,rax
 5fe:	74 02                	je     602 <_init+0x12>
 600:	ff d0                	call   rax
 602:	48 83 c4 08          	add    rsp,0x8
 606:	c3                   	ret    

Disassembly of section .plt:

0000000000000610 <.plt>:
 610:	ff 35 8a 09 20 00    	push   QWORD PTR [rip+0x20098a]        # 200fa0 <_GLOBAL_OFFSET_TABLE_+0x8>
 616:	ff 25 8c 09 20 00    	jmp    QWORD PTR [rip+0x20098c]        # 200fa8 <_GLOBAL_OFFSET_TABLE_+0x10>
 61c:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]

0000000000000620 <strcpy@plt>:
 620:	ff 25 8a 09 20 00    	jmp    QWORD PTR [rip+0x20098a]        # 200fb0 <strcpy@GLIBC_2.2.5>
 626:	68 00 00 00 00       	push   0x0
 62b:	e9 e0 ff ff ff       	jmp    610 <.plt>

0000000000000630 <puts@plt>:
 630:	ff 25 82 09 20 00    	jmp    QWORD PTR [rip+0x200982]        # 200fb8 <puts@GLIBC_2.2.5>
 636:	68 01 00 00 00       	push   0x1
 63b:	e9 d0 ff ff ff       	jmp    610 <.plt>

0000000000000640 <strlen@plt>:
 640:	ff 25 7a 09 20 00    	jmp    QWORD PTR [rip+0x20097a]        # 200fc0 <strlen@GLIBC_2.2.5>
 646:	68 02 00 00 00       	push   0x2
 64b:	e9 c0 ff ff ff       	jmp    610 <.plt>

0000000000000650 <__stack_chk_fail@plt>:
 650:	ff 25 72 09 20 00    	jmp    QWORD PTR [rip+0x200972]        # 200fc8 <__stack_chk_fail@GLIBC_2.4>
 656:	68 03 00 00 00       	push   0x3
 65b:	e9 b0 ff ff ff       	jmp    610 <.plt>

0000000000000660 <printf@plt>:
 660:	ff 25 6a 09 20 00    	jmp    QWORD PTR [rip+0x20096a]        # 200fd0 <printf@GLIBC_2.2.5>
 666:	68 04 00 00 00       	push   0x4
 66b:	e9 a0 ff ff ff       	jmp    610 <.plt>

Disassembly of section .plt.got:

0000000000000670 <__cxa_finalize@plt>:
 670:	ff 25 82 09 20 00    	jmp    QWORD PTR [rip+0x200982]        # 200ff8 <__cxa_finalize@GLIBC_2.2.5>
 676:	66 90                	xchg   ax,ax

Disassembly of section .text:

0000000000000680 <_start>:
 680:	31 ed                	xor    ebp,ebp
 682:	49 89 d1             	mov    r9,rdx
 685:	5e                   	pop    rsi
 686:	48 89 e2             	mov    rdx,rsp
 689:	48 83 e4 f0          	and    rsp,0xfffffffffffffff0
 68d:	50                   	push   rax
 68e:	54                   	push   rsp
 68f:	4c 8d 05 0a 03 00 00 	lea    r8,[rip+0x30a]        # 9a0 <__libc_csu_fini>
 696:	48 8d 0d 93 02 00 00 	lea    rcx,[rip+0x293]        # 930 <__libc_csu_init>
 69d:	48 8d 3d e6 00 00 00 	lea    rdi,[rip+0xe6]        # 78a <main>
 6a4:	ff 15 36 09 20 00    	call   QWORD PTR [rip+0x200936]        # 200fe0 <__libc_start_main@GLIBC_2.2.5>
 6aa:	f4                   	hlt    
 6ab:	0f 1f 44 00 00       	nop    DWORD PTR [rax+rax*1+0x0]

00000000000006b0 <deregister_tm_clones>:
 6b0:	48 8d 3d 59 09 20 00 	lea    rdi,[rip+0x200959]        # 201010 <__TMC_END__>
 6b7:	55                   	push   rbp
 6b8:	48 8d 05 51 09 20 00 	lea    rax,[rip+0x200951]        # 201010 <__TMC_END__>
 6bf:	48 39 f8             	cmp    rax,rdi
 6c2:	48 89 e5             	mov    rbp,rsp
 6c5:	74 19                	je     6e0 <deregister_tm_clones+0x30>
 6c7:	48 8b 05 0a 09 20 00 	mov    rax,QWORD PTR [rip+0x20090a]        # 200fd8 <_ITM_deregisterTMCloneTable>
 6ce:	48 85 c0             	test   rax,rax
 6d1:	74 0d                	je     6e0 <deregister_tm_clones+0x30>
 6d3:	5d                   	pop    rbp
 6d4:	ff e0                	jmp    rax
 6d6:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
 6dd:	00 00 00 
 6e0:	5d                   	pop    rbp
 6e1:	c3                   	ret    
 6e2:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
 6e6:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
 6ed:	00 00 00 

00000000000006f0 <register_tm_clones>:
 6f0:	48 8d 3d 19 09 20 00 	lea    rdi,[rip+0x200919]        # 201010 <__TMC_END__>
 6f7:	48 8d 35 12 09 20 00 	lea    rsi,[rip+0x200912]        # 201010 <__TMC_END__>
 6fe:	55                   	push   rbp
 6ff:	48 29 fe             	sub    rsi,rdi
 702:	48 89 e5             	mov    rbp,rsp
 705:	48 c1 fe 03          	sar    rsi,0x3
 709:	48 89 f0             	mov    rax,rsi
 70c:	48 c1 e8 3f          	shr    rax,0x3f
 710:	48 01 c6             	add    rsi,rax
 713:	48 d1 fe             	sar    rsi,1
 716:	74 18                	je     730 <register_tm_clones+0x40>
 718:	48 8b 05 d1 08 20 00 	mov    rax,QWORD PTR [rip+0x2008d1]        # 200ff0 <_ITM_registerTMCloneTable>
 71f:	48 85 c0             	test   rax,rax
 722:	74 0c                	je     730 <register_tm_clones+0x40>
 724:	5d                   	pop    rbp
 725:	ff e0                	jmp    rax
 727:	66 0f 1f 84 00 00 00 	nop    WORD PTR [rax+rax*1+0x0]
 72e:	00 00 
 730:	5d                   	pop    rbp
 731:	c3                   	ret    
 732:	0f 1f 40 00          	nop    DWORD PTR [rax+0x0]
 736:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
 73d:	00 00 00 

0000000000000740 <__do_global_dtors_aux>:
 740:	80 3d c9 08 20 00 00 	cmp    BYTE PTR [rip+0x2008c9],0x0        # 201010 <__TMC_END__>
 747:	75 2f                	jne    778 <__do_global_dtors_aux+0x38>
 749:	48 83 3d a7 08 20 00 	cmp    QWORD PTR [rip+0x2008a7],0x0        # 200ff8 <__cxa_finalize@GLIBC_2.2.5>
 750:	00 
 751:	55                   	push   rbp
 752:	48 89 e5             	mov    rbp,rsp
 755:	74 0c                	je     763 <__do_global_dtors_aux+0x23>
 757:	48 8b 3d aa 08 20 00 	mov    rdi,QWORD PTR [rip+0x2008aa]        # 201008 <__dso_handle>
 75e:	e8 0d ff ff ff       	call   670 <__cxa_finalize@plt>
 763:	e8 48 ff ff ff       	call   6b0 <deregister_tm_clones>
 768:	c6 05 a1 08 20 00 01 	mov    BYTE PTR [rip+0x2008a1],0x1        # 201010 <__TMC_END__>
 76f:	5d                   	pop    rbp
 770:	c3                   	ret    
 771:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]
 778:	f3 c3                	repz ret 
 77a:	66 0f 1f 44 00 00    	nop    WORD PTR [rax+rax*1+0x0]

0000000000000780 <frame_dummy>:
 780:	55                   	push   rbp
 781:	48 89 e5             	mov    rbp,rsp
 784:	5d                   	pop    rbp
 785:	e9 66 ff ff ff       	jmp    6f0 <register_tm_clones>

000000000000078a <main>:
 78a:	55                   	push   rbp
 78b:	48 89 e5             	mov    rbp,rsp
 78e:	53                   	push   rbx
 78f:	48 81 ec b8 00 00 00 	sub    rsp,0xb8
 796:	89 bd 4c ff ff ff    	mov    DWORD PTR [rbp-0xb4],edi
 79c:	48 89 b5 40 ff ff ff 	mov    QWORD PTR [rbp-0xc0],rsi
 7a3:	64 48 8b 04 25 28 00 	mov    rax,QWORD PTR fs:0x28
 7aa:	00 00 
 7ac:	48 89 45 e8          	mov    QWORD PTR [rbp-0x18],rax
 7b0:	31 c0                	xor    eax,eax
 7b2:	83 bd 4c ff ff ff 01 	cmp    DWORD PTR [rbp-0xb4],0x1
 7b9:	7f 16                	jg     7d1 <main+0x47>
 7bb:	48 8d 3d f6 01 00 00 	lea    rdi,[rip+0x1f6]        # 9b8 <_IO_stdin_used+0x8>
 7c2:	e8 69 fe ff ff       	call   630 <puts@plt>
 7c7:	b8 01 00 00 00       	mov    eax,0x1
 7cc:	e9 3a 01 00 00       	jmp    90b <main+0x181>
 7d1:	83 bd 4c ff ff ff 02 	cmp    DWORD PTR [rbp-0xb4],0x2
 7d8:	7e 16                	jle    7f0 <main+0x66>
 7da:	48 8d 3d ff 01 00 00 	lea    rdi,[rip+0x1ff]        # 9e0 <_IO_stdin_used+0x30>
 7e1:	e8 4a fe ff ff       	call   630 <puts@plt>
 7e6:	b8 01 00 00 00       	mov    eax,0x1
 7eb:	e9 1b 01 00 00       	jmp    90b <main+0x181>
 7f0:	48 8b 85 40 ff ff ff 	mov    rax,QWORD PTR [rbp-0xc0]
 7f7:	48 83 c0 08          	add    rax,0x8
 7fb:	48 8b 00             	mov    rax,QWORD PTR [rax]
 7fe:	48 89 c7             	mov    rdi,rax
 801:	e8 3a fe ff ff       	call   640 <strlen@plt>
 806:	89 85 5c ff ff ff    	mov    DWORD PTR [rbp-0xa4],eax
 80c:	83 bd 5c ff ff ff 21 	cmp    DWORD PTR [rbp-0xa4],0x21
 813:	74 16                	je     82b <main+0xa1>
 815:	48 8d 3d da 01 00 00 	lea    rdi,[rip+0x1da]        # 9f6 <_IO_stdin_used+0x46>
 81c:	e8 0f fe ff ff       	call   630 <puts@plt>
 821:	b8 01 00 00 00       	mov    eax,0x1
 826:	e9 e0 00 00 00       	jmp    90b <main+0x181>
 82b:	48 8b 85 40 ff ff ff 	mov    rax,QWORD PTR [rbp-0xc0]
 832:	48 83 c0 08          	add    rax,0x8
 836:	48 8b 10             	mov    rdx,QWORD PTR [rax]
 839:	48 8d 45 90          	lea    rax,[rbp-0x70]
 83d:	48 89 d6             	mov    rsi,rdx
 840:	48 89 c7             	mov    rdi,rax
 843:	e8 d8 fd ff ff       	call   620 <strcpy@plt>
 848:	48 b8 04 1e 76 24 6a 	movabs rax,0x1486a6a24761e04
 84f:	6a 48 01 
 852:	48 ba 74 5f 3c 10 20 	movabs rdx,0x14113d20103c5f74
 859:	3d 11 14 
 85c:	48 89 45 c0          	mov    QWORD PTR [rbp-0x40],rax
 860:	48 89 55 c8          	mov    QWORD PTR [rbp-0x38],rdx
 864:	48 b8 69 0c 06 13 0b 	movabs rax,0x132f4a0b13060c69
 86b:	4a 2f 13 
 86e:	48 ba 05 62 1a 63 79 	movabs rdx,0x3b054679631a6205
 875:	46 05 3b 
 878:	48 89 45 d0          	mov    QWORD PTR [rbp-0x30],rax
 87c:	48 89 55 d8          	mov    QWORD PTR [rbp-0x28],rdx
 880:	66 c7 45 e0 3c 00    	mov    WORD PTR [rbp-0x20],0x3c
 886:	c7 85 58 ff ff ff 00 	mov    DWORD PTR [rbp-0xa8],0x0
 88d:	00 00 00 
 890:	eb 3f                	jmp    8d1 <main+0x147>
 892:	8b 85 58 ff ff ff    	mov    eax,DWORD PTR [rbp-0xa8]
 898:	48 98                	cdqe   
 89a:	0f b6 54 05 c0       	movzx  edx,BYTE PTR [rbp+rax*1-0x40]
 89f:	8b 85 58 ff ff ff    	mov    eax,DWORD PTR [rbp-0xa8]
 8a5:	48 98                	cdqe   
 8a7:	0f b6 44 05 90       	movzx  eax,BYTE PTR [rbp+rax*1-0x70]
 8ac:	31 d0                	xor    eax,edx
 8ae:	88 85 57 ff ff ff    	mov    BYTE PTR [rbp-0xa9],al
 8b4:	8b 85 58 ff ff ff    	mov    eax,DWORD PTR [rbp-0xa8]
 8ba:	48 98                	cdqe   
 8bc:	0f b6 95 57 ff ff ff 	movzx  edx,BYTE PTR [rbp-0xa9]
 8c3:	88 94 05 60 ff ff ff 	mov    BYTE PTR [rbp+rax*1-0xa0],dl
 8ca:	83 85 58 ff ff ff 01 	add    DWORD PTR [rbp-0xa8],0x1
 8d1:	8b 85 58 ff ff ff    	mov    eax,DWORD PTR [rbp-0xa8]
 8d7:	48 63 d8             	movsxd rbx,eax
 8da:	48 8d 45 c0          	lea    rax,[rbp-0x40]
 8de:	48 89 c7             	mov    rdi,rax
 8e1:	e8 5a fd ff ff       	call   640 <strlen@plt>
 8e6:	48 39 c3             	cmp    rbx,rax
 8e9:	72 a7                	jb     892 <main+0x108>
 8eb:	48 8d 85 60 ff ff ff 	lea    rax,[rbp-0xa0]
 8f2:	48 89 c6             	mov    rsi,rax
 8f5:	48 8d 3d 15 01 00 00 	lea    rdi,[rip+0x115]        # a11 <_IO_stdin_used+0x61>
 8fc:	b8 00 00 00 00       	mov    eax,0x0
 901:	e8 5a fd ff ff       	call   660 <printf@plt>
 906:	b8 00 00 00 00       	mov    eax,0x0
 90b:	48 8b 4d e8          	mov    rcx,QWORD PTR [rbp-0x18]
 90f:	64 48 33 0c 25 28 00 	xor    rcx,QWORD PTR fs:0x28
 916:	00 00 
 918:	74 05                	je     91f <main+0x195>
 91a:	e8 31 fd ff ff       	call   650 <__stack_chk_fail@plt>
 91f:	48 81 c4 b8 00 00 00 	add    rsp,0xb8
 926:	5b                   	pop    rbx
 927:	5d                   	pop    rbp
 928:	c3                   	ret    
 929:	0f 1f 80 00 00 00 00 	nop    DWORD PTR [rax+0x0]

0000000000000930 <__libc_csu_init>:
 930:	41 57                	push   r15
 932:	41 56                	push   r14
 934:	49 89 d7             	mov    r15,rdx
 937:	41 55                	push   r13
 939:	41 54                	push   r12
 93b:	4c 8d 25 56 04 20 00 	lea    r12,[rip+0x200456]        # 200d98 <__frame_dummy_init_array_entry>
 942:	55                   	push   rbp
 943:	48 8d 2d 56 04 20 00 	lea    rbp,[rip+0x200456]        # 200da0 <__do_global_dtors_aux_fini_array_entry>
 94a:	53                   	push   rbx
 94b:	41 89 fd             	mov    r13d,edi
 94e:	49 89 f6             	mov    r14,rsi
 951:	4c 29 e5             	sub    rbp,r12
 954:	48 83 ec 08          	sub    rsp,0x8
 958:	48 c1 fd 03          	sar    rbp,0x3
 95c:	e8 8f fc ff ff       	call   5f0 <_init>
 961:	48 85 ed             	test   rbp,rbp
 964:	74 20                	je     986 <__libc_csu_init+0x56>
 966:	31 db                	xor    ebx,ebx
 968:	0f 1f 84 00 00 00 00 	nop    DWORD PTR [rax+rax*1+0x0]
 96f:	00 
 970:	4c 89 fa             	mov    rdx,r15
 973:	4c 89 f6             	mov    rsi,r14
 976:	44 89 ef             	mov    edi,r13d
 979:	41 ff 14 dc          	call   QWORD PTR [r12+rbx*8]
 97d:	48 83 c3 01          	add    rbx,0x1
 981:	48 39 dd             	cmp    rbp,rbx
 984:	75 ea                	jne    970 <__libc_csu_init+0x40>
 986:	48 83 c4 08          	add    rsp,0x8
 98a:	5b                   	pop    rbx
 98b:	5d                   	pop    rbp
 98c:	41 5c                	pop    r12
 98e:	41 5d                	pop    r13
 990:	41 5e                	pop    r14
 992:	41 5f                	pop    r15
 994:	c3                   	ret    
 995:	90                   	nop
 996:	66 2e 0f 1f 84 00 00 	nop    WORD PTR cs:[rax+rax*1+0x0]
 99d:	00 00 00 

00000000000009a0 <__libc_csu_fini>:
 9a0:	f3 c3                	repz ret 

Disassembly of section .fini:

00000000000009a4 <_fini>:
 9a4:	48 83 ec 08          	sub    rsp,0x8
 9a8:	48 83 c4 08          	add    rsp,0x8
 9ac:	c3                   	ret    
