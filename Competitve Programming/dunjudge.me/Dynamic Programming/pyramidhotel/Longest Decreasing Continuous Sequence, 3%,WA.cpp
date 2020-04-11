#include <bits/stdc++.h>
#include <fstream>
using namespace std;
//https://dunjudge.me/analysis/submissions/722663/
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    int H[N];for(int i=0;i<N;i++)cin>>H[i];
    
    int dp[N];dp[0]=1;
    for(int i=1;i<N;i++){
        if(H[i-1]>H[i]){dp[i]=dp[i-1]+1;}
        else{dp[i]=1;}
    }
    int ans=0;
    for(int i=0;i<N;i++){
        //cout<<dp[i]<<" ";
        ans = max(ans,dp[i]);
    }
    cout<<ans;
    return 0;
}
/*
6
6 5 4 3 2 1
*/
