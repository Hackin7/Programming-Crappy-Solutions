#include <bits/stdc++.h>
using namespace std;

int main() {
    void* rsp3;
    void* rbp4;
    void* rsp5;
    uint64_t rax6;
    uint64_t v7;
    int32_t v8;
    void* rsi10;
    int32_t eax11;
    int64_t rdi12;
    int64_t rax13;
    uint64_t rcx14;

    rsp3 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(__zero_stack_offset()) - 8);
    rbp4 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(__zero_stack_offset()) - 8);
    rsp5 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(rsp3) - 8 - 8 - 8 - 8 - 8 - 0x68);
    rax6 = g28;
    v7 = rax6;
    v8 = 0;
    while (v8 < 28) {
        *reinterpret_cast<signed char*>(reinterpret_cast<int64_t>(rbp4) + v8 - 96) = 67;
        ++v8;
    }
    printf("Hey there! Help me recover the flag! - Tracer\n> ");
    fgets(reinterpret_cast<int64_t>(rsp5) - 8 + 8 - 32, 29, stdin);
    rsi10 = reinterpret_cast<void*>(reinterpret_cast<int64_t>(rbp4) - 96);
    eax11 = strcmp(reinterpret_cast<int64_t>(rsp5) - 8 + 8 - 32, rsi10);
    if (eax11) {
        rdi12 = 0x2058;
        puts(0x2058, rsi10);
    } else {
        puts("Splendid! You got the flag!", rsi10);
    }
    *reinterpret_cast<int32_t*>(&rax13) = 0;
    *reinterpret_cast<int32_t*>(reinterpret_cast<int64_t>(&rax13) + 4) = 0;

}
