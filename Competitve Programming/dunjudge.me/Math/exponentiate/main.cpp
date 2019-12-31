#include <bits/stdc++.h>
using namespace std;

typedef long long ll ;
ll mod ; // initialise this to your desired modulo
ll fast_exp(ll x,ll exp){
    ll ans = 1 , base = x ;
    // We start by looking at the smallest bit
    while ( exp ) {
        if ( exp & 1) ans *= base ;
        // If the bit is set , we multiply by the base
        base *= base;
        // We then square the base
        base %= mod;ans %= mod;
        // Remember to modulo everything !!!
        exp >>= 1;
        // We decrease the number of bits by 1
    }
    return ans ;
}
int main(){
    ll n; cin >> n;
    for (ll i=0; i<n; i++){
        ll a, b, mod; cin>>a>>b>>mod;
        cout << pow(a,b);
        if (i!=n-1)cout<<endl;
    }
    return 0;
}
