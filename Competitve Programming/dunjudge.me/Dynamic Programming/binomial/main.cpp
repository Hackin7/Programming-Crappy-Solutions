#include <bits/stdc++.h>
using namespace std;

//12%
typedef unsigned long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll n,k;cin>>n>>k;
    
    //Calculate factorial;
    ll range = max(n,k);
    ll fmem[range+1];fmem[0]=1;
    for(int i=1;i<=range;i++){
        fmem[i]=fmem[i-1]*i;}
    
    cout<<fmem[n]/(fmem[k]*fmem[n-k]);
    return 0;
}
