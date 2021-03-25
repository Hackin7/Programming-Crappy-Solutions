#include <bits/stdc++.h>
using namespace std;

vector<pair<int ,int > >* V_; //adjlist(vertex,weight)
int visited[100000];
long long dp[100000]; //Stores number of item 0 needed to make item c in dp[c]
bool cycle=false;

long long dfs(int u){//dfs approach to DP on DAG
    
    ////Cycle shows that cannot form item//////////
    if(visited[u]==1)cycle=true;
    if(cycle)return 0;//doesn’t matter what,
                        //just return ASAP
                        
    if(visited[u]==2)return dp[u];
    visited[u]=1;//currently visiting this node
    for(auto i: V_[u]){
        dp[u]+=dfs(i.first)*i.second; //Number of items (i.first) needed * No. item 0 needed to make (i.first)
        dp[u]%=1000000007; //Because need mod
    }
    visited[u]=2;//finished visiting
    return dp[u];
}

//Minimum number of item 0 to form item C
int graphcraft(int N,int C,vector<pair<int ,int > >*V){
    dp[0]=1;visited[0]=2;
    V_=V;//use a global variable for dfs() to access
    long long ans=dfs(C);
    if(cycle)
        return -1;
    else
        return ans;
}
