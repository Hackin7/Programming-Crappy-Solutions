#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define V 1000000

//UFDS
ll parent[V];
ll root(ll x) {
    if (parent[x]==-1) return x;
    return parent[x] = root(parent[x]);
}
bool isConnected(ll x, ll y) {
    return root(x) == root(y);
}
void connect(ll x, ll y) {
    ll rootX = root(x);
    ll rootY = root(y);
    if(rootX != rootY)
        parent[rootX] = rootY;
}
//vector<pair<ll, ll> > adjlist[V];
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N, E, A, B, C;
    cin >> N >> E;

    memset(parent,-1,sizeof(parent));
    vector <tuple<ll,ll,ll> > edges ; // weight,node A,node B
    for (ll i=0;i<E;i++) {
        cin >> A >> B >> C;
        //adjlist[A].push_back(make_pair(C,B));
        //adjlist[B].push_back(make_pair(C,A));
        edges.push_back(make_tuple(C,A,B));
    }
    
    //Kruskal
    sort(edges.begin(),edges.end());
    ll total_weight = 0;
    for (auto e : edges) {
        ll weight,a,b;tie (weight,a,b) = e ;//Tuple Unpacking
        if (root(a) == root(b)) // taking this edge will cause a cycle
            continue;
        total_weight += weight ; // take this edge
        connect(a,b); // connect them in the UFDS
    }
    cout<<total_weight;
    return 0;
}
