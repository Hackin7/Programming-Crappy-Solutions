#include <bits/stdc++.h>
using namespace std;
/*dijkstra*/
int main(){
    int N,M;cin>>N>>M;
    int n1,n2,w;vector<pair<int,int>> adjlist[N+1];
    for (int i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }    
    
    int node=1;
    
    bool vis[N+1];fill(vis,vis+N+1,false);
    priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
    int dist[N+1];
    memset(dist, -1, sizeof(dist));
    pq.push(make_pair(0, node)); dist[node] = 0;
    while(!pq.empty()){
        pair<int,int> c = pq.top();
        //cout << c.first << "_" << c.second<<" ";
        pq.pop();
        if(c.first != dist[c.second]) continue;
        for(auto i : adjlist[c.second]){
            if(dist[i.first] == -1 || dist[i.first] > c.first + i.second){
                dist[i.first] = c.first + i.second;
                pq.push(make_pair(dist[i.first], i.first));
            }
        }
    }
    cout<<dist[N];
    /*
    for (int i=1;i<N+1;i++){
        cout<<dist[i]<<" ";
    }*/
}
