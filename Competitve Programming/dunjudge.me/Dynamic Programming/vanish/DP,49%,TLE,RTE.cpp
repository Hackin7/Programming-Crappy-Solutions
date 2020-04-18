#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/724946/
#define V 100000
typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N;cin>>N;
    ll A[N];for(ll i=0;i<N;i++){cin>>A[i];}
    
    int count[V];
    for(ll i=0;i<N;i++){
        count[A[i]]++;
    }
    int maxel = *max_element(A,A+N);
    
    //Brute forcing all possible combinations
    //Find the max score possible with numbers 
    // only from 1 to max A;
    ll dp[V];dp[1]=count[1]*1;
    for(int i=2;i<=maxel;i++){
        //Choose any prev and current
        ll choose=count[i]*i;ll prev=0;
        for(int j=1;j<i-1;j++){prev=max(prev,dp[j]);}        
        
        dp[i] = max(prev+choose,dp[i-1]);
    }
    
    
    cout<<dp[maxel];//ans;
    return 0;
}
