#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;


int main(){
    //Input
    int n, e; cin>>n>>e;
    vector<int> adjList[n+1];
    for (int i=0;i<e;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjList[u].push_back(v);
        adjList[v].push_back(u);
    }
    for (int i=0; i<n+1; i++){
        for (int j=0; j<(int)adjList[i].size(); j++){
            cout<<adjList[i][j];//Null value
            if (j!=(int)adjList[i].size()-1){cout<<" ";}
        }
        cout<<endl;
    }
}
