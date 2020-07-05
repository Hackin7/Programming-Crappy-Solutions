function entry0 () {
    //  1 basic blocks

    loc_0x780:

       ebp = 0                  //[14] -r-x section size 2562 named .text
       r9 = rdx                 //arg3
       pop rsi
       rdx = rsp
       rsp &= 0xfffffffffffffff0
       push rax
       push rsp
       r8 = qword [sym.__libc_csu_fini] //0x1180
       rcx = qword [sym.__libc_csu_init] ; 0x1110 ; "AWAVI\x89\xd7AUATL\x8d%^\x1c "
       rdi = qword [main]       //sym.main
                                //0x88a
       qword [reloc.__libc_start_main] () //[0x202fe0:8]=0
                                //int __libc_start_main(?, -1, ?, ?, ?, ?, -1)
(break)

}
function sym.deregister_tm_clones () {
    //  4 basic blocks

    loc_0x7b0:

       //CALL XREF from entry.fini0 @ 0x863
       rdi = qword [obj.completed.7697] //obj.__TMC_END
                                //0x203010
       push rbp
       rax = qword [obj.completed.7697] //obj.__TMC_END
                                //0x203010
       var = rax - rdi
       rbp = rsp
       if (!var) goto 0x7e0     //likely
       {
        loc_0x7e0:

           //CODE XREFS from sym.deregister_tm_clones @ 0x7c5, 0x7d1
           
           return
        loc_0x7c7:

           rax = qword [reloc._ITM_deregisterTMCloneTable] //[0x202fd8:8]=0
           var = rax & rax
           if (!var) goto 0x7e0     //likely
      }
      return;

    loc_0x7d3:

       
       goto rax
(break)

}
function sym.register_tm_clones () {
    //  4 basic blocks

    loc_0x7f0:

       //CODE XREF from entry.init0 @ 0x885
       rdi = qword [obj.completed.7697] //obj.__TMC_END
                                //0x203010
       rsi = qword [obj.completed.7697] //obj.__TMC_END
                                //0x203010
       push rbp
       rsi -= rdi
       rbp = rsp
       rsi >>= 3
       rax = rsi
       rax >>>= 0x3f
       rsi += rax
       rsi >>= 1
       if (!var) goto 0x830     //likely
       {
        loc_0x830:

           //CODE XREFS from sym.register_tm_clones @ 0x816, 0x822
           
           return
        loc_0x818:

           rax = qword [reloc._ITM_registerTMCloneTable] //[0x202ff0:8]=0
           var = rax & rax
           if (!var) goto 0x830     //likely
      }
      return;

    loc_0x824:

       
       goto rax
(break)

}
function entry.fini0 () {
    //  5 basic blocks

    loc_0x840:

       var = byte [obj.completed.7697] - 0 //obj.__TMC_END
                                //[0x203010:1]=0
       if (var) goto 0x878      //unlikely
       {
        loc_0x878:

           //CODE XREF from entry.fini0 @ 0x847
           return
        loc_0x849:

           var = qword [reloc.__cxa_finalize] - 0 //[0x202ff8:8]=0
           push rbp
           rbp = rsp
           if (!var) goto 0x863     //likely
      }
      return;

    loc_0x857:

       rdi = qword [obj.__dso_handle] //[0x203008:8]=0x203008 obj.__dso_handle
       sym..plt.got ()          //sym..plt.got(0x203008, 0x0, 0x0, 0x0)
   do
   {
        loc_0x863:

           //CODE XREF from entry.fini0 @ 0x855
           sym.deregister_tm_clones ()
           byte [obj.completed.7697] = 1 //obj.__TMC_END
                                    //[0x203010:1]=0
                                    //rsp
           return
       } while (?);
  return;

}
function entry.init0 () {
    //  1 basic blocks

    loc_0x880:

       push rbp
       rbp = rsp
                                //rsp ; rsp
       goto sym.register_tm_clones
  // chop

   do
   {
        loc_0x7f0:

           //CODE XREF from entry.init0 @ 0x885
           rdi = qword [obj.completed.7697] //obj.__TMC_END
                                    //0x203010
           rsi = qword [obj.completed.7697] //obj.__TMC_END
                                    //0x203010
           push rbp
           rsi -= rdi
           rbp = rsp
           rsi >>= 3
           rax = rsi
           rax >>>= 0x3f
           rsi += rax
           rsi >>= 1
           if (!var) goto 0x830     //likely
       } while (?);
  return;

    loc_0x818:

       rax = qword [reloc._ITM_registerTMCloneTable] //[0x202ff0:8]=0
       var = rax & rax
       if (!var) goto 0x830     //likely
  // chop

       {
        loc_0x830:

           //CODE XREFS from sym.register_tm_clones @ 0x816, 0x822
           
           return
        loc_0x824:

           
           goto rax
      }
      return;

}
function sym.__libc_csu_fini () {
    //  1 basic blocks

    loc_0x1180:

       //DATA XREF from entry0 @ 0x78f
       return
(break)

}
function sym.menu () {
    //  13 basic blocks

    loc_0xb25:

       //CALL XREF from main @ 0x893
       push rbp
       rbp = rsp
       rsp -= 0x10
       rax = qword fs:[0x28]
       qword [canary] = rax
       eax = 0
       rdi = qword ["Welcome to ShoppingBaba's Annual Treasure Hunt game!" //0x13c0 ; str.Welcome_to_ShoppingBaba_s_Annual_Treasure_Hunt_game] ; const char *s
                                                 
       int puts("Welcome to ShoppingBaba's Annual Treasure Hunt game!")
       rdi = qword ["Look for the flag hidden in this Treasure to win points!" //0x13f8 ; str.Look_for_the_flag_hidden_in_this_Treasure_to_win_points] ; const char *format
       eax = 0
                                                   
       int printf("Look for the flag hidden in this Treasure to win points!")
       rdi = qword ["In this game, you can either navigate in ShoppingBaba center by the following ways:\n" //0x1438 ; str.In_this_game__you_can_either_navigate_in_ShoppingBaba_center_by_the_following_ways:] ; const char *s
                                                 
       int puts("In this game, you can either navigate in ShoppingBaba center by the following ways:\n")
       rdi = qword ["1: Move to a random spot" //0x148d ; str.1:_Move_to_a_random_spot] ; const char *s
                                                 
       int puts("1: Move to a random spot")
       rdi = qword ["2: Teleport to a known coordinate" //0x14a8 ; str.2:_Teleport_to_a_known_coordinate] ; const char *s
                                                 
       int puts("2: Teleport to a known coordinate")
       rdi = qword ["9: Exit the Treasure Hunt" //0x14ca ; str.9:_Exit_the_Treasure_Hunt] ; const char *s
                                                 
       int puts("9: Exit the Treasure Hunt")
       edi = 0xa                //int c
       int putchar(0)    
                            //sym.imp.putchar ()
       dword [var_10h] = 0xffffffff //-1
       rdi = qword ["Please enter the option to move around: " //0x14e8 ; str.Please_enter_the_option_to_move_around:] ; const char *format
       eax = 0
                                                   
       int printf("Please enter the option to move around: ")
       rax = qword [var_10h]
       rsi = rax
       rdi = qword [0x00001511] //"%d" ; const char *format
       eax = 0
       int scanf("%d")          
                      //sym.imp.__isoc99_scanf ()
       goto 0xc33
   do
   {
        loc_0xc33:

           //CODE XREF from sym.menu @ 0xbc3
           eax = dword [var_10h]
           var = eax - 9
           if (var) goto 0xbc5      //likely
       } while (?);
  return;

    loc_0xc3b:

       //CODE XREF from sym.menu @ 0xbf4
       
       rax = qword [canary]     //rsp
       rax ^= qword fs:[0x28]
       if (!var) goto 0xc50     //unlikely
       {
        loc_0xc50:

           //CODE XREF from sym.menu @ 0xc49
           leave                    //rsp
           return
        loc_0xc4b:

           void __stack_chk_fail(void)
                                    //sym.imp.__stack_chk_fail ()
      }
      return;

}
function sym._fini () {
    //  1 basic blocks

    loc_0x1184:

       rsp -= 8                 //[15] -r-x section size 9 named .fini
       rsp += 8
       return
(break)

}
function sym.locations () {
    //  57 basic blocks

    loc_0xc52:

       //CALL XREF from sym.randomise @ 0x900
       //CALL XREF from sym.manual @ 0xb0a
       push rbp
       rbp = rsp
       rsp -= 0x30
       qword [var_28h] = xmm0   //arg7
       qword [var_30h] = xmm1   //arg8
       xmm0 = qword [var_28h]
       ucomisd xmm0,qword [0x00001c58]
       jp 0xcc9                 //unlikely
       {
        loc_0xcc9:

           //CODE XREFS from sym.locations @ 0xc71, 0xc80, 0xc8f, 0xc9e
           xmm0 = qword [var_28h]
           ucomisd xmm0,qword [0x00001c68]
           jp 0xd2e                 //unlikely
           {
            loc_0xd2e:

               //CODE XREFS from sym.locations @ 0xcd6, 0xce5, 0xcf4, 0xd03
               xmm0 = qword [var_28h]
               ucomisd xmm0,qword [0x00001c78]
               jp 0xd93                 //unlikely
               {
                loc_0xd93:

                   //CODE XREFS from sym.locations @ 0xd3b, 0xd4a, 0xd59, 0xd68
                   xmm0 = qword [var_28h]
                   ucomisd xmm0,qword [0x00001c88]
                   jp 0xdf8                 //unlikely
                   {
                    loc_0xdf8:

                       //CODE XREFS from sym.locations @ 0xda0, 0xdaf, 0xdbe, 0xdcd
                       xmm0 = qword [var_28h]
                       ucomisd xmm0,qword [0x00001c98]
                       jp 0xe5d                 //unlikely
                       {
                        loc_0xe5d:

                           //CODE XREFS from sym.locations @ 0xe05, 0xe14, 0xe23, 0xe32
                           xmm0 = qword [var_28h]
                           ucomisd xmm0,qword [0x00001c98]
                           jp 0xef3                 //unlikely
                           {
                            loc_0xef3:

                               //CODE XREFS from sym.locations @ 0xe6a, 0xe7d, 0xe8c, 0xe9b
                               xmm0 = qword [var_28h]
                               ucomisd xmm0,qword [0x00001cb0]
                               jp 0xf64                 //unlikely
                               {
                                loc_0xf64:

                                   //CODE XREFS from sym.locations @ 0xf00, 0xf0f, 0xf1e, 0xf2d
                                   xmm0 = qword [var_28h]
                                   ucomisd xmm0,qword [0x00001c98]
                                   jp 0xfc9                 //unlikely
                                   {
                                    loc_0xfc9:

                                       //CODE XREFS from sym.locations @ 0xf71, 0xf80, 0xf8f, 0xf9e
                                       xmm0 = qword [var_28h]
                                       ucomisd xmm0,qword [0x00001cc0]
                                       jp 0x102e                //unlikely
                                       {
                                        loc_0x102e:

                                           //CODE XREFS from sym.locations @ 0xfd6, 0xfe5, 0xff4, 0x1003
                                           xmm0 = qword [var_28h]
                                           ucomisd xmm0,qword [0x00001cd0]
                                           jp 0x1090                //unlikely
                                           {
                                            loc_0x1090:

                                               //CODE XREFS from sym.locations @ 0x103b, 0x104a, 0x1059, 0x1068
                                               xmm0 = qword [var_28h]
                                               ucomisd xmm0,qword [0x00001ce0]
                                               jp 0x10f2                //unlikely
                                               {
                                                loc_0x10f2:

                                                   //CODE XREFS from sym.locations @ 0x109d, 0x10ac, 0x10bb, 0x10ca
                                                   rdi = qword ["You have landed at some random spot!" //0x1c18 ; str.You_have_landed_at_some_random_spot] ; const char *s
                                                                                             
                                                   int puts("You have landed at some ")
                                                   rdi = qword ["There is nothing here... \n" //0x1c3d ; str.There_is_nothing_here...] ; const char *s
                                                                                             
                                                   int puts("There is nothing here...")
                                               do
                                               {
                                                    loc_0x110a:

                                                       //XREFS: CODE 0x00000cc4  CODE 0x00000d29  CODE 0x00000d8e  
                                                       //XREFS: CODE 0x00000df3  CODE 0x00000e58  CODE 0x00000eee  
                                                       //XREFS: CODE 0x00000f5f  CODE 0x00000fc4  CODE 0x00001029  
                                                       //XREFS: CODE 0x0000108e  CODE 0x000010f0  
                                                       
                                                       leave                    //rsp
                                                       return
                                                   } while (?);
                                               } while (?);
                                               } while (?);
                                           } while (?);
                                       } while (?);
                                   } while (?);
                               } while (?);
                           } while (?);
                       } while (?);
                   } while (?);
               } while (?);
           } while (?);
      }
      return;

    goto loc_0xc73
    loc_0xc82:

       xmm0 = qword [var_30h]
       ucomisd xmm0,qword [0x00001c60]
       jp 0xcc9                 //unlikely
    loc_0xc91:

       xmm0 = qword [var_30h]
       ucomisd xmm0,qword [0x00001c60]
       if (var) goto 0xcc9      //likely
    loc_0xca0:

       rdi = qword ["You have landed at CSIT Technology Centre!" //0x1520 ; str.You_have_landed_at_CSIT_Technology_Centre] ; const char *s
                                                 
       int puts("You have landed at CSIT Technology Centre")
       rdi = qword ["Le random dude came to you and said: " //0x1550 ; str.Le_random_dude_came_to_you_and_said:] ; const char *s
                                                 
       int puts("Le random dude came to you and said: ")
       rdi = qword [s"We conduct vulnerability assessments on critical software and infrastructure to find and assess security threats! \n"//0x1578 ; str.We_conduct_vulnerability_assessments_on_critical_software_and_infrastructure_to_find_and_assess_security_threats] ; const char *s
                                                 
       int puts("We conduct vulnerability assessments on c")
       goto 0x110a
}
function sym.__libc_csu_init () {
    //  4 basic blocks

    loc_0x1110:

       //DATA XREF from entry0 @ 0x796
       push r15
       push r14
       r15 = rdx                //arg3
       push r13
       push r12
       r12 = qword [obj.__frame_dummy_init_array_entry] //loc.__init_array_start
                                //0x202d80
       push rbp
       rbp = qword [obj.__do_global_dtors_aux_fini_array_entry] //loc.__init_array_end
                                //0x202d88 ; "@\b"
       push rbx
       r13d = edi               //arg1
       r14 = rsi                //arg2
       rbp -= r12
       rsp -= 8
       rbp >>= 3
       sym._init ()
       var = rbp & rbp
       if (!var) goto 0x1166    //unlikely
       {
        loc_0x1166:

           //CODE XREF from sym.__libc_csu_init @ 0x1144
           rsp += 8
           pop rbx
           
           pop r12
           pop r13
           pop r14
           pop r15
           return
        loc_0x1146:

           ebx = 0
           
      }
      return;

}
function sym.xor () {
    //  4 basic blocks

    loc_0x908:

       //CALL XREF from sym.locations @ 0xed9
       push rbp
       rbp = rsp
       rsp -= 0x30
       qword [s] = rdi          //arg1
       qword [var_30h] = rsi    //arg2
       rax = qword [s]
       rdi = rax                //const char *s
       size_t strlen(-1)
                                //sym.imp.strlen ()
       qword [size] = rax
       rax = qword [var_30h]
       rdi = rax                //const char *s
       size_t strlen(-1)
                                //sym.imp.strlen ()
       qword [var_10h] = rax
       rax = qword [size]
       rax += 1
       rdi = rax                //size_t size
                                                    
       void *malloc(0x02464c45)
       qword [var_8h] = rax
       dword [var_1ch] = 0
       goto 0x994
   do
   {
        loc_0x994:

           //CODE XREF from sym.xor @ 0x953
           eax = dword [var_1ch]
           cdqe
           var = qword [size] - rax
           if (((unsigned) var) > 0) goto 0x955 //unlikely
       } while (?);
  return;

    loc_0x99f:

       rdx = qword [var_8h]     //rsp
       rax = qword [size]
       rax += rdx               //rsp
       byte [rax] = 0
       rax = qword [var_8h]     //rsp
       leave                    //rsp
       return
(break)

}
function main () {
    //  1 basic blocks

    loc_0x88a:

       //DATA XREF from entry0 @ 0x79d
       push rbp
       rbp = rsp
       eax = 0
       sym.menu ()
       eax = 0
       
       return                   //rsp ; rsp
(break)

}
function sym._init () {
    //  3 basic blocks

    loc_0x6c0:

       //CALL XREF from sym.__libc_csu_init @ 0x113c
       rsp -= 8                 //[11] -r-x section size 23 named .init
       rax = qword [reloc.__gmon_start] //[0x202fe8:8]=0
       var = rax & rax
       if (!var) goto 0x6d2     //likely
       {
        loc_0x6d2:

           //CODE XREF from sym._init @ 0x6ce
           rsp += 8
           return
        loc_0x6d0:

           rax ()                   //loc.imp._ITM_deregisterTMCloneTable(0x0)
      }
      return;

}
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
function sym.randomise () {
    //  1 basic blocks

    loc_0x89f:

       //CALL XREF from sym.menu @ 0xbd2
       push rbp
       rbp = rsp
       rsp -= 0x20
       int rand(void) 
                               //sym.imp.rand ()
       cvtsi2sd xmm0,eax
       qword [var_10h] = xmm0   //arg7
       int rand(void) 
                               //sym.imp.rand ()
       cvtsi2sd xmm0,eax
       qword [var_8h] = xmm0    //arg7
       xmm0 = qword [var_8h]
       rax = qword [var_10h]
       movapd xmm1,xmm0
       qword [var_18h] = rax
       xmm0 = qword [var_18h]
       rdi = qword ["You are going to %lf, %lf..." //0x1198 ; str.You_are_going_to__lf___lf...] ; const char *format
       eax = 2
                                                   
       int printf("You are going to %lf, %lf...")
       xmm0 = qword [var_8h]
       rax = qword [var_10h]
       movapd xmm1,xmm0
       qword [var_18h] = rax
       xmm0 = qword [var_18h]
                             
       .locatio                       
       leave                    //rsp ; rsp
       return
(break)

}
function sym.imp.rand () {
    //  1 basic blocks

    loc_0x760:

       //CALL XREFS from sym.randomise @ 0x8a7, 0x8b5
       goto qword [reloc.rand]  //[0x202fd0:8]=0x766 ; "f\a"
(break)

}
function sym.imp.printf () {
    //  1 basic blocks

    loc_0x730:

       //XREFS: CALL 0x000008e5  CALL 0x00000a5e  CALL 0x00000ab1  
       //XREFS: CALL 0x00000b54  CALL 0x00000ba6  CALL 0x00000c16  
       goto qword [reloc.printf] //[0x202fb8:8]=0x736 ; "6\a"
(break)

}
function sym.imp.putchar () {
    //  1 basic blocks

    loc_0x6f0:

       //CALL XREFS from sym.manual @ 0xa3b, 0xaef
       //CALL XREF from sym.menu @ 0xb8e
       goto qword [reloc.putchar] //[0x202f98:8]=0x6f6
(break)

}
function sym.imp.puts () {
    //  1 basic blocks

    loc_0x700:

       //XREFS(53)
       goto qword [reloc.puts]  //[0x202fa0:8]=0x706
(break)

}
function sym.imp.strlen () {
    //  1 basic blocks

    loc_0x710:

       //CALL XREFS from sym.xor @ 0x91f, 0x92f
       goto qword [reloc.strlen] //[0x202fa8:8]=0x716
(break)

}
function sym.imp.__stack_chk_fail () {
    //  1 basic blocks

    loc_0x720:

       //CALL XREF from sym.manual @ 0xb1e
       //CALL XREF from sym.menu @ 0xc4b
       goto qword [reloc.__stack_chk_fail] //[0x202fb0:8]=0x726 ; "&\a"
(break)

}
function loc.imp._ITM_deregisterTMCloneTable () {
    //  3 basic blocks

    loc_0x0:

       //CALL XREF from sym.__libc_csu_init @ 0x1159
       if (var > 0) goto 0x47   //[28] ---- section size 254 named .shstrtab ; likely
       {
        loc_0x47:

           //CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           clc
        loc_0x2:

           //DATA XREF from sym.imp.strlen @ +0x6
           //DATA XREF from sym.menu @ 0xbdc
           r8b += byte [rcx]        //arg4
           //DATA XREF from sym.imp.__isoc99_scanf @ +0x6
           dword [rax] += eax
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           eax += dword [rax]
           byte ds:[rcx] += al      //arg4
           byte [rax] += al
           byte [rax + 7] += al
           byte [rax] += al
           byte [rax] += al
           //DATA XREF from section..eh_frame @ +0x6a
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rbx] |= bh
           byte [rax] += al
           byte [rax] += al
           //DATA XREF from str.4._Cyberthon_Information_Centre___31313131__75758989 @ 
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += dil
           byte [rcx] += cl         //arg4
           byte [rax] += al
       ~   eax = eax - 0x6001c00
           invalid
           byte [rax] += al
           byte [rax + rax] += al
       ~   byte [rax] += al
           //CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           clc
      }
      return;

}
function sym.imp.malloc () {
    //  1 basic blocks

    loc_0x740:

       //CALL XREF from sym.xor @ 0x943
       goto qword [reloc.malloc] //[0x202fc0:8]=0x746 ; "F\a"
(break)

}
function sym.imp.__isoc99_scanf () {
    //  1 basic blocks

    loc_0x750:

       //CALL XREFS from sym.manual @ 0xa84, 0xac9
       //CALL XREFS from sym.menu @ 0xbbe, 0xc2e
       goto qword [reloc.__isoc99_scanf] //[0x202fc8:8]=0x756 ; "V\a"
(break)

}
