            ;-- section..text:
            ;-- .text:
            ;-- _start:
/ (fcn) entry0 49
|   entry0 ();
|           0x000004c0      31ed           xor ebp, ebp                ; [14] -r-x section size 948 named .text
|           0x000004c2      5e             pop esi
|           0x000004c3      89e1           mov ecx, esp
|           0x000004c5      83e4f0         and esp, 0xfffffff0
|           0x000004c8      50             push eax
|           0x000004c9      54             push esp
|           0x000004ca      52             push edx
|           0x000004cb      e822000000     call fcn.000004f2
|           0x000004d0      81c3fc1a0000   add ebx, 0x1afc
|           0x000004d6      8d8384e8ffff   lea eax, dword [ebx - 0x177c]
|           0x000004dc      50             push eax                    ; func fini
|           0x000004dd      8d8324e8ffff   lea eax, dword [ebx - 0x17dc]
|           0x000004e3      50             push eax                    ; func init
|           0x000004e4      51             push ecx                    ; char **ubp_av
|           0x000004e5      56             push esi                    ; int argc
|           0x000004e6      ffb32c000000   push dword [ebx + 0x2c]     ; func main
\           0x000004ec      e89fffffff     call sym.imp.__libc_start_main ; int __libc_start_main(func main, int argc, char **ubp_av, func init, func fini, func rtld_fini, void *stack_end)
            ;-- eip:
/ (fcn) fcn.000004f2 4
|   fcn.000004f2 ();
|           ; CALL XREF from entry0 @ 0x4cb
|           0x000004f2      8b1c24         mov ebx, dword [esp]
\           0x000004f5      c3             ret
/ (fcn) sym.imp.__libc_start_main 6
|   int sym.imp.__libc_start_main (func main, int argc, char **ubp_av, func init, func fini, func rtld_fini, void *stack_end);
|           ; CALL XREF from entry0 @ 0x4ec
\           0x00000490      ffa318000000   jmp dword [ebx + 0x18]
/ (fcn) sym.deregister_tm_clones 53
|   sym.deregister_tm_clones ();
|           ; CALL XREF from entry.fini0 @ 0x5d6
|           0x00000510      e8e4000000     call sym.__x86.get_pc_thunk.dx
|           0x00000515      81c2b71a0000   add edx, 0x1ab7
|           0x0000051b      8d8a3c000000   lea ecx, dword [edx + 0x3c]
|           0x00000521      8d823c000000   lea eax, dword [edx + 0x3c]
|           0x00000527      39c8           cmp eax, ecx
|       ,=< 0x00000529      741d           je 0x548
|       |   0x0000052b      8b8220000000   mov eax, dword [edx + 0x20]
|       |   0x00000531      85c0           test eax, eax
|      ,==< 0x00000533      7413           je 0x548
|      ||   0x00000535      55             push ebp
|      ||   0x00000536      89e5           mov ebp, esp
|      ||   0x00000538      83ec14         sub esp, 0x14
|      ||   0x0000053b      51             push ecx
|      ||   0x0000053c      ffd0           call eax
|      ||   0x0000053e      83c410         add esp, 0x10
|      ||   0x00000541      c9             leave
|      ||   0x00000542      c3             ret
..
|      ||   ; CODE XREFS from sym.deregister_tm_clones @ 0x529, 0x533
\      ``-> 0x00000548      f3c3           ret
/ (fcn) sym.__x86.get_pc_thunk.dx 4
|   sym.__x86.get_pc_thunk.dx ();
|           ; CALL XREF from sym.deregister_tm_clones @ 0x510
|           ; CALL XREF from sym.register_tm_clones @ 0x550
|           0x000005f9      8b1424         mov edx, dword [esp]
\           0x000005fc      c3             ret
/ (fcn) sym.register_tm_clones 71
|   sym.register_tm_clones ();
|           ; var int32_t var_4h @ ebp-0x4
|           ; CODE XREF from entry.init0 @ 0x5f4
|           0x00000550      e8a4000000     call sym.__x86.get_pc_thunk.dx
|           0x00000555      81c2771a0000   add edx, 0x1a77
|           0x0000055b      55             push ebp
|           0x0000055c      8d8a3c000000   lea ecx, dword [edx + 0x3c]
|           0x00000562      8d823c000000   lea eax, dword [edx + 0x3c]
|           0x00000568      29c8           sub eax, ecx
|           0x0000056a      89e5           mov ebp, esp
|           0x0000056c      53             push ebx
|           0x0000056d      c1f802         sar eax, 2
|           0x00000570      89c3           mov ebx, eax
|           0x00000572      83ec04         sub esp, 4
|           0x00000575      c1eb1f         shr ebx, 0x1f
|           0x00000578      01d8           add eax, ebx
|           0x0000057a      d1f8           sar eax, 1
|       ,=< 0x0000057c      7414           je 0x592
|       |   0x0000057e      8b9230000000   mov edx, dword [edx + 0x30]
|       |   0x00000584      85d2           test edx, edx
|      ,==< 0x00000586      740a           je 0x592
|      ||   0x00000588      83ec08         sub esp, 8
|      ||   0x0000058b      50             push eax
|      ||   0x0000058c      51             push ecx
|      ||   0x0000058d      ffd2           call edx
|      ||   0x0000058f      83c410         add esp, 0x10
|      ||   ; CODE XREFS from sym.register_tm_clones @ 0x57c, 0x586
|      ``-> 0x00000592      8b5dfc         mov ebx, dword [var_4h]
|           0x00000595      c9             leave
\           0x00000596      c3             ret
            ;-- __do_global_dtors_aux:
