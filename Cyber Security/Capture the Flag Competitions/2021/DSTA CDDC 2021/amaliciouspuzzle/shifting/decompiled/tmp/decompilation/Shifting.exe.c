//
// This file was generated by the Retargetable Decompiler
// Website: https://retdec.com
// Copyright (c) Retargetable Decompiler <info@retdec.com>
//

#include <stdbool.h>
#include <stdint.h>
#include <stdlib.h>

// ------------------- Function Prototypes --------------------

int32_t ___chkstk_ms(void);
int32_t ___do_global_ctors(void);
int32_t ___main(void);
int32_t __Unwind_Resume(int32_t a1);
int32_t __Z6cryptoRKNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE(int32_t * result, int32_t * a2);
int32_t __ZN9__gnu_cxx12__to_xstringINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEcEET_PFiPT0_jPKS8_PcEjSB_z(int32_t * this, int32_t * result, int32_t (*a3)(char *, int32_t, char *, char *), int32_t a4, char * a5, ...);
bool __ZN9__gnu_cxx17__is_null_pointerIcEEbPT_(char * a1);
int32_t __ZN9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEppEv(void);
bool __ZN9__gnu_cxxneIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEEbRKNS_17__normal_iteratorIT_T0_EESE_(int32_t * a1, int32_t * a2);
int32_t __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEE4baseEv(void);
int32_t __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEdeEv(void);
void __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_M_constructIPcEEvT_S7_(char * a1, char * a2);
void __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_M_constructIPcEEvT_S7_St20forward_iterator_tag(char * a1, char * a2, int32_t a3);
void __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE16_M_construct_auxIPcEEvT_S7_St12__false_type(char * a1, char * a2, int32_t a3);
int32_t __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1IPcvEET_S7_RKS3_(char * a1, char * a2, int32_t * a3);
int32_t __ZNSt7__cxx119to_stringEi(int32_t * result, int32_t a2);
int32_t __ZSt10__distanceIPcENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag(char * a1, char * a2, int32_t a3);
int32_t __ZSt19__iterator_categoryIPcENSt15iterator_traitsIT_E17iterator_categoryERKS2_(char ** a1);
int32_t * __ZSt4moveIRNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEONSt16remove_referenceIT_E4typeEOS8_(int32_t ** a1);
int32_t __ZSt8distanceIPcENSt15iterator_traitsIT_E15difference_typeES2_S2_(char * a1, char * a2);
bool __ZSteqIcSt11char_traitsIcESaIcEEbRKNSt7__cxx1112basic_stringIT_T0_T1_EEPKS5_(int32_t * a1, char * a2);
int32_t __ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EEOS8_PKS5_(int32_t * result, int32_t * a2, char * a3);
int32_t * __ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_EE(int32_t * a1, int32_t * a2);
int32_t _atexit(int32_t a1);
int32_t function_401845(void);
int32_t function_407a1e(void);
int32_t function_407bd5(void);
int32_t function_407c67(void);

// --------------------- Global Variables ---------------------

int32_t g1 = -1; // 0x407db0
char * g2; // 0x409048
int32_t g3 = 0x45000020; // 0x409049
int32_t g4 = 0x63410071; // 0x4090d7
int32_t g5 = 0; // 0x40c038
int32_t g6;

// ------------------------ Functions -------------------------

// Address range: 0x4014c0 - 0x4014dd
int32_t _atexit(int32_t a1) {
    // 0x4014c0
    return _onexit((int32_t (*)())a1) == NULL;
}

