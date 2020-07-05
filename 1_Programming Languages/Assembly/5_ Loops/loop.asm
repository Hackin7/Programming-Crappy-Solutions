;https://www.tutorialspoint.com/assembly_programming/assembly_loops.htm

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
   global _start        ;must be declared for using gcc
    
_start:                 ;tell linker entry point
   mov byte [num],'0'
   mov ecx,10 ;Loop Counter
l1:
   push ecx ;Store temporary loop count into stack
   write_string num, 1
   inc byte [num]
   pop ecx ;Restore count for checking
loop l1

   mov eax,1             ;system call number (sys_exit)
   int 0x80              ;call kernel

section .bss
    num resb 1