/ (fcn) entry.fini0 71
|   entry.fini0 ();
|           ; var int32_t var_4h @ ebp-0x4
|           0x000005a0      55             push ebp
|           0x000005a1      89e5           mov ebp, esp
|           0x000005a3      53             push ebx
|           0x000005a4      e857ffffff     call sym.__x86.get_pc_thunk.bx
|           0x000005a9      81c3231a0000   add ebx, 0x1a23
|           0x000005af      83ec04         sub esp, 4
|           0x000005b2      80bb3c000000.  cmp byte [ebx + 0x3c], 0
|       ,=< 0x000005b9      7527           jne 0x5e2
|       |   0x000005bb      8b8324000000   mov eax, dword [ebx + 0x24]
|       |   0x000005c1      85c0           test eax, eax
|      ,==< 0x000005c3      7411           je 0x5d6
|      ||   0x000005c5      83ec0c         sub esp, 0xc
|      ||   0x000005c8      ffb338000000   push dword [ebx + 0x38]
|      ||   0x000005ce      e8ddfeffff     call sym..plt.got
|      ||   0x000005d3      83c410         add esp, 0x10
|      ||   ; CODE XREF from entry.fini0 @ 0x5c3
|      `--> 0x000005d6      e835ffffff     call sym.deregister_tm_clones
|       |   0x000005db      c6833c000000.  mov byte [ebx + 0x3c], 1
|       |   ; CODE XREF from entry.fini0 @ 0x5b9
|       `-> 0x000005e2      8b5dfc         mov ebx, dword [var_4h]
|           0x000005e5      c9             leave
\           0x000005e6      c3             ret
/ (fcn) sym.__x86.get_pc_thunk.bx 4
|   sym.__x86.get_pc_thunk.bx ();
|           ; XREFS: CALL 0x00000424  CALL 0x000005a4  CALL 0x00000708  
|           ; XREFS: CALL 0x000007f4  CALL 0x00000861  CALL 0x00000878  
|           0x00000500      8b1c24         mov ebx, dword [esp]
\           0x00000503      c3             ret
        :   ;-- frame_dummy:
