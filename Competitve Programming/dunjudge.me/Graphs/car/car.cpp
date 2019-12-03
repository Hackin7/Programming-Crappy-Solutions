#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,e;cin>>n>>e;

    vector<pair<int,int> > adjList[10000]; // node, weight

    int a,b,d;
    for (int i=0;i<e;i++){
        cin>>a>>b>>d;
        adjList[a].push_back(make_pair(b,d));
        adjList[b].push_back(make_pair(a,d));
    }
    cout<<"D";
    int source = 1;
    priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
    bool visited[10000];
    memset(visited, 0, sizeof(visited));
    pq.push(make_pair(0, source));
    int totalWeights = 0;
    while(!pq.empty()){
        pair<int,int> c = pq.top();
        pq.pop();
        if(visited[c.second]) continue;
        totalWeights += c.first;
        for(pair<int, int> i : adjList[c.second]){
            pq.push(make_pair(i.second, i.first));
        }
    }

    cout << totalWeights;

}
