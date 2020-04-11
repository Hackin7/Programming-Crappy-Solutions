
wisecrack:     file format elf32-i386


Disassembly of section .init:

00000604 <_init>:
 604:	53                   	push   %ebx
 605:	83 ec 08             	sub    $0x8,%esp
 608:	e8 f3 00 00 00       	call   700 <__x86.get_pc_thunk.bx>
 60d:	81 c3 b7 19 00 00    	add    $0x19b7,%ebx
 613:	8b 83 30 00 00 00    	mov    0x30(%ebx),%eax
 619:	85 c0                	test   %eax,%eax
 61b:	74 05                	je     622 <_init+0x1e>
 61d:	e8 96 00 00 00       	call   6b8 <__gmon_start__@plt>
 622:	83 c4 08             	add    $0x8,%esp
 625:	5b                   	pop    %ebx
 626:	c3                   	ret    

Disassembly of section .plt:

00000630 <.plt>:
 630:	ff b3 04 00 00 00    	pushl  0x4(%ebx)
 636:	ff a3 08 00 00 00    	jmp    *0x8(%ebx)
 63c:	00 00                	add    %al,(%eax)
	...

00000640 <strcmp@plt>:
 640:	ff a3 0c 00 00 00    	jmp    *0xc(%ebx)
 646:	68 00 00 00 00       	push   $0x0
 64b:	e9 e0 ff ff ff       	jmp    630 <.plt>

00000650 <printf@plt>:
 650:	ff a3 10 00 00 00    	jmp    *0x10(%ebx)
 656:	68 08 00 00 00       	push   $0x8
 65b:	e9 d0 ff ff ff       	jmp    630 <.plt>

00000660 <fflush@plt>:
 660:	ff a3 14 00 00 00    	jmp    *0x14(%ebx)
 666:	68 10 00 00 00       	push   $0x10
 66b:	e9 c0 ff ff ff       	jmp    630 <.plt>

00000670 <puts@plt>:
 670:	ff a3 18 00 00 00    	jmp    *0x18(%ebx)
 676:	68 18 00 00 00       	push   $0x18
 67b:	e9 b0 ff ff ff       	jmp    630 <.plt>

00000680 <__libc_start_main@plt>:
 680:	ff a3 1c 00 00 00    	jmp    *0x1c(%ebx)
 686:	68 20 00 00 00       	push   $0x20
 68b:	e9 a0 ff ff ff       	jmp    630 <.plt>

00000690 <setvbuf@plt>:
 690:	ff a3 20 00 00 00    	jmp    *0x20(%ebx)
 696:	68 28 00 00 00       	push   $0x28
 69b:	e9 90 ff ff ff       	jmp    630 <.plt>

000006a0 <__isoc99_scanf@plt>:
 6a0:	ff a3 24 00 00 00    	jmp    *0x24(%ebx)
 6a6:	68 30 00 00 00       	push   $0x30
 6ab:	e9 80 ff ff ff       	jmp    630 <.plt>

Disassembly of section .plt.got:

000006b0 <__cxa_finalize@plt>:
 6b0:	ff a3 2c 00 00 00    	jmp    *0x2c(%ebx)
 6b6:	66 90                	xchg   %ax,%ax

000006b8 <__gmon_start__@plt>:
 6b8:	ff a3 30 00 00 00    	jmp    *0x30(%ebx)
 6be:	66 90                	xchg   %ax,%ax

Disassembly of section .text:

000006c0 <_start>:
 6c0:	31 ed                	xor    %ebp,%ebp
 6c2:	5e                   	pop    %esi
 6c3:	89 e1                	mov    %esp,%ecx
 6c5:	83 e4 f0             	and    $0xfffffff0,%esp
 6c8:	50                   	push   %eax
 6c9:	54                   	push   %esp
 6ca:	52                   	push   %edx
 6cb:	e8 22 00 00 00       	call   6f2 <_start+0x32>
 6d0:	81 c3 f4 18 00 00    	add    $0x18f4,%ebx
 6d6:	8d 83 ac eb ff ff    	lea    -0x1454(%ebx),%eax
 6dc:	50                   	push   %eax
 6dd:	8d 83 4c eb ff ff    	lea    -0x14b4(%ebx),%eax
 6e3:	50                   	push   %eax
 6e4:	51                   	push   %ecx
 6e5:	56                   	push   %esi
 6e6:	ff b3 34 00 00 00    	pushl  0x34(%ebx)
 6ec:	e8 8f ff ff ff       	call   680 <__libc_start_main@plt>
 6f1:	f4                   	hlt    
 6f2:	8b 1c 24             	mov    (%esp),%ebx
 6f5:	c3                   	ret    
 6f6:	66 90                	xchg   %ax,%ax
 6f8:	66 90                	xchg   %ax,%ax
 6fa:	66 90                	xchg   %ax,%ax
 6fc:	66 90                	xchg   %ax,%ax
 6fe:	66 90                	xchg   %ax,%ax

