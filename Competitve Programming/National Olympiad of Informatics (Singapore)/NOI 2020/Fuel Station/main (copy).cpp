#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<ll,ll> ipair;
typedef tuple<ll,ll,ll> tiii;
#define V 100000

tiii g[V];

ll N,D;ll X[V],A[V],B[V];


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin>>N>>D;
    
    for(ll i=0;i<N;i++){cin>>X[i]>>A[i]>>B[i];}
    
    
    for(ll i=0;i<N;i++){
        g[i] = make_tuple(X[i],A[i],B[i]);
    }
    sort(g,g+N);
    
    ll dp[D];dp[0]=0;//memset(dp,0,sizeof(dp));dp[0] = 0;
    ll extraF[D];memset(extraF,0,sizeof(extraF));extraF[0]=0;
    for(ll i=1;i<=D;i++){
        cout<<i<<endl;
        //Drive
        dp[i] = dp[i-1]+1;
        //extraF[i] = max((ll)0,extraF[i-1]-1);
        
        for(ll j=0;j<N;j++){
            //if at the position
            ll x,a,b;tie(x,a,b)=g[j];
            //cout<<x<<" "<<a<<" "<<b<<endl;
            if(x+a>=i){
                ll choice = dp[x];
                if (dp[i]>choice){
                    dp[i] = choice;
                    //extraF[i] = max(0,(a+x)-i);
                }
            }
        }
    }
    for(ll i=0;i<=D;i++){cout<<dp[i]<<" ";}cout<<endl;
    for(ll i=0;i<=D;i++){cout<<extraF[i]<<" ";}cout<<endl;
    cout<<dp[D];
    
    return 0;
}
/*
1 10
4 8 6

5 100
50 30 25
50 40 25
25 25 25
75 20 25
5 5 25
*/
