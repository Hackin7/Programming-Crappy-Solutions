
/* __x86.get_pc_thunk.bx */
void __x86_get_pc_thunk_bx(int32_t a1, int32_t a2);

void fun_4b8();

void _init() {
    int32_t v1;
    int32_t v2;
    int32_t ebx3;

    __x86_get_pc_thunk_bx(v1, v2);
    if (*reinterpret_cast<int32_t*>(ebx3 + 0x1ba3 + 40)) {
        fun_4b8();
    }
    return;
}

/* __x86.get_pc_thunk.bx */
void __x86_get_pc_thunk_bx(int32_t a1, int32_t a2) {
    return;
}

struct s0 {
    signed char[40] pad40;
    int32_t f40;
};

void fun_4b8() {
    struct s0* ebx1;

    goto ebx1->f40;
}

struct s1 {
    signed char[36] pad36;
    int32_t f36;
};

void fun_4b0(int32_t a1) {
    struct s1* ebx2;

    goto ebx2->f36;
}

struct s2 {
    signed char[20] pad20;
    int32_t f20;
};

void fun_480(void* a1) {
    struct s2* ebx2;

    goto ebx2->f20;
}

void fun_470();

uint32_t __stack_chk_fail_local() {
    int32_t ebx1;
    int32_t v2;
    int32_t v3;
    int32_t v4;

    __x86_get_pc_thunk_bx(ebx1, __return_address());
    fun_470();
    __x86_get_pc_thunk_bx(v2, v3);
    goto v4;
}

/* __x86.get_pc_thunk.ax */
int32_t __x86_get_pc_thunk_ax();

uint32_t g14;

uint32_t check(uint32_t a1, void* a2) {
    void* ebp3;
    uint32_t eax4;
    uint32_t v5;
    uint32_t tmp32_6;
    unsigned char v7;
    uint32_t edx8;
    uint32_t eax9;
    uint32_t eax10;

    ebp3 = reinterpret_cast<void*>(reinterpret_cast<int32_t>(__zero_stack_offset()) - 4);
    __x86_get_pc_thunk_ax();
    eax4 = g14;
    v5 = eax4;
    tmp32_6 = a1 + 0x33e0f923;
    if (!(0x23eec421 ^ tmp32_6 | 1 - reinterpret_cast<uint1_t>(tmp32_6 < a1))) {
        v7 = 0;
        while (v7 <= 13) {
            edx8 = static_cast<uint32_t>(v7) ^ static_cast<uint32_t>(*reinterpret_cast<unsigned char*>(reinterpret_cast<int32_t>(ebp3) + (v7 + 7) - 51));
            *reinterpret_cast<signed char*>(reinterpret_cast<int32_t>(ebp3) + (v7 + 7) - 51) = *reinterpret_cast<signed char*>(&edx8);
            eax9 = v7 + 1;
            v7 = *reinterpret_cast<unsigned char*>(&eax9);
        }
        fun_480(reinterpret_cast<int32_t>(ebp3) - 51);
    }
    eax10 = v5 ^ g14;
    if (eax10) {
        eax10 = __stack_chk_fail_local();
    }
    return eax10;
}

/* __x86.get_pc_thunk.ax */
int32_t __x86_get_pc_thunk_ax() {
    return __return_address();
}

/* __x86.get_pc_thunk.dx */
void __x86_get_pc_thunk_dx();

struct s3 {
    signed char[32] pad32;
    int32_t f32;
};

void deregister_tm_clones(int32_t a1) {
    struct s3* edx2;
    int32_t edx3;
    int32_t ecx4;
    int32_t eax5;

    __x86_get_pc_thunk_dx();
    edx2 = reinterpret_cast<struct s3*>(edx3 + 0x1ab7);
    ecx4 = reinterpret_cast<int32_t>(edx2) + 60;
    if (reinterpret_cast<int32_t>(edx2) + 60 == ecx4 || (eax5 = edx2->f32, eax5 == 0)) {
        return;
    } else {
        eax5(ecx4);
        return;
    }
}

struct s4 {
    signed char[16] pad16;
    int32_t f16;
};

void fun_470() {
    struct s4* ebx1;

    goto ebx1->f16;
}

void fun_4f2(int32_t a1, void** a2, int32_t a3) {
    return;
}

struct s5 {
    signed char[24] pad24;
    int32_t f24;
};

void fun_490(int32_t a1, int32_t a2, void* a3, int32_t a4, int32_t a5, int32_t a6, void** a7, int32_t a8) {
    struct s5* ebx9;

    goto ebx9->f24;
}

/* __x86.get_pc_thunk.dx */
void __x86_get_pc_thunk_dx() {
    return;
}

struct s6 {
    signed char[12] pad12;
    int32_t f12;
};

void fun_460(int32_t a1) {
    struct s6* ebx2;

    goto ebx2->f12;
}

struct s7 {
    signed char[28] pad28;
    int32_t f28;
};

void fun_4a0(int32_t a1, void* a2) {
    struct s7* ebx3;

    goto ebx3->f28;
}

void fun_45c() {
    signed char* eax1;
    signed char* eax2;
    signed char al3;
    signed char* eax4;
    signed char* eax5;
    signed char al6;

    *eax1 = reinterpret_cast<signed char>(*eax2 + al3);
    *eax4 = reinterpret_cast<signed char>(*eax5 + al6);
}