00000700 <__x86.get_pc_thunk.bx>:
 700:	8b 1c 24             	mov    (%esp),%ebx
 703:	c3                   	ret    
 704:	66 90                	xchg   %ax,%ax
 706:	66 90                	xchg   %ax,%ax
 708:	66 90                	xchg   %ax,%ax
 70a:	66 90                	xchg   %ax,%ax
 70c:	66 90                	xchg   %ax,%ax
 70e:	66 90                	xchg   %ax,%ax

00000710 <deregister_tm_clones>:
 710:	e8 e4 00 00 00       	call   7f9 <__x86.get_pc_thunk.dx>
 715:	81 c2 af 18 00 00    	add    $0x18af,%edx
 71b:	8d 8a 54 00 00 00    	lea    0x54(%edx),%ecx
 721:	8d 82 54 00 00 00    	lea    0x54(%edx),%eax
 727:	39 c8                	cmp    %ecx,%eax
 729:	74 1d                	je     748 <deregister_tm_clones+0x38>
 72b:	8b 82 28 00 00 00    	mov    0x28(%edx),%eax
 731:	85 c0                	test   %eax,%eax
 733:	74 13                	je     748 <deregister_tm_clones+0x38>
 735:	55                   	push   %ebp
 736:	89 e5                	mov    %esp,%ebp
 738:	83 ec 14             	sub    $0x14,%esp
 73b:	51                   	push   %ecx
 73c:	ff d0                	call   *%eax
 73e:	83 c4 10             	add    $0x10,%esp
 741:	c9                   	leave  
 742:	c3                   	ret    
 743:	90                   	nop
 744:	8d 74 26 00          	lea    0x0(%esi,%eiz,1),%esi
 748:	f3 c3                	repz ret 
 74a:	8d b6 00 00 00 00    	lea    0x0(%esi),%esi

00000750 <register_tm_clones>:
 750:	e8 a4 00 00 00       	call   7f9 <__x86.get_pc_thunk.dx>
 755:	81 c2 6f 18 00 00    	add    $0x186f,%edx
 75b:	55                   	push   %ebp
 75c:	8d 8a 54 00 00 00    	lea    0x54(%edx),%ecx
 762:	8d 82 54 00 00 00    	lea    0x54(%edx),%eax
 768:	29 c8                	sub    %ecx,%eax
 76a:	89 e5                	mov    %esp,%ebp
 76c:	53                   	push   %ebx
 76d:	c1 f8 02             	sar    $0x2,%eax
 770:	89 c3                	mov    %eax,%ebx
 772:	83 ec 04             	sub    $0x4,%esp
 775:	c1 eb 1f             	shr    $0x1f,%ebx
 778:	01 d8                	add    %ebx,%eax
 77a:	d1 f8                	sar    %eax
 77c:	74 14                	je     792 <register_tm_clones+0x42>
 77e:	8b 92 38 00 00 00    	mov    0x38(%edx),%edx
 784:	85 d2                	test   %edx,%edx
 786:	74 0a                	je     792 <register_tm_clones+0x42>
 788:	83 ec 08             	sub    $0x8,%esp
 78b:	50                   	push   %eax
 78c:	51                   	push   %ecx
 78d:	ff d2                	call   *%edx
 78f:	83 c4 10             	add    $0x10,%esp
 792:	8b 5d fc             	mov    -0x4(%ebp),%ebx
 795:	c9                   	leave  
 796:	c3                   	ret    
 797:	89 f6                	mov    %esi,%esi
 799:	8d bc 27 00 00 00 00 	lea    0x0(%edi,%eiz,1),%edi

