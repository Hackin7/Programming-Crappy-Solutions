
/host/Documents/Stuff/Github/Solutions/Cyber Security/DSTA CDDC 2020/Warp Gate 4/Secret Code/SecretCode:     file format elf32-i386


Disassembly of section .init:

00000420 <_init>:
 420:	53                   	push   ebx
 421:	83 ec 08             	sub    esp,0x8
 424:	e8 d7 00 00 00       	call   500 <__x86.get_pc_thunk.bx>
 429:	81 c3 a3 1b 00 00    	add    ebx,0x1ba3
 42f:	8b 83 28 00 00 00    	mov    eax,DWORD PTR [ebx+0x28]
 435:	85 c0                	test   eax,eax
 437:	74 05                	je     43e <_init+0x1e>
 439:	e8 7a 00 00 00       	call   4b8 <__gmon_start__@plt>
 43e:	83 c4 08             	add    esp,0x8
 441:	5b                   	pop    ebx
 442:	c3                   	ret    

Disassembly of section .plt:

00000450 <.plt>:
 450:	ff b3 04 00 00 00    	push   DWORD PTR [ebx+0x4]
 456:	ff a3 08 00 00 00    	jmp    DWORD PTR [ebx+0x8]
 45c:	00 00                	add    BYTE PTR [eax],al
	...

00000460 <printf@plt>:
 460:	ff a3 0c 00 00 00    	jmp    DWORD PTR [ebx+0xc]
 466:	68 00 00 00 00       	push   0x0
 46b:	e9 e0 ff ff ff       	jmp    450 <.plt>

00000470 <__stack_chk_fail@plt>:
 470:	ff a3 10 00 00 00    	jmp    DWORD PTR [ebx+0x10]
 476:	68 08 00 00 00       	push   0x8
 47b:	e9 d0 ff ff ff       	jmp    450 <.plt>

00000480 <puts@plt>:
 480:	ff a3 14 00 00 00    	jmp    DWORD PTR [ebx+0x14]
 486:	68 10 00 00 00       	push   0x10
 48b:	e9 c0 ff ff ff       	jmp    450 <.plt>

00000490 <__libc_start_main@plt>:
 490:	ff a3 18 00 00 00    	jmp    DWORD PTR [ebx+0x18]
 496:	68 18 00 00 00       	push   0x18
 49b:	e9 b0 ff ff ff       	jmp    450 <.plt>

000004a0 <__isoc99_scanf@plt>:
 4a0:	ff a3 1c 00 00 00    	jmp    DWORD PTR [ebx+0x1c]
 4a6:	68 20 00 00 00       	push   0x20
 4ab:	e9 a0 ff ff ff       	jmp    450 <.plt>

Disassembly of section .plt.got:

000004b0 <__cxa_finalize@plt>:
 4b0:	ff a3 24 00 00 00    	jmp    DWORD PTR [ebx+0x24]
 4b6:	66 90                	xchg   ax,ax

000004b8 <__gmon_start__@plt>:
 4b8:	ff a3 28 00 00 00    	jmp    DWORD PTR [ebx+0x28]
 4be:	66 90                	xchg   ax,ax

Disassembly of section .text:

000004c0 <_start>:
 4c0:	31 ed                	xor    ebp,ebp
 4c2:	5e                   	pop    esi
 4c3:	89 e1                	mov    ecx,esp
 4c5:	83 e4 f0             	and    esp,0xfffffff0
 4c8:	50                   	push   eax
 4c9:	54                   	push   esp
 4ca:	52                   	push   edx
 4cb:	e8 22 00 00 00       	call   4f2 <_start+0x32>
 4d0:	81 c3 fc 1a 00 00    	add    ebx,0x1afc
 4d6:	8d 83 84 e8 ff ff    	lea    eax,[ebx-0x177c]
 4dc:	50                   	push   eax
 4dd:	8d 83 24 e8 ff ff    	lea    eax,[ebx-0x17dc]
 4e3:	50                   	push   eax
 4e4:	51                   	push   ecx
 4e5:	56                   	push   esi
 4e6:	ff b3 2c 00 00 00    	push   DWORD PTR [ebx+0x2c]
 4ec:	e8 9f ff ff ff       	call   490 <__libc_start_main@plt>
 4f1:	f4                   	hlt    
 4f2:	8b 1c 24             	mov    ebx,DWORD PTR [esp]
 4f5:	c3                   	ret    
 4f6:	66 90                	xchg   ax,ax
 4f8:	66 90                	xchg   ax,ax
 4fa:	66 90                	xchg   ax,ax
 4fc:	66 90                	xchg   ax,ax
 4fe:	66 90                	xchg   ax,ax

