#include <bits/stdc++.h>
using namespace std;

int main() {
  int N; cin>>N;
  int K; cin>>K;
  int V[N]; for (int i=0; i<N; i++){cin>>V[i];}

  // Do DP of the sum of the things
  long long dp[N];
  dp[0] = V[0];
  for(long long i=1;i<N;i++){
      dp[i] = dp[i-1] + V[i];
  }

  // Average Calculation
  long long ans = 0;
  for (long long size=1;size<=N; size++){
    for (long long i=size-1;i<N;i++){
      long long lower = 0;
      if (i-size >= 0){lower = dp[i-size];}

      long long total = dp[i]-lower;
      double V_avg = total/size;
      ans += (V_avg >= K);
    }
  }
  cout << ans;
}
