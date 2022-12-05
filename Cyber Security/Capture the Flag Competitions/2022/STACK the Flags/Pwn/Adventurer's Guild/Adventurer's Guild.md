
![[Pasted image 20221204145712.png]]

First input doesnt do anything
![[Pasted image 20221204145657.png]]

![[Pasted image 20221204145743.png]]

![[Pasted image 20221204145844.png]]

Yeah I overwrote some values, but idk what

![[Pasted image 20221204145915.png]]

And then option 3

![[Pasted image 20221204145931.png]]
## Testing Payloads

Initial Name Length
```
Aa0Aa1Aa2Aa3Aa4Aa5Aa6Aa7Aa8Aa9Ab0Ab1Ab2Ab3Ab4Ab5Ab6Ab7Ab8Ab9Ac0
```

### Change HP 
Initial name = a
```
[AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]BB
```


![[Pasted image 20221204150227.png]]
![[Pasted image 20221204150240.png]]
```
[AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]CC
```

![[Pasted image 20221204150409.png]]


I think only last character affects HP

So
the new base name is (makes sense as last char overwrites null byte)
```
[AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]
```

To change health to 68 change name to (C for 69)
```
[AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]B
```

### Change ATK?

Change HP to 87
```
[AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]BC
```

Change HP to 128 and also change class to Warrior

```
[AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA]BCC
```

## Cutter Decompilation

```c

// WARNING: [rz-ghidra] Detected overlap for variable var_ch
// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable var_ch to Decompiler type: Unknown type
// identifier signed
// WARNING: [rz-ghidra] Detected overlap for variable var_10h
// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable var_44h to Decompiler type: Unknown type
// identifier signed
// WARNING: [rz-ghidra] Detected overlap for variable var_44h
// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable var_224h to Decompiler type: Unknown type
// identifier signed
// WARNING: [rz-ghidra] Detected overlap for variable var_220h

undefined8 main(void)
{
    int64_t in_FS_OFFSET;
    int32_t var_ch;
    int64_t canary;
    
    canary = *(int64_t *)(in_FS_OFFSET + 0x28);
    var_ch = 0;
    while( true ) {
        while( true ) {
            fcn.004037aa();
            std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, " Choice => ");
            std::istream::operator>>(int&)(reloc.std::cin, &var_ch);
            if (var_ch != 3) break;
            fcn.00403bc7();
        }
        if (3 < var_ch) break;
        if (var_ch == 1) {
            fcn.004038cb();
        } else {
            if (var_ch != 2) break;
            fcn.004039eb();
        }
    }
    if (canary == *(int64_t *)(in_FS_OFFSET + 0x28)) {
        return 0;
    }
    // WARNING: Subroutine does not return
    __stack_chk_fail();
}
```

Function we are interested in is option 2

`fcn.004039eb()`

```c

// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable var_ch to Decompiler type: Unknown type
// identifier signed
// WARNING: [rz-ghidra] Detected overlap for variable var_ch
// WARNING: [rz-ghidra] Detected overlap for variable var_10h

void fcn.004039eb(void)
{
    char cVar1;
    undefined8 uVar2;
    int64_t in_FS_OFFSET;
    int32_t var_10h;
    int32_t var_ch;
    int64_t canary;
    
    canary = *(int64_t *)(in_FS_OFFSET + 0x28);
    fcn.004036a9();
    cVar1 = fcn.00403e35();
    if (cVar1 == '\0') {
        std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                  (reloc.std::cout, 
                   "╔════════════════════════════════════════════════════════╗\n║  Which party member would you like to rename?          ║\n╚════════════════════════════════════════════════════════╝\n"
                  );
        var_ch = 0;
        while ((var_ch < 3 && (*(int64_t *)((int64_t)var_ch * 8 + 0x40aab0) != 0))) {
            uVar2 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                              (reloc.std::cout, 0x4050ae);
            uVar2 = std::ostream::operator<<(int)(uVar2, var_ch + 1);
            uVar2 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                              (uVar2, 0x4050b2);
            uVar2 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                              (uVar2, *(int64_t *)((int64_t)var_ch * 8 + 0x40aab0) + 8);
            std::ostream::operator<<(std::ostream& (*)(std::ostream&))
                      (uVar2, 
                       _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
                      );
            var_ch = var_ch + 1;
        }
        std::ostream::operator<<(std::ostream& (*)(std::ostream&))
                  (reloc.std::cout, 
                   _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
                  );
        var_10h = 0;
        do {
            do {
                std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                          (reloc.std::cout, " Choice => ");
                std::istream::operator>>(int&)(reloc.std::cin, &var_10h);
            } while (var_10h < 1);
        } while ((3 < var_10h) || (*(int64_t *)((int64_t)(var_10h + -1) * 8 + 0x40aab0) == 0));
        std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                  (reloc.std::cout, " Name => ");
        std::basic_istream<char, std::char_traits<char> >& std::operator>><char, std::char_traits<char> >(std::basic_istream<char, std::char_traits<char> >&, char*)
                  (reloc.std::cin, *(int64_t *)((int64_t)(var_10h + -1) * 8 + 0x40aab0) + 8); // Vulnerable line
    } else {
        fcn.004038a3();
    }
    if (canary == *(int64_t *)(in_FS_OFFSET + 0x28)) {
        return;
    }
    // WARNING: Subroutine does not return
    __stack_chk_fail();
}

```


