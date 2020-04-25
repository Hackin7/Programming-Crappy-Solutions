# Wisecrack

500 points, Reverse Engineering, 4 Solves as of Solving

## Description
Time to put your reverse engineering skills to the test! Figure out the correct input for 3 consecutive levels to get the flag. Feel free to use both static and dynamic analysis. We strongly recommend that you don't use a decompiler such as Ghidra to get more value out of this exercise.

Interact with the service at: challenges.csdc20t.ctf.sg:10025

## Useful tools:
IDA Freeware

## Attached files
wisecrack

# Solution
Using ltrace, strace, objdump -TR, nothing much was discovered. (The flag is in plain text)

From radare semi-decompilation, we know the following functions are used
1. fflush()
2. printf
3. scanf
4. strcmp (**Can check here** )
5. .... Typical functions

A combination of gdb for dynamic analysis, objdump to get the disassembly (Check the `disassembly annotated.asm` for the annotated disassembly), and radare's semi decompilation were used to analyse the functions as in below.

 ### gdb useful breakpoints
 Make sure to remove the comments
```
break *0x56555830 # For level 1 function call
break *0x5655583b #For level 2 function call
```

## Level One
```
00000883 <levelone>: ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 883:   55                      push   ebp
 884:   89 e5                   mov    ebp,esp
 886:   83 ec 2c                sub    esp,0x2c
 
 ;;; Array indexes: Let it be A[] ;;;;;;;;;;;;;
 889:   c7 45 e8 57 a0 8c e4    mov    DWORD PTR [ebp-0x18],0xe48ca057  ;24
 890:   c7 45 ec 7b c8 77 6c    mov    DWORD PTR [ebp-0x14],0x6c77c87b  ;20
 897:   c7 45 f0 af 83 6f 53    mov    DWORD PTR [ebp-0x10],0x536f83af  ;16
 89e:   c7 45 f4 43 c7 01 12    mov    DWORD PTR [ebp-0xc],0x1201c743   ;12
```
 
 ```
  ;;; Comparison Loop ;;;;;;;;;;;;;;;;;;;;;;;
 8fe:   c7 45 fc 00 00 00 00    mov    DWORD PTR [ebp-0x4],0x0 ;;Count from 9
 905:   eb 2c                   jmp    933 <levelone+0xb0> ;;Loop;;;;;;;;;;;;;;;;;;;;;;;;
 
 907:   b8 03 00 00 00          mov    eax,0x3
 90c:   2b 45 fc                sub    eax,DWORD PTR [ebp-0x4]          ;;eax = 3-i
 90f:   8b 54 85 e8             mov    edx,DWORD PTR [ebp-0x18+eax*4]   ;;A[3-i]
 
 913:   8b 45 fc                mov    eax,DWORD PTR [ebp-0x4]          ;;eax=i
 916:   8d 0c 85 00 00 00 00    lea    ecx,[eax*4+0x0]                  ;;Get current positon
 91d:   8b 45 f8                mov    eax,DWORD PTR [ebp-0x8]          ;;Array I think
 920:   01 c8                   add    eax,ecx
 922:   8b 00                   mov    eax,DWORD PTR [eax] 
 
 924:   39 c2                   cmp    edx,eax ;;A[3-i] == B[i]
 926:   74 07                   je     92f <levelone+0xac> ;;Condition needed to pass
 
 928:   b8 00 00 00 00          mov    eax,0x0 ;;;;FAILED;;;;;;;;;;;;;
 92d:   eb 0f                   jmp    93e <levelone+0xbb> ;;;;;;;;;;;
 
 92f:   83 45 fc 01             add    DWORD PTR [ebp-0x4],0x1 ;;Increment counter by 1
 933:   83 7d fc 03             cmp    DWORD PTR [ebp-0x4],0x3 ;;Condition
 937:   7e ce                   jle    907 <levelone+0x84> ;;;;For Loop;;;;;;;;;;;;;;;;;;;;;;
 
 ;; Win ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 939:   b8 01 00 00 00          mov    eax,0x1
 93e:   c9                      leave  
 93f:   c3                      ret    
```

