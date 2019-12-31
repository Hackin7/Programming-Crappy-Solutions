#include <bits/stdc++.h>
using namespace std;

int main(){
    int N,M; cin>>N>>M;
    int ans=M-__gcd(N,M);
    cout<<ans;

    return 0;
}
