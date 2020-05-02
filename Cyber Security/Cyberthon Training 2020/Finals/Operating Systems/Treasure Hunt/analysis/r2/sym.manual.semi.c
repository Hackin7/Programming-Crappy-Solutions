function sym.manual () {
    //  8 basic blocks

    loc_0x9b3:

       //CALL XREF from sym.menu @ 0xbe6
       push rbp
       rbp = rsp
       rsp -= 0x30
       rax = qword fs:[0x28]
       qword [canary] = rax
       eax = 0
       rdi = qword ["Some of the popular spots in ShoppingBaba center: " //0x11b8 ; str.Some_of_the_popular_spots_in_ShoppingBaba_center:] ; const char *s
                                                 
       int puts("Some of the popular spots in ShoppingBaba center: ")
       rdi = qword ["Sample : Location @ X coordinate, Y coordinate" //0x11f0 ; str.Sample_:_Location___X_coordinate__Y_coordinate] ; const char *s
                                                 
       int puts("Sample : Location @ X coordinate, Y coordinate")
       rdi = qword ["1. CSIT Technology Centre @ 43434343, 67676767" //0x1220 ; str.1._CSIT_Technology_Centre___43434343__67676767] ; const char *s
                                                 
       int puts("1. CSIT Technology Centre @ 43434343, 67676767")
       rdi = qword ["2. Kandell Food Court @ 23216789, 90942319 " //0x1250 ; str.2._Kandell_Food_Court___23216789__90942319] ; const char *s
                                                 
       int puts("2. Kandell Food Court @ 23216789, 90942319 ")
       rdi = qword ["3. Value101 @ 78783677, 67674343 " //0x1280 ; str.3._Value101___78783677__67674343] ; const char *s
                                                 
       int puts("3. Value101 @ 78783677, 67674343 ")
       rdi = qword ["4. Cyberthon Information Centre @ 31313131, 75758989 " //0x12a8 ; str.4._Cyberthon_Information_Centre___31313131__75758989] ; const char *s
                                                 
       int puts("4. Cyberthon Information Centre @ 31313131, 75758989 ")
       rdi = qword ["5. Chicken rice stall @ 71717171, 53535353 " //0x12e0 ; str.5._Chicken_rice_stall___71717171__53535353] ; const char *s
                                                 
       int puts("5. Chicken rice stall @ 71717171, 53535353 ")
       rdi = qword ["6. Pokemon Center @ 21212121, 35455354" //0x1310 ; str.6._Pokemon_Center___21212121__35455354] ; const char *s
                                                 
       int puts("6. Pokemon Center @ 21212121, 35455354")
       rdi = qword ["7. Flag @ secret, secret " //0x1337 ; str.7._Flag___secret__secret] ; const char *s
                                                 
       int puts("7. Flag @ secret, secret ")
       edi = 0xa                //int c
       int putchar(0)    
                            //sym.imp.putchar ()
       xmm0 ^= xmm0
       qword [var_18h] = xmm0
       xmm0 ^= xmm0
       qword [var_10h] = xmm0
       rdi = qword ["Please enter the x to move around: " //0x1358 ; str.Please_enter_the_x_to_move_around:] ; const char *format
       eax = 0
                                                   
       int printf("Please enter the x to move around: ")
       dword [var_20h] = 0
       dword [var_1ch] = 0
       rax = qword [var_18h]
       rsi = rax
       rdi = qword [0x0000137c] //"%lf" ; const char *format
       eax = 0
       int scanf("%lf")         
                       //sym.imp.__isoc99_scanf ()
       dword [var_20h] = eax
       var = dword [var_20h] - 0
       if (var) goto 0xaa5      //unlikely
       {
        loc_0xaa5:

           //CODE XREF from sym.manual @ 0xa90
           rdi = qword ["Please enter the y to move around: " //0x1398 ; str.Please_enter_the_y_to_move_around:] ; const char *format
           eax = 0
                                                       
           int printf("Please enter the y to move around: ")
           rax = qword [var_10h]
           rsi = rax
           rdi = qword [0x0000137c] //"%lf" ; const char *format
           eax = 0
           int scanf("%lf")         
                           //sym.imp.__isoc99_scanf ()
           dword [var_1ch] = eax
           var = dword [var_1ch] - 0
           if (var) goto 0xaea      //unlikely
           {
            loc_0xaea:

               //CODE XREF from sym.manual @ 0xad5
               edi = 0xa                //int c
               int putchar(0)    
                                    //sym.imp.putchar ()
               xmm0 = qword [var_10h]
               rax = qword [var_18h]
               movapd xmm1,xmm0
               qword [var_28h] = rax
               xmm0 = qword [var_28h]
               sym.locations ()         //sym.locations(0xa, 0x0)
           do
           {
                loc_0xb0f:

                   //CODE XREFS from sym.manual @ 0xaa3, 0xae8
                   rdx = qword [canary]
                   rdx ^= qword fs:[0x28]
                   if (!var) goto 0xb23     //unlikely
               } while (?);
           } while (?);
           } while (?);
      }
      return;

}
