#include <bits/stdc++.h>
using namespace std;

#define V 1000000
//https://dunjudge.me/analysis/submissions/722900/
vector<int> g[V];
int dist[V];
int furthest=0,maxdist=0;
void dfs(int x, int p) { // x = node, p = parent 
    //cout<<x<<"<"<<endl;
    for (int i : g[x]) {
        if (i == p) continue; 
        dist[i] = dist[x] + 1;
        dfs(i, x); 
        if (dist[i]>maxdist){
            maxdist=dist[i];
            furthest=i;
        }
        
    }
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;cin>>N;
    for(int n=1;n<=N-1;n++){
        int x;cin>>x;
        g[n].push_back(x-1);
        g[x-1].push_back(n);
        
        memset(dist,0,sizeof(dist));maxdist=0;
        dfs(0,0);
        memset(dist,0,sizeof(dist));maxdist=0;
        dfs(furthest,furthest);
        
        cout<<maxdist<<"\n";
        //cout<<endl;for(int i=0;i<=5;i++){cout<<dist[i]<<" ";}cout<<endl;
    }
    
    
    return 0;
}
/*
6
1
2
2
1
5
*/
