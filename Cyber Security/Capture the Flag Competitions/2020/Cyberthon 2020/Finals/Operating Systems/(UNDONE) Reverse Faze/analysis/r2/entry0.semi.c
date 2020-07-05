function entry0 () {
    //  1 basic blocks

    loc_0x9c0:

       ebp = 0                  //[14] -r-x section size 1602 named .text
       r9 = rdx                 //arg3
       pop rsi
       rdx = rsp
       rsp &= 0xfffffffffffffff0
       push rax
       push rsp
       r8 = qword [0x00001000]
       rcx = qword [0x00000f90]
       rdi = qword [main]       //0xe75 ; "USH\x83\xecxH\x89\xf3dH\x8b\x04%("
       qword [reloc.__libc_start_main] () //[0x201fe0:8]=0
                                //int __libc_start_main(?, -1, ?, ?, ?, ?, -1)
(break)

}
