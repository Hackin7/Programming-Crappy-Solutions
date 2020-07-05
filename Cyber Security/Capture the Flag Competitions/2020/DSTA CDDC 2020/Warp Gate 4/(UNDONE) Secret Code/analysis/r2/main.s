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