000007a0 <__do_global_dtors_aux>:
 7a0:	55                   	push   %ebp
 7a1:	89 e5                	mov    %esp,%ebp
 7a3:	53                   	push   %ebx
 7a4:	e8 57 ff ff ff       	call   700 <__x86.get_pc_thunk.bx>
 7a9:	81 c3 1b 18 00 00    	add    $0x181b,%ebx
 7af:	83 ec 04             	sub    $0x4,%esp
 7b2:	80 bb 64 00 00 00 00 	cmpb   $0x0,0x64(%ebx)
 7b9:	75 27                	jne    7e2 <__do_global_dtors_aux+0x42>
 7bb:	8b 83 2c 00 00 00    	mov    0x2c(%ebx),%eax
 7c1:	85 c0                	test   %eax,%eax
 7c3:	74 11                	je     7d6 <__do_global_dtors_aux+0x36>
 7c5:	83 ec 0c             	sub    $0xc,%esp
 7c8:	ff b3 40 00 00 00    	pushl  0x40(%ebx)
 7ce:	e8 dd fe ff ff       	call   6b0 <__cxa_finalize@plt>
 7d3:	83 c4 10             	add    $0x10,%esp
 7d6:	e8 35 ff ff ff       	call   710 <deregister_tm_clones>
 7db:	c6 83 64 00 00 00 01 	movb   $0x1,0x64(%ebx)
 7e2:	8b 5d fc             	mov    -0x4(%ebp),%ebx
 7e5:	c9                   	leave  
 7e6:	c3                   	ret    
 7e7:	89 f6                	mov    %esi,%esi
 7e9:	8d bc 27 00 00 00 00 	lea    0x0(%edi,%eiz,1),%edi

000007f0 <frame_dummy>:
 7f0:	55                   	push   %ebp
 7f1:	89 e5                	mov    %esp,%ebp
 7f3:	5d                   	pop    %ebp
 7f4:	e9 57 ff ff ff       	jmp    750 <register_tm_clones>

000007f9 <__x86.get_pc_thunk.dx>:
 7f9:	8b 14 24             	mov    (%esp),%edx
 7fc:	c3                   	ret    

000007fd <main>:
 7fd:	55                   	push   %ebp
 7fe:	89 e5                	mov    %esp,%ebp
 800:	a1 00 00 00 00       	mov    0x0,%eax
 805:	6a 00                	push   $0x0
 807:	6a 02                	push   $0x2
 809:	6a 00                	push   $0x0
 80b:	50                   	push   %eax
 80c:	e8 fc ff ff ff       	call   80d <main+0x10>
 811:	83 c4 10             	add    $0x10,%esp
 814:	a1 00 00 00 00       	mov    0x0,%eax
 819:	6a 00                	push   $0x0
 81b:	6a 02                	push   $0x2
 81d:	6a 00                	push   $0x0
 81f:	50                   	push   %eax
 820:	e8 fc ff ff ff       	call   821 <main+0x24>
 825:	83 c4 10             	add    $0x10,%esp
 828:	e8 56 00 00 00       	call   883 <levelone>
 82d:	83 f0 01             	xor    $0x1,%eax
 830:	84 c0                	test   %al,%al
 832:	74 07                	je     83b <main+0x3e>
 834:	b8 00 00 00 00       	mov    $0x0,%eax
 839:	eb 46                	jmp    881 <main+0x84>
 83b:	e8 00 01 00 00       	call   940 <leveltwo>
 840:	83 f0 01             	xor    $0x1,%eax
 843:	84 c0                	test   %al,%al
 845:	74 07                	je     84e <main+0x51>
 847:	b8 00 00 00 00       	mov    $0x0,%eax
 84c:	eb 33                	jmp    881 <main+0x84>
 84e:	e8 e1 01 00 00       	call   a34 <levelthree>
 853:	83 f0 01             	xor    $0x1,%eax
 856:	84 c0                	test   %al,%al
 858:	74 07                	je     861 <main+0x64>
 85a:	b8 00 00 00 00       	mov    $0x0,%eax
 85f:	eb 20                	jmp    881 <main+0x84>
 861:	68 90 0b 00 00       	push   $0xb90
 866:	e8 fc ff ff ff       	call   867 <main+0x6a>
 86b:	83 c4 04             	add    $0x4,%esp
 86e:	a1 00 00 00 00       	mov    0x0,%eax
 873:	50                   	push   %eax
 874:	e8 fc ff ff ff       	call   875 <main+0x78>
 879:	83 c4 04             	add    $0x4,%esp
 87c:	b8 00 00 00 00       	mov    $0x0,%eax
 881:	c9                   	leave  
 882:	c3                   	ret    

