function main () {
    //  11 basic blocks

    loc_0xe75:

       //DATA XREF from entry0 @ 0x9dd
       push rbp
       push rbx
       rsp -= 0x78
       rbx = rsi                //argv
       rax = qword fs:[0x28]
       qword [var_68h] = rax
       eax = 0
       var = edi - 2            //argc
       if (!var) goto 0xebb     //unlikely
       {
        loc_0xebb:

           //CODE XREF from main @ 0xe91
           rdi = rsi                //argv
           fcn.00000dea ()          //fcn.00000dea(0x0)
           var = eax & eax
           if (var) goto 0xe93      //unlikely
        loc_0xec7:

           eax = 0
           fcn.00000aca ()
           var = eax & eax
           if (!var) goto 0xee4     //likely
           {
            loc_0xee4:

               //CODE XREFS from main @ 0xed3, 0xeff
               rdi = qword [s"[-] Complete all 3 fazes to successfully report back alive."//0x11a8 ; str.Complete_all_3_fazes_to_successfully_report_back_alive.] ; const char *s
                                                         
               int puts("[-] Complete a")
               goto 0xe9b
           do
           {
                loc_0xe9b:

                   //CODE XREFS from main @ 0xef0, 0xf82
                   eax = 0
                   rcx = qword [var_68h]
                   rcx ^= qword fs:[0x28]
                   if (var) goto 0xf87      //likely
               } while (?);
           } while (?);
           } while (?);
      }
      return;

}
