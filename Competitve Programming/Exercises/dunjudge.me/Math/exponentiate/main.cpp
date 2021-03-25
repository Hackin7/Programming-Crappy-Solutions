#include <bits/stdc++.h>
using namespace std;
typedef unsigned long long ll;

// Iterative C program to compute modular power

/* Iterative Function to calculate (x^y)%p in O(log y) */

ll power(ll x,ll y,ll p) {
    ll res = 1; // Initialize result
    x = x % p;
    while (y > 0){
        // If y is odd, multiply x with result
        if (y & 1)res = (res*x) % p;
        // y must be even now
        y = y>>1; // y = y/2
        x = (x*x) % p;
    }
    return res;
}


int main() {
    ll n; cin >> n;
    for (ll i=0; i<n; i++){
        ll a, b, mod; cin>>a>>b>>mod;
        cout << power(a,b,mod);
        if (i!=n-1)cout<<endl;
    }
    return 0;
}
