#include <bits/stdc++.h>
using namespace std;

//First done in 10 min->30%, TLE

int INF = INT_MAX;
 
vector<int> adjList[1000000]; 
int dist[1000000];
bool visited[1000000];

int ans = 0;
int lca (int a,int b) {
    if (depth[a] < depth[b]) swap (a , b ) ; // a has greater depth
        for (int k = log2(N);k >=0;k--)
        if (p[a][k]!= -1 && depth[p[a][k]] >= depth [ b ])
        a = p [a ][ k ];
        if ( a == b ) return a ; // edge case that a or b is the lca
        for ( int k = log2 ( N ) ; k >=0; k - -)
        if ( p [ a ][ k ]!= p [ b ][ k ]) a = p [ a ][ k ] , b =p [ b ][ k ];
    return p [ a ][0];
}

int main(){
    //Input
    int n; cin>>n;
    memset(visited, false, n);
    memset(dist, INT_MAX, n);
    for (int i=0;i<n-1;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjList[u].push_back(v);
        adjList[v].push_back(u);
    }
    int q; cin>>q;
    for (int i=0;i<q;i++){
        int a,b; cin>>a>>b;
        //Reset
        memset(visited, false, n);ans = 0;
        memset(dist, INT_MAX, n);
        //Get distance
        bfs(a,b);
        if (i!=0){cout<<endl;}
        cout<<ans+1;
    }
}
