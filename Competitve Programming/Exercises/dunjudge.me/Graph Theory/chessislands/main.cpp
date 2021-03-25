#include <bits/stdc++.h>
using namespace std;

//100%
#define V 1000000
int A[V];
vector<int> g[V];
bool visited[V];

int totalArea=0,toPaint=0;
void dfs(int x, bool paint){
    if (visited[x]){return;}
    visited[x] = true;

    totalArea+=A[x];
    toPaint+=paint?A[x]:0;

    for (auto i:g[x]){
        dfs(i,!paint);
    }
}
int main() {
    ///Adjacency List//////////////////////
    int N,E;cin>>N>>E;
    for(int i=0;i<N;i++){cin>>A[i];}
    for (int i = 0; i < E; i++) {
        int a,b;cin>>a>>b;
        g[a-1].push_back(b-1);
        g[b-1].push_back(a-1);
    }

    memset(visited,0,sizeof(visited));
    int S=0;
    for(int i=0;i<N;i++){
        if (!visited[i]){
            totalArea=0;toPaint=0;
            dfs(i,false);
            S+=min(toPaint,totalArea-toPaint);
        }
    }
    cout<<S;
}
