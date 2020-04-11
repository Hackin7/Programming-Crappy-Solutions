#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef pair<int,int> pi;
typedef tuple<int,int,int> tiii;
#define V 1000000
int N,M,S;vector<pi> g[V];

int mmps[V];
int dfs(int x, int d){
    if(mmps[x]!=INT_MAX){return 0;}//minmaxpath[x];}
    
    cout<<x<<" "<<mmps[x]<<endl;
    if (mmps[x]>d){mmps[x]=d;}
    for(auto i:g[V]){
        dfs(i.first,max(d,i.second));
    }
    return 0;
}
int main(){
    //ios_base::sync_with_stdio(false);
    //cin.tie(NULL);
    
    cin>>N>>M>>S;
    for(int i=0;i<M;i++){
        int A,B,W;cin>>A>>B>>W;
        g[A].push_back(make_pair(B,W));
        g[B].push_back(make_pair(A,W));
    }
    //Minmaxpath
    memset(mmps,INT_MAX,sizeof(mmps));
    //for(int i=0;i<N;i++){mmps[i]=INT_MAX;}
    dfs(S,0);
    /*
    //Dijkstra
    bool vis[N+1];fill(vis,vis+N+1,false);
    priority_queue<tiii,vector<tiii>,greater<tiii> > pq; // distance, node
    int dist[N+1];
    memset(dist, -1, sizeof(dist));
    pq.push(make_tuple(0, S,-1)); dist[S] = 0;
    while(!pq.empty()){
        tiii c = pq.top();pq.pop();
        int d,n,e;tie(d,n,e)=c;
        //cout<<c.first<<"_"<<c.second<<" ";
        if(d != dist[n]) continue;
        for(auto i : g[n]){
            
            
            if(dist[i.first] == -1 || dist[i.first] > d + i.second){
                //if it is also the minmaxpath
                int mmp=max(e,i.second);
                if(mmp == mmps[i.first]){
                    dist[i.first] = d + i.second;
                }
                pq.push(make_tuple(
                    dist[i.first],
                    i.first,
                    mmp));
            }
        }
    }
    
    bool f=0;
    for(int i=0;i<N;i++){
        if(dist[i]!=-1 && i!=S){
            if (f){cout<<" ";}else{f=1;}
            cout<<i;
            cout<<","<<dist[i];
        }
    }*/
    return 0;
}
/*
4 4 0
0 1 5
1 2 1
0 3 3
2 3 4
*/
