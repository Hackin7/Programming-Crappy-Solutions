;Variables
section .data                   ;Initialised Data
    ;varname SIZE value
    character DB 'a'               ;DB: Allocate 1 byte 
    charlength DB $-character
    ;Other Variables Test
    smallnum DB 65
    number  DW 12345            ;DW: Allocate 2 bytes 
    neg_number  DW -12345
    number2  DD -12345          ;DD: Allocate 4 bytes
    big_number  DQ 123456789    ;DQ: Allocate 8 bytes
    real_number1   DD   1.234
    real_number2   DQ   123.456
    real_number3   DT   123.456 ;DT: Allocate 10 bytes
    ;Value: *********
    marks  TIMES  9  DW  '*' ;Repeatedly assign nine times
    
section .bss           ;Uninitialized data
    ;varname directive [Size of space to reserve]
    uninit resb 3
    
;Constants
SYS_WRITE equ 4
SYS_EXIT equ 1
MULTIPLYTEST equ SYS_WRITE * SYS_EXIT

;Numeric Constants
%assign TOTAL 95
;Numeric and String Constants
%define STR 'S'

;###########################################################
section .text
   global _start          ;must be declared for linker (gcc)
    
_start:                   ;tell linker entry point
   ;Data Manipulation
   ;operation size [varname],value
   ;size can be byte, word or more
   
   inc byte [character]            ;Add 1 to variable
   dec byte [character]            ;Subtract 1 from variable 
   mov byte [character],66         ;Assign
   mov byte [character],STR         ;Assign
   add byte [character], 4
   sub byte [character], 3
   
   ;Shows ASCII Value
   ;###Change message to write, only for variables#############
   mov edx, 1                  ;message length
   mov ecx, character           
   mov ebx,1                    ;file descriptor (stdout)
   mov eax,SYS_WRITE                    ;system call number (sys_write)
   int 0x80                     ;call kernel

   mov eax,SYS_EXIT                    ;system call number (sys_exit)
   int 0x80                     ;call kernel
