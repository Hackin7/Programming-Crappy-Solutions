#include <bits/stdc++.h>
using namespace std;
///*dijkstra*/

vector<pair<int,int>> adjlist[1000];

int dijkstra(int N, int node, int end){ 
    //int node=1;
    priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
    
    int dist[N+1];
    memset(dist, -1, sizeof(dist));
    
    pq.push(make_pair(0, node)); dist[node] = 0;
    bool passedEnd = false;
    while(!pq.empty()){
        pair<int,int> c = pq.top();
        //cout << c.first << "_" << c.second<<" ";
        pq.pop();
        if (c.second == end){passedEnd = true;}
        if(c.first != dist[c.second]) continue;
        for(auto i : adjlist[c.second]){ //all elements in vector
            if(dist[i.first] == -1 || dist[i.first] > c.first + i.second){ // If distance not calculated or distance can be smaller
                dist[i.first] = c.first + i.second;
                pq.push(make_pair(dist[i.first], i.first));
            }
        }
    }
    if (!passedEnd)return -1;
    //return dist[end]; //Total cost
    int prevNode = end;
    int Node = dist[end];
    int maxCost = 0;
    while (Node != -1){
        int cost = 0;
        cout<<prevNode<<"+"<<Node<<":";
        for (int i=0; i<(int)adjlist[prevNode].size();i++){
            pair<int,int> n = adjlist[prevNode][i];
            if (n.first == Node){cost = n.second;}
            cout<<n.first<<","<<n.second<<"_";
        }
        cout<<":"<<cost<<endl;
        if (cost > maxCost)maxCost = cost;
        prevNode = Node;
        Node = dist[Node];
    }
    return maxCost;
    /*
    for (int i=1;i<N+1;i++){
        cout<<dist[i]<<" ";
    }*/
}

int main(){
    int n,e;cin>>n>>e;
    int a,b,d;
    for (int i=0;i<e;i++){
        cin>>a>>b>>d;
        adjlist[a].push_back(make_pair(b,d));
        adjlist[b].push_back(make_pair(a,d));
    }    
    int cost1 = dijkstra(n, 1, n);
    //int cost2 = dijkstra(N, T, H);
    //if (cost1 < 0 || cost2 < 0)cout << -1;
    //else cout<<cost1+cost2; 
    cout<<cost1;
}
