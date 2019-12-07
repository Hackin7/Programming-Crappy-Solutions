#include <bits/stdc++.h>
using namespace std;

int INF = INT_MAX;
vector<int> adjList[100010];
bool visited[100010];
void bfs(int source, int depth){
    int count = 0;
    memset(visited, false, sizeof(visited));
    deque<tuple<int, int> > nodes; //source, depth
    nodes.push_back(make_tuple(source,1));
    while (!nodes.empty()){
        tuple<int, int> curr = nodes.front();
        nodes.pop_front();
        int n = get<0>(curr), d = get<1>(curr);
        //cout<<"Node "<<n<<endl;
        if (d==depth){count++;}
        visited[n] = true;
        for (int i:adjList[n])
            if (!visited[i]){nodes.push_back(make_tuple(i,d+1));}
    }
    cout<<count;
}

int main(){
    //Input
    int n;cin>>n;//, e; cin>>n>>e;
    for (int i=0;i<n-1;i++){
        int u,v; cin>>u>>v;
        //Cost setting
        adjList[u].push_back(v);
        adjList[v].push_back(u);
    }

    int x; cin>>x;
    bfs(1,x);
}
