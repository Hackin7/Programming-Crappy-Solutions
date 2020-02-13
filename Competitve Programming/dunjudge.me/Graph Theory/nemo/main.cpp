#include <bits/stdc++.h>
using namespace std;
//25%
typedef long long ll;
ll parent[1000000];
ll root(ll x) {
    //x--;
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
        parent[rootX] = rootY; // Y is root of X
}

typedef pair<ll,ll> lpair;
lpair subset(lpair a,lpair b){
    return make_pair(
        max(a.first, b.first),
        min(a.second, b.second)
    );
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N,E;cin>>N>>E;
    fill(parent,parent+N+1,-1);
    for(ll i=0;i<E;i++){
        ll A,B,O,C; cin>>A>>B>>O>>C;
        connect(A,B);
    }
    ll TC;cin>>TC;
    bool flag=false;
    for(ll i=0;i<TC;i++){
        ll X,Y,T;cin>>X>>Y>>T;
        if(flag){cout<<"\n";}else{flag = true;}
        if (isConnected(X,Y)){cout<<"Y";}
        else{cout<<"N";}
    }
    return 0;
}
