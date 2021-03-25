#include <bits/stdc++.h>
using namespace std;

typedef pair<int,int> ipair;

int main(){
    int K,n,m,A,B;cin>>K>>n>>m>>A>>B;
    int V[K];for(int i=0;i<K;i++){cin>>V[i];}
    int S[n];for(int i=0;i<n;i++){cin>>S[i];}
    int T[m];for(int i=0;i<m;i++){cin>>T[i];}
    
    // Subtask 1 (4%): K==1 (Only 1 event), m < n 
    if (K==1 && m < n){
        cout<<V[0]*m;
    }
}

/*
1 5 3 -5 -4
10
1 1 1 1 1
1 1 1

4 7 4 0 0
1 2 3 4
3 1 2 1 4 1 1
1 2 3 4
*/
