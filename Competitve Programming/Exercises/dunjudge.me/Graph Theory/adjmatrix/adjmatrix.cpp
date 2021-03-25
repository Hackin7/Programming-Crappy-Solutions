#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;


int main(){
    //Input
    int n, e; cin>>n>>e;
    int adjM[n][n];
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            adjM[i][j] = 0;//Null value
        }
    }
    for (int i=0;i<e;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjM[u-1][v-1] = 1;
        adjM[v-1][u-1] = 1;
    }
    for (int i=0; i<n; i++){
        for (int j=0; j<n; j++){
            cout<<adjM[i][j];//Null value
        }
        cout<<endl;
    }
}
