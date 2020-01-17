#include <bits/stdc++.h>
using namespace std;

#define V 1000000
vector<int> adjlist[V];
bool visited[V];
int C[V+1];
int counting=0,minNode=INT_MAX;
void dfs(int x){
    //cout<<x<<" ";
    visited[x]=true;counting++;
    //cout<<x<<"["<<C[x]<<"vs"<<minNode<<"["<<C[minNode]<<" ";
    if (C[x]<C[minNode]){minNode=x;cout<<x<<")";}
    else if (C[x]==C[minNode] && x<minNode){minNode=x;cout<<x<<")";}
    
    for (auto i:adjlist[x]){
        if (!visited[i]){dfs(i);}
    }
}

int main() {
    int N;cin>>N;
    //int C[N];
    for(int i=1;i<=N;i++){cin>>C[i];}
    int E;cin>>E;
    for(int i=0;i<E;i++){
        int a,b;cin>>a>>b;
        adjlist[a].push_back(b);
        adjlist[b].push_back(a);
        //cout<<i;
    }
    int ans=0,value=INT_MAX;
    memset(visited,false,N+1);
    for (int i=1;i<N;i++){
        if (!visited[i]){
            counting=0;minNode=i;
            dfs(i);
            double newVal=C[i]/counting;
            //cout<<counting<<","<<minNode<<"vs"<<value<<endl;
            if (newVal<value){ans=minNode;}
        }
    }
    cout<<ans;
    return 0;
}

/*
5
1 2 3 4 5
4
1 2
2 3
3 4
4 5
*/
