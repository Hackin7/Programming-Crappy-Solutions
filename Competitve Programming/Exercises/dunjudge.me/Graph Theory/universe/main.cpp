#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/722609/
#define V 1000000
vector<int> g[V];int A[V];
int N,K;

int vis[V];
int dfs(int x,int k){
    if (vis[x]!=-1)return 0;//vis[x];
    if (k>K){return 0;}

    int children=0;
    vis[x]=0;
    for (auto i:g[x]){
        if (vis[i]==-1){ //Not visited before
            //Calculate the no. consec cats before
            int kk=0;
            if (A[i]==0)kk=0; //If current one interrupt
            else kk=k+A[i];
            
            vis[x]+=dfs(i,kk);
            children+=1;
        }
    }
    if(children==0 && !(k>K)){
        //cout<<x<<","<<k<<";"<<endl;
        vis[x]=1;}
    return vis[x];
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    cin>>N>>K;
    for(int i=1;i<=N;i++){cin>>A[i];}
    
    for(int i=0;i<N-1;i++){
        int X,Y;cin>>X>>Y;
        g[X].push_back(Y);g[Y].push_back(X);
    }
    
    
    memset(vis,-1,sizeof(vis));
    cout<<dfs(1,A[1]);
    return 0;
}
/*
4 1
1 1 0 0
1 2
1 3
1 4
*/
/*
7 1
1 0 1 1 0 0 0
1 2
1 3
2 4
2 5
3 6
3 7
*/
