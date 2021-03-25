#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;
# define mp(a,b) make_pair(a,b)
int main(){
    int N,M; cin>>N>>M;
    vector<ipair> g[N];
    for(int i=0;i<M;i++){
        int A,B,C; cin>>A>>B>>C;
        g[A].push_back(mp(B,C));
    }
    return 0;
}
