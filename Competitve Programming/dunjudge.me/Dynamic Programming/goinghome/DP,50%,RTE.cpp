#include <bits/stdc++.h>
using namespace std;

https://dunjudge.me/analysis/submissions/724930//
typedef pair<int,int> ipair;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N,S,R;cin>>N>>S>>R;
    vector<ipair> g[100000];
    for(int i=0;i<S;i++){
        int s,d,r;cin>>s>>d>>r;
        g[d].push_back(make_pair(s,r));
    }
    
    int dp[1000000];dp[0]=0; //Cost to get to destination
    for(int i=1;i<=N;i++){ // Ending destintion
        dp[i] = dp[i-1]+R;
        for (auto j:g[i]){
            dp[i] = min(dp[i],dp[j.first]+j.second);
        }
    }
    cout<<dp[N];
    return 0;
}
/*
5 3 3
0 4 6
3 5 3
4 5 2
*/
