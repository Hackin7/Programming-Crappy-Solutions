#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
int main() {
    int T; cin>>T;
    for (int t=0;t<T;t++){
        // Input
        int N, M;cin>>N>>M;
        ll A[N][M];
        for(int i=0;i<N;i++){for(int j=0;j<M;j++){cin>>A[i][j];}}


        //Find total sum of stuff
        ll dp[N][M];
        for(int i=0;i<N;i++){
            dp[i][0] = A[i][0];
            for(int j=1;j<M;j++){
                dp[i][j] = dp[i][j-1] + A[i][j];
            }
        }


        ll ans = 0;
        for(int i=0;i<N;i++){
            ll localans = 0;
            for(int j=1;j<M;j++){
                localans = max(localans,dp[i][j]);
            }
            //cout<<localans<<","<<i<<","<<ans<<"\n";
            ans += localans;
        }

        //Output
        if(t!=0){cout<<"\n";}
        cout<<ans;
    }
}

/* Subtasks
1. N = 1
 - Just take max from (0, max of accumulated array array)
2. No turning around
 - Just add all the max from subtask 1

 Sample data
 1
 2 5
-9 -8 1 2 3
1 2 3 -8 -9
*/
