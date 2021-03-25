#include <bits/stdc++.h>
using namespace std;
//About 15 min to code
int main(){
    int n;cin>>n; //Number of planets
    int nw;cin>>nw; //Number of wormholes
    
    vector<int> holes[n];
    for (int i=0;i<nw;i++){
        int x,y; cin>>x>>y;
        holes[y].push_back(x);
    }
    
    ////Bottom Up solution////////////////
    int memo[n];memo[0]=0; //Planet 0 to 0 takes no time
    for (int i=1;i<n;i++){
        int timeTaken = memo[i-1]+1;
        for (int prev:holes[i]){
            timeTaken = min(timeTaken,memo[prev]+1);
        }
        memo[i] = timeTaken;
    }
    cout<<memo[n-1];
    return 0;
}
