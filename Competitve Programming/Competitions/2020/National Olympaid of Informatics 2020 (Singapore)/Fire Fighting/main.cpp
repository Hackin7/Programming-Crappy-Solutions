#include <bits/stdc++.h>
#include <fstream>
using namespace std;

typedef pair<int,int> ipair;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
    int ,K;cin>>N>>K;
    vector<ipair> g[N];
    for(int i=0;i<N;i++){
        int A,B,D; cin>>A>>B>>D;
        g[A].push_back(make_pair(B,D));
        g[B].push_back(make_pair(A,D));
    }
    
    
    return 0;
}