// Address range: 0x4015e8 - 0x40171b
// Demangled:     crypto(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&)
int32_t __Z6cryptoRKNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE(int32_t * result, int32_t * a2) {
    // 0x4015e8
    _ZNSaIcEC1Ev();
    int32_t v1; // bp-69, 0x4015e8
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_((char *)&g2, &v1);
    int32_t v2; // bp-116, 0x4015e8
    int32_t v3 = &v2; // 0x40160f
    _ZNSaIcED1Ev();
    int32_t v4 = _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE5beginEv(); // bp-76, 0x40162c
    int32_t v5 = _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE3endEv(); // bp-80, 0x401639
    int32_t * v6 = (int32_t *)(v3 + 4); // 0x40163f
    int32_t v7 = &v5; // 0x40163f
    *v6 = v7;
    int32_t v8 = &v4; // 0x401646
    v2 = v8;
    bool v9 = __ZN9__gnu_cxxneIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEEbRKNS_17__normal_iteratorIT_T0_EESE_(&g6, &g6); // 0x401649
    if (!v9) {
        // 0x401712
        return (int32_t)result;
    }
    // 0x401656
    int32_t v10; // bp-44, 0x4015e8
    int32_t v11 = &v10;
    int32_t v12; // bp-68, 0x4015e8
    int32_t v13 = &v12;
    int32_t * v14 = &v2; // 0x401646
    int32_t v15 = __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEdeEv(); // 0x40165b
    unsigned char v16 = *(char *)v15; // 0x401660
    *v6 = 16 * (int32_t)v16;
    *v14 = v11;
    __ZNSt7__cxx119to_stringEi((int32_t *)(int32_t)v16, (int32_t)&g6);
    *(int32_t *)(v3 + 8) = (int32_t)&g3;
    *v6 = v11;
    *v14 = v13;
    __ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EEOS8_PKS5_(&g6, &g6, (char *)&g6);
    *v14 = v13;
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEpLERKS4_(&g6);
    int32_t v17 = v3 - 4; // 0x4016a6
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
    __ZN9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEppEv();
    int32_t * v18 = (int32_t *)v3; // 0x40163f
    *v18 = v7;
    v14 = (int32_t *)v17;
    *v14 = v8;
    while (__ZN9__gnu_cxxneIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEEbRKNS_17__normal_iteratorIT_T0_EESE_(&g6, &g6)) {
        int32_t v19 = v17;
        v15 = __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEdeEv();
        v16 = *(char *)v15;
        *v18 = 16 * (int32_t)v16;
        *v14 = v11;
        __ZNSt7__cxx119to_stringEi((int32_t *)(int32_t)v16, (int32_t)&g6);
        *(int32_t *)(v19 + 8) = (int32_t)&g3;
        *v18 = v11;
        *v14 = v13;
        __ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EEOS8_PKS5_(&g6, &g6, (char *)&g6);
        *v14 = v13;
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEpLERKS4_(&g6);
        v17 = v19 - 4;
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
        __ZN9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEppEv();
        v18 = (int32_t *)v19;
        *v18 = v7;
        v14 = (int32_t *)v17;
        *v14 = v8;
    }
    // 0x401712
    return (int32_t)result;
}

