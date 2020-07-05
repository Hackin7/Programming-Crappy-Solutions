function entry0 () {
    //  1 basic blocks

    loc_0x4c0:

       ebp = 0                  //[14] -r-x section size 948 named .text
       pop esi
       ecx = esp
       esp &= 0xfffffff0        //ebp
       push eax
       push esp
       push edx
       fcn.000004f2 ()
       ebx += 0x1afc            //obj._GLOBAL_OFFSET_TABLE
       eax = dword [ebx - 0x177c] //sym.__libc_csu_fini
       push eax                 //func fini
       eax = dword [ebx - 0x17dc] //sym.__libc_csu_init
       push eax                 //func init
       push ecx                 //char **ubp_av
       push esi                 //int argc
       push dword [ebx + 0x2c]  //func main
                                                              
       int __libc_start_main(?, NULL, ?, ?, ?, ?, 0x00000000)
(break)

}
function fcn.000004f2 () {
    //  1 basic blocks

    loc_0x4f2:

       //CALL XREF from entry0 @ 0x4cb
       ebx = dword [esp]
       return
(break)

}
function sym.imp.__libc_start_main () {
    //  1 basic blocks

    loc_0x490:

       //CALL XREF from entry0 @ 0x4ec
       goto dword [ebx + 0x18]  //sym._start
(break)

}
function sym.deregister_tm_clones () {
    //  4 basic blocks

    loc_0x510:

       //CALL XREF from entry.fini0 @ 0x5d6
       sym.__x86.get_pc_thunk.dx ()
       edx += 0x1ab7            //obj._GLOBAL_OFFSET_TABLE
       ecx = dword [edx + 0x3c] //obj.__TMC_END
       eax = dword [edx + 0x3c] //obj.__TMC_END
       var = eax - ecx
       if (!var) goto 0x548     //likely
       {
        loc_0x548:

           //CODE XREFS from sym.deregister_tm_clones @ 0x529, 0x533
           return
        loc_0x52b:

           eax = dword [edx + 0x20]
           var = eax & eax
           if (!var) goto 0x548     //unlikely
      }
      return;

    loc_0x535:

       push ebp
       ebp = esp
       esp -= 0x14
       push ecx
       eax ()
       esp += 0x10
       leave                    //ebp ; ebp
       return
(break)

}
function sym.__x86.get_pc_thunk.dx () {
    //  1 basic blocks

    loc_0x5f9:

       //CALL XREF from sym.deregister_tm_clones @ 0x510
       //CALL XREF from sym.register_tm_clones @ 0x550
       edx = dword [esp]
       return
(break)

}
function sym.register_tm_clones () {
    //  4 basic blocks

    loc_0x550:

       //CODE XREF from entry.init0 @ 0x5f4
       sym.__x86.get_pc_thunk.dx ()
       edx += 0x1a77            //obj._GLOBAL_OFFSET_TABLE
       push ebp
       ecx = dword [edx + 0x3c] //obj.__TMC_END
       eax = dword [edx + 0x3c] //obj.__TMC_END
       eax -= ecx
       ebp = esp
       push ebx
       eax >>= 2
       ebx = eax
       esp -= 4
       ebx >>>= 0x1f
       eax += ebx
       eax >>= 1
       if (!var) goto 0x592     //likely
       {
        loc_0x592:

           //CODE XREFS from sym.register_tm_clones @ 0x57c, 0x586
           ebx = dword [var_4h]     //ebp
           leave                    //ebp
           return
        loc_0x57e:

           edx = dword [edx + 0x30]
           var = edx & edx
           if (!var) goto 0x592     //unlikely
      }
      return;

    loc_0x588:

       esp -= 8
       push eax
       push ecx
       edx ()
       esp += 0x10
}
function entry.fini0 () {
    //  5 basic blocks

    loc_0x5a0:

       push ebp
       ebp = esp
       push ebx
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x1a23            //obj._GLOBAL_OFFSET_TABLE
       esp -= 4
       var = byte [ebx + 0x3c] - 0
       if (var) goto 0x5e2      //unlikely
       {
        loc_0x5e2:

           //CODE XREF from entry.fini0 @ 0x5b9
           ebx = dword [var_4h]     //ebp
           leave                    //ebp
           return
        loc_0x5bb:

           eax = dword [ebx + 0x24]
           var = eax & eax
           if (!var) goto 0x5d6     //likely
      }
      return;

    loc_0x5c5:

       esp -= 0xc
       push dword [ebx + 0x38]
                                //
       .got(0x0,                       esp += 0x10
   do
   {
        loc_0x5d6:

           //CODE XREF from entry.fini0 @ 0x5c3
           sym.deregister_tm_clones ()
           byte [ebx + 0x3c] = 1
       } while (?);
  return;

}
function sym.__x86.get_pc_thunk.bx () {
    //  1 basic blocks

    loc_0x500:

       //XREFS: CALL 0x00000424  CALL 0x000005a4  CALL 0x00000708  
       //XREFS: CALL 0x000007f4  CALL 0x00000861  CALL 0x00000878  
       ebx = dword [esp]
       return
(break)

}
function entry.init0 () {
    //  1 basic blocks

    loc_0x5f0:

       push ebp
       ebp = esp
                                //ebp ; ebp
       goto sym.register_tm_clones
  // chop

   do
   {
        loc_0x550:

           //CODE XREF from entry.init0 @ 0x5f4
           sym.__x86.get_pc_thunk.dx ()
           edx += 0x1a77            //obj._GLOBAL_OFFSET_TABLE
           push ebp
           ecx = dword [edx + 0x3c] //obj.__TMC_END
           eax = dword [edx + 0x3c] //obj.__TMC_END
           eax -= ecx
           ebp = esp
           push ebx
           eax >>= 2
           ebx = eax
           esp -= 4
           ebx >>>= 0x1f
           eax += ebx
           eax >>= 1
           if (!var) goto 0x592     //likely
       } while (?);
  return;

    loc_0x57e:

       edx = dword [edx + 0x30]
       var = edx & edx
       if (!var) goto 0x592     //unlikely
  // chop

       {
        loc_0x592:

           //CODE XREFS from sym.register_tm_clones @ 0x57c, 0x586
           ebx = dword [var_4h]     //ebp
           leave                    //ebp
           return
        loc_0x588:

           esp -= 8
           push eax
           push ecx
           edx ()
           esp += 0x10
      }
      return;

}
function sym.__libc_csu_fini () {
    //  1 basic blocks

    loc_0x850:

       return
(break)

}
function sym._fini () {
    //  1 basic blocks

    loc_0x874:

       push ebx                 //[15] -r-x section size 20 named .fini
       esp -= 8
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x174f            //obj._GLOBAL_OFFSET_TABLE
       esp += 8
       pop ebx                  //ebp
       return
(break)

}
function sym.__libc_csu_init () {
    //  4 basic blocks

    loc_0x7f0:

       push ebp
       push edi
       push esi
       push ebx
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x17d3            //obj._GLOBAL_OFFSET_TABLE
       esp -= 0xc
       ebp = dword [arg_28h]
       esi = dword [ebx - 0xfc] //loc.__init_array_end
       sym._init ()
       eax = dword [ebx - 0x100] //loc.__init_array_start
       esi -= eax
       esi >>= 2
       var = esi & esi
       if (!var) goto 0x845     //unlikely
       {
        loc_0x845:

           //CODE XREF from sym.__libc_csu_init @ 0x81e
           esp += 0xc
           pop ebx
           pop esi
           pop edi
           
           return
        loc_0x820:

           edi = 0
           esi = dword [esi]
      }
      return;

}
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
       esp -= 0xc
       eax = dword [ebx - 0x173c] //"         __                                     _           "
       push eax                 //const char *s ; (pstr 0x00000890) "         __                                     _           "
                                                 
       int puts("         __                                     _           ")
       esp += 0x10
       esp -= 0xc
       eax = dword [ebx - 0x16fc] //" / / _   ) )     _   ) o  _ o _)_ _       _    / ` _   _ _  " str.o____o
       push eax                 //const char *s ; (pstr 0x000008d0) " / / _   ) )     _   ) o  _ o _)_ _       _    / ` _   _ _  "
                                                 
       int puts(" / / _   ) )     _   ) o  _ o _)_ _       _    / ` _   _ _  ")
       esp += 0x10
       esp -= 0xc
       eax = dword [ebx - 0x16bc] //"(_/ ) ) /_/ (_( )_) (  ( (_ ( (_ (_) (_( (    (_. (_) ) )_) " str..
       push eax                 //const char *s ; (pstr 0x00000910) "(_/ ) ) /_/ (_( )_) (  ( (_ ( (_ (_) (_( (    (_. (_) ) )_) "
                                                 
       int puts("(_/ ) ) /_/ (_( )_) (  ( (_ ( (_ (_) (_( (    (_. (_) ) )_) ")
       esp += 0x10
       esp -= 0xc
       eax = dword [ebx - 0x167c] //"               (                         _)            (    \n" str.
       push eax                 //const char *s ; (pstr 0x00000950) "               (                         _)            (    \n"
                                                 
       int puts("               (                         _)            (    \n")
       esp += 0x10
       esp -= 0xc
       eax = dword [ebx - 0x163c] //"[S][E][C][R][E][T] [C][O][D][E]: " str.S__E__C__R__E__T___C__O__D__E_:
       push eax                 //const char *format ; (pstr 0x00000990) "[S][E][C][R][E][T] [C][O][D][E]: "
                                                   
       int printf("[S][E][C][R][E][T] [C][O][D][E]: ")
       esp += 0x10
       esp -= 8
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
function sym.__x86.get_pc_thunk.ax () {
    //  1 basic blocks

    loc_0x7df:

       //CALL XREF from sym.check @ 0x606
       eax = dword [esp]
       return
(break)

}
function sym.__stack_chk_fail_local () {
    //  1 basic blocks

    loc_0x860:

       //CALL XREF from sym.check @ 0x6e9
       //CALL XREF from main @ 0x7d0
       push ebx
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x1766            //obj._GLOBAL_OFFSET_TABLE
       esp -= 8
       void __stack_chk_fail(void)
                                //sym.imp.__stack_chk_fail ()
(break)

}
function sym.imp.__stack_chk_fail () {
    //  1 basic blocks

    loc_0x470:

       //CALL XREF from sym.__stack_chk_fail_local @ 0x86f
       goto dword [ebx + 0x10]
(break)

}
function sym.check () {
    //  8 basic blocks

    loc_0x5fd:

       //CALL XREFS from main @ 0x7a6, 0x7b7
       push ebp
       ebp = esp
       push edi
       push esi
       push ebx
       esp -= 0x4c
       sym.__x86.get_pc_thunk.ax ()
       eax += 0x19c1            //obj._GLOBAL_OFFSET_TABLE
       dword [var_54h] = eax
       eax = dword gs:[0x14]
       dword [var_1ch] = eax
       eax = 0
       byte [var_3dh] = 0
       dword [s] = 0x43444443   //'CDDC'
       dword [var_2fh] = 0x457b3032 //'20{E'
       dword [var_2bh] = 0x567a7135 //'5qzV'
       dword [var_27h] = 0x7a347036 //'6p4z'
       dword [var_23h] = 0x6b653b5a //'Z;ek'
       word [var_1fh] = 0x7d73  //'s}'
       byte [var_1dh] = 0
       dword [var_3ch] = 0xdeadbeef
       dword [var_38h] = 0xbabeface
       ecx = dword [var_3ch]
       ecx -= dword [var_38h]
       esi = ecx
       edi = 0
       ecx = dword [arg_8h]
       ebx = 0
       ecx += 0x33e0f923
       ebx += -1
       eax = esi
       eax ^= ecx
       dword [var_50h] = eax
       eax = edi
       eax ^= ebx
       dword [var_4ch] = eax
       ebx = dword [var_50h]
       esi = dword [var_4ch]
       eax = ebx
       eax |= esi
       var = eax & eax
       if (var) goto 0x6dc      //likely
       {
        loc_0x6dc:

           //CODE XREF from sym.check @ 0x695
           
           eax = dword [var_1ch]
           eax ^= dword gs:[0x14]
           if (!var) goto 0x6ee     //unlikely
           {
            loc_0x6ee:

               //CODE XREF from sym.check @ 0x6e7
               esp = dword [var_ch]
               pop ebx
               pop esi
               pop edi                  //ebp ; ebp
               
               return
            loc_0x6e9:

               sym.__stack_chk_fail_local ()
           } else {
           }
      }
      return;

}
function sym._init () {
    //  3 basic blocks

    loc_0x420:

       //CALL XREF from sym.__libc_csu_init @ 0x80c
       push ebx                 //[11] -r-x section size 35 named .init
       esp -= 8
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x1ba3            //obj._GLOBAL_OFFSET_TABLE
       eax = dword [ebx + 0x28]
       var = eax & eax
       if (!var) goto 0x43e     //likely
       {
        loc_0x43e:

           esp += 8
           pop ebx
           return
        loc_0x439:

           0x4b8 ()                 //0x4b8(0x0, 0x0, 0x0, 0x0)
      }
      return;

}
function sym.imp.printf () {
    //  1 basic blocks

    loc_0x460:

       //CALL XREF from main @ 0x777
       goto dword [ebx + 0xc]
(break)

}
function loc.imp._ITM_deregisterTMCloneTable () {
    //  3 basic blocks

    loc_0x0:

       if (var > 0) goto 0x47   //[28] ---- section size 252 named .shstrtab ; likely
       {
        loc_0x47:

           //CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 
           byte [eax] += ah
           dword [eax] += eax
           byte [eax + eax] += al
        loc_0x2:

           esp--
           esi++
           dword [ecx] += eax
           dword [eax] += eax
           //DATA XREF from sym.imp.__stack_chk_fail @ +0x6
           byte [eax] += al
           byte [eax] += al
           //CODE XREF from sym.imp.printf @ 0x460
           byte [eax] += al
           byte [eax] += al
           //CODE XREF from sym.imp.__stack_chk_fail @ 0x470
           //DATA XREF from sym.imp.puts @ +0x6
           eax += dword [eax]
           eax += dword [eax]
           //CODE XREF from sym.imp.puts @ 0x480
           dword [eax] += eax
           byte [eax] += al
           //CODE XREF from sym.imp.__libc_start_main @ 0x490
           //DATA XREF from sym.imp.__libc_start_main @ +0x6
           rol byte [eax + eax],0
           //CODE XREF from sym.imp.__isoc99_scanf @ 0x4a0
           al ^= 0
           byte [eax] += al
           //DATA XREF from section..rel.dyn @ +0x18
           //DATA XREF from sym.imp.__isoc99_scanf @ +0x6
           byte fs:[eax] = byte fs:[eax] - al
           byte [eax] += al
           byte [eax] += al
           byte [eax + eax] += dh
           byte [eax] &= al
           dword [eax] |= eax
           byte [eax] -= al
       ~   //DATA XREF from section..eh_frame @ +0x7b
       ~   eax = eax - 0x6001c00
           push es
           byte [eax] += al
           byte [eax + eax] += dh
           byte [eax] += al
           dword [eax] += eax
           byte [eax] += al
           al ^= 0
           byte [eax] += al
           byte [ecx] &= al
       ~   byte [eax] += al
           //CODE XREF from loc.imp._ITM_deregisterTMCloneTable @ 
           byte [eax] += ah
           dword [eax] += eax
           byte [eax + eax] += al
      }
      return;

}
function sym.imp.puts () {
    //  1 basic blocks

    loc_0x480:

       //CALL XREF from sym.check @ 0x6d4
       //CALL XREFS from main @ 0x72f, 0x741, 0x753, 0x765
       goto dword [ebx + 0x14]
(break)

}
function sym.imp.__isoc99_scanf () {
    //  1 basic blocks

    loc_0x4a0:

       //CALL XREF from main @ 0x78d
       goto dword [ebx + 0x1c]  //segment.PHDR
(break)

}
