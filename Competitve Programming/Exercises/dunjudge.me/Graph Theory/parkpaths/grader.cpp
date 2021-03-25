#include "parkpaths.h"
#include "parkpaths.cpp"
#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    char cS[100005];
    scanf("%s", &cS);
    printf("%d\n", parkpaths(string(cS)));
}
/*
BANANA
5
*/
