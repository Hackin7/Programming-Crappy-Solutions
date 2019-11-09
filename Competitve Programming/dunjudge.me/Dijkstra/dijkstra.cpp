#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;
int adjM[1000][1000];
deque<int> dijkstra(int N, int start, int end){
    int parents[N];
    int costs[N];
    bool visited[N];
    
    for (int i=0; i<N; i++){
        visited[i] = false;
        parents[i] = -1; //Null
        costs[i] = INF;
    }
    
    costs[start] = 0;
    deque<int> nodes;
    nodes.push_back(start);
    int node;
    while (!nodes.empty()){
        node = nodes.front();
        nodes.pop_front();
        //cout<<node<<" ";
        if (node == end)break;
        // get connected elements
        for (int i=0; i<N; i++){
            int neighbour = i;
            int cost = adjM[node][i];
            //cout<<neighbour<<","<<cost;
            if (cost == -1){continue;} // Null cost
            if (visited[neighbour]){continue;}
            if (neighbour == start){continue;}
            //Set Parent
            visited[neighbour] = true;
            if (costs[neighbour] > costs[node]+cost){
                cout<<costs[node]+cost<"=";
                parents[neighbour] = node;
                nodes.push_back(neighbour);
            }
        }
    }
    
    deque<int> path;
    while (parents[node] != -1 || parents[node] != start){
        path.push_front(node);
        node = parents[node];
    }
    if (parents[node] == start){
        path.push_front(start);
    }else{
        path.clear();
    }
    return path;
}

int main(){
    //Input
    int N, M; cin>>N>>M;
    //int adjM[N][N];
    for (int i=0; i<N; i++){
        for (int j=0; j<N; j++){
            adjM[i][j] = -1;//Null value
        }
    }
    for (int i=0;i<M;i++){
        int u,v,c; cin>>u>>v>>c;
        //Cost setting
        adjM[u][v] = c;
        adjM[v][u] = c;
        cout<<adjM[u][v];
    }
    /*
    int S; cin>>S;
    int passed[S];
    for (int i=0;i<S;i++){
        int a;cin >> a;
        passed[i] = a;
    }*/
    
    deque<int> path = dijkstra(N+1,1,5);
    cout<<path.size()<<endl;
    for(int i=0; i < (int)path.size(); i++){
        cout<<path[i]<<" ";
    }
}
