.LC0:
        .string "%s"
.LC1:
        .string "Correct flag"
main:
        lea     ecx, [esp+4]
        and     esp, -16
        push    DWORD PTR [ecx-4]
        push    ebp
        mov     ebp, esp
        push    ecx
        sub     esp, 20
        sub     esp, 8
        lea     eax, [ebp-18]
        push    eax
        push    OFFSET FLAT:.LC0
        call    __isoc99_scanf
        add     esp, 16
        sub     esp, 12
        lea     eax, [ebp-18]
        push    eax
        call    checkFlag
        add     esp, 16
        test    eax, eax
        je      .L2
        sub     esp, 12
        push    OFFSET FLAT:.LC1
        call    puts
        add     esp, 16
.L2:
        mov     eax, 0
        mov     ecx, DWORD PTR [ebp-4]
        leave
        lea     esp, [ecx-4]
        ret
checkFlag:
        push    ebp
        mov     ebp, esp
        sub     esp, 64
        mov     DWORD PTR [ebp-13], 1264792680
        mov     DWORD PTR [ebp-9], 1097691699
        mov     BYTE PTR [ebp-5], 110
        mov     DWORD PTR [ebp-52], 7
        mov     DWORD PTR [ebp-48], 4
        mov     DWORD PTR [ebp-44], 2
        mov     DWORD PTR [ebp-40], 5
        mov     DWORD PTR [ebp-36], 0
        mov     DWORD PTR [ebp-32], 8
        mov     DWORD PTR [ebp-28], 3
        mov     DWORD PTR [ebp-24], 1
        mov     DWORD PTR [ebp-20], 6
        mov     DWORD PTR [ebp-4], 0
        jmp     .L5
.L8:
        mov     eax, DWORD PTR [ebp-4]
        mov     eax, DWORD PTR [ebp-52+eax*4]
        mov     edx, eax
        mov     eax, DWORD PTR [ebp+8]
        add     eax, edx
        movzx   eax, BYTE PTR [eax]
        lea     ecx, [ebp-13]
        mov     edx, DWORD PTR [ebp-4]
        add     edx, ecx
        movzx   edx, BYTE PTR [edx]
        add     edx, 5
        cmp     al, dl
        je      .L6
        mov     eax, 0
        jmp     .L9
.L6:
        add     DWORD PTR [ebp-4], 1
.L5:
        cmp     DWORD PTR [ebp-4], 8
        jle     .L8
        mov     eax, 1
.L9:
        leave
        ret
