#include <bits/stdc++.h>
using namespace std;

int main(){
    int N,K;cin>>N>>K;
    int pebble[N+1];for(int i=0;i<N;i++){cin>>pebble[i];}
    pebble[N]=0;
    if (K==1){cout<<*max_element(pebble,pebble+N);return 0;}

    int fmem[N+1];fmem[0]=pebble[0];
    deque<int> before;

    for (int i=1;i<=N;i++){
        if (before.size()==K){before.pop_front();}
        before.push_back(fmem[i-1]);
        fmem[i] = max(*min_element(before.begin(),before.end()),pebble[i]);
    }
    //for (int i=0;i<n;i++){f(i);}
    cout<<fmem[N];
    return 0;
}
