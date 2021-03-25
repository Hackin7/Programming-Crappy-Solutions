#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define INF 922337203685477580;
bool DEBUGG = false;

int main() {
    int T; cin>>T;
    for (int t=0;t<T;t++){
        // Input
        int N, M;cin>>N>>M;
        ll A[N][M];
        for(int i=0;i<N;i++){for(int j=0;j<M;j++){cin>>A[i][j];}}


        //Find total sum of stuff
        ll fsum[N][M];
        for(int i=0;i<N;i++){
            fsum[i][0] = A[i][0];
            for(int j=1;j<M;j++){
                fsum[i][j] = fsum[i][j-1] + A[i][j];
            }
        }
        ll bsum[N][M];
        for(int i=0;i<N;i++){
            bsum[i][0] = A[i][M-1];
            for(int j=1;j<M;j++){
                bsum[i][j] = bsum[i][j-1] + A[i][M-1-j];
            }
        }

        if (DEBUGG){
            cout<<"\n"<<"??????????\n";
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    cout<<bsum[i][j]<<" ";
                }
                cout<<"\n";
            }
        }

        ll dp[N][3]; //  3 states: forward, backward, all the way
        for(int i=0;i<N;i++){
            dp[i][0] = 0;
            for(int j=0;j<M;j++){
                dp[i][0] = max(dp[i][0], fsum[i][j]);
            }

            dp[i][1] = 0;
            for(int j=0;j<M;j++){
                dp[i][1] = max(dp[i][1], bsum[i][j]);
            }

            dp[i][2] = fsum[i][M-1];
        }

        if (DEBUGG){
            cout<<"\n"<<"##########\n";
            for(int i=0;i<N;i++){
                for(int j=0;j<3;j++){
                    cout<<dp[i][j]<<" ";
                }
                cout<<"\n";
            }
        }


        ll getMax[N][2]; //Find max fruits possible on N day, and at start(0)/ end(1)
        getMax[0][0] = dp[0][0]; getMax[0][1] = -INF;
        for(int i=1;i<N;i++){
            ll toStart = getMax[i-1][0];
            ll toEnd = getMax[i-1][1];

            if (i>1){
                toStart = max(toStart, dp[i-1][2] + getMax[i-2][1]);
                toEnd = max(toEnd, dp[i-1][2] + getMax[i-2][0]);
            }else{
                toStart = max(toStart, dp[i-1][2]);
                toEnd = max(toEnd, dp[i-1][2]);
            }

            getMax[i][0] = dp[i][0] + toStart;
            getMax[i][1] = dp[i][1] + toEnd;
        }

        if (DEBUGG){
            cout<<"\n"<<"----------\n";
            for(int i=0;i<N;i++){
                for(int j=0;j<2;j++){
                    cout<<getMax[i][j]<<" ";
                }
                cout<<"\n";
            }
        }

        if(t!=0){cout<<"\n";}
        cout<<max(getMax[N-1][0], getMax[N-1][1]);

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

3
1 5
-9 -8 1 2 3
2 3
1 4 -5
-1 -9 100
2 3
1 4 -5
-1 -1 100
*/
Language: C++14
