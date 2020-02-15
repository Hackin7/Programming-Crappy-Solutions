#include <bits/stdc++.h>
#include <fstream>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N,M; cin>>N>>M;
    int X[N+1];memset(X,0,sizeof(X));
    for(int i=0;i<M;i++){
        int A,B,C;cin>>A>>B>>C;
        if (X[A]<C){X[A]=C;}
        if (X[B]<C){X[B]=C;}
    }
    for(int i=1;i<=N;i++){
        if(i!=1){cout<<" ";}
        cout<<X[i];
    }
    return 0;
}