Just looking at this code, they are comparing the string values with the hex values. so all you have to do is to inject a string with the appropriate values. Make sure to do it in little endian.

For level 1, this works
```
(printf '\x43\xc7\x01\x12\xaf\x83\x6f\x53\x7b\xc8\x77\x6c\x57\xa0\x8c\xe4' && cat) | ./wisecrack
```

## Level Two
```
 9c1:   8d 45 e8                lea    eax,[ebp-0x18] ;Let [ebp-0x18] be A
 9c4:   50                      push   eax
 9c5:   68 81 0c 00 00          push   0xc81
 9ca:   e8 fc ff ff ff          call   9cb <leveltwo+0x8b>  ;Scanf into A
 9cf:   83 c4 24                add    esp,0x24
 9d2:   c7 45 f0 00 00 00 00    mov    DWORD PTR [ebp-0x10],0x0 ;i=0
 
 ;;; Loop ;;;;;;;;;;;;;;;;;;;;;;
 9d9:   eb 26                   jmp    a01 <leveltwo+0xc1>
 
 9db:   8d 55 e8                lea    edx,[ebp-0x18] ;A
 9de:   8b 45 f0                mov    eax,DWORD PTR [ebp-0x10];A
 9e1:   01 d0                   add    eax,edx ;A+i
 9e3:   0f b6 00                movzx  eax,BYTE PTR [eax]               ;; Get A[i]
 
 9e6:   0f be c0                movsx  eax,al
 9e9:   83 e0 0f                and    eax,0xf                          ;; A[i] & 0xf = A[i] % 16
 9ec:   0f b6 80 08 20 00 00    movzx  eax,BYTE PTR [eax+0x2008]        ;;GDB says eax+0x56557008
 
 9f3:   8d 4d df                lea    ecx,[ebp-0x21]                   ;; Let [ebp-0x21] be B
 9f6:   8b 55 f0                mov    edx,DWORD PTR [ebp-0x10]         ;; i
 9f9:   01 ca                   add    edx,ecx                          ;; Get B[i]
 9fb:   88 02                   mov    BYTE PTR [edx],al                ;; B[i] = map[A[i] & 0xf]
 
 ;;; Comparison
 9fd:   83 45 f0 01             add    DWORD PTR [ebp-0x10],0x1         ;; i++
 a01:   83 7d f0 07             cmp    DWORD PTR [ebp-0x10],0x7         ;; i<=7
 a05:   7e d4                   jle    9db <leveltwo+0x9b>
 ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 a07:   c6 45 e7 00             mov    BYTE PTR [ebp-0x19],0x0
 a0b:   68 92 0c 00 00          push   0xc92        ;; 'dynamite'
 a10:   8d 45 df                lea    eax,[ebp-0x21]   ;; Array B
 a13:   50                      push   eax
 a14:   e8 fc ff ff ff          call   a15 <leveltwo+0xd5> ;; strcmp
 a19:   83 c4 08                add    esp,0x8
 a1c:   85 c0                   test   eax,eax
 a1e:   74 07                   je     a27 <leveltwo+0xe7>
 a20:   b8 00 00 00 00          mov    eax,0x0                          ;;Fail state
 a25:   eb 05                   jmp    a2c <leveltwo+0xec> 
 a27:   b8 01 00 00 00          mov    eax,0x1   ;;;;;;;;;;;;;;;;;;;;;;;;; Win State
 ```
 However, line 9ec always bugged me as I could not understand it even with Ghidra.  After stepping through the code in gdb, I found something interesting
