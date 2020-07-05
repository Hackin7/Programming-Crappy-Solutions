            ;-- section..text:
            ;-- .text:
            ;-- _start:
/ (fcn) entry0 42
|   entry0 (int32_t arg3);
|           ; arg int32_t arg3 @ rdx
|           0x00000680      31ed           xor ebp, ebp                ; [14] -r-x section size 802 named .text
|           0x00000682      4989d1         mov r9, rdx                 ; arg3
|           0x00000685      5e             pop rsi
|           0x00000686      4889e2         mov rdx, rsp
|           0x00000689      4883e4f0       and rsp, 0xfffffffffffffff0
|           0x0000068d      50             push rax
|           0x0000068e      54             push rsp
|           0x0000068f      4c8d050a0300.  lea r8, qword [sym.__libc_csu_fini] ; 0x9a0
|           0x00000696      488d0d930200.  lea rcx, qword [sym.__libc_csu_init] ; 0x930 ; "AWAVI\x89\xd7AUATL\x8d%V\x04 "
|           0x0000069d      488d3de60000.  lea rdi, qword [main]       ; sym.main
|                                                                      ; 0x78a
\           0x000006a4      ff1536092000   call qword [reloc.__libc_start_main] ; [0x200fe0:8]=0
            ;-- rip:
/ (fcn) sym.deregister_tm_clones 40
|   sym.deregister_tm_clones ();
|           ; CALL XREF from entry.fini0 @ 0x763
|           0x000006b0      488d3d590920.  lea rdi, qword obj.completed.7698 ; 0x201010
|           0x000006b7      55             push rbp
|           0x000006b8      488d05510920.  lea rax, qword obj.completed.7698 ; rdi
|                                                                      ; 0x201010
|           0x000006bf      4839f8         cmp rax, rdi
|           0x000006c2      4889e5         mov rbp, rsp
|       ,=< 0x000006c5      7419           je 0x6e0
|       |   0x000006c7      488b050a0920.  mov rax, qword [reloc._ITM_deregisterTMCloneTable] ; [0x200fd8:8]=0
|       |   0x000006ce      4885c0         test rax, rax
|      ,==< 0x000006d1      740d           je 0x6e0
|      ||   0x000006d3      5d             pop rbp
|      ||   0x000006d4      ffe0           jmp rax
..
|      ||   ; CODE XREFS from sym.deregister_tm_clones @ 0x6c5, 0x6d1
|      ``-> 0x000006e0      5d             pop rbp
\           0x000006e1      c3             ret
/ (fcn) sym.register_tm_clones 57
|   sym.register_tm_clones ();
|           ; CODE XREF from entry.init0 @ 0x785
|           0x000006f0      488d3d190920.  lea rdi, qword obj.completed.7698 ; 0x201010
|           0x000006f7      488d35120920.  lea rsi, qword obj.completed.7698 ; rdi
|                                                                      ; 0x201010
|           0x000006fe      55             push rbp
|           0x000006ff      4829fe         sub rsi, rdi
|           0x00000702      4889e5         mov rbp, rsp
|           0x00000705      48c1fe03       sar rsi, 3
|           0x00000709      4889f0         mov rax, rsi
|           0x0000070c      48c1e83f       shr rax, 0x3f
|           0x00000710      4801c6         add rsi, rax
|           0x00000713      48d1fe         sar rsi, 1
|       ,=< 0x00000716      7418           je 0x730
|       |   0x00000718      488b05d10820.  mov rax, qword [reloc._ITM_registerTMCloneTable] ; [0x200ff0:8]=0
|       |   0x0000071f      4885c0         test rax, rax
|      ,==< 0x00000722      740c           je 0x730
|      ||   0x00000724      5d             pop rbp
|      ||   0x00000725      ffe0           jmp rax
..
|      ||   ; CODE XREFS from sym.register_tm_clones @ 0x716, 0x722
|      ``-> 0x00000730      5d             pop rbp
\           0x00000731      c3             ret
            ;-- __do_global_dtors_aux:
