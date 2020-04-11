#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;
    int A[N];for(int i=0;i<N;i++)cin>>A[i];
    
    int dp[N];dp[0]=1;
    for(int i=1;i<N;i++){
        if(A[i-1]>A[i]){dp[i]=dp[i-1]+1;}
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
