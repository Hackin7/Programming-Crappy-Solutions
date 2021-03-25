#include <bits/stdc++.h>
using namespace std;

//First done in 10 min->30%, TLE

int INF = INT_MAX;
 
vector<int> adjList[1000000]; 
bool visited[1000000];
bool cmp(int node, int depth){
    bool condition = !visited[node];
    if (condition) visited[node] = true;
    return condition;
}

int ans = 0;
void bfs(int start, int end){
    deque<tuple<int,int> > stuff;

    stuff.push_back(make_tuple(start, 0));
    
    while (!stuff.empty()){
        tuple<int,int> topnode = stuff.front();
        int n = get<0>(topnode), newdepth = get<1>(topnode)+1;
        stuff.pop_front();
        
        if (n==end){
            ans = newdepth-1;
            break;
        }
        for (int i : adjList[n]){
            if (cmp(i,newdepth)){stuff.push_back(make_tuple(i,newdepth));}
        }
    }
}

int main(){
    memset(visited, false, sizeof(visited));
    //Input
    int n; cin>>n;
    for (int i=0;i<n-1;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjList[u].push_back(v);
        adjList[v].push_back(u);
    }
    int q; cin>>q;
    for (int i=0;i<q;i++){
        int a,b; cin>>a>>b;
        //Reset
        memset(visited, false, sizeof(visited));ans = 0;
        //Get distance
        bfs(a,b);
        if (i!=0){cout<<endl;}
        cout<<ans+1;
    }
}
