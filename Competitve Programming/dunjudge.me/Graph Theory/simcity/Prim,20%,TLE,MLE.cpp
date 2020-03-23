#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define V 1000000
vector<pair<ll, ll> > adjlist[V];
bool visited[V];

//20%, TLE, MLE
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

    //Let the nodes N to 2N-1 be the airport nodes
    //Connect the (N to 2N-1)-N node to the rest of the world at the cost of D[i]
    ll N,R;cin>>N>>R;
    ll D;for(int i=0;i<N;i++){
        cin>>D;
        adjlist[i].push_back(make_pair(D,N+i));
        adjlist[N+i].push_back(make_pair(D,i));
        //Connect all other notes, 0 cost
        for(int j=0;j<N;j++){
            if(j!=i){
                adjlist[N+i].push_back(make_pair(0,N+j));
                adjlist[N+j].push_back(make_pair(0,N+i));
            }
        }
    }

    ll A,B,C;
    for (ll i = 0; i < R; i++) {
        cin>>A>>B>>C;
        adjlist[A].push_back(make_pair(C,B));
        adjlist[B].push_back(make_pair(C,A));
    }
    cout<<prim(0);
    return 0;
}
