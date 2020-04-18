#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/724935/
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;cin>>N;
    double P[N][N];
    for(int i=0;i<N;i++){
        for(int j=0;j<i+1;j++){
            cin>>P[i][j];
        }
    }
    
    //DP
    //Guarantted to pass through 1st stud
    double dp[N+1][N+1];memset(dp,0,sizeof(dp));
    dp[0][0]=1;
    for(int i=1;i<N+1;i++){
        for(int j=0;j<i;j++){
            dp[i][j] += dp[i-1][j]*P[i-1][j];//Left
            dp[i][j+1] = dp[i-1][j]*(1-P[i-1][j]);//Right
        }
    }
    
    //Debugging
    /*
    cout<<endl;
    for(int i=0;i<N+1;i++){
        for(int j=0;j<N+1;j++){
            cout<<dp[i][j]<<" ";}
        cout<<endl;
    }
    */
    //Score
    double ans=0;
    for(int i=0;i<N+1;i++){
        //cout<<dp[N][i]<<" ";
        int PP;cin>>PP;
        ans += dp[N][i]*PP;
    }
    cout<<(int)ans;
    return 0;
}
/*
2
0.3000
0.4000 0.2000
30 10 20
*/
