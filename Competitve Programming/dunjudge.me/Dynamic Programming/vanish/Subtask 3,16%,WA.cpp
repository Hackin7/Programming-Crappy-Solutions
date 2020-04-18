#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/724941/
typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N;cin>>N;
    ll A[N];for(ll i=0;i<N;i++){cin>>A[i];}
    
    //Subtask 3: Summing
    ll ans=0;
    for(ll i=N-1;i>=0;i-=2){
        ans+=i+1;//A[i];
    }
    cout<<ans;
    
    return 0;
}
