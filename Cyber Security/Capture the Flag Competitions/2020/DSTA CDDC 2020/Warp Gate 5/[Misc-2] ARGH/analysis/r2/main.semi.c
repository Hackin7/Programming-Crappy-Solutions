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
