#include <bits/stdc++.h>
using namespace std;
/*crackers
int main(){
    int n;cin>>n;
    char input;bool isNotFour=true;
    for (int i=0;i<n;i++){
        cin>>input;
        if (input=='Y' and isNotFour){
            cout<<"Four";
            isNotFour=false;
        }
        if (i==n-1 and isNotFour)cout<<"Three";
    }
    return 0;
}
*/
/*voyage2
int main(){
    int N,M;cin>>N>>M;
    int n1,n2;vector<int> adjlist[N+1];
    for (int i=0;i<M;i++){
        cin>>n1>>n2;
        adjlist[n1].push_back(n2);
        adjlist[n2].push_back(n1);
    }    
    int shortestDistance=3;//,distance=0;
    bool vis[N+1];fill(vis,vis+N+1,false);
    /*dfs didnt work
    stack<int> S;
    S.push(1);
    while(!S.empty()){
        int node = S.top();
        S.pop();
        if (vis[node]) continue;
        vis[node]=true;
        
        //Simulate Recursion
        for (int a=0;a<(int)adjlist[node].size();++a){
            S.push(adjlist[node][a]);
        }
        //cout<<node<<"_"<<distance<<" ";
        if (distance<=2 and node==N){shortestDistance=2;}
        else if (distance>2){distance=0;continue;}
        distance++;
        
    }//
    /*bfs//
    queue<pair<int, int> > q;
    q.push(make_pair(1,0));
    int dist[N+1];
    fill(dist, dist+N+1, -1);
    while (!q.empty()) {
        int v = q.front().first;
        int d = q.front().second;
        q.pop();
        if (dist[v] != -1) continue;
        dist[v] = d;
        //cout<<v<<"_"<<d<<" ";
        if (d<=2 and v==N)shortestDistance=d;
        for (int i = 0; i < (int)adjlist[v].size(); i++) {
            q.push(make_pair(adjlist[v][i], d+1));
        }
    }
    
    //cout<<shortestDistance;
    if (shortestDistance > 2)cout<<"IMPOSSIBLE";
    else cout<<"POSSIBLE";
    return 0;
}
*/

/*centroid*/
int main(){
    long N,M;cin>>N>>M;
    long n1,n2,w;vector<pair<long,long>> adjlist[N+1];
    for (long i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }    
    bool vis[N+1];fill(vis,vis+N+1,false);
    long sums[N+1];fill(sums,sums+N+1,0);
    int dist[N+1];//fill(dist, dist+N+1, long_MAX);
    //for (long node=1;node<=N;node++){
        //cout<<"Node "<<node<<": ";
        int node=1;
        priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
        memset(dist, -1, sizeof(dist));
        pq.push(make_pair(0, node)); dist[node] = 0;
        while(!pq.empty()){
            pair<int,int> c = pq.top();
            //cout << c.first << "_" << c.second<<" ";
            pq.pop();
            if(c.first != dist[c.second]) continue;
            for(auto i : adjlist[c.second]){ //all elements in vector
                if(dist[i.first] == -1 || dist[i.first] > c.first + i.second){ // If distance not calculated or distance can be smaller
                dist[i.first] = c.first + i.second;
                pq.push(make_pair(dist[i.first], i.first));
                }
            }
        }
    
        for (long j=1;j<=N;j++)sums[node]+=dist[j];
    //}
    for (int i=1;i<N+1;i++){
        cout<<dist[i]<<" ";
    sort(sums,sums+N+1);
    cout<<sums[1];
}


/*longedge
int main(){
    long N,M;cin>>N>>M;
    long n1,n2,w;vector<pair<long,long>> adjlist[N+1];
    for (long i=0;i<M;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,w));
    }    
    
    long edges = M;
    long dist[N+1];//fill(dist, dist+N+1, long_MAX);
    for (long node=1;node<=N;node++){
        //cout<<"Node "<<node<<": ";
        queue<pair<long, long> > q;
        q.push(make_pair(node,0)); // (node,distance)
        fill(dist, dist+N+1, LONG_MAX);
        while (!q.empty()) {
            long v = q.front().first;
            long d = q.front().second;
            q.pop();
            if (dist[v] != LONG_MAX) continue;
            if (d<dist[v]){
                if (dist[v] != LONG_MAX)
                dist[v] = d;
            }
        }
        for (long j=1;j<=N;j++)sums[node]+=dist[j];
    }
    cout<<edges;
}
*/
