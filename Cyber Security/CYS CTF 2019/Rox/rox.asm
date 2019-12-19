
Rox:     file format elf64-x86-64


Disassembly of section .init:

0000000000000670 <_init>:
 670:   48 83 ec 08             sub    rsp,0x8
 674:   48 8b 05 6d 09 20 00    mov    rax,QWORD PTR [rip+0x20096d]        # 200fe8 <__gmon_start__>
 67b:   48 85 c0                test   rax,rax
 67e:   74 02                   je     682 <_init+0x12>
 680:   ff d0                   call   rax
 682:   48 83 c4 08             add    rsp,0x8
 686:   c3                      ret    

Disassembly of section .plt:

0000000000000690 <.plt>:
 690:   ff 35 02 09 20 00       push   QWORD PTR [rip+0x200902]        # 200f98 <_GLOBAL_OFFSET_TABLE_+0x8>
 696:   ff 25 04 09 20 00       jmp    QWORD PTR [rip+0x200904]        # 200fa0 <_GLOBAL_OFFSET_TABLE_+0x10>
 69c:   0f 1f 40 00             nop    DWORD PTR [rax+0x0]

00000000000006a0 <puts@plt>:
 6a0:   ff 25 02 09 20 00       jmp    QWORD PTR [rip+0x200902]        # 200fa8 <puts@GLIBC_2.2.5>
 6a6:   68 00 00 00 00          push   0x0
 6ab:   e9 e0 ff ff ff          jmp    690 <.plt>

00000000000006b0 <strlen@plt>:
 6b0:   ff 25 fa 08 20 00       jmp    QWORD PTR [rip+0x2008fa]        # 200fb0 <strlen@GLIBC_2.2.5>
 6b6:   68 01 00 00 00          push   0x1
 6bb:   e9 d0 ff ff ff          jmp    690 <.plt>

00000000000006c0 <__stack_chk_fail@plt>:
 6c0:   ff 25 f2 08 20 00       jmp    QWORD PTR [rip+0x2008f2]        # 200fb8 <__stack_chk_fail@GLIBC_2.4>
 6c6:   68 02 00 00 00          push   0x2
 6cb:   e9 c0 ff ff ff          jmp    690 <.plt>

00000000000006d0 <printf@plt>:
 6d0:   ff 25 ea 08 20 00       jmp    QWORD PTR [rip+0x2008ea]        # 200fc0 <printf@GLIBC_2.2.5>
 6d6:   68 03 00 00 00          push   0x3
 6db:   e9 b0 ff ff ff          jmp    690 <.plt>

00000000000006e0 <strcspn@plt>:
 6e0:   ff 25 e2 08 20 00       jmp    QWORD PTR [rip+0x2008e2]        # 200fc8 <strcspn@GLIBC_2.2.5>
 6e6:   68 04 00 00 00          push   0x4
 6eb:   e9 a0 ff ff ff          jmp    690 <.plt>

00000000000006f0 <fgets@plt>:
 6f0:   ff 25 da 08 20 00       jmp    QWORD PTR [rip+0x2008da]        # 200fd0 <fgets@GLIBC_2.2.5>
 6f6:   68 05 00 00 00          push   0x5
 6fb:   e9 90 ff ff ff          jmp    690 <.plt>

Disassembly of section .plt.got:

0000000000000700 <__cxa_finalize@plt>:
 700:   ff 25 f2 08 20 00       jmp    QWORD PTR [rip+0x2008f2]        # 200ff8 <__cxa_finalize@GLIBC_2.2.5>
 706:   66 90                   xchg   ax,ax

Disassembly of section .text:

0000000000000710 <_start>:
 710:   31 ed                   xor    ebp,ebp
 712:   49 89 d1                mov    r9,rdx
 715:   5e                      pop    rsi
 716:   48 89 e2                mov    rdx,rsp
 719:   48 83 e4 f0             and    rsp,0xfffffffffffffff0
 71d:   50                      push   rax
 71e:   54                      push   rsp
 71f:   4c 8d 05 4a 04 00 00    lea    r8,[rip+0x44a]        # b70 <__libc_csu_fini>
 726:   48 8d 0d d3 03 00 00    lea    rcx,[rip+0x3d3]        # b00 <__libc_csu_init>
 72d:   48 8d 3d c4 01 00 00    lea    rdi,[rip+0x1c4]        # 8f8 <main>
 734:   ff 15 a6 08 20 00       call   QWORD PTR [rip+0x2008a6]        # 200fe0 <__libc_start_main@GLIBC_2.2.5>
 73a:   f4                      hlt    
 73b:   0f 1f 44 00 00          nop    DWORD PTR [rax+rax*1+0x0]