00000500 <__x86.get_pc_thunk.bx>:
 500:	8b 1c 24             	mov    ebx,DWORD PTR [esp]
 503:	c3                   	ret    
 504:	66 90                	xchg   ax,ax
 506:	66 90                	xchg   ax,ax
 508:	66 90                	xchg   ax,ax
 50a:	66 90                	xchg   ax,ax
 50c:	66 90                	xchg   ax,ax
 50e:	66 90                	xchg   ax,ax

00000510 <deregister_tm_clones>:
 510:	e8 e4 00 00 00       	call   5f9 <__x86.get_pc_thunk.dx>
 515:	81 c2 b7 1a 00 00    	add    edx,0x1ab7
 51b:	8d 8a 3c 00 00 00    	lea    ecx,[edx+0x3c]
 521:	8d 82 3c 00 00 00    	lea    eax,[edx+0x3c]
 527:	39 c8                	cmp    eax,ecx
 529:	74 1d                	je     548 <deregister_tm_clones+0x38>
 52b:	8b 82 20 00 00 00    	mov    eax,DWORD PTR [edx+0x20]
 531:	85 c0                	test   eax,eax
 533:	74 13                	je     548 <deregister_tm_clones+0x38>
 535:	55                   	push   ebp
 536:	89 e5                	mov    ebp,esp
 538:	83 ec 14             	sub    esp,0x14
 53b:	51                   	push   ecx
 53c:	ff d0                	call   eax
 53e:	83 c4 10             	add    esp,0x10
 541:	c9                   	leave  
 542:	c3                   	ret    
 543:	90                   	nop
 544:	8d 74 26 00          	lea    esi,[esi+eiz*1+0x0]
 548:	f3 c3                	repz ret 
 54a:	8d b6 00 00 00 00    	lea    esi,[esi+0x0]

00000550 <register_tm_clones>:
 550:	e8 a4 00 00 00       	call   5f9 <__x86.get_pc_thunk.dx>
 555:	81 c2 77 1a 00 00    	add    edx,0x1a77
 55b:	55                   	push   ebp
 55c:	8d 8a 3c 00 00 00    	lea    ecx,[edx+0x3c]
 562:	8d 82 3c 00 00 00    	lea    eax,[edx+0x3c]
 568:	29 c8                	sub    eax,ecx
 56a:	89 e5                	mov    ebp,esp
 56c:	53                   	push   ebx
 56d:	c1 f8 02             	sar    eax,0x2
 570:	89 c3                	mov    ebx,eax
 572:	83 ec 04             	sub    esp,0x4
 575:	c1 eb 1f             	shr    ebx,0x1f
 578:	01 d8                	add    eax,ebx
 57a:	d1 f8                	sar    eax,1
 57c:	74 14                	je     592 <register_tm_clones+0x42>
 57e:	8b 92 30 00 00 00    	mov    edx,DWORD PTR [edx+0x30]
 584:	85 d2                	test   edx,edx
 586:	74 0a                	je     592 <register_tm_clones+0x42>
 588:	83 ec 08             	sub    esp,0x8
 58b:	50                   	push   eax
 58c:	51                   	push   ecx
 58d:	ff d2                	call   edx
 58f:	83 c4 10             	add    esp,0x10
 592:	8b 5d fc             	mov    ebx,DWORD PTR [ebp-0x4]
 595:	c9                   	leave  
 596:	c3                   	ret    
 597:	89 f6                	mov    esi,esi
 599:	8d bc 27 00 00 00 00 	lea    edi,[edi+eiz*1+0x0]

