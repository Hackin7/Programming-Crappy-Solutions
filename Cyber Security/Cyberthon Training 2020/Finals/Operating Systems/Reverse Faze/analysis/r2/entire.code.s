            ;-- section..text:
/ (fcn) entry0 42
|   entry0 (int32_t arg3);
|           ; arg int32_t arg3 @ rdx
|           0x000009c0      31ed           xor ebp, ebp                ; [14] -r-x section size 1602 named .text
|           0x000009c2      4989d1         mov r9, rdx                 ; arg3
|           0x000009c5      5e             pop rsi
|           0x000009c6      4889e2         mov rdx, rsp
|           0x000009c9      4883e4f0       and rsp, 0xfffffffffffffff0
|           0x000009cd      50             push rax
|           0x000009ce      54             push rsp
|           0x000009cf      4c8d052a0600.  lea r8, qword [0x00001000]
|           0x000009d6      488d0db30500.  lea rcx, qword [0x00000f90]
|           0x000009dd      488d3d910400.  lea rdi, qword [main]       ; 0xe75 ; "USH\x83\xecxH\x89\xf3dH\x8b\x04%("
\           0x000009e4      ff15f6152000   call qword [reloc.__libc_start_main] ; [0x201fe0:8]=0
            ;-- rip:
/ (fcn) sym.imp.puts 6
|   int sym.imp.puts (const char *s);
|           ; CALL XREFS from main @ 0xeeb, 0xf59
\           0x000008e0      ff258a162000   jmp qword [reloc.puts]      ; [0x201f70:8]=0x8e6
/ (fcn) sym.imp.regfree 6
|   sym.imp.regfree ();
|           ; CALL XREF from fcn.00000dea @ 0xe3f
\           0x000008f0      ff2582162000   jmp qword [reloc.regfree]   ; [0x201f78:8]=0x8f6
/ (fcn) sym.imp.__stack_chk_fail 6
|   void sym.imp.__stack_chk_fail ();
|           ; CALL XREF from fcn.00000aca @ 0xbee
|           ; CALL XREF from fcn.00000bf3 @ 0xcd8
|           ; CALL XREF from fcn.00000cdd @ 0xdc3
|           ; CALL XREF from main @ 0xf87
\           0x00000900      ff257a162000   jmp qword [reloc.__stack_chk_fail] ; [0x201f80:8]=0x906
/ (fcn) sym.imp.system 6
|   int sym.imp.system (const char *string);
|           ; CALL XREF from main @ 0xf61
\           0x00000910      ff2572162000   jmp qword [reloc.system]    ; [0x201f88:8]=0x916
/ (fcn) sym.imp.regcomp 6
|   sym.imp.regcomp ();
|           ; CALL XREF from fcn.00000dea @ 0xe01
\           0x00000920      ff256a162000   jmp qword [reloc.regcomp]   ; [0x201f90:8]=0x926 ; "&\t"
            ;-- section.:
            ;-- section..comment:
            ;-- section..shstrtab:
            ;-- segment.LOAD0:
            ;-- segment.GNU_STACK:
            ;-- segment.ehdr:
            ;-- imp.__libc_start_main:
            ;-- imp.__gmon_start__:
            ;-- imp._ITM_registerTMCloneTable:
            ;-- imp.__cxa_finalize:
            ;-- rbx:
            ;-- r10:
            ;-- r11:
            ;-- r12:
            ;-- r13:
            ;-- r14:
            ;-- r15:
            ;-- rdx:
/ (fcn) loc.imp._ITM_deregisterTMCloneTable 285
|   loc.imp._ITM_deregisterTMCloneTable (int32_t arg2, uint32_t arg3, int32_t arg4);
|           ; arg int32_t arg2 @ rsi
|           ; arg uint32_t arg3 @ rdx
|           ; arg int32_t arg4 @ rcx
|       ,=< 0x00000000  ~   7f45           jg 0x47                     ; [26] ---- section size 238 named .shstrtab
|       |   ;-- rdi:
..
|       |   ; DATA XREFS from segment.PHDR @ +0x1e0, +0x1e8
|       |   ; DATA XREF from sym.imp.__stack_chk_fail @ +0x6
|       |   ; DATA XREF from main @ 0xe8e
|       |   0x00000002  ~   4c460201       add r8b, byte [rcx]         ; arg4
|       |   ;-- rflags:
..
|       |   ; DATA XREF from sym.imp.__isoc99_sscanf @ +0x6
|       |   0x00000006      0100           add dword [rax], eax
|       |   ; DATA XREF from sym.imp.__strncpy_chk @ +0x6
|       |   0x00000008      0000           add byte [rax], al
|       |   ; DATA XREF from sym.imp.exit @ +0x6
|       |   0x0000000a      0000           add byte [rax], al
|       |   ;-- rax:
|       |   ; DATA XREF from loc.imp._ITM_deregisterTMCloneTable @ 0x108
|       |   ; DATA XREF from sym.imp.__sprintf_chk @ +0x6
|       |   0x0000000c      0000           add byte [rax], al
|       |   0x0000000e      0000           add byte [rax], al
|       |   0x00000010      0300           add eax, dword [rax]
|       |   0x00000012      3e0001         add byte ds:[rcx], al       ; arg4
|       |   0x00000015      0000           add byte [rax], al
|       |   0x00000017      00c0           add al, al
|       |   0x00000019      0900           or dword [rax], eax
|       |   0x0000001b      0000           add byte [rax], al
|       |   0x0000001d      0000           add byte [rax], al
|       |   0x0000001f      004000         add byte [rax], al
|       |   ; DATA XREF from section..eh_frame @ +0x6a
|       |   0x00000022      0000           add byte [rax], al
|       |   0x00000024      0000           add byte [rax], al
|       |   0x00000026      0000           add byte [rax], al
|       |   0x00000028      302b           xor byte [rbx], ch
|       |   ; DATA XREF from main @ 0xedf
|       |   0x0000002a      0000           add byte [rax], al
|       |   0x0000002c      0000           add byte [rax], al
|       |   0x0000002e      0000           add byte [rax], al
|       |   0x00000030      0000           add byte [rax], al
|       |   0x00000032      0000           add byte [rax], al
|       |   0x00000034      400038         add byte [rax], dil
|       |   0x00000037      0009           add byte [rcx], cl          ; arg4
|       |   0x00000039      004000         add byte [rax], al
|       |   0x0000003c      1b00           sbb eax, dword [rax]
|       |   0x0000003e      1a00           sbb al, byte [rax]
        |   ;-- segment.PHDR:
..
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
|           0x0000007e      0000           add byte [rax], al
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
|           0x000000cf      005814         add byte [rax + 0x14], bl
|           0x000000d2      0000           add byte [rax], al
|           0x000000d4      0000           add byte [rax], al
|           0x000000d6      0000           add byte [rax], al
|           0x000000d8      58             pop rax
|           0x000000d9      1400           adc al, 0
|           0x000000db      0000           add byte [rax], al
|           0x000000dd      0000           add byte [rax], al
|           0x000000df      0000           add byte [rax], al
|           0x000000e1      0020           add byte [rax], ah
|           0x000000e3      0000           add byte [rax], al
|           0x000000e5      0000           add byte [rax], al
|           0x000000e7      0001           add byte [rcx], al          ; arg4
|           0x000000e9      0000           add byte [rax], al
|           0x000000eb      0006           add byte [rsi], al          ; arg2
|           0x000000ed      0000           add byte [rax], al
|           0x000000ef      00581d         add byte [rax + 0x1d], bl
|           0x000000f2      0000           add byte [rax], al
|           0x000000f4      0000           add byte [rax], al
|           0x000000f6      0000           add byte [rax], al
|           0x000000f8      58             pop rax
|           0x000000f9      1d20000000     sbb eax, 0x20
|           0x000000fe      0000           add byte [rax], al
|           0x00000100      58             pop rax
|           0x00000101      1d20000000     sbb eax, 0x20
|           0x00000106      0000           add byte [rax], al
|           0x00000108      b80c000000     mov eax, 0xc                ; rax
|           0x0000010d      0000           add byte [rax], al
|           0x0000010f      00d0           add al, dl
|           0x00000111      0d00000000     or eax, 0
|           0x00000116      0000           add byte [rax], al
|           0x00000118      0000           add byte [rax], al
|           0x0000011a      2000           and byte [rax], al
|           0x0000011c      0000           add byte [rax], al
|           0x0000011e      0000           add byte [rax], al
|           0x00000120      0200           add al, byte [rax]
\           0x00000122      0000           add byte [rax], al
/ (fcn) sym.imp.fgets 6
|   char *sym.imp.fgets (char *s, int size, FILE *stream);
|           ; CALL XREF from fcn.00000aca @ 0xb03
|           ; CALL XREF from fcn.00000bf3 @ 0xc2c
|           ; CALL XREF from fcn.00000cdd @ 0xd15
\           0x00000930      ff2562162000   jmp qword [reloc.fgets]     ; [0x201f98:8]=0x936 ; "6\t"
/ (fcn) sym.imp.__isoc99_sscanf 6
|   int sym.imp.__isoc99_sscanf (const char *s, const char *format,   ...);
|           ; CALL XREF from fcn.00000aca @ 0xb21
|           ; CALL XREF from fcn.00000bf3 @ 0xc4a
|           ; CALL XREF from fcn.00000cdd @ 0xd41
|           ; CALL XREF from main @ 0xf17
\           0x00000940      ff255a162000   jmp qword [reloc.__isoc99_sscanf] ; [0x201fa0:8]=0x946 ; "F\t"
/ (fcn) sym.imp.regexec 6
|   sym.imp.regexec ();
|           ; CALL XREF from fcn.00000dea @ 0xe2b
\           0x00000950      ff2552162000   jmp qword [reloc.regexec]   ; [0x201fa8:8]=0x956 ; "V\t"
/ (fcn) sym.imp.__strncpy_chk 6
|   sym.imp.__strncpy_chk ();
|           ; CALL XREF from fcn.00000bf3 @ 0xcba
|           ; CALL XREF from fcn.00000cdd @ 0xdb7
\           0x00000960      ff254a162000   jmp qword [reloc.__strncpy_chk] ; [0x201fb0:8]=0x966 ; "f\t"
/ (fcn) sym.imp.__printf_chk 6
|   sym.imp.__printf_chk ();
|           ; CALL XREF from fcn.00000aca @ 0xaeb
|           ; CALL XREF from fcn.00000bf3 @ 0xc14
|           ; CALL XREF from fcn.00000cdd @ 0xcfd
|           ; CALL XREF from fcn.00000dc8 @ 0xde0
|           ; CALL XREF from main @ 0xf79
\           0x00000970      ff2542162000   jmp qword [reloc.__printf_chk] ; [0x201fb8:8]=0x976 ; "v\t"
/ (fcn) sym.imp.exit 6
|   void sym.imp.exit (int status);
|           ; CALL XREF from fcn.00000dea @ 0xe70
\           0x00000980      ff253a162000   jmp qword [reloc.exit]      ; [0x201fc0:8]=0x986
/ (fcn) sym.imp.fwrite 6
|   size_t sym.imp.fwrite (const void *ptr, size_t size, size_t nitems, FILE *stream);
|           ; CALL XREF from fcn.00000dea @ 0xe66
\           0x00000990      ff2532162000   jmp qword [reloc.fwrite]    ; [0x201fc8:8]=0x996
/ (fcn) sym.imp.__sprintf_chk 6
|   sym.imp.__sprintf_chk ();
|           ; CALL XREF from main @ 0xf4d
\           0x000009a0      ff252a162000   jmp qword [reloc.__sprintf_chk] ; [0x201fd0:8]=0x9a6
/ (fcn) entry.init0 67
|   entry.init0 ();
|       :   0x00000ac0      55             push rbp
|       :   0x00000ac1      4889e5         mov rbp, rsp
|       :   0x00000ac4      5d             pop rbp
|       `=< 0x00000ac5      e966ffffff     jmp 0xa30
..
/ (fcn) entry.fini0 51
|   entry.fini0 ();
|           0x00000a80      803dc11f2000.  cmp byte [0x00202a48], 0    ; [0x202a48:1]=0
|       ,=< 0x00000a87      752f           jne 0xab8
|       |   0x00000a89      48833d671520.  cmp qword [reloc.__cxa_finalize], 0 ; [0x201ff8:8]=0
|       |   0x00000a91      55             push rbp
|       |   0x00000a92      4889e5         mov rbp, rsp
|      ,==< 0x00000a95      740c           je 0xaa3
|      ||   0x00000a97      488b3d6a1520.  mov rdi, qword [0x00202008] ; [0x202008:8]=0x202008 ".  "
|      ||   0x00000a9e      e80dffffff     call section..plt.got
|      ||   ; CODE XREF from entry.fini0 @ 0xa95
|      `--> 0x00000aa3      e848ffffff     call fcn.000009f0
|       |   0x00000aa8      c605991f2000.  mov byte [0x00202a48], 1    ; [0x202a48:1]=0
|       |   0x00000aaf      5d             pop rbp
|       |   0x00000ab0      c3             ret
..
|       |   ; CODE XREF from entry.fini0 @ 0xa87
\       `-> 0x00000ab8      f3c3           ret
/ (fcn) fcn.000009f0 40
|   fcn.000009f0 ();
|           ; CALL XREF from entry.fini0 @ 0xaa3
|           0x000009f0      488d3d192020.  lea rdi, qword [0x00202a10]
|           0x000009f7      55             push rbp
|           0x000009f8      488d05112020.  lea rax, qword [0x00202a10]
|           0x000009ff      4839f8         cmp rax, rdi
|           0x00000a02      4889e5         mov rbp, rsp
|       ,=< 0x00000a05      7419           je 0xa20
|       |   0x00000a07      488b05ca1520.  mov rax, qword [reloc._ITM_deregisterTMCloneTable] ; [0x201fd8:8]=0
|       |   0x00000a0e      4885c0         test rax, rax
|      ,==< 0x00000a11      740d           je 0xa20
|      ||   0x00000a13      5d             pop rbp
|      ||   0x00000a14      ffe0           jmp rax
..
|      ||   ; CODE XREFS from fcn.000009f0 @ 0xa05, 0xa11
|      ``-> 0x00000a20      5d             pop rbp
\           0x00000a21      c3             ret
/ (fcn) fcn.00000dc8 34
|   fcn.00000dc8 (int32_t arg1);
|           ; arg int32_t arg1 @ rdi
|           ; CALL XREF from main @ 0xe96
|           0x00000dc8      4883ec08       sub rsp, 8
|           0x00000dcc      488b17         mov rdx, qword [rdi]        ; arg1
|           0x00000dcf      488d35c20200.  lea rsi, qword str.USAGE:___s__ip_addr_____ip_addr:__C2_server_s_IP_address____d_1_3___.__d_1_3___.__d_1_3___.__d_1_3____e.g._192.168.0.1____DESCRIPTION:____Report_alive_to_C2_server. ; 0x1098 ; "USAGE:\n%s <ip_addr>\n\nip_addr:\tC2 server's IP address [\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}], e.g. 192.168.0.1\n\nDESCRIPTION:\n\tReport alive to C2 server.\n"
|           0x00000dd6      bf01000000     mov edi, 1
|           0x00000ddb      b800000000     mov eax, 0
|           0x00000de0      e88bfbffff     call sym.imp.__printf_chk
|           0x00000de5      4883c408       add rsp, 8
\           0x00000de9      c3             ret
            ;-- section..init:
/ (fcn) fcn.000008b8 23
|   fcn.000008b8 ();
|           ; CALL XREF from main @ +0x147
|           0x000008b8      4883ec08       sub rsp, 8                  ; [11] -r-x section size 23 named .init
|           0x000008bc      488b05251720.  mov rax, qword [reloc.__gmon_start] ; [0x201fe8:8]=0
|           0x000008c3      4885c0         test rax, rax
|       ,=< 0x000008c6      7402           je 0x8ca
|       |   0x000008c8      ffd0           call rax
|       |   ; CODE XREF from fcn.000008b8 @ 0x8c6
|       `-> 0x000008ca      4883c408       add rsp, 8
\           0x000008ce      c3             ret
/ (fcn) fcn.00000dea 139
|   fcn.00000dea (int32_t arg1);
|           ; arg int32_t arg1 @ rdi
|           ; CALL XREF from main @ 0xebe
|           0x00000dea      53             push rbx
|           0x00000deb      4889fb         mov rbx, rdi                ; arg1
|           0x00000dee      ba00000000     mov edx, 0
|           0x00000df3      488b35061c20.  mov rsi, qword [0x00202a00] ; [0x202a00:8]=0x11e8 str.0_9____1_3_____._0_9____1_3_____._0_9____1_3_____._0_9____1_3
|           0x00000dfa      488d3d5f1c20.  lea rdi, qword [0x00202a60]
|           0x00000e01      e81afbffff     call sym.imp.regcomp
|           0x00000e06      8905941c2000   mov dword [0x00202aa0], eax ; [0x202aa0:4]=0
|           0x00000e0c      85c0           test eax, eax
|       ,=< 0x00000e0e      753e           jne 0xe4e
|       |   0x00000e10      488b7308       mov rsi, qword [rbx + 8]
|       |   0x00000e14      41b800000000   mov r8d, 0
|       |   0x00000e1a      b900000000     mov ecx, 0
|       |   0x00000e1f      ba00000000     mov edx, 0
|       |   0x00000e24      488d3d351c20.  lea rdi, qword [0x00202a60]
|       |   0x00000e2b      e820fbffff     call sym.imp.regexec
|       |   0x00000e30      89c3           mov ebx, eax
|       |   0x00000e32      8905681c2000   mov dword [0x00202aa0], eax ; [0x202aa0:4]=0
|       |   0x00000e38      488d3d211c20.  lea rdi, qword [0x00202a60]
|       |   0x00000e3f      e8acfaffff     call sym.imp.regfree
|       |   0x00000e44      85db           test ebx, ebx
|       |   0x00000e46      0f95c0         setne al
|       |   0x00000e49      0fb6c0         movzx eax, al
|       |   0x00000e4c      5b             pop rbx
|       |   0x00000e4d      c3             ret
|       |   ; CODE XREF from fcn.00000dea @ 0xe0e
|       `-> 0x00000e4e      488b0deb1b20.  mov rcx, qword [obj.stderr] ; [0x202a40:8]=0 ; FILE *stream
|           0x00000e55      ba18000000     mov edx, 0x18               ; size_t nitems
|           0x00000e5a      be01000000     mov esi, 1                  ; size_t size
|           0x00000e5f      488d3d020200.  lea rdi, qword str.Could_not_compile_regex ; 0x1068 ; "Could not compile regex\n" ; const void *ptr
|           0x00000e66      e825fbffff     call sym.imp.fwrite         ; size_t fwrite(const void *ptr, size_t size, size_t nitems, FILE *stream)
|           0x00000e6b      bf01000000     mov edi, 1                  ; int status
\           0x00000e70      e80bfbffff     call sym.imp.exit           ; void exit(int status)
/ (fcn) fcn.00000aca 297
|   fcn.00000aca ();
|           ; var int32_t var_1h @ rsp+0x1
|           ; var int32_t var_2h @ rsp+0x2
|           ; var int32_t var_3h @ rsp+0x3
|           ; var int32_t var_4h @ rsp+0x4
|           ; var int32_t var_5h @ rsp+0x5
|           ; var int32_t var_68h @ rsp+0x68
|           ; CALL XREF from main @ 0xecc
|           0x00000aca      53             push rbx
|           0x00000acb      4883ec70       sub rsp, 0x70
|           0x00000acf      64488b042528.  mov rax, qword fs:[0x28]
|           0x00000ad8      4889442468     mov qword [var_68h], rax
|           0x00000add      31c0           xor eax, eax
|           0x00000adf      488d352e0500.  lea rsi, qword str.Enter_key_for_faze_1: ; 0x1014 ; "Enter key for faze 1: "
|           0x00000ae6      bf01000000     mov edi, 1
|           0x00000aeb      e880feffff     call sym.imp.__printf_chk
|           0x00000af0      488b15291f20.  mov rdx, qword [obj.stdin]  ; [0x202a20:8]=0 ; FILE *stream
|           0x00000af7      be64000000     mov esi, 0x64               ; 'd' ; int size
|           0x00000afc      488d3dbd1f20.  lea rdi, qword [0x00202ac0] ; char *s
|           0x00000b03      e828feffff     call sym.imp.fgets          ; char *fgets(char *s, int size, FILE *stream)
|           0x00000b08      4889e3         mov rbx, rsp
|           0x00000b0b      4889da         mov rdx, rbx                ;   ...
|           0x00000b0e      488d35160500.  lea rsi, qword [0x0000102b] ; "%s" ; const char *format
|           0x00000b15      488d3da41f20.  lea rdi, qword [0x00202ac0] ; const char *s
|           0x00000b1c      b800000000     mov eax, 0
|           0x00000b21      e81afeffff     call sym.imp.__isoc99_sscanf ; int sscanf(const char *s, const char *format,   ...)
|           0x00000b26      48c7c1ffffff.  mov rcx, -1
|           0x00000b2d      b800000000     mov eax, 0
|           0x00000b32      4889df         mov rdi, rbx
|           0x00000b35      f2ae           repne scasb al, byte [rdi]
|           0x00000b37      4889cb         mov rbx, rcx
|           0x00000b3a      48f7d3         not rbx
|           0x00000b3d      c6441cff00     mov byte [rsp + rbx - 1], 0
|           0x00000b42      0fbf059b1e20.  movsx eax, word [0x002029e4] ; [0x2029e4:2]=255
|           0x00000b49      0fbe0c24       movsx ecx, byte [rsp]
|           0x00000b4d      8d904fffffff   lea edx, dword [rax - 0xb1]
|           0x00000b53      41ba00000000   mov r10d, 0
|           0x00000b59      39d1           cmp ecx, edx
|       ,=< 0x00000b5b      741d           je 0xb7a
|       |   ; CODE XREFS from fcn.00000aca @ 0xb7f, 0xb86, 0xb95, 0xb9c, 0xbb2
|  .....--> 0x00000b5d      ba00000000     mov edx, 0
|  :::::|   0x00000b62      4889e6         mov rsi, rsp
|  :::::|   0x00000b65      49c7c0ffffff.  mov r8, -1
|  :::::|   0x00000b6c      b800000000     mov eax, 0
|  :::::|   0x00000b71      4c8d0d781e20.  lea r9, qword str.password1234567 ; 0x2029f0 ; "password1234567"
| ,=======< 0x00000b78      eb46           jmp 0xbc0
| |:::::|   ; CODE XREF from fcn.00000aca @ 0xb5b
| |:::::`-> 0x00000b7a      807c240425     cmp byte [var_4h], 0x25
| |`======< 0x00000b7f      75dc           jne 0xb5d
| | ::::    0x00000b81      807c240500     cmp byte [var_5h], 0
| | `=====< 0x00000b86      75d5           jne 0xb5d
| |  :::    0x00000b88      0fbe4c2403     movsx ecx, byte [var_3h]
| |  :::    0x00000b8d      8d904bffffff   lea edx, dword [rax - 0xb5]
| |  :::    0x00000b93      39d1           cmp ecx, edx
| |  `====< 0x00000b95      75c6           jne 0xb5d
| |   ::    0x00000b97      807c240136     cmp byte [var_1h], 0x36
| |   `===< 0x00000b9c      75bf           jne 0xb5d
| |    :    0x00000b9e      0fbe542402     movsx edx, byte [var_2h]
| |    :    0x00000ba3      2ddc000000     sub eax, 0xdc
| |    :    0x00000ba8      39c2           cmp edx, eax
| |    :    0x00000baa      410f94c2       sete r10b
| |    :    0x00000bae      450fb6d2       movzx r10d, r10b
| |    `==< 0x00000bb2      eba9           jmp 0xb5d
| |         ; CODE XREF from fcn.00000aca @ 0xbd2
| |     .-> 0x00000bb4      0fb60c32       movzx ecx, byte [rdx + rsi]
| |     :   0x00000bb8      41880c11       mov byte [r9 + rdx], cl
| |     :   0x00000bbc      4883c201       add rdx, 1
| |     :   ; CODE XREF from fcn.00000aca @ 0xb78
| `-------> 0x00000bc0      4c89c1         mov rcx, r8
|       :   0x00000bc3      4889f7         mov rdi, rsi
|       :   0x00000bc6      f2ae           repne scasb al, byte [rdi]
|       :   0x00000bc8      48f7d1         not rcx
|       :   0x00000bcb      4883e901       sub rcx, 1
|       :   0x00000bcf      4839d1         cmp rcx, rdx
|       `=< 0x00000bd2      77e0           ja 0xbb4
|           0x00000bd4      410fbfc2       movsx eax, r10w
|           0x00000bd8      488b5c2468     mov rbx, qword [var_68h]
|           0x00000bdd      6448331c2528.  xor rbx, qword fs:[0x28]
|       ,=< 0x00000be6      7506           jne 0xbee
|       |   0x00000be8      4883c470       add rsp, 0x70
|       |   0x00000bec      5b             pop rbx
|       |   0x00000bed      c3             ret
|       |   ; CODE XREF from fcn.00000aca @ 0xbe6
\       `-> 0x00000bee      e80dfdffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
/ (fcn) fcn.00000bf3 234
|   fcn.00000bf3 ();
|           ; var int32_t var_68h @ rsp+0x68
|           ; CALL XREF from main @ 0xeda
|           0x00000bf3      53             push rbx
|           0x00000bf4      4883ec70       sub rsp, 0x70
|           0x00000bf8      64488b042528.  mov rax, qword fs:[0x28]
|           0x00000c01      4889442468     mov qword [var_68h], rax
|           0x00000c06      31c0           xor eax, eax
|           0x00000c08      488d351f0400.  lea rsi, qword str.Enter_key_for_faze_2: ; 0x102e ; "Enter key for faze 2: "
|           0x00000c0f      bf01000000     mov edi, 1
|           0x00000c14      e857fdffff     call sym.imp.__printf_chk
|           0x00000c19      488b15001e20.  mov rdx, qword [obj.stdin]  ; [0x202a20:8]=0 ; FILE *stream
|           0x00000c20      be64000000     mov esi, 0x64               ; 'd' ; int size
|           0x00000c25      488d3d941e20.  lea rdi, qword [0x00202ac0] ; char *s
|           0x00000c2c      e8fffcffff     call sym.imp.fgets          ; char *fgets(char *s, int size, FILE *stream)
|           0x00000c31      4889e3         mov rbx, rsp
|           0x00000c34      4889da         mov rdx, rbx                ;   ...
|           0x00000c37      488d35ed0300.  lea rsi, qword [0x0000102b] ; "%s" ; const char *format
|           0x00000c3e      488d3d7b1e20.  lea rdi, qword [0x00202ac0] ; const char *s
|           0x00000c45      b800000000     mov eax, 0
|           0x00000c4a      e8f1fcffff     call sym.imp.__isoc99_sscanf ; int sscanf(const char *s, const char *format,   ...)
|           0x00000c4f      48c7c2ffffff.  mov rdx, -1
|           0x00000c56      b800000000     mov eax, 0
|           0x00000c5b      4889d1         mov rcx, rdx
|           0x00000c5e      4889df         mov rdi, rbx
|           0x00000c61      f2ae           repne scasb al, byte [rdi]
|           0x00000c63      48f7d1         not rcx
|           0x00000c66      c6440cff00     mov byte [rsp + rcx - 1], 0
|           0x00000c6b      4889d1         mov rcx, rdx
|           0x00000c6e      4889df         mov rdi, rbx
|           0x00000c71      f2ae           repne scasb al, byte [rdi]
|           0x00000c73      4889c8         mov rax, rcx
|           0x00000c76      48f7d0         not rax
|           0x00000c79      4801c2         add rdx, rax
|           0x00000c7c      4889d9         mov rcx, rbx
|           0x00000c7f      488d3c13       lea rdi, qword [rbx + rdx]
|           0x00000c83      bb00000000     mov ebx, 0
|       ,=< 0x00000c88      eb09           jmp 0xc93
|       |   ; CODE XREF from fcn.00000bf3 @ 0xc96
|      .--> 0x00000c8a      0fbe01         movsx eax, byte [rcx]
|      :|   0x00000c8d      01c3           add ebx, eax
|      :|   0x00000c8f      4883c101       add rcx, 1
|      :|   ; CODE XREF from fcn.00000bf3 @ 0xc88
|      :`-> 0x00000c93      4839f9         cmp rcx, rdi
|      `==< 0x00000c96      75f2           jne 0xc8a
|           0x00000c98      4863c3         movsxd rax, ebx
|           0x00000c9b      488d0480       lea rax, qword [rax + rax*4]
|           0x00000c9f      488d0c80       lea rcx, qword [rax + rax*4]
|           0x00000ca3      488d05761320.  lea rax, qword str.HC_j.    ; 0x202020 ; "HC,j."
|           0x00000caa      488d3448       lea rsi, qword [rax + rcx*2]
|           0x00000cae      b90b000000     mov ecx, 0xb
|           0x00000cb3      488d3d3b1d20.  lea rdi, qword [0x002029f5] ; "ord1234567"
|           0x00000cba      e8a1fcffff     call sym.imp.__strncpy_chk
|           0x00000cbf      8d4317         lea eax, dword [rbx + 0x17]
|           0x00000cc2      488b742468     mov rsi, qword [var_68h]
|           0x00000cc7      644833342528.  xor rsi, qword fs:[0x28]
|       ,=< 0x00000cd0      7506           jne 0xcd8
|       |   0x00000cd2      4883c470       add rsp, 0x70
|       |   0x00000cd6      5b             pop rbx
|       |   0x00000cd7      c3             ret
|       |   ; CODE XREF from fcn.00000bf3 @ 0xcd0
\       `-> 0x00000cd8      e823fcffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
/ (fcn) fcn.00000cdd 235
|   fcn.00000cdd ();
|           ; var int32_t var_8h @ rsp+0x8
|           ; var int32_t var_ch @ rsp+0xc
|           ; var int32_t var_10h @ rsp+0x10
|           ; var int32_t var_14h @ rsp+0x14
|           ; var int32_t var_18h @ rsp+0x18
|           ; CALL XREF from main @ 0xef7
|           0x00000cdd      4883ec28       sub rsp, 0x28
|           0x00000ce1      64488b042528.  mov rax, qword fs:[0x28]
|           0x00000cea      4889442418     mov qword [var_18h], rax
|           0x00000cef      31c0           xor eax, eax
|           0x00000cf1      488d354d0300.  lea rsi, qword str.Enter_key_for_faze_3: ; 0x1045 ; "Enter key for faze 3: "
|           0x00000cf8      bf01000000     mov edi, 1
|           0x00000cfd      e86efcffff     call sym.imp.__printf_chk
|           0x00000d02      488b15171d20.  mov rdx, qword [obj.stdin]  ; [0x202a20:8]=0 ; FILE *stream
|           0x00000d09      be64000000     mov esi, 0x64               ; 'd' ; int size
|           0x00000d0e      488d3dab1d20.  lea rdi, qword [0x00202ac0] ; char *s
|           0x00000d15      e816fcffff     call sym.imp.fgets          ; char *fgets(char *s, int size, FILE *stream)
|           0x00000d1a      488d4c240c     lea rcx, qword [var_ch]
|           0x00000d1f      488d542408     lea rdx, qword [var_8h]
|           0x00000d24      4c8d4c2414     lea r9, qword [var_14h]
|           0x00000d29      4c8d442410     lea r8, qword [var_10h]
|           0x00000d2e      488d35270300.  lea rsi, qword str.d__d__d__d ; 0x105c ; "%d %d %d %d" ; const char *format
|           0x00000d35      488d3d841d20.  lea rdi, qword [0x00202ac0] ; const char *s
|           0x00000d3c      b800000000     mov eax, 0
|           0x00000d41      e8fafbffff     call sym.imp.__isoc99_sscanf ; int sscanf(const char *s, const char *format,   ...)
|           0x00000d46      8b442408       mov eax, dword [var_8h]
|           0x00000d4a      8d0480         lea eax, dword [rax + rax*4]
|           0x00000d4d      01c0           add eax, eax
|           0x00000d4f      89442408       mov dword [var_8h], eax
|           0x00000d53      8b542410       mov edx, dword [var_10h]
|           0x00000d57      8d0c92         lea ecx, dword [rdx + rdx*4]
|           0x00000d5a      01c9           add ecx, ecx
|           0x00000d5c      894c2410       mov dword [var_10h], ecx
|           0x00000d60      0344240c       add eax, dword [var_ch]
|           0x00000d64      89c2           mov edx, eax
|           0x00000d66      b800000000     mov eax, 0
|           0x00000d6b      83fa0d         cmp edx, 0xd
|       ,=< 0x00000d6e      7415           je 0xd85
|       |   ; CODE XREFS from fcn.00000cdd @ 0xd8c, 0xdc1
|     ..--> 0x00000d70      488b7c2418     mov rdi, qword [var_18h]
|     ::|   0x00000d75      6448333c2528.  xor rdi, qword fs:[0x28]
|    ,====< 0x00000d7e      7543           jne 0xdc3
|    |::|   0x00000d80      4883c428       add rsp, 0x28
|    |::|   0x00000d84      c3             ret
|    |::|   ; CODE XREF from fcn.00000cdd @ 0xd6e
|    |::`-> 0x00000d85      034c2414       add ecx, dword [var_14h]
|    |::    0x00000d89      83f925         cmp ecx, 0x25
|    |`===< 0x00000d8c      75e2           jne 0xd70
|    | :    0x00000d8e      488d35c51920.  lea rsi, qword str.MZjHU    ; 0x20275a ; "MZjHU"
|    | :    0x00000d95      48c7c1ffffff.  mov rcx, -1
|    | :    0x00000d9c      4889f7         mov rdi, rsi
|    | :    0x00000d9f      f2ae           repne scasb al, byte [rdi]
|    | :    0x00000da1      4889ca         mov rdx, rcx
|    | :    0x00000da4      48f7d2         not rdx
|    | :    0x00000da7      488d52ff       lea rdx, qword [rdx - 1]
|    | :    0x00000dab      b906000000     mov ecx, 6
|    | :    0x00000db0      488d3d431c20.  lea rdi, qword [0x002029fa] ; "34567"
|    | :    0x00000db7      e8a4fbffff     call sym.imp.__strncpy_chk
|    | :    0x00000dbc      b801000000     mov eax, 1
|    | `==< 0x00000dc1      ebad           jmp 0xd70
|    |      ; CODE XREF from fcn.00000cdd @ 0xd7e
\    `----> 0x00000dc3      e838fbffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
/ (fcn) main 279
|   int main (int argc, char **argv, char **envp);
|           ; var int32_t var_68h @ rsp+0x68
|           ; arg uint32_t argc @ rdi
|           ; arg char **argv @ rsi
|           ; DATA XREF from entry0 @ 0x9dd
|           0x00000e75      55             push rbp
|           0x00000e76      53             push rbx
|           0x00000e77      4883ec78       sub rsp, 0x78
|           0x00000e7b      4889f3         mov rbx, rsi                ; argv
|           0x00000e7e      64488b042528.  mov rax, qword fs:[0x28]
|           0x00000e87      4889442468     mov qword [var_68h], rax
|           0x00000e8c      31c0           xor eax, eax
|           0x00000e8e      83ff02         cmp edi, 2                  ; argc
|       ,=< 0x00000e91      7428           je 0xebb
|       |   ; CODE XREF from main @ 0xec5
|      .--> 0x00000e93      4889df         mov rdi, rbx
|      :|   0x00000e96      e82dffffff     call fcn.00000dc8
|      :|   ; CODE XREFS from main @ 0xef0, 0xf82
|    ..---> 0x00000e9b      b800000000     mov eax, 0
|    :::|   0x00000ea0      488b4c2468     mov rcx, qword [var_68h]
|    :::|   0x00000ea5      6448330c2528.  xor rcx, qword fs:[0x28]
|   ,=====< 0x00000eae      0f85d3000000   jne 0xf87
|   |:::|   0x00000eb4      4883c478       add rsp, 0x78
|   |:::|   0x00000eb8      5b             pop rbx
|   |:::|   0x00000eb9      5d             pop rbp
|   |:::|   0x00000eba      c3             ret
|   |:::|   ; CODE XREF from main @ 0xe91
|   |:::`-> 0x00000ebb      4889f7         mov rdi, rsi                ; argv
|   |:::    0x00000ebe      e827ffffff     call fcn.00000dea
|   |:::    0x00000ec3      85c0           test eax, eax
|   |::`==< 0x00000ec5      75cc           jne 0xe93
|   |::     0x00000ec7      b800000000     mov eax, 0
|   |::     0x00000ecc      e8f9fbffff     call fcn.00000aca
|   |::     0x00000ed1      85c0           test eax, eax
|   |:: ,=< 0x00000ed3      740f           je 0xee4
|   |:: |   0x00000ed5      b800000000     mov eax, 0
|   |:: |   0x00000eda      e814fdffff     call fcn.00000bf3
|   |:: |   0x00000edf      83f82a         cmp eax, 0x2a
|   |::,==< 0x00000ee2      740e           je 0xef2
|   |::||   ; CODE XREFS from main @ 0xed3, 0xeff
|  .----`-> 0x00000ee4      488d3dbd0200.  lea rdi, qword str.Complete_all_3_fazes_to_successfully_report_back_alive. ; 0x11a8 ; "[-] Complete all 3 fazes to successfully report back alive." ; const char *s
|  :|::|    0x00000eeb      e8f0f9ffff     call sym.imp.puts           ; int puts(const char *s)
|  :|`====< 0x00000ef0      eba9           jmp 0xe9b
|  :| :|    ; CODE XREF from main @ 0xee2
|  :| :`--> 0x00000ef2      b800000000     mov eax, 0
|  :| :     0x00000ef7      e8e1fdffff     call fcn.00000cdd
|  :| :     0x00000efc      83f801         cmp eax, 1                  ; rdi ; "ELF\x02\x01\x01"
|  `======< 0x00000eff      75e3           jne 0xee4
|   | :     0x00000f01      4889e5         mov rbp, rsp
|   | :     0x00000f04      488b7b08       mov rdi, qword [rbx + 8]    ; const char *s
|   | :     0x00000f08      4889ea         mov rdx, rbp                ;   ...
|   | :     0x00000f0b      488d35190100.  lea rsi, qword [0x0000102b] ; "%s" ; const char *format
|   | :     0x00000f12      b800000000     mov eax, 0
|   | :     0x00000f17      e824faffff     call sym.imp.__isoc99_sscanf ; int sscanf(const char *s, const char *format,   ...)
|   | :     0x00000f1c      4c8b0de51a20.  mov r9, qword [0x00202a08]  ; [0x202a08:8]=0x108f r9
|   | :     0x00000f23      4151           push r9
|   | :     0x00000f25      55             push rbp
|   | :     0x00000f26      4c8d05c31a20.  lea r8, qword str.password1234567 ; 0x2029f0 ; "password1234567"
|   | :     0x00000f2d      488d0dfc0100.  lea rcx, qword str.echo__s___ssh__o_StrictHostKeyChecking_no__s__s__TIME__date__echo_alive_at__TIME_____home__s_victim.log_____history__c ; 0x1130 ; "echo %s | ssh -o StrictHostKeyChecking=no %s@%s \"TIME=`date` echo alive at $TIME >> /home/%s/victim.log\" && history -c"
|   | :     0x00000f34      48c7c2ffffff.  mov rdx, -1
|   | :     0x00000f3b      be01000000     mov esi, 1
|   | :     0x00000f40      bb00000000     mov ebx, 0
|   | :     0x00000f45      4889df         mov rdi, rbx
|   | :     0x00000f48      b800000000     mov eax, 0
|   | :     0x00000f4d      e84efaffff     call sym.imp.__sprintf_chk
|   | :     0x00000f52      488d3d340100.  lea rdi, qword [0x0000108d] ; "\n" ; const char *s
|   | :     0x00000f59      e882f9ffff     call sym.imp.puts           ; int puts(const char *s)
|   | :     0x00000f5e      4889df         mov rdi, rbx                ; const char *string
|   | :     0x00000f61      e8aaf9ffff     call sym.imp.system         ; int system(const char *string)
|   | :     0x00000f66      89c2           mov edx, eax
|   | :     0x00000f68      488d35120100.  lea rsi, qword str.exit_code__d ; 0x1081 ; "exit code %d\n"
|   | :     0x00000f6f      bf01000000     mov edi, 1
|   | :     0x00000f74      b800000000     mov eax, 0
|   | :     0x00000f79      e8f2f9ffff     call sym.imp.__printf_chk
|   | :     0x00000f7e      4883c410       add rsp, 0x10
|   | `===< 0x00000f82      e914ffffff     jmp 0xe9b
|   |       ; CODE XREF from main @ 0xeae
\   `-----> 0x00000f87      e874f9ffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