// Address range: 0x40171b - 0x40182f
int main(int argc, char ** argv) {
    // 0x40171b
    ___main();
    int32_t v1; // bp-80, 0x40171b
    int32_t v2 = &v1;
    int32_t v3; // bp-56, 0x40171b
    int32_t v4 = &v3;
    int32_t v5; // bp-96, 0x40171b
    int32_t v6 = &v5; // 0x40172e
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1Ev();
    int32_t * v7 = (int32_t *)(v6 + 4);
    *v7 = (int32_t)"Enter Password (or q to quit): ";
    int32_t * v8 = (int32_t *)v6;
    *v8 = 0x40d378;
    _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(&g6, (char *)&g6);
    *v7 = v2;
    *v8 = 0x40d374;
    __ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_EE(&g6, &g6);
    *v7 = v2;
    *v8 = v4;
    __Z6cryptoRKNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE(&g6, &g6);
    *v7 = (int32_t)"1072 1088 1088 1072 800 784 1968 848 880 1824 784 1760 864 880 1664 816 768 1824 1936 2000 ";
    *v8 = v4;
    bool v9 = __ZSteqIcSt11char_traitsIcESaIcEEbRKNSt7__cxx1112basic_stringIT_T0_T1_EEPKS5_(&g6, (char *)&g6); // 0x401784
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
    while (!v9) {
        // 0x4017ca
        *v7 = (int32_t)&g4;
        *v8 = v2;
        if (__ZSteqIcSt11char_traitsIcESaIcEEbRKNSt7__cxx1112basic_stringIT_T0_T1_EEPKS5_(&g6, (char *)&g6)) {
            // 0x40182b
            _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
            return function_401845();
        }
        // 0x401817
        *v7 = (int32_t)"Access Denied";
        *v8 = 0x40d378;
        _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(&g6, (char *)&g6);
        *v8 = 0x4018dc;
        _ZNSolsEPFRSoS_E((int32_t * (*)(int32_t *))&g6);
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
        v6 -= 4;
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1Ev();
        v7 = (int32_t *)(v6 + 4);
        *v7 = (int32_t)"Enter Password (or q to quit): ";
        v8 = (int32_t *)v6;
        *v8 = 0x40d378;
        _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(&g6, (char *)&g6);
        *v7 = v2;
        *v8 = 0x40d374;
        __ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_EE(&g6, &g6);
        *v7 = v2;
        *v8 = v4;
        __Z6cryptoRKNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEE(&g6, &g6);
        *v7 = (int32_t)"1072 1088 1088 1072 800 784 1968 848 880 1824 784 1760 864 880 1664 816 768 1824 1936 2000 ";
        *v8 = v4;
        v9 = __ZSteqIcSt11char_traitsIcESaIcEEbRKNSt7__cxx1112basic_stringIT_T0_T1_EEPKS5_(&g6, (char *)&g6);
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
    }
    // 0x401799
    *v7 = (int32_t)"Access Granted";
    *v8 = 0x40d378;
    _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(&g6, (char *)&g6);
    *v8 = 0x4018dc;
    _ZNSolsEPFRSoS_E((int32_t * (*)(int32_t *))&g6);
    // 0x40182b
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev();
    return function_401845();
}

// Address range: 0x401845 - 0x401850
int32_t function_401845(void) {
    // 0x401845
    int32_t result; // 0x401845
    return result;
}

// Address range: 0x4018cc - 0x4018d2
// Demangled:     std::basic_istream<char, std::char_traits<char> >& std::operator>><char, std::char_traits<char>, std::allocator<char> >(std::basic_istream<char, std::char_traits<char> >&, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >&)
int32_t * __ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_EE(int32_t * a1, int32_t * a2) {
    // 0x4018cc
    return (int32_t *)_ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_();
}

// Address range: 0x4019f0 - 0x401a36
int32_t ___do_global_ctors(void) {
    int32_t v1 = 0;
    int32_t v2 = v1 + 1; // 0x401a26
    while (*(int32_t *)(4 * v2 + (int32_t)&g1) != 0) {
        // 0x401a26
        v1 = v2;
        v2 = v1 + 1;
    }
    // 0x401a34
    if (v1 == 0) {
        // 0x401a0f
        return _atexit(0x4019b0);
    }
    int32_t v3 = v1; // 0x401a01
    while (v3 != 1) {
        // 0x401a03
        v3--;
    }
    // 0x401a0f
    return _atexit(0x4019b0);
}

// Address range: 0x401a40 - 0x401a5c
int32_t ___main(void) {
    int32_t result = g5; // 0x401a40
    if (result != 0) {
        // 0x401a49
        return result;
    }
    // 0x401a50
    g5 = 1;
    return ___do_global_ctors();
}

// Address range: 0x402920 - 0x402926
int32_t __Unwind_Resume(int32_t a1) {
    // 0x402920
    return _Unwind_Resume();
}

// Address range: 0x402928 - 0x402952
int32_t ___chkstk_ms(void) {
    // 0x402928
    int32_t result; // 0x402928
    return result;
}

