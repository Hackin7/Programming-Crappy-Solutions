function sym.deregister_tm_clones () {
    //  4 basic blocks

    loc_0x1120:

       //CALL XREF from fcn.000011b4 @ 0x11ea
       sym.__x86.get_pc_thunk.dx ()
       edx += 0x2e9f            //obj._GLOBAL_OFFSET_TABLE
       ecx = dword [edx + 0x44] //obj.__TMC_END
       eax = dword [edx + 0x44] //obj.__TMC_END
       var = eax - ecx
       if (!var) goto 0x1158    //likely
       {
        loc_0x1158:

           //CODE XREFS from sym.deregister_tm_clones @ 0x1139, 0x1143
           return
        loc_0x113b:

           eax = dword [edx + 0x1c] //segment.PHDR
           var = eax & eax
           if (!var) goto 0x1158    //unlikely
      }
      return;

    loc_0x1145:

       push ebp
       ebp = esp
       esp -= 0x14
       push ecx
       eax ()                   //ecx(0x0, 0x0, 0x0, 0x0)
       esp += 0x10
       leave                    //ebp ; ebp
       return
(break)

}
function sym.__x86.get_pc_thunk.dx () {
    //  1 basic blocks

    loc_0x1209:

       //CALL XREF from sym.deregister_tm_clones @ 0x1120
       //CALL XREF from sym.register_tm_clones @ 0x1160
       edx = dword [esp]
       return
(break)

}
function sym.register_tm_clones () {
    //  4 basic blocks

    loc_0x1160:

       //CODE XREF from entry.init0 @ +0x4
       sym.__x86.get_pc_thunk.dx ()
       edx += 0x2e5f            //obj._GLOBAL_OFFSET_TABLE
       push ebp
       ebp = esp
       push ebx
       ecx = dword [edx + 0x44] //obj.__TMC_END
       eax = dword [edx + 0x44] //obj.__TMC_END
       esp -= 4
       eax -= ecx
       ebx = eax
       eax >>>= 0x1f
       ebx >>= 2
       eax += ebx
       eax >>= 1
       if (!var) goto 0x11a2    //likely
       {
        loc_0x11a2:

           //CODE XREFS from sym.register_tm_clones @ 0x118c, 0x1196
           ebx = dword [var_4h]     //ebp
           leave                    //ebp
           return
        loc_0x118e:

           edx = dword [edx + 0x38] //segment.PHDR
           var = edx & edx
           if (!var) goto 0x11a2    //unlikely
      }
      return;

    loc_0x1198:

       esp -= 8
       push eax
       push ecx
       edx ()                   //ecx(0x0, 0x0, 0x0, 0x0)
       esp += 0x10
}
function sym.__x86.get_pc_thunk.bx () {
    //  1 basic blocks

    loc_0x1110:

       //CALL XREF from section..init @ +0x8
       //CALL XREF from fcn.000011b4 @ 0x11b8
       //CALL XREF from fcn.00001211 @ 0x121b
       //CALL XREF from section..fini @ +0x8
       ebx = dword [esp]
       return
(break)

}
function sym.__x86.get_pc_thunk.bp () {
    //  1 basic blocks

    loc_0x1315:

       //CALL XREF from sym.__libc_csu_init @ +0x5
       ebp = dword [esp]
       return
(break)

}
function fcn.00001106 () {
    //  1 basic blocks

    loc_0x1106:

       //CALL XREF from entry0 @ +0xf
       ebx = dword [esp]
       return
(break)

}
function fcn.000011b4 () {
    //  5 basic blocks

    loc_0x11b4:

       push ebp
       ebp = esp
       push ebx
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x2e07            //obj._GLOBAL_OFFSET_TABLE
       esp -= 4
       var = byte [ebx + 0x44] - 0
       if (var) goto 0x11f6     //unlikely
       {
        loc_0x11f6:

           //CODE XREF from fcn.000011b4 @ 0x11cd
           ebx = dword [var_4h]     //ebp
           leave                    //ebp
           return
        loc_0x11cf:

           eax = dword [ebx + 0x24]
           var = eax & eax
           if (!var) goto 0x11ea    //likely
      }
      return;

    loc_0x11d9:

       esp -= 0xc
       push dword [ebx + 0x40]
                                //
       .got(0x0,                       esp += 0x10
   do
   {
        loc_0x11ea:

           //CODE XREF from fcn.000011b4 @ 0x11d7
           sym.deregister_tm_clones ()
           byte [ebx + 0x44] = 1
       } while (?);
  return;

}
function fcn.00001211 () {
    //  3 basic blocks

    loc_0x1211:

       push ebp
       ebp = esp
       push ebx
       esp -= 0x104
       sym.__x86.get_pc_thunk.bx ()
       ebx += 0x2da4            //obj._GLOBAL_OFFSET_TABLE
       eax = dword [ebx + 0x2c]
       eax = dword [eax]
       push 0
       push eax
                                                   
       void setbuf(?, NULL)
       esp += 8
       eax = dword [ebx + 0x30]
       eax = dword [eax]
       push 0
       push eax
                                                   
       void setbuf(?, NULL)
       esp += 8
       eax = dword [ebx + 0x20]
       eax = dword [eax]
       push 0
       push eax
                                                   
       void setbuf(?, NULL)
       esp += 8
       dword [var_8h] = 0x12345678
       eax = dword [var_108h]
       push eax
       char *gets("") 
                               //sym.imp.gets ()
       esp += 4
       var = dword [var_8h] - 0x1343d00
       if (var) goto 0x128d     //likely
       {
        loc_0x128d:

           //CODE XREF from fcn.00001211 @ 0x127c
           eax = 0
           ebx = dword [var_4h]     //ebp
           leave                    //ebp
           return
        loc_0x127e:

           eax = dword [ebx - 0x1fbc]
           push eax
                                                       
           int system("\xff\xff\xff\xff\xff\xff\xff\xff\xff\xff\xff")
           esp += 4                 //ebp
      }
      return;

}
