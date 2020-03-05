#include <bits/stdc++.h>
using namespace std;

//const ll V=100005;
typedef long long ll;
typedef priority_queue<ll> pq;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    
    ///Adjacency List//////////////////////
    ll N, E, A, B, C;cin >> N >> E;
    
    ll V=N;
    set<pair<ll, ll> > g[V];
    ll count[V];fill(count,count+V,0);
    ll dist[V];fill(dist, dist+V, -1);
    
    for (ll i = 0; i < E; i++) {
        cin >> A >> B >> C;
        C=0;
        g[A].insert(make_pair(B, C));
        //g[B].insert(make_pair(A, C));
    }
    
    
    queue<pair<ll, ll> > q;
    q.push(make_pair(0,0));count[0]=1;dist[0]=0;
    while (!q.empty()) {
        ll v = q.front().first;
        //ll d = q.front().second;
        //cout<<v<<" "<<count[v]<<endl;
        q.pop();

        count[v] %= 1000000007;
        
        for (auto i: g[v]) {
            if (dist[i.first]==-1){
                dist[i.first] = 0;//d+i.second;
                q.push(make_pair(i.first,dist[i.first]));
                count[i.first]=count[v];//same number of paths
            }else{
                count[i.first]++;//another path to it
            }
        }
        //q.push(make_pair(g[v].top().first, d+1));
    }
    cout<<count[N-1];
}

/*
5 5
0 1 10
1 2 2
1 3 3
2 4 3
3 4 2

*/
