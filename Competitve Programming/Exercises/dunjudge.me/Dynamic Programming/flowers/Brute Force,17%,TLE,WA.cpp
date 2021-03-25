#include <bits/stdc++.h>
using namespace std;
#define M 1000000007

typedef unsigned long long ll;

ll com(ll n, ll r){ //Combinatorics
    ll ans=1,mul=n;
    for(ll i=1;i<=r;i++){
        //cout<<mul<<","<<i<<":"<<ans<<endl;
        ans*=mul;ans/=i;
        mul--;
    }
    return ans;
}
int noWays(int K,int F){
    if (K==0){return 1;}
    //F is number of flowers
    int ways = 0;
    //Number of groups of white
    for(int n=0;n*K<=F;n++){
        //For N groups: Ways = (F-NK+N)!/(N!(F-NK)!)
        int val=com(F-n*K+n,n);
        ways+=val;
    }
    return ways;
}
int dp(int K, int A, int B){
    int ways=0;
    for(int i=A;i<=B;i++){
        ways+=noWays(K,i);
    }
    return ways;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int K,D;cin>>K>>D;
    for(int i=0;i<D;i++){
        int A,B;cin>>A>>B;

        int ans=0;
        ans=dp(K,A,B);
        
        //Output
        if (i!=0)cout<<"\n";
        cout<<ans;
    }
    
    return 0;
}
