#include <cstdio>
#include <algorithm>
using namespace std;
#include "sandd.h"

int a,b,c,d,e,p,t;
int dcnt,scnt;
long long demand(int P){
    dcnt++;
    if(P<0||P>p) return -1;
    return p-1*P;
}
long long supply(int P){
    scnt++;
    if(P<0||P>p) return -1;
    return P;
}
int main () {
    scanf("%d",&p);
    dcnt=0;
    scnt=0;
    t=getPrice(p);
    printf("%d %d\n",t,max(dcnt,scnt));
}
