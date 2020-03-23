#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
#define V 1000000
vector<pair<ll, ll> > adjlist[V];
bool visited[V];
//https://cs.stackexchange.com/questions/4942/finding-paths-with-smallest-maximum-edge-weight

vector<pair<ll, ll> > g[V];
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
        //cout<<x<<','<<p.first<<endl;
        // Checking for cycle
        if(visited[x] == true)continue;
        visited[x] = true;
        minimumCost = minimumCost+p.first;//max(minimumCost,p.first);
        for(auto i:adjlist[x])
        {
            ll y = i.second;
            if(visited[y] == false){
                Q.push(i);
                //Create new MST
                int A=x,B=y,C=i.first;
                g[A].push_back(make_pair(B,C));
                g[B].push_back(make_pair(A,C));
                //cout<<A<<","<<B<<":"<<g[A][0].first<<" ";
            }
        }
    }
    return minimumCost;
}
int cost[V];
void find(int source,int e){
    int parent[V];memset(parent,-1,sizeof(parent));
    
    priority_queue<pair<int,int>, vector<pair<int,int> >, greater<pair<int,int> > > pq; // distance, node
    
    int dist[V];
    memset(dist, -1, sizeof(dist));
    pq.push(make_pair(0, source)); dist[source] = 0;
    while(!pq.empty()){
        pair<int,int> c = pq.top();
        //cout<<"["<<c.second<<endl;
        pq.pop();
        if(c.first != dist[c.second]) continue;
        for(auto i : g[c.second]){
            if(dist[i.first] == -1 || dist[i.first] > c.first + i.second){
                //cout<<"   {"<<i.first<<endl;
                parent[i.first]=c.second;
                cost[i.first] = i.second;
                dist[i.first] = c.first + i.second;
                pq.push(make_pair(dist[i.first], i.first));
            }
        }
    }
    //cout<<endl;
    int ans=0,curr=e;
    while (parent[curr]!=-1&&curr != source){
        //cout<<curr<<","<<cost[curr]<<endl;
        ans = max(ans,cost[curr]);
        curr=parent[curr];
        
    }
    //cout<<curr<<endl;
    //cout<<"Dist:"<<dist[e]<<endl;
    cout<<ans;
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
    prim(1);
    memset(visited,0,sizeof(visited));
    find(1,N);
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
