#include <bits/stdc++.h>
using namespace std;
//https://dunjudge.me/analysis/submissions/722665/
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    int A[N];for(int i=0;i<N;i++)cin>>A[i];
    
    reverse(A,A+N);
    //Basically Longest decreasing subsequence
    //https://noiref.codecla.ws/dp/#lis
    int dp[N], ans;
    for (int i = ans = 0; i < N; ++i) {
        dp[i] = 1;
        for (int j = 0; j < i; ++j) {
            if (A[j] <= A[i]) dp[i] = max(dp[i], dp[j]+1);
        }
        ans = max(dp[i], ans);
    }
    cout<<ans;
    return 0;
}
/*
5
1 2 3 3 5
*/