00000883 <levelone>:
 883:	55                   	push   %ebp
 884:	89 e5                	mov    %esp,%ebp
 886:	83 ec 2c             	sub    $0x2c,%esp
 889:	c7 45 e8 57 a0 8c e4 	movl   $0xe48ca057,-0x18(%ebp)
 890:	c7 45 ec 7b c8 77 6c 	movl   $0x6c77c87b,-0x14(%ebp)
 897:	c7 45 f0 af 83 6f 53 	movl   $0x536f83af,-0x10(%ebp)
 89e:	c7 45 f4 43 c7 01 12 	movl   $0x1201c743,-0xc(%ebp)
 8a5:	8d 45 d7             	lea    -0x29(%ebp),%eax
 8a8:	89 45 f8             	mov    %eax,-0x8(%ebp)
 8ab:	68 a4 0b 00 00       	push   $0xba4
 8b0:	e8 fc ff ff ff       	call   8b1 <levelone+0x2e>
 8b5:	83 c4 04             	add    $0x4,%esp
 8b8:	68 ec 0b 00 00       	push   $0xbec
 8bd:	e8 fc ff ff ff       	call   8be <levelone+0x3b>
 8c2:	83 c4 04             	add    $0x4,%esp
 8c5:	68 a4 0b 00 00       	push   $0xba4
 8ca:	e8 fc ff ff ff       	call   8cb <levelone+0x48>
 8cf:	83 c4 04             	add    $0x4,%esp
 8d2:	68 31 0c 00 00       	push   $0xc31
 8d7:	e8 fc ff ff ff       	call   8d8 <levelone+0x55>
 8dc:	83 c4 04             	add    $0x4,%esp
 8df:	a1 00 00 00 00       	mov    0x0,%eax
 8e4:	50                   	push   %eax
 8e5:	e8 fc ff ff ff       	call   8e6 <levelone+0x63>
 8ea:	83 c4 04             	add    $0x4,%esp
 8ed:	8d 45 d7             	lea    -0x29(%ebp),%eax
 8f0:	50                   	push   %eax
 8f1:	68 35 0c 00 00       	push   $0xc35
 8f6:	e8 fc ff ff ff       	call   8f7 <levelone+0x74>
 8fb:	83 c4 08             	add    $0x8,%esp
 8fe:	c7 45 fc 00 00 00 00 	movl   $0x0,-0x4(%ebp)
 905:	eb 2c                	jmp    933 <levelone+0xb0>
 907:	b8 03 00 00 00       	mov    $0x3,%eax
 90c:	2b 45 fc             	sub    -0x4(%ebp),%eax
 90f:	8b 54 85 e8          	mov    -0x18(%ebp,%eax,4),%edx
 913:	8b 45 fc             	mov    -0x4(%ebp),%eax
 916:	8d 0c 85 00 00 00 00 	lea    0x0(,%eax,4),%ecx
 91d:	8b 45 f8             	mov    -0x8(%ebp),%eax
 920:	01 c8                	add    %ecx,%eax
 922:	8b 00                	mov    (%eax),%eax
 924:	39 c2                	cmp    %eax,%edx
 926:	74 07                	je     92f <levelone+0xac>
 928:	b8 00 00 00 00       	mov    $0x0,%eax
 92d:	eb 0f                	jmp    93e <levelone+0xbb>
 92f:	83 45 fc 01          	addl   $0x1,-0x4(%ebp)
 933:	83 7d fc 03          	cmpl   $0x3,-0x4(%ebp)
 937:	7e ce                	jle    907 <levelone+0x84>
 939:	b8 01 00 00 00       	mov    $0x1,%eax
 93e:	c9                   	leave  
 93f:	c3                   	ret    

