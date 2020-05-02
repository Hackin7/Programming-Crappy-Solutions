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
function sym.imp.puts () {
    //  1 basic blocks

    loc_0x8e0:

       //CALL XREFS from main @ 0xeeb, 0xf59
       goto qword [reloc.puts]  //[0x201f70:8]=0x8e6
(break)

}
function sym.imp.regfree () {
    //  1 basic blocks

    loc_0x8f0:

       //CALL XREF from fcn.00000dea @ 0xe3f
       goto qword [reloc.regfree] //[0x201f78:8]=0x8f6
(break)

}
function sym.imp.__stack_chk_fail () {
    //  1 basic blocks

    loc_0x900:

       //CALL XREF from fcn.00000aca @ 0xbee
       //CALL XREF from fcn.00000bf3 @ 0xcd8
       //CALL XREF from fcn.00000cdd @ 0xdc3
       //CALL XREF from main @ 0xf87
       goto qword [reloc.__stack_chk_fail] //[0x201f80:8]=0x906
(break)

}
function sym.imp.system () {
    //  1 basic blocks

    loc_0x910:

       //CALL XREF from main @ 0xf61
       goto qword [reloc.system] //[0x201f88:8]=0x916
(break)

}
function sym.imp.regcomp () {
    //  1 basic blocks

    loc_0x920:

       //CALL XREF from fcn.00000dea @ 0xe01
       goto qword [reloc.regcomp] //[0x201f90:8]=0x926 ; "&\t"
(break)

}
function loc.imp._ITM_deregisterTMCloneTable () {
    //  3 basic blocks

    loc_0x0:

       if (var > 0) goto 0x47   //[26] ---- section size 238 named .shstrtab ; likely
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
           byte [rax + 0x14] += bl
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           pop rax
           al += 0
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += ah
           byte [rax] += al
           byte [rax] += al
           byte [rcx] += al         //arg4
           byte [rax] += al
           byte [rsi] += al         //arg2
           byte [rax] += al
           byte [rax + 0x1d] += bl
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           pop rax
           eax = eax - 0x20
           byte [rax] += al
           pop rax
           eax = eax - 0x20
           byte [rax] += al
           eax = 0xc
           byte [rax] += al
           al += dl
           eax |= 0
           byte [rax] += al
           byte [rax] += al
           byte [rax] &= al
           byte [rax] += al
           byte [rax] += al
           al += byte [rax]         //"0+"
           byte [rax] += al
        loc_0x2:

           //DATA XREFS from segment.PHDR @ +0x1e0, +0x1e8
           //DATA XREF from sym.imp.__stack_chk_fail @ +0x6
           //DATA XREF from main @ 0xe8e
           r8b += byte [rcx]        //arg4
           //DATA XREF from sym.imp.__isoc99_sscanf @ +0x6
           dword [rax] += eax
           //DATA XREF from sym.imp.__strncpy_chk @ +0x6
           byte [rax] += al
           //DATA XREF from sym.imp.exit @ +0x6
           byte [rax] += al
           //DATA XREF from loc.imp._ITM_deregisterTMCloneTable @ 0x108
           //DATA XREF from sym.imp.__sprintf_chk @ +0x6
           al = al - 0
           byte [rax] += al
           eax += dword [rax]
           byte ds:[rcx] += al      //arg4
           byte [rax] += al
           al += al
           dword [rax] |= eax
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           //DATA XREF from section..eh_frame @ +0x6a
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           pop rax
           eax -= dword [rax]
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           byte [rax] += al
           //DATA XREFS from str.USAGE:___s__ip_addr_____ip_addr:__C2_server_s_IP_address____d_1_3___.__d_1_3___.__d_1_3___.__d_1_3____e.g._192.168.0.1____DESCRIPTION:____Report_alive_to_C2_server. @ +0x3a, +0x43, +0x4c, +0x55
           byte [rax] += al
           var = byte [rax] - al
           dword [rax] |= eax
           byte [rbx] += bl
           byte [rdx] += bl
           //DATA XREF from section..eh_frame @ +0x63
           invalid
      }
      return;

}
function sym.imp.fgets () {
    //  1 basic blocks

    loc_0x930:

       //CALL XREF from fcn.00000aca @ 0xb03
       //CALL XREF from fcn.00000bf3 @ 0xc2c
       //CALL XREF from fcn.00000cdd @ 0xd15
       goto qword [reloc.fgets] //[0x201f98:8]=0x936 ; "6\t"
(break)

}
function sym.imp.__isoc99_sscanf () {
    //  1 basic blocks

    loc_0x940:

       //CALL XREF from fcn.00000aca @ 0xb21
       //CALL XREF from fcn.00000bf3 @ 0xc4a
       //CALL XREF from fcn.00000cdd @ 0xd41
       //CALL XREF from main @ 0xf17
       goto qword [reloc.__isoc99_sscanf] //[0x201fa0:8]=0x946 ; "F\t"
(break)

}
function sym.imp.regexec () {
    //  1 basic blocks

    loc_0x950:

       //CALL XREF from fcn.00000dea @ 0xe2b
       goto qword [reloc.regexec] //[0x201fa8:8]=0x956 ; "V\t"
(break)

}
function sym.imp.__strncpy_chk () {
    //  1 basic blocks

    loc_0x960:

       //CALL XREF from fcn.00000bf3 @ 0xcba
       //CALL XREF from fcn.00000cdd @ 0xdb7
       goto qword [reloc.__strncpy_chk] //[0x201fb0:8]=0x966 ; "f\t"
(break)

}
function sym.imp.__printf_chk () {
    //  1 basic blocks

    loc_0x970:

       //CALL XREF from fcn.00000aca @ 0xaeb
       //CALL XREF from fcn.00000bf3 @ 0xc14
       //CALL XREF from fcn.00000cdd @ 0xcfd
       //CALL XREF from fcn.00000dc8 @ 0xde0
       //CALL XREF from main @ 0xf79
       goto qword [reloc.__printf_chk] //[0x201fb8:8]=0x976 ; "v\t"
(break)

}
function sym.imp.exit () {
    //  1 basic blocks

    loc_0x980:

       //CALL XREF from fcn.00000dea @ 0xe70
       goto qword [reloc.exit]  //[0x201fc0:8]=0x986
(break)

}
function sym.imp.fwrite () {
    //  1 basic blocks

    loc_0x990:

       //CALL XREF from fcn.00000dea @ 0xe66
       goto qword [reloc.fwrite] //[0x201fc8:8]=0x996
(break)

}
function sym.imp.__sprintf_chk () {
    //  1 basic blocks

    loc_0x9a0:

       //CALL XREF from main @ 0xf4d
       goto qword [reloc.__sprintf_chk] //[0x201fd0:8]=0x9a6
(break)

}
function entry.init0 () {
    //  5 basic blocks

    loc_0xa30:

       //CODE XREF from entry.init0 @ 0xac5
       rdi = qword [0x00202a10]
       rsi = qword [0x00202a10]
       push rbp
       rsi -= rdi
       rbp = rsp
       rsi >>= 3
       rax = rsi
       rax >>>= 0x3f
       rsi += rax
       rsi >>= 1
       if (!var) goto 0xa70     //likely
       {
        loc_0xa70:

           //CODE XREFS from entry.init0 @ 0xa56, 0xa62
           
           return
        loc_0xa58:

           rax = qword [reloc._ITM_registerTMCloneTable] //[0x201ff0:8]=0
           var = rax & rax
           if (!var) goto 0xa70     //likely
      }
      return;

    loc_0xa64:

       
       goto rax
(break)

}
function entry.fini0 () {
    //  5 basic blocks

    loc_0xa80:

       var = byte [0x00202a48] - 0 //[0x202a48:1]=0
       if (var) goto 0xab8      //unlikely
       {
        loc_0xab8:

           //CODE XREF from entry.fini0 @ 0xa87
           return
        loc_0xa89:

           var = qword [reloc.__cxa_finalize] - 0 //[0x201ff8:8]=0
           push rbp
           rbp = rsp
           if (!var) goto 0xaa3     //likely
      }
      return;

    loc_0xa97:

       rdi = qword [0x00202008] //[0x202008:8]=0x202008 ".  "
       section..plt.got ()      //section..plt.got(0x202008, 0x0, 0x0, 0x0)
   do
   {
        loc_0xaa3:

           //CODE XREF from entry.fini0 @ 0xa95
           fcn.000009f0 ()
           byte [0x00202a48] = 1    //[0x202a48:1]=0
                                    //rsp
           return
       } while (?);
  return;

}
function fcn.000009f0 () {
    //  4 basic blocks

    loc_0x9f0:

       //CALL XREF from entry.fini0 @ 0xaa3
       rdi = qword [0x00202a10]
       push rbp
       rax = qword [0x00202a10]
       var = rax - rdi
       rbp = rsp
       if (!var) goto 0xa20     //likely
       {
        loc_0xa20:

           //CODE XREFS from fcn.000009f0 @ 0xa05, 0xa11
           
           return
        loc_0xa07:

           rax = qword [reloc._ITM_deregisterTMCloneTable] //[0x201fd8:8]=0
           var = rax & rax
           if (!var) goto 0xa20     //likely
      }
      return;

    loc_0xa13:

       
       goto rax
(break)

}
function fcn.00000dc8 () {
    //  1 basic blocks

    loc_0xdc8:

       //CALL XREF from main @ 0xe96
       rsp -= 8
       rdx = qword [rdi]        //arg1
       rsi = qword ["USAGE:\n%s <ip_addr>\n\nip_addr:\tC2 server's IP address [\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}], e.g. 192.168.0.1\n\nDESCRIPTION:\n\tReport alive to C2 server.\n" //0x1098 ; str.USAGE:___s__ip_addr_____ip_addr:__C2_server_s_IP_address____d_1_3___.__d_1_3___.__d_1_3___.__d_1_3____e.g._192.168.0.1____DESCRIPTION:____Report_alive_to_C2_server.]
       edi = 1
       eax = 0
       sym.imp.__printf_chk ()
       rsp += 8
       return                   //rsp ; rsp
(break)

}
function fcn.000008b8 () {
    //  3 basic blocks

    loc_0x8b8:

       //CALL XREF from main @ +0x147
       rsp -= 8                 //[11] -r-x section size 23 named .init
       rax = qword [reloc.__gmon_start] //[0x201fe8:8]=0
       var = rax & rax
       if (!var) goto 0x8ca     //likely
       {
        loc_0x8ca:

           //CODE XREF from fcn.000008b8 @ 0x8c6
           rsp += 8
           return
        loc_0x8c8:

           rax ()                   //loc.imp._ITM_deregisterTMCloneTable(0x0, 0x0, 0x0)
      }
      return;

}
function fcn.00000dea () {
    //  3 basic blocks

    loc_0xdea:

       //CALL XREF from main @ 0xebe
       push rbx
       rbx = rdi                //arg1
       edx = 0
       rsi = qword [0x00202a00] //[0x202a00:8]=0x11e8 str.0_9____1_3_____._0_9____1_3_____._0_9____1_3_____._0_9____1_3 ; "^[0-9]\{1,3\}\.[0-9]\{1,3\}\.[0-9]\{1,3\}\.[0-9]\{1,3\}$" str.0_9____1_3_____._0_9____1_3_____._0_9____1_3_____._0_9____1_3
       rdi = qword [0x00202a60]
       sym.imp.regcomp ()
       dword [0x00202aa0] = eax //[0x202aa0:4]=0
       var = eax & eax
       if (var) goto 0xe4e      //unlikely
       {
        loc_0xe4e:

           //CODE XREF from fcn.00000dea @ 0xe0e
           rcx = qword [obj.stderr] //[0x202a40:8]=0 ; FILE *stream
           edx = 0x18               //size_t nitems
           esi = 1                  //size_t size
           rdi = qword ["Could not compile regex\n" //0x1068 ; str.Could_not_compile_regex] ; const void *ptr
                                                       
           size_t fwrite(0x6f6e20646c756f43, 0x02464c45, 0x000009c0, ?)
           edi = 1                  //int status
                                                     
           void exit(38161477)
        loc_0xe10:

           rsi = qword [rbx + 8]
           r8d = 0
           ecx = 0
           edx = 0
           rdi = qword [0x00202a60]
           sym.imp.regexec ()
           ebx = eax
           dword [0x00202aa0] = eax //[0x202aa0:4]=0
           rdi = qword [0x00202a60]
           sym.imp.regfree ()
           var = ebx & ebx
           al = ne
           eax = al
           pop rbx
           return                   //rsp
      }
      return;

}
function fcn.00000aca () {
    //  12 basic blocks

    loc_0xaca:

       //CALL XREF from main @ 0xecc
       push rbx
       rsp -= 0x70
       rax = qword fs:[0x28]
       qword [var_68h] = rax
       eax = 0
       rsi = qword ["Enter key for faze 1: " //0x1014 ; str.Enter_key_for_faze_1:]
       edi = 1
       sym.imp.__printf_chk ()
       rdx = qword [obj.stdin]  //[0x202a20:8]=0 ; FILE *stream
       esi = 0x64               //'d' ; int size
       rdi = qword [0x00202ac0] //char *s
                                                  
       char *fgets("", 0, ?)
       rbx = rsp
       rdx = rbx                //  ...
       rsi = qword [0x0000102b] //"%s" ; const char *format
       rdi = qword [0x00202ac0] //const char *s
       eax = 0
       int sscanf("", "%s", ?)   
                             //sym.imp.__isoc99_sscanf ()
       rcx = -1
       eax = 0
       rdi = rbx
       repne scasb al,byte [rdi]
       rbx = rcx
       rbx = !rbx
       byte [rsp + rbx - 1] = 0
       eax = word [0x002029e4]  //[0x2029e4:2]=255
       ecx = byte [rsp]
       edx = dword [rax - 0xb1]
       r10d = 0
       var = ecx - edx
       if (!var) goto 0xb7a     //unlikely
       {
        loc_0xb7a:

           //CODE XREF from fcn.00000aca @ 0xb5b
           var = byte [var_4h] - 0x25
           if (var) goto 0xb5d      //likely
        loc_0xb81:

           var = byte [var_5h] - 0
           if (var) goto 0xb5d      //unlikely
        loc_0xb88:

           ecx = byte [var_3h]
           edx = dword [rax - 0xb5]
           var = ecx - edx
           if (var) goto 0xb5d      //likely
        loc_0xb97:

           var = byte [var_1h] - 0x36
           if (var) goto 0xb5d      //likely
        loc_0xb9e:

           edx = byte [var_2h]
           eax -= 0xdc
           var = edx - eax
           r10b = e
           r10d = r10b
           goto 0xb5d
}
function fcn.00000bf3 () {
    //  6 basic blocks

    loc_0xbf3:

       //CALL XREF from main @ 0xeda
       push rbx
       rsp -= 0x70
       rax = qword fs:[0x28]
       qword [var_68h] = rax
       eax = 0
       rsi = qword ["Enter key for faze 2: " //0x102e ; str.Enter_key_for_faze_2:]
       edi = 1
       sym.imp.__printf_chk ()
       rdx = qword [obj.stdin]  //[0x202a20:8]=0 ; FILE *stream
       esi = 0x64               //'d' ; int size
       rdi = qword [0x00202ac0] //char *s
                                                  
       char *fgets("", 0, ?)
       rbx = rsp
       rdx = rbx                //  ...
       rsi = qword [0x0000102b] //"%s" ; const char *format
       rdi = qword [0x00202ac0] //const char *s
       eax = 0
       int sscanf("", "%s", ?)   
                             //sym.imp.__isoc99_sscanf ()
       rdx = -1
       eax = 0
       rcx = rdx
       rdi = rbx
       repne scasb al,byte [rdi]
       rcx = !rcx
       byte [rsp + rcx - 1] = 0
       rcx = rdx
       rdi = rbx
       repne scasb al,byte [rdi]
       rax = rcx
       rax = !rax
       rdx += rax
       rcx = rbx
       rdi = qword [rbx + rdx]
       ebx = 0
       goto 0xc93
   do
   {
        loc_0xc93:

           //CODE XREF from fcn.00000bf3 @ 0xc88
           var = rcx - rdi
           if (var) goto 0xc8a      //unlikely
       } while (?);
  return;

    loc_0xc98:

       rax = ebx
       rax = qword [rax + rax*4]
       rcx = qword [rax + rax*4]
       rax = qword ["HC,j."  //0x202020 ; str.HC_j.]
       rsi = qword [rax + rcx*2] //"HC,j." str.HC_j.
       ecx = 0xb
       rdi = qword [0x002029f5] //"ord1234567"
       sym.imp.__strncpy_chk ()
       eax = dword [rbx + 0x17]
       rsi = qword [var_68h]
       rsi ^= qword fs:[0x28]
       if (var) goto 0xcd8      //likely
       {
        loc_0xcd8:

           //CODE XREF from fcn.00000bf3 @ 0xcd0
           void __stack_chk_fail(void)
                                    //sym.imp.__stack_chk_fail ()
        loc_0xcd2:

           rsp += 0x70
           pop rbx
           return
      }
      return;

}
function fcn.00000cdd () {
    //  6 basic blocks

    loc_0xcdd:

       //CALL XREF from main @ 0xef7
       rsp -= 0x28
       rax = qword fs:[0x28]
       qword [var_18h] = rax
       eax = 0
       rsi = qword ["Enter key for faze 3: " //0x1045 ; str.Enter_key_for_faze_3:]
       edi = 1
       sym.imp.__printf_chk ()
       rdx = qword [obj.stdin]  //[0x202a20:8]=0 ; FILE *stream
       esi = 0x64               //'d' ; int size
       rdi = qword [0x00202ac0] //char *s
                                                  
       char *fgets("", 0, ?)
       rcx = qword [var_ch]
       rdx = qword [var_8h]
       r9 = qword [var_14h]
       r8 = qword [var_10h]
       rsi = qword ["%d %d %d %d" //0x105c ; str.d__d__d__d] ; const char *format
       rdi = qword [0x00202ac0] //const char *s
       eax = 0
                                                            
       int sscanf("", "%d %d %d %d", ?)
       eax = dword [var_8h]
       eax = dword [rax + rax*4]
       eax += eax
       dword [var_8h] = eax
       edx = dword [var_10h]
       ecx = dword [rdx + rdx*4]
       ecx += ecx
       dword [var_10h] = ecx
       eax += dword [var_ch]
       edx = eax
       eax = 0
       var = edx - 0xd
       if (!var) goto 0xd85     //unlikely
       {
        loc_0xd85:

           //CODE XREF from fcn.00000cdd @ 0xd6e
           ecx += dword [var_14h]
           var = ecx - 0x25
           if (var) goto 0xd70      //likely
        loc_0xd8e:

           rsi = qword ["MZjHU"  //0x20275a ; str.MZjHU]
           rcx = -1
           rdi = rsi                //"MZjHU" str.MZjHU
           repne scasb al,byte [rdi]
           rdx = rcx
           rdx = !rdx
           rdx = qword [rdx - 1]
           ecx = 6
           rdi = qword [0x002029fa] //"34567"
           sym.imp.__strncpy_chk ()
           eax = 1
           goto 0xd70
}
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
