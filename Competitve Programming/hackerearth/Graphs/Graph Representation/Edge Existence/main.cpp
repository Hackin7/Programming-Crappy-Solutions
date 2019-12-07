#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;


int main(){
    //Input
    int n, e; cin>>n>>e;
    int adjM[1000][1000];
    for (int i=0; i<n; i++){for (int j=0; j<n; j++){adjM[i][j] = 0;}}
    for (int i=0;i<e;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjM[u][v] = 1;
        adjM[v][u] = 1;
    }
    int q; cin>>q;
    for (int i=0; i<q; i++){
        int a,b; cin>>a>>b;
        if (i!=0){cout<<endl;}
        if (adjM[a][b] == 1){cout<<"YES";}
        else{cout<<"NO";}
    }
}
