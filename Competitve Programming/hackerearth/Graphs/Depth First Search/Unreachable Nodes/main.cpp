#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;
vector<int> adjList[100010];
bool visited[100010];

void dfs(int x){
    visited[x] = true;
    for (int i:adjList[x]){
        if (!visited[i]){dfs(i);}
    }
}
int main(){
    memset(visited, false, sizeof(visited));
    //Input
    int n,m;cin>>n>>m;
    for (int i=0;i<m;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjList[u].push_back(v);
        adjList[v].push_back(u);
    }

    int x; cin>>x;
    dfs(x);

    int ans = 0;
    for (int i=1;i<=n;i++){
        if (!visited[i]){ans++;}
    }
    cout<<ans;
}
