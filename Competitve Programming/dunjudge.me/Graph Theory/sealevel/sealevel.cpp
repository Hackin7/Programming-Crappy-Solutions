#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
const ll V=1000000;
vector<pair<ll,ll> > adjlist[V];
bool visited[V];
ll height[V];
void dfs(ll x, ll end, ll val){
    if (visited[x])return;
    visited[x] = true;
    height[x]=val;
    //if (x == end){return;}
    for (ll i=0;i<(ll)adjlist[x].size();i++){
        //cout<<adjlist[x][i].first<<",";
        dfs(adjlist[x][i].first,end,val+adjlist[x][i].second);
    }
}
int main(){
    fill(visited, visited+sizeof(visited), false);
    ll N;cin>>N;
    ll n1,n2,w;
    for (ll i=0;i<N-1;i++){
        cin>>n1>>n2>>w;
        adjlist[n1].push_back(make_pair(n2,w));
        adjlist[n2].push_back(make_pair(n1,-w));
    }
    dfs(1,N,0);
    ll q; cin>>q;
    for (ll i=0;i<q;i++){
        ll x,y; cin>>x>>y;
        if (i!=0){cout<<endl;}
        //if(height[x] == 0){}else{dfs(x,y,0);}
        cout<<height[y]-height[x];
    }
}