0000000000000740 <deregister_tm_clones>:
 740:   48 8d 3d c9 08 20 00    lea    rdi,[rip+0x2008c9]        # 201010 <stdin@@GLIBC_2.2.5>
 747:   55                      push   rbp
 748:   48 8d 05 c1 08 20 00    lea    rax,[rip+0x2008c1]        # 201010 <stdin@@GLIBC_2.2.5>
 74f:   48 39 f8                cmp    rax,rdi
 752:   48 89 e5                mov    rbp,rsp
 755:   74 19                   je     770 <deregister_tm_clones+0x30>
 757:   48 8b 05 7a 08 20 00    mov    rax,QWORD PTR [rip+0x20087a]        # 200fd8 <_ITM_deregisterTMCloneTable>
 75e:   48 85 c0                test   rax,rax
 761:   74 0d                   je     770 <deregister_tm_clones+0x30>
 763:   5d                      pop    rbp
 764:   ff e0                   jmp    rax
 766:   66 2e 0f 1f 84 00 00    nop    WORD PTR cs:[rax+rax*1+0x0]
 76d:   00 00 00 
 770:   5d                      pop    rbp
 771:   c3                      ret    
 772:   0f 1f 40 00             nop    DWORD PTR [rax+0x0]
 776:   66 2e 0f 1f 84 00 00    nop    WORD PTR cs:[rax+rax*1+0x0]
 77d:   00 00 00 

0000000000000780 <register_tm_clones>:
 780:   48 8d 3d 89 08 20 00    lea    rdi,[rip+0x200889]        # 201010 <stdin@@GLIBC_2.2.5>
 787:   48 8d 35 82 08 20 00    lea    rsi,[rip+0x200882]        # 201010 <stdin@@GLIBC_2.2.5>
 78e:   55                      push   rbp
 78f:   48 29 fe                sub    rsi,rdi
 792:   48 89 e5                mov    rbp,rsp
 795:   48 c1 fe 03             sar    rsi,0x3
 799:   48 89 f0                mov    rax,rsi
 79c:   48 c1 e8 3f             shr    rax,0x3f
 7a0:   48 01 c6                add    rsi,rax
 7a3:   48 d1 fe                sar    rsi,1
 7a6:   74 18                   je     7c0 <register_tm_clones+0x40>
 7a8:   48 8b 05 41 08 20 00    mov    rax,QWORD PTR [rip+0x200841]        # 200ff0 <_ITM_registerTMCloneTable>
 7af:   48 85 c0                test   rax,rax
 7b2:   74 0c                   je     7c0 <register_tm_clones+0x40>
 7b4:   5d                      pop    rbp
 7b5:   ff e0                   jmp    rax
 7b7:   66 0f 1f 84 00 00 00    nop    WORD PTR [rax+rax*1+0x0]
 7be:   00 00 
 7c0:   5d                      pop    rbp
 7c1:   c3                      ret    
 7c2:   0f 1f 40 00             nop    DWORD PTR [rax+0x0]
 7c6:   66 2e 0f 1f 84 00 00    nop    WORD PTR cs:[rax+rax*1+0x0]
 7cd:   00 00 00 

00000000000007d0 <__do_global_dtors_aux>:
 7d0:   80 3d 41 08 20 00 00    cmp    BYTE PTR [rip+0x200841],0x0        # 201018 <completed.7697>
 7d7:   75 2f                   jne    808 <__do_global_dtors_aux+0x38>
 7d9:   48 83 3d 17 08 20 00    cmp    QWORD PTR [rip+0x200817],0x0        # 200ff8 <__cxa_finalize@GLIBC_2.2.5>
 7e0:   00 
 7e1:   55                      push   rbp
 7e2:   48 89 e5                mov    rbp,rsp
 7e5:   74 0c                   je     7f3 <__do_global_dtors_aux+0x23>
 7e7:   48 8b 3d 1a 08 20 00    mov    rdi,QWORD PTR [rip+0x20081a]        # 201008 <__dso_handle>
 7ee:   e8 0d ff ff ff          call   700 <__cxa_finalize@plt>
 7f3:   e8 48 ff ff ff          call   740 <deregister_tm_clones>
 7f8:   c6 05 19 08 20 00 01    mov    BYTE PTR [rip+0x200819],0x1        # 201018 <completed.7697>
 7ff:   5d                      pop    rbp
 800:   c3                      ret    
 801:   0f 1f 80 00 00 00 00    nop    DWORD PTR [rax+0x0]
 808:   f3 c3                   repz ret 
 80a:   66 0f 1f 44 00 00       nop    WORD PTR [rax+rax*1+0x0]

