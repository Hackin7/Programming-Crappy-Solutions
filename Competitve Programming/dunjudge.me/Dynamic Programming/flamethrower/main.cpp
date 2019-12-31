#include <bits/stdc++.h>
using namespace std;
typedef unsigned long long ll;
int main(){
    int N,K; cin>>N>>K;
    ll A[N];for(int i=0;i<N;i++){cin>>A[i];}
    //Sum for first K elements
    ll localsum = A[0];
    for (int i=1;i<K;i++){localsum+=A[i];}
    //Transition
    ll ans = localsum;
    for(int i=1;i<=N-K;i++){
        localsum-=A[i-1];//Remove last element
        localsum+=A[i+K-1];
        ans = max(ans,localsum);
    }
    cout<<ans;
}