000005a0 <__do_global_dtors_aux>:
 5a0:	55                   	push   ebp
 5a1:	89 e5                	mov    ebp,esp
 5a3:	53                   	push   ebx
 5a4:	e8 57 ff ff ff       	call   500 <__x86.get_pc_thunk.bx>
 5a9:	81 c3 23 1a 00 00    	add    ebx,0x1a23
 5af:	83 ec 04             	sub    esp,0x4
 5b2:	80 bb 3c 00 00 00 00 	cmp    BYTE PTR [ebx+0x3c],0x0
 5b9:	75 27                	jne    5e2 <__do_global_dtors_aux+0x42>
 5bb:	8b 83 24 00 00 00    	mov    eax,DWORD PTR [ebx+0x24]
 5c1:	85 c0                	test   eax,eax
 5c3:	74 11                	je     5d6 <__do_global_dtors_aux+0x36>
 5c5:	83 ec 0c             	sub    esp,0xc
 5c8:	ff b3 38 00 00 00    	push   DWORD PTR [ebx+0x38]
 5ce:	e8 dd fe ff ff       	call   4b0 <__cxa_finalize@plt>
 5d3:	83 c4 10             	add    esp,0x10
 5d6:	e8 35 ff ff ff       	call   510 <deregister_tm_clones>
 5db:	c6 83 3c 00 00 00 01 	mov    BYTE PTR [ebx+0x3c],0x1
 5e2:	8b 5d fc             	mov    ebx,DWORD PTR [ebp-0x4]
 5e5:	c9                   	leave  
 5e6:	c3                   	ret    
 5e7:	89 f6                	mov    esi,esi
 5e9:	8d bc 27 00 00 00 00 	lea    edi,[edi+eiz*1+0x0]

000005f0 <frame_dummy>:
 5f0:	55                   	push   ebp
 5f1:	89 e5                	mov    ebp,esp
 5f3:	5d                   	pop    ebp
 5f4:	e9 57 ff ff ff       	jmp    550 <register_tm_clones>

000005f9 <__x86.get_pc_thunk.dx>:
 5f9:	8b 14 24             	mov    edx,DWORD PTR [esp]
 5fc:	c3                   	ret    

