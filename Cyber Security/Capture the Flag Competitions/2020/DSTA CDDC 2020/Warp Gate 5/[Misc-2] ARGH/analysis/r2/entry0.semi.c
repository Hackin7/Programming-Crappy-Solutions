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
