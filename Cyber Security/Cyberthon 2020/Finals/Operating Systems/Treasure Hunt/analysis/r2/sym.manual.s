/ (fcn) sym.manual 370
|   sym.manual ();
|           ; var int32_t var_28h @ rbp-0x28
|           ; var uint32_t var_20h @ rbp-0x20
|           ; var uint32_t var_1ch @ rbp-0x1c
|           ; var int32_t var_18h @ rbp-0x18
|           ; var int32_t var_10h @ rbp-0x10
|           ; var int32_t canary @ rbp-0x8
|           ; CALL XREF from sym.menu @ 0xbe6
|           0x000009b3      55             push rbp
|           0x000009b4      4889e5         mov rbp, rsp
|           0x000009b7      4883ec30       sub rsp, 0x30
|           0x000009bb      64488b042528.  mov rax, qword fs:[0x28]
|           0x000009c4      488945f8       mov qword [canary], rax
|           0x000009c8      31c0           xor eax, eax
|           0x000009ca      488d3de70700.  lea rdi, qword str.Some_of_the_popular_spots_in_ShoppingBaba_center: ; 0x11b8 ; "Some of the popular spots in ShoppingBaba center: " ; const char *s
|           0x000009d1      e82afdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009d6      488d3d130800.  lea rdi, qword str.Sample_:_Location___X_coordinate__Y_coordinate ; 0x11f0 ; "Sample : Location @ X coordinate, Y coordinate" ; const char *s
|           0x000009dd      e81efdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009e2      488d3d370800.  lea rdi, qword str.1._CSIT_Technology_Centre___43434343__67676767 ; 0x1220 ; "1. CSIT Technology Centre @ 43434343, 67676767" ; const char *s
|           0x000009e9      e812fdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009ee      488d3d5b0800.  lea rdi, qword str.2._Kandell_Food_Court___23216789__90942319 ; 0x1250 ; "2. Kandell Food Court @ 23216789, 90942319 " ; const char *s
|           0x000009f5      e806fdffff     call sym.imp.puts           ; int puts(const char *s)
|           0x000009fa      488d3d7f0800.  lea rdi, qword str.3._Value101___78783677__67674343 ; 0x1280 ; "3. Value101 @ 78783677, 67674343 " ; const char *s
|           0x00000a01      e8fafcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a06      488d3d9b0800.  lea rdi, qword str.4._Cyberthon_Information_Centre___31313131__75758989 ; 0x12a8 ; "4. Cyberthon Information Centre @ 31313131, 75758989 " ; const char *s
|           0x00000a0d      e8eefcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a12      488d3dc70800.  lea rdi, qword str.5._Chicken_rice_stall___71717171__53535353 ; 0x12e0 ; "5. Chicken rice stall @ 71717171, 53535353 " ; const char *s
|           0x00000a19      e8e2fcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a1e      488d3deb0800.  lea rdi, qword str.6._Pokemon_Center___21212121__35455354 ; 0x1310 ; "6. Pokemon Center @ 21212121, 35455354" ; const char *s
|           0x00000a25      e8d6fcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a2a      488d3d060900.  lea rdi, qword str.7._Flag___secret__secret ; 0x1337 ; "7. Flag @ secret, secret " ; const char *s
|           0x00000a31      e8cafcffff     call sym.imp.puts           ; int puts(const char *s)
|           0x00000a36      bf0a000000     mov edi, 0xa                ; int c
|           0x00000a3b      e8b0fcffff     call sym.imp.putchar        ; int putchar(int c)
|           0x00000a40      660fefc0       pxor xmm0, xmm0
|           0x00000a44      f20f1145e8     movsd qword [var_18h], xmm0
|           0x00000a49      660fefc0       pxor xmm0, xmm0
|           0x00000a4d      f20f1145f0     movsd qword [var_10h], xmm0
|           0x00000a52      488d3dff0800.  lea rdi, qword str.Please_enter_the_x_to_move_around: ; 0x1358 ; "Please enter the x to move around: " ; const char *format
|           0x00000a59      b800000000     mov eax, 0
|           0x00000a5e      e8cdfcffff     call sym.imp.printf         ; int printf(const char *format)
|           0x00000a63      c745e0000000.  mov dword [var_20h], 0
|           0x00000a6a      c745e4000000.  mov dword [var_1ch], 0
|           0x00000a71      488d45e8       lea rax, qword [var_18h]
|           0x00000a75      4889c6         mov rsi, rax
|           0x00000a78      488d3dfd0800.  lea rdi, qword [0x0000137c] ; "%lf" ; const char *format
|           0x00000a7f      b800000000     mov eax, 0
|           0x00000a84      e8c7fcffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|           0x00000a89      8945e0         mov dword [var_20h], eax
|           0x00000a8c      837de000       cmp dword [var_20h], 0
|       ,=< 0x00000a90      7513           jne 0xaa5
|       |   0x00000a92      488d3de70800.  lea rdi, qword str.Enter_a_number_please ; 0x1380 ; "Enter a number please!" ; const char *s
|       |   0x00000a99      e862fcffff     call sym.imp.puts           ; int puts(const char *s)
|       |   0x00000a9e      b8ffffffff     mov eax, 0xffffffff         ; -1
|      ,==< 0x00000aa3      eb6a           jmp 0xb0f
|      ||   ; CODE XREF from sym.manual @ 0xa90
|      |`-> 0x00000aa5      488d3dec0800.  lea rdi, qword str.Please_enter_the_y_to_move_around: ; 0x1398 ; "Please enter the y to move around: " ; const char *format
|      |    0x00000aac      b800000000     mov eax, 0
|      |    0x00000ab1      e87afcffff     call sym.imp.printf         ; int printf(const char *format)
|      |    0x00000ab6      488d45f0       lea rax, qword [var_10h]
|      |    0x00000aba      4889c6         mov rsi, rax
|      |    0x00000abd      488d3db80800.  lea rdi, qword [0x0000137c] ; "%lf" ; const char *format
|      |    0x00000ac4      b800000000     mov eax, 0
|      |    0x00000ac9      e882fcffff     call sym.imp.__isoc99_scanf ; int scanf(const char *format)
|      |    0x00000ace      8945e4         mov dword [var_1ch], eax
|      |    0x00000ad1      837de400       cmp dword [var_1ch], 0
|      |,=< 0x00000ad5      7513           jne 0xaea
|      ||   0x00000ad7      488d3da20800.  lea rdi, qword str.Enter_a_number_please ; 0x1380 ; "Enter a number please!" ; const char *s
|      ||   0x00000ade      e81dfcffff     call sym.imp.puts           ; int puts(const char *s)
|      ||   0x00000ae3      b8ffffffff     mov eax, 0xffffffff         ; -1
|     ,===< 0x00000ae8      eb25           jmp 0xb0f
|     |||   ; CODE XREF from sym.manual @ 0xad5
|     ||`-> 0x00000aea      bf0a000000     mov edi, 0xa                ; int c
|     ||    0x00000aef      e8fcfbffff     call sym.imp.putchar        ; int putchar(int c)
|     ||    0x00000af4      f20f1045f0     movsd xmm0, qword [var_10h]
|     ||    0x00000af9      488b45e8       mov rax, qword [var_18h]
|     ||    0x00000afd      660f28c8       movapd xmm1, xmm0
|     ||    0x00000b01      488945d8       mov qword [var_28h], rax
|     ||    0x00000b05      f20f1045d8     movsd xmm0, qword [var_28h]
|     ||    0x00000b0a      e843010000     call sym.locations
|     ||    ; CODE XREFS from sym.manual @ 0xaa3, 0xae8
|     ``--> 0x00000b0f      488b55f8       mov rdx, qword [canary]
|           0x00000b13      644833142528.  xor rdx, qword fs:[0x28]
|       ,=< 0x00000b1c      7405           je 0xb23
|       |   0x00000b1e      e8fdfbffff     call sym.imp.__stack_chk_fail ; void __stack_chk_fail(void)
|       |   ; CODE XREF from sym.manual @ 0xb1c
|       `-> 0x00000b23      c9             leave
\           0x00000b24      c3             ret
