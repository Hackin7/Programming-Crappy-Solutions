function entry0 () {
    //  1 basic blocks

    loc_0x680:

       ebp = 0                  //[14] -r-x section size 802 named .text
       r9 = rdx                 //arg3
       pop rsi
       rdx = rsp
       rsp &= 0xfffffffffffffff0
       push rax
       push rsp
       r8 = qword [sym.__libc_csu_fini] //0x9a0
       rcx = qword [sym.__libc_csu_init] ; 0x930 ; "AWAVI\x89\xd7AUATL\x8d%V\x04 "
       rdi = qword [main]       //sym.main
                                //0x78a
       qword [reloc.__libc_start_main] () //[0x200fe0:8]=0
                                //int __libc_start_main(?, -1, ?, ?, ?, ?, -1)
(break)

}
function sym.deregister_tm_clones () {
    //  4 basic blocks

    loc_0x6b0:

       //CALL XREF from entry.fini0 @ 0x763
       rdi = qword [obj.completed.7698] //obj.__TMC_END
                                //0x201010
       push rbp
       rax = qword [obj.completed.7698] //obj.__TMC_END
                                //0x201010
       var = rax - rdi
       rbp = rsp
       if (!var) goto 0x6e0     //likely
       {
        loc_0x6e0:

           //CODE XREFS from sym.deregister_tm_clones @ 0x6c5, 0x6d1
           
           return
        loc_0x6c7:

           rax = qword [reloc._ITM_deregisterTMCloneTable] //[0x200fd8:8]=0
           var = rax & rax
           if (!var) goto 0x6e0     //likely
      }
      return;

    loc_0x6d3:

       
       goto rax
(break)

}
function sym.register_tm_clones () {
    //  4 basic blocks

    loc_0x6f0:

       //CODE XREF from entry.init0 @ 0x785
       rdi = qword [obj.completed.7698] //obj.__TMC_END
                                //0x201010
       rsi = qword [obj.completed.7698] //obj.__TMC_END
                                //0x201010
       push rbp
       rsi -= rdi
       rbp = rsp
       rsi >>= 3
       rax = rsi
       rax >>>= 0x3f
       rsi += rax
       rsi >>= 1
       if (!var) goto 0x730     //likely
       {
        loc_0x730:

           //CODE XREFS from sym.register_tm_clones @ 0x716, 0x722
           
           return
        loc_0x718:

           rax = qword [reloc._ITM_registerTMCloneTable] //[0x200ff0:8]=0
           var = rax & rax
           if (!var) goto 0x730     //likely
      }
      return;

    loc_0x724:

       
       goto rax
(break)

}
function entry.fini0 () {
    //  5 basic blocks

    loc_0x740:

       var = byte [obj.completed.7698] - 0 //obj.__TMC_END
                                //[0x201010:1]=0
       if (var) goto 0x778      //unlikely
       {
        loc_0x778:

           //CODE XREF from entry.fini0 @ 0x747
           return
        loc_0x749:

           var = qword [reloc.__cxa_finalize] - 0 //[0x200ff8:8]=0
           push rbp
           rbp = rsp
           if (!var) goto 0x763     //likely
      }
      return;

    loc_0x757:

       rdi = qword [obj.__dso_handle] //[0x201008:8]=0x201008 obj.__dso_handle
       sym..plt.got ()          //sym..plt.got(0x201008, 0x0, 0x0, 0x0)
   do
   {
        loc_0x763:

           //CODE XREF from entry.fini0 @ 0x755
           sym.deregister_tm_clones ()
           byte [obj.completed.7698] = 1 //obj.__TMC_END
                                    //[0x201010:1]=0
                                    //rsp
           return
       } while (?);
  return;

}
function entry.init0 () {
    //  1 basic blocks

    loc_0x780:

       push rbp
       rbp = rsp
                                //rsp ; rsp
       goto sym.register_tm_clones
  // chop

   do
   {
        loc_0x6f0:

           //CODE XREF from entry.init0 @ 0x785
           rdi = qword [obj.completed.7698] //obj.__TMC_END
                                    //0x201010
           rsi = qword [obj.completed.7698] //obj.__TMC_END
                                    //0x201010
           push rbp
           rsi -= rdi
           rbp = rsp
           rsi >>= 3
           rax = rsi
           rax >>>= 0x3f
           rsi += rax
           rsi >>= 1
           if (!var) goto 0x730     //likely
       } while (?);
  return;

    loc_0x718:

       rax = qword [reloc._ITM_registerTMCloneTable] //[0x200ff0:8]=0
       var = rax & rax
       if (!var) goto 0x730     //likely
  // chop

       {
        loc_0x730:

           //CODE XREFS from sym.register_tm_clones @ 0x716, 0x722
           
           return
        loc_0x724:

           
           goto rax
      }
      return;

}
function sym.__libc_csu_fini () {
    //  1 basic blocks

    loc_0x9a0:

       //DATA XREF from entry0 @ 0x68f
       return
(break)

}
function sym._fini () {
    //  1 basic blocks

    loc_0x9a4:

       rsp -= 8                 //[15] -r-x section size 9 named .fini
       rsp += 8
       return
(break)

}
function sym.__libc_csu_init () {
    //  4 basic blocks

    loc_0x930:

       //DATA XREF from entry0 @ 0x696
       push r15
       push r14
       r15 = rdx                //arg3
       push r13
       push r12
       r12 = qword [obj.__frame_dummy_init_array_entry] //loc.__init_array_start
                                //0x200d98
       push rbp
       rbp = qword [obj.__do_global_dtors_aux_fini_array_entry] //loc.__init_array_end
                                //0x200da0 ; "@\a"
       push rbx
       r13d = edi               //arg1
       r14 = rsi                //arg2
       rbp -= r12
       rsp -= 8
       rbp >>= 3
       sym._init ()
       var = rbp & rbp
       if (!var) goto 0x986     //unlikely
       {
        loc_0x986:

           //CODE XREF from sym.__libc_csu_init @ 0x964
           rsp += 8
           pop rbx
           
           pop r12
           pop r13
           pop r14
           pop r15
           return
        loc_0x966:

           ebx = 0
           
      }
      return;

}
function main () {
    //  13 basic blocks

    loc_0x78a:

       //DATA XREF from entry0 @ 0x69d
       push rbp
       rbp = rsp
       push rbx
       rsp -= 0xb8
       dword [var_b4h] = edi    //argc
       qword [src] = rsi        //argv
       rax = qword fs:[0x28]
       qword [canary] = rax
       eax = 0
       var = dword [var_b4h] - 1
       if (var > 0) goto 0x7d1  //unlikely
       {
        loc_0x7d1:

           //CODE XREF from main @ 0x7b9
           var = dword [var_b4h] - 2
           if (var <= 0) goto 0x7f0 //likely
           {
            loc_0x7f0:

               //CODE XREF from main @ 0x7d8
               rax = qword [src]
               rax += 8
               rax = qword [rax]
               rdi = rax                //const char *s
               size_t strlen(-1)
                                        //sym.imp.strlen ()
               dword [var_a4h] = eax
               var = dword [var_a4h] - 0x21
               if (!var) goto 0x82b     //unlikely
               {
                loc_0x82b:

                   //CODE XREF from main @ 0x813
                   rax = qword [src]
                   rax += 8
                   rdx = qword [rax]
                   rax = qword [dest]
                   rsi = rdx                //const char *src
                   rdi = rax                //char *dest
                                                               
                   char *strcpy("", -1)
                   movabs rax,0x1486a6a24761e04
                   movabs rdx,0x14113d20103c5f74
                   qword [s] = rax
                   qword [var_38h] = rdx
                   movabs rax,0x132f4a0b13060c69
                   movabs rdx,0x3b054679631a6205
                   qword [var_30h] = rax
                   qword [var_28h] = rdx
                   word [var_20h] = 0x3c    //'<'
                   dword [var_a8h] = 0
                   goto 0x8d1
               do
               {
                    loc_0x8d1:

                       //CODE XREF from main @ 0x890
                       eax = dword [var_a8h]
                       rbx = eax
                       rax = qword [s]
                       rdi = rax                //const char *s
                                                                   
                       size_t strlen("\x04\x1ev$jjH\x01t_<\x10 =\x11\x14i\f\x06\x13\vJ/\x13\x05b")
                       var = rbx - rax
                       if (((unsigned) var) < 0) goto 0x892 //likely
                   } while (?);
               } while (?);
               } while (?);
           } while (?);
      }
      return;

}
function sym._init () {
    //  3 basic blocks

    loc_0x5f0:

       //CALL XREF from sym.__libc_csu_init @ 0x95c
       rsp -= 8                 //[11] -r-x section size 23 named .init
       rax = qword [reloc.__gmon_start] //[0x200fe8:8]=0
       var = rax & rax
       if (!var) goto 0x602     //likely
       {
        loc_0x602:

           //CODE XREF from sym._init @ 0x5fe
           rsp += 8
           return
        loc_0x600:

           rax ()                   //loc.imp._ITM_deregisterTMCloneTable(0x0, 0x0, 0x0)
      }
      return;

}
function sym.imp.strcpy () {
    //  1 basic blocks

    loc_0x620:

       //CALL XREF from main @ 0x843
       goto qword [reloc.strcpy] //[0x200fb0:8]=0x626 ; "&\x06"
(break)

}
function sym.imp.puts () {
    //  1 basic blocks

    loc_0x630:

       //CALL XREFS from main @ 0x7c2, 0x7e1, 0x81c
       goto qword [reloc.puts]  //[0x200fb8:8]=0x636 ; "6\x06"
(break)

}
function sym.imp.strlen () {
    //  1 basic blocks

    loc_0x640:

       //CALL XREFS from main @ 0x801, 0x8e1
       goto qword [reloc.strlen] //[0x200fc0:8]=0x646 ; "F\x06"
(break)

}
function sym.imp.__stack_chk_fail () {
    //  1 basic blocks

    loc_0x650:

       //CALL XREF from main @ 0x91a
       goto qword [reloc.__stack_chk_fail] //[0x200fc8:8]=0x656 ; "V\x06"
(break)

}
function sym.imp.printf () {
    //  1 basic blocks

    loc_0x660:

       //CALL XREF from main @ 0x901
       goto qword [reloc.printf] //[0x200fd0:8]=0x666 ; "f\x06"
(break)

}
function loc.imp._ITM_deregisterTMCloneTable () {
    //  6 basic blocks

    loc_0x0:

       //CALL XREF from sym.__libc_csu_init @ 0x979
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
       do
       {
            loc_0x61:

               dword [rax] += eax
               byte [rax] += al
               byte [rax] += al
               al += bh
               dword [rax] += eax
               byte [rax] += al
               byte [rax] += al
               byte [rax] += cl
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               byte [rbx] += al
               byte [rax] += al
               byte [rax + rax] += al
               byte [rax] += al
               var = byte [rdx] - al    //arg3
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               var = byte [rdx] - al    //arg3
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               var = byte [rdx] - al    //arg3
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               al = al - 0
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               al = al - 0
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               dword [rax] += eax
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               dword [rax] += eax
               byte [rax] += al
               eax += 0
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
               byte [rax + 0xb] += dh
               byte [rax] += al
               byte [rax] += al
               byte [rax] += al
               jo 0xe5                  //unlikely
           } while (?);
       } while (?);
      }
      return;

}
