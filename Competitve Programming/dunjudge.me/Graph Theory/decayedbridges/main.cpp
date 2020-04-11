#include <bits/stdc++.h>
using namespace std;

#define V 1000000
typedef long long ll;
typedef pair<int,int> ipair;
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

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(parent,-1,sizeof(parent));
    
    ll N,M;cin>>N>>M;
    ll A[M],B[M];for(ll i=0;i<M;i++){cin>>A[i]>>B[i];}
    
    //cout<<endl;for(ll i=0;i<M;i++){cout<<A[i]<<","<<B[i]<<endl;}
    
    //Idea: Precompute number of pairs to do
    set<ipair> pairs;for(ll i=1;i<=N;i++){for(ll j=i+1;j<=N;j++){pairs.insert(make_pair(i,j));}}
    
    ll ans[M];ans[M-1]=N*(N-1)/2;
    for(ll m=M-1-1;m>=0;m--){
        ans[m]=ans[m+1];
        //cout<<endl<<m<<"---"<<A[m+1]<<"_"<<B[m+1]<<endl;
        connect(A[m+1],B[m+1]);
        //Check number of pairs
        vector<ipair> toerase;
        for(auto p:pairs){
            int i,j;i=p.first,j=p.second;
            int connection = isConnected(i,j);
            if (connection){
                ans[m]-=connection;
                toerase.push_back(p);
            }
        }
        for(auto p:toerase){pairs.erase(p);}
    }
    
    for(ll i=0;i<M;i++){
        if(i!=0)cout<<"\n";
        cout<<ans[i];
    }
    return 0;
}

/*
4 5
1 2
3 4
1 3
2 3
1 4
*/
