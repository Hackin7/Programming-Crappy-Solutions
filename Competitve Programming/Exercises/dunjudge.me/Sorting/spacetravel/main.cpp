#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n,s; cin>>n>>s;
    int t[n];for(int i=0;i<n;i++){cin>>t[i];}
    sort(t,t+n);
    

    int ans=0;
    for(int i=0;i<n;i++){
        ans+=t[i]*(n-i<=s?1:2);
    }
    cout<<ans;
    return 0;
}
