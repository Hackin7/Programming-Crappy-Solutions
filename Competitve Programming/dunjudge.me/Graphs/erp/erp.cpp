#include <bits/stdc++.h>
using namespace std;
/*dijkstra*/
//Have to use adjList, cannot adjMatrix
int main(){
    int N,M;cin>>N>>M;
    int n1,n2,w;vector<pair<int,int>> adjlist[N];
    for (int i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }    
    
    int K; cin>>K;
    for (int i=0; i<K; i++){
        int X,Y;cin>>X>>Y;
        int node=X;
        ////Dijkstra////////////
        bool vis[N];fill(vis,vis+N,false);
        priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
        int dist[N];
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
        if (dist[Y]==-1)cout<<-1;
        else cout<<dist[Y]-1;
        if (i!=K-1)cout<<endl;
    }
        ////////////////////////
}
