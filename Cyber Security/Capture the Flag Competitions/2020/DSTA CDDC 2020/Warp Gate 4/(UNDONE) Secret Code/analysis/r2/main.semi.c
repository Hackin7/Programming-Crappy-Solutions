function main () {
    //  6 basic blocks

    loc_0x6f6:

       ecx = dword [arg_4h]
       esp &= 0xfffffff0        //ebp
       push dword [ecx - 4]
       push ebp
       ebp = esp
       push ebx
       push ecx
       esp -= 0x10
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x18bf            //obj._GLOBAL_OFFSET_TABLE
       eax = dword gs:[0x14]
       dword [var_ch] = eax
       eax = 0
       dword [var_10h] = 0
       esp -= 0xc               //"V6p4zZ;eks}"
       eax = dword [ebx - 0x173c] //"         __                                     _           "
       push eax                 //const char *s ; (pstr 0x00000890) "         __                                     _           "
                                                 
       int puts("         __                                     _           ")
       esp += 0x10
       esp -= 0xc               //"V6p4zZ;eks}"
       eax = dword [ebx - 0x16fc] //" / / _   ) )     _   ) o  _ o _)_ _       _    / ` _   _ _  " str.o____o
       push eax                 //const char *s ; (pstr 0x000008d0) " / / _   ) )     _   ) o  _ o _)_ _       _    / ` _   _ _  "
                                                 
       int puts(" / / _   ) )     _   ) o  _ o _)_ _       _    / ` _   _ _  ")
       esp += 0x10
       esp -= 0xc               //"V6p4zZ;eks}"
       eax = dword [ebx - 0x16bc] //"(_/ ) ) /_/ (_( )_) (  ( (_ ( (_ (_) (_( (    (_. (_) ) )_) " str..
       push eax                 //const char *s ; (pstr 0x00000910) "(_/ ) ) /_/ (_( )_) (  ( (_ ( (_ (_) (_( (    (_. (_) ) )_) "
                                                 
       int puts("(_/ ) ) /_/ (_( )_) (  ( (_ ( (_ (_) (_( (    (_. (_) ) )_) ")
       esp += 0x10
       esp -= 0xc               //"V6p4zZ;eks}"
       eax = dword [ebx - 0x167c] //"               (                         _)            (    \n" str.
       push eax                 //const char *s ; (pstr 0x00000950) "               (                         _)            (    \n"
                                                 
       int puts("               (                         _)            (    \n")
       esp += 0x10
       esp -= 0xc               //"V6p4zZ;eks}"
       eax = dword [ebx - 0x163c] //"[S][E][C][R][E][T] [C][O][D][E]: " str.S__E__C__R__E__T___C__O__D__E_:
       push eax                 //const char *format ; (pstr 0x00000990) "[S][E][C][R][E][T] [C][O][D][E]: "
                                                   
       int printf("[S][E][C][R][E][T] [C][O][D][E]: ")
       esp += 0x10
       esp -= 8                 //"zZ;eks}"
       eax = dword [var_10h]
       push eax
       eax = dword [ebx - 0x161a] //"%u"
       push eax                 //const char *format ; (pstr 0x000009b2) "%u"
       int scanf("%u")          
                      //sym.imp.__isoc99_scanf ()
       esp += 0x10
       eax = dword [var_10h]
       var = eax - 0xf00dcafe
       if (var) goto 0x7b0      //likely
       {
        loc_0x7b0:

           //CODE XREF from main @ 0x79d
           eax = dword [var_10h]
           esp -= 0xc
           push eax
                             
           .chec                       esp += 0x10
       do
       {
            loc_0x7bf:

               //CODE XREF from main @ 0x7ae
               eax = 0
               edx = dword [var_ch]
               edx ^= dword gs:[0x14]
               if (!var) goto 0x7d5     //unlikely
           } while (?);
       } while (?);
      }
      return;

}
