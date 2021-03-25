#include <bits/stdc++.h>
#include <fstream>
using namespace std;

#define V 100000
typedef long long ll;
typedef pair<int,int> ipair;



int dijkstra(int N, vector<ipair> adjlist[], int node, int end){ 
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
}


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N,M,K; cin>>N>>M>>K;
    vector<ipair> g[N+1];
    for(int i=0;i<M;i++){
        int A,B,C; cin>>A>>B>>C;
        g[A].push_back(make_pair(B,C));
        g[B].push_back(make_pair(A,C));
    }
    int A[K];for(int i=0;i<K;i++){cin>>A[i];}
    sort(A,A+K);
    
    
    int ans = INT_MAX;
    for(int i=2;i<K;i++){
        for(int j=i+1;j<K;j++){
            ans = min(ans,dijkstra(N,g,A[i],A[j]));
        }
    }
    cout<<ans+1;
    return 0;
}
/*c
5 4 4
1 2 1
3 4 2
4 5 5
5 3 8
3 1 5 2
*/
