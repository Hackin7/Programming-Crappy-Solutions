function main () {
    //  8 basic blocks

    loc_0x7fd:

       push ebp
       ebp = esp
       eax = dword [0]          //RELOC 32  @ 0x000006c0 + 0x0
       push 0
       push 2                   //char **envp
       push 0                   //char **argv
       push eax                 //int argc
       0x80d ()                 //RELOC 32 setvbuf; 0x80d(0x464c457f, 0x0, 0x0, 0x0)
       esp += 0x10
       eax = dword [0]          //RELOC 32  @ 0x00000630 + 0x0
       push 0
       push 2                   //char **envp
       push 0                   //char **argv
       push eax                 //int argc
       0x821 ()                 //RELOC 32 setvbuf; 0x821(0x464c457f, 0x0, 0x0, 0x0)
       esp += 0x10
                           .levelo                      eax ^= 1
       var = al & al
       if (!var) goto 0x83b     //unlikely
       {
        loc_0x83b:

           //CODE XREF from main (0x832)
           sym.leveltwo ()
           eax ^= 1
           var = al & al
           if (!var) goto 0x84e     //unlikely
           {
            loc_0x84e:

               //CODE XREF from main (0x845)
                                     .leve                                eax ^= 1
               var = al & al
               if (!var) goto 0x861     //unlikely
               {
                loc_0x861:

                   //CODE XREF from main (0x858)
                   push str.CTFSG__REDACTED //0xb90 ; "CTFSG{<REDACTED>}"; RELOC 32  ;"CTFSG{<REDACTED>}"; RELOC 32  ; int argc ; (pstr 0x00000b90) "CTFSG{<REDACTED>}"             //RELOC 32 puts; 0x867(0x0, 0x0, 0x0, 0x0)
                   esp += 4                 //(pstr 0x00000b90) "CTFSG{<REDACTED>}"
                   eax = dword [0]          //RELOC 32  @ 0x00000630 + 0x0
                   push eax                 //int argc
                   0x875 ()                 //RELOC 32 fflush; 0x875(0x464c457f, 0x0, 0x0, 0x0)
                   esp += 4
                   eax = 0
               do
               {
                    loc_0x881:

                       //CODE XREFS from main (0x839, 0x84c, 0x85f)
                       leave                    //ebp
                       return
                   } while (?);
               } while (?);
               } while (?);
           } while (?);
      }
      return;

}


function sym.levelone () {
    //  7 basic blocks

    loc_0x883:

       //CALL XREF from main (0x828)
       push ebp
       ebp = esp
       esp -= 0x2c              //','
       dword [local_18h] = 0xe48ca057
       dword [local_14h] = 0x6c77c87b
       dword [local_10h] = 0x536f83af
       dword [local_ch] = 0x1201c743
       eax = dword [local_29h]
       dword [local_8h] = eax
       push str.                //0xba4 ; "===================================================================="; RELOC 32  ; (pstr 0x00000ba4) "=============================="===================================================================="//RELOC 32  ; (pstr 0x00000ba4) "===============================================================""; 0x8b1(0x177fd3, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000ba4) "==============================================================="
       push str.LEVEL_01        //0xbec ; "                          LEVEL 01                                  "; RELOC 32  ; (pstr 0x00000bec) "                      "                          LEVEL 01                                  "//RELOC 32  ; (pstr 0x00000bec) "                          LEVEL 01                             "========"; 0x8be(0x177fd3, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000bec) "                          LEVEL 01                             "
       push str.                //0xba4 ; "===================================================================="; RELOC 32  ; (pstr 0x00000ba4) "=============================="===================================================================="//RELOC 32  ; (pstr 0x00000ba4) "==============================================================="      ; (pstr 0x00000ba4) "==============================================================="
       push 0xc31               //RELOC 32  ; (pstr 0x00000c31) "=> "
       0x8d8 ()                 //RELOC 32 printf; 0x8d8(0x177fd3, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000c31) "=> "
       eax = dword [0]          //RELOC 32  @ 0x00000630 + 0x0
       push eax
       0x8e6 ()                 //RELOC 32 fflush; 0x8e6(0x464c457f, 0x0, 0x0, 0x0)
       esp += 4
       eax = dword [local_29h]
       push eax
       push str.16s             //0xc35 ; "%16s";"%16s"; RELOC 32  ; (pstr 0x00000c35) "%16s" 0x8f7 ()                 //RELOC 32 __isoc99_scanf; 0x8f7(0x177fd3, 0x0, 0x0, 0x0)
       esp += 8
       dword [local_4h] = 0
       goto 0x933
   do
   {
        loc_0x933:

           //CODE XREF from sym.levelone (0x905)
           var = dword [local_4h] - 3
           if (var <= 0) goto 0x907 //unlikely
       } while (?);
  return;

    loc_0x939:

       eax = 1
   do
   {
        loc_0x93e:

           //CODE XREF from sym.levelone (0x92d)
           leave                    //ebp
           return
       } while (?);
  return;

}

