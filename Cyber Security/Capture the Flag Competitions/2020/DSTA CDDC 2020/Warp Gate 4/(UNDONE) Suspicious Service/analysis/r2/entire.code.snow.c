
/* __x86.get_pc_thunk.bx */
void __x86_get_pc_thunk_bx() {
    return;
}

void fun_1106(int32_t a1, void** a2, int32_t a3) {
    return;
}

/* __x86.get_pc_thunk.dx */
void __x86_get_pc_thunk_dx() {
    return;
}

/* __x86.get_pc_thunk.bp */
void __x86_get_pc_thunk_bp() {
    return;
}

struct s0 {
    signed char[28] pad28;
    int32_t f28;
};

void deregister_tm_clones(int32_t a1) {
    struct s0* edx2;
    int32_t edx3;
    int32_t ecx4;
    int32_t eax5;

    __x86_get_pc_thunk_dx();
    edx2 = reinterpret_cast<struct s0*>(edx3 + 0x2e9f);
    ecx4 = reinterpret_cast<int32_t>(edx2) + 68;
    if (reinterpret_cast<int32_t>(edx2) + 68 == ecx4 || (eax5 = edx2->f28, eax5 == 0)) {
        return;
    } else {
        eax5(ecx4);
        return;
    }
}

void fun_1002() {
    uint48_t v1;
    int16_t ds2;
    int32_t eax3;
    int32_t ebx4;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    __x86_get_pc_thunk_bx();
    eax3 = *reinterpret_cast<int32_t*>(ebx4 + 0x2fb7 + 40);
    if (eax3) {
        eax3();
    }
    goto *reinterpret_cast<int32_t*>(&v1);
}

struct s1 {
    signed char[8] pad8;
    int32_t f8;
};

void fun_1042() {
    struct s1* ebx1;

    __asm__("sti ");
    goto ebx1->f8;
}

void fun_1052() {
    __asm__("sti ");
    goto 0x1030;
}

void fun_1062() {
    __asm__("sti ");
    goto 0x1030;
}

void fun_1072() {
    __asm__("sti ");
    goto 0x1030;
}

struct s2 {
    signed char[36] pad36;
    int32_t f36;
};

void fun_1082() {
    struct s2* ebx1;

    __asm__("sti ");
    goto ebx1->f36;
}

struct s3 {
    signed char[12] pad12;
    int32_t f12;
};

void fun_1092() {
    struct s3* ebx1;

    __asm__("sti ");
    goto ebx1->f12;
}

struct s4 {
    signed char[16] pad16;
    int32_t f16;
};

void fun_10a2() {
    struct s4* ebx1;

    __asm__("sti ");
    goto ebx1->f16;
}

struct s5 {
    signed char[20] pad20;
    int32_t f20;
};

void fun_10b2() {
    struct s5* ebx1;

    __asm__("sti ");
    goto ebx1->f20;
}

struct s6 {
    signed char[24] pad24;
    int32_t f24;
};

void fun_10c2() {
    struct s6* ebx1;

    __asm__("sti ");
    goto ebx1->f24;
}

struct s7 {
    signed char[52] pad52;
    int32_t f52;
};

void fun_10c0(int32_t a1, int16_t a2, void* a3, int32_t a4, int32_t a5, int32_t a6, void** a7, int32_t a8);

void fun_10d2() {
    uint48_t v1;
    int16_t ds2;
    void* esp3;
    void** v4;
    int32_t edx5;
    int32_t eax6;
    struct s7* ebx7;
    int32_t ebx8;
    int32_t v9;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    esp3 = reinterpret_cast<void*>(reinterpret_cast<int32_t>(__zero_stack_offset()) - 2 + 4);
    v4 = reinterpret_cast<void**>((reinterpret_cast<uint32_t>(esp3) & 0xfffffff0) - 4 - 4);
    fun_1106(edx5, v4, eax6);
    ebx7 = reinterpret_cast<struct s7*>(ebx8 + 0x2ee0);
    v9 = ebx7->f52;
    fun_10c0(v9, *reinterpret_cast<int16_t*>(&v1), esp3, reinterpret_cast<int32_t>(ebx7) - 0x2d24, reinterpret_cast<int32_t>(ebx7) - 0x2cb4, edx5, v4, eax6);
    __asm__("hlt ");
}

struct s8 {
    signed char[36] pad36;
    int32_t f36;
    signed char[24] pad64;
    int32_t f64;
    signed char f68;
};

