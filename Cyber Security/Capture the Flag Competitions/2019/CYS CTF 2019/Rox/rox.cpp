
int64_t __gmon_start__ = 0;

void _init() {
    int64_t rax1;

    rax1 = __gmon_start__;
    if (rax1) {
        rax1();
    }
    return;
}

int64_t __cxa_finalize = 0;

void fun_700(int64_t rdi) {
    goto __cxa_finalize;
}

int64_t __stack_chk_fail = 0x6c6;

uint64_t fun_6c0(void* rdi, ...) {
    goto __stack_chk_fail;
}

int64_t puts = 0x6a6;

void fun_6a0(void* rdi, int64_t rsi, ...) {
    goto puts;
}

int64_t _ITM_deregisterTMCloneTable = 0;

int64_t deregister_tm_clones(int64_t rdi) {
    int64_t rax2;

    rax2 = 0x201010;
    if (1 || (rax2 = _ITM_deregisterTMCloneTable, rax2 == 0)) {
        return rax2;
    } else {
        goto rax2;
    }
}

uint64_t g28;

uint64_t xor(void* rdi, int64_t rsi, int64_t rdx) {
    void* v4;
    uint64_t rax5;
    uint64_t v6;
    uint32_t v7;
    uint32_t edx8;
    uint64_t rax9;

    v4 = rdi;
    rax5 = g28;
    v6 = rax5;
    v7 = 0;
    while (v7 <= 25) {
        edx8 = static_cast<uint32_t>(*reinterpret_cast<unsigned char*>(reinterpret_cast<int64_t>(v4) + v7)) ^ 0x69;
        *reinterpret_cast<signed char*>(reinterpret_cast<int64_t>(v4) + reinterpret_cast<int32_t>(v7)) = *reinterpret_cast<signed char*>(&edx8);
        ++v7;
    }
    rax9 = v6 ^ g28;
    if (rax9) {
        rax9 = fun_6c0(rdi);
    }
    return rax9;
}

int64_t printf = 0x6d6;

void fun_6d0(int64_t rdi) {
    goto printf;
}

int64_t fgets = 0x6f6;

void fun_6f0(void* rdi, int64_t rsi, int64_t rdx) {
    goto fgets;
}

int64_t strcspn = 0x6e6;

void* fun_6e0(void* rdi, int64_t rsi, int64_t rdx) {
    goto strcspn;
}

int64_t strlen = 0x6b6;

uint32_t fun_6b0(void* rdi, int64_t rsi, int64_t rdx) {
    goto strlen;
}

int64_t __libc_start_main = 0;

uint64_t main(int32_t edi, int64_t rsi);

void __libc_csu_init(int32_t edi, int64_t rsi, int64_t rdx);

void __libc_csu_fini();

void _start() {
    void* rsp1;
    int64_t rdx2;
    int64_t rax3;

    rsp1 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(__zero_stack_offset()) + 8);
    __libc_start_main(main, __return_address(), rsp1, __libc_csu_init, __libc_csu_fini, rdx2, (reinterpret_cast<uint64_t>(rsp1) & 0xfffffffffffffff0) - 8 - 8, rax3);
    __asm__("hlt ");
}

void _fini() {
    return;
}

void fun_7b7() {
    int64_t v1;

    goto v1;
}

void __libc_csu_init(int32_t edi, int64_t rsi, int64_t rdx) {
    int64_t r15_4;
    int32_t r13d5;
    int64_t r14_6;
    int64_t rbx7;
    int64_t rdi8;

    r15_4 = rdx;
    r13d5 = edi;
    r14_6 = rsi;
    _init();
    if (!0) {
        *reinterpret_cast<int32_t*>(&rbx7) = 0;
        *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rbx7) + 4) = 0;
        do {
            *reinterpret_cast<int32_t*>(&rdi8) = r13d5;
            *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rdi8) + 4) = 0;
            *reinterpret_cast<int64_t*>(0x200d90 + rbx7 * 8)(rdi8, r14_6, r15_4);
            ++rbx7;
        } while (1 != rbx7);
    }
    return;
}

void __libc_csu_fini() {
    return;
}

