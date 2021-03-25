mov ah, 0x0e ; tty mode

show:
    mov al, 'B'
    int 0x10
    mov al, 'e'
    int 0x10
    ;mov al, 'e'
    int 0x10
    mov al, 'p'
    int 0x10
    mov al, 0xA ;Newline
    int 0x10

;http://muruganad.com/8086/8086-assembly-language-program-to-play-sound-using-pc-speaker.html
speaker:
    mov al,182
    out 43h,al
    mov ax,4560 ; Frequency of Beeping
    out 42h,al
    mov al, ah
    out 42h,al
    in al,61h
    or al, 00000011b
    out 61h, al

;https://stackoverflow.com/questions/34500138/playing-music-with-the-ibm-pc-speaker
delay1: ;Delay for 1 second
    MOV     CX, 0FH
    MOV     DX, 4240H
    MOV     AH, 86H
    INT     15H
    
speakerpause:
    mov al, ah          ; Sound off
    out 61h, al

delay2:
    MOV     CX, 0FH
    MOV     DX, 4240H
    MOV     AH, 86H
    INT     15H

jmp speaker

;jmp speaker
;jmp 2
;jmp $

; padding and magic number
times 510 - ($-$$) db 0
dw 0xaa55 
