#include <bits/stdc++.h>
using namespace std;

int seq[1000000]; 
//Dynamic programming, storing values already computed
int fibo(int x, int mod){
    if (seq[x] != -1) return seq[x];
    //if (x==0 or x==1)return 1;
    seq[x] = (fibo(x-1,mod)+fibo(x-2,mod))%mod;
    return seq[x];
}
int main() {
    fill(seq,seq+1000000,-1);
    seq[0]=0;seq[1]=1;
    int n,m;cin>>n>>m;
    cout<<fibo(n,m);
    return 0;
}
