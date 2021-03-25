#include <bits/stdc++.h>
using namespace std;

//https://dunjudge.me/analysis/submissions/722546/
#define V 1000000
//UFDS
int parent[V];
int root(int x) {
    if (parent[x]==-1) return x;
    return parent[x] = root(parent[x]);
}
bool isConnected(int x, int y) {
    return root(x) == root(y);
}
void connect(int x, int y) {
    int rootX = root(x);
    int rootY = root(y);
    if(rootX != rootY)
        parent[rootX] = rootY;
}

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    memset(parent,-1,sizeof(parent));
    
    int N,M;cin>>N>>M;
    int A[M],B[M];for(int i=0;i<M;i++){cin>>A[i]>>B[i];}
    
    //cout<<endl;for(int i=0;i<M;i++){cout<<A[i]<<","<<B[i]<<endl;}
    int ans[M];ans[M-1]=N*(N-1)/2;
    for(int m=M-1-1;m>=0;m--){
        ans[m]=ans[M-1];
        //cout<<endl<<m<<"---"<<A[m+1]<<"_"<<B[m+1]<<endl;
        connect(A[m+1],B[m+1]);
        //Check number of pairs
        for(int i=1;i<=N;i++){
            for(int j=i+1;j<=N;j++){
                //cout<<i<<","<<j<<":"<<isConnected(i,j)<<endl;
                ans[m]-=isConnected(i,j);
            }
        }
    }
    
    for(int i=0;i<M;i++){
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
