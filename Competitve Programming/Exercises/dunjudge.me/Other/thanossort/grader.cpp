#include "thanossort.h"
#include <bits/stdc++.h>
using namespace std;
#include "thanossort.cpp"

static int n;
static int curr=0;
int main(){
    scanf("%d",&n);
    if (__builtin_popcount(n)!=1 || n<=0){
        printf("Wrong array size!\n");
        return 0;
    }
    printf("%d\n",thanosSort(n));
}

int nextInt(){
    if (curr==n){
        printf("Called nextInt too many time!\n");
        exit(0);
    }
    int temp;
    scanf("%d",&temp);
    if (temp<0 || 1000000000<temp){
        printf("Array element not correct size!\n");
        exit(0);
    }
    curr++;
    return temp;
}
