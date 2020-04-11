;ax is the primary accumulator used in input/output and most arithmetic
;bx Base register used i indexed addressing
;cx Count Register
;dx Data register

;esp: Stack pointer
;ebp: Stack frame

.LC0:
        .string "%s"
.LC1:
        .string "Correct flag"
main:
        lea     ecx, [esp+4] ;Move in some stuff
        and     esp, -16
        push    DWORD PTR [ecx-4] 
        push    ebp
        mov     ebp, esp
        push    ecx
        sub     esp, 20
        sub     esp, 8
        lea     eax, [ebp-18]
        push    eax
        push    OFFSET FLAT:.LC0 ;
        call    __isoc99_scanf  ;;;Input;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        add     esp, 16
        sub     esp, 12
        lea     eax, [ebp-18] ;Move in input?
        push    eax 
        call    checkFlag ;Check the flag
        ;;;;; If Statement: if checkflag is true;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        add     esp, 16 
        test    eax, eax ;https://en.wikipedia.org/wiki/TEST_(x86_instruction)
        je      .L2 ;Jump if eax==0
        sub     esp, 12
        ;Output Correct flag?
        push    OFFSET FLAT:.LC1 
        call    puts
        add     esp, 16
.L2:
        mov     eax, 0 
        mov     ecx, DWORD PTR [ebp-4]
        leave   ;Exit procedure https://c9x.me/x86/html/file_module_x86_id_154.html
        lea     esp, [ecx-4]
        ret     ;Return back to original main function
        
;https://en.wikibooks.org/wiki/X86_Disassembly/Functions_and_Stack_Frames
checkFlag: ;;Looks like a c++ function to check the flag
        push    ebp
        mov     ebp, esp
        sub     esp, 64 ;64 stuff allocated to vvariables
        
        mov     DWORD PTR [ebp-13], 1264792680 ;
        mov     DWORD PTR [ebp-9], 1097691699
        mov     BYTE PTR [ebp-5], 110
        ;Likely the flag stuff
        mov     DWORD PTR [ebp-52], 7;Last character
        mov     DWORD PTR [ebp-48], 4
        mov     DWORD PTR [ebp-44], 2
        mov     DWORD PTR [ebp-40], 5
        mov     DWORD PTR [ebp-36], 6
        mov     DWORD PTR [ebp-32], 8
        mov     DWORD PTR [ebp-28], 3
        mov     DWORD PTR [ebp-24], 1
        mov     DWORD PTR [ebp-20], 6
        ;Counter variable
        mov     DWORD PTR [ebp-4], 0 
        jmp     .L5
.L8: ;Check the whole string
        mov     eax, DWORD PTR [ebp-4] ;Return Address
        mov     eax, DWORD PTR [ebp-52+eax*4] ;Get character at current counter from backwards
        mov     edx, eax ;Initialising variables
        
        mov     eax, DWORD PTR [ebp+8] ;1st argument
        add     eax, edx
        movzx   eax, BYTE PTR [eax] ;0 extend: Change to 8 bits?
        
        lea     ecx, [ebp-13] ;Pointer
        mov     edx, DWORD PTR [ebp-4] ;Move the counter inside
        add     edx, ecx
        movzx   edx, BYTE PTR [edx] ;Change to 8 bits?
        
        add     edx, 5 
        
        cmp     al, dl  ;Compare eax and edx last 8 bits?
        je      .L6     ;;Continue of match?
        mov     eax, 0  ;Else set false and exit
        jmp     .L9
        
.L6: ;Counter adding
        ; ebp-4 is likely the counter
        add     DWORD PTR [ebp-4], 1 ;Counter
.L5:
        ;For loop
        cmp     DWORD PTR [ebp-4], 8 
        jle     .L8 ;Loop for the whole string of 8 characters
        mov     eax, 1
.L9:
        leave
        ret;Exit out of checkFlag function
