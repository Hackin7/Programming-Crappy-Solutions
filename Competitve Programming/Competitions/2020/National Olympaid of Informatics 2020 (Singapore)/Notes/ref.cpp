#include <bits/stdc++.h>
using namespace std;


#define V 1000000;
typedef long long ll;
typedef pair<int,int> ipair;

vector<ipair> g[V];
int vis[V];
int dfs(int x){
    if (vis[x]){return 0;}
    vis[x] = 1;
    for (auto i:g[x]){
        dfs(i.first);
    }
    return vis[x];
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    //// Adjlist ///////////////////////////
    int N,E;cin>>N>>E;

    for(int i=0;i<E;i++){
        int A,B,C; cin>>A>>B>>C;
        g[A].push_back(make_pair(B,C));
        g[B].push_back(make_pair(A,C));
    }
    
    
    return 0;
}