function sym.leveltwo () {
    //  7 basic blocks

    loc_0x940:

       //CALL XREF from main (0x83b)
       push ebp
       ebp = esp
       push edi
       push esi
       push ebx
       esp -= 0x1c
       push str.                //0xba4 ; "===================================================================="; RELOC 32  ; (pstr 0x00000ba4) "=============================="===================================================================="//RELOC 32  ; (pstr 0x00000ba4) "===============================================================""; 0x94f(0x0, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000ba4) "==============================================================="
       push str.LEVEL_02        //0xc3c ; "                          LEVEL 02                                  "; RELOC 32  ; (pstr 0x00000c3c) "                      "                          LEVEL 02                                  "//RELOC 32  ; (pstr 0x00000c3c) "                          LEVEL 02                             "        "; 0x95c(0x0, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000c3c) "                          LEVEL 02                             "
       push str.                //0xba4 ; "===================================================================="; RELOC 32  ; (pstr 0x00000ba4) "=============================="===================================================================="//RELOC 32  ; (pstr 0x00000ba4) "===============================================================""; 0x969(0x0, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000ba4) "==============================================================="
       push 0xc31               //RELOC 32  ; (pstr 0x00000c31) "=> "
       0x976 ()                 //RELOC 32 printf ; (pstr 0x00000c31) "=> "; 0x976(0x0, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000c31) "=> "
       eax = dword [0]          //RELOC 32  @ 0x00000630 + 0x0
       push eax
       0x984 ()                 //RELOC 32 fflush; 0x984(0x464c457f, 0x0, 0x0, 0x0)
       esp += 4
       eax = dword [local_18h]
       eax += 7
       dword [local_28h] = eax
       edi = dword [local_18h]
       edi += 6
       esi = dword [local_18h]
       esi += 5
       ebx = dword [local_18h]
       ebx += 4
       ecx = dword [local_18h]
       ecx += 3
       edx = dword [local_18h]
       edx += 2
       eax = dword [local_18h]
       eax += 1
       push dword [local_28h]
       push edi
       push esi
       push ebx
       push ecx
       push edx
       push eax
       eax = dword [local_18h]
       push eax
       push str.c_c_c_c_c_c_c_c //0xc81 ; "%c%c%c%c%c%c%c%c";"%c%c%c%c%c%c%c%c"; RELOC 32  ; (pstr 0x00000c81) "%c%c%c%c%c%c%c%c"              //RELOC 32 __isoc99_scanf; 0x9cb(0x177fe4, 0x177fe8, 0x177fe7, 0x177fe6)
       esp += 0x24              //'$'
       dword [local_10h] = 0
       goto 0xa01
   do
   {
        loc_0xa01:

           //CODE XREF from sym.leveltwo (0x9d9)
           var = dword [local_10h] - 7
           if (var <= 0) goto 0x9db //likely
       } while (?);
  return;

    loc_0xa07:

       byte [local_19h] = 0
       push str.dynamite        //0xc92 ; "dynamite""dynamite"; RELOC 32  ; (pstr 0x00000c92) "dynamite"x = dword [local_21h]
       push eax
       0xa15 ()                 //RELOC 32 strcmp; 0xa15(0x177fdf, 0x0, 0x0, 0x0)
       esp += 8                 //(pstr 0x00000c92) "dynamite"
       var = eax & eax
       if (!var) goto 0xa27     //unlikely
       {
        loc_0xa27:

           //CODE XREF from sym.leveltwo (0xa1e)
           eax = 1
       do
       {
            loc_0xa2c:

               //CODE XREF from sym.leveltwo (0xa25)
               esp = dword [local_ch]
               pop ebx
               pop esi                  //(pstr 0x00000c92) "dynamite"
               pop edi                  //"dynamite" str.dynamite ; ebp
                   
               return
           } while (?);
       } while (?);
      }
      return;

}