// Address range: 0x407968 - 0x407a08
// Demangled:     std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > __gnu_cxx::__to_xstring<std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >, char>(int (*)(char*, unsigned int, char const*, char*), unsigned int, char const*, ...)
int32_t __ZN9__gnu_cxx12__to_xstringINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEcEET_PFiPT0_jPKS8_PcEjSB_z(int32_t * this, int32_t * result, int32_t (*a3)(char *, int32_t, char *, char *), int32_t a4, char * a5, ...) {
    // 0x407968
    int32_t v1; // bp-44, 0x407968
    int32_t v2 = (int32_t)&v1 - ___chkstk_ms(); // 0x407993
    int32_t v3 = v2 + 31 & -16; // 0x40799c
    int32_t v4; // bp+20, 0x407968
    *(int32_t *)(v2 + 12) = (int32_t)&v4;
    int32_t * v5 = (int32_t *)(v2 + 8); // 0x4079b5
    *v5 = a4;
    int32_t * v6 = (int32_t *)(v2 + 4); // 0x4079bc
    *v6 = (int32_t)a3;
    int32_t * v7 = (int32_t *)v2; // 0x4079c3
    *v7 = v3;
    _ZNSaIcEC1Ev();
    int32_t v8; // bp-21, 0x407968
    *v5 = (int32_t)&v8;
    *v6 = v3 + (int32_t)result;
    *v7 = v3;
    __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1IPcvEET_S7_RKS3_((char *)&g6, (char *)&g6, &g6);
    _ZNSaIcED1Ev();
    return function_407a1e();
}

// Address range: 0x407a1e - 0x407a26
int32_t function_407a1e(void) {
    // 0x407a1e
    int32_t v1; // 0x407a1e
    return *(int32_t *)(v1 + 8);
}

// Address range: 0x407a28 - 0x407a34
// Demangled:     bool __gnu_cxx::__is_null_pointer<char>(char*)
bool __ZN9__gnu_cxx17__is_null_pointerIcEEbPT_(char * a1) {
    // 0x407a28
    return a1 == NULL;
}

// Address range: 0x407a34 - 0x407a4f
// Demangled:     __gnu_cxx::__normal_iterator<char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > >::operator++()
int32_t __ZN9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEppEv(void) {
    // 0x407a34
    int32_t result; // 0x407a34
    *(int32_t *)result = result + 1;
    return result;
}

// Address range: 0x407a50 - 0x407a78
// Demangled:     bool __gnu_cxx::operator!=<char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > >(__gnu_cxx::__normal_iterator<char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > > const&, __gnu_cxx::__normal_iterator<char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > > const&)
bool __ZN9__gnu_cxxneIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEEbRKNS_17__normal_iteratorIT_T0_EESE_(int32_t * a1, int32_t * a2) {
    int32_t v1 = __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEE4baseEv(); // 0x407a5a
    int32_t v2 = __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEE4baseEv(); // 0x407a66
    return *(int32_t *)v1 != *(int32_t *)v2;
}

// Address range: 0x407a78 - 0x407a86
// Demangled:     __gnu_cxx::__normal_iterator<char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > >::base() const
int32_t __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEE4baseEv(void) {
    // 0x407a78
    int32_t result; // 0x407a78
    return result;
}

// Address range: 0x407a88 - 0x407a98
// Demangled:     __gnu_cxx::__normal_iterator<char const*, std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > >::operator*() const
int32_t __ZNK9__gnu_cxx17__normal_iteratorIPKcNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEdeEv(void) {
    // 0x407a88
    int32_t result; // 0x407a88
    return result;
}

// Address range: 0x407ab0 - 0x407adc
// Demangled:     void std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >::_M_construct<char*>(char*, char*)
void __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_M_constructIPcEEvT_S7_(char * a1, char * a2) {
    // 0x407ab0
    int32_t v1; // 0x407ab0
    __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE16_M_construct_auxIPcEEvT_S7_St12__false_type(a1, a2, 0x1000000 * v1 / 0x1000000);
}

