.LC0:
        .string "%s"
.LC1:
        .string "Correct flag"
main:
        lea     ecx, [esp+4]
        and     esp, -16
        push    DWORD [ecx-4]
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
        mov     ecx, DWORD [ebp-4]
        leave
        lea     esp, [ecx-4]
        ret
checkFlag:
        push    ebp
        mov     ebp, esp
        sub     esp, 64
        mov     DWORD [ebp-13], 1264792680
        mov     DWORD [ebp-9], 1097691699
        mov     BYTE [ebp-5], 110
        mov     DWORD [ebp-52], 7
        mov     DWORD [ebp-48], 4
        mov     DWORD [ebp-44], 2
        mov     DWORD [ebp-40], 5
        mov     DWORD [ebp-36], 0
        mov     DWORD [ebp-32], 8
        mov     DWORD [ebp-28], 3
        mov     DWORD [ebp-24], 1
        mov     DWORD [ebp-20], 6
        mov     DWORD [ebp-4], 0
        jmp     .L5
.L8:
        mov     eax, DWORD [ebp-4]
        mov     eax, DWORD [ebp-52+eax*4]
        mov     edx, eax
        mov     eax, DWORD [ebp+8]
        add     eax, edx
        movzx   eax, BYTE [eax]
        lea     ecx, [ebp-13]
        mov     edx, DWORD [ebp-4]
        add     edx, ecx
        movzx   edx, BYTE [edx]
        add     edx, 5
        cmp     al, dl
        je      .L6
        mov     eax, 0
        jmp     .L9
.L6:
        add     DWORD [ebp-4], 1
.L5:
        cmp     DWORD [ebp-4], 8
        jle     .L8
        mov     eax, 1
.L9:
        leave
        ret
