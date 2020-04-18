#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N,H;cin>>N>>H;
    ll S[N];for(ll i=0;i<N;i++){cin>>S[i];}
    
    // Brute force all possible combinations as base value
    //Find difference from ideal value
    
    ll ans=LLONG_MAX;
    
    //Choose reference height level
    for(int i=0;i<N;i++){
        ll lans=0;
        for(int j=i-1;j>=0;j--){
            lans+=max((ll)0,abs(abs(S[j]-S[j+1])-H));
            cout<<lans<<" ";
        }
        for(int j=i+1;j<N;j++){
            lans+=max((ll)0,abs(abs(S[j]-S[j-1])-H));
            cout<<lans<<" ";
        }
        cout<<","<<S[i]<<" "<<lans<<endl;
        ans=min(ans,lans);
    }
    cout<<ans;
    return 0;
}
/*
6 1
2 10 0 2 4 3

3 0
1 1 3
*/