/ (fcn) entry.init0 9
|   entry.init0 ();
|       :   0x000005f0      55             push ebp
|       :   0x000005f1      89e5           mov ebp, esp
|       :   0x000005f3      5d             pop ebp
\       `=< 0x000005f4      e957ffffff     jmp sym.register_tm_clones
/ (fcn) sym.__libc_csu_fini 2
|   sym.__libc_csu_fini ();
\           0x00000850      f3c3           ret
            ;-- section..fini:
            ;-- .fini:
/ (fcn) sym._fini 20
|   sym._fini ();
|           0x00000874      53             push ebx                    ; [15] -r-x section size 20 named .fini
|           0x00000875      83ec08         sub esp, 8
|           0x00000878      e883fcffff     call sym.__x86.get_pc_thunk.bx
|           0x0000087d      81c34f170000   add ebx, 0x174f
|           0x00000883      83c408         add esp, 8
|           0x00000886      5b             pop ebx
\           0x00000887      c3             ret
/ (fcn) sym.__libc_csu_init 93
|   sym.__libc_csu_init (int32_t arg_28h, int32_t arg_2ch);
|           ; arg int32_t arg_28h @ esp+0x28
|           ; arg int32_t arg_2ch @ esp+0x2c
|           0x000007f0      55             push ebp
|           0x000007f1      57             push edi
|           0x000007f2      56             push esi
|           0x000007f3      53             push ebx
|           0x000007f4      e807fdffff     call sym.__x86.get_pc_thunk.bx
|           0x000007f9      81c3d3170000   add ebx, 0x17d3
|           0x000007ff      83ec0c         sub esp, 0xc
|           0x00000802      8b6c2428       mov ebp, dword [arg_28h]
|           0x00000806      8db304ffffff   lea esi, dword [ebx - 0xfc]
|           0x0000080c      e80ffcffff     call sym._init
|           0x00000811      8d8300ffffff   lea eax, dword [ebx - 0x100]
|           0x00000817      29c6           sub esi, eax
|           0x00000819      c1fe02         sar esi, 2
|           0x0000081c      85f6           test esi, esi
|       ,=< 0x0000081e      7425           je 0x845
|       |   0x00000820      31ff           xor edi, edi
|       |   0x00000822      8db600000000   lea esi, dword [esi]
|       |   ; CODE XREF from sym.__libc_csu_init @ 0x843
|      .--> 0x00000828      83ec04         sub esp, 4
|      :|   0x0000082b      55             push ebp
|      :|   0x0000082c      ff74242c       push dword [arg_2ch]
|      :|   0x00000830      ff74242c       push dword [arg_2ch]
|      :|   0x00000834      ff94bb00ffff.  call dword [ebx + edi*4 - 0x100]
|      :|   0x0000083b      83c701         add edi, 1
|      :|   0x0000083e      83c410         add esp, 0x10
|      :|   0x00000841      39fe           cmp esi, edi
|      `==< 0x00000843      75e3           jne 0x828
|       |   ; CODE XREF from sym.__libc_csu_init @ 0x81e
|       `-> 0x00000845      83c40c         add esp, 0xc
|           0x00000848      5b             pop ebx
|           0x00000849      5e             pop esi
|           0x0000084a      5f             pop edi
|           0x0000084b      5d             pop ebp
\           0x0000084c      c3             ret
/ (fcn) main 233
|   int main (int argc, char **argv, char **envp);
|           ; var int32_t var_10h @ ebp-0x10
|           ; var int32_t var_ch @ ebp-0xc
|           ; var int32_t var_8h @ ebp-0x8
|           ; arg int32_t arg_4h @ esp+0x4
|           0x000006f6      8d4c2404       lea ecx, dword [arg_4h]
|           0x000006fa      83e4f0         and esp, 0xfffffff0
|           0x000006fd      ff71fc         push dword [ecx - 4]
|           0x00000700      55             push ebp
|           0x00000701      89e5           mov ebp, esp
|           0x00000703      53             push ebx
|           0x00000704      51             push ecx
|           0x00000705      83ec10         sub esp, 0x10
|           0x00000708      e8f3fdffff     call sym.__x86.get_pc_thunk.bx
|           0x0000070d      81c3bf180000   add ebx, 0x18bf
|           0x00000713      65a114000000   mov eax, dword gs:[0x14]
|           0x00000719      8945f4         mov dword [var_ch], eax
|           0x0000071c      31c0           xor eax, eax
|           0x0000071e      c745f0000000.  mov dword [var_10h], 0
|           0x00000725      83ec0c         sub esp, 0xc
|           0x00000728      8d83c4e8ffff   lea eax, dword [ebx - 0x173c]
|           0x0000072e      50             push eax                    ; const char *s
|           0x0000072f      e84cfdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000734      83c410         add esp, 0x10
|           0x00000737      83ec0c         sub esp, 0xc
|           0x0000073a      8d8304e9ffff   lea eax, dword [ebx - 0x16fc]
|           0x00000740      50             push eax                    ; const char *s
|           0x00000741      e83afdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000746      83c410         add esp, 0x10
|           0x00000749      83ec0c         sub esp, 0xc
|           0x0000074c      8d8344e9ffff   lea eax, dword [ebx - 0x16bc]
|           0x00000752      50             push eax                    ; const char *s
|           0x00000753      e828fdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000758      83c410         add esp, 0x10
|           0x0000075b      83ec0c         sub esp, 0xc
|           0x0000075e      8d8384e9ffff   lea eax, dword [ebx - 0x167c]
|           0x00000764      50             push eax                    ; const char *s
|           0x00000765      e816fdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x0000076a      83c410         add esp, 0x10
|           0x0000076d      83ec0c         sub esp, 0xc
|           0x00000770      8d83c4e9ffff   lea eax, dword [ebx - 0x163c]
|           0x00000776      50             push eax                    ; const char *format
|           0x00000777      e8e4fcffff     call sym.imp.printf         ; int printf(const char *format)
|           0x0000077c      83c410         add esp, 0x10
|           0x0000077f      83ec08         sub esp, 8
|           0x00000782      8d45f0         lea eax, dword [var_10h]
|           0x00000785      50             push eax
|           0x00000786      8d83e6e9ffff   lea eax, dword [ebx - 0x161a]
|           0x0000078c      50             push eax                    ; const char *format
|           0x0000078d      e80efdffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|           0x00000792      83c410         add esp, 0x10
|           0x00000795      8b45f0         mov eax, dword [var_10h]
|           0x00000798      3dfeca0df0     cmp eax, 0xf00dcafe
|       ,=< 0x0000079d      7511           jne 0x7b0
|       |   0x0000079f      8b45f0         mov eax, dword [var_10h]
|       |   0x000007a2      83ec0c         sub esp, 0xc
|       |   0x000007a5      50             push eax
|       |   0x000007a6      e852feffff     call sym.check
|       |   0x000007ab      83c410         add esp, 0x10
|      ,==< 0x000007ae      eb0f           jmp 0x7bf
|      ||   ; CODE XREF from main @ 0x79d
|      |`-> 0x000007b0      8b45f0         mov eax, dword [var_10h]
|      |    0x000007b3      83ec0c         sub esp, 0xc
|      |    0x000007b6      50             push eax
|      |    0x000007b7      e841feffff     call sym.check
|      |    0x000007bc      83c410         add esp, 0x10
|      |    ; CODE XREF from main @ 0x7ae
|      `--> 0x000007bf      b800000000     mov eax, 0
|           0x000007c4      8b55f4         mov edx, dword [var_ch]
|           0x000007c7      653315140000.  xor edx, dword gs:[0x14]
|       ,=< 0x000007ce      7405           je 0x7d5
|       |   0x000007d0      e88b000000     call sym.__stack_chk_fail_local
|       |   ; CODE XREF from main @ 0x7ce
|       `-> 0x000007d5      8d65f8         lea esp, dword [var_8h]
|           0x000007d8      59             pop ecx
|           0x000007d9      5b             pop ebx
|           0x000007da      5d             pop ebp
|           0x000007db      8d61fc         lea esp, dword [ecx - 4]
\           0x000007de      c3             ret
/ (fcn) sym.__x86.get_pc_thunk.ax 4
|   sym.__x86.get_pc_thunk.ax ();
|           ; CALL XREF from sym.check @ 0x606
|           0x000007df      8b0424         mov eax, dword [esp]
\           0x000007e2      c3             ret
/ (fcn) sym.__stack_chk_fail_local 20
|   sym.__stack_chk_fail_local ();
|           ; CALL XREF from sym.check @ 0x6e9
|           ; CALL XREF from main @ 0x7d0
|           0x00000860      53             push ebx
|           0x00000861      e89afcffff     call sym.__x86.get_pc_thunk.bx
|           0x00000866      81c366170000   add ebx, 0x1766
|           0x0000086c      83ec08         sub esp, 8
\           0x0000086f      e8fcfbffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
/ (fcn) sym.imp.__stack_chk_fail 6
|   void sym.imp.__stack_chk_fail ();
|           ; CALL XREF from sym.__stack_chk_fail_local @ 0x86f
\           0x00000470      ffa310000000   jmp dword [ebx + 0x10]
/ (fcn) sym.check 249
|   sym.check (int32_t arg_8h);
|           ; var int32_t var_54h @ ebp-0x54
|           ; var int32_t var_50h @ ebp-0x50
|           ; var int32_t var_4ch @ ebp-0x4c
|           ; var uint32_t var_3dh @ ebp-0x3d
|           ; var int32_t var_3ch @ ebp-0x3c
|           ; var int32_t var_38h @ ebp-0x38
|           ; var char *s @ ebp-0x33
|           ; var int32_t var_2fh @ ebp-0x2f
|           ; var int32_t var_2bh @ ebp-0x2b
|           ; var int32_t var_27h @ ebp-0x27
|           ; var int32_t var_23h @ ebp-0x23
|           ; var int32_t var_1fh @ ebp-0x1f
|           ; var int32_t var_1dh @ ebp-0x1d
|           ; var int32_t var_1ch @ ebp-0x1c
|           ; var int32_t var_ch @ ebp-0xc
|           ; arg int32_t arg_8h @ ebp+0x8
|           ; CALL XREFS from main @ 0x7a6, 0x7b7
|           0x000005fd      55             push ebp
|           0x000005fe      89e5           mov ebp, esp
|           0x00000600      57             push edi
|           0x00000601      56             push esi
|           0x00000602      53             push ebx
|           0x00000603      83ec4c         sub esp, 0x4c
|           0x00000606      e8d4010000     call sym.__x86.get_pc_thunk.ax
|           0x0000060b      05c1190000     add eax, 0x19c1
|           0x00000610      8945ac         mov dword [var_54h], eax
|           0x00000613      65a114000000   mov eax, dword gs:[0x14]
|           0x00000619      8945e4         mov dword [var_1ch], eax
|           0x0000061c      31c0           xor eax, eax
|           0x0000061e      c645c300       mov byte [var_3dh], 0
|           0x00000622      c745cd434444.  mov dword [s], 0x43444443   ; 'CDDC'
|           0x00000629      c745d132307b.  mov dword [var_2fh], 0x457b3032 ; '20{E'
|           0x00000630      c745d535717a.  mov dword [var_2bh], 0x567a7135 ; '5qzV'
|           0x00000637      c745d9367034.  mov dword [var_27h], 0x7a347036 ; '6p4z'
|           0x0000063e      c745dd5a3b65.  mov dword [var_23h], 0x6b653b5a ; 'Z;ek'
|           0x00000645      66c745e1737d   mov word [var_1fh], 0x7d73  ; 's}'
|           0x0000064b      c645e300       mov byte [var_1dh], 0
|           0x0000064f      c745c4efbead.  mov dword [var_3ch], 0xdeadbeef
|           0x00000656      c745c8cefabe.  mov dword [var_38h], 0xbabeface
|           0x0000065d      8b4dc4         mov ecx, dword [var_3ch]
|           0x00000660      2b4dc8         sub ecx, dword [var_38h]
|           0x00000663      89ce           mov esi, ecx
|           0x00000665      bf00000000     mov edi, 0
|           0x0000066a      8b4d08         mov ecx, dword [arg_8h]
|           0x0000066d      bb00000000     mov ebx, 0
|           0x00000672      81c123f9e033   add ecx, 0x33e0f923
|           0x00000678      83d3ff         adc ebx, -1
|           0x0000067b      89f0           mov eax, esi
|           0x0000067d      31c8           xor eax, ecx
|           0x0000067f      8945b0         mov dword [var_50h], eax
|           0x00000682      89f8           mov eax, edi
|           0x00000684      31d8           xor eax, ebx
|           0x00000686      8945b4         mov dword [var_4ch], eax
|           0x00000689      8b5db0         mov ebx, dword [var_50h]
|           0x0000068c      8b75b4         mov esi, dword [var_4ch]
|           0x0000068f      89d8           mov eax, ebx
|           0x00000691      09f0           or eax, esi
|           0x00000693      85c0           test eax, eax
|       ,=< 0x00000695      7545           jne 0x6dc
|       |   0x00000697      c645c300       mov byte [var_3dh], 0
|      ,==< 0x0000069b      eb27           jmp 0x6c4
|      ||   ; CODE XREF from sym.check @ 0x6c8
|     .---> 0x0000069d      0fb645c3       movzx eax, byte [var_3dh]
|     :||   0x000006a1      83c007         add eax, 7
|     :||   0x000006a4      0fb64c05cd     movzx ecx, byte [ebp + eax - 0x33]
|     :||   0x000006a9      0fb655c3       movzx edx, byte [var_3dh]
|     :||   0x000006ad      0fb645c3       movzx eax, byte [var_3dh]
|     :||   0x000006b1      83c007         add eax, 7
|     :||   0x000006b4      31ca           xor edx, ecx
|     :||   0x000006b6      885405cd       mov byte [ebp + eax - 0x33], dl
|     :||   0x000006ba      0fb645c3       movzx eax, byte [var_3dh]
|     :||   0x000006be      83c001         add eax, 1
|     :||   0x000006c1      8845c3         mov byte [var_3dh], al
|     :||   ; CODE XREF from sym.check @ 0x69b
|     :`--> 0x000006c4      807dc30d       cmp byte [var_3dh], 0xd
|     `===< 0x000006c8      76d3           jbe 0x69d
|       |   0x000006ca      83ec0c         sub esp, 0xc
|       |   0x000006cd      8d45cd         lea eax, dword [s]
|       |   0x000006d0      50             push eax                    ; const char *s
|       |   0x000006d1      8b5dac         mov ebx, dword [var_54h]
|       |   0x000006d4      e8a7fdffff     call sym.imp.puts           ; int puts(const char *s)
|       |   0x000006d9      83c410         add esp, 0x10
|       |   ; CODE XREF from sym.check @ 0x695
|       `-> 0x000006dc      90             nop
|           0x000006dd      8b45e4         mov eax, dword [var_1ch]
|           0x000006e0      653305140000.  xor eax, dword gs:[0x14]
|       ,=< 0x000006e7      7405           je 0x6ee
|       |   0x000006e9      e872010000     call sym.__stack_chk_fail_local
|       |   ; CODE XREF from sym.check @ 0x6e7
|       `-> 0x000006ee      8d65f4         lea esp, dword [var_ch]
|           0x000006f1      5b             pop ebx
|           0x000006f2      5e             pop esi
|           0x000006f3      5f             pop edi
|           0x000006f4      5d             pop ebp
\           0x000006f5      c3             ret
            ;-- section..init:
            ;-- .init:
