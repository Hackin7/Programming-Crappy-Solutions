#include <bits/stdc++.h>
using namespace std;
//23%
const int V=100000,K=20;
vector<int> adjlist[V];
int p[V][K]; //node,kth ancesstor
//DFS to compute node parents for p[i][0], first parent
bool visited[V];
void dfs(int x){
    if (visited[x])return;
    visited[x]=true;
    for (auto i:adjlist[x]){
        if (!visited[i]){
            if (p[i][0] == -1){
                //cout<<i<<"<-"<<x<<endl;
                p[i][0] = x;}
            dfs(i);
        }
    }
}
void calc_k_parents(int N){
    for (int k=1;k<K;k++){
        for (int i=0;i<N;i++){
            if (p[i][k-1] != -1){
                p[i][k]= p[p[i][k-1]][k-1];
            }else{p[i][k]=-1;}
           // if (k==2)cout<<i<<","<<k<<":"<<p[i][k-1]<<","<<p[p[i][k-1]][k-1]<<","<<p[i][k]<<endl;

        }
    }
}
int find_parent(int x,int k){
    for (int i=K;i>=0;i--){
        if (k>= (1<<i))
            if (x==-1)return -1;
            x=p[x][i];
            k-=1<<i;
        }
    }
    return x;
}
int main(){
    int N; cin>>N;
    int A,B;for (int i=0;i<N-1;i++){
        cin>>A>>B;
        adjlist[A].push_back(B);
        adjlist[B].push_back(A);
    }
    //Rooted at node 0
    fill(visited,visited+N,false);
    for(int i=0;i<N;i++){p[i][0] = -1;}
    dfs(0);//cout<<endl;for(int i=0;i<N;i++){cout<<p[i][0]<<"_";}
    calc_k_parents(N);
    //for(int j=0;j<5;j++){cout<<endl;for(int i=0;i<N;i++){cout<<p[i][j]<<"_";}}
    int Q; cin>>Q;
    int X,K; for(int i=0;i<Q;i++){
        cin>>X>>K;
        if (i!=0)cout<<"\n";
        cout<<find_parent(X,K);
    }
    return 0;
}