0000000000000810 <frame_dummy>:
 810:   55                      push   rbp
 811:   48 89 e5                mov    rbp,rsp
 814:   5d                      pop    rbp
 815:   e9 66 ff ff ff          jmp    780 <register_tm_clones>

000000000000081a <xor>:
 81a:   55                      push   rbp
 81b:   48 89 e5                mov    rbp,rsp
 81e:   48 83 ec 50             sub    rsp,0x50
 822:   48 89 7d b8             mov    QWORD PTR [rbp-0x48],rdi
 826:   64 48 8b 04 25 28 00    mov    rax,QWORD PTR fs:0x28
 82d:   00 00 
 82f:   48 89 45 f8             mov    QWORD PTR [rbp-0x8],rax
 833:   31 c0                   xor    eax,eax
 835:   c6 45 d0 69             mov    BYTE PTR [rbp-0x30],0x69
 839:   c6 45 d1 cb             mov    BYTE PTR [rbp-0x2f],0xcb
 83d:   c6 45 d2 3c             mov    BYTE PTR [rbp-0x2e],0x3c
 841:   c6 45 d3 4a             mov    BYTE PTR [rbp-0x2d],0x4a
 845:   c6 45 d4 b4             mov    BYTE PTR [rbp-0x2c],0xb4
 849:   c6 45 d5 c2             mov    BYTE PTR [rbp-0x2b],0xc2
 84d:   c6 45 d6 5f             mov    BYTE PTR [rbp-0x2a],0x5f
 851:   c6 45 d7 1a             mov    BYTE PTR [rbp-0x29],0x1a
 855:   c6 45 d8 d4             mov    BYTE PTR [rbp-0x28],0xd4
 859:   c6 45 d9 c7             mov    BYTE PTR [rbp-0x27],0xc7
 85d:   c6 45 da f1             mov    BYTE PTR [rbp-0x26],0xf1
 861:   c6 45 db 2b             mov    BYTE PTR [rbp-0x25],0x2b
 865:   c6 45 dc d3             mov    BYTE PTR [rbp-0x24],0xd3
 869:   c6 45 dd aa             mov    BYTE PTR [rbp-0x23],0xaa
 86d:   c6 45 de 58             mov    BYTE PTR [rbp-0x22],0x58
 871:   c6 45 df 8c             mov    BYTE PTR [rbp-0x21],0x8c
 875:   c6 45 e0 0a             mov    BYTE PTR [rbp-0x20],0xa
 879:   c6 45 e1 52             mov    BYTE PTR [rbp-0x1f],0x52
 87d:   c6 45 e2 bf             mov    BYTE PTR [rbp-0x1e],0xbf
 881:   c6 45 e3 e5             mov    BYTE PTR [rbp-0x1d],0xe5
 885:   c6 45 e4 13             mov    BYTE PTR [rbp-0x1c],0x13
 889:   c6 45 e5 39             mov    BYTE PTR [rbp-0x1b],0x39
 88d:   c6 45 e6 c8             mov    BYTE PTR [rbp-0x1a],0xc8
 891:   c6 45 e7 2d             mov    BYTE PTR [rbp-0x19],0x2d
 895:   c6 45 e8 d3             mov    BYTE PTR [rbp-0x18],0xd3
 899:   c6 45 e9 17             mov    BYTE PTR [rbp-0x17],0x17
 89d:   c7 45 cc 00 00 00 00    mov    DWORD PTR [rbp-0x34],0x0
 8a4:   eb 33                   jmp    8d9 <xor+0xbf>
 8a6:   8b 45 cc                mov    eax,DWORD PTR [rbp-0x34]
 8a9:   48 63 d0                movsxd rdx,eax
 8ac:   48 8b 45 b8             mov    rax,QWORD PTR [rbp-0x48]
 8b0:   48 01 d0                add    rax,rdx
 8b3:   0f b6 08                movzx  ecx,BYTE PTR [rax]
 8b6:   8b 45 cc                mov    eax,DWORD PTR [rbp-0x34]
 8b9:   48 98                   cdqe   
 8bb:   0f b6 44 05 d0          movzx  eax,BYTE PTR [rbp+rax*1-0x30]
 8c0:   89 c6                   mov    esi,eax
 8c2:   8b 45 cc                mov    eax,DWORD PTR [rbp-0x34]
 8c5:   48 63 d0                movsxd rdx,eax
 8c8:   48 8b 45 b8             mov    rax,QWORD PTR [rbp-0x48]
 8cc:   48 01 d0                add    rax,rdx
 8cf:   31 f1                   xor    ecx,esi
 8d1:   89 ca                   mov    edx,ecx
 8d3:   88 10                   mov    BYTE PTR [rax],dl
 8d5:   83 45 cc 01             add    DWORD PTR [rbp-0x34],0x1
 8d9:   8b 45 cc                mov    eax,DWORD PTR [rbp-0x34]
 8dc:   83 f8 19                cmp    eax,0x19
 8df:   76 c5                   jbe    8a6 <xor+0x8c>
 8e1:   90                      nop
 8e2:   48 8b 45 f8             mov    rax,QWORD PTR [rbp-0x8]
 8e6:   64 48 33 04 25 28 00    xor    rax,QWORD PTR fs:0x28
 8ed:   00 00 
 8ef:   74 05                   je     8f6 <xor+0xdc>
 8f1:   e8 ca fd ff ff          call   6c0 <__stack_chk_fail@plt>
 8f6:   c9                      leave  
 8f7:   c3                      ret    

