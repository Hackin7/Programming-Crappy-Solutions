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

        ll ans = 0;
        if (N == 1){
            ll dp[M];dp[0] = A[0][0]; for(int i=1;i<M;i++){dp[i] = dp[i-1] + A[0][i];}
            ans = max((ll)0,*max_element(dp, dp + M));
        }

        //Output
        if(t!=0){cout<<"\n";}
        cout<<ans;
    }
}

/* Subtasks
1. N = 1
 - Just take max from (0, max of accumulated array array)
*/
