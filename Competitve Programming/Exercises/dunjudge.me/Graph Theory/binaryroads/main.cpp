#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;

int bfs(int N,vector<ipair> *adjlist,int start, int end){
    
    int dist[N*2];memset(dist,-1,sizeof(dist));
    deque<int> nodes;
    nodes.push_back(start);dist[start]=0;
    
    while (!nodes.empty()){
        int curr=nodes.front();
        nodes.pop_front();
        //cout<<"Node:"<<curr%N<<","<<dist[curr]<<":"<<curr/N<<endl;
        //cout<<":";
        if (curr%N==end){return dist[curr];}
        
        for(auto next:adjlist[curr]){
            int y=next.first;
            //cout<<" "<<y%N<<","<<!(y/N)<<endl;
            if (dist[y]==-1 || dist[y]>dist[curr]+1){
                
                dist[y]=dist[curr]+1;
                nodes.push_back(y);
            }
        }
    }
    return INT_MAX;
}
int main() {
    int N,E;cin>>N>>E;
    
    vector<ipair> adjlist[N*2]; //Next N nodes for nodes coming from edges of 1
    for(int i=0;i<E;i++){
        int a,b,w;cin>>a>>b>>w;
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
    
    int dist=min(bfs(N,adjlist,0,N-1),bfs(N,adjlist,N,N-1));
    if (dist==INT_MAX){dist=-1;}
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
 
3 2
0 1 1
0 1 0
*/
