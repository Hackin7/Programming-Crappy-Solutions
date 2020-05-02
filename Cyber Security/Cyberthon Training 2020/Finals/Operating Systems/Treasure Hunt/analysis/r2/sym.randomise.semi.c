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
