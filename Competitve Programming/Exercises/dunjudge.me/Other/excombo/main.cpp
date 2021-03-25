#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef pair<int,int> ipair;
#define V 100000

int D[V],C[V],S[V],H[V];

vector<ipair> adjlist[V];
int visited[V];int dp[V];
bool cycle=false;
int dfs(int u,int k){//dfs approach to DP on DAG
    cout<<u<<","<<k<<endl;
    if (k<0){return 0;}
    if(visited[u]==1)cycle=true;
    //if(cycle){
    //    cout<<"["<<u<<"]";
    //    return 0;}//doesn’t matter what,just return ASAP
    if(visited[u]==2)return dp[u];
    visited[u]=1;//currently visiting this node
    for(auto i: adjlist[u]){
        int leftK=k-C[i.second];
        if (leftK>0){cout<<u<<"/";
            //Damage
            dp[u]=max(dp[u],dfs(i.second,leftK)+i.first);
        }
    }
    visited[u]=2;//finished visiting
    return dp[u];
}


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N,K;cin>>N>>K;
    
    for(int i=0;i<N;i++){
        cin>>D[i]>>C[i]>>S[i]>>H[i];
    }
    for(int i=0;i<N;i++){for(int j=0;j<N;j++){
        //if (i==j)continue;
        //cout<<i<<'.'<<j<<endl;
        if(H[i]>=S[j]){
        
            adjlist[i].push_back(make_pair(D[j],j));
        }
    }}
    int damage=0;
    for(int i=0;i<N;i++){
        damage=max(damage,dfs(i,K));
        cout<<endl<<endl<<i<<":"<<damage<<endl;
        //if (cycle){damage=-1;break;}
        memset(visited,0,sizeof(visited));
        memset(dp,0,sizeof(dp));
    }
    cout<<damage;
    return 0;
}
/*
2 3
1 0 3 2
1 0 1 3
*/
