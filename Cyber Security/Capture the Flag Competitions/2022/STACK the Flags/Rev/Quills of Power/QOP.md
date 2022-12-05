```c

// WARNING: Variable defined which should be unmapped: index
// WARNING: Could not reconcile some variable overlaps
// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable index to Decompiler type: Unknown type
// identifier signed
// WARNING: [rz-ghidra] Detected overlap for variable var_14h

void magic1(int64_t arg1)
{
    uint32_t uVar1;
    uint32_t *puVar2;
    int64_t seed;
    int64_t var_10h;
    undefined8 index;
    
    srand(*(undefined4 *)arg1); // Seed
    // Loop for 20 characters
    for (index._0_4_ = 0; (int32_t)index < 0x14; index._0_4_ = (int32_t)index + 1) {
        puVar2 = (uint32_t *)((int64_t)((int32_t)index << 2) + 0x4040);
        uVar1 = rand();
        *puVar2 = *puVar2 ^ uVar1; // XOR with rand (predictable)
    }
    return;
}

```

```c
// WARNING: Variable defined which should be unmapped: var_4h
// WARNING: [rz-ghidra] Failed to match type int for variable argc to Decompiler type: Unknown type identifier int
// WARNING: [rz-ghidra] Failed to match type signed int64_t for variable index to Decompiler type: Unknown type
// identifier signed
// WARNING: [rz-ghidra] Detected overlap for variable var_14h

undefined8 main(undefined8 argc, char **argv)
{
    char **var_10h;
    int64_t var_4h;
    
    printf(*(undefined8 *)0x40c0);
    printf(*(undefined8 *)0x40c8);
    printf(*(undefined8 *)0x40d0);
    magic1(*(int64_t *)0x40a8);
    magic1(*(int64_t *)0x40b0);
    printf("%-80s", 0x4040);
    return 0;
}

```