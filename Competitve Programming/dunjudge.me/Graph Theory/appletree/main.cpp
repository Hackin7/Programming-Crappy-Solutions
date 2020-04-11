#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;
#define V 1000000
vector<ipair> g[V];
map<int,int> visited[V]; //[c]Previous cost
int dfs(int x, int prevcost){ //Returns the number of edges traversed
    if (visited[x].count(prevcost)>0){
        return visited[x][prevcost];
    }
    
    visited[x][prevcost]=0; 
    //Max number of edges to travel from
    for(auto i:g[x]){
        if (i.second>prevcost){
            visited[x][prevcost] = max(visited[x][prevcost],1+dfs(i.first,i.second));
        }
    }
    return visited[x][prevcost];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N,E; cin>>N>>E;
    
    for(int i=0;i<E;i++){
        int A,B,W;cin>>A>>B>>W;
        g[A].push_back(make_pair(B,W));
        g[B].push_back(make_pair(A,W));
    }
    
    //memset(visited,-1,sizeof(visited));
    int ans=0;
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){visited[j].clear();}
        //memset(visited,-1,sizeof(visited));
        ans = max(ans,dfs(i,0));
    }
    cout<<ans;
    return 0;
}
/*
6 7
0 1 2
1 2 1
1 3 3
2 3 4
2 4 7
4 5 8
0 5 6
*/
/*
5 5
0 1 1
0 3 4
2 3 5
1 2 3
1 4 2
*/
