segment .bss                   ;Initialised Data
    value resb 1

section .text
   global _start          ;must be declared for linker (gcc)
    
_start:                   ;tell linker entry point
   ;Data Manipulation
   ;operation size [varname],value
   ;size can be byte, word or more
   
   ;Let x be the value of [value] at the start
   ;This program does (x+1-1+2-1)*4/3
   
   mov byte [value],1         ;Assign

   inc byte [value]            ;Add 1 to variable
   dec byte [value]            ;Subtract 1 from variable 
   
   add byte [value], 2 ;Convert to ASCII Value
   sub byte [value], 1
   
   mov AL,  4 ;Multiplier
   mov DL, [value]
   mul DL ;Change mul to imul for signed
   mov [value],AL
   
   mov AX, [value] ;To Divide
   mov DL, 3 ;Divisor
   div DL  ;Change mul to imul for signed
   mov [value],AL ;Quotient
   ;mov byte [value],DL ;Remainder


   add byte [value], '0' ;Convert to ASCII Value
   
   ;Shows ASCII Value
   mov edx, 1                  ;message length
   mov ecx, value           
   mov ebx,1                    ;file descriptor (stdout)
   mov eax,4                 ;system call number (sys_write)
   int 0x80                     ;call kernel

   mov eax,1                   ;system call number (sys_exit)
   int 0x80                     ;call kernel
