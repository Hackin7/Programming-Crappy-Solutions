/ (fcn) main 415
|   int main (int argc, char **argv, char **envp);
|           ; var char **src @ rbp-0xc0
|           ; var signed int var_b4h @ rbp-0xb4
|           ; var int32_t var_a9h @ rbp-0xa9
|           ; var int32_t var_a8h @ rbp-0xa8
|           ; var size_t var_a4h @ rbp-0xa4
|           ; var char *var_a0h @ rbp-0xa0
|           ; var char *dest @ rbp-0x70
|           ; var char *s @ rbp-0x40
|           ; var int32_t var_38h @ rbp-0x38
|           ; var int32_t var_30h @ rbp-0x30
|           ; var int32_t var_28h @ rbp-0x28
|           ; var int32_t var_20h @ rbp-0x20
|           ; var int32_t canary @ rbp-0x18
|           ; arg signed int argc @ rdi
|           ; arg char **argv @ rsi
|           ; DATA XREF from entry0 @ 0x69d
|           0x0000078a      55             push rbp
|           0x0000078b      4889e5         mov rbp, rsp
|           0x0000078e      53             push rbx
|           0x0000078f      4881ecb80000.  sub rsp, 0xb8
|           0x00000796      89bd4cffffff   mov dword [var_b4h], edi    ; argc
|           0x0000079c      4889b540ffff.  mov qword [src], rsi        ; argv
|           0x000007a3      64488b042528.  mov rax, qword fs:[0x28]
|           0x000007ac      488945e8       mov qword [canary], rax
|           0x000007b0      31c0           xor eax, eax
|           0x000007b2      83bd4cffffff.  cmp dword [var_b4h], 1
|       ,=< 0x000007b9      7f16           jg 0x7d1
|       |   0x000007bb      488d3df60100.  lea rdi, qword str.Insufficient_arguments._Gimme_moarrrrrr ; 0x9b8 ; "Insufficient arguments. Gimme moarrrrrr" ; const char *s
|       |   0x000007c2      e869feffff     call sym.imp.puts           ; int puts(const char *s)
|       |   0x000007c7      b801000000     mov eax, 1
|      ,==< 0x000007cc      e93a010000     jmp 0x90b
|      ||   ; CODE XREF from main @ 0x7b9
|      |`-> 0x000007d1      83bd4cffffff.  cmp dword [var_b4h], 2
|      |,=< 0x000007d8      7e16           jle 0x7f0
|      ||   0x000007da      488d3dff0100.  lea rdi, qword str.I_am_overwhelmed___. ; 0x9e0 ; "I am overwhelmed! @.@" ; const char *s
|      ||   0x000007e1      e84afeffff     call sym.imp.puts           ; int puts(const char *s)
|      ||   0x000007e6      b801000000     mov eax, 1
|     ,===< 0x000007eb      e91b010000     jmp 0x90b
|     |||   ; CODE XREF from main @ 0x7d8
|     ||`-> 0x000007f0      488b8540ffff.  mov rax, qword [src]
|     ||    0x000007f7      4883c008       add rax, 8
|     ||    0x000007fb      488b00         mov rax, qword [rax]
|     ||    0x000007fe      4889c7         mov rdi, rax                ; const char *s
|     ||    0x00000801      e83afeffff     call sym.imp.strlen         ; size_t strlen(const char *s)
|     ||    0x00000806      89855cffffff   mov dword [var_a4h], eax
|     ||    0x0000080c      83bd5cffffff.  cmp dword [var_a4h], 0x21
|     ||,=< 0x00000813      7416           je 0x82b
|     |||   0x00000815      488d3dda0100.  lea rdi, qword str.33_is_the_magic_number ; 0x9f6 ; "33 is the magic number! ;)" ; const char *s
|     |||   0x0000081c      e80ffeffff     call sym.imp.puts           ; int puts(const char *s)
|     |||   0x00000821      b801000000     mov eax, 1
|    ,====< 0x00000826      e9e0000000     jmp 0x90b
|    ||||   ; CODE XREF from main @ 0x813
|    |||`-> 0x0000082b      488b8540ffff.  mov rax, qword [src]
|    |||    0x00000832      4883c008       add rax, 8
|    |||    0x00000836      488b10         mov rdx, qword [rax]
|    |||    0x00000839      488d4590       lea rax, qword [dest]
|    |||    0x0000083d      4889d6         mov rsi, rdx                ; const char *src
|    |||    0x00000840      4889c7         mov rdi, rax                ; char *dest
|    |||    0x00000843      e8d8fdffff     call sym.imp.strcpy         ; char *strcpy(char *dest, const char *src)
|    |||    0x00000848      48b8041e7624.  movabs rax, 0x1486a6a24761e04
|    |||    0x00000852      48ba745f3c10.  movabs rdx, 0x14113d20103c5f74
|    |||    0x0000085c      488945c0       mov qword [s], rax
|    |||    0x00000860      488955c8       mov qword [var_38h], rdx
|    |||    0x00000864      48b8690c0613.  movabs rax, 0x132f4a0b13060c69
|    |||    0x0000086e      48ba05621a63.  movabs rdx, 0x3b054679631a6205
|    |||    0x00000878      488945d0       mov qword [var_30h], rax
|    |||    0x0000087c      488955d8       mov qword [var_28h], rdx
|    |||    0x00000880      66c745e03c00   mov word [var_20h], 0x3c    ; '<'
|    |||    0x00000886      c78558ffffff.  mov dword [var_a8h], 0
|    |||,=< 0x00000890      eb3f           jmp 0x8d1
|    ||||   ; CODE XREF from main @ 0x8e9
|   .-----> 0x00000892      8b8558ffffff   mov eax, dword [var_a8h]
|   :||||   0x00000898      4898           cdqe
|   :||||   0x0000089a      0fb65405c0     movzx edx, byte [rbp + rax - 0x40]
|   :||||   0x0000089f      8b8558ffffff   mov eax, dword [var_a8h]
|   :||||   0x000008a5      4898           cdqe
|   :||||   0x000008a7      0fb6440590     movzx eax, byte [rbp + rax - 0x70]
|   :||||   0x000008ac      31d0           xor eax, edx
|   :||||   0x000008ae      888557ffffff   mov byte [var_a9h], al
|   :||||   0x000008b4      8b8558ffffff   mov eax, dword [var_a8h]
|   :||||   0x000008ba      4898           cdqe
|   :||||   0x000008bc      0fb69557ffff.  movzx edx, byte [var_a9h]
|   :||||   0x000008c3      88940560ffff.  mov byte [rbp + rax - 0xa0], dl
|   :||||   0x000008ca      838558ffffff.  add dword [var_a8h], 1
|   :||||   ; CODE XREF from main @ 0x890
|   :|||`-> 0x000008d1      8b8558ffffff   mov eax, dword [var_a8h]
|   :|||    0x000008d7      4863d8         movsxd rbx, eax
|   :|||    0x000008da      488d45c0       lea rax, qword [s]
|   :|||    0x000008de      4889c7         mov rdi, rax                ; const char *s
|   :|||    0x000008e1      e85afdffff     call sym.imp.strlen         ; size_t strlen(const char *s)
|   :|||    0x000008e6      4839c3         cmp rbx, rax
|   `=====< 0x000008e9      72a7           jb 0x892
|    |||    0x000008eb      488d8560ffff.  lea rax, qword [var_a0h]
|    |||    0x000008f2      4889c6         mov rsi, rax
|    |||    0x000008f5      488d3d150100.  lea rdi, qword str.Your_flag_is:__s ; 0xa11 ; "Your flag is: %s\n" ; const char *format
|    |||    0x000008fc      b800000000     mov eax, 0
|    |||    0x00000901      e85afdffff     call sym.imp.printf         ; int printf(const char *format)
|    |||    0x00000906      b800000000     mov eax, 0
|    |||    ; CODE XREFS from main @ 0x7cc, 0x7eb, 0x826
|    ```--> 0x0000090b      488b4de8       mov rcx, qword [canary]
|           0x0000090f      6448330c2528.  xor rcx, qword fs:[0x28]
|       ,=< 0x00000918      7405           je 0x91f
|       |   0x0000091a      e831fdffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
|       |   ; CODE XREF from main @ 0x918
|       `-> 0x0000091f      4881c4b80000.  add rsp, 0xb8
|           0x00000926      5b             pop rbx
|           0x00000927      5d             pop rbp
\           0x00000928      c3             ret