000005fd <check>:
 5fd:	55                   	push   ebp
 5fe:	89 e5                	mov    ebp,esp
 600:	57                   	push   edi
 601:	56                   	push   esi
 602:	53                   	push   ebx
 603:	83 ec 4c             	sub    esp,0x4c
 606:	e8 d4 01 00 00       	call   7df <__x86.get_pc_thunk.ax>
 60b:	05 c1 19 00 00       	add    eax,0x19c1
 610:	89 45 ac             	mov    DWORD PTR [ebp-0x54],eax
 613:	65 a1 14 00 00 00    	mov    eax,gs:0x14
 619:	89 45 e4             	mov    DWORD PTR [ebp-0x1c],eax
 61c:	31 c0                	xor    eax,eax
 61e:	c6 45 c3 00          	mov    BYTE PTR [ebp-0x3d],0x0
 622:	c7 45 cd 43 44 44 43 	mov    DWORD PTR [ebp-0x33],0x43444443
 629:	c7 45 d1 32 30 7b 45 	mov    DWORD PTR [ebp-0x2f],0x457b3032
 630:	c7 45 d5 35 71 7a 56 	mov    DWORD PTR [ebp-0x2b],0x567a7135
 637:	c7 45 d9 36 70 34 7a 	mov    DWORD PTR [ebp-0x27],0x7a347036
 63e:	c7 45 dd 5a 3b 65 6b 	mov    DWORD PTR [ebp-0x23],0x6b653b5a
 645:	66 c7 45 e1 73 7d    	mov    WORD PTR [ebp-0x1f],0x7d73
 64b:	c6 45 e3 00          	mov    BYTE PTR [ebp-0x1d],0x0
 64f:	c7 45 c4 ef be ad de 	mov    DWORD PTR [ebp-0x3c],0xdeadbeef
 656:	c7 45 c8 ce fa be ba 	mov    DWORD PTR [ebp-0x38],0xbabeface
 65d:	8b 4d c4             	mov    ecx,DWORD PTR [ebp-0x3c]
 660:	2b 4d c8             	sub    ecx,DWORD PTR [ebp-0x38]
 663:	89 ce                	mov    esi,ecx
 665:	bf 00 00 00 00       	mov    edi,0x0
 66a:	8b 4d 08             	mov    ecx,DWORD PTR [ebp+0x8]
 66d:	bb 00 00 00 00       	mov    ebx,0x0
 672:	81 c1 23 f9 e0 33    	add    ecx,0x33e0f923
 678:	83 d3 ff             	adc    ebx,0xffffffff
 67b:	89 f0                	mov    eax,esi
 67d:	31 c8                	xor    eax,ecx
 67f:	89 45 b0             	mov    DWORD PTR [ebp-0x50],eax
 682:	89 f8                	mov    eax,edi
 684:	31 d8                	xor    eax,ebx
 686:	89 45 b4             	mov    DWORD PTR [ebp-0x4c],eax
 689:	8b 5d b0             	mov    ebx,DWORD PTR [ebp-0x50]
 68c:	8b 75 b4             	mov    esi,DWORD PTR [ebp-0x4c]
 68f:	89 d8                	mov    eax,ebx
 691:	09 f0                	or     eax,esi
 693:	85 c0                	test   eax,eax
 695:	75 45                	jne    6dc <check+0xdf>
 697:	c6 45 c3 00          	mov    BYTE PTR [ebp-0x3d],0x0
 69b:	eb 27                	jmp    6c4 <check+0xc7>
 69d:	0f b6 45 c3          	movzx  eax,BYTE PTR [ebp-0x3d]
 6a1:	83 c0 07             	add    eax,0x7
 6a4:	0f b6 4c 05 cd       	movzx  ecx,BYTE PTR [ebp+eax*1-0x33]
 6a9:	0f b6 55 c3          	movzx  edx,BYTE PTR [ebp-0x3d]
 6ad:	0f b6 45 c3          	movzx  eax,BYTE PTR [ebp-0x3d]
 6b1:	83 c0 07             	add    eax,0x7
 6b4:	31 ca                	xor    edx,ecx
 6b6:	88 54 05 cd          	mov    BYTE PTR [ebp+eax*1-0x33],dl
 6ba:	0f b6 45 c3          	movzx  eax,BYTE PTR [ebp-0x3d]
 6be:	83 c0 01             	add    eax,0x1
 6c1:	88 45 c3             	mov    BYTE PTR [ebp-0x3d],al
 6c4:	80 7d c3 0d          	cmp    BYTE PTR [ebp-0x3d],0xd
 6c8:	76 d3                	jbe    69d <check+0xa0>
 6ca:	83 ec 0c             	sub    esp,0xc
 6cd:	8d 45 cd             	lea    eax,[ebp-0x33]
 6d0:	50                   	push   eax
 6d1:	8b 5d ac             	mov    ebx,DWORD PTR [ebp-0x54]
 6d4:	e8 a7 fd ff ff       	call   480 <puts@plt>
 6d9:	83 c4 10             	add    esp,0x10
 6dc:	90                   	nop
 6dd:	8b 45 e4             	mov    eax,DWORD PTR [ebp-0x1c]
 6e0:	65 33 05 14 00 00 00 	xor    eax,DWORD PTR gs:0x14
 6e7:	74 05                	je     6ee <check+0xf1>
 6e9:	e8 72 01 00 00       	call   860 <__stack_chk_fail_local>
 6ee:	8d 65 f4             	lea    esp,[ebp-0xc]
 6f1:	5b                   	pop    ebx
 6f2:	5e                   	pop    esi
 6f3:	5f                   	pop    edi
 6f4:	5d                   	pop    ebp
 6f5:	c3                   	ret    

