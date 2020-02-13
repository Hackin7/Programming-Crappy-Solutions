#include <bits/stdc++.h>
using namespace std;
typedef int ll;
typedef pair<ll,ll> ipair;
ll bfs(ll N,vector<ipair> *adjlist,ll start, ll end){
    bool visited[N*2];memset(visited,false,sizeof(visited));
    deque<tuple<ll,ll> > nodes;
    nodes.push_back(make_tuple(start,0));
    while (!nodes.empty()){
        auto curr=nodes.front();
        nodes.pop_front();
        ll a=get<0>(curr);
        ll d=get<1>(curr);
        //cout<<"Node:"<<a%N<<","<<d<<":"<<a/N<<endl;
        if (a%N==end){return d;}
        //cout<<":";
        visited[a]=true;
        
        for(auto next:adjlist[a]){
            ll y=next.first;//,w=next.second;
            if (!visited[y]){
                //cout<<" "<<y%N<<","<<!(y/N)<<endl;
                visited[y]=true;
                nodes.push_back(make_tuple(y,d+1));
            }
        }
    }
    return -1;
}
int main() {
    ll N,E;cin>>N>>E;
    //if (N==0||E==0){cout<<-1;return 0;}
    vector<ipair> adjlist[N*2]; //Next N nodes for nodes coming from edges of 1
    for(ll i=0;i<E;i++){
        ll a,b,w;cin>>a>>b>>w;
        if (w==0){//From 0 edges to 1
            adjlist[b].push_back(make_pair(N+a,w));
            adjlist[a].push_back(make_pair(N+b,w));
        }else{//From 0 edges to 1
            adjlist[N+a].push_back(make_pair(b,w));
            adjlist[N+b].push_back(make_pair(a,w));
        }
        //Subtask 1
        //adjlist[a].push_back(make_pair(b,w));
        //adjlist[b].push_back(make_pair(a,w));
    }
    
    ll dist=bfs(N,adjlist,0,N-1);
    if (dist==-1){dist=INT_MAX;}
    dist=min(dist,bfs(N,adjlist,N,N-1));
    cout<<dist;
    return 0;
}

/*
5 10
0 1 0
0 1 1
1 2 0
1 2 1
2 3 0
2 3 1
3 1 0
3 1 1
1 4 0
1 4 1

5 5
0 1 1
1 2 0
3 1 0
3 2 1
1 4 1
*/