00000000000008f8 <main>:
 8f8:   55                      push   rbp
 8f9:   48 89 e5                mov    rbp,rsp
 8fc:   48 81 ec d0 00 00 00    sub    rsp,0xd0
 903:   89 bd 3c ff ff ff       mov    DWORD PTR [rbp-0xc4],edi
 909:   48 89 b5 30 ff ff ff    mov    QWORD PTR [rbp-0xd0],rsi
 910:   64 48 8b 04 25 28 00    mov    rax,QWORD PTR fs:0x28
 917:   00 00 
 919:   48 89 45 f8             mov    QWORD PTR [rbp-0x8],rax
 91d:   31 c0                   xor    eax,eax
 91f:   c6 85 50 ff ff ff 2a    mov    BYTE PTR [rbp-0xb0],0x2a
 926:   c6 85 51 ff ff ff 92    mov    BYTE PTR [rbp-0xaf],0x92
 92d:   c6 85 52 ff ff ff 6f    mov    BYTE PTR [rbp-0xae],0x6f
 934:   c6 85 53 ff ff ff 31    mov    BYTE PTR [rbp-0xad],0x31
 93b:   c6 85 54 ff ff ff c6    mov    BYTE PTR [rbp-0xac],0xc6
 942:   c6 85 55 ff ff ff f2    mov    BYTE PTR [rbp-0xab],0xf2
 949:   c6 85 56 ff ff ff 27    mov    BYTE PTR [rbp-0xaa],0x27
 950:   c6 85 57 ff ff ff 2e    mov    BYTE PTR [rbp-0xa9],0x2e
 957:   c6 85 58 ff ff ff ba    mov    BYTE PTR [rbp-0xa8],0xba
 95e:   c6 85 59 ff ff ff a9    mov    BYTE PTR [rbp-0xa7],0xa9
 965:   c6 85 5a ff ff ff c2    mov    BYTE PTR [rbp-0xa6],0xc2
 96c:   c6 85 5b ff ff ff 74    mov    BYTE PTR [rbp-0xa5],0x74
 973:   c6 85 5c ff ff ff ab    mov    BYTE PTR [rbp-0xa4],0xab
 97a:   c6 85 5d ff ff ff 9a    mov    BYTE PTR [rbp-0xa3],0x9a
 981:   c6 85 5e ff ff ff 2a    mov    BYTE PTR [rbp-0xa2],0x2a
 988:   c6 85 5f ff ff ff d3    mov    BYTE PTR [rbp-0xa1],0xd3
 98f:   c6 85 60 ff ff ff 78    mov    BYTE PTR [rbp-0xa0],0x78
 996:   c6 85 61 ff ff ff 62    mov    BYTE PTR [rbp-0x9f],0x62
 99d:   c6 85 62 ff ff ff dc    mov    BYTE PTR [rbp-0x9e],0xdc
 9a4:   c6 85 63 ff ff ff 8e    mov    BYTE PTR [rbp-0x9d],0x8e
 9ab:   c6 85 64 ff ff ff 4c    mov    BYTE PTR [rbp-0x9c],0x4c
 9b2:   c6 85 65 ff ff ff 0c    mov    BYTE PTR [rbp-0x9b],0xc
 9b9:   c6 85 66 ff ff ff fc    mov    BYTE PTR [rbp-0x9a],0xfc
 9c0:   c6 85 67 ff ff ff 43    mov    BYTE PTR [rbp-0x99],0x43
 9c7:   c6 85 68 ff ff ff b7    mov    BYTE PTR [rbp-0x98],0xb7
 9ce:   c6 85 69 ff ff ff 6a    mov    BYTE PTR [rbp-0x97],0x6a
 9d5:   48 8d 3d ac 01 00 00    lea    rdi,[rip+0x1ac]        # b88 <_IO_stdin_used+0x8>
 9dc:   e8 bf fc ff ff          call   6a0 <puts@plt>
 9e1:   48 8d 3d c0 01 00 00    lea    rdi,[rip+0x1c0]        # ba8 <_IO_stdin_used+0x28>
 9e8:   e8 b3 fc ff ff          call   6a0 <puts@plt>
 9ed:   48 8d 3d d4 01 00 00    lea    rdi,[rip+0x1d4]        # bc8 <_IO_stdin_used+0x48>
 9f4:   b8 00 00 00 00          mov    eax,0x0
 9f9:   e8 d2 fc ff ff          call   6d0 <printf@plt>
 9fe:   48 8b 15 0b 06 20 00    mov    rdx,QWORD PTR [rip+0x20060b]        # 201010 <stdin@@GLIBC_2.2.5>
 a05:   48 8d 85 70 ff ff ff    lea    rax,[rbp-0x90]
 a0c:   be 80 00 00 00          mov    esi,0x80
 a11:   48 89 c7                mov    rdi,rax
 a14:   e8 d7 fc ff ff          call   6f0 <fgets@plt>
 a19:   48 8d 85 70 ff ff ff    lea    rax,[rbp-0x90]
 a20:   48 8d 35 c7 01 00 00    lea    rsi,[rip+0x1c7]        # bee <_IO_stdin_used+0x6e>
 a27:   48 89 c7                mov    rdi,rax
 a2a:   e8 b1 fc ff ff          call   6e0 <strcspn@plt>
 a2f:   c6 84 05 70 ff ff ff    mov    BYTE PTR [rbp+rax*1-0x90],0x0
 a36:   00 
 a37:   48 8d 85 70 ff ff ff    lea    rax,[rbp-0x90]
 a3e:   48 89 c7                mov    rdi,rax
 a41:   e8 6a fc ff ff          call   6b0 <strlen@plt>
 a46:   89 85 4c ff ff ff       mov    DWORD PTR [rbp-0xb4],eax
 ////Compare the Length of Characters
 a4c:   83 bd 4c ff ff ff 1a    cmp    DWORD PTR [rbp-0xb4],0x1a
 a53:   74 13                   je     a68 <main+0x170>
 ////Else Code///////////////////////////////////////////
 a55:   48 8d 3d 95 01 00 00    lea    rdi,[rip+0x195]        # bf1 <_IO_stdin_used+0x71>
 a5c:   e8 3f fc ff ff          call   6a0 <puts@plt>
 a61:   b8 00 00 00 00          mov    eax,0x0
 a66:   eb 78                   jmp    ae0 <main+0x1e8>
 a68:   48 8d 85 70 ff ff ff    lea    rax,[rbp-0x90]
 ////Meet Condition Code/////////////////////////////////
 a6f:   48 89 c7                mov    rdi,rax
 a72:   e8 a3 fd ff ff          call   81a <xor>
 a77:   c7 85 48 ff ff ff 00    mov    DWORD PTR [rbp-0xb8],0x0
 a7e:   00 00 00 
 a81:   eb 3e                   jmp    ac1 <main+0x1c9>
 //////Loop //////////////////////////////////////
 a83:   8b 85 48 ff ff ff       mov    eax,DWORD PTR [rbp-0xb8]
 a89:   48 98                   cdqe   
 a8b:   0f b6 94 05 70 ff ff    movzx  edx,BYTE PTR [rbp+rax*1-0x90]
 a92:   ff 
 a93:   8b 85 48 ff ff ff       mov    eax,DWORD PTR [rbp-0xb8]
 a99:   48 98                   cdqe   
 a9b:   0f b6 84 05 50 ff ff    movzx  eax,BYTE PTR [rbp+rax*1-0xb0]
 aa2:   ff 
 aa3:   38 c2                   cmp    dl,al
 aa5:   74 13                   je     aba <main+0x1c2>
 //////////////////////////////////////////////////////////
 aa7:   48 8d 3d 43 01 00 00    lea    rdi,[rip+0x143]        # bf1 <_IO_stdin_used+0x71>
 aae:   e8 ed fb ff ff          call   6a0 <puts@plt>
 ab3:   b8 00 00 00 00          mov    eax,0x0
 ab8:   eb 26                   jmp    ae0 <main+0x1e8>
 aba:   83 85 48 ff ff ff 01    add    DWORD PTR [rbp-0xb8],0x1
 /////////////////////////////////////////////////
 ac1:   8b 85 48 ff ff ff       mov    eax,DWORD PTR [rbp-0xb8]
 ac7:   39 85 4c ff ff ff       cmp    DWORD PTR [rbp-0xb4],eax
 acd:   77 b4                   ja     a83 <main+0x18b>
 //////////Loop End/////////////////////////////////////
 acf:   48 8d 3d 2b 01 00 00    lea    rdi,[rip+0x12b]        # c01 <_IO_stdin_used+0x81>
 ad6:   e8 c5 fb ff ff          call   6a0 <puts@plt>
 adb:   b8 00 00 00 00          mov    eax,0x0
 ae0:   48 8b 4d f8             mov    rcx,QWORD PTR [rbp-0x8]
 ae4:   64 48 33 0c 25 28 00    xor    rcx,QWORD PTR fs:0x28
 aeb:   00 00 
 aed:   74 05                   je     af4 <main+0x1fc>
 aef:   e8 cc fb ff ff          call   6c0 <__stack_chk_fail@plt>
 af4:   c9                      leave  
 af5:   c3                      ret    
 af6:   66 2e 0f 1f 84 00 00    nop    WORD PTR cs:[rax+rax*1+0x0]
 afd:   00 00 00 

