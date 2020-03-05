#include <bits/stdc++.h>
using namespace std;
bool visited[100000];
int dfs(int D[],int x){
    if (visited[x])return 0;
    visited[x]=true;
    return 1+dfs(D,D[x]);
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(visited, 0, sizeof(visited));
    
    int N; cin>>N;
    int D[N]; for(int i=0;i<N;i++){cin>>D[i];}
    
    for(int i=0;i<N;i++){
        if(i!=0)cout<<" ";
        cout<<dfs(D,i);
        memset(visited, 0, sizeof(visited));
    }
    return 0;
}
