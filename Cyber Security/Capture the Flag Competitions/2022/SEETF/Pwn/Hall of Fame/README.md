# Challenge Name

### Description

## Solution

### Analysis

```c

undefined8 print_statements(int64_t arg1)
{
    undefined8 counter;
    
    // int print_statements(int counter);
    .plt.got("Welcome to the Hall of Fame!\n");
    printf("Number of Hall Of Famers: %d\n", arg1 & 0xffffffff);
    .plt.got("What brings you in here?\n");
    .plt.got("1) Add Hall of Famer\n2) View Position\n3) Exit");
    return 0;
}


// WARNING: Could not reconcile some variable overlaps
// WARNING: [rz-ghidra] Failed to match type int for variable counter to Decompiler type: Unknown type identifier int
// WARNING: [rz-ghidra] Failed to match type int for variable o to Decompiler type: Unknown type identifier int
// WARNING: [rz-ghidra] Failed to match type long unsigned int for variable size to Decompiler type: Unknown type
// identifier long
// WARNING: [rz-ghidra] Detected overlap for variable o
// WARNING: [rz-ghidra] Detected overlap for variable pty
// WARNING: [rz-ghidra] Detected overlap for variable var_68h
// WARNING: [rz-ghidra] Detected overlap for variable var_60h
// WARNING: [rz-ghidra] Detected overlap for variable var_58h
// WARNING: [rz-ghidra] Detected overlap for variable var_50h
// WARNING: [rz-ghidra] Detected overlap for variable var_48h
// WARNING: [rz-ghidra] Detected overlap for variable var_40h
// WARNING: [rz-ghidra] Detected overlap for variable var_38h
// WARNING: [rz-ghidra] Detected overlap for variable var_30h
// WARNING: [rz-ghidra] Detected overlap for variable var_28h
// WARNING: [rz-ghidra] Detected overlap for variable var_20h
// WARNING: [rz-ghidra] Detected overlap for variable var_18h
// WARNING: [rz-ghidra] Detected overlap for variable var_10h

undefined8 main(void)
{
    int32_t iVar1;
    int64_t iVar2;
    undefined8 uVar3;
    int64_t in_FS_OFFSET;
    undefined8 counter;
    undefined pty [8];
    void *heap_pointer;
    undefined8 size;
    char *ptr;
    char *chunk;
    char option [3];
    char score [64];
    char word [100];
    int64_t var_8h;
    
    // int main();
    var_8h = *(int64_t *)(in_FS_OFFSET + 0x28);
    counter._0_4_ = 0;
    heap_pointer = (void *)sbrk();
    setup_IO();
    while( true ) {
        while( true ) {
            do {
                print_statements((uint64_t)(uint32_t)counter);
                printf("Choose> ");
                fflush(_reloc.stdout);
                iVar2 = fgets(option, 3, _reloc.stdin); //useless
            } while (iVar2 == 0);
            fflush(_reloc.stdin);
            iVar2 = strcspn(option, 0x400d67);
            option[iVar2] = '\0';
            iVar1 = atoi(option); //convert to int
            if (iVar1 != 2) break;
            printf("\nThe position of latest addition is at %p\n", heap_pointer);
            printf("The position of PUTS is at %p\n", _reloc.puts);
        }
        if (iVar1 == 3) break;
        if (iVar1 == 1) {
            printf("\nHow many points did this person score? > ");
            fflush(_reloc.stdout);
            iVar2 = fgets(score, 0x40, _reloc.stdin); //useless, reads 64 length
            if (iVar2 != 0) {
                fflush(_reloc.stdin);
                // Terminate String ///////////////////////////////////////////////////////////
                iVar2 = strcspn(score, 0x400d67); // Find 0x400d67(@,g or c return) in score, and gives offset from score 
                score[iVar2] = '\0'; // Null byte
                size = strtol(score, pty, 10); // Convert to long
                // Heap Setting ////////////////////////////////////////////////////////////////
                ptr = (char *)malloc(size);
                chunk = ptr;
                // Hall of Famer Setting ///////////////////////////////////////////////////////
                printf("\nWho is this Hall of Famer > ");
                fflush(_reloc.stdout);
                fgets(word, 100, _reloc.stdin); //Useless. 100 characters
                fflush();
                // Setting Heap, copy wholesale ////////////////////////////////////////////////
                *(undefined8 *)chunk = word._0_8_;
                *(undefined8 *)(chunk + 8) = word._8_8_;
                *(undefined8 *)(chunk + 0x10) = word._16_8_;
                *(undefined8 *)(chunk + 0x18) = word._24_8_;
                *(undefined8 *)(chunk + 0x20) = word._32_8_;
                *(undefined8 *)(chunk + 0x28) = word._40_8_;
                *(undefined8 *)(chunk + 0x30) = word._48_8_;
                *(undefined8 *)(chunk + 0x38) = word._56_8_;
                *(undefined8 *)(chunk + 0x40) = word._64_8_;
                *(undefined8 *)(chunk + 0x48) = word._72_8_;
                *(undefined8 *)(chunk + 0x50) = word._80_8_;
                *(undefined8 *)(chunk + 0x58) = word._88_8_;
                *(undefined4 *)(chunk + 0x60) = word._96_4_; //96
                heap_pointer = ptr;
                counter._0_4_ = (uint32_t)counter + 1;
            }
        } else {
            .plt.got();
        }
    }
    .plt.got("Exiting software...");
    uVar3 = 0;
    if (var_8h != *(int64_t *)(in_FS_OFFSET + 0x28)) {
        uVar3 = __stack_chk_fail();
    }
    return uVar3;
}

```

## Flag
``