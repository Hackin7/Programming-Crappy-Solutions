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
|           0x0000069d      488d3de60000.  lea rdi, qword [main]       ; rip
|                                                                      ; 0x78a
\           0x000006a4      ff1536092000   call qword [reloc.__libc_start_main] ; [0x200fe0:8]=0
