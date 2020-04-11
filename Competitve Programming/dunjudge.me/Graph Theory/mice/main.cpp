#include <bits/stdc++.h>
using namespace std;

#define V 1000000
int N,E;int M[V];vector<int> g[V];
int vis[V];

int nocycle[V];int dp[V];
int dfs(int x){
    if (vis[x]==2){return dp[x];} //Calculated
    if (vis[x]==1){nocycle[x]++;return 0;}//Cycle, escape ASAP
    vis[x]=0;
    
    dp[x]=0;
    for(auto i:g[x]){
        dp[x]+=dfs(i);
    }
    vis[x]=2;
    return dp[x];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    memset(vis,0,sizeof(vis));
    cin>>N>>E;
    for(int i=0;i<N;i++){cin>>M[i];}
    
    for(int i=0;i<E;i++){
        int a,b;cin>>a>>b;
        g[a].push_back(b);//g[b].push_back(a);
    }
    
    cout<<dfs(0)+M[0];
    cout<<endl;for(int i=0;i<N;i++){cout<<vis[i]<<" ";}cout<<endl;
    return 0;
}
