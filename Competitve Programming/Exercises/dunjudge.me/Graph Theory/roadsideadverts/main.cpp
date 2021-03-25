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
vector<int> toconnect;
bool vis[V];
int ans=0;
//Since it is a tree, unlikely will be any cycles
int dfs(int node) {
    if (vis[node]){return 0;} vis[node] = true;
    //cout<<node<<endl;
    for (auto i:toconnect){
        if (node==i)return 0;
    }
    int ans=0;
    for (auto a: adjlist[node]){
        ans += a.second + dfs(a.first); 
    }
    return maxcost;
}

//vector<pair<int, int> > adjlist[V];
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int N;
    cin >> N;

    memset(parent,-1,sizeof(parent));
    vector <tuple<int,int,int> > edges ; // weight,node A,node B
    for (int i=0;i<N-1;i++) {
        int u,v,w;cin>>u>>v>>w;
        //adjlist[A].push_back(make_pair(C,B));
        //adjlist[B].push_back(make_pair(C,A));
        edges.push_back(make_tuple(w,u,v));
    }
    //Kruskal
    sort(edges.begin(),edges.end());
    int total_weight = 0;
    for (auto e : edges) {
        int weight,a,b;tie (weight,a,b) = e ;//Tuple Unpacking
        if (root(a) == root(b)) // taking this edge wiint cause a cycle
            continue;
        total_weight += weight ; // take this edge
        connect(a,b); // connect them in the UFDS
        adjlist[a].push_back(make_pair(weight,b));
        adjlist[b].push_back(make_pair(weight,a));
    }
    //cout<<total_weight;
    
    int Q;cin>>Q;
    for(int i=0;i<Q;i++){
        int a,b,c,d,e; cin>>a>>b>>c>>d>>e;
        toconnect.clear();
        toconnect.push_back(b);
        toconnect.push_back(c);
        toconnect.push_back(d);
        toconnect.push_back(e);
        if (i!=0)cout<<"\n";
        cout<< dfs(toconnect);//Return the minimum spanning tree to abcde
    }
    
    return 0;
}
