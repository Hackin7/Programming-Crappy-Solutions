/ (fcn) sym.randomise 105
|   sym.randomise (int32_t arg7);
|           ; var int32_t var_18h @ rbp-0x18
|           ; var int32_t var_10h @ rbp-0x10
|           ; var int32_t var_8h @ rbp-0x8
|           ; arg int32_t arg7 @ xmm0
|           ; CALL XREF from sym.menu @ 0xbd2
|           0x0000089f      55             push rbp
|           0x000008a0      4889e5         mov rbp, rsp
|           0x000008a3      4883ec20       sub rsp, 0x20
|           0x000008a7      e8b4feffff     call sym.imp.rand           ; int rand(void)
|           0x000008ac      f20f2ac0       cvtsi2sd xmm0, eax
|           0x000008b0      f20f1145f0     movsd qword [var_10h], xmm0 ; arg7
|           0x000008b5      e8a6feffff     call sym.imp.rand           ; int rand(void)
|           0x000008ba      f20f2ac0       cvtsi2sd xmm0, eax
|           0x000008be      f20f1145f8     movsd qword [var_8h], xmm0  ; arg7
|           0x000008c3      f20f1045f8     movsd xmm0, qword [var_8h]
|           0x000008c8      488b45f0       mov rax, qword [var_10h]
|           0x000008cc      660f28c8       movapd xmm1, xmm0
|           0x000008d0      488945e8       mov qword [var_18h], rax
|           0x000008d4      f20f1045e8     movsd xmm0, qword [var_18h]
|           0x000008d9      488d3db80800.  lea rdi, qword str.You_are_going_to__lf___lf... ; 0x1198 ; "You are going to %lf, %lf..." ; const char *format
|           0x000008e0      b802000000     mov eax, 2
|           0x000008e5      e846feffff     call sym.imp.printf         ; int printf(const char *format)
|           0x000008ea      f20f1045f8     movsd xmm0, qword [var_8h]
|           0x000008ef      488b45f0       mov rax, qword [var_10h]
|           0x000008f3      660f28c8       movapd xmm1, xmm0
|           0x000008f7      488945e8       mov qword [var_18h], rax
|           0x000008fb      f20f1045e8     movsd xmm0, qword [var_18h]
|           0x00000900      e84d030000     call sym.locations
|           0x00000905      90             nop
|           0x00000906      c9             leave
\           0x00000907      c3             ret
