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

section .text
   global _start   ;must be declared for linker (ld)
    
_start: 
   mov  ebx,0      ;EBX will store the sum
   add  ebx, [x] ;Get current value and add to sum
   add  ebx, [x+1]
   add  ebx, [x+2]
   add  ebx, '0'
   mov  [sum], ebx ;done, store result in "sum"

   write_string sum,1   
   mov  eax, 1     ;system call number (sys_exit)
   int  0x80       ;call kernel

section .data
    ;Array
    global x
    x:             ;Store Consecutive Memory Locations
       db  2       ;x
       db  4       ;x+1
       db  3       ;x+2

    sum db  0
