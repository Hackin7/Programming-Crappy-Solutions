#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main(){
    ll N,R;cin>>N>>R;
    int ans=0;
    for (ll i=0;i<N;i++){
        ll X,Y;cin>>X>>Y;
        if (pow(X*X+Y*Y,0.5) <= (double)R){
            ans++;
    }}
    cout<<ans;
    return 0;
}
