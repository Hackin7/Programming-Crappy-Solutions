#include <bits/stdc++.h>
using namespace std;
#define emplace(a,b) push_back(make_pair(a,b))
typedef pair<int,int> ipair;

#define V 1000000
int N,H;
int X[V],Y[V],S[V],E[V];
int visited[V];vector<ipair> g[V];
int dfs(int x){
    if (visited[x])return visited[x];
    visited[x]=1;
    if (x==N+2)return 0;//Reach end
    //cout<<x<<endl;
    visited[x]=0;
    for(auto i:g[x]){
        visited[x]=max(visited[x],dfs(i.first)+i.second);
    }
    return visited[x];
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
     cin>>N>>H;
    for(int i=0;i<N;i++){cin>>X[i]>>Y[i]>>S[i]>>E[i];}
    
    //Graph generation from edge to edge
    
    for(int i=0;i<N;i++){
        for(int j=0;j<N;j++){
            if (i==j)continue;
            //Passing through the jth gate
            if (max(abs(X[j]-X[i]),Y[i]-Y[j])<=E[i] 
                && Y[i]>=Y[j]){
                    //cout<<i<<":"<<j<<endl;
                    g[i].emplace(j,S[j]);
            }
        }
    }
    /*
    for(int i=0;i<N;i++){
        for(auto j:g[i]){
            cout<<j.first<<",";
        }cout<<endl;
    }*/
    memset(visited,0,sizeof(visited));
    //From top
    for(int i=0;i<N;i++){g[N].emplace(i,S[i]);}
    //To Bottom
    for(int i=0;i<N;i++){g[i].emplace(N+1,0);}    
    
    int cost = dfs(N);cout<<cost;
    return 0;
}
/*
5 5
0 5 5 1
3 4 4 3
-2 3 3 2
1 1 4 4
-1 2 3 1
*/