/ (fcn) sym._init 35
|   sym._init ();
|           ; CALL XREF from sym.__libc_csu_init @ 0x80c
|           0x00000420      53             push ebx                    ; [11] -r-x section size 35 named .init
|           0x00000421      83ec08         sub esp, 8
|           0x00000424      e8d7000000     call sym.__x86.get_pc_thunk.bx
|           0x00000429      81c3a31b0000   add ebx, 0x1ba3
|           0x0000042f      8b8328000000   mov eax, dword [ebx + 0x28]
|           0x00000435      85c0           test eax, eax
|       ,=< 0x00000437      7405           je 0x43e
|       |   0x00000439      e87a000000     call 0x4b8
|       `-> 0x0000043e      83c408         add esp, 8
|           0x00000441      5b             pop ebx
\           0x00000442      c3             ret
/ (fcn) sym.imp.printf 6
|   int sym.imp.printf (const char *format);
|           ; CALL XREF from main @ 0x777
\           0x00000460      ffa30c000000   jmp dword [ebx + 0xc]
            ;-- section.:
            ;-- section..comment:
            ;-- section..symtab:
            ;-- section..strtab:
            ;-- section..shstrtab:
            ;-- segment.LOAD0:
            ;-- segment.GNU_STACK:
            ;-- segment.ehdr:
            ;-- .comment:
            ;-- imp.__cxa_finalize:
            ;-- imp.__gmon_start__:
            ;-- imp._ITM_registerTMCloneTable:
            ;-- oeax:
            ;-- edi:
            ;-- esi:
            ;-- ebx:
            ;-- eflags:
/ (fcn) loc.imp._ITM_deregisterTMCloneTable 85
|   loc.imp._ITM_deregisterTMCloneTable ();
|       ,=< 0x00000000      7f45           jg 0x47                     ; [28] ---- section size 252 named .shstrtab
|       |   0x00000002      4c             dec esp
|       |   0x00000003      46             inc esi
|       |   0x00000004      0101           add dword [ecx], eax
|       |   0x00000006      0100           add dword [eax], eax
|       |   ; DATA XREF from sym.imp.__stack_chk_fail @ +0x6
|       |   0x00000008      0000           add byte [eax], al
|       |   0x0000000a      0000           add byte [eax], al
|       |   ; CODE XREF from sym.imp.printf @ 0x460
|       |   0x0000000c      0000           add byte [eax], al
|       |   0x0000000e      0000           add byte [eax], al
|       |   ; CODE XREF from sym.imp.__stack_chk_fail @ 0x470
|       |   ; DATA XREF from sym.imp.puts @ +0x6
|       |   0x00000010      0300           add eax, dword [eax]
|       |   0x00000012      0300           add eax, dword [eax]
|       |   ; CODE XREF from sym.imp.puts @ 0x480
|       |   0x00000014      0100           add dword [eax], eax
|       |   0x00000016      0000           add byte [eax], al
|       |   ; CODE XREF from sym.imp.__libc_start_main @ 0x490
|       |   ; DATA XREF from sym.imp.__libc_start_main @ +0x6
|       |   0x00000018      c0040000       rol byte [eax + eax], 0
|       |   ; CODE XREF from sym.imp.__isoc99_scanf @ 0x4a0
|       |   0x0000001c      3400           xor al, 0
|       |   0x0000001e      0000           add byte [eax], al
|       |   ; DATA XREF from section..rel.dyn @ +0x18
|       |   ; DATA XREF from sym.imp.__isoc99_scanf @ +0x6
|       |   0x00000020      641800         sbb byte fs:[eax], al
|       |   0x00000023      0000           add byte [eax], al
|       |   0x00000025      0000           add byte [eax], al
|       |   0x00000027      003400         add byte [eax + eax], dh
|       |   0x0000002a      2000           and byte [eax], al
|       |   0x0000002c      0900           or dword [eax], eax
|       |   0x0000002e      2800           sub byte [eax], al
|       |   ; DATA XREF from section..eh_frame @ +0x7b
|       |   0x00000030  ~   1d001c0006     sbb eax, 0x6001c00
|       |   ;-- segment.PHDR:
..
|       |   0x00000035      0000           add byte [eax], al
|       |   0x00000037      003400         add byte [eax + eax], dh
|       |   0x0000003a      0000           add byte [eax], al
|       |   0x0000003c      3400           xor al, 0
|       |   0x0000003e      0000           add byte [eax], al
|       |   0x00000040      3400           xor al, 0
|       |   0x00000042      0000           add byte [eax], al
|       |   0x00000044      2001           and byte [ecx], al
|       |   0x00000046  ~   0000           add byte [eax], al
|       |   ; CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 
|       `-> 0x00000047      0020           add byte [eax], ah
|           0x00000049      0100           add dword [eax], eax
\           0x0000004b      000400         add byte [eax + eax], al
..
/ (fcn) sym.imp.puts 6
|   int sym.imp.puts (const char *s);
|           ; CALL XREF from sym.check @ 0x6d4
|           ; CALL XREFS from main @ 0x72f, 0x741, 0x753, 0x765
\           0x00000480      ffa314000000   jmp dword [ebx + 0x14]
/ (fcn) sym.imp.__isoc99_scanf 6
|   int sym.imp.__isoc99_scanf (const char *format);
|           ; CALL XREF from main @ 0x78d
\           0x000004a0      ffa31c000000   jmp dword [ebx + 0x1c]
