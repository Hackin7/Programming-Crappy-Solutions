#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll N,D;cin>>N>>D;
    ll X[N],A[N],B[N];
    for(ll i=0;i<N;i++){cin>>X[i]>>A[i]>>B[i];}
    
    //Subtask 1
    ll dp[D+1];
    dp[0] = D; //Don't choose
    
    ll remaindist = D-X[0];
    
    ll F=X[0]+ max((ll)0,remaindist-A[0]);
    //cout<<remaindist<<" "<<remaindist-X[0]<<endl;
    if(F<=B[0]){
        dp[0]=min(dp[0],F);
    }
    cout<<dp[0];
    return 0;
}
/*
1 10
4 8 6
*/
