#include <bits/stdc++.h>
using namespace std;

#define V 300000
vector<pair<int,int> > g[V];

int pigeons[V];
int spot[V];
bool vis[V];int maxdist=0;int newnode=0;
void dfs(int node,int dist) {
    //cout<<":"<<node<<endl;
    if (vis[node]) return;
    vis[node] = true;
    
    if (dist>maxdist && node>newnode && spot[node]==0){
        //cout<<"/";
        newnode=node;maxdist=dist;
    }
    for (auto a:g[node]){
        if(!vis[a.first]&& spot[a.first]==0){
            //cout<<"\t";
            dfs(a.first, dist+a.second);
        }
    }
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    
    int N,Q,A,B,L;
    cin>>N>>Q;
    for (int i=0;i<N-1;i++) {
        cin>>A>>B>>L;
        if(B>A){g[A].push_back(make_pair(B,L));}
        else{g[B].push_back(make_pair(A,L));}
    }
    
    memset(spot,0,N);
    
    int p=0;
    for(int i=0;i<Q;i++){
        int T,X;cin>>T>>X;
        if(T==1){
            memset(vis,0,N);maxdist=-1;newnode=-1;
            dfs(X,0);
            pigeons[p]=newnode;
            if (newnode!=-1)spot[newnode]=p+1;
            p++;
            //for(int j=0;j<N;j++){cout<<spot[j]<<" ";}cout<<endl;
        }
        else{
            //if (spot[X]!=0){pigeons[spot[X]-1]=-1;}
            spot[X]=0;
        }
    }
    bool flag=0;
    for(int i=0;i<p;i++){
        if(flag)cout<<"\n";
        else flag=1;
        cout<<pigeons[i];
    }
    return 0;
}
/*
4 1
0 1 3
0 2 1
2 3 3
1 0
ans:3*/

/*
4 3
0 1 3
0 2 1
2 3 1
1 2
1 0
1 0
*/
