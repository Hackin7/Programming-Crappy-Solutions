#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define V 100000
vector<pair<int ,int > > g[V]; //adjlist(vertex,weight)
int visited[V];long long dp[V];
int cycle[V];

int dfs(int u, int end, int cycle){//Find the number of cycles
    cout<<u<<endl;
    if(u==end){cycle[u]=1;}
    if(cycle[u])return 1;//doesn’t matter what,
                        //just return ASAP
    
    visited[u]=1;//currently visiting this node
    
    cycle[u]=0;
    for(auto i: g[u]){
        cycle[u] += dfs(i.first);
    }
    return cycle[u];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(cycle,0,sizeof(cycle));

    int N,E;cin>>N>>E;
    for(int i=0;i<E;i++){
        int a,b;cin>>a>>b;g[a].push_back(make_pair(b,1));
    }
    
    int ans=1;
    for(int i=1;i<=N;i++){
        memset(visited,0,sizeof(visited));
        memset(cycle,0,sizeof(cycle));
        dfs(i);
        cout<<"["<<cycle[i]<<"]\n";
        if (cycle[i]<cycle[ans]){
            ans=i;
        }
    }cout<<endl;
    
    cout<<ans<<" "<<cycle[ans];
    return 0;
}

