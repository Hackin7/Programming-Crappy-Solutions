#include <iostream>
using namespace std;
#include "sandd.h"

typedef long long ll;
ll getDemand(int P){
    return demand(P);
}
ll getSupply(int P){
    return supply(P);
}

bool bsCmp(int i){
    return getDemand(i)-getSupply(i)<0;
}
//find the minimum i such that f(i) is true
bool findMin=true;
int binarySearch(int l, int r) { 
    int m;
    while (l <= r) { 
        m = (l+r)/ 2; 
        bool cmp = findMin?bsCmp(m):!bsCmp(m);
        if (cmp){r = m-1;}
        else{l = m + 1;}
    }
    return l; 
} 

int getPrice (int P){
    int low=0,high=P,ep=0.5*(low+high);
    int equilibriumPrice = binarySearch(low,high);
    
    return equilibriumPrice;
}
