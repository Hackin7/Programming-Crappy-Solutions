# Sanity Checks

### Description

![](Description.png)

## Solution

When I read the code, I knew, that you basically had to overflow to the other variables. It is also a relatively standard binary exploitation exercise, similar to Stack 1 as in this writeup https://medium.com/@swapnilddeshpande/protostar-stack0-stack3-writeup-37b7941252c2.


I need to find the memory location of all the variables. I just used `objdump`
```
4011b5:	48 8b 05 e4 2e 00 00 	mov    rax,QWORD PTR [rip+0x2ee4]        # 4040a0 <stderr@@GLIBC_2.2.5>
4011bc:	be 00 00 00 00       	mov    esi,0x0
4011c1:	48 89 c7             	mov    rdi,rax
4011c4:	e8 77 fe ff ff       	call   401040 <setbuf@plt>
4011c9:	c7 45 fc 00 00 00 00 	mov    DWORD PTR [rbp-0x4],0x0
4011d0:	c7 45 f8 00 00 00 00 	mov    DWORD PTR [rbp-0x8],0x0
4011d7:	c7 45 f4 00 00 00 00 	mov    DWORD PTR [rbp-0xc],0x0
4011de:	c7 45 f0 00 00 00 00 	mov    DWORD PTR [rbp-0x10],0x0
4011e5:	c7 45 ec 00 00 00 00 	mov    DWORD PTR [rbp-0x14],0x0
4011ec:	48 8d 3d 15 0e 00 00 	lea    rdi,[rip+0xe15]        # 402008 <_IO_stdin_used+0x8>
4011f3:	b8 00 00 00 00       	mov    eax,0x0
4011f8:	e8 53 fe ff ff       	call   401050 <printf@plt>
4011fd:	48 8d 45 a0          	lea    rax,[rbp-0x60]
401201:	48 89 c7             	mov    rdi,rax
401204:	b8 00 00 00 00       	mov    eax,0x0
401209:	e8 72 fe ff ff       	call   401080 <gets@plt>
40120e:	48 8d 45 a0          	lea    rax,[rbp-0x60]
401212:	48 8d 35 07 0e 00 00 	lea    rsi,[rip+0xe07]        # 402020 <_IO_stdin_used+0x20>
401219:	48 89 c7             	mov    rdi,rax
```
The `password` is in `rbp-0x60`, while the other variables are `[rbp-0x4]` onwards

Some interesting tricks
1. You have to put a null byte at the end of the `password123` string. This is to ensure that the program only reads `password123`, and not the garbage behind it.

Took me 24:06 min Man am I slow.

## Flag
`actf{if_you_aint_bout_flags_then_i_dont_mess_with_yall}`