// Address range: 0x407adc - 0x407bad
// Demangled:     void std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >::_M_construct<char*>(char*, char*, std::forward_iterator_tag)
void __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_M_constructIPcEEvT_S7_St20forward_iterator_tag(char * a1, char * a2, int32_t a3) {
    char * v1 = a1; // bp-60, 0x407ae9
    if (!((a1 == a2 | !__ZN9__gnu_cxx17__is_null_pointerIcEEbPT_(a1)))) {
        // 0x407b0d
        v1 = "basic_string::_M_construct null not valid";
        _ZSt19__throw_logic_errorPKc("basic_string::_M_construct null not valid");
    }
    int32_t v2 = (int32_t)a1;
    *(int32_t *)&v1 = v2;
    int32_t v3 = __ZSt8distanceIPcENSt15iterator_traitsIT_E15difference_typeES2_S2_(a1, a2); // 0x407b26
    int32_t v4 = v3; // bp-16, 0x407b2b
    int32_t v5 = (int32_t)&v1; // 0x407b34
    if (v3 >= 16) {
        // 0x407b36
        v1 = (char *)&v4;
        int32_t v6 = _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE9_M_createERjj(&v4, 0); // 0x407b49
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7_M_dataEPc((char *)v6);
        _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE11_M_capacityEj(v4);
        int32_t v7; // bp-76, 0x407adc
        v5 = &v7;
    }
    int32_t v8 = _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7_M_dataEv(); // 0x407b7b
    *(int32_t *)(v5 + 8) = (int32_t)a2;
    *(int32_t *)(v5 + 4) = v2;
    int32_t * v9 = (int32_t *)v5; // 0x407b90
    *v9 = v8;
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE13_S_copy_charsEPcS5_S5_((char *)&g6, (char *)&g6, (char *)&g6);
    *v9 = v4;
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE13_M_set_lengthEj((int32_t)&g6);
    function_407bd5();
}

// Address range: 0x407bd5 - 0x407bdc
int32_t function_407bd5(void) {
    // 0x407bd5
    int32_t result; // 0x407bd5
    return result;
}

// Address range: 0x407bdc - 0x407c08
// Demangled:     void std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >::_M_construct_aux<char*>(char*, char*, std::__false_type)
void __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE16_M_construct_auxIPcEEvT_S7_St12__false_type(char * a1, char * a2, int32_t a3) {
    // 0x407bdc
    int32_t v1; // 0x407bdc
    __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_M_constructIPcEEvT_S7_St20forward_iterator_tag(a1, a2, 0x1000000 * v1 / 0x1000000);
}

// Address range: 0x407c08 - 0x407c51
// Demangled:     std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >::basic_string<char*, void>(char*, char*, std::allocator<char> const&)
int32_t __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1IPcvEET_S7_RKS3_(char * a1, char * a2, int32_t * a3) {
    // 0x407c08
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_Alloc_hiderC1EPcRKS3_((char *)_ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE13_M_local_dataEv(), a3);
    __ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_M_constructIPcEEvT_S7_(a1, a2);
    return function_407c67();
}

// Address range: 0x407c67 - 0x407c6e
int32_t function_407c67(void) {
    // 0x407c67
    int32_t result; // 0x407c67
    return result;
}

// Address range: 0x407c70 - 0x407ca5
// Demangled:     std::__cxx11::to_string(int)
int32_t __ZNSt7__cxx119to_stringEi(int32_t * result, int32_t a2) {
    // 0x407c70
    __ZN9__gnu_cxx12__to_xstringINSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEcEET_PFiPT0_jPKS8_PcEjSB_z(result, (int32_t *)0x4015c0, (int32_t (*)(char *, int32_t, char *, char *))16, (int32_t)"%d", (char *)a2);
    return (int32_t)result;
}

// Address range: 0x407ca8 - 0x407cb3
// Demangled:     std::iterator_traits<char*>::difference_type std::__distance<char*>(char*, char*, std::random_access_iterator_tag)
int32_t __ZSt10__distanceIPcENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag(char * a1, char * a2, int32_t a3) {
    // 0x407ca8
    return (int32_t)a2 - (int32_t)a1;
}

// Address range: 0x407cb4 - 0x407cb5
// Demangled:     std::iterator_traits<char*>::iterator_category std::__iterator_category<char*>(char* const&)
int32_t __ZSt19__iterator_categoryIPcENSt15iterator_traitsIT_E17iterator_categoryERKS2_(char ** a1) {
    // 0x407cb4
    int32_t result; // 0x407cb4
    return result;
}

