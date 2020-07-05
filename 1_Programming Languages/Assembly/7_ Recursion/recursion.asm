;https://www.tutorialspoint.com/assembly_programming/assembly_procedures.htm

; Also, a macro with two parameters
; Implements the write system call
%macro write_string 2 
  mov   eax, 4
  mov   ebx, 1
  mov   ecx, %1
  mov   edx, %2
  int   80h
%endmacro

;Direct Recursion: Call same function
factorial:
   ;Base Case
       cmp bl,1 ;bl is the multiplier
       jle end
   ;Recursive Case
       ;AL is the final output
       mul bl ;al = bl*al
       dec bl
       call factorial
end:
   ret;Procedure only ends on ret

;Indirect Recursion, 2 functions call each other recursively
;Not covered
section .text
   global _start        ;must be declared for using gcc
    
_start:                 ;tell linker entry point
   ;Calling Sum Function
   mov bl,3
   mov al,1;
   call factorial
   mov [num],al
   add byte[num],'0'
   
   write_string msg,len
   write_string num,1

   mov eax,1             ;system call number (sys_exit)
   int 0x80              ;call kernel


section .data
    msg db "The factorial is: "
    len equ $-msg

section .bss
    num resb 1
