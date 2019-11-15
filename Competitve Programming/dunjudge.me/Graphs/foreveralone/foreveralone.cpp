#include <bits/stdc++.h>
using namespace std;

//89%
int main(){
    //Input
    unsigned int n=0, e=0; cin>>n>>e;
    unsigned int adjM[n];for (unsigned int i=0; i<n; i++)adjM[i] = 0;
    
    unsigned int ans = n;
    for (unsigned int i=0;i<e;i++){
        int u=0,v=0; cin>>u>>v;
        //Cost setting
        if (u != v){
            adjM[u]++;adjM[v]++;
            if (adjM[u] == 1){ans--;}
            if (adjM[v] == 1){ans--;}
        }
    }
    
    cout<<ans;
}
