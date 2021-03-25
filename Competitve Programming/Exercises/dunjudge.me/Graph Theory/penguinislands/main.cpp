#include <bits/stdc++.h>
using namespace std;
//Undone
typedef int ll;
#define V 200
vector<pair<ll, ll> > adjlist[V];
bool visited[V];

ll prim(ll x)
{
    priority_queue<pair<ll,ll> , vector<pair<ll,ll> >, greater<pair<ll,ll> > > Q;
    ll minimumCost = 0;
    Q.push(make_pair(0, x));
    while(!Q.empty())
    {
        // Select the edge with minimum weight
        pair<ll,ll> p = Q.top();
        Q.pop();
        x = p.second;
        // Checking for cycle
        if(visited[x] == true)continue;
        visited[x] = true;
        minimumCost += p.first;
        for(auto i:adjlist[x])
        {
            ll y = i.second;
            if(visited[y] == false)
                Q.push(i);
        }
    }
    return minimumCost;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    ll N, E, A, B, C;
    cin >> N >> E;
    for (ll i = 0; i < E; i++) {
        cin >> A >> B >> C;
        adjlist[A].push_back(make_pair(C,B));
        adjlist[B].push_back(make_pair(C,A));
    }
    memset(visited,0,sizeof(visited));
    cout<<prim(1);
    return 0;
}
