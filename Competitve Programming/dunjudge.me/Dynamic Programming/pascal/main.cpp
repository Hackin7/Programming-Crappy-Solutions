#include <bits/stdc++.h>
using namespace std;

typedef unsigned long long ll;

/* pascal */
ll com(ll n, ll r){ //Combinatorics
    ll ans=1,mul=n;
    for(ll i=1;i<=r;i++){
        //cout<<mul<<","<<i<<":"<<ans<<endl;
        ans*=mul;ans/=i;
        mul--;
    }
    return ans;
}
ll term(ll R, ll c){
    return com(R-1,c-1);
}
int main(){
    ll R,C; cin>>R>>C;
    cout << term(R,C);
}