void fun_544() {
}

void fun_84d() {
    return;
}

struct s8 {
    signed char[44] pad44;
    int32_t f44;
};

void _start() {
    void* esp1;
    void** v2;
    int32_t edx3;
    int32_t eax4;
    struct s8* ebx5;
    int32_t ebx6;
    int32_t v7;

    esp1 = reinterpret_cast<void*>(reinterpret_cast<int32_t>(__zero_stack_offset()) + 4);
    v2 = reinterpret_cast<void**>((reinterpret_cast<uint32_t>(esp1) & 0xfffffff0) - 4 - 4);
    fun_4f2(edx3, v2, eax4);
    ebx5 = reinterpret_cast<struct s8*>(ebx6 + 0x1afc);
    v7 = ebx5->f44;
    fun_490(v7, __return_address(), esp1, reinterpret_cast<int32_t>(ebx5) - 0x17dc, reinterpret_cast<int32_t>(ebx5) - 0x177c, edx3, v2, eax4);
    __asm__("hlt ");
}

struct s9 {
    signed char[8] pad8;
    int32_t f8;
};

void fun_466() {
    struct s9* ebx1;

    goto ebx1->f8;
}

struct s10 {
    signed char[48] pad48;
    int32_t f48;
};

void fun_54a() {
    struct s10* edx1;
    int32_t edx2;
    int32_t ecx3;
    uint32_t eax4;
    int32_t eax5;
    int32_t edx6;

    __x86_get_pc_thunk_dx();
    edx1 = reinterpret_cast<struct s10*>(edx2 + 0x1a77);
    ecx3 = reinterpret_cast<int32_t>(edx1) + 60;
    eax4 = reinterpret_cast<uint32_t>(reinterpret_cast<int32_t>(edx1) + 60 - ecx3 >> 2);
    eax5 = reinterpret_cast<int32_t>(eax4 + (eax4 >> 31)) >> 1;
    if (eax5 && (edx6 = edx1->f48, !!edx6)) {
        edx6(ecx3, eax5);
    }
    return;
}

struct s11 {
    signed char[36] pad36;
    int32_t f36;
    signed char[16] pad56;
    int32_t f56;
    signed char f60;
};

void fun_597() {
    int32_t ebx1;
    int32_t ebp2;
    struct s11* ebx3;
    int32_t ebx4;
    int32_t v5;

    __x86_get_pc_thunk_bx(ebx1, ebp2);
    ebx3 = reinterpret_cast<struct s11*>(ebx4 + 0x1a23);
    if (!ebx3->f60) {
        if (ebx3->f36) {
            v5 = ebx3->f56;
            fun_4b0(v5);
        }
        deregister_tm_clones(0x5a9);
        ebx3->f60 = 1;
    }
    return;
}

void fun_5e7() {
    goto 0x550;
}

void fun_486() {
    goto 0x450;
}

uint32_t main() {
    int32_t v1;
    int32_t v2;
    void* ebx3;
    void* ebx4;
    uint32_t eax5;
    void* v6;
    uint32_t eax7;
    uint32_t edx8;

    __x86_get_pc_thunk_bx(v1, v2);
    ebx3 = reinterpret_cast<void*>(reinterpret_cast<int32_t>(ebx4) + 0x18bf);
    eax5 = g14;
    fun_480(reinterpret_cast<int32_t>(ebx3) - 0x173c);
    fun_480(reinterpret_cast<int32_t>(ebx3) - 0x16fc);
    fun_480(reinterpret_cast<int32_t>(ebx3) - 0x16bc);
    fun_480(reinterpret_cast<int32_t>(ebx3) - 0x167c);
    fun_460(reinterpret_cast<int32_t>(ebx3) - 0x163c);
    v6 = reinterpret_cast<void*>((reinterpret_cast<uint32_t>(__zero_stack_offset()) & 0xfffffff0) - 4 - 4 - 16);
    fun_4a0(reinterpret_cast<int32_t>(ebx3) - 0x161a, v6);
    if (1) {
        check(0, v6);
    } else {
        check(0, v6);
    }
    eax7 = 0;
    edx8 = eax5 ^ g14;
    if (edx8) {
        eax7 = __stack_chk_fail_local();
    }
    return eax7;
}

void __libc_csu_init(int32_t a1) {
    int32_t v2;
    int32_t ebx3;
    int32_t esi4;
    int32_t ebx5;
    int32_t ebx6;
    int32_t ebp7;
    int32_t v8;
    int32_t esi9;
    int32_t edi10;
    int32_t esi11;

    v2 = reinterpret_cast<int32_t>(__return_address());
    __x86_get_pc_thunk_bx(ebx3, esi4);
    ebx5 = ebx6 + 0x17d3;
    ebp7 = v8;
    _init();
    esi9 = ebx5 - 0xfc - (ebx5 - 0x100) >> 2;
    if (esi9) {
        edi10 = 0;
        esi11 = esi9;
        do {
            *reinterpret_cast<int32_t*>(ebx5 + edi10 * 4 - 0x100)(v2, a1, ebp7, 0x811);
            ++edi10;
        } while (esi11 != edi10);
    }
    return;
}

void fun_476() {
    goto 0x450;
}

void fun_496() {
    goto 0x450;
}

void fun_4a6() {
    goto 0x450;
}
