
// WARNING: [r2ghidra] Variable arg_1h extends beyond the stackframe. Try changing its type to something smaller.

/// Just Displays the prompt String? ////////////////////////////////////////////////////////////////////////////////////////
int64_t fcn.000015a0(int64_t arg1)
{
    int32_t iVar1;
    uint32_t uVar2;
    int64_t iVar3;
    int64_t iVar4;
    uint64_t uVar5;
    int32_t iVar6;
    int32_t iVar7;

    iVar7 = (int32_t)arg1;
    iVar1 = *(int32_t *)((int64_t)iVar7 * 4 + 0x4080);
    iVar6 = *(int32_t *)((int64_t)(iVar7 + 1) * 4 + 0x4080) - iVar1;
    iVar3 = malloc();
    *(undefined *)(iVar3 + iVar6) = 0;
    if (0 < iVar6) {
        uVar5 = arg1 & 0xffffffff;
        iVar4 = 0;
        do {
            uVar2 = (uint32_t)(uint8_t)str.What_would_you_like_to_do_V__u[iVar4 + iVar1] ^ (uint32_t)uVar5;
            *(char *)(iVar3 + iVar4) = (char)uVar2;
            iVar4 = iVar4 + 1;
            uVar5 = (uint64_t)(uVar2 * (uint32_t)uVar5 + iVar7 * 0x11);
        } while (iVar6 != iVar4);
    }
    return iVar3;
}

undefined8 main(void)
{
    bool bVar1;
    char cVar2;
    int32_t iVar3;
    undefined8 uVar4;
    int64_t iVar5;
    undefined8 uVar6;
    int32_t iVar7;
    char cVar8;
    int64_t in_FS_OFFSET;
    undefined auStack584 [256];
    undefined auStack328 [264];
    int64_t iStack64;

    // [14] -r-x section size 1589 named .text
    bVar1 = true;
    iVar7 = 0;
    iStack64 = *(int64_t *)(in_FS_OFFSET + 0x28);
    fcn.00001620();
    cVar8 = '\0';
code_r0x00001148:
    /// Main Loop /////////////////////////////////////////////////////////////
    do {
        uVar4 = fcn.000015a0(0);
        puts(uVar4);
        free(uVar4);
        iVar5 = fgets(auStack584, 0x100, _reloc.stdin);
        if (iVar5 == 0) {
code_r0x000013c8:
            fcn.00001620(5); //// Puts something to output /////////////////////////////////
code_r0x000013d2:
            if (iStack64 == *(int64_t *)(in_FS_OFFSET + 0x28)) {
                return 0;
            }
    // WARNING: Subroutine does not return
            __stack_chk_fail();
        }
        iVar5 = strcspn(auStack584, 0x2004);
        auStack584[iVar5] = 0;
        if (iVar7 != 0) {
            uVar4 = fcn.000015a0(2);
            iVar3 = strcmp(auStack584, uVar4);
            free(uVar4);
            iVar5 = 0x12;
            if (iVar3 != 0) {
                if (iVar7 == 0x539) {
                    uVar4 = fcn.000015a0(0x17);
                    iVar3 = strcmp(auStack584, uVar4);
                    free(uVar4);
                    if (iVar3 == 0) {
                        fcn.00001620(0x18);
                        uVar4 = fcn.000015a0(0x19);
                        uVar6 = fcn.000015a0(0x1a);
                        iVar5 = fopen(uVar4, uVar6);
                        free(uVar4);
                        free(uVar6);
                        if (iVar5 == 0) {
                            fcn.00001620(0x1b);
                        } else {
                            fgets(auStack328, 0x100, iVar5);
                            iVar5 = strcspn(auStack328, 0x2004);
                            auStack328[iVar5] = 0;
                            puts(auStack328);
                        }
                        fcn.00001620(0x1c);
                        goto code_r0x000013d2;
                    }
                }
                uVar4 = fcn.000015a0(0x13);
                iVar3 = strcmp(auStack584, uVar4);
                free(uVar4);
                if (iVar3 == 0) {
                    iVar7 = iVar7 * 2;
                    iVar5 = 0x15;
                } else {
                    uVar4 = fcn.000015a0(0x14);
                    iVar3 = strcmp(auStack584, uVar4);
                    free(uVar4);
                    iVar5 = 4;
                    if (iVar3 == 0) {
                        iVar7 = iVar7 * 2 + 1;
                        iVar5 = 0x16;
                    }
                }
            }
code_r0x00001130:
            uVar4 = fcn.000015a0(iVar5);
            puts(uVar4);
            free();
            goto code_r0x00001148;
        }
        uVar4 = fcn.000015a0(2);
        iVar3 = strcmp(auStack584, uVar4);
        free(uVar4);
        if (iVar3 == 0) {
            iVar5 = 3;
            if (!bVar1) {
                iVar5 = 8;
            }
            goto code_r0x00001130;
        }
        uVar4 = fcn.000015a0(6);
        iVar3 = strcmp(auStack584, uVar4);
        free(uVar4);
        if (iVar3 == 0) {
            fcn.00001620(7);
            goto code_r0x000013c8;
        }
        uVar4 = fcn.000015a0(9);
        iVar3 = strcmp(auStack584, uVar4);
        free(uVar4);
        iVar5 = 10;
        if (iVar3 == 0) goto code_r0x00001130;
        uVar4 = fcn.000015a0(0xb);
        iVar3 = strcmp(auStack584, uVar4);
        free(uVar4);
        if (iVar3 == 0) {
            if (bVar1) {
                fcn.00001620(0xc);
                goto code_r0x000013c8;
            }
            iVar7 = 1;
            fcn.00001620();
        } else {
            cVar2 = fcn.00001640((int64_t)auStack584, 0xf);
            if (cVar2 == '\0') {
                cVar2 = fcn.00001640((int64_t)auStack584, 0xe);
                if ((cVar2 == '\0') || (cVar8 == '\0')) {
code_r0x00001429:
                    fcn.00001620();
                } else {
code_r0x0000144e:
                    bVar1 = false;
                    fcn.00001620();
                    cVar8 = '\x01';
                }
            } else {
                if (cVar8 != '\0') {
                    cVar2 = fcn.00001640((int64_t)auStack584, 0xe);
                    if (cVar2 != '\0') goto code_r0x0000144e;
                    goto code_r0x00001429;
                }
                fcn.00001620();
                cVar8 = cVar2;
            }
        }
    } while( true );
    ///////////////////////////////////////////////////////////////////////////
}
