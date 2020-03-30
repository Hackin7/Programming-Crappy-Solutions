#include <bits/stdc++.h>
using namespace std;

#define V 1000000
vector<pair<int,int> > adjlist[V];

int visited[V];
int cycleTime[V];//Memoization
bool cycle[V];
#define INVALID -1
//Let this get the max time to make 1 whole loop
int gcd (int a, int b) {
    if (b == 0) return a;
    return gcd(b, a%b);
}
int dfs(int start,int u,int t){//node,time

    //It's a cycle
    if(visited[u]==1){
        //Only care about cycles back to start
        cycle[u]=1;return t;//INVALID;
    }
    //Finished Visiting, Already Calculated
    if(visited[u]==2)return cycleTime[u];

    visited[u]=1;//currently visiting this node
    cycleTime[u]=INVALID;//if Cannot make a cycle
    for(auto i: adjlist[u]){
        int newTime = dfs(start,i.first,t+i.second);
        if (cycleTime[u]==INVALID){
                cycleTime[u]=newTime;
        }else if(newTime!=INVALID){
            cycleTime[u] = gcd(cycleTime[u],newTime);
        }
    }
    if(start==u&&!cycle[u]){cycleTime[u]=-1;}
    visited[u]=2;//finished visiting
    return cycleTime[u];
}
int main() {
    int n,m;cin>>n>>m;
    for (int i=0;i<m;i++){
        int a,b,c;cin>>a>>b>>c;
        adjlist[a-1].push_back(make_pair(b-1,c));
    }

    int p[n];

    for(int i=0;i<n;i++){
        memset(visited,0,sizeof(visited));
        //memset(cycle,0,sizeof(cycle));
        p[i]=dfs(i,i,0);
        if(i!=0)cout<<"\n";
        cout<<p[i];
    }
}

/*
7 8
1 2 1
2 3 4
3 2 4
4 6 3
6 5 3
3 3 2
5 4 4
5 7 1
*/
