#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/724945/
#define V 1000000
typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N;cin>>N;
    ll A[N];for(ll i=0;i<N;i++){cin>>A[i];}
    
    int count[V];
    for(ll i=0;i<N;i++){
        count[A[i]]++;
    }
    
    
    ll ans=0;
    //Subtask 4, if N==3
    // Choose the sides or the front
    ans = max(count[1]*1+count[3]*3, count[2]*2);
    cout<<ans;
    return 0;
}
