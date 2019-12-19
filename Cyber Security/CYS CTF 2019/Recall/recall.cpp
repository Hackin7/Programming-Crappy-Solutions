
int64_t printf = 0x1056;

void fun_1050(int64_t rdi) {
    goto printf;
}

int64_t fgets = 0x1066;

void fun_1060(void* rdi, int64_t rsi, int64_t rdx) {
    goto fgets;
}

int64_t strcmp = 0x1076;

int32_t fun_1070(void* rdi, void* rsi) {
    goto strcmp;
}

int64_t puts = 0x1036;

void fun_1030(int64_t rdi, void* rsi) {
    goto puts;
}

int64_t __stack_chk_fail = 0x1046;

int64_t fun_1040(int64_t rdi, void* rsi) {
    goto __stack_chk_fail;
}

int64_t _ITM_deregisterTMCloneTable = 0;

int64_t deregister_tm_clones(int64_t rdi) {
    int64_t rax2;

    rax2 = 0x4050;
    if (1 || (rax2 = _ITM_deregisterTMCloneTable, rax2 == 0)) {
        return rax2;
    } else {
        goto rax2;
    }
}

int64_t __gmon_start__ = 0;

void fun_1003() {
    int64_t rax1;

    __asm__("cli ");
    rax1 = __gmon_start__;
    if (rax1) {
        rax1();
    }
    return;
}

int64_t __libc_start_main = 0;

int64_t main(int32_t edi, int64_t rsi);

void fun_1083() {
    void* rsp1;
    int64_t rdx2;
    int64_t rax3;

    __asm__("cli ");
    rsp1 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(__zero_stack_offset()) + 8);
    __libc_start_main(main, __return_address(), rsp1, 0x1300, 0x1370, rdx2, (reinterpret_cast<uint64_t>(rsp1) & 0xfffffffffffffff0) - 8 - 8, rax3);
    __asm__("hlt ");
}

/* completed.7383 */
signed char completed_7383 = 0;

int64_t __cxa_finalize = 0;

int64_t __dso_handle = 0x4048;

int64_t fun_1123() {
    int1_t zf1;
    int64_t rax2;
    int1_t zf3;
    int64_t rdi4;
    int64_t rax5;

    __asm__("cli ");
    zf1 = completed_7383 == 0;
    if (!zf1) {
        return rax2;
    } else {
        zf3 = __cxa_finalize == 0;
        if (!zf3) {
            rdi4 = __dso_handle;
            __cxa_finalize(rdi4);
        }
        rax5 = deregister_tm_clones(rdi4);
        completed_7383 = 1;
        return rax5;
    }
}

int64_t _ITM_registerTMCloneTable = 0;

int64_t fun_1173() {
    int64_t rax1;

    __asm__("cli ");
    rax1 = 0;
    if (1 || (rax1 = _ITM_registerTMCloneTable, rax1 == 0)) {
        return rax1;
    } else {
        goto rax1;
    }
}

void _init();

void fun_1303(int32_t edi, int64_t rsi, int64_t rdx) {
    int64_t r14_4;
    int64_t r13_5;
    int32_t r12d6;
    int64_t rbx7;
    int64_t rdi8;

    __asm__("cli ");
    r14_4 = rdx;
    r13_5 = rsi;
    r12d6 = edi;
    _init();
    if (!0) {
        *reinterpret_cast<int32_t*>(&rbx7) = 0;
        *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rbx7) + 4) = 0;
        do {
            *reinterpret_cast<int32_t*>(&rdi8) = r12d6;
            *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rdi8) + 4) = 0;
            *reinterpret_cast<int64_t*>(0x3de8 + rbx7 * 8)(rdi8, r13_5, r14_4);
            ++rbx7;
        } while (1 != rbx7);
    }
    return;
}

void fun_1373() {
    __asm__("cli ");
    return;
}

void fun_137b() {
    __asm__("cli ");
    return;
}

uint64_t g28;

int64_t stdin = 0;

int64_t main(int32_t edi, int64_t rsi) {
    void* rsp3;
    void* rbp4;
    void* rsp5;
    uint64_t rax6;
    uint64_t v7;
    int32_t v8;
    int64_t rdx9;
    void* rsi10;
    int32_t eax11;
    int64_t rdi12;
    int64_t rax13;
    uint64_t rcx14;

    rsp3 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(__zero_stack_offset()) - 8);
    rbp4 = rsp3;
    rsp5 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(rsp3) - 8 - 8 - 8 - 8 - 8 - 0x68);
    rax6 = g28;
    v7 = rax6;
    v8 = 0;
    while (v8 < 28) {
        *reinterpret_cast<signed char*>(reinterpret_cast<int64_t>(rbp4) + v8 - 96) = 67;
        ++v8;
    }
    fun_1050("Hey there! Help me recover the flag! - Tracer\n> ");
    rdx9 = stdin;
    fun_1060(reinterpret_cast<int64_t>(rsp5) - 8 + 8 - 32, 29, rdx9);
    rsi10 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(rbp4) - 96);
    eax11 = fun_1070(reinterpret_cast<int64_t>(rsp5) - 8 + 8 - 32, rsi10);
    if (eax11) {
        rdi12 = 0x2058;
        fun_1030(0x2058, rsi10);
    } else {
        rdi12 = reinterpret_cast<int64_t>("Splendid! You got the flag!");
        fun_1030("Splendid! You got the flag!", rsi10);
    }
    *reinterpret_cast<int32_t*>(&rax13) = 0;
    *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rax13) + 4) = 0;
    rcx14 = v7 ^ g28;
    if (rcx14) {
        rax13 = fun_1040(rdi12, rsi10);
    }
    return rax13;
}

int64_t g4010 = 0;

void fun_1056() {
    goto g4010;
}

void fun_1066() {
    goto 0x1020;
}

void fun_1076() {
    goto 0x1020;
}

void fun_1036() {
    goto 0x1020;
}

void fun_1046() {
    goto 0x1020;
}
