#include <bits/stdc++.h>
using namespace std;

#define V 1000000

//UFDS
int parent[V];
int root(int x) {
    if (parent[x]==-1) return x;
    return parent[x] = root(parent[x]);
}
bool isConnected(int x, int y) {
    return root(x) == root(y);
}
void connect(int x, int y) {
    int rootX = root(x);
    int rootY = root(y);
    if(rootX != rootY)
        parent[rootX] = rootY;
}
vector<pair<int, int> > adjlist[V];

bool vis[V];
int ans=0;
int dfs(int N,int node,int maxcost) {
    if (vis[node]){return 0;} vis[node] = true;
    //cout<<node<<endl;
    if (node==N){
        ans=maxcost;return 0;
    }
    for (auto a: adjlist[node]){
        maxcost=max(maxcost,a.first);
        dfs(N,a.second,maxcost);
    }
    return maxcost;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N, E, A, B, C;
    cin >> N >> E;

    memset(parent,-1,sizeof(parent));
    vector <tuple<int,int,int> > edges ; // weight,node A,node B
    for (int i=0;i<E;i++) {
        cin >> A >> B >> C;

        edges.push_back(make_tuple(C,A,B));
    }
    
    //Kruskal
    sort(edges.begin(),edges.end()); //Sort by ascending weights
    for (auto e : edges) {
        int weight,a,b;tie (weight,a,b) = e ;//Tuple Unpacking
        if (root(a) == root(b)) // taking this edge wiint cause a cycle
            continue;
        //cout<<weight<<":"<<a<<" "<<b<<endl;
        // take this edge
        adjlist[a].push_back(make_pair(weight,b));
        adjlist[b].push_back(make_pair(weight,a));
        connect(a,b); // connect them in the UFDS
    }
    dfs(N,1,0);
    cout<<ans;
    return 0;
}

/*
5 7
1 2 10
1 5 10
2 3 10
3 4 2
4 5 10
1 4 1
3 5 1
*/
