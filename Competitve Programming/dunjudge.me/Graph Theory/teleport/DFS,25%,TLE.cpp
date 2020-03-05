#include <bits/stdc++.h>
using namespace std;

const int V=1000000;
bool visited[V];
int connected[V];
int dfs(int D[],int x){
    if (visited[x])return 0;
    else visited[x]=true;
    connected[x]=1+dfs(D,D[x]);
    return connected[x];
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
