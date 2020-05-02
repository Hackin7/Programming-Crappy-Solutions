            ;-- rip:
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
|  :| :     0x00000efc      83f801         cmp eax, 1
|  `======< 0x00000eff      75e3           jne 0xee4
|   | :     0x00000f01      4889e5         mov rbp, rsp
|   | :     0x00000f04      488b7b08       mov rdi, qword [rbx + 8]    ; const char *s
|   | :     0x00000f08      4889ea         mov rdx, rbp                ;   ...
|   | :     0x00000f0b      488d35190100.  lea rsi, qword [0x0000102b] ; "%s" ; const char *format
|   | :     0x00000f12      b800000000     mov eax, 0
|   | :     0x00000f17      e824faffff     call sym.imp.__isoc99_sscanf ; int sscanf(const char *s, const char *format,   ...)
|   | :     0x00000f1c      4c8b0de51a20.  mov r9, qword [0x00202a08]  ; [0x202a08:8]=0x108f str.hacker
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