000006f6 <main>:
 6f6:	8d 4c 24 04          	lea    ecx,[esp+0x4]
 6fa:	83 e4 f0             	and    esp,0xfffffff0
 6fd:	ff 71 fc             	push   DWORD PTR [ecx-0x4]
 700:	55                   	push   ebp
 701:	89 e5                	mov    ebp,esp
 703:	53                   	push   ebx
 704:	51                   	push   ecx
 705:	83 ec 10             	sub    esp,0x10
 708:	e8 f3 fd ff ff       	call   500 <__x86.get_pc_thunk.bx>
 70d:	81 c3 bf 18 00 00    	add    ebx,0x18bf
 713:	65 a1 14 00 00 00    	mov    eax,gs:0x14
 719:	89 45 f4             	mov    DWORD PTR [ebp-0xc],eax
 71c:	31 c0                	xor    eax,eax
 71e:	c7 45 f0 00 00 00 00 	mov    DWORD PTR [ebp-0x10],0x0
 725:	83 ec 0c             	sub    esp,0xc
 728:	8d 83 c4 e8 ff ff    	lea    eax,[ebx-0x173c]
 72e:	50                   	push   eax
 72f:	e8 4c fd ff ff       	call   480 <puts@plt>
 734:	83 c4 10             	add    esp,0x10
 737:	83 ec 0c             	sub    esp,0xc
 73a:	8d 83 04 e9 ff ff    	lea    eax,[ebx-0x16fc]
 740:	50                   	push   eax
 741:	e8 3a fd ff ff       	call   480 <puts@plt>
 746:	83 c4 10             	add    esp,0x10
 749:	83 ec 0c             	sub    esp,0xc
 74c:	8d 83 44 e9 ff ff    	lea    eax,[ebx-0x16bc]
 752:	50                   	push   eax
 753:	e8 28 fd ff ff       	call   480 <puts@plt>
 758:	83 c4 10             	add    esp,0x10
 75b:	83 ec 0c             	sub    esp,0xc
 75e:	8d 83 84 e9 ff ff    	lea    eax,[ebx-0x167c]
 764:	50                   	push   eax
 765:	e8 16 fd ff ff       	call   480 <puts@plt>
 76a:	83 c4 10             	add    esp,0x10
 76d:	83 ec 0c             	sub    esp,0xc
 770:	8d 83 c4 e9 ff ff    	lea    eax,[ebx-0x163c]
 776:	50                   	push   eax
 777:	e8 e4 fc ff ff       	call   460 <printf@plt>
 77c:	83 c4 10             	add    esp,0x10
 77f:	83 ec 08             	sub    esp,0x8
 782:	8d 45 f0             	lea    eax,[ebp-0x10]
 785:	50                   	push   eax
 786:	8d 83 e6 e9 ff ff    	lea    eax,[ebx-0x161a]
 78c:	50                   	push   eax
 78d:	e8 0e fd ff ff       	call   4a0 <__isoc99_scanf@plt>
 792:	83 c4 10             	add    esp,0x10
 795:	8b 45 f0             	mov    eax,DWORD PTR [ebp-0x10]
 798:	3d fe ca 0d f0       	cmp    eax,0xf00dcafe
 79d:	75 11                	jne    7b0 <main+0xba>
 79f:	8b 45 f0             	mov    eax,DWORD PTR [ebp-0x10]
 7a2:	83 ec 0c             	sub    esp,0xc
 7a5:	50                   	push   eax
 7a6:	e8 52 fe ff ff       	call   5fd <check>
 7ab:	83 c4 10             	add    esp,0x10
 7ae:	eb 0f                	jmp    7bf <main+0xc9>
 7b0:	8b 45 f0             	mov    eax,DWORD PTR [ebp-0x10]
 7b3:	83 ec 0c             	sub    esp,0xc
 7b6:	50                   	push   eax
 7b7:	e8 41 fe ff ff       	call   5fd <check>
 7bc:	83 c4 10             	add    esp,0x10
 7bf:	b8 00 00 00 00       	mov    eax,0x0
 7c4:	8b 55 f4             	mov    edx,DWORD PTR [ebp-0xc]
 7c7:	65 33 15 14 00 00 00 	xor    edx,DWORD PTR gs:0x14
 7ce:	74 05                	je     7d5 <main+0xdf>
 7d0:	e8 8b 00 00 00       	call   860 <__stack_chk_fail_local>
 7d5:	8d 65 f8             	lea    esp,[ebp-0x8]
 7d8:	59                   	pop    ecx
 7d9:	5b                   	pop    ebx
 7da:	5d                   	pop    ebp
 7db:	8d 61 fc             	lea    esp,[ecx-0x4]
 7de:	c3                   	ret    