// Address range: 0x407cb8 - 0x407cc0
// Demangled:     std::remove_reference<std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >&>::type&& std::move<std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >&>(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >&)
int32_t * __ZSt4moveIRNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEONSt16remove_referenceIT_E4typeEOS8_(int32_t ** a1) {
    // 0x407cb8
    return (int32_t *)a1;
}

// Address range: 0x407cc0 - 0x407cef
// Demangled:     std::iterator_traits<char*>::difference_type std::distance<char*>(char*, char*)
int32_t __ZSt8distanceIPcENSt15iterator_traitsIT_E15difference_typeES2_S2_(char * a1, char * a2) {
    char * v1 = a1;
    __ZSt19__iterator_categoryIPcENSt15iterator_traitsIT_E17iterator_categoryERKS2_(&v1);
    int32_t v2; // 0x407cc0
    return __ZSt10__distanceIPcENSt15iterator_traitsIT_E15difference_typeES2_S2_St26random_access_iterator_tag(v1, a2, 0x1000000 * v2 / 0x1000000);
}

// Address range: 0x407cf0 - 0x407d0e
// Demangled:     bool std::operator==<char, std::char_traits<char>, std::allocator<char> >(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > const&, char const*)
bool __ZSteqIcSt11char_traitsIcESaIcEEbRKNSt7__cxx1112basic_stringIT_T0_T1_EEPKS5_(int32_t * a1, char * a2) {
    // 0x407cf0
    return _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7compareEPKc(a2) == 0;
}

// Address range: 0x407d10 - 0x407d44
// Demangled:     std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> > std::operator+<char, std::char_traits<char>, std::allocator<char> >(std::__cxx11::basic_string<char, std::char_traits<char>, std::allocator<char> >&&, char const*)
int32_t __ZStplIcSt11char_traitsIcESaIcEENSt7__cxx1112basic_stringIT_T0_T1_EEOS8_PKS5_(int32_t * result, int32_t * a2, char * a3) {
    int32_t v1 = _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE6appendEPKc(a3); // 0x407d21
    _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EOS4_(__ZSt4moveIRNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEEEONSt16remove_referenceIT_E4typeEOS8_((int32_t **)v1));
    return (int32_t)result;
}

// --------------- Dynamically Linked Functions ---------------

// _onexit_t _onexit(_onexit_t Function);
// int32_t _Unwind_Resume(void);
// int32_t _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE3endEv(void);
// int32_t _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE5beginEv(void);
// int32_t _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7_M_dataEv(void);
// int32_t _ZNKSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7compareEPKc(char * a1);
// int32_t _ZNSaIcEC1Ev(void);
// int32_t _ZNSaIcED1Ev(void);
// int32_t _ZNSolsEPFRSoS_E(int32_t * (*a1)(int32_t *));
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE11_M_capacityEj(int32_t a1);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE12_Alloc_hiderC1EPcRKS3_(char * a1, int32_t * a2);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE13_M_local_dataEv(void);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE13_M_set_lengthEj(int32_t a1);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE13_S_copy_charsEPcS5_S5_(char * a1, char * a2, char * a3);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE6appendEPKc(char * a1);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE7_M_dataEPc(char * a1);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEE9_M_createERjj(int32_t * a1, int32_t a2);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EOS4_(int32_t * a1);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1EPKcRKS3_(char * a1, int32_t * a2);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEC1Ev(void);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEED1Ev(void);
// int32_t _ZNSt7__cxx1112basic_stringIcSt11char_traitsIcESaIcEEpLERKS4_(int32_t * a1);
// int32_t _ZSt19__throw_logic_errorPKc(char * a1);
// int32_t _ZStlsISt11char_traitsIcEERSt13basic_ostreamIcT_ES5_PKc(int32_t * a1, char * a2);
// int32_t _ZStrsIcSt11char_traitsIcESaIcEERSt13basic_istreamIT_T0_ES7_RNSt7__cxx1112basic_stringIS4_S5_T1_(void);

// --------------------- Meta-Information ---------------------

// Detected compiler/packer: gcc (8.1.0)
// Detected language: C
// Detected functions: 29