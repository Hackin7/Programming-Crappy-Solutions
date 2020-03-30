#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define V 1000
ll v[V],w[V];

//Creating f
ll f(ll sum){
    ll sumSquare=(sum*sum);
    ll sumFour=sumSquare*sumSquare;
    ll val=(sumFour+2*sumSquare)%5+1;
    //cout<<val<<",";
    return val;
    
}
//Brute forcing the summation
ll ans=0;
void summing(ll n, ll val=0){
    for(ll x=v[n];x<=w[n];x++){
        if(n==0){//At the last loop
            //cout<<val+x<<endl;
            ans += f(val+x);
        }else{
            summing(n-1,val+x);
        }
    }
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll n;cin>>n;for(ll i=0;i<n;i++){cin>>v[i]>>w[i];}
    summing(n-1);
    cout<<ans;
    return 0;
}