00000940 <leveltwo>:
 940:	55                   	push   %ebp
 941:	89 e5                	mov    %esp,%ebp
 943:	57                   	push   %edi
 944:	56                   	push   %esi
 945:	53                   	push   %ebx
 946:	83 ec 1c             	sub    $0x1c,%esp
 949:	68 a4 0b 00 00       	push   $0xba4
 94e:	e8 fc ff ff ff       	call   94f <leveltwo+0xf>
 953:	83 c4 04             	add    $0x4,%esp
 956:	68 3c 0c 00 00       	push   $0xc3c
 95b:	e8 fc ff ff ff       	call   95c <leveltwo+0x1c>
 960:	83 c4 04             	add    $0x4,%esp
 963:	68 a4 0b 00 00       	push   $0xba4
 968:	e8 fc ff ff ff       	call   969 <leveltwo+0x29>
 96d:	83 c4 04             	add    $0x4,%esp
 970:	68 31 0c 00 00       	push   $0xc31
 975:	e8 fc ff ff ff       	call   976 <leveltwo+0x36>
 97a:	83 c4 04             	add    $0x4,%esp
 97d:	a1 00 00 00 00       	mov    0x0,%eax
 982:	50                   	push   %eax
 983:	e8 fc ff ff ff       	call   984 <leveltwo+0x44>
 988:	83 c4 04             	add    $0x4,%esp
 98b:	8d 45 e8             	lea    -0x18(%ebp),%eax
 98e:	83 c0 07             	add    $0x7,%eax
 991:	89 45 d8             	mov    %eax,-0x28(%ebp)
 994:	8d 7d e8             	lea    -0x18(%ebp),%edi
 997:	83 c7 06             	add    $0x6,%edi
 99a:	8d 75 e8             	lea    -0x18(%ebp),%esi
 99d:	83 c6 05             	add    $0x5,%esi
 9a0:	8d 5d e8             	lea    -0x18(%ebp),%ebx
 9a3:	83 c3 04             	add    $0x4,%ebx
 9a6:	8d 4d e8             	lea    -0x18(%ebp),%ecx
 9a9:	83 c1 03             	add    $0x3,%ecx
 9ac:	8d 55 e8             	lea    -0x18(%ebp),%edx
 9af:	83 c2 02             	add    $0x2,%edx
 9b2:	8d 45 e8             	lea    -0x18(%ebp),%eax
 9b5:	83 c0 01             	add    $0x1,%eax
 9b8:	ff 75 d8             	pushl  -0x28(%ebp)
 9bb:	57                   	push   %edi
 9bc:	56                   	push   %esi
 9bd:	53                   	push   %ebx
 9be:	51                   	push   %ecx
 9bf:	52                   	push   %edx
 9c0:	50                   	push   %eax
 9c1:	8d 45 e8             	lea    -0x18(%ebp),%eax
 9c4:	50                   	push   %eax
 9c5:	68 81 0c 00 00       	push   $0xc81
 9ca:	e8 fc ff ff ff       	call   9cb <leveltwo+0x8b>
 9cf:	83 c4 24             	add    $0x24,%esp
 9d2:	c7 45 f0 00 00 00 00 	movl   $0x0,-0x10(%ebp)
 9d9:	eb 26                	jmp    a01 <leveltwo+0xc1>
 9db:	8d 55 e8             	lea    -0x18(%ebp),%edx
 9de:	8b 45 f0             	mov    -0x10(%ebp),%eax
 9e1:	01 d0                	add    %edx,%eax
 9e3:	0f b6 00             	movzbl (%eax),%eax
 9e6:	0f be c0             	movsbl %al,%eax
 9e9:	83 e0 0f             	and    $0xf,%eax
 9ec:	0f b6 80 08 20 00 00 	movzbl 0x2008(%eax),%eax
 9f3:	8d 4d df             	lea    -0x21(%ebp),%ecx
 9f6:	8b 55 f0             	mov    -0x10(%ebp),%edx
 9f9:	01 ca                	add    %ecx,%edx
 9fb:	88 02                	mov    %al,(%edx)
 9fd:	83 45 f0 01          	addl   $0x1,-0x10(%ebp)
 a01:	83 7d f0 07          	cmpl   $0x7,-0x10(%ebp)
 a05:	7e d4                	jle    9db <leveltwo+0x9b>
 a07:	c6 45 e7 00          	movb   $0x0,-0x19(%ebp)
 a0b:	68 92 0c 00 00       	push   $0xc92
 a10:	8d 45 df             	lea    -0x21(%ebp),%eax
 a13:	50                   	push   %eax
 a14:	e8 fc ff ff ff       	call   a15 <leveltwo+0xd5>
 a19:	83 c4 08             	add    $0x8,%esp
 a1c:	85 c0                	test   %eax,%eax
 a1e:	74 07                	je     a27 <leveltwo+0xe7>
 a20:	b8 00 00 00 00       	mov    $0x0,%eax
 a25:	eb 05                	jmp    a2c <leveltwo+0xec>
 a27:	b8 01 00 00 00       	mov    $0x1,%eax
 a2c:	8d 65 f4             	lea    -0xc(%ebp),%esp
 a2f:	5b                   	pop    %ebx
 a30:	5e                   	pop    %esi
 a31:	5f                   	pop    %edi
 a32:	5d                   	pop    %ebp
 a33:	c3                   	ret    

