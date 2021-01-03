#include <bits/stdc++.h>
using namespace std;

#define NN 3000
int main(){
    int N, K; cin>>N>>K;
    int V[N]; for(int i=0;i<N;i++){cin>>V[i];}
    // Since it is a tree (Everything is connected), just collect everything
    cout << accumulate(V, V+N, 0);
}

/* Subtask 1 test
4 3
3 6 7 9
0 1 0
0 2 0
0 3 0
*/