Function for displaying `fcn.004037aa();`

```c

// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable var_4h to Decompiler type: Unknown type
// identifier signed

void fcn.004037aa(void)
{
    fcn.004036a9();
    std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
              (reloc.std::cout, 
               "╭━━━━┳╮╱╱╱╱╱╭━━━╮╱╭╮╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╭━━━╮╱╱╱╭╮╱╱╭╮\n┃╭╮╭╮┃┃╱╱╱╱╱┃╭━╮┃╱┃┃╱╱╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱╱╭╮╱╱╱┃╭━╮┃╱╱╱┃┃╱╱┃┃\n╰╯┃┃╰┫╰━┳━━╮┃┃╱┃┣━╯┣╮╭┳━━┳━╋╮╭╋╮╭┳━┳━━┳━┫┣━━╮┃┃╱╰╋╮╭┳┫┃╭━╯┃\n╱╱┃┃╱┃╭╮┃┃━┫┃╰━╯┃╭╮┃╰╯┃┃━┫╭╮┫┃┃┃┃┃╭┫┃━┫╭┻┫━━┫┃┃╭━┫┃┃┣┫┃┃╭╮┃\n╱╱┃┃╱┃┃┃┃┃━┫┃╭━╮┃╰╯┣╮╭┫┃━┫┃┃┃╰┫╰╯┃┃┃┃━┫┃╱┣━━┃┃╰┻━┃╰╯┃┃╰┫╰╯┃\n╱╱╰╯╱╰╯╰┻━━╯╰╯╱╰┻━━╯╰╯╰━━┻╯╰┻━┻━━┻╯╰━━┻╯╱╰━━╯╰━━━┻━━┻┻━┻━━╯\n                                                           \n"
              );
    fcn.004037e5();
    std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
              (reloc.std::cout, 
               "╔═ MAIN MENU ════════════════════════════════════════════╗\n║  1. Register new player (max. 3)                       ║\n║  2. Edit player information                            ║\n║  3. Check quest board                                  ║\n║  4. Exit                                               ║\n╚════════════════════════════════════════════════════════╝\n                                                          \n"
              );
    return;
}

```

Either way after searching around I found the function responsible for stuff - displaying of values?

```c
void fcn.00402536(int64_t arg1)
{
    undefined uVar1;
    int32_t iVar2;
    undefined8 uVar3;
    int64_t var_18h;
    
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, 0x404018);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "  NAME: ");
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (uVar3, arg1 + 8);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
              (reloc.std::cout, "  JOB : ");
    iVar2 = (***(code ***)arg1)(arg1);
    if (iVar2 == 5) {
        std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                  (reloc.std::cout, "HERO ⭐");
        goto code_r0x0040265a;
    }
    if (iVar2 < 6) {
        if (iVar2 == 4) {
            std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "MAGE 🔥");
            goto code_r0x0040265a;
        }
        if (iVar2 < 5) {
            if (iVar2 == 2) {
                std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                          (reloc.std::cout, "WARRIOR ⚔\xfe0f");
                goto code_r0x0040265a;
            }
            if (iVar2 == 3) {
                std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                          (reloc.std::cout, "ARCHER 🏹");
                goto code_r0x0040265a;
            }
        }
    }
    std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
              (reloc.std::cout, "BEGINNER 😄");
code_r0x0040265a:
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (reloc.std::cout, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, 0x404118);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "  HP  : ");
    uVar1 = (**(code **)(*(int64_t *)arg1 + 0x10))(arg1);
    uVar3 = std::ostream::operator<<(int)(uVar3, uVar1);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "  ATK : ");
    uVar1 = (**(code **)(*(int64_t *)arg1 + 8))(arg1);
    uVar3 = std::ostream::operator<<(int)(uVar3, uVar1);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, 0x404118);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "  STR : ");
    uVar3 = std::ostream::operator<<(int)(uVar3, *(undefined *)(arg1 + 0x4b));
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "  DEX : ");
    uVar3 = std::ostream::operator<<(int)(uVar3, *(undefined *)(arg1 + 0x4a));
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, "  INT : ");
    uVar3 = std::ostream::operator<<(int)(uVar3, *(undefined *)(arg1 + 0x4c));
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    uVar3 = std::basic_ostream<char, std::char_traits<char> >& std::operator<< <std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&, char const*)
                      (reloc.std::cout, 0x4041f0);
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (uVar3, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    std::ostream::operator<<(std::ostream& (*)(std::ostream&))
              (reloc.std::cout, 
               _reloc.std::basic_ostream<char, std::char_traits<char> >& std::endl<char, std::char_traits<char> >(std::basic_ostream<char, std::char_traits<char> >&)
              );
    return;
}
```
# Flag