```
(gdb) x/8xw 0x56557008-0x12
0x56556ff6:     0x57fd0000      0x00005655      0x00000000      0x70040000
0x56557006:     0x61795655      0x6e726964      0x746f6d65      0x7767706c
(gdb) x/8xw 0x56557008
0x56557008 <map>:       0x69646179      0x6d656e72      0x706c746f      0x00007767
0x56557018:     0x00000000      0x00000000      0xf7fa85c0      0xf7fa8d80
(gdb) x/8xw 0x56557008-0xc
0x56556ffc:     0x00000000      0x00000000      0x56557004      0x69646179
0x5655700c <map+4>:     0x6d656e72      0x706c746f      0x00007767      0x00000000
(gdb) x/15xb 0x56557008    
0x56557008 <map>:       0x79    0x61    0x64    0x69    0x72    0x6e    0x65    0x6d
0x56557010 <map+8>:     0x6f    0x74    0x6c    0x70    0x67    0x77    0x00
```


Great! From this we know that if we insert characters where their ascii value % 15 is from 0-15 (because & 0xf mods it by 15), we can access this database of ascii values. I coded a python program to do it for me

This should work for level 2
`(printf '\x43\xc7\x01\x12\xaf\x83\x6f\x53\x7b\xc8\x77\x6c\x57\xa0\x8c\xe4B@EAGCIF' && cat) | ./wisecrack`

## Level 3

Check the `disassembly annotated.asm` for more details.

gdb commands. Breaks after scanf
```
set disassembly-flavor intel
break *0x56555ac7 
run < solve123.in
```

```
(gdb) x/12xw $ebp-0x2c
0xffffccf4:     0x00000007      0xffffcd0f      0x00000002      0x6d616e79
0xffffcd04:     0x00000009      0x41454042      0x00000002      0x00000008
0xffffcd14:     0x00000006      0xf7fa8000      0xf7fa8000      0xffffcd28
```

At first, putting in 1 1 1 1 1 as input for level 3
```
(gdb) x/12xw $ebp-0x2c
0xffffccf4:     0x00000007      0x00000001      0x00000002      0x00000001
0xffffcd04:     0x00000009      0x00000001      0x00000002      0x00000001
0xffffcd14:     0x00000006      0x00000001      0xf7fa8000      0xffffcd28
```

So by right, the value and the input array should add up to be 0xa (eg. 7 in array, 3 in input)
However, with the input string `3 8 1 8 4`, I get this
```
(gdb) x/12xw $ebp-0x2c
0xffffccf4:     0x00000007      0x00000004      0x00000002      0x00000008
0xffffcd04:     0x00000009      0x00000001      0x00000002      0x00000008
0xffffcd14:     0x00000006      0x00000003      0xf7fa8000      0xffffcd28
```
Which fails. I then realised the input has to be reversed (because parameters are pushed into a function in reverse in the assembly code)

```
$ ./wisecrack < solve123.in
====================================================================
                          LEVEL 01                                  
====================================================================
=> ====================================================================
                          LEVEL 02                                  
====================================================================
=> ====================================================================
                          LEVEL 03                                  
====================================================================
=> CTFSG{<REDACTED>}
```

## Running on server
Using a python program
```
b'C\xc7\x01\x12\xaf\x83oS{\xc8wlW\xa0\x8c\xe4'
b'B@EAGCIF'
b'4 8 1 8 3 '
[x] Opening connection to challenges.csdc20t.ctf.sg on port 10025
[x] Opening connection to challenges.csdc20t.ctf.sg on port 10025: Trying 206.189.34.13
[+] Opening connection to challenges.csdc20t.ctf.sg on port 10025: Done
b'====================================================================\n                          LEVEL 01                                  \n====================================================================\n=>'
[*] Switching to interactive mode
 ====================================================================
                          LEVEL 02                                  
====================================================================
=> ====================================================================
                          LEVEL 03                                  
====================================================================
=> CTFSG{M45T3R_0F_R3V_R3V_R3V}
[*] Got EOF while reading in interactive
```
# Flag
`CTFSG{M45T3R_0F_R3V_R3V_R3V}`
About 3 hours to do this for me. Yes I'm slow