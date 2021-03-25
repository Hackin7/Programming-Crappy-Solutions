#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/724946/
#define V 1000000
typedef long long ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N;cin>>N;
    
    map<int,ll> count;int maxel=0;
    int prev=0;bool subtask3=1;
    for(ll i=0;i<N;i++){
        int A;cin>>A;
        if(A!=prev+1){subtask3=0;}
        else{prev++;}
        maxel = max(maxel,A);
        count[A]++;
    }
    
    //Subtask 3
    if (subtask3){
        ll ans=0;
        for(ll i=N-1;i>=0;i-=2){
            ans+=i+1;//A[i];
        }
        cout<<ans;
        return 0;
    }
    //Brute forcing all possible combinations
    //Find the max score possible with numbers 
    // only from 1 to max A;
    ll dp[maxel+1];dp[1]=count[1]*1;
    for(int i=2;i<=maxel;i++){
        //Choose any prev and current
        ll choose=count[i]*i;ll prev=0;
        for(int j=1;j<i-1;j++){prev=max(prev,dp[j]);}        
        
        dp[i] = max(prev+choose,dp[i-1]);
    }
    
    
    cout<<dp[maxel];//ans;
    return 0;
}
/*
4
1 2 2 3
*/