000007df <__x86.get_pc_thunk.ax>:
 7df:	8b 04 24             	mov    eax,DWORD PTR [esp]
 7e2:	c3                   	ret    
 7e3:	66 90                	xchg   ax,ax
 7e5:	66 90                	xchg   ax,ax
 7e7:	66 90                	xchg   ax,ax
 7e9:	66 90                	xchg   ax,ax
 7eb:	66 90                	xchg   ax,ax
 7ed:	66 90                	xchg   ax,ax
 7ef:	90                   	nop

000007f0 <__libc_csu_init>:
 7f0:	55                   	push   ebp
 7f1:	57                   	push   edi
 7f2:	56                   	push   esi
 7f3:	53                   	push   ebx
 7f4:	e8 07 fd ff ff       	call   500 <__x86.get_pc_thunk.bx>
 7f9:	81 c3 d3 17 00 00    	add    ebx,0x17d3
 7ff:	83 ec 0c             	sub    esp,0xc
 802:	8b 6c 24 28          	mov    ebp,DWORD PTR [esp+0x28]
 806:	8d b3 04 ff ff ff    	lea    esi,[ebx-0xfc]
 80c:	e8 0f fc ff ff       	call   420 <_init>
 811:	8d 83 00 ff ff ff    	lea    eax,[ebx-0x100]
 817:	29 c6                	sub    esi,eax
 819:	c1 fe 02             	sar    esi,0x2
 81c:	85 f6                	test   esi,esi
 81e:	74 25                	je     845 <__libc_csu_init+0x55>
 820:	31 ff                	xor    edi,edi
 822:	8d b6 00 00 00 00    	lea    esi,[esi+0x0]
 828:	83 ec 04             	sub    esp,0x4
 82b:	55                   	push   ebp
 82c:	ff 74 24 2c          	push   DWORD PTR [esp+0x2c]
 830:	ff 74 24 2c          	push   DWORD PTR [esp+0x2c]
 834:	ff 94 bb 00 ff ff ff 	call   DWORD PTR [ebx+edi*4-0x100]
 83b:	83 c7 01             	add    edi,0x1
 83e:	83 c4 10             	add    esp,0x10
 841:	39 fe                	cmp    esi,edi
 843:	75 e3                	jne    828 <__libc_csu_init+0x38>
 845:	83 c4 0c             	add    esp,0xc
 848:	5b                   	pop    ebx
 849:	5e                   	pop    esi
 84a:	5f                   	pop    edi
 84b:	5d                   	pop    ebp
 84c:	c3                   	ret    
 84d:	8d 76 00             	lea    esi,[esi+0x0]

00000850 <__libc_csu_fini>:
 850:	f3 c3                	repz ret 
 852:	66 90                	xchg   ax,ax
 854:	66 90                	xchg   ax,ax
 856:	66 90                	xchg   ax,ax
 858:	66 90                	xchg   ax,ax
 85a:	66 90                	xchg   ax,ax
 85c:	66 90                	xchg   ax,ax
 85e:	66 90                	xchg   ax,ax

00000860 <__stack_chk_fail_local>:
 860:	53                   	push   ebx
 861:	e8 9a fc ff ff       	call   500 <__x86.get_pc_thunk.bx>
 866:	81 c3 66 17 00 00    	add    ebx,0x1766
 86c:	83 ec 08             	sub    esp,0x8
 86f:	e8 fc fb ff ff       	call   470 <__stack_chk_fail@plt>

Disassembly of section .fini:

00000874 <_fini>:
 874:	53                   	push   ebx
 875:	83 ec 08             	sub    esp,0x8
 878:	e8 83 fc ff ff       	call   500 <__x86.get_pc_thunk.bx>
 87d:	81 c3 4f 17 00 00    	add    ebx,0x174f
 883:	83 c4 08             	add    esp,0x8
 886:	5b                   	pop    ebx
 887:	c3                   	ret    
