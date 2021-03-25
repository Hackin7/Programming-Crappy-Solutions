#include <bits/stdc++.h>
using namespace std;

int main(){
    int N,L,H; cin>>N>>L>>H;
    int C[N],W[N];for(int i=0;i<N;i++){cin>>C[i]>>W[i];}
    
    int L = 0; int R = 1000000000; // starting range [L, R]
    while ( L < R ) {
        int M = ( L + R ) / 2;
        if ( f ( M ) ) R = M ;
        else L = M + 1;
    }
    output ( L ) ;
    return 0;
}