function sym.levelthree () {
    //  7 basic blocks

    loc_0xa34:

       //CALL XREF from main (0x84e)
       push ebp
       ebp = esp
       esp -= 0x2c              //','
       dword [local_2ch] = 7
       dword [local_24h] = 2
       dword [local_1ch] = 9
       dword [local_14h] = 2
       dword [local_ch] = 6
       push str.                //0xba4 ; "===================================================================="; RELOC 32  ; (pstr 0x00000ba4) "=============================="===================================================================="//RELOC 32  ; (pstr 0x00000ba4) "==============================================================="==========================================================="
       push str.LEVEL_03        //0xc9c ; "                          LEVEL 03                                  "; RELOC 32  ; (pstr 0x00000c9c) "                      "                          LEVEL 03                                  "//RELOC 32  ; (pstr 0x00000c9c) "                          LEVEL 03                             "c) "                          LEVEL 03                             "
       push str.                //0xba4 ; "===================================================================="; RELOC 32  ; (pstr 0x00000ba4) "=============================="===================================================================="//RELOC 32  ; (pstr 0x00000ba4) "==============================================================="==========================================================="
       push 0xc31               //RELOC 32  ; (pstr 0x00000c31) "=> "
       0xa8a ()                 //RELOC 32 printf; 0xa8a(0x0, 0x0, 0x0, 0x0)
       esp += 4                 //(pstr 0x00000c31) "=> "
       eax = dword [0]          //RELOC 32  @ 0x00000630 + 0x0
       push eax
       0xa98 ()                 //RELOC 32 fflush; 0xa98(0x464c457f, 0x0, 0x0, 0x0)
       esp += 4
       eax = dword [local_2ch]
       eax += 4
       push eax
       eax = dword [local_2ch]
       eax += 0xc
       push eax
       eax = dword [local_2ch]
       eax += 0x14
       push eax
       eax = dword [local_2ch]
       eax += 0x1c
       push eax
       eax = dword [local_2ch]
       eax += 0x24              //'$'
       push eax
       push str.d__d__d__d__d   //0xce1 ; "%d %d %d %d %d";"%d %d %d %d %d"; RELOC 32  ; (pstr 0x00000ce1) "%d %d %d %d %d"                //RELOC 32 __isoc99_scanf; 0xac8(0x177ff4, 0x0, 0x0, 0x0)
       esp += 0x18
       dword [local_4h] = 0
       goto 0xaf8
   do
   {
        loc_0xaf8:

           //CODE XREF from sym.levelthree (0xad6)
           var = dword [local_4h] - 4
           if (var <= 0) goto 0xad8 //unlikely
       } while (?);
  return;

    loc_0xafe:

       eax = 1
   do
   {
        loc_0xb03:

           //CODE XREF from sym.levelthree (0xaf2)
           leave                    //ebp
           return
       } while (?);
  return;

}
