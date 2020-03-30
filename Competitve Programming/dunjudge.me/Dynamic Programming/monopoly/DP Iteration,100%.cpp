#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
ll M=1000000007;

ll pos(ll N,char S,ll X){
    ll m=0;
    switch(S){
        case 'A':m=0;break;
        case 'B':m=1;break;
        case 'C':m=2;break;
        case 'D':m=3;break;
    }
    //Mod by maxpos
    ll maxpos = (N-1)*4;
    return (m*(N-1)+X)%maxpos;
}

ll dp[400010];
ll ways(ll pos){
    //cout<<pos<<endl;
    //Initialised
    if (dp[pos]!=-1){return dp[pos];}
    dp[0]=1;
    ////Iteration///////////////
    for(ll j=1;j<=pos;j++){//end
        dp[j]=0;
        for(ll i=1;i<=6 && j-i>=0;i++){
            dp[j] = (dp[j]+dp[j-i])%M;
        }
    }
    //cout<<dp[pos];
    return dp[pos];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll TC; cin>>TC;
    memset(dp,-1,sizeof(dp));
    ways(400000);
    for(ll t=0;t<TC;t++){
        ll N,X;char S;cin>>N>>S>>X;
        ll p = pos(N,S,X);
        //cout<<p<<endl;
        
        if(t!=0)cout<<"\n";
        cout<<ways(p);
    }
    return 0;
}