00000a34 <levelthree>:
 a34:	55                   	push   %ebp
 a35:	89 e5                	mov    %esp,%ebp
 a37:	83 ec 2c             	sub    $0x2c,%esp
 a3a:	c7 45 d4 07 00 00 00 	movl   $0x7,-0x2c(%ebp)
 a41:	c7 45 dc 02 00 00 00 	movl   $0x2,-0x24(%ebp)
 a48:	c7 45 e4 09 00 00 00 	movl   $0x9,-0x1c(%ebp)
 a4f:	c7 45 ec 02 00 00 00 	movl   $0x2,-0x14(%ebp)
 a56:	c7 45 f4 06 00 00 00 	movl   $0x6,-0xc(%ebp)
 a5d:	68 a4 0b 00 00       	push   $0xba4
 a62:	e8 fc ff ff ff       	call   a63 <levelthree+0x2f>
 a67:	83 c4 04             	add    $0x4,%esp
 a6a:	68 9c 0c 00 00       	push   $0xc9c
 a6f:	e8 fc ff ff ff       	call   a70 <levelthree+0x3c>
 a74:	83 c4 04             	add    $0x4,%esp
 a77:	68 a4 0b 00 00       	push   $0xba4
 a7c:	e8 fc ff ff ff       	call   a7d <levelthree+0x49>
 a81:	83 c4 04             	add    $0x4,%esp
 a84:	68 31 0c 00 00       	push   $0xc31
 a89:	e8 fc ff ff ff       	call   a8a <levelthree+0x56>
 a8e:	83 c4 04             	add    $0x4,%esp
 a91:	a1 00 00 00 00       	mov    0x0,%eax
 a96:	50                   	push   %eax
 a97:	e8 fc ff ff ff       	call   a98 <levelthree+0x64>
 a9c:	83 c4 04             	add    $0x4,%esp
 a9f:	8d 45 d4             	lea    -0x2c(%ebp),%eax
 aa2:	83 c0 04             	add    $0x4,%eax
 aa5:	50                   	push   %eax
 aa6:	8d 45 d4             	lea    -0x2c(%ebp),%eax
 aa9:	83 c0 0c             	add    $0xc,%eax
 aac:	50                   	push   %eax
 aad:	8d 45 d4             	lea    -0x2c(%ebp),%eax
 ab0:	83 c0 14             	add    $0x14,%eax
 ab3:	50                   	push   %eax
 ab4:	8d 45 d4             	lea    -0x2c(%ebp),%eax
 ab7:	83 c0 1c             	add    $0x1c,%eax
 aba:	50                   	push   %eax
 abb:	8d 45 d4             	lea    -0x2c(%ebp),%eax
 abe:	83 c0 24             	add    $0x24,%eax
 ac1:	50                   	push   %eax
 ac2:	68 e1 0c 00 00       	push   $0xce1
 ac7:	e8 fc ff ff ff       	call   ac8 <levelthree+0x94>
 acc:	83 c4 18             	add    $0x18,%esp
 acf:	c7 45 fc 00 00 00 00 	movl   $0x0,-0x4(%ebp)
 ad6:	eb 20                	jmp    af8 <levelthree+0xc4>
 ad8:	8b 45 fc             	mov    -0x4(%ebp),%eax
 adb:	8b 54 c5 d8          	mov    -0x28(%ebp,%eax,8),%edx
 adf:	8b 45 fc             	mov    -0x4(%ebp),%eax
 ae2:	8b 44 c5 d4          	mov    -0x2c(%ebp,%eax,8),%eax
 ae6:	01 d0                	add    %edx,%eax
 ae8:	83 f8 0a             	cmp    $0xa,%eax
 aeb:	74 07                	je     af4 <levelthree+0xc0>
 aed:	b8 00 00 00 00       	mov    $0x0,%eax
 af2:	eb 0f                	jmp    b03 <levelthree+0xcf>
 af4:	83 45 fc 01          	addl   $0x1,-0x4(%ebp)
 af8:	83 7d fc 04          	cmpl   $0x4,-0x4(%ebp)
 afc:	7e da                	jle    ad8 <levelthree+0xa4>
 afe:	b8 01 00 00 00       	mov    $0x1,%eax
 b03:	c9                   	leave  
 b04:	c3                   	ret    
 b05:	66 90                	xchg   %ax,%ax
 b07:	66 90                	xchg   %ax,%ax
 b09:	66 90                	xchg   %ax,%ax
 b0b:	66 90                	xchg   %ax,%ax
 b0d:	66 90                	xchg   %ax,%ax
 b0f:	90                   	nop

