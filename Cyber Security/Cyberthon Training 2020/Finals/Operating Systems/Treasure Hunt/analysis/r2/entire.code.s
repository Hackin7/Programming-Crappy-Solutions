            ;-- section..text:
            ;-- .text:
            ;-- _start:
/ (fcn) entry0 42
|   entry0 (int32_t arg3);
|           ; arg int32_t arg3 @ rdx
|           0x00000780      31ed           xor ebp, ebp                ; [14] -r-x section size 2562 named .text
|           0x00000782      4989d1         mov r9, rdx                 ; arg3
|           0x00000785      5e             pop rsi
|           0x00000786      4889e2         mov rdx, rsp
|           0x00000789      4883e4f0       and rsp, 0xfffffffffffffff0
|           0x0000078d      50             push rax
|           0x0000078e      54             push rsp
|           0x0000078f      4c8d05ea0900.  lea r8, qword [sym.__libc_csu_fini] ; 0x1180
|           0x00000796      488d0d730900.  lea rcx, qword [sym.__libc_csu_init] ; 0x1110 ; "AWAVI\x89\xd7AUATL\x8d%^\x1c "
|           0x0000079d      488d3de60000.  lea rdi, qword [main]       ; sym.main
|                                                                      ; 0x88a
\           0x000007a4      ff1536282000   call qword [reloc.__libc_start_main] ; [0x202fe0:8]=0
            ;-- rip:
/ (fcn) sym.deregister_tm_clones 40
|   sym.deregister_tm_clones ();
|           ; CALL XREF from entry.fini0 @ 0x863
|           0x000007b0      488d3d592820.  lea rdi, qword obj.completed.7697 ; 0x203010
|           0x000007b7      55             push rbp
|           0x000007b8      488d05512820.  lea rax, qword obj.completed.7697 ; rdi
|                                                                      ; 0x203010
|           0x000007bf      4839f8         cmp rax, rdi
|           0x000007c2      4889e5         mov rbp, rsp
|       ,=< 0x000007c5      7419           je 0x7e0
|       |   0x000007c7      488b050a2820.  mov rax, qword [reloc._ITM_deregisterTMCloneTable] ; [0x202fd8:8]=0
|       |   0x000007ce      4885c0         test rax, rax
|      ,==< 0x000007d1      740d           je 0x7e0
|      ||   0x000007d3      5d             pop rbp
|      ||   0x000007d4      ffe0           jmp rax
..
|      ||   ; CODE XREFS from sym.deregister_tm_clones @ 0x7c5, 0x7d1
|      ``-> 0x000007e0      5d             pop rbp
\           0x000007e1      c3             ret
/ (fcn) sym.register_tm_clones 57
|   sym.register_tm_clones ();
|           ; CODE XREF from entry.init0 @ 0x885
|           0x000007f0      488d3d192820.  lea rdi, qword obj.completed.7697 ; 0x203010
|           0x000007f7      488d35122820.  lea rsi, qword obj.completed.7697 ; rdi
|                                                                      ; 0x203010
|           0x000007fe      55             push rbp
|           0x000007ff      4829fe         sub rsi, rdi
|           0x00000802      4889e5         mov rbp, rsp
|           0x00000805      48c1fe03       sar rsi, 3
|           0x00000809      4889f0         mov rax, rsi
|           0x0000080c      48c1e83f       shr rax, 0x3f
|           0x00000810      4801c6         add rsi, rax
|           0x00000813      48d1fe         sar rsi, 1
|       ,=< 0x00000816      7418           je 0x830
|       |   0x00000818      488b05d12720.  mov rax, qword [reloc._ITM_registerTMCloneTable] ; [0x202ff0:8]=0
|       |   0x0000081f      4885c0         test rax, rax
|      ,==< 0x00000822      740c           je 0x830
|      ||   0x00000824      5d             pop rbp
|      ||   0x00000825      ffe0           jmp rax
..
|      ||   ; CODE XREFS from sym.register_tm_clones @ 0x816, 0x822
|      ``-> 0x00000830      5d             pop rbp
\           0x00000831      c3             ret
            ;-- __do_global_dtors_aux:
/ (fcn) entry.fini0 51
|   entry.fini0 ();
|           0x00000840      803dc9272000.  cmp byte [obj.completed.7697], 0 ; rdi
|                                                                      ; [0x203010:1]=0
|       ,=< 0x00000847      752f           jne 0x878
|       |   0x00000849      48833da72720.  cmp qword [reloc.__cxa_finalize], 0 ; [0x202ff8:8]=0
|       |   0x00000851      55             push rbp
|       |   0x00000852      4889e5         mov rbp, rsp
|      ,==< 0x00000855      740c           je 0x863
|      ||   0x00000857      488b3daa2720.  mov rdi, qword [obj.__dso_handle] ; [0x203008:8]=0x203008 obj.__dso_handle
|      ||   0x0000085e      e80dffffff     call sym..plt.got
|      ||   ; CODE XREF from entry.fini0 @ 0x855
|      `--> 0x00000863      e848ffffff     call sym.deregister_tm_clones
|       |   0x00000868      c605a1272000.  mov byte [obj.completed.7697], 1 ; rdi
|       |                                                              ; [0x203010:1]=0
|       |   0x0000086f      5d             pop rbp
|       |   0x00000870      c3             ret
..
|       |   ; CODE XREF from entry.fini0 @ 0x847
\       `-> 0x00000878      f3c3           ret
        :   ;-- frame_dummy:
