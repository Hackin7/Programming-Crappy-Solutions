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
|           0x000009dd      488d3d910400.  lea rdi, qword [main]       ; rip
|                                                                      ; 0xe75 ; "USH\x83\xecxH\x89\xf3dH\x8b\x04%("
\           0x000009e4      ff15f6152000   call qword [reloc.__libc_start_main] ; [0x201fe0:8]=0
