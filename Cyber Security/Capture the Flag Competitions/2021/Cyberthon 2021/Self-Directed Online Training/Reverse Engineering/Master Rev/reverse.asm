.LC0:
        .string "%s"
.LC1:
        .string "Correct flag"
main:
        push    rbp
        mov     rbp, rsp
        sub     rsp, 16
        lea     rax, [rbp-10]
        mov     rsi, rax
        mov     edi, OFFSET FLAT:.LC0
        mov     eax, 0
        call    __isoc99_scanf
        lea     rax, [rbp-10]
        mov     rdi, rax
        call    checkFlag
        test    eax, eax
        je      .L2
        mov     edi, OFFSET FLAT:.LC1
        call    puts
.L2:
        mov     eax, 0
        leave
        ret
checkFlag:
        push    rbp
        mov     rbp, rsp
        mov     QWORD PTR [rbp-72], rdi
        movabs  rax, 3698143809343140973
        mov     QWORD PTR [rbp-13], rax
        mov     BYTE PTR [rbp-5], 118
        mov     DWORD PTR [rbp-64], 2
        mov     DWORD PTR [rbp-60], 5
        mov     DWORD PTR [rbp-56], 6
        mov     DWORD PTR [rbp-52], 3
        mov     DWORD PTR [rbp-48], 4
        mov     DWORD PTR [rbp-44], 1
        mov     DWORD PTR [rbp-40], 8
        mov     DWORD PTR [rbp-36], 0
        mov     DWORD PTR [rbp-32], 7
        mov     DWORD PTR [rbp-4], 0
        jmp     .L5
.L8:
        mov     eax, DWORD PTR [rbp-4]
        cdqe
        mov     eax, DWORD PTR [rbp-64+rax*4]
        movsx   rdx, eax
        mov     rax, QWORD PTR [rbp-72]
        add     rax, rdx
        movzx   eax, BYTE PTR [rax]
        movsx   eax, al
        lea     edx, [rax+3]
        mov     eax, DWORD PTR [rbp-4]
        cdqe
        movzx   eax, BYTE PTR [rbp-13+rax]
        movsx   eax, al
        cmp     edx, eax
        je      .L6
        mov     eax, 0
        jmp     .L9
.L6:
        add     DWORD PTR [rbp-4], 1
.L5:
        cmp     DWORD PTR [rbp-4], 8
        jle     .L8
        mov     eax, 1
.L9:
        pop     rbp
        ret
