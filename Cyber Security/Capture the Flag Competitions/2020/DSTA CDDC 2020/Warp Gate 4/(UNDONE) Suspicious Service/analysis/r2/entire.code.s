/ (fcn) sym.deregister_tm_clones 52
|   sym.deregister_tm_clones ();
|           ; CALL XREF from fcn.000011b4 @ 0x11ea
|           0x00001120      e8e4000000     call sym.__x86.get_pc_thunk.dx
|           0x00001125      81c29f2e0000   add edx, 0x2e9f
|           0x0000112b      8d8a44000000   lea ecx, dword [edx + 0x44]
|           0x00001131      8d8244000000   lea eax, dword [edx + 0x44]
|           0x00001137      39c8           cmp eax, ecx
|       ,=< 0x00001139      741d           je 0x1158
|       |   0x0000113b      8b821c000000   mov eax, dword [edx + 0x1c]
|       |   0x00001141      85c0           test eax, eax
|      ,==< 0x00001143      7413           je 0x1158
|      ||   0x00001145      55             push ebp
|      ||   0x00001146      89e5           mov ebp, esp
|      ||   0x00001148      83ec14         sub esp, 0x14
|      ||   0x0000114b      51             push ecx
|      ||   0x0000114c      ffd0           call eax
|      ||   0x0000114e      83c410         add esp, 0x10
|      ||   0x00001151      c9             leave
|      ||   0x00001152      c3             ret
..
|      ||   ; CODE XREFS from sym.deregister_tm_clones @ 0x1139, 0x1143
\      ``-> 0x00001158      c3             ret
            ;-- eip:
/ (fcn) sym.__x86.get_pc_thunk.dx 4
|   sym.__x86.get_pc_thunk.dx ();
|           ; CALL XREF from sym.deregister_tm_clones @ 0x1120
|           ; CALL XREF from sym.register_tm_clones @ 0x1160
|           0x00001209      8b1424         mov edx, dword [esp]
\           0x0000120c      c3             ret
/ (fcn) sym.register_tm_clones 71
|   sym.register_tm_clones ();
|           ; var int32_t var_4h @ ebp-0x4
|           ; CODE XREF from entry.init0 @ +0x4
|           0x00001160      e8a4000000     call sym.__x86.get_pc_thunk.dx
|           0x00001165      81c25f2e0000   add edx, 0x2e5f
|           0x0000116b      55             push ebp
|           0x0000116c      89e5           mov ebp, esp
|           0x0000116e      53             push ebx
|           0x0000116f      8d8a44000000   lea ecx, dword [edx + 0x44]
|           0x00001175      8d8244000000   lea eax, dword [edx + 0x44]
|           0x0000117b      83ec04         sub esp, 4
|           0x0000117e      29c8           sub eax, ecx
|           0x00001180      89c3           mov ebx, eax
|           0x00001182      c1e81f         shr eax, 0x1f
|           0x00001185      c1fb02         sar ebx, 2
|           0x00001188      01d8           add eax, ebx
|           0x0000118a      d1f8           sar eax, 1
|       ,=< 0x0000118c      7414           je 0x11a2
|       |   0x0000118e      8b9238000000   mov edx, dword [edx + 0x38]
|       |   0x00001194      85d2           test edx, edx
|      ,==< 0x00001196      740a           je 0x11a2
|      ||   0x00001198      83ec08         sub esp, 8
|      ||   0x0000119b      50             push eax
|      ||   0x0000119c      51             push ecx
|      ||   0x0000119d      ffd2           call edx
|      ||   0x0000119f      83c410         add esp, 0x10
|      ||   ; CODE XREFS from sym.register_tm_clones @ 0x118c, 0x1196
|      ``-> 0x000011a2      8b5dfc         mov ebx, dword [var_4h]
|           0x000011a5      c9             leave
\           0x000011a6      c3             ret
/ (fcn) sym.__x86.get_pc_thunk.bx 4
|   sym.__x86.get_pc_thunk.bx ();
|           ; CALL XREF from section..init @ +0x8
|           ; CALL XREF from fcn.000011b4 @ 0x11b8
|           ; CALL XREF from fcn.00001211 @ 0x121b
|           ; CALL XREF from section..fini @ +0x8
|           0x00001110      8b1c24         mov ebx, dword [esp]
\           0x00001113      c3             ret
/ (fcn) sym.__x86.get_pc_thunk.bp 4
|   sym.__x86.get_pc_thunk.bp ();
|           ; CALL XREF from sym.__libc_csu_init @ +0x5
|           0x00001315      8b2c24         mov ebp, dword [esp]
\           0x00001318      c3             ret
/ (fcn) fcn.00001106 4
|   fcn.00001106 ();
|           ; CALL XREF from entry0 @ +0xf
|           0x00001106      8b1c24         mov ebx, dword [esp]
\           0x00001109      c3             ret
/ (fcn) fcn.000011b4 71
|   fcn.000011b4 ();
|           ; var int32_t var_4h @ ebp-0x4
|           0x000011b4      55             push ebp
|           0x000011b5      89e5           mov ebp, esp
|           0x000011b7      53             push ebx
|           0x000011b8      e853ffffff     call sym.__x86.get_pc_thunk.bx
|           0x000011bd      81c3072e0000   add ebx, 0x2e07
|           0x000011c3      83ec04         sub esp, 4
|           0x000011c6      80bb44000000.  cmp byte [ebx + 0x44], 0
|       ,=< 0x000011cd      7527           jne 0x11f6
|       |   0x000011cf      8b8324000000   mov eax, dword [ebx + 0x24]
|       |   0x000011d5      85c0           test eax, eax
|      ,==< 0x000011d7      7411           je 0x11ea
|      ||   0x000011d9      83ec0c         sub esp, 0xc
|      ||   0x000011dc      ffb340000000   push dword [ebx + 0x40]
|      ||   0x000011e2      e899feffff     call sym..plt.got
|      ||   0x000011e7      83c410         add esp, 0x10
|      ||   ; CODE XREF from fcn.000011b4 @ 0x11d7
|      `--> 0x000011ea      e831ffffff     call sym.deregister_tm_clones
|       |   0x000011ef      c68344000000.  mov byte [ebx + 0x44], 1
|       |   ; CODE XREF from fcn.000011b4 @ 0x11cd
|       `-> 0x000011f6      8b5dfc         mov ebx, dword [var_4h]
|           0x000011f9      c9             leave
\           0x000011fa      c3             ret
/ (fcn) fcn.00001211 134
|   fcn.00001211 ();
|           ; var int32_t var_108h @ ebp-0x108
|           ; var int32_t var_8h @ ebp-0x8
|           ; var int32_t var_4h @ ebp-0x4
|           0x00001211      55             push ebp
|           0x00001212      89e5           mov ebp, esp
|           0x00001214      53             push ebx
|           0x00001215      81ec04010000   sub esp, 0x104
|           0x0000121b      e8f0feffff     call sym.__x86.get_pc_thunk.bx
|           0x00001220      81c3a42d0000   add ebx, 0x2da4
|           0x00001226      8b832c000000   mov eax, dword [ebx + 0x2c]
|           0x0000122c      8b00           mov eax, dword [eax]
|           0x0000122e      6a00           push 0
|           0x00001230      50             push eax
|           0x00001231      e85afeffff     call sym.imp.setbuf
|           0x00001236      83c408         add esp, 8
|           0x00001239      8b8330000000   mov eax, dword [ebx + 0x30]
|           0x0000123f      8b00           mov eax, dword [eax]
|           0x00001241      6a00           push 0
|           0x00001243      50             push eax
|           0x00001244      e847feffff     call sym.imp.setbuf
|           0x00001249      83c408         add esp, 8
|           0x0000124c      8b8320000000   mov eax, dword [ebx + 0x20]
|           0x00001252      8b00           mov eax, dword [eax]
|           0x00001254      6a00           push 0
|           0x00001256      50             push eax
|           0x00001257      e834feffff     call sym.imp.setbuf
|           0x0000125c      83c408         add esp, 8
|           0x0000125f      c745f8785634.  mov dword [var_8h], 0x12345678
|           0x00001266      8d85f8feffff   lea eax, dword [var_108h]
|           0x0000126c      50             push eax
|           0x0000126d      e82efeffff     call sym.imp.gets
|           0x00001272      83c404         add esp, 4
|           0x00001275      817df8003d34.  cmp dword [var_8h], 0x1343d00
|       ,=< 0x0000127c      750f           jne 0x128d
|       |   0x0000127e      8d8344e0ffff   lea eax, dword [ebx - 0x1fbc]
|       |   0x00001284      50             push eax
|       |   0x00001285      e826feffff     call sym.imp.system
|       |   0x0000128a      83c404         add esp, 4
|       |   ; CODE XREF from fcn.00001211 @ 0x127c
|       `-> 0x0000128d      b800000000     mov eax, 0
|           0x00001292      8b5dfc         mov ebx, dword [var_4h]
|           0x00001295      c9             leave
\           0x00001296      c3             ret
