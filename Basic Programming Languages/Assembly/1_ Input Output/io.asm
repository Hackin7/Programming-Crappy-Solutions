section .data                           ;Data segment
   userMsg db 'Please enter text (maximum length 5): ' ;Ask the user to enter a number
   lenUserMsg equ $-userMsg             ;The length of the message
   dispMsg db 'You have entered: '
   lenDispMsg equ $-dispMsg                 

section .bss           ;Uninitialized data
   inputData resb 5
    
section .text          ;Code Segment
   global _start
    
_start:                ;User prompt
   ;###Output####################################
   mov  eax,4       ;system call number (sys_write)
   mov  ebx,1       ;file descriptor (stdout)
   mov  ecx,userMsg     ;message to write
   mov  edx,lenUserMsg     ;message length
   int 80h

   ;###Read and store the user input##############
   mov eax, 3       ;system call
   mov ebx, 2       ;argument
   mov ecx, inputData     ;where to store data
   mov edx, 5       ;5 bytes of that information
   int 80h
    
   ;Output the message 'The entered number is: '
   mov eax, 4
   mov ebx, 1
   mov ecx, dispMsg
   mov edx, lenDispMsg
   int 80h  

   ;Output the number entered
   mov eax, 4
   mov ebx, 1
   mov ecx, inputData
   mov edx, 5
   int 80h  
    
   ; Exit code
   mov eax, 1
   mov ebx, 0
   int 80h
