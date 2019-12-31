#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const ll V=100010,K=20;
vector<pair<ll,ll> > adjlist[V];
ll p[V][K]; //node,kth ancestor
//DFS to compute node parents for p[i][0], first parent
bool visited[V];
ll depth[V];
void dfs(ll x){
    if (visited[x])return;
    visited[x]=true;
    for (auto i:adjlist[x]){
        if (!visited[i.first]){
            if (p[i.first][0] == -1){
                //cout<<i.first<<"<-"<<x<<endl;
                p[i.first][0] = x;
                depth[i.first] = depth[x]+1;
            }
            dfs(i.first);
        }
    }
}
void calc_k_parents(ll N){
    for (ll k=1;k<K;k++){
        for (ll i=0;i<N;i++){
            if (p[i][k-1] != -1){
                p[i][k]= p[p[i][k-1]][k-1];
            }else{p[i][k]=-1;}
           // if (k==2)cout<<i<<","<<k<<":"<<p[i][k-1]<<","<<p[p[i][k-1]][k-1]<<","<<p[i][k]<<endl;

        }
    }
}
ll find_parent(ll x,ll k){
    for (ll i=K;i>=0;i--){
        if (k>= (1<<i)){
            if (x==-1)return -1;
            x=p[x][i];
            k-=1<<i;
        }
    }
    return x;
}

ll lca(ll N,ll a,ll b){
    if(depth[a]<depth[b]) swap(a,b);
    //Equalise depth
    for(ll k=log2(N);k>=0;k--){
        ll parent = find_parent(a,k);//p[a][k]
        if(parent!=-1 && depth[parent]>=depth[b]){
            a=parent;
        }
    }
    if (a==b)return a;
    //Jump parent by parent
    for(ll k=log2(N);k>=0;k--){
        ll parent = find_parent(a,k);//p[a][k]
        ll parentb = find_parent(b,k);//p[b][k]
        if(parent!=parentb)a=parent,b=parentb;
    }
    return p[a][0];
}

ll dfsDist(ll x,ll end){
    deque<pair<ll,ll> > nodes;
    nodes.push_back(make_pair(x,0));
    while (!nodes.empty()){
        pair<ll,ll> curr = nodes.front();
        nodes.pop_front();
        
        if (curr.first == end){return curr.second;}
        //cout<<"DFS"<<curr.first<<","<<curr.second<<endl;
        visited[curr.first] = true;
        for(auto i:adjlist[curr.first]){
            if (!visited[i.first]){
                nodes.push_back(make_pair(i.first,i.second+curr.second));
            }
        }
    }
    return 0;
}
int main(){
    ll N; cin>>N; ll Q; cin>>Q;
    ll A,B,w;for (ll i=0;i<N-1;i++){
        cin>>A>>B>>w;
        adjlist[A].push_back(make_pair(B,w));
        adjlist[B].push_back(make_pair(A,w));
    }

    fill(visited,visited+N,false);fill(depth,depth+N,0);
    for(ll i=0;i<N;i++){p[i][0] = -1;}
    dfs(A);//Pick random node as root
    //cout<<endl;for(ll i=0;i<N;i++){cout<<p[i][0]<<"_";}
    calc_k_parents(N);
    //for(ll j=0;j<5;j++){cout<<endl;for(ll i=0;i<N;i++){cout<<p[i][j]<<"_";}}
    
    ll X,Y; for(ll i=0;i<Q;i++){
        cin>>X>>Y;
        if (i!=0)cout<<"\n";
        ll p = lca(N,X,Y);
        fill(visited,visited+N,false);
        ll da=dfsDist(p,X),db=dfsDist(p,Y);
        cout<<da+db;//da<<":"<<db;
    }
    return 0;
}

/* Test Input
4 3
1 2 5
2 3 6
2 4 1
1 2
2 3
1 3
*/
