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

;Procedure
sum:
   mov     eax, ecx
   add     eax, edx
   add     eax, '0'
   ret
   
section .text
   global _start        ;must be declared for using gcc
    
_start:                 ;tell linker entry point
   ;Calling Sum Function
   mov ecx,1
   mov edx,2
   call sum
   
   mov [num], eax
   write_string msg,len
   write_string num,1

   mov eax,1             ;system call number (sys_exit)
   int 0x80              ;call kernel

section .data
    msg db "The sum is: "
    len equ $-msg
section .bss
    num resb 1
