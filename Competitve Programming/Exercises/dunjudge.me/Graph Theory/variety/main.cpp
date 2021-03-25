#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<ll,ll> ipair;
const ll V=300000;

bool debug=false;
ll N,M,W;
vector<ipair> g[V];
ll cost[V];
ll dfs(ll x) {
    if (cost[x]!=-1) return cost[x];
    if (debug)cout<<"["<<x<<endl;
    if(x==N){cout<<"]";return 0;}
    cost[x]=INT_MAX;
    ll lcost=0;
    //Travel forward, no cost
    for (auto a:g[x]){
        lcost=dfs(a.first+1)+a.second; 
            if (debug)cout<<"  "<<a.first<<" "<<a.second<<":"<<lcost<<endl;
        cost[x] = min(cost[x],lcost);
    }
    //Look Backward for possible paths
    for(ll i=1;i<x;i++){//Difference
        int node = x-i;//x+i;
            if (debug)cout<<"("<<node<<" "<<W*i<<endl;
        lcost=dfs(node)+W*i;cost[x] = min(cost[x],lcost);
            if(debug)cout<<")";
    }
        if (debug)cout<<endl<<x<<":"<<cost[x]<<"]"<<endl;
    return cost[x];
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    memset(cost,-1,sizeof(cost));
    ///Adjacency List//////////////////////
    cin >> N >> M >> W;
    
    //ll order[M][3];
    for (ll i = 0; i < M; i++) {
        ll A, B, C; cin >> A >> B >> C;
        //order[i][0]=A;order[i][1]=B;order[i][2]=C;
        g[A].push_back(make_pair(B,C));
        //g[B].push_back(make_pair(A,C));
    }
    
    ll ans=dfs(0);
    if (cost[N-1]==-1){//Not visited
        ans=-1;
    }
    cout<<ans;
    return 0;
}
/*
3 3 1
0 1 2
1 2 2
0 2 6
* 
3 4 1
0 0 1
0 0 2
1 1 2
2 2 3
*/
