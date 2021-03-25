
int printf = 0x1056;
void fun_1050(int rdi) {
    goto 0x1056;//printf;
}

int fgets = 0x1066;
void fun_1060(void* rdi, int rsi, int rdx) {
    goto 0x1066;//fgets;
}

int strcmp = 0x1076;
int fun_1070(void* rdi, void* rsi) {
    goto 0x1076;//strcmp;
}

int puts = 0x1036;

void fun_1030(int rdi, void* rsi) {
    goto 0x1036;//puts;
}

int __stack_chk_fail = 0x1046;

int fun_1040(int rdi, void* rsi) {
    goto __stack_chk_fail;
}

int _ITM_deregisterTMCloneTable = 0;

int deregister_tm_clones(int rdi) {
    int rax2;

    rax2 = 0x4050;
    if (1 || (rax2 = _ITM_deregisterTMCloneTable, rax2 == 0)) {
        return rax2;
    } else {
        goto rax2;
    }
}

int __gmon_start__ = 0;

void fun_1003() {
    int rax1;

    __asm__("cli ");
    rax1 = __gmon_start__;
    if (rax1) {
        rax1();
    }
    return;
}

int __libc_start_main = 0;

int main(int edi, int rsi);

void fun_1083() {
    void* rsp1;
    int rdx2;
    int rax3;

    __asm__("cli ");
    rsp1 = reinterpret_cast<void*>(reinterpret_cast<int>(__zero_stack_offset()) + 8);
    __libc_start_main(main, __return_address(), rsp1, 0x1300, 0x1370, rdx2, (reinterpret_cast<uint>(rsp1) & 0xfffffffffffffff0) - 8 - 8, rax3);
    __asm__("hlt ");
}

/* completed.7383 */
signed char completed_7383 = 0;

int __cxa_finalize = 0;

int __dso_handle = 0x4048;

int fun_1123() {
    int1_t zf1;
    int rax2;
    int1_t zf3;
    int rdi4;
    int rax5;

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

int _ITM_registerTMCloneTable = 0;

int fun_1173() {
    int rax1;

    __asm__("cli ");
    rax1 = 0;
    if (1 || (rax1 = _ITM_registerTMCloneTable, rax1 == 0)) {
        return rax1;
    } else {
        goto rax1;
    }
}

void _init();

void fun_1303(int edi, int rsi, int rdx) {
    int r14_4;
    int r13_5;
    int r12d6;
    int rbx7;
    int rdi8;

    __asm__("cli ");
    r14_4 = rdx;
    r13_5 = rsi;
    r12d6 = edi;
    _init();
    if (!0) {
        *reinterpret_cast<int*>(&rbx7) = 0;
        *reinterpret_cast<int*>(reinterpret_cast<int>(&rbx7) + 4) = 0;
        do {
            *reinterpret_cast<int*>(&rdi8) = r12d6;
            *reinterpret_cast<int*>(reinterpret_cast<int>(&rdi8) + 4) = 0;
            *reinterpret_cast<int*>(0x3de8 + rbx7 * 8)(rdi8, r13_5, r14_4);
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

uint g28;

int stdin = 0;

int main(int edi, int rsi) {
    void* rsp3;
    void* rbp4;
    void* rsp5;
    uint rax6;
    uint v7;
    int v8;
    int rdx9;
    void* rsi10;
    int eax11;
    int rdi12;
    int rax13;
    uint rcx14;

    rsp3 = reinterpret_cast<void*>(reinterpret_cast<int>(__zero_stack_offset()) - 8);
    rbp4 = rsp3;
    rsp5 = reinterpret_cast<void*>(reinterpret_cast<int>(rsp3) - 8 - 8 - 8 - 8 - 8 - 0x68);
    rax6 = g28;
    v7 = rax6;
    v8 = 0;
    while (v8 < 28) {
        *reinterpret_cast<signed char*>(reinterpret_cast<int>(rbp4) + v8 - 96) = 67;
        ++v8;
    }
    fun_1050("Hey there! Help me recover the flag! - Tracer\n> ");
    rdx9 = stdin;
    fun_1060(reinterpret_cast<int>(rsp5) - 8 + 8 - 32, 29, rdx9);
    rsi10 = reinterpret_cast<void*>(reinterpret_cast<int>(rbp4) - 96);
    eax11 = fun_1070(reinterpret_cast<int>(rsp5) - 8 + 8 - 32, rsi10);
    if (eax11) {
        rdi12 = 0x2058;
        fun_1030(0x2058, rsi10);
    } else {
        rdi12 = reinterpret_cast<int>("Splendid! You got the flag!");
        fun_1030("Splendid! You got the flag!", rsi10);
    }
    *reinterpret_cast<int*>(&rax13) = 0;
    *reinterpret_cast<int*>(reinterpret_cast<int>(&rax13) + 4) = 0;
    rcx14 = v7 ^ g28;
    if (rcx14) {
        rax13 = fun_1040(rdi12, rsi10);
    }
    return rax13;
}

int g4010 = 0;

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
