# Easy Overflow

### Description

## Solution

Source code decompiled using Cutter

```c
undefined8 main(void)
{
    char *s;
    
    setbuf(_reloc.stdout, 0);
    setbuf(_reloc.stdin, 0);
    puts("I will let you  overflow me.");
    vuln();
    puts("I will give you one more chance.");
    fgets(&s, 8, _reloc.stdin);
    puts(&s);
    return 0;
}

void vuln(void)
{
    int64_t in_stack_00000000;
    char *s;
    
    gets(&s);
    if (in_stack_00000000 == 0x401212) {
        puts("Good  boi\n");
        return;
    }
    puts("Naughty Boi\n");
    // WARNING: Subroutine does not return
    exit(0xffffffff);
}
```


```
objdump -d /tmp/easy_overflow

...

0000000000401172 <vuln>:
  401172:	55                   	push   %rbp
  401173:	48 89 e5             	mov    %rsp,%rbp
  401176:	48 83 ec 20          	sub    $0x20,%rsp
  40117a:	48 8d 45 e0          	lea    -0x20(%rbp),%rax
  40117e:	48 89 c7             	mov    %rax,%rdi
  401181:	b8 00 00 00 00       	mov    $0x0,%eax
  401186:	e8 e5 fe ff ff       	call   401070 <gets@plt>
  40118b:	48 8d 45 e0          	lea    -0x20(%rbp),%rax
  40118f:	48 83 c0 28          	add    $0x28,%rax
  401193:	48 8b 00             	mov    (%rax),%rax
  401196:	48 8d 15 2f 00 00 00 	lea    0x2f(%rip),%rdx        # 4011cc <main>
  40119d:	48 83 c2 46          	add    $0x46,%rdx
  4011a1:	48 39 d0             	cmp    %rdx,%rax
  4011a4:	75 0e                	jne    4011b4 <vuln+0x42>
  4011a6:	48 8d 3d 5b 0e 00 00 	lea    0xe5b(%rip),%rdi        # 402008 <_IO_stdin_used+0x8>
  4011ad:	e8 7e fe ff ff       	call   401030 <puts@plt>
  4011b2:	eb 16                	jmp    4011ca <vuln+0x58>
  4011b4:	48 8d 3d 58 0e 00 00 	lea    0xe58(%rip),%rdi        # 402013 <_IO_stdin_used+0x13>
  4011bb:	e8 70 fe ff ff       	call   401030 <puts@plt>
  4011c0:	bf ff ff ff ff       	mov    $0xffffffff,%edi
  4011c5:	e8 b6 fe ff ff       	call   401080 <exit@plt>
  4011ca:	c9                   	leave  
  4011cb:	c3                   	ret    

...

0000000000401249 <win>:
  401249:	55                   	push   %rbp
  40124a:	48 89 e5             	mov    %rsp,%rbp
  40124d:	48 8d 3d 0d 0e 00 00 	lea    0xe0d(%rip),%rdi        # 402061 <_IO_stdin_used+0x61>
  401254:	e8 f7 fd ff ff       	call   401050 <system@plt>
  401259:	bf 00 00 00 00       	mov    $0x0,%edi
  40125e:	e8 1d fe ff ff       	call   401080 <exit@plt>
  401263:	66 2e 0f 1f 84 00 00 	cs nopw 0x0(%rax,%rax,1)
  40126a:	00 00 00 
  40126d:	0f 1f 00             	nopl   (%rax)

```

```
(base) [hacker@hackerbook tmp]$ ./easy_overflow 
I will let you  overflow me.
AAAAAAAAAAAAAAAA
```

```
(base) [hacker@hackerbook ~]$ (python -c 'import time;time.sleep(10);print("A"+"\nFail\n")') | /tmp/easy_overflow 
I will let you  overflow me.
```


## Flag
``
