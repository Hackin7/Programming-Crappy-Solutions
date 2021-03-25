#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/722542/
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
//vector<pair<int, int> > adjlist[V];
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(parent,-1,sizeof(parent));
    
    int n,w;cin>>n>>w;
    for(int i=0;i<w;i++){
        int wa,wb;cin>>wa>>wb;
        connect(wa,wb);
    }
    
    vector <tuple<int,int,int> > edges ; // weight,node A,node B
    int b;cin>>b;
    for (int i=0;i<b;i++) {
        int ba,bb,bc;cin >> ba >> bb >> bc;
        //adjlist[A].push_back(make_pair(C,B));
        //adjlist[B].push_back(make_pair(C,A));
        edges.push_back(make_tuple(bc,ba,bb));
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
    }
    cout<<total_weight;
    return 0;
}
