#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define M 1000000007
typedef long long ll;

ll fac(ll x){
    ll ans = 1;
    for(ll i=2;i<=x;i++){
        ans=(ans*i)%M;}
    return ans;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll N; cin>>N;
    
    ll A[N];
    for(ll i=0;i<N;i++){cin>>A[i];}

    set<int> ranking;
    for(int i=0;i<N;i++){
        ranking.insert(A[i]);
    }

    int order=0 ;//Min is 1
    
    for(int i=0;i<N;i++){
        int pos = 0;
        for(auto j:ranking){if(j==A[i])break;pos++;}
        int rank = pos*fac(N-i-1); //Previous permutations
        ranking.erase(A[i]);
        //cout<<rank<<","<<order<<endl;
        order+=rank;
    }    
    cout<<order+1;
    return 0;
}
