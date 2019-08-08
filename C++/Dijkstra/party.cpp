#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;
vector<int> adjList[1000+1];


int bfs(int node){
    int count = 0;//Friends attending
    
    bool passed[1000+1];
    memset(passed, false, sizeof(passed));

    deque<pair<int,int> > breadth;
    breadth.push_back(make_pair(node,1));//Starting depth
    passed[node] = true;
    
    while (!breadth.empty()){
        pair<int,int> current = breadth.front();
        int i = current.first;
        for (int j=0; j<(int)adjList[i].size(); j++){
            if (current.second+1 < 4 && !passed[adjList[i][j]]){
                breadth.push_back(make_pair(adjList[i][j],current.second+1));
                passed[adjList[i][j]] = true;
            }
        }
        breadth.pop_front();
        count++;
    }
    return count;
}

int main(){
    //Input
    int n, e; cin>>n>>e;
    
    for (int i=0;i<e;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjList[u].push_back(v);
        adjList[v].push_back(u);
    }
    
    cout<<bfs(1)-1;
}

