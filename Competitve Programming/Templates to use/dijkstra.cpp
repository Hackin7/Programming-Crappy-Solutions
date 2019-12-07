#include <bits/stdc++.h>
using namespace std;
///*dijkstra*/

vector<pair<int,int>> adjlist[10000];

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
    return dist[end];
    /*
    for (int i=1;i<N+1;i++){
        cout<<dist[i]<<" ";
    }*/
}

int main(){
    int N,M,H,T;cin>>N>>M>>H>>T;
    int n1,n2,w;
    for (int i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }
    int cost1 = dijkstra(N, H, T);
    int cost2 = 0;//dijkstra(N, T, H);
    //if (cost1 < 0 || cost2 < 0)cout << -1;
    cout<<cost1+cost2;
}
