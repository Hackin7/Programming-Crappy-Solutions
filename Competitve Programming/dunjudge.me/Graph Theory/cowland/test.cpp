#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const ll V=100010,K=20;
vector<ll> adjlist[V];
int e[V];

ll p[V][K]; //node,kth ancestor
//DFS to compute node parents for p[i][0], first parent
bool visited[V];
ll depth[V];
void dfs(ll x){
    if (visited[x])return;
    visited[x]=true;
    for (auto i:adjlist[x]){
        if (!visited[i]){
            if (p[i][0] == -1){
                //cout<<i.first<<"<-"<<x<<endl;
                p[i][0] = x;
                depth[i] = depth[x]+1;
            }
            dfs(i);
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
    cout<<endl<<depth[a]<<"="<<depth[b]<<endl;
    cout<<a<<"_"<<b<<endl;
    if(depth[a]<depth[b]){swap(a,b);}
    //Equalise depth
    for(ll k=log2(N);k>=0;k--){
        ll parent = p[a][k];//find_parent(a,k);
        if(parent!=-1 && depth[parent]>=depth[b]){
            a=parent;
        }
    }
    cout<<depth[a]<<"="<<depth[b]<<endl;
    cout<<a<<"_"<<b<<endl;
    if (a==b)return a;
    //Jump parent by parent
    for(ll k=log2(N);k>=0;k--){
        ll parent = find_parent(a,k);//p[a][k]
        ll parentb = find_parent(b,k);//p[b][k]
        //cout<<"->"<<parent<<"_"<<parentb<<endl;
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
        //cout<<"DFS"<<curr.first<<","<<curr.second<<endl;
        if (curr.first == end){return curr.second;}
        
        visited[curr.first] = true;
        for(auto i:adjlist[curr.first]){
            //cout<<"  "<<i<<","<<e[i];
            if (!visited[i]){
                nodes.push_back(make_pair(i,e[i]^curr.second));
            }
        }
    }
    return 0;
}
int main(){
    int N,Q;cin>>N>>Q;
    for(int i=1;i<=N;i++){cin>>e[i];}
    int A,B;for (int i=0;i<N-1;i++){
        cin>>A>>B;
        adjlist[A].push_back(B);
        adjlist[B].push_back(A);
    }
    N++;
    fill(visited,visited+N,false);fill(depth,depth+N,0);
    for(ll i=0;i<N;i++){p[i][0]=-1;}
    dfs(A);//Pick random node as root
    //cout<<endl;for(ll i=0;i<N;i++){cout<<p[i][0]<<"_";}
    cout<<endl;for(ll i=0;i<N;i++){cout<<depth[i]<<"_";}
    calc_k_parents(N);
    
    bool flag = false;
    for(int i=0;i<Q;i++){
        int a,x,y;cin>>a>>x>>y;
        if (a==1){e[x] = y;}
        else{
            int p = lca(N,x,y);
            fill(visited,visited+N,false);fill(depth,depth+N,0);
            int ans = dfsDist(p,x)^dfsDist(p,y);
            ans = ans^e[p];
            if (flag){cout<<"\n";}
            else{flag=true;}
            //cout<<p<<":";
            cout<<ans;
        }
    }
    return 0;
}
