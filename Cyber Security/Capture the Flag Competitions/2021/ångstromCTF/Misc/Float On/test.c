#include <stdio.h>
#include <stdint.h>
#include <string.h>
#include <assert.h>

#define DO_STAGE(num, cond) do {\
    printf("Stage " #num ": ");\
    scanf("%lu", &converter.uint);\
    x = converter.dbl;\
    printf("Values:%f %f %u %d %ull\n",x,converter.dbl, converter.uint, converter.uint, converter.uint);\
    printf("Calculations:%f %f %f\n", -x, x+1, x*2);\
    printf("Conditions:%d %d %d %d\n", x ==-x, x!=x, (x+1) == x, (x*2)==x);\
    if(cond) {\
        puts("Stage " #num " passed!");\
    } else {\
        puts("Stage " #num " failed!");\
    }\
} while(0);

void print_flag() {
    FILE* flagfile = fopen("flag.txt", "r");
    if (flagfile == NULL) {
        puts("Couldn't find a flag file.");
        return;
    }
    char flag[128];
    fgets(flag, 128, flagfile);
    flag[strcspn(flag, "\n")] = '\x00';
    puts(flag);
}

union cast {
    uint64_t uint;
    double dbl;
};

// https://stackoverflow.com/questions/6235847/how-to-generate-nan-infinity-and-infinity-in-ansi-c

void converter(double b){
    uint64_t v = *(uint64_t *)&b;
    printf("Converted %f to %u \n",b, v);
}
int main(void) {
    // Personal Testing
    uint64_t p = 0x7FF0000000000000; // 9218868437227405312 in binary
    uint64_t n = 0xFFF0000000000000; // 18442240474082181120
    unsigned int pnan = 0x7F800001; // or anything above this up to 0x7FFFFFFF
    unsigned int nnan = 0xFF800001; // or anything above this up to 0xFFFFFFFF

    double positiveInfinity = *(double *)&p;
    double negativeInfinity = *(double *)&n;
    double positiveNaN = *(double *)&pnan;
    double negativeNaN = *(double *)&nnan;

    converter(0.000001);
    printf("%u ",p);
    printf("%u ",n);
    printf("%u ",pnan);
    printf("%u ",nnan);
    printf("\n");
    printf("%f ",positiveInfinity );
    printf("%f ",negativeInfinity );
    printf("\n");

    // Actual Given Code
    union cast converter;
    double x;

    DO_STAGE(1, x == -x);
    DO_STAGE(2, x != x); // Put nan, so input -1
    DO_STAGE(3, x + 1 == x && x * 2 == x);
    DO_STAGE(4, x + 1 == x && x * 2 != x);
    DO_STAGE(5, (1 + x) - 1 != 1 + (x - 1)); // Put nan, so input -1

    print_flag();

    return 0;
}
