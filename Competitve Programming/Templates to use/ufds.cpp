#include <bits/stdc++.h>
using namespace std;

int parent[1000000];
int root(int x) {
    //x--;
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
        parent[rootX] = rootY; // Y is root of X
}

//Solution for general
int main(){
    int N,M;cin>>N>>M;

    int power[N+1];
    for (int i=1;i<=N;i++)cin >> power[i];
    int n1,n2;
    fill(parent,parent+N+1,-1);

    for (int i=0;i<M;i++){
        cin>>n1>>n2;//>>w;
        //cout<<endl<<n1<<":"<<n2<<","<<
        //root(n1)<<"_"<<root(n2)<<","<<
        //power[root(n1)]<<"_"<<power[root(n2)]<<","<<
        //(power[root(n1)]<power[root(n2)])<<"="<<
        //(power[root(n1)] > power[root(n2)])<<endl;
        if (isConnected(n1,n2)){
            cout<<-1<<endl;
            continue;
        }

        if (power[root(n1)]<power[root(n2)]){
            cout<<root(n2)<<endl;
            connect(n1,n2);
        }
        else if (power[root(n1)] > power[root(n2)]){
            cout<<root(n1)<<endl;
            connect(n2,n1);
        }

    }
}
