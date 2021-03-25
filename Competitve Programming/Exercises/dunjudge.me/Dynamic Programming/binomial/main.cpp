#include <bits/stdc++.h>
using namespace std;

typedef unsigned long long ll;
#define M 1000000007

//https://dunjudge.me/analysis/submissions/717943/
/* pascal */
ll com(ll n, ll r){ //Combinatorics
    ll ans=1,mul=n;
    for(ll i=1;i<=r;i++){
        ans=(ans*mul)%M;ans=(ans/i)%M;
        mul--;
    }
    return ans%M;
}
int main(){
    ll R,C; cin>>R>>C;
    cout << com(R,C);
}
