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
