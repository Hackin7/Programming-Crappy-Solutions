#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
//Check has number as substring
ll hasNoSubstring(ll x, ll y){
    string S=to_string(x),s=to_string(y);
    for(ll i=0;i<(ll)(S.length()-s.length()+1);i++){
        bool match=0;
        for(ll c=0;c<(ll)s.length();c++){
            if(S[i+c]!=s[c]){break;}
            if(c==(ll)s.length()-1){match=1;}
        }
        if (match)return 0;
    }
    return 1;
}
#define V 100010
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    //cout<<":"<<hasNoSubstring(13000,13)<<endl;
    //Generation of lucky numbers
    ll dp[V];dp[0]=0;dp[1]=1;
    map<ll,ll> fromlucky;
    ll c=1;
    for(ll i=1;i<V;i++){
        while(!(hasNoSubstring(c,4)&&hasNoSubstring(c,13))){
            c++;
        }
        dp[i]=c;fromlucky[c]=i;
        //cout<<i<<" "<<dp[i]<<" "<<fromlucky[c]<<endl;
        c++;
    }
    
    ll N;cin>>N;
    for(ll n=0;n<N;n++){
        ll T,X;cin>>T>>X;
        if (n!=0)cout<<"\n";
        if (T==2){cout<<dp[X];}
        else if (T==1){
            if (hasNoSubstring(X,4)&&hasNoSubstring(X,13))
                cout<<fromlucky[X];
            else cout<<-1;
        }
        
    }
    return 0;
}
/*
8
1 1
1 4
1 15
1 25
2 1
2 4
2 15
2 25
*/
