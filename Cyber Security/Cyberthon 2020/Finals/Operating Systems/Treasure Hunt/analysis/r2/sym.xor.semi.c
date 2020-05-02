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
