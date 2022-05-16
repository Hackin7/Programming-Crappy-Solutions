# Vault-breaker
![](Pasted%20image%2020220516165325.png)

## Solution

### Decompilation

```c

// WARNING: [rz-ghidra] Failed to match type file* for variable stream to Decompiler type: Unknown type identifier file
// WARNING: [rz-ghidra] Detected overlap for variable var_5ch
// WARNING: [rz-ghidra] Detected overlap for variable var_60h
// WARNING: [rz-ghidra] Failed to match type size_t for variable nbyte to Decompiler type: Unknown type identifier
// size_t

void main noreturn (void)
{
    int64_t iVar1;
    int64_t var_8h;
    
    setup();
    banner();
    key_gen();
    fprintf(_reloc.stdout, "%s\n[+] Random secure encryption key has been generated!\n%s", "\x1b[1;32m", "\x1b[1;34m");
    fflush(_reloc.stdout);
    while( true ) {
        printf("%s\n1. Generate new key 🆕\n2. Secure the Vault 🔒\n\n> ", "\x1b[1;34m");
        iVar1 = read_num();
        if (iVar1 != 1) break;
        new_key_gen();
    }
    if (iVar1 != 2) {
        printf("%s\n[-] Invalid option, exiting..\n", "\x1b[1;31m");
    // WARNING: Subroutine does not return
        exit(0x45);
    }
    // WARNING: Subroutine does not return
    secure_password();
}
```

```c
// WARNING: [rz-ghidra] Failed to match type file* for variable stream to Decompiler type: Unknown type identifier file
// WARNING: [rz-ghidra] Detected overlap for variable var_5ch
// WARNING: [rz-ghidra] Detected overlap for variable var_60h

void secure_password noreturn 
               (void)
{
    char *pcVar1;
    undefined4 uVar2;
    uint64_t uVar3;
    uint64_t uVar4;
    int64_t iVar5;
    int64_t in_FS_OFFSET;
    char acStack136 [24];
    undefined8 uStack112;
    int32_t var_60h;
    int32_t var_5ch;
    char *var_58h;
    int64_t var_50h;
    char *s;
    int64_t stream;
    int64_t var_38h;
    
    var_38h = *(int64_t *)(in_FS_OFFSET + 0x28);
    uStack112 = 0xc26;
    puts("\x1b[1;34m");
    uStack112 = 0xc4c;
    printf("\n%sCurrent status: %sLocked%s 🔒\n\n", "\x1b[1;34m", "\x1b[1;31m", "\x1b[1;34m");
    var_58h = (char *)0x1330;
    var_5ch = 0x17;
    var_50h = 0x16;
    s = acStack136;
    memset(acStack136, 0, 0x17);
    stream = fopen("flag.txt", 0x30cb);
    pcVar1 = s;
    if (stream == 0) {
        fprintf(_reloc.stderr, "\n%s[-] Error opening flag.txt, contact an Administrator..\n", "\x1b[1;31m");
    // WARNING: Subroutine does not return
        exit(0x15);
    }
    iVar5 = (int64_t)var_5ch;
    uVar2 = fileno(stream);
    read(uVar2, pcVar1, iVar5);
    fclose(stream);
    puts(var_58h);
    fwrite("\nMaster password for Vault: ", 1, 0x1c, _reloc.stdout);

	//// Looping through the length of the string ////////////////////////////////////
    var_60h = 0;
    while( true ) { 
        uVar4 = SEXT48(var_60h);
        uVar3 = strlen(s);
        if (uVar3 <= uVar4) break;
        putchar((int32_t)(char)((uint8_t)random_key[var_60h] ^ s[var_60h])); // XOR with random key
        var_60h = var_60h + 1;
    }
    puts(0x3130);
    // WARNING: Subroutine does not return
    exit(0x1b39);
}
```

```c
// WARNING: [rz-ghidra] Failed to match type file* for variable stream to Decompiler type: Unknown type identifier file
// WARNING: [rz-ghidra] Detected overlap for variable var_5ch
// WARNING: [rz-ghidra] Detected overlap for variable var_60h
// WARNING: [rz-ghidra] Failed to match type size_t for variable nbyte to Decompiler type: Unknown type identifier
// size_t

void new_key_gen(void)
{
    undefined4 uVar1;
    int64_t iVar2;
    int64_t in_FS_OFFSET;
    int64_t var_58h;
    uint64_t nbyte;
    undefined8 stream;
    char *src;
    int64_t canary;
    
    canary = *(int64_t *)(in_FS_OFFSET + 0x28);
    var_58h = 0;
    nbyte = 0x22;
    iVar2 = fopen("/dev/urandom", 0x30cb);
    if (iVar2 == 0) {
        fprintf(_reloc.stdout, "\n%sError opening /dev/urandom, exiting..\n", "\x1b[1;31m");
    // WARNING: Subroutine does not return
        exit(0x15);
    }

	//// Input for length of password //////////////////////////////////////////////////
    while (0x1f < nbyte) {
        printf("\n[*] Length of new password (0-%d): ", 0x1f);
        nbyte = read_num();
    }
    //// Set array ///////////////////////////////////////////////////////////////////
    memset(&src, 0, 0x20);
    uVar1 = fileno(iVar2);
    //// Read from /dev/urandom //////////////////////////////////////////////////////
    read(uVar1, &src, nbyte);
    for (; (uint64_t)var_58h < nbyte; var_58h = var_58h + 1) {
        while (*(char *)((int64_t)&src + var_58h) == '\0') {
            uVar1 = fileno(iVar2);
            read(uVar1, (int64_t)&src + var_58h, 1);
        }
    }
    strcpy(random_key, &src);
    fclose(iVar2);
    printf("\n%s[+] New key has been genereated successfully!\n%s", "\x1b[1;32m", "\x1b[1;34m");
    if (canary != *(int64_t *)(in_FS_OFFSET + 0x28)) {
    // WARNING: Subroutine does not return
        __stack_chk_fail();
    }
    return;
}

```


### Testing Overflow (Stack Canary)

This part in the `new_key_gen` function looks interesting. Seems like a stack canary

```c
    printf("\n%s[+] New key has been genereated successfully!\n%s", "\x1b[1;32m", "\x1b[1;34m");
    if (canary != *(int64_t *)(in_FS_OFFSET + 0x28)) {
    // WARNING: Subroutine does not return
        __stack_chk_fail();
    }
    return;
```

```bash
[+] Random secure encryption key has been generated!

1. Generate new key 🆕
2. Secure the Vault 🔒

> 1

[*] Length of new password (0-31): AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
(base) [hacker@hackerbook Final Exploit]$ 
```

Checking for other protections, which doesn't look good

```bash
(base) [hacker@hackerbook challenge]$ checksec vault-breaker
Warning: _curses.error: setupterm: could not find terminfo database

Terminal features will not be available.  Consider setting TERM variable to your current terminal name (or xterm).
[*] '/tmp/challenge/vault-breaker'
    Arch:     amd64-64-little
    RELRO:    Full RELRO
    Stack:    Canary found
    NX:       NX enabled
    PIE:      PIE enabled
    RUNPATH:  b'./.glibc/'
(base) [hacker@hackerbook challenge]$ 
```

## Flag
``