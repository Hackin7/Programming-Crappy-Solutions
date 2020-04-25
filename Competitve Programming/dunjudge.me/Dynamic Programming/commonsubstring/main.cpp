#include <bits/stdc++.h>
using namespace std;

//100%
//https://dunjudge.me/analysis/submissions/727368/
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    string A,B;cin>>A>>B;
    int VA = A.length();
    int VB = B.length();

    int ans = 0;
    int dp[VA][VB];//Pivot location
    dp[0][0] = A[0]==B[0];
    for(int i=0;i<VA;i++){
        for(int j=0;j<VB;j++){
            if (i==0 ||j==0){dp[i][j] = A[i] == B[j];}
            else{
                dp[i][j] = 0;
                if (A[i]==B[j]){
                    dp[i][j] = dp[i-1][j-1]+ 1;}
            }
            ans = max(ans,dp[i][j]);
        }
    }
    cout<<ans;
    return 0;
}
/*
ABRACADABRA
ECADADABRBCRDARA
*/