void fun_1080(int32_t a1);

void fun_11b2() {
    uint48_t v1;
    int16_t ds2;
    struct s8* ebx3;
    int32_t ebx4;
    int32_t v5;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    __x86_get_pc_thunk_bx();
    ebx3 = reinterpret_cast<struct s8*>(ebx4 + 0x2e07);
    if (!ebx3->f68) {
        if (ebx3->f36) {
            v5 = ebx3->f64;
            fun_1080(v5);
        }
        deregister_tm_clones(0x11bd);
        ebx3->f68 = 1;
    }
    goto *reinterpret_cast<int32_t*>(&v1);
}

struct s9 {
    signed char[56] pad56;
    int32_t f56;
};

void fun_1202() {
    uint48_t v1;
    int16_t ds2;
    struct s9* edx3;
    int32_t edx4;
    uint32_t ecx5;
    uint32_t eax6;
    int32_t eax7;
    int32_t edx8;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    __x86_get_pc_thunk_dx();
    edx3 = reinterpret_cast<struct s9*>(edx4 + 0x2e5f);
    ecx5 = reinterpret_cast<int32_t>(edx3) + 68;
    eax6 = reinterpret_cast<int32_t>(edx3) + 68 - ecx5;
    eax7 = reinterpret_cast<int32_t>((eax6 >> 31) + (reinterpret_cast<int32_t>(eax6) >> 2)) >> 1;
    if (eax7 && (edx8 = edx3->f56, !!edx8)) {
        edx8(ecx5, eax7);
    }
    goto *reinterpret_cast<int32_t*>(&v1);
}

struct s10 {
    signed char[32] pad32;
    int32_t* f32;
    signed char[8] pad44;
    int32_t* f44;
    int32_t* f48;
};

void fun_1090(int32_t a1, int32_t a2);

void fun_10a0(void* a1);

void fun_10b0(int32_t a1);

void fun_120f() {
    uint48_t v1;
    int16_t ds2;
    struct s10* ebx3;
    int32_t ebx4;
    int32_t eax5;
    int32_t eax6;
    int32_t eax7;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    __x86_get_pc_thunk_bx();
    ebx3 = reinterpret_cast<struct s10*>(ebx4 + 0x2da4);
    eax5 = *ebx3->f44;
    fun_1090(eax5, 0);
    eax6 = *ebx3->f48;
    fun_1090(eax6, 0);
    eax7 = *ebx3->f32;
    fun_1090(eax7, 0);
    fun_10a0(reinterpret_cast<int32_t>(__zero_stack_offset()) - 2 - 4 - 0x108);
    if (!1) {
        fun_10b0(reinterpret_cast<int32_t>(ebx3) - 0x1fbc);
    }
    goto *reinterpret_cast<int32_t*>(&v1);
}

void _init();

void fun_12a2() {
    uint64_t v1;
    int16_t ds2;
    int32_t ebp3;
    int32_t ebp4;
    int32_t edi5;
    int32_t v6;
    int32_t ebx7;
    int32_t esi8;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    __x86_get_pc_thunk_bp();
    ebp3 = ebp4 + 0x2d1a;
    edi5 = v6;
    _init();
    ebx7 = ebp3 - 0xfc - (ebp3 - 0x100) >> 2;
    if (ebx7) {
        esi8 = 0;
        do {
            *reinterpret_cast<int32_t*>(ebp3 + esi8 * 4 - 0x100)(*reinterpret_cast<int32_t*>(&v1), *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 4), edi5, 0x12c1);
            ++esi8;
        } while (ebx7 != esi8);
    }
    goto *reinterpret_cast<int32_t*>(&v1);
}

void fun_1312() {
    uint48_t v1;
    int16_t ds2;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    goto *reinterpret_cast<int16_t*>(&v1);
}

void fun_131e() {
    uint48_t v1;
    int16_t ds2;

    *reinterpret_cast<int32_t*>(reinterpret_cast<int32_t>(&v1) + 2) = reinterpret_cast<int32_t>(__return_address());
    *reinterpret_cast<int16_t*>(&v1) = ds2;
    __asm__("sti ");
    __x86_get_pc_thunk_bx();
    goto *reinterpret_cast<int32_t*>(&v1);
}

void fun_1153() {
}

void fun_1305() {
}

void fun_1159() {
}

void fun_11a7() {
}

void fun_11fb() {
}
