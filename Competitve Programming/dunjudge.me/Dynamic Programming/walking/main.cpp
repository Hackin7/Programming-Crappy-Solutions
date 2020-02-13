#include <bits/stdc++.h>
using namespace std;

const int v=500;
int g[v][v];
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int l,n;cin>>l>>n;
    int t[n],v[n];for(int i=0;i<n;i++){cin>>t[i]>>v[i];}
    
    memset(g,0,sizeof(g));
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if (l/v[i]+t[i] > l/v[j]+t[j] && t[i]<t[j]){
                if (!g[i][j]){
                    g[i][j]=1;g[j][i]=1;
                }else{}
            }
        }
    }
    int ans=0;
    for(int i=0;i<n;i++){
        int local=0;
        for(int j=0;j<n;j++){
            local+=g[i][j];
        }
        ans = max(ans,local);
    }
    cout<<max(ans,1);
    return 0;
}

/*
1000 4
0 2
1 3
2 1
3 4
*/
