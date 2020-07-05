/ (fcn) sym.xor 171
|   sym.xor (char *arg1, char *arg2);
|           ; var char *var_30h @ rbp-0x30
|           ; var char *s @ rbp-0x28
|           ; var int32_t var_1ch @ rbp-0x1c
|           ; var size_t size @ rbp-0x18
|           ; var size_t var_10h @ rbp-0x10
|           ; var void *var_8h @ rbp-0x8
|           ; arg char *arg1 @ rdi
|           ; arg char *arg2 @ rsi
|           ; CALL XREF from sym.locations @ 0xed9
|           0x00000908      55             push rbp
|           0x00000909      4889e5         mov rbp, rsp
|           0x0000090c      4883ec30       sub rsp, 0x30
|           0x00000910      48897dd8       mov qword [s], rdi          ; arg1
|           0x00000914      488975d0       mov qword [var_30h], rsi    ; arg2
|           0x00000918      488b45d8       mov rax, qword [s]
|           0x0000091c      4889c7         mov rdi, rax                ; const char *s
|           0x0000091f      e8ecfdffff     call sym.imp.strlen         ; size_t strlen(const char *s)
|           0x00000924      488945e8       mov qword [size], rax
|           0x00000928      488b45d0       mov rax, qword [var_30h]
|           0x0000092c      4889c7         mov rdi, rax                ; const char *s
|           0x0000092f      e8dcfdffff     call sym.imp.strlen         ; size_t strlen(const char *s)
|           0x00000934      488945f0       mov qword [var_10h], rax
|           0x00000938      488b45e8       mov rax, qword [size]
|           0x0000093c      4883c001       add rax, 1
|           0x00000940      4889c7         mov rdi, rax                ; size_t size
|           0x00000943      e8f8fdffff     call sym.imp.malloc         ;  void *malloc(size_t size)
|           0x00000948      488945f8       mov qword [var_8h], rax
|           0x0000094c      c745e4000000.  mov dword [var_1ch], 0
|       ,=< 0x00000953      eb3f           jmp 0x994
|       |   ; CODE XREF from sym.xor @ 0x99d
|      .--> 0x00000955      8b45e4         mov eax, dword [var_1ch]
|      :|   0x00000958      4863d0         movsxd rdx, eax
|      :|   0x0000095b      488b45d8       mov rax, qword [s]
|      :|   0x0000095f      4801d0         add rax, rdx
|      :|   0x00000962      0fb630         movzx esi, byte [rax]
|      :|   0x00000965      8b45e4         mov eax, dword [var_1ch]
|      :|   0x00000968      4898           cdqe
|      :|   0x0000096a      ba00000000     mov edx, 0
|      :|   0x0000096f      48f775f0       div qword [var_10h]
|      :|   0x00000973      488b45d0       mov rax, qword [var_30h]
|      :|   0x00000977      4801d0         add rax, rdx
|      :|   0x0000097a      0fb608         movzx ecx, byte [rax]
|      :|   0x0000097d      8b45e4         mov eax, dword [var_1ch]
|      :|   0x00000980      4863d0         movsxd rdx, eax
|      :|   0x00000983      488b45f8       mov rax, qword [var_8h]
|      :|   0x00000987      4801d0         add rax, rdx
|      :|   0x0000098a      31ce           xor esi, ecx
|      :|   0x0000098c      89f2           mov edx, esi
|      :|   0x0000098e      8810           mov byte [rax], dl
|      :|   0x00000990      8345e401       add dword [var_1ch], 1
|      :|   ; CODE XREF from sym.xor @ 0x953
|      :`-> 0x00000994      8b45e4         mov eax, dword [var_1ch]
|      :    0x00000997      4898           cdqe
|      :    0x00000999      483945e8       cmp qword [size], rax
|      `==< 0x0000099d      77b6           ja 0x955
|           0x0000099f      488b55f8       mov rdx, qword [var_8h]
|           0x000009a3      488b45e8       mov rax, qword [size]
|           0x000009a7      4801d0         add rax, rdx
|           0x000009aa      c60000         mov byte [rax], 0
|           0x000009ad      488b45f8       mov rax, qword [var_8h]
|           0x000009b1      c9             leave
\           0x000009b2      c3             ret
