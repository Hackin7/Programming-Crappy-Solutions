#include <bits/stdc++.h>
using namespace std;

vector<int> adj[1000000];
int getHeight(int parent){
    //visited[parent] = true;
    int height = 1;
    for ( int i : adj[parent]) {
        if ( i == parent ) continue ;
        // only continue dfs for children
        height = max(height,1+getHeight(i));
    }
    return height;
}
//root_tree (0 , -1) ;// root at 0 usually
int main(){
    int n; cin>>n;
    for (int i=1;i<n;i++){
            int x;cin>>x;
            adj[x].push_back(i);
    }
    cout<<getHeight(0);
}