/ (fcn) entry.init0 10
|   entry.init0 ();
|       :   0x00000880      55             push rbp
|       :   0x00000881      4889e5         mov rbp, rsp
|       :   0x00000884      5d             pop rbp
\       `=< 0x00000885      e966ffffff     jmp sym.register_tm_clones
/ (fcn) sym.__libc_csu_fini 2
|   sym.__libc_csu_fini ();
|           ; DATA XREF from entry0 @ 0x78f
\           0x00001180      f3c3           ret
/ (fcn) sym.menu 301
|   sym.menu ();
|           ; var int32_t var_10h @ rbp-0x10
|           ; var uint32_t var_ch @ rbp-0xc
|           ; var int32_t canary @ rbp-0x8
|           ; CALL XREF from main @ 0x893
|           0x00000b25      55             push rbp
|           0x00000b26      4889e5         mov rbp, rsp
|           0x00000b29      4883ec10       sub rsp, 0x10
|           0x00000b2d      64488b042528.  mov rax, qword fs:[0x28]
|           0x00000b36      488945f8       mov qword [canary], rax
|           0x00000b3a      31c0           xor eax, eax
|           0x00000b3c      488d3d7d0800.  lea rdi, qword str.Welcome_to_ShoppingBaba_s_Annual_Treasure_Hunt_game ; 0x13c0 ; "Welcome to ShoppingBaba's Annual Treasure Hunt game!" ; const char *s
|           0x00000b43      e8b8fbffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000b48      488d3da90800.  lea rdi, qword str.Look_for_the_flag_hidden_in_this_Treasure_to_win_points ; 0x13f8 ; "Look for the flag hidden in this Treasure to win points!" ; const char *format
|           0x00000b4f      b800000000     mov eax, 0
|           0x00000b54      e8d7fbffff     call sym.imp.printf         ; int printf(const char *format)
|           0x00000b59      488d3dd80800.  lea rdi, qword str.In_this_game__you_can_either_navigate_in_ShoppingBaba_center_by_the_following_ways: ; 0x1438 ; "In this game, you can either navigate in ShoppingBaba center by the following ways:\n" ; const char *s
|           0x00000b60      e89bfbffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000b65      488d3d210900.  lea rdi, qword str.1:_Move_to_a_random_spot ; 0x148d ; "1: Move to a random spot" ; const char *s
|           0x00000b6c      e88ffbffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000b71      488d3d300900.  lea rdi, qword str.2:_Teleport_to_a_known_coordinate ; 0x14a8 ; "2: Teleport to a known coordinate" ; const char *s
|           0x00000b78      e883fbffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000b7d      488d3d460900.  lea rdi, qword str.9:_Exit_the_Treasure_Hunt ; 0x14ca ; "9: Exit the Treasure Hunt" ; const char *s
|           0x00000b84      e877fbffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000b89      bf0a000000     mov edi, 0xa                ; int c
|           0x00000b8e      e85dfbffff     call sym.imp.putchar        ; int putchar(int c)
|           0x00000b93      c745f0ffffff.  mov dword [var_10h], 0xffffffff ; -1
|           0x00000b9a      488d3d470900.  lea rdi, qword str.Please_enter_the_option_to_move_around: ; 0x14e8 ; "Please enter the option to move around: " ; const char *format
|           0x00000ba1      b800000000     mov eax, 0
|           0x00000ba6      e885fbffff     call sym.imp.printf         ; int printf(const char *format)
|           0x00000bab      488d45f0       lea rax, qword [var_10h]
|           0x00000baf      4889c6         mov rsi, rax
|           0x00000bb2      488d3d580900.  lea rdi, qword [0x00001511] ; "%d" ; const char *format
|           0x00000bb9      b800000000     mov eax, 0
|           0x00000bbe      e88dfbffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|       ,=< 0x00000bc3      eb6e           jmp 0xc33
|       |   ; CODE XREF from sym.menu @ 0xc39
|      .--> 0x00000bc5      8b45f0         mov eax, dword [var_10h]
|      :|   0x00000bc8      83f801         cmp eax, 1
|     ,===< 0x00000bcb      750c           jne 0xbd9
|     |:|   0x00000bcd      b800000000     mov eax, 0
|     |:|   0x00000bd2      e8c8fcffff     call sym.randomise
|    ,====< 0x00000bd7      eb31           jmp 0xc0a
|    ||:|   ; CODE XREF from sym.menu @ 0xbcb
|    |`---> 0x00000bd9      8b45f0         mov eax, dword [var_10h]
|    | :|   0x00000bdc      83f802         cmp eax, 2
|    |,===< 0x00000bdf      7515           jne 0xbf6
|    ||:|   0x00000be1      b800000000     mov eax, 0
|    ||:|   0x00000be6      e8c8fdffff     call sym.manual
|    ||:|   0x00000beb      8945f4         mov dword [var_ch], eax
|    ||:|   0x00000bee      837df4ff       cmp dword [var_ch], -1
|   ,=====< 0x00000bf2      7516           jne 0xc0a
|  ,======< 0x00000bf4      eb45           jmp 0xc3b
|  ||||:|   ; CODE XREF from sym.menu @ 0xbdf
|  |||`---> 0x00000bf6      8b45f0         mov eax, dword [var_10h]
|  ||| :|   0x00000bf9      83f809         cmp eax, 9
|  |||,===< 0x00000bfc      750c           jne 0xc0a
|  ||||:|   0x00000bfe      488d3d0f0900.  lea rdi, qword str.Bye      ; 0x1514 ; "Bye!" ; const char *s
|  ||||:|   0x00000c05      e8f6faffff     call sym.imp.puts           ; int puts(const char *s)
|  ||||:|   ; CODE XREFS from sym.menu @ 0xbd7, 0xbf2, 0xbfc
|  |```---> 0x00000c0a      488d3dd70800.  lea rdi, qword str.Please_enter_the_option_to_move_around: ; 0x14e8 ; "Please enter the option to move around: " ; const char *format
|  |   :|   0x00000c11      b800000000     mov eax, 0
|  |   :|   0x00000c16      e815fbffff     call sym.imp.printf         ; int printf(const char *format)
|  |   :|   0x00000c1b      488d45f0       lea rax, qword [var_10h]
|  |   :|   0x00000c1f      4889c6         mov rsi, rax
|  |   :|   0x00000c22      488d3de80800.  lea rdi, qword [0x00001511] ; "%d" ; const char *format
|  |   :|   0x00000c29      b800000000     mov eax, 0
|  |   :|   0x00000c2e      e81dfbffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|  |   :|   ; CODE XREF from sym.menu @ 0xbc3
|  |   :`-> 0x00000c33      8b45f0         mov eax, dword [var_10h]
|  |   :    0x00000c36      83f809         cmp eax, 9
|  |   `==< 0x00000c39      758a           jne 0xbc5
|  |        ; CODE XREF from sym.menu @ 0xbf4
|  `------> 0x00000c3b      90             nop
|           0x00000c3c      488b45f8       mov rax, qword [canary]
|           0x00000c40      644833042528.  xor rax, qword fs:[0x28]
|       ,=< 0x00000c49      7405           je 0xc50
|       |   0x00000c4b      e8d0faffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
|       |   ; CODE XREF from sym.menu @ 0xc49
|       `-> 0x00000c50      c9             leave
\           0x00000c51      c3             ret
            ;-- section..fini:
            ;-- .fini:
/ (fcn) sym._fini 9
|   sym._fini ();
|           0x00001184      4883ec08       sub rsp, 8                  ; [15] -r-x section size 9 named .fini
|           0x00001188      4883c408       add rsp, 8
\           0x0000118c      c3             ret
/ (fcn) sym.locations 1211
|   sym.locations (int32_t arg8, int32_t arg7);
|           ; var int32_t var_30h @ rbp-0x30
|           ; var int32_t var_28h @ rbp-0x28
|           ; var char *var_18h @ rbp-0x18
|           ; var char *var_10h @ rbp-0x10
|           ; var char *s @ rbp-0x8
|           ; arg int32_t arg8 @ xmm1
|           ; arg int32_t arg7 @ xmm0
|           ; CALL XREF from sym.randomise @ 0x900
|           ; CALL XREF from sym.manual @ 0xb0a
|           0x00000c52      55             push rbp
|           0x00000c53      4889e5         mov rbp, rsp
|           0x00000c56      4883ec30       sub rsp, 0x30
|           0x00000c5a      f20f1145d8     movsd qword [var_28h], xmm0 ; arg7
|           0x00000c5f      f20f114dd0     movsd qword [var_30h], xmm1 ; arg8
|           0x00000c64      f20f1045d8     movsd xmm0, qword [var_28h]
|           0x00000c69      660f2e05e70f.  ucomisd xmm0, qword [0x00001c58]
|       ,=< 0x00000c71      7a56           jp 0xcc9
|       |   0x00000c73      f20f1045d8     movsd xmm0, qword [var_28h]
|       |   0x00000c78      660f2e05d80f.  ucomisd xmm0, qword [0x00001c58]
|      ,==< 0x00000c80      7547           jne 0xcc9
|      ||   0x00000c82      f20f1045d0     movsd xmm0, qword [var_30h]
|      ||   0x00000c87      660f2e05d10f.  ucomisd xmm0, qword [0x00001c60]
|     ,===< 0x00000c8f      7a38           jp 0xcc9
|     |||   0x00000c91      f20f1045d0     movsd xmm0, qword [var_30h]
|     |||   0x00000c96      660f2e05c20f.  ucomisd xmm0, qword [0x00001c60]
|    ,====< 0x00000c9e      7529           jne 0xcc9
|    ||||   0x00000ca0      488d3d790800.  lea rdi, qword str.You_have_landed_at_CSIT_Technology_Centre ; 0x1520 ; "You have landed at CSIT Technology Centre!" ; const char *s
|    ||||   0x00000ca7      e854faffff     call sym.imp.puts           ; int puts(const char *s)
|    ||||   0x00000cac      488d3d9d0800.  lea rdi, qword str.Le_random_dude_came_to_you_and_said: ; 0x1550 ; "Le random dude came to you and said: " ; const char *s
|    ||||   0x00000cb3      e848faffff     call sym.imp.puts           ; int puts(const char *s)
|    ||||   0x00000cb8      488d3db90800.  lea rdi, qword str.We_conduct_vulnerability_assessments_on_critical_software_and_infrastructure_to_find_and_assess_security_threats ; 0x1578 ; "We conduct vulnerability assessments on critical software and infrastructure to find and assess security threats! \n" ; const char *s
|    ||||   0x00000cbf      e83cfaffff     call sym.imp.puts           ; int puts(const char *s)
|   ,=====< 0x00000cc4      e941040000     jmp 0x110a
|   |||||   ; CODE XREFS from sym.locations @ 0xc71, 0xc80, 0xc8f, 0xc9e
|   |````-> 0x00000cc9      f20f1045d8     movsd xmm0, qword [var_28h]
|   |       0x00000cce      660f2e05920f.  ucomisd xmm0, qword [0x00001c68]
|   |   ,=< 0x00000cd6      7a56           jp 0xd2e
|   |   |   0x00000cd8      f20f1045d8     movsd xmm0, qword [var_28h]
|   |   |   0x00000cdd      660f2e05830f.  ucomisd xmm0, qword [0x00001c68]
|   |  ,==< 0x00000ce5      7547           jne 0xd2e
|   |  ||   0x00000ce7      f20f1045d0     movsd xmm0, qword [var_30h]
|   |  ||   0x00000cec      660f2e057c0f.  ucomisd xmm0, qword [0x00001c70]
|   | ,===< 0x00000cf4      7a38           jp 0xd2e
|   | |||   0x00000cf6      f20f1045d0     movsd xmm0, qword [var_30h]
|   | |||   0x00000cfb      660f2e056d0f.  ucomisd xmm0, qword [0x00001c70]
|   |,====< 0x00000d03      7529           jne 0xd2e
|   |||||   0x00000d05      488d3de40800.  lea rdi, qword str.You_have_landed_at_Kandell_Food_Court ; 0x15f0 ; "You have landed at Kandell Food Court!" ; const char *s
|   |||||   0x00000d0c      e8eff9ffff     call sym.imp.puts           ; int puts(const char *s)
|   |||||   0x00000d11      488d3d000900.  lea rdi, qword str.There_is_loads_of_people_eating_their_favourite_cai_peng_here: ; 0x1618 ; "There is loads of people eating their favourite cai peng here: " ; const char *s
|   |||||   0x00000d18      e8e3f9ffff     call sym.imp.puts           ; int puts(const char *s)
|   |||||   0x00000d1d      488d3d340900.  lea rdi, qword str.No_signs_of_the_cyberthon_flag_though... ; 0x1658 ; "No signs of the cyberthon flag though... \n" ; const char *s
|   |||||   0x00000d24      e8d7f9ffff     call sym.imp.puts           ; int puts(const char *s)
|  ,======< 0x00000d29      e9dc030000     jmp 0x110a
|  ||||||   ; CODE XREFS from sym.locations @ 0xcd6, 0xce5, 0xcf4, 0xd03
|  ||````-> 0x00000d2e      f20f1045d8     movsd xmm0, qword [var_28h]
|  ||       0x00000d33      660f2e053d0f.  ucomisd xmm0, qword [0x00001c78]
|  ||   ,=< 0x00000d3b      7a56           jp 0xd93
|  ||   |   0x00000d3d      f20f1045d8     movsd xmm0, qword [var_28h]
|  ||   |   0x00000d42      660f2e052e0f.  ucomisd xmm0, qword [0x00001c78]
|  ||  ,==< 0x00000d4a      7547           jne 0xd93
|  ||  ||   0x00000d4c      f20f1045d0     movsd xmm0, qword [var_30h]
|  ||  ||   0x00000d51      660f2e05270f.  ucomisd xmm0, qword [0x00001c80]
|  || ,===< 0x00000d59      7a38           jp 0xd93
|  || |||   0x00000d5b      f20f1045d0     movsd xmm0, qword [var_30h]
|  || |||   0x00000d60      660f2e05180f.  ucomisd xmm0, qword [0x00001c80]
|  ||,====< 0x00000d68      7529           jne 0xd93
|  ||||||   0x00000d6a      488d3d120900.  lea rdi, qword str.You_have_landed_at_Value101 ; 0x1683 ; "You have landed at Value101!" ; const char *s
|  ||||||   0x00000d71      e88af9ffff     call sym.imp.puts           ; int puts(const char *s)
|  ||||||   0x00000d76      488d3d230900.  lea rdi, qword str.There_is_something_that_looks_like_a_flag ; 0x16a0 ; "There is something that looks like a flag!! " ; const char *s
|  ||||||   0x00000d7d      e87ef9ffff     call sym.imp.puts           ; int puts(const char *s)
|  ||||||   0x00000d82      488d3d470900.  lea rdi, qword str.It_is_just_a_popular_Baba_flag_on_display... ; 0x16d0 ; "It is just a popular Baba flag on display... \n" ; const char *s
|  ||||||   0x00000d89      e872f9ffff     call sym.imp.puts           ; int puts(const char *s)
| ,=======< 0x00000d8e      e977030000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xd3b, 0xd4a, 0xd59, 0xd68
| |||````-> 0x00000d93      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00000d98      660f2e05e80e.  ucomisd xmm0, qword [0x00001c88]
| |||   ,=< 0x00000da0      7a56           jp 0xdf8
| |||   |   0x00000da2      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00000da7      660f2e05d90e.  ucomisd xmm0, qword [0x00001c88]
| |||  ,==< 0x00000daf      7547           jne 0xdf8
| |||  ||   0x00000db1      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00000db6      660f2e05d20e.  ucomisd xmm0, qword [0x00001c90]
| ||| ,===< 0x00000dbe      7a38           jp 0xdf8
| ||| |||   0x00000dc0      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00000dc5      660f2e05c30e.  ucomisd xmm0, qword [0x00001c90]
| |||,====< 0x00000dcd      7529           jne 0xdf8
| |||||||   0x00000dcf      488d3d2a0900.  lea rdi, qword str.You_have_landed_at_Cyberthon_Information_Centre ; 0x1700 ; "You have landed at Cyberthon Information Centre!" ; const char *s
| |||||||   0x00000dd6      e825f9ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000ddb      488d3d560900.  lea rdi, qword str.Le_helpful_guy_tells_you_a_helpful_hint: ; 0x1738 ; "Le helpful guy tells you a helpful hint: " ; const char *s
| |||||||   0x00000de2      e819f9ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000de7      488d3d7a0900.  lea rdi, qword str.He_said:_The_flag_is_near_this_location_somewhere... ; 0x1768 ; "He said: The flag is near this location somewhere... \n" ; const char *s
| |||||||   0x00000dee      e80df9ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x00000df3      e912030000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xda0, 0xdaf, 0xdbe, 0xdcd
| |||````-> 0x00000df8      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00000dfd      660f2e05930e.  ucomisd xmm0, qword [0x00001c98]
| |||   ,=< 0x00000e05      7a56           jp 0xe5d
| |||   |   0x00000e07      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00000e0c      660f2e05840e.  ucomisd xmm0, qword [0x00001c98]
| |||  ,==< 0x00000e14      7547           jne 0xe5d
| |||  ||   0x00000e16      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00000e1b      660f2e057d0e.  ucomisd xmm0, qword [0x00001ca0]
| ||| ,===< 0x00000e23      7a38           jp 0xe5d
| ||| |||   0x00000e25      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00000e2a      660f2e056e0e.  ucomisd xmm0, qword [0x00001ca0]
| |||,====< 0x00000e32      7529           jne 0xe5d
| |||||||   0x00000e34      488d3d640900.  lea rdi, qword str.You_have_landed_at_somewhere ; 0x179f ; "You have landed at somewhere!" ; const char *s
| |||||||   0x00000e3b      e8c0f8ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000e40      488d3d790900.  lea rdi, qword str.Le_wild_Pikachu_appears_and_passes_you_a_flag ; 0x17c0 ; "Le wild Pikachu appears and passes you a flag " ; const char *s
| |||||||   0x00000e47      e8b4f8ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000e4c      488d3d9d0900.  lea rdi, qword str.Le_flag_reads:_you_are_really_close_but_not_close__troll_face__with_his_signature_75753333 ; 0x17f0 ; "Le flag reads: you are really close but not close *troll face* with his signature 75753333 \n" ; const char *s
| |||||||   0x00000e53      e8a8f8ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x00000e58      e9ad020000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xe05, 0xe14, 0xe23, 0xe32
| |||````-> 0x00000e5d      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00000e62      660f2e052e0e.  ucomisd xmm0, qword [0x00001c98]
| |||   ,=< 0x00000e6a      0f8a83000000   jp 0xef3
| |||   |   0x00000e70      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00000e75      660f2e051b0e.  ucomisd xmm0, qword [0x00001c98]
| |||  ,==< 0x00000e7d      7574           jne 0xef3
| |||  ||   0x00000e7f      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00000e84      660f2e051c0e.  ucomisd xmm0, qword [0x00001ca8]
| ||| ,===< 0x00000e8c      7a65           jp 0xef3
| ||| |||   0x00000e8e      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00000e93      660f2e050d0e.  ucomisd xmm0, qword [0x00001ca8]
| |||,====< 0x00000e9b      7556           jne 0xef3
| |||||||   0x00000e9d      488d3dfb0800.  lea rdi, qword str.You_have_landed_at_somewhere ; 0x179f ; "You have landed at somewhere!" ; const char *s
| |||||||   0x00000ea4      e857f8ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000ea9      488d3da00900.  lea rdi, qword str.Le_wild_Eevee_appears_and_passes_you_a_flag ; 0x1850 ; "Le wild Eevee appears and passes you a flag " ; const char *s
| |||||||   0x00000eb0      e84bf8ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000eb5      488d05c10900.  lea rax, qword [0x0000187d]
| |||||||   0x00000ebc      488945e8       mov qword [var_18h], rax
| |||||||   0x00000ec0      488d05d40900.  lea rax, qword str.huntingisfun594 ; 0x189b ; "huntingisfun594"
| |||||||   0x00000ec7      488945f0       mov qword [var_10h], rax
| |||||||   0x00000ecb      488b55f0       mov rdx, qword [var_10h]
| |||||||   0x00000ecf      488b45e8       mov rax, qword [var_18h]
| |||||||   0x00000ed3      4889d6         mov rsi, rdx
| |||||||   0x00000ed6      4889c7         mov rdi, rax
| |||||||   0x00000ed9      e82afaffff     call sym.xor
| |||||||   0x00000ede      488945f8       mov qword [s], rax
| |||||||   0x00000ee2      488b45f8       mov rax, qword [s]
| |||||||   0x00000ee6      4889c7         mov rdi, rax                ; const char *s
| |||||||   0x00000ee9      e812f8ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x00000eee      e917020000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xe6a, 0xe7d, 0xe8c, 0xe9b
| |||````-> 0x00000ef3      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00000ef8      660f2e05b00d.  ucomisd xmm0, qword [0x00001cb0]
| |||   ,=< 0x00000f00      7a62           jp 0xf64
| |||   |   0x00000f02      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00000f07      660f2e05a10d.  ucomisd xmm0, qword [0x00001cb0]
| |||  ,==< 0x00000f0f      7553           jne 0xf64
| |||  ||   0x00000f11      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00000f16      660f2e059a0d.  ucomisd xmm0, qword [0x00001cb8]
| ||| ,===< 0x00000f1e      7a44           jp 0xf64
| ||| |||   0x00000f20      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00000f25      660f2e058b0d.  ucomisd xmm0, qword [0x00001cb8]
| |||,====< 0x00000f2d      7535           jne 0xf64
| |||||||   0x00000f2f      488d3d690800.  lea rdi, qword str.You_have_landed_at_somewhere ; 0x179f ; "You have landed at somewhere!" ; const char *s
| |||||||   0x00000f36      e8c5f7ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000f3b      488d3d6e0900.  lea rdi, qword str.Le_wild_chicken_that_escaped_from_the_chicken_rice_appears ; 0x18b0 ; "Le wild chicken that escaped from the chicken rice appears " ; const char *s
| |||||||   0x00000f42      e8b9f7ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000f47      488d3da20900.  lea rdi, qword str.It_appears_to_be_holding_on_to_a_flag... ; 0x18f0 ; "It appears to be holding on to a flag... " ; const char *s
| |||||||   0x00000f4e      e8adf7ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000f53      488d3dc60900.  lea rdi, qword str.He_she_passes_you_the_flag_and_it_reads:__troll_face ; 0x1920 ; "He/she passes you the flag and it reads: *troll face* \n" ; const char *s
| |||||||   0x00000f5a      e8a1f7ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x00000f5f      e9a6010000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xf00, 0xf0f, 0xf1e, 0xf2d
| |||````-> 0x00000f64      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00000f69      660f2e05270d.  ucomisd xmm0, qword [0x00001c98]
| |||   ,=< 0x00000f71      7a56           jp 0xfc9
| |||   |   0x00000f73      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00000f78      660f2e05180d.  ucomisd xmm0, qword [0x00001c98]
| |||  ,==< 0x00000f80      7547           jne 0xfc9
| |||  ||   0x00000f82      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00000f87      660f2e05290d.  ucomisd xmm0, qword [0x00001cb8]
| ||| ,===< 0x00000f8f      7a38           jp 0xfc9
| ||| |||   0x00000f91      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00000f96      660f2e051a0d.  ucomisd xmm0, qword [0x00001cb8]
| |||,====< 0x00000f9e      7529           jne 0xfc9
| |||||||   0x00000fa0      488d3df80700.  lea rdi, qword str.You_have_landed_at_somewhere ; 0x179f ; "You have landed at somewhere!" ; const char *s
| |||||||   0x00000fa7      e854f7ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000fac      488d3da50900.  lea rdi, qword str.A_friendly_neighbourhood_Spiderman_swings_by_and_drops_a_flag... ; 0x1958 ; "A friendly neighbourhood Spiderman swings by and drops a flag... " ; const char *s
| |||||||   0x00000fb3      e848f7ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00000fb8      488d3de10900.  lea rdi, qword str.The_flag_has_an_image_of_Spiderman_s_face_with_his_signature_75758980 ; 0x19a0 ; "The flag has an image of Spiderman's face with his signature 75758980 \n" ; const char *s
| |||||||   0x00000fbf      e83cf7ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x00000fc4      e941010000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xf71, 0xf80, 0xf8f, 0xf9e
| |||````-> 0x00000fc9      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00000fce      660f2e05ea0c.  ucomisd xmm0, qword [0x00001cc0]
| |||   ,=< 0x00000fd6      7a56           jp 0x102e
| |||   |   0x00000fd8      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00000fdd      660f2e05db0c.  ucomisd xmm0, qword [0x00001cc0]
| |||  ,==< 0x00000fe5      7547           jne 0x102e
| |||  ||   0x00000fe7      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00000fec      660f2e05d40c.  ucomisd xmm0, qword [0x00001cc8]
| ||| ,===< 0x00000ff4      7a38           jp 0x102e
| ||| |||   0x00000ff6      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00000ffb      660f2e05c50c.  ucomisd xmm0, qword [0x00001cc8]
| |||,====< 0x00001003      7529           jne 0x102e
| |||||||   0x00001005      488d3ddc0900.  lea rdi, qword str.You_have_landed_at_char___xor_char___message__char___key__the_Chicken_rice_stall ; 0x19e8 ; "You have landed at char * xor(char * message, char * key);the Chicken rice stall!" ; const char *s
| |||||||   0x0000100c      e8eff6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00001011      488d3d280a00.  lea rdi, qword str.They_sell_both_white_and_roasted_chickens ; 0x1a40 ; "They sell both white and roasted chickens! " ; const char *s
| |||||||   0x00001018      e8e3f6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x0000101d      488d3d4c0a00.  lea rdi, qword str.No_signs_of_any_flag_though... ; 0x1a70 ; "No signs of any flag though... \n" ; const char *s
| |||||||   0x00001024      e8d7f6ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x00001029      e9dc000000     jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0xfd6, 0xfe5, 0xff4, 0x1003
| |||````-> 0x0000102e      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00001033      660f2e05950c.  ucomisd xmm0, qword [0x00001cd0]
| |||   ,=< 0x0000103b      7a53           jp 0x1090
| |||   |   0x0000103d      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x00001042      660f2e05860c.  ucomisd xmm0, qword [0x00001cd0]
| |||  ,==< 0x0000104a      7544           jne 0x1090
| |||  ||   0x0000104c      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x00001051      660f2e057f0c.  ucomisd xmm0, qword [0x00001cd8]
| ||| ,===< 0x00001059      7a35           jp 0x1090
| ||| |||   0x0000105b      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x00001060      660f2e05700c.  ucomisd xmm0, qword [0x00001cd8]
| |||,====< 0x00001068      7526           jne 0x1090
| |||||||   0x0000106a      488d3d270a00.  lea rdi, qword str.You_have_landed_at_the_Pokemon_Center ; 0x1a98 ; "You have landed at the Pokemon Center!" ; const char *s
| |||||||   0x00001071      e88af6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00001076      488d3d430a00.  lea rdi, qword str.You_approached_Nurse_Joy_for_a_hint ; 0x1ac0 ; "You approached Nurse Joy for a hint " ; const char *s
| |||||||   0x0000107d      e87ef6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x00001082      488d3d5f0a00.  lea rdi, qword str.She_said:_An_Eevee__a_Pikachu_and_a_Chicken_was_holding_on_to_a_flag_of_some_sort_and_I_remember_they_said_they_were_heading_in_the_direction_of_31313132_x__63636161_y ; 0x1ae8 ; "She said: An Eevee, a Pikachu and a Chicken was holding on to a flag of some sort and I remember they said they were heading in the direction of 31313132(x) 63636161(y)? \n" ; const char *s
| |||||||   0x00001089      e872f6ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x0000108e      eb7a           jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0x103b, 0x104a, 0x1059, 0x1068
| |||````-> 0x00001090      f20f1045d8     movsd xmm0, qword [var_28h]
| |||       0x00001095      660f2e05430c.  ucomisd xmm0, qword [0x00001ce0]
| |||   ,=< 0x0000109d      7a53           jp 0x10f2
| |||   |   0x0000109f      f20f1045d8     movsd xmm0, qword [var_28h]
| |||   |   0x000010a4      660f2e05340c.  ucomisd xmm0, qword [0x00001ce0]
| |||  ,==< 0x000010ac      7544           jne 0x10f2
| |||  ||   0x000010ae      f20f1045d0     movsd xmm0, qword [var_30h]
| |||  ||   0x000010b3      660f2e052d0c.  ucomisd xmm0, qword [0x00001ce8]
| ||| ,===< 0x000010bb      7a35           jp 0x10f2
| ||| |||   0x000010bd      f20f1045d0     movsd xmm0, qword [var_30h]
| ||| |||   0x000010c2      660f2e051e0c.  ucomisd xmm0, qword [0x00001ce8]
| |||,====< 0x000010ca      7526           jne 0x10f2
| |||||||   0x000010cc      488d3dc50a00.  lea rdi, qword str.You_have_landed_at_a_secret_location ; 0x1b98 ; "You have landed at a secret location!" ; const char *s
| |||||||   0x000010d3      e828f6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x000010d8      488d3de10a00.  lea rdi, qword str.They_are_loads_of_flags_in_the_chest ; 0x1bc0 ; "They are loads of flags in the chest! " ; const char *s
| |||||||   0x000010df      e81cf6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||||||   0x000010e4      488d3dfd0a00.  lea rdi, qword str.There_are_all_Singapore_flags_though... ; 0x1be8 ; "There are all Singapore flags though... \n" ; const char *s
| |||||||   0x000010eb      e810f6ffff     call sym.imp.puts           ; int puts(const char *s)
| ========< 0x000010f0      eb18           jmp 0x110a
| |||||||   ; CODE XREFS from sym.locations @ 0x109d, 0x10ac, 0x10bb, 0x10ca
| |||````-> 0x000010f2      488d3d1f0b00.  lea rdi, qword str.You_have_landed_at_some_random_spot ; 0x1c18 ; "You have landed at some random spot!" ; const char *s
| |||       0x000010f9      e802f6ffff     call sym.imp.puts           ; int puts(const char *s)
| |||       0x000010fe      488d3d380b00.  lea rdi, qword str.There_is_nothing_here... ; 0x1c3d ; "There is nothing here... \n" ; const char *s
| |||       0x00001105      e8f6f5ffff     call sym.imp.puts           ; int puts(const char *s)
| |||       ; XREFS: CODE 0x00000cc4  CODE 0x00000d29  CODE 0x00000d8e  
| |||       ; XREFS: CODE 0x00000df3  CODE 0x00000e58  CODE 0x00000eee  
| |||       ; XREFS: CODE 0x00000f5f  CODE 0x00000fc4  CODE 0x00001029  
| |||       ; XREFS: CODE 0x0000108e  CODE 0x000010f0  
| ```-----> 0x0000110a      90             nop
|           0x0000110b      c9             leave
\           0x0000110c      c3             ret
/ (fcn) sym.__libc_csu_init 101
|   sym.__libc_csu_init (int32_t arg1, int32_t arg2, int32_t arg3);
|           ; arg int32_t arg1 @ rdi
|           ; arg int32_t arg2 @ rsi
|           ; arg int32_t arg3 @ rdx
|           ; DATA XREF from entry0 @ 0x796
|           0x00001110      4157           push r15
|           0x00001112      4156           push r14
|           0x00001114      4989d7         mov r15, rdx                ; arg3
|           0x00001117      4155           push r13
|           0x00001119      4154           push r12
|           0x0000111b      4c8d255e1c20.  lea r12, qword obj.__frame_dummy_init_array_entry ; loc.__init_array_start
|                                                                      ; 0x202d80
|           0x00001122      55             push rbp
|           0x00001123      488d2d5e1c20.  lea rbp, qword obj.__do_global_dtors_aux_fini_array_entry ; loc.__init_array_end
|                                                                      ; 0x202d88 ; "@\b"
|           0x0000112a      53             push rbx
|           0x0000112b      4189fd         mov r13d, edi               ; arg1
|           0x0000112e      4989f6         mov r14, rsi                ; arg2
|           0x00001131      4c29e5         sub rbp, r12
|           0x00001134      4883ec08       sub rsp, 8
|           0x00001138      48c1fd03       sar rbp, 3
|           0x0000113c      e87ff5ffff     call sym._init
|           0x00001141      4885ed         test rbp, rbp
|       ,=< 0x00001144      7420           je 0x1166
|       |   0x00001146      31db           xor ebx, ebx
|       |   0x00001148      0f1f84000000.  nop dword [rax + rax]
|       |   ; CODE XREF from sym.__libc_csu_init @ 0x1164
|      .--> 0x00001150      4c89fa         mov rdx, r15
|      :|   0x00001153      4c89f6         mov rsi, r14
|      :|   0x00001156      4489ef         mov edi, r13d
|      :|   0x00001159      41ff14dc       call qword [r12 + rbx*8]
|      :|   0x0000115d      4883c301       add rbx, 1
|      :|   0x00001161      4839dd         cmp rbp, rbx
|      `==< 0x00001164      75ea           jne 0x1150
|       |   ; CODE XREF from sym.__libc_csu_init @ 0x1144
|       `-> 0x00001166      4883c408       add rsp, 8
|           0x0000116a      5b             pop rbx
|           0x0000116b      5d             pop rbp
|           0x0000116c      415c           pop r12
|           0x0000116e      415d           pop r13
|           0x00001170      415e           pop r14
|           0x00001172      415f           pop r15
\           0x00001174      c3             ret
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
/ (fcn) main 21
|   int main (int argc, char **argv, char **envp);
|           ; DATA XREF from entry0 @ 0x79d
|           0x0000088a      55             push rbp
|           0x0000088b      4889e5         mov rbp, rsp
|           0x0000088e      b800000000     mov eax, 0
|           0x00000893      e88d020000     call sym.menu
|           0x00000898      b800000000     mov eax, 0
|           0x0000089d      5d             pop rbp
\           0x0000089e      c3             ret
            ;-- section..init:
            ;-- .init:
/ (fcn) sym._init 23
|   sym._init ();
|           ; CALL XREF from sym.__libc_csu_init @ 0x113c
|           0x000006c0      4883ec08       sub rsp, 8                  ; [11] -r-x section size 23 named .init
|           0x000006c4      488b051d2920.  mov rax, qword [reloc.__gmon_start] ; [0x202fe8:8]=0
|           0x000006cb      4885c0         test rax, rax
|       ,=< 0x000006ce      7402           je 0x6d2
|       |   0x000006d0      ffd0           call rax
|       |   ; CODE XREF from sym._init @ 0x6ce
|       `-> 0x000006d2      4883c408       add rsp, 8
\           0x000006d6      c3             ret
/ (fcn) sym.manual 370
|   sym.manual ();
|           ; var int32_t var_28h @ rbp-0x28
|           ; var uint32_t var_20h @ rbp-0x20
|           ; var uint32_t var_1ch @ rbp-0x1c
|           ; var int32_t var_18h @ rbp-0x18
|           ; var int32_t var_10h @ rbp-0x10
|           ; var int32_t canary @ rbp-0x8
|           ; CALL XREF from sym.menu @ 0xbe6
|           0x000009b3      55             push rbp
|           0x000009b4      4889e5         mov rbp, rsp
|           0x000009b7      4883ec30       sub rsp, 0x30
|           0x000009bb      64488b042528.  mov rax, qword fs:[0x28]
|           0x000009c4      488945f8       mov qword [canary], rax
|           0x000009c8      31c0           xor eax, eax
|           0x000009ca      488d3de70700.  lea rdi, qword str.Some_of_the_popular_spots_in_ShoppingBaba_center: ; 0x11b8 ; "Some of the popular spots in ShoppingBaba center: " ; const char *s
|           0x000009d1      e82afdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009d6      488d3d130800.  lea rdi, qword str.Sample_:_Location___X_coordinate__Y_coordinate ; 0x11f0 ; "Sample : Location @ X coordinate, Y coordinate" ; const char *s
|           0x000009dd      e81efdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009e2      488d3d370800.  lea rdi, qword str.1._CSIT_Technology_Centre___43434343__67676767 ; 0x1220 ; "1. CSIT Technology Centre @ 43434343, 67676767" ; const char *s
|           0x000009e9      e812fdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009ee      488d3d5b0800.  lea rdi, qword str.2._Kandell_Food_Court___23216789__90942319 ; 0x1250 ; "2. Kandell Food Court @ 23216789, 90942319 " ; const char *s
|           0x000009f5      e806fdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009fa      488d3d7f0800.  lea rdi, qword str.3._Value101___78783677__67674343 ; 0x1280 ; "3. Value101 @ 78783677, 67674343 " ; const char *s
|           0x00000a01      e8fafcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a06      488d3d9b0800.  lea rdi, qword str.4._Cyberthon_Information_Centre___31313131__75758989 ; 0x12a8 ; "4. Cyberthon Information Centre @ 31313131, 75758989 " ; const char *s
|           0x00000a0d      e8eefcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a12      488d3dc70800.  lea rdi, qword str.5._Chicken_rice_stall___71717171__53535353 ; 0x12e0 ; "5. Chicken rice stall @ 71717171, 53535353 " ; const char *s
|           0x00000a19      e8e2fcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a1e      488d3deb0800.  lea rdi, qword str.6._Pokemon_Center___21212121__35455354 ; 0x1310 ; "6. Pokemon Center @ 21212121, 35455354" ; const char *s
|           0x00000a25      e8d6fcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a2a      488d3d060900.  lea rdi, qword str.7._Flag___secret__secret ; 0x1337 ; "7. Flag @ secret, secret " ; const char *s
|           0x00000a31      e8cafcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a36      bf0a000000     mov edi, 0xa                ; int c
|           0x00000a3b      e8b0fcffff     call sym.imp.putchar        ; int putchar(int c)
|           0x00000a40      660fefc0       pxor xmm0, xmm0
|           0x00000a44      f20f1145e8     movsd qword [var_18h], xmm0
|           0x00000a49      660fefc0       pxor xmm0, xmm0
|           0x00000a4d      f20f1145f0     movsd qword [var_10h], xmm0
|           0x00000a52      488d3dff0800.  lea rdi, qword str.Please_enter_the_x_to_move_around: ; 0x1358 ; "Please enter the x to move around: " ; const char *format
|           0x00000a59      b800000000     mov eax, 0
|           0x00000a5e      e8cdfcffff     call sym.imp.printf         ; int printf(const char *format)
|           0x00000a63      c745e0000000.  mov dword [var_20h], 0
|           0x00000a6a      c745e4000000.  mov dword [var_1ch], 0
|           0x00000a71      488d45e8       lea rax, qword [var_18h]
|           0x00000a75      4889c6         mov rsi, rax
|           0x00000a78      488d3dfd0800.  lea rdi, qword [0x0000137c] ; "%lf" ; const char *format
|           0x00000a7f      b800000000     mov eax, 0
|           0x00000a84      e8c7fcffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|           0x00000a89      8945e0         mov dword [var_20h], eax
|           0x00000a8c      837de000       cmp dword [var_20h], 0
|       ,=< 0x00000a90      7513           jne 0xaa5
|       |   0x00000a92      488d3de70800.  lea rdi, qword str.Enter_a_number_please ; 0x1380 ; "Enter a number please!" ; const char *s
|       |   0x00000a99      e862fcffff     call sym.imp.puts           ; int puts(const char *s)
|       |   0x00000a9e      b8ffffffff     mov eax, 0xffffffff         ; -1
|      ,==< 0x00000aa3      eb6a           jmp 0xb0f
|      ||   ; CODE XREF from sym.manual @ 0xa90
|      |`-> 0x00000aa5      488d3dec0800.  lea rdi, qword str.Please_enter_the_y_to_move_around: ; 0x1398 ; "Please enter the y to move around: " ; const char *format
|      |    0x00000aac      b800000000     mov eax, 0
|      |    0x00000ab1      e87afcffff     call sym.imp.printf         ; int printf(const char *format)
|      |    0x00000ab6      488d45f0       lea rax, qword [var_10h]
|      |    0x00000aba      4889c6         mov rsi, rax
|      |    0x00000abd      488d3db80800.  lea rdi, qword [0x0000137c] ; "%lf" ; const char *format
|      |    0x00000ac4      b800000000     mov eax, 0
|      |    0x00000ac9      e882fcffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|      |    0x00000ace      8945e4         mov dword [var_1ch], eax
|      |    0x00000ad1      837de400       cmp dword [var_1ch], 0
|      |,=< 0x00000ad5      7513           jne 0xaea
|      ||   0x00000ad7      488d3da20800.  lea rdi, qword str.Enter_a_number_please ; 0x1380 ; "Enter a number please!" ; const char *s
|      ||   0x00000ade      e81dfcffff     call sym.imp.puts           ; int puts(const char *s)
|      ||   0x00000ae3      b8ffffffff     mov eax, 0xffffffff         ; -1
|     ,===< 0x00000ae8      eb25           jmp 0xb0f
|     |||   ; CODE XREF from sym.manual @ 0xad5
|     ||`-> 0x00000aea      bf0a000000     mov edi, 0xa                ; int c
|     ||    0x00000aef      e8fcfbffff     call sym.imp.putchar        ; int putchar(int c)
|     ||    0x00000af4      f20f1045f0     movsd xmm0, qword [var_10h]
|     ||    0x00000af9      488b45e8       mov rax, qword [var_18h]
|     ||    0x00000afd      660f28c8       movapd xmm1, xmm0
|     ||    0x00000b01      488945d8       mov qword [var_28h], rax
|     ||    0x00000b05      f20f1045d8     movsd xmm0, qword [var_28h]
|     ||    0x00000b0a      e843010000     call sym.locations
|     ||    ; CODE XREFS from sym.manual @ 0xaa3, 0xae8
|     ``--> 0x00000b0f      488b55f8       mov rdx, qword [canary]
|           0x00000b13      644833142528.  xor rdx, qword fs:[0x28]
|       ,=< 0x00000b1c      7405           je 0xb23
|       |   0x00000b1e      e8fdfbffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
|       |   ; CODE XREF from sym.manual @ 0xb1c
|       `-> 0x00000b23      c9             leave
\           0x00000b24      c3             ret
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
/ (fcn) sym.imp.rand 6
|   int sym.imp.rand ();
|           ; CALL XREFS from sym.randomise @ 0x8a7, 0x8b5
\           0x00000760      ff256a282000   jmp qword [reloc.rand]      ; [0x202fd0:8]=0x766 ; "f\a"
/ (fcn) sym.imp.printf 6
|   int sym.imp.printf (const char *format);
|           ; XREFS: CALL 0x000008e5  CALL 0x00000a5e  CALL 0x00000ab1  
|           ; XREFS: CALL 0x00000b54  CALL 0x00000ba6  CALL 0x00000c16  
\           0x00000730      ff2582282000   jmp qword [reloc.printf]    ; [0x202fb8:8]=0x736 ; "6\a"
/ (fcn) sym.imp.putchar 6
|   int sym.imp.putchar (int c);
|           ; CALL XREFS from sym.manual @ 0xa3b, 0xaef
|           ; CALL XREF from sym.menu @ 0xb8e
\           0x000006f0      ff25a2282000   jmp qword [reloc.putchar]   ; [0x202f98:8]=0x6f6
/ (fcn) sym.imp.puts 6
|   int sym.imp.puts (const char *s);
|           ; XREFS(53)
\           0x00000700      ff259a282000   jmp qword [reloc.puts]      ; [0x202fa0:8]=0x706
/ (fcn) sym.imp.strlen 6
|   size_t sym.imp.strlen (const char *s);
|           ; CALL XREFS from sym.xor @ 0x91f, 0x92f
\           0x00000710      ff2592282000   jmp qword [reloc.strlen]    ; [0x202fa8:8]=0x716
/ (fcn) sym.imp.__stack_chk_fail 6
|   void sym.imp.__stack_chk_fail ();
|           ; CALL XREF from sym.manual @ 0xb1e
|           ; CALL XREF from sym.menu @ 0xc4b
\           0x00000720      ff258a282000   jmp qword [reloc.__stack_chk_fail] ; [0x202fb0:8]=0x726 ; "&\a"
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
            ;-- r9:
            ;-- r10:
            ;-- r11:
            ;-- r12:
            ;-- r13:
            ;-- r14:
            ;-- r15:
            ;-- rdx:
            ;-- rax:
            ;-- rsi:
/ (fcn) loc.imp._ITM_deregisterTMCloneTable 123
|   loc.imp._ITM_deregisterTMCloneTable (int32_t arg4);
|           ; arg int32_t arg4 @ rcx
|           ; CALL XREF from sym.__libc_csu_init @ 0x1159
|       ,=< 0x00000000      7f45           jg 0x47                     ; [28] ---- section size 254 named .shstrtab
|       |   ; DATA XREF from sym.imp.strlen @ +0x6
|       |   ; DATA XREF from sym.menu @ 0xbdc
|       |   0x00000002      4c460201       add r8b, byte [rcx]         ; arg4
|       |   ; DATA XREF from sym.imp.__isoc99_scanf @ +0x6
|       |   0x00000006      0100           add dword [rax], eax
|       |   0x00000008      0000           add byte [rax], al
|       |   0x0000000a      0000           add byte [rax], al
|       |   0x0000000c      0000           add byte [rax], al
|       |   0x0000000e      0000           add byte [rax], al
|       |   0x00000010      0300           add eax, dword [rax]
|       |   0x00000012      3e0001         add byte ds:[rcx], al       ; arg4
|       |   0x00000015      0000           add byte [rax], al
|       |   0x00000017      008007000000   add byte [rax + 7], al
|       |   0x0000001d      0000           add byte [rax], al
|       |   0x0000001f      004000         add byte [rax], al
|       |   ; DATA XREF from section..eh_frame @ +0x6a
|       |   0x00000022      0000           add byte [rax], al
|       |   0x00000024      0000           add byte [rax], al
|       |   0x00000026      0000           add byte [rax], al
|       |   0x00000028      083b           or byte [rbx], bh
|       |   0x0000002a      0000           add byte [rax], al
|       |   0x0000002c      0000           add byte [rax], al
|       |   ; DATA XREF from str.4._Cyberthon_Information_Centre___31313131__75758989 @ 
|       |   0x0000002e      0000           add byte [rax], al
|       |   0x00000030      0000           add byte [rax], al
|       |   0x00000032      0000           add byte [rax], al
|       |   0x00000034      400038         add byte [rax], dil
|       |   0x00000037      0009           add byte [rcx], cl          ; arg4
|       |   0x00000039      004000         add byte [rax], al
|       |   0x0000003c  ~   1d001c0006     sbb eax, 0x6001c00
|       |   ;-- segment.PHDR:
..
|       |   0x00000041      0000           add byte [rax], al
|       |   0x00000043  ~   000400         add byte [rax + rax], al
|       |   ;-- rflags:
..
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
\           0x00000060      f8             clc
..
/ (fcn) sym.imp.malloc 6
|    void *sym.imp.malloc (size_t size);
|           ; CALL XREF from sym.xor @ 0x943
\           0x00000740      ff257a282000   jmp qword [reloc.malloc]    ; [0x202fc0:8]=0x746 ; "F\a"
/ (fcn) sym.imp.__isoc99_scanf 6
|   int sym.imp.__isoc99_scanf (const char *format);
|           ; CALL XREFS from sym.manual @ 0xa84, 0xac9
|           ; CALL XREFS from sym.menu @ 0xbbe, 0xc2e
\           0x00000750      ff2572282000   jmp qword [reloc.__isoc99_scanf] ; [0x202fc8:8]=0x756 ; "V\a"
