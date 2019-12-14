#include <bits/stdc++.h>
using namespace std;

int parent[1000000];
/*
int root(int x) {
    if (parent[x] == -1) return x;
    return root(parent[x]);
}*/
int root(int x) {
    if (parent[x]==-1) return x;
    return parent[x] = root(parent[x]);
}
bool isConnected(int x, int y) {
    return root(x) == root(y);
}
void connect(int x, int y) {
    int rootX = root(x);
    int rootY = root(y);
    if(rootX != rootY)
        parent[rootX] = rootY;
}
int main(){
    
    int N,M;cin>>N>>M;
    int n1,n2,w=1;
    fill(parent,parent+N,-1);
    int groups = N;

    for (int i=0;i<M;i++){
        cin>>n1>>n2;//>>w;
        
        if(not isConnected(n1,n2))groups--;
        connect(n1,n2);
    }    
    cout<<groups;
}