0000000000000b00 <__libc_csu_init>:
 b00:   41 57                   push   r15
 b02:   41 56                   push   r14
 b04:   49 89 d7                mov    r15,rdx
 b07:   41 55                   push   r13
 b09:   41 54                   push   r12
 b0b:   4c 8d 25 7e 02 20 00    lea    r12,[rip+0x20027e]        # 200d90 <__frame_dummy_init_array_entry>
 b12:   55                      push   rbp
 b13:   48 8d 2d 7e 02 20 00    lea    rbp,[rip+0x20027e]        # 200d98 <__init_array_end>
 b1a:   53                      push   rbx
 b1b:   41 89 fd                mov    r13d,edi
 b1e:   49 89 f6                mov    r14,rsi
 b21:   4c 29 e5                sub    rbp,r12
 b24:   48 83 ec 08             sub    rsp,0x8
 b28:   48 c1 fd 03             sar    rbp,0x3
 b2c:   e8 3f fb ff ff          call   670 <_init>
 b31:   48 85 ed                test   rbp,rbp
 b34:   74 20                   je     b56 <__libc_csu_init+0x56>
 b36:   31 db                   xor    ebx,ebx
 b38:   0f 1f 84 00 00 00 00    nop    DWORD PTR [rax+rax*1+0x0]
 b3f:   00 
 b40:   4c 89 fa                mov    rdx,r15
 b43:   4c 89 f6                mov    rsi,r14
 b46:   44 89 ef                mov    edi,r13d
 b49:   41 ff 14 dc             call   QWORD PTR [r12+rbx*8]
 b4d:   48 83 c3 01             add    rbx,0x1
 b51:   48 39 dd                cmp    rbp,rbx
 b54:   75 ea                   jne    b40 <__libc_csu_init+0x40>
 b56:   48 83 c4 08             add    rsp,0x8
 b5a:   5b                      pop    rbx
 b5b:   5d                      pop    rbp
 b5c:   41 5c                   pop    r12
 b5e:   41 5d                   pop    r13
 b60:   41 5e                   pop    r14
 b62:   41 5f                   pop    r15
 b64:   c3                      ret    
 b65:   90                      nop
 b66:   66 2e 0f 1f 84 00 00    nop    WORD PTR cs:[rax+rax*1+0x0]
 b6d:   00 00 00 

0000000000000b70 <__libc_csu_fini>:
 b70:   f3 c3                   repz ret 

Disassembly of section .fini:

0000000000000b74 <_fini>:
 b74:   48 83 ec 08             sub    rsp,0x8
 b78:   48 83 c4 08             add    rsp,0x8
 b7c:   c3                      ret    
