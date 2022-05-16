#include <bits/stdc++.h>
using namespace std;

const int V = 1000000;
int visited[V];
/*
5
4 4 8 9 12
*/

void dfs(int N, int* A, int carryover){
    // Find Primes
    //cout<<"### Carryover "<<carryover<<" ########\n";
    for (int i=0; i<N;i++){
        if (carryover == A[i] && visited[A[i]] > 0){
            cout<<A[i]<<endl;
            visited[A[i]]--;
        }
    }
    
    // Traverse into other factors
    for (int i=0; i<N;i++){
        for (int factor=2; factor<sqrt(A[i])+1; factor++){
            if (A[i] % (carryover*factor) == 0){
                dfs(N,A,carryover * factor);
            }
        }
    }
}

int main(){
    memset(visited,0,V);
    
    int N; cin>>N;
    int A[N]; for(int i=0;i<N;i++){
        cin>>A[i];
        visited[A[i]]++;
    }
    dfs(N,A,1);
}
