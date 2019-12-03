
#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;
int adjM[1000][1000];
int dijkstra(int N, int start, int end){
    int parents[N+1];
    int costs[N+1];//Overall Costs
    bool visited[N+1];
    
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
            
            //To Skip
            if (cost == -1){continue;} // Null cost
            if (visited[neighbour]){continue;}
            if (neighbour == start){continue;}
            
            //Set Parent
            visited[neighbour] = true;
            if (costs[neighbour] > costs[node]+cost){
                parents[neighbour] = node;
                //cout<<costs[neighbour]<<" ";
                costs[neighbour] = costs[node]+cost;
                //cout<<node<<" "<<neighbour<<" "<<costs[neighbour]<<"\n";
                nodes.push_back(neighbour);
            }
        }
    }
    /*
    deque<int> path;
    while (parents[node] != -1 || parents[node] != start){
        path.push_front(node);
        //ans += adjM[parents[node]][node];
        node = parents[node];
    }
    if (parents[node] == start){
        path.push_front(start);
        //ans += adjM[start][node];
    }else{
        path.clear();
    }
    return path;
    */
    return costs[end]-1;// cost
}

int main(){
    //Input
    int N, E; cin>>N>>E;
    for (int i=0; i<N; i++){for (int j=0; j<N; j++){adjM[i][j] = -1;}}
    for (int i=0;i<E;i++){
        int A,B,F; cin>>A>>B>>F;
        //Cost setting
        adjM[A][B] = F;
        adjM[B][A] = F;
    }
    
    int K; cin>>K;
    for (int i=0; i<K; i++){
        int X,Y;cin>>X>>Y;
        int ans = dijkstra(N,X,Y);
        cout<<ans;if (i!=K-1)cout<<endl;
    }
}