/ (fcn) entry.fini0 51
|   entry.fini0 ();
|           0x00000740      803dc9082000.  cmp byte [obj.completed.7698], 0 ; rdi
|                                                                      ; [0x201010:1]=0
|       ,=< 0x00000747      752f           jne 0x778
|       |   0x00000749      48833da70820.  cmp qword [reloc.__cxa_finalize], 0 ; [0x200ff8:8]=0
|       |   0x00000751      55             push rbp
|       |   0x00000752      4889e5         mov rbp, rsp
|      ,==< 0x00000755      740c           je 0x763
|      ||   0x00000757      488b3daa0820.  mov rdi, qword [obj.__dso_handle] ; [0x201008:8]=0x201008 obj.__dso_handle
|      ||   0x0000075e      e80dffffff     call sym..plt.got
|      ||   ; CODE XREF from entry.fini0 @ 0x755
|      `--> 0x00000763      e848ffffff     call sym.deregister_tm_clones
|       |   0x00000768      c605a1082000.  mov byte [obj.completed.7698], 1 ; rdi
|       |                                                              ; [0x201010:1]=0
|       |   0x0000076f      5d             pop rbp
|       |   0x00000770      c3             ret
..
|       |   ; CODE XREF from entry.fini0 @ 0x747
\       `-> 0x00000778      f3c3           ret
        :   ;-- frame_dummy:
/ (fcn) entry.init0 10
|   entry.init0 ();
|       :   0x00000780      55             push rbp
|       :   0x00000781      4889e5         mov rbp, rsp
|       :   0x00000784      5d             pop rbp
\       `=< 0x00000785      e966ffffff     jmp sym.register_tm_clones
/ (fcn) sym.__libc_csu_fini 2
|   sym.__libc_csu_fini ();
|           ; DATA XREF from entry0 @ 0x68f
\           0x000009a0      f3c3           ret
            ;-- section..fini:
            ;-- .fini:
/ (fcn) sym._fini 9
|   sym._fini ();
|           0x000009a4      4883ec08       sub rsp, 8                  ; [15] -r-x section size 9 named .fini
|           0x000009a8      4883c408       add rsp, 8
\           0x000009ac      c3             ret
/ (fcn) sym.__libc_csu_init 101
|   sym.__libc_csu_init (int32_t arg1, int32_t arg2, int32_t arg3);
|           ; arg int32_t arg1 @ rdi
|           ; arg int32_t arg2 @ rsi
|           ; arg int32_t arg3 @ rdx
|           ; DATA XREF from entry0 @ 0x696
|           0x00000930      4157           push r15
|           0x00000932      4156           push r14
|           0x00000934      4989d7         mov r15, rdx                ; arg3
|           0x00000937      4155           push r13
|           0x00000939      4154           push r12
|           0x0000093b      4c8d25560420.  lea r12, qword obj.__frame_dummy_init_array_entry ; loc.__init_array_start
|                                                                      ; 0x200d98
|           0x00000942      55             push rbp
|           0x00000943      488d2d560420.  lea rbp, qword obj.__do_global_dtors_aux_fini_array_entry ; loc.__init_array_end
|                                                                      ; 0x200da0 ; "@\a"
|           0x0000094a      53             push rbx
|           0x0000094b      4189fd         mov r13d, edi               ; arg1
|           0x0000094e      4989f6         mov r14, rsi                ; arg2
|           0x00000951      4c29e5         sub rbp, r12
|           0x00000954      4883ec08       sub rsp, 8
|           0x00000958      48c1fd03       sar rbp, 3
|           0x0000095c      e88ffcffff     call sym._init
|           0x00000961      4885ed         test rbp, rbp
|       ,=< 0x00000964      7420           je 0x986
|       |   0x00000966      31db           xor ebx, ebx
|       |   0x00000968      0f1f84000000.  nop dword [rax + rax]
|       |   ; CODE XREF from sym.__libc_csu_init @ 0x984
|      .--> 0x00000970      4c89fa         mov rdx, r15
|      :|   0x00000973      4c89f6         mov rsi, r14
|      :|   0x00000976      4489ef         mov edi, r13d
|      :|   0x00000979      41ff14dc       call qword [r12 + rbx*8]
|      :|   0x0000097d      4883c301       add rbx, 1
|      :|   0x00000981      4839dd         cmp rbp, rbx
|      `==< 0x00000984      75ea           jne 0x970
|       |   ; CODE XREF from sym.__libc_csu_init @ 0x964
|       `-> 0x00000986      4883c408       add rsp, 8
|           0x0000098a      5b             pop rbx
|           0x0000098b      5d             pop rbp
|           0x0000098c      415c           pop r12
|           0x0000098e      415d           pop r13
|           0x00000990      415e           pop r14
|           0x00000992      415f           pop r15
\           0x00000994      c3             ret
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
            ;-- section..init:
            ;-- .init:
/ (fcn) sym._init 23
|   sym._init ();
|           ; CALL XREF from sym.__libc_csu_init @ 0x95c
|           0x000005f0      4883ec08       sub rsp, 8                  ; [11] -r-x section size 23 named .init
|           0x000005f4      488b05ed0920.  mov rax, qword [reloc.__gmon_start] ; [0x200fe8:8]=0
|           0x000005fb      4885c0         test rax, rax
|       ,=< 0x000005fe      7402           je 0x602
|       |   0x00000600      ffd0           call rax
|       |   ; CODE XREF from sym._init @ 0x5fe
|       `-> 0x00000602      4883c408       add rsp, 8
\           0x00000606      c3             ret
/ (fcn) sym.imp.strcpy 6
|   char *sym.imp.strcpy (char *dest, const char *src);
|           ; CALL XREF from main @ 0x843
\           0x00000620      ff258a092000   jmp qword [reloc.strcpy]    ; [0x200fb0:8]=0x626 ; "&\x06"
/ (fcn) sym.imp.puts 6
|   int sym.imp.puts (const char *s);
|           ; CALL XREFS from main @ 0x7c2, 0x7e1, 0x81c
\           0x00000630      ff2582092000   jmp qword [reloc.puts]      ; [0x200fb8:8]=0x636 ; "6\x06"
/ (fcn) sym.imp.strlen 6
|   size_t sym.imp.strlen (const char *s);
|           ; CALL XREFS from main @ 0x801, 0x8e1
\           0x00000640      ff257a092000   jmp qword [reloc.strlen]    ; [0x200fc0:8]=0x646 ; "F\x06"
/ (fcn) sym.imp.__stack_chk_fail 6
|   void sym.imp.__stack_chk_fail ();
|           ; CALL XREF from main @ 0x91a
\           0x00000650      ff2572092000   jmp qword [reloc.__stack_chk_fail] ; [0x200fc8:8]=0x656 ; "V\x06"
/ (fcn) sym.imp.printf 6
|   int sym.imp.printf (const char *format);
|           ; CALL XREF from main @ 0x901
\           0x00000660      ff256a092000   jmp qword [reloc.printf]    ; [0x200fd0:8]=0x666 ; "f\x06"
            ;-- section.:
            ;-- section..comment:
            ;-- section..symtab:
            ;-- section..strtab:
            ;-- section..shstrtab:
            ;-- segment.LOAD0:
            ;-- segment.GNU_STACK:
            ;-- segment.ehdr:
            ;-- .comment:
            ;-- imp.__libc_start_main:
            ;-- imp.__gmon_start__:
            ;-- imp._ITM_registerTMCloneTable:
            ;-- imp.__cxa_finalize:
            ;-- rbx:
            ;-- rdx:
            ;-- r9:
            ;-- r10:
            ;-- r11:
            ;-- r12:
            ;-- r13:
            ;-- r14:
            ;-- r15:
            ;-- rax:
            ;-- rsi:
/ (fcn) loc.imp._ITM_deregisterTMCloneTable 492
|   loc.imp._ITM_deregisterTMCloneTable (int32_t arg2, uint32_t arg3, int32_t arg4);
|           ; arg int32_t arg2 @ rsi
|           ; arg uint32_t arg3 @ rdx
|           ; arg int32_t arg4 @ rcx
|           ; CALL XREF from sym.__libc_csu_init @ 0x979
|       ,=< 0x00000000      7f45           jg 0x47                     ; [28] ---- section size 254 named .shstrtab
|       |   ; DATA XREF from r8 @ +0x1a1
|       |   ; DATA XREF from sym.imp.strlen @ +0x6
|       |   0x00000002      4c460201       add r8b, byte [rcx]         ; arg4
|       |   0x00000006      0100           add dword [rax], eax
|       |   0x00000008      0000           add byte [rax], al
|       |   0x0000000a      0000           add byte [rax], al
|       |   0x0000000c      0000           add byte [rax], al
|       |   0x0000000e      0000           add byte [rax], al
|       |   0x00000010      0300           add eax, dword [rax]
|       |   0x00000012      3e0001         add byte ds:[rcx], al       ; arg4
|       |   0x00000015      0000           add byte [rax], al
|       |   0x00000017      008006000000   add byte [rax + 6], al
|       |   0x0000001d      0000           add byte [rax], al
|       |   0x0000001f      004000         add byte [rax], al
|       |   ; DATA XREF from section..eh_frame @ +0x6a
|       |   0x00000022      0000           add byte [rax], al
|       |   0x00000024      0000           add byte [rax], al
|       |   0x00000026      0000           add byte [rax], al
|       |   0x00000028      e819000000     call 0x46
|       |   0x0000002d      0000           add byte [rax], al
|       |   0x0000002f      0000           add byte [rax], al
|       |   0x00000031      0000           add byte [rax], al
|       |   0x00000033      004000         add byte [rax], al
|       |   0x00000036      3800           cmp byte [rax], al
|       |   0x00000038      0900           or dword [rax], eax
|       |   0x0000003a  ~   40001d001c00.  add byte [0x06001c41], bl   ; [0x6001c41:1]=255
|       |   ;-- segment.PHDR:
..
|       |   0x00000041      0000           add byte [rax], al
|       |   0x00000043  ~   000400         add byte [rax + rax], al
|       |   ;-- rflags:
..
|       |   ; CALL XREF from loc.imp._ITM_deregisterTMCloneTable @ 0x28
|       |   0x00000046  ~   0000           add byte [rax], al
|       |   ; CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 
|       `-> 0x00000047      004000         add byte [rax], al
|           0x0000004a      0000           add byte [rax], al
|           0x0000004c      0000           add byte [rax], al
|           0x0000004e      0000           add byte [rax], al
|           0x00000050      400000         add byte [rax], al
|           0x00000053      0000           add byte [rax], al
|           0x00000055      0000           add byte [rax], al
|           0x00000057      004000         add byte [rax], al
|           0x0000005a      0000           add byte [rax], al
|           0x0000005c      0000           add byte [rax], al
|           0x0000005e      0000           add byte [rax], al
|           0x00000060      f8             clc
|           0x00000061      0100           add dword [rax], eax
|           0x00000063      0000           add byte [rax], al
|           0x00000065      0000           add byte [rax], al
|           0x00000067      00f8           add al, bh
|           0x00000069      0100           add dword [rax], eax
|           0x0000006b      0000           add byte [rax], al
|           0x0000006d      0000           add byte [rax], al
|           0x0000006f      0008           add byte [rax], cl
|           0x00000071      0000           add byte [rax], al
|           0x00000073      0000           add byte [rax], al
|           0x00000075      0000           add byte [rax], al
|           0x00000077      0003           add byte [rbx], al
|           0x00000079      0000           add byte [rax], al
|           0x0000007b      000400         add byte [rax + rax], al
|           0x0000007e  ~   0000           add byte [rax], al
|           ;-- r8:
..
|           0x00000080      3802           cmp byte [rdx], al          ; arg3
|           0x00000082      0000           add byte [rax], al
|           0x00000084      0000           add byte [rax], al
|           0x00000086      0000           add byte [rax], al
|           0x00000088      3802           cmp byte [rdx], al          ; arg3
|           0x0000008a      0000           add byte [rax], al
|           0x0000008c      0000           add byte [rax], al
|           0x0000008e      0000           add byte [rax], al
|           0x00000090      3802           cmp byte [rdx], al          ; arg3
|           0x00000092      0000           add byte [rax], al
|           0x00000094      0000           add byte [rax], al
|           0x00000096      0000           add byte [rax], al
|           0x00000098      1c00           sbb al, 0
|           0x0000009a      0000           add byte [rax], al
|           0x0000009c      0000           add byte [rax], al
|           0x0000009e      0000           add byte [rax], al
|           0x000000a0      1c00           sbb al, 0
|           0x000000a2      0000           add byte [rax], al
|           0x000000a4      0000           add byte [rax], al
|           0x000000a6      0000           add byte [rax], al
|           0x000000a8      0100           add dword [rax], eax
|           0x000000aa      0000           add byte [rax], al
|           0x000000ac      0000           add byte [rax], al
|           0x000000ae      0000           add byte [rax], al
|           0x000000b0      0100           add dword [rax], eax
|           0x000000b2      0000           add byte [rax], al
|           0x000000b4      0500000000     add eax, 0
|           0x000000b9      0000           add byte [rax], al
|           0x000000bb      0000           add byte [rax], al
|           0x000000bd      0000           add byte [rax], al
|           0x000000bf      0000           add byte [rax], al
|           0x000000c1      0000           add byte [rax], al
|           0x000000c3      0000           add byte [rax], al
|           0x000000c5      0000           add byte [rax], al
|           0x000000c7      0000           add byte [rax], al
|           0x000000c9      0000           add byte [rax], al
|           0x000000cb      0000           add byte [rax], al
|           0x000000cd      0000           add byte [rax], al
|           0x000000cf      00700b         add byte [rax + 0xb], dh
|           0x000000d2      0000           add byte [rax], al
|           0x000000d4      0000           add byte [rax], al
|           0x000000d6      0000           add byte [rax], al
|       ,=< 0x000000d8      700b           jo 0xe5
|       |   0x000000da      0000           add byte [rax], al
|       |   0x000000dc      0000           add byte [rax], al
|       |   0x000000de      0000           add byte [rax], al
|       |   0x000000e0      0000           add byte [rax], al
|       |   0x000000e2      2000           and byte [rax], al
|       |   0x000000e4  ~   0000           add byte [rax], al
|       |   ; CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 0xd8
|       `-> 0x000000e5      0000           add byte [rax], al
|           0x000000e7      0001           add byte [rcx], al          ; arg4
|           0x000000e9      0000           add byte [rax], al
|           0x000000eb      0006           add byte [rsi], al          ; arg2
|           0x000000ed      0000           add byte [rax], al
|           0x000000ef      00980d000000   add byte [rax + 0xd], bl
|           0x000000f5      0000           add byte [rax], al
|           0x000000f7      00980d200000   add byte [rax + 0x200d], bl
|           0x000000fd      0000           add byte [rax], al
|           0x000000ff      00980d200000   add byte [rax + 0x200d], bl
|           0x00000105      0000           add byte [rax], al
|           0x00000107      007802         add byte [rax + 2], bh
|           0x0000010a      0000           add byte [rax], al
|           0x0000010c      0000           add byte [rax], al
|           0x0000010e      0000           add byte [rax], al
|           0x00000110      800200         add byte [rdx], 0           ; arg3
|           0x00000113      0000           add byte [rax], al
|           0x00000115      0000           add byte [rax], al
|           0x00000117      0000           add byte [rax], al
|           0x00000119      0020           add byte [rax], ah
|           0x0000011b      0000           add byte [rax], al
|           0x0000011d      0000           add byte [rax], al
|           0x0000011f      0002           add byte [rdx], al          ; arg3
|           0x00000121      0000           add byte [rax], al
|           0x00000123      0006           add byte [rsi], al          ; arg2
|           0x00000125      0000           add byte [rax], al
|           0x00000127      00a80d000000   add byte [rax + 0xd], ch
|           0x0000012d      0000           add byte [rax], al
|           0x0000012f      00a80d200000   add byte [rax + 0x200d], ch
|           0x00000135      0000           add byte [rax], al
|           0x00000137      00a80d200000   add byte [rax + 0x200d], ch
|           0x0000013d      0000           add byte [rax], al
|           0x0000013f      00f0           add al, dh
|           0x00000141      0100           add dword [rax], eax
|           0x00000143      0000           add byte [rax], al
|           0x00000145      0000           add byte [rax], al
|           0x00000147      00f0           add al, dh
|           0x00000149      0100           add dword [rax], eax
|           0x0000014b      0000           add byte [rax], al
|           0x0000014d      0000           add byte [rax], al
|           0x0000014f      0008           add byte [rax], cl
|           0x00000151      0000           add byte [rax], al
|           0x00000153      0000           add byte [rax], al
|           0x00000155      0000           add byte [rax], al
|           0x00000157      000400         add byte [rax + rax], al
|           0x0000015a      0000           add byte [rax], al
|           0x0000015c      0400           add al, 0
|           0x0000015e      0000           add byte [rax], al
|           0x00000160      54             push rsp
|           0x00000161      0200           add al, byte [rax]
|           0x00000163      0000           add byte [rax], al
|           0x00000165      0000           add byte [rax], al
|           0x00000167      00540200       add byte [rdx + rax], dl    ; arg3
|           0x0000016b      0000           add byte [rax], al
|           0x0000016d      0000           add byte [rax], al
|           0x0000016f      00540200       add byte [rdx + rax], dl
|           0x00000173      0000           add byte [rax], al
|           0x00000175      0000           add byte [rax], al
|           0x00000177      00440000       add byte [rax + rax], al
|           0x0000017b      0000           add byte [rax], al
|           0x0000017d      0000           add byte [rax], al
|           0x0000017f      00440000       add byte [rax + rax], al
|           0x00000183      0000           add byte [rax], al
|           0x00000185      0000           add byte [rax], al
|           0x00000187      000400         add byte [rax + rax], al
|           0x0000018a      0000           add byte [rax], al
|           0x0000018c      0000           add byte [rax], al
|           0x0000018e      0000           add byte [rax], al
|           0x00000190      50             push rax
|           0x00000191      e574           in eax, 0x74
|           0x00000193      640400         add al, 0
|           0x00000196      0000           add byte [rax], al
|           0x00000198      240a           and al, 0xa
|           0x0000019a      0000           add byte [rax], al
|           0x0000019c      0000           add byte [rax], al
|           0x0000019e      0000           add byte [rax], al
|           0x000001a0      240a           and al, 0xa
|           0x000001a2      0000           add byte [rax], al
|           0x000001a4      0000           add byte [rax], al
|           0x000001a6      0000           add byte [rax], al
|           0x000001a8      240a           and al, 0xa
|           0x000001aa      0000           add byte [rax], al
|           0x000001ac      0000           add byte [rax], al
|           0x000001ae      0000           add byte [rax], al
|           0x000001b0      3c00           cmp al, 0
|           0x000001b2      0000           add byte [rax], al
|           0x000001b4      0000           add byte [rax], al
|           0x000001b6      0000           add byte [rax], al
|           0x000001b8      3c00           cmp al, 0
|           0x000001ba      0000           add byte [rax], al
|           0x000001bc      0000           add byte [rax], al
|           0x000001be      0000           add byte [rax], al
|           0x000001c0      0400           add al, 0
|           0x000001c2      0000           add byte [rax], al
|           0x000001c4      0000           add byte [rax], al
|           0x000001c6      0000           add byte [rax], al
|           0x000001c8      51             push rcx
\           0x000001c9      e574           in eax, 0x74
..