int64_t _ITM_registerTMCloneTable = 0;

void fun_772() {
    int64_t rax1;

    if (1) 
        goto 0x7c0;
    rax1 = _ITM_registerTMCloneTable;
    if (!rax1) 
        goto 0x7c0;
    goto rax1;
}

/* completed.7697 */
signed char completed_7697 = 0;

int64_t __dso_handle = 0x201008;

int64_t __do_global_dtors_aux() {
    int1_t zf1;
    int64_t rax2;
    int1_t zf3;
    int64_t rdi4;
    int64_t rax5;

    zf1 = completed_7697 == 0;
    if (!zf1) {
        return rax2;
    } else {
        zf3 = __cxa_finalize == 0;
        if (!zf3) {
            rdi4 = __dso_handle;
            fun_700(rdi4);
        }
        rax5 = deregister_tm_clones(rdi4);
        completed_7697 = 1;
        return rax5;
    }
}

int64_t stdin = 0;

uint64_t main(int32_t edi, int64_t rsi) {
    void* rbp3;
    uint64_t rax4;
    uint64_t v5;
    int64_t rdx6;
    void* rax7;
    uint32_t eax8;
    uint32_t v9;
    uint32_t v10;
    uint32_t edx11;
    void* rdi12;
    uint64_t rax13;
    uint64_t rcx14;

    rbp3 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(__zero_stack_offset()) - 8);
    rax4 = g28;
    v5 = rax4;
    fun_6a0("==============================", rsi);
    fun_6a0("Hi there! Enter the flag below ", rsi);
    fun_6d0("==============================\nFlag> ");
    rdx6 = stdin;
    fun_6f0(reinterpret_cast<int64_t>(rbp3) - 0x90, 0x80, rdx6);
    rax7 = fun_6e0(reinterpret_cast<int64_t>(rbp3) - 0x90, "\r\n", rdx6);
    *reinterpret_cast<signed char*>(reinterpret_cast<int64_t>(rbp3) + reinterpret_cast<int64_t>(rax7) - 0x90) = 0;
    eax8 = fun_6b0(reinterpret_cast<int64_t>(rbp3) - 0x90, "\r\n", rdx6);
    v9 = eax8;
    if (v9 == 26) {
        xor(reinterpret_cast<int64_t>(rbp3) - 0x90, "\r\n", rdx6);
        v10 = 0;
        while (v9 > v10) {
            edx11 = *reinterpret_cast<unsigned char*>(reinterpret_cast<int64_t>(rbp3) + v10 - 0x90);
            if (*reinterpret_cast<signed char*>(&edx11) != 42) 
                goto addr_aa7_5;
            ++v10;
        }
    } else {
        rdi12 = reinterpret_cast<void*>("Not the flag :(");
        fun_6a0("Not the flag :(", "\r\n", "Not the flag :(", "\r\n");
        *reinterpret_cast<int32_t*>(&rax13) = 0;
        *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rax13) + 4) = 0;
        goto addr_ae0_8;
    }
    rdi12 = reinterpret_cast<void*>("You got the flag!");
    fun_6a0("You got the flag!", "\r\n", "You got the flag!", "\r\n");
    *reinterpret_cast<int32_t*>(&rax13) = 0;
    *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rax13) + 4) = 0;
    addr_ae0_8:
    rcx14 = v5 ^ g28;
    if (rcx14) {
        rax13 = fun_6c0(rdi12, rdi12);
    }
    return rax13;
    addr_aa7_5:
    rdi12 = reinterpret_cast<void*>("Not the flag :(");
    fun_6a0("Not the flag :(", "\r\n");
    *reinterpret_cast<int32_t*>(&rax13) = 0;
    *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rax13) + 4) = 0;
    goto addr_ae0_8;
}

int64_t g200fa0 = 0;

void fun_6c6() {
    goto g200fa0;
}

void fun_6a6() {
    goto 0x690;
}

void frame_dummy() {
    goto 0x780;
}

void fun_6d6() {
    goto 0x690;
}

void fun_6f6() {
    goto 0x690;
}

void fun_6e6() {
    goto 0x690;
}

void fun_6b6() {
    goto 0x690;
}
