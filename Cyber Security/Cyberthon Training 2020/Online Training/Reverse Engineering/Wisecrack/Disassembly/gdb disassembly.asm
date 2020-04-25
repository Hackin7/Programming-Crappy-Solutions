;;; leveltwo
   0x00000940 <+0>: push   ebp
   0x00000941 <+1>: mov    ebp,esp
   0x00000943 <+3>: push   edi
   0x00000944 <+4>: push   esi
   0x00000945 <+5>: push   ebx
   0x00000946 <+6>: sub    esp,0x1c
   0x00000949 <+9>: push   0xba4
   0x0000094e <+14>:    call   0x94f <leveltwo+15>
   0x00000953 <+19>:    add    esp,0x4
   0x00000956 <+22>:    push   0xc3c
   0x0000095b <+27>:    call   0x95c <leveltwo+28>
   0x00000960 <+32>:    add    esp,0x4
   0x00000963 <+35>:    push   0xba4
   0x00000968 <+40>:    call   0x969 <leveltwo+41>
   0x0000096d <+45>:    add    esp,0x4
   0x00000970 <+48>:    push   0xc31
   0x00000975 <+53>:    call   0x976 <leveltwo+54>
   0x0000097a <+58>:    add    esp,0x4
   0x0000097d <+61>:    mov    eax,ds:0x0
   0x00000982 <+66>:    push   eax
   0x00000983 <+67>:    call   0x984 <leveltwo+68>
   0x00000988 <+72>:    add    esp,0x4
   0x0000098b <+75>:    lea    eax,[ebp-0x18]
   0x0000098e <+78>:    add    eax,0x7
   0x00000991 <+81>:    mov    DWORD PTR [ebp-0x28],eax
   0x00000994 <+84>:    lea    edi,[ebp-0x18]
   0x00000997 <+87>:    add    edi,0x6
   0x0000099a <+90>:    lea    esi,[ebp-0x18]
   0x0000099d <+93>:    add    esi,0x5
   0x000009a0 <+96>:    lea    ebx,[ebp-0x18]
   0x000009a3 <+99>:    add    ebx,0x4
   0x000009a6 <+102>:   lea    ecx,[ebp-0x18]
   0x000009a9 <+105>:   add    ecx,0x3
   0x000009ac <+108>:   lea    edx,[ebp-0x18]
   0x000009af <+111>:   add    edx,0x2
   0x000009b2 <+114>:   lea    eax,[ebp-0x18]
   0x000009b5 <+117>:   add    eax,0x1
   0x000009b8 <+120>:   push   DWORD PTR [ebp-0x28]
   0x000009bb <+123>:   push   edi
   0x000009bc <+124>:   push   esi
   0x000009bd <+125>:   push   ebx
   0x000009be <+126>:   push   ecx
   0x000009bf <+127>:   push   edx
   0x000009c0 <+128>:   push   eax
   0x000009c1 <+129>:   lea    eax,[ebp-0x18]
   0x000009c4 <+132>:   push   eax
   0x000009c5 <+133>:   push   0xc81
   0x000009ca <+138>:   call   0x9cb <leveltwo+139>
   0x000009cf <+143>:   add    esp,0x24
   0x000009d2 <+146>:   mov    DWORD PTR [ebp-0x10],0x0
   0x000009d9 <+153>:   jmp    0xa01 <leveltwo+193>
   0x000009db <+155>:   lea    edx,[ebp-0x18]
   0x000009de <+158>:   mov    eax,DWORD PTR [ebp-0x10]
   0x000009e1 <+161>:   add    eax,edx
   0x000009e3 <+163>:   movzx  eax,BYTE PTR [eax]
   0x000009e6 <+166>:   movsx  eax,al
   0x000009e9 <+169>:   and    eax,0xf
   0x000009ec <+172>:   movzx  eax,BYTE PTR [eax+0x2008]
   0x000009f3 <+179>:   lea    ecx,[ebp-0x21]
   0x000009f6 <+182>:   mov    edx,DWORD PTR [ebp-0x10]
   0x000009f9 <+185>:   add    edx,ecx
   0x000009fb <+187>:   mov    BYTE PTR [edx],al
   0x000009fd <+189>:   add    DWORD PTR [ebp-0x10],0x1
   0x00000a01 <+193>:   cmp    DWORD PTR [ebp-0x10],0x7
   0x00000a05 <+197>:   jle    0x9db <leveltwo+155>
   0x00000a07 <+199>:   mov    BYTE PTR [ebp-0x19],0x0
   0x00000a0b <+203>:   push   0xc92
   0x00000a10 <+208>:   lea    eax,[ebp-0x21]
   0x00000a13 <+211>:   push   eax
   0x00000a14 <+212>:   call   0xa15 <leveltwo+213>
   0x00000a19 <+217>:   add    esp,0x8
   0x00000a1c <+220>:   test   eax,eax
   0x00000a1e <+222>:   je     0xa27 <leveltwo+231>
   0x00000a20 <+224>:   mov    eax,0x0
   0x00000a25 <+229>:   jmp    0xa2c <leveltwo+236>
   0x00000a27 <+231>:   mov    eax,0x1
   0x00000a2c <+236>:   lea    esp,[ebp-0xc]
   0x00000a2f <+239>:   pop    ebx
   0x00000a30 <+240>:   pop    esi
   0x00000a31 <+241>:   pop    edi
   0x00000a32 <+242>:   pop    ebp
   0x00000a33 <+243>:   ret    
