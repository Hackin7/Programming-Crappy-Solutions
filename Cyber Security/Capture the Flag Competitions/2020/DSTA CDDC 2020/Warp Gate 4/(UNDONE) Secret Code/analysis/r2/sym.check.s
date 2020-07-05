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
