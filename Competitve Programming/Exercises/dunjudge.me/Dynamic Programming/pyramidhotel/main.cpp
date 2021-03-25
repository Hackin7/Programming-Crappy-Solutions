#include <bits/stdc++.h>
using namespace std;

//100%
//https://dunjudge.me/analysis/submissions/722664/
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    int H[N];for(int i=0;i<N;i++)cin>>H[i];
    
    int dp[N];dp[N-1]=1;
    for(int i=N-1-1;i>=0;i--){
        dp[i] = dp[i+1]+1; //New height
        if(dp[i]>H[i]){dp[i]=H[i];}//If cannot fit
    }
    //for(int i=0;i<N;i++){cout<<dp[i]<<" ";}cout<<endl;
    cout<<*(max_element(dp,dp+N));
    return 0;
}
/*
6
6 5 4 3 2 1
* 
6
1 2 3 4 5 6
*/