00000b10 <__libc_csu_init>:
 b10:	55                   	push   %ebp
 b11:	57                   	push   %edi
 b12:	56                   	push   %esi
 b13:	53                   	push   %ebx
 b14:	e8 e7 fb ff ff       	call   700 <__x86.get_pc_thunk.bx>
 b19:	81 c3 ab 14 00 00    	add    $0x14ab,%ebx
 b1f:	83 ec 0c             	sub    $0xc,%esp
 b22:	8b 6c 24 28          	mov    0x28(%esp),%ebp
 b26:	8d b3 fc fe ff ff    	lea    -0x104(%ebx),%esi
 b2c:	e8 d3 fa ff ff       	call   604 <_init>
 b31:	8d 83 f8 fe ff ff    	lea    -0x108(%ebx),%eax
 b37:	29 c6                	sub    %eax,%esi
 b39:	c1 fe 02             	sar    $0x2,%esi
 b3c:	85 f6                	test   %esi,%esi
 b3e:	74 25                	je     b65 <__libc_csu_init+0x55>
 b40:	31 ff                	xor    %edi,%edi
 b42:	8d b6 00 00 00 00    	lea    0x0(%esi),%esi
 b48:	83 ec 04             	sub    $0x4,%esp
 b4b:	55                   	push   %ebp
 b4c:	ff 74 24 2c          	pushl  0x2c(%esp)
 b50:	ff 74 24 2c          	pushl  0x2c(%esp)
 b54:	ff 94 bb f8 fe ff ff 	call   *-0x108(%ebx,%edi,4)
 b5b:	83 c7 01             	add    $0x1,%edi
 b5e:	83 c4 10             	add    $0x10,%esp
 b61:	39 fe                	cmp    %edi,%esi
 b63:	75 e3                	jne    b48 <__libc_csu_init+0x38>
 b65:	83 c4 0c             	add    $0xc,%esp
 b68:	5b                   	pop    %ebx
 b69:	5e                   	pop    %esi
 b6a:	5f                   	pop    %edi
 b6b:	5d                   	pop    %ebp
 b6c:	c3                   	ret    
 b6d:	8d 76 00             	lea    0x0(%esi),%esi

00000b70 <__libc_csu_fini>:
 b70:	f3 c3                	repz ret 

Disassembly of section .fini:

00000b74 <_fini>:
 b74:	53                   	push   %ebx
 b75:	83 ec 08             	sub    $0x8,%esp
 b78:	e8 83 fb ff ff       	call   700 <__x86.get_pc_thunk.bx>
 b7d:	81 c3 47 14 00 00    	add    $0x1447,%ebx
 b83:	83 c4 08             	add    $0x8,%esp
 b86:	5b                   	pop    %ebx
 b87:	c3                   	ret    